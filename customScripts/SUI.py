#!/usr/bin/env python3
import os
import pygraphviz as pgv
import ntpath
import time

from octopus.server.DBInterface import DBInterface
from joern.shelltool.PlotConfiguration import PlotConfiguration
from joern.shelltool.PlotResult import NodeResult, EdgeResult
#Timer
start_time = time.time()

################# Configuration options for Semantic Unit identification #################
includeEnclosedCode = True
connectIfWithElse = True
followDataflows = False
searchDirsRecursively = False
includeOtherFeatures = False
lookForAllFunctionCalls = False
lookForAllMacroUsages = False
############### Further options to refine the Semantic Unit after analysis ###############
includeVariabilityInformation = True
includeComments = True
includeExternalLibraryIncludes = True
includeOnlyProbablyUsedGlobalDeclarationsOfVariables = False
includeAllGoblaDelcarationsOfVariables = True #Has no effect if the option above is true       
######################### Configuration options for graph output #########################
generateOnlyAST = False
generateOnlyVisibleCode = True
showOnlyStructuralEdges = True
plotGraph = False
###################### Configuration options for entry point input ## ####################
console = False
#################### Configuration options for debug output (console) ####################
DEBUG = False
showStatistics = True
##########################################################################################


# Set the project DB manually (has only an effect if consoleInput is deactivated)
#projectName = 'JoernTest.tar.gz'
#projectName = 'EvoDiss.tar.gz'
#projectName = 'Revamp'
#projectName = 'SPLC'
#projectName = 'expat'
#projectName = 'PL_Current.tar.gz'
#projectName = 'PV_Current.tar.gz'
projectName = 'DonorProject'
#projectName = 'Origin.tar.gz'
#projectName = 'Collection'


## Example entry points ##
## Caution, depends on db ##
# [4280, 12472] Directory src
# [237632] File C_Test.c
# [262328] FunctionDef compareResults
# [516184, 524440] IfStatements in compareResults
# [528472] ElseStatement in compareResults
# [266424] ForStatement in compareResults
# [241688, 503896, 540824] Conditions in compareResults
# [499800] PostIncDecOperationExpression in compareResults
# [282752] FunctionDef threeElmArray
# [622744] CallExpression compareResults in threeElmArray
# [622680] Callee compareResults in threeElmArray

## Work with sets, as they are way faster and allow only unique elements ##
# Ids of entry point vertices or name of entry feature
# You can select both, if you want additional entry points. Empty sets should be declared as set() and not {}
# The id should be of a node that can appear directly in the code (e.g. FunctionDef and not its Identifier)

# 118808 main function
# 348272 bubbleReversed call in main
#entryPointIds = {1232984}
#search.c 481
#7684120
entryPointIds = {6967384}
#ExpressionStatement (FCall) in function util C line 536/541. Good to show differences between with and without data flow. Small Slice.
#entryPointIds = {29774032}
#entryPointIds = {348272}

entryFeatureNames = set()
# Initialize empty Semantic Unit (result) set
semanticUnit = set()
# Initialize empty set of checked vertices (because we only need to check the vertices once)
checkedVertices = set()
# Initialize empty set of vertices that will be checked
analysisList = list()
# Collect all external functions, as we do not need to look for their declaration more than once
externalFunctionsSet = set()
# Collect all files that are part of the SU, so we can reuse this information instead of querying multiple times
SUFilesSet = set()
# Collect all identifiers (value as list) for a file (key), as we do not need to look for file-identifier pair declaration more than once 
alreadyCheckedIdentifierDict = dict()
# List with statement types that appear directly in the code (including CompoundStatement for structural reasons)
# VarDecl? DeclByClass? DeclByType? InitDeclarator?
visibleStatementTypes = ['CustomNode', 'ClassDef', 'DeclByClass', 'DeclByType', 'FunctionDef', 'CompoundStatement', 'DeclStmt', 'StructUnionEnum', 'TryStatement', 'CatchStatement', 'IfStatement', 'ElseStatement', 'SwitchStatement', 'ForStatement', 'DoStatement', 'WhileStatement', 'BreakStatement', 'ContinueStatement', 'GotoStatement', 'Label', 'ReturnStatement', 'ThrowStatement', 'ExpressionStatement', 'IdentifierDeclStatement', 'PreIfStatement', 'PreElIfStatement', 'PreElseStatement', 'PreEndIfStatement', 'PreDefine', 'PreUndef', 'MacroCall', 'PreDiagnostic', 'PreOther', 'PreInclude', 'PreIncludeNext', 'PreLine', 'PrePragma', 'UsingDirective', 'BlockCloser', 'Comment', 'File', 'Directory']


# Main function 
def identifySemanticUnits ():
# Check if a feature is selected as entry point
    if (len(entryFeatureNames) > 0):        
        result = set(getFeatureBlocks(entryFeatureNames))
        if (len(result) > 1):
            print("Found feature as entry point, updated entry points: "+str(result)+"\n") 
            entryPointIds.update(result)
        
    # Add the initial list of nodes to the analysis set
    analysisList.extend(entryPointIds)
    
    print("Starting analysis...")
    print("--------------------------------------------------------------------------------- \n")
    
    # For elements that change?
    for node in analysisList:
        # Check nodes only once
        if ((not node in checkedVertices) and node != ""):         
            analyzeNode(node)
            checkedVertices.add(node)
            semanticUnit.add(node)
            
        # Remove node after the analysis
        # analysisList.remove(node)          
      
     
    if (len(semanticUnit) > 1):
        # Adapt results for syntactical correctness       
        # Add the function definition 
        addParentFunctions()  
        #Collect the file nodes of the SU
        getSUsFileNodes()
        
        #Check for includes of (external) libraries
        if(includeExternalLibraryIncludes):
            addExternalIncludes() 
                   
        # Include only those declarations, for which there is an identifier in the SU (indicates usage, but no guarantee, as we do not analyze the scope) 
        if(includeOnlyProbablyUsedGlobalDeclarationsOfVariables):
            addUsedGlobalDeclares()             
        # Include all global declarations of variables   
        elif (includeAllGoblaDelcarationsOfVariables):        
            addGlobalDeclares() 
                        
        #Check for variability information
        if(includeVariabilityInformation):
            addVariability()
        
        #Check for comments
        if(includeComments):
            addComments()       
 
        #Print names of all functions that need external libraries (or that we failed to find a declaration for)
        print("The following functions/macros have a declaration outside of the project's code (e.g. in used libraries): "+str(externalFunctionsSet))
        
        # Get the #ifndef #def and #endif for header files? Currently, we get that when addVariability is true
        
        print("Analysis finished, making graph...")
        print ("Analysis took", time.time() - start_time, "seconds to run")
        print("--------------------------------------------------------------------------------- \n")
        
        if (showStatistics):
            #Count number of nodes
            countNodes()

        if (plotGraph):
            # Plot resulting graph
            plotResults()

        # Write resulting Ids to file
        fileOutput()
            
        # Output resulting Ids on console
        #for x in semanticUnit: print(x)

        # Print code results
        #codeOutput()

        # Print node results
        #nodeOutput()
    else:
        print("SemanticUnit is empty!")


