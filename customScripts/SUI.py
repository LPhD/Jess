#!/usr/bin/env python3
import os
import pygraphviz as pgv
import ntpath

from octopus.server.DBInterface import DBInterface
from joern.shelltool.PlotConfiguration import PlotConfiguration
from joern.shelltool.PlotResult import NodeResult, EdgeResult

####### Configuration options #################
generateOnlyAST = True
generateOnlyVisibleCode = True
includeEnclosedCode = True
connectIfWithElse = True
searchDirsRecursively = True
includeOtherFeatures = False
DEBUG = True
###############################################


# Connect to project DB
#projectName = 'JoernTest.tar.gz'
#projectName = 'EvoDiss.tar.gz'
#projectName = 'Revamp'
projectName = 'SPLC'
db = DBInterface()
db.connectToDatabase(projectName)

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
entryPointIds = set()
entryFeatureNames = {'analogueSender'}
# Initialize empty Semantic Unit (result) set
semanticUnit = set()
# Initialize empty set of checked vertices (because we only need to check the vertices once)
checkedVertices = set()
# Initialize empty set of vertices that will be checked
analysisList = list()


# Main function 
def identifySemanticUnits ():
# Check if a feature is selected as entry point
    if (len(entryFeatureNames) > 0):        
        result = set(getFeatureBlocks(entryFeatureNames))
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
        

    # Adapt results for syntactical correctness
    # Add the function definition for CFG nodes 
    addParentFunction()      
    # Get the #ifndef #def and #endif for header files?
    
    print("Analysis finished, making graph...")
    print("--------------------------------------------------------------------------------- \n")

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


####################################### Rules ###############################################   


# Main function (recursively called). Decides based on the vertice type, what methods are called 
# The currentEntryPoints are always added to the Semantic Unit
def analyzeNode (currentNode):
    # Reset current result
    result = ""       
    
    # Get type of current vertice 
    query = """g.V(%s).values('type')""" % (currentNode)
    type = db.runGremlinQuery(query)   

    if (DEBUG) : print("Check current node: "+str(currentNode)+" with type: "+str(type))    
    
    # Inform the user if a node id does not exist
    if(len(type)< 1):
        print("No vertice with the given id found. Please check your database for an existing vertice id.")

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
        
    # Get all enclosed lines of code if current vertice is a File
    if (type[0] == "File"):
        result = set(getEnclosedCodeOfFile(currentNode))
        # For every enclosed code line, get related elements
        analysisList.extend(result)
                  
    # Get enclosed vertices if current vertice is a function declaration
    if ((type[0] == "FunctionDef") and (includeEnclosedCode == True)):
        result = set(getASTChildren(currentNode))           
        # For each enclosed vertice, add to the Semantic Unit and get related elements
        analysisList.extend(result)         
        
    # Get enclosed vertices if current vertice is a for-, while- or if-statement
    if ((type[0] in ["IfStatement","ForStatement","WhileStatement"]) and (includeEnclosedCode == True)):             
        result = set(getASTChildren(currentNode))
        # For each enclosed vertice, add to the Semantic Unit and get related elements
        identifySemanticUnits (result)
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
                   
    # Get the corresponding if, if current vertice is an else-statement
    if (type[0] == "ElseStatement"):            
        result = set(getIfStatement(currentNode))
        if (includeEnclosedCode):
            result.update(set(getASTChildren))
        # Get related elements of the if/else-statement
        analysisList.extend(result)         

    # Get the AST children and the parent function if current vertice is an expression statement
    if (type[0] == "ExpressionStatement"):                       
        result = set(getASTChildren(currentNode))
        # Get related elements of the AST children
        analysisList.extend(result)          
        
