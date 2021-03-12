#!/usr/bin/env python3
import ntpath
import os
import shutil
import pathlib
import re

from operator import itemgetter
from octopus.server.DBInterface import DBInterface

# Activate for debug outputs
DEBUG = False
# Activate for generation of semantic code (enhances the normal code with semantic information)
SEMANTIC = False
# Set working directory
workingdir = ""
# Lists all types that we need for the block based analysis
typeList = ['FunctionDef', 'IfStatement', 'ElseStatement', 'SwitchStatement', 'ForStatement', 'DoStatement', 'WhileStatement', 'CompoundStatement']

def initialize():
    # Get the ids from the SemanticUnit (first line is the projectName)
    idList = [line.rstrip('\n') for line in open('result.txt')]

    # Connect to project DB
    projectName = idList.pop(0)
    db = DBInterface()
    db.connectToDatabase(projectName)
    
    if DEBUG: print("Connected to project: "+projectName)
    if DEBUG: print("IDs: "+str(idList))
    
    return [db, idList]


def importData(db, idList, SEMANTIC, topLevelProjectName):                     
    # List that contains the code, filename, and linenumber of each statement of the SemanticUnit
    structuredCodeList = []
    # List to slice the idList in manageable chunks
    chunkList = []
    # Defines the size of a chunk (max is near 20.000, otherwise we get class file too large exceptions)
    chunkSize = 16000
    i = 0
    
    #Slice idList in chunks of ids and add them to the chunkList
    while i in range(len(idList)):       
        chunkList.append(idList[i:i+chunkSize])
        i = i + chunkSize
    
    # For each chunk
    for chunk in chunkList:
        # Get the code of the statements for the chunk
        query = """idListToNodes(%s).valueMap('code', 'path', 'line', 'cLine', 'type')""" % (chunk)
        # Execute equery
        result = db.runGremlinQuery(query)

        for r in result:  
            # Just add the statements to the results which contain all necessary information
            if (('path' in r) and ('line' in r) and ('cLine' in r) and ('code' in r) and ('type' in r)):   
            
                # Append internal path(0) (structure inside project), linenumber (1), cline(2), code(3) (if exists) and type(4) to the list
                if len(r) > 4:                      
                    # Get the internal structure by removing the path to the topLevelProjectFolder (the path used in jess-import)
                    internalPath = r['path'][0].replace(topLevelProjectName, "")
                    # Assemble the list
                    structuredCodeList.append([internalPath, int(((r['line'])[0])), int(((r['cLine'])[0])), (r['code'])[0], (r['type'])[0]])                
         
        # # # Semantic Diff # # #
        if SEMANTIC:    
            enhanceWithSemanticForFunctionBlocks(db,structuredCodeList, chunk, topLevelProjectName)
            enhanceWithSemanticForSwitchBlocks(db, structuredCodeList, chunk, topLevelProjectName)
        # # # Semantic Diff End # # #
    
    # Sort the list content by file, by line and then by cLine
    structuredCodeList = sorted(structuredCodeList, key=itemgetter(0,1,2))
       
    # # # Semantic Diff # # #
    if SEMANTIC:
        enhanceWithSemanticForIfDefBlocks(structuredCodeList)
    # # # Semantic Diff End # # #  
    
    # Finally close db connection and release the shell
    db.runGremlinQuery("quit")     
    
    return structuredCodeList
    
    
# Writes #SwitchBlockEnder# after the end of a switch block
def enhanceWithSemanticForSwitchBlocks(db, structuredCodeList, chunk, topLevelProjectName):
    # Get block enders for semantic diff
    query = """idListToNodes(%s)
        .has('type', 'SwitchStatement').out(AST_EDGE)
        .has('type', 'CompoundStatement').out(AST_EDGE)
        .has('type', 'BlockCloser')
        .valueMap('path', 'line', 'cLine')
    """ % (chunk) 
    # Execute equery
    result = db.runGremlinQuery(query)
    
    # Add results to the code list
    for r in result:
        if len(r) > 2:
            structuredCodeList.append([r['path'][0].replace(topLevelProjectName, ""), int((r['line'])[0]), int((r['cLine'])[0])+2, " ###SwitchBlockEnder### ", "SwitchBlockEnder"])
    #We do not need to return the list here, as it is a mutable object   
   

