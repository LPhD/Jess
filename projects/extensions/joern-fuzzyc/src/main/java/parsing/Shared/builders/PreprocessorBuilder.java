package parsing.Shared.builders;


import org.antlr.v4.runtime.ParserRuleContext;

import antlr.ModuleParser;
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
		//Driver for calling function parser
		ANTLRCFunctionParserDriver driver = new ANTLRCFunctionParserDriver();
		//Get code of PreIfStatement
		thisItem = new PreIfStatement();
		ASTNodeFactory.initializeFromContext(thisItem, ctx);
		String text = thisItem.getEscapedCodeStr();
		//Parse code in function parser
		driver.parseAndWalkString(text);	
		//Exchange current node with newly parsed node (from function level with more details like condition)
		thisItem = (PreIfStatement) driver.builderStack.peek().getItem().getChild(0);
		this.createNew(ctx);				
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
	
}
