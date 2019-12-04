package tests.languages.c.parseTreeToAST;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import ast.ASTNode;
import ast.Comment;
import ast.c.expressions.CallExpression;
import ast.declarations.IdentifierDecl;
import ast.expressions.AdditiveExpression;
import ast.expressions.AndExpression;
import ast.expressions.AssignmentExpression;
import ast.expressions.BitAndExpression;
import ast.expressions.CastExpression;
import ast.expressions.ConditionalExpression;
import ast.expressions.EqualityExpression;
import ast.expressions.ExclusiveOrExpression;
import ast.expressions.InclusiveOrExpression;
import ast.expressions.MultiplicativeExpression;
import ast.expressions.OrExpression;
import ast.expressions.RelationalExpression;
import ast.expressions.ShiftExpression;
import ast.logical.statements.BlockStarter;
import ast.logical.statements.CompoundStatement;
import ast.logical.statements.Condition;
import ast.logical.statements.Statement;
import ast.statements.ExpressionStatement;
import ast.statements.IdentifierDeclStatement;

public class ExpressionParsingTest {

	@Test
	public void testMostBasicAssignment() {
		String input = "x = y;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement statementItem = (ExpressionStatement) contentItem.getStatements().get(0);
		AssignmentExpression expr = (AssignmentExpression) statementItem.getExpression();

		assertEquals("x",expr.getLeft().getEscapedCodeStr());
		assertEquals("y", expr.getRight().getEscapedCodeStr());
	}

	@Test
	public void testBasicAssignmentChain() {
		String input = "x = y = z;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement statementItem = (ExpressionStatement) contentItem.getStatements().get(0);
		AssignmentExpression expr = (AssignmentExpression) statementItem.getExpression();
		assertEquals("x",expr.getLeft().getEscapedCodeStr());
		assertEquals("y = z",expr.getRight().getEscapedCodeStr());
	}

	@Test
	public void testMostBasicLocalVar() {
		String input = "int x;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IdentifierDeclStatement statementItem = (IdentifierDeclStatement) contentItem.getStatements().get(0);
		IdentifierDecl identifierDecl = (IdentifierDecl) statementItem.getIdentifierDeclList().get(0);
		assertEquals("x", identifierDecl.getName().getEscapedCodeStr());
	}
	
	@Test
	public void testConditionalExpr() {
		String input = "foo = cond? x : y;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement statementItem = (ExpressionStatement) contentItem.getStatements().get(0);
		AssignmentExpression expr = (AssignmentExpression) statementItem.getExpression();
		ConditionalExpression right = (ConditionalExpression) expr.getRight();
		assertEquals("cond",right.getChild(0).getEscapedCodeStr());
	}

	@Test
	public void testOrExpr() {
		String input = "x || y;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement statementItem = (ExpressionStatement) contentItem.getStatements().get(0);
		OrExpression expr = (OrExpression) statementItem.getExpression();
		assertEquals("x",expr.getLeft().getEscapedCodeStr());
	}

	@Test
	public void testAndExpr() {
		String input = "x && y;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement statementItem = (ExpressionStatement) contentItem.getStatements().get(0);
		AndExpression expr = (AndExpression) statementItem.getExpression();
		assertEquals("x",expr.getLeft().getEscapedCodeStr());
	}

	@Test
	public void testInclusiveOrExpr() {
		String input = "x | y;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement statementItem = (ExpressionStatement) contentItem.getStatements().get(0);
		InclusiveOrExpression expr = (InclusiveOrExpression) statementItem.getExpression();
		assertEquals("x",expr.getLeft().getEscapedCodeStr());
	}

	@Test
	public void testExclusiveOrExpr() {
		String input = "x ^ y;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement statementItem = (ExpressionStatement) contentItem.getStatements().get(0);
		ExclusiveOrExpression expr = (ExclusiveOrExpression) statementItem.getExpression();
		assertEquals("x",expr.getLeft().getEscapedCodeStr());
	}

	@Test
	public void testBitAndExpr() {
		String input = "if(x & y){};";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		BlockStarter starter = (BlockStarter) contentItem.getStatements().get(0);
		BitAndExpression expr = (BitAndExpression) ((Condition) starter.getCondition()).getExpression();
		assertEquals("x",expr.getLeft().getEscapedCodeStr());
	}

