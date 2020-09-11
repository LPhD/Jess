package tests.languages.c.parseTreeToAST;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ast.Comment;
import ast.c.expressions.CallExpression;
import ast.declarations.IdentifierDecl;
import ast.expressions.AdditiveExpression;
import ast.expressions.AddressOfExpression;
import ast.expressions.AndExpression;
import ast.expressions.AssignmentExpression;
import ast.expressions.BitAndExpression;
import ast.expressions.Callee;
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
	public void testDeclWithNewKeyword() {
		String input = "StructDataEntry *new;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IdentifierDeclStatement statementItem = (IdentifierDeclStatement) contentItem.getStatements().get(0);
		IdentifierDecl identifierDecl = (IdentifierDecl) statementItem.getIdentifierDeclList().get(0);
		assertEquals("new", identifierDecl.getName().getEscapedCodeStr());
	}

	@Test
	public void testDeclWithMacroCall() {
		String input = "const XML_Char *expected = XCS(\"\\x00e4 \\x00f6 \\x00fc \")\n" + 
				"XCS(\"\\x00e4 \\x00f6 \\x00fc \") XCS(\"\\x00e4 \\x00f6 \\x00fc >\");";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IdentifierDeclStatement statementItem = (IdentifierDeclStatement) contentItem.getStatements().get(0);		
		assertEquals("const XML_Char * expected = XCS ( \"\\x00e4 \\x00f6 \\x00fc \" ) \n" + 
				" XCS ( \"\\x00e4 \\x00f6 \\x00fc \" ) XCS ( \"\\x00e4 \\x00f6 \\x00fc >\" ) ;", statementItem.getEscapedCodeStr());
//		IdentifierDecl identifierDecl = (IdentifierDecl) statementItem.getIdentifierDeclList().get(0);
//		assertEquals("expected", identifierDecl.getName().getEscapedCodeStr()); Does not work
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
	public void testConstPointerDecl() {
		String input = "static char const *_check_current_function = NULL;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IdentifierDeclStatement statementItem = (IdentifierDeclStatement) contentItem.getStatements().get(0);
		assertEquals("static char const * _check_current_function = NULL ;", statementItem.getEscapedCodeStr());
		IdentifierDecl identifierDecl = (IdentifierDecl) statementItem.getIdentifierDeclList().get(0);
		assertEquals("_check_current_function", identifierDecl.getChild(1).getEscapedCodeStr());
		//TODO Why is this NULL and not the identifier?
//		assertEquals("_check_current_function", identifierDecl.getName().getEscapedCodeStr());
	}
	
	@Test
	public void testConstCharArrayWithLinebreak() {
		String input = "const char message[] = \"\\x00\\x01\\x02\\x03\\x04\\x05\\x06\\x07\\x08\\x09\"\n" + 
				"\"\\x0a\\x0b\\x0c\\x0d\\x0e\";";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IdentifierDeclStatement statementItem = (IdentifierDeclStatement) contentItem.getStatements().get(0);
		assertEquals("const char message [ ] = \"\\x00\\x01\\x02\\x03\\x04\\x05\\x06\\x07\\x08\\x09\" \n" + 
				" \"\\x0a\\x0b\\x0c\\x0d\\x0e\" ;", statementItem.getEscapedCodeStr());
		IdentifierDecl identifierDecl = (IdentifierDecl) statementItem.getIdentifierDeclList().get(0);
		assertEquals("message", identifierDecl.getName().getEscapedCodeStr());
	}
	
	@Test
	public void testConstPointerWithLinebreak() {
		String input = "const XML_Char *expected\n" + 
				"= XCS(\"J\\x00f8rgen \\x00e6\\x00f8\\x00e5\\x00c6\\x00d8\\x00c5\");";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IdentifierDeclStatement statementItem = (IdentifierDeclStatement) contentItem.getStatements().get(0);
		assertEquals("const XML_Char * expected \n" + 
				" = XCS ( \"J\\x00f8rgen \\x00e6\\x00f8\\x00e5\\x00c6\\x00d8\\x00c5\" ) ;", statementItem.getEscapedCodeStr());
		IdentifierDecl identifierDecl = (IdentifierDecl) statementItem.getIdentifierDeclList().get(0);
		assertEquals("expected", identifierDecl.getName().getEscapedCodeStr());
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
	public void testAddressOfExpr() {
		String input = "address = &func;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement statementItem = (ExpressionStatement) contentItem.getStatements().get(0);
		AddressOfExpression expr = (AddressOfExpression) statementItem.getExpression().getChild(1);
		assertEquals("func", expr.getEscapedCodeStr());
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
		String input = "if(x & y){}";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		BlockStarter starter = (BlockStarter) contentItem.getStatements().get(0);
		BitAndExpression expr = (BitAndExpression) ((Condition) starter.getCondition()).getExpression();
		assertEquals("x",expr.getLeft().getEscapedCodeStr());
	}

	@Test
	public void EqualityExpr() {
		String input = "if(x == y){}";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		BlockStarter starter = (BlockStarter) contentItem.getStatements().get(0);
		EqualityExpression expr = (EqualityExpression) ((Condition) starter.getCondition()).getExpression();
		assertEquals("x",expr.getLeft().getEscapedCodeStr());
	}

	@Test
	public void RelationalExpr() {
		String input = "if(x < y){}";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		BlockStarter starter = (BlockStarter) contentItem.getStatements().get(0);
		RelationalExpression expr = (RelationalExpression) ((Condition) starter.getCondition()).getExpression();
		assertEquals("x",expr.getLeft().getEscapedCodeStr());
	}

	@Test
	public void ShiftExpr() {
		String input = "if(x >> y){}";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		BlockStarter starter = (BlockStarter) contentItem.getStatements().get(0);
		ShiftExpression expr = (ShiftExpression) ((Condition) starter.getCondition()).getExpression();
		assertEquals("x",expr.getLeft().getEscapedCodeStr());
	}

	@Test
	public void AdditiveExpr() {
		String input = "if(x + y){}";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		BlockStarter starter = (BlockStarter) contentItem.getStatements().get(0);
		AdditiveExpression expr = (AdditiveExpression) ((Condition) starter.getCondition()).getExpression();
		assertEquals("x",expr.getLeft().getEscapedCodeStr());
	}

	@Test
	public void MultiplicativeExpr() {
		String input = "if(x * y){}";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		BlockStarter starter = (BlockStarter) contentItem.getStatements().get(0);
		MultiplicativeExpression expr = (MultiplicativeExpression) ((Condition) starter.getCondition()).getExpression();
		assertEquals("x",expr.getLeft().getEscapedCodeStr());
	}

	@Test
	public void CastExpr() {
		String input = "if((some_type) y){}";
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
	public void FunktionPointerUse() {
		String input = "( * filter ) ( dirname , entry , baton ) ;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement  exprS = (ExpressionStatement) contentItem.getStatements().get(0);
		CastExpression expr = (CastExpression) exprS.getExpression();
		assertEquals("", expr.getEscapedCodeStr());
	}
	
	@Test
	public void ptrInc() {
		String input = "++*p;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement expr = (ExpressionStatement) contentItem.getStatements().get(0);
		assertEquals("++ * p ;", expr.getEscapedCodeStr());
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
		String input = "if(foo()){}";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		BlockStarter starter = (BlockStarter) contentItem.getStatements().get(0);
		Callee expr = (Callee) ((Condition) starter.getCondition()).getExpression().getChild(0);
		assertEquals("foo", expr.getEscapedCodeStr());
	}
	
	@Test
	public void funCallExpression() {
		String input = "foo();";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement expr = (ExpressionStatement) contentItem.getStatements().get(0);
		assertEquals("foo ( ) ;", expr.getEscapedCodeStr());
		CallExpression callEx = (CallExpression) expr.getChild(0);
		assertEquals("foo", callEx.getTargetFunc().getEscapedCodeStr());
	}
	
	@Test
	public void funCallWithLinebreak() {
		String input = "if(foo(x,\n y)){}";
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
		assertEquals("x = 5 ;", statementItem.getEscapedCodeStr());
		assertEquals("/*x is set to 5*/", comment.getEscapedCodeStr());
		assertEquals("ExpressionStatement", comment.getCommentee().getTypeAsString());
	}
	
	@Test
	public void commentInSameLineAsStatement2() {
		String input = "char text[] = \"\\xFF\\xFE\"  /* BOM */\n" + 
				"\"<\\000e\\000/\\000>\\000\"  /* document element */\n" + 
				"\"\\r\\000\\n\\000\\r\\000\\n\\000\"; /* epilog */";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IdentifierDeclStatement statementItem = (IdentifierDeclStatement) contentItem.getStatements().get(0);
		assertEquals("char text [ ] = \"\\xFF\\xFE\" /* BOM */ \n" + 
				" \"<\\000e\\000/\\000>\\000\" /* document element */ \n" + 
				" \"\\r\\000\\n\\000\\r\\000\\n\\000\" ;", statementItem.getEscapedCodeStr());
		//TODO Handle comment in parsers, when they appear within a statement
	}
	
	@Test
	public void commentInSameLineAsStatement3() {
		String input = "  const char *text\n" + 
				"      = \"<?xml version='1.0' encoding='utf-8'?>\\n\"\n" + 
				"        /* 0xf0 0x90 0x80 0x80 = U+10000, the first Linear B character */\n" + 
				"        \"<do\\xf0\\x90\\x80\\x80/>\";";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IdentifierDeclStatement statementItem = (IdentifierDeclStatement) contentItem.getStatements().get(0);
		assertEquals("const char * text \n" + 
				" = \"<?xml version='1.0' encoding='utf-8'?>\\n\" \n" + 
				" /* 0xf0 0x90 0x80 0x80 = U+10000, the first Linear B character */ \n" + 
				" \"<do\\xf0\\x90\\x80\\x80/>\" ;", statementItem.getEscapedCodeStr());
		//TODO Handle comment in parsers, when they appear within a statement
	}
	
	@Test
	public void commentInSameLineAsStatement4() {
		String input = "const XML_Char *expected =\n" + 
				"      /* 64 characters per line */\n" + 
				"      /* clang-format off */\n" + 
				"        XCS(\"ABCDEFGHIJKLMNOPABCDEFGHIJKLMNOPABCDEFGHIJKLMNOPABCDEFGHIJKLMNOP\")\n" + 
				"        XCS(\"ABCDEFGHIJKLMNOPABCDEFGHIJKLMNOPABCDEFGHIJKLMNOPABCDEFGHIJKLMNOP\");";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IdentifierDeclStatement statementItem = (IdentifierDeclStatement) contentItem.getStatements().get(0);
		assertEquals("const XML_Char * expected = \n" + 
				" /* 64 characters per line */ \n" + 
				" /* clang-format off */ \n" + 
				" XCS ( \"ABCDEFGHIJKLMNOPABCDEFGHIJKLMNOPABCDEFGHIJKLMNOPABCDEFGHIJKLMNOP\" ) \n" + 
				" XCS ( \"ABCDEFGHIJKLMNOPABCDEFGHIJKLMNOPABCDEFGHIJKLMNOPABCDEFGHIJKLMNOP\" ) ;", statementItem.getEscapedCodeStr());
		//TODO Handle comment in parsers, when they appear within a statement
	}
	
	@Test
	public void commentInSameLineAsStatement5() {
		String input = "  ExtTest test_data\n" + 
				" = {/* This text says it's an unsupported encoding, but it's really\n" + 
				" UTF-8, which we tell Expat using XML_SetEncoding().\n" + 
				" */\n" + 
				" \"<?xml encoding='iso-8859-3'?>\\xC3\\xA9\", XCS(\"utf-8\"), NULL};";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IdentifierDeclStatement statementItem = (IdentifierDeclStatement) contentItem.getStatements().get(0);
		assertEquals("ExtTest test_data \n" + 
				" = { /* This text says it's an unsupported encoding, but it's really\n" + 
				" UTF-8, which we tell Expat using XML_SetEncoding().\n" + 
				" */ \n" + 
				" \"<?xml encoding='iso-8859-3'?>\\xC3\\xA9\" , XCS ( \"utf-8\" ) , NULL } ;", statementItem.getEscapedCodeStr());
		//TODO Handle comment in parsers, when they appear within a statement
	}
	
	@Test
	public void commentInSameLineAsStatement6() {
		String input = "  const ExtFaults faults[]\n" + 
				"= {{\"<\", \"Incomplete element declaration not faulted\", NULL,\n" + 
				"XML_ERROR_UNCLOSED_TOKEN},\n" + 
				"{\"<\\xe2\\x82\", /* First two bytes of a three-byte char */\n" + 
				"\"Incomplete character not faulted\", NULL, XML_ERROR_PARTIAL_CHAR},\n" + 
				"{\"<tag>\\xe2\\x82\", \"Incomplete character in CDATA not faulted\", NULL,\n" + 
				"XML_ERROR_PARTIAL_CHAR},\n" + 
				"{NULL, NULL, NULL, XML_ERROR_NONE}};";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IdentifierDeclStatement statementItem = (IdentifierDeclStatement) contentItem.getStatements().get(0);
		assertEquals("const ExtFaults faults [ ] \n" + 
				" = { { \"<\" , \"Incomplete element declaration not faulted\" , NULL , \n" + 
				" XML_ERROR_UNCLOSED_TOKEN } , \n" + 
				" { \"<\\xe2\\x82\" , /* First two bytes of a three-byte char */ \n" + 
				" \"Incomplete character not faulted\" , NULL , XML_ERROR_PARTIAL_CHAR } , \n" + 
				" { \"<tag>\\xe2\\x82\" , \"Incomplete character in CDATA not faulted\" , NULL , \n" + 
				" XML_ERROR_PARTIAL_CHAR } , \n" + 
				" { NULL , NULL , NULL , XML_ERROR_NONE } } ;", statementItem.getEscapedCodeStr());
		//TODO Handle comment in parsers, when they appear within a statement
	}
	
	@Test
	public void strangeComment() {
		String input = "/* skip remaining characters if truncation width exceeded, needs to be done\n" + 
				" * before highlight opening */\n" + 
				"i++;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement statementItem = (ExpressionStatement) contentItem.getStatements().get(0);
		Comment comment = (Comment) contentItem.getStatements().get(1);
		assertEquals("i ++ ;", statementItem.getEscapedCodeStr());
		assertEquals("/* skip remaining characters if truncation width exceeded, needs to be done\n" + 
				" * before highlight opening */", comment.getEscapedCodeStr());
	}
	
	@Test
	public void nullExpression() {
		String input = ";";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement statementItem = (ExpressionStatement) contentItem.getStatements().get(0);
		assertEquals(";", statementItem.getEscapedCodeStr());
	}

}
