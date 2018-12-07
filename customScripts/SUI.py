#!/usr/bin/env python3
import os
import pygraphviz as pgv

from octopus.server.DBInterface import DBInterface
from joern.shelltool.PlotConfiguration import PlotConfiguration
from joern.shelltool.PlotResult import NodeResult, EdgeResult

####### Configuration options #################
includeEnclosedCode = False



###############################################


# Connect to project DB
projectName = 'EvoDiss.tar.gz'
db = DBInterface()
db.connectToDatabase(projectName)

## Example entry points ##
# 315552 ExpressionStatement threeElmArray()
# 331936 CallExpression tenElmArray()
# 356576 Callee tenElmArray()
# 307360 FunctionDef mainTest()
# 4264 FunctionDef bubblesort()
# 225336 IfStatement in compareResults
# 241888 corresponding ElseStatement
# 213216 ForStatement in compareResults

## Work with sets, as they are way faster and allow only unique elements ##
# Ids of entry point vertices 
entryPointId = {'241888'}
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
        
################################ Structural relations ################################

        # Get enclosed vertices if current vertice is a function declaration
        if ((type[0] == "FunctionDef") and (includeEnclosedCode == True)):
            result = set(getEnclosedCode(currentNode)) 
            # Add current results (alle enclosed elements) to Semantic Unit 
            addToSemanticUnit(result)            
            # For every enclosed vertice, get related elements
            identifySemanticUnits(result)
            
        # Get enclosed vertices if current vertice is a for-, while- or if-statement
        if ((type[0] in ["IfStatement","ForStatement","WhileStatement"]) and (includeEnclosedCode == True)):            
            result = set(getChildren(currentNode))
            # Add current results (alle enclosed elements) to Semantic Unit 
            addToSemanticUnit(result)
            # For every enclosed vertice, get related elements
            identifySemanticUnits (result) 
            
        # Get the corresponding if-statement, if current vertice is an else-statement
        if (type[0] == "ElseStatement"):            
            result = set(getIfStatement(currentNode))
            # Get related elements of the if/else-statement
            identifySemanticUnits (result)
            
######################################################################################           
################################### Call relations ################################### 
           
        # Get called function if current vertice is a callee
        if (type[0] == "Callee"):            
            result = set(getCalledFunctionDef(currentNode))
            # Get related elements of the called function
            identifySemanticUnits (result)
            
######################################################################################
            
            
        # Do something for every type where it is necessary

        
        
    

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

# Return all AST children vertice ids of the given vertice
def getChildren (verticeId):
    query = """g.V(%s).emit().repeat(out(AST_EDGE)).unfold().id()""" % (verticeId)
    return db.runGremlinQuery(query)
    
# Return the called function id
def getCalledFunctionDef (verticeId):
### We do it like that because there is no explicit link from callee to called function. ####
### Runs into problems if there is more than one function with the given name ###############

    # Get name of the called function
    query = """g.V(%s).out().has('type', 'Identifier').values('code')""" % (verticeId)
    result = db.runGremlinQuery(query)
         
    # Get the id of the called function (parent of identifier with code from result of last query)
    query = """g.V().has('type', 'Identifier').has('code', '%s')
        .in().has('type', 'FunctionDef').id()""" % (result[0])
    result = db.runGremlinQuery(query)  

    # Check if result is in DB (could also be a C function like puts())
    if (len(result) > 0):      
        return result
    else:
        return ""
        
# Return the corresponding if-statement
def getIfStatement (verticeId):
    query = """g.V(%s).in().has('type', 'IfStatement').id()""" % (verticeId)
    return db.runGremlinQuery(query)
   
# Adds the given vertice ids to the Semantic Unit    
def addToSemanticUnit (result): 
    for verticeId in result: 
        semanticUnit.add(verticeId)

# Output of the code of the Semantic Unit        
def codeOutput ():
    code = ['']
    for verticeId in semanticUnit: 
        query = """g.V(%s).values('code')""" % (verticeId)
        code.append(db.runGremlinQuery(query)) 
    
    for x in code: print(x)
    
