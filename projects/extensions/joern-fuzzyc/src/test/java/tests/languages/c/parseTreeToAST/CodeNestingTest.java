package tests.languages.c.parseTreeToAST;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import antlr.FunctionParser.StatementsContext;
import ast.Comment;
import ast.c.expressions.CallExpression;
import ast.c.statements.blockstarters.ElseStatement;
import ast.c.statements.blockstarters.IfStatement;
import ast.declarations.IdentifierDecl;
import ast.expressions.Argument;
import ast.expressions.ArgumentList;
import ast.expressions.AssignmentExpression;
import ast.expressions.ForInit;
import ast.expressions.Identifier;
import ast.logical.statements.BlockStarter;
import ast.logical.statements.CompoundStatement;
import ast.logical.statements.Condition;
import ast.statements.ExpressionStatement;
import ast.statements.IdentifierDeclStatement;
import ast.statements.StructUnionEnum;
import ast.statements.blockstarters.ForStatement;
import ast.statements.blockstarters.WhileStatement;

public class CodeNestingTest {

	@Test
	public void testLineNumbers() {
		String input = "if(foo)\nbar();\nfoo()\n";
		StatementsContext ctx = (StatementsContext) FunctionContentTestUtil.parse(input);
		assertEquals(1, ctx.start.getLine());
		assertEquals(3, ctx.stop.getLine());
	}

	@Test
	public void emptyContent() {
		String input = "";
		CompoundStatement item = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals(0, item.getStatements().size());
	}

	@Test
	public void compoundWithoutBlockStart() {
		String input = "bar(); {}";
		CompoundStatement item = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals(2, item.getStatements().size());
	}

	@Test
	public void assignmentInCondition() {
		String input = "if(foo = bar){}";
		CompoundStatement item = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		BlockStarter starter = (BlockStarter) item.getStatements().get(0);
		AssignmentExpression condition = (AssignmentExpression) ((Condition) starter.getCondition()).getExpression();
		assertEquals("foo = bar", condition.getEscapedCodeStr());
	}

	@Test
	public void whileInElse() {
		String input = "if(foo){bar();}else{ while(foo1){ if(bar2){bar2;} } }";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IfStatement ifItem = (IfStatement) contentItem.getStatements().get(0);
		ElseStatement elseItem = ifItem.getElseNode();		
		// child(0) is the CompoundStatement, child(0) of that should be the WhileStatement		
		WhileStatement whileItem = (WhileStatement) elseItem.getChild(0).getChild(0);
		// Here child(0) is the condition and child(1) is the CompoundStatement
		IfStatement nestedIfItem = (IfStatement) whileItem.getChild(1).getChild(0);
		assertEquals("bar2", nestedIfItem.getCondition().getEscapedCodeStr());
	} 

	@Test
	public void complexIfElseNesting() {
		String input = "if (A){ if (B){ } if (C){ } } else { }";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IfStatement ifItem = (IfStatement) contentItem.getStatements().get(0);
		assertTrue(ifItem.getElseNode() != null);
	}

	@Test
	public void testFor() {
		String input = "for(i = 0; i < 10; i++){}";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ForStatement forItem = (ForStatement) contentItem.getStatements().get(0);
		String condExprString = ((Condition) forItem.getCondition()).getExpression().getEscapedCodeStr();
		assertEquals("i < 10", condExprString);
	}

	@Test
	public void testDeclInFor() {
		String input = "for(int i = 0; i < 10; i++){}";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ForStatement forItem = (ForStatement) contentItem.getStatements().get(0);
		String condExprString = ((Condition) forItem.getCondition()).getExpression().getEscapedCodeStr();
		assertEquals("i < 10", condExprString);
	}
	
	@Test
	public void testForWithoutBracketsAndWithMacroCallInForInit() {
		String input = " for (s = CAST_ALIGNED (uword const *, p); ! (*s & unibyte_mask); s++)\n" + 
				"    continue;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ForStatement forItem = (ForStatement) contentItem.getStatements().get(0);
		ForInit expr = (ForInit) forItem.getChild(0); 
		assertEquals("s = CAST_ALIGNED ( uword const * , p ) ;", expr.getEscapedCodeStr());
	}	

