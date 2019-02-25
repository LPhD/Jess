package tests.languages.c.parseTreeToAST;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import ast.logical.statements.CompoundStatement;

public class PreprocessorTests {

	@Test
	public void NestedIfndefs() {
		String input = "#ifdef foo\n #else\n #ifdef foo\n #else\n #endif\n #endif";
		CompoundStatement item = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals(6, item.getStatements().size());
	}

	@Test
	public void testPreElseStatements() {
		String input = "#if foo\n bar(); #else\n foo(); foo(); #endif";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreElseStatement", contentItem.getStatement(2).getTypeAsString());
	}

	@Test
	public void preIfStatement() {
		String input = "#if foo \n int i; #endif";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreIfStatement", contentItem.getStatement(0).getTypeAsString());
	}
	
	@Test
	public void testPreElIfStatements() {
		String input = "#if foo\n bar(); #elif\n foo(); foo(); #endif";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreElIfStatement", contentItem.getStatement(2).getTypeAsString());
	}
	
	@Test
	public void preEndIfStatement() {
		String input = "#if bar \n int i; #endif";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreEndIfStatement", contentItem.getStatement(2).getTypeAsString());
	}
	
	@Test
	public void preIfWithBracketsAroundCondition() {
		String input = "#if (foo < 5) \n int i; #endif";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals(3, contentItem.getStatements().size());
	}
	
	@Test
	public void preIfWithNestedCondition() {
		String input = "#if (foo < 5 && ( x < 1 || x > 5 )) \n int i; #endif";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals(3, contentItem.getStatements().size());
	}
	
	@Test
	public void testPreIncludeStatement() {
		String input = "#include <file.h> \n #include \"something\"";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		System.out.println(contentItem.getStatement(0).getTypeAsString());
		System.out.println(contentItem.getStatement(0).getEscapedCodeStr());
		System.out.println(contentItem.getStatement(1).getTypeAsString());
		System.out.println(contentItem.getStatement(1).getEscapedCodeStr());
		System.out.println(contentItem.getStatement(2).getTypeAsString());
		System.out.println(contentItem.getStatement(2).getEscapedCodeStr());
		assertEquals("PreInclude", contentItem.getStatement(0).getTypeAsString());
		assertEquals("PreInclude", contentItem.getStatement(1).getTypeAsString());
	}
	

}
