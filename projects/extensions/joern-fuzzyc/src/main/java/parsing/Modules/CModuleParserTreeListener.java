package parsing.Modules;

import java.util.Iterator;
import java.util.List;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;

import antlr.FunctionParser;
import antlr.ModuleBaseListener;
import antlr.ModuleParser;
import antlr.ModuleParser.Class_defContext;
import antlr.ModuleParser.Compound_statementContext;
import antlr.ModuleParser.DeclByClassContext;
import antlr.ModuleParser.Function_defContext;
import antlr.ModuleParser.Init_declarator_listContext;
import antlr.ModuleParser.Pre_blockstarterContext;
import antlr.ModuleParser.Pre_statementContext;
import antlr.ModuleParser.Type_nameContext;
import ast.c.preprocessor.PreStatement;
import ast.declarations.IdentifierDecl;
import ast.logical.statements.CompoundStatement;
import ast.statements.IdentifierDeclStatement;
import parsing.ANTLRParserDriver;
import parsing.ASTNodeFactory;
import parsing.CompoundItemAssembler;
import parsing.ModuleFunctionParserInterface;
import parsing.Functions.ANTLRCFunctionParserDriver;
import parsing.Functions.builder.FunctionContentBuilder;
import parsing.Modules.builder.FunctionDefBuilder;
import parsing.Shared.builders.ClassDefBuilder;
import parsing.Shared.builders.IdentifierDeclBuilder;
import parsing.Shared.builders.PreprocessorBuilder;

// Converts Parse Trees to ASTs for Modules

public class CModuleParserTreeListener extends ModuleBaseListener
{

	ANTLRParserDriver p;

	public CModuleParserTreeListener(ANTLRParserDriver aP)
	{
		p = aP;
	}

	@Override
	public void enterCode(ModuleParser.CodeContext ctx)
	{
		p.notifyObserversOfUnitStart(ctx);
	}

	@Override
	public void exitCode(ModuleParser.CodeContext ctx)
	{
		p.notifyObserversOfUnitEnd(ctx);
	}

	// /////////////////////////////////////////////////////////////
	// This is where the ModuleParser invokes the FunctionParser
	// /////////////////////////////////////////////////////////////
	// This function is invoked when a Function_Def parse tree node
	// is entered. This is where we hand over the function contents to
	// the function parser and connect the AST node created for the
	// function definition to the AST created by the function parser.
	// ////////////////////////////////////////////////////////////////
	
	
	//TODO Currently very similar code as in function listener... rework!
	//-------------------------------------------------------------------------------------------------	
//		//Preprocessor handling
//	@Override
//	public void enterPre_statement(ModuleParser.Pre_statementContext ctx) {
//		PreprocessorBuilder builder = new PreprocessorBuilder();
//		builder.createPreStatement(ctx);
//		p.builderStack.push(builder);
//		
//		String text = ctx.getText();
//
//		ANTLRCFunctionParserDriver driver = new ANTLRCFunctionParserDriver();
//		parsing.FunctionParser parser = new parsing.FunctionParser(driver);
//
//		try	{
//			parser.parseAndWalkString(text);
//		} catch (RuntimeException ex)	{
//			System.err.println("Error parsing function "+ ctx.getText() + ". skipping.");
//			ex.printStackTrace();
//		}
//		
//		//CompoundStatement result = parser.getResult();
//		//Pre_statementContext statementContext = ctx.compound_statement();
//		//ASTNodeFactory.initializeFromContext(result, statementContext);
//		//return result;
//	}
//	
//	//Preprocessor handling
//	@Override
//	public void exitPre_statement(ModuleParser.Pre_statementContext ctx)	{
//		PreprocessorBuilder builder = (PreprocessorBuilder) p.builderStack.pop();
//		p.notifyObserversOfItem(builder.getItem());
//	}
	
		@Override
		public void enterPre_else_statement(ModuleParser.Pre_else_statementContext ctx)	{			
			PreprocessorBuilder builder = new PreprocessorBuilder();
			builder.createElse(ctx);
			p.builderStack.push(builder);
		}
		
		//Preprocessor handling
		@Override
		public void exitPre_else_statement(ModuleParser.Pre_else_statementContext ctx)	{
			PreprocessorBuilder builder = (PreprocessorBuilder) p.builderStack.pop();
			p.notifyObserversOfItem(builder.getItem());
		}
		
		//Preprocessor handling
		@Override
		public void enterPre_elif_statement(ModuleParser.Pre_elif_statementContext ctx)	{
			PreprocessorBuilder builder = new PreprocessorBuilder();
			builder.createElIf(ctx);
			p.builderStack.push(builder);
		}
		
		//Preprocessor handling
		@Override
		public void exitPre_elif_statement(ModuleParser.Pre_elif_statementContext ctx) {
			PreprocessorBuilder builder = (PreprocessorBuilder) p.builderStack.pop();
			p.notifyObserversOfItem(builder.getItem());
		}
		
		//Preprocessor if handling
		@Override
		public void enterPre_if_statement(ModuleParser.Pre_if_statementContext ctx)	{
			PreprocessorBuilder builder = new PreprocessorBuilder();
			builder.createIf(ctx);
			p.builderStack.push(builder);
		}	
		
		//Preprocessor if handling
		@Override
		public void exitPre_if_statement(ModuleParser.Pre_if_statementContext ctx)	{
			PreprocessorBuilder builder = (PreprocessorBuilder) p.builderStack.pop();
			p.notifyObserversOfItem(builder.getItem());
		}
		
		//Preprocessor if handling
		@Override
		public void enterPre_endif_statement(ModuleParser.Pre_endif_statementContext ctx){
			PreprocessorBuilder builder = new PreprocessorBuilder();
			builder.createEndIf(ctx);
			p.builderStack.push(builder);
		}
		