####################################### Rules ###############################################   


# Decides based on the vertice type, which functions are called 
def analyzeNode (currentNode):
    # Reset current result
    result = ""       
    
    # Get type of current vertice 
    query = """g.V(%s).values('type')""" % (currentNode)
    type = db.runGremlinQuery(query)   

    if (DEBUG) : print("Check current node: "+str(currentNode)+" with type: "+str(type))    
    
    # Inform the user if a node id does not exist
    if(len(type)< 1):
        print("################################################################################################")
        print("No vertice with the given id \""+str(currentNode)+"\" found. Please check your database for an existing vertice id.")
        print("################################################################################################")
        return

################################ Structural relations ###################################################################
    # Get all included files if current vertice is a Directory
    if (type[0] == "Directory"):
        # Add only the contained files
        if (searchDirsRecursively == False):
            result = set(getIncludedFiles(currentNode))
        else:
            result = set(getIncludedFilesAndDirectories(currentNode))
        
        # For every enclosed file, get related elements
        analysisList.extend(result)
        # Print result
        if (DEBUG): print("Result structural relation: "+str(result)+"\n")
        
    # Get all enclosed lines of code if current vertice is a File
    if (type[0] == "File"):
        result = set(getEnclosedCodeOfFile(currentNode))
        # For every enclosed code line, get related elements
        analysisList.extend(result)
        # Print result
        if (DEBUG): print("Result structural relation: "+str(result)+"\n")
        
    # Get enclosed vertices if current vertice is a function declaration
    if ((type[0] == "FunctionDef") and (includeEnclosedCode == True)):
        result = set(getASTChildren(currentNode))           
        # For each enclosed vertice, add to the Semantic Unit and get related elements
        analysisList.extend(result)         
         # Print result
        if (DEBUG): print("Result structural relation: "+str(result)+"\n")
        
    # Get enclosed vertices if current vertice is a for-, while- or if-statement
    if (type[0] in ["IfStatement","ForStatement","WhileStatement", "SwitchStatement"]) and (includeEnclosedCode == True):             
        result = set(getASTChildren(currentNode))
        # For each enclosed vertice, add to the Semantic Unit and get related elements
        analysisList.extend(result) 
         # Print result
        if (DEBUG): print("Result structural relation: "+str(result)+"\n")

    # Get only the Syntax Elements of the selected statement     
    elif (type[0] in ["IfStatement","ForStatement","WhileStatement"]):       
        # Get corresponding else-statement only if the configuration is selected
        if ((type[0] == "IfStatement") and (connectIfWithElse == True)):
            result = set(getElse(currentNode))           
            
            if(result in semanticUnit):
                print("Already contained in SU!")
                                   
            # Just add, no further analysis
            semanticUnit.update(result)                        
                            
        result = set(getInitAndCondition(currentNode))
        # For each enclosed vertice, add to the Semantic Unit and get related elements
        analysisList.extend(result)         
         # Print result
        if (DEBUG): print("Result structural relation: "+str(result)+"\n")
                   
    # Get the corresponding if, if current vertice is an else-statement
    if (type[0] == "ElseStatement"):            
        result = set(getIfStatement(currentNode))
        if (includeEnclosedCode):
            result.update(set(getASTChildren(currentNode)))
        # Get related elements of the if/else-statement
        analysisList.extend(result)         
         # Print result
        if (DEBUG): print("Result structural relation: "+str(result)+"\n")

    # Get the AST children if current vertice is an expression or identifierDecl statement
    if (type[0] in ["ExpressionStatement", "IdentifierDeclStatement"]):                       
        result = set(getASTChildren(currentNode))
        # Get related elements of the AST children
        analysisList.extend(result)          
         # Print result
        if (DEBUG): print("Result structural relation: "+str(result)+"\n")
        
##################################################################################################################           
################################### Call relations ############################################################### 
       
    # Get called function or function-like macro if current vertice is a callee
    if (type[0] == "Callee"): 
        # Do not look at CallExpression, one query is enough. We will always have both the Callee and 
        #the CallExpression in the analysis set, see handling of ExpressionStatement above.                   
        result = set(getCalledFunctionDef(currentNode, type[0]))                
        # Get related elements of the called function
        analysisList.extend(result)
         # Print result
        if (DEBUG): print("Result call relation for a Callee: "+str(result)+"\n")      
  
        
    # For a given function name, return all possible callees    
    if ((type[0] == "FunctionDef") and (lookForAllFunctionCalls == True)): 
        result = set(getCallsToFunction(currentNode))
        analysisList.extend(result)
         # Print result
        if (DEBUG): print("Result call relation for a FunctionDef: "+str(result)+"\n")
    
    # Get macro identifier    
    if (type[0] in ["PreUndef","PreDefine"]) and (lookForAllMacroUsages == True):    
        result = set(getMacroIdentifier(currentNode))
        analysisList.extend(result)
         # Print result
        if (DEBUG): print("Result call relation for a PreDefine: "+str(result)+"\n")

    # Get all statements (limited to preprocessor and function-like macro calls) connected to the PreMacroIdentifier     
    if (type[0] == "PreMacroIdentifier") and (lookForAllMacroUsages == True):  
        result = set(getRelationsToMacro(currentNode))
        analysisList.extend(result)
         # Print result
        if (DEBUG): print("Result call relation for a PreDefine: "+str(result)+"\n")

        
##################################################################################################################
################################## Define relations ##############################################################
        
    # Get function definition vertice if current vertice is a function 
    if (type[0] == "Function"):
        result = set(getFunctionDefOut(currentNode))           
        # Add FunctionDef to the Semantic Unit and get related elements
        analysisList.extend(result)
         # Print result
        if (DEBUG): print("Result define relation: "+str(result)+"\n")
        
    # Get the declaration of the function in its header file (if existing)
    if (type[0] == "FunctionDef"):
        result = set(getFunctionDeclInHeader(currentNode))
        # Just add, no further analysis (we do not need to look at the decl again, this is done for Decl and CallExpression)
        semanticUnit.update(result) 
         # Print result
        if (DEBUG): print("Result define relation: "+str(result)+"\n")
        
    # Get the definition of the function in its c file (if existing) and the include statement
    if (type[0] == "DeclStmt"):
        result = set(getFunctionDefinCFile(currentNode))
        # Add FunctionDef to the Semantic Unit and get related elements
        analysisList.extend(result)
         # Print result
        if (DEBUG): print("Result define relation: "+str(result)+"\n")        
    
    # Get definition of the element that contains the condition or parameter
    # We need this for identification of statements that are connected to a #define       
    if (type[0] in ('Condition', 'PreIfCondition', 'Parameter', 'ParameterList')):
        result = set(getParent(currentNode))
        # Add FunctionDef to the Semantic Unit and get related elements
        analysisList.extend(result)
         # Print result
        if (DEBUG): print("Result define relation: "+str(result)+"\n")
                
    # Get referenced function or variable if current vertice contains an unary address of operator
    # ToDo Reuse getCalledFunctionDef, but refine the double check prevention (as variable names can occur multiple times). 
    # However, do we really need that? We just aim at getting refences to functions and not global variables (this is done later).
    if (type[0] == "AddressOfExpression"):          
        result = set(getCalledFunctionDef(currentNode, type[0]))                
        # Get related elements of the referenced function or variable
        analysisList.extend(result)
         # Print result
        if (DEBUG): print("Result call relation for an AddressOfExpression: "+str(result)+"\n")   
        
