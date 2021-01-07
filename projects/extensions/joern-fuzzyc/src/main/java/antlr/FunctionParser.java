// Generated from ..\java\antlr\Function.g4 by ANTLR 4.5.3

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
public class FunctionParser extends Parser {
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
		RULE_statements = 0, RULE_statement = 1, RULE_opening_curly = 2, RULE_closing_curly = 3, 
		RULE_block_starter = 4, RULE_selection_or_iteration = 5, RULE_for_init_statement = 6, 
		RULE_jump_statement = 7, RULE_label = 8, RULE_expr_statement = 9, RULE_condition = 10, 
		RULE_pre_statement = 11, RULE_pre_blockstarter = 12, RULE_pre_if_statement = 13, 
		RULE_pre_elif_statement = 14, RULE_pre_else_statement = 15, RULE_pre_endif_statement = 16, 
		RULE_pre_if_condition = 17, RULE_pre_command = 18, RULE_pre_define = 19, 
		RULE_pre_undef = 20, RULE_pre_macro_identifier = 21, RULE_keyword = 22, 
		RULE_pre_macro_parameters = 23, RULE_pre_macro = 24, RULE_macroCall = 25, 
		RULE_pre_diagnostic = 26, RULE_pre_other = 27, RULE_attributeList = 28, 
		RULE_attribute = 29, RULE_pre_include = 30, RULE_pre_include_next = 31, 
		RULE_pre_include_local_file = 32, RULE_pre_include_filename = 33, RULE_pre_line = 34, 
		RULE_pre_pragma = 35, RULE_comment = 36, RULE_newline = 37, RULE_unary_operator = 38, 
		RULE_relational_operator = 39, RULE_constant = 40, RULE_function_decl_specifiers = 41, 
		RULE_ptr_operator = 42, RULE_access_specifier = 43, RULE_operator = 44, 
		RULE_assignment_operator = 45, RULE_equality_operator = 46, RULE_template_decl_start = 47, 
		RULE_template_param_list = 48, RULE_no_brackets = 49, RULE_no_brackets_curlies_or_squares = 50, 
		RULE_no_brackets_or_semicolon = 51, RULE_no_angle_brackets_or_brackets = 52, 
		RULE_no_curlies = 53, RULE_no_squares = 54, RULE_no_squares_or_semicolon = 55, 
		RULE_no_comma_or_semicolon = 56, RULE_assign_water = 57, RULE_assign_water_l2 = 58, 
		RULE_water = 59, RULE_custom = 60, RULE_asciiTab = 61, RULE_externC = 62, 
		RULE_macroFunctionPointer = 63, RULE_testStart = 64, RULE_testEnd = 65, 
		RULE_function_def = 66, RULE_return_type = 67, RULE_function_param_list = 68, 
		RULE_parameter_decl_clause = 69, RULE_parameter_decl = 70, RULE_parameter_id = 71, 
		RULE_compound_statement = 72, RULE_ctor_list = 73, RULE_ctor_initializer = 74, 
		RULE_initializer_id = 75, RULE_ctor_expr = 76, RULE_function_name = 77, 
		RULE_exception_specification = 78, RULE_type_id_list = 79, RULE_simple_decl = 80, 
		RULE_var_decl = 81, RULE_callingConvention = 82, RULE_special_datatype = 83, 
		RULE_init_declarator_list = 84, RULE_class_def = 85, RULE_class_name = 86, 
		RULE_base_classes = 87, RULE_base_class = 88, RULE_type_name = 89, RULE_base_type = 90, 
		RULE_param_decl_specifiers = 91, RULE_parameter_name = 92, RULE_param_type_list = 93, 
		RULE_param_type = 94, RULE_param_type_id = 95, RULE_identifier = 96, RULE_number = 97, 
		RULE_ptrs = 98, RULE_func_ptrs = 99, RULE_expr = 100, RULE_assign_expr = 101, 
		RULE_conditional_expression = 102, RULE_or_expression = 103, RULE_and_expression = 104, 
		RULE_inclusive_or_expression = 105, RULE_exclusive_or_expression = 106, 
		RULE_bit_and_expression = 107, RULE_equality_expression = 108, RULE_relational_expression = 109, 
		RULE_shift_expression = 110, RULE_additive_expression = 111, RULE_multiplicative_expression = 112, 
		RULE_function_pointer_use_expression = 113, RULE_cast_expression = 114, 
		RULE_cast_target = 115, RULE_unary_expression = 116, RULE_address_of_expression = 117, 
		RULE_new_expression = 118, RULE_unary_op_and_cast_expr = 119, RULE_sizeof_expression = 120, 
		RULE_sizeof = 121, RULE_defined_expression = 122, RULE_sizeof_operand = 123, 
		RULE_sizeof_operand2 = 124, RULE_inc_dec = 125, RULE_postfix_expression = 126, 
		RULE_initializer_expression = 127, RULE_argument_list = 128, RULE_argument = 129, 
		RULE_primary_expression = 130, RULE_null_expression = 131, RULE_init_declarator = 132, 
		RULE_declarator = 133, RULE_type_suffix = 134;
	public static final String[] ruleNames = {
		"statements", "statement", "opening_curly", "closing_curly", "block_starter", 
		"selection_or_iteration", "for_init_statement", "jump_statement", "label", 
		"expr_statement", "condition", "pre_statement", "pre_blockstarter", "pre_if_statement", 
		"pre_elif_statement", "pre_else_statement", "pre_endif_statement", "pre_if_condition", 
		"pre_command", "pre_define", "pre_undef", "pre_macro_identifier", "keyword", 
		"pre_macro_parameters", "pre_macro", "macroCall", "pre_diagnostic", "pre_other", 
		"attributeList", "attribute", "pre_include", "pre_include_next", "pre_include_local_file", 
		"pre_include_filename", "pre_line", "pre_pragma", "comment", "newline", 
		"unary_operator", "relational_operator", "constant", "function_decl_specifiers", 
		"ptr_operator", "access_specifier", "operator", "assignment_operator", 
		"equality_operator", "template_decl_start", "template_param_list", "no_brackets", 
		"no_brackets_curlies_or_squares", "no_brackets_or_semicolon", "no_angle_brackets_or_brackets", 
		"no_curlies", "no_squares", "no_squares_or_semicolon", "no_comma_or_semicolon", 
		"assign_water", "assign_water_l2", "water", "custom", "asciiTab", "externC", 
		"macroFunctionPointer", "testStart", "testEnd", "function_def", "return_type", 
		"function_param_list", "parameter_decl_clause", "parameter_decl", "parameter_id", 
		"compound_statement", "ctor_list", "ctor_initializer", "initializer_id", 
		"ctor_expr", "function_name", "exception_specification", "type_id_list", 
		"simple_decl", "var_decl", "callingConvention", "special_datatype", "init_declarator_list", 
		"class_def", "class_name", "base_classes", "base_class", "type_name", 
		"base_type", "param_decl_specifiers", "parameter_name", "param_type_list", 
		"param_type", "param_type_id", "identifier", "number", "ptrs", "func_ptrs", 
		"expr", "assign_expr", "conditional_expression", "or_expression", "and_expression", 
		"inclusive_or_expression", "exclusive_or_expression", "bit_and_expression", 
		"equality_expression", "relational_expression", "shift_expression", "additive_expression", 
		"multiplicative_expression", "function_pointer_use_expression", "cast_expression", 
		"cast_target", "unary_expression", "address_of_expression", "new_expression", 
		"unary_op_and_cast_expr", "sizeof_expression", "sizeof", "defined_expression", 
		"sizeof_operand", "sizeof_operand2", "inc_dec", "postfix_expression", 
		"initializer_expression", "argument_list", "argument", "primary_expression", 
		"null_expression", "init_declarator", "declarator", "type_suffix"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "';'", "':'", "'START_TEST'", "'inline'", "'explicit'", 
		"'friend'", "'public'", "'private'", "'protected'", "'long'", "','", "'_GL_ATTRIBUTE_PURE'", 
		"'_GL_INLINE_HEADER_BEGIN'", "'_GL_INLINE_HEADER_END'", "'_GL_ATTRIBUTE_FORMAT_PRINTF_STANDARD'", 
		"'&'", "'*'", "'+'", "'-'", "'~'", "'!'", "'<'", "'>'", "'<='", "'>='", 
		"'delete'", "'['", "']'", "'/'", "'%'", "'^'", "'|'", "'='", "'+='", "'-='", 
		"'*='", "'/='", "'%='", "'^='", "'&='", "'|='", "'>>'", "'<<'", "'>>='", 
		"'<<='", "'=='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'->*'", "'->'", 
		"'\"C\"'", "'::'", "'char'", "'int'", "'restrict'", "'?'", "'sizeof'", 
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
	public String getGrammarFileName() { return "Function.g4"; }

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


	public FunctionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (WHITESPACE - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(270);
				statement();
				}
				}
				setState(275);
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

