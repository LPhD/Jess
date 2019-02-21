package parsing.Shared.builders;


import java.util.List;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr.FunctionParser.Pre_if_statementContext;
import antlr.ModuleParser;
import antlr.ModuleParser.Compound_statementContext;
import antlr.ModuleParser.Pre_if_conditionContext;
import ast.ASTNodeBuilder;
import ast.c.preprocessor.PreCommand;
import ast.c.preprocessor.PreElIfStatement;
import ast.c.preprocessor.PreElseStatement;
import ast.c.preprocessor.PreEndIfStatement;
import ast.c.preprocessor.PreIfCondition;
import ast.c.preprocessor.PreIfStatement;
import ast.c.preprocessor.PreStatement;
import parsing.ASTNodeFactory;
import parsing.TokenSubStream;
import parsing.Functions.ANTLRCFunctionParserDriver;

public class PreprocessorBuilder extends ASTNodeBuilder{
	
	PreStatement thisItem;
	
//	public void createPreStatement(ParserRuleContext ctx) {
//		thisItem = new PreStatement();
//		ASTNodeFactory.initializeFromContext(thisItem, ctx);
//		this.createNew(ctx);
//	}
	
	public void createPreCommand(ParserRuleContext ctx) {
		thisItem = new PreCommand();
		ASTNodeFactory.initializeFromContext(thisItem, ctx);
		this.createNew(ctx);
	}
	
	public void createIf(ModuleParser.Pre_if_statementContext ctx) {
		thisItem = new PreIfStatement();
		ASTNodeFactory.initializeFromContext(thisItem, ctx);
		this.createNew(ctx);
		String text = thisItem.getEscapedCodeStr();
		
		//String text = input.getText(new Interval(startIndex, stopIndex));
		
		System.out.println("start: " +ctx.start);
		System.out.println("stop: " +ctx.stop);
		System.out.println("childs: " +ctx.children);
		System.out.println("ctx: " +ctx);
		System.out.println("ctx cond: " +ctx.pre_if_condition());
		
//		Pre_if_conditionContext preIfCond = ctx.pre_if_condition();
//		CharStream inputStream = preIfCond.start.getInputStream();
//		int startIndex = preIfCond.start.getStopIndex();
//		int stopIndex = preIfCond.stop.getStopIndex();
//		String text = inputStream.getText(new Interval(startIndex, stopIndex));
		
		System.out.println("Text: "+text);
		

//		Compound_statementContext compound_statement = ctx.compound_statement();
//
//		CharStream inputStream = compound_statement.start.getInputStream();
//		int startIndex = compound_statement.start.getStopIndex();
//		int stopIndex = compound_statement.stop.getStopIndex();
//		return inputStream.getText(new Interval(startIndex + 1, stopIndex - 1));
//			
		ANTLRCFunctionParserDriver driver = new ANTLRCFunctionParserDriver();
//		List <ParseTree> list = ctx.children;
//		for (ParseTree parseTree : list) {
//			driver.walkTree(parseTree);
//		}
//		
		driver.parseAndWalkString(text);
		System.out.println(driver.builderStack.toString());
		System.out.println(driver.builderStack.peek());
		System.out.println(driver.builderStack.elementAt(0));
		System.out.println(driver.builderStack.peek().getItem());
		System.out.println(driver.builderStack.peek().getItem().getChild(0));
		
		thisItem = (PreIfStatement) driver.builderStack.peek().getItem().getChild(0);
				
	}
	
	public void createElIf(ParserRuleContext ctx) {
		thisItem = new PreElIfStatement();
		ASTNodeFactory.initializeFromContext(thisItem, ctx);
		this.createNew(ctx);
	}
	
	public void createElse(ParserRuleContext ctx) {
		thisItem = new PreElseStatement();
		ASTNodeFactory.initializeFromContext(thisItem, ctx);
		this.createNew(ctx);
	}
	
	public void createEndIf(ParserRuleContext ctx) {
		thisItem = new PreEndIfStatement();
		ASTNodeFactory.initializeFromContext(thisItem, ctx);
		this.createNew(ctx);
	}

	@Override
	public void createNew(ParserRuleContext ctx) {
		item = thisItem;		
	}
	
	public void setCondition(Pre_if_conditionContext ctx) {
		PreIfCondition cond = new PreIfCondition();
		ASTNodeFactory.initializeFromContext(cond, ctx);
		thisItem.setCondition(cond);
	}
	
	//TODO Needed?
	public void setCondition(antlr.FunctionParser.Pre_if_conditionContext ctx) {
		PreIfCondition cond = new PreIfCondition();
		ASTNodeFactory.initializeFromContext(cond, ctx);
		thisItem.setCondition(cond);
	}

}
