Semantic Unit Identification
==========================

Introduction
--------------

The use case of the Semantic Unit identification process is to automatically migrate useful changes between a product line and separated products. These changes can be assigned to Semantic Units.

A Semantic Unit consists of semantically related lines of code. Semantically related means, that there is a common purpose belonging to the related code. This purpose can for example be defined by a test case. Thus, all code that is needed to make a test case pass belongs to one Semantic Unit.

We need a user given entry point do identify a Semantic Unit, because the user decides, which useful changes should be migrated. The idea is, that the user selects only one line of code, for example a method declaration or an assert statement from a test case. Based on this selection, the proposed approach identifies all semantically related lines of code and, hence, the Semantic Unit.

Depending on the entry point, there are different possibilities of what should belong to the Semantic Unit. For example, when the user selects a line of code with an if-statement. Does a following else-statement also belong to the Semantic Unit? This decision is arguable, so the user should have the possibility to configure the desired behavior. The next sections describe the general idea, the input and output relations, the configurable decisions and the default configuration of the Semantic Unit Identification process.


General Idea
--------------

The Semantic Unit Identification process identifies semantically related lines of code based on one or more given entry points. The underlaying structure of the process is a graph database, consisting of AST (Abstract Syntax Tree) elements and relations between them. These relations are not only AST relations (is parent of), but also data flow (uses, defines) and control flow (controls) relations.

**Input:** AST Element: Entry Point

**Output:** AST Element: Semantic Unit, Relations of Semantic Unit

**Function:** Set(Entry Point) -> Set(Semantic Unit) | There is a relation between all elements


INPUT/OUTPUT RELATIONS
--------------

The selected elements of the Semantic Unit (output) depend on the type of the given entry point (input). All type-based decisions and the resulting input and output relations are listed below and described in form of Input Type -> Resulting Output. Some of these decisions are configurable and described again in detail in the next section **Configuration Options**.

•	**Working:**
•	Directory -> All included files in this directory
•	File -> All included code elements in this file 
•	Function Ddefinition -> All enclosed code elements (configurable)
•	If, for, while statements -> All enclosed code elements (configurable)
•	Else statement -> Corresponding if statement
•	Callee, call expression -> Called function or macro definition, #include statement if target is in another file
•	Function -> Function definition
• Configuration option -> All #if/#ifdef/#elif nodes and their enclosed content

• **Todo:**
•	Identifier Declaration
•	Symbol
•	Identifier -> Declaration of Identifier (atm not working)
•	Assignment Expression
•	Argument, Argument List, Condition, Unary Expression -> All variable and function definitions?
•	Function, macro definition -> Callees

•	**Do nothing for:**
•	'AdditiveExpression' a + b
•	'PrimaryExpression' 1
•	'IncDec' ++
•	'UnaryOperator' !
•	'UnaryOperationExpression' - 1
•	'ArrayIndexing' array[1]
•	'ReturnType' void
•	'CFGEntryNode' ENRTY
•	'CFGExitNode' EXIT
•	'InitializerList' 7 (size of list)
•	'ForInit' i = 0
•	'IdentifierDeclType' int (contained in IdentifierDeclStatement)
•	'IdentifierDecl' i (contained in IdentifierDeclStatement)
•	'Parameter' i (contained in ParameterList)
•	'ParameterType' int (contained in ParameterList)
•	'ParameterList' int i (contained in FunctionDef)
•	'RelationalExpression' i > 5 (contained in condition)
•	'Sizeof', 'SizeofOperand'  (contained in call expression)
•	'CompoundStatement' (container element)







.. code-block:: none

	cd $JESS
	./jess-server

In a second terminal, you can now import a project. Therefore, the source code of the project must be first packed as a tarball. Then you can invoke jess-import to import the project.
