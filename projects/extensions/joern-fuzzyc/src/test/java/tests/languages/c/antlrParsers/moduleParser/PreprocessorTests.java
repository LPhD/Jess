package tests.languages.c.antlrParsers.moduleParser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import antlr.ModuleParser;

public class PreprocessorTests extends FunctionDefinitionTests {
	
	
	@Test
	public void testPreDefineWithSpace() {
		String input = "# define foo";
		ModuleParser parser = createParser(input);
		String output = parser.code().toStringTree(parser);
		String outputExpected = "(code (pre_statement (pre_command (pre_define # define (pre_macro_identifier (identifier foo)) <EOF>))))";
		assertEquals(outputExpected, output);
	}
	
	@Test
	public void testDefiningOfKeywords() {
		String input = "#      define inline __inline";
		ModuleParser parser = createParser(input);
		String output = parser.pre_define().toStringTree(parser);
		assertTrue("Expected no water, but pre_define #      define, and pre_macro_identifier (keyword inline)), but got instead: "+output, !output.contains("water") && output.contains("pre_define #      define") &&  output.contains("pre_macro_identifier (keyword inline))"));					
	}

	@Test
	public void testPreprocIfBeforeFunc() {
		String input = "#ifdef foo \n int foo(){ #if x \n foo(); #else #endif } #endif";
		ModuleParser parser = createParser(input);
		String output = parser.code().toStringTree(parser);
		assertTrue("Expected no water and no pre_else_statement, but pre_if_statement #ifdef, function_def, and pre_endif_statement #endif, but got instead: "+output, !output.contains("water") && !output.contains("pre_else_statement") &&  output.contains("pre_if_statement #ifdef") &&  output.contains("function_def") && output.contains("pre_endif_statement #endif"));			
	}

	@Test
	public void testPreprocIfNesting() {
		String input = "#ifdef x \n #if y \n #else  #endif  #endif;";
		ModuleParser parser = createParser(input);
		String output = parser.code().toStringTree(parser);
		assertTrue("Expected no water, but pre_if_statement #ifdef, pre_if_statement #if, pre_else_statement #else, and pre_endif_statement #endif, but got instead: "+output, !output.contains("water") && output.contains("pre_if_statement #ifdef") && output.contains("pre_if_statement #if") && output.contains("pre_else_statement #else") && output.contains("pre_endif_statement #endif"));			
	}
	
	@Test
	public void testPreIfWithNestedCalls() {
		String input = "#if (CALL1(7) > 7) && CALL2(CALL3(BUBBLE)) && CALL4(BUBBLE - (1 + 5 ) )  && CALL5(BUBBLE)  \n int i;  #endif";
		ModuleParser parser = createParser(input);
		String output = parser.code().toStringTree(parser);
		assertTrue("Expected no water, but pre_if_statement #if, 5 x call_in_preStatement, and identifiers with CALL1-5, but got instead: "+output, !output.contains("water") && output.contains("pre_if_statement #if") && (output.split("call_in_preStatement", -1).length -1 == 5) 
				&& output.contains("identifier CALL1") && output.contains("identifier CALL2") && output.contains("identifier CALL3") && output.contains("identifier CALL4") && output.contains("identifier CALL5") );			
	}

	@Test
	public void testPreprocInCode() {
		String input = "#ifdef x \n int i;  #else int x; #endif";
		ModuleParser parser = createParser(input);
		String output = parser.code().toStringTree(parser);
		assertTrue("Expected no water, but pre_if_statement #ifdef, pre_else_statement #else, identifier i, identifier x, and simple_decl, but got instead: "+output, !output.contains("water") && output.contains("pre_if_statement #ifdef") && output.contains("pre_else_statement #else") && output.contains("identifier i") && output.contains("identifier x") && output.contains("simple_decl"));			
	}

	@Test
	public void testPreprocInsideAndOutsideOfFunction() {
		String input = "foo(){ #ifdef x \n #else #ifdef y \n #endif #endif abc(); } foo()";
		ModuleParser parser = createParser(input);
		String output = parser.code().toStringTree(parser);
		assertTrue("Expected no water and no pre_if_statement, but function_def and macroCall, but got instead: "+output, !output.contains("water") && !output.contains("pre_if_statement") && output.contains("function_def") && output.contains("macroCall"));					
	}

	@Test
	public void testScatteredPreProc() {
		String input = "#ifdef foo \n int foo(){ #else { #endif } abc #endif";
		ModuleParser parser = createParser(input);
		String output = parser.code().toStringTree(parser);
		assertTrue("Expected water abc, pre_if_statement #ifdef, no pre_else_statement #else, pre_endif_statement #endif, but got instead: "+output, output.contains("water abc") && output.contains("pre_if_statement #ifdef") && !output.contains("pre_else_statement #else") && output.contains("pre_endif_statement #endif"));					
	}
	
	//Currently, comments are parsed as part of the preStatement, but do not get an own object
	@Test
	public void testPreIFWithComment() {
		String input = "#if A /*Checks for A*/ \n";
		ModuleParser parser = createParser(input);
		String output = parser.code().toStringTree(parser);
		assertTrue("Expected no water and no comment, but a pre_if_statement #if, but got instead: "+output, !output.contains("water") && output.contains("pre_if_statement #if") && !output.contains("comment"));							
	}
	
	@Test
	public void testPreIfDefined() {
		String input = "#if !defined(_TRACE_KVM_H) || defined(TRACE_HEADER_MULTI_READ) \n #endif";
		ModuleParser parser = createParser(input);
		String output = parser.code().toStringTree(parser);
		assertTrue("Expected no water, but pre_if_statement #if, but got instead: "+output, !output.contains("water") && output.contains("pre_if_statement #if"));	
	}
	
	@Test
	public void testPreIncludeStatementWithBrackets() {
		String input = "#include <file.h>";
		ModuleParser parser = createParser(input);
		String output = parser.code().toStringTree(parser);
		String outputExpected = "(code (pre_statement (pre_command (pre_include #include <file.h>))))";
		assertEquals(outputExpected, output);
	}
	
	@Test
	public void testPreIncludeStatementWithQuotes() {
		String input = "#include \"something.h\"";
		ModuleParser parser = createParser(input);
		String output = parser.code().toStringTree(parser);
		String outputExpected = "(code (pre_statement (pre_command (pre_include #include (pre_include_local_file (pre_include_filename \"something.h\"))))))";
		assertEquals(outputExpected, output);
	}
	
}
