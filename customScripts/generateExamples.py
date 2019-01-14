#!/usr/bin/env python3
from octopus.server.DBInterface import DBInterface

# Connect to project DB
projectName = 'EvoDiss.tar.gz'
db = DBInterface()
db.connectToDatabase(projectName)

query = "g.V().has('type', 'Directory').has('code', '/home/lea/Downloads/Joern_Advanced/projects/octopus/data/projects/EvoDiss.tar.gz/src/home/lea/Downloads/EvoDiss/src').id()"
result = ["# " + str(db.runGremlinQuery(query))  + " Directory src"]

query = "g.V().has('type', 'File').has('code', '/home/lea/Downloads/Joern_Advanced/projects/octopus/data/projects/EvoDiss.tar.gz/src/home/lea/Downloads/EvoDiss/src/C_Test.c').id()"
result.append("# " + str(db.runGremlinQuery(query))  + " File C_Test.c")

query = "g.V().has('type', 'FunctionDef').has('code', textContains('compareResults')).id()"
result.append("# " + str(db.runGremlinQuery(query))  + " FunctionDef compareResults")

query = "g.V().has('type', 'FunctionDef').has('code', textContains('compareResults')).values('functionId')"
id = db.runGremlinQuery(query)[0]

query = "g.V().has('type', 'IfStatement').has('functionId', '%s').id()" % (id)
result.append("# " + str(db.runGremlinQuery(query))  + " IfStatements in compareResults")

query = "g.V().has('type', 'ElseStatement').has('functionId', '%s').id()" % (id)
result.append("# " + str(db.runGremlinQuery(query))  + " ElseStatement in compareResults")

query = "g.V().has('type', 'ForStatement').has('functionId', '%s').id()" % (id)
result.append("# " + str(db.runGremlinQuery(query))  + " ForStatement in compareResults")

query = "g.V().has('type', 'Condition').has('functionId', '%s').id()" % (id)
result.append("# " + str(db.runGremlinQuery(query))  + " Conditions in compareResults")

query = "g.V().has('type', 'PostIncDecOperationExpression').has('functionId', '%s').id()" % (id)
result.append("# " + str(db.runGremlinQuery(query))  + " PostIncDecOperationExpression in compareResults")

query = "g.V().has('type', 'FunctionDef').has('code', textContains('threeElmArray')).id()"
result.append("# " + str(db.runGremlinQuery(query))  + " FunctionDef threeElmArray")

query = "g.V().has('type', 'FunctionDef').has('code', textContains('threeElmArray')).values('functionId')"
id = db.runGremlinQuery(query)[0]

query = "g.V().has('type', 'CallExpression').has('code', textContains('compareResults')).has('functionId', '%s').id()" % (id)
result.append("# " + str(db.runGremlinQuery(query))  + " CallExpression compareResults in threeElmArray")

query = "g.V().has('type', 'Callee').has('code', textContains('compareResults')).has('functionId', '%s').id()" % (id)
result.append("# " + str(db.runGremlinQuery(query))  + " Callee compareResults in threeElmArray")




# Execute equery
for x in result:
    print(x)


## Example entry points ##
# 4256 Directory src
# 258224 File C_Test.c
# 233568 FunctionDef compareResults()
# 204872 IfStatement in compareResults
# 200912 corresponding ElseStatement
# 266416 ForStatement in compareResults
# 249952 Condition in above ForStatement
# 196769 PostIncDecOperationExpression in above ForStatement
# 274544 CallExpression compareResults() in threeElmArray()
# 315488 Callee compareResults() in threeElmArray()
# 4288 FunctionDef threeElmArray()