# Output of the vertices of the Semantic Unit        
def nodeOutput ():
    code = ['']
    for verticeId in semanticUnit: 
        query = """g.V(%s)""" % (verticeId)
        code.append(db.runGremlinQuery(query)) 
    
    for x in code: print(x)
   

####################################### Plotting ###############################################    
 
# Plots the results    
def plotResults ():
    # Get plot configuration
    plot_configuration = PlotConfiguration()
    #Config is read from plotconfig.cfg in same folder as SUI.py
    f = open((os.path.join(os.path.dirname(__file__), 'plotconfig.cfg')) , "r")
    plot_configuration.parse(f)
    labels = ["IS_AST_PARENT"]  
    
    #Get nodes and edges of semanticUnit
    print("Get nodes")
    nodes = getNodes()    
    print("Get edges")
    edges = getEdges()

    #Make the graph
    print("Make graph")
    G = pgv.AGraph(directed=True, strict=False)
    print("_addNodes")
    addNodes(plot_configuration, G, nodes)
    print("_addEdges")
    if (len(edges) > 0):
        addEdges(plot_configuration, G, edges)
    #Output result
    output(G)  

# Returns all vertices of the SemanticUnit    
def getNodes():
    # Remove unneeded nodes. Within or without are not working...
    query = """idListToNodes(%s)
        .not(has('type', 'Symbol'))
        .not(has('type', 'CFGExitNode'))
        .not(has('type','CFGEntryNode'))""" % (list(semanticUnit))  
    return db.runGremlinQuery(query)
           
# Returns all AST edges of the Semantic Unit    
def getEdges():
    # Get all incoming edges that are part of the AST
    query = """idListToNodes(%s).inE('IS_AST_PARENT')""" % (list(semanticUnit))    
    return db.runGremlinQuery(query)
       

# Adds nodes to the graph G    
def addNodes(plot_configuration, G, nodes):
    for v in nodes:
        nr = NodeResult(v)

        label = createGraphElementLabel(plot_configuration.getElementDisplayItems(nr))
        plot_properties = plot_configuration.getElementLayout(nr)
        if label:
            plot_properties['label'] = label
        G.add_node(nr.getId(), **plot_properties)
        
# Adds edges to the graph G 
def addEdges(plot_configuration, G, edges):
    for e in edges:
        er = EdgeResult(e)
        label = createGraphElementLabel(plot_configuration.getElementDisplayItems(er))
        plot_properties = plot_configuration.getElementLayout(er)
        plot_properties['label'] = label
        G.add_edge(er.getSrc(), er.getDest(), er.getId(), **plot_properties)

# Creates the labels for the graph        
def createGraphElementLabel(labeldata):
    return "\n".join([":".join([str(escape(e)) for e in d]) for d in labeldata])
    
# Formatting
def escape(label):
    return str(label).replace("\\", "\\\\")

# Writes output as .dot and .png in a folder named SemanticUnit                    
def output(G):
    #Formatting
    outputString = '// SemanticUnit \n'
    outputString += str(G) + '\n'
    outputString += '//###' + '\n'

    #Create folder with name of project (if its not already there)
    if not os.path.exists("SemanticUnit"):
        os.makedirs("SemanticUnit")
    #Filename contains the project name, the current function name and the graph type
    filename = 'SemanticUnit.dot'
    
    #Write to file
    print("Creating "+filename+" ...")
    file = open("SemanticUnit/SemanticUnit.dot", 'w')
    file.write(outputString)
    file.close()
    
    # Use terminal output to convert .dot to .png
    os.system("dot -Tpng 'SemanticUnit/SemanticUnit.dot' -o 'SemanticUnit/SemanticUnit.png'")
    #Print status update
    print("Creation of plot was successfull!")
    
####################################### Plotting ###############################################   
 
# Start identification process
identifySemanticUnits(entryPointId)    

# Plot resulting graph
plotResults()
    
# Output resulting Ids on console
#for x in semanticUnit: print(x)

# Print code results
#codeOutput()

# Print node results
#nodeOutput()