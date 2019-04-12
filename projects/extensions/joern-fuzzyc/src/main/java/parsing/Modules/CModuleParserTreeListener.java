package parsing.Modules;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;

import antlr.ModuleBaseListener;
import antlr.ModuleParser;
import antlr.ModuleParser.Class_defContext;
import antlr.ModuleParser.DeclByClassContext;
import antlr.ModuleParser.Init_declarator_listContext;
import antlr.ModuleParser.Type_nameContext;
import ast.ASTNode;

import ast.c.preprocessor.blockstarter.PreEndIfStatement;
import ast.c.preprocessor.blockstarter.PreIfStatement;
import ast.declarations.IdentifierDecl;
import ast.logical.statements.CompoundStatement;
import ast.preprocessor.PreBlockstarter;
import ast.preprocessor.PreStatementBase;
import ast.statements.IdentifierDeclStatement;
import parsing.ANTLRParserDriver;
import parsing.ASTNodeFactory;
import parsing.CompoundItemAssembler;
import parsing.ModuleFunctionParserInterface;
import parsing.Functions.ANTLRCFunctionParserDriver;
import parsing.Modules.builder.FunctionDefBuilder;
import parsing.Shared.builders.ClassDefBuilder;
import parsing.Shared.builders.IdentifierDeclBuilder;

// Converts Parse Trees to ASTs for Modules

public class CModuleParserTreeListener extends ModuleBaseListener {

	ANTLRParserDriver p;
	// For variability analysis and preprocessor statements AST nesting
	ANTLRCFunctionParserDriver fDriver;
	private Stack<ASTNode> variabilityItemStack = new Stack<ASTNode>();
	private Stack<ASTNode> ASTItemStack = new Stack<ASTNode>();


	public CModuleParserTreeListener(ANTLRParserDriver aP) {
		p = aP;
	}

	@Override
	public void enterCode(ModuleParser.CodeContext ctx) {
		System.out.println("Unit start");
		p.notifyObserversOfUnitStart(ctx);
		System.out.println("Unit started");
	}

	@Override
	public void exitCode(ModuleParser.CodeContext ctx) {
		System.out.println("Unit end");
		p.notifyObserversOfUnitEnd(ctx);
		System.out.println("Unit ended");
	}

	// /////////////////////////////////////////////////////////////
	// This is where the ModuleParser invokes the FunctionParser
	// /////////////////////////////////////////////////////////////
	// This function is invoked when a Function_Def parse tree node
	// is entered. This is where we hand over the function contents to
	// the function parser and connect the AST node created for the
	// function definition to the AST created by the function parser.
	// ////////////////////////////////////////////////////////////////

// --------------------------------Preprocessor-----------------------------------------------------------------
	/**
	 * This builder calls the @FunctionParser, because PreStatements follow the same
	 * rules on module and on function level. As we dont want cloned code, we simple
	 * parse the pre statements with the function parser and connect the result on
	 * module level.
	 */
	@Override
	public void enterPre_statement(ModuleParser.Pre_statementContext ctx) {
		System.out.println("Enter pre statement");
		
		// Driver for calling function parser
		fDriver = new ANTLRCFunctionParserDriver();
		// Get code of PreStatement
		PreStatementBase thisItem = new PreStatementBase();
		ASTNodeFactory.initializeFromContext(thisItem, ctx);
		String text = thisItem.getEscapedCodeStr();
		// Try to reuse the function parser rules for parsing the preprocessor statement
		try {
			fDriver.parseAndWalkString(text);
			thisItem = (PreStatementBase) fDriver.builderStack.pop().getItem().getChild(0);
		} catch (Exception e) {
			System.err.println("Cannot create PreStatement " + text + " in ModuleParser");
			e.printStackTrace();
		}
		
		//Resolve AST nesting of preprocessor blockstarters on module level. This has to be done before the db nodes are built.
		if (thisItem instanceof PreEndIfStatement) {
			ASTItemStack.push(thisItem);
			// Remove items from stack until the next #if/#ifdef
			closeASTBlock();
			System.out.println("AST block closed!");
		} else if (thisItem instanceof PreBlockstarter) {
			// Collect all Pre Blockstarters on the AST stack
			ASTItemStack.push(thisItem);
			System.out.println("#if collected in AST stack");
		} else {
			//Notify OutModASTNodeVisitor, to call AST to database converter (PreStatementExporter class). 
			//Do this now for every pre statement that has no AST nesting
			p.notifyObserversOfItem(thisItem);
		}
		
		//________________________________VARIABILITY ANALYSIS________________________________________________________________
		
		// If the current item is an #endif
		if (thisItem instanceof PreEndIfStatement) {
			// Connect #endif to parent
			checkVariability(thisItem);
			// Remove items from stack until the next #if/#ifdef
			closeBlock();
			System.out.println("Block closed!");
		} else if (thisItem instanceof PreBlockstarter) {
			// Collect all Pre Blockstarters on the Stack
			variabilityItemStack.push(thisItem);
			System.out.println("#if collected");
		} else {
			// Connect all other pre statements to parent blockstarters if they exist
			checkVariability(thisItem);
		}				
	}
	
