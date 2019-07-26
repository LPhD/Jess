#!/usr/bin/env python3
import os
import pygraphviz as pgv

from octopus.server.DBInterface import DBInterface
from joern.shelltool.PlotConfiguration import PlotConfiguration
from joern.shelltool.PlotResult import NodeResult, EdgeResult

####### Configuration options #################
generateOnlyAST = True
###############################################


# Connect to project DB
projectName = 'EvoDiss.tar.gz'
#projectName = 'TestCommit'
#projectName = 'JoernTest.tar.gz'
#projectName = 'SPLC'
db = DBInterface()
db.connectToDatabase(projectName)


####################################### Plotting ###############################################    
 
# Plots the results    
def plotResults ():
    # Get plot configuration
    plot_configuration = PlotConfiguration()
    #Config is read from plotconfig.cfg in same folder as plotDB.py
    f = open((os.path.join(os.path.dirname(__file__), 'plotconfig.cfg')) , "r")
    plot_configuration.parse(f)
    
    #Get nodes and edges of DB (either as AST or full property graph)
    if (generateOnlyAST):
        print("Get AST nodes")
        nodes = getASTNodes()    
        print("Get AST edges")
        edges = getASTEdges()    
    else:
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

# Returns all AST vertices of the DB   
def getASTNodes():
    # Remove unneeded nodes
    query = "g.V().not(has('type', within('Symbol','CFGExitNode','CFGEntryNode')))"  
    return db.runGremlinQuery(query)

# Returns all vertices of the DB    
def getNodes():
    query = "g.V()"
    return db.runGremlinQuery(query)
           
# Returns all AST edges of the DB   
def getASTEdges():
    # Get all incoming edges that are part of the AST
    query = "g.V().inE('IS_AST_PARENT', 'IS_FILE_OF', 'IS_PARENT_DIR_OF', 'IS_FUNCTION_OF_AST', 'VARIABILITY', 'DECLARES', 'INCLUDES')"  
    return db.runGremlinQuery(query)
    
# Returns all edges of the DB    
def getEdges():
    # Get all incoming edges 
    query = "g.E()" 
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

# Writes output as .dot and .png in a folder named DB                   
def output(G):
    #Formatting
    outputString = '// DB \n'
    outputString += str(G) + '\n'
    outputString += '//###' + '\n'

    #Create DB folder (if its not already there)
    if not os.path.exists("DB"):
        os.makedirs("DB")   
    filename = 'Complete.dot'
    
    #Write to file
    print("Creating "+filename+" ...")
    file = open("DB/"+filename, 'w')
    file.write(outputString)
    file.close()
    
    # Use terminal output to convert .dot to .png
    os.system("dot -Tpng 'DB/"+filename+"' -o 'DB/Complete.png'")
    #Print status update
    print("Creation of plot was successfull!")
    
####################################### Plotting ###############################################   


# Plot resulting graph
plotResults()