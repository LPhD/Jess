package parsing.Shared.builders;


import org.antlr.v4.runtime.ParserRuleContext;

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
	
	public void createIf(ParserRuleContext ctx) {
		thisItem = new PreIfStatement();
		ASTNodeFactory.initializeFromContext(thisItem, ctx);
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
