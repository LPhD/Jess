// Generated from ..\java\antlr\Module.g4 by ANTLR 4.5.3

	package antlr;


  import java.util.Stack;
  import java.util.EmptyStackException;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ModuleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, NEWLINE=65, ESCAPE=66, 
		ELLIPSIS=67, IF=68, ELSE=69, FOR=70, WHILE=71, BREAK=72, CASE=73, CONTINUE=74, 
		SWITCH=75, DO=76, GOTO=77, RETURN=78, TYPEDEF=79, STATIC=80, VOID=81, 
		UNSIGNED=82, SIGNED=83, CV_QUALIFIER=84, EXTERN=85, VIRTUAL=86, TRY=87, 
		CATCH=88, THROW=89, USING=90, NAMESPACE=91, AUTO=92, REGISTER=93, SPECIAL_DATA=94, 
		OPERATOR=95, TEMPLATE=96, CLASS_KEY=97, NEW=98, PRE_IF=99, PRE_ELIF=100, 
		PRE_ELSE=101, PRE_ENDIF=102, PRE_DEFINE=103, PRE_UNDEF=104, PRE_DIAGNOSTIC=105, 
		PRE_OTHER=106, PRE_INCLUDE=107, PRE_INCLUDE_NEXT=108, PRE_LINE=109, PRE_PRAGMA=110, 
		PRE_GCC=111, PRE_PRAGMA_KEYWORDS=112, PRE_STR=113, PRE_ATTRIBUTE=114, 
		END_TEST=115, ALPHA_NUMERIC=116, OPENING_CURLY=117, CLOSING_CURLY=118, 
		HEX_LITERAL=119, DECIMAL_LITERAL=120, OCTAL_LITERAL=121, FLOATING_POINT_LITERAL=122, 
		COMMENT=123, CHAR=124, STRING=125, WHITESPACE=126, OTHER=127;
	public static final int
		RULE_code = 0, RULE_using_directive = 1, RULE_pre_statement = 2, RULE_pre_blockstarter = 3, 
		RULE_pre_if_statement = 4, RULE_pre_elif_statement = 5, RULE_pre_else_statement = 6, 
		RULE_pre_endif_statement = 7, RULE_pre_if_condition = 8, RULE_condition = 9, 
		RULE_pre_command = 10, RULE_pre_define = 11, RULE_pre_undef = 12, RULE_pre_macro_identifier = 13, 
		RULE_keyword = 14, RULE_pre_macro_parameters = 15, RULE_pre_macro = 16, 
		RULE_macroCall = 17, RULE_pre_diagnostic = 18, RULE_pre_other = 19, RULE_attributeList = 20, 
		RULE_attribute = 21, RULE_pre_include = 22, RULE_pre_include_next = 23, 
		RULE_pre_include_local_file = 24, RULE_pre_include_filename = 25, RULE_pre_line = 26, 
		RULE_pre_pragma = 27, RULE_comment = 28, RULE_newline = 29, RULE_unary_operator = 30, 
		RULE_relational_operator = 31, RULE_constant = 32, RULE_function_decl_specifiers = 33, 
		RULE_ptr_operator = 34, RULE_access_specifier = 35, RULE_operator = 36, 
		RULE_assignment_operator = 37, RULE_equality_operator = 38, RULE_template_decl_start = 39, 
		RULE_template_param_list = 40, RULE_no_brackets = 41, RULE_no_brackets_curlies_or_squares = 42, 
		RULE_no_brackets_or_semicolon = 43, RULE_no_angle_brackets_or_brackets = 44, 
		RULE_no_curlies = 45, RULE_no_squares = 46, RULE_no_squares_or_semicolon = 47, 
		RULE_no_comma_or_semicolon = 48, RULE_assign_water = 49, RULE_assign_water_l2 = 50, 
		RULE_water = 51, RULE_custom = 52, RULE_asciiTab = 53, RULE_externC = 54, 
		RULE_macroFunctionPointer = 55, RULE_testStart = 56, RULE_testEnd = 57, 
		RULE_function_def = 58, RULE_return_type = 59, RULE_function_param_list = 60, 
		RULE_parameter_decl_clause = 61, RULE_parameter_decl = 62, RULE_parameter_id = 63, 
		RULE_compound_statement = 64, RULE_ctor_list = 65, RULE_ctor_initializer = 66, 
		RULE_initializer_id = 67, RULE_ctor_expr = 68, RULE_function_name = 69, 
		RULE_exception_specification = 70, RULE_type_id_list = 71, RULE_simple_decl = 72, 
		RULE_var_decl = 73, RULE_callingConvention = 74, RULE_special_datatype = 75, 
		RULE_init_declarator_list = 76, RULE_class_def = 77, RULE_class_name = 78, 
		RULE_base_classes = 79, RULE_base_class = 80, RULE_type_name = 81, RULE_base_type = 82, 
		RULE_param_decl_specifiers = 83, RULE_parameter_name = 84, RULE_param_type_list = 85, 
		RULE_param_type = 86, RULE_param_type_id = 87, RULE_identifier = 88, RULE_number = 89, 
		RULE_ptrs = 90, RULE_func_ptrs = 91, RULE_expr = 92, RULE_assign_expr = 93, 
		RULE_conditional_expression = 94, RULE_or_expression = 95, RULE_and_expression = 96, 
		RULE_inclusive_or_expression = 97, RULE_exclusive_or_expression = 98, 
		RULE_bit_and_expression = 99, RULE_equality_expression = 100, RULE_relational_expression = 101, 
		RULE_shift_expression = 102, RULE_additive_expression = 103, RULE_multiplicative_expression = 104, 
		RULE_function_pointer_use_expression = 105, RULE_cast_expression = 106, 
		RULE_cast_target = 107, RULE_unary_expression = 108, RULE_address_of_expression = 109, 
		RULE_new_expression = 110, RULE_unary_op_and_cast_expr = 111, RULE_sizeof_expression = 112, 
		RULE_sizeof = 113, RULE_defined_expression = 114, RULE_sizeof_operand = 115, 
		RULE_sizeof_operand2 = 116, RULE_inc_dec = 117, RULE_postfix_expression = 118, 
		RULE_initializer_expression = 119, RULE_argument_list = 120, RULE_argument = 121, 
		RULE_primary_expression = 122, RULE_null_expression = 123, RULE_init_declarator = 124, 
		RULE_declarator = 125, RULE_type_suffix = 126, RULE_assign_expr_w_ = 127, 
		RULE_assign_expr_w__l2 = 128, RULE_constant_expr_w_ = 129;
	public static final String[] ruleNames = {
		"code", "using_directive", "pre_statement", "pre_blockstarter", "pre_if_statement", 
		"pre_elif_statement", "pre_else_statement", "pre_endif_statement", "pre_if_condition", 
		"condition", "pre_command", "pre_define", "pre_undef", "pre_macro_identifier", 
		"keyword", "pre_macro_parameters", "pre_macro", "macroCall", "pre_diagnostic", 
		"pre_other", "attributeList", "attribute", "pre_include", "pre_include_next", 
		"pre_include_local_file", "pre_include_filename", "pre_line", "pre_pragma", 
		"comment", "newline", "unary_operator", "relational_operator", "constant", 
		"function_decl_specifiers", "ptr_operator", "access_specifier", "operator", 
		"assignment_operator", "equality_operator", "template_decl_start", "template_param_list", 
		"no_brackets", "no_brackets_curlies_or_squares", "no_brackets_or_semicolon", 
		"no_angle_brackets_or_brackets", "no_curlies", "no_squares", "no_squares_or_semicolon", 
		"no_comma_or_semicolon", "assign_water", "assign_water_l2", "water", "custom", 
		"asciiTab", "externC", "macroFunctionPointer", "testStart", "testEnd", 
		"function_def", "return_type", "function_param_list", "parameter_decl_clause", 
		"parameter_decl", "parameter_id", "compound_statement", "ctor_list", "ctor_initializer", 
		"initializer_id", "ctor_expr", "function_name", "exception_specification", 
		"type_id_list", "simple_decl", "var_decl", "callingConvention", "special_datatype", 
		"init_declarator_list", "class_def", "class_name", "base_classes", "base_class", 
		"type_name", "base_type", "param_decl_specifiers", "parameter_name", "param_type_list", 
		"param_type", "param_type_id", "identifier", "number", "ptrs", "func_ptrs", 
		"expr", "assign_expr", "conditional_expression", "or_expression", "and_expression", 
		"inclusive_or_expression", "exclusive_or_expression", "bit_and_expression", 
		"equality_expression", "relational_expression", "shift_expression", "additive_expression", 
		"multiplicative_expression", "function_pointer_use_expression", "cast_expression", 
		"cast_target", "unary_expression", "address_of_expression", "new_expression", 
		"unary_op_and_cast_expr", "sizeof_expression", "sizeof", "defined_expression", 
		"sizeof_operand", "sizeof_operand2", "inc_dec", "postfix_expression", 
		"initializer_expression", "argument_list", "argument", "primary_expression", 
		"null_expression", "init_declarator", "declarator", "type_suffix", "assign_expr_w_", 
		"assign_expr_w__l2", "constant_expr_w_"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "'='", "'START_TEST'", "'inline'", "'explicit'", 
		"'friend'", "'public'", "'private'", "'protected'", "'long'", "','", "'_GL_ATTRIBUTE_PURE'", 
		"'_GL_INLINE_HEADER_BEGIN'", "'_GL_INLINE_HEADER_END'", "'_GL_ATTRIBUTE_FORMAT_PRINTF_STANDARD'", 
		"'&'", "'*'", "'+'", "'-'", "'~'", "'!'", "'<'", "'>'", "'<='", "'>='", 
		"'delete'", "'['", "']'", "'/'", "'%'", "'^'", "'|'", "'+='", "'-='", 
		"'*='", "'/='", "'%='", "'^='", "'&='", "'|='", "'>>'", "'<<'", "'>>='", 
		"'<<='", "'=='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'->*'", "'->'", 
		"'\"C\"'", "':'", "'::'", "'char'", "'int'", "'restrict'", "'?'", "'sizeof'", 
		"'defined'", "'.'", null, "'\\'", "'...'", "'if'", "'else'", "'for'", 
		"'while'", "'break'", "'case'", "'continue'", "'switch'", "'do'", "'goto'", 
		"'return'", "'typedef'", "'static'", "'void'", "'unsigned'", "'signed'", 
		null, "'extern'", "'virtual'", "'try'", "'catch'", "'throw'", "'using'", 
		"'namespace'", "'auto'", "'register'", null, "'operator'", "'template'", 
		"'class'", "'new'", null, null, null, null, null, null, null, null, null, 
		null, null, null, "'GCC'", null, null, null, "'END_TEST'", null, "'{'", 
		"'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "NEWLINE", "ESCAPE", "ELLIPSIS", "IF", "ELSE", 
		"FOR", "WHILE", "BREAK", "CASE", "CONTINUE", "SWITCH", "DO", "GOTO", "RETURN", 
		"TYPEDEF", "STATIC", "VOID", "UNSIGNED", "SIGNED", "CV_QUALIFIER", "EXTERN", 
		"VIRTUAL", "TRY", "CATCH", "THROW", "USING", "NAMESPACE", "AUTO", "REGISTER", 
		"SPECIAL_DATA", "OPERATOR", "TEMPLATE", "CLASS_KEY", "NEW", "PRE_IF", 
		"PRE_ELIF", "PRE_ELSE", "PRE_ENDIF", "PRE_DEFINE", "PRE_UNDEF", "PRE_DIAGNOSTIC", 
		"PRE_OTHER", "PRE_INCLUDE", "PRE_INCLUDE_NEXT", "PRE_LINE", "PRE_PRAGMA", 
		"PRE_GCC", "PRE_PRAGMA_KEYWORDS", "PRE_STR", "PRE_ATTRIBUTE", "END_TEST", 
		"ALPHA_NUMERIC", "OPENING_CURLY", "CLOSING_CURLY", "HEX_LITERAL", "DECIMAL_LITERAL", 
		"OCTAL_LITERAL", "FLOATING_POINT_LITERAL", "COMMENT", "CHAR", "STRING", 
		"WHITESPACE", "OTHER"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Module.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		// Find the closing bracket to the opening bracket (and then return true), skip
		// everything that is in between
		public boolean skipToEndOfObject() {
			// Stack of curly brackets
			Stack<Object> CurlyStack = new Stack<Object>();
			// Object for the brackets
			Object o = new Object();
			// returns the value of the current symbol in the stream (which is the next
			// symbol to be consumed)
			int t = _input.LA(1);

			// Find the closing bracket to the opening bracket, skip everything that is in
			// between
			while (t != EOF && !(CurlyStack.empty() && t == CLOSING_CURLY)) {

				// If there is an #else inside a method or class
				if (t == PRE_ELSE || t == PRE_ELIF) {
					// Stack for collecting #ifs
					Stack<Object> ifdefStack = new Stack<Object>();
					// Return and parse #else, skip to next input
					consume();
					t = _input.LA(1);

					// Find the closing #endif to the opening #else, skip everything that is in
					// between (#else/#endif included)
					while (t != EOF && !(ifdefStack.empty() && (t == PRE_ENDIF))) {
						// Collect all found opening #ifs. If a #endif is found, remove one #if/#else
						// from stack
						if (t == PRE_IF)
							ifdefStack.push(o);
						else if (t == PRE_ENDIF)
							ifdefStack.pop();

						// Return and parse current t, skip to next input
						consume();
						t = _input.LA(1);
					}
				}

				// Collect all found opening brackets. If a closing bracket is found, remove one
				// opening bracket from stack
				if (t == OPENING_CURLY)
					CurlyStack.push(o);
				else if (t == CLOSING_CURLY)
					CurlyStack.pop();

				// Consume and return the current symbol, move cursor to next symbol, the
				// consumed symbol is added to the parse tree
				consume();
				t = _input.LA(1);
			}

			if (t != EOF) {
				// Return the closing bracket (if there is one)
				consume();
				//Check for newline and END_TEST
				if(_input.LA(1) == NEWLINE &&  _input.LA(2) == END_TEST){
				    //Parse both
				    consume();
				    consume();
				}
			}

			return true;
		}
	            
	       // this should go into FunctionGrammar but ANTLR fails
	       // to join the parser::members-section on inclusion
	       
	       //Find the closing #endif to the opening #if (and then return true), consume everything that is in between
	       public boolean preProcSkipToEnd()  {
	       		//Stack for collecting #ifs
	            Stack<Object> PreprocessorStack = new Stack<Object>();
	            //Object for the  #ifs
	            Object o = new Object();
	            //returns the value of the current symbol in the stream (which is the next symbol to be consumed)
	            int t = _input.LA(1);

					//Look for the closing #endif to the first opening #if
	                while(t != EOF && !(PreprocessorStack.empty() && t == PRE_ENDIF)){
	                        //Collect all found opening #ifs. If a #endif is found, remove one #if from stack                    
	                        if(t == PRE_IF)
	                            PreprocessorStack.push(o);
	                        else if(t == PRE_ENDIF)
	                            PreprocessorStack.pop();
	                            
	                        //Consume and return the current symbol, move cursor to next symbol, the consumed symbol is added to the parse tree 
	                        consume();
	                        t = _input.LA(1);
	                }
	                //Return and parse the closing #endif (if there is one)
	                if(t != EOF)
	 					consume();
	                return true;
	       }
	             
	       
	      //Find the end of a preprocessor macro
	     public boolean preProcFindMacroEnd()  {
	          //Stack for backslashes
	          Stack<Object> slashStack = new Stack<Object>();
	          //Object for the  slashes
	          Object o = new Object();
	          //returns the value of the current symbol in the stream (which is the next symbol to be consumed)
	          int t = _input.LA(1);

	            //Look for end of the macro where a newline appears without a previous backslash
	            while(t != EOF && !(slashStack.empty() && t == NEWLINE)){
	                
	                   //Count escape and newline characters                   
	                  if(t == ESCAPE){
	                        slashStack.push(o);
	                  } else if(t == NEWLINE) {
	                        slashStack.pop();
	                  } 
	                  
	                  //Consume and return the current symbol, the consumed symbol is added to the parse tree 
	                  consume();                   
	                  //Move cursor to next symbol
	                  t = _input.LA(1);
	             }                                             
	   	return true;
		}
		
		 //Find the end of a preprocessor macro
	     public boolean preProcFindConditionEnd()  {
	         int t = _input.LA(1);
	         //System.out.println("Scan: "+t); 
	         
	         //Look for end of the macro where a newline appears without a previous backslash
	         while(!(t == EOF || t == NEWLINE || t == COMMENT)){

	             
	             //Consume and return the current symbol, move cursor to next symbol, the consumed symbol is added to the parse tree 
	             consume();
	             t = _input.LA(1); 
	//             System.out.println("New t: "+t);                 
	         }   
	         
	         //The newline or the EOF belong to the PreIfStatement's code   
	         if(t == NEWLINE || t == EOF ){
	                //System.out.println("Newline found");
	                consume();
	          } 
	          
	          //The comment does not belong to the PreIfStatement's code 
	          if(t == COMMENT){
	                //System.out.println("Comment found");
	                //exitRule();
	               // createTerminalNode(parent,t);
	              // t = EOF;
	          }              
	         
	         //Look for / \n or begin of a comment
	         return true;
	     }
	     
	         //Find the end of a preprocessor macro
	     public boolean skipComments()  {
	         int t = _input.LA(1);
	         System.out.println("Scan: "+t);          
	          
	          //The comment does not belong to the PreIfStatement's code 
	          if(t == COMMENT){
	              //Look for newline or EOF          
	              for(int i = 1; !(t == NEWLINE || t == EOF); i++){
	                  t = _input.LA(1+i); 
	              }
	              consume();
	              System.out.println("Consumed");
	                //exitRule();
	               // createTerminalNode(parent,t);
	              // t = EOF;
	          }              
	         
	         //Look for / \n or begin of a comment
	         return true;
	     }


	public ModuleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CodeContext extends ParserRuleContext {
		public List<Function_defContext> function_def() {
			return getRuleContexts(Function_defContext.class);
		}
		public Function_defContext function_def(int i) {
			return getRuleContext(Function_defContext.class,i);
		}
		public List<Simple_declContext> simple_decl() {
			return getRuleContexts(Simple_declContext.class);
		}
		public Simple_declContext simple_decl(int i) {
			return getRuleContext(Simple_declContext.class,i);
		}
		public List<CustomContext> custom() {
			return getRuleContexts(CustomContext.class);
		}
		public CustomContext custom(int i) {
			return getRuleContext(CustomContext.class,i);
		}
		public List<Pre_statementContext> pre_statement() {
			return getRuleContexts(Pre_statementContext.class);
		}
		public Pre_statementContext pre_statement(int i) {
			return getRuleContext(Pre_statementContext.class,i);
		}
		public List<Using_directiveContext> using_directive() {
			return getRuleContexts(Using_directiveContext.class);
		}
		public Using_directiveContext using_directive(int i) {
			return getRuleContext(Using_directiveContext.class,i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<WaterContext> water() {
			return getRuleContexts(WaterContext.class);
		}
		public WaterContext water(int i) {
			return getRuleContext(WaterContext.class,i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCode(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (WHITESPACE - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				setState(267);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(260);
					function_def();
					}
					break;
				case 2:
					{
					setState(261);
					simple_decl();
					}
					break;
				case 3:
					{
					setState(262);
					custom();
					}
					break;
				case 4:
					{
					setState(263);
					pre_statement();
					}
					break;
				case 5:
					{
					setState(264);
					using_directive();
					}
					break;
				case 6:
					{
					setState(265);
					comment();
					}
					break;
				case 7:
					{
					setState(266);
					water();
					}
					break;
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Using_directiveContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(ModuleParser.USING, 0); }
		public TerminalNode NAMESPACE() { return getToken(ModuleParser.NAMESPACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Using_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterUsing_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitUsing_directive(this);
		}
	}

	public final Using_directiveContext using_directive() throws RecognitionException {
		Using_directiveContext _localctx = new Using_directiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_using_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(USING);
			setState(273);
			match(NAMESPACE);
			setState(274);
			identifier();
			setState(275);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_statementContext extends ParserRuleContext {
		public Pre_blockstarterContext pre_blockstarter() {
			return getRuleContext(Pre_blockstarterContext.class,0);
		}
		public Pre_commandContext pre_command() {
			return getRuleContext(Pre_commandContext.class,0);
		}
		public Pre_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_statement(this);
		}
	}

	public final Pre_statementContext pre_statement() throws RecognitionException {
		Pre_statementContext _localctx = new Pre_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pre_statement);
		try {
			setState(279);
			switch (_input.LA(1)) {
			case PRE_IF:
			case PRE_ELIF:
			case PRE_ELSE:
			case PRE_ENDIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				pre_blockstarter();
				}
				break;
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case STATIC:
			case VOID:
			case UNSIGNED:
			case SIGNED:
			case VIRTUAL:
			case OPERATOR:
			case CLASS_KEY:
			case NEW:
			case PRE_DEFINE:
			case PRE_UNDEF:
			case PRE_DIAGNOSTIC:
			case PRE_OTHER:
			case PRE_INCLUDE:
			case PRE_INCLUDE_NEXT:
			case PRE_LINE:
			case PRE_PRAGMA:
			case PRE_PRAGMA_KEYWORDS:
			case PRE_ATTRIBUTE:
			case END_TEST:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				pre_command();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_blockstarterContext extends ParserRuleContext {
		public Pre_if_statementContext pre_if_statement() {
			return getRuleContext(Pre_if_statementContext.class,0);
		}
		public Pre_elif_statementContext pre_elif_statement() {
			return getRuleContext(Pre_elif_statementContext.class,0);
		}
		public Pre_else_statementContext pre_else_statement() {
			return getRuleContext(Pre_else_statementContext.class,0);
		}
		public Pre_endif_statementContext pre_endif_statement() {
			return getRuleContext(Pre_endif_statementContext.class,0);
		}
		public Pre_blockstarterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_blockstarter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_blockstarter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_blockstarter(this);
		}
	}

	public final Pre_blockstarterContext pre_blockstarter() throws RecognitionException {
		Pre_blockstarterContext _localctx = new Pre_blockstarterContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pre_blockstarter);
		try {
			setState(285);
			switch (_input.LA(1)) {
			case PRE_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				pre_if_statement();
				}
				break;
			case PRE_ELIF:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				pre_elif_statement();
				}
				break;
			case PRE_ELSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				pre_else_statement();
				}
				break;
			case PRE_ENDIF:
				enterOuterAlt(_localctx, 4);
				{
				setState(284);
				pre_endif_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_if_statementContext extends ParserRuleContext {
		public TerminalNode PRE_IF() { return getToken(ModuleParser.PRE_IF, 0); }
		public Pre_if_conditionContext pre_if_condition() {
			return getRuleContext(Pre_if_conditionContext.class,0);
		}
		public Pre_if_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_if_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_if_statement(this);
		}
	}

	public final Pre_if_statementContext pre_if_statement() throws RecognitionException {
		Pre_if_statementContext _localctx = new Pre_if_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pre_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(PRE_IF);
			setState(288);
			pre_if_condition();
			 preProcFindConditionEnd(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_elif_statementContext extends ParserRuleContext {
		public TerminalNode PRE_ELIF() { return getToken(ModuleParser.PRE_ELIF, 0); }
		public Pre_if_conditionContext pre_if_condition() {
			return getRuleContext(Pre_if_conditionContext.class,0);
		}
		public Pre_elif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_elif_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_elif_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_elif_statement(this);
		}
	}

	public final Pre_elif_statementContext pre_elif_statement() throws RecognitionException {
		Pre_elif_statementContext _localctx = new Pre_elif_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pre_elif_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(PRE_ELIF);
			setState(292);
			pre_if_condition();
			 preProcFindConditionEnd(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_else_statementContext extends ParserRuleContext {
		public TerminalNode PRE_ELSE() { return getToken(ModuleParser.PRE_ELSE, 0); }
		public Pre_else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_else_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_else_statement(this);
		}
	}

	public final Pre_else_statementContext pre_else_statement() throws RecognitionException {
		Pre_else_statementContext _localctx = new Pre_else_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pre_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(PRE_ELSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_endif_statementContext extends ParserRuleContext {
		public TerminalNode PRE_ENDIF() { return getToken(ModuleParser.PRE_ENDIF, 0); }
		public Pre_endif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_endif_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_endif_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_endif_statement(this);
		}
	}

	public final Pre_endif_statementContext pre_endif_statement() throws RecognitionException {
		Pre_endif_statementContext _localctx = new Pre_endif_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pre_endif_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(PRE_ENDIF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_if_conditionContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public Pre_if_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_if_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_if_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_if_condition(this);
		}
	}

	public final Pre_if_conditionContext pre_if_condition() throws RecognitionException {
		Pre_if_conditionContext _localctx = new Pre_if_conditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pre_if_condition);
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				match(T__1);
				setState(301);
				condition();
				setState(302);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				keyword();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condition);
		int _la;
		try {
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				type_name();
				setState(309);
				declarator();
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(310);
					match(NEWLINE);
					}
					}
					setState(315);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(316);
				match(T__3);
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(317);
					match(NEWLINE);
					}
					}
					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(323);
				assign_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_commandContext extends ParserRuleContext {
		public Pre_defineContext pre_define() {
			return getRuleContext(Pre_defineContext.class,0);
		}
		public Pre_undefContext pre_undef() {
			return getRuleContext(Pre_undefContext.class,0);
		}
		public Pre_diagnosticContext pre_diagnostic() {
			return getRuleContext(Pre_diagnosticContext.class,0);
		}
		public Pre_otherContext pre_other() {
			return getRuleContext(Pre_otherContext.class,0);
		}
		public Pre_includeContext pre_include() {
			return getRuleContext(Pre_includeContext.class,0);
		}
		public Pre_include_nextContext pre_include_next() {
			return getRuleContext(Pre_include_nextContext.class,0);
		}
		public Pre_lineContext pre_line() {
			return getRuleContext(Pre_lineContext.class,0);
		}
		public Pre_pragmaContext pre_pragma() {
			return getRuleContext(Pre_pragmaContext.class,0);
		}
		public MacroCallContext macroCall() {
			return getRuleContext(MacroCallContext.class,0);
		}
		public Pre_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_command(this);
		}
	}

	public final Pre_commandContext pre_command() throws RecognitionException {
		Pre_commandContext _localctx = new Pre_commandContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pre_command);
		try {
			setState(336);
			switch (_input.LA(1)) {
			case PRE_DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				pre_define();
				}
				break;
			case PRE_UNDEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				pre_undef();
				}
				break;
			case PRE_DIAGNOSTIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				pre_diagnostic();
				}
				break;
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case PRE_OTHER:
			case PRE_ATTRIBUTE:
				enterOuterAlt(_localctx, 4);
				{
				setState(330);
				pre_other();
				}
				break;
			case PRE_INCLUDE:
				enterOuterAlt(_localctx, 5);
				{
				setState(331);
				pre_include();
				}
				break;
			case PRE_INCLUDE_NEXT:
				enterOuterAlt(_localctx, 6);
				{
				setState(332);
				pre_include_next();
				}
				break;
			case PRE_LINE:
				enterOuterAlt(_localctx, 7);
				{
				setState(333);
				pre_line();
				}
				break;
			case PRE_PRAGMA:
				enterOuterAlt(_localctx, 8);
				{
				setState(334);
				pre_pragma();
				}
				break;
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case STATIC:
			case VOID:
			case UNSIGNED:
			case SIGNED:
			case VIRTUAL:
			case OPERATOR:
			case CLASS_KEY:
			case NEW:
			case PRE_PRAGMA_KEYWORDS:
			case END_TEST:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 9);
				{
				setState(335);
				macroCall();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_defineContext extends ParserRuleContext {
		public TerminalNode PRE_DEFINE() { return getToken(ModuleParser.PRE_DEFINE, 0); }
		public Pre_macro_identifierContext pre_macro_identifier() {
			return getRuleContext(Pre_macro_identifierContext.class,0);
		}
		public Pre_macroContext pre_macro() {
			return getRuleContext(Pre_macroContext.class,0);
		}
		public Pre_defineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_define; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_define(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_define(this);
		}
	}

	public final Pre_defineContext pre_define() throws RecognitionException {
		Pre_defineContext _localctx = new Pre_defineContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_pre_define);
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				match(PRE_DEFINE);
				setState(339);
				pre_macro_identifier();
				setState(340);
				pre_macro();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				match(PRE_DEFINE);
				setState(343);
				pre_macro_identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_undefContext extends ParserRuleContext {
		public TerminalNode PRE_UNDEF() { return getToken(ModuleParser.PRE_UNDEF, 0); }
		public Pre_macro_identifierContext pre_macro_identifier() {
			return getRuleContext(Pre_macro_identifierContext.class,0);
		}
		public Pre_undefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_undef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_undef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_undef(this);
		}
	}

	public final Pre_undefContext pre_undef() throws RecognitionException {
		Pre_undefContext _localctx = new Pre_undefContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pre_undef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(PRE_UNDEF);
			setState(347);
			pre_macro_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_macro_identifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Pre_macro_parametersContext pre_macro_parameters() {
			return getRuleContext(Pre_macro_parametersContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode END_TEST() { return getToken(ModuleParser.END_TEST, 0); }
		public Pre_macro_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_macro_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_macro_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_macro_identifier(this);
		}
	}

	public final Pre_macro_identifierContext pre_macro_identifier() throws RecognitionException {
		Pre_macro_identifierContext _localctx = new Pre_macro_identifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pre_macro_identifier);
		try {
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				identifier();
				setState(354);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(350);
					match(T__1);
					setState(351);
					pre_macro_parameters();
					setState(352);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				keyword();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(357);
				match(END_TEST);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(358);
				match(T__4);
				setState(363);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(359);
					match(T__1);
					setState(360);
					pre_macro_parameters();
					setState(361);
					match(T__2);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitKeyword(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (STATIC - 80)) | (1L << (VOID - 80)) | (1L << (UNSIGNED - 80)) | (1L << (SIGNED - 80)) | (1L << (VIRTUAL - 80)) | (1L << (OPERATOR - 80)) | (1L << (CLASS_KEY - 80)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_macro_parametersContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> ELLIPSIS() { return getTokens(ModuleParser.ELLIPSIS); }
		public TerminalNode ELLIPSIS(int i) {
			return getToken(ModuleParser.ELLIPSIS, i);
		}
		public Pre_macro_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_macro_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_macro_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_macro_parameters(this);
		}
	}

	public final Pre_macro_parametersContext pre_macro_parameters() throws RecognitionException {
		Pre_macro_parametersContext _localctx = new Pre_macro_parametersContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_pre_macro_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case NEW:
			case PRE_PRAGMA_KEYWORDS:
			case ALPHA_NUMERIC:
				{
				setState(369);
				identifier();
				}
				break;
			case ELLIPSIS:
				{
				setState(370);
				match(ELLIPSIS);
				}
				break;
			case T__2:
			case T__12:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(373);
				match(T__12);
				setState(376);
				switch (_input.LA(1)) {
				case T__8:
				case T__9:
				case T__10:
				case NEW:
				case PRE_PRAGMA_KEYWORDS:
				case ALPHA_NUMERIC:
					{
					setState(374);
					identifier();
					}
					break;
				case ELLIPSIS:
					{
					setState(375);
					match(ELLIPSIS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_macroContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Pre_macroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_macro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_macro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_macro(this);
		}
	}

	public final Pre_macroContext pre_macro() throws RecognitionException {
		Pre_macroContext _localctx = new Pre_macroContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_pre_macro);
		try {
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				 preProcFindMacroEnd(); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MacroCallContext extends ParserRuleContext {
		public Pre_macro_identifierContext pre_macro_identifier() {
			return getRuleContext(Pre_macro_identifierContext.class,0);
		}
		public TerminalNode VOID() { return getToken(ModuleParser.VOID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Type_nameContext> type_name() {
			return getRuleContexts(Type_nameContext.class);
		}
		public Type_nameContext type_name(int i) {
			return getRuleContext(Type_nameContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public MacroCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterMacroCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitMacroCall(this);
		}
	}

	public final MacroCallContext macroCall() throws RecognitionException {
		MacroCallContext _localctx = new MacroCallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_macroCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			pre_macro_identifier();
			setState(388);
			match(T__1);
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				{
				setState(391);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(389);
					expr();
					}
					break;
				case 2:
					{
					setState(390);
					type_name();
					}
					break;
				}
				setState(394);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(393);
					match(NEWLINE);
					}
				}

				}
				setState(406);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(396);
						match(T__12);
						setState(398);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(397);
							match(NEWLINE);
							}
						}

						setState(402);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
						case 1:
							{
							setState(400);
							expr();
							}
							break;
						case 2:
							{
							setState(401);
							type_name();
							}
							break;
						}
						}
						} 
					}
					setState(408);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(410);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(409);
					match(T__12);
					}
				}

				}
				break;
			case 2:
				{
				setState(412);
				match(VOID);
				}
				break;
			}
			setState(415);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_diagnosticContext extends ParserRuleContext {
		public TerminalNode PRE_DIAGNOSTIC() { return getToken(ModuleParser.PRE_DIAGNOSTIC, 0); }
		public TerminalNode STRING() { return getToken(ModuleParser.STRING, 0); }
		public Pre_diagnosticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_diagnostic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_diagnostic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_diagnostic(this);
		}
	}

	public final Pre_diagnosticContext pre_diagnostic() throws RecognitionException {
		Pre_diagnosticContext _localctx = new Pre_diagnosticContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_pre_diagnostic);
		try {
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				match(PRE_DIAGNOSTIC);
				setState(418);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				match(PRE_DIAGNOSTIC);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_otherContext extends ParserRuleContext {
		public TerminalNode PRE_OTHER() { return getToken(ModuleParser.PRE_OTHER, 0); }
		public TerminalNode STRING() { return getToken(ModuleParser.STRING, 0); }
		public TerminalNode PRE_ATTRIBUTE() { return getToken(ModuleParser.PRE_ATTRIBUTE, 0); }
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public Pre_otherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_other; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_other(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_other(this);
		}
	}

	public final Pre_otherContext pre_other() throws RecognitionException {
		Pre_otherContext _localctx = new Pre_otherContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_pre_other);
		int _la;
		try {
			setState(443);
			switch (_input.LA(1)) {
			case PRE_OTHER:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				match(PRE_OTHER);
				setState(424);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(423);
					match(STRING);
					}
					break;
				}
				}
				break;
			case PRE_ATTRIBUTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				match(PRE_ATTRIBUTE);
				setState(427);
				match(T__1);
				setState(428);
				match(T__1);
				setState(430);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (STATIC - 80)) | (1L << (VOID - 80)) | (1L << (UNSIGNED - 80)) | (1L << (SIGNED - 80)) | (1L << (VIRTUAL - 80)) | (1L << (OPERATOR - 80)) | (1L << (CLASS_KEY - 80)) | (1L << (NEW - 80)) | (1L << (PRE_PRAGMA_KEYWORDS - 80)) | (1L << (END_TEST - 80)) | (1L << (ALPHA_NUMERIC - 80)) | (1L << (HEX_LITERAL - 80)) | (1L << (DECIMAL_LITERAL - 80)) | (1L << (OCTAL_LITERAL - 80)) | (1L << (FLOATING_POINT_LITERAL - 80)) | (1L << (CHAR - 80)) | (1L << (STRING - 80)))) != 0)) {
					{
					setState(429);
					attributeList();
					}
				}

				setState(432);
				match(T__2);
				setState(433);
				match(T__2);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(434);
				match(T__13);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(435);
				match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(436);
				match(T__15);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 6);
				{
				setState(437);
				match(T__16);
				setState(438);
				match(T__1);
				setState(440);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (STATIC - 80)) | (1L << (VOID - 80)) | (1L << (UNSIGNED - 80)) | (1L << (SIGNED - 80)) | (1L << (VIRTUAL - 80)) | (1L << (OPERATOR - 80)) | (1L << (CLASS_KEY - 80)) | (1L << (NEW - 80)) | (1L << (PRE_PRAGMA_KEYWORDS - 80)) | (1L << (END_TEST - 80)) | (1L << (ALPHA_NUMERIC - 80)) | (1L << (HEX_LITERAL - 80)) | (1L << (DECIMAL_LITERAL - 80)) | (1L << (OCTAL_LITERAL - 80)) | (1L << (FLOATING_POINT_LITERAL - 80)) | (1L << (CHAR - 80)) | (1L << (STRING - 80)))) != 0)) {
					{
					setState(439);
					attributeList();
					}
				}

				setState(442);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeListContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public AttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAttributeList(this);
		}
	}

	public final AttributeListContext attributeList() throws RecognitionException {
		AttributeListContext _localctx = new AttributeListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_attributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			attribute();
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(446);
				match(T__12);
				setState(447);
				attribute();
				}
				}
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public Pre_macro_identifierContext pre_macro_identifier() {
			return getRuleContext(Pre_macro_identifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_attribute);
		int _la;
		try {
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				pre_macro_identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				pre_macro_identifier();
				setState(455);
				match(T__1);
				setState(456);
				identifier();
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(457);
					match(T__12);
					setState(458);
					expr();
					}
					}
					setState(463);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(464);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(466);
				pre_macro_identifier();
				setState(467);
				match(T__1);
				setState(469);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__50) | (1L << T__51) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)))) != 0)) {
					{
					setState(468);
					expr();
					}
				}

				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(471);
					match(T__12);
					setState(472);
					expr();
					}
					}
					setState(477);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(478);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(480);
				constant();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_includeContext extends ParserRuleContext {
		public TerminalNode PRE_INCLUDE() { return getToken(ModuleParser.PRE_INCLUDE, 0); }
		public Pre_include_local_fileContext pre_include_local_file() {
			return getRuleContext(Pre_include_local_fileContext.class,0);
		}
		public Pre_macro_identifierContext pre_macro_identifier() {
			return getRuleContext(Pre_macro_identifierContext.class,0);
		}
		public Pre_includeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_include; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_include(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_include(this);
		}
	}

	public final Pre_includeContext pre_include() throws RecognitionException {
		Pre_includeContext _localctx = new Pre_includeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_pre_include);
		try {
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				match(PRE_INCLUDE);
				setState(484);
				pre_include_local_file();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				match(PRE_INCLUDE);
				setState(486);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(487);
				match(PRE_INCLUDE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_include_nextContext extends ParserRuleContext {
		public TerminalNode PRE_INCLUDE_NEXT() { return getToken(ModuleParser.PRE_INCLUDE_NEXT, 0); }
		public Pre_include_local_fileContext pre_include_local_file() {
			return getRuleContext(Pre_include_local_fileContext.class,0);
		}
		public Pre_macro_identifierContext pre_macro_identifier() {
			return getRuleContext(Pre_macro_identifierContext.class,0);
		}
		public Pre_include_nextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_include_next; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_include_next(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_include_next(this);
		}
	}

	public final Pre_include_nextContext pre_include_next() throws RecognitionException {
		Pre_include_nextContext _localctx = new Pre_include_nextContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_pre_include_next);
		try {
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				match(PRE_INCLUDE_NEXT);
				setState(491);
				pre_include_local_file();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				match(PRE_INCLUDE_NEXT);
				setState(493);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(494);
				match(PRE_INCLUDE_NEXT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_include_local_fileContext extends ParserRuleContext {
		public Pre_include_filenameContext pre_include_filename() {
			return getRuleContext(Pre_include_filenameContext.class,0);
		}
		public Pre_include_local_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_include_local_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_include_local_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_include_local_file(this);
		}
	}

	public final Pre_include_local_fileContext pre_include_local_file() throws RecognitionException {
		Pre_include_local_fileContext _localctx = new Pre_include_local_fileContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_pre_include_local_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			pre_include_filename();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_include_filenameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ModuleParser.STRING, 0); }
		public Pre_include_filenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_include_filename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_include_filename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_include_filename(this);
		}
	}

	public final Pre_include_filenameContext pre_include_filename() throws RecognitionException {
		Pre_include_filenameContext _localctx = new Pre_include_filenameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_pre_include_filename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_lineContext extends ParserRuleContext {
		public TerminalNode PRE_LINE() { return getToken(ModuleParser.PRE_LINE, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ModuleParser.DECIMAL_LITERAL, 0); }
		public TerminalNode STRING() { return getToken(ModuleParser.STRING, 0); }
		public Pre_macro_identifierContext pre_macro_identifier() {
			return getRuleContext(Pre_macro_identifierContext.class,0);
		}
		public Pre_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_line(this);
		}
	}

	public final Pre_lineContext pre_line() throws RecognitionException {
		Pre_lineContext _localctx = new Pre_lineContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_pre_line);
		try {
			setState(515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(501);
				match(PRE_LINE);
				setState(502);
				match(DECIMAL_LITERAL);
				setState(503);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
				match(PRE_LINE);
				setState(505);
				match(DECIMAL_LITERAL);
				setState(506);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(507);
				match(PRE_LINE);
				setState(508);
				pre_macro_identifier();
				setState(509);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(511);
				match(PRE_LINE);
				setState(512);
				pre_macro_identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(513);
				match(PRE_LINE);
				setState(514);
				match(DECIMAL_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_pragmaContext extends ParserRuleContext {
		public TerminalNode PRE_PRAGMA() { return getToken(ModuleParser.PRE_PRAGMA, 0); }
		public TerminalNode PRE_PRAGMA_KEYWORDS() { return getToken(ModuleParser.PRE_PRAGMA_KEYWORDS, 0); }
		public TerminalNode STRING() { return getToken(ModuleParser.STRING, 0); }
		public TerminalNode PRE_GCC() { return getToken(ModuleParser.PRE_GCC, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Pre_pragmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_pragma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_pragma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_pragma(this);
		}
	}

	public final Pre_pragmaContext pre_pragma() throws RecognitionException {
		Pre_pragmaContext _localctx = new Pre_pragmaContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_pre_pragma);
		int _la;
		try {
			int _alt;
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(517);
				match(PRE_PRAGMA);
				setState(519);
				_la = _input.LA(1);
				if (_la==PRE_GCC) {
					{
					setState(518);
					match(PRE_GCC);
					}
				}

				setState(521);
				match(PRE_PRAGMA_KEYWORDS);
				setState(522);
				match(STRING);
				 preProcFindMacroEnd(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				match(PRE_PRAGMA);
				setState(526);
				_la = _input.LA(1);
				if (_la==PRE_GCC) {
					{
					setState(525);
					match(PRE_GCC);
					}
				}

				setState(528);
				match(PRE_PRAGMA_KEYWORDS);
				setState(532);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(529);
						identifier();
						}
						} 
					}
					setState(534);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(535);
				match(PRE_PRAGMA);
				 preProcFindMacroEnd(); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(ModuleParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(COMMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewlineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(ModuleParser.NEWLINE, 0); }
		public NewlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNewline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNewline(this);
		}
	}

	public final NewlineContext newline() throws RecognitionException {
		NewlineContext _localctx = new NewlineContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_newline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operatorContext extends ParserRuleContext {
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitUnary_operator(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relational_operatorContext extends ParserRuleContext {
		public Relational_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterRelational_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitRelational_operator(this);
		}
	}

	public final Relational_operatorContext relational_operator() throws RecognitionException {
		Relational_operatorContext _localctx = new Relational_operatorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_relational_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode HEX_LITERAL() { return getToken(ModuleParser.HEX_LITERAL, 0); }
		public TerminalNode OCTAL_LITERAL() { return getToken(ModuleParser.OCTAL_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ModuleParser.DECIMAL_LITERAL, 0); }
		public List<TerminalNode> STRING() { return getTokens(ModuleParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ModuleParser.STRING, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(ModuleParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(ModuleParser.COMMENT, i);
		}
		public TerminalNode CHAR() { return getToken(ModuleParser.CHAR, 0); }
		public TerminalNode FLOATING_POINT_LITERAL() { return getToken(ModuleParser.FLOATING_POINT_LITERAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_constant);
		try {
			int _alt;
			setState(575);
			switch (_input.LA(1)) {
			case HEX_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(547);
				match(HEX_LITERAL);
				}
				break;
			case OCTAL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
				match(OCTAL_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(549);
				match(DECIMAL_LITERAL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(569); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(550);
						match(STRING);
						setState(554);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(551);
								match(NEWLINE);
								}
								} 
							}
							setState(556);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
						}
						setState(560);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(557);
								match(COMMENT);
								}
								} 
							}
							setState(562);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
						}
						setState(566);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(563);
								match(NEWLINE);
								}
								} 
							}
							setState(568);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(571); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(573);
				match(CHAR);
				}
				break;
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(574);
				match(FLOATING_POINT_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_decl_specifiersContext extends ParserRuleContext {
		public Function_decl_specifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_decl_specifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunction_decl_specifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunction_decl_specifiers(this);
		}
	}

	public final Function_decl_specifiersContext function_decl_specifiers() throws RecognitionException {
		Function_decl_specifiersContext _localctx = new Function_decl_specifiersContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_function_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==STATIC || _la==VIRTUAL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ptr_operatorContext extends ParserRuleContext {
		public Ptr_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptr_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPtr_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPtr_operator(this);
		}
	}

	public final Ptr_operatorContext ptr_operator() throws RecognitionException {
		Ptr_operatorContext _localctx = new Ptr_operatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ptr_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==T__18) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Access_specifierContext extends ParserRuleContext {
		public Access_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAccess_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAccess_specifier(this);
		}
	}

	public final Access_specifierContext access_specifier() throws RecognitionException {
		Access_specifierContext _localctx = new Access_specifierContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_access_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_operator);
		int _la;
		try {
			setState(628);
			switch (_input.LA(1)) {
			case T__27:
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(583);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==NEW) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(586);
				_la = _input.LA(1);
				if (_la==T__28) {
					{
					setState(584);
					match(T__28);
					setState(585);
					match(T__29);
					}
				}

				}
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(588);
				match(T__19);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(589);
				match(T__20);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(590);
				match(T__18);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 5);
				{
				setState(591);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 6);
				{
				setState(592);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 7);
				{
				setState(593);
				match(T__32);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 8);
				{
				setState(594);
				match(T__17);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 9);
				{
				setState(595);
				match(T__33);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 10);
				{
				setState(596);
				match(T__21);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 11);
				{
				setState(597);
				match(T__22);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 12);
				{
				setState(598);
				match(T__3);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 13);
				{
				setState(599);
				match(T__23);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 14);
				{
				setState(600);
				match(T__24);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 15);
				{
				setState(601);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 16);
				{
				setState(602);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 17);
				{
				setState(603);
				match(T__36);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 18);
				{
				setState(604);
				match(T__37);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 19);
				{
				setState(605);
				match(T__38);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 20);
				{
				setState(606);
				match(T__39);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 21);
				{
				setState(607);
				match(T__40);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 22);
				{
				setState(608);
				match(T__41);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 23);
				{
				setState(609);
				match(T__42);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 24);
				{
				setState(610);
				match(T__43);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 25);
				{
				setState(611);
				match(T__44);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 26);
				{
				setState(612);
				match(T__45);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 27);
				{
				setState(613);
				match(T__46);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 28);
				{
				setState(614);
				match(T__47);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 29);
				{
				setState(615);
				match(T__25);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 30);
				{
				setState(616);
				match(T__26);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 31);
				{
				setState(617);
				match(T__48);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 32);
				{
				setState(618);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 33);
				{
				setState(619);
				match(T__50);
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 34);
				{
				setState(620);
				match(T__51);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 35);
				{
				setState(621);
				match(T__12);
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 36);
				{
				setState(622);
				match(T__52);
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 37);
				{
				setState(623);
				match(T__53);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 38);
				{
				setState(624);
				match(T__1);
				setState(625);
				match(T__2);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 39);
				{
				setState(626);
				match(T__28);
				setState(627);
				match(T__29);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_operatorContext extends ParserRuleContext {
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAssignment_operator(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__45))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Equality_operatorContext extends ParserRuleContext {
		public Equality_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterEquality_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitEquality_operator(this);
		}
	}

	public final Equality_operatorContext equality_operator() throws RecognitionException {
		Equality_operatorContext _localctx = new Equality_operatorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_equality_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			_la = _input.LA(1);
			if ( !(_la==T__46 || _la==T__47) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Template_decl_startContext extends ParserRuleContext {
		public TerminalNode TEMPLATE() { return getToken(ModuleParser.TEMPLATE, 0); }
		public Template_param_listContext template_param_list() {
			return getRuleContext(Template_param_listContext.class,0);
		}
		public Template_decl_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_decl_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterTemplate_decl_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitTemplate_decl_start(this);
		}
	}

	public final Template_decl_startContext template_decl_start() throws RecognitionException {
		Template_decl_startContext _localctx = new Template_decl_startContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_template_decl_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			match(TEMPLATE);
			setState(635);
			match(T__23);
			setState(636);
			template_param_list();
			setState(637);
			match(T__24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Template_param_listContext extends ParserRuleContext {
		public List<No_angle_brackets_or_bracketsContext> no_angle_brackets_or_brackets() {
			return getRuleContexts(No_angle_brackets_or_bracketsContext.class);
		}
		public No_angle_brackets_or_bracketsContext no_angle_brackets_or_brackets(int i) {
			return getRuleContext(No_angle_brackets_or_bracketsContext.class,i);
		}
		public List<Template_param_listContext> template_param_list() {
			return getRuleContexts(Template_param_listContext.class);
		}
		public Template_param_listContext template_param_list(int i) {
			return getRuleContext(Template_param_listContext.class,i);
		}
		public Template_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterTemplate_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitTemplate_param_list(this);
		}
	}

	public final Template_param_listContext template_param_list() throws RecognitionException {
		Template_param_listContext _localctx = new Template_param_listContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_template_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(648);
				switch (_input.LA(1)) {
				case T__23:
					{
					{
					setState(639);
					match(T__23);
					setState(640);
					template_param_list();
					setState(641);
					match(T__24);
					}
					}
					break;
				case T__1:
					{
					{
					setState(643);
					match(T__1);
					setState(644);
					template_param_list();
					setState(645);
					match(T__2);
					}
					}
					break;
				case T__0:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__25:
				case T__26:
				case T__27:
				case T__28:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
				case T__34:
				case T__35:
				case T__36:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
				case T__41:
				case T__42:
				case T__43:
				case T__44:
				case T__45:
				case T__46:
				case T__47:
				case T__48:
				case T__49:
				case T__50:
				case T__51:
				case T__52:
				case T__53:
				case T__54:
				case T__55:
				case T__56:
				case T__57:
				case T__58:
				case T__59:
				case T__60:
				case T__61:
				case T__62:
				case T__63:
				case NEWLINE:
				case ESCAPE:
				case ELLIPSIS:
				case IF:
				case ELSE:
				case FOR:
				case WHILE:
				case BREAK:
				case CASE:
				case CONTINUE:
				case SWITCH:
				case DO:
				case GOTO:
				case RETURN:
				case TYPEDEF:
				case STATIC:
				case VOID:
				case UNSIGNED:
				case SIGNED:
				case CV_QUALIFIER:
				case EXTERN:
				case VIRTUAL:
				case TRY:
				case CATCH:
				case THROW:
				case USING:
				case NAMESPACE:
				case AUTO:
				case REGISTER:
				case SPECIAL_DATA:
				case OPERATOR:
				case TEMPLATE:
				case CLASS_KEY:
				case NEW:
				case PRE_IF:
				case PRE_ELIF:
				case PRE_ELSE:
				case PRE_ENDIF:
				case PRE_DEFINE:
				case PRE_UNDEF:
				case PRE_DIAGNOSTIC:
				case PRE_OTHER:
				case PRE_INCLUDE:
				case PRE_INCLUDE_NEXT:
				case PRE_LINE:
				case PRE_PRAGMA:
				case PRE_GCC:
				case PRE_PRAGMA_KEYWORDS:
				case PRE_STR:
				case PRE_ATTRIBUTE:
				case END_TEST:
				case ALPHA_NUMERIC:
				case OPENING_CURLY:
				case CLOSING_CURLY:
				case HEX_LITERAL:
				case DECIMAL_LITERAL:
				case OCTAL_LITERAL:
				case FLOATING_POINT_LITERAL:
				case COMMENT:
				case CHAR:
				case STRING:
				case WHITESPACE:
				case OTHER:
					{
					setState(647);
					no_angle_brackets_or_brackets();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(650); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (WHITESPACE - 64)) | (1L << (OTHER - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_bracketsContext extends ParserRuleContext {
		public No_bracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_brackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_brackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_brackets(this);
		}
	}

	public final No_bracketsContext no_brackets() throws RecognitionException {
		No_bracketsContext _localctx = new No_bracketsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_no_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__1 || _la==T__2) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_brackets_curlies_or_squaresContext extends ParserRuleContext {
		public No_brackets_curlies_or_squaresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_brackets_curlies_or_squares; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_brackets_curlies_or_squares(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_brackets_curlies_or_squares(this);
		}
	}

	public final No_brackets_curlies_or_squaresContext no_brackets_curlies_or_squares() throws RecognitionException {
		No_brackets_curlies_or_squaresContext _localctx = new No_brackets_curlies_or_squaresContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_no_brackets_curlies_or_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__28) | (1L << T__29))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_brackets_or_semicolonContext extends ParserRuleContext {
		public No_brackets_or_semicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_brackets_or_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_brackets_or_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_brackets_or_semicolon(this);
		}
	}

	public final No_brackets_or_semicolonContext no_brackets_or_semicolon() throws RecognitionException {
		No_brackets_or_semicolonContext _localctx = new No_brackets_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_no_brackets_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_angle_brackets_or_bracketsContext extends ParserRuleContext {
		public No_angle_brackets_or_bracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_angle_brackets_or_brackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_angle_brackets_or_brackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_angle_brackets_or_brackets(this);
		}
	}

	public final No_angle_brackets_or_bracketsContext no_angle_brackets_or_brackets() throws RecognitionException {
		No_angle_brackets_or_bracketsContext _localctx = new No_angle_brackets_or_bracketsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_no_angle_brackets_or_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__23) | (1L << T__24))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_curliesContext extends ParserRuleContext {
		public No_curliesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_curlies; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_curlies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_curlies(this);
		}
	}

	public final No_curliesContext no_curlies() throws RecognitionException {
		No_curliesContext _localctx = new No_curliesContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_no_curlies);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_squaresContext extends ParserRuleContext {
		public No_squaresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_squares; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_squares(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_squares(this);
		}
	}

	public final No_squaresContext no_squares() throws RecognitionException {
		No_squaresContext _localctx = new No_squaresContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_no_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__28 || _la==T__29) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_squares_or_semicolonContext extends ParserRuleContext {
		public No_squares_or_semicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_squares_or_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_squares_or_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_squares_or_semicolon(this);
		}
	}

	public final No_squares_or_semicolonContext no_squares_or_semicolon() throws RecognitionException {
		No_squares_or_semicolonContext _localctx = new No_squares_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_no_squares_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__28) | (1L << T__29))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_comma_or_semicolonContext extends ParserRuleContext {
		public No_comma_or_semicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_comma_or_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_comma_or_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_comma_or_semicolon(this);
		}
	}

	public final No_comma_or_semicolonContext no_comma_or_semicolon() throws RecognitionException {
		No_comma_or_semicolonContext _localctx = new No_comma_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_no_comma_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__0 || _la==T__12) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_waterContext extends ParserRuleContext {
		public Assign_waterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_water; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAssign_water(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAssign_water(this);
		}
	}

	public final Assign_waterContext assign_water() throws RecognitionException {
		Assign_waterContext _localctx = new Assign_waterContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_assign_water);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__12) | (1L << T__28) | (1L << T__29))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_water_l2Context extends ParserRuleContext {
		public Assign_water_l2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_water_l2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAssign_water_l2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAssign_water_l2(this);
		}
	}

	public final Assign_water_l2Context assign_water_l2() throws RecognitionException {
		Assign_water_l2Context _localctx = new Assign_water_l2Context(_ctx, getState());
		enterRule(_localctx, 100, RULE_assign_water_l2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__28) | (1L << T__29))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WaterContext extends ParserRuleContext {
		public WaterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_water; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterWater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitWater(this);
		}
	}

	public final WaterContext water() throws RecognitionException {
		WaterContext _localctx = new WaterContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_water);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			matchWildcard();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CustomContext extends ParserRuleContext {
		public AsciiTabContext asciiTab() {
			return getRuleContext(AsciiTabContext.class,0);
		}
		public ExternCContext externC() {
			return getRuleContext(ExternCContext.class,0);
		}
		public MacroFunctionPointerContext macroFunctionPointer() {
			return getRuleContext(MacroFunctionPointerContext.class,0);
		}
		public TestEndContext testEnd() {
			return getRuleContext(TestEndContext.class,0);
		}
		public CustomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_custom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCustom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCustom(this);
		}
	}

	public final CustomContext custom() throws RecognitionException {
		CustomContext _localctx = new CustomContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_custom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(674);
				asciiTab();
				}
				break;
			case 2:
				{
				setState(675);
				externC();
				}
				break;
			case 3:
				{
				setState(676);
				macroFunctionPointer();
				}
				break;
			case 4:
				{
				setState(677);
				testEnd();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsciiTabContext extends ParserRuleContext {
		public List<Pre_macro_identifierContext> pre_macro_identifier() {
			return getRuleContexts(Pre_macro_identifierContext.class);
		}
		public Pre_macro_identifierContext pre_macro_identifier(int i) {
			return getRuleContext(Pre_macro_identifierContext.class,i);
		}
		public AsciiTabContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asciiTab; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAsciiTab(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAsciiTab(this);
		}
	}

	public final AsciiTabContext asciiTab() throws RecognitionException {
		AsciiTabContext _localctx = new AsciiTabContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_asciiTab);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(683); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(680);
					pre_macro_identifier();
					setState(681);
					match(T__12);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(685); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExternCContext extends ParserRuleContext {
		public TerminalNode OPENING_CURLY() { return getToken(ModuleParser.OPENING_CURLY, 0); }
		public ExternCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterExternC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitExternC(this);
		}
	}

	public final ExternCContext externC() throws RecognitionException {
		ExternCContext _localctx = new ExternCContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_externC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			match(EXTERN);
			setState(688);
			match(T__54);
			setState(690);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(689);
				match(OPENING_CURLY);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MacroFunctionPointerContext extends ParserRuleContext {
		public List<MacroCallContext> macroCall() {
			return getRuleContexts(MacroCallContext.class);
		}
		public MacroCallContext macroCall(int i) {
			return getRuleContext(MacroCallContext.class,i);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Pre_macro_identifierContext pre_macro_identifier() {
			return getRuleContext(Pre_macro_identifierContext.class,0);
		}
		public MacroFunctionPointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroFunctionPointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterMacroFunctionPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitMacroFunctionPointer(this);
		}
	}

	public final MacroFunctionPointerContext macroFunctionPointer() throws RecognitionException {
		MacroFunctionPointerContext _localctx = new MacroFunctionPointerContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_macroFunctionPointer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			macroCall();
			setState(694);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(693);
				match(NEWLINE);
				}
				break;
			}
			setState(697);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(696);
				pre_macro_identifier();
				}
				break;
			}
			setState(700);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(699);
				match(NEWLINE);
				}
			}

			setState(702);
			macroCall();
			setState(704);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(703);
				match(NEWLINE);
				}
			}

			setState(706);
			init_declarator_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TestStartContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TestStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterTestStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitTestStart(this);
		}
	}

	public final TestStartContext testStart() throws RecognitionException {
		TestStartContext _localctx = new TestStartContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_testStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			match(T__4);
			setState(709);
			match(T__1);
			setState(710);
			function_name();
			setState(711);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TestEndContext extends ParserRuleContext {
		public TerminalNode END_TEST() { return getToken(ModuleParser.END_TEST, 0); }
		public TestEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterTestEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitTestEnd(this);
		}
	}

	public final TestEndContext testEnd() throws RecognitionException {
		TestEndContext _localctx = new TestEndContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_testEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			match(END_TEST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_defContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Function_param_listContext function_param_list() {
			return getRuleContext(Function_param_listContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Template_decl_startContext template_decl_start() {
			return getRuleContext(Template_decl_startContext.class,0);
		}
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public Pre_otherContext pre_other() {
			return getRuleContext(Pre_otherContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Ctor_listContext ctor_list() {
			return getRuleContext(Ctor_listContext.class,0);
		}
		public Function_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunction_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunction_def(this);
		}
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_function_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			_la = _input.LA(1);
			if (_la==TEMPLATE) {
				{
				setState(715);
				template_decl_start();
				}
			}

			setState(719);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(718);
				return_type();
				}
				break;
			}
			setState(725);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0) || _la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
				{
				setState(721);
				pre_other();
				setState(723);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(722);
					match(NEWLINE);
					}
				}

				}
			}

			setState(727);
			function_name();
			setState(729);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(728);
				match(NEWLINE);
				}
			}

			setState(731);
			function_param_list();
			setState(733);
			_la = _input.LA(1);
			if (_la==T__55) {
				{
				setState(732);
				ctor_list();
				}
			}

			setState(736);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(735);
				match(NEWLINE);
				}
			}

			setState(738);
			compound_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_typeContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Ptr_operatorContext> ptr_operator() {
			return getRuleContexts(Ptr_operatorContext.class);
		}
		public Ptr_operatorContext ptr_operator(int i) {
			return getRuleContext(Ptr_operatorContext.class,i);
		}
		public List<Function_decl_specifiersContext> function_decl_specifiers() {
			return getRuleContexts(Function_decl_specifiersContext.class);
		}
		public Function_decl_specifiersContext function_decl_specifiers(int i) {
			return getRuleContext(Function_decl_specifiersContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public MacroCallContext macroCall() {
			return getRuleContext(MacroCallContext.class,0);
		}
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitReturn_type(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_return_type);
		int _la;
		try {
			int _alt;
			setState(764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(746);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(740);
						function_decl_specifiers();
						setState(742);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(741);
							match(NEWLINE);
							}
						}

						}
						} 
					}
					setState(748);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				setState(749);
				type_name();
				}
				setState(757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17 || _la==T__18) {
					{
					{
					setState(751);
					ptr_operator();
					setState(753);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(752);
						match(NEWLINE);
						}
					}

					}
					}
					setState(759);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(760);
				macroCall();
				setState(762);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(761);
					match(NEWLINE);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_param_listContext extends ParserRuleContext {
		public Parameter_decl_clauseContext parameter_decl_clause() {
			return getRuleContext(Parameter_decl_clauseContext.class,0);
		}
		public List<TerminalNode> CV_QUALIFIER() { return getTokens(ModuleParser.CV_QUALIFIER); }
		public TerminalNode CV_QUALIFIER(int i) {
			return getToken(ModuleParser.CV_QUALIFIER, i);
		}
		public Exception_specificationContext exception_specification() {
			return getRuleContext(Exception_specificationContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Function_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunction_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunction_param_list(this);
		}
	}

	public final Function_param_listContext function_param_list() throws RecognitionException {
		Function_param_listContext _localctx = new Function_param_listContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_function_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			match(T__1);
			setState(768);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (STATIC - 80)) | (1L << (VOID - 80)) | (1L << (UNSIGNED - 80)) | (1L << (SIGNED - 80)) | (1L << (CV_QUALIFIER - 80)) | (1L << (EXTERN - 80)) | (1L << (VIRTUAL - 80)) | (1L << (AUTO - 80)) | (1L << (REGISTER - 80)) | (1L << (SPECIAL_DATA - 80)) | (1L << (OPERATOR - 80)) | (1L << (CLASS_KEY - 80)) | (1L << (NEW - 80)) | (1L << (PRE_PRAGMA_KEYWORDS - 80)) | (1L << (END_TEST - 80)) | (1L << (ALPHA_NUMERIC - 80)))) != 0)) {
				{
				setState(767);
				parameter_decl_clause();
				}
			}

			setState(770);
			match(T__2);
			setState(772);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(771);
				match(T__18);
				}
			}

			setState(780);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CV_QUALIFIER) {
				{
				{
				setState(774);
				match(CV_QUALIFIER);
				setState(776);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(775);
					match(NEWLINE);
					}
					break;
				}
				}
				}
				setState(782);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(784);
			_la = _input.LA(1);
			if (_la==THROW) {
				{
				setState(783);
				exception_specification();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_decl_clauseContext extends ParserRuleContext {
		public List<Parameter_declContext> parameter_decl() {
			return getRuleContexts(Parameter_declContext.class);
		}
		public Parameter_declContext parameter_decl(int i) {
			return getRuleContext(Parameter_declContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Parameter_decl_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_decl_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParameter_decl_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParameter_decl_clause(this);
		}
	}

	public final Parameter_decl_clauseContext parameter_decl_clause() throws RecognitionException {
		Parameter_decl_clauseContext _localctx = new Parameter_decl_clauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_parameter_decl_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(786);
			parameter_decl();
			setState(794);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(787);
					match(T__12);
					setState(789);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(788);
						match(NEWLINE);
						}
					}

					setState(791);
					parameter_decl();
					}
					} 
				}
				setState(796);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			}
			setState(802);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(797);
				match(T__12);
				setState(799);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(798);
					match(NEWLINE);
					}
				}

				setState(801);
				match(ELLIPSIS);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_declContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(ModuleParser.VOID, 0); }
		public Param_decl_specifiersContext param_decl_specifiers() {
			return getRuleContext(Param_decl_specifiersContext.class,0);
		}
		public Parameter_idContext parameter_id() {
			return getRuleContext(Parameter_idContext.class,0);
		}
		public Parameter_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParameter_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParameter_decl(this);
		}
	}

	public final Parameter_declContext parameter_decl() throws RecognitionException {
		Parameter_declContext _localctx = new Parameter_declContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_parameter_decl);
		try {
			setState(808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(804);
				match(VOID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(805);
				param_decl_specifiers();
				setState(806);
				parameter_id();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_idContext extends ParserRuleContext {
		public Parameter_idContext parameter_id() {
			return getRuleContext(Parameter_idContext.class,0);
		}
		public Parameter_nameContext parameter_name() {
			return getRuleContext(Parameter_nameContext.class,0);
		}
		public PtrsContext ptrs() {
			return getRuleContext(PtrsContext.class,0);
		}
		public Type_suffixContext type_suffix() {
			return getRuleContext(Type_suffixContext.class,0);
		}
		public Parameter_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParameter_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParameter_id(this);
		}
	}

	public final Parameter_idContext parameter_id() throws RecognitionException {
		Parameter_idContext _localctx = new Parameter_idContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_parameter_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			_la = _input.LA(1);
			if (_la==T__17 || _la==T__18) {
				{
				setState(810);
				ptrs();
				}
			}

			setState(818);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(813);
				match(T__1);
				setState(814);
				parameter_id();
				setState(815);
				match(T__2);
				}
				break;
			case T__8:
			case T__9:
			case T__10:
			case NEW:
			case PRE_PRAGMA_KEYWORDS:
			case ALPHA_NUMERIC:
				{
				setState(817);
				parameter_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(821);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__28) {
				{
				setState(820);
				type_suffix();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_statementContext extends ParserRuleContext {
		public TerminalNode OPENING_CURLY() { return getToken(ModuleParser.OPENING_CURLY, 0); }
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCompound_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCompound_statement(this);
		}
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_compound_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			match(OPENING_CURLY);
			 skipToEndOfObject(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ctor_listContext extends ParserRuleContext {
		public List<Ctor_initializerContext> ctor_initializer() {
			return getRuleContexts(Ctor_initializerContext.class);
		}
		public Ctor_initializerContext ctor_initializer(int i) {
			return getRuleContext(Ctor_initializerContext.class,i);
		}
		public Ctor_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctor_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCtor_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCtor_list(this);
		}
	}

	public final Ctor_listContext ctor_list() throws RecognitionException {
		Ctor_listContext _localctx = new Ctor_listContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_ctor_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			match(T__55);
			setState(827);
			ctor_initializer();
			setState(832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(828);
				match(T__12);
				setState(829);
				ctor_initializer();
				}
				}
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ctor_initializerContext extends ParserRuleContext {
		public Initializer_idContext initializer_id() {
			return getRuleContext(Initializer_idContext.class,0);
		}
		public Ctor_exprContext ctor_expr() {
			return getRuleContext(Ctor_exprContext.class,0);
		}
		public Ctor_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctor_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCtor_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCtor_initializer(this);
		}
	}

	public final Ctor_initializerContext ctor_initializer() throws RecognitionException {
		Ctor_initializerContext _localctx = new Ctor_initializerContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_ctor_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			initializer_id();
			setState(836);
			ctor_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initializer_idContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Initializer_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInitializer_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInitializer_id(this);
		}
	}

	public final Initializer_idContext initializer_id() throws RecognitionException {
		Initializer_idContext _localctx = new Initializer_idContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_initializer_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			_la = _input.LA(1);
			if (_la==T__56) {
				{
				setState(838);
				match(T__56);
				}
			}

			setState(841);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ctor_exprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Ctor_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctor_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCtor_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCtor_expr(this);
		}
	}

	public final Ctor_exprContext ctor_expr() throws RecognitionException {
		Ctor_exprContext _localctx = new Ctor_exprContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_ctor_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			match(T__1);
			setState(845);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__50) | (1L << T__51) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)))) != 0)) {
				{
				setState(844);
				expr();
				}
			}

			setState(847);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPERATOR() { return getToken(ModuleParser.OPERATOR, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunction_name(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_function_name);
		try {
			setState(856);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(849);
				match(T__1);
				setState(850);
				function_name();
				setState(851);
				match(T__2);
				}
				break;
			case T__8:
			case T__9:
			case T__10:
			case NEW:
			case PRE_PRAGMA_KEYWORDS:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(853);
				identifier();
				}
				break;
			case OPERATOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(854);
				match(OPERATOR);
				setState(855);
				operator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exception_specificationContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(ModuleParser.THROW, 0); }
		public Type_id_listContext type_id_list() {
			return getRuleContext(Type_id_listContext.class,0);
		}
		public Exception_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterException_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitException_specification(this);
		}
	}

	public final Exception_specificationContext exception_specification() throws RecognitionException {
		Exception_specificationContext _localctx = new Exception_specificationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_exception_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			match(THROW);
			setState(859);
			match(T__1);
			setState(860);
			type_id_list();
			setState(861);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_id_listContext extends ParserRuleContext {
		public List<No_bracketsContext> no_brackets() {
			return getRuleContexts(No_bracketsContext.class);
		}
		public No_bracketsContext no_brackets(int i) {
			return getRuleContext(No_bracketsContext.class,i);
		}
		public List<Type_id_listContext> type_id_list() {
			return getRuleContexts(Type_id_listContext.class);
		}
		public Type_id_listContext type_id_list(int i) {
			return getRuleContext(Type_id_listContext.class,i);
		}
		public Type_id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterType_id_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitType_id_list(this);
		}
	}

	public final Type_id_listContext type_id_list() throws RecognitionException {
		Type_id_listContext _localctx = new Type_id_listContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_type_id_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (WHITESPACE - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(863);
				no_brackets();
				}
				}
				setState(868);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(869);
				match(T__1);
				setState(870);
				type_id_list();
				setState(871);
				match(T__2);
				setState(875);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (WHITESPACE - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(872);
					no_brackets();
					}
					}
					setState(877);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(882);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_declContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Simple_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterSimple_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitSimple_decl(this);
		}
	}

	public final Simple_declContext simple_decl() throws RecognitionException {
		Simple_declContext _localctx = new Simple_declContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_simple_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			var_decl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
	 
		public Var_declContext() { }
		public void copyFrom(Var_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclByClassContext extends Var_declContext {
		public Class_defContext class_def() {
			return getRuleContext(Class_defContext.class,0);
		}
		public Template_decl_startContext template_decl_start() {
			return getRuleContext(Template_decl_startContext.class,0);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public DeclByClassContext(Var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterDeclByClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitDeclByClass(this);
		}
	}
	public static class DeclByTypeContext extends Var_declContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public TerminalNode TYPEDEF() { return getToken(ModuleParser.TYPEDEF, 0); }
		public Template_decl_startContext template_decl_start() {
			return getRuleContext(Template_decl_startContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ModuleParser.NEWLINE, 0); }
		public DeclByTypeContext(Var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterDeclByType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitDeclByType(this);
		}
	}
	public static class FunctionPointerDeclareContext extends Var_declContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Ptr_operatorContext ptr_operator() {
			return getRuleContext(Ptr_operatorContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Param_type_listContext param_type_list() {
			return getRuleContext(Param_type_listContext.class,0);
		}
		public TerminalNode TYPEDEF() { return getToken(ModuleParser.TYPEDEF, 0); }
		public CallingConventionContext callingConvention() {
			return getRuleContext(CallingConventionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Pre_otherContext pre_other() {
			return getRuleContext(Pre_otherContext.class,0);
		}
		public FunctionPointerDeclareContext(Var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunctionPointerDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunctionPointerDeclare(this);
		}
	}
	public static class StructUnionEnumContext extends Var_declContext {
		public Special_datatypeContext special_datatype() {
			return getRuleContext(Special_datatypeContext.class,0);
		}
		public TerminalNode CV_QUALIFIER() { return getToken(ModuleParser.CV_QUALIFIER, 0); }
		public Function_decl_specifiersContext function_decl_specifiers() {
			return getRuleContext(Function_decl_specifiersContext.class,0);
		}
		public TerminalNode TYPEDEF() { return getToken(ModuleParser.TYPEDEF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public StructUnionEnumContext(Var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterStructUnionEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitStructUnionEnum(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_var_decl);
		int _la;
		try {
			setState(955);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				_localctx = new DeclByClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(886);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(885);
					template_decl_start();
					}
				}

				setState(888);
				class_def();
				setState(890);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(889);
					init_declarator_list();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new DeclByTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(896);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(892);
					match(TYPEDEF);
					setState(894);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(893);
						match(NEWLINE);
						}
					}

					}
				}

				setState(899);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(898);
					template_decl_start();
					}
				}

				setState(901);
				type_name();
				setState(902);
				init_declarator_list();
				}
				break;
			case 3:
				_localctx = new FunctionPointerDeclareContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(908);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(904);
					match(TYPEDEF);
					setState(906);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(905);
						match(NEWLINE);
						}
					}

					}
				}

				setState(910);
				type_name();
				setState(911);
				match(T__1);
				setState(913);
				_la = _input.LA(1);
				if (_la==ALPHA_NUMERIC) {
					{
					setState(912);
					callingConvention();
					}
				}

				setState(915);
				ptr_operator();
				setState(916);
				identifier();
				setState(917);
				match(T__2);
				setState(918);
				param_type_list();
				setState(920);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(919);
					match(NEWLINE);
					}
				}

				setState(923);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0) || _la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(922);
					pre_other();
					}
				}

				setState(925);
				match(T__0);
				}
				break;
			case 4:
				_localctx = new StructUnionEnumContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(931);
				_la = _input.LA(1);
				if (_la==CV_QUALIFIER) {
					{
					setState(927);
					match(CV_QUALIFIER);
					setState(929);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(928);
						match(NEWLINE);
						}
					}

					}
				}

				setState(937);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==STATIC || _la==VIRTUAL) {
					{
					setState(933);
					function_decl_specifiers();
					setState(935);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(934);
						match(NEWLINE);
						}
					}

					}
				}

				setState(943);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(939);
					match(TYPEDEF);
					setState(941);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(940);
						match(NEWLINE);
						}
					}

					}
				}

				setState(945);
				special_datatype();
				setState(947);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(946);
					match(NEWLINE);
					}
					break;
				}
				setState(950);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(949);
					init_declarator_list();
					}
					break;
				}
				setState(953);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(952);
					match(T__0);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallingConventionContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(ModuleParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(ModuleParser.ALPHA_NUMERIC, i);
		}
		public CallingConventionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callingConvention; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCallingConvention(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCallingConvention(this);
		}
	}

	public final CallingConventionContext callingConvention() throws RecognitionException {
		CallingConventionContext _localctx = new CallingConventionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_callingConvention);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(957);
				match(ALPHA_NUMERIC);
				}
				}
				setState(960); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ALPHA_NUMERIC );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Special_datatypeContext extends ParserRuleContext {
		public TerminalNode SPECIAL_DATA() { return getToken(ModuleParser.SPECIAL_DATA, 0); }
		public TerminalNode OPENING_CURLY() { return getToken(ModuleParser.OPENING_CURLY, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public List<Pre_otherContext> pre_other() {
			return getRuleContexts(Pre_otherContext.class);
		}
		public Pre_otherContext pre_other(int i) {
			return getRuleContext(Pre_otherContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<PtrsContext> ptrs() {
			return getRuleContexts(PtrsContext.class);
		}
		public PtrsContext ptrs(int i) {
			return getRuleContext(PtrsContext.class,i);
		}
		public Special_datatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterSpecial_datatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitSpecial_datatype(this);
		}
	}

	public final Special_datatypeContext special_datatype() throws RecognitionException {
		Special_datatypeContext _localctx = new Special_datatypeContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_special_datatype);
		int _la;
		try {
			setState(1009);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(962);
				match(SPECIAL_DATA);
				setState(964);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(963);
					match(NEWLINE);
					}
				}

				setState(967);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(966);
					pre_other();
					}
					break;
				}
				setState(973);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (NEW - 98)) | (1L << (PRE_PRAGMA_KEYWORDS - 98)) | (1L << (ALPHA_NUMERIC - 98)))) != 0)) {
					{
					setState(969);
					identifier();
					setState(971);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(970);
						match(NEWLINE);
						}
					}

					}
				}

				setState(976);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0) || _la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(975);
					pre_other();
					}
				}

				setState(978);
				match(OPENING_CURLY);
				skipToEndOfObject(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(980);
				match(SPECIAL_DATA);
				setState(982);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(981);
					match(NEWLINE);
					}
				}

				setState(985);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0) || _la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(984);
					pre_other();
					}
				}

				setState(987);
				identifier();
				setState(989);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(988);
					match(NEWLINE);
					}
				}

				setState(992);
				_la = _input.LA(1);
				if (_la==T__17 || _la==T__18) {
					{
					setState(991);
					ptrs();
					}
				}

				setState(994);
				identifier();
				setState(996);
				_la = _input.LA(1);
				if (_la==T__17 || _la==T__18) {
					{
					setState(995);
					ptrs();
					}
				}

				setState(998);
				match(T__3);
				skipToEndOfObject(); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1001);
				match(SPECIAL_DATA);
				setState(1003);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1002);
					match(NEWLINE);
					}
				}

				setState(1006);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0) || _la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(1005);
					pre_other();
					}
				}

				setState(1008);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Init_declarator_listContext extends ParserRuleContext {
		public List<Init_declaratorContext> init_declarator() {
			return getRuleContexts(Init_declaratorContext.class);
		}
		public Init_declaratorContext init_declarator(int i) {
			return getRuleContext(Init_declaratorContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Pre_otherContext pre_other() {
			return getRuleContext(Pre_otherContext.class,0);
		}
		public Init_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInit_declarator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInit_declarator_list(this);
		}
	}

	public final Init_declarator_listContext init_declarator_list() throws RecognitionException {
		Init_declarator_listContext _localctx = new Init_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_init_declarator_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			init_declarator();
			setState(1022);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1013);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1012);
						match(NEWLINE);
						}
					}

					setState(1015);
					match(T__12);
					setState(1017);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1016);
						match(NEWLINE);
						}
					}

					setState(1019);
					init_declarator();
					}
					} 
				}
				setState(1024);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			}
			setState(1026);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1025);
				match(NEWLINE);
				}
			}

			setState(1029);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0) || _la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
				{
				setState(1028);
				pre_other();
				}
			}

			setState(1031);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_defContext extends ParserRuleContext {
		public TerminalNode CLASS_KEY() { return getToken(ModuleParser.CLASS_KEY, 0); }
		public TerminalNode OPENING_CURLY() { return getToken(ModuleParser.OPENING_CURLY, 0); }
		public TerminalNode NEWLINE() { return getToken(ModuleParser.NEWLINE, 0); }
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Base_classesContext base_classes() {
			return getRuleContext(Base_classesContext.class,0);
		}
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterClass_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitClass_def(this);
		}
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			match(CLASS_KEY);
			setState(1035);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1034);
				match(NEWLINE);
				}
			}

			setState(1038);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (NEW - 98)) | (1L << (PRE_PRAGMA_KEYWORDS - 98)) | (1L << (ALPHA_NUMERIC - 98)))) != 0)) {
				{
				setState(1037);
				class_name();
				}
			}

			setState(1041);
			_la = _input.LA(1);
			if (_la==T__55) {
				{
				setState(1040);
				base_classes();
				}
			}

			setState(1043);
			match(OPENING_CURLY);
			skipToEndOfObject(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Class_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterClass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitClass_name(this);
		}
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Base_classesContext extends ParserRuleContext {
		public List<Base_classContext> base_class() {
			return getRuleContexts(Base_classContext.class);
		}
		public Base_classContext base_class(int i) {
			return getRuleContext(Base_classContext.class,i);
		}
		public Base_classesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_classes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterBase_classes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitBase_classes(this);
		}
	}

	public final Base_classesContext base_classes() throws RecognitionException {
		Base_classesContext _localctx = new Base_classesContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_base_classes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			match(T__55);
			setState(1049);
			base_class();
			setState(1054);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(1050);
				match(T__12);
				setState(1051);
				base_class();
				}
				}
				setState(1056);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Base_classContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode VIRTUAL() { return getToken(ModuleParser.VIRTUAL, 0); }
		public Access_specifierContext access_specifier() {
			return getRuleContext(Access_specifierContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ModuleParser.NEWLINE, 0); }
		public Base_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterBase_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitBase_class(this);
		}
	}

	public final Base_classContext base_class() throws RecognitionException {
		Base_classContext _localctx = new Base_classContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_base_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
			_la = _input.LA(1);
			if (_la==VIRTUAL) {
				{
				setState(1057);
				match(VIRTUAL);
				setState(1059);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1058);
					match(NEWLINE);
					}
				}

				}
			}

			setState(1064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(1063);
				access_specifier();
				}
				break;
			}
			setState(1066);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_nameContext extends ParserRuleContext {
		public TerminalNode EXTERN() { return getToken(ModuleParser.EXTERN, 0); }
		public List<Function_decl_specifiersContext> function_decl_specifiers() {
			return getRuleContexts(Function_decl_specifiersContext.class);
		}
		public Function_decl_specifiersContext function_decl_specifiers(int i) {
			return getRuleContext(Function_decl_specifiersContext.class,i);
		}
		public List<TerminalNode> CV_QUALIFIER() { return getTokens(ModuleParser.CV_QUALIFIER); }
		public TerminalNode CV_QUALIFIER(int i) {
			return getToken(ModuleParser.CV_QUALIFIER, i);
		}
		public List<TerminalNode> UNSIGNED() { return getTokens(ModuleParser.UNSIGNED); }
		public TerminalNode UNSIGNED(int i) {
			return getToken(ModuleParser.UNSIGNED, i);
		}
		public List<TerminalNode> SIGNED() { return getTokens(ModuleParser.SIGNED); }
		public TerminalNode SIGNED(int i) {
			return getToken(ModuleParser.SIGNED, i);
		}
		public List<Ptr_operatorContext> ptr_operator() {
			return getRuleContexts(Ptr_operatorContext.class);
		}
		public Ptr_operatorContext ptr_operator(int i) {
			return getRuleContext(Ptr_operatorContext.class,i);
		}
		public List<Base_typeContext> base_type() {
			return getRuleContexts(Base_typeContext.class);
		}
		public Base_typeContext base_type(int i) {
			return getRuleContext(Base_typeContext.class,i);
		}
		public List<Template_param_listContext> template_param_list() {
			return getRuleContexts(Template_param_listContext.class);
		}
		public Template_param_listContext template_param_list(int i) {
			return getRuleContext(Template_param_listContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public MacroCallContext macroCall() {
			return getRuleContext(MacroCallContext.class,0);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitType_name(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_type_name);
		int _la;
		try {
			int _alt;
			setState(1132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1072);
				_la = _input.LA(1);
				if (_la==EXTERN) {
					{
					setState(1068);
					match(EXTERN);
					setState(1070);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1069);
						match(NEWLINE);
						}
					}

					}
				}

				setState(1089); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(1089);
						switch (_input.LA(1)) {
						case T__5:
						case T__6:
						case T__7:
						case STATIC:
						case VIRTUAL:
							{
							setState(1074);
							function_decl_specifiers();
							}
							break;
						case CV_QUALIFIER:
							{
							setState(1075);
							match(CV_QUALIFIER);
							setState(1077);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
							case 1:
								{
								setState(1076);
								match(NEWLINE);
								}
								break;
							}
							}
							break;
						case UNSIGNED:
							{
							setState(1079);
							match(UNSIGNED);
							setState(1081);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
							case 1:
								{
								setState(1080);
								match(NEWLINE);
								}
								break;
							}
							}
							break;
						case SIGNED:
							{
							setState(1083);
							match(SIGNED);
							setState(1085);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
							case 1:
								{
								setState(1084);
								match(NEWLINE);
								}
								break;
							}
							}
							break;
						case T__17:
						case T__18:
							{
							setState(1087);
							ptr_operator();
							}
							break;
						case T__11:
						case T__57:
						case T__58:
						case VOID:
						case SPECIAL_DATA:
						case CLASS_KEY:
						case ALPHA_NUMERIC:
							{
							setState(1088);
							base_type();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1091); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1097);
				_la = _input.LA(1);
				if (_la==T__23) {
					{
					setState(1093);
					match(T__23);
					setState(1094);
					template_param_list();
					setState(1095);
					match(T__24);
					}
				}

				setState(1109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__56) {
					{
					{
					setState(1099);
					match(T__56);
					setState(1100);
					base_type();
					setState(1105);
					_la = _input.LA(1);
					if (_la==T__23) {
						{
						setState(1101);
						match(T__23);
						setState(1102);
						template_param_list();
						setState(1103);
						match(T__24);
						}
					}

					}
					}
					setState(1111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(1126);
						switch (_input.LA(1)) {
						case T__5:
						case T__6:
						case T__7:
						case STATIC:
						case VIRTUAL:
							{
							setState(1112);
							function_decl_specifiers();
							}
							break;
						case CV_QUALIFIER:
							{
							setState(1113);
							match(CV_QUALIFIER);
							setState(1115);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
							case 1:
								{
								setState(1114);
								match(NEWLINE);
								}
								break;
							}
							}
							break;
						case UNSIGNED:
							{
							setState(1117);
							match(UNSIGNED);
							setState(1119);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
							case 1:
								{
								setState(1118);
								match(NEWLINE);
								}
								break;
							}
							}
							break;
						case SIGNED:
							{
							setState(1121);
							match(SIGNED);
							setState(1123);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
							case 1:
								{
								setState(1122);
								match(NEWLINE);
								}
								break;
							}
							}
							break;
						case T__17:
						case T__18:
							{
							setState(1125);
							ptr_operator();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(1130);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1131);
				macroCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Base_typeContext extends ParserRuleContext {
		public List<TerminalNode> VOID() { return getTokens(ModuleParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(ModuleParser.VOID, i);
		}
		public List<TerminalNode> SPECIAL_DATA() { return getTokens(ModuleParser.SPECIAL_DATA); }
		public TerminalNode SPECIAL_DATA(int i) {
			return getToken(ModuleParser.SPECIAL_DATA, i);
		}
		public List<TerminalNode> CLASS_KEY() { return getTokens(ModuleParser.CLASS_KEY); }
		public TerminalNode CLASS_KEY(int i) {
			return getToken(ModuleParser.CLASS_KEY, i);
		}
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(ModuleParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(ModuleParser.ALPHA_NUMERIC, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Base_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterBase_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitBase_type(this);
		}
	}

	public final Base_typeContext base_type() throws RecognitionException {
		Base_typeContext _localctx = new Base_typeContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_base_type);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1162); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1162);
					switch (_input.LA(1)) {
					case VOID:
						{
						setState(1134);
						match(VOID);
						setState(1136);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
						case 1:
							{
							setState(1135);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case T__11:
						{
						setState(1138);
						match(T__11);
						setState(1140);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
						case 1:
							{
							setState(1139);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case T__57:
						{
						setState(1142);
						match(T__57);
						setState(1144);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
						case 1:
							{
							setState(1143);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case T__58:
						{
						setState(1146);
						match(T__58);
						setState(1148);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
						case 1:
							{
							setState(1147);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case SPECIAL_DATA:
						{
						setState(1150);
						match(SPECIAL_DATA);
						setState(1152);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
						case 1:
							{
							setState(1151);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case CLASS_KEY:
						{
						setState(1154);
						match(CLASS_KEY);
						setState(1156);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
						case 1:
							{
							setState(1155);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case ALPHA_NUMERIC:
						{
						setState(1158);
						match(ALPHA_NUMERIC);
						setState(1160);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
						case 1:
							{
							setState(1159);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1164); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_decl_specifiersContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode AUTO() { return getToken(ModuleParser.AUTO, 0); }
		public TerminalNode REGISTER() { return getToken(ModuleParser.REGISTER, 0); }
		public TerminalNode NEWLINE() { return getToken(ModuleParser.NEWLINE, 0); }
		public Param_decl_specifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl_specifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParam_decl_specifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParam_decl_specifiers(this);
		}
	}

	public final Param_decl_specifiersContext param_decl_specifiers() throws RecognitionException {
		Param_decl_specifiersContext _localctx = new Param_decl_specifiersContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_param_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
			switch (_input.LA(1)) {
			case AUTO:
				{
				setState(1166);
				match(AUTO);
				setState(1168);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1167);
					match(NEWLINE);
					}
				}

				}
				break;
			case REGISTER:
				{
				setState(1170);
				match(REGISTER);
				setState(1172);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1171);
					match(NEWLINE);
					}
				}

				}
				break;
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__17:
			case T__18:
			case T__57:
			case T__58:
			case STATIC:
			case VOID:
			case UNSIGNED:
			case SIGNED:
			case CV_QUALIFIER:
			case EXTERN:
			case VIRTUAL:
			case SPECIAL_DATA:
			case OPERATOR:
			case CLASS_KEY:
			case NEW:
			case PRE_PRAGMA_KEYWORDS:
			case END_TEST:
			case ALPHA_NUMERIC:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1176);
			type_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ModuleParser.NEWLINE, 0); }
		public Parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParameter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParameter_name(this);
		}
	}

	public final Parameter_nameContext parameter_name() throws RecognitionException {
		Parameter_nameContext _localctx = new Parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_parameter_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1178);
			identifier();
			setState(1180);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1179);
				match(NEWLINE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_type_listContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(ModuleParser.VOID, 0); }
		public List<Param_typeContext> param_type() {
			return getRuleContexts(Param_typeContext.class);
		}
		public Param_typeContext param_type(int i) {
			return getRuleContext(Param_typeContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Param_type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_type_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParam_type_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParam_type_list(this);
		}
	}

	public final Param_type_listContext param_type_list() throws RecognitionException {
		Param_type_listContext _localctx = new Param_type_listContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_param_type_list);
		int _la;
		try {
			setState(1200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1182);
				match(T__1);
				setState(1183);
				match(VOID);
				setState(1184);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1185);
				match(T__1);
				setState(1197);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ELLIPSIS - 67)) | (1L << (STATIC - 67)) | (1L << (VOID - 67)) | (1L << (UNSIGNED - 67)) | (1L << (SIGNED - 67)) | (1L << (CV_QUALIFIER - 67)) | (1L << (EXTERN - 67)) | (1L << (VIRTUAL - 67)) | (1L << (AUTO - 67)) | (1L << (REGISTER - 67)) | (1L << (SPECIAL_DATA - 67)) | (1L << (OPERATOR - 67)) | (1L << (CLASS_KEY - 67)) | (1L << (NEW - 67)) | (1L << (PRE_PRAGMA_KEYWORDS - 67)) | (1L << (END_TEST - 67)) | (1L << (ALPHA_NUMERIC - 67)))) != 0)) {
					{
					setState(1186);
					param_type();
					setState(1194);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(1187);
						match(T__12);
						setState(1189);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(1188);
							match(NEWLINE);
							}
						}

						setState(1191);
						param_type();
						}
						}
						setState(1196);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1199);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_typeContext extends ParserRuleContext {
		public Param_decl_specifiersContext param_decl_specifiers() {
			return getRuleContext(Param_decl_specifiersContext.class,0);
		}
		public Param_type_idContext param_type_id() {
			return getRuleContext(Param_type_idContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ModuleParser.NEWLINE, 0); }
		public Param_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParam_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParam_type(this);
		}
	}

	public final Param_typeContext param_type() throws RecognitionException {
		Param_typeContext _localctx = new Param_typeContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_param_type);
		int _la;
		try {
			setState(1209);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__17:
			case T__18:
			case T__57:
			case T__58:
			case STATIC:
			case VOID:
			case UNSIGNED:
			case SIGNED:
			case CV_QUALIFIER:
			case EXTERN:
			case VIRTUAL:
			case AUTO:
			case REGISTER:
			case SPECIAL_DATA:
			case OPERATOR:
			case CLASS_KEY:
			case NEW:
			case PRE_PRAGMA_KEYWORDS:
			case END_TEST:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1202);
				param_decl_specifiers();
				setState(1204);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1203);
					match(NEWLINE);
					}
				}

				setState(1206);
				param_type_id();
				}
				break;
			case ELLIPSIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1208);
				match(ELLIPSIS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_type_idContext extends ParserRuleContext {
		public Param_type_idContext param_type_id() {
			return getRuleContext(Param_type_idContext.class,0);
		}
		public PtrsContext ptrs() {
			return getRuleContext(PtrsContext.class,0);
		}
		public Type_suffixContext type_suffix() {
			return getRuleContext(Type_suffixContext.class,0);
		}
		public Parameter_nameContext parameter_name() {
			return getRuleContext(Parameter_nameContext.class,0);
		}
		public Param_type_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_type_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParam_type_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParam_type_id(this);
		}
	}

	public final Param_type_idContext param_type_id() throws RecognitionException {
		Param_type_idContext _localctx = new Param_type_idContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_param_type_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1212);
			_la = _input.LA(1);
			if (_la==T__17 || _la==T__18) {
				{
				setState(1211);
				ptrs();
				}
			}

			setState(1221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1214);
				match(T__1);
				setState(1215);
				param_type_id();
				setState(1216);
				match(T__2);
				}
				break;
			case 2:
				{
				setState(1219);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (NEW - 98)) | (1L << (PRE_PRAGMA_KEYWORDS - 98)) | (1L << (ALPHA_NUMERIC - 98)))) != 0)) {
					{
					setState(1218);
					parameter_name();
					}
				}

				}
				break;
			}
			setState(1224);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__28) {
				{
				setState(1223);
				type_suffix();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(ModuleParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(ModuleParser.ALPHA_NUMERIC, i);
		}
		public TerminalNode NEW() { return getToken(ModuleParser.NEW, 0); }
		public TerminalNode PRE_PRAGMA_KEYWORDS() { return getToken(ModuleParser.PRE_PRAGMA_KEYWORDS, 0); }
		public Access_specifierContext access_specifier() {
			return getRuleContext(Access_specifierContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_identifier);
		try {
			int _alt;
			setState(1237);
			switch (_input.LA(1)) {
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1226);
				match(ALPHA_NUMERIC);
				setState(1231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1227);
						match(T__56);
						setState(1228);
						match(ALPHA_NUMERIC);
						}
						} 
					}
					setState(1233);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
				}
				}
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(1234);
				match(NEW);
				}
				break;
			case PRE_PRAGMA_KEYWORDS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1235);
				match(PRE_PRAGMA_KEYWORDS);
				}
				break;
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(1236);
				access_specifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode HEX_LITERAL() { return getToken(ModuleParser.HEX_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ModuleParser.DECIMAL_LITERAL, 0); }
		public TerminalNode OCTAL_LITERAL() { return getToken(ModuleParser.OCTAL_LITERAL, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1239);
			_la = _input.LA(1);
			if ( !(((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (HEX_LITERAL - 119)) | (1L << (DECIMAL_LITERAL - 119)) | (1L << (OCTAL_LITERAL - 119)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PtrsContext extends ParserRuleContext {
		public List<Ptr_operatorContext> ptr_operator() {
			return getRuleContexts(Ptr_operatorContext.class);
		}
		public Ptr_operatorContext ptr_operator(int i) {
			return getRuleContext(Ptr_operatorContext.class,i);
		}
		public PtrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPtrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPtrs(this);
		}
	}

	public final PtrsContext ptrs() throws RecognitionException {
		PtrsContext _localctx = new PtrsContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_ptrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1245); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1241);
				ptr_operator();
				setState(1243);
				_la = _input.LA(1);
				if (_la==T__59) {
					{
					setState(1242);
					match(T__59);
					}
				}

				}
				}
				setState(1247); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__17 || _la==T__18 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_ptrsContext extends ParserRuleContext {
		public PtrsContext ptrs() {
			return getRuleContext(PtrsContext.class,0);
		}
		public Func_ptrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_ptrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunc_ptrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunc_ptrs(this);
		}
	}

	public final Func_ptrsContext func_ptrs() throws RecognitionException {
		Func_ptrsContext _localctx = new Func_ptrsContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_func_ptrs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1249);
			ptrs();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public List<TerminalNode> ESCAPE() { return getTokens(ModuleParser.ESCAPE); }
		public TerminalNode ESCAPE(int i) {
			return getToken(ModuleParser.ESCAPE, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			assign_expr();
			setState(1256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1252);
					match(ESCAPE);
					setState(1253);
					match(NEWLINE);
					}
					} 
				}
				setState(1258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
			}
			setState(1267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1260);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1259);
					match(NEWLINE);
					}
				}

				setState(1262);
				match(T__12);
				setState(1264);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1263);
					match(NEWLINE);
					}
				}

				setState(1266);
				expr();
				}
				break;
			}
			setState(1273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1269);
					match(ESCAPE);
					setState(1270);
					match(NEWLINE);
					}
					} 
				}
				setState(1275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_exprContext extends ParserRuleContext {
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Assign_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAssign_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAssign_expr(this);
		}
	}

	public final Assign_exprContext assign_expr() throws RecognitionException {
		Assign_exprContext _localctx = new Assign_exprContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_assign_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1276);
			conditional_expression();
			setState(1286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1278);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1277);
					match(NEWLINE);
					}
				}

				setState(1280);
				assignment_operator();
				setState(1282);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1281);
					match(NEWLINE);
					}
				}

				setState(1284);
				assign_expr();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_expressionContext extends ParserRuleContext {
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
	 
		public Conditional_expressionContext() { }
		public void copyFrom(Conditional_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NormOrContext extends Conditional_expressionContext {
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public NormOrContext(Conditional_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNormOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNormOr(this);
		}
	}
	public static class CndExprContext extends Conditional_expressionContext {
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public CndExprContext(Conditional_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCndExpr(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_conditional_expression);
		int _la;
		try {
			setState(1307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				_localctx = new NormOrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1288);
				or_expression();
				}
				break;
			case 2:
				_localctx = new CndExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1289);
				or_expression();
				{
				setState(1291);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1290);
					match(NEWLINE);
					}
				}

				setState(1293);
				match(T__60);
				setState(1295);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1294);
					match(NEWLINE);
					}
				}

				setState(1297);
				expr();
				setState(1299);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1298);
					match(NEWLINE);
					}
				}

				setState(1301);
				match(T__55);
				setState(1303);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1302);
					match(NEWLINE);
					}
				}

				setState(1305);
				conditional_expression();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Or_expressionContext extends ParserRuleContext {
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterOr_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitOr_expression(this);
		}
	}

	public final Or_expressionContext or_expression() throws RecognitionException {
		Or_expressionContext _localctx = new Or_expressionContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1309);
			and_expression();
			setState(1318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1311);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1310);
					match(NEWLINE);
					}
				}

				setState(1313);
				match(T__49);
				setState(1315);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1314);
					match(NEWLINE);
					}
				}

				setState(1317);
				or_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class And_expressionContext extends ParserRuleContext {
		public Inclusive_or_expressionContext inclusive_or_expression() {
			return getRuleContext(Inclusive_or_expressionContext.class,0);
		}
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAnd_expression(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1320);
			inclusive_or_expression();
			setState(1329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				{
				setState(1322);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1321);
					match(NEWLINE);
					}
				}

				setState(1324);
				match(T__48);
				setState(1326);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1325);
					match(NEWLINE);
					}
				}

				setState(1328);
				and_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inclusive_or_expressionContext extends ParserRuleContext {
		public Exclusive_or_expressionContext exclusive_or_expression() {
			return getRuleContext(Exclusive_or_expressionContext.class,0);
		}
		public Inclusive_or_expressionContext inclusive_or_expression() {
			return getRuleContext(Inclusive_or_expressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Inclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInclusive_or_expression(this);
		}
	}

	public final Inclusive_or_expressionContext inclusive_or_expression() throws RecognitionException {
		Inclusive_or_expressionContext _localctx = new Inclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_inclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1331);
			exclusive_or_expression();
			setState(1340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1333);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1332);
					match(NEWLINE);
					}
				}

				setState(1335);
				match(T__33);
				setState(1337);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1336);
					match(NEWLINE);
					}
				}

				setState(1339);
				inclusive_or_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exclusive_or_expressionContext extends ParserRuleContext {
		public Bit_and_expressionContext bit_and_expression() {
			return getRuleContext(Bit_and_expressionContext.class,0);
		}
		public Exclusive_or_expressionContext exclusive_or_expression() {
			return getRuleContext(Exclusive_or_expressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Exclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterExclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitExclusive_or_expression(this);
		}
	}

	public final Exclusive_or_expressionContext exclusive_or_expression() throws RecognitionException {
		Exclusive_or_expressionContext _localctx = new Exclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_exclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1342);
			bit_and_expression();
			setState(1351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1344);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1343);
					match(NEWLINE);
					}
				}

				setState(1346);
				match(T__32);
				setState(1348);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1347);
					match(NEWLINE);
					}
				}

				setState(1350);
				exclusive_or_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_and_expressionContext extends ParserRuleContext {
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public Bit_and_expressionContext bit_and_expression() {
			return getRuleContext(Bit_and_expressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Bit_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterBit_and_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitBit_and_expression(this);
		}
	}

	public final Bit_and_expressionContext bit_and_expression() throws RecognitionException {
		Bit_and_expressionContext _localctx = new Bit_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_bit_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1353);
			equality_expression();
			setState(1362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				{
				setState(1355);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1354);
					match(NEWLINE);
					}
				}

				setState(1357);
				match(T__17);
				setState(1359);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1358);
					match(NEWLINE);
					}
				}

				setState(1361);
				bit_and_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Equality_expressionContext extends ParserRuleContext {
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Equality_operatorContext equality_operator() {
			return getRuleContext(Equality_operatorContext.class,0);
		}
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitEquality_expression(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_equality_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1364);
			relational_expression();
			setState(1374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(1366);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1365);
					match(NEWLINE);
					}
				}

				setState(1368);
				equality_operator();
				setState(1370);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1369);
					match(NEWLINE);
					}
				}

				setState(1372);
				equality_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relational_expressionContext extends ParserRuleContext {
		public Shift_expressionContext shift_expression() {
			return getRuleContext(Shift_expressionContext.class,0);
		}
		public Relational_operatorContext relational_operator() {
			return getRuleContext(Relational_operatorContext.class,0);
		}
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitRelational_expression(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1376);
			shift_expression();
			setState(1386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1378);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1377);
					match(NEWLINE);
					}
				}

				setState(1380);
				relational_operator();
				setState(1382);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1381);
					match(NEWLINE);
					}
				}

				setState(1384);
				relational_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shift_expressionContext extends ParserRuleContext {
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public Shift_expressionContext shift_expression() {
			return getRuleContext(Shift_expressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterShift_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitShift_expression(this);
		}
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1388);
			additive_expression();
			setState(1397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				{
				setState(1390);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1389);
					match(NEWLINE);
					}
				}

				setState(1392);
				_la = _input.LA(1);
				if ( !(_la==T__42 || _la==T__43) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1394);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1393);
					match(NEWLINE);
					}
				}

				setState(1396);
				shift_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Additive_expressionContext extends ParserRuleContext {
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAdditive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAdditive_expression(this);
		}
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1399);
			multiplicative_expression();
			setState(1408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				{
				setState(1401);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1400);
					match(NEWLINE);
					}
				}

				setState(1403);
				_la = _input.LA(1);
				if ( !(_la==T__19 || _la==T__20) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1405);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1404);
					match(NEWLINE);
					}
				}

				setState(1407);
				additive_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public Function_pointer_use_expressionContext function_pointer_use_expression() {
			return getRuleContext(Function_pointer_use_expressionContext.class,0);
		}
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterMultiplicative_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitMultiplicative_expression(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_multiplicative_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1410);
			function_pointer_use_expression();
			setState(1419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				{
				setState(1412);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1411);
					match(NEWLINE);
					}
				}

				setState(1414);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__30) | (1L << T__31))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1416);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1415);
					match(NEWLINE);
					}
				}

				setState(1418);
				multiplicative_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_pointer_use_expressionContext extends ParserRuleContext {
		public Ptr_operatorContext ptr_operator() {
			return getRuleContext(Ptr_operatorContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Function_pointer_use_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_pointer_use_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunction_pointer_use_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunction_pointer_use_expression(this);
		}
	}

	public final Function_pointer_use_expressionContext function_pointer_use_expression() throws RecognitionException {
		Function_pointer_use_expressionContext _localctx = new Function_pointer_use_expressionContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_function_pointer_use_expression);
		try {
			setState(1430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1421);
				match(T__1);
				setState(1422);
				ptr_operator();
				setState(1423);
				identifier();
				setState(1424);
				match(T__2);
				setState(1425);
				match(T__1);
				setState(1426);
				argument_list();
				setState(1427);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1429);
				cast_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cast_expressionContext extends ParserRuleContext {
		public Cast_targetContext cast_target() {
			return getRuleContext(Cast_targetContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Cast_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCast_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCast_expression(this);
		}
	}

	public final Cast_expressionContext cast_expression() throws RecognitionException {
		Cast_expressionContext _localctx = new Cast_expressionContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_cast_expression);
		try {
			setState(1438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1432);
				match(T__1);
				setState(1433);
				cast_target();
				setState(1434);
				match(T__2);
				setState(1435);
				cast_expression();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1437);
				unary_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cast_targetContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Cast_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCast_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCast_target(this);
		}
	}

	public final Cast_targetContext cast_target() throws RecognitionException {
		Cast_targetContext _localctx = new Cast_targetContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_cast_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1440);
			type_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_expressionContext extends ParserRuleContext {
		public Address_of_expressionContext address_of_expression() {
			return getRuleContext(Address_of_expressionContext.class,0);
		}
		public Unary_op_and_cast_exprContext unary_op_and_cast_expr() {
			return getRuleContext(Unary_op_and_cast_exprContext.class,0);
		}
		public Sizeof_expressionContext sizeof_expression() {
			return getRuleContext(Sizeof_expressionContext.class,0);
		}
		public New_expressionContext new_expression() {
			return getRuleContext(New_expressionContext.class,0);
		}
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Defined_expressionContext defined_expression() {
			return getRuleContext(Defined_expressionContext.class,0);
		}
		public MacroCallContext macroCall() {
			return getRuleContext(MacroCallContext.class,0);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitUnary_expression(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_unary_expression);
		try {
			setState(1449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1442);
				address_of_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1443);
				unary_op_and_cast_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1444);
				sizeof_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1445);
				new_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1446);
				postfix_expression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1447);
				defined_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1448);
				macroCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Address_of_expressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Address_of_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_address_of_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAddress_of_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAddress_of_expression(this);
		}
	}

	public final Address_of_expressionContext address_of_expression() throws RecognitionException {
		Address_of_expressionContext _localctx = new Address_of_expressionContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_address_of_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1451);
			match(T__17);
			setState(1452);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_expressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(ModuleParser.NEW, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public New_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNew_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNew_expression(this);
		}
	}

	public final New_expressionContext new_expression() throws RecognitionException {
		New_expressionContext _localctx = new New_expressionContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_new_expression);
		int _la;
		try {
			setState(1488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1455);
				_la = _input.LA(1);
				if (_la==T__56) {
					{
					setState(1454);
					match(T__56);
					}
				}

				setState(1457);
				match(NEW);
				setState(1459);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1458);
					match(NEWLINE);
					}
				}

				setState(1461);
				type_name();
				setState(1463);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1462);
					match(NEWLINE);
					}
				}

				setState(1465);
				match(T__28);
				setState(1467);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__50) | (1L << T__51) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)))) != 0)) {
					{
					setState(1466);
					conditional_expression();
					}
				}

				setState(1469);
				match(T__29);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1472);
				_la = _input.LA(1);
				if (_la==T__56) {
					{
					setState(1471);
					match(T__56);
					}
				}

				setState(1474);
				match(NEW);
				setState(1476);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1475);
					match(NEWLINE);
					}
				}

				setState(1478);
				type_name();
				setState(1480);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1479);
					match(NEWLINE);
					}
				}

				setState(1482);
				match(T__1);
				setState(1484);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__50) | (1L << T__51) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)))) != 0)) {
					{
					setState(1483);
					expr();
					}
				}

				setState(1486);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_op_and_cast_exprContext extends ParserRuleContext {
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ModuleParser.NEWLINE, 0); }
		public Unary_op_and_cast_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_op_and_cast_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterUnary_op_and_cast_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitUnary_op_and_cast_expr(this);
		}
	}

	public final Unary_op_and_cast_exprContext unary_op_and_cast_expr() throws RecognitionException {
		Unary_op_and_cast_exprContext _localctx = new Unary_op_and_cast_exprContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_unary_op_and_cast_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1490);
			unary_operator();
			setState(1492);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1491);
				match(NEWLINE);
				}
			}

			setState(1494);
			cast_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sizeof_expressionContext extends ParserRuleContext {
		public SizeofContext sizeof() {
			return getRuleContext(SizeofContext.class,0);
		}
		public Sizeof_operandContext sizeof_operand() {
			return getRuleContext(Sizeof_operandContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ModuleParser.NEWLINE, 0); }
		public Sizeof_operand2Context sizeof_operand2() {
			return getRuleContext(Sizeof_operand2Context.class,0);
		}
		public Sizeof_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeof_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterSizeof_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitSizeof_expression(this);
		}
	}

	public final Sizeof_expressionContext sizeof_expression() throws RecognitionException {
		Sizeof_expressionContext _localctx = new Sizeof_expressionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_sizeof_expression);
		int _la;
		try {
			setState(1510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1496);
				sizeof();
				setState(1498);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1497);
					match(NEWLINE);
					}
				}

				setState(1500);
				match(T__1);
				setState(1501);
				sizeof_operand();
				setState(1502);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1504);
				sizeof();
				setState(1506);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1505);
					match(NEWLINE);
					}
				}

				setState(1508);
				sizeof_operand2();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SizeofContext extends ParserRuleContext {
		public SizeofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterSizeof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitSizeof(this);
		}
	}

	public final SizeofContext sizeof() throws RecognitionException {
		SizeofContext _localctx = new SizeofContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_sizeof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1512);
			match(T__61);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Defined_expressionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ModuleParser.NEWLINE, 0); }
		public Defined_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defined_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterDefined_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitDefined_expression(this);
		}
	}

	public final Defined_expressionContext defined_expression() throws RecognitionException {
		Defined_expressionContext _localctx = new Defined_expressionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_defined_expression);
		int _la;
		try {
			setState(1527);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1514);
				match(T__62);
				setState(1516);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1515);
					match(NEWLINE);
					}
				}

				setState(1518);
				match(T__1);
				setState(1519);
				expr();
				setState(1520);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1522);
				match(T__62);
				setState(1524);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1523);
					match(NEWLINE);
					}
				}

				setState(1526);
				expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sizeof_operandContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Ptr_operatorContext> ptr_operator() {
			return getRuleContexts(Ptr_operatorContext.class);
		}
		public Ptr_operatorContext ptr_operator(int i) {
			return getRuleContext(Ptr_operatorContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Sizeof_operandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeof_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterSizeof_operand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitSizeof_operand(this);
		}
	}

	public final Sizeof_operandContext sizeof_operand() throws RecognitionException {
		Sizeof_operandContext _localctx = new Sizeof_operandContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_sizeof_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1529);
			type_name();
			setState(1536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (T__17 - 18)) | (1L << (T__18 - 18)) | (1L << (NEWLINE - 18)))) != 0)) {
				{
				{
				setState(1531);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1530);
					match(NEWLINE);
					}
				}

				setState(1533);
				ptr_operator();
				}
				}
				setState(1538);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sizeof_operand2Context extends ParserRuleContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Sizeof_operand2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeof_operand2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterSizeof_operand2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitSizeof_operand2(this);
		}
	}

	public final Sizeof_operand2Context sizeof_operand2() throws RecognitionException {
		Sizeof_operand2Context _localctx = new Sizeof_operand2Context(_ctx, getState());
		enterRule(_localctx, 232, RULE_sizeof_operand2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1539);
			unary_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inc_decContext extends ParserRuleContext {
		public Inc_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInc_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInc_dec(this);
		}
	}

	public final Inc_decContext inc_dec() throws RecognitionException {
		Inc_decContext _localctx = new Inc_decContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_inc_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1541);
			_la = _input.LA(1);
			if ( !(_la==T__50 || _la==T__51) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Postfix_expressionContext extends ParserRuleContext {
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
	 
		public Postfix_expressionContext() { }
		public void copyFrom(Postfix_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MemberAccessContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ModuleParser.NEWLINE, 0); }
		public TerminalNode TEMPLATE() { return getToken(ModuleParser.TEMPLATE, 0); }
		public MemberAccessContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitMemberAccess(this);
		}
	}
	public static class IncDecOpContext extends Postfix_expressionContext {
		public Inc_decContext inc_dec() {
			return getRuleContext(Inc_decContext.class,0);
		}
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public List<Ptr_operatorContext> ptr_operator() {
			return getRuleContexts(Ptr_operatorContext.class);
		}
		public Ptr_operatorContext ptr_operator(int i) {
			return getRuleContext(Ptr_operatorContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(ModuleParser.NEWLINE, 0); }
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public IncDecOpContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterIncDecOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitIncDecOp(this);
		}
	}
	public static class ArrayAssignContext extends Postfix_expressionContext {
		public Initializer_expressionContext initializer_expression() {
			return getRuleContext(Initializer_expressionContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public ArrayAssignContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterArrayAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitArrayAssign(this);
		}
	}
	public static class PrimaryOnlyContext extends Postfix_expressionContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public PrimaryOnlyContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPrimaryOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPrimaryOnly(this);
		}
	}
	public static class FuncCallContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ModuleParser.NEWLINE, 0); }
		public FuncCallContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFuncCall(this);
		}
	}
	public static class ArrayIndexingContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ModuleParser.NEWLINE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayIndexingContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterArrayIndexing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitArrayIndexing(this);
		}
	}
	public static class PtrMemberAccessContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ModuleParser.NEWLINE, 0); }
		public TerminalNode TEMPLATE() { return getToken(ModuleParser.TEMPLATE, 0); }
		public PtrMemberAccessContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPtrMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPtrMemberAccess(this);
		}
	}

	public final Postfix_expressionContext postfix_expression() throws RecognitionException {
		return postfix_expression(0);
	}

	private Postfix_expressionContext postfix_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, _parentState);
		Postfix_expressionContext _prevctx = _localctx;
		int _startState = 236;
		enterRecursionRule(_localctx, 236, RULE_postfix_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				{
				_localctx = new ArrayAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1545);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (STATIC - 80)) | (1L << (VOID - 80)) | (1L << (UNSIGNED - 80)) | (1L << (SIGNED - 80)) | (1L << (CV_QUALIFIER - 80)) | (1L << (EXTERN - 80)) | (1L << (VIRTUAL - 80)) | (1L << (SPECIAL_DATA - 80)) | (1L << (OPERATOR - 80)) | (1L << (CLASS_KEY - 80)) | (1L << (NEW - 80)) | (1L << (PRE_PRAGMA_KEYWORDS - 80)) | (1L << (END_TEST - 80)) | (1L << (ALPHA_NUMERIC - 80)))) != 0)) {
					{
					setState(1544);
					type_name();
					}
				}

				setState(1547);
				initializer_expression();
				}
				break;
			case 2:
				{
				_localctx = new PrimaryOnlyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1548);
				primary_expression();
				}
				break;
			case 3:
				{
				_localctx = new IncDecOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1550);
				_la = _input.LA(1);
				if (_la==T__17 || _la==T__18) {
					{
					setState(1549);
					ptr_operator();
					}
				}

				setState(1552);
				inc_dec();
				setState(1554);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1553);
					match(NEWLINE);
					}
				}

				setState(1557);
				_la = _input.LA(1);
				if (_la==T__17 || _la==T__18) {
					{
					setState(1556);
					ptr_operator();
					}
				}

				setState(1559);
				primary_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1605);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1603);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayIndexingContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1563);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1565);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(1564);
							match(NEWLINE);
							}
						}

						setState(1567);
						match(T__28);
						setState(1569);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__50) | (1L << T__51) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)))) != 0)) {
							{
							setState(1568);
							expr();
							}
						}

						setState(1571);
						match(T__29);
						}
						break;
					case 2:
						{
						_localctx = new FuncCallContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1572);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1574);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(1573);
							match(NEWLINE);
							}
						}

						setState(1576);
						match(T__1);
						setState(1577);
						argument_list();
						setState(1578);
						match(T__2);
						}
						break;
					case 3:
						{
						_localctx = new MemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1580);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1581);
						match(T__63);
						setState(1583);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(1582);
							match(NEWLINE);
							}
						}

						setState(1586);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(1585);
							match(TEMPLATE);
							}
						}

						{
						setState(1588);
						identifier();
						}
						}
						break;
					case 4:
						{
						_localctx = new PtrMemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1589);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1590);
						match(T__53);
						setState(1592);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(1591);
							match(NEWLINE);
							}
						}

						setState(1595);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(1594);
							match(TEMPLATE);
							}
						}

						{
						setState(1597);
						identifier();
						}
						}
						break;
					case 5:
						{
						_localctx = new IncDecOpContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1598);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1600);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(1599);
							match(NEWLINE);
							}
						}

						setState(1602);
						inc_dec();
						}
						break;
					}
					} 
				}
				setState(1607);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Initializer_expressionContext extends ParserRuleContext {
		public TerminalNode OPENING_CURLY() { return getToken(ModuleParser.OPENING_CURLY, 0); }
		public TerminalNode CLOSING_CURLY() { return getToken(ModuleParser.CLOSING_CURLY, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(ModuleParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(ModuleParser.COMMENT, i);
		}
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Initializer_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInitializer_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInitializer_expression(this);
		}
	}

	public final Initializer_expressionContext initializer_expression() throws RecognitionException {
		Initializer_expressionContext _localctx = new Initializer_expressionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_initializer_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1608);
			match(OPENING_CURLY);
			setState(1610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				{
				setState(1609);
				match(NEWLINE);
				}
				break;
			}
			setState(1618);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1612);
					match(COMMENT);
					setState(1614);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
					case 1:
						{
						setState(1613);
						match(NEWLINE);
						}
						break;
					}
					}
					} 
				}
				setState(1620);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			}
			setState(1622);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				{
				setState(1621);
				argument_list();
				}
				break;
			}
			setState(1625);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1624);
				match(NEWLINE);
				}
			}

			setState(1633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(1627);
				match(COMMENT);
				setState(1629);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1628);
					match(NEWLINE);
					}
				}

				}
				}
				setState(1635);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1636);
			match(CLOSING_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argument_listContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(ModuleParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(ModuleParser.COMMENT, i);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitArgument_list(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_argument_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				{
				setState(1639);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1638);
					match(NEWLINE);
					}
				}

				setState(1641);
				argument();
				}
				break;
			}
			setState(1645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				{
				setState(1644);
				match(NEWLINE);
				}
				break;
			}
			setState(1665);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,272,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1648);
					_la = _input.LA(1);
					if (_la==T__12) {
						{
						setState(1647);
						match(T__12);
						}
					}

					setState(1651);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1650);
						match(NEWLINE);
						}
					}

					setState(1659);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,271,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1653);
							match(COMMENT);
							setState(1655);
							_la = _input.LA(1);
							if (_la==NEWLINE) {
								{
								setState(1654);
								match(NEWLINE);
								}
							}

							}
							} 
						}
						setState(1661);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,271,_ctx);
					}
					setState(1662);
					argument();
					}
					} 
				}
				setState(1667);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,272,_ctx);
			}
			setState(1669);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(1668);
				match(T__12);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1671);
			assign_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_expressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPrimary_expression(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_primary_expression);
		int _la;
		try {
			setState(1683);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case T__63:
			case NEW:
			case PRE_PRAGMA_KEYWORDS:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1674);
				_la = _input.LA(1);
				if (_la==T__63) {
					{
					setState(1673);
					match(T__63);
					}
				}

				setState(1676);
				identifier();
				}
				}
				break;
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1677);
				constant();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1678);
				comment();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(1679);
				match(T__1);
				setState(1680);
				expr();
				setState(1681);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_expressionContext extends ParserRuleContext {
		public Null_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNull_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNull_expression(this);
		}
	}

	public final Null_expressionContext null_expression() throws RecognitionException {
		Null_expressionContext _localctx = new Null_expressionContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_null_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1685);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Init_declaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ModuleParser.NEWLINE, 0); }
		public Assign_expr_w_Context assign_expr_w_() {
			return getRuleContext(Assign_expr_w_Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Init_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInit_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInit_declarator(this);
		}
	}

	public final Init_declaratorContext init_declarator() throws RecognitionException {
		Init_declaratorContext _localctx = new Init_declaratorContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_init_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1687);
			declarator();
			setState(1689);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				{
				setState(1688);
				match(NEWLINE);
				}
				break;
			}
			setState(1698);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(1691);
				match(T__1);
				setState(1693);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__50) | (1L << T__51) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)))) != 0)) {
					{
					setState(1692);
					expr();
					}
				}

				setState(1695);
				match(T__2);
				}
				}
				break;
			case T__3:
				{
				{
				setState(1696);
				match(T__3);
				setState(1697);
				assign_expr_w_();
				}
				}
				break;
			case T__0:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case NEWLINE:
			case PRE_OTHER:
			case PRE_ATTRIBUTE:
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PtrsContext ptrs() {
			return getRuleContext(PtrsContext.class,0);
		}
		public Type_suffixContext type_suffix() {
			return getRuleContext(Type_suffixContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitDeclarator(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1701);
			_la = _input.LA(1);
			if (_la==T__17 || _la==T__18) {
				{
				setState(1700);
				ptrs();
				}
			}

			setState(1703);
			identifier();
			setState(1705);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				{
				setState(1704);
				type_suffix();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_suffixContext extends ParserRuleContext {
		public Constant_expr_w_Context constant_expr_w_() {
			return getRuleContext(Constant_expr_w_Context.class,0);
		}
		public Param_type_listContext param_type_list() {
			return getRuleContext(Param_type_listContext.class,0);
		}
		public Type_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterType_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitType_suffix(this);
		}
	}

	public final Type_suffixContext type_suffix() throws RecognitionException {
		Type_suffixContext _localctx = new Type_suffixContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_type_suffix);
		try {
			setState(1712);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1707);
				match(T__28);
				setState(1708);
				constant_expr_w_();
				setState(1709);
				match(T__29);
				}
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(1711);
				param_type_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_expr_w_Context extends ParserRuleContext {
		public List<Assign_waterContext> assign_water() {
			return getRuleContexts(Assign_waterContext.class);
		}
		public Assign_waterContext assign_water(int i) {
			return getRuleContext(Assign_waterContext.class,i);
		}
		public List<Assign_expr_w__l2Context> assign_expr_w__l2() {
			return getRuleContexts(Assign_expr_w__l2Context.class);
		}
		public Assign_expr_w__l2Context assign_expr_w__l2(int i) {
			return getRuleContext(Assign_expr_w__l2Context.class,i);
		}
		public Assign_expr_w_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expr_w_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAssign_expr_w_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAssign_expr_w_(this);
		}
	}

	public final Assign_expr_w_Context assign_expr_w_() throws RecognitionException {
		Assign_expr_w_Context _localctx = new Assign_expr_w_Context(_ctx, getState());
		enterRule(_localctx, 254, RULE_assign_expr_w_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1717);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,282,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1714);
					assign_water();
					}
					} 
				}
				setState(1719);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,282,_ctx);
			}
			setState(1742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==T__28 || _la==OPENING_CURLY) {
				{
				{
				setState(1732);
				switch (_input.LA(1)) {
				case OPENING_CURLY:
					{
					setState(1720);
					match(OPENING_CURLY);
					setState(1721);
					assign_expr_w__l2();
					setState(1722);
					match(CLOSING_CURLY);
					}
					break;
				case T__1:
					{
					setState(1724);
					match(T__1);
					setState(1725);
					assign_expr_w__l2();
					setState(1726);
					match(T__2);
					}
					break;
				case T__28:
					{
					setState(1728);
					match(T__28);
					setState(1729);
					assign_expr_w__l2();
					setState(1730);
					match(T__29);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1737);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,284,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1734);
						assign_water();
						}
						} 
					}
					setState(1739);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,284,_ctx);
				}
				}
				}
				setState(1744);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_expr_w__l2Context extends ParserRuleContext {
		public List<Assign_water_l2Context> assign_water_l2() {
			return getRuleContexts(Assign_water_l2Context.class);
		}
		public Assign_water_l2Context assign_water_l2(int i) {
			return getRuleContext(Assign_water_l2Context.class,i);
		}
		public List<Assign_expr_w__l2Context> assign_expr_w__l2() {
			return getRuleContexts(Assign_expr_w__l2Context.class);
		}
		public Assign_expr_w__l2Context assign_expr_w__l2(int i) {
			return getRuleContext(Assign_expr_w__l2Context.class,i);
		}
		public Assign_expr_w__l2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expr_w__l2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAssign_expr_w__l2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAssign_expr_w__l2(this);
		}
	}

	public final Assign_expr_w__l2Context assign_expr_w__l2() throws RecognitionException {
		Assign_expr_w__l2Context _localctx = new Assign_expr_w__l2Context(_ctx, getState());
		enterRule(_localctx, 256, RULE_assign_expr_w__l2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1748);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (WHITESPACE - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(1745);
				assign_water_l2();
				}
				}
				setState(1750);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==T__28 || _la==OPENING_CURLY) {
				{
				{
				setState(1763);
				switch (_input.LA(1)) {
				case OPENING_CURLY:
					{
					setState(1751);
					match(OPENING_CURLY);
					setState(1752);
					assign_expr_w__l2();
					setState(1753);
					match(CLOSING_CURLY);
					}
					break;
				case T__1:
					{
					setState(1755);
					match(T__1);
					setState(1756);
					assign_expr_w__l2();
					setState(1757);
					match(T__2);
					}
					break;
				case T__28:
					{
					setState(1759);
					match(T__28);
					setState(1760);
					assign_expr_w__l2();
					setState(1761);
					match(T__29);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1768);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (WHITESPACE - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(1765);
					assign_water_l2();
					}
					}
					setState(1770);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(1775);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constant_expr_w_Context extends ParserRuleContext {
		public List<No_squaresContext> no_squares() {
			return getRuleContexts(No_squaresContext.class);
		}
		public No_squaresContext no_squares(int i) {
			return getRuleContext(No_squaresContext.class,i);
		}
		public List<Constant_expr_w_Context> constant_expr_w_() {
			return getRuleContexts(Constant_expr_w_Context.class);
		}
		public Constant_expr_w_Context constant_expr_w_(int i) {
			return getRuleContext(Constant_expr_w_Context.class,i);
		}
		public Constant_expr_w_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_expr_w_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterConstant_expr_w_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitConstant_expr_w_(this);
		}
	}

	public final Constant_expr_w_Context constant_expr_w_() throws RecognitionException {
		Constant_expr_w_Context _localctx = new Constant_expr_w_Context(_ctx, getState());
		enterRule(_localctx, 258, RULE_constant_expr_w_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (WHITESPACE - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(1776);
				no_squares();
				}
				}
				setState(1781);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(1782);
				match(T__28);
				setState(1783);
				constant_expr_w_();
				setState(1784);
				match(T__29);
				setState(1788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (WHITESPACE - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(1785);
					no_squares();
					}
					}
					setState(1790);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(1795);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 118:
			return postfix_expression_sempred((Postfix_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean postfix_expression_sempred(Postfix_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0081\u0707\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\7\2\u010e\n\2\f\2\16\2\u0111\13\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\5"+
		"\4\u011a\n\4\3\5\3\5\3\5\3\5\5\5\u0120\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0134\n\n\3\13\3\13\3"+
		"\13\3\13\7\13\u013a\n\13\f\13\16\13\u013d\13\13\3\13\3\13\7\13\u0141\n"+
		"\13\f\13\16\13\u0144\13\13\3\13\3\13\5\13\u0148\n\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u0153\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u015b\n\r"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u0165\n\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u016e\n\17\5\17\u0170\n\17\3\20\3\20\3\21\3"+
		"\21\5\21\u0176\n\21\3\21\3\21\3\21\5\21\u017b\n\21\7\21\u017d\n\21\f\21"+
		"\16\21\u0180\13\21\3\22\3\22\5\22\u0184\n\22\3\23\3\23\3\23\3\23\5\23"+
		"\u018a\n\23\3\23\5\23\u018d\n\23\3\23\3\23\5\23\u0191\n\23\3\23\3\23\5"+
		"\23\u0195\n\23\7\23\u0197\n\23\f\23\16\23\u019a\13\23\3\23\5\23\u019d"+
		"\n\23\3\23\5\23\u01a0\n\23\3\23\3\23\3\24\3\24\3\24\5\24\u01a7\n\24\3"+
		"\25\3\25\5\25\u01ab\n\25\3\25\3\25\3\25\3\25\5\25\u01b1\n\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01bb\n\25\3\25\5\25\u01be\n\25\3"+
		"\26\3\26\3\26\7\26\u01c3\n\26\f\26\16\26\u01c6\13\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\7\27\u01ce\n\27\f\27\16\27\u01d1\13\27\3\27\3\27\3\27\3"+
		"\27\3\27\5\27\u01d8\n\27\3\27\3\27\7\27\u01dc\n\27\f\27\16\27\u01df\13"+
		"\27\3\27\3\27\3\27\5\27\u01e4\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u01eb"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\5\31\u01f2\n\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u0206\n\34\3\35\3\35\5\35\u020a\n\35\3\35\3\35\3\35\3\35\3\35\5\35\u0211"+
		"\n\35\3\35\3\35\7\35\u0215\n\35\f\35\16\35\u0218\13\35\3\35\3\35\5\35"+
		"\u021c\n\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\7\"\u022b"+
		"\n\"\f\"\16\"\u022e\13\"\3\"\7\"\u0231\n\"\f\"\16\"\u0234\13\"\3\"\7\""+
		"\u0237\n\"\f\"\16\"\u023a\13\"\6\"\u023c\n\"\r\"\16\"\u023d\3\"\3\"\5"+
		"\"\u0242\n\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\5&\u024d\n&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0277\n&\3\'\3\'\3(\3(\3)\3)\3)\3"+
		")\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\6*\u028b\n*\r*\16*\u028c\3+\3+\3,\3,\3"+
		"-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\3\66\3\66\3\66\5\66\u02a9\n\66\3\67\3\67\3\67\6\67\u02ae\n"+
		"\67\r\67\16\67\u02af\38\38\38\58\u02b5\n8\39\39\59\u02b9\n9\39\59\u02bc"+
		"\n9\39\59\u02bf\n9\39\39\59\u02c3\n9\39\39\3:\3:\3:\3:\3:\3;\3;\3<\5<"+
		"\u02cf\n<\3<\5<\u02d2\n<\3<\3<\5<\u02d6\n<\5<\u02d8\n<\3<\3<\5<\u02dc"+
		"\n<\3<\3<\5<\u02e0\n<\3<\5<\u02e3\n<\3<\3<\3=\3=\5=\u02e9\n=\7=\u02eb"+
		"\n=\f=\16=\u02ee\13=\3=\3=\3=\3=\5=\u02f4\n=\7=\u02f6\n=\f=\16=\u02f9"+
		"\13=\3=\3=\5=\u02fd\n=\5=\u02ff\n=\3>\3>\5>\u0303\n>\3>\3>\5>\u0307\n"+
		">\3>\3>\5>\u030b\n>\7>\u030d\n>\f>\16>\u0310\13>\3>\5>\u0313\n>\3?\3?"+
		"\3?\5?\u0318\n?\3?\7?\u031b\n?\f?\16?\u031e\13?\3?\3?\5?\u0322\n?\3?\5"+
		"?\u0325\n?\3@\3@\3@\3@\5@\u032b\n@\3A\5A\u032e\nA\3A\3A\3A\3A\3A\5A\u0335"+
		"\nA\3A\5A\u0338\nA\3B\3B\3B\3C\3C\3C\3C\7C\u0341\nC\fC\16C\u0344\13C\3"+
		"D\3D\3D\3E\5E\u034a\nE\3E\3E\3F\3F\5F\u0350\nF\3F\3F\3G\3G\3G\3G\3G\3"+
		"G\3G\5G\u035b\nG\3H\3H\3H\3H\3H\3I\7I\u0363\nI\fI\16I\u0366\13I\3I\3I"+
		"\3I\3I\7I\u036c\nI\fI\16I\u036f\13I\7I\u0371\nI\fI\16I\u0374\13I\3J\3"+
		"J\3K\5K\u0379\nK\3K\3K\5K\u037d\nK\3K\3K\5K\u0381\nK\5K\u0383\nK\3K\5"+
		"K\u0386\nK\3K\3K\3K\3K\3K\5K\u038d\nK\5K\u038f\nK\3K\3K\3K\5K\u0394\n"+
		"K\3K\3K\3K\3K\3K\5K\u039b\nK\3K\5K\u039e\nK\3K\3K\3K\3K\5K\u03a4\nK\5"+
		"K\u03a6\nK\3K\3K\5K\u03aa\nK\5K\u03ac\nK\3K\3K\5K\u03b0\nK\5K\u03b2\n"+
		"K\3K\3K\5K\u03b6\nK\3K\5K\u03b9\nK\3K\5K\u03bc\nK\5K\u03be\nK\3L\6L\u03c1"+
		"\nL\rL\16L\u03c2\3M\3M\5M\u03c7\nM\3M\5M\u03ca\nM\3M\3M\5M\u03ce\nM\5"+
		"M\u03d0\nM\3M\5M\u03d3\nM\3M\3M\3M\3M\5M\u03d9\nM\3M\5M\u03dc\nM\3M\3"+
		"M\5M\u03e0\nM\3M\5M\u03e3\nM\3M\3M\5M\u03e7\nM\3M\3M\3M\3M\3M\5M\u03ee"+
		"\nM\3M\5M\u03f1\nM\3M\5M\u03f4\nM\3N\3N\5N\u03f8\nN\3N\3N\5N\u03fc\nN"+
		"\3N\7N\u03ff\nN\fN\16N\u0402\13N\3N\5N\u0405\nN\3N\5N\u0408\nN\3N\3N\3"+
		"O\3O\5O\u040e\nO\3O\5O\u0411\nO\3O\5O\u0414\nO\3O\3O\3O\3P\3P\3Q\3Q\3"+
		"Q\3Q\7Q\u041f\nQ\fQ\16Q\u0422\13Q\3R\3R\5R\u0426\nR\5R\u0428\nR\3R\5R"+
		"\u042b\nR\3R\3R\3S\3S\5S\u0431\nS\5S\u0433\nS\3S\3S\3S\5S\u0438\nS\3S"+
		"\3S\5S\u043c\nS\3S\3S\5S\u0440\nS\3S\3S\6S\u0444\nS\rS\16S\u0445\3S\3"+
		"S\3S\3S\5S\u044c\nS\3S\3S\3S\3S\3S\3S\5S\u0454\nS\7S\u0456\nS\fS\16S\u0459"+
		"\13S\3S\3S\3S\5S\u045e\nS\3S\3S\5S\u0462\nS\3S\3S\5S\u0466\nS\3S\7S\u0469"+
		"\nS\fS\16S\u046c\13S\3S\5S\u046f\nS\3T\3T\5T\u0473\nT\3T\3T\5T\u0477\n"+
		"T\3T\3T\5T\u047b\nT\3T\3T\5T\u047f\nT\3T\3T\5T\u0483\nT\3T\3T\5T\u0487"+
		"\nT\3T\3T\5T\u048b\nT\6T\u048d\nT\rT\16T\u048e\3U\3U\5U\u0493\nU\3U\3"+
		"U\5U\u0497\nU\5U\u0499\nU\3U\3U\3V\3V\5V\u049f\nV\3W\3W\3W\3W\3W\3W\3"+
		"W\5W\u04a8\nW\3W\7W\u04ab\nW\fW\16W\u04ae\13W\5W\u04b0\nW\3W\5W\u04b3"+
		"\nW\3X\3X\5X\u04b7\nX\3X\3X\3X\5X\u04bc\nX\3Y\5Y\u04bf\nY\3Y\3Y\3Y\3Y"+
		"\3Y\5Y\u04c6\nY\5Y\u04c8\nY\3Y\5Y\u04cb\nY\3Z\3Z\3Z\7Z\u04d0\nZ\fZ\16"+
		"Z\u04d3\13Z\3Z\3Z\3Z\5Z\u04d8\nZ\3[\3[\3\\\3\\\5\\\u04de\n\\\6\\\u04e0"+
		"\n\\\r\\\16\\\u04e1\3]\3]\3^\3^\3^\7^\u04e9\n^\f^\16^\u04ec\13^\3^\5^"+
		"\u04ef\n^\3^\3^\5^\u04f3\n^\3^\5^\u04f6\n^\3^\3^\7^\u04fa\n^\f^\16^\u04fd"+
		"\13^\3_\3_\5_\u0501\n_\3_\3_\5_\u0505\n_\3_\3_\5_\u0509\n_\3`\3`\3`\5"+
		"`\u050e\n`\3`\3`\5`\u0512\n`\3`\3`\5`\u0516\n`\3`\3`\5`\u051a\n`\3`\3"+
		"`\5`\u051e\n`\3a\3a\5a\u0522\na\3a\3a\5a\u0526\na\3a\5a\u0529\na\3b\3"+
		"b\5b\u052d\nb\3b\3b\5b\u0531\nb\3b\5b\u0534\nb\3c\3c\5c\u0538\nc\3c\3"+
		"c\5c\u053c\nc\3c\5c\u053f\nc\3d\3d\5d\u0543\nd\3d\3d\5d\u0547\nd\3d\5"+
		"d\u054a\nd\3e\3e\5e\u054e\ne\3e\3e\5e\u0552\ne\3e\5e\u0555\ne\3f\3f\5"+
		"f\u0559\nf\3f\3f\5f\u055d\nf\3f\3f\5f\u0561\nf\3g\3g\5g\u0565\ng\3g\3"+
		"g\5g\u0569\ng\3g\3g\5g\u056d\ng\3h\3h\5h\u0571\nh\3h\3h\5h\u0575\nh\3"+
		"h\5h\u0578\nh\3i\3i\5i\u057c\ni\3i\3i\5i\u0580\ni\3i\5i\u0583\ni\3j\3"+
		"j\5j\u0587\nj\3j\3j\5j\u058b\nj\3j\5j\u058e\nj\3k\3k\3k\3k\3k\3k\3k\3"+
		"k\3k\5k\u0599\nk\3l\3l\3l\3l\3l\3l\5l\u05a1\nl\3m\3m\3n\3n\3n\3n\3n\3"+
		"n\3n\5n\u05ac\nn\3o\3o\3o\3p\5p\u05b2\np\3p\3p\5p\u05b6\np\3p\3p\5p\u05ba"+
		"\np\3p\3p\5p\u05be\np\3p\3p\3p\5p\u05c3\np\3p\3p\5p\u05c7\np\3p\3p\5p"+
		"\u05cb\np\3p\3p\5p\u05cf\np\3p\3p\5p\u05d3\np\3q\3q\5q\u05d7\nq\3q\3q"+
		"\3r\3r\5r\u05dd\nr\3r\3r\3r\3r\3r\3r\5r\u05e5\nr\3r\3r\5r\u05e9\nr\3s"+
		"\3s\3t\3t\5t\u05ef\nt\3t\3t\3t\3t\3t\3t\5t\u05f7\nt\3t\5t\u05fa\nt\3u"+
		"\3u\5u\u05fe\nu\3u\7u\u0601\nu\fu\16u\u0604\13u\3v\3v\3w\3w\3x\3x\5x\u060c"+
		"\nx\3x\3x\3x\5x\u0611\nx\3x\3x\5x\u0615\nx\3x\5x\u0618\nx\3x\3x\5x\u061c"+
		"\nx\3x\3x\5x\u0620\nx\3x\3x\5x\u0624\nx\3x\3x\3x\5x\u0629\nx\3x\3x\3x"+
		"\3x\3x\3x\3x\5x\u0632\nx\3x\5x\u0635\nx\3x\3x\3x\3x\5x\u063b\nx\3x\5x"+
		"\u063e\nx\3x\3x\3x\5x\u0643\nx\3x\7x\u0646\nx\fx\16x\u0649\13x\3y\3y\5"+
		"y\u064d\ny\3y\3y\5y\u0651\ny\7y\u0653\ny\fy\16y\u0656\13y\3y\5y\u0659"+
		"\ny\3y\5y\u065c\ny\3y\3y\5y\u0660\ny\7y\u0662\ny\fy\16y\u0665\13y\3y\3"+
		"y\3z\5z\u066a\nz\3z\5z\u066d\nz\3z\5z\u0670\nz\3z\5z\u0673\nz\3z\5z\u0676"+
		"\nz\3z\3z\5z\u067a\nz\7z\u067c\nz\fz\16z\u067f\13z\3z\7z\u0682\nz\fz\16"+
		"z\u0685\13z\3z\5z\u0688\nz\3{\3{\3|\5|\u068d\n|\3|\3|\3|\3|\3|\3|\3|\5"+
		"|\u0696\n|\3}\3}\3~\3~\5~\u069c\n~\3~\3~\5~\u06a0\n~\3~\3~\3~\5~\u06a5"+
		"\n~\3\177\5\177\u06a8\n\177\3\177\3\177\5\177\u06ac\n\177\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\5\u0080\u06b3\n\u0080\3\u0081\7\u0081\u06b6\n"+
		"\u0081\f\u0081\16\u0081\u06b9\13\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081"+
		"\u06c7\n\u0081\3\u0081\7\u0081\u06ca\n\u0081\f\u0081\16\u0081\u06cd\13"+
		"\u0081\7\u0081\u06cf\n\u0081\f\u0081\16\u0081\u06d2\13\u0081\3\u0082\7"+
		"\u0082\u06d5\n\u0082\f\u0082\16\u0082\u06d8\13\u0082\3\u0082\3\u0082\3"+
		"\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\5\u0082\u06e6\n\u0082\3\u0082\7\u0082\u06e9\n\u0082\f\u0082\16"+
		"\u0082\u06ec\13\u0082\7\u0082\u06ee\n\u0082\f\u0082\16\u0082\u06f1\13"+
		"\u0082\3\u0083\7\u0083\u06f4\n\u0083\f\u0083\16\u0083\u06f7\13\u0083\3"+
		"\u0083\3\u0083\3\u0083\3\u0083\7\u0083\u06fd\n\u0083\f\u0083\16\u0083"+
		"\u0700\13\u0083\7\u0083\u0702\n\u0083\f\u0083\16\u0083\u0705\13\u0083"+
		"\3\u0083\2\3\u00ee\u0084\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc"+
		"\u00fe\u0100\u0102\u0104\2\31\7\2\b\16RUXXaacc\3\2\24\31\3\2\32\35\5\2"+
		"\b\nRRXX\3\2\24\25\3\2\13\r\4\2\36\36dd\5\2\6\6%,/\60\3\2\61\62\3\2\4"+
		"\5\5\2\4\5\37 wx\3\2\3\5\4\2\4\5\32\33\3\2wx\3\2\37 \4\2\3\3\37 \4\2\3"+
		"\3\17\17\6\2\3\5\17\17\37 wx\3\2y{\3\2-.\3\2\26\27\4\2\25\25!\"\3\2\65"+
		"\66\u0815\2\u010f\3\2\2\2\4\u0112\3\2\2\2\6\u0119\3\2\2\2\b\u011f\3\2"+
		"\2\2\n\u0121\3\2\2\2\f\u0125\3\2\2\2\16\u0129\3\2\2\2\20\u012b\3\2\2\2"+
		"\22\u0133\3\2\2\2\24\u0147\3\2\2\2\26\u0152\3\2\2\2\30\u015a\3\2\2\2\32"+
		"\u015c\3\2\2\2\34\u016f\3\2\2\2\36\u0171\3\2\2\2 \u0175\3\2\2\2\"\u0183"+
		"\3\2\2\2$\u0185\3\2\2\2&\u01a6\3\2\2\2(\u01bd\3\2\2\2*\u01bf\3\2\2\2,"+
		"\u01e3\3\2\2\2.\u01ea\3\2\2\2\60\u01f1\3\2\2\2\62\u01f3\3\2\2\2\64\u01f5"+
		"\3\2\2\2\66\u0205\3\2\2\28\u021b\3\2\2\2:\u021d\3\2\2\2<\u021f\3\2\2\2"+
		">\u0221\3\2\2\2@\u0223\3\2\2\2B\u0241\3\2\2\2D\u0243\3\2\2\2F\u0245\3"+
		"\2\2\2H\u0247\3\2\2\2J\u0276\3\2\2\2L\u0278\3\2\2\2N\u027a\3\2\2\2P\u027c"+
		"\3\2\2\2R\u028a\3\2\2\2T\u028e\3\2\2\2V\u0290\3\2\2\2X\u0292\3\2\2\2Z"+
		"\u0294\3\2\2\2\\\u0296\3\2\2\2^\u0298\3\2\2\2`\u029a\3\2\2\2b\u029c\3"+
		"\2\2\2d\u029e\3\2\2\2f\u02a0\3\2\2\2h\u02a2\3\2\2\2j\u02a8\3\2\2\2l\u02ad"+
		"\3\2\2\2n\u02b1\3\2\2\2p\u02b6\3\2\2\2r\u02c6\3\2\2\2t\u02cb\3\2\2\2v"+
		"\u02ce\3\2\2\2x\u02fe\3\2\2\2z\u0300\3\2\2\2|\u0314\3\2\2\2~\u032a\3\2"+
		"\2\2\u0080\u032d\3\2\2\2\u0082\u0339\3\2\2\2\u0084\u033c\3\2\2\2\u0086"+
		"\u0345\3\2\2\2\u0088\u0349\3\2\2\2\u008a\u034d\3\2\2\2\u008c\u035a\3\2"+
		"\2\2\u008e\u035c\3\2\2\2\u0090\u0364\3\2\2\2\u0092\u0375\3\2\2\2\u0094"+
		"\u03bd\3\2\2\2\u0096\u03c0\3\2\2\2\u0098\u03f3\3\2\2\2\u009a\u03f5\3\2"+
		"\2\2\u009c\u040b\3\2\2\2\u009e\u0418\3\2\2\2\u00a0\u041a\3\2\2\2\u00a2"+
		"\u0427\3\2\2\2\u00a4\u046e\3\2\2\2\u00a6\u048c\3\2\2\2\u00a8\u0498\3\2"+
		"\2\2\u00aa\u049c\3\2\2\2\u00ac\u04b2\3\2\2\2\u00ae\u04bb\3\2\2\2\u00b0"+
		"\u04be\3\2\2\2\u00b2\u04d7\3\2\2\2\u00b4\u04d9\3\2\2\2\u00b6\u04df\3\2"+
		"\2\2\u00b8\u04e3\3\2\2\2\u00ba\u04e5\3\2\2\2\u00bc\u04fe\3\2\2\2\u00be"+
		"\u051d\3\2\2\2\u00c0\u051f\3\2\2\2\u00c2\u052a\3\2\2\2\u00c4\u0535\3\2"+
		"\2\2\u00c6\u0540\3\2\2\2\u00c8\u054b\3\2\2\2\u00ca\u0556\3\2\2\2\u00cc"+
		"\u0562\3\2\2\2\u00ce\u056e\3\2\2\2\u00d0\u0579\3\2\2\2\u00d2\u0584\3\2"+
		"\2\2\u00d4\u0598\3\2\2\2\u00d6\u05a0\3\2\2\2\u00d8\u05a2\3\2\2\2\u00da"+
		"\u05ab\3\2\2\2\u00dc\u05ad\3\2\2\2\u00de\u05d2\3\2\2\2\u00e0\u05d4\3\2"+
		"\2\2\u00e2\u05e8\3\2\2\2\u00e4\u05ea\3\2\2\2\u00e6\u05f9\3\2\2\2\u00e8"+
		"\u05fb\3\2\2\2\u00ea\u0605\3\2\2\2\u00ec\u0607\3\2\2\2\u00ee\u061b\3\2"+
		"\2\2\u00f0\u064a\3\2\2\2\u00f2\u066c\3\2\2\2\u00f4\u0689\3\2\2\2\u00f6"+
		"\u0695\3\2\2\2\u00f8\u0697\3\2\2\2\u00fa\u0699\3\2\2\2\u00fc\u06a7\3\2"+
		"\2\2\u00fe\u06b2\3\2\2\2\u0100\u06b7\3\2\2\2\u0102\u06d6\3\2\2\2\u0104"+
		"\u06f5\3\2\2\2\u0106\u010e\5v<\2\u0107\u010e\5\u0092J\2\u0108\u010e\5"+
		"j\66\2\u0109\u010e\5\6\4\2\u010a\u010e\5\4\3\2\u010b\u010e\5:\36\2\u010c"+
		"\u010e\5h\65\2\u010d\u0106\3\2\2\2\u010d\u0107\3\2\2\2\u010d\u0108\3\2"+
		"\2\2\u010d\u0109\3\2\2\2\u010d\u010a\3\2\2\2\u010d\u010b\3\2\2\2\u010d"+
		"\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\3\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113\7\\\2\2\u0113\u0114"+
		"\7]\2\2\u0114\u0115\5\u00b2Z\2\u0115\u0116\7\3\2\2\u0116\5\3\2\2\2\u0117"+
		"\u011a\5\b\5\2\u0118\u011a\5\26\f\2\u0119\u0117\3\2\2\2\u0119\u0118\3"+
		"\2\2\2\u011a\7\3\2\2\2\u011b\u0120\5\n\6\2\u011c\u0120\5\f\7\2\u011d\u0120"+
		"\5\16\b\2\u011e\u0120\5\20\t\2\u011f\u011b\3\2\2\2\u011f\u011c\3\2\2\2"+
		"\u011f\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120\t\3\2\2\2\u0121\u0122\7"+
		"e\2\2\u0122\u0123\5\22\n\2\u0123\u0124\b\6\1\2\u0124\13\3\2\2\2\u0125"+
		"\u0126\7f\2\2\u0126\u0127\5\22\n\2\u0127\u0128\b\7\1\2\u0128\r\3\2\2\2"+
		"\u0129\u012a\7g\2\2\u012a\17\3\2\2\2\u012b\u012c\7h\2\2\u012c\21\3\2\2"+
		"\2\u012d\u0134\5\24\13\2\u012e\u012f\7\4\2\2\u012f\u0130\5\24\13\2\u0130"+
		"\u0131\7\5\2\2\u0131\u0134\3\2\2\2\u0132\u0134\5\36\20\2\u0133\u012d\3"+
		"\2\2\2\u0133\u012e\3\2\2\2\u0133\u0132\3\2\2\2\u0134\23\3\2\2\2\u0135"+
		"\u0148\5\u00ba^\2\u0136\u0137\5\u00a4S\2\u0137\u013b\5\u00fc\177\2\u0138"+
		"\u013a\7C\2\2\u0139\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2"+
		"\2\2\u013b\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e"+
		"\u0142\7\6\2\2\u013f\u0141\7C\2\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2"+
		"\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144"+
		"\u0142\3\2\2\2\u0145\u0146\5\u00bc_\2\u0146\u0148\3\2\2\2\u0147\u0135"+
		"\3\2\2\2\u0147\u0136\3\2\2\2\u0148\25\3\2\2\2\u0149\u0153\5\30\r\2\u014a"+
		"\u0153\5\32\16\2\u014b\u0153\5&\24\2\u014c\u0153\5(\25\2\u014d\u0153\5"+
		".\30\2\u014e\u0153\5\60\31\2\u014f\u0153\5\66\34\2\u0150\u0153\58\35\2"+
		"\u0151\u0153\5$\23\2\u0152\u0149\3\2\2\2\u0152\u014a\3\2\2\2\u0152\u014b"+
		"\3\2\2\2\u0152\u014c\3\2\2\2\u0152\u014d\3\2\2\2\u0152\u014e\3\2\2\2\u0152"+
		"\u014f\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153\27\3\2\2"+
		"\2\u0154\u0155\7i\2\2\u0155\u0156\5\34\17\2\u0156\u0157\5\"\22\2\u0157"+
		"\u015b\3\2\2\2\u0158\u0159\7i\2\2\u0159\u015b\5\34\17\2\u015a\u0154\3"+
		"\2\2\2\u015a\u0158\3\2\2\2\u015b\31\3\2\2\2\u015c\u015d\7j\2\2\u015d\u015e"+
		"\5\34\17\2\u015e\33\3\2\2\2\u015f\u0164\5\u00b2Z\2\u0160\u0161\7\4\2\2"+
		"\u0161\u0162\5 \21\2\u0162\u0163\7\5\2\2\u0163\u0165\3\2\2\2\u0164\u0160"+
		"\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0170\3\2\2\2\u0166\u0170\5\36\20\2"+
		"\u0167\u0170\7u\2\2\u0168\u016d\7\7\2\2\u0169\u016a\7\4\2\2\u016a\u016b"+
		"\5 \21\2\u016b\u016c\7\5\2\2\u016c\u016e\3\2\2\2\u016d\u0169\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f\u015f\3\2\2\2\u016f\u0166\3\2"+
		"\2\2\u016f\u0167\3\2\2\2\u016f\u0168\3\2\2\2\u0170\35\3\2\2\2\u0171\u0172"+
		"\t\2\2\2\u0172\37\3\2\2\2\u0173\u0176\5\u00b2Z\2\u0174\u0176\7E\2\2\u0175"+
		"\u0173\3\2\2\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u017e\3\2"+
		"\2\2\u0177\u017a\7\17\2\2\u0178\u017b\5\u00b2Z\2\u0179\u017b\7E\2\2\u017a"+
		"\u0178\3\2\2\2\u017a\u0179\3\2\2\2\u017b\u017d\3\2\2\2\u017c\u0177\3\2"+
		"\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"!\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0184\5\u00ba^\2\u0182\u0184\b\22"+
		"\1\2\u0183\u0181\3\2\2\2\u0183\u0182\3\2\2\2\u0184#\3\2\2\2\u0185\u0186"+
		"\5\34\17\2\u0186\u019f\7\4\2\2\u0187\u018a\5\u00ba^\2\u0188\u018a\5\u00a4"+
		"S\2\u0189\u0187\3\2\2\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018c\3\2\2\2\u018b\u018d\7C\2\2\u018c\u018b\3\2\2\2\u018c\u018d\3\2"+
		"\2\2\u018d\u0198\3\2\2\2\u018e\u0190\7\17\2\2\u018f\u0191\7C\2\2\u0190"+
		"\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0195\5\u00ba"+
		"^\2\u0193\u0195\5\u00a4S\2\u0194\u0192\3\2\2\2\u0194\u0193\3\2\2\2\u0195"+
		"\u0197\3\2\2\2\u0196\u018e\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2"+
		"\2\2\u0198\u0199\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019b"+
		"\u019d\7\17\2\2\u019c\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u01a0\3"+
		"\2\2\2\u019e\u01a0\7S\2\2\u019f\u0189\3\2\2\2\u019f\u019e\3\2\2\2\u01a0"+
		"\u01a1\3\2\2\2\u01a1\u01a2\7\5\2\2\u01a2%\3\2\2\2\u01a3\u01a4\7k\2\2\u01a4"+
		"\u01a7\7\177\2\2\u01a5\u01a7\7k\2\2\u01a6\u01a3\3\2\2\2\u01a6\u01a5\3"+
		"\2\2\2\u01a7\'\3\2\2\2\u01a8\u01aa\7l\2\2\u01a9\u01ab\7\177\2\2\u01aa"+
		"\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01be\3\2\2\2\u01ac\u01ad\7t"+
		"\2\2\u01ad\u01ae\7\4\2\2\u01ae\u01b0\7\4\2\2\u01af\u01b1\5*\26\2\u01b0"+
		"\u01af\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\7\5"+
		"\2\2\u01b3\u01be\7\5\2\2\u01b4\u01be\7\20\2\2\u01b5\u01be\7\21\2\2\u01b6"+
		"\u01be\7\22\2\2\u01b7\u01b8\7\23\2\2\u01b8\u01ba\7\4\2\2\u01b9\u01bb\5"+
		"*\26\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		"\u01be\7\5\2\2\u01bd\u01a8\3\2\2\2\u01bd\u01ac\3\2\2\2\u01bd\u01b4\3\2"+
		"\2\2\u01bd\u01b5\3\2\2\2\u01bd\u01b6\3\2\2\2\u01bd\u01b7\3\2\2\2\u01be"+
		")\3\2\2\2\u01bf\u01c4\5,\27\2\u01c0\u01c1\7\17\2\2\u01c1\u01c3\5,\27\2"+
		"\u01c2\u01c0\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5"+
		"\3\2\2\2\u01c5+\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01e4\5\34\17\2\u01c8"+
		"\u01c9\5\34\17\2\u01c9\u01ca\7\4\2\2\u01ca\u01cf\5\u00b2Z\2\u01cb\u01cc"+
		"\7\17\2\2\u01cc\u01ce\5\u00ba^\2\u01cd\u01cb\3\2\2\2\u01ce\u01d1\3\2\2"+
		"\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d2\3\2\2\2\u01d1\u01cf"+
		"\3\2\2\2\u01d2\u01d3\7\5\2\2\u01d3\u01e4\3\2\2\2\u01d4\u01d5\5\34\17\2"+
		"\u01d5\u01d7\7\4\2\2\u01d6\u01d8\5\u00ba^\2\u01d7\u01d6\3\2\2\2\u01d7"+
		"\u01d8\3\2\2\2\u01d8\u01dd\3\2\2\2\u01d9\u01da\7\17\2\2\u01da\u01dc\5"+
		"\u00ba^\2\u01db\u01d9\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2\2\2"+
		"\u01dd\u01de\3\2\2\2\u01de\u01e0\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e1"+
		"\7\5\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e4\5B\"\2\u01e3\u01c7\3\2\2\2\u01e3"+
		"\u01c8\3\2\2\2\u01e3\u01d4\3\2\2\2\u01e3\u01e2\3\2\2\2\u01e4-\3\2\2\2"+
		"\u01e5\u01e6\7m\2\2\u01e6\u01eb\5\62\32\2\u01e7\u01e8\7m\2\2\u01e8\u01eb"+
		"\5\34\17\2\u01e9\u01eb\7m\2\2\u01ea\u01e5\3\2\2\2\u01ea\u01e7\3\2\2\2"+
		"\u01ea\u01e9\3\2\2\2\u01eb/\3\2\2\2\u01ec\u01ed\7n\2\2\u01ed\u01f2\5\62"+
		"\32\2\u01ee\u01ef\7n\2\2\u01ef\u01f2\5\34\17\2\u01f0\u01f2\7n\2\2\u01f1"+
		"\u01ec\3\2\2\2\u01f1\u01ee\3\2\2\2\u01f1\u01f0\3\2\2\2\u01f2\61\3\2\2"+
		"\2\u01f3\u01f4\5\64\33\2\u01f4\63\3\2\2\2\u01f5\u01f6\7\177\2\2\u01f6"+
		"\65\3\2\2\2\u01f7\u01f8\7o\2\2\u01f8\u01f9\7z\2\2\u01f9\u0206\7\177\2"+
		"\2\u01fa\u01fb\7o\2\2\u01fb\u01fc\7z\2\2\u01fc\u0206\5\34\17\2\u01fd\u01fe"+
		"\7o\2\2\u01fe\u01ff\5\34\17\2\u01ff\u0200\7\177\2\2\u0200\u0206\3\2\2"+
		"\2\u0201\u0202\7o\2\2\u0202\u0206\5\34\17\2\u0203\u0204\7o\2\2\u0204\u0206"+
		"\7z\2\2\u0205\u01f7\3\2\2\2\u0205\u01fa\3\2\2\2\u0205\u01fd\3\2\2\2\u0205"+
		"\u0201\3\2\2\2\u0205\u0203\3\2\2\2\u0206\67\3\2\2\2\u0207\u0209\7p\2\2"+
		"\u0208\u020a\7q\2\2\u0209\u0208\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b"+
		"\3\2\2\2\u020b\u020c\7r\2\2\u020c\u020d\7\177\2\2\u020d\u021c\b\35\1\2"+
		"\u020e\u0210\7p\2\2\u020f\u0211\7q\2\2\u0210\u020f\3\2\2\2\u0210\u0211"+
		"\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0216\7r\2\2\u0213\u0215\5\u00b2Z\2"+
		"\u0214\u0213\3\2\2\2\u0215\u0218\3\2\2\2\u0216\u0214\3\2\2\2\u0216\u0217"+
		"\3\2\2\2\u0217\u021c\3\2\2\2\u0218\u0216\3\2\2\2\u0219\u021a\7p\2\2\u021a"+
		"\u021c\b\35\1\2\u021b\u0207\3\2\2\2\u021b\u020e\3\2\2\2\u021b\u0219\3"+
		"\2\2\2\u021c9\3\2\2\2\u021d\u021e\7}\2\2\u021e;\3\2\2\2\u021f\u0220\7"+
		"C\2\2\u0220=\3\2\2\2\u0221\u0222\t\3\2\2\u0222?\3\2\2\2\u0223\u0224\t"+
		"\4\2\2\u0224A\3\2\2\2\u0225\u0242\7y\2\2\u0226\u0242\7{\2\2\u0227\u0242"+
		"\7z\2\2\u0228\u022c\7\177\2\2\u0229\u022b\7C\2\2\u022a\u0229\3\2\2\2\u022b"+
		"\u022e\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u0232\3\2"+
		"\2\2\u022e\u022c\3\2\2\2\u022f\u0231\7}\2\2\u0230\u022f\3\2\2\2\u0231"+
		"\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0238\3\2"+
		"\2\2\u0234\u0232\3\2\2\2\u0235\u0237\7C\2\2\u0236\u0235\3\2\2\2\u0237"+
		"\u023a\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023c\3\2"+
		"\2\2\u023a\u0238\3\2\2\2\u023b\u0228\3\2\2\2\u023c\u023d\3\2\2\2\u023d"+
		"\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0242\3\2\2\2\u023f\u0242\7~"+
		"\2\2\u0240\u0242\7|\2\2\u0241\u0225\3\2\2\2\u0241\u0226\3\2\2\2\u0241"+
		"\u0227\3\2\2\2\u0241\u023b\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0240\3\2"+
		"\2\2\u0242C\3\2\2\2\u0243\u0244\t\5\2\2\u0244E\3\2\2\2\u0245\u0246\t\6"+
		"\2\2\u0246G\3\2\2\2\u0247\u0248\t\7\2\2\u0248I\3\2\2\2\u0249\u024c\t\b"+
		"\2\2\u024a\u024b\7\37\2\2\u024b\u024d\7 \2\2\u024c\u024a\3\2\2\2\u024c"+
		"\u024d\3\2\2\2\u024d\u0277\3\2\2\2\u024e\u0277\7\26\2\2\u024f\u0277\7"+
		"\27\2\2\u0250\u0277\7\25\2\2\u0251\u0277\7!\2\2\u0252\u0277\7\"\2\2\u0253"+
		"\u0277\7#\2\2\u0254\u0277\7\24\2\2\u0255\u0277\7$\2\2\u0256\u0277\7\30"+
		"\2\2\u0257\u0277\7\31\2\2\u0258\u0277\7\6\2\2\u0259\u0277\7\32\2\2\u025a"+
		"\u0277\7\33\2\2\u025b\u0277\7%\2\2\u025c\u0277\7&\2\2\u025d\u0277\7\'"+
		"\2\2\u025e\u0277\7(\2\2\u025f\u0277\7)\2\2\u0260\u0277\7*\2\2\u0261\u0277"+
		"\7+\2\2\u0262\u0277\7,\2\2\u0263\u0277\7-\2\2\u0264\u0277\7.\2\2\u0265"+
		"\u0277\7/\2\2\u0266\u0277\7\60\2\2\u0267\u0277\7\61\2\2\u0268\u0277\7"+
		"\62\2\2\u0269\u0277\7\34\2\2\u026a\u0277\7\35\2\2\u026b\u0277\7\63\2\2"+
		"\u026c\u0277\7\64\2\2\u026d\u0277\7\65\2\2\u026e\u0277\7\66\2\2\u026f"+
		"\u0277\7\17\2\2\u0270\u0277\7\67\2\2\u0271\u0277\78\2\2\u0272\u0273\7"+
		"\4\2\2\u0273\u0277\7\5\2\2\u0274\u0275\7\37\2\2\u0275\u0277\7 \2\2\u0276"+
		"\u0249\3\2\2\2\u0276\u024e\3\2\2\2\u0276\u024f\3\2\2\2\u0276\u0250\3\2"+
		"\2\2\u0276\u0251\3\2\2\2\u0276\u0252\3\2\2\2\u0276\u0253\3\2\2\2\u0276"+
		"\u0254\3\2\2\2\u0276\u0255\3\2\2\2\u0276\u0256\3\2\2\2\u0276\u0257\3\2"+
		"\2\2\u0276\u0258\3\2\2\2\u0276\u0259\3\2\2\2\u0276\u025a\3\2\2\2\u0276"+
		"\u025b\3\2\2\2\u0276\u025c\3\2\2\2\u0276\u025d\3\2\2\2\u0276\u025e\3\2"+
		"\2\2\u0276\u025f\3\2\2\2\u0276\u0260\3\2\2\2\u0276\u0261\3\2\2\2\u0276"+
		"\u0262\3\2\2\2\u0276\u0263\3\2\2\2\u0276\u0264\3\2\2\2\u0276\u0265\3\2"+
		"\2\2\u0276\u0266\3\2\2\2\u0276\u0267\3\2\2\2\u0276\u0268\3\2\2\2\u0276"+
		"\u0269\3\2\2\2\u0276\u026a\3\2\2\2\u0276\u026b\3\2\2\2\u0276\u026c\3\2"+
		"\2\2\u0276\u026d\3\2\2\2\u0276\u026e\3\2\2\2\u0276\u026f\3\2\2\2\u0276"+
		"\u0270\3\2\2\2\u0276\u0271\3\2\2\2\u0276\u0272\3\2\2\2\u0276\u0274\3\2"+
		"\2\2\u0277K\3\2\2\2\u0278\u0279\t\t\2\2\u0279M\3\2\2\2\u027a\u027b\t\n"+
		"\2\2\u027bO\3\2\2\2\u027c\u027d\7b\2\2\u027d\u027e\7\32\2\2\u027e\u027f"+
		"\5R*\2\u027f\u0280\7\33\2\2\u0280Q\3\2\2\2\u0281\u0282\7\32\2\2\u0282"+
		"\u0283\5R*\2\u0283\u0284\7\33\2\2\u0284\u028b\3\2\2\2\u0285\u0286\7\4"+
		"\2\2\u0286\u0287\5R*\2\u0287\u0288\7\5\2\2\u0288\u028b\3\2\2\2\u0289\u028b"+
		"\5Z.\2\u028a\u0281\3\2\2\2\u028a\u0285\3\2\2\2\u028a\u0289\3\2\2\2\u028b"+
		"\u028c\3\2\2\2\u028c\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028dS\3\2\2\2"+
		"\u028e\u028f\n\13\2\2\u028fU\3\2\2\2\u0290\u0291\n\f\2\2\u0291W\3\2\2"+
		"\2\u0292\u0293\n\r\2\2\u0293Y\3\2\2\2\u0294\u0295\n\16\2\2\u0295[\3\2"+
		"\2\2\u0296\u0297\n\17\2\2\u0297]\3\2\2\2\u0298\u0299\n\20\2\2\u0299_\3"+
		"\2\2\2\u029a\u029b\n\21\2\2\u029ba\3\2\2\2\u029c\u029d\n\22\2\2\u029d"+
		"c\3\2\2\2\u029e\u029f\n\23\2\2\u029fe\3\2\2\2\u02a0\u02a1\n\f\2\2\u02a1"+
		"g\3\2\2\2\u02a2\u02a3\13\2\2\2\u02a3i\3\2\2\2\u02a4\u02a9\5l\67\2\u02a5"+
		"\u02a9\5n8\2\u02a6\u02a9\5p9\2\u02a7\u02a9\5t;\2\u02a8\u02a4\3\2\2\2\u02a8"+
		"\u02a5\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a8\u02a7\3\2\2\2\u02a9k\3\2\2\2"+
		"\u02aa\u02ab\5\34\17\2\u02ab\u02ac\7\17\2\2\u02ac\u02ae\3\2\2\2\u02ad"+
		"\u02aa\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02ad\3\2\2\2\u02af\u02b0\3\2"+
		"\2\2\u02b0m\3\2\2\2\u02b1\u02b2\7W\2\2\u02b2\u02b4\79\2\2\u02b3\u02b5"+
		"\7w\2\2\u02b4\u02b3\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5o\3\2\2\2\u02b6\u02b8"+
		"\5$\23\2\u02b7\u02b9\7C\2\2\u02b8\u02b7\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9"+
		"\u02bb\3\2\2\2\u02ba\u02bc\5\34\17\2\u02bb\u02ba\3\2\2\2\u02bb\u02bc\3"+
		"\2\2\2\u02bc\u02be\3\2\2\2\u02bd\u02bf\7C\2\2\u02be\u02bd\3\2\2\2\u02be"+
		"\u02bf\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c2\5$\23\2\u02c1\u02c3\7C"+
		"\2\2\u02c2\u02c1\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4"+
		"\u02c5\5\u009aN\2\u02c5q\3\2\2\2\u02c6\u02c7\7\7\2\2\u02c7\u02c8\7\4\2"+
		"\2\u02c8\u02c9\5\u008cG\2\u02c9\u02ca\7\5\2\2\u02cas\3\2\2\2\u02cb\u02cc"+
		"\7u\2\2\u02ccu\3\2\2\2\u02cd\u02cf\5P)\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf"+
		"\3\2\2\2\u02cf\u02d1\3\2\2\2\u02d0\u02d2\5x=\2\u02d1\u02d0\3\2\2\2\u02d1"+
		"\u02d2\3\2\2\2\u02d2\u02d7\3\2\2\2\u02d3\u02d5\5(\25\2\u02d4\u02d6\7C"+
		"\2\2\u02d5\u02d4\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d8\3\2\2\2\u02d7"+
		"\u02d3\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02db\5\u008c"+
		"G\2\u02da\u02dc\7C\2\2\u02db\u02da\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd"+
		"\3\2\2\2\u02dd\u02df\5z>\2\u02de\u02e0\5\u0084C\2\u02df\u02de\3\2\2\2"+
		"\u02df\u02e0\3\2\2\2\u02e0\u02e2\3\2\2\2\u02e1\u02e3\7C\2\2\u02e2\u02e1"+
		"\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e5\5\u0082B"+
		"\2\u02e5w\3\2\2\2\u02e6\u02e8\5D#\2\u02e7\u02e9\7C\2\2\u02e8\u02e7\3\2"+
		"\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02eb\3\2\2\2\u02ea\u02e6\3\2\2\2\u02eb"+
		"\u02ee\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ef\3\2"+
		"\2\2\u02ee\u02ec\3\2\2\2\u02ef\u02f0\5\u00a4S\2\u02f0\u02f7\3\2\2\2\u02f1"+
		"\u02f3\5F$\2\u02f2\u02f4\7C\2\2\u02f3\u02f2\3\2\2\2\u02f3\u02f4\3\2\2"+
		"\2\u02f4\u02f6\3\2\2\2\u02f5\u02f1\3\2\2\2\u02f6\u02f9\3\2\2\2\u02f7\u02f5"+
		"\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02ff\3\2\2\2\u02f9\u02f7\3\2\2\2\u02fa"+
		"\u02fc\5$\23\2\u02fb\u02fd\7C\2\2\u02fc\u02fb\3\2\2\2\u02fc\u02fd\3\2"+
		"\2\2\u02fd\u02ff\3\2\2\2\u02fe\u02ec\3\2\2\2\u02fe\u02fa\3\2\2\2\u02ff"+
		"y\3\2\2\2\u0300\u0302\7\4\2\2\u0301\u0303\5|?\2\u0302\u0301\3\2\2\2\u0302"+
		"\u0303\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0306\7\5\2\2\u0305\u0307\7\25"+
		"\2\2\u0306\u0305\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u030e\3\2\2\2\u0308"+
		"\u030a\7V\2\2\u0309\u030b\7C\2\2\u030a\u0309\3\2\2\2\u030a\u030b\3\2\2"+
		"\2\u030b\u030d\3\2\2\2\u030c\u0308\3\2\2\2\u030d\u0310\3\2\2\2\u030e\u030c"+
		"\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0312\3\2\2\2\u0310\u030e\3\2\2\2\u0311"+
		"\u0313\5\u008eH\2\u0312\u0311\3\2\2\2\u0312\u0313\3\2\2\2\u0313{\3\2\2"+
		"\2\u0314\u031c\5~@\2\u0315\u0317\7\17\2\2\u0316\u0318\7C\2\2\u0317\u0316"+
		"\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031b\5~@\2\u031a"+
		"\u0315\3\2\2\2\u031b\u031e\3\2\2\2\u031c\u031a\3\2\2\2\u031c\u031d\3\2"+
		"\2\2\u031d\u0324\3\2\2\2\u031e\u031c\3\2\2\2\u031f\u0321\7\17\2\2\u0320"+
		"\u0322\7C\2\2\u0321\u0320\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0323\3\2"+
		"\2\2\u0323\u0325\7E\2\2\u0324\u031f\3\2\2\2\u0324\u0325\3\2\2\2\u0325"+
		"}\3\2\2\2\u0326\u032b\7S\2\2\u0327\u0328\5\u00a8U\2\u0328\u0329\5\u0080"+
		"A\2\u0329\u032b\3\2\2\2\u032a\u0326\3\2\2\2\u032a\u0327\3\2\2\2\u032b"+
		"\177\3\2\2\2\u032c\u032e\5\u00b6\\\2\u032d\u032c\3\2\2\2\u032d\u032e\3"+
		"\2\2\2\u032e\u0334\3\2\2\2\u032f\u0330\7\4\2\2\u0330\u0331\5\u0080A\2"+
		"\u0331\u0332\7\5\2\2\u0332\u0335\3\2\2\2\u0333\u0335\5\u00aaV\2\u0334"+
		"\u032f\3\2\2\2\u0334\u0333\3\2\2\2\u0335\u0337\3\2\2\2\u0336\u0338\5\u00fe"+
		"\u0080\2\u0337\u0336\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u0081\3\2\2\2\u0339"+
		"\u033a\7w\2\2\u033a\u033b\bB\1\2\u033b\u0083\3\2\2\2\u033c\u033d\7:\2"+
		"\2\u033d\u0342\5\u0086D\2\u033e\u033f\7\17\2\2\u033f\u0341\5\u0086D\2"+
		"\u0340\u033e\3\2\2\2\u0341\u0344\3\2\2\2\u0342\u0340\3\2\2\2\u0342\u0343"+
		"\3\2\2\2\u0343\u0085\3\2\2\2\u0344\u0342\3\2\2\2\u0345\u0346\5\u0088E"+
		"\2\u0346\u0347\5\u008aF\2\u0347\u0087\3\2\2\2\u0348\u034a\7;\2\2\u0349"+
		"\u0348\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u034c\5\u00b2"+
		"Z\2\u034c\u0089\3\2\2\2\u034d\u034f\7\4\2\2\u034e\u0350\5\u00ba^\2\u034f"+
		"\u034e\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u0352\7\5"+
		"\2\2\u0352\u008b\3\2\2\2\u0353\u0354\7\4\2\2\u0354\u0355\5\u008cG\2\u0355"+
		"\u0356\7\5\2\2\u0356\u035b\3\2\2\2\u0357\u035b\5\u00b2Z\2\u0358\u0359"+
		"\7a\2\2\u0359\u035b\5J&\2\u035a\u0353\3\2\2\2\u035a\u0357\3\2\2\2\u035a"+
		"\u0358\3\2\2\2\u035b\u008d\3\2\2\2\u035c\u035d\7[\2\2\u035d\u035e\7\4"+
		"\2\2\u035e\u035f\5\u0090I\2\u035f\u0360\7\5\2\2\u0360\u008f\3\2\2\2\u0361"+
		"\u0363\5T+\2\u0362\u0361\3\2\2\2\u0363\u0366\3\2\2\2\u0364\u0362\3\2\2"+
		"\2\u0364\u0365\3\2\2\2\u0365\u0372\3\2\2\2\u0366\u0364\3\2\2\2\u0367\u0368"+
		"\7\4\2\2\u0368\u0369\5\u0090I\2\u0369\u036d\7\5\2\2\u036a\u036c\5T+\2"+
		"\u036b\u036a\3\2\2\2\u036c\u036f\3\2\2\2\u036d\u036b\3\2\2\2\u036d\u036e"+
		"\3\2\2\2\u036e\u0371\3\2\2\2\u036f\u036d\3\2\2\2\u0370\u0367\3\2\2\2\u0371"+
		"\u0374\3\2\2\2\u0372\u0370\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0091\3\2"+
		"\2\2\u0374\u0372\3\2\2\2\u0375\u0376\5\u0094K\2\u0376\u0093\3\2\2\2\u0377"+
		"\u0379\5P)\2\u0378\u0377\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037a\3\2\2"+
		"\2\u037a\u037c\5\u009cO\2\u037b\u037d\5\u009aN\2\u037c\u037b\3\2\2\2\u037c"+
		"\u037d\3\2\2\2\u037d\u03be\3\2\2\2\u037e\u0380\7Q\2\2\u037f\u0381\7C\2"+
		"\2\u0380\u037f\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0383\3\2\2\2\u0382\u037e"+
		"\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0385\3\2\2\2\u0384\u0386\5P)\2\u0385"+
		"\u0384\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u0388\5\u00a4"+
		"S\2\u0388\u0389\5\u009aN\2\u0389\u03be\3\2\2\2\u038a\u038c\7Q\2\2\u038b"+
		"\u038d\7C\2\2\u038c\u038b\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u038f\3\2"+
		"\2\2\u038e\u038a\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u0390\3\2\2\2\u0390"+
		"\u0391\5\u00a4S\2\u0391\u0393\7\4\2\2\u0392\u0394\5\u0096L\2\u0393\u0392"+
		"\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u0396\5F$\2\u0396"+
		"\u0397\5\u00b2Z\2\u0397\u0398\7\5\2\2\u0398\u039a\5\u00acW\2\u0399\u039b"+
		"\7C\2\2\u039a\u0399\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u039d\3\2\2\2\u039c"+
		"\u039e\5(\25\2\u039d\u039c\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u039f\3\2"+
		"\2\2\u039f\u03a0\7\3\2\2\u03a0\u03be\3\2\2\2\u03a1\u03a3\7V\2\2\u03a2"+
		"\u03a4\7C\2\2\u03a3\u03a2\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a6\3\2"+
		"\2\2\u03a5\u03a1\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03ab\3\2\2\2\u03a7"+
		"\u03a9\5D#\2\u03a8\u03aa\7C\2\2\u03a9\u03a8\3\2\2\2\u03a9\u03aa\3\2\2"+
		"\2\u03aa\u03ac\3\2\2\2\u03ab\u03a7\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03b1"+
		"\3\2\2\2\u03ad\u03af\7Q\2\2\u03ae\u03b0\7C\2\2\u03af\u03ae\3\2\2\2\u03af"+
		"\u03b0\3\2\2\2\u03b0\u03b2\3\2\2\2\u03b1\u03ad\3\2\2\2\u03b1\u03b2\3\2"+
		"\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b5\5\u0098M\2\u03b4\u03b6\7C\2\2\u03b5"+
		"\u03b4\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b8\3\2\2\2\u03b7\u03b9\5\u009a"+
		"N\2\u03b8\u03b7\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03bb\3\2\2\2\u03ba"+
		"\u03bc\7\3\2\2\u03bb\u03ba\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03be\3\2"+
		"\2\2\u03bd\u0378\3\2\2\2\u03bd\u0382\3\2\2\2\u03bd\u038e\3\2\2\2\u03bd"+
		"\u03a5\3\2\2\2\u03be\u0095\3\2\2\2\u03bf\u03c1\7v\2\2\u03c0\u03bf\3\2"+
		"\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c0\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3"+
		"\u0097\3\2\2\2\u03c4\u03c6\7`\2\2\u03c5\u03c7\7C\2\2\u03c6\u03c5\3\2\2"+
		"\2\u03c6\u03c7\3\2\2\2\u03c7\u03c9\3\2\2\2\u03c8\u03ca\5(\25\2\u03c9\u03c8"+
		"\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cf\3\2\2\2\u03cb\u03cd\5\u00b2Z"+
		"\2\u03cc\u03ce\7C\2\2\u03cd\u03cc\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03d0"+
		"\3\2\2\2\u03cf\u03cb\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d2\3\2\2\2\u03d1"+
		"\u03d3\5(\25\2\u03d2\u03d1\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d4\3\2"+
		"\2\2\u03d4\u03d5\7w\2\2\u03d5\u03f4\bM\1\2\u03d6\u03d8\7`\2\2\u03d7\u03d9"+
		"\7C\2\2\u03d8\u03d7\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9\u03db\3\2\2\2\u03da"+
		"\u03dc\5(\25\2\u03db\u03da\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03dd\3\2"+
		"\2\2\u03dd\u03df\5\u00b2Z\2\u03de\u03e0\7C\2\2\u03df\u03de\3\2\2\2\u03df"+
		"\u03e0\3\2\2\2\u03e0\u03e2\3\2\2\2\u03e1\u03e3\5\u00b6\\\2\u03e2\u03e1"+
		"\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03e6\5\u00b2Z"+
		"\2\u03e5\u03e7\5\u00b6\\\2\u03e6\u03e5\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7"+
		"\u03e8\3\2\2\2\u03e8\u03e9\7\6\2\2\u03e9\u03ea\bM\1\2\u03ea\u03f4\3\2"+
		"\2\2\u03eb\u03ed\7`\2\2\u03ec\u03ee\7C\2\2\u03ed\u03ec\3\2\2\2\u03ed\u03ee"+
		"\3\2\2\2\u03ee\u03f0\3\2\2\2\u03ef\u03f1\5(\25\2\u03f0\u03ef\3\2\2\2\u03f0"+
		"\u03f1\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f4\5\u00b2Z\2\u03f3\u03c4"+
		"\3\2\2\2\u03f3\u03d6\3\2\2\2\u03f3\u03eb\3\2\2\2\u03f4\u0099\3\2\2\2\u03f5"+
		"\u0400\5\u00fa~\2\u03f6\u03f8\7C\2\2\u03f7\u03f6\3\2\2\2\u03f7\u03f8\3"+
		"\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fb\7\17\2\2\u03fa\u03fc\7C\2\2\u03fb"+
		"\u03fa\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u03ff\5\u00fa"+
		"~\2\u03fe\u03f7\3\2\2\2\u03ff\u0402\3\2\2\2\u0400\u03fe\3\2\2\2\u0400"+
		"\u0401\3\2\2\2\u0401\u0404\3\2\2\2\u0402\u0400\3\2\2\2\u0403\u0405\7C"+
		"\2\2\u0404\u0403\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0407\3\2\2\2\u0406"+
		"\u0408\5(\25\2\u0407\u0406\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u0409\3\2"+
		"\2\2\u0409\u040a\7\3\2\2\u040a\u009b\3\2\2\2\u040b\u040d\7c\2\2\u040c"+
		"\u040e\7C\2\2\u040d\u040c\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u0410\3\2"+
		"\2\2\u040f\u0411\5\u009eP\2\u0410\u040f\3\2\2\2\u0410\u0411\3\2\2\2\u0411"+
		"\u0413\3\2\2\2\u0412\u0414\5\u00a0Q\2\u0413\u0412\3\2\2\2\u0413\u0414"+
		"\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0416\7w\2\2\u0416\u0417\bO\1\2\u0417"+
		"\u009d\3\2\2\2\u0418\u0419\5\u00b2Z\2\u0419\u009f\3\2\2\2\u041a\u041b"+
		"\7:\2\2\u041b\u0420\5\u00a2R\2\u041c\u041d\7\17\2\2\u041d\u041f\5\u00a2"+
		"R\2\u041e\u041c\3\2\2\2\u041f\u0422\3\2\2\2\u0420\u041e\3\2\2\2\u0420"+
		"\u0421\3\2\2\2\u0421\u00a1\3\2\2\2\u0422\u0420\3\2\2\2\u0423\u0425\7X"+
		"\2\2\u0424\u0426\7C\2\2\u0425\u0424\3\2\2\2\u0425\u0426\3\2\2\2\u0426"+
		"\u0428\3\2\2\2\u0427\u0423\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u042a\3\2"+
		"\2\2\u0429\u042b\5H%\2\u042a\u0429\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u042c"+
		"\3\2\2\2\u042c\u042d\5\u00b2Z\2\u042d\u00a3\3\2\2\2\u042e\u0430\7W\2\2"+
		"\u042f\u0431\7C\2\2\u0430\u042f\3\2\2\2\u0430\u0431\3\2\2\2\u0431\u0433"+
		"\3\2\2\2\u0432\u042e\3\2\2\2\u0432\u0433\3\2\2\2\u0433\u0443\3\2\2\2\u0434"+
		"\u0444\5D#\2\u0435\u0437\7V\2\2\u0436\u0438\7C\2\2\u0437\u0436\3\2\2\2"+
		"\u0437\u0438\3\2\2\2\u0438\u0444\3\2\2\2\u0439\u043b\7T\2\2\u043a\u043c"+
		"\7C\2\2\u043b\u043a\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u0444\3\2\2\2\u043d"+
		"\u043f\7U\2\2\u043e\u0440\7C\2\2\u043f\u043e\3\2\2\2\u043f\u0440\3\2\2"+
		"\2\u0440\u0444\3\2\2\2\u0441\u0444\5F$\2\u0442\u0444\5\u00a6T\2\u0443"+
		"\u0434\3\2\2\2\u0443\u0435\3\2\2\2\u0443\u0439\3\2\2\2\u0443\u043d\3\2"+
		"\2\2\u0443\u0441\3\2\2\2\u0443\u0442\3\2\2\2\u0444\u0445\3\2\2\2\u0445"+
		"\u0443\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u044b\3\2\2\2\u0447\u0448\7\32"+
		"\2\2\u0448\u0449\5R*\2\u0449\u044a\7\33\2\2\u044a\u044c\3\2\2\2\u044b"+
		"\u0447\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u0457\3\2\2\2\u044d\u044e\7;"+
		"\2\2\u044e\u0453\5\u00a6T\2\u044f\u0450\7\32\2\2\u0450\u0451\5R*\2\u0451"+
		"\u0452\7\33\2\2\u0452\u0454\3\2\2\2\u0453\u044f\3\2\2\2\u0453\u0454\3"+
		"\2\2\2\u0454\u0456\3\2\2\2\u0455\u044d\3\2\2\2\u0456\u0459\3\2\2\2\u0457"+
		"\u0455\3\2\2\2\u0457\u0458\3\2\2\2\u0458\u046a\3\2\2\2\u0459\u0457\3\2"+
		"\2\2\u045a\u0469\5D#\2\u045b\u045d\7V\2\2\u045c\u045e\7C\2\2\u045d\u045c"+
		"\3\2\2\2\u045d\u045e\3\2\2\2\u045e\u0469\3\2\2\2\u045f\u0461\7T\2\2\u0460"+
		"\u0462\7C\2\2\u0461\u0460\3\2\2\2\u0461\u0462\3\2\2\2\u0462\u0469\3\2"+
		"\2\2\u0463\u0465\7U\2\2\u0464\u0466\7C\2\2\u0465\u0464\3\2\2\2\u0465\u0466"+
		"\3\2\2\2\u0466\u0469\3\2\2\2\u0467\u0469\5F$\2\u0468\u045a\3\2\2\2\u0468"+
		"\u045b\3\2\2\2\u0468\u045f\3\2\2\2\u0468\u0463\3\2\2\2\u0468\u0467\3\2"+
		"\2\2\u0469\u046c\3\2\2\2\u046a\u0468\3\2\2\2\u046a\u046b\3\2\2\2\u046b"+
		"\u046f\3\2\2\2\u046c\u046a\3\2\2\2\u046d\u046f\5$\23\2\u046e\u0432\3\2"+
		"\2\2\u046e\u046d\3\2\2\2\u046f\u00a5\3\2\2\2\u0470\u0472\7S\2\2\u0471"+
		"\u0473\7C\2\2\u0472\u0471\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u048d\3\2"+
		"\2\2\u0474\u0476\7\16\2\2\u0475\u0477\7C\2\2\u0476\u0475\3\2\2\2\u0476"+
		"\u0477\3\2\2\2\u0477\u048d\3\2\2\2\u0478\u047a\7<\2\2\u0479\u047b\7C\2"+
		"\2\u047a\u0479\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u048d\3\2\2\2\u047c\u047e"+
		"\7=\2\2\u047d\u047f\7C\2\2\u047e\u047d\3\2\2\2\u047e\u047f\3\2\2\2\u047f"+
		"\u048d\3\2\2\2\u0480\u0482\7`\2\2\u0481\u0483\7C\2\2\u0482\u0481\3\2\2"+
		"\2\u0482\u0483\3\2\2\2\u0483\u048d\3\2\2\2\u0484\u0486\7c\2\2\u0485\u0487"+
		"\7C\2\2\u0486\u0485\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u048d\3\2\2\2\u0488"+
		"\u048a\7v\2\2\u0489\u048b\7C\2\2\u048a\u0489\3\2\2\2\u048a\u048b\3\2\2"+
		"\2\u048b\u048d\3\2\2\2\u048c\u0470\3\2\2\2\u048c\u0474\3\2\2\2\u048c\u0478"+
		"\3\2\2\2\u048c\u047c\3\2\2\2\u048c\u0480\3\2\2\2\u048c\u0484\3\2\2\2\u048c"+
		"\u0488\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u048c\3\2\2\2\u048e\u048f\3\2"+
		"\2\2\u048f\u00a7\3\2\2\2\u0490\u0492\7^\2\2\u0491\u0493\7C\2\2\u0492\u0491"+
		"\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0499\3\2\2\2\u0494\u0496\7_\2\2\u0495"+
		"\u0497\7C\2\2\u0496\u0495\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u0499\3\2"+
		"\2\2\u0498\u0490\3\2\2\2\u0498\u0494\3\2\2\2\u0498\u0499\3\2\2\2\u0499"+
		"\u049a\3\2\2\2\u049a\u049b\5\u00a4S\2\u049b\u00a9\3\2\2\2\u049c\u049e"+
		"\5\u00b2Z\2\u049d\u049f\7C\2\2\u049e\u049d\3\2\2\2\u049e\u049f\3\2\2\2"+
		"\u049f\u00ab\3\2\2\2\u04a0\u04a1\7\4\2\2\u04a1\u04a2\7S\2\2\u04a2\u04b3"+
		"\7\5\2\2\u04a3\u04af\7\4\2\2\u04a4\u04ac\5\u00aeX\2\u04a5\u04a7\7\17\2"+
		"\2\u04a6\u04a8\7C\2\2\u04a7\u04a6\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u04a9"+
		"\3\2\2\2\u04a9\u04ab\5\u00aeX\2\u04aa\u04a5\3\2\2\2\u04ab\u04ae\3\2\2"+
		"\2\u04ac\u04aa\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad\u04b0\3\2\2\2\u04ae\u04ac"+
		"\3\2\2\2\u04af\u04a4\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1"+
		"\u04b3\7\5\2\2\u04b2\u04a0\3\2\2\2\u04b2\u04a3\3\2\2\2\u04b3\u00ad\3\2"+
		"\2\2\u04b4\u04b6\5\u00a8U\2\u04b5\u04b7\7C\2\2\u04b6\u04b5\3\2\2\2\u04b6"+
		"\u04b7\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04b9\5\u00b0Y\2\u04b9\u04bc"+
		"\3\2\2\2\u04ba\u04bc\7E\2\2\u04bb\u04b4\3\2\2\2\u04bb\u04ba\3\2\2\2\u04bc"+
		"\u00af\3\2\2\2\u04bd\u04bf\5\u00b6\\\2\u04be\u04bd\3\2\2\2\u04be\u04bf"+
		"\3\2\2\2\u04bf\u04c7\3\2\2\2\u04c0\u04c1\7\4\2\2\u04c1\u04c2\5\u00b0Y"+
		"\2\u04c2\u04c3\7\5\2\2\u04c3\u04c8\3\2\2\2\u04c4\u04c6\5\u00aaV\2\u04c5"+
		"\u04c4\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6\u04c8\3\2\2\2\u04c7\u04c0\3\2"+
		"\2\2\u04c7\u04c5\3\2\2\2\u04c8\u04ca\3\2\2\2\u04c9\u04cb\5\u00fe\u0080"+
		"\2\u04ca\u04c9\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u00b1\3\2\2\2\u04cc\u04d1"+
		"\7v\2\2\u04cd\u04ce\7;\2\2\u04ce\u04d0\7v\2\2\u04cf\u04cd\3\2\2\2\u04d0"+
		"\u04d3\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d8\3\2"+
		"\2\2\u04d3\u04d1\3\2\2\2\u04d4\u04d8\7d\2\2\u04d5\u04d8\7r\2\2\u04d6\u04d8"+
		"\5H%\2\u04d7\u04cc\3\2\2\2\u04d7\u04d4\3\2\2\2\u04d7\u04d5\3\2\2\2\u04d7"+
		"\u04d6\3\2\2\2\u04d8\u00b3\3\2\2\2\u04d9\u04da\t\24\2\2\u04da\u00b5\3"+
		"\2\2\2\u04db\u04dd\5F$\2\u04dc\u04de\7>\2\2\u04dd\u04dc\3\2\2\2\u04dd"+
		"\u04de\3\2\2\2\u04de\u04e0\3\2\2\2\u04df\u04db\3\2\2\2\u04e0\u04e1\3\2"+
		"\2\2\u04e1\u04df\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2\u00b7\3\2\2\2\u04e3"+
		"\u04e4\5\u00b6\\\2\u04e4\u00b9\3\2\2\2\u04e5\u04ea\5\u00bc_\2\u04e6\u04e7"+
		"\7D\2\2\u04e7\u04e9\7C\2\2\u04e8\u04e6\3\2\2\2\u04e9\u04ec\3\2\2\2\u04ea"+
		"\u04e8\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04f5\3\2\2\2\u04ec\u04ea\3\2"+
		"\2\2\u04ed\u04ef\7C\2\2\u04ee\u04ed\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef"+
		"\u04f0\3\2\2\2\u04f0\u04f2\7\17\2\2\u04f1\u04f3\7C\2\2\u04f2\u04f1\3\2"+
		"\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4\u04f6\5\u00ba^\2\u04f5"+
		"\u04ee\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6\u04fb\3\2\2\2\u04f7\u04f8\7D"+
		"\2\2\u04f8\u04fa\7C\2\2\u04f9\u04f7\3\2\2\2\u04fa\u04fd\3\2\2\2\u04fb"+
		"\u04f9\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u00bb\3\2\2\2\u04fd\u04fb\3\2"+
		"\2\2\u04fe\u0508\5\u00be`\2\u04ff\u0501\7C\2\2\u0500\u04ff\3\2\2\2\u0500"+
		"\u0501\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0504\5L\'\2\u0503\u0505\7C\2"+
		"\2\u0504\u0503\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u0507"+
		"\5\u00bc_\2\u0507\u0509\3\2\2\2\u0508\u0500\3\2\2\2\u0508\u0509\3\2\2"+
		"\2\u0509\u00bd\3\2\2\2\u050a\u051e\5\u00c0a\2\u050b\u050d\5\u00c0a\2\u050c"+
		"\u050e\7C\2\2\u050d\u050c\3\2\2\2\u050d\u050e\3\2\2\2\u050e\u050f\3\2"+
		"\2\2\u050f\u0511\7?\2\2\u0510\u0512\7C\2\2\u0511\u0510\3\2\2\2\u0511\u0512"+
		"\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0515\5\u00ba^\2\u0514\u0516\7C\2\2"+
		"\u0515\u0514\3\2\2\2\u0515\u0516\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u0519"+
		"\7:\2\2\u0518\u051a\7C\2\2\u0519\u0518\3\2\2\2\u0519\u051a\3\2\2\2\u051a"+
		"\u051b\3\2\2\2\u051b\u051c\5\u00be`\2\u051c\u051e\3\2\2\2\u051d\u050a"+
		"\3\2\2\2\u051d\u050b\3\2\2\2\u051e\u00bf\3\2\2\2\u051f\u0528\5\u00c2b"+
		"\2\u0520\u0522\7C\2\2\u0521\u0520\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u0523"+
		"\3\2\2\2\u0523\u0525\7\64\2\2\u0524\u0526\7C\2\2\u0525\u0524\3\2\2\2\u0525"+
		"\u0526\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u0529\5\u00c0a\2\u0528\u0521"+
		"\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u00c1\3\2\2\2\u052a\u0533\5\u00c4c"+
		"\2\u052b\u052d\7C\2\2\u052c\u052b\3\2\2\2\u052c\u052d\3\2\2\2\u052d\u052e"+
		"\3\2\2\2\u052e\u0530\7\63\2\2\u052f\u0531\7C\2\2\u0530\u052f\3\2\2\2\u0530"+
		"\u0531\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0534\5\u00c2b\2\u0533\u052c"+
		"\3\2\2\2\u0533\u0534\3\2\2\2\u0534\u00c3\3\2\2\2\u0535\u053e\5\u00c6d"+
		"\2\u0536\u0538\7C\2\2\u0537\u0536\3\2\2\2\u0537\u0538\3\2\2\2\u0538\u0539"+
		"\3\2\2\2\u0539\u053b\7$\2\2\u053a\u053c\7C\2\2\u053b\u053a\3\2\2\2\u053b"+
		"\u053c\3\2\2\2\u053c\u053d\3\2\2\2\u053d\u053f\5\u00c4c\2\u053e\u0537"+
		"\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u00c5\3\2\2\2\u0540\u0549\5\u00c8e"+
		"\2\u0541\u0543\7C\2\2\u0542\u0541\3\2\2\2\u0542\u0543\3\2\2\2\u0543\u0544"+
		"\3\2\2\2\u0544\u0546\7#\2\2\u0545\u0547\7C\2\2\u0546\u0545\3\2\2\2\u0546"+
		"\u0547\3\2\2\2\u0547\u0548\3\2\2\2\u0548\u054a\5\u00c6d\2\u0549\u0542"+
		"\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u00c7\3\2\2\2\u054b\u0554\5\u00caf"+
		"\2\u054c\u054e\7C\2\2\u054d\u054c\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u054f"+
		"\3\2\2\2\u054f\u0551\7\24\2\2\u0550\u0552\7C\2\2\u0551\u0550\3\2\2\2\u0551"+
		"\u0552\3\2\2\2\u0552\u0553\3\2\2\2\u0553\u0555\5\u00c8e\2\u0554\u054d"+
		"\3\2\2\2\u0554\u0555\3\2\2\2\u0555\u00c9\3\2\2\2\u0556\u0560\5\u00ccg"+
		"\2\u0557\u0559\7C\2\2\u0558\u0557\3\2\2\2\u0558\u0559\3\2\2\2\u0559\u055a"+
		"\3\2\2\2\u055a\u055c\5N(\2\u055b\u055d\7C\2\2\u055c\u055b\3\2\2\2\u055c"+
		"\u055d\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u055f\5\u00caf\2\u055f\u0561"+
		"\3\2\2\2\u0560\u0558\3\2\2\2\u0560\u0561\3\2\2\2\u0561\u00cb\3\2\2\2\u0562"+
		"\u056c\5\u00ceh\2\u0563\u0565\7C\2\2\u0564\u0563\3\2\2\2\u0564\u0565\3"+
		"\2\2\2\u0565\u0566\3\2\2\2\u0566\u0568\5@!\2\u0567\u0569\7C\2\2\u0568"+
		"\u0567\3\2\2\2\u0568\u0569\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u056b\5\u00cc"+
		"g\2\u056b\u056d\3\2\2\2\u056c\u0564\3\2\2\2\u056c\u056d\3\2\2\2\u056d"+
		"\u00cd\3\2\2\2\u056e\u0577\5\u00d0i\2\u056f\u0571\7C\2\2\u0570\u056f\3"+
		"\2\2\2\u0570\u0571\3\2\2\2\u0571\u0572\3\2\2\2\u0572\u0574\t\25\2\2\u0573"+
		"\u0575\7C\2\2\u0574\u0573\3\2\2\2\u0574\u0575\3\2\2\2\u0575\u0576\3\2"+
		"\2\2\u0576\u0578\5\u00ceh\2\u0577\u0570\3\2\2\2\u0577\u0578\3\2\2\2\u0578"+
		"\u00cf\3\2\2\2\u0579\u0582\5\u00d2j\2\u057a\u057c\7C\2\2\u057b\u057a\3"+
		"\2\2\2\u057b\u057c\3\2\2\2\u057c\u057d\3\2\2\2\u057d\u057f\t\26\2\2\u057e"+
		"\u0580\7C\2\2\u057f\u057e\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u0581\3\2"+
		"\2\2\u0581\u0583\5\u00d0i\2\u0582\u057b\3\2\2\2\u0582\u0583\3\2\2\2\u0583"+
		"\u00d1\3\2\2\2\u0584\u058d\5\u00d4k\2\u0585\u0587\7C\2\2\u0586\u0585\3"+
		"\2\2\2\u0586\u0587\3\2\2\2\u0587\u0588\3\2\2\2\u0588\u058a\t\27\2\2\u0589"+
		"\u058b\7C\2\2\u058a\u0589\3\2\2\2\u058a\u058b\3\2\2\2\u058b\u058c\3\2"+
		"\2\2\u058c\u058e\5\u00d2j\2\u058d\u0586\3\2\2\2\u058d\u058e\3\2\2\2\u058e"+
		"\u00d3\3\2\2\2\u058f\u0590\7\4\2\2\u0590\u0591\5F$\2\u0591\u0592\5\u00b2"+
		"Z\2\u0592\u0593\7\5\2\2\u0593\u0594\7\4\2\2\u0594\u0595\5\u00f2z\2\u0595"+
		"\u0596\7\5\2\2\u0596\u0599\3\2\2\2\u0597\u0599\5\u00d6l\2\u0598\u058f"+
		"\3\2\2\2\u0598\u0597\3\2\2\2\u0599\u00d5\3\2\2\2\u059a\u059b\7\4\2\2\u059b"+
		"\u059c\5\u00d8m\2\u059c\u059d\7\5\2\2\u059d\u059e\5\u00d6l\2\u059e\u05a1"+
		"\3\2\2\2\u059f\u05a1\5\u00dan\2\u05a0\u059a\3\2\2\2\u05a0\u059f\3\2\2"+
		"\2\u05a1\u00d7\3\2\2\2\u05a2\u05a3\5\u00a4S\2\u05a3\u00d9\3\2\2\2\u05a4"+
		"\u05ac\5\u00dco\2\u05a5\u05ac\5\u00e0q\2\u05a6\u05ac\5\u00e2r\2\u05a7"+
		"\u05ac\5\u00dep\2\u05a8\u05ac\5\u00eex\2\u05a9\u05ac\5\u00e6t\2\u05aa"+
		"\u05ac\5$\23\2\u05ab\u05a4\3\2\2\2\u05ab\u05a5\3\2\2\2\u05ab\u05a6\3\2"+
		"\2\2\u05ab\u05a7\3\2\2\2\u05ab\u05a8\3\2\2\2\u05ab\u05a9\3\2\2\2\u05ab"+
		"\u05aa\3\2\2\2\u05ac\u00db\3\2\2\2\u05ad\u05ae\7\24\2\2\u05ae\u05af\5"+
		"\u00b2Z\2\u05af\u00dd\3\2\2\2\u05b0\u05b2\7;\2\2\u05b1\u05b0\3\2\2\2\u05b1"+
		"\u05b2\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3\u05b5\7d\2\2\u05b4\u05b6\7C\2"+
		"\2\u05b5\u05b4\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6\u05b7\3\2\2\2\u05b7\u05b9"+
		"\5\u00a4S\2\u05b8\u05ba\7C\2\2\u05b9\u05b8\3\2\2\2\u05b9\u05ba\3\2\2\2"+
		"\u05ba\u05bb\3\2\2\2\u05bb\u05bd\7\37\2\2\u05bc\u05be\5\u00be`\2\u05bd"+
		"\u05bc\3\2\2\2\u05bd\u05be\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u05c0\7 "+
		"\2\2\u05c0\u05d3\3\2\2\2\u05c1\u05c3\7;\2\2\u05c2\u05c1\3\2\2\2\u05c2"+
		"\u05c3\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4\u05c6\7d\2\2\u05c5\u05c7\7C\2"+
		"\2\u05c6\u05c5\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05c8\3\2\2\2\u05c8\u05ca"+
		"\5\u00a4S\2\u05c9\u05cb\7C\2\2\u05ca\u05c9\3\2\2\2\u05ca\u05cb\3\2\2\2"+
		"\u05cb\u05cc\3\2\2\2\u05cc\u05ce\7\4\2\2\u05cd\u05cf\5\u00ba^\2\u05ce"+
		"\u05cd\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u05d0\3\2\2\2\u05d0\u05d1\7\5"+
		"\2\2\u05d1\u05d3\3\2\2\2\u05d2\u05b1\3\2\2\2\u05d2\u05c2\3\2\2\2\u05d3"+
		"\u00df\3\2\2\2\u05d4\u05d6\5> \2\u05d5\u05d7\7C\2\2\u05d6\u05d5\3\2\2"+
		"\2\u05d6\u05d7\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8\u05d9\5\u00d6l\2\u05d9"+
		"\u00e1\3\2\2\2\u05da\u05dc\5\u00e4s\2\u05db\u05dd\7C\2\2\u05dc\u05db\3"+
		"\2\2\2\u05dc\u05dd\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u05df\7\4\2\2\u05df"+
		"\u05e0\5\u00e8u\2\u05e0\u05e1\7\5\2\2\u05e1\u05e9\3\2\2\2\u05e2\u05e4"+
		"\5\u00e4s\2\u05e3\u05e5\7C\2\2\u05e4\u05e3\3\2\2\2\u05e4\u05e5\3\2\2\2"+
		"\u05e5\u05e6\3\2\2\2\u05e6\u05e7\5\u00eav\2\u05e7\u05e9\3\2\2\2\u05e8"+
		"\u05da\3\2\2\2\u05e8\u05e2\3\2\2\2\u05e9\u00e3\3\2\2\2\u05ea\u05eb\7@"+
		"\2\2\u05eb\u00e5\3\2\2\2\u05ec\u05ee\7A\2\2\u05ed\u05ef\7C\2\2\u05ee\u05ed"+
		"\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef\u05f0\3\2\2\2\u05f0\u05f1\7\4\2\2\u05f1"+
		"\u05f2\5\u00ba^\2\u05f2\u05f3\7\5\2\2\u05f3\u05fa\3\2\2\2\u05f4\u05f6"+
		"\7A\2\2\u05f5\u05f7\7C\2\2\u05f6\u05f5\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7"+
		"\u05f8\3\2\2\2\u05f8\u05fa\5\u00ba^\2\u05f9\u05ec\3\2\2\2\u05f9\u05f4"+
		"\3\2\2\2\u05fa\u00e7\3\2\2\2\u05fb\u0602\5\u00a4S\2\u05fc\u05fe\7C\2\2"+
		"\u05fd\u05fc\3\2\2\2\u05fd\u05fe\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff\u0601"+
		"\5F$\2\u0600\u05fd\3\2\2\2\u0601\u0604\3\2\2\2\u0602\u0600\3\2\2\2\u0602"+
		"\u0603\3\2\2\2\u0603\u00e9\3\2\2\2\u0604\u0602\3\2\2\2\u0605\u0606\5\u00da"+
		"n\2\u0606\u00eb\3\2\2\2\u0607\u0608\t\30\2\2\u0608\u00ed\3\2\2\2\u0609"+
		"\u060b\bx\1\2\u060a\u060c\5\u00a4S\2\u060b\u060a\3\2\2\2\u060b\u060c\3"+
		"\2\2\2\u060c\u060d\3\2\2\2\u060d\u061c\5\u00f0y\2\u060e\u061c\5\u00f6"+
		"|\2\u060f\u0611\5F$\2\u0610\u060f\3\2\2\2\u0610\u0611\3\2\2\2\u0611\u0612"+
		"\3\2\2\2\u0612\u0614\5\u00ecw\2\u0613\u0615\7C\2\2\u0614\u0613\3\2\2\2"+
		"\u0614\u0615\3\2\2\2\u0615\u0617\3\2\2\2\u0616\u0618\5F$\2\u0617\u0616"+
		"\3\2\2\2\u0617\u0618\3\2\2\2\u0618\u0619\3\2\2\2\u0619\u061a\5\u00f6|"+
		"\2\u061a\u061c\3\2\2\2\u061b\u0609\3\2\2\2\u061b\u060e\3\2\2\2\u061b\u0610"+
		"\3\2\2\2\u061c\u0647\3\2\2\2\u061d\u061f\f\n\2\2\u061e\u0620\7C\2\2\u061f"+
		"\u061e\3\2\2\2\u061f\u0620\3\2\2\2\u0620\u0621\3\2\2\2\u0621\u0623\7\37"+
		"\2\2\u0622\u0624\5\u00ba^\2\u0623\u0622\3\2\2\2\u0623\u0624\3\2\2\2\u0624"+
		"\u0625\3\2\2\2\u0625\u0646\7 \2\2\u0626\u0628\f\t\2\2\u0627\u0629\7C\2"+
		"\2\u0628\u0627\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u062a\3\2\2\2\u062a\u062b"+
		"\7\4\2\2\u062b\u062c\5\u00f2z\2\u062c\u062d\7\5\2\2\u062d\u0646\3\2\2"+
		"\2\u062e\u062f\f\b\2\2\u062f\u0631\7B\2\2\u0630\u0632\7C\2\2\u0631\u0630"+
		"\3\2\2\2\u0631\u0632\3\2\2\2\u0632\u0634\3\2\2\2\u0633\u0635\7b\2\2\u0634"+
		"\u0633\3\2\2\2\u0634\u0635\3\2\2\2\u0635\u0636\3\2\2\2\u0636\u0646\5\u00b2"+
		"Z\2\u0637\u0638\f\7\2\2\u0638\u063a\78\2\2\u0639\u063b\7C\2\2\u063a\u0639"+
		"\3\2\2\2\u063a\u063b\3\2\2\2\u063b\u063d\3\2\2\2\u063c\u063e\7b\2\2\u063d"+
		"\u063c\3\2\2\2\u063d\u063e\3\2\2\2\u063e\u063f\3\2\2\2\u063f\u0646\5\u00b2"+
		"Z\2\u0640\u0642\f\6\2\2\u0641\u0643\7C\2\2\u0642\u0641\3\2\2\2\u0642\u0643"+
		"\3\2\2\2\u0643\u0644\3\2\2\2\u0644\u0646\5\u00ecw\2\u0645\u061d\3\2\2"+
		"\2\u0645\u0626\3\2\2\2\u0645\u062e\3\2\2\2\u0645\u0637\3\2\2\2\u0645\u0640"+
		"\3\2\2\2\u0646\u0649\3\2\2\2\u0647\u0645\3\2\2\2\u0647\u0648\3\2\2\2\u0648"+
		"\u00ef\3\2\2\2\u0649\u0647\3\2\2\2\u064a\u064c\7w\2\2\u064b\u064d\7C\2"+
		"\2\u064c\u064b\3\2\2\2\u064c\u064d\3\2\2\2\u064d\u0654\3\2\2\2\u064e\u0650"+
		"\7}\2\2\u064f\u0651\7C\2\2\u0650\u064f\3\2\2\2\u0650\u0651\3\2\2\2\u0651"+
		"\u0653\3\2\2\2\u0652\u064e\3\2\2\2\u0653\u0656\3\2\2\2\u0654\u0652\3\2"+
		"\2\2\u0654\u0655\3\2\2\2\u0655\u0658\3\2\2\2\u0656\u0654\3\2\2\2\u0657"+
		"\u0659\5\u00f2z\2\u0658\u0657\3\2\2\2\u0658\u0659\3\2\2\2\u0659\u065b"+
		"\3\2\2\2\u065a\u065c\7C\2\2\u065b\u065a\3\2\2\2\u065b\u065c\3\2\2\2\u065c"+
		"\u0663\3\2\2\2\u065d\u065f\7}\2\2\u065e\u0660\7C\2\2\u065f\u065e\3\2\2"+
		"\2\u065f\u0660\3\2\2\2\u0660\u0662\3\2\2\2\u0661\u065d\3\2\2\2\u0662\u0665"+
		"\3\2\2\2\u0663\u0661\3\2\2\2\u0663\u0664\3\2\2\2\u0664\u0666\3\2\2\2\u0665"+
		"\u0663\3\2\2\2\u0666\u0667\7x\2\2\u0667\u00f1\3\2\2\2\u0668\u066a\7C\2"+
		"\2\u0669\u0668\3\2\2\2\u0669\u066a\3\2\2\2\u066a\u066b\3\2\2\2\u066b\u066d"+
		"\5\u00f4{\2\u066c\u0669\3\2\2\2\u066c\u066d\3\2\2\2\u066d\u066f\3\2\2"+
		"\2\u066e\u0670\7C\2\2\u066f\u066e\3\2\2\2\u066f\u0670\3\2\2\2\u0670\u0683"+
		"\3\2\2\2\u0671\u0673\7\17\2\2\u0672\u0671\3\2\2\2\u0672\u0673\3\2\2\2"+
		"\u0673\u0675\3\2\2\2\u0674\u0676\7C\2\2\u0675\u0674\3\2\2\2\u0675\u0676"+
		"\3\2\2\2\u0676\u067d\3\2\2\2\u0677\u0679\7}\2\2\u0678\u067a\7C\2\2\u0679"+
		"\u0678\3\2\2\2\u0679\u067a\3\2\2\2\u067a\u067c\3\2\2\2\u067b\u0677\3\2"+
		"\2\2\u067c\u067f\3\2\2\2\u067d\u067b\3\2\2\2\u067d\u067e\3\2\2\2\u067e"+
		"\u0680\3\2\2\2\u067f\u067d\3\2\2\2\u0680\u0682\5\u00f4{\2\u0681\u0672"+
		"\3\2\2\2\u0682\u0685\3\2\2\2\u0683\u0681\3\2\2\2\u0683\u0684\3\2\2\2\u0684"+
		"\u0687\3\2\2\2\u0685\u0683\3\2\2\2\u0686\u0688\7\17\2\2\u0687\u0686\3"+
		"\2\2\2\u0687\u0688\3\2\2\2\u0688\u00f3\3\2\2\2\u0689\u068a\5\u00bc_\2"+
		"\u068a\u00f5\3\2\2\2\u068b\u068d\7B\2\2\u068c\u068b\3\2\2\2\u068c\u068d"+
		"\3\2\2\2\u068d\u068e\3\2\2\2\u068e\u0696\5\u00b2Z\2\u068f\u0696\5B\"\2"+
		"\u0690\u0696\5:\36\2\u0691\u0692\7\4\2\2\u0692\u0693\5\u00ba^\2\u0693"+
		"\u0694\7\5\2\2\u0694\u0696\3\2\2\2\u0695\u068c\3\2\2\2\u0695\u068f\3\2"+
		"\2\2\u0695\u0690\3\2\2\2\u0695\u0691\3\2\2\2\u0696\u00f7\3\2\2\2\u0697"+
		"\u0698\7\3\2\2\u0698\u00f9\3\2\2\2\u0699\u069b\5\u00fc\177\2\u069a\u069c"+
		"\7C\2\2\u069b\u069a\3\2\2\2\u069b\u069c\3\2\2\2\u069c\u06a4\3\2\2\2\u069d"+
		"\u069f\7\4\2\2\u069e\u06a0\5\u00ba^\2\u069f\u069e\3\2\2\2\u069f\u06a0"+
		"\3\2\2\2\u06a0\u06a1\3\2\2\2\u06a1\u06a5\7\5\2\2\u06a2\u06a3\7\6\2\2\u06a3"+
		"\u06a5\5\u0100\u0081\2\u06a4\u069d\3\2\2\2\u06a4\u06a2\3\2\2\2\u06a4\u06a5"+
		"\3\2\2\2\u06a5\u00fb\3\2\2\2\u06a6\u06a8\5\u00b6\\\2\u06a7\u06a6\3\2\2"+
		"\2\u06a7\u06a8\3\2\2\2\u06a8\u06a9\3\2\2\2\u06a9\u06ab\5\u00b2Z\2\u06aa"+
		"\u06ac\5\u00fe\u0080\2\u06ab\u06aa\3\2\2\2\u06ab\u06ac\3\2\2\2\u06ac\u00fd"+
		"\3\2\2\2\u06ad\u06ae\7\37\2\2\u06ae\u06af\5\u0104\u0083\2\u06af\u06b0"+
		"\7 \2\2\u06b0\u06b3\3\2\2\2\u06b1\u06b3\5\u00acW\2\u06b2\u06ad\3\2\2\2"+
		"\u06b2\u06b1\3\2\2\2\u06b3\u00ff\3\2\2\2\u06b4\u06b6\5d\63\2\u06b5\u06b4"+
		"\3\2\2\2\u06b6\u06b9\3\2\2\2\u06b7\u06b5\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8"+
		"\u06d0\3\2\2\2\u06b9\u06b7\3\2\2\2\u06ba\u06bb\7w\2\2\u06bb\u06bc\5\u0102"+
		"\u0082\2\u06bc\u06bd\7x\2\2\u06bd\u06c7\3\2\2\2\u06be\u06bf\7\4\2\2\u06bf"+
		"\u06c0\5\u0102\u0082\2\u06c0\u06c1\7\5\2\2\u06c1\u06c7\3\2\2\2\u06c2\u06c3"+
		"\7\37\2\2\u06c3\u06c4\5\u0102\u0082\2\u06c4\u06c5\7 \2\2\u06c5\u06c7\3"+
		"\2\2\2\u06c6\u06ba\3\2\2\2\u06c6\u06be\3\2\2\2\u06c6\u06c2\3\2\2\2\u06c7"+
		"\u06cb\3\2\2\2\u06c8\u06ca\5d\63\2\u06c9\u06c8\3\2\2\2\u06ca\u06cd\3\2"+
		"\2\2\u06cb\u06c9\3\2\2\2\u06cb\u06cc\3\2\2\2\u06cc\u06cf\3\2\2\2\u06cd"+
		"\u06cb\3\2\2\2\u06ce\u06c6\3\2\2\2\u06cf\u06d2\3\2\2\2\u06d0\u06ce\3\2"+
		"\2\2\u06d0\u06d1\3\2\2\2\u06d1\u0101\3\2\2\2\u06d2\u06d0\3\2\2\2\u06d3"+
		"\u06d5\5f\64\2\u06d4\u06d3\3\2\2\2\u06d5\u06d8\3\2\2\2\u06d6\u06d4\3\2"+
		"\2\2\u06d6\u06d7\3\2\2\2\u06d7\u06ef\3\2\2\2\u06d8\u06d6\3\2\2\2\u06d9"+
		"\u06da\7w\2\2\u06da\u06db\5\u0102\u0082\2\u06db\u06dc\7x\2\2\u06dc\u06e6"+
		"\3\2\2\2\u06dd\u06de\7\4\2\2\u06de\u06df\5\u0102\u0082\2\u06df\u06e0\7"+
		"\5\2\2\u06e0\u06e6\3\2\2\2\u06e1\u06e2\7\37\2\2\u06e2\u06e3\5\u0102\u0082"+
		"\2\u06e3\u06e4\7 \2\2\u06e4\u06e6\3\2\2\2\u06e5\u06d9\3\2\2\2\u06e5\u06dd"+
		"\3\2\2\2\u06e5\u06e1\3\2\2\2\u06e6\u06ea\3\2\2\2\u06e7\u06e9\5f\64\2\u06e8"+
		"\u06e7\3\2\2\2\u06e9\u06ec\3\2\2\2\u06ea\u06e8\3\2\2\2\u06ea\u06eb\3\2"+
		"\2\2\u06eb\u06ee\3\2\2\2\u06ec\u06ea\3\2\2\2\u06ed\u06e5\3\2\2\2\u06ee"+
		"\u06f1\3\2\2\2\u06ef\u06ed\3\2\2\2\u06ef\u06f0\3\2\2\2\u06f0\u0103\3\2"+
		"\2\2\u06f1\u06ef\3\2\2\2\u06f2\u06f4\5^\60\2\u06f3\u06f2\3\2\2\2\u06f4"+
		"\u06f7\3\2\2\2\u06f5\u06f3\3\2\2\2\u06f5\u06f6\3\2\2\2\u06f6\u0703\3\2"+
		"\2\2\u06f7\u06f5\3\2\2\2\u06f8\u06f9\7\37\2\2\u06f9\u06fa\5\u0104\u0083"+
		"\2\u06fa\u06fe\7 \2\2\u06fb\u06fd\5^\60\2\u06fc\u06fb\3\2\2\2\u06fd\u0700"+
		"\3\2\2\2\u06fe\u06fc\3\2\2\2\u06fe\u06ff\3\2\2\2\u06ff\u0702\3\2\2\2\u0700"+
		"\u06fe\3\2\2\2\u0701\u06f8\3\2\2\2\u0702\u0705\3\2\2\2\u0703\u0701\3\2"+
		"\2\2\u0703\u0704\3\2\2\2\u0704\u0105\3\2\2\2\u0705\u0703\3\2\2\2\u0127"+
		"\u010d\u010f\u0119\u011f\u0133\u013b\u0142\u0147\u0152\u015a\u0164\u016d"+
		"\u016f\u0175\u017a\u017e\u0183\u0189\u018c\u0190\u0194\u0198\u019c\u019f"+
		"\u01a6\u01aa\u01b0\u01ba\u01bd\u01c4\u01cf\u01d7\u01dd\u01e3\u01ea\u01f1"+
		"\u0205\u0209\u0210\u0216\u021b\u022c\u0232\u0238\u023d\u0241\u024c\u0276"+
		"\u028a\u028c\u02a8\u02af\u02b4\u02b8\u02bb\u02be\u02c2\u02ce\u02d1\u02d5"+
		"\u02d7\u02db\u02df\u02e2\u02e8\u02ec\u02f3\u02f7\u02fc\u02fe\u0302\u0306"+
		"\u030a\u030e\u0312\u0317\u031c\u0321\u0324\u032a\u032d\u0334\u0337\u0342"+
		"\u0349\u034f\u035a\u0364\u036d\u0372\u0378\u037c\u0380\u0382\u0385\u038c"+
		"\u038e\u0393\u039a\u039d\u03a3\u03a5\u03a9\u03ab\u03af\u03b1\u03b5\u03b8"+
		"\u03bb\u03bd\u03c2\u03c6\u03c9\u03cd\u03cf\u03d2\u03d8\u03db\u03df\u03e2"+
		"\u03e6\u03ed\u03f0\u03f3\u03f7\u03fb\u0400\u0404\u0407\u040d\u0410\u0413"+
		"\u0420\u0425\u0427\u042a\u0430\u0432\u0437\u043b\u043f\u0443\u0445\u044b"+
		"\u0453\u0457\u045d\u0461\u0465\u0468\u046a\u046e\u0472\u0476\u047a\u047e"+
		"\u0482\u0486\u048a\u048c\u048e\u0492\u0496\u0498\u049e\u04a7\u04ac\u04af"+
		"\u04b2\u04b6\u04bb\u04be\u04c5\u04c7\u04ca\u04d1\u04d7\u04dd\u04e1\u04ea"+
		"\u04ee\u04f2\u04f5\u04fb\u0500\u0504\u0508\u050d\u0511\u0515\u0519\u051d"+
		"\u0521\u0525\u0528\u052c\u0530\u0533\u0537\u053b\u053e\u0542\u0546\u0549"+
		"\u054d\u0551\u0554\u0558\u055c\u0560\u0564\u0568\u056c\u0570\u0574\u0577"+
		"\u057b\u057f\u0582\u0586\u058a\u058d\u0598\u05a0\u05ab\u05b1\u05b5\u05b9"+
		"\u05bd\u05c2\u05c6\u05ca\u05ce\u05d2\u05d6\u05dc\u05e4\u05e8\u05ee\u05f6"+
		"\u05f9\u05fd\u0602\u060b\u0610\u0614\u0617\u061b\u061f\u0623\u0628\u0631"+
		"\u0634\u063a\u063d\u0642\u0645\u0647\u064c\u0650\u0654\u0658\u065b\u065f"+
		"\u0663\u0669\u066c\u066f\u0672\u0675\u0679\u067d\u0683\u0687\u068c\u0695"+
		"\u069b\u069f\u06a4\u06a7\u06ab\u06b2\u06b7\u06c6\u06cb\u06d0\u06d6\u06e5"+
		"\u06ea\u06ef\u06f5\u06fe\u0703";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}