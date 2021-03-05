package tests.languages.c.antlrParsers.moduleParser;

import static org.junit.Assert.assertEquals;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import antlr.ModuleLexer;
import antlr.ModuleParser;


public class ClassDeclarationTest {

	private ModuleParser createParser(String input) {
		ANTLRInputStream inputStream = new ANTLRInputStream(input);
		ModuleLexer lex = new ModuleLexer(inputStream);
		CommonTokenStream tokens = new CommonTokenStream(lex);
		ModuleParser parser = new ModuleParser(tokens);
		return parser;
	}

	@Test
	public void testFunctionPrototype() {
		String input = "int foo(int x);";
		ModuleParser parser = createParser(input);
		String output = parser.simple_decl().toStringTree(parser);
		assertEquals("(simple_decl (var_decl (type_name (base_type int)) "
				+ "(init_declarator_list (init_declarator (declarator (identifier foo)"
				+ " (type_suffix (param_type_list ( (param_type (type_name (base_type int x))"
				+ " param_type_id) ))))) ;)))", output);
	}

//	@Test
//	public void testClassContentExtraction() {
//		String input = "class foo{ foobar; }";
//
//		ModuleParser parser = createParser(input);
//		Class_defContext class_def = parser.class_def();
//
//		int startIndex = class_def.OPENING_CURLY().getSymbol().getTokenIndex();
//		int stopIndex = class_def.stop.getTokenIndex();
//		assertEquals(2, startIndex);
//		assertEquals(5, stopIndex);
//	}

}
