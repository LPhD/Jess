Semantic Unit Identification
==========================

INTRODUCTION
--------------

The use case of the Semantic Unit Identification (SUI) process is to automatically migrate useful changes among a product line and separated products. These changes can be assigned to Semantic Units.

A Semantic Unit consists of semantically related lines of code. Semantically related means, that there is a common purpose belonging to the related code. This purpose can for example be defined by a test case. Thus, all code that is needed to make a test case pass belongs to one Semantic Unit.

We need a user-given entry point do identify a Semantic Unit, because the user decides which useful changes should be migrated. The idea is, that the user selects only one line of code  (e.g., a method declaration or an assert statement from a test case) or a generic string/identifier/feature name (e.g., "FORWARDSEARCH") as entry point. Based on this selection, the proposed approach identifies all semantically related lines of code and, hence, the Semantic Unit.

Depending on the entry point, there are different possibilities of what should belong to the Semantic Unit. For example, when the user selects a line of code with an if-statement. Does a following else-statement also belong to the Semantic Unit? This decision is arguable, so the user should have the possibility to configure the desired behavior. The next sections describe the general idea, the input and output relations, the configurable decisions and the default configuration of the SUI process.

GENERAL IDEA
--------------

The SUI process identifies semantically related lines of code based on one or more given entry points. The underlaying structure of the process is a graph database, consisting of AST (Abstract Syntax Tree) elements and several different relations among them. These relations are not only AST relations (is parent of), but also data flow (uses, defines), variability (code annotated with #ifdefs), and control flow (controls) relations. Furthermore, the process takes into account the specific C relations, where a header file can exist for a C file (is header of), and where the content of a file can be included by another file (includes).

-**Input:** AST Element(s): Entry Point(s) (Either defined by a location, an identifier or generic string, or the name of a configuration option)

-**Output:** AST Element(s): Semantic Unit (including the relations among their elements)

-**Function:** Set(Entry Point) -> Set(Semantic Unit) | There is a relation among all elements


INPUT/OUTPUT RELATIONS
--------------

The selected elements of the Semantic Unit (output) depend on the type (location/string/identifier/feature) of the given entry point (input). Furthermore, the related nodes to one node are selected based on the node-type of this node. All type-based decisions and the resulting input and output relations are listed below and described in form of Input Type -> Resulting Output. Some of these decisions are configurable and described again in detail in the next section **Configuration Options**.


**Entry Point:**

• Location(s) (e.g. src/main.c Line:75) -> The node at this location is set as entry point. If there are several nodes at the selected location, the user can select which one is added as entry point. Then the SUI process starts and all other nodes are added based on the Node-to-Node relations (iteratively)
	
• Identifier(s) (e.g. "search") -> The graph is queried for all identifiers that match exactly the given name. Then the top-level (visible) AST parent(s) of the identifier node(s) (e.g. the parent node of identifier "search" is its IdentifierDeclareStmt "char search;") are set as entry point(s). Further steps are basend on the configuration options for entry point handling.

• String(s) (e.g. "search")  -> The graph is queried for all nodes that partly or fully match the given string. Then the subset of top-level (visible) AST nodes are set as entry point(s). Further steps are basend on the configuration options for entry point handling.

• Feature(s) (e.g. "search") -> The graph is queried for all conditional compilation statements (#if/#ifdef/#ifndef/#elif) that reference the given feature (e.g. contain the text "search"). The #ifdef constructs as well as their enclosed top-level (visible) AST nodes are set as entry point(s). Further steps are basend on the configuration options for entry point handling.	


**Node-to-node relations:**

• *Structural*:
	• Directory -> All included files in this directory
	• File -> All included code elements in this file 
	• Function definition -> All enclosed code elements (configurable) and all calls to this function (configurable)
	• If, for, while, do-while, switch statements -> All enclosed code elements (configurable)
	• Else statement -> All enclosed code elements (configurable) and the corresponding if statement
	• ExpressionStatement, IdentifierDeclStatement, Condition, PreDefine, PreDiagnostic, PreOther -> All AST children (as they could contain calls)
• *Calls/Usage*:
	• Callee, MacroCall -> Called function or macro definition, #include statement and declaration in header file if target is in another file
	• PreIfCondition, PreMacro -> Callees or MacroCalls (to get the used functions or macros, see above)
	• FunctionDef -> Callees of that function (configurable)
	• PreUndef, PreDefine -> PreMacroIdentifier (configurable)
	• PreMacroIdentifier -> All uses and defines of the macro (in the current file and files that include the macro definition) for the macro (configurable), only works for function-like macros
• *Defines*:	
	• Function -> FunctionDef (as this is the visible node)
	• FunctionDef -> Declaration of the function (DeclStmt) in its header file (if existing)
	• AddressOfExpression -> Referenced FunctionDef or variable
	• DeclStmt -> Definition of the function (FunctionDef) in its C file (if existing) and the necessary include statement
	• Condition, PreIfCondition, Parameter, ParameterList -> Get definition of the element that contains the condition or parameter	(e.g. the IfStatement)
• *Data Flow*:	
	• ForInit, IdentifierDeclStatement, Parameter, AssignmentExpression, ExpressionStatement, Argument, ArgumentList, Condition, UnaryExpression, ReturnStatement -> All uses and defines of the contained variables (configurable)
• *Control Flow*:
	• GotoStatement-> All labels referenced by the goto		
• *Variability*:	
	• PreIfStatement -> All variable statements (Preprocessor and C code); as well as all syntactical children (#else, #endif, PreIfCondition, etc) or just the #endif and PreIfCondition (configurable)
	• PreElIfStatement -> Same as PreIfStatement, but also get the starting #if
	• PreElseStatement -> All variable statements (Preprocessor and C code) and the starting #if	
	• PreEndIfStatement -> Get the starting #if



**Do nothing for:**

	• Subexpressions like: 'AdditiveExpression' a + b, 'PrimaryExpression' 1, 'IncDec' ++, 'UnaryOperator' !, 'UnaryOperationExpression' - 1, 'ArrayIndexing' array[1], 'RelationalExpression' i > 5, 'Sizeof', 'SizeofOperand'  (already contained in ExpressionStatement, no further analysis needed)
	• All kind of types like: 'ReturnType' void, 'IdentifierDeclType' int, 'ParameterType' int (no further analysis needed)
	• 'CFGEntryNode' ENRTY and 'CFGExitNode' EXIT (no further analysis needed)
	• 'Symbol' (already contained in the dataflow analysis)
	• 'Label' case 1: (already contained in Goto or Switch analysis)
	• 'IdentifierDecl' i and 'Decl' i (contained in IdentifierDeclStatement)
	• 'DeclByType' int i, 'StructUnionEnum', 'FunctionPointerDeclare' (global declares will (all) be included in the end, but do not trigger further analysis)
	• 'CompoundStatement' (container element, already contained in analysis of AST parent element)
	• 'BreakStatement', 'ContinueStatement' (no further analysis needed)
	• 'Statement' (generic toplevel element, already contained in other analyses, as this never appears without more specific children)
	• 'PreMacroParameters' parameters of a function-like macro (no further analysis needed)
	• 'PreInclude', 'PreIncludeNext' (choose the file instead, already included in other analyses)
	• 'Comment' (no further analysis needed, can be included in the end)
	• 'CustomNode' (this is for custom rules, so there is no generic rule)



VARIABILITY HANDLING
--------------

In our use-case, variability is realized with conditional compilation through #ifdef preprocessor annotations. The preprocessor-code is parsed into the graph database, like the normal C-code. The AST structure of the preprocessor-code is separated from the C-code structure. Preprocessor statements are either AST children of their parent file, class or function. The only exception are #elif/#else and #endif statements, as they are AST children of their respective blockstarter-statement, e.g. #endif is AST child of #else, which is an AST child of #if. Furthermore, a C-statement is never an AST child of a preprocessor-statement. Instead, whenever a line of code is annotated with an #if/#ifdef statement, it is connected with a variability edge. This allows us to specifically analyze variability relationships.


CONFIGURATION OPTIONS
--------------

**Input formats:**

• console
	• Explanation: Activate to use the interactive console to input the Entry Point. If it's deactivated, you either have to edit the Entry Point manually in the script or use the automated workflow. This has no effect on the Semantic Unit identification process.
	
**Entry Point handling (impacts all except location):**

• includeBackwardSlice 
	• Explanation: Classical intraprocedural syntax preserving backward slice, includes all statements that appear previously in the control flow and are reachable either via dataflow or are structural (AST) parents (except the parent functionDef). Can be de-/activated independently from the other options.
	• Example node: An increment of variable x inside an ifStatement.
	• Effect on Semantic Unit: All surrounding control statements (here the ifStatement) and all statements that appear previously in the control flow and have a data flow connection (either direct or indirect through other variables) to the variable x (e.g. its declare statement) are added to the initial Entry Point set
	• Hint: This option gives the best combination of precision and recall for non-location entry points. For complex functions it takes a comparable long time, though.

• includeParentBlocks  
	• Explanation: Preserve syntactical structure, e.g. ifStatements around the entry point. Does not add the parent function to analysis (if existing). Also adds local declares. Can be de-/activated independently from the other options.
	• Example node: An increment of variable x inside an ifStatement.
	• Effect on Semantic Unit: All surrounding AST parents (here the ifStatement) of the variable x are added to the initial Entry Point set.
	• Hint: Potentially the smallest number of entry points, but also not complete (no data dependencies taken into account).

• includeLocalDataflows
	• Explanation: Recursively includes all statements inside the function of an entry point that have a dataflow connection (read/write). Can be de-/activated independently from the other options.
	• Example node: An increment of variable x inside an ifStatement.
	• Effect on Semantic Unit: All statements that have a data flow connection (either direct or indirect through other variables) to the variable x (e.g. its declare statement) are added to the initial Entry Point set.
	• Hint: Makes the slice bigger, but (potentially) not so much as the option "include parent function". 

• includeParentFunction  
	• Explanation: Adds the parent functionDef (if existing) to the entryPoint set. This option is normally selected in combination with the "include enclosed code" options, which leads to inclusion of the whole function's content.
	• Example node: An increment of variable x inside an ifStatement.
	• Effect on Semantic Unit: The increment statement and the parent functionDef are added to the initial Entry Point set.
	• Hint: Makes the slice bigger, not recommended for fine-grained slicing. Most complete, but potentially overfitting.

**(Iterative) node-to-node relations:**

• includeEnclosedCode
	• Explanation: Whenever a syntax structure is selected that encloses code, this code is included in the Semantic Unit. 
	• Example node: A function declaration 
	• Effect on Semantic Unit: All code inside the function belongs to the Semantic Unit (and thus probably makes the result bigger, decreases precision and increases recall)
	• Hint: You should not turn this off when you plan to use structure-based entry points (like class/method declaration), as the result will be empty. You can turn this off when you use behavior-based entry points like assert statements from test cases. Deactivation makes the result strongly rely on the quality of your test case.

• connectIfWithElse
	• Explanation: Always connect an existing else-statement, whenever an if-statement is selected
	• Example node: An if-statement that has one else statement
	• Effect on Semantic Unit: The else statement is added to the Semantic Unit
	• Hint: Deactivate only if you want to focus on special cases and not on the whole case distinction. Deactivation has no effect, if the include enclosed code option is activated.

• followDataflows
	• Explanation: Follow data flow relations (uses/defines)
	• Example node: Identifier of a variable declaration statement 
	• Effect on Semantic Unit: The result contains all statements that read and write this variable
	• Hint: The Semantic Unit will get bigger if you activate this. Deactivate if you are interested in more coarsed grained analyses.
	
• searchDirsRecursively
	• Explanation: When a directory node is analyzed, all contained directories are added to the Semantic Unit and then recursively analyzed
	• Example node: A directory which contains one or more directories
	• Effect on Semantic Unit: All contained directories (on all levels underneath) are added to the Semantic Unit
	• Hint: Activate if you want to recursively add all directories under a given root node. This can result in very big Semantic Units. Deactivate if you want to stay on the current directory level.

• includeOtherFeatures
	• Explanation: When we search for the semantically related lines for a specific feature, we only expand for the occurrence of this feature name. When we reach an implementation that is connected to another feature (via incoming variability edges), we do not search for all other implementations that are annotated with this other feature. We do include the implementations that were reached through all (except variability) edges. 
	• Example node: A feature identifier
	• Effect on Semantic Unit: All blocks that are annotated with an #ifdef that contains the identifier of the entry-point-feature are added to the Semantic Unit. All other variability links (connected to different feature identifiers) will not be followed/analyzed.
	• Hint: Activate if you want to follow all appearing variability links and include all implementations of a feature whenever you reach one of its implementations. This can result in very big Semantic Units. Deactivate if you want to focus on the current feature(s).
	
• lookForAllFunctionCalls
	• Explanation: Whenever a functionDef statement is analyzed, additionally look for all calls to this function. If deaktivated, the process will only analyze the content of the function.
	• Example node: A function definition
	• Effect on Semantic Unit: The result additionally contains all calls to this function (as well as needed include statements and declarations in header files) 
	• Hint: The Semantic Unit will get bigger if you activate this option. The results will now additionally contain all other statements that use this function (instead of only the statements that were needed by this function).
	
• lookForAllMacroUsages
	• Explanation: Whenever a preDefine or preUndef statement is analyzed, additionally look for all usages of this macro. This only works for function-like macros. If deaktivated, the process will only analyze the content of the macro.
	• Example node: A function-like macro definition
	• Effect on Semantic Unit: The result additionally contains all usages of this macro (as well as needed include statements) 
	• Hint: The Semantic Unit will get bigger if you activate this option. The results will now additionally contain all other statements that use this macro (instead of only the statements that were needed by this function).

**Post-analysis steps (done once after iterative process is finished):**
	
• addAllFilesIncludedBySUFilesRecursively
	• Explanation: For all files that are part of the SU, add all contained include (that appear in these files) and the included files themselves (without their content). Has an effect on the addition of all analyses that are based on SU files (as this extension happens before the other analyses).
	• Effect on Semantic Unit: The result additionally contains all included files and the needed include statements.
	• Hint: This allows to reduce the number of added global ressources that are otherwise not analyzable (e.g. we cannot know if an external library is used or not if we do not know its content). With this option, we can only include global ressources that are reachable/accessible (via include chains) from within the scope of the SU. There may be corner cases where includes are too obfuscated to be detected and therefore missed with this option. This limitation holds for all configuration options that are contain "SUFiles".
	
• addAllExternalLibraryIncludes
	• Explanation: Adds all includeStatements from the whole project that include external libraries. Overwrites "addExternalLibraryIncludesOnlyForSUFiles".
	• Effect on Semantic Unit: The result additionally contains all include statements that include external ressources. 
	• Hint: Makes the SU bigger, but guarantees that all needed includes are there. Low precision, maximum recall.
	
• addExternalLibraryIncludesOnlyForSUFiles
	• Explanation: Adds all includeStatements accessible from the SU that include external libraries. Has no effect if "addAllExternalLibraryIncludes" is true.
	• Effect on Semantic Unit: The result additionally contains all include statements accessible from the SU that include external ressources. 
	• Hint: Makes the SU bigger, but not so much as "add all external library includes", while all needed includes should be there. Medium precision, high recall.
	
• addAllInternalFileIncludes
	• Explanation: Adds all includeStatements from the whole project that include project-internal files. Overwrites "addInternalFileIncludesOnlyForSUFiles".
	• Effect on Semantic Unit: The result additionally contains all include statements that include project-internal files. 
	• Hint: Makes the SU bigger, but guarantees that all needed includes are there. Low precision, maximum recall.
	
• addInternalFileIncludesOnlyForSUFiles
	• Explanation: Adds all includeStatements accessible from the SU that include project-internal files. Has no effect if "addAllInternalFileIncludes" is true.
	• Effect on Semantic Unit: The result additionally contains all include statements accessible from the SU that include project-internal files. 
	• Hint: Makes the SU bigger, but not so much as "addAllInternalFileIncludes", while all needed includes should be there. Medium precision, high recall.

• addOnlyProbablyUsedGlobalDeclarationsOfVariables
	• Explanation: Adds all the global declarations of variables which are probably used (=their identifier appears) in the SU. Overwrites "addAllGoblaDelcarationsOfVariablesForSUFiles" and "addAllGoblaDelcarationsOfVariables".
	• Effect on Semantic Unit: The result additionally contains the global declarations of variables that are used in the SU. 
	• Hint: Works good for simple declares, but misses content of e.g. structs or enums. High precision, low recall.

• addAllGoblaDelcarationsOfVariablesForSUFiles
	• Explanation: Adds all the global declarations of variables/structs/typedefs etc. (everything but functions, they are detected during the iterative process) which appear in files that are part of or included by the SU (depending on addAllFilesIncludedBySUFilesRecursively). Has no effect if the "addOnlyProbablyUsedGlobalDeclarationsOfVariables" is true.
	• Effect on Semantic Unit: The result additionally contains all the global declarations of data structures that appear in files that are part of or included by the SU. 
	• Hint: Makes the SU bigger as "addOnlyProbablyUsedGlobalDeclarationsOfVariables", but not so much as "addAllGoblaDelcarationsOfVariables", while all needed declarations should be there. Medium precision, high recall.
	
• addAllGoblaDelcarationsOfVariables
	• Explanation: Adds all global declarations of data structures (no functionDefs) from the whole project. Has no effect if "addOnlyProbablyUsedGlobalDeclarationsOfVariables" or "addAllGoblaDelcarationsOfVariablesForSUFiles" is true. Needs addAllExternalFileIncludes and addAllInternalFileIncludes, as the include statements are not checked again.
	• Effect on Semantic Unit: The result additionally contains all global declarations of data structures. 
	• Hint: Makes the SU bigger (with a potentially very big overhead), but guarantees that all needed declarations are there. Low precision, maximum recall.

• addOnlyProbablyUsedNonFunctionLikeDefines
	• Explanation: Adds all the non-function-like #defines which are probably used (=their identifier appears) in the SU (function-like defines are detected during the iterative process) . Overwrites "addNonFunctionLikeDefinesForSUFiles" and "addAllNonFunctionLikeDefines".
	• Effect on Semantic Unit: The result additionally contains the non-function-like preDefineStatements that are used in the SU. 
	• Hint: Due to the not-so-good string search, this delivers a high number of false positives while being costly. Medium precision, medium recall.

• addNonFunctionLikeDefinesForSUFiles
	• Explanation: Adds all the non-function-like #defines which appear in files that are part of or included by the SU (depending on addAllFilesIncludedBySUFilesRecursively). Has no effect if the "addOnlyProbablyUsedNonFunctionLikeDefines" is true.
	• Effect on Semantic Unit: The result additionally contains all the non-function-like preDefineStatements that appear in files that are part of or included by the SU. 
	• Hint: Makes the SU bigger as "addOnlyProbablyUsedNonFunctionLikeDefines", but not so much as "addAllNonFunctionLikeDefines", while all needed declarations should be there. Medium precision, high recall.
	
• addAllNonFunctionLikeDefines
	• Explanation: Adds all non-function-like #defines from the whole project. Has no effect if "addNonFunctionLikeDefinesForSUFiles" or "addOnlyProbablyUsedNonFunctionLikeDefines" is true. Needs addAllExternalFileIncludes and addAllInternalFileIncludes, as the include statements are not checked again.
	• Effect on Semantic Unit: The result additionally contains all non-function-like preDefineStatements. 
	• Hint: Makes the SU bigger (with a potentially very big overhead), but guarantees that all needed non-function-like preDefineStatements are there. Low precision, maximum recall.

• addVariabilityInformation
	• Explanation: After the analysis is finished, look for variability implementations that affect the Semantic Unit. This is helpfull if you would like to know the variability information of all statements in the Semantic Unit. Activation does not trigger further analyses.
	• Effect on Semantic Unit: The result additionally contains all (directly connected via a 'VARIABILITY' edge) surrounding #ifdefs.
	
• addAssociatedComments
	• Explanation: After the analysis is finished, look for comments for the included code and add them to the result. Activation does not trigger further analyses.
	• Effect on Semantic Unit: The result additionally contains all (directly connected via a 'COMMENTS' edge) belonging comments.
	
**Output formats:**

• generateOnlyAST
	• Explanation: The resulting slice contains only AST elements to clarify the illustration. Has no effect if "generateOnlyVisibleCode" is true. This has no effect on the Semantic Unit identification process.
	
• generateOnlyVisibleCode
	• Explanation: The resulting slice contains only top level AST statements (the statements that contain the lines of code as you see them when you are programming). This has no effect on the Semantic Unit identification process. This option is mandatory if you would like to use the patch creator script.

• showOnlyStructuralEdges
	• Explanation: The resulting slice contains only 'IS_AST_PARENT', 'IS_FILE_OF', 'IS_FUNCTION_OF_AST', 'IS_PARENT_DIR_OF', 'VARIABILITY', 'DECLARES', 'INCLUDES', 'IS_HEADER_OF', 'COMMENTS' edges to clarify the illustration. This has no effect on the Semantic Unit identification process.	

• plotGraph
	• Explanation: The resulting slice is plotted as graph in *.png format. This has no effect on the Semantic Unit identification process, but can take a lot of time for bigger slices.


**Debug options:**

• DEBUG
	• Explanation: Activate to get more outputs on the console, e.g., in which order the statements are added to the Semantic Unit. This has no effect on the Semantic Unit identification process.	

• showStatistics
	• Explanation: Activate to get statistical information about the SU, e.g., the number of contained visible nodes. This has no effect on the Semantic Unit identification process.	
	
	

DEFAULT CONFIGURATION
--------------

**Input formats:**

• console = True

**Entry Point handling:**

• includeBackwardSlice = True 
• includeParentBlocks = False 
• includeLocalDataflows = False 
• includeParentFunction = False 

**Node-to-node relations:**

• includeEnclosedCode = True 
• connectIfWithElse = True 
• followDataflows = False 
• searchDirsRecursively = False 
• includeOtherFeatures = False 
• lookForAllFunctionCalls = False 
• lookForAllMacroUsages = False 

**Post-analysis steps:**

• addAllFilesIncludedBySUFilesRecursively = True 
• addAllExternalLibraryIncludes = False 
• addExternalLibraryIncludesOnlyForSUFiles = True 
• addAllInternalFileIncludes = False 
• addInternalFileIncludesOnlyForSUFiles = True 
• addOnlyProbablyUsedGlobalDeclarationsOfVariables = False 
• addAllGoblaDelcarationsOfVariablesForSUFiles = True  
• addAllGoblaDelcarationsOfVariables = False
• addOnlyProbablyUsedNonFunctionLikeDefines = False 
• addNonFunctionLikeDefinesForSUFiles = True 
• addAllNonFunctionLikeDefines = False 
• addVariabilityInformation = True 
• addAssociatedComments = True  

**Output formats:**

• generateOnlyAST = False
• generateOnlyVisibleCode = True
• showOnlyStructuralEdges = True
• plotGraph = False

**Debug options:**

• DEBUG = False
• showStatistics = True


HOW TO USE
--------------

First, you have to start the jess-server (separate terminal) and import a project. Then open a new terminal and navigate to the customScripts folder. There, you can invoke the SUI script. The last line of the script must be active (remove the comment) for this to work.

.. code-block:: none

	cd $JESS/customScripts
	python3 SUI.py

You were now asked to provide some information (Project name and entry point) before the analysis can start. The project name is the same name you used for the "jess-import" command. A feature/configuration option refers to the name of the symbol that is used with the #if/#ifdef statements to include or exclude a specific feature. An identifier or string refers to text contained either in an identifier node (exact match) or any node (part match). If you would like to set a statement as entry point, the script will interactively give you several IDs to choose from a list of AST nodes. Therefore, you need to specify the location (path and line number) of the statement. As there are often several AST nodes at the same location (e.g. a FunctionDef and a Parameter node), these nodes were displayed and you can choose the desired entry point by typing in the displayed ID of the node.

The script will now iteratively gather all semantically related lines to your given entry point. It will output the result as a Graphviz .dot file (configurable) and a .png file (configurable) in the folder $JESS/customScripts/SemanticUnit. After the analysis is finished (The "GenerateOnlyVisibleCode" option must be TRUE and there must be a result.txt file), you can manually invoke the codeConverter script to generate a project slice. Therefore the last line of the script must be active (remove the comment). The resulting code slice has the same structure as the original project (File/Folder names and nesting as well as line numbers of the code statements), but only contains the lines of code that are part of the Semantic Unit. Empty directories or files, as well as non *.c or *.h are not contained either. You can use this result as basis for patch generation or code inspection.

.. code-block:: none

	python3 codeConverter.py

The whole workflow of migrating useful changes between two software versions can be fully automated with the workflow script, see the next chapter about Semantic Unit Transplantation. 