##################################################################################################################
##################################### Data Flow ##################################################################   

    # Get all statements that are connected via used and defined relations
    if (followDataflows == True and type[0] in ["ForInit", "IdentifierDeclStatement", "Parameter", "AssignmentExpression", "ExpressionStatement", "Argument", "ArgumentList", "Condition", "UnaryExpression", "ReturnStatement"]):
        # Maybe some types are missing, needs further testing
        result = set(getDefinesAndUses(currentNode))
        # Get related elements of the called function
        analysisList.extend(result)
        # Print result
        if (DEBUG): print("Result data flow relation: "+str(result)+"\n")
        
##################################################################################################################
##################################### Control Flow ###############################################################       

    # Get enclosed vertices if current vertice is a label statement
    if (type[0] == "Label"): 
        # Get all goto statements that refer to this label
        result = set(getGotos(currentNode))  
        # Just add, no further analysis (we do not need to look at the gotos again, as they will result in the used labels)
        semanticUnit.update(result) 
         # Print result
        if (DEBUG): print("Result control flow relation: "+str(result)+"\n")
       
    # Get enclosed vertices if current vertice is a GotoStatement 
    if (type[0] == "GotoStatement"): 
        # Get all labels that were refered by this goto
        result = set(getLabels(currentNode))  
        # Just add, no further analysis (we do not need to look at the labels again, as they will result in the used gotos)
        semanticUnit.update(result) 
        # Print result
        if (DEBUG): print("Result control flow relation: "+str(result)+"\n")
   
        
####################################################################################################################
#################################### Variability ###################################################################          
         
    # Get enclosed vertices if current vertice is a pre-if-statement
    if (type[0] == "PreIfStatement"):                       
        #get variable statements
        result = set(getVariableStatements(currentNode))
        
        if (connectIfWithElse == False): 
            # Only get #endif and the condition
            result.update(set(getEndIf(currentNode)))   
            result.update(set(getPreIfCondition(currentNode)))                      
        else:
           # Otherwise get all AST children (condition and one #else/#elif/#endif)     
           result.update(set(getASTChildren(currentNode)))           
                 
        # For each enclosed vertice, add to the Semantic Unit and get related elements
        analysisList.extend(result)
        # Print result
        if (DEBUG): print("Result variability relation: "+str(result)+"\n")
                             
    #Get enclosed vertices if current vertice is a pre-elif-statement       
    if (type[0] == "PreElIfStatement"):        
        # Get variable statements
        result = set(getVariableStatements(currentNode))
        # Get the starting #if
        result.update(set(getPreIf(currentNode)))  
        
        if (connectIfWithElse == False): 
            # Only get the condition  
            result.update(set(getPreIfCondition(currentNode)))                      
        else:
           # Otherwise get all AST children (condition and all #else/#elif/#endif)     
           result.update(set(getASTChildren(currentNode)))  
        
        # For each enclosed vertice, add to the Semantic Unit and get related elements
        analysisList.extend(result)
        # Print result
        if (DEBUG): print("Result variability relation: "+str(result)+"\n")
      
    #Get enclosed vertices if current vertice is a pre-else-statement     
    if (type[0] == "PreElseStatement"):
        # Get variable statements
        result = set(getVariableStatements(currentNode))
        # Get the starting #if
        result.update(set(getPreIf(currentNode)))                        
        # For each enclosed vertice, add to the Semantic Unit and get related elements
        analysisList.extend(result)
        # Print result
        if (DEBUG): print("Result variability relation: "+str(result)+"\n")
       
    #Get enclosed vertices if current vertice is a pre-endif-statement     
    if (type[0] == "PreEndIfStatement"):
        # Get the starting #if and add it to the semanticUnit
        analysisList.extend(set(getPreIf(currentNode)))    
        # Print result
        if (DEBUG): print("Result variability relation: "+str(result)+"\n")


##############################################################################################################################
#################################### No impact analysis, just call (backward) analysis  ######################################                

    # Get all AST childs and analyze them      
    if (type[0] in["PreDiagnostic", "PreOther", "PreLine", "PrePragma"]):
        result = set(getASTChildren(currentNode))
        analysisList.extend(result)
        # Print result
        if (DEBUG): print("Result AST children: "+str(result)+"\n")
                
#####################################################################################################################
#################################### End of rules  ##################################################################                     

    
    
    # Do nothing for (as intended):
    # PreInclude, PreIncludeNext (included file possible, but why not just give the file as entry point?)
    ################# No meaningful connections, no direct appearence in the code, already contained in other analyses ##################
    # 'CompoundStatement' empty container object 
    # 'IncDec' ++
    # 'UnaryOperator' !
    # 'AdditiveExpression' a + b
    # 'PrimaryExpression' 1
    # 'UnaryOperationExpression' - 1
    # 'ReturnType' void
    # 'CFGEntryNode' ENRTY
    # 'CFGExitNode' EXIT
    # 'PreMacroParameters' parameters of a function-like macro
    # 'PreMacro' the macro content
    # 'BreakStatement', 'ContinueStatement'
    ####################### Already contained in other analyses ###############################################
    # 'Symbol' (already contained in the dataflow analysis)
    # 'IdentifierDeclType' int (contained in IdentifierDeclStatement)
    # 'IdentifierDecl' i (contained in IdentifierDeclStatement)
    # 'ParameterType' int (contained in ParameterList)
    # 'RelationalExpression' i > 5 (contained in condition)
    # 'ArrayIndexing' array[1]    
    # 'Decl' (already contained in DeclStmt/FunctionDef/Callee)    
    # 'PreInclude', 'PreIncludeNext' (choose the file instead)
    ####################### C ++ specific (maybe done later) ###############################################
    # 'ClassDef'
    # 'TryStatement', 'CatchStatement', 'ThrowStatement'
    # 'UsingDirective'


################################ Definition of helper functions ########################################################     
        
# Return all vertices of type file that belong to the given directory (not recursive)        
def getIncludedFiles (verticeId):
    query = """g.V(%s).out().has('type', 'File').dedup().id()""" % (verticeId)
    return db.runGremlinQuery(query)
    
# Return all vertices of type file and directory that belong to the given directory (recursive)        
def getIncludedFilesAndDirectories (verticeId):
    query = """g.V(%s).out().has('type', within('File', 'Directory')).dedup().id()""" % (verticeId)
    return db.runGremlinQuery(query)    
       
