package parsing.Shared.builders;


import org.antlr.v4.runtime.ParserRuleContext;

import ast.ASTNodeBuilder;
import ast.c.statements.blockstarters.PreIfStatement;
import parsing.ASTNodeFactory;

public class PreprocessorBuilder extends ASTNodeBuilder{
	
	PreIfStatement thisItem;


	@Override
	public void createNew(ParserRuleContext ctx) {
		item = new PreIfStatement();
		thisItem = (PreIfStatement) item;
		ASTNodeFactory.initializeFromContext(thisItem, ctx);
		
	}

}
