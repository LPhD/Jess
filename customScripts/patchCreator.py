#!/usr/bin/env python3
import ntpath
import os
import shutil

from operator import itemgetter
from octopus.server.DBInterface import DBInterface

def initialize():
    # Get the ids from the SemanticUnit (first line is the projectName)
    idList = [line.rstrip('\n') for line in open('result.txt')]

    # Connect to project DB
    projectName = idList.pop(0)
    db = DBInterface()
    db.connectToDatabase(projectName)
    
    return [db, idList]

def importData(db, idList):
    # Get the code of the statements
    query = """idListToNodes(%s).valueMap('code', 'path', 'line', 'cLine')""" % (idList)
    # Execute equery
    result = db.runGremlinQuery(query)

    # List that contains the code, filename, and linenumber of each statement of the SemanticUnit
    structuredPatchList = []

    for r in result:  
        # Just add the statements to the results which contain all necessary information
        if (('path' in r) and ('line' in r) and ('cLine' in r) and ('code' in r)):
            # Get the filename (we need the path later)
            locationFile = ntpath.basename((r['path'])[0])
            
            # Get the linenumber
            locationLine = ((r['line'])[0])
            
            # Get the char number in the line
            locationCLine = ((r['cLine'])[0])
            
            # Append filename, linenumber, cline and code (if exists) to the list
            if len(r) > 3:
                structuredPatchList.append([locationFile, int(locationLine), int(locationCLine), (r['code'])[0]])

    
    # Sort the list content by file, by line and then by cLine
    structuredPatchList = sorted(structuredPatchList, key=itemgetter(0,1,2))
    
    return structuredPatchList


def writeOutput(structuredPatchList):  
    #Create folder and files for the patch (if its not already there)
    foldername = "Patch"
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
    for statement in structuredPatchList: 
        #print(statement)

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

def createPatch():
    input = initialize()
    output = importData(input[0], input[1])
    writeOutput(output)

#Run the script    
createPatch()    