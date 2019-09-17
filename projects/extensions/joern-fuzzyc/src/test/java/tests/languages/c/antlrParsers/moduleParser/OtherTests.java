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
	public void testMultipleLineComment() {
		String input = "/* This is a \\n multiple-line comment */ int (foo)(){}";

		ModuleParser parser = createParser(input);
		String output = parser.comment().toStringTree(parser);
		assertEquals("(comment /* This is a \\n multiple-line comment */)", output);
	}
}
