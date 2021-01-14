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
		T__59=60, T__60=61, NEWLINE=62, ESCAPE=63, ELLIPSIS=64, IF=65, ELSE=66, 
		FOR=67, WHILE=68, BREAK=69, CASE=70, CONTINUE=71, SWITCH=72, DO=73, GOTO=74, 
		RETURN=75, TYPEDEF=76, STATIC=77, VOID=78, UNSIGNED=79, SIGNED=80, CV_QUALIFIER=81, 
		EXTERN=82, ASM=83, VIRTUAL=84, TRY=85, CATCH=86, THROW=87, USING=88, NAMESPACE=89, 
		AUTO=90, REGISTER=91, SPECIAL_DATA=92, OPERATOR=93, TEMPLATE=94, CLASS_KEY=95, 
		NEW=96, PRE_IF=97, PRE_ELIF=98, PRE_ELSE=99, PRE_ENDIF=100, PRE_DEFINE=101, 
		PRE_UNDEF=102, PRE_DIAGNOSTIC=103, PRE_OTHER=104, PRE_INCLUDE=105, PRE_INCLUDE_NEXT=106, 
		PRE_LINE=107, PRE_PRAGMA=108, PRE_GCC=109, PRE_PRAGMA_KEYWORDS=110, PRE_STR=111, 
		PRE_ATTRIBUTE=112, END_TEST=113, ALPHA_NUMERIC=114, OPENING_CURLY=115, 
		CLOSING_CURLY=116, HEX_LITERAL=117, DECIMAL_LITERAL=118, OCTAL_LITERAL=119, 
		FLOATING_POINT_LITERAL=120, COMMENT=121, CHAR=122, STRING=123, WHITESPACE=124, 
		OTHER=125;
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
		"'friend'", "'public'", "'private'", "'protected'", "'long'", "','", "'&'", 
		"'*'", "'+'", "'-'", "'~'", "'!'", "'<'", "'>'", "'<='", "'>='", "'delete'", 
		"'['", "']'", "'/'", "'%'", "'^'", "'|'", "'='", "'+='", "'-='", "'*='", 
		"'/='", "'%='", "'^='", "'&='", "'|='", "'>>'", "'<<'", "'>>='", "'<<='", 
		"'=='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'->*'", "'->'", "'\"C\"'", 
		"'::'", "'char'", "'int'", "'restrict'", "'?'", "'sizeof'", "'defined'", 
		"':::'", "'.'", null, "'\\'", "'...'", "'if'", "'else'", "'for'", "'while'", 
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
		null, null, "NEWLINE", "ESCAPE", "ELLIPSIS", "IF", "ELSE", "FOR", "WHILE", 
		"BREAK", "CASE", "CONTINUE", "SWITCH", "DO", "GOTO", "RETURN", "TYPEDEF", 
		"STATIC", "VOID", "UNSIGNED", "SIGNED", "CV_QUALIFIER", "EXTERN", "ASM", 
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
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << NEWLINE) | (1L << ESCAPE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ELLIPSIS - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (ASM - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (WHITESPACE - 64)) | (1L << (OTHER - 64)))) != 0)) {
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
			setState(377);
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
				setState(309);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
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
				}
				}
				break;
			case IF:
				_localctx = new If_statementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				match(IF);
				setState(312);
				match(T__0);
				setState(314);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(313);
					match(NEWLINE);
					}
				}

				setState(316);
				condition();
				setState(318);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(317);
					match(NEWLINE);
					}
				}

				setState(320);
				match(T__1);
				}
				break;
			case ELSE:
				_localctx = new Else_statementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(322);
				match(ELSE);
				}
				break;
			case SWITCH:
				_localctx = new Switch_statementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(323);
				match(SWITCH);
				setState(324);
				match(T__0);
				setState(326);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(325);
					match(NEWLINE);
					}
				}

				setState(328);
				condition();
				setState(330);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(329);
					match(NEWLINE);
					}
				}

				setState(332);
				match(T__1);
				}
				break;
			case FOR:
				_localctx = new For_statementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(334);
				match(FOR);
				setState(335);
				match(T__0);
				setState(337);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(336);
					match(NEWLINE);
					}
				}

				setState(341);
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
				case T__52:
				case T__53:
				case T__54:
				case T__57:
				case T__58:
				case T__60:
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
				case FLOATING_POINT_LITERAL:
				case CHAR:
				case STRING:
					{
					setState(339);
					for_init_statement();
					}
					break;
				case T__2:
					{
					setState(340);
					match(T__2);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(344);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(343);
					match(NEWLINE);
					}
				}

				setState(347);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(346);
					condition();
					}
				}

				setState(349);
				match(T__2);
				setState(351);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(350);
					match(NEWLINE);
					}
					break;
				}
				setState(354);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(353);
					expr();
					}
				}

				setState(357);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(356);
					match(NEWLINE);
					}
				}

				setState(359);
				match(T__1);
				setState(361);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(360);
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
				setState(363);
				match(DO);
				}
				break;
			case WHILE:
				_localctx = new While_statementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(364);
				match(WHILE);
				setState(365);
				match(T__0);
				setState(367);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(366);
					match(NEWLINE);
					}
				}

				setState(369);
				condition();
				setState(371);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(370);
					match(NEWLINE);
					}
				}

				setState(373);
				match(T__1);
				setState(375);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(374);
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
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				simple_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				expr();
				setState(381);
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
			setState(403);
			switch (_input.LA(1)) {
			case BREAK:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				match(BREAK);
				setState(386);
				match(T__2);
				}
				break;
			case CONTINUE:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				match(CONTINUE);
				setState(388);
				match(T__2);
				}
				break;
			case GOTO:
				_localctx = new GotoStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(389);
				match(GOTO);
				setState(390);
				identifier();
				setState(391);
				match(T__2);
				}
				break;
			case RETURN:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(393);
				match(RETURN);
				setState(395);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(394);
					expr();
					}
				}

				setState(397);
				match(T__2);
				}
				break;
			case THROW:
				_localctx = new ThrowStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(398);
				match(THROW);
				setState(400);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(399);
					expr();
					}
				}

				setState(402);
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
			setState(406);
			_la = _input.LA(1);
			if (_la==CASE) {
				{
				setState(405);
				match(CASE);
				}
			}

			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(408);
				identifier();
				}
				break;
			case 2:
				{
				setState(409);
				number();
				}
				break;
			case 3:
				{
				setState(410);
				match(CHAR);
				}
				break;
			case 4:
				{
				setState(411);
				cast_expression();
				}
				break;
			}
			setState(414);
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
			setState(420);
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
			case T__52:
			case T__53:
			case T__54:
			case T__57:
			case T__58:
			case T__60:
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
			case FLOATING_POINT_LITERAL:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				expr();
				setState(417);
				match(T__2);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
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
			setState(422);
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
			setState(426);
			switch (_input.LA(1)) {
			case PRE_IF:
			case PRE_ELIF:
			case PRE_ELSE:
			case PRE_ENDIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
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
				setState(425);
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
			setState(432);
			switch (_input.LA(1)) {
			case PRE_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				pre_if_statement();
				}
				break;
			case PRE_ELIF:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				pre_elif_statement();
				}
				break;
			case PRE_ELSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(430);
				pre_else_statement();
				}
				break;
			case PRE_ENDIF:
				enterOuterAlt(_localctx, 4);
				{
				setState(431);
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
			setState(434);
			match(PRE_IF);
			setState(435);
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
			setState(438);
			match(PRE_ELIF);
			setState(439);
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
			setState(442);
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
			setState(444);
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
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				match(T__0);
				setState(448);
				condition();
				setState(449);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(451);
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
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				pre_define();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				pre_undef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(456);
				pre_diagnostic();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(457);
				pre_other();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(458);
				pre_include();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(459);
				pre_include_next();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(460);
				pre_line();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(461);
				pre_pragma();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(462);
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
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				match(PRE_DEFINE);
				setState(466);
				pre_macro_identifier();
				setState(467);
				pre_macro();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				match(PRE_DEFINE);
				setState(470);
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
			setState(473);
			match(PRE_UNDEF);
			setState(474);
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
		enterRule(_localctx, 42, RULE_pre_macro_identifier);
		try {
			setState(493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				identifier();
				setState(481);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(477);
					match(T__0);
					setState(478);
					pre_macro_parameters();
					setState(479);
					match(T__1);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(483);
				keyword();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(484);
				match(END_TEST);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(485);
				match(T__4);
				setState(490);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(486);
					match(T__0);
					setState(487);
					pre_macro_parameters();
					setState(488);
					match(T__1);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(492);
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
		enterRule(_localctx, 44, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)))) != 0)) ) {
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
			setState(499);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case NEW:
			case PRE_PRAGMA_KEYWORDS:
			case ALPHA_NUMERIC:
				{
				setState(497);
				identifier();
				}
				break;
			case ELLIPSIS:
				{
				setState(498);
				match(ELLIPSIS);
				}
				break;
			case T__1:
			case T__12:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(501);
				match(T__12);
				setState(504);
				switch (_input.LA(1)) {
				case T__8:
				case T__9:
				case T__10:
				case NEW:
				case PRE_PRAGMA_KEYWORDS:
				case ALPHA_NUMERIC:
					{
					setState(502);
					identifier();
					}
					break;
				case ELLIPSIS:
					{
					setState(503);
					match(ELLIPSIS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(510);
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
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
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
		enterRule(_localctx, 50, RULE_macroCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(515);
				pre_macro_identifier();
				}
				break;
			}
			setState(518);
			pre_macro_identifier();
			setState(519);
			match(T__0);
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				{
				setState(524);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(520);
					expr();
					}
					break;
				case 2:
					{
					setState(521);
					type_name();
					}
					break;
				case 3:
					{
					setState(522);
					relational_operator();
					}
					break;
				case 4:
					{
					setState(523);
					equality_operator();
					}
					break;
				}
				setState(527);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(526);
					match(NEWLINE);
					}
				}

				}
				setState(541);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(529);
						match(T__12);
						setState(531);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(530);
							match(NEWLINE);
							}
						}

						setState(537);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
						case 1:
							{
							setState(533);
							expr();
							}
							break;
						case 2:
							{
							setState(534);
							type_name();
							}
							break;
						case 3:
							{
							setState(535);
							relational_operator();
							}
							break;
						case 4:
							{
							setState(536);
							equality_operator();
							}
							break;
						}
						}
						} 
					}
					setState(543);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				setState(545);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(544);
					match(T__12);
					}
				}

				}
				break;
			case 2:
				{
				setState(547);
				match(VOID);
				}
				break;
			}
			setState(550);
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
			setState(555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(552);
				match(PRE_DIAGNOSTIC);
				setState(553);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(554);
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
			setState(576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(557);
				match(PRE_OTHER);
				setState(559);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(558);
					match(STRING);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
				match(PRE_ATTRIBUTE);
				setState(562);
				match(T__0);
				setState(563);
				match(T__0);
				setState(565);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(564);
					attributeList();
					}
				}

				setState(567);
				match(T__1);
				setState(568);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(569);
				match(PRE_ATTRIBUTE);
				setState(570);
				match(T__0);
				setState(572);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(571);
					attributeList();
					}
				}

				setState(574);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(575);
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
		enterRule(_localctx, 56, RULE_attributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			attribute();
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(579);
				match(T__12);
				setState(580);
				attribute();
				}
				}
				setState(585);
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
			setState(614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				pre_macro_identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(587);
				pre_macro_identifier();
				setState(588);
				match(T__0);
				setState(589);
				identifier();
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(590);
					match(T__12);
					setState(591);
					expr();
					}
					}
					setState(596);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(597);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(599);
				pre_macro_identifier();
				setState(600);
				match(T__0);
				setState(602);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(601);
					expr();
					}
				}

				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(604);
					match(T__12);
					setState(605);
					expr();
					}
					}
					setState(610);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(611);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(613);
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
			setState(621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(616);
				match(PRE_INCLUDE);
				setState(617);
				pre_include_local_file();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(618);
				match(PRE_INCLUDE);
				setState(619);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(620);
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
			setState(628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(623);
				match(PRE_INCLUDE_NEXT);
				setState(624);
				pre_include_local_file();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				match(PRE_INCLUDE_NEXT);
				setState(626);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(627);
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
			setState(630);
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
			setState(632);
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
			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(634);
				match(PRE_LINE);
				setState(635);
				match(DECIMAL_LITERAL);
				setState(636);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(637);
				match(PRE_LINE);
				setState(638);
				match(DECIMAL_LITERAL);
				setState(639);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(640);
				match(PRE_LINE);
				setState(641);
				pre_macro_identifier();
				setState(642);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(644);
				match(PRE_LINE);
				setState(645);
				pre_macro_identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(646);
				match(PRE_LINE);
				setState(647);
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
			setState(670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(650);
				match(PRE_PRAGMA);
				setState(652);
				_la = _input.LA(1);
				if (_la==PRE_GCC) {
					{
					setState(651);
					match(PRE_GCC);
					}
				}

				setState(654);
				match(PRE_PRAGMA_KEYWORDS);
				setState(655);
				match(STRING);
				 preProcFindMacroEnd(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(657);
				match(PRE_PRAGMA);
				setState(659);
				_la = _input.LA(1);
				if (_la==PRE_GCC) {
					{
					setState(658);
					match(PRE_GCC);
					}
				}

				setState(661);
				match(PRE_PRAGMA_KEYWORDS);
				setState(665);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(662);
						identifier();
						}
						} 
					}
					setState(667);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(668);
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
			setState(672);
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
			setState(674);
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
			setState(676);
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
		enterRule(_localctx, 78, RULE_relational_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
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
			setState(708);
			switch (_input.LA(1)) {
			case HEX_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(680);
				match(HEX_LITERAL);
				}
				break;
			case OCTAL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(681);
				match(OCTAL_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(682);
				match(DECIMAL_LITERAL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(702); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(683);
						match(STRING);
						setState(687);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(684);
								match(NEWLINE);
								}
								} 
							}
							setState(689);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
						}
						setState(693);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(690);
								match(COMMENT);
								}
								} 
							}
							setState(695);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
						}
						setState(699);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(696);
								match(NEWLINE);
								}
								} 
							}
							setState(701);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(704); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(706);
				match(CHAR);
				}
				break;
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(707);
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
			setState(710);
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
			setState(712);
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
		enterRule(_localctx, 86, RULE_access_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
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
			setState(761);
			switch (_input.LA(1)) {
			case T__23:
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(716);
				_la = _input.LA(1);
				if ( !(_la==T__23 || _la==NEW) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(719);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(717);
					match(T__24);
					setState(718);
					match(T__25);
					}
				}

				}
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(721);
				match(T__15);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(722);
				match(T__16);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(723);
				match(T__14);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 5);
				{
				setState(724);
				match(T__26);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 6);
				{
				setState(725);
				match(T__27);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 7);
				{
				setState(726);
				match(T__28);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 8);
				{
				setState(727);
				match(T__13);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 9);
				{
				setState(728);
				match(T__29);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 10);
				{
				setState(729);
				match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 11);
				{
				setState(730);
				match(T__18);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 12);
				{
				setState(731);
				match(T__30);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 13);
				{
				setState(732);
				match(T__19);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 14);
				{
				setState(733);
				match(T__20);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 15);
				{
				setState(734);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 16);
				{
				setState(735);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 17);
				{
				setState(736);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 18);
				{
				setState(737);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 19);
				{
				setState(738);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 20);
				{
				setState(739);
				match(T__36);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 21);
				{
				setState(740);
				match(T__37);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 22);
				{
				setState(741);
				match(T__38);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 23);
				{
				setState(742);
				match(T__39);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 24);
				{
				setState(743);
				match(T__40);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 25);
				{
				setState(744);
				match(T__41);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 26);
				{
				setState(745);
				match(T__42);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 27);
				{
				setState(746);
				match(T__43);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 28);
				{
				setState(747);
				match(T__44);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 29);
				{
				setState(748);
				match(T__21);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 30);
				{
				setState(749);
				match(T__22);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 31);
				{
				setState(750);
				match(T__45);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 32);
				{
				setState(751);
				match(T__46);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 33);
				{
				setState(752);
				match(T__47);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 34);
				{
				setState(753);
				match(T__48);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 35);
				{
				setState(754);
				match(T__12);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 36);
				{
				setState(755);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 37);
				{
				setState(756);
				match(T__50);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 38);
				{
				setState(757);
				match(T__0);
				setState(758);
				match(T__1);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 39);
				{
				setState(759);
				match(T__24);
				setState(760);
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
		enterRule(_localctx, 90, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
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
		enterRule(_localctx, 92, RULE_equality_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
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
		enterRule(_localctx, 94, RULE_template_decl_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			match(TEMPLATE);
			setState(768);
			match(T__19);
			setState(769);
			template_param_list();
			setState(770);
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
		enterRule(_localctx, 96, RULE_template_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(781);
				switch (_input.LA(1)) {
				case T__19:
					{
					{
					setState(772);
					match(T__19);
					setState(773);
					template_param_list();
					setState(774);
					match(T__20);
					}
					}
					break;
				case T__0:
					{
					{
					setState(776);
					match(T__0);
					setState(777);
					template_param_list();
					setState(778);
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
					setState(780);
					no_angle_brackets_or_brackets();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(783); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << NEWLINE) | (1L << ESCAPE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ELLIPSIS - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (ASM - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (WHITESPACE - 64)) | (1L << (OTHER - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
			setState(785);
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
			setState(787);
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
		enterRule(_localctx, 102, RULE_no_brackets_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
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
			setState(791);
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
		enterRule(_localctx, 106, RULE_no_curlies);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
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
			setState(795);
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
		enterRule(_localctx, 110, RULE_no_squares_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
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
		enterRule(_localctx, 112, RULE_no_comma_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
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
			setState(801);
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
		enterRule(_localctx, 116, RULE_assign_water_l2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
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
		enterRule(_localctx, 118, RULE_water);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
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
			setState(811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(807);
				asciiTab();
				}
				break;
			case 2:
				{
				setState(808);
				externC();
				}
				break;
			case 3:
				{
				setState(809);
				macroFunctionPointer();
				}
				break;
			case 4:
				{
				setState(810);
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
			setState(816); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(813);
					pre_macro_identifier();
					setState(814);
					match(T__12);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(818); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
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
			setState(820);
			match(EXTERN);
			setState(821);
			match(T__51);
			setState(823);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(822);
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
			setState(825);
			macroCall();
			setState(827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(826);
				match(NEWLINE);
				}
				break;
			}
			setState(830);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(829);
				pre_macro_identifier();
				}
				break;
			}
			setState(833);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(832);
				match(NEWLINE);
				}
			}

			setState(835);
			macroCall();
			setState(837);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(836);
				match(NEWLINE);
				}
			}

			setState(839);
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
			setState(841);
			match(T__4);
			setState(842);
			match(T__0);
			setState(843);
			function_name();
			setState(844);
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
			setState(846);
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
			setState(894);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(849);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(848);
					template_decl_start();
					}
				}

				setState(852);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(851);
					return_type();
					}
					break;
				}
				setState(858);
				_la = _input.LA(1);
				if (_la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(854);
					pre_other();
					setState(856);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(855);
						match(NEWLINE);
						}
					}

					}
				}

				setState(860);
				function_name();
				setState(862);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(861);
					match(NEWLINE);
					}
				}

				setState(864);
				function_param_list();
				setState(866);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(865);
					ctor_list();
					}
				}

				setState(869);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(868);
					match(NEWLINE);
					}
					break;
				}
				setState(872);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(871);
					match(COMMENT);
					}
				}

				setState(875);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(874);
					match(NEWLINE);
					}
				}

				setState(877);
				compound_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(880);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(879);
					return_type();
					}
					break;
				}
				setState(882);
				macroCall_asFunctionHeader();
				setState(884);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(883);
					match(NEWLINE);
					}
					break;
				}
				setState(887);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(886);
					match(COMMENT);
					}
				}

				setState(890);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(889);
					match(NEWLINE);
					}
				}

				setState(892);
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
			setState(896);
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
			setState(922);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(904);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(898);
						function_decl_specifiers();
						setState(900);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(899);
							match(NEWLINE);
							}
						}

						}
						} 
					}
					setState(906);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				}
				setState(907);
				type_name();
				}
				setState(915);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13 || _la==T__14) {
					{
					{
					setState(909);
					ptr_operator();
					setState(911);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(910);
						match(NEWLINE);
						}
					}

					}
					}
					setState(917);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(918);
				macroCall();
				setState(920);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(919);
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
			setState(998);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(924);
				match(T__0);
				setState(926);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(925);
					match(NEWLINE);
					}
					break;
				}
				setState(929);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(928);
					parameter_decl_clause();
					}
					break;
				}
				setState(932);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(931);
					match(NEWLINE);
					}
				}

				setState(934);
				match(T__1);
				setState(936);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(935);
					match(T__14);
					}
				}

				setState(944);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CV_QUALIFIER) {
					{
					{
					setState(938);
					match(CV_QUALIFIER);
					setState(940);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
					case 1:
						{
						setState(939);
						match(NEWLINE);
						}
						break;
					}
					}
					}
					setState(946);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(948);
				_la = _input.LA(1);
				if (_la==THROW) {
					{
					setState(947);
					exception_specification();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(950);
				match(T__0);
				setState(952);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(951);
					match(NEWLINE);
					}
				}

				setState(954);
				parameter_name();
				setState(962);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(955);
					match(T__12);
					setState(957);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(956);
						match(NEWLINE);
						}
					}

					setState(959);
					parameter_name();
					}
					}
					setState(964);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(966);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(965);
					match(NEWLINE);
					}
				}

				setState(968);
				match(T__1);
				setState(970);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(969);
					match(NEWLINE);
					}
				}

				setState(994); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(972);
					type_name();
					setState(973);
					parameter_id();
					setState(981);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(974);
						match(T__12);
						setState(976);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(975);
							match(NEWLINE);
							}
						}

						setState(978);
						parameter_id();
						}
						}
						setState(983);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(984);
					match(T__2);
					setState(986);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
					case 1:
						{
						setState(985);
						match(NEWLINE);
						}
						break;
					}
					setState(989);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
					case 1:
						{
						setState(988);
						match(COMMENT);
						}
						break;
					}
					setState(992);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
					case 1:
						{
						setState(991);
						match(NEWLINE);
						}
						break;
					}
					}
					}
					setState(996); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__19) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)))) != 0) );
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
		public List<TerminalNode> COMMENT() { return getTokens(FunctionParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(FunctionParser.COMMENT, i);
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
			setState(1001);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1000);
				match(COMMENT);
				}
			}

			setState(1004);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1003);
				match(NEWLINE);
				}
			}

			setState(1006);
			parameter_decl();
			setState(1020);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1007);
					match(T__12);
					setState(1009);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
					case 1:
						{
						setState(1008);
						match(NEWLINE);
						}
						break;
					}
					setState(1012);
					_la = _input.LA(1);
					if (_la==COMMENT) {
						{
						setState(1011);
						match(COMMENT);
						}
					}

					setState(1015);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1014);
						match(NEWLINE);
						}
					}

					setState(1017);
					parameter_decl();
					}
					} 
				}
				setState(1022);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			}
			}
			setState(1034);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(1023);
				match(T__12);
				setState(1025);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(1024);
					match(NEWLINE);
					}
					break;
				}
				setState(1028);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1027);
					match(COMMENT);
					}
				}

				setState(1031);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1030);
					match(NEWLINE);
					}
				}

				setState(1033);
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
			setState(1040);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1036);
				match(VOID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1037);
				type_name();
				setState(1038);
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
			setState(1043);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__14) {
				{
				setState(1042);
				ptrs();
				}
			}

			setState(1050);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(1045);
				match(T__0);
				setState(1046);
				parameter_id();
				setState(1047);
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
				setState(1049);
				parameter_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1053);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__24) {
				{
				setState(1052);
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
			setState(1055);
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
			setState(1058);
			match(T__3);
			setState(1059);
			ctor_initializer();
			setState(1064);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(1060);
				match(T__12);
				setState(1061);
				ctor_initializer();
				}
				}
				setState(1066);
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
			setState(1067);
			initializer_id();
			setState(1068);
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
			setState(1071);
			_la = _input.LA(1);
			if (_la==T__52) {
				{
				setState(1070);
				match(T__52);
				}
			}

			setState(1073);
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
			setState(1075);
			match(T__0);
			setState(1077);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
				{
				setState(1076);
				expr();
				}
			}

			setState(1079);
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
			setState(1088);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case NEW:
			case PRE_PRAGMA_KEYWORDS:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1081);
				identifier();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(1082);
				match(T__0);
				setState(1083);
				function_name();
				setState(1084);
				match(T__1);
				}
				break;
			case OPERATOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1086);
				match(OPERATOR);
				setState(1087);
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
			setState(1090);
			match(THROW);
			setState(1091);
			match(T__0);
			setState(1092);
			type_id_list();
			setState(1093);
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
			setState(1098);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << NEWLINE) | (1L << ESCAPE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ELLIPSIS - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (ASM - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (WHITESPACE - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(1095);
				no_brackets();
				}
				}
				setState(1100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(1101);
				match(T__0);
				setState(1102);
				type_id_list();
				setState(1103);
				match(T__1);
				setState(1107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << NEWLINE) | (1L << ESCAPE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ELLIPSIS - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (ASM - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (WHITESPACE - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(1104);
					no_brackets();
					}
					}
					setState(1109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(1114);
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
			setState(1115);
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
			setState(1197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				_localctx = new DeclByClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1118);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(1117);
					template_decl_start();
					}
				}

				setState(1120);
				class_def();
				setState(1122);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1121);
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
				setState(1128);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(1124);
					match(TYPEDEF);
					setState(1126);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1125);
						match(NEWLINE);
						}
					}

					}
				}

				setState(1131);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(1130);
					template_decl_start();
					}
				}

				setState(1133);
				type_name();
				setState(1134);
				init_declarator_list();
				}
				break;
			case 3:
				_localctx = new FunctionPointerDeclareContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1140);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(1136);
					match(TYPEDEF);
					setState(1138);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1137);
						match(NEWLINE);
						}
					}

					}
				}

				setState(1142);
				type_name();
				setState(1143);
				match(T__0);
				setState(1145);
				_la = _input.LA(1);
				if (_la==ALPHA_NUMERIC) {
					{
					setState(1144);
					callingConvention();
					}
				}

				setState(1147);
				ptr_operator();
				setState(1149);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (NEW - 96)) | (1L << (PRE_PRAGMA_KEYWORDS - 96)) | (1L << (ALPHA_NUMERIC - 96)))) != 0)) {
					{
					setState(1148);
					identifier();
					}
				}

				setState(1151);
				match(T__1);
				setState(1152);
				param_type_list();
				setState(1154);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1153);
					match(NEWLINE);
					}
				}

				setState(1158);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1156);
					pre_other();
					}
					break;
				case 2:
					{
					setState(1157);
					macroCall();
					}
					break;
				}
				setState(1165);
				_la = _input.LA(1);
				if (_la==T__30) {
					{
					setState(1160);
					match(T__30);
					setState(1162);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1161);
						match(NEWLINE);
						}
					}

					setState(1164);
					argument();
					}
				}

				setState(1167);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new StructUnionEnumContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1173);
				_la = _input.LA(1);
				if (_la==CV_QUALIFIER) {
					{
					setState(1169);
					match(CV_QUALIFIER);
					setState(1171);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1170);
						match(NEWLINE);
						}
					}

					}
				}

				setState(1179);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==STATIC || _la==VIRTUAL) {
					{
					setState(1175);
					function_decl_specifiers();
					setState(1177);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1176);
						match(NEWLINE);
						}
					}

					}
				}

				setState(1185);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(1181);
					match(TYPEDEF);
					setState(1183);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1182);
						match(NEWLINE);
						}
					}

					}
				}

				setState(1187);
				special_datatype();
				setState(1189);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
				case 1:
					{
					setState(1188);
					match(NEWLINE);
					}
					break;
				}
				setState(1192);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					{
					setState(1191);
					init_declarator_list();
					}
					break;
				}
				setState(1195);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1194);
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
			setState(1200); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1199);
				match(ALPHA_NUMERIC);
				}
				}
				setState(1202); 
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
			setState(1251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1204);
				match(SPECIAL_DATA);
				setState(1206);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1205);
					match(NEWLINE);
					}
				}

				setState(1209);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1208);
					pre_other();
					}
					break;
				}
				setState(1215);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (NEW - 96)) | (1L << (PRE_PRAGMA_KEYWORDS - 96)) | (1L << (ALPHA_NUMERIC - 96)))) != 0)) {
					{
					setState(1211);
					identifier();
					setState(1213);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1212);
						match(NEWLINE);
						}
					}

					}
				}

				setState(1218);
				_la = _input.LA(1);
				if (_la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(1217);
					pre_other();
					}
				}

				setState(1220);
				match(OPENING_CURLY);
				skipToEndOfObject(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1222);
				match(SPECIAL_DATA);
				setState(1224);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1223);
					match(NEWLINE);
					}
				}

				setState(1227);
				_la = _input.LA(1);
				if (_la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(1226);
					pre_other();
					}
				}

				setState(1229);
				identifier();
				setState(1231);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1230);
					match(NEWLINE);
					}
				}

				setState(1234);
				_la = _input.LA(1);
				if (_la==T__13 || _la==T__14) {
					{
					setState(1233);
					ptrs();
					}
				}

				setState(1236);
				identifier();
				setState(1238);
				_la = _input.LA(1);
				if (_la==T__13 || _la==T__14) {
					{
					setState(1237);
					ptrs();
					}
				}

				setState(1240);
				match(T__30);
				skipToEndOfObject(); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1243);
				match(SPECIAL_DATA);
				setState(1245);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1244);
					match(NEWLINE);
					}
				}

				setState(1248);
				_la = _input.LA(1);
				if (_la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(1247);
					pre_other();
					}
				}

				setState(1250);
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
			setState(1253);
			init_declarator();
			setState(1264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1255);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1254);
						match(NEWLINE);
						}
					}

					setState(1257);
					match(T__12);
					setState(1259);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1258);
						match(NEWLINE);
						}
					}

					setState(1261);
					init_declarator();
					}
					} 
				}
				setState(1266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			}
			setState(1268);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1267);
				match(NEWLINE);
				}
			}

			setState(1271);
			_la = _input.LA(1);
			if (_la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
				{
				setState(1270);
				pre_other();
				}
			}

			setState(1273);
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
			setState(1275);
			match(CLASS_KEY);
			setState(1277);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1276);
				match(NEWLINE);
				}
			}

			setState(1280);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (NEW - 96)) | (1L << (PRE_PRAGMA_KEYWORDS - 96)) | (1L << (ALPHA_NUMERIC - 96)))) != 0)) {
				{
				setState(1279);
				class_name();
				}
			}

			setState(1283);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(1282);
				base_classes();
				}
			}

			setState(1285);
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
			setState(1288);
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
			setState(1290);
			match(T__3);
			setState(1291);
			base_class();
			setState(1296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(1292);
				match(T__12);
				setState(1293);
				base_class();
				}
				}
				setState(1298);
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
			setState(1303);
			_la = _input.LA(1);
			if (_la==VIRTUAL) {
				{
				setState(1299);
				match(VIRTUAL);
				setState(1301);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1300);
					match(NEWLINE);
					}
				}

				}
			}

			setState(1306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1305);
				access_specifier();
				}
				break;
			}
			setState(1308);
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
			setState(1361); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1361);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
					case 1:
						{
						setState(1310);
						match(EXTERN);
						setState(1312);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
						case 1:
							{
							setState(1311);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 2:
						{
						setState(1314);
						function_decl_specifiers();
						setState(1316);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
						case 1:
							{
							setState(1315);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 3:
						{
						setState(1318);
						match(CV_QUALIFIER);
						setState(1320);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
						case 1:
							{
							setState(1319);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 4:
						{
						setState(1322);
						match(UNSIGNED);
						setState(1324);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
						case 1:
							{
							setState(1323);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 5:
						{
						setState(1326);
						match(SIGNED);
						setState(1328);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
						case 1:
							{
							setState(1327);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 6:
						{
						setState(1330);
						match(AUTO);
						setState(1332);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
						case 1:
							{
							setState(1331);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 7:
						{
						setState(1334);
						match(REGISTER);
						setState(1336);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
						case 1:
							{
							setState(1335);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 8:
						{
						setState(1338);
						ptr_operator();
						setState(1340);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
						case 1:
							{
							setState(1339);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 9:
						{
						setState(1342);
						base_type();
						}
						break;
					case 10:
						{
						{
						{
						setState(1343);
						match(T__19);
						setState(1344);
						template_param_list();
						setState(1345);
						match(T__20);
						}
						setState(1357);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1347);
								match(T__52);
								setState(1348);
								base_type();
								setState(1353);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
								case 1:
									{
									setState(1349);
									match(T__19);
									setState(1350);
									template_param_list();
									setState(1351);
									match(T__20);
									}
									break;
								}
								}
								} 
							}
							setState(1359);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
						}
						}
						}
						break;
					case 11:
						{
						setState(1360);
						macroCall();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1363); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
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
			setState(1393); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1393);
					switch (_input.LA(1)) {
					case VOID:
						{
						setState(1365);
						match(VOID);
						setState(1367);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
						case 1:
							{
							setState(1366);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case T__11:
						{
						setState(1369);
						match(T__11);
						setState(1371);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
						case 1:
							{
							setState(1370);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case T__53:
						{
						setState(1373);
						match(T__53);
						setState(1375);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
						case 1:
							{
							setState(1374);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case T__54:
						{
						setState(1377);
						match(T__54);
						setState(1379);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
						case 1:
							{
							setState(1378);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case SPECIAL_DATA:
						{
						setState(1381);
						match(SPECIAL_DATA);
						setState(1383);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
						case 1:
							{
							setState(1382);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case CLASS_KEY:
						{
						setState(1385);
						match(CLASS_KEY);
						setState(1387);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
						case 1:
							{
							setState(1386);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case ALPHA_NUMERIC:
						{
						setState(1389);
						match(ALPHA_NUMERIC);
						setState(1391);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
						case 1:
							{
							setState(1390);
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
				setState(1395); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
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
			setState(1397);
			identifier();
			setState(1399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(1398);
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
			setState(1419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1401);
				match(T__0);
				setState(1402);
				match(VOID);
				setState(1403);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1404);
				match(T__0);
				setState(1416);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__19) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ELLIPSIS - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)))) != 0)) {
					{
					setState(1405);
					param_type();
					setState(1413);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(1406);
						match(T__12);
						setState(1408);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(1407);
							match(NEWLINE);
							}
						}

						setState(1410);
						param_type();
						}
						}
						setState(1415);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1418);
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
			setState(1428);
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
			case T__53:
			case T__54:
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
				setState(1421);
				type_name();
				setState(1423);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(1422);
					match(NEWLINE);
					}
					break;
				}
				setState(1425);
				param_type_id();
				}
				break;
			case ELLIPSIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1427);
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
			setState(1431);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__14) {
				{
				setState(1430);
				ptrs();
				}
			}

			setState(1440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				{
				setState(1433);
				match(T__0);
				setState(1434);
				param_type_id();
				setState(1435);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(1438);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (NEW - 96)) | (1L << (PRE_PRAGMA_KEYWORDS - 96)) | (1L << (ALPHA_NUMERIC - 96)))) != 0)) {
					{
					setState(1437);
					parameter_name();
					}
				}

				}
				break;
			}
			setState(1443);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__24) {
				{
				setState(1442);
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
			setState(1456);
			switch (_input.LA(1)) {
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1445);
				match(ALPHA_NUMERIC);
				setState(1450);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1446);
						match(T__52);
						setState(1447);
						match(ALPHA_NUMERIC);
						}
						} 
					}
					setState(1452);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
				}
				}
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(1453);
				match(NEW);
				}
				break;
			case PRE_PRAGMA_KEYWORDS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1454);
				match(PRE_PRAGMA_KEYWORDS);
				}
				break;
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(1455);
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
			setState(1458);
			_la = _input.LA(1);
			if ( !(((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (HEX_LITERAL - 117)) | (1L << (DECIMAL_LITERAL - 117)) | (1L << (OCTAL_LITERAL - 117)))) != 0)) ) {
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
			setState(1464); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1460);
				ptr_operator();
				setState(1462);
				_la = _input.LA(1);
				if (_la==T__55) {
					{
					setState(1461);
					match(T__55);
					}
				}

				}
				}
				setState(1466); 
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
		enterRule(_localctx, 198, RULE_func_ptrs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1468);
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
			setState(1470);
			assign_expr();
			setState(1475);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1471);
					match(ESCAPE);
					setState(1472);
					match(NEWLINE);
					}
					} 
				}
				setState(1477);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			}
			setState(1498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				{
				setState(1479);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
				case 1:
					{
					setState(1478);
					match(NEWLINE);
					}
					break;
				}
				setState(1482);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1481);
					match(COMMENT);
					}
				}

				setState(1485);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1484);
					match(NEWLINE);
					}
				}

				setState(1487);
				match(T__12);
				setState(1489);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
				case 1:
					{
					setState(1488);
					match(NEWLINE);
					}
					break;
				}
				setState(1492);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1491);
					match(COMMENT);
					}
				}

				setState(1495);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1494);
					match(NEWLINE);
					}
				}

				setState(1497);
				expr();
				}
				break;
			}
			setState(1504);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1500);
					match(ESCAPE);
					setState(1501);
					match(NEWLINE);
					}
					} 
				}
				setState(1506);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
			setState(1507);
			conditional_expression();
			setState(1529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(1509);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
				case 1:
					{
					setState(1508);
					match(NEWLINE);
					}
					break;
				}
				setState(1512);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1511);
					match(COMMENT);
					}
				}

				setState(1515);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1514);
					match(NEWLINE);
					}
				}

				setState(1517);
				assignment_operator();
				setState(1519);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
				case 1:
					{
					setState(1518);
					match(NEWLINE);
					}
					break;
				}
				setState(1522);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1521);
					match(COMMENT);
					}
				}

				setState(1525);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1524);
					match(NEWLINE);
					}
				}

				setState(1527);
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
			setState(1574);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				_localctx = new NormOrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1531);
				or_expression();
				}
				break;
			case 2:
				_localctx = new CndExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1532);
				or_expression();
				{
				setState(1534);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
				case 1:
					{
					setState(1533);
					match(NEWLINE);
					}
					break;
				}
				setState(1537);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1536);
					match(COMMENT);
					}
				}

				setState(1540);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1539);
					match(NEWLINE);
					}
				}

				setState(1542);
				match(T__56);
				setState(1544);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
				case 1:
					{
					setState(1543);
					match(NEWLINE);
					}
					break;
				}
				setState(1547);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1546);
					match(COMMENT);
					}
				}

				setState(1550);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1549);
					match(NEWLINE);
					}
				}

				setState(1552);
				expr();
				setState(1554);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
				case 1:
					{
					setState(1553);
					match(NEWLINE);
					}
					break;
				}
				setState(1557);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1556);
					match(COMMENT);
					}
				}

				setState(1560);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1559);
					match(NEWLINE);
					}
				}

				setState(1562);
				match(T__3);
				setState(1564);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
				case 1:
					{
					setState(1563);
					match(NEWLINE);
					}
					break;
				}
				setState(1567);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1566);
					match(COMMENT);
					}
				}

				setState(1570);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1569);
					match(NEWLINE);
					}
				}

				setState(1572);
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
			setState(1576);
			and_expression();
			setState(1597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				{
				setState(1578);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
				case 1:
					{
					setState(1577);
					match(NEWLINE);
					}
					break;
				}
				setState(1581);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1580);
					match(COMMENT);
					}
				}

				setState(1584);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1583);
					match(NEWLINE);
					}
				}

				setState(1586);
				match(T__46);
				setState(1588);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
				case 1:
					{
					setState(1587);
					match(NEWLINE);
					}
					break;
				}
				setState(1591);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1590);
					match(COMMENT);
					}
				}

				setState(1594);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1593);
					match(NEWLINE);
					}
				}

				setState(1596);
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
			setState(1599);
			inclusive_or_expression();
			setState(1620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				{
				setState(1601);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
				case 1:
					{
					setState(1600);
					match(NEWLINE);
					}
					break;
				}
				setState(1604);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1603);
					match(COMMENT);
					}
				}

				setState(1607);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1606);
					match(NEWLINE);
					}
				}

				setState(1609);
				match(T__45);
				setState(1611);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
				case 1:
					{
					setState(1610);
					match(NEWLINE);
					}
					break;
				}
				setState(1614);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1613);
					match(COMMENT);
					}
				}

				setState(1617);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1616);
					match(NEWLINE);
					}
				}

				setState(1619);
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
			setState(1622);
			exclusive_or_expression();
			setState(1643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				{
				setState(1624);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
				case 1:
					{
					setState(1623);
					match(NEWLINE);
					}
					break;
				}
				setState(1627);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1626);
					match(COMMENT);
					}
				}

				setState(1630);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1629);
					match(NEWLINE);
					}
				}

				setState(1632);
				match(T__29);
				setState(1634);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
				case 1:
					{
					setState(1633);
					match(NEWLINE);
					}
					break;
				}
				setState(1637);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1636);
					match(COMMENT);
					}
				}

				setState(1640);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1639);
					match(NEWLINE);
					}
				}

				setState(1642);
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
			setState(1645);
			bit_and_expression();
			setState(1666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				{
				setState(1647);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
				case 1:
					{
					setState(1646);
					match(NEWLINE);
					}
					break;
				}
				setState(1650);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1649);
					match(COMMENT);
					}
				}

				setState(1653);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1652);
					match(NEWLINE);
					}
				}

				setState(1655);
				match(T__28);
				setState(1657);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
				case 1:
					{
					setState(1656);
					match(NEWLINE);
					}
					break;
				}
				setState(1660);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1659);
					match(COMMENT);
					}
				}

				setState(1663);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1662);
					match(NEWLINE);
					}
				}

				setState(1665);
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
			setState(1668);
			equality_expression();
			setState(1689);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				{
				setState(1670);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
				case 1:
					{
					setState(1669);
					match(NEWLINE);
					}
					break;
				}
				setState(1673);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1672);
					match(COMMENT);
					}
				}

				setState(1676);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1675);
					match(NEWLINE);
					}
				}

				setState(1678);
				match(T__13);
				setState(1680);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
				case 1:
					{
					setState(1679);
					match(NEWLINE);
					}
					break;
				}
				setState(1683);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1682);
					match(COMMENT);
					}
				}

				setState(1686);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1685);
					match(NEWLINE);
					}
				}

				setState(1688);
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
			setState(1691);
			relational_expression();
			setState(1713);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				{
				setState(1693);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
				case 1:
					{
					setState(1692);
					match(NEWLINE);
					}
					break;
				}
				setState(1696);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1695);
					match(COMMENT);
					}
				}

				setState(1699);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1698);
					match(NEWLINE);
					}
				}

				setState(1701);
				equality_operator();
				setState(1703);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
				case 1:
					{
					setState(1702);
					match(NEWLINE);
					}
					break;
				}
				setState(1706);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1705);
					match(COMMENT);
					}
				}

				setState(1709);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1708);
					match(NEWLINE);
					}
				}

				setState(1711);
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
			setState(1715);
			shift_expression();
			setState(1737);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
			case 1:
				{
				setState(1717);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
				case 1:
					{
					setState(1716);
					match(NEWLINE);
					}
					break;
				}
				setState(1720);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1719);
					match(COMMENT);
					}
				}

				setState(1723);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1722);
					match(NEWLINE);
					}
				}

				setState(1725);
				relational_operator();
				setState(1727);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
				case 1:
					{
					setState(1726);
					match(NEWLINE);
					}
					break;
				}
				setState(1730);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1729);
					match(COMMENT);
					}
				}

				setState(1733);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1732);
					match(NEWLINE);
					}
				}

				setState(1735);
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
			setState(1739);
			additive_expression();
			setState(1760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				{
				setState(1741);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
				case 1:
					{
					setState(1740);
					match(NEWLINE);
					}
					break;
				}
				setState(1744);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1743);
					match(COMMENT);
					}
				}

				setState(1747);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1746);
					match(NEWLINE);
					}
				}

				setState(1749);
				_la = _input.LA(1);
				if ( !(_la==T__39 || _la==T__40) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1751);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
				case 1:
					{
					setState(1750);
					match(NEWLINE);
					}
					break;
				}
				setState(1754);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1753);
					match(COMMENT);
					}
				}

				setState(1757);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1756);
					match(NEWLINE);
					}
				}

				setState(1759);
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
			setState(1762);
			multiplicative_expression();
			setState(1783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
			case 1:
				{
				setState(1764);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
				case 1:
					{
					setState(1763);
					match(NEWLINE);
					}
					break;
				}
				setState(1767);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1766);
					match(COMMENT);
					}
				}

				setState(1770);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1769);
					match(NEWLINE);
					}
				}

				setState(1772);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1774);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
				case 1:
					{
					setState(1773);
					match(NEWLINE);
					}
					break;
				}
				setState(1777);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1776);
					match(COMMENT);
					}
				}

				setState(1780);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1779);
					match(NEWLINE);
					}
				}

				setState(1782);
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
			setState(1785);
			function_pointer_use_expression();
			setState(1806);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
			case 1:
				{
				setState(1787);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
				case 1:
					{
					setState(1786);
					match(NEWLINE);
					}
					break;
				}
				setState(1790);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1789);
					match(COMMENT);
					}
				}

				setState(1793);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1792);
					match(NEWLINE);
					}
				}

				setState(1795);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__26) | (1L << T__27))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1797);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
				case 1:
					{
					setState(1796);
					match(NEWLINE);
					}
					break;
				}
				setState(1800);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1799);
					match(COMMENT);
					}
				}

				setState(1803);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1802);
					match(NEWLINE);
					}
				}

				setState(1805);
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
			setState(1819);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1808);
				match(T__0);
				setState(1809);
				ptr_operator();
				setState(1811);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (NEW - 96)) | (1L << (PRE_PRAGMA_KEYWORDS - 96)) | (1L << (ALPHA_NUMERIC - 96)))) != 0)) {
					{
					setState(1810);
					identifier();
					}
				}

				setState(1813);
				match(T__1);
				setState(1814);
				match(T__0);
				setState(1815);
				argument_list();
				setState(1816);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1818);
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
			setState(1827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1821);
				match(T__0);
				setState(1822);
				cast_target();
				setState(1823);
				match(T__1);
				setState(1824);
				cast_expression();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1826);
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
			setState(1833);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1829);
				type_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1830);
				type_name();
				setState(1831);
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
			setState(1843);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1835);
				address_of_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1836);
				unary_op_and_cast_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1837);
				sizeof_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1838);
				new_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1839);
				postfix_expression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1840);
				defined_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1841);
				macroCall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1842);
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
			setState(1845);
			match(T__13);
			setState(1846);
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
			setState(1906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,346,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1849);
				_la = _input.LA(1);
				if (_la==T__52) {
					{
					setState(1848);
					match(T__52);
					}
				}

				setState(1851);
				match(NEW);
				setState(1853);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,331,_ctx) ) {
				case 1:
					{
					setState(1852);
					match(NEWLINE);
					}
					break;
				}
				setState(1856);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1855);
					match(COMMENT);
					}
				}

				setState(1859);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1858);
					match(NEWLINE);
					}
				}

				setState(1861);
				type_name();
				setState(1863);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,334,_ctx) ) {
				case 1:
					{
					setState(1862);
					match(NEWLINE);
					}
					break;
				}
				setState(1866);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1865);
					match(COMMENT);
					}
				}

				setState(1869);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1868);
					match(NEWLINE);
					}
				}

				setState(1871);
				match(T__24);
				setState(1873);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(1872);
					conditional_expression();
					}
				}

				setState(1875);
				match(T__25);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1878);
				_la = _input.LA(1);
				if (_la==T__52) {
					{
					setState(1877);
					match(T__52);
					}
				}

				setState(1880);
				match(NEW);
				setState(1882);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,339,_ctx) ) {
				case 1:
					{
					setState(1881);
					match(NEWLINE);
					}
					break;
				}
				setState(1885);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1884);
					match(COMMENT);
					}
				}

				setState(1888);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1887);
					match(NEWLINE);
					}
				}

				setState(1890);
				type_name();
				setState(1892);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,342,_ctx) ) {
				case 1:
					{
					setState(1891);
					match(NEWLINE);
					}
					break;
				}
				setState(1895);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1894);
					match(COMMENT);
					}
				}

				setState(1898);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1897);
					match(NEWLINE);
					}
				}

				setState(1900);
				match(T__0);
				setState(1902);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(1901);
					expr();
					}
				}

				setState(1904);
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
			setState(1908);
			unary_operator();
			setState(1910);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,347,_ctx) ) {
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
			setState(1946);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,356,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1920);
				sizeof();
				setState(1922);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,350,_ctx) ) {
				case 1:
					{
					setState(1921);
					match(NEWLINE);
					}
					break;
				}
				setState(1925);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1924);
					match(COMMENT);
					}
				}

				setState(1928);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1927);
					match(NEWLINE);
					}
				}

				setState(1930);
				match(T__0);
				setState(1931);
				sizeof_operand();
				setState(1932);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1934);
				sizeof();
				setState(1936);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,353,_ctx) ) {
				case 1:
					{
					setState(1935);
					match(NEWLINE);
					}
					break;
				}
				setState(1939);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1938);
					match(COMMENT);
					}
				}

				setState(1942);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1941);
					match(NEWLINE);
					}
				}

				setState(1944);
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
			setState(1948);
			match(T__57);
			}
		}
		catch (RecognitionException re) {
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
			setState(1975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,363,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1950);
				match(T__58);
				setState(1952);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,357,_ctx) ) {
				case 1:
					{
					setState(1951);
					match(NEWLINE);
					}
					break;
				}
				setState(1955);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1954);
					match(COMMENT);
					}
				}

				setState(1958);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1957);
					match(NEWLINE);
					}
				}

				setState(1960);
				match(T__0);
				setState(1961);
				expr();
				setState(1962);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1964);
				match(T__58);
				setState(1966);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,360,_ctx) ) {
				case 1:
					{
					setState(1965);
					match(NEWLINE);
					}
					break;
				}
				setState(1969);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1968);
					match(COMMENT);
					}
				}

				setState(1972);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1971);
					match(NEWLINE);
					}
				}

				setState(1974);
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
			setState(1977);
			type_name();
			setState(1990);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << NEWLINE))) != 0) || _la==COMMENT) {
				{
				{
				setState(1979);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,364,_ctx) ) {
				case 1:
					{
					setState(1978);
					match(NEWLINE);
					}
					break;
				}
				setState(1982);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1981);
					match(COMMENT);
					}
				}

				setState(1985);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1984);
					match(NEWLINE);
					}
				}

				setState(1987);
				ptr_operator();
				}
				}
				setState(1992);
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
			setState(1993);
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
			setState(1995);
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
		enterRule(_localctx, 252, RULE_asmCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1997);
			match(ASM);
			setState(2001);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GOTO || _la==CV_QUALIFIER) {
				{
				{
				setState(1998);
				_la = _input.LA(1);
				if ( !(_la==GOTO || _la==CV_QUALIFIER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(2003);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2005);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(2004);
				match(NEWLINE);
				}
			}

			setState(2007);
			match(T__0);
			setState(2009);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(2008);
				match(NEWLINE);
				}
			}

			setState(2015); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2011);
				match(STRING);
				setState(2013);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(2012);
					match(NEWLINE);
					}
				}

				}
				}
				setState(2017); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(2041);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__52) | (1L << T__59))) != 0)) {
				{
				{
				setState(2019);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__52) | (1L << T__59))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2037);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					{
					setState(2020);
					match(STRING);
					setState(2022);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(2021);
						match(NEWLINE);
						}
					}

					}
					setState(2035);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(2024);
						match(T__0);
						setState(2025);
						identifier();
						setState(2030);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__12) {
							{
							{
							setState(2026);
							match(T__12);
							setState(2027);
							identifier();
							}
							}
							setState(2032);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2033);
						match(T__1);
						}
					}

					}
				}

				}
				}
				setState(2043);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2044);
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
			setState(2070);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,384,_ctx) ) {
			case 1:
				{
				_localctx = new ArrayAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2048);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__19) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)))) != 0)) {
					{
					setState(2047);
					type_name();
					}
				}

				setState(2050);
				initializer_expression();
				}
				break;
			case 2:
				{
				_localctx = new PrimaryOnlyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2051);
				primary_expression();
				}
				break;
			case 3:
				{
				_localctx = new IncDecOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2053);
				_la = _input.LA(1);
				if (_la==T__13 || _la==T__14) {
					{
					setState(2052);
					ptr_operator();
					}
				}

				setState(2055);
				inc_dec();
				setState(2057);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,380,_ctx) ) {
				case 1:
					{
					setState(2056);
					match(NEWLINE);
					}
					break;
				}
				setState(2060);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(2059);
					match(COMMENT);
					}
				}

				setState(2063);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(2062);
					match(NEWLINE);
					}
				}

				setState(2066);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,383,_ctx) ) {
				case 1:
					{
					setState(2065);
					ptr_operator();
					}
					break;
				}
				setState(2068);
				primary_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,404,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2142);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,403,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayIndexingContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2072);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2074);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,385,_ctx) ) {
						case 1:
							{
							setState(2073);
							match(NEWLINE);
							}
							break;
						}
						setState(2077);
						_la = _input.LA(1);
						if (_la==COMMENT) {
							{
							setState(2076);
							match(COMMENT);
							}
						}

						setState(2080);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(2079);
							match(NEWLINE);
							}
						}

						setState(2082);
						match(T__24);
						setState(2084);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
							{
							setState(2083);
							expr();
							}
						}

						setState(2086);
						match(T__25);
						}
						break;
					case 2:
						{
						_localctx = new FuncCallContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2087);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(2089);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,389,_ctx) ) {
						case 1:
							{
							setState(2088);
							match(NEWLINE);
							}
							break;
						}
						setState(2092);
						_la = _input.LA(1);
						if (_la==COMMENT) {
							{
							setState(2091);
							match(COMMENT);
							}
						}

						setState(2095);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(2094);
							match(NEWLINE);
							}
						}

						setState(2097);
						match(T__0);
						setState(2098);
						argument_list();
						setState(2099);
						match(T__1);
						}
						break;
					case 3:
						{
						_localctx = new MemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2101);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2102);
						match(T__60);
						setState(2104);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,392,_ctx) ) {
						case 1:
							{
							setState(2103);
							match(NEWLINE);
							}
							break;
						}
						setState(2107);
						_la = _input.LA(1);
						if (_la==COMMENT) {
							{
							setState(2106);
							match(COMMENT);
							}
						}

						setState(2110);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(2109);
							match(NEWLINE);
							}
						}

						setState(2113);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(2112);
							match(TEMPLATE);
							}
						}

						{
						setState(2115);
						identifier();
						}
						}
						break;
					case 4:
						{
						_localctx = new PtrMemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2116);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2117);
						match(T__50);
						setState(2119);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,396,_ctx) ) {
						case 1:
							{
							setState(2118);
							match(NEWLINE);
							}
							break;
						}
						setState(2122);
						_la = _input.LA(1);
						if (_la==COMMENT) {
							{
							setState(2121);
							match(COMMENT);
							}
						}

						setState(2125);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(2124);
							match(NEWLINE);
							}
						}

						setState(2128);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(2127);
							match(TEMPLATE);
							}
						}

						{
						setState(2130);
						identifier();
						}
						}
						break;
					case 5:
						{
						_localctx = new IncDecOpContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2131);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2133);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,400,_ctx) ) {
						case 1:
							{
							setState(2132);
							match(NEWLINE);
							}
							break;
						}
						setState(2136);
						_la = _input.LA(1);
						if (_la==COMMENT) {
							{
							setState(2135);
							match(COMMENT);
							}
						}

						setState(2139);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(2138);
							match(NEWLINE);
							}
						}

						setState(2141);
						inc_dec();
						}
						break;
					}
					} 
				}
				setState(2146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,404,_ctx);
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
			setState(2147);
			match(OPENING_CURLY);
			setState(2149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,405,_ctx) ) {
			case 1:
				{
				setState(2148);
				match(NEWLINE);
				}
				break;
			}
			setState(2157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,407,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2151);
					match(COMMENT);
					setState(2153);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,406,_ctx) ) {
					case 1:
						{
						setState(2152);
						match(NEWLINE);
						}
						break;
					}
					}
					} 
				}
				setState(2159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,407,_ctx);
			}
			setState(2161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,408,_ctx) ) {
			case 1:
				{
				setState(2160);
				argument_list();
				}
				break;
			}
			setState(2164);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(2163);
				match(NEWLINE);
				}
			}

			setState(2172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(2166);
				match(COMMENT);
				setState(2168);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(2167);
					match(NEWLINE);
					}
				}

				}
				}
				setState(2174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2175);
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
			setState(2226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,426,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2187);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,415,_ctx) ) {
				case 1:
					{
					setState(2178);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,412,_ctx) ) {
					case 1:
						{
						setState(2177);
						match(NEWLINE);
						}
						break;
					}
					setState(2181);
					_la = _input.LA(1);
					if (_la==COMMENT) {
						{
						setState(2180);
						match(COMMENT);
						}
					}

					setState(2184);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(2183);
						match(NEWLINE);
						}
					}

					setState(2186);
					argument();
					}
					break;
				}
				setState(2190);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,416,_ctx) ) {
				case 1:
					{
					setState(2189);
					match(NEWLINE);
					}
					break;
				}
				setState(2193);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,417,_ctx) ) {
				case 1:
					{
					setState(2192);
					match(COMMENT);
					}
					break;
				}
				setState(2196);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,418,_ctx) ) {
				case 1:
					{
					setState(2195);
					match(NEWLINE);
					}
					break;
				}
				setState(2216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,423,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2199);
						_la = _input.LA(1);
						if (_la==T__12) {
							{
							setState(2198);
							match(T__12);
							}
						}

						setState(2202);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(2201);
							match(NEWLINE);
							}
						}

						setState(2210);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMENT) {
							{
							{
							setState(2204);
							match(COMMENT);
							setState(2206);
							_la = _input.LA(1);
							if (_la==NEWLINE) {
								{
								setState(2205);
								match(NEWLINE);
								}
							}

							}
							}
							setState(2212);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2213);
						argument();
						}
						} 
					}
					setState(2218);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,423,_ctx);
				}
				setState(2220);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(2219);
					match(T__12);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2222);
				match(VOID);
				setState(2224);
				_la = _input.LA(1);
				if (_la==T__13 || _la==T__14) {
					{
					setState(2223);
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
			setState(2228);
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
			setState(2240);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case T__60:
			case NEW:
			case PRE_PRAGMA_KEYWORDS:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2231);
				_la = _input.LA(1);
				if (_la==T__60) {
					{
					setState(2230);
					match(T__60);
					}
				}

				setState(2233);
				identifier();
				}
				}
				break;
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(2234);
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
				setState(2235);
				constant();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
				setState(2236);
				match(T__0);
				setState(2237);
				expr();
				setState(2238);
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
			setState(2242);
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
			setState(2262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,432,_ctx) ) {
			case 1:
				_localctx = new InitDeclWithCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2244);
				declarator();
				setState(2245);
				match(T__0);
				setState(2247);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(2246);
					expr();
					}
				}

				setState(2249);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new InitDeclWithAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2251);
				declarator();
				setState(2253);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(2252);
					match(NEWLINE);
					}
				}

				setState(2255);
				match(T__30);
				setState(2257);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(2256);
					match(NEWLINE);
					}
				}

				setState(2259);
				argument();
				}
				break;
			case 3:
				_localctx = new InitDeclSimpleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2261);
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
			setState(2265);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__14) {
				{
				setState(2264);
				ptrs();
				}
			}

			setState(2267);
			identifier();
			setState(2269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,434,_ctx) ) {
			case 1:
				{
				setState(2268);
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
			setState(2277);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2271);
				match(T__24);
				setState(2273);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(2272);
					conditional_expression();
					}
				}

				setState(2275);
				match(T__25);
				}
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(2276);
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

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\177\u08ea\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
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
		"\3\7\5\7\u0132\n\7\3\7\5\7\u0135\n\7\3\7\5\7\u0138\n\7\3\7\3\7\3\7\5\7"+
		"\u013d\n\7\3\7\3\7\5\7\u0141\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0149\n\7"+
		"\3\7\3\7\5\7\u014d\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u0154\n\7\3\7\3\7\5\7\u0158"+
		"\n\7\3\7\5\7\u015b\n\7\3\7\5\7\u015e\n\7\3\7\3\7\5\7\u0162\n\7\3\7\5\7"+
		"\u0165\n\7\3\7\5\7\u0168\n\7\3\7\3\7\5\7\u016c\n\7\3\7\3\7\3\7\3\7\5\7"+
		"\u0172\n\7\3\7\3\7\5\7\u0176\n\7\3\7\3\7\5\7\u017a\n\7\5\7\u017c\n\7\3"+
		"\b\3\b\3\b\3\b\5\b\u0182\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u018e\n\t\3\t\3\t\3\t\5\t\u0193\n\t\3\t\5\t\u0196\n\t\3\n\5\n\u0199"+
		"\n\n\3\n\3\n\3\n\3\n\5\n\u019f\n\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u01a7"+
		"\n\13\3\f\3\f\3\r\3\r\5\r\u01ad\n\r\3\16\3\16\3\16\3\16\5\16\u01b3\n\16"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u01c7\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u01d2\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01da\n"+
		"\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u01e4\n\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u01ed\n\27\3\27\5\27\u01f0\n\27\3\30\3"+
		"\30\3\31\3\31\5\31\u01f6\n\31\3\31\3\31\3\31\5\31\u01fb\n\31\7\31\u01fd"+
		"\n\31\f\31\16\31\u0200\13\31\3\32\3\32\5\32\u0204\n\32\3\33\5\33\u0207"+
		"\n\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u020f\n\33\3\33\5\33\u0212\n"+
		"\33\3\33\3\33\5\33\u0216\n\33\3\33\3\33\3\33\3\33\5\33\u021c\n\33\7\33"+
		"\u021e\n\33\f\33\16\33\u0221\13\33\3\33\5\33\u0224\n\33\3\33\5\33\u0227"+
		"\n\33\3\33\3\33\3\34\3\34\3\34\5\34\u022e\n\34\3\35\3\35\5\35\u0232\n"+
		"\35\3\35\3\35\3\35\3\35\5\35\u0238\n\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u023f\n\35\3\35\3\35\5\35\u0243\n\35\3\36\3\36\3\36\7\36\u0248\n\36\f"+
		"\36\16\36\u024b\13\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0253\n\37\f"+
		"\37\16\37\u0256\13\37\3\37\3\37\3\37\3\37\3\37\5\37\u025d\n\37\3\37\3"+
		"\37\7\37\u0261\n\37\f\37\16\37\u0264\13\37\3\37\3\37\3\37\5\37\u0269\n"+
		"\37\3 \3 \3 \3 \3 \5 \u0270\n \3!\3!\3!\3!\3!\5!\u0277\n!\3\"\3\"\3#\3"+
		"#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u028b\n$\3%\3%\5%\u028f"+
		"\n%\3%\3%\3%\3%\3%\5%\u0296\n%\3%\3%\7%\u029a\n%\f%\16%\u029d\13%\3%\3"+
		"%\5%\u02a1\n%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3*\3*\7*\u02b0\n*\f*"+
		"\16*\u02b3\13*\3*\7*\u02b6\n*\f*\16*\u02b9\13*\3*\7*\u02bc\n*\f*\16*\u02bf"+
		"\13*\6*\u02c1\n*\r*\16*\u02c2\3*\3*\5*\u02c7\n*\3+\3+\3,\3,\3-\3-\3.\3"+
		".\3.\5.\u02d2\n.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5"+
		".\u02fc\n.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\6\62\u0310\n\62\r\62\16\62\u0311\3\63\3\63\3"+
		"\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3"+
		"=\3=\3>\3>\3>\3>\5>\u032e\n>\3?\3?\3?\6?\u0333\n?\r?\16?\u0334\3@\3@\3"+
		"@\5@\u033a\n@\3A\3A\5A\u033e\nA\3A\5A\u0341\nA\3A\5A\u0344\nA\3A\3A\5"+
		"A\u0348\nA\3A\3A\3B\3B\3B\3B\3B\3C\3C\3D\5D\u0354\nD\3D\5D\u0357\nD\3"+
		"D\3D\5D\u035b\nD\5D\u035d\nD\3D\3D\5D\u0361\nD\3D\3D\5D\u0365\nD\3D\5"+
		"D\u0368\nD\3D\5D\u036b\nD\3D\5D\u036e\nD\3D\3D\3D\5D\u0373\nD\3D\3D\5"+
		"D\u0377\nD\3D\5D\u037a\nD\3D\5D\u037d\nD\3D\3D\5D\u0381\nD\3E\3E\3F\3"+
		"F\5F\u0387\nF\7F\u0389\nF\fF\16F\u038c\13F\3F\3F\3F\3F\5F\u0392\nF\7F"+
		"\u0394\nF\fF\16F\u0397\13F\3F\3F\5F\u039b\nF\5F\u039d\nF\3G\3G\5G\u03a1"+
		"\nG\3G\5G\u03a4\nG\3G\5G\u03a7\nG\3G\3G\5G\u03ab\nG\3G\3G\5G\u03af\nG"+
		"\7G\u03b1\nG\fG\16G\u03b4\13G\3G\5G\u03b7\nG\3G\3G\5G\u03bb\nG\3G\3G\3"+
		"G\5G\u03c0\nG\3G\7G\u03c3\nG\fG\16G\u03c6\13G\3G\5G\u03c9\nG\3G\3G\5G"+
		"\u03cd\nG\3G\3G\3G\3G\5G\u03d3\nG\3G\7G\u03d6\nG\fG\16G\u03d9\13G\3G\3"+
		"G\5G\u03dd\nG\3G\5G\u03e0\nG\3G\5G\u03e3\nG\6G\u03e5\nG\rG\16G\u03e6\5"+
		"G\u03e9\nG\3H\5H\u03ec\nH\3H\5H\u03ef\nH\3H\3H\3H\5H\u03f4\nH\3H\5H\u03f7"+
		"\nH\3H\5H\u03fa\nH\3H\7H\u03fd\nH\fH\16H\u0400\13H\3H\3H\5H\u0404\nH\3"+
		"H\5H\u0407\nH\3H\5H\u040a\nH\3H\5H\u040d\nH\3I\3I\3I\3I\5I\u0413\nI\3"+
		"J\5J\u0416\nJ\3J\3J\3J\3J\3J\5J\u041d\nJ\3J\5J\u0420\nJ\3K\3K\3K\3L\3"+
		"L\3L\3L\7L\u0429\nL\fL\16L\u042c\13L\3M\3M\3M\3N\5N\u0432\nN\3N\3N\3O"+
		"\3O\5O\u0438\nO\3O\3O\3P\3P\3P\3P\3P\3P\3P\5P\u0443\nP\3Q\3Q\3Q\3Q\3Q"+
		"\3R\7R\u044b\nR\fR\16R\u044e\13R\3R\3R\3R\3R\7R\u0454\nR\fR\16R\u0457"+
		"\13R\7R\u0459\nR\fR\16R\u045c\13R\3S\3S\3T\5T\u0461\nT\3T\3T\5T\u0465"+
		"\nT\3T\3T\5T\u0469\nT\5T\u046b\nT\3T\5T\u046e\nT\3T\3T\3T\3T\3T\5T\u0475"+
		"\nT\5T\u0477\nT\3T\3T\3T\5T\u047c\nT\3T\3T\5T\u0480\nT\3T\3T\3T\5T\u0485"+
		"\nT\3T\3T\5T\u0489\nT\3T\3T\5T\u048d\nT\3T\5T\u0490\nT\3T\3T\3T\3T\5T"+
		"\u0496\nT\5T\u0498\nT\3T\3T\5T\u049c\nT\5T\u049e\nT\3T\3T\5T\u04a2\nT"+
		"\5T\u04a4\nT\3T\3T\5T\u04a8\nT\3T\5T\u04ab\nT\3T\5T\u04ae\nT\5T\u04b0"+
		"\nT\3U\6U\u04b3\nU\rU\16U\u04b4\3V\3V\5V\u04b9\nV\3V\5V\u04bc\nV\3V\3"+
		"V\5V\u04c0\nV\5V\u04c2\nV\3V\5V\u04c5\nV\3V\3V\3V\3V\5V\u04cb\nV\3V\5"+
		"V\u04ce\nV\3V\3V\5V\u04d2\nV\3V\5V\u04d5\nV\3V\3V\5V\u04d9\nV\3V\3V\3"+
		"V\3V\3V\5V\u04e0\nV\3V\5V\u04e3\nV\3V\5V\u04e6\nV\3W\3W\5W\u04ea\nW\3"+
		"W\3W\5W\u04ee\nW\3W\7W\u04f1\nW\fW\16W\u04f4\13W\3W\5W\u04f7\nW\3W\5W"+
		"\u04fa\nW\3W\3W\3X\3X\5X\u0500\nX\3X\5X\u0503\nX\3X\5X\u0506\nX\3X\3X"+
		"\3X\3Y\3Y\3Z\3Z\3Z\3Z\7Z\u0511\nZ\fZ\16Z\u0514\13Z\3[\3[\5[\u0518\n[\5"+
		"[\u051a\n[\3[\5[\u051d\n[\3[\3[\3\\\3\\\5\\\u0523\n\\\3\\\3\\\5\\\u0527"+
		"\n\\\3\\\3\\\5\\\u052b\n\\\3\\\3\\\5\\\u052f\n\\\3\\\3\\\5\\\u0533\n\\"+
		"\3\\\3\\\5\\\u0537\n\\\3\\\3\\\5\\\u053b\n\\\3\\\3\\\5\\\u053f\n\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u054c\n\\\7\\\u054e\n\\\f"+
		"\\\16\\\u0551\13\\\3\\\6\\\u0554\n\\\r\\\16\\\u0555\3]\3]\5]\u055a\n]"+
		"\3]\3]\5]\u055e\n]\3]\3]\5]\u0562\n]\3]\3]\5]\u0566\n]\3]\3]\5]\u056a"+
		"\n]\3]\3]\5]\u056e\n]\3]\3]\5]\u0572\n]\6]\u0574\n]\r]\16]\u0575\3^\3"+
		"^\5^\u057a\n^\3_\3_\3_\3_\3_\3_\3_\5_\u0583\n_\3_\7_\u0586\n_\f_\16_\u0589"+
		"\13_\5_\u058b\n_\3_\5_\u058e\n_\3`\3`\5`\u0592\n`\3`\3`\3`\5`\u0597\n"+
		"`\3a\5a\u059a\na\3a\3a\3a\3a\3a\5a\u05a1\na\5a\u05a3\na\3a\5a\u05a6\n"+
		"a\3b\3b\3b\7b\u05ab\nb\fb\16b\u05ae\13b\3b\3b\3b\5b\u05b3\nb\3c\3c\3d"+
		"\3d\5d\u05b9\nd\6d\u05bb\nd\rd\16d\u05bc\3e\3e\3f\3f\3f\7f\u05c4\nf\f"+
		"f\16f\u05c7\13f\3f\5f\u05ca\nf\3f\5f\u05cd\nf\3f\5f\u05d0\nf\3f\3f\5f"+
		"\u05d4\nf\3f\5f\u05d7\nf\3f\5f\u05da\nf\3f\5f\u05dd\nf\3f\3f\7f\u05e1"+
		"\nf\ff\16f\u05e4\13f\3g\3g\5g\u05e8\ng\3g\5g\u05eb\ng\3g\5g\u05ee\ng\3"+
		"g\3g\5g\u05f2\ng\3g\5g\u05f5\ng\3g\5g\u05f8\ng\3g\3g\5g\u05fc\ng\3h\3"+
		"h\3h\5h\u0601\nh\3h\5h\u0604\nh\3h\5h\u0607\nh\3h\3h\5h\u060b\nh\3h\5"+
		"h\u060e\nh\3h\5h\u0611\nh\3h\3h\5h\u0615\nh\3h\5h\u0618\nh\3h\5h\u061b"+
		"\nh\3h\3h\5h\u061f\nh\3h\5h\u0622\nh\3h\5h\u0625\nh\3h\3h\5h\u0629\nh"+
		"\3i\3i\5i\u062d\ni\3i\5i\u0630\ni\3i\5i\u0633\ni\3i\3i\5i\u0637\ni\3i"+
		"\5i\u063a\ni\3i\5i\u063d\ni\3i\5i\u0640\ni\3j\3j\5j\u0644\nj\3j\5j\u0647"+
		"\nj\3j\5j\u064a\nj\3j\3j\5j\u064e\nj\3j\5j\u0651\nj\3j\5j\u0654\nj\3j"+
		"\5j\u0657\nj\3k\3k\5k\u065b\nk\3k\5k\u065e\nk\3k\5k\u0661\nk\3k\3k\5k"+
		"\u0665\nk\3k\5k\u0668\nk\3k\5k\u066b\nk\3k\5k\u066e\nk\3l\3l\5l\u0672"+
		"\nl\3l\5l\u0675\nl\3l\5l\u0678\nl\3l\3l\5l\u067c\nl\3l\5l\u067f\nl\3l"+
		"\5l\u0682\nl\3l\5l\u0685\nl\3m\3m\5m\u0689\nm\3m\5m\u068c\nm\3m\5m\u068f"+
		"\nm\3m\3m\5m\u0693\nm\3m\5m\u0696\nm\3m\5m\u0699\nm\3m\5m\u069c\nm\3n"+
		"\3n\5n\u06a0\nn\3n\5n\u06a3\nn\3n\5n\u06a6\nn\3n\3n\5n\u06aa\nn\3n\5n"+
		"\u06ad\nn\3n\5n\u06b0\nn\3n\3n\5n\u06b4\nn\3o\3o\5o\u06b8\no\3o\5o\u06bb"+
		"\no\3o\5o\u06be\no\3o\3o\5o\u06c2\no\3o\5o\u06c5\no\3o\5o\u06c8\no\3o"+
		"\3o\5o\u06cc\no\3p\3p\5p\u06d0\np\3p\5p\u06d3\np\3p\5p\u06d6\np\3p\3p"+
		"\5p\u06da\np\3p\5p\u06dd\np\3p\5p\u06e0\np\3p\5p\u06e3\np\3q\3q\5q\u06e7"+
		"\nq\3q\5q\u06ea\nq\3q\5q\u06ed\nq\3q\3q\5q\u06f1\nq\3q\5q\u06f4\nq\3q"+
		"\5q\u06f7\nq\3q\5q\u06fa\nq\3r\3r\5r\u06fe\nr\3r\5r\u0701\nr\3r\5r\u0704"+
		"\nr\3r\3r\5r\u0708\nr\3r\5r\u070b\nr\3r\5r\u070e\nr\3r\5r\u0711\nr\3s"+
		"\3s\3s\5s\u0716\ns\3s\3s\3s\3s\3s\3s\5s\u071e\ns\3t\3t\3t\3t\3t\3t\5t"+
		"\u0726\nt\3u\3u\3u\3u\5u\u072c\nu\3v\3v\3v\3v\3v\3v\3v\3v\5v\u0736\nv"+
		"\3w\3w\3w\3x\5x\u073c\nx\3x\3x\5x\u0740\nx\3x\5x\u0743\nx\3x\5x\u0746"+
		"\nx\3x\3x\5x\u074a\nx\3x\5x\u074d\nx\3x\5x\u0750\nx\3x\3x\5x\u0754\nx"+
		"\3x\3x\3x\5x\u0759\nx\3x\3x\5x\u075d\nx\3x\5x\u0760\nx\3x\5x\u0763\nx"+
		"\3x\3x\5x\u0767\nx\3x\5x\u076a\nx\3x\5x\u076d\nx\3x\3x\5x\u0771\nx\3x"+
		"\3x\5x\u0775\nx\3y\3y\5y\u0779\ny\3y\5y\u077c\ny\3y\5y\u077f\ny\3y\3y"+
		"\3z\3z\5z\u0785\nz\3z\5z\u0788\nz\3z\5z\u078b\nz\3z\3z\3z\3z\3z\3z\5z"+
		"\u0793\nz\3z\5z\u0796\nz\3z\5z\u0799\nz\3z\3z\5z\u079d\nz\3{\3{\3|\3|"+
		"\5|\u07a3\n|\3|\5|\u07a6\n|\3|\5|\u07a9\n|\3|\3|\3|\3|\3|\3|\5|\u07b1"+
		"\n|\3|\5|\u07b4\n|\3|\5|\u07b7\n|\3|\5|\u07ba\n|\3}\3}\5}\u07be\n}\3}"+
		"\5}\u07c1\n}\3}\5}\u07c4\n}\3}\7}\u07c7\n}\f}\16}\u07ca\13}\3~\3~\3\177"+
		"\3\177\3\u0080\3\u0080\7\u0080\u07d2\n\u0080\f\u0080\16\u0080\u07d5\13"+
		"\u0080\3\u0080\5\u0080\u07d8\n\u0080\3\u0080\3\u0080\5\u0080\u07dc\n\u0080"+
		"\3\u0080\3\u0080\5\u0080\u07e0\n\u0080\6\u0080\u07e2\n\u0080\r\u0080\16"+
		"\u0080\u07e3\3\u0080\3\u0080\3\u0080\5\u0080\u07e9\n\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\7\u0080\u07ef\n\u0080\f\u0080\16\u0080\u07f2\13\u0080"+
		"\3\u0080\3\u0080\5\u0080\u07f6\n\u0080\5\u0080\u07f8\n\u0080\7\u0080\u07fa"+
		"\n\u0080\f\u0080\16\u0080\u07fd\13\u0080\3\u0080\3\u0080\3\u0081\3\u0081"+
		"\5\u0081\u0803\n\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u0808\n\u0081\3"+
		"\u0081\3\u0081\5\u0081\u080c\n\u0081\3\u0081\5\u0081\u080f\n\u0081\3\u0081"+
		"\5\u0081\u0812\n\u0081\3\u0081\5\u0081\u0815\n\u0081\3\u0081\3\u0081\5"+
		"\u0081\u0819\n\u0081\3\u0081\3\u0081\5\u0081\u081d\n\u0081\3\u0081\5\u0081"+
		"\u0820\n\u0081\3\u0081\5\u0081\u0823\n\u0081\3\u0081\3\u0081\5\u0081\u0827"+
		"\n\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u082c\n\u0081\3\u0081\5\u0081"+
		"\u082f\n\u0081\3\u0081\5\u0081\u0832\n\u0081\3\u0081\3\u0081\3\u0081\3"+
		"\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u083b\n\u0081\3\u0081\5\u0081\u083e"+
		"\n\u0081\3\u0081\5\u0081\u0841\n\u0081\3\u0081\5\u0081\u0844\n\u0081\3"+
		"\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u084a\n\u0081\3\u0081\5\u0081\u084d"+
		"\n\u0081\3\u0081\5\u0081\u0850\n\u0081\3\u0081\5\u0081\u0853\n\u0081\3"+
		"\u0081\3\u0081\3\u0081\5\u0081\u0858\n\u0081\3\u0081\5\u0081\u085b\n\u0081"+
		"\3\u0081\5\u0081\u085e\n\u0081\3\u0081\7\u0081\u0861\n\u0081\f\u0081\16"+
		"\u0081\u0864\13\u0081\3\u0082\3\u0082\5\u0082\u0868\n\u0082\3\u0082\3"+
		"\u0082\5\u0082\u086c\n\u0082\7\u0082\u086e\n\u0082\f\u0082\16\u0082\u0871"+
		"\13\u0082\3\u0082\5\u0082\u0874\n\u0082\3\u0082\5\u0082\u0877\n\u0082"+
		"\3\u0082\3\u0082\5\u0082\u087b\n\u0082\7\u0082\u087d\n\u0082\f\u0082\16"+
		"\u0082\u0880\13\u0082\3\u0082\3\u0082\3\u0083\5\u0083\u0885\n\u0083\3"+
		"\u0083\5\u0083\u0888\n\u0083\3\u0083\5\u0083\u088b\n\u0083\3\u0083\5\u0083"+
		"\u088e\n\u0083\3\u0083\5\u0083\u0891\n\u0083\3\u0083\5\u0083\u0894\n\u0083"+
		"\3\u0083\5\u0083\u0897\n\u0083\3\u0083\5\u0083\u089a\n\u0083\3\u0083\5"+
		"\u0083\u089d\n\u0083\3\u0083\3\u0083\5\u0083\u08a1\n\u0083\7\u0083\u08a3"+
		"\n\u0083\f\u0083\16\u0083\u08a6\13\u0083\3\u0083\7\u0083\u08a9\n\u0083"+
		"\f\u0083\16\u0083\u08ac\13\u0083\3\u0083\5\u0083\u08af\n\u0083\3\u0083"+
		"\3\u0083\5\u0083\u08b3\n\u0083\5\u0083\u08b5\n\u0083\3\u0084\3\u0084\3"+
		"\u0085\5\u0085\u08ba\n\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3"+
		"\u0085\3\u0085\5\u0085\u08c3\n\u0085\3\u0086\3\u0086\3\u0087\3\u0087\3"+
		"\u0087\5\u0087\u08ca\n\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u08d0"+
		"\n\u0087\3\u0087\3\u0087\5\u0087\u08d4\n\u0087\3\u0087\3\u0087\3\u0087"+
		"\5\u0087\u08d9\n\u0087\3\u0088\5\u0088\u08dc\n\u0088\3\u0088\3\u0088\5"+
		"\u0088\u08e0\n\u0088\3\u0089\3\u0089\5\u0089\u08e4\n\u0089\3\u0089\3\u0089"+
		"\5\u0089\u08e8\n\u0089\3\u0089\2\3\u0100\u008a\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4"+
		"\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c"+
		"\u010e\u0110\2\33\b\2\b\16OOQRVX__aa\3\2\20\25\3\2\26\31\5\2\b\nOOVV\3"+
		"\2\20\21\3\2\13\r\4\2\32\32bb\4\2!),-\3\2./\3\2\3\4\5\2\3\4\33\34uv\3"+
		"\2\3\5\4\2\3\4\26\27\3\2uv\3\2\33\34\4\2\5\5\33\34\4\2\5\5\17\17\6\2\3"+
		"\5\17\17\33\34uv\3\2wy\3\2*+\3\2\22\23\4\2\21\21\35\36\3\2\62\63\4\2L"+
		"LSS\5\2\6\6\67\67>>\u0a96\2\u0115\3\2\2\2\4\u0124\3\2\2\2\6\u0126\3\2"+
		"\2\2\b\u0128\3\2\2\2\n\u012a\3\2\2\2\f\u017b\3\2\2\2\16\u0181\3\2\2\2"+
		"\20\u0195\3\2\2\2\22\u0198\3\2\2\2\24\u01a6\3\2\2\2\26\u01a8\3\2\2\2\30"+
		"\u01ac\3\2\2\2\32\u01b2\3\2\2\2\34\u01b4\3\2\2\2\36\u01b8\3\2\2\2 \u01bc"+
		"\3\2\2\2\"\u01be\3\2\2\2$\u01c6\3\2\2\2&\u01d1\3\2\2\2(\u01d9\3\2\2\2"+
		"*\u01db\3\2\2\2,\u01ef\3\2\2\2.\u01f1\3\2\2\2\60\u01f5\3\2\2\2\62\u0203"+
		"\3\2\2\2\64\u0206\3\2\2\2\66\u022d\3\2\2\28\u0242\3\2\2\2:\u0244\3\2\2"+
		"\2<\u0268\3\2\2\2>\u026f\3\2\2\2@\u0276\3\2\2\2B\u0278\3\2\2\2D\u027a"+
		"\3\2\2\2F\u028a\3\2\2\2H\u02a0\3\2\2\2J\u02a2\3\2\2\2L\u02a4\3\2\2\2N"+
		"\u02a6\3\2\2\2P\u02a8\3\2\2\2R\u02c6\3\2\2\2T\u02c8\3\2\2\2V\u02ca\3\2"+
		"\2\2X\u02cc\3\2\2\2Z\u02fb\3\2\2\2\\\u02fd\3\2\2\2^\u02ff\3\2\2\2`\u0301"+
		"\3\2\2\2b\u030f\3\2\2\2d\u0313\3\2\2\2f\u0315\3\2\2\2h\u0317\3\2\2\2j"+
		"\u0319\3\2\2\2l\u031b\3\2\2\2n\u031d\3\2\2\2p\u031f\3\2\2\2r\u0321\3\2"+
		"\2\2t\u0323\3\2\2\2v\u0325\3\2\2\2x\u0327\3\2\2\2z\u032d\3\2\2\2|\u0332"+
		"\3\2\2\2~\u0336\3\2\2\2\u0080\u033b\3\2\2\2\u0082\u034b\3\2\2\2\u0084"+
		"\u0350\3\2\2\2\u0086\u0380\3\2\2\2\u0088\u0382\3\2\2\2\u008a\u039c\3\2"+
		"\2\2\u008c\u03e8\3\2\2\2\u008e\u03eb\3\2\2\2\u0090\u0412\3\2\2\2\u0092"+
		"\u0415\3\2\2\2\u0094\u0421\3\2\2\2\u0096\u0424\3\2\2\2\u0098\u042d\3\2"+
		"\2\2\u009a\u0431\3\2\2\2\u009c\u0435\3\2\2\2\u009e\u0442\3\2\2\2\u00a0"+
		"\u0444\3\2\2\2\u00a2\u044c\3\2\2\2\u00a4\u045d\3\2\2\2\u00a6\u04af\3\2"+
		"\2\2\u00a8\u04b2\3\2\2\2\u00aa\u04e5\3\2\2\2\u00ac\u04e7\3\2\2\2\u00ae"+
		"\u04fd\3\2\2\2\u00b0\u050a\3\2\2\2\u00b2\u050c\3\2\2\2\u00b4\u0519\3\2"+
		"\2\2\u00b6\u0553\3\2\2\2\u00b8\u0573\3\2\2\2\u00ba\u0577\3\2\2\2\u00bc"+
		"\u058d\3\2\2\2\u00be\u0596\3\2\2\2\u00c0\u0599\3\2\2\2\u00c2\u05b2\3\2"+
		"\2\2\u00c4\u05b4\3\2\2\2\u00c6\u05ba\3\2\2\2\u00c8\u05be\3\2\2\2\u00ca"+
		"\u05c0\3\2\2\2\u00cc\u05e5\3\2\2\2\u00ce\u0628\3\2\2\2\u00d0\u062a\3\2"+
		"\2\2\u00d2\u0641\3\2\2\2\u00d4\u0658\3\2\2\2\u00d6\u066f\3\2\2\2\u00d8"+
		"\u0686\3\2\2\2\u00da\u069d\3\2\2\2\u00dc\u06b5\3\2\2\2\u00de\u06cd\3\2"+
		"\2\2\u00e0\u06e4\3\2\2\2\u00e2\u06fb\3\2\2\2\u00e4\u071d\3\2\2\2\u00e6"+
		"\u0725\3\2\2\2\u00e8\u072b\3\2\2\2\u00ea\u0735\3\2\2\2\u00ec\u0737\3\2"+
		"\2\2\u00ee\u0774\3\2\2\2\u00f0\u0776\3\2\2\2\u00f2\u079c\3\2\2\2\u00f4"+
		"\u079e\3\2\2\2\u00f6\u07b9\3\2\2\2\u00f8\u07bb\3\2\2\2\u00fa\u07cb\3\2"+
		"\2\2\u00fc\u07cd\3\2\2\2\u00fe\u07cf\3\2\2\2\u0100\u0818\3\2\2\2\u0102"+
		"\u0865\3\2\2\2\u0104\u08b4\3\2\2\2\u0106\u08b6\3\2\2\2\u0108\u08c2\3\2"+
		"\2\2\u010a\u08c4\3\2\2\2\u010c\u08d8\3\2\2\2\u010e\u08db\3\2\2\2\u0110"+
		"\u08e7\3\2\2\2\u0112\u0114\5\4\3\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2"+
		"\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\3\3\2\2\2\u0117\u0115"+
		"\3\2\2\2\u0118\u0125\5\6\4\2\u0119\u0125\5\b\5\2\u011a\u0125\5\n\6\2\u011b"+
		"\u0125\5\20\t\2\u011c\u0125\5\22\n\2\u011d\u0125\5\u00a4S\2\u011e\u0125"+
		"\5\24\13\2\u011f\u0125\5\30\r\2\u0120\u0125\5J&\2\u0121\u0125\5L\'\2\u0122"+
		"\u0125\5z>\2\u0123\u0125\5x=\2\u0124\u0118\3\2\2\2\u0124\u0119\3\2\2\2"+
		"\u0124\u011a\3\2\2\2\u0124\u011b\3\2\2\2\u0124\u011c\3\2\2\2\u0124\u011d"+
		"\3\2\2\2\u0124\u011e\3\2\2\2\u0124\u011f\3\2\2\2\u0124\u0120\3\2\2\2\u0124"+
		"\u0121\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0123\3\2\2\2\u0125\5\3\2\2\2"+
		"\u0126\u0127\7u\2\2\u0127\7\3\2\2\2\u0128\u0129\7v\2\2\u0129\t\3\2\2\2"+
		"\u012a\u012b\5\f\7\2\u012b\13\3\2\2\2\u012c\u017c\7W\2\2\u012d\u0137\7"+
		"X\2\2\u012e\u0131\7\3\2\2\u012f\u0132\5\u00be`\2\u0130\u0132\7B\2\2\u0131"+
		"\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0135\7@"+
		"\2\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0138\7\4\2\2\u0137\u012e\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u017c\3\2"+
		"\2\2\u0139\u013a\7C\2\2\u013a\u013c\7\3\2\2\u013b\u013d\7@\2\2\u013c\u013b"+
		"\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\5\26\f\2"+
		"\u013f\u0141\7@\2\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142"+
		"\3\2\2\2\u0142\u0143\7\4\2\2\u0143\u017c\3\2\2\2\u0144\u017c\7D\2\2\u0145"+
		"\u0146\7J\2\2\u0146\u0148\7\3\2\2\u0147\u0149\7@\2\2\u0148\u0147\3\2\2"+
		"\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\5\26\f\2\u014b"+
		"\u014d\7@\2\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2"+
		"\2\2\u014e\u014f\7\4\2\2\u014f\u017c\3\2\2\2\u0150\u0151\7E\2\2\u0151"+
		"\u0153\7\3\2\2\u0152\u0154\7@\2\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2"+
		"\2\2\u0154\u0157\3\2\2\2\u0155\u0158\5\16\b\2\u0156\u0158\7\5\2\2\u0157"+
		"\u0155\3\2\2\2\u0157\u0156\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u015b\7@"+
		"\2\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015d\3\2\2\2\u015c"+
		"\u015e\5\26\f\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3"+
		"\2\2\2\u015f\u0161\7\5\2\2\u0160\u0162\7@\2\2\u0161\u0160\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u0165\5\u00caf\2\u0164\u0163"+
		"\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\3\2\2\2\u0166\u0168\7@\2\2\u0167"+
		"\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\7\4"+
		"\2\2\u016a\u016c\7\5\2\2\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u017c\3\2\2\2\u016d\u017c\7K\2\2\u016e\u016f\7F\2\2\u016f\u0171\7\3\2"+
		"\2\u0170\u0172\7@\2\2\u0171\u0170\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173"+
		"\3\2\2\2\u0173\u0175\5\26\f\2\u0174\u0176\7@\2\2\u0175\u0174\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\7\4\2\2\u0178\u017a\7\5"+
		"\2\2\u0179\u0178\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017c\3\2\2\2\u017b"+
		"\u012c\3\2\2\2\u017b\u012d\3\2\2\2\u017b\u0139\3\2\2\2\u017b\u0144\3\2"+
		"\2\2\u017b\u0145\3\2\2\2\u017b\u0150\3\2\2\2\u017b\u016d\3\2\2\2\u017b"+
		"\u016e\3\2\2\2\u017c\r\3\2\2\2\u017d\u0182\5\u00a4S\2\u017e\u017f\5\u00ca"+
		"f\2\u017f\u0180\7\5\2\2\u0180\u0182\3\2\2\2\u0181\u017d\3\2\2\2\u0181"+
		"\u017e\3\2\2\2\u0182\17\3\2\2\2\u0183\u0184\7G\2\2\u0184\u0196\7\5\2\2"+
		"\u0185\u0186\7I\2\2\u0186\u0196\7\5\2\2\u0187\u0188\7L\2\2\u0188\u0189"+
		"\5\u00c2b\2\u0189\u018a\7\5\2\2\u018a\u0196\3\2\2\2\u018b\u018d\7M\2\2"+
		"\u018c\u018e\5\u00caf\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"\u018f\3\2\2\2\u018f\u0196\7\5\2\2\u0190\u0192\7Y\2\2\u0191\u0193\5\u00ca"+
		"f\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"\u0196\7\5\2\2\u0195\u0183\3\2\2\2\u0195\u0185\3\2\2\2\u0195\u0187\3\2"+
		"\2\2\u0195\u018b\3\2\2\2\u0195\u0190\3\2\2\2\u0196\21\3\2\2\2\u0197\u0199"+
		"\7H\2\2\u0198\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019e\3\2\2\2\u019a"+
		"\u019f\5\u00c2b\2\u019b\u019f\5\u00c4c\2\u019c\u019f\7|\2\2\u019d\u019f"+
		"\5\u00e6t\2\u019e\u019a\3\2\2\2\u019e\u019b\3\2\2\2\u019e\u019c\3\2\2"+
		"\2\u019e\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\7\6\2\2\u01a1\23"+
		"\3\2\2\2\u01a2\u01a3\5\u00caf\2\u01a3\u01a4\7\5\2\2\u01a4\u01a7\3\2\2"+
		"\2\u01a5\u01a7\5\u010a\u0086\2\u01a6\u01a2\3\2\2\2\u01a6\u01a5\3\2\2\2"+
		"\u01a7\25\3\2\2\2\u01a8\u01a9\5\u00caf\2\u01a9\27\3\2\2\2\u01aa\u01ad"+
		"\5\32\16\2\u01ab\u01ad\5&\24\2\u01ac\u01aa\3\2\2\2\u01ac\u01ab\3\2\2\2"+
		"\u01ad\31\3\2\2\2\u01ae\u01b3\5\34\17\2\u01af\u01b3\5\36\20\2\u01b0\u01b3"+
		"\5 \21\2\u01b1\u01b3\5\"\22\2\u01b2\u01ae\3\2\2\2\u01b2\u01af\3\2\2\2"+
		"\u01b2\u01b0\3\2\2\2\u01b2\u01b1\3\2\2\2\u01b3\33\3\2\2\2\u01b4\u01b5"+
		"\7c\2\2\u01b5\u01b6\5$\23\2\u01b6\u01b7\b\17\1\2\u01b7\35\3\2\2\2\u01b8"+
		"\u01b9\7d\2\2\u01b9\u01ba\5$\23\2\u01ba\u01bb\b\20\1\2\u01bb\37\3\2\2"+
		"\2\u01bc\u01bd\7e\2\2\u01bd!\3\2\2\2\u01be\u01bf\7f\2\2\u01bf#\3\2\2\2"+
		"\u01c0\u01c7\5\26\f\2\u01c1\u01c2\7\3\2\2\u01c2\u01c3\5\26\f\2\u01c3\u01c4"+
		"\7\4\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c7\5.\30\2\u01c6\u01c0\3\2\2\2\u01c6"+
		"\u01c1\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7%\3\2\2\2\u01c8\u01d2\5(\25\2"+
		"\u01c9\u01d2\5*\26\2\u01ca\u01d2\5\66\34\2\u01cb\u01d2\58\35\2\u01cc\u01d2"+
		"\5> \2\u01cd\u01d2\5@!\2\u01ce\u01d2\5F$\2\u01cf\u01d2\5H%\2\u01d0\u01d2"+
		"\5\64\33\2\u01d1\u01c8\3\2\2\2\u01d1\u01c9\3\2\2\2\u01d1\u01ca\3\2\2\2"+
		"\u01d1\u01cb\3\2\2\2\u01d1\u01cc\3\2\2\2\u01d1\u01cd\3\2\2\2\u01d1\u01ce"+
		"\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d0\3\2\2\2\u01d2\'\3\2\2\2\u01d3"+
		"\u01d4\7g\2\2\u01d4\u01d5\5,\27\2\u01d5\u01d6\5\62\32\2\u01d6\u01da\3"+
		"\2\2\2\u01d7\u01d8\7g\2\2\u01d8\u01da\5,\27\2\u01d9\u01d3\3\2\2\2\u01d9"+
		"\u01d7\3\2\2\2\u01da)\3\2\2\2\u01db\u01dc\7h\2\2\u01dc\u01dd\5,\27\2\u01dd"+
		"+\3\2\2\2\u01de\u01e3\5\u00c2b\2\u01df\u01e0\7\3\2\2\u01e0\u01e1\5\60"+
		"\31\2\u01e1\u01e2\7\4\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01df\3\2\2\2\u01e3"+
		"\u01e4\3\2\2\2\u01e4\u01f0\3\2\2\2\u01e5\u01f0\5.\30\2\u01e6\u01f0\7s"+
		"\2\2\u01e7\u01ec\7\7\2\2\u01e8\u01e9\7\3\2\2\u01e9\u01ea\5\60\31\2\u01ea"+
		"\u01eb\7\4\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01e8\3\2\2\2\u01ec\u01ed\3\2"+
		"\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01f0\58\35\2\u01ef\u01de\3\2\2\2\u01ef"+
		"\u01e5\3\2\2\2\u01ef\u01e6\3\2\2\2\u01ef\u01e7\3\2\2\2\u01ef\u01ee\3\2"+
		"\2\2\u01f0-\3\2\2\2\u01f1\u01f2\t\2\2\2\u01f2/\3\2\2\2\u01f3\u01f6\5\u00c2"+
		"b\2\u01f4\u01f6\7B\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6"+
		"\3\2\2\2\u01f6\u01fe\3\2\2\2\u01f7\u01fa\7\17\2\2\u01f8\u01fb\5\u00c2"+
		"b\2\u01f9\u01fb\7B\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01f9\3\2\2\2\u01fb\u01fd"+
		"\3\2\2\2\u01fc\u01f7\3\2\2\2\u01fd\u0200\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe"+
		"\u01ff\3\2\2\2\u01ff\61\3\2\2\2\u0200\u01fe\3\2\2\2\u0201\u0204\5\u00ca"+
		"f\2\u0202\u0204\b\32\1\2\u0203\u0201\3\2\2\2\u0203\u0202\3\2\2\2\u0204"+
		"\63\3\2\2\2\u0205\u0207\5,\27\2\u0206\u0205\3\2\2\2\u0206\u0207\3\2\2"+
		"\2\u0207\u0208\3\2\2\2\u0208\u0209\5,\27\2\u0209\u0226\7\3\2\2\u020a\u020f"+
		"\5\u00caf\2\u020b\u020f\5\u00b6\\\2\u020c\u020f\5P)\2\u020d\u020f\5^\60"+
		"\2\u020e\u020a\3\2\2\2\u020e\u020b\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020d"+
		"\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0211\3\2\2\2\u0210\u0212\7@\2\2\u0211"+
		"\u0210\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u021f\3\2\2\2\u0213\u0215\7\17"+
		"\2\2\u0214\u0216\7@\2\2\u0215\u0214\3\2\2\2\u0215\u0216\3\2\2\2\u0216"+
		"\u021b\3\2\2\2\u0217\u021c\5\u00caf\2\u0218\u021c\5\u00b6\\\2\u0219\u021c"+
		"\5P)\2\u021a\u021c\5^\60\2\u021b\u0217\3\2\2\2\u021b\u0218\3\2\2\2\u021b"+
		"\u0219\3\2\2\2\u021b\u021a\3\2\2\2\u021c\u021e\3\2\2\2\u021d\u0213\3\2"+
		"\2\2\u021e\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220"+
		"\u0223\3\2\2\2\u0221\u021f\3\2\2\2\u0222\u0224\7\17\2\2\u0223\u0222\3"+
		"\2\2\2\u0223\u0224\3\2\2\2\u0224\u0227\3\2\2\2\u0225\u0227\7P\2\2\u0226"+
		"\u020e\3\2\2\2\u0226\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\7\4"+
		"\2\2\u0229\65\3\2\2\2\u022a\u022b\7i\2\2\u022b\u022e\7}\2\2\u022c\u022e"+
		"\7i\2\2\u022d\u022a\3\2\2\2\u022d\u022c\3\2\2\2\u022e\67\3\2\2\2\u022f"+
		"\u0231\7j\2\2\u0230\u0232\7}\2\2\u0231\u0230\3\2\2\2\u0231\u0232\3\2\2"+
		"\2\u0232\u0243\3\2\2\2\u0233\u0234\7r\2\2\u0234\u0235\7\3\2\2\u0235\u0237"+
		"\7\3\2\2\u0236\u0238\5:\36\2\u0237\u0236\3\2\2\2\u0237\u0238\3\2\2\2\u0238"+
		"\u0239\3\2\2\2\u0239\u023a\7\4\2\2\u023a\u0243\7\4\2\2\u023b\u023c\7r"+
		"\2\2\u023c\u023e\7\3\2\2\u023d\u023f\5:\36\2\u023e\u023d\3\2\2\2\u023e"+
		"\u023f\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0243\7\4\2\2\u0241\u0243\7r"+
		"\2\2\u0242\u022f\3\2\2\2\u0242\u0233\3\2\2\2\u0242\u023b\3\2\2\2\u0242"+
		"\u0241\3\2\2\2\u02439\3\2\2\2\u0244\u0249\5<\37\2\u0245\u0246\7\17\2\2"+
		"\u0246\u0248\5<\37\2\u0247\u0245\3\2\2\2\u0248\u024b\3\2\2\2\u0249\u0247"+
		"\3\2\2\2\u0249\u024a\3\2\2\2\u024a;\3\2\2\2\u024b\u0249\3\2\2\2\u024c"+
		"\u0269\5,\27\2\u024d\u024e\5,\27\2\u024e\u024f\7\3\2\2\u024f\u0254\5\u00c2"+
		"b\2\u0250\u0251\7\17\2\2\u0251\u0253\5\u00caf\2\u0252\u0250\3\2\2\2\u0253"+
		"\u0256\3\2\2\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0257\3\2"+
		"\2\2\u0256\u0254\3\2\2\2\u0257\u0258\7\4\2\2\u0258\u0269\3\2\2\2\u0259"+
		"\u025a\5,\27\2\u025a\u025c\7\3\2\2\u025b\u025d\5\u00caf\2\u025c\u025b"+
		"\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u0262\3\2\2\2\u025e\u025f\7\17\2\2"+
		"\u025f\u0261\5\u00caf\2\u0260\u025e\3\2\2\2\u0261\u0264\3\2\2\2\u0262"+
		"\u0260\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0265\3\2\2\2\u0264\u0262\3\2"+
		"\2\2\u0265\u0266\7\4\2\2\u0266\u0269\3\2\2\2\u0267\u0269\5R*\2\u0268\u024c"+
		"\3\2\2\2\u0268\u024d\3\2\2\2\u0268\u0259\3\2\2\2\u0268\u0267\3\2\2\2\u0269"+
		"=\3\2\2\2\u026a\u026b\7k\2\2\u026b\u0270\5B\"\2\u026c\u026d\7k\2\2\u026d"+
		"\u0270\5,\27\2\u026e\u0270\7k\2\2\u026f\u026a\3\2\2\2\u026f\u026c\3\2"+
		"\2\2\u026f\u026e\3\2\2\2\u0270?\3\2\2\2\u0271\u0272\7l\2\2\u0272\u0277"+
		"\5B\"\2\u0273\u0274\7l\2\2\u0274\u0277\5,\27\2\u0275\u0277\7l\2\2\u0276"+
		"\u0271\3\2\2\2\u0276\u0273\3\2\2\2\u0276\u0275\3\2\2\2\u0277A\3\2\2\2"+
		"\u0278\u0279\5D#\2\u0279C\3\2\2\2\u027a\u027b\7}\2\2\u027bE\3\2\2\2\u027c"+
		"\u027d\7m\2\2\u027d\u027e\7x\2\2\u027e\u028b\7}\2\2\u027f\u0280\7m\2\2"+
		"\u0280\u0281\7x\2\2\u0281\u028b\5,\27\2\u0282\u0283\7m\2\2\u0283\u0284"+
		"\5,\27\2\u0284\u0285\7}\2\2\u0285\u028b\3\2\2\2\u0286\u0287\7m\2\2\u0287"+
		"\u028b\5,\27\2\u0288\u0289\7m\2\2\u0289\u028b\7x\2\2\u028a\u027c\3\2\2"+
		"\2\u028a\u027f\3\2\2\2\u028a\u0282\3\2\2\2\u028a\u0286\3\2\2\2\u028a\u0288"+
		"\3\2\2\2\u028bG\3\2\2\2\u028c\u028e\7n\2\2\u028d\u028f\7o\2\2\u028e\u028d"+
		"\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0291\7p\2\2\u0291"+
		"\u0292\7}\2\2\u0292\u02a1\b%\1\2\u0293\u0295\7n\2\2\u0294\u0296\7o\2\2"+
		"\u0295\u0294\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u029b"+
		"\7p\2\2\u0298\u029a\5\u00c2b\2\u0299\u0298\3\2\2\2\u029a\u029d\3\2\2\2"+
		"\u029b\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u02a1\3\2\2\2\u029d\u029b"+
		"\3\2\2\2\u029e\u029f\7n\2\2\u029f\u02a1\b%\1\2\u02a0\u028c\3\2\2\2\u02a0"+
		"\u0293\3\2\2\2\u02a0\u029e\3\2\2\2\u02a1I\3\2\2\2\u02a2\u02a3\7{\2\2\u02a3"+
		"K\3\2\2\2\u02a4\u02a5\7@\2\2\u02a5M\3\2\2\2\u02a6\u02a7\t\3\2\2\u02a7"+
		"O\3\2\2\2\u02a8\u02a9\t\4\2\2\u02a9Q\3\2\2\2\u02aa\u02c7\7w\2\2\u02ab"+
		"\u02c7\7y\2\2\u02ac\u02c7\7x\2\2\u02ad\u02b1\7}\2\2\u02ae\u02b0\7@\2\2"+
		"\u02af\u02ae\3\2\2\2\u02b0\u02b3\3\2\2\2\u02b1\u02af\3\2\2\2\u02b1\u02b2"+
		"\3\2\2\2\u02b2\u02b7\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b4\u02b6\7{\2\2\u02b5"+
		"\u02b4\3\2\2\2\u02b6\u02b9\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2"+
		"\2\2\u02b8\u02bd\3\2\2\2\u02b9\u02b7\3\2\2\2\u02ba\u02bc\7@\2\2\u02bb"+
		"\u02ba\3\2\2\2\u02bc\u02bf\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02be\3\2"+
		"\2\2\u02be\u02c1\3\2\2\2\u02bf\u02bd\3\2\2\2\u02c0\u02ad\3\2\2\2\u02c1"+
		"\u02c2\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c7\3\2"+
		"\2\2\u02c4\u02c7\7|\2\2\u02c5\u02c7\7z\2\2\u02c6\u02aa\3\2\2\2\u02c6\u02ab"+
		"\3\2\2\2\u02c6\u02ac\3\2\2\2\u02c6\u02c0\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c6"+
		"\u02c5\3\2\2\2\u02c7S\3\2\2\2\u02c8\u02c9\t\5\2\2\u02c9U\3\2\2\2\u02ca"+
		"\u02cb\t\6\2\2\u02cbW\3\2\2\2\u02cc\u02cd\t\7\2\2\u02cdY\3\2\2\2\u02ce"+
		"\u02d1\t\b\2\2\u02cf\u02d0\7\33\2\2\u02d0\u02d2\7\34\2\2\u02d1\u02cf\3"+
		"\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02fc\3\2\2\2\u02d3\u02fc\7\22\2\2\u02d4"+
		"\u02fc\7\23\2\2\u02d5\u02fc\7\21\2\2\u02d6\u02fc\7\35\2\2\u02d7\u02fc"+
		"\7\36\2\2\u02d8\u02fc\7\37\2\2\u02d9\u02fc\7\20\2\2\u02da\u02fc\7 \2\2"+
		"\u02db\u02fc\7\24\2\2\u02dc\u02fc\7\25\2\2\u02dd\u02fc\7!\2\2\u02de\u02fc"+
		"\7\26\2\2\u02df\u02fc\7\27\2\2\u02e0\u02fc\7\"\2\2\u02e1\u02fc\7#\2\2"+
		"\u02e2\u02fc\7$\2\2\u02e3\u02fc\7%\2\2\u02e4\u02fc\7&\2\2\u02e5\u02fc"+
		"\7\'\2\2\u02e6\u02fc\7(\2\2\u02e7\u02fc\7)\2\2\u02e8\u02fc\7*\2\2\u02e9"+
		"\u02fc\7+\2\2\u02ea\u02fc\7,\2\2\u02eb\u02fc\7-\2\2\u02ec\u02fc\7.\2\2"+
		"\u02ed\u02fc\7/\2\2\u02ee\u02fc\7\30\2\2\u02ef\u02fc\7\31\2\2\u02f0\u02fc"+
		"\7\60\2\2\u02f1\u02fc\7\61\2\2\u02f2\u02fc\7\62\2\2\u02f3\u02fc\7\63\2"+
		"\2\u02f4\u02fc\7\17\2\2\u02f5\u02fc\7\64\2\2\u02f6\u02fc\7\65\2\2\u02f7"+
		"\u02f8\7\3\2\2\u02f8\u02fc\7\4\2\2\u02f9\u02fa\7\33\2\2\u02fa\u02fc\7"+
		"\34\2\2\u02fb\u02ce\3\2\2\2\u02fb\u02d3\3\2\2\2\u02fb\u02d4\3\2\2\2\u02fb"+
		"\u02d5\3\2\2\2\u02fb\u02d6\3\2\2\2\u02fb\u02d7\3\2\2\2\u02fb\u02d8\3\2"+
		"\2\2\u02fb\u02d9\3\2\2\2\u02fb\u02da\3\2\2\2\u02fb\u02db\3\2\2\2\u02fb"+
		"\u02dc\3\2\2\2\u02fb\u02dd\3\2\2\2\u02fb\u02de\3\2\2\2\u02fb\u02df\3\2"+
		"\2\2\u02fb\u02e0\3\2\2\2\u02fb\u02e1\3\2\2\2\u02fb\u02e2\3\2\2\2\u02fb"+
		"\u02e3\3\2\2\2\u02fb\u02e4\3\2\2\2\u02fb\u02e5\3\2\2\2\u02fb\u02e6\3\2"+
		"\2\2\u02fb\u02e7\3\2\2\2\u02fb\u02e8\3\2\2\2\u02fb\u02e9\3\2\2\2\u02fb"+
		"\u02ea\3\2\2\2\u02fb\u02eb\3\2\2\2\u02fb\u02ec\3\2\2\2\u02fb\u02ed\3\2"+
		"\2\2\u02fb\u02ee\3\2\2\2\u02fb\u02ef\3\2\2\2\u02fb\u02f0\3\2\2\2\u02fb"+
		"\u02f1\3\2\2\2\u02fb\u02f2\3\2\2\2\u02fb\u02f3\3\2\2\2\u02fb\u02f4\3\2"+
		"\2\2\u02fb\u02f5\3\2\2\2\u02fb\u02f6\3\2\2\2\u02fb\u02f7\3\2\2\2\u02fb"+
		"\u02f9\3\2\2\2\u02fc[\3\2\2\2\u02fd\u02fe\t\t\2\2\u02fe]\3\2\2\2\u02ff"+
		"\u0300\t\n\2\2\u0300_\3\2\2\2\u0301\u0302\7`\2\2\u0302\u0303\7\26\2\2"+
		"\u0303\u0304\5b\62\2\u0304\u0305\7\27\2\2\u0305a\3\2\2\2\u0306\u0307\7"+
		"\26\2\2\u0307\u0308\5b\62\2\u0308\u0309\7\27\2\2\u0309\u0310\3\2\2\2\u030a"+
		"\u030b\7\3\2\2\u030b\u030c\5b\62\2\u030c\u030d\7\4\2\2\u030d\u0310\3\2"+
		"\2\2\u030e\u0310\5j\66\2\u030f\u0306\3\2\2\2\u030f\u030a\3\2\2\2\u030f"+
		"\u030e\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u030f\3\2\2\2\u0311\u0312\3\2"+
		"\2\2\u0312c\3\2\2\2\u0313\u0314\n\13\2\2\u0314e\3\2\2\2\u0315\u0316\n"+
		"\f\2\2\u0316g\3\2\2\2\u0317\u0318\n\r\2\2\u0318i\3\2\2\2\u0319\u031a\n"+
		"\16\2\2\u031ak\3\2\2\2\u031b\u031c\n\17\2\2\u031cm\3\2\2\2\u031d\u031e"+
		"\n\20\2\2\u031eo\3\2\2\2\u031f\u0320\n\21\2\2\u0320q\3\2\2\2\u0321\u0322"+
		"\n\22\2\2\u0322s\3\2\2\2\u0323\u0324\n\23\2\2\u0324u\3\2\2\2\u0325\u0326"+
		"\n\f\2\2\u0326w\3\2\2\2\u0327\u0328\13\2\2\2\u0328y\3\2\2\2\u0329\u032e"+
		"\5|?\2\u032a\u032e\5~@\2\u032b\u032e\5\u0080A\2\u032c\u032e\5\u0084C\2"+
		"\u032d\u0329\3\2\2\2\u032d\u032a\3\2\2\2\u032d\u032b\3\2\2\2\u032d\u032c"+
		"\3\2\2\2\u032e{\3\2\2\2\u032f\u0330\5,\27\2\u0330\u0331\7\17\2\2\u0331"+
		"\u0333\3\2\2\2\u0332\u032f\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0332\3\2"+
		"\2\2\u0334\u0335\3\2\2\2\u0335}\3\2\2\2\u0336\u0337\7T\2\2\u0337\u0339"+
		"\7\66\2\2\u0338\u033a\7u\2\2\u0339\u0338\3\2\2\2\u0339\u033a\3\2\2\2\u033a"+
		"\177\3\2\2\2\u033b\u033d\5\64\33\2\u033c\u033e\7@\2\2\u033d\u033c\3\2"+
		"\2\2\u033d\u033e\3\2\2\2\u033e\u0340\3\2\2\2\u033f\u0341\5,\27\2\u0340"+
		"\u033f\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u0343\3\2\2\2\u0342\u0344\7@"+
		"\2\2\u0343\u0342\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0345\3\2\2\2\u0345"+
		"\u0347\5\64\33\2\u0346\u0348\7@\2\2\u0347\u0346\3\2\2\2\u0347\u0348\3"+
		"\2\2\2\u0348\u0349\3\2\2\2\u0349\u034a\5\u00acW\2\u034a\u0081\3\2\2\2"+
		"\u034b\u034c\7\7\2\2\u034c\u034d\7\3\2\2\u034d\u034e\5\u009eP\2\u034e"+
		"\u034f\7\4\2\2\u034f\u0083\3\2\2\2\u0350\u0351\7s\2\2\u0351\u0085\3\2"+
		"\2\2\u0352\u0354\5`\61\2\u0353\u0352\3\2\2\2\u0353\u0354\3\2\2\2\u0354"+
		"\u0356\3\2\2\2\u0355\u0357\5\u008aF\2\u0356\u0355\3\2\2\2\u0356\u0357"+
		"\3\2\2\2\u0357\u035c\3\2\2\2\u0358\u035a\58\35\2\u0359\u035b\7@\2\2\u035a"+
		"\u0359\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035d\3\2\2\2\u035c\u0358\3\2"+
		"\2\2\u035c\u035d\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u0360\5\u009eP\2\u035f"+
		"\u0361\7@\2\2\u0360\u035f\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0362\3\2"+
		"\2\2\u0362\u0364\5\u008cG\2\u0363\u0365\5\u0096L\2\u0364\u0363\3\2\2\2"+
		"\u0364\u0365\3\2\2\2\u0365\u0367\3\2\2\2\u0366\u0368\7@\2\2\u0367\u0366"+
		"\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u036a\3\2\2\2\u0369\u036b\7{\2\2\u036a"+
		"\u0369\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u036d\3\2\2\2\u036c\u036e\7@"+
		"\2\2\u036d\u036c\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u036f\3\2\2\2\u036f"+
		"\u0370\5\u0094K\2\u0370\u0381\3\2\2\2\u0371\u0373\5\u008aF\2\u0372\u0371"+
		"\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0376\5\u0088E"+
		"\2\u0375\u0377\7@\2\2\u0376\u0375\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0379"+
		"\3\2\2\2\u0378\u037a\7{\2\2\u0379\u0378\3\2\2\2\u0379\u037a\3\2\2\2\u037a"+
		"\u037c\3\2\2\2\u037b\u037d\7@\2\2\u037c\u037b\3\2\2\2\u037c\u037d\3\2"+
		"\2\2\u037d\u037e\3\2\2\2\u037e\u037f\5\u0094K\2\u037f\u0381\3\2\2\2\u0380"+
		"\u0353\3\2\2\2\u0380\u0372\3\2\2\2\u0381\u0087\3\2\2\2\u0382\u0383\5\64"+
		"\33\2\u0383\u0089\3\2\2\2\u0384\u0386\5T+\2\u0385\u0387\7@\2\2\u0386\u0385"+
		"\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u0389\3\2\2\2\u0388\u0384\3\2\2\2\u0389"+
		"\u038c\3\2\2\2\u038a\u0388\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u038d\3\2"+
		"\2\2\u038c\u038a\3\2\2\2\u038d\u038e\5\u00b6\\\2\u038e\u0395\3\2\2\2\u038f"+
		"\u0391\5V,\2\u0390\u0392\7@\2\2\u0391\u0390\3\2\2\2\u0391\u0392\3\2\2"+
		"\2\u0392\u0394\3\2\2\2\u0393\u038f\3\2\2\2\u0394\u0397\3\2\2\2\u0395\u0393"+
		"\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u039d\3\2\2\2\u0397\u0395\3\2\2\2\u0398"+
		"\u039a\5\64\33\2\u0399\u039b\7@\2\2\u039a\u0399\3\2\2\2\u039a\u039b\3"+
		"\2\2\2\u039b\u039d\3\2\2\2\u039c\u038a\3\2\2\2\u039c\u0398\3\2\2\2\u039d"+
		"\u008b\3\2\2\2\u039e\u03a0\7\3\2\2\u039f\u03a1\7@\2\2\u03a0\u039f\3\2"+
		"\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a3\3\2\2\2\u03a2\u03a4\5\u008eH\2\u03a3"+
		"\u03a2\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a6\3\2\2\2\u03a5\u03a7\7@"+
		"\2\2\u03a6\u03a5\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8"+
		"\u03aa\7\4\2\2\u03a9\u03ab\7\21\2\2\u03aa\u03a9\3\2\2\2\u03aa\u03ab\3"+
		"\2\2\2\u03ab\u03b2\3\2\2\2\u03ac\u03ae\7S\2\2\u03ad\u03af\7@\2\2\u03ae"+
		"\u03ad\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b1\3\2\2\2\u03b0\u03ac\3\2"+
		"\2\2\u03b1\u03b4\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3"+
		"\u03b6\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b5\u03b7\5\u00a0Q\2\u03b6\u03b5"+
		"\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03e9\3\2\2\2\u03b8\u03ba\7\3\2\2\u03b9"+
		"\u03bb\7@\2\2\u03ba\u03b9\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bc\3\2"+
		"\2\2\u03bc\u03c4\5\u00ba^\2\u03bd\u03bf\7\17\2\2\u03be\u03c0\7@\2\2\u03bf"+
		"\u03be\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c3\5\u00ba"+
		"^\2\u03c2\u03bd\3\2\2\2\u03c3\u03c6\3\2\2\2\u03c4\u03c2\3\2\2\2\u03c4"+
		"\u03c5\3\2\2\2\u03c5\u03c8\3\2\2\2\u03c6\u03c4\3\2\2\2\u03c7\u03c9\7@"+
		"\2\2\u03c8\u03c7\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca"+
		"\u03cc\7\4\2\2\u03cb\u03cd\7@\2\2\u03cc\u03cb\3\2\2\2\u03cc\u03cd\3\2"+
		"\2\2\u03cd\u03e4\3\2\2\2\u03ce\u03cf\5\u00b6\\\2\u03cf\u03d7\5\u0092J"+
		"\2\u03d0\u03d2\7\17\2\2\u03d1\u03d3\7@\2\2\u03d2\u03d1\3\2\2\2\u03d2\u03d3"+
		"\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d6\5\u0092J\2\u03d5\u03d0\3\2\2"+
		"\2\u03d6\u03d9\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03da"+
		"\3\2\2\2\u03d9\u03d7\3\2\2\2\u03da\u03dc\7\5\2\2\u03db\u03dd\7@\2\2\u03dc"+
		"\u03db\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03df\3\2\2\2\u03de\u03e0\7{"+
		"\2\2\u03df\u03de\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e2\3\2\2\2\u03e1"+
		"\u03e3\7@\2\2\u03e2\u03e1\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e5\3\2"+
		"\2\2\u03e4\u03ce\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e4\3\2\2\2\u03e6"+
		"\u03e7\3\2\2\2\u03e7\u03e9\3\2\2\2\u03e8\u039e\3\2\2\2\u03e8\u03b8\3\2"+
		"\2\2\u03e9\u008d\3\2\2\2\u03ea\u03ec\7{\2\2\u03eb\u03ea\3\2\2\2\u03eb"+
		"\u03ec\3\2\2\2\u03ec\u03ee\3\2\2\2\u03ed\u03ef\7@\2\2\u03ee\u03ed\3\2"+
		"\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03fe\5\u0090I\2\u03f1"+
		"\u03f3\7\17\2\2\u03f2\u03f4\7@\2\2\u03f3\u03f2\3\2\2\2\u03f3\u03f4\3\2"+
		"\2\2\u03f4\u03f6\3\2\2\2\u03f5\u03f7\7{\2\2\u03f6\u03f5\3\2\2\2\u03f6"+
		"\u03f7\3\2\2\2\u03f7\u03f9\3\2\2\2\u03f8\u03fa\7@\2\2\u03f9\u03f8\3\2"+
		"\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03fd\5\u0090I\2\u03fc"+
		"\u03f1\3\2\2\2\u03fd\u0400\3\2\2\2\u03fe\u03fc\3\2\2\2\u03fe\u03ff\3\2"+
		"\2\2\u03ff\u040c\3\2\2\2\u0400\u03fe\3\2\2\2\u0401\u0403\7\17\2\2\u0402"+
		"\u0404\7@\2\2\u0403\u0402\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u0406\3\2"+
		"\2\2\u0405\u0407\7{\2\2\u0406\u0405\3\2\2\2\u0406\u0407\3\2\2\2\u0407"+
		"\u0409\3\2\2\2\u0408\u040a\7@\2\2\u0409\u0408\3\2\2\2\u0409\u040a\3\2"+
		"\2\2\u040a\u040b\3\2\2\2\u040b\u040d\7B\2\2\u040c\u0401\3\2\2\2\u040c"+
		"\u040d\3\2\2\2\u040d\u008f\3\2\2\2\u040e\u0413\7P\2\2\u040f\u0410\5\u00b6"+
		"\\\2\u0410\u0411\5\u0092J\2\u0411\u0413\3\2\2\2\u0412\u040e\3\2\2\2\u0412"+
		"\u040f\3\2\2\2\u0413\u0091\3\2\2\2\u0414\u0416\5\u00c6d\2\u0415\u0414"+
		"\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u041c\3\2\2\2\u0417\u0418\7\3\2\2\u0418"+
		"\u0419\5\u0092J\2\u0419\u041a\7\4\2\2\u041a\u041d\3\2\2\2\u041b\u041d"+
		"\5\u00ba^\2\u041c\u0417\3\2\2\2\u041c\u041b\3\2\2\2\u041d\u041f\3\2\2"+
		"\2\u041e\u0420\5\u0110\u0089\2\u041f\u041e\3\2\2\2\u041f\u0420\3\2\2\2"+
		"\u0420\u0093\3\2\2\2\u0421\u0422\7u\2\2\u0422\u0423\bK\1\2\u0423\u0095"+
		"\3\2\2\2\u0424\u0425\7\6\2\2\u0425\u042a\5\u0098M\2\u0426\u0427\7\17\2"+
		"\2\u0427\u0429\5\u0098M\2\u0428\u0426\3\2\2\2\u0429\u042c\3\2\2\2\u042a"+
		"\u0428\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u0097\3\2\2\2\u042c\u042a\3\2"+
		"\2\2\u042d\u042e\5\u009aN\2\u042e\u042f\5\u009cO\2\u042f\u0099\3\2\2\2"+
		"\u0430\u0432\7\67\2\2\u0431\u0430\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u0433"+
		"\3\2\2\2\u0433\u0434\5\u00c2b\2\u0434\u009b\3\2\2\2\u0435\u0437\7\3\2"+
		"\2\u0436\u0438\5\u00caf\2\u0437\u0436\3\2\2\2\u0437\u0438\3\2\2\2\u0438"+
		"\u0439\3\2\2\2\u0439\u043a\7\4\2\2\u043a\u009d\3\2\2\2\u043b\u0443\5\u00c2"+
		"b\2\u043c\u043d\7\3\2\2\u043d\u043e\5\u009eP\2\u043e\u043f\7\4\2\2\u043f"+
		"\u0443\3\2\2\2\u0440\u0441\7_\2\2\u0441\u0443\5Z.\2\u0442\u043b\3\2\2"+
		"\2\u0442\u043c\3\2\2\2\u0442\u0440\3\2\2\2\u0443\u009f\3\2\2\2\u0444\u0445"+
		"\7Y\2\2\u0445\u0446\7\3\2\2\u0446\u0447\5\u00a2R\2\u0447\u0448\7\4\2\2"+
		"\u0448\u00a1\3\2\2\2\u0449\u044b\5d\63\2\u044a\u0449\3\2\2\2\u044b\u044e"+
		"\3\2\2\2\u044c\u044a\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u045a\3\2\2\2\u044e"+
		"\u044c\3\2\2\2\u044f\u0450\7\3\2\2\u0450\u0451\5\u00a2R\2\u0451\u0455"+
		"\7\4\2\2\u0452\u0454\5d\63\2\u0453\u0452\3\2\2\2\u0454\u0457\3\2\2\2\u0455"+
		"\u0453\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u0459\3\2\2\2\u0457\u0455\3\2"+
		"\2\2\u0458\u044f\3\2\2\2\u0459\u045c\3\2\2\2\u045a\u0458\3\2\2\2\u045a"+
		"\u045b\3\2\2\2\u045b\u00a3\3\2\2\2\u045c\u045a\3\2\2\2\u045d\u045e\5\u00a6"+
		"T\2\u045e\u00a5\3\2\2\2\u045f\u0461\5`\61\2\u0460\u045f\3\2\2\2\u0460"+
		"\u0461\3\2\2\2\u0461\u0462\3\2\2\2\u0462\u0464\5\u00aeX\2\u0463\u0465"+
		"\5\u00acW\2\u0464\u0463\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u04b0\3\2\2"+
		"\2\u0466\u0468\7N\2\2\u0467\u0469\7@\2\2\u0468\u0467\3\2\2\2\u0468\u0469"+
		"\3\2\2\2\u0469\u046b\3\2\2\2\u046a\u0466\3\2\2\2\u046a\u046b\3\2\2\2\u046b"+
		"\u046d\3\2\2\2\u046c\u046e\5`\61\2\u046d\u046c\3\2\2\2\u046d\u046e\3\2"+
		"\2\2\u046e\u046f\3\2\2\2\u046f\u0470\5\u00b6\\\2\u0470\u0471\5\u00acW"+
		"\2\u0471\u04b0\3\2\2\2\u0472\u0474\7N\2\2\u0473\u0475\7@\2\2\u0474\u0473"+
		"\3\2\2\2\u0474\u0475\3\2\2\2\u0475\u0477\3\2\2\2\u0476\u0472\3\2\2\2\u0476"+
		"\u0477\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u0479\5\u00b6\\\2\u0479\u047b"+
		"\7\3\2\2\u047a\u047c\5\u00a8U\2\u047b\u047a\3\2\2\2\u047b\u047c\3\2\2"+
		"\2\u047c\u047d\3\2\2\2\u047d\u047f\5V,\2\u047e\u0480\5\u00c2b\2\u047f"+
		"\u047e\3\2\2\2\u047f\u0480\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u0482\7\4"+
		"\2\2\u0482\u0484\5\u00bc_\2\u0483\u0485\7@\2\2\u0484\u0483\3\2\2\2\u0484"+
		"\u0485\3\2\2\2\u0485\u0488\3\2\2\2\u0486\u0489\58\35\2\u0487\u0489\5\64"+
		"\33\2\u0488\u0486\3\2\2\2\u0488\u0487\3\2\2\2\u0488\u0489\3\2\2\2\u0489"+
		"\u048f\3\2\2\2\u048a\u048c\7!\2\2\u048b\u048d\7@\2\2\u048c\u048b\3\2\2"+
		"\2\u048c\u048d\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u0490\5\u0106\u0084\2"+
		"\u048f\u048a\3\2\2\2\u048f\u0490\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u0492"+
		"\7\5\2\2\u0492\u04b0\3\2\2\2\u0493\u0495\7S\2\2\u0494\u0496\7@\2\2\u0495"+
		"\u0494\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u0498\3\2\2\2\u0497\u0493\3\2"+
		"\2\2\u0497\u0498\3\2\2\2\u0498\u049d\3\2\2\2\u0499\u049b\5T+\2\u049a\u049c"+
		"\7@\2\2\u049b\u049a\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u049e\3\2\2\2\u049d"+
		"\u0499\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u04a3\3\2\2\2\u049f\u04a1\7N"+
		"\2\2\u04a0\u04a2\7@\2\2\u04a1\u04a0\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2"+
		"\u04a4\3\2\2\2\u04a3\u049f\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u04a5\3\2"+
		"\2\2\u04a5\u04a7\5\u00aaV\2\u04a6\u04a8\7@\2\2\u04a7\u04a6\3\2\2\2\u04a7"+
		"\u04a8\3\2\2\2\u04a8\u04aa\3\2\2\2\u04a9\u04ab\5\u00acW\2\u04aa\u04a9"+
		"\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab\u04ad\3\2\2\2\u04ac\u04ae\7\5\2\2\u04ad"+
		"\u04ac\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae\u04b0\3\2\2\2\u04af\u0460\3\2"+
		"\2\2\u04af\u046a\3\2\2\2\u04af\u0476\3\2\2\2\u04af\u0497\3\2\2\2\u04b0"+
		"\u00a7\3\2\2\2\u04b1\u04b3\7t\2\2\u04b2\u04b1\3\2\2\2\u04b3\u04b4\3\2"+
		"\2\2\u04b4\u04b2\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5\u00a9\3\2\2\2\u04b6"+
		"\u04b8\7^\2\2\u04b7\u04b9\7@\2\2\u04b8\u04b7\3\2\2\2\u04b8\u04b9\3\2\2"+
		"\2\u04b9\u04bb\3\2\2\2\u04ba\u04bc\58\35\2\u04bb\u04ba\3\2\2\2\u04bb\u04bc"+
		"\3\2\2\2\u04bc\u04c1\3\2\2\2\u04bd\u04bf\5\u00c2b\2\u04be\u04c0\7@\2\2"+
		"\u04bf\u04be\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04c2\3\2\2\2\u04c1\u04bd"+
		"\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c4\3\2\2\2\u04c3\u04c5\58\35\2\u04c4"+
		"\u04c3\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6\u04c7\7u"+
		"\2\2\u04c7\u04e6\bV\1\2\u04c8\u04ca\7^\2\2\u04c9\u04cb\7@\2\2\u04ca\u04c9"+
		"\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04cd\3\2\2\2\u04cc\u04ce\58\35\2\u04cd"+
		"\u04cc\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u04d1\5\u00c2"+
		"b\2\u04d0\u04d2\7@\2\2\u04d1\u04d0\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d4"+
		"\3\2\2\2\u04d3\u04d5\5\u00c6d\2\u04d4\u04d3\3\2\2\2\u04d4\u04d5\3\2\2"+
		"\2\u04d5\u04d6\3\2\2\2\u04d6\u04d8\5\u00c2b\2\u04d7\u04d9\5\u00c6d\2\u04d8"+
		"\u04d7\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04da\3\2\2\2\u04da\u04db\7!"+
		"\2\2\u04db\u04dc\bV\1\2\u04dc\u04e6\3\2\2\2\u04dd\u04df\7^\2\2\u04de\u04e0"+
		"\7@\2\2\u04df\u04de\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e2\3\2\2\2\u04e1"+
		"\u04e3\58\35\2\u04e2\u04e1\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e4\3\2"+
		"\2\2\u04e4\u04e6\5\u00c2b\2\u04e5\u04b6\3\2\2\2\u04e5\u04c8\3\2\2\2\u04e5"+
		"\u04dd\3\2\2\2\u04e6\u00ab\3\2\2\2\u04e7\u04f2\5\u010c\u0087\2\u04e8\u04ea"+
		"\7@\2\2\u04e9\u04e8\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb"+
		"\u04ed\7\17\2\2\u04ec\u04ee\7@\2\2\u04ed\u04ec\3\2\2\2\u04ed\u04ee\3\2"+
		"\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04f1\5\u010c\u0087\2\u04f0\u04e9\3\2\2"+
		"\2\u04f1\u04f4\3\2\2\2\u04f2\u04f0\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f6"+
		"\3\2\2\2\u04f4\u04f2\3\2\2\2\u04f5\u04f7\7@\2\2\u04f6\u04f5\3\2\2\2\u04f6"+
		"\u04f7\3\2\2\2\u04f7\u04f9\3\2\2\2\u04f8\u04fa\58\35\2\u04f9\u04f8\3\2"+
		"\2\2\u04f9\u04fa\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u04fc\7\5\2\2\u04fc"+
		"\u00ad\3\2\2\2\u04fd\u04ff\7a\2\2\u04fe\u0500\7@\2\2\u04ff\u04fe\3\2\2"+
		"\2\u04ff\u0500\3\2\2\2\u0500\u0502\3\2\2\2\u0501\u0503\5\u00b0Y\2\u0502"+
		"\u0501\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0505\3\2\2\2\u0504\u0506\5\u00b2"+
		"Z\2\u0505\u0504\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u0507\3\2\2\2\u0507"+
		"\u0508\7u\2\2\u0508\u0509\bX\1\2\u0509\u00af\3\2\2\2\u050a\u050b\5\u00c2"+
		"b\2\u050b\u00b1\3\2\2\2\u050c\u050d\7\6\2\2\u050d\u0512\5\u00b4[\2\u050e"+
		"\u050f\7\17\2\2\u050f\u0511\5\u00b4[\2\u0510\u050e\3\2\2\2\u0511\u0514"+
		"\3\2\2\2\u0512\u0510\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u00b3\3\2\2\2\u0514"+
		"\u0512\3\2\2\2\u0515\u0517\7V\2\2\u0516\u0518\7@\2\2\u0517\u0516\3\2\2"+
		"\2\u0517\u0518\3\2\2\2\u0518\u051a\3\2\2\2\u0519\u0515\3\2\2\2\u0519\u051a"+
		"\3\2\2\2\u051a\u051c\3\2\2\2\u051b\u051d\5X-\2\u051c\u051b\3\2\2\2\u051c"+
		"\u051d\3\2\2\2\u051d\u051e\3\2\2\2\u051e\u051f\5\u00c2b\2\u051f\u00b5"+
		"\3\2\2\2\u0520\u0522\7T\2\2\u0521\u0523\7@\2\2\u0522\u0521\3\2\2\2\u0522"+
		"\u0523\3\2\2\2\u0523\u0554\3\2\2\2\u0524\u0526\5T+\2\u0525\u0527\7@\2"+
		"\2\u0526\u0525\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u0554\3\2\2\2\u0528\u052a"+
		"\7S\2\2\u0529\u052b\7@\2\2\u052a\u0529\3\2\2\2\u052a\u052b\3\2\2\2\u052b"+
		"\u0554\3\2\2\2\u052c\u052e\7Q\2\2\u052d\u052f\7@\2\2\u052e\u052d\3\2\2"+
		"\2\u052e\u052f\3\2\2\2\u052f\u0554\3\2\2\2\u0530\u0532\7R\2\2\u0531\u0533"+
		"\7@\2\2\u0532\u0531\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0554\3\2\2\2\u0534"+
		"\u0536\7\\\2\2\u0535\u0537\7@\2\2\u0536\u0535\3\2\2\2\u0536\u0537\3\2"+
		"\2\2\u0537\u0554\3\2\2\2\u0538\u053a\7]\2\2\u0539\u053b\7@\2\2\u053a\u0539"+
		"\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u0554\3\2\2\2\u053c\u053e\5V,\2\u053d"+
		"\u053f\7@\2\2\u053e\u053d\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0554\3\2"+
		"\2\2\u0540\u0554\5\u00b8]\2\u0541\u0542\7\26\2\2\u0542\u0543\5b\62\2\u0543"+
		"\u0544\7\27\2\2\u0544\u054f\3\2\2\2\u0545\u0546\7\67\2\2\u0546\u054b\5"+
		"\u00b8]\2\u0547\u0548\7\26\2\2\u0548\u0549\5b\62\2\u0549\u054a\7\27\2"+
		"\2\u054a\u054c\3\2\2\2\u054b\u0547\3\2\2\2\u054b\u054c\3\2\2\2\u054c\u054e"+
		"\3\2\2\2\u054d\u0545\3\2\2\2\u054e\u0551\3\2\2\2\u054f\u054d\3\2\2\2\u054f"+
		"\u0550\3\2\2\2\u0550\u0554\3\2\2\2\u0551\u054f\3\2\2\2\u0552\u0554\5\64"+
		"\33\2\u0553\u0520\3\2\2\2\u0553\u0524\3\2\2\2\u0553\u0528\3\2\2\2\u0553"+
		"\u052c\3\2\2\2\u0553\u0530\3\2\2\2\u0553\u0534\3\2\2\2\u0553\u0538\3\2"+
		"\2\2\u0553\u053c\3\2\2\2\u0553\u0540\3\2\2\2\u0553\u0541\3\2\2\2\u0553"+
		"\u0552\3\2\2\2\u0554\u0555\3\2\2\2\u0555\u0553\3\2\2\2\u0555\u0556\3\2"+
		"\2\2\u0556\u00b7\3\2\2\2\u0557\u0559\7P\2\2\u0558\u055a\7@\2\2\u0559\u0558"+
		"\3\2\2\2\u0559\u055a\3\2\2\2\u055a\u0574\3\2\2\2\u055b\u055d\7\16\2\2"+
		"\u055c\u055e\7@\2\2\u055d\u055c\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u0574"+
		"\3\2\2\2\u055f\u0561\78\2\2\u0560\u0562\7@\2\2\u0561\u0560\3\2\2\2\u0561"+
		"\u0562\3\2\2\2\u0562\u0574\3\2\2\2\u0563\u0565\79\2\2\u0564\u0566\7@\2"+
		"\2\u0565\u0564\3\2\2\2\u0565\u0566\3\2\2\2\u0566\u0574\3\2\2\2\u0567\u0569"+
		"\7^\2\2\u0568\u056a\7@\2\2\u0569\u0568\3\2\2\2\u0569\u056a\3\2\2\2\u056a"+
		"\u0574\3\2\2\2\u056b\u056d\7a\2\2\u056c\u056e\7@\2\2\u056d\u056c\3\2\2"+
		"\2\u056d\u056e\3\2\2\2\u056e\u0574\3\2\2\2\u056f\u0571\7t\2\2\u0570\u0572"+
		"\7@\2\2\u0571\u0570\3\2\2\2\u0571\u0572\3\2\2\2\u0572\u0574\3\2\2\2\u0573"+
		"\u0557\3\2\2\2\u0573\u055b\3\2\2\2\u0573\u055f\3\2\2\2\u0573\u0563\3\2"+
		"\2\2\u0573\u0567\3\2\2\2\u0573\u056b\3\2\2\2\u0573\u056f\3\2\2\2\u0574"+
		"\u0575\3\2\2\2\u0575\u0573\3\2\2\2\u0575\u0576\3\2\2\2\u0576\u00b9\3\2"+
		"\2\2\u0577\u0579\5\u00c2b\2\u0578\u057a\7@\2\2\u0579\u0578\3\2\2\2\u0579"+
		"\u057a\3\2\2\2\u057a\u00bb\3\2\2\2\u057b\u057c\7\3\2\2\u057c\u057d\7P"+
		"\2\2\u057d\u058e\7\4\2\2\u057e\u058a\7\3\2\2\u057f\u0587\5\u00be`\2\u0580"+
		"\u0582\7\17\2\2\u0581\u0583\7@\2\2\u0582\u0581\3\2\2\2\u0582\u0583\3\2"+
		"\2\2\u0583\u0584\3\2\2\2\u0584\u0586\5\u00be`\2\u0585\u0580\3\2\2\2\u0586"+
		"\u0589\3\2\2\2\u0587\u0585\3\2\2\2\u0587\u0588\3\2\2\2\u0588\u058b\3\2"+
		"\2\2\u0589\u0587\3\2\2\2\u058a\u057f\3\2\2\2\u058a\u058b\3\2\2\2\u058b"+
		"\u058c\3\2\2\2\u058c\u058e\7\4\2\2\u058d\u057b\3\2\2\2\u058d\u057e\3\2"+
		"\2\2\u058e\u00bd\3\2\2\2\u058f\u0591\5\u00b6\\\2\u0590\u0592\7@\2\2\u0591"+
		"\u0590\3\2\2\2\u0591\u0592\3\2\2\2\u0592\u0593\3\2\2\2\u0593\u0594\5\u00c0"+
		"a\2\u0594\u0597\3\2\2\2\u0595\u0597\7B\2\2\u0596\u058f\3\2\2\2\u0596\u0595"+
		"\3\2\2\2\u0597\u00bf\3\2\2\2\u0598\u059a\5\u00c6d\2\u0599\u0598\3\2\2"+
		"\2\u0599\u059a\3\2\2\2\u059a\u05a2\3\2\2\2\u059b\u059c\7\3\2\2\u059c\u059d"+
		"\5\u00c0a\2\u059d\u059e\7\4\2\2\u059e\u05a3\3\2\2\2\u059f\u05a1\5\u00ba"+
		"^\2\u05a0\u059f\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1\u05a3\3\2\2\2\u05a2"+
		"\u059b\3\2\2\2\u05a2\u05a0\3\2\2\2\u05a3\u05a5\3\2\2\2\u05a4\u05a6\5\u0110"+
		"\u0089\2\u05a5\u05a4\3\2\2\2\u05a5\u05a6\3\2\2\2\u05a6\u00c1\3\2\2\2\u05a7"+
		"\u05ac\7t\2\2\u05a8\u05a9\7\67\2\2\u05a9\u05ab\7t\2\2\u05aa\u05a8\3\2"+
		"\2\2\u05ab\u05ae\3\2\2\2\u05ac\u05aa\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ad"+
		"\u05b3\3\2\2\2\u05ae\u05ac\3\2\2\2\u05af\u05b3\7b\2\2\u05b0\u05b3\7p\2"+
		"\2\u05b1\u05b3\5X-\2\u05b2\u05a7\3\2\2\2\u05b2\u05af\3\2\2\2\u05b2\u05b0"+
		"\3\2\2\2\u05b2\u05b1\3\2\2\2\u05b3\u00c3\3\2\2\2\u05b4\u05b5\t\24\2\2"+
		"\u05b5\u00c5\3\2\2\2\u05b6\u05b8\5V,\2\u05b7\u05b9\7:\2\2\u05b8\u05b7"+
		"\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9\u05bb\3\2\2\2\u05ba\u05b6\3\2\2\2\u05bb"+
		"\u05bc\3\2\2\2\u05bc\u05ba\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u00c7\3\2"+
		"\2\2\u05be\u05bf\5\u00c6d\2\u05bf\u00c9\3\2\2\2\u05c0\u05c5\5\u00ccg\2"+
		"\u05c1\u05c2\7A\2\2\u05c2\u05c4\7@\2\2\u05c3\u05c1\3\2\2\2\u05c4\u05c7"+
		"\3\2\2\2\u05c5\u05c3\3\2\2\2\u05c5\u05c6\3\2\2\2\u05c6\u05dc\3\2\2\2\u05c7"+
		"\u05c5\3\2\2\2\u05c8\u05ca\7@\2\2\u05c9\u05c8\3\2\2\2\u05c9\u05ca\3\2"+
		"\2\2\u05ca\u05cc\3\2\2\2\u05cb\u05cd\7{\2\2\u05cc\u05cb\3\2\2\2\u05cc"+
		"\u05cd\3\2\2\2\u05cd\u05cf\3\2\2\2\u05ce\u05d0\7@\2\2\u05cf\u05ce\3\2"+
		"\2\2\u05cf\u05d0\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u05d3\7\17\2\2\u05d2"+
		"\u05d4\7@\2\2\u05d3\u05d2\3\2\2\2\u05d3\u05d4\3\2\2\2\u05d4\u05d6\3\2"+
		"\2\2\u05d5\u05d7\7{\2\2\u05d6\u05d5\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7"+
		"\u05d9\3\2\2\2\u05d8\u05da\7@\2\2\u05d9\u05d8\3\2\2\2\u05d9\u05da\3\2"+
		"\2\2\u05da\u05db\3\2\2\2\u05db\u05dd\5\u00caf\2\u05dc\u05c9\3\2\2\2\u05dc"+
		"\u05dd\3\2\2\2\u05dd\u05e2\3\2\2\2\u05de\u05df\7A\2\2\u05df\u05e1\7@\2"+
		"\2\u05e0\u05de\3\2\2\2\u05e1\u05e4\3\2\2\2\u05e2\u05e0\3\2\2\2\u05e2\u05e3"+
		"\3\2\2\2\u05e3\u00cb\3\2\2\2\u05e4\u05e2\3\2\2\2\u05e5\u05fb\5\u00ceh"+
		"\2\u05e6\u05e8\7@\2\2\u05e7\u05e6\3\2\2\2\u05e7\u05e8\3\2\2\2\u05e8\u05ea"+
		"\3\2\2\2\u05e9\u05eb\7{\2\2\u05ea\u05e9\3\2\2\2\u05ea\u05eb\3\2\2\2\u05eb"+
		"\u05ed\3\2\2\2\u05ec\u05ee\7@\2\2\u05ed\u05ec\3\2\2\2\u05ed\u05ee\3\2"+
		"\2\2\u05ee\u05ef\3\2\2\2\u05ef\u05f1\5\\/\2\u05f0\u05f2\7@\2\2\u05f1\u05f0"+
		"\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2\u05f4\3\2\2\2\u05f3\u05f5\7{\2\2\u05f4"+
		"\u05f3\3\2\2\2\u05f4\u05f5\3\2\2\2\u05f5\u05f7\3\2\2\2\u05f6\u05f8\7@"+
		"\2\2\u05f7\u05f6\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9"+
		"\u05fa\5\u00ccg\2\u05fa\u05fc\3\2\2\2\u05fb\u05e7\3\2\2\2\u05fb\u05fc"+
		"\3\2\2\2\u05fc\u00cd\3\2\2\2\u05fd\u0629\5\u00d0i\2\u05fe\u0600\5\u00d0"+
		"i\2\u05ff\u0601\7@\2\2\u0600\u05ff\3\2\2\2\u0600\u0601\3\2\2\2\u0601\u0603"+
		"\3\2\2\2\u0602\u0604\7{\2\2\u0603\u0602\3\2\2\2\u0603\u0604\3\2\2\2\u0604"+
		"\u0606\3\2\2\2\u0605\u0607\7@\2\2\u0606\u0605\3\2\2\2\u0606\u0607\3\2"+
		"\2\2\u0607\u0608\3\2\2\2\u0608\u060a\7;\2\2\u0609\u060b\7@\2\2\u060a\u0609"+
		"\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u060d\3\2\2\2\u060c\u060e\7{\2\2\u060d"+
		"\u060c\3\2\2\2\u060d\u060e\3\2\2\2\u060e\u0610\3\2\2\2\u060f\u0611\7@"+
		"\2\2\u0610\u060f\3\2\2\2\u0610\u0611\3\2\2\2\u0611\u0612\3\2\2\2\u0612"+
		"\u0614\5\u00caf\2\u0613\u0615\7@\2\2\u0614\u0613\3\2\2\2\u0614\u0615\3"+
		"\2\2\2\u0615\u0617\3\2\2\2\u0616\u0618\7{\2\2\u0617\u0616\3\2\2\2\u0617"+
		"\u0618\3\2\2\2\u0618\u061a\3\2\2\2\u0619\u061b\7@\2\2\u061a\u0619\3\2"+
		"\2\2\u061a\u061b\3\2\2\2\u061b\u061c\3\2\2\2\u061c\u061e\7\6\2\2\u061d"+
		"\u061f\7@\2\2\u061e\u061d\3\2\2\2\u061e\u061f\3\2\2\2\u061f\u0621\3\2"+
		"\2\2\u0620\u0622\7{\2\2\u0621\u0620\3\2\2\2\u0621\u0622\3\2\2\2\u0622"+
		"\u0624\3\2\2\2\u0623\u0625\7@\2\2\u0624\u0623\3\2\2\2\u0624\u0625\3\2"+
		"\2\2\u0625\u0626\3\2\2\2\u0626\u0627\5\u00ceh\2\u0627\u0629\3\2\2\2\u0628"+
		"\u05fd\3\2\2\2\u0628\u05fe\3\2\2\2\u0629\u00cf\3\2\2\2\u062a\u063f\5\u00d2"+
		"j\2\u062b\u062d\7@\2\2\u062c\u062b\3\2\2\2\u062c\u062d\3\2\2\2\u062d\u062f"+
		"\3\2\2\2\u062e\u0630\7{\2\2\u062f\u062e\3\2\2\2\u062f\u0630\3\2\2\2\u0630"+
		"\u0632\3\2\2\2\u0631\u0633\7@\2\2\u0632\u0631\3\2\2\2\u0632\u0633\3\2"+
		"\2\2\u0633\u0634\3\2\2\2\u0634\u0636\7\61\2\2\u0635\u0637\7@\2\2\u0636"+
		"\u0635\3\2\2\2\u0636\u0637\3\2\2\2\u0637\u0639\3\2\2\2\u0638\u063a\7{"+
		"\2\2\u0639\u0638\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u063c\3\2\2\2\u063b"+
		"\u063d\7@\2\2\u063c\u063b\3\2\2\2\u063c\u063d\3\2\2\2\u063d\u063e\3\2"+
		"\2\2\u063e\u0640\5\u00d0i\2\u063f\u062c\3\2\2\2\u063f\u0640\3\2\2\2\u0640"+
		"\u00d1\3\2\2\2\u0641\u0656\5\u00d4k\2\u0642\u0644\7@\2\2\u0643\u0642\3"+
		"\2\2\2\u0643\u0644\3\2\2\2\u0644\u0646\3\2\2\2\u0645\u0647\7{\2\2\u0646"+
		"\u0645\3\2\2\2\u0646\u0647\3\2\2\2\u0647\u0649\3\2\2\2\u0648\u064a\7@"+
		"\2\2\u0649\u0648\3\2\2\2\u0649\u064a\3\2\2\2\u064a\u064b\3\2\2\2\u064b"+
		"\u064d\7\60\2\2\u064c\u064e\7@\2\2\u064d\u064c\3\2\2\2\u064d\u064e\3\2"+
		"\2\2\u064e\u0650\3\2\2\2\u064f\u0651\7{\2\2\u0650\u064f\3\2\2\2\u0650"+
		"\u0651\3\2\2\2\u0651\u0653\3\2\2\2\u0652\u0654\7@\2\2\u0653\u0652\3\2"+
		"\2\2\u0653\u0654\3\2\2\2\u0654\u0655\3\2\2\2\u0655\u0657\5\u00d2j\2\u0656"+
		"\u0643\3\2\2\2\u0656\u0657\3\2\2\2\u0657\u00d3\3\2\2\2\u0658\u066d\5\u00d6"+
		"l\2\u0659\u065b\7@\2\2\u065a\u0659\3\2\2\2\u065a\u065b\3\2\2\2\u065b\u065d"+
		"\3\2\2\2\u065c\u065e\7{\2\2\u065d\u065c\3\2\2\2\u065d\u065e\3\2\2\2\u065e"+
		"\u0660\3\2\2\2\u065f\u0661\7@\2\2\u0660\u065f\3\2\2\2\u0660\u0661\3\2"+
		"\2\2\u0661\u0662\3\2\2\2\u0662\u0664\7 \2\2\u0663\u0665\7@\2\2\u0664\u0663"+
		"\3\2\2\2\u0664\u0665\3\2\2\2\u0665\u0667\3\2\2\2\u0666\u0668\7{\2\2\u0667"+
		"\u0666\3\2\2\2\u0667\u0668\3\2\2\2\u0668\u066a\3\2\2\2\u0669\u066b\7@"+
		"\2\2\u066a\u0669\3\2\2\2\u066a\u066b\3\2\2\2\u066b\u066c\3\2\2\2\u066c"+
		"\u066e\5\u00d4k\2\u066d\u065a\3\2\2\2\u066d\u066e\3\2\2\2\u066e\u00d5"+
		"\3\2\2\2\u066f\u0684\5\u00d8m\2\u0670\u0672\7@\2\2\u0671\u0670\3\2\2\2"+
		"\u0671\u0672\3\2\2\2\u0672\u0674\3\2\2\2\u0673\u0675\7{\2\2\u0674\u0673"+
		"\3\2\2\2\u0674\u0675\3\2\2\2\u0675\u0677\3\2\2\2\u0676\u0678\7@\2\2\u0677"+
		"\u0676\3\2\2\2\u0677\u0678\3\2\2\2\u0678\u0679\3\2\2\2\u0679\u067b\7\37"+
		"\2\2\u067a\u067c\7@\2\2\u067b\u067a\3\2\2\2\u067b\u067c\3\2\2\2\u067c"+
		"\u067e\3\2\2\2\u067d\u067f\7{\2\2\u067e\u067d\3\2\2\2\u067e\u067f\3\2"+
		"\2\2\u067f\u0681\3\2\2\2\u0680\u0682\7@\2\2\u0681\u0680\3\2\2\2\u0681"+
		"\u0682\3\2\2\2\u0682\u0683\3\2\2\2\u0683\u0685\5\u00d6l\2\u0684\u0671"+
		"\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u00d7\3\2\2\2\u0686\u069b\5\u00dan"+
		"\2\u0687\u0689\7@\2\2\u0688\u0687\3\2\2\2\u0688\u0689\3\2\2\2\u0689\u068b"+
		"\3\2\2\2\u068a\u068c\7{\2\2\u068b\u068a\3\2\2\2\u068b\u068c\3\2\2\2\u068c"+
		"\u068e\3\2\2\2\u068d\u068f\7@\2\2\u068e\u068d\3\2\2\2\u068e\u068f\3\2"+
		"\2\2\u068f\u0690\3\2\2\2\u0690\u0692\7\20\2\2\u0691\u0693\7@\2\2\u0692"+
		"\u0691\3\2\2\2\u0692\u0693\3\2\2\2\u0693\u0695\3\2\2\2\u0694\u0696\7{"+
		"\2\2\u0695\u0694\3\2\2\2\u0695\u0696\3\2\2\2\u0696\u0698\3\2\2\2\u0697"+
		"\u0699\7@\2\2\u0698\u0697\3\2\2\2\u0698\u0699\3\2\2\2\u0699\u069a\3\2"+
		"\2\2\u069a\u069c\5\u00d8m\2\u069b\u0688\3\2\2\2\u069b\u069c\3\2\2\2\u069c"+
		"\u00d9\3\2\2\2\u069d\u06b3\5\u00dco\2\u069e\u06a0\7@\2\2\u069f\u069e\3"+
		"\2\2\2\u069f\u06a0\3\2\2\2\u06a0\u06a2\3\2\2\2\u06a1\u06a3\7{\2\2\u06a2"+
		"\u06a1\3\2\2\2\u06a2\u06a3\3\2\2\2\u06a3\u06a5\3\2\2\2\u06a4\u06a6\7@"+
		"\2\2\u06a5\u06a4\3\2\2\2\u06a5\u06a6\3\2\2\2\u06a6\u06a7\3\2\2\2\u06a7"+
		"\u06a9\5^\60\2\u06a8\u06aa\7@\2\2\u06a9\u06a8\3\2\2\2\u06a9\u06aa\3\2"+
		"\2\2\u06aa\u06ac\3\2\2\2\u06ab\u06ad\7{\2\2\u06ac\u06ab\3\2\2\2\u06ac"+
		"\u06ad\3\2\2\2\u06ad\u06af\3\2\2\2\u06ae\u06b0\7@\2\2\u06af\u06ae\3\2"+
		"\2\2\u06af\u06b0\3\2\2\2\u06b0\u06b1\3\2\2\2\u06b1\u06b2\5\u00dan\2\u06b2"+
		"\u06b4\3\2\2\2\u06b3\u069f\3\2\2\2\u06b3\u06b4\3\2\2\2\u06b4\u00db\3\2"+
		"\2\2\u06b5\u06cb\5\u00dep\2\u06b6\u06b8\7@\2\2\u06b7\u06b6\3\2\2\2\u06b7"+
		"\u06b8\3\2\2\2\u06b8\u06ba\3\2\2\2\u06b9\u06bb\7{\2\2\u06ba\u06b9\3\2"+
		"\2\2\u06ba\u06bb\3\2\2\2\u06bb\u06bd\3\2\2\2\u06bc\u06be\7@\2\2\u06bd"+
		"\u06bc\3\2\2\2\u06bd\u06be\3\2\2\2\u06be\u06bf\3\2\2\2\u06bf\u06c1\5P"+
		")\2\u06c0\u06c2\7@\2\2\u06c1\u06c0\3\2\2\2\u06c1\u06c2\3\2\2\2\u06c2\u06c4"+
		"\3\2\2\2\u06c3\u06c5\7{\2\2\u06c4\u06c3\3\2\2\2\u06c4\u06c5\3\2\2\2\u06c5"+
		"\u06c7\3\2\2\2\u06c6\u06c8\7@\2\2\u06c7\u06c6\3\2\2\2\u06c7\u06c8\3\2"+
		"\2\2\u06c8\u06c9\3\2\2\2\u06c9\u06ca\5\u00dco\2\u06ca\u06cc\3\2\2\2\u06cb"+
		"\u06b7\3\2\2\2\u06cb\u06cc\3\2\2\2\u06cc\u00dd\3\2\2\2\u06cd\u06e2\5\u00e0"+
		"q\2\u06ce\u06d0\7@\2\2\u06cf\u06ce\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0\u06d2"+
		"\3\2\2\2\u06d1\u06d3\7{\2\2\u06d2\u06d1\3\2\2\2\u06d2\u06d3\3\2\2\2\u06d3"+
		"\u06d5\3\2\2\2\u06d4\u06d6\7@\2\2\u06d5\u06d4\3\2\2\2\u06d5\u06d6\3\2"+
		"\2\2\u06d6\u06d7\3\2\2\2\u06d7\u06d9\t\25\2\2\u06d8\u06da\7@\2\2\u06d9"+
		"\u06d8\3\2\2\2\u06d9\u06da\3\2\2\2\u06da\u06dc\3\2\2\2\u06db\u06dd\7{"+
		"\2\2\u06dc\u06db\3\2\2\2\u06dc\u06dd\3\2\2\2\u06dd\u06df\3\2\2\2\u06de"+
		"\u06e0\7@\2\2\u06df\u06de\3\2\2\2\u06df\u06e0\3\2\2\2\u06e0\u06e1\3\2"+
		"\2\2\u06e1\u06e3\5\u00dep\2\u06e2\u06cf\3\2\2\2\u06e2\u06e3\3\2\2\2\u06e3"+
		"\u00df\3\2\2\2\u06e4\u06f9\5\u00e2r\2\u06e5\u06e7\7@\2\2\u06e6\u06e5\3"+
		"\2\2\2\u06e6\u06e7\3\2\2\2\u06e7\u06e9\3\2\2\2\u06e8\u06ea\7{\2\2\u06e9"+
		"\u06e8\3\2\2\2\u06e9\u06ea\3\2\2\2\u06ea\u06ec\3\2\2\2\u06eb\u06ed\7@"+
		"\2\2\u06ec\u06eb\3\2\2\2\u06ec\u06ed\3\2\2\2\u06ed\u06ee\3\2\2\2\u06ee"+
		"\u06f0\t\26\2\2\u06ef\u06f1\7@\2\2\u06f0\u06ef\3\2\2\2\u06f0\u06f1\3\2"+
		"\2\2\u06f1\u06f3\3\2\2\2\u06f2\u06f4\7{\2\2\u06f3\u06f2\3\2\2\2\u06f3"+
		"\u06f4\3\2\2\2\u06f4\u06f6\3\2\2\2\u06f5\u06f7\7@\2\2\u06f6\u06f5\3\2"+
		"\2\2\u06f6\u06f7\3\2\2\2\u06f7\u06f8\3\2\2\2\u06f8\u06fa\5\u00e0q\2\u06f9"+
		"\u06e6\3\2\2\2\u06f9\u06fa\3\2\2\2\u06fa\u00e1\3\2\2\2\u06fb\u0710\5\u00e4"+
		"s\2\u06fc\u06fe\7@\2\2\u06fd\u06fc\3\2\2\2\u06fd\u06fe\3\2\2\2\u06fe\u0700"+
		"\3\2\2\2\u06ff\u0701\7{\2\2\u0700\u06ff\3\2\2\2\u0700\u0701\3\2\2\2\u0701"+
		"\u0703\3\2\2\2\u0702\u0704\7@\2\2\u0703\u0702\3\2\2\2\u0703\u0704\3\2"+
		"\2\2\u0704\u0705\3\2\2\2\u0705\u0707\t\27\2\2\u0706\u0708\7@\2\2\u0707"+
		"\u0706\3\2\2\2\u0707\u0708\3\2\2\2\u0708\u070a\3\2\2\2\u0709\u070b\7{"+
		"\2\2\u070a\u0709\3\2\2\2\u070a\u070b\3\2\2\2\u070b\u070d\3\2\2\2\u070c"+
		"\u070e\7@\2\2\u070d\u070c\3\2\2\2\u070d\u070e\3\2\2\2\u070e\u070f\3\2"+
		"\2\2\u070f\u0711\5\u00e2r\2\u0710\u06fd\3\2\2\2\u0710\u0711\3\2\2\2\u0711"+
		"\u00e3\3\2\2\2\u0712\u0713\7\3\2\2\u0713\u0715\5V,\2\u0714\u0716\5\u00c2"+
		"b\2\u0715\u0714\3\2\2\2\u0715\u0716\3\2\2\2\u0716\u0717\3\2\2\2\u0717"+
		"\u0718\7\4\2\2\u0718\u0719\7\3\2\2\u0719\u071a\5\u0104\u0083\2\u071a\u071b"+
		"\7\4\2\2\u071b\u071e\3\2\2\2\u071c\u071e\5\u00e6t\2\u071d\u0712\3\2\2"+
		"\2\u071d\u071c\3\2\2\2\u071e\u00e5\3\2\2\2\u071f\u0720\7\3\2\2\u0720\u0721"+
		"\5\u00e8u\2\u0721\u0722\7\4\2\2\u0722\u0723\5\u00e6t\2\u0723\u0726\3\2"+
		"\2\2\u0724\u0726\5\u00eav\2\u0725\u071f\3\2\2\2\u0725\u0724\3\2\2\2\u0726"+
		"\u00e7\3\2\2\2\u0727\u072c\5\u00b6\\\2\u0728\u0729\5\u00b6\\\2\u0729\u072a"+
		"\5\u00e4s\2\u072a\u072c\3\2\2\2\u072b\u0727\3\2\2\2\u072b\u0728\3\2\2"+
		"\2\u072c\u00e9\3\2\2\2\u072d\u0736\5\u00ecw\2\u072e\u0736\5\u00f0y\2\u072f"+
		"\u0736\5\u00f2z\2\u0730\u0736\5\u00eex\2\u0731\u0736\5\u0100\u0081\2\u0732"+
		"\u0736\5\u00f6|\2\u0733\u0736\5\64\33\2\u0734\u0736\5\u00fe\u0080\2\u0735"+
		"\u072d\3\2\2\2\u0735\u072e\3\2\2\2\u0735\u072f\3\2\2\2\u0735\u0730\3\2"+
		"\2\2\u0735\u0731\3\2\2\2\u0735\u0732\3\2\2\2\u0735\u0733\3\2\2\2\u0735"+
		"\u0734\3\2\2\2\u0736\u00eb\3\2\2\2\u0737\u0738\7\20\2\2\u0738\u0739\5"+
		"\u00c2b\2\u0739\u00ed\3\2\2\2\u073a\u073c\7\67\2\2\u073b\u073a\3\2\2\2"+
		"\u073b\u073c\3\2\2\2\u073c\u073d\3\2\2\2\u073d\u073f\7b\2\2\u073e\u0740"+
		"\7@\2\2\u073f\u073e\3\2\2\2\u073f\u0740\3\2\2\2\u0740\u0742\3\2\2\2\u0741"+
		"\u0743\7{\2\2\u0742\u0741\3\2\2\2\u0742\u0743\3\2\2\2\u0743\u0745\3\2"+
		"\2\2\u0744\u0746\7@\2\2\u0745\u0744\3\2\2\2\u0745\u0746\3\2\2\2\u0746"+
		"\u0747\3\2\2\2\u0747\u0749\5\u00b6\\\2\u0748\u074a\7@\2\2\u0749\u0748"+
		"\3\2\2\2\u0749\u074a\3\2\2\2\u074a\u074c\3\2\2\2\u074b\u074d\7{\2\2\u074c"+
		"\u074b\3\2\2\2\u074c\u074d\3\2\2\2\u074d\u074f\3\2\2\2\u074e\u0750\7@"+
		"\2\2\u074f\u074e\3\2\2\2\u074f\u0750\3\2\2\2\u0750\u0751\3\2\2\2\u0751"+
		"\u0753\7\33\2\2\u0752\u0754\5\u00ceh\2\u0753\u0752\3\2\2\2\u0753\u0754"+
		"\3\2\2\2\u0754\u0755\3\2\2\2\u0755\u0756\7\34\2\2\u0756\u0775\3\2\2\2"+
		"\u0757\u0759\7\67\2\2\u0758\u0757\3\2\2\2\u0758\u0759\3\2\2\2\u0759\u075a"+
		"\3\2\2\2\u075a\u075c\7b\2\2\u075b\u075d\7@\2\2\u075c\u075b\3\2\2\2\u075c"+
		"\u075d\3\2\2\2\u075d\u075f\3\2\2\2\u075e\u0760\7{\2\2\u075f\u075e\3\2"+
		"\2\2\u075f\u0760\3\2\2\2\u0760\u0762\3\2\2\2\u0761\u0763\7@\2\2\u0762"+
		"\u0761\3\2\2\2\u0762\u0763\3\2\2\2\u0763\u0764\3\2\2\2\u0764\u0766\5\u00b6"+
		"\\\2\u0765\u0767\7@\2\2\u0766\u0765\3\2\2\2\u0766\u0767\3\2\2\2\u0767"+
		"\u0769\3\2\2\2\u0768\u076a\7{\2\2\u0769\u0768\3\2\2\2\u0769\u076a\3\2"+
		"\2\2\u076a\u076c\3\2\2\2\u076b\u076d\7@\2\2\u076c\u076b\3\2\2\2\u076c"+
		"\u076d\3\2\2\2\u076d\u076e\3\2\2\2\u076e\u0770\7\3\2\2\u076f\u0771\5\u00ca"+
		"f\2\u0770\u076f\3\2\2\2\u0770\u0771\3\2\2\2\u0771\u0772\3\2\2\2\u0772"+
		"\u0773\7\4\2\2\u0773\u0775\3\2\2\2\u0774\u073b\3\2\2\2\u0774\u0758\3\2"+
		"\2\2\u0775\u00ef\3\2\2\2\u0776\u0778\5N(\2\u0777\u0779\7@\2\2\u0778\u0777"+
		"\3\2\2\2\u0778\u0779\3\2\2\2\u0779\u077b\3\2\2\2\u077a\u077c\7{\2\2\u077b"+
		"\u077a\3\2\2\2\u077b\u077c\3\2\2\2\u077c\u077e\3\2\2\2\u077d\u077f\7@"+
		"\2\2\u077e\u077d\3\2\2\2\u077e\u077f\3\2\2\2\u077f\u0780\3\2\2\2\u0780"+
		"\u0781\5\u00e6t\2\u0781\u00f1\3\2\2\2\u0782\u0784\5\u00f4{\2\u0783\u0785"+
		"\7@\2\2\u0784\u0783\3\2\2\2\u0784\u0785\3\2\2\2\u0785\u0787\3\2\2\2\u0786"+
		"\u0788\7{\2\2\u0787\u0786\3\2\2\2\u0787\u0788\3\2\2\2\u0788\u078a\3\2"+
		"\2\2\u0789\u078b\7@\2\2\u078a\u0789\3\2\2\2\u078a\u078b\3\2\2\2\u078b"+
		"\u078c\3\2\2\2\u078c\u078d\7\3\2\2\u078d\u078e\5\u00f8}\2\u078e\u078f"+
		"\7\4\2\2\u078f\u079d\3\2\2\2\u0790\u0792\5\u00f4{\2\u0791\u0793\7@\2\2"+
		"\u0792\u0791\3\2\2\2\u0792\u0793\3\2\2\2\u0793\u0795\3\2\2\2\u0794\u0796"+
		"\7{\2\2\u0795\u0794\3\2\2\2\u0795\u0796\3\2\2\2\u0796\u0798\3\2\2\2\u0797"+
		"\u0799\7@\2\2\u0798\u0797\3\2\2\2\u0798\u0799\3\2\2\2\u0799\u079a\3\2"+
		"\2\2\u079a\u079b\5\u00fa~\2\u079b\u079d\3\2\2\2\u079c\u0782\3\2\2\2\u079c"+
		"\u0790\3\2\2\2\u079d\u00f3\3\2\2\2\u079e\u079f\7<\2\2\u079f\u00f5\3\2"+
		"\2\2\u07a0\u07a2\7=\2\2\u07a1\u07a3\7@\2\2\u07a2\u07a1\3\2\2\2\u07a2\u07a3"+
		"\3\2\2\2\u07a3\u07a5\3\2\2\2\u07a4\u07a6\7{\2\2\u07a5\u07a4\3\2\2\2\u07a5"+
		"\u07a6\3\2\2\2\u07a6\u07a8\3\2\2\2\u07a7\u07a9\7@\2\2\u07a8\u07a7\3\2"+
		"\2\2\u07a8\u07a9\3\2\2\2\u07a9\u07aa\3\2\2\2\u07aa\u07ab\7\3\2\2\u07ab"+
		"\u07ac\5\u00caf\2\u07ac\u07ad\7\4\2\2\u07ad\u07ba\3\2\2\2\u07ae\u07b0"+
		"\7=\2\2\u07af\u07b1\7@\2\2\u07b0\u07af\3\2\2\2\u07b0\u07b1\3\2\2\2\u07b1"+
		"\u07b3\3\2\2\2\u07b2\u07b4\7{\2\2\u07b3\u07b2\3\2\2\2\u07b3\u07b4\3\2"+
		"\2\2\u07b4\u07b6\3\2\2\2\u07b5\u07b7\7@\2\2\u07b6\u07b5\3\2\2\2\u07b6"+
		"\u07b7\3\2\2\2\u07b7\u07b8\3\2\2\2\u07b8\u07ba\5\u00caf\2\u07b9\u07a0"+
		"\3\2\2\2\u07b9\u07ae\3\2\2\2\u07ba\u00f7\3\2\2\2\u07bb\u07c8\5\u00b6\\"+
		"\2\u07bc\u07be\7@\2\2\u07bd\u07bc\3\2\2\2\u07bd\u07be\3\2\2\2\u07be\u07c0"+
		"\3\2\2\2\u07bf\u07c1\7{\2\2\u07c0\u07bf\3\2\2\2\u07c0\u07c1\3\2\2\2\u07c1"+
		"\u07c3\3\2\2\2\u07c2\u07c4\7@\2\2\u07c3\u07c2\3\2\2\2\u07c3\u07c4\3\2"+
		"\2\2\u07c4\u07c5\3\2\2\2\u07c5\u07c7\5V,\2\u07c6\u07bd\3\2\2\2\u07c7\u07ca"+
		"\3\2\2\2\u07c8\u07c6\3\2\2\2\u07c8\u07c9\3\2\2\2\u07c9\u00f9\3\2\2\2\u07ca"+
		"\u07c8\3\2\2\2\u07cb\u07cc\5\u00eav\2\u07cc\u00fb\3\2\2\2\u07cd\u07ce"+
		"\t\30\2\2\u07ce\u00fd\3\2\2\2\u07cf\u07d3\7U\2\2\u07d0\u07d2\t\31\2\2"+
		"\u07d1\u07d0\3\2\2\2\u07d2\u07d5\3\2\2\2\u07d3\u07d1\3\2\2\2\u07d3\u07d4"+
		"\3\2\2\2\u07d4\u07d7\3\2\2\2\u07d5\u07d3\3\2\2\2\u07d6\u07d8\7@\2\2\u07d7"+
		"\u07d6\3\2\2\2\u07d7\u07d8\3\2\2\2\u07d8\u07d9\3\2\2\2\u07d9\u07db\7\3"+
		"\2\2\u07da\u07dc\7@\2\2\u07db\u07da\3\2\2\2\u07db\u07dc\3\2\2\2\u07dc"+
		"\u07e1\3\2\2\2\u07dd\u07df\7}\2\2\u07de\u07e0\7@\2\2\u07df\u07de\3\2\2"+
		"\2\u07df\u07e0\3\2\2\2\u07e0\u07e2\3\2\2\2\u07e1\u07dd\3\2\2\2\u07e2\u07e3"+
		"\3\2\2\2\u07e3\u07e1\3\2\2\2\u07e3\u07e4\3\2\2\2\u07e4\u07fb\3\2\2\2\u07e5"+
		"\u07f7\t\32\2\2\u07e6\u07e8\7}\2\2\u07e7\u07e9\7@\2\2\u07e8\u07e7\3\2"+
		"\2\2\u07e8\u07e9\3\2\2\2\u07e9\u07f5\3\2\2\2\u07ea\u07eb\7\3\2\2\u07eb"+
		"\u07f0\5\u00c2b\2\u07ec\u07ed\7\17\2\2\u07ed\u07ef\5\u00c2b\2\u07ee\u07ec"+
		"\3\2\2\2\u07ef\u07f2\3\2\2\2\u07f0\u07ee\3\2\2\2\u07f0\u07f1\3\2\2\2\u07f1"+
		"\u07f3\3\2\2\2\u07f2\u07f0\3\2\2\2\u07f3\u07f4\7\4\2\2\u07f4\u07f6\3\2"+
		"\2\2\u07f5\u07ea\3\2\2\2\u07f5\u07f6\3\2\2\2\u07f6\u07f8\3\2\2\2\u07f7"+
		"\u07e6\3\2\2\2\u07f7\u07f8\3\2\2\2\u07f8\u07fa\3\2\2\2\u07f9\u07e5\3\2"+
		"\2\2\u07fa\u07fd\3\2\2\2\u07fb\u07f9\3\2\2\2\u07fb\u07fc\3\2\2\2\u07fc"+
		"\u07fe\3\2\2\2\u07fd\u07fb\3\2\2\2\u07fe\u07ff\7\4\2\2\u07ff\u00ff\3\2"+
		"\2\2\u0800\u0802\b\u0081\1\2\u0801\u0803\5\u00b6\\\2\u0802\u0801\3\2\2"+
		"\2\u0802\u0803\3\2\2\2\u0803\u0804\3\2\2\2\u0804\u0819\5\u0102\u0082\2"+
		"\u0805\u0819\5\u0108\u0085\2\u0806\u0808\5V,\2\u0807\u0806\3\2\2\2\u0807"+
		"\u0808\3\2\2\2\u0808\u0809\3\2\2\2\u0809\u080b\5\u00fc\177\2\u080a\u080c"+
		"\7@\2\2\u080b\u080a\3\2\2\2\u080b\u080c\3\2\2\2\u080c\u080e\3\2\2\2\u080d"+
		"\u080f\7{\2\2\u080e\u080d\3\2\2\2\u080e\u080f\3\2\2\2\u080f\u0811\3\2"+
		"\2\2\u0810\u0812\7@\2\2\u0811\u0810\3\2\2\2\u0811\u0812\3\2\2\2\u0812"+
		"\u0814\3\2\2\2\u0813\u0815\5V,\2\u0814\u0813\3\2\2\2\u0814\u0815\3\2\2"+
		"\2\u0815\u0816\3\2\2\2\u0816\u0817\5\u0108\u0085\2\u0817\u0819\3\2\2\2"+
		"\u0818\u0800\3\2\2\2\u0818\u0805\3\2\2\2\u0818\u0807\3\2\2\2\u0819\u0862"+
		"\3\2\2\2\u081a\u081c\f\n\2\2\u081b\u081d\7@\2\2\u081c\u081b\3\2\2\2\u081c"+
		"\u081d\3\2\2\2\u081d\u081f\3\2\2\2\u081e\u0820\7{\2\2\u081f\u081e\3\2"+
		"\2\2\u081f\u0820\3\2\2\2\u0820\u0822\3\2\2\2\u0821\u0823\7@\2\2\u0822"+
		"\u0821\3\2\2\2\u0822\u0823\3\2\2\2\u0823\u0824\3\2\2\2\u0824\u0826\7\33"+
		"\2\2\u0825\u0827\5\u00caf\2\u0826\u0825\3\2\2\2\u0826\u0827\3\2\2\2\u0827"+
		"\u0828\3\2\2\2\u0828\u0861\7\34\2\2\u0829\u082b\f\t\2\2\u082a\u082c\7"+
		"@\2\2\u082b\u082a\3\2\2\2\u082b\u082c\3\2\2\2\u082c\u082e\3\2\2\2\u082d"+
		"\u082f\7{\2\2\u082e\u082d\3\2\2\2\u082e\u082f\3\2\2\2\u082f\u0831\3\2"+
		"\2\2\u0830\u0832\7@\2\2\u0831\u0830\3\2\2\2\u0831\u0832\3\2\2\2\u0832"+
		"\u0833\3\2\2\2\u0833\u0834\7\3\2\2\u0834\u0835\5\u0104\u0083\2\u0835\u0836"+
		"\7\4\2\2\u0836\u0861\3\2\2\2\u0837\u0838\f\b\2\2\u0838\u083a\7?\2\2\u0839"+
		"\u083b\7@\2\2\u083a\u0839\3\2\2\2\u083a\u083b\3\2\2\2\u083b\u083d\3\2"+
		"\2\2\u083c\u083e\7{\2\2\u083d\u083c\3\2\2\2\u083d\u083e\3\2\2\2\u083e"+
		"\u0840\3\2\2\2\u083f\u0841\7@\2\2\u0840\u083f\3\2\2\2\u0840\u0841\3\2"+
		"\2\2\u0841\u0843\3\2\2\2\u0842\u0844\7`\2\2\u0843\u0842\3\2\2\2\u0843"+
		"\u0844\3\2\2\2\u0844\u0845\3\2\2\2\u0845\u0861\5\u00c2b\2\u0846\u0847"+
		"\f\7\2\2\u0847\u0849\7\65\2\2\u0848\u084a\7@\2\2\u0849\u0848\3\2\2\2\u0849"+
		"\u084a\3\2\2\2\u084a\u084c\3\2\2\2\u084b\u084d\7{\2\2\u084c\u084b\3\2"+
		"\2\2\u084c\u084d\3\2\2\2\u084d\u084f\3\2\2\2\u084e\u0850\7@\2\2\u084f"+
		"\u084e\3\2\2\2\u084f\u0850\3\2\2\2\u0850\u0852\3\2\2\2\u0851\u0853\7`"+
		"\2\2\u0852\u0851\3\2\2\2\u0852\u0853\3\2\2\2\u0853\u0854\3\2\2\2\u0854"+
		"\u0861\5\u00c2b\2\u0855\u0857\f\6\2\2\u0856\u0858\7@\2\2\u0857\u0856\3"+
		"\2\2\2\u0857\u0858\3\2\2\2\u0858\u085a\3\2\2\2\u0859\u085b\7{\2\2\u085a"+
		"\u0859\3\2\2\2\u085a\u085b\3\2\2\2\u085b\u085d\3\2\2\2\u085c\u085e\7@"+
		"\2\2\u085d\u085c\3\2\2\2\u085d\u085e\3\2\2\2\u085e\u085f\3\2\2\2\u085f"+
		"\u0861\5\u00fc\177\2\u0860\u081a\3\2\2\2\u0860\u0829\3\2\2\2\u0860\u0837"+
		"\3\2\2\2\u0860\u0846\3\2\2\2\u0860\u0855\3\2\2\2\u0861\u0864\3\2\2\2\u0862"+
		"\u0860\3\2\2\2\u0862\u0863\3\2\2\2\u0863\u0101\3\2\2\2\u0864\u0862\3\2"+
		"\2\2\u0865\u0867\7u\2\2\u0866\u0868\7@\2\2\u0867\u0866\3\2\2\2\u0867\u0868"+
		"\3\2\2\2\u0868\u086f\3\2\2\2\u0869\u086b\7{\2\2\u086a\u086c\7@\2\2\u086b"+
		"\u086a\3\2\2\2\u086b\u086c\3\2\2\2\u086c\u086e\3\2\2\2\u086d\u0869\3\2"+
		"\2\2\u086e\u0871\3\2\2\2\u086f\u086d\3\2\2\2\u086f\u0870\3\2\2\2\u0870"+
		"\u0873\3\2\2\2\u0871\u086f\3\2\2\2\u0872\u0874\5\u0104\u0083\2\u0873\u0872"+
		"\3\2\2\2\u0873\u0874\3\2\2\2\u0874\u0876\3\2\2\2\u0875\u0877\7@\2\2\u0876"+
		"\u0875\3\2\2\2\u0876\u0877\3\2\2\2\u0877\u087e\3\2\2\2\u0878\u087a\7{"+
		"\2\2\u0879\u087b\7@\2\2\u087a\u0879\3\2\2\2\u087a\u087b\3\2\2\2\u087b"+
		"\u087d\3\2\2\2\u087c\u0878\3\2\2\2\u087d\u0880\3\2\2\2\u087e\u087c\3\2"+
		"\2\2\u087e\u087f\3\2\2\2\u087f\u0881\3\2\2\2\u0880\u087e\3\2\2\2\u0881"+
		"\u0882\7v\2\2\u0882\u0103\3\2\2\2\u0883\u0885\7@\2\2\u0884\u0883\3\2\2"+
		"\2\u0884\u0885\3\2\2\2\u0885\u0887\3\2\2\2\u0886\u0888\7{\2\2\u0887\u0886"+
		"\3\2\2\2\u0887\u0888\3\2\2\2\u0888\u088a\3\2\2\2\u0889\u088b\7@\2\2\u088a"+
		"\u0889\3\2\2\2\u088a\u088b\3\2\2\2\u088b\u088c\3\2\2\2\u088c\u088e\5\u0106"+
		"\u0084\2\u088d\u0884\3\2\2\2\u088d\u088e\3\2\2\2\u088e\u0890\3\2\2\2\u088f"+
		"\u0891\7@\2\2\u0890\u088f\3\2\2\2\u0890\u0891\3\2\2\2\u0891\u0893\3\2"+
		"\2\2\u0892\u0894\7{\2\2\u0893\u0892\3\2\2\2\u0893\u0894\3\2\2\2\u0894"+
		"\u0896\3\2\2\2\u0895\u0897\7@\2\2\u0896\u0895\3\2\2\2\u0896\u0897\3\2"+
		"\2\2\u0897\u08aa\3\2\2\2\u0898\u089a\7\17\2\2\u0899\u0898\3\2\2\2\u0899"+
		"\u089a\3\2\2\2\u089a\u089c\3\2\2\2\u089b\u089d\7@\2\2\u089c\u089b\3\2"+
		"\2\2\u089c\u089d\3\2\2\2\u089d\u08a4\3\2\2\2\u089e\u08a0\7{\2\2\u089f"+
		"\u08a1\7@\2\2\u08a0\u089f\3\2\2\2\u08a0\u08a1\3\2\2\2\u08a1\u08a3\3\2"+
		"\2\2\u08a2\u089e\3\2\2\2\u08a3\u08a6\3\2\2\2\u08a4\u08a2\3\2\2\2\u08a4"+
		"\u08a5\3\2\2\2\u08a5\u08a7\3\2\2\2\u08a6\u08a4\3\2\2\2\u08a7\u08a9\5\u0106"+
		"\u0084\2\u08a8\u0899\3\2\2\2\u08a9\u08ac\3\2\2\2\u08aa\u08a8\3\2\2\2\u08aa"+
		"\u08ab\3\2\2\2\u08ab\u08ae\3\2\2\2\u08ac\u08aa\3\2\2\2\u08ad\u08af\7\17"+
		"\2\2\u08ae\u08ad\3\2\2\2\u08ae\u08af\3\2\2\2\u08af\u08b5\3\2\2\2\u08b0"+
		"\u08b2\7P\2\2\u08b1\u08b3\5V,\2\u08b2\u08b1\3\2\2\2\u08b2\u08b3\3\2\2"+
		"\2\u08b3\u08b5\3\2\2\2\u08b4\u088d\3\2\2\2\u08b4\u08b0\3\2\2\2\u08b5\u0105"+
		"\3\2\2\2\u08b6\u08b7\5\u00ccg\2\u08b7\u0107\3\2\2\2\u08b8\u08ba\7?\2\2"+
		"\u08b9\u08b8\3\2\2\2\u08b9\u08ba\3\2\2\2\u08ba\u08bb\3\2\2\2\u08bb\u08c3"+
		"\5\u00c2b\2\u08bc\u08c3\5V,\2\u08bd\u08c3\5R*\2\u08be\u08bf\7\3\2\2\u08bf"+
		"\u08c0\5\u00caf\2\u08c0\u08c1\7\4\2\2\u08c1\u08c3\3\2\2\2\u08c2\u08b9"+
		"\3\2\2\2\u08c2\u08bc\3\2\2\2\u08c2\u08bd\3\2\2\2\u08c2\u08be\3\2\2\2\u08c3"+
		"\u0109\3\2\2\2\u08c4\u08c5\7\5\2\2\u08c5\u010b\3\2\2\2\u08c6\u08c7\5\u010e"+
		"\u0088\2\u08c7\u08c9\7\3\2\2\u08c8\u08ca\5\u00caf\2\u08c9\u08c8\3\2\2"+
		"\2\u08c9\u08ca\3\2\2\2\u08ca\u08cb\3\2\2\2\u08cb\u08cc\7\4\2\2\u08cc\u08d9"+
		"\3\2\2\2\u08cd\u08cf\5\u010e\u0088\2\u08ce\u08d0\7@\2\2\u08cf\u08ce\3"+
		"\2\2\2\u08cf\u08d0\3\2\2\2\u08d0\u08d1\3\2\2\2\u08d1\u08d3\7!\2\2\u08d2"+
		"\u08d4\7@\2\2\u08d3\u08d2\3\2\2\2\u08d3\u08d4\3\2\2\2\u08d4\u08d5\3\2"+
		"\2\2\u08d5\u08d6\5\u0106\u0084\2\u08d6\u08d9\3\2\2\2\u08d7\u08d9\5\u010e"+
		"\u0088\2\u08d8\u08c6\3\2\2\2\u08d8\u08cd\3\2\2\2\u08d8\u08d7\3\2\2\2\u08d9"+
		"\u010d\3\2\2\2\u08da\u08dc\5\u00c6d\2\u08db\u08da\3\2\2\2\u08db\u08dc"+
		"\3\2\2\2\u08dc\u08dd\3\2\2\2\u08dd\u08df\5\u00c2b\2\u08de\u08e0\5\u0110"+
		"\u0089\2\u08df\u08de\3\2\2\2\u08df\u08e0\3\2\2\2\u08e0\u010f\3\2\2\2\u08e1"+
		"\u08e3\7\33\2\2\u08e2\u08e4\5\u00ceh\2\u08e3\u08e2\3\2\2\2\u08e3\u08e4"+
		"\3\2\2\2\u08e4\u08e5\3\2\2\2\u08e5\u08e8\7\34\2\2\u08e6\u08e8\5\u00bc"+
		"_\2\u08e7\u08e1\3\2\2\2\u08e7\u08e6\3\2\2\2\u08e8\u0111\3\2\2\2\u01b7"+
		"\u0115\u0124\u0131\u0134\u0137\u013c\u0140\u0148\u014c\u0153\u0157\u015a"+
		"\u015d\u0161\u0164\u0167\u016b\u0171\u0175\u0179\u017b\u0181\u018d\u0192"+
		"\u0195\u0198\u019e\u01a6\u01ac\u01b2\u01c6\u01d1\u01d9\u01e3\u01ec\u01ef"+
		"\u01f5\u01fa\u01fe\u0203\u0206\u020e\u0211\u0215\u021b\u021f\u0223\u0226"+
		"\u022d\u0231\u0237\u023e\u0242\u0249\u0254\u025c\u0262\u0268\u026f\u0276"+
		"\u028a\u028e\u0295\u029b\u02a0\u02b1\u02b7\u02bd\u02c2\u02c6\u02d1\u02fb"+
		"\u030f\u0311\u032d\u0334\u0339\u033d\u0340\u0343\u0347\u0353\u0356\u035a"+
		"\u035c\u0360\u0364\u0367\u036a\u036d\u0372\u0376\u0379\u037c\u0380\u0386"+
		"\u038a\u0391\u0395\u039a\u039c\u03a0\u03a3\u03a6\u03aa\u03ae\u03b2\u03b6"+
		"\u03ba\u03bf\u03c4\u03c8\u03cc\u03d2\u03d7\u03dc\u03df\u03e2\u03e6\u03e8"+
		"\u03eb\u03ee\u03f3\u03f6\u03f9\u03fe\u0403\u0406\u0409\u040c\u0412\u0415"+
		"\u041c\u041f\u042a\u0431\u0437\u0442\u044c\u0455\u045a\u0460\u0464\u0468"+
		"\u046a\u046d\u0474\u0476\u047b\u047f\u0484\u0488\u048c\u048f\u0495\u0497"+
		"\u049b\u049d\u04a1\u04a3\u04a7\u04aa\u04ad\u04af\u04b4\u04b8\u04bb\u04bf"+
		"\u04c1\u04c4\u04ca\u04cd\u04d1\u04d4\u04d8\u04df\u04e2\u04e5\u04e9\u04ed"+
		"\u04f2\u04f6\u04f9\u04ff\u0502\u0505\u0512\u0517\u0519\u051c\u0522\u0526"+
		"\u052a\u052e\u0532\u0536\u053a\u053e\u054b\u054f\u0553\u0555\u0559\u055d"+
		"\u0561\u0565\u0569\u056d\u0571\u0573\u0575\u0579\u0582\u0587\u058a\u058d"+
		"\u0591\u0596\u0599\u05a0\u05a2\u05a5\u05ac\u05b2\u05b8\u05bc\u05c5\u05c9"+
		"\u05cc\u05cf\u05d3\u05d6\u05d9\u05dc\u05e2\u05e7\u05ea\u05ed\u05f1\u05f4"+
		"\u05f7\u05fb\u0600\u0603\u0606\u060a\u060d\u0610\u0614\u0617\u061a\u061e"+
		"\u0621\u0624\u0628\u062c\u062f\u0632\u0636\u0639\u063c";
	private static final String _serializedATNSegment1 =
		"\u063f\u0643\u0646\u0649\u064d\u0650\u0653\u0656\u065a\u065d\u0660\u0664"+
		"\u0667\u066a\u066d\u0671\u0674\u0677\u067b\u067e\u0681\u0684\u0688\u068b"+
		"\u068e\u0692\u0695\u0698\u069b\u069f\u06a2\u06a5\u06a9\u06ac\u06af\u06b3"+
		"\u06b7\u06ba\u06bd\u06c1\u06c4\u06c7\u06cb\u06cf\u06d2\u06d5\u06d9\u06dc"+
		"\u06df\u06e2\u06e6\u06e9\u06ec\u06f0\u06f3\u06f6\u06f9\u06fd\u0700\u0703"+
		"\u0707\u070a\u070d\u0710\u0715\u071d\u0725\u072b\u0735\u073b\u073f\u0742"+
		"\u0745\u0749\u074c\u074f\u0753\u0758\u075c\u075f\u0762\u0766\u0769\u076c"+
		"\u0770\u0774\u0778\u077b\u077e\u0784\u0787\u078a\u0792\u0795\u0798\u079c"+
		"\u07a2\u07a5\u07a8\u07b0\u07b3\u07b6\u07b9\u07bd\u07c0\u07c3\u07c8\u07d3"+
		"\u07d7\u07db\u07df\u07e3\u07e8\u07f0\u07f5\u07f7\u07fb\u0802\u0807\u080b"+
		"\u080e\u0811\u0814\u0818\u081c\u081f\u0822\u0826\u082b\u082e\u0831\u083a"+
		"\u083d\u0840\u0843\u0849\u084c\u084f\u0852\u0857\u085a\u085d\u0860\u0862"+
		"\u0867\u086b\u086f\u0873\u0876\u087a\u087e\u0884\u0887\u088a\u088d\u0890"+
		"\u0893\u0896\u0899\u089c\u08a0\u08a4\u08aa\u08ae\u08b2\u08b4\u08b9\u08c2"+
		"\u08c9\u08cf\u08d3\u08d8\u08db\u08df\u08e3\u08e7";
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