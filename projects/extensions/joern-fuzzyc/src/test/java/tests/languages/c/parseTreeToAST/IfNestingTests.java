package tests.languages.c.parseTreeToAST;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ast.c.statements.blockstarters.ElseStatement;
import ast.c.statements.blockstarters.IfStatement;
import ast.expressions.Expression;
import ast.logical.statements.BlockStarter;
import ast.logical.statements.CompoundStatement;
import ast.logical.statements.Condition;

public class IfNestingTests {

	@Test
	public void ifBlockCompound() {
		String input = "if(foo){}";
		CompoundStatement compound = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertFirstChildIsIfStatement(compound);
	}
	
	@Test
	public void ifWithComplexCondition() {
		String input = "  if (XML_GetErrorCode(ext_parser) != fault->error)\n" + 
				"    xml_failure(ext_parser);";
		IfStatement ifStatement = (IfStatement) FunctionContentTestUtil.parseAndWalk(input).getChild(0);
		assertEquals("if ( XML_GetErrorCode ( ext_parser ) != fault -> error )",ifStatement.getEscapedCodeStr());
	}

	@Test
	public void ifWithFunctionPointerInCondition() {
		String input = "     if ((*filter)(dirname, entry, baton) == FALSE) {\n" + 
				"        continue;\n" + 
				"    }";
		IfStatement ifStatement = (IfStatement) FunctionContentTestUtil.parseAndWalk(input).getChild(0);
		assertEquals("if ( ( * filter ) ( dirname , entry , baton ) == FALSE )",ifStatement.getEscapedCodeStr());
		assertEquals("( * filter ) ( dirname , entry , baton ) == FALSE", ifStatement.getCondition().getEscapedCodeStr());
		assertEquals("( * filter ) ( dirname , entry , baton )",ifStatement.getCondition().getChild(0).getChild(0).getEscapedCodeStr());
	}
	

	@Test
	public void ifBlockNoCompound() {
		String input = "if(foo) bar();";
		CompoundStatement compound = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertFirstChildIsIfStatement(compound);
	}
	
	@Test
	public void ifWithMultipleLineCondition() {
		String input = "if (MultiByteToWideChar(cp, MB_PRECOMPOSED | MB_ERR_INVALID_CHARS, &c, 1,\n" + 
				"			&n, 1)\n" + 
				"			== 1)";
		CompoundStatement compound = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertFirstChildIsIfStatement(compound);
	}
	
	@Test
	public void ifWithMultipleLineConditionInlineCommentsLinebreaksAndOtherComplexStuff() {
		String input = "  if (fd == STDIN_FILENO\n" + 
				"      && (outleft\n" + 
				"          ? (!ineof\n" + 
				"             && (seek_failed\n" + 
				"                 || (lseek (fd, 0, SEEK_END) < 0\n" + 
				"                     /* Linux proc file system has EINVAL (Bug#25180).  */\n" + 
				"                     && errno != EINVAL))\n" + 
				"             && ! drain_input (fd, st))\n" + 
				"          : (bufoffset != after_last_match && !seek_failed\n" + 
				"             && lseek (fd, after_last_match, SEEK_SET) < 0)))";
		CompoundStatement compound = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertFirstChildIsIfStatement(compound);
	}

	@Test
	public void nestedIfBlocksNoCompound() {
		String input = "if(foo) if(fooAgain) bar();";
		CompoundStatement compound = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IfStatement ifStatement = (IfStatement) compound.getStatements().get(0);
		IfStatement innerStatement = (IfStatement) ifStatement.getStatement();

		assertFirstChildIsIfStatement(compound);
		assertTrue(innerStatement.getCondition() != null);
	}

	@Test
	public void conditionString() {
		String input = "if(foo){}";
		CompoundStatement item = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		BlockStarter starter = (BlockStarter) item.getStatements().get(0);
		Expression condition = ((Condition) starter.getCondition()).getExpression();
		assertEquals("foo", condition.getEscapedCodeStr());
	}
	
	@Test
	public void conditionWithCall() {
		String input = "if (!timercmp(&time_now, &limit_time, <)){}";
		CompoundStatement item = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		BlockStarter starter = (BlockStarter) item.getStatements().get(0);
		Expression condition = ((Condition) starter.getCondition()).getExpression();
		assertEquals("! timercmp ( & time_now , & limit_time , < )", condition.getEscapedCodeStr());
	}
	
	@Test
	public void ifInForWithUnusualInitAndOtherComplexStuff() {
		String input = "if (match_words)\n" + 
				"        for (try = beg; ; )\n" + 
				"          {\n" + 
				"            if (wordchar (mb_prev_wc (buf, try, buf + size)))\n" + 
				"              break;\n" + 
				"            if (wordchar (mb_next_wc (try + len, buf + size)))\n" + 
				"              {\n" + 
				"                if (!len)\n" + 
				"                  break;\n" + 
				"                offset = kwsexec (kwset, beg, --len, &kwsmatch);\n" + 
				"                if (offset == (size_t) -1)\n" + 
				"                  break;\n" + 
				"                try = beg + offset;\n" + 
				"                len = kwsmatch.size[0];\n" + 
				"              }\n" + 
				"            else if (!start_ptr)\n" + 
				"              goto success;\n" + 
				"            else\n" + 
				"              goto success_in_beg_and_len;\n" + 
				"          } /* for (try) */";
		CompoundStatement item = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		BlockStarter starter = (BlockStarter) item.getStatements().get(0);
		assertEquals("if ( match_words )", starter.getEscapedCodeStr());
	}
	

	@Test
	public void ifElse() {
		String input = "if(foo) lr->f = stdin; else lr->f = fopen(pathname, \"r\");";
		CompoundStatement compound = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);

		assertFirstChildIsIfStatement(compound);
		assertFirstIfHasElse(compound);
	}

	@Test
	public void ifElseChain() {
		String input = "if(foo1) bar1(); else if(foo2) bar2(); else if(foo3) bar3();";
		CompoundStatement compound = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);

		IfStatement ifItem = (IfStatement) compound.getStatements().get(0);
		for (int i = 0; i < 2; i++) {
			assertHasElse(ifItem);
			ifItem = (IfStatement) ifItem.getElseNode().getStatement();
		}
	}

	@Test
	public void ifInElse() {
		String input = "if (foo1){} else { if (foo2) { foo(); } }";
		CompoundStatement compound = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IfStatement ifItem = (IfStatement) compound.getStatements().get(0);

		assertFirstChildIsIfStatement(compound);
		assertFirstIfHasElse(compound);

		ElseStatement elseNode = ifItem.getElseNode();
		CompoundStatement innerCompound = (CompoundStatement) elseNode.getStatement();
		assertEquals(2, innerCompound.getChildCount());
		IfStatement innerIf = (IfStatement) innerCompound.getChild(0);
		assertTrue(innerIf.getCondition() != null);
	}

	private void assertFirstChildIsIfStatement(CompoundStatement compound) {
		IfStatement ifStatement = (IfStatement) compound.getStatements().get(0);
		assertEquals(1, compound.getStatements().size());
		assertTrue(ifStatement.getCondition() != null);
	}

	private void assertFirstIfHasElse(CompoundStatement compound) {
		IfStatement ifItem = (IfStatement) compound.getStatements().get(0);
		assertHasElse(ifItem);
	}

	private void assertHasElse(IfStatement ifItem) {
		ElseStatement elseNode = ifItem.getElseNode();
		assertTrue(elseNode != null);
		assertTrue(elseNode.getChild(0) != null);
	}

}
