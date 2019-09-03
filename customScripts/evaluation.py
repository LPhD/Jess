#!/usr/bin/env python3
from octopus.server.DBInterface import DBInterface
import subprocess

projectName = 'SPLC'
pathToPatch = 'Patch/'
pathToOriginalProject = '/home/lea/Downloads/Joern_Advanced/projects/octopus/data/projects/'+projectName+'/src/'+projectName+'/src/'
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
            
               
print("Export visible node ids to file...")
fileOutput(getVisibleNodes())            
print("Convert project back to source code...")
from patchCreator import createPatch
print("Compare with original source code...")
with open('EvaluationResult.txt', 'w') as f:
    # No history, ignore whitespaces
    subprocess.call(["git", "diff", "--no-index", "-w", pathToOriginalProject, pathToPatch], stdout=f)



