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
		String expected = "(statements (statement (simple_decl (var_decl (special_datatype struct (identifier foo) "
				+ "{ "
				+ "(var_decl (type_name (base_type int)) "
				+ "(init_declarator_list (init_declarator (declarator (identifier x))) ;)) "
				+ "}"
				+ ")))))";
		assertEquals(expected, output);
	}

	@Test
	public void testStructureInitSimple() {
		String input = "struct foo{ int x; } y;";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		String expected = "(statements (statement (simple_decl (var_decl (special_datatype struct (identifier foo) "
				+ "{ "
				+ "(var_decl (type_name (base_type int)) "
				+ "(init_declarator_list (init_declarator (declarator (identifier x))) ;)) "
				+ "}) (init_declarator_list (init_declarator (declarator (identifier y))) ;)))))";
		assertEquals(expected, output);
	}

	@Test
	public void testAnonymousStructDef() {
		String input = "struct {int x;}v;";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		String expected = "(statements (statement (simple_decl (var_decl (special_datatype struct "
				+ "{ "
				+ "(var_decl (type_name (base_type int)) "
				+ "(init_declarator_list (init_declarator (declarator (identifier x))) ;)) "
				+ "}) (init_declarator_list (init_declarator (declarator (identifier v))) ;)))))";
		assertEquals(expected, output);
	}

	@Test
	public void testAnonymousTypedefStruct() {
		String input = "typedef struct {int x;} newInt;";
		FunctionParser functionParser = createFunctionParser();
		ParseTree tree = functionParser.parseString(input);
		String output = tree.toStringTree(functionParser.getAntlrParser());
		String expected = "(statements (statement (simple_decl (var_decl typedef (special_datatype struct "
				+ "{ "
				+ "(var_decl (type_name (base_type int)) "
				+ "(init_declarator_list (init_declarator (declarator (identifier x))) ;)) "
				+ "}"
				+ ") (init_declarator_list (init_declarator (declarator (identifier newInt))) ;)))))";
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
		String expected = "(statements (statement (simple_decl (var_decl (special_datatype struct (identifier archive_contents) "
				+ "{ (var_decl (type_name const (base_type char)) "
				+ "(init_declarator_list (init_declarator (declarator (ptrs (ptr_operator *)) (identifier f))) ;)) "
				+ "(var_decl (type_name struct (base_type contents)) "
				+ "(init_declarator_list (init_declarator (declarator (ptrs (ptr_operator *)) (identifier c))) ;)) "
				+ "}) (init_declarator_list (init_declarator (declarator (identifier files) "
				+ "(type_suffix [ ])) "
				+ "= "
				+ "(initializer { "
				+ "(initializer_list "
				+ "(initializer { "
				+ "(initializer_list "
				+ "(initializer (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (cast_expression (unary_expression (postfix_expression "
				+ "(primary_expression (constant \"sparse\")))))))))))))))))) "
				+ ", "
				+ "(initializer (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (cast_expression (unary_expression (postfix_expression "
				+ "(primary_expression (identifier archive_contents_sparse))))))))))))))))))) "
				+ "}) "
				+ ", "
				+ "(initializer { "
				+ "(initializer_list "
				+ "(initializer (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (cast_expression (unary_expression (postfix_expression "
				+ "(primary_expression (constant \"sparse2\")))))))))))))))))) "
				+ ", "
				+ "(initializer (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (cast_expression (unary_expression (postfix_expression "
				+ "(primary_expression (identifier archive_contents_sparse2))))))))))))))))))) "
				+ "})) "
				+ "})) "
				+ ";)))))";
		assertEquals(expected, output);
	}

}
