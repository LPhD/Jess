package tests.languages.c.antlrParsers.functionParser;

import static org.junit.Assert.assertEquals;
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
		String expected = "(statements (statement (expr_statement (expr (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (postfix_expression (primary_expression (identifier foo))) ( (argument_list (argument (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (primary_expression (identifier x)))))))))))))))))))) )))))))))))))))))) ;)))";
		assertEquals(expected, output);
	}

	@Test
	public void testTwoParameters() {
		String input = "foo(x,y);";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		String expected = "(statements (statement (expr_statement (expr (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (postfix_expression (primary_expression (identifier foo))) ( (argument_list (argument (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (primary_expression (identifier x))))))))))))))))))) , (argument (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (primary_expression (identifier y)))))))))))))))))))) )))))))))))))))))) ;)))";
		assertEquals(expected, output);
	}

	@Test
	public void testTwoParametersWithLinebreaks() {
		String input = "foo(x,\n y);";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		String expected = "(statements (statement (expr_statement (expr (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (postfix_expression (primary_expression (identifier foo))) ( (argument_list (argument (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (primary_expression (identifier x))))))))))))))))))) , (argument (expression_fragment \\n) (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (primary_expression (identifier y)))))))))))))))))))) )))))))))))))))))) ;)))";
		assertEquals(expected, output);
	}
	
	@Test
	public void testCallViaPtr() {
		String input = "ptr->foo(x);";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		String expected = "(statements (statement (expr_statement (expr (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (postfix_expression (postfix_expression (primary_expression (identifier ptr))) -> (identifier foo)) ( (argument_list (argument (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (primary_expression (identifier x)))))))))))))))))))) )))))))))))))))))) ;)))";
		assertEquals(expected, output);
	}

	@Test
	public void testCallWithExprInArg() {
		String input = "foo(x == 1, x++);";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		String expected = "(statements (statement (expr_statement (expr (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (postfix_expression (primary_expression (identifier foo))) ( (argument_list (argument (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (primary_expression (identifier x)))))))))) (equality_operator ==) (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (primary_expression (constant 1)))))))))))))))))))) , (argument (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (postfix_expression (primary_expression (identifier x))) (inc_dec ++))))))))))))))))))) )))))))))))))))))) ;)))";
		assertEquals(expected, output);
	}
	
	@Test
	public void testCallWithAddressOfExpression() {
		String input = "ag_scandir(path, &dir_list);";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		String expected = "(statements (statement (expr_statement (expr (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (postfix_expression (primary_expression (identifier ag_scandir))) ( (argument_list (argument (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (primary_expression (identifier path))))))))))))))))))) , (argument (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (address_of_expression & (identifier dir_list))))))))))))))))))) )))))))))))))))))) ;)))";
		assertEquals(expected, output);
	}
		
	@Test
	public void testCallWithFunctionPointerUseExpression() {
		String input = "( * filter ) ( dirname , entry , baton ) ;";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		String expected = "(statements (statement (expr_statement (expr (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression ( (ptr_operator *) (identifier filter) ) ( (argument_list (argument (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (primary_expression (identifier dirname))))))))))))))))))) , (argument (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (primary_expression (identifier entry))))))))))))))))))) , (argument (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (primary_expression (identifier baton)))))))))))))))))))) ))))))))))))))) ;)))";
		assertEquals(expected, output);
	}
}
