package tests.languages.c.antlrParsers.moduleParser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import antlr.ModuleParser;

public class PreprocessorTests extends FunctionDefinitionTests {

	@Test
	public void testPreprocessorIfs() {
		String input = "int foo(){ #if bar \n int i; #endif}";

		ModuleParser parser = createParser(input);
		String output = parser.function_def().toStringTree(parser);
		String outputExpected = "(function_def (return_type (type_name (base_type int))) (function_name (identifier foo)) (function_param_list ( )) (compound_statement { #if bar \\n int i ; #endif }))";
		assertEquals(outputExpected, output);
	}
	
	@Test
	public void testDefiningOfKeywords() {
		String input = "#      define inline __inline";
		ModuleParser parser = createParser(input);
		String output = parser.pre_define().toStringTree(parser);
		String outputExpected = "(pre_define #      define (pre_macro_identifier (keyword inline)) (pre_macro __inline))";
		assertEquals(outputExpected, output);
	}

	@Test
	public void testNestedPreprocessorIfs() {
		String input = "int foo(){ #if bar \n #if bar2 \n #endif #endif}";

		ModuleParser parser = createParser(input);
		String output = parser.function_def().toStringTree(parser);
		String outputExpected = "(function_def (return_type (type_name (base_type int))) (function_name (identifier foo)) (function_param_list ( )) (compound_statement { #if bar \\n #if bar2 \\n #endif #endif }))";
		assertEquals(outputExpected, output);
	}

	@Test
	public void testPreprocIfBeforeFunc() {
		String input = "#ifdef foo \n int foo(){ #if x \n foo(); #else #endif } abc #endif";
		ModuleParser parser = createParser(input);
		String output = parser.code().toStringTree(parser);
		String outputExpected = "(code (pre_statement (pre_blockstarter (pre_if_statement #ifdef (pre_if_condition (condition (expr (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (cast_expression (function_pointer_use_expression (unary_expression (postfix_expression (primary_expression (identifier foo))))))))))))))))))))) \\n))) "
				+ "(function_def (return_type (type_name (base_type int))) (function_name (identifier foo)) (function_param_list ( )) (compound_statement { #if x \\n foo ( ) ; #else #endif })) (water abc) (pre_statement (pre_blockstarter (pre_endif_statement #endif))))";
		assertEquals(outputExpected, output);
	}

	@Test
	public void testPreprocIfNesting() {
		String input = "int foo(){ #ifdef x \n #ifdef y \n #else #endif #endif abc(); } foo();";
		ModuleParser parser = createParser(input);
		String output = parser.code().toStringTree(parser);
		String outputExpected = "(code (function_def (return_type (type_name (base_type int))) (function_name (identifier foo)) (function_param_list ( )) (compound_statement { #ifdef x \\n #ifdef y \\n #else #endif #endif abc ( ) ; })) (pre_statement (pre_command (macroCall (pre_macro_identifier (identifier foo)) ( )))) (water ;))";
		assertEquals(outputExpected, output);
	}

	@Test
	public void testPreprocInCode() {
		String input = "#ifdef x \n int i;  #else int x; #endif";
		ModuleParser parser = createParser(input);
		String output = parser.code().toStringTree(parser);
		String outputExpected = "(code (pre_statement (pre_blockstarter (pre_if_statement #ifdef (pre_if_condition (condition (expr (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (cast_expression (function_pointer_use_expression (unary_expression (postfix_expression (primary_expression (identifier x))))))))))))))))))))) \\n))) "
				+ "(simple_decl (var_decl (type_name (base_type int)) (init_declarator_list (init_declarator (declarator (identifier i))) ;))) (pre_statement (pre_blockstarter (pre_else_statement #else))) (simple_decl (var_decl (type_name (base_type int)) (init_declarator_list (init_declarator (declarator (identifier x))) ;))) (pre_statement (pre_blockstarter (pre_endif_statement #endif))))";
		assertEquals(outputExpected, output);
	}

