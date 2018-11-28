#!/usr/bin/env python3
from octopus.server.DBInterface import DBInterface

# This is a collection of various queries


#Define target project
projectName = 'EvoDiss.tar.gz'
#Connect do database of project
db = DBInterface()
db.connectToDatabase(projectName)

##### Normal Gremlin queries #####

#Shows code of all nodes of type function
query = "g.V().has('type', 'Function').values('code')"
#Shows code of all file nodes
query = "g.V().has('type', 'File').values('code')"
#Shows code of vertice 4256
query = "g.V(4256).values('code')"   


##### Groovy Gremlin queries (with closures and custom steps) #####

#Shows properties of function with name bubblesort (using groovy)
query = """getFunctionsByName("bubblesort")"""
# Get code of all nodes that call the function "bubblesort"
query = """getCallsTo("bubblesort").values('code')"""
# Get AST parent node of vertice 147584
query = """g.V(147584).parents().values('code')"""
# Get IDs of all argument verteces
query = """g.V().has('type', 'Argument').id()""" 
# Get vertice with id 147512
query = """g.V(147512)""" 
# Get all code vertices of a function
query = """g.V().has('functionId', '341').values('code')""" 
# Get all code vertices of type argument of a function
query = """g.V().has('functionId', '341').has('type', 'Argument').values('code')""" 
# Get code of all vertices that are part of function 341 and have incoming DEF edges
query = """g.V().has('functionId', '341').out(DEFINES_EDGE).values('code')""" 
 # Get code of all vertices that were defined by an argument (outgoing DEF edge of an argument node)
query = """g.V().has('type', 'Argument').out(DEFINES_EDGE).values('code')""" 


#Convert list of ids to nodes (query prints code of all ids in nodeIDs)
#Callee 'mainTest', Argument 0 in Array, Function SelectionSort
nodeIds = [172032, 143480, 49152]

#String conversion with %: Takes nodeIds, id and 5 and replaces %s, %s and %d
query = """log.error("stringArray(%s), string(%s), decimal (%d)")""" % (nodeIds, id, 5)

# Get code of all nodes defined by nodeIds    
query = """idListToNodes(%s).values('code')""" % (nodeIds)
# Lists properties of all nodes defined by nodeIds
query = """idListToNodes(%s).properties().toList()""" % (nodeIds)
# Lists code of all nodes that were reached by the nodes (target of outgoing edges) defined by nodeIds
query = """idListToNodes(%s).out().values('code').toList()""" % (nodeIds)
# sideEffect does not affect the query.
query = """idListToNodes(%s).sideEffect{}""" % (nodeIds)
# Get statements of all nodes defined by nodeIds. sideEffect does not affect the query. Same result as above?
query = """idListToNodes(%s).sideEffect{}.statements()""" % (nodeIds)


 
# Execute equery
result = db.runGremlinQuery(query)

# Print results
for x in result: print(x)




############################################################################################################
##### NOT WORKING OR PROBLEMS
############################################################################################################

# Empty, because you need the full qualified name
query = """getFunctionsByFilename("C.c")"""
# Empty, because Regex doesnt seem to work
query = """g.V().has('code', textRegex('*C.c*'))"""
# Another regex problem
query = """getCallsToRegex("bubblesor*").values('code')"""
# No signature of method: org.apache.tinkerpop.gremlin.process.traversal.traverser.O_Traverser.codeContains() is applicable for argument types: (java.lang.String) values: [bubblesort]
query = """g.V().sideEffect{it.codeContains("bubblesort");}"""
#Gremly-Groovy Syntax with it, doenst work as normal query?
query = """it.get().value('code');"""
