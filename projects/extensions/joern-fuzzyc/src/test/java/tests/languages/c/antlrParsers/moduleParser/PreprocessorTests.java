package tests.languages.c.antlrParsers.moduleParser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import antlr.ModuleParser;

public class PreprocessorTests extends FunctionDefinitionTests {

	@Test
	public void testPreprocessorIfs() {
		String input = "int foo(){ #if bar int i; #endif}";

		ModuleParser parser = createParser(input);
		String output = parser.function_def().toStringTree(parser);
		String outputExpected = "(function_def (return_type (type_name (base_type int))) (function_name (identifier foo)) (function_param_list ( )) (compound_statement { #if bar int i ; #endif }))";
		assertEquals(outputExpected, output);
	}

	@Test
	public void testNestedPreprocessorIfs() {
		String input = "int foo(){ #if bar #if bar2 #endif #endif}";

		ModuleParser parser = createParser(input);
		String output = parser.function_def().toStringTree(parser);
		String outputExpected = "(function_def (return_type (type_name (base_type int))) (function_name (identifier foo)) (function_param_list ( )) (compound_statement { #if bar #if bar2 #endif #endif }))";
		assertEquals(outputExpected, output);
	}

	@Test
	public void testPreprocIfBeforeFunc() {
		String input = "#ifdef foo int foo(){ #if x foo(); #else #endif } abc #endif";
		ModuleParser parser = createParser(input);
		String output = parser.code().toStringTree(parser);
		String outputExpected = "(code (pre_statement (pre_blockstarter (pre_if_statement #ifdef (pre_if_condition (condition (expr (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (cast_expression (unary_expression (postfix_expression (primary_expression (identifier foo))))))))))))))))))))))) "
				+ "(function_def (return_type (type_name (base_type int))) (function_name (identifier foo)) (function_param_list ( )) (compound_statement { #if x foo ( ) ; #else #endif })) (water abc) (pre_statement (pre_blockstarter (pre_endif_statement #endif))))";
		assertEquals(outputExpected, output);
	}

	@Test
	public void testPreprocIfNesting() {
		String input = "int foo(){ #ifdef x #ifdef y #else #endif #endif abc(); } foo();";
		ModuleParser parser = createParser(input);
		String output = parser.code().toStringTree(parser);
		String outputExpected = "(code (function_def (return_type (type_name (base_type int))) (function_name (identifier foo)) (function_param_list ( )) (compound_statement { #ifdef x #ifdef y #else #endif #endif abc ( ) ; })) (water foo) (water () (water )) (water ;))";
		assertEquals(outputExpected, output);
	}

	@Test
	public void testPreprocInCode() {
		String input = "#ifdef x int i;  #else int x; #endif";
		ModuleParser parser = createParser(input);
		String output = parser.code().toStringTree(parser);
		String outputExpected = "(code (pre_statement (pre_blockstarter (pre_if_statement #ifdef (pre_if_condition (condition (expr (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (cast_expression (unary_expression (postfix_expression (primary_expression (identifier x))))))))))))))))))))))) "
				+ "(simple_decl (var_decl (type_name (base_type int)) (init_declarator_list (init_declarator (declarator (identifier i))) ;))) (pre_statement (pre_blockstarter (pre_else_statement #else))) (simple_decl (var_decl (type_name (base_type int)) (init_declarator_list (init_declarator (declarator (identifier x))) ;))) (pre_statement (pre_blockstarter (pre_endif_statement #endif))))";
		assertEquals(outputExpected, output);
	}

	@Test
	public void testPreprocIfInElse() {
		String input = "foo(){ #ifdef x #else #ifdef y #endif #endif abc(); } foo();";
		ModuleParser parser = createParser(input);
		String output = parser.code().toStringTree(parser);
		String outputExpected = "(code (function_def (function_name (identifier foo)) (function_param_list ( )) (compound_statement { #ifdef x #else #ifdef y #endif #endif abc ( ) ; })) (water foo) (water () (water )) (water ;))";
		assertEquals(outputExpected, output);
	}

	@Test
	public void testScatteredPreProc() {
		String input = "#ifdef foo int foo(){ #else { #endif } abc #endif";
		ModuleParser parser = createParser(input);
		String output = parser.code().toStringTree(parser);
		String outputExpected = "(code (pre_statement (pre_blockstarter (pre_if_statement #ifdef (pre_if_condition (condition (expr (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (cast_expression (unary_expression (postfix_expression (primary_expression (identifier foo))))))))))))))))))))))) (function_def (return_type (type_name (base_type int))) (function_name (identifier foo)) (function_param_list ( )) (compound_statement { #else { #endif })) (water abc) (pre_statement (pre_blockstarter (pre_endif_statement #endif))))";
		assertEquals(outputExpected, output);
	}

}
