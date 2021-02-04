#!/usr/bin/env python3
from octopus.server.DBInterface import DBInterface
from codeConverter import convertToCode
import subprocess
import os
import shutil


def getProjectPath (projectName):  
    #Name and path of the project
    projectNameAndPath = {'Collection':'/Joern_Advanced/testProjects/Collection/src/', 
    'EvoDiss.tar.gz':'/home/lea/Downloads/EvoDiss/src/', 
    'ICSE':'/home/lea/Downloads/', 
    'JoernTest.tar.gz':'/home/lea/Downloads/Joern_Advanced/testProjects/Tests/', 
    'Linux3':'/home/lea/Downloads/linux-3.16.72/', 
    'Marlin':'/Marlin-1.1.9/', 
    'Revamp':'/home/lea/Downloads/Joern_Advanced/testProjects/', 
    'SPLC':'/Joern_Advanced/testProjects/SPLC/src/', 
    'TestCommit':'/src',
    'expat':'/libexpat/',
    'Origin.tar.gz':'/C/src',
    'PL_Current.tar.gz':'/C/src',
    'PV_Current.tar.gz':'/C/src',
    'sample':'/Example/',
    'DonorProject':'/DonorProjectCode/src',
    'ag':'/home/lea/Downloads/the_silver_searcher/src',
    'grep':'/home/lea/Downloads/grep/src',
    'scrcpy':'/home/lea/Downloads/scrcpy/app',
    'php':'/home/lea/Downloads/php-src/main'} 

    #Assemble path 
    return projectNameAndPath[projectName]


# Returns all AST vertices of the SemanticUnit that directly appear in the code (CFG nodes or direct children of file nodes)    
def getVisibleNodes(projectName):
    db = DBInterface()
    db.connectToDatabase(projectName)
    
    visibleStatementTypes = ['CustomNode', 'ClassDef', 'DeclByClass', 'DeclByType', 'FunctionDef', 'CompoundStatement', 'Statement', 'DeclStmt', 'StructUnionEnum', 'FunctionPointerDeclare', 'TryStatement', 'CatchStatement', 'IfStatement', 'ElseStatement', 'SwitchStatement', 'ForStatement', 'DoStatement', 'WhileStatement', 'BreakStatement', 'ContinueStatement', 'GotoStatement', 'Label', 'ReturnStatement', 'ThrowStatement', 'ExpressionStatement', 'IdentifierDeclStatement', 'PreIfStatement', 'PreElIfStatement', 'PreElseStatement', 'PreEndIfStatement', 'PreDefine', 'PreUndef', 'PreDiagnostic', 'PreOther', 'PreInclude', 'PreIncludeNext', 'PreLine', 'PrePragma', 'UsingDirective', 'BlockCloser', 'Comment', 'File', 'Directory']
    
    # Remove unneeded nodes (we need to exclude IdentifierDeclStatement that have a ForInit or StructUnionEnum as parent)
    query = """g.V().has('type', within(%s))
                .not(__.repeat(__.in(AST_EDGE)).emit().has('type', within('ForInit','StructUnionEnum')))
                .id()""" % (visibleStatementTypes) 
    result = db.runGremlinQuery(query)
            
    # Finally close db connection and release the shell
    db.runGremlinQuery("quit") 
    
    return result  

def fileOutput (result, projectName):    
    with open('result.txt', 'w') as file_handler:
        file_handler.write(projectName+"\n")
        for item in result:
            file_handler.write("{}\n".format(item))  
            
# Main function
def evaluateProject (projectName, workingdir, projectPath):            
    print("Export visible node ids to file...")
    fileOutput(getVisibleNodes(projectName), projectName)      
          
    print("Convert project back to source code...")
    codeFoldername = "CodeToEvaluate"
    convertToCode(False, workingdir, codeFoldername, projectPath)

    print("Compare with original source code...")
    #Make new empty temp dir
    foldername = "Temp"
    if os.path.exists(foldername):
        shutil.rmtree(foldername)
          
    os.makedirs(foldername)
    
    #Finds all files in the original directory that end with .c or .h and copies them in the temporary folder preserving their folder structure
    #(necessary because git diff --no-index does not allow for filtering of filetypes
    os.chdir(projectPath)    
    os.system("find -iname '*.[c|h]' -exec cp --parent  '{}' "+workingdir+"/"+foldername+"/ \;")
    
    # Go back to the current dir
    os.chdir(workingdir)
    # Get changes
    os.system("git diff -w -b --ignore-blank-lines --no-index "+foldername+" "+codeFoldername+"/  > "+projectName+"EvaluationResult.txt")   
            
    if (os.stat(projectName+"EvaluationResult.txt").st_size == 0):
        print("* * * Evaluation was successful, no differences found * * *")
    else:
        print("Found some differences, please look at "+projectName+"EvaluationResult.txt for more details")


# When called via console, fill these out and add your project path to getProjectPath function
#projectName = "php"
#projectName = input("Please type in the name of the project")
#evaluateProject(projectName, os.getcwd(), getProjectPath(projectName))