# Return all AST vertices and their children that belong to the given file 
def getEnclosedCodeOfFile (verticeId):
    query = """g.V(%s).emit().repeat(__.out('IS_AST_PARENT','VARIABILITY','IS_FILE_OF','IS_FUNCTION_OF_AST')).dedup().id()""" % (verticeId)
    return db.runGremlinQuery(query)   
           
# Return function definition vertice of a given function
def getFunctionDefOut (verticeId):
    query = """g.V(%s).out().has('type', 'FunctionDef').dedup().id()""" % (verticeId)
    return db.runGremlinQuery(query)  

# Return function decl in the belonging header file (if existing) ###############
def getFunctionDeclInHeader (verticeId):
    # Get the name
    query = """g.V(%s).out(AST_EDGE).has('type', 'Identifier').values('code')""" % (verticeId)
    fName = db.runGremlinQuery(query)
    
    if(len(fName)>0):
        # Go to parent file
        # Follow IS_HEADER_OF
        # Look in AST children for decl with same functionName
        query = """g.V(%s)
            .until(has('type', 'File')).repeat(__.in('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST'))
            .in('IS_HEADER_OF').out('IS_FILE_OF').has('type', 'DeclStmt').has('code', textContains('%s')).dedup().id()
        """ % (verticeId, fName[0])        
        
        return db.runGremlinQuery(query)    
    else:
        return ""

# Return function def in the belonging C file (if existing) and the belonging include statement  
def getFunctionDefinCFile (verticeId):
    # Get the name of function and header file
    query = """g.V(%s).union(
        __.out('DECLARES'),
        __.in('IS_FILE_OF')
    ).values('code')""" % (verticeId)
    # 0 is function name, 1 is header file name
    names = db.runGremlinQuery(query)
  
    if(len(names) > 1):
        # Do this only for function declares that contain a '('
        fName = names[0].rpartition("(")[0]  
        if(len(fName) > 0):       
            # Go to parent file
            # Follow IS_HEADER_OF
            # 1. Look in AST children for decl with same functionName  
            # 2. Look in AST children for include of header file
            query = """g.V(%s).in('IS_FILE_OF').out('IS_HEADER_OF').union(
                __.out('IS_FILE_OF').has('type', 'Function').has('code', textContains('%s')).out('IS_FUNCTION_OF_AST'),
                __.out('IS_FILE_OF').has('type', 'PreInclude').has('code', textContains('%s'))
            ).dedup().id()""" % (verticeId, fName, names[1])        
            
        return db.runGremlinQuery(query)
    else:
        return ""


# Return AST parent of a given node (can be empty)
def getParent (verticeId):
    query = """g.V(%s).out('IS_AST_PARENT').dedup().id()""" % (verticeId)
    return db.runGremlinQuery(query)                 

# Return all GotoStatements that use the given label
def getGotos (verticeId):
    # Get code of the referenced label
    query = """g.V(%s).out('IS_AST_PARENT').values('code')""" % (verticeId) 
    name = db.runGremlinQuery(query)

    # Go to parent filenode
    # Look in all children for the the goto that references the label
    query = """g.V(%s)
        .until(has('type', 'File'))
        .repeat(__.in('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST'))
        .until(has('type', 'GotoStatement').out('IS_AST_PARENT').has('code', '%s'))
        .repeat(__.out('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST')).dedup().id()
    """ % (verticeId, name[0]) 
    return db.runGremlinQuery(query)

# Return all Labels and the connected code that were refered by the given GotoStatement
def getLabels (verticeId):
    # Get code of the referenced label
    query = """g.V(%s).out('IS_AST_PARENT').values('code')""" % (verticeId) 
    name = db.runGremlinQuery(query)

    # Go to parent filenode
    # Look in all children for the referenced label
    query = """g.V(%s)
        .until(has('type', 'File'))
        .repeat(__.in('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST'))
        .until(has('type', 'Label').out('IS_AST_PARENT').has('code', '%s'))
        .repeat(__.out('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST')).dedup().id()
    """ % (verticeId, name[0]) 
    return db.runGremlinQuery(query)
 
 
# Return all AST children vertice ids of the given vertice
def getASTChildren (verticeId):
    query = """g.V(%s).emit().repeat(__.out('IS_AST_PARENT')).unfold().dedup().id()""" % (verticeId)
    return db.runGremlinQuery(query)   

    