##################################################################################################################           
################################### Call relations ############################################################### 
       
    # Get called function if current vertice is a callee
    if (type[0] == "Callee"): 
        # Do not look at CallExpression, one query is enough. We will always have both the Callee and 
        #the CallExpression in the analysis set, see handling of ExpressionStatement above.
                   
        result = set(getCalledFunctionDef(currentNode))
        # Get related elements of the called function
        analysisList.extend(result)
        
    # Get macro identifier    
    if (type[0] in ["PreUndef","PreDefine"]):    
        result = set(getMacroIdentifier(currentNode))
        analysisList.extend(result)

    # Get all statements (limited to preprocessor and function-like macro calls) connected to the PreMacroIdentifier     
    if (type[0] == "PreMacroIdentifier"):  
        result = set(getRelationsToMacro(currentNode))
        analysisList.extend(result)

        
##################################################################################################################
################################## Define relations ##############################################################
        
    # Get function definition vertice if current vertice is a function 
    if (type[0] == "Function"):
        result = set(getFunctionDefOut(currentNode))           
        # Add FunctionDef to the Semantic Unit and get related elements
        analysisList.extend(result)
    
    # Get definition of the element that contains the condition or parameter
    # We need this for identification of statements that are connected to a #define       
    if (type[0] in ('Condition', 'PreIfCondition', 'Parameter', 'ParameterList')):
        result = set(getParent(currentNode))
        # Add FunctionDef to the Semantic Unit and get related elements
        analysisList.extend(result)


##################################################################################################################
##################################### Data Flow ##################################################################   

    # Get all statements that are connected via used and defined relations
    if (type[0] in ["ForInit", "IdentifierDeclStatement", "Parameter", "AssignmentExpression", "ExpressionStatement", "Argument", "ArgumentList", "Condition", "UnaryExpression", "ReturnStatement"]):
        # Maybe some types are missing, needs further testing
        result = set(getDefinesAndUses(currentNode))
        # Get related elements of the called function
        analysisList.extend(result)
    
        
####################################################################################################################
#################################### Variability ##################################################################          
         
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
   
   
    #Get enclosed vertices if current vertice is a pre-else-statement     
    if (type[0] == "PreElseStatement"):
        # Get variable statements
        result = set(getVariableStatements(currentNode))
        # Get the starting #if
        result.update(set(getPreIf(currentNode)))                        
        # For each enclosed vertice, add to the Semantic Unit and get related elements
        analysisList.extend(result)
        
    #Get enclosed vertices if current vertice is a pre-endif-statement     
    if (type[0] == "PreEndIfStatement"):
        # Get the starting #if and add it to the semanticUnit
        semanticUnit.update(set(getPreIf(currentNode)))    


##############################################################################################################################
#################################### No impact analysis, just call (backward) analysis  ######################################                

    # Get all AST childs and analyze them      
    if (type[0] in["PreDiagnostic", "PreOther", "PreLine", "PrePragma"]):
        result = set(getASTChildren(currentNode))
        analysisList.extend(result)
                
#####################################################################################################################
#################################### End of rules  ##################################################################                     

    if (DEBUG): print("Result: "+str(result)+"\n")
    
    # Do nothing for (as intended):
    # PreInclude, PreIncludeNext (included file possible, but why not just give the file as entry point?)
    ################# No meaningful connections, no direct appearence in the code, already contained in other analyses ##################
    # 'Identifier' i 
    # 'CompoundStatement' empty container object 
    # 'IncDec' ++
    # 'UnaryOperator' !
    # 'AdditiveExpression' a + b
    # 'PrimaryExpression' 1
    # 'UnaryOperationExpression' - 1
    # 'ReturnType' void
    # 'ForInit' i = 0
    # 'CFGEntryNode' ENRTY
    # 'CFGExitNode' EXIT
    # 'InitializerList' 7 (size of list)
    # 'PreMacroParameters' parameters of a function-like macro
    # 'PreMacro' the macro content
    ####################### Already contained in other analyses ###############################################
    # 'Symbol' (already contained in the dataflow analysis)
    # 'IdentifierDeclType' int (contained in IdentifierDeclStatement)
    # 'IdentifierDecl' i (contained in IdentifierDeclStatement)
    # 'ParameterType' int (contained in ParameterList)
    # 'RelationalExpression' i > 5 (contained in condition)
    # 'ArrayIndexing' array[1]           
            
    #Problems: 
        # Global variables 
        # ++ i in for (not a real problem, as it is always inside for. But what if method is called?
        # ++ i in general is not working, only identified as UnaryExpression but not as ExpressionAssignment
                
    # Do something for every type where it is necessary
    # TODO: Missing types from /jpanlib/src/main/java             
        # 'Sizeof' empty?
        # 'SizeofOperand' empty?
        # 'Decl' empty?
        # 'DeclStmt' empty?


