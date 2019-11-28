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
		T__52=53, T__53=54, T__54=55, IF=56, ELSE=57, FOR=58, WHILE=59, BREAK=60, 
		CASE=61, CONTINUE=62, SWITCH=63, DO=64, GOTO=65, RETURN=66, TYPEDEF=67, 
		STATIC=68, VOID=69, UNSIGNED=70, SIGNED=71, LONG=72, CV_QUALIFIER=73, 
		VIRTUAL=74, TRY=75, CATCH=76, THROW=77, USING=78, NAMESPACE=79, AUTO=80, 
		REGISTER=81, SPECIAL_DATA=82, PRE_IF=83, PRE_ELIF=84, PRE_ELSE=85, PRE_ENDIF=86, 
		PRE_DEFINE=87, PRE_UNDEF=88, PRE_DIAGNOSTIC=89, PRE_OTHER=90, PRE_INCLUDE=91, 
		PRE_INCLUDE_NEXT=92, PRE_LINE=93, PRE_PRAGMA=94, PRE_GCC=95, PRE_PRAGMA_KEYWORDS=96, 
		PRE_STR=97, OPERATOR=98, TEMPLATE=99, NEW=100, CLASS_KEY=101, ALPHA_NUMERIC=102, 
		OPENING_CURLY=103, CLOSING_CURLY=104, HEX_LITERAL=105, DECIMAL_LITERAL=106, 
		OCTAL_LITERAL=107, FLOATING_POINT_LITERAL=108, COMMENT=109, CHAR=110, 
		STRING=111, NEWLINE=112, ESCAPE=113, WHITESPACE=114, ELLIPSIS=115, OTHER=116;
	public static final int
		RULE_code = 0, RULE_using_directive = 1, RULE_pre_statement = 2, RULE_pre_blockstarter = 3, 
		RULE_pre_if_statement = 4, RULE_pre_elif_statement = 5, RULE_pre_else_statement = 6, 
		RULE_pre_endif_statement = 7, RULE_pre_if_condition = 8, RULE_condition = 9, 
		RULE_pre_command = 10, RULE_pre_define = 11, RULE_pre_undef = 12, RULE_pre_macro_identifier = 13, 
		RULE_pre_macro_parameters = 14, RULE_pre_macro = 15, RULE_pre_diagnostic = 16, 
		RULE_pre_other = 17, RULE_pre_include = 18, RULE_pre_include_next = 19, 
		RULE_pre_include_system_header = 20, RULE_pre_include_local_file = 21, 
		RULE_pre_include_filename = 22, RULE_pre_line = 23, RULE_pre_pragma = 24, 
		RULE_expr = 25, RULE_assign_expr = 26, RULE_conditional_expression = 27, 
		RULE_or_expression = 28, RULE_and_expression = 29, RULE_inclusive_or_expression = 30, 
		RULE_exclusive_or_expression = 31, RULE_bit_and_expression = 32, RULE_equality_expression = 33, 
		RULE_relational_expression = 34, RULE_shift_expression = 35, RULE_additive_expression = 36, 
		RULE_multiplicative_expression = 37, RULE_cast_expression = 38, RULE_cast_target = 39, 
		RULE_unary_expression = 40, RULE_new_expression = 41, RULE_unary_op_and_cast_expr = 42, 
		RULE_sizeof_expression = 43, RULE_sizeof = 44, RULE_defined_expression = 45, 
		RULE_sizeof_operand = 46, RULE_sizeof_operand2 = 47, RULE_inc_dec = 48, 
		RULE_postfix_expression = 49, RULE_macroCall = 50, RULE_function_argument_list = 51, 
		RULE_function_argument = 52, RULE_primary_expression = 53, RULE_comment = 54, 
		RULE_newline = 55, RULE_unary_operator = 56, RULE_relational_operator = 57, 
		RULE_constant = 58, RULE_function_decl_specifiers = 59, RULE_ptr_operator = 60, 
		RULE_access_specifier = 61, RULE_operator = 62, RULE_assignment_operator = 63, 
		RULE_equality_operator = 64, RULE_template_decl_start = 65, RULE_template_param_list = 66, 
		RULE_no_brackets = 67, RULE_no_brackets_curlies_or_squares = 68, RULE_no_brackets_or_semicolon = 69, 
		RULE_no_angle_brackets_or_brackets = 70, RULE_no_curlies = 71, RULE_no_squares = 72, 
		RULE_no_squares_or_semicolon = 73, RULE_no_comma_or_semicolon = 74, RULE_assign_water = 75, 
		RULE_assign_water_l2 = 76, RULE_water = 77, RULE_function_def = 78, RULE_return_type = 79, 
		RULE_function_param_list = 80, RULE_parameter_decl_clause = 81, RULE_parameter_decl = 82, 
		RULE_parameter_id = 83, RULE_compound_statement = 84, RULE_ctor_list = 85, 
		RULE_ctor_initializer = 86, RULE_initializer_id = 87, RULE_ctor_expr = 88, 
		RULE_function_name = 89, RULE_exception_specification = 90, RULE_type_id_list = 91, 
		RULE_init_declarator = 92, RULE_declarator = 93, RULE_callingConvetion = 94, 
		RULE_type_suffix = 95, RULE_assign_expr_w_ = 96, RULE_assign_expr_w__l2 = 97, 
		RULE_constant_expr_w_ = 98, RULE_simple_decl = 99, RULE_var_decl = 100, 
		RULE_special_datatype = 101, RULE_init_declarator_list = 102, RULE_initializer = 103, 
		RULE_initializer_list = 104, RULE_class_def = 105, RULE_class_name = 106, 
		RULE_base_classes = 107, RULE_base_class = 108, RULE_type_name = 109, 
		RULE_base_type = 110, RULE_param_decl_specifiers = 111, RULE_parameter_name = 112, 
		RULE_param_type_list = 113, RULE_param_type = 114, RULE_param_type_id = 115, 
		RULE_identifier = 116, RULE_number = 117, RULE_ptrs = 118, RULE_func_ptrs = 119;
	public static final String[] ruleNames = {
		"code", "using_directive", "pre_statement", "pre_blockstarter", "pre_if_statement", 
		"pre_elif_statement", "pre_else_statement", "pre_endif_statement", "pre_if_condition", 
		"condition", "pre_command", "pre_define", "pre_undef", "pre_macro_identifier", 
		"pre_macro_parameters", "pre_macro", "pre_diagnostic", "pre_other", "pre_include", 
		"pre_include_next", "pre_include_system_header", "pre_include_local_file", 
		"pre_include_filename", "pre_line", "pre_pragma", "expr", "assign_expr", 
		"conditional_expression", "or_expression", "and_expression", "inclusive_or_expression", 
		"exclusive_or_expression", "bit_and_expression", "equality_expression", 
		"relational_expression", "shift_expression", "additive_expression", "multiplicative_expression", 
		"cast_expression", "cast_target", "unary_expression", "new_expression", 
		"unary_op_and_cast_expr", "sizeof_expression", "sizeof", "defined_expression", 
		"sizeof_operand", "sizeof_operand2", "inc_dec", "postfix_expression", 
		"macroCall", "function_argument_list", "function_argument", "primary_expression", 
		"comment", "newline", "unary_operator", "relational_operator", "constant", 
		"function_decl_specifiers", "ptr_operator", "access_specifier", "operator", 
		"assignment_operator", "equality_operator", "template_decl_start", "template_param_list", 
		"no_brackets", "no_brackets_curlies_or_squares", "no_brackets_or_semicolon", 
		"no_angle_brackets_or_brackets", "no_curlies", "no_squares", "no_squares_or_semicolon", 
		"no_comma_or_semicolon", "assign_water", "assign_water_l2", "water", "function_def", 
		"return_type", "function_param_list", "parameter_decl_clause", "parameter_decl", 
		"parameter_id", "compound_statement", "ctor_list", "ctor_initializer", 
		"initializer_id", "ctor_expr", "function_name", "exception_specification", 
		"type_id_list", "init_declarator", "declarator", "callingConvetion", "type_suffix", 
		"assign_expr_w_", "assign_expr_w__l2", "constant_expr_w_", "simple_decl", 
		"var_decl", "special_datatype", "init_declarator_list", "initializer", 
		"initializer_list", "class_def", "class_name", "base_classes", "base_class", 
		"type_name", "base_type", "param_decl_specifiers", "parameter_name", "param_type_list", 
		"param_type", "param_type_id", "identifier", "number", "ptrs", "func_ptrs"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "'='", "','", "'<'", "'>'", "'.'", "'-'", "'/'", 
		"'?'", "':'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'<<'", "'>>'", "'+'", 
		"'*'", "'%'", "'::'", "'['", "']'", "'sizeof'", "'defined'", "'--'", "'++'", 
		"'->'", "'~'", "'!'", "'<='", "'>='", "'inline'", "'explicit'", "'friend'", 
		"'public'", "'private'", "'protected'", "'delete'", "'+='", "'-='", "'*='", 
		"'/='", "'%='", "'^='", "'&='", "'|='", "'>>='", "'<<='", "'=='", "'!='", 
		"'->*'", "'restrict'", "'if'", "'else'", "'for'", "'while'", "'break'", 
		"'case'", "'continue'", "'switch'", "'do'", "'goto'", "'return'", "'typedef'", 
		"'static'", "'void'", "'unsigned'", "'signed'", "'long'", null, "'virtual'", 
		"'try'", "'catch'", "'throw'", "'using'", "'namespace'", "'auto'", "'register'", 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "'GCC'", null, null, "'operator'", "'template'", "'new'", "'class'", 
		null, "'{'", "'}'", null, null, null, null, null, null, null, null, "'\\'", 
		null, "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "IF", "ELSE", "FOR", "WHILE", 
		"BREAK", "CASE", "CONTINUE", "SWITCH", "DO", "GOTO", "RETURN", "TYPEDEF", 
		"STATIC", "VOID", "UNSIGNED", "SIGNED", "LONG", "CV_QUALIFIER", "VIRTUAL", 
		"TRY", "CATCH", "THROW", "USING", "NAMESPACE", "AUTO", "REGISTER", "SPECIAL_DATA", 
		"PRE_IF", "PRE_ELIF", "PRE_ELSE", "PRE_ENDIF", "PRE_DEFINE", "PRE_UNDEF", 
		"PRE_DIAGNOSTIC", "PRE_OTHER", "PRE_INCLUDE", "PRE_INCLUDE_NEXT", "PRE_LINE", 
		"PRE_PRAGMA", "PRE_GCC", "PRE_PRAGMA_KEYWORDS", "PRE_STR", "OPERATOR", 
		"TEMPLATE", "NEW", "CLASS_KEY", "ALPHA_NUMERIC", "OPENING_CURLY", "CLOSING_CURLY", 
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
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE) | (1L << SWITCH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				setState(246);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(240);
					pre_statement();
					}
					break;
				case 2:
					{
					setState(241);
					function_def();
					}
					break;
				case 3:
					{
					setState(242);
					simple_decl();
					}
					break;
				case 4:
					{
					setState(243);
					using_directive();
					}
					break;
				case 5:
					{
					setState(244);
					comment();
					}
					break;
				case 6:
					{
					setState(245);
					water();
					}
					break;
				}
				}
				setState(250);
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
			setState(251);
			match(USING);
			setState(252);
			match(NAMESPACE);
			setState(253);
			identifier();
			setState(254);
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
			setState(258);
			switch (_input.LA(1)) {
			case PRE_IF:
			case PRE_ELIF:
			case PRE_ELSE:
			case PRE_ENDIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
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
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
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
			setState(264);
			switch (_input.LA(1)) {
			case PRE_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				pre_if_statement();
				}
				break;
			case PRE_ELIF:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				pre_elif_statement();
				}
				break;
			case PRE_ELSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				pre_else_statement();
				}
				break;
			case PRE_ENDIF:
				enterOuterAlt(_localctx, 4);
				{
				setState(263);
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
			setState(266);
			match(PRE_IF);
			setState(267);
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
			setState(270);
			match(PRE_ELIF);
			setState(271);
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
			setState(274);
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
			setState(276);
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
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(T__1);
				setState(280);
				condition();
				setState(281);
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
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				type_name();
				setState(287);
				declarator();
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(288);
					match(NEWLINE);
					}
					}
					setState(293);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(294);
				match(T__3);
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(295);
					match(NEWLINE);
					}
					}
					setState(300);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(301);
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
			setState(313);
			switch (_input.LA(1)) {
			case PRE_DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				pre_define();
				}
				break;
			case PRE_UNDEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				pre_undef();
				}
				break;
			case PRE_DIAGNOSTIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				pre_diagnostic();
				}
				break;
			case PRE_OTHER:
				enterOuterAlt(_localctx, 4);
				{
				setState(308);
				pre_other();
				}
				break;
			case PRE_INCLUDE:
				enterOuterAlt(_localctx, 5);
				{
				setState(309);
				pre_include();
				}
				break;
			case PRE_INCLUDE_NEXT:
				enterOuterAlt(_localctx, 6);
				{
				setState(310);
				pre_include_next();
				}
				break;
			case PRE_LINE:
				enterOuterAlt(_localctx, 7);
				{
				setState(311);
				pre_line();
				}
				break;
			case PRE_PRAGMA:
				enterOuterAlt(_localctx, 8);
				{
				setState(312);
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
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(PRE_DEFINE);
				setState(316);
				pre_macro_identifier();
				setState(317);
				match(T__1);
				setState(318);
				pre_macro_parameters();
				setState(319);
				match(T__2);
				setState(320);
				pre_macro();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(PRE_DEFINE);
				setState(323);
				pre_macro_identifier();
				setState(324);
				pre_macro();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
				match(PRE_DEFINE);
				setState(327);
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
			setState(330);
			match(PRE_UNDEF);
			setState(331);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
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
		enterRule(_localctx, 28, RULE_pre_macro_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			switch (_input.LA(1)) {
			case T__37:
			case T__38:
			case T__39:
			case ALPHA_NUMERIC:
				{
				setState(335);
				identifier();
				}
				break;
			case ELLIPSIS:
				{
				setState(336);
				match(ELLIPSIS);
				}
				break;
			case T__2:
			case T__4:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(339);
				match(T__4);
				setState(342);
				switch (_input.LA(1)) {
				case T__37:
				case T__38:
				case T__39:
				case ALPHA_NUMERIC:
					{
					setState(340);
					identifier();
					}
					break;
				case ELLIPSIS:
					{
					setState(341);
					match(ELLIPSIS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(348);
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
		enterRule(_localctx, 30, RULE_pre_macro);
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
		enterRule(_localctx, 32, RULE_pre_diagnostic);
		try {
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				match(PRE_DIAGNOSTIC);
				setState(352);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
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
		enterRule(_localctx, 34, RULE_pre_other);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(PRE_OTHER);
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(357);
				match(STRING);
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
		enterRule(_localctx, 36, RULE_pre_include);
		try {
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				match(PRE_INCLUDE);
				setState(361);
				pre_include_system_header();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				match(PRE_INCLUDE);
				setState(363);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				match(PRE_INCLUDE);
				setState(365);
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
		enterRule(_localctx, 38, RULE_pre_include_next);
		try {
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				match(PRE_INCLUDE_NEXT);
				setState(369);
				pre_include_system_header();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				match(PRE_INCLUDE_NEXT);
				setState(371);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(372);
				match(PRE_INCLUDE_NEXT);
				setState(373);
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
		enterRule(_localctx, 40, RULE_pre_include_system_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(T__5);
			setState(377);
			pre_include_filename();
			setState(378);
			match(T__6);
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
		enterRule(_localctx, 42, RULE_pre_include_local_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
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
		enterRule(_localctx, 44, RULE_pre_include_filename);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(382);
				match(STRING);
				}
				break;
			case T__7:
			case T__8:
			case T__9:
			case ALPHA_NUMERIC:
				{
				setState(384); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(383);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0) || _la==ALPHA_NUMERIC) ) {
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
					setState(386); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		enterRule(_localctx, 46, RULE_pre_line);
		try {
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				match(PRE_LINE);
				setState(391);
				match(DECIMAL_LITERAL);
				setState(392);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				match(PRE_LINE);
				setState(394);
				match(DECIMAL_LITERAL);
				setState(395);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(396);
				match(PRE_LINE);
				setState(397);
				pre_macro_identifier();
				setState(398);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(400);
				match(PRE_LINE);
				setState(401);
				pre_macro_identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(402);
				match(PRE_LINE);
				setState(403);
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
		enterRule(_localctx, 48, RULE_pre_pragma);
		int _la;
		try {
			int _alt;
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				match(PRE_PRAGMA);
				setState(408);
				_la = _input.LA(1);
				if (_la==PRE_GCC) {
					{
					setState(407);
					match(PRE_GCC);
					}
				}

				setState(410);
				match(PRE_PRAGMA_KEYWORDS);
				setState(411);
				match(STRING);
				 preProcFindMacroEnd(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				match(PRE_PRAGMA);
				setState(415);
				_la = _input.LA(1);
				if (_la==PRE_GCC) {
					{
					setState(414);
					match(PRE_GCC);
					}
				}

				setState(417);
				match(PRE_PRAGMA_KEYWORDS);
				setState(419); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(418);
						identifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(421); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(423);
				match(PRE_PRAGMA);
				setState(425);
				_la = _input.LA(1);
				if (_la==PRE_GCC) {
					{
					setState(424);
					match(PRE_GCC);
					}
				}

				setState(427);
				match(PRE_PRAGMA_KEYWORDS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(428);
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
		enterRule(_localctx, 50, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			assign_expr();
			setState(437);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(433);
					match(ESCAPE);
					setState(434);
					match(NEWLINE);
					}
					} 
				}
				setState(439);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(440);
					match(NEWLINE);
					}
					}
					setState(445);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(446);
				match(T__4);
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(447);
					match(NEWLINE);
					}
					}
					setState(452);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(453);
				expr();
				}
				break;
			}
			setState(460);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(456);
					match(ESCAPE);
					setState(457);
					match(NEWLINE);
					}
					} 
				}
				setState(462);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		enterRule(_localctx, 52, RULE_assign_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			conditional_expression();
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(464);
					match(NEWLINE);
					}
					}
					setState(469);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(470);
				assignment_operator();
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(471);
					match(NEWLINE);
					}
					}
					setState(476);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(477);
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
		enterRule(_localctx, 54, RULE_conditional_expression);
		int _la;
		try {
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				_localctx = new NormOrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				or_expression();
				}
				break;
			case 2:
				_localctx = new CndExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				or_expression();
				{
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(483);
					match(NEWLINE);
					}
					}
					setState(488);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(489);
				match(T__10);
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(490);
					match(NEWLINE);
					}
					}
					setState(495);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(496);
				expr();
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(497);
					match(NEWLINE);
					}
					}
					setState(502);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(503);
				match(T__11);
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(504);
					match(NEWLINE);
					}
					}
					setState(509);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(510);
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
		enterRule(_localctx, 56, RULE_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			and_expression();
			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(515);
					match(NEWLINE);
					}
					}
					setState(520);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(521);
				match(T__12);
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(522);
					match(NEWLINE);
					}
					}
					setState(527);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(528);
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
		enterRule(_localctx, 58, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			inclusive_or_expression();
			setState(546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(532);
					match(NEWLINE);
					}
					}
					setState(537);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(538);
				match(T__13);
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(539);
					match(NEWLINE);
					}
					}
					setState(544);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(545);
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
		enterRule(_localctx, 60, RULE_inclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			exclusive_or_expression();
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(549);
					match(NEWLINE);
					}
					}
					setState(554);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(555);
				match(T__14);
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(556);
					match(NEWLINE);
					}
					}
					setState(561);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(562);
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
		enterRule(_localctx, 62, RULE_exclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			bit_and_expression();
			setState(580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(566);
					match(NEWLINE);
					}
					}
					setState(571);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(572);
				match(T__15);
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(573);
					match(NEWLINE);
					}
					}
					setState(578);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(579);
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
		enterRule(_localctx, 64, RULE_bit_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			equality_expression();
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(583);
					match(NEWLINE);
					}
					}
					setState(588);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(589);
				match(T__16);
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(590);
					match(NEWLINE);
					}
					}
					setState(595);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(596);
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
		enterRule(_localctx, 66, RULE_equality_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			relational_expression();
			setState(615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(600);
					match(NEWLINE);
					}
					}
					setState(605);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(606);
				equality_operator();
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(607);
					match(NEWLINE);
					}
					}
					setState(612);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(613);
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
		enterRule(_localctx, 68, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			shift_expression();
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
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
				relational_operator();
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(625);
					match(NEWLINE);
					}
					}
					setState(630);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(631);
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
		enterRule(_localctx, 70, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			additive_expression();
			setState(650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(639);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(636);
					match(NEWLINE);
					}
					}
					setState(641);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(642);
				_la = _input.LA(1);
				if ( !(_la==T__17 || _la==T__18) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(643);
					match(NEWLINE);
					}
					}
					setState(648);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(649);
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
		enterRule(_localctx, 72, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			multiplicative_expression();
			setState(667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(653);
					match(NEWLINE);
					}
					}
					setState(658);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(659);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__19) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(660);
					match(NEWLINE);
					}
					}
					setState(665);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(666);
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
		enterRule(_localctx, 74, RULE_multiplicative_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			cast_expression();
			setState(684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(670);
					match(NEWLINE);
					}
					}
					setState(675);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(676);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__20) | (1L << T__21))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(677);
					match(NEWLINE);
					}
					}
					setState(682);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(683);
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
		enterRule(_localctx, 76, RULE_cast_expression);
		try {
			setState(692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(686);
				match(T__1);
				setState(687);
				cast_target();
				setState(688);
				match(T__2);
				setState(689);
				cast_expression();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(691);
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
		enterRule(_localctx, 78, RULE_cast_target);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			type_name();
			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16 || _la==T__20 || _la==NEWLINE) {
				{
				{
				setState(698);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(695);
					match(NEWLINE);
					}
					}
					setState(700);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(701);
				ptr_operator();
				}
				}
				setState(706);
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
		enterRule(_localctx, 80, RULE_unary_expression);
		try {
			setState(712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(707);
				unary_op_and_cast_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(708);
				sizeof_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(709);
				new_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(710);
				postfix_expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(711);
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
		enterRule(_localctx, 82, RULE_new_expression);
		int _la;
		try {
			setState(760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(715);
				_la = _input.LA(1);
				if (_la==T__22) {
					{
					setState(714);
					match(T__22);
					}
				}

				setState(717);
				match(NEW);
				setState(721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(718);
					match(NEWLINE);
					}
					}
					setState(723);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(724);
				type_name();
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(725);
					match(NEWLINE);
					}
					}
					setState(730);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(731);
				match(T__23);
				setState(733);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__31) | (1L << T__37) | (1L << T__38) | (1L << T__39))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (NEW - 100)) | (1L << (ALPHA_NUMERIC - 100)) | (1L << (HEX_LITERAL - 100)) | (1L << (DECIMAL_LITERAL - 100)) | (1L << (OCTAL_LITERAL - 100)) | (1L << (FLOATING_POINT_LITERAL - 100)) | (1L << (CHAR - 100)) | (1L << (STRING - 100)))) != 0)) {
					{
					setState(732);
					conditional_expression();
					}
				}

				setState(735);
				match(T__24);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(738);
				_la = _input.LA(1);
				if (_la==T__22) {
					{
					setState(737);
					match(T__22);
					}
				}

				setState(740);
				match(NEW);
				setState(744);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(741);
					match(NEWLINE);
					}
					}
					setState(746);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(747);
				type_name();
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(748);
					match(NEWLINE);
					}
					}
					setState(753);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(754);
				match(T__1);
				setState(756);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__31) | (1L << T__37) | (1L << T__38) | (1L << T__39))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (NEW - 100)) | (1L << (ALPHA_NUMERIC - 100)) | (1L << (HEX_LITERAL - 100)) | (1L << (DECIMAL_LITERAL - 100)) | (1L << (OCTAL_LITERAL - 100)) | (1L << (FLOATING_POINT_LITERAL - 100)) | (1L << (CHAR - 100)) | (1L << (STRING - 100)))) != 0)) {
					{
					setState(755);
					expr();
					}
				}

				setState(758);
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
		enterRule(_localctx, 84, RULE_unary_op_and_cast_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			unary_operator();
			setState(766);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(763);
				match(NEWLINE);
				}
				}
				setState(768);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(769);
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
		enterRule(_localctx, 86, RULE_sizeof_expression);
		int _la;
		try {
			setState(791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(771);
				sizeof();
				setState(775);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(772);
					match(NEWLINE);
					}
					}
					setState(777);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(778);
				match(T__1);
				setState(779);
				sizeof_operand();
				setState(780);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(782);
				sizeof();
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(783);
					match(NEWLINE);
					}
					}
					setState(788);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(789);
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
		enterRule(_localctx, 88, RULE_sizeof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			match(T__25);
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
		enterRule(_localctx, 90, RULE_defined_expression);
		int _la;
		try {
			setState(814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(795);
				match(T__26);
				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(796);
					match(NEWLINE);
					}
					}
					setState(801);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(802);
				match(T__1);
				setState(803);
				expr();
				setState(804);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(806);
				match(T__26);
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(807);
					match(NEWLINE);
					}
					}
					setState(812);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(813);
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
		enterRule(_localctx, 92, RULE_sizeof_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			type_name();
			setState(826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16 || _la==T__20 || _la==NEWLINE) {
				{
				{
				setState(820);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(817);
					match(NEWLINE);
					}
					}
					setState(822);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(823);
				ptr_operator();
				}
				}
				setState(828);
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
		enterRule(_localctx, 94, RULE_sizeof_operand2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
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
		enterRule(_localctx, 96, RULE_inc_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			_la = _input.LA(1);
			if ( !(_la==T__27 || _la==T__28) ) {
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
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_postfix_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			switch (_input.LA(1)) {
			case T__1:
			case T__37:
			case T__38:
			case T__39:
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

				setState(834);
				primary_expression();
				}
				break;
			case T__16:
			case T__20:
			case T__27:
			case T__28:
				{
				_localctx = new IncDecOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(836);
				_la = _input.LA(1);
				if (_la==T__16 || _la==T__20) {
					{
					setState(835);
					ptr_operator();
					}
				}

				setState(838);
				inc_dec();
				setState(842);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(839);
					match(NEWLINE);
					}
					}
					setState(844);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(846);
				_la = _input.LA(1);
				if (_la==T__16 || _la==T__20) {
					{
					setState(845);
					ptr_operator();
					}
				}

				setState(848);
				primary_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(908);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(906);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayIndexingContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(852);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(856);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(853);
							match(NEWLINE);
							}
							}
							setState(858);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(859);
						match(T__23);
						setState(860);
						expr();
						setState(861);
						match(T__24);
						}
						break;
					case 2:
						{
						_localctx = new FuncCallContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(863);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(867);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(864);
							match(NEWLINE);
							}
							}
							setState(869);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(870);
						match(T__1);
						setState(871);
						function_argument_list();
						setState(872);
						match(T__2);
						}
						break;
					case 3:
						{
						_localctx = new MemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(874);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(875);
						match(T__7);
						setState(879);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(876);
							match(NEWLINE);
							}
							}
							setState(881);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(883);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(882);
							match(TEMPLATE);
							}
						}

						{
						setState(885);
						identifier();
						}
						}
						break;
					case 4:
						{
						_localctx = new PtrMemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(886);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(887);
						match(T__29);
						setState(891);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(888);
							match(NEWLINE);
							}
							}
							setState(893);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(895);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(894);
							match(TEMPLATE);
							}
						}

						{
						setState(897);
						identifier();
						}
						}
						break;
					case 5:
						{
						_localctx = new IncDecOpContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(898);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(902);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(899);
							match(NEWLINE);
							}
							}
							setState(904);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(905);
						inc_dec();
						}
						break;
					}
					} 
				}
				setState(910);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
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

	public static class MacroCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Function_argument_listContext function_argument_list() {
			return getRuleContext(Function_argument_listContext.class,0);
		}
		public TerminalNode VOID() { return getToken(ModuleParser.VOID, 0); }
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
		enterRule(_localctx, 100, RULE_macroCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			switch (_input.LA(1)) {
			case T__37:
			case T__38:
			case T__39:
			case ALPHA_NUMERIC:
				{
				setState(911);
				identifier();
				}
				break;
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case CHAR:
			case STRING:
				{
				setState(912);
				constant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(915);
			match(T__1);
			setState(918);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__8:
			case T__16:
			case T__19:
			case T__20:
			case T__22:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__30:
			case T__31:
			case T__37:
			case T__38:
			case T__39:
			case NEW:
			case ALPHA_NUMERIC:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case CHAR:
			case STRING:
				{
				setState(916);
				function_argument_list();
				}
				break;
			case VOID:
				{
				setState(917);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(920);
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
		enterRule(_localctx, 102, RULE_function_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__31) | (1L << T__37) | (1L << T__38) | (1L << T__39))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (NEW - 100)) | (1L << (ALPHA_NUMERIC - 100)) | (1L << (HEX_LITERAL - 100)) | (1L << (DECIMAL_LITERAL - 100)) | (1L << (OCTAL_LITERAL - 100)) | (1L << (FLOATING_POINT_LITERAL - 100)) | (1L << (CHAR - 100)) | (1L << (STRING - 100)))) != 0)) {
				{
				setState(923); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(922);
					function_argument();
					}
					}
					setState(925); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__31) | (1L << T__37) | (1L << T__38) | (1L << T__39))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (NEW - 100)) | (1L << (ALPHA_NUMERIC - 100)) | (1L << (HEX_LITERAL - 100)) | (1L << (DECIMAL_LITERAL - 100)) | (1L << (OCTAL_LITERAL - 100)) | (1L << (FLOATING_POINT_LITERAL - 100)) | (1L << (CHAR - 100)) | (1L << (STRING - 100)))) != 0) );
				setState(941);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(927);
					match(T__4);
					setState(931);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(928);
						match(NEWLINE);
						}
						}
						setState(933);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(935); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(934);
						function_argument();
						}
						}
						setState(937); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__31) | (1L << T__37) | (1L << T__38) | (1L << T__39))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (NEW - 100)) | (1L << (ALPHA_NUMERIC - 100)) | (1L << (HEX_LITERAL - 100)) | (1L << (DECIMAL_LITERAL - 100)) | (1L << (OCTAL_LITERAL - 100)) | (1L << (FLOATING_POINT_LITERAL - 100)) | (1L << (CHAR - 100)) | (1L << (STRING - 100)))) != 0) );
					}
					}
					setState(943);
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
		enterRule(_localctx, 104, RULE_function_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			assign_expr();
			setState(950);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(947);
				match(NEWLINE);
				}
				}
				setState(952);
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
		enterRule(_localctx, 106, RULE_primary_expression);
		try {
			setState(959);
			switch (_input.LA(1)) {
			case T__37:
			case T__38:
			case T__39:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(953);
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
				setState(954);
				constant();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(955);
				match(T__1);
				setState(956);
				expr();
				setState(957);
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
		enterRule(_localctx, 108, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
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
		enterRule(_localctx, 110, RULE_newline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
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
		enterRule(_localctx, 112, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__30) | (1L << T__31))) != 0)) ) {
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
		enterRule(_localctx, 114, RULE_relational_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__32) | (1L << T__33))) != 0)) ) {
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
		enterRule(_localctx, 116, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			_la = _input.LA(1);
			if ( !(((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (HEX_LITERAL - 105)) | (1L << (DECIMAL_LITERAL - 105)) | (1L << (OCTAL_LITERAL - 105)) | (1L << (FLOATING_POINT_LITERAL - 105)) | (1L << (CHAR - 105)) | (1L << (STRING - 105)))) != 0)) ) {
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
		enterRule(_localctx, 118, RULE_function_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(971);
			_la = _input.LA(1);
			if ( !(((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (T__34 - 35)) | (1L << (T__35 - 35)) | (1L << (T__36 - 35)) | (1L << (STATIC - 35)) | (1L << (VIRTUAL - 35)))) != 0)) ) {
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
		enterRule(_localctx, 120, RULE_ptr_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__20) ) {
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
		enterRule(_localctx, 122, RULE_access_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39))) != 0)) ) {
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
		enterRule(_localctx, 124, RULE_operator);
		int _la;
		try {
			setState(1022);
			switch (_input.LA(1)) {
			case T__40:
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(977);
				_la = _input.LA(1);
				if ( !(_la==T__40 || _la==NEW) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(980);
				_la = _input.LA(1);
				if (_la==T__23) {
					{
					setState(978);
					match(T__23);
					setState(979);
					match(T__24);
					}
				}

				}
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(982);
				match(T__19);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(983);
				match(T__8);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(984);
				match(T__20);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(985);
				match(T__9);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 6);
				{
				setState(986);
				match(T__21);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 7);
				{
				setState(987);
				match(T__15);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 8);
				{
				setState(988);
				match(T__16);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 9);
				{
				setState(989);
				match(T__14);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 10);
				{
				setState(990);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 11);
				{
				setState(991);
				match(T__31);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 12);
				{
				setState(992);
				match(T__3);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 13);
				{
				setState(993);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 14);
				{
				setState(994);
				match(T__6);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 15);
				{
				setState(995);
				match(T__41);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 16);
				{
				setState(996);
				match(T__42);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 17);
				{
				setState(997);
				match(T__43);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 18);
				{
				setState(998);
				match(T__44);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 19);
				{
				setState(999);
				match(T__45);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 20);
				{
				setState(1000);
				match(T__46);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 21);
				{
				setState(1001);
				match(T__47);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 22);
				{
				setState(1002);
				match(T__48);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 23);
				{
				setState(1003);
				match(T__18);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 24);
				{
				setState(1004);
				match(T__17);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 25);
				{
				setState(1005);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 26);
				{
				setState(1006);
				match(T__50);
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 27);
				{
				setState(1007);
				match(T__51);
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 28);
				{
				setState(1008);
				match(T__52);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 29);
				{
				setState(1009);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 30);
				{
				setState(1010);
				match(T__33);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 31);
				{
				setState(1011);
				match(T__13);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 32);
				{
				setState(1012);
				match(T__12);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 33);
				{
				setState(1013);
				match(T__28);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 34);
				{
				setState(1014);
				match(T__27);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 35);
				{
				setState(1015);
				match(T__4);
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 36);
				{
				setState(1016);
				match(T__53);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 37);
				{
				setState(1017);
				match(T__29);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 38);
				{
				setState(1018);
				match(T__1);
				setState(1019);
				match(T__2);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 39);
				{
				setState(1020);
				match(T__23);
				setState(1021);
				match(T__24);
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
		enterRule(_localctx, 126, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50))) != 0)) ) {
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
		enterRule(_localctx, 128, RULE_equality_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			_la = _input.LA(1);
			if ( !(_la==T__51 || _la==T__52) ) {
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
		enterRule(_localctx, 130, RULE_template_decl_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			match(TEMPLATE);
			setState(1029);
			match(T__5);
			setState(1030);
			template_param_list();
			setState(1031);
			match(T__6);
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
		enterRule(_localctx, 132, RULE_template_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1042);
				switch (_input.LA(1)) {
				case T__5:
					{
					{
					setState(1033);
					match(T__5);
					setState(1034);
					template_param_list();
					setState(1035);
					match(T__6);
					}
					}
					break;
				case T__1:
					{
					{
					setState(1037);
					match(T__1);
					setState(1038);
					template_param_list();
					setState(1039);
					match(T__2);
					}
					}
					break;
				case T__0:
				case T__3:
				case T__4:
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
				case LONG:
				case CV_QUALIFIER:
				case VIRTUAL:
				case TRY:
				case CATCH:
				case THROW:
				case USING:
				case NAMESPACE:
				case AUTO:
				case REGISTER:
				case SPECIAL_DATA:
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
				case OPERATOR:
				case TEMPLATE:
				case NEW:
				case CLASS_KEY:
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
					setState(1041);
					no_angle_brackets_or_brackets();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1044); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE) | (1L << SWITCH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0) );
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
		enterRule(_localctx, 134, RULE_no_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
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
		enterRule(_localctx, 136, RULE_no_brackets_curlies_or_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__23) | (1L << T__24))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
		enterRule(_localctx, 138, RULE_no_brackets_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
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
		enterRule(_localctx, 140, RULE_no_angle_brackets_or_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6))) != 0)) ) {
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
		enterRule(_localctx, 142, RULE_no_curlies);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
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
		enterRule(_localctx, 144, RULE_no_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__23 || _la==T__24) ) {
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
		enterRule(_localctx, 146, RULE_no_squares_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__23) | (1L << T__24))) != 0)) ) {
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
		enterRule(_localctx, 148, RULE_no_comma_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__0 || _la==T__4) ) {
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
		enterRule(_localctx, 150, RULE_assign_water);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__23) | (1L << T__24))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
		enterRule(_localctx, 152, RULE_assign_water_l2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__23) | (1L << T__24))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
		enterRule(_localctx, 154, RULE_water);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
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
		enterRule(_localctx, 156, RULE_function_def);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			_la = _input.LA(1);
			if (_la==TEMPLATE) {
				{
				setState(1068);
				template_decl_start();
				}
			}

			setState(1074);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1071);
					match(NEWLINE);
					}
					} 
				}
				setState(1076);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			}
			setState(1078);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(1077);
				return_type();
				}
				break;
			}
			setState(1083);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1080);
				match(NEWLINE);
				}
				}
				setState(1085);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1086);
			function_name();
			setState(1090);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1087);
				match(NEWLINE);
				}
				}
				setState(1092);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1093);
			function_param_list();
			setState(1095);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(1094);
				ctor_list();
				}
			}

			setState(1097);
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
		enterRule(_localctx, 158, RULE_return_type);
		int _la;
		try {
			setState(1120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (T__34 - 35)) | (1L << (T__35 - 35)) | (1L << (T__36 - 35)) | (1L << (STATIC - 35)) | (1L << (VIRTUAL - 35)))) != 0)) {
					{
					{
					setState(1099);
					function_decl_specifiers();
					}
					}
					setState(1104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1105);
					match(NEWLINE);
					}
					}
					setState(1110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1111);
				type_name();
				}
				setState(1116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16 || _la==T__20) {
					{
					{
					setState(1113);
					ptr_operator();
					}
					}
					setState(1118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1119);
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
		enterRule(_localctx, 160, RULE_function_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1122);
			match(T__1);
			setState(1124);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (VOID - 69)) | (1L << (UNSIGNED - 69)) | (1L << (SIGNED - 69)) | (1L << (LONG - 69)) | (1L << (CV_QUALIFIER - 69)) | (1L << (AUTO - 69)) | (1L << (REGISTER - 69)) | (1L << (SPECIAL_DATA - 69)) | (1L << (CLASS_KEY - 69)) | (1L << (ALPHA_NUMERIC - 69)) | (1L << (HEX_LITERAL - 69)) | (1L << (DECIMAL_LITERAL - 69)) | (1L << (OCTAL_LITERAL - 69)) | (1L << (FLOATING_POINT_LITERAL - 69)) | (1L << (CHAR - 69)) | (1L << (STRING - 69)))) != 0)) {
				{
				setState(1123);
				parameter_decl_clause();
				}
			}

			setState(1126);
			match(T__2);
			setState(1130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CV_QUALIFIER) {
				{
				{
				setState(1127);
				match(CV_QUALIFIER);
				}
				}
				setState(1132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1134);
			_la = _input.LA(1);
			if (_la==THROW) {
				{
				setState(1133);
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
		enterRule(_localctx, 162, RULE_parameter_decl_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1136);
			parameter_decl();
			setState(1147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1137);
					match(T__4);
					setState(1141);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(1138);
						match(NEWLINE);
						}
						}
						setState(1143);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1144);
					parameter_decl();
					}
					} 
				}
				setState(1149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			}
			}
			setState(1158);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(1150);
				match(T__4);
				setState(1154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1151);
					match(NEWLINE);
					}
					}
					setState(1156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1157);
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
		enterRule(_localctx, 164, RULE_parameter_decl);
		try {
			setState(1164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1160);
				match(VOID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1161);
				param_decl_specifiers();
				setState(1162);
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
		enterRule(_localctx, 166, RULE_parameter_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1167);
			_la = _input.LA(1);
			if (_la==T__16 || _la==T__20) {
				{
				setState(1166);
				ptrs();
				}
			}

			setState(1174);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(1169);
				match(T__1);
				setState(1170);
				parameter_id();
				setState(1171);
				match(T__2);
				}
				break;
			case T__37:
			case T__38:
			case T__39:
			case ALPHA_NUMERIC:
				{
				setState(1173);
				parameter_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1177);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__23) {
				{
				setState(1176);
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
		enterRule(_localctx, 168, RULE_compound_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1179);
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
		enterRule(_localctx, 170, RULE_ctor_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			match(T__11);
			setState(1183);
			ctor_initializer();
			setState(1188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(1184);
				match(T__4);
				setState(1185);
				ctor_initializer();
				}
				}
				setState(1190);
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
		enterRule(_localctx, 172, RULE_ctor_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1191);
			initializer_id();
			setState(1192);
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
		enterRule(_localctx, 174, RULE_initializer_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1195);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(1194);
				match(T__22);
				}
			}

			setState(1197);
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
		enterRule(_localctx, 176, RULE_ctor_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1199);
			match(T__1);
			setState(1201);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__31) | (1L << T__37) | (1L << T__38) | (1L << T__39))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (NEW - 100)) | (1L << (ALPHA_NUMERIC - 100)) | (1L << (HEX_LITERAL - 100)) | (1L << (DECIMAL_LITERAL - 100)) | (1L << (OCTAL_LITERAL - 100)) | (1L << (FLOATING_POINT_LITERAL - 100)) | (1L << (CHAR - 100)) | (1L << (STRING - 100)))) != 0)) {
				{
				setState(1200);
				expr();
				}
			}

			setState(1203);
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
		enterRule(_localctx, 178, RULE_function_name);
		try {
			setState(1212);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1205);
				match(T__1);
				setState(1206);
				function_name();
				setState(1207);
				match(T__2);
				}
				break;
			case T__37:
			case T__38:
			case T__39:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1209);
				identifier();
				}
				break;
			case OPERATOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1210);
				match(OPERATOR);
				setState(1211);
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
		enterRule(_localctx, 180, RULE_exception_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1214);
			match(THROW);
			setState(1215);
			match(T__1);
			setState(1216);
			type_id_list();
			setState(1217);
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
		enterRule(_localctx, 182, RULE_type_id_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE) | (1L << SWITCH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(1219);
				no_brackets();
				}
				}
				setState(1224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1225);
				match(T__1);
				setState(1226);
				type_id_list();
				setState(1227);
				match(T__2);
				setState(1231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE) | (1L << SWITCH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(1228);
					no_brackets();
					}
					}
					setState(1233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(1238);
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
		enterRule(_localctx, 184, RULE_init_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1239);
			declarator();
			setState(1247);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(1240);
				match(T__1);
				setState(1242);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__31) | (1L << T__37) | (1L << T__38) | (1L << T__39))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (NEW - 100)) | (1L << (ALPHA_NUMERIC - 100)) | (1L << (HEX_LITERAL - 100)) | (1L << (DECIMAL_LITERAL - 100)) | (1L << (OCTAL_LITERAL - 100)) | (1L << (FLOATING_POINT_LITERAL - 100)) | (1L << (CHAR - 100)) | (1L << (STRING - 100)))) != 0)) {
					{
					setState(1241);
					expr();
					}
				}

				setState(1244);
				match(T__2);
				}
				}
				break;
			case T__3:
				{
				{
				setState(1245);
				match(T__3);
				setState(1246);
				assign_expr_w_();
				}
				}
				break;
			case T__0:
			case T__4:
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
		enterRule(_localctx, 186, RULE_declarator);
		int _la;
		try {
			setState(1268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1250);
				_la = _input.LA(1);
				if (_la==T__16 || _la==T__20) {
					{
					setState(1249);
					ptrs();
					}
				}

				setState(1252);
				identifier();
				setState(1254);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1253);
					type_suffix();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1257);
				_la = _input.LA(1);
				if (_la==T__16 || _la==T__20) {
					{
					setState(1256);
					ptrs();
					}
				}

				setState(1259);
				match(T__1);
				setState(1261);
				_la = _input.LA(1);
				if (_la==ALPHA_NUMERIC) {
					{
					setState(1260);
					callingConvetion();
					}
				}

				setState(1263);
				func_ptrs();
				setState(1264);
				identifier();
				setState(1265);
				match(T__2);
				setState(1266);
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
		enterRule(_localctx, 188, RULE_callingConvetion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1271); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1270);
				match(ALPHA_NUMERIC);
				}
				}
				setState(1273); 
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
		enterRule(_localctx, 190, RULE_type_suffix);
		try {
			setState(1280);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1275);
				match(T__23);
				setState(1276);
				constant_expr_w_();
				setState(1277);
				match(T__24);
				}
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(1279);
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
		enterRule(_localctx, 192, RULE_assign_expr_w_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE) | (1L << SWITCH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(1282);
				assign_water();
				}
				}
				setState(1287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==T__23 || _la==OPENING_CURLY) {
				{
				{
				setState(1300);
				switch (_input.LA(1)) {
				case OPENING_CURLY:
					{
					setState(1288);
					match(OPENING_CURLY);
					setState(1289);
					assign_expr_w__l2();
					setState(1290);
					match(CLOSING_CURLY);
					}
					break;
				case T__1:
					{
					setState(1292);
					match(T__1);
					setState(1293);
					assign_expr_w__l2();
					setState(1294);
					match(T__2);
					}
					break;
				case T__23:
					{
					setState(1296);
					match(T__23);
					setState(1297);
					assign_expr_w__l2();
					setState(1298);
					match(T__24);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE) | (1L << SWITCH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(1302);
					assign_water();
					}
					}
					setState(1307);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(1312);
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
		enterRule(_localctx, 194, RULE_assign_expr_w__l2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE) | (1L << SWITCH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(1313);
				assign_water_l2();
				}
				}
				setState(1318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==T__23 || _la==OPENING_CURLY) {
				{
				{
				setState(1331);
				switch (_input.LA(1)) {
				case OPENING_CURLY:
					{
					setState(1319);
					match(OPENING_CURLY);
					setState(1320);
					assign_expr_w__l2();
					setState(1321);
					match(CLOSING_CURLY);
					}
					break;
				case T__1:
					{
					setState(1323);
					match(T__1);
					setState(1324);
					assign_expr_w__l2();
					setState(1325);
					match(T__2);
					}
					break;
				case T__23:
					{
					setState(1327);
					match(T__23);
					setState(1328);
					assign_expr_w__l2();
					setState(1329);
					match(T__24);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE) | (1L << SWITCH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(1333);
					assign_water_l2();
					}
					}
					setState(1338);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(1343);
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
		enterRule(_localctx, 196, RULE_constant_expr_w_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE) | (1L << SWITCH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(1344);
				no_squares();
				}
				}
				setState(1349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(1350);
				match(T__23);
				setState(1351);
				constant_expr_w_();
				setState(1352);
				match(T__24);
				setState(1356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE) | (1L << SWITCH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(1353);
					no_squares();
					}
					}
					setState(1358);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
		enterRule(_localctx, 198, RULE_simple_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1364);
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
		public TerminalNode STATIC() { return getToken(ModuleParser.STATIC, 0); }
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
		enterRule(_localctx, 200, RULE_var_decl);
		int _la;
		try {
			setState(1407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				_localctx = new DeclByClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1367);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(1366);
					match(TYPEDEF);
					}
				}

				setState(1370);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(1369);
					template_decl_start();
					}
				}

				}
				setState(1372);
				class_def();
				setState(1374);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1373);
					match(NEWLINE);
					}
					break;
				}
				setState(1377);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1376);
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
				setState(1380);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(1379);
					match(TYPEDEF);
					}
				}

				setState(1383);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(1382);
					template_decl_start();
					}
				}

				}
				setState(1386);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(1385);
					match(STATIC);
					}
				}

				setState(1388);
				type_name();
				setState(1390);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1389);
					match(NEWLINE);
					}
				}

				setState(1392);
				init_declarator_list();
				}
				break;
			case 3:
				_localctx = new StructUnionEnumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1395);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(1394);
					match(TYPEDEF);
					}
				}

				setState(1397);
				special_datatype();
				setState(1399);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1398);
					match(NEWLINE);
					}
					break;
				}
				setState(1402);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1401);
					init_declarator_list();
					}
					break;
				}
				setState(1405);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1404);
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
		enterRule(_localctx, 202, RULE_special_datatype);
		int _la;
		try {
			setState(1417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1409);
				match(SPECIAL_DATA);
				setState(1411);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39))) != 0) || _la==ALPHA_NUMERIC) {
					{
					setState(1410);
					identifier();
					}
				}

				setState(1413);
				match(OPENING_CURLY);
				skipToEndOfObject(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1415);
				match(SPECIAL_DATA);
				setState(1416);
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
		enterRule(_localctx, 204, RULE_init_declarator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1419);
			init_declarator();
			setState(1427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(1420);
				match(T__4);
				setState(1422);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1421);
					match(NEWLINE);
					}
				}

				setState(1424);
				init_declarator();
				}
				}
				setState(1429);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1430);
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
		enterRule(_localctx, 206, RULE_initializer);
		try {
			setState(1439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1432);
				assign_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1433);
				match(OPENING_CURLY);
				setState(1434);
				initializer_list();
				setState(1435);
				match(CLOSING_CURLY);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1437);
				match(OPENING_CURLY);
				setState(1438);
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
		enterRule(_localctx, 208, RULE_initializer_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1441);
			initializer();
			setState(1449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(1442);
				match(T__4);
				setState(1444);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1443);
					match(NEWLINE);
					}
				}

				setState(1446);
				initializer();
				}
				}
				setState(1451);
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
		enterRule(_localctx, 210, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1452);
			match(CLASS_KEY);
			setState(1454);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39))) != 0) || _la==ALPHA_NUMERIC) {
				{
				setState(1453);
				class_name();
				}
			}

			setState(1457);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(1456);
				base_classes();
				}
			}

			setState(1459);
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
		enterRule(_localctx, 212, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1462);
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
		enterRule(_localctx, 214, RULE_base_classes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1464);
			match(T__11);
			setState(1465);
			base_class();
			setState(1470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(1466);
				match(T__4);
				setState(1467);
				base_class();
				}
				}
				setState(1472);
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
		enterRule(_localctx, 216, RULE_base_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1474);
			_la = _input.LA(1);
			if (_la==VIRTUAL) {
				{
				setState(1473);
				match(VIRTUAL);
				}
			}

			setState(1477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1476);
				access_specifier();
				}
				break;
			}
			setState(1479);
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
		public List<Base_typeContext> base_type() {
			return getRuleContexts(Base_typeContext.class);
		}
		public Base_typeContext base_type(int i) {
			return getRuleContext(Base_typeContext.class,i);
		}
		public List<TerminalNode> CV_QUALIFIER() { return getTokens(ModuleParser.CV_QUALIFIER); }
		public TerminalNode CV_QUALIFIER(int i) {
			return getToken(ModuleParser.CV_QUALIFIER, i);
		}
		public List<Template_param_listContext> template_param_list() {
			return getRuleContexts(Template_param_listContext.class);
		}
		public Template_param_listContext template_param_list(int i) {
			return getRuleContext(Template_param_listContext.class,i);
		}
		public TerminalNode CLASS_KEY() { return getToken(ModuleParser.CLASS_KEY, 0); }
		public TerminalNode UNSIGNED() { return getToken(ModuleParser.UNSIGNED, 0); }
		public TerminalNode SIGNED() { return getToken(ModuleParser.SIGNED, 0); }
		public TerminalNode SPECIAL_DATA() { return getToken(ModuleParser.SPECIAL_DATA, 0); }
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
		enterRule(_localctx, 218, RULE_type_name);
		int _la;
		try {
			setState(1517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CV_QUALIFIER) {
					{
					{
					setState(1481);
					match(CV_QUALIFIER);
					}
					}
					setState(1486);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1488);
				_la = _input.LA(1);
				if (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (UNSIGNED - 70)) | (1L << (SIGNED - 70)) | (1L << (SPECIAL_DATA - 70)) | (1L << (CLASS_KEY - 70)))) != 0)) {
					{
					setState(1487);
					_la = _input.LA(1);
					if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (UNSIGNED - 70)) | (1L << (SIGNED - 70)) | (1L << (SPECIAL_DATA - 70)) | (1L << (CLASS_KEY - 70)))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(1490);
				base_type();
				setState(1495);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(1491);
					match(T__5);
					setState(1492);
					template_param_list();
					setState(1493);
					match(T__6);
					}
				}

				setState(1507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__22) {
					{
					{
					setState(1497);
					match(T__22);
					setState(1498);
					base_type();
					setState(1503);
					_la = _input.LA(1);
					if (_la==T__5) {
						{
						setState(1499);
						match(T__5);
						setState(1500);
						template_param_list();
						setState(1501);
						match(T__6);
						}
					}

					}
					}
					setState(1509);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(1511);
				_la = _input.LA(1);
				if (_la==CV_QUALIFIER) {
					{
					setState(1510);
					match(CV_QUALIFIER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1513);
				match(UNSIGNED);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1514);
				match(SIGNED);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1515);
				match(SPECIAL_DATA);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1516);
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
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(ModuleParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(ModuleParser.ALPHA_NUMERIC, i);
		}
		public List<TerminalNode> VOID() { return getTokens(ModuleParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(ModuleParser.VOID, i);
		}
		public List<TerminalNode> LONG() { return getTokens(ModuleParser.LONG); }
		public TerminalNode LONG(int i) {
			return getToken(ModuleParser.LONG, i);
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
		enterRule(_localctx, 220, RULE_base_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1520); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1519);
					_la = _input.LA(1);
					if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (VOID - 69)) | (1L << (LONG - 69)) | (1L << (ALPHA_NUMERIC - 69)))) != 0)) ) {
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
				setState(1522); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
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
		enterRule(_localctx, 222, RULE_param_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1525);
			_la = _input.LA(1);
			if (_la==AUTO || _la==REGISTER) {
				{
				setState(1524);
				_la = _input.LA(1);
				if ( !(_la==AUTO || _la==REGISTER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1527);
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
		enterRule(_localctx, 224, RULE_parameter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1529);
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
		enterRule(_localctx, 226, RULE_param_type_list);
		int _la;
		try {
			setState(1558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1531);
				match(T__1);
				setState(1533);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1532);
					match(NEWLINE);
					}
				}

				setState(1535);
				match(VOID);
				setState(1536);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1537);
				match(T__1);
				setState(1539);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1538);
					match(NEWLINE);
					}
				}

				setState(1555);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (VOID - 69)) | (1L << (UNSIGNED - 69)) | (1L << (SIGNED - 69)) | (1L << (LONG - 69)) | (1L << (CV_QUALIFIER - 69)) | (1L << (AUTO - 69)) | (1L << (REGISTER - 69)) | (1L << (SPECIAL_DATA - 69)) | (1L << (CLASS_KEY - 69)) | (1L << (ALPHA_NUMERIC - 69)) | (1L << (HEX_LITERAL - 69)) | (1L << (DECIMAL_LITERAL - 69)) | (1L << (OCTAL_LITERAL - 69)) | (1L << (FLOATING_POINT_LITERAL - 69)) | (1L << (CHAR - 69)) | (1L << (STRING - 69)))) != 0)) {
					{
					setState(1541);
					param_type();
					setState(1543);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1542);
						match(NEWLINE);
						}
					}

					setState(1552);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(1545);
						match(T__4);
						setState(1547);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(1546);
							match(NEWLINE);
							}
						}

						setState(1549);
						param_type();
						}
						}
						setState(1554);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1557);
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
		enterRule(_localctx, 228, RULE_param_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1560);
			param_decl_specifiers();
			setState(1561);
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
		enterRule(_localctx, 230, RULE_param_type_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1564);
			_la = _input.LA(1);
			if (_la==T__16 || _la==T__20) {
				{
				setState(1563);
				ptrs();
				}
			}

			setState(1579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(1566);
				match(T__1);
				setState(1568);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1567);
					match(NEWLINE);
					}
					break;
				}
				setState(1570);
				param_type_id();
				setState(1572);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1571);
					match(NEWLINE);
					}
				}

				setState(1574);
				match(T__2);
				}
				break;
			case 2:
				{
				setState(1577);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39))) != 0) || _la==ALPHA_NUMERIC) {
					{
					setState(1576);
					parameter_name();
					}
				}

				}
				break;
			}
			setState(1582);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__23) {
				{
				setState(1581);
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
		enterRule(_localctx, 232, RULE_identifier);
		try {
			int _alt;
			setState(1593);
			switch (_input.LA(1)) {
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1584);
				match(ALPHA_NUMERIC);
				setState(1589);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1585);
						match(T__22);
						setState(1586);
						match(ALPHA_NUMERIC);
						}
						} 
					}
					setState(1591);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
				}
				}
				}
				break;
			case T__37:
			case T__38:
			case T__39:
				enterOuterAlt(_localctx, 2);
				{
				setState(1592);
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
		enterRule(_localctx, 234, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1595);
			_la = _input.LA(1);
			if ( !(((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (HEX_LITERAL - 105)) | (1L << (DECIMAL_LITERAL - 105)) | (1L << (OCTAL_LITERAL - 105)))) != 0)) ) {
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
		enterRule(_localctx, 236, RULE_ptrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1601); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1597);
				ptr_operator();
				setState(1599);
				_la = _input.LA(1);
				if (_la==T__54) {
					{
					setState(1598);
					match(T__54);
					}
				}

				}
				}
				setState(1603); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__16 || _la==T__20 );
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
		enterRule(_localctx, 238, RULE_func_ptrs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1605);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 49:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3v\u064a\4\2\t\2\4"+
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
		"w\tw\4x\tx\4y\ty\3\2\3\2\3\2\3\2\3\2\3\2\7\2\u00f9\n\2\f\2\16\2\u00fc"+
		"\13\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4\u0105\n\4\3\5\3\5\3\5\3\5\5\5\u010b"+
		"\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u011e\n\n\3\13\3\13\3\13\3\13\7\13\u0124\n\13\f\13\16\13\u0127"+
		"\13\13\3\13\3\13\7\13\u012b\n\13\f\13\16\13\u012e\13\13\3\13\3\13\5\13"+
		"\u0132\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u013c\n\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u014b\n\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\5\20\u0154\n\20\3\20\3\20\3\20\5\20\u0159\n\20\7"+
		"\20\u015b\n\20\f\20\16\20\u015e\13\20\3\21\3\21\3\22\3\22\3\22\5\22\u0165"+
		"\n\22\3\23\3\23\5\23\u0169\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0171"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0179\n\25\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\6\30\u0183\n\30\r\30\16\30\u0184\5\30\u0187\n\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u0197\n\31\3\32\3\32\5\32\u019b\n\32\3\32\3\32\3\32\3\32\3\32\5"+
		"\32\u01a2\n\32\3\32\3\32\6\32\u01a6\n\32\r\32\16\32\u01a7\3\32\3\32\5"+
		"\32\u01ac\n\32\3\32\3\32\3\32\5\32\u01b1\n\32\3\33\3\33\3\33\7\33\u01b6"+
		"\n\33\f\33\16\33\u01b9\13\33\3\33\7\33\u01bc\n\33\f\33\16\33\u01bf\13"+
		"\33\3\33\3\33\7\33\u01c3\n\33\f\33\16\33\u01c6\13\33\3\33\5\33\u01c9\n"+
		"\33\3\33\3\33\7\33\u01cd\n\33\f\33\16\33\u01d0\13\33\3\34\3\34\7\34\u01d4"+
		"\n\34\f\34\16\34\u01d7\13\34\3\34\3\34\7\34\u01db\n\34\f\34\16\34\u01de"+
		"\13\34\3\34\3\34\5\34\u01e2\n\34\3\35\3\35\3\35\7\35\u01e7\n\35\f\35\16"+
		"\35\u01ea\13\35\3\35\3\35\7\35\u01ee\n\35\f\35\16\35\u01f1\13\35\3\35"+
		"\3\35\7\35\u01f5\n\35\f\35\16\35\u01f8\13\35\3\35\3\35\7\35\u01fc\n\35"+
		"\f\35\16\35\u01ff\13\35\3\35\3\35\5\35\u0203\n\35\3\36\3\36\7\36\u0207"+
		"\n\36\f\36\16\36\u020a\13\36\3\36\3\36\7\36\u020e\n\36\f\36\16\36\u0211"+
		"\13\36\3\36\5\36\u0214\n\36\3\37\3\37\7\37\u0218\n\37\f\37\16\37\u021b"+
		"\13\37\3\37\3\37\7\37\u021f\n\37\f\37\16\37\u0222\13\37\3\37\5\37\u0225"+
		"\n\37\3 \3 \7 \u0229\n \f \16 \u022c\13 \3 \3 \7 \u0230\n \f \16 \u0233"+
		"\13 \3 \5 \u0236\n \3!\3!\7!\u023a\n!\f!\16!\u023d\13!\3!\3!\7!\u0241"+
		"\n!\f!\16!\u0244\13!\3!\5!\u0247\n!\3\"\3\"\7\"\u024b\n\"\f\"\16\"\u024e"+
		"\13\"\3\"\3\"\7\"\u0252\n\"\f\"\16\"\u0255\13\"\3\"\5\"\u0258\n\"\3#\3"+
		"#\7#\u025c\n#\f#\16#\u025f\13#\3#\3#\7#\u0263\n#\f#\16#\u0266\13#\3#\3"+
		"#\5#\u026a\n#\3$\3$\7$\u026e\n$\f$\16$\u0271\13$\3$\3$\7$\u0275\n$\f$"+
		"\16$\u0278\13$\3$\3$\5$\u027c\n$\3%\3%\7%\u0280\n%\f%\16%\u0283\13%\3"+
		"%\3%\7%\u0287\n%\f%\16%\u028a\13%\3%\5%\u028d\n%\3&\3&\7&\u0291\n&\f&"+
		"\16&\u0294\13&\3&\3&\7&\u0298\n&\f&\16&\u029b\13&\3&\5&\u029e\n&\3\'\3"+
		"\'\7\'\u02a2\n\'\f\'\16\'\u02a5\13\'\3\'\3\'\7\'\u02a9\n\'\f\'\16\'\u02ac"+
		"\13\'\3\'\5\'\u02af\n\'\3(\3(\3(\3(\3(\3(\5(\u02b7\n(\3)\3)\7)\u02bb\n"+
		")\f)\16)\u02be\13)\3)\7)\u02c1\n)\f)\16)\u02c4\13)\3*\3*\3*\3*\3*\5*\u02cb"+
		"\n*\3+\5+\u02ce\n+\3+\3+\7+\u02d2\n+\f+\16+\u02d5\13+\3+\3+\7+\u02d9\n"+
		"+\f+\16+\u02dc\13+\3+\3+\5+\u02e0\n+\3+\3+\3+\5+\u02e5\n+\3+\3+\7+\u02e9"+
		"\n+\f+\16+\u02ec\13+\3+\3+\7+\u02f0\n+\f+\16+\u02f3\13+\3+\3+\5+\u02f7"+
		"\n+\3+\3+\5+\u02fb\n+\3,\3,\7,\u02ff\n,\f,\16,\u0302\13,\3,\3,\3-\3-\7"+
		"-\u0308\n-\f-\16-\u030b\13-\3-\3-\3-\3-\3-\3-\7-\u0313\n-\f-\16-\u0316"+
		"\13-\3-\3-\5-\u031a\n-\3.\3.\3/\3/\7/\u0320\n/\f/\16/\u0323\13/\3/\3/"+
		"\3/\3/\3/\3/\7/\u032b\n/\f/\16/\u032e\13/\3/\5/\u0331\n/\3\60\3\60\7\60"+
		"\u0335\n\60\f\60\16\60\u0338\13\60\3\60\7\60\u033b\n\60\f\60\16\60\u033e"+
		"\13\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\5\63\u0347\n\63\3\63\3\63\7"+
		"\63\u034b\n\63\f\63\16\63\u034e\13\63\3\63\5\63\u0351\n\63\3\63\3\63\5"+
		"\63\u0355\n\63\3\63\3\63\7\63\u0359\n\63\f\63\16\63\u035c\13\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\7\63\u0364\n\63\f\63\16\63\u0367\13\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\7\63\u0370\n\63\f\63\16\63\u0373\13\63\3"+
		"\63\5\63\u0376\n\63\3\63\3\63\3\63\3\63\7\63\u037c\n\63\f\63\16\63\u037f"+
		"\13\63\3\63\5\63\u0382\n\63\3\63\3\63\3\63\7\63\u0387\n\63\f\63\16\63"+
		"\u038a\13\63\3\63\7\63\u038d\n\63\f\63\16\63\u0390\13\63\3\64\3\64\5\64"+
		"\u0394\n\64\3\64\3\64\3\64\5\64\u0399\n\64\3\64\3\64\3\65\6\65\u039e\n"+
		"\65\r\65\16\65\u039f\3\65\3\65\7\65\u03a4\n\65\f\65\16\65\u03a7\13\65"+
		"\3\65\6\65\u03aa\n\65\r\65\16\65\u03ab\7\65\u03ae\n\65\f\65\16\65\u03b1"+
		"\13\65\5\65\u03b3\n\65\3\66\3\66\7\66\u03b7\n\66\f\66\16\66\u03ba\13\66"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u03c2\n\67\38\38\39\39\3:\3:\3;\3"+
		";\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3@\5@\u03d7\n@\3@\3@\3@\3@\3@\3@\3@\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u0401\n@\3A\3A\3B\3B\3C\3C\3C\3C\3C\3"+
		"D\3D\3D\3D\3D\3D\3D\3D\3D\6D\u0415\nD\rD\16D\u0416\3E\3E\3F\3F\3G\3G\3"+
		"H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\5P\u0430\nP\3P\7P\u0433"+
		"\nP\fP\16P\u0436\13P\3P\5P\u0439\nP\3P\7P\u043c\nP\fP\16P\u043f\13P\3"+
		"P\3P\7P\u0443\nP\fP\16P\u0446\13P\3P\3P\5P\u044a\nP\3P\3P\3Q\7Q\u044f"+
		"\nQ\fQ\16Q\u0452\13Q\3Q\7Q\u0455\nQ\fQ\16Q\u0458\13Q\3Q\3Q\3Q\7Q\u045d"+
		"\nQ\fQ\16Q\u0460\13Q\3Q\5Q\u0463\nQ\3R\3R\5R\u0467\nR\3R\3R\7R\u046b\n"+
		"R\fR\16R\u046e\13R\3R\5R\u0471\nR\3S\3S\3S\7S\u0476\nS\fS\16S\u0479\13"+
		"S\3S\7S\u047c\nS\fS\16S\u047f\13S\3S\3S\7S\u0483\nS\fS\16S\u0486\13S\3"+
		"S\5S\u0489\nS\3T\3T\3T\3T\5T\u048f\nT\3U\5U\u0492\nU\3U\3U\3U\3U\3U\5"+
		"U\u0499\nU\3U\5U\u049c\nU\3V\3V\3V\3W\3W\3W\3W\7W\u04a5\nW\fW\16W\u04a8"+
		"\13W\3X\3X\3X\3Y\5Y\u04ae\nY\3Y\3Y\3Z\3Z\5Z\u04b4\nZ\3Z\3Z\3[\3[\3[\3"+
		"[\3[\3[\3[\5[\u04bf\n[\3\\\3\\\3\\\3\\\3\\\3]\7]\u04c7\n]\f]\16]\u04ca"+
		"\13]\3]\3]\3]\3]\7]\u04d0\n]\f]\16]\u04d3\13]\7]\u04d5\n]\f]\16]\u04d8"+
		"\13]\3^\3^\3^\5^\u04dd\n^\3^\3^\3^\5^\u04e2\n^\3_\5_\u04e5\n_\3_\3_\5"+
		"_\u04e9\n_\3_\5_\u04ec\n_\3_\3_\5_\u04f0\n_\3_\3_\3_\3_\3_\5_\u04f7\n"+
		"_\3`\6`\u04fa\n`\r`\16`\u04fb\3a\3a\3a\3a\3a\5a\u0503\na\3b\7b\u0506\n"+
		"b\fb\16b\u0509\13b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\5b\u0517\nb\3b"+
		"\7b\u051a\nb\fb\16b\u051d\13b\7b\u051f\nb\fb\16b\u0522\13b\3c\7c\u0525"+
		"\nc\fc\16c\u0528\13c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u0536\nc\3"+
		"c\7c\u0539\nc\fc\16c\u053c\13c\7c\u053e\nc\fc\16c\u0541\13c\3d\7d\u0544"+
		"\nd\fd\16d\u0547\13d\3d\3d\3d\3d\7d\u054d\nd\fd\16d\u0550\13d\7d\u0552"+
		"\nd\fd\16d\u0555\13d\3e\3e\3f\5f\u055a\nf\3f\5f\u055d\nf\3f\3f\5f\u0561"+
		"\nf\3f\5f\u0564\nf\3f\5f\u0567\nf\3f\5f\u056a\nf\3f\5f\u056d\nf\3f\3f"+
		"\5f\u0571\nf\3f\3f\3f\5f\u0576\nf\3f\3f\5f\u057a\nf\3f\5f\u057d\nf\3f"+
		"\5f\u0580\nf\5f\u0582\nf\3g\3g\5g\u0586\ng\3g\3g\3g\3g\5g\u058c\ng\3h"+
		"\3h\3h\5h\u0591\nh\3h\7h\u0594\nh\fh\16h\u0597\13h\3h\3h\3i\3i\3i\3i\3"+
		"i\3i\3i\5i\u05a2\ni\3j\3j\3j\5j\u05a7\nj\3j\7j\u05aa\nj\fj\16j\u05ad\13"+
		"j\3k\3k\5k\u05b1\nk\3k\5k\u05b4\nk\3k\3k\3k\3l\3l\3m\3m\3m\3m\7m\u05bf"+
		"\nm\fm\16m\u05c2\13m\3n\5n\u05c5\nn\3n\5n\u05c8\nn\3n\3n\3o\7o\u05cd\n"+
		"o\fo\16o\u05d0\13o\3o\5o\u05d3\no\3o\3o\3o\3o\3o\5o\u05da\no\3o\3o\3o"+
		"\3o\3o\3o\5o\u05e2\no\7o\u05e4\no\fo\16o\u05e7\13o\3o\5o\u05ea\no\3o\3"+
		"o\3o\3o\5o\u05f0\no\3p\6p\u05f3\np\rp\16p\u05f4\3q\5q\u05f8\nq\3q\3q\3"+
		"r\3r\3s\3s\5s\u0600\ns\3s\3s\3s\3s\5s\u0606\ns\3s\3s\5s\u060a\ns\3s\3"+
		"s\5s\u060e\ns\3s\7s\u0611\ns\fs\16s\u0614\13s\5s\u0616\ns\3s\5s\u0619"+
		"\ns\3t\3t\3t\3u\5u\u061f\nu\3u\3u\5u\u0623\nu\3u\3u\5u\u0627\nu\3u\3u"+
		"\3u\5u\u062c\nu\5u\u062e\nu\3u\5u\u0631\nu\3v\3v\3v\7v\u0636\nv\fv\16"+
		"v\u0639\13v\3v\5v\u063c\nv\3w\3w\3x\3x\5x\u0642\nx\6x\u0644\nx\rx\16x"+
		"\u0645\3y\3y\3y\2\3dz\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6"+
		"\u00e8\u00ea\u00ec\u00ee\u00f0\2\35\4\2\n\fhh\3\2\24\25\4\2\13\13\26\26"+
		"\4\2\f\f\27\30\3\2\36\37\6\2\13\13\23\23\26\27!\"\4\2\b\t#$\4\2knpq\5"+
		"\2%\'FFLL\4\2\23\23\27\27\3\2(*\4\2++ff\4\2\6\6,\65\3\2\66\67\3\2\4\5"+
		"\5\2\4\5\32\33ij\3\2\3\5\4\2\4\5\b\t\3\2ij\3\2\32\33\4\2\3\3\32\33\4\2"+
		"\3\3\7\7\6\2\3\5\7\7\32\33ij\5\2HITTgg\5\2GGJJhh\3\2RS\3\2km\u06f3\2\u00fa"+
		"\3\2\2\2\4\u00fd\3\2\2\2\6\u0104\3\2\2\2\b\u010a\3\2\2\2\n\u010c\3\2\2"+
		"\2\f\u0110\3\2\2\2\16\u0114\3\2\2\2\20\u0116\3\2\2\2\22\u011d\3\2\2\2"+
		"\24\u0131\3\2\2\2\26\u013b\3\2\2\2\30\u014a\3\2\2\2\32\u014c\3\2\2\2\34"+
		"\u014f\3\2\2\2\36\u0153\3\2\2\2 \u015f\3\2\2\2\"\u0164\3\2\2\2$\u0166"+
		"\3\2\2\2&\u0170\3\2\2\2(\u0178\3\2\2\2*\u017a\3\2\2\2,\u017e\3\2\2\2."+
		"\u0186\3\2\2\2\60\u0196\3\2\2\2\62\u01b0\3\2\2\2\64\u01b2\3\2\2\2\66\u01d1"+
		"\3\2\2\28\u0202\3\2\2\2:\u0204\3\2\2\2<\u0215\3\2\2\2>\u0226\3\2\2\2@"+
		"\u0237\3\2\2\2B\u0248\3\2\2\2D\u0259\3\2\2\2F\u026b\3\2\2\2H\u027d\3\2"+
		"\2\2J\u028e\3\2\2\2L\u029f\3\2\2\2N\u02b6\3\2\2\2P\u02b8\3\2\2\2R\u02ca"+
		"\3\2\2\2T\u02fa\3\2\2\2V\u02fc\3\2\2\2X\u0319\3\2\2\2Z\u031b\3\2\2\2\\"+
		"\u0330\3\2\2\2^\u0332\3\2\2\2`\u033f\3\2\2\2b\u0341\3\2\2\2d\u0354\3\2"+
		"\2\2f\u0393\3\2\2\2h\u03b2\3\2\2\2j\u03b4\3\2\2\2l\u03c1\3\2\2\2n\u03c3"+
		"\3\2\2\2p\u03c5\3\2\2\2r\u03c7\3\2\2\2t\u03c9\3\2\2\2v\u03cb\3\2\2\2x"+
		"\u03cd\3\2\2\2z\u03cf\3\2\2\2|\u03d1\3\2\2\2~\u0400\3\2\2\2\u0080\u0402"+
		"\3\2\2\2\u0082\u0404\3\2\2\2\u0084\u0406\3\2\2\2\u0086\u0414\3\2\2\2\u0088"+
		"\u0418\3\2\2\2\u008a\u041a\3\2\2\2\u008c\u041c\3\2\2\2\u008e\u041e\3\2"+
		"\2\2\u0090\u0420\3\2\2\2\u0092\u0422\3\2\2\2\u0094\u0424\3\2\2\2\u0096"+
		"\u0426\3\2\2\2\u0098\u0428\3\2\2\2\u009a\u042a\3\2\2\2\u009c\u042c\3\2"+
		"\2\2\u009e\u042f\3\2\2\2\u00a0\u0462\3\2\2\2\u00a2\u0464\3\2\2\2\u00a4"+
		"\u0472\3\2\2\2\u00a6\u048e\3\2\2\2\u00a8\u0491\3\2\2\2\u00aa\u049d\3\2"+
		"\2\2\u00ac\u04a0\3\2\2\2\u00ae\u04a9\3\2\2\2\u00b0\u04ad\3\2\2\2\u00b2"+
		"\u04b1\3\2\2\2\u00b4\u04be\3\2\2\2\u00b6\u04c0\3\2\2\2\u00b8\u04c8\3\2"+
		"\2\2\u00ba\u04d9\3\2\2\2\u00bc\u04f6\3\2\2\2\u00be\u04f9\3\2\2\2\u00c0"+
		"\u0502\3\2\2\2\u00c2\u0507\3\2\2\2\u00c4\u0526\3\2\2\2\u00c6\u0545\3\2"+
		"\2\2\u00c8\u0556\3\2\2\2\u00ca\u0581\3\2\2\2\u00cc\u058b\3\2\2\2\u00ce"+
		"\u058d\3\2\2\2\u00d0\u05a1\3\2\2\2\u00d2\u05a3\3\2\2\2\u00d4\u05ae\3\2"+
		"\2\2\u00d6\u05b8\3\2\2\2\u00d8\u05ba\3\2\2\2\u00da\u05c4\3\2\2\2\u00dc"+
		"\u05ef\3\2\2\2\u00de\u05f2\3\2\2\2\u00e0\u05f7\3\2\2\2\u00e2\u05fb\3\2"+
		"\2\2\u00e4\u0618\3\2\2\2\u00e6\u061a\3\2\2\2\u00e8\u061e\3\2\2\2\u00ea"+
		"\u063b\3\2\2\2\u00ec\u063d\3\2\2\2\u00ee\u0643\3\2\2\2\u00f0\u0647\3\2"+
		"\2\2\u00f2\u00f9\5\6\4\2\u00f3\u00f9\5\u009eP\2\u00f4\u00f9\5\u00c8e\2"+
		"\u00f5\u00f9\5\4\3\2\u00f6\u00f9\5n8\2\u00f7\u00f9\5\u009cO\2\u00f8\u00f2"+
		"\3\2\2\2\u00f8\u00f3\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f8\u00f5\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fa\u00fb\3\2\2\2\u00fb\3\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe"+
		"\7P\2\2\u00fe\u00ff\7Q\2\2\u00ff\u0100\5\u00eav\2\u0100\u0101\7\3\2\2"+
		"\u0101\5\3\2\2\2\u0102\u0105\5\b\5\2\u0103\u0105\5\26\f\2\u0104\u0102"+
		"\3\2\2\2\u0104\u0103\3\2\2\2\u0105\7\3\2\2\2\u0106\u010b\5\n\6\2\u0107"+
		"\u010b\5\f\7\2\u0108\u010b\5\16\b\2\u0109\u010b\5\20\t\2\u010a\u0106\3"+
		"\2\2\2\u010a\u0107\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b"+
		"\t\3\2\2\2\u010c\u010d\7U\2\2\u010d\u010e\5\22\n\2\u010e\u010f\b\6\1\2"+
		"\u010f\13\3\2\2\2\u0110\u0111\7V\2\2\u0111\u0112\5\22\n\2\u0112\u0113"+
		"\b\7\1\2\u0113\r\3\2\2\2\u0114\u0115\7W\2\2\u0115\17\3\2\2\2\u0116\u0117"+
		"\7X\2\2\u0117\21\3\2\2\2\u0118\u011e\5\24\13\2\u0119\u011a\7\4\2\2\u011a"+
		"\u011b\5\24\13\2\u011b\u011c\7\5\2\2\u011c\u011e\3\2\2\2\u011d\u0118\3"+
		"\2\2\2\u011d\u0119\3\2\2\2\u011e\23\3\2\2\2\u011f\u0132\5\64\33\2\u0120"+
		"\u0121\5\u00dco\2\u0121\u0125\5\u00bc_\2\u0122\u0124\7r\2\2\u0123\u0122"+
		"\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012c\7\6\2\2\u0129\u012b\7r"+
		"\2\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0130\5\66"+
		"\34\2\u0130\u0132\3\2\2\2\u0131\u011f\3\2\2\2\u0131\u0120\3\2\2\2\u0132"+
		"\25\3\2\2\2\u0133\u013c\5\30\r\2\u0134\u013c\5\32\16\2\u0135\u013c\5\""+
		"\22\2\u0136\u013c\5$\23\2\u0137\u013c\5&\24\2\u0138\u013c\5(\25\2\u0139"+
		"\u013c\5\60\31\2\u013a\u013c\5\62\32\2\u013b\u0133\3\2\2\2\u013b\u0134"+
		"\3\2\2\2\u013b\u0135\3\2\2\2\u013b\u0136\3\2\2\2\u013b\u0137\3\2\2\2\u013b"+
		"\u0138\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013a\3\2\2\2\u013c\27\3\2\2"+
		"\2\u013d\u013e\7Y\2\2\u013e\u013f\5\34\17\2\u013f\u0140\7\4\2\2\u0140"+
		"\u0141\5\36\20\2\u0141\u0142\7\5\2\2\u0142\u0143\5 \21\2\u0143\u014b\3"+
		"\2\2\2\u0144\u0145\7Y\2\2\u0145\u0146\5\34\17\2\u0146\u0147\5 \21\2\u0147"+
		"\u014b\3\2\2\2\u0148\u0149\7Y\2\2\u0149\u014b\5\34\17\2\u014a\u013d\3"+
		"\2\2\2\u014a\u0144\3\2\2\2\u014a\u0148\3\2\2\2\u014b\31\3\2\2\2\u014c"+
		"\u014d\7Z\2\2\u014d\u014e\5\34\17\2\u014e\33\3\2\2\2\u014f\u0150\5\u00ea"+
		"v\2\u0150\35\3\2\2\2\u0151\u0154\5\u00eav\2\u0152\u0154\7u\2\2\u0153\u0151"+
		"\3\2\2\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u015c\3\2\2\2\u0155"+
		"\u0158\7\7\2\2\u0156\u0159\5\u00eav\2\u0157\u0159\7u\2\2\u0158\u0156\3"+
		"\2\2\2\u0158\u0157\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u0155\3\2\2\2\u015b"+
		"\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\37\3\2\2"+
		"\2\u015e\u015c\3\2\2\2\u015f\u0160\b\21\1\2\u0160!\3\2\2\2\u0161\u0162"+
		"\7[\2\2\u0162\u0165\7q\2\2\u0163\u0165\7[\2\2\u0164\u0161\3\2\2\2\u0164"+
		"\u0163\3\2\2\2\u0165#\3\2\2\2\u0166\u0168\7\\\2\2\u0167\u0169\7q\2\2\u0168"+
		"\u0167\3\2\2\2\u0168\u0169\3\2\2\2\u0169%\3\2\2\2\u016a\u016b\7]\2\2\u016b"+
		"\u0171\5*\26\2\u016c\u016d\7]\2\2\u016d\u0171\5\34\17\2\u016e\u016f\7"+
		"]\2\2\u016f\u0171\5,\27\2\u0170\u016a\3\2\2\2\u0170\u016c\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0171\'\3\2\2\2\u0172\u0173\7^\2\2\u0173\u0179\5*\26\2"+
		"\u0174\u0175\7^\2\2\u0175\u0179\5\34\17\2\u0176\u0177\7^\2\2\u0177\u0179"+
		"\5,\27\2\u0178\u0172\3\2\2\2\u0178\u0174\3\2\2\2\u0178\u0176\3\2\2\2\u0179"+
		")\3\2\2\2\u017a\u017b\7\b\2\2\u017b\u017c\5.\30\2\u017c\u017d\7\t\2\2"+
		"\u017d+\3\2\2\2\u017e\u017f\5.\30\2\u017f-\3\2\2\2\u0180\u0187\7q\2\2"+
		"\u0181\u0183\t\2\2\2\u0182\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0182"+
		"\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0180\3\2\2\2\u0186"+
		"\u0182\3\2\2\2\u0187/\3\2\2\2\u0188\u0189\7_\2\2\u0189\u018a\7l\2\2\u018a"+
		"\u0197\7q\2\2\u018b\u018c\7_\2\2\u018c\u018d\7l\2\2\u018d\u0197\5\34\17"+
		"\2\u018e\u018f\7_\2\2\u018f\u0190\5\34\17\2\u0190\u0191\7q\2\2\u0191\u0197"+
		"\3\2\2\2\u0192\u0193\7_\2\2\u0193\u0197\5\34\17\2\u0194\u0195\7_\2\2\u0195"+
		"\u0197\7l\2\2\u0196\u0188\3\2\2\2\u0196\u018b\3\2\2\2\u0196\u018e\3\2"+
		"\2\2\u0196\u0192\3\2\2\2\u0196\u0194\3\2\2\2\u0197\61\3\2\2\2\u0198\u019a"+
		"\7`\2\2\u0199\u019b\7a\2\2\u019a\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\u019d\7b\2\2\u019d\u019e\7q\2\2\u019e\u01b1\b\32"+
		"\1\2\u019f\u01a1\7`\2\2\u01a0\u01a2\7a\2\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2"+
		"\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\7b\2\2\u01a4\u01a6\5\u00eav\2"+
		"\u01a5\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8"+
		"\3\2\2\2\u01a8\u01b1\3\2\2\2\u01a9\u01ab\7`\2\2\u01aa\u01ac\7a\2\2\u01ab"+
		"\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01b1\7b"+
		"\2\2\u01ae\u01af\7`\2\2\u01af\u01b1\b\32\1\2\u01b0\u0198\3\2\2\2\u01b0"+
		"\u019f\3\2\2\2\u01b0\u01a9\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\63\3\2\2"+
		"\2\u01b2\u01b7\5\66\34\2\u01b3\u01b4\7s\2\2\u01b4\u01b6\7r\2\2\u01b5\u01b3"+
		"\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8"+
		"\u01c8\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01bc\7r\2\2\u01bb\u01ba\3\2"+
		"\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"\u01c0\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c4\7\7\2\2\u01c1\u01c3\7r"+
		"\2\2\u01c2\u01c1\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4"+
		"\u01c5\3\2\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01c9\5\64"+
		"\33\2\u01c8\u01bd\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ce\3\2\2\2\u01ca"+
		"\u01cb\7s\2\2\u01cb\u01cd\7r\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01d0\3\2\2"+
		"\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\65\3\2\2\2\u01d0\u01ce"+
		"\3\2\2\2\u01d1\u01e1\58\35\2\u01d2\u01d4\7r\2\2\u01d3\u01d2\3\2\2\2\u01d4"+
		"\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\3\2"+
		"\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01dc\5\u0080A\2\u01d9\u01db\7r\2\2\u01da"+
		"\u01d9\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2"+
		"\2\2\u01dd\u01df\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e0\5\66\34\2\u01e0"+
		"\u01e2\3\2\2\2\u01e1\u01d5\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\67\3\2\2"+
		"\2\u01e3\u0203\5:\36\2\u01e4\u01e8\5:\36\2\u01e5\u01e7\7r\2\2\u01e6\u01e5"+
		"\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9"+
		"\u01eb\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01ef\7\r\2\2\u01ec\u01ee\7r"+
		"\2\2\u01ed\u01ec\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef"+
		"\u01f0\3\2\2\2\u01f0\u01f2\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01f6\5\64"+
		"\33\2\u01f3\u01f5\7r\2\2\u01f4\u01f3\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6"+
		"\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01f6\3\2"+
		"\2\2\u01f9\u01fd\7\16\2\2\u01fa\u01fc\7r\2\2\u01fb\u01fa\3\2\2\2\u01fc"+
		"\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0200\3\2"+
		"\2\2\u01ff\u01fd\3\2\2\2\u0200\u0201\58\35\2\u0201\u0203\3\2\2\2\u0202"+
		"\u01e3\3\2\2\2\u0202\u01e4\3\2\2\2\u02039\3\2\2\2\u0204\u0213\5<\37\2"+
		"\u0205\u0207\7r\2\2\u0206\u0205\3\2\2\2\u0207\u020a\3\2\2\2\u0208\u0206"+
		"\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020b\3\2\2\2\u020a\u0208\3\2\2\2\u020b"+
		"\u020f\7\17\2\2\u020c\u020e\7r\2\2\u020d\u020c\3\2\2\2\u020e\u0211\3\2"+
		"\2\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0212\3\2\2\2\u0211"+
		"\u020f\3\2\2\2\u0212\u0214\5:\36\2\u0213\u0208\3\2\2\2\u0213\u0214\3\2"+
		"\2\2\u0214;\3\2\2\2\u0215\u0224\5> \2\u0216\u0218\7r\2\2\u0217\u0216\3"+
		"\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a"+
		"\u021c\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u0220\7\20\2\2\u021d\u021f\7"+
		"r\2\2\u021e\u021d\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220"+
		"\u0221\3\2\2\2\u0221\u0223\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0225\5<"+
		"\37\2\u0224\u0219\3\2\2\2\u0224\u0225\3\2\2\2\u0225=\3\2\2\2\u0226\u0235"+
		"\5@!\2\u0227\u0229\7r\2\2\u0228\u0227\3\2\2\2\u0229\u022c\3\2\2\2\u022a"+
		"\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022d\3\2\2\2\u022c\u022a\3\2"+
		"\2\2\u022d\u0231\7\21\2\2\u022e\u0230\7r\2\2\u022f\u022e\3\2\2\2\u0230"+
		"\u0233\3\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0234\3\2"+
		"\2\2\u0233\u0231\3\2\2\2\u0234\u0236\5> \2\u0235\u022a\3\2\2\2\u0235\u0236"+
		"\3\2\2\2\u0236?\3\2\2\2\u0237\u0246\5B\"\2\u0238\u023a\7r\2\2\u0239\u0238"+
		"\3\2\2\2\u023a\u023d\3\2\2\2\u023b\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023c"+
		"\u023e\3\2\2\2\u023d\u023b\3\2\2\2\u023e\u0242\7\22\2\2\u023f\u0241\7"+
		"r\2\2\u0240\u023f\3\2\2\2\u0241\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0242"+
		"\u0243\3\2\2\2\u0243\u0245\3\2\2\2\u0244\u0242\3\2\2\2\u0245\u0247\5@"+
		"!\2\u0246\u023b\3\2\2\2\u0246\u0247\3\2\2\2\u0247A\3\2\2\2\u0248\u0257"+
		"\5D#\2\u0249\u024b\7r\2\2\u024a\u0249\3\2\2\2\u024b\u024e\3\2\2\2\u024c"+
		"\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024f\3\2\2\2\u024e\u024c\3\2"+
		"\2\2\u024f\u0253\7\23\2\2\u0250\u0252\7r\2\2\u0251\u0250\3\2\2\2\u0252"+
		"\u0255\3\2\2\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0256\3\2"+
		"\2\2\u0255\u0253\3\2\2\2\u0256\u0258\5B\"\2\u0257\u024c\3\2\2\2\u0257"+
		"\u0258\3\2\2\2\u0258C\3\2\2\2\u0259\u0269\5F$\2\u025a\u025c\7r\2\2\u025b"+
		"\u025a\3\2\2\2\u025c\u025f\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2"+
		"\2\2\u025e\u0260\3\2\2\2\u025f\u025d\3\2\2\2\u0260\u0264\5\u0082B\2\u0261"+
		"\u0263\7r\2\2\u0262\u0261\3\2\2\2\u0263\u0266\3\2\2\2\u0264\u0262\3\2"+
		"\2\2\u0264\u0265\3\2\2\2\u0265\u0267\3\2\2\2\u0266\u0264\3\2\2\2\u0267"+
		"\u0268\5D#\2\u0268\u026a\3\2\2\2\u0269\u025d\3\2\2\2\u0269\u026a\3\2\2"+
		"\2\u026aE\3\2\2\2\u026b\u027b\5H%\2\u026c\u026e\7r\2\2\u026d\u026c\3\2"+
		"\2\2\u026e\u0271\3\2\2\2\u026f\u026d\3\2\2\2\u026f\u0270\3\2\2\2\u0270"+
		"\u0272\3\2\2\2\u0271\u026f\3\2\2\2\u0272\u0276\5t;\2\u0273\u0275\7r\2"+
		"\2\u0274\u0273\3\2\2\2\u0275\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277"+
		"\3\2\2\2\u0277\u0279\3\2\2\2\u0278\u0276\3\2\2\2\u0279\u027a\5F$\2\u027a"+
		"\u027c\3\2\2\2\u027b\u026f\3\2\2\2\u027b\u027c\3\2\2\2\u027cG\3\2\2\2"+
		"\u027d\u028c\5J&\2\u027e\u0280\7r\2\2\u027f\u027e\3\2\2\2\u0280\u0283"+
		"\3\2\2\2\u0281\u027f\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0284\3\2\2\2\u0283"+
		"\u0281\3\2\2\2\u0284\u0288\t\3\2\2\u0285\u0287\7r\2\2\u0286\u0285\3\2"+
		"\2\2\u0287\u028a\3\2\2\2\u0288\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289"+
		"\u028b\3\2\2\2\u028a\u0288\3\2\2\2\u028b\u028d\5H%\2\u028c\u0281\3\2\2"+
		"\2\u028c\u028d\3\2\2\2\u028dI\3\2\2\2\u028e\u029d\5L\'\2\u028f\u0291\7"+
		"r\2\2\u0290\u028f\3\2\2\2\u0291\u0294\3\2\2\2\u0292\u0290\3\2\2\2\u0292"+
		"\u0293\3\2\2\2\u0293\u0295\3\2\2\2\u0294\u0292\3\2\2\2\u0295\u0299\t\4"+
		"\2\2\u0296\u0298\7r\2\2\u0297\u0296\3\2\2\2\u0298\u029b\3\2\2\2\u0299"+
		"\u0297\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029c\3\2\2\2\u029b\u0299\3\2"+
		"\2\2\u029c\u029e\5J&\2\u029d\u0292\3\2\2\2\u029d\u029e\3\2\2\2\u029eK"+
		"\3\2\2\2\u029f\u02ae\5N(\2\u02a0\u02a2\7r\2\2\u02a1\u02a0\3\2\2\2\u02a2"+
		"\u02a5\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a6\3\2"+
		"\2\2\u02a5\u02a3\3\2\2\2\u02a6\u02aa\t\5\2\2\u02a7\u02a9\7r\2\2\u02a8"+
		"\u02a7\3\2\2\2\u02a9\u02ac\3\2\2\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2"+
		"\2\2\u02ab\u02ad\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ad\u02af\5L\'\2\u02ae"+
		"\u02a3\3\2\2\2\u02ae\u02af\3\2\2\2\u02afM\3\2\2\2\u02b0\u02b1\7\4\2\2"+
		"\u02b1\u02b2\5P)\2\u02b2\u02b3\7\5\2\2\u02b3\u02b4\5N(\2\u02b4\u02b7\3"+
		"\2\2\2\u02b5\u02b7\5R*\2\u02b6\u02b0\3\2\2\2\u02b6\u02b5\3\2\2\2\u02b7"+
		"O\3\2\2\2\u02b8\u02c2\5\u00dco\2\u02b9\u02bb\7r\2\2\u02ba\u02b9\3\2\2"+
		"\2\u02bb\u02be\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02bf"+
		"\3\2\2\2\u02be\u02bc\3\2\2\2\u02bf\u02c1\5z>\2\u02c0\u02bc\3\2\2\2\u02c1"+
		"\u02c4\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3Q\3\2\2\2"+
		"\u02c4\u02c2\3\2\2\2\u02c5\u02cb\5V,\2\u02c6\u02cb\5X-\2\u02c7\u02cb\5"+
		"T+\2\u02c8\u02cb\5d\63\2\u02c9\u02cb\5\\/\2\u02ca\u02c5\3\2\2\2\u02ca"+
		"\u02c6\3\2\2\2\u02ca\u02c7\3\2\2\2\u02ca\u02c8\3\2\2\2\u02ca\u02c9\3\2"+
		"\2\2\u02cbS\3\2\2\2\u02cc\u02ce\7\31\2\2\u02cd\u02cc\3\2\2\2\u02cd\u02ce"+
		"\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d3\7f\2\2\u02d0\u02d2\7r\2\2\u02d1"+
		"\u02d0\3\2\2\2\u02d2\u02d5\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3\u02d4\3\2"+
		"\2\2\u02d4\u02d6\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d6\u02da\5\u00dco\2\u02d7"+
		"\u02d9\7r\2\2\u02d8\u02d7\3\2\2\2\u02d9\u02dc\3\2\2\2\u02da\u02d8\3\2"+
		"\2\2\u02da\u02db\3\2\2\2\u02db\u02dd\3\2\2\2\u02dc\u02da\3\2\2\2\u02dd"+
		"\u02df\7\32\2\2\u02de\u02e0\58\35\2\u02df\u02de\3\2\2\2\u02df\u02e0\3"+
		"\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e2\7\33\2\2\u02e2\u02fb\3\2\2\2\u02e3"+
		"\u02e5\7\31\2\2\u02e4\u02e3\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e6\3"+
		"\2\2\2\u02e6\u02ea\7f\2\2\u02e7\u02e9\7r\2\2\u02e8\u02e7\3\2\2\2\u02e9"+
		"\u02ec\3\2\2\2\u02ea\u02e8\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ed\3\2"+
		"\2\2\u02ec\u02ea\3\2\2\2\u02ed\u02f1\5\u00dco\2\u02ee\u02f0\7r\2\2\u02ef"+
		"\u02ee\3\2\2\2\u02f0\u02f3\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f1\u02f2\3\2"+
		"\2\2\u02f2\u02f4\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f4\u02f6\7\4\2\2\u02f5"+
		"\u02f7\5\64\33\2\u02f6\u02f5\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f8\3"+
		"\2\2\2\u02f8\u02f9\7\5\2\2\u02f9\u02fb\3\2\2\2\u02fa\u02cd\3\2\2\2\u02fa"+
		"\u02e4\3\2\2\2\u02fbU\3\2\2\2\u02fc\u0300\5r:\2\u02fd\u02ff\7r\2\2\u02fe"+
		"\u02fd\3\2\2\2\u02ff\u0302\3\2\2\2\u0300\u02fe\3\2\2\2\u0300\u0301\3\2"+
		"\2\2\u0301\u0303\3\2\2\2\u0302\u0300\3\2\2\2\u0303\u0304\5N(\2\u0304W"+
		"\3\2\2\2\u0305\u0309\5Z.\2\u0306\u0308\7r\2\2\u0307\u0306\3\2\2\2\u0308"+
		"\u030b\3\2\2\2\u0309\u0307\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030c\3\2"+
		"\2\2\u030b\u0309\3\2\2\2\u030c\u030d\7\4\2\2\u030d\u030e\5^\60\2\u030e"+
		"\u030f\7\5\2\2\u030f\u031a\3\2\2\2\u0310\u0314\5Z.\2\u0311\u0313\7r\2"+
		"\2\u0312\u0311\3\2\2\2\u0313\u0316\3\2\2\2\u0314\u0312\3\2\2\2\u0314\u0315"+
		"\3\2\2\2\u0315\u0317\3\2\2\2\u0316\u0314\3\2\2\2\u0317\u0318\5`\61\2\u0318"+
		"\u031a\3\2\2\2\u0319\u0305\3\2\2\2\u0319\u0310\3\2\2\2\u031aY\3\2\2\2"+
		"\u031b\u031c\7\34\2\2\u031c[\3\2\2\2\u031d\u0321\7\35\2\2\u031e\u0320"+
		"\7r\2\2\u031f\u031e\3\2\2\2\u0320\u0323\3\2\2\2\u0321\u031f\3\2\2\2\u0321"+
		"\u0322\3\2\2\2\u0322\u0324\3\2\2\2\u0323\u0321\3\2\2\2\u0324\u0325\7\4"+
		"\2\2\u0325\u0326\5\64\33\2\u0326\u0327\7\5\2\2\u0327\u0331\3\2\2\2\u0328"+
		"\u032c\7\35\2\2\u0329\u032b\7r\2\2\u032a\u0329\3\2\2\2\u032b\u032e\3\2"+
		"\2\2\u032c\u032a\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u032f\3\2\2\2\u032e"+
		"\u032c\3\2\2\2\u032f\u0331\5\64\33\2\u0330\u031d\3\2\2\2\u0330\u0328\3"+
		"\2\2\2\u0331]\3\2\2\2\u0332\u033c\5\u00dco\2\u0333\u0335\7r\2\2\u0334"+
		"\u0333\3\2\2\2\u0335\u0338\3\2\2\2\u0336\u0334\3\2\2\2\u0336\u0337\3\2"+
		"\2\2\u0337\u0339\3\2\2\2\u0338\u0336\3\2\2\2\u0339\u033b\5z>\2\u033a\u0336"+
		"\3\2\2\2\u033b\u033e\3\2\2\2\u033c\u033a\3\2\2\2\u033c\u033d\3\2\2\2\u033d"+
		"_\3\2\2\2\u033e\u033c\3\2\2\2\u033f\u0340\5R*\2\u0340a\3\2\2\2\u0341\u0342"+
		"\t\6\2\2\u0342c\3\2\2\2\u0343\u0344\b\63\1\2\u0344\u0355\5l\67\2\u0345"+
		"\u0347\5z>\2\u0346\u0345\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0348\3\2\2"+
		"\2\u0348\u034c\5b\62\2\u0349\u034b\7r\2\2\u034a\u0349\3\2\2\2\u034b\u034e"+
		"\3\2\2\2\u034c\u034a\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u0350\3\2\2\2\u034e"+
		"\u034c\3\2\2\2\u034f\u0351\5z>\2\u0350\u034f\3\2\2\2\u0350\u0351\3\2\2"+
		"\2\u0351\u0352\3\2\2\2\u0352\u0353\5l\67\2\u0353\u0355\3\2\2\2\u0354\u0343"+
		"\3\2\2\2\u0354\u0346\3\2\2\2\u0355\u038e\3\2\2\2\u0356\u035a\f\t\2\2\u0357"+
		"\u0359\7r\2\2\u0358\u0357\3\2\2\2\u0359\u035c\3\2\2\2\u035a\u0358\3\2"+
		"\2\2\u035a\u035b\3\2\2\2\u035b\u035d\3\2\2\2\u035c\u035a\3\2\2\2\u035d"+
		"\u035e\7\32\2\2\u035e\u035f\5\64\33\2\u035f\u0360\7\33\2\2\u0360\u038d"+
		"\3\2\2\2\u0361\u0365\f\b\2\2\u0362\u0364\7r\2\2\u0363\u0362\3\2\2\2\u0364"+
		"\u0367\3\2\2\2\u0365\u0363\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0368\3\2"+
		"\2\2\u0367\u0365\3\2\2\2\u0368\u0369\7\4\2\2\u0369\u036a\5h\65\2\u036a"+
		"\u036b\7\5\2\2\u036b\u038d\3\2\2\2\u036c\u036d\f\7\2\2\u036d\u0371\7\n"+
		"\2\2\u036e\u0370\7r\2\2\u036f\u036e\3\2\2\2\u0370\u0373\3\2\2\2\u0371"+
		"\u036f\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0375\3\2\2\2\u0373\u0371\3\2"+
		"\2\2\u0374\u0376\7e\2\2\u0375\u0374\3\2\2\2\u0375\u0376\3\2\2\2\u0376"+
		"\u0377\3\2\2\2\u0377\u038d\5\u00eav\2\u0378\u0379\f\6\2\2\u0379\u037d"+
		"\7 \2\2\u037a\u037c\7r\2\2\u037b\u037a\3\2\2\2\u037c\u037f\3\2\2\2\u037d"+
		"\u037b\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u0381\3\2\2\2\u037f\u037d\3\2"+
		"\2\2\u0380\u0382\7e\2\2\u0381\u0380\3\2\2\2\u0381\u0382\3\2\2\2\u0382"+
		"\u0383\3\2\2\2\u0383\u038d\5\u00eav\2\u0384\u0388\f\5\2\2\u0385\u0387"+
		"\7r\2\2\u0386\u0385\3\2\2\2\u0387\u038a\3\2\2\2\u0388\u0386\3\2\2\2\u0388"+
		"\u0389\3\2\2\2\u0389\u038b\3\2\2\2\u038a\u0388\3\2\2\2\u038b\u038d\5b"+
		"\62\2\u038c\u0356\3\2\2\2\u038c\u0361\3\2\2\2\u038c\u036c\3\2\2\2\u038c"+
		"\u0378\3\2\2\2\u038c\u0384\3\2\2\2\u038d\u0390\3\2\2\2\u038e\u038c\3\2"+
		"\2\2\u038e\u038f\3\2\2\2\u038fe\3\2\2\2\u0390\u038e\3\2\2\2\u0391\u0394"+
		"\5\u00eav\2\u0392\u0394\5v<\2\u0393\u0391\3\2\2\2\u0393\u0392\3\2\2\2"+
		"\u0394\u0395\3\2\2\2\u0395\u0398\7\4\2\2\u0396\u0399\5h\65\2\u0397\u0399"+
		"\7G\2\2\u0398\u0396\3\2\2\2\u0398\u0397\3\2\2\2\u0399\u039a\3\2\2\2\u039a"+
		"\u039b\7\5\2\2\u039bg\3\2\2\2\u039c\u039e\5j\66\2\u039d\u039c\3\2\2\2"+
		"\u039e\u039f\3\2\2\2\u039f\u039d\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03af"+
		"\3\2\2\2\u03a1\u03a5\7\7\2\2\u03a2\u03a4\7r\2\2\u03a3\u03a2\3\2\2\2\u03a4"+
		"\u03a7\3\2\2\2\u03a5\u03a3\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a9\3\2"+
		"\2\2\u03a7\u03a5\3\2\2\2\u03a8\u03aa\5j\66\2\u03a9\u03a8\3\2\2\2\u03aa"+
		"\u03ab\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03ae\3\2"+
		"\2\2\u03ad\u03a1\3\2\2\2\u03ae\u03b1\3\2\2\2\u03af\u03ad\3\2\2\2\u03af"+
		"\u03b0\3\2\2\2\u03b0\u03b3\3\2\2\2\u03b1\u03af\3\2\2\2\u03b2\u039d\3\2"+
		"\2\2\u03b2\u03b3\3\2\2\2\u03b3i\3\2\2\2\u03b4\u03b8\5\66\34\2\u03b5\u03b7"+
		"\7r\2\2\u03b6\u03b5\3\2\2\2\u03b7\u03ba\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b8"+
		"\u03b9\3\2\2\2\u03b9k\3\2\2\2\u03ba\u03b8\3\2\2\2\u03bb\u03c2\5\u00ea"+
		"v\2\u03bc\u03c2\5v<\2\u03bd\u03be\7\4\2\2\u03be\u03bf\5\64\33\2\u03bf"+
		"\u03c0\7\5\2\2\u03c0\u03c2\3\2\2\2\u03c1\u03bb\3\2\2\2\u03c1\u03bc\3\2"+
		"\2\2\u03c1\u03bd\3\2\2\2\u03c2m\3\2\2\2\u03c3\u03c4\7o\2\2\u03c4o\3\2"+
		"\2\2\u03c5\u03c6\7r\2\2\u03c6q\3\2\2\2\u03c7\u03c8\t\7\2\2\u03c8s\3\2"+
		"\2\2\u03c9\u03ca\t\b\2\2\u03cau\3\2\2\2\u03cb\u03cc\t\t\2\2\u03ccw\3\2"+
		"\2\2\u03cd\u03ce\t\n\2\2\u03cey\3\2\2\2\u03cf\u03d0\t\13\2\2\u03d0{\3"+
		"\2\2\2\u03d1\u03d2\t\f\2\2\u03d2}\3\2\2\2\u03d3\u03d6\t\r\2\2\u03d4\u03d5"+
		"\7\32\2\2\u03d5\u03d7\7\33\2\2\u03d6\u03d4\3\2\2\2\u03d6\u03d7\3\2\2\2"+
		"\u03d7\u0401\3\2\2\2\u03d8\u0401\7\26\2\2\u03d9\u0401\7\13\2\2\u03da\u0401"+
		"\7\27\2\2\u03db\u0401\7\f\2\2\u03dc\u0401\7\30\2\2\u03dd\u0401\7\22\2"+
		"\2\u03de\u0401\7\23\2\2\u03df\u0401\7\21\2\2\u03e0\u0401\7!\2\2\u03e1"+
		"\u0401\7\"\2\2\u03e2\u0401\7\6\2\2\u03e3\u0401\7\b\2\2\u03e4\u0401\7\t"+
		"\2\2\u03e5\u0401\7,\2\2\u03e6\u0401\7-\2\2\u03e7\u0401\7.\2\2\u03e8\u0401"+
		"\7/\2\2\u03e9\u0401\7\60\2\2\u03ea\u0401\7\61\2\2\u03eb\u0401\7\62\2\2"+
		"\u03ec\u0401\7\63\2\2\u03ed\u0401\7\25\2\2\u03ee\u0401\7\24\2\2\u03ef"+
		"\u0401\7\64\2\2\u03f0\u0401\7\65\2\2\u03f1\u0401\7\66\2\2\u03f2\u0401"+
		"\7\67\2\2\u03f3\u0401\7#\2\2\u03f4\u0401\7$\2\2\u03f5\u0401\7\20\2\2\u03f6"+
		"\u0401\7\17\2\2\u03f7\u0401\7\37\2\2\u03f8\u0401\7\36\2\2\u03f9\u0401"+
		"\7\7\2\2\u03fa\u0401\78\2\2\u03fb\u0401\7 \2\2\u03fc\u03fd\7\4\2\2\u03fd"+
		"\u0401\7\5\2\2\u03fe\u03ff\7\32\2\2\u03ff\u0401\7\33\2\2\u0400\u03d3\3"+
		"\2\2\2\u0400\u03d8\3\2\2\2\u0400\u03d9\3\2\2\2\u0400\u03da\3\2\2\2\u0400"+
		"\u03db\3\2\2\2\u0400\u03dc\3\2\2\2\u0400\u03dd\3\2\2\2\u0400\u03de\3\2"+
		"\2\2\u0400\u03df\3\2\2\2\u0400\u03e0\3\2\2\2\u0400\u03e1\3\2\2\2\u0400"+
		"\u03e2\3\2\2\2\u0400\u03e3\3\2\2\2\u0400\u03e4\3\2\2\2\u0400\u03e5\3\2"+
		"\2\2\u0400\u03e6\3\2\2\2\u0400\u03e7\3\2\2\2\u0400\u03e8\3\2\2\2\u0400"+
		"\u03e9\3\2\2\2\u0400\u03ea\3\2\2\2\u0400\u03eb\3\2\2\2\u0400\u03ec\3\2"+
		"\2\2\u0400\u03ed\3\2\2\2\u0400\u03ee\3\2\2\2\u0400\u03ef\3\2\2\2\u0400"+
		"\u03f0\3\2\2\2\u0400\u03f1\3\2\2\2\u0400\u03f2\3\2\2\2\u0400\u03f3\3\2"+
		"\2\2\u0400\u03f4\3\2\2\2\u0400\u03f5\3\2\2\2\u0400\u03f6\3\2\2\2\u0400"+
		"\u03f7\3\2\2\2\u0400\u03f8\3\2\2\2\u0400\u03f9\3\2\2\2\u0400\u03fa\3\2"+
		"\2\2\u0400\u03fb\3\2\2\2\u0400\u03fc\3\2\2\2\u0400\u03fe\3\2\2\2\u0401"+
		"\177\3\2\2\2\u0402\u0403\t\16\2\2\u0403\u0081\3\2\2\2\u0404\u0405\t\17"+
		"\2\2\u0405\u0083\3\2\2\2\u0406\u0407\7e\2\2\u0407\u0408\7\b\2\2\u0408"+
		"\u0409\5\u0086D\2\u0409\u040a\7\t\2\2\u040a\u0085\3\2\2\2\u040b\u040c"+
		"\7\b\2\2\u040c\u040d\5\u0086D\2\u040d\u040e\7\t\2\2\u040e\u0415\3\2\2"+
		"\2\u040f\u0410\7\4\2\2\u0410\u0411\5\u0086D\2\u0411\u0412\7\5\2\2\u0412"+
		"\u0415\3\2\2\2\u0413\u0415\5\u008eH\2\u0414\u040b\3\2\2\2\u0414\u040f"+
		"\3\2\2\2\u0414\u0413\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0414\3\2\2\2\u0416"+
		"\u0417\3\2\2\2\u0417\u0087\3\2\2\2\u0418\u0419\n\20\2\2\u0419\u0089\3"+
		"\2\2\2\u041a\u041b\n\21\2\2\u041b\u008b\3\2\2\2\u041c\u041d\n\22\2\2\u041d"+
		"\u008d\3\2\2\2\u041e\u041f\n\23\2\2\u041f\u008f\3\2\2\2\u0420\u0421\n"+
		"\24\2\2\u0421\u0091\3\2\2\2\u0422\u0423\n\25\2\2\u0423\u0093\3\2\2\2\u0424"+
		"\u0425\n\26\2\2\u0425\u0095\3\2\2\2\u0426\u0427\n\27\2\2\u0427\u0097\3"+
		"\2\2\2\u0428\u0429\n\30\2\2\u0429\u0099\3\2\2\2\u042a\u042b\n\21\2\2\u042b"+
		"\u009b\3\2\2\2\u042c\u042d\13\2\2\2\u042d\u009d\3\2\2\2\u042e\u0430\5"+
		"\u0084C\2\u042f\u042e\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0434\3\2\2\2"+
		"\u0431\u0433\7r\2\2\u0432\u0431\3\2\2\2\u0433\u0436\3\2\2\2\u0434\u0432"+
		"\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u0438\3\2\2\2\u0436\u0434\3\2\2\2\u0437"+
		"\u0439\5\u00a0Q\2\u0438\u0437\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043d"+
		"\3\2\2\2\u043a\u043c\7r\2\2\u043b\u043a\3\2\2\2\u043c\u043f\3\2\2\2\u043d"+
		"\u043b\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u0440\3\2\2\2\u043f\u043d\3\2"+
		"\2\2\u0440\u0444\5\u00b4[\2\u0441\u0443\7r\2\2\u0442\u0441\3\2\2\2\u0443"+
		"\u0446\3\2\2\2\u0444\u0442\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u0447\3\2"+
		"\2\2\u0446\u0444\3\2\2\2\u0447\u0449\5\u00a2R\2\u0448\u044a\5\u00acW\2"+
		"\u0449\u0448\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u044b\3\2\2\2\u044b\u044c"+
		"\5\u00aaV\2\u044c\u009f\3\2\2\2\u044d\u044f\5x=\2\u044e\u044d\3\2\2\2"+
		"\u044f\u0452\3\2\2\2\u0450\u044e\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u0456"+
		"\3\2\2\2\u0452\u0450\3\2\2\2\u0453\u0455\7r\2\2\u0454\u0453\3\2\2\2\u0455"+
		"\u0458\3\2\2\2\u0456\u0454\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u0459\3\2"+
		"\2\2\u0458\u0456\3\2\2\2\u0459\u045a\5\u00dco\2\u045a\u045e\3\2\2\2\u045b"+
		"\u045d\5z>\2\u045c\u045b\3\2\2\2\u045d\u0460\3\2\2\2\u045e\u045c\3\2\2"+
		"\2\u045e\u045f\3\2\2\2\u045f\u0463\3\2\2\2\u0460\u045e\3\2\2\2\u0461\u0463"+
		"\5f\64\2\u0462\u0450\3\2\2\2\u0462\u0461\3\2\2\2\u0463\u00a1\3\2\2\2\u0464"+
		"\u0466\7\4\2\2\u0465\u0467\5\u00a4S\2\u0466\u0465\3\2\2\2\u0466\u0467"+
		"\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u046c\7\5\2\2\u0469\u046b\7K\2\2\u046a"+
		"\u0469\3\2\2\2\u046b\u046e\3\2\2\2\u046c\u046a\3\2\2\2\u046c\u046d\3\2"+
		"\2\2\u046d\u0470\3\2\2\2\u046e\u046c\3\2\2\2\u046f\u0471\5\u00b6\\\2\u0470"+
		"\u046f\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u00a3\3\2\2\2\u0472\u047d\5\u00a6"+
		"T\2\u0473\u0477\7\7\2\2\u0474\u0476\7r\2\2\u0475\u0474\3\2\2\2\u0476\u0479"+
		"\3\2\2\2\u0477\u0475\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u047a\3\2\2\2\u0479"+
		"\u0477\3\2\2\2\u047a\u047c\5\u00a6T\2\u047b\u0473\3\2\2\2\u047c\u047f"+
		"\3\2\2\2\u047d\u047b\3\2\2\2\u047d\u047e\3\2\2\2\u047e\u0488\3\2\2\2\u047f"+
		"\u047d\3\2\2\2\u0480\u0484\7\7\2\2\u0481\u0483\7r\2\2\u0482\u0481\3\2"+
		"\2\2\u0483\u0486\3\2\2\2\u0484\u0482\3\2\2\2\u0484\u0485\3\2\2\2\u0485"+
		"\u0487\3\2\2\2\u0486\u0484\3\2\2\2\u0487\u0489\7u\2\2\u0488\u0480\3\2"+
		"\2\2\u0488\u0489\3\2\2\2\u0489\u00a5\3\2\2\2\u048a\u048f\7G\2\2\u048b"+
		"\u048c\5\u00e0q\2\u048c\u048d\5\u00a8U\2\u048d\u048f\3\2\2\2\u048e\u048a"+
		"\3\2\2\2\u048e\u048b\3\2\2\2\u048f\u00a7\3\2\2\2\u0490\u0492\5\u00eex"+
		"\2\u0491\u0490\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0498\3\2\2\2\u0493\u0494"+
		"\7\4\2\2\u0494\u0495\5\u00a8U\2\u0495\u0496\7\5\2\2\u0496\u0499\3\2\2"+
		"\2\u0497\u0499\5\u00e2r\2\u0498\u0493\3\2\2\2\u0498\u0497\3\2\2\2\u0499"+
		"\u049b\3\2\2\2\u049a\u049c\5\u00c0a\2\u049b\u049a\3\2\2\2\u049b\u049c"+
		"\3\2\2\2\u049c\u00a9\3\2\2\2\u049d\u049e\7i\2\2\u049e\u049f\bV\1\2\u049f"+
		"\u00ab\3\2\2\2\u04a0\u04a1\7\16\2\2\u04a1\u04a6\5\u00aeX\2\u04a2\u04a3"+
		"\7\7\2\2\u04a3\u04a5\5\u00aeX\2\u04a4\u04a2\3\2\2\2\u04a5\u04a8\3\2\2"+
		"\2\u04a6\u04a4\3\2\2\2\u04a6\u04a7\3\2\2\2\u04a7\u00ad\3\2\2\2\u04a8\u04a6"+
		"\3\2\2\2\u04a9\u04aa\5\u00b0Y\2\u04aa\u04ab\5\u00b2Z\2\u04ab\u00af\3\2"+
		"\2\2\u04ac\u04ae\7\31\2\2\u04ad\u04ac\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae"+
		"\u04af\3\2\2\2\u04af\u04b0\5\u00eav\2\u04b0\u00b1\3\2\2\2\u04b1\u04b3"+
		"\7\4\2\2\u04b2\u04b4\5\64\33\2\u04b3\u04b2\3\2\2\2\u04b3\u04b4\3\2\2\2"+
		"\u04b4\u04b5\3\2\2\2\u04b5\u04b6\7\5\2\2\u04b6\u00b3\3\2\2\2\u04b7\u04b8"+
		"\7\4\2\2\u04b8\u04b9\5\u00b4[\2\u04b9\u04ba\7\5\2\2\u04ba\u04bf\3\2\2"+
		"\2\u04bb\u04bf\5\u00eav\2\u04bc\u04bd\7d\2\2\u04bd\u04bf\5~@\2\u04be\u04b7"+
		"\3\2\2\2\u04be\u04bb\3\2\2\2\u04be\u04bc\3\2\2\2\u04bf\u00b5\3\2\2\2\u04c0"+
		"\u04c1\7O\2\2\u04c1\u04c2\7\4\2\2\u04c2\u04c3\5\u00b8]\2\u04c3\u04c4\7"+
		"\5\2\2\u04c4\u00b7\3\2\2\2\u04c5\u04c7\5\u0088E\2\u04c6\u04c5\3\2\2\2"+
		"\u04c7\u04ca\3\2\2\2\u04c8\u04c6\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04d6"+
		"\3\2\2\2\u04ca\u04c8\3\2\2\2\u04cb\u04cc\7\4\2\2\u04cc\u04cd\5\u00b8]"+
		"\2\u04cd\u04d1\7\5\2\2\u04ce\u04d0\5\u0088E\2\u04cf\u04ce\3\2\2\2\u04d0"+
		"\u04d3\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d5\3\2"+
		"\2\2\u04d3\u04d1\3\2\2\2\u04d4\u04cb\3\2\2\2\u04d5\u04d8\3\2\2\2\u04d6"+
		"\u04d4\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7\u00b9\3\2\2\2\u04d8\u04d6\3\2"+
		"\2\2\u04d9\u04e1\5\u00bc_\2\u04da\u04dc\7\4\2\2\u04db\u04dd\5\64\33\2"+
		"\u04dc\u04db\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04e2"+
		"\7\5\2\2\u04df\u04e0\7\6\2\2\u04e0\u04e2\5\u00c2b\2\u04e1\u04da\3\2\2"+
		"\2\u04e1\u04df\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2\u00bb\3\2\2\2\u04e3\u04e5"+
		"\5\u00eex\2\u04e4\u04e3\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e6\3\2\2"+
		"\2\u04e6\u04e8\5\u00eav\2\u04e7\u04e9\5\u00c0a\2\u04e8\u04e7\3\2\2\2\u04e8"+
		"\u04e9\3\2\2\2\u04e9\u04f7\3\2\2\2\u04ea\u04ec\5\u00eex\2\u04eb\u04ea"+
		"\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed\u04ef\7\4\2\2\u04ee"+
		"\u04f0\5\u00be`\2\u04ef\u04ee\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u04f1"+
		"\3\2\2\2\u04f1\u04f2\5\u00f0y\2\u04f2\u04f3\5\u00eav\2\u04f3\u04f4\7\5"+
		"\2\2\u04f4\u04f5\5\u00c0a\2\u04f5\u04f7\3\2\2\2\u04f6\u04e4\3\2\2\2\u04f6"+
		"\u04eb\3\2\2\2\u04f7\u00bd\3\2\2\2\u04f8\u04fa\7h\2\2\u04f9\u04f8\3\2"+
		"\2\2\u04fa\u04fb\3\2\2\2\u04fb\u04f9\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc"+
		"\u00bf\3\2\2\2\u04fd\u04fe\7\32\2\2\u04fe\u04ff\5\u00c6d\2\u04ff\u0500"+
		"\7\33\2\2\u0500\u0503\3\2\2\2\u0501\u0503\5\u00e4s\2\u0502\u04fd\3\2\2"+
		"\2\u0502\u0501\3\2\2\2\u0503\u00c1\3\2\2\2\u0504\u0506\5\u0098M\2\u0505"+
		"\u0504\3\2\2\2\u0506\u0509\3\2\2\2\u0507\u0505\3\2\2\2\u0507\u0508\3\2"+
		"\2\2\u0508\u0520\3\2\2\2\u0509\u0507\3\2\2\2\u050a\u050b\7i\2\2\u050b"+
		"\u050c\5\u00c4c\2\u050c\u050d\7j\2\2\u050d\u0517\3\2\2\2\u050e\u050f\7"+
		"\4\2\2\u050f\u0510\5\u00c4c\2\u0510\u0511\7\5\2\2\u0511\u0517\3\2\2\2"+
		"\u0512\u0513\7\32\2\2\u0513\u0514\5\u00c4c\2\u0514\u0515\7\33\2\2\u0515"+
		"\u0517\3\2\2\2\u0516\u050a\3\2\2\2\u0516\u050e\3\2\2\2\u0516\u0512\3\2"+
		"\2\2\u0517\u051b\3\2\2\2\u0518\u051a\5\u0098M\2\u0519\u0518\3\2\2\2\u051a"+
		"\u051d\3\2\2\2\u051b\u0519\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u051f\3\2"+
		"\2\2\u051d\u051b\3\2\2\2\u051e\u0516\3\2\2\2\u051f\u0522\3\2\2\2\u0520"+
		"\u051e\3\2\2\2\u0520\u0521\3\2\2\2\u0521\u00c3\3\2\2\2\u0522\u0520\3\2"+
		"\2\2\u0523\u0525\5\u009aN\2\u0524\u0523\3\2\2\2\u0525\u0528\3\2\2\2\u0526"+
		"\u0524\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u053f\3\2\2\2\u0528\u0526\3\2"+
		"\2\2\u0529\u052a\7i\2\2\u052a\u052b\5\u00c4c\2\u052b\u052c\7j\2\2\u052c"+
		"\u0536\3\2\2\2\u052d\u052e\7\4\2\2\u052e\u052f\5\u00c4c\2\u052f\u0530"+
		"\7\5\2\2\u0530\u0536\3\2\2\2\u0531\u0532\7\32\2\2\u0532\u0533\5\u00c4"+
		"c\2\u0533\u0534\7\33\2\2\u0534\u0536\3\2\2\2\u0535\u0529\3\2\2\2\u0535"+
		"\u052d\3\2\2\2\u0535\u0531\3\2\2\2\u0536\u053a\3\2\2\2\u0537\u0539\5\u009a"+
		"N\2\u0538\u0537\3\2\2\2\u0539\u053c\3\2\2\2\u053a\u0538\3\2\2\2\u053a"+
		"\u053b\3\2\2\2\u053b\u053e\3\2\2\2\u053c\u053a\3\2\2\2\u053d\u0535\3\2"+
		"\2\2\u053e\u0541\3\2\2\2\u053f\u053d\3\2\2\2\u053f\u0540\3\2\2\2\u0540"+
		"\u00c5\3\2\2\2\u0541\u053f\3\2\2\2\u0542\u0544\5\u0092J\2\u0543\u0542"+
		"\3\2\2\2\u0544\u0547\3\2\2\2\u0545\u0543\3\2\2\2\u0545\u0546\3\2\2\2\u0546"+
		"\u0553\3\2\2\2\u0547\u0545\3\2\2\2\u0548\u0549\7\32\2\2\u0549\u054a\5"+
		"\u00c6d\2\u054a\u054e\7\33\2\2\u054b\u054d\5\u0092J\2\u054c\u054b\3\2"+
		"\2\2\u054d\u0550\3\2\2\2\u054e\u054c\3\2\2\2\u054e\u054f\3\2\2\2\u054f"+
		"\u0552\3\2\2\2\u0550\u054e\3\2\2\2\u0551\u0548\3\2\2\2\u0552\u0555\3\2"+
		"\2\2\u0553\u0551\3\2\2\2\u0553\u0554\3\2\2\2\u0554\u00c7\3\2\2\2\u0555"+
		"\u0553\3\2\2\2\u0556\u0557\5\u00caf\2\u0557\u00c9\3\2\2\2\u0558\u055a"+
		"\7E\2\2\u0559\u0558\3\2\2\2\u0559\u055a\3\2\2\2\u055a\u055c\3\2\2\2\u055b"+
		"\u055d\5\u0084C\2\u055c\u055b\3\2\2\2\u055c\u055d\3\2\2\2\u055d\u055e"+
		"\3\2\2\2\u055e\u0560\5\u00d4k\2\u055f\u0561\7r\2\2\u0560\u055f\3\2\2\2"+
		"\u0560\u0561\3\2\2\2\u0561\u0563\3\2\2\2\u0562\u0564\5\u00ceh\2\u0563"+
		"\u0562\3\2\2\2\u0563\u0564\3\2\2\2\u0564\u0582\3\2\2\2\u0565\u0567\7E"+
		"\2\2\u0566\u0565\3\2\2\2\u0566\u0567\3\2\2\2\u0567\u0569\3\2\2\2\u0568"+
		"\u056a\5\u0084C\2\u0569\u0568\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u056c"+
		"\3\2\2\2\u056b\u056d\7F\2\2\u056c\u056b\3\2\2\2\u056c\u056d\3\2\2\2\u056d"+
		"\u056e\3\2\2\2\u056e\u0570\5\u00dco\2\u056f\u0571\7r\2\2\u0570\u056f\3"+
		"\2\2\2\u0570\u0571\3\2\2\2\u0571\u0572\3\2\2\2\u0572\u0573\5\u00ceh\2"+
		"\u0573\u0582\3\2\2\2\u0574\u0576\7E\2\2\u0575\u0574\3\2\2\2\u0575\u0576"+
		"\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u0579\5\u00ccg\2\u0578\u057a\7r\2\2"+
		"\u0579\u0578\3\2\2\2\u0579\u057a\3\2\2\2\u057a\u057c\3\2\2\2\u057b\u057d"+
		"\5\u00ceh\2\u057c\u057b\3\2\2\2\u057c\u057d\3\2\2\2\u057d\u057f\3\2\2"+
		"\2\u057e\u0580\7\3\2\2\u057f\u057e\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u0582"+
		"\3\2\2\2\u0581\u0559\3\2\2\2\u0581\u0566\3\2\2\2\u0581\u0575\3\2\2\2\u0582"+
		"\u00cb\3\2\2\2\u0583\u0585\7T\2\2\u0584\u0586\5\u00eav\2\u0585\u0584\3"+
		"\2\2\2\u0585\u0586\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u0588\7i\2\2\u0588"+
		"\u058c\bg\1\2\u0589\u058a\7T\2\2\u058a\u058c\5\u00eav\2\u058b\u0583\3"+
		"\2\2\2\u058b\u0589\3\2\2\2\u058c\u00cd\3\2\2\2\u058d\u0595\5\u00ba^\2"+
		"\u058e\u0590\7\7\2\2\u058f\u0591\7r\2\2\u0590\u058f\3\2\2\2\u0590\u0591"+
		"\3\2\2\2\u0591\u0592\3\2\2\2\u0592\u0594\5\u00ba^\2\u0593\u058e\3\2\2"+
		"\2\u0594\u0597\3\2\2\2\u0595\u0593\3\2\2\2\u0595\u0596\3\2\2\2\u0596\u0598"+
		"\3\2\2\2\u0597\u0595\3\2\2\2\u0598\u0599\7\3\2\2\u0599\u00cf\3\2\2\2\u059a"+
		"\u05a2\5\66\34\2\u059b\u059c\7i\2\2\u059c\u059d\5\u00d2j\2\u059d\u059e"+
		"\7j\2\2\u059e\u05a2\3\2\2\2\u059f\u05a0\7i\2\2\u05a0\u05a2\7j\2\2\u05a1"+
		"\u059a\3\2\2\2\u05a1\u059b\3\2\2\2\u05a1\u059f\3\2\2\2\u05a2\u00d1\3\2"+
		"\2\2\u05a3\u05ab\5\u00d0i\2\u05a4\u05a6\7\7\2\2\u05a5\u05a7\7r\2\2\u05a6"+
		"\u05a5\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7\u05a8\3\2\2\2\u05a8\u05aa\5\u00d0"+
		"i\2\u05a9\u05a4\3\2\2\2\u05aa\u05ad\3\2\2\2\u05ab\u05a9\3\2\2\2\u05ab"+
		"\u05ac\3\2\2\2\u05ac\u00d3\3\2\2\2\u05ad\u05ab\3\2\2\2\u05ae\u05b0\7g"+
		"\2\2\u05af\u05b1\5\u00d6l\2\u05b0\u05af\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1"+
		"\u05b3\3\2\2\2\u05b2\u05b4\5\u00d8m\2\u05b3\u05b2\3\2\2\2\u05b3\u05b4"+
		"\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5\u05b6\7i\2\2\u05b6\u05b7\bk\1\2\u05b7"+
		"\u00d5\3\2\2\2\u05b8\u05b9\5\u00eav\2\u05b9\u00d7\3\2\2\2\u05ba\u05bb"+
		"\7\16\2\2\u05bb\u05c0\5\u00dan\2\u05bc\u05bd\7\7\2\2\u05bd\u05bf\5\u00da"+
		"n\2\u05be\u05bc\3\2\2\2\u05bf\u05c2\3\2\2\2\u05c0\u05be\3\2\2\2\u05c0"+
		"\u05c1\3\2\2\2\u05c1\u00d9\3\2\2\2\u05c2\u05c0\3\2\2\2\u05c3\u05c5\7L"+
		"\2\2\u05c4\u05c3\3\2\2\2\u05c4\u05c5\3\2\2\2\u05c5\u05c7\3\2\2\2\u05c6"+
		"\u05c8\5|?\2\u05c7\u05c6\3\2\2\2\u05c7\u05c8\3\2\2\2\u05c8\u05c9\3\2\2"+
		"\2\u05c9\u05ca\5\u00eav\2\u05ca\u00db\3\2\2\2\u05cb\u05cd\7K\2\2\u05cc"+
		"\u05cb\3\2\2\2\u05cd\u05d0\3\2\2\2\u05ce\u05cc\3\2\2\2\u05ce\u05cf\3\2"+
		"\2\2\u05cf\u05d2\3\2\2\2\u05d0\u05ce\3\2\2\2\u05d1\u05d3\t\31\2\2\u05d2"+
		"\u05d1\3\2\2\2\u05d2\u05d3\3\2\2\2\u05d3\u05d4\3\2\2\2\u05d4\u05d9\5\u00de"+
		"p\2\u05d5\u05d6\7\b\2\2\u05d6\u05d7\5\u0086D\2\u05d7\u05d8\7\t\2\2\u05d8"+
		"\u05da\3\2\2\2\u05d9\u05d5\3\2\2\2\u05d9\u05da\3\2\2\2\u05da\u05e5\3\2"+
		"\2\2\u05db\u05dc\7\31\2\2\u05dc\u05e1\5\u00dep\2\u05dd\u05de\7\b\2\2\u05de"+
		"\u05df\5\u0086D\2\u05df\u05e0\7\t\2\2\u05e0\u05e2\3\2\2\2\u05e1\u05dd"+
		"\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2\u05e4\3\2\2\2\u05e3\u05db\3\2\2\2\u05e4"+
		"\u05e7\3\2\2\2\u05e5\u05e3\3\2\2\2\u05e5\u05e6\3\2\2\2\u05e6\u05e9\3\2"+
		"\2\2\u05e7\u05e5\3\2\2\2\u05e8\u05ea\7K\2\2\u05e9\u05e8\3\2\2\2\u05e9"+
		"\u05ea\3\2\2\2\u05ea\u05f0\3\2\2\2\u05eb\u05f0\7H\2\2\u05ec\u05f0\7I\2"+
		"\2\u05ed\u05f0\7T\2\2\u05ee\u05f0\5f\64\2\u05ef\u05ce\3\2\2\2\u05ef\u05eb"+
		"\3\2\2\2\u05ef\u05ec\3\2\2\2\u05ef\u05ed\3\2\2\2\u05ef\u05ee\3\2\2\2\u05f0"+
		"\u00dd\3\2\2\2\u05f1\u05f3\t\32\2\2\u05f2\u05f1\3\2\2\2\u05f3\u05f4\3"+
		"\2\2\2\u05f4\u05f2\3\2\2\2\u05f4\u05f5\3\2\2\2\u05f5\u00df\3\2\2\2\u05f6"+
		"\u05f8\t\33\2\2\u05f7\u05f6\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8\u05f9\3"+
		"\2\2\2\u05f9\u05fa\5\u00dco\2\u05fa\u00e1\3\2\2\2\u05fb\u05fc\5\u00ea"+
		"v\2\u05fc\u00e3\3\2\2\2\u05fd\u05ff\7\4\2\2\u05fe\u0600\7r\2\2\u05ff\u05fe"+
		"\3\2\2\2\u05ff\u0600\3\2\2\2\u0600\u0601\3\2\2\2\u0601\u0602\7G\2\2\u0602"+
		"\u0619\7\5\2\2\u0603\u0605\7\4\2\2\u0604\u0606\7r\2\2\u0605\u0604\3\2"+
		"\2\2\u0605\u0606\3\2\2\2\u0606\u0615\3\2\2\2\u0607\u0609\5\u00e6t\2\u0608"+
		"\u060a\7r\2\2\u0609\u0608\3\2\2\2\u0609\u060a\3\2\2\2\u060a\u0612\3\2"+
		"\2\2\u060b\u060d\7\7\2\2\u060c\u060e\7r\2\2\u060d\u060c\3\2\2\2\u060d"+
		"\u060e\3\2\2\2\u060e\u060f\3\2\2\2\u060f\u0611\5\u00e6t\2\u0610\u060b"+
		"\3\2\2\2\u0611\u0614\3\2\2\2\u0612\u0610\3\2\2\2\u0612\u0613\3\2\2\2\u0613"+
		"\u0616\3\2\2\2\u0614\u0612\3\2\2\2\u0615\u0607\3\2\2\2\u0615\u0616\3\2"+
		"\2\2\u0616\u0617\3\2\2\2\u0617\u0619\7\5\2\2\u0618\u05fd\3\2\2\2\u0618"+
		"\u0603\3\2\2\2\u0619\u00e5\3\2\2\2\u061a\u061b\5\u00e0q\2\u061b\u061c"+
		"\5\u00e8u\2\u061c\u00e7\3\2\2\2\u061d\u061f\5\u00eex\2\u061e\u061d\3\2"+
		"\2\2\u061e\u061f\3\2\2\2\u061f\u062d\3\2\2\2\u0620\u0622\7\4\2\2\u0621"+
		"\u0623\7r\2\2\u0622\u0621\3\2\2\2\u0622\u0623\3\2\2\2\u0623\u0624\3\2"+
		"\2\2\u0624\u0626\5\u00e8u\2\u0625\u0627\7r\2\2\u0626\u0625\3\2\2\2\u0626"+
		"\u0627\3\2\2\2\u0627\u0628\3\2\2\2\u0628\u0629\7\5\2\2\u0629\u062e\3\2"+
		"\2\2\u062a\u062c\5\u00e2r\2\u062b\u062a\3\2\2\2\u062b\u062c\3\2\2\2\u062c"+
		"\u062e\3\2\2\2\u062d\u0620\3\2\2\2\u062d\u062b\3\2\2\2\u062e\u0630\3\2"+
		"\2\2\u062f\u0631\5\u00c0a\2\u0630\u062f\3\2\2\2\u0630\u0631\3\2\2\2\u0631"+
		"\u00e9\3\2\2\2\u0632\u0637\7h\2\2\u0633\u0634\7\31\2\2\u0634\u0636\7h"+
		"\2\2\u0635\u0633\3\2\2\2\u0636\u0639\3\2\2\2\u0637\u0635\3\2\2\2\u0637"+
		"\u0638\3\2\2\2\u0638\u063c\3\2\2\2\u0639\u0637\3\2\2\2\u063a\u063c\5|"+
		"?\2\u063b\u0632\3\2\2\2\u063b\u063a\3\2\2\2\u063c\u00eb\3\2\2\2\u063d"+
		"\u063e\t\34\2\2\u063e\u00ed\3\2\2\2\u063f\u0641\5z>\2\u0640\u0642\79\2"+
		"\2\u0641\u0640\3\2\2\2\u0641\u0642\3\2\2\2\u0642\u0644\3\2\2\2\u0643\u063f"+
		"\3\2\2\2\u0644\u0645\3\2\2\2\u0645\u0643\3\2\2\2\u0645\u0646\3\2\2\2\u0646"+
		"\u00ef\3\2\2\2\u0647\u0648\5\u00eex\2\u0648\u00f1\3\2\2\2\u00d9\u00f8"+
		"\u00fa\u0104\u010a\u011d\u0125\u012c\u0131\u013b\u014a\u0153\u0158\u015c"+
		"\u0164\u0168\u0170\u0178\u0184\u0186\u0196\u019a\u01a1\u01a7\u01ab\u01b0"+
		"\u01b7\u01bd\u01c4\u01c8\u01ce\u01d5\u01dc\u01e1\u01e8\u01ef\u01f6\u01fd"+
		"\u0202\u0208\u020f\u0213\u0219\u0220\u0224\u022a\u0231\u0235\u023b\u0242"+
		"\u0246\u024c\u0253\u0257\u025d\u0264\u0269\u026f\u0276\u027b\u0281\u0288"+
		"\u028c\u0292\u0299\u029d\u02a3\u02aa\u02ae\u02b6\u02bc\u02c2\u02ca\u02cd"+
		"\u02d3\u02da\u02df\u02e4\u02ea\u02f1\u02f6\u02fa\u0300\u0309\u0314\u0319"+
		"\u0321\u032c\u0330\u0336\u033c\u0346\u034c\u0350\u0354\u035a\u0365\u0371"+
		"\u0375\u037d\u0381\u0388\u038c\u038e\u0393\u0398\u039f\u03a5\u03ab\u03af"+
		"\u03b2\u03b8\u03c1\u03d6\u0400\u0414\u0416\u042f\u0434\u0438\u043d\u0444"+
		"\u0449\u0450\u0456\u045e\u0462\u0466\u046c\u0470\u0477\u047d\u0484\u0488"+
		"\u048e\u0491\u0498\u049b\u04a6\u04ad\u04b3\u04be\u04c8\u04d1\u04d6\u04dc"+
		"\u04e1\u04e4\u04e8\u04eb\u04ef\u04f6\u04fb\u0502\u0507\u0516\u051b\u0520"+
		"\u0526\u0535\u053a\u053f\u0545\u054e\u0553\u0559\u055c\u0560\u0563\u0566"+
		"\u0569\u056c\u0570\u0575\u0579\u057c\u057f\u0581\u0585\u058b\u0590\u0595"+
		"\u05a1\u05a6\u05ab\u05b0\u05b3\u05c0\u05c4\u05c7\u05ce\u05d2\u05d9\u05e1"+
		"\u05e5\u05e9\u05ef\u05f4\u05f7\u05ff\u0605\u0609\u060d\u0612\u0615\u0618"+
		"\u061e\u0622\u0626\u062b\u062d\u0630\u0637\u063b\u0641\u0645";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}