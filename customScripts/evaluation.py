#!/usr/bin/env python3
from octopus.server.DBInterface import DBInterface
import subprocess

#Name of the project
#projectName = 'Collection'
projectName = 'EvoDiss.tar.gz'
#projectName = 'ICSE'
#projectName = 'JoernTest.tar.gz'
#projectName = 'Linux3'
#projectName = 'Marlin'
#projectName = 'Revamp'
#projectName = 'SPLC'
#projectName = 'TestCommit'


#Project specific paths
#Collection path
#projectPath = '/Joern_Advanced/testProjects/Collection/src/'
#EvoDiss path
projectPath = '/home/lea/Downloads/EvoDiss/src/'
#ICSE path
#projectPath = '/home/lea/Downloads/'
#JoernTest path
#projectPath = '/home/lea/Downloads/Joern_Advanced/testProjects/Tests/'
#Linux3 path
#projectPath = '/home/lea/Downloads/linux-3.16.72/'
#Marlin path
#projectPath = '/Marlin-1.1.9/'
#Revamp path
#projectPath = '/home/lea/Downloads/Joern_Advanced/testProjects/'
#SPLC path
#projectPath = '/Joern_Advanced/testProjects/SPLC/src/'
#TestCommit path
#projectPath = '/src/'

#Assemble path
pathToPatch = 'Patch/'
basePath = '/home/lea/Downloads/Joern_Advanced/projects/octopus/data/projects/'+projectName+'/src'
pathToOriginalProject = basePath+projectPath

db = DBInterface()
db.connectToDatabase(projectName)

visibleStatementTypes = ['ClassDef', 'FunctionDef', 'CompoundStatement', 'DeclStmt', 'TryStatement', 'CatchStatement', 'IfStatement', 'ElseStatement', 'SwitchStatement', 'ForStatement', 'DoStatement', 'WhileStatement', 'BreakStatement', 'ContinueStatement', 'GotoStatement', 'Label', 'ReturnStatement', 'ThrowStatement', 'ExpressionStatement', 'IdentifierDeclStatement', 'PreIfStatement', 'PreElIfStatement', 'PreElseStatement', 'PreEndIfStatement', 'PreDefine', 'PreUndef', 'PreDiagnostic', 'PreOther', 'PreInclude', 'PreIncludeNext', 'PreLine', 'PrePragma', 'UsingDirective', 'BlockCloser', 'Comment']



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



