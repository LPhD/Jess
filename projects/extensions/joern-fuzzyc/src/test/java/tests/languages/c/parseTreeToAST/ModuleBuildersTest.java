package tests.languages.c.parseTreeToAST;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.junit.Test;

import antlr.ModuleLexer;
import antlr.ModuleParser;
import antlr.ModuleParser.DeclByTypeContext;
import ast.ASTNode;
import ast.Comment;
import ast.c.functionDef.FunctionDef;
import ast.c.functionDef.ParameterType;
import ast.declarations.ClassDefStatement;
import ast.declarations.IdentifierDecl;
import ast.functionDef.FunctionDefBase;
import ast.functionDef.ParameterBase;
import ast.logical.statements.Statement;
import ast.preprocessor.PreBlockstarter;
import ast.statements.IdentifierDeclStatement;
import ast.statements.StructUnionEnum;
import parsing.TokenSubStream;
import parsing.Modules.ANTLRCModuleParserDriver;

public class ModuleBuildersTest {
	
	@Test
	public void testNestedStructs() {
		String input = "struct x{ struct y { struct z{}; }; } abc;";
		List<ASTNode> codeItems = parseInput(input);
		StructUnionEnum structx = (StructUnionEnum) codeItems.get(0);
//		StructUnionEnum structy = (StructUnionEnum) structx.getChild(0);
//		StructUnionEnum structz = (StructUnionEnum) structy.getChild(0);

		assertEquals(1, codeItems.size());
		assertEquals("struct x { struct y { struct z { } ; } ; } abc ;", structx.getEscapedCodeStr());
//		assertEquals("struct y { struct z{ } ; } ;", structy.getEscapedCodeStr());
//		assertEquals("struct z { } ;", structz.getEscapedCodeStr());
	}

	@Test
	public void testStructName() {
		String input = "struct foo{};";
		List<ASTNode> codeItems = parseInput(input);
		StructUnionEnum codeItem = (StructUnionEnum) codeItems.get(0);
		assertEquals("foo", codeItem.getChild(0).getEscapedCodeStr());
	}

	@Test
	public void testTypedefStruct() {
		String input = "typedef struct{int a;}foo;";
		List<ASTNode> codeItems = parseInput(input);
		StructUnionEnum codeItem = (StructUnionEnum) codeItems.get(0);
		assertEquals("typedef struct { int a ; } foo ;", codeItem.getEscapedCodeStr());
	}
	
	@Test
	public void testUnnamedStruct() {
		String input = "struct {int x; } a;";
		List<ASTNode> codeItems = parseInput(input);
		StructUnionEnum codeItem = (StructUnionEnum) codeItems.get(0);
		assertEquals("struct { int x ; } a ;", codeItem.getEscapedCodeStr());
	}

	@Test
	public void testComplexStruct() {
		String input = "struct sccb_mgr_info {\n" + 
				"	u32 si_baseaddr;\n" +
				"	unsigned char si_present;\n" + 
				"	u16 si_per_targ_init_sync;\n" + 
				"	unsigned char si_reserved[4];\n" + 
				"};";
		List<ASTNode> codeItems = parseInput(input);
		StructUnionEnum codeItem = (StructUnionEnum) codeItems.get(0);
		assertEquals("struct sccb_mgr_info { \n" + 
				" u32 si_baseaddr ; \n" + 
				" unsigned char si_present ; \n" + 
				" u16 si_per_targ_init_sync ; \n" + 
				" unsigned char si_reserved [ 4 ] ; \n" + 
				" } ;", codeItem.getEscapedCodeStr());
	}

