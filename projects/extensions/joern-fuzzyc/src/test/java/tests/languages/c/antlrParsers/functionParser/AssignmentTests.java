package tests.languages.c.antlrParsers.functionParser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import ast.declarations.IdentifierDecl;
import ast.logical.statements.CompoundStatement;
import ast.statements.IdentifierDeclStatement;
import parsing.FunctionParser;
import tests.languages.c.parseTreeToAST.FunctionContentTestUtil;

public class AssignmentTests extends FunctionParserTestBase {

	@Test
	public void testAssignmentExpr() {
		String input = "x = y + 1;";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		assertTrue(output.contains("assign_expr"));
	}

	@Test
	public void testComplexAssignment() {
		String input = "k += ((c = text[k]) >= sBMHCharSetSize) ? patlen : skip[c];";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		assertTrue(output.contains("assign_expr"));
	}

	@Test
	public void testPrivateInName() {
		String input = "struct acpi_battery *battery = m->private;";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		assertTrue(output.contains("simple_decl"));
	}
	
	
	@Test
	public void testConstPointerDecl() {
		String input = "static char *_check_current_function = NULL;";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		assertEquals("_check_current_function", output);
	}

}
