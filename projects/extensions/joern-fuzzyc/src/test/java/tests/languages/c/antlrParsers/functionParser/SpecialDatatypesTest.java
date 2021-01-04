package tests.languages.c.antlrParsers.functionParser;

import static org.junit.Assert.assertEquals;

import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import parsing.FunctionParser;

/**
 * Tests structs, enums and unions We use the function parser to parse this,
 * therefore we test them only on function level.
 *
 */
public class SpecialDatatypesTest extends FunctionParserTestBase {

	@Test
	public void testSimpleStructDef() {
		String input = "struct foo{int x;}";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		String expected = "(statements (statement (simple_decl (var_decl (special_datatype struct (identifier foo) { int x ; })))))";
		assertEquals(expected, output);
	}

	@Test
	public void testStructureInitSimple() {
		String input = "struct foo{ int x; } y;";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		String expected = "(statements (statement (simple_decl (var_decl (special_datatype struct (identifier foo) { int x ; })"
				+ " (init_declarator_list (init_declarator (declarator (identifier y))) ;)))))";
		assertEquals(expected, output);
	}
	
	@Test
	public void testStructWithPoint() {
		String input = "struct stat s = { .st_dev = 0 };";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		String expected = "(statements (statement (simple_decl (var_decl (type_name (base_type struct stat)) (init_declarator_list (init_declarator (declarator (identifier s)) = (argument (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (initializer_expression { (argument_list (argument (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (primary_expression . (identifier st_dev))))))))))))))))) (assignment_operator =) (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (primary_expression (constant 0))))))))))))))))))))) }))))))))))))))))))) ;)))))";
		assertEquals(expected, output);
	}

	@Test
	public void testAnonymousStructDef() {
		String input = "struct {int x;}v;";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		String expected = "(statements (statement (simple_decl (var_decl (special_datatype struct { int x ; })"
				+ " (init_declarator_list (init_declarator (declarator (identifier v))) ;)))))";
		assertEquals(expected, output);
	}

	@Test
	public void testAnonymousTypedefStruct() {
		String input = "typedef struct {int x;} newInt;";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		String expected = "(statements (statement (simple_decl (var_decl typedef (special_datatype struct { int x ; })"
				+ " (init_declarator_list (init_declarator (declarator (identifier newInt))) ;)))))";
		assertEquals(expected, output);
	}

	@Test
	public void testStructureInitArray() {
		String input = "struct archive_contents { "
				+ "const char *f; "
				+ "struct contents *c; "
				+ "} "
				+ "files[] = {{\"sparse\",archive_contents_sparse }, {\"sparse2\", archive_contents_sparse2} };";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		String expected = "(statements (statement (simple_decl (var_decl (special_datatype struct (identifier archive_contents) { const char * f ; struct contents * c ; }) (init_declarator_list (init_declarator (declarator (identifier files) (type_suffix [ ])) = (argument (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (initializer_expression { (argument_list (argument (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (initializer_expression { (argument_list (argument (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (primary_expression (constant \"sparse\"))))))))))))))))))) , (argument (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (primary_expression (identifier archive_contents_sparse)))))))))))))))))))) })))))))))))))))))) , (argument (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (initializer_expression { (argument_list (argument (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (primary_expression (constant \"sparse2\"))))))))))))))))))) , (argument (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (function_pointer_use_expression (cast_expression (unary_expression (postfix_expression (primary_expression (identifier archive_contents_sparse2)))))))))))))))))))) }))))))))))))))))))) }))))))))))))))))))) ;)))))";
		assertEquals(expected, output);
	}

}
