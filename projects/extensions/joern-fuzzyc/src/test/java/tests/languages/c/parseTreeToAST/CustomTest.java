package tests.languages.c.parseTreeToAST;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.junit.Test;

import antlr.ModuleLexer;
import ast.ASTNode;
import ast.c.preprocessor.commands.macro.PreDefine;
import ast.custom.CustomNode;
import ast.statements.IdentifierDeclStatement;
import parsing.TokenSubStream;
import parsing.Modules.ANTLRCModuleParserDriver;

public class CustomTest {
		
	
	@Test
	public void testExternC() {
		//TODO The closing bracket is missing here
		String input = "extern \"C\" {";
		List<ASTNode> codeItems = parseInput(input);
		CustomNode codeItem = (CustomNode) codeItems.get(0);		
		assertEquals("extern \"C\" {", codeItem.getEscapedCodeStr());
	}
	
	@Test
	public void testAscii() {
		String input = "/* 0x00 */ BT_NONXML, BT_NONXML, BT_NONXML, BT_NONXML,";
		List<ASTNode> codeItems = parseInput(input);
		CustomNode codeItem = (CustomNode) codeItems.get(0);		
		assertEquals("BT_NONXML , BT_NONXML , BT_NONXML , BT_NONXML ,", codeItem.getEscapedCodeStr());
	}
	
	
	@Test
	public void testSTART_TEST() {
		String input = "#define START_TEST(testname)                        \\\n" + 
				"  static void testname(void) {                             \\\n" + 
				"    _check_set_test_info(__func__, __FILE__, __LINE__);    \\\n" + 
				"    {";
		List<ASTNode> codeItems = parseInput(input);
		PreDefine codeItem = (PreDefine) codeItems.get(0);			
		assertEquals("#define START_TEST( testname ) \\\n" + 
				" static void testname ( void ) { \\\n" + 
				" _check_set_test_info ( __func__ , __FILE__ , __LINE__ ) ; \\\n" + 
				" {", codeItem.getEscapedCodeStr());
	}
	
	@Test
	public void testEND_TEST() {
		String input = "#define END_TEST    \\\n" + 
				"  }                        \\\n" + 
				"  }";
		List<ASTNode> codeItems = parseInput(input);
		PreDefine codeItem = (PreDefine) codeItems.get(0);		
		assertEquals("#define END_TEST \\\n" + 
				" } \\\n" + 
				" }", codeItem.getEscapedCodeStr());
	}
	
	@Test
	public void testMacroFunctionPointer() {
		String input = "XMLPARSEAPI(void *)\n" + 
				"XML_ATTR_ALLOC_SIZE(3)\n" + 
				"XML_MemRealloc(XML_Parser parser, void *ptr, size_t size);";
		List<ASTNode> codeItems = parseInput(input);
		IdentifierDeclStatement codeItem = (IdentifierDeclStatement) codeItems.get(0);		
		assertEquals("XMLPARSEAPI ( void * ) \n" + 
				" XML_ATTR_ALLOC_SIZE ( 3 ) \n" + 
				" XML_MemRealloc ( XML_Parser parser , void * ptr , size_t size ) ;", codeItem.getEscapedCodeStr());
	}


	private List<ASTNode> parseInput(String input) {
		ANTLRCModuleParserDriver parser = new ANTLRCModuleParserDriver();
		TestASTWalker testProcessor = new TestASTWalker();
		parser.addObserver(testProcessor);

		ANTLRInputStream inputStream = new ANTLRInputStream(input);
		ModuleLexer lex = new ModuleLexer(inputStream);
		TokenSubStream tokens = new TokenSubStream(lex);

		parser.parseAndWalkTokenStream(tokens);
		return testProcessor.codeItems;
	}

}