# Writes #FunctionBlockEnder# after the end of a function
def enhanceWithSemanticForFunctionBlocks(db, structuredCodeList, chunk, topLevelProjectName):
    # Get block enders (FunctionDef etc) for semantic diff
    query = """idListToNodes(%s)
        .has('type', 'FunctionDef').out(AST_EDGE)
        .has('type', 'CompoundStatement').out(AST_EDGE)
        .has('type', 'BlockCloser')
        .valueMap('path', 'line', 'cLine')
    """ % (chunk) 
    # Execute equery
    result = db.runGremlinQuery(query)
    
    # Add results to the code list
    for r in result:
        if len(r) > 2:
            structuredCodeList.append([r['path'][0].replace(topLevelProjectName, ""), int((r['line'])[0]), int((r['cLine'])[0])+2, " ###FunctionBlockEnder### ", "FunctionBlockEnder"])
    #We do not need to return the list here, as it is a mutable object   


# Add prefixes to all elements of an ifdef block (to make them more unique). This needs the ordered list (as we stay inside a file)
def enhanceWithSemanticForIfDefBlocks(structuredCodeList):
    # Collects the blockstarters     
    ifStack = []
    
    for line in structuredCodeList:    
        # Compare type
        if line[4] == "PreIfStatement":
            # Add code of the starting pre if to the stack (and replace any line breaks that could cause problems otherwise)
            ifStack.append(line[3].replace("\n",""))
            #Add prefix #*# PreIfBlock #*#
            line[3] = "#*#PreIfBlock #*# "+line[3]
            
        elif line[4] == "PreElIfStatement" and len(ifStack) > 0:    
            #Add #*# PreIfBlock if code #*# before the elif
            line[3] = "#*#PreIfBlock "+ifStack[-1]+" #*# "+line[3]
            
        elif line[4] == "PreElseStatement" and len(ifStack) > 0:      
            #Add #*# PreIfBlock if code #*# before the else
            line[3] = "#*#PreIfBlock "+ifStack[-1]+" #*# "+line[3]
            
        elif line[4] == "PreEndIfStatement" and len(ifStack) > 0:      
            #Add #*# PreIfBlock if code #*# before the endif end removes the blockstarter from the stack
            line[3] = "#*#PreIfBlock "+ifStack.pop()+" #*# "+line[3]
            
#ToDo check if we change file but have still items on the stack    


