package tests.languages.c.antlrParsers.functionParser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import parsing.FunctionParser;

public class AssignmentTests extends FunctionParserTestBase {

	@Test
	public void testAssignmentExpr() {
		String input = "x = y + 1;";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		String expected = "(statements (statement (expr_statement (expr (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression "
				+ "(primary_expression (identifier x))))))))))))))))) "
				+ "(assignment_operator =) "
				+ "(assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression "
				+ "(primary_expression (identifier y))))))) "
				+ "+ "
				+ "(additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression "
				+ "(primary_expression (constant 1))))))))))))))))))))) ;)))";
		assertEquals(expected, output);
	}

	@Test
	public void testComplexAssignment() {
		String input = "k += ((c = text[k]) >= sBMHCharSetSize) ? patlen : skip[c];";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		String expected = "(statements (statement (expr_statement (expr (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (primary_expression (identifier k))))))))))))))))) (assignment_operator +=) (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (primary_expression ( (expr (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (primary_expression ( (expr (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (primary_expression (identifier c))))))))))))))))) (assignment_operator =) (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (postfix_expression (primary_expression (identifier text))) [ (expr (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (primary_expression (identifier k))))))))))))))))))) ])))))))))))))))))) ))))))))) (relational_operator >=) (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (primary_expression (identifier sBMHCharSetSize)))))))))))))))))))) )))))))))))))))) ? (expr (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (primary_expression (identifier patlen))))))))))))))))))) : (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (postfix_expression (primary_expression (identifier skip))) [ (expr (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (primary_expression (identifier c))))))))))))))))))) ]))))))))))))))))))) ;)))";
		assertEquals(expected, output);
	}
	
	@Test
	public void testAsmCall() {
		String input = "asm __volatile__(\"\" :: \"r\"(dst) : \"memory\" );";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		String expected = "(statements (statement (expr_statement (expr (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (asmCall asm __volatile__ ( \"\" :: \"r\" ( (identifier dst) ) : \"memory\" )))))))))))))))))) ;)))";
		assertEquals(expected, output);
	}

	
	@Test
	public void testPrivateInName() {
		String input = "struct acpi_battery *battery = m->private;";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		String expected = "(statements (statement (simple_decl (var_decl (type_name (base_type struct acpi_battery) "
				+ "(ptr_operator *)) "
				+ "(init_declarator_list (init_declarator (declarator (identifier battery))"
				+ " = "
				+ "(argument (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (postfix_expression "
				+ "(primary_expression (identifier m))) -> (identifier (access_specifier private)))))))))))))))))))) ;)))))";
		assertEquals(expected, output);
	}
	
	@Test
	public void testArrayAccessWithValueChangeAndCast() {
		String input = "longopts[full_len - 1] = (option_t){ NULL, 0, NULL, 0 };";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		String expected = "(statements (statement (expr_statement (expr (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (postfix_expression (primary_expression (identifier longopts))) [ (expr (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (primary_expression (identifier full_len))))))) - (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (primary_expression (constant 1)))))))))))))))))))) ]))))))))))))))) (assignment_operator =) (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression ( (cast_target (type_name (base_type option_t))) ) (cast_expression (unary_expression (postfix_expression (initializer_expression { (argument_list (argument (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (primary_expression (identifier NULL))))))))))))))))))) , (argument (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (primary_expression (constant 0))))))))))))))))))) , (argument (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (primary_expression (identifier NULL))))))))))))))))))) , (argument (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (primary_expression (constant 0)))))))))))))))))))) })))))))))))))))))))) ;)))";
		assertEquals(expected, output);
	}	
	
	@Test
	public void testCastToAnonymousVoidFunctionPointer() {
		String input = "(void (*)(void *)) sapi_free_header;";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		String expected = "(statements (statement (expr_statement (expr (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression ( (cast_target (type_name (base_type void)) (function_pointer_use_expression ( (ptr_operator *) ) ( (argument_list (argument void (ptr_operator *))) ))) ) (cast_expression (unary_expression (postfix_expression (primary_expression (identifier sapi_free_header)))))))))))))))))))) ;)))";
		assertEquals(expected, output);
	}
	
	//This behaves a little different than normal declares, as it has no declarator (per grammar), but instead an identifier with a parameter list. 
	//Therefore a special handling during UDG generation is necessary (as there are fewer parent contexts than normal)
	@Test
	public void testFunctionPointerDeclarateAndInit() {
		String input = "void (*post_reader_func)(void) = NULL;";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		String expected = "(statements (statement (simple_decl (var_decl (type_name (base_type void)) ( (ptr_operator *) (identifier post_reader_func) ) (param_type_list ( void )) = (argument (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (primary_expression (identifier NULL))))))))))))))))))) ;))))";
		assertEquals(expected, output);
	}
	
	@Test
	public void testIfdefInExpression() {
		String input = "a = 5 + \n"
				+ "#ifdef x \n"
				+ "x + \n"
				+ "#endif \n"
				+ "1;";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		assertTrue("Expected no water, but preprocessor_fragment and expr_statement, but got instead: "+output, !output.contains("water") && output.contains("preprocessor_fragment") && output.contains("expr_statement") );
	}
	
	@Test
	public void testMoreComplexIfdefInMoreComplecExpression() {
		String input = "\n" + 
				"	return (php_stream_xport_register(\"tcp\", php_stream_generic_socket_factory) == SUCCESS\n" + 
				"			&&\n" + 
				"			php_stream_xport_register(\"udp\", php_stream_generic_socket_factory) == SUCCESS\n" + 
				"#if defined(AF_UNIX) && !(defined(PHP_WIN32) || defined(__riscos__)) \n" + 
				"			&&\n" + 
				"			php_stream_xport_register(\"unix\", php_stream_generic_socket_factory) == SUCCESS\n" + 
				"			&&\n" + 
				"			php_stream_xport_register(\"udg\", php_stream_generic_socket_factory) == SUCCESS\n" + 
				"#endif\n" + 
				"		) ? SUCCESS : FAILURE;";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		assertTrue("Expected no water, but preprocessor_fragment and return_statement, but got instead: "+output, !output.contains("water") && output.contains("preprocessor_fragment") && output.contains("jump_statement") );
	}
	

}
