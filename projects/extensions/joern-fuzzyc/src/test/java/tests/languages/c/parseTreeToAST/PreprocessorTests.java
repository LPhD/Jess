package tests.languages.c.parseTreeToAST;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import ast.logical.statements.CompoundStatement;

public class PreprocessorTests{

	@Test
	public void NestedIfndefs()
	{
		String input = "#ifdef foo\n#else\n #ifdef foo\n#else\n#endif\n#endif";
		CompoundStatement item = (CompoundStatement) FunctionContentTestUtil
				.parseAndWalk(input);
		assertEquals("The size was: "+item.getStatements().size()+
				", but we expected: 0", 0, item.getStatements().size());
	}

	@Test
	public void testPreElseSkipping()
	{
		String input = "#if foo\n bar(); #else\n foo(); foo(); #endif";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil
				.parseAndWalk(input);
		assertEquals("The size was "+contentItem.getStatements().size()+
				", but we expected: 3", 3, contentItem.getStatements().size());
	}

}
