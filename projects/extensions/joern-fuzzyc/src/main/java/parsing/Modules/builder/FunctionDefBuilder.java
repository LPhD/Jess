package parsing.Modules.builder;

import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;

import antlr.ModuleParser.Function_nameContext;
import antlr.ModuleParser.Function_param_listContext;
import antlr.ModuleParser.MacroCall_asFunctionHeaderContext;
import antlr.ModuleParser.Parameter_declContext;
import ast.ASTNodeBuilder;
import ast.c.functionDef.FunctionDef;
import ast.c.preprocessor.commands.macro.MacroCall;
import ast.expressions.Identifier;
import ast.logical.statements.CompoundStatement;
import parsing.ASTNodeFactory;
import parsing.Functions.builder.ParameterListBuilder;

public class FunctionDefBuilder extends ASTNodeBuilder {

	FunctionDef thisItem;
	ParameterListBuilder paramListBuilder = new ParameterListBuilder();

	@Override
	public void createNew(ParserRuleContext ctx) {
		item = new FunctionDef();
		ASTNodeFactory.initializeFromContext(item, ctx);
		thisItem = (FunctionDef) item;
	}

	public void setName(Function_nameContext ctx, Stack<ASTNodeBuilder> itemStack) {
		thisItem.addChild(new Identifier());
		ASTNodeFactory.initializeFromContext(thisItem.getIdentifier(), ctx);
	}
	
	public void setAlternativeName(MacroCall_asFunctionHeaderContext ctx, Stack<ASTNodeBuilder> itemStack) {
		thisItem.addChild(new MacroCall());
		ASTNodeFactory.initializeFromContext(thisItem.getIdentifier(), ctx);
	}

	public void setParameterList(Function_param_listContext ctx, Stack<ASTNodeBuilder> itemStack) {
		paramListBuilder.createNew(ctx);
		thisItem.addChild(paramListBuilder.getItem());
	}

	public void addParameter(Parameter_declContext ctx, Stack<ASTNodeBuilder> itemStack) {
		paramListBuilder.addParameter(ctx, itemStack);
	}

	public void setContent(CompoundStatement functionContent) {
		thisItem.addChild(functionContent);
	}

}