	/**
	 * Removes collected PreBlockstarters from the stack and connects them with AST relations.
	 * When this method is first called, the top stack item should be an #endif
	 * Stop if the AST stack is empty or if we reach an PreIfStatement.
	 */
	private void closeASTBlock() {
		if (ASTItemStack.size() > 1) {
			//Remove the current AST node from the stack
			PreBlockstarter currentNode = (PreBlockstarter) ASTItemStack.pop();
			//Look at the next node on the stack
			PreBlockstarter topOfStack = (PreBlockstarter) ASTItemStack.peek();		
			//Connect the current node with its parent
			topOfStack.addChild(currentNode);			
		
			// Stop if we reach an PreIfStatement
			if (topOfStack instanceof PreIfStatement && (ASTItemStack.size() > 1)) {
				//Remove the PreIfStatement node from the stack and add it to its parent block, stop the iteration
				currentNode = (PreBlockstarter) ASTItemStack.pop();
				topOfStack = (PreBlockstarter) ASTItemStack.peek();		
				topOfStack.addChild(currentNode);					
			} else {
				//Connect AST children until we reach a PreIfStatement or there is only 1 item left on the stack
				closeASTBlock();
			}
		} else if (ASTItemStack.size() == 1)  {
			//Remove solo #endif or #if statements
			PreBlockstarter lastNode = (PreBlockstarter) ASTItemStack.pop();
			//Notify OutModASTNodeVisitor, to call AST to database converter (PreStatementExporter class). 
			//Do this now (and not sooner), because otherwise the preprocessor database node would be initialized without its children or twice
			//Do not do this for child #else/#elif/#endif, they will be automatically added, as they are AST children of the first PreIfStatement
			p.notifyObserversOfItem(lastNode);
		}
	}

	/**
	 * Connects the current statement with its parent PreBlockstarter if that exists
	 * 
	 * @param node
	 */
	private void checkVariability(ASTNode currentNode) {
		if (!variabilityItemStack.isEmpty()) {
			PreBlockstarter parent = (PreBlockstarter) variabilityItemStack.peek();
			parent.addVariableStatement(currentNode);
			//TODO Add variability edge here?
			System.out.println("Connected child: "+currentNode.getEscapedCodeStr()+" with parent: "+parent.getEscapedCodeStr());
		}
	}

	/**
	 * Removes collected PreBlockstarters from the stack and connects them. Stop if
	 * the stack is empty or if we reach an PreIfStatement.
	 */
	private void closeBlock() {
		while (!variabilityItemStack.isEmpty()) {
			PreBlockstarter currentNode = (PreBlockstarter) variabilityItemStack.pop();
			checkVariability(currentNode);
			
			// Stop if we reach an PreIfStatement
			if (currentNode instanceof PreIfStatement) {
				//TODO Add variability edge here?
				return;
			}
		}
	}


// --------------------------------------Preprocessor end-------------------------------------------------------------------------

	@Override
	public void enterFunction_def(ModuleParser.Function_defContext ctx) {
		System.out.println("Enter functionDef");

		FunctionDefBuilder builder = new FunctionDefBuilder();
		builder.createNew(ctx);
		p.builderStack.push(builder);

		CompoundStatement functionContent = ModuleFunctionParserInterface.parseFunctionContents(ctx);
		builder.setContent(functionContent);
	}

	@Override
	public void exitFunction_def(ModuleParser.Function_defContext ctx) {
		FunctionDefBuilder builder = (FunctionDefBuilder) p.builderStack.pop();
		p.notifyObserversOfItem(builder.getItem());
		
		// Connect to parent blockstarters if they exist
		checkVariability(builder.getItem());
		

	}