# Return the id of the declaration of the called function, including needed include statements
def getCalledFunctionDef (verticeId, type):
    # Get the name of the called function
    query = """g.V(%s).out().has('type', 'Identifier').values('code', 'path')""" % (verticeId)
    functionName = db.runGremlinQuery(query)
    
    if(len(functionName) < 2): 
        print("Warning: Cannot get name or path of function: "+str(verticeId))
        return ""
    
    if functionName[0] in externalFunctionsSet:
        if DEBUG: print("Already checked function and found no declaration: "+str(functionName[0])+" - Skipping...")
        return ""
    
    # Check if we encounter this file for the first time    
    if str(functionName[1]) in alreadyCheckedIdentifierDict:
        # If we already visited this file, check if we also already have checked this identifier
        if str(functionName[0]) in alreadyCheckedIdentifierDict[str(functionName[1])]:
            # Skip the rest of the function, as we do not need to seach for a declaration multiple times
            if DEBUG: print("Already checked function and found its declaration: "+str(functionName[0])+" - Skipping...")
            return "" 
        # If we haven't check this identifier yet    
        else:
            # Add the identifier as additional value to the dict at the corresponding key and continue with the function
            alreadyCheckedIdentifierDict[str(functionName[1])].add(str(functionName[0]))
            if DEBUG: print("Checking new function in known file: "+str(functionName[0]))
        
    # If it's a new file, add the path as new key to our dict    
    else:
        # Add the path as new key and the name as new value (as part of a set)
        alreadyCheckedIdentifierDict[str(functionName[1])] = {str(functionName[0])}
        if DEBUG: print("Checking new function in new file: "+str(functionName[0]))

                            
    # Get the parent file of the current node (Callee)
    query = """g.V(%s).until(has('type', 'File')).repeat(__.in('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST')).id()""" % (verticeId)  
    parentFileId = db.runGremlinQuery(query)
       
    #Check if parent file is not empty (which is normally impossible)?
    
    # For real function calls
    if type == 'Callee':
        # Look in its AST children for a functionDef or macro with the given name (take care that the result is a visible statement)
        query = """g.V(%s).union(
            __.out().has('type', 'Function').has('code', '%s').out(),
            __.out().has('type', 'PreDefine').out().has('type', 'PreMacroIdentifier').out().has('type', 'Identifier').has('code', '%s').in(),  
            __.out().has('type', 'Function').out().out().has('type', 'PreDefine').out().has('type', 'PreMacroIdentifier').out().has('type', 'Identifier').has('code', '%s').in()            
        ).dedup().id()""" % (parentFileId[0], functionName[0], functionName[0], functionName[0])
             
    # For addressOf references
    else:     
        # Look in its AST children for a functionDef or global variable declaration with the given name (take care that the result is a visible statement)
        query = """g.V(%s).union(
            __.out().has('type', 'Function').has('code', '%s').out(),
            __.out().has('type', 'DeclStmt').out().has('identifier', '%s').in(),  
            __.out().has('type', 'StructUnionEnum').out().has('type', 'Identifier').has('code', '%s').in()            
        ).dedup().id()""" % (parentFileId[0], functionName[0], functionName[0], functionName[0])
                            
    
    # Run the query         
    sameFileDef = db.runGremlinQuery(query)
    
    # Stop here if we already found the definition
    if (len(sameFileDef) > 0):
        if DEBUG: print("Found def in same file: "+str(sameFileDef))
        return sameFileDef
    # If there is no function definition in the current file, check included files
    else:        
        # List that contains lists, 
        # where the first element of the inner list is the file id and all following elements are ids of needed include statements
        fileList = [[parentFileId[0]]]
                
        for file in fileList:   
            if DEBUG: print("File: "+str(file))
            # Look for include statements in the current file and add them to the fileList
            searchIncludesRecursively (file[0], file, fileList)
            
            # For real function calls
            if type == 'Callee':
                # Look for functiondef/decl/macro in included file
                query = """g.V(%s).union(
                    __.out().has('type', 'DeclStmt').out().has('identifier', '%s').in(),
                    __.out().has('type', 'PreDefine').out().has('type', 'PreMacroIdentifier').out().has('type', 'Identifier').has('code', '%s').in(),  
                    __.out().has('type', 'Function').has('code', '%s').out(),
                    __.out().has('type', 'Function').out().out().has('type', 'PreDefine').out().has('type', 'PreMacroIdentifier').out().has('type', 'Identifier').has('code', '%s').in()            
                ).dedup().id()""" % (file[0], functionName[0], functionName[0], functionName[0], functionName[0]) 
            # For addressOf references
            else:            
                # Look for a functionDef or variable declaration in included file                    
                query = """g.V(%s).union(
                    __.out().has('type', 'Function').has('code', '%s').out(),
                    __.out().has('type', 'DeclStmt').out().has('identifier', '%s').in(),  
                    __.out().has('type', 'StructUnionEnum').out().has('type', 'Identifier').has('code', '%s').in()            
                ).dedup().id()""" % (file[0], functionName[0], functionName[0], functionName[0])

            # Run the query            
            declResult = db.runGremlinQuery(query)        
             
            # If we found a declaration/definition    
            if len(declResult) > 0:
                if DEBUG: print("Found declaration: "+str(declResult))                      
                # Add decl to SU (here we replace the file id, as we also need the include statements that lead to the declaration)
                file[0] = declResult[0]
                # Stopp looking, as we found the desired decl
                return file        
        
        # Collect names of all functions for which we do not find a declaration inside the project, to prevent checking them several times
        if DEBUG: print("Could not find decl of: "+functionName[0]+" with id: "+str(verticeId)+" inside the project's code")
        externalFunctionsSet.add(functionName[0])
        return ""


# Helper function to find something in a file that is reached via includes and collect the needed include statements
def searchIncludesRecursively (rootFileID, currentIncludeChain, fileList):
    if DEBUG: print("Searching for included files of root file: "+str(rootFileID)) 
    # Get the include statements of a file that have PreIncludeLocalFile nodes as children
    query = """g.V(%s).out('IS_FILE_OF').has('type', 'PreInclude').where(out().has('type', 'PreIncludeLocalFile')).id()""" % (str(rootFileID))
    includes = db.runGremlinQuery(query)    
    
    if DEBUG: print("Found the following includes: "+str(includes))
    
    # Get the included file for each include statement
    for include in includes:   
        query = """g.V(%s).out().out('INCLUDES').id()""" % (str(include))
        fileID = db.runGremlinQuery(query)
        
        if len(fileID) > 0:
            if DEBUG: print("Found included file: "+str(fileID))
            
            # Check that we do not add a file twice
            fileAlreadyChecked = False
            for entry in fileList:
                if entry[0] == fileID[0]:
                    if DEBUG: print("Already checked "+str(fileID[0]))
                    fileAlreadyChecked = True
 
            if not fileAlreadyChecked:
                # Build the content of the fileList entry by adding the file id first and then the include statement, that includes this file
                fileListContent = [fileID[0], include]           
                
                # Then add content of currentIncludeChain (all includes up to the rootFile) without root file itself
                skipfirst = True
                for entry in currentIncludeChain:
                    if not skipfirst:
                        fileListContent.append(entry)
                    else: 
                        skipfirst = False                
                                                                 
                #Finally, add the new file with its include chain to the file list
                fileList.append(fileListContent)

  
    
# Return the ids of all callees for this function
def getCallsToFunction (verticeId):      
    # First: Get the name of the called function
    query = """g.V(%s).out().has('type', 'Identifier').values('code')""" % (verticeId)
    functionName = db.runGremlinQuery(query)
     
    # Go to the parent file of the current function node
    # Branch 1: Search in all children of this file for callees of the function
    # Branch 2: Look for include connections. Go from include to parent. Look in children for callee. If callee found, also add the include statement. 
    # Branch 3: Look for IS_HEADER_OF connections. Look for declares and store them.
    # Branch 3.2: Then follow includes. Go from include to parent. Look in children for callee. If callee found, also add the include and the declares statement.
    query = """g.V(%s).until(has('type', 'File'))
            .repeat(__.in('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST')).as('parentFileNode').
            union(
                until(has('type', 'Callee').has('code', '%s'))
                    .repeat(__.out('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST'))
                    .in('IS_AST_PARENT').in('IS_AST_PARENT').dedup().id().as('sameFileResult')
                ,__.in('INCLUDES').in('IS_AST_PARENT').as('result').in('IS_FILE_OF')
                    .until(has('type', 'Callee').has('code', '%s'))                        
                    .repeat(__.out('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST'))
                    .in('IS_AST_PARENT').in('IS_AST_PARENT').as('result').select('result').unfold().dedup().dedup().id()
                ,__.in('IS_HEADER_OF').as('hFile').out('IS_FILE_OF').has('type', 'DeclStmt').has('code', textContains('%s')).as('result')
                    .select('hFile').in('INCLUDES').in('IS_AST_PARENT').as('result').in('IS_FILE_OF')
                    .until(has('type', 'Callee').has('code', '%s'))                        
                    .repeat(__.out('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST'))
                    .in('IS_AST_PARENT').in('IS_AST_PARENT').as('result').select('result').unfold().dedup().dedup().id()       
            )         
            """ % (verticeId, functionName[0], functionName[0], functionName[0], functionName[0])  
            
    return db.runGremlinQuery(query)