	public static class StatementContext extends ParserRuleContext {
		public Opening_curlyContext opening_curly() {
			return getRuleContext(Opening_curlyContext.class,0);
		}
		public Closing_curlyContext closing_curly() {
			return getRuleContext(Closing_curlyContext.class,0);
		}
		public Block_starterContext block_starter() {
			return getRuleContext(Block_starterContext.class,0);
		}
		public Jump_statementContext jump_statement() {
			return getRuleContext(Jump_statementContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public Simple_declContext simple_decl() {
			return getRuleContext(Simple_declContext.class,0);
		}
		public Expr_statementContext expr_statement() {
			return getRuleContext(Expr_statementContext.class,0);
		}
		public Pre_statementContext pre_statement() {
			return getRuleContext(Pre_statementContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public CustomContext custom() {
			return getRuleContext(CustomContext.class,0);
		}
		public WaterContext water() {
			return getRuleContext(WaterContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				opening_curly();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				closing_curly();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				block_starter();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(279);
				jump_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(280);
				label();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(281);
				simple_decl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(282);
				expr_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(283);
				pre_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(284);
				comment();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(285);
				newline();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(286);
				custom();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(287);
				water();
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

	public static class Opening_curlyContext extends ParserRuleContext {
		public TerminalNode OPENING_CURLY() { return getToken(FunctionParser.OPENING_CURLY, 0); }
		public Opening_curlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opening_curly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterOpening_curly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitOpening_curly(this);
		}
	}

	public final Opening_curlyContext opening_curly() throws RecognitionException {
		Opening_curlyContext _localctx = new Opening_curlyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_opening_curly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(OPENING_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Closing_curlyContext extends ParserRuleContext {
		public TerminalNode CLOSING_CURLY() { return getToken(FunctionParser.CLOSING_CURLY, 0); }
		public Closing_curlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closing_curly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterClosing_curly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitClosing_curly(this);
		}
	}

	public final Closing_curlyContext closing_curly() throws RecognitionException {
		Closing_curlyContext _localctx = new Closing_curlyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_closing_curly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
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

	public static class Block_starterContext extends ParserRuleContext {
		public Selection_or_iterationContext selection_or_iteration() {
			return getRuleContext(Selection_or_iterationContext.class,0);
		}
		public Block_starterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_starter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterBlock_starter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitBlock_starter(this);
		}
	}

	public final Block_starterContext block_starter() throws RecognitionException {
		Block_starterContext _localctx = new Block_starterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block_starter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			selection_or_iteration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Selection_or_iterationContext extends ParserRuleContext {
		public Selection_or_iterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_or_iteration; }
	 
		public Selection_or_iterationContext() { }
		public void copyFrom(Selection_or_iterationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Try_statementContext extends Selection_or_iterationContext {
		public TerminalNode TRY() { return getToken(FunctionParser.TRY, 0); }
		public Try_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterTry_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitTry_statement(this);
		}
	}
	public static class If_statementContext extends Selection_or_iterationContext {
		public TerminalNode IF() { return getToken(FunctionParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public If_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitIf_statement(this);
		}
	}
	public static class Catch_statementContext extends Selection_or_iterationContext {
		public TerminalNode CATCH() { return getToken(FunctionParser.CATCH, 0); }
		public Param_typeContext param_type() {
			return getRuleContext(Param_typeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(FunctionParser.ELLIPSIS, 0); }
		public Catch_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterCatch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitCatch_statement(this);
		}
	}
	public static class For_statementContext extends Selection_or_iterationContext {
		public TerminalNode FOR() { return getToken(FunctionParser.FOR, 0); }
		public For_init_statementContext for_init_statement() {
			return getRuleContext(For_init_statementContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public For_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFor_statement(this);
		}
	}
	public static class Else_statementContext extends Selection_or_iterationContext {
		public TerminalNode ELSE() { return getToken(FunctionParser.ELSE, 0); }
		public Else_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitElse_statement(this);
		}
	}
	public static class Switch_statementContext extends Selection_or_iterationContext {
		public TerminalNode SWITCH() { return getToken(FunctionParser.SWITCH, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Switch_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterSwitch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitSwitch_statement(this);
		}
	}
	public static class Do_statementContext extends Selection_or_iterationContext {
		public TerminalNode DO() { return getToken(FunctionParser.DO, 0); }
		public Do_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterDo_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitDo_statement(this);
		}
	}
	public static class While_statementContext extends Selection_or_iterationContext {
		public TerminalNode WHILE() { return getToken(FunctionParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public While_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitWhile_statement(this);
		}
	}

	public final Selection_or_iterationContext selection_or_iteration() throws RecognitionException {
		Selection_or_iterationContext _localctx = new Selection_or_iterationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selection_or_iteration);
		int _la;
		try {
			setState(346);
			switch (_input.LA(1)) {
			case TRY:
				_localctx = new Try_statementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(TRY);
				}
				break;
			case CATCH:
				_localctx = new Catch_statementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(CATCH);
				setState(298);
				match(T__0);
				setState(301);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(299);
					param_type();
					}
					break;
				case 2:
					{
					setState(300);
					match(ELLIPSIS);
					}
					break;
				}
				setState(303);
				match(T__1);
				}
				break;
			case IF:
				_localctx = new If_statementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				match(IF);
				setState(305);
				match(T__0);
				setState(306);
				condition();
				setState(307);
				match(T__1);
				}
				break;
			case ELSE:
				_localctx = new Else_statementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(309);
				match(ELSE);
				}
				break;
			case SWITCH:
				_localctx = new Switch_statementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(310);
				match(SWITCH);
				setState(311);
				match(T__0);
				setState(312);
				condition();
				setState(313);
				match(T__1);
				}
				break;
			case FOR:
				_localctx = new For_statementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(315);
				match(FOR);
				setState(316);
				match(T__0);
				setState(319);
				switch (_input.LA(1)) {
				case T__0:
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
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__51:
				case T__52:
				case T__56:
				case T__57:
				case T__58:
				case T__61:
				case T__62:
				case T__63:
				case TYPEDEF:
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
				case PRE_PRAGMA_KEYWORDS:
				case END_TEST:
				case ALPHA_NUMERIC:
				case OPENING_CURLY:
				case HEX_LITERAL:
				case DECIMAL_LITERAL:
				case OCTAL_LITERAL:
				case FLOATING_POINT_LITERAL:
				case CHAR:
				case STRING:
					{
					setState(317);
					for_init_statement();
					}
					break;
				case T__2:
					{
					setState(318);
					match(T__2);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(322);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(321);
					match(NEWLINE);
					}
				}

				setState(325);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__51) | (1L << T__52) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)))) != 0)) {
					{
					setState(324);
					condition();
					}
				}

				setState(327);
				match(T__2);
				setState(329);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(328);
					match(NEWLINE);
					}
				}

				setState(332);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__51) | (1L << T__52) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)))) != 0)) {
					{
					setState(331);
					expr();
					}
				}

				setState(334);
				match(T__1);
				setState(336);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(335);
					match(T__2);
					}
					break;
				}
				}
				break;
			case DO:
				_localctx = new Do_statementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(338);
				match(DO);
				}
				break;
			case WHILE:
				_localctx = new While_statementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(339);
				match(WHILE);
				setState(340);
				match(T__0);
				setState(341);
				condition();
				setState(342);
				match(T__1);
				setState(344);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(343);
					match(T__2);
					}
					break;
				}
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

	public static class For_init_statementContext extends ParserRuleContext {
		public Simple_declContext simple_decl() {
			return getRuleContext(Simple_declContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public For_init_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_init_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFor_init_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFor_init_statement(this);
		}
	}

	public final For_init_statementContext for_init_statement() throws RecognitionException {
		For_init_statementContext _localctx = new For_init_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_for_init_statement);
		try {
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				simple_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				expr();
				setState(350);
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

	public static class Jump_statementContext extends ParserRuleContext {
		public Jump_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_statement; }
	 
		public Jump_statementContext() { }
		public void copyFrom(Jump_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ThrowStatementContext extends Jump_statementContext {
		public TerminalNode THROW() { return getToken(FunctionParser.THROW, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ThrowStatementContext(Jump_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitThrowStatement(this);
		}
	}
	public static class BreakStatementContext extends Jump_statementContext {
		public TerminalNode BREAK() { return getToken(FunctionParser.BREAK, 0); }
		public BreakStatementContext(Jump_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitBreakStatement(this);
		}
	}
	public static class ContinueStatementContext extends Jump_statementContext {
		public TerminalNode CONTINUE() { return getToken(FunctionParser.CONTINUE, 0); }
		public ContinueStatementContext(Jump_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitContinueStatement(this);
		}
	}
	public static class ReturnStatementContext extends Jump_statementContext {
		public TerminalNode RETURN() { return getToken(FunctionParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatementContext(Jump_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitReturnStatement(this);
		}
	}
	public static class GotoStatementContext extends Jump_statementContext {
		public TerminalNode GOTO() { return getToken(FunctionParser.GOTO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GotoStatementContext(Jump_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterGotoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitGotoStatement(this);
		}
	}

	public final Jump_statementContext jump_statement() throws RecognitionException {
		Jump_statementContext _localctx = new Jump_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_jump_statement);
		int _la;
		try {
			setState(372);
			switch (_input.LA(1)) {
			case BREAK:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				match(BREAK);
				setState(355);
				match(T__2);
				}
				break;
			case CONTINUE:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				match(CONTINUE);
				setState(357);
				match(T__2);
				}
				break;
			case GOTO:
				_localctx = new GotoStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(358);
				match(GOTO);
				setState(359);
				identifier();
				setState(360);
				match(T__2);
				}
				break;
			case RETURN:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(362);
				match(RETURN);
				setState(364);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__51) | (1L << T__52) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)))) != 0)) {
					{
					setState(363);
					expr();
					}
				}

				setState(366);
				match(T__2);
				}
				break;
			case THROW:
				_localctx = new ThrowStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(367);
				match(THROW);
				setState(369);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__51) | (1L << T__52) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)))) != 0)) {
					{
					setState(368);
					expr();
					}
				}

				setState(371);
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

	public static class LabelContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(FunctionParser.CHAR, 0); }
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public TerminalNode CASE() { return getToken(FunctionParser.CASE, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_label);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			_la = _input.LA(1);
			if (_la==CASE) {
				{
				setState(374);
				match(CASE);
				}
			}

			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(377);
				identifier();
				}
				break;
			case 2:
				{
				setState(378);
				number();
				}
				break;
			case 3:
				{
				setState(379);
				match(CHAR);
				}
				break;
			case 4:
				{
				setState(380);
				cast_expression();
				}
				break;
			}
			setState(383);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_statementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Null_expressionContext null_expression() {
			return getRuleContext(Null_expressionContext.class,0);
		}
		public Expr_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterExpr_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitExpr_statement(this);
		}
	}

	public final Expr_statementContext expr_statement() throws RecognitionException {
		Expr_statementContext _localctx = new Expr_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr_statement);
		try {
			setState(389);
			switch (_input.LA(1)) {
			case T__0:
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
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__51:
			case T__52:
			case T__56:
			case T__57:
			case T__58:
			case T__61:
			case T__62:
			case T__63:
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
			case OPENING_CURLY:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				expr();
				setState(386);
				match(T__2);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				null_expression();
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

	public static class ConditionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			expr();
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_statement(this);
		}
	}

	public final Pre_statementContext pre_statement() throws RecognitionException {
		Pre_statementContext _localctx = new Pre_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_pre_statement);
		try {
			setState(395);
			switch (_input.LA(1)) {
			case PRE_IF:
			case PRE_ELIF:
			case PRE_ELSE:
			case PRE_ENDIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
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
				setState(394);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_blockstarter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_blockstarter(this);
		}
	}

	public final Pre_blockstarterContext pre_blockstarter() throws RecognitionException {
		Pre_blockstarterContext _localctx = new Pre_blockstarterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pre_blockstarter);
		try {
			setState(401);
			switch (_input.LA(1)) {
			case PRE_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				pre_if_statement();
				}
				break;
			case PRE_ELIF:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				pre_elif_statement();
				}
				break;
			case PRE_ELSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(399);
				pre_else_statement();
				}
				break;
			case PRE_ENDIF:
				enterOuterAlt(_localctx, 4);
				{
				setState(400);
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
		public TerminalNode PRE_IF() { return getToken(FunctionParser.PRE_IF, 0); }
		public Pre_if_conditionContext pre_if_condition() {
			return getRuleContext(Pre_if_conditionContext.class,0);
		}
		public Pre_if_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_if_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_if_statement(this);
		}
	}

	public final Pre_if_statementContext pre_if_statement() throws RecognitionException {
		Pre_if_statementContext _localctx = new Pre_if_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pre_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(PRE_IF);
			setState(404);
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
		public TerminalNode PRE_ELIF() { return getToken(FunctionParser.PRE_ELIF, 0); }
		public Pre_if_conditionContext pre_if_condition() {
			return getRuleContext(Pre_if_conditionContext.class,0);
		}
		public Pre_elif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_elif_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_elif_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_elif_statement(this);
		}
	}

	public final Pre_elif_statementContext pre_elif_statement() throws RecognitionException {
		Pre_elif_statementContext _localctx = new Pre_elif_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pre_elif_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(PRE_ELIF);
			setState(408);
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
		public TerminalNode PRE_ELSE() { return getToken(FunctionParser.PRE_ELSE, 0); }
		public Pre_else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_else_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_else_statement(this);
		}
	}

	public final Pre_else_statementContext pre_else_statement() throws RecognitionException {
		Pre_else_statementContext _localctx = new Pre_else_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_pre_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
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
		public TerminalNode PRE_ENDIF() { return getToken(FunctionParser.PRE_ENDIF, 0); }
		public Pre_endif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_endif_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_endif_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_endif_statement(this);
		}
	}

	public final Pre_endif_statementContext pre_endif_statement() throws RecognitionException {
		Pre_endif_statementContext _localctx = new Pre_endif_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_pre_endif_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_if_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_if_condition(this);
		}
	}

	public final Pre_if_conditionContext pre_if_condition() throws RecognitionException {
		Pre_if_conditionContext _localctx = new Pre_if_conditionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pre_if_condition);
		try {
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				match(T__0);
				setState(417);
				condition();
				setState(418);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(420);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_command(this);
		}
	}

	public final Pre_commandContext pre_command() throws RecognitionException {
		Pre_commandContext _localctx = new Pre_commandContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_pre_command);
		try {
			setState(432);
			switch (_input.LA(1)) {
			case PRE_DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				pre_define();
				}
				break;
			case PRE_UNDEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				pre_undef();
				}
				break;
			case PRE_DIAGNOSTIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(425);
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
				setState(426);
				pre_other();
				}
				break;
			case PRE_INCLUDE:
				enterOuterAlt(_localctx, 5);
				{
				setState(427);
				pre_include();
				}
				break;
			case PRE_INCLUDE_NEXT:
				enterOuterAlt(_localctx, 6);
				{
				setState(428);
				pre_include_next();
				}
				break;
			case PRE_LINE:
				enterOuterAlt(_localctx, 7);
				{
				setState(429);
				pre_line();
				}
				break;
			case PRE_PRAGMA:
				enterOuterAlt(_localctx, 8);
				{
				setState(430);
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
				setState(431);
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
		public TerminalNode PRE_DEFINE() { return getToken(FunctionParser.PRE_DEFINE, 0); }
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_define(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_define(this);
		}
	}

	public final Pre_defineContext pre_define() throws RecognitionException {
		Pre_defineContext _localctx = new Pre_defineContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_pre_define);
		try {
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				match(PRE_DEFINE);
				setState(435);
				pre_macro_identifier();
				setState(436);
				pre_macro();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				match(PRE_DEFINE);
				setState(439);
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
		public TerminalNode PRE_UNDEF() { return getToken(FunctionParser.PRE_UNDEF, 0); }
		public Pre_macro_identifierContext pre_macro_identifier() {
			return getRuleContext(Pre_macro_identifierContext.class,0);
		}
		public Pre_undefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_undef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_undef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_undef(this);
		}
	}

	public final Pre_undefContext pre_undef() throws RecognitionException {
		Pre_undefContext _localctx = new Pre_undefContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_pre_undef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(PRE_UNDEF);
			setState(443);
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
		public TerminalNode END_TEST() { return getToken(FunctionParser.END_TEST, 0); }
		public Pre_macro_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_macro_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_macro_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_macro_identifier(this);
		}
	}

	public final Pre_macro_identifierContext pre_macro_identifier() throws RecognitionException {
		Pre_macro_identifierContext _localctx = new Pre_macro_identifierContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_pre_macro_identifier);
		try {
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				identifier();
				setState(450);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(446);
					match(T__0);
					setState(447);
					pre_macro_parameters();
					setState(448);
					match(T__1);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				keyword();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
				match(END_TEST);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(454);
				match(T__4);
				setState(459);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(455);
					match(T__0);
					setState(456);
					pre_macro_parameters();
					setState(457);
					match(T__1);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitKeyword(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (STATIC - 80)) | (1L << (UNSIGNED - 80)) | (1L << (SIGNED - 80)) | (1L << (VIRTUAL - 80)) | (1L << (OPERATOR - 80)) | (1L << (CLASS_KEY - 80)))) != 0)) ) {
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
		public List<TerminalNode> ELLIPSIS() { return getTokens(FunctionParser.ELLIPSIS); }
		public TerminalNode ELLIPSIS(int i) {
			return getToken(FunctionParser.ELLIPSIS, i);
		}
		public Pre_macro_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_macro_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_macro_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_macro_parameters(this);
		}
	}

	public final Pre_macro_parametersContext pre_macro_parameters() throws RecognitionException {
		Pre_macro_parametersContext _localctx = new Pre_macro_parametersContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_pre_macro_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case NEW:
			case PRE_PRAGMA_KEYWORDS:
			case ALPHA_NUMERIC:
				{
				setState(465);
				identifier();
				}
				break;
			case ELLIPSIS:
				{
				setState(466);
				match(ELLIPSIS);
				}
				break;
			case T__1:
			case T__12:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(469);
				match(T__12);
				setState(472);
				switch (_input.LA(1)) {
				case T__8:
				case T__9:
				case T__10:
				case NEW:
				case PRE_PRAGMA_KEYWORDS:
				case ALPHA_NUMERIC:
					{
					setState(470);
					identifier();
					}
					break;
				case ELLIPSIS:
					{
					setState(471);
					match(ELLIPSIS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(478);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_macro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_macro(this);
		}
	}

	public final Pre_macroContext pre_macro() throws RecognitionException {
		Pre_macroContext _localctx = new Pre_macroContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_pre_macro);
		try {
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
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
		public TerminalNode VOID() { return getToken(FunctionParser.VOID, 0); }
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public MacroCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterMacroCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitMacroCall(this);
		}
	}

	public final MacroCallContext macroCall() throws RecognitionException {
		MacroCallContext _localctx = new MacroCallContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_macroCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			pre_macro_identifier();
			setState(484);
			match(T__0);
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				{
				setState(487);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(485);
					expr();
					}
					break;
				case 2:
					{
					setState(486);
					type_name();
					}
					break;
				}
				setState(490);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(489);
					match(NEWLINE);
					}
				}

				}
				setState(502);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(492);
						match(T__12);
						setState(494);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(493);
							match(NEWLINE);
							}
						}

						setState(498);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
						case 1:
							{
							setState(496);
							expr();
							}
							break;
						case 2:
							{
							setState(497);
							type_name();
							}
							break;
						}
						}
						} 
					}
					setState(504);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(506);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(505);
					match(T__12);
					}
				}

				}
				break;
			case 2:
				{
				setState(508);
				match(VOID);
				}
				break;
			}
			setState(511);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode PRE_DIAGNOSTIC() { return getToken(FunctionParser.PRE_DIAGNOSTIC, 0); }
		public TerminalNode STRING() { return getToken(FunctionParser.STRING, 0); }
		public Pre_diagnosticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_diagnostic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_diagnostic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_diagnostic(this);
		}
	}

	public final Pre_diagnosticContext pre_diagnostic() throws RecognitionException {
		Pre_diagnosticContext _localctx = new Pre_diagnosticContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_pre_diagnostic);
		try {
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				match(PRE_DIAGNOSTIC);
				setState(514);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
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
		public TerminalNode PRE_OTHER() { return getToken(FunctionParser.PRE_OTHER, 0); }
		public TerminalNode STRING() { return getToken(FunctionParser.STRING, 0); }
		public TerminalNode PRE_ATTRIBUTE() { return getToken(FunctionParser.PRE_ATTRIBUTE, 0); }
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public Pre_otherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_other; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_other(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_other(this);
		}
	}

	public final Pre_otherContext pre_other() throws RecognitionException {
		Pre_otherContext _localctx = new Pre_otherContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_pre_other);
		int _la;
		try {
			setState(539);
			switch (_input.LA(1)) {
			case PRE_OTHER:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				match(PRE_OTHER);
				setState(520);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(519);
					match(STRING);
					}
					break;
				}
				}
				break;
			case PRE_ATTRIBUTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(522);
				match(PRE_ATTRIBUTE);
				setState(523);
				match(T__0);
				setState(524);
				match(T__0);
				setState(526);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (STATIC - 80)) | (1L << (UNSIGNED - 80)) | (1L << (SIGNED - 80)) | (1L << (VIRTUAL - 80)) | (1L << (OPERATOR - 80)) | (1L << (CLASS_KEY - 80)) | (1L << (NEW - 80)) | (1L << (PRE_PRAGMA_KEYWORDS - 80)) | (1L << (END_TEST - 80)) | (1L << (ALPHA_NUMERIC - 80)) | (1L << (HEX_LITERAL - 80)) | (1L << (DECIMAL_LITERAL - 80)) | (1L << (OCTAL_LITERAL - 80)) | (1L << (FLOATING_POINT_LITERAL - 80)) | (1L << (CHAR - 80)) | (1L << (STRING - 80)))) != 0)) {
					{
					setState(525);
					attributeList();
					}
				}

				setState(528);
				match(T__1);
				setState(529);
				match(T__1);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(530);
				match(T__13);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(531);
				match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(532);
				match(T__15);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 6);
				{
				setState(533);
				match(T__16);
				setState(534);
				match(T__0);
				setState(536);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (STATIC - 80)) | (1L << (UNSIGNED - 80)) | (1L << (SIGNED - 80)) | (1L << (VIRTUAL - 80)) | (1L << (OPERATOR - 80)) | (1L << (CLASS_KEY - 80)) | (1L << (NEW - 80)) | (1L << (PRE_PRAGMA_KEYWORDS - 80)) | (1L << (END_TEST - 80)) | (1L << (ALPHA_NUMERIC - 80)) | (1L << (HEX_LITERAL - 80)) | (1L << (DECIMAL_LITERAL - 80)) | (1L << (OCTAL_LITERAL - 80)) | (1L << (FLOATING_POINT_LITERAL - 80)) | (1L << (CHAR - 80)) | (1L << (STRING - 80)))) != 0)) {
					{
					setState(535);
					attributeList();
					}
				}

				setState(538);
				match(T__1);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAttributeList(this);
		}
	}

	public final AttributeListContext attributeList() throws RecognitionException {
		AttributeListContext _localctx = new AttributeListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_attributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			attribute();
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(542);
				match(T__12);
				setState(543);
				attribute();
				}
				}
				setState(548);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_attribute);
		int _la;
		try {
			setState(577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				pre_macro_identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
				pre_macro_identifier();
				setState(551);
				match(T__0);
				setState(552);
				identifier();
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(553);
					match(T__12);
					setState(554);
					expr();
					}
					}
					setState(559);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(560);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(562);
				pre_macro_identifier();
				setState(563);
				match(T__0);
				setState(565);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__51) | (1L << T__52) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)))) != 0)) {
					{
					setState(564);
					expr();
					}
				}

				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(567);
					match(T__12);
					setState(568);
					expr();
					}
					}
					setState(573);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(574);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(576);
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
		public TerminalNode PRE_INCLUDE() { return getToken(FunctionParser.PRE_INCLUDE, 0); }
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_include(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_include(this);
		}
	}

	public final Pre_includeContext pre_include() throws RecognitionException {
		Pre_includeContext _localctx = new Pre_includeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_pre_include);
		try {
			setState(584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				match(PRE_INCLUDE);
				setState(580);
				pre_include_local_file();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(581);
				match(PRE_INCLUDE);
				setState(582);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(583);
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
		public TerminalNode PRE_INCLUDE_NEXT() { return getToken(FunctionParser.PRE_INCLUDE_NEXT, 0); }
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_include_next(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_include_next(this);
		}
	}

	public final Pre_include_nextContext pre_include_next() throws RecognitionException {
		Pre_include_nextContext _localctx = new Pre_include_nextContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_pre_include_next);
		try {
			setState(591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				match(PRE_INCLUDE_NEXT);
				setState(587);
				pre_include_local_file();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(588);
				match(PRE_INCLUDE_NEXT);
				setState(589);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(590);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_include_local_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_include_local_file(this);
		}
	}

	public final Pre_include_local_fileContext pre_include_local_file() throws RecognitionException {
		Pre_include_local_fileContext _localctx = new Pre_include_local_fileContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_pre_include_local_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
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
		public TerminalNode STRING() { return getToken(FunctionParser.STRING, 0); }
		public Pre_include_filenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_include_filename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_include_filename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_include_filename(this);
		}
	}

	public final Pre_include_filenameContext pre_include_filename() throws RecognitionException {
		Pre_include_filenameContext _localctx = new Pre_include_filenameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_pre_include_filename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
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
		public TerminalNode PRE_LINE() { return getToken(FunctionParser.PRE_LINE, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(FunctionParser.DECIMAL_LITERAL, 0); }
		public TerminalNode STRING() { return getToken(FunctionParser.STRING, 0); }
		public Pre_macro_identifierContext pre_macro_identifier() {
			return getRuleContext(Pre_macro_identifierContext.class,0);
		}
		public Pre_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_line(this);
		}
	}

	public final Pre_lineContext pre_line() throws RecognitionException {
		Pre_lineContext _localctx = new Pre_lineContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_pre_line);
		try {
			setState(611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				match(PRE_LINE);
				setState(598);
				match(DECIMAL_LITERAL);
				setState(599);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				match(PRE_LINE);
				setState(601);
				match(DECIMAL_LITERAL);
				setState(602);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(603);
				match(PRE_LINE);
				setState(604);
				pre_macro_identifier();
				setState(605);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(607);
				match(PRE_LINE);
				setState(608);
				pre_macro_identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(609);
				match(PRE_LINE);
				setState(610);
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
		public TerminalNode PRE_PRAGMA() { return getToken(FunctionParser.PRE_PRAGMA, 0); }
		public TerminalNode PRE_PRAGMA_KEYWORDS() { return getToken(FunctionParser.PRE_PRAGMA_KEYWORDS, 0); }
		public TerminalNode STRING() { return getToken(FunctionParser.STRING, 0); }
		public TerminalNode PRE_GCC() { return getToken(FunctionParser.PRE_GCC, 0); }
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_pragma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_pragma(this);
		}
	}

	public final Pre_pragmaContext pre_pragma() throws RecognitionException {
		Pre_pragmaContext _localctx = new Pre_pragmaContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_pre_pragma);
		int _la;
		try {
			int _alt;
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(613);
				match(PRE_PRAGMA);
				setState(615);
				_la = _input.LA(1);
				if (_la==PRE_GCC) {
					{
					setState(614);
					match(PRE_GCC);
					}
				}

				setState(617);
				match(PRE_PRAGMA_KEYWORDS);
				setState(618);
				match(STRING);
				 preProcFindMacroEnd(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(620);
				match(PRE_PRAGMA);
				setState(622);
				_la = _input.LA(1);
				if (_la==PRE_GCC) {
					{
					setState(621);
					match(PRE_GCC);
					}
				}

				setState(624);
				match(PRE_PRAGMA_KEYWORDS);
				setState(628);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(625);
						identifier();
						}
						} 
					}
					setState(630);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(631);
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
		public TerminalNode COMMENT() { return getToken(FunctionParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
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
		public TerminalNode NEWLINE() { return getToken(FunctionParser.NEWLINE, 0); }
		public NewlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNewline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNewline(this);
		}
	}

	public final NewlineContext newline() throws RecognitionException {
		NewlineContext _localctx = new NewlineContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_newline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitUnary_operator(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterRelational_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitRelational_operator(this);
		}
	}

	public final Relational_operatorContext relational_operator() throws RecognitionException {
		Relational_operatorContext _localctx = new Relational_operatorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_relational_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
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
		public TerminalNode HEX_LITERAL() { return getToken(FunctionParser.HEX_LITERAL, 0); }
		public TerminalNode OCTAL_LITERAL() { return getToken(FunctionParser.OCTAL_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(FunctionParser.DECIMAL_LITERAL, 0); }
		public List<TerminalNode> STRING() { return getTokens(FunctionParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(FunctionParser.STRING, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(FunctionParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(FunctionParser.COMMENT, i);
		}
		public TerminalNode CHAR() { return getToken(FunctionParser.CHAR, 0); }
		public TerminalNode FLOATING_POINT_LITERAL() { return getToken(FunctionParser.FLOATING_POINT_LITERAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_constant);
		try {
			int _alt;
			setState(671);
			switch (_input.LA(1)) {
			case HEX_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(643);
				match(HEX_LITERAL);
				}
				break;
			case OCTAL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(644);
				match(OCTAL_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(645);
				match(DECIMAL_LITERAL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(665); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(646);
						match(STRING);
						setState(650);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(647);
								match(NEWLINE);
								}
								} 
							}
							setState(652);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
						}
						setState(656);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(653);
								match(COMMENT);
								}
								} 
							}
							setState(658);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
						}
						setState(662);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(659);
								match(NEWLINE);
								}
								} 
							}
							setState(664);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(667); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(669);
				match(CHAR);
				}
				break;
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(670);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFunction_decl_specifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFunction_decl_specifiers(this);
		}
	}

	public final Function_decl_specifiersContext function_decl_specifiers() throws RecognitionException {
		Function_decl_specifiersContext _localctx = new Function_decl_specifiersContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_function_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPtr_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPtr_operator(this);
		}
	}

	public final Ptr_operatorContext ptr_operator() throws RecognitionException {
		Ptr_operatorContext _localctx = new Ptr_operatorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_ptr_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAccess_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAccess_specifier(this);
		}
	}

	public final Access_specifierContext access_specifier() throws RecognitionException {
		Access_specifierContext _localctx = new Access_specifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_access_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_operator);
		int _la;
		try {
			setState(724);
			switch (_input.LA(1)) {
			case T__27:
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(679);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==NEW) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(682);
				_la = _input.LA(1);
				if (_la==T__28) {
					{
					setState(680);
					match(T__28);
					setState(681);
					match(T__29);
					}
				}

				}
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(684);
				match(T__19);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(685);
				match(T__20);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(686);
				match(T__18);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 5);
				{
				setState(687);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 6);
				{
				setState(688);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 7);
				{
				setState(689);
				match(T__32);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 8);
				{
				setState(690);
				match(T__17);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 9);
				{
				setState(691);
				match(T__33);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 10);
				{
				setState(692);
				match(T__21);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 11);
				{
				setState(693);
				match(T__22);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 12);
				{
				setState(694);
				match(T__34);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 13);
				{
				setState(695);
				match(T__23);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 14);
				{
				setState(696);
				match(T__24);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 15);
				{
				setState(697);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 16);
				{
				setState(698);
				match(T__36);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 17);
				{
				setState(699);
				match(T__37);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 18);
				{
				setState(700);
				match(T__38);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 19);
				{
				setState(701);
				match(T__39);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 20);
				{
				setState(702);
				match(T__40);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 21);
				{
				setState(703);
				match(T__41);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 22);
				{
				setState(704);
				match(T__42);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 23);
				{
				setState(705);
				match(T__43);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 24);
				{
				setState(706);
				match(T__44);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 25);
				{
				setState(707);
				match(T__45);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 26);
				{
				setState(708);
				match(T__46);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 27);
				{
				setState(709);
				match(T__47);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 28);
				{
				setState(710);
				match(T__48);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 29);
				{
				setState(711);
				match(T__25);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 30);
				{
				setState(712);
				match(T__26);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 31);
				{
				setState(713);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 32);
				{
				setState(714);
				match(T__50);
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 33);
				{
				setState(715);
				match(T__51);
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 34);
				{
				setState(716);
				match(T__52);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 35);
				{
				setState(717);
				match(T__12);
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 36);
				{
				setState(718);
				match(T__53);
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 37);
				{
				setState(719);
				match(T__54);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 38);
				{
				setState(720);
				match(T__0);
				setState(721);
				match(T__1);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 39);
				{
				setState(722);
				match(T__28);
				setState(723);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAssignment_operator(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__45) | (1L << T__46))) != 0)) ) {
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterEquality_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitEquality_operator(this);
		}
	}

	public final Equality_operatorContext equality_operator() throws RecognitionException {
		Equality_operatorContext _localctx = new Equality_operatorContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_equality_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			_la = _input.LA(1);
			if ( !(_la==T__47 || _la==T__48) ) {
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
		public TerminalNode TEMPLATE() { return getToken(FunctionParser.TEMPLATE, 0); }
		public Template_param_listContext template_param_list() {
			return getRuleContext(Template_param_listContext.class,0);
		}
		public Template_decl_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_decl_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterTemplate_decl_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitTemplate_decl_start(this);
		}
	}

	public final Template_decl_startContext template_decl_start() throws RecognitionException {
		Template_decl_startContext _localctx = new Template_decl_startContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_template_decl_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			match(TEMPLATE);
			setState(731);
			match(T__23);
			setState(732);
			template_param_list();
			setState(733);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterTemplate_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitTemplate_param_list(this);
		}
	}

	public final Template_param_listContext template_param_list() throws RecognitionException {
		Template_param_listContext _localctx = new Template_param_listContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_template_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(744);
				switch (_input.LA(1)) {
				case T__23:
					{
					{
					setState(735);
					match(T__23);
					setState(736);
					template_param_list();
					setState(737);
					match(T__24);
					}
					}
					break;
				case T__0:
					{
					{
					setState(739);
					match(T__0);
					setState(740);
					template_param_list();
					setState(741);
					match(T__1);
					}
					}
					break;
				case T__2:
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
					setState(743);
					no_angle_brackets_or_brackets();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(746); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (WHITESPACE - 64)) | (1L << (OTHER - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNo_brackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNo_brackets(this);
		}
	}

	public final No_bracketsContext no_brackets() throws RecognitionException {
		No_bracketsContext _localctx = new No_bracketsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_no_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__0 || _la==T__1) ) {
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNo_brackets_curlies_or_squares(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNo_brackets_curlies_or_squares(this);
		}
	}

	public final No_brackets_curlies_or_squaresContext no_brackets_curlies_or_squares() throws RecognitionException {
		No_brackets_curlies_or_squaresContext _localctx = new No_brackets_curlies_or_squaresContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_no_brackets_curlies_or_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__28) | (1L << T__29))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNo_brackets_or_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNo_brackets_or_semicolon(this);
		}
	}

	public final No_brackets_or_semicolonContext no_brackets_or_semicolon() throws RecognitionException {
		No_brackets_or_semicolonContext _localctx = new No_brackets_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_no_brackets_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNo_angle_brackets_or_brackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNo_angle_brackets_or_brackets(this);
		}
	}

	public final No_angle_brackets_or_bracketsContext no_angle_brackets_or_brackets() throws RecognitionException {
		No_angle_brackets_or_bracketsContext _localctx = new No_angle_brackets_or_bracketsContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_no_angle_brackets_or_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__23) | (1L << T__24))) != 0)) ) {
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNo_curlies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNo_curlies(this);
		}
	}

	public final No_curliesContext no_curlies() throws RecognitionException {
		No_curliesContext _localctx = new No_curliesContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_no_curlies);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNo_squares(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNo_squares(this);
		}
	}

	public final No_squaresContext no_squares() throws RecognitionException {
		No_squaresContext _localctx = new No_squaresContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_no_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNo_squares_or_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNo_squares_or_semicolon(this);
		}
	}

	public final No_squares_or_semicolonContext no_squares_or_semicolon() throws RecognitionException {
		No_squares_or_semicolonContext _localctx = new No_squares_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_no_squares_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__28) | (1L << T__29))) != 0)) ) {
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNo_comma_or_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNo_comma_or_semicolon(this);
		}
	}

	public final No_comma_or_semicolonContext no_comma_or_semicolon() throws RecognitionException {
		No_comma_or_semicolonContext _localctx = new No_comma_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_no_comma_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__2 || _la==T__12) ) {
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAssign_water(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAssign_water(this);
		}
	}

	public final Assign_waterContext assign_water() throws RecognitionException {
		Assign_waterContext _localctx = new Assign_waterContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_assign_water);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAssign_water_l2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAssign_water_l2(this);
		}
	}

	public final Assign_water_l2Context assign_water_l2() throws RecognitionException {
		Assign_water_l2Context _localctx = new Assign_water_l2Context(_ctx, getState());
		enterRule(_localctx, 116, RULE_assign_water_l2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__28) | (1L << T__29))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterWater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitWater(this);
		}
	}

	public final WaterContext water() throws RecognitionException {
		WaterContext _localctx = new WaterContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_water);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterCustom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitCustom(this);
		}
	}

	public final CustomContext custom() throws RecognitionException {
		CustomContext _localctx = new CustomContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_custom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(770);
				asciiTab();
				}
				break;
			case 2:
				{
				setState(771);
				externC();
				}
				break;
			case 3:
				{
				setState(772);
				macroFunctionPointer();
				}
				break;
			case 4:
				{
				setState(773);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAsciiTab(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAsciiTab(this);
		}
	}

	public final AsciiTabContext asciiTab() throws RecognitionException {
		AsciiTabContext _localctx = new AsciiTabContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_asciiTab);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(779); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(776);
					pre_macro_identifier();
					setState(777);
					match(T__12);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(781); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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
		public TerminalNode OPENING_CURLY() { return getToken(FunctionParser.OPENING_CURLY, 0); }
		public ExternCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterExternC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitExternC(this);
		}
	}

	public final ExternCContext externC() throws RecognitionException {
		ExternCContext _localctx = new ExternCContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_externC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			match(EXTERN);
			setState(784);
			match(T__55);
			setState(786);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(785);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterMacroFunctionPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitMacroFunctionPointer(this);
		}
	}

	public final MacroFunctionPointerContext macroFunctionPointer() throws RecognitionException {
		MacroFunctionPointerContext _localctx = new MacroFunctionPointerContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_macroFunctionPointer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			macroCall();
			setState(790);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(789);
				match(NEWLINE);
				}
				break;
			}
			setState(793);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(792);
				pre_macro_identifier();
				}
				break;
			}
			setState(796);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(795);
				match(NEWLINE);
				}
			}

			setState(798);
			macroCall();
			setState(800);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(799);
				match(NEWLINE);
				}
			}

			setState(802);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterTestStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitTestStart(this);
		}
	}

	public final TestStartContext testStart() throws RecognitionException {
		TestStartContext _localctx = new TestStartContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_testStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			match(T__4);
			setState(805);
			match(T__0);
			setState(806);
			function_name();
			setState(807);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode END_TEST() { return getToken(FunctionParser.END_TEST, 0); }
		public TestEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterTestEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitTestEnd(this);
		}
	}

	public final TestEndContext testEnd() throws RecognitionException {
		TestEndContext _localctx = new TestEndContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_testEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public Ctor_listContext ctor_list() {
			return getRuleContext(Ctor_listContext.class,0);
		}
		public MacroCallContext macroCall() {
			return getRuleContext(MacroCallContext.class,0);
		}
		public Function_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFunction_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFunction_def(this);
		}
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_function_def);
		int _la;
		try {
			setState(842);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(812);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(811);
					template_decl_start();
					}
				}

				setState(815);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(814);
					return_type();
					}
					break;
				}
				setState(821);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0) || _la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(817);
					pre_other();
					setState(819);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(818);
						match(NEWLINE);
						}
					}

					}
				}

				setState(823);
				function_name();
				setState(825);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(824);
					match(NEWLINE);
					}
				}

				setState(827);
				function_param_list();
				setState(829);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(828);
					ctor_list();
					}
				}

				setState(832);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(831);
					match(NEWLINE);
					}
				}

				setState(834);
				compound_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(836);
				macroCall();
				setState(838);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(837);
					match(NEWLINE);
					}
				}

				setState(840);
				compound_statement();
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitReturn_type(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_return_type);
		int _la;
		try {
			int _alt;
			setState(868);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(850);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(844);
						function_decl_specifiers();
						setState(846);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(845);
							match(NEWLINE);
							}
						}

						}
						} 
					}
					setState(852);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				}
				setState(853);
				type_name();
				}
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17 || _la==T__18) {
					{
					{
					setState(855);
					ptr_operator();
					setState(857);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(856);
						match(NEWLINE);
						}
					}

					}
					}
					setState(863);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(864);
				macroCall();
				setState(866);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(865);
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
		public List<TerminalNode> CV_QUALIFIER() { return getTokens(FunctionParser.CV_QUALIFIER); }
		public TerminalNode CV_QUALIFIER(int i) {
			return getToken(FunctionParser.CV_QUALIFIER, i);
		}
		public Exception_specificationContext exception_specification() {
			return getRuleContext(Exception_specificationContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public Function_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFunction_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFunction_param_list(this);
		}
	}

	public final Function_param_listContext function_param_list() throws RecognitionException {
		Function_param_listContext _localctx = new Function_param_listContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_function_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			match(T__0);
			setState(872);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (STATIC - 80)) | (1L << (VOID - 80)) | (1L << (UNSIGNED - 80)) | (1L << (SIGNED - 80)) | (1L << (CV_QUALIFIER - 80)) | (1L << (EXTERN - 80)) | (1L << (VIRTUAL - 80)) | (1L << (AUTO - 80)) | (1L << (REGISTER - 80)) | (1L << (SPECIAL_DATA - 80)) | (1L << (OPERATOR - 80)) | (1L << (CLASS_KEY - 80)) | (1L << (NEW - 80)) | (1L << (PRE_PRAGMA_KEYWORDS - 80)) | (1L << (END_TEST - 80)) | (1L << (ALPHA_NUMERIC - 80)))) != 0)) {
				{
				setState(871);
				parameter_decl_clause();
				}
			}

			setState(874);
			match(T__1);
			setState(876);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(875);
				match(T__18);
				}
			}

			setState(884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CV_QUALIFIER) {
				{
				{
				setState(878);
				match(CV_QUALIFIER);
				setState(880);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(879);
					match(NEWLINE);
					}
					break;
				}
				}
				}
				setState(886);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(888);
			_la = _input.LA(1);
			if (_la==THROW) {
				{
				setState(887);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public Parameter_decl_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_decl_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterParameter_decl_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitParameter_decl_clause(this);
		}
	}

	public final Parameter_decl_clauseContext parameter_decl_clause() throws RecognitionException {
		Parameter_decl_clauseContext _localctx = new Parameter_decl_clauseContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_parameter_decl_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(890);
			parameter_decl();
			setState(898);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(891);
					match(T__12);
					setState(893);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(892);
						match(NEWLINE);
						}
					}

					setState(895);
					parameter_decl();
					}
					} 
				}
				setState(900);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			}
			}
			setState(906);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(901);
				match(T__12);
				setState(903);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(902);
					match(NEWLINE);
					}
				}

				setState(905);
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
		public TerminalNode VOID() { return getToken(FunctionParser.VOID, 0); }
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterParameter_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitParameter_decl(this);
		}
	}

	public final Parameter_declContext parameter_decl() throws RecognitionException {
		Parameter_declContext _localctx = new Parameter_declContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_parameter_decl);
		try {
			setState(912);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(908);
				match(VOID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(909);
				param_decl_specifiers();
				setState(910);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterParameter_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitParameter_id(this);
		}
	}

	public final Parameter_idContext parameter_id() throws RecognitionException {
		Parameter_idContext _localctx = new Parameter_idContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_parameter_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			_la = _input.LA(1);
			if (_la==T__17 || _la==T__18) {
				{
				setState(914);
				ptrs();
				}
			}

			setState(922);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(917);
				match(T__0);
				setState(918);
				parameter_id();
				setState(919);
				match(T__1);
				}
				break;
			case T__8:
			case T__9:
			case T__10:
			case NEW:
			case PRE_PRAGMA_KEYWORDS:
			case ALPHA_NUMERIC:
				{
				setState(921);
				parameter_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(925);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__28) {
				{
				setState(924);
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
		public TerminalNode OPENING_CURLY() { return getToken(FunctionParser.OPENING_CURLY, 0); }
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterCompound_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitCompound_statement(this);
		}
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_compound_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterCtor_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitCtor_list(this);
		}
	}

	public final Ctor_listContext ctor_list() throws RecognitionException {
		Ctor_listContext _localctx = new Ctor_listContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_ctor_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			match(T__3);
			setState(931);
			ctor_initializer();
			setState(936);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(932);
				match(T__12);
				setState(933);
				ctor_initializer();
				}
				}
				setState(938);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterCtor_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitCtor_initializer(this);
		}
	}

	public final Ctor_initializerContext ctor_initializer() throws RecognitionException {
		Ctor_initializerContext _localctx = new Ctor_initializerContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_ctor_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			initializer_id();
			setState(940);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterInitializer_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitInitializer_id(this);
		}
	}

	public final Initializer_idContext initializer_id() throws RecognitionException {
		Initializer_idContext _localctx = new Initializer_idContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_initializer_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			_la = _input.LA(1);
			if (_la==T__56) {
				{
				setState(942);
				match(T__56);
				}
			}

			setState(945);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterCtor_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitCtor_expr(this);
		}
	}

	public final Ctor_exprContext ctor_expr() throws RecognitionException {
		Ctor_exprContext _localctx = new Ctor_exprContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_ctor_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
			match(T__0);
			setState(949);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__51) | (1L << T__52) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)))) != 0)) {
				{
				setState(948);
				expr();
				}
			}

			setState(951);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPERATOR() { return getToken(FunctionParser.OPERATOR, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFunction_name(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_function_name);
		try {
			setState(960);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case NEW:
			case PRE_PRAGMA_KEYWORDS:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(953);
				identifier();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(954);
				match(T__0);
				setState(955);
				function_name();
				setState(956);
				match(T__1);
				}
				break;
			case OPERATOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(958);
				match(OPERATOR);
				setState(959);
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
		public TerminalNode THROW() { return getToken(FunctionParser.THROW, 0); }
		public Type_id_listContext type_id_list() {
			return getRuleContext(Type_id_listContext.class,0);
		}
		public Exception_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterException_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitException_specification(this);
		}
	}

	public final Exception_specificationContext exception_specification() throws RecognitionException {
		Exception_specificationContext _localctx = new Exception_specificationContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_exception_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			match(THROW);
			setState(963);
			match(T__0);
			setState(964);
			type_id_list();
			setState(965);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterType_id_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitType_id_list(this);
		}
	}

	public final Type_id_listContext type_id_list() throws RecognitionException {
		Type_id_listContext _localctx = new Type_id_listContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_type_id_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (WHITESPACE - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(967);
				no_brackets();
				}
				}
				setState(972);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(984);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(973);
				match(T__0);
				setState(974);
				type_id_list();
				setState(975);
				match(T__1);
				setState(979);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (WHITESPACE - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(976);
					no_brackets();
					}
					}
					setState(981);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(986);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterSimple_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitSimple_decl(this);
		}
	}

	public final Simple_declContext simple_decl() throws RecognitionException {
		Simple_declContext _localctx = new Simple_declContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_simple_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterDeclByClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitDeclByClass(this);
		}
	}
	public static class DeclByTypeContext extends Var_declContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public TerminalNode TYPEDEF() { return getToken(FunctionParser.TYPEDEF, 0); }
		public Template_decl_startContext template_decl_start() {
			return getRuleContext(Template_decl_startContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(FunctionParser.NEWLINE, 0); }
		public DeclByTypeContext(Var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterDeclByType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitDeclByType(this);
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
		public TerminalNode TYPEDEF() { return getToken(FunctionParser.TYPEDEF, 0); }
		public CallingConventionContext callingConvention() {
			return getRuleContext(CallingConventionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public Pre_otherContext pre_other() {
			return getRuleContext(Pre_otherContext.class,0);
		}
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public FunctionPointerDeclareContext(Var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFunctionPointerDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFunctionPointerDeclare(this);
		}
	}
	public static class StructUnionEnumContext extends Var_declContext {
		public Special_datatypeContext special_datatype() {
			return getRuleContext(Special_datatypeContext.class,0);
		}
		public TerminalNode CV_QUALIFIER() { return getToken(FunctionParser.CV_QUALIFIER, 0); }
		public Function_decl_specifiersContext function_decl_specifiers() {
			return getRuleContext(Function_decl_specifiersContext.class,0);
		}
		public TerminalNode TYPEDEF() { return getToken(FunctionParser.TYPEDEF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public StructUnionEnumContext(Var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterStructUnionEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitStructUnionEnum(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_var_decl);
		int _la;
		try {
			setState(1066);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				_localctx = new DeclByClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(990);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(989);
					template_decl_start();
					}
				}

				setState(992);
				class_def();
				setState(994);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(993);
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
				setState(1000);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(996);
					match(TYPEDEF);
					setState(998);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(997);
						match(NEWLINE);
						}
					}

					}
				}

				setState(1003);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(1002);
					template_decl_start();
					}
				}

				setState(1005);
				type_name();
				setState(1006);
				init_declarator_list();
				}
				break;
			case 3:
				_localctx = new FunctionPointerDeclareContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1012);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(1008);
					match(TYPEDEF);
					setState(1010);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1009);
						match(NEWLINE);
						}
					}

					}
				}

				setState(1014);
				type_name();
				setState(1015);
				match(T__0);
				setState(1017);
				_la = _input.LA(1);
				if (_la==ALPHA_NUMERIC) {
					{
					setState(1016);
					callingConvention();
					}
				}

				setState(1019);
				ptr_operator();
				setState(1020);
				identifier();
				setState(1021);
				match(T__1);
				setState(1022);
				param_type_list();
				setState(1024);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1023);
					match(NEWLINE);
					}
				}

				setState(1027);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0) || _la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(1026);
					pre_other();
					}
				}

				setState(1034);
				_la = _input.LA(1);
				if (_la==T__34) {
					{
					setState(1029);
					match(T__34);
					setState(1031);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1030);
						match(NEWLINE);
						}
					}

					setState(1033);
					argument();
					}
				}

				setState(1036);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new StructUnionEnumContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1042);
				_la = _input.LA(1);
				if (_la==CV_QUALIFIER) {
					{
					setState(1038);
					match(CV_QUALIFIER);
					setState(1040);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1039);
						match(NEWLINE);
						}
					}

					}
				}

				setState(1048);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==STATIC || _la==VIRTUAL) {
					{
					setState(1044);
					function_decl_specifiers();
					setState(1046);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1045);
						match(NEWLINE);
						}
					}

					}
				}

				setState(1054);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(1050);
					match(TYPEDEF);
					setState(1052);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1051);
						match(NEWLINE);
						}
					}

					}
				}

				setState(1056);
				special_datatype();
				setState(1058);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1057);
					match(NEWLINE);
					}
					break;
				}
				setState(1061);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(1060);
					init_declarator_list();
					}
					break;
				}
				setState(1064);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1063);
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

	public static class CallingConventionContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(FunctionParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(FunctionParser.ALPHA_NUMERIC, i);
		}
		public CallingConventionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callingConvention; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterCallingConvention(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitCallingConvention(this);
		}
	}

	public final CallingConventionContext callingConvention() throws RecognitionException {
		CallingConventionContext _localctx = new CallingConventionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_callingConvention);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1068);
				match(ALPHA_NUMERIC);
				}
				}
				setState(1071); 
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
		public TerminalNode SPECIAL_DATA() { return getToken(FunctionParser.SPECIAL_DATA, 0); }
		public TerminalNode OPENING_CURLY() { return getToken(FunctionParser.OPENING_CURLY, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterSpecial_datatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitSpecial_datatype(this);
		}
	}

	public final Special_datatypeContext special_datatype() throws RecognitionException {
		Special_datatypeContext _localctx = new Special_datatypeContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_special_datatype);
		int _la;
		try {
			setState(1120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1073);
				match(SPECIAL_DATA);
				setState(1075);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1074);
					match(NEWLINE);
					}
				}

				setState(1078);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(1077);
					pre_other();
					}
					break;
				}
				setState(1084);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (NEW - 98)) | (1L << (PRE_PRAGMA_KEYWORDS - 98)) | (1L << (ALPHA_NUMERIC - 98)))) != 0)) {
					{
					setState(1080);
					identifier();
					setState(1082);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1081);
						match(NEWLINE);
						}
					}

					}
				}

				setState(1087);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0) || _la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(1086);
					pre_other();
					}
				}

				setState(1089);
				match(OPENING_CURLY);
				skipToEndOfObject(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1091);
				match(SPECIAL_DATA);
				setState(1093);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1092);
					match(NEWLINE);
					}
				}

				setState(1096);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0) || _la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(1095);
					pre_other();
					}
				}

				setState(1098);
				identifier();
				setState(1100);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1099);
					match(NEWLINE);
					}
				}

				setState(1103);
				_la = _input.LA(1);
				if (_la==T__17 || _la==T__18) {
					{
					setState(1102);
					ptrs();
					}
				}

				setState(1105);
				identifier();
				setState(1107);
				_la = _input.LA(1);
				if (_la==T__17 || _la==T__18) {
					{
					setState(1106);
					ptrs();
					}
				}

				setState(1109);
				match(T__34);
				skipToEndOfObject(); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1112);
				match(SPECIAL_DATA);
				setState(1114);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1113);
					match(NEWLINE);
					}
				}

				setState(1117);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0) || _la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(1116);
					pre_other();
					}
				}

				setState(1119);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterInit_declarator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitInit_declarator_list(this);
		}
	}

	public final Init_declarator_listContext init_declarator_list() throws RecognitionException {
		Init_declarator_listContext _localctx = new Init_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_init_declarator_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1122);
			init_declarator();
			setState(1133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1124);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1123);
						match(NEWLINE);
						}
					}

					setState(1126);
					match(T__12);
					setState(1128);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1127);
						match(NEWLINE);
						}
					}

					setState(1130);
					init_declarator();
					}
					} 
				}
				setState(1135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			}
			setState(1137);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1136);
				match(NEWLINE);
				}
			}

			setState(1140);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0) || _la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
				{
				setState(1139);
				pre_other();
				}
			}

			setState(1142);
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

	public static class Class_defContext extends ParserRuleContext {
		public TerminalNode CLASS_KEY() { return getToken(FunctionParser.CLASS_KEY, 0); }
		public TerminalNode OPENING_CURLY() { return getToken(FunctionParser.OPENING_CURLY, 0); }
		public TerminalNode NEWLINE() { return getToken(FunctionParser.NEWLINE, 0); }
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterClass_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitClass_def(this);
		}
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			match(CLASS_KEY);
			setState(1146);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1145);
				match(NEWLINE);
				}
			}

			setState(1149);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (NEW - 98)) | (1L << (PRE_PRAGMA_KEYWORDS - 98)) | (1L << (ALPHA_NUMERIC - 98)))) != 0)) {
				{
				setState(1148);
				class_name();
				}
			}

			setState(1152);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(1151);
				base_classes();
				}
			}

			setState(1154);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterClass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitClass_name(this);
		}
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1157);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterBase_classes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitBase_classes(this);
		}
	}

	public final Base_classesContext base_classes() throws RecognitionException {
		Base_classesContext _localctx = new Base_classesContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_base_classes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1159);
			match(T__3);
			setState(1160);
			base_class();
			setState(1165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(1161);
				match(T__12);
				setState(1162);
				base_class();
				}
				}
				setState(1167);
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
		public TerminalNode VIRTUAL() { return getToken(FunctionParser.VIRTUAL, 0); }
		public Access_specifierContext access_specifier() {
			return getRuleContext(Access_specifierContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(FunctionParser.NEWLINE, 0); }
		public Base_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterBase_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitBase_class(this);
		}
	}

	public final Base_classContext base_class() throws RecognitionException {
		Base_classContext _localctx = new Base_classContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_base_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172);
			_la = _input.LA(1);
			if (_la==VIRTUAL) {
				{
				setState(1168);
				match(VIRTUAL);
				setState(1170);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1169);
					match(NEWLINE);
					}
				}

				}
			}

			setState(1175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				{
				setState(1174);
				access_specifier();
				}
				break;
			}
			setState(1177);
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
		public TerminalNode EXTERN() { return getToken(FunctionParser.EXTERN, 0); }
		public List<Function_decl_specifiersContext> function_decl_specifiers() {
			return getRuleContexts(Function_decl_specifiersContext.class);
		}
		public Function_decl_specifiersContext function_decl_specifiers(int i) {
			return getRuleContext(Function_decl_specifiersContext.class,i);
		}
		public List<TerminalNode> CV_QUALIFIER() { return getTokens(FunctionParser.CV_QUALIFIER); }
		public TerminalNode CV_QUALIFIER(int i) {
			return getToken(FunctionParser.CV_QUALIFIER, i);
		}
		public List<TerminalNode> UNSIGNED() { return getTokens(FunctionParser.UNSIGNED); }
		public TerminalNode UNSIGNED(int i) {
			return getToken(FunctionParser.UNSIGNED, i);
		}
		public List<TerminalNode> SIGNED() { return getTokens(FunctionParser.SIGNED); }
		public TerminalNode SIGNED(int i) {
			return getToken(FunctionParser.SIGNED, i);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitType_name(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_type_name);
		int _la;
		try {
			int _alt;
			setState(1243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1183);
				_la = _input.LA(1);
				if (_la==EXTERN) {
					{
					setState(1179);
					match(EXTERN);
					setState(1181);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1180);
						match(NEWLINE);
						}
					}

					}
				}

				setState(1200); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(1200);
						switch (_input.LA(1)) {
						case T__5:
						case T__6:
						case T__7:
						case STATIC:
						case VIRTUAL:
							{
							setState(1185);
							function_decl_specifiers();
							}
							break;
						case CV_QUALIFIER:
							{
							setState(1186);
							match(CV_QUALIFIER);
							setState(1188);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
							case 1:
								{
								setState(1187);
								match(NEWLINE);
								}
								break;
							}
							}
							break;
						case UNSIGNED:
							{
							setState(1190);
							match(UNSIGNED);
							setState(1192);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
							case 1:
								{
								setState(1191);
								match(NEWLINE);
								}
								break;
							}
							}
							break;
						case SIGNED:
							{
							setState(1194);
							match(SIGNED);
							setState(1196);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
							case 1:
								{
								setState(1195);
								match(NEWLINE);
								}
								break;
							}
							}
							break;
						case T__17:
						case T__18:
							{
							setState(1198);
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
							setState(1199);
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
					setState(1202); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1208);
				_la = _input.LA(1);
				if (_la==T__23) {
					{
					setState(1204);
					match(T__23);
					setState(1205);
					template_param_list();
					setState(1206);
					match(T__24);
					}
				}

				setState(1220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__56) {
					{
					{
					setState(1210);
					match(T__56);
					setState(1211);
					base_type();
					setState(1216);
					_la = _input.LA(1);
					if (_la==T__23) {
						{
						setState(1212);
						match(T__23);
						setState(1213);
						template_param_list();
						setState(1214);
						match(T__24);
						}
					}

					}
					}
					setState(1222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(1237);
						switch (_input.LA(1)) {
						case T__5:
						case T__6:
						case T__7:
						case STATIC:
						case VIRTUAL:
							{
							setState(1223);
							function_decl_specifiers();
							}
							break;
						case CV_QUALIFIER:
							{
							setState(1224);
							match(CV_QUALIFIER);
							setState(1226);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
							case 1:
								{
								setState(1225);
								match(NEWLINE);
								}
								break;
							}
							}
							break;
						case UNSIGNED:
							{
							setState(1228);
							match(UNSIGNED);
							setState(1230);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
							case 1:
								{
								setState(1229);
								match(NEWLINE);
								}
								break;
							}
							}
							break;
						case SIGNED:
							{
							setState(1232);
							match(SIGNED);
							setState(1234);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
							case 1:
								{
								setState(1233);
								match(NEWLINE);
								}
								break;
							}
							}
							break;
						case T__17:
						case T__18:
							{
							setState(1236);
							ptr_operator();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(1241);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1242);
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
		public List<TerminalNode> VOID() { return getTokens(FunctionParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(FunctionParser.VOID, i);
		}
		public List<TerminalNode> SPECIAL_DATA() { return getTokens(FunctionParser.SPECIAL_DATA); }
		public TerminalNode SPECIAL_DATA(int i) {
			return getToken(FunctionParser.SPECIAL_DATA, i);
		}
		public List<TerminalNode> CLASS_KEY() { return getTokens(FunctionParser.CLASS_KEY); }
		public TerminalNode CLASS_KEY(int i) {
			return getToken(FunctionParser.CLASS_KEY, i);
		}
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(FunctionParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(FunctionParser.ALPHA_NUMERIC, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public Base_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterBase_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitBase_type(this);
		}
	}

	public final Base_typeContext base_type() throws RecognitionException {
		Base_typeContext _localctx = new Base_typeContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_base_type);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1273); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1273);
					switch (_input.LA(1)) {
					case VOID:
						{
						setState(1245);
						match(VOID);
						setState(1247);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
						case 1:
							{
							setState(1246);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case T__11:
						{
						setState(1249);
						match(T__11);
						setState(1251);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
						case 1:
							{
							setState(1250);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case T__57:
						{
						setState(1253);
						match(T__57);
						setState(1255);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
						case 1:
							{
							setState(1254);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case T__58:
						{
						setState(1257);
						match(T__58);
						setState(1259);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
						case 1:
							{
							setState(1258);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case SPECIAL_DATA:
						{
						setState(1261);
						match(SPECIAL_DATA);
						setState(1263);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
						case 1:
							{
							setState(1262);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case CLASS_KEY:
						{
						setState(1265);
						match(CLASS_KEY);
						setState(1267);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
						case 1:
							{
							setState(1266);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case ALPHA_NUMERIC:
						{
						setState(1269);
						match(ALPHA_NUMERIC);
						setState(1271);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
						case 1:
							{
							setState(1270);
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
				setState(1275); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
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
		public TerminalNode AUTO() { return getToken(FunctionParser.AUTO, 0); }
		public TerminalNode REGISTER() { return getToken(FunctionParser.REGISTER, 0); }
		public TerminalNode NEWLINE() { return getToken(FunctionParser.NEWLINE, 0); }
		public Param_decl_specifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl_specifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterParam_decl_specifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitParam_decl_specifiers(this);
		}
	}

	public final Param_decl_specifiersContext param_decl_specifiers() throws RecognitionException {
		Param_decl_specifiersContext _localctx = new Param_decl_specifiersContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_param_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1285);
			switch (_input.LA(1)) {
			case AUTO:
				{
				setState(1277);
				match(AUTO);
				setState(1279);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1278);
					match(NEWLINE);
					}
				}

				}
				break;
			case REGISTER:
				{
				setState(1281);
				match(REGISTER);
				setState(1283);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1282);
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
			setState(1287);
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
		public TerminalNode NEWLINE() { return getToken(FunctionParser.NEWLINE, 0); }
		public Parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterParameter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitParameter_name(this);
		}
	}

	public final Parameter_nameContext parameter_name() throws RecognitionException {
		Parameter_nameContext _localctx = new Parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_parameter_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
			identifier();
			setState(1291);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1290);
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
		public TerminalNode VOID() { return getToken(FunctionParser.VOID, 0); }
		public List<Param_typeContext> param_type() {
			return getRuleContexts(Param_typeContext.class);
		}
		public Param_typeContext param_type(int i) {
			return getRuleContext(Param_typeContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public Param_type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_type_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterParam_type_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitParam_type_list(this);
		}
	}

	public final Param_type_listContext param_type_list() throws RecognitionException {
		Param_type_listContext _localctx = new Param_type_listContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_param_type_list);
		int _la;
		try {
			setState(1311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1293);
				match(T__0);
				setState(1294);
				match(VOID);
				setState(1295);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1296);
				match(T__0);
				setState(1308);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ELLIPSIS - 67)) | (1L << (STATIC - 67)) | (1L << (VOID - 67)) | (1L << (UNSIGNED - 67)) | (1L << (SIGNED - 67)) | (1L << (CV_QUALIFIER - 67)) | (1L << (EXTERN - 67)) | (1L << (VIRTUAL - 67)) | (1L << (AUTO - 67)) | (1L << (REGISTER - 67)) | (1L << (SPECIAL_DATA - 67)) | (1L << (OPERATOR - 67)) | (1L << (CLASS_KEY - 67)) | (1L << (NEW - 67)) | (1L << (PRE_PRAGMA_KEYWORDS - 67)) | (1L << (END_TEST - 67)) | (1L << (ALPHA_NUMERIC - 67)))) != 0)) {
					{
					setState(1297);
					param_type();
					setState(1305);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(1298);
						match(T__12);
						setState(1300);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(1299);
							match(NEWLINE);
							}
						}

						setState(1302);
						param_type();
						}
						}
						setState(1307);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1310);
				match(T__1);
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
		public TerminalNode NEWLINE() { return getToken(FunctionParser.NEWLINE, 0); }
		public Param_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterParam_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitParam_type(this);
		}
	}

	public final Param_typeContext param_type() throws RecognitionException {
		Param_typeContext _localctx = new Param_typeContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_param_type);
		int _la;
		try {
			setState(1320);
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
				setState(1313);
				param_decl_specifiers();
				setState(1315);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1314);
					match(NEWLINE);
					}
				}

				setState(1317);
				param_type_id();
				}
				break;
			case ELLIPSIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1319);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterParam_type_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitParam_type_id(this);
		}
	}

	public final Param_type_idContext param_type_id() throws RecognitionException {
		Param_type_idContext _localctx = new Param_type_idContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_param_type_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1323);
			_la = _input.LA(1);
			if (_la==T__17 || _la==T__18) {
				{
				setState(1322);
				ptrs();
				}
			}

			setState(1332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				{
				setState(1325);
				match(T__0);
				setState(1326);
				param_type_id();
				setState(1327);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(1330);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (NEW - 98)) | (1L << (PRE_PRAGMA_KEYWORDS - 98)) | (1L << (ALPHA_NUMERIC - 98)))) != 0)) {
					{
					setState(1329);
					parameter_name();
					}
				}

				}
				break;
			}
			setState(1335);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__28) {
				{
				setState(1334);
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
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(FunctionParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(FunctionParser.ALPHA_NUMERIC, i);
		}
		public TerminalNode NEW() { return getToken(FunctionParser.NEW, 0); }
		public TerminalNode PRE_PRAGMA_KEYWORDS() { return getToken(FunctionParser.PRE_PRAGMA_KEYWORDS, 0); }
		public Access_specifierContext access_specifier() {
			return getRuleContext(Access_specifierContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_identifier);
		try {
			int _alt;
			setState(1348);
			switch (_input.LA(1)) {
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1337);
				match(ALPHA_NUMERIC);
				setState(1342);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1338);
						match(T__56);
						setState(1339);
						match(ALPHA_NUMERIC);
						}
						} 
					}
					setState(1344);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
				}
				}
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(1345);
				match(NEW);
				}
				break;
			case PRE_PRAGMA_KEYWORDS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1346);
				match(PRE_PRAGMA_KEYWORDS);
				}
				break;
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(1347);
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
		public TerminalNode HEX_LITERAL() { return getToken(FunctionParser.HEX_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(FunctionParser.DECIMAL_LITERAL, 0); }
		public TerminalNode OCTAL_LITERAL() { return getToken(FunctionParser.OCTAL_LITERAL, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1350);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPtrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPtrs(this);
		}
	}

	public final PtrsContext ptrs() throws RecognitionException {
		PtrsContext _localctx = new PtrsContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_ptrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1356); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1352);
				ptr_operator();
				setState(1354);
				_la = _input.LA(1);
				if (_la==T__59) {
					{
					setState(1353);
					match(T__59);
					}
				}

				}
				}
				setState(1358); 
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFunc_ptrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFunc_ptrs(this);
		}
	}

	public final Func_ptrsContext func_ptrs() throws RecognitionException {
		Func_ptrsContext _localctx = new Func_ptrsContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_func_ptrs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1360);
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
		public List<TerminalNode> ESCAPE() { return getTokens(FunctionParser.ESCAPE); }
		public TerminalNode ESCAPE(int i) {
			return getToken(FunctionParser.ESCAPE, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> COMMENT() { return getTokens(FunctionParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(FunctionParser.COMMENT, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1362);
			assign_expr();
			setState(1367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1363);
					match(ESCAPE);
					setState(1364);
					match(NEWLINE);
					}
					} 
				}
				setState(1369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
			}
			setState(1390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1371);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1370);
					match(NEWLINE);
					}
					break;
				}
				setState(1374);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1373);
					match(COMMENT);
					}
				}

				setState(1377);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1376);
					match(NEWLINE);
					}
				}

				setState(1379);
				match(T__12);
				setState(1381);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1380);
					match(NEWLINE);
					}
					break;
				}
				setState(1384);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1383);
					match(COMMENT);
					}
				}

				setState(1387);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1386);
					match(NEWLINE);
					}
				}

				setState(1389);
				expr();
				}
				break;
			}
			setState(1396);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1392);
					match(ESCAPE);
					setState(1393);
					match(NEWLINE);
					}
					} 
				}
				setState(1398);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(FunctionParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(FunctionParser.COMMENT, i);
		}
		public Assign_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAssign_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAssign_expr(this);
		}
	}

	public final Assign_exprContext assign_expr() throws RecognitionException {
		Assign_exprContext _localctx = new Assign_exprContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_assign_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1399);
			conditional_expression();
			setState(1421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(1401);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
				case 1:
					{
					setState(1400);
					match(NEWLINE);
					}
					break;
				}
				setState(1404);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1403);
					match(COMMENT);
					}
				}

				setState(1407);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1406);
					match(NEWLINE);
					}
				}

				setState(1409);
				assignment_operator();
				setState(1411);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
				case 1:
					{
					setState(1410);
					match(NEWLINE);
					}
					break;
				}
				setState(1414);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1413);
					match(COMMENT);
					}
				}

				setState(1417);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1416);
					match(NEWLINE);
					}
				}

				setState(1419);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNormOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNormOr(this);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(FunctionParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(FunctionParser.COMMENT, i);
		}
		public CndExprContext(Conditional_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterCndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitCndExpr(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_conditional_expression);
		int _la;
		try {
			setState(1466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				_localctx = new NormOrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1423);
				or_expression();
				}
				break;
			case 2:
				_localctx = new CndExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1424);
				or_expression();
				{
				setState(1426);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
				case 1:
					{
					setState(1425);
					match(NEWLINE);
					}
					break;
				}
				setState(1429);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1428);
					match(COMMENT);
					}
				}

				setState(1432);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1431);
					match(NEWLINE);
					}
				}

				setState(1434);
				match(T__60);
				setState(1436);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1435);
					match(NEWLINE);
					}
					break;
				}
				setState(1439);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1438);
					match(COMMENT);
					}
				}

				setState(1442);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1441);
					match(NEWLINE);
					}
				}

				setState(1444);
				expr();
				setState(1446);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
				case 1:
					{
					setState(1445);
					match(NEWLINE);
					}
					break;
				}
				setState(1449);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1448);
					match(COMMENT);
					}
				}

				setState(1452);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1451);
					match(NEWLINE);
					}
				}

				setState(1454);
				match(T__3);
				setState(1456);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1455);
					match(NEWLINE);
					}
					break;
				}
				setState(1459);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1458);
					match(COMMENT);
					}
				}

				setState(1462);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1461);
					match(NEWLINE);
					}
				}

				setState(1464);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(FunctionParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(FunctionParser.COMMENT, i);
		}
		public Or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterOr_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitOr_expression(this);
		}
	}

	public final Or_expressionContext or_expression() throws RecognitionException {
		Or_expressionContext _localctx = new Or_expressionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1468);
			and_expression();
			setState(1489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				{
				setState(1470);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
				case 1:
					{
					setState(1469);
					match(NEWLINE);
					}
					break;
				}
				setState(1473);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1472);
					match(COMMENT);
					}
				}

				setState(1476);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1475);
					match(NEWLINE);
					}
				}

				setState(1478);
				match(T__50);
				setState(1480);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
				case 1:
					{
					setState(1479);
					match(NEWLINE);
					}
					break;
				}
				setState(1483);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1482);
					match(COMMENT);
					}
				}

				setState(1486);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1485);
					match(NEWLINE);
					}
				}

				setState(1488);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(FunctionParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(FunctionParser.COMMENT, i);
		}
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAnd_expression(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1491);
			inclusive_or_expression();
			setState(1512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				setState(1493);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(1492);
					match(NEWLINE);
					}
					break;
				}
				setState(1496);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1495);
					match(COMMENT);
					}
				}

				setState(1499);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1498);
					match(NEWLINE);
					}
				}

				setState(1501);
				match(T__49);
				setState(1503);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
				case 1:
					{
					setState(1502);
					match(NEWLINE);
					}
					break;
				}
				setState(1506);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1505);
					match(COMMENT);
					}
				}

				setState(1509);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1508);
					match(NEWLINE);
					}
				}

				setState(1511);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(FunctionParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(FunctionParser.COMMENT, i);
		}
		public Inclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterInclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitInclusive_or_expression(this);
		}
	}

	public final Inclusive_or_expressionContext inclusive_or_expression() throws RecognitionException {
		Inclusive_or_expressionContext _localctx = new Inclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_inclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1514);
			exclusive_or_expression();
			setState(1535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				{
				setState(1516);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(1515);
					match(NEWLINE);
					}
					break;
				}
				setState(1519);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1518);
					match(COMMENT);
					}
				}

				setState(1522);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1521);
					match(NEWLINE);
					}
				}

				setState(1524);
				match(T__33);
				setState(1526);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
				case 1:
					{
					setState(1525);
					match(NEWLINE);
					}
					break;
				}
				setState(1529);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1528);
					match(COMMENT);
					}
				}

				setState(1532);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1531);
					match(NEWLINE);
					}
				}

				setState(1534);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(FunctionParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(FunctionParser.COMMENT, i);
		}
		public Exclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterExclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitExclusive_or_expression(this);
		}
	}

	public final Exclusive_or_expressionContext exclusive_or_expression() throws RecognitionException {
		Exclusive_or_expressionContext _localctx = new Exclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_exclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1537);
			bit_and_expression();
			setState(1558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				{
				setState(1539);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
				case 1:
					{
					setState(1538);
					match(NEWLINE);
					}
					break;
				}
				setState(1542);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1541);
					match(COMMENT);
					}
				}

				setState(1545);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1544);
					match(NEWLINE);
					}
				}

				setState(1547);
				match(T__32);
				setState(1549);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
				case 1:
					{
					setState(1548);
					match(NEWLINE);
					}
					break;
				}
				setState(1552);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1551);
					match(COMMENT);
					}
				}

				setState(1555);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1554);
					match(NEWLINE);
					}
				}

				setState(1557);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(FunctionParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(FunctionParser.COMMENT, i);
		}
		public Bit_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterBit_and_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitBit_and_expression(this);
		}
	}

	public final Bit_and_expressionContext bit_and_expression() throws RecognitionException {
		Bit_and_expressionContext _localctx = new Bit_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_bit_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1560);
			equality_expression();
			setState(1581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				{
				setState(1562);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
				case 1:
					{
					setState(1561);
					match(NEWLINE);
					}
					break;
				}
				setState(1565);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1564);
					match(COMMENT);
					}
				}

				setState(1568);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1567);
					match(NEWLINE);
					}
				}

				setState(1570);
				match(T__17);
				setState(1572);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
				case 1:
					{
					setState(1571);
					match(NEWLINE);
					}
					break;
				}
				setState(1575);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1574);
					match(COMMENT);
					}
				}

				setState(1578);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1577);
					match(NEWLINE);
					}
				}

				setState(1580);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(FunctionParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(FunctionParser.COMMENT, i);
		}
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitEquality_expression(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_equality_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1583);
			relational_expression();
			setState(1605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				{
				setState(1585);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
				case 1:
					{
					setState(1584);
					match(NEWLINE);
					}
					break;
				}
				setState(1588);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1587);
					match(COMMENT);
					}
				}

				setState(1591);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1590);
					match(NEWLINE);
					}
				}

				setState(1593);
				equality_operator();
				setState(1595);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
				case 1:
					{
					setState(1594);
					match(NEWLINE);
					}
					break;
				}
				setState(1598);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1597);
					match(COMMENT);
					}
				}

				setState(1601);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1600);
					match(NEWLINE);
					}
				}

				setState(1603);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(FunctionParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(FunctionParser.COMMENT, i);
		}
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitRelational_expression(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1607);
			shift_expression();
			setState(1629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				{
				setState(1609);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
				case 1:
					{
					setState(1608);
					match(NEWLINE);
					}
					break;
				}
				setState(1612);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1611);
					match(COMMENT);
					}
				}

				setState(1615);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1614);
					match(NEWLINE);
					}
				}

				setState(1617);
				relational_operator();
				setState(1619);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
				case 1:
					{
					setState(1618);
					match(NEWLINE);
					}
					break;
				}
				setState(1622);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1621);
					match(COMMENT);
					}
				}

				setState(1625);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1624);
					match(NEWLINE);
					}
				}

				setState(1627);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(FunctionParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(FunctionParser.COMMENT, i);
		}
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterShift_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitShift_expression(this);
		}
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1631);
			additive_expression();
			setState(1652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				{
				setState(1633);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
				case 1:
					{
					setState(1632);
					match(NEWLINE);
					}
					break;
				}
				setState(1636);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1635);
					match(COMMENT);
					}
				}

				setState(1639);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1638);
					match(NEWLINE);
					}
				}

				setState(1641);
				_la = _input.LA(1);
				if ( !(_la==T__43 || _la==T__44) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1643);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
				case 1:
					{
					setState(1642);
					match(NEWLINE);
					}
					break;
				}
				setState(1646);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1645);
					match(COMMENT);
					}
				}

				setState(1649);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1648);
					match(NEWLINE);
					}
				}

				setState(1651);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(FunctionParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(FunctionParser.COMMENT, i);
		}
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAdditive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAdditive_expression(this);
		}
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1654);
			multiplicative_expression();
			setState(1675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				{
				setState(1656);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
				case 1:
					{
					setState(1655);
					match(NEWLINE);
					}
					break;
				}
				setState(1659);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1658);
					match(COMMENT);
					}
				}

				setState(1662);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1661);
					match(NEWLINE);
					}
				}

				setState(1664);
				_la = _input.LA(1);
				if ( !(_la==T__19 || _la==T__20) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1666);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
				case 1:
					{
					setState(1665);
					match(NEWLINE);
					}
					break;
				}
				setState(1669);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1668);
					match(COMMENT);
					}
				}

				setState(1672);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1671);
					match(NEWLINE);
					}
				}

				setState(1674);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(FunctionParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(FunctionParser.COMMENT, i);
		}
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterMultiplicative_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitMultiplicative_expression(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_multiplicative_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1677);
			function_pointer_use_expression();
			setState(1698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
			case 1:
				{
				setState(1679);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
				case 1:
					{
					setState(1678);
					match(NEWLINE);
					}
					break;
				}
				setState(1682);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1681);
					match(COMMENT);
					}
				}

				setState(1685);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1684);
					match(NEWLINE);
					}
				}

				setState(1687);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__30) | (1L << T__31))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1689);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
				case 1:
					{
					setState(1688);
					match(NEWLINE);
					}
					break;
				}
				setState(1692);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1691);
					match(COMMENT);
					}
				}

				setState(1695);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1694);
					match(NEWLINE);
					}
				}

				setState(1697);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFunction_pointer_use_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFunction_pointer_use_expression(this);
		}
	}

	public final Function_pointer_use_expressionContext function_pointer_use_expression() throws RecognitionException {
		Function_pointer_use_expressionContext _localctx = new Function_pointer_use_expressionContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_function_pointer_use_expression);
		try {
			setState(1709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1700);
				match(T__0);
				setState(1701);
				ptr_operator();
				setState(1702);
				identifier();
				setState(1703);
				match(T__1);
				setState(1704);
				match(T__0);
				setState(1705);
				argument_list();
				setState(1706);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1708);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterCast_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitCast_expression(this);
		}
	}

	public final Cast_expressionContext cast_expression() throws RecognitionException {
		Cast_expressionContext _localctx = new Cast_expressionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_cast_expression);
		try {
			setState(1717);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1711);
				match(T__0);
				setState(1712);
				cast_target();
				setState(1713);
				match(T__1);
				setState(1714);
				cast_expression();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1716);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterCast_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitCast_target(this);
		}
	}

	public final Cast_targetContext cast_target() throws RecognitionException {
		Cast_targetContext _localctx = new Cast_targetContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_cast_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1719);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitUnary_expression(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_unary_expression);
		try {
			setState(1728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1721);
				address_of_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1722);
				unary_op_and_cast_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1723);
				sizeof_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1724);
				new_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1725);
				postfix_expression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1726);
				defined_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1727);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAddress_of_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAddress_of_expression(this);
		}
	}

	public final Address_of_expressionContext address_of_expression() throws RecognitionException {
		Address_of_expressionContext _localctx = new Address_of_expressionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_address_of_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1730);
			match(T__17);
			setState(1731);
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
		public TerminalNode NEW() { return getToken(FunctionParser.NEW, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(FunctionParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(FunctionParser.COMMENT, i);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNew_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNew_expression(this);
		}
	}

	public final New_expressionContext new_expression() throws RecognitionException {
		New_expressionContext _localctx = new New_expressionContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_new_expression);
		int _la;
		try {
			setState(1791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1734);
				_la = _input.LA(1);
				if (_la==T__56) {
					{
					setState(1733);
					match(T__56);
					}
				}

				setState(1736);
				match(NEW);
				setState(1738);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
				case 1:
					{
					setState(1737);
					match(NEWLINE);
					}
					break;
				}
				setState(1741);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1740);
					match(COMMENT);
					}
				}

				setState(1744);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1743);
					match(NEWLINE);
					}
				}

				setState(1746);
				type_name();
				setState(1748);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
				case 1:
					{
					setState(1747);
					match(NEWLINE);
					}
					break;
				}
				setState(1751);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1750);
					match(COMMENT);
					}
				}

				setState(1754);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1753);
					match(NEWLINE);
					}
				}

				setState(1756);
				match(T__28);
				setState(1758);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__51) | (1L << T__52) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)))) != 0)) {
					{
					setState(1757);
					conditional_expression();
					}
				}

				setState(1760);
				match(T__29);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1763);
				_la = _input.LA(1);
				if (_la==T__56) {
					{
					setState(1762);
					match(T__56);
					}
				}

				setState(1765);
				match(NEW);
				setState(1767);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
				case 1:
					{
					setState(1766);
					match(NEWLINE);
					}
					break;
				}
				setState(1770);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1769);
					match(COMMENT);
					}
				}

				setState(1773);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1772);
					match(NEWLINE);
					}
				}

				setState(1775);
				type_name();
				setState(1777);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
				case 1:
					{
					setState(1776);
					match(NEWLINE);
					}
					break;
				}
				setState(1780);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1779);
					match(COMMENT);
					}
				}

				setState(1783);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1782);
					match(NEWLINE);
					}
				}

				setState(1785);
				match(T__0);
				setState(1787);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__51) | (1L << T__52) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)))) != 0)) {
					{
					setState(1786);
					expr();
					}
				}

				setState(1789);
				match(T__1);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public TerminalNode COMMENT() { return getToken(FunctionParser.COMMENT, 0); }
		public Unary_op_and_cast_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_op_and_cast_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterUnary_op_and_cast_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitUnary_op_and_cast_expr(this);
		}
	}

	public final Unary_op_and_cast_exprContext unary_op_and_cast_expr() throws RecognitionException {
		Unary_op_and_cast_exprContext _localctx = new Unary_op_and_cast_exprContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_unary_op_and_cast_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1793);
			unary_operator();
			setState(1795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				{
				setState(1794);
				match(NEWLINE);
				}
				break;
			}
			setState(1798);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1797);
				match(COMMENT);
				}
			}

			setState(1801);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1800);
				match(NEWLINE);
				}
			}

			setState(1803);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public TerminalNode COMMENT() { return getToken(FunctionParser.COMMENT, 0); }
		public Sizeof_operand2Context sizeof_operand2() {
			return getRuleContext(Sizeof_operand2Context.class,0);
		}
		public Sizeof_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeof_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterSizeof_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitSizeof_expression(this);
		}
	}

	public final Sizeof_expressionContext sizeof_expression() throws RecognitionException {
		Sizeof_expressionContext _localctx = new Sizeof_expressionContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_sizeof_expression);
		int _la;
		try {
			setState(1831);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1805);
				sizeof();
				setState(1807);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
				case 1:
					{
					setState(1806);
					match(NEWLINE);
					}
					break;
				}
				setState(1810);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1809);
					match(COMMENT);
					}
				}

				setState(1813);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1812);
					match(NEWLINE);
					}
				}

				setState(1815);
				match(T__0);
				setState(1816);
				sizeof_operand();
				setState(1817);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1819);
				sizeof();
				setState(1821);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
				case 1:
					{
					setState(1820);
					match(NEWLINE);
					}
					break;
				}
				setState(1824);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1823);
					match(COMMENT);
					}
				}

				setState(1827);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1826);
					match(NEWLINE);
					}
				}

				setState(1829);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterSizeof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitSizeof(this);
		}
	}

	public final SizeofContext sizeof() throws RecognitionException {
		SizeofContext _localctx = new SizeofContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_sizeof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1833);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public TerminalNode COMMENT() { return getToken(FunctionParser.COMMENT, 0); }
		public Defined_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defined_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterDefined_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitDefined_expression(this);
		}
	}

	public final Defined_expressionContext defined_expression() throws RecognitionException {
		Defined_expressionContext _localctx = new Defined_expressionContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_defined_expression);
		int _la;
		try {
			setState(1860);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,331,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1835);
				match(T__62);
				setState(1837);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
				case 1:
					{
					setState(1836);
					match(NEWLINE);
					}
					break;
				}
				setState(1840);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1839);
					match(COMMENT);
					}
				}

				setState(1843);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1842);
					match(NEWLINE);
					}
				}

				setState(1845);
				match(T__0);
				setState(1846);
				expr();
				setState(1847);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1849);
				match(T__62);
				setState(1851);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
				case 1:
					{
					setState(1850);
					match(NEWLINE);
					}
					break;
				}
				setState(1854);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1853);
					match(COMMENT);
					}
				}

				setState(1857);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1856);
					match(NEWLINE);
					}
				}

				setState(1859);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(FunctionParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(FunctionParser.COMMENT, i);
		}
		public Sizeof_operandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeof_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterSizeof_operand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitSizeof_operand(this);
		}
	}

	public final Sizeof_operandContext sizeof_operand() throws RecognitionException {
		Sizeof_operandContext _localctx = new Sizeof_operandContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_sizeof_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1862);
			type_name();
			setState(1875);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17 || _la==T__18 || _la==NEWLINE || _la==COMMENT) {
				{
				{
				setState(1864);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,332,_ctx) ) {
				case 1:
					{
					setState(1863);
					match(NEWLINE);
					}
					break;
				}
				setState(1867);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1866);
					match(COMMENT);
					}
				}

				setState(1870);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1869);
					match(NEWLINE);
					}
				}

				setState(1872);
				ptr_operator();
				}
				}
				setState(1877);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterSizeof_operand2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitSizeof_operand2(this);
		}
	}

	public final Sizeof_operand2Context sizeof_operand2() throws RecognitionException {
		Sizeof_operand2Context _localctx = new Sizeof_operand2Context(_ctx, getState());
		enterRule(_localctx, 248, RULE_sizeof_operand2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1878);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterInc_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitInc_dec(this);
		}
	}

	public final Inc_decContext inc_dec() throws RecognitionException {
		Inc_decContext _localctx = new Inc_decContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_inc_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1880);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public TerminalNode COMMENT() { return getToken(FunctionParser.COMMENT, 0); }
		public TerminalNode TEMPLATE() { return getToken(FunctionParser.TEMPLATE, 0); }
		public MemberAccessContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitMemberAccess(this);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public TerminalNode COMMENT() { return getToken(FunctionParser.COMMENT, 0); }
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public IncDecOpContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterIncDecOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitIncDecOp(this);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterArrayAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitArrayAssign(this);
		}
	}
	public static class PrimaryOnlyContext extends Postfix_expressionContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public PrimaryOnlyContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPrimaryOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPrimaryOnly(this);
		}
	}
	public static class FuncCallContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public TerminalNode COMMENT() { return getToken(FunctionParser.COMMENT, 0); }
		public FuncCallContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFuncCall(this);
		}
	}
	public static class ArrayIndexingContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public TerminalNode COMMENT() { return getToken(FunctionParser.COMMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayIndexingContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterArrayIndexing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitArrayIndexing(this);
		}
	}
	public static class PtrMemberAccessContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public TerminalNode COMMENT() { return getToken(FunctionParser.COMMENT, 0); }
		public TerminalNode TEMPLATE() { return getToken(FunctionParser.TEMPLATE, 0); }
		public PtrMemberAccessContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPtrMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPtrMemberAccess(this);
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
		int _startState = 252;
		enterRecursionRule(_localctx, 252, RULE_postfix_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,342,_ctx) ) {
			case 1:
				{
				_localctx = new ArrayAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1884);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (STATIC - 80)) | (1L << (VOID - 80)) | (1L << (UNSIGNED - 80)) | (1L << (SIGNED - 80)) | (1L << (CV_QUALIFIER - 80)) | (1L << (EXTERN - 80)) | (1L << (VIRTUAL - 80)) | (1L << (SPECIAL_DATA - 80)) | (1L << (OPERATOR - 80)) | (1L << (CLASS_KEY - 80)) | (1L << (NEW - 80)) | (1L << (PRE_PRAGMA_KEYWORDS - 80)) | (1L << (END_TEST - 80)) | (1L << (ALPHA_NUMERIC - 80)))) != 0)) {
					{
					setState(1883);
					type_name();
					}
				}

				setState(1886);
				initializer_expression();
				}
				break;
			case 2:
				{
				_localctx = new PrimaryOnlyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1887);
				primary_expression();
				}
				break;
			case 3:
				{
				_localctx = new IncDecOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1889);
				_la = _input.LA(1);
				if (_la==T__17 || _la==T__18) {
					{
					setState(1888);
					ptr_operator();
					}
				}

				setState(1891);
				inc_dec();
				setState(1893);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,338,_ctx) ) {
				case 1:
					{
					setState(1892);
					match(NEWLINE);
					}
					break;
				}
				setState(1896);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1895);
					match(COMMENT);
					}
				}

				setState(1899);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1898);
					match(NEWLINE);
					}
				}

				setState(1902);
				_la = _input.LA(1);
				if (_la==T__17 || _la==T__18) {
					{
					setState(1901);
					ptr_operator();
					}
				}

				setState(1904);
				primary_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1980);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,362,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1978);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,361,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayIndexingContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1908);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1910);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
						case 1:
							{
							setState(1909);
							match(NEWLINE);
							}
							break;
						}
						setState(1913);
						_la = _input.LA(1);
						if (_la==COMMENT) {
							{
							setState(1912);
							match(COMMENT);
							}
						}

						setState(1916);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(1915);
							match(NEWLINE);
							}
						}

						setState(1918);
						match(T__28);
						setState(1920);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__51) | (1L << T__52) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)))) != 0)) {
							{
							setState(1919);
							expr();
							}
						}

						setState(1922);
						match(T__29);
						}
						break;
					case 2:
						{
						_localctx = new FuncCallContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1923);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1925);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,347,_ctx) ) {
						case 1:
							{
							setState(1924);
							match(NEWLINE);
							}
							break;
						}
						setState(1928);
						_la = _input.LA(1);
						if (_la==COMMENT) {
							{
							setState(1927);
							match(COMMENT);
							}
						}

						setState(1931);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(1930);
							match(NEWLINE);
							}
						}

						setState(1933);
						match(T__0);
						setState(1934);
						argument_list();
						setState(1935);
						match(T__1);
						}
						break;
					case 3:
						{
						_localctx = new MemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1937);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1938);
						match(T__63);
						setState(1940);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,350,_ctx) ) {
						case 1:
							{
							setState(1939);
							match(NEWLINE);
							}
							break;
						}
						setState(1943);
						_la = _input.LA(1);
						if (_la==COMMENT) {
							{
							setState(1942);
							match(COMMENT);
							}
						}

						setState(1946);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(1945);
							match(NEWLINE);
							}
						}

						setState(1949);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(1948);
							match(TEMPLATE);
							}
						}

						{
						setState(1951);
						identifier();
						}
						}
						break;
					case 4:
						{
						_localctx = new PtrMemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1952);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1953);
						match(T__54);
						setState(1955);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,354,_ctx) ) {
						case 1:
							{
							setState(1954);
							match(NEWLINE);
							}
							break;
						}
						setState(1958);
						_la = _input.LA(1);
						if (_la==COMMENT) {
							{
							setState(1957);
							match(COMMENT);
							}
						}

						setState(1961);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(1960);
							match(NEWLINE);
							}
						}

						setState(1964);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(1963);
							match(TEMPLATE);
							}
						}

						{
						setState(1966);
						identifier();
						}
						}
						break;
					case 5:
						{
						_localctx = new IncDecOpContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1967);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1969);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,358,_ctx) ) {
						case 1:
							{
							setState(1968);
							match(NEWLINE);
							}
							break;
						}
						setState(1972);
						_la = _input.LA(1);
						if (_la==COMMENT) {
							{
							setState(1971);
							match(COMMENT);
							}
						}

						setState(1975);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(1974);
							match(NEWLINE);
							}
						}

						setState(1977);
						inc_dec();
						}
						break;
					}
					} 
				}
				setState(1982);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,362,_ctx);
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
		public TerminalNode OPENING_CURLY() { return getToken(FunctionParser.OPENING_CURLY, 0); }
		public TerminalNode CLOSING_CURLY() { return getToken(FunctionParser.CLOSING_CURLY, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(FunctionParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(FunctionParser.COMMENT, i);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterInitializer_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitInitializer_expression(this);
		}
	}

	public final Initializer_expressionContext initializer_expression() throws RecognitionException {
		Initializer_expressionContext _localctx = new Initializer_expressionContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_initializer_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1983);
			match(OPENING_CURLY);
			setState(1985);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,363,_ctx) ) {
			case 1:
				{
				setState(1984);
				match(NEWLINE);
				}
				break;
			}
			setState(1993);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,365,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1987);
					match(COMMENT);
					setState(1989);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,364,_ctx) ) {
					case 1:
						{
						setState(1988);
						match(NEWLINE);
						}
						break;
					}
					}
					} 
				}
				setState(1995);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,365,_ctx);
			}
			setState(1997);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,366,_ctx) ) {
			case 1:
				{
				setState(1996);
				argument_list();
				}
				break;
			}
			setState(2000);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1999);
				match(NEWLINE);
				}
			}

			setState(2008);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(2002);
				match(COMMENT);
				setState(2004);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(2003);
					match(NEWLINE);
					}
				}

				}
				}
				setState(2010);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2011);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(FunctionParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(FunctionParser.COMMENT, i);
		}
		public TerminalNode VOID() { return getToken(FunctionParser.VOID, 0); }
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitArgument_list(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_argument_list);
		int _la;
		try {
			int _alt;
			setState(2059);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,383,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2023);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,373,_ctx) ) {
				case 1:
					{
					setState(2014);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,370,_ctx) ) {
					case 1:
						{
						setState(2013);
						match(NEWLINE);
						}
						break;
					}
					setState(2017);
					_la = _input.LA(1);
					if (_la==COMMENT) {
						{
						setState(2016);
						match(COMMENT);
						}
					}

					setState(2020);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(2019);
						match(NEWLINE);
						}
					}

					setState(2022);
					argument();
					}
					break;
				}
				setState(2026);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,374,_ctx) ) {
				case 1:
					{
					setState(2025);
					match(NEWLINE);
					}
					break;
				}
				setState(2029);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,375,_ctx) ) {
				case 1:
					{
					setState(2028);
					match(COMMENT);
					}
					break;
				}
				setState(2032);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,376,_ctx) ) {
				case 1:
					{
					setState(2031);
					match(NEWLINE);
					}
					break;
				}
				setState(2052);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,381,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2035);
						_la = _input.LA(1);
						if (_la==T__12) {
							{
							setState(2034);
							match(T__12);
							}
						}

						setState(2038);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(2037);
							match(NEWLINE);
							}
						}

						setState(2046);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMENT) {
							{
							{
							setState(2040);
							match(COMMENT);
							setState(2042);
							_la = _input.LA(1);
							if (_la==NEWLINE) {
								{
								setState(2041);
								match(NEWLINE);
								}
							}

							}
							}
							setState(2048);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2049);
						argument();
						}
						} 
					}
					setState(2054);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,381,_ctx);
				}
				setState(2056);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(2055);
					match(T__12);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2058);
				match(VOID);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2061);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPrimary_expression(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_primary_expression);
		int _la;
		try {
			setState(2072);
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
				setState(2064);
				_la = _input.LA(1);
				if (_la==T__63) {
					{
					setState(2063);
					match(T__63);
					}
				}

				setState(2066);
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
				setState(2067);
				constant();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(2068);
				match(T__0);
				setState(2069);
				expr();
				setState(2070);
				match(T__1);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNull_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNull_expression(this);
		}
	}

	public final Null_expressionContext null_expression() throws RecognitionException {
		Null_expressionContext _localctx = new Null_expressionContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_null_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2074);
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

	public static class Init_declaratorContext extends ParserRuleContext {
		public Init_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator; }
	 
		public Init_declaratorContext() { }
		public void copyFrom(Init_declaratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InitDeclWithAssignContext extends Init_declaratorContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public InitDeclWithAssignContext(Init_declaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterInitDeclWithAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitInitDeclWithAssign(this);
		}
	}
	public static class InitDeclSimpleContext extends Init_declaratorContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitDeclSimpleContext(Init_declaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterInitDeclSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitInitDeclSimple(this);
		}
	}
	public static class InitDeclWithCallContext extends Init_declaratorContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InitDeclWithCallContext(Init_declaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterInitDeclWithCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitInitDeclWithCall(this);
		}
	}

	public final Init_declaratorContext init_declarator() throws RecognitionException {
		Init_declaratorContext _localctx = new Init_declaratorContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_init_declarator);
		int _la;
		try {
			setState(2094);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,389,_ctx) ) {
			case 1:
				_localctx = new InitDeclWithCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2076);
				declarator();
				setState(2077);
				match(T__0);
				setState(2079);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__51) | (1L << T__52) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)))) != 0)) {
					{
					setState(2078);
					expr();
					}
				}

				setState(2081);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new InitDeclWithAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2083);
				declarator();
				setState(2085);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(2084);
					match(NEWLINE);
					}
				}

				setState(2087);
				match(T__34);
				setState(2089);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(2088);
					match(NEWLINE);
					}
				}

				setState(2091);
				argument();
				}
				break;
			case 3:
				_localctx = new InitDeclSimpleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2093);
				declarator();
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitDeclarator(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2097);
			_la = _input.LA(1);
			if (_la==T__17 || _la==T__18) {
				{
				setState(2096);
				ptrs();
				}
			}

			setState(2099);
			identifier();
			setState(2101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,391,_ctx) ) {
			case 1:
				{
				setState(2100);
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
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterType_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitType_suffix(this);
		}
	}

	public final Type_suffixContext type_suffix() throws RecognitionException {
		Type_suffixContext _localctx = new Type_suffixContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_type_suffix);
		int _la;
		try {
			setState(2109);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2103);
				match(T__28);
				setState(2105);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__51) | (1L << T__52) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)))) != 0)) {
					{
					setState(2104);
					conditional_expression();
					}
				}

				setState(2107);
				match(T__29);
				}
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(2108);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 126:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0081\u0842\4\2\t"+
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
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\3\2\7\2\u0112"+
		"\n\2\f\2\16\2\u0115\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3\u0123\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u0130"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7\u0142\n\7\3\7\5\7\u0145\n\7\3\7\5\7\u0148\n\7\3\7\3\7\5\7\u014c\n\7"+
		"\3\7\5\7\u014f\n\7\3\7\3\7\5\7\u0153\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u015b"+
		"\n\7\5\7\u015d\n\7\3\b\3\b\3\b\3\b\5\b\u0163\n\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u016f\n\t\3\t\3\t\3\t\5\t\u0174\n\t\3\t\5\t\u0177"+
		"\n\t\3\n\5\n\u017a\n\n\3\n\3\n\3\n\3\n\5\n\u0180\n\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\5\13\u0188\n\13\3\f\3\f\3\r\3\r\5\r\u018e\n\r\3\16\3\16\3\16"+
		"\3\16\5\16\u0194\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u01a8\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u01b3\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u01bb\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u01c5"+
		"\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u01ce\n\27\5\27\u01d0\n"+
		"\27\3\30\3\30\3\31\3\31\5\31\u01d6\n\31\3\31\3\31\3\31\5\31\u01db\n\31"+
		"\7\31\u01dd\n\31\f\31\16\31\u01e0\13\31\3\32\3\32\5\32\u01e4\n\32\3\33"+
		"\3\33\3\33\3\33\5\33\u01ea\n\33\3\33\5\33\u01ed\n\33\3\33\3\33\5\33\u01f1"+
		"\n\33\3\33\3\33\5\33\u01f5\n\33\7\33\u01f7\n\33\f\33\16\33\u01fa\13\33"+
		"\3\33\5\33\u01fd\n\33\3\33\5\33\u0200\n\33\3\33\3\33\3\34\3\34\3\34\5"+
		"\34\u0207\n\34\3\35\3\35\5\35\u020b\n\35\3\35\3\35\3\35\3\35\5\35\u0211"+
		"\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u021b\n\35\3\35\5\35"+
		"\u021e\n\35\3\36\3\36\3\36\7\36\u0223\n\36\f\36\16\36\u0226\13\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\7\37\u022e\n\37\f\37\16\37\u0231\13\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u0238\n\37\3\37\3\37\7\37\u023c\n\37\f\37\16"+
		"\37\u023f\13\37\3\37\3\37\3\37\5\37\u0244\n\37\3 \3 \3 \3 \3 \5 \u024b"+
		"\n \3!\3!\3!\3!\3!\5!\u0252\n!\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\5$\u0266\n$\3%\3%\5%\u026a\n%\3%\3%\3%\3%\3%\5%\u0271"+
		"\n%\3%\3%\7%\u0275\n%\f%\16%\u0278\13%\3%\3%\5%\u027c\n%\3&\3&\3\'\3\'"+
		"\3(\3(\3)\3)\3*\3*\3*\3*\3*\7*\u028b\n*\f*\16*\u028e\13*\3*\7*\u0291\n"+
		"*\f*\16*\u0294\13*\3*\7*\u0297\n*\f*\16*\u029a\13*\6*\u029c\n*\r*\16*"+
		"\u029d\3*\3*\5*\u02a2\n*\3+\3+\3,\3,\3-\3-\3.\3.\3.\5.\u02ad\n.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u02d7\n.\3/\3/\3\60\3"+
		"\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\6\62\u02eb\n\62\r\62\16\62\u02ec\3\63\3\63\3\64\3\64\3\65\3\65\3\66"+
		"\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3>\3>\5>\u0309"+
		"\n>\3?\3?\3?\6?\u030e\n?\r?\16?\u030f\3@\3@\3@\5@\u0315\n@\3A\3A\5A\u0319"+
		"\nA\3A\5A\u031c\nA\3A\5A\u031f\nA\3A\3A\5A\u0323\nA\3A\3A\3B\3B\3B\3B"+
		"\3B\3C\3C\3D\5D\u032f\nD\3D\5D\u0332\nD\3D\3D\5D\u0336\nD\5D\u0338\nD"+
		"\3D\3D\5D\u033c\nD\3D\3D\5D\u0340\nD\3D\5D\u0343\nD\3D\3D\3D\3D\5D\u0349"+
		"\nD\3D\3D\5D\u034d\nD\3E\3E\5E\u0351\nE\7E\u0353\nE\fE\16E\u0356\13E\3"+
		"E\3E\3E\3E\5E\u035c\nE\7E\u035e\nE\fE\16E\u0361\13E\3E\3E\5E\u0365\nE"+
		"\5E\u0367\nE\3F\3F\5F\u036b\nF\3F\3F\5F\u036f\nF\3F\3F\5F\u0373\nF\7F"+
		"\u0375\nF\fF\16F\u0378\13F\3F\5F\u037b\nF\3G\3G\3G\5G\u0380\nG\3G\7G\u0383"+
		"\nG\fG\16G\u0386\13G\3G\3G\5G\u038a\nG\3G\5G\u038d\nG\3H\3H\3H\3H\5H\u0393"+
		"\nH\3I\5I\u0396\nI\3I\3I\3I\3I\3I\5I\u039d\nI\3I\5I\u03a0\nI\3J\3J\3J"+
		"\3K\3K\3K\3K\7K\u03a9\nK\fK\16K\u03ac\13K\3L\3L\3L\3M\5M\u03b2\nM\3M\3"+
		"M\3N\3N\5N\u03b8\nN\3N\3N\3O\3O\3O\3O\3O\3O\3O\5O\u03c3\nO\3P\3P\3P\3"+
		"P\3P\3Q\7Q\u03cb\nQ\fQ\16Q\u03ce\13Q\3Q\3Q\3Q\3Q\7Q\u03d4\nQ\fQ\16Q\u03d7"+
		"\13Q\7Q\u03d9\nQ\fQ\16Q\u03dc\13Q\3R\3R\3S\5S\u03e1\nS\3S\3S\5S\u03e5"+
		"\nS\3S\3S\5S\u03e9\nS\5S\u03eb\nS\3S\5S\u03ee\nS\3S\3S\3S\3S\3S\5S\u03f5"+
		"\nS\5S\u03f7\nS\3S\3S\3S\5S\u03fc\nS\3S\3S\3S\3S\3S\5S\u0403\nS\3S\5S"+
		"\u0406\nS\3S\3S\5S\u040a\nS\3S\5S\u040d\nS\3S\3S\3S\3S\5S\u0413\nS\5S"+
		"\u0415\nS\3S\3S\5S\u0419\nS\5S\u041b\nS\3S\3S\5S\u041f\nS\5S\u0421\nS"+
		"\3S\3S\5S\u0425\nS\3S\5S\u0428\nS\3S\5S\u042b\nS\5S\u042d\nS\3T\6T\u0430"+
		"\nT\rT\16T\u0431\3U\3U\5U\u0436\nU\3U\5U\u0439\nU\3U\3U\5U\u043d\nU\5"+
		"U\u043f\nU\3U\5U\u0442\nU\3U\3U\3U\3U\5U\u0448\nU\3U\5U\u044b\nU\3U\3"+
		"U\5U\u044f\nU\3U\5U\u0452\nU\3U\3U\5U\u0456\nU\3U\3U\3U\3U\3U\5U\u045d"+
		"\nU\3U\5U\u0460\nU\3U\5U\u0463\nU\3V\3V\5V\u0467\nV\3V\3V\5V\u046b\nV"+
		"\3V\7V\u046e\nV\fV\16V\u0471\13V\3V\5V\u0474\nV\3V\5V\u0477\nV\3V\3V\3"+
		"W\3W\5W\u047d\nW\3W\5W\u0480\nW\3W\5W\u0483\nW\3W\3W\3W\3X\3X\3Y\3Y\3"+
		"Y\3Y\7Y\u048e\nY\fY\16Y\u0491\13Y\3Z\3Z\5Z\u0495\nZ\5Z\u0497\nZ\3Z\5Z"+
		"\u049a\nZ\3Z\3Z\3[\3[\5[\u04a0\n[\5[\u04a2\n[\3[\3[\3[\5[\u04a7\n[\3["+
		"\3[\5[\u04ab\n[\3[\3[\5[\u04af\n[\3[\3[\6[\u04b3\n[\r[\16[\u04b4\3[\3"+
		"[\3[\3[\5[\u04bb\n[\3[\3[\3[\3[\3[\3[\5[\u04c3\n[\7[\u04c5\n[\f[\16[\u04c8"+
		"\13[\3[\3[\3[\5[\u04cd\n[\3[\3[\5[\u04d1\n[\3[\3[\5[\u04d5\n[\3[\7[\u04d8"+
		"\n[\f[\16[\u04db\13[\3[\5[\u04de\n[\3\\\3\\\5\\\u04e2\n\\\3\\\3\\\5\\"+
		"\u04e6\n\\\3\\\3\\\5\\\u04ea\n\\\3\\\3\\\5\\\u04ee\n\\\3\\\3\\\5\\\u04f2"+
		"\n\\\3\\\3\\\5\\\u04f6\n\\\3\\\3\\\5\\\u04fa\n\\\6\\\u04fc\n\\\r\\\16"+
		"\\\u04fd\3]\3]\5]\u0502\n]\3]\3]\5]\u0506\n]\5]\u0508\n]\3]\3]\3^\3^\5"+
		"^\u050e\n^\3_\3_\3_\3_\3_\3_\3_\5_\u0517\n_\3_\7_\u051a\n_\f_\16_\u051d"+
		"\13_\5_\u051f\n_\3_\5_\u0522\n_\3`\3`\5`\u0526\n`\3`\3`\3`\5`\u052b\n"+
		"`\3a\5a\u052e\na\3a\3a\3a\3a\3a\5a\u0535\na\5a\u0537\na\3a\5a\u053a\n"+
		"a\3b\3b\3b\7b\u053f\nb\fb\16b\u0542\13b\3b\3b\3b\5b\u0547\nb\3c\3c\3d"+
		"\3d\5d\u054d\nd\6d\u054f\nd\rd\16d\u0550\3e\3e\3f\3f\3f\7f\u0558\nf\f"+
		"f\16f\u055b\13f\3f\5f\u055e\nf\3f\5f\u0561\nf\3f\5f\u0564\nf\3f\3f\5f"+
		"\u0568\nf\3f\5f\u056b\nf\3f\5f\u056e\nf\3f\5f\u0571\nf\3f\3f\7f\u0575"+
		"\nf\ff\16f\u0578\13f\3g\3g\5g\u057c\ng\3g\5g\u057f\ng\3g\5g\u0582\ng\3"+
		"g\3g\5g\u0586\ng\3g\5g\u0589\ng\3g\5g\u058c\ng\3g\3g\5g\u0590\ng\3h\3"+
		"h\3h\5h\u0595\nh\3h\5h\u0598\nh\3h\5h\u059b\nh\3h\3h\5h\u059f\nh\3h\5"+
		"h\u05a2\nh\3h\5h\u05a5\nh\3h\3h\5h\u05a9\nh\3h\5h\u05ac\nh\3h\5h\u05af"+
		"\nh\3h\3h\5h\u05b3\nh\3h\5h\u05b6\nh\3h\5h\u05b9\nh\3h\3h\5h\u05bd\nh"+
		"\3i\3i\5i\u05c1\ni\3i\5i\u05c4\ni\3i\5i\u05c7\ni\3i\3i\5i\u05cb\ni\3i"+
		"\5i\u05ce\ni\3i\5i\u05d1\ni\3i\5i\u05d4\ni\3j\3j\5j\u05d8\nj\3j\5j\u05db"+
		"\nj\3j\5j\u05de\nj\3j\3j\5j\u05e2\nj\3j\5j\u05e5\nj\3j\5j\u05e8\nj\3j"+
		"\5j\u05eb\nj\3k\3k\5k\u05ef\nk\3k\5k\u05f2\nk\3k\5k\u05f5\nk\3k\3k\5k"+
		"\u05f9\nk\3k\5k\u05fc\nk\3k\5k\u05ff\nk\3k\5k\u0602\nk\3l\3l\5l\u0606"+
		"\nl\3l\5l\u0609\nl\3l\5l\u060c\nl\3l\3l\5l\u0610\nl\3l\5l\u0613\nl\3l"+
		"\5l\u0616\nl\3l\5l\u0619\nl\3m\3m\5m\u061d\nm\3m\5m\u0620\nm\3m\5m\u0623"+
		"\nm\3m\3m\5m\u0627\nm\3m\5m\u062a\nm\3m\5m\u062d\nm\3m\5m\u0630\nm\3n"+
		"\3n\5n\u0634\nn\3n\5n\u0637\nn\3n\5n\u063a\nn\3n\3n\5n\u063e\nn\3n\5n"+
		"\u0641\nn\3n\5n\u0644\nn\3n\3n\5n\u0648\nn\3o\3o\5o\u064c\no\3o\5o\u064f"+
		"\no\3o\5o\u0652\no\3o\3o\5o\u0656\no\3o\5o\u0659\no\3o\5o\u065c\no\3o"+
		"\3o\5o\u0660\no\3p\3p\5p\u0664\np\3p\5p\u0667\np\3p\5p\u066a\np\3p\3p"+
		"\5p\u066e\np\3p\5p\u0671\np\3p\5p\u0674\np\3p\5p\u0677\np\3q\3q\5q\u067b"+
		"\nq\3q\5q\u067e\nq\3q\5q\u0681\nq\3q\3q\5q\u0685\nq\3q\5q\u0688\nq\3q"+
		"\5q\u068b\nq\3q\5q\u068e\nq\3r\3r\5r\u0692\nr\3r\5r\u0695\nr\3r\5r\u0698"+
		"\nr\3r\3r\5r\u069c\nr\3r\5r\u069f\nr\3r\5r\u06a2\nr\3r\5r\u06a5\nr\3s"+
		"\3s\3s\3s\3s\3s\3s\3s\3s\5s\u06b0\ns\3t\3t\3t\3t\3t\3t\5t\u06b8\nt\3u"+
		"\3u\3v\3v\3v\3v\3v\3v\3v\5v\u06c3\nv\3w\3w\3w\3x\5x\u06c9\nx\3x\3x\5x"+
		"\u06cd\nx\3x\5x\u06d0\nx\3x\5x\u06d3\nx\3x\3x\5x\u06d7\nx\3x\5x\u06da"+
		"\nx\3x\5x\u06dd\nx\3x\3x\5x\u06e1\nx\3x\3x\3x\5x\u06e6\nx\3x\3x\5x\u06ea"+
		"\nx\3x\5x\u06ed\nx\3x\5x\u06f0\nx\3x\3x\5x\u06f4\nx\3x\5x\u06f7\nx\3x"+
		"\5x\u06fa\nx\3x\3x\5x\u06fe\nx\3x\3x\5x\u0702\nx\3y\3y\5y\u0706\ny\3y"+
		"\5y\u0709\ny\3y\5y\u070c\ny\3y\3y\3z\3z\5z\u0712\nz\3z\5z\u0715\nz\3z"+
		"\5z\u0718\nz\3z\3z\3z\3z\3z\3z\5z\u0720\nz\3z\5z\u0723\nz\3z\5z\u0726"+
		"\nz\3z\3z\5z\u072a\nz\3{\3{\3|\3|\5|\u0730\n|\3|\5|\u0733\n|\3|\5|\u0736"+
		"\n|\3|\3|\3|\3|\3|\3|\5|\u073e\n|\3|\5|\u0741\n|\3|\5|\u0744\n|\3|\5|"+
		"\u0747\n|\3}\3}\5}\u074b\n}\3}\5}\u074e\n}\3}\5}\u0751\n}\3}\7}\u0754"+
		"\n}\f}\16}\u0757\13}\3~\3~\3\177\3\177\3\u0080\3\u0080\5\u0080\u075f\n"+
		"\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u0764\n\u0080\3\u0080\3\u0080\5"+
		"\u0080\u0768\n\u0080\3\u0080\5\u0080\u076b\n\u0080\3\u0080\5\u0080\u076e"+
		"\n\u0080\3\u0080\5\u0080\u0771\n\u0080\3\u0080\3\u0080\5\u0080\u0775\n"+
		"\u0080\3\u0080\3\u0080\5\u0080\u0779\n\u0080\3\u0080\5\u0080\u077c\n\u0080"+
		"\3\u0080\5\u0080\u077f\n\u0080\3\u0080\3\u0080\5\u0080\u0783\n\u0080\3"+
		"\u0080\3\u0080\3\u0080\5\u0080\u0788\n\u0080\3\u0080\5\u0080\u078b\n\u0080"+
		"\3\u0080\5\u0080\u078e\n\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\5\u0080\u0797\n\u0080\3\u0080\5\u0080\u079a\n\u0080\3"+
		"\u0080\5\u0080\u079d\n\u0080\3\u0080\5\u0080\u07a0\n\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\5\u0080\u07a6\n\u0080\3\u0080\5\u0080\u07a9\n\u0080\3"+
		"\u0080\5\u0080\u07ac\n\u0080\3\u0080\5\u0080\u07af\n\u0080\3\u0080\3\u0080"+
		"\3\u0080\5\u0080\u07b4\n\u0080\3\u0080\5\u0080\u07b7\n\u0080\3\u0080\5"+
		"\u0080\u07ba\n\u0080\3\u0080\7\u0080\u07bd\n\u0080\f\u0080\16\u0080\u07c0"+
		"\13\u0080\3\u0081\3\u0081\5\u0081\u07c4\n\u0081\3\u0081\3\u0081\5\u0081"+
		"\u07c8\n\u0081\7\u0081\u07ca\n\u0081\f\u0081\16\u0081\u07cd\13\u0081\3"+
		"\u0081\5\u0081\u07d0\n\u0081\3\u0081\5\u0081\u07d3\n\u0081\3\u0081\3\u0081"+
		"\5\u0081\u07d7\n\u0081\7\u0081\u07d9\n\u0081\f\u0081\16\u0081\u07dc\13"+
		"\u0081\3\u0081\3\u0081\3\u0082\5\u0082\u07e1\n\u0082\3\u0082\5\u0082\u07e4"+
		"\n\u0082\3\u0082\5\u0082\u07e7\n\u0082\3\u0082\5\u0082\u07ea\n\u0082\3"+
		"\u0082\5\u0082\u07ed\n\u0082\3\u0082\5\u0082\u07f0\n\u0082\3\u0082\5\u0082"+
		"\u07f3\n\u0082\3\u0082\5\u0082\u07f6\n\u0082\3\u0082\5\u0082\u07f9\n\u0082"+
		"\3\u0082\3\u0082\5\u0082\u07fd\n\u0082\7\u0082\u07ff\n\u0082\f\u0082\16"+
		"\u0082\u0802\13\u0082\3\u0082\7\u0082\u0805\n\u0082\f\u0082\16\u0082\u0808"+
		"\13\u0082\3\u0082\5\u0082\u080b\n\u0082\3\u0082\5\u0082\u080e\n\u0082"+
		"\3\u0083\3\u0083\3\u0084\5\u0084\u0813\n\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\5\u0084\u081b\n\u0084\3\u0085\3\u0085\3\u0086"+
		"\3\u0086\3\u0086\5\u0086\u0822\n\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\5\u0086\u0828\n\u0086\3\u0086\3\u0086\5\u0086\u082c\n\u0086\3\u0086\3"+
		"\u0086\3\u0086\5\u0086\u0831\n\u0086\3\u0087\5\u0087\u0834\n\u0087\3\u0087"+
		"\3\u0087\5\u0087\u0838\n\u0087\3\u0088\3\u0088\5\u0088\u083c\n\u0088\3"+
		"\u0088\3\u0088\5\u0088\u0840\n\u0088\3\u0088\2\3\u00fe\u0089\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\2\31\b\2\b\16RRTUXXaacc\3\2\24\31\3\2\32\35\5\2\b\n"+
		"RRXX\3\2\24\25\3\2\13\r\4\2\36\36dd\4\2%-\60\61\3\2\62\63\3\2\3\4\5\2"+
		"\3\4\37 wx\3\2\3\5\4\2\3\4\32\33\3\2wx\3\2\37 \4\2\5\5\37 \4\2\5\5\17"+
		"\17\6\2\3\5\17\17\37 wx\3\2y{\3\2./\3\2\26\27\4\2\25\25!\"\3\2\66\67\u09bd"+
		"\2\u0113\3\2\2\2\4\u0122\3\2\2\2\6\u0124\3\2\2\2\b\u0126\3\2\2\2\n\u0128"+
		"\3\2\2\2\f\u015c\3\2\2\2\16\u0162\3\2\2\2\20\u0176\3\2\2\2\22\u0179\3"+
		"\2\2\2\24\u0187\3\2\2\2\26\u0189\3\2\2\2\30\u018d\3\2\2\2\32\u0193\3\2"+
		"\2\2\34\u0195\3\2\2\2\36\u0199\3\2\2\2 \u019d\3\2\2\2\"\u019f\3\2\2\2"+
		"$\u01a7\3\2\2\2&\u01b2\3\2\2\2(\u01ba\3\2\2\2*\u01bc\3\2\2\2,\u01cf\3"+
		"\2\2\2.\u01d1\3\2\2\2\60\u01d5\3\2\2\2\62\u01e3\3\2\2\2\64\u01e5\3\2\2"+
		"\2\66\u0206\3\2\2\28\u021d\3\2\2\2:\u021f\3\2\2\2<\u0243\3\2\2\2>\u024a"+
		"\3\2\2\2@\u0251\3\2\2\2B\u0253\3\2\2\2D\u0255\3\2\2\2F\u0265\3\2\2\2H"+
		"\u027b\3\2\2\2J\u027d\3\2\2\2L\u027f\3\2\2\2N\u0281\3\2\2\2P\u0283\3\2"+
		"\2\2R\u02a1\3\2\2\2T\u02a3\3\2\2\2V\u02a5\3\2\2\2X\u02a7\3\2\2\2Z\u02d6"+
		"\3\2\2\2\\\u02d8\3\2\2\2^\u02da\3\2\2\2`\u02dc\3\2\2\2b\u02ea\3\2\2\2"+
		"d\u02ee\3\2\2\2f\u02f0\3\2\2\2h\u02f2\3\2\2\2j\u02f4\3\2\2\2l\u02f6\3"+
		"\2\2\2n\u02f8\3\2\2\2p\u02fa\3\2\2\2r\u02fc\3\2\2\2t\u02fe\3\2\2\2v\u0300"+
		"\3\2\2\2x\u0302\3\2\2\2z\u0308\3\2\2\2|\u030d\3\2\2\2~\u0311\3\2\2\2\u0080"+
		"\u0316\3\2\2\2\u0082\u0326\3\2\2\2\u0084\u032b\3\2\2\2\u0086\u034c\3\2"+
		"\2\2\u0088\u0366\3\2\2\2\u008a\u0368\3\2\2\2\u008c\u037c\3\2\2\2\u008e"+
		"\u0392\3\2\2\2\u0090\u0395\3\2\2\2\u0092\u03a1\3\2\2\2\u0094\u03a4\3\2"+
		"\2\2\u0096\u03ad\3\2\2\2\u0098\u03b1\3\2\2\2\u009a\u03b5\3\2\2\2\u009c"+
		"\u03c2\3\2\2\2\u009e\u03c4\3\2\2\2\u00a0\u03cc\3\2\2\2\u00a2\u03dd\3\2"+
		"\2\2\u00a4\u042c\3\2\2\2\u00a6\u042f\3\2\2\2\u00a8\u0462\3\2\2\2\u00aa"+
		"\u0464\3\2\2\2\u00ac\u047a\3\2\2\2\u00ae\u0487\3\2\2\2\u00b0\u0489\3\2"+
		"\2\2\u00b2\u0496\3\2\2\2\u00b4\u04dd\3\2\2\2\u00b6\u04fb\3\2\2\2\u00b8"+
		"\u0507\3\2\2\2\u00ba\u050b\3\2\2\2\u00bc\u0521\3\2\2\2\u00be\u052a\3\2"+
		"\2\2\u00c0\u052d\3\2\2\2\u00c2\u0546\3\2\2\2\u00c4\u0548\3\2\2\2\u00c6"+
		"\u054e\3\2\2\2\u00c8\u0552\3\2\2\2\u00ca\u0554\3\2\2\2\u00cc\u0579\3\2"+
		"\2\2\u00ce\u05bc\3\2\2\2\u00d0\u05be\3\2\2\2\u00d2\u05d5\3\2\2\2\u00d4"+
		"\u05ec\3\2\2\2\u00d6\u0603\3\2\2\2\u00d8\u061a\3\2\2\2\u00da\u0631\3\2"+
		"\2\2\u00dc\u0649\3\2\2\2\u00de\u0661\3\2\2\2\u00e0\u0678\3\2\2\2\u00e2"+
		"\u068f\3\2\2\2\u00e4\u06af\3\2\2\2\u00e6\u06b7\3\2\2\2\u00e8\u06b9\3\2"+
		"\2\2\u00ea\u06c2\3\2\2\2\u00ec\u06c4\3\2\2\2\u00ee\u0701\3\2\2\2\u00f0"+
		"\u0703\3\2\2\2\u00f2\u0729\3\2\2\2\u00f4\u072b\3\2\2\2\u00f6\u0746\3\2"+
		"\2\2\u00f8\u0748\3\2\2\2\u00fa\u0758\3\2\2\2\u00fc\u075a\3\2\2\2\u00fe"+
		"\u0774\3\2\2\2\u0100\u07c1\3\2\2\2\u0102\u080d\3\2\2\2\u0104\u080f\3\2"+
		"\2\2\u0106\u081a\3\2\2\2\u0108\u081c\3\2\2\2\u010a\u0830\3\2\2\2\u010c"+
		"\u0833\3\2\2\2\u010e\u083f\3\2\2\2\u0110\u0112\5\4\3\2\u0111\u0110\3\2"+
		"\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\3\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0123\5\6\4\2\u0117\u0123\5\b\5\2"+
		"\u0118\u0123\5\n\6\2\u0119\u0123\5\20\t\2\u011a\u0123\5\22\n\2\u011b\u0123"+
		"\5\u00a2R\2\u011c\u0123\5\24\13\2\u011d\u0123\5\30\r\2\u011e\u0123\5J"+
		"&\2\u011f\u0123\5L\'\2\u0120\u0123\5z>\2\u0121\u0123\5x=\2\u0122\u0116"+
		"\3\2\2\2\u0122\u0117\3\2\2\2\u0122\u0118\3\2\2\2\u0122\u0119\3\2\2\2\u0122"+
		"\u011a\3\2\2\2\u0122\u011b\3\2\2\2\u0122\u011c\3\2\2\2\u0122\u011d\3\2"+
		"\2\2\u0122\u011e\3\2\2\2\u0122\u011f\3\2\2\2\u0122\u0120\3\2\2\2\u0122"+
		"\u0121\3\2\2\2\u0123\5\3\2\2\2\u0124\u0125\7w\2\2\u0125\7\3\2\2\2\u0126"+
		"\u0127\7x\2\2\u0127\t\3\2\2\2\u0128\u0129\5\f\7\2\u0129\13\3\2\2\2\u012a"+
		"\u015d\7Y\2\2\u012b\u012c\7Z\2\2\u012c\u012f\7\3\2\2\u012d\u0130\5\u00be"+
		"`\2\u012e\u0130\7E\2\2\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\u015d\7\4\2\2\u0132\u0133\7F\2\2\u0133\u0134\7\3\2\2\u0134"+
		"\u0135\5\26\f\2\u0135\u0136\7\4\2\2\u0136\u015d\3\2\2\2\u0137\u015d\7"+
		"G\2\2\u0138\u0139\7M\2\2\u0139\u013a\7\3\2\2\u013a\u013b\5\26\f\2\u013b"+
		"\u013c\7\4\2\2\u013c\u015d\3\2\2\2\u013d\u013e\7H\2\2\u013e\u0141\7\3"+
		"\2\2\u013f\u0142\5\16\b\2\u0140\u0142\7\5\2\2\u0141\u013f\3\2\2\2\u0141"+
		"\u0140\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0145\7C\2\2\u0144\u0143\3\2"+
		"\2\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0148\5\26\f\2\u0147"+
		"\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\7\5"+
		"\2\2\u014a\u014c\7C\2\2\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014e\3\2\2\2\u014d\u014f\5\u00caf\2\u014e\u014d\3\2\2\2\u014e\u014f"+
		"\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\7\4\2\2\u0151\u0153\7\5\2\2\u0152"+
		"\u0151\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u015d\3\2\2\2\u0154\u015d\7N"+
		"\2\2\u0155\u0156\7I\2\2\u0156\u0157\7\3\2\2\u0157\u0158\5\26\f\2\u0158"+
		"\u015a\7\4\2\2\u0159\u015b\7\5\2\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2"+
		"\2\2\u015b\u015d\3\2\2\2\u015c\u012a\3\2\2\2\u015c\u012b\3\2\2\2\u015c"+
		"\u0132\3\2\2\2\u015c\u0137\3\2\2\2\u015c\u0138\3\2\2\2\u015c\u013d\3\2"+
		"\2\2\u015c\u0154\3\2\2\2\u015c\u0155\3\2\2\2\u015d\r\3\2\2\2\u015e\u0163"+
		"\5\u00a2R\2\u015f\u0160\5\u00caf\2\u0160\u0161\7\5\2\2\u0161\u0163\3\2"+
		"\2\2\u0162\u015e\3\2\2\2\u0162\u015f\3\2\2\2\u0163\17\3\2\2\2\u0164\u0165"+
		"\7J\2\2\u0165\u0177\7\5\2\2\u0166\u0167\7L\2\2\u0167\u0177\7\5\2\2\u0168"+
		"\u0169\7O\2\2\u0169\u016a\5\u00c2b\2\u016a\u016b\7\5\2\2\u016b\u0177\3"+
		"\2\2\2\u016c\u016e\7P\2\2\u016d\u016f\5\u00caf\2\u016e\u016d\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0177\7\5\2\2\u0171\u0173\7["+
		"\2\2\u0172\u0174\5\u00caf\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\u0177\7\5\2\2\u0176\u0164\3\2\2\2\u0176\u0166\3\2"+
		"\2\2\u0176\u0168\3\2\2\2\u0176\u016c\3\2\2\2\u0176\u0171\3\2\2\2\u0177"+
		"\21\3\2\2\2\u0178\u017a\7K\2\2\u0179\u0178\3\2\2\2\u0179\u017a\3\2\2\2"+
		"\u017a\u017f\3\2\2\2\u017b\u0180\5\u00c2b\2\u017c\u0180\5\u00c4c\2\u017d"+
		"\u0180\7~\2\2\u017e\u0180\5\u00e6t\2\u017f\u017b\3\2\2\2\u017f\u017c\3"+
		"\2\2\2\u017f\u017d\3\2\2\2\u017f\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"\u0182\7\6\2\2\u0182\23\3\2\2\2\u0183\u0184\5\u00caf\2\u0184\u0185\7\5"+
		"\2\2\u0185\u0188\3\2\2\2\u0186\u0188\5\u0108\u0085\2\u0187\u0183\3\2\2"+
		"\2\u0187\u0186\3\2\2\2\u0188\25\3\2\2\2\u0189\u018a\5\u00caf\2\u018a\27"+
		"\3\2\2\2\u018b\u018e\5\32\16\2\u018c\u018e\5&\24\2\u018d\u018b\3\2\2\2"+
		"\u018d\u018c\3\2\2\2\u018e\31\3\2\2\2\u018f\u0194\5\34\17\2\u0190\u0194"+
		"\5\36\20\2\u0191\u0194\5 \21\2\u0192\u0194\5\"\22\2\u0193\u018f\3\2\2"+
		"\2\u0193\u0190\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0192\3\2\2\2\u0194\33"+
		"\3\2\2\2\u0195\u0196\7e\2\2\u0196\u0197\5$\23\2\u0197\u0198\b\17\1\2\u0198"+
		"\35\3\2\2\2\u0199\u019a\7f\2\2\u019a\u019b\5$\23\2\u019b\u019c\b\20\1"+
		"\2\u019c\37\3\2\2\2\u019d\u019e\7g\2\2\u019e!\3\2\2\2\u019f\u01a0\7h\2"+
		"\2\u01a0#\3\2\2\2\u01a1\u01a8\5\26\f\2\u01a2\u01a3\7\3\2\2\u01a3\u01a4"+
		"\5\26\f\2\u01a4\u01a5\7\4\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a8\5.\30\2"+
		"\u01a7\u01a1\3\2\2\2\u01a7\u01a2\3\2\2\2\u01a7\u01a6\3\2\2\2\u01a8%\3"+
		"\2\2\2\u01a9\u01b3\5(\25\2\u01aa\u01b3\5*\26\2\u01ab\u01b3\5\66\34\2\u01ac"+
		"\u01b3\58\35\2\u01ad\u01b3\5> \2\u01ae\u01b3\5@!\2\u01af\u01b3\5F$\2\u01b0"+
		"\u01b3\5H%\2\u01b1\u01b3\5\64\33\2\u01b2\u01a9\3\2\2\2\u01b2\u01aa\3\2"+
		"\2\2\u01b2\u01ab\3\2\2\2\u01b2\u01ac\3\2\2\2\u01b2\u01ad\3\2\2\2\u01b2"+
		"\u01ae\3\2\2\2\u01b2\u01af\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b1\3\2"+
		"\2\2\u01b3\'\3\2\2\2\u01b4\u01b5\7i\2\2\u01b5\u01b6\5,\27\2\u01b6\u01b7"+
		"\5\62\32\2\u01b7\u01bb\3\2\2\2\u01b8\u01b9\7i\2\2\u01b9\u01bb\5,\27\2"+
		"\u01ba\u01b4\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb)\3\2\2\2\u01bc\u01bd\7"+
		"j\2\2\u01bd\u01be\5,\27\2\u01be+\3\2\2\2\u01bf\u01c4\5\u00c2b\2\u01c0"+
		"\u01c1\7\3\2\2\u01c1\u01c2\5\60\31\2\u01c2\u01c3\7\4\2\2\u01c3\u01c5\3"+
		"\2\2\2\u01c4\u01c0\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01d0\3\2\2\2\u01c6"+
		"\u01d0\5.\30\2\u01c7\u01d0\7u\2\2\u01c8\u01cd\7\7\2\2\u01c9\u01ca\7\3"+
		"\2\2\u01ca\u01cb\5\60\31\2\u01cb\u01cc\7\4\2\2\u01cc\u01ce\3\2\2\2\u01cd"+
		"\u01c9\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf\u01bf\3\2"+
		"\2\2\u01cf\u01c6\3\2\2\2\u01cf\u01c7\3\2\2\2\u01cf\u01c8\3\2\2\2\u01d0"+
		"-\3\2\2\2\u01d1\u01d2\t\2\2\2\u01d2/\3\2\2\2\u01d3\u01d6\5\u00c2b\2\u01d4"+
		"\u01d6\7E\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2"+
		"\2\2\u01d6\u01de\3\2\2\2\u01d7\u01da\7\17\2\2\u01d8\u01db\5\u00c2b\2\u01d9"+
		"\u01db\7E\2\2\u01da\u01d8\3\2\2\2\u01da\u01d9\3\2\2\2\u01db\u01dd\3\2"+
		"\2\2\u01dc\u01d7\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de"+
		"\u01df\3\2\2\2\u01df\61\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e4\5\u00ca"+
		"f\2\u01e2\u01e4\b\32\1\2\u01e3\u01e1\3\2\2\2\u01e3\u01e2\3\2\2\2\u01e4"+
		"\63\3\2\2\2\u01e5\u01e6\5,\27\2\u01e6\u01ff\7\3\2\2\u01e7\u01ea\5\u00ca"+
		"f\2\u01e8\u01ea\5\u00b4[\2\u01e9\u01e7\3\2\2\2\u01e9\u01e8\3\2\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ea\u01ec\3\2\2\2\u01eb\u01ed\7C\2\2\u01ec\u01eb\3\2"+
		"\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01f8\3\2\2\2\u01ee\u01f0\7\17\2\2\u01ef"+
		"\u01f1\7C\2\2\u01f0\u01ef\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f4\3\2"+
		"\2\2\u01f2\u01f5\5\u00caf\2\u01f3\u01f5\5\u00b4[\2\u01f4\u01f2\3\2\2\2"+
		"\u01f4\u01f3\3\2\2\2\u01f5\u01f7\3\2\2\2\u01f6\u01ee\3\2\2\2\u01f7\u01fa"+
		"\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa"+
		"\u01f8\3\2\2\2\u01fb\u01fd\7\17\2\2\u01fc\u01fb\3\2\2\2\u01fc\u01fd\3"+
		"\2\2\2\u01fd\u0200\3\2\2\2\u01fe\u0200\7S\2\2\u01ff\u01e9\3\2\2\2\u01ff"+
		"\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\7\4\2\2\u0202\65\3\2\2"+
		"\2\u0203\u0204\7k\2\2\u0204\u0207\7\177\2\2\u0205\u0207\7k\2\2\u0206\u0203"+
		"\3\2\2\2\u0206\u0205\3\2\2\2\u0207\67\3\2\2\2\u0208\u020a\7l\2\2\u0209"+
		"\u020b\7\177\2\2\u020a\u0209\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u021e\3"+
		"\2\2\2\u020c\u020d\7t\2\2\u020d\u020e\7\3\2\2\u020e\u0210\7\3\2\2\u020f"+
		"\u0211\5:\36\2\u0210\u020f\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\3\2"+
		"\2\2\u0212\u0213\7\4\2\2\u0213\u021e\7\4\2\2\u0214\u021e\7\20\2\2\u0215"+
		"\u021e\7\21\2\2\u0216\u021e\7\22\2\2\u0217\u0218\7\23\2\2\u0218\u021a"+
		"\7\3\2\2\u0219\u021b\5:\36\2\u021a\u0219\3\2\2\2\u021a\u021b\3\2\2\2\u021b"+
		"\u021c\3\2\2\2\u021c\u021e\7\4\2\2\u021d\u0208\3\2\2\2\u021d\u020c\3\2"+
		"\2\2\u021d\u0214\3\2\2\2\u021d\u0215\3\2\2\2\u021d\u0216\3\2\2\2\u021d"+
		"\u0217\3\2\2\2\u021e9\3\2\2\2\u021f\u0224\5<\37\2\u0220\u0221\7\17\2\2"+
		"\u0221\u0223\5<\37\2\u0222\u0220\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0222"+
		"\3\2\2\2\u0224\u0225\3\2\2\2\u0225;\3\2\2\2\u0226\u0224\3\2\2\2\u0227"+
		"\u0244\5,\27\2\u0228\u0229\5,\27\2\u0229\u022a\7\3\2\2\u022a\u022f\5\u00c2"+
		"b\2\u022b\u022c\7\17\2\2\u022c\u022e\5\u00caf\2\u022d\u022b\3\2\2\2\u022e"+
		"\u0231\3\2\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0232\3\2"+
		"\2\2\u0231\u022f\3\2\2\2\u0232\u0233\7\4\2\2\u0233\u0244\3\2\2\2\u0234"+
		"\u0235\5,\27\2\u0235\u0237\7\3\2\2\u0236\u0238\5\u00caf\2\u0237\u0236"+
		"\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u023d\3\2\2\2\u0239\u023a\7\17\2\2"+
		"\u023a\u023c\5\u00caf\2\u023b\u0239\3\2\2\2\u023c\u023f\3\2\2\2\u023d"+
		"\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0240\3\2\2\2\u023f\u023d\3\2"+
		"\2\2\u0240\u0241\7\4\2\2\u0241\u0244\3\2\2\2\u0242\u0244\5R*\2\u0243\u0227"+
		"\3\2\2\2\u0243\u0228\3\2\2\2\u0243\u0234\3\2\2\2\u0243\u0242\3\2\2\2\u0244"+
		"=\3\2\2\2\u0245\u0246\7m\2\2\u0246\u024b\5B\"\2\u0247\u0248\7m\2\2\u0248"+
		"\u024b\5,\27\2\u0249\u024b\7m\2\2\u024a\u0245\3\2\2\2\u024a\u0247\3\2"+
		"\2\2\u024a\u0249\3\2\2\2\u024b?\3\2\2\2\u024c\u024d\7n\2\2\u024d\u0252"+
		"\5B\"\2\u024e\u024f\7n\2\2\u024f\u0252\5,\27\2\u0250\u0252\7n\2\2\u0251"+
		"\u024c\3\2\2\2\u0251\u024e\3\2\2\2\u0251\u0250\3\2\2\2\u0252A\3\2\2\2"+
		"\u0253\u0254\5D#\2\u0254C\3\2\2\2\u0255\u0256\7\177\2\2\u0256E\3\2\2\2"+
		"\u0257\u0258\7o\2\2\u0258\u0259\7z\2\2\u0259\u0266\7\177\2\2\u025a\u025b"+
		"\7o\2\2\u025b\u025c\7z\2\2\u025c\u0266\5,\27\2\u025d\u025e\7o\2\2\u025e"+
		"\u025f\5,\27\2\u025f\u0260\7\177\2\2\u0260\u0266\3\2\2\2\u0261\u0262\7"+
		"o\2\2\u0262\u0266\5,\27\2\u0263\u0264\7o\2\2\u0264\u0266\7z\2\2\u0265"+
		"\u0257\3\2\2\2\u0265\u025a\3\2\2\2\u0265\u025d\3\2\2\2\u0265\u0261\3\2"+
		"\2\2\u0265\u0263\3\2\2\2\u0266G\3\2\2\2\u0267\u0269\7p\2\2\u0268\u026a"+
		"\7q\2\2\u0269\u0268\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026b\3\2\2\2\u026b"+
		"\u026c\7r\2\2\u026c\u026d\7\177\2\2\u026d\u027c\b%\1\2\u026e\u0270\7p"+
		"\2\2\u026f\u0271\7q\2\2\u0270\u026f\3\2\2\2\u0270\u0271\3\2\2\2\u0271"+
		"\u0272\3\2\2\2\u0272\u0276\7r\2\2\u0273\u0275\5\u00c2b\2\u0274\u0273\3"+
		"\2\2\2\u0275\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277"+
		"\u027c\3\2\2\2\u0278\u0276\3\2\2\2\u0279\u027a\7p\2\2\u027a\u027c\b%\1"+
		"\2\u027b\u0267\3\2\2\2\u027b\u026e\3\2\2\2\u027b\u0279\3\2\2\2\u027cI"+
		"\3\2\2\2\u027d\u027e\7}\2\2\u027eK\3\2\2\2\u027f\u0280\7C\2\2\u0280M\3"+
		"\2\2\2\u0281\u0282\t\3\2\2\u0282O\3\2\2\2\u0283\u0284\t\4\2\2\u0284Q\3"+
		"\2\2\2\u0285\u02a2\7y\2\2\u0286\u02a2\7{\2\2\u0287\u02a2\7z\2\2\u0288"+
		"\u028c\7\177\2\2\u0289\u028b\7C\2\2\u028a\u0289\3\2\2\2\u028b\u028e\3"+
		"\2\2\2\u028c\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u0292\3\2\2\2\u028e"+
		"\u028c\3\2\2\2\u028f\u0291\7}\2\2\u0290\u028f\3\2\2\2\u0291\u0294\3\2"+
		"\2\2\u0292\u0290\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0298\3\2\2\2\u0294"+
		"\u0292\3\2\2\2\u0295\u0297\7C\2\2\u0296\u0295\3\2\2\2\u0297\u029a\3\2"+
		"\2\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029c\3\2\2\2\u029a"+
		"\u0298\3\2\2\2\u029b\u0288\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029b\3\2"+
		"\2\2\u029d\u029e\3\2\2\2\u029e\u02a2\3\2\2\2\u029f\u02a2\7~\2\2\u02a0"+
		"\u02a2\7|\2\2\u02a1\u0285\3\2\2\2\u02a1\u0286\3\2\2\2\u02a1\u0287\3\2"+
		"\2\2\u02a1\u029b\3\2\2\2\u02a1\u029f\3\2\2\2\u02a1\u02a0\3\2\2\2\u02a2"+
		"S\3\2\2\2\u02a3\u02a4\t\5\2\2\u02a4U\3\2\2\2\u02a5\u02a6\t\6\2\2\u02a6"+
		"W\3\2\2\2\u02a7\u02a8\t\7\2\2\u02a8Y\3\2\2\2\u02a9\u02ac\t\b\2\2\u02aa"+
		"\u02ab\7\37\2\2\u02ab\u02ad\7 \2\2\u02ac\u02aa\3\2\2\2\u02ac\u02ad\3\2"+
		"\2\2\u02ad\u02d7\3\2\2\2\u02ae\u02d7\7\26\2\2\u02af\u02d7\7\27\2\2\u02b0"+
		"\u02d7\7\25\2\2\u02b1\u02d7\7!\2\2\u02b2\u02d7\7\"\2\2\u02b3\u02d7\7#"+
		"\2\2\u02b4\u02d7\7\24\2\2\u02b5\u02d7\7$\2\2\u02b6\u02d7\7\30\2\2\u02b7"+
		"\u02d7\7\31\2\2\u02b8\u02d7\7%\2\2\u02b9\u02d7\7\32\2\2\u02ba\u02d7\7"+
		"\33\2\2\u02bb\u02d7\7&\2\2\u02bc\u02d7\7\'\2\2\u02bd\u02d7\7(\2\2\u02be"+
		"\u02d7\7)\2\2\u02bf\u02d7\7*\2\2\u02c0\u02d7\7+\2\2\u02c1\u02d7\7,\2\2"+
		"\u02c2\u02d7\7-\2\2\u02c3\u02d7\7.\2\2\u02c4\u02d7\7/\2\2\u02c5\u02d7"+
		"\7\60\2\2\u02c6\u02d7\7\61\2\2\u02c7\u02d7\7\62\2\2\u02c8\u02d7\7\63\2"+
		"\2\u02c9\u02d7\7\34\2\2\u02ca\u02d7\7\35\2\2\u02cb\u02d7\7\64\2\2\u02cc"+
		"\u02d7\7\65\2\2\u02cd\u02d7\7\66\2\2\u02ce\u02d7\7\67\2\2\u02cf\u02d7"+
		"\7\17\2\2\u02d0\u02d7\78\2\2\u02d1\u02d7\79\2\2\u02d2\u02d3\7\3\2\2\u02d3"+
		"\u02d7\7\4\2\2\u02d4\u02d5\7\37\2\2\u02d5\u02d7\7 \2\2\u02d6\u02a9\3\2"+
		"\2\2\u02d6\u02ae\3\2\2\2\u02d6\u02af\3\2\2\2\u02d6\u02b0\3\2\2\2\u02d6"+
		"\u02b1\3\2\2\2\u02d6\u02b2\3\2\2\2\u02d6\u02b3\3\2\2\2\u02d6\u02b4\3\2"+
		"\2\2\u02d6\u02b5\3\2\2\2\u02d6\u02b6\3\2\2\2\u02d6\u02b7\3\2\2\2\u02d6"+
		"\u02b8\3\2\2\2\u02d6\u02b9\3\2\2\2\u02d6\u02ba\3\2\2\2\u02d6\u02bb\3\2"+
		"\2\2\u02d6\u02bc\3\2\2\2\u02d6\u02bd\3\2\2\2\u02d6\u02be\3\2\2\2\u02d6"+
		"\u02bf\3\2\2\2\u02d6\u02c0\3\2\2\2\u02d6\u02c1\3\2\2\2\u02d6\u02c2\3\2"+
		"\2\2\u02d6\u02c3\3\2\2\2\u02d6\u02c4\3\2\2\2\u02d6\u02c5\3\2\2\2\u02d6"+
		"\u02c6\3\2\2\2\u02d6\u02c7\3\2\2\2\u02d6\u02c8\3\2\2\2\u02d6\u02c9\3\2"+
		"\2\2\u02d6\u02ca\3\2\2\2\u02d6\u02cb\3\2\2\2\u02d6\u02cc\3\2\2\2\u02d6"+
		"\u02cd\3\2\2\2\u02d6\u02ce\3\2\2\2\u02d6\u02cf\3\2\2\2\u02d6\u02d0\3\2"+
		"\2\2\u02d6\u02d1\3\2\2\2\u02d6\u02d2\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d7"+
		"[\3\2\2\2\u02d8\u02d9\t\t\2\2\u02d9]\3\2\2\2\u02da\u02db\t\n\2\2\u02db"+
		"_\3\2\2\2\u02dc\u02dd\7b\2\2\u02dd\u02de\7\32\2\2\u02de\u02df\5b\62\2"+
		"\u02df\u02e0\7\33\2\2\u02e0a\3\2\2\2\u02e1\u02e2\7\32\2\2\u02e2\u02e3"+
		"\5b\62\2\u02e3\u02e4\7\33\2\2\u02e4\u02eb\3\2\2\2\u02e5\u02e6\7\3\2\2"+
		"\u02e6\u02e7\5b\62\2\u02e7\u02e8\7\4\2\2\u02e8\u02eb\3\2\2\2\u02e9\u02eb"+
		"\5j\66\2\u02ea\u02e1\3\2\2\2\u02ea\u02e5\3\2\2\2\u02ea\u02e9\3\2\2\2\u02eb"+
		"\u02ec\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ec\u02ed\3\2\2\2\u02edc\3\2\2\2"+
		"\u02ee\u02ef\n\13\2\2\u02efe\3\2\2\2\u02f0\u02f1\n\f\2\2\u02f1g\3\2\2"+
		"\2\u02f2\u02f3\n\r\2\2\u02f3i\3\2\2\2\u02f4\u02f5\n\16\2\2\u02f5k\3\2"+
		"\2\2\u02f6\u02f7\n\17\2\2\u02f7m\3\2\2\2\u02f8\u02f9\n\20\2\2\u02f9o\3"+
		"\2\2\2\u02fa\u02fb\n\21\2\2\u02fbq\3\2\2\2\u02fc\u02fd\n\22\2\2\u02fd"+
		"s\3\2\2\2\u02fe\u02ff\n\23\2\2\u02ffu\3\2\2\2\u0300\u0301\n\f\2\2\u0301"+
		"w\3\2\2\2\u0302\u0303\13\2\2\2\u0303y\3\2\2\2\u0304\u0309\5|?\2\u0305"+
		"\u0309\5~@\2\u0306\u0309\5\u0080A\2\u0307\u0309\5\u0084C\2\u0308\u0304"+
		"\3\2\2\2\u0308\u0305\3\2\2\2\u0308\u0306\3\2\2\2\u0308\u0307\3\2\2\2\u0309"+
		"{\3\2\2\2\u030a\u030b\5,\27\2\u030b\u030c\7\17\2\2\u030c\u030e\3\2\2\2"+
		"\u030d\u030a\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u030d\3\2\2\2\u030f\u0310"+
		"\3\2\2\2\u0310}\3\2\2\2\u0311\u0312\7W\2\2\u0312\u0314\7:\2\2\u0313\u0315"+
		"\7w\2\2\u0314\u0313\3\2\2\2\u0314\u0315\3\2\2\2\u0315\177\3\2\2\2\u0316"+
		"\u0318\5\64\33\2\u0317\u0319\7C\2\2\u0318\u0317\3\2\2\2\u0318\u0319\3"+
		"\2\2\2\u0319\u031b\3\2\2\2\u031a\u031c\5,\27\2\u031b\u031a\3\2\2\2\u031b"+
		"\u031c\3\2\2\2\u031c\u031e\3\2\2\2\u031d\u031f\7C\2\2\u031e\u031d\3\2"+
		"\2\2\u031e\u031f\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0322\5\64\33\2\u0321"+
		"\u0323\7C\2\2\u0322\u0321\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0324\3\2"+
		"\2\2\u0324\u0325\5\u00aaV\2\u0325\u0081\3\2\2\2\u0326\u0327\7\7\2\2\u0327"+
		"\u0328\7\3\2\2\u0328\u0329\5\u009cO\2\u0329\u032a\7\4\2\2\u032a\u0083"+
		"\3\2\2\2\u032b\u032c\7u\2\2\u032c\u0085\3\2\2\2\u032d\u032f\5`\61\2\u032e"+
		"\u032d\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0331\3\2\2\2\u0330\u0332\5\u0088"+
		"E\2\u0331\u0330\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u0337\3\2\2\2\u0333"+
		"\u0335\58\35\2\u0334\u0336\7C\2\2\u0335\u0334\3\2\2\2\u0335\u0336\3\2"+
		"\2\2\u0336\u0338\3\2\2\2\u0337\u0333\3\2\2\2\u0337\u0338\3\2\2\2\u0338"+
		"\u0339\3\2\2\2\u0339\u033b\5\u009cO\2\u033a\u033c\7C\2\2\u033b\u033a\3"+
		"\2\2\2\u033b\u033c\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033f\5\u008aF\2"+
		"\u033e\u0340\5\u0094K\2\u033f\u033e\3\2\2\2\u033f\u0340\3\2\2\2\u0340"+
		"\u0342\3\2\2\2\u0341\u0343\7C\2\2\u0342\u0341\3\2\2\2\u0342\u0343\3\2"+
		"\2\2\u0343\u0344\3\2\2\2\u0344\u0345\5\u0092J\2\u0345\u034d\3\2\2\2\u0346"+
		"\u0348\5\64\33\2\u0347\u0349\7C\2\2\u0348\u0347\3\2\2\2\u0348\u0349\3"+
		"\2\2\2\u0349\u034a\3\2\2\2\u034a\u034b\5\u0092J\2\u034b\u034d\3\2\2\2"+
		"\u034c\u032e\3\2\2\2\u034c\u0346\3\2\2\2\u034d\u0087\3\2\2\2\u034e\u0350"+
		"\5T+\2\u034f\u0351\7C\2\2\u0350\u034f\3\2\2\2\u0350\u0351\3\2\2\2\u0351"+
		"\u0353\3\2\2\2\u0352\u034e\3\2\2\2\u0353\u0356\3\2\2\2\u0354\u0352\3\2"+
		"\2\2\u0354\u0355\3\2\2\2\u0355\u0357\3\2\2\2\u0356\u0354\3\2\2\2\u0357"+
		"\u0358\5\u00b4[\2\u0358\u035f\3\2\2\2\u0359\u035b\5V,\2\u035a\u035c\7"+
		"C\2\2\u035b\u035a\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035e\3\2\2\2\u035d"+
		"\u0359\3\2\2\2\u035e\u0361\3\2\2\2\u035f\u035d\3\2\2\2\u035f\u0360\3\2"+
		"\2\2\u0360\u0367\3\2\2\2\u0361\u035f\3\2\2\2\u0362\u0364\5\64\33\2\u0363"+
		"\u0365\7C\2\2\u0364\u0363\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0367\3\2"+
		"\2\2\u0366\u0354\3\2\2\2\u0366\u0362\3\2\2\2\u0367\u0089\3\2\2\2\u0368"+
		"\u036a\7\3\2\2\u0369\u036b\5\u008cG\2\u036a\u0369\3\2\2\2\u036a\u036b"+
		"\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036e\7\4\2\2\u036d\u036f\7\25\2\2"+
		"\u036e\u036d\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0376\3\2\2\2\u0370\u0372"+
		"\7V\2\2\u0371\u0373\7C\2\2\u0372\u0371\3\2\2\2\u0372\u0373\3\2\2\2\u0373"+
		"\u0375\3\2\2\2\u0374\u0370\3\2\2\2\u0375\u0378\3\2\2\2\u0376\u0374\3\2"+
		"\2\2\u0376\u0377\3\2\2\2\u0377\u037a\3\2\2\2\u0378\u0376\3\2\2\2\u0379"+
		"\u037b\5\u009eP\2\u037a\u0379\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u008b"+
		"\3\2\2\2\u037c\u0384\5\u008eH\2\u037d\u037f\7\17\2\2\u037e\u0380\7C\2"+
		"\2\u037f\u037e\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0383"+
		"\5\u008eH\2\u0382\u037d\3\2\2\2\u0383\u0386\3\2\2\2\u0384\u0382\3\2\2"+
		"\2\u0384\u0385\3\2\2\2\u0385\u038c\3\2\2\2\u0386\u0384\3\2\2\2\u0387\u0389"+
		"\7\17\2\2\u0388\u038a\7C\2\2\u0389\u0388\3\2\2\2\u0389\u038a\3\2\2\2\u038a"+
		"\u038b\3\2\2\2\u038b\u038d\7E\2\2\u038c\u0387\3\2\2\2\u038c\u038d\3\2"+
		"\2\2\u038d\u008d\3\2\2\2\u038e\u0393\7S\2\2\u038f\u0390\5\u00b8]\2\u0390"+
		"\u0391\5\u0090I\2\u0391\u0393\3\2\2\2\u0392\u038e\3\2\2\2\u0392\u038f"+
		"\3\2\2\2\u0393\u008f\3\2\2\2\u0394\u0396\5\u00c6d\2\u0395\u0394\3\2\2"+
		"\2\u0395\u0396\3\2\2\2\u0396\u039c\3\2\2\2\u0397\u0398\7\3\2\2\u0398\u0399"+
		"\5\u0090I\2\u0399\u039a\7\4\2\2\u039a\u039d\3\2\2\2\u039b\u039d\5\u00ba"+
		"^\2\u039c\u0397\3\2\2\2\u039c\u039b\3\2\2\2\u039d\u039f\3\2\2\2\u039e"+
		"\u03a0\5\u010e\u0088\2\u039f\u039e\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u0091"+
		"\3\2\2\2\u03a1\u03a2\7w\2\2\u03a2\u03a3\bJ\1\2\u03a3\u0093\3\2\2\2\u03a4"+
		"\u03a5\7\6\2\2\u03a5\u03aa\5\u0096L\2\u03a6\u03a7\7\17\2\2\u03a7\u03a9"+
		"\5\u0096L\2\u03a8\u03a6\3\2\2\2\u03a9\u03ac\3\2\2\2\u03aa\u03a8\3\2\2"+
		"\2\u03aa\u03ab\3\2\2\2\u03ab\u0095\3\2\2\2\u03ac\u03aa\3\2\2\2\u03ad\u03ae"+
		"\5\u0098M\2\u03ae\u03af\5\u009aN\2\u03af\u0097\3\2\2\2\u03b0\u03b2\7;"+
		"\2\2\u03b1\u03b0\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3"+
		"\u03b4\5\u00c2b\2\u03b4\u0099\3\2\2\2\u03b5\u03b7\7\3\2\2\u03b6\u03b8"+
		"\5\u00caf\2\u03b7\u03b6\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03b9\3\2\2"+
		"\2\u03b9\u03ba\7\4\2\2\u03ba\u009b\3\2\2\2\u03bb\u03c3\5\u00c2b\2\u03bc"+
		"\u03bd\7\3\2\2\u03bd\u03be\5\u009cO\2\u03be\u03bf\7\4\2\2\u03bf\u03c3"+
		"\3\2\2\2\u03c0\u03c1\7a\2\2\u03c1\u03c3\5Z.\2\u03c2\u03bb\3\2\2\2\u03c2"+
		"\u03bc\3\2\2\2\u03c2\u03c0\3\2\2\2\u03c3\u009d\3\2\2\2\u03c4\u03c5\7["+
		"\2\2\u03c5\u03c6\7\3\2\2\u03c6\u03c7\5\u00a0Q\2\u03c7\u03c8\7\4\2\2\u03c8"+
		"\u009f\3\2\2\2\u03c9\u03cb\5d\63\2\u03ca\u03c9\3\2\2\2\u03cb\u03ce\3\2"+
		"\2\2\u03cc\u03ca\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03da\3\2\2\2\u03ce"+
		"\u03cc\3\2\2\2\u03cf\u03d0\7\3\2\2\u03d0\u03d1\5\u00a0Q\2\u03d1\u03d5"+
		"\7\4\2\2\u03d2\u03d4\5d\63\2\u03d3\u03d2\3\2\2\2\u03d4\u03d7\3\2\2\2\u03d5"+
		"\u03d3\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d9\3\2\2\2\u03d7\u03d5\3\2"+
		"\2\2\u03d8\u03cf\3\2\2\2\u03d9\u03dc\3\2\2\2\u03da\u03d8\3\2\2\2\u03da"+
		"\u03db\3\2\2\2\u03db\u00a1\3\2\2\2\u03dc\u03da\3\2\2\2\u03dd\u03de\5\u00a4"+
		"S\2\u03de\u00a3\3\2\2\2\u03df\u03e1\5`\61\2\u03e0\u03df\3\2\2\2\u03e0"+
		"\u03e1\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e4\5\u00acW\2\u03e3\u03e5"+
		"\5\u00aaV\2\u03e4\u03e3\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u042d\3\2\2"+
		"\2\u03e6\u03e8\7Q\2\2\u03e7\u03e9\7C\2\2\u03e8\u03e7\3\2\2\2\u03e8\u03e9"+
		"\3\2\2\2\u03e9\u03eb\3\2\2\2\u03ea\u03e6\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb"+
		"\u03ed\3\2\2\2\u03ec\u03ee\5`\61\2\u03ed\u03ec\3\2\2\2\u03ed\u03ee\3\2"+
		"\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f0\5\u00b4[\2\u03f0\u03f1\5\u00aaV\2"+
		"\u03f1\u042d\3\2\2\2\u03f2\u03f4\7Q\2\2\u03f3\u03f5\7C\2\2\u03f4\u03f3"+
		"\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f7\3\2\2\2\u03f6\u03f2\3\2\2\2\u03f6"+
		"\u03f7\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03f9\5\u00b4[\2\u03f9\u03fb"+
		"\7\3\2\2\u03fa\u03fc\5\u00a6T\2\u03fb\u03fa\3\2\2\2\u03fb\u03fc\3\2\2"+
		"\2\u03fc\u03fd\3\2\2\2\u03fd\u03fe\5V,\2\u03fe\u03ff\5\u00c2b\2\u03ff"+
		"\u0400\7\4\2\2\u0400\u0402\5\u00bc_\2\u0401\u0403\7C\2\2\u0402\u0401\3"+
		"\2\2\2\u0402\u0403\3\2\2\2\u0403\u0405\3\2\2\2\u0404\u0406\58\35\2\u0405"+
		"\u0404\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u040c\3\2\2\2\u0407\u0409\7%"+
		"\2\2\u0408\u040a\7C\2\2\u0409\u0408\3\2\2\2\u0409\u040a\3\2\2\2\u040a"+
		"\u040b\3\2\2\2\u040b\u040d\5\u0104\u0083\2\u040c\u0407\3\2\2\2\u040c\u040d"+
		"\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u040f\7\5\2\2\u040f\u042d\3\2\2\2\u0410"+
		"\u0412\7V\2\2\u0411\u0413\7C\2\2\u0412\u0411\3\2\2\2\u0412\u0413\3\2\2"+
		"\2\u0413\u0415\3\2\2\2\u0414\u0410\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u041a"+
		"\3\2\2\2\u0416\u0418\5T+\2\u0417\u0419\7C\2\2\u0418\u0417\3\2\2\2\u0418"+
		"\u0419\3\2\2\2\u0419\u041b\3\2\2\2\u041a\u0416\3\2\2\2\u041a\u041b\3\2"+
		"\2\2\u041b\u0420\3\2\2\2\u041c\u041e\7Q\2\2\u041d\u041f\7C\2\2\u041e\u041d"+
		"\3\2\2\2\u041e\u041f\3\2\2\2\u041f\u0421\3\2\2\2\u0420\u041c\3\2\2\2\u0420"+
		"\u0421\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u0424\5\u00a8U\2\u0423\u0425"+
		"\7C\2\2\u0424\u0423\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u0427\3\2\2\2\u0426"+
		"\u0428\5\u00aaV\2\u0427\u0426\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u042a"+
		"\3\2\2\2\u0429\u042b\7\5\2\2\u042a\u0429\3\2\2\2\u042a\u042b\3\2\2\2\u042b"+
		"\u042d\3\2\2\2\u042c\u03e0\3\2\2\2\u042c\u03ea\3\2\2\2\u042c\u03f6\3\2"+
		"\2\2\u042c\u0414\3\2\2\2\u042d\u00a5\3\2\2\2\u042e\u0430\7v\2\2\u042f"+
		"\u042e\3\2\2\2\u0430\u0431\3\2\2\2\u0431\u042f\3\2\2\2\u0431\u0432\3\2"+
		"\2\2\u0432\u00a7\3\2\2\2\u0433\u0435\7`\2\2\u0434\u0436\7C\2\2\u0435\u0434"+
		"\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0438\3\2\2\2\u0437\u0439\58\35\2\u0438"+
		"\u0437\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043e\3\2\2\2\u043a\u043c\5\u00c2"+
		"b\2\u043b\u043d\7C\2\2\u043c\u043b\3\2\2\2\u043c\u043d\3\2\2\2\u043d\u043f"+
		"\3\2\2\2\u043e\u043a\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0441\3\2\2\2\u0440"+
		"\u0442\58\35\2\u0441\u0440\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0443\3\2"+
		"\2\2\u0443\u0444\7w\2\2\u0444\u0463\bU\1\2\u0445\u0447\7`\2\2\u0446\u0448"+
		"\7C\2\2\u0447\u0446\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u044a\3\2\2\2\u0449"+
		"\u044b\58\35\2\u044a\u0449\3\2\2\2\u044a\u044b\3\2\2\2\u044b\u044c\3\2"+
		"\2\2\u044c\u044e\5\u00c2b\2\u044d\u044f\7C\2\2\u044e\u044d\3\2\2\2\u044e"+
		"\u044f\3\2\2\2\u044f\u0451\3\2\2\2\u0450\u0452\5\u00c6d\2\u0451\u0450"+
		"\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u0455\5\u00c2b"+
		"\2\u0454\u0456\5\u00c6d\2\u0455\u0454\3\2\2\2\u0455\u0456\3\2\2\2\u0456"+
		"\u0457\3\2\2\2\u0457\u0458\7%\2\2\u0458\u0459\bU\1\2\u0459\u0463\3\2\2"+
		"\2\u045a\u045c\7`\2\2\u045b\u045d\7C\2\2\u045c\u045b\3\2\2\2\u045c\u045d"+
		"\3\2\2\2\u045d\u045f\3\2\2\2\u045e\u0460\58\35\2\u045f\u045e\3\2\2\2\u045f"+
		"\u0460\3\2\2\2\u0460\u0461\3\2\2\2\u0461\u0463\5\u00c2b\2\u0462\u0433"+
		"\3\2\2\2\u0462\u0445\3\2\2\2\u0462\u045a\3\2\2\2\u0463\u00a9\3\2\2\2\u0464"+
		"\u046f\5\u010a\u0086\2\u0465\u0467\7C\2\2\u0466\u0465\3\2\2\2\u0466\u0467"+
		"\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u046a\7\17\2\2\u0469\u046b\7C\2\2\u046a"+
		"\u0469\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u046e\5\u010a"+
		"\u0086\2\u046d\u0466\3\2\2\2\u046e\u0471\3\2\2\2\u046f\u046d\3\2\2\2\u046f"+
		"\u0470\3\2\2\2\u0470\u0473\3\2\2\2\u0471\u046f\3\2\2\2\u0472\u0474\7C"+
		"\2\2\u0473\u0472\3\2\2\2\u0473\u0474\3\2\2\2\u0474\u0476\3\2\2\2\u0475"+
		"\u0477\58\35\2\u0476\u0475\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u0478\3\2"+
		"\2\2\u0478\u0479\7\5\2\2\u0479\u00ab\3\2\2\2\u047a\u047c\7c\2\2\u047b"+
		"\u047d\7C\2\2\u047c\u047b\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u047f\3\2"+
		"\2\2\u047e\u0480\5\u00aeX\2\u047f\u047e\3\2\2\2\u047f\u0480\3\2\2\2\u0480"+
		"\u0482\3\2\2\2\u0481\u0483\5\u00b0Y\2\u0482\u0481\3\2\2\2\u0482\u0483"+
		"\3\2\2\2\u0483\u0484\3\2\2\2\u0484\u0485\7w\2\2\u0485\u0486\bW\1\2\u0486"+
		"\u00ad\3\2\2\2\u0487\u0488\5\u00c2b\2\u0488\u00af\3\2\2\2\u0489\u048a"+
		"\7\6\2\2\u048a\u048f\5\u00b2Z\2\u048b\u048c\7\17\2\2\u048c\u048e\5\u00b2"+
		"Z\2\u048d\u048b\3\2\2\2\u048e\u0491\3\2\2\2\u048f\u048d\3\2\2\2\u048f"+
		"\u0490\3\2\2\2\u0490\u00b1\3\2\2\2\u0491\u048f\3\2\2\2\u0492\u0494\7X"+
		"\2\2\u0493\u0495\7C\2\2\u0494\u0493\3\2\2\2\u0494\u0495\3\2\2\2\u0495"+
		"\u0497\3\2\2\2\u0496\u0492\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u0499\3\2"+
		"\2\2\u0498\u049a\5X-\2\u0499\u0498\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u049b"+
		"\3\2\2\2\u049b\u049c\5\u00c2b\2\u049c\u00b3\3\2\2\2\u049d\u049f\7W\2\2"+
		"\u049e\u04a0\7C\2\2\u049f\u049e\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a2"+
		"\3\2\2\2\u04a1\u049d\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04b2\3\2\2\2\u04a3"+
		"\u04b3\5T+\2\u04a4\u04a6\7V\2\2\u04a5\u04a7\7C\2\2\u04a6\u04a5\3\2\2\2"+
		"\u04a6\u04a7\3\2\2\2\u04a7\u04b3\3\2\2\2\u04a8\u04aa\7T\2\2\u04a9\u04ab"+
		"\7C\2\2\u04aa\u04a9\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab\u04b3\3\2\2\2\u04ac"+
		"\u04ae\7U\2\2\u04ad\u04af\7C\2\2\u04ae\u04ad\3\2\2\2\u04ae\u04af\3\2\2"+
		"\2\u04af\u04b3\3\2\2\2\u04b0\u04b3\5V,\2\u04b1\u04b3\5\u00b6\\\2\u04b2"+
		"\u04a3\3\2\2\2\u04b2\u04a4\3\2\2\2\u04b2\u04a8\3\2\2\2\u04b2\u04ac\3\2"+
		"\2\2\u04b2\u04b0\3\2\2\2\u04b2\u04b1\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4"+
		"\u04b2\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5\u04ba\3\2\2\2\u04b6\u04b7\7\32"+
		"\2\2\u04b7\u04b8\5b\62\2\u04b8\u04b9\7\33\2\2\u04b9\u04bb\3\2\2\2\u04ba"+
		"\u04b6\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bb\u04c6\3\2\2\2\u04bc\u04bd\7;"+
		"\2\2\u04bd\u04c2\5\u00b6\\\2\u04be\u04bf\7\32\2\2\u04bf\u04c0\5b\62\2"+
		"\u04c0\u04c1\7\33\2\2\u04c1\u04c3\3\2\2\2\u04c2\u04be\3\2\2\2\u04c2\u04c3"+
		"\3\2\2\2\u04c3\u04c5\3\2\2\2\u04c4\u04bc\3\2\2\2\u04c5\u04c8\3\2\2\2\u04c6"+
		"\u04c4\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7\u04d9\3\2\2\2\u04c8\u04c6\3\2"+
		"\2\2\u04c9\u04d8\5T+\2\u04ca\u04cc\7V\2\2\u04cb\u04cd\7C\2\2\u04cc\u04cb"+
		"\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd\u04d8\3\2\2\2\u04ce\u04d0\7T\2\2\u04cf"+
		"\u04d1\7C\2\2\u04d0\u04cf\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d8\3\2"+
		"\2\2\u04d2\u04d4\7U\2\2\u04d3\u04d5\7C\2\2\u04d4\u04d3\3\2\2\2\u04d4\u04d5"+
		"\3\2\2\2\u04d5\u04d8\3\2\2\2\u04d6\u04d8\5V,\2\u04d7\u04c9\3\2\2\2\u04d7"+
		"\u04ca\3\2\2\2\u04d7\u04ce\3\2\2\2\u04d7\u04d2\3\2\2\2\u04d7\u04d6\3\2"+
		"\2\2\u04d8\u04db\3\2\2\2\u04d9\u04d7\3\2\2\2\u04d9\u04da\3\2\2\2\u04da"+
		"\u04de\3\2\2\2\u04db\u04d9\3\2\2\2\u04dc\u04de\5\64\33\2\u04dd\u04a1\3"+
		"\2\2\2\u04dd\u04dc\3\2\2\2\u04de\u00b5\3\2\2\2\u04df\u04e1\7S\2\2\u04e0"+
		"\u04e2\7C\2\2\u04e1\u04e0\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2\u04fc\3\2"+
		"\2\2\u04e3\u04e5\7\16\2\2\u04e4\u04e6\7C\2\2\u04e5\u04e4\3\2\2\2\u04e5"+
		"\u04e6\3\2\2\2\u04e6\u04fc\3\2\2\2\u04e7\u04e9\7<\2\2\u04e8\u04ea\7C\2"+
		"\2\u04e9\u04e8\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04fc\3\2\2\2\u04eb\u04ed"+
		"\7=\2\2\u04ec\u04ee\7C\2\2\u04ed\u04ec\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee"+
		"\u04fc\3\2\2\2\u04ef\u04f1\7`\2\2\u04f0\u04f2\7C\2\2\u04f1\u04f0\3\2\2"+
		"\2\u04f1\u04f2\3\2\2\2\u04f2\u04fc\3\2\2\2\u04f3\u04f5\7c\2\2\u04f4\u04f6"+
		"\7C\2\2\u04f5\u04f4\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6\u04fc\3\2\2\2\u04f7"+
		"\u04f9\7v\2\2\u04f8\u04fa\7C\2\2\u04f9\u04f8\3\2\2\2\u04f9\u04fa\3\2\2"+
		"\2\u04fa\u04fc\3\2\2\2\u04fb\u04df\3\2\2\2\u04fb\u04e3\3\2\2\2\u04fb\u04e7"+
		"\3\2\2\2\u04fb\u04eb\3\2\2\2\u04fb\u04ef\3\2\2\2\u04fb\u04f3\3\2\2\2\u04fb"+
		"\u04f7\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u04fb\3\2\2\2\u04fd\u04fe\3\2"+
		"\2\2\u04fe\u00b7\3\2\2\2\u04ff\u0501\7^\2\2\u0500\u0502\7C\2\2\u0501\u0500"+
		"\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0508\3\2\2\2\u0503\u0505\7_\2\2\u0504"+
		"\u0506\7C\2\2\u0505\u0504\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u0508\3\2"+
		"\2\2\u0507\u04ff\3\2\2\2\u0507\u0503\3\2\2\2\u0507\u0508\3\2\2\2\u0508"+
		"\u0509\3\2\2\2\u0509\u050a\5\u00b4[\2\u050a\u00b9\3\2\2\2\u050b\u050d"+
		"\5\u00c2b\2\u050c\u050e\7C\2\2\u050d\u050c\3\2\2\2\u050d\u050e\3\2\2\2"+
		"\u050e\u00bb\3\2\2\2\u050f\u0510\7\3\2\2\u0510\u0511\7S\2\2\u0511\u0522"+
		"\7\4\2\2\u0512\u051e\7\3\2\2\u0513\u051b\5\u00be`\2\u0514\u0516\7\17\2"+
		"\2\u0515\u0517\7C\2\2\u0516\u0515\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u0518"+
		"\3\2\2\2\u0518\u051a\5\u00be`\2\u0519\u0514\3\2\2\2\u051a\u051d\3\2\2"+
		"\2\u051b\u0519\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u051f\3\2\2\2\u051d\u051b"+
		"\3\2\2\2\u051e\u0513\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u0520\3\2\2\2\u0520"+
		"\u0522\7\4\2\2\u0521\u050f\3\2\2\2\u0521\u0512\3\2\2\2\u0522\u00bd\3\2"+
		"\2\2\u0523\u0525\5\u00b8]\2\u0524\u0526\7C\2\2\u0525\u0524\3\2\2\2\u0525"+
		"\u0526\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u0528\5\u00c0a\2\u0528\u052b"+
		"\3\2\2\2\u0529\u052b\7E\2\2\u052a\u0523\3\2\2\2\u052a\u0529\3\2\2\2\u052b"+
		"\u00bf\3\2\2\2\u052c\u052e\5\u00c6d\2\u052d\u052c\3\2\2\2\u052d\u052e"+
		"\3\2\2\2\u052e\u0536\3\2\2\2\u052f\u0530\7\3\2\2\u0530\u0531\5\u00c0a"+
		"\2\u0531\u0532\7\4\2\2\u0532\u0537\3\2\2\2\u0533\u0535\5\u00ba^\2\u0534"+
		"\u0533\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u0537\3\2\2\2\u0536\u052f\3\2"+
		"\2\2\u0536\u0534\3\2\2\2\u0537\u0539\3\2\2\2\u0538\u053a\5\u010e\u0088"+
		"\2\u0539\u0538\3\2\2\2\u0539\u053a\3\2\2\2\u053a\u00c1\3\2\2\2\u053b\u0540"+
		"\7v\2\2\u053c\u053d\7;\2\2\u053d\u053f\7v\2\2\u053e\u053c\3\2\2\2\u053f"+
		"\u0542\3\2\2\2\u0540\u053e\3\2\2\2\u0540\u0541\3\2\2\2\u0541\u0547\3\2"+
		"\2\2\u0542\u0540\3\2\2\2\u0543\u0547\7d\2\2\u0544\u0547\7r\2\2\u0545\u0547"+
		"\5X-\2\u0546\u053b\3\2\2\2\u0546\u0543\3\2\2\2\u0546\u0544\3\2\2\2\u0546"+
		"\u0545\3\2\2\2\u0547\u00c3\3\2\2\2\u0548\u0549\t\24\2\2\u0549\u00c5\3"+
		"\2\2\2\u054a\u054c\5V,\2\u054b\u054d\7>\2\2\u054c\u054b\3\2\2\2\u054c"+
		"\u054d\3\2\2\2\u054d\u054f\3\2\2\2\u054e\u054a\3\2\2\2\u054f\u0550\3\2"+
		"\2\2\u0550\u054e\3\2\2\2\u0550\u0551\3\2\2\2\u0551\u00c7\3\2\2\2\u0552"+
		"\u0553\5\u00c6d\2\u0553\u00c9\3\2\2\2\u0554\u0559\5\u00ccg\2\u0555\u0556"+
		"\7D\2\2\u0556\u0558\7C\2\2\u0557\u0555\3\2\2\2\u0558\u055b\3\2\2\2\u0559"+
		"\u0557\3\2\2\2\u0559\u055a\3\2\2\2\u055a\u0570\3\2\2\2\u055b\u0559\3\2"+
		"\2\2\u055c\u055e\7C\2\2\u055d\u055c\3\2\2\2\u055d\u055e\3\2\2\2\u055e"+
		"\u0560\3\2\2\2\u055f\u0561\7}\2\2\u0560\u055f\3\2\2\2\u0560\u0561\3\2"+
		"\2\2\u0561\u0563\3\2\2\2\u0562\u0564\7C\2\2\u0563\u0562\3\2\2\2\u0563"+
		"\u0564\3\2\2\2\u0564\u0565\3\2\2\2\u0565\u0567\7\17\2\2\u0566\u0568\7"+
		"C\2\2\u0567\u0566\3\2\2\2\u0567\u0568\3\2\2\2\u0568\u056a\3\2\2\2\u0569"+
		"\u056b\7}\2\2\u056a\u0569\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u056d\3\2"+
		"\2\2\u056c\u056e\7C\2\2\u056d\u056c\3\2\2\2\u056d\u056e\3\2\2\2\u056e"+
		"\u056f\3\2\2\2\u056f\u0571\5\u00caf\2\u0570\u055d\3\2\2\2\u0570\u0571"+
		"\3\2\2\2\u0571\u0576\3\2\2\2\u0572\u0573\7D\2\2\u0573\u0575\7C\2\2\u0574"+
		"\u0572\3\2\2\2\u0575\u0578\3\2\2\2\u0576\u0574\3\2\2\2\u0576\u0577\3\2"+
		"\2\2\u0577\u00cb\3\2\2\2\u0578\u0576\3\2\2\2\u0579\u058f\5\u00ceh\2\u057a"+
		"\u057c\7C\2\2\u057b\u057a\3\2\2\2\u057b\u057c\3\2\2\2\u057c\u057e\3\2"+
		"\2\2\u057d\u057f\7}\2\2\u057e\u057d\3\2\2\2\u057e\u057f\3\2\2\2\u057f"+
		"\u0581\3\2\2\2\u0580\u0582\7C\2\2\u0581\u0580\3\2\2\2\u0581\u0582\3\2"+
		"\2\2\u0582\u0583\3\2\2\2\u0583\u0585\5\\/\2\u0584\u0586\7C\2\2\u0585\u0584"+
		"\3\2\2\2\u0585\u0586\3\2\2\2\u0586\u0588\3\2\2\2\u0587\u0589\7}\2\2\u0588"+
		"\u0587\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u058b\3\2\2\2\u058a\u058c\7C"+
		"\2\2\u058b\u058a\3\2\2\2\u058b\u058c\3\2\2\2\u058c\u058d\3\2\2\2\u058d"+
		"\u058e\5\u00ccg\2\u058e\u0590\3\2\2\2\u058f\u057b\3\2\2\2\u058f\u0590"+
		"\3\2\2\2\u0590\u00cd\3\2\2\2\u0591\u05bd\5\u00d0i\2\u0592\u0594\5\u00d0"+
		"i\2\u0593\u0595\7C\2\2\u0594\u0593\3\2\2\2\u0594\u0595\3\2\2\2\u0595\u0597"+
		"\3\2\2\2\u0596\u0598\7}\2\2\u0597\u0596\3\2\2\2\u0597\u0598\3\2\2\2\u0598"+
		"\u059a\3\2\2\2\u0599\u059b\7C\2\2\u059a\u0599\3\2\2\2\u059a\u059b\3\2"+
		"\2\2\u059b\u059c\3\2\2\2\u059c\u059e\7?\2\2\u059d\u059f\7C\2\2\u059e\u059d"+
		"\3\2\2\2\u059e\u059f\3\2\2\2\u059f\u05a1\3\2\2\2\u05a0\u05a2\7}\2\2\u05a1"+
		"\u05a0\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05a4\3\2\2\2\u05a3\u05a5\7C"+
		"\2\2\u05a4\u05a3\3\2\2\2\u05a4\u05a5\3\2\2\2\u05a5\u05a6\3\2\2\2\u05a6"+
		"\u05a8\5\u00caf\2\u05a7\u05a9\7C\2\2\u05a8\u05a7\3\2\2\2\u05a8\u05a9\3"+
		"\2\2\2\u05a9\u05ab\3\2\2\2\u05aa\u05ac\7}\2\2\u05ab\u05aa\3\2\2\2\u05ab"+
		"\u05ac\3\2\2\2\u05ac\u05ae\3\2\2\2\u05ad\u05af\7C\2\2\u05ae\u05ad\3\2"+
		"\2\2\u05ae\u05af\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0\u05b2\7\6\2\2\u05b1"+
		"\u05b3\7C\2\2\u05b2\u05b1\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3\u05b5\3\2"+
		"\2\2\u05b4\u05b6\7}\2\2\u05b5\u05b4\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6"+
		"\u05b8\3\2\2\2\u05b7\u05b9\7C\2\2\u05b8\u05b7\3\2\2\2\u05b8\u05b9\3\2"+
		"\2\2\u05b9\u05ba\3\2\2\2\u05ba\u05bb\5\u00ceh\2\u05bb\u05bd\3\2\2\2\u05bc"+
		"\u0591\3\2\2\2\u05bc\u0592\3\2\2\2\u05bd\u00cf\3\2\2\2\u05be\u05d3\5\u00d2"+
		"j\2\u05bf\u05c1\7C\2\2\u05c0\u05bf\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1\u05c3"+
		"\3\2\2\2\u05c2\u05c4\7}\2\2\u05c3\u05c2\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4"+
		"\u05c6\3\2\2\2\u05c5\u05c7\7C\2\2\u05c6\u05c5\3\2\2\2\u05c6\u05c7\3\2"+
		"\2\2\u05c7\u05c8\3\2\2\2\u05c8\u05ca\7\65\2\2\u05c9\u05cb\7C\2\2\u05ca"+
		"\u05c9\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb\u05cd\3\2\2\2\u05cc\u05ce\7}"+
		"\2\2\u05cd\u05cc\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05d0\3\2\2\2\u05cf"+
		"\u05d1\7C\2\2\u05d0\u05cf\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u05d2\3\2"+
		"\2\2\u05d2\u05d4\5\u00d0i\2\u05d3\u05c0\3\2\2\2\u05d3\u05d4\3\2\2\2\u05d4"+
		"\u00d1\3\2\2\2\u05d5\u05ea\5\u00d4k\2\u05d6\u05d8\7C\2\2\u05d7\u05d6\3"+
		"\2\2\2\u05d7\u05d8\3\2\2\2\u05d8\u05da\3\2\2\2\u05d9\u05db\7}\2\2\u05da"+
		"\u05d9\3\2\2\2\u05da\u05db\3\2\2\2\u05db\u05dd\3\2\2\2\u05dc\u05de\7C"+
		"\2\2\u05dd\u05dc\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u05df\3\2\2\2\u05df"+
		"\u05e1\7\64\2\2\u05e0\u05e2\7C\2\2\u05e1\u05e0\3\2\2\2\u05e1\u05e2\3\2"+
		"\2\2\u05e2\u05e4\3\2\2\2\u05e3\u05e5\7}\2\2\u05e4\u05e3\3\2\2\2\u05e4"+
		"\u05e5\3\2\2\2\u05e5\u05e7\3\2\2\2\u05e6\u05e8\7C\2\2\u05e7\u05e6\3\2"+
		"\2\2\u05e7\u05e8\3\2\2\2\u05e8\u05e9\3\2\2\2\u05e9\u05eb\5\u00d2j\2\u05ea"+
		"\u05d7\3\2\2\2\u05ea\u05eb\3\2\2\2\u05eb\u00d3\3\2\2\2\u05ec\u0601\5\u00d6"+
		"l\2\u05ed\u05ef\7C\2\2\u05ee\u05ed\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef\u05f1"+
		"\3\2\2\2\u05f0\u05f2\7}\2\2\u05f1\u05f0\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2"+
		"\u05f4\3\2\2\2\u05f3\u05f5\7C\2\2\u05f4\u05f3\3\2\2\2\u05f4\u05f5\3\2"+
		"\2\2\u05f5\u05f6\3\2\2\2\u05f6\u05f8\7$\2\2\u05f7\u05f9\7C\2\2\u05f8\u05f7"+
		"\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9\u05fb\3\2\2\2\u05fa\u05fc\7}\2\2\u05fb"+
		"\u05fa\3\2\2\2\u05fb\u05fc\3\2\2\2\u05fc\u05fe\3\2\2\2\u05fd\u05ff\7C"+
		"\2\2\u05fe\u05fd\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff\u0600\3\2\2\2\u0600"+
		"\u0602\5\u00d4k\2\u0601\u05ee\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u00d5"+
		"\3\2\2\2\u0603\u0618\5\u00d8m\2\u0604\u0606\7C\2\2\u0605\u0604\3\2\2\2"+
		"\u0605\u0606\3\2\2\2\u0606\u0608\3\2\2\2\u0607\u0609\7}\2\2\u0608\u0607"+
		"\3\2\2\2\u0608\u0609\3\2\2\2\u0609\u060b\3\2\2\2\u060a\u060c\7C\2\2\u060b"+
		"\u060a\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u060d\3\2\2\2\u060d\u060f\7#"+
		"\2\2\u060e\u0610\7C\2\2\u060f\u060e\3\2\2\2\u060f\u0610\3\2\2\2\u0610"+
		"\u0612\3\2\2\2\u0611\u0613\7}\2\2\u0612\u0611\3\2\2\2\u0612\u0613\3\2"+
		"\2\2\u0613\u0615\3\2\2\2\u0614\u0616\7C\2\2\u0615\u0614\3\2\2\2\u0615"+
		"\u0616\3\2\2\2\u0616\u0617\3\2\2\2\u0617\u0619\5\u00d6l\2\u0618\u0605"+
		"\3\2\2\2\u0618\u0619\3\2\2\2\u0619\u00d7\3\2\2\2\u061a\u062f\5\u00dan"+
		"\2\u061b\u061d\7C\2\2\u061c\u061b\3\2\2\2\u061c\u061d\3\2\2\2\u061d\u061f"+
		"\3\2\2\2\u061e\u0620\7}\2\2\u061f\u061e\3\2\2\2\u061f\u0620\3\2\2\2\u0620"+
		"\u0622\3\2\2\2\u0621\u0623\7C\2\2\u0622\u0621\3\2\2\2\u0622\u0623\3\2"+
		"\2\2\u0623\u0624\3\2\2\2\u0624\u0626\7\24\2\2\u0625\u0627\7C\2\2\u0626"+
		"\u0625\3\2\2\2\u0626\u0627\3\2\2\2\u0627\u0629\3\2\2\2\u0628\u062a\7}"+
		"\2\2\u0629\u0628\3\2\2\2\u0629\u062a\3\2\2\2\u062a\u062c\3\2\2\2\u062b"+
		"\u062d\7C\2\2\u062c\u062b\3\2\2\2\u062c\u062d\3\2\2\2\u062d\u062e\3\2"+
		"\2\2\u062e\u0630\5\u00d8m\2\u062f\u061c\3\2\2\2\u062f\u0630\3\2\2\2\u0630"+
		"\u00d9\3\2\2\2\u0631\u0647\5\u00dco\2\u0632\u0634\7C\2\2\u0633\u0632\3"+
		"\2\2\2\u0633\u0634\3\2\2\2\u0634\u0636\3\2\2\2\u0635\u0637\7}\2\2\u0636"+
		"\u0635\3\2\2\2\u0636\u0637\3\2\2\2\u0637\u0639\3\2\2\2\u0638\u063a\7C"+
		"\2\2\u0639\u0638\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u063b\3\2\2\2\u063b"+
		"\u063d\5^\60\2\u063c\u063e\7C\2\2\u063d\u063c\3\2\2\2\u063d\u063e\3\2"+
		"\2\2\u063e\u0640\3\2\2\2\u063f\u0641\7}\2\2\u0640\u063f\3\2\2\2\u0640"+
		"\u0641\3\2\2\2\u0641\u0643\3\2\2\2\u0642\u0644\7C\2\2\u0643\u0642\3\2"+
		"\2\2\u0643\u0644\3\2\2\2\u0644\u0645\3\2\2\2\u0645\u0646\5\u00dan\2\u0646"+
		"\u0648\3\2\2\2\u0647\u0633\3\2\2\2\u0647\u0648\3\2\2\2\u0648\u00db\3\2"+
		"\2\2\u0649\u065f\5\u00dep\2\u064a\u064c\7C\2\2\u064b\u064a\3\2\2\2\u064b"+
		"\u064c\3\2\2\2\u064c\u064e\3\2\2\2\u064d\u064f\7}\2\2\u064e\u064d\3\2"+
		"\2\2\u064e\u064f\3\2\2\2\u064f\u0651\3\2\2\2\u0650\u0652\7C\2\2\u0651"+
		"\u0650\3\2\2\2\u0651\u0652\3\2\2\2\u0652\u0653\3\2\2\2\u0653\u0655\5P"+
		")\2\u0654\u0656\7C\2\2\u0655\u0654\3\2\2\2\u0655\u0656\3\2\2\2\u0656\u0658"+
		"\3\2\2\2\u0657\u0659\7}\2\2\u0658\u0657\3\2\2\2\u0658\u0659\3\2\2\2\u0659"+
		"\u065b\3\2\2\2\u065a\u065c\7C\2\2\u065b\u065a\3\2\2\2\u065b\u065c\3\2"+
		"\2\2\u065c\u065d\3\2\2\2\u065d\u065e\5\u00dco\2\u065e\u0660\3\2\2\2\u065f"+
		"\u064b\3\2\2\2\u065f\u0660\3\2\2\2\u0660\u00dd\3\2\2\2\u0661\u0676\5\u00e0"+
		"q\2\u0662\u0664\7C\2\2\u0663\u0662\3\2\2\2\u0663\u0664\3\2\2\2\u0664\u0666"+
		"\3\2\2\2\u0665\u0667\7}\2\2\u0666\u0665\3\2\2\2\u0666\u0667\3\2\2\2\u0667"+
		"\u0669\3\2\2\2\u0668\u066a\7C\2\2\u0669\u0668\3\2\2\2\u0669\u066a\3\2"+
		"\2\2\u066a\u066b\3\2\2\2\u066b\u066d\t\25\2\2\u066c\u066e\7C\2\2\u066d"+
		"\u066c\3\2\2\2\u066d\u066e\3\2\2\2\u066e\u0670\3\2\2\2\u066f\u0671\7}"+
		"\2\2\u0670\u066f\3\2\2\2\u0670\u0671\3\2\2\2\u0671\u0673\3\2\2\2\u0672"+
		"\u0674\7C\2\2\u0673\u0672\3\2\2\2\u0673\u0674\3\2\2\2\u0674\u0675\3\2"+
		"\2\2\u0675\u0677\5\u00dep\2\u0676\u0663\3\2\2\2\u0676\u0677\3\2\2\2\u0677"+
		"\u00df\3\2\2\2\u0678\u068d\5\u00e2r\2\u0679\u067b\7C\2\2\u067a\u0679\3"+
		"\2\2\2\u067a\u067b\3\2\2\2\u067b\u067d\3\2\2\2\u067c\u067e\7}\2\2\u067d"+
		"\u067c\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u0680\3\2\2\2\u067f\u0681\7C"+
		"\2\2\u0680\u067f\3\2\2\2\u0680\u0681\3\2\2\2\u0681\u0682\3\2\2\2\u0682"+
		"\u0684\t\26\2\2\u0683\u0685\7C\2\2\u0684\u0683\3\2\2\2\u0684\u0685\3\2"+
		"\2\2\u0685\u0687\3\2\2\2\u0686\u0688\7}\2\2\u0687\u0686\3\2\2\2\u0687"+
		"\u0688\3\2\2\2\u0688\u068a\3\2\2\2\u0689\u068b\7C\2\2\u068a\u0689\3\2"+
		"\2\2\u068a\u068b\3\2\2\2\u068b\u068c\3\2\2\2\u068c\u068e\5\u00e0q\2\u068d"+
		"\u067a\3\2\2\2\u068d\u068e\3\2\2\2\u068e\u00e1\3\2\2\2\u068f\u06a4\5\u00e4"+
		"s\2\u0690\u0692\7C\2\2\u0691\u0690\3\2\2\2\u0691\u0692\3\2\2\2\u0692\u0694"+
		"\3\2\2\2\u0693\u0695\7}\2\2\u0694\u0693\3\2\2\2\u0694\u0695\3\2\2\2\u0695"+
		"\u0697\3\2\2\2\u0696\u0698\7C\2\2\u0697\u0696\3\2\2\2\u0697\u0698\3\2"+
		"\2\2\u0698\u0699\3\2\2\2\u0699\u069b\t\27\2\2\u069a\u069c\7C\2\2\u069b"+
		"\u069a\3\2\2\2\u069b\u069c\3\2\2\2\u069c\u069e\3\2\2\2\u069d\u069f\7}"+
		"\2\2\u069e\u069d\3\2\2\2\u069e\u069f\3\2\2\2\u069f\u06a1\3\2\2\2\u06a0"+
		"\u06a2\7C\2\2\u06a1\u06a0\3\2\2\2\u06a1\u06a2\3\2\2\2\u06a2\u06a3\3\2"+
		"\2\2\u06a3\u06a5\5\u00e2r\2\u06a4\u0691\3\2\2\2\u06a4\u06a5\3\2\2\2\u06a5"+
		"\u00e3\3\2\2\2\u06a6\u06a7\7\3\2\2\u06a7\u06a8\5V,\2\u06a8\u06a9\5\u00c2"+
		"b\2\u06a9\u06aa\7\4\2\2\u06aa\u06ab\7\3\2\2\u06ab\u06ac\5\u0102\u0082"+
		"\2\u06ac\u06ad\7\4\2\2\u06ad\u06b0\3\2\2\2\u06ae\u06b0\5\u00e6t\2\u06af"+
		"\u06a6\3\2\2\2\u06af\u06ae\3\2\2\2\u06b0\u00e5\3\2\2\2\u06b1\u06b2\7\3"+
		"\2\2\u06b2\u06b3\5\u00e8u\2\u06b3\u06b4\7\4\2\2\u06b4\u06b5\5\u00e6t\2"+
		"\u06b5\u06b8\3\2\2\2\u06b6\u06b8\5\u00eav\2\u06b7\u06b1\3\2\2\2\u06b7"+
		"\u06b6\3\2\2\2\u06b8\u00e7\3\2\2\2\u06b9\u06ba\5\u00b4[\2\u06ba\u00e9"+
		"\3\2\2\2\u06bb\u06c3\5\u00ecw\2\u06bc\u06c3\5\u00f0y\2\u06bd\u06c3\5\u00f2"+
		"z\2\u06be\u06c3\5\u00eex\2\u06bf\u06c3\5\u00fe\u0080\2\u06c0\u06c3\5\u00f6"+
		"|\2\u06c1\u06c3\5\64\33\2\u06c2\u06bb\3\2\2\2\u06c2\u06bc\3\2\2\2\u06c2"+
		"\u06bd\3\2\2\2\u06c2\u06be\3\2\2\2\u06c2\u06bf\3\2\2\2\u06c2\u06c0\3\2"+
		"\2\2\u06c2\u06c1\3\2\2\2\u06c3\u00eb\3\2\2\2\u06c4\u06c5\7\24\2\2\u06c5"+
		"\u06c6\5\u00c2b\2\u06c6\u00ed\3\2\2\2\u06c7\u06c9\7;\2\2\u06c8\u06c7\3"+
		"\2\2\2\u06c8\u06c9\3\2\2\2\u06c9\u06ca\3\2\2\2\u06ca\u06cc\7d\2\2\u06cb"+
		"\u06cd\7C\2\2\u06cc\u06cb\3\2\2\2\u06cc\u06cd\3\2\2\2\u06cd\u06cf\3\2"+
		"\2\2\u06ce\u06d0\7}\2\2\u06cf\u06ce\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0"+
		"\u06d2\3\2\2\2\u06d1\u06d3\7C\2\2\u06d2\u06d1\3\2\2\2\u06d2\u06d3\3\2"+
		"\2\2\u06d3\u06d4\3\2\2\2\u06d4\u06d6\5\u00b4[\2\u06d5\u06d7\7C\2\2\u06d6"+
		"\u06d5\3\2\2\2\u06d6\u06d7\3\2\2\2\u06d7\u06d9\3\2\2\2\u06d8\u06da\7}"+
		"\2\2\u06d9\u06d8\3\2\2\2\u06d9\u06da\3\2\2\2\u06da\u06dc\3\2\2\2\u06db"+
		"\u06dd\7C\2\2\u06dc\u06db\3\2\2\2\u06dc\u06dd\3\2\2\2\u06dd\u06de\3\2"+
		"\2\2\u06de\u06e0\7\37\2\2\u06df\u06e1\5\u00ceh\2\u06e0\u06df\3\2\2\2\u06e0"+
		"\u06e1\3\2\2\2\u06e1\u06e2\3\2\2\2\u06e2\u06e3\7 \2\2\u06e3\u0702\3\2"+
		"\2\2\u06e4\u06e6\7;\2\2\u06e5\u06e4\3\2\2\2\u06e5\u06e6\3\2\2\2\u06e6"+
		"\u06e7\3\2\2\2\u06e7\u06e9\7d\2\2\u06e8\u06ea\7C\2\2\u06e9\u06e8\3\2\2"+
		"\2\u06e9\u06ea\3\2\2\2\u06ea\u06ec\3\2\2\2\u06eb\u06ed\7}\2\2\u06ec\u06eb"+
		"\3\2\2\2\u06ec\u06ed\3\2\2\2\u06ed\u06ef\3\2\2\2\u06ee\u06f0\7C\2\2\u06ef"+
		"\u06ee\3\2\2\2\u06ef\u06f0\3\2\2\2\u06f0\u06f1\3\2\2\2\u06f1\u06f3\5\u00b4"+
		"[\2\u06f2\u06f4\7C\2\2\u06f3\u06f2\3\2\2\2\u06f3\u06f4\3\2\2\2\u06f4\u06f6"+
		"\3\2\2\2\u06f5\u06f7\7}\2\2\u06f6\u06f5\3\2\2\2\u06f6\u06f7\3\2\2\2\u06f7"+
		"\u06f9\3\2\2\2\u06f8\u06fa\7C\2\2\u06f9\u06f8\3\2\2\2\u06f9\u06fa\3\2"+
		"\2\2\u06fa\u06fb\3\2\2\2\u06fb\u06fd\7\3\2\2\u06fc\u06fe\5\u00caf\2\u06fd"+
		"\u06fc\3\2\2\2\u06fd\u06fe\3\2\2\2\u06fe\u06ff\3\2\2\2\u06ff\u0700\7\4"+
		"\2\2\u0700\u0702\3\2\2\2\u0701\u06c8\3\2\2\2\u0701\u06e5\3\2\2\2\u0702"+
		"\u00ef\3\2\2\2\u0703\u0705\5N(\2\u0704\u0706\7C\2\2\u0705\u0704\3\2\2"+
		"\2\u0705\u0706\3\2\2\2\u0706\u0708\3\2\2\2\u0707\u0709\7}\2\2\u0708\u0707"+
		"\3\2\2\2\u0708\u0709\3\2\2\2\u0709\u070b\3\2\2\2\u070a\u070c\7C\2\2\u070b"+
		"\u070a\3\2\2\2\u070b\u070c\3\2\2\2\u070c\u070d\3\2\2\2\u070d\u070e\5\u00e6"+
		"t\2\u070e\u00f1\3\2\2\2\u070f\u0711\5\u00f4{\2\u0710\u0712\7C\2\2\u0711"+
		"\u0710\3\2\2\2\u0711\u0712\3\2\2\2\u0712\u0714\3\2\2\2\u0713\u0715\7}"+
		"\2\2\u0714\u0713\3\2\2\2\u0714\u0715\3\2\2\2\u0715\u0717\3\2\2\2\u0716"+
		"\u0718\7C\2\2\u0717\u0716\3\2\2\2\u0717\u0718\3\2\2\2\u0718\u0719\3\2"+
		"\2\2\u0719\u071a\7\3\2\2\u071a\u071b\5\u00f8}\2\u071b\u071c\7\4\2\2\u071c"+
		"\u072a\3\2\2\2\u071d\u071f\5\u00f4{\2\u071e\u0720\7C\2\2\u071f\u071e\3"+
		"\2\2\2\u071f\u0720\3\2\2\2\u0720\u0722\3\2\2\2\u0721\u0723\7}\2\2\u0722"+
		"\u0721\3\2\2\2\u0722\u0723\3\2\2\2\u0723\u0725\3\2\2\2\u0724\u0726\7C"+
		"\2\2\u0725\u0724\3\2\2\2\u0725\u0726\3\2\2\2\u0726\u0727\3\2\2\2\u0727"+
		"\u0728\5\u00fa~\2\u0728\u072a\3\2\2\2\u0729\u070f\3\2\2\2\u0729\u071d"+
		"\3\2\2\2\u072a\u00f3\3\2\2\2\u072b\u072c\7@\2\2\u072c\u00f5\3\2\2\2\u072d"+
		"\u072f\7A\2\2\u072e\u0730\7C\2\2\u072f\u072e\3\2\2\2\u072f\u0730\3\2\2"+
		"\2\u0730\u0732\3\2\2\2\u0731\u0733\7}\2\2\u0732\u0731\3\2\2\2\u0732\u0733"+
		"\3\2\2\2\u0733\u0735\3\2\2\2\u0734\u0736\7C\2\2\u0735\u0734\3\2\2\2\u0735"+
		"\u0736\3\2\2\2\u0736\u0737\3\2\2\2\u0737\u0738\7\3\2\2\u0738\u0739\5\u00ca"+
		"f\2\u0739\u073a\7\4\2\2\u073a\u0747\3\2\2\2\u073b\u073d\7A\2\2\u073c\u073e"+
		"\7C\2\2\u073d\u073c\3\2\2\2\u073d\u073e\3\2\2\2\u073e\u0740\3\2\2\2\u073f"+
		"\u0741\7}\2\2\u0740\u073f\3\2\2\2\u0740\u0741\3\2\2\2\u0741\u0743\3\2"+
		"\2\2\u0742\u0744\7C\2\2\u0743\u0742\3\2\2\2\u0743\u0744\3\2\2\2\u0744"+
		"\u0745\3\2\2\2\u0745\u0747\5\u00caf\2\u0746\u072d\3\2\2\2\u0746\u073b"+
		"\3\2\2\2\u0747\u00f7\3\2\2\2\u0748\u0755\5\u00b4[\2\u0749\u074b\7C\2\2"+
		"\u074a\u0749\3\2\2\2\u074a\u074b\3\2\2\2\u074b\u074d\3\2\2\2\u074c\u074e"+
		"\7}\2\2\u074d\u074c\3\2\2\2\u074d\u074e\3\2\2\2\u074e\u0750\3\2\2\2\u074f"+
		"\u0751\7C\2\2\u0750\u074f\3\2\2\2\u0750\u0751\3\2\2\2\u0751\u0752\3\2"+
		"\2\2\u0752\u0754\5V,\2\u0753\u074a\3\2\2\2\u0754\u0757\3\2\2\2\u0755\u0753"+
		"\3\2\2\2\u0755\u0756\3\2\2\2\u0756\u00f9\3\2\2\2\u0757\u0755\3\2\2\2\u0758"+
		"\u0759\5\u00eav\2\u0759\u00fb\3\2\2\2\u075a\u075b\t\30\2\2\u075b\u00fd"+
		"\3\2\2\2\u075c\u075e\b\u0080\1\2\u075d\u075f\5\u00b4[\2\u075e\u075d\3"+
		"\2\2\2\u075e\u075f\3\2\2\2\u075f\u0760\3\2\2\2\u0760\u0775\5\u0100\u0081"+
		"\2\u0761\u0775\5\u0106\u0084\2\u0762\u0764\5V,\2\u0763\u0762\3\2\2\2\u0763"+
		"\u0764\3\2\2\2\u0764\u0765\3\2\2\2\u0765\u0767\5\u00fc\177\2\u0766\u0768"+
		"\7C\2\2\u0767\u0766\3\2\2\2\u0767\u0768\3\2\2\2\u0768\u076a\3\2\2\2\u0769"+
		"\u076b\7}\2\2\u076a\u0769\3\2\2\2\u076a\u076b\3\2\2\2\u076b\u076d\3\2"+
		"\2\2\u076c\u076e\7C\2\2\u076d\u076c\3\2\2\2\u076d\u076e\3\2\2\2\u076e"+
		"\u0770\3\2\2\2\u076f\u0771\5V,\2\u0770\u076f\3\2\2\2\u0770\u0771\3\2\2"+
		"\2\u0771\u0772\3\2\2\2\u0772\u0773\5\u0106\u0084\2\u0773\u0775\3\2\2\2"+
		"\u0774\u075c\3\2\2\2\u0774\u0761\3\2\2\2\u0774\u0763\3\2\2\2\u0775\u07be"+
		"\3\2\2\2\u0776\u0778\f\n\2\2\u0777\u0779\7C\2\2\u0778\u0777\3\2\2\2\u0778"+
		"\u0779\3\2\2\2\u0779\u077b\3\2\2\2\u077a\u077c\7}\2\2\u077b\u077a\3\2"+
		"\2\2\u077b\u077c\3\2\2\2\u077c\u077e\3\2\2\2\u077d\u077f\7C\2\2\u077e"+
		"\u077d\3\2\2\2\u077e\u077f\3\2\2\2\u077f\u0780\3\2\2\2\u0780\u0782\7\37"+
		"\2\2\u0781\u0783\5\u00caf\2\u0782\u0781\3\2\2\2\u0782\u0783\3\2\2\2\u0783"+
		"\u0784\3\2\2\2\u0784\u07bd\7 \2\2\u0785\u0787\f\t\2\2\u0786\u0788\7C\2"+
		"\2\u0787\u0786\3\2\2\2\u0787\u0788\3\2\2\2\u0788\u078a\3\2\2\2\u0789\u078b"+
		"\7}\2\2\u078a\u0789\3\2\2\2\u078a\u078b\3\2\2\2\u078b\u078d\3\2\2\2\u078c"+
		"\u078e\7C\2\2\u078d\u078c\3\2\2\2\u078d\u078e\3\2\2\2\u078e\u078f\3\2"+
		"\2\2\u078f\u0790\7\3\2\2\u0790\u0791\5\u0102\u0082\2\u0791\u0792\7\4\2"+
		"\2\u0792\u07bd\3\2\2\2\u0793\u0794\f\b\2\2\u0794\u0796\7B\2\2\u0795\u0797"+
		"\7C\2\2\u0796\u0795\3\2\2\2\u0796\u0797\3\2\2\2\u0797\u0799\3\2\2\2\u0798"+
		"\u079a\7}\2\2\u0799\u0798\3\2\2\2\u0799\u079a\3\2\2\2\u079a\u079c\3\2"+
		"\2\2\u079b\u079d\7C\2\2\u079c\u079b\3\2\2\2\u079c\u079d\3\2\2\2\u079d"+
		"\u079f\3\2\2\2\u079e\u07a0\7b\2\2\u079f\u079e\3\2\2\2\u079f\u07a0\3\2"+
		"\2\2\u07a0\u07a1\3\2\2\2\u07a1\u07bd\5\u00c2b\2\u07a2\u07a3\f\7\2\2\u07a3"+
		"\u07a5\79\2\2\u07a4\u07a6\7C\2\2\u07a5\u07a4\3\2\2\2\u07a5\u07a6\3\2\2"+
		"\2\u07a6\u07a8\3\2\2\2\u07a7\u07a9\7}\2\2\u07a8\u07a7\3\2\2\2\u07a8\u07a9"+
		"\3\2\2\2\u07a9\u07ab\3\2\2\2\u07aa\u07ac\7C\2\2\u07ab\u07aa\3\2\2\2\u07ab"+
		"\u07ac\3\2\2\2\u07ac\u07ae\3\2\2\2\u07ad\u07af\7b\2\2\u07ae\u07ad\3\2"+
		"\2\2\u07ae\u07af\3\2\2\2\u07af\u07b0\3\2\2\2\u07b0\u07bd\5\u00c2b\2\u07b1"+
		"\u07b3\f\6\2\2\u07b2\u07b4\7C\2\2\u07b3\u07b2\3\2\2\2\u07b3\u07b4\3\2"+
		"\2\2\u07b4\u07b6\3\2\2\2\u07b5\u07b7\7}\2\2\u07b6\u07b5\3\2\2\2\u07b6"+
		"\u07b7\3\2\2\2\u07b7\u07b9\3\2\2\2\u07b8\u07ba\7C\2\2\u07b9\u07b8\3\2"+
		"\2\2\u07b9\u07ba\3\2\2\2\u07ba\u07bb\3\2\2\2\u07bb\u07bd\5\u00fc\177\2"+
		"\u07bc\u0776\3\2\2\2\u07bc\u0785\3\2\2\2\u07bc\u0793\3\2\2\2\u07bc\u07a2"+
		"\3\2\2\2\u07bc\u07b1\3\2\2\2\u07bd\u07c0\3\2\2\2\u07be\u07bc\3\2\2\2\u07be"+
		"\u07bf\3\2\2\2\u07bf\u00ff\3\2\2\2\u07c0\u07be\3\2\2\2\u07c1\u07c3\7w"+
		"\2\2\u07c2\u07c4\7C\2\2\u07c3\u07c2\3\2\2\2\u07c3\u07c4\3\2\2\2\u07c4"+
		"\u07cb\3\2\2\2\u07c5\u07c7\7}\2\2\u07c6\u07c8\7C\2\2\u07c7\u07c6\3\2\2"+
		"\2\u07c7\u07c8\3\2\2\2\u07c8\u07ca\3\2\2\2\u07c9\u07c5\3\2\2\2\u07ca\u07cd"+
		"\3\2\2\2\u07cb\u07c9\3\2\2\2\u07cb\u07cc\3\2\2\2\u07cc\u07cf\3\2\2\2\u07cd"+
		"\u07cb\3\2\2\2\u07ce\u07d0\5\u0102\u0082\2\u07cf\u07ce\3\2\2\2\u07cf\u07d0"+
		"\3\2\2\2\u07d0\u07d2\3\2\2\2\u07d1\u07d3\7C\2\2\u07d2\u07d1\3\2\2\2\u07d2"+
		"\u07d3\3\2\2\2\u07d3\u07da\3\2\2\2\u07d4\u07d6\7}\2\2\u07d5\u07d7\7C\2"+
		"\2\u07d6\u07d5\3\2\2\2\u07d6\u07d7\3\2\2\2\u07d7\u07d9\3\2\2\2\u07d8\u07d4"+
		"\3\2\2\2\u07d9\u07dc\3\2\2\2\u07da\u07d8\3\2\2\2\u07da\u07db\3\2\2\2\u07db"+
		"\u07dd\3\2\2\2\u07dc\u07da\3\2\2\2\u07dd\u07de\7x\2\2\u07de\u0101\3\2"+
		"\2\2\u07df\u07e1\7C\2\2\u07e0\u07df\3\2\2\2\u07e0\u07e1\3\2\2\2\u07e1"+
		"\u07e3\3\2\2\2\u07e2\u07e4\7}\2\2\u07e3\u07e2\3\2\2\2\u07e3\u07e4\3\2"+
		"\2\2\u07e4\u07e6\3\2\2\2\u07e5\u07e7\7C\2\2\u07e6\u07e5\3\2\2\2\u07e6"+
		"\u07e7\3\2\2\2\u07e7\u07e8\3\2\2\2\u07e8\u07ea\5\u0104\u0083\2\u07e9\u07e0"+
		"\3\2\2\2\u07e9\u07ea\3\2\2\2\u07ea\u07ec\3\2\2\2\u07eb\u07ed\7C\2\2\u07ec"+
		"\u07eb\3\2\2\2\u07ec\u07ed\3\2\2\2\u07ed\u07ef\3\2\2\2\u07ee\u07f0\7}"+
		"\2\2\u07ef\u07ee\3\2\2\2\u07ef\u07f0\3\2\2\2\u07f0\u07f2\3\2\2\2\u07f1"+
		"\u07f3\7C\2\2\u07f2\u07f1\3\2\2\2\u07f2\u07f3\3\2\2\2\u07f3\u0806\3\2"+
		"\2\2\u07f4\u07f6\7\17\2\2\u07f5\u07f4\3\2\2\2\u07f5\u07f6\3\2\2\2\u07f6"+
		"\u07f8\3\2\2\2\u07f7\u07f9\7C\2\2\u07f8\u07f7\3\2\2\2\u07f8\u07f9\3\2"+
		"\2\2\u07f9\u0800\3\2\2\2\u07fa\u07fc\7}\2\2\u07fb\u07fd\7C\2\2\u07fc\u07fb"+
		"\3\2\2\2\u07fc\u07fd\3\2\2\2\u07fd\u07ff\3\2\2\2\u07fe\u07fa\3\2\2\2\u07ff"+
		"\u0802\3\2\2\2\u0800\u07fe\3\2\2\2\u0800\u0801\3\2\2\2\u0801\u0803\3\2"+
		"\2\2\u0802\u0800\3\2\2\2\u0803\u0805\5\u0104\u0083\2\u0804\u07f5\3\2\2"+
		"\2\u0805\u0808\3\2\2\2\u0806\u0804\3\2\2\2\u0806\u0807\3\2\2\2\u0807\u080a"+
		"\3\2\2\2\u0808\u0806\3\2\2\2\u0809\u080b\7\17\2\2\u080a\u0809\3\2\2\2"+
		"\u080a\u080b\3\2\2\2\u080b\u080e\3\2\2\2\u080c\u080e\7S\2\2\u080d\u07e9"+
		"\3\2\2\2\u080d\u080c\3\2\2\2\u080e\u0103\3\2\2\2\u080f\u0810\5\u00ccg"+
		"\2\u0810\u0105\3\2\2\2\u0811\u0813\7B\2\2\u0812\u0811\3\2\2\2\u0812\u0813"+
		"\3\2\2\2\u0813\u0814\3\2\2\2\u0814\u081b\5\u00c2b\2\u0815\u081b\5R*\2"+
		"\u0816\u0817\7\3\2\2\u0817\u0818\5\u00caf\2\u0818\u0819\7\4\2\2\u0819"+
		"\u081b\3\2\2\2\u081a\u0812\3\2\2\2\u081a\u0815\3\2\2\2\u081a\u0816\3\2"+
		"\2\2\u081b\u0107\3\2\2\2\u081c\u081d\7\5\2\2\u081d\u0109\3\2\2\2\u081e"+
		"\u081f\5\u010c\u0087\2\u081f\u0821\7\3\2\2\u0820\u0822\5\u00caf\2\u0821"+
		"\u0820\3\2\2\2\u0821\u0822\3\2\2\2\u0822\u0823\3\2\2\2\u0823\u0824\7\4"+
		"\2\2\u0824\u0831\3\2\2\2\u0825\u0827\5\u010c\u0087\2\u0826\u0828\7C\2"+
		"\2\u0827\u0826\3\2\2\2\u0827\u0828\3\2\2\2\u0828\u0829\3\2\2\2\u0829\u082b"+
		"\7%\2\2\u082a\u082c\7C\2\2\u082b\u082a\3\2\2\2\u082b\u082c\3\2\2\2\u082c"+
		"\u082d\3\2\2\2\u082d\u082e\5\u0104\u0083\2\u082e\u0831\3\2\2\2\u082f\u0831"+
		"\5\u010c\u0087\2\u0830\u081e\3\2\2\2\u0830\u0825\3\2\2\2\u0830\u082f\3"+
		"\2\2\2\u0831\u010b\3\2\2\2\u0832\u0834\5\u00c6d\2\u0833\u0832\3\2\2\2"+
		"\u0833\u0834\3\2\2\2\u0834\u0835\3\2\2\2\u0835\u0837\5\u00c2b\2\u0836"+
		"\u0838\5\u010e\u0088\2\u0837\u0836\3\2\2\2\u0837\u0838\3\2\2\2\u0838\u010d"+
		"\3\2\2\2\u0839\u083b\7\37\2\2\u083a\u083c\5\u00ceh\2\u083b\u083a\3\2\2"+
		"\2\u083b\u083c\3\2\2\2\u083c\u083d\3\2\2\2\u083d\u0840\7 \2\2\u083e\u0840"+
		"\5\u00bc_\2\u083f\u0839\3\2\2\2\u083f\u083e\3\2\2\2\u0840\u010f\3\2\2"+
		"\2\u018c\u0113\u0122\u012f\u0141\u0144\u0147\u014b\u014e\u0152\u015a\u015c"+
		"\u0162\u016e\u0173\u0176\u0179\u017f\u0187\u018d\u0193\u01a7\u01b2\u01ba"+
		"\u01c4\u01cd\u01cf\u01d5\u01da\u01de\u01e3\u01e9\u01ec\u01f0\u01f4\u01f8"+
		"\u01fc\u01ff\u0206\u020a\u0210\u021a\u021d\u0224\u022f\u0237\u023d\u0243"+
		"\u024a\u0251\u0265\u0269\u0270\u0276\u027b\u028c\u0292\u0298\u029d\u02a1"+
		"\u02ac\u02d6\u02ea\u02ec\u0308\u030f\u0314\u0318\u031b\u031e\u0322\u032e"+
		"\u0331\u0335\u0337\u033b\u033f\u0342\u0348\u034c\u0350\u0354\u035b\u035f"+
		"\u0364\u0366\u036a\u036e\u0372\u0376\u037a\u037f\u0384\u0389\u038c\u0392"+
		"\u0395\u039c\u039f\u03aa\u03b1\u03b7\u03c2\u03cc\u03d5\u03da\u03e0\u03e4"+
		"\u03e8\u03ea\u03ed\u03f4\u03f6\u03fb\u0402\u0405\u0409\u040c\u0412\u0414"+
		"\u0418\u041a\u041e\u0420\u0424\u0427\u042a\u042c\u0431\u0435\u0438\u043c"+
		"\u043e\u0441\u0447\u044a\u044e\u0451\u0455\u045c\u045f\u0462\u0466\u046a"+
		"\u046f\u0473\u0476\u047c\u047f\u0482\u048f\u0494\u0496\u0499\u049f\u04a1"+
		"\u04a6\u04aa\u04ae\u04b2\u04b4\u04ba\u04c2\u04c6\u04cc\u04d0\u04d4\u04d7"+
		"\u04d9\u04dd\u04e1\u04e5\u04e9\u04ed\u04f1\u04f5\u04f9\u04fb\u04fd\u0501"+
		"\u0505\u0507\u050d\u0516\u051b\u051e\u0521\u0525\u052a\u052d\u0534\u0536"+
		"\u0539\u0540\u0546\u054c\u0550\u0559\u055d\u0560\u0563\u0567\u056a\u056d"+
		"\u0570\u0576\u057b\u057e\u0581\u0585\u0588\u058b\u058f\u0594\u0597\u059a"+
		"\u059e\u05a1\u05a4\u05a8\u05ab\u05ae\u05b2\u05b5\u05b8\u05bc\u05c0\u05c3"+
		"\u05c6\u05ca\u05cd\u05d0\u05d3\u05d7\u05da\u05dd\u05e1\u05e4\u05e7\u05ea"+
		"\u05ee\u05f1\u05f4\u05f8\u05fb\u05fe\u0601\u0605\u0608\u060b\u060f\u0612"+
		"\u0615\u0618\u061c\u061f\u0622\u0626\u0629\u062c\u062f\u0633\u0636\u0639"+
		"\u063d\u0640\u0643\u0647\u064b\u064e\u0651\u0655\u0658\u065b\u065f\u0663"+
		"\u0666\u0669\u066d\u0670\u0673\u0676\u067a\u067d\u0680\u0684\u0687\u068a"+
		"\u068d\u0691\u0694\u0697\u069b\u069e\u06a1\u06a4\u06af\u06b7\u06c2\u06c8"+
		"\u06cc\u06cf\u06d2\u06d6\u06d9\u06dc\u06e0\u06e5\u06e9\u06ec\u06ef\u06f3"+
		"\u06f6\u06f9\u06fd\u0701\u0705\u0708\u070b\u0711\u0714\u0717\u071f\u0722"+
		"\u0725\u0729\u072f\u0732\u0735\u073d\u0740\u0743\u0746\u074a\u074d\u0750"+
		"\u0755\u075e\u0763\u0767\u076a\u076d\u0770\u0774\u0778\u077b\u077e\u0782"+
		"\u0787\u078a\u078d\u0796\u0799\u079c\u079f\u07a5\u07a8\u07ab\u07ae\u07b3"+
		"\u07b6\u07b9\u07bc\u07be\u07c3\u07c7\u07cb\u07cf\u07d2\u07d6\u07da\u07e0"+
		"\u07e3\u07e6\u07e9\u07ec\u07ef\u07f2\u07f5\u07f8\u07fc\u0800\u0806\u080a"+
		"\u080d\u0812\u081a\u0821\u0827\u082b\u0830\u0833\u0837\u083b\u083f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}