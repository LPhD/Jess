#!/usr/bin/env python3
from octopus.server.DBInterface import DBInterface
import random

# This is a collection of various queries


#Define target project
#projectName = 'SPLC'
#projectName = 'Linux3'
#projectName = 'EvoDiss.tar.gz'
#projectName = 'JoernTest.tar.gz'
#projectName = 'Linux.tar.gz'
#projectName = 'Collection'
#projectName = 'expat'
#projectName = 'sample'
#projectName = 'PV_Current.tar.gz'
projectName = 'DonorProject'
#projectName = 'Test6'
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
# Get all edges with the label "IS_HEADER_OF" and emit the code of the connected vertices
query = "g.E().hasLabel('IS_HEADER_OF').bothV().values('code')"


##### Titan DB specific queries #####

# Get vertices that contain the word bubble (wildcards not working)
query = "g.V().has('code', textContains('bubble')).values('code')"
# Get vertices that contain a word starting with bubble 
query = "g.V().has('code', textContainsPrefix('bubble')).values('code')"
# Get vertices that match a certain Regex (here: code of include statements that include header files)
query = "g.V().has('code', textRegex('[\"][a-zA-Z]+[.][h][\"]')).values('code', 'type')"
# Get vertices that match a certain Regex (here: code of PreIncludeLocalFile statements that include header files). Only gives the first 10 results.
query = "g.V().has('type', 'PreIncludeLocalFile').has('code', textRegex('[\"][a-zA-Z]+[.][h][\"]')).limit(10).values('code')"
 

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
# First, get all nodes that are CFGNodes, have files as parent or are a PreElif/Else/Endif/FunctionDef statement. Then get on one branch path, code and type and on the other branch the id of these nodes. Output is the combination of those two branches.
query = """g.V().or(
                __.has('isCFGNode'),
                __.in().has('type', 'File'),
                __.has('type', within('PreElIfStatement','PreElseStatement','PreEndIfStatement','FunctionDef'))
                ).union(values('path', 'code', 'type').fold(), id())"""  
# Find all #if/#elfif nodes that contain the name of the feature and all nodes that belong to the variability blocks
query = """g.V().has('type', within('PreIfStatement','PreElIfStatement')).has('code', textContains('%s')).union(
id(), out('VARIABILITY').id())""" % ("analogueSender")                



# Go to the parent file 
query = """g.V(%s).until(has('type', 'File')).repeat(inE('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST').outV()).id()""" % (77840)
# Go to the parent file and then look in all children for nodes with the given code
query = """g.V(%s).until(has('type', 'File')).repeat(inE('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST').outV()).repeat(outE('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST').inV()).emit().has('code', textContains('%s')).id()""" % (77840, "doSomethingImportant")
# Go to the parent file, follow all include edges, then look in all children (not limited to callees) of the including files for nodes with the given code
query = """g.V(%s).until(has('type', 'File')).repeat(inE('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST').outV()).in("INCLUDES").until(has('type', 'File')).repeat(inE('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST').outV()).repeat(outE('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST').inV()).emit().has('code', textContains('%s')).id()""" % (40960, "doSomethingImportant")
# Go to the parent file and then output all incoming and outgoing edges
query = """g.V(%s).until(has('type', 'File')).repeat(inE('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST').outV()).bothE()""" % (40960)
# Go to the parent file and split up: if there are INCLUDES edges, follow them and emit the outgoing vertice; else emit the id of the current file node
query = """g.V(%s).until(has('type', 'File')).repeat(inE('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST').outV()).bothE().choose(hasLabel('INCLUDES'), outV(), inV().has('type', 'File').id())""" % (40960)
# Prints the node id on the server side (Java output)
query = """g.V(%s).sideEffect{println "first: ${it}"}""" % (40960)
# Adds results to the same label and emits the results (id of every node that was added to result) without duplicates and with one result per line
query = """g.V(%s).outV().in('IS_AST_PARENT').as("result").has('code', textContains('%s')).as("result").select("result").unfold().dedup().id()
        """ % (40960, "doSomethingImportant")  
# Go to the parent file: 
# if there is an include edge: follow all include edges, then look inside all children of the including files for nodes with the given code (get all nodes in other files that include the macro definition)
# if this result is not empty: also add the include statements to the result (solely the ones where the macro is used)
# else (not include egdes): look in all children of the file for nodes with the given code (get all nodes in the current file)
query = """g.V(%s).until(has('type', 'File')).repeat(inE('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST').outV())
    .bothE().choose(hasLabel('INCLUDES'), 
        outV().in('IS_AST_PARENT').as("includes")
            .until(has('type', 'File')).repeat(inE('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST').outV())
            .repeat(outE('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST').inV()).emit().has('code', textContains('%s')).as("result")
                .choose(count().is(gt(0)),
                local(__.select("includes").as("result")),
                id()    
                )           
        , 
        inV().has('type', 'File')
            .repeat(outE('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST').inV()).emit().dedup().has('code', textContains('%s')).as("result")
        )
        .select("result").unfold().dedup().id()
        """ % (40960, "doSomethingImportant", "doSomethingImportant")  
