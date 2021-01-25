package tests.languages.c.parseTreeToAST;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ast.c.preprocessor.blockstarter.PreElseStatement;
import ast.c.preprocessor.blockstarter.PreIfStatement;
import ast.c.preprocessor.commands.macro.PreDefine;
import ast.c.statements.blockstarters.IfStatement;
import ast.logical.statements.CompoundStatement;
import ast.logical.statements.Statement;
import ast.preprocessor.PreBlockstarter;
import ast.statements.ExpressionStatement;

public class PreprocessorTests {

	@Test
	public void testNestedIfdefs() {
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
	public void testNestedIfdefsWithKeywords() {
		String input = "#ifndef XML_MIN_SIZE\n" + 
				"#  if ! defined(__cplusplus) && ! defined(inline)\n" + 
				"#    ifdef __GNUC__\n" + 
				"#      define inline __inline\n" + 
				"#    endif /* __GNUC__ */\n" + 
				"#  endif\n" + 
				"#endif /* XML_MIN_SIZE */";
		CompoundStatement item = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("Top level childs have to be the 3 #ifdefs, 1 #define and 2 comments", 6, item.getStatements().size());
		PreBlockstarter firstIf = (PreBlockstarter) item.getStatement(0);
		assertEquals("#ifdef foo1 has 2 childs (condition and #endif)",2, firstIf.getChildCount());
		assertEquals("#ifndef XML_MIN_SIZE \n", firstIf.getEscapedCodeStr());
		PreBlockstarter secondIf = (PreBlockstarter) firstIf.getVariableStatement(0);
		PreBlockstarter thirdIf = (PreBlockstarter) secondIf.getVariableStatement(0);
		PreDefine preDef = (PreDefine) thirdIf.getVariableStatement(0);
		assertEquals("#      define inline __inline \n", preDef.getEscapedCodeStr());
	}
	
	@Test
	public void testMoarNestedIfdefsWithKeywords() {
		String input = "#ifdef __cplusplus\n" + 
				"#  define inline inline\n" + 
				"#else\n" + 
				"#  ifndef inline\n" + 
				"#    define inline\n" + 
				"#  endif\n" + 
				"#endif";
		CompoundStatement item = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("Top level childs has to be 2 #ifdefs and 2 #defines", 4, item.getStatements().size());
		PreBlockstarter firstIf = (PreBlockstarter) item.getStatement(0);
		assertEquals("#ifdef foo1 has 2 childs (condition and #else)",2, firstIf.getChildCount());
		assertEquals("#ifdef __cplusplus \n", firstIf.getEscapedCodeStr());
		//First define is variable
		PreDefine preDef = (PreDefine) firstIf.getVariableStatement(0);
		assertEquals("#  define inline inline", preDef.getEscapedCodeStr());
		
		PreElseStatement preElse = (PreElseStatement) firstIf.getChild(1);
		assertEquals("First #else has 1 child (#endif)", 1, preElse.getChildCount());
		//First #else has 1 variable statement
		PreBlockstarter secondIf = (PreBlockstarter) preElse.getVariableStatement(0);
		PreDefine preDef2 = (PreDefine) secondIf.getVariableStatement(0);
		assertEquals("#    define inline \n", preDef2.getEscapedCodeStr());
		
	}
	
	
	@Test
	public void testVariableStatements() {
		String input = "#if foo \n  bar(); #else  int i; i++; #endif";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		//#if
		PreBlockstarter bs = (PreBlockstarter) contentItem.getStatement(0);
		assertEquals("bar ( ) ;", bs.getVariableStatement(0).getEscapedCodeStr());
		//#else
		bs = (PreBlockstarter) bs.getChild(1);
		assertEquals("int i ;", bs.getVariableStatement(0).getEscapedCodeStr());
		assertEquals("i ++ ;", bs.getVariableStatement(1).getEscapedCodeStr());
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
		PreIfStatement preStmt = (PreIfStatement) contentItem.getChild(0);
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
	public void testPreIfWithCommentsInsideCondition() {
		String input = "#if    (LIBAVFORMAT_VERSION_MICRO >= 100 /* FFmpeg */ && \\\n" + 
				"        LIBAVFORMAT_VERSION_INT >= AV_VERSION_INT(57, 33, 100)) \\\n" + 
				"    || (LIBAVFORMAT_VERSION_MICRO < 100 && /* Libav */ \\\n" + 
				"        LIBAVFORMAT_VERSION_INT >= AV_VERSION_INT(57, 5, 0))";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("( LIBAVFORMAT_VERSION_MICRO >= 100 /* FFmpeg */ && \\ \n" + 
				" LIBAVFORMAT_VERSION_INT >= AV_VERSION_INT ( 57 , 33 , 100 ) ) \\ \n" + 
				" || ( LIBAVFORMAT_VERSION_MICRO < 100 && /* Libav */ \\ \n" + 
				" LIBAVFORMAT_VERSION_INT >= AV_VERSION_INT ( 57 , 5 , 0 ) )", contentItem.getStatement(0).getChild(0).getEscapedCodeStr());
	}
	
	@Test
	public void testPreIfInsideExpression() {
		String input = "a = 5 + \n"
				+ "#ifdef x \n"
				+ "x + \n"
				+ "#endif \n"
				+ "1;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement expr = (ExpressionStatement) contentItem.getStatement(0);
		assertEquals("a = 5 + \n"
				+ " #ifdef x \n"
				+ " x + \n"
				+ " #endif \n"
				+ " 1 ;", expr.getEscapedCodeStr());
	}
	
	@Test
	public void testPreIfInsideComplexExpression() {
		String input = "if ((listen_socket = socket(sa.sa.sa_family, SOCK_STREAM, 0)) < 0 ||\n" + 
				"\n" + 
				"#ifdef SO_REUSEADDR\n" + 
				"\n" + 
				"setsockopt(listen_socket, SOL_SOCKET, SO_REUSEADDR, (char*)&reuse, sizeof(reuse)) < 0 ||\n" + 
				"\n" + 
				"#endif\n" + 
				"\n" + 
				"bind(listen_socket, (struct sockaddr *) &sa, sock_len) < 0 ||\n" + 
				"\n" + 
				"listen(listen_socket, backlog) < 0) {\n" + 
				"return -1;\n" + 
				"}";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IfStatement ifItem = (IfStatement) contentItem.getStatement(0);
		assertEquals("if ( ( listen_socket = socket ( sa . sa . sa_family , SOCK_STREAM , 0 ) ) < 0 || \n" + 
				" \n" + 
				" #ifdef SO_REUSEADDR \n" + 
				" \n" + 
				" setsockopt ( listen_socket , SOL_SOCKET , SO_REUSEADDR , ( char * ) & reuse , sizeof ( reuse ) ) < 0 || \n" + 
				" \n" + 
				" #endif \n" + 
				" \n" + 
				" bind ( listen_socket , ( struct sockaddr * ) & sa , sock_len ) < 0 || \n" + 
				" \n" + 
				" listen ( listen_socket , backlog ) < 0 )", ifItem.getEscapedCodeStr());
	}
		
	
	@Test
	public void testPreIncludeStatementWithBrackets() {
		String input = "#include <file.h>";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreInclude", contentItem.getStatement(0).getTypeAsString());
		assertEquals("#include <file.h>", contentItem.getStatement(0).getEscapedCodeStr());
	}
	
	@Test
	public void testPreIncludeStatementWithQuotes() {
		String input = "#include \"something.h\"";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreInclude", contentItem.getStatement(0).getTypeAsString());
		assertEquals("#include \"something.h\"", contentItem.getStatement(0).getEscapedCodeStr());
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
		String input = "#define IS_ENABLED(option) \\\n" + 
				"	(config_enabled(option) || config_enabled(option##_MODULE))";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreDefine", contentItem.getStatement(0).getTypeAsString());
		assertEquals("#define IS_ENABLED( option ) \\\n" + 
				" ( config_enabled ( option ) || config_enabled ( option##_MODULE ) )", contentItem.getStatement(0).getEscapedCodeStr());
	}

	@Test
	public void testPreDefineWithString() {
		String input = "#  define XML_FMT_INT_MOD \"ll\"";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("PreDefine", contentItem.getStatement(0).getTypeAsString());
		assertEquals("XML_FMT_INT_MOD", contentItem.getStatement(0).getChild(0).getEscapedCodeStr());
		assertEquals("\"ll\" <EOF>", contentItem.getStatement(0).getChild(1).getEscapedCodeStr());
	}
	
	@Test
	public void testPreDefineWithBracketsAfterIdentifier() {
		String input = "#define size (5 + 3)";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);		
		assertEquals("PreDefine", contentItem.getStatement(0).getTypeAsString());
		assertEquals("#define size ( 5 + 3 )", contentItem.getStatement(0).getEscapedCodeStr());

	}
	
	@Test
	public void testPreDefineMacroWithBracketsAfterIdentifier() {
		String input = "#define fnmatch(x, y, z) ( !PathMatchSpec(y, x) )";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);		
		assertEquals("PreDefine", contentItem.getStatement(0).getTypeAsString());
		assertEquals("#define fnmatch( x , y , z ) ( ! PathMatchSpec ( y , x ) )", contentItem.getStatement(0).getEscapedCodeStr());
	}
		
	
	@Test
	public void testPreDefineMacroWithoutContent() {
		String input = "#define HASH_BLOOM_MAKE(tbl)";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);		
		assertEquals("#define HASH_BLOOM_MAKE( tbl )", contentItem.getStatement(0).getEscapedCodeStr());
	}
	
	@Test
	public void testPreDefineMacro() {
		String input = "#define size(a) a + 3";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);		
		assertEquals("PreDefine", contentItem.getStatement(0).getTypeAsString());
		assertEquals("#define size( a ) a + 3", contentItem.getStatement(0).getEscapedCodeStr());
	}
	
	@Test
	public void testPreDefineMacroWithCondExpression() {
		String input = "#define MIN(X,Y) (X) < (Y) ? (X) : (Y)";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);		
		assertEquals("PreDefine", contentItem.getStatement(0).getTypeAsString());
		assertEquals("#define MIN( X , Y ) ( X ) < ( Y ) ? ( X ) : ( Y )", contentItem.getStatement(0).getEscapedCodeStr());
	}

	
	@Test
	public void testPreDefineMacroCallsAnotherMacro() {
		String input = "#define size(a) calculateSize(a, a)";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);	
		PreDefine statement = (PreDefine) contentItem.getStatement(0);
		assertEquals("PreDefine", statement.getTypeAsString());
		assertEquals("#define size( a ) calculateSize ( a , a )", statement.getEscapedCodeStr());
		assertEquals("size ( a )", statement.getChild(0).getEscapedCodeStr());
		assertEquals("calculateSize ( a , a )", statement.getChild(1).getChild(0).getEscapedCodeStr());
		assertEquals("CallExpression", statement.getChild(1).getChild(0).getTypeAsString());
	}	
	
	@Test
	public void testPreDefineMacroCallsAnotherMacroWithComplexParameters() {
		String input = "# define SG(v) ZEND_TSRMG_FAST(sapi_globals_offset, sapi_globals_struct *, v)";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);	
		PreDefine statement = (PreDefine) contentItem.getStatement(0);
		assertEquals("PreDefine", statement.getTypeAsString());
		assertEquals("# define SG( v ) ZEND_TSRMG_FAST ( sapi_globals_offset , sapi_globals_struct * , v )", statement.getEscapedCodeStr());
		assertEquals("SG ( v )", statement.getChild(0).getEscapedCodeStr());
		assertEquals("ZEND_TSRMG_FAST ( sapi_globals_offset , sapi_globals_struct * , v )", statement.getChild(1).getChild(0).getEscapedCodeStr());
		assertEquals("CallExpression", statement.getChild(1).getChild(0).getTypeAsString());
	}
	
	@Test
	public void testPreDefineOfAttribute() {
		String input = "#define PHPAPI __declspec(dllimport)";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		PreDefine stmt = (PreDefine) contentItem.getStatement(0);
		assertEquals("PreDefine", stmt.getTypeAsString());
		assertEquals("#define PHPAPI __declspec ( dllimport )", stmt.getEscapedCodeStr());
	}
	
	@Test
	public void testMacroCallOnFunctionLevel() {
		String input = "CHECK_AND_RETURN(ptr)";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		Statement stmt = (Statement) contentItem.getStatement(0);
		assertEquals("Statement", stmt.getTypeAsString());
		assertEquals("MacroCall", stmt.getChild(0).getTypeAsString());
	}
	
	@Test
	public void testMacroCallWithMacroAttribute() {
		String input = "PHPAPI ZEND_DECLARE_MODULE_GLOBALS(output)";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		Statement stmt = (Statement) contentItem.getStatement(0);
		assertEquals("Statement", stmt.getTypeAsString());
		assertEquals("MacroCall", stmt.getChild(0).getTypeAsString());
		assertEquals("PHPAPI ZEND_DECLARE_MODULE_GLOBALS ( output )", stmt.getChild(0).getEscapedCodeStr());
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
		assertEquals("Statement", contentItem.getStatement(0).getTypeAsString());
	}
	
	@Test
	public void testPreOtherSccs() {
		String input = "#sccs  \"This is a test sccs\"";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("Statement", contentItem.getStatement(0).getTypeAsString());
	}
	
	@Test
	public void testPreOtherAttribute() {
		String input = "__attribute__((format(printf, 1, 2)))";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("Statement", contentItem.getStatement(0).getTypeAsString());
		assertEquals("__attribute__ ( ( format ( printf , 1 , 2 ) ) )", contentItem.getStatement(0).getEscapedCodeStr());
	}
	
	@Test
	public void testPreOtherAttributeWithString() {
		String input = "__attribute__((visibility(\"default\")))";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		assertEquals("Statement", contentItem.getStatement(0).getTypeAsString());
		assertEquals("__attribute__ ( ( visibility ( \"default\" ) ) )", contentItem.getStatement(0).getEscapedCodeStr());
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
