package parsing.Shared.builders;


import org.antlr.v4.runtime.ParserRuleContext;
import ast.ASTNodeBuilder;
import ast.c.preprocessor.PreElIfStatement;
import ast.c.preprocessor.PreElseStatement;
import ast.c.preprocessor.PreEndIfStatement;
import ast.c.preprocessor.PreIfStatement;
import parsing.ASTNodeFactory;

public class PreprocessorBuilder extends ASTNodeBuilder{
	
	
	public void createIf(ParserRuleContext ctx) {
		PreIfStatement thisItem = new PreIfStatement();
		ASTNodeFactory.initializeFromContext(thisItem, ctx);
	}
	
	public void createElIf(ParserRuleContext ctx) {
		PreElIfStatement thisItem = new PreElIfStatement();
		ASTNodeFactory.initializeFromContext(thisItem, ctx);
	}
	
	public void createElse(ParserRuleContext ctx) {
		PreElseStatement thisItem =new PreElseStatement();
		ASTNodeFactory.initializeFromContext(thisItem, ctx);
	}
	
	public void createEndIf(ParserRuleContext ctx) {
		PreEndIfStatement thisItem =new PreEndIfStatement();
		ASTNodeFactory.initializeFromContext(thisItem, ctx);
	}

	@Override
	public void createNew(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		
	}

}
