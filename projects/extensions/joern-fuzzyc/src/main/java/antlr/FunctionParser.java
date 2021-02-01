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
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, ESCAPED_NEWLINE=65, 
		NEWLINE=66, ESCAPE=67, ELLIPSIS=68, IF=69, ELSE=70, FOR=71, WHILE=72, 
		BREAK=73, CASE=74, CONTINUE=75, SWITCH=76, DO=77, GOTO=78, RETURN=79, 
		TYPEDEF=80, STATIC=81, VOID=82, UNSIGNED=83, SIGNED=84, CV_QUALIFIER=85, 
		EXTERN=86, ASM=87, VIRTUAL=88, TRY=89, CATCH=90, THROW=91, USING=92, NAMESPACE=93, 
		AUTO=94, REGISTER=95, SPECIAL_DATA=96, OPERATOR=97, TEMPLATE=98, CLASS_KEY=99, 
		NEW=100, PRE_IF=101, PRE_ELIF=102, PRE_ELSE=103, PRE_ENDIF=104, PRE_DEFINE=105, 
		PRE_UNDEF=106, PRE_DIAGNOSTIC=107, PRE_OTHER=108, PRE_INCLUDE=109, PRE_INCLUDE_NEXT=110, 
		PRE_LINE=111, PRE_PRAGMA=112, PRE_GCC=113, PRE_PRAGMA_KEYWORDS=114, PRE_STR=115, 
		PRE_ATTRIBUTE=116, END_TEST=117, ALPHA_NUMERIC=118, OPENING_CURLY=119, 
		CLOSING_CURLY=120, HEX_LITERAL=121, DECIMAL_LITERAL=122, OCTAL_LITERAL=123, 
		HEX_FLOAT=124, FLOATING_POINT_LITERAL=125, COMMENT=126, CHAR=127, STRING=128, 
		WHITESPACE=129, OTHER=130;
	public static final int
		RULE_statements = 0, RULE_statement = 1, RULE_opening_curly = 2, RULE_closing_curly = 3, 
		RULE_block_starter = 4, RULE_selection_or_iteration = 5, RULE_for_init_statement = 6, 
		RULE_jump_statement = 7, RULE_label = 8, RULE_expr_statement = 9, RULE_condition = 10, 
		RULE_pre_statement = 11, RULE_pre_blockstarter = 12, RULE_pre_if_statement = 13, 
		RULE_pre_elif_statement = 14, RULE_pre_else_statement = 15, RULE_pre_endif_statement = 16, 
		RULE_pre_if_condition = 17, RULE_call_in_preStatement = 18, RULE_pre_command = 19, 
		RULE_pre_define = 20, RULE_pre_undef = 21, RULE_pre_macro_identifier = 22, 
		RULE_keyword = 23, RULE_pre_macro_parameters = 24, RULE_pre_macro = 25, 
		RULE_macroCall = 26, RULE_pre_diagnostic = 27, RULE_pre_other = 28, RULE_attributeList = 29, 
		RULE_attribute = 30, RULE_pre_include = 31, RULE_pre_include_next = 32, 
		RULE_pre_include_local_file = 33, RULE_pre_include_filename = 34, RULE_pre_line = 35, 
		RULE_pre_pragma = 36, RULE_comment = 37, RULE_newline = 38, RULE_unary_operator = 39, 
		RULE_relational_operator = 40, RULE_constant = 41, RULE_function_decl_specifiers = 42, 
		RULE_ptr_operator = 43, RULE_access_specifier = 44, RULE_operator = 45, 
		RULE_assignment_operator = 46, RULE_equality_operator = 47, RULE_template_decl_start = 48, 
		RULE_template_param_list = 49, RULE_no_brackets = 50, RULE_no_brackets_curlies_or_squares = 51, 
		RULE_no_brackets_or_semicolon = 52, RULE_no_angle_brackets_or_brackets = 53, 
		RULE_no_curlies = 54, RULE_no_squares = 55, RULE_no_squares_or_semicolon = 56, 
		RULE_no_comma_or_semicolon = 57, RULE_assign_water = 58, RULE_assign_water_l2 = 59, 
		RULE_water = 60, RULE_custom = 61, RULE_asciiTab = 62, RULE_externC = 63, 
		RULE_macroFunctionPointer = 64, RULE_testStart = 65, RULE_testEnd = 66, 
		RULE_phpErrorMessage = 67, RULE_function_def = 68, RULE_macroCall_asFunctionHeader = 69, 
		RULE_return_type = 70, RULE_function_param_list = 71, RULE_parameter_decl_clause = 72, 
		RULE_parameter_decl = 73, RULE_parameter_id = 74, RULE_compound_statement = 75, 
		RULE_ctor_list = 76, RULE_ctor_initializer = 77, RULE_initializer_id = 78, 
		RULE_ctor_expr = 79, RULE_function_name = 80, RULE_exception_specification = 81, 
		RULE_type_id_list = 82, RULE_simple_decl = 83, RULE_var_decl = 84, RULE_callingConvention = 85, 
		RULE_special_datatype = 86, RULE_init_declarator_list = 87, RULE_class_def = 88, 
		RULE_class_name = 89, RULE_base_classes = 90, RULE_base_class = 91, RULE_type_name = 92, 
		RULE_base_type = 93, RULE_parameter_name = 94, RULE_param_type_list = 95, 
		RULE_param_type = 96, RULE_param_type_id = 97, RULE_identifier = 98, RULE_number = 99, 
		RULE_ptrs = 100, RULE_func_ptrs = 101, RULE_expr = 102, RULE_assign_expr = 103, 
		RULE_conditional_expression = 104, RULE_or_expression = 105, RULE_and_expression = 106, 
		RULE_inclusive_or_expression = 107, RULE_exclusive_or_expression = 108, 
		RULE_bit_and_expression = 109, RULE_equality_expression = 110, RULE_relational_expression = 111, 
		RULE_shift_expression = 112, RULE_additive_expression = 113, RULE_multiplicative_expression = 114, 
		RULE_function_pointer_use_expression = 115, RULE_cast_expression = 116, 
		RULE_cast_target = 117, RULE_unary_expression = 118, RULE_address_of_expression = 119, 
		RULE_new_expression = 120, RULE_unary_op_and_cast_expr = 121, RULE_sizeof_expression = 122, 
		RULE_sizeof = 123, RULE_defined_expression = 124, RULE_sizeof_operand = 125, 
		RULE_sizeof_operand2 = 126, RULE_inc_dec = 127, RULE_asmCall = 128, RULE_postfix_expression = 129, 
		RULE_initializer_expression = 130, RULE_argument_list = 131, RULE_argument = 132, 
		RULE_primary_expression = 133, RULE_null_expression = 134, RULE_preprocessor_fragment = 135, 
		RULE_expression_fragment = 136, RULE_init_declarator = 137, RULE_declarator = 138, 
		RULE_type_suffix = 139;
	public static final String[] ruleNames = {
		"statements", "statement", "opening_curly", "closing_curly", "block_starter", 
		"selection_or_iteration", "for_init_statement", "jump_statement", "label", 
		"expr_statement", "condition", "pre_statement", "pre_blockstarter", "pre_if_statement", 
		"pre_elif_statement", "pre_else_statement", "pre_endif_statement", "pre_if_condition", 
		"call_in_preStatement", "pre_command", "pre_define", "pre_undef", "pre_macro_identifier", 
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
		"phpErrorMessage", "function_def", "macroCall_asFunctionHeader", "return_type", 
		"function_param_list", "parameter_decl_clause", "parameter_decl", "parameter_id", 
		"compound_statement", "ctor_list", "ctor_initializer", "initializer_id", 
		"ctor_expr", "function_name", "exception_specification", "type_id_list", 
		"simple_decl", "var_decl", "callingConvention", "special_datatype", "init_declarator_list", 
		"class_def", "class_name", "base_classes", "base_class", "type_name", 
		"base_type", "parameter_name", "param_type_list", "param_type", "param_type_id", 
		"identifier", "number", "ptrs", "func_ptrs", "expr", "assign_expr", "conditional_expression", 
		"or_expression", "and_expression", "inclusive_or_expression", "exclusive_or_expression", 
		"bit_and_expression", "equality_expression", "relational_expression", 
		"shift_expression", "additive_expression", "multiplicative_expression", 
		"function_pointer_use_expression", "cast_expression", "cast_target", "unary_expression", 
		"address_of_expression", "new_expression", "unary_op_and_cast_expr", "sizeof_expression", 
		"sizeof", "defined_expression", "sizeof_operand", "sizeof_operand2", "inc_dec", 
		"asmCall", "postfix_expression", "initializer_expression", "argument_list", 
		"argument", "primary_expression", "null_expression", "preprocessor_fragment", 
		"expression_fragment", "init_declarator", "declarator", "type_suffix"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "';'", "':'", "'START_TEST'", "'inline'", "'explicit'", 
		"'friend'", "'public'", "'private'", "'protected'", "'long'", "','", "'&'", 
		"'*'", "'+'", "'-'", "'~'", "'!'", "'<'", "'>'", "'<='", "'>='", "'delete'", 
		"'['", "']'", "'/'", "'%'", "'^'", "'|'", "'='", "'+='", "'-='", "'*='", 
		"'/='", "'%='", "'^='", "'&='", "'|='", "'>>'", "'<<'", "'>>='", "'<<='", 
		"'=='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'->*'", "'->'", "'\"C\"'", 
		"'you'", "'lose'", "'-- must know STACK_DIRECTION at compile-time'", "'::'", 
		"'char'", "'int'", "'restrict'", "'?'", "'sizeof'", "'defined'", "':::'", 
		"'.'", null, null, "'\\'", "'...'", "'if'", "'else'", "'for'", "'while'", 
		"'break'", "'case'", "'continue'", "'switch'", "'do'", "'goto'", "'return'", 
		"'typedef'", "'static'", "'void'", "'unsigned'", "'signed'", null, "'extern'", 
		null, "'virtual'", null, null, "'throw'", "'using'", "'namespace'", "'auto'", 
		"'register'", null, "'operator'", "'template'", "'class'", "'new'", null, 
		null, null, null, null, null, null, null, null, null, null, null, "'GCC'", 
		null, null, null, "'END_TEST'", null, "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "ESCAPED_NEWLINE", "NEWLINE", "ESCAPE", 
		"ELLIPSIS", "IF", "ELSE", "FOR", "WHILE", "BREAK", "CASE", "CONTINUE", 
		"SWITCH", "DO", "GOTO", "RETURN", "TYPEDEF", "STATIC", "VOID", "UNSIGNED", 
		"SIGNED", "CV_QUALIFIER", "EXTERN", "ASM", "VIRTUAL", "TRY", "CATCH", 
		"THROW", "USING", "NAMESPACE", "AUTO", "REGISTER", "SPECIAL_DATA", "OPERATOR", 
		"TEMPLATE", "CLASS_KEY", "NEW", "PRE_IF", "PRE_ELIF", "PRE_ELSE", "PRE_ENDIF", 
		"PRE_DEFINE", "PRE_UNDEF", "PRE_DIAGNOSTIC", "PRE_OTHER", "PRE_INCLUDE", 
		"PRE_INCLUDE_NEXT", "PRE_LINE", "PRE_PRAGMA", "PRE_GCC", "PRE_PRAGMA_KEYWORDS", 
		"PRE_STR", "PRE_ATTRIBUTE", "END_TEST", "ALPHA_NUMERIC", "OPENING_CURLY", 
		"CLOSING_CURLY", "HEX_LITERAL", "DECIMAL_LITERAL", "OCTAL_LITERAL", "HEX_FLOAT", 
		"FLOATING_POINT_LITERAL", "COMMENT", "CHAR", "STRING", "WHITESPACE", "OTHER"
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
	     
	         //Find the end of a preprocessor condition
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
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (ESCAPED_NEWLINE - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (ASM - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (HEX_FLOAT - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (STRING - 128)) | (1L << (WHITESPACE - 128)) | (1L << (OTHER - 128)))) != 0)) {
				{
				{
				setState(280);
				statement();
				}
				}
				setState(285);
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
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				opening_curly();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				closing_curly();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				block_starter();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(289);
				jump_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(290);
				label();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(291);
				simple_decl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(292);
				expr_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(293);
				pre_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(294);
				comment();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(295);
				newline();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(296);
				custom();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(297);
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
			setState(300);
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
			setState(302);
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
			setState(304);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
		}
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
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
			int _alt;
			setState(454);
			switch (_input.LA(1)) {
			case TRY:
				_localctx = new Try_statementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				match(TRY);
				}
				break;
			case CATCH:
				_localctx = new Catch_statementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				match(CATCH);
				setState(332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(311);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
						{
						{
						setState(308);
						expression_fragment();
						}
						}
						setState(313);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(314);
					match(T__0);
					setState(318);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
						{
						{
						setState(315);
						expression_fragment();
						}
						}
						setState(320);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(323);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(321);
						param_type();
						}
						break;
					case 2:
						{
						setState(322);
						match(ELLIPSIS);
						}
						break;
					}
					setState(328);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
						{
						{
						setState(325);
						expression_fragment();
						}
						}
						setState(330);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(331);
					match(T__1);
					}
					break;
				}
				}
				break;
			case IF:
				_localctx = new If_statementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				match(IF);
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(335);
					expression_fragment();
					}
					}
					setState(340);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(341);
				match(T__0);
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(342);
					expression_fragment();
					}
					}
					setState(347);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(348);
				condition();
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(349);
					expression_fragment();
					}
					}
					setState(354);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(355);
				match(T__1);
				}
				break;
			case ELSE:
				_localctx = new Else_statementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(357);
				match(ELSE);
				}
				break;
			case SWITCH:
				_localctx = new Switch_statementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(358);
				match(SWITCH);
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(359);
					expression_fragment();
					}
					}
					setState(364);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(365);
				match(T__0);
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(366);
					expression_fragment();
					}
					}
					setState(371);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(372);
				condition();
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(373);
					expression_fragment();
					}
					}
					setState(378);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(379);
				match(T__1);
				}
				break;
			case FOR:
				_localctx = new For_statementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(381);
				match(FOR);
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(382);
					expression_fragment();
					}
					}
					setState(387);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(388);
				match(T__0);
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(389);
					expression_fragment();
					}
					}
					setState(394);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(397);
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
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__47:
				case T__48:
				case T__55:
				case T__56:
				case T__57:
				case T__60:
				case T__61:
				case T__63:
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
				case PRE_OTHER:
				case PRE_PRAGMA_KEYWORDS:
				case PRE_ATTRIBUTE:
				case END_TEST:
				case ALPHA_NUMERIC:
				case OPENING_CURLY:
				case HEX_LITERAL:
				case DECIMAL_LITERAL:
				case OCTAL_LITERAL:
				case HEX_FLOAT:
				case FLOATING_POINT_LITERAL:
				case CHAR:
				case STRING:
					{
					setState(395);
					for_init_statement();
					}
					break;
				case T__2:
					{
					setState(396);
					match(T__2);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(399);
					expression_fragment();
					}
					}
					setState(404);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(406);
				_la = _input.LA(1);
				if (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (T__0 - 1)) | (1L << (T__4 - 1)) | (1L << (T__5 - 1)) | (1L << (T__6 - 1)) | (1L << (T__7 - 1)) | (1L << (T__8 - 1)) | (1L << (T__9 - 1)) | (1L << (T__10 - 1)) | (1L << (T__11 - 1)) | (1L << (T__13 - 1)) | (1L << (T__14 - 1)) | (1L << (T__15 - 1)) | (1L << (T__16 - 1)) | (1L << (T__17 - 1)) | (1L << (T__18 - 1)) | (1L << (T__19 - 1)) | (1L << (T__47 - 1)) | (1L << (T__48 - 1)) | (1L << (T__55 - 1)) | (1L << (T__56 - 1)) | (1L << (T__57 - 1)) | (1L << (T__60 - 1)) | (1L << (T__61 - 1)) | (1L << (T__63 - 1)))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (STATIC - 81)) | (1L << (VOID - 81)) | (1L << (UNSIGNED - 81)) | (1L << (SIGNED - 81)) | (1L << (CV_QUALIFIER - 81)) | (1L << (EXTERN - 81)) | (1L << (ASM - 81)) | (1L << (VIRTUAL - 81)) | (1L << (TRY - 81)) | (1L << (CATCH - 81)) | (1L << (AUTO - 81)) | (1L << (REGISTER - 81)) | (1L << (SPECIAL_DATA - 81)) | (1L << (OPERATOR - 81)) | (1L << (CLASS_KEY - 81)) | (1L << (NEW - 81)) | (1L << (PRE_OTHER - 81)) | (1L << (PRE_PRAGMA_KEYWORDS - 81)) | (1L << (PRE_ATTRIBUTE - 81)) | (1L << (END_TEST - 81)) | (1L << (ALPHA_NUMERIC - 81)) | (1L << (OPENING_CURLY - 81)) | (1L << (HEX_LITERAL - 81)) | (1L << (DECIMAL_LITERAL - 81)) | (1L << (OCTAL_LITERAL - 81)) | (1L << (HEX_FLOAT - 81)) | (1L << (FLOATING_POINT_LITERAL - 81)) | (1L << (CHAR - 81)) | (1L << (STRING - 81)))) != 0)) {
					{
					setState(405);
					condition();
					}
				}

				setState(408);
				match(T__2);
				setState(412);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(409);
						expression_fragment();
						}
						} 
					}
					setState(414);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(416);
				_la = _input.LA(1);
				if (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (T__0 - 1)) | (1L << (T__4 - 1)) | (1L << (T__5 - 1)) | (1L << (T__6 - 1)) | (1L << (T__7 - 1)) | (1L << (T__8 - 1)) | (1L << (T__9 - 1)) | (1L << (T__10 - 1)) | (1L << (T__11 - 1)) | (1L << (T__13 - 1)) | (1L << (T__14 - 1)) | (1L << (T__15 - 1)) | (1L << (T__16 - 1)) | (1L << (T__17 - 1)) | (1L << (T__18 - 1)) | (1L << (T__19 - 1)) | (1L << (T__47 - 1)) | (1L << (T__48 - 1)) | (1L << (T__55 - 1)) | (1L << (T__56 - 1)) | (1L << (T__57 - 1)) | (1L << (T__60 - 1)) | (1L << (T__61 - 1)) | (1L << (T__63 - 1)))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (STATIC - 81)) | (1L << (VOID - 81)) | (1L << (UNSIGNED - 81)) | (1L << (SIGNED - 81)) | (1L << (CV_QUALIFIER - 81)) | (1L << (EXTERN - 81)) | (1L << (ASM - 81)) | (1L << (VIRTUAL - 81)) | (1L << (TRY - 81)) | (1L << (CATCH - 81)) | (1L << (AUTO - 81)) | (1L << (REGISTER - 81)) | (1L << (SPECIAL_DATA - 81)) | (1L << (OPERATOR - 81)) | (1L << (CLASS_KEY - 81)) | (1L << (NEW - 81)) | (1L << (PRE_OTHER - 81)) | (1L << (PRE_PRAGMA_KEYWORDS - 81)) | (1L << (PRE_ATTRIBUTE - 81)) | (1L << (END_TEST - 81)) | (1L << (ALPHA_NUMERIC - 81)) | (1L << (OPENING_CURLY - 81)) | (1L << (HEX_LITERAL - 81)) | (1L << (DECIMAL_LITERAL - 81)) | (1L << (OCTAL_LITERAL - 81)) | (1L << (HEX_FLOAT - 81)) | (1L << (FLOATING_POINT_LITERAL - 81)) | (1L << (CHAR - 81)) | (1L << (STRING - 81)))) != 0)) {
					{
					setState(415);
					expr();
					}
				}

				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(418);
					expression_fragment();
					}
					}
					setState(423);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(424);
				match(T__1);
				setState(426);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(425);
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
				setState(428);
				match(DO);
				}
				break;
			case WHILE:
				_localctx = new While_statementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(429);
				match(WHILE);
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(430);
					expression_fragment();
					}
					}
					setState(435);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(436);
				match(T__0);
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(437);
					expression_fragment();
					}
					}
					setState(442);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(443);
				condition();
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(444);
					expression_fragment();
					}
					}
					setState(449);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(450);
				match(T__1);
				setState(452);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(451);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
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
		int _la;
		try {
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				simple_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				expr();
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(458);
					expression_fragment();
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
			}
		}
		catch (RecognitionException re) {
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
		}
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
		}
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
		}
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
		}
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
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
			int _alt;
			setState(528);
			switch (_input.LA(1)) {
			case BREAK:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				match(BREAK);
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(469);
					expression_fragment();
					}
					}
					setState(474);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(475);
				match(T__2);
				}
				break;
			case CONTINUE:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				match(CONTINUE);
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(477);
					expression_fragment();
					}
					}
					setState(482);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(483);
				match(T__2);
				}
				break;
			case GOTO:
				_localctx = new GotoStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(484);
				match(GOTO);
				setState(485);
				identifier();
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(486);
					expression_fragment();
					}
					}
					setState(491);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(492);
				match(T__2);
				}
				break;
			case RETURN:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(494);
				match(RETURN);
				setState(498);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(495);
						expression_fragment();
						}
						} 
					}
					setState(500);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				setState(502);
				_la = _input.LA(1);
				if (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (T__0 - 1)) | (1L << (T__4 - 1)) | (1L << (T__5 - 1)) | (1L << (T__6 - 1)) | (1L << (T__7 - 1)) | (1L << (T__8 - 1)) | (1L << (T__9 - 1)) | (1L << (T__10 - 1)) | (1L << (T__11 - 1)) | (1L << (T__13 - 1)) | (1L << (T__14 - 1)) | (1L << (T__15 - 1)) | (1L << (T__16 - 1)) | (1L << (T__17 - 1)) | (1L << (T__18 - 1)) | (1L << (T__19 - 1)) | (1L << (T__47 - 1)) | (1L << (T__48 - 1)) | (1L << (T__55 - 1)) | (1L << (T__56 - 1)) | (1L << (T__57 - 1)) | (1L << (T__60 - 1)) | (1L << (T__61 - 1)) | (1L << (T__63 - 1)))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (STATIC - 81)) | (1L << (VOID - 81)) | (1L << (UNSIGNED - 81)) | (1L << (SIGNED - 81)) | (1L << (CV_QUALIFIER - 81)) | (1L << (EXTERN - 81)) | (1L << (ASM - 81)) | (1L << (VIRTUAL - 81)) | (1L << (TRY - 81)) | (1L << (CATCH - 81)) | (1L << (AUTO - 81)) | (1L << (REGISTER - 81)) | (1L << (SPECIAL_DATA - 81)) | (1L << (OPERATOR - 81)) | (1L << (CLASS_KEY - 81)) | (1L << (NEW - 81)) | (1L << (PRE_OTHER - 81)) | (1L << (PRE_PRAGMA_KEYWORDS - 81)) | (1L << (PRE_ATTRIBUTE - 81)) | (1L << (END_TEST - 81)) | (1L << (ALPHA_NUMERIC - 81)) | (1L << (OPENING_CURLY - 81)) | (1L << (HEX_LITERAL - 81)) | (1L << (DECIMAL_LITERAL - 81)) | (1L << (OCTAL_LITERAL - 81)) | (1L << (HEX_FLOAT - 81)) | (1L << (FLOATING_POINT_LITERAL - 81)) | (1L << (CHAR - 81)) | (1L << (STRING - 81)))) != 0)) {
					{
					setState(501);
					expr();
					}
				}

				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(504);
					expression_fragment();
					}
					}
					setState(509);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(510);
				match(T__2);
				}
				break;
			case THROW:
				_localctx = new ThrowStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(511);
				match(THROW);
				setState(515);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(512);
						expression_fragment();
						}
						} 
					}
					setState(517);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(519);
				_la = _input.LA(1);
				if (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (T__0 - 1)) | (1L << (T__4 - 1)) | (1L << (T__5 - 1)) | (1L << (T__6 - 1)) | (1L << (T__7 - 1)) | (1L << (T__8 - 1)) | (1L << (T__9 - 1)) | (1L << (T__10 - 1)) | (1L << (T__11 - 1)) | (1L << (T__13 - 1)) | (1L << (T__14 - 1)) | (1L << (T__15 - 1)) | (1L << (T__16 - 1)) | (1L << (T__17 - 1)) | (1L << (T__18 - 1)) | (1L << (T__19 - 1)) | (1L << (T__47 - 1)) | (1L << (T__48 - 1)) | (1L << (T__55 - 1)) | (1L << (T__56 - 1)) | (1L << (T__57 - 1)) | (1L << (T__60 - 1)) | (1L << (T__61 - 1)) | (1L << (T__63 - 1)))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (STATIC - 81)) | (1L << (VOID - 81)) | (1L << (UNSIGNED - 81)) | (1L << (SIGNED - 81)) | (1L << (CV_QUALIFIER - 81)) | (1L << (EXTERN - 81)) | (1L << (ASM - 81)) | (1L << (VIRTUAL - 81)) | (1L << (TRY - 81)) | (1L << (CATCH - 81)) | (1L << (AUTO - 81)) | (1L << (REGISTER - 81)) | (1L << (SPECIAL_DATA - 81)) | (1L << (OPERATOR - 81)) | (1L << (CLASS_KEY - 81)) | (1L << (NEW - 81)) | (1L << (PRE_OTHER - 81)) | (1L << (PRE_PRAGMA_KEYWORDS - 81)) | (1L << (PRE_ATTRIBUTE - 81)) | (1L << (END_TEST - 81)) | (1L << (ALPHA_NUMERIC - 81)) | (1L << (OPENING_CURLY - 81)) | (1L << (HEX_LITERAL - 81)) | (1L << (DECIMAL_LITERAL - 81)) | (1L << (OCTAL_LITERAL - 81)) | (1L << (HEX_FLOAT - 81)) | (1L << (FLOATING_POINT_LITERAL - 81)) | (1L << (CHAR - 81)) | (1L << (STRING - 81)))) != 0)) {
					{
					setState(518);
					expr();
					}
				}

				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(521);
					expression_fragment();
					}
					}
					setState(526);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(527);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
		}
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
			setState(531);
			_la = _input.LA(1);
			if (_la==CASE) {
				{
				setState(530);
				match(CASE);
				}
			}

			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(533);
				identifier();
				}
				break;
			case 2:
				{
				setState(534);
				number();
				}
				break;
			case 3:
				{
				setState(535);
				match(CHAR);
				}
				break;
			case 4:
				{
				setState(536);
				cast_expression();
				}
				break;
			}
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
				{
				{
				setState(539);
				expression_fragment();
				}
				}
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(545);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
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
		int _la;
		try {
			setState(557);
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
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__47:
			case T__48:
			case T__55:
			case T__56:
			case T__57:
			case T__60:
			case T__61:
			case T__63:
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
			case PRE_OTHER:
			case PRE_PRAGMA_KEYWORDS:
			case PRE_ATTRIBUTE:
			case END_TEST:
			case ALPHA_NUMERIC:
			case OPENING_CURLY:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case HEX_FLOAT:
			case FLOATING_POINT_LITERAL:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(547);
				expr();
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(548);
					expression_fragment();
					}
					}
					setState(553);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(554);
				match(T__2);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(556);
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
			setState(559);
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
			setState(563);
			switch (_input.LA(1)) {
			case PRE_IF:
			case PRE_ELIF:
			case PRE_ELSE:
			case PRE_ENDIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(561);
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
				setState(562);
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
			setState(569);
			switch (_input.LA(1)) {
			case PRE_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				pre_if_statement();
				}
				break;
			case PRE_ELIF:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				pre_elif_statement();
				}
				break;
			case PRE_ELSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(567);
				pre_else_statement();
				}
				break;
			case PRE_ENDIF:
				enterOuterAlt(_localctx, 4);
				{
				setState(568);
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
		public TerminalNode NEWLINE() { return getToken(FunctionParser.NEWLINE, 0); }
		public TerminalNode EOF() { return getToken(FunctionParser.EOF, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(PRE_IF);
			setState(572);
			pre_if_condition();
			setState(573);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NEWLINE) ) {
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

	public static class Pre_elif_statementContext extends ParserRuleContext {
		public TerminalNode PRE_ELIF() { return getToken(FunctionParser.PRE_ELIF, 0); }
		public Pre_if_conditionContext pre_if_condition() {
			return getRuleContext(Pre_if_conditionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(FunctionParser.NEWLINE, 0); }
		public TerminalNode EOF() { return getToken(FunctionParser.EOF, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(PRE_ELIF);
			setState(576);
			pre_if_condition();
			setState(577);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NEWLINE) ) {
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
			setState(579);
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
			setState(581);
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
		public List<Call_in_preStatementContext> call_in_preStatement() {
			return getRuleContexts(Call_in_preStatementContext.class);
		}
		public Call_in_preStatementContext call_in_preStatement(int i) {
			return getRuleContext(Call_in_preStatementContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(585);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						setState(583);
						call_in_preStatement();
						}
						break;
					case 2:
						{
						setState(584);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==NEWLINE) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(589);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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

	public static class Call_in_preStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<Call_in_preStatementContext> call_in_preStatement() {
			return getRuleContexts(Call_in_preStatementContext.class);
		}
		public Call_in_preStatementContext call_in_preStatement(int i) {
			return getRuleContext(Call_in_preStatementContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public Call_in_preStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_in_preStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterCall_in_preStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitCall_in_preStatement(this);
		}
	}

	public final Call_in_preStatementContext call_in_preStatement() throws RecognitionException {
		Call_in_preStatementContext _localctx = new Call_in_preStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_call_in_preStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			identifier();
			setState(591);
			match(T__0);
			setState(596);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(594);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						setState(592);
						call_in_preStatement();
						}
						break;
					case 2:
						{
						setState(593);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==NEWLINE) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(598);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			setState(599);
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
		enterRule(_localctx, 38, RULE_pre_command);
		try {
			setState(610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(601);
				pre_define();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(602);
				pre_undef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(603);
				pre_diagnostic();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(604);
				pre_other();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(605);
				pre_include();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(606);
				pre_include_next();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(607);
				pre_line();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(608);
				pre_pragma();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(609);
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

	public static class Pre_defineContext extends ParserRuleContext {
		public TerminalNode PRE_DEFINE() { return getToken(FunctionParser.PRE_DEFINE, 0); }
		public Pre_macro_identifierContext pre_macro_identifier() {
			return getRuleContext(Pre_macro_identifierContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(FunctionParser.NEWLINE, 0); }
		public TerminalNode EOF() { return getToken(FunctionParser.EOF, 0); }
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
		enterRule(_localctx, 40, RULE_pre_define);
		int _la;
		try {
			setState(621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(612);
				match(PRE_DEFINE);
				setState(613);
				pre_macro_identifier();
				setState(614);
				_la = _input.LA(1);
				if ( !(_la==EOF || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(616);
				match(PRE_DEFINE);
				setState(617);
				pre_macro_identifier();
				setState(618);
				pre_macro();
				setState(619);
				_la = _input.LA(1);
				if ( !(_la==EOF || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
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
		enterRule(_localctx, 42, RULE_pre_undef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			match(PRE_UNDEF);
			setState(624);
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
		public Pre_otherContext pre_other() {
			return getRuleContext(Pre_otherContext.class,0);
		}
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
		enterRule(_localctx, 44, RULE_pre_macro_identifier);
		try {
			setState(643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(626);
				identifier();
				setState(631);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(627);
					match(T__0);
					setState(628);
					pre_macro_parameters();
					setState(629);
					match(T__1);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(633);
				keyword();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(634);
				match(END_TEST);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(635);
				match(T__4);
				setState(640);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(636);
					match(T__0);
					setState(637);
					pre_macro_parameters();
					setState(638);
					match(T__1);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(642);
				pre_other();
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
		enterRule(_localctx, 46, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
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
		enterRule(_localctx, 48, RULE_pre_macro_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case NEW:
			case PRE_PRAGMA_KEYWORDS:
			case ALPHA_NUMERIC:
				{
				setState(647);
				identifier();
				}
				break;
			case ELLIPSIS:
				{
				setState(648);
				match(ELLIPSIS);
				}
				break;
			case T__1:
			case T__12:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(651);
				match(T__12);
				setState(654);
				switch (_input.LA(1)) {
				case T__8:
				case T__9:
				case T__10:
				case NEW:
				case PRE_PRAGMA_KEYWORDS:
				case ALPHA_NUMERIC:
					{
					setState(652);
					identifier();
					}
					break;
				case ELLIPSIS:
					{
					setState(653);
					match(ELLIPSIS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(660);
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
		public List<Call_in_preStatementContext> call_in_preStatement() {
			return getRuleContexts(Call_in_preStatementContext.class);
		}
		public Call_in_preStatementContext call_in_preStatement(int i) {
			return getRuleContext(Call_in_preStatementContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
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
		enterRule(_localctx, 50, RULE_pre_macro);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(663);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						setState(661);
						call_in_preStatement();
						}
						break;
					case 2:
						{
						setState(662);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==NEWLINE) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(667);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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

	public static class MacroCallContext extends ParserRuleContext {
		public List<Pre_macro_identifierContext> pre_macro_identifier() {
			return getRuleContexts(Pre_macro_identifierContext.class);
		}
		public Pre_macro_identifierContext pre_macro_identifier(int i) {
			return getRuleContext(Pre_macro_identifierContext.class,i);
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
		public List<Relational_operatorContext> relational_operator() {
			return getRuleContexts(Relational_operatorContext.class);
		}
		public Relational_operatorContext relational_operator(int i) {
			return getRuleContext(Relational_operatorContext.class,i);
		}
		public List<Equality_operatorContext> equality_operator() {
			return getRuleContexts(Equality_operatorContext.class);
		}
		public Equality_operatorContext equality_operator(int i) {
			return getRuleContext(Equality_operatorContext.class,i);
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
		enterRule(_localctx, 52, RULE_macroCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(668);
				pre_macro_identifier();
				}
				break;
			}
			setState(671);
			pre_macro_identifier();
			setState(672);
			match(T__0);
			setState(701);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				{
				setState(677);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(673);
					expr();
					}
					break;
				case 2:
					{
					setState(674);
					type_name();
					}
					break;
				case 3:
					{
					setState(675);
					relational_operator();
					}
					break;
				case 4:
					{
					setState(676);
					equality_operator();
					}
					break;
				}
				setState(680);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(679);
					match(NEWLINE);
					}
				}

				}
				setState(694);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(682);
						match(T__12);
						setState(684);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(683);
							match(NEWLINE);
							}
						}

						setState(690);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
						case 1:
							{
							setState(686);
							expr();
							}
							break;
						case 2:
							{
							setState(687);
							type_name();
							}
							break;
						case 3:
							{
							setState(688);
							relational_operator();
							}
							break;
						case 4:
							{
							setState(689);
							equality_operator();
							}
							break;
						}
						}
						} 
					}
					setState(696);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				setState(698);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(697);
					match(T__12);
					}
				}

				}
				break;
			case 2:
				{
				setState(700);
				match(VOID);
				}
				break;
			}
			setState(703);
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
		enterRule(_localctx, 54, RULE_pre_diagnostic);
		try {
			setState(708);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(705);
				match(PRE_DIAGNOSTIC);
				setState(706);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(707);
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
		enterRule(_localctx, 56, RULE_pre_other);
		int _la;
		try {
			setState(729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(710);
				match(PRE_OTHER);
				setState(712);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(711);
					match(STRING);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(714);
				match(PRE_ATTRIBUTE);
				setState(715);
				match(T__0);
				setState(716);
				match(T__0);
				setState(718);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (STATIC - 81)) | (1L << (UNSIGNED - 81)) | (1L << (SIGNED - 81)) | (1L << (VIRTUAL - 81)) | (1L << (TRY - 81)) | (1L << (CATCH - 81)) | (1L << (OPERATOR - 81)) | (1L << (CLASS_KEY - 81)) | (1L << (NEW - 81)) | (1L << (PRE_OTHER - 81)) | (1L << (PRE_PRAGMA_KEYWORDS - 81)) | (1L << (PRE_ATTRIBUTE - 81)) | (1L << (END_TEST - 81)) | (1L << (ALPHA_NUMERIC - 81)) | (1L << (HEX_LITERAL - 81)) | (1L << (DECIMAL_LITERAL - 81)) | (1L << (OCTAL_LITERAL - 81)) | (1L << (HEX_FLOAT - 81)) | (1L << (FLOATING_POINT_LITERAL - 81)) | (1L << (CHAR - 81)) | (1L << (STRING - 81)))) != 0)) {
					{
					setState(717);
					attributeList();
					}
				}

				setState(720);
				match(T__1);
				setState(721);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(722);
				match(PRE_ATTRIBUTE);
				setState(723);
				match(T__0);
				setState(725);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (STATIC - 81)) | (1L << (UNSIGNED - 81)) | (1L << (SIGNED - 81)) | (1L << (VIRTUAL - 81)) | (1L << (TRY - 81)) | (1L << (CATCH - 81)) | (1L << (OPERATOR - 81)) | (1L << (CLASS_KEY - 81)) | (1L << (NEW - 81)) | (1L << (PRE_OTHER - 81)) | (1L << (PRE_PRAGMA_KEYWORDS - 81)) | (1L << (PRE_ATTRIBUTE - 81)) | (1L << (END_TEST - 81)) | (1L << (ALPHA_NUMERIC - 81)) | (1L << (HEX_LITERAL - 81)) | (1L << (DECIMAL_LITERAL - 81)) | (1L << (OCTAL_LITERAL - 81)) | (1L << (HEX_FLOAT - 81)) | (1L << (FLOATING_POINT_LITERAL - 81)) | (1L << (CHAR - 81)) | (1L << (STRING - 81)))) != 0)) {
					{
					setState(724);
					attributeList();
					}
				}

				setState(727);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(728);
				match(PRE_ATTRIBUTE);
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
		enterRule(_localctx, 58, RULE_attributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			attribute();
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(732);
				match(T__12);
				setState(733);
				attribute();
				}
				}
				setState(738);
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
		enterRule(_localctx, 60, RULE_attribute);
		int _la;
		try {
			setState(767);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(739);
				pre_macro_identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(740);
				pre_macro_identifier();
				setState(741);
				match(T__0);
				setState(742);
				identifier();
				setState(747);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(743);
					match(T__12);
					setState(744);
					expr();
					}
					}
					setState(749);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(750);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(752);
				pre_macro_identifier();
				setState(753);
				match(T__0);
				setState(755);
				_la = _input.LA(1);
				if (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (T__0 - 1)) | (1L << (T__4 - 1)) | (1L << (T__5 - 1)) | (1L << (T__6 - 1)) | (1L << (T__7 - 1)) | (1L << (T__8 - 1)) | (1L << (T__9 - 1)) | (1L << (T__10 - 1)) | (1L << (T__11 - 1)) | (1L << (T__13 - 1)) | (1L << (T__14 - 1)) | (1L << (T__15 - 1)) | (1L << (T__16 - 1)) | (1L << (T__17 - 1)) | (1L << (T__18 - 1)) | (1L << (T__19 - 1)) | (1L << (T__47 - 1)) | (1L << (T__48 - 1)) | (1L << (T__55 - 1)) | (1L << (T__56 - 1)) | (1L << (T__57 - 1)) | (1L << (T__60 - 1)) | (1L << (T__61 - 1)) | (1L << (T__63 - 1)))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (STATIC - 81)) | (1L << (VOID - 81)) | (1L << (UNSIGNED - 81)) | (1L << (SIGNED - 81)) | (1L << (CV_QUALIFIER - 81)) | (1L << (EXTERN - 81)) | (1L << (ASM - 81)) | (1L << (VIRTUAL - 81)) | (1L << (TRY - 81)) | (1L << (CATCH - 81)) | (1L << (AUTO - 81)) | (1L << (REGISTER - 81)) | (1L << (SPECIAL_DATA - 81)) | (1L << (OPERATOR - 81)) | (1L << (CLASS_KEY - 81)) | (1L << (NEW - 81)) | (1L << (PRE_OTHER - 81)) | (1L << (PRE_PRAGMA_KEYWORDS - 81)) | (1L << (PRE_ATTRIBUTE - 81)) | (1L << (END_TEST - 81)) | (1L << (ALPHA_NUMERIC - 81)) | (1L << (OPENING_CURLY - 81)) | (1L << (HEX_LITERAL - 81)) | (1L << (DECIMAL_LITERAL - 81)) | (1L << (OCTAL_LITERAL - 81)) | (1L << (HEX_FLOAT - 81)) | (1L << (FLOATING_POINT_LITERAL - 81)) | (1L << (CHAR - 81)) | (1L << (STRING - 81)))) != 0)) {
					{
					setState(754);
					expr();
					}
				}

				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(757);
					match(T__12);
					setState(758);
					expr();
					}
					}
					setState(763);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(764);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(766);
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
		enterRule(_localctx, 62, RULE_pre_include);
		try {
			setState(774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(769);
				match(PRE_INCLUDE);
				setState(770);
				pre_include_local_file();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(771);
				match(PRE_INCLUDE);
				setState(772);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(773);
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
		enterRule(_localctx, 64, RULE_pre_include_next);
		try {
			setState(781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(776);
				match(PRE_INCLUDE_NEXT);
				setState(777);
				pre_include_local_file();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(778);
				match(PRE_INCLUDE_NEXT);
				setState(779);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(780);
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
		enterRule(_localctx, 66, RULE_pre_include_local_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
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
		enterRule(_localctx, 68, RULE_pre_include_filename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
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
		enterRule(_localctx, 70, RULE_pre_line);
		try {
			setState(801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(787);
				match(PRE_LINE);
				setState(788);
				match(DECIMAL_LITERAL);
				setState(789);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(790);
				match(PRE_LINE);
				setState(791);
				match(DECIMAL_LITERAL);
				setState(792);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(793);
				match(PRE_LINE);
				setState(794);
				pre_macro_identifier();
				setState(795);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(797);
				match(PRE_LINE);
				setState(798);
				pre_macro_identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(799);
				match(PRE_LINE);
				setState(800);
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
		enterRule(_localctx, 72, RULE_pre_pragma);
		int _la;
		try {
			int _alt;
			setState(823);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(803);
				match(PRE_PRAGMA);
				setState(805);
				_la = _input.LA(1);
				if (_la==PRE_GCC) {
					{
					setState(804);
					match(PRE_GCC);
					}
				}

				setState(807);
				match(PRE_PRAGMA_KEYWORDS);
				setState(808);
				match(STRING);
				 preProcFindMacroEnd(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(810);
				match(PRE_PRAGMA);
				setState(812);
				_la = _input.LA(1);
				if (_la==PRE_GCC) {
					{
					setState(811);
					match(PRE_GCC);
					}
				}

				setState(814);
				match(PRE_PRAGMA_KEYWORDS);
				setState(818);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(815);
						identifier();
						}
						} 
					}
					setState(820);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(821);
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
		enterRule(_localctx, 74, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
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
		enterRule(_localctx, 76, RULE_newline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
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
		enterRule(_localctx, 78, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
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
		enterRule(_localctx, 80, RULE_relational_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
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
		public TerminalNode HEX_FLOAT() { return getToken(FunctionParser.HEX_FLOAT, 0); }
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
		enterRule(_localctx, 82, RULE_constant);
		try {
			int _alt;
			setState(856);
			switch (_input.LA(1)) {
			case HEX_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(833);
				match(HEX_LITERAL);
				}
				break;
			case OCTAL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(834);
				match(OCTAL_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(835);
				match(DECIMAL_LITERAL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(849); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(836);
						match(STRING);
						setState(838);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
						case 1:
							{
							setState(837);
							match(NEWLINE);
							}
							break;
						}
						setState(843);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(840);
								match(COMMENT);
								}
								} 
							}
							setState(845);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
						}
						setState(847);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
						case 1:
							{
							setState(846);
							match(NEWLINE);
							}
							break;
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(851); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(853);
				match(CHAR);
				}
				break;
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(854);
				match(FLOATING_POINT_LITERAL);
				}
				break;
			case HEX_FLOAT:
				enterOuterAlt(_localctx, 7);
				{
				setState(855);
				match(HEX_FLOAT);
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
		enterRule(_localctx, 84, RULE_function_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
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
		enterRule(_localctx, 86, RULE_ptr_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__14) ) {
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
		enterRule(_localctx, 88, RULE_access_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
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
		enterRule(_localctx, 90, RULE_operator);
		int _la;
		try {
			setState(909);
			switch (_input.LA(1)) {
			case T__23:
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(864);
				_la = _input.LA(1);
				if ( !(_la==T__23 || _la==NEW) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(867);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(865);
					match(T__24);
					setState(866);
					match(T__25);
					}
				}

				}
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(869);
				match(T__15);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(870);
				match(T__16);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(871);
				match(T__14);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 5);
				{
				setState(872);
				match(T__26);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 6);
				{
				setState(873);
				match(T__27);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 7);
				{
				setState(874);
				match(T__28);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 8);
				{
				setState(875);
				match(T__13);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 9);
				{
				setState(876);
				match(T__29);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 10);
				{
				setState(877);
				match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 11);
				{
				setState(878);
				match(T__18);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 12);
				{
				setState(879);
				match(T__30);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 13);
				{
				setState(880);
				match(T__19);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 14);
				{
				setState(881);
				match(T__20);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 15);
				{
				setState(882);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 16);
				{
				setState(883);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 17);
				{
				setState(884);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 18);
				{
				setState(885);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 19);
				{
				setState(886);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 20);
				{
				setState(887);
				match(T__36);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 21);
				{
				setState(888);
				match(T__37);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 22);
				{
				setState(889);
				match(T__38);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 23);
				{
				setState(890);
				match(T__39);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 24);
				{
				setState(891);
				match(T__40);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 25);
				{
				setState(892);
				match(T__41);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 26);
				{
				setState(893);
				match(T__42);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 27);
				{
				setState(894);
				match(T__43);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 28);
				{
				setState(895);
				match(T__44);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 29);
				{
				setState(896);
				match(T__21);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 30);
				{
				setState(897);
				match(T__22);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 31);
				{
				setState(898);
				match(T__45);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 32);
				{
				setState(899);
				match(T__46);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 33);
				{
				setState(900);
				match(T__47);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 34);
				{
				setState(901);
				match(T__48);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 35);
				{
				setState(902);
				match(T__12);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 36);
				{
				setState(903);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 37);
				{
				setState(904);
				match(T__50);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 38);
				{
				setState(905);
				match(T__0);
				setState(906);
				match(T__1);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 39);
				{
				setState(907);
				match(T__24);
				setState(908);
				match(T__25);
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
		enterRule(_localctx, 92, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__41) | (1L << T__42))) != 0)) ) {
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
		enterRule(_localctx, 94, RULE_equality_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			_la = _input.LA(1);
			if ( !(_la==T__43 || _la==T__44) ) {
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
		enterRule(_localctx, 96, RULE_template_decl_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			match(TEMPLATE);
			setState(916);
			match(T__19);
			setState(917);
			template_param_list();
			setState(918);
			match(T__20);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 98, RULE_template_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(929);
				switch (_input.LA(1)) {
				case T__19:
					{
					{
					setState(920);
					match(T__19);
					setState(921);
					template_param_list();
					setState(922);
					match(T__20);
					}
					}
					break;
				case T__0:
					{
					{
					setState(924);
					match(T__0);
					setState(925);
					template_param_list();
					setState(926);
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
				case T__60:
				case T__61:
				case T__62:
				case T__63:
				case ESCAPED_NEWLINE:
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
				case HEX_FLOAT:
				case FLOATING_POINT_LITERAL:
				case COMMENT:
				case CHAR:
				case STRING:
				case WHITESPACE:
				case OTHER:
					{
					setState(928);
					no_angle_brackets_or_brackets();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(931); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (ESCAPED_NEWLINE - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (ASM - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (HEX_FLOAT - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (STRING - 128)) | (1L << (WHITESPACE - 128)) | (1L << (OTHER - 128)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 100, RULE_no_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
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
		enterRule(_localctx, 102, RULE_no_brackets_curlies_or_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__24) | (1L << T__25))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
		enterRule(_localctx, 104, RULE_no_brackets_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
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
		enterRule(_localctx, 106, RULE_no_angle_brackets_or_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__19) | (1L << T__20))) != 0)) ) {
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
		enterRule(_localctx, 108, RULE_no_curlies);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
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
		enterRule(_localctx, 110, RULE_no_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__24 || _la==T__25) ) {
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
		enterRule(_localctx, 112, RULE_no_squares_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__24) | (1L << T__25))) != 0)) ) {
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
		enterRule(_localctx, 114, RULE_no_comma_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
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
		enterRule(_localctx, 116, RULE_assign_water);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(949);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__12) | (1L << T__24) | (1L << T__25))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
		enterRule(_localctx, 118, RULE_assign_water_l2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(951);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__24) | (1L << T__25))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
		enterRule(_localctx, 120, RULE_water);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953);
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
		public PhpErrorMessageContext phpErrorMessage() {
			return getRuleContext(PhpErrorMessageContext.class,0);
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
		enterRule(_localctx, 122, RULE_custom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(955);
				asciiTab();
				}
				break;
			case 2:
				{
				setState(956);
				externC();
				}
				break;
			case 3:
				{
				setState(957);
				macroFunctionPointer();
				}
				break;
			case 4:
				{
				setState(958);
				testEnd();
				}
				break;
			case 5:
				{
				setState(959);
				phpErrorMessage();
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
		enterRule(_localctx, 124, RULE_asciiTab);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(965); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(962);
					pre_macro_identifier();
					setState(963);
					match(T__12);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(967); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
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
		enterRule(_localctx, 126, RULE_externC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			match(EXTERN);
			setState(970);
			match(T__51);
			setState(972);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(971);
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
		enterRule(_localctx, 128, RULE_macroFunctionPointer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			macroCall();
			setState(976);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(975);
				match(NEWLINE);
				}
				break;
			}
			setState(979);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(978);
				pre_macro_identifier();
				}
				break;
			}
			setState(982);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(981);
				match(NEWLINE);
				}
			}

			setState(984);
			macroCall();
			setState(986);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(985);
				match(NEWLINE);
				}
			}

			setState(988);
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
		enterRule(_localctx, 130, RULE_testStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			match(T__4);
			setState(991);
			match(T__0);
			setState(992);
			function_name();
			setState(993);
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
		enterRule(_localctx, 132, RULE_testEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
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

	public static class PhpErrorMessageContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public PhpErrorMessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phpErrorMessage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPhpErrorMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPhpErrorMessage(this);
		}
	}

	public final PhpErrorMessageContext phpErrorMessage() throws RecognitionException {
		PhpErrorMessageContext _localctx = new PhpErrorMessageContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_phpErrorMessage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			match(T__52);
			setState(998);
			match(NEWLINE);
			setState(999);
			match(T__53);
			setState(1000);
			match(NEWLINE);
			setState(1001);
			match(T__54);
			}
		}
		catch (RecognitionException re) {
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
		}
		public Ctor_listContext ctor_list() {
			return getRuleContext(Ctor_listContext.class,0);
		}
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
		enterRule(_localctx, 136, RULE_function_def);
		int _la;
		try {
			setState(1049);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1004);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(1003);
					template_decl_start();
					}
				}

				setState(1007);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(1006);
					return_type();
					}
					break;
				}
				setState(1016);
				_la = _input.LA(1);
				if (_la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(1009);
					pre_other();
					setState(1013);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
						{
						{
						setState(1010);
						expression_fragment();
						}
						}
						setState(1015);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1018);
				function_name();
				setState(1022);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1019);
					expression_fragment();
					}
					}
					setState(1024);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1025);
				function_param_list();
				setState(1027);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(1026);
					ctor_list();
					}
				}

				setState(1032);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1029);
					expression_fragment();
					}
					}
					setState(1034);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1035);
				compound_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1038);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(1037);
					return_type();
					}
					break;
				}
				setState(1040);
				macroCall_asFunctionHeader();
				setState(1044);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1041);
					expression_fragment();
					}
					}
					setState(1046);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1047);
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
		enterRule(_localctx, 138, RULE_macroCall_asFunctionHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
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
		enterRule(_localctx, 140, RULE_return_type);
		int _la;
		try {
			int _alt;
			setState(1086);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1062);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1053);
						function_decl_specifiers();
						setState(1057);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
							{
							{
							setState(1054);
							expression_fragment();
							}
							}
							setState(1059);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						} 
					}
					setState(1064);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				}
				setState(1065);
				type_name();
				}
				setState(1076);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13 || _la==T__14) {
					{
					{
					setState(1067);
					ptr_operator();
					setState(1071);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
						{
						{
						setState(1068);
						expression_fragment();
						}
						}
						setState(1073);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(1078);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1079);
				macroCall();
				setState(1083);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1080);
					expression_fragment();
					}
					}
					setState(1085);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
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
		enterRule(_localctx, 142, RULE_function_param_list);
		int _la;
		try {
			int _alt;
			setState(1183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1088);
				match(T__0);
				setState(1092);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1089);
						expression_fragment();
						}
						} 
					}
					setState(1094);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				}
				setState(1096);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(1095);
					parameter_decl_clause();
					}
					break;
				}
				setState(1101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1098);
					expression_fragment();
					}
					}
					setState(1103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1104);
				match(T__1);
				setState(1106);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(1105);
					match(T__14);
					}
				}

				setState(1117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CV_QUALIFIER) {
					{
					{
					setState(1108);
					match(CV_QUALIFIER);
					setState(1112);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1109);
							expression_fragment();
							}
							} 
						}
						setState(1114);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
					}
					}
					}
					setState(1119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1121);
				_la = _input.LA(1);
				if (_la==THROW) {
					{
					setState(1120);
					exception_specification();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1123);
				match(T__0);
				setState(1127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1124);
					expression_fragment();
					}
					}
					setState(1129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1130);
				parameter_name();
				setState(1141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(1131);
					match(T__12);
					setState(1135);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
						{
						{
						setState(1132);
						expression_fragment();
						}
						}
						setState(1137);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1138);
					parameter_name();
					}
					}
					setState(1143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1144);
					expression_fragment();
					}
					}
					setState(1149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1150);
				match(T__1);
				setState(1154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1151);
					expression_fragment();
					}
					}
					setState(1156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1157);
					type_name();
					setState(1158);
					parameter_id();
					setState(1169);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(1159);
						match(T__12);
						setState(1163);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
							{
							{
							setState(1160);
							expression_fragment();
							}
							}
							setState(1165);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1166);
						parameter_id();
						}
						}
						setState(1171);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1172);
					match(T__2);
					setState(1176);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1173);
							expression_fragment();
							}
							} 
						}
						setState(1178);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
					}
					}
					}
					setState(1181); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__19) | (1L << T__56) | (1L << T__57))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (STATIC - 81)) | (1L << (VOID - 81)) | (1L << (UNSIGNED - 81)) | (1L << (SIGNED - 81)) | (1L << (CV_QUALIFIER - 81)) | (1L << (EXTERN - 81)) | (1L << (VIRTUAL - 81)) | (1L << (TRY - 81)) | (1L << (CATCH - 81)) | (1L << (AUTO - 81)) | (1L << (REGISTER - 81)) | (1L << (SPECIAL_DATA - 81)) | (1L << (OPERATOR - 81)) | (1L << (CLASS_KEY - 81)) | (1L << (NEW - 81)) | (1L << (PRE_OTHER - 81)) | (1L << (PRE_PRAGMA_KEYWORDS - 81)) | (1L << (PRE_ATTRIBUTE - 81)) | (1L << (END_TEST - 81)) | (1L << (ALPHA_NUMERIC - 81)))) != 0) );
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
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
		enterRule(_localctx, 144, RULE_parameter_decl_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
				{
				{
				setState(1185);
				expression_fragment();
				}
				}
				setState(1190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1191);
			parameter_decl();
			setState(1208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1195);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
						{
						{
						setState(1192);
						expression_fragment();
						}
						}
						setState(1197);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1198);
					match(T__12);
					setState(1202);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
						{
						{
						setState(1199);
						expression_fragment();
						}
						}
						setState(1204);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1205);
					parameter_decl();
					}
					} 
				}
				setState(1210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			}
			}
			setState(1225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1211);
					expression_fragment();
					}
					}
					setState(1216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1217);
				match(T__12);
				setState(1221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1218);
					expression_fragment();
					}
					}
					setState(1223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1224);
				match(ELLIPSIS);
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
		enterRule(_localctx, 146, RULE_parameter_decl);
		try {
			setState(1231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1227);
				match(VOID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1228);
				type_name();
				setState(1229);
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
		enterRule(_localctx, 148, RULE_parameter_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1234);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__14) {
				{
				setState(1233);
				ptrs();
				}
			}

			setState(1241);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(1236);
				match(T__0);
				setState(1237);
				parameter_id();
				setState(1238);
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
				setState(1240);
				parameter_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1244);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__24) {
				{
				setState(1243);
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
		enterRule(_localctx, 150, RULE_compound_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1246);
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
		enterRule(_localctx, 152, RULE_ctor_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1249);
			match(T__3);
			setState(1250);
			ctor_initializer();
			setState(1255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(1251);
				match(T__12);
				setState(1252);
				ctor_initializer();
				}
				}
				setState(1257);
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
		enterRule(_localctx, 154, RULE_ctor_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1258);
			initializer_id();
			setState(1259);
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
		enterRule(_localctx, 156, RULE_initializer_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1262);
			_la = _input.LA(1);
			if (_la==T__55) {
				{
				setState(1261);
				match(T__55);
				}
			}

			setState(1264);
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
		enterRule(_localctx, 158, RULE_ctor_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
			match(T__0);
			setState(1268);
			_la = _input.LA(1);
			if (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (T__0 - 1)) | (1L << (T__4 - 1)) | (1L << (T__5 - 1)) | (1L << (T__6 - 1)) | (1L << (T__7 - 1)) | (1L << (T__8 - 1)) | (1L << (T__9 - 1)) | (1L << (T__10 - 1)) | (1L << (T__11 - 1)) | (1L << (T__13 - 1)) | (1L << (T__14 - 1)) | (1L << (T__15 - 1)) | (1L << (T__16 - 1)) | (1L << (T__17 - 1)) | (1L << (T__18 - 1)) | (1L << (T__19 - 1)) | (1L << (T__47 - 1)) | (1L << (T__48 - 1)) | (1L << (T__55 - 1)) | (1L << (T__56 - 1)) | (1L << (T__57 - 1)) | (1L << (T__60 - 1)) | (1L << (T__61 - 1)) | (1L << (T__63 - 1)))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (STATIC - 81)) | (1L << (VOID - 81)) | (1L << (UNSIGNED - 81)) | (1L << (SIGNED - 81)) | (1L << (CV_QUALIFIER - 81)) | (1L << (EXTERN - 81)) | (1L << (ASM - 81)) | (1L << (VIRTUAL - 81)) | (1L << (TRY - 81)) | (1L << (CATCH - 81)) | (1L << (AUTO - 81)) | (1L << (REGISTER - 81)) | (1L << (SPECIAL_DATA - 81)) | (1L << (OPERATOR - 81)) | (1L << (CLASS_KEY - 81)) | (1L << (NEW - 81)) | (1L << (PRE_OTHER - 81)) | (1L << (PRE_PRAGMA_KEYWORDS - 81)) | (1L << (PRE_ATTRIBUTE - 81)) | (1L << (END_TEST - 81)) | (1L << (ALPHA_NUMERIC - 81)) | (1L << (OPENING_CURLY - 81)) | (1L << (HEX_LITERAL - 81)) | (1L << (DECIMAL_LITERAL - 81)) | (1L << (OCTAL_LITERAL - 81)) | (1L << (HEX_FLOAT - 81)) | (1L << (FLOATING_POINT_LITERAL - 81)) | (1L << (CHAR - 81)) | (1L << (STRING - 81)))) != 0)) {
				{
				setState(1267);
				expr();
				}
			}

			setState(1270);
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
		enterRule(_localctx, 160, RULE_function_name);
		try {
			setState(1279);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case NEW:
			case PRE_PRAGMA_KEYWORDS:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1272);
				identifier();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(1273);
				match(T__0);
				setState(1274);
				function_name();
				setState(1275);
				match(T__1);
				}
				break;
			case OPERATOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1277);
				match(OPERATOR);
				setState(1278);
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
		enterRule(_localctx, 162, RULE_exception_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1281);
			match(THROW);
			setState(1282);
			match(T__0);
			setState(1283);
			type_id_list();
			setState(1284);
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
		enterRule(_localctx, 164, RULE_type_id_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (T__2 - 3)) | (1L << (T__3 - 3)) | (1L << (T__4 - 3)) | (1L << (T__5 - 3)) | (1L << (T__6 - 3)) | (1L << (T__7 - 3)) | (1L << (T__8 - 3)) | (1L << (T__9 - 3)) | (1L << (T__10 - 3)) | (1L << (T__11 - 3)) | (1L << (T__12 - 3)) | (1L << (T__13 - 3)) | (1L << (T__14 - 3)) | (1L << (T__15 - 3)) | (1L << (T__16 - 3)) | (1L << (T__17 - 3)) | (1L << (T__18 - 3)) | (1L << (T__19 - 3)) | (1L << (T__20 - 3)) | (1L << (T__21 - 3)) | (1L << (T__22 - 3)) | (1L << (T__23 - 3)) | (1L << (T__24 - 3)) | (1L << (T__25 - 3)) | (1L << (T__26 - 3)) | (1L << (T__27 - 3)) | (1L << (T__28 - 3)) | (1L << (T__29 - 3)) | (1L << (T__30 - 3)) | (1L << (T__31 - 3)) | (1L << (T__32 - 3)) | (1L << (T__33 - 3)) | (1L << (T__34 - 3)) | (1L << (T__35 - 3)) | (1L << (T__36 - 3)) | (1L << (T__37 - 3)) | (1L << (T__38 - 3)) | (1L << (T__39 - 3)) | (1L << (T__40 - 3)) | (1L << (T__41 - 3)) | (1L << (T__42 - 3)) | (1L << (T__43 - 3)) | (1L << (T__44 - 3)) | (1L << (T__45 - 3)) | (1L << (T__46 - 3)) | (1L << (T__47 - 3)) | (1L << (T__48 - 3)) | (1L << (T__49 - 3)) | (1L << (T__50 - 3)) | (1L << (T__51 - 3)) | (1L << (T__52 - 3)) | (1L << (T__53 - 3)) | (1L << (T__54 - 3)) | (1L << (T__55 - 3)) | (1L << (T__56 - 3)) | (1L << (T__57 - 3)) | (1L << (T__58 - 3)) | (1L << (T__59 - 3)) | (1L << (T__60 - 3)) | (1L << (T__61 - 3)) | (1L << (T__62 - 3)) | (1L << (T__63 - 3)) | (1L << (ESCAPED_NEWLINE - 3)) | (1L << (NEWLINE - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ESCAPE - 67)) | (1L << (ELLIPSIS - 67)) | (1L << (IF - 67)) | (1L << (ELSE - 67)) | (1L << (FOR - 67)) | (1L << (WHILE - 67)) | (1L << (BREAK - 67)) | (1L << (CASE - 67)) | (1L << (CONTINUE - 67)) | (1L << (SWITCH - 67)) | (1L << (DO - 67)) | (1L << (GOTO - 67)) | (1L << (RETURN - 67)) | (1L << (TYPEDEF - 67)) | (1L << (STATIC - 67)) | (1L << (VOID - 67)) | (1L << (UNSIGNED - 67)) | (1L << (SIGNED - 67)) | (1L << (CV_QUALIFIER - 67)) | (1L << (EXTERN - 67)) | (1L << (ASM - 67)) | (1L << (VIRTUAL - 67)) | (1L << (TRY - 67)) | (1L << (CATCH - 67)) | (1L << (THROW - 67)) | (1L << (USING - 67)) | (1L << (NAMESPACE - 67)) | (1L << (AUTO - 67)) | (1L << (REGISTER - 67)) | (1L << (SPECIAL_DATA - 67)) | (1L << (OPERATOR - 67)) | (1L << (TEMPLATE - 67)) | (1L << (CLASS_KEY - 67)) | (1L << (NEW - 67)) | (1L << (PRE_IF - 67)) | (1L << (PRE_ELIF - 67)) | (1L << (PRE_ELSE - 67)) | (1L << (PRE_ENDIF - 67)) | (1L << (PRE_DEFINE - 67)) | (1L << (PRE_UNDEF - 67)) | (1L << (PRE_DIAGNOSTIC - 67)) | (1L << (PRE_OTHER - 67)) | (1L << (PRE_INCLUDE - 67)) | (1L << (PRE_INCLUDE_NEXT - 67)) | (1L << (PRE_LINE - 67)) | (1L << (PRE_PRAGMA - 67)) | (1L << (PRE_GCC - 67)) | (1L << (PRE_PRAGMA_KEYWORDS - 67)) | (1L << (PRE_STR - 67)) | (1L << (PRE_ATTRIBUTE - 67)) | (1L << (END_TEST - 67)) | (1L << (ALPHA_NUMERIC - 67)) | (1L << (OPENING_CURLY - 67)) | (1L << (CLOSING_CURLY - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (OCTAL_LITERAL - 67)) | (1L << (HEX_FLOAT - 67)) | (1L << (FLOATING_POINT_LITERAL - 67)) | (1L << (COMMENT - 67)) | (1L << (CHAR - 67)) | (1L << (STRING - 67)) | (1L << (WHITESPACE - 67)) | (1L << (OTHER - 67)))) != 0)) {
				{
				{
				setState(1286);
				no_brackets();
				}
				}
				setState(1291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(1292);
				match(T__0);
				setState(1293);
				type_id_list();
				setState(1294);
				match(T__1);
				setState(1298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (T__2 - 3)) | (1L << (T__3 - 3)) | (1L << (T__4 - 3)) | (1L << (T__5 - 3)) | (1L << (T__6 - 3)) | (1L << (T__7 - 3)) | (1L << (T__8 - 3)) | (1L << (T__9 - 3)) | (1L << (T__10 - 3)) | (1L << (T__11 - 3)) | (1L << (T__12 - 3)) | (1L << (T__13 - 3)) | (1L << (T__14 - 3)) | (1L << (T__15 - 3)) | (1L << (T__16 - 3)) | (1L << (T__17 - 3)) | (1L << (T__18 - 3)) | (1L << (T__19 - 3)) | (1L << (T__20 - 3)) | (1L << (T__21 - 3)) | (1L << (T__22 - 3)) | (1L << (T__23 - 3)) | (1L << (T__24 - 3)) | (1L << (T__25 - 3)) | (1L << (T__26 - 3)) | (1L << (T__27 - 3)) | (1L << (T__28 - 3)) | (1L << (T__29 - 3)) | (1L << (T__30 - 3)) | (1L << (T__31 - 3)) | (1L << (T__32 - 3)) | (1L << (T__33 - 3)) | (1L << (T__34 - 3)) | (1L << (T__35 - 3)) | (1L << (T__36 - 3)) | (1L << (T__37 - 3)) | (1L << (T__38 - 3)) | (1L << (T__39 - 3)) | (1L << (T__40 - 3)) | (1L << (T__41 - 3)) | (1L << (T__42 - 3)) | (1L << (T__43 - 3)) | (1L << (T__44 - 3)) | (1L << (T__45 - 3)) | (1L << (T__46 - 3)) | (1L << (T__47 - 3)) | (1L << (T__48 - 3)) | (1L << (T__49 - 3)) | (1L << (T__50 - 3)) | (1L << (T__51 - 3)) | (1L << (T__52 - 3)) | (1L << (T__53 - 3)) | (1L << (T__54 - 3)) | (1L << (T__55 - 3)) | (1L << (T__56 - 3)) | (1L << (T__57 - 3)) | (1L << (T__58 - 3)) | (1L << (T__59 - 3)) | (1L << (T__60 - 3)) | (1L << (T__61 - 3)) | (1L << (T__62 - 3)) | (1L << (T__63 - 3)) | (1L << (ESCAPED_NEWLINE - 3)) | (1L << (NEWLINE - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ESCAPE - 67)) | (1L << (ELLIPSIS - 67)) | (1L << (IF - 67)) | (1L << (ELSE - 67)) | (1L << (FOR - 67)) | (1L << (WHILE - 67)) | (1L << (BREAK - 67)) | (1L << (CASE - 67)) | (1L << (CONTINUE - 67)) | (1L << (SWITCH - 67)) | (1L << (DO - 67)) | (1L << (GOTO - 67)) | (1L << (RETURN - 67)) | (1L << (TYPEDEF - 67)) | (1L << (STATIC - 67)) | (1L << (VOID - 67)) | (1L << (UNSIGNED - 67)) | (1L << (SIGNED - 67)) | (1L << (CV_QUALIFIER - 67)) | (1L << (EXTERN - 67)) | (1L << (ASM - 67)) | (1L << (VIRTUAL - 67)) | (1L << (TRY - 67)) | (1L << (CATCH - 67)) | (1L << (THROW - 67)) | (1L << (USING - 67)) | (1L << (NAMESPACE - 67)) | (1L << (AUTO - 67)) | (1L << (REGISTER - 67)) | (1L << (SPECIAL_DATA - 67)) | (1L << (OPERATOR - 67)) | (1L << (TEMPLATE - 67)) | (1L << (CLASS_KEY - 67)) | (1L << (NEW - 67)) | (1L << (PRE_IF - 67)) | (1L << (PRE_ELIF - 67)) | (1L << (PRE_ELSE - 67)) | (1L << (PRE_ENDIF - 67)) | (1L << (PRE_DEFINE - 67)) | (1L << (PRE_UNDEF - 67)) | (1L << (PRE_DIAGNOSTIC - 67)) | (1L << (PRE_OTHER - 67)) | (1L << (PRE_INCLUDE - 67)) | (1L << (PRE_INCLUDE_NEXT - 67)) | (1L << (PRE_LINE - 67)) | (1L << (PRE_PRAGMA - 67)) | (1L << (PRE_GCC - 67)) | (1L << (PRE_PRAGMA_KEYWORDS - 67)) | (1L << (PRE_STR - 67)) | (1L << (PRE_ATTRIBUTE - 67)) | (1L << (END_TEST - 67)) | (1L << (ALPHA_NUMERIC - 67)) | (1L << (OPENING_CURLY - 67)) | (1L << (CLOSING_CURLY - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (OCTAL_LITERAL - 67)) | (1L << (HEX_FLOAT - 67)) | (1L << (FLOATING_POINT_LITERAL - 67)) | (1L << (COMMENT - 67)) | (1L << (CHAR - 67)) | (1L << (STRING - 67)) | (1L << (WHITESPACE - 67)) | (1L << (OTHER - 67)))) != 0)) {
					{
					{
					setState(1295);
					no_brackets();
					}
					}
					setState(1300);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(1305);
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
		enterRule(_localctx, 166, RULE_simple_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1306);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public Pre_otherContext pre_other() {
			return getRuleContext(Pre_otherContext.class,0);
		}
		public MacroCallContext macroCall() {
			return getRuleContext(MacroCallContext.class,0);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
		}
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
		}
		public CallingConventionContext callingConvention() {
			return getRuleContext(CallingConventionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public List<TerminalNode> CV_QUALIFIER() { return getTokens(FunctionParser.CV_QUALIFIER); }
		public TerminalNode CV_QUALIFIER(int i) {
			return getToken(FunctionParser.CV_QUALIFIER, i);
		}
		public List<Function_decl_specifiersContext> function_decl_specifiers() {
			return getRuleContexts(Function_decl_specifiersContext.class);
		}
		public Function_decl_specifiersContext function_decl_specifiers(int i) {
			return getRuleContext(Function_decl_specifiersContext.class,i);
		}
		public List<TerminalNode> TYPEDEF() { return getTokens(FunctionParser.TYPEDEF); }
		public TerminalNode TYPEDEF(int i) {
			return getToken(FunctionParser.TYPEDEF, i);
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
		enterRule(_localctx, 168, RULE_var_decl);
		int _la;
		try {
			int _alt;
			setState(1457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				_localctx = new DeclByClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1309);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(1308);
					template_decl_start();
					}
				}

				setState(1311);
				class_def();
				setState(1315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1312);
						expression_fragment();
						}
						} 
					}
					setState(1317);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
				}
				setState(1319);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(1318);
					init_declarator_list();
					}
					break;
				}
				setState(1323);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
				case 1:
					{
					setState(1321);
					pre_other();
					}
					break;
				case 2:
					{
					setState(1322);
					macroCall();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new DeclByTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1332);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(1325);
					match(TYPEDEF);
					setState(1329);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
						{
						{
						setState(1326);
						expression_fragment();
						}
						}
						setState(1331);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1341);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(1334);
					template_decl_start();
					setState(1338);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
						{
						{
						setState(1335);
						expression_fragment();
						}
						}
						setState(1340);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1343);
				type_name();
				setState(1347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1344);
					expression_fragment();
					}
					}
					setState(1349);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1350);
				init_declarator_list();
				}
				break;
			case 3:
				_localctx = new FunctionPointerDeclareContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1359);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(1352);
					match(TYPEDEF);
					setState(1356);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
						{
						{
						setState(1353);
						expression_fragment();
						}
						}
						setState(1358);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1361);
				type_name();
				setState(1365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1362);
						expression_fragment();
						}
						} 
					}
					setState(1367);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
				}
				setState(1369);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1368);
					match(T__0);
					}
				}

				setState(1374);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1371);
						expression_fragment();
						}
						} 
					}
					setState(1376);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				}
				setState(1378);
				_la = _input.LA(1);
				if (_la==ALPHA_NUMERIC) {
					{
					setState(1377);
					callingConvention();
					}
				}

				setState(1383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1380);
					expression_fragment();
					}
					}
					setState(1385);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1386);
				ptr_operator();
				setState(1388);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1387);
					match(T__0);
					}
				}

				setState(1393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1390);
					expression_fragment();
					}
					}
					setState(1395);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1397);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (NEW - 100)) | (1L << (PRE_PRAGMA_KEYWORDS - 100)) | (1L << (ALPHA_NUMERIC - 100)))) != 0)) {
					{
					setState(1396);
					identifier();
					}
				}

				setState(1399);
				match(T__1);
				setState(1403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1400);
					expression_fragment();
					}
					}
					setState(1405);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1406);
				param_type_list();
				setState(1410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1407);
					expression_fragment();
					}
					}
					setState(1412);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1415);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1413);
					pre_other();
					}
					break;
				case 2:
					{
					setState(1414);
					macroCall();
					}
					break;
				}
				setState(1425);
				_la = _input.LA(1);
				if (_la==T__30) {
					{
					setState(1417);
					match(T__30);
					setState(1421);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1418);
							expression_fragment();
							}
							} 
						}
						setState(1423);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
					}
					setState(1424);
					argument();
					}
				}

				setState(1427);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new StructUnionEnumContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1442);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (TYPEDEF - 80)) | (1L << (STATIC - 80)) | (1L << (CV_QUALIFIER - 80)) | (1L << (VIRTUAL - 80)))) != 0)) {
					{
					setState(1432); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						setState(1432);
						switch (_input.LA(1)) {
						case CV_QUALIFIER:
							{
							setState(1429);
							match(CV_QUALIFIER);
							}
							break;
						case T__5:
						case T__6:
						case T__7:
						case STATIC:
						case VIRTUAL:
							{
							setState(1430);
							function_decl_specifiers();
							}
							break;
						case TYPEDEF:
							{
							setState(1431);
							match(TYPEDEF);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						setState(1434); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (TYPEDEF - 80)) | (1L << (STATIC - 80)) | (1L << (CV_QUALIFIER - 80)) | (1L << (VIRTUAL - 80)))) != 0) );
					setState(1439);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
						{
						{
						setState(1436);
						expression_fragment();
						}
						}
						setState(1441);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1444);
				special_datatype();
				setState(1448);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1445);
						expression_fragment();
						}
						} 
					}
					setState(1450);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
				}
				setState(1452);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1451);
					init_declarator_list();
					}
					break;
				}
				setState(1455);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
				case 1:
					{
					setState(1454);
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
		enterRule(_localctx, 170, RULE_callingConvention);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1460); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1459);
				match(ALPHA_NUMERIC);
				}
				}
				setState(1462); 
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
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
		enterRule(_localctx, 172, RULE_special_datatype);
		int _la;
		try {
			setState(1526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1464);
				match(SPECIAL_DATA);
				setState(1468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1465);
					expression_fragment();
					}
					}
					setState(1470);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1472);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1471);
					pre_other();
					}
					break;
				}
				setState(1481);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (NEW - 100)) | (1L << (PRE_PRAGMA_KEYWORDS - 100)) | (1L << (ALPHA_NUMERIC - 100)))) != 0)) {
					{
					setState(1474);
					identifier();
					setState(1478);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
						{
						{
						setState(1475);
						expression_fragment();
						}
						}
						setState(1480);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1484);
				_la = _input.LA(1);
				if (_la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(1483);
					pre_other();
					}
				}

				setState(1486);
				match(OPENING_CURLY);
				skipToEndOfObject(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1488);
				match(SPECIAL_DATA);
				setState(1492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1489);
					expression_fragment();
					}
					}
					setState(1494);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1496);
				_la = _input.LA(1);
				if (_la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(1495);
					pre_other();
					}
				}

				setState(1498);
				identifier();
				setState(1502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1499);
					expression_fragment();
					}
					}
					setState(1504);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1506);
				_la = _input.LA(1);
				if (_la==T__13 || _la==T__14) {
					{
					setState(1505);
					ptrs();
					}
				}

				setState(1508);
				identifier();
				setState(1510);
				_la = _input.LA(1);
				if (_la==T__13 || _la==T__14) {
					{
					setState(1509);
					ptrs();
					}
				}

				setState(1512);
				match(T__30);
				skipToEndOfObject(); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1515);
				match(SPECIAL_DATA);
				setState(1519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1516);
					expression_fragment();
					}
					}
					setState(1521);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1523);
				_la = _input.LA(1);
				if (_la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(1522);
					pre_other();
					}
				}

				setState(1525);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
		}
		public Pre_otherContext pre_other() {
			return getRuleContext(Pre_otherContext.class,0);
		}
		public MacroCallContext macroCall() {
			return getRuleContext(MacroCallContext.class,0);
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
		enterRule(_localctx, 174, RULE_init_declarator_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1528);
			init_declarator();
			setState(1545);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1532);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
						{
						{
						setState(1529);
						expression_fragment();
						}
						}
						setState(1534);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1535);
					match(T__12);
					setState(1539);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
						{
						{
						setState(1536);
						expression_fragment();
						}
						}
						setState(1541);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1542);
					init_declarator();
					}
					} 
				}
				setState(1547);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
			}
			setState(1551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
				{
				{
				setState(1548);
				expression_fragment();
				}
				}
				setState(1553);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1554);
				pre_other();
				}
				break;
			case 2:
				{
				setState(1555);
				macroCall();
				}
				break;
			}
			setState(1558);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
		}
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
		enterRule(_localctx, 176, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1560);
			match(CLASS_KEY);
			setState(1564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
				{
				{
				setState(1561);
				expression_fragment();
				}
				}
				setState(1566);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1568);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (NEW - 100)) | (1L << (PRE_PRAGMA_KEYWORDS - 100)) | (1L << (ALPHA_NUMERIC - 100)))) != 0)) {
				{
				setState(1567);
				class_name();
				}
			}

			setState(1571);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(1570);
				base_classes();
				}
			}

			setState(1573);
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
		enterRule(_localctx, 178, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1576);
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
		enterRule(_localctx, 180, RULE_base_classes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1578);
			match(T__3);
			setState(1579);
			base_class();
			setState(1584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(1580);
				match(T__12);
				setState(1581);
				base_class();
				}
				}
				setState(1586);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
		}
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
		enterRule(_localctx, 182, RULE_base_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1594);
			_la = _input.LA(1);
			if (_la==VIRTUAL) {
				{
				setState(1587);
				match(VIRTUAL);
				setState(1591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1588);
					expression_fragment();
					}
					}
					setState(1593);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(1596);
				access_specifier();
				}
				break;
			}
			setState(1599);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
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
		enterRule(_localctx, 184, RULE_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1670); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1670);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
					case 1:
						{
						setState(1601);
						match(EXTERN);
						setState(1605);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1602);
								expression_fragment();
								}
								} 
							}
							setState(1607);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
						}
						}
						break;
					case 2:
						{
						setState(1608);
						function_decl_specifiers();
						}
						break;
					case 3:
						{
						setState(1609);
						match(CV_QUALIFIER);
						setState(1613);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1610);
								expression_fragment();
								}
								} 
							}
							setState(1615);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
						}
						}
						break;
					case 4:
						{
						setState(1616);
						match(UNSIGNED);
						setState(1620);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1617);
								expression_fragment();
								}
								} 
							}
							setState(1622);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
						}
						}
						break;
					case 5:
						{
						setState(1623);
						match(SIGNED);
						setState(1627);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1624);
								expression_fragment();
								}
								} 
							}
							setState(1629);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
						}
						}
						break;
					case 6:
						{
						setState(1630);
						match(AUTO);
						setState(1634);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1631);
								expression_fragment();
								}
								} 
							}
							setState(1636);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
						}
						}
						break;
					case 7:
						{
						setState(1637);
						match(REGISTER);
						setState(1641);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1638);
								expression_fragment();
								}
								} 
							}
							setState(1643);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
						}
						}
						break;
					case 8:
						{
						setState(1644);
						ptr_operator();
						setState(1648);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1645);
								expression_fragment();
								}
								} 
							}
							setState(1650);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
						}
						}
						break;
					case 9:
						{
						setState(1651);
						base_type();
						}
						break;
					case 10:
						{
						{
						{
						setState(1652);
						match(T__19);
						setState(1653);
						template_param_list();
						setState(1654);
						match(T__20);
						}
						setState(1666);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1656);
								match(T__55);
								setState(1657);
								base_type();
								setState(1662);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
								case 1:
									{
									setState(1658);
									match(T__19);
									setState(1659);
									template_param_list();
									setState(1660);
									match(T__20);
									}
									break;
								}
								}
								} 
							}
							setState(1668);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
						}
						}
						}
						break;
					case 11:
						{
						setState(1669);
						macroCall();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1672); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
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
		enterRule(_localctx, 186, RULE_base_type);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1723); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1723);
					switch (_input.LA(1)) {
					case VOID:
						{
						setState(1674);
						match(VOID);
						setState(1678);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1675);
								expression_fragment();
								}
								} 
							}
							setState(1680);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
						}
						}
						break;
					case T__11:
						{
						setState(1681);
						match(T__11);
						setState(1685);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1682);
								expression_fragment();
								}
								} 
							}
							setState(1687);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
						}
						}
						break;
					case T__56:
						{
						setState(1688);
						match(T__56);
						setState(1692);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1689);
								expression_fragment();
								}
								} 
							}
							setState(1694);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
						}
						}
						break;
					case T__57:
						{
						setState(1695);
						match(T__57);
						setState(1699);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1696);
								expression_fragment();
								}
								} 
							}
							setState(1701);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
						}
						}
						break;
					case SPECIAL_DATA:
						{
						setState(1702);
						match(SPECIAL_DATA);
						setState(1706);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1703);
								expression_fragment();
								}
								} 
							}
							setState(1708);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
						}
						}
						break;
					case CLASS_KEY:
						{
						setState(1709);
						match(CLASS_KEY);
						setState(1713);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1710);
								expression_fragment();
								}
								} 
							}
							setState(1715);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
						}
						}
						break;
					case ALPHA_NUMERIC:
						{
						setState(1716);
						match(ALPHA_NUMERIC);
						setState(1720);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1717);
								expression_fragment();
								}
								} 
							}
							setState(1722);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
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
				setState(1725); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
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
		enterRule(_localctx, 188, RULE_parameter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1727);
			identifier();
			setState(1729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				{
				setState(1728);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterParam_type_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitParam_type_list(this);
		}
	}

	public final Param_type_listContext param_type_list() throws RecognitionException {
		Param_type_listContext _localctx = new Param_type_listContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_param_type_list);
		int _la;
		try {
			int _alt;
			setState(1782);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1731);
				match(T__0);
				setState(1735);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1732);
					expression_fragment();
					}
					}
					setState(1737);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1738);
				match(VOID);
				setState(1742);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1739);
					expression_fragment();
					}
					}
					setState(1744);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1745);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1746);
				match(T__0);
				setState(1750);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1747);
						expression_fragment();
						}
						} 
					}
					setState(1752);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
				}
				setState(1773);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__19) | (1L << T__56) | (1L << T__57))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (ELLIPSIS - 68)) | (1L << (STATIC - 68)) | (1L << (VOID - 68)) | (1L << (UNSIGNED - 68)) | (1L << (SIGNED - 68)) | (1L << (CV_QUALIFIER - 68)) | (1L << (EXTERN - 68)) | (1L << (VIRTUAL - 68)) | (1L << (TRY - 68)) | (1L << (CATCH - 68)) | (1L << (AUTO - 68)) | (1L << (REGISTER - 68)) | (1L << (SPECIAL_DATA - 68)) | (1L << (OPERATOR - 68)) | (1L << (CLASS_KEY - 68)) | (1L << (NEW - 68)) | (1L << (PRE_OTHER - 68)) | (1L << (PRE_PRAGMA_KEYWORDS - 68)) | (1L << (PRE_ATTRIBUTE - 68)) | (1L << (END_TEST - 68)) | (1L << (ALPHA_NUMERIC - 68)))) != 0)) {
					{
					setState(1753);
					param_type();
					setState(1770);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1757);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
								{
								{
								setState(1754);
								expression_fragment();
								}
								}
								setState(1759);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(1760);
							match(T__12);
							setState(1764);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
								{
								{
								setState(1761);
								expression_fragment();
								}
								}
								setState(1766);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(1767);
							param_type();
							}
							} 
						}
						setState(1772);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
					}
					}
				}

				setState(1778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1775);
					expression_fragment();
					}
					}
					setState(1780);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1781);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
		}
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
		enterRule(_localctx, 192, RULE_param_type);
		try {
			int _alt;
			setState(1794);
			switch (_input.LA(1)) {
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
			case T__19:
			case T__56:
			case T__57:
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
			case PRE_OTHER:
			case PRE_PRAGMA_KEYWORDS:
			case PRE_ATTRIBUTE:
			case END_TEST:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1784);
				type_name();
				setState(1788);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1785);
						expression_fragment();
						}
						} 
					}
					setState(1790);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
				}
				setState(1791);
				param_type_id();
				}
				break;
			case ELLIPSIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1793);
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
		enterRule(_localctx, 194, RULE_param_type_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1797);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__14) {
				{
				setState(1796);
				ptrs();
				}
			}

			setState(1806);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				{
				setState(1799);
				match(T__0);
				setState(1800);
				param_type_id();
				setState(1801);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(1804);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (NEW - 100)) | (1L << (PRE_PRAGMA_KEYWORDS - 100)) | (1L << (ALPHA_NUMERIC - 100)))) != 0)) {
					{
					setState(1803);
					parameter_name();
					}
				}

				}
				break;
			}
			setState(1809);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__24) {
				{
				setState(1808);
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
		enterRule(_localctx, 196, RULE_identifier);
		try {
			int _alt;
			setState(1822);
			switch (_input.LA(1)) {
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1811);
				match(ALPHA_NUMERIC);
				setState(1816);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1812);
						match(T__55);
						setState(1813);
						match(ALPHA_NUMERIC);
						}
						} 
					}
					setState(1818);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
				}
				}
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(1819);
				match(NEW);
				}
				break;
			case PRE_PRAGMA_KEYWORDS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1820);
				match(PRE_PRAGMA_KEYWORDS);
				}
				break;
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(1821);
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
		public TerminalNode HEX_FLOAT() { return getToken(FunctionParser.HEX_FLOAT, 0); }
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
		enterRule(_localctx, 198, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1824);
			_la = _input.LA(1);
			if ( !(((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (HEX_LITERAL - 121)) | (1L << (DECIMAL_LITERAL - 121)) | (1L << (OCTAL_LITERAL - 121)) | (1L << (HEX_FLOAT - 121)))) != 0)) ) {
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
		enterRule(_localctx, 200, RULE_ptrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1830); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1826);
				ptr_operator();
				setState(1828);
				_la = _input.LA(1);
				if (_la==T__58) {
					{
					setState(1827);
					match(T__58);
					}
				}

				}
				}
				setState(1832); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__13 || _la==T__14 );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 202, RULE_func_ptrs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1834);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
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
		enterRule(_localctx, 204, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1836);
			assign_expr();
			setState(1851);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				{
				setState(1840);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1837);
					expression_fragment();
					}
					}
					setState(1842);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1843);
				match(T__12);
				setState(1847);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1844);
					expression_fragment();
					}
					}
					setState(1849);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1850);
				expr();
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
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
		enterRule(_localctx, 206, RULE_assign_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1853);
			conditional_expression();
			setState(1869);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				{
				setState(1857);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1854);
					expression_fragment();
					}
					}
					setState(1859);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1860);
				assignment_operator();
				setState(1864);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1861);
					expression_fragment();
					}
					}
					setState(1866);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1867);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
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
		enterRule(_localctx, 208, RULE_conditional_expression);
		int _la;
		try {
			setState(1902);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				_localctx = new NormOrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1871);
				or_expression();
				}
				break;
			case 2:
				_localctx = new CndExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1872);
				or_expression();
				{
				setState(1876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1873);
					expression_fragment();
					}
					}
					setState(1878);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1879);
				match(T__59);
				setState(1883);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1880);
					expression_fragment();
					}
					}
					setState(1885);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1886);
				expr();
				setState(1890);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1887);
					expression_fragment();
					}
					}
					setState(1892);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1893);
				match(T__3);
				setState(1897);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1894);
					expression_fragment();
					}
					}
					setState(1899);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1900);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
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
		enterRule(_localctx, 210, RULE_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1904);
			and_expression();
			setState(1919);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				{
				setState(1908);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1905);
					expression_fragment();
					}
					}
					setState(1910);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1911);
				match(T__46);
				setState(1915);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1912);
					expression_fragment();
					}
					}
					setState(1917);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1918);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
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
		enterRule(_localctx, 212, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1921);
			inclusive_or_expression();
			setState(1936);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				{
				setState(1925);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1922);
					expression_fragment();
					}
					}
					setState(1927);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1928);
				match(T__45);
				setState(1932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1929);
					expression_fragment();
					}
					}
					setState(1934);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1935);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
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
		enterRule(_localctx, 214, RULE_inclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1938);
			exclusive_or_expression();
			setState(1953);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
			case 1:
				{
				setState(1942);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1939);
					expression_fragment();
					}
					}
					setState(1944);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1945);
				match(T__29);
				setState(1949);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1946);
					expression_fragment();
					}
					}
					setState(1951);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1952);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
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
		enterRule(_localctx, 216, RULE_exclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1955);
			bit_and_expression();
			setState(1970);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				{
				setState(1959);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1956);
					expression_fragment();
					}
					}
					setState(1961);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1962);
				match(T__28);
				setState(1966);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1963);
					expression_fragment();
					}
					}
					setState(1968);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1969);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
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
		enterRule(_localctx, 218, RULE_bit_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1972);
			equality_expression();
			setState(1987);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				{
				setState(1976);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1973);
					expression_fragment();
					}
					}
					setState(1978);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1979);
				match(T__13);
				setState(1983);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1980);
					expression_fragment();
					}
					}
					setState(1985);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1986);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
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
		enterRule(_localctx, 220, RULE_equality_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1989);
			relational_expression();
			setState(2005);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				{
				setState(1993);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1990);
					expression_fragment();
					}
					}
					setState(1995);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1996);
				equality_operator();
				setState(2000);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(1997);
					expression_fragment();
					}
					}
					setState(2002);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2003);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
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
		enterRule(_localctx, 222, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2007);
			shift_expression();
			setState(2023);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				{
				setState(2011);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(2008);
					expression_fragment();
					}
					}
					setState(2013);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2014);
				relational_operator();
				setState(2018);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(2015);
					expression_fragment();
					}
					}
					setState(2020);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2021);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
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
		enterRule(_localctx, 224, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2025);
			additive_expression();
			setState(2040);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				{
				setState(2029);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(2026);
					expression_fragment();
					}
					}
					setState(2031);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2032);
				_la = _input.LA(1);
				if ( !(_la==T__39 || _la==T__40) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2036);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(2033);
					expression_fragment();
					}
					}
					setState(2038);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2039);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
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
		enterRule(_localctx, 226, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2042);
			multiplicative_expression();
			setState(2057);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				{
				setState(2046);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(2043);
					expression_fragment();
					}
					}
					setState(2048);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2049);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2053);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(2050);
					expression_fragment();
					}
					}
					setState(2055);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2056);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
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
		enterRule(_localctx, 228, RULE_multiplicative_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2059);
			function_pointer_use_expression();
			setState(2074);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				{
				setState(2063);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(2060);
					expression_fragment();
					}
					}
					setState(2065);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2066);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__26) | (1L << T__27))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2070);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(2067);
					expression_fragment();
					}
					}
					setState(2072);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2073);
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
		enterRule(_localctx, 230, RULE_function_pointer_use_expression);
		int _la;
		try {
			setState(2089);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2076);
				match(T__0);
				setState(2077);
				ptr_operator();
				setState(2079);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (NEW - 100)) | (1L << (PRE_PRAGMA_KEYWORDS - 100)) | (1L << (ALPHA_NUMERIC - 100)))) != 0)) {
					{
					setState(2078);
					identifier();
					}
				}

				setState(2081);
				match(T__1);
				setState(2082);
				match(T__0);
				setState(2084);
				_la = _input.LA(1);
				if (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (T__0 - 1)) | (1L << (T__4 - 1)) | (1L << (T__5 - 1)) | (1L << (T__6 - 1)) | (1L << (T__7 - 1)) | (1L << (T__8 - 1)) | (1L << (T__9 - 1)) | (1L << (T__10 - 1)) | (1L << (T__11 - 1)) | (1L << (T__13 - 1)) | (1L << (T__14 - 1)) | (1L << (T__15 - 1)) | (1L << (T__16 - 1)) | (1L << (T__17 - 1)) | (1L << (T__18 - 1)) | (1L << (T__19 - 1)) | (1L << (T__47 - 1)) | (1L << (T__48 - 1)) | (1L << (T__55 - 1)) | (1L << (T__56 - 1)) | (1L << (T__57 - 1)) | (1L << (T__60 - 1)) | (1L << (T__61 - 1)) | (1L << (T__63 - 1)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (STATIC - 66)) | (1L << (VOID - 66)) | (1L << (UNSIGNED - 66)) | (1L << (SIGNED - 66)) | (1L << (CV_QUALIFIER - 66)) | (1L << (EXTERN - 66)) | (1L << (ASM - 66)) | (1L << (VIRTUAL - 66)) | (1L << (TRY - 66)) | (1L << (CATCH - 66)) | (1L << (AUTO - 66)) | (1L << (REGISTER - 66)) | (1L << (SPECIAL_DATA - 66)) | (1L << (OPERATOR - 66)) | (1L << (CLASS_KEY - 66)) | (1L << (NEW - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (PRE_OTHER - 66)) | (1L << (PRE_PRAGMA_KEYWORDS - 66)) | (1L << (PRE_ATTRIBUTE - 66)) | (1L << (END_TEST - 66)) | (1L << (ALPHA_NUMERIC - 66)) | (1L << (OPENING_CURLY - 66)) | (1L << (HEX_LITERAL - 66)) | (1L << (DECIMAL_LITERAL - 66)) | (1L << (OCTAL_LITERAL - 66)) | (1L << (HEX_FLOAT - 66)) | (1L << (FLOATING_POINT_LITERAL - 66)) | (1L << (COMMENT - 66)) | (1L << (CHAR - 66)) | (1L << (STRING - 66)))) != 0)) {
					{
					setState(2083);
					argument_list();
					}
				}

				setState(2086);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2088);
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
		enterRule(_localctx, 232, RULE_cast_expression);
		try {
			setState(2097);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2091);
				match(T__0);
				setState(2092);
				cast_target();
				setState(2093);
				match(T__1);
				setState(2094);
				cast_expression();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2096);
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
		enterRule(_localctx, 234, RULE_cast_target);
		try {
			setState(2103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2099);
				type_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2100);
				type_name();
				setState(2101);
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
		enterRule(_localctx, 236, RULE_unary_expression);
		try {
			setState(2113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2105);
				address_of_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2106);
				unary_op_and_cast_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2107);
				sizeof_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2108);
				new_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2109);
				postfix_expression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2110);
				defined_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2111);
				macroCall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2112);
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
		enterRule(_localctx, 238, RULE_address_of_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2115);
			match(T__13);
			setState(2116);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
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
		enterRule(_localctx, 240, RULE_new_expression);
		int _la;
		try {
			setState(2164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2119);
				_la = _input.LA(1);
				if (_la==T__55) {
					{
					setState(2118);
					match(T__55);
					}
				}

				setState(2121);
				match(NEW);
				setState(2125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(2122);
					expression_fragment();
					}
					}
					setState(2127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2128);
				type_name();
				setState(2132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(2129);
					expression_fragment();
					}
					}
					setState(2134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2135);
				match(T__24);
				setState(2137);
				_la = _input.LA(1);
				if (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (T__0 - 1)) | (1L << (T__4 - 1)) | (1L << (T__5 - 1)) | (1L << (T__6 - 1)) | (1L << (T__7 - 1)) | (1L << (T__8 - 1)) | (1L << (T__9 - 1)) | (1L << (T__10 - 1)) | (1L << (T__11 - 1)) | (1L << (T__13 - 1)) | (1L << (T__14 - 1)) | (1L << (T__15 - 1)) | (1L << (T__16 - 1)) | (1L << (T__17 - 1)) | (1L << (T__18 - 1)) | (1L << (T__19 - 1)) | (1L << (T__47 - 1)) | (1L << (T__48 - 1)) | (1L << (T__55 - 1)) | (1L << (T__56 - 1)) | (1L << (T__57 - 1)) | (1L << (T__60 - 1)) | (1L << (T__61 - 1)) | (1L << (T__63 - 1)))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (STATIC - 81)) | (1L << (VOID - 81)) | (1L << (UNSIGNED - 81)) | (1L << (SIGNED - 81)) | (1L << (CV_QUALIFIER - 81)) | (1L << (EXTERN - 81)) | (1L << (ASM - 81)) | (1L << (VIRTUAL - 81)) | (1L << (TRY - 81)) | (1L << (CATCH - 81)) | (1L << (AUTO - 81)) | (1L << (REGISTER - 81)) | (1L << (SPECIAL_DATA - 81)) | (1L << (OPERATOR - 81)) | (1L << (CLASS_KEY - 81)) | (1L << (NEW - 81)) | (1L << (PRE_OTHER - 81)) | (1L << (PRE_PRAGMA_KEYWORDS - 81)) | (1L << (PRE_ATTRIBUTE - 81)) | (1L << (END_TEST - 81)) | (1L << (ALPHA_NUMERIC - 81)) | (1L << (OPENING_CURLY - 81)) | (1L << (HEX_LITERAL - 81)) | (1L << (DECIMAL_LITERAL - 81)) | (1L << (OCTAL_LITERAL - 81)) | (1L << (HEX_FLOAT - 81)) | (1L << (FLOATING_POINT_LITERAL - 81)) | (1L << (CHAR - 81)) | (1L << (STRING - 81)))) != 0)) {
					{
					setState(2136);
					conditional_expression();
					}
				}

				setState(2139);
				match(T__25);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2142);
				_la = _input.LA(1);
				if (_la==T__55) {
					{
					setState(2141);
					match(T__55);
					}
				}

				setState(2144);
				match(NEW);
				setState(2148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(2145);
					expression_fragment();
					}
					}
					setState(2150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2151);
				type_name();
				setState(2155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(2152);
					expression_fragment();
					}
					}
					setState(2157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2158);
				match(T__0);
				setState(2160);
				_la = _input.LA(1);
				if (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (T__0 - 1)) | (1L << (T__4 - 1)) | (1L << (T__5 - 1)) | (1L << (T__6 - 1)) | (1L << (T__7 - 1)) | (1L << (T__8 - 1)) | (1L << (T__9 - 1)) | (1L << (T__10 - 1)) | (1L << (T__11 - 1)) | (1L << (T__13 - 1)) | (1L << (T__14 - 1)) | (1L << (T__15 - 1)) | (1L << (T__16 - 1)) | (1L << (T__17 - 1)) | (1L << (T__18 - 1)) | (1L << (T__19 - 1)) | (1L << (T__47 - 1)) | (1L << (T__48 - 1)) | (1L << (T__55 - 1)) | (1L << (T__56 - 1)) | (1L << (T__57 - 1)) | (1L << (T__60 - 1)) | (1L << (T__61 - 1)) | (1L << (T__63 - 1)))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (STATIC - 81)) | (1L << (VOID - 81)) | (1L << (UNSIGNED - 81)) | (1L << (SIGNED - 81)) | (1L << (CV_QUALIFIER - 81)) | (1L << (EXTERN - 81)) | (1L << (ASM - 81)) | (1L << (VIRTUAL - 81)) | (1L << (TRY - 81)) | (1L << (CATCH - 81)) | (1L << (AUTO - 81)) | (1L << (REGISTER - 81)) | (1L << (SPECIAL_DATA - 81)) | (1L << (OPERATOR - 81)) | (1L << (CLASS_KEY - 81)) | (1L << (NEW - 81)) | (1L << (PRE_OTHER - 81)) | (1L << (PRE_PRAGMA_KEYWORDS - 81)) | (1L << (PRE_ATTRIBUTE - 81)) | (1L << (END_TEST - 81)) | (1L << (ALPHA_NUMERIC - 81)) | (1L << (OPENING_CURLY - 81)) | (1L << (HEX_LITERAL - 81)) | (1L << (DECIMAL_LITERAL - 81)) | (1L << (OCTAL_LITERAL - 81)) | (1L << (HEX_FLOAT - 81)) | (1L << (FLOATING_POINT_LITERAL - 81)) | (1L << (CHAR - 81)) | (1L << (STRING - 81)))) != 0)) {
					{
					setState(2159);
					expr();
					}
				}

				setState(2162);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
		}
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
		enterRule(_localctx, 242, RULE_unary_op_and_cast_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2166);
			unary_operator();
			setState(2170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
				{
				{
				setState(2167);
				expression_fragment();
				}
				}
				setState(2172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2173);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterSizeof_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitSizeof_expression(this);
		}
	}

	public final Sizeof_expressionContext sizeof_expression() throws RecognitionException {
		Sizeof_expressionContext _localctx = new Sizeof_expressionContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_sizeof_expression);
		int _la;
		try {
			setState(2195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2175);
				sizeof();
				setState(2179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(2176);
					expression_fragment();
					}
					}
					setState(2181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2182);
				match(T__0);
				setState(2183);
				sizeof_operand();
				setState(2184);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2186);
				sizeof();
				setState(2190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(2187);
					expression_fragment();
					}
					}
					setState(2192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2193);
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
		enterRule(_localctx, 246, RULE_sizeof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2197);
			match(T__60);
			}
		}
		catch (RecognitionException re) {
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
		}
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
		enterRule(_localctx, 248, RULE_defined_expression);
		int _la;
		try {
			setState(2218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2199);
				match(T__61);
				setState(2203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(2200);
					expression_fragment();
					}
					}
					setState(2205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2206);
				match(T__0);
				setState(2207);
				expr();
				setState(2208);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2210);
				match(T__61);
				setState(2214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(2211);
					expression_fragment();
					}
					}
					setState(2216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2217);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
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
		enterRule(_localctx, 250, RULE_sizeof_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2220);
			type_name();
			setState(2230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13 || _la==T__14 || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
				{
				{
				setState(2224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(2221);
					expression_fragment();
					}
					}
					setState(2226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2227);
				ptr_operator();
				}
				}
				setState(2232);
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
		enterRule(_localctx, 252, RULE_sizeof_operand2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2233);
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
		enterRule(_localctx, 254, RULE_inc_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2235);
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
		enterRule(_localctx, 256, RULE_asmCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2237);
			match(ASM);
			setState(2241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GOTO || _la==CV_QUALIFIER) {
				{
				{
				setState(2238);
				_la = _input.LA(1);
				if ( !(_la==GOTO || _la==CV_QUALIFIER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(2243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2245);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(2244);
				match(NEWLINE);
				}
			}

			setState(2247);
			match(T__0);
			setState(2249);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(2248);
				match(NEWLINE);
				}
			}

			setState(2255); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2251);
				match(STRING);
				setState(2253);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(2252);
					match(NEWLINE);
					}
				}

				}
				}
				setState(2257); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(2281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__55) | (1L << T__62))) != 0)) {
				{
				{
				setState(2259);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__55) | (1L << T__62))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2277);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					{
					setState(2260);
					match(STRING);
					setState(2262);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(2261);
						match(NEWLINE);
						}
					}

					}
					setState(2275);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(2264);
						match(T__0);
						setState(2265);
						identifier();
						setState(2270);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__12) {
							{
							{
							setState(2266);
							match(T__12);
							setState(2267);
							identifier();
							}
							}
							setState(2272);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2273);
						match(T__1);
						}
					}

					}
				}

				}
				}
				setState(2283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2284);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
		}
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
		}
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
		}
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
		}
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
		}
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
		int _startState = 258;
		enterRecursionRule(_localctx, 258, RULE_postfix_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
			case 1:
				{
				_localctx = new ArrayAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2288);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__19) | (1L << T__56) | (1L << T__57))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (STATIC - 81)) | (1L << (VOID - 81)) | (1L << (UNSIGNED - 81)) | (1L << (SIGNED - 81)) | (1L << (CV_QUALIFIER - 81)) | (1L << (EXTERN - 81)) | (1L << (VIRTUAL - 81)) | (1L << (TRY - 81)) | (1L << (CATCH - 81)) | (1L << (AUTO - 81)) | (1L << (REGISTER - 81)) | (1L << (SPECIAL_DATA - 81)) | (1L << (OPERATOR - 81)) | (1L << (CLASS_KEY - 81)) | (1L << (NEW - 81)) | (1L << (PRE_OTHER - 81)) | (1L << (PRE_PRAGMA_KEYWORDS - 81)) | (1L << (PRE_ATTRIBUTE - 81)) | (1L << (END_TEST - 81)) | (1L << (ALPHA_NUMERIC - 81)))) != 0)) {
					{
					setState(2287);
					type_name();
					}
				}

				setState(2290);
				initializer_expression();
				}
				break;
			case 2:
				{
				_localctx = new PrimaryOnlyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2291);
				primary_expression();
				}
				break;
			case 3:
				{
				_localctx = new IncDecOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2293);
				_la = _input.LA(1);
				if (_la==T__13 || _la==T__14) {
					{
					setState(2292);
					ptr_operator();
					}
				}

				setState(2295);
				inc_dec();
				setState(2299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(2296);
					expression_fragment();
					}
					}
					setState(2301);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2303);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
				case 1:
					{
					setState(2302);
					ptr_operator();
					}
					break;
				}
				setState(2305);
				primary_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,340,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2365);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,339,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayIndexingContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2309);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2313);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
							{
							{
							setState(2310);
							expression_fragment();
							}
							}
							setState(2315);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2316);
						match(T__24);
						setState(2318);
						_la = _input.LA(1);
						if (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (T__0 - 1)) | (1L << (T__4 - 1)) | (1L << (T__5 - 1)) | (1L << (T__6 - 1)) | (1L << (T__7 - 1)) | (1L << (T__8 - 1)) | (1L << (T__9 - 1)) | (1L << (T__10 - 1)) | (1L << (T__11 - 1)) | (1L << (T__13 - 1)) | (1L << (T__14 - 1)) | (1L << (T__15 - 1)) | (1L << (T__16 - 1)) | (1L << (T__17 - 1)) | (1L << (T__18 - 1)) | (1L << (T__19 - 1)) | (1L << (T__47 - 1)) | (1L << (T__48 - 1)) | (1L << (T__55 - 1)) | (1L << (T__56 - 1)) | (1L << (T__57 - 1)) | (1L << (T__60 - 1)) | (1L << (T__61 - 1)) | (1L << (T__63 - 1)))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (STATIC - 81)) | (1L << (VOID - 81)) | (1L << (UNSIGNED - 81)) | (1L << (SIGNED - 81)) | (1L << (CV_QUALIFIER - 81)) | (1L << (EXTERN - 81)) | (1L << (ASM - 81)) | (1L << (VIRTUAL - 81)) | (1L << (TRY - 81)) | (1L << (CATCH - 81)) | (1L << (AUTO - 81)) | (1L << (REGISTER - 81)) | (1L << (SPECIAL_DATA - 81)) | (1L << (OPERATOR - 81)) | (1L << (CLASS_KEY - 81)) | (1L << (NEW - 81)) | (1L << (PRE_OTHER - 81)) | (1L << (PRE_PRAGMA_KEYWORDS - 81)) | (1L << (PRE_ATTRIBUTE - 81)) | (1L << (END_TEST - 81)) | (1L << (ALPHA_NUMERIC - 81)) | (1L << (OPENING_CURLY - 81)) | (1L << (HEX_LITERAL - 81)) | (1L << (DECIMAL_LITERAL - 81)) | (1L << (OCTAL_LITERAL - 81)) | (1L << (HEX_FLOAT - 81)) | (1L << (FLOATING_POINT_LITERAL - 81)) | (1L << (CHAR - 81)) | (1L << (STRING - 81)))) != 0)) {
							{
							setState(2317);
							expr();
							}
						}

						setState(2320);
						match(T__25);
						}
						break;
					case 2:
						{
						_localctx = new FuncCallContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2321);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(2325);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
							{
							{
							setState(2322);
							expression_fragment();
							}
							}
							setState(2327);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2328);
						match(T__0);
						setState(2330);
						_la = _input.LA(1);
						if (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (T__0 - 1)) | (1L << (T__4 - 1)) | (1L << (T__5 - 1)) | (1L << (T__6 - 1)) | (1L << (T__7 - 1)) | (1L << (T__8 - 1)) | (1L << (T__9 - 1)) | (1L << (T__10 - 1)) | (1L << (T__11 - 1)) | (1L << (T__13 - 1)) | (1L << (T__14 - 1)) | (1L << (T__15 - 1)) | (1L << (T__16 - 1)) | (1L << (T__17 - 1)) | (1L << (T__18 - 1)) | (1L << (T__19 - 1)) | (1L << (T__47 - 1)) | (1L << (T__48 - 1)) | (1L << (T__55 - 1)) | (1L << (T__56 - 1)) | (1L << (T__57 - 1)) | (1L << (T__60 - 1)) | (1L << (T__61 - 1)) | (1L << (T__63 - 1)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (STATIC - 66)) | (1L << (VOID - 66)) | (1L << (UNSIGNED - 66)) | (1L << (SIGNED - 66)) | (1L << (CV_QUALIFIER - 66)) | (1L << (EXTERN - 66)) | (1L << (ASM - 66)) | (1L << (VIRTUAL - 66)) | (1L << (TRY - 66)) | (1L << (CATCH - 66)) | (1L << (AUTO - 66)) | (1L << (REGISTER - 66)) | (1L << (SPECIAL_DATA - 66)) | (1L << (OPERATOR - 66)) | (1L << (CLASS_KEY - 66)) | (1L << (NEW - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (PRE_OTHER - 66)) | (1L << (PRE_PRAGMA_KEYWORDS - 66)) | (1L << (PRE_ATTRIBUTE - 66)) | (1L << (END_TEST - 66)) | (1L << (ALPHA_NUMERIC - 66)) | (1L << (OPENING_CURLY - 66)) | (1L << (HEX_LITERAL - 66)) | (1L << (DECIMAL_LITERAL - 66)) | (1L << (OCTAL_LITERAL - 66)) | (1L << (HEX_FLOAT - 66)) | (1L << (FLOATING_POINT_LITERAL - 66)) | (1L << (COMMENT - 66)) | (1L << (CHAR - 66)) | (1L << (STRING - 66)))) != 0)) {
							{
							setState(2329);
							argument_list();
							}
						}

						setState(2332);
						match(T__1);
						}
						break;
					case 3:
						{
						_localctx = new MemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2333);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2334);
						match(T__63);
						setState(2338);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
							{
							{
							setState(2335);
							expression_fragment();
							}
							}
							setState(2340);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2342);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(2341);
							match(TEMPLATE);
							}
						}

						{
						setState(2344);
						identifier();
						}
						}
						break;
					case 4:
						{
						_localctx = new PtrMemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2345);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2346);
						match(T__50);
						setState(2350);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
							{
							{
							setState(2347);
							expression_fragment();
							}
							}
							setState(2352);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2354);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(2353);
							match(TEMPLATE);
							}
						}

						{
						setState(2356);
						identifier();
						}
						}
						break;
					case 5:
						{
						_localctx = new IncDecOpContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2357);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2361);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
							{
							{
							setState(2358);
							expression_fragment();
							}
							}
							setState(2363);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2364);
						inc_dec();
						}
						break;
					}
					} 
				}
				setState(2369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,340,_ctx);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
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
		enterRule(_localctx, 260, RULE_initializer_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2370);
			match(OPENING_CURLY);
			setState(2374);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,341,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2371);
					expression_fragment();
					}
					} 
				}
				setState(2376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,341,_ctx);
			}
			setState(2378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,342,_ctx) ) {
			case 1:
				{
				setState(2377);
				argument_list();
				}
				break;
			}
			setState(2383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
				{
				{
				setState(2380);
				expression_fragment();
				}
				}
				setState(2385);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2386);
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
		enterRule(_localctx, 262, RULE_argument_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2388);
			argument();
			setState(2395);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,345,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2390);
					_la = _input.LA(1);
					if (_la==T__12) {
						{
						setState(2389);
						match(T__12);
						}
					}

					setState(2392);
					argument();
					}
					} 
				}
				setState(2397);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,345,_ctx);
			}
			setState(2399);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(2398);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
		}
		public TerminalNode VOID() { return getToken(FunctionParser.VOID, 0); }
		public TerminalNode CV_QUALIFIER() { return getToken(FunctionParser.CV_QUALIFIER, 0); }
		public Ptr_operatorContext ptr_operator() {
			return getRuleContext(Ptr_operatorContext.class,0);
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
		enterRule(_localctx, 264, RULE_argument);
		int _la;
		try {
			int _alt;
			setState(2421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,351,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(2401);
					expression_fragment();
					}
					}
					setState(2406);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2407);
				assign_expr();
				setState(2411);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,348,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2408);
						expression_fragment();
						}
						} 
					}
					setState(2413);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,348,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2415);
				_la = _input.LA(1);
				if (_la==CV_QUALIFIER) {
					{
					setState(2414);
					match(CV_QUALIFIER);
					}
				}

				setState(2417);
				match(VOID);
				setState(2419);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,350,_ctx) ) {
				case 1:
					{
					setState(2418);
					ptr_operator();
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
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
		enterRule(_localctx, 266, RULE_primary_expression);
		int _la;
		try {
			setState(2445);
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
				setState(2424);
				_la = _input.LA(1);
				if (_la==T__63) {
					{
					setState(2423);
					match(T__63);
					}
				}

				setState(2426);
				identifier();
				}
				}
				break;
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(2427);
				ptr_operator();
				}
				break;
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case HEX_FLOAT:
			case FLOATING_POINT_LITERAL:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(2428);
				constant();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
				setState(2429);
				match(T__0);
				setState(2433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(2430);
					expression_fragment();
					}
					}
					setState(2435);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2436);
				expr();
				setState(2440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(2437);
					expression_fragment();
					}
					}
					setState(2442);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2443);
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
		enterRule(_localctx, 268, RULE_null_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2447);
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

	public static class Preprocessor_fragmentContext extends ParserRuleContext {
		public TerminalNode PRE_DEFINE() { return getToken(FunctionParser.PRE_DEFINE, 0); }
		public Pre_macro_identifierContext pre_macro_identifier() {
			return getRuleContext(Pre_macro_identifierContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public TerminalNode EOF() { return getToken(FunctionParser.EOF, 0); }
		public TerminalNode PRE_IF() { return getToken(FunctionParser.PRE_IF, 0); }
		public TerminalNode PRE_ELIF() { return getToken(FunctionParser.PRE_ELIF, 0); }
		public TerminalNode PRE_ELSE() { return getToken(FunctionParser.PRE_ELSE, 0); }
		public TerminalNode PRE_ENDIF() { return getToken(FunctionParser.PRE_ENDIF, 0); }
		public Preprocessor_fragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preprocessor_fragment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPreprocessor_fragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPreprocessor_fragment(this);
		}
	}

	public final Preprocessor_fragmentContext preprocessor_fragment() throws RecognitionException {
		Preprocessor_fragmentContext _localctx = new Preprocessor_fragmentContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_preprocessor_fragment);
		int _la;
		try {
			int _alt;
			setState(2477);
			switch (_input.LA(1)) {
			case PRE_DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2449);
				match(PRE_DEFINE);
				setState(2450);
				pre_macro_identifier();
				setState(2454);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,356,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(2451);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==NEWLINE) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						} 
					}
					setState(2456);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,356,_ctx);
				}
				setState(2457);
				_la = _input.LA(1);
				if ( !(_la==EOF || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case PRE_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(2459);
				match(PRE_IF);
				setState(2463);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,357,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(2460);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==NEWLINE) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						} 
					}
					setState(2465);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,357,_ctx);
				}
				setState(2466);
				_la = _input.LA(1);
				if ( !(_la==EOF || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case PRE_ELIF:
				enterOuterAlt(_localctx, 3);
				{
				setState(2467);
				match(PRE_ELIF);
				setState(2471);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,358,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(2468);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==NEWLINE) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						} 
					}
					setState(2473);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,358,_ctx);
				}
				setState(2474);
				_la = _input.LA(1);
				if ( !(_la==EOF || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case PRE_ELSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(2475);
				match(PRE_ELSE);
				}
				break;
			case PRE_ENDIF:
				enterOuterAlt(_localctx, 5);
				{
				setState(2476);
				match(PRE_ENDIF);
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

	public static class Expression_fragmentContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(FunctionParser.NEWLINE, 0); }
		public TerminalNode COMMENT() { return getToken(FunctionParser.COMMENT, 0); }
		public Preprocessor_fragmentContext preprocessor_fragment() {
			return getRuleContext(Preprocessor_fragmentContext.class,0);
		}
		public Expression_fragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_fragment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterExpression_fragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitExpression_fragment(this);
		}
	}

	public final Expression_fragmentContext expression_fragment() throws RecognitionException {
		Expression_fragmentContext _localctx = new Expression_fragmentContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_expression_fragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2482);
			switch (_input.LA(1)) {
			case NEWLINE:
				{
				setState(2479);
				match(NEWLINE);
				}
				break;
			case COMMENT:
				{
				setState(2480);
				match(COMMENT);
				}
				break;
			case PRE_IF:
			case PRE_ELIF:
			case PRE_ELSE:
			case PRE_ENDIF:
			case PRE_DEFINE:
				{
				setState(2481);
				preprocessor_fragment();
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
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
		enterRule(_localctx, 274, RULE_init_declarator);
		int _la;
		try {
			int _alt;
			setState(2526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,367,_ctx) ) {
			case 1:
				_localctx = new InitDeclWithCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2484);
				declarator();
				setState(2488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(2485);
					expression_fragment();
					}
					}
					setState(2490);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2491);
				match(T__0);
				setState(2495);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,362,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2492);
						expression_fragment();
						}
						} 
					}
					setState(2497);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,362,_ctx);
				}
				setState(2499);
				_la = _input.LA(1);
				if (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (T__0 - 1)) | (1L << (T__4 - 1)) | (1L << (T__5 - 1)) | (1L << (T__6 - 1)) | (1L << (T__7 - 1)) | (1L << (T__8 - 1)) | (1L << (T__9 - 1)) | (1L << (T__10 - 1)) | (1L << (T__11 - 1)) | (1L << (T__13 - 1)) | (1L << (T__14 - 1)) | (1L << (T__15 - 1)) | (1L << (T__16 - 1)) | (1L << (T__17 - 1)) | (1L << (T__18 - 1)) | (1L << (T__19 - 1)) | (1L << (T__47 - 1)) | (1L << (T__48 - 1)) | (1L << (T__55 - 1)) | (1L << (T__56 - 1)) | (1L << (T__57 - 1)) | (1L << (T__60 - 1)) | (1L << (T__61 - 1)) | (1L << (T__63 - 1)))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (STATIC - 81)) | (1L << (VOID - 81)) | (1L << (UNSIGNED - 81)) | (1L << (SIGNED - 81)) | (1L << (CV_QUALIFIER - 81)) | (1L << (EXTERN - 81)) | (1L << (ASM - 81)) | (1L << (VIRTUAL - 81)) | (1L << (TRY - 81)) | (1L << (CATCH - 81)) | (1L << (AUTO - 81)) | (1L << (REGISTER - 81)) | (1L << (SPECIAL_DATA - 81)) | (1L << (OPERATOR - 81)) | (1L << (CLASS_KEY - 81)) | (1L << (NEW - 81)) | (1L << (PRE_OTHER - 81)) | (1L << (PRE_PRAGMA_KEYWORDS - 81)) | (1L << (PRE_ATTRIBUTE - 81)) | (1L << (END_TEST - 81)) | (1L << (ALPHA_NUMERIC - 81)) | (1L << (OPENING_CURLY - 81)) | (1L << (HEX_LITERAL - 81)) | (1L << (DECIMAL_LITERAL - 81)) | (1L << (OCTAL_LITERAL - 81)) | (1L << (HEX_FLOAT - 81)) | (1L << (FLOATING_POINT_LITERAL - 81)) | (1L << (CHAR - 81)) | (1L << (STRING - 81)))) != 0)) {
					{
					setState(2498);
					expr();
					}
				}

				setState(2504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(2501);
					expression_fragment();
					}
					}
					setState(2506);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2507);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new InitDeclWithAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2509);
				declarator();
				setState(2513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(2510);
					expression_fragment();
					}
					}
					setState(2515);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2516);
				match(T__30);
				setState(2520);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,366,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2517);
						expression_fragment();
						}
						} 
					}
					setState(2522);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,366,_ctx);
				}
				setState(2523);
				argument();
				}
				break;
			case 3:
				_localctx = new InitDeclSimpleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2525);
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
		enterRule(_localctx, 276, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2529);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__14) {
				{
				setState(2528);
				ptrs();
				}
			}

			setState(2531);
			identifier();
			setState(2533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,369,_ctx) ) {
			case 1:
				{
				setState(2532);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
		}
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
		enterRule(_localctx, 278, RULE_type_suffix);
		int _la;
		try {
			int _alt;
			setState(2553);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2535);
				match(T__24);
				setState(2539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,370,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2536);
						expression_fragment();
						}
						} 
					}
					setState(2541);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,370,_ctx);
				}
				setState(2543);
				_la = _input.LA(1);
				if (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (T__0 - 1)) | (1L << (T__4 - 1)) | (1L << (T__5 - 1)) | (1L << (T__6 - 1)) | (1L << (T__7 - 1)) | (1L << (T__8 - 1)) | (1L << (T__9 - 1)) | (1L << (T__10 - 1)) | (1L << (T__11 - 1)) | (1L << (T__13 - 1)) | (1L << (T__14 - 1)) | (1L << (T__15 - 1)) | (1L << (T__16 - 1)) | (1L << (T__17 - 1)) | (1L << (T__18 - 1)) | (1L << (T__19 - 1)) | (1L << (T__47 - 1)) | (1L << (T__48 - 1)) | (1L << (T__55 - 1)) | (1L << (T__56 - 1)) | (1L << (T__57 - 1)) | (1L << (T__60 - 1)) | (1L << (T__61 - 1)) | (1L << (T__63 - 1)))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (STATIC - 81)) | (1L << (VOID - 81)) | (1L << (UNSIGNED - 81)) | (1L << (SIGNED - 81)) | (1L << (CV_QUALIFIER - 81)) | (1L << (EXTERN - 81)) | (1L << (ASM - 81)) | (1L << (VIRTUAL - 81)) | (1L << (TRY - 81)) | (1L << (CATCH - 81)) | (1L << (AUTO - 81)) | (1L << (REGISTER - 81)) | (1L << (SPECIAL_DATA - 81)) | (1L << (OPERATOR - 81)) | (1L << (CLASS_KEY - 81)) | (1L << (NEW - 81)) | (1L << (PRE_OTHER - 81)) | (1L << (PRE_PRAGMA_KEYWORDS - 81)) | (1L << (PRE_ATTRIBUTE - 81)) | (1L << (END_TEST - 81)) | (1L << (ALPHA_NUMERIC - 81)) | (1L << (OPENING_CURLY - 81)) | (1L << (HEX_LITERAL - 81)) | (1L << (DECIMAL_LITERAL - 81)) | (1L << (OCTAL_LITERAL - 81)) | (1L << (HEX_FLOAT - 81)) | (1L << (FLOATING_POINT_LITERAL - 81)) | (1L << (CHAR - 81)) | (1L << (STRING - 81)))) != 0)) {
					{
					setState(2542);
					conditional_expression();
					}
				}

				setState(2548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEWLINE - 66)) | (1L << (PRE_IF - 66)) | (1L << (PRE_ELIF - 66)) | (1L << (PRE_ELSE - 66)) | (1L << (PRE_ENDIF - 66)) | (1L << (PRE_DEFINE - 66)) | (1L << (COMMENT - 66)))) != 0)) {
					{
					{
					setState(2545);
					expression_fragment();
					}
					}
					setState(2550);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2551);
				match(T__25);
				}
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(2552);
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
		case 129:
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

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0084\u09fe\4\2\t"+
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
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\3\2\7"+
		"\2\u011c\n\2\f\2\16\2\u011f\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3\u012d\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\7\7\u0138"+
		"\n\7\f\7\16\7\u013b\13\7\3\7\3\7\7\7\u013f\n\7\f\7\16\7\u0142\13\7\3\7"+
		"\3\7\5\7\u0146\n\7\3\7\7\7\u0149\n\7\f\7\16\7\u014c\13\7\3\7\5\7\u014f"+
		"\n\7\3\7\3\7\7\7\u0153\n\7\f\7\16\7\u0156\13\7\3\7\3\7\7\7\u015a\n\7\f"+
		"\7\16\7\u015d\13\7\3\7\3\7\7\7\u0161\n\7\f\7\16\7\u0164\13\7\3\7\3\7\3"+
		"\7\3\7\3\7\7\7\u016b\n\7\f\7\16\7\u016e\13\7\3\7\3\7\7\7\u0172\n\7\f\7"+
		"\16\7\u0175\13\7\3\7\3\7\7\7\u0179\n\7\f\7\16\7\u017c\13\7\3\7\3\7\3\7"+
		"\3\7\7\7\u0182\n\7\f\7\16\7\u0185\13\7\3\7\3\7\7\7\u0189\n\7\f\7\16\7"+
		"\u018c\13\7\3\7\3\7\5\7\u0190\n\7\3\7\7\7\u0193\n\7\f\7\16\7\u0196\13"+
		"\7\3\7\5\7\u0199\n\7\3\7\3\7\7\7\u019d\n\7\f\7\16\7\u01a0\13\7\3\7\5\7"+
		"\u01a3\n\7\3\7\7\7\u01a6\n\7\f\7\16\7\u01a9\13\7\3\7\3\7\5\7\u01ad\n\7"+
		"\3\7\3\7\3\7\7\7\u01b2\n\7\f\7\16\7\u01b5\13\7\3\7\3\7\7\7\u01b9\n\7\f"+
		"\7\16\7\u01bc\13\7\3\7\3\7\7\7\u01c0\n\7\f\7\16\7\u01c3\13\7\3\7\3\7\5"+
		"\7\u01c7\n\7\5\7\u01c9\n\7\3\b\3\b\3\b\7\b\u01ce\n\b\f\b\16\b\u01d1\13"+
		"\b\3\b\3\b\5\b\u01d5\n\b\3\t\3\t\7\t\u01d9\n\t\f\t\16\t\u01dc\13\t\3\t"+
		"\3\t\3\t\7\t\u01e1\n\t\f\t\16\t\u01e4\13\t\3\t\3\t\3\t\3\t\7\t\u01ea\n"+
		"\t\f\t\16\t\u01ed\13\t\3\t\3\t\3\t\3\t\7\t\u01f3\n\t\f\t\16\t\u01f6\13"+
		"\t\3\t\5\t\u01f9\n\t\3\t\7\t\u01fc\n\t\f\t\16\t\u01ff\13\t\3\t\3\t\3\t"+
		"\7\t\u0204\n\t\f\t\16\t\u0207\13\t\3\t\5\t\u020a\n\t\3\t\7\t\u020d\n\t"+
		"\f\t\16\t\u0210\13\t\3\t\5\t\u0213\n\t\3\n\5\n\u0216\n\n\3\n\3\n\3\n\3"+
		"\n\5\n\u021c\n\n\3\n\7\n\u021f\n\n\f\n\16\n\u0222\13\n\3\n\3\n\3\13\3"+
		"\13\7\13\u0228\n\13\f\13\16\13\u022b\13\13\3\13\3\13\3\13\5\13\u0230\n"+
		"\13\3\f\3\f\3\r\3\r\5\r\u0236\n\r\3\16\3\16\3\16\3\16\5\16\u023c\n\16"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\7\23\u024c\n\23\f\23\16\23\u024f\13\23\3\24\3\24\3\24\3\24\7\24\u0255"+
		"\n\24\f\24\16\24\u0258\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\5\25\u0265\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u0270\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\5\30\u027a"+
		"\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0283\n\30\3\30\5\30\u0286"+
		"\n\30\3\31\3\31\3\32\3\32\5\32\u028c\n\32\3\32\3\32\3\32\5\32\u0291\n"+
		"\32\7\32\u0293\n\32\f\32\16\32\u0296\13\32\3\33\3\33\7\33\u029a\n\33\f"+
		"\33\16\33\u029d\13\33\3\34\5\34\u02a0\n\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\5\34\u02a8\n\34\3\34\5\34\u02ab\n\34\3\34\3\34\5\34\u02af\n\34\3\34"+
		"\3\34\3\34\3\34\5\34\u02b5\n\34\7\34\u02b7\n\34\f\34\16\34\u02ba\13\34"+
		"\3\34\5\34\u02bd\n\34\3\34\5\34\u02c0\n\34\3\34\3\34\3\35\3\35\3\35\5"+
		"\35\u02c7\n\35\3\36\3\36\5\36\u02cb\n\36\3\36\3\36\3\36\3\36\5\36\u02d1"+
		"\n\36\3\36\3\36\3\36\3\36\3\36\5\36\u02d8\n\36\3\36\3\36\5\36\u02dc\n"+
		"\36\3\37\3\37\3\37\7\37\u02e1\n\37\f\37\16\37\u02e4\13\37\3 \3 \3 \3 "+
		"\3 \3 \7 \u02ec\n \f \16 \u02ef\13 \3 \3 \3 \3 \3 \5 \u02f6\n \3 \3 \7"+
		" \u02fa\n \f \16 \u02fd\13 \3 \3 \3 \5 \u0302\n \3!\3!\3!\3!\3!\5!\u0309"+
		"\n!\3\"\3\"\3\"\3\"\3\"\5\"\u0310\n\"\3#\3#\3$\3$\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\5%\u0324\n%\3&\3&\5&\u0328\n&\3&\3&\3&\3&\3&\5"+
		"&\u032f\n&\3&\3&\7&\u0333\n&\f&\16&\u0336\13&\3&\3&\5&\u033a\n&\3\'\3"+
		"\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3+\3+\5+\u0349\n+\3+\7+\u034c\n+\f+\16+"+
		"\u034f\13+\3+\5+\u0352\n+\6+\u0354\n+\r+\16+\u0355\3+\3+\3+\5+\u035b\n"+
		"+\3,\3,\3-\3-\3.\3.\3/\3/\3/\5/\u0366\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\5/\u0390\n/\3\60\3\60\3\61\3\61\3\62\3\62\3\62"+
		"\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\6\63\u03a4\n\63"+
		"\r\63\16\63\u03a5\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39"+
		"\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3?\3?\3?\5?\u03c3\n?\3@\3@\3@\6@"+
		"\u03c8\n@\r@\16@\u03c9\3A\3A\3A\5A\u03cf\nA\3B\3B\5B\u03d3\nB\3B\5B\u03d6"+
		"\nB\3B\5B\u03d9\nB\3B\3B\5B\u03dd\nB\3B\3B\3C\3C\3C\3C\3C\3D\3D\3E\3E"+
		"\3E\3E\3E\3E\3F\5F\u03ef\nF\3F\5F\u03f2\nF\3F\3F\7F\u03f6\nF\fF\16F\u03f9"+
		"\13F\5F\u03fb\nF\3F\3F\7F\u03ff\nF\fF\16F\u0402\13F\3F\3F\5F\u0406\nF"+
		"\3F\7F\u0409\nF\fF\16F\u040c\13F\3F\3F\3F\5F\u0411\nF\3F\3F\7F\u0415\n"+
		"F\fF\16F\u0418\13F\3F\3F\5F\u041c\nF\3G\3G\3H\3H\7H\u0422\nH\fH\16H\u0425"+
		"\13H\7H\u0427\nH\fH\16H\u042a\13H\3H\3H\3H\3H\7H\u0430\nH\fH\16H\u0433"+
		"\13H\7H\u0435\nH\fH\16H\u0438\13H\3H\3H\7H\u043c\nH\fH\16H\u043f\13H\5"+
		"H\u0441\nH\3I\3I\7I\u0445\nI\fI\16I\u0448\13I\3I\5I\u044b\nI\3I\7I\u044e"+
		"\nI\fI\16I\u0451\13I\3I\3I\5I\u0455\nI\3I\3I\7I\u0459\nI\fI\16I\u045c"+
		"\13I\7I\u045e\nI\fI\16I\u0461\13I\3I\5I\u0464\nI\3I\3I\7I\u0468\nI\fI"+
		"\16I\u046b\13I\3I\3I\3I\7I\u0470\nI\fI\16I\u0473\13I\3I\7I\u0476\nI\f"+
		"I\16I\u0479\13I\3I\7I\u047c\nI\fI\16I\u047f\13I\3I\3I\7I\u0483\nI\fI\16"+
		"I\u0486\13I\3I\3I\3I\3I\7I\u048c\nI\fI\16I\u048f\13I\3I\7I\u0492\nI\f"+
		"I\16I\u0495\13I\3I\3I\7I\u0499\nI\fI\16I\u049c\13I\6I\u049e\nI\rI\16I"+
		"\u049f\5I\u04a2\nI\3J\7J\u04a5\nJ\fJ\16J\u04a8\13J\3J\3J\7J\u04ac\nJ\f"+
		"J\16J\u04af\13J\3J\3J\7J\u04b3\nJ\fJ\16J\u04b6\13J\3J\7J\u04b9\nJ\fJ\16"+
		"J\u04bc\13J\3J\7J\u04bf\nJ\fJ\16J\u04c2\13J\3J\3J\7J\u04c6\nJ\fJ\16J\u04c9"+
		"\13J\3J\5J\u04cc\nJ\3K\3K\3K\3K\5K\u04d2\nK\3L\5L\u04d5\nL\3L\3L\3L\3"+
		"L\3L\5L\u04dc\nL\3L\5L\u04df\nL\3M\3M\3M\3N\3N\3N\3N\7N\u04e8\nN\fN\16"+
		"N\u04eb\13N\3O\3O\3O\3P\5P\u04f1\nP\3P\3P\3Q\3Q\5Q\u04f7\nQ\3Q\3Q\3R\3"+
		"R\3R\3R\3R\3R\3R\5R\u0502\nR\3S\3S\3S\3S\3S\3T\7T\u050a\nT\fT\16T\u050d"+
		"\13T\3T\3T\3T\3T\7T\u0513\nT\fT\16T\u0516\13T\7T\u0518\nT\fT\16T\u051b"+
		"\13T\3U\3U\3V\5V\u0520\nV\3V\3V\7V\u0524\nV\fV\16V\u0527\13V\3V\5V\u052a"+
		"\nV\3V\3V\5V\u052e\nV\3V\3V\7V\u0532\nV\fV\16V\u0535\13V\5V\u0537\nV\3"+
		"V\3V\7V\u053b\nV\fV\16V\u053e\13V\5V\u0540\nV\3V\3V\7V\u0544\nV\fV\16"+
		"V\u0547\13V\3V\3V\3V\3V\7V\u054d\nV\fV\16V\u0550\13V\5V\u0552\nV\3V\3"+
		"V\7V\u0556\nV\fV\16V\u0559\13V\3V\5V\u055c\nV\3V\7V\u055f\nV\fV\16V\u0562"+
		"\13V\3V\5V\u0565\nV\3V\7V\u0568\nV\fV\16V\u056b\13V\3V\3V\5V\u056f\nV"+
		"\3V\7V\u0572\nV\fV\16V\u0575\13V\3V\5V\u0578\nV\3V\3V\7V\u057c\nV\fV\16"+
		"V\u057f\13V\3V\3V\7V\u0583\nV\fV\16V\u0586\13V\3V\3V\5V\u058a\nV\3V\3"+
		"V\7V\u058e\nV\fV\16V\u0591\13V\3V\5V\u0594\nV\3V\3V\3V\3V\3V\6V\u059b"+
		"\nV\rV\16V\u059c\3V\7V\u05a0\nV\fV\16V\u05a3\13V\5V\u05a5\nV\3V\3V\7V"+
		"\u05a9\nV\fV\16V\u05ac\13V\3V\5V\u05af\nV\3V\5V\u05b2\nV\5V\u05b4\nV\3"+
		"W\6W\u05b7\nW\rW\16W\u05b8\3X\3X\7X\u05bd\nX\fX\16X\u05c0\13X\3X\5X\u05c3"+
		"\nX\3X\3X\7X\u05c7\nX\fX\16X\u05ca\13X\5X\u05cc\nX\3X\5X\u05cf\nX\3X\3"+
		"X\3X\3X\7X\u05d5\nX\fX\16X\u05d8\13X\3X\5X\u05db\nX\3X\3X\7X\u05df\nX"+
		"\fX\16X\u05e2\13X\3X\5X\u05e5\nX\3X\3X\5X\u05e9\nX\3X\3X\3X\3X\3X\7X\u05f0"+
		"\nX\fX\16X\u05f3\13X\3X\5X\u05f6\nX\3X\5X\u05f9\nX\3Y\3Y\7Y\u05fd\nY\f"+
		"Y\16Y\u0600\13Y\3Y\3Y\7Y\u0604\nY\fY\16Y\u0607\13Y\3Y\7Y\u060a\nY\fY\16"+
		"Y\u060d\13Y\3Y\7Y\u0610\nY\fY\16Y\u0613\13Y\3Y\3Y\5Y\u0617\nY\3Y\3Y\3"+
		"Z\3Z\7Z\u061d\nZ\fZ\16Z\u0620\13Z\3Z\5Z\u0623\nZ\3Z\5Z\u0626\nZ\3Z\3Z"+
		"\3Z\3[\3[\3\\\3\\\3\\\3\\\7\\\u0631\n\\\f\\\16\\\u0634\13\\\3]\3]\7]\u0638"+
		"\n]\f]\16]\u063b\13]\5]\u063d\n]\3]\5]\u0640\n]\3]\3]\3^\3^\7^\u0646\n"+
		"^\f^\16^\u0649\13^\3^\3^\3^\7^\u064e\n^\f^\16^\u0651\13^\3^\3^\7^\u0655"+
		"\n^\f^\16^\u0658\13^\3^\3^\7^\u065c\n^\f^\16^\u065f\13^\3^\3^\7^\u0663"+
		"\n^\f^\16^\u0666\13^\3^\3^\7^\u066a\n^\f^\16^\u066d\13^\3^\3^\7^\u0671"+
		"\n^\f^\16^\u0674\13^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\5^\u0681\n^\7^\u0683"+
		"\n^\f^\16^\u0686\13^\3^\6^\u0689\n^\r^\16^\u068a\3_\3_\7_\u068f\n_\f_"+
		"\16_\u0692\13_\3_\3_\7_\u0696\n_\f_\16_\u0699\13_\3_\3_\7_\u069d\n_\f"+
		"_\16_\u06a0\13_\3_\3_\7_\u06a4\n_\f_\16_\u06a7\13_\3_\3_\7_\u06ab\n_\f"+
		"_\16_\u06ae\13_\3_\3_\7_\u06b2\n_\f_\16_\u06b5\13_\3_\3_\7_\u06b9\n_\f"+
		"_\16_\u06bc\13_\6_\u06be\n_\r_\16_\u06bf\3`\3`\5`\u06c4\n`\3a\3a\7a\u06c8"+
		"\na\fa\16a\u06cb\13a\3a\3a\7a\u06cf\na\fa\16a\u06d2\13a\3a\3a\3a\7a\u06d7"+
		"\na\fa\16a\u06da\13a\3a\3a\7a\u06de\na\fa\16a\u06e1\13a\3a\3a\7a\u06e5"+
		"\na\fa\16a\u06e8\13a\3a\7a\u06eb\na\fa\16a\u06ee\13a\5a\u06f0\na\3a\7"+
		"a\u06f3\na\fa\16a\u06f6\13a\3a\5a\u06f9\na\3b\3b\7b\u06fd\nb\fb\16b\u0700"+
		"\13b\3b\3b\3b\5b\u0705\nb\3c\5c\u0708\nc\3c\3c\3c\3c\3c\5c\u070f\nc\5"+
		"c\u0711\nc\3c\5c\u0714\nc\3d\3d\3d\7d\u0719\nd\fd\16d\u071c\13d\3d\3d"+
		"\3d\5d\u0721\nd\3e\3e\3f\3f\5f\u0727\nf\6f\u0729\nf\rf\16f\u072a\3g\3"+
		"g\3h\3h\7h\u0731\nh\fh\16h\u0734\13h\3h\3h\7h\u0738\nh\fh\16h\u073b\13"+
		"h\3h\5h\u073e\nh\3i\3i\7i\u0742\ni\fi\16i\u0745\13i\3i\3i\7i\u0749\ni"+
		"\fi\16i\u074c\13i\3i\3i\5i\u0750\ni\3j\3j\3j\7j\u0755\nj\fj\16j\u0758"+
		"\13j\3j\3j\7j\u075c\nj\fj\16j\u075f\13j\3j\3j\7j\u0763\nj\fj\16j\u0766"+
		"\13j\3j\3j\7j\u076a\nj\fj\16j\u076d\13j\3j\3j\5j\u0771\nj\3k\3k\7k\u0775"+
		"\nk\fk\16k\u0778\13k\3k\3k\7k\u077c\nk\fk\16k\u077f\13k\3k\5k\u0782\n"+
		"k\3l\3l\7l\u0786\nl\fl\16l\u0789\13l\3l\3l\7l\u078d\nl\fl\16l\u0790\13"+
		"l\3l\5l\u0793\nl\3m\3m\7m\u0797\nm\fm\16m\u079a\13m\3m\3m\7m\u079e\nm"+
		"\fm\16m\u07a1\13m\3m\5m\u07a4\nm\3n\3n\7n\u07a8\nn\fn\16n\u07ab\13n\3"+
		"n\3n\7n\u07af\nn\fn\16n\u07b2\13n\3n\5n\u07b5\nn\3o\3o\7o\u07b9\no\fo"+
		"\16o\u07bc\13o\3o\3o\7o\u07c0\no\fo\16o\u07c3\13o\3o\5o\u07c6\no\3p\3"+
		"p\7p\u07ca\np\fp\16p\u07cd\13p\3p\3p\7p\u07d1\np\fp\16p\u07d4\13p\3p\3"+
		"p\5p\u07d8\np\3q\3q\7q\u07dc\nq\fq\16q\u07df\13q\3q\3q\7q\u07e3\nq\fq"+
		"\16q\u07e6\13q\3q\3q\5q\u07ea\nq\3r\3r\7r\u07ee\nr\fr\16r\u07f1\13r\3"+
		"r\3r\7r\u07f5\nr\fr\16r\u07f8\13r\3r\5r\u07fb\nr\3s\3s\7s\u07ff\ns\fs"+
		"\16s\u0802\13s\3s\3s\7s\u0806\ns\fs\16s\u0809\13s\3s\5s\u080c\ns\3t\3"+
		"t\7t\u0810\nt\ft\16t\u0813\13t\3t\3t\7t\u0817\nt\ft\16t\u081a\13t\3t\5"+
		"t\u081d\nt\3u\3u\3u\5u\u0822\nu\3u\3u\3u\5u\u0827\nu\3u\3u\3u\5u\u082c"+
		"\nu\3v\3v\3v\3v\3v\3v\5v\u0834\nv\3w\3w\3w\3w\5w\u083a\nw\3x\3x\3x\3x"+
		"\3x\3x\3x\3x\5x\u0844\nx\3y\3y\3y\3z\5z\u084a\nz\3z\3z\7z\u084e\nz\fz"+
		"\16z\u0851\13z\3z\3z\7z\u0855\nz\fz\16z\u0858\13z\3z\3z\5z\u085c\nz\3"+
		"z\3z\3z\5z\u0861\nz\3z\3z\7z\u0865\nz\fz\16z\u0868\13z\3z\3z\7z\u086c"+
		"\nz\fz\16z\u086f\13z\3z\3z\5z\u0873\nz\3z\3z\5z\u0877\nz\3{\3{\7{\u087b"+
		"\n{\f{\16{\u087e\13{\3{\3{\3|\3|\7|\u0884\n|\f|\16|\u0887\13|\3|\3|\3"+
		"|\3|\3|\3|\7|\u088f\n|\f|\16|\u0892\13|\3|\3|\5|\u0896\n|\3}\3}\3~\3~"+
		"\7~\u089c\n~\f~\16~\u089f\13~\3~\3~\3~\3~\3~\3~\7~\u08a7\n~\f~\16~\u08aa"+
		"\13~\3~\5~\u08ad\n~\3\177\3\177\7\177\u08b1\n\177\f\177\16\177\u08b4\13"+
		"\177\3\177\7\177\u08b7\n\177\f\177\16\177\u08ba\13\177\3\u0080\3\u0080"+
		"\3\u0081\3\u0081\3\u0082\3\u0082\7\u0082\u08c2\n\u0082\f\u0082\16\u0082"+
		"\u08c5\13\u0082\3\u0082\5\u0082\u08c8\n\u0082\3\u0082\3\u0082\5\u0082"+
		"\u08cc\n\u0082\3\u0082\3\u0082\5\u0082\u08d0\n\u0082\6\u0082\u08d2\n\u0082"+
		"\r\u0082\16\u0082\u08d3\3\u0082\3\u0082\3\u0082\5\u0082\u08d9\n\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\7\u0082\u08df\n\u0082\f\u0082\16\u0082"+
		"\u08e2\13\u0082\3\u0082\3\u0082\5\u0082\u08e6\n\u0082\5\u0082\u08e8\n"+
		"\u0082\7\u0082\u08ea\n\u0082\f\u0082\16\u0082\u08ed\13\u0082\3\u0082\3"+
		"\u0082\3\u0083\3\u0083\5\u0083\u08f3\n\u0083\3\u0083\3\u0083\3\u0083\5"+
		"\u0083\u08f8\n\u0083\3\u0083\3\u0083\7\u0083\u08fc\n\u0083\f\u0083\16"+
		"\u0083\u08ff\13\u0083\3\u0083\5\u0083\u0902\n\u0083\3\u0083\3\u0083\5"+
		"\u0083\u0906\n\u0083\3\u0083\3\u0083\7\u0083\u090a\n\u0083\f\u0083\16"+
		"\u0083\u090d\13\u0083\3\u0083\3\u0083\5\u0083\u0911\n\u0083\3\u0083\3"+
		"\u0083\3\u0083\7\u0083\u0916\n\u0083\f\u0083\16\u0083\u0919\13\u0083\3"+
		"\u0083\3\u0083\5\u0083\u091d\n\u0083\3\u0083\3\u0083\3\u0083\3\u0083\7"+
		"\u0083\u0923\n\u0083\f\u0083\16\u0083\u0926\13\u0083\3\u0083\5\u0083\u0929"+
		"\n\u0083\3\u0083\3\u0083\3\u0083\3\u0083\7\u0083\u092f\n\u0083\f\u0083"+
		"\16\u0083\u0932\13\u0083\3\u0083\5\u0083\u0935\n\u0083\3\u0083\3\u0083"+
		"\3\u0083\7\u0083\u093a\n\u0083\f\u0083\16\u0083\u093d\13\u0083\3\u0083"+
		"\7\u0083\u0940\n\u0083\f\u0083\16\u0083\u0943\13\u0083\3\u0084\3\u0084"+
		"\7\u0084\u0947\n\u0084\f\u0084\16\u0084\u094a\13\u0084\3\u0084\5\u0084"+
		"\u094d\n\u0084\3\u0084\7\u0084\u0950\n\u0084\f\u0084\16\u0084\u0953\13"+
		"\u0084\3\u0084\3\u0084\3\u0085\3\u0085\5\u0085\u0959\n\u0085\3\u0085\7"+
		"\u0085\u095c\n\u0085\f\u0085\16\u0085\u095f\13\u0085\3\u0085\5\u0085\u0962"+
		"\n\u0085\3\u0086\7\u0086\u0965\n\u0086\f\u0086\16\u0086\u0968\13\u0086"+
		"\3\u0086\3\u0086\7\u0086\u096c\n\u0086\f\u0086\16\u0086\u096f\13\u0086"+
		"\3\u0086\5\u0086\u0972\n\u0086\3\u0086\3\u0086\5\u0086\u0976\n\u0086\5"+
		"\u0086\u0978\n\u0086\3\u0087\5\u0087\u097b\n\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\7\u0087\u0982\n\u0087\f\u0087\16\u0087\u0985\13\u0087"+
		"\3\u0087\3\u0087\7\u0087\u0989\n\u0087\f\u0087\16\u0087\u098c\13\u0087"+
		"\3\u0087\3\u0087\5\u0087\u0990\n\u0087\3\u0088\3\u0088\3\u0089\3\u0089"+
		"\3\u0089\7\u0089\u0997\n\u0089\f\u0089\16\u0089\u099a\13\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\7\u0089\u09a0\n\u0089\f\u0089\16\u0089\u09a3"+
		"\13\u0089\3\u0089\3\u0089\3\u0089\7\u0089\u09a8\n\u0089\f\u0089\16\u0089"+
		"\u09ab\13\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u09b0\n\u0089\3\u008a"+
		"\3\u008a\3\u008a\5\u008a\u09b5\n\u008a\3\u008b\3\u008b\7\u008b\u09b9\n"+
		"\u008b\f\u008b\16\u008b\u09bc\13\u008b\3\u008b\3\u008b\7\u008b\u09c0\n"+
		"\u008b\f\u008b\16\u008b\u09c3\13\u008b\3\u008b\5\u008b\u09c6\n\u008b\3"+
		"\u008b\7\u008b\u09c9\n\u008b\f\u008b\16\u008b\u09cc\13\u008b\3\u008b\3"+
		"\u008b\3\u008b\3\u008b\7\u008b\u09d2\n\u008b\f\u008b\16\u008b\u09d5\13"+
		"\u008b\3\u008b\3\u008b\7\u008b\u09d9\n\u008b\f\u008b\16\u008b\u09dc\13"+
		"\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u09e1\n\u008b\3\u008c\5\u008c\u09e4"+
		"\n\u008c\3\u008c\3\u008c\5\u008c\u09e8\n\u008c\3\u008d\3\u008d\7\u008d"+
		"\u09ec\n\u008d\f\u008d\16\u008d\u09ef\13\u008d\3\u008d\5\u008d\u09f2\n"+
		"\u008d\3\u008d\7\u008d\u09f5\n\u008d\f\u008d\16\u008d\u09f8\13\u008d\3"+
		"\u008d\3\u008d\5\u008d\u09fc\n\u008d\3\u008d\b\u024d\u0256\u029b\u0998"+
		"\u09a1\u09a9\3\u0104\u008e\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc"+
		"\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114"+
		"\u0116\u0118\2\35\3\3DD\3\2DD\b\2\b\16SSUVZ\\ccee\3\2\20\25\3\2\26\31"+
		"\5\2\b\nSSZZ\3\2\20\21\3\2\13\r\4\2\32\32ff\4\2!),-\3\2./\3\2\3\4\5\2"+
		"\3\4\33\34yz\3\2\3\5\4\2\3\4\26\27\3\2yz\3\2\33\34\4\2\5\5\33\34\4\2\5"+
		"\5\17\17\6\2\3\5\17\17\33\34yz\3\2{~\3\2*+\3\2\22\23\4\2\21\21\35\36\3"+
		"\2\62\63\4\2PPWW\5\2\6\6::AA\u0b6f\2\u011d\3\2\2\2\4\u012c\3\2\2\2\6\u012e"+
		"\3\2\2\2\b\u0130\3\2\2\2\n\u0132\3\2\2\2\f\u01c8\3\2\2\2\16\u01d4\3\2"+
		"\2\2\20\u0212\3\2\2\2\22\u0215\3\2\2\2\24\u022f\3\2\2\2\26\u0231\3\2\2"+
		"\2\30\u0235\3\2\2\2\32\u023b\3\2\2\2\34\u023d\3\2\2\2\36\u0241\3\2\2\2"+
		" \u0245\3\2\2\2\"\u0247\3\2\2\2$\u024d\3\2\2\2&\u0250\3\2\2\2(\u0264\3"+
		"\2\2\2*\u026f\3\2\2\2,\u0271\3\2\2\2.\u0285\3\2\2\2\60\u0287\3\2\2\2\62"+
		"\u028b\3\2\2\2\64\u029b\3\2\2\2\66\u029f\3\2\2\28\u02c6\3\2\2\2:\u02db"+
		"\3\2\2\2<\u02dd\3\2\2\2>\u0301\3\2\2\2@\u0308\3\2\2\2B\u030f\3\2\2\2D"+
		"\u0311\3\2\2\2F\u0313\3\2\2\2H\u0323\3\2\2\2J\u0339\3\2\2\2L\u033b\3\2"+
		"\2\2N\u033d\3\2\2\2P\u033f\3\2\2\2R\u0341\3\2\2\2T\u035a\3\2\2\2V\u035c"+
		"\3\2\2\2X\u035e\3\2\2\2Z\u0360\3\2\2\2\\\u038f\3\2\2\2^\u0391\3\2\2\2"+
		"`\u0393\3\2\2\2b\u0395\3\2\2\2d\u03a3\3\2\2\2f\u03a7\3\2\2\2h\u03a9\3"+
		"\2\2\2j\u03ab\3\2\2\2l\u03ad\3\2\2\2n\u03af\3\2\2\2p\u03b1\3\2\2\2r\u03b3"+
		"\3\2\2\2t\u03b5\3\2\2\2v\u03b7\3\2\2\2x\u03b9\3\2\2\2z\u03bb\3\2\2\2|"+
		"\u03c2\3\2\2\2~\u03c7\3\2\2\2\u0080\u03cb\3\2\2\2\u0082\u03d0\3\2\2\2"+
		"\u0084\u03e0\3\2\2\2\u0086\u03e5\3\2\2\2\u0088\u03e7\3\2\2\2\u008a\u041b"+
		"\3\2\2\2\u008c\u041d\3\2\2\2\u008e\u0440\3\2\2\2\u0090\u04a1\3\2\2\2\u0092"+
		"\u04a6\3\2\2\2\u0094\u04d1\3\2\2\2\u0096\u04d4\3\2\2\2\u0098\u04e0\3\2"+
		"\2\2\u009a\u04e3\3\2\2\2\u009c\u04ec\3\2\2\2\u009e\u04f0\3\2\2\2\u00a0"+
		"\u04f4\3\2\2\2\u00a2\u0501\3\2\2\2\u00a4\u0503\3\2\2\2\u00a6\u050b\3\2"+
		"\2\2\u00a8\u051c\3\2\2\2\u00aa\u05b3\3\2\2\2\u00ac\u05b6\3\2\2\2\u00ae"+
		"\u05f8\3\2\2\2\u00b0\u05fa\3\2\2\2\u00b2\u061a\3\2\2\2\u00b4\u062a\3\2"+
		"\2\2\u00b6\u062c\3\2\2\2\u00b8\u063c\3\2\2\2\u00ba\u0688\3\2\2\2\u00bc"+
		"\u06bd\3\2\2\2\u00be\u06c1\3\2\2\2\u00c0\u06f8\3\2\2\2\u00c2\u0704\3\2"+
		"\2\2\u00c4\u0707\3\2\2\2\u00c6\u0720\3\2\2\2\u00c8\u0722\3\2\2\2\u00ca"+
		"\u0728\3\2\2\2\u00cc\u072c\3\2\2\2\u00ce\u072e\3\2\2\2\u00d0\u073f\3\2"+
		"\2\2\u00d2\u0770\3\2\2\2\u00d4\u0772\3\2\2\2\u00d6\u0783\3\2\2\2\u00d8"+
		"\u0794\3\2\2\2\u00da\u07a5\3\2\2\2\u00dc\u07b6\3\2\2\2\u00de\u07c7\3\2"+
		"\2\2\u00e0\u07d9\3\2\2\2\u00e2\u07eb\3\2\2\2\u00e4\u07fc\3\2\2\2\u00e6"+
		"\u080d\3\2\2\2\u00e8\u082b\3\2\2\2\u00ea\u0833\3\2\2\2\u00ec\u0839\3\2"+
		"\2\2\u00ee\u0843\3\2\2\2\u00f0\u0845\3\2\2\2\u00f2\u0876\3\2\2\2\u00f4"+
		"\u0878\3\2\2\2\u00f6\u0895\3\2\2\2\u00f8\u0897\3\2\2\2\u00fa\u08ac\3\2"+
		"\2\2\u00fc\u08ae\3\2\2\2\u00fe\u08bb\3\2\2\2\u0100\u08bd\3\2\2\2\u0102"+
		"\u08bf\3\2\2\2\u0104\u0905\3\2\2\2\u0106\u0944\3\2\2\2\u0108\u0956\3\2"+
		"\2\2\u010a\u0977\3\2\2\2\u010c\u098f\3\2\2\2\u010e\u0991\3\2\2\2\u0110"+
		"\u09af\3\2\2\2\u0112\u09b4\3\2\2\2\u0114\u09e0\3\2\2\2\u0116\u09e3\3\2"+
		"\2\2\u0118\u09fb\3\2\2\2\u011a\u011c\5\4\3\2\u011b\u011a\3\2\2\2\u011c"+
		"\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\3\3\2\2\2"+
		"\u011f\u011d\3\2\2\2\u0120\u012d\5\6\4\2\u0121\u012d\5\b\5\2\u0122\u012d"+
		"\5\n\6\2\u0123\u012d\5\20\t\2\u0124\u012d\5\22\n\2\u0125\u012d\5\u00a8"+
		"U\2\u0126\u012d\5\24\13\2\u0127\u012d\5\30\r\2\u0128\u012d\5L\'\2\u0129"+
		"\u012d\5N(\2\u012a\u012d\5|?\2\u012b\u012d\5z>\2\u012c\u0120\3\2\2\2\u012c"+
		"\u0121\3\2\2\2\u012c\u0122\3\2\2\2\u012c\u0123\3\2\2\2\u012c\u0124\3\2"+
		"\2\2\u012c\u0125\3\2\2\2\u012c\u0126\3\2\2\2\u012c\u0127\3\2\2\2\u012c"+
		"\u0128\3\2\2\2\u012c\u0129\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012b\3\2"+
		"\2\2\u012d\5\3\2\2\2\u012e\u012f\7y\2\2\u012f\7\3\2\2\2\u0130\u0131\7"+
		"z\2\2\u0131\t\3\2\2\2\u0132\u0133\5\f\7\2\u0133\13\3\2\2\2\u0134\u01c9"+
		"\7[\2\2\u0135\u014e\7\\\2\2\u0136\u0138\5\u0112\u008a\2\u0137\u0136\3"+
		"\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u0140\7\3\2\2\u013d\u013f\5\u0112"+
		"\u008a\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0145\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0146\5\u00c2"+
		"b\2\u0144\u0146\7F\2\2\u0145\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0146\u014a"+
		"\3\2\2\2\u0147\u0149\5\u0112\u008a\2\u0148\u0147\3\2\2\2\u0149\u014c\3"+
		"\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014d\u014f\7\4\2\2\u014e\u0139\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014f\u01c9\3\2\2\2\u0150\u0154\7G\2\2\u0151\u0153\5\u0112\u008a"+
		"\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155"+
		"\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u015b\7\3\2\2\u0158"+
		"\u015a\5\u0112\u008a\2\u0159\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159"+
		"\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e"+
		"\u0162\5\26\f\2\u015f\u0161\5\u0112\u008a\2\u0160\u015f\3\2\2\2\u0161"+
		"\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165\3\2"+
		"\2\2\u0164\u0162\3\2\2\2\u0165\u0166\7\4\2\2\u0166\u01c9\3\2\2\2\u0167"+
		"\u01c9\7H\2\2\u0168\u016c\7N\2\2\u0169\u016b\5\u0112\u008a\2\u016a\u0169"+
		"\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d"+
		"\u016f\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0173\7\3\2\2\u0170\u0172\5\u0112"+
		"\u008a\2\u0171\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u0176\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u017a\5\26"+
		"\f\2\u0177\u0179\5\u0112\u008a\2\u0178\u0177\3\2\2\2\u0179\u017c\3\2\2"+
		"\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2\2\2\u017c\u017a"+
		"\3\2\2\2\u017d\u017e\7\4\2\2\u017e\u01c9\3\2\2\2\u017f\u0183\7I\2\2\u0180"+
		"\u0182\5\u0112\u008a\2\u0181\u0180\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181"+
		"\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u0183\3\2\2\2\u0186"+
		"\u018a\7\3\2\2\u0187\u0189\5\u0112\u008a\2\u0188\u0187\3\2\2\2\u0189\u018c"+
		"\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018f\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018d\u0190\5\16\b\2\u018e\u0190\7\5\2\2\u018f\u018d\3"+
		"\2\2\2\u018f\u018e\3\2\2\2\u0190\u0194\3\2\2\2\u0191\u0193\5\u0112\u008a"+
		"\2\u0192\u0191\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195"+
		"\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0199\5\26\f\2"+
		"\u0198\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019e"+
		"\7\5\2\2\u019b\u019d\5\u0112\u008a\2\u019c\u019b\3\2\2\2\u019d\u01a0\3"+
		"\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0"+
		"\u019e\3\2\2\2\u01a1\u01a3\5\u00ceh\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3"+
		"\3\2\2\2\u01a3\u01a7\3\2\2\2\u01a4\u01a6\5\u0112\u008a\2\u01a5\u01a4\3"+
		"\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8"+
		"\u01aa\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ac\7\4\2\2\u01ab\u01ad\7\5"+
		"\2\2\u01ac\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01c9\3\2\2\2\u01ae"+
		"\u01c9\7O\2\2\u01af\u01b3\7J\2\2\u01b0\u01b2\5\u0112\u008a\2\u01b1\u01b0"+
		"\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4"+
		"\u01b6\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01ba\7\3\2\2\u01b7\u01b9\5\u0112"+
		"\u008a\2\u01b8\u01b7\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba"+
		"\u01bb\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01c1\5\26"+
		"\f\2\u01be\u01c0\5\u0112\u008a\2\u01bf\u01be\3\2\2\2\u01c0\u01c3\3\2\2"+
		"\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01c1"+
		"\3\2\2\2\u01c4\u01c6\7\4\2\2\u01c5\u01c7\7\5\2\2\u01c6\u01c5\3\2\2\2\u01c6"+
		"\u01c7\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8\u0134\3\2\2\2\u01c8\u0135\3\2"+
		"\2\2\u01c8\u0150\3\2\2\2\u01c8\u0167\3\2\2\2\u01c8\u0168\3\2\2\2\u01c8"+
		"\u017f\3\2\2\2\u01c8\u01ae\3\2\2\2\u01c8\u01af\3\2\2\2\u01c9\r\3\2\2\2"+
		"\u01ca\u01d5\5\u00a8U\2\u01cb\u01cf\5\u00ceh\2\u01cc\u01ce\5\u0112\u008a"+
		"\2\u01cd\u01cc\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0"+
		"\3\2\2\2\u01d0\u01d2\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d3\7\5\2\2\u01d3"+
		"\u01d5\3\2\2\2\u01d4\u01ca\3\2\2\2\u01d4\u01cb\3\2\2\2\u01d5\17\3\2\2"+
		"\2\u01d6\u01da\7K\2\2\u01d7\u01d9\5\u0112\u008a\2\u01d8\u01d7\3\2\2\2"+
		"\u01d9\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dd"+
		"\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd\u0213\7\5\2\2\u01de\u01e2\7M\2\2\u01df"+
		"\u01e1\5\u0112\u008a\2\u01e0\u01df\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0"+
		"\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5"+
		"\u0213\7\5\2\2\u01e6\u01e7\7P\2\2\u01e7\u01eb\5\u00c6d\2\u01e8\u01ea\5"+
		"\u0112\u008a\2\u01e9\u01e8\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2"+
		"\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee"+
		"\u01ef\7\5\2\2\u01ef\u0213\3\2\2\2\u01f0\u01f4\7Q\2\2\u01f1\u01f3\5\u0112"+
		"\u008a\2\u01f2\u01f1\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4"+
		"\u01f5\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01f9\5\u00ce"+
		"h\2\u01f8\u01f7\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fd\3\2\2\2\u01fa"+
		"\u01fc\5\u0112\u008a\2\u01fb\u01fa\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb"+
		"\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0200\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200"+
		"\u0213\7\5\2\2\u0201\u0205\7]\2\2\u0202\u0204\5\u0112\u008a\2\u0203\u0202"+
		"\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206"+
		"\u0209\3\2\2\2\u0207\u0205\3\2\2\2\u0208\u020a\5\u00ceh\2\u0209\u0208"+
		"\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020e\3\2\2\2\u020b\u020d\5\u0112\u008a"+
		"\2\u020c\u020b\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f"+
		"\3\2\2\2\u020f\u0211\3\2\2\2\u0210\u020e\3\2\2\2\u0211\u0213\7\5\2\2\u0212"+
		"\u01d6\3\2\2\2\u0212\u01de\3\2\2\2\u0212\u01e6\3\2\2\2\u0212\u01f0\3\2"+
		"\2\2\u0212\u0201\3\2\2\2\u0213\21\3\2\2\2\u0214\u0216\7L\2\2\u0215\u0214"+
		"\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u021b\3\2\2\2\u0217\u021c\5\u00c6d"+
		"\2\u0218\u021c\5\u00c8e\2\u0219\u021c\7\u0081\2\2\u021a\u021c\5\u00ea"+
		"v\2\u021b\u0217\3\2\2\2\u021b\u0218\3\2\2\2\u021b\u0219\3\2\2\2\u021b"+
		"\u021a\3\2\2\2\u021c\u0220\3\2\2\2\u021d\u021f\5\u0112\u008a\2\u021e\u021d"+
		"\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221"+
		"\u0223\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0224\7\6\2\2\u0224\23\3\2\2"+
		"\2\u0225\u0229\5\u00ceh\2\u0226\u0228\5\u0112\u008a\2\u0227\u0226\3\2"+
		"\2\2\u0228\u022b\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a"+
		"\u022c\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u022d\7\5\2\2\u022d\u0230\3\2"+
		"\2\2\u022e\u0230\5\u010e\u0088\2\u022f\u0225\3\2\2\2\u022f\u022e\3\2\2"+
		"\2\u0230\25\3\2\2\2\u0231\u0232\5\u00ceh\2\u0232\27\3\2\2\2\u0233\u0236"+
		"\5\32\16\2\u0234\u0236\5(\25\2\u0235\u0233\3\2\2\2\u0235\u0234\3\2\2\2"+
		"\u0236\31\3\2\2\2\u0237\u023c\5\34\17\2\u0238\u023c\5\36\20\2\u0239\u023c"+
		"\5 \21\2\u023a\u023c\5\"\22\2\u023b\u0237\3\2\2\2\u023b\u0238\3\2\2\2"+
		"\u023b\u0239\3\2\2\2\u023b\u023a\3\2\2\2\u023c\33\3\2\2\2\u023d\u023e"+
		"\7g\2\2\u023e\u023f\5$\23\2\u023f\u0240\t\2\2\2\u0240\35\3\2\2\2\u0241"+
		"\u0242\7h\2\2\u0242\u0243\5$\23\2\u0243\u0244\t\2\2\2\u0244\37\3\2\2\2"+
		"\u0245\u0246\7i\2\2\u0246!\3\2\2\2\u0247\u0248\7j\2\2\u0248#\3\2\2\2\u0249"+
		"\u024c\5&\24\2\u024a\u024c\n\3\2\2\u024b\u0249\3\2\2\2\u024b\u024a\3\2"+
		"\2\2\u024c\u024f\3\2\2\2\u024d\u024e\3\2\2\2\u024d\u024b\3\2\2\2\u024e"+
		"%\3\2\2\2\u024f\u024d\3\2\2\2\u0250\u0251\5\u00c6d\2\u0251\u0256\7\3\2"+
		"\2\u0252\u0255\5&\24\2\u0253\u0255\n\3\2\2\u0254\u0252\3\2\2\2\u0254\u0253"+
		"\3\2\2\2\u0255\u0258\3\2\2\2\u0256\u0257\3\2\2\2\u0256\u0254\3\2\2\2\u0257"+
		"\u0259\3\2\2\2\u0258\u0256\3\2\2\2\u0259\u025a\7\4\2\2\u025a\'\3\2\2\2"+
		"\u025b\u0265\5*\26\2\u025c\u0265\5,\27\2\u025d\u0265\58\35\2\u025e\u0265"+
		"\5:\36\2\u025f\u0265\5@!\2\u0260\u0265\5B\"\2\u0261\u0265\5H%\2\u0262"+
		"\u0265\5J&\2\u0263\u0265\5\66\34\2\u0264\u025b\3\2\2\2\u0264\u025c\3\2"+
		"\2\2\u0264\u025d\3\2\2\2\u0264\u025e\3\2\2\2\u0264\u025f\3\2\2\2\u0264"+
		"\u0260\3\2\2\2\u0264\u0261\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0263\3\2"+
		"\2\2\u0265)\3\2\2\2\u0266\u0267\7k\2\2\u0267\u0268\5.\30\2\u0268\u0269"+
		"\t\2\2\2\u0269\u0270\3\2\2\2\u026a\u026b\7k\2\2\u026b\u026c\5.\30\2\u026c"+
		"\u026d\5\64\33\2\u026d\u026e\t\2\2\2\u026e\u0270\3\2\2\2\u026f\u0266\3"+
		"\2\2\2\u026f\u026a\3\2\2\2\u0270+\3\2\2\2\u0271\u0272\7l\2\2\u0272\u0273"+
		"\5.\30\2\u0273-\3\2\2\2\u0274\u0279\5\u00c6d\2\u0275\u0276\7\3\2\2\u0276"+
		"\u0277\5\62\32\2\u0277\u0278\7\4\2\2\u0278\u027a\3\2\2\2\u0279\u0275\3"+
		"\2\2\2\u0279\u027a\3\2\2\2\u027a\u0286\3\2\2\2\u027b\u0286\5\60\31\2\u027c"+
		"\u0286\7w\2\2\u027d\u0282\7\7\2\2\u027e\u027f\7\3\2\2\u027f\u0280\5\62"+
		"\32\2\u0280\u0281\7\4\2\2\u0281\u0283\3\2\2\2\u0282\u027e\3\2\2\2\u0282"+
		"\u0283\3\2\2\2\u0283\u0286\3\2\2\2\u0284\u0286\5:\36\2\u0285\u0274\3\2"+
		"\2\2\u0285\u027b\3\2\2\2\u0285\u027c\3\2\2\2\u0285\u027d\3\2\2\2\u0285"+
		"\u0284\3\2\2\2\u0286/\3\2\2\2\u0287\u0288\t\4\2\2\u0288\61\3\2\2\2\u0289"+
		"\u028c\5\u00c6d\2\u028a\u028c\7F\2\2\u028b\u0289\3\2\2\2\u028b\u028a\3"+
		"\2\2\2\u028b\u028c\3\2\2\2\u028c\u0294\3\2\2\2\u028d\u0290\7\17\2\2\u028e"+
		"\u0291\5\u00c6d\2\u028f\u0291\7F\2\2\u0290\u028e\3\2\2\2\u0290\u028f\3"+
		"\2\2\2\u0291\u0293\3\2\2\2\u0292\u028d\3\2\2\2\u0293\u0296\3\2\2\2\u0294"+
		"\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295\63\3\2\2\2\u0296\u0294\3\2\2"+
		"\2\u0297\u029a\5&\24\2\u0298\u029a\n\3\2\2\u0299\u0297\3\2\2\2\u0299\u0298"+
		"\3\2\2\2\u029a\u029d\3\2\2\2\u029b\u029c\3\2\2\2\u029b\u0299\3\2\2\2\u029c"+
		"\65\3\2\2\2\u029d\u029b\3\2\2\2\u029e\u02a0\5.\30\2\u029f\u029e\3\2\2"+
		"\2\u029f\u02a0\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2\5.\30\2\u02a2\u02bf"+
		"\7\3\2\2\u02a3\u02a8\5\u00ceh\2\u02a4\u02a8\5\u00ba^\2\u02a5\u02a8\5R"+
		"*\2\u02a6\u02a8\5`\61\2\u02a7\u02a3\3\2\2\2\u02a7\u02a4\3\2\2\2\u02a7"+
		"\u02a5\3\2\2\2\u02a7\u02a6\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02aa\3\2"+
		"\2\2\u02a9\u02ab\7D\2\2\u02aa\u02a9\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab"+
		"\u02b8\3\2\2\2\u02ac\u02ae\7\17\2\2\u02ad\u02af\7D\2\2\u02ae\u02ad\3\2"+
		"\2\2\u02ae\u02af\3\2\2\2\u02af\u02b4\3\2\2\2\u02b0\u02b5\5\u00ceh\2\u02b1"+
		"\u02b5\5\u00ba^\2\u02b2\u02b5\5R*\2\u02b3\u02b5\5`\61\2\u02b4\u02b0\3"+
		"\2\2\2\u02b4\u02b1\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b4\u02b3\3\2\2\2\u02b5"+
		"\u02b7\3\2\2\2\u02b6\u02ac\3\2\2\2\u02b7\u02ba\3\2\2\2\u02b8\u02b6\3\2"+
		"\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02bc\3\2\2\2\u02ba\u02b8\3\2\2\2\u02bb"+
		"\u02bd\7\17\2\2\u02bc\u02bb\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02c0\3"+
		"\2\2\2\u02be\u02c0\7T\2\2\u02bf\u02a7\3\2\2\2\u02bf\u02be\3\2\2\2\u02c0"+
		"\u02c1\3\2\2\2\u02c1\u02c2\7\4\2\2\u02c2\67\3\2\2\2\u02c3\u02c4\7m\2\2"+
		"\u02c4\u02c7\7\u0082\2\2\u02c5\u02c7\7m\2\2\u02c6\u02c3\3\2\2\2\u02c6"+
		"\u02c5\3\2\2\2\u02c79\3\2\2\2\u02c8\u02ca\7n\2\2\u02c9\u02cb\7\u0082\2"+
		"\2\u02ca\u02c9\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02dc\3\2\2\2\u02cc\u02cd"+
		"\7v\2\2\u02cd\u02ce\7\3\2\2\u02ce\u02d0\7\3\2\2\u02cf\u02d1\5<\37\2\u02d0"+
		"\u02cf\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d3\7\4"+
		"\2\2\u02d3\u02dc\7\4\2\2\u02d4\u02d5\7v\2\2\u02d5\u02d7\7\3\2\2\u02d6"+
		"\u02d8\5<\37\2\u02d7\u02d6\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02d9\3\2"+
		"\2\2\u02d9\u02dc\7\4\2\2\u02da\u02dc\7v\2\2\u02db\u02c8\3\2\2\2\u02db"+
		"\u02cc\3\2\2\2\u02db\u02d4\3\2\2\2\u02db\u02da\3\2\2\2\u02dc;\3\2\2\2"+
		"\u02dd\u02e2\5> \2\u02de\u02df\7\17\2\2\u02df\u02e1\5> \2\u02e0\u02de"+
		"\3\2\2\2\u02e1\u02e4\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3"+
		"=\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e5\u0302\5.\30\2\u02e6\u02e7\5.\30\2"+
		"\u02e7\u02e8\7\3\2\2\u02e8\u02ed\5\u00c6d\2\u02e9\u02ea\7\17\2\2\u02ea"+
		"\u02ec\5\u00ceh\2\u02eb\u02e9\3\2\2\2\u02ec\u02ef\3\2\2\2\u02ed\u02eb"+
		"\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02f0\3\2\2\2\u02ef\u02ed\3\2\2\2\u02f0"+
		"\u02f1\7\4\2\2\u02f1\u0302\3\2\2\2\u02f2\u02f3\5.\30\2\u02f3\u02f5\7\3"+
		"\2\2\u02f4\u02f6\5\u00ceh\2\u02f5\u02f4\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6"+
		"\u02fb\3\2\2\2\u02f7\u02f8\7\17\2\2\u02f8\u02fa\5\u00ceh\2\u02f9\u02f7"+
		"\3\2\2\2\u02fa\u02fd\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc"+
		"\u02fe\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fe\u02ff\7\4\2\2\u02ff\u0302\3\2"+
		"\2\2\u0300\u0302\5T+\2\u0301\u02e5\3\2\2\2\u0301\u02e6\3\2\2\2\u0301\u02f2"+
		"\3\2\2\2\u0301\u0300\3\2\2\2\u0302?\3\2\2\2\u0303\u0304\7o\2\2\u0304\u0309"+
		"\5D#\2\u0305\u0306\7o\2\2\u0306\u0309\5.\30\2\u0307\u0309\7o\2\2\u0308"+
		"\u0303\3\2\2\2\u0308\u0305\3\2\2\2\u0308\u0307\3\2\2\2\u0309A\3\2\2\2"+
		"\u030a\u030b\7p\2\2\u030b\u0310\5D#\2\u030c\u030d\7p\2\2\u030d\u0310\5"+
		".\30\2\u030e\u0310\7p\2\2\u030f\u030a\3\2\2\2\u030f\u030c\3\2\2\2\u030f"+
		"\u030e\3\2\2\2\u0310C\3\2\2\2\u0311\u0312\5F$\2\u0312E\3\2\2\2\u0313\u0314"+
		"\7\u0082\2\2\u0314G\3\2\2\2\u0315\u0316\7q\2\2\u0316\u0317\7|\2\2\u0317"+
		"\u0324\7\u0082\2\2\u0318\u0319\7q\2\2\u0319\u031a\7|\2\2\u031a\u0324\5"+
		".\30\2\u031b\u031c\7q\2\2\u031c\u031d\5.\30\2\u031d\u031e\7\u0082\2\2"+
		"\u031e\u0324\3\2\2\2\u031f\u0320\7q\2\2\u0320\u0324\5.\30\2\u0321\u0322"+
		"\7q\2\2\u0322\u0324\7|\2\2\u0323\u0315\3\2\2\2\u0323\u0318\3\2\2\2\u0323"+
		"\u031b\3\2\2\2\u0323\u031f\3\2\2\2\u0323\u0321\3\2\2\2\u0324I\3\2\2\2"+
		"\u0325\u0327\7r\2\2\u0326\u0328\7s\2\2\u0327\u0326\3\2\2\2\u0327\u0328"+
		"\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032a\7t\2\2\u032a\u032b\7\u0082\2"+
		"\2\u032b\u033a\b&\1\2\u032c\u032e\7r\2\2\u032d\u032f\7s\2\2\u032e\u032d"+
		"\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0334\7t\2\2\u0331"+
		"\u0333\5\u00c6d\2\u0332\u0331\3\2\2\2\u0333\u0336\3\2\2\2\u0334\u0332"+
		"\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u033a\3\2\2\2\u0336\u0334\3\2\2\2\u0337"+
		"\u0338\7r\2\2\u0338\u033a\b&\1\2\u0339\u0325\3\2\2\2\u0339\u032c\3\2\2"+
		"\2\u0339\u0337\3\2\2\2\u033aK\3\2\2\2\u033b\u033c\7\u0080\2\2\u033cM\3"+
		"\2\2\2\u033d\u033e\7D\2\2\u033eO\3\2\2\2\u033f\u0340\t\5\2\2\u0340Q\3"+
		"\2\2\2\u0341\u0342\t\6\2\2\u0342S\3\2\2\2\u0343\u035b\7{\2\2\u0344\u035b"+
		"\7}\2\2\u0345\u035b\7|\2\2\u0346\u0348\7\u0082\2\2\u0347\u0349\7D\2\2"+
		"\u0348\u0347\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034d\3\2\2\2\u034a\u034c"+
		"\7\u0080\2\2\u034b\u034a\3\2\2\2\u034c\u034f\3\2\2\2\u034d\u034b\3\2\2"+
		"\2\u034d\u034e\3\2\2\2\u034e\u0351\3\2\2\2\u034f\u034d\3\2\2\2\u0350\u0352"+
		"\7D\2\2\u0351\u0350\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0354\3\2\2\2\u0353"+
		"\u0346\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0353\3\2\2\2\u0355\u0356\3\2"+
		"\2\2\u0356\u035b\3\2\2\2\u0357\u035b\7\u0081\2\2\u0358\u035b\7\177\2\2"+
		"\u0359\u035b\7~\2\2\u035a\u0343\3\2\2\2\u035a\u0344\3\2\2\2\u035a\u0345"+
		"\3\2\2\2\u035a\u0353\3\2\2\2\u035a\u0357\3\2\2\2\u035a\u0358\3\2\2\2\u035a"+
		"\u0359\3\2\2\2\u035bU\3\2\2\2\u035c\u035d\t\7\2\2\u035dW\3\2\2\2\u035e"+
		"\u035f\t\b\2\2\u035fY\3\2\2\2\u0360\u0361\t\t\2\2\u0361[\3\2\2\2\u0362"+
		"\u0365\t\n\2\2\u0363\u0364\7\33\2\2\u0364\u0366\7\34\2\2\u0365\u0363\3"+
		"\2\2\2\u0365\u0366\3\2\2\2\u0366\u0390\3\2\2\2\u0367\u0390\7\22\2\2\u0368"+
		"\u0390\7\23\2\2\u0369\u0390\7\21\2\2\u036a\u0390\7\35\2\2\u036b\u0390"+
		"\7\36\2\2\u036c\u0390\7\37\2\2\u036d\u0390\7\20\2\2\u036e\u0390\7 \2\2"+
		"\u036f\u0390\7\24\2\2\u0370\u0390\7\25\2\2\u0371\u0390\7!\2\2\u0372\u0390"+
		"\7\26\2\2\u0373\u0390\7\27\2\2\u0374\u0390\7\"\2\2\u0375\u0390\7#\2\2"+
		"\u0376\u0390\7$\2\2\u0377\u0390\7%\2\2\u0378\u0390\7&\2\2\u0379\u0390"+
		"\7\'\2\2\u037a\u0390\7(\2\2\u037b\u0390\7)\2\2\u037c\u0390\7*\2\2\u037d"+
		"\u0390\7+\2\2\u037e\u0390\7,\2\2\u037f\u0390\7-\2\2\u0380\u0390\7.\2\2"+
		"\u0381\u0390\7/\2\2\u0382\u0390\7\30\2\2\u0383\u0390\7\31\2\2\u0384\u0390"+
		"\7\60\2\2\u0385\u0390\7\61\2\2\u0386\u0390\7\62\2\2\u0387\u0390\7\63\2"+
		"\2\u0388\u0390\7\17\2\2\u0389\u0390\7\64\2\2\u038a\u0390\7\65\2\2\u038b"+
		"\u038c\7\3\2\2\u038c\u0390\7\4\2\2\u038d\u038e\7\33\2\2\u038e\u0390\7"+
		"\34\2\2\u038f\u0362\3\2\2\2\u038f\u0367\3\2\2\2\u038f\u0368\3\2\2\2\u038f"+
		"\u0369\3\2\2\2\u038f\u036a\3\2\2\2\u038f\u036b\3\2\2\2\u038f\u036c\3\2"+
		"\2\2\u038f\u036d\3\2\2\2\u038f\u036e\3\2\2\2\u038f\u036f\3\2\2\2\u038f"+
		"\u0370\3\2\2\2\u038f\u0371\3\2\2\2\u038f\u0372\3\2\2\2\u038f\u0373\3\2"+
		"\2\2\u038f\u0374\3\2\2\2\u038f\u0375\3\2\2\2\u038f\u0376\3\2\2\2\u038f"+
		"\u0377\3\2\2\2\u038f\u0378\3\2\2\2\u038f\u0379\3\2\2\2\u038f\u037a\3\2"+
		"\2\2\u038f\u037b\3\2\2\2\u038f\u037c\3\2\2\2\u038f\u037d\3\2\2\2\u038f"+
		"\u037e\3\2\2\2\u038f\u037f\3\2\2\2\u038f\u0380\3\2\2\2\u038f\u0381\3\2"+
		"\2\2\u038f\u0382\3\2\2\2\u038f\u0383\3\2\2\2\u038f\u0384\3\2\2\2\u038f"+
		"\u0385\3\2\2\2\u038f\u0386\3\2\2\2\u038f\u0387\3\2\2\2\u038f\u0388\3\2"+
		"\2\2\u038f\u0389\3\2\2\2\u038f\u038a\3\2\2\2\u038f\u038b\3\2\2\2\u038f"+
		"\u038d\3\2\2\2\u0390]\3\2\2\2\u0391\u0392\t\13\2\2\u0392_\3\2\2\2\u0393"+
		"\u0394\t\f\2\2\u0394a\3\2\2\2\u0395\u0396\7d\2\2\u0396\u0397\7\26\2\2"+
		"\u0397\u0398\5d\63\2\u0398\u0399\7\27\2\2\u0399c\3\2\2\2\u039a\u039b\7"+
		"\26\2\2\u039b\u039c\5d\63\2\u039c\u039d\7\27\2\2\u039d\u03a4\3\2\2\2\u039e"+
		"\u039f\7\3\2\2\u039f\u03a0\5d\63\2\u03a0\u03a1\7\4\2\2\u03a1\u03a4\3\2"+
		"\2\2\u03a2\u03a4\5l\67\2\u03a3\u039a\3\2\2\2\u03a3\u039e\3\2\2\2\u03a3"+
		"\u03a2\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a3\3\2\2\2\u03a5\u03a6\3\2"+
		"\2\2\u03a6e\3\2\2\2\u03a7\u03a8\n\r\2\2\u03a8g\3\2\2\2\u03a9\u03aa\n\16"+
		"\2\2\u03aai\3\2\2\2\u03ab\u03ac\n\17\2\2\u03ack\3\2\2\2\u03ad\u03ae\n"+
		"\20\2\2\u03aem\3\2\2\2\u03af\u03b0\n\21\2\2\u03b0o\3\2\2\2\u03b1\u03b2"+
		"\n\22\2\2\u03b2q\3\2\2\2\u03b3\u03b4\n\23\2\2\u03b4s\3\2\2\2\u03b5\u03b6"+
		"\n\24\2\2\u03b6u\3\2\2\2\u03b7\u03b8\n\25\2\2\u03b8w\3\2\2\2\u03b9\u03ba"+
		"\n\16\2\2\u03bay\3\2\2\2\u03bb\u03bc\13\2\2\2\u03bc{\3\2\2\2\u03bd\u03c3"+
		"\5~@\2\u03be\u03c3\5\u0080A\2\u03bf\u03c3\5\u0082B\2\u03c0\u03c3\5\u0086"+
		"D\2\u03c1\u03c3\5\u0088E\2\u03c2\u03bd\3\2\2\2\u03c2\u03be\3\2\2\2\u03c2"+
		"\u03bf\3\2\2\2\u03c2\u03c0\3\2\2\2\u03c2\u03c1\3\2\2\2\u03c3}\3\2\2\2"+
		"\u03c4\u03c5\5.\30\2\u03c5\u03c6\7\17\2\2\u03c6\u03c8\3\2\2\2\u03c7\u03c4"+
		"\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03c7\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca"+
		"\177\3\2\2\2\u03cb\u03cc\7X\2\2\u03cc\u03ce\7\66\2\2\u03cd\u03cf\7y\2"+
		"\2\u03ce\u03cd\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u0081\3\2\2\2\u03d0\u03d2"+
		"\5\66\34\2\u03d1\u03d3\7D\2\2\u03d2\u03d1\3\2\2\2\u03d2\u03d3\3\2\2\2"+
		"\u03d3\u03d5\3\2\2\2\u03d4\u03d6\5.\30\2\u03d5\u03d4\3\2\2\2\u03d5\u03d6"+
		"\3\2\2\2\u03d6\u03d8\3\2\2\2\u03d7\u03d9\7D\2\2\u03d8\u03d7\3\2\2\2\u03d8"+
		"\u03d9\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03dc\5\66\34\2\u03db\u03dd\7"+
		"D\2\2\u03dc\u03db\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03de\3\2\2\2\u03de"+
		"\u03df\5\u00b0Y\2\u03df\u0083\3\2\2\2\u03e0\u03e1\7\7\2\2\u03e1\u03e2"+
		"\7\3\2\2\u03e2\u03e3\5\u00a2R\2\u03e3\u03e4\7\4\2\2\u03e4\u0085\3\2\2"+
		"\2\u03e5\u03e6\7w\2\2\u03e6\u0087\3\2\2\2\u03e7\u03e8\7\67\2\2\u03e8\u03e9"+
		"\7D\2\2\u03e9\u03ea\78\2\2\u03ea\u03eb\7D\2\2\u03eb\u03ec\79\2\2\u03ec"+
		"\u0089\3\2\2\2\u03ed\u03ef\5b\62\2\u03ee\u03ed\3\2\2\2\u03ee\u03ef\3\2"+
		"\2\2\u03ef\u03f1\3\2\2\2\u03f0\u03f2\5\u008eH\2\u03f1\u03f0\3\2\2\2\u03f1"+
		"\u03f2\3\2\2\2\u03f2\u03fa\3\2\2\2\u03f3\u03f7\5:\36\2\u03f4\u03f6\5\u0112"+
		"\u008a\2\u03f5\u03f4\3\2\2\2\u03f6\u03f9\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f7"+
		"\u03f8\3\2\2\2\u03f8\u03fb\3\2\2\2\u03f9\u03f7\3\2\2\2\u03fa\u03f3\3\2"+
		"\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u0400\5\u00a2R\2\u03fd"+
		"\u03ff\5\u0112\u008a\2\u03fe\u03fd\3\2\2\2\u03ff\u0402\3\2\2\2\u0400\u03fe"+
		"\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0403\3\2\2\2\u0402\u0400\3\2\2\2\u0403"+
		"\u0405\5\u0090I\2\u0404\u0406\5\u009aN\2\u0405\u0404\3\2\2\2\u0405\u0406"+
		"\3\2\2\2\u0406\u040a\3\2\2\2\u0407\u0409\5\u0112\u008a\2\u0408\u0407\3"+
		"\2\2\2\u0409\u040c\3\2\2\2\u040a\u0408\3\2\2\2\u040a\u040b\3\2\2\2\u040b"+
		"\u040d\3\2\2\2\u040c\u040a\3\2\2\2\u040d\u040e\5\u0098M\2\u040e\u041c"+
		"\3\2\2\2\u040f\u0411\5\u008eH\2\u0410\u040f\3\2\2\2\u0410\u0411\3\2\2"+
		"\2\u0411\u0412\3\2\2\2\u0412\u0416\5\u008cG\2\u0413\u0415\5\u0112\u008a"+
		"\2\u0414\u0413\3\2\2\2\u0415\u0418\3\2\2\2\u0416\u0414\3\2\2\2\u0416\u0417"+
		"\3\2\2\2\u0417\u0419\3\2\2\2\u0418\u0416\3\2\2\2\u0419\u041a\5\u0098M"+
		"\2\u041a\u041c\3\2\2\2\u041b\u03ee\3\2\2\2\u041b\u0410\3\2\2\2\u041c\u008b"+
		"\3\2\2\2\u041d\u041e\5\66\34\2\u041e\u008d\3\2\2\2\u041f\u0423\5V,\2\u0420"+
		"\u0422\5\u0112\u008a\2\u0421\u0420\3\2\2\2\u0422\u0425\3\2\2\2\u0423\u0421"+
		"\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u0427\3\2\2\2\u0425\u0423\3\2\2\2\u0426"+
		"\u041f\3\2\2\2\u0427\u042a\3\2\2\2\u0428\u0426\3\2\2\2\u0428\u0429\3\2"+
		"\2\2\u0429\u042b\3\2\2\2\u042a\u0428\3\2\2\2\u042b\u042c\5\u00ba^\2\u042c"+
		"\u0436\3\2\2\2\u042d\u0431\5X-\2\u042e\u0430\5\u0112\u008a\2\u042f\u042e"+
		"\3\2\2\2\u0430\u0433\3\2\2\2\u0431\u042f\3\2\2\2\u0431\u0432\3\2\2\2\u0432"+
		"\u0435\3\2\2\2\u0433\u0431\3\2\2\2\u0434\u042d\3\2\2\2\u0435\u0438\3\2"+
		"\2\2\u0436\u0434\3\2\2\2\u0436\u0437\3\2\2\2\u0437\u0441\3\2\2\2\u0438"+
		"\u0436\3\2\2\2\u0439\u043d\5\66\34\2\u043a\u043c\5\u0112\u008a\2\u043b"+
		"\u043a\3\2\2\2\u043c\u043f\3\2\2\2\u043d\u043b\3\2\2\2\u043d\u043e\3\2"+
		"\2\2\u043e\u0441\3\2\2\2\u043f\u043d\3\2\2\2\u0440\u0428\3\2\2\2\u0440"+
		"\u0439\3\2\2\2\u0441\u008f\3\2\2\2\u0442\u0446\7\3\2\2\u0443\u0445\5\u0112"+
		"\u008a\2\u0444\u0443\3\2\2\2\u0445\u0448\3\2\2\2\u0446\u0444\3\2\2\2\u0446"+
		"\u0447\3\2\2\2\u0447\u044a\3\2\2\2\u0448\u0446\3\2\2\2\u0449\u044b\5\u0092"+
		"J\2\u044a\u0449\3\2\2\2\u044a\u044b\3\2\2\2\u044b\u044f\3\2\2\2\u044c"+
		"\u044e\5\u0112\u008a\2\u044d\u044c\3\2\2\2\u044e\u0451\3\2\2\2\u044f\u044d"+
		"\3\2\2\2\u044f\u0450\3\2\2\2\u0450\u0452\3\2\2\2\u0451\u044f\3\2\2\2\u0452"+
		"\u0454\7\4\2\2\u0453\u0455\7\21\2\2\u0454\u0453\3\2\2\2\u0454\u0455\3"+
		"\2\2\2\u0455\u045f\3\2\2\2\u0456\u045a\7W\2\2\u0457\u0459\5\u0112\u008a"+
		"\2\u0458\u0457\3\2\2\2\u0459\u045c\3\2\2\2\u045a\u0458\3\2\2\2\u045a\u045b"+
		"\3\2\2\2\u045b\u045e\3\2\2\2\u045c\u045a\3\2\2\2\u045d\u0456\3\2\2\2\u045e"+
		"\u0461\3\2\2\2\u045f\u045d\3\2\2\2\u045f\u0460\3\2\2\2\u0460\u0463\3\2"+
		"\2\2\u0461\u045f\3\2\2\2\u0462\u0464\5\u00a4S\2\u0463\u0462\3\2\2\2\u0463"+
		"\u0464\3\2\2\2\u0464\u04a2\3\2\2\2\u0465\u0469\7\3\2\2\u0466\u0468\5\u0112"+
		"\u008a\2\u0467\u0466\3\2\2\2\u0468\u046b\3\2\2\2\u0469\u0467\3\2\2\2\u0469"+
		"\u046a\3\2\2\2\u046a\u046c\3\2\2\2\u046b\u0469\3\2\2\2\u046c\u0477\5\u00be"+
		"`\2\u046d\u0471\7\17\2\2\u046e\u0470\5\u0112\u008a\2\u046f\u046e\3\2\2"+
		"\2\u0470\u0473\3\2\2\2\u0471\u046f\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0474"+
		"\3\2\2\2\u0473\u0471\3\2\2\2\u0474\u0476\5\u00be`\2\u0475\u046d\3\2\2"+
		"\2\u0476\u0479\3\2\2\2\u0477\u0475\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u047d"+
		"\3\2\2\2\u0479\u0477\3\2\2\2\u047a\u047c\5\u0112\u008a\2\u047b\u047a\3"+
		"\2\2\2\u047c\u047f\3\2\2\2\u047d\u047b\3\2\2\2\u047d\u047e\3\2\2\2\u047e"+
		"\u0480\3\2\2\2\u047f\u047d\3\2\2\2\u0480\u0484\7\4\2\2\u0481\u0483\5\u0112"+
		"\u008a\2\u0482\u0481\3\2\2\2\u0483\u0486\3\2\2\2\u0484\u0482\3\2\2\2\u0484"+
		"\u0485\3\2\2\2\u0485\u049d\3\2\2\2\u0486\u0484\3\2\2\2\u0487\u0488\5\u00ba"+
		"^\2\u0488\u0493\5\u0096L\2\u0489\u048d\7\17\2\2\u048a\u048c\5\u0112\u008a"+
		"\2\u048b\u048a\3\2\2\2\u048c\u048f\3\2\2\2\u048d\u048b\3\2\2\2\u048d\u048e"+
		"\3\2\2\2\u048e\u0490\3\2\2\2\u048f\u048d\3\2\2\2\u0490\u0492\5\u0096L"+
		"\2\u0491\u0489\3\2\2\2\u0492\u0495\3\2\2\2\u0493\u0491\3\2\2\2\u0493\u0494"+
		"\3\2\2\2\u0494\u0496\3\2\2\2\u0495\u0493\3\2\2\2\u0496\u049a\7\5\2\2\u0497"+
		"\u0499\5\u0112\u008a\2\u0498\u0497\3\2\2\2\u0499\u049c\3\2\2\2\u049a\u0498"+
		"\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u049e\3\2\2\2\u049c\u049a\3\2\2\2\u049d"+
		"\u0487\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u049d\3\2\2\2\u049f\u04a0\3\2"+
		"\2\2\u04a0\u04a2\3\2\2\2\u04a1\u0442\3\2\2\2\u04a1\u0465\3\2\2\2\u04a2"+
		"\u0091\3\2\2\2\u04a3\u04a5\5\u0112\u008a\2\u04a4\u04a3\3\2\2\2\u04a5\u04a8"+
		"\3\2\2\2\u04a6\u04a4\3\2\2\2\u04a6\u04a7\3\2\2\2\u04a7\u04a9\3\2\2\2\u04a8"+
		"\u04a6\3\2\2\2\u04a9\u04ba\5\u0094K\2\u04aa\u04ac\5\u0112\u008a\2\u04ab"+
		"\u04aa\3\2\2\2\u04ac\u04af\3\2\2\2\u04ad\u04ab\3\2\2\2\u04ad\u04ae\3\2"+
		"\2\2\u04ae\u04b0\3\2\2\2\u04af\u04ad\3\2\2\2\u04b0\u04b4\7\17\2\2\u04b1"+
		"\u04b3\5\u0112\u008a\2\u04b2\u04b1\3\2\2\2\u04b3\u04b6\3\2\2\2\u04b4\u04b2"+
		"\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5\u04b7\3\2\2\2\u04b6\u04b4\3\2\2\2\u04b7"+
		"\u04b9\5\u0094K\2\u04b8\u04ad\3\2\2\2\u04b9\u04bc\3\2\2\2\u04ba\u04b8"+
		"\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bb\u04cb\3\2\2\2\u04bc\u04ba\3\2\2\2\u04bd"+
		"\u04bf\5\u0112\u008a\2\u04be\u04bd\3\2\2\2\u04bf\u04c2\3\2\2\2\u04c0\u04be"+
		"\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1\u04c3\3\2\2\2\u04c2\u04c0\3\2\2\2\u04c3"+
		"\u04c7\7\17\2\2\u04c4\u04c6\5\u0112\u008a\2\u04c5\u04c4\3\2\2\2\u04c6"+
		"\u04c9\3\2\2\2\u04c7\u04c5\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04ca\3\2"+
		"\2\2\u04c9\u04c7\3\2\2\2\u04ca\u04cc\7F\2\2\u04cb\u04c0\3\2\2\2\u04cb"+
		"\u04cc\3\2\2\2\u04cc\u0093\3\2\2\2\u04cd\u04d2\7T\2\2\u04ce\u04cf\5\u00ba"+
		"^\2\u04cf\u04d0\5\u0096L\2\u04d0\u04d2\3\2\2\2\u04d1\u04cd\3\2\2\2\u04d1"+
		"\u04ce\3\2\2\2\u04d2\u0095\3\2\2\2\u04d3\u04d5\5\u00caf\2\u04d4\u04d3"+
		"\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04db\3\2\2\2\u04d6\u04d7\7\3\2\2\u04d7"+
		"\u04d8\5\u0096L\2\u04d8\u04d9\7\4\2\2\u04d9\u04dc\3\2\2\2\u04da\u04dc"+
		"\5\u00be`\2\u04db\u04d6\3\2\2\2\u04db\u04da\3\2\2\2\u04dc\u04de\3\2\2"+
		"\2\u04dd\u04df\5\u0118\u008d\2\u04de\u04dd\3\2\2\2\u04de\u04df\3\2\2\2"+
		"\u04df\u0097\3\2\2\2\u04e0\u04e1\7y\2\2\u04e1\u04e2\bM\1\2\u04e2\u0099"+
		"\3\2\2\2\u04e3\u04e4\7\6\2\2\u04e4\u04e9\5\u009cO\2\u04e5\u04e6\7\17\2"+
		"\2\u04e6\u04e8\5\u009cO\2\u04e7\u04e5\3\2\2\2\u04e8\u04eb\3\2\2\2\u04e9"+
		"\u04e7\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u009b\3\2\2\2\u04eb\u04e9\3\2"+
		"\2\2\u04ec\u04ed\5\u009eP\2\u04ed\u04ee\5\u00a0Q\2\u04ee\u009d\3\2\2\2"+
		"\u04ef\u04f1\7:\2\2\u04f0\u04ef\3\2\2\2\u04f0\u04f1\3\2\2\2\u04f1\u04f2"+
		"\3\2\2\2\u04f2\u04f3\5\u00c6d\2\u04f3\u009f\3\2\2\2\u04f4\u04f6\7\3\2"+
		"\2\u04f5\u04f7\5\u00ceh\2\u04f6\u04f5\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7"+
		"\u04f8\3\2\2\2\u04f8\u04f9\7\4\2\2\u04f9\u00a1\3\2\2\2\u04fa\u0502\5\u00c6"+
		"d\2\u04fb\u04fc\7\3\2\2\u04fc\u04fd\5\u00a2R\2\u04fd\u04fe\7\4\2\2\u04fe"+
		"\u0502\3\2\2\2\u04ff\u0500\7c\2\2\u0500\u0502\5\\/\2\u0501\u04fa\3\2\2"+
		"\2\u0501\u04fb\3\2\2\2\u0501\u04ff\3\2\2\2\u0502\u00a3\3\2\2\2\u0503\u0504"+
		"\7]\2\2\u0504\u0505\7\3\2\2\u0505\u0506\5\u00a6T\2\u0506\u0507\7\4\2\2"+
		"\u0507\u00a5\3\2\2\2\u0508\u050a\5f\64\2\u0509\u0508\3\2\2\2\u050a\u050d"+
		"\3\2\2\2\u050b\u0509\3\2\2\2\u050b\u050c\3\2\2\2\u050c\u0519\3\2\2\2\u050d"+
		"\u050b\3\2\2\2\u050e\u050f\7\3\2\2\u050f\u0510\5\u00a6T\2\u0510\u0514"+
		"\7\4\2\2\u0511\u0513\5f\64\2\u0512\u0511\3\2\2\2\u0513\u0516\3\2\2\2\u0514"+
		"\u0512\3\2\2\2\u0514\u0515\3\2\2\2\u0515\u0518\3\2\2\2\u0516\u0514\3\2"+
		"\2\2\u0517\u050e\3\2\2\2\u0518\u051b\3\2\2\2\u0519\u0517\3\2\2\2\u0519"+
		"\u051a\3\2\2\2\u051a\u00a7\3\2\2\2\u051b\u0519\3\2\2\2\u051c\u051d\5\u00aa"+
		"V\2\u051d\u00a9\3\2\2\2\u051e\u0520\5b\62\2\u051f\u051e\3\2\2\2\u051f"+
		"\u0520\3\2\2\2\u0520\u0521\3\2\2\2\u0521\u0525\5\u00b2Z\2\u0522\u0524"+
		"\5\u0112\u008a\2\u0523\u0522\3\2\2\2\u0524\u0527\3\2\2\2\u0525\u0523\3"+
		"\2\2\2\u0525\u0526\3\2\2\2\u0526\u0529\3\2\2\2\u0527\u0525\3\2\2\2\u0528"+
		"\u052a\5\u00b0Y\2\u0529\u0528\3\2\2\2\u0529\u052a\3\2\2\2\u052a\u052d"+
		"\3\2\2\2\u052b\u052e\5:\36\2\u052c\u052e\5\66\34\2\u052d\u052b\3\2\2\2"+
		"\u052d\u052c\3\2\2\2\u052d\u052e\3\2\2\2\u052e\u05b4\3\2\2\2\u052f\u0533"+
		"\7R\2\2\u0530\u0532\5\u0112\u008a\2\u0531\u0530\3\2\2\2\u0532\u0535\3"+
		"\2\2\2\u0533\u0531\3\2\2\2\u0533\u0534\3\2\2\2\u0534\u0537\3\2\2\2\u0535"+
		"\u0533\3\2\2\2\u0536\u052f\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u053f\3\2"+
		"\2\2\u0538\u053c\5b\62\2\u0539\u053b\5\u0112\u008a\2\u053a\u0539\3\2\2"+
		"\2\u053b\u053e\3\2\2\2\u053c\u053a\3\2\2\2\u053c\u053d\3\2\2\2\u053d\u0540"+
		"\3\2\2\2\u053e\u053c\3\2\2\2\u053f\u0538\3\2\2\2\u053f\u0540\3\2\2\2\u0540"+
		"\u0541\3\2\2\2\u0541\u0545\5\u00ba^\2\u0542\u0544\5\u0112\u008a\2\u0543"+
		"\u0542\3\2\2\2\u0544\u0547\3\2\2\2\u0545\u0543\3\2\2\2\u0545\u0546\3\2"+
		"\2\2\u0546\u0548\3\2\2\2\u0547\u0545\3\2\2\2\u0548\u0549\5\u00b0Y\2\u0549"+
		"\u05b4\3\2\2\2\u054a\u054e\7R\2\2\u054b\u054d\5\u0112\u008a\2\u054c\u054b"+
		"\3\2\2\2\u054d\u0550\3\2\2\2\u054e\u054c\3\2\2\2\u054e\u054f\3\2\2\2\u054f"+
		"\u0552\3\2\2\2\u0550\u054e\3\2\2\2\u0551\u054a\3\2\2\2\u0551\u0552\3\2"+
		"\2\2\u0552\u0553\3\2\2\2\u0553\u0557\5\u00ba^\2\u0554\u0556\5\u0112\u008a"+
		"\2\u0555\u0554\3\2\2\2\u0556\u0559\3\2\2\2\u0557\u0555\3\2\2\2\u0557\u0558"+
		"\3\2\2\2\u0558\u055b\3\2\2\2\u0559\u0557\3\2\2\2\u055a\u055c\7\3\2\2\u055b"+
		"\u055a\3\2\2\2\u055b\u055c\3\2\2\2\u055c\u0560\3\2\2\2\u055d\u055f\5\u0112"+
		"\u008a\2\u055e\u055d\3\2\2\2\u055f\u0562\3\2\2\2\u0560\u055e\3\2\2\2\u0560"+
		"\u0561\3\2\2\2\u0561\u0564\3\2\2\2\u0562\u0560\3\2\2\2\u0563\u0565\5\u00ac"+
		"W\2\u0564\u0563\3\2\2\2\u0564\u0565\3\2\2\2\u0565\u0569\3\2\2\2\u0566"+
		"\u0568\5\u0112\u008a\2\u0567\u0566\3\2\2\2\u0568\u056b\3\2\2\2\u0569\u0567"+
		"\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u056c\3\2\2\2\u056b\u0569\3\2\2\2\u056c"+
		"\u056e\5X-\2\u056d\u056f\7\3\2\2\u056e\u056d\3\2\2\2\u056e\u056f\3\2\2"+
		"\2\u056f\u0573\3\2\2\2\u0570\u0572\5\u0112\u008a\2\u0571\u0570\3\2\2\2"+
		"\u0572\u0575\3\2\2\2\u0573\u0571\3\2\2\2\u0573\u0574\3\2\2\2\u0574\u0577"+
		"\3\2\2\2\u0575\u0573\3\2\2\2\u0576\u0578\5\u00c6d\2\u0577\u0576\3\2\2"+
		"\2\u0577\u0578\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u057d\7\4\2\2\u057a\u057c"+
		"\5\u0112\u008a\2\u057b\u057a\3\2\2\2\u057c\u057f\3\2\2\2\u057d\u057b\3"+
		"\2\2\2\u057d\u057e\3\2\2\2\u057e\u0580\3\2\2\2\u057f\u057d\3\2\2\2\u0580"+
		"\u0584\5\u00c0a\2\u0581\u0583\5\u0112\u008a\2\u0582\u0581\3\2\2\2\u0583"+
		"\u0586\3\2\2\2\u0584\u0582\3\2\2\2\u0584\u0585\3\2\2\2\u0585\u0589\3\2"+
		"\2\2\u0586\u0584\3\2\2\2\u0587\u058a\5:\36\2\u0588\u058a\5\66\34\2\u0589"+
		"\u0587\3\2\2\2\u0589\u0588\3\2\2\2\u0589\u058a\3\2\2\2\u058a\u0593\3\2"+
		"\2\2\u058b\u058f\7!\2\2\u058c\u058e\5\u0112\u008a\2\u058d\u058c\3\2\2"+
		"\2\u058e\u0591\3\2\2\2\u058f\u058d\3\2\2\2\u058f\u0590\3\2\2\2\u0590\u0592"+
		"\3\2\2\2\u0591\u058f\3\2\2\2\u0592\u0594\5\u010a\u0086\2\u0593\u058b\3"+
		"\2\2\2\u0593\u0594\3\2\2\2\u0594\u0595\3\2\2\2\u0595\u0596\7\5\2\2\u0596"+
		"\u05b4\3\2\2\2\u0597\u059b\7W\2\2\u0598\u059b\5V,\2\u0599\u059b\7R\2\2"+
		"\u059a\u0597\3\2\2\2\u059a\u0598\3\2\2\2\u059a\u0599\3\2\2\2\u059b\u059c"+
		"\3\2\2\2\u059c\u059a\3\2\2\2\u059c\u059d\3\2\2\2\u059d\u05a1\3\2\2\2\u059e"+
		"\u05a0\5\u0112\u008a\2\u059f\u059e\3\2\2\2\u05a0\u05a3\3\2\2\2\u05a1\u059f"+
		"\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05a5\3\2\2\2\u05a3\u05a1\3\2\2\2\u05a4"+
		"\u059a\3\2\2\2\u05a4\u05a5\3\2\2\2\u05a5\u05a6\3\2\2\2\u05a6\u05aa\5\u00ae"+
		"X\2\u05a7\u05a9\5\u0112\u008a\2\u05a8\u05a7\3\2\2\2\u05a9\u05ac\3\2\2"+
		"\2\u05aa\u05a8\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab\u05ae\3\2\2\2\u05ac\u05aa"+
		"\3\2\2\2\u05ad\u05af\5\u00b0Y\2\u05ae\u05ad\3\2\2\2\u05ae\u05af\3\2\2"+
		"\2\u05af\u05b1\3\2\2\2\u05b0\u05b2\7\5\2\2\u05b1\u05b0\3\2\2\2\u05b1\u05b2"+
		"\3\2\2\2\u05b2\u05b4\3\2\2\2\u05b3\u051f\3\2\2\2\u05b3\u0536\3\2\2\2\u05b3"+
		"\u0551\3\2\2\2\u05b3\u05a4\3\2\2\2\u05b4\u00ab\3\2\2\2\u05b5\u05b7\7x"+
		"\2\2\u05b6\u05b5\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05b6\3\2\2\2\u05b8"+
		"\u05b9\3\2\2\2\u05b9\u00ad\3\2\2\2\u05ba\u05be\7b\2\2\u05bb\u05bd\5\u0112"+
		"\u008a\2\u05bc\u05bb\3\2\2\2\u05bd\u05c0\3\2\2\2\u05be\u05bc\3\2\2\2\u05be"+
		"\u05bf\3\2\2\2\u05bf\u05c2\3\2\2\2\u05c0\u05be\3\2\2\2\u05c1\u05c3\5:"+
		"\36\2\u05c2\u05c1\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u05cb\3\2\2\2\u05c4"+
		"\u05c8\5\u00c6d\2\u05c5\u05c7\5\u0112\u008a\2\u05c6\u05c5\3\2\2\2\u05c7"+
		"\u05ca\3\2\2\2\u05c8\u05c6\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u05cc\3\2"+
		"\2\2\u05ca\u05c8\3\2\2\2\u05cb\u05c4\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc"+
		"\u05ce\3\2\2\2\u05cd\u05cf\5:\36\2\u05ce\u05cd\3\2\2\2\u05ce\u05cf\3\2"+
		"\2\2\u05cf\u05d0\3\2\2\2\u05d0\u05d1\7y\2\2\u05d1\u05f9\bX\1\2\u05d2\u05d6"+
		"\7b\2\2\u05d3\u05d5\5\u0112\u008a\2\u05d4\u05d3\3\2\2\2\u05d5\u05d8\3"+
		"\2\2\2\u05d6\u05d4\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7\u05da\3\2\2\2\u05d8"+
		"\u05d6\3\2\2\2\u05d9\u05db\5:\36\2\u05da\u05d9\3\2\2\2\u05da\u05db\3\2"+
		"\2\2\u05db\u05dc\3\2\2\2\u05dc\u05e0\5\u00c6d\2\u05dd\u05df\5\u0112\u008a"+
		"\2\u05de\u05dd\3\2\2\2\u05df\u05e2\3\2\2\2\u05e0\u05de\3\2\2\2\u05e0\u05e1"+
		"\3\2\2\2\u05e1\u05e4\3\2\2\2\u05e2\u05e0\3\2\2\2\u05e3\u05e5\5\u00caf"+
		"\2\u05e4\u05e3\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5\u05e6\3\2\2\2\u05e6\u05e8"+
		"\5\u00c6d\2\u05e7\u05e9\5\u00caf\2\u05e8\u05e7\3\2\2\2\u05e8\u05e9\3\2"+
		"\2\2\u05e9\u05ea\3\2\2\2\u05ea\u05eb\7!\2\2\u05eb\u05ec\bX\1\2\u05ec\u05f9"+
		"\3\2\2\2\u05ed\u05f1\7b\2\2\u05ee\u05f0\5\u0112\u008a\2\u05ef\u05ee\3"+
		"\2\2\2\u05f0\u05f3\3\2\2\2\u05f1\u05ef\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2"+
		"\u05f5\3\2\2\2\u05f3\u05f1\3\2\2\2\u05f4\u05f6\5:\36\2\u05f5\u05f4\3\2"+
		"\2\2\u05f5\u05f6\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u05f9\5\u00c6d\2\u05f8"+
		"\u05ba\3\2\2\2\u05f8\u05d2\3\2\2\2\u05f8\u05ed\3\2\2\2\u05f9\u00af\3\2"+
		"\2\2\u05fa\u060b\5\u0114\u008b\2\u05fb\u05fd\5\u0112\u008a\2\u05fc\u05fb"+
		"\3\2\2\2\u05fd\u0600\3\2\2\2\u05fe\u05fc\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff"+
		"\u0601\3\2\2\2\u0600\u05fe\3\2\2\2\u0601\u0605\7\17\2\2\u0602\u0604\5"+
		"\u0112\u008a\2\u0603\u0602\3\2\2\2\u0604\u0607\3\2\2\2\u0605\u0603\3\2"+
		"\2\2\u0605\u0606\3\2\2\2\u0606\u0608\3\2\2\2\u0607\u0605\3\2\2\2\u0608"+
		"\u060a\5\u0114\u008b\2\u0609\u05fe\3\2\2\2\u060a\u060d\3\2\2\2\u060b\u0609"+
		"\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u0611\3\2\2\2\u060d\u060b\3\2\2\2\u060e"+
		"\u0610\5\u0112\u008a\2\u060f\u060e\3\2\2\2\u0610\u0613\3\2\2\2\u0611\u060f"+
		"\3\2\2\2\u0611\u0612\3\2\2\2\u0612\u0616\3\2\2\2\u0613\u0611\3\2\2\2\u0614"+
		"\u0617\5:\36\2\u0615\u0617\5\66\34\2\u0616\u0614\3\2\2\2\u0616\u0615\3"+
		"\2\2\2\u0616\u0617\3\2\2\2\u0617\u0618\3\2\2\2\u0618\u0619\7\5\2\2\u0619"+
		"\u00b1\3\2\2\2\u061a\u061e\7e\2\2\u061b\u061d\5\u0112\u008a\2\u061c\u061b"+
		"\3\2\2\2\u061d\u0620\3\2\2\2\u061e\u061c\3\2\2\2\u061e\u061f\3\2\2\2\u061f"+
		"\u0622\3\2\2\2\u0620\u061e\3\2\2\2\u0621\u0623\5\u00b4[\2\u0622\u0621"+
		"\3\2\2\2\u0622\u0623\3\2\2\2\u0623\u0625\3\2\2\2\u0624\u0626\5\u00b6\\"+
		"\2\u0625\u0624\3\2\2\2\u0625\u0626\3\2\2\2\u0626\u0627\3\2\2\2\u0627\u0628"+
		"\7y\2\2\u0628\u0629\bZ\1\2\u0629\u00b3\3\2\2\2\u062a\u062b\5\u00c6d\2"+
		"\u062b\u00b5\3\2\2\2\u062c\u062d\7\6\2\2\u062d\u0632\5\u00b8]\2\u062e"+
		"\u062f\7\17\2\2\u062f\u0631\5\u00b8]\2\u0630\u062e\3\2\2\2\u0631\u0634"+
		"\3\2\2\2\u0632\u0630\3\2\2\2\u0632\u0633\3\2\2\2\u0633\u00b7\3\2\2\2\u0634"+
		"\u0632\3\2\2\2\u0635\u0639\7Z\2\2\u0636\u0638\5\u0112\u008a\2\u0637\u0636"+
		"\3\2\2\2\u0638\u063b\3\2\2\2\u0639\u0637\3\2\2\2\u0639\u063a\3\2\2\2\u063a"+
		"\u063d\3\2\2\2\u063b\u0639\3\2\2\2\u063c\u0635\3\2\2\2\u063c\u063d\3\2"+
		"\2\2\u063d\u063f\3\2\2\2\u063e\u0640\5Z.\2\u063f\u063e\3\2\2\2\u063f\u0640"+
		"\3\2\2\2\u0640\u0641\3\2\2\2\u0641\u0642\5\u00c6d\2\u0642\u00b9\3\2\2"+
		"\2\u0643\u0647\7X\2\2\u0644\u0646\5\u0112\u008a\2\u0645\u0644\3\2\2\2"+
		"\u0646\u0649\3\2\2\2\u0647\u0645\3\2\2\2\u0647\u0648\3\2\2\2\u0648\u0689"+
		"\3\2\2\2\u0649\u0647\3\2\2\2\u064a\u0689\5V,\2\u064b\u064f\7W\2\2\u064c"+
		"\u064e\5\u0112\u008a\2\u064d\u064c\3\2\2\2\u064e\u0651\3\2\2\2\u064f\u064d"+
		"\3\2\2\2\u064f\u0650\3\2\2\2\u0650\u0689\3\2\2\2\u0651\u064f\3\2\2\2\u0652"+
		"\u0656\7U\2\2\u0653\u0655\5\u0112\u008a\2\u0654\u0653\3\2\2\2\u0655\u0658"+
		"\3\2\2\2\u0656\u0654\3\2\2\2\u0656\u0657\3\2\2\2\u0657\u0689\3\2\2\2\u0658"+
		"\u0656\3\2\2\2\u0659\u065d\7V\2\2\u065a\u065c\5\u0112\u008a\2\u065b\u065a"+
		"\3\2\2\2\u065c\u065f\3\2\2\2\u065d\u065b\3\2\2\2\u065d\u065e\3\2\2\2\u065e"+
		"\u0689\3\2\2\2\u065f\u065d\3\2\2\2\u0660\u0664\7`\2\2\u0661\u0663\5\u0112"+
		"\u008a\2\u0662\u0661\3\2\2\2\u0663\u0666\3\2\2\2\u0664\u0662\3\2\2\2\u0664"+
		"\u0665\3\2\2\2\u0665\u0689\3\2\2\2\u0666\u0664\3\2\2\2\u0667\u066b\7a"+
		"\2\2\u0668\u066a\5\u0112\u008a\2\u0669\u0668\3\2\2\2\u066a\u066d\3\2\2"+
		"\2\u066b\u0669\3\2\2\2\u066b\u066c\3\2\2\2\u066c\u0689\3\2\2\2\u066d\u066b"+
		"\3\2\2\2\u066e\u0672\5X-\2\u066f\u0671\5\u0112\u008a\2\u0670\u066f\3\2"+
		"\2\2\u0671\u0674\3\2\2\2\u0672\u0670\3\2\2\2\u0672\u0673\3\2\2\2\u0673"+
		"\u0689\3\2\2\2\u0674\u0672\3\2\2\2\u0675\u0689\5\u00bc_\2\u0676\u0677"+
		"\7\26\2\2\u0677\u0678\5d\63\2\u0678\u0679\7\27\2\2\u0679\u0684\3\2\2\2"+
		"\u067a\u067b\7:\2\2\u067b\u0680\5\u00bc_\2\u067c\u067d\7\26\2\2\u067d"+
		"\u067e\5d\63\2\u067e\u067f\7\27\2\2\u067f\u0681\3\2\2\2\u0680\u067c\3"+
		"\2\2\2\u0680\u0681\3\2\2\2\u0681\u0683\3\2\2\2\u0682\u067a\3\2\2\2\u0683"+
		"\u0686\3\2\2\2\u0684\u0682\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u0689\3\2"+
		"\2\2\u0686\u0684\3\2\2\2\u0687\u0689\5\66\34\2\u0688\u0643\3\2\2\2\u0688"+
		"\u064a\3\2\2\2\u0688\u064b\3\2\2\2\u0688\u0652\3\2\2\2\u0688\u0659\3\2"+
		"\2\2\u0688\u0660\3\2\2\2\u0688\u0667\3\2\2\2\u0688\u066e\3\2\2\2\u0688"+
		"\u0675\3\2\2\2\u0688\u0676\3\2\2\2\u0688\u0687\3\2\2\2\u0689\u068a\3\2"+
		"\2\2\u068a\u0688\3\2\2\2\u068a\u068b\3\2\2\2\u068b\u00bb\3\2\2\2\u068c"+
		"\u0690\7T\2\2\u068d\u068f\5\u0112\u008a\2\u068e\u068d\3\2\2\2\u068f\u0692"+
		"\3\2\2\2\u0690\u068e\3\2\2\2\u0690\u0691\3\2\2\2\u0691\u06be\3\2\2\2\u0692"+
		"\u0690\3\2\2\2\u0693\u0697\7\16\2\2\u0694\u0696\5\u0112\u008a\2\u0695"+
		"\u0694\3\2\2\2\u0696\u0699\3\2\2\2\u0697\u0695\3\2\2\2\u0697\u0698\3\2"+
		"\2\2\u0698\u06be\3\2\2\2\u0699\u0697\3\2\2\2\u069a\u069e\7;\2\2\u069b"+
		"\u069d\5\u0112\u008a\2\u069c\u069b\3\2\2\2\u069d\u06a0\3\2\2\2\u069e\u069c"+
		"\3\2\2\2\u069e\u069f\3\2\2\2\u069f\u06be\3\2\2\2\u06a0\u069e\3\2\2\2\u06a1"+
		"\u06a5\7<\2\2\u06a2\u06a4\5\u0112\u008a\2\u06a3\u06a2\3\2\2\2\u06a4\u06a7"+
		"\3\2\2\2\u06a5\u06a3\3\2\2\2\u06a5\u06a6\3\2\2\2\u06a6\u06be\3\2\2\2\u06a7"+
		"\u06a5\3\2\2\2\u06a8\u06ac\7b\2\2\u06a9\u06ab\5\u0112\u008a\2\u06aa\u06a9"+
		"\3\2\2\2\u06ab\u06ae\3\2\2\2\u06ac\u06aa\3\2\2\2\u06ac\u06ad\3\2\2\2\u06ad"+
		"\u06be\3\2\2\2\u06ae\u06ac\3\2\2\2\u06af\u06b3\7e\2\2\u06b0\u06b2\5\u0112"+
		"\u008a\2\u06b1\u06b0\3\2\2\2\u06b2\u06b5\3\2\2\2\u06b3\u06b1\3\2\2\2\u06b3"+
		"\u06b4\3\2\2\2\u06b4\u06be\3\2\2\2\u06b5\u06b3\3\2\2\2\u06b6\u06ba\7x"+
		"\2\2\u06b7\u06b9\5\u0112\u008a\2\u06b8\u06b7\3\2\2\2\u06b9\u06bc\3\2\2"+
		"\2\u06ba\u06b8\3\2\2\2\u06ba\u06bb\3\2\2\2\u06bb\u06be\3\2\2\2\u06bc\u06ba"+
		"\3\2\2\2\u06bd\u068c\3\2\2\2\u06bd\u0693\3\2\2\2\u06bd\u069a\3\2\2\2\u06bd"+
		"\u06a1\3\2\2\2\u06bd\u06a8\3\2\2\2\u06bd\u06af\3\2\2\2\u06bd\u06b6\3\2"+
		"\2\2\u06be\u06bf\3\2\2\2\u06bf\u06bd\3\2\2\2\u06bf\u06c0\3\2\2\2\u06c0"+
		"\u00bd\3\2\2\2\u06c1\u06c3\5\u00c6d\2\u06c2\u06c4\7D\2\2\u06c3\u06c2\3"+
		"\2\2\2\u06c3\u06c4\3\2\2\2\u06c4\u00bf\3\2\2\2\u06c5\u06c9\7\3\2\2\u06c6"+
		"\u06c8\5\u0112\u008a\2\u06c7\u06c6\3\2\2\2\u06c8\u06cb\3\2\2\2\u06c9\u06c7"+
		"\3\2\2\2\u06c9\u06ca\3\2\2\2\u06ca\u06cc\3\2\2\2\u06cb\u06c9\3\2\2\2\u06cc"+
		"\u06d0\7T\2\2\u06cd\u06cf\5\u0112\u008a\2\u06ce\u06cd\3\2\2\2\u06cf\u06d2"+
		"\3\2\2\2\u06d0\u06ce\3\2\2\2\u06d0\u06d1\3\2\2\2\u06d1\u06d3\3\2\2\2\u06d2"+
		"\u06d0\3\2\2\2\u06d3\u06f9\7\4\2\2\u06d4\u06d8\7\3\2\2\u06d5\u06d7\5\u0112"+
		"\u008a\2\u06d6\u06d5\3\2\2\2\u06d7\u06da\3\2\2\2\u06d8\u06d6\3\2\2\2\u06d8"+
		"\u06d9\3\2\2\2\u06d9\u06ef\3\2\2\2\u06da\u06d8\3\2\2\2\u06db\u06ec\5\u00c2"+
		"b\2\u06dc\u06de\5\u0112\u008a\2\u06dd\u06dc\3\2\2\2\u06de\u06e1\3\2\2"+
		"\2\u06df\u06dd\3\2\2\2\u06df\u06e0\3\2\2\2\u06e0\u06e2\3\2\2\2\u06e1\u06df"+
		"\3\2\2\2\u06e2\u06e6\7\17\2\2\u06e3\u06e5\5\u0112\u008a\2\u06e4\u06e3"+
		"\3\2\2\2\u06e5\u06e8\3\2\2\2\u06e6\u06e4\3\2\2\2\u06e6\u06e7\3\2\2\2\u06e7"+
		"\u06e9\3\2\2\2\u06e8\u06e6\3\2\2\2\u06e9\u06eb\5\u00c2b\2\u06ea\u06df"+
		"\3\2\2\2\u06eb\u06ee\3\2\2\2\u06ec\u06ea\3\2\2\2\u06ec\u06ed\3\2\2\2\u06ed"+
		"\u06f0\3\2\2\2\u06ee\u06ec\3\2\2\2\u06ef\u06db\3\2\2\2\u06ef\u06f0\3\2"+
		"\2\2\u06f0\u06f4\3\2\2\2\u06f1\u06f3\5\u0112\u008a\2\u06f2\u06f1\3\2\2"+
		"\2\u06f3\u06f6\3\2\2\2\u06f4\u06f2\3\2\2\2\u06f4\u06f5\3\2\2\2\u06f5\u06f7"+
		"\3\2\2\2\u06f6\u06f4\3\2\2\2\u06f7\u06f9\7\4\2\2\u06f8\u06c5\3\2\2\2\u06f8"+
		"\u06d4\3\2\2\2\u06f9\u00c1\3\2\2\2\u06fa\u06fe\5\u00ba^\2\u06fb\u06fd"+
		"\5\u0112\u008a\2\u06fc\u06fb\3\2\2\2\u06fd\u0700\3\2\2\2\u06fe\u06fc\3"+
		"\2\2\2\u06fe\u06ff\3\2\2\2\u06ff\u0701\3\2\2\2\u0700\u06fe\3\2\2\2\u0701"+
		"\u0702\5\u00c4c\2\u0702\u0705\3\2\2\2\u0703\u0705\7F\2\2\u0704\u06fa\3"+
		"\2\2\2\u0704\u0703\3\2\2\2\u0705\u00c3\3\2\2\2\u0706\u0708\5\u00caf\2"+
		"\u0707\u0706\3\2\2\2\u0707\u0708\3\2\2\2\u0708\u0710\3\2\2\2\u0709\u070a"+
		"\7\3\2\2\u070a\u070b\5\u00c4c\2\u070b\u070c\7\4\2\2\u070c\u0711\3\2\2"+
		"\2\u070d\u070f\5\u00be`\2\u070e\u070d\3\2\2\2\u070e\u070f\3\2\2\2\u070f"+
		"\u0711\3\2\2\2\u0710\u0709\3\2\2\2\u0710\u070e\3\2\2\2\u0711\u0713\3\2"+
		"\2\2\u0712\u0714\5\u0118\u008d\2\u0713\u0712\3\2\2\2\u0713\u0714\3\2\2"+
		"\2\u0714\u00c5\3\2\2\2\u0715\u071a\7x\2\2\u0716\u0717\7:\2\2\u0717\u0719"+
		"\7x\2\2\u0718\u0716\3\2\2\2\u0719\u071c\3\2\2\2\u071a\u0718\3\2\2\2\u071a"+
		"\u071b\3\2\2\2\u071b\u0721\3\2\2\2\u071c\u071a\3\2\2\2\u071d\u0721\7f"+
		"\2\2\u071e\u0721\7t\2\2\u071f\u0721\5Z.\2\u0720\u0715\3\2\2\2\u0720\u071d"+
		"\3\2\2\2\u0720\u071e\3\2\2\2\u0720\u071f\3\2\2\2\u0721\u00c7\3\2\2\2\u0722"+
		"\u0723\t\26\2\2\u0723\u00c9\3\2\2\2\u0724\u0726\5X-\2\u0725\u0727\7=\2"+
		"\2\u0726\u0725\3\2\2\2\u0726\u0727\3\2\2\2\u0727\u0729\3\2\2\2\u0728\u0724"+
		"\3\2\2\2\u0729\u072a\3\2\2\2\u072a\u0728\3\2\2\2\u072a\u072b\3\2\2\2\u072b"+
		"\u00cb\3\2\2\2\u072c\u072d\5\u00caf\2\u072d\u00cd\3\2\2\2\u072e\u073d"+
		"\5\u00d0i\2\u072f\u0731\5\u0112\u008a\2\u0730\u072f\3\2\2\2\u0731\u0734"+
		"\3\2\2\2\u0732\u0730\3\2\2\2\u0732\u0733\3\2\2\2\u0733\u0735\3\2\2\2\u0734"+
		"\u0732\3\2\2\2\u0735\u0739\7\17\2\2\u0736\u0738\5\u0112\u008a\2\u0737"+
		"\u0736\3\2\2\2\u0738\u073b\3\2\2\2\u0739\u0737\3\2\2\2\u0739\u073a\3\2"+
		"\2\2\u073a\u073c\3\2\2\2\u073b\u0739\3\2\2\2\u073c\u073e\5\u00ceh\2\u073d"+
		"\u0732\3\2\2\2\u073d\u073e\3\2\2\2\u073e\u00cf\3\2\2\2\u073f\u074f\5\u00d2"+
		"j\2\u0740\u0742\5\u0112\u008a\2\u0741\u0740\3\2\2\2\u0742\u0745\3\2\2"+
		"\2\u0743\u0741\3\2\2\2\u0743\u0744\3\2\2\2\u0744\u0746\3\2\2\2\u0745\u0743"+
		"\3\2\2\2\u0746\u074a\5^\60\2\u0747\u0749\5\u0112\u008a\2\u0748\u0747\3"+
		"\2\2\2\u0749\u074c\3\2\2\2\u074a\u0748\3\2\2\2\u074a\u074b\3\2\2\2\u074b"+
		"\u074d\3\2\2\2\u074c\u074a\3\2\2\2\u074d\u074e\5\u00d0i\2\u074e\u0750"+
		"\3\2\2\2\u074f\u0743\3\2\2\2\u074f\u0750\3\2\2\2\u0750\u00d1\3\2\2\2\u0751"+
		"\u0771\5\u00d4k\2\u0752\u0756\5\u00d4k\2\u0753\u0755\5\u0112\u008a\2\u0754"+
		"\u0753\3\2\2\2\u0755\u0758\3\2\2\2\u0756\u0754\3\2\2\2\u0756\u0757\3\2"+
		"\2\2\u0757\u0759\3\2\2\2\u0758\u0756\3\2\2\2\u0759\u075d\7>\2\2\u075a"+
		"\u075c\5\u0112\u008a\2\u075b\u075a\3\2\2\2\u075c\u075f\3\2\2\2\u075d\u075b"+
		"\3\2\2\2\u075d\u075e\3\2\2\2\u075e\u0760\3\2\2\2\u075f\u075d\3\2\2\2\u0760"+
		"\u0764\5\u00ceh\2\u0761\u0763\5\u0112\u008a\2\u0762\u0761\3\2\2\2\u0763"+
		"\u0766\3\2\2\2\u0764\u0762\3\2\2\2\u0764\u0765\3\2\2\2\u0765\u0767\3\2"+
		"\2\2\u0766\u0764\3\2\2\2\u0767\u076b\7\6\2\2\u0768\u076a\5\u0112\u008a"+
		"\2\u0769\u0768\3\2\2\2\u076a\u076d\3\2\2\2\u076b\u0769\3\2\2\2\u076b\u076c"+
		"\3\2\2\2\u076c\u076e\3\2\2\2\u076d\u076b\3\2\2\2\u076e\u076f\5\u00d2j"+
		"\2\u076f\u0771\3\2\2\2\u0770\u0751\3\2\2\2\u0770\u0752\3\2\2\2\u0771\u00d3"+
		"\3\2\2\2\u0772\u0781\5\u00d6l\2\u0773\u0775\5\u0112\u008a\2\u0774\u0773"+
		"\3\2\2\2\u0775\u0778\3\2\2\2\u0776\u0774\3\2\2\2\u0776\u0777\3\2\2\2\u0777"+
		"\u0779\3\2\2\2\u0778\u0776\3\2\2\2\u0779\u077d\7\61\2\2\u077a\u077c\5"+
		"\u0112\u008a\2\u077b\u077a\3\2\2\2\u077c\u077f\3\2\2\2\u077d\u077b\3\2"+
		"\2\2\u077d\u077e\3\2\2\2\u077e\u0780\3\2\2\2\u077f\u077d\3\2\2\2\u0780"+
		"\u0782\5\u00d4k\2\u0781\u0776\3\2\2\2\u0781\u0782\3\2\2\2\u0782\u00d5"+
		"\3\2\2\2\u0783\u0792\5\u00d8m\2\u0784\u0786\5\u0112\u008a\2\u0785\u0784"+
		"\3\2\2\2\u0786\u0789\3\2\2\2\u0787\u0785\3\2\2\2\u0787\u0788\3\2\2\2\u0788"+
		"\u078a\3\2\2\2\u0789\u0787\3\2\2\2\u078a\u078e\7\60\2\2\u078b\u078d\5"+
		"\u0112\u008a\2\u078c\u078b\3\2\2\2\u078d\u0790\3\2\2\2\u078e\u078c\3\2"+
		"\2\2\u078e\u078f\3\2\2\2\u078f\u0791\3\2\2\2\u0790\u078e\3\2\2\2\u0791"+
		"\u0793\5\u00d6l\2\u0792\u0787\3\2\2\2\u0792\u0793\3\2\2\2\u0793\u00d7"+
		"\3\2\2\2\u0794\u07a3\5\u00dan\2\u0795\u0797\5\u0112\u008a\2\u0796\u0795"+
		"\3\2\2\2\u0797\u079a\3\2\2\2\u0798\u0796\3\2\2\2\u0798\u0799\3\2\2\2\u0799"+
		"\u079b\3\2\2\2\u079a\u0798\3\2\2\2\u079b\u079f\7 \2\2\u079c\u079e\5\u0112"+
		"\u008a\2\u079d\u079c\3\2\2\2\u079e\u07a1\3\2\2\2\u079f\u079d\3\2\2\2\u079f"+
		"\u07a0\3\2\2\2\u07a0\u07a2\3\2\2\2\u07a1\u079f\3\2\2\2\u07a2\u07a4\5\u00d8"+
		"m\2\u07a3\u0798\3\2\2\2\u07a3\u07a4\3\2\2\2\u07a4\u00d9\3\2\2\2\u07a5"+
		"\u07b4\5\u00dco\2\u07a6\u07a8\5\u0112\u008a\2\u07a7\u07a6\3\2\2\2\u07a8"+
		"\u07ab\3\2\2\2\u07a9\u07a7\3\2\2\2\u07a9\u07aa\3\2\2\2\u07aa\u07ac\3\2"+
		"\2\2\u07ab\u07a9\3\2\2\2\u07ac\u07b0\7\37\2\2\u07ad\u07af\5\u0112\u008a"+
		"\2\u07ae\u07ad\3\2\2\2\u07af\u07b2\3\2\2\2\u07b0\u07ae\3\2\2\2\u07b0\u07b1"+
		"\3\2\2\2\u07b1\u07b3\3\2\2\2\u07b2\u07b0\3\2\2\2\u07b3\u07b5\5\u00dan"+
		"\2\u07b4\u07a9\3\2\2\2\u07b4\u07b5\3\2\2\2\u07b5\u00db\3\2\2\2\u07b6\u07c5"+
		"\5\u00dep\2\u07b7\u07b9\5\u0112\u008a\2\u07b8\u07b7\3\2\2\2\u07b9\u07bc"+
		"\3\2\2\2\u07ba\u07b8\3\2\2\2\u07ba\u07bb\3\2\2\2\u07bb\u07bd\3\2\2\2\u07bc"+
		"\u07ba\3\2\2\2\u07bd\u07c1\7\20\2\2\u07be\u07c0\5\u0112\u008a\2\u07bf"+
		"\u07be\3\2\2\2\u07c0\u07c3\3\2\2\2\u07c1\u07bf\3\2\2\2\u07c1\u07c2\3\2"+
		"\2\2\u07c2\u07c4\3\2\2\2\u07c3\u07c1\3\2\2\2\u07c4\u07c6\5\u00dco\2\u07c5"+
		"\u07ba\3\2\2\2\u07c5\u07c6\3\2\2\2\u07c6\u00dd\3\2\2\2\u07c7\u07d7\5\u00e0"+
		"q\2\u07c8\u07ca\5\u0112\u008a\2\u07c9\u07c8\3\2\2\2\u07ca\u07cd\3\2\2"+
		"\2\u07cb\u07c9\3\2\2\2\u07cb\u07cc\3\2\2\2\u07cc\u07ce\3\2\2\2\u07cd\u07cb"+
		"\3\2\2\2\u07ce\u07d2\5`\61\2\u07cf\u07d1\5\u0112\u008a\2\u07d0\u07cf\3"+
		"\2\2\2\u07d1\u07d4\3\2\2\2\u07d2\u07d0\3\2\2\2\u07d2\u07d3\3\2\2\2\u07d3"+
		"\u07d5\3\2\2\2\u07d4\u07d2\3\2\2\2\u07d5\u07d6\5\u00dep\2\u07d6\u07d8"+
		"\3\2\2\2\u07d7\u07cb\3\2\2\2\u07d7\u07d8\3\2\2\2\u07d8\u00df\3\2\2\2\u07d9"+
		"\u07e9\5\u00e2r\2\u07da\u07dc\5\u0112\u008a\2\u07db\u07da\3\2\2\2\u07dc"+
		"\u07df\3\2\2\2\u07dd\u07db\3\2\2\2\u07dd\u07de\3\2\2\2\u07de\u07e0\3\2"+
		"\2\2\u07df\u07dd\3\2\2\2\u07e0\u07e4\5R*\2\u07e1\u07e3\5\u0112\u008a\2"+
		"\u07e2\u07e1\3\2\2\2\u07e3\u07e6\3\2\2\2\u07e4\u07e2\3\2\2\2\u07e4\u07e5"+
		"\3\2\2\2\u07e5\u07e7\3\2\2\2\u07e6\u07e4\3\2\2\2\u07e7\u07e8\5\u00e0q"+
		"\2\u07e8\u07ea\3\2\2\2\u07e9\u07dd\3\2\2\2\u07e9\u07ea\3\2\2\2\u07ea\u00e1"+
		"\3\2\2\2\u07eb\u07fa\5\u00e4s\2\u07ec\u07ee\5\u0112\u008a\2\u07ed\u07ec"+
		"\3\2\2\2\u07ee\u07f1\3\2\2\2\u07ef\u07ed\3\2\2\2\u07ef\u07f0\3\2\2\2\u07f0"+
		"\u07f2\3\2\2\2\u07f1\u07ef\3\2\2\2\u07f2\u07f6\t\27\2\2\u07f3\u07f5\5"+
		"\u0112\u008a\2\u07f4\u07f3\3\2\2\2\u07f5\u07f8\3\2\2\2\u07f6\u07f4\3\2"+
		"\2\2\u07f6\u07f7\3\2\2\2\u07f7\u07f9\3\2\2\2\u07f8\u07f6\3\2\2\2\u07f9"+
		"\u07fb\5\u00e2r\2\u07fa\u07ef\3\2\2\2\u07fa\u07fb\3\2\2\2\u07fb\u00e3"+
		"\3\2\2\2\u07fc\u080b\5\u00e6t\2\u07fd\u07ff\5\u0112\u008a\2\u07fe\u07fd"+
		"\3\2\2\2\u07ff\u0802\3\2\2\2\u0800\u07fe\3\2\2\2\u0800\u0801\3\2\2\2\u0801"+
		"\u0803\3\2\2\2\u0802\u0800\3\2\2\2\u0803\u0807\t\30\2\2\u0804\u0806\5"+
		"\u0112\u008a\2\u0805\u0804\3\2\2\2\u0806\u0809\3\2\2\2\u0807\u0805\3\2"+
		"\2\2\u0807\u0808\3\2\2\2\u0808\u080a\3\2\2\2\u0809\u0807\3\2\2\2\u080a"+
		"\u080c\5\u00e4s\2\u080b\u0800\3\2\2\2\u080b\u080c\3\2\2\2\u080c\u00e5"+
		"\3\2\2\2\u080d\u081c\5\u00e8u\2\u080e\u0810\5\u0112\u008a\2\u080f\u080e"+
		"\3\2\2\2\u0810\u0813\3\2\2\2\u0811\u080f\3\2\2\2\u0811\u0812\3\2\2\2\u0812"+
		"\u0814\3\2\2\2\u0813\u0811\3\2\2\2\u0814\u0818\t\31\2\2\u0815\u0817\5"+
		"\u0112\u008a\2\u0816\u0815\3\2\2\2\u0817\u081a\3\2\2\2\u0818\u0816\3\2"+
		"\2\2\u0818\u0819\3\2\2\2\u0819\u081b\3\2\2\2\u081a\u0818\3\2\2\2\u081b"+
		"\u081d\5\u00e6t\2\u081c\u0811\3\2\2\2\u081c\u081d\3\2\2\2\u081d\u00e7"+
		"\3\2\2\2\u081e\u081f\7\3\2\2\u081f\u0821\5X-\2\u0820\u0822\5\u00c6d\2"+
		"\u0821\u0820\3\2\2\2\u0821\u0822\3\2\2\2\u0822\u0823\3\2\2\2\u0823\u0824"+
		"\7\4\2\2\u0824\u0826\7\3\2\2\u0825\u0827\5\u0108\u0085\2\u0826\u0825\3"+
		"\2\2\2\u0826\u0827\3\2\2\2\u0827\u0828\3\2\2\2\u0828\u0829\7\4\2\2\u0829"+
		"\u082c\3\2\2\2\u082a\u082c\5\u00eav\2\u082b\u081e\3\2\2\2\u082b\u082a"+
		"\3\2\2\2\u082c\u00e9\3\2\2\2\u082d\u082e\7\3\2\2\u082e\u082f\5\u00ecw"+
		"\2\u082f\u0830\7\4\2\2\u0830\u0831\5\u00eav\2\u0831\u0834\3\2\2\2\u0832"+
		"\u0834\5\u00eex\2\u0833\u082d\3\2\2\2\u0833\u0832\3\2\2\2\u0834\u00eb"+
		"\3\2\2\2\u0835\u083a\5\u00ba^\2\u0836\u0837\5\u00ba^\2\u0837\u0838\5\u00e8"+
		"u\2\u0838\u083a\3\2\2\2\u0839\u0835\3\2\2\2\u0839\u0836\3\2\2\2\u083a"+
		"\u00ed\3\2\2\2\u083b\u0844\5\u00f0y\2\u083c\u0844\5\u00f4{\2\u083d\u0844"+
		"\5\u00f6|\2\u083e\u0844\5\u00f2z\2\u083f\u0844\5\u0104\u0083\2\u0840\u0844"+
		"\5\u00fa~\2\u0841\u0844\5\66\34\2\u0842\u0844\5\u0102\u0082\2\u0843\u083b"+
		"\3\2\2\2\u0843\u083c\3\2\2\2\u0843\u083d\3\2\2\2\u0843\u083e\3\2\2\2\u0843"+
		"\u083f\3\2\2\2\u0843\u0840\3\2\2\2\u0843\u0841\3\2\2\2\u0843\u0842\3\2"+
		"\2\2\u0844\u00ef\3\2\2\2\u0845\u0846\7\20\2\2\u0846\u0847\5\u00c6d\2\u0847"+
		"\u00f1\3\2\2\2\u0848\u084a\7:\2\2\u0849\u0848\3\2\2\2\u0849\u084a\3\2"+
		"\2\2\u084a\u084b\3\2\2\2\u084b\u084f\7f\2\2\u084c\u084e\5\u0112\u008a"+
		"\2\u084d\u084c\3\2\2\2\u084e\u0851\3\2\2\2\u084f\u084d\3\2\2\2\u084f\u0850"+
		"\3\2\2\2\u0850\u0852\3\2\2\2\u0851\u084f\3\2\2\2\u0852\u0856\5\u00ba^"+
		"\2\u0853\u0855\5\u0112\u008a\2\u0854\u0853\3\2\2\2\u0855\u0858\3\2\2\2"+
		"\u0856\u0854\3\2\2\2\u0856\u0857\3\2\2\2\u0857\u0859\3\2\2\2\u0858\u0856"+
		"\3\2\2\2\u0859\u085b\7\33\2\2\u085a\u085c\5\u00d2j\2\u085b\u085a\3\2\2"+
		"\2\u085b\u085c\3\2\2\2\u085c\u085d\3\2\2\2\u085d\u085e\7\34\2\2\u085e"+
		"\u0877\3\2\2\2\u085f\u0861\7:\2\2\u0860\u085f\3\2\2\2\u0860\u0861\3\2"+
		"\2\2\u0861\u0862\3\2\2\2\u0862\u0866\7f\2\2\u0863\u0865\5\u0112\u008a"+
		"\2\u0864\u0863\3\2\2\2\u0865\u0868\3\2\2\2\u0866\u0864\3\2\2\2\u0866\u0867"+
		"\3\2\2\2\u0867\u0869\3\2\2\2\u0868\u0866\3\2\2\2\u0869\u086d\5\u00ba^"+
		"\2\u086a\u086c\5\u0112\u008a\2\u086b\u086a\3\2\2\2\u086c\u086f\3\2\2\2"+
		"\u086d\u086b\3\2\2\2\u086d\u086e\3\2\2\2\u086e\u0870\3\2\2\2\u086f\u086d"+
		"\3\2\2\2\u0870\u0872\7\3\2\2\u0871\u0873\5\u00ceh\2\u0872\u0871\3\2\2"+
		"\2\u0872\u0873\3\2\2\2\u0873\u0874\3\2\2\2\u0874\u0875\7\4\2\2\u0875\u0877"+
		"\3\2\2\2\u0876\u0849\3\2\2\2\u0876\u0860\3\2\2\2\u0877\u00f3\3\2\2\2\u0878"+
		"\u087c\5P)\2\u0879\u087b\5\u0112\u008a\2\u087a\u0879\3\2\2\2\u087b\u087e"+
		"\3\2\2\2\u087c\u087a\3\2\2\2\u087c\u087d\3\2\2\2\u087d\u087f\3\2\2\2\u087e"+
		"\u087c\3\2\2\2\u087f\u0880\5\u00eav\2\u0880\u00f5\3\2\2\2\u0881\u0885"+
		"\5\u00f8}\2\u0882\u0884\5\u0112\u008a\2\u0883\u0882\3\2\2\2\u0884\u0887"+
		"\3\2\2\2\u0885\u0883\3\2\2\2\u0885\u0886\3\2\2\2\u0886\u0888\3\2\2\2\u0887"+
		"\u0885\3\2\2\2\u0888\u0889\7\3\2\2\u0889\u088a\5\u00fc\177\2\u088a\u088b"+
		"\7\4\2\2\u088b\u0896\3\2\2\2\u088c\u0890\5\u00f8}\2\u088d\u088f\5\u0112"+
		"\u008a\2\u088e\u088d\3\2\2\2\u088f\u0892\3\2\2\2\u0890\u088e\3\2\2\2\u0890"+
		"\u0891\3\2\2\2\u0891\u0893\3\2\2\2\u0892\u0890\3\2\2\2\u0893\u0894\5\u00fe"+
		"\u0080\2\u0894\u0896\3\2\2\2\u0895\u0881\3\2\2\2\u0895\u088c\3\2\2\2\u0896"+
		"\u00f7\3\2\2\2\u0897\u0898\7?\2\2\u0898\u00f9\3\2\2\2\u0899\u089d\7@\2"+
		"\2\u089a\u089c\5\u0112\u008a\2\u089b\u089a\3\2\2\2\u089c\u089f\3\2\2\2"+
		"\u089d\u089b\3\2\2\2\u089d\u089e\3\2\2\2\u089e\u08a0\3\2\2\2\u089f\u089d"+
		"\3\2\2\2\u08a0\u08a1\7\3\2\2\u08a1\u08a2\5\u00ceh\2\u08a2\u08a3\7\4\2"+
		"\2\u08a3\u08ad\3\2\2\2\u08a4\u08a8\7@\2\2\u08a5\u08a7\5\u0112\u008a\2"+
		"\u08a6\u08a5\3\2\2\2\u08a7\u08aa\3\2\2\2\u08a8\u08a6\3\2\2\2\u08a8\u08a9"+
		"\3\2\2\2\u08a9\u08ab\3\2\2\2\u08aa\u08a8\3\2\2\2\u08ab\u08ad\5\u00ceh"+
		"\2\u08ac\u0899\3\2\2\2\u08ac\u08a4\3\2\2\2\u08ad\u00fb\3\2\2\2\u08ae\u08b8"+
		"\5\u00ba^\2\u08af\u08b1\5\u0112\u008a\2\u08b0\u08af\3\2\2\2\u08b1\u08b4"+
		"\3\2\2\2\u08b2\u08b0\3\2\2\2\u08b2\u08b3\3\2\2\2\u08b3\u08b5\3\2\2\2\u08b4"+
		"\u08b2\3\2\2\2\u08b5\u08b7\5X-\2\u08b6\u08b2\3\2\2\2\u08b7\u08ba\3\2\2"+
		"\2\u08b8\u08b6\3\2\2\2\u08b8\u08b9\3\2\2\2\u08b9\u00fd\3\2\2\2\u08ba\u08b8"+
		"\3\2\2\2\u08bb\u08bc\5\u00eex\2\u08bc\u00ff\3\2\2\2\u08bd\u08be\t\32\2"+
		"\2\u08be\u0101\3\2\2\2\u08bf\u08c3\7Y\2\2\u08c0\u08c2\t\33\2\2\u08c1\u08c0"+
		"\3\2\2\2\u08c2\u08c5\3\2\2\2\u08c3\u08c1\3\2\2\2\u08c3\u08c4\3\2\2\2\u08c4"+
		"\u08c7\3\2\2\2\u08c5\u08c3\3\2\2\2\u08c6\u08c8\7D\2\2\u08c7\u08c6\3\2"+
		"\2\2\u08c7\u08c8\3\2\2\2\u08c8\u08c9\3\2\2\2\u08c9\u08cb\7\3\2\2\u08ca"+
		"\u08cc\7D\2\2\u08cb\u08ca\3\2\2\2\u08cb\u08cc\3\2\2\2\u08cc\u08d1\3\2"+
		"\2\2\u08cd\u08cf\7\u0082\2\2\u08ce\u08d0\7D\2\2\u08cf\u08ce\3\2\2\2\u08cf"+
		"\u08d0\3\2\2\2\u08d0\u08d2\3\2\2\2\u08d1\u08cd\3\2\2\2\u08d2\u08d3\3\2"+
		"\2\2\u08d3\u08d1\3\2\2\2\u08d3\u08d4\3\2\2\2\u08d4\u08eb\3\2\2\2\u08d5"+
		"\u08e7\t\34\2\2\u08d6\u08d8\7\u0082\2\2\u08d7\u08d9\7D\2\2\u08d8\u08d7"+
		"\3\2\2\2\u08d8\u08d9\3\2\2\2\u08d9\u08e5\3\2\2\2\u08da\u08db\7\3\2\2\u08db"+
		"\u08e0\5\u00c6d\2\u08dc\u08dd\7\17\2\2\u08dd\u08df\5\u00c6d\2\u08de\u08dc"+
		"\3\2\2\2\u08df\u08e2\3\2\2\2\u08e0\u08de\3\2\2\2\u08e0\u08e1\3\2\2\2\u08e1"+
		"\u08e3\3\2\2\2\u08e2\u08e0\3\2\2\2\u08e3\u08e4\7\4\2\2\u08e4\u08e6\3\2"+
		"\2\2\u08e5\u08da\3\2\2\2\u08e5\u08e6\3\2\2\2\u08e6\u08e8\3\2\2\2\u08e7"+
		"\u08d6\3\2\2\2\u08e7\u08e8\3\2\2\2\u08e8\u08ea\3\2\2\2\u08e9\u08d5\3\2"+
		"\2\2\u08ea\u08ed\3\2\2\2\u08eb\u08e9\3\2\2\2\u08eb\u08ec\3\2\2\2\u08ec"+
		"\u08ee\3\2\2\2\u08ed\u08eb\3\2\2\2\u08ee\u08ef\7\4\2\2\u08ef\u0103\3\2"+
		"\2\2\u08f0\u08f2\b\u0083\1\2\u08f1\u08f3\5\u00ba^\2\u08f2\u08f1\3\2\2"+
		"\2\u08f2\u08f3\3\2\2\2\u08f3\u08f4\3\2\2\2\u08f4\u0906\5\u0106\u0084\2"+
		"\u08f5\u0906\5\u010c\u0087\2\u08f6\u08f8\5X-\2\u08f7\u08f6\3\2\2\2\u08f7"+
		"\u08f8\3\2\2\2\u08f8\u08f9\3\2\2\2\u08f9\u08fd\5\u0100\u0081\2\u08fa\u08fc"+
		"\5\u0112\u008a\2\u08fb\u08fa\3\2\2\2\u08fc\u08ff\3\2\2\2\u08fd\u08fb\3"+
		"\2\2\2\u08fd\u08fe\3\2\2\2\u08fe\u0901\3\2\2\2\u08ff\u08fd\3\2\2\2\u0900"+
		"\u0902\5X-\2\u0901\u0900\3\2\2\2\u0901\u0902\3\2\2\2\u0902\u0903\3\2\2"+
		"\2\u0903\u0904\5\u010c\u0087\2\u0904\u0906\3\2\2\2\u0905\u08f0\3\2\2\2"+
		"\u0905\u08f5\3\2\2\2\u0905\u08f7\3\2\2\2\u0906\u0941\3\2\2\2\u0907\u090b"+
		"\f\n\2\2\u0908\u090a\5\u0112\u008a\2\u0909\u0908\3\2\2\2\u090a\u090d\3"+
		"\2\2\2\u090b\u0909\3\2\2\2\u090b\u090c\3\2\2\2\u090c\u090e\3\2\2\2\u090d"+
		"\u090b\3\2\2\2\u090e\u0910\7\33\2\2\u090f\u0911\5\u00ceh\2\u0910\u090f"+
		"\3\2\2\2\u0910\u0911\3\2\2\2\u0911\u0912\3\2\2\2\u0912\u0940\7\34\2\2"+
		"\u0913\u0917\f\t\2\2\u0914\u0916\5\u0112\u008a\2\u0915\u0914\3\2\2\2\u0916"+
		"\u0919\3\2\2";
	private static final String _serializedATNSegment1 =
		"\2\u0917\u0915\3\2\2\2\u0917\u0918\3\2\2\2\u0918\u091a\3\2\2\2\u0919\u0917"+
		"\3\2\2\2\u091a\u091c\7\3\2\2\u091b\u091d\5\u0108\u0085\2\u091c\u091b\3"+
		"\2\2\2\u091c\u091d\3\2\2\2\u091d\u091e\3\2\2\2\u091e\u0940\7\4\2\2\u091f"+
		"\u0920\f\b\2\2\u0920\u0924\7B\2\2\u0921\u0923\5\u0112\u008a\2\u0922\u0921"+
		"\3\2\2\2\u0923\u0926\3\2\2\2\u0924\u0922\3\2\2\2\u0924\u0925\3\2\2\2\u0925"+
		"\u0928\3\2\2\2\u0926\u0924\3\2\2\2\u0927\u0929\7d\2\2\u0928\u0927\3\2"+
		"\2\2\u0928\u0929\3\2\2\2\u0929\u092a\3\2\2\2\u092a\u0940\5\u00c6d\2\u092b"+
		"\u092c\f\7\2\2\u092c\u0930\7\65\2\2\u092d\u092f\5\u0112\u008a\2\u092e"+
		"\u092d\3\2\2\2\u092f\u0932\3\2\2\2\u0930\u092e\3\2\2\2\u0930\u0931\3\2"+
		"\2\2\u0931\u0934\3\2\2\2\u0932\u0930\3\2\2\2\u0933\u0935\7d\2\2\u0934"+
		"\u0933\3\2\2\2\u0934\u0935\3\2\2\2\u0935\u0936\3\2\2\2\u0936\u0940\5\u00c6"+
		"d\2\u0937\u093b\f\6\2\2\u0938\u093a\5\u0112\u008a\2\u0939\u0938\3\2\2"+
		"\2\u093a\u093d\3\2\2\2\u093b\u0939\3\2\2\2\u093b\u093c\3\2\2\2\u093c\u093e"+
		"\3\2\2\2\u093d\u093b\3\2\2\2\u093e\u0940\5\u0100\u0081\2\u093f\u0907\3"+
		"\2\2\2\u093f\u0913\3\2\2\2\u093f\u091f\3\2\2\2\u093f\u092b\3\2\2\2\u093f"+
		"\u0937\3\2\2\2\u0940\u0943\3\2\2\2\u0941\u093f\3\2\2\2\u0941\u0942\3\2"+
		"\2\2\u0942\u0105\3\2\2\2\u0943\u0941\3\2\2\2\u0944\u0948\7y\2\2\u0945"+
		"\u0947\5\u0112\u008a\2\u0946\u0945\3\2\2\2\u0947\u094a\3\2\2\2\u0948\u0946"+
		"\3\2\2\2\u0948\u0949\3\2\2\2\u0949\u094c\3\2\2\2\u094a\u0948\3\2\2\2\u094b"+
		"\u094d\5\u0108\u0085\2\u094c\u094b\3\2\2\2\u094c\u094d\3\2\2\2\u094d\u0951"+
		"\3\2\2\2\u094e\u0950\5\u0112\u008a\2\u094f\u094e\3\2\2\2\u0950\u0953\3"+
		"\2\2\2\u0951\u094f\3\2\2\2\u0951\u0952\3\2\2\2\u0952\u0954\3\2\2\2\u0953"+
		"\u0951\3\2\2\2\u0954\u0955\7z\2\2\u0955\u0107\3\2\2\2\u0956\u095d\5\u010a"+
		"\u0086\2\u0957\u0959\7\17\2\2\u0958\u0957\3\2\2\2\u0958\u0959\3\2\2\2"+
		"\u0959\u095a\3\2\2\2\u095a\u095c\5\u010a\u0086\2\u095b\u0958\3\2\2\2\u095c"+
		"\u095f\3\2\2\2\u095d\u095b\3\2\2\2\u095d\u095e\3\2\2\2\u095e\u0961\3\2"+
		"\2\2\u095f\u095d\3\2\2\2\u0960\u0962\7\17\2\2\u0961\u0960\3\2\2\2\u0961"+
		"\u0962\3\2\2\2\u0962\u0109\3\2\2\2\u0963\u0965\5\u0112\u008a\2\u0964\u0963"+
		"\3\2\2\2\u0965\u0968\3\2\2\2\u0966\u0964\3\2\2\2\u0966\u0967\3\2\2\2\u0967"+
		"\u0969\3\2\2\2\u0968\u0966\3\2\2\2\u0969\u096d\5\u00d0i\2\u096a\u096c"+
		"\5\u0112\u008a\2\u096b\u096a\3\2\2\2\u096c\u096f\3\2\2\2\u096d\u096b\3"+
		"\2\2\2\u096d\u096e\3\2\2\2\u096e\u0978\3\2\2\2\u096f\u096d\3\2\2\2\u0970"+
		"\u0972\7W\2\2\u0971\u0970\3\2\2\2\u0971\u0972\3\2\2\2\u0972\u0973\3\2"+
		"\2\2\u0973\u0975\7T\2\2\u0974\u0976\5X-\2\u0975\u0974\3\2\2\2\u0975\u0976"+
		"\3\2\2\2\u0976\u0978\3\2\2\2\u0977\u0966\3\2\2\2\u0977\u0971\3\2\2\2\u0978"+
		"\u010b\3\2\2\2\u0979\u097b\7B\2\2\u097a\u0979\3\2\2\2\u097a\u097b\3\2"+
		"\2\2\u097b\u097c\3\2\2\2\u097c\u0990\5\u00c6d\2\u097d\u0990\5X-\2\u097e"+
		"\u0990\5T+\2\u097f\u0983\7\3\2\2\u0980\u0982\5\u0112\u008a\2\u0981\u0980"+
		"\3\2\2\2\u0982\u0985\3\2\2\2\u0983\u0981\3\2\2\2\u0983\u0984\3\2\2\2\u0984"+
		"\u0986\3\2\2\2\u0985\u0983\3\2\2\2\u0986\u098a\5\u00ceh\2\u0987\u0989"+
		"\5\u0112\u008a\2\u0988\u0987\3\2\2\2\u0989\u098c\3\2\2\2\u098a\u0988\3"+
		"\2\2\2\u098a\u098b\3\2\2\2\u098b\u098d\3\2\2\2\u098c\u098a\3\2\2\2\u098d"+
		"\u098e\7\4\2\2\u098e\u0990\3\2\2\2\u098f\u097a\3\2\2\2\u098f\u097d\3\2"+
		"\2\2\u098f\u097e\3\2\2\2\u098f\u097f\3\2\2\2\u0990\u010d\3\2\2\2\u0991"+
		"\u0992\7\5\2\2\u0992\u010f\3\2\2\2\u0993\u0994\7k\2\2\u0994\u0998\5.\30"+
		"\2\u0995\u0997\n\3\2\2\u0996\u0995\3\2\2\2\u0997\u099a\3\2\2\2\u0998\u0999"+
		"\3\2\2\2\u0998\u0996\3\2\2\2\u0999\u099b\3\2\2\2\u099a\u0998\3\2\2\2\u099b"+
		"\u099c\t\2\2\2\u099c\u09b0\3\2\2\2\u099d\u09a1\7g\2\2\u099e\u09a0\n\3"+
		"\2\2\u099f\u099e\3\2\2\2\u09a0\u09a3\3\2\2\2\u09a1\u09a2\3\2\2\2\u09a1"+
		"\u099f\3\2\2\2\u09a2\u09a4\3\2\2\2\u09a3\u09a1\3\2\2\2\u09a4\u09b0\t\2"+
		"\2\2\u09a5\u09a9\7h\2\2\u09a6\u09a8\n\3\2\2\u09a7\u09a6\3\2\2\2\u09a8"+
		"\u09ab\3\2\2\2\u09a9\u09aa\3\2\2\2\u09a9\u09a7\3\2\2\2\u09aa\u09ac\3\2"+
		"\2\2\u09ab\u09a9\3\2\2\2\u09ac\u09b0\t\2\2\2\u09ad\u09b0\7i\2\2\u09ae"+
		"\u09b0\7j\2\2\u09af\u0993\3\2\2\2\u09af\u099d\3\2\2\2\u09af\u09a5\3\2"+
		"\2\2\u09af\u09ad\3\2\2\2\u09af\u09ae\3\2\2\2\u09b0\u0111\3\2\2\2\u09b1"+
		"\u09b5\7D\2\2\u09b2\u09b5\7\u0080\2\2\u09b3\u09b5\5\u0110\u0089\2\u09b4"+
		"\u09b1\3\2\2\2\u09b4\u09b2\3\2\2\2\u09b4\u09b3\3\2\2\2\u09b5\u0113\3\2"+
		"\2\2\u09b6\u09ba\5\u0116\u008c\2\u09b7\u09b9\5\u0112\u008a\2\u09b8\u09b7"+
		"\3\2\2\2\u09b9\u09bc\3\2\2\2\u09ba\u09b8\3\2\2\2\u09ba\u09bb\3\2\2\2\u09bb"+
		"\u09bd\3\2\2\2\u09bc\u09ba\3\2\2\2\u09bd\u09c1\7\3\2\2\u09be\u09c0\5\u0112"+
		"\u008a\2\u09bf\u09be\3\2\2\2\u09c0\u09c3\3\2\2\2\u09c1\u09bf\3\2\2\2\u09c1"+
		"\u09c2\3\2\2\2\u09c2\u09c5\3\2\2\2\u09c3\u09c1\3\2\2\2\u09c4\u09c6\5\u00ce"+
		"h\2\u09c5\u09c4\3\2\2\2\u09c5\u09c6\3\2\2\2\u09c6\u09ca\3\2\2\2\u09c7"+
		"\u09c9\5\u0112\u008a\2\u09c8\u09c7\3\2\2\2\u09c9\u09cc\3\2\2\2\u09ca\u09c8"+
		"\3\2\2\2\u09ca\u09cb\3\2\2\2\u09cb\u09cd\3\2\2\2\u09cc\u09ca\3\2\2\2\u09cd"+
		"\u09ce\7\4\2\2\u09ce\u09e1\3\2\2\2\u09cf\u09d3\5\u0116\u008c\2\u09d0\u09d2"+
		"\5\u0112\u008a\2\u09d1\u09d0\3\2\2\2\u09d2\u09d5\3\2\2\2\u09d3\u09d1\3"+
		"\2\2\2\u09d3\u09d4\3\2\2\2\u09d4\u09d6\3\2\2\2\u09d5\u09d3\3\2\2\2\u09d6"+
		"\u09da\7!\2\2\u09d7\u09d9\5\u0112\u008a\2\u09d8\u09d7\3\2\2\2\u09d9\u09dc"+
		"\3\2\2\2\u09da\u09d8\3\2\2\2\u09da\u09db\3\2\2\2\u09db\u09dd\3\2\2\2\u09dc"+
		"\u09da\3\2\2\2\u09dd\u09de\5\u010a\u0086\2\u09de\u09e1\3\2\2\2\u09df\u09e1"+
		"\5\u0116\u008c\2\u09e0\u09b6\3\2\2\2\u09e0\u09cf\3\2\2\2\u09e0\u09df\3"+
		"\2\2\2\u09e1\u0115\3\2\2\2\u09e2\u09e4\5\u00caf\2\u09e3\u09e2\3\2\2\2"+
		"\u09e3\u09e4\3\2\2\2\u09e4\u09e5\3\2\2\2\u09e5\u09e7\5\u00c6d\2\u09e6"+
		"\u09e8\5\u0118\u008d\2\u09e7\u09e6\3\2\2\2\u09e7\u09e8\3\2\2\2\u09e8\u0117"+
		"\3\2\2\2\u09e9\u09ed\7\33\2\2\u09ea\u09ec\5\u0112\u008a\2\u09eb\u09ea"+
		"\3\2\2\2\u09ec\u09ef\3\2\2\2\u09ed\u09eb\3\2\2\2\u09ed\u09ee\3\2\2\2\u09ee"+
		"\u09f1\3\2\2\2\u09ef\u09ed\3\2\2\2\u09f0\u09f2\5\u00d2j\2\u09f1\u09f0"+
		"\3\2\2\2\u09f1\u09f2\3\2\2\2\u09f2\u09f6\3\2\2\2\u09f3\u09f5\5\u0112\u008a"+
		"\2\u09f4\u09f3\3\2\2\2\u09f5\u09f8\3\2\2\2\u09f6\u09f4\3\2\2\2\u09f6\u09f7"+
		"\3\2\2\2\u09f7\u09f9\3\2\2\2\u09f8\u09f6\3\2\2\2\u09f9\u09fc\7\34\2\2"+
		"\u09fa\u09fc\5\u00c0a\2\u09fb\u09e9\3\2\2\2\u09fb\u09fa\3\2\2\2\u09fc"+
		"\u0119\3\2\2\2\u0178\u011d\u012c\u0139\u0140\u0145\u014a\u014e\u0154\u015b"+
		"\u0162\u016c\u0173\u017a\u0183\u018a\u018f\u0194\u0198\u019e\u01a2\u01a7"+
		"\u01ac\u01b3\u01ba\u01c1\u01c6\u01c8\u01cf\u01d4\u01da\u01e2\u01eb\u01f4"+
		"\u01f8\u01fd\u0205\u0209\u020e\u0212\u0215\u021b\u0220\u0229\u022f\u0235"+
		"\u023b\u024b\u024d\u0254\u0256\u0264\u026f\u0279\u0282\u0285\u028b\u0290"+
		"\u0294\u0299\u029b\u029f\u02a7\u02aa\u02ae\u02b4\u02b8\u02bc\u02bf\u02c6"+
		"\u02ca\u02d0\u02d7\u02db\u02e2\u02ed\u02f5\u02fb\u0301\u0308\u030f\u0323"+
		"\u0327\u032e\u0334\u0339\u0348\u034d\u0351\u0355\u035a\u0365\u038f\u03a3"+
		"\u03a5\u03c2\u03c9\u03ce\u03d2\u03d5\u03d8\u03dc\u03ee\u03f1\u03f7\u03fa"+
		"\u0400\u0405\u040a\u0410\u0416\u041b\u0423\u0428\u0431\u0436\u043d\u0440"+
		"\u0446\u044a\u044f\u0454\u045a\u045f\u0463\u0469\u0471\u0477\u047d\u0484"+
		"\u048d\u0493\u049a\u049f\u04a1\u04a6\u04ad\u04b4\u04ba\u04c0\u04c7\u04cb"+
		"\u04d1\u04d4\u04db\u04de\u04e9\u04f0\u04f6\u0501\u050b\u0514\u0519\u051f"+
		"\u0525\u0529\u052d\u0533\u0536\u053c\u053f\u0545\u054e\u0551\u0557\u055b"+
		"\u0560\u0564\u0569\u056e\u0573\u0577\u057d\u0584\u0589\u058f\u0593\u059a"+
		"\u059c\u05a1\u05a4\u05aa\u05ae\u05b1\u05b3\u05b8\u05be\u05c2\u05c8\u05cb"+
		"\u05ce\u05d6\u05da\u05e0\u05e4\u05e8\u05f1\u05f5\u05f8\u05fe\u0605\u060b"+
		"\u0611\u0616\u061e\u0622\u0625\u0632\u0639\u063c\u063f\u0647\u064f\u0656"+
		"\u065d\u0664\u066b\u0672\u0680\u0684\u0688\u068a\u0690\u0697\u069e\u06a5"+
		"\u06ac\u06b3\u06ba\u06bd\u06bf\u06c3\u06c9\u06d0\u06d8\u06df\u06e6\u06ec"+
		"\u06ef\u06f4\u06f8\u06fe\u0704\u0707\u070e\u0710\u0713\u071a\u0720\u0726"+
		"\u072a\u0732\u0739\u073d\u0743\u074a\u074f\u0756\u075d\u0764\u076b\u0770"+
		"\u0776\u077d\u0781\u0787\u078e\u0792\u0798\u079f\u07a3\u07a9\u07b0\u07b4"+
		"\u07ba\u07c1\u07c5\u07cb\u07d2\u07d7\u07dd\u07e4\u07e9\u07ef\u07f6\u07fa"+
		"\u0800\u0807\u080b\u0811\u0818\u081c\u0821\u0826\u082b\u0833\u0839\u0843"+
		"\u0849\u084f\u0856\u085b\u0860\u0866\u086d\u0872\u0876\u087c\u0885\u0890"+
		"\u0895\u089d\u08a8\u08ac\u08b2\u08b8\u08c3\u08c7\u08cb\u08cf\u08d3\u08d8"+
		"\u08e0\u08e5\u08e7\u08eb\u08f2\u08f7\u08fd\u0901\u0905\u090b\u0910\u0917"+
		"\u091c\u0924\u0928\u0930\u0934\u093b\u093f\u0941\u0948\u094c\u0951\u0958"+
		"\u095d\u0961\u0966\u096d\u0971\u0975\u0977\u097a\u0983\u098a\u098f\u0998"+
		"\u09a1\u09a9\u09af\u09b4\u09ba\u09c1\u09c5\u09ca\u09d3\u09da\u09e0\u09e3"+
		"\u09e7\u09ed\u09f1\u09f6\u09fb";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}