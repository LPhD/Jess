#!/usr/bin/env python3
from octopus.server.DBInterface import DBInterface

# Connect to project DB
projectName = 'EvoDiss.tar.gz'
db = DBInterface()
db.connectToDatabase(projectName)

# Id of entry point vertice (currently its from mainTest)
# 315552 ExpressionStatement threeElmArray()
# 307360 FunctionDef mainTest()
#
entryPointId = 307360

semanticUnit = [entryPointId]

# Main function. Decides based on the vertice type, what methods are called
def identifySemanticUnits (verticeId):
    # Get type of current vertice 
    query = """g.V(%s).values('type')""" % (verticeId)
    type = db.runGremlinQuery(query)
    result = "";
    
    # Get enclosed vertices if current vertice is a function declaration
    if (type[0] == "FunctionDef"):
        result = getEnclosedCode(entryPointId); 
        # For every enclosed vertice, get related Elements?
    
    # Do something for every type
    # Fill initial Semantic Unit 
    addToSemanticUnit(result);

# Return all vertices that belong to the same parent function
def getEnclosedCode (verticeId):
    # Get (parent) functionId of vertice with verticeId
    query = """g.V(%s).values('functionId')""" % (verticeId)
    result = db.runGremlinQuery(query)
    
    # If there is a parent function
    if (result):
        # Get all enclosed vertices
        query = """g.V().has('functionId', '%s').id()""" % (result[0])
        result = db.runGremlinQuery(query)
    else:
        # Result is empty if there is no parent
        result = ""
           
    return result

# Adds the given vertice id to the Semantic Unit    
def addToSemanticUnit (result): 
    for verticeId in result: 
        if verticeId not in semanticUnit:
            semanticUnit.append(verticeId)

identifySemanticUnits(entryPointId);    
    
# Output results on console
for x in semanticUnit: print(x)