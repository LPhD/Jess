package tests.languages.c.antlrParsers.moduleParser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import antlr.ModuleParser;

public class PreprocessorTests extends FunctionDefinitionTests
{

	@Test
	public void testPreprocessorIfs()
	{
		String input = "int foo(){ #if bar\n int i; #endif\n }";

		ModuleParser parser = createParser(input);
		String output = parser.function_def().toStringTree(parser);
		String outputExpected = "\"(function_def \")";
		assertEquals(outputExpected, output);
	}

	@Test
	public void testNestedPreprocessorIfs()
	{
		String input = "int foo(){ #if bar\n #if bar2\n { #endif\n #endif\n}";

		ModuleParser parser = createParser(input);
		String output = parser.function_def().toStringTree(parser);
		String outputExpected = "\"(function_def \"";
		assertEquals(outputExpected, output);
	}

	@Test
	public void testPreprocIfBeforeFunc()
	{
		String input = "#ifdef foo\nint foo(){ #if x\n foo();\n #else\n #endif\n} abc\n #endif\n";
		ModuleParser parser = createParser(input);
		String output = parser.code().toStringTree(parser);
		String outputExpected = "(water abc)";
		assertEquals(outputExpected, output);
	}

	@Test
	public void testPreprocIfNesting()
	{
		String input = "foo(){ #ifdef x\n #ifdef y\n #else\n #endif\n#endif\n abc(); } foo();";
		ModuleParser parser = createParser(input);
		String output = parser.code().toStringTree(parser);
		String outputExpected = "(compound_statement { #ifdef x\\n #ifdef y\\n #else\\n #endif\\n #endif\\n abc ( ) ; }))";
		assertEquals(outputExpected, output);
	}

	@Test
	public void testPreprocIfInElse()
	{
		String input = "foo(){ #ifdef x\n #else\n #ifdef y\n #endif\n#endif\n abc(); } foo();";
		ModuleParser parser = createParser(input);
		String output = parser.code().toStringTree(parser);
		String outputExpected = "(compound_statement { #ifdef x\\n #else\\n #ifdef y\\n #endif\\n #endif\\n abc ( ) ; }))";
		assertEquals(outputExpected, output);
	}

	@Test
	public void testStartingPreProcElse()
	{
		String input = "#ifdef foo\n int foo(){ #else\n {\n#endif\n } abc\n #endif\n";
		ModuleParser parser = createParser(input);
		String output = parser.code().toStringTree(parser);
		String outputExpected = "(water abc)";
		assertEquals(outputExpected, output);
	}

}