		//Preprocessor if handling
		@Override
		public void exitPre_endif_statement(ModuleParser.Pre_endif_statementContext ctx){
			PreprocessorBuilder builder = (PreprocessorBuilder) p.builderStack.pop();
			p.notifyObserversOfItem(builder.getItem());
		}
		
		//Preprocessor condition handling
		@Override
		public void enterPre_if_condition(ModuleParser.Pre_if_conditionContext ctx){
			PreprocessorBuilder builder = (PreprocessorBuilder) p.builderStack.peek();
			builder.setCondition(ctx);
		}

	//---------------------------------------------------------------------------------------------------------------
	
	@Override
	public void enterFunction_def(ModuleParser.Function_defContext ctx)
	{

		FunctionDefBuilder builder = new FunctionDefBuilder();
		builder.createNew(ctx);
		p.builderStack.push(builder);

		CompoundStatement functionContent = ModuleFunctionParserInterface
				.parseFunctionContents(ctx);
		builder.setContent(functionContent);
	}

	@Override
	public void exitFunction_def(ModuleParser.Function_defContext ctx)
	{
		FunctionDefBuilder builder = (FunctionDefBuilder) p.builderStack.pop();
		p.notifyObserversOfItem(builder.getItem());
	}

	@Override
	public void enterReturn_type(ModuleParser.Return_typeContext ctx)
	{
		FunctionDefBuilder builder = (FunctionDefBuilder) p.builderStack.peek();
		builder.setReturnType(ctx, p.builderStack);
	}

	@Override
	public void enterFunction_name(ModuleParser.Function_nameContext ctx)
	{
		FunctionDefBuilder builder = (FunctionDefBuilder) p.builderStack.peek();
		builder.setName(ctx, p.builderStack);
	}

	@Override
	public void enterFunction_param_list(
			ModuleParser.Function_param_listContext ctx)
	{
		FunctionDefBuilder builder = (FunctionDefBuilder) p.builderStack.peek();
		builder.setParameterList(ctx, p.builderStack);
	}

	@Override
	public void enterParameter_decl(ModuleParser.Parameter_declContext ctx)
	{
		FunctionDefBuilder builder = (FunctionDefBuilder) p.builderStack.peek();
		builder.addParameter(ctx, p.builderStack);
	}

	// DeclByType

	@Override
	public void enterDeclByType(ModuleParser.DeclByTypeContext ctx)
	{
		Init_declarator_listContext decl_list = ctx.init_declarator_list();
		Type_nameContext typeName = ctx.type_name();
		emitDeclarations(decl_list, typeName, ctx);
	}

	private void emitDeclarations(ParserRuleContext decl_list,
			ParserRuleContext typeName, ParserRuleContext ctx)
	{
		IdentifierDeclBuilder builder = new IdentifierDeclBuilder();
		List<IdentifierDecl> declarations = builder.getDeclarations(decl_list,
				typeName);

		IdentifierDeclStatement stmt = new IdentifierDeclStatement();
		// stmt.initializeFromContext(ctx);

		Iterator<IdentifierDecl> it = declarations.iterator();
		while (it.hasNext())
		{
			IdentifierDecl decl = it.next();
			stmt.addChild(decl);
		}

		p.notifyObserversOfItem(stmt);
	}

	// DeclByClass

	@Override
	public void enterDeclByClass(ModuleParser.DeclByClassContext ctx)
	{
		ClassDefBuilder builder = new ClassDefBuilder();
		builder.createNew(ctx);
		p.builderStack.push(builder);
	}

	@Override
	public void exitDeclByClass(ModuleParser.DeclByClassContext ctx)
	{
		ClassDefBuilder builder = (ClassDefBuilder) p.builderStack.pop();

		CompoundStatement content = parseClassContent(ctx);
		builder.setContent(content);

		p.notifyObserversOfItem(builder.getItem());
		emitDeclarationsForClass(ctx);
	}

	@Override
	public void enterClass_name(ModuleParser.Class_nameContext ctx)
	{
		ClassDefBuilder builder = (ClassDefBuilder) p.builderStack.peek();
		builder.setName(ctx);
	}

	private void emitDeclarationsForClass(DeclByClassContext ctx)
	{

		Init_declarator_listContext decl_list = ctx.init_declarator_list();
		if (decl_list == null)
			return;

		ParserRuleContext typeName = ctx.class_def().class_name();
		emitDeclarations(decl_list, typeName, ctx);
	}

	private CompoundStatement parseClassContent(
			ModuleParser.DeclByClassContext ctx)
	{
		ANTLRCModuleParserDriver shallowParser = createNewShallowParser();
		CompoundItemAssembler generator = new CompoundItemAssembler();
		shallowParser.addObserver(generator);

		restrictStreamToClassContent(ctx);
		shallowParser.parseAndWalkTokenStream(p.stream);
		p.stream.resetRestriction();

		return generator.getCompoundItem();
	}

	private void restrictStreamToClassContent(
			ModuleParser.DeclByClassContext ctx)
	{
		Class_defContext class_def = ctx.class_def();
		int startIndex = class_def.OPENING_CURLY().getSymbol().getTokenIndex();
		int stopIndex = class_def.stop.getTokenIndex();

		p.stream.restrict(startIndex + 1, stopIndex);
	}

	private ANTLRCModuleParserDriver createNewShallowParser()
	{
		ANTLRCModuleParserDriver shallowParser = new ANTLRCModuleParserDriver();
		shallowParser.setStack(p.builderStack);
		return shallowParser;
	}

}