	@Test
	public void testStructFunctionPointer() {
		String input = "struct foo{ int*** (**bar)(long*); };";
		List<ASTNode> codeItems = parseInput(input);
		StructUnionEnum codeItem = (StructUnionEnum) codeItems.get(0);
//		IdentifierDeclStatement ptrStatement = (IdentifierDeclStatement) codeItem.getChild(1);
//		IdentifierDecl ptrItem = (IdentifierDecl) ptrStatement.getIdentifierDeclList().get(0);
		assertEquals("struct foo { int * * * ( * * bar ) ( long * ) ; } ;", codeItem.getEscapedCodeStr());
//		assertEquals("int * * * ( * * ) ( long * )", ptrItem.getType().completeType);
	}
	
	@Test
	public void structInsideFunction() {
		String input = "int main(void) {\n" + 
				"	int i = 0;\n" + 
				"	struct scsi_device {\n" + 
				"		int x;\n" + 
				"	} sdev;\n" + 
				"	struct block_device {\n" + 
				"		int y;\n" + 
				"	} dev;\n" + 
				"}";
		List<ASTNode> codeItems = parseInput(input);
		//First struct
		StructUnionEnum codeItem = (StructUnionEnum) codeItems.get(0).getChild(0).getChild(1);
		//Name of the first struct
		assertEquals("scsi_device", codeItem.getChild(0).getEscapedCodeStr());
	}

	@Test
	public void testFunctionInClass() {
		String input = "class foo{ bar(){} };";
		List<ASTNode> codeItems = parseInput(input);
		ClassDefStatement codeItem = (ClassDefStatement) codeItems.get(0);
		FunctionDefBase funcItem = (FunctionDefBase) codeItem.content.getStatements().get(0);
		assertEquals("bar", funcItem.getName());
	}

	@Test
	public void testDecl() {
		String input = "int foo;";
		List<ASTNode> codeItems = parseInput(input);
		IdentifierDeclStatement codeItem = (IdentifierDeclStatement) codeItems.get(0);
		IdentifierDecl decl = (IdentifierDecl) codeItem.getIdentifierDeclList().get(0);
		assertEquals("foo", decl.getName().getEscapedCodeStr());
	}

	@Test
	public void testEmptyArrayInitialization() {
		String input = "int arrayTest_2[0] = {};";
		List<ASTNode> codeItems = parseInput(input);
		IdentifierDeclStatement codeItem = (IdentifierDeclStatement) codeItems.get(0);
		assertEquals("IdentifierDeclStatement", codeItem.getTypeAsString());
	}

	@Test
	public void testDeclListAfterClass() {
		String input = "class foo{int x;} y;";
		List<ASTNode> codeItems = parseInput(input);
		IdentifierDeclStatement codeItem = (IdentifierDeclStatement) codeItems.get(codeItems.size() - 1);
		IdentifierDecl decl = (IdentifierDecl) codeItem.getIdentifierDeclList().get(0);
		
		assertEquals("y", decl.getName().getEscapedCodeStr());
	}

	@Test
	public void testClassDefBeforeContent() {
		String input = "class foo{int x;}";
		List<ASTNode> codeItems = parseInput(input);

		ClassDefStatement classCodeItem = (ClassDefStatement) codeItems.get(0);
		IdentifierDeclStatement identifierCodeItem = (IdentifierDeclStatement) classCodeItem.content.getStatements()
				.get(0);
		IdentifierDecl decl = (IdentifierDecl) identifierCodeItem.getIdentifierDeclList().get(0);

		assertEquals("foo", classCodeItem.identifier.getEscapedCodeStr());
		assertEquals("x", decl.getName().getEscapedCodeStr());
	}

	@Test
	public void testFuncName() {
		String input = "void foo(){};";
		List<ASTNode> codeItems = parseInput(input);
		FunctionDefBase codeItem = (FunctionDefBase) codeItems.get(0);
		assertEquals("foo", codeItem.getName());
	}

	@Test
	public void testFuncSignature() {
		String input = "void foo(int x, char **ptr){}";
		List<ASTNode> codeItems = parseInput(input);
		FunctionDefBase codeItem = (FunctionDefBase) codeItems.get(0);
		
		assertEquals("void foo ( int x , char * * ptr ) ", codeItem.getEscapedCodeStr());
	}
	