	@Test
	public void testVarDeclName() {
		String input = "int x = 2*y;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IdentifierDeclStatement declStatement = (IdentifierDeclStatement) contentItem.getStatements().get(0);
		IdentifierDecl decl = (IdentifierDecl) declStatement.getChild(0);
		assertEquals("x", decl.getName().getEscapedCodeStr());
		
	}

	@Test
	public void testVarDeclType() {
		String input = "int x = 2*y;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IdentifierDeclStatement declStatement = (IdentifierDeclStatement) contentItem.getStatements().get(0);
		IdentifierDecl decl = (IdentifierDecl) declStatement.getChild(0);
		assertEquals("int", decl.getType().getEscapedCodeStr());
	}

	@Test
	public void testAssignment() {
		String input = "const char *m = \"Usage: untar [-tvx] [-f file] [file]\\n\";";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IdentifierDeclStatement declStatement = (IdentifierDeclStatement) contentItem.getStatements().get(0);
		IdentifierDecl decl = (IdentifierDecl) declStatement.getChild(0);

		AssignmentExpression assign = (AssignmentExpression) decl.getChild(decl.getChildCount() - 1);
		assertEquals("m", assign.getLeft().getEscapedCodeStr());
		assertEquals("\"Usage: untar [-tvx] [-f file] [file]\\n\"", assign.getRight().getEscapedCodeStr());
	}

	@Test
	public void testDeclRightAfterStruct() {
		String input = "struct foo{ int x; } bar;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals(1,contentItem.getChildCount());
		StructUnionEnum struct = (StructUnionEnum) contentItem.getChild(0);
		assertEquals(2, struct.getChildCount());
		Identifier id = (Identifier) struct.getChild(0);
		assertEquals("foo", id.getEscapedCodeStr());
//		IdentifierDeclStatement declStmt = (IdentifierDeclStatement) struct.getChild(1);
//		assertEquals("int x ;", declStmt.getEscapedCodeStr());
//		IdentifierDecl decl = (IdentifierDecl) struct.getChild(2);
		IdentifierDecl decl = (IdentifierDecl) struct.getChild(1);
		assertEquals("bar", decl.getEscapedCodeStr());
	}

	@Test
	public void testCall() {
		String input = "foo(x);";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement stmt = (ExpressionStatement) contentItem.getStatements().get(0);
		CallExpression expr = (CallExpression) stmt.getChild(0);
		assertEquals("foo", expr.getTargetFunc().getEscapedCodeStr());
		ArgumentList argList = (ArgumentList) expr.getChild(1);
		Argument arg = (Argument) argList.getChild(0);
		assertEquals("x", arg.getEscapedCodeStr());
	}

	@Test
	public void testCallWithTwoArguments() {
		String input = "foo(x,y);";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement stmt = (ExpressionStatement) contentItem.getStatements().get(0);
		CallExpression expr = (CallExpression) stmt.getChild(0);
		assertEquals("foo", expr.getTargetFunc().getEscapedCodeStr());
	}
	
	
	@Test
	public void commentInsideFunction() {
		String input = "/*Comment inside function */ int i; ";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);		
		Comment codeItem = (Comment) contentItem.getStatements().get(1);
		assertEquals("Comment", codeItem.getTypeAsString());
		assertEquals("/*Comment inside function */", codeItem.getEscapedCodeStr());
		assertEquals("IdentifierDeclStatement", codeItem.getCommentee().getTypeAsString());
	}
	
	@Test
	public void structInsideFunction() {
		String input = "struct scsi_device {\n"+
				" 	int x;\n" + 
				" 	}	sdev;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);		
		StructUnionEnum codeItem = (StructUnionEnum) contentItem.getStatements().get(0);
		assertEquals("struct scsi_device { \n" + 
				" int x ; \n" + 
				" } sdev ;", codeItem.getEscapedCodeStr());
		assertEquals("scsi_device", codeItem.getChild(0).getEscapedCodeStr());
	}

}
