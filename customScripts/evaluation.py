#!/usr/bin/env python3
from octopus.server.DBInterface import DBInterface
#import random


projectName = 'EvoDiss.tar.gz'
db = DBInterface()
db.connectToDatabase(projectName)

visibleStatementTypes = ['File', 'Function', 'ClassDef', 'FunctionDef', 'CompoundStatement', 'DeclStmt', 'TryStatement', 'CatchStatement', 'IfStatement', 'ElseStatement', 'SwitchStatement', 'ForStatement', 'DoStatement', 'WhileStatement', 'BreakStatement', 'ContinueStatement', 'GotoStatement', 'Label', 'ReturnStatement', 'ThrowStatement', 'ExpressionStatement', 'IdentifierDeclStatement', 'PreIfStatement', 'PreElIfStatement', 'PreElseStatement', 'PreEndIfStatement', 'PreDefine', 'PreUndef', 'PreDiagnostic', 'PreOther', 'PreInclude', 'PreIncludeNext', 'PreLine', 'PrePragma', 'UsingDirective', 'BlockCloser', 'Comment']




# Returns all AST vertices of the SemanticUnit that directly appear in the code (CFG nodes or direct children of file nodes)    
def getVisibleNodes():
    # Remove unneeded nodes
    query = """g.V().has('type', within(%s)).id()""" % (visibleStatementTypes)  
    result = db.runGremlinQuery(query)
    return result  

def fileOutput (result):    
    with open('result.txt', 'w') as file_handler:
        file_handler.write(projectName+"\n")
        for item in result:
            file_handler.write("{}\n".format(item))  
            
               
print("Writing files...")
fileOutput(getVisibleNodes() )            

#plotDB
#patchCreator
#git Diff with project

#db = DBInterface()
#db.connectToDatabase(projectName)


#i =  random.randint(274411528,83153600000);
#print(str(i));

#query = """g.V(%s)""" % (i)



# Execute equery
#result = db.runGremlinQuery(query)

# Print results
#for x in result: print(x)