	@Test
	public void EqualityExpr() {
		String input = "if(x == y){};";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		BlockStarter starter = (BlockStarter) contentItem.getStatements().get(0);
		EqualityExpression expr = (EqualityExpression) ((Condition) starter.getCondition()).getExpression();
		assertEquals("x",expr.getLeft().getEscapedCodeStr());
	}

	@Test
	public void RelationalExpr() {
		String input = "if(x < y){};";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		BlockStarter starter = (BlockStarter) contentItem.getStatements().get(0);
		RelationalExpression expr = (RelationalExpression) ((Condition) starter.getCondition()).getExpression();
		assertEquals("x",expr.getLeft().getEscapedCodeStr());
	}

	@Test
	public void ShiftExpr() {
		String input = "if(x >> y){};";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		BlockStarter starter = (BlockStarter) contentItem.getStatements().get(0);
		ShiftExpression expr = (ShiftExpression) ((Condition) starter.getCondition()).getExpression();
		assertEquals("x",expr.getLeft().getEscapedCodeStr());
	}

	@Test
	public void AdditiveExpr() {
		String input = "if(x + y){};";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		BlockStarter starter = (BlockStarter) contentItem.getStatements().get(0);
		AdditiveExpression expr = (AdditiveExpression) ((Condition) starter.getCondition()).getExpression();
		assertEquals("x",expr.getLeft().getEscapedCodeStr());
	}

	@Test
	public void MultiplicativeExpr() {
		String input = "if(x * y){};";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		BlockStarter starter = (BlockStarter) contentItem.getStatements().get(0);
		MultiplicativeExpression expr = (MultiplicativeExpression) ((Condition) starter.getCondition()).getExpression();
		assertEquals("x",expr.getLeft().getEscapedCodeStr());
	}

	@Test
	public void CastExpr() {
		String input = "if((some_type) y){};";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		BlockStarter starter = (BlockStarter) contentItem.getStatements().get(0);
		CastExpression expr = (CastExpression) ((Condition) starter.getCondition()).getExpression();
		assertEquals("some_type", expr.getCastTarget().getEscapedCodeStr());
	}
	
	@Test
	public void CastExprWithUnsigned() {
		String input = "(unsigned long) y;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement  exprS = (ExpressionStatement) contentItem.getStatements().get(0);
		CastExpression expr = (CastExpression) exprS.getExpression();
		assertEquals("unsigned long", expr.getCastTarget().getEscapedCodeStr());
	}
	
	@Test
	public void ptrInc() {
		String input = "++*p;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement expr = (ExpressionStatement) contentItem.getStatements().get(0);
		assertEquals("++ * p;", expr.getEscapedCodeStr());
	}
	
	@Test
	public void volatilePtr() {
		String input = "TCase *volatile tc;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IdentifierDeclStatement stmt = (IdentifierDeclStatement) contentItem.getStatements().get(0);
		assertEquals("TCase * volatile tc ;", stmt.getEscapedCodeStr());
	}

	@Test
	public void funCall() {
		String input = "if(foo()){};";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		BlockStarter starter = (BlockStarter) contentItem.getStatements().get(0);
		CallExpression expr = (CallExpression) ((Condition) starter.getCondition()).getExpression();
		assertEquals("foo", expr.getTargetFunc().getEscapedCodeStr());
	}
	
	@Test
	public void funCallWithLinebreak() {
		String input = "if(foo(x,\n y)){};";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		BlockStarter starter = (BlockStarter) contentItem.getStatements().get(0);
		CallExpression expr = (CallExpression) ((Condition) starter.getCondition()).getExpression();
		assertEquals("foo", expr.getTargetFunc().getEscapedCodeStr());
		assertEquals("x", expr.getArgumentList().getChild(0).getEscapedCodeStr());
		assertEquals("y", expr.getArgumentList().getChild(1).getEscapedCodeStr());
	}
	