	@Test
	public void testStaticFuncDeclaration() {
		String input = "static int blogic_diskparam(struct scsi_device *sdev, struct block_device *dev, int *params);";
		List<ASTNode> codeItems = parseInput(input);
		Statement codeItem = (Statement) codeItems.get(0);
		
		assertEquals("static int blogic_diskparam ( struct scsi_device * sdev , struct block_device * dev , int * params ) ;", codeItem.getEscapedCodeStr());
	}
	
	@Test
	public void testFuncWithNewlines() {
		String input = "static\n void\n foo(){}";
		List<ASTNode> codeItems = parseInput(input);
		FunctionDef codeItem = (FunctionDef) codeItems.get(0);
		assertEquals("foo", codeItem.getName());
		assertEquals("static \n void \n foo ( ) ", codeItem.getEscapedCodeStr());
	}
	
	

	@Test
	public void testSimpleParamList() {
		String input = "int foo(int x){}";
		List<ASTNode> codeItems = parseInput(input);
		FunctionDefBase codeItem = (FunctionDefBase) codeItems.get(0);
		assertEquals(4, codeItem.getChildCount());
	}

	@Test
	public void testParamListGetCodeStr() {
		String input = "int foo(char *myParam, myType x){}";
		List<ASTNode> codeItems = parseInput(input);
		FunctionDefBase codeItem = (FunctionDefBase) codeItems.get(0);
		String codeStr = codeItem.getParameterList().getEscapedCodeStr();		
		assertEquals("char * myParam , myType x", codeStr);
	}

	@Test
	public void testParamGetCodeStr() {
		String input = "int foo(char *myParam, myType x){}";
		List<ASTNode> codeItems = parseInput(input);
		FunctionDefBase codeItem = (FunctionDefBase) codeItems.get(0);
		ParameterBase parameter = codeItem.getParameterList().getParameter(0);
		String codeStr = parameter.getEscapedCodeStr();		
		assertEquals("char * myParam", codeStr);
	}

	@Test
	public void testParamName() {
		String input = "int foo(myType myParam){}";
		List<ASTNode> codeItems = parseInput(input);
		FunctionDefBase codeItem = (FunctionDefBase) codeItems.get(0);
		String name = codeItem.getParameterList().getParameter(0).getName();
		assertEquals("myParam", name);
	}

	@Test
	public void testParamType() {
		String input = "int foo(char *myParam){}";
		List<ASTNode> codeItems = parseInput(input);
		FunctionDefBase codeItem = (FunctionDefBase) codeItems.get(0);
		ParameterType type = (ParameterType) codeItem.getParameterList().getParameter(0).getType();		
		assertEquals("char *", type.getEscapedCodeStr());
	}

	@Test
	public void testFunctionPtrParam() {
		String input = "int foo(void (*ptr)(char *)){}";
		List<ASTNode> codeItems = parseInput(input);
		FunctionDefBase codeItem = (FunctionDefBase) codeItems.get(0);		
		assertEquals("foo", codeItem.getName());
	}

	@Test
	public void testEmptyParamList() {
		String input = "int foo(){}";
		List<ASTNode> codeItems = parseInput(input);
		FunctionDefBase codeItem = (FunctionDefBase) codeItems.get(0);
		assertEquals(4, codeItem.getChildCount());
		assertEquals("", codeItem.getParameterList().getEscapedCodeStr());
	}
	
	@Test
	public void testVoidParam() {
		String input = "int foo(void){}";
		List<ASTNode> codeItems = parseInput(input);
		FunctionDefBase codeItem = (FunctionDefBase) codeItems.get(0);
		assertEquals(4, codeItem.getChildCount());
		assertEquals("void", codeItem.getParameterList().getEscapedCodeStr());
	}

