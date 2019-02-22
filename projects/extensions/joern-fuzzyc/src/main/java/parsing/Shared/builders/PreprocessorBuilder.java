package parsing.Shared.builders;

import org.antlr.v4.runtime.ParserRuleContext;

import antlr.ModuleParser;
import ast.ASTNodeBuilder;
import ast.c.preprocessor.PreCommand;
import ast.c.preprocessor.PreElIfStatement;
import ast.c.preprocessor.PreElseStatement;
import ast.c.preprocessor.PreEndIfStatement;
import ast.c.preprocessor.PreIfStatement;
import ast.c.preprocessor.PreStatement;
import parsing.ASTNodeFactory;
import parsing.Functions.ANTLRCFunctionParserDriver;

/**
 * This builder calls the @FunctionParser, because PreStatements follow the same rules
 * on module and on function level. As we dont want cloned code, we simple parse
 * the pre statements with the function parser and connect the result on module level.
 *
 */
public class PreprocessorBuilder extends ASTNodeBuilder {

	PreStatement thisItem;
	ANTLRCFunctionParserDriver driver;

	// public void createPreStatement(ParserRuleContext ctx) {
	// thisItem = new PreStatement();
	// ASTNodeFactory.initializeFromContext(thisItem, ctx);
	// this.createNew(ctx);
	// }

	public void createPreCommand(ParserRuleContext ctx) {
		// Driver for calling function parser
		driver = new ANTLRCFunctionParserDriver();
		// Get code of PreElIfStatement
		thisItem = new PreCommand();
		ASTNodeFactory.initializeFromContext(thisItem, ctx);
		String text = thisItem.getEscapedCodeStr();
		try {
			// Parse code in function parser
			driver.parseAndWalkString(text);
			// Exchange current node with newly parsed node 
			thisItem = (PreCommand) driver.builderStack.peek().getItem().getChild(0);
		} catch (Exception e) {
			System.err.println("Cannot create PreCommand " +text+" in ModuleParser");
			e.printStackTrace();
		}
		this.createNew(ctx);
	}

	public void createIf(ModuleParser.Pre_if_statementContext ctx) {
		// Driver for calling function parser
		driver = new ANTLRCFunctionParserDriver();
		// Get code of PreIfStatement
		thisItem = new PreIfStatement();
		ASTNodeFactory.initializeFromContext(thisItem, ctx);
		String text = thisItem.getEscapedCodeStr();
		try {
			// Parse code in function parser
			driver.parseAndWalkString(text);
			// Exchange current node with newly parsed node 
			thisItem = (PreIfStatement) driver.builderStack.peek().getItem().getChild(0);
		} catch (Exception e) {
			System.err.println("Cannot create PreIf " +text+" in ModuleParser");
			e.printStackTrace();
		}
		this.createNew(ctx);
	}

	public void createElIf(ParserRuleContext ctx) {
		// Driver for calling function parser
		driver = new ANTLRCFunctionParserDriver();
		// Get code of PreElIfStatement
		thisItem = new PreElIfStatement();
		ASTNodeFactory.initializeFromContext(thisItem, ctx);
		String text = thisItem.getEscapedCodeStr();
		try {
			// Parse code in function parser
			driver.parseAndWalkString(text);
			// Exchange current node with newly parsed node 
			thisItem = (PreElIfStatement) driver.builderStack.peek().getItem().getChild(0);
			this.createNew(ctx);
		} catch (Exception e) {
			System.err.println("Cannot create PreElIf " +text+" in ModuleParser");
			e.printStackTrace();
		}
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
