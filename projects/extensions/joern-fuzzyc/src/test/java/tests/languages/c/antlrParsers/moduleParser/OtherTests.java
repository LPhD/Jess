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
		assertEquals("(simple_decl (var_decl static (type_name (base_type int)) "
				+ "(init_declarator_list (init_declarator (declarator (identifier blogic_diskparam) "
				+ "(type_suffix (param_type_list ( (param_type (param_decl_specifiers (type_name struct (base_type scsi_device))) "
				+ "(param_type_id (ptrs (ptr_operator *)) "
				+ "(parameter_name (identifier sdev)))) "
				+ "))))) ;)))", output);
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
