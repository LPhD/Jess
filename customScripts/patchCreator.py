#!/usr/bin/env python3
import ntpath
import os
import shutil

from operator import itemgetter
from octopus.server.DBInterface import DBInterface

# Connect to project DB
#projectName = 'JoernTest.tar.gz'
#projectName = 'EvoDiss.tar.gz'
#projectName = 'Revamp'
projectName = 'SPLC'
db = DBInterface()
db.connectToDatabase(projectName)

# Get the ids from the SemanticUnit
idList = [line.rstrip('\n') for line in open('result.txt')]

# Get the code of the statements
query = """idListToNodes(%s).valueMap('code', 'path', 'line')""" % (idList)
# Execute equery
result = db.runGremlinQuery(query)

# List that contains the code, filename, and linenumber of each statement of the SemanticUnit
structuredPatchList = []

for r in result:  
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


# Print results
for x in structuredPatchList: 
    print(x) 
    file = open(foldername+"/"+x[0], 'a')
    file.write(x[2]+"\n")
    file.close()