	@Override
	public void enterReturn_type(ModuleParser.Return_typeContext ctx) {
		FunctionDefBuilder builder = (FunctionDefBuilder) p.builderStack.peek();
		builder.setReturnType(ctx, p.builderStack);
	}

	@Override
	public void enterFunction_name(ModuleParser.Function_nameContext ctx) {
		FunctionDefBuilder builder = (FunctionDefBuilder) p.builderStack.peek();
		builder.setName(ctx, p.builderStack);
	}

	@Override
	public void enterFunction_param_list(ModuleParser.Function_param_listContext ctx) {
		FunctionDefBuilder builder = (FunctionDefBuilder) p.builderStack.peek();
		builder.setParameterList(ctx, p.builderStack);
	}

	@Override
	public void enterParameter_decl(ModuleParser.Parameter_declContext ctx) {
		FunctionDefBuilder builder = (FunctionDefBuilder) p.builderStack.peek();
		builder.addParameter(ctx, p.builderStack);
	}

	// DeclByType

	@Override
	public void enterDeclByType(ModuleParser.DeclByTypeContext ctx) {
		Init_declarator_listContext decl_list = ctx.init_declarator_list();
		Type_nameContext typeName = ctx.type_name();
		emitDeclarations(decl_list, typeName, ctx);
	}

	private void emitDeclarations(ParserRuleContext decl_list, ParserRuleContext typeName, ParserRuleContext ctx) {
		IdentifierDeclBuilder builder = new IdentifierDeclBuilder();
		List<IdentifierDecl> declarations = builder.getDeclarations(decl_list, typeName);

		IdentifierDeclStatement stmt = new IdentifierDeclStatement();
		// stmt.initializeFromContext(ctx);

		Iterator<IdentifierDecl> it = declarations.iterator();
		while (it.hasNext()) {
			IdentifierDecl decl = it.next();
			stmt.addChild(decl);
		}

		p.notifyObserversOfItem(stmt);
		
		//Connect to parent blockstarters if they exist
		checkVariability(stmt);
		

	}

	// DeclByClass

	@Override
	public void enterDeclByClass(ModuleParser.DeclByClassContext ctx) {
		ClassDefBuilder builder = new ClassDefBuilder();
		builder.createNew(ctx);
		p.builderStack.push(builder);
	}

	@Override
	public void exitDeclByClass(ModuleParser.DeclByClassContext ctx) {
		ClassDefBuilder builder = (ClassDefBuilder) p.builderStack.pop();

		CompoundStatement content = parseClassContent(ctx);
		builder.setContent(content);
		
		p.notifyObserversOfItem(builder.getItem());
		emitDeclarationsForClass(ctx);
				
		//Connect to parent blockstarters if they exist
		checkVariability(builder.getItem());
	}

	@Override
	public void enterClass_name(ModuleParser.Class_nameContext ctx) {
		ClassDefBuilder builder = (ClassDefBuilder) p.builderStack.peek();
		builder.setName(ctx);
	}

	private void emitDeclarationsForClass(DeclByClassContext ctx) {

		Init_declarator_listContext decl_list = ctx.init_declarator_list();
		if (decl_list == null)
			return;

		ParserRuleContext typeName = ctx.class_def().class_name();
		emitDeclarations(decl_list, typeName, ctx);
	}

	private CompoundStatement parseClassContent(ModuleParser.DeclByClassContext ctx) {
		ANTLRCModuleParserDriver shallowParser = createNewShallowParser();
		CompoundItemAssembler generator = new CompoundItemAssembler();
		shallowParser.addObserver(generator);

		restrictStreamToClassContent(ctx);
		shallowParser.parseAndWalkTokenStream(p.stream);
		p.stream.resetRestriction();

		return generator.getCompoundItem();
	}

	private void restrictStreamToClassContent(ModuleParser.DeclByClassContext ctx) {
		Class_defContext class_def = ctx.class_def();
		int startIndex = class_def.OPENING_CURLY().getSymbol().getTokenIndex();
		int stopIndex = class_def.stop.getTokenIndex();

		p.stream.restrict(startIndex + 1, stopIndex);
	}

	private ANTLRCModuleParserDriver createNewShallowParser() {
		ANTLRCModuleParserDriver shallowParser = new ANTLRCModuleParserDriver();
		shallowParser.setStack(p.builderStack);
		return shallowParser;
	}

}
