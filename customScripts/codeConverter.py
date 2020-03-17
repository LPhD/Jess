#!/usr/bin/env python3
import ntpath
import os
import shutil
import pathlib

from operator import itemgetter
from octopus.server.DBInterface import DBInterface

# Activate for debug outputs
DEBUG = False
# Activate for generation of semantic code (enhances the normal code with semantic information)
SEMANTIC = False
# Set working directory
workingdir = ""
# Lists all types that we need for the block based analysis
typeList = ['FunctionDef']

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


def importData(db, idList, SEMANTIC):
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
                    # Get the internal structure by splitting after the last src
                    internalPath = r['path'][0].rsplit("/src/",1)[1]
                    # Assemble the list
                    structuredCodeList.append([internalPath, int(((r['line'])[0])), int(((r['cLine'])[0])), (r['code'])[0], (r['type'])[0]])                
         
        # # # Semantic Diff # # #
        if SEMANTIC:    
            enhanceWithSemantic(db,structuredCodeList, chunk)
        # # # Semantic Diff End # # #
    
    # Sort the list content by file, by line and then by cLine
    structuredCodeList = sorted(structuredCodeList, key=itemgetter(0,1,2))
    
    return structuredCodeList

# Writes #BlockEnder# after the end of a function
def enhanceWithSemantic(db, structuredCodeList, chunk):
    # Get block enders (FunctionDef etc) for semantic diff
    query = """idListToNodes(%s)
        .has('type', 'FunctionDef').out(AST_EDGE)
        .has('type', 'CompoundStatement').out(AST_EDGE)
        .has('type', 'BlockCloser')
        .valueMap('path', 'line')
    """ % (chunk) 
    # Execute equery
    result = db.runGremlinQuery(query)
    
    # Add results to the code liste
    for r in result:
        if len(r) > 1:
            structuredCodeList.append([r['path'][0].rsplit("/src/",1)[1], int(((r['line'])[0])), 0, " ###BlockEnder### ", "BlockEnder"])
    #We do not need to return the list here, as it is a mutable object        


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

    # For each entry in the patch list, build the file content
    # filename (0), linenumber (1), cline(2), code(3) (if exists), type(4) and internal path(5) (structure inside project) 
    for statement in structuredCodeList:     
        if DEBUG: print("Result statement: "+str(statement))
        
        # Check if the current statement is inside a folder structure
        if ("/" in statement[0]):
            #Make the folder structure inside of foldername folder
            pathlib.Path(foldername+"/"+statement[0].rpartition("/")[0]).mkdir(parents=True, exist_ok=True) 
        
        #Remove missleading newlines at the end of some statements like preDefines
        if statement[3].endswith("\n"):
            #Remove the last two chars (the newline) from the code string
            statement[3] = statement[3][:-2]

        #Reset variables if line changed
        if (not (lastLine + additionalLines) == statement[1]):
            if(len(lineContent) > 0):
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
        # Turn trigger off, as we leave the block
        if SEMANTIC and (statement[4] == "BlockEnder"):
            #Insert the block name to the statement
            lineContent = lineContent.replace("BlockEnder", "BlockEnder "+blockname)
            inBlock = False
            if DEBUG: print("Found block ender line: "+str(statement[1]))
            
        # Add prefix for statements that are inside a block
        if SEMANTIC and inBlock:
            lineContent = "###Block "+blockname+"### " + lineContent 
            if DEBUG: print("Found block: "+statement[3])
            
        # Experimental: Add type before line for declaration blocks (multiple connected lines) (with identifier ?) for semantic diff
        # TODO: Systematically add all possible types (array? struct? preDefine?)
        if (SEMANTIC and (statement[4] in typeList)):
            blockname = statement[3].rpartition("(")[0]            
            lineContent = "####" + statement[4] +" "+ blockname + "### " + lineContent  
            inBlock = True
            if DEBUG: print("Found block starter: "+statement[3])
               
        # # # Semantic Diff End # # #
    
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

# Enhance output with semantics?, output relative to what dir?, output folder name?
def convertToCode(SEMANTIC, workingdir, foldername):
    os.chdir(workingdir)
    input = initialize()    
    output = importData(input[0], input[1], SEMANTIC)
    if(len(output)==0):
        print("Error: Output is empty")
        exit()
    else:
        writeOutput(output, SEMANTIC, foldername)
        print("Code creation successfull")

# When called via console, comment this line in to run the script   
#convertToCode(SEMANTIC, os.getcwd(), "Code/src")    