	@Test
	public void funCallWithLinebreakAndMultipleArgumentParts() {
		String input = "fprintf(stderr,\n" + 
				"                \"error '%\" XML_FMT_STR \"' at line %\" XML_FMT_INT_MOD\n" + 
				"                \"u character %\" XML_FMT_INT_MOD \"u\\n\");";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		CallExpression expr = (CallExpression) contentItem.getChild(0).getChild(0);
		assertEquals("fprintf", expr.getTargetFunc().getEscapedCodeStr());
		assertEquals("stderr", expr.getArgumentList().getChild(0).getEscapedCodeStr());
		assertEquals("\"error '%\"", expr.getArgumentList().getChild(1).getEscapedCodeStr());
		assertEquals("XML_FMT_STR", expr.getArgumentList().getChild(2).getEscapedCodeStr());
		assertEquals("\"' at line %\"", expr.getArgumentList().getChild(3).getEscapedCodeStr());
		//The linebreak after this may cause problems
		assertEquals("XML_FMT_INT_MOD", expr.getArgumentList().getChild(4).getEscapedCodeStr());
		assertEquals("\"u character %\"", expr.getArgumentList().getChild(5).getEscapedCodeStr());
		assertEquals("XML_FMT_INT_MOD", expr.getArgumentList().getChild(6).getEscapedCodeStr());
		assertEquals("\"u\\n\"", expr.getArgumentList().getChild(7).getEscapedCodeStr());
	}

	
	@Test
	public void funCallWithoutLinebreakAndWithMultipleArgumentParts() {
		String input = "fprintf(\"error '%\" "
				+ "XML_FMT_STR "
				+ "\"' at line %\""
				+ " XML_FMT_INT_MOD"
				+ "\"u character %\" "
				+ "XML_FMT_INT_MOD "
				+ " \"u\\n\""
				+ ");";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		CallExpression expr = (CallExpression) contentItem.getChild(0).getChild(0);
		assertEquals("fprintf", expr.getTargetFunc().getEscapedCodeStr());
		assertEquals("\"error '%\"", expr.getArgumentList().getChild(0).getEscapedCodeStr());
		assertEquals("XML_FMT_STR", expr.getArgumentList().getChild(1).getEscapedCodeStr());
		assertEquals("\"' at line %\"", expr.getArgumentList().getChild(2).getEscapedCodeStr());
		assertEquals("XML_FMT_INT_MOD", expr.getArgumentList().getChild(3).getEscapedCodeStr());
		assertEquals("\"u character %\"", expr.getArgumentList().getChild(4).getEscapedCodeStr());
		assertEquals("XML_FMT_INT_MOD", expr.getArgumentList().getChild(5).getEscapedCodeStr());
		assertEquals("\"u\\n\"", expr.getArgumentList().getChild(6).getEscapedCodeStr());
	}
	
	@Test
	public void funCallWithLinebreakAndMultipleArguments() {
		String input = "fprintf(stderr,\n" +
				"                XML_ErrorString(XML_GetErrorCode(parser)),\n" + 
				"                XML_GetCurrentLineNumber(parser),\n" + 
				"                XML_GetCurrentColumnNumber(parser));";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		CallExpression expr = (CallExpression) contentItem.getChild(0).getChild(0);
		assertEquals("fprintf", expr.getTargetFunc().getEscapedCodeStr());
		assertEquals("stderr", expr.getArgumentList().getChild(0).getEscapedCodeStr());
		assertEquals("XML_ErrorString ( XML_GetErrorCode ( parser ) )", expr.getArgumentList().getChild(1).getEscapedCodeStr());
		assertEquals("XML_GetCurrentLineNumber ( parser )", expr.getArgumentList().getChild(2).getEscapedCodeStr());
		assertEquals("XML_GetCurrentColumnNumber ( parser )", expr.getArgumentList().getChild(3).getEscapedCodeStr());
	}
	
	@Test
	public void commentInSameLineAsStatement() {
		String input = "x = 5; /*x is set to 5*/";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement statementItem = (ExpressionStatement) contentItem.getStatements().get(0);
		Comment comment = (Comment) contentItem.getStatements().get(1);
		assertEquals("x = 5;", statementItem.getEscapedCodeStr());
		assertEquals("/*x is set to 5*/", comment.getEscapedCodeStr());
		assertEquals("ExpressionStatement", comment.getCommentee().getTypeAsString());
	}

}
