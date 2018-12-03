#!/usr/bin/env python3
from octopus.server.DBInterface import DBInterface

# Connect to project DB
projectName = 'EvoDiss.tar.gz'
db = DBInterface()
db.connectToDatabase(projectName)

# Id of entry point vertice (currently its from mainTest)
# 315552 ExpressionStatement threeElmArray()
# 331936 CallExpression tenElmArray()
# 356576 Callee tenElmArray()
# 307360 FunctionDef mainTest()
#
entryPointId = ['356576']

semanticUnit = entryPointId

# Main function. Decides based on the vertice type, what methods are called
def identifySemanticUnits (currentEntryPoints):
    # Reset current result
    result = ""
    
    ########################### Something is wrong here, iterates endlessly ################################################
    for currentNode in currentEntryPoints:
        # Get type of current vertice 
        query = """g.V(%s).values('type')""" % (currentNode)
        type = db.runGremlinQuery(query)

    
        # Get enclosed vertices if current vertice is a function declaration
        if (type[0] == "FunctionDef"):
            result = getEnclosedCode(currentNode) 
            # For every enclosed vertice, get related Elements?
            
################################################################################ TO DO ########################            
        
        if (type[0] == "Callee"):
            # Get called function if current vertice is a callee
            result = getCalledFunctionDef(currentNode)
            # For every enclosed vertice, get related Elements?
            identifySemanticUnits (result)
################################################################################ TO DO ########################
            
        # Do something for every type
        
        
    # Add current results to Semantic Unit 
    addToSemanticUnit(result)

# Return all vertices that belong to the same parent function
def getEnclosedCode (verticeId):
    # Get (parent) functionId of vertice with verticeId
    query = """g.V(%s).values('functionId')""" % (verticeId)
    result = db.runGremlinQuery(query)
    
    # If there is a parent function
    if (len(result) > 0):
        # Get all enclosed vertices
        query = """g.V().has('functionId', '%s').id()""" % (result[0])
        result = db.runGremlinQuery(query)
    else:
        # Result is empty if there is no parent
        result = ""
           
    return result
    
# Return the called function id
def getCalledFunctionDef (verticeId):
    # Get name of the called function
    query = """g.V(%s).out().has('type', 'Identifier').values('code')""" % (verticeId)
    result = db.runGremlinQuery(query)
         
    # Get the id of the called function (parent of identifier with code from result of last query)
    query = """g.V().has('type', 'Identifier').has('code', '%s').in().has('type', 'FunctionDef').id()""" % (result[0])
    result = db.runGremlinQuery(query)  

    # Check if result is in DB
    if (len(result) > 0):      
        return result
    else:
        return ""
   

# Adds the given vertice id to the Semantic Unit    
def addToSemanticUnit (result): 
    for verticeId in result: 
        if verticeId not in semanticUnit:
            semanticUnit.append(verticeId)

identifySemanticUnits(entryPointId)    
    
# Output results on console
for x in semanticUnit: print(x)