################################ Definition of helper methods ########################################################     
        
# Return all vertices of type file that belong to the given directory (not recursive)        
def getIncludedFiles (verticeId):
    query = """g.V(%s).out().has('type', 'File').id()""" % (verticeId)
    return db.runGremlinQuery(query)
    
# Return all vertices of type file and directory that belong to the given directory (recursive)        
def getIncludedFilesAndDirectories (verticeId):
    query = """g.V(%s).out().has('type', within('File', 'Directory')).id()""" % (verticeId)
    return db.runGremlinQuery(query)    
       
# Return all AST vertices and their children that belong to the given file 
def getEnclosedCodeOfFile (verticeId):
    query = """g.V(%s).emit().repeat(out('AST_EDGE','VARIABILITY','IS_FILE_OF','IS_FUNCTION_OF_AST')).id()""" % (verticeId)
    return db.runGremlinQuery(query)   
           
# Return function definition vertice of a given function
def getFunctionDefOut (verticeId):
    query = """g.V(%s).out().has('type', 'FunctionDef').id()""" % (verticeId)
    return db.runGremlinQuery(query)        

# Return AST parent of a given node (can be empty)
def getParent (verticeId):
    query = """g.V(%s).out(AST_EDGE).id()""" % (verticeId)
    return db.runGremlinQuery(query)                 

# Return all AST children vertice ids of the given vertice
def getASTChildren (verticeId):
    query = """g.V(%s).emit().repeat(out(AST_EDGE)).unfold().id()""" % (verticeId)
    return db.runGremlinQuery(query)
    
# Return the called function id
def getCalledFunctionDef (verticeId):
### We do it like that because there is no explicit link from callee to called function. ####
### Runs into problems if there is more than one function with the given name ###############

    # Get name of the called function
    query = """g.V(%s).out().has('type', 'Identifier').values('code')""" % (verticeId)
    result = db.runGremlinQuery(query)   
         
    # Get the id of the called function (parent of identifier with code from result of last query)
    query = """g.V().has('type', within('PreMacroIdentifier', 'Identifier')).has('code', '%s')
        .in().has('type', within('FunctionDef', 'PreDefine')).id()""" % (result[0])
    result = db.runGremlinQuery(query)     

    # Check if result is in DB (could also be a C function like puts())
    if (len(result) > 0):   
        # Check whether target and callee are in the same file
        query = """g.V(%s).values('location')""" % (result[0])
        locationTarget = db.runGremlinQuery(query) 
        #Get only the filename 
        locationTargetFile = ntpath.basename(locationTarget[0])
        locationTargetFile = locationTargetFile.split(' ,', 1)[0]
        query = """g.V(%s).values('location')""" % (verticeId)
        locationCallee = db.runGremlinQuery(query)
        #Get only the filename 
        locationCalleeFile = ntpath.basename(locationCallee[0])
        locationCalleeFile = locationCalleeFile.split(' ,', 1)[0]
        
        # Look for includes and add them to the semanticUnit
        if (locationCallee != locationTarget):      
            query = """g.V().has('location', textContains('%s')).has('type', 'PreInclude').has('code', textContains('%s')).id()""" % (locationCalleeFile, locationTargetFile)
            result2 = db.runGremlinQuery(query)
            
            if(set(result2) in semanticUnit):
                    print("Already contained in SU!")         
            
            semanticUnit.update(set(result2))           
            
        return result
    else:
        return ""
              

