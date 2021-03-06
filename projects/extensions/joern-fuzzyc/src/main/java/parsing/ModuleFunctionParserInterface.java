package parsing;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.misc.Interval;

import antlr.ModuleParser;
import antlr.ModuleParser.Compound_statementContext;
import antlr.ModuleParser.Function_defContext;
import ast.logical.statements.CompoundStatement;
import parsing.Functions.ANTLRCFunctionParserDriver;

public class ModuleFunctionParserInterface {
	
	// Extracts compound statement from input stream
	// as a string and passes that string to the
	// function parser. The resulting 'CompoundStatement'
	// (an AST node) is returned.

	public static CompoundStatement parseFunctionContents(Function_defContext ctx) {
		String text = getCompoundStmtAsString(ctx);

		ANTLRCFunctionParserDriver driver = new ANTLRCFunctionParserDriver();
		FunctionParser parser = new FunctionParser(driver);

		try {
			parser.parseAndWalkString(text);
		} catch (RuntimeException ex) {
			System.err.println("Error parsing function " + ctx.function_name().getText() + ". skipping.");

			ex.printStackTrace();
		}
		CompoundStatement result = parser.getResult();
		Compound_statementContext statementContext = ctx.compound_statement();
		ASTNodeFactory.initializeFromContext(result, statementContext);
		//Set the correct value that is based on actual position and not position inside the string
		result.setCharAtLine(ctx.start.getCharPositionInLine()+1);
		return result;
	}

	private static String getCompoundStmtAsString(ModuleParser.Function_defContext ctx) {
		Compound_statementContext compound_statement = ctx.compound_statement();
		CharStream inputStream = compound_statement.start.getInputStream();
		// ctx.start.getCharPositionInLine() This would be the actual position of the compound in its line
		int startIndex = compound_statement.start.getStopIndex();						
		int stopIndex = compound_statement.stop.getStopIndex();
		//The last item is the closing bracket of the compound statement
		return inputStream.getText(new Interval(startIndex + 1, stopIndex));
	}

}
