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
		T__59=60, IF=61, ELSE=62, FOR=63, WHILE=64, BREAK=65, CASE=66, CONTINUE=67, 
		SWITCH=68, DO=69, GOTO=70, RETURN=71, TYPEDEF=72, STATIC=73, VOID=74, 
		UNSIGNED=75, SIGNED=76, CV_QUALIFIER=77, EXTERN=78, VIRTUAL=79, TRY=80, 
		CATCH=81, THROW=82, USING=83, NAMESPACE=84, AUTO=85, REGISTER=86, SPECIAL_DATA=87, 
		OPERATOR=88, TEMPLATE=89, CLASS_KEY=90, NEW=91, PRE_IF=92, PRE_ELIF=93, 
		PRE_ELSE=94, PRE_ENDIF=95, PRE_DEFINE=96, PRE_UNDEF=97, PRE_DIAGNOSTIC=98, 
		PRE_OTHER=99, PRE_INCLUDE=100, PRE_INCLUDE_NEXT=101, PRE_LINE=102, PRE_PRAGMA=103, 
		PRE_GCC=104, PRE_PRAGMA_KEYWORDS=105, PRE_STR=106, PRE_ATTRIBUTE=107, 
		END_TEST=108, ALPHA_NUMERIC=109, OPENING_CURLY=110, CLOSING_CURLY=111, 
		HEX_LITERAL=112, DECIMAL_LITERAL=113, OCTAL_LITERAL=114, FLOATING_POINT_LITERAL=115, 
		COMMENT=116, CHAR=117, STRING=118, NEWLINE=119, ESCAPE=120, WHITESPACE=121, 
		ELLIPSIS=122, OTHER=123;
	public static final int
		RULE_code = 0, RULE_using_directive = 1, RULE_pre_statement = 2, RULE_pre_blockstarter = 3, 
		RULE_pre_if_statement = 4, RULE_pre_elif_statement = 5, RULE_pre_else_statement = 6, 
		RULE_pre_endif_statement = 7, RULE_pre_if_condition = 8, RULE_condition = 9, 
		RULE_pre_command = 10, RULE_pre_define = 11, RULE_pre_undef = 12, RULE_pre_macro_identifier = 13, 
		RULE_keyword = 14, RULE_pre_macro_parameters = 15, RULE_pre_macro = 16, 
		RULE_macroCall = 17, RULE_pre_diagnostic = 18, RULE_pre_other = 19, RULE_pre_include = 20, 
		RULE_pre_include_next = 21, RULE_pre_include_system_header = 22, RULE_pre_include_local_file = 23, 
		RULE_pre_include_filename = 24, RULE_pre_line = 25, RULE_pre_pragma = 26, 
		RULE_custom = 27, RULE_asciiTab = 28, RULE_externC = 29, RULE_macroFunctionPointer = 30, 
		RULE_testStart = 31, RULE_testEnd = 32, RULE_function_def = 33, RULE_return_type = 34, 
		RULE_function_param_list = 35, RULE_parameter_decl_clause = 36, RULE_parameter_decl = 37, 
		RULE_parameter_id = 38, RULE_compound_statement = 39, RULE_ctor_list = 40, 
		RULE_ctor_initializer = 41, RULE_initializer_id = 42, RULE_ctor_expr = 43, 
		RULE_function_name = 44, RULE_exception_specification = 45, RULE_type_id_list = 46, 
		RULE_simple_decl = 47, RULE_var_decl = 48, RULE_special_datatype = 49, 
		RULE_init_declarator_list = 50, RULE_initializer = 51, RULE_initializer_list = 52, 
		RULE_class_def = 53, RULE_class_name = 54, RULE_base_classes = 55, RULE_base_class = 56, 
		RULE_type_name = 57, RULE_base_type = 58, RULE_param_decl_specifiers = 59, 
		RULE_parameter_name = 60, RULE_param_type_list = 61, RULE_param_type = 62, 
		RULE_param_type_id = 63, RULE_identifier = 64, RULE_number = 65, RULE_ptrs = 66, 
		RULE_func_ptrs = 67, RULE_expr = 68, RULE_assign_expr = 69, RULE_conditional_expression = 70, 
		RULE_or_expression = 71, RULE_and_expression = 72, RULE_inclusive_or_expression = 73, 
		RULE_exclusive_or_expression = 74, RULE_bit_and_expression = 75, RULE_equality_expression = 76, 
		RULE_relational_expression = 77, RULE_shift_expression = 78, RULE_additive_expression = 79, 
		RULE_multiplicative_expression = 80, RULE_cast_expression = 81, RULE_cast_target = 82, 
		RULE_unary_expression = 83, RULE_new_expression = 84, RULE_unary_op_and_cast_expr = 85, 
		RULE_sizeof_expression = 86, RULE_sizeof = 87, RULE_defined_expression = 88, 
		RULE_sizeof_operand = 89, RULE_sizeof_operand2 = 90, RULE_inc_dec = 91, 
		RULE_postfix_expression = 92, RULE_function_argument_list = 93, RULE_function_argument = 94, 
		RULE_primary_expression = 95, RULE_comment = 96, RULE_newline = 97, RULE_unary_operator = 98, 
		RULE_relational_operator = 99, RULE_constant = 100, RULE_function_decl_specifiers = 101, 
		RULE_ptr_operator = 102, RULE_access_specifier = 103, RULE_operator = 104, 
		RULE_assignment_operator = 105, RULE_equality_operator = 106, RULE_template_decl_start = 107, 
		RULE_template_param_list = 108, RULE_no_brackets = 109, RULE_no_brackets_curlies_or_squares = 110, 
		RULE_no_brackets_or_semicolon = 111, RULE_no_angle_brackets_or_brackets = 112, 
		RULE_no_curlies = 113, RULE_no_squares = 114, RULE_no_squares_or_semicolon = 115, 
		RULE_no_comma_or_semicolon = 116, RULE_assign_water = 117, RULE_assign_water_l2 = 118, 
		RULE_water = 119, RULE_init_declarator = 120, RULE_declarator = 121, RULE_callingConvetion = 122, 
		RULE_type_suffix = 123, RULE_assign_expr_w_ = 124, RULE_assign_expr_w__l2 = 125, 
		RULE_constant_expr_w_ = 126;
	public static final String[] ruleNames = {
		"code", "using_directive", "pre_statement", "pre_blockstarter", "pre_if_statement", 
		"pre_elif_statement", "pre_else_statement", "pre_endif_statement", "pre_if_condition", 
		"condition", "pre_command", "pre_define", "pre_undef", "pre_macro_identifier", 
		"keyword", "pre_macro_parameters", "pre_macro", "macroCall", "pre_diagnostic", 
		"pre_other", "pre_include", "pre_include_next", "pre_include_system_header", 
		"pre_include_local_file", "pre_include_filename", "pre_line", "pre_pragma", 
		"custom", "asciiTab", "externC", "macroFunctionPointer", "testStart", 
		"testEnd", "function_def", "return_type", "function_param_list", "parameter_decl_clause", 
		"parameter_decl", "parameter_id", "compound_statement", "ctor_list", "ctor_initializer", 
		"initializer_id", "ctor_expr", "function_name", "exception_specification", 
		"type_id_list", "simple_decl", "var_decl", "special_datatype", "init_declarator_list", 
		"initializer", "initializer_list", "class_def", "class_name", "base_classes", 
		"base_class", "type_name", "base_type", "param_decl_specifiers", "parameter_name", 
		"param_type_list", "param_type", "param_type_id", "identifier", "number", 
		"ptrs", "func_ptrs", "expr", "assign_expr", "conditional_expression", 
		"or_expression", "and_expression", "inclusive_or_expression", "exclusive_or_expression", 
		"bit_and_expression", "equality_expression", "relational_expression", 
		"shift_expression", "additive_expression", "multiplicative_expression", 
		"cast_expression", "cast_target", "unary_expression", "new_expression", 
		"unary_op_and_cast_expr", "sizeof_expression", "sizeof", "defined_expression", 
		"sizeof_operand", "sizeof_operand2", "inc_dec", "postfix_expression", 
		"function_argument_list", "function_argument", "primary_expression", "comment", 
		"newline", "unary_operator", "relational_operator", "constant", "function_decl_specifiers", 
		"ptr_operator", "access_specifier", "operator", "assignment_operator", 
		"equality_operator", "template_decl_start", "template_param_list", "no_brackets", 
		"no_brackets_curlies_or_squares", "no_brackets_or_semicolon", "no_angle_brackets_or_brackets", 
		"no_curlies", "no_squares", "no_squares_or_semicolon", "no_comma_or_semicolon", 
		"assign_water", "assign_water_l2", "water", "init_declarator", "declarator", 
		"callingConvetion", "type_suffix", "assign_expr_w_", "assign_expr_w__l2", 
		"constant_expr_w_"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "'='", "'inline'", "'explicit'", "'friend'", 
		"'public'", "'private'", "'protected'", "'long'", "','", "'<'", "'>'", 
		"'.'", "'-'", "'/'", "'\"C\"'", "'START_TEST'", "'*'", "':'", "'::'", 
		"'char'", "'int'", "'restrict'", "'?'", "'||'", "'&&'", "'|'", "'^'", 
		"'&'", "'<<'", "'>>'", "'+'", "'%'", "'['", "']'", "'sizeof'", "'defined'", 
		"'--'", "'++'", "'->'", "'~'", "'!'", "'<='", "'>='", "'delete'", "'+='", 
		"'-='", "'*='", "'/='", "'%='", "'^='", "'&='", "'|='", "'>>='", "'<<='", 
		"'=='", "'!='", "'->*'", "'if'", "'else'", "'for'", "'while'", "'break'", 
		"'case'", "'continue'", "'switch'", "'do'", "'goto'", "'return'", "'typedef'", 
		"'static'", "'void'", "'unsigned'", "'signed'", null, "'extern'", "'virtual'", 
		"'try'", "'catch'", "'throw'", "'using'", "'namespace'", "'auto'", "'register'", 
		null, "'operator'", "'template'", "'class'", "'new'", null, null, null, 
		null, null, null, null, null, null, null, null, null, "'GCC'", null, null, 
		"'__attribute__'", "'END_TEST'", null, "'{'", "'}'", null, null, null, 
		null, null, null, null, null, "'\\'", null, "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "IF", "ELSE", "FOR", "WHILE", "BREAK", "CASE", "CONTINUE", "SWITCH", 
		"DO", "GOTO", "RETURN", "TYPEDEF", "STATIC", "VOID", "UNSIGNED", "SIGNED", 
		"CV_QUALIFIER", "EXTERN", "VIRTUAL", "TRY", "CATCH", "THROW", "USING", 
		"NAMESPACE", "AUTO", "REGISTER", "SPECIAL_DATA", "OPERATOR", "TEMPLATE", 
		"CLASS_KEY", "NEW", "PRE_IF", "PRE_ELIF", "PRE_ELSE", "PRE_ENDIF", "PRE_DEFINE", 
		"PRE_UNDEF", "PRE_DIAGNOSTIC", "PRE_OTHER", "PRE_INCLUDE", "PRE_INCLUDE_NEXT", 
		"PRE_LINE", "PRE_PRAGMA", "PRE_GCC", "PRE_PRAGMA_KEYWORDS", "PRE_STR", 
		"PRE_ATTRIBUTE", "END_TEST", "ALPHA_NUMERIC", "OPENING_CURLY", "CLOSING_CURLY", 
		"HEX_LITERAL", "DECIMAL_LITERAL", "OCTAL_LITERAL", "FLOATING_POINT_LITERAL", 
		"COMMENT", "CHAR", "STRING", "NEWLINE", "ESCAPE", "WHITESPACE", "ELLIPSIS", 
		"OTHER"
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
				    System.out.println("Found newline!");
				    //Parse both
				    consume();
				    consume();
				}
			}

			return true;
		}
	            
	       // this should go into FunctionGrammar but ANTLR fails
	       // to join the parser::members-section on inclusion
	       
	       //Find the closing #endif to the opening #if (and then return true), skip everything that is in between
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
	                
	                   //Count escape and newline characters, but dont parse them                    
	                  if(t == ESCAPE){
	                        slashStack.push(o);
	                        t = WHITESPACE; 
	                  } else if(t == NEWLINE) {
	                        slashStack.pop();
	                        t = WHITESPACE;
	                  }
	                                   
	                  //Consume and return the current symbol, move cursor to next symbol, the consumed symbol is added to the parse tree 
	                  consume();
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
		public List<Pre_statementContext> pre_statement() {
			return getRuleContexts(Pre_statementContext.class);
		}
		public Pre_statementContext pre_statement(int i) {
			return getRuleContext(Pre_statementContext.class,i);
		}
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
		public List<CustomContext> custom() {
			return getRuleContexts(CustomContext.class);
		}
		public CustomContext custom(int i) {
			return getRuleContext(CustomContext.class,i);
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
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << IF) | (1L << ELSE) | (1L << FOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				setState(261);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(254);
					pre_statement();
					}
					break;
				case 2:
					{
					setState(255);
					function_def();
					}
					break;
				case 3:
					{
					setState(256);
					simple_decl();
					}
					break;
				case 4:
					{
					setState(257);
					using_directive();
					}
					break;
				case 5:
					{
					setState(258);
					comment();
					}
					break;
				case 6:
					{
					setState(259);
					custom();
					}
					break;
				case 7:
					{
					setState(260);
					water();
					}
					break;
				}
				}
				setState(265);
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
			setState(266);
			match(USING);
			setState(267);
			match(NAMESPACE);
			setState(268);
			identifier();
			setState(269);
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
			setState(273);
			switch (_input.LA(1)) {
			case PRE_IF:
			case PRE_ELIF:
			case PRE_ELSE:
			case PRE_ENDIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				pre_blockstarter();
				}
				break;
			case PRE_DEFINE:
			case PRE_UNDEF:
			case PRE_DIAGNOSTIC:
			case PRE_OTHER:
			case PRE_INCLUDE:
			case PRE_INCLUDE_NEXT:
			case PRE_LINE:
			case PRE_PRAGMA:
			case PRE_ATTRIBUTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
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
			setState(279);
			switch (_input.LA(1)) {
			case PRE_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				pre_if_statement();
				}
				break;
			case PRE_ELIF:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				pre_elif_statement();
				}
				break;
			case PRE_ELSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				pre_else_statement();
				}
				break;
			case PRE_ENDIF:
				enterOuterAlt(_localctx, 4);
				{
				setState(278);
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
			setState(281);
			match(PRE_IF);
			setState(282);
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
			setState(285);
			match(PRE_ELIF);
			setState(286);
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
			setState(289);
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
			setState(291);
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
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				match(T__1);
				setState(295);
				condition();
				setState(296);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
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
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				type_name();
				setState(303);
				declarator();
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(304);
					match(NEWLINE);
					}
					}
					setState(309);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(310);
				match(T__3);
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(311);
					match(NEWLINE);
					}
					}
					setState(316);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(317);
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
			setState(329);
			switch (_input.LA(1)) {
			case PRE_DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				pre_define();
				}
				break;
			case PRE_UNDEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				pre_undef();
				}
				break;
			case PRE_DIAGNOSTIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				pre_diagnostic();
				}
				break;
			case PRE_OTHER:
			case PRE_ATTRIBUTE:
				enterOuterAlt(_localctx, 4);
				{
				setState(324);
				pre_other();
				}
				break;
			case PRE_INCLUDE:
				enterOuterAlt(_localctx, 5);
				{
				setState(325);
				pre_include();
				}
				break;
			case PRE_INCLUDE_NEXT:
				enterOuterAlt(_localctx, 6);
				{
				setState(326);
				pre_include_next();
				}
				break;
			case PRE_LINE:
				enterOuterAlt(_localctx, 7);
				{
				setState(327);
				pre_line();
				}
				break;
			case PRE_PRAGMA:
				enterOuterAlt(_localctx, 8);
				{
				setState(328);
				pre_pragma();
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
		public Pre_macro_parametersContext pre_macro_parameters() {
			return getRuleContext(Pre_macro_parametersContext.class,0);
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
				setState(331);
				match(PRE_DEFINE);
				setState(332);
				pre_macro_identifier();
				setState(333);
				match(T__1);
				setState(334);
				pre_macro_parameters();
				setState(335);
				match(T__2);
				setState(336);
				pre_macro();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				match(PRE_DEFINE);
				setState(339);
				pre_macro_identifier();
				setState(340);
				pre_macro();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
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
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
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
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(351);
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
			setState(354);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (STATIC - 73)) | (1L << (VOID - 73)) | (1L << (UNSIGNED - 73)) | (1L << (SIGNED - 73)) | (1L << (VIRTUAL - 73)) | (1L << (OPERATOR - 73)) | (1L << (CLASS_KEY - 73)))) != 0)) ) {
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
			setState(358);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case T__9:
			case NEW:
			case ALPHA_NUMERIC:
				{
				setState(356);
				identifier();
				}
				break;
			case ELLIPSIS:
				{
				setState(357);
				match(ELLIPSIS);
				}
				break;
			case T__2:
			case T__11:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(360);
				match(T__11);
				setState(363);
				switch (_input.LA(1)) {
				case T__7:
				case T__8:
				case T__9:
				case NEW:
				case ALPHA_NUMERIC:
					{
					setState(361);
					identifier();
					}
					break;
				case ELLIPSIS:
					{
					setState(362);
					match(ELLIPSIS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(369);
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
			enterOuterAlt(_localctx, 1);
			{
			 preProcFindMacroEnd(); 
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
		public List<Type_nameContext> type_name() {
			return getRuleContexts(Type_nameContext.class);
		}
		public Type_nameContext type_name(int i) {
			return getRuleContext(Type_nameContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			pre_macro_identifier();
			setState(373);
			match(T__1);
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__15) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__30) | (1L << T__33) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (STATIC - 73)) | (1L << (VOID - 73)) | (1L << (UNSIGNED - 73)) | (1L << (SIGNED - 73)) | (1L << (CV_QUALIFIER - 73)) | (1L << (EXTERN - 73)) | (1L << (VIRTUAL - 73)) | (1L << (SPECIAL_DATA - 73)) | (1L << (OPERATOR - 73)) | (1L << (CLASS_KEY - 73)) | (1L << (NEW - 73)) | (1L << (ALPHA_NUMERIC - 73)) | (1L << (HEX_LITERAL - 73)) | (1L << (DECIMAL_LITERAL - 73)) | (1L << (OCTAL_LITERAL - 73)) | (1L << (FLOATING_POINT_LITERAL - 73)) | (1L << (CHAR - 73)) | (1L << (STRING - 73)) | (1L << (NEWLINE - 73)))) != 0)) {
					{
					setState(379);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(374);
						match(T__11);
						}
						break;
					case 2:
						{
						setState(375);
						type_name();
						}
						break;
					case 3:
						{
						setState(376);
						expr();
						}
						break;
					case 4:
						{
						setState(377);
						ptr_operator();
						}
						break;
					case 5:
						{
						setState(378);
						match(NEWLINE);
						}
						break;
					}
					}
					setState(383);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(384);
				match(VOID);
				}
				break;
			}
			setState(387);
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
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				match(PRE_DIAGNOSTIC);
				setState(390);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
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
		public List<Pre_macro_identifierContext> pre_macro_identifier() {
			return getRuleContexts(Pre_macro_identifierContext.class);
		}
		public Pre_macro_identifierContext pre_macro_identifier(int i) {
			return getRuleContext(Pre_macro_identifierContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
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
			setState(425);
			switch (_input.LA(1)) {
			case PRE_OTHER:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				match(PRE_OTHER);
				setState(396);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(395);
					match(STRING);
					}
					break;
				}
				}
				break;
			case PRE_ATTRIBUTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				match(PRE_ATTRIBUTE);
				setState(399);
				match(T__1);
				setState(400);
				match(T__1);
				setState(402);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (STATIC - 73)) | (1L << (VOID - 73)) | (1L << (UNSIGNED - 73)) | (1L << (SIGNED - 73)) | (1L << (VIRTUAL - 73)) | (1L << (OPERATOR - 73)) | (1L << (CLASS_KEY - 73)) | (1L << (NEW - 73)) | (1L << (ALPHA_NUMERIC - 73)) | (1L << (HEX_LITERAL - 73)) | (1L << (DECIMAL_LITERAL - 73)) | (1L << (OCTAL_LITERAL - 73)) | (1L << (FLOATING_POINT_LITERAL - 73)) | (1L << (CHAR - 73)) | (1L << (STRING - 73)))) != 0)) {
					{
					setState(401);
					pre_macro_identifier();
					}
				}

				setState(405);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(404);
					match(NEWLINE);
					}
				}

				setState(421);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(407);
					match(T__1);
					setState(408);
					pre_macro_identifier();
					setState(416);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__11) {
						{
						{
						setState(409);
						match(T__11);
						setState(411);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(410);
							match(NEWLINE);
							}
						}

						setState(413);
						pre_macro_identifier();
						}
						}
						setState(418);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(419);
					match(T__2);
					}
				}

				setState(423);
				match(T__2);
				setState(424);
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

	public static class Pre_includeContext extends ParserRuleContext {
		public TerminalNode PRE_INCLUDE() { return getToken(ModuleParser.PRE_INCLUDE, 0); }
		public Pre_include_system_headerContext pre_include_system_header() {
			return getRuleContext(Pre_include_system_headerContext.class,0);
		}
		public Pre_macro_identifierContext pre_macro_identifier() {
			return getRuleContext(Pre_macro_identifierContext.class,0);
		}
		public Pre_include_local_fileContext pre_include_local_file() {
			return getRuleContext(Pre_include_local_fileContext.class,0);
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
		enterRule(_localctx, 40, RULE_pre_include);
		try {
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				match(PRE_INCLUDE);
				setState(428);
				pre_include_system_header();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				match(PRE_INCLUDE);
				setState(430);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(431);
				match(PRE_INCLUDE);
				setState(432);
				pre_include_local_file();
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
		public Pre_include_system_headerContext pre_include_system_header() {
			return getRuleContext(Pre_include_system_headerContext.class,0);
		}
		public Pre_macro_identifierContext pre_macro_identifier() {
			return getRuleContext(Pre_macro_identifierContext.class,0);
		}
		public Pre_include_local_fileContext pre_include_local_file() {
			return getRuleContext(Pre_include_local_fileContext.class,0);
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
		enterRule(_localctx, 42, RULE_pre_include_next);
		try {
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				match(PRE_INCLUDE_NEXT);
				setState(436);
				pre_include_system_header();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				match(PRE_INCLUDE_NEXT);
				setState(438);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(439);
				match(PRE_INCLUDE_NEXT);
				setState(440);
				pre_include_local_file();
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

	public static class Pre_include_system_headerContext extends ParserRuleContext {
		public Pre_include_filenameContext pre_include_filename() {
			return getRuleContext(Pre_include_filenameContext.class,0);
		}
		public Pre_include_system_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_include_system_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_include_system_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_include_system_header(this);
		}
	}

	public final Pre_include_system_headerContext pre_include_system_header() throws RecognitionException {
		Pre_include_system_headerContext _localctx = new Pre_include_system_headerContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_pre_include_system_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(T__12);
			setState(444);
			pre_include_filename();
			setState(445);
			match(T__13);
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
		enterRule(_localctx, 46, RULE_pre_include_local_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
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
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(ModuleParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(ModuleParser.ALPHA_NUMERIC, i);
		}
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
		enterRule(_localctx, 48, RULE_pre_include_filename);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(449);
				match(STRING);
				}
				break;
			case T__14:
			case T__15:
			case T__16:
			case ALPHA_NUMERIC:
				{
				setState(451); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(450);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16))) != 0) || _la==ALPHA_NUMERIC) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(453); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
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
		enterRule(_localctx, 50, RULE_pre_line);
		try {
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				match(PRE_LINE);
				setState(458);
				match(DECIMAL_LITERAL);
				setState(459);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				match(PRE_LINE);
				setState(461);
				match(DECIMAL_LITERAL);
				setState(462);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(463);
				match(PRE_LINE);
				setState(464);
				pre_macro_identifier();
				setState(465);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(467);
				match(PRE_LINE);
				setState(468);
				pre_macro_identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(469);
				match(PRE_LINE);
				setState(470);
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
		enterRule(_localctx, 52, RULE_pre_pragma);
		int _la;
		try {
			int _alt;
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				match(PRE_PRAGMA);
				setState(475);
				_la = _input.LA(1);
				if (_la==PRE_GCC) {
					{
					setState(474);
					match(PRE_GCC);
					}
				}

				setState(477);
				match(PRE_PRAGMA_KEYWORDS);
				setState(478);
				match(STRING);
				 preProcFindMacroEnd(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				match(PRE_PRAGMA);
				setState(482);
				_la = _input.LA(1);
				if (_la==PRE_GCC) {
					{
					setState(481);
					match(PRE_GCC);
					}
				}

				setState(484);
				match(PRE_PRAGMA_KEYWORDS);
				setState(486); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(485);
						identifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(488); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(490);
				match(PRE_PRAGMA);
				setState(492);
				_la = _input.LA(1);
				if (_la==PRE_GCC) {
					{
					setState(491);
					match(PRE_GCC);
					}
				}

				setState(494);
				match(PRE_PRAGMA_KEYWORDS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(495);
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
		enterRule(_localctx, 54, RULE_custom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(499);
				asciiTab();
				}
				break;
			case 2:
				{
				setState(500);
				externC();
				}
				break;
			case 3:
				{
				setState(501);
				macroFunctionPointer();
				}
				break;
			case 4:
				{
				setState(502);
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
		enterRule(_localctx, 56, RULE_asciiTab);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(508); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(505);
					pre_macro_identifier();
					setState(506);
					match(T__11);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(510); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		enterRule(_localctx, 58, RULE_externC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(EXTERN);
			setState(513);
			match(T__17);
			setState(515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(514);
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
		enterRule(_localctx, 60, RULE_macroFunctionPointer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			macroCall();
			setState(519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(518);
				match(NEWLINE);
				}
				break;
			}
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(521);
				pre_macro_identifier();
				}
				break;
			}
			setState(525);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(524);
				match(NEWLINE);
				}
			}

			setState(527);
			macroCall();
			setState(529);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(528);
				match(NEWLINE);
				}
			}

			setState(531);
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
		enterRule(_localctx, 62, RULE_testStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(T__18);
			setState(534);
			match(T__1);
			setState(535);
			function_name();
			setState(536);
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
		enterRule(_localctx, 64, RULE_testEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
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
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public Ctor_listContext ctor_list() {
			return getRuleContext(Ctor_listContext.class,0);
		}
		public TestStartContext testStart() {
			return getRuleContext(TestStartContext.class,0);
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
		enterRule(_localctx, 66, RULE_function_def);
		int _la;
		try {
			int _alt;
			setState(574);
			switch (_input.LA(1)) {
			case T__1:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__19:
			case T__22:
			case T__23:
			case T__30:
			case STATIC:
			case VOID:
			case UNSIGNED:
			case SIGNED:
			case CV_QUALIFIER:
			case EXTERN:
			case VIRTUAL:
			case SPECIAL_DATA:
			case OPERATOR:
			case TEMPLATE:
			case CLASS_KEY:
			case NEW:
			case ALPHA_NUMERIC:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case CHAR:
			case STRING:
			case NEWLINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(540);
					template_decl_start();
					}
				}

				setState(546);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(543);
						match(NEWLINE);
						}
						} 
					}
					setState(548);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				setState(550);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(549);
					return_type();
					}
					break;
				}
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(552);
					match(NEWLINE);
					}
					}
					setState(557);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(558);
				function_name();
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(559);
					match(NEWLINE);
					}
					}
					setState(564);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(565);
				function_param_list();
				setState(567);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(566);
					ctor_list();
					}
				}

				setState(569);
				compound_statement();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				testStart();
				setState(572);
				compound_statement();
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
		enterRule(_localctx, 68, RULE_return_type);
		int _la;
		try {
			int _alt;
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(579);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(576);
						function_decl_specifiers();
						}
						} 
					}
					setState(581);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(582);
					match(NEWLINE);
					}
					}
					setState(587);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(588);
				type_name();
				}
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__19 || _la==T__30) {
					{
					{
					setState(590);
					ptr_operator();
					}
					}
					setState(595);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(596);
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
		enterRule(_localctx, 70, RULE_function_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			match(T__1);
			setState(601);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__19) | (1L << T__22) | (1L << T__23) | (1L << T__30))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (STATIC - 73)) | (1L << (VOID - 73)) | (1L << (UNSIGNED - 73)) | (1L << (SIGNED - 73)) | (1L << (CV_QUALIFIER - 73)) | (1L << (EXTERN - 73)) | (1L << (VIRTUAL - 73)) | (1L << (AUTO - 73)) | (1L << (REGISTER - 73)) | (1L << (SPECIAL_DATA - 73)) | (1L << (OPERATOR - 73)) | (1L << (CLASS_KEY - 73)) | (1L << (NEW - 73)) | (1L << (ALPHA_NUMERIC - 73)) | (1L << (HEX_LITERAL - 73)) | (1L << (DECIMAL_LITERAL - 73)) | (1L << (OCTAL_LITERAL - 73)) | (1L << (FLOATING_POINT_LITERAL - 73)) | (1L << (CHAR - 73)) | (1L << (STRING - 73)))) != 0)) {
				{
				setState(600);
				parameter_decl_clause();
				}
			}

			setState(603);
			match(T__2);
			setState(605);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(604);
				match(T__19);
				}
			}

			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CV_QUALIFIER) {
				{
				{
				setState(607);
				match(CV_QUALIFIER);
				}
				}
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(614);
			_la = _input.LA(1);
			if (_la==THROW) {
				{
				setState(613);
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
		enterRule(_localctx, 72, RULE_parameter_decl_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(616);
			parameter_decl();
			setState(627);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(617);
					match(T__11);
					setState(621);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(618);
						match(NEWLINE);
						}
						}
						setState(623);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(624);
					parameter_decl();
					}
					} 
				}
				setState(629);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			}
			setState(638);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(630);
				match(T__11);
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(631);
					match(NEWLINE);
					}
					}
					setState(636);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(637);
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
		enterRule(_localctx, 74, RULE_parameter_decl);
		try {
			setState(644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(640);
				match(VOID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(641);
				param_decl_specifiers();
				setState(642);
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
		enterRule(_localctx, 76, RULE_parameter_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			_la = _input.LA(1);
			if (_la==T__19 || _la==T__30) {
				{
				setState(646);
				ptrs();
				}
			}

			setState(654);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(649);
				match(T__1);
				setState(650);
				parameter_id();
				setState(651);
				match(T__2);
				}
				break;
			case T__7:
			case T__8:
			case T__9:
			case NEW:
			case ALPHA_NUMERIC:
				{
				setState(653);
				parameter_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(657);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__35) {
				{
				setState(656);
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
		enterRule(_localctx, 78, RULE_compound_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
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
		enterRule(_localctx, 80, RULE_ctor_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			match(T__20);
			setState(663);
			ctor_initializer();
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(664);
				match(T__11);
				setState(665);
				ctor_initializer();
				}
				}
				setState(670);
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
		enterRule(_localctx, 82, RULE_ctor_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			initializer_id();
			setState(672);
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
		enterRule(_localctx, 84, RULE_initializer_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(674);
				match(T__21);
				}
			}

			setState(677);
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
		enterRule(_localctx, 86, RULE_ctor_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			match(T__1);
			setState(681);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__15) | (1L << T__19) | (1L << T__21) | (1L << T__30) | (1L << T__33) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NEW - 91)) | (1L << (ALPHA_NUMERIC - 91)) | (1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)) | (1L << (FLOATING_POINT_LITERAL - 91)) | (1L << (CHAR - 91)) | (1L << (STRING - 91)))) != 0)) {
				{
				setState(680);
				expr();
				}
			}

			setState(683);
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
		enterRule(_localctx, 88, RULE_function_name);
		try {
			setState(692);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(685);
				match(T__1);
				setState(686);
				function_name();
				setState(687);
				match(T__2);
				}
				break;
			case T__7:
			case T__8:
			case T__9:
			case NEW:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(689);
				identifier();
				}
				break;
			case OPERATOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(690);
				match(OPERATOR);
				setState(691);
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
		enterRule(_localctx, 90, RULE_exception_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			match(THROW);
			setState(695);
			match(T__1);
			setState(696);
			type_id_list();
			setState(697);
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
		enterRule(_localctx, 92, RULE_type_id_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << IF) | (1L << ELSE) | (1L << FOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(699);
				no_brackets();
				}
				}
				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(705);
				match(T__1);
				setState(706);
				type_id_list();
				setState(707);
				match(T__2);
				setState(711);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << IF) | (1L << ELSE) | (1L << FOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(708);
					no_brackets();
					}
					}
					setState(713);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(718);
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
		enterRule(_localctx, 94, RULE_simple_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
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
		public TerminalNode NEWLINE() { return getToken(ModuleParser.NEWLINE, 0); }
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public TerminalNode TYPEDEF() { return getToken(ModuleParser.TYPEDEF, 0); }
		public Template_decl_startContext template_decl_start() {
			return getRuleContext(Template_decl_startContext.class,0);
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
		public TerminalNode NEWLINE() { return getToken(ModuleParser.NEWLINE, 0); }
		public TerminalNode TYPEDEF() { return getToken(ModuleParser.TYPEDEF, 0); }
		public Template_decl_startContext template_decl_start() {
			return getRuleContext(Template_decl_startContext.class,0);
		}
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
	public static class StructUnionEnumContext extends Var_declContext {
		public Special_datatypeContext special_datatype() {
			return getRuleContext(Special_datatypeContext.class,0);
		}
		public TerminalNode TYPEDEF() { return getToken(ModuleParser.TYPEDEF, 0); }
		public TerminalNode NEWLINE() { return getToken(ModuleParser.NEWLINE, 0); }
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
		enterRule(_localctx, 96, RULE_var_decl);
		int _la;
		try {
			setState(759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				_localctx = new DeclByClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(722);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(721);
					match(TYPEDEF);
					}
				}

				setState(725);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(724);
					template_decl_start();
					}
				}

				}
				setState(727);
				class_def();
				setState(729);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(728);
					match(NEWLINE);
					}
					break;
				}
				setState(732);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(731);
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
				{
				setState(735);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(734);
					match(TYPEDEF);
					}
				}

				setState(738);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(737);
					template_decl_start();
					}
				}

				}
				setState(740);
				type_name();
				setState(742);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(741);
					match(NEWLINE);
					}
				}

				setState(744);
				init_declarator_list();
				}
				break;
			case 3:
				_localctx = new StructUnionEnumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(747);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(746);
					match(TYPEDEF);
					}
				}

				setState(749);
				special_datatype();
				setState(751);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(750);
					match(NEWLINE);
					}
					break;
				}
				setState(754);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(753);
					init_declarator_list();
					}
					break;
				}
				setState(757);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(756);
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

	public static class Special_datatypeContext extends ParserRuleContext {
		public TerminalNode SPECIAL_DATA() { return getToken(ModuleParser.SPECIAL_DATA, 0); }
		public TerminalNode OPENING_CURLY() { return getToken(ModuleParser.OPENING_CURLY, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		enterRule(_localctx, 98, RULE_special_datatype);
		int _la;
		try {
			setState(769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(761);
				match(SPECIAL_DATA);
				setState(763);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0) || _la==NEW || _la==ALPHA_NUMERIC) {
					{
					setState(762);
					identifier();
					}
				}

				setState(765);
				match(OPENING_CURLY);
				skipToEndOfObject(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(767);
				match(SPECIAL_DATA);
				setState(768);
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
		enterRule(_localctx, 100, RULE_init_declarator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			init_declarator();
			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(772);
				match(T__11);
				setState(774);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(773);
					match(NEWLINE);
					}
				}

				setState(776);
				init_declarator();
				}
				}
				setState(781);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(782);
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

	public static class InitializerContext extends ParserRuleContext {
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public Initializer_listContext initializer_list() {
			return getRuleContext(Initializer_listContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_initializer);
		try {
			setState(791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(784);
				assign_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(785);
				match(OPENING_CURLY);
				setState(786);
				initializer_list();
				setState(787);
				match(CLOSING_CURLY);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(789);
				match(OPENING_CURLY);
				setState(790);
				match(CLOSING_CURLY);
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

	public static class Initializer_listContext extends ParserRuleContext {
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInitializer_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInitializer_list(this);
		}
	}

	public final Initializer_listContext initializer_list() throws RecognitionException {
		Initializer_listContext _localctx = new Initializer_listContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_initializer_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			initializer();
			setState(801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(794);
				match(T__11);
				setState(796);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(795);
					match(NEWLINE);
					}
				}

				setState(798);
				initializer();
				}
				}
				setState(803);
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

	public static class Class_defContext extends ParserRuleContext {
		public TerminalNode CLASS_KEY() { return getToken(ModuleParser.CLASS_KEY, 0); }
		public TerminalNode OPENING_CURLY() { return getToken(ModuleParser.OPENING_CURLY, 0); }
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
		enterRule(_localctx, 106, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			match(CLASS_KEY);
			setState(806);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0) || _la==NEW || _la==ALPHA_NUMERIC) {
				{
				setState(805);
				class_name();
				}
			}

			setState(809);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(808);
				base_classes();
				}
			}

			setState(811);
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
		enterRule(_localctx, 108, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
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
		enterRule(_localctx, 110, RULE_base_classes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			match(T__20);
			setState(817);
			base_class();
			setState(822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(818);
				match(T__11);
				setState(819);
				base_class();
				}
				}
				setState(824);
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
		enterRule(_localctx, 112, RULE_base_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			_la = _input.LA(1);
			if (_la==VIRTUAL) {
				{
				setState(825);
				match(VIRTUAL);
				}
			}

			setState(829);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(828);
				access_specifier();
				}
				break;
			}
			setState(831);
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
		enterRule(_localctx, 114, RULE_type_name);
		int _la;
		try {
			int _alt;
			setState(876);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(834);
				_la = _input.LA(1);
				if (_la==EXTERN) {
					{
					setState(833);
					match(EXTERN);
					}
				}

				setState(842); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(842);
						switch (_input.LA(1)) {
						case T__4:
						case T__5:
						case T__6:
						case STATIC:
						case VIRTUAL:
							{
							setState(836);
							function_decl_specifiers();
							}
							break;
						case CV_QUALIFIER:
							{
							setState(837);
							match(CV_QUALIFIER);
							}
							break;
						case UNSIGNED:
							{
							setState(838);
							match(UNSIGNED);
							}
							break;
						case SIGNED:
							{
							setState(839);
							match(SIGNED);
							}
							break;
						case T__19:
						case T__30:
							{
							setState(840);
							ptr_operator();
							}
							break;
						case T__10:
						case T__22:
						case T__23:
						case VOID:
						case SPECIAL_DATA:
						case CLASS_KEY:
						case ALPHA_NUMERIC:
							{
							setState(841);
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
					setState(844); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(850);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(846);
					match(T__12);
					setState(847);
					template_param_list();
					setState(848);
					match(T__13);
					}
				}

				setState(862);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(852);
						match(T__21);
						setState(853);
						base_type();
						setState(858);
						_la = _input.LA(1);
						if (_la==T__12) {
							{
							setState(854);
							match(T__12);
							setState(855);
							template_param_list();
							setState(856);
							match(T__13);
							}
						}

						}
						} 
					}
					setState(864);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				}
				setState(872);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(870);
						switch (_input.LA(1)) {
						case T__4:
						case T__5:
						case T__6:
						case STATIC:
						case VIRTUAL:
							{
							setState(865);
							function_decl_specifiers();
							}
							break;
						case CV_QUALIFIER:
							{
							setState(866);
							match(CV_QUALIFIER);
							}
							break;
						case UNSIGNED:
							{
							setState(867);
							match(UNSIGNED);
							}
							break;
						case SIGNED:
							{
							setState(868);
							match(SIGNED);
							}
							break;
						case T__19:
						case T__30:
							{
							setState(869);
							ptr_operator();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(874);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(875);
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
		enterRule(_localctx, 116, RULE_base_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(879); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(878);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__22) | (1L << T__23))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (VOID - 74)) | (1L << (SPECIAL_DATA - 74)) | (1L << (CLASS_KEY - 74)) | (1L << (ALPHA_NUMERIC - 74)))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(881); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
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
		enterRule(_localctx, 118, RULE_param_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			_la = _input.LA(1);
			if (_la==AUTO || _la==REGISTER) {
				{
				setState(883);
				_la = _input.LA(1);
				if ( !(_la==AUTO || _la==REGISTER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(886);
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
		enterRule(_localctx, 120, RULE_parameter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
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

	public static class Param_type_listContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(ModuleParser.VOID, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public List<Param_typeContext> param_type() {
			return getRuleContexts(Param_typeContext.class);
		}
		public Param_typeContext param_type(int i) {
			return getRuleContext(Param_typeContext.class,i);
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
		enterRule(_localctx, 122, RULE_param_type_list);
		int _la;
		try {
			setState(917);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(890);
				match(T__1);
				setState(892);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(891);
					match(NEWLINE);
					}
				}

				setState(894);
				match(VOID);
				setState(895);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(896);
				match(T__1);
				setState(898);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(897);
					match(NEWLINE);
					}
				}

				setState(914);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__19) | (1L << T__22) | (1L << T__23) | (1L << T__30))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (STATIC - 73)) | (1L << (VOID - 73)) | (1L << (UNSIGNED - 73)) | (1L << (SIGNED - 73)) | (1L << (CV_QUALIFIER - 73)) | (1L << (EXTERN - 73)) | (1L << (VIRTUAL - 73)) | (1L << (AUTO - 73)) | (1L << (REGISTER - 73)) | (1L << (SPECIAL_DATA - 73)) | (1L << (OPERATOR - 73)) | (1L << (CLASS_KEY - 73)) | (1L << (NEW - 73)) | (1L << (ALPHA_NUMERIC - 73)) | (1L << (HEX_LITERAL - 73)) | (1L << (DECIMAL_LITERAL - 73)) | (1L << (OCTAL_LITERAL - 73)) | (1L << (FLOATING_POINT_LITERAL - 73)) | (1L << (CHAR - 73)) | (1L << (STRING - 73)))) != 0)) {
					{
					setState(900);
					param_type();
					setState(902);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(901);
						match(NEWLINE);
						}
					}

					setState(911);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__11) {
						{
						{
						setState(904);
						match(T__11);
						setState(906);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(905);
							match(NEWLINE);
							}
						}

						setState(908);
						param_type();
						}
						}
						setState(913);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(916);
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
		enterRule(_localctx, 124, RULE_param_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			param_decl_specifiers();
			setState(920);
			param_type_id();
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
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
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
		enterRule(_localctx, 126, RULE_param_type_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(923);
			_la = _input.LA(1);
			if (_la==T__19 || _la==T__30) {
				{
				setState(922);
				ptrs();
				}
			}

			setState(938);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(925);
				match(T__1);
				setState(927);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(926);
					match(NEWLINE);
					}
					break;
				}
				setState(929);
				param_type_id();
				setState(931);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(930);
					match(NEWLINE);
					}
				}

				setState(933);
				match(T__2);
				}
				break;
			case 2:
				{
				setState(936);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0) || _la==NEW || _la==ALPHA_NUMERIC) {
					{
					setState(935);
					parameter_name();
					}
				}

				}
				break;
			}
			setState(941);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__35) {
				{
				setState(940);
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
		enterRule(_localctx, 128, RULE_identifier);
		try {
			int _alt;
			setState(953);
			switch (_input.LA(1)) {
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(943);
				match(ALPHA_NUMERIC);
				setState(948);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(944);
						match(T__21);
						setState(945);
						match(ALPHA_NUMERIC);
						}
						} 
					}
					setState(950);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
				}
				}
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(951);
				match(NEW);
				}
				break;
			case T__7:
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(952);
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
		enterRule(_localctx, 130, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			_la = _input.LA(1);
			if ( !(((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & ((1L << (HEX_LITERAL - 112)) | (1L << (DECIMAL_LITERAL - 112)) | (1L << (OCTAL_LITERAL - 112)))) != 0)) ) {
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
		enterRule(_localctx, 132, RULE_ptrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(957);
				ptr_operator();
				setState(959);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(958);
					match(T__24);
					}
				}

				}
				}
				setState(963); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__19 || _la==T__30 );
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
		enterRule(_localctx, 134, RULE_func_ptrs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
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
		enterRule(_localctx, 136, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			assign_expr();
			setState(972);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(968);
					match(ESCAPE);
					setState(969);
					match(NEWLINE);
					}
					} 
				}
				setState(974);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			}
			setState(989);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(978);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(975);
					match(NEWLINE);
					}
					}
					setState(980);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(981);
				match(T__11);
				setState(985);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(982);
					match(NEWLINE);
					}
					}
					setState(987);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(988);
				expr();
				}
				break;
			}
			setState(995);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(991);
					match(ESCAPE);
					setState(992);
					match(NEWLINE);
					}
					} 
				}
				setState(997);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
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
		enterRule(_localctx, 138, RULE_assign_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
			conditional_expression();
			setState(1014);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(1002);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(999);
					match(NEWLINE);
					}
					}
					setState(1004);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1005);
				assignment_operator();
				setState(1009);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1006);
					match(NEWLINE);
					}
					}
					setState(1011);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1012);
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
		enterRule(_localctx, 140, RULE_conditional_expression);
		int _la;
		try {
			setState(1047);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				_localctx = new NormOrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1016);
				or_expression();
				}
				break;
			case 2:
				_localctx = new CndExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1017);
				or_expression();
				{
				setState(1021);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1018);
					match(NEWLINE);
					}
					}
					setState(1023);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1024);
				match(T__25);
				setState(1028);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1025);
					match(NEWLINE);
					}
					}
					setState(1030);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1031);
				expr();
				setState(1035);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1032);
					match(NEWLINE);
					}
					}
					setState(1037);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1038);
				match(T__20);
				setState(1042);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1039);
					match(NEWLINE);
					}
					}
					setState(1044);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1045);
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
		enterRule(_localctx, 142, RULE_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1049);
			and_expression();
			setState(1064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1053);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1050);
					match(NEWLINE);
					}
					}
					setState(1055);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1056);
				match(T__26);
				setState(1060);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1057);
					match(NEWLINE);
					}
					}
					setState(1062);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1063);
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
		enterRule(_localctx, 144, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
			inclusive_or_expression();
			setState(1081);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1070);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1067);
					match(NEWLINE);
					}
					}
					setState(1072);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1073);
				match(T__27);
				setState(1077);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1074);
					match(NEWLINE);
					}
					}
					setState(1079);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1080);
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
		enterRule(_localctx, 146, RULE_inclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
			exclusive_or_expression();
			setState(1098);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1087);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1084);
					match(NEWLINE);
					}
					}
					setState(1089);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1090);
				match(T__28);
				setState(1094);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1091);
					match(NEWLINE);
					}
					}
					setState(1096);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1097);
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
		enterRule(_localctx, 148, RULE_exclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100);
			bit_and_expression();
			setState(1115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1101);
					match(NEWLINE);
					}
					}
					setState(1106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1107);
				match(T__29);
				setState(1111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1108);
					match(NEWLINE);
					}
					}
					setState(1113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1114);
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
		enterRule(_localctx, 150, RULE_bit_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			equality_expression();
			setState(1132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				setState(1121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1118);
					match(NEWLINE);
					}
					}
					setState(1123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1124);
				match(T__30);
				setState(1128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1125);
					match(NEWLINE);
					}
					}
					setState(1130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1131);
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
		enterRule(_localctx, 152, RULE_equality_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1134);
			relational_expression();
			setState(1150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1135);
					match(NEWLINE);
					}
					}
					setState(1140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1141);
				equality_operator();
				setState(1145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1142);
					match(NEWLINE);
					}
					}
					setState(1147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1148);
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
		enterRule(_localctx, 154, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1152);
			shift_expression();
			setState(1168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1153);
					match(NEWLINE);
					}
					}
					setState(1158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1159);
				relational_operator();
				setState(1163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1160);
					match(NEWLINE);
					}
					}
					setState(1165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1166);
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
		enterRule(_localctx, 156, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1170);
			additive_expression();
			setState(1185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1171);
					match(NEWLINE);
					}
					}
					setState(1176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1177);
				_la = _input.LA(1);
				if ( !(_la==T__31 || _la==T__32) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1178);
					match(NEWLINE);
					}
					}
					setState(1183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1184);
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
		enterRule(_localctx, 158, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1187);
			multiplicative_expression();
			setState(1202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1188);
					match(NEWLINE);
					}
					}
					setState(1193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1194);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__33) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1195);
					match(NEWLINE);
					}
					}
					setState(1200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1201);
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
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
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
		enterRule(_localctx, 160, RULE_multiplicative_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1204);
			cast_expression();
			setState(1219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				setState(1208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1205);
					match(NEWLINE);
					}
					}
					setState(1210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1211);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__19) | (1L << T__34))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1212);
					match(NEWLINE);
					}
					}
					setState(1217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1218);
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
		enterRule(_localctx, 162, RULE_cast_expression);
		try {
			setState(1227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1221);
				match(T__1);
				setState(1222);
				cast_target();
				setState(1223);
				match(T__2);
				setState(1224);
				cast_expression();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1226);
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
		enterRule(_localctx, 164, RULE_cast_target);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1229);
			type_name();
			setState(1239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19 || _la==T__30 || _la==NEWLINE) {
				{
				{
				setState(1233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1230);
					match(NEWLINE);
					}
					}
					setState(1235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1236);
				ptr_operator();
				}
				}
				setState(1241);
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

	public static class Unary_expressionContext extends ParserRuleContext {
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
		enterRule(_localctx, 166, RULE_unary_expression);
		try {
			setState(1247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1242);
				unary_op_and_cast_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1243);
				sizeof_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1244);
				new_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1245);
				postfix_expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1246);
				defined_expression();
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
		enterRule(_localctx, 168, RULE_new_expression);
		int _la;
		try {
			setState(1295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1250);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(1249);
					match(T__21);
					}
				}

				setState(1252);
				match(NEW);
				setState(1256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1253);
					match(NEWLINE);
					}
					}
					setState(1258);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1259);
				type_name();
				setState(1263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1260);
					match(NEWLINE);
					}
					}
					setState(1265);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1266);
				match(T__35);
				setState(1268);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__15) | (1L << T__19) | (1L << T__21) | (1L << T__30) | (1L << T__33) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NEW - 91)) | (1L << (ALPHA_NUMERIC - 91)) | (1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)) | (1L << (FLOATING_POINT_LITERAL - 91)) | (1L << (CHAR - 91)) | (1L << (STRING - 91)))) != 0)) {
					{
					setState(1267);
					conditional_expression();
					}
				}

				setState(1270);
				match(T__36);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1273);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(1272);
					match(T__21);
					}
				}

				setState(1275);
				match(NEW);
				setState(1279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1276);
					match(NEWLINE);
					}
					}
					setState(1281);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1282);
				type_name();
				setState(1286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1283);
					match(NEWLINE);
					}
					}
					setState(1288);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1289);
				match(T__1);
				setState(1291);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__15) | (1L << T__19) | (1L << T__21) | (1L << T__30) | (1L << T__33) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NEW - 91)) | (1L << (ALPHA_NUMERIC - 91)) | (1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)) | (1L << (FLOATING_POINT_LITERAL - 91)) | (1L << (CHAR - 91)) | (1L << (STRING - 91)))) != 0)) {
					{
					setState(1290);
					expr();
					}
				}

				setState(1293);
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
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
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
		enterRule(_localctx, 170, RULE_unary_op_and_cast_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1297);
			unary_operator();
			setState(1301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1298);
				match(NEWLINE);
				}
				}
				setState(1303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1304);
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
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
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
		enterRule(_localctx, 172, RULE_sizeof_expression);
		int _la;
		try {
			setState(1326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1306);
				sizeof();
				setState(1310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1307);
					match(NEWLINE);
					}
					}
					setState(1312);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1313);
				match(T__1);
				setState(1314);
				sizeof_operand();
				setState(1315);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1317);
				sizeof();
				setState(1321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1318);
					match(NEWLINE);
					}
					}
					setState(1323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1324);
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
		enterRule(_localctx, 174, RULE_sizeof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1328);
			match(T__37);
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
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
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
		enterRule(_localctx, 176, RULE_defined_expression);
		int _la;
		try {
			setState(1349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1330);
				match(T__38);
				setState(1334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1331);
					match(NEWLINE);
					}
					}
					setState(1336);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1337);
				match(T__1);
				setState(1338);
				expr();
				setState(1339);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1341);
				match(T__38);
				setState(1345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1342);
					match(NEWLINE);
					}
					}
					setState(1347);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1348);
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
		enterRule(_localctx, 178, RULE_sizeof_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1351);
			type_name();
			setState(1361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19 || _la==T__30 || _la==NEWLINE) {
				{
				{
				setState(1355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1352);
					match(NEWLINE);
					}
					}
					setState(1357);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1358);
				ptr_operator();
				}
				}
				setState(1363);
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
		enterRule(_localctx, 180, RULE_sizeof_operand2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1364);
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
		enterRule(_localctx, 182, RULE_inc_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1366);
			_la = _input.LA(1);
			if ( !(_la==T__39 || _la==T__40) ) {
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
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
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
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
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
		public Function_argument_listContext function_argument_list() {
			return getRuleContext(Function_argument_listContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
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
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
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
		int _startState = 184;
		enterRecursionRule(_localctx, 184, RULE_postfix_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1385);
			switch (_input.LA(1)) {
			case T__1:
			case T__7:
			case T__8:
			case T__9:
			case NEW:
			case ALPHA_NUMERIC:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case CHAR:
			case STRING:
				{
				_localctx = new PrimaryOnlyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1369);
				primary_expression();
				}
				break;
			case T__19:
			case T__30:
			case T__39:
			case T__40:
				{
				_localctx = new IncDecOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1371);
				_la = _input.LA(1);
				if (_la==T__19 || _la==T__30) {
					{
					setState(1370);
					ptr_operator();
					}
				}

				setState(1373);
				inc_dec();
				setState(1377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1374);
					match(NEWLINE);
					}
					}
					setState(1379);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1381);
				_la = _input.LA(1);
				if (_la==T__19 || _la==T__30) {
					{
					setState(1380);
					ptr_operator();
					}
				}

				setState(1383);
				primary_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1443);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1441);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayIndexingContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1387);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1391);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(1388);
							match(NEWLINE);
							}
							}
							setState(1393);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1394);
						match(T__35);
						setState(1395);
						expr();
						setState(1396);
						match(T__36);
						}
						break;
					case 2:
						{
						_localctx = new FuncCallContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1398);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1402);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(1399);
							match(NEWLINE);
							}
							}
							setState(1404);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1405);
						match(T__1);
						setState(1406);
						function_argument_list();
						setState(1407);
						match(T__2);
						}
						break;
					case 3:
						{
						_localctx = new MemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1409);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1410);
						match(T__14);
						setState(1414);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(1411);
							match(NEWLINE);
							}
							}
							setState(1416);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1418);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(1417);
							match(TEMPLATE);
							}
						}

						{
						setState(1420);
						identifier();
						}
						}
						break;
					case 4:
						{
						_localctx = new PtrMemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1421);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1422);
						match(T__41);
						setState(1426);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(1423);
							match(NEWLINE);
							}
							}
							setState(1428);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1430);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(1429);
							match(TEMPLATE);
							}
						}

						{
						setState(1432);
						identifier();
						}
						}
						break;
					case 5:
						{
						_localctx = new IncDecOpContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1433);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1437);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(1434);
							match(NEWLINE);
							}
							}
							setState(1439);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1440);
						inc_dec();
						}
						break;
					}
					} 
				}
				setState(1445);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
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

	public static class Function_argument_listContext extends ParserRuleContext {
		public List<Function_argumentContext> function_argument() {
			return getRuleContexts(Function_argumentContext.class);
		}
		public Function_argumentContext function_argument(int i) {
			return getRuleContext(Function_argumentContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Function_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunction_argument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunction_argument_list(this);
		}
	}

	public final Function_argument_listContext function_argument_list() throws RecognitionException {
		Function_argument_listContext _localctx = new Function_argument_listContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_function_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1468);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__15) | (1L << T__19) | (1L << T__21) | (1L << T__30) | (1L << T__33) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NEW - 91)) | (1L << (ALPHA_NUMERIC - 91)) | (1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)) | (1L << (FLOATING_POINT_LITERAL - 91)) | (1L << (CHAR - 91)) | (1L << (STRING - 91)))) != 0)) {
				{
				setState(1447); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1446);
					function_argument();
					}
					}
					setState(1449); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__15) | (1L << T__19) | (1L << T__21) | (1L << T__30) | (1L << T__33) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NEW - 91)) | (1L << (ALPHA_NUMERIC - 91)) | (1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)) | (1L << (FLOATING_POINT_LITERAL - 91)) | (1L << (CHAR - 91)) | (1L << (STRING - 91)))) != 0) );
				setState(1465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(1451);
					match(T__11);
					setState(1455);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(1452);
						match(NEWLINE);
						}
						}
						setState(1457);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1459); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1458);
						function_argument();
						}
						}
						setState(1461); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__15) | (1L << T__19) | (1L << T__21) | (1L << T__30) | (1L << T__33) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NEW - 91)) | (1L << (ALPHA_NUMERIC - 91)) | (1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)) | (1L << (FLOATING_POINT_LITERAL - 91)) | (1L << (CHAR - 91)) | (1L << (STRING - 91)))) != 0) );
					}
					}
					setState(1467);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Function_argumentContext extends ParserRuleContext {
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Function_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunction_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunction_argument(this);
		}
	}

	public final Function_argumentContext function_argument() throws RecognitionException {
		Function_argumentContext _localctx = new Function_argumentContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_function_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1470);
			assign_expr();
			setState(1474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1471);
				match(NEWLINE);
				}
				}
				setState(1476);
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

	public static class Primary_expressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
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
		enterRule(_localctx, 190, RULE_primary_expression);
		try {
			setState(1483);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case T__9:
			case NEW:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1477);
				identifier();
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
				setState(1478);
				constant();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(1479);
				match(T__1);
				setState(1480);
				expr();
				setState(1481);
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
		enterRule(_localctx, 192, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1485);
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
		enterRule(_localctx, 194, RULE_newline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1487);
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
		enterRule(_localctx, 196, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1489);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__19) | (1L << T__30) | (1L << T__33) | (1L << T__42) | (1L << T__43))) != 0)) ) {
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
		enterRule(_localctx, 198, RULE_relational_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1491);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__44) | (1L << T__45))) != 0)) ) {
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
		public TerminalNode STRING() { return getToken(ModuleParser.STRING, 0); }
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
		enterRule(_localctx, 200, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1493);
			_la = _input.LA(1);
			if ( !(((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & ((1L << (HEX_LITERAL - 112)) | (1L << (DECIMAL_LITERAL - 112)) | (1L << (OCTAL_LITERAL - 112)) | (1L << (FLOATING_POINT_LITERAL - 112)) | (1L << (CHAR - 112)) | (1L << (STRING - 112)))) != 0)) ) {
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
		enterRule(_localctx, 202, RULE_function_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1495);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6))) != 0) || _la==STATIC || _la==VIRTUAL) ) {
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
		enterRule(_localctx, 204, RULE_ptr_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1497);
			_la = _input.LA(1);
			if ( !(_la==T__19 || _la==T__30) ) {
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
		enterRule(_localctx, 206, RULE_access_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1499);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
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
		enterRule(_localctx, 208, RULE_operator);
		int _la;
		try {
			setState(1546);
			switch (_input.LA(1)) {
			case T__46:
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1501);
				_la = _input.LA(1);
				if ( !(_la==T__46 || _la==NEW) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1504);
				_la = _input.LA(1);
				if (_la==T__35) {
					{
					setState(1502);
					match(T__35);
					setState(1503);
					match(T__36);
					}
				}

				}
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(1506);
				match(T__33);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(1507);
				match(T__15);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(1508);
				match(T__19);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 5);
				{
				setState(1509);
				match(T__16);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 6);
				{
				setState(1510);
				match(T__34);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 7);
				{
				setState(1511);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 8);
				{
				setState(1512);
				match(T__30);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 9);
				{
				setState(1513);
				match(T__28);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 10);
				{
				setState(1514);
				match(T__42);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 11);
				{
				setState(1515);
				match(T__43);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 12);
				{
				setState(1516);
				match(T__3);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 13);
				{
				setState(1517);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 14);
				{
				setState(1518);
				match(T__13);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 15);
				{
				setState(1519);
				match(T__47);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 16);
				{
				setState(1520);
				match(T__48);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 17);
				{
				setState(1521);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 18);
				{
				setState(1522);
				match(T__50);
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 19);
				{
				setState(1523);
				match(T__51);
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 20);
				{
				setState(1524);
				match(T__52);
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 21);
				{
				setState(1525);
				match(T__53);
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 22);
				{
				setState(1526);
				match(T__54);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 23);
				{
				setState(1527);
				match(T__32);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 24);
				{
				setState(1528);
				match(T__31);
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 25);
				{
				setState(1529);
				match(T__55);
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 26);
				{
				setState(1530);
				match(T__56);
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 27);
				{
				setState(1531);
				match(T__57);
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 28);
				{
				setState(1532);
				match(T__58);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 29);
				{
				setState(1533);
				match(T__44);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 30);
				{
				setState(1534);
				match(T__45);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 31);
				{
				setState(1535);
				match(T__27);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 32);
				{
				setState(1536);
				match(T__26);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 33);
				{
				setState(1537);
				match(T__40);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 34);
				{
				setState(1538);
				match(T__39);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 35);
				{
				setState(1539);
				match(T__11);
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 36);
				{
				setState(1540);
				match(T__59);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 37);
				{
				setState(1541);
				match(T__41);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 38);
				{
				setState(1542);
				match(T__1);
				setState(1543);
				match(T__2);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 39);
				{
				setState(1544);
				match(T__35);
				setState(1545);
				match(T__36);
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
		enterRule(_localctx, 210, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1548);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0)) ) {
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
		enterRule(_localctx, 212, RULE_equality_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1550);
			_la = _input.LA(1);
			if ( !(_la==T__57 || _la==T__58) ) {
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
		enterRule(_localctx, 214, RULE_template_decl_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1552);
			match(TEMPLATE);
			setState(1553);
			match(T__12);
			setState(1554);
			template_param_list();
			setState(1555);
			match(T__13);
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
		enterRule(_localctx, 216, RULE_template_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1566); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1566);
				switch (_input.LA(1)) {
				case T__12:
					{
					{
					setState(1557);
					match(T__12);
					setState(1558);
					template_param_list();
					setState(1559);
					match(T__13);
					}
					}
					break;
				case T__1:
					{
					{
					setState(1561);
					match(T__1);
					setState(1562);
					template_param_list();
					setState(1563);
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
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
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
				case NEWLINE:
				case ESCAPE:
				case WHITESPACE:
				case ELLIPSIS:
				case OTHER:
					{
					setState(1565);
					no_angle_brackets_or_brackets();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1568); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << IF) | (1L << ELSE) | (1L << FOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0) );
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
		enterRule(_localctx, 218, RULE_no_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1570);
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
		enterRule(_localctx, 220, RULE_no_brackets_curlies_or_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1572);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__35) | (1L << T__36))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
		enterRule(_localctx, 222, RULE_no_brackets_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1574);
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
		enterRule(_localctx, 224, RULE_no_angle_brackets_or_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1576);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__12) | (1L << T__13))) != 0)) ) {
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
		enterRule(_localctx, 226, RULE_no_curlies);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1578);
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
		enterRule(_localctx, 228, RULE_no_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1580);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__35 || _la==T__36) ) {
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
		enterRule(_localctx, 230, RULE_no_squares_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1582);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__35) | (1L << T__36))) != 0)) ) {
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
		enterRule(_localctx, 232, RULE_no_comma_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1584);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__0 || _la==T__11) ) {
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
		enterRule(_localctx, 234, RULE_assign_water);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1586);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__11) | (1L << T__35) | (1L << T__36))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
		enterRule(_localctx, 236, RULE_assign_water_l2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1588);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__35) | (1L << T__36))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
		enterRule(_localctx, 238, RULE_water);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1590);
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

	public static class Init_declaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
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
		enterRule(_localctx, 240, RULE_init_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1592);
			declarator();
			setState(1600);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(1593);
				match(T__1);
				setState(1595);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__15) | (1L << T__19) | (1L << T__21) | (1L << T__30) | (1L << T__33) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NEW - 91)) | (1L << (ALPHA_NUMERIC - 91)) | (1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)) | (1L << (FLOATING_POINT_LITERAL - 91)) | (1L << (CHAR - 91)) | (1L << (STRING - 91)))) != 0)) {
					{
					setState(1594);
					expr();
					}
				}

				setState(1597);
				match(T__2);
				}
				}
				break;
			case T__3:
				{
				{
				setState(1598);
				match(T__3);
				setState(1599);
				assign_expr_w_();
				}
				}
				break;
			case T__0:
			case T__11:
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
		public Func_ptrsContext func_ptrs() {
			return getRuleContext(Func_ptrsContext.class,0);
		}
		public CallingConvetionContext callingConvetion() {
			return getRuleContext(CallingConvetionContext.class,0);
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
		enterRule(_localctx, 242, RULE_declarator);
		int _la;
		try {
			setState(1621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1603);
				_la = _input.LA(1);
				if (_la==T__19 || _la==T__30) {
					{
					setState(1602);
					ptrs();
					}
				}

				setState(1605);
				identifier();
				setState(1607);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(1606);
					type_suffix();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1610);
				_la = _input.LA(1);
				if (_la==T__19 || _la==T__30) {
					{
					setState(1609);
					ptrs();
					}
				}

				setState(1612);
				match(T__1);
				setState(1614);
				_la = _input.LA(1);
				if (_la==ALPHA_NUMERIC) {
					{
					setState(1613);
					callingConvetion();
					}
				}

				setState(1616);
				func_ptrs();
				setState(1617);
				identifier();
				setState(1618);
				match(T__2);
				setState(1619);
				type_suffix();
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

	public static class CallingConvetionContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(ModuleParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(ModuleParser.ALPHA_NUMERIC, i);
		}
		public CallingConvetionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callingConvetion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCallingConvetion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCallingConvetion(this);
		}
	}

	public final CallingConvetionContext callingConvetion() throws RecognitionException {
		CallingConvetionContext _localctx = new CallingConvetionContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_callingConvetion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1624); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1623);
				match(ALPHA_NUMERIC);
				}
				}
				setState(1626); 
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
		enterRule(_localctx, 246, RULE_type_suffix);
		try {
			setState(1633);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1628);
				match(T__35);
				setState(1629);
				constant_expr_w_();
				setState(1630);
				match(T__36);
				}
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(1632);
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
		enterRule(_localctx, 248, RULE_assign_expr_w_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << IF) | (1L << ELSE) | (1L << FOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(1635);
				assign_water();
				}
				}
				setState(1640);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==T__35 || _la==OPENING_CURLY) {
				{
				{
				setState(1653);
				switch (_input.LA(1)) {
				case OPENING_CURLY:
					{
					setState(1641);
					match(OPENING_CURLY);
					setState(1642);
					assign_expr_w__l2();
					setState(1643);
					match(CLOSING_CURLY);
					}
					break;
				case T__1:
					{
					setState(1645);
					match(T__1);
					setState(1646);
					assign_expr_w__l2();
					setState(1647);
					match(T__2);
					}
					break;
				case T__35:
					{
					setState(1649);
					match(T__35);
					setState(1650);
					assign_expr_w__l2();
					setState(1651);
					match(T__36);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << IF) | (1L << ELSE) | (1L << FOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(1655);
					assign_water();
					}
					}
					setState(1660);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(1665);
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
		enterRule(_localctx, 250, RULE_assign_expr_w__l2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << IF) | (1L << ELSE) | (1L << FOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(1666);
				assign_water_l2();
				}
				}
				setState(1671);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==T__35 || _la==OPENING_CURLY) {
				{
				{
				setState(1684);
				switch (_input.LA(1)) {
				case OPENING_CURLY:
					{
					setState(1672);
					match(OPENING_CURLY);
					setState(1673);
					assign_expr_w__l2();
					setState(1674);
					match(CLOSING_CURLY);
					}
					break;
				case T__1:
					{
					setState(1676);
					match(T__1);
					setState(1677);
					assign_expr_w__l2();
					setState(1678);
					match(T__2);
					}
					break;
				case T__35:
					{
					setState(1680);
					match(T__35);
					setState(1681);
					assign_expr_w__l2();
					setState(1682);
					match(T__36);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << IF) | (1L << ELSE) | (1L << FOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(1686);
					assign_water_l2();
					}
					}
					setState(1691);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(1696);
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
		enterRule(_localctx, 252, RULE_constant_expr_w_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << IF) | (1L << ELSE) | (1L << FOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(1697);
				no_squares();
				}
				}
				setState(1702);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__35) {
				{
				{
				setState(1703);
				match(T__35);
				setState(1704);
				constant_expr_w_();
				setState(1705);
				match(T__36);
				setState(1709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << IF) | (1L << ELSE) | (1L << FOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(1706);
					no_squares();
					}
					}
					setState(1711);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(1716);
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
		case 92:
			return postfix_expression_sempred((Postfix_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean postfix_expression_sempred(Postfix_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3}\u06b8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
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
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\u0108\n\2\f\2\16\2\u010b\13\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\5\4\u0114\n\4\3\5\3\5\3\5\3\5\5\5\u011a\n\5\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u012e\n\n\3\13\3\13\3\13\3\13\7\13\u0134\n\13\f\13\16\13\u0137\13\13"+
		"\3\13\3\13\7\13\u013b\n\13\f\13\16\13\u013e\13\13\3\13\3\13\5\13\u0142"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u014c\n\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u015b\n\r\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\5\17\u0163\n\17\3\20\3\20\3\21\3\21\5\21\u0169\n\21\3\21\3\21"+
		"\3\21\5\21\u016e\n\21\7\21\u0170\n\21\f\21\16\21\u0173\13\21\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u017e\n\23\f\23\16\23\u0181\13"+
		"\23\3\23\5\23\u0184\n\23\3\23\3\23\3\24\3\24\3\24\5\24\u018b\n\24\3\25"+
		"\3\25\5\25\u018f\n\25\3\25\3\25\3\25\3\25\5\25\u0195\n\25\3\25\5\25\u0198"+
		"\n\25\3\25\3\25\3\25\3\25\5\25\u019e\n\25\3\25\7\25\u01a1\n\25\f\25\16"+
		"\25\u01a4\13\25\3\25\3\25\5\25\u01a8\n\25\3\25\3\25\5\25\u01ac\n\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\5\26\u01b4\n\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u01bc\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\6\32\u01c6"+
		"\n\32\r\32\16\32\u01c7\5\32\u01ca\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01da\n\33\3\34\3\34\5\34"+
		"\u01de\n\34\3\34\3\34\3\34\3\34\3\34\5\34\u01e5\n\34\3\34\3\34\6\34\u01e9"+
		"\n\34\r\34\16\34\u01ea\3\34\3\34\5\34\u01ef\n\34\3\34\3\34\3\34\5\34\u01f4"+
		"\n\34\3\35\3\35\3\35\3\35\5\35\u01fa\n\35\3\36\3\36\3\36\6\36\u01ff\n"+
		"\36\r\36\16\36\u0200\3\37\3\37\3\37\5\37\u0206\n\37\3 \3 \5 \u020a\n "+
		"\3 \5 \u020d\n \3 \5 \u0210\n \3 \3 \5 \u0214\n \3 \3 \3!\3!\3!\3!\3!"+
		"\3\"\3\"\3#\5#\u0220\n#\3#\7#\u0223\n#\f#\16#\u0226\13#\3#\5#\u0229\n"+
		"#\3#\7#\u022c\n#\f#\16#\u022f\13#\3#\3#\7#\u0233\n#\f#\16#\u0236\13#\3"+
		"#\3#\5#\u023a\n#\3#\3#\3#\3#\3#\5#\u0241\n#\3$\7$\u0244\n$\f$\16$\u0247"+
		"\13$\3$\7$\u024a\n$\f$\16$\u024d\13$\3$\3$\3$\7$\u0252\n$\f$\16$\u0255"+
		"\13$\3$\5$\u0258\n$\3%\3%\5%\u025c\n%\3%\3%\5%\u0260\n%\3%\7%\u0263\n"+
		"%\f%\16%\u0266\13%\3%\5%\u0269\n%\3&\3&\3&\7&\u026e\n&\f&\16&\u0271\13"+
		"&\3&\7&\u0274\n&\f&\16&\u0277\13&\3&\3&\7&\u027b\n&\f&\16&\u027e\13&\3"+
		"&\5&\u0281\n&\3\'\3\'\3\'\3\'\5\'\u0287\n\'\3(\5(\u028a\n(\3(\3(\3(\3"+
		"(\3(\5(\u0291\n(\3(\5(\u0294\n(\3)\3)\3)\3*\3*\3*\3*\7*\u029d\n*\f*\16"+
		"*\u02a0\13*\3+\3+\3+\3,\5,\u02a6\n,\3,\3,\3-\3-\5-\u02ac\n-\3-\3-\3.\3"+
		".\3.\3.\3.\3.\3.\5.\u02b7\n.\3/\3/\3/\3/\3/\3\60\7\60\u02bf\n\60\f\60"+
		"\16\60\u02c2\13\60\3\60\3\60\3\60\3\60\7\60\u02c8\n\60\f\60\16\60\u02cb"+
		"\13\60\7\60\u02cd\n\60\f\60\16\60\u02d0\13\60\3\61\3\61\3\62\5\62\u02d5"+
		"\n\62\3\62\5\62\u02d8\n\62\3\62\3\62\5\62\u02dc\n\62\3\62\5\62\u02df\n"+
		"\62\3\62\5\62\u02e2\n\62\3\62\5\62\u02e5\n\62\3\62\3\62\5\62\u02e9\n\62"+
		"\3\62\3\62\3\62\5\62\u02ee\n\62\3\62\3\62\5\62\u02f2\n\62\3\62\5\62\u02f5"+
		"\n\62\3\62\5\62\u02f8\n\62\5\62\u02fa\n\62\3\63\3\63\5\63\u02fe\n\63\3"+
		"\63\3\63\3\63\3\63\5\63\u0304\n\63\3\64\3\64\3\64\5\64\u0309\n\64\3\64"+
		"\7\64\u030c\n\64\f\64\16\64\u030f\13\64\3\64\3\64\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\5\65\u031a\n\65\3\66\3\66\3\66\5\66\u031f\n\66\3\66\7"+
		"\66\u0322\n\66\f\66\16\66\u0325\13\66\3\67\3\67\5\67\u0329\n\67\3\67\5"+
		"\67\u032c\n\67\3\67\3\67\3\67\38\38\39\39\39\39\79\u0337\n9\f9\169\u033a"+
		"\139\3:\5:\u033d\n:\3:\5:\u0340\n:\3:\3:\3;\5;\u0345\n;\3;\3;\3;\3;\3"+
		";\3;\6;\u034d\n;\r;\16;\u034e\3;\3;\3;\3;\5;\u0355\n;\3;\3;\3;\3;\3;\3"+
		";\5;\u035d\n;\7;\u035f\n;\f;\16;\u0362\13;\3;\3;\3;\3;\3;\7;\u0369\n;"+
		"\f;\16;\u036c\13;\3;\5;\u036f\n;\3<\6<\u0372\n<\r<\16<\u0373\3=\5=\u0377"+
		"\n=\3=\3=\3>\3>\3?\3?\5?\u037f\n?\3?\3?\3?\3?\5?\u0385\n?\3?\3?\5?\u0389"+
		"\n?\3?\3?\5?\u038d\n?\3?\7?\u0390\n?\f?\16?\u0393\13?\5?\u0395\n?\3?\5"+
		"?\u0398\n?\3@\3@\3@\3A\5A\u039e\nA\3A\3A\5A\u03a2\nA\3A\3A\5A\u03a6\n"+
		"A\3A\3A\3A\5A\u03ab\nA\5A\u03ad\nA\3A\5A\u03b0\nA\3B\3B\3B\7B\u03b5\n"+
		"B\fB\16B\u03b8\13B\3B\3B\5B\u03bc\nB\3C\3C\3D\3D\5D\u03c2\nD\6D\u03c4"+
		"\nD\rD\16D\u03c5\3E\3E\3F\3F\3F\7F\u03cd\nF\fF\16F\u03d0\13F\3F\7F\u03d3"+
		"\nF\fF\16F\u03d6\13F\3F\3F\7F\u03da\nF\fF\16F\u03dd\13F\3F\5F\u03e0\n"+
		"F\3F\3F\7F\u03e4\nF\fF\16F\u03e7\13F\3G\3G\7G\u03eb\nG\fG\16G\u03ee\13"+
		"G\3G\3G\7G\u03f2\nG\fG\16G\u03f5\13G\3G\3G\5G\u03f9\nG\3H\3H\3H\7H\u03fe"+
		"\nH\fH\16H\u0401\13H\3H\3H\7H\u0405\nH\fH\16H\u0408\13H\3H\3H\7H\u040c"+
		"\nH\fH\16H\u040f\13H\3H\3H\7H\u0413\nH\fH\16H\u0416\13H\3H\3H\5H\u041a"+
		"\nH\3I\3I\7I\u041e\nI\fI\16I\u0421\13I\3I\3I\7I\u0425\nI\fI\16I\u0428"+
		"\13I\3I\5I\u042b\nI\3J\3J\7J\u042f\nJ\fJ\16J\u0432\13J\3J\3J\7J\u0436"+
		"\nJ\fJ\16J\u0439\13J\3J\5J\u043c\nJ\3K\3K\7K\u0440\nK\fK\16K\u0443\13"+
		"K\3K\3K\7K\u0447\nK\fK\16K\u044a\13K\3K\5K\u044d\nK\3L\3L\7L\u0451\nL"+
		"\fL\16L\u0454\13L\3L\3L\7L\u0458\nL\fL\16L\u045b\13L\3L\5L\u045e\nL\3"+
		"M\3M\7M\u0462\nM\fM\16M\u0465\13M\3M\3M\7M\u0469\nM\fM\16M\u046c\13M\3"+
		"M\5M\u046f\nM\3N\3N\7N\u0473\nN\fN\16N\u0476\13N\3N\3N\7N\u047a\nN\fN"+
		"\16N\u047d\13N\3N\3N\5N\u0481\nN\3O\3O\7O\u0485\nO\fO\16O\u0488\13O\3"+
		"O\3O\7O\u048c\nO\fO\16O\u048f\13O\3O\3O\5O\u0493\nO\3P\3P\7P\u0497\nP"+
		"\fP\16P\u049a\13P\3P\3P\7P\u049e\nP\fP\16P\u04a1\13P\3P\5P\u04a4\nP\3"+
		"Q\3Q\7Q\u04a8\nQ\fQ\16Q\u04ab\13Q\3Q\3Q\7Q\u04af\nQ\fQ\16Q\u04b2\13Q\3"+
		"Q\5Q\u04b5\nQ\3R\3R\7R\u04b9\nR\fR\16R\u04bc\13R\3R\3R\7R\u04c0\nR\fR"+
		"\16R\u04c3\13R\3R\5R\u04c6\nR\3S\3S\3S\3S\3S\3S\5S\u04ce\nS\3T\3T\7T\u04d2"+
		"\nT\fT\16T\u04d5\13T\3T\7T\u04d8\nT\fT\16T\u04db\13T\3U\3U\3U\3U\3U\5"+
		"U\u04e2\nU\3V\5V\u04e5\nV\3V\3V\7V\u04e9\nV\fV\16V\u04ec\13V\3V\3V\7V"+
		"\u04f0\nV\fV\16V\u04f3\13V\3V\3V\5V\u04f7\nV\3V\3V\3V\5V\u04fc\nV\3V\3"+
		"V\7V\u0500\nV\fV\16V\u0503\13V\3V\3V\7V\u0507\nV\fV\16V\u050a\13V\3V\3"+
		"V\5V\u050e\nV\3V\3V\5V\u0512\nV\3W\3W\7W\u0516\nW\fW\16W\u0519\13W\3W"+
		"\3W\3X\3X\7X\u051f\nX\fX\16X\u0522\13X\3X\3X\3X\3X\3X\3X\7X\u052a\nX\f"+
		"X\16X\u052d\13X\3X\3X\5X\u0531\nX\3Y\3Y\3Z\3Z\7Z\u0537\nZ\fZ\16Z\u053a"+
		"\13Z\3Z\3Z\3Z\3Z\3Z\3Z\7Z\u0542\nZ\fZ\16Z\u0545\13Z\3Z\5Z\u0548\nZ\3["+
		"\3[\7[\u054c\n[\f[\16[\u054f\13[\3[\7[\u0552\n[\f[\16[\u0555\13[\3\\\3"+
		"\\\3]\3]\3^\3^\3^\5^\u055e\n^\3^\3^\7^\u0562\n^\f^\16^\u0565\13^\3^\5"+
		"^\u0568\n^\3^\3^\5^\u056c\n^\3^\3^\7^\u0570\n^\f^\16^\u0573\13^\3^\3^"+
		"\3^\3^\3^\3^\7^\u057b\n^\f^\16^\u057e\13^\3^\3^\3^\3^\3^\3^\3^\7^\u0587"+
		"\n^\f^\16^\u058a\13^\3^\5^\u058d\n^\3^\3^\3^\3^\7^\u0593\n^\f^\16^\u0596"+
		"\13^\3^\5^\u0599\n^\3^\3^\3^\7^\u059e\n^\f^\16^\u05a1\13^\3^\7^\u05a4"+
		"\n^\f^\16^\u05a7\13^\3_\6_\u05aa\n_\r_\16_\u05ab\3_\3_\7_\u05b0\n_\f_"+
		"\16_\u05b3\13_\3_\6_\u05b6\n_\r_\16_\u05b7\7_\u05ba\n_\f_\16_\u05bd\13"+
		"_\5_\u05bf\n_\3`\3`\7`\u05c3\n`\f`\16`\u05c6\13`\3a\3a\3a\3a\3a\3a\5a"+
		"\u05ce\na\3b\3b\3c\3c\3d\3d\3e\3e\3f\3f\3g\3g\3h\3h\3i\3i\3j\3j\3j\5j"+
		"\u05e3\nj\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j"+
		"\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\5j\u060d"+
		"\nj\3k\3k\3l\3l\3m\3m\3m\3m\3m\3n\3n\3n\3n\3n\3n\3n\3n\3n\6n\u0621\nn"+
		"\rn\16n\u0622\3o\3o\3p\3p\3q\3q\3r\3r\3s\3s\3t\3t\3u\3u\3v\3v\3w\3w\3"+
		"x\3x\3y\3y\3z\3z\3z\5z\u063e\nz\3z\3z\3z\5z\u0643\nz\3{\5{\u0646\n{\3"+
		"{\3{\5{\u064a\n{\3{\5{\u064d\n{\3{\3{\5{\u0651\n{\3{\3{\3{\3{\3{\5{\u0658"+
		"\n{\3|\6|\u065b\n|\r|\16|\u065c\3}\3}\3}\3}\3}\5}\u0664\n}\3~\7~\u0667"+
		"\n~\f~\16~\u066a\13~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\5~\u0678\n~\3"+
		"~\7~\u067b\n~\f~\16~\u067e\13~\7~\u0680\n~\f~\16~\u0683\13~\3\177\7\177"+
		"\u0686\n\177\f\177\16\177\u0689\13\177\3\177\3\177\3\177\3\177\3\177\3"+
		"\177\3\177\3\177\3\177\3\177\3\177\3\177\5\177\u0697\n\177\3\177\7\177"+
		"\u069a\n\177\f\177\16\177\u069d\13\177\7\177\u069f\n\177\f\177\16\177"+
		"\u06a2\13\177\3\u0080\7\u0080\u06a5\n\u0080\f\u0080\16\u0080\u06a8\13"+
		"\u0080\3\u0080\3\u0080\3\u0080\3\u0080\7\u0080\u06ae\n\u0080\f\u0080\16"+
		"\u0080\u06b1\13\u0080\7\u0080\u06b3\n\u0080\f\u0080\16\u0080\u06b6\13"+
		"\u0080\3\u0080\2\3\u00ba\u0081\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"+
		"\u00fc\u00fe\2\35\7\2\7\rKNQQZZ\\\\\4\2\21\23oo\b\2\r\r\31\32LLYY\\\\"+
		"oo\3\2WX\3\2rt\3\2\"#\4\2\22\22$$\5\2\23\23\26\26%%\3\2*+\7\2\22\22\26"+
		"\26!!$$-.\4\2\17\20/\60\4\2ruwx\5\2\7\tKKQQ\4\2\26\26!!\3\2\n\f\4\2\61"+
		"\61]]\4\2\6\6\62;\3\2<=\3\2\4\5\5\2\4\5&\'pq\3\2\3\5\4\2\4\5\17\20\3\2"+
		"pq\3\2&\'\4\2\3\3&\'\4\2\3\3\16\16\6\2\3\5\16\16&\'pq\u0779\2\u0109\3"+
		"\2\2\2\4\u010c\3\2\2\2\6\u0113\3\2\2\2\b\u0119\3\2\2\2\n\u011b\3\2\2\2"+
		"\f\u011f\3\2\2\2\16\u0123\3\2\2\2\20\u0125\3\2\2\2\22\u012d\3\2\2\2\24"+
		"\u0141\3\2\2\2\26\u014b\3\2\2\2\30\u015a\3\2\2\2\32\u015c\3\2\2\2\34\u0162"+
		"\3\2\2\2\36\u0164\3\2\2\2 \u0168\3\2\2\2\"\u0174\3\2\2\2$\u0176\3\2\2"+
		"\2&\u018a\3\2\2\2(\u01ab\3\2\2\2*\u01b3\3\2\2\2,\u01bb\3\2\2\2.\u01bd"+
		"\3\2\2\2\60\u01c1\3\2\2\2\62\u01c9\3\2\2\2\64\u01d9\3\2\2\2\66\u01f3\3"+
		"\2\2\28\u01f9\3\2\2\2:\u01fe\3\2\2\2<\u0202\3\2\2\2>\u0207\3\2\2\2@\u0217"+
		"\3\2\2\2B\u021c\3\2\2\2D\u0240\3\2\2\2F\u0257\3\2\2\2H\u0259\3\2\2\2J"+
		"\u026a\3\2\2\2L\u0286\3\2\2\2N\u0289\3\2\2\2P\u0295\3\2\2\2R\u0298\3\2"+
		"\2\2T\u02a1\3\2\2\2V\u02a5\3\2\2\2X\u02a9\3\2\2\2Z\u02b6\3\2\2\2\\\u02b8"+
		"\3\2\2\2^\u02c0\3\2\2\2`\u02d1\3\2\2\2b\u02f9\3\2\2\2d\u0303\3\2\2\2f"+
		"\u0305\3\2\2\2h\u0319\3\2\2\2j\u031b\3\2\2\2l\u0326\3\2\2\2n\u0330\3\2"+
		"\2\2p\u0332\3\2\2\2r\u033c\3\2\2\2t\u036e\3\2\2\2v\u0371\3\2\2\2x\u0376"+
		"\3\2\2\2z\u037a\3\2\2\2|\u0397\3\2\2\2~\u0399\3\2\2\2\u0080\u039d\3\2"+
		"\2\2\u0082\u03bb\3\2\2\2\u0084\u03bd\3\2\2\2\u0086\u03c3\3\2\2\2\u0088"+
		"\u03c7\3\2\2\2\u008a\u03c9\3\2\2\2\u008c\u03e8\3\2\2\2\u008e\u0419\3\2"+
		"\2\2\u0090\u041b\3\2\2\2\u0092\u042c\3\2\2\2\u0094\u043d\3\2\2\2\u0096"+
		"\u044e\3\2\2\2\u0098\u045f\3\2\2\2\u009a\u0470\3\2\2\2\u009c\u0482\3\2"+
		"\2\2\u009e\u0494\3\2\2\2\u00a0\u04a5\3\2\2\2\u00a2\u04b6\3\2\2\2\u00a4"+
		"\u04cd\3\2\2\2\u00a6\u04cf\3\2\2\2\u00a8\u04e1\3\2\2\2\u00aa\u0511\3\2"+
		"\2\2\u00ac\u0513\3\2\2\2\u00ae\u0530\3\2\2\2\u00b0\u0532\3\2\2\2\u00b2"+
		"\u0547\3\2\2\2\u00b4\u0549\3\2\2\2\u00b6\u0556\3\2\2\2\u00b8\u0558\3\2"+
		"\2\2\u00ba\u056b\3\2\2\2\u00bc\u05be\3\2\2\2\u00be\u05c0\3\2\2\2\u00c0"+
		"\u05cd\3\2\2\2\u00c2\u05cf\3\2\2\2\u00c4\u05d1\3\2\2\2\u00c6\u05d3\3\2"+
		"\2\2\u00c8\u05d5\3\2\2\2\u00ca\u05d7\3\2\2\2\u00cc\u05d9\3\2\2\2\u00ce"+
		"\u05db\3\2\2\2\u00d0\u05dd\3\2\2\2\u00d2\u060c\3\2\2\2\u00d4\u060e\3\2"+
		"\2\2\u00d6\u0610\3\2\2\2\u00d8\u0612\3\2\2\2\u00da\u0620\3\2\2\2\u00dc"+
		"\u0624\3\2\2\2\u00de\u0626\3\2\2\2\u00e0\u0628\3\2\2\2\u00e2\u062a\3\2"+
		"\2\2\u00e4\u062c\3\2\2\2\u00e6\u062e\3\2\2\2\u00e8\u0630\3\2\2\2\u00ea"+
		"\u0632\3\2\2\2\u00ec\u0634\3\2\2\2\u00ee\u0636\3\2\2\2\u00f0\u0638\3\2"+
		"\2\2\u00f2\u063a\3\2\2\2\u00f4\u0657\3\2\2\2\u00f6\u065a\3\2\2\2\u00f8"+
		"\u0663\3\2\2\2\u00fa\u0668\3\2\2\2\u00fc\u0687\3\2\2\2\u00fe\u06a6\3\2"+
		"\2\2\u0100\u0108\5\6\4\2\u0101\u0108\5D#\2\u0102\u0108\5`\61\2\u0103\u0108"+
		"\5\4\3\2\u0104\u0108\5\u00c2b\2\u0105\u0108\58\35\2\u0106\u0108\5\u00f0"+
		"y\2\u0107\u0100\3\2\2\2\u0107\u0101\3\2\2\2\u0107\u0102\3\2\2\2\u0107"+
		"\u0103\3\2\2\2\u0107\u0104\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2"+
		"\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\3\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\7U\2\2\u010d\u010e\7V\2\2\u010e"+
		"\u010f\5\u0082B\2\u010f\u0110\7\3\2\2\u0110\5\3\2\2\2\u0111\u0114\5\b"+
		"\5\2\u0112\u0114\5\26\f\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114"+
		"\7\3\2\2\2\u0115\u011a\5\n\6\2\u0116\u011a\5\f\7\2\u0117\u011a\5\16\b"+
		"\2\u0118\u011a\5\20\t\2\u0119\u0115\3\2\2\2\u0119\u0116\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a\t\3\2\2\2\u011b\u011c\7^\2\2"+
		"\u011c\u011d\5\22\n\2\u011d\u011e\b\6\1\2\u011e\13\3\2\2\2\u011f\u0120"+
		"\7_\2\2\u0120\u0121\5\22\n\2\u0121\u0122\b\7\1\2\u0122\r\3\2\2\2\u0123"+
		"\u0124\7`\2\2\u0124\17\3\2\2\2\u0125\u0126\7a\2\2\u0126\21\3\2\2\2\u0127"+
		"\u012e\5\24\13\2\u0128\u0129\7\4\2\2\u0129\u012a\5\24\13\2\u012a\u012b"+
		"\7\5\2\2\u012b\u012e\3\2\2\2\u012c\u012e\5\36\20\2\u012d\u0127\3\2\2\2"+
		"\u012d\u0128\3\2\2\2\u012d\u012c\3\2\2\2\u012e\23\3\2\2\2\u012f\u0142"+
		"\5\u008aF\2\u0130\u0131\5t;\2\u0131\u0135\5\u00f4{\2\u0132\u0134\7y\2"+
		"\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136"+
		"\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013c\7\6\2\2\u0139"+
		"\u013b\7y\2\2\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2"+
		"\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f"+
		"\u0140\5\u008cG\2\u0140\u0142\3\2\2\2\u0141\u012f\3\2\2\2\u0141\u0130"+
		"\3\2\2\2\u0142\25\3\2\2\2\u0143\u014c\5\30\r\2\u0144\u014c\5\32\16\2\u0145"+
		"\u014c\5&\24\2\u0146\u014c\5(\25\2\u0147\u014c\5*\26\2\u0148\u014c\5,"+
		"\27\2\u0149\u014c\5\64\33\2\u014a\u014c\5\66\34\2\u014b\u0143\3\2\2\2"+
		"\u014b\u0144\3\2\2\2\u014b\u0145\3\2\2\2\u014b\u0146\3\2\2\2\u014b\u0147"+
		"\3\2\2\2\u014b\u0148\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014a\3\2\2\2\u014c"+
		"\27\3\2\2\2\u014d\u014e\7b\2\2\u014e\u014f\5\34\17\2\u014f\u0150\7\4\2"+
		"\2\u0150\u0151\5 \21\2\u0151\u0152\7\5\2\2\u0152\u0153\5\"\22\2\u0153"+
		"\u015b\3\2\2\2\u0154\u0155\7b\2\2\u0155\u0156\5\34\17\2\u0156\u0157\5"+
		"\"\22\2\u0157\u015b\3\2\2\2\u0158\u0159\7b\2\2\u0159\u015b\5\34\17\2\u015a"+
		"\u014d\3\2\2\2\u015a\u0154\3\2\2\2\u015a\u0158\3\2\2\2\u015b\31\3\2\2"+
		"\2\u015c\u015d\7c\2\2\u015d\u015e\5\34\17\2\u015e\33\3\2\2\2\u015f\u0163"+
		"\5\u0082B\2\u0160\u0163\5\u00caf\2\u0161\u0163\5\36\20\2\u0162\u015f\3"+
		"\2\2\2\u0162\u0160\3\2\2\2\u0162\u0161\3\2\2\2\u0163\35\3\2\2\2\u0164"+
		"\u0165\t\2\2\2\u0165\37\3\2\2\2\u0166\u0169\5\u0082B\2\u0167\u0169\7|"+
		"\2\2\u0168\u0166\3\2\2\2\u0168\u0167\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u0171\3\2\2\2\u016a\u016d\7\16\2\2\u016b\u016e\5\u0082B\2\u016c\u016e"+
		"\7|\2\2\u016d\u016b\3\2\2\2\u016d\u016c\3\2\2\2\u016e\u0170\3\2\2\2\u016f"+
		"\u016a\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2"+
		"\2\2\u0172!\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0175\b\22\1\2\u0175#\3"+
		"\2\2\2\u0176\u0177\5\34\17\2\u0177\u0183\7\4\2\2\u0178\u017e\7\16\2\2"+
		"\u0179\u017e\5t;\2\u017a\u017e\5\u008aF\2\u017b\u017e\5\u00ceh\2\u017c"+
		"\u017e\7y\2\2\u017d\u0178\3\2\2\2\u017d\u0179\3\2\2\2\u017d\u017a\3\2"+
		"\2\2\u017d\u017b\3\2\2\2\u017d\u017c\3\2\2\2\u017e\u0181\3\2\2\2\u017f"+
		"\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0184\3\2\2\2\u0181\u017f\3\2"+
		"\2\2\u0182\u0184\7L\2\2\u0183\u017f\3\2\2\2\u0183\u0182\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0186\7\5\2\2\u0186%\3\2\2\2\u0187\u0188\7d\2\2\u0188"+
		"\u018b\7x\2\2\u0189\u018b\7d\2\2\u018a\u0187\3\2\2\2\u018a\u0189\3\2\2"+
		"\2\u018b\'\3\2\2\2\u018c\u018e\7e\2\2\u018d\u018f\7x\2\2\u018e\u018d\3"+
		"\2\2\2\u018e\u018f\3\2\2\2\u018f\u01ac\3\2\2\2\u0190\u0191\7m\2\2\u0191"+
		"\u0192\7\4\2\2\u0192\u0194\7\4\2\2\u0193\u0195\5\34\17\2\u0194\u0193\3"+
		"\2\2\2\u0194\u0195\3\2\2\2\u0195\u0197\3\2\2\2\u0196\u0198\7y\2\2\u0197"+
		"\u0196\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u01a7\3\2\2\2\u0199\u019a\7\4"+
		"\2\2\u019a\u01a2\5\34\17\2\u019b\u019d\7\16\2\2\u019c\u019e\7y\2\2\u019d"+
		"\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\5\34"+
		"\17\2\u01a0\u019b\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a6\7\5"+
		"\2\2\u01a6\u01a8\3\2\2\2\u01a7\u0199\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9\u01aa\7\5\2\2\u01aa\u01ac\7\5\2\2\u01ab\u018c\3\2"+
		"\2\2\u01ab\u0190\3\2\2\2\u01ac)\3\2\2\2\u01ad\u01ae\7f\2\2\u01ae\u01b4"+
		"\5.\30\2\u01af\u01b0\7f\2\2\u01b0\u01b4\5\34\17\2\u01b1\u01b2\7f\2\2\u01b2"+
		"\u01b4\5\60\31\2\u01b3\u01ad\3\2\2\2\u01b3\u01af\3\2\2\2\u01b3\u01b1\3"+
		"\2\2\2\u01b4+\3\2\2\2\u01b5\u01b6\7g\2\2\u01b6\u01bc\5.\30\2\u01b7\u01b8"+
		"\7g\2\2\u01b8\u01bc\5\34\17\2\u01b9\u01ba\7g\2\2\u01ba\u01bc\5\60\31\2"+
		"\u01bb\u01b5\3\2\2\2\u01bb\u01b7\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc-\3"+
		"\2\2\2\u01bd\u01be\7\17\2\2\u01be\u01bf\5\62\32\2\u01bf\u01c0\7\20\2\2"+
		"\u01c0/\3\2\2\2\u01c1\u01c2\5\62\32\2\u01c2\61\3\2\2\2\u01c3\u01ca\7x"+
		"\2\2\u01c4\u01c6\t\3\2\2\u01c5\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7"+
		"\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01c3\3\2"+
		"\2\2\u01c9\u01c5\3\2\2\2\u01ca\63\3\2\2\2\u01cb\u01cc\7h\2\2\u01cc\u01cd"+
		"\7s\2\2\u01cd\u01da\7x\2\2\u01ce\u01cf\7h\2\2\u01cf\u01d0\7s\2\2\u01d0"+
		"\u01da\5\34\17\2\u01d1\u01d2\7h\2\2\u01d2\u01d3\5\34\17\2\u01d3\u01d4"+
		"\7x\2\2\u01d4\u01da\3\2\2\2\u01d5\u01d6\7h\2\2\u01d6\u01da\5\34\17\2\u01d7"+
		"\u01d8\7h\2\2\u01d8\u01da\7s\2\2\u01d9\u01cb\3\2\2\2\u01d9\u01ce\3\2\2"+
		"\2\u01d9\u01d1\3\2\2\2\u01d9\u01d5\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\65"+
		"\3\2\2\2\u01db\u01dd\7i\2\2\u01dc\u01de\7j\2\2\u01dd\u01dc\3\2\2\2\u01dd"+
		"\u01de\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\7k\2\2\u01e0\u01e1\7x\2"+
		"\2\u01e1\u01f4\b\34\1\2\u01e2\u01e4\7i\2\2\u01e3\u01e5\7j\2\2\u01e4\u01e3"+
		"\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e8\7k\2\2\u01e7"+
		"\u01e9\5\u0082B\2\u01e8\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01e8"+
		"\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01f4\3\2\2\2\u01ec\u01ee\7i\2\2\u01ed"+
		"\u01ef\7j\2\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\3\2"+
		"\2\2\u01f0\u01f4\7k\2\2\u01f1\u01f2\7i\2\2\u01f2\u01f4\b\34\1\2\u01f3"+
		"\u01db\3\2\2\2\u01f3\u01e2\3\2\2\2\u01f3\u01ec\3\2\2\2\u01f3\u01f1\3\2"+
		"\2\2\u01f4\67\3\2\2\2\u01f5\u01fa\5:\36\2\u01f6\u01fa\5<\37\2\u01f7\u01fa"+
		"\5> \2\u01f8\u01fa\5B\"\2\u01f9\u01f5\3\2\2\2\u01f9\u01f6\3\2\2\2\u01f9"+
		"\u01f7\3\2\2\2\u01f9\u01f8\3\2\2\2\u01fa9\3\2\2\2\u01fb\u01fc\5\34\17"+
		"\2\u01fc\u01fd\7\16\2\2\u01fd\u01ff\3\2\2\2\u01fe\u01fb\3\2\2\2\u01ff"+
		"\u0200\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201;\3\2\2\2"+
		"\u0202\u0203\7P\2\2\u0203\u0205\7\24\2\2\u0204\u0206\7p\2\2\u0205\u0204"+
		"\3\2\2\2\u0205\u0206\3\2\2\2\u0206=\3\2\2\2\u0207\u0209\5$\23\2\u0208"+
		"\u020a\7y\2\2\u0209\u0208\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020c\3\2"+
		"\2\2\u020b\u020d\5\34\17\2\u020c\u020b\3\2\2\2\u020c\u020d\3\2\2\2\u020d"+
		"\u020f\3\2\2\2\u020e\u0210\7y\2\2\u020f\u020e\3\2\2\2\u020f\u0210\3\2"+
		"\2\2\u0210\u0211\3\2\2\2\u0211\u0213\5$\23\2\u0212\u0214\7y\2\2\u0213"+
		"\u0212\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\5f"+
		"\64\2\u0216?\3\2\2\2\u0217\u0218\7\25\2\2\u0218\u0219\7\4\2\2\u0219\u021a"+
		"\5Z.\2\u021a\u021b\7\5\2\2\u021bA\3\2\2\2\u021c\u021d\7n\2\2\u021dC\3"+
		"\2\2\2\u021e\u0220\5\u00d8m\2\u021f\u021e\3\2\2\2\u021f\u0220\3\2\2\2"+
		"\u0220\u0224\3\2\2\2\u0221\u0223\7y\2\2\u0222\u0221\3\2\2\2\u0223\u0226"+
		"\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0228\3\2\2\2\u0226"+
		"\u0224\3\2\2\2\u0227\u0229\5F$\2\u0228\u0227\3\2\2\2\u0228\u0229\3\2\2"+
		"\2\u0229\u022d\3\2\2\2\u022a\u022c\7y\2\2\u022b\u022a\3\2\2\2\u022c\u022f"+
		"\3\2\2\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0230\3\2\2\2\u022f"+
		"\u022d\3\2\2\2\u0230\u0234\5Z.\2\u0231\u0233\7y\2\2\u0232\u0231\3\2\2"+
		"\2\u0233\u0236\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0237"+
		"\3\2\2\2\u0236\u0234\3\2\2\2\u0237\u0239\5H%\2\u0238\u023a\5R*\2\u0239"+
		"\u0238\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023c\5P"+
		")\2\u023c\u0241\3\2\2\2\u023d\u023e\5@!\2\u023e\u023f\5P)\2\u023f\u0241"+
		"\3\2\2\2\u0240\u021f\3\2\2\2\u0240\u023d\3\2\2\2\u0241E\3\2\2\2\u0242"+
		"\u0244\5\u00ccg\2\u0243\u0242\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0243"+
		"\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u024b\3\2\2\2\u0247\u0245\3\2\2\2\u0248"+
		"\u024a\7y\2\2\u0249\u0248\3\2\2\2\u024a\u024d\3\2\2\2\u024b\u0249\3\2"+
		"\2\2\u024b\u024c\3\2\2\2\u024c\u024e\3\2\2\2\u024d\u024b\3\2\2\2\u024e"+
		"\u024f\5t;\2\u024f\u0253\3\2\2\2\u0250\u0252\5\u00ceh\2\u0251\u0250\3"+
		"\2\2\2\u0252\u0255\3\2\2\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254"+
		"\u0258\3\2\2\2\u0255\u0253\3\2\2\2\u0256\u0258\5$\23\2\u0257\u0245\3\2"+
		"\2\2\u0257\u0256\3\2\2\2\u0258G\3\2\2\2\u0259\u025b\7\4\2\2\u025a\u025c"+
		"\5J&\2\u025b\u025a\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025d\3\2\2\2\u025d"+
		"\u025f\7\5\2\2\u025e\u0260\7\26\2\2\u025f\u025e\3\2\2\2\u025f\u0260\3"+
		"\2\2\2\u0260\u0264\3\2\2\2\u0261\u0263\7O\2\2\u0262\u0261\3\2\2\2\u0263"+
		"\u0266\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0268\3\2"+
		"\2\2\u0266\u0264\3\2\2\2\u0267\u0269\5\\/\2\u0268\u0267\3\2\2\2\u0268"+
		"\u0269\3\2\2\2\u0269I\3\2\2\2\u026a\u0275\5L\'\2\u026b\u026f\7\16\2\2"+
		"\u026c\u026e\7y\2\2\u026d\u026c\3\2\2\2\u026e\u0271\3\2\2\2\u026f\u026d"+
		"\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0272\3\2\2\2\u0271\u026f\3\2\2\2\u0272"+
		"\u0274\5L\'\2\u0273\u026b\3\2\2\2\u0274\u0277\3\2\2\2\u0275\u0273\3\2"+
		"\2\2\u0275\u0276\3\2\2\2\u0276\u0280\3\2\2\2\u0277\u0275\3\2\2\2\u0278"+
		"\u027c\7\16\2\2\u0279\u027b\7y\2\2\u027a\u0279\3\2\2\2\u027b\u027e\3\2"+
		"\2\2\u027c\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027f\3\2\2\2\u027e"+
		"\u027c\3\2\2\2\u027f\u0281\7|\2\2\u0280\u0278\3\2\2\2\u0280\u0281\3\2"+
		"\2\2\u0281K\3\2\2\2\u0282\u0287\7L\2\2\u0283\u0284\5x=\2\u0284\u0285\5"+
		"N(\2\u0285\u0287\3\2\2\2\u0286\u0282\3\2\2\2\u0286\u0283\3\2\2\2\u0287"+
		"M\3\2\2\2\u0288\u028a\5\u0086D\2\u0289\u0288\3\2\2\2\u0289\u028a\3\2\2"+
		"\2\u028a\u0290\3\2\2\2\u028b\u028c\7\4\2\2\u028c\u028d\5N(\2\u028d\u028e"+
		"\7\5\2\2\u028e\u0291\3\2\2\2\u028f\u0291\5z>\2\u0290\u028b\3\2\2\2\u0290"+
		"\u028f\3\2\2\2\u0291\u0293\3\2\2\2\u0292\u0294\5\u00f8}\2\u0293\u0292"+
		"\3\2\2\2\u0293\u0294\3\2\2\2\u0294O\3\2\2\2\u0295\u0296\7p\2\2\u0296\u0297"+
		"\b)\1\2\u0297Q\3\2\2\2\u0298\u0299\7\27\2\2\u0299\u029e\5T+\2\u029a\u029b"+
		"\7\16\2\2\u029b\u029d\5T+\2\u029c\u029a\3\2\2\2\u029d\u02a0\3\2\2\2\u029e"+
		"\u029c\3\2\2\2\u029e\u029f\3\2\2\2\u029fS\3\2\2\2\u02a0\u029e\3\2\2\2"+
		"\u02a1\u02a2\5V,\2\u02a2\u02a3\5X-\2\u02a3U\3\2\2\2\u02a4\u02a6\7\30\2"+
		"\2\u02a5\u02a4\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a8"+
		"\5\u0082B\2\u02a8W\3\2\2\2\u02a9\u02ab\7\4\2\2\u02aa\u02ac\5\u008aF\2"+
		"\u02ab\u02aa\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae"+
		"\7\5\2\2\u02aeY\3\2\2\2\u02af\u02b0\7\4\2\2\u02b0\u02b1\5Z.\2\u02b1\u02b2"+
		"\7\5\2\2\u02b2\u02b7\3\2\2\2\u02b3\u02b7\5\u0082B\2\u02b4\u02b5\7Z\2\2"+
		"\u02b5\u02b7\5\u00d2j\2\u02b6\u02af\3\2\2\2\u02b6\u02b3\3\2\2\2\u02b6"+
		"\u02b4\3\2\2\2\u02b7[\3\2\2\2\u02b8\u02b9\7T\2\2\u02b9\u02ba\7\4\2\2\u02ba"+
		"\u02bb\5^\60\2\u02bb\u02bc\7\5\2\2\u02bc]\3\2\2\2\u02bd\u02bf\5\u00dc"+
		"o\2\u02be\u02bd\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0"+
		"\u02c1\3\2\2\2\u02c1\u02ce\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c4\7\4"+
		"\2\2\u02c4\u02c5\5^\60\2\u02c5\u02c9\7\5\2\2\u02c6\u02c8\5\u00dco\2\u02c7"+
		"\u02c6\3\2\2\2\u02c8\u02cb\3\2\2\2\u02c9\u02c7\3\2\2\2\u02c9\u02ca\3\2"+
		"\2\2\u02ca\u02cd\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cc\u02c3\3\2\2\2\u02cd"+
		"\u02d0\3\2\2\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf_\3\2\2\2"+
		"\u02d0\u02ce\3\2\2\2\u02d1\u02d2\5b\62\2\u02d2a\3\2\2\2\u02d3\u02d5\7"+
		"J\2\2\u02d4\u02d3\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d7\3\2\2\2\u02d6"+
		"\u02d8\5\u00d8m\2\u02d7\u02d6\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02d9"+
		"\3\2\2\2\u02d9\u02db\5l\67\2\u02da\u02dc\7y\2\2\u02db\u02da\3\2\2\2\u02db"+
		"\u02dc\3\2\2\2\u02dc\u02de\3\2\2\2\u02dd\u02df\5f\64\2\u02de\u02dd\3\2"+
		"\2\2\u02de\u02df\3\2\2\2\u02df\u02fa\3\2\2\2\u02e0\u02e2\7J\2\2\u02e1"+
		"\u02e0\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e4\3\2\2\2\u02e3\u02e5\5\u00d8"+
		"m\2\u02e4\u02e3\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6"+
		"\u02e8\5t;\2\u02e7\u02e9\7y\2\2\u02e8\u02e7\3\2\2\2\u02e8\u02e9\3\2\2"+
		"\2\u02e9\u02ea\3\2\2\2\u02ea\u02eb\5f\64\2\u02eb\u02fa\3\2\2\2\u02ec\u02ee"+
		"\7J\2\2\u02ed\u02ec\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef"+
		"\u02f1\5d\63\2\u02f0\u02f2\7y\2\2\u02f1\u02f0\3\2\2\2\u02f1\u02f2\3\2"+
		"\2\2\u02f2\u02f4\3\2\2\2\u02f3\u02f5\5f\64\2\u02f4\u02f3\3\2\2\2\u02f4"+
		"\u02f5\3\2\2\2\u02f5\u02f7\3\2\2\2\u02f6\u02f8\7\3\2\2\u02f7\u02f6\3\2"+
		"\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02fa\3\2\2\2\u02f9\u02d4\3\2\2\2\u02f9"+
		"\u02e1\3\2\2\2\u02f9\u02ed\3\2\2\2\u02fac\3\2\2\2\u02fb\u02fd\7Y\2\2\u02fc"+
		"\u02fe\5\u0082B\2\u02fd\u02fc\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff"+
		"\3\2\2\2\u02ff\u0300\7p\2\2\u0300\u0304\b\63\1\2\u0301\u0302\7Y\2\2\u0302"+
		"\u0304\5\u0082B\2\u0303\u02fb\3\2\2\2\u0303\u0301\3\2\2\2\u0304e\3\2\2"+
		"\2\u0305\u030d\5\u00f2z\2\u0306\u0308\7\16\2\2\u0307\u0309\7y\2\2\u0308"+
		"\u0307\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030c\5\u00f2"+
		"z\2\u030b\u0306\3\2\2\2\u030c\u030f\3\2\2\2\u030d\u030b\3\2\2\2\u030d"+
		"\u030e\3\2\2\2\u030e\u0310\3\2\2\2\u030f\u030d\3\2\2\2\u0310\u0311\7\3"+
		"\2\2\u0311g\3\2\2\2\u0312\u031a\5\u008cG\2\u0313\u0314\7p\2\2\u0314\u0315"+
		"\5j\66\2\u0315\u0316\7q\2\2\u0316\u031a\3\2\2\2\u0317\u0318\7p\2\2\u0318"+
		"\u031a\7q\2\2\u0319\u0312\3\2\2\2\u0319\u0313\3\2\2\2\u0319\u0317\3\2"+
		"\2\2\u031ai\3\2\2\2\u031b\u0323\5h\65\2\u031c\u031e\7\16\2\2\u031d\u031f"+
		"\7y\2\2\u031e\u031d\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0320\3\2\2\2\u0320"+
		"\u0322\5h\65\2\u0321\u031c\3\2\2\2\u0322\u0325\3\2\2\2\u0323\u0321\3\2"+
		"\2\2\u0323\u0324\3\2\2\2\u0324k\3\2\2\2\u0325\u0323\3\2\2\2\u0326\u0328"+
		"\7\\\2\2\u0327\u0329\5n8\2\u0328\u0327\3\2\2\2\u0328\u0329\3\2\2\2\u0329"+
		"\u032b\3\2\2\2\u032a\u032c\5p9\2\u032b\u032a\3\2\2\2\u032b\u032c\3\2\2"+
		"\2\u032c\u032d\3\2\2\2\u032d\u032e\7p\2\2\u032e\u032f\b\67\1\2\u032fm"+
		"\3\2\2\2\u0330\u0331\5\u0082B\2\u0331o\3\2\2\2\u0332\u0333\7\27\2\2\u0333"+
		"\u0338\5r:\2\u0334\u0335\7\16\2\2\u0335\u0337\5r:\2\u0336\u0334\3\2\2"+
		"\2\u0337\u033a\3\2\2\2\u0338\u0336\3\2\2\2\u0338\u0339\3\2\2\2\u0339q"+
		"\3\2\2\2\u033a\u0338\3\2\2\2\u033b\u033d\7Q\2\2\u033c\u033b\3\2\2\2\u033c"+
		"\u033d\3\2\2\2\u033d\u033f\3\2\2\2\u033e\u0340\5\u00d0i\2\u033f\u033e"+
		"\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u0342\5\u0082B"+
		"\2\u0342s\3\2\2\2\u0343\u0345\7P\2\2\u0344\u0343\3\2\2\2\u0344\u0345\3"+
		"\2\2\2\u0345\u034c\3\2\2\2\u0346\u034d\5\u00ccg\2\u0347\u034d\7O\2\2\u0348"+
		"\u034d\7M\2\2\u0349\u034d\7N\2\2\u034a\u034d\5\u00ceh\2\u034b\u034d\5"+
		"v<\2\u034c\u0346\3\2\2\2\u034c\u0347\3\2\2\2\u034c\u0348\3\2\2\2\u034c"+
		"\u0349\3\2\2\2\u034c\u034a\3\2\2\2\u034c\u034b\3\2\2\2\u034d\u034e\3\2"+
		"\2\2\u034e\u034c\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0354\3\2\2\2\u0350"+
		"\u0351\7\17\2\2\u0351\u0352\5\u00dan\2\u0352\u0353\7\20\2\2\u0353\u0355"+
		"\3\2\2\2\u0354\u0350\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0360\3\2\2\2\u0356"+
		"\u0357\7\30\2\2\u0357\u035c\5v<\2\u0358\u0359\7\17\2\2\u0359\u035a\5\u00da"+
		"n\2\u035a\u035b\7\20\2\2\u035b\u035d\3\2\2\2\u035c\u0358\3\2\2\2\u035c"+
		"\u035d\3\2\2\2\u035d\u035f\3\2\2\2\u035e\u0356\3\2\2\2\u035f\u0362\3\2"+
		"\2\2\u0360\u035e\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u036a\3\2\2\2\u0362"+
		"\u0360\3\2\2\2\u0363\u0369\5\u00ccg\2\u0364\u0369\7O\2\2\u0365\u0369\7"+
		"M\2\2\u0366\u0369\7N\2\2\u0367\u0369\5\u00ceh\2\u0368\u0363\3\2\2\2\u0368"+
		"\u0364\3\2\2\2\u0368\u0365\3\2\2\2\u0368\u0366\3\2\2\2\u0368\u0367\3\2"+
		"\2\2\u0369\u036c\3\2\2\2\u036a\u0368\3\2\2\2\u036a\u036b\3\2\2\2\u036b"+
		"\u036f\3\2\2\2\u036c\u036a\3\2\2\2\u036d\u036f\5$\23\2\u036e\u0344\3\2"+
		"\2\2\u036e\u036d\3\2\2\2\u036fu\3\2\2\2\u0370\u0372\t\4\2\2\u0371\u0370"+
		"\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0371\3\2\2\2\u0373\u0374\3\2\2\2\u0374"+
		"w\3\2\2\2\u0375\u0377\t\5\2\2\u0376\u0375\3\2\2\2\u0376\u0377\3\2\2\2"+
		"\u0377\u0378\3\2\2\2\u0378\u0379\5t;\2\u0379y\3\2\2\2\u037a\u037b\5\u0082"+
		"B\2\u037b{\3\2\2\2\u037c\u037e\7\4\2\2\u037d\u037f\7y\2\2\u037e\u037d"+
		"\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0381\7L\2\2\u0381"+
		"\u0398\7\5\2\2\u0382\u0384\7\4\2\2\u0383\u0385\7y\2\2\u0384\u0383\3\2"+
		"\2\2\u0384\u0385\3\2\2\2\u0385\u0394\3\2\2\2\u0386\u0388\5~@\2\u0387\u0389"+
		"\7y\2\2\u0388\u0387\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u0391\3\2\2\2\u038a"+
		"\u038c\7\16\2\2\u038b\u038d\7y\2\2\u038c\u038b\3\2\2\2\u038c\u038d\3\2"+
		"\2\2\u038d\u038e\3\2\2\2\u038e\u0390\5~@\2\u038f\u038a\3\2\2\2\u0390\u0393"+
		"\3\2\2\2\u0391\u038f\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0395\3\2\2\2\u0393"+
		"\u0391\3\2\2\2\u0394\u0386\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u0396\3\2"+
		"\2\2\u0396\u0398\7\5\2\2\u0397\u037c\3\2\2\2\u0397\u0382\3\2\2\2\u0398"+
		"}\3\2\2\2\u0399\u039a\5x=\2\u039a\u039b\5\u0080A\2\u039b\177\3\2\2\2\u039c"+
		"\u039e\5\u0086D\2\u039d\u039c\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u03ac"+
		"\3\2\2\2\u039f\u03a1\7\4\2\2\u03a0\u03a2\7y\2\2\u03a1\u03a0\3\2\2\2\u03a1"+
		"\u03a2\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a5\5\u0080A\2\u03a4\u03a6"+
		"\7y\2\2\u03a5\u03a4\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7"+
		"\u03a8\7\5\2\2\u03a8\u03ad\3\2\2\2\u03a9\u03ab\5z>\2\u03aa\u03a9\3\2\2"+
		"\2\u03aa\u03ab\3\2\2\2\u03ab\u03ad\3\2\2\2\u03ac\u039f\3\2\2\2\u03ac\u03aa"+
		"\3\2\2\2\u03ad\u03af\3\2\2\2\u03ae\u03b0\5\u00f8}\2\u03af\u03ae\3\2\2"+
		"\2\u03af\u03b0\3\2\2\2\u03b0\u0081\3\2\2\2\u03b1\u03b6\7o\2\2\u03b2\u03b3"+
		"\7\30\2\2\u03b3\u03b5\7o\2\2\u03b4\u03b2\3\2\2\2\u03b5\u03b8\3\2\2\2\u03b6"+
		"\u03b4\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03bc\3\2\2\2\u03b8\u03b6\3\2"+
		"\2\2\u03b9\u03bc\7]\2\2\u03ba\u03bc\5\u00d0i\2\u03bb\u03b1\3\2\2\2\u03bb"+
		"\u03b9\3\2\2\2\u03bb\u03ba\3\2\2\2\u03bc\u0083\3\2\2\2\u03bd\u03be\t\6"+
		"\2\2\u03be\u0085\3\2\2\2\u03bf\u03c1\5\u00ceh\2\u03c0\u03c2\7\33\2\2\u03c1"+
		"\u03c0\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c4\3\2\2\2\u03c3\u03bf\3\2"+
		"\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6"+
		"\u0087\3\2\2\2\u03c7\u03c8\5\u0086D\2\u03c8\u0089\3\2\2\2\u03c9\u03ce"+
		"\5\u008cG\2\u03ca\u03cb\7z\2\2\u03cb\u03cd\7y\2\2\u03cc\u03ca\3\2\2\2"+
		"\u03cd\u03d0\3\2\2\2\u03ce\u03cc\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03df"+
		"\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d1\u03d3\7y\2\2\u03d2\u03d1\3\2\2\2\u03d3"+
		"\u03d6\3\2\2\2\u03d4\u03d2\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d7\3\2"+
		"\2\2\u03d6\u03d4\3\2\2\2\u03d7\u03db\7\16\2\2\u03d8\u03da\7y\2\2\u03d9"+
		"\u03d8\3\2\2\2\u03da\u03dd\3\2\2\2\u03db\u03d9\3\2\2\2\u03db\u03dc\3\2"+
		"\2\2\u03dc\u03de\3\2\2\2\u03dd\u03db\3\2\2\2\u03de\u03e0\5\u008aF\2\u03df"+
		"\u03d4\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e5\3\2\2\2\u03e1\u03e2\7z"+
		"\2\2\u03e2\u03e4\7y\2\2\u03e3\u03e1\3\2\2\2\u03e4\u03e7\3\2\2\2\u03e5"+
		"\u03e3\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u008b\3\2\2\2\u03e7\u03e5\3\2"+
		"\2\2\u03e8\u03f8\5\u008eH\2\u03e9\u03eb\7y\2\2\u03ea\u03e9\3\2\2\2\u03eb"+
		"\u03ee\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03ef\3\2"+
		"\2\2\u03ee\u03ec\3\2\2\2\u03ef\u03f3\5\u00d4k\2\u03f0\u03f2\7y\2\2\u03f1"+
		"\u03f0\3\2\2\2\u03f2\u03f5\3\2\2\2\u03f3\u03f1\3\2\2\2\u03f3\u03f4\3\2"+
		"\2\2\u03f4\u03f6\3\2\2\2\u03f5\u03f3\3\2\2\2\u03f6\u03f7\5\u008cG\2\u03f7"+
		"\u03f9\3\2\2\2\u03f8\u03ec\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u008d\3\2"+
		"\2\2\u03fa\u041a\5\u0090I\2\u03fb\u03ff\5\u0090I\2\u03fc\u03fe\7y\2\2"+
		"\u03fd\u03fc\3\2\2\2\u03fe\u0401\3\2\2\2\u03ff\u03fd\3\2\2\2\u03ff\u0400"+
		"\3\2\2\2\u0400\u0402\3\2\2\2\u0401\u03ff\3\2\2\2\u0402\u0406\7\34\2\2"+
		"\u0403\u0405\7y\2\2\u0404\u0403\3\2\2\2\u0405\u0408\3\2\2\2\u0406\u0404"+
		"\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0409\3\2\2\2\u0408\u0406\3\2\2\2\u0409"+
		"\u040d\5\u008aF\2\u040a\u040c\7y\2\2\u040b\u040a\3\2\2\2\u040c\u040f\3"+
		"\2\2\2\u040d\u040b\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u0410\3\2\2\2\u040f"+
		"\u040d\3\2\2\2\u0410\u0414\7\27\2\2\u0411\u0413\7y\2\2\u0412\u0411\3\2"+
		"\2\2\u0413\u0416\3\2\2\2\u0414\u0412\3\2\2\2\u0414\u0415\3\2\2\2\u0415"+
		"\u0417\3\2\2\2\u0416\u0414\3\2\2\2\u0417\u0418\5\u008eH\2\u0418\u041a"+
		"\3\2\2\2\u0419\u03fa\3\2\2\2\u0419\u03fb\3\2\2\2\u041a\u008f\3\2\2\2\u041b"+
		"\u042a\5\u0092J\2\u041c\u041e\7y\2\2\u041d\u041c\3\2\2\2\u041e\u0421\3"+
		"\2\2\2\u041f\u041d\3\2\2\2\u041f\u0420\3\2\2\2\u0420\u0422\3\2\2\2\u0421"+
		"\u041f\3\2\2\2\u0422\u0426\7\35\2\2\u0423\u0425\7y\2\2\u0424\u0423\3\2"+
		"\2\2\u0425\u0428\3\2\2\2\u0426\u0424\3\2\2\2\u0426\u0427\3\2\2\2\u0427"+
		"\u0429\3\2\2\2\u0428\u0426\3\2\2\2\u0429\u042b\5\u0090I\2\u042a\u041f"+
		"\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u0091\3\2\2\2\u042c\u043b\5\u0094K"+
		"\2\u042d\u042f\7y\2\2\u042e\u042d\3\2\2\2\u042f\u0432\3\2\2\2\u0430\u042e"+
		"\3\2\2\2\u0430\u0431\3\2\2\2\u0431\u0433\3\2\2\2\u0432\u0430\3\2\2\2\u0433"+
		"\u0437\7\36\2\2\u0434\u0436\7y\2\2\u0435\u0434\3\2\2\2\u0436\u0439\3\2"+
		"\2\2\u0437\u0435\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u043a\3\2\2\2\u0439"+
		"\u0437\3\2\2\2\u043a\u043c\5\u0092J\2\u043b\u0430\3\2\2\2\u043b\u043c"+
		"\3\2\2\2\u043c\u0093\3\2\2\2\u043d\u044c\5\u0096L\2\u043e\u0440\7y\2\2"+
		"\u043f\u043e\3\2\2\2\u0440\u0443\3\2\2\2\u0441\u043f\3\2\2\2\u0441\u0442"+
		"\3\2\2\2\u0442\u0444\3\2\2\2\u0443\u0441\3\2\2\2\u0444\u0448\7\37\2\2"+
		"\u0445\u0447\7y\2\2\u0446\u0445\3\2\2\2\u0447\u044a\3\2\2\2\u0448\u0446"+
		"\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u044b\3\2\2\2\u044a\u0448\3\2\2\2\u044b"+
		"\u044d\5\u0094K\2\u044c\u0441\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u0095"+
		"\3\2\2\2\u044e\u045d\5\u0098M\2\u044f\u0451\7y\2\2\u0450\u044f\3\2\2\2"+
		"\u0451\u0454\3\2\2\2\u0452\u0450\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u0455"+
		"\3\2\2\2\u0454\u0452\3\2\2\2\u0455\u0459\7 \2\2\u0456\u0458\7y\2\2\u0457"+
		"\u0456\3\2\2\2\u0458\u045b\3\2\2\2\u0459\u0457\3\2\2\2\u0459\u045a\3\2"+
		"\2\2\u045a\u045c\3\2\2\2\u045b\u0459\3\2\2\2\u045c\u045e\5\u0096L\2\u045d"+
		"\u0452\3\2\2\2\u045d\u045e\3\2\2\2\u045e\u0097\3\2\2\2\u045f\u046e\5\u009a"+
		"N\2\u0460\u0462\7y\2\2\u0461\u0460\3\2\2\2\u0462\u0465\3\2\2\2\u0463\u0461"+
		"\3\2\2\2\u0463\u0464\3\2\2\2\u0464\u0466\3\2\2\2\u0465\u0463\3\2\2\2\u0466"+
		"\u046a\7!\2\2\u0467\u0469\7y\2\2\u0468\u0467\3\2\2\2\u0469\u046c\3\2\2"+
		"\2\u046a\u0468\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u046d\3\2\2\2\u046c\u046a"+
		"\3\2\2\2\u046d\u046f\5\u0098M\2\u046e\u0463\3\2\2\2\u046e\u046f\3\2\2"+
		"\2\u046f\u0099\3\2\2\2\u0470\u0480\5\u009cO\2\u0471\u0473\7y\2\2\u0472"+
		"\u0471\3\2\2\2\u0473\u0476\3\2\2\2\u0474\u0472\3\2\2\2\u0474\u0475\3\2"+
		"\2\2\u0475\u0477\3\2\2\2\u0476\u0474\3\2\2\2\u0477\u047b\5\u00d6l\2\u0478"+
		"\u047a\7y\2\2\u0479\u0478\3\2\2\2\u047a\u047d\3\2\2\2\u047b\u0479\3\2"+
		"\2\2\u047b\u047c\3\2\2\2\u047c\u047e\3\2\2\2\u047d\u047b\3\2\2\2\u047e"+
		"\u047f\5\u009aN\2\u047f\u0481\3\2\2\2\u0480\u0474\3\2\2\2\u0480\u0481"+
		"\3\2\2\2\u0481\u009b\3\2\2\2\u0482\u0492\5\u009eP\2\u0483\u0485\7y\2\2"+
		"\u0484\u0483\3\2\2\2\u0485\u0488\3\2\2\2\u0486\u0484\3\2\2\2\u0486\u0487"+
		"\3\2\2\2\u0487\u0489\3\2\2\2\u0488\u0486\3\2\2\2\u0489\u048d\5\u00c8e"+
		"\2\u048a\u048c\7y\2\2\u048b\u048a\3\2\2\2\u048c\u048f\3\2\2\2\u048d\u048b"+
		"\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u0490\3\2\2\2\u048f\u048d\3\2\2\2\u0490"+
		"\u0491\5\u009cO\2\u0491\u0493\3\2\2\2\u0492\u0486\3\2\2\2\u0492\u0493"+
		"\3\2\2\2\u0493\u009d\3\2\2\2\u0494\u04a3\5\u00a0Q\2\u0495\u0497\7y\2\2"+
		"\u0496\u0495\3\2\2\2\u0497\u049a\3\2\2\2\u0498\u0496\3\2\2\2\u0498\u0499"+
		"\3\2\2\2\u0499\u049b\3\2\2\2\u049a\u0498\3\2\2\2\u049b\u049f\t\7\2\2\u049c"+
		"\u049e\7y\2\2\u049d\u049c\3\2\2\2\u049e\u04a1\3\2\2\2\u049f\u049d\3\2"+
		"\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a2\3\2\2\2\u04a1\u049f\3\2\2\2\u04a2"+
		"\u04a4\5\u009eP\2\u04a3\u0498\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u009f"+
		"\3\2\2\2\u04a5\u04b4\5\u00a2R\2\u04a6\u04a8\7y\2\2\u04a7\u04a6\3\2\2\2"+
		"\u04a8\u04ab\3\2\2\2\u04a9\u04a7\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\u04ac"+
		"\3\2\2\2\u04ab\u04a9\3\2\2\2\u04ac\u04b0\t\b\2\2\u04ad\u04af\7y\2\2\u04ae"+
		"\u04ad\3\2\2\2\u04af\u04b2\3\2\2\2\u04b0\u04ae\3\2\2\2\u04b0\u04b1\3\2"+
		"\2\2\u04b1\u04b3\3\2\2\2\u04b2\u04b0\3\2\2\2\u04b3\u04b5\5\u00a0Q\2\u04b4"+
		"\u04a9\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5\u00a1\3\2\2\2\u04b6\u04c5\5\u00a4"+
		"S\2\u04b7\u04b9\7y\2\2\u04b8\u04b7\3\2\2\2\u04b9\u04bc\3\2\2\2\u04ba\u04b8"+
		"\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bb\u04bd\3\2\2\2\u04bc\u04ba\3\2\2\2\u04bd"+
		"\u04c1\t\t\2\2\u04be\u04c0\7y\2\2\u04bf\u04be\3\2\2\2\u04c0\u04c3\3\2"+
		"\2\2\u04c1\u04bf\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c4\3\2\2\2\u04c3"+
		"\u04c1\3\2\2\2\u04c4\u04c6\5\u00a2R\2\u04c5\u04ba\3\2\2\2\u04c5\u04c6"+
		"\3\2\2\2\u04c6\u00a3\3\2\2\2\u04c7\u04c8\7\4\2\2\u04c8\u04c9\5\u00a6T"+
		"\2\u04c9\u04ca\7\5\2\2\u04ca\u04cb\5\u00a4S\2\u04cb\u04ce\3\2\2\2\u04cc"+
		"\u04ce\5\u00a8U\2\u04cd\u04c7\3\2\2\2\u04cd\u04cc\3\2\2\2\u04ce\u00a5"+
		"\3\2\2\2\u04cf\u04d9\5t;\2\u04d0\u04d2\7y\2\2\u04d1\u04d0\3\2\2\2\u04d2"+
		"\u04d5\3\2\2\2\u04d3\u04d1\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d6\3\2"+
		"\2\2\u04d5\u04d3\3\2\2\2\u04d6\u04d8\5\u00ceh\2\u04d7\u04d3\3\2\2\2\u04d8"+
		"\u04db\3\2\2\2\u04d9\u04d7\3\2\2\2\u04d9\u04da\3\2\2\2\u04da\u00a7\3\2"+
		"\2\2\u04db\u04d9\3\2\2\2\u04dc\u04e2\5\u00acW\2\u04dd\u04e2\5\u00aeX\2"+
		"\u04de\u04e2\5\u00aaV\2\u04df\u04e2\5\u00ba^\2\u04e0\u04e2\5\u00b2Z\2"+
		"\u04e1\u04dc\3\2\2\2\u04e1\u04dd\3\2\2\2\u04e1\u04de\3\2\2\2\u04e1\u04df"+
		"\3\2\2\2\u04e1\u04e0\3\2\2\2\u04e2\u00a9\3\2\2\2\u04e3\u04e5\7\30\2\2"+
		"\u04e4\u04e3\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04ea"+
		"\7]\2\2\u04e7\u04e9\7y\2\2\u04e8\u04e7\3\2\2\2\u04e9\u04ec\3\2\2\2\u04ea"+
		"\u04e8\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04ed\3\2\2\2\u04ec\u04ea\3\2"+
		"\2\2\u04ed\u04f1\5t;\2\u04ee\u04f0\7y\2\2\u04ef\u04ee\3\2\2\2\u04f0\u04f3"+
		"\3\2\2\2\u04f1\u04ef\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04f4\3\2\2\2\u04f3"+
		"\u04f1\3\2\2\2\u04f4\u04f6\7&\2\2\u04f5\u04f7\5\u008eH\2\u04f6\u04f5\3"+
		"\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04f9\7\'\2\2\u04f9"+
		"\u0512\3\2\2\2\u04fa\u04fc\7\30\2\2\u04fb\u04fa\3\2\2\2\u04fb\u04fc\3"+
		"\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u0501\7]\2\2\u04fe\u0500\7y\2\2\u04ff"+
		"\u04fe\3\2\2\2\u0500\u0503\3\2\2\2\u0501\u04ff\3\2\2\2\u0501\u0502\3\2"+
		"\2\2\u0502\u0504\3\2\2\2\u0503\u0501\3\2\2\2\u0504\u0508\5t;\2\u0505\u0507"+
		"\7y\2\2\u0506\u0505\3\2\2\2\u0507\u050a\3\2\2\2\u0508\u0506\3\2\2\2\u0508"+
		"\u0509\3\2\2\2\u0509\u050b\3\2\2\2\u050a\u0508\3\2\2\2\u050b\u050d\7\4"+
		"\2\2\u050c\u050e\5\u008aF\2\u050d\u050c\3\2\2\2\u050d\u050e\3\2\2\2\u050e"+
		"\u050f\3\2\2\2\u050f\u0510\7\5\2\2\u0510\u0512\3\2\2\2\u0511\u04e4\3\2"+
		"\2\2\u0511\u04fb\3\2\2\2\u0512\u00ab\3\2\2\2\u0513\u0517\5\u00c6d\2\u0514"+
		"\u0516\7y\2\2\u0515\u0514\3\2\2\2\u0516\u0519\3\2\2\2\u0517\u0515\3\2"+
		"\2\2\u0517\u0518\3\2\2\2\u0518\u051a\3\2\2\2\u0519\u0517\3\2\2\2\u051a"+
		"\u051b\5\u00a4S\2\u051b\u00ad\3\2\2\2\u051c\u0520\5\u00b0Y\2\u051d\u051f"+
		"\7y\2\2\u051e\u051d\3\2\2\2\u051f\u0522\3\2\2\2\u0520\u051e\3\2\2\2\u0520"+
		"\u0521\3\2\2\2\u0521\u0523\3\2\2\2\u0522\u0520\3\2\2\2\u0523\u0524\7\4"+
		"\2\2\u0524\u0525\5\u00b4[\2\u0525\u0526\7\5\2\2\u0526\u0531\3\2\2\2\u0527"+
		"\u052b\5\u00b0Y\2\u0528\u052a\7y\2\2\u0529\u0528\3\2\2\2\u052a\u052d\3"+
		"\2\2\2\u052b\u0529\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u052e\3\2\2\2\u052d"+
		"\u052b\3\2\2\2\u052e\u052f\5\u00b6\\\2\u052f\u0531\3\2\2\2\u0530\u051c"+
		"\3\2\2\2\u0530\u0527\3\2\2\2\u0531\u00af\3\2\2\2\u0532\u0533\7(\2\2\u0533"+
		"\u00b1\3\2\2\2\u0534\u0538\7)\2\2\u0535\u0537\7y\2\2\u0536\u0535\3\2\2"+
		"\2\u0537\u053a\3\2\2\2\u0538\u0536\3\2\2\2\u0538\u0539\3\2\2\2\u0539\u053b"+
		"\3\2\2\2\u053a\u0538\3\2\2\2\u053b\u053c\7\4\2\2\u053c\u053d\5\u008aF"+
		"\2\u053d\u053e\7\5\2\2\u053e\u0548\3\2\2\2\u053f\u0543\7)\2\2\u0540\u0542"+
		"\7y\2\2\u0541\u0540\3\2\2\2\u0542\u0545\3\2\2\2\u0543\u0541\3\2\2\2\u0543"+
		"\u0544\3\2\2\2\u0544\u0546\3\2\2\2\u0545\u0543\3\2\2\2\u0546\u0548\5\u008a"+
		"F\2\u0547\u0534\3\2\2\2\u0547\u053f\3\2\2\2\u0548\u00b3\3\2\2\2\u0549"+
		"\u0553\5t;\2\u054a\u054c\7y\2\2\u054b\u054a\3\2\2\2\u054c\u054f\3\2\2"+
		"\2\u054d\u054b\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u0550\3\2\2\2\u054f\u054d"+
		"\3\2\2\2\u0550\u0552\5\u00ceh\2\u0551\u054d\3\2\2\2\u0552\u0555\3\2\2"+
		"\2\u0553\u0551\3\2\2\2\u0553\u0554\3\2\2\2\u0554\u00b5\3\2\2\2\u0555\u0553"+
		"\3\2\2\2\u0556\u0557\5\u00a8U\2\u0557\u00b7\3\2\2\2\u0558\u0559\t\n\2"+
		"\2\u0559\u00b9\3\2\2\2\u055a\u055b\b^\1\2\u055b\u056c\5\u00c0a\2\u055c"+
		"\u055e\5\u00ceh\2\u055d\u055c\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u055f"+
		"\3\2\2\2\u055f\u0563\5\u00b8]\2\u0560\u0562\7y\2\2\u0561\u0560\3\2\2\2"+
		"\u0562\u0565\3\2\2\2\u0563\u0561\3\2\2\2\u0563\u0564\3\2\2\2\u0564\u0567"+
		"\3\2\2\2\u0565\u0563\3\2\2\2\u0566\u0568\5\u00ceh\2\u0567\u0566\3\2\2"+
		"\2\u0567\u0568\3\2\2\2\u0568\u0569\3\2\2\2\u0569\u056a\5\u00c0a\2\u056a"+
		"\u056c\3\2\2\2\u056b\u055a\3\2\2\2\u056b\u055d\3\2\2\2\u056c\u05a5\3\2"+
		"\2\2\u056d\u0571\f\t\2\2\u056e\u0570\7y\2\2\u056f\u056e\3\2\2\2\u0570"+
		"\u0573\3\2\2\2\u0571\u056f\3\2\2\2\u0571\u0572\3\2\2\2\u0572\u0574\3\2"+
		"\2\2\u0573\u0571\3\2\2\2\u0574\u0575\7&\2\2\u0575\u0576\5\u008aF\2\u0576"+
		"\u0577\7\'\2\2\u0577\u05a4\3\2\2\2\u0578\u057c\f\b\2\2\u0579\u057b\7y"+
		"\2\2\u057a\u0579\3\2\2\2\u057b\u057e\3\2\2\2\u057c\u057a\3\2\2\2\u057c"+
		"\u057d\3\2\2\2\u057d\u057f\3\2\2\2\u057e\u057c\3\2\2\2\u057f\u0580\7\4"+
		"\2\2\u0580\u0581\5\u00bc_\2\u0581\u0582\7\5\2\2\u0582\u05a4\3\2\2\2\u0583"+
		"\u0584\f\7\2\2\u0584\u0588\7\21\2\2\u0585\u0587\7y\2\2\u0586\u0585\3\2"+
		"\2\2\u0587\u058a\3\2\2\2\u0588\u0586\3\2\2\2\u0588\u0589\3\2\2\2\u0589"+
		"\u058c\3\2\2\2\u058a\u0588\3\2\2\2\u058b\u058d\7[\2\2\u058c\u058b\3\2"+
		"\2\2\u058c\u058d\3\2\2\2\u058d\u058e\3\2\2\2\u058e\u05a4\5\u0082B\2\u058f"+
		"\u0590\f\6\2\2\u0590\u0594\7,\2\2\u0591\u0593\7y\2\2\u0592\u0591\3\2\2"+
		"\2\u0593\u0596\3\2\2\2\u0594\u0592\3\2\2\2\u0594\u0595\3\2\2\2\u0595\u0598"+
		"\3\2\2\2\u0596\u0594\3\2\2\2\u0597\u0599\7[\2\2\u0598\u0597\3\2\2\2\u0598"+
		"\u0599\3\2\2\2\u0599\u059a\3\2\2\2\u059a\u05a4\5\u0082B\2\u059b\u059f"+
		"\f\5\2\2\u059c\u059e\7y\2\2\u059d\u059c\3\2\2\2\u059e\u05a1\3\2\2\2\u059f"+
		"\u059d\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a2\3\2\2\2\u05a1\u059f\3\2"+
		"\2\2\u05a2\u05a4\5\u00b8]\2\u05a3\u056d\3\2\2\2\u05a3\u0578\3\2\2\2\u05a3"+
		"\u0583\3\2\2\2\u05a3\u058f\3\2\2\2\u05a3\u059b\3\2\2\2\u05a4\u05a7\3\2"+
		"\2\2\u05a5\u05a3\3\2\2\2\u05a5\u05a6\3\2\2\2\u05a6\u00bb\3\2\2\2\u05a7"+
		"\u05a5\3\2\2\2\u05a8\u05aa\5\u00be`\2\u05a9\u05a8\3\2\2\2\u05aa\u05ab"+
		"\3\2\2\2\u05ab\u05a9\3\2\2\2\u05ab\u05ac\3\2\2\2\u05ac\u05bb\3\2\2\2\u05ad"+
		"\u05b1\7\16\2\2\u05ae\u05b0\7y\2\2\u05af\u05ae\3\2\2\2\u05b0\u05b3\3\2"+
		"\2\2\u05b1\u05af\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2\u05b5\3\2\2\2\u05b3"+
		"\u05b1\3\2\2\2\u05b4\u05b6\5\u00be`\2\u05b5\u05b4\3\2\2\2\u05b6\u05b7"+
		"\3\2\2\2\u05b7\u05b5\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05ba\3\2\2\2\u05b9"+
		"\u05ad\3\2\2\2\u05ba\u05bd\3\2\2\2\u05bb\u05b9\3\2\2\2\u05bb\u05bc\3\2"+
		"\2\2\u05bc\u05bf\3\2\2\2\u05bd\u05bb\3\2\2\2\u05be\u05a9\3\2\2\2\u05be"+
		"\u05bf\3\2\2\2\u05bf\u00bd\3\2\2\2\u05c0\u05c4\5\u008cG\2\u05c1\u05c3"+
		"\7y\2\2\u05c2\u05c1\3\2\2\2\u05c3\u05c6\3\2\2\2\u05c4\u05c2\3\2\2\2\u05c4"+
		"\u05c5\3\2\2\2\u05c5\u00bf\3\2\2\2\u05c6\u05c4\3\2\2\2\u05c7\u05ce\5\u0082"+
		"B\2\u05c8\u05ce\5\u00caf\2\u05c9\u05ca\7\4\2\2\u05ca\u05cb\5\u008aF\2"+
		"\u05cb\u05cc\7\5\2\2\u05cc\u05ce\3\2\2\2\u05cd\u05c7\3\2\2\2\u05cd\u05c8"+
		"\3\2\2\2\u05cd\u05c9\3\2\2\2\u05ce\u00c1\3\2\2\2\u05cf\u05d0\7v\2\2\u05d0"+
		"\u00c3\3\2\2\2\u05d1\u05d2\7y\2\2\u05d2\u00c5\3\2\2\2\u05d3\u05d4\t\13"+
		"\2\2\u05d4\u00c7\3\2\2\2\u05d5\u05d6\t\f\2\2\u05d6\u00c9\3\2\2\2\u05d7"+
		"\u05d8\t\r\2\2\u05d8\u00cb\3\2\2\2\u05d9\u05da\t\16\2\2\u05da\u00cd\3"+
		"\2\2\2\u05db\u05dc\t\17\2\2\u05dc\u00cf\3\2\2\2\u05dd\u05de\t\20\2\2\u05de"+
		"\u00d1\3\2\2\2\u05df\u05e2\t\21\2\2\u05e0\u05e1\7&\2\2\u05e1\u05e3\7\'"+
		"\2\2\u05e2\u05e0\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3\u060d\3\2\2\2\u05e4"+
		"\u060d\7$\2\2\u05e5\u060d\7\22\2\2\u05e6\u060d\7\26\2\2\u05e7\u060d\7"+
		"\23\2\2\u05e8\u060d\7%\2\2\u05e9\u060d\7 \2\2\u05ea\u060d\7!\2\2\u05eb"+
		"\u060d\7\37\2\2\u05ec\u060d\7-\2\2\u05ed\u060d\7.\2\2\u05ee\u060d\7\6"+
		"\2\2\u05ef\u060d\7\17\2\2\u05f0\u060d\7\20\2\2\u05f1\u060d\7\62\2\2\u05f2"+
		"\u060d\7\63\2\2\u05f3\u060d\7\64\2\2\u05f4\u060d\7\65\2\2\u05f5\u060d"+
		"\7\66\2\2\u05f6\u060d\7\67\2\2\u05f7\u060d\78\2\2\u05f8\u060d\79\2\2\u05f9"+
		"\u060d\7#\2\2\u05fa\u060d\7\"\2\2\u05fb\u060d\7:\2\2\u05fc\u060d\7;\2"+
		"\2\u05fd\u060d\7<\2\2\u05fe\u060d\7=\2\2\u05ff\u060d\7/\2\2\u0600\u060d"+
		"\7\60\2\2\u0601\u060d\7\36\2\2\u0602\u060d\7\35\2\2\u0603\u060d\7+\2\2"+
		"\u0604\u060d\7*\2\2\u0605\u060d\7\16\2\2\u0606\u060d\7>\2\2\u0607\u060d"+
		"\7,\2\2\u0608\u0609\7\4\2\2\u0609\u060d\7\5\2\2\u060a\u060b\7&\2\2\u060b"+
		"\u060d\7\'\2\2\u060c\u05df\3\2\2\2\u060c\u05e4\3\2\2\2\u060c\u05e5\3\2"+
		"\2\2\u060c\u05e6\3\2\2\2\u060c\u05e7\3\2\2\2\u060c\u05e8\3\2\2\2\u060c"+
		"\u05e9\3\2\2\2\u060c\u05ea\3\2\2\2\u060c\u05eb\3\2\2\2\u060c\u05ec\3\2"+
		"\2\2\u060c\u05ed\3\2\2\2\u060c\u05ee\3\2\2\2\u060c\u05ef\3\2\2\2\u060c"+
		"\u05f0\3\2\2\2\u060c\u05f1\3\2\2\2\u060c\u05f2\3\2\2\2\u060c\u05f3\3\2"+
		"\2\2\u060c\u05f4\3\2\2\2\u060c\u05f5\3\2\2\2\u060c\u05f6\3\2\2\2\u060c"+
		"\u05f7\3\2\2\2\u060c\u05f8\3\2\2\2\u060c\u05f9\3\2\2\2\u060c\u05fa\3\2"+
		"\2\2\u060c\u05fb\3\2\2\2\u060c\u05fc\3\2\2\2\u060c\u05fd\3\2\2\2\u060c"+
		"\u05fe\3\2\2\2\u060c\u05ff\3\2\2\2\u060c\u0600\3\2\2\2\u060c\u0601\3\2"+
		"\2\2\u060c\u0602\3\2\2\2\u060c\u0603\3\2\2\2\u060c\u0604\3\2\2\2\u060c"+
		"\u0605\3\2\2\2\u060c\u0606\3\2\2\2\u060c\u0607\3\2\2\2\u060c\u0608\3\2"+
		"\2\2\u060c\u060a\3\2\2\2\u060d\u00d3\3\2\2\2\u060e\u060f\t\22\2\2\u060f"+
		"\u00d5\3\2\2\2\u0610\u0611\t\23\2\2\u0611\u00d7\3\2\2\2\u0612\u0613\7"+
		"[\2\2\u0613\u0614\7\17\2\2\u0614\u0615\5\u00dan\2\u0615\u0616\7\20\2\2"+
		"\u0616\u00d9\3\2\2\2\u0617\u0618\7\17\2\2\u0618\u0619\5\u00dan\2\u0619"+
		"\u061a\7\20\2\2\u061a\u0621\3\2\2\2\u061b\u061c\7\4\2\2\u061c\u061d\5"+
		"\u00dan\2\u061d\u061e\7\5\2\2\u061e\u0621\3\2\2\2\u061f\u0621\5\u00e2"+
		"r\2\u0620\u0617\3\2\2\2\u0620\u061b\3\2\2\2\u0620\u061f\3\2\2\2\u0621"+
		"\u0622\3\2\2\2\u0622\u0620\3\2\2\2\u0622\u0623\3\2\2\2\u0623\u00db\3\2"+
		"\2\2\u0624\u0625\n\24\2\2\u0625\u00dd\3\2\2\2\u0626\u0627\n\25\2\2\u0627"+
		"\u00df\3\2\2\2\u0628\u0629\n\26\2\2\u0629\u00e1\3\2\2\2\u062a\u062b\n"+
		"\27\2\2\u062b\u00e3\3\2\2\2\u062c\u062d\n\30\2\2\u062d\u00e5\3\2\2\2\u062e"+
		"\u062f\n\31\2\2\u062f\u00e7\3\2\2\2\u0630\u0631\n\32\2\2\u0631\u00e9\3"+
		"\2\2\2\u0632\u0633\n\33\2\2\u0633\u00eb\3\2\2\2\u0634\u0635\n\34\2\2\u0635"+
		"\u00ed\3\2\2\2\u0636\u0637\n\25\2\2\u0637\u00ef\3\2\2\2\u0638\u0639\13"+
		"\2\2\2\u0639\u00f1\3\2\2\2\u063a\u0642\5\u00f4{\2\u063b\u063d\7\4\2\2"+
		"\u063c\u063e\5\u008aF\2\u063d\u063c\3\2\2\2\u063d\u063e\3\2\2\2\u063e"+
		"\u063f\3\2\2\2\u063f\u0643\7\5\2\2\u0640\u0641\7\6\2\2\u0641\u0643\5\u00fa"+
		"~\2\u0642\u063b\3\2\2\2\u0642\u0640\3\2\2\2\u0642\u0643\3\2\2\2\u0643"+
		"\u00f3\3\2\2\2\u0644\u0646\5\u0086D\2\u0645\u0644\3\2\2\2\u0645\u0646"+
		"\3\2\2\2\u0646\u0647\3\2\2\2\u0647\u0649\5\u0082B\2\u0648\u064a\5\u00f8"+
		"}\2\u0649\u0648\3\2\2\2\u0649\u064a\3\2\2\2\u064a\u0658\3\2\2\2\u064b"+
		"\u064d\5\u0086D\2\u064c\u064b\3\2\2\2\u064c\u064d\3\2\2\2\u064d\u064e"+
		"\3\2\2\2\u064e\u0650\7\4\2\2\u064f\u0651\5\u00f6|\2\u0650\u064f\3\2\2"+
		"\2\u0650\u0651\3\2\2\2\u0651\u0652\3\2\2\2\u0652\u0653\5\u0088E\2\u0653"+
		"\u0654\5\u0082B\2\u0654\u0655\7\5\2\2\u0655\u0656\5\u00f8}\2\u0656\u0658"+
		"\3\2\2\2\u0657\u0645\3\2\2\2\u0657\u064c\3\2\2\2\u0658\u00f5\3\2\2\2\u0659"+
		"\u065b\7o\2\2\u065a\u0659\3\2\2\2\u065b\u065c\3\2\2\2\u065c\u065a\3\2"+
		"\2\2\u065c\u065d\3\2\2\2\u065d\u00f7\3\2\2\2\u065e\u065f\7&\2\2\u065f"+
		"\u0660\5\u00fe\u0080\2\u0660\u0661\7\'\2\2\u0661\u0664\3\2\2\2\u0662\u0664"+
		"\5|?\2\u0663\u065e\3\2\2\2\u0663\u0662\3\2\2\2\u0664\u00f9\3\2\2\2\u0665"+
		"\u0667\5\u00ecw\2\u0666\u0665\3\2\2\2\u0667\u066a\3\2\2\2\u0668\u0666"+
		"\3\2\2\2\u0668\u0669\3\2\2\2\u0669\u0681\3\2\2\2\u066a\u0668\3\2\2\2\u066b"+
		"\u066c\7p\2\2\u066c\u066d\5\u00fc\177\2\u066d\u066e\7q\2\2\u066e\u0678"+
		"\3\2\2\2\u066f\u0670\7\4\2\2\u0670\u0671\5\u00fc\177\2\u0671\u0672\7\5"+
		"\2\2\u0672\u0678\3\2\2\2\u0673\u0674\7&\2\2\u0674\u0675\5\u00fc\177\2"+
		"\u0675\u0676\7\'\2\2\u0676\u0678\3\2\2\2\u0677\u066b\3\2\2\2\u0677\u066f"+
		"\3\2\2\2\u0677\u0673\3\2\2\2\u0678\u067c\3\2\2\2\u0679\u067b\5\u00ecw"+
		"\2\u067a\u0679\3\2\2\2\u067b\u067e\3\2\2\2\u067c\u067a\3\2\2\2\u067c\u067d"+
		"\3\2\2\2\u067d\u0680\3\2\2\2\u067e\u067c\3\2\2\2\u067f\u0677\3\2\2\2\u0680"+
		"\u0683\3\2\2\2\u0681\u067f\3\2\2\2\u0681\u0682\3\2\2\2\u0682\u00fb\3\2"+
		"\2\2\u0683\u0681\3\2\2\2\u0684\u0686\5\u00eex\2\u0685\u0684\3\2\2\2\u0686"+
		"\u0689\3\2\2\2\u0687\u0685\3\2\2\2\u0687\u0688\3\2\2\2\u0688\u06a0\3\2"+
		"\2\2\u0689\u0687\3\2\2\2\u068a\u068b\7p\2\2\u068b\u068c\5\u00fc\177\2"+
		"\u068c\u068d\7q\2\2\u068d\u0697\3\2\2\2\u068e\u068f\7\4\2\2\u068f\u0690"+
		"\5\u00fc\177\2\u0690\u0691\7\5\2\2\u0691\u0697\3\2\2\2\u0692\u0693\7&"+
		"\2\2\u0693\u0694\5\u00fc\177\2\u0694\u0695\7\'\2\2\u0695\u0697\3\2\2\2"+
		"\u0696\u068a\3\2\2\2\u0696\u068e\3\2\2\2\u0696\u0692\3\2\2\2\u0697\u069b"+
		"\3\2\2\2\u0698\u069a\5\u00eex\2\u0699\u0698\3\2\2\2\u069a\u069d\3\2\2"+
		"\2\u069b\u0699\3\2\2\2\u069b\u069c\3\2\2\2\u069c\u069f\3\2\2\2\u069d\u069b"+
		"\3\2\2\2\u069e\u0696\3\2\2\2\u069f\u06a2\3\2\2\2\u06a0\u069e\3\2\2\2\u06a0"+
		"\u06a1\3\2\2\2\u06a1\u00fd\3\2\2\2\u06a2\u06a0\3\2\2\2\u06a3\u06a5\5\u00e6"+
		"t\2\u06a4\u06a3\3\2\2\2\u06a5\u06a8\3\2\2\2\u06a6\u06a4\3\2\2\2\u06a6"+
		"\u06a7\3\2\2\2\u06a7\u06b4\3\2\2\2\u06a8\u06a6\3\2\2\2\u06a9\u06aa\7&"+
		"\2\2\u06aa\u06ab\5\u00fe\u0080\2\u06ab\u06af\7\'\2\2\u06ac\u06ae\5\u00e6"+
		"t\2\u06ad\u06ac\3\2\2\2\u06ae\u06b1\3\2\2\2\u06af\u06ad\3\2\2\2\u06af"+
		"\u06b0\3\2\2\2\u06b0\u06b3\3\2\2\2\u06b1\u06af\3\2\2\2\u06b2\u06a9\3\2"+
		"\2\2\u06b3\u06b6\3\2\2\2\u06b4\u06b2\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5"+
		"\u00ff\3\2\2\2\u06b6\u06b4\3\2\2\2\u00eb\u0107\u0109\u0113\u0119\u012d"+
		"\u0135\u013c\u0141\u014b\u015a\u0162\u0168\u016d\u0171\u017d\u017f\u0183"+
		"\u018a\u018e\u0194\u0197\u019d\u01a2\u01a7\u01ab\u01b3\u01bb\u01c7\u01c9"+
		"\u01d9\u01dd\u01e4\u01ea\u01ee\u01f3\u01f9\u0200\u0205\u0209\u020c\u020f"+
		"\u0213\u021f\u0224\u0228\u022d\u0234\u0239\u0240\u0245\u024b\u0253\u0257"+
		"\u025b\u025f\u0264\u0268\u026f\u0275\u027c\u0280\u0286\u0289\u0290\u0293"+
		"\u029e\u02a5\u02ab\u02b6\u02c0\u02c9\u02ce\u02d4\u02d7\u02db\u02de\u02e1"+
		"\u02e4\u02e8\u02ed\u02f1\u02f4\u02f7\u02f9\u02fd\u0303\u0308\u030d\u0319"+
		"\u031e\u0323\u0328\u032b\u0338\u033c\u033f\u0344\u034c\u034e\u0354\u035c"+
		"\u0360\u0368\u036a\u036e\u0373\u0376\u037e\u0384\u0388\u038c\u0391\u0394"+
		"\u0397\u039d\u03a1\u03a5\u03aa\u03ac\u03af\u03b6\u03bb\u03c1\u03c5\u03ce"+
		"\u03d4\u03db\u03df\u03e5\u03ec\u03f3\u03f8\u03ff\u0406\u040d\u0414\u0419"+
		"\u041f\u0426\u042a\u0430\u0437\u043b\u0441\u0448\u044c\u0452\u0459\u045d"+
		"\u0463\u046a\u046e\u0474\u047b\u0480\u0486\u048d\u0492\u0498\u049f\u04a3"+
		"\u04a9\u04b0\u04b4\u04ba\u04c1\u04c5\u04cd\u04d3\u04d9\u04e1\u04e4\u04ea"+
		"\u04f1\u04f6\u04fb\u0501\u0508\u050d\u0511\u0517\u0520\u052b\u0530\u0538"+
		"\u0543\u0547\u054d\u0553\u055d\u0563\u0567\u056b\u0571\u057c\u0588\u058c"+
		"\u0594\u0598\u059f\u05a3\u05a5\u05ab\u05b1\u05b7\u05bb\u05be\u05c4\u05cd"+
		"\u05e2\u060c\u0620\u0622\u063d\u0642\u0645\u0649\u064c\u0650\u0657\u065c"+
		"\u0663\u0668\u0677\u067c\u0681\u0687\u0696\u069b\u06a0\u06a6\u06af\u06b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}