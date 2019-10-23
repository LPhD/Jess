package tests.languages.c.parseTreeToAST;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ast.c.preprocessor.blockstarter.PreElseStatement;
import ast.c.preprocessor.blockstarter.PreIfStatement;
import ast.logical.statements.CompoundStatement;
import ast.preprocessor.PreBlockstarter;

public class PreprocessorTests {

	@Test
	public void testNestedIfndefs() {
		String input = "#ifdef foo1 \n  #else #ifdef foo2 \n  #else  #endif  #endif";
		CompoundStatement item = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("Top level childs have to be the two #ifdefs", 2, item.getStatements().size());
		PreBlockstarter firstIf = (PreBlockstarter) item.getStatement(0);
		assertEquals("#ifdef foo1 has 2 childs (condition and #else)",2, firstIf.getChildCount());
		assertEquals("First #else has 1 child (#endif)", 1, firstIf.getChild(1).getChildCount());
		//This is due to the grammar, maybe will be reworked later
		assertEquals("#else has 1 variable item (#ifdef foo)", 1, ( (PreElseStatement) firstIf.getChild(1)).getVariableStatementsCount());
	}
	
	@Test
	public void testVariableStatements() {
		String input = "#if foo \n  bar(); #else  int i; i++; #endif";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		//#if
		PreBlockstarter bs = (PreBlockstarter) contentItem.getStatement(0);
		assertEquals("bar ( );", bs.getVariableStatement(0).getEscapedCodeStr());
		//#else
		bs = (PreBlockstarter) bs.getChild(1);
		assertEquals("int i ;", bs.getVariableStatement(0).getEscapedCodeStr());
		assertEquals("i ++;", bs.getVariableStatement(1).getEscapedCodeStr());
	}

	@Test
	public void testPreElseStatement() {
		String input = "#if foo \n  bar(); #else  foo(); foo(); #endif";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreElseStatement", contentItem.getStatement(0).getChild(1).getTypeAsString());
	}
	
	@Test
	public void testPreElseStatementCode() {
		String input = "#if foo \n  bar(); #else  foo(); foo(); #endif";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("#else", contentItem.getStatement(0).getChild(1).getEscapedCodeStr());
	}

	@Test
	public void testPreIfStatement() {
		String input = "#if foo \n  int i; #endif";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreIfStatement", contentItem.getStatement(0).getTypeAsString());
	}
	
	
	@Test
	public void testPreIfStatementInsideIfBlock() {
		String input = "if(bool) { #if foo \n  int i; #endif }";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		//TODO
		//This is wrong, pre statement should be AST child of the file
		PreIfStatement preStmt = (PreIfStatement) contentItem.getStatement(0).getChild(1).getChild(0);
		assertEquals("PreIfStatement", preStmt.getTypeAsString());
		assertEquals("IdentifierDeclStatement", preStmt.getVariableStatement(0).getTypeAsString());
	}
	
	@Test
	public void testPreIfStatementCode() {
		String input = "#if foo \n  int i; #endif";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("#if foo \n", contentItem.getStatement(0).getEscapedCodeStr());
	}
	
	@Test
	public void testPreElIfStatement() {
		String input = "#if foo \n  bar();  #elif bar \n  foo();  foo();  #endif";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreElIfStatement", contentItem.getStatement(0).getChild(1).getTypeAsString());
	}
	
	@Test
	public void testPreElIfStatementCode() {
		String input = "#if foo \n  bar();  #elif bar \n  foo();  foo();  #endif";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("#elif bar \n", contentItem.getStatement(0).getChild(1).getEscapedCodeStr());
	}
	
	@Test
	public void testPreEndIfStatement() {
		String input = "#if bar \n  int i;  #endif";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreEndIfStatement", contentItem.getStatement(0).getChild(1).getTypeAsString());
	}
	
	@Test
	public void testPreEndIfStatementCode() {
		String input = "#if bar \n  int i;  #endif";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("#endif", contentItem.getStatement(0).getChild(1).getEscapedCodeStr());
	}
	
	@Test
	public void testPreIfWithBracketsAroundCondition() {
		String input = "#if (foo < 5) \n int i; #endif";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals(2, contentItem.getStatements().size());
		assertEquals("foo < 5", contentItem.getStatement(0).getChild(0).getEscapedCodeStr());
	}
	
	@Test
	public void testPreIfWithDefined() {
		String input = "#if defined (foo) \n int i; #endif";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreIfStatement", contentItem.getStatement(0).getTypeAsString());
	}
	
	@Test
	public void testPreIfWithNestedCondition() {
		String input = "#if (foo < 5 && ( x < 1 || x > 5 )) \n  int i;  #endif";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals(2, contentItem.getStatements().size());
		assertEquals("foo < 5 && ( x < 1 || x > 5 )", contentItem.getStatement(0).getChild(0).getEscapedCodeStr());
	}
	
	@Test
	public void testPreIfWithEvenMoreNestedCondition() {
		String input = "#if (MAKRO(7) > 7) && (IS_ENABLED(BUBBLE) && ENABLED(BUBBLE)) \n int i;  #endif";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals(2, contentItem.getStatements().size());
		assertEquals("( MAKRO ( 7 ) > 7 ) && ( IS_ENABLED ( BUBBLE ) && ENABLED ( BUBBLE ) )", contentItem.getStatement(0).getChild(0).getEscapedCodeStr());
	}
		
	
	@Test
	public void testPreIncludeStatementWithBrackets() {
		String input = "#include <file.h> ";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreInclude", contentItem.getStatement(0).getTypeAsString());
	}
	
	@Test
	public void testPreIncludeStatementWithQuotes() {
		String input = "#include \"something\"";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreInclude", contentItem.getStatement(0).getTypeAsString());
	}
	
