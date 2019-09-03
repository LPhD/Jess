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
    nChar = 0
    lastFile = ""
    lastLine = 0
    lineContent = ""
    outputFileContent = []

    # Print results
    for statement in structuredPatchList: 
        print(statement)

        #Reset variables if line changed
        if (not lastLine == statement[1]):
            nChar = 0
#            lineContent = ""   
            lastLine = statement[1]
            lChanged = True           
        else:
            lChanged = False
            
            
        #Write last file and reset variables if filename changed
        if (not (lastFile == foldername+"/"+statement[0])):
            #Write content of the finished file
            if(len(outputFileContent) > 0):
                writeToFile(lastFile, outputFileContent)
                outputFileContent = ['']
                
            #Reset variables                  
            lastFile = foldername+"/"+statement[0]            
            nChar = 0
#            lineContent = "" 
            lChanged = True
            fChanged = True
        else:
            fChanged = False
        
        
        #Add empty lines until we reach the line of the current statement (index begins with 1)
        while (len(outputFileContent) < statement[1]-1):
            outputFileContent.append("")
                
        #Index for iterating throug the chars of the code statement
#        sIndex = 0
        #Iterate through every char of the line (number of spaces + number of chars in statement)
        while (nChar <= (statement[2] + (len(statement[3])-1))):
            
            #If we are not at the starting char of the statement
#            if (nChar < statement[2]):
                #Only write tabs if the current index is at an empty field (dont overwrite results for the same line)
#                if(nChar >= len(lineContent)):
                    #Add a space
#                    lineContent = lineContent + "\t"
            #If we reach the beginning of the statement    
#            else:
                #Add the statement character by character
#                lineContent = lineContent + statement[3][sIndex]
#                sIndex = sIndex + 1
                
            # Do not increment counter if the loop runs for the last time, just break
#            if (not (nChar == (statement[2] + (len(statement[3])-1)))):    
            nChar = nChar + 1
#            else:
#                break
                
        #Overwrite the current line if we are still at the same line as last iteration
#        if (lChanged):
#            fileContent.append(lineContent)
#        else:
#            fileContent[statement[1]-1] = lineContent
                       
        print(statement)  

    #Finally write the current file (last of the list)
    writeToFile(foldername+"/"+statement[0], outputFileContent)

#Write a string to a file
def writeToFile(fileName, fileContent):           
    file = open(fileName, 'w')   
    file.write("\n".join(fileContent))
    file.close() 

def createPatch():
    input = initialize()
    output = importData(input[0], input[1])
    writeOutput(output)

#Run the script    
createPatch()    