# Save node as 'a', then select its code        
query = """g.V(%s).as('a').select('a').by('code')""" % (40960)

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
# Get the names of all elements that can be declared on file scope
query = """g.V().has('type', within(%s)).as('declares').out('IS_AST_PARENT', 'DECLARES')
.union(
    has('type', within('Identifier', 'PreMacroIdentifier')).values('code')
    ,has('type', 'Decl').values('identifier')
    )
.dedup().as('identifiers')""" % (["FunctionDef", "DeclStmt", "StructUnionEnum", "PreDefine"] )  
# Follow the AST structure upwards until there are no more AST edges (at a functionDef typically). On this way, save all compound statements, their block closers, and functionDefs. In the end, print all visited paths 
query = """g.V(118992).repeat(__.in('IS_AST_PARENT')).emit().union(
            __.has('type', 'FunctionDef').as('result'),
            __.has('type', 'CompoundStatement').as('result').out('IS_AST_PARENT').has('type', 'BlockCloser').as('result')
        ).path().by('code')""" 
# Follow the AST structure upwards until there are no more AST edges (at a functionDef typically). On this way, save all compound statements, their block closers, and functionDefs. In the end, gather all results and print their ids
query = """g.V(118992).repeat(__.in('IS_AST_PARENT')).emit().union(
            __.has('type', 'FunctionDef').as('result'),
            __.has('type', 'CompoundStatement').as('result').out('IS_AST_PARENT').has('type', 'BlockCloser').as('result')
        ).select('result').unfold().id()""" 
# First get all parent nodes that implement variability, then get their AST parent or child nodes (PreElif/Else/Endif/PreIf)
query =  """g.V(192720)
    .repeat(__.in('VARIABILITY').simplePath()).emit().dedup().as('result')
    .repeat(__.both('IS_AST_PARENT').simplePath().has('type', within('PreIfStatement','PreElIfStatement','PreElseStatement','PreEndIfStatement'))).emit().dedup().as('result')
    .select('result').unfold().dedup().id()"""          
        
query = "g.V(1274008)"
#query = "g.V(651336)"
#query = "g.V(749568)"
query = "g.V().has('type','FunctionDef').has('code', textContains('usage ( const char * prog , int rc ) ')).out(AST_EDGE).has('type', 'CompoundStatement')" 

#query = """g.V().has('type', within('PreIfStatement','PreElIfStatement')).has('code', textContains('XML_MIN_SIZE')).union(id(), out('VARIABILITY').id())"""

query = "g.V().has('code', textContains('sccb_mgr_info'))"

query = "g.V().has('type', 'structUnionEnum')"


# Second: Go to parent file of the current node (Callee)
# Branch 1: Look in its AST children for a functionDef with the given name
# Branch 2: Then look for include statements. Follow them to the included files. Look in those files (c or h) until you find a functionDef.
# Branch 2.1: Emit the id of the external function def
# Branch 2.2: Go to the parent file of the external function def
# Branch 2.2.1: Emit the id of the include statement that includes the file with the external function def
# Branch 2.2.2: Go to the c file that belongs to the header file and also add its function def (TODO)
query = """g.V(%s).until(has('type', 'File'))
    .repeat(__.in('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST')).as('parentFileNode')
    .union(
        until(has('type', within('FunctionDef', 'PreDefine')).out().has('type', within('Identifier', 'PreMacroIdentifier')).has('code', '%s'))
        .repeat(outE('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST').inV()).id().as('sameFileResult')
        ,out('IS_FILE_OF').has('type', 'PreInclude').out().has('type', 'PreIncludeLocalFile').as('inc').out('INCLUDES')
        .until(has('type', within('FunctionDef', 'PreDefine', 'DeclStmt')).has('code', textContains('%s')))
            .repeat(__.out('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST')).as('externalHeaderFileResult')
            .union(
                id().as('idOfExternalDeclaration'),
                select('externalHeaderFileResult').until(has('type', 'File'))
                    .repeat(__.in('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST')).as('externalParentFileNode')
                    .union(
                    __.in('INCLUDES').has('path', select('inc').path()).in('IS_AST_PARENT').id().as('idOfIncludeStatement'),
                    __.out('IS_HEADER_OF').until(has('type', within('FunctionDef', 'PreDefine')).out().has('type', within('Identifier', 'PreMacroIdentifier')).has('code', '%s'))
                        .repeat(outE('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST').inV()).id().as('sameFileResult')
                    )
            )
    )""" % (1, "functionName[0]", "functionName[0]", "functionName[0]")     



