#!/usr/bin/env python3
from octopus.server.DBInterface import DBInterface

# Connect to project DB
projectName = 'EvoDiss.tar.gz'
db = DBInterface()
db.connectToDatabase(projectName)

## Example entry points ##
# 315552 ExpressionStatement threeElmArray()
# 331936 CallExpression tenElmArray()
# 356576 Callee tenElmArray()
# 307360 FunctionDef mainTest()

## Work with sets, as they are way faster and allow only unique elements ##
# Ids of entry point vertices 
entryPointId = {'356576'}
# Initialize empty Semantic Unit set
semanticUnit = set()
# Initialize empty set of checked vertices (because we only need to check the vertices once)
checkedVertices = set()

# Main function. Decides based on the vertice type, what methods are called
def identifySemanticUnits (currentEntryPoints):
    # Reset current result
    result = ""   
    # Remove vertices from currentEntryPoints, that are already checked
    currentEntryPoints = currentEntryPoints - checkedVertices
    
    # Check each entry point 
    for currentNode in currentEntryPoints:
        # Get type of current vertice 
        query = """g.V(%s).values('type')""" % (currentNode)
        type = db.runGremlinQuery(query)
        # Add current entry point to checked list
        checkedVertices.add(currentNode)
        # Add current entry point to Semantic Unit 
        semanticUnit.add(currentNode) 
    
        # Get enclosed vertices if current vertice is a function declaration
        if (type[0] == "FunctionDef"):
            result = set(getEnclosedCode(currentNode)) 
            # Add current results (alle enclosed elements) to Semantic Unit 
            addToSemanticUnit(result)            
            # For every enclosed vertice, get related elements
            identifySemanticUnits(result)
            
        # Get called function if current vertice is a callee
        if (type[0] == "Callee"):            
            result = set(getCalledFunctionDef(currentNode))
            # Get related elements of the called function
            identifySemanticUnits (result)
            
            
        # Do something for every type
        
        
    

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
   

# Adds the given vertice ids to the Semantic Unit    
def addToSemanticUnit (result): 
    for verticeId in result: 
        semanticUnit.add(verticeId)
        

identifySemanticUnits(entryPointId)    
    
# Output results on console
for x in semanticUnit: print(x)