# Get all statements that are connected via used and defined relations       
def getDefinesAndUses (verticeId):
    # USE edges and DEF edges
    # Here we can get results that do not appear in the code (e.g. Argument or Parameter nodes)
    query = """g.V(%s).both('USE','DEF').both('USE','DEF').simplePath().dedup().id()"""   % (verticeId)
    return db.runGremlinQuery(query)     
    

# Return all AST children except the CompoundStatement and the ElseStatement and their children  
def getInitAndCondition (verticeId):
    query = """g.V(%s).out('IS_AST_PARENT').has('type', without('CompoundStatement', 'ElseStatement')).emit().repeat(out('IS_AST_PARENT')).dedup().id()""" % (verticeId)
    return db.runGremlinQuery(query) 
    
# Return the If of an else statement    
def getIfStatement (verticeId):
    query = """g.V(%s).in('IS_AST_PARENT').has('type','IfStatement').dedup().id()""" % (verticeId)
    return db.runGremlinQuery(query)  

# Return the corresponding else-statement of an if-statement    
def getElse (verticeId):
    query = """g.V(%s).out('IS_AST_PARENT').has('type', 'ElseStatement').dedup().id()""" % (verticeId)
    return db.runGremlinQuery(query)    

# Return the corresponding #endif-statement of an #if-statement 
def getEndIf (verticeId):
    # Find the #endif
    query = """g.V(%s).until(has('type', 'PreEndIfStatement')).repeat(out('IS_AST_PARENT')).has('type', 'PreEndIfStatement').dedup().id()""" % (verticeId)   
    return db.runGremlinQuery(query)     
    
# Return the corresponding the condition of an #if/#elif-statement    
def getPreIfCondition (verticeId):
    # Get all AST childs that belong to the condition
    query = """g.V(%s).out('IS_AST_PARENT').has('type', 'PreIfCondition').emit().repeat(out('IS_AST_PARENT')).dedup().id()""" % (verticeId) 
    return db.runGremlinQuery(query) 

# Return the corresponding macro identifier of an #define/#undefine statement
def getMacroIdentifier (verticeId):
    query = """g.V(%s).out('IS_AST_PARENT').has('type', 'PreMacroIdentifier').dedup().id()""" % (verticeId) 
    return db.runGremlinQuery(query) 

