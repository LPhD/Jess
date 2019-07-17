#!/usr/bin/env python3
from octopus.server.DBInterface import DBInterface

# This is a collection of various queries


#Define target project
projectName = 'SPLC'
#projectName = 'JoernTest.tar.gz'
#Connect do database of project
db = DBInterface()
db.connectToDatabase(projectName)

##### Normal Gremlin queries #####

# Get vertice with id 147512
query = "g.V(147512)" 
#Shows code of vertice 4256
query = "g.V(4256).values('code')"  
#Shows code of all nodes of type function
query = "g.V().has('type', 'Function').values('code')"
#Shows code of all file nodes
query = "g.V().has('type', 'File').values('code')"
# Get IDs of all argument verteces
query = "g.V().has('type', 'Argument').id()" 
# Get all code vertices of a function
query = "g.V().has('functionId', '341').values('code')""" 
# Get all code vertices of type argument of a function
query = "g.V().has('functionId', '341').has('type', 'Argument').values('code')" 


##### Titan DB specific queries #####

# Get vertices that contain the word bubble (wildcards not working)
query = "g.V().has('code', textContains('bubble')).values('code')"
# Get vertices that contain a word starting with bubble 
query = "g.V().has('code', textContainsPrefix('bubble')).values('code')"
 

##### Groovy Gremlin queries (with closures and custom steps) #####

#Shows properties of function with name bubblesort (using groovy)
query = """getFunctionsByName("bubblesort")"""
# Get code of all nodes that call the function "bubblesort"
query = """getCallsTo("bubblesort").values('code')"""
# Get AST parent node of vertice 147584
query = """g.V(147584).parents().values('code')"""
# Get code of all vertices that are part of function 341 and have incoming DEF edges
query = """g.V().has('functionId', '341').out(DEFINES_EDGE).values('code')""" 
 # Get code of all vertices that were defined by an argument (outgoing DEF edge of an argument node)
query = """g.V().has('type', 'Argument').out(DEFINES_EDGE).values('code')""" 
# Get follow all outgoing edges and include every visited vertice in the results
query = """g.V(8192).emit().repeat(out().id())"""
# Get follow all outgoing edges of type AST, VARIABILITY, etc and include every visited vertice in the results
query = """g.V(8192).emit().repeat(out('AST_EDGE','VARIABILITY','IS_FILE_OF','IS_FUNCTION_OF_AST')).id()"""
# Follow all incoming and outgoing edges of type USE and DEF 
query = """g.V(8296).both('USE','DEF')"""  
# Follow all incoming and outgoing edges of type USE and DEF (2 times), and remove cyclic paths
query = """g.V(8296).both('USE','DEF').both('USE','DEF').simplePath().id()"""  
# Follow all outgoing edges until an Expression is reached, and include every visited vertice (including the starting vertice) in the results (while loop; repeat().until() is do while)
query = """g.V(8192).emit().until(has('type', 'Expression').repeat(out().id())"""
# Follow all incoming edges of type AST, FILE, FUNCTION until a file node is reached (navigate to the parent file node of a statement)
query = """g.V(77840).until(has('type', 'File')).repeat(inE('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST').outV())""" 
# Go to the parent file 
query = """g.V(%s).until(has('type', 'File')).repeat(inE('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST').outV()).id()""" % (77840)
# Go to the parent file and then look in all children for nodes with the given code
query = """g.V(%s).until(has('type', 'File')).repeat(inE('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST').outV()).repeat(outE('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST').inV()).emit().has('code', '%s').id()""" % (77840, "doSomethingImportant")

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
# Maps code and location values for each node (returns a list() of dict() data structure)
query = """idListToNodes(%s).valueMap('code', 'path')""" % (nodeIds)




query = "g.V(77840)"



 
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
# textContains does not work, getCallsTo works, but only with exact name
query = """getCallsTo(textContains("out")).values('code')"""
# textContainsRegex also does not work
query = """getCallsTo(textContainsRegex("out*")).values('code')"""
# This works, but regex syntax is unclear
query = """g.V().has('code', textContainsRegex('bubblesor+')).values('code')"""
# No signature of method: org.apache.tinkerpop.gremlin.process.traversal.traverser.O_Traverser.codeContains() is applicable for argument types: (java.lang.String) values: [bubblesort]
query = """g.V().sideEffect{it.codeContains("bubblesort");}"""
#Gremly-Groovy Syntax with it, doenst work as normal query?
query = """it.get().value('code');"""
