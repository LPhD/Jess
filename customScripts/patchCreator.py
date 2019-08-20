#!/usr/bin/env python3
import ntpath
import os
import shutil

from operator import itemgetter
from octopus.server.DBInterface import DBInterface

# Get the ids from the SemanticUnit (first line is the projectName)
idList = [line.rstrip('\n') for line in open('result.txt')]

# Connect to project DB
projectName = idList.pop(0)
db = DBInterface()
db.connectToDatabase(projectName)


# Get the code of the statements
query = """idListToNodes(%s).valueMap('code', 'path', 'line', 'type')""" % (idList)
# Execute equery
result = db.runGremlinQuery(query)

# List that contains the code, filename, and linenumber of each statement of the SemanticUnit
structuredPatchList = []

for r in result:  
    # Just add the statements to the results which contain all necessary information
    if (('path' in r) and ('line' in r) and ('code' in r)):
        # Get the filename (we need the path later)
        locationFile = ntpath.basename((r['path'])[0])
        
        # Get the linenumber
        locationLine = ((r['line'])[0])
        
        # Append filename, linenumber and code (if exists) to the list
        if len(r) > 2:
            structuredPatchList.append([locationFile, int(locationLine), (r['code'])[0]])

    
# Sort the list content by file and then by line
structuredPatchList = sorted(structuredPatchList, key=itemgetter(0,1))


#Create folder and files for the patch (if its not already there)
foldername = "Patch"
if os.path.exists(foldername):
    shutil.rmtree(foldername)
    
os.makedirs(foldername)

# Counter
n = 1
index = 0
lastFile = foldername+"/"+structuredPatchList[0][0]

# Print results
while index in range(len(structuredPatchList)): 

    file = open(foldername+"/"+structuredPatchList[index][0], 'a')
    
    #Reset counter if filename changed
    if (not (lastFile == foldername+"/"+structuredPatchList[index][0])):
        n = 1
        lastFile = foldername+"/"+structuredPatchList[index][0]
    
    #Add empty lines until we reach the line of the current statement
    while (n < structuredPatchList[index][1]):
        file.write("\n")
        n += 1
        
    #Check if opening bracket and code are in the right order (first code, then bracket)    
    if ((index < len(structuredPatchList) -1) 
        and (structuredPatchList[index][2] == "{") 
        and (structuredPatchList[index][1] == structuredPatchList[index+1][1])
        and (structuredPatchList[index][0] == structuredPatchList[index+1][0])):
        
        #Write the code first
        file.write(structuredPatchList[index+1][2])
        print(structuredPatchList[index+1]) 
        #Then the bracket
        file.write(structuredPatchList[index][2])
        print(structuredPatchList[index]) 
        #Then move index forward
        index = index + 2
    else:    
        file.write(structuredPatchList[index][2])
        print(structuredPatchList[index]) 
        index = index + 1
        
    file.close()

