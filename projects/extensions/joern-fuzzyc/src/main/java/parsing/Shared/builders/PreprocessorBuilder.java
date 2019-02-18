package parsing.Shared.builders;


import org.antlr.v4.runtime.ParserRuleContext;

import antlr.ModuleParser.ConditionContext;
import ast.ASTNodeBuilder;
import ast.c.preprocessor.PreElIfStatement;
import ast.c.preprocessor.PreElseStatement;
import ast.c.preprocessor.PreEndIfStatement;
import ast.c.preprocessor.PreIfStatement;
import ast.c.preprocessor.PreStatement;
import ast.expressions.Identifier;
import ast.logical.statements.Condition;
import parsing.ASTNodeFactory;

public class PreprocessorBuilder extends ASTNodeBuilder{
	
	PreStatement thisItem;
	
	
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
	
	//TODO Function context also needed?
	public void setCondition(ConditionContext ctx) {
		thisItem.setCondition(new Condition());
		ASTNodeFactory.initializeFromContext(thisItem.getCondition(), ctx);
	}

}