# Get all statements that are connected via used and defined relations       
def getDefinesAndUses (verticeId):
    # USE edges and DEF edges
    # Here we can get results that do not appear in the code (e.g. Argument or Parameter nodes)
    query = """g.V(%s).both('USE','DEF').both('USE','DEF').simplePath().id()"""   % (verticeId)
    return db.runGremlinQuery(query)     
    

# Return all AST children except the CompoundStatement and the ElseStatement and their children  
def getInitAndCondition (verticeId):
    query = """g.V(%s).out(AST_EDGE).has('type', without('CompoundStatement', 'ElseStatement')).emit().repeat(out(AST_EDGE)).id()""" % (verticeId)
    return db.runGremlinQuery(query) 
    
# Return the If of an else statement    
def getIfStatement (verticeId):
    query = """g.V(%s).in(AST_EDGE).has('type','IfStatement').id()""" % (verticeId)
    return db.runGremlinQuery(query)  

# Return the corresponding else-statement of an if-statement    
def getElse (verticeId):
    query = """g.V(%s).out(AST_EDGE).has('type', 'ElseStatement').id()""" % (verticeId)
    return db.runGremlinQuery(query)    

# Return the corresponding #endif-statement of an #if-statement 
def getEndIf (verticeId):
    # Find the #endif
    query = """g.V(%s).until(has('type', 'PreEndIfStatement')).repeat(out(AST_EDGE)).has('type', 'PreEndIfStatement').id()""" % (verticeId)   
    return db.runGremlinQuery(query)     
    
# Return the corresponding the condition of an #if/#elif-statement    
def getPreIfCondition (verticeId):
    # Get all AST childs that belong to the condition
    query = """g.V(%s).out(AST_EDGE).has('type', 'PreIfCondition').emit().repeat(out(AST_EDGE)).id()""" % (verticeId) 
    return db.runGremlinQuery(query) 

# Return the corresponding macro identifier of an #define/#undefine statement
def getMacroIdentifier (verticeId):
    query = """g.V(%s).out(AST_EDGE).has('type', 'PreMacroIdentifier').id()""" % (verticeId) 
    return db.runGremlinQuery(query) 

# Return all statements that are connected to a macro identifier (uses and defines)    
def getRelationsToMacro (verticeId):
    # Get name result[0] and location result[1] of the macro
    query = """g.V(%s).values('code','location')""" % (verticeId)
    result = db.runGremlinQuery(query) 
    result[1] = result[1].split(',', 1)[0]    
    #print(result[0])
    #print(result[1])
    #look for macro identifier in the same file
    # Could be something else than direct parent (condition?)
    # Same location as file
    #query = """g.V().has('location', textContains('%s')).has('type', 'PreMacroIdentifier').has('code', '%s').in(AST_EDGE).id()""" % (result[1], result[0])
    # Look for all occurences? Or only identifiers?
    #query = """g.V().has('location', textContains('%s')).has('type', within('PreMacroIdentifier', 'Identifier')).has('code', '%s').in(AST_EDGE).id()""" % (result[1], result[0])
    # All occurences? 
    query = """g.V().has('location', textContains('%s')).has('code', '%s').until(has('isCFGNode')).repeat(__.in(AST_EDGE)).emit().id()""" % (result[1], result[0])    
    # If identifier (Callee oder Condition (mehr parents) -> Bis zum Statement im Code
    # Until .inE(isFileOf) oder has('isCFGNode')
    #look for macro identifier in files that include the file of the #define
    #print(query)
              
    
    return db.runGremlinQuery(query)     

###################################### Variability ###############################################################

# Return the blockstarter #if
def getPreIf (verticeId):
    # We need the __. before in, so Groovy doesn't confuse it with its own keyword in
    query = """g.V(%s).until(has('type', 'PreIfStatement')).repeat(__.in(AST_EDGE)).id()""" % (verticeId)
    return db.runGremlinQuery(query) 
        
