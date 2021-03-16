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
import ast.c.preprocessor.blockstarter.PreElseStatement;
import ast.c.preprocessor.blockstarter.PreIfStatement;
import ast.c.preprocessor.commands.macro.MacroCall;
import ast.c.preprocessor.commands.macro.PreDefine;
import ast.custom.CustomNode;
import ast.declarations.IdentifierDecl;
import ast.functionDef.FunctionDefBase;
import ast.functionDef.ParameterBase;
import ast.logical.statements.Statement;
import ast.preprocessor.PreBlockstarter;
import ast.preprocessor.PreStatementBase;
import ast.statements.FunctionPointerDeclare;
import ast.statements.IdentifierDeclStatement;
import ast.statements.StructUnionEnum;
import ast.statements.blockstarters.ForStatement;
import ast.statements.blockstarters.WhileStatement;
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
	public void testStructWithCommentAfterEnding() {
		String input = " struct _php_stream { \n" + 
				"   const php_stream_ops * ops ; \n" + 
				"   void * abstract ; /* convenience pointer for abstraction */ \n" + 
				"   zend_off_t writepos ; \n" + 
				"   \n" + 
				"   /* how much data to read when filling buffer */ \n" + 
				"   size_t chunk_size ; \n" + 
				"   \n" + 
				"   #if ZEND_DEBUG \n" + 
				"   const char * open_filename ; \n" + 
				"   uint32_t open_lineno ; \n" + 
				"   #endif \n" + 
				"   \n" + 
				"   struct _php_stream * enclosing_stream ; /* this is a private stream owned by enclosing_stream */ \n" + 
				"   } ;	/* php_stream */" +
				" int a;";
		List<ASTNode> codeItems = parseInput(input);
		StructUnionEnum codeItem = (StructUnionEnum) codeItems.get(0);
		//Currently, we handle the comment as part of the struct, as we cannot validate that the comment is in the same line as the struct
		//because the Struct's line is its starting line (here 1), where the comment is in line 15.
		//TODO: Match with ctx.getEnd() or something instead of getLine()
//		IdentifierDeclStatement codeItem2 = (IdentifierDeclStatement) codeItems.get(1);
//		Comment codeItem3 = (Comment) codeItems.get(2);
		assertEquals("struct _php_stream { \n" + 
				" const php_stream_ops * ops ; \n" + 
				" void * abstract ; /* convenience pointer for abstraction */ \n" + 
				" zend_off_t writepos ; \n" + 
				" \n" + 
				" /* how much data to read when filling buffer */ \n" + 
				" size_t chunk_size ; \n" + 
				" \n" + 
				" #if ZEND_DEBUG \n" + 
				" const char * open_filename ; \n" + 
				" uint32_t open_lineno ; \n" + 
				" #endif \n" + 
				" \n" + 
				" struct _php_stream * enclosing_stream ; /* this is a private stream owned by enclosing_stream */ \n" + 
				" } ; /* php_stream */", codeItem.getEscapedCodeStr());
//		assertEquals("/* php_stream */", codeItem3.getEscapedCodeStr0));
//		assertEquals("struct content", codeItem3.getCommentee().getEscapedCodeStr());
	}

	@Test
	public void testTypedefStruct() {
		String input = "typedef struct{int a;}foo;";
		List<ASTNode> codeItems = parseInput(input);
		StructUnionEnum codeItem = (StructUnionEnum) codeItems.get(0);
		assertEquals("typedef struct { int a ; } foo ;", codeItem.getEscapedCodeStr());
	}
	
	@Test
	public void testTypedefDecl() {
		String input = "typedef unsigned int uint32_t;";
		List<ASTNode> codeItems = parseInput(input);
		IdentifierDeclStatement codeItem = (IdentifierDeclStatement) codeItems.get(0);
		assertEquals("typedef unsigned int uint32_t ;", codeItem.getEscapedCodeStr());
	}
	
	@Test
	public void testTypedefFunctionPointerWithStrangeBrackets() {
		String input = "typedef php_stream *(php_stream_transport_factory_func)(const char *proto, size_t protolen,\n" + 
				"		const char *resourcename, size_t resourcenamelen,\n" + 
				"		const char *persistent_id, int options, int flags,\n" + 
				"		struct timeval *timeout,\n" + 
				"		php_stream_context *context STREAMS_DC);";
		List<ASTNode> codeItems = parseInput(input);
		FunctionPointerDeclare codeItem = (FunctionPointerDeclare) codeItems.get(0);
		assertEquals("typedef php_stream * ( php_stream_transport_factory_func ) ( const char * proto , size_t protolen , \n" + 
				" const char * resourcename , size_t resourcenamelen , \n" + 
				" const char * persistent_id , int options , int flags , \n" + 
				" struct timeval * timeout , \n" + 
				" php_stream_context * context STREAMS_DC ) ;", codeItem.getEscapedCodeStr());
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
	public void testComplexStructInsideFunction() {
		String input = "void function() {  \n"
				+ "struct TestCase cases[] = {\n" + 
				"      {00, \"\"},\n" + 
				"      {00, UTF8_LEAD_1},\n" + 
				"      {-1, UTF8_LEAD_2},\n" + 
				"      {00, UTF8_LEAD_2 UTF8_FOLLOW},\n" + 
				"      {-1, UTF8_LEAD_3},\n" + 
				"      {-2, UTF8_LEAD_3 UTF8_FOLLOW},\n" + 
				"      {00, UTF8_LEAD_3 UTF8_FOLLOW UTF8_FOLLOW},\n" + 
				"      {-1, UTF8_LEAD_4},\n" + 
				"      {-2, UTF8_LEAD_4 UTF8_FOLLOW},\n" + 
				"      {-3, UTF8_LEAD_4 UTF8_FOLLOW UTF8_FOLLOW},\n" + 
				"      {00, UTF8_LEAD_4 UTF8_FOLLOW UTF8_FOLLOW UTF8_FOLLOW},\n" + 		//Caution: Ends with an empty argument
				"  };" +
				"}";
		List<ASTNode> codeItems = parseInput(input);
		FunctionDef codeItem1 = (FunctionDef) codeItems.get(0);
		IdentifierDeclStatement codeItem2 = (IdentifierDeclStatement) codeItem1.getContent().getChild(0);
		assertEquals("struct TestCase cases [ ] = { \n" + 
				" { 00 , \"\" } , \n" + 
				" { 00 , UTF8_LEAD_1 } , \n" + 
				" { - 1 , UTF8_LEAD_2 } , \n" + 
				" { 00 , UTF8_LEAD_2 UTF8_FOLLOW } , \n" + 
				" { - 1 , UTF8_LEAD_3 } , \n" + 
				" { - 2 , UTF8_LEAD_3 UTF8_FOLLOW } , \n" + 
				" { 00 , UTF8_LEAD_3 UTF8_FOLLOW UTF8_FOLLOW } , \n" + 
				" { - 1 , UTF8_LEAD_4 } , \n" + 
				" { - 2 , UTF8_LEAD_4 UTF8_FOLLOW } , \n" + 
				" { - 3 , UTF8_LEAD_4 UTF8_FOLLOW UTF8_FOLLOW } , \n" + 
				" { 00 , UTF8_LEAD_4 UTF8_FOLLOW UTF8_FOLLOW UTF8_FOLLOW } , \n" + 
				" } ;", codeItem2.getEscapedCodeStr());
	}


	@Test
	public void testStructFunctionPointer() {
		String input = "struct foo{ int*** (**bar)(long*); };";
		List<ASTNode> codeItems = parseInput(input);
		StructUnionEnum codeItem = (StructUnionEnum) codeItems.get(0);
		assertEquals("struct foo { int * * * ( * * bar ) ( long * ) ; } ;", codeItem.getEscapedCodeStr());
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
	public void structWithNewline() {
		String input = "struct dfa_comp\n" + 
				"{\n" + 
				"  /* Regex compiled regexps. */\n" + 
				"  struct re_pattern_buffer *patterns;\n" + 
				"  size_t pcount;\n" + 
				"  struct re_registers regs;\n" + 
				"  bool begline;\n" + 
				"};";
		List<ASTNode> codeItems = parseInput(input);
		StructUnionEnum codeItem = (StructUnionEnum) codeItems.get(0);
		assertEquals("struct dfa_comp \n" + 
				" { \n" + 
				" /* Regex compiled regexps. */ \n" + 
				" struct re_pattern_buffer * patterns ; \n" + 
				" size_t pcount ; \n" + 
				" struct re_registers regs ; \n" + 
				" bool begline ; \n" + 
				" } ;", codeItem.getEscapedCodeStr());
		assertEquals("dfa_comp", codeItem.getChild(0).getEscapedCodeStr());
	}	
	
	
	@Test
	public void testStaticEnumWithNewlines() {
		String input = "static enum\n" + 
				"  {\n" + 
				"    READ_COMMAND_LINE_DEVICES,\n" + 
				"    READ_DEVICES,\n" + 
				"    SKIP_DEVICES\n" + 
				"  } devices = READ_COMMAND_LINE_DEVICES;";
		List<ASTNode> codeItems = parseInput(input);
		StructUnionEnum codeItem = (StructUnionEnum) codeItems.get(0);
		assertEquals("static enum \n" + 
				" { \n" + 
				" READ_COMMAND_LINE_DEVICES , \n" + 
				" READ_DEVICES , \n" + 
				" SKIP_DEVICES \n" + 
				" } devices = READ_COMMAND_LINE_DEVICES ;", codeItem.getEscapedCodeStr());
	}
	
//	@Test
//	public void testFunctionInClass() {
//		String input = "class foo{ bar(){} }";
//		List<ASTNode> codeItems = parseInput(input);
//		ClassDefStatement codeItem = (ClassDefStatement) codeItems.get(0);
//		FunctionDefBase funcItem = (FunctionDefBase) codeItem.content.getStatements().get(0);
//		assertEquals("bar", funcItem.getName());
//	}
	
	
	@Test
	public void ifWithPreprocessorIf() {
		String input = "void bar() {"
				+ "if(foo){"
				+ "#ifdef one \n"
				+ "puts(\"One\"); \n"
				+ "#else \n"
				+ "puts(\"Two\"); \n"
				+ "#endif} \n"
				+ "}";
		List<ASTNode> codeItems = parseInput(input);
		FunctionDefBase funcItem  = (FunctionDefBase) codeItems.get(0);
		PreIfStatement preIf = (PreIfStatement) funcItem.getContent().getChild(0);
		assertEquals("puts ( \"One\" ) ;",preIf.getVariableStatement(0).getEscapedCodeStr());
		PreElseStatement preElse = (PreElseStatement) preIf.getChild(1);
		assertEquals("puts ( \"Two\" ) ;",preElse.getVariableStatement(0).getEscapedCodeStr());
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
	public void testFunctionPointerDecl() {
		String input = "int (*functionPtr) (int,int);";
		List<ASTNode> codeItems = parseInput(input);
		FunctionPointerDeclare codeItem = (FunctionPointerDeclare) codeItems.get(0);
		assertEquals("int ( * functionPtr ) ( int , int ) ;", codeItem.getEscapedCodeStr());
		assertEquals("functionPtr", codeItem.getChild(0).getEscapedCodeStr());
	}
		
	@Test
	public void testVoidFunctionPointerDecl() {
		String input = "void (*functionPtr) (void);";
		List<ASTNode> codeItems = parseInput(input);
		FunctionPointerDeclare codeItem = (FunctionPointerDeclare) codeItems.get(0);
		assertEquals("void ( * functionPtr ) ( void ) ;", codeItem.getEscapedCodeStr());
		assertEquals("functionPtr", codeItem.getChild(0).getEscapedCodeStr());
	}
	
	@Test
	public void testFunctionPointerDeclWithTypedef() {
		String input = "typedef int (*myFuncDef)(int, int);";
		List<ASTNode> codeItems = parseInput(input);
		FunctionPointerDeclare codeItem = (FunctionPointerDeclare) codeItems.get(0);
		assertEquals("typedef int ( * myFuncDef ) ( int , int ) ;", codeItem.getEscapedCodeStr());
		assertEquals("myFuncDef", codeItem.getChild(0).getEscapedCodeStr());
	}

	@Test
	public void testFunctionPointerDeclWithTypedefAndMacroCall() {
		String input = "typedef void (*fcgi_logger)(int type, const char *fmt, ...) ZEND_ATTRIBUTE_FORMAT(printf, 2, 3);";
		List<ASTNode> codeItems = parseInput(input);
		FunctionPointerDeclare codeItem = (FunctionPointerDeclare) codeItems.get(0);
		assertEquals("typedef void ( * fcgi_logger ) ( int type , const char * fmt , ... ) ZEND_ATTRIBUTE_FORMAT ( printf , 2 , 3 ) ;", codeItem.getEscapedCodeStr());
		assertEquals("fcgi_logger", codeItem.getChild(0).getEscapedCodeStr());
		assertEquals("MacroCall", codeItem.getChild(1).getTypeAsString());
		assertEquals("ZEND_ATTRIBUTE_FORMAT ( printf , 2 , 3 )", codeItem.getChild(1).getEscapedCodeStr());
	}
	
	@Test
	public void testFunctionDeclWithPHPAttribute() {
		String input = "PHPAPI size_t php_printf(const char *format, ...) PHP_ATTRIBUTE_FORMAT(printf, 1, 2);";
		List<ASTNode> codeItems = parseInput(input);
		IdentifierDeclStatement codeItem = (IdentifierDeclStatement) codeItems.get(0);
		assertEquals("PHPAPI size_t php_printf ( const char * format , ... ) PHP_ATTRIBUTE_FORMAT ( printf , 1 , 2 ) ;", codeItem.getEscapedCodeStr());
		assertEquals("php_printf ( const char * format , ... )", codeItem.getChild(0).getEscapedCodeStr());
	}
	
	@Test
	public void testFunctionDeclWithMacroCall() {
		String input = "PHPAPI int ap_php_slprintf(char *buf, size_t len, const char *format,...) ZEND_ATTRIBUTE_FORMAT(printf, 3, 4);";
		List<ASTNode> codeItems = parseInput(input);
		IdentifierDeclStatement codeItem = (IdentifierDeclStatement) codeItems.get(0);
		assertEquals("PHPAPI int ap_php_slprintf ( char * buf , size_t len , const char * format , ... ) ZEND_ATTRIBUTE_FORMAT ( printf , 3 , 4 ) ;", codeItem.getEscapedCodeStr());
		assertEquals("ap_php_slprintf ( char * buf , size_t len , const char * format , ... )", codeItem.getChild(0).getEscapedCodeStr());
	}
	
	@Test
	public void testFunctionDeclWithNewlinesAndComments() {
		String input = "PHPAPI void php_network_populate_name_from_sockaddr(\n" + 
				"		/* input address */\n" + 
				"		struct sockaddr *sa, socklen_t sl,\n" + 
				"		/* output readable address */\n" + 
				"		zend_string **textaddr,\n" + 
				"		/* output address */\n" + 
				"		struct sockaddr **addr,\n" + 
				"		socklen_t *addrlen\n" + 
				"		);";
		List<ASTNode> codeItems = parseInput(input);
		IdentifierDeclStatement codeItem = (IdentifierDeclStatement) codeItems.get(0);
		assertEquals("PHPAPI void php_network_populate_name_from_sockaddr ( \n" + 
				" /* input address */ \n" + 
				" struct sockaddr * sa , socklen_t sl , \n" + 
				" /* output readable address */ \n" + 
				" zend_string * * textaddr , \n" + 
				" /* output address */ \n" + 
				" struct sockaddr * * addr , \n" + 
				" socklen_t * addrlen \n" + 
				" ) ;", codeItem.getEscapedCodeStr());
	}
	
	@Test
	public void testDeclWithExternKeyword() {
		String input = "extern int XML_ProcessFile(XML_Parser parser, const XML_Char *filename);";
		List<ASTNode> codeItems = parseInput(input);
		IdentifierDeclStatement codeItem = (IdentifierDeclStatement) codeItems.get(0);
		assertEquals("extern int XML_ProcessFile ( XML_Parser parser , const XML_Char * filename ) ;", codeItem.getEscapedCodeStr());
		IdentifierDecl identifierDecl = (IdentifierDecl) codeItem.getIdentifierDeclList().get(0);
		assertEquals("XML_ProcessFile", identifierDecl.getName().getEscapedCodeStr());
	}
	
	@Test
	public void testDeclWithComplexDataType() {
		String input = "SAPI_API extern int sapi_globals_id;";
		List<ASTNode> codeItems = parseInput(input);
		IdentifierDeclStatement codeItem = (IdentifierDeclStatement) codeItems.get(0);
		assertEquals("SAPI_API extern int sapi_globals_id ;", codeItem.getEscapedCodeStr());
		IdentifierDecl identifierDecl = (IdentifierDecl) codeItem.getIdentifierDeclList().get(0);
		assertEquals("sapi_globals_id", identifierDecl.getName().getEscapedCodeStr());
	}
	
		
	@Test
	public void testStaticConstUnsignedArrayInitializatio() {
		String input = "static const unsigned namingBitmap[] = {\n" + 
				"0x00000000 , 0x00000000 , 0x00000000 , 0x00000000 , 0x00000000 , 0x00000000 };";
		List<ASTNode> codeItems = parseInput(input);
		IdentifierDeclStatement codeItem = (IdentifierDeclStatement) codeItems.get(0);
		assertEquals("static const unsigned namingBitmap [ ] = { \n" + 
				" 0x00000000 , 0x00000000 , 0x00000000 , 0x00000000 , 0x00000000 , 0x00000000 } ;", codeItem.getEscapedCodeStr());
		IdentifierDecl decl = (IdentifierDecl) codeItem.getIdentifierDeclList().get(0);
		assertEquals("namingBitmap", decl.getName().getEscapedCodeStr());
	}	
	
	@Test
	public void testEmptyArrayInitialization() {
		String input = "int arrayTest_2[0] = {};";
		List<ASTNode> codeItems = parseInput(input);
		IdentifierDeclStatement codeItem = (IdentifierDeclStatement) codeItems.get(0);
		assertEquals("IdentifierDeclStatement", codeItem.getTypeAsString());
	}

//	@Test
//	public void testDeclListAfterClass() {
//		String input = "class foo{int x;} y;";
//		List<ASTNode> codeItems = parseInput(input);
//		IdentifierDeclStatement codeItem = (IdentifierDeclStatement) codeItems.get(codeItems.size() - 1);
//		IdentifierDecl decl = (IdentifierDecl) codeItem.getIdentifierDeclList().get(0);
//		
//		assertEquals("y", decl.getName().getEscapedCodeStr());
//	}

//	@Test
//	public void testClassDefBeforeContent() {
//		String input = "class foo{int x;}";
//		List<ASTNode> codeItems = parseInput(input);
//
//		ClassDefStatement classCodeItem = (ClassDefStatement) codeItems.get(0);
//		IdentifierDeclStatement identifierCodeItem = (IdentifierDeclStatement) classCodeItem.content.getStatements()
//				.get(0);
//		IdentifierDecl decl = (IdentifierDecl) identifierCodeItem.getIdentifierDeclList().get(0);
//
//		assertEquals("foo", classCodeItem.identifier.getEscapedCodeStr());
//		assertEquals("x", decl.getName().getEscapedCodeStr());
//	}

	@Test
	public void testFuncName() {
		String input = "void foo(){}";
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
	public void testFuncSignatureWithMacroCall() {
		String input = "macro(type) foo(int x, char **ptr){}";
		List<ASTNode> codeItems = parseInput(input);
		FunctionDefBase codeItem = (FunctionDefBase) codeItems.get(0);
		
		assertEquals("macro ( type ) foo ( int x , char * * ptr ) ", codeItem.getEscapedCodeStr());
	}
	
	@Test
	public void testFuncSignatureWithMacroCallAndType() {
		String input = "SAPI_API SAPI_POST_READER_FUNC(sapi_read_standard_form_data)\n" + 
				"{}";
		List<ASTNode> codeItems = parseInput(input);
		FunctionDefBase codeItem = (FunctionDefBase) codeItems.get(0);
		
		assertEquals("SAPI_API SAPI_POST_READER_FUNC ( sapi_read_standard_form_data ) \n ", codeItem.getEscapedCodeStr());
	}
	
	@Test
	public void testCompleteFuncSignatureWithMacroCall() {
		String input = "PHP_FUNCTION(header_register_callback)\n" + 
				"{}";
		List<ASTNode> codeItems = parseInput(input);
		FunctionDefBase codeItem = (FunctionDefBase) codeItems.get(0);
		
		assertEquals("PHP_FUNCTION ( header_register_callback ) \n ", codeItem.getEscapedCodeStr());
	}
	

	@Test
	public void testStaticFuncDeclaration() {
		String input = "static int blogic_diskparam(struct scsi_device *sdev, struct block_device *dev, int *params);";
		List<ASTNode> codeItems = parseInput(input);
		Statement codeItem = (Statement) codeItems.get(0);
		
		assertEquals("static int blogic_diskparam ( struct scsi_device * sdev , struct block_device * dev , int * params ) ;", codeItem.getEscapedCodeStr());
	}
	
	@Test
	public void testFuncDeclarationWithGCCAttribute() {
		String input = "extern ptrdiff_t kwswords (kwset_t) _GL_ATTRIBUTE_PURE;";
		List<ASTNode> codeItems = parseInput(input);
		Statement codeItem = (Statement) codeItems.get(0);
		
		assertEquals("extern ptrdiff_t kwswords ( kwset_t ) _GL_ATTRIBUTE_PURE ;", codeItem.getEscapedCodeStr());
	}
	
	@Test
	public void testFuncDeclarationWithAnotherGCCAttribute() {
		String input = "extern ptrdiff_t kwsexec (kwset_t, char const *, ptrdiff_t,\n" + 
				" struct kwsmatch *, bool)\n" + 
				" _GL_ARG_NONNULL ((4));";
		List<ASTNode> codeItems = parseInput(input);
		Statement codeItem = (Statement) codeItems.get(0);
		
		assertEquals("extern ptrdiff_t kwsexec ( kwset_t , char const * , ptrdiff_t , \n" + 
				" struct kwsmatch * , bool ) \n" + 
				" _GL_ARG_NONNULL ( ( 4 ) ) ;", codeItem.getEscapedCodeStr());
	}
	
	@Test
	public void testFuncDefWithGCCAttribute() {
		String input = "static bool _GL_ATTRIBUTE_PURE\n" + 
				"possible_backrefs_in_pattern (char const *keys, ptrdiff_t len, bool bs_safe)\n" + 
				"{}";
		List<ASTNode> codeItems = parseInput(input);
		FunctionDef codeItem = (FunctionDef) codeItems.get(0);
		
		assertEquals("static bool _GL_ATTRIBUTE_PURE \n" + 
				" possible_backrefs_in_pattern ( char const * keys , ptrdiff_t len , bool bs_safe ) \n ", codeItem.getEscapedCodeStr());
	}
	
	@Test
	public void testFuncDefWithAnotherGCCAttribute() {
		String input = "static void _GL_ATTRIBUTE_FORMAT_PRINTF_STANDARD (1, 2)\n" + 
				"printf_errno (char const *format, ...)\n" + 
				"{}";
		List<ASTNode> codeItems = parseInput(input);
		FunctionDef codeItem = (FunctionDef) codeItems.get(0);
		
		assertEquals("static void _GL_ATTRIBUTE_FORMAT_PRINTF_STANDARD ( 1 , 2 ) \n" + 
				" printf_errno ( char const * format , ... ) \n ", codeItem.getEscapedCodeStr());
	}
	
	@Test
	public void testVoidPointerFuncDeclarationWithNewline() {
		String input = "void *\n" + 
				"GEAcompile (char *pattern, size_t size, reg_syntax_t syntax_bits,\n" + 
				"            bool exact)\n" + 
				"{}";
		List<ASTNode> codeItems = parseInput(input);
		FunctionDef codeItem = (FunctionDef) codeItems.get(0);	
		assertEquals("FunctionDef", codeItem.getTypeAsString());
		assertEquals("GEAcompile", codeItem.getName());
		assertEquals("void * \n" + 
				" GEAcompile ( char * pattern , size_t size , reg_syntax_t syntax_bits , \n" + 
				" bool exact ) \n ", codeItem.getEscapedCodeStr());
	}
	
	@Test
	public void testFuncDefWithEmptyCompound() {
		String input = "static void clear_asan_poison ( void ) { }";
		List<ASTNode> codeItems = parseInput(input);
		FunctionDef codeItem = (FunctionDef) codeItems.get(0);
		//FunctionDef starts at 0
		assertEquals(0, codeItem.getCharAtLine());
		//Compound should start at 0+1
		assertEquals(1, codeItem.getContent().getCharAtLine());
		//BlockCloser also is at 1 (as this is relative to the beginning of the Compound)
		assertEquals(1, codeItem.getContent().getChild(0).getCharAtLine());				
	}
	
	@Test
	public void testStaticFuncDeclarationWithNewlines() {
		String input = "int\n" + 
				"main(int argc, char *argv[])\n" + 
				"{\n" + 
				"    return windows_main(argc, argv);\n" + 
				"}";
		List<ASTNode> codeItems = parseInput(input);
		FunctionDef codeItem = (FunctionDef) codeItems.get(0);
		
		assertEquals("FunctionDef", codeItem.getTypeAsString());
		assertEquals("main", codeItem.getName());
		assertEquals("int \n" + 
				" main ( int argc , char * argv [ ] ) \n ", codeItem.getEscapedCodeStr());
	}
	
	@Test
	public void testStaticFuncDeclarationWithNewlines2() {
		String input = "void dummy_invalid_parameter_handler(\n" + 
				"		const wchar_t *expression,\n" + 
				"		const wchar_t *function,\n" + 
				"		const wchar_t *file,\n" + 
				"		unsigned int   line,\n" + 
				"		uintptr_t      pEwserved)\n" + 
				"{}";
		List<ASTNode> codeItems = parseInput(input);
		FunctionDef codeItem = (FunctionDef) codeItems.get(0);
		
		assertEquals("FunctionDef", codeItem.getTypeAsString());
		assertEquals("dummy_invalid_parameter_handler", codeItem.getName());
		assertEquals("void dummy_invalid_parameter_handler ( \n" + 
				" const wchar_t * expression , \n" + 
				" const wchar_t * function , \n" + 
				" const wchar_t * file , \n" + 
				" unsigned int line , \n" + 
				" uintptr_t pEwserved ) \n ", codeItem.getEscapedCodeStr());
	}
	
	@Test
	public void testThreadFuncDeclaration() {
		String input = "__thread int threadFunc() {}";
		List<ASTNode> codeItems = parseInput(input);
		FunctionDef codeItem = (FunctionDef) codeItems.get(0);
		assertEquals("threadFunc", codeItem.getName());
		assertEquals("__thread int threadFunc ( ) ", codeItem.getEscapedCodeStr());
	}
	
	@Test
	public void testThreadStructDeclaration() {
		String input = "__thread struct threadStruct{};";
		List<ASTNode> codeItems = parseInput(input);
		StructUnionEnum codeItem = (StructUnionEnum) codeItems.get(0);
		assertEquals("__thread struct threadStruct { } ;", codeItem.getEscapedCodeStr());
	}
	
	@Test
	public void testComplexArrayDeclaration() {
		String input = "uint8_t h_table[H_SIZE] __attribute__((aligned(64)));";
		List<ASTNode> codeItems = parseInput(input);
		IdentifierDeclStatement codeItem = (IdentifierDeclStatement) codeItems.get(0);
		assertEquals("uint8_t h_table [ H_SIZE ] __attribute__ ( ( aligned ( 64 ) ) ) ;", codeItem.getEscapedCodeStr());
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
		assertEquals(3, codeItem.getChildCount());
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
		assertEquals(3, codeItem.getChildCount());
		assertEquals("", codeItem.getParameterList().getEscapedCodeStr());
	}
	
	@Test
	public void testVoidParam() {
		String input = "int foo(void){}";
		List<ASTNode> codeItems = parseInput(input);
		FunctionDefBase codeItem = (FunctionDefBase) codeItems.get(0);
		assertEquals(3, codeItem.getChildCount());
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
	public void testMacroCallOnModuleLevel() {
		String input = "MACRO(A)";
		List<ASTNode> codeItems = parseInput(input);
		PreStatementBase codeItem = (PreStatementBase) codeItems.get(0);
		MacroCall codeItem2 = (MacroCall) codeItem.getChild(0);
		assertEquals("MACRO ( A )", codeItem2.getEscapedCodeStr());
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
	public void preprocessorEndingWithOnelineComment() {
		String input = " #ifdef __APPLE__\n" + 
				" # define _DARWIN_C_SOURCE // for strdup(), strtok_r(), memset_pattern4()\n" + 
				" #endif";
		List<ASTNode> codeItems = parseInput(input);
		PreBlockstarter codeItem = (PreBlockstarter) codeItems.get(1);	
		assertEquals("PreIfStatement", codeItem.getTypeAsString());
		assertEquals("PreDefine", codeItem.getVariableStatement(0).getTypeAsString());
		//Ensure that the endif is not parsed as part of the preDefine
		assertEquals("# define _DARWIN_C_SOURCE // for strdup(), strtok_r(), memset_pattern4()\n", codeItem.getVariableStatement(0).getEscapedCodeStr());
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
		//No relevant childs, therefore empty
		assertEquals("", codeItem.getChild(0).getEscapedCodeStr());
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
		String input = "#if A /*This is a comment in the same line */ \n #endif";
		List<ASTNode> codeItems = parseInput(input);
		PreIfStatement preIf = (PreIfStatement) codeItems.get(0);
		//Currently, comments inside #ifs are not parsed separately
		assertEquals("#if A /*This is a comment in the same line */ \n", preIf.getEscapedCodeStr());
//		Comment comment = (Comment) codeItems.get(0);
//		assertEquals("Comment", comment.getTypeAsString());
//		assertEquals("/*This is a comment in the same line */", comment.getEscapedCodeStr());
//		assertEquals("PreIfStatement", comment.getCommentee().getTypeAsString());
	}
	
	@Test
	public void testNoEndlessLoop() {
		//This input caused an endless parsing loop, because of nesting expression and preprocessor rules
		String input = 
				"#ifndef uthash_fatal\n" + 
				"#define uthash_fatal(msg) exit(-1) /* fatal error (out of memory,etc) */\n" + 
				"#endif\n" +				
				"#ifndef uthash_malloc\n" + 
				"#define uthash_malloc(sz) malloc(sz) /* malloc fcn                      */\n" + 
				"#endif\n" +				
				"#ifndef uthash_free\n" + 
				"#define uthash_free(ptr, sz) free(ptr) /* free fcn                        */\n" + 
				"#endif\n" +			
				"#ifndef uthash_noexpand_fyi\n" + 
				"#define uthash_noexpand_fyi(tbl) /* can be defined to log noexpand  */\n" + 
				"#endif\n" +				
				"#ifndef uthash_expand_fyi\n" + 
				"#define uthash_expand_fyi(tbl) /* can be defined to log expands   */\n" + 
				"#endif\n" +
				"/* calculate the element whose hash handle address is hhe */\n" + 
				"#define ELMT_FROM_HH(tbl, hhp) ((void *)(((char *)(hhp)) - ((tbl)->hho)))\n"; 
		List<ASTNode> codeItems = parseInput(input);
		PreDefine preDef = (PreDefine) codeItems.get(0);
		//This must contain just the define with its comment, no other statements
		assertEquals("#define uthash_fatal( msg ) exit ( - 1 ) /* fatal error (out of memory,etc) */ \n", preDef.getEscapedCodeStr());
	}
	
	
	@Test
	public void testSpecificPHPWater() {
		String input = "/* If compiling with GCC 2, this file's not needed.  */\n" + 
				"#if !defined (__GNUC__) || __GNUC__ < 2\n" + 
				"\n" + 
				"/* If someone has defined alloca as a macro,\n" + 
				"   there must be some other way alloca is supposed to work.  */\n" + 
				"#ifndef alloca\n" + 
				"\n" + 
				"#ifdef emacs\n" + 
				"#ifdef static\n" + 
				"/* actually, only want this if static is defined as \"\"\n" + 
				"   -- this is for usg, in which emacs must undefine static\n" + 
				"   in order to make unexec workable\n" + 
				"   */\n" + 
				"#ifndef STACK_DIRECTION\n"
				+ "you\n" + 
				"lose\n" + 
				"-- must know STACK_DIRECTION at compile-time" +
				"#endif /* STACK_DIRECTION undefined */\n" + 
				"#endif /* static */\n" + 
				"#endif /* emacs */\n" +
				"/* If your stack is a linked list of frames, you have to\n" + 
				"   provide an \"address metric\" ADDRESS_FUNCTION macro.  */\n" + 
				"\n" + 
				"#if defined (CRAY) && defined (CRAY_STACKSEG_END)\n" + 
				"long i00afunc ();\n" + 
				"#define ADDRESS_FUNCTION(arg) (char *) i00afunc (&(arg))\n" + 
				"#else\n" + 
				"#define ADDRESS_FUNCTION(arg) &(arg)\n" + 
				"#endif" + 
				"#endif /* no alloca */\n" + 
				"#endif /* not GCC version 2 */\n";
		List<ASTNode> codeItems = parseInput(input);
		//Custom rule for this specific error "message", as otherwise we would get unintended parser behavior
		CustomNode customNode = (CustomNode) codeItems.get(0);
		assertEquals("you \n" + 
				" lose \n" + 
				" -- must know STACK_DIRECTION at compile-time", customNode.getEscapedCodeStr());
		PreIfStatement pNode = (PreIfStatement) codeItems.get(1);
		assertEquals("#ifndef STACK_DIRECTION \n", pNode.getEscapedCodeStr());
		IdentifierDeclStatement iNode = (IdentifierDeclStatement) codeItems.get(4);
		assertEquals("long i00afunc ( ) ;", iNode.getEscapedCodeStr());
		PreDefine dNode = (PreDefine) codeItems.get(5);
		assertEquals("#define ADDRESS_FUNCTION( arg ) ( char * ) i00afunc ( & ( arg ) ) \n", dNode.getEscapedCodeStr());
		Comment cNode = (Comment) codeItems.get(10);
		assertEquals("/* If compiling with GCC 2, this file's not needed.  */", cNode.getEscapedCodeStr());
	}
	
	//This problem does not occur in the functionParser variant of this test. It checks a rare case where a singleline while is the last statement
	@Test
	public void testSingleLineWhile() {
		String input = "PHPAPI void php_output_end_all(void) {\n" + 
				"	while (OG(active) && php_output_stack_pop(PHP_OUTPUT_POP_FORCE));\n" + 
				"}";
		List<ASTNode> codeItems = parseInput(input);
		WhileStatement wStmt = (WhileStatement) codeItems.get(0).getChild(0).getChild(0);
		assertEquals("while ( OG ( active ) && php_output_stack_pop ( PHP_OUTPUT_POP_FORCE ) ) ;", wStmt.getEscapedCodeStr());
	}
	
	//Same as above, but for forStatements
	@Test
	public void testSingleLineFor() {
		String input = "PHPAPI void php_output_end_all(void) {\n" + 
				"	for(;;);\n" + 
				"}";
		List<ASTNode> codeItems = parseInput(input);
		ForStatement fStmt = (ForStatement) codeItems.get(0).getChild(0).getChild(0);
		assertEquals("for ( ; ; ) ;", fStmt.getEscapedCodeStr());
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
	
	@Test
	public void testSingleCommentInFile() {
		String input = "/* Bit 7 */";

		List<ASTNode> codeItems = parseInput(input);
		Comment comment = (Comment) codeItems.get(0);
		assertEquals("/* Bit 7 */", comment.getEscapedCodeStr());
	}
	
	
	@Test
	public void testCommentWithTwoStars() {
		String input = "/* This is a special comment **/ \n";
		List<ASTNode> codeItems = parseInput(input);
		Comment comment = (Comment) codeItems.get(0);
		assertEquals("/* This is a special comment **/", comment.getEscapedCodeStr());
	}
	
	@Test
	public void testCommentWithCurlyBrackets() {
		String input = "static int format_converter(register buffy * odp, const char *fmt, va_list ap) /* {{{ */ \n { }";
		List<ASTNode> codeItems = parseInput(input);
		FunctionDef func = (FunctionDef) codeItems.get(0);
		assertEquals("static int format_converter ( register buffy * odp , const char * fmt , va_list ap ) /* {{{ */ \n ", func.getEscapedCodeStr());
	}
	
	@Test
	public void testNullExpressionStatement() {
		String input = ";";

		List<ASTNode> codeItems = parseInput(input);
		IdentifierDeclStatement stmt = (IdentifierDeclStatement) codeItems.get(0);
		assertEquals(";", stmt.getEscapedCodeStr());
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
