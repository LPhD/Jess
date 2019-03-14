package parsing.Shared.builders;

import org.antlr.v4.runtime.ParserRuleContext;

import ast.ASTNodeBuilder;
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

	 public void createPreStatement(ParserRuleContext ctx, ANTLRCFunctionParserDriver functionDriver) {
			// Driver for calling function parser
			driver = functionDriver;
			// Get code of PreElIfStatement
			thisItem = new PreStatement();
			ASTNodeFactory.initializeFromContext(thisItem, ctx);
			String text = thisItem.getEscapedCodeStr();
			try {
				// Parse code in function parser
				driver.parseAndWalkString(text);
				// Exchange current node with newly parsed node 
				thisItem = (PreStatement) driver.builderStack.pop().getItem().getChild(0);
			} catch (Exception e) {
				System.err.println("Cannot create PreStatement " +text+" in ModuleParser");
				e.printStackTrace();
			}
			this.createNew(ctx);
	 }

	@Override
	public void createNew(ParserRuleContext ctx) {
		item = thisItem;
	}

}