# Return all variable statements of the current node   
def getVariableStatements (verticeId):
    query = """g.V(%s).out('VARIABILITY').id()""" % (verticeId)
    return db.runGremlinQuery(query) 
    
# Return all variable statements of the current feature, this is done once in the beginning of the entry point is a feature   
def getFeatureBlocks (featureName):
    finalResult = set()
    
    for currentNode in featureName:   
    ###one query?   
        # Find all #if/#elfif nodes that contain the name of the feature
        query = """g.V().has('type', within('PreIfStatement','PreElIfStatement')).has('code', textContains('%s')).id()""" % (currentNode)
        result = db.runGremlinQuery(query) 
        # Add the #if/#elif nodes to the final result        
        finalResult.update(result)
        # Remove brackets to allow direct injection into a query
        result = repr(result)
        result = result.replace("[","")
        result = result.replace("]","")
        # Find all nodes that belong to the variability blocks
        query = """g.V(%s).out('VARIABILITY').id()""" % (result)
        finalResult.update(set(db.runGremlinQuery(query)))
              
    return finalResult  

######################################### Syntax Checking #################################################################

# Return parent function of a given set of node ids (can be empty)
def addParentFunction ():
    if (DEBUG) : print("Checking for syntactic correctness...")
    
    global semanticUnit
    # Get the compound statements and add them to the SemanticUnit (without dupes)
    query = """idListToNodes(%s).has('isCFGNode').in(AST_EDGE).has('type', 'CompoundStatement').dedup().id()""" % (list(semanticUnit))   
    result = db.runGremlinQuery(query)
    
    if (DEBUG) : print("Found additional nodes (CompoundStatement): "+str(result))
    
    if(set(result) in semanticUnit):
        print("Already contained in SU!")
        
    semanticUnit.update(result)   
    
    # Get the function definitions and add them to the SemanticUnit (without dupes)
    query = """idListToNodes(%s).in(AST_EDGE).has('type', 'FunctionDef').dedup().id()""" % (list(semanticUnit))    
    result = db.runGremlinQuery(query)
    
    if (DEBUG) : print("Found additional nodes (FunctionDef): "+str(result)+"\n")
    
    semanticUnit.update(result)

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
    #Get node ids of semanticUnit (either as only AST or full property graph)
    if (generateOnlyAST):
        if(generateOnlyVisibleCode):
            print("Get visible AST nodes")
            nodes = getVisibleASTNodes()      
        else:
            print("Get AST nodes")
            nodes = getASTNodes()    
        
    with open('result.txt', 'w') as file_handler:
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
    
    #Get nodes and edges of semanticUnit (either as AST or full property graph)
    if(generateOnlyVisibleCode):
        if (DEBUG) : print("Get visible AST nodes")
        nodes = getVisibleASTNodes()    
        if (DEBUG) : print("Get visible edges")
        edges = getASTEdges() 
    elif (generateOnlyAST):
            if (DEBUG) : print("Get AST nodes")
            nodes = getASTNodes()    
            if (DEBUG) : print("Get AST edges")
            edges = getASTEdges()    
    else:
        if (DEBUG) : print("Get nodes")
        nodes = getNodes()    
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
    query = """idListToNodes(%s).not(has('type', within('Symbol','CFGExitNode','CFGEntryNode'))).id()""" % (list(semanticUnit))  
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
    # CompoundStatement is included for a better visualization (nesting), it is not needed for patch generation
    query = """idListToNodes(%s).not(has('type', within('Symbol','CFGExitNode','CFGEntryNode', 'Parameter'))).or(__.has('isCFGNode'),__.in().has('type', 'File'),__.has('type', within('PreElIfStatement','PreElseStatement','PreEndIfStatement','FunctionDef','CompoundStatement'))).id() """ % (list(semanticUnit))  
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
    query = """idListToNodes(%s).inE('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST','IS_PARENT_DIR_OF','VARIABILITY')""" % (list(semanticUnit))   
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

# Start identification process    
identifySemanticUnits() 
    