# Go to parent file
# Follow IS_HEADER_OF to C file
# 1. Look in AST children for functionDef with same functionName  
# 2. Get the include statement for the header file 
query = """g.V(%s).in('IS_FILE_OF').out('IS_HEADER_OF').union(
    __.out('IS_FILE_OF').has('type', 'Function').has('code', textContains('%s')).out('IS_FUNCTION_OF_AST'),
    __.out('IS_FILE_OF').has('type', 'PreInclude').has('code', textContains('%s'))
    ).id()""" % (184448, "bubblesort", "C.h") 
    
query = """g.V().has('type', 'IfStatement').has('code', textContains('print_context.lines_since_last_match != 0 ')).values('code')  """  


query = """g.V(6434904).out('IS_FILE_OF').has('type', 'PreInclude').out().has('type', 'PreIncludeLocalFile').id()""" 

query = """g.V(%s).out('IS_FILE_OF').has('type', 'PreInclude').out().has('type', 'PreIncludeLocalFile').id()""" % (str(6434904))

query = """g.V(6434904)
            .until(has('type', within('FunctionDef', 'PreDefine')).out().has('type', within('Identifier', 'PreMacroIdentifier')).has('code', '%s'))
                .repeat(outE('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST').inV()).dedup().id()""" % ("check_symloop_leave")


query = "g.V(8032440)"

query = """g.V(8032440).until(has('type', 'File')).repeat(__.in('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST'))
            .dedup().out('IS_FILE_OF').has('type', 'PreInclude').where(out('IS_AST_PARENT').has('type', 'PreIncludeSystemHeader')).dedup().id()"""


query = """g.V(5435456).union(
        has('type', 'FunctionDef').in(),
        has('type', 'DeclStmt')
        ).in().dedup().out('IS_FILE_OF').has('type', 'PreInclude').where(not(out('IS_AST_PARENT'))).id()"""

query = "g.V().has('code', textContains('vplog')).values('type', 'code', 'path')"


#Check current node: 9548008 with type: ['Identifier']
#Check current node: 29778128 with type: ['Callee']
#Get decl of function: ['vplog']
#Searching for included files of root file: 8597632
#Includes: [8151040, 8225000]
#Found included file: [31191248]
#Found included file: [10346592]
#Searching for included files of root file: 31191248
#Includes: []
#Searching for included files of root file: 10346592
#Includes: [10248304, 30978256, 30982352]
#Found included file: [31191248]
#Could not find decl of: vplog with id: 29778128 inside the project's code

# 1093848 368800 131160 254112 110616 352344 389288
#4857944
query = "g.V(1093848)"

query = "g.V().has('type', 'Identifier').count()"

query = "g.V().has('type', within('DeclStmt', 'StructUnionEnum')).count()"

query = "g.V().has('type', 'File').out().values('type').dedup()"
query = "g.V().has('type', 'IdentifierDeclStatement').in().values('type').dedup()"

query = "g.V(21332184).out().values('code')"

query = "g.V().has('code', 'util.h').out().values('type').dedup()"

query = "g.V().has('code', 'util.h').out().has('type', 'File').values('code')"


query = "g.V(10489992).in().values('code', 'type')"

query = "g.V().has('code', 'BUF_SIZE').has('type', 'PreMacroIdentifier').outE()"

query = "g.E().hasLabel('INCLUDES').bothV().values('type').dedup()"

# Execute query
result = db.runGremlinQuery(query)


# Print results
for x in result: print(x)



# Close shell
query = "quit"
result = db.runGremlinQuery(query)
############################################################################################################
##### NOT WORKING OR PROBLEMS
############################################################################################################

# Empty, because you need the full qualified name
query = """getFunctionsByFilename("C.c")"""
# Another regex problem
query = """getCallsToRegex("bubblesor*").values('code')"""
# No signature of method: org.apache.tinkerpop.gremlin.process.traversal.traverser.O_Traverser.codeContains() is applicable for argument types: (java.lang.String) values: [bubblesort]
query = """g.V().sideEffect{it.codeContains("bubblesort");}"""
#Gremly-Groovy Syntax with it, doenst work as normal query?
query = """it.get().value('code');"""
