package tests.languages.c.parseTreeToAST;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.junit.Test;

import antlr.ModuleLexer;
import ast.ASTNode;
import ast.custom.CustomNode;
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