	@Test
	public void testEmptyParamListLocation() {
		String input = "int foo(){}";
		List<ASTNode> codeItems = parseInput(input);
		FunctionDefBase codeItem = (FunctionDefBase) codeItems.get(0);
		assertEquals(0, codeItem.getParameterList().size());
	}
	
	
	@Test
	public void preprocessorModuleBuilderASTAndVariabilityNestingTest() {
		String input = "#if (modulefoo < 5) \n int modulei1; \n #elif (modulefoo > 5) \n double modulei2; \n #else \n long modulei3; \n #endif";
		List<ASTNode> codeItems = parseInput(input);
		//First PreIfStatement is the last node on the stack
		PreBlockstarter codeItem = (PreBlockstarter) codeItems.get(3);	
		assertEquals("PreIfStatement", codeItem.getTypeAsString());
		assertEquals("int modulei1 ;", codeItem.getVariableStatement(0).getEscapedCodeStr());
		codeItem = (PreBlockstarter) codeItem.getChild(1);	
		assertEquals("PreElIfStatement", codeItem.getTypeAsString());
		assertEquals("double modulei2 ;", codeItem.getVariableStatement(0).getEscapedCodeStr());
		codeItem = (PreBlockstarter) codeItem.getChild(1);	
		assertEquals("PreElseStatement", codeItem.getTypeAsString());
		assertEquals("long modulei3 ;", codeItem.getVariableStatement(0).getEscapedCodeStr());
		codeItem = (PreBlockstarter) codeItem.getChild(0);	
		assertEquals("PreEndIfStatement", codeItem.getTypeAsString());
	}
	
	@Test
	public void preprocessorModuleBuilderVariabilityNestingWithNestedIFsTest() {
		String input = "#if (a) \n int a;  #if (b) \n double b;  #else  long c;  #endif  #endif";
		List<ASTNode> codeItems = parseInput(input);
		//First PreIfStatement is the last node on the stack
		PreBlockstarter codeItem = (PreBlockstarter) codeItems.get(4);	
		assertEquals("PreIfStatement", codeItem.getTypeAsString());
		assertEquals("IdentifierDeclStatement", codeItem.getVariableStatement(0).getTypeAsString());
		assertEquals("#if ( b ) \n", codeItem.getVariableStatement(1).getEscapedCodeStr());
		assertEquals("PreEndIfStatement", codeItem.getChild(1).getTypeAsString());
	}
	
	
	@Test
	public void preprocessorModuleBuilderTestWithNestingChildren() {
		String input = "#if (modulefoo < 5) \n int foo(){ int modulei1;} \n #elif (modulefoo > 5) \n double foo(){ double modulei1;} \n #else \n long foo(){ long modulei1;} \n #endif";
		List<ASTNode> codeItems = parseInput(input);
		//First PreIfStatement is the last node on the stack
		PreBlockstarter codeItem = (PreBlockstarter) codeItems.get(3);	
		assertEquals("PreIfStatement", codeItem.getTypeAsString());
		assertEquals("FunctionDef", codeItem.getVariableStatement(0).getTypeAsString());
		//#elif (modulefoo > 5)
		codeItem = (PreBlockstarter) codeItem.getChild(1);	
		assertEquals("PreElIfStatement", codeItem.getTypeAsString());
		assertEquals("double foo ( ) ", codeItem.getVariableStatement(0).getEscapedCodeStr());
		//#else
		codeItem = (PreBlockstarter) codeItem.getChild(1);			
		assertEquals("PreElseStatement", codeItem.getTypeAsString());
		assertEquals("FunctionDef", codeItem.getVariableStatement(0).getTypeAsString());
		//#endif
		codeItem = (PreBlockstarter) codeItem.getChild(0);		
		assertEquals("PreEndIfStatement", codeItem.getTypeAsString());
	}
	
