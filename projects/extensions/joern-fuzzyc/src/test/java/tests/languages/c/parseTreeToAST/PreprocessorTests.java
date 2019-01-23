package tests.languages.c.parseTreeToAST;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import ast.logical.statements.CompoundStatement;

public class PreprocessorTests {

	// Stack is empty exception?
	@Test
	public void NestedIfndefs() {
		String input = "#ifdef foo\n #else\n #ifdef foo\n #else\n #endif\n #endif";
		CompoundStatement item = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals(0, item.getStatements().size());
	}

	@Test
	public void testPreElseStatements() {
		String input = "#if foo\n bar(); #else\n foo(); foo(); #endif";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals(3, contentItem.getStatements().size());
	}

	@Test
	public void preIfAndElseStatement() {
		String input = "#if foo\\n #endif";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		System.out.println(contentItem.getStatements());
		System.out.println(contentItem.getStatement(0).getTypeAsString());
		assertEquals("PreIfStatement", contentItem.getStatement(0).getTypeAsString());
		assertEquals("PreElseStatement", contentItem.getStatement(1).getTypeAsString());
	}

}
