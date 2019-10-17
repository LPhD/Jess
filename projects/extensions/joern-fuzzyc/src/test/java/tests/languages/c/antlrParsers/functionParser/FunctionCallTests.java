package tests.languages.c.antlrParsers.functionParser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import parsing.FunctionParser;

public class FunctionCallTests extends FunctionParserTestBase {

	@Test
	public void testFunctionCall() {
		String input = "foo(x);";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		assertTrue(output.contains("function_argument_list"));
	}

	@Test
	public void testTwoParameters() {
		String input = "foo(x,y);";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		assertEquals("(statements (statement (expr_statement (expr (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (cast_expression (unary_expression (postfix_expression (postfix_expression "
				+ "(primary_expression (identifier foo))) "
				+ "( (function_argument_list "
				+ "(function_argument (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (cast_expression (unary_expression (postfix_expression "
				+ "(primary_expression (identifier x)))))))))))))))))) , "
				+ "(function_argument (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (cast_expression (unary_expression (postfix_expression "
				+ "(primary_expression (identifier y))))))))))))))))))) ))))))))))))))))) ;)))"
				, output);
	}

	@Test
	public void testTwoParametersWithLinebreaks() {
		String input = "foo(x,\n y);";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		assertEquals("(statements (statement (expr_statement (expr (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (cast_expression (unary_expression (postfix_expression (postfix_expression "
				+ "(primary_expression (identifier foo))) "
				+ "( (function_argument_list "
				+ "(function_argument (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (cast_expression (unary_expression (postfix_expression "
				+ "(primary_expression (identifier x))))))))))))))))))"
				+ " , \\n "
				+ "(function_argument (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (cast_expression (unary_expression (postfix_expression "
				+ "(primary_expression (identifier y))))))))))))))))))) ))))))))))))))))) ;)))"
				, output);
	}
	
	@Test
	public void testCallViaPtr() {
		String input = "ptr->foo(x);";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		assertTrue(output.contains("function_argument_list"));
	}

	@Test
	public void testCallWithExprInArg() {
		String input = "foo(x == 1, x++);";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		assertTrue(output.contains("function_argument_list"));
	}
}
