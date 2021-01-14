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
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, NEWLINE=66, 
		ESCAPE=67, ELLIPSIS=68, IF=69, ELSE=70, FOR=71, WHILE=72, BREAK=73, CASE=74, 
		CONTINUE=75, SWITCH=76, DO=77, GOTO=78, RETURN=79, TYPEDEF=80, STATIC=81, 
		VOID=82, UNSIGNED=83, SIGNED=84, CV_QUALIFIER=85, EXTERN=86, ASM=87, VIRTUAL=88, 
		TRY=89, CATCH=90, THROW=91, USING=92, NAMESPACE=93, AUTO=94, REGISTER=95, 
		SPECIAL_DATA=96, OPERATOR=97, TEMPLATE=98, CLASS_KEY=99, NEW=100, PRE_IF=101, 
		PRE_ELIF=102, PRE_ELSE=103, PRE_ENDIF=104, PRE_DEFINE=105, PRE_UNDEF=106, 
		PRE_DIAGNOSTIC=107, PRE_OTHER=108, PRE_INCLUDE=109, PRE_INCLUDE_NEXT=110, 
		PRE_LINE=111, PRE_PRAGMA=112, PRE_GCC=113, PRE_PRAGMA_KEYWORDS=114, PRE_STR=115, 
		PRE_ATTRIBUTE=116, END_TEST=117, ALPHA_NUMERIC=118, OPENING_CURLY=119, 
		CLOSING_CURLY=120, HEX_LITERAL=121, DECIMAL_LITERAL=122, OCTAL_LITERAL=123, 
		FLOATING_POINT_LITERAL=124, COMMENT=125, CHAR=126, STRING=127, WHITESPACE=128, 
		OTHER=129;
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
		RULE_function_def = 66, RULE_macroCall_asFunctionHeader = 67, RULE_return_type = 68, 
		RULE_function_param_list = 69, RULE_parameter_decl_clause = 70, RULE_parameter_decl = 71, 
		RULE_parameter_id = 72, RULE_compound_statement = 73, RULE_ctor_list = 74, 
		RULE_ctor_initializer = 75, RULE_initializer_id = 76, RULE_ctor_expr = 77, 
		RULE_function_name = 78, RULE_exception_specification = 79, RULE_type_id_list = 80, 
		RULE_simple_decl = 81, RULE_var_decl = 82, RULE_callingConvention = 83, 
		RULE_special_datatype = 84, RULE_init_declarator_list = 85, RULE_class_def = 86, 
		RULE_class_name = 87, RULE_base_classes = 88, RULE_base_class = 89, RULE_type_name = 90, 
		RULE_base_type = 91, RULE_parameter_name = 92, RULE_param_type_list = 93, 
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
		RULE_sizeof_operand2 = 124, RULE_inc_dec = 125, RULE_asmCall = 126, RULE_postfix_expression = 127, 
		RULE_initializer_expression = 128, RULE_argument_list = 129, RULE_argument = 130, 
		RULE_primary_expression = 131, RULE_null_expression = 132, RULE_init_declarator = 133, 
		RULE_declarator = 134, RULE_type_suffix = 135;
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
		"macroFunctionPointer", "testStart", "testEnd", "function_def", "macroCall_asFunctionHeader", 
		"return_type", "function_param_list", "parameter_decl_clause", "parameter_decl", 
		"parameter_id", "compound_statement", "ctor_list", "ctor_initializer", 
		"initializer_id", "ctor_expr", "function_name", "exception_specification", 
		"type_id_list", "simple_decl", "var_decl", "callingConvention", "special_datatype", 
		"init_declarator_list", "class_def", "class_name", "base_classes", "base_class", 
		"type_name", "base_type", "parameter_name", "param_type_list", "param_type", 
		"param_type_id", "identifier", "number", "ptrs", "func_ptrs", "expr", 
		"assign_expr", "conditional_expression", "or_expression", "and_expression", 
		"inclusive_or_expression", "exclusive_or_expression", "bit_and_expression", 
		"equality_expression", "relational_expression", "shift_expression", "additive_expression", 
		"multiplicative_expression", "function_pointer_use_expression", "cast_expression", 
		"cast_target", "unary_expression", "address_of_expression", "new_expression", 
		"unary_op_and_cast_expr", "sizeof_expression", "sizeof", "defined_expression", 
		"sizeof_operand", "sizeof_operand2", "inc_dec", "asmCall", "postfix_expression", 
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
		"'defined'", "':::'", "'.'", null, "'\\'", "'...'", "'if'", "'else'", 
		"'for'", "'while'", "'break'", "'case'", "'continue'", "'switch'", "'do'", 
		"'goto'", "'return'", "'typedef'", "'static'", "'void'", "'unsigned'", 
		"'signed'", null, "'extern'", null, "'virtual'", null, null, "'throw'", 
		"'using'", "'namespace'", "'auto'", "'register'", null, "'operator'", 
		"'template'", "'class'", "'new'", null, null, null, null, null, null, 
		null, null, null, null, null, null, "'GCC'", null, null, null, "'END_TEST'", 
		null, "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "NEWLINE", "ESCAPE", "ELLIPSIS", "IF", 
		"ELSE", "FOR", "WHILE", "BREAK", "CASE", "CONTINUE", "SWITCH", "DO", "GOTO", 
		"RETURN", "TYPEDEF", "STATIC", "VOID", "UNSIGNED", "SIGNED", "CV_QUALIFIER", 
		"EXTERN", "ASM", "VIRTUAL", "TRY", "CATCH", "THROW", "USING", "NAMESPACE", 
		"AUTO", "REGISTER", "SPECIAL_DATA", "OPERATOR", "TEMPLATE", "CLASS_KEY", 
		"NEW", "PRE_IF", "PRE_ELIF", "PRE_ELSE", "PRE_ENDIF", "PRE_DEFINE", "PRE_UNDEF", 
		"PRE_DIAGNOSTIC", "PRE_OTHER", "PRE_INCLUDE", "PRE_INCLUDE_NEXT", "PRE_LINE", 
		"PRE_PRAGMA", "PRE_GCC", "PRE_PRAGMA_KEYWORDS", "PRE_STR", "PRE_ATTRIBUTE", 
		"END_TEST", "ALPHA_NUMERIC", "OPENING_CURLY", "CLOSING_CURLY", "HEX_LITERAL", 
		"DECIMAL_LITERAL", "OCTAL_LITERAL", "FLOATING_POINT_LITERAL", "COMMENT", 
		"CHAR", "STRING", "WHITESPACE", "OTHER"
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
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (ASM - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)))) != 0) || _la==WHITESPACE || _la==OTHER) {
				{
				{
				setState(272);
				statement();
				}
				}
				setState(277);
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
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				opening_curly();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				closing_curly();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				block_starter();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				jump_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(282);
				label();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(283);
				simple_decl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(284);
				expr_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(285);
				pre_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(286);
				comment();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(287);
				newline();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(288);
				custom();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(289);
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
			setState(292);
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
			setState(294);
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
			setState(296);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
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
		public TerminalNode NEWLINE() { return getToken(FunctionParser.NEWLINE, 0); }
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
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
			setState(375);
			switch (_input.LA(1)) {
			case TRY:
				_localctx = new Try_statementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				match(TRY);
				}
				break;
			case CATCH:
				_localctx = new Catch_statementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				match(CATCH);
				setState(300);
				match(T__0);
				setState(303);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(301);
					param_type();
					}
					break;
				case 2:
					{
					setState(302);
					match(ELLIPSIS);
					}
					break;
				}
				setState(306);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(305);
					match(NEWLINE);
					}
				}

				setState(308);
				match(T__1);
				}
				break;
			case IF:
				_localctx = new If_statementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				match(IF);
				setState(310);
				match(T__0);
				setState(312);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(311);
					match(NEWLINE);
					}
				}

				setState(314);
				condition();
				setState(316);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(315);
					match(NEWLINE);
					}
				}

				setState(318);
				match(T__1);
				}
				break;
			case ELSE:
				_localctx = new Else_statementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(320);
				match(ELSE);
				}
				break;
			case SWITCH:
				_localctx = new Switch_statementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(321);
				match(SWITCH);
				setState(322);
				match(T__0);
				setState(324);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(323);
					match(NEWLINE);
					}
				}

				setState(326);
				condition();
				setState(328);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(327);
					match(NEWLINE);
					}
				}

				setState(330);
				match(T__1);
				}
				break;
			case FOR:
				_localctx = new For_statementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(332);
				match(FOR);
				setState(333);
				match(T__0);
				setState(335);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(334);
					match(NEWLINE);
					}
				}

				setState(339);
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
				case T__23:
				case T__51:
				case T__52:
				case T__56:
				case T__57:
				case T__58:
				case T__61:
				case T__62:
				case T__64:
				case TYPEDEF:
				case STATIC:
				case VOID:
				case UNSIGNED:
				case SIGNED:
				case CV_QUALIFIER:
				case EXTERN:
				case ASM:
				case VIRTUAL:
				case TRY:
				case CATCH:
				case AUTO:
				case REGISTER:
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
					setState(337);
					for_init_statement();
					}
					break;
				case T__2:
					{
					setState(338);
					match(T__2);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(342);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(341);
					match(NEWLINE);
					}
				}

				setState(345);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__51) | (1L << T__52) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (STATIC - 65)) | (1L << (VOID - 65)) | (1L << (UNSIGNED - 65)) | (1L << (SIGNED - 65)) | (1L << (CV_QUALIFIER - 65)) | (1L << (EXTERN - 65)) | (1L << (ASM - 65)) | (1L << (VIRTUAL - 65)) | (1L << (TRY - 65)) | (1L << (CATCH - 65)) | (1L << (AUTO - 65)) | (1L << (REGISTER - 65)) | (1L << (SPECIAL_DATA - 65)) | (1L << (OPERATOR - 65)) | (1L << (CLASS_KEY - 65)) | (1L << (NEW - 65)) | (1L << (PRE_PRAGMA_KEYWORDS - 65)) | (1L << (END_TEST - 65)) | (1L << (ALPHA_NUMERIC - 65)) | (1L << (OPENING_CURLY - 65)) | (1L << (HEX_LITERAL - 65)) | (1L << (DECIMAL_LITERAL - 65)) | (1L << (OCTAL_LITERAL - 65)) | (1L << (FLOATING_POINT_LITERAL - 65)) | (1L << (CHAR - 65)) | (1L << (STRING - 65)))) != 0)) {
					{
					setState(344);
					condition();
					}
				}

				setState(347);
				match(T__2);
				setState(349);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(348);
					match(NEWLINE);
					}
					break;
				}
				setState(352);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__51) | (1L << T__52) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (STATIC - 65)) | (1L << (VOID - 65)) | (1L << (UNSIGNED - 65)) | (1L << (SIGNED - 65)) | (1L << (CV_QUALIFIER - 65)) | (1L << (EXTERN - 65)) | (1L << (ASM - 65)) | (1L << (VIRTUAL - 65)) | (1L << (TRY - 65)) | (1L << (CATCH - 65)) | (1L << (AUTO - 65)) | (1L << (REGISTER - 65)) | (1L << (SPECIAL_DATA - 65)) | (1L << (OPERATOR - 65)) | (1L << (CLASS_KEY - 65)) | (1L << (NEW - 65)) | (1L << (PRE_PRAGMA_KEYWORDS - 65)) | (1L << (END_TEST - 65)) | (1L << (ALPHA_NUMERIC - 65)) | (1L << (OPENING_CURLY - 65)) | (1L << (HEX_LITERAL - 65)) | (1L << (DECIMAL_LITERAL - 65)) | (1L << (OCTAL_LITERAL - 65)) | (1L << (FLOATING_POINT_LITERAL - 65)) | (1L << (CHAR - 65)) | (1L << (STRING - 65)))) != 0)) {
					{
					setState(351);
					expr();
					}
				}

				setState(355);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(354);
					match(NEWLINE);
					}
				}

				setState(357);
				match(T__1);
				setState(359);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(358);
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
				setState(361);
				match(DO);
				}
				break;
			case WHILE:
				_localctx = new While_statementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(362);
				match(WHILE);
				setState(363);
				match(T__0);
				setState(365);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(364);
					match(NEWLINE);
					}
				}

				setState(367);
				condition();
				setState(369);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(368);
					match(NEWLINE);
					}
				}

				setState(371);
				match(T__1);
				setState(373);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(372);
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
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				simple_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				expr();
				setState(379);
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
			setState(401);
			switch (_input.LA(1)) {
			case BREAK:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				match(BREAK);
				setState(384);
				match(T__2);
				}
				break;
			case CONTINUE:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				match(CONTINUE);
				setState(386);
				match(T__2);
				}
				break;
			case GOTO:
				_localctx = new GotoStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(387);
				match(GOTO);
				setState(388);
				identifier();
				setState(389);
				match(T__2);
				}
				break;
			case RETURN:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(391);
				match(RETURN);
				setState(393);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__51) | (1L << T__52) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (STATIC - 65)) | (1L << (VOID - 65)) | (1L << (UNSIGNED - 65)) | (1L << (SIGNED - 65)) | (1L << (CV_QUALIFIER - 65)) | (1L << (EXTERN - 65)) | (1L << (ASM - 65)) | (1L << (VIRTUAL - 65)) | (1L << (TRY - 65)) | (1L << (CATCH - 65)) | (1L << (AUTO - 65)) | (1L << (REGISTER - 65)) | (1L << (SPECIAL_DATA - 65)) | (1L << (OPERATOR - 65)) | (1L << (CLASS_KEY - 65)) | (1L << (NEW - 65)) | (1L << (PRE_PRAGMA_KEYWORDS - 65)) | (1L << (END_TEST - 65)) | (1L << (ALPHA_NUMERIC - 65)) | (1L << (OPENING_CURLY - 65)) | (1L << (HEX_LITERAL - 65)) | (1L << (DECIMAL_LITERAL - 65)) | (1L << (OCTAL_LITERAL - 65)) | (1L << (FLOATING_POINT_LITERAL - 65)) | (1L << (CHAR - 65)) | (1L << (STRING - 65)))) != 0)) {
					{
					setState(392);
					expr();
					}
				}

				setState(395);
				match(T__2);
				}
				break;
			case THROW:
				_localctx = new ThrowStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(396);
				match(THROW);
				setState(398);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__51) | (1L << T__52) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (STATIC - 65)) | (1L << (VOID - 65)) | (1L << (UNSIGNED - 65)) | (1L << (SIGNED - 65)) | (1L << (CV_QUALIFIER - 65)) | (1L << (EXTERN - 65)) | (1L << (ASM - 65)) | (1L << (VIRTUAL - 65)) | (1L << (TRY - 65)) | (1L << (CATCH - 65)) | (1L << (AUTO - 65)) | (1L << (REGISTER - 65)) | (1L << (SPECIAL_DATA - 65)) | (1L << (OPERATOR - 65)) | (1L << (CLASS_KEY - 65)) | (1L << (NEW - 65)) | (1L << (PRE_PRAGMA_KEYWORDS - 65)) | (1L << (END_TEST - 65)) | (1L << (ALPHA_NUMERIC - 65)) | (1L << (OPENING_CURLY - 65)) | (1L << (HEX_LITERAL - 65)) | (1L << (DECIMAL_LITERAL - 65)) | (1L << (OCTAL_LITERAL - 65)) | (1L << (FLOATING_POINT_LITERAL - 65)) | (1L << (CHAR - 65)) | (1L << (STRING - 65)))) != 0)) {
					{
					setState(397);
					expr();
					}
				}

				setState(400);
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
			setState(404);
			_la = _input.LA(1);
			if (_la==CASE) {
				{
				setState(403);
				match(CASE);
				}
			}

			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(406);
				identifier();
				}
				break;
			case 2:
				{
				setState(407);
				number();
				}
				break;
			case 3:
				{
				setState(408);
				match(CHAR);
				}
				break;
			case 4:
				{
				setState(409);
				cast_expression();
				}
				break;
			}
			setState(412);
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
			setState(418);
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
			case T__23:
			case T__51:
			case T__52:
			case T__56:
			case T__57:
			case T__58:
			case T__61:
			case T__62:
			case T__64:
			case STATIC:
			case VOID:
			case UNSIGNED:
			case SIGNED:
			case CV_QUALIFIER:
			case EXTERN:
			case ASM:
			case VIRTUAL:
			case TRY:
			case CATCH:
			case AUTO:
			case REGISTER:
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
				setState(414);
				expr();
				setState(415);
				match(T__2);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
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
			setState(420);
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
			setState(424);
			switch (_input.LA(1)) {
			case PRE_IF:
			case PRE_ELIF:
			case PRE_ELSE:
			case PRE_ENDIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
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
			case TRY:
			case CATCH:
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
				setState(423);
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
			setState(430);
			switch (_input.LA(1)) {
			case PRE_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				pre_if_statement();
				}
				break;
			case PRE_ELIF:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				pre_elif_statement();
				}
				break;
			case PRE_ELSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(428);
				pre_else_statement();
				}
				break;
			case PRE_ENDIF:
				enterOuterAlt(_localctx, 4);
				{
				setState(429);
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
			setState(432);
			match(PRE_IF);
			setState(433);
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
			setState(436);
			match(PRE_ELIF);
			setState(437);
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
			setState(440);
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
			setState(442);
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
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				match(T__0);
				setState(446);
				condition();
				setState(447);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(449);
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
			setState(461);
			switch (_input.LA(1)) {
			case PRE_DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				pre_define();
				}
				break;
			case PRE_UNDEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
				pre_undef();
				}
				break;
			case PRE_DIAGNOSTIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(454);
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
				setState(455);
				pre_other();
				}
				break;
			case PRE_INCLUDE:
				enterOuterAlt(_localctx, 5);
				{
				setState(456);
				pre_include();
				}
				break;
			case PRE_INCLUDE_NEXT:
				enterOuterAlt(_localctx, 6);
				{
				setState(457);
				pre_include_next();
				}
				break;
			case PRE_LINE:
				enterOuterAlt(_localctx, 7);
				{
				setState(458);
				pre_line();
				}
				break;
			case PRE_PRAGMA:
				enterOuterAlt(_localctx, 8);
				{
				setState(459);
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
			case TRY:
			case CATCH:
			case OPERATOR:
			case CLASS_KEY:
			case NEW:
			case PRE_PRAGMA_KEYWORDS:
			case END_TEST:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 9);
				{
				setState(460);
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
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				match(PRE_DEFINE);
				setState(464);
				pre_macro_identifier();
				setState(465);
				pre_macro();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				match(PRE_DEFINE);
				setState(468);
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
			setState(471);
			match(PRE_UNDEF);
			setState(472);
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
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				identifier();
				setState(479);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(475);
					match(T__0);
					setState(476);
					pre_macro_parameters();
					setState(477);
					match(T__1);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				keyword();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(482);
				match(END_TEST);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(483);
				match(T__4);
				setState(488);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(484);
					match(T__0);
					setState(485);
					pre_macro_parameters();
					setState(486);
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
		public TerminalNode TRY() { return getToken(FunctionParser.TRY, 0); }
		public TerminalNode CATCH() { return getToken(FunctionParser.CATCH, 0); }
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
			setState(492);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (STATIC - 81)) | (1L << (UNSIGNED - 81)) | (1L << (SIGNED - 81)) | (1L << (VIRTUAL - 81)) | (1L << (TRY - 81)) | (1L << (CATCH - 81)) | (1L << (OPERATOR - 81)) | (1L << (CLASS_KEY - 81)))) != 0)) ) {
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
			setState(496);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case NEW:
			case PRE_PRAGMA_KEYWORDS:
			case ALPHA_NUMERIC:
				{
				setState(494);
				identifier();
				}
				break;
			case ELLIPSIS:
				{
				setState(495);
				match(ELLIPSIS);
				}
				break;
			case T__1:
			case T__12:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(498);
				match(T__12);
				setState(501);
				switch (_input.LA(1)) {
				case T__8:
				case T__9:
				case T__10:
				case NEW:
				case PRE_PRAGMA_KEYWORDS:
				case ALPHA_NUMERIC:
					{
					setState(499);
					identifier();
					}
					break;
				case ELLIPSIS:
					{
					setState(500);
					match(ELLIPSIS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(507);
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
			setState(510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
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
			setState(512);
			pre_macro_identifier();
			setState(513);
			match(T__0);
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				{
				setState(516);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(514);
					expr();
					}
					break;
				case 2:
					{
					setState(515);
					type_name();
					}
					break;
				}
				setState(519);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(518);
					match(NEWLINE);
					}
				}

				}
				setState(531);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(521);
						match(T__12);
						setState(523);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(522);
							match(NEWLINE);
							}
						}

						setState(527);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
						case 1:
							{
							setState(525);
							expr();
							}
							break;
						case 2:
							{
							setState(526);
							type_name();
							}
							break;
						}
						}
						} 
					}
					setState(533);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				setState(535);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(534);
					match(T__12);
					}
				}

				}
				break;
			case 2:
				{
				setState(537);
				match(VOID);
				}
				break;
			}
			setState(540);
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
			setState(545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				match(PRE_DIAGNOSTIC);
				setState(543);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(544);
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
			setState(568);
			switch (_input.LA(1)) {
			case PRE_OTHER:
				enterOuterAlt(_localctx, 1);
				{
				setState(547);
				match(PRE_OTHER);
				setState(549);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(548);
					match(STRING);
					}
					break;
				}
				}
				break;
			case PRE_ATTRIBUTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(551);
				match(PRE_ATTRIBUTE);
				setState(552);
				match(T__0);
				setState(553);
				match(T__0);
				setState(555);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (STATIC - 81)) | (1L << (UNSIGNED - 81)) | (1L << (SIGNED - 81)) | (1L << (VIRTUAL - 81)) | (1L << (TRY - 81)) | (1L << (CATCH - 81)) | (1L << (OPERATOR - 81)) | (1L << (CLASS_KEY - 81)) | (1L << (NEW - 81)) | (1L << (PRE_PRAGMA_KEYWORDS - 81)) | (1L << (END_TEST - 81)) | (1L << (ALPHA_NUMERIC - 81)) | (1L << (HEX_LITERAL - 81)) | (1L << (DECIMAL_LITERAL - 81)) | (1L << (OCTAL_LITERAL - 81)) | (1L << (FLOATING_POINT_LITERAL - 81)) | (1L << (CHAR - 81)) | (1L << (STRING - 81)))) != 0)) {
					{
					setState(554);
					attributeList();
					}
				}

				setState(557);
				match(T__1);
				setState(558);
				match(T__1);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(559);
				match(T__13);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(560);
				match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(561);
				match(T__15);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 6);
				{
				setState(562);
				match(T__16);
				setState(563);
				match(T__0);
				setState(565);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (STATIC - 81)) | (1L << (UNSIGNED - 81)) | (1L << (SIGNED - 81)) | (1L << (VIRTUAL - 81)) | (1L << (TRY - 81)) | (1L << (CATCH - 81)) | (1L << (OPERATOR - 81)) | (1L << (CLASS_KEY - 81)) | (1L << (NEW - 81)) | (1L << (PRE_PRAGMA_KEYWORDS - 81)) | (1L << (END_TEST - 81)) | (1L << (ALPHA_NUMERIC - 81)) | (1L << (HEX_LITERAL - 81)) | (1L << (DECIMAL_LITERAL - 81)) | (1L << (OCTAL_LITERAL - 81)) | (1L << (FLOATING_POINT_LITERAL - 81)) | (1L << (CHAR - 81)) | (1L << (STRING - 81)))) != 0)) {
					{
					setState(564);
					attributeList();
					}
				}

				setState(567);
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
			setState(570);
			attribute();
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(571);
				match(T__12);
				setState(572);
				attribute();
				}
				}
				setState(577);
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
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(578);
				pre_macro_identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
				pre_macro_identifier();
				setState(580);
				match(T__0);
				setState(581);
				identifier();
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(582);
					match(T__12);
					setState(583);
					expr();
					}
					}
					setState(588);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(589);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(591);
				pre_macro_identifier();
				setState(592);
				match(T__0);
				setState(594);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__51) | (1L << T__52) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (STATIC - 65)) | (1L << (VOID - 65)) | (1L << (UNSIGNED - 65)) | (1L << (SIGNED - 65)) | (1L << (CV_QUALIFIER - 65)) | (1L << (EXTERN - 65)) | (1L << (ASM - 65)) | (1L << (VIRTUAL - 65)) | (1L << (TRY - 65)) | (1L << (CATCH - 65)) | (1L << (AUTO - 65)) | (1L << (REGISTER - 65)) | (1L << (SPECIAL_DATA - 65)) | (1L << (OPERATOR - 65)) | (1L << (CLASS_KEY - 65)) | (1L << (NEW - 65)) | (1L << (PRE_PRAGMA_KEYWORDS - 65)) | (1L << (END_TEST - 65)) | (1L << (ALPHA_NUMERIC - 65)) | (1L << (OPENING_CURLY - 65)) | (1L << (HEX_LITERAL - 65)) | (1L << (DECIMAL_LITERAL - 65)) | (1L << (OCTAL_LITERAL - 65)) | (1L << (FLOATING_POINT_LITERAL - 65)) | (1L << (CHAR - 65)) | (1L << (STRING - 65)))) != 0)) {
					{
					setState(593);
					expr();
					}
				}

				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(596);
					match(T__12);
					setState(597);
					expr();
					}
					}
					setState(602);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(603);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(605);
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
			setState(613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(608);
				match(PRE_INCLUDE);
				setState(609);
				pre_include_local_file();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(610);
				match(PRE_INCLUDE);
				setState(611);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(612);
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
			setState(620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(615);
				match(PRE_INCLUDE_NEXT);
				setState(616);
				pre_include_local_file();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(617);
				match(PRE_INCLUDE_NEXT);
				setState(618);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(619);
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
			setState(622);
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
			setState(624);
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
			setState(640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(626);
				match(PRE_LINE);
				setState(627);
				match(DECIMAL_LITERAL);
				setState(628);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(629);
				match(PRE_LINE);
				setState(630);
				match(DECIMAL_LITERAL);
				setState(631);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(632);
				match(PRE_LINE);
				setState(633);
				pre_macro_identifier();
				setState(634);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(636);
				match(PRE_LINE);
				setState(637);
				pre_macro_identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(638);
				match(PRE_LINE);
				setState(639);
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
			setState(662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(642);
				match(PRE_PRAGMA);
				setState(644);
				_la = _input.LA(1);
				if (_la==PRE_GCC) {
					{
					setState(643);
					match(PRE_GCC);
					}
				}

				setState(646);
				match(PRE_PRAGMA_KEYWORDS);
				setState(647);
				match(STRING);
				 preProcFindMacroEnd(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(649);
				match(PRE_PRAGMA);
				setState(651);
				_la = _input.LA(1);
				if (_la==PRE_GCC) {
					{
					setState(650);
					match(PRE_GCC);
					}
				}

				setState(653);
				match(PRE_PRAGMA_KEYWORDS);
				setState(657);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(654);
						identifier();
						}
						} 
					}
					setState(659);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(660);
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
			setState(664);
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
			setState(666);
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
			setState(668);
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
			setState(670);
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
			setState(700);
			switch (_input.LA(1)) {
			case HEX_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(672);
				match(HEX_LITERAL);
				}
				break;
			case OCTAL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(673);
				match(OCTAL_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(674);
				match(DECIMAL_LITERAL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(694); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(675);
						match(STRING);
						setState(679);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(676);
								match(NEWLINE);
								}
								} 
							}
							setState(681);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
						}
						setState(685);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(682);
								match(COMMENT);
								}
								} 
							}
							setState(687);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
						}
						setState(691);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(688);
								match(NEWLINE);
								}
								} 
							}
							setState(693);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(696); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(698);
				match(CHAR);
				}
				break;
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(699);
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
			setState(702);
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
			setState(704);
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
			setState(706);
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
			setState(753);
			switch (_input.LA(1)) {
			case T__27:
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(708);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==NEW) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(711);
				_la = _input.LA(1);
				if (_la==T__28) {
					{
					setState(709);
					match(T__28);
					setState(710);
					match(T__29);
					}
				}

				}
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(713);
				match(T__19);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(714);
				match(T__20);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(715);
				match(T__18);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 5);
				{
				setState(716);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 6);
				{
				setState(717);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 7);
				{
				setState(718);
				match(T__32);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 8);
				{
				setState(719);
				match(T__17);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 9);
				{
				setState(720);
				match(T__33);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 10);
				{
				setState(721);
				match(T__21);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 11);
				{
				setState(722);
				match(T__22);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 12);
				{
				setState(723);
				match(T__34);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 13);
				{
				setState(724);
				match(T__23);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 14);
				{
				setState(725);
				match(T__24);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 15);
				{
				setState(726);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 16);
				{
				setState(727);
				match(T__36);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 17);
				{
				setState(728);
				match(T__37);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 18);
				{
				setState(729);
				match(T__38);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 19);
				{
				setState(730);
				match(T__39);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 20);
				{
				setState(731);
				match(T__40);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 21);
				{
				setState(732);
				match(T__41);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 22);
				{
				setState(733);
				match(T__42);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 23);
				{
				setState(734);
				match(T__43);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 24);
				{
				setState(735);
				match(T__44);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 25);
				{
				setState(736);
				match(T__45);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 26);
				{
				setState(737);
				match(T__46);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 27);
				{
				setState(738);
				match(T__47);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 28);
				{
				setState(739);
				match(T__48);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 29);
				{
				setState(740);
				match(T__25);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 30);
				{
				setState(741);
				match(T__26);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 31);
				{
				setState(742);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 32);
				{
				setState(743);
				match(T__50);
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 33);
				{
				setState(744);
				match(T__51);
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 34);
				{
				setState(745);
				match(T__52);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 35);
				{
				setState(746);
				match(T__12);
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 36);
				{
				setState(747);
				match(T__53);
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 37);
				{
				setState(748);
				match(T__54);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 38);
				{
				setState(749);
				match(T__0);
				setState(750);
				match(T__1);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 39);
				{
				setState(751);
				match(T__28);
				setState(752);
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
			setState(755);
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
			setState(757);
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
			setState(759);
			match(TEMPLATE);
			setState(760);
			match(T__23);
			setState(761);
			template_param_list();
			setState(762);
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
			setState(773); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(773);
				switch (_input.LA(1)) {
				case T__23:
					{
					{
					setState(764);
					match(T__23);
					setState(765);
					template_param_list();
					setState(766);
					match(T__24);
					}
					}
					break;
				case T__0:
					{
					{
					setState(768);
					match(T__0);
					setState(769);
					template_param_list();
					setState(770);
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
				case T__64:
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
				case ASM:
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
					setState(772);
					no_angle_brackets_or_brackets();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(775); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (ASM - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)))) != 0) || _la==WHITESPACE || _la==OTHER );
			}
		}
		catch (RecognitionException re) {
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
			setState(777);
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
			setState(779);
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
			setState(781);
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
			setState(783);
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
			setState(785);
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
			setState(787);
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
			setState(789);
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
			setState(791);
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
			setState(793);
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
			setState(795);
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
			setState(797);
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
			setState(803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(799);
				asciiTab();
				}
				break;
			case 2:
				{
				setState(800);
				externC();
				}
				break;
			case 3:
				{
				setState(801);
				macroFunctionPointer();
				}
				break;
			case 4:
				{
				setState(802);
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
			setState(808); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(805);
					pre_macro_identifier();
					setState(806);
					match(T__12);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(810); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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
			setState(812);
			match(EXTERN);
			setState(813);
			match(T__55);
			setState(815);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(814);
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
			setState(817);
			macroCall();
			setState(819);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(818);
				match(NEWLINE);
				}
				break;
			}
			setState(822);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(821);
				pre_macro_identifier();
				}
				break;
			}
			setState(825);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(824);
				match(NEWLINE);
				}
			}

			setState(827);
			macroCall();
			setState(829);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(828);
				match(NEWLINE);
				}
			}

			setState(831);
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
			setState(833);
			match(T__4);
			setState(834);
			match(T__0);
			setState(835);
			function_name();
			setState(836);
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
			setState(838);
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
		public TerminalNode COMMENT() { return getToken(FunctionParser.COMMENT, 0); }
		public MacroCall_asFunctionHeaderContext macroCall_asFunctionHeader() {
			return getRuleContext(MacroCall_asFunctionHeaderContext.class,0);
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
			setState(886);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(841);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(840);
					template_decl_start();
					}
				}

				setState(844);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(843);
					return_type();
					}
					break;
				}
				setState(850);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0) || _la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(846);
					pre_other();
					setState(848);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(847);
						match(NEWLINE);
						}
					}

					}
				}

				setState(852);
				function_name();
				setState(854);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(853);
					match(NEWLINE);
					}
				}

				setState(856);
				function_param_list();
				setState(858);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(857);
					ctor_list();
					}
				}

				setState(861);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(860);
					match(NEWLINE);
					}
					break;
				}
				setState(864);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(863);
					match(COMMENT);
					}
				}

				setState(867);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(866);
					match(NEWLINE);
					}
				}

				setState(869);
				compound_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(872);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(871);
					return_type();
					}
					break;
				}
				setState(874);
				macroCall_asFunctionHeader();
				setState(876);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(875);
					match(NEWLINE);
					}
					break;
				}
				setState(879);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(878);
					match(COMMENT);
					}
				}

				setState(882);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(881);
					match(NEWLINE);
					}
				}

				setState(884);
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

	public static class MacroCall_asFunctionHeaderContext extends ParserRuleContext {
		public MacroCallContext macroCall() {
			return getRuleContext(MacroCallContext.class,0);
		}
		public MacroCall_asFunctionHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroCall_asFunctionHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterMacroCall_asFunctionHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitMacroCall_asFunctionHeader(this);
		}
	}

	public final MacroCall_asFunctionHeaderContext macroCall_asFunctionHeader() throws RecognitionException {
		MacroCall_asFunctionHeaderContext _localctx = new MacroCall_asFunctionHeaderContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_macroCall_asFunctionHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			macroCall();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 136, RULE_return_type);
		int _la;
		try {
			int _alt;
			setState(914);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(896);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(890);
						function_decl_specifiers();
						setState(892);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(891);
							match(NEWLINE);
							}
						}

						}
						} 
					}
					setState(898);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				}
				setState(899);
				type_name();
				}
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17 || _la==T__18) {
					{
					{
					setState(901);
					ptr_operator();
					setState(903);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(902);
						match(NEWLINE);
						}
					}

					}
					}
					setState(909);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(910);
				macroCall();
				setState(912);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(911);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
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
		public List<Parameter_nameContext> parameter_name() {
			return getRuleContexts(Parameter_nameContext.class);
		}
		public Parameter_nameContext parameter_name(int i) {
			return getRuleContext(Parameter_nameContext.class,i);
		}
		public List<Type_nameContext> type_name() {
			return getRuleContexts(Type_nameContext.class);
		}
		public Type_nameContext type_name(int i) {
			return getRuleContext(Type_nameContext.class,i);
		}
		public List<Parameter_idContext> parameter_id() {
			return getRuleContexts(Parameter_idContext.class);
		}
		public Parameter_idContext parameter_id(int i) {
			return getRuleContext(Parameter_idContext.class,i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(FunctionParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(FunctionParser.COMMENT, i);
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
		enterRule(_localctx, 138, RULE_function_param_list);
		int _la;
		try {
			setState(990);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(916);
				match(T__0);
				setState(918);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(917);
					match(NEWLINE);
					}
					break;
				}
				setState(921);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__23) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (STATIC - 81)) | (1L << (VOID - 81)) | (1L << (UNSIGNED - 81)) | (1L << (SIGNED - 81)) | (1L << (CV_QUALIFIER - 81)) | (1L << (EXTERN - 81)) | (1L << (VIRTUAL - 81)) | (1L << (TRY - 81)) | (1L << (CATCH - 81)) | (1L << (AUTO - 81)) | (1L << (REGISTER - 81)) | (1L << (SPECIAL_DATA - 81)) | (1L << (OPERATOR - 81)) | (1L << (CLASS_KEY - 81)) | (1L << (NEW - 81)) | (1L << (PRE_PRAGMA_KEYWORDS - 81)) | (1L << (END_TEST - 81)) | (1L << (ALPHA_NUMERIC - 81)))) != 0)) {
					{
					setState(920);
					parameter_decl_clause();
					}
				}

				setState(924);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(923);
					match(NEWLINE);
					}
				}

				setState(926);
				match(T__1);
				setState(928);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(927);
					match(T__18);
					}
				}

				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CV_QUALIFIER) {
					{
					{
					setState(930);
					match(CV_QUALIFIER);
					setState(932);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
					case 1:
						{
						setState(931);
						match(NEWLINE);
						}
						break;
					}
					}
					}
					setState(938);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(940);
				_la = _input.LA(1);
				if (_la==THROW) {
					{
					setState(939);
					exception_specification();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(942);
				match(T__0);
				setState(944);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(943);
					match(NEWLINE);
					}
				}

				setState(946);
				parameter_name();
				setState(954);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(947);
					match(T__12);
					setState(949);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(948);
						match(NEWLINE);
						}
					}

					setState(951);
					parameter_name();
					}
					}
					setState(956);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(958);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(957);
					match(NEWLINE);
					}
				}

				setState(960);
				match(T__1);
				setState(962);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(961);
					match(NEWLINE);
					}
				}

				setState(986); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(964);
					type_name();
					setState(965);
					parameter_id();
					setState(973);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(966);
						match(T__12);
						setState(968);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(967);
							match(NEWLINE);
							}
						}

						setState(970);
						parameter_id();
						}
						}
						setState(975);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(976);
					match(T__2);
					setState(978);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
					case 1:
						{
						setState(977);
						match(NEWLINE);
						}
						break;
					}
					setState(981);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
					case 1:
						{
						setState(980);
						match(COMMENT);
						}
						break;
					}
					setState(984);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
					case 1:
						{
						setState(983);
						match(NEWLINE);
						}
						break;
					}
					}
					}
					setState(988); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__23) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (STATIC - 81)) | (1L << (VOID - 81)) | (1L << (UNSIGNED - 81)) | (1L << (SIGNED - 81)) | (1L << (CV_QUALIFIER - 81)) | (1L << (EXTERN - 81)) | (1L << (VIRTUAL - 81)) | (1L << (TRY - 81)) | (1L << (CATCH - 81)) | (1L << (AUTO - 81)) | (1L << (REGISTER - 81)) | (1L << (SPECIAL_DATA - 81)) | (1L << (OPERATOR - 81)) | (1L << (CLASS_KEY - 81)) | (1L << (NEW - 81)) | (1L << (PRE_PRAGMA_KEYWORDS - 81)) | (1L << (END_TEST - 81)) | (1L << (ALPHA_NUMERIC - 81)))) != 0) );
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
		enterRule(_localctx, 140, RULE_parameter_decl_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(992);
			parameter_decl();
			setState(1000);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(993);
					match(T__12);
					setState(995);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(994);
						match(NEWLINE);
						}
					}

					setState(997);
					parameter_decl();
					}
					} 
				}
				setState(1002);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			}
			}
			setState(1008);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(1003);
				match(T__12);
				setState(1005);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1004);
					match(NEWLINE);
					}
				}

				setState(1007);
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
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
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
		enterRule(_localctx, 142, RULE_parameter_decl);
		try {
			setState(1014);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1010);
				match(VOID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1011);
				type_name();
				setState(1012);
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
		enterRule(_localctx, 144, RULE_parameter_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			_la = _input.LA(1);
			if (_la==T__17 || _la==T__18) {
				{
				setState(1016);
				ptrs();
				}
			}

			setState(1024);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(1019);
				match(T__0);
				setState(1020);
				parameter_id();
				setState(1021);
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
				setState(1023);
				parameter_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1027);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__28) {
				{
				setState(1026);
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
		enterRule(_localctx, 146, RULE_compound_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1029);
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
		enterRule(_localctx, 148, RULE_ctor_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			match(T__3);
			setState(1033);
			ctor_initializer();
			setState(1038);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(1034);
				match(T__12);
				setState(1035);
				ctor_initializer();
				}
				}
				setState(1040);
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
		enterRule(_localctx, 150, RULE_ctor_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			initializer_id();
			setState(1042);
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
		enterRule(_localctx, 152, RULE_initializer_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1045);
			_la = _input.LA(1);
			if (_la==T__56) {
				{
				setState(1044);
				match(T__56);
				}
			}

			setState(1047);
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
		enterRule(_localctx, 154, RULE_ctor_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1049);
			match(T__0);
			setState(1051);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__51) | (1L << T__52) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (STATIC - 65)) | (1L << (VOID - 65)) | (1L << (UNSIGNED - 65)) | (1L << (SIGNED - 65)) | (1L << (CV_QUALIFIER - 65)) | (1L << (EXTERN - 65)) | (1L << (ASM - 65)) | (1L << (VIRTUAL - 65)) | (1L << (TRY - 65)) | (1L << (CATCH - 65)) | (1L << (AUTO - 65)) | (1L << (REGISTER - 65)) | (1L << (SPECIAL_DATA - 65)) | (1L << (OPERATOR - 65)) | (1L << (CLASS_KEY - 65)) | (1L << (NEW - 65)) | (1L << (PRE_PRAGMA_KEYWORDS - 65)) | (1L << (END_TEST - 65)) | (1L << (ALPHA_NUMERIC - 65)) | (1L << (OPENING_CURLY - 65)) | (1L << (HEX_LITERAL - 65)) | (1L << (DECIMAL_LITERAL - 65)) | (1L << (OCTAL_LITERAL - 65)) | (1L << (FLOATING_POINT_LITERAL - 65)) | (1L << (CHAR - 65)) | (1L << (STRING - 65)))) != 0)) {
				{
				setState(1050);
				expr();
				}
			}

			setState(1053);
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
		enterRule(_localctx, 156, RULE_function_name);
		try {
			setState(1062);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case NEW:
			case PRE_PRAGMA_KEYWORDS:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1055);
				identifier();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(1056);
				match(T__0);
				setState(1057);
				function_name();
				setState(1058);
				match(T__1);
				}
				break;
			case OPERATOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1060);
				match(OPERATOR);
				setState(1061);
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
		enterRule(_localctx, 158, RULE_exception_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
			match(THROW);
			setState(1065);
			match(T__0);
			setState(1066);
			type_id_list();
			setState(1067);
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
		enterRule(_localctx, 160, RULE_type_id_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (T__2 - 3)) | (1L << (T__3 - 3)) | (1L << (T__4 - 3)) | (1L << (T__5 - 3)) | (1L << (T__6 - 3)) | (1L << (T__7 - 3)) | (1L << (T__8 - 3)) | (1L << (T__9 - 3)) | (1L << (T__10 - 3)) | (1L << (T__11 - 3)) | (1L << (T__12 - 3)) | (1L << (T__13 - 3)) | (1L << (T__14 - 3)) | (1L << (T__15 - 3)) | (1L << (T__16 - 3)) | (1L << (T__17 - 3)) | (1L << (T__18 - 3)) | (1L << (T__19 - 3)) | (1L << (T__20 - 3)) | (1L << (T__21 - 3)) | (1L << (T__22 - 3)) | (1L << (T__23 - 3)) | (1L << (T__24 - 3)) | (1L << (T__25 - 3)) | (1L << (T__26 - 3)) | (1L << (T__27 - 3)) | (1L << (T__28 - 3)) | (1L << (T__29 - 3)) | (1L << (T__30 - 3)) | (1L << (T__31 - 3)) | (1L << (T__32 - 3)) | (1L << (T__33 - 3)) | (1L << (T__34 - 3)) | (1L << (T__35 - 3)) | (1L << (T__36 - 3)) | (1L << (T__37 - 3)) | (1L << (T__38 - 3)) | (1L << (T__39 - 3)) | (1L << (T__40 - 3)) | (1L << (T__41 - 3)) | (1L << (T__42 - 3)) | (1L << (T__43 - 3)) | (1L << (T__44 - 3)) | (1L << (T__45 - 3)) | (1L << (T__46 - 3)) | (1L << (T__47 - 3)) | (1L << (T__48 - 3)) | (1L << (T__49 - 3)) | (1L << (T__50 - 3)) | (1L << (T__51 - 3)) | (1L << (T__52 - 3)) | (1L << (T__53 - 3)) | (1L << (T__54 - 3)) | (1L << (T__55 - 3)) | (1L << (T__56 - 3)) | (1L << (T__57 - 3)) | (1L << (T__58 - 3)) | (1L << (T__59 - 3)) | (1L << (T__60 - 3)) | (1L << (T__61 - 3)) | (1L << (T__62 - 3)) | (1L << (T__63 - 3)) | (1L << (T__64 - 3)) | (1L << (NEWLINE - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ESCAPE - 67)) | (1L << (ELLIPSIS - 67)) | (1L << (IF - 67)) | (1L << (ELSE - 67)) | (1L << (FOR - 67)) | (1L << (WHILE - 67)) | (1L << (BREAK - 67)) | (1L << (CASE - 67)) | (1L << (CONTINUE - 67)) | (1L << (SWITCH - 67)) | (1L << (DO - 67)) | (1L << (GOTO - 67)) | (1L << (RETURN - 67)) | (1L << (TYPEDEF - 67)) | (1L << (STATIC - 67)) | (1L << (VOID - 67)) | (1L << (UNSIGNED - 67)) | (1L << (SIGNED - 67)) | (1L << (CV_QUALIFIER - 67)) | (1L << (EXTERN - 67)) | (1L << (ASM - 67)) | (1L << (VIRTUAL - 67)) | (1L << (TRY - 67)) | (1L << (CATCH - 67)) | (1L << (THROW - 67)) | (1L << (USING - 67)) | (1L << (NAMESPACE - 67)) | (1L << (AUTO - 67)) | (1L << (REGISTER - 67)) | (1L << (SPECIAL_DATA - 67)) | (1L << (OPERATOR - 67)) | (1L << (TEMPLATE - 67)) | (1L << (CLASS_KEY - 67)) | (1L << (NEW - 67)) | (1L << (PRE_IF - 67)) | (1L << (PRE_ELIF - 67)) | (1L << (PRE_ELSE - 67)) | (1L << (PRE_ENDIF - 67)) | (1L << (PRE_DEFINE - 67)) | (1L << (PRE_UNDEF - 67)) | (1L << (PRE_DIAGNOSTIC - 67)) | (1L << (PRE_OTHER - 67)) | (1L << (PRE_INCLUDE - 67)) | (1L << (PRE_INCLUDE_NEXT - 67)) | (1L << (PRE_LINE - 67)) | (1L << (PRE_PRAGMA - 67)) | (1L << (PRE_GCC - 67)) | (1L << (PRE_PRAGMA_KEYWORDS - 67)) | (1L << (PRE_STR - 67)) | (1L << (PRE_ATTRIBUTE - 67)) | (1L << (END_TEST - 67)) | (1L << (ALPHA_NUMERIC - 67)) | (1L << (OPENING_CURLY - 67)) | (1L << (CLOSING_CURLY - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (OCTAL_LITERAL - 67)) | (1L << (FLOATING_POINT_LITERAL - 67)) | (1L << (COMMENT - 67)) | (1L << (CHAR - 67)) | (1L << (STRING - 67)) | (1L << (WHITESPACE - 67)) | (1L << (OTHER - 67)))) != 0)) {
				{
				{
				setState(1069);
				no_brackets();
				}
				}
				setState(1074);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1086);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(1075);
				match(T__0);
				setState(1076);
				type_id_list();
				setState(1077);
				match(T__1);
				setState(1081);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (T__2 - 3)) | (1L << (T__3 - 3)) | (1L << (T__4 - 3)) | (1L << (T__5 - 3)) | (1L << (T__6 - 3)) | (1L << (T__7 - 3)) | (1L << (T__8 - 3)) | (1L << (T__9 - 3)) | (1L << (T__10 - 3)) | (1L << (T__11 - 3)) | (1L << (T__12 - 3)) | (1L << (T__13 - 3)) | (1L << (T__14 - 3)) | (1L << (T__15 - 3)) | (1L << (T__16 - 3)) | (1L << (T__17 - 3)) | (1L << (T__18 - 3)) | (1L << (T__19 - 3)) | (1L << (T__20 - 3)) | (1L << (T__21 - 3)) | (1L << (T__22 - 3)) | (1L << (T__23 - 3)) | (1L << (T__24 - 3)) | (1L << (T__25 - 3)) | (1L << (T__26 - 3)) | (1L << (T__27 - 3)) | (1L << (T__28 - 3)) | (1L << (T__29 - 3)) | (1L << (T__30 - 3)) | (1L << (T__31 - 3)) | (1L << (T__32 - 3)) | (1L << (T__33 - 3)) | (1L << (T__34 - 3)) | (1L << (T__35 - 3)) | (1L << (T__36 - 3)) | (1L << (T__37 - 3)) | (1L << (T__38 - 3)) | (1L << (T__39 - 3)) | (1L << (T__40 - 3)) | (1L << (T__41 - 3)) | (1L << (T__42 - 3)) | (1L << (T__43 - 3)) | (1L << (T__44 - 3)) | (1L << (T__45 - 3)) | (1L << (T__46 - 3)) | (1L << (T__47 - 3)) | (1L << (T__48 - 3)) | (1L << (T__49 - 3)) | (1L << (T__50 - 3)) | (1L << (T__51 - 3)) | (1L << (T__52 - 3)) | (1L << (T__53 - 3)) | (1L << (T__54 - 3)) | (1L << (T__55 - 3)) | (1L << (T__56 - 3)) | (1L << (T__57 - 3)) | (1L << (T__58 - 3)) | (1L << (T__59 - 3)) | (1L << (T__60 - 3)) | (1L << (T__61 - 3)) | (1L << (T__62 - 3)) | (1L << (T__63 - 3)) | (1L << (T__64 - 3)) | (1L << (NEWLINE - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ESCAPE - 67)) | (1L << (ELLIPSIS - 67)) | (1L << (IF - 67)) | (1L << (ELSE - 67)) | (1L << (FOR - 67)) | (1L << (WHILE - 67)) | (1L << (BREAK - 67)) | (1L << (CASE - 67)) | (1L << (CONTINUE - 67)) | (1L << (SWITCH - 67)) | (1L << (DO - 67)) | (1L << (GOTO - 67)) | (1L << (RETURN - 67)) | (1L << (TYPEDEF - 67)) | (1L << (STATIC - 67)) | (1L << (VOID - 67)) | (1L << (UNSIGNED - 67)) | (1L << (SIGNED - 67)) | (1L << (CV_QUALIFIER - 67)) | (1L << (EXTERN - 67)) | (1L << (ASM - 67)) | (1L << (VIRTUAL - 67)) | (1L << (TRY - 67)) | (1L << (CATCH - 67)) | (1L << (THROW - 67)) | (1L << (USING - 67)) | (1L << (NAMESPACE - 67)) | (1L << (AUTO - 67)) | (1L << (REGISTER - 67)) | (1L << (SPECIAL_DATA - 67)) | (1L << (OPERATOR - 67)) | (1L << (TEMPLATE - 67)) | (1L << (CLASS_KEY - 67)) | (1L << (NEW - 67)) | (1L << (PRE_IF - 67)) | (1L << (PRE_ELIF - 67)) | (1L << (PRE_ELSE - 67)) | (1L << (PRE_ENDIF - 67)) | (1L << (PRE_DEFINE - 67)) | (1L << (PRE_UNDEF - 67)) | (1L << (PRE_DIAGNOSTIC - 67)) | (1L << (PRE_OTHER - 67)) | (1L << (PRE_INCLUDE - 67)) | (1L << (PRE_INCLUDE_NEXT - 67)) | (1L << (PRE_LINE - 67)) | (1L << (PRE_PRAGMA - 67)) | (1L << (PRE_GCC - 67)) | (1L << (PRE_PRAGMA_KEYWORDS - 67)) | (1L << (PRE_STR - 67)) | (1L << (PRE_ATTRIBUTE - 67)) | (1L << (END_TEST - 67)) | (1L << (ALPHA_NUMERIC - 67)) | (1L << (OPENING_CURLY - 67)) | (1L << (CLOSING_CURLY - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (OCTAL_LITERAL - 67)) | (1L << (FLOATING_POINT_LITERAL - 67)) | (1L << (COMMENT - 67)) | (1L << (CHAR - 67)) | (1L << (STRING - 67)) | (1L << (WHITESPACE - 67)) | (1L << (OTHER - 67)))) != 0)) {
					{
					{
					setState(1078);
					no_brackets();
					}
					}
					setState(1083);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(1088);
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
		enterRule(_localctx, 162, RULE_simple_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1089);
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
		public Param_type_listContext param_type_list() {
			return getRuleContext(Param_type_listContext.class,0);
		}
		public TerminalNode TYPEDEF() { return getToken(FunctionParser.TYPEDEF, 0); }
		public CallingConventionContext callingConvention() {
			return getRuleContext(CallingConventionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public Pre_otherContext pre_other() {
			return getRuleContext(Pre_otherContext.class,0);
		}
		public MacroCallContext macroCall() {
			return getRuleContext(MacroCallContext.class,0);
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
		enterRule(_localctx, 164, RULE_var_decl);
		int _la;
		try {
			setState(1171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				_localctx = new DeclByClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1092);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(1091);
					template_decl_start();
					}
				}

				setState(1094);
				class_def();
				setState(1096);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(1095);
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
				setState(1102);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(1098);
					match(TYPEDEF);
					setState(1100);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1099);
						match(NEWLINE);
						}
					}

					}
				}

				setState(1105);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(1104);
					template_decl_start();
					}
				}

				setState(1107);
				type_name();
				setState(1108);
				init_declarator_list();
				}
				break;
			case 3:
				_localctx = new FunctionPointerDeclareContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1114);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(1110);
					match(TYPEDEF);
					setState(1112);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1111);
						match(NEWLINE);
						}
					}

					}
				}

				setState(1116);
				type_name();
				setState(1117);
				match(T__0);
				setState(1119);
				_la = _input.LA(1);
				if (_la==ALPHA_NUMERIC) {
					{
					setState(1118);
					callingConvention();
					}
				}

				setState(1121);
				ptr_operator();
				setState(1123);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (NEW - 100)) | (1L << (PRE_PRAGMA_KEYWORDS - 100)) | (1L << (ALPHA_NUMERIC - 100)))) != 0)) {
					{
					setState(1122);
					identifier();
					}
				}

				setState(1125);
				match(T__1);
				setState(1126);
				param_type_list();
				setState(1128);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1127);
					match(NEWLINE);
					}
				}

				setState(1132);
				switch (_input.LA(1)) {
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case PRE_OTHER:
				case PRE_ATTRIBUTE:
					{
					setState(1130);
					pre_other();
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
				case TRY:
				case CATCH:
				case OPERATOR:
				case CLASS_KEY:
				case NEW:
				case PRE_PRAGMA_KEYWORDS:
				case END_TEST:
				case ALPHA_NUMERIC:
					{
					setState(1131);
					macroCall();
					}
					break;
				case T__2:
				case T__34:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1139);
				_la = _input.LA(1);
				if (_la==T__34) {
					{
					setState(1134);
					match(T__34);
					setState(1136);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1135);
						match(NEWLINE);
						}
					}

					setState(1138);
					argument();
					}
				}

				setState(1141);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new StructUnionEnumContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1147);
				_la = _input.LA(1);
				if (_la==CV_QUALIFIER) {
					{
					setState(1143);
					match(CV_QUALIFIER);
					setState(1145);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1144);
						match(NEWLINE);
						}
					}

					}
				}

				setState(1153);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==STATIC || _la==VIRTUAL) {
					{
					setState(1149);
					function_decl_specifiers();
					setState(1151);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1150);
						match(NEWLINE);
						}
					}

					}
				}

				setState(1159);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(1155);
					match(TYPEDEF);
					setState(1157);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1156);
						match(NEWLINE);
						}
					}

					}
				}

				setState(1161);
				special_datatype();
				setState(1163);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1162);
					match(NEWLINE);
					}
					break;
				}
				setState(1166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
				case 1:
					{
					setState(1165);
					init_declarator_list();
					}
					break;
				}
				setState(1169);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(1168);
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
		enterRule(_localctx, 166, RULE_callingConvention);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1173);
				match(ALPHA_NUMERIC);
				}
				}
				setState(1176); 
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
		enterRule(_localctx, 168, RULE_special_datatype);
		int _la;
		try {
			setState(1225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1178);
				match(SPECIAL_DATA);
				setState(1180);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1179);
					match(NEWLINE);
					}
				}

				setState(1183);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
				case 1:
					{
					setState(1182);
					pre_other();
					}
					break;
				}
				setState(1189);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (NEW - 100)) | (1L << (PRE_PRAGMA_KEYWORDS - 100)) | (1L << (ALPHA_NUMERIC - 100)))) != 0)) {
					{
					setState(1185);
					identifier();
					setState(1187);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1186);
						match(NEWLINE);
						}
					}

					}
				}

				setState(1192);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0) || _la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(1191);
					pre_other();
					}
				}

				setState(1194);
				match(OPENING_CURLY);
				skipToEndOfObject(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1196);
				match(SPECIAL_DATA);
				setState(1198);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1197);
					match(NEWLINE);
					}
				}

				setState(1201);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0) || _la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(1200);
					pre_other();
					}
				}

				setState(1203);
				identifier();
				setState(1205);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1204);
					match(NEWLINE);
					}
				}

				setState(1208);
				_la = _input.LA(1);
				if (_la==T__17 || _la==T__18) {
					{
					setState(1207);
					ptrs();
					}
				}

				setState(1210);
				identifier();
				setState(1212);
				_la = _input.LA(1);
				if (_la==T__17 || _la==T__18) {
					{
					setState(1211);
					ptrs();
					}
				}

				setState(1214);
				match(T__34);
				skipToEndOfObject(); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1217);
				match(SPECIAL_DATA);
				setState(1219);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1218);
					match(NEWLINE);
					}
				}

				setState(1222);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0) || _la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(1221);
					pre_other();
					}
				}

				setState(1224);
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
		enterRule(_localctx, 170, RULE_init_declarator_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1227);
			init_declarator();
			setState(1238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1229);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1228);
						match(NEWLINE);
						}
					}

					setState(1231);
					match(T__12);
					setState(1233);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1232);
						match(NEWLINE);
						}
					}

					setState(1235);
					init_declarator();
					}
					} 
				}
				setState(1240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			}
			setState(1242);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1241);
				match(NEWLINE);
				}
			}

			setState(1245);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0) || _la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
				{
				setState(1244);
				pre_other();
				}
			}

			setState(1247);
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
		enterRule(_localctx, 172, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1249);
			match(CLASS_KEY);
			setState(1251);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1250);
				match(NEWLINE);
				}
			}

			setState(1254);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (NEW - 100)) | (1L << (PRE_PRAGMA_KEYWORDS - 100)) | (1L << (ALPHA_NUMERIC - 100)))) != 0)) {
				{
				setState(1253);
				class_name();
				}
			}

			setState(1257);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(1256);
				base_classes();
				}
			}

			setState(1259);
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
		enterRule(_localctx, 174, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1262);
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
		enterRule(_localctx, 176, RULE_base_classes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1264);
			match(T__3);
			setState(1265);
			base_class();
			setState(1270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(1266);
				match(T__12);
				setState(1267);
				base_class();
				}
				}
				setState(1272);
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
		enterRule(_localctx, 178, RULE_base_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1277);
			_la = _input.LA(1);
			if (_la==VIRTUAL) {
				{
				setState(1273);
				match(VIRTUAL);
				setState(1275);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1274);
					match(NEWLINE);
					}
				}

				}
			}

			setState(1280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1279);
				access_specifier();
				}
				break;
			}
			setState(1282);
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
		public List<TerminalNode> EXTERN() { return getTokens(FunctionParser.EXTERN); }
		public TerminalNode EXTERN(int i) {
			return getToken(FunctionParser.EXTERN, i);
		}
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
		public List<TerminalNode> AUTO() { return getTokens(FunctionParser.AUTO); }
		public TerminalNode AUTO(int i) {
			return getToken(FunctionParser.AUTO, i);
		}
		public List<TerminalNode> REGISTER() { return getTokens(FunctionParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(FunctionParser.REGISTER, i);
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
		public List<MacroCallContext> macroCall() {
			return getRuleContexts(MacroCallContext.class);
		}
		public MacroCallContext macroCall(int i) {
			return getRuleContext(MacroCallContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public List<Template_param_listContext> template_param_list() {
			return getRuleContexts(Template_param_listContext.class);
		}
		public Template_param_listContext template_param_list(int i) {
			return getRuleContext(Template_param_listContext.class,i);
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
		enterRule(_localctx, 180, RULE_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1335); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1335);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
					case 1:
						{
						setState(1284);
						match(EXTERN);
						setState(1286);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
						case 1:
							{
							setState(1285);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 2:
						{
						setState(1288);
						function_decl_specifiers();
						setState(1290);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
						case 1:
							{
							setState(1289);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 3:
						{
						setState(1292);
						match(CV_QUALIFIER);
						setState(1294);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
						case 1:
							{
							setState(1293);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 4:
						{
						setState(1296);
						match(UNSIGNED);
						setState(1298);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
						case 1:
							{
							setState(1297);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 5:
						{
						setState(1300);
						match(SIGNED);
						setState(1302);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
						case 1:
							{
							setState(1301);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 6:
						{
						setState(1304);
						match(AUTO);
						setState(1306);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
						case 1:
							{
							setState(1305);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 7:
						{
						setState(1308);
						match(REGISTER);
						setState(1310);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
						case 1:
							{
							setState(1309);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 8:
						{
						setState(1312);
						ptr_operator();
						setState(1314);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
						case 1:
							{
							setState(1313);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 9:
						{
						setState(1316);
						base_type();
						}
						break;
					case 10:
						{
						{
						{
						setState(1317);
						match(T__23);
						setState(1318);
						template_param_list();
						setState(1319);
						match(T__24);
						}
						setState(1331);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1321);
								match(T__56);
								setState(1322);
								base_type();
								setState(1327);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
								case 1:
									{
									setState(1323);
									match(T__23);
									setState(1324);
									template_param_list();
									setState(1325);
									match(T__24);
									}
									break;
								}
								}
								} 
							}
							setState(1333);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
						}
						}
						}
						break;
					case 11:
						{
						setState(1334);
						macroCall();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1337); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
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
		enterRule(_localctx, 182, RULE_base_type);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1367); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1367);
					switch (_input.LA(1)) {
					case VOID:
						{
						setState(1339);
						match(VOID);
						setState(1341);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
						case 1:
							{
							setState(1340);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case T__11:
						{
						setState(1343);
						match(T__11);
						setState(1345);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
						case 1:
							{
							setState(1344);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case T__57:
						{
						setState(1347);
						match(T__57);
						setState(1349);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
						case 1:
							{
							setState(1348);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case T__58:
						{
						setState(1351);
						match(T__58);
						setState(1353);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
						case 1:
							{
							setState(1352);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case SPECIAL_DATA:
						{
						setState(1355);
						match(SPECIAL_DATA);
						setState(1357);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
						case 1:
							{
							setState(1356);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case CLASS_KEY:
						{
						setState(1359);
						match(CLASS_KEY);
						setState(1361);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
						case 1:
							{
							setState(1360);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case ALPHA_NUMERIC:
						{
						setState(1363);
						match(ALPHA_NUMERIC);
						setState(1365);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
						case 1:
							{
							setState(1364);
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
				setState(1369); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1371);
			identifier();
			setState(1373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1372);
				match(NEWLINE);
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
			setState(1393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1375);
				match(T__0);
				setState(1376);
				match(VOID);
				setState(1377);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1378);
				match(T__0);
				setState(1390);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__23) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (ELLIPSIS - 68)) | (1L << (STATIC - 68)) | (1L << (VOID - 68)) | (1L << (UNSIGNED - 68)) | (1L << (SIGNED - 68)) | (1L << (CV_QUALIFIER - 68)) | (1L << (EXTERN - 68)) | (1L << (VIRTUAL - 68)) | (1L << (TRY - 68)) | (1L << (CATCH - 68)) | (1L << (AUTO - 68)) | (1L << (REGISTER - 68)) | (1L << (SPECIAL_DATA - 68)) | (1L << (OPERATOR - 68)) | (1L << (CLASS_KEY - 68)) | (1L << (NEW - 68)) | (1L << (PRE_PRAGMA_KEYWORDS - 68)) | (1L << (END_TEST - 68)) | (1L << (ALPHA_NUMERIC - 68)))) != 0)) {
					{
					setState(1379);
					param_type();
					setState(1387);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(1380);
						match(T__12);
						setState(1382);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(1381);
							match(NEWLINE);
							}
						}

						setState(1384);
						param_type();
						}
						}
						setState(1389);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1392);
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
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
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
		try {
			setState(1402);
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
			case T__23:
			case T__57:
			case T__58:
			case STATIC:
			case VOID:
			case UNSIGNED:
			case SIGNED:
			case CV_QUALIFIER:
			case EXTERN:
			case VIRTUAL:
			case TRY:
			case CATCH:
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
				setState(1395);
				type_name();
				setState(1397);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
				case 1:
					{
					setState(1396);
					match(NEWLINE);
					}
					break;
				}
				setState(1399);
				param_type_id();
				}
				break;
			case ELLIPSIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1401);
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
			setState(1405);
			_la = _input.LA(1);
			if (_la==T__17 || _la==T__18) {
				{
				setState(1404);
				ptrs();
				}
			}

			setState(1414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1407);
				match(T__0);
				setState(1408);
				param_type_id();
				setState(1409);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(1412);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (NEW - 100)) | (1L << (PRE_PRAGMA_KEYWORDS - 100)) | (1L << (ALPHA_NUMERIC - 100)))) != 0)) {
					{
					setState(1411);
					parameter_name();
					}
				}

				}
				break;
			}
			setState(1417);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__28) {
				{
				setState(1416);
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
			setState(1430);
			switch (_input.LA(1)) {
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1419);
				match(ALPHA_NUMERIC);
				setState(1424);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1420);
						match(T__56);
						setState(1421);
						match(ALPHA_NUMERIC);
						}
						} 
					}
					setState(1426);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
				}
				}
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(1427);
				match(NEW);
				}
				break;
			case PRE_PRAGMA_KEYWORDS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1428);
				match(PRE_PRAGMA_KEYWORDS);
				}
				break;
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(1429);
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
			setState(1432);
			_la = _input.LA(1);
			if ( !(((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (HEX_LITERAL - 121)) | (1L << (DECIMAL_LITERAL - 121)) | (1L << (OCTAL_LITERAL - 121)))) != 0)) ) {
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
			setState(1438); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1434);
				ptr_operator();
				setState(1436);
				_la = _input.LA(1);
				if (_la==T__59) {
					{
					setState(1435);
					match(T__59);
					}
				}

				}
				}
				setState(1440); 
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
			setState(1442);
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
			setState(1444);
			assign_expr();
			setState(1449);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1445);
					match(ESCAPE);
					setState(1446);
					match(NEWLINE);
					}
					} 
				}
				setState(1451);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
			}
			setState(1472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				{
				setState(1453);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
				case 1:
					{
					setState(1452);
					match(NEWLINE);
					}
					break;
				}
				setState(1456);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1455);
					match(COMMENT);
					}
				}

				setState(1459);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1458);
					match(NEWLINE);
					}
				}

				setState(1461);
				match(T__12);
				setState(1463);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
				case 1:
					{
					setState(1462);
					match(NEWLINE);
					}
					break;
				}
				setState(1466);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1465);
					match(COMMENT);
					}
				}

				setState(1469);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1468);
					match(NEWLINE);
					}
				}

				setState(1471);
				expr();
				}
				break;
			}
			setState(1478);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1474);
					match(ESCAPE);
					setState(1475);
					match(NEWLINE);
					}
					} 
				}
				setState(1480);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
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
			setState(1481);
			conditional_expression();
			setState(1503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				{
				setState(1483);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
				case 1:
					{
					setState(1482);
					match(NEWLINE);
					}
					break;
				}
				setState(1486);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1485);
					match(COMMENT);
					}
				}

				setState(1489);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1488);
					match(NEWLINE);
					}
				}

				setState(1491);
				assignment_operator();
				setState(1493);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
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
			setState(1548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				_localctx = new NormOrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1505);
				or_expression();
				}
				break;
			case 2:
				_localctx = new CndExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1506);
				or_expression();
				{
				setState(1508);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
				case 1:
					{
					setState(1507);
					match(NEWLINE);
					}
					break;
				}
				setState(1511);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1510);
					match(COMMENT);
					}
				}

				setState(1514);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1513);
					match(NEWLINE);
					}
				}

				setState(1516);
				match(T__60);
				setState(1518);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
				case 1:
					{
					setState(1517);
					match(NEWLINE);
					}
					break;
				}
				setState(1521);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1520);
					match(COMMENT);
					}
				}

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
				setState(1528);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
				case 1:
					{
					setState(1527);
					match(NEWLINE);
					}
					break;
				}
				setState(1531);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1530);
					match(COMMENT);
					}
				}

				setState(1534);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1533);
					match(NEWLINE);
					}
				}

				setState(1536);
				match(T__3);
				setState(1538);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
				case 1:
					{
					setState(1537);
					match(NEWLINE);
					}
					break;
				}
				setState(1541);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1540);
					match(COMMENT);
					}
				}

				setState(1544);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1543);
					match(NEWLINE);
					}
				}

				setState(1546);
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
			setState(1550);
			and_expression();
			setState(1571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				{
				setState(1552);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
				case 1:
					{
					setState(1551);
					match(NEWLINE);
					}
					break;
				}
				setState(1555);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1554);
					match(COMMENT);
					}
				}

				setState(1558);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1557);
					match(NEWLINE);
					}
				}

				setState(1560);
				match(T__50);
				setState(1562);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
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
			setState(1573);
			inclusive_or_expression();
			setState(1594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				{
				setState(1575);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
				case 1:
					{
					setState(1574);
					match(NEWLINE);
					}
					break;
				}
				setState(1578);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1577);
					match(COMMENT);
					}
				}

				setState(1581);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1580);
					match(NEWLINE);
					}
				}

				setState(1583);
				match(T__49);
				setState(1585);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
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
			setState(1596);
			exclusive_or_expression();
			setState(1617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				{
				setState(1598);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
				case 1:
					{
					setState(1597);
					match(NEWLINE);
					}
					break;
				}
				setState(1601);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1600);
					match(COMMENT);
					}
				}

				setState(1604);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1603);
					match(NEWLINE);
					}
				}

				setState(1606);
				match(T__33);
				setState(1608);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
				case 1:
					{
					setState(1607);
					match(NEWLINE);
					}
					break;
				}
				setState(1611);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1610);
					match(COMMENT);
					}
				}

				setState(1614);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1613);
					match(NEWLINE);
					}
				}

				setState(1616);
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
			setState(1619);
			bit_and_expression();
			setState(1640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				{
				setState(1621);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
				case 1:
					{
					setState(1620);
					match(NEWLINE);
					}
					break;
				}
				setState(1624);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1623);
					match(COMMENT);
					}
				}

				setState(1627);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1626);
					match(NEWLINE);
					}
				}

				setState(1629);
				match(T__32);
				setState(1631);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
				case 1:
					{
					setState(1630);
					match(NEWLINE);
					}
					break;
				}
				setState(1634);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1633);
					match(COMMENT);
					}
				}

				setState(1637);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1636);
					match(NEWLINE);
					}
				}

				setState(1639);
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
			setState(1642);
			equality_expression();
			setState(1663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				{
				setState(1644);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
				case 1:
					{
					setState(1643);
					match(NEWLINE);
					}
					break;
				}
				setState(1647);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1646);
					match(COMMENT);
					}
				}

				setState(1650);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1649);
					match(NEWLINE);
					}
				}

				setState(1652);
				match(T__17);
				setState(1654);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
				case 1:
					{
					setState(1653);
					match(NEWLINE);
					}
					break;
				}
				setState(1657);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1656);
					match(COMMENT);
					}
				}

				setState(1660);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1659);
					match(NEWLINE);
					}
				}

				setState(1662);
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
			setState(1665);
			relational_expression();
			setState(1687);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				{
				setState(1667);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
				case 1:
					{
					setState(1666);
					match(NEWLINE);
					}
					break;
				}
				setState(1670);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1669);
					match(COMMENT);
					}
				}

				setState(1673);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1672);
					match(NEWLINE);
					}
				}

				setState(1675);
				equality_operator();
				setState(1677);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
				case 1:
					{
					setState(1676);
					match(NEWLINE);
					}
					break;
				}
				setState(1680);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1679);
					match(COMMENT);
					}
				}

				setState(1683);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1682);
					match(NEWLINE);
					}
				}

				setState(1685);
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
			setState(1689);
			shift_expression();
			setState(1711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				{
				setState(1691);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
				case 1:
					{
					setState(1690);
					match(NEWLINE);
					}
					break;
				}
				setState(1694);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1693);
					match(COMMENT);
					}
				}

				setState(1697);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1696);
					match(NEWLINE);
					}
				}

				setState(1699);
				relational_operator();
				setState(1701);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
				case 1:
					{
					setState(1700);
					match(NEWLINE);
					}
					break;
				}
				setState(1704);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1703);
					match(COMMENT);
					}
				}

				setState(1707);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1706);
					match(NEWLINE);
					}
				}

				setState(1709);
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
			setState(1713);
			additive_expression();
			setState(1734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				{
				setState(1715);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
				case 1:
					{
					setState(1714);
					match(NEWLINE);
					}
					break;
				}
				setState(1718);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1717);
					match(COMMENT);
					}
				}

				setState(1721);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1720);
					match(NEWLINE);
					}
				}

				setState(1723);
				_la = _input.LA(1);
				if ( !(_la==T__43 || _la==T__44) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1725);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
				case 1:
					{
					setState(1724);
					match(NEWLINE);
					}
					break;
				}
				setState(1728);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1727);
					match(COMMENT);
					}
				}

				setState(1731);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1730);
					match(NEWLINE);
					}
				}

				setState(1733);
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
			setState(1736);
			multiplicative_expression();
			setState(1757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
			case 1:
				{
				setState(1738);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
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
				_la = _input.LA(1);
				if ( !(_la==T__19 || _la==T__20) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1748);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
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
			setState(1759);
			function_pointer_use_expression();
			setState(1780);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
			case 1:
				{
				setState(1761);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
				case 1:
					{
					setState(1760);
					match(NEWLINE);
					}
					break;
				}
				setState(1764);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1763);
					match(COMMENT);
					}
				}

				setState(1767);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1766);
					match(NEWLINE);
					}
				}

				setState(1769);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__30) | (1L << T__31))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1771);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
				case 1:
					{
					setState(1770);
					match(NEWLINE);
					}
					break;
				}
				setState(1774);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1773);
					match(COMMENT);
					}
				}

				setState(1777);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1776);
					match(NEWLINE);
					}
				}

				setState(1779);
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
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		int _la;
		try {
			setState(1793);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1782);
				match(T__0);
				setState(1783);
				ptr_operator();
				setState(1785);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (NEW - 100)) | (1L << (PRE_PRAGMA_KEYWORDS - 100)) | (1L << (ALPHA_NUMERIC - 100)))) != 0)) {
					{
					setState(1784);
					identifier();
					}
				}

				setState(1787);
				match(T__1);
				setState(1788);
				match(T__0);
				setState(1789);
				argument_list();
				setState(1790);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1792);
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
			setState(1801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1795);
				match(T__0);
				setState(1796);
				cast_target();
				setState(1797);
				match(T__1);
				setState(1798);
				cast_expression();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1800);
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
		public Function_pointer_use_expressionContext function_pointer_use_expression() {
			return getRuleContext(Function_pointer_use_expressionContext.class,0);
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
			setState(1807);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1803);
				type_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1804);
				type_name();
				setState(1805);
				function_pointer_use_expression();
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
		public AsmCallContext asmCall() {
			return getRuleContext(AsmCallContext.class,0);
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
			setState(1817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1809);
				address_of_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1810);
				unary_op_and_cast_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1811);
				sizeof_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1812);
				new_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1813);
				postfix_expression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1814);
				defined_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1815);
				macroCall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1816);
				asmCall();
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
			setState(1819);
			match(T__17);
			setState(1820);
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
			setState(1880);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,338,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1823);
				_la = _input.LA(1);
				if (_la==T__56) {
					{
					setState(1822);
					match(T__56);
					}
				}

				setState(1825);
				match(NEW);
				setState(1827);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
				case 1:
					{
					setState(1826);
					match(NEWLINE);
					}
					break;
				}
				setState(1830);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1829);
					match(COMMENT);
					}
				}

				setState(1833);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1832);
					match(NEWLINE);
					}
				}

				setState(1835);
				type_name();
				setState(1837);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
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
				match(T__28);
				setState(1847);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__51) | (1L << T__52) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (STATIC - 65)) | (1L << (VOID - 65)) | (1L << (UNSIGNED - 65)) | (1L << (SIGNED - 65)) | (1L << (CV_QUALIFIER - 65)) | (1L << (EXTERN - 65)) | (1L << (ASM - 65)) | (1L << (VIRTUAL - 65)) | (1L << (TRY - 65)) | (1L << (CATCH - 65)) | (1L << (AUTO - 65)) | (1L << (REGISTER - 65)) | (1L << (SPECIAL_DATA - 65)) | (1L << (OPERATOR - 65)) | (1L << (CLASS_KEY - 65)) | (1L << (NEW - 65)) | (1L << (PRE_PRAGMA_KEYWORDS - 65)) | (1L << (END_TEST - 65)) | (1L << (ALPHA_NUMERIC - 65)) | (1L << (OPENING_CURLY - 65)) | (1L << (HEX_LITERAL - 65)) | (1L << (DECIMAL_LITERAL - 65)) | (1L << (OCTAL_LITERAL - 65)) | (1L << (FLOATING_POINT_LITERAL - 65)) | (1L << (CHAR - 65)) | (1L << (STRING - 65)))) != 0)) {
					{
					setState(1846);
					conditional_expression();
					}
				}

				setState(1849);
				match(T__29);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1852);
				_la = _input.LA(1);
				if (_la==T__56) {
					{
					setState(1851);
					match(T__56);
					}
				}

				setState(1854);
				match(NEW);
				setState(1856);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,331,_ctx) ) {
				case 1:
					{
					setState(1855);
					match(NEWLINE);
					}
					break;
				}
				setState(1859);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1858);
					match(COMMENT);
					}
				}

				setState(1862);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1861);
					match(NEWLINE);
					}
				}

				setState(1864);
				type_name();
				setState(1866);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,334,_ctx) ) {
				case 1:
					{
					setState(1865);
					match(NEWLINE);
					}
					break;
				}
				setState(1869);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1868);
					match(COMMENT);
					}
				}

				setState(1872);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1871);
					match(NEWLINE);
					}
				}

				setState(1874);
				match(T__0);
				setState(1876);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__51) | (1L << T__52) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (STATIC - 65)) | (1L << (VOID - 65)) | (1L << (UNSIGNED - 65)) | (1L << (SIGNED - 65)) | (1L << (CV_QUALIFIER - 65)) | (1L << (EXTERN - 65)) | (1L << (ASM - 65)) | (1L << (VIRTUAL - 65)) | (1L << (TRY - 65)) | (1L << (CATCH - 65)) | (1L << (AUTO - 65)) | (1L << (REGISTER - 65)) | (1L << (SPECIAL_DATA - 65)) | (1L << (OPERATOR - 65)) | (1L << (CLASS_KEY - 65)) | (1L << (NEW - 65)) | (1L << (PRE_PRAGMA_KEYWORDS - 65)) | (1L << (END_TEST - 65)) | (1L << (ALPHA_NUMERIC - 65)) | (1L << (OPENING_CURLY - 65)) | (1L << (HEX_LITERAL - 65)) | (1L << (DECIMAL_LITERAL - 65)) | (1L << (OCTAL_LITERAL - 65)) | (1L << (FLOATING_POINT_LITERAL - 65)) | (1L << (CHAR - 65)) | (1L << (STRING - 65)))) != 0)) {
					{
					setState(1875);
					expr();
					}
				}

				setState(1878);
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
			setState(1882);
			unary_operator();
			setState(1884);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,339,_ctx) ) {
			case 1:
				{
				setState(1883);
				match(NEWLINE);
				}
				break;
			}
			setState(1887);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1886);
				match(COMMENT);
				}
			}

			setState(1890);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1889);
				match(NEWLINE);
				}
			}

			setState(1892);
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
			setState(1920);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,348,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1894);
				sizeof();
				setState(1896);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,342,_ctx) ) {
				case 1:
					{
					setState(1895);
					match(NEWLINE);
					}
					break;
				}
				setState(1899);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1898);
					match(COMMENT);
					}
				}

				setState(1902);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1901);
					match(NEWLINE);
					}
				}

				setState(1904);
				match(T__0);
				setState(1905);
				sizeof_operand();
				setState(1906);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1908);
				sizeof();
				setState(1910);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,345,_ctx) ) {
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
			setState(1922);
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
			setState(1949);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,355,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1924);
				match(T__62);
				setState(1926);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,349,_ctx) ) {
				case 1:
					{
					setState(1925);
					match(NEWLINE);
					}
					break;
				}
				setState(1929);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1928);
					match(COMMENT);
					}
				}

				setState(1932);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1931);
					match(NEWLINE);
					}
				}

				setState(1934);
				match(T__0);
				setState(1935);
				expr();
				setState(1936);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1938);
				match(T__62);
				setState(1940);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,352,_ctx) ) {
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

				setState(1948);
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
			setState(1951);
			type_name();
			setState(1964);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17 || _la==T__18 || _la==NEWLINE || _la==COMMENT) {
				{
				{
				setState(1953);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,356,_ctx) ) {
				case 1:
					{
					setState(1952);
					match(NEWLINE);
					}
					break;
				}
				setState(1956);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1955);
					match(COMMENT);
					}
				}

				setState(1959);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1958);
					match(NEWLINE);
					}
				}

				setState(1961);
				ptr_operator();
				}
				}
				setState(1966);
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
			setState(1967);
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
			setState(1969);
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

	public static class AsmCallContext extends ParserRuleContext {
		public TerminalNode ASM() { return getToken(FunctionParser.ASM, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public List<TerminalNode> STRING() { return getTokens(FunctionParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(FunctionParser.STRING, i);
		}
		public List<TerminalNode> CV_QUALIFIER() { return getTokens(FunctionParser.CV_QUALIFIER); }
		public TerminalNode CV_QUALIFIER(int i) {
			return getToken(FunctionParser.CV_QUALIFIER, i);
		}
		public List<TerminalNode> GOTO() { return getTokens(FunctionParser.GOTO); }
		public TerminalNode GOTO(int i) {
			return getToken(FunctionParser.GOTO, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public AsmCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAsmCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAsmCall(this);
		}
	}

	public final AsmCallContext asmCall() throws RecognitionException {
		AsmCallContext _localctx = new AsmCallContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_asmCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1971);
			match(ASM);
			setState(1975);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GOTO || _la==CV_QUALIFIER) {
				{
				{
				setState(1972);
				_la = _input.LA(1);
				if ( !(_la==GOTO || _la==CV_QUALIFIER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(1977);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1979);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1978);
				match(NEWLINE);
				}
			}

			setState(1981);
			match(T__0);
			setState(1983);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1982);
				match(NEWLINE);
				}
			}

			setState(1989); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1985);
				match(STRING);
				setState(1987);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1986);
					match(NEWLINE);
					}
				}

				}
				}
				setState(1991); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(2015);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__56 - 4)) | (1L << (T__63 - 4)))) != 0)) {
				{
				{
				setState(1993);
				_la = _input.LA(1);
				if ( !(((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__56 - 4)) | (1L << (T__63 - 4)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2011);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					{
					setState(1994);
					match(STRING);
					setState(1996);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1995);
						match(NEWLINE);
						}
					}

					}
					setState(2009);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(1998);
						match(T__0);
						setState(1999);
						identifier();
						setState(2004);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__12) {
							{
							{
							setState(2000);
							match(T__12);
							setState(2001);
							identifier();
							}
							}
							setState(2006);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2007);
						match(T__1);
						}
					}

					}
				}

				}
				}
				setState(2017);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2018);
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
		int _startState = 254;
		enterRecursionRule(_localctx, 254, RULE_postfix_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2044);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,376,_ctx) ) {
			case 1:
				{
				_localctx = new ArrayAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2022);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__23) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (STATIC - 81)) | (1L << (VOID - 81)) | (1L << (UNSIGNED - 81)) | (1L << (SIGNED - 81)) | (1L << (CV_QUALIFIER - 81)) | (1L << (EXTERN - 81)) | (1L << (VIRTUAL - 81)) | (1L << (TRY - 81)) | (1L << (CATCH - 81)) | (1L << (AUTO - 81)) | (1L << (REGISTER - 81)) | (1L << (SPECIAL_DATA - 81)) | (1L << (OPERATOR - 81)) | (1L << (CLASS_KEY - 81)) | (1L << (NEW - 81)) | (1L << (PRE_PRAGMA_KEYWORDS - 81)) | (1L << (END_TEST - 81)) | (1L << (ALPHA_NUMERIC - 81)))) != 0)) {
					{
					setState(2021);
					type_name();
					}
				}

				setState(2024);
				initializer_expression();
				}
				break;
			case 2:
				{
				_localctx = new PrimaryOnlyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2025);
				primary_expression();
				}
				break;
			case 3:
				{
				_localctx = new IncDecOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2027);
				_la = _input.LA(1);
				if (_la==T__17 || _la==T__18) {
					{
					setState(2026);
					ptr_operator();
					}
				}

				setState(2029);
				inc_dec();
				setState(2031);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,372,_ctx) ) {
				case 1:
					{
					setState(2030);
					match(NEWLINE);
					}
					break;
				}
				setState(2034);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(2033);
					match(COMMENT);
					}
				}

				setState(2037);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(2036);
					match(NEWLINE);
					}
				}

				setState(2040);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,375,_ctx) ) {
				case 1:
					{
					setState(2039);
					ptr_operator();
					}
					break;
				}
				setState(2042);
				primary_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,396,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2116);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,395,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayIndexingContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2046);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2048);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,377,_ctx) ) {
						case 1:
							{
							setState(2047);
							match(NEWLINE);
							}
							break;
						}
						setState(2051);
						_la = _input.LA(1);
						if (_la==COMMENT) {
							{
							setState(2050);
							match(COMMENT);
							}
						}

						setState(2054);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(2053);
							match(NEWLINE);
							}
						}

						setState(2056);
						match(T__28);
						setState(2058);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__51) | (1L << T__52) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (STATIC - 65)) | (1L << (VOID - 65)) | (1L << (UNSIGNED - 65)) | (1L << (SIGNED - 65)) | (1L << (CV_QUALIFIER - 65)) | (1L << (EXTERN - 65)) | (1L << (ASM - 65)) | (1L << (VIRTUAL - 65)) | (1L << (TRY - 65)) | (1L << (CATCH - 65)) | (1L << (AUTO - 65)) | (1L << (REGISTER - 65)) | (1L << (SPECIAL_DATA - 65)) | (1L << (OPERATOR - 65)) | (1L << (CLASS_KEY - 65)) | (1L << (NEW - 65)) | (1L << (PRE_PRAGMA_KEYWORDS - 65)) | (1L << (END_TEST - 65)) | (1L << (ALPHA_NUMERIC - 65)) | (1L << (OPENING_CURLY - 65)) | (1L << (HEX_LITERAL - 65)) | (1L << (DECIMAL_LITERAL - 65)) | (1L << (OCTAL_LITERAL - 65)) | (1L << (FLOATING_POINT_LITERAL - 65)) | (1L << (CHAR - 65)) | (1L << (STRING - 65)))) != 0)) {
							{
							setState(2057);
							expr();
							}
						}

						setState(2060);
						match(T__29);
						}
						break;
					case 2:
						{
						_localctx = new FuncCallContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2061);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(2063);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,381,_ctx) ) {
						case 1:
							{
							setState(2062);
							match(NEWLINE);
							}
							break;
						}
						setState(2066);
						_la = _input.LA(1);
						if (_la==COMMENT) {
							{
							setState(2065);
							match(COMMENT);
							}
						}

						setState(2069);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(2068);
							match(NEWLINE);
							}
						}

						setState(2071);
						match(T__0);
						setState(2072);
						argument_list();
						setState(2073);
						match(T__1);
						}
						break;
					case 3:
						{
						_localctx = new MemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2075);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2076);
						match(T__64);
						setState(2078);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,384,_ctx) ) {
						case 1:
							{
							setState(2077);
							match(NEWLINE);
							}
							break;
						}
						setState(2081);
						_la = _input.LA(1);
						if (_la==COMMENT) {
							{
							setState(2080);
							match(COMMENT);
							}
						}

						setState(2084);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(2083);
							match(NEWLINE);
							}
						}

						setState(2087);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(2086);
							match(TEMPLATE);
							}
						}

						{
						setState(2089);
						identifier();
						}
						}
						break;
					case 4:
						{
						_localctx = new PtrMemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2090);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2091);
						match(T__54);
						setState(2093);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,388,_ctx) ) {
						case 1:
							{
							setState(2092);
							match(NEWLINE);
							}
							break;
						}
						setState(2096);
						_la = _input.LA(1);
						if (_la==COMMENT) {
							{
							setState(2095);
							match(COMMENT);
							}
						}

						setState(2099);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(2098);
							match(NEWLINE);
							}
						}

						setState(2102);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(2101);
							match(TEMPLATE);
							}
						}

						{
						setState(2104);
						identifier();
						}
						}
						break;
					case 5:
						{
						_localctx = new IncDecOpContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2105);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2107);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,392,_ctx) ) {
						case 1:
							{
							setState(2106);
							match(NEWLINE);
							}
							break;
						}
						setState(2110);
						_la = _input.LA(1);
						if (_la==COMMENT) {
							{
							setState(2109);
							match(COMMENT);
							}
						}

						setState(2113);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(2112);
							match(NEWLINE);
							}
						}

						setState(2115);
						inc_dec();
						}
						break;
					}
					} 
				}
				setState(2120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,396,_ctx);
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
		enterRule(_localctx, 256, RULE_initializer_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2121);
			match(OPENING_CURLY);
			setState(2123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,397,_ctx) ) {
			case 1:
				{
				setState(2122);
				match(NEWLINE);
				}
				break;
			}
			setState(2131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,399,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2125);
					match(COMMENT);
					setState(2127);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,398,_ctx) ) {
					case 1:
						{
						setState(2126);
						match(NEWLINE);
						}
						break;
					}
					}
					} 
				}
				setState(2133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,399,_ctx);
			}
			setState(2135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,400,_ctx) ) {
			case 1:
				{
				setState(2134);
				argument_list();
				}
				break;
			}
			setState(2138);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(2137);
				match(NEWLINE);
				}
			}

			setState(2146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(2140);
				match(COMMENT);
				setState(2142);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(2141);
					match(NEWLINE);
					}
				}

				}
				}
				setState(2148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2149);
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
		public Ptr_operatorContext ptr_operator() {
			return getRuleContext(Ptr_operatorContext.class,0);
		}
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
		enterRule(_localctx, 258, RULE_argument_list);
		int _la;
		try {
			int _alt;
			setState(2200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,418,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2161);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,407,_ctx) ) {
				case 1:
					{
					setState(2152);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,404,_ctx) ) {
					case 1:
						{
						setState(2151);
						match(NEWLINE);
						}
						break;
					}
					setState(2155);
					_la = _input.LA(1);
					if (_la==COMMENT) {
						{
						setState(2154);
						match(COMMENT);
						}
					}

					setState(2158);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(2157);
						match(NEWLINE);
						}
					}

					setState(2160);
					argument();
					}
					break;
				}
				setState(2164);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,408,_ctx) ) {
				case 1:
					{
					setState(2163);
					match(NEWLINE);
					}
					break;
				}
				setState(2167);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,409,_ctx) ) {
				case 1:
					{
					setState(2166);
					match(COMMENT);
					}
					break;
				}
				setState(2170);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,410,_ctx) ) {
				case 1:
					{
					setState(2169);
					match(NEWLINE);
					}
					break;
				}
				setState(2190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,415,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2173);
						_la = _input.LA(1);
						if (_la==T__12) {
							{
							setState(2172);
							match(T__12);
							}
						}

						setState(2176);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(2175);
							match(NEWLINE);
							}
						}

						setState(2184);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMENT) {
							{
							{
							setState(2178);
							match(COMMENT);
							setState(2180);
							_la = _input.LA(1);
							if (_la==NEWLINE) {
								{
								setState(2179);
								match(NEWLINE);
								}
							}

							}
							}
							setState(2186);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2187);
						argument();
						}
						} 
					}
					setState(2192);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,415,_ctx);
				}
				setState(2194);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(2193);
					match(T__12);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2196);
				match(VOID);
				setState(2198);
				_la = _input.LA(1);
				if (_la==T__17 || _la==T__18) {
					{
					setState(2197);
					ptr_operator();
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
		enterRule(_localctx, 260, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2202);
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
		public Ptr_operatorContext ptr_operator() {
			return getRuleContext(Ptr_operatorContext.class,0);
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
		enterRule(_localctx, 262, RULE_primary_expression);
		int _la;
		try {
			setState(2214);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case T__64:
			case NEW:
			case PRE_PRAGMA_KEYWORDS:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2205);
				_la = _input.LA(1);
				if (_la==T__64) {
					{
					setState(2204);
					match(T__64);
					}
				}

				setState(2207);
				identifier();
				}
				}
				break;
			case T__17:
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(2208);
				ptr_operator();
				}
				break;
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(2209);
				constant();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
				setState(2210);
				match(T__0);
				setState(2211);
				expr();
				setState(2212);
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
		enterRule(_localctx, 264, RULE_null_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2216);
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
		enterRule(_localctx, 266, RULE_init_declarator);
		int _la;
		try {
			setState(2236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,424,_ctx) ) {
			case 1:
				_localctx = new InitDeclWithCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2218);
				declarator();
				setState(2219);
				match(T__0);
				setState(2221);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__51) | (1L << T__52) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (STATIC - 65)) | (1L << (VOID - 65)) | (1L << (UNSIGNED - 65)) | (1L << (SIGNED - 65)) | (1L << (CV_QUALIFIER - 65)) | (1L << (EXTERN - 65)) | (1L << (ASM - 65)) | (1L << (VIRTUAL - 65)) | (1L << (TRY - 65)) | (1L << (CATCH - 65)) | (1L << (AUTO - 65)) | (1L << (REGISTER - 65)) | (1L << (SPECIAL_DATA - 65)) | (1L << (OPERATOR - 65)) | (1L << (CLASS_KEY - 65)) | (1L << (NEW - 65)) | (1L << (PRE_PRAGMA_KEYWORDS - 65)) | (1L << (END_TEST - 65)) | (1L << (ALPHA_NUMERIC - 65)) | (1L << (OPENING_CURLY - 65)) | (1L << (HEX_LITERAL - 65)) | (1L << (DECIMAL_LITERAL - 65)) | (1L << (OCTAL_LITERAL - 65)) | (1L << (FLOATING_POINT_LITERAL - 65)) | (1L << (CHAR - 65)) | (1L << (STRING - 65)))) != 0)) {
					{
					setState(2220);
					expr();
					}
				}

				setState(2223);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new InitDeclWithAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2225);
				declarator();
				setState(2227);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(2226);
					match(NEWLINE);
					}
				}

				setState(2229);
				match(T__34);
				setState(2231);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(2230);
					match(NEWLINE);
					}
				}

				setState(2233);
				argument();
				}
				break;
			case 3:
				_localctx = new InitDeclSimpleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2235);
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
		enterRule(_localctx, 268, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2239);
			_la = _input.LA(1);
			if (_la==T__17 || _la==T__18) {
				{
				setState(2238);
				ptrs();
				}
			}

			setState(2241);
			identifier();
			setState(2243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,426,_ctx) ) {
			case 1:
				{
				setState(2242);
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
		enterRule(_localctx, 270, RULE_type_suffix);
		int _la;
		try {
			setState(2251);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2245);
				match(T__28);
				setState(2247);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__51) | (1L << T__52) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (STATIC - 65)) | (1L << (VOID - 65)) | (1L << (UNSIGNED - 65)) | (1L << (SIGNED - 65)) | (1L << (CV_QUALIFIER - 65)) | (1L << (EXTERN - 65)) | (1L << (ASM - 65)) | (1L << (VIRTUAL - 65)) | (1L << (TRY - 65)) | (1L << (CATCH - 65)) | (1L << (AUTO - 65)) | (1L << (REGISTER - 65)) | (1L << (SPECIAL_DATA - 65)) | (1L << (OPERATOR - 65)) | (1L << (CLASS_KEY - 65)) | (1L << (NEW - 65)) | (1L << (PRE_PRAGMA_KEYWORDS - 65)) | (1L << (END_TEST - 65)) | (1L << (ALPHA_NUMERIC - 65)) | (1L << (OPENING_CURLY - 65)) | (1L << (HEX_LITERAL - 65)) | (1L << (DECIMAL_LITERAL - 65)) | (1L << (OCTAL_LITERAL - 65)) | (1L << (FLOATING_POINT_LITERAL - 65)) | (1L << (CHAR - 65)) | (1L << (STRING - 65)))) != 0)) {
					{
					setState(2246);
					conditional_expression();
					}
				}

				setState(2249);
				match(T__29);
				}
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(2250);
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
		case 127:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0083\u08d0\4\2\t"+
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
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\3\2\7\2\u0114\n\2\f\2\16\2\u0117\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3\u0125\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\5\7\u0132\n\7\3\7\5\7\u0135\n\7\3\7\3\7\3\7\3\7\5\7\u013b\n\7\3\7"+
		"\3\7\5\7\u013f\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0147\n\7\3\7\3\7\5\7\u014b"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u0152\n\7\3\7\3\7\5\7\u0156\n\7\3\7\5\7\u0159"+
		"\n\7\3\7\5\7\u015c\n\7\3\7\3\7\5\7\u0160\n\7\3\7\5\7\u0163\n\7\3\7\5\7"+
		"\u0166\n\7\3\7\3\7\5\7\u016a\n\7\3\7\3\7\3\7\3\7\5\7\u0170\n\7\3\7\3\7"+
		"\5\7\u0174\n\7\3\7\3\7\5\7\u0178\n\7\5\7\u017a\n\7\3\b\3\b\3\b\3\b\5\b"+
		"\u0180\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u018c\n\t\3\t\3"+
		"\t\3\t\5\t\u0191\n\t\3\t\5\t\u0194\n\t\3\n\5\n\u0197\n\n\3\n\3\n\3\n\3"+
		"\n\5\n\u019d\n\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u01a5\n\13\3\f\3\f\3"+
		"\r\3\r\5\r\u01ab\n\r\3\16\3\16\3\16\3\16\5\16\u01b1\n\16\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u01c5\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u01d0\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01d8\n\25\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\5\27\u01e2\n\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u01eb\n\27\5\27\u01ed\n\27\3\30\3\30\3\31\3\31\5\31\u01f3"+
		"\n\31\3\31\3\31\3\31\5\31\u01f8\n\31\7\31\u01fa\n\31\f\31\16\31\u01fd"+
		"\13\31\3\32\3\32\5\32\u0201\n\32\3\33\3\33\3\33\3\33\5\33\u0207\n\33\3"+
		"\33\5\33\u020a\n\33\3\33\3\33\5\33\u020e\n\33\3\33\3\33\5\33\u0212\n\33"+
		"\7\33\u0214\n\33\f\33\16\33\u0217\13\33\3\33\5\33\u021a\n\33\3\33\5\33"+
		"\u021d\n\33\3\33\3\33\3\34\3\34\3\34\5\34\u0224\n\34\3\35\3\35\5\35\u0228"+
		"\n\35\3\35\3\35\3\35\3\35\5\35\u022e\n\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u0238\n\35\3\35\5\35\u023b\n\35\3\36\3\36\3\36\7\36\u0240"+
		"\n\36\f\36\16\36\u0243\13\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u024b"+
		"\n\37\f\37\16\37\u024e\13\37\3\37\3\37\3\37\3\37\3\37\5\37\u0255\n\37"+
		"\3\37\3\37\7\37\u0259\n\37\f\37\16\37\u025c\13\37\3\37\3\37\3\37\5\37"+
		"\u0261\n\37\3 \3 \3 \3 \3 \5 \u0268\n \3!\3!\3!\3!\3!\5!\u026f\n!\3\""+
		"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0283\n$\3%\3"+
		"%\5%\u0287\n%\3%\3%\3%\3%\3%\5%\u028e\n%\3%\3%\7%\u0292\n%\f%\16%\u0295"+
		"\13%\3%\3%\5%\u0299\n%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3*\3*\7*\u02a8"+
		"\n*\f*\16*\u02ab\13*\3*\7*\u02ae\n*\f*\16*\u02b1\13*\3*\7*\u02b4\n*\f"+
		"*\16*\u02b7\13*\6*\u02b9\n*\r*\16*\u02ba\3*\3*\5*\u02bf\n*\3+\3+\3,\3"+
		",\3-\3-\3.\3.\3.\5.\u02ca\n.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\5.\u02f4\n.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\6\62\u0308\n\62\r\62\16\62\u0309"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3"+
		";\3;\3<\3<\3=\3=\3>\3>\3>\3>\5>\u0326\n>\3?\3?\3?\6?\u032b\n?\r?\16?\u032c"+
		"\3@\3@\3@\5@\u0332\n@\3A\3A\5A\u0336\nA\3A\5A\u0339\nA\3A\5A\u033c\nA"+
		"\3A\3A\5A\u0340\nA\3A\3A\3B\3B\3B\3B\3B\3C\3C\3D\5D\u034c\nD\3D\5D\u034f"+
		"\nD\3D\3D\5D\u0353\nD\5D\u0355\nD\3D\3D\5D\u0359\nD\3D\3D\5D\u035d\nD"+
		"\3D\5D\u0360\nD\3D\5D\u0363\nD\3D\5D\u0366\nD\3D\3D\3D\5D\u036b\nD\3D"+
		"\3D\5D\u036f\nD\3D\5D\u0372\nD\3D\5D\u0375\nD\3D\3D\5D\u0379\nD\3E\3E"+
		"\3F\3F\5F\u037f\nF\7F\u0381\nF\fF\16F\u0384\13F\3F\3F\3F\3F\5F\u038a\n"+
		"F\7F\u038c\nF\fF\16F\u038f\13F\3F\3F\5F\u0393\nF\5F\u0395\nF\3G\3G\5G"+
		"\u0399\nG\3G\5G\u039c\nG\3G\5G\u039f\nG\3G\3G\5G\u03a3\nG\3G\3G\5G\u03a7"+
		"\nG\7G\u03a9\nG\fG\16G\u03ac\13G\3G\5G\u03af\nG\3G\3G\5G\u03b3\nG\3G\3"+
		"G\3G\5G\u03b8\nG\3G\7G\u03bb\nG\fG\16G\u03be\13G\3G\5G\u03c1\nG\3G\3G"+
		"\5G\u03c5\nG\3G\3G\3G\3G\5G\u03cb\nG\3G\7G\u03ce\nG\fG\16G\u03d1\13G\3"+
		"G\3G\5G\u03d5\nG\3G\5G\u03d8\nG\3G\5G\u03db\nG\6G\u03dd\nG\rG\16G\u03de"+
		"\5G\u03e1\nG\3H\3H\3H\5H\u03e6\nH\3H\7H\u03e9\nH\fH\16H\u03ec\13H\3H\3"+
		"H\5H\u03f0\nH\3H\5H\u03f3\nH\3I\3I\3I\3I\5I\u03f9\nI\3J\5J\u03fc\nJ\3"+
		"J\3J\3J\3J\3J\5J\u0403\nJ\3J\5J\u0406\nJ\3K\3K\3K\3L\3L\3L\3L\7L\u040f"+
		"\nL\fL\16L\u0412\13L\3M\3M\3M\3N\5N\u0418\nN\3N\3N\3O\3O\5O\u041e\nO\3"+
		"O\3O\3P\3P\3P\3P\3P\3P\3P\5P\u0429\nP\3Q\3Q\3Q\3Q\3Q\3R\7R\u0431\nR\f"+
		"R\16R\u0434\13R\3R\3R\3R\3R\7R\u043a\nR\fR\16R\u043d\13R\7R\u043f\nR\f"+
		"R\16R\u0442\13R\3S\3S\3T\5T\u0447\nT\3T\3T\5T\u044b\nT\3T\3T\5T\u044f"+
		"\nT\5T\u0451\nT\3T\5T\u0454\nT\3T\3T\3T\3T\3T\5T\u045b\nT\5T\u045d\nT"+
		"\3T\3T\3T\5T\u0462\nT\3T\3T\5T\u0466\nT\3T\3T\3T\5T\u046b\nT\3T\3T\5T"+
		"\u046f\nT\3T\3T\5T\u0473\nT\3T\5T\u0476\nT\3T\3T\3T\3T\5T\u047c\nT\5T"+
		"\u047e\nT\3T\3T\5T\u0482\nT\5T\u0484\nT\3T\3T\5T\u0488\nT\5T\u048a\nT"+
		"\3T\3T\5T\u048e\nT\3T\5T\u0491\nT\3T\5T\u0494\nT\5T\u0496\nT\3U\6U\u0499"+
		"\nU\rU\16U\u049a\3V\3V\5V\u049f\nV\3V\5V\u04a2\nV\3V\3V\5V\u04a6\nV\5"+
		"V\u04a8\nV\3V\5V\u04ab\nV\3V\3V\3V\3V\5V\u04b1\nV\3V\5V\u04b4\nV\3V\3"+
		"V\5V\u04b8\nV\3V\5V\u04bb\nV\3V\3V\5V\u04bf\nV\3V\3V\3V\3V\3V\5V\u04c6"+
		"\nV\3V\5V\u04c9\nV\3V\5V\u04cc\nV\3W\3W\5W\u04d0\nW\3W\3W\5W\u04d4\nW"+
		"\3W\7W\u04d7\nW\fW\16W\u04da\13W\3W\5W\u04dd\nW\3W\5W\u04e0\nW\3W\3W\3"+
		"X\3X\5X\u04e6\nX\3X\5X\u04e9\nX\3X\5X\u04ec\nX\3X\3X\3X\3Y\3Y\3Z\3Z\3"+
		"Z\3Z\7Z\u04f7\nZ\fZ\16Z\u04fa\13Z\3[\3[\5[\u04fe\n[\5[\u0500\n[\3[\5["+
		"\u0503\n[\3[\3[\3\\\3\\\5\\\u0509\n\\\3\\\3\\\5\\\u050d\n\\\3\\\3\\\5"+
		"\\\u0511\n\\\3\\\3\\\5\\\u0515\n\\\3\\\3\\\5\\\u0519\n\\\3\\\3\\\5\\\u051d"+
		"\n\\\3\\\3\\\5\\\u0521\n\\\3\\\3\\\5\\\u0525\n\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\5\\\u0532\n\\\7\\\u0534\n\\\f\\\16\\\u0537\13\\"+
		"\3\\\6\\\u053a\n\\\r\\\16\\\u053b\3]\3]\5]\u0540\n]\3]\3]\5]\u0544\n]"+
		"\3]\3]\5]\u0548\n]\3]\3]\5]\u054c\n]\3]\3]\5]\u0550\n]\3]\3]\5]\u0554"+
		"\n]\3]\3]\5]\u0558\n]\6]\u055a\n]\r]\16]\u055b\3^\3^\5^\u0560\n^\3_\3"+
		"_\3_\3_\3_\3_\3_\5_\u0569\n_\3_\7_\u056c\n_\f_\16_\u056f\13_\5_\u0571"+
		"\n_\3_\5_\u0574\n_\3`\3`\5`\u0578\n`\3`\3`\3`\5`\u057d\n`\3a\5a\u0580"+
		"\na\3a\3a\3a\3a\3a\5a\u0587\na\5a\u0589\na\3a\5a\u058c\na\3b\3b\3b\7b"+
		"\u0591\nb\fb\16b\u0594\13b\3b\3b\3b\5b\u0599\nb\3c\3c\3d\3d\5d\u059f\n"+
		"d\6d\u05a1\nd\rd\16d\u05a2\3e\3e\3f\3f\3f\7f\u05aa\nf\ff\16f\u05ad\13"+
		"f\3f\5f\u05b0\nf\3f\5f\u05b3\nf\3f\5f\u05b6\nf\3f\3f\5f\u05ba\nf\3f\5"+
		"f\u05bd\nf\3f\5f\u05c0\nf\3f\5f\u05c3\nf\3f\3f\7f\u05c7\nf\ff\16f\u05ca"+
		"\13f\3g\3g\5g\u05ce\ng\3g\5g\u05d1\ng\3g\5g\u05d4\ng\3g\3g\5g\u05d8\n"+
		"g\3g\5g\u05db\ng\3g\5g\u05de\ng\3g\3g\5g\u05e2\ng\3h\3h\3h\5h\u05e7\n"+
		"h\3h\5h\u05ea\nh\3h\5h\u05ed\nh\3h\3h\5h\u05f1\nh\3h\5h\u05f4\nh\3h\5"+
		"h\u05f7\nh\3h\3h\5h\u05fb\nh\3h\5h\u05fe\nh\3h\5h\u0601\nh\3h\3h\5h\u0605"+
		"\nh\3h\5h\u0608\nh\3h\5h\u060b\nh\3h\3h\5h\u060f\nh\3i\3i\5i\u0613\ni"+
		"\3i\5i\u0616\ni\3i\5i\u0619\ni\3i\3i\5i\u061d\ni\3i\5i\u0620\ni\3i\5i"+
		"\u0623\ni\3i\5i\u0626\ni\3j\3j\5j\u062a\nj\3j\5j\u062d\nj\3j\5j\u0630"+
		"\nj\3j\3j\5j\u0634\nj\3j\5j\u0637\nj\3j\5j\u063a\nj\3j\5j\u063d\nj\3k"+
		"\3k\5k\u0641\nk\3k\5k\u0644\nk\3k\5k\u0647\nk\3k\3k\5k\u064b\nk\3k\5k"+
		"\u064e\nk\3k\5k\u0651\nk\3k\5k\u0654\nk\3l\3l\5l\u0658\nl\3l\5l\u065b"+
		"\nl\3l\5l\u065e\nl\3l\3l\5l\u0662\nl\3l\5l\u0665\nl\3l\5l\u0668\nl\3l"+
		"\5l\u066b\nl\3m\3m\5m\u066f\nm\3m\5m\u0672\nm\3m\5m\u0675\nm\3m\3m\5m"+
		"\u0679\nm\3m\5m\u067c\nm\3m\5m\u067f\nm\3m\5m\u0682\nm\3n\3n\5n\u0686"+
		"\nn\3n\5n\u0689\nn\3n\5n\u068c\nn\3n\3n\5n\u0690\nn\3n\5n\u0693\nn\3n"+
		"\5n\u0696\nn\3n\3n\5n\u069a\nn\3o\3o\5o\u069e\no\3o\5o\u06a1\no\3o\5o"+
		"\u06a4\no\3o\3o\5o\u06a8\no\3o\5o\u06ab\no\3o\5o\u06ae\no\3o\3o\5o\u06b2"+
		"\no\3p\3p\5p\u06b6\np\3p\5p\u06b9\np\3p\5p\u06bc\np\3p\3p\5p\u06c0\np"+
		"\3p\5p\u06c3\np\3p\5p\u06c6\np\3p\5p\u06c9\np\3q\3q\5q\u06cd\nq\3q\5q"+
		"\u06d0\nq\3q\5q\u06d3\nq\3q\3q\5q\u06d7\nq\3q\5q\u06da\nq\3q\5q\u06dd"+
		"\nq\3q\5q\u06e0\nq\3r\3r\5r\u06e4\nr\3r\5r\u06e7\nr\3r\5r\u06ea\nr\3r"+
		"\3r\5r\u06ee\nr\3r\5r\u06f1\nr\3r\5r\u06f4\nr\3r\5r\u06f7\nr\3s\3s\3s"+
		"\5s\u06fc\ns\3s\3s\3s\3s\3s\3s\5s\u0704\ns\3t\3t\3t\3t\3t\3t\5t\u070c"+
		"\nt\3u\3u\3u\3u\5u\u0712\nu\3v\3v\3v\3v\3v\3v\3v\3v\5v\u071c\nv\3w\3w"+
		"\3w\3x\5x\u0722\nx\3x\3x\5x\u0726\nx\3x\5x\u0729\nx\3x\5x\u072c\nx\3x"+
		"\3x\5x\u0730\nx\3x\5x\u0733\nx\3x\5x\u0736\nx\3x\3x\5x\u073a\nx\3x\3x"+
		"\3x\5x\u073f\nx\3x\3x\5x\u0743\nx\3x\5x\u0746\nx\3x\5x\u0749\nx\3x\3x"+
		"\5x\u074d\nx\3x\5x\u0750\nx\3x\5x\u0753\nx\3x\3x\5x\u0757\nx\3x\3x\5x"+
		"\u075b\nx\3y\3y\5y\u075f\ny\3y\5y\u0762\ny\3y\5y\u0765\ny\3y\3y\3z\3z"+
		"\5z\u076b\nz\3z\5z\u076e\nz\3z\5z\u0771\nz\3z\3z\3z\3z\3z\3z\5z\u0779"+
		"\nz\3z\5z\u077c\nz\3z\5z\u077f\nz\3z\3z\5z\u0783\nz\3{\3{\3|\3|\5|\u0789"+
		"\n|\3|\5|\u078c\n|\3|\5|\u078f\n|\3|\3|\3|\3|\3|\3|\5|\u0797\n|\3|\5|"+
		"\u079a\n|\3|\5|\u079d\n|\3|\5|\u07a0\n|\3}\3}\5}\u07a4\n}\3}\5}\u07a7"+
		"\n}\3}\5}\u07aa\n}\3}\7}\u07ad\n}\f}\16}\u07b0\13}\3~\3~\3\177\3\177\3"+
		"\u0080\3\u0080\7\u0080\u07b8\n\u0080\f\u0080\16\u0080\u07bb\13\u0080\3"+
		"\u0080\5\u0080\u07be\n\u0080\3\u0080\3\u0080\5\u0080\u07c2\n\u0080\3\u0080"+
		"\3\u0080\5\u0080\u07c6\n\u0080\6\u0080\u07c8\n\u0080\r\u0080\16\u0080"+
		"\u07c9\3\u0080\3\u0080\3\u0080\5\u0080\u07cf\n\u0080\3\u0080\3\u0080\3"+
		"\u0080\3\u0080\7\u0080\u07d5\n\u0080\f\u0080\16\u0080\u07d8\13\u0080\3"+
		"\u0080\3\u0080\5\u0080\u07dc\n\u0080\5\u0080\u07de\n\u0080\7\u0080\u07e0"+
		"\n\u0080\f\u0080\16\u0080\u07e3\13\u0080\3\u0080\3\u0080\3\u0081\3\u0081"+
		"\5\u0081\u07e9\n\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u07ee\n\u0081\3"+
		"\u0081\3\u0081\5\u0081\u07f2\n\u0081\3\u0081\5\u0081\u07f5\n\u0081\3\u0081"+
		"\5\u0081\u07f8\n\u0081\3\u0081\5\u0081\u07fb\n\u0081\3\u0081\3\u0081\5"+
		"\u0081\u07ff\n\u0081\3\u0081\3\u0081\5\u0081\u0803\n\u0081\3\u0081\5\u0081"+
		"\u0806\n\u0081\3\u0081\5\u0081\u0809\n\u0081\3\u0081\3\u0081\5\u0081\u080d"+
		"\n\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u0812\n\u0081\3\u0081\5\u0081"+
		"\u0815\n\u0081\3\u0081\5\u0081\u0818\n\u0081\3\u0081\3\u0081\3\u0081\3"+
		"\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u0821\n\u0081\3\u0081\5\u0081\u0824"+
		"\n\u0081\3\u0081\5\u0081\u0827\n\u0081\3\u0081\5\u0081\u082a\n\u0081\3"+
		"\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u0830\n\u0081\3\u0081\5\u0081\u0833"+
		"\n\u0081\3\u0081\5\u0081\u0836\n\u0081\3\u0081\5\u0081\u0839\n\u0081\3"+
		"\u0081\3\u0081\3\u0081\5\u0081\u083e\n\u0081\3\u0081\5\u0081\u0841\n\u0081"+
		"\3\u0081\5\u0081\u0844\n\u0081\3\u0081\7\u0081\u0847\n\u0081\f\u0081\16"+
		"\u0081\u084a\13\u0081\3\u0082\3\u0082\5\u0082\u084e\n\u0082\3\u0082\3"+
		"\u0082\5\u0082\u0852\n\u0082\7\u0082\u0854\n\u0082\f\u0082\16\u0082\u0857"+
		"\13\u0082\3\u0082\5\u0082\u085a\n\u0082\3\u0082\5\u0082\u085d\n\u0082"+
		"\3\u0082\3\u0082\5\u0082\u0861\n\u0082\7\u0082\u0863\n\u0082\f\u0082\16"+
		"\u0082\u0866\13\u0082\3\u0082\3\u0082\3\u0083\5\u0083\u086b\n\u0083\3"+
		"\u0083\5\u0083\u086e\n\u0083\3\u0083\5\u0083\u0871\n\u0083\3\u0083\5\u0083"+
		"\u0874\n\u0083\3\u0083\5\u0083\u0877\n\u0083\3\u0083\5\u0083\u087a\n\u0083"+
		"\3\u0083\5\u0083\u087d\n\u0083\3\u0083\5\u0083\u0880\n\u0083\3\u0083\5"+
		"\u0083\u0883\n\u0083\3\u0083\3\u0083\5\u0083\u0887\n\u0083\7\u0083\u0889"+
		"\n\u0083\f\u0083\16\u0083\u088c\13\u0083\3\u0083\7\u0083\u088f\n\u0083"+
		"\f\u0083\16\u0083\u0892\13\u0083\3\u0083\5\u0083\u0895\n\u0083\3\u0083"+
		"\3\u0083\5\u0083\u0899\n\u0083\5\u0083\u089b\n\u0083\3\u0084\3\u0084\3"+
		"\u0085\5\u0085\u08a0\n\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3"+
		"\u0085\3\u0085\5\u0085\u08a9\n\u0085\3\u0086\3\u0086\3\u0087\3\u0087\3"+
		"\u0087\5\u0087\u08b0\n\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u08b6"+
		"\n\u0087\3\u0087\3\u0087\5\u0087\u08ba\n\u0087\3\u0087\3\u0087\3\u0087"+
		"\5\u0087\u08bf\n\u0087\3\u0088\5\u0088\u08c2\n\u0088\3\u0088\3\u0088\5"+
		"\u0088\u08c6\n\u0088\3\u0089\3\u0089\5\u0089\u08ca\n\u0089\3\u0089\3\u0089"+
		"\5\u0089\u08ce\n\u0089\3\u0089\2\3\u0100\u008a\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4"+
		"\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c"+
		"\u010e\u0110\2\33\b\2\b\16SSUVZ\\ccee\3\2\24\31\3\2\32\35\5\2\b\nSSZZ"+
		"\3\2\24\25\3\2\13\r\4\2\36\36ff\4\2%-\60\61\3\2\62\63\3\2\3\4\5\2\3\4"+
		"\37 yz\3\2\3\5\4\2\3\4\32\33\3\2yz\3\2\37 \4\2\5\5\37 \4\2\5\5\17\17\6"+
		"\2\3\5\17\17\37 yz\3\2{}\3\2./\3\2\26\27\4\2\25\25!\"\3\2\66\67\4\2PP"+
		"WW\5\2\6\6;;BB\u0a71\2\u0115\3\2\2\2\4\u0124\3\2\2\2\6\u0126\3\2\2\2\b"+
		"\u0128\3\2\2\2\n\u012a\3\2\2\2\f\u0179\3\2\2\2\16\u017f\3\2\2\2\20\u0193"+
		"\3\2\2\2\22\u0196\3\2\2\2\24\u01a4\3\2\2\2\26\u01a6\3\2\2\2\30\u01aa\3"+
		"\2\2\2\32\u01b0\3\2\2\2\34\u01b2\3\2\2\2\36\u01b6\3\2\2\2 \u01ba\3\2\2"+
		"\2\"\u01bc\3\2\2\2$\u01c4\3\2\2\2&\u01cf\3\2\2\2(\u01d7\3\2\2\2*\u01d9"+
		"\3\2\2\2,\u01ec\3\2\2\2.\u01ee\3\2\2\2\60\u01f2\3\2\2\2\62\u0200\3\2\2"+
		"\2\64\u0202\3\2\2\2\66\u0223\3\2\2\28\u023a\3\2\2\2:\u023c\3\2\2\2<\u0260"+
		"\3\2\2\2>\u0267\3\2\2\2@\u026e\3\2\2\2B\u0270\3\2\2\2D\u0272\3\2\2\2F"+
		"\u0282\3\2\2\2H\u0298\3\2\2\2J\u029a\3\2\2\2L\u029c\3\2\2\2N\u029e\3\2"+
		"\2\2P\u02a0\3\2\2\2R\u02be\3\2\2\2T\u02c0\3\2\2\2V\u02c2\3\2\2\2X\u02c4"+
		"\3\2\2\2Z\u02f3\3\2\2\2\\\u02f5\3\2\2\2^\u02f7\3\2\2\2`\u02f9\3\2\2\2"+
		"b\u0307\3\2\2\2d\u030b\3\2\2\2f\u030d\3\2\2\2h\u030f\3\2\2\2j\u0311\3"+
		"\2\2\2l\u0313\3\2\2\2n\u0315\3\2\2\2p\u0317\3\2\2\2r\u0319\3\2\2\2t\u031b"+
		"\3\2\2\2v\u031d\3\2\2\2x\u031f\3\2\2\2z\u0325\3\2\2\2|\u032a\3\2\2\2~"+
		"\u032e\3\2\2\2\u0080\u0333\3\2\2\2\u0082\u0343\3\2\2\2\u0084\u0348\3\2"+
		"\2\2\u0086\u0378\3\2\2\2\u0088\u037a\3\2\2\2\u008a\u0394\3\2\2\2\u008c"+
		"\u03e0\3\2\2\2\u008e\u03e2\3\2\2\2\u0090\u03f8\3\2\2\2\u0092\u03fb\3\2"+
		"\2\2\u0094\u0407\3\2\2\2\u0096\u040a\3\2\2\2\u0098\u0413\3\2\2\2\u009a"+
		"\u0417\3\2\2\2\u009c\u041b\3\2\2\2\u009e\u0428\3\2\2\2\u00a0\u042a\3\2"+
		"\2\2\u00a2\u0432\3\2\2\2\u00a4\u0443\3\2\2\2\u00a6\u0495\3\2\2\2\u00a8"+
		"\u0498\3\2\2\2\u00aa\u04cb\3\2\2\2\u00ac\u04cd\3\2\2\2\u00ae\u04e3\3\2"+
		"\2\2\u00b0\u04f0\3\2\2\2\u00b2\u04f2\3\2\2\2\u00b4\u04ff\3\2\2\2\u00b6"+
		"\u0539\3\2\2\2\u00b8\u0559\3\2\2\2\u00ba\u055d\3\2\2\2\u00bc\u0573\3\2"+
		"\2\2\u00be\u057c\3\2\2\2\u00c0\u057f\3\2\2\2\u00c2\u0598\3\2\2\2\u00c4"+
		"\u059a\3\2\2\2\u00c6\u05a0\3\2\2\2\u00c8\u05a4\3\2\2\2\u00ca\u05a6\3\2"+
		"\2\2\u00cc\u05cb\3\2\2\2\u00ce\u060e\3\2\2\2\u00d0\u0610\3\2\2\2\u00d2"+
		"\u0627\3\2\2\2\u00d4\u063e\3\2\2\2\u00d6\u0655\3\2\2\2\u00d8\u066c\3\2"+
		"\2\2\u00da\u0683\3\2\2\2\u00dc\u069b\3\2\2\2\u00de\u06b3\3\2\2\2\u00e0"+
		"\u06ca\3\2\2\2\u00e2\u06e1\3\2\2\2\u00e4\u0703\3\2\2\2\u00e6\u070b\3\2"+
		"\2\2\u00e8\u0711\3\2\2\2\u00ea\u071b\3\2\2\2\u00ec\u071d\3\2\2\2\u00ee"+
		"\u075a\3\2\2\2\u00f0\u075c\3\2\2\2\u00f2\u0782\3\2\2\2\u00f4\u0784\3\2"+
		"\2\2\u00f6\u079f\3\2\2\2\u00f8\u07a1\3\2\2\2\u00fa\u07b1\3\2\2\2\u00fc"+
		"\u07b3\3\2\2\2\u00fe\u07b5\3\2\2\2\u0100\u07fe\3\2\2\2\u0102\u084b\3\2"+
		"\2\2\u0104\u089a\3\2\2\2\u0106\u089c\3\2\2\2\u0108\u08a8\3\2\2\2\u010a"+
		"\u08aa\3\2\2\2\u010c\u08be\3\2\2\2\u010e\u08c1\3\2\2\2\u0110\u08cd\3\2"+
		"\2\2\u0112\u0114\5\4\3\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\3\3\2\2\2\u0117\u0115\3\2\2\2"+
		"\u0118\u0125\5\6\4\2\u0119\u0125\5\b\5\2\u011a\u0125\5\n\6\2\u011b\u0125"+
		"\5\20\t\2\u011c\u0125\5\22\n\2\u011d\u0125\5\u00a4S\2\u011e\u0125\5\24"+
		"\13\2\u011f\u0125\5\30\r\2\u0120\u0125\5J&\2\u0121\u0125\5L\'\2\u0122"+
		"\u0125\5z>\2\u0123\u0125\5x=\2\u0124\u0118\3\2\2\2\u0124\u0119\3\2\2\2"+
		"\u0124\u011a\3\2\2\2\u0124\u011b\3\2\2\2\u0124\u011c\3\2\2\2\u0124\u011d"+
		"\3\2\2\2\u0124\u011e\3\2\2\2\u0124\u011f\3\2\2\2\u0124\u0120\3\2\2\2\u0124"+
		"\u0121\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0123\3\2\2\2\u0125\5\3\2\2\2"+
		"\u0126\u0127\7y\2\2\u0127\7\3\2\2\2\u0128\u0129\7z\2\2\u0129\t\3\2\2\2"+
		"\u012a\u012b\5\f\7\2\u012b\13\3\2\2\2\u012c\u017a\7[\2\2\u012d\u012e\7"+
		"\\\2\2\u012e\u0131\7\3\2\2\u012f\u0132\5\u00be`\2\u0130\u0132\7F\2\2\u0131"+
		"\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0135\7D"+
		"\2\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u017a\7\4\2\2\u0137\u0138\7G\2\2\u0138\u013a\7\3\2\2\u0139\u013b\7D\2"+
		"\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e"+
		"\5\26\f\2\u013d\u013f\7D\2\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\u0141\7\4\2\2\u0141\u017a\3\2\2\2\u0142\u017a\7H"+
		"\2\2\u0143\u0144\7N\2\2\u0144\u0146\7\3\2\2\u0145\u0147\7D\2\2\u0146\u0145"+
		"\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\5\26\f\2"+
		"\u0149\u014b\7D\2\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c"+
		"\3\2\2\2\u014c\u014d\7\4\2\2\u014d\u017a\3\2\2\2\u014e\u014f\7I\2\2\u014f"+
		"\u0151\7\3\2\2\u0150\u0152\7D\2\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\u0155\3\2\2\2\u0153\u0156\5\16\b\2\u0154\u0156\7\5\2\2\u0155"+
		"\u0153\3\2\2\2\u0155\u0154\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0159\7D"+
		"\2\2\u0158\u0157\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b\3\2\2\2\u015a"+
		"\u015c\5\26\f\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3"+
		"\2\2\2\u015d\u015f\7\5\2\2\u015e\u0160\7D\2\2\u015f\u015e\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u0163\5\u00caf\2\u0162\u0161"+
		"\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165\3\2\2\2\u0164\u0166\7D\2\2\u0165"+
		"\u0164\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\7\4"+
		"\2\2\u0168\u016a\7\5\2\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2\2\2\u016a"+
		"\u017a\3\2\2\2\u016b\u017a\7O\2\2\u016c\u016d\7J\2\2\u016d\u016f\7\3\2"+
		"\2\u016e\u0170\7D\2\2\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171"+
		"\3\2\2\2\u0171\u0173\5\26\f\2\u0172\u0174\7D\2\2\u0173\u0172\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\7\4\2\2\u0176\u0178\7\5"+
		"\2\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179"+
		"\u012c\3\2\2\2\u0179\u012d\3\2\2\2\u0179\u0137\3\2\2\2\u0179\u0142\3\2"+
		"\2\2\u0179\u0143\3\2\2\2\u0179\u014e\3\2\2\2\u0179\u016b\3\2\2\2\u0179"+
		"\u016c\3\2\2\2\u017a\r\3\2\2\2\u017b\u0180\5\u00a4S\2\u017c\u017d\5\u00ca"+
		"f\2\u017d\u017e\7\5\2\2\u017e\u0180\3\2\2\2\u017f\u017b\3\2\2\2\u017f"+
		"\u017c\3\2\2\2\u0180\17\3\2\2\2\u0181\u0182\7K\2\2\u0182\u0194\7\5\2\2"+
		"\u0183\u0184\7M\2\2\u0184\u0194\7\5\2\2\u0185\u0186\7P\2\2\u0186\u0187"+
		"\5\u00c2b\2\u0187\u0188\7\5\2\2\u0188\u0194\3\2\2\2\u0189\u018b\7Q\2\2"+
		"\u018a\u018c\5\u00caf\2\u018b\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u018d\3\2\2\2\u018d\u0194\7\5\2\2\u018e\u0190\7]\2\2\u018f\u0191\5\u00ca"+
		"f\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2\2\2\u0192"+
		"\u0194\7\5\2\2\u0193\u0181\3\2\2\2\u0193\u0183\3\2\2\2\u0193\u0185\3\2"+
		"\2\2\u0193\u0189\3\2\2\2\u0193\u018e\3\2\2\2\u0194\21\3\2\2\2\u0195\u0197"+
		"\7L\2\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u019c\3\2\2\2\u0198"+
		"\u019d\5\u00c2b\2\u0199\u019d\5\u00c4c\2\u019a\u019d\7\u0080\2\2\u019b"+
		"\u019d\5\u00e6t\2\u019c\u0198\3\2\2\2\u019c\u0199\3\2\2\2\u019c\u019a"+
		"\3\2\2\2\u019c\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\7\6\2\2\u019f"+
		"\23\3\2\2\2\u01a0\u01a1\5\u00caf\2\u01a1\u01a2\7\5\2\2\u01a2\u01a5\3\2"+
		"\2\2\u01a3\u01a5\5\u010a\u0086\2\u01a4\u01a0\3\2\2\2\u01a4\u01a3\3\2\2"+
		"\2\u01a5\25\3\2\2\2\u01a6\u01a7\5\u00caf\2\u01a7\27\3\2\2\2\u01a8\u01ab"+
		"\5\32\16\2\u01a9\u01ab\5&\24\2\u01aa\u01a8\3\2\2\2\u01aa\u01a9\3\2\2\2"+
		"\u01ab\31\3\2\2\2\u01ac\u01b1\5\34\17\2\u01ad\u01b1\5\36\20\2\u01ae\u01b1"+
		"\5 \21\2\u01af\u01b1\5\"\22\2\u01b0\u01ac\3\2\2\2\u01b0\u01ad\3\2\2\2"+
		"\u01b0\u01ae\3\2\2\2\u01b0\u01af\3\2\2\2\u01b1\33\3\2\2\2\u01b2\u01b3"+
		"\7g\2\2\u01b3\u01b4\5$\23\2\u01b4\u01b5\b\17\1\2\u01b5\35\3\2\2\2\u01b6"+
		"\u01b7\7h\2\2\u01b7\u01b8\5$\23\2\u01b8\u01b9\b\20\1\2\u01b9\37\3\2\2"+
		"\2\u01ba\u01bb\7i\2\2\u01bb!\3\2\2\2\u01bc\u01bd\7j\2\2\u01bd#\3\2\2\2"+
		"\u01be\u01c5\5\26\f\2\u01bf\u01c0\7\3\2\2\u01c0\u01c1\5\26\f\2\u01c1\u01c2"+
		"\7\4\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c5\5.\30\2\u01c4\u01be\3\2\2\2\u01c4"+
		"\u01bf\3\2\2\2\u01c4\u01c3\3\2\2\2\u01c5%\3\2\2\2\u01c6\u01d0\5(\25\2"+
		"\u01c7\u01d0\5*\26\2\u01c8\u01d0\5\66\34\2\u01c9\u01d0\58\35\2\u01ca\u01d0"+
		"\5> \2\u01cb\u01d0\5@!\2\u01cc\u01d0\5F$\2\u01cd\u01d0\5H%\2\u01ce\u01d0"+
		"\5\64\33\2\u01cf\u01c6\3\2\2\2\u01cf\u01c7\3\2\2\2\u01cf\u01c8\3\2\2\2"+
		"\u01cf\u01c9\3\2\2\2\u01cf\u01ca\3\2\2\2\u01cf\u01cb\3\2\2\2\u01cf\u01cc"+
		"\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01ce\3\2\2\2\u01d0\'\3\2\2\2\u01d1"+
		"\u01d2\7k\2\2\u01d2\u01d3\5,\27\2\u01d3\u01d4\5\62\32\2\u01d4\u01d8\3"+
		"\2\2\2\u01d5\u01d6\7k\2\2\u01d6\u01d8\5,\27\2\u01d7\u01d1\3\2\2\2\u01d7"+
		"\u01d5\3\2\2\2\u01d8)\3\2\2\2\u01d9\u01da\7l\2\2\u01da\u01db\5,\27\2\u01db"+
		"+\3\2\2\2\u01dc\u01e1\5\u00c2b\2\u01dd\u01de\7\3\2\2\u01de\u01df\5\60"+
		"\31\2\u01df\u01e0\7\4\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01dd\3\2\2\2\u01e1"+
		"\u01e2\3\2\2\2\u01e2\u01ed\3\2\2\2\u01e3\u01ed\5.\30\2\u01e4\u01ed\7w"+
		"\2\2\u01e5\u01ea\7\7\2\2\u01e6\u01e7\7\3\2\2\u01e7\u01e8\5\60\31\2\u01e8"+
		"\u01e9\7\4\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01e6\3\2\2\2\u01ea\u01eb\3\2"+
		"\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01dc\3\2\2\2\u01ec\u01e3\3\2\2\2\u01ec"+
		"\u01e4\3\2\2\2\u01ec\u01e5\3\2\2\2\u01ed-\3\2\2\2\u01ee\u01ef\t\2\2\2"+
		"\u01ef/\3\2\2\2\u01f0\u01f3\5\u00c2b\2\u01f1\u01f3\7F\2\2\u01f2\u01f0"+
		"\3\2\2\2\u01f2\u01f1\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01fb\3\2\2\2\u01f4"+
		"\u01f7\7\17\2\2\u01f5\u01f8\5\u00c2b\2\u01f6\u01f8\7F\2\2\u01f7\u01f5"+
		"\3\2\2\2\u01f7\u01f6\3\2\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01f4\3\2\2\2\u01fa"+
		"\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\61\3\2\2"+
		"\2\u01fd\u01fb\3\2\2\2\u01fe\u0201\5\u00caf\2\u01ff\u0201\b\32\1\2\u0200"+
		"\u01fe\3\2\2\2\u0200\u01ff\3\2\2\2\u0201\63\3\2\2\2\u0202\u0203\5,\27"+
		"\2\u0203\u021c\7\3\2\2\u0204\u0207\5\u00caf\2\u0205\u0207\5\u00b6\\\2"+
		"\u0206\u0204\3\2\2\2\u0206\u0205\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0209"+
		"\3\2\2\2\u0208\u020a\7D\2\2\u0209\u0208\3\2\2\2\u0209\u020a\3\2\2\2\u020a"+
		"\u0215\3\2\2\2\u020b\u020d\7\17\2\2\u020c\u020e\7D\2\2\u020d\u020c\3\2"+
		"\2\2\u020d\u020e\3\2\2\2\u020e\u0211\3\2\2\2\u020f\u0212\5\u00caf\2\u0210"+
		"\u0212\5\u00b6\\\2\u0211\u020f\3\2\2\2\u0211\u0210\3\2\2\2\u0212\u0214"+
		"\3\2\2\2\u0213\u020b\3\2\2\2\u0214\u0217\3\2\2\2\u0215\u0213\3\2\2\2\u0215"+
		"\u0216\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215\3\2\2\2\u0218\u021a\7\17"+
		"\2\2\u0219\u0218\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021d\3\2\2\2\u021b"+
		"\u021d\7T\2\2\u021c\u0206\3\2\2\2\u021c\u021b\3\2\2\2\u021d\u021e\3\2"+
		"\2\2\u021e\u021f\7\4\2\2\u021f\65\3\2\2\2\u0220\u0221\7m\2\2\u0221\u0224"+
		"\7\u0081\2\2\u0222\u0224\7m\2\2\u0223\u0220\3\2\2\2\u0223\u0222\3\2\2"+
		"\2\u0224\67\3\2\2\2\u0225\u0227\7n\2\2\u0226\u0228\7\u0081\2\2\u0227\u0226"+
		"\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u023b\3\2\2\2\u0229\u022a\7v\2\2\u022a"+
		"\u022b\7\3\2\2\u022b\u022d\7\3\2\2\u022c\u022e\5:\36\2\u022d\u022c\3\2"+
		"\2\2\u022d\u022e\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\7\4\2\2\u0230"+
		"\u023b\7\4\2\2\u0231\u023b\7\20\2\2\u0232\u023b\7\21\2\2\u0233\u023b\7"+
		"\22\2\2\u0234\u0235\7\23\2\2\u0235\u0237\7\3\2\2\u0236\u0238\5:\36\2\u0237"+
		"\u0236\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023b\7\4"+
		"\2\2\u023a\u0225\3\2\2\2\u023a\u0229\3\2\2\2\u023a\u0231\3\2\2\2\u023a"+
		"\u0232\3\2\2\2\u023a\u0233\3\2\2\2\u023a\u0234\3\2\2\2\u023b9\3\2\2\2"+
		"\u023c\u0241\5<\37\2\u023d\u023e\7\17\2\2\u023e\u0240\5<\37\2\u023f\u023d"+
		"\3\2\2\2\u0240\u0243\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242"+
		";\3\2\2\2\u0243\u0241\3\2\2\2\u0244\u0261\5,\27\2\u0245\u0246\5,\27\2"+
		"\u0246\u0247\7\3\2\2\u0247\u024c\5\u00c2b\2\u0248\u0249\7\17\2\2\u0249"+
		"\u024b\5\u00caf\2\u024a\u0248\3\2\2\2\u024b\u024e\3\2\2\2\u024c\u024a"+
		"\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024f\3\2\2\2\u024e\u024c\3\2\2\2\u024f"+
		"\u0250\7\4\2\2\u0250\u0261\3\2\2\2\u0251\u0252\5,\27\2\u0252\u0254\7\3"+
		"\2\2\u0253\u0255\5\u00caf\2\u0254\u0253\3\2\2\2\u0254\u0255\3\2\2\2\u0255"+
		"\u025a\3\2\2\2\u0256\u0257\7\17\2\2\u0257\u0259\5\u00caf\2\u0258\u0256"+
		"\3\2\2\2\u0259\u025c\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b"+
		"\u025d\3\2\2\2\u025c\u025a\3\2\2\2\u025d\u025e\7\4\2\2\u025e\u0261\3\2"+
		"\2\2\u025f\u0261\5R*\2\u0260\u0244\3\2\2\2\u0260\u0245\3\2\2\2\u0260\u0251"+
		"\3\2\2\2\u0260\u025f\3\2\2\2\u0261=\3\2\2\2\u0262\u0263\7o\2\2\u0263\u0268"+
		"\5B\"\2\u0264\u0265\7o\2\2\u0265\u0268\5,\27\2\u0266\u0268\7o\2\2\u0267"+
		"\u0262\3\2\2\2\u0267\u0264\3\2\2\2\u0267\u0266\3\2\2\2\u0268?\3\2\2\2"+
		"\u0269\u026a\7p\2\2\u026a\u026f\5B\"\2\u026b\u026c\7p\2\2\u026c\u026f"+
		"\5,\27\2\u026d\u026f\7p\2\2\u026e\u0269\3\2\2\2\u026e\u026b\3\2\2\2\u026e"+
		"\u026d\3\2\2\2\u026fA\3\2\2\2\u0270\u0271\5D#\2\u0271C\3\2\2\2\u0272\u0273"+
		"\7\u0081\2\2\u0273E\3\2\2\2\u0274\u0275\7q\2\2\u0275\u0276\7|\2\2\u0276"+
		"\u0283\7\u0081\2\2\u0277\u0278\7q\2\2\u0278\u0279\7|\2\2\u0279\u0283\5"+
		",\27\2\u027a\u027b\7q\2\2\u027b\u027c\5,\27\2\u027c\u027d\7\u0081\2\2"+
		"\u027d\u0283\3\2\2\2\u027e\u027f\7q\2\2\u027f\u0283\5,\27\2\u0280\u0281"+
		"\7q\2\2\u0281\u0283\7|\2\2\u0282\u0274\3\2\2\2\u0282\u0277\3\2\2\2\u0282"+
		"\u027a\3\2\2\2\u0282\u027e\3\2\2\2\u0282\u0280\3\2\2\2\u0283G\3\2\2\2"+
		"\u0284\u0286\7r\2\2\u0285\u0287\7s\2\2\u0286\u0285\3\2\2\2\u0286\u0287"+
		"\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u0289\7t\2\2\u0289\u028a\7\u0081\2"+
		"\2\u028a\u0299\b%\1\2\u028b\u028d\7r\2\2\u028c\u028e\7s\2\2\u028d\u028c"+
		"\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0293\7t\2\2\u0290"+
		"\u0292\5\u00c2b\2\u0291\u0290\3\2\2\2\u0292\u0295\3\2\2\2\u0293\u0291"+
		"\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0299\3\2\2\2\u0295\u0293\3\2\2\2\u0296"+
		"\u0297\7r\2\2\u0297\u0299\b%\1\2\u0298\u0284\3\2\2\2\u0298\u028b\3\2\2"+
		"\2\u0298\u0296\3\2\2\2\u0299I\3\2\2\2\u029a\u029b\7\177\2\2\u029bK\3\2"+
		"\2\2\u029c\u029d\7D\2\2\u029dM\3\2\2\2\u029e\u029f\t\3\2\2\u029fO\3\2"+
		"\2\2\u02a0\u02a1\t\4\2\2\u02a1Q\3\2\2\2\u02a2\u02bf\7{\2\2\u02a3\u02bf"+
		"\7}\2\2\u02a4\u02bf\7|\2\2\u02a5\u02a9\7\u0081\2\2\u02a6\u02a8\7D\2\2"+
		"\u02a7\u02a6\3\2\2\2\u02a8\u02ab\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9\u02aa"+
		"\3\2\2\2\u02aa\u02af\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ac\u02ae\7\177\2\2"+
		"\u02ad\u02ac\3\2\2\2\u02ae\u02b1\3\2\2\2\u02af\u02ad\3\2\2\2\u02af\u02b0"+
		"\3\2\2\2\u02b0\u02b5\3\2\2\2\u02b1\u02af\3\2\2\2\u02b2\u02b4\7D\2\2\u02b3"+
		"\u02b2\3\2\2\2\u02b4\u02b7\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b5\u02b6\3\2"+
		"\2\2\u02b6\u02b9\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b8\u02a5\3\2\2\2\u02b9"+
		"\u02ba\3\2\2\2\u02ba\u02b8\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bf\3\2"+
		"\2\2\u02bc\u02bf\7\u0080\2\2\u02bd\u02bf\7~\2\2\u02be\u02a2\3\2\2\2\u02be"+
		"\u02a3\3\2\2\2\u02be\u02a4\3\2\2\2\u02be\u02b8\3\2\2\2\u02be\u02bc\3\2"+
		"\2\2\u02be\u02bd\3\2\2\2\u02bfS\3\2\2\2\u02c0\u02c1\t\5\2\2\u02c1U\3\2"+
		"\2\2\u02c2\u02c3\t\6\2\2\u02c3W\3\2\2\2\u02c4\u02c5\t\7\2\2\u02c5Y\3\2"+
		"\2\2\u02c6\u02c9\t\b\2\2\u02c7\u02c8\7\37\2\2\u02c8\u02ca\7 \2\2\u02c9"+
		"\u02c7\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02f4\3\2\2\2\u02cb\u02f4\7\26"+
		"\2\2\u02cc\u02f4\7\27\2\2\u02cd\u02f4\7\25\2\2\u02ce\u02f4\7!\2\2\u02cf"+
		"\u02f4\7\"\2\2\u02d0\u02f4\7#\2\2\u02d1\u02f4\7\24\2\2\u02d2\u02f4\7$"+
		"\2\2\u02d3\u02f4\7\30\2\2\u02d4\u02f4\7\31\2\2\u02d5\u02f4\7%\2\2\u02d6"+
		"\u02f4\7\32\2\2\u02d7\u02f4\7\33\2\2\u02d8\u02f4\7&\2\2\u02d9\u02f4\7"+
		"\'\2\2\u02da\u02f4\7(\2\2\u02db\u02f4\7)\2\2\u02dc\u02f4\7*\2\2\u02dd"+
		"\u02f4\7+\2\2\u02de\u02f4\7,\2\2\u02df\u02f4\7-\2\2\u02e0\u02f4\7.\2\2"+
		"\u02e1\u02f4\7/\2\2\u02e2\u02f4\7\60\2\2\u02e3\u02f4\7\61\2\2\u02e4\u02f4"+
		"\7\62\2\2\u02e5\u02f4\7\63\2\2\u02e6\u02f4\7\34\2\2\u02e7\u02f4\7\35\2"+
		"\2\u02e8\u02f4\7\64\2\2\u02e9\u02f4\7\65\2\2\u02ea\u02f4\7\66\2\2\u02eb"+
		"\u02f4\7\67\2\2\u02ec\u02f4\7\17\2\2\u02ed\u02f4\78\2\2\u02ee\u02f4\7"+
		"9\2\2\u02ef\u02f0\7\3\2\2\u02f0\u02f4\7\4\2\2\u02f1\u02f2\7\37\2\2\u02f2"+
		"\u02f4\7 \2\2\u02f3\u02c6\3\2\2\2\u02f3\u02cb\3\2\2\2\u02f3\u02cc\3\2"+
		"\2\2\u02f3\u02cd\3\2\2\2\u02f3\u02ce\3\2\2\2\u02f3\u02cf\3\2\2\2\u02f3"+
		"\u02d0\3\2\2\2\u02f3\u02d1\3\2\2\2\u02f3\u02d2\3\2\2\2\u02f3\u02d3\3\2"+
		"\2\2\u02f3\u02d4\3\2\2\2\u02f3\u02d5\3\2\2\2\u02f3\u02d6\3\2\2\2\u02f3"+
		"\u02d7\3\2\2\2\u02f3\u02d8\3\2\2\2\u02f3\u02d9\3\2\2\2\u02f3\u02da\3\2"+
		"\2\2\u02f3\u02db\3\2\2\2\u02f3\u02dc\3\2\2\2\u02f3\u02dd\3\2\2\2\u02f3"+
		"\u02de\3\2\2\2\u02f3\u02df\3\2\2\2\u02f3\u02e0\3\2\2\2\u02f3\u02e1\3\2"+
		"\2\2\u02f3\u02e2\3\2\2\2\u02f3\u02e3\3\2\2\2\u02f3\u02e4\3\2\2\2\u02f3"+
		"\u02e5\3\2\2\2\u02f3\u02e6\3\2\2\2\u02f3\u02e7\3\2\2\2\u02f3\u02e8\3\2"+
		"\2\2\u02f3\u02e9\3\2\2\2\u02f3\u02ea\3\2\2\2\u02f3\u02eb\3\2\2\2\u02f3"+
		"\u02ec\3\2\2\2\u02f3\u02ed\3\2\2\2\u02f3\u02ee\3\2\2\2\u02f3\u02ef\3\2"+
		"\2\2\u02f3\u02f1\3\2\2\2\u02f4[\3\2\2\2\u02f5\u02f6\t\t\2\2\u02f6]\3\2"+
		"\2\2\u02f7\u02f8\t\n\2\2\u02f8_\3\2\2\2\u02f9\u02fa\7d\2\2\u02fa\u02fb"+
		"\7\32\2\2\u02fb\u02fc\5b\62\2\u02fc\u02fd\7\33\2\2\u02fda\3\2\2\2\u02fe"+
		"\u02ff\7\32\2\2\u02ff\u0300\5b\62\2\u0300\u0301\7\33\2\2\u0301\u0308\3"+
		"\2\2\2\u0302\u0303\7\3\2\2\u0303\u0304\5b\62\2\u0304\u0305\7\4\2\2\u0305"+
		"\u0308\3\2\2\2\u0306\u0308\5j\66\2\u0307\u02fe\3\2\2\2\u0307\u0302\3\2"+
		"\2\2\u0307\u0306\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u0307\3\2\2\2\u0309"+
		"\u030a\3\2\2\2\u030ac\3\2\2\2\u030b\u030c\n\13\2\2\u030ce\3\2\2\2\u030d"+
		"\u030e\n\f\2\2\u030eg\3\2\2\2\u030f\u0310\n\r\2\2\u0310i\3\2\2\2\u0311"+
		"\u0312\n\16\2\2\u0312k\3\2\2\2\u0313\u0314\n\17\2\2\u0314m\3\2\2\2\u0315"+
		"\u0316\n\20\2\2\u0316o\3\2\2\2\u0317\u0318\n\21\2\2\u0318q\3\2\2\2\u0319"+
		"\u031a\n\22\2\2\u031as\3\2\2\2\u031b\u031c\n\23\2\2\u031cu\3\2\2\2\u031d"+
		"\u031e\n\f\2\2\u031ew\3\2\2\2\u031f\u0320\13\2\2\2\u0320y\3\2\2\2\u0321"+
		"\u0326\5|?\2\u0322\u0326\5~@\2\u0323\u0326\5\u0080A\2\u0324\u0326\5\u0084"+
		"C\2\u0325\u0321\3\2\2\2\u0325\u0322\3\2\2\2\u0325\u0323\3\2\2\2\u0325"+
		"\u0324\3\2\2\2\u0326{\3\2\2\2\u0327\u0328\5,\27\2\u0328\u0329\7\17\2\2"+
		"\u0329\u032b\3\2\2\2\u032a\u0327\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u032a"+
		"\3\2\2\2\u032c\u032d\3\2\2\2\u032d}\3\2\2\2\u032e\u032f\7X\2\2\u032f\u0331"+
		"\7:\2\2\u0330\u0332\7y\2\2\u0331\u0330\3\2\2\2\u0331\u0332\3\2\2\2\u0332"+
		"\177\3\2\2\2\u0333\u0335\5\64\33\2\u0334\u0336\7D\2\2\u0335\u0334\3\2"+
		"\2\2\u0335\u0336\3\2\2\2\u0336\u0338\3\2\2\2\u0337\u0339\5,\27\2\u0338"+
		"\u0337\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033b\3\2\2\2\u033a\u033c\7D"+
		"\2\2\u033b\u033a\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033d\3\2\2\2\u033d"+
		"\u033f\5\64\33\2\u033e\u0340\7D\2\2\u033f\u033e\3\2\2\2\u033f\u0340\3"+
		"\2\2\2\u0340\u0341\3\2\2\2\u0341\u0342\5\u00acW\2\u0342\u0081\3\2\2\2"+
		"\u0343\u0344\7\7\2\2\u0344\u0345\7\3\2\2\u0345\u0346\5\u009eP\2\u0346"+
		"\u0347\7\4\2\2\u0347\u0083\3\2\2\2\u0348\u0349\7w\2\2\u0349\u0085\3\2"+
		"\2\2\u034a\u034c\5`\61\2\u034b\u034a\3\2\2\2\u034b\u034c\3\2\2\2\u034c"+
		"\u034e\3\2\2\2\u034d\u034f\5\u008aF\2\u034e\u034d\3\2\2\2\u034e\u034f"+
		"\3\2\2\2\u034f\u0354\3\2\2\2\u0350\u0352\58\35\2\u0351\u0353\7D\2\2\u0352"+
		"\u0351\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0355\3\2\2\2\u0354\u0350\3\2"+
		"\2\2\u0354\u0355\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u0358\5\u009eP\2\u0357"+
		"\u0359\7D\2\2\u0358\u0357\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u035a\3\2"+
		"\2\2\u035a\u035c\5\u008cG\2\u035b\u035d\5\u0096L\2\u035c\u035b\3\2\2\2"+
		"\u035c\u035d\3\2\2\2\u035d\u035f\3\2\2\2\u035e\u0360\7D\2\2\u035f\u035e"+
		"\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0362\3\2\2\2\u0361\u0363\7\177\2\2"+
		"\u0362\u0361\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0365\3\2\2\2\u0364\u0366"+
		"\7D\2\2\u0365\u0364\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0367\3\2\2\2\u0367"+
		"\u0368\5\u0094K\2\u0368\u0379\3\2\2\2\u0369\u036b\5\u008aF\2\u036a\u0369"+
		"\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036e\5\u0088E"+
		"\2\u036d\u036f\7D\2\2\u036e\u036d\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0371"+
		"\3\2\2\2\u0370\u0372\7\177\2\2\u0371\u0370\3\2\2\2\u0371\u0372\3\2\2\2"+
		"\u0372\u0374\3\2\2\2\u0373\u0375\7D\2\2\u0374\u0373\3\2\2\2\u0374\u0375"+
		"\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0377\5\u0094K\2\u0377\u0379\3\2\2"+
		"\2\u0378\u034b\3\2\2\2\u0378\u036a\3\2\2\2\u0379\u0087\3\2\2\2\u037a\u037b"+
		"\5\64\33\2\u037b\u0089\3\2\2\2\u037c\u037e\5T+\2\u037d\u037f\7D\2\2\u037e"+
		"\u037d\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0381\3\2\2\2\u0380\u037c\3\2"+
		"\2\2\u0381\u0384\3\2\2\2\u0382\u0380\3\2\2\2\u0382\u0383\3\2\2\2\u0383"+
		"\u0385\3\2\2\2\u0384\u0382\3\2\2\2\u0385\u0386\5\u00b6\\\2\u0386\u038d"+
		"\3\2\2\2\u0387\u0389\5V,\2\u0388\u038a\7D\2\2\u0389\u0388\3\2\2\2\u0389"+
		"\u038a\3\2\2\2\u038a\u038c\3\2\2\2\u038b\u0387\3\2\2\2\u038c\u038f\3\2"+
		"\2\2\u038d\u038b\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u0395\3\2\2\2\u038f"+
		"\u038d\3\2\2\2\u0390\u0392\5\64\33\2\u0391\u0393\7D\2\2\u0392\u0391\3"+
		"\2\2\2\u0392\u0393\3\2\2\2\u0393\u0395\3\2\2\2\u0394\u0382\3\2\2\2\u0394"+
		"\u0390\3\2\2\2\u0395\u008b\3\2\2\2\u0396\u0398\7\3\2\2\u0397\u0399\7D"+
		"\2\2\u0398\u0397\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u039b\3\2\2\2\u039a"+
		"\u039c\5\u008eH\2\u039b\u039a\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039e"+
		"\3\2\2\2\u039d\u039f\7D\2\2\u039e\u039d\3\2\2\2\u039e\u039f\3\2\2\2\u039f"+
		"\u03a0\3\2\2\2\u03a0\u03a2\7\4\2\2\u03a1\u03a3\7\25\2\2\u03a2\u03a1\3"+
		"\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03aa\3\2\2\2\u03a4\u03a6\7W\2\2\u03a5"+
		"\u03a7\7D\2\2\u03a6\u03a5\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a9\3\2"+
		"\2\2\u03a8\u03a4\3\2\2\2\u03a9\u03ac\3\2\2\2\u03aa\u03a8\3\2\2\2\u03aa"+
		"\u03ab\3\2\2\2\u03ab\u03ae\3\2\2\2\u03ac\u03aa\3\2\2\2\u03ad\u03af\5\u00a0"+
		"Q\2\u03ae\u03ad\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03e1\3\2\2\2\u03b0"+
		"\u03b2\7\3\2\2\u03b1\u03b3\7D\2\2\u03b2\u03b1\3\2\2\2\u03b2\u03b3\3\2"+
		"\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03bc\5\u00ba^\2\u03b5\u03b7\7\17\2\2\u03b6"+
		"\u03b8\7D\2\2\u03b7\u03b6\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03b9\3\2"+
		"\2\2\u03b9\u03bb\5\u00ba^\2\u03ba\u03b5\3\2\2\2\u03bb\u03be\3\2\2\2\u03bc"+
		"\u03ba\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03c0\3\2\2\2\u03be\u03bc\3\2"+
		"\2\2\u03bf\u03c1\7D\2\2\u03c0\u03bf\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1"+
		"\u03c2\3\2\2\2\u03c2\u03c4\7\4\2\2\u03c3\u03c5\7D\2\2\u03c4\u03c3\3\2"+
		"\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03dc\3\2\2\2\u03c6\u03c7\5\u00b6\\\2\u03c7"+
		"\u03cf\5\u0092J\2\u03c8\u03ca\7\17\2\2\u03c9\u03cb\7D\2\2\u03ca\u03c9"+
		"\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03ce\5\u0092J"+
		"\2\u03cd\u03c8\3\2\2\2\u03ce\u03d1\3\2\2\2\u03cf\u03cd\3\2\2\2\u03cf\u03d0"+
		"\3\2\2\2\u03d0\u03d2\3\2\2\2\u03d1\u03cf\3\2\2\2\u03d2\u03d4\7\5\2\2\u03d3"+
		"\u03d5\7D\2\2\u03d4\u03d3\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d7\3\2"+
		"\2\2\u03d6\u03d8\7\177\2\2\u03d7\u03d6\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8"+
		"\u03da\3\2\2\2\u03d9\u03db\7D\2\2\u03da\u03d9\3\2\2\2\u03da\u03db\3\2"+
		"\2\2\u03db\u03dd\3\2\2\2\u03dc\u03c6\3\2\2\2\u03dd\u03de\3\2\2\2\u03de"+
		"\u03dc\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e1\3\2\2\2\u03e0\u0396\3\2"+
		"\2\2\u03e0\u03b0\3\2\2\2\u03e1\u008d\3\2\2\2\u03e2\u03ea\5\u0090I\2\u03e3"+
		"\u03e5\7\17\2\2\u03e4\u03e6\7D\2\2\u03e5\u03e4\3\2\2\2\u03e5\u03e6\3\2"+
		"\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03e9\5\u0090I\2\u03e8\u03e3\3\2\2\2\u03e9"+
		"\u03ec\3\2\2\2\u03ea\u03e8\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u03f2\3\2"+
		"\2\2\u03ec\u03ea\3\2\2\2\u03ed\u03ef\7\17\2\2\u03ee\u03f0\7D\2\2\u03ef"+
		"\u03ee\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f3\7F"+
		"\2\2\u03f2\u03ed\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u008f\3\2\2\2\u03f4"+
		"\u03f9\7T\2\2\u03f5\u03f6\5\u00b6\\\2\u03f6\u03f7\5\u0092J\2\u03f7\u03f9"+
		"\3\2\2\2\u03f8\u03f4\3\2\2\2\u03f8\u03f5\3\2\2\2\u03f9\u0091\3\2\2\2\u03fa"+
		"\u03fc\5\u00c6d\2\u03fb\u03fa\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u0402"+
		"\3\2\2\2\u03fd\u03fe\7\3\2\2\u03fe\u03ff\5\u0092J\2\u03ff\u0400\7\4\2"+
		"\2\u0400\u0403\3\2\2\2\u0401\u0403\5\u00ba^\2\u0402\u03fd\3\2\2\2\u0402"+
		"\u0401\3\2\2\2\u0403\u0405\3\2\2\2\u0404\u0406\5\u0110\u0089\2\u0405\u0404"+
		"\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0093\3\2\2\2\u0407\u0408\7y\2\2\u0408"+
		"\u0409\bK\1\2\u0409\u0095\3\2\2\2\u040a\u040b\7\6\2\2\u040b\u0410\5\u0098"+
		"M\2\u040c\u040d\7\17\2\2\u040d\u040f\5\u0098M\2\u040e\u040c\3\2\2\2\u040f"+
		"\u0412\3\2\2\2\u0410\u040e\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0097\3\2"+
		"\2\2\u0412\u0410\3\2\2\2\u0413\u0414\5\u009aN\2\u0414\u0415\5\u009cO\2"+
		"\u0415\u0099\3\2\2\2\u0416\u0418\7;\2\2\u0417\u0416\3\2\2\2\u0417\u0418"+
		"\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u041a\5\u00c2b\2\u041a\u009b\3\2\2"+
		"\2\u041b\u041d\7\3\2\2\u041c\u041e\5\u00caf\2\u041d\u041c\3\2\2\2\u041d"+
		"\u041e\3\2\2\2\u041e\u041f\3\2\2\2\u041f\u0420\7\4\2\2\u0420\u009d\3\2"+
		"\2\2\u0421\u0429\5\u00c2b\2\u0422\u0423\7\3\2\2\u0423\u0424\5\u009eP\2"+
		"\u0424\u0425\7\4\2\2\u0425\u0429\3\2\2\2\u0426\u0427\7c\2\2\u0427\u0429"+
		"\5Z.\2\u0428\u0421\3\2\2\2\u0428\u0422\3\2\2\2\u0428\u0426\3\2\2\2\u0429"+
		"\u009f\3\2\2\2\u042a\u042b\7]\2\2\u042b\u042c\7\3\2\2\u042c\u042d\5\u00a2"+
		"R\2\u042d\u042e\7\4\2\2\u042e\u00a1\3\2\2\2\u042f\u0431\5d\63\2\u0430"+
		"\u042f\3\2\2\2\u0431\u0434\3\2\2\2\u0432\u0430\3\2\2\2\u0432\u0433\3\2"+
		"\2\2\u0433\u0440\3\2\2\2\u0434\u0432\3\2\2\2\u0435\u0436\7\3\2\2\u0436"+
		"\u0437\5\u00a2R\2\u0437\u043b\7\4\2\2\u0438\u043a\5d\63\2\u0439\u0438"+
		"\3\2\2\2\u043a\u043d\3\2\2\2\u043b\u0439\3\2\2\2\u043b\u043c\3\2\2\2\u043c"+
		"\u043f\3\2\2\2\u043d\u043b\3\2\2\2\u043e\u0435\3\2\2\2\u043f\u0442\3\2"+
		"\2\2\u0440\u043e\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u00a3\3\2\2\2\u0442"+
		"\u0440\3\2\2\2\u0443\u0444\5\u00a6T\2\u0444\u00a5\3\2\2\2\u0445\u0447"+
		"\5`\61\2\u0446\u0445\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0448\3\2\2\2\u0448"+
		"\u044a\5\u00aeX\2\u0449\u044b\5\u00acW\2\u044a\u0449\3\2\2\2\u044a\u044b"+
		"\3\2\2\2\u044b\u0496\3\2\2\2\u044c\u044e\7R\2\2\u044d\u044f\7D\2\2\u044e"+
		"\u044d\3\2\2\2\u044e\u044f\3\2\2\2\u044f\u0451\3\2\2\2\u0450\u044c\3\2"+
		"\2\2\u0450\u0451\3\2\2\2\u0451\u0453\3\2\2\2\u0452\u0454\5`\61\2\u0453"+
		"\u0452\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u0456\5\u00b6"+
		"\\\2\u0456\u0457\5\u00acW\2\u0457\u0496\3\2\2\2\u0458\u045a\7R\2\2\u0459"+
		"\u045b\7D\2\2\u045a\u0459\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u045d\3\2"+
		"\2\2\u045c\u0458\3\2\2\2\u045c\u045d\3\2\2\2\u045d\u045e\3\2\2\2\u045e"+
		"\u045f\5\u00b6\\\2\u045f\u0461\7\3\2\2\u0460\u0462\5\u00a8U\2\u0461\u0460"+
		"\3\2\2\2\u0461\u0462\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u0465\5V,\2\u0464"+
		"\u0466\5\u00c2b\2\u0465\u0464\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u0467"+
		"\3\2\2\2\u0467\u0468\7\4\2\2\u0468\u046a\5\u00bc_\2\u0469\u046b\7D\2\2"+
		"\u046a\u0469\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u046e\3\2\2\2\u046c\u046f"+
		"\58\35\2\u046d\u046f\5\64\33\2\u046e\u046c\3\2\2\2\u046e\u046d\3\2\2\2"+
		"\u046e\u046f\3\2\2\2\u046f\u0475\3\2\2\2\u0470\u0472\7%\2\2\u0471\u0473"+
		"\7D\2\2\u0472\u0471\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u0474\3\2\2\2\u0474"+
		"\u0476\5\u0106\u0084\2\u0475\u0470\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u0477"+
		"\3\2\2\2\u0477\u0478\7\5\2\2\u0478\u0496\3\2\2\2\u0479\u047b\7W\2\2\u047a"+
		"\u047c\7D\2\2\u047b\u047a\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u047e\3\2"+
		"\2\2\u047d\u0479\3\2\2\2\u047d\u047e\3\2\2\2\u047e\u0483\3\2\2\2\u047f"+
		"\u0481\5T+\2\u0480\u0482\7D\2\2\u0481\u0480\3\2\2\2\u0481\u0482\3\2\2"+
		"\2\u0482\u0484\3\2\2\2\u0483\u047f\3\2\2\2\u0483\u0484\3\2\2\2\u0484\u0489"+
		"\3\2\2\2\u0485\u0487\7R\2\2\u0486\u0488\7D\2\2\u0487\u0486\3\2\2\2\u0487"+
		"\u0488\3\2\2\2\u0488\u048a\3\2\2\2\u0489\u0485\3\2\2\2\u0489\u048a\3\2"+
		"\2\2\u048a\u048b\3\2\2\2\u048b\u048d\5\u00aaV\2\u048c\u048e\7D\2\2\u048d"+
		"\u048c\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u0490\3\2\2\2\u048f\u0491\5\u00ac"+
		"W\2\u0490\u048f\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u0493\3\2\2\2\u0492"+
		"\u0494\7\5\2\2\u0493\u0492\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u0496\3\2"+
		"\2\2\u0495\u0446\3\2\2\2\u0495\u0450\3\2\2\2\u0495\u045c\3\2\2\2\u0495"+
		"\u047d\3\2\2\2\u0496\u00a7\3\2\2\2\u0497\u0499\7x\2\2\u0498\u0497\3\2"+
		"\2\2\u0499\u049a\3\2\2\2\u049a\u0498\3\2\2\2\u049a\u049b\3\2\2\2\u049b"+
		"\u00a9\3\2\2\2\u049c\u049e\7b\2\2\u049d\u049f\7D\2\2\u049e\u049d\3\2\2"+
		"\2\u049e\u049f\3\2\2\2\u049f\u04a1\3\2\2\2\u04a0\u04a2\58\35\2\u04a1\u04a0"+
		"\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04a7\3\2\2\2\u04a3\u04a5\5\u00c2b"+
		"\2\u04a4\u04a6\7D\2\2\u04a5\u04a4\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04a8"+
		"\3\2\2\2\u04a7\u04a3\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u04aa\3\2\2\2\u04a9"+
		"\u04ab\58\35\2\u04aa\u04a9\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab\u04ac\3\2"+
		"\2\2\u04ac\u04ad\7y\2\2\u04ad\u04cc\bV\1\2\u04ae\u04b0\7b\2\2\u04af\u04b1"+
		"\7D\2\2\u04b0\u04af\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b3\3\2\2\2\u04b2"+
		"\u04b4\58\35\2\u04b3\u04b2\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4\u04b5\3\2"+
		"\2\2\u04b5\u04b7\5\u00c2b\2\u04b6\u04b8\7D\2\2\u04b7\u04b6\3\2\2\2\u04b7"+
		"\u04b8\3\2\2\2\u04b8\u04ba\3\2\2\2\u04b9\u04bb\5\u00c6d\2\u04ba\u04b9"+
		"\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u04be\5\u00c2b"+
		"\2\u04bd\u04bf\5\u00c6d\2\u04be\u04bd\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf"+
		"\u04c0\3\2\2\2\u04c0\u04c1\7%\2\2\u04c1\u04c2\bV\1\2\u04c2\u04cc\3\2\2"+
		"\2\u04c3\u04c5\7b\2\2\u04c4\u04c6\7D\2\2\u04c5\u04c4\3\2\2\2\u04c5\u04c6"+
		"\3\2\2\2\u04c6\u04c8\3\2\2\2\u04c7\u04c9\58\35\2\u04c8\u04c7\3\2\2\2\u04c8"+
		"\u04c9\3\2\2\2\u04c9\u04ca\3\2\2\2\u04ca\u04cc\5\u00c2b\2\u04cb\u049c"+
		"\3\2\2\2\u04cb\u04ae\3\2\2\2\u04cb\u04c3\3\2\2\2\u04cc\u00ab\3\2\2\2\u04cd"+
		"\u04d8\5\u010c\u0087\2\u04ce\u04d0\7D\2\2\u04cf\u04ce\3\2\2\2\u04cf\u04d0"+
		"\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d3\7\17\2\2\u04d2\u04d4\7D\2\2\u04d3"+
		"\u04d2\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d7\5\u010c"+
		"\u0087\2\u04d6\u04cf\3\2\2\2\u04d7\u04da\3\2\2\2\u04d8\u04d6\3\2\2\2\u04d8"+
		"\u04d9\3\2\2\2\u04d9\u04dc\3\2\2\2\u04da\u04d8\3\2\2\2\u04db\u04dd\7D"+
		"\2\2\u04dc\u04db\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04df\3\2\2\2\u04de"+
		"\u04e0\58\35\2\u04df\u04de\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e1\3\2"+
		"\2\2\u04e1\u04e2\7\5\2\2\u04e2\u00ad\3\2\2\2\u04e3\u04e5\7e\2\2\u04e4"+
		"\u04e6\7D\2\2\u04e5\u04e4\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04e8\3\2"+
		"\2\2\u04e7\u04e9\5\u00b0Y\2\u04e8\u04e7\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9"+
		"\u04eb\3\2\2\2\u04ea\u04ec\5\u00b2Z\2\u04eb\u04ea\3\2\2\2\u04eb\u04ec"+
		"\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed\u04ee\7y\2\2\u04ee\u04ef\bX\1\2\u04ef"+
		"\u00af\3\2\2\2\u04f0\u04f1\5\u00c2b\2\u04f1\u00b1\3\2\2\2\u04f2\u04f3"+
		"\7\6\2\2\u04f3\u04f8\5\u00b4[\2\u04f4\u04f5\7\17\2\2\u04f5\u04f7\5\u00b4"+
		"[\2\u04f6\u04f4\3\2\2\2\u04f7\u04fa\3\2\2\2\u04f8\u04f6\3\2\2\2\u04f8"+
		"\u04f9\3\2\2\2\u04f9\u00b3\3\2\2\2\u04fa\u04f8\3\2\2\2\u04fb\u04fd\7Z"+
		"\2\2\u04fc\u04fe\7D\2\2\u04fd\u04fc\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe"+
		"\u0500\3\2\2\2\u04ff\u04fb\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u0502\3\2"+
		"\2\2\u0501\u0503\5X-\2\u0502\u0501\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0504"+
		"\3\2\2\2\u0504\u0505\5\u00c2b\2\u0505\u00b5\3\2\2\2\u0506\u0508\7X\2\2"+
		"\u0507\u0509\7D\2\2\u0508\u0507\3\2\2\2\u0508\u0509\3\2\2\2\u0509\u053a"+
		"\3\2\2\2\u050a\u050c\5T+\2\u050b\u050d\7D\2\2\u050c\u050b\3\2\2\2\u050c"+
		"\u050d\3\2\2\2\u050d\u053a\3\2\2\2\u050e\u0510\7W\2\2\u050f\u0511\7D\2"+
		"\2\u0510\u050f\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u053a\3\2\2\2\u0512\u0514"+
		"\7U\2\2\u0513\u0515\7D\2\2\u0514\u0513\3\2\2\2\u0514\u0515\3\2\2\2\u0515"+
		"\u053a\3\2\2\2\u0516\u0518\7V\2\2\u0517\u0519\7D\2\2\u0518\u0517\3\2\2"+
		"\2\u0518\u0519\3\2\2\2\u0519\u053a\3\2\2\2\u051a\u051c\7`\2\2\u051b\u051d"+
		"\7D\2\2\u051c\u051b\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u053a\3\2\2\2\u051e"+
		"\u0520\7a\2\2\u051f\u0521\7D\2\2\u0520\u051f\3\2\2\2\u0520\u0521\3\2\2"+
		"\2\u0521\u053a\3\2\2\2\u0522\u0524\5V,\2\u0523\u0525\7D\2\2\u0524\u0523"+
		"\3\2\2\2\u0524\u0525\3\2\2\2\u0525\u053a\3\2\2\2\u0526\u053a\5\u00b8]"+
		"\2\u0527\u0528\7\32\2\2\u0528\u0529\5b\62\2\u0529\u052a\7\33\2\2\u052a"+
		"\u0535\3\2\2\2\u052b\u052c\7;\2\2\u052c\u0531\5\u00b8]\2\u052d\u052e\7"+
		"\32\2\2\u052e\u052f\5b\62\2\u052f\u0530\7\33\2\2\u0530\u0532\3\2\2\2\u0531"+
		"\u052d\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0534\3\2\2\2\u0533\u052b\3\2"+
		"\2\2\u0534\u0537\3\2\2\2\u0535\u0533\3\2\2\2\u0535\u0536\3\2\2\2\u0536"+
		"\u053a\3\2\2\2\u0537\u0535\3\2\2\2\u0538\u053a\5\64\33\2\u0539\u0506\3"+
		"\2\2\2\u0539\u050a\3\2\2\2\u0539\u050e\3\2\2\2\u0539\u0512\3\2\2\2\u0539"+
		"\u0516\3\2\2\2\u0539\u051a\3\2\2\2\u0539\u051e\3\2\2\2\u0539\u0522\3\2"+
		"\2\2\u0539\u0526\3\2\2\2\u0539\u0527\3\2\2\2\u0539\u0538\3\2\2\2\u053a"+
		"\u053b\3\2\2\2\u053b\u0539\3\2\2\2\u053b\u053c\3\2\2\2\u053c\u00b7\3\2"+
		"\2\2\u053d\u053f\7T\2\2\u053e\u0540\7D\2\2\u053f\u053e\3\2\2\2\u053f\u0540"+
		"\3\2\2\2\u0540\u055a\3\2\2\2\u0541\u0543\7\16\2\2\u0542\u0544\7D\2\2\u0543"+
		"\u0542\3\2\2\2\u0543\u0544\3\2\2\2\u0544\u055a\3\2\2\2\u0545\u0547\7<"+
		"\2\2\u0546\u0548\7D\2\2\u0547\u0546\3\2\2\2\u0547\u0548\3\2\2\2\u0548"+
		"\u055a\3\2\2\2\u0549\u054b\7=\2\2\u054a\u054c\7D\2\2\u054b\u054a\3\2\2"+
		"\2\u054b\u054c\3\2\2\2\u054c\u055a\3\2\2\2\u054d\u054f\7b\2\2\u054e\u0550"+
		"\7D\2\2\u054f\u054e\3\2\2\2\u054f\u0550\3\2\2\2\u0550\u055a\3\2\2\2\u0551"+
		"\u0553\7e\2\2\u0552\u0554\7D\2\2\u0553\u0552\3\2\2\2\u0553\u0554\3\2\2"+
		"\2\u0554\u055a\3\2\2\2\u0555\u0557\7x\2\2\u0556\u0558\7D\2\2\u0557\u0556"+
		"\3\2\2\2\u0557\u0558\3\2\2\2\u0558\u055a\3\2\2\2\u0559\u053d\3\2\2\2\u0559"+
		"\u0541\3\2\2\2\u0559\u0545\3\2\2\2\u0559\u0549\3\2\2\2\u0559\u054d\3\2"+
		"\2\2\u0559\u0551\3\2\2\2\u0559\u0555\3\2\2\2\u055a\u055b\3\2\2\2\u055b"+
		"\u0559\3\2\2\2\u055b\u055c\3\2\2\2\u055c\u00b9\3\2\2\2\u055d\u055f\5\u00c2"+
		"b\2\u055e\u0560\7D\2\2\u055f\u055e\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u00bb"+
		"\3\2\2\2\u0561\u0562\7\3\2\2\u0562\u0563\7T\2\2\u0563\u0574\7\4\2\2\u0564"+
		"\u0570\7\3\2\2\u0565\u056d\5\u00be`\2\u0566\u0568\7\17\2\2\u0567\u0569"+
		"\7D\2\2\u0568\u0567\3\2\2\2\u0568\u0569\3\2\2\2\u0569\u056a\3\2\2\2\u056a"+
		"\u056c\5\u00be`\2\u056b\u0566\3\2\2\2\u056c\u056f\3\2\2\2\u056d\u056b"+
		"\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u0571\3\2\2\2\u056f\u056d\3\2\2\2\u0570"+
		"\u0565\3\2\2\2\u0570\u0571\3\2\2\2\u0571\u0572\3\2\2\2\u0572\u0574\7\4"+
		"\2\2\u0573\u0561\3\2\2\2\u0573\u0564\3\2\2\2\u0574\u00bd\3\2\2\2\u0575"+
		"\u0577\5\u00b6\\\2\u0576\u0578\7D\2\2\u0577\u0576\3\2\2\2\u0577\u0578"+
		"\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u057a\5\u00c0a\2\u057a\u057d\3\2\2"+
		"\2\u057b\u057d\7F\2\2\u057c\u0575\3\2\2\2\u057c\u057b\3\2\2\2\u057d\u00bf"+
		"\3\2\2\2\u057e\u0580\5\u00c6d\2\u057f\u057e\3\2\2\2\u057f\u0580\3\2\2"+
		"\2\u0580\u0588\3\2\2\2\u0581\u0582\7\3\2\2\u0582\u0583\5\u00c0a\2\u0583"+
		"\u0584\7\4\2\2\u0584\u0589\3\2\2\2\u0585\u0587\5\u00ba^\2\u0586\u0585"+
		"\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u0589\3\2\2\2\u0588\u0581\3\2\2\2\u0588"+
		"\u0586\3\2\2\2\u0589\u058b\3\2\2\2\u058a\u058c\5\u0110\u0089\2\u058b\u058a"+
		"\3\2\2\2\u058b\u058c\3\2\2\2\u058c\u00c1\3\2\2\2\u058d\u0592\7x\2\2\u058e"+
		"\u058f\7;\2\2\u058f\u0591\7x\2\2\u0590\u058e\3\2\2\2\u0591\u0594\3\2\2"+
		"\2\u0592\u0590\3\2\2\2\u0592\u0593\3\2\2\2\u0593\u0599\3\2\2\2\u0594\u0592"+
		"\3\2\2\2\u0595\u0599\7f\2\2\u0596\u0599\7t\2\2\u0597\u0599\5X-\2\u0598"+
		"\u058d\3\2\2\2\u0598\u0595\3\2\2\2\u0598\u0596\3\2\2\2\u0598\u0597\3\2"+
		"\2\2\u0599\u00c3\3\2\2\2\u059a\u059b\t\24\2\2\u059b\u00c5\3\2\2\2\u059c"+
		"\u059e\5V,\2\u059d\u059f\7>\2\2\u059e\u059d\3\2\2\2\u059e\u059f\3\2\2"+
		"\2\u059f\u05a1\3\2\2\2\u05a0\u059c\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05a0"+
		"\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u00c7\3\2\2\2\u05a4\u05a5\5\u00c6d"+
		"\2\u05a5\u00c9\3\2\2\2\u05a6\u05ab\5\u00ccg\2\u05a7\u05a8\7E\2\2\u05a8"+
		"\u05aa\7D\2\2\u05a9\u05a7\3\2\2\2\u05aa\u05ad\3\2\2\2\u05ab\u05a9\3\2"+
		"\2\2\u05ab\u05ac\3\2\2\2\u05ac\u05c2\3\2\2\2\u05ad\u05ab\3\2\2\2\u05ae"+
		"\u05b0\7D\2\2\u05af\u05ae\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0\u05b2\3\2"+
		"\2\2\u05b1\u05b3\7\177\2\2\u05b2\u05b1\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3"+
		"\u05b5\3\2\2\2\u05b4\u05b6\7D\2\2\u05b5\u05b4\3\2\2\2\u05b5\u05b6\3\2"+
		"\2\2\u05b6\u05b7\3\2\2\2\u05b7\u05b9\7\17\2\2\u05b8\u05ba\7D\2\2\u05b9"+
		"\u05b8\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u05bc\3\2\2\2\u05bb\u05bd\7\177"+
		"\2\2\u05bc\u05bb\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05bf\3\2\2\2\u05be"+
		"\u05c0\7D\2\2\u05bf\u05be\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0\u05c1\3\2"+
		"\2\2\u05c1\u05c3\5\u00caf\2\u05c2\u05af\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3"+
		"\u05c8\3\2\2\2\u05c4\u05c5\7E\2\2\u05c5\u05c7\7D\2\2\u05c6\u05c4\3\2\2"+
		"\2\u05c7\u05ca\3\2\2\2\u05c8\u05c6\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u00cb"+
		"\3\2\2\2\u05ca\u05c8\3\2\2\2\u05cb\u05e1\5\u00ceh\2\u05cc\u05ce\7D\2\2"+
		"\u05cd\u05cc\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05d0\3\2\2\2\u05cf\u05d1"+
		"\7\177\2\2\u05d0\u05cf\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u05d3\3\2\2\2"+
		"\u05d2\u05d4\7D\2\2\u05d3\u05d2\3\2\2\2\u05d3\u05d4\3\2\2\2\u05d4\u05d5"+
		"\3\2\2\2\u05d5\u05d7\5\\/\2\u05d6\u05d8\7D\2\2\u05d7\u05d6\3\2\2\2\u05d7"+
		"\u05d8\3\2\2\2\u05d8\u05da\3\2\2\2\u05d9\u05db\7\177\2\2\u05da\u05d9\3"+
		"\2\2\2\u05da\u05db\3\2\2\2\u05db\u05dd\3\2\2\2\u05dc\u05de\7D\2\2\u05dd"+
		"\u05dc\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u05df\3\2\2\2\u05df\u05e0\5\u00cc"+
		"g\2\u05e0\u05e2\3\2\2\2\u05e1\u05cd\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2"+
		"\u00cd\3\2\2\2\u05e3\u060f\5\u00d0i\2\u05e4\u05e6\5\u00d0i\2\u05e5\u05e7"+
		"\7D\2\2\u05e6\u05e5\3\2\2\2\u05e6\u05e7\3\2\2\2\u05e7\u05e9\3\2\2\2\u05e8"+
		"\u05ea\7\177\2\2\u05e9\u05e8\3\2\2\2\u05e9\u05ea\3\2\2\2\u05ea\u05ec\3"+
		"\2\2\2\u05eb\u05ed\7D\2\2\u05ec\u05eb\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed"+
		"\u05ee\3\2\2\2\u05ee\u05f0\7?\2\2\u05ef\u05f1\7D\2\2\u05f0\u05ef\3\2\2"+
		"\2\u05f0\u05f1\3\2\2\2\u05f1\u05f3\3\2\2\2\u05f2\u05f4\7\177\2\2\u05f3"+
		"\u05f2\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4\u05f6\3\2\2\2\u05f5\u05f7\7D"+
		"\2\2\u05f6\u05f5\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8"+
		"\u05fa\5\u00caf\2\u05f9\u05fb\7D\2\2\u05fa\u05f9\3\2\2\2\u05fa\u05fb\3"+
		"\2\2\2\u05fb\u05fd\3\2\2\2\u05fc\u05fe\7\177\2\2\u05fd\u05fc\3\2\2\2\u05fd"+
		"\u05fe\3\2\2\2\u05fe\u0600\3\2\2\2\u05ff\u0601\7D\2\2\u0600\u05ff\3\2"+
		"\2\2\u0600\u0601\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u0604\7\6\2\2\u0603"+
		"\u0605\7D\2\2\u0604\u0603\3\2\2\2\u0604\u0605\3\2\2\2\u0605\u0607\3\2"+
		"\2\2\u0606\u0608\7\177\2\2\u0607\u0606\3\2\2\2\u0607\u0608\3\2\2\2\u0608"+
		"\u060a\3\2\2\2\u0609\u060b\7D\2\2\u060a\u0609\3\2\2\2\u060a\u060b\3\2"+
		"\2\2\u060b\u060c\3\2\2\2\u060c\u060d\5\u00ceh\2\u060d\u060f\3\2\2\2\u060e"+
		"\u05e3\3\2\2\2\u060e\u05e4\3\2\2\2\u060f\u00cf\3\2\2\2\u0610\u0625\5\u00d2"+
		"j\2\u0611\u0613\7D\2\2\u0612\u0611\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u0615"+
		"\3\2\2\2\u0614\u0616\7\177\2\2\u0615\u0614\3\2\2\2\u0615\u0616\3\2\2\2"+
		"\u0616\u0618\3\2\2\2\u0617\u0619\7D\2\2\u0618\u0617\3\2\2\2\u0618\u0619"+
		"\3\2\2\2\u0619\u061a\3\2\2\2\u061a\u061c\7\65\2\2\u061b\u061d\7D\2\2\u061c"+
		"\u061b\3\2\2\2\u061c\u061d\3\2\2\2\u061d\u061f\3\2\2\2\u061e\u0620\7\177"+
		"\2\2\u061f\u061e\3\2\2\2\u061f\u0620\3\2\2\2\u0620\u0622\3\2\2\2\u0621"+
		"\u0623\7D\2\2\u0622\u0621\3\2\2\2\u0622\u0623\3\2\2\2\u0623\u0624\3\2"+
		"\2\2\u0624\u0626\5\u00d0i\2\u0625\u0612\3\2\2\2\u0625\u0626\3\2\2\2\u0626"+
		"\u00d1\3\2\2\2\u0627\u063c\5\u00d4k\2\u0628\u062a\7D\2\2\u0629\u0628\3"+
		"\2\2\2\u0629\u062a\3\2\2\2\u062a\u062c\3\2\2\2\u062b\u062d\7\177\2\2\u062c"+
		"\u062b\3\2\2\2\u062c\u062d\3\2\2\2\u062d\u062f\3\2\2\2\u062e\u0630\7D"+
		"\2\2\u062f\u062e\3\2\2\2\u062f\u0630\3\2\2\2\u0630\u0631\3\2\2\2\u0631"+
		"\u0633\7\64\2\2\u0632\u0634\7D\2\2\u0633\u0632\3\2\2\2\u0633\u0634\3\2"+
		"\2\2\u0634\u0636\3\2\2\2\u0635\u0637\7\177\2\2\u0636\u0635\3\2\2\2\u0636"+
		"\u0637\3\2\2\2\u0637\u0639\3\2\2\2\u0638\u063a\7D\2\2\u0639\u0638\3\2"+
		"\2\2\u0639\u063a\3\2\2\2\u063a\u063b\3\2\2\2\u063b\u063d\5\u00d2j\2\u063c"+
		"\u0629\3\2\2\2\u063c\u063d\3\2\2\2\u063d\u00d3\3\2\2\2\u063e\u0653\5\u00d6"+
		"l\2\u063f\u0641\7D\2\2\u0640\u063f\3\2\2\2\u0640\u0641\3\2\2\2\u0641\u0643"+
		"\3\2\2\2\u0642\u0644\7\177\2\2\u0643\u0642\3\2\2\2\u0643\u0644\3\2\2\2"+
		"\u0644\u0646\3\2\2\2\u0645\u0647\7D\2\2\u0646\u0645\3\2\2\2\u0646\u0647"+
		"\3\2\2\2\u0647\u0648\3\2\2\2\u0648\u064a\7$\2\2\u0649\u064b\7D\2\2\u064a"+
		"\u0649\3\2\2\2\u064a\u064b\3\2\2\2\u064b\u064d\3\2\2\2\u064c\u064e\7\177"+
		"\2\2\u064d\u064c\3\2\2\2\u064d\u064e\3\2\2\2\u064e\u0650\3\2\2\2\u064f"+
		"\u0651\7D\2\2\u0650\u064f\3\2\2\2\u0650\u0651\3\2\2\2\u0651\u0652\3\2"+
		"\2\2\u0652\u0654\5\u00d4k\2\u0653\u0640\3\2\2\2\u0653\u0654\3\2\2\2\u0654"+
		"\u00d5\3\2\2\2\u0655\u066a\5\u00d8m\2\u0656\u0658\7D\2\2\u0657\u0656\3"+
		"\2\2\2\u0657\u0658\3\2\2\2\u0658\u065a\3\2\2\2\u0659\u065b\7\177\2\2\u065a"+
		"\u0659\3\2\2\2\u065a\u065b\3\2\2\2\u065b\u065d\3\2\2\2\u065c\u065e\7D"+
		"\2\2\u065d\u065c\3\2\2\2\u065d\u065e\3\2\2\2\u065e\u065f\3\2\2\2\u065f"+
		"\u0661\7#\2\2\u0660\u0662\7D\2\2\u0661\u0660\3\2\2\2\u0661\u0662\3\2\2"+
		"\2\u0662\u0664\3\2\2\2\u0663\u0665\7\177\2\2\u0664\u0663\3\2\2\2\u0664"+
		"\u0665\3\2\2\2\u0665\u0667\3\2\2\2\u0666\u0668\7D\2\2\u0667\u0666\3\2"+
		"\2\2\u0667\u0668\3\2\2\2\u0668\u0669\3\2\2\2\u0669\u066b\5\u00d6l\2\u066a"+
		"\u0657\3\2\2\2\u066a\u066b\3\2\2\2\u066b\u00d7\3\2\2\2\u066c\u0681\5\u00da"+
		"n\2\u066d\u066f\7D\2\2\u066e\u066d\3\2\2\2\u066e\u066f\3\2\2\2\u066f\u0671"+
		"\3\2\2\2\u0670\u0672\7\177\2\2\u0671\u0670\3\2\2\2\u0671\u0672\3\2\2\2"+
		"\u0672\u0674\3\2\2\2\u0673\u0675\7D\2\2\u0674\u0673\3\2\2\2\u0674\u0675"+
		"\3\2\2\2\u0675\u0676\3\2\2\2\u0676\u0678\7\24\2\2\u0677\u0679\7D\2\2\u0678"+
		"\u0677\3\2\2\2\u0678\u0679\3\2\2\2\u0679\u067b\3\2\2\2\u067a\u067c\7\177"+
		"\2\2\u067b\u067a\3\2\2\2\u067b\u067c\3\2\2\2\u067c\u067e\3\2\2\2\u067d"+
		"\u067f\7D\2\2\u067e\u067d\3\2\2\2\u067e\u067f\3\2\2\2\u067f\u0680\3\2"+
		"\2\2\u0680\u0682\5\u00d8m\2\u0681\u066e\3\2\2\2\u0681\u0682\3\2\2\2\u0682"+
		"\u00d9\3\2\2\2\u0683\u0699\5\u00dco\2\u0684\u0686\7D\2\2\u0685\u0684\3"+
		"\2\2\2\u0685\u0686\3\2\2\2\u0686\u0688\3\2\2\2\u0687\u0689\7\177\2\2\u0688"+
		"\u0687\3\2\2\2\u0688\u0689\3\2\2\2\u0689\u068b\3\2\2\2\u068a\u068c\7D"+
		"\2\2\u068b\u068a\3\2\2\2\u068b\u068c\3\2\2\2\u068c\u068d\3\2\2\2\u068d"+
		"\u068f\5^\60\2\u068e\u0690\7D\2\2\u068f\u068e\3\2\2\2\u068f\u0690\3\2"+
		"\2\2\u0690\u0692\3\2\2\2\u0691\u0693\7\177\2\2\u0692\u0691\3\2\2\2\u0692"+
		"\u0693\3\2\2\2\u0693\u0695\3\2\2\2\u0694\u0696\7D\2\2\u0695\u0694\3\2"+
		"\2\2\u0695\u0696\3\2\2\2\u0696\u0697\3\2\2\2\u0697\u0698\5\u00dan\2\u0698"+
		"\u069a\3\2\2\2\u0699\u0685\3\2\2\2\u0699\u069a\3\2\2\2\u069a\u00db\3\2"+
		"\2\2\u069b\u06b1\5\u00dep\2\u069c\u069e\7D\2\2\u069d\u069c\3\2\2\2\u069d"+
		"\u069e\3\2\2\2\u069e\u06a0\3\2\2\2\u069f\u06a1\7\177\2\2\u06a0\u069f\3"+
		"\2\2\2\u06a0\u06a1\3\2\2\2\u06a1\u06a3\3\2\2\2\u06a2\u06a4\7D\2\2\u06a3"+
		"\u06a2\3\2\2\2\u06a3\u06a4\3\2\2\2\u06a4\u06a5\3\2\2\2\u06a5\u06a7\5P"+
		")\2\u06a6\u06a8\7D\2\2\u06a7\u06a6\3\2\2\2\u06a7\u06a8\3\2\2\2\u06a8\u06aa"+
		"\3\2\2\2\u06a9\u06ab\7\177\2\2\u06aa\u06a9\3\2\2\2\u06aa\u06ab\3\2\2\2"+
		"\u06ab\u06ad\3\2\2\2\u06ac\u06ae\7D\2\2\u06ad\u06ac\3\2\2\2\u06ad\u06ae"+
		"\3\2\2\2\u06ae\u06af\3\2\2\2\u06af\u06b0\5\u00dco\2\u06b0\u06b2\3\2\2"+
		"\2\u06b1\u069d\3\2\2\2\u06b1\u06b2\3\2\2\2\u06b2\u00dd\3\2\2\2\u06b3\u06c8"+
		"\5\u00e0q\2\u06b4\u06b6\7D\2\2\u06b5\u06b4\3\2\2\2\u06b5\u06b6\3\2\2\2"+
		"\u06b6\u06b8\3\2\2\2\u06b7\u06b9\7\177\2\2\u06b8\u06b7\3\2\2\2\u06b8\u06b9"+
		"\3\2\2\2\u06b9\u06bb\3\2\2\2\u06ba\u06bc\7D\2\2\u06bb\u06ba\3\2\2\2\u06bb"+
		"\u06bc\3\2\2\2\u06bc\u06bd\3\2\2\2\u06bd\u06bf\t\25\2\2\u06be\u06c0\7"+
		"D\2\2\u06bf\u06be\3\2\2\2\u06bf\u06c0\3\2\2\2\u06c0\u06c2\3\2\2\2\u06c1"+
		"\u06c3\7\177\2\2\u06c2\u06c1\3\2\2\2\u06c2\u06c3\3\2\2\2\u06c3\u06c5\3"+
		"\2\2\2\u06c4\u06c6\7D\2\2\u06c5\u06c4\3\2\2\2\u06c5\u06c6\3\2\2\2\u06c6"+
		"\u06c7\3\2\2\2\u06c7\u06c9\5\u00dep\2\u06c8\u06b5\3\2\2\2\u06c8\u06c9"+
		"\3\2\2\2\u06c9\u00df\3\2\2\2\u06ca\u06df\5\u00e2r\2\u06cb\u06cd\7D\2\2"+
		"\u06cc\u06cb\3\2\2\2\u06cc\u06cd\3\2\2\2\u06cd\u06cf\3\2\2\2\u06ce\u06d0"+
		"\7\177\2\2\u06cf\u06ce\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0\u06d2\3\2\2\2"+
		"\u06d1\u06d3\7D\2\2\u06d2\u06d1\3\2\2\2\u06d2\u06d3\3\2\2\2\u06d3\u06d4"+
		"\3\2\2\2\u06d4\u06d6\t\26\2\2\u06d5\u06d7\7D\2\2\u06d6\u06d5\3\2\2\2\u06d6"+
		"\u06d7\3\2\2\2\u06d7\u06d9\3\2\2\2\u06d8\u06da\7\177\2\2\u06d9\u06d8\3"+
		"\2\2\2\u06d9\u06da\3\2\2\2\u06da\u06dc\3\2\2\2\u06db\u06dd\7D\2\2\u06dc"+
		"\u06db\3\2\2\2\u06dc\u06dd\3\2\2\2\u06dd\u06de\3\2\2\2\u06de\u06e0\5\u00e0"+
		"q\2\u06df\u06cc\3\2\2\2\u06df\u06e0\3\2\2\2\u06e0\u00e1\3\2\2\2\u06e1"+
		"\u06f6\5\u00e4s\2\u06e2\u06e4\7D\2\2\u06e3\u06e2\3\2\2\2\u06e3\u06e4\3"+
		"\2\2\2\u06e4\u06e6\3\2\2\2\u06e5\u06e7\7\177\2\2\u06e6\u06e5\3\2\2\2\u06e6"+
		"\u06e7\3\2\2\2\u06e7\u06e9\3\2\2\2\u06e8\u06ea\7D\2\2\u06e9\u06e8\3\2"+
		"\2\2\u06e9\u06ea\3\2\2\2\u06ea\u06eb\3\2\2\2\u06eb\u06ed\t\27\2\2\u06ec"+
		"\u06ee\7D\2\2\u06ed\u06ec\3\2\2\2\u06ed\u06ee\3\2\2\2\u06ee\u06f0\3\2"+
		"\2\2\u06ef\u06f1\7\177\2\2\u06f0\u06ef\3\2\2\2\u06f0\u06f1\3\2\2\2\u06f1"+
		"\u06f3\3\2\2\2\u06f2\u06f4\7D\2\2\u06f3\u06f2\3\2\2\2\u06f3\u06f4\3\2"+
		"\2\2\u06f4\u06f5\3\2\2\2\u06f5\u06f7\5\u00e2r\2\u06f6\u06e3\3\2\2\2\u06f6"+
		"\u06f7\3\2\2\2\u06f7\u00e3\3\2\2\2\u06f8\u06f9\7\3\2\2\u06f9\u06fb\5V"+
		",\2\u06fa\u06fc\5\u00c2b\2\u06fb\u06fa\3\2\2\2\u06fb\u06fc\3\2\2\2\u06fc"+
		"\u06fd\3\2\2\2\u06fd\u06fe\7\4\2\2\u06fe\u06ff\7\3\2\2\u06ff\u0700\5\u0104"+
		"\u0083\2\u0700\u0701\7\4\2\2\u0701\u0704\3\2\2\2\u0702\u0704\5\u00e6t"+
		"\2\u0703\u06f8\3\2\2\2\u0703\u0702\3\2\2\2\u0704\u00e5\3\2\2\2\u0705\u0706"+
		"\7\3\2\2\u0706\u0707\5\u00e8u\2\u0707\u0708\7\4\2\2\u0708\u0709\5\u00e6"+
		"t\2\u0709\u070c\3\2\2\2\u070a\u070c\5\u00eav\2\u070b\u0705\3\2\2\2\u070b"+
		"\u070a\3\2\2\2\u070c\u00e7\3\2\2\2\u070d\u0712\5\u00b6\\\2\u070e\u070f"+
		"\5\u00b6\\\2\u070f\u0710\5\u00e4s\2\u0710\u0712\3\2\2\2\u0711\u070d\3"+
		"\2\2\2\u0711\u070e\3\2\2\2\u0712\u00e9\3\2\2\2\u0713\u071c\5\u00ecw\2"+
		"\u0714\u071c\5\u00f0y\2\u0715\u071c\5\u00f2z\2\u0716\u071c\5\u00eex\2"+
		"\u0717\u071c\5\u0100\u0081\2\u0718\u071c\5\u00f6|\2\u0719\u071c\5\64\33"+
		"\2\u071a\u071c\5\u00fe\u0080\2\u071b\u0713\3\2\2\2\u071b\u0714\3\2\2\2"+
		"\u071b\u0715\3\2\2\2\u071b\u0716\3\2\2\2\u071b\u0717\3\2\2\2\u071b\u0718"+
		"\3\2\2\2\u071b\u0719\3\2\2\2\u071b\u071a\3\2\2\2\u071c\u00eb\3\2\2\2\u071d"+
		"\u071e\7\24\2\2\u071e\u071f\5\u00c2b\2\u071f\u00ed\3\2\2\2\u0720\u0722"+
		"\7;\2\2\u0721\u0720\3\2\2\2\u0721\u0722\3\2\2\2\u0722\u0723\3\2\2\2\u0723"+
		"\u0725\7f\2\2\u0724\u0726\7D\2\2\u0725\u0724\3\2\2\2\u0725\u0726\3\2\2"+
		"\2\u0726\u0728\3\2\2\2\u0727\u0729\7\177\2\2\u0728\u0727\3\2\2\2\u0728"+
		"\u0729\3\2\2\2\u0729\u072b\3\2\2\2\u072a\u072c\7D\2\2\u072b\u072a\3\2"+
		"\2\2\u072b\u072c\3\2\2\2\u072c\u072d\3\2\2\2\u072d\u072f\5\u00b6\\\2\u072e"+
		"\u0730\7D\2\2\u072f\u072e\3\2\2\2\u072f\u0730\3\2\2\2\u0730\u0732\3\2"+
		"\2\2\u0731\u0733\7\177\2\2\u0732\u0731\3\2\2\2\u0732\u0733\3\2\2\2\u0733"+
		"\u0735\3\2\2\2\u0734\u0736\7D\2\2\u0735\u0734\3\2\2\2\u0735\u0736\3\2"+
		"\2\2\u0736\u0737\3\2\2\2\u0737\u0739\7\37\2\2\u0738\u073a\5\u00ceh\2\u0739"+
		"\u0738\3\2\2\2\u0739\u073a\3\2\2\2\u073a\u073b\3\2\2\2\u073b\u073c\7 "+
		"\2\2\u073c\u075b\3\2\2\2\u073d\u073f\7;\2\2\u073e\u073d\3\2\2\2\u073e"+
		"\u073f\3\2\2\2\u073f\u0740\3\2\2\2\u0740\u0742\7f\2\2\u0741\u0743\7D\2"+
		"\2\u0742\u0741\3\2\2\2\u0742\u0743\3\2\2\2\u0743\u0745\3\2\2\2\u0744\u0746"+
		"\7\177\2\2\u0745\u0744\3\2\2\2\u0745\u0746\3\2\2\2\u0746\u0748\3\2\2\2"+
		"\u0747\u0749\7D\2\2\u0748\u0747\3\2\2\2\u0748\u0749\3\2\2\2\u0749\u074a"+
		"\3\2\2\2\u074a\u074c\5\u00b6\\\2\u074b\u074d\7D\2\2\u074c\u074b\3\2\2"+
		"\2\u074c\u074d\3\2\2\2\u074d\u074f\3\2\2\2\u074e\u0750\7\177\2\2\u074f"+
		"\u074e\3\2\2\2\u074f\u0750\3\2\2\2\u0750\u0752\3\2\2\2\u0751\u0753\7D"+
		"\2\2\u0752\u0751\3\2\2\2\u0752\u0753\3\2\2\2\u0753\u0754\3\2\2\2\u0754"+
		"\u0756\7\3\2\2\u0755\u0757\5\u00caf\2\u0756\u0755\3\2\2\2\u0756\u0757"+
		"\3\2\2\2\u0757\u0758\3\2\2\2\u0758\u0759\7\4\2\2\u0759\u075b\3\2\2\2\u075a"+
		"\u0721\3\2\2\2\u075a\u073e\3\2\2\2\u075b\u00ef\3\2\2\2\u075c\u075e\5N"+
		"(\2\u075d\u075f\7D\2\2\u075e\u075d\3\2\2\2\u075e\u075f\3\2\2\2\u075f\u0761"+
		"\3\2\2\2\u0760\u0762\7\177\2\2\u0761\u0760\3\2\2\2\u0761\u0762\3\2\2\2"+
		"\u0762\u0764\3\2\2\2\u0763\u0765\7D\2\2\u0764\u0763\3\2\2\2\u0764\u0765"+
		"\3\2\2\2\u0765\u0766\3\2\2\2\u0766\u0767\5\u00e6t\2\u0767\u00f1\3\2\2"+
		"\2\u0768\u076a\5\u00f4{\2\u0769\u076b\7D\2\2\u076a\u0769\3\2\2\2\u076a"+
		"\u076b\3\2\2\2\u076b\u076d\3\2\2\2\u076c\u076e\7\177\2\2\u076d\u076c\3"+
		"\2\2\2\u076d\u076e\3\2\2\2\u076e\u0770\3\2\2\2\u076f\u0771\7D\2\2\u0770"+
		"\u076f\3\2\2\2\u0770\u0771\3\2\2\2\u0771\u0772\3\2\2\2\u0772\u0773\7\3"+
		"\2\2\u0773\u0774\5\u00f8}\2\u0774\u0775\7\4\2\2\u0775\u0783\3\2\2\2\u0776"+
		"\u0778\5\u00f4{\2\u0777\u0779\7D\2\2\u0778\u0777\3\2\2\2\u0778\u0779\3"+
		"\2\2\2\u0779\u077b\3\2\2\2\u077a\u077c\7\177\2\2\u077b\u077a\3\2\2\2\u077b"+
		"\u077c\3\2\2\2\u077c\u077e\3\2\2\2\u077d\u077f\7D\2\2\u077e\u077d\3\2"+
		"\2\2\u077e\u077f\3\2\2\2\u077f\u0780\3\2\2\2\u0780\u0781\5\u00fa~\2\u0781"+
		"\u0783\3\2\2\2\u0782\u0768\3\2\2\2\u0782\u0776\3\2\2\2\u0783\u00f3\3\2"+
		"\2\2\u0784\u0785\7@\2\2\u0785\u00f5\3\2\2\2\u0786\u0788\7A\2\2\u0787\u0789"+
		"\7D\2\2\u0788\u0787\3\2\2\2\u0788\u0789\3\2\2\2\u0789\u078b\3\2\2\2\u078a"+
		"\u078c\7\177\2\2\u078b\u078a\3\2\2\2\u078b\u078c\3\2\2\2\u078c\u078e\3"+
		"\2\2\2\u078d\u078f\7D\2\2\u078e\u078d\3\2\2\2\u078e\u078f\3\2\2\2\u078f"+
		"\u0790\3\2\2\2\u0790\u0791\7\3\2\2\u0791\u0792\5\u00caf\2\u0792\u0793"+
		"\7\4\2\2\u0793\u07a0\3\2\2\2\u0794\u0796\7A\2\2\u0795\u0797\7D\2\2\u0796"+
		"\u0795\3\2\2\2\u0796\u0797\3\2\2\2\u0797\u0799\3\2\2\2\u0798\u079a\7\177"+
		"\2\2\u0799\u0798\3\2\2\2\u0799\u079a\3\2\2\2\u079a\u079c\3\2\2\2\u079b"+
		"\u079d\7D\2\2\u079c\u079b\3\2\2\2\u079c\u079d\3\2\2\2\u079d\u079e\3\2"+
		"\2\2\u079e\u07a0\5\u00caf\2\u079f\u0786\3\2\2\2\u079f\u0794\3\2\2\2\u07a0"+
		"\u00f7\3\2\2\2\u07a1\u07ae\5\u00b6\\\2\u07a2\u07a4\7D\2\2\u07a3\u07a2"+
		"\3\2\2\2\u07a3\u07a4\3\2\2\2\u07a4\u07a6\3\2\2\2\u07a5\u07a7\7\177\2\2"+
		"\u07a6\u07a5\3\2\2\2\u07a6\u07a7\3\2\2\2\u07a7\u07a9\3\2\2\2\u07a8\u07aa"+
		"\7D\2\2\u07a9\u07a8\3\2\2\2\u07a9\u07aa\3\2\2\2\u07aa\u07ab\3\2\2\2\u07ab"+
		"\u07ad\5V,\2\u07ac\u07a3\3\2\2\2\u07ad\u07b0\3\2\2\2\u07ae\u07ac\3\2\2"+
		"\2\u07ae\u07af\3\2\2\2\u07af\u00f9\3\2\2\2\u07b0\u07ae\3\2\2\2\u07b1\u07b2"+
		"\5\u00eav\2\u07b2\u00fb\3\2\2\2\u07b3\u07b4\t\30\2\2\u07b4\u00fd\3\2\2"+
		"\2\u07b5\u07b9\7Y\2\2\u07b6\u07b8\t\31\2\2\u07b7\u07b6\3\2\2\2\u07b8\u07bb"+
		"\3\2\2\2\u07b9\u07b7\3\2\2\2\u07b9\u07ba\3\2\2\2\u07ba\u07bd\3\2\2\2\u07bb"+
		"\u07b9\3\2\2\2\u07bc\u07be\7D\2\2\u07bd\u07bc\3\2\2\2\u07bd\u07be\3\2"+
		"\2\2\u07be\u07bf\3\2\2\2\u07bf\u07c1\7\3\2\2\u07c0\u07c2\7D\2\2\u07c1"+
		"\u07c0\3\2\2\2\u07c1\u07c2\3\2\2\2\u07c2\u07c7\3\2\2\2\u07c3\u07c5\7\u0081"+
		"\2\2\u07c4\u07c6\7D\2\2\u07c5\u07c4\3\2\2\2\u07c5\u07c6\3\2\2\2\u07c6"+
		"\u07c8\3\2\2\2\u07c7\u07c3\3\2\2\2\u07c8\u07c9\3\2\2\2\u07c9\u07c7\3\2"+
		"\2\2\u07c9\u07ca\3\2\2\2\u07ca\u07e1\3\2\2\2\u07cb\u07dd\t\32\2\2\u07cc"+
		"\u07ce\7\u0081\2\2\u07cd\u07cf\7D\2\2\u07ce\u07cd\3\2\2\2\u07ce\u07cf"+
		"\3\2\2\2\u07cf\u07db\3\2\2\2\u07d0\u07d1\7\3\2\2\u07d1\u07d6\5\u00c2b"+
		"\2\u07d2\u07d3\7\17\2\2\u07d3\u07d5\5\u00c2b\2\u07d4\u07d2\3\2\2\2\u07d5"+
		"\u07d8\3\2\2\2\u07d6\u07d4\3\2\2\2\u07d6\u07d7\3\2\2\2\u07d7\u07d9\3\2"+
		"\2\2\u07d8\u07d6\3\2\2\2\u07d9\u07da\7\4\2\2\u07da\u07dc\3\2\2\2\u07db"+
		"\u07d0\3\2\2\2\u07db\u07dc\3\2\2\2\u07dc\u07de\3\2\2\2\u07dd\u07cc\3\2"+
		"\2\2\u07dd\u07de\3\2\2\2\u07de\u07e0\3\2\2\2\u07df\u07cb\3\2\2\2\u07e0"+
		"\u07e3\3\2\2\2\u07e1\u07df\3\2\2\2\u07e1\u07e2\3\2\2\2\u07e2\u07e4\3\2"+
		"\2\2\u07e3\u07e1\3\2\2\2\u07e4\u07e5\7\4\2\2\u07e5\u00ff\3\2\2\2\u07e6"+
		"\u07e8\b\u0081\1\2\u07e7\u07e9\5\u00b6\\\2\u07e8\u07e7\3\2\2\2\u07e8\u07e9"+
		"\3\2\2\2\u07e9\u07ea\3\2\2\2\u07ea\u07ff\5\u0102\u0082\2\u07eb\u07ff\5"+
		"\u0108\u0085\2\u07ec\u07ee\5V,\2\u07ed\u07ec\3\2\2\2\u07ed\u07ee\3\2\2"+
		"\2\u07ee\u07ef\3\2\2\2\u07ef\u07f1\5\u00fc\177\2\u07f0\u07f2\7D\2\2\u07f1"+
		"\u07f0\3\2\2\2\u07f1\u07f2\3\2\2\2\u07f2\u07f4\3\2\2\2\u07f3\u07f5\7\177"+
		"\2\2\u07f4\u07f3\3\2\2\2\u07f4\u07f5\3\2\2\2\u07f5\u07f7\3\2\2\2\u07f6"+
		"\u07f8\7D\2\2\u07f7\u07f6\3\2\2\2\u07f7\u07f8\3\2\2\2\u07f8\u07fa\3\2"+
		"\2\2\u07f9\u07fb\5V,\2\u07fa\u07f9\3\2\2\2\u07fa\u07fb\3\2\2\2\u07fb\u07fc"+
		"\3\2\2\2\u07fc\u07fd\5\u0108\u0085\2\u07fd\u07ff\3\2\2\2\u07fe\u07e6\3"+
		"\2\2\2\u07fe\u07eb\3\2\2\2\u07fe\u07ed\3\2\2\2\u07ff\u0848\3\2\2\2\u0800"+
		"\u0802\f\n\2\2\u0801\u0803\7D\2\2\u0802\u0801\3\2\2\2\u0802\u0803\3\2"+
		"\2\2\u0803\u0805\3\2\2\2\u0804\u0806\7\177\2\2\u0805\u0804\3\2\2\2\u0805"+
		"\u0806\3\2\2\2\u0806\u0808\3\2\2\2\u0807\u0809\7D\2\2\u0808\u0807\3\2"+
		"\2\2\u0808\u0809\3\2\2\2\u0809\u080a\3\2\2\2\u080a\u080c\7\37\2\2\u080b"+
		"\u080d\5\u00caf\2\u080c\u080b\3\2\2\2\u080c\u080d\3\2\2\2\u080d\u080e"+
		"\3\2\2\2\u080e\u0847\7 \2\2\u080f\u0811\f\t\2\2\u0810\u0812\7D\2\2\u0811"+
		"\u0810\3\2\2\2\u0811\u0812\3\2\2\2\u0812\u0814\3\2\2\2\u0813\u0815\7\177"+
		"\2\2\u0814\u0813\3\2\2\2\u0814\u0815\3\2\2\2\u0815\u0817\3\2\2\2\u0816"+
		"\u0818\7D\2\2\u0817\u0816\3\2\2\2\u0817\u0818\3\2\2\2\u0818\u0819\3\2"+
		"\2\2\u0819\u081a\7\3\2\2\u081a\u081b\5\u0104\u0083\2\u081b\u081c\7\4\2"+
		"\2\u081c\u0847\3\2\2\2\u081d\u081e\f\b\2\2\u081e\u0820\7C\2\2\u081f\u0821"+
		"\7D\2\2\u0820\u081f\3\2\2\2\u0820\u0821\3\2\2\2\u0821\u0823\3\2\2\2\u0822"+
		"\u0824\7\177\2\2\u0823\u0822\3\2\2\2\u0823\u0824\3\2\2\2\u0824\u0826\3"+
		"\2\2\2\u0825\u0827\7D\2\2\u0826\u0825\3\2\2\2\u0826\u0827\3\2\2\2\u0827"+
		"\u0829\3\2\2\2\u0828\u082a\7d\2\2\u0829\u0828\3\2\2\2\u0829\u082a\3\2"+
		"\2\2\u082a\u082b\3\2\2\2\u082b\u0847\5\u00c2b\2\u082c\u082d\f\7\2\2\u082d"+
		"\u082f\79\2\2\u082e\u0830\7D\2\2\u082f\u082e\3\2\2\2\u082f\u0830\3\2\2"+
		"\2\u0830\u0832\3\2\2\2\u0831\u0833\7\177\2\2\u0832\u0831\3\2\2\2\u0832"+
		"\u0833\3\2\2\2\u0833\u0835\3\2\2\2\u0834\u0836\7D\2\2\u0835\u0834\3\2"+
		"\2\2\u0835\u0836\3\2\2\2\u0836\u0838\3\2\2\2\u0837\u0839\7d\2\2\u0838"+
		"\u0837\3\2\2\2\u0838\u0839\3\2\2\2\u0839\u083a\3\2\2\2\u083a\u0847\5\u00c2"+
		"b\2\u083b\u083d\f\6\2\2\u083c\u083e\7D\2\2\u083d\u083c\3\2\2\2\u083d\u083e"+
		"\3\2\2\2\u083e\u0840\3\2\2\2\u083f\u0841\7\177\2\2\u0840\u083f\3\2\2\2"+
		"\u0840\u0841\3\2\2\2\u0841\u0843\3\2\2\2\u0842\u0844\7D\2\2\u0843\u0842"+
		"\3\2\2\2\u0843\u0844\3\2\2\2\u0844\u0845\3\2\2\2\u0845\u0847\5\u00fc\177"+
		"\2\u0846\u0800\3\2\2\2\u0846\u080f\3\2\2\2\u0846\u081d\3\2\2\2\u0846\u082c"+
		"\3\2\2\2\u0846\u083b\3\2\2\2\u0847\u084a\3\2\2\2\u0848\u0846\3\2\2\2\u0848"+
		"\u0849\3\2\2\2\u0849\u0101\3\2\2\2\u084a\u0848\3\2\2\2\u084b\u084d\7y"+
		"\2\2\u084c\u084e\7D\2\2\u084d\u084c\3\2\2\2\u084d\u084e\3\2\2\2\u084e"+
		"\u0855\3\2\2\2\u084f\u0851\7\177\2\2\u0850\u0852\7D\2\2\u0851\u0850\3"+
		"\2\2\2\u0851\u0852\3\2\2\2\u0852\u0854\3\2\2\2\u0853\u084f\3\2\2\2\u0854"+
		"\u0857\3\2\2\2\u0855\u0853\3\2\2\2\u0855\u0856\3\2\2\2\u0856\u0859\3\2"+
		"\2\2\u0857\u0855\3\2\2\2\u0858\u085a\5\u0104\u0083\2\u0859\u0858\3\2\2"+
		"\2\u0859\u085a\3\2\2\2\u085a\u085c\3\2\2\2\u085b\u085d\7D\2\2\u085c\u085b"+
		"\3\2\2\2\u085c\u085d\3\2\2\2\u085d\u0864\3\2\2\2\u085e\u0860\7\177\2\2"+
		"\u085f\u0861\7D\2\2\u0860\u085f\3\2\2\2\u0860\u0861\3\2\2\2\u0861\u0863"+
		"\3\2\2\2\u0862\u085e\3\2\2\2\u0863\u0866\3\2\2\2\u0864\u0862\3\2\2\2\u0864"+
		"\u0865\3\2\2\2\u0865\u0867\3\2\2\2\u0866\u0864\3\2\2\2\u0867\u0868\7z"+
		"\2\2\u0868\u0103\3\2\2\2\u0869\u086b\7D\2\2\u086a\u0869\3\2\2\2\u086a"+
		"\u086b\3\2\2\2\u086b\u086d\3\2\2\2\u086c\u086e\7\177\2\2\u086d\u086c\3"+
		"\2\2\2\u086d\u086e\3\2\2\2\u086e\u0870\3\2\2\2\u086f\u0871\7D\2\2\u0870"+
		"\u086f\3\2\2\2\u0870\u0871\3\2\2\2\u0871\u0872\3\2\2\2\u0872\u0874\5\u0106"+
		"\u0084\2\u0873\u086a\3\2\2\2\u0873\u0874\3\2\2\2\u0874\u0876\3\2\2\2\u0875"+
		"\u0877\7D\2\2\u0876\u0875\3\2\2\2\u0876\u0877\3\2\2\2\u0877\u0879\3\2"+
		"\2\2\u0878\u087a\7\177\2\2\u0879\u0878\3\2\2\2\u0879\u087a\3\2\2\2\u087a"+
		"\u087c\3\2\2\2\u087b\u087d\7D\2\2\u087c\u087b\3\2\2\2\u087c\u087d\3\2"+
		"\2\2\u087d\u0890\3\2\2\2\u087e\u0880\7\17\2\2\u087f\u087e\3\2\2\2\u087f"+
		"\u0880\3\2\2\2\u0880\u0882\3\2\2\2\u0881\u0883\7D\2\2\u0882\u0881\3\2"+
		"\2\2\u0882\u0883\3\2\2\2\u0883\u088a\3\2\2\2\u0884\u0886\7\177\2\2\u0885"+
		"\u0887\7D\2\2\u0886\u0885\3\2\2\2\u0886\u0887\3\2\2\2\u0887\u0889\3\2"+
		"\2\2\u0888\u0884\3\2\2\2\u0889\u088c\3\2\2\2\u088a\u0888\3\2\2\2\u088a"+
		"\u088b\3\2\2\2\u088b\u088d\3\2\2\2\u088c\u088a\3\2\2\2\u088d\u088f\5\u0106"+
		"\u0084\2\u088e\u087f\3\2\2\2\u088f\u0892\3\2\2\2\u0890\u088e\3\2\2\2\u0890"+
		"\u0891\3\2\2\2\u0891\u0894\3\2\2\2\u0892\u0890\3\2\2\2\u0893\u0895\7\17"+
		"\2\2\u0894\u0893\3\2\2\2\u0894\u0895\3\2\2\2\u0895\u089b\3\2\2\2\u0896"+
		"\u0898\7T\2\2\u0897\u0899\5V,\2\u0898\u0897\3\2\2\2\u0898\u0899\3\2\2"+
		"\2\u0899\u089b\3\2\2\2\u089a\u0873\3\2\2\2\u089a\u0896\3\2\2\2\u089b\u0105"+
		"\3\2\2\2\u089c\u089d\5\u00ccg\2\u089d\u0107\3\2\2\2\u089e\u08a0\7C\2\2"+
		"\u089f\u089e\3\2\2\2\u089f\u08a0\3\2\2\2\u08a0\u08a1\3\2\2\2\u08a1\u08a9"+
		"\5\u00c2b\2\u08a2\u08a9\5V,\2\u08a3\u08a9\5R*\2\u08a4\u08a5\7\3\2\2\u08a5"+
		"\u08a6\5\u00caf\2\u08a6\u08a7\7\4\2\2\u08a7\u08a9\3\2\2\2\u08a8\u089f"+
		"\3\2\2\2\u08a8\u08a2\3\2\2\2\u08a8\u08a3\3\2\2\2\u08a8\u08a4\3\2\2\2\u08a9"+
		"\u0109\3\2\2\2\u08aa\u08ab\7\5\2\2\u08ab\u010b\3\2\2\2\u08ac\u08ad\5\u010e"+
		"\u0088\2\u08ad\u08af\7\3\2\2\u08ae\u08b0\5\u00caf\2\u08af\u08ae\3\2\2"+
		"\2\u08af\u08b0\3\2\2\2\u08b0\u08b1\3\2\2\2\u08b1\u08b2\7\4\2\2\u08b2\u08bf"+
		"\3\2\2\2\u08b3\u08b5\5\u010e\u0088\2\u08b4\u08b6\7D\2\2\u08b5\u08b4\3"+
		"\2\2\2\u08b5\u08b6\3\2\2\2\u08b6\u08b7\3\2\2\2\u08b7\u08b9\7%\2\2\u08b8"+
		"\u08ba\7D\2\2\u08b9\u08b8\3\2\2\2\u08b9\u08ba\3\2\2\2\u08ba\u08bb\3\2"+
		"\2\2\u08bb\u08bc\5\u0106\u0084\2\u08bc\u08bf\3\2\2\2\u08bd\u08bf\5\u010e"+
		"\u0088\2\u08be\u08ac\3\2\2\2\u08be\u08b3\3\2\2\2\u08be\u08bd\3\2\2\2\u08bf"+
		"\u010d\3\2\2\2\u08c0\u08c2\5\u00c6d\2\u08c1\u08c0\3\2\2\2\u08c1\u08c2"+
		"\3\2\2\2\u08c2\u08c3\3\2\2\2\u08c3\u08c5\5\u00c2b\2\u08c4\u08c6\5\u0110"+
		"\u0089\2\u08c5\u08c4\3\2\2\2\u08c5\u08c6\3\2\2\2\u08c6\u010f\3\2\2\2\u08c7"+
		"\u08c9\7\37\2\2\u08c8\u08ca\5\u00ceh\2\u08c9\u08c8\3\2\2\2\u08c9\u08ca"+
		"\3\2\2\2\u08ca\u08cb\3\2\2\2\u08cb\u08ce\7 \2\2\u08cc\u08ce\5\u00bc_\2"+
		"\u08cd\u08c7\3\2\2\2\u08cd\u08cc\3\2\2\2\u08ce\u0111\3\2\2\2\u01af\u0115"+
		"\u0124\u0131\u0134\u013a\u013e\u0146\u014a\u0151\u0155\u0158\u015b\u015f"+
		"\u0162\u0165\u0169\u016f\u0173\u0177\u0179\u017f\u018b\u0190\u0193\u0196"+
		"\u019c\u01a4\u01aa\u01b0\u01c4\u01cf\u01d7\u01e1\u01ea\u01ec\u01f2\u01f7"+
		"\u01fb\u0200\u0206\u0209\u020d\u0211\u0215\u0219\u021c\u0223\u0227\u022d"+
		"\u0237\u023a\u0241\u024c\u0254\u025a\u0260\u0267\u026e\u0282\u0286\u028d"+
		"\u0293\u0298\u02a9\u02af\u02b5\u02ba\u02be\u02c9\u02f3\u0307\u0309\u0325"+
		"\u032c\u0331\u0335\u0338\u033b\u033f\u034b\u034e\u0352\u0354\u0358\u035c"+
		"\u035f\u0362\u0365\u036a\u036e\u0371\u0374\u0378\u037e\u0382\u0389\u038d"+
		"\u0392\u0394\u0398\u039b\u039e\u03a2\u03a6\u03aa\u03ae\u03b2\u03b7\u03bc"+
		"\u03c0\u03c4\u03ca\u03cf\u03d4\u03d7\u03da\u03de\u03e0\u03e5\u03ea\u03ef"+
		"\u03f2\u03f8\u03fb\u0402\u0405\u0410\u0417\u041d\u0428\u0432\u043b\u0440"+
		"\u0446\u044a\u044e\u0450\u0453\u045a\u045c\u0461\u0465\u046a\u046e\u0472"+
		"\u0475\u047b\u047d\u0481\u0483\u0487\u0489\u048d\u0490\u0493\u0495\u049a"+
		"\u049e\u04a1\u04a5\u04a7\u04aa\u04b0\u04b3\u04b7\u04ba\u04be\u04c5\u04c8"+
		"\u04cb\u04cf\u04d3\u04d8\u04dc\u04df\u04e5\u04e8\u04eb\u04f8\u04fd\u04ff"+
		"\u0502\u0508\u050c\u0510\u0514\u0518\u051c\u0520\u0524\u0531\u0535\u0539"+
		"\u053b\u053f\u0543\u0547\u054b\u054f\u0553\u0557\u0559\u055b\u055f\u0568"+
		"\u056d\u0570\u0573\u0577\u057c\u057f\u0586\u0588\u058b\u0592\u0598\u059e"+
		"\u05a2\u05ab\u05af\u05b2\u05b5\u05b9\u05bc\u05bf\u05c2\u05c8\u05cd\u05d0"+
		"\u05d3\u05d7\u05da\u05dd\u05e1\u05e6\u05e9\u05ec\u05f0\u05f3\u05f6\u05fa"+
		"\u05fd\u0600\u0604\u0607\u060a\u060e\u0612\u0615\u0618\u061c\u061f\u0622"+
		"\u0625\u0629\u062c\u062f\u0633\u0636\u0639\u063c\u0640\u0643\u0646\u064a"+
		"\u064d\u0650\u0653\u0657\u065a\u065d\u0661\u0664\u0667\u066a\u066e\u0671"+
		"\u0674\u0678\u067b\u067e\u0681\u0685\u0688\u068b\u068f\u0692\u0695\u0699"+
		"\u069d\u06a0\u06a3\u06a7\u06aa\u06ad\u06b1\u06b5\u06b8\u06bb\u06bf\u06c2"+
		"\u06c5\u06c8\u06cc\u06cf\u06d2\u06d6\u06d9\u06dc\u06df\u06e3\u06e6\u06e9"+
		"\u06ed\u06f0\u06f3\u06f6\u06fb\u0703\u070b\u0711\u071b\u0721\u0725\u0728"+
		"\u072b\u072f\u0732\u0735\u0739\u073e\u0742\u0745\u0748\u074c\u074f\u0752"+
		"\u0756\u075a\u075e\u0761\u0764\u076a\u076d\u0770\u0778\u077b\u077e\u0782"+
		"\u0788\u078b\u078e\u0796\u0799\u079c\u079f\u07a3\u07a6\u07a9\u07ae\u07b9"+
		"\u07bd\u07c1\u07c5\u07c9\u07ce\u07d6\u07db\u07dd\u07e1\u07e8\u07ed\u07f1"+
		"\u07f4\u07f7\u07fa\u07fe\u0802\u0805\u0808\u080c\u0811\u0814\u0817\u0820"+
		"\u0823\u0826\u0829\u082f\u0832\u0835\u0838\u083d\u0840\u0843\u0846\u0848"+
		"\u084d\u0851\u0855\u0859\u085c\u0860\u0864\u086a\u086d\u0870\u0873\u0876"+
		"\u0879\u087c\u087f\u0882\u0886\u088a\u0890\u0894\u0898\u089a\u089f\u08a8"+
		"\u08af\u08b5\u08b9\u08be\u08c1\u08c5\u08c9\u08cd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}