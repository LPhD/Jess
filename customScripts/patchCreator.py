#!/usr/bin/env python3
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


query = """idListToNodes(%s).values('code')""" % (idList)

# Execute equery
result = db.runGremlinQuery(query)

# Print results
for x in result: print(x)