	@Test
	public void testPreIncludeStatementWithMacro() {
		String input = "#include MACRO";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreInclude", contentItem.getStatement(0).getTypeAsString());
	}
	
	@Test
	public void testPreImportStatementWithBrackets() {
		String input = "#import <file.h> ";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreInclude", contentItem.getStatement(0).getTypeAsString());
	}
	
	@Test
	public void testPreImportStatementWithQuotes() {
		String input = "#import \"something\"";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreInclude", contentItem.getStatement(0).getTypeAsString());
	}
	
	@Test
	public void testPreImportStatementWithMacro() {
		String input = "#import MACRO";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreInclude", contentItem.getStatement(0).getTypeAsString());
	}
	
	@Test
	public void testPreIncludeNextStatementWithBrackets() {
		String input = "#include_next <file.h> ";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreIncludeNext", contentItem.getStatement(0).getTypeAsString());
	}
	
	@Test
	public void testPreIncludeNextStatementWithQuotes() {
		String input = "#include_next \"something\"";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreIncludeNext", contentItem.getStatement(0).getTypeAsString());
	}
	
	@Test
	public void testPreIncludeNextStatementWithMacro() {
		String input = "#include_next MACRO";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreIncludeNext", contentItem.getStatement(0).getTypeAsString());
	}
	
	@Test
	public void testPreDefineWithoutValue() {
		String input = "#define MACRO \n";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreDefine", contentItem.getStatement(0).getTypeAsString());
	}
	
	@Test
	public void testPreDefineWithValue() {
		String input = "#define MACRO 5 \n";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreDefine", contentItem.getStatement(0).getTypeAsString());
	}
	
	@Test
	public void testTwoPreDefines() {
		String input = "#define MACROA \n #define MACROB \n";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreDefine", contentItem.getStatement(0).getTypeAsString());
		assertEquals("PreDefine", contentItem.getStatement(1).getTypeAsString());
	}
	
	@Test
	public void testPreDefineWithValueAndParameters() {
		String input = "#define MACRO(a) a + 5 \n";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreDefine", contentItem.getStatement(0).getTypeAsString());
	}
	
	@Test
	public void testPreDefineWithComplexValueAndParameters() {
		String input = "#define ___config_enabled(__ignored, val, ...) val \n";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreDefine", contentItem.getStatement(0).getTypeAsString());
	}
	
	@Test
	public void testPreDefineWithComplexValueAndParametersAndLineBreak() {
		String input = "#define IS_ENABLED(option) \\ \n" + 
				"	(config_enabled(option) || config_enabled(option##_MODULE))";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreDefine", contentItem.getStatement(0).getTypeAsString());
	}

	@Test
	public void testPreDefineWithString() {
		String input = "#  define XML_FMT_INT_MOD \"ll\"";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreDefine", contentItem.getStatement(0).getTypeAsString());
		assertEquals("XML_FMT_INT_MOD", contentItem.getStatement(0).getChild(0).getEscapedCodeStr());
		assertEquals("\"ll\"", contentItem.getStatement(0).getChild(1).getEscapedCodeStr());
	}
	
	@Test
	public void testPreUndef() {
		String input = "#undef ___config_enabled";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreUndef", contentItem.getStatement(0).getTypeAsString());
	}
	
	@Test
	public void testPreLineWithNum() {
		String input = "#line 5";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreLine", contentItem.getStatement(0).getTypeAsString());
	}
	
	@Test
	public void testPreLineWithNumAndFile() {
		String input = "#line 5 \"Filename\"";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreLine", contentItem.getStatement(0).getTypeAsString());
	}
	
	@Test
	public void testPreDiagnosticError() {
		String input = "#error  \"This is a test error\"";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreDiagnostic", contentItem.getStatement(0).getTypeAsString());
	}
	
	@Test
	public void testPreDiagnosticWarning() {
		String input = "#warning  \"This is a test warning\"";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreDiagnostic", contentItem.getStatement(0).getTypeAsString());
	}
	
	@Test
	public void testPreOtherIdent() {
		String input = "#ident  \"This is a test ident\"";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreOther", contentItem.getStatement(0).getTypeAsString());
	}
	
	@Test
	public void testPreOtherSccs() {
		String input = "#sccs  \"This is a test sccs\"";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreOther", contentItem.getStatement(0).getTypeAsString());
	}
	
	@Test
	public void testPrePragmaDependency() {
		String input = "#pragma GCC dependency \"parse.y\"";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PrePragma", contentItem.getStatement(0).getTypeAsString());
	}
	
	@Test
	public void testPrePragmaDependencyWithExplanationText() {
		String input = "#pragma GCC dependency \"parse.y\" This is a test case \n";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PrePragma", contentItem.getStatement(0).getTypeAsString());
	}
	
	@Test
	public void testPrePragmaPoison() {
		String input = "#pragma GCC poison printf sprintf fprintf";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PrePragma", contentItem.getStatement(0).getTypeAsString());
	}
	
	@Test
	public void testPrePragmaSystemHeader() {
		String input = "#pragma GCC system_header";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PrePragma", contentItem.getStatement(0).getTypeAsString());
	}
	
	@Test
	public void testPrePragmaWarning() {
		String input = "#pragma GCC warning \"This is a test warning\"";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PrePragma", contentItem.getStatement(0).getTypeAsString());
	}
	
	@Test
	public void testPrePragmaError() {
		String input = "#pragma GCC error \"This is a test error\"";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PrePragma", contentItem.getStatement(0).getTypeAsString());
	}
	
	@Test
	public void testPrePragmaOnce() {
		String input = "#pragma once";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PrePragma", contentItem.getStatement(0).getTypeAsString());
	}

}
