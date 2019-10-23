package tests.languages.c.antlrParsers.functionParser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import parsing.FunctionParser;

public class FunctionParserTest extends FunctionParserTestBase {

	@Test
	public void testIf() {
		String input = "if(foo){}";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		assertTrue(output.contains("(selection_or_iteration if"));
	}
	
	@Test
	public void testDeclStmt() {
		String input = "int a = 5; \n";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		assertEquals("(statements (statement (simple_decl (var_decl (type_name (base_type int)) "
				+ "(init_declarator_list (init_declarator (declarator (identifier a))"
				+ " = "
				+ "(initializer (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (cast_expression (unary_expression (postfix_expression (primary_expression (constant 5))))))))))))))))))) "
				+ ";)))) "
				+ "(statement (water \\n)))"
				,output);
	}
	
	@Test
	public void testIfWithLinebreaksInCondition() {
		String input = "if(foo == \n bar){}";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		assertEquals("(statements (statement (block_starter (selection_or_iteration if ( "
				+ "(condition (expr (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (cast_expression (unary_expression (postfix_expression (primary_expression (identifier foo))))))))) "
				+ "(equality_operator ==) \\n "
				+ "(equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (cast_expression (unary_expression (postfix_expression (primary_expression (identifier bar)))))))))))))))))))) )))) "
				+ "(statement (opening_curly {)) "
				+ "(statement (closing_curly })))"
				, output);
	}

	@Test
	public void testStructInFunc() {
		String input = "class foo{ int x; };";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		assertTrue(output.contains("class_def"));
	}

	@Test
	public void testSizeofStruct() {
		String input = "while((buffer + len) > (tmp + sizeof(struct stun_attrib))) {}";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		assertTrue(output.contains("selection_or_iteration while"));
	}

}
