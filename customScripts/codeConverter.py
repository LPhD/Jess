#!/usr/bin/env python3
import ntpath
import os
import shutil

from operator import itemgetter
from octopus.server.DBInterface import DBInterface

# Activate for debug outputs
DEBUG = True
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


def importData(db, idList):
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
                # Append filename, linenumber, cline, code (if exists) and type to the list
                if len(r) > 4:
                    structuredCodeList.append([ntpath.basename((r['path'])[0]), int(((r['line'])[0])), int(((r['cLine'])[0])), (r['code'])[0], (r['type'])[0]])                
         
         
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
            print(r)
            if len(r) > 1:
                structuredCodeList.append([ntpath.basename((r['path'])[0]), int(((r['line'])[0])), 0, " #blockEnder# ", "blockEnder"])
    
    
    # Sort the list content by file, by line and then by cLine
    structuredCodeList = sorted(structuredCodeList, key=itemgetter(0,1,2))
    
    return structuredCodeList


def writeOutput(structuredCodeList):  
    #Create folder and files for the Code (if its not already there)
    foldername = "Code"
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

    # Print results
    for statement in structuredCodeList: 
        if DEBUG: print("Result statement: "+str(statement))

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
        
        # Experimental: Add type before line for declaration blocks (multiple connected lines) (with identifier ?) for semantic diff
        # TODO: Systematically add all possible types (array? struct? preDefine?)
        if (statement[4] in typeList):
            lineContent = "#" + statement[4] + "# " + lineContent  
                
    
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

def convertToCode():
    input = initialize()    
    output = importData(input[0], input[1])
    if(len(output)==0):
        print("Error: Output is empty")
    else:
        writeOutput(output)
        print("Code creation successfull")

# When called via console, comment this line in to run the script   
#convertToCode()    