	@Test
	public void testPreprocIfInElse() {
		String input = "foo(){ #ifdef x \n #else #ifdef y \n #endif #endif abc(); } foo();";
		ModuleParser parser = createParser(input);
		String output = parser.code().toStringTree(parser);
		String outputExpected = "(code (function_def (function_name (identifier foo)) (function_param_list ( )) (compound_statement { #ifdef x \\n #else #ifdef y \\n #endif #endif abc ( ) ; })) (pre_statement (pre_command (macroCall (pre_macro_identifier (identifier foo)) ( )))) (water ;))";
		assertEquals(outputExpected, output);
	}

	@Test
	public void testScatteredPreProc() {
		String input = "#ifdef foo \n int foo(){ #else { #endif } abc #endif";
		ModuleParser parser = createParser(input);
		String output = parser.code().toStringTree(parser);
		String outputExpected = "(code (pre_statement (pre_blockstarter (pre_if_statement #ifdef (pre_if_condition (condition (expr (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (cast_expression (function_pointer_use_expression (unary_expression (postfix_expression (primary_expression (identifier foo))))))))))))))))))))) \\n))) "
				+ "(function_def (return_type (type_name (base_type int))) (function_name (identifier foo)) (function_param_list ( )) (compound_statement { #else { #endif })) (water abc) (pre_statement (pre_blockstarter (pre_endif_statement #endif))))";
		assertEquals(outputExpected, output);
	}
	
	@Test
	public void testPreIFWithComment() {
		String input = "#if A /*Checks for A*/ \n";
		ModuleParser parser = createParser(input);
		String output = parser.code().toStringTree(parser);
		String outputExpected = "(code (pre_statement (pre_blockstarter (pre_if_statement #if (pre_if_condition (condition (expr (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (cast_expression (function_pointer_use_expression (unary_expression (postfix_expression "
				+ "(primary_expression (identifier A)))))))))))))))))))))))) "
				+ "(comment /*Checks for A*/) "
				+ "(water \\n))";
		assertEquals(outputExpected, output);
	}
	
	@Test
	public void testPreProcWithSpace() {
		String input = "# define foo";
		ModuleParser parser = createParser(input);
		String output = parser.code().toStringTree(parser);
		String outputExpected = "(code (pre_statement (pre_command (pre_define # define (pre_macro_identifier (identifier foo)) pre_macro))))";
		assertEquals(outputExpected, output);
	}
	
	@Test
	public void testPreIfDefined() {
		String input = "#if !defined(_TRACE_KVM_H) || defined(TRACE_HEADER_MULTI_READ) \n #endif";
		ModuleParser parser = createParser(input);
		String output = parser.code().toStringTree(parser);
		String outputExpected = "(code (pre_statement (pre_blockstarter (pre_if_statement #if (pre_if_condition (condition (expr (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (cast_expression (function_pointer_use_expression (unary_expression (unary_op_and_cast_expr (unary_operator !) (cast_expression (function_pointer_use_expression (unary_expression (defined_expression defined ( (expr (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (cast_expression (function_pointer_use_expression (unary_expression (postfix_expression (primary_expression (identifier _TRACE_KVM_H))))))))))))))))))) )))))))))))))))))) || (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (cast_expression (function_pointer_use_expression (unary_expression (defined_expression defined ( (expr (assign_expr (conditional_expression (or_expression (and_expression (inclusive_or_expression (exclusive_or_expression (bit_and_expression (equality_expression (relational_expression (shift_expression (additive_expression (multiplicative_expression (cast_expression (function_pointer_use_expression (unary_expression (postfix_expression (primary_expression (identifier TRACE_HEADER_MULTI_READ))))))))))))))))))) ))))))))))))))))))))) \\n))) (pre_statement (pre_blockstarter (pre_endif_statement #endif))))";
		assertEquals(outputExpected, output);
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