def writeOutput(structuredCodeList, SEMANTIC, foldername):  
    #Create folder and files for the Code (if its not already there)
    if os.path.exists(foldername):
        shutil.rmtree(foldername)   
    os.makedirs(foldername)

    # Counter
    currentChar = 0
    lastFile = ""
    lastLine = 0
    lineContent = ""
    outputFileContent = []
    # We need this for multiline nodes to get the correct length
    additionalLines = 0
    additionalLinesPerFile = 0
    # For semantic diff utility
    inBlock = False
    lastIf = False

    # For each entry in the patch list, build the file content
    # filename (0), linenumber (1), cline(2), code(3) (if exists), type(4) and internal path(5) (structure inside project) 
    for statement in structuredCodeList:     
        if DEBUG: print("Result statement: "+str(statement))
        
        # Check if the current statement is inside a folder structure
        if ("/" in statement[0]):
            #Make the folder structure inside of foldername folder (rpartition searches for the last occurence of "/")
            pathlib.Path(foldername+"/"+statement[0].rpartition("/")[0]).mkdir(parents=True, exist_ok=True) 
        
        #Remove missleading newlines at the end of some statements like preDefines
        if statement[3].endswith("\n"):
            #Remove the last char (the newline) from the code string
            statement[3] = statement[3][:-1]

        #Reset variables if line changed
        if (not (lastLine + additionalLines) == statement[1]):
            if(len(lineContent) > 0):
                #Solve the switched brackets problem for empty function content
                if re.search('\)..}{', lineContent):
                    lineContent = lineContent.replace("}{", "{}")

                #Write finished line to output (done after we switch lines)
                outputFileContent.append(lineContent)
                
            #Reset temp variables
            currentChar = 0
            lineContent = ""   
            lastLine = statement[1]            
            lChanged = True  
            additionalLines = 0  
            #print("Line changed")
        else:
            lChanged = False
            #print("Line not changed")            
            
        #Write last file and reset variables if filename changed
        if (not (lastFile == foldername+"/"+statement[0])):
            #Write content of the finished file
            if(len(outputFileContent) > 0):
                writeToFile(lastFile, outputFileContent)
                outputFileContent = []
                
            #Reset temp variables                 
            lastFile = foldername+"/"+statement[0]            
            currentChar = 0
            lineContent = "" 
            additionalLinesPerFile = 0
            additionalLines = 0
            inBlock = False
            lastIf = False
            lChanged = True
            fChanged = True
        else:
            fChanged = False
        
        
        #Add empty lines until we reach the line of the current statement (index begins with 1)
        #The additionalLinesPerFile are needed if we add multiline nodes (as one string is counted as one line althoug it contains linebreaks)
        #We add only new lines if we are finished with the current line
        while (lChanged and ((len(outputFileContent) + additionalLinesPerFile ) < (statement[1]-1))):
            outputFileContent.append("")

        #If we are not at the starting char of the statement
        if (currentChar < statement[2]):
            #Add a space
            lineContent = lineContent + "\t"
            currentChar = statement[2]
        
        #Count line breaks in a node as additional lines (to add them to the file length and check whether we really changed the line)  
        additionalLines = additionalLines + statement[3].count("\n")
        additionalLinesPerFile = additionalLinesPerFile + statement[3].count("\n")

        #Finally add the statement to the line
        lineContent = lineContent + statement[3]
        
        # # # Semantic Diff # # #
        if SEMANTIC:
        
            #If the previous statement was an if, but the current is not blockstarter (to handle ifs without curly brackets)
            if (lastIf):
                # Reset switch
                lastIf = False

                # Exclude all blockstarters, as they are either curly brackets or unique enough (and need a special handling either way)
                if not (statement[4] in typeList):
                    #Remove existing if we have multiple statements in one line
                    lineContent = re.sub("###.*?###", '', lineContent) 
                    # Build the line content with the name of the current block and the parent if. Also add the block info after each linebreak (at the beginning of each new line).
                    lineContent = "###Block " +str(blockStarterStack)+str(currentBlockName)+ "### "+lineContent  
                    #print("New line content: "+lineContent)
                    # Go on with the next statement
                    continue
            
            # Add type before line for declaration blocks (multiple connected lines) (with identifier ?) for semantic diff
            if (statement[4] in typeList):
                if DEBUG: print("Found block starter: "+statement[3])
                # As we found a blockStarter, we are currently inBlock             
                inBlock = True
            
                # Build the block name comulatively, so that it contains the names of all surrounding blocks    
                if (statement[4] == 'FunctionDef'):
                    # Slightly different handling for multiline definitions
                    if("\n" in statement[3]):
                        #Remove newline from blockname
                        #Use only the function name for function blocks (search for first occurence of "(" )
                        currentBlockName = statement[3].replace("\n","").partition("(")[0] 
                    else:    
                        #Use only the function name for function blocks
                        currentBlockName = statement[3].partition("(")[0] 
                        
                    # Set the lineContent directly. Also add the block info before each linebreak    
                    lineContent = "###Block " +str(currentBlockName)+ "### " + lineContent.replace("\n","\n ###Block " +str(currentBlockName)+ "### ")                                                                      
                    # Clear blockname (as a FunctionDef always starts a new block and currently there are no blocks outside of functions)
                    blockStarterStack = [] 
                    # Also clear label
                    currentLabel = ""
                    # Go on with the next statement
                    continue
                                           

                # Collect the block starter names individually, but only if they really start a block (indicated through the opening bracket)
                elif (statement[4] == 'CompoundStatement'):    
                    if DEBUG: print("Collected blockstarter: "+currentBlockName)                    
                    blockStarterStack.append(currentBlockName)
                    # First remove already existing enhancement (e.g. when there are multiline statements in one line). We use only the last information, to prevent duplicates
                    lineContent = re.sub("###.*?###", '', lineContent) 
                    # Build the line content with the name of the current block (and label if existing). Also add the block info after each linebreak (at the beginning of each new line). We do this here as { can appear solo in a line (and are therefore not unique)
                    lineContent = "###Block " +str(blockStarterStack)+str(currentLabel)+ "### " + lineContent.replace("\n","\n ###Block " +str(blockStarterStack)+str(currentLabel)+ "### ")
                    # Go on with the next statement
                    continue
                    
                #Use the whole blockstarter for other blocks (and replace any line breaks that could cause problems otherwise) 
                else:                           
                    currentBlockName = statement[3].replace("\n","")
                    
                    #This is for ifStatements without a Compound
                    if (statement[4] == 'IfStatement'):
                        lastIf = True
                                                        
                                                                   
            #Look for closing brackets of blocks (this does not include the special types of FunctionBlockEnder and SwitchBlockEnder)
            elif inBlock and (statement[3] == "}"):     
                if DEBUG: print("Found blockEnder of non-function block: "+statement[3])   
                # First remove already existing enhancement (e.g. when there are multiline statements in one line). We use only the last information, to prevent duplicates
                lineContent = re.sub("###.*?###", '', lineContent) 
                
                # Build the line content with the name of the current block (and label if existing) before removing it. Also add the block info after each linebreak (at the beginning of each new line).
                lineContent = "###Block " +str(blockStarterStack)+str(currentLabel)+ "### " + lineContent.replace("\n","\n ###Block " +str(blockStarterStack)+str(currentLabel)+ "### ")  

                if(len(blockStarterStack) > 0):        
                    #Remove the closed blockstarter from the stack
                    lastBlockstarter = blockStarterStack.pop()   
                else:
                    print("Stack is emtpy: "+lineContent+" line: "+str(statement[1])+" at path: "+statement[0])
                    
                # Go on with the next statement
                continue
                
            # For handling different cases of switch statements (not goto labels)
            elif ((statement[4] == "Label") and (statement[3].startswith("case") or statement[3].startswith("default") )):  
                if DEBUG: print("Found label: "+statement[3])
                currentLabel = statement[3] 
            
            # For resetting the label when we leave a switch block
            elif (statement[4] == "SwitchBlockEnder"):
                if DEBUG: print("Found SwitchBlockEnder: "+statement[3]) 
                # Do not set the lineContent or remove a blockstarter from stack, as SwitchBlockEnder is an additional entry in the structuredCodeList
                # The lineContent and the removal from stack happen at the closing bracket rule (2 rules before this one)  
                
                # Reset label
                currentLabel = ""  
                # Go on with the next statement
                continue                
                
            # Here we finally handly FunctionBlockEnders and reset the inBlock trigger
            elif (statement[4] == "FunctionBlockEnder"):
                if DEBUG: print("Found block ender line: "+str(statement[1]))             
                # Do not set the lineContent or remove a blockstarter from stack, as FunctionBlockEnder is an additional entry in the structuredCodeList
                # The lineContent and the removal from stack happen at the closing bracket rule (3 rules before this one) 
                
                inBlock = False
                # Go on with the next statement
                continue  
                    
        
            # Finally build the line content for all other relevant inBlock lines (no Compounds, FunctionDefs, SwitchBlockEnders or normal blockEnders, as they need a slightly different handling)
            if inBlock:
                # First remove already existing enhancement (e.g. when there are multiline statements in one line). We use only the last information, to prevent duplicates
                lineContent = re.sub("###.*?###", '', lineContent) 
                # Then add prefix for statements that are inside a block. Also add the block info after each linebreak (at the beginning of each new line).
                lineContent = "###Block " +str(blockStarterStack)+str(currentLabel)+ "### " + lineContent.replace("\n","\n ###Block " +str(blockStarterStack)+str(currentLabel)+ "### ") 
                
            
            # For multiline statements outside of functions      
            if( (statement[4] in ['StructUnionEnum', 'FunctionPointerDeclare', 'DeclStmt']) and ("\n" in statement[3]) and not inBlock):
                 # First remove already existing enhancement (e.g. when there are multiline statements in one line). We use only the last information, to prevent duplicates
                lineContent = re.sub("###.*?###", '', lineContent) 
                
                # Build the unique identifier for the block
                if("{" in statement[3]):
                    # Only add everything before an opening curly bracket (as content of structs etc can change) and without newlines
                    blockIdentifier = lineContent.partition("{")[0].replace("\n","")
                else:
                    # Just remove newlines
                    blockIdentifier = lineContent.replace("\n","")
                
                # Add the block information at every line of the statement (add the identifier after each linebreak and at the beginning of the first line)
                lineContent = "###Block "+blockIdentifier+"### " + lineContent.replace("\n","\n ###Block "+blockIdentifier+"### ")  

                #print("Line content: "+lineContent)    
                    
                 
        # # # Semantic Diff End # # #
    
    
    #Solve the switched brackets problem for empty function content
    if re.search('\)..}{', lineContent):
        lineContent = lineContent.replace("}{", "{}")
    #Finally write the current line (last of the list)
    outputFileContent.append(lineContent)
    #Finally write the current file (last of the list)
    writeToFile(foldername+"/"+statement[0], outputFileContent)

#Write a string to a file
def writeToFile(fileName, fileContent):           
    file = open(fileName, 'w')   
    file.write("\n".join(fileContent))
    #End each file with a newline character
    file.write("\n")
    file.close() 

# Enhance output with semantics?, output relative to what dir?, output folder name? name of the project on disk (to get relative structure)?
def convertToCode(SEMANTIC, workingdir, foldername, topLevelProjectName):
    os.chdir(workingdir)
    input = initialize()    
    output = importData(input[0], input[1], SEMANTIC, topLevelProjectName)
    
    if(len(output)==0):
        print("Error: Output is empty")
    else:
        writeOutput(output, SEMANTIC, foldername)
        print("Code creation successfull")
   

# When called via console, comment this line in to run the script (needs a result.txt with node ids from an imported project and the Jess server running)
# Add semantic enhancement, location of result.txt, target output folder   
#convertToCode(True, os.getcwd()+"/Results", "ConvertedCode", "/home/lea/Downloads/Jess/customScripts/Results/DonorProjectCode")    