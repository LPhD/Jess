#!/usr/bin/env python3
from octopus.server.DBInterface import DBInterface

# List of all declarations that exist on file scope
#File -> #PreDefine -> PreMacroIdentifier -> Identifier
#File -> Function -IS_FUNCTION_OF_AST-> #FunctionDef -> Identifier
#File -> #StructUnionEnum -> Identifier
#File -> #DeclStatement -Declares-> Decl (first word is the identifier?)

# List of all types that can use identifiers to do something (sorted by declarations)
#Function: FunctionDef and CallExpression (need parent ExpressionStatement). Declares.
#Macro: MacroDef and Callee or enywhere where we can identify a preMacroIdentifer?
#Declares: ?
#Enum:?

prefix = "semanticUnit__"


print("Adding prefixes...")
# Connect to SU projectfile:///C:/Users/Lea/git/Joern_Advanced/testProjects/Collection/Plot.png
db = DBInterface()
db.connectToDatabase("EvoDiss.tar.gz")


# Get the names of all functions
query = """g.V().has('type', 'FunctionDef').out('IS_AST_PARENT').has('type', 'Identifier').values('code').as('function')""" 
functions = db.runGremlinQuery(query)

# Get the names of all macros
query = """g.V().has('type', 'PreDefine').out('IS_AST_PARENT').has('type','PreMacroIdentifier').values('code').as('macro')""" 
macros = db.runGremlinQuery(query)

# Get the names of all declarations that can be declared on file scope
query = """g.V().has('type', 'DeclStmt').out('DECLARES').has('type', 'Decl').values('identifier').as('declaration')""" 
declarations = db.runGremlinQuery(query)

# Get the names of all StructUnionEnums
query = """g.V().has('type', 'StructUnionEnum').out('IS_AST_PARENT').has('type', 'identifier').values('code').as('enum')""" 
enums = db.runGremlinQuery(query)

functionResults = []
# Change the name of all FunctionDefs, CallExpressions and Declares of the respective function
for identifier in functions:
    query = """g.V().union(
        has('type', within('FunctionDef', 'DeclStatement'))
        ,has('type', 'CallExpression').in(AST_EDGE).has('type', 'ExpressionStatement')
        ).has('code', textContains('%s')).sideEffect(values('code').as('original')).property('code', '%s').values('code')""" % (identifier, prefix)
    functionResults += db.runGremlinQuery(query)

#How can we store the original code, add the prefix and then store it permanently in the graph?

query = """g.V().has('type', 'FunctionDef').out('IS_AST_PARENT').has('type', 'Identifier').values('code').as('function')""" 
results = db.runGremlinQuery(query)

# Look for every occurence of each identifer and replace it? Or filter by type?

#query = """g.V().has('type', within(%s)).out('DECLARES').has('type', 'Decl').values('identifier').dedup()""" % (declList)    

print(functions) 
print(functionResults) 
print("Current state: "+str(results))

print(macros) 

print(declarations) 

print(enums) 




# Get the names of all elements that can be declared on file scope
query = """g.V().union(
    has('type', 'FunctionDef').out('IS_AST_PARENT').has('type', 'Identifier').values('code').as('function')
    ,has('type', 'PreDefine').out('IS_AST_PARENT').has('type','PreMacroIdentifier').values('code').as('macro')
    ,has('type', 'DeclStmt').out('DECLARES').has('type', 'Decl').values('identifier').as('declaration')
    ,has('type', 'StructUnionEnum').out('IS_AST_PARENT').has('type', 'identifier').values('code').as('enum')
    )
.group().by(label)""" 

# What about pre includes? Header #ifdef should prevent double inclusion. What what about duplicates in the same file?
# What about typedefs? typedef int bool declares bool. This can currently not be part of the SU, needs further analysis