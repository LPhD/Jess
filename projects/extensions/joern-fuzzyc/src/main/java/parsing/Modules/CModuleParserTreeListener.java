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
import ast.c.preprocessor.PreStatement;
import ast.c.preprocessor.blockstarter.PreBlockstarter;
import ast.c.preprocessor.blockstarter.PreEndIfStatement;
import ast.c.preprocessor.blockstarter.PreIfStatement;
import ast.declarations.IdentifierDecl;
import ast.logical.statements.CompoundStatement;
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
	// For variability analysis and preprocessor statements
	ANTLRCFunctionParserDriver fDriver;
	private Stack<ASTNode> itemStack = new Stack<ASTNode>();


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
		PreStatement thisItem = new PreStatement();
		ASTNodeFactory.initializeFromContext(thisItem, ctx);
		String text = thisItem.getEscapedCodeStr();
		// Try to reuse the function parser rules for parsing the preprocessor statement
		try {
			fDriver.parseAndWalkString(text);
			thisItem = (PreStatement) fDriver.builderStack.pop().getItem().getChild(0);
		} catch (Exception e) {
			System.err.println("Cannot create PreStatement " + text + " in ModuleParser");
			e.printStackTrace();
		}
		

		// If the current item is an #endif
		if (thisItem instanceof PreEndIfStatement) {
			// Connect #endif to parent
			checkVariability(thisItem);
			// Remove items from stack until the next #if/#ifdef
			closeBlock();
			System.out.println("Block closed!");
		} else if (thisItem instanceof PreBlockstarter) {
			// Collect all Pre Blockstarters on the Stack
			itemStack.push(thisItem);
			System.out.println("#if collected");
		} else {
			// Connect all other pre statements to parent blockstarters if they exist
			checkVariability(thisItem);
		}
		
		p.notifyObserversOfItem(thisItem);
	}

	/**
	 * Connects the current statement with its parent PreBlockstarter if that exists
	 * 
	 * @param node
	 */
	private void checkVariability(ASTNode currentNode) {
		if (!itemStack.isEmpty()) {
			PreStatement parent = (PreStatement) itemStack.peek();
			parent.addChild(currentNode);
			System.out.println("Connected child: "+currentNode.getEscapedCodeStr()+" with parent: "+parent.getEscapedCodeStr());
		}
	}

	/**
	 * Removes collected PreBlockstarters from the stack and connects them. Stop if
	 * the stack is empty or if we reach an PreIfStatement.
	 */
	private void closeBlock() {
		while (!itemStack.isEmpty()) {
			PreStatement currentNode = (PreStatement) itemStack.pop();
			checkVariability(currentNode);

			// Stop if we reach an PreIfStatement
			if (currentNode instanceof PreIfStatement) {
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
		

		// Connect to parent blockstarters if they exist
		checkVariability(builder.getItem());
		
		p.notifyObserversOfItem(builder.getItem());
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


		//Connect to parent blockstarters if they exist
		checkVariability(stmt);
		
		p.notifyObserversOfItem(stmt);
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


		
		//Connect to parent blockstarters if they exist
		checkVariability(builder.getItem());
		
		p.notifyObserversOfItem(builder.getItem());
		emitDeclarationsForClass(ctx);
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
