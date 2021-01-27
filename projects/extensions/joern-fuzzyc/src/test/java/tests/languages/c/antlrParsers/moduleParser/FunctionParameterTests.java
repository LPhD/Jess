package tests.languages.c.antlrParsers.moduleParser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import antlr.ModuleParser;

public class FunctionParameterTests extends FunctionDefinitionTests {

	@Test
	public void testFunctionPtrParam() {
		String input = "int foo(char *(*param)(void)){}";

		ModuleParser parser = createParser(input);
		String output = parser.function_def().toStringTree(parser);

		assertEquals("(function_def (return_type (type_name (base_type int))) (function_name (identifier foo)) (function_param_list ( (parameter_decl_clause (parameter_decl (type_name (base_type char) (ptr_operator *)) (parameter_id ( (parameter_id (ptrs (ptr_operator *)) (parameter_name (identifier param))) ) (type_suffix (param_type_list ( void )))))) )) (compound_statement { }))",output);
	}

	@Test
	public void testVoidParamList() {
		String input = "static int altgid(void){}";
		ModuleParser parser = createParser(input);
		String output = parser.function_def().toStringTree(parser);
		assertEquals("(function_def (return_type (function_decl_specifiers static) (type_name (base_type int))) (function_name (identifier altgid)) (function_param_list ( (parameter_decl_clause (parameter_decl void)) )) (compound_statement { }))", output);
	}
	
	@Test
	public void testLinebreakInDefinition() {
		String input = "static int\n" + 
				"xmlstrlen(const XML_Char *s){}";
		ModuleParser parser = createParser(input);
		String output = parser.function_def().toStringTree(parser);
		assertEquals("(function_def (return_type (function_decl_specifiers static) (type_name (base_type int (expression_fragment \\n)))) "
				+ "(function_name (identifier xmlstrlen)) (function_param_list ( (parameter_decl_clause (parameter_decl (type_name const (base_type XML_Char) (ptr_operator *)) (parameter_id (parameter_name (identifier s))))) )) (compound_statement { }))", output);
	}
	
	@Test
	public void testLinebreakInParameters() {
		String input = " void proc3(int a3, int b3,\n int c3, int d3) {}";
		ModuleParser parser = createParser(input);
		String output = parser.function_def().toStringTree(parser);
		String expected = "(function_def (return_type (type_name (base_type void))) (function_name (identifier proc3)) "
				+ "(function_param_list ( "
				+ "(parameter_decl_clause "
				+ "(parameter_decl (type_name (base_type int)) (parameter_id (parameter_name (identifier a3)))) , "
				+ "(parameter_decl (type_name (base_type int)) (parameter_id (parameter_name (identifier b3)))) , "
				+ "(expression_fragment \\n) "
				+ "(parameter_decl (type_name (base_type int)) (parameter_id (parameter_name (identifier c3)))) , "
				+ "(parameter_decl (type_name (base_type int)) (parameter_id (parameter_name (identifier d3))))) "
				+ ")) "
				+ "(compound_statement { }))";
		assertEquals(expected, output);
	}

	@Test
	public void testParamVoidPtr() {
		String input = "static int altgid(void *ptr){}";

		ModuleParser parser = createParser(input);
		String output = parser.function_def().toStringTree(parser);
		assertTrue(output.startsWith("(function_def"));
	}

	@Test
	public void testLinux__user() {
		String input = "static long aio_read_events_ring(struct kioctx *ctx, struct io_event __user *event, long nr){}";

		ModuleParser parser = createParser(input);
		String output = parser.function_def().toStringTree(parser);
		assertTrue(output.startsWith("(function_def"));
	}

	@Test
	public void testParamConstVoidPtr() {
		String input = "static ssize_t _7z_write_data(struct archive_write *a, const void *buff, size_t s){}";

		ModuleParser parser = createParser(input);
		String output = parser.function_def().toStringTree(parser);
		assertTrue(output.startsWith("(function_def"));
	}
	
	@Test
	public void testParamDeclOutsideOfParantheses() {
		String input = "pointer\n" + 
				"alloca (size)\n" + 
				"     size_t size;\n" + 
				"{ return size;}";

		ModuleParser parser = createParser(input);
		String output = parser.function_def().toStringTree(parser);
		assertEquals("(function_def (return_type (type_name (base_type pointer (expression_fragment \\n)))) (function_name (identifier alloca)) (function_param_list ( (parameter_name (identifier size)) ) (expression_fragment \\n) (type_name (base_type size_t)) (parameter_id (parameter_name (identifier size))) ; (expression_fragment \\n)) (compound_statement { return size ; }))",output);
	}
	
	
	@Test
	public void testFunctionWithNewlines() {
		String input = "int\n" + 
				"main(int argc, char *argv[])\n" + 
				"{\n" + 
				"    return windows_main(argc, argv);\n" + 
				"}";

		ModuleParser parser = createParser(input);
		String output = parser.function_def().toStringTree(parser);

		assertEquals("(function_def (return_type (type_name (base_type int (expression_fragment \\n)))) (function_name (identifier main)) (function_param_list ( (parameter_decl_clause (parameter_decl (type_name (base_type int)) (parameter_id (parameter_name (identifier argc)))) , (parameter_decl (type_name (base_type char) (ptr_operator *)) (parameter_id (parameter_name (identifier argv)) (type_suffix [ constant_expr_w_ ])))) )) (expression_fragment \\n) (compound_statement { \\n return windows_main ( argc , argv ) ; \\n }))", output);
	}
	
	@Test
	public void testFunctionWithNewlinesAndNonBaseReturnType() {
		String input = "size_t\n" + 
				"wordchar_prev (char const *buf, char const *cur, char const *end)\n" + 
				"{}";
		ModuleParser parser = createParser(input);
		String output = parser.function_def().toStringTree(parser);

		assertEquals("(function_def (return_type (type_name (base_type size_t (expression_fragment \\n)))) (function_name (identifier wordchar_prev)) (function_param_list ( (parameter_decl_clause (parameter_decl (type_name (base_type char) const (ptr_operator *)) (parameter_id (parameter_name (identifier buf)))) , (parameter_decl (type_name (base_type char) const (ptr_operator *)) (parameter_id (parameter_name (identifier cur)))) , (parameter_decl (type_name (base_type char) const (ptr_operator *)) (parameter_id (parameter_name (identifier end))))) )) (expression_fragment \\n) (compound_statement { }))", output);
	}
}
