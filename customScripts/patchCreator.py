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


#Create folder and files for the patch (if its not already there)
foldername = "Patch"
if os.path.exists(foldername):
    shutil.rmtree(foldername)
    
os.makedirs(foldername)

# Counter
n = 1
lastFile = foldername+"/"+structuredPatchList[0][0]

# Print results
for statement in structuredPatchList: 

    file = open(foldername+"/"+statement[0], 'a')
    
    #Reset counter if filename changed
    if (not (lastFile == foldername+"/"+statement[0])):
        n = 1
        lastFile = foldername+"/"+statement[0]
    
    #Add empty lines until we reach the line of the current statement
    while (n < statement[1]):
        file.write("\n")
        n += 1
        
    #Write code to the file
    file.write(statement[3])
    print(statement) 
        
    file.close()

