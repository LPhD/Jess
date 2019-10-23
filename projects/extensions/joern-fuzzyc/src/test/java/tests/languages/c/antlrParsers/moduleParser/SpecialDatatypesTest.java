package tests.languages.c.antlrParsers.moduleParser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import antlr.ModuleLexer;
import antlr.ModuleParser;

/**
 * Tests structs, enums and unions
 * Should be the same output with the function parser, but we do not want duplicate tests.
 *
 */
public class SpecialDatatypesTest {

	private ModuleParser createParser(String input) {
		ANTLRInputStream inputStream = new ANTLRInputStream(input);
		ModuleLexer lex = new ModuleLexer(inputStream);
		CommonTokenStream tokens = new CommonTokenStream(lex);
		ModuleParser parser = new ModuleParser(tokens);
		return parser;
	}

	@Test
	public void testSimpleStructDef() {
		String input = "struct foo{int x;}";

		ModuleParser parser = createParser(input);
		String output = parser.simple_decl().toStringTree(parser);
		assertEquals("(simple_decl (var_decl (special_datatype struct (identifier foo) { "
				+ "(var_decl (type_name (base_type int)) "
				+ "(init_declarator_list (init_declarator (declarator (identifier x))) ;)) "
				+ "}"
				+ ")))"
				,output);
	}

	@Test
	public void testAnonymousStructDef() {
		String input = "struct {int x;}v;";

		ModuleParser parser = createParser(input);
		String output = parser.simple_decl().toStringTree(parser);
		assertEquals("(simple_decl (var_decl (special_datatype struct { "
				+ "(var_decl (type_name (base_type int)) "
				+ "(init_declarator_list (init_declarator (declarator (identifier x))) ;)) "
				+ "}) "
				+ "(init_declarator_list (init_declarator (declarator (identifier v))) "
				+ ";)))"
				,output);
	}
	
	@Test
	public void testAnonymousTypedefStruct() {
		String input = "typedef struct {int x;} newInt;";

		ModuleParser parser = createParser(input);
		String output = parser.simple_decl().toStringTree(parser);
		assertEquals("(simple_decl (var_decl typedef (special_datatype struct { "
				+ "(var_decl (type_name (base_type int)) "
				+ "(init_declarator_list (init_declarator (declarator (identifier x))) ;)) "
				+ "}) "
				+ "(init_declarator_list (init_declarator (declarator (identifier newInt))) "
				+ ";)))"
				,output);
	}

	@Test
	public void testStructureInitArray() {
		String input = "struct archive_contents" 
				+ "{ const char *f; "
				+ "struct contents *c; } "
				+ "files[] = {{\"sparse\",archive_contents_sparse }, {\"sparse2\", archive_contents_sparse2} };";

		ModuleParser parser = createParser(input);
		String output = parser.simple_decl().toStringTree(parser);
		assertEquals("",output);
	}

	@Test
	public void testStructureInitSimple() {
		String input = "struct foo{ int x; } y;";
		ModuleParser parser = createParser(input);
		String output = parser.simple_decl().toStringTree(parser);
		assertEquals("(simple_decl (var_decl (special_datatype struct (identifier foo) { "
				+ "(var_decl (type_name (base_type int)) "
				+ "(init_declarator_list (init_declarator (declarator (identifier x))) ;)) "
				+ "}) "
				+ "(init_declarator_list (init_declarator (declarator (identifier y))) "
				+ ";)))"
				,output);
	}

}
