#!/usr/bin/env python3
import ntpath
import os
import shutil

from operator import itemgetter
from octopus.server.DBInterface import DBInterface

# Connect to project DB
projectName = 'JoernTest.tar.gz'
#projectName = 'EvoDiss.tar.gz'
#projectName = 'Revamp'
#projectName = 'SPLC'
db = DBInterface()
db.connectToDatabase(projectName)

# Get the ids from the SemanticUnit
idList = [line.rstrip('\n') for line in open('result.txt')]

# Get the code of the statements
query = """idListToNodes(%s).values('code')""" % (idList)
# Execute equery
resultCode = db.runGremlinQuery(query)

# Get the location of the statements
query = """idListToNodes(%s).values('location')""" % (idList)
# Execute equery
resultLocation = db.runGremlinQuery(query)

# List that contains the filename, linenumber and code of each statement of the SemanticUnit
structuredPatchList = []

for code, location in zip(resultCode,resultLocation):
    # Get the filename (we need the path later)
    locationFile = ntpath.basename(location)
    locationFile = locationFile.split(' ,', 1)[0]
    # Get the linenumber
    locationLine = location.split(', Startline: ', 1)[1]
    # Append filename, linenumber and code to the list
    structuredPatchList.append([locationFile, int(locationLine), code])
    

# Sort the list content by file and then by line
structuredPatchList = sorted(structuredPatchList, key=itemgetter(0,1))


# Print results
for x in structuredPatchList: 
    print(x)
    #Create folder for the patch (if its not already there)
    foldername = "Patch"
    if os.path.exists(foldername):
        shutil.rmtree('foldername')
    
    os.makedirs(foldername)
    file = open(foldername+"/"+x[0]+"{}\n", 'a')
    file.write(x[2])
    file.close()

