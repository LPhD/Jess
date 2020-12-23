package tests.languages.c.antlrParsers.moduleParser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import antlr.ModuleParser;

public class OtherTests extends FunctionDefinitionTests {

	@Test
	public void testNestedFunctionName() {
		String input = "int (foo)(){}";

		ModuleParser parser = createParser(input);
		String output = parser.function_def().toStringTree(parser);
		assertTrue(output.startsWith("(function_def "));
	}
	
	@Test
	public void testDecl() {
		String input = "static int blogic_diskparam(struct scsi_device *sdev);";

		ModuleParser parser = createParser(input);
		String output = parser.simple_decl().toStringTree(parser);
		assertEquals("(simple_decl (var_decl (type_name (function_decl_specifiers static) (base_type int)) "
				+ "(init_declarator_list (init_declarator (declarator (identifier blogic_diskparam) "
				+ "(type_suffix (param_type_list ( (param_type (param_decl_specifiers (type_name (base_type struct scsi_device) "
				+ "(ptr_operator *) "
				+ "(base_type sdev))) param_type_id) "
				+ "))))) ;)))", output);
	}
	
	
	@Test
	public void testDeclWithParamVarArgs() {
		String input = "void log_debug(const char *fmt, ...);";

		ModuleParser parser = createParser(input);
		String output = parser.simple_decl().toStringTree(parser);
		assertEquals("(simple_decl (var_decl (type_name (base_type void)) "
				+ "(init_declarator_list (init_declarator (declarator (identifier log_debug) "
				+ "(type_suffix (param_type_list ( (param_type (param_decl_specifiers (type_name const (base_type char) (ptr_operator *) (base_type fmt))) param_type_id) "
				+ ", (param_type ...) ))))) ;)))", output);
	}
	
	@Test
	public void testDeclWithAttributeMacro() {
		String input = "extern ptrdiff_t kwsexec (kwset_t, char const *, ptrdiff_t,\n" + 
				"                          struct kwsmatch *, bool)\n" + 
				"  _GL_ARG_NONNULL ((4));";

		ModuleParser parser = createParser(input);
		String output = parser.simple_decl().toStringTree(parser);
		assertEquals("(simple_decl (var_decl (type_name extern (base_type ptrdiff_t)) (init_declarator_list (init_declarator (declarator (identifier kwsexec) (type_suffix (param_type_list ( (param_type (param_decl_specifiers (type_name (base_type kwset_t))) param_type_id) , (param_type (param_decl_specifiers (type_name (base_type char) const (ptr_operator *))) param_type_id) , (param_type (param_decl_specifiers (type_name (base_type ptrdiff_t))) param_type_id) , \\n (param_type (param_decl_specifiers (type_name (base_type struct kwsmatch) (ptr_operator *))) param_type_id) , (param_type (param_decl_specifiers (type_name (base_type bool))) param_type_id) )))) \\n) (pre_other _GL_ARG_NONNULL ( ( (attributeList (attribute (constant 4))) ) )) ;)))", output);
	}
	
	@Test
	public void testOperatorOverloading() {
		String input = "inline bool operator == (const PlMessageHeader &b) const {}";

		ModuleParser parser = createParser(input);
		String output = parser.function_def().toStringTree(parser);

		assertTrue(output.startsWith("(function_def "));
	}

	@Test
	public void testExceptionSpecificationCpp() {
		String input = "int foo() throw(){}";

		ModuleParser parser = createParser(input);
		String output = parser.function_def().toStringTree(parser);

		assertTrue(output.startsWith("(function_def "));
	}
	
	@Test
	public void testOneLineComment() {
		String input = "//This is a one-line comment \n int (foo)(){}";

		ModuleParser parser = createParser(input);
		String output = parser.comment().toStringTree(parser);
		assertEquals("(comment //This is a one-line comment \\n)", output);
	}
	
	@Test
	public void testOneLineCommentWithEnding() {
		String input = "/* This file contains examples from https://github.com/torvalds/linux/drivers/scsi/BusLogic.h */\n" + 
				"" + 
				"	/* Bit 7 */\n" + 
				"" + 
				"\n";

		ModuleParser parser = createParser(input);
		String output = parser.comment().toStringTree(parser);
		assertEquals("(comment /* This file contains examples from https://github.com/torvalds/linux/drivers/scsi/BusLogic.h */)", output);
	}
		
	@Test
	public void testMultipleLineComment() {
		String input = "/* This is a \\n multiple-line comment */ int (foo)(){}";

		ModuleParser parser = createParser(input);
		String output = parser.comment().toStringTree(parser);
		assertEquals("(comment /* This is a \\n multiple-line comment */)", output);
	}
}