	@Test
	public void commentForFunction() {
		String input = "//This is a function comment \n int foo(){}";
		List<ASTNode> codeItems = parseInput(input);
		//Comment is the second item, because we need the commentee to be processed first
		Comment codeItem = (Comment) codeItems.get(1);
		assertEquals("Comment", codeItem.getTypeAsString());
		assertEquals("//This is a function comment ", codeItem.getEscapedCodeStr());
		assertEquals("FunctionDef", codeItem.getCommentee().getTypeAsString());
	}

	@Test
	public void preIfWithMultipleLineCondition() {
		String input = "#if defined(__GNUC__) \\ \n" + 
				"&& (__GNUC__ > 2 || (__GNUC__ == 2 && __GNUC_MINOR__ >= 96)) \n #endif";
		List<ASTNode> codeItems = parseInput(input);
		PreBlockstarter codeItem = (PreBlockstarter) codeItems.get(0);	
		assertEquals("PreIfStatement", codeItem.getTypeAsString());
		assertEquals("#if defined ( __GNUC__ ) \\ \n"  +
				" && ( __GNUC__ > 2 || ( __GNUC__ == 2 && __GNUC_MINOR__ >= 96 ) ) \n", codeItem.getEscapedCodeStr());
		//Still some problems with the condition here
//		assertEquals("#if defined ( __GNUC__ ) \\ \n"  +
//				" && ( __GNUC__ > 2 || ( __GNUC__ == 2 && __GNUC_MINOR__ >= 96 ) ) \n", codeItem.getChild(0).getEscapedCodeStr());
	}
	
	@Test
	public void testMCommentInSameLine() {
		String input = "/*This is a comment in the same line */ int (foo)(){}";
		List<ASTNode> codeItems = parseInput(input);
		//Comment is the second item, because we need the commentee to be processed first
		Comment codeItem = (Comment) codeItems.get(1);
		assertEquals("Comment", codeItem.getTypeAsString());
		assertEquals("/*This is a comment in the same line */", codeItem.getEscapedCodeStr());
		assertEquals("FunctionDef", codeItem.getCommentee().getTypeAsString());
	}
	
	@Test
	public void testPreIfWithCommentInSameLine() {
		String input = "#if A /*This is a comment in the same line */ \n";
		List<ASTNode> codeItems = parseInput(input);
		Comment comment = (Comment) codeItems.get(0);
		assertEquals("Comment", comment.getTypeAsString());
		assertEquals("/*This is a comment in the same line */", comment.getEscapedCodeStr());
		assertEquals("PreIfStatement", comment.getCommentee().getTypeAsString());
	}
	
	@Test
	public void testTwoCommentsAfterEachOther() {
		//This test is for non-greedy lexer behavior
		String input = "/* This file contains examples from https://github.com/torvalds/linux/drivers/scsi/BusLogic.h */\n" + 
				"/* Bit 7 */\n"
				+ "int i;";

		List<ASTNode> codeItems = parseInput(input);
		Comment comment1 = (Comment) codeItems.get(2);
		assertEquals("Comment", comment1.getTypeAsString());
		assertEquals("/* This file contains examples from https://github.com/torvalds/linux/drivers/scsi/BusLogic.h */", comment1.getEscapedCodeStr());
		Comment comment2 = (Comment) codeItems.get(1);
		assertEquals("/* Bit 7 */", comment2.getEscapedCodeStr());
	}

	private List<ASTNode> parseInput(String input) {
		ANTLRCModuleParserDriver parser = new ANTLRCModuleParserDriver();
		TestASTWalker testProcessor = new TestASTWalker();
		parser.addObserver(testProcessor);

		ANTLRInputStream inputStream = new ANTLRInputStream(input);
		ModuleLexer lex = new ModuleLexer(inputStream);
		TokenSubStream tokens = new TokenSubStream(lex);

		parser.parseAndWalkTokenStream(tokens);
		return testProcessor.codeItems;
	}

}
