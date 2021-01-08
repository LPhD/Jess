package tests.udg;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import cfg.ASTToCFGConverter;
import cfg.CCFGFactory;
import cfg.CFG;
import tests.TestDBTestsBatchInserter;
import udg.CFGToUDGConverter;
import udg.useDefAnalysis.CASTDefUseAnalyzer;
import udg.useDefGraph.UseDefGraph;

public class testUseDefGraphCreator extends TestDBTestsBatchInserter {

	ASTToCFGConverter astToCFG;
	CFGToUDGConverter cfgToUDG;

	@Before
	public void init() {
		astToCFG = new ASTToCFGConverter();
		astToCFG.setFactory(new CCFGFactory());
		cfgToUDG = new CFGToUDGConverter();
		cfgToUDG.setASTDefUseAnalyzer(new CASTDefUseAnalyzer());
	}

	@Test
	public void test_struct_field_assign_def() {
		UseDefGraph useDefGraph = createUDGForCode("int ddg_test_struct(){ struct my_struct foo; foo.bar = 10; copy_somehwere(foo); }");
		//One use, one def
		assertEquals(2, useDefGraph.getUsesAndDefsForSymbol("foo . bar").size());
	}

	@Test
	public void test_def_tainted_call() {
		String code = ("int f(){foo(x);}");
		CFG cfg = getCFGForCode(code);
		
		CFGToUDGConverter myCFGToUDG = new CFGToUDGConverter();
		myCFGToUDG.setASTDefUseAnalyzer(new CASTDefUseAnalyzer());
		((CASTDefUseAnalyzer) myCFGToUDG.getASTDefUseAnalyzer()).addTaintSource("foo", 0);
		UseDefGraph useDefGraph = myCFGToUDG.convert(cfg);

		assertEquals(4, useDefGraph.getUsesAndDefsForSymbol("x").size());
	}

	@Test
	public void test_plusEquals_asssignment() {
		UseDefGraph useDefGraph = createUDGForCode("int f(){ x += y; }");
		assertEquals(4, useDefGraph.getUsesAndDefsForSymbol("x").size());
		assertEquals(2, useDefGraph.getUsesAndDefsForSymbol("y").size());
	}

	@Test
	public void test_condition() {
		UseDefGraph useDefGraph = createUDGForCode("int condition_test() { if(x && y) return 0; if(z) return 1; }");
		assertEquals(1, useDefGraph.getUsesAndDefsForSymbol("x").size());
		assertEquals(1, useDefGraph.getUsesAndDefsForSymbol("y").size());
		assertEquals(1, useDefGraph.getUsesAndDefsForSymbol("z").size());
	}

	// Test that expressions are simplified, e.g. lack of an "& * a" element
	@Test
	public void test_simplified_expression() {
		UseDefGraph useDefGraph = createUDGForCode("int test() { func(&a[0]); }");
		assertEquals(useDefGraph.keySet().size(), 1);
		assertTrue(useDefGraph.keySet().contains("a"));
	}
	
	@Test
	public void test_complex_function_UDG() {
		UseDefGraph useDefGraph = createUDGForCode("void bubblesort(int *array, int length) {\n" + 
				"	int i, j;\n" + 
				"	for (i = 0; i < length - 1; ++i) {\n" + 
				"		for (j = 0; j < length - i - 1; ++j) {\n" + 
				"			if (array[j] > array[j + 1]) {\n" + 
				"				int tmp = array[j];\n" + 
				"				array[j] = array[j + 1];\n" + 
				"				array[j + 1] = tmp;\n" + 
				"			}\n" + 
				"		}\n" + 
				"	}\n" + 
				"}");
		//5 Different variables
		assertEquals(5, useDefGraph.keySet().size());
		assertEquals(5, useDefGraph.getUsesAndDefsForSymbol("tmp").size());
		assertEquals(8, useDefGraph.getUsesAndDefsForSymbol("i").size());
	}
	
	@Test
	public void testFunctionWithVoidParameter_UDG() {
		UseDefGraph useDefGraph = createUDGForCode("int test() { "
				+ "int something = 0;"
				+ "void (*post_reader_func)(void) = NULL;}");
		//Just one define (from the first statement), as the second one is a functionPointer
		assertEquals(1, useDefGraph.keySet().size());
	}
	
	@Test
	public void testFunctionWithDeclOutsideOfParantheses_UDG() {
		UseDefGraph useDefGraph = createUDGForCode("pointer\n" + 
				"alloca (size)\n" + 
				"     size_t size;\n" + 
				"{return size;}");
		assertEquals(1, useDefGraph.keySet().size());
	}
	

	private UseDefGraph createUDGForCode(String code) {
		CFG cfg = getCFGForCode(code);
		return cfgToUDG.convert(cfg);
	}

	public CFG getCFGForCode(String input) {
		CFGCreator cfgCreator = new CFGCreator();
		return cfgCreator.getCFGForCode(input);
	}

}
