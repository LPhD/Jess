package tests.languages.c.parseTreeToAST;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.junit.Test;

import antlr.ModuleLexer;
import ast.ASTNode;
import ast.Comment;
import ast.c.functionDef.FunctionDef;
import ast.c.functionDef.ParameterType;
import ast.declarations.ClassDefStatement;
import ast.declarations.IdentifierDecl;
import ast.functionDef.FunctionDefBase;
import ast.functionDef.ParameterBase;
import ast.preprocessor.PreBlockstarter;
import ast.statements.IdentifierDeclStatement;
import parsing.TokenSubStream;
import parsing.Modules.ANTLRCModuleParserDriver;

public class ModuleBuildersTest {

	@Test
	public void testNestedStructs() {
		String input = "struct x{ struct y { struct z{}; }; }; abc";
		List<ASTNode> codeItems = parseInput(input);
		ClassDefStatement classDef = (ClassDefStatement) codeItems.get(0);
		ClassDefStatement yClass = (ClassDefStatement) classDef.content.getStatements().get(0);
		ClassDefStatement zClass = (ClassDefStatement) yClass.content.getStatements().get(0);

		assertEquals(1, codeItems.size());
		assertEquals("y", yClass.getIdentifier().getEscapedCodeStr());
		assertEquals("z", zClass.getIdentifier().getEscapedCodeStr());
	}

	@Test
	public void testStructName() {
		String input = "struct foo{};";
		List<ASTNode> codeItems = parseInput(input);
		ClassDefStatement codeItem = (ClassDefStatement) codeItems.get(0);
		assertEquals("foo", codeItem.identifier.getEscapedCodeStr());
	}

	@Test
	public void testUnnamedStruct() {
		String input = "struct {int x; } a;";
		List<ASTNode> codeItems = parseInput(input);
		ClassDefStatement codeItem = (ClassDefStatement) codeItems.get(0);
		assertEquals("<unnamed>", codeItem.identifier.getEscapedCodeStr());
	}

	@Test
	public void testStructContent() {
		String input = "struct foo{};";
		List<ASTNode> codeItems = parseInput(input);
		ClassDefStatement codeItem = (ClassDefStatement) codeItems.get(0);
		assertEquals("{", codeItem.content.getEscapedCodeStr());
	}

	@Test
	public void testStructFunctionPointer() {
		String input = "struct foo{ int*** (**bar)(long*); };";
		List<ASTNode> codeItems = parseInput(input);
		ClassDefStatement codeItem = (ClassDefStatement) codeItems.get(0);
		IdentifierDeclStatement ptrStatement = (IdentifierDeclStatement) codeItem.content.getStatements().get(0);
		IdentifierDecl ptrItem = (IdentifierDecl) ptrStatement.getIdentifierDeclList().get(0);

		assertEquals("int * * * ( * * ) ( long * )", ptrItem.getType().completeType);
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
		String input = "void foo(int x, char **ptr){};";
		List<ASTNode> codeItems = parseInput(input);
		FunctionDefBase codeItem = (FunctionDefBase) codeItems.get(0);
		
		assertEquals("void foo (int x , char * * ptr)", codeItem.getEscapedCodeStr());
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
		String input = "#if (a) \n int a; \n #if (b) \n double b; \n #else \n long c; \n #endif \n #endif";
		List<ASTNode> codeItems = parseInput(input);
		//First PreIfStatement is the last node on the stack
		PreBlockstarter codeItem = (PreBlockstarter) codeItems.get(4);	
		assertEquals("PreIfStatement", codeItem.getTypeAsString());
		assertEquals("IdentifierDeclStatement", codeItem.getVariableStatement(0).getTypeAsString());
		assertEquals("#if ( b )", codeItem.getVariableStatement(1).getEscapedCodeStr());
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
		assertEquals("double foo ()", codeItem.getVariableStatement(0).getEscapedCodeStr());
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
		Comment codeItem = (Comment) codeItems.get(0);
		assertEquals("Comment", codeItem.getTypeAsString());
		assertEquals("//This is a function comment \\n", codeItem.getEscapedCodeStr());
		assertEquals("FunctionDef", codeItem.getCommentee().getTypeAsString());
	}
	
	@Test
	public void commentInsideFunction() {
		String input = "int foo(){/*Comment inside function */ int i; }";
		List<ASTNode> codeItems = parseInput(input);
		Comment codeItem = (Comment) codeItems.get(1);
		assertEquals("Comment", codeItem.getTypeAsString());
		assertEquals("/*Comment inside function */", codeItem.getEscapedCodeStr());
		assertEquals("ExpressionStatement", codeItem.getCommentee().getTypeAsString());
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