# Return all statements that are connected to a macro identifier (uses and defines)    
def getRelationsToMacro (verticeId):
    # Get name result[0] and path result[1] of the macro
    query = """g.V(%s).out().has('type', 'Identifier').values('code','path')""" % (verticeId)
    tempResult = db.runGremlinQuery(query)    
       
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
            .select("result").unfold().dedup().dedup().id()
            """ % (verticeId, tempResult[0], tempResult[0])  
   
    return db.runGremlinQuery(query)     

###################################### Variability ###############################################################

# Return the blockstarter #if
def getPreIf (verticeId):
    # We need the __. before in, so Groovy doesn't confuse it with its own keyword in
    query = """g.V(%s).until(has('type', 'PreIfStatement')).repeat(__.in('IS_AST_PARENT')).dedup().id()""" % (verticeId)
    return db.runGremlinQuery(query) 
        
# Return all variable statements of the current node   
def getVariableStatements (verticeId):
    query = """g.V(%s).out('VARIABILITY').dedup().id()""" % (verticeId)
    return db.runGremlinQuery(query) 
    
# Return all variable statements of the current feature, this is done once in the beginning of the entry point is a feature   
def getFeatureBlocks (featureName):
    for currentNode in featureName:    
        # Find all #if/#elfif nodes that contain the name of the feature and all nodes that belong to the variability blocks
        query = """g.V().has('type', within('PreIfStatement','PreElIfStatement')).has('code', textContains('%s')).union(id(), out('VARIABILITY').dedup().id())""" % (currentNode)     
        result = db.runGremlinQuery(query)              
        
        if (len(result) == 0):
            print("##### Warning! No #if/#ifdef/#elif statements found for feature: "+currentNode+" #### \n")            

    return result              


######################################### Syntax Checking #################################################################

# Return parent function of a given set of node ids (can be empty)
def addParentFunctions ():
    if (DEBUG) : print("Checking for syntactic correctness...")    

    global semanticUnit
    # Get the compound statements and function definitions, add them to the SemanticUnit (without dupes)
    query = """idListToNodes(%s).repeat(__.in('IS_AST_PARENT').simplePath()).emit().union(
            __.has('type', 'FunctionDef').as('result'),
            __.has('type', 'CompoundStatement').as('result').out('IS_AST_PARENT').has('type', 'BlockCloser').as('result')
        ).select('result').unfold().dedup().id()"""  % (list(semanticUnit))   
   
    result = db.runGremlinQuery(query)       
    
    if (DEBUG) : print("Found additional nodes (FunctionDef and CompundStatement): "+str(result)+"\n")
    
    semanticUnit.update(result)

######################################### Variability Checking #################################################################

# Return parent variability information for each statement in the SemanticUnit (without further analysis)
def addVariability ():
    if (DEBUG) : print("Checking for variability information...")    

    global semanticUnit
    # Get the parent variability nodes, add them (and all connected AST elements) to the SemanticUnit (without dupes) 
    query = """idListToNodes(%s)
    .repeat(__.in('VARIABILITY').simplePath()).emit().dedup().as('result')
    .repeat(__.both('IS_AST_PARENT').simplePath().has('type', within('PreIfStatement','PreElIfStatement','PreElseStatement','PreEndIfStatement'))).emit().dedup().as('result')
    .select('result').unfold().dedup().id()""" % (list(semanticUnit))   
   
    result = db.runGremlinQuery(query)       
    
    if (DEBUG) : print("Found additional variability nodes (#ifdef etc): "+str(result)+"\n")
    
    semanticUnit.update(result)
    
######################################### Comment Checking #################################################################

# Return parent comment for each statement in the SemanticUnit (without further analysis)
def addComments ():
    if (DEBUG) : print("Checking for comments...")    

    global semanticUnit
    # Get the parent comment nodes, add them to the SemanticUnit (without dupes)
    query = """idListToNodes(%s).in('COMMENTS').dedup().id()""" % (list(semanticUnit))   
   
    result = db.runGremlinQuery(query)       
    
    if (DEBUG) : print("Found additional comment nodes: "+str(result)+"\n")
    
    semanticUnit.update(result)

######################################### External Libraries Checking #################################################################

# Saves the ids of all file nodes that have children who are part of the SU (as the filenodes itself are normally not part of the SU)
def getSUsFileNodes ():
    if (DEBUG) : print("Checking for SU's files...")    

    global semanticUnit, SUFilesSet
    # Go to the parent file nodes of all functionDefs or declares
    query = """idListToNodes(%s).union(
        has('type', 'FunctionDef').in(),
        has('type', 'StructUnionEnum'),
        has('type', 'DeclStmt'),
        has('type', 'PreDefine'),
        has('type', 'PreUndef'),
        has('type', 'PreIfStatement'),
        has('type', 'PreInclude')
        ).in().has('type', 'File').dedup().id()""" % (list(semanticUnit))   
   
    result = db.runGremlinQuery(query)       
    
    if (DEBUG) : print("Found files of SU: "+str(result)+"\n")
    print("Found files of SU: "+str(result)+"\n")
    
    SUFilesSet.update(result)


# Return all include statements for each file of the SU that includes external libraries
def addExternalIncludes ():
    if (DEBUG) : print("Checking for external includes...")    

    global semanticUnit, SUFilesSet
    # Go to the parent file nodes of all functionDefs, then get all includes that include libraries (nodes who don't have an AST child ) and add them to the SU
    query = """idListToNodes(%s).out('IS_FILE_OF').has('type', 'PreInclude').where(not(out('IS_AST_PARENT'))).id()""" % (list(SUFilesSet))   
   
    result = db.runGremlinQuery(query)       
    
    if (DEBUG) : print("Found additional includes of libraries: "+str(result)+"\n")
    
    semanticUnit.update(result)

######################################### Global Variable Declarations Checking #################################################################  

# Add global declarations of variables that are declared in files that are part of the SU and used and least only once inside the SU (probably)   
def addUsedGlobalDeclares():    
    print("Currently nothing happens here...")
#Check if we need additional declarations, when a variable reuses another?  
  
# Add all global declarations of variables that are declared in files that are part of the SU        
def addGlobalDeclares(): 
    if (DEBUG) : print("Checking for global variable declarations...")    
    print("Checking for global variable declarations...") 

    global semanticUnit, SUFilesSet
    # For all files that are part of the SU, get declarations of global variables
    
    # First all StructUnionEnum, as they are easy to get
    query = """idListToNodes(%s).out().has('type', 'StructUnionEnum').id()""" % (list(SUFilesSet))  
    aResult = db.runGremlinQuery(query)   
    semanticUnit.update(aResult) 
    
    if (DEBUG) : print("Found additional global variable declarations: "+str(aResult)+"\n")
    print("Found additional global variable declarations: "+str(aResult)+"\n")
    
    # Then we look for all other variable declarations. As the text filters do not really work, we first get all other declStmts
    query = """idListToNodes(%s).out().has('type', 'DeclStmt').as('V').id().as('id').select('V').out().values('completeType').as('ct').select('id','ct')""" % (list(SUFilesSet))  
    bResult = db.runGremlinQuery(query)
    # Here we filter out all nodes whose completeType contains a bracket (or should we filter out nodes that end with a closing bracket?)  
    for line in bResult: 
        if not "(" in line['ct']:
            semanticUnit.update(str(line['id']))
  
            if (DEBUG) : print("Found additional global variable declarations: "+str(line['id'])+"\n")
            print("Found additional global variable declarations: "+str(line['id'])+"\n")
    

    
###################################### Statistics ############################################################### 

def countNodes():
    # Count nodes of whole project
    query = "g.V().count()"
    statResult = db.runGremlinQuery(query) 
    print("The whole project has "+str(statResult[0])+" nodes.")
    # Count nodes of whole project that are visible (query is a little more complex because some nodes have visible types but are contained in other visible parent nodes)
    query = """g.V().has('type', within(%s))
    .not(has('type', 'IdentifierDeclStatement').in(AST_EDGE).has('type', within('ForInit','StructUnionEnum')))
    .dedup().count()""" % (visibleStatementTypes) 
    statResult = db.runGremlinQuery(query) 
    print(str(statResult[0])+" of them are visible and directly appear as lines of code (top nodes).")
    # Count nodes of SU
    print("The SU has "+str(len(semanticUnit))+" nodes.")
    # Count nodes of SU that are visible
    query = """idListToNodes(%s).has('type', within(%s))
    .not(has('type', 'IdentifierDeclStatement').in(AST_EDGE).has('type', within('ForInit','StructUnionEnum')))
    .dedup().count()""" % (list(semanticUnit), visibleStatementTypes) 
    statResult = db.runGremlinQuery(query) 
    print(str(statResult[0])+" of them are visible and directly appear as lines of code (top nodes).")
    print("--------------------------------------------------------------------------------- \n")

   
###################################### Input ###############################################################    

# Let the user interactively set the project and entry points via console inputs
def consoleInput ():
    global entryFeatureNames, entryPointIds, projectName
    
    print("--------------------------------------------------------------------------------- \n")
    print("Starting with project selection...")    
    
    currentDirname = os.getcwd()
    dataDirname = currentDirname.replace("/customScripts","/projects/octopus/data/projects")
    
    while True:

        # r=root, d=directories, f = files (only output the top level folder names)
        for r, d, f in os.walk(dataDirname):
            print("The following projects are currently in the database:")
            projectNames = d
            print(projectNames)
            break
            
        selectedProject = input("\nPlease type in the name of the project you would like to analyze  \n")
        
        # Only allow existing projects
        if (len(selectedProject) > 0 and selectedProject in projectNames):
            print("Current project is set to \""+selectedProject+"\"\n")
            projectName = selectedProject
            #Connect to DB
            db.connectToDatabase(projectName)
            break
        else:
            print("Please type in a valid project name \n")
    
    print("--------------------------------------------------------------------------------- \n")
    print("Starting with entry point selection...")
    
    # Feature or statement as entry point?
    while True:
        selection = input("Do you want to start with a feature/configuration option (1) or a code statement (2) ? \n")      
        
        # Feature
        if (selection == "1" or selection == "(1)" or selection == "feature" or selection == "configuration option"):
            feature = input("Please type in the name of the feature/configuration option \n")
            print("You selected \""+feature+"\" as entry point \n")
            entryFeatureNames = {feature}
            entryPointIds = set()
            break;
            
        # Statement input loop
        elif (selection == "2" or selection == "(12)" or selection == "code" or selection == "statement" or selection == "code statement"):
            while True:
                statementPath = input("Please type in the path to the file containing the statement you would like to analyze relative to the project root \""+selectedProject+"\" e.g., \"/src/functions/FileContainingEntryPoint.c\"\n")
                statementLine = input("Please type in the line number of your statement \n")
                query = """g.V().has('path', textContains('%s')).has('line', '%s').or(
                __.has('isCFGNode'),
                __.in().has('type', 'File'),
                __.has('type', within('PreElIfStatement','PreElseStatement','PreEndIfStatement','FunctionDef'))
                ).union(values('path', 'code', 'type').fold(), id())""" % (statementPath, statementLine) 
                result = db.runGremlinQuery(query)
                                
                
                if(len(result) > 0):
                    print("The following statement(s) match(es) your request: \n")
                    print("##########################################################")
                    # Print the statement properties together with their id (the strange loop is due to the result structure)
                    for index, item in enumerate(result):
                        if ((index < len(result)-1) and (index % 2 == 0)):
                            print("Statement: "+str(item)+" with id: "+str(result[index+1]))     
                    print("########################################################## \n")   
                    
                    # Id input loop
                    while True:
                        selectedID = input("Please type in the id of the statement you would like to analyze \n")   
                        if( selectedID.isdigit()):  
                            #Check if the id exists    
                            query = """g.V(%s)""" % (selectedID) 
                            result = db.runGremlinQuery(query)
                            if (len(result) > 0):
                                print("You selected \""+selectedID+"\" as entry point \n")
                                entryFeatureNames = set()
                                entryPointIds = {int(selectedID)}    
                                # Stop the id input loop if we get valid results        
                                break
                            else:    
                                print(selectedID+" is not a valid existing ID. Please try again.")                          
                        else:
                            print("Please insert a valid number")
                        
                    # Stop the statement input loop if we get valid results        
                    break
                else:
                    print(" ### No results found. Please try again ### \n")

            # Break for the first while (feature or statement)   
            break;
            
        # Wrong entry
        else:
            print("Please select option (1) or (2)")
    
    print("--------------------------------------------------------------------------------- \n")
    

###################################### Output ###############################################################


# Output of the code of the Semantic Unit        
def codeOutput ():
    code = ['']
    for verticeId in semanticUnit: 
        query = """g.V(%s).values('code')""" % (verticeId)
        code.append(db.runGremlinQuery(query)) 
    
    for x in code: print(x)
    
# Output of the vertices of the Semantic Unit        
def nodeOutput ():
    code = ['']
    for verticeId in semanticUnit: 
        query = """g.V(%s)""" % (verticeId)
        code.append(db.runGremlinQuery(query)) 
    
    for x in code: print(x)
    
def fileOutput ():    
    #Get visible node ids of semanticUnit 
    if(generateOnlyVisibleCode):
        print("Get visible AST nodes")
        nodes = getVisibleASTNodes()      
    else:
        print("Code output is only available if --generateOnlyVisibleCode-- is selected")
   
        
    with open('Results/result.txt', 'w') as file_handler:
        file_handler.write(projectName+"\n")
        for item in semanticUnit:
            file_handler.write("{}\n".format(item))
   
####################################### Plotting ###############################################    
 
# Plots the results    
def plotResults ():
    # Get plot configuration
    plot_configuration = PlotConfiguration()
    #Config is read from plotconfig.cfg in same folder as SUI.py
    f = open((os.path.join(os.path.dirname(__file__), 'plotconfig.cfg')) , "r")
    plot_configuration.parse(f)
    labels = ["IS_AST_PARENT"] 
    
    #Get nodes of semanticUnit (either as AST or full property graph)
    if(generateOnlyVisibleCode):
        if (DEBUG) : print("Get visible AST nodes")
        nodes = getVisibleASTNodes()    
    elif (generateOnlyAST):
        if (DEBUG) : print("Get AST nodes")
        nodes = getASTNodes()        
    else:
        if (DEBUG) : print("Get nodes")
        nodes = getNodes()    

    #Get edges of semanticUnit (either only structural or all)
    if(showOnlyStructuralEdges):
        if (DEBUG) : print("Get structural edges")
        edges = getASTEdges()   
    else:    
        if (DEBUG) : print("Get edges")
        edges = getEdges()

    #Make the graph
    if (DEBUG) : print("Make graph")
    G = pgv.AGraph(directed=True, strict=False)
    if (DEBUG) : print("_addNodes")
    addNodes(plot_configuration, G, nodes)
    if (DEBUG) : print("_addEdges")
    if (len(edges) > 0):
        addEdges(plot_configuration, G, edges)
    #Output result
    output(G)  

# Returns all AST vertices of the SemanticUnit    
def getASTNodes():
    global semanticUnit 
    # Remove unneeded nodes
    query = """idListToNodes(%s).not(has('type', within('Symbol','CFGExitNode','CFGEntryNode'))).dedup().id()""" % (list(semanticUnit))  
    result = db.runGremlinQuery(query)
    # Update SU so that only the ids of the relevant nodes are inside (needed for fileOutput)
    semanticUnit = result
    # Get the whole nodes, not only the ids
    query = """idListToNodes(%s)""" % (list(result))  
    result = db.runGremlinQuery(query)
    return result    
    
# Returns all AST vertices of the SemanticUnit that directly appear in the code (CFG nodes or direct children of file nodes)    
def getVisibleASTNodes():
    global semanticUnit 
    # Remove unneeded nodes
    query = """idListToNodes(%s).has('type', within(%s))
        .not(has('type', 'IdentifierDeclStatement').in(AST_EDGE).has('type', within('ForInit','StructUnionEnum')))
        .dedup().id()""" % (list(semanticUnit), visibleStatementTypes)  
    result = db.runGremlinQuery(query)
    # Update SU so that only the ids of the relevant nodes are inside (needed for getEdges and fileOutput)
    semanticUnit = result
    # Get the whole nodes, not only the ids
    query = """idListToNodes(%s)""" % (list(result))  
    result = db.runGremlinQuery(query)
    return result    

# Returns all vertices of the SemanticUnit    
def getNodes():
    query = """idListToNodes(%s)""" % (list(semanticUnit))  
    return db.runGremlinQuery(query)
           
# Returns all AST edges of the Semantic Unit    
def getASTEdges():
    # Get all incoming edges that are part of the AST  
    query = """idListToNodes(%s).inE('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST','IS_PARENT_DIR_OF','VARIABILITY', 'DECLARES', 'INCLUDES', 'IS_HEADER_OF', 'COMMENTS')""" % (list(semanticUnit))   
    return db.runGremlinQuery(query)
    
# Returns all edges of the Semantic Unit    
def getEdges():
    # Get all incoming edges 
    query = """idListToNodes(%s).inE()""" % (list(semanticUnit))    
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

# Writes output as .dot and .png in a folder named SemanticUnit                    
def output(G):
    #Formatting
    outputString = '// SemanticUnit \n'
    outputString += str(G) + '\n'
    outputString += '//###' + '\n'

    #Create folder with name of project (if its not already there)
    if not os.path.exists("SemanticUnit"):
        os.makedirs("SemanticUnit")
    #Filename contains the project name, the current function name and the graph type
    filename = 'SemanticUnit.dot'
    
    #Write to file
    print("Making of graph finished, creating "+filename+" ...")
    print("--------------------------------------------------------------------------------- \n")

    file = open("SemanticUnit/SemanticUnit.dot", 'w')
    file.write(outputString)
    file.close()
    
    # Use terminal output to convert .dot to .png
    os.system("dot -Tpng 'SemanticUnit/SemanticUnit.dot' -o 'SemanticUnit/SemanticUnit.png'")
    #Print status update
    print("Creation of plot was successfull!")    
    
    
################################################### Start of program #################################################################
#Initialize DB interface
db = DBInterface()

# Input of entry points
if (console):
    consoleInput()
else: 
    # projectName must be set manually
    print("* * * Please set project name and entry point manually (or set console to 'True') in the SUI.py * * * ")
    db.connectToDatabase(projectName)
    print("Project is set to: "+projectName)

# Start identification process    
identifySemanticUnits() 
    