package tests.languages.c.parseTreeToAST;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import ast.logical.statements.CompoundStatement;

public class PreprocessorTests {

	@Test
	public void testNestedIfndefs() {
		String input = "#ifdef foo  #else  #ifdef foo  #else  #endif  #endif";
		CompoundStatement item = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals(6, item.getStatements().size());
	}

	@Test
	public void testPreElseStatement() {
		String input = "#if foo  bar(); #else  foo(); foo(); #endif";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreElseStatement", contentItem.getStatement(2).getTypeAsString());
	}
	
	@Test
	public void testPreElseStatementCode() {
		String input = "#if foo  bar(); #else  foo(); foo(); #endif";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("#else", contentItem.getStatement(2).getEscapedCodeStr());
	}

	@Test
	public void testPreIfStatement() {
		String input = "#if foo  int i; #endif";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreIfStatement", contentItem.getStatement(0).getTypeAsString());
	}
	
	@Test
	public void testPreIfStatementCode() {
		String input = "#if foo  int i; #endif";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("#if foo", contentItem.getStatement(0).getEscapedCodeStr());
	}
	
	@Test
	public void testPreElIfStatement() {
		String input = "#if foo  bar();  #elif bar  foo();  foo();  #endif";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreElIfStatement", contentItem.getStatement(2).getTypeAsString());
	}
	
	@Test
	public void testPreElIfStatementCode() {
		String input = "#if foo  bar();  #elif bar  foo();  foo();  #endif";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("#elif bar", contentItem.getStatement(2).getEscapedCodeStr());
	}
	
	@Test
	public void testPreEndIfStatement() {
		String input = "#if bar  int i;  #endif";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreEndIfStatement", contentItem.getStatement(2).getTypeAsString());
	}
	
	@Test
	public void testPreEndIfStatementCode() {
		String input = "#if bar  int i;  #endif";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("#endif", contentItem.getStatement(2).getEscapedCodeStr());
	}
	
	@Test
	public void testPreIfWithBracketsAroundCondition() {
		String input = "#if (foo < 5) int i; #endif";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals(3, contentItem.getStatements().size());
	}
	
	@Test
	public void testPreIfWithDefined() {
		String input = "#if defined (foo) int i; #endif";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreIfStatement", contentItem.getStatement(0).getTypeAsString());
	}
	
	@Test
	public void testPreIfWithNestedCondition() {
		String input = "#if (foo < 5 && ( x < 1 || x > 5 ))  int i;  #endif";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals(3, contentItem.getStatements().size());
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
