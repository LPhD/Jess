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
		HEX_FLOAT=120, FLOATING_POINT_LITERAL=121, COMMENT=122, CHAR=123, STRING=124, 
		WHITESPACE=125, OTHER=126;
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
		"OCTAL_LITERAL", "HEX_FLOAT", "FLOATING_POINT_LITERAL", "COMMENT", "CHAR", 
		"STRING", "WHITESPACE", "OTHER"
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << NEWLINE) | (1L << ESCAPE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ELLIPSIS - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (ASM - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (HEX_FLOAT - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (WHITESPACE - 64)) | (1L << (OTHER - 64)))) != 0)) {
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
				case HEX_FLOAT:
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
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
			case HEX_FLOAT:
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
		enterRule(_localctx, 38, RULE_pre_define);
		int _la;
		try {
			setState(473);
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
				setState(469);
				match(PRE_DEFINE);
				setState(470);
				pre_macro_identifier();
				setState(471);
				pre_macro();
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
			setState(475);
			match(PRE_UNDEF);
			setState(476);
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
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				identifier();
				setState(483);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(479);
					match(T__0);
					setState(480);
					pre_macro_parameters();
					setState(481);
					match(T__1);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				keyword();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(486);
				match(END_TEST);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(487);
				match(T__4);
				setState(492);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(488);
					match(T__0);
					setState(489);
					pre_macro_parameters();
					setState(490);
					match(T__1);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(494);
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
			setState(497);
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
			case T__1:
			case T__12:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(503);
				match(T__12);
				setState(506);
				switch (_input.LA(1)) {
				case T__8:
				case T__9:
				case T__10:
				case NEW:
				case PRE_PRAGMA_KEYWORDS:
				case ALPHA_NUMERIC:
					{
					setState(504);
					identifier();
					}
					break;
				case ELLIPSIS:
					{
					setState(505);
					match(ELLIPSIS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(512);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public TerminalNode EOF() { return getToken(FunctionParser.EOF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		int _la;
		try {
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(516); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(516);
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
					case HEX_FLOAT:
					case FLOATING_POINT_LITERAL:
					case CHAR:
					case STRING:
						{
						setState(513);
						expr();
						}
						break;
					case ESCAPE:
						{
						setState(514);
						match(ESCAPE);
						setState(515);
						match(NEWLINE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(518); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60) | (1L << ESCAPE))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0) );
				setState(520);
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
			setState(525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(524);
				pre_macro_identifier();
				}
				break;
			}
			setState(527);
			pre_macro_identifier();
			setState(528);
			match(T__0);
			setState(557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				{
				setState(533);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(529);
					expr();
					}
					break;
				case 2:
					{
					setState(530);
					type_name();
					}
					break;
				case 3:
					{
					setState(531);
					relational_operator();
					}
					break;
				case 4:
					{
					setState(532);
					equality_operator();
					}
					break;
				}
				setState(536);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(535);
					match(NEWLINE);
					}
				}

				}
				setState(550);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(538);
						match(T__12);
						setState(540);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(539);
							match(NEWLINE);
							}
						}

						setState(546);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
						case 1:
							{
							setState(542);
							expr();
							}
							break;
						case 2:
							{
							setState(543);
							type_name();
							}
							break;
						case 3:
							{
							setState(544);
							relational_operator();
							}
							break;
						case 4:
							{
							setState(545);
							equality_operator();
							}
							break;
						}
						}
						} 
					}
					setState(552);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				setState(554);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(553);
					match(T__12);
					}
				}

				}
				break;
			case 2:
				{
				setState(556);
				match(VOID);
				}
				break;
			}
			setState(559);
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
			setState(564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(561);
				match(PRE_DIAGNOSTIC);
				setState(562);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(563);
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
			setState(585);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(566);
				match(PRE_OTHER);
				setState(568);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(567);
					match(STRING);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				match(PRE_ATTRIBUTE);
				setState(571);
				match(T__0);
				setState(572);
				match(T__0);
				setState(574);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(573);
					attributeList();
					}
				}

				setState(576);
				match(T__1);
				setState(577);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(578);
				match(PRE_ATTRIBUTE);
				setState(579);
				match(T__0);
				setState(581);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(580);
					attributeList();
					}
				}

				setState(583);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(584);
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
			setState(587);
			attribute();
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(588);
				match(T__12);
				setState(589);
				attribute();
				}
				}
				setState(594);
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
			setState(623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(595);
				pre_macro_identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(596);
				pre_macro_identifier();
				setState(597);
				match(T__0);
				setState(598);
				identifier();
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(599);
					match(T__12);
					setState(600);
					expr();
					}
					}
					setState(605);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(606);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(608);
				pre_macro_identifier();
				setState(609);
				match(T__0);
				setState(611);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(610);
					expr();
					}
				}

				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(613);
					match(T__12);
					setState(614);
					expr();
					}
					}
					setState(619);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(620);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(622);
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
			setState(630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(625);
				match(PRE_INCLUDE);
				setState(626);
				pre_include_local_file();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(627);
				match(PRE_INCLUDE);
				setState(628);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(629);
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
			setState(637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(632);
				match(PRE_INCLUDE_NEXT);
				setState(633);
				pre_include_local_file();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(634);
				match(PRE_INCLUDE_NEXT);
				setState(635);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(636);
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
			setState(639);
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
			setState(641);
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
			setState(657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(643);
				match(PRE_LINE);
				setState(644);
				match(DECIMAL_LITERAL);
				setState(645);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(646);
				match(PRE_LINE);
				setState(647);
				match(DECIMAL_LITERAL);
				setState(648);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(649);
				match(PRE_LINE);
				setState(650);
				pre_macro_identifier();
				setState(651);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(653);
				match(PRE_LINE);
				setState(654);
				pre_macro_identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(655);
				match(PRE_LINE);
				setState(656);
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
			setState(679);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
				match(PRE_PRAGMA);
				setState(661);
				_la = _input.LA(1);
				if (_la==PRE_GCC) {
					{
					setState(660);
					match(PRE_GCC);
					}
				}

				setState(663);
				match(PRE_PRAGMA_KEYWORDS);
				setState(664);
				match(STRING);
				 preProcFindMacroEnd(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(666);
				match(PRE_PRAGMA);
				setState(668);
				_la = _input.LA(1);
				if (_la==PRE_GCC) {
					{
					setState(667);
					match(PRE_GCC);
					}
				}

				setState(670);
				match(PRE_PRAGMA_KEYWORDS);
				setState(674);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(671);
						identifier();
						}
						} 
					}
					setState(676);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(677);
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
			setState(681);
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
			setState(683);
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
			setState(685);
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
			setState(687);
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
		enterRule(_localctx, 80, RULE_constant);
		try {
			int _alt;
			setState(718);
			switch (_input.LA(1)) {
			case HEX_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(689);
				match(HEX_LITERAL);
				}
				break;
			case OCTAL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(690);
				match(OCTAL_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(691);
				match(DECIMAL_LITERAL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(711); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(692);
						match(STRING);
						setState(696);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(693);
								match(NEWLINE);
								}
								} 
							}
							setState(698);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
						}
						setState(702);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(699);
								match(COMMENT);
								}
								} 
							}
							setState(704);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
						}
						setState(708);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(705);
								match(NEWLINE);
								}
								} 
							}
							setState(710);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(713); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(715);
				match(CHAR);
				}
				break;
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(716);
				match(FLOATING_POINT_LITERAL);
				}
				break;
			case HEX_FLOAT:
				enterOuterAlt(_localctx, 7);
				{
				setState(717);
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
		enterRule(_localctx, 82, RULE_function_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
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
			setState(722);
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
			setState(724);
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
			setState(771);
			switch (_input.LA(1)) {
			case T__23:
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(726);
				_la = _input.LA(1);
				if ( !(_la==T__23 || _la==NEW) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(729);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(727);
					match(T__24);
					setState(728);
					match(T__25);
					}
				}

				}
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(731);
				match(T__15);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(732);
				match(T__16);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(733);
				match(T__14);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 5);
				{
				setState(734);
				match(T__26);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 6);
				{
				setState(735);
				match(T__27);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 7);
				{
				setState(736);
				match(T__28);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 8);
				{
				setState(737);
				match(T__13);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 9);
				{
				setState(738);
				match(T__29);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 10);
				{
				setState(739);
				match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 11);
				{
				setState(740);
				match(T__18);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 12);
				{
				setState(741);
				match(T__30);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 13);
				{
				setState(742);
				match(T__19);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 14);
				{
				setState(743);
				match(T__20);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 15);
				{
				setState(744);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 16);
				{
				setState(745);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 17);
				{
				setState(746);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 18);
				{
				setState(747);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 19);
				{
				setState(748);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 20);
				{
				setState(749);
				match(T__36);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 21);
				{
				setState(750);
				match(T__37);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 22);
				{
				setState(751);
				match(T__38);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 23);
				{
				setState(752);
				match(T__39);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 24);
				{
				setState(753);
				match(T__40);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 25);
				{
				setState(754);
				match(T__41);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 26);
				{
				setState(755);
				match(T__42);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 27);
				{
				setState(756);
				match(T__43);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 28);
				{
				setState(757);
				match(T__44);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 29);
				{
				setState(758);
				match(T__21);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 30);
				{
				setState(759);
				match(T__22);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 31);
				{
				setState(760);
				match(T__45);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 32);
				{
				setState(761);
				match(T__46);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 33);
				{
				setState(762);
				match(T__47);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 34);
				{
				setState(763);
				match(T__48);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 35);
				{
				setState(764);
				match(T__12);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 36);
				{
				setState(765);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 37);
				{
				setState(766);
				match(T__50);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 38);
				{
				setState(767);
				match(T__0);
				setState(768);
				match(T__1);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 39);
				{
				setState(769);
				match(T__24);
				setState(770);
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
			setState(773);
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
			setState(775);
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
			setState(777);
			match(TEMPLATE);
			setState(778);
			match(T__19);
			setState(779);
			template_param_list();
			setState(780);
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
			setState(791); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(791);
				switch (_input.LA(1)) {
				case T__19:
					{
					{
					setState(782);
					match(T__19);
					setState(783);
					template_param_list();
					setState(784);
					match(T__20);
					}
					}
					break;
				case T__0:
					{
					{
					setState(786);
					match(T__0);
					setState(787);
					template_param_list();
					setState(788);
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
				case HEX_FLOAT:
				case FLOATING_POINT_LITERAL:
				case COMMENT:
				case CHAR:
				case STRING:
				case WHITESPACE:
				case OTHER:
					{
					setState(790);
					no_angle_brackets_or_brackets();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(793); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << NEWLINE) | (1L << ESCAPE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ELLIPSIS - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (ASM - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (HEX_FLOAT - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (WHITESPACE - 64)) | (1L << (OTHER - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
			setState(795);
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
			setState(797);
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
			setState(799);
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
			setState(801);
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
			setState(803);
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
			setState(805);
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
			setState(807);
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
			setState(809);
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
			setState(811);
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
			setState(813);
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
			setState(815);
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
			setState(821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(817);
				asciiTab();
				}
				break;
			case 2:
				{
				setState(818);
				externC();
				}
				break;
			case 3:
				{
				setState(819);
				macroFunctionPointer();
				}
				break;
			case 4:
				{
				setState(820);
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
			setState(826); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(823);
					pre_macro_identifier();
					setState(824);
					match(T__12);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(828); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
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
			setState(830);
			match(EXTERN);
			setState(831);
			match(T__51);
			setState(833);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(832);
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
			setState(835);
			macroCall();
			setState(837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(836);
				match(NEWLINE);
				}
				break;
			}
			setState(840);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(839);
				pre_macro_identifier();
				}
				break;
			}
			setState(843);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(842);
				match(NEWLINE);
				}
			}

			setState(845);
			macroCall();
			setState(847);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(846);
				match(NEWLINE);
				}
			}

			setState(849);
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
			setState(851);
			match(T__4);
			setState(852);
			match(T__0);
			setState(853);
			function_name();
			setState(854);
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
			setState(856);
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
			setState(904);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(859);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(858);
					template_decl_start();
					}
				}

				setState(862);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(861);
					return_type();
					}
					break;
				}
				setState(868);
				_la = _input.LA(1);
				if (_la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(864);
					pre_other();
					setState(866);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(865);
						match(NEWLINE);
						}
					}

					}
				}

				setState(870);
				function_name();
				setState(872);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(871);
					match(NEWLINE);
					}
				}

				setState(874);
				function_param_list();
				setState(876);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(875);
					ctor_list();
					}
				}

				setState(879);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(878);
					match(NEWLINE);
					}
					break;
				}
				setState(882);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(881);
					match(COMMENT);
					}
				}

				setState(885);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(884);
					match(NEWLINE);
					}
				}

				setState(887);
				compound_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(890);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(889);
					return_type();
					}
					break;
				}
				setState(892);
				macroCall_asFunctionHeader();
				setState(894);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(893);
					match(NEWLINE);
					}
					break;
				}
				setState(897);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(896);
					match(COMMENT);
					}
				}

				setState(900);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(899);
					match(NEWLINE);
					}
				}

				setState(902);
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
			setState(906);
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
			setState(932);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(914);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(908);
						function_decl_specifiers();
						setState(910);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(909);
							match(NEWLINE);
							}
						}

						}
						} 
					}
					setState(916);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
				}
				setState(917);
				type_name();
				}
				setState(925);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13 || _la==T__14) {
					{
					{
					setState(919);
					ptr_operator();
					setState(921);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(920);
						match(NEWLINE);
						}
					}

					}
					}
					setState(927);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(928);
				macroCall();
				setState(930);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(929);
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
			setState(1008);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(934);
				match(T__0);
				setState(936);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(935);
					match(NEWLINE);
					}
					break;
				}
				setState(939);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(938);
					parameter_decl_clause();
					}
					break;
				}
				setState(942);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(941);
					match(NEWLINE);
					}
				}

				setState(944);
				match(T__1);
				setState(946);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(945);
					match(T__14);
					}
				}

				setState(954);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CV_QUALIFIER) {
					{
					{
					setState(948);
					match(CV_QUALIFIER);
					setState(950);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
					case 1:
						{
						setState(949);
						match(NEWLINE);
						}
						break;
					}
					}
					}
					setState(956);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(958);
				_la = _input.LA(1);
				if (_la==THROW) {
					{
					setState(957);
					exception_specification();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(960);
				match(T__0);
				setState(962);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(961);
					match(NEWLINE);
					}
				}

				setState(964);
				parameter_name();
				setState(972);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(965);
					match(T__12);
					setState(967);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(966);
						match(NEWLINE);
						}
					}

					setState(969);
					parameter_name();
					}
					}
					setState(974);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(976);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(975);
					match(NEWLINE);
					}
				}

				setState(978);
				match(T__1);
				setState(980);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(979);
					match(NEWLINE);
					}
				}

				setState(1004); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(982);
					type_name();
					setState(983);
					parameter_id();
					setState(991);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(984);
						match(T__12);
						setState(986);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(985);
							match(NEWLINE);
							}
						}

						setState(988);
						parameter_id();
						}
						}
						setState(993);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(994);
					match(T__2);
					setState(996);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
					case 1:
						{
						setState(995);
						match(NEWLINE);
						}
						break;
					}
					setState(999);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
					case 1:
						{
						setState(998);
						match(COMMENT);
						}
						break;
					}
					setState(1002);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
					case 1:
						{
						setState(1001);
						match(NEWLINE);
						}
						break;
					}
					}
					}
					setState(1006); 
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
			setState(1011);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1010);
				match(COMMENT);
				}
			}

			setState(1014);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1013);
				match(NEWLINE);
				}
			}

			setState(1016);
			parameter_decl();
			setState(1030);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1017);
					match(T__12);
					setState(1019);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
					case 1:
						{
						setState(1018);
						match(NEWLINE);
						}
						break;
					}
					setState(1022);
					_la = _input.LA(1);
					if (_la==COMMENT) {
						{
						setState(1021);
						match(COMMENT);
						}
					}

					setState(1025);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1024);
						match(NEWLINE);
						}
					}

					setState(1027);
					parameter_decl();
					}
					} 
				}
				setState(1032);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			}
			}
			setState(1044);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(1033);
				match(T__12);
				setState(1035);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1034);
					match(NEWLINE);
					}
					break;
				}
				setState(1038);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1037);
					match(COMMENT);
					}
				}

				setState(1041);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1040);
					match(NEWLINE);
					}
				}

				setState(1043);
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
			setState(1050);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1046);
				match(VOID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1047);
				type_name();
				setState(1048);
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
			setState(1053);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__14) {
				{
				setState(1052);
				ptrs();
				}
			}

			setState(1060);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(1055);
				match(T__0);
				setState(1056);
				parameter_id();
				setState(1057);
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
				setState(1059);
				parameter_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1063);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__24) {
				{
				setState(1062);
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
			setState(1065);
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
			setState(1068);
			match(T__3);
			setState(1069);
			ctor_initializer();
			setState(1074);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(1070);
				match(T__12);
				setState(1071);
				ctor_initializer();
				}
				}
				setState(1076);
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
			setState(1077);
			initializer_id();
			setState(1078);
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
			setState(1081);
			_la = _input.LA(1);
			if (_la==T__52) {
				{
				setState(1080);
				match(T__52);
				}
			}

			setState(1083);
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
			setState(1085);
			match(T__0);
			setState(1087);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
				{
				setState(1086);
				expr();
				}
			}

			setState(1089);
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
			setState(1098);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case NEW:
			case PRE_PRAGMA_KEYWORDS:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1091);
				identifier();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(1092);
				match(T__0);
				setState(1093);
				function_name();
				setState(1094);
				match(T__1);
				}
				break;
			case OPERATOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1096);
				match(OPERATOR);
				setState(1097);
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
			setState(1100);
			match(THROW);
			setState(1101);
			match(T__0);
			setState(1102);
			type_id_list();
			setState(1103);
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
			setState(1108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << NEWLINE) | (1L << ESCAPE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ELLIPSIS - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (ASM - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (HEX_FLOAT - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (WHITESPACE - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(1105);
				no_brackets();
				}
				}
				setState(1110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(1111);
				match(T__0);
				setState(1112);
				type_id_list();
				setState(1113);
				match(T__1);
				setState(1117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << NEWLINE) | (1L << ESCAPE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ELLIPSIS - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (ASM - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (HEX_FLOAT - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (WHITESPACE - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(1114);
					no_brackets();
					}
					}
					setState(1119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(1124);
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
			setState(1125);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
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
		enterRule(_localctx, 164, RULE_var_decl);
		int _la;
		try {
			setState(1201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				_localctx = new DeclByClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1128);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(1127);
					template_decl_start();
					}
				}

				setState(1130);
				class_def();
				setState(1132);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(1131);
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
				setState(1138);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(1134);
					match(TYPEDEF);
					setState(1136);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1135);
						match(NEWLINE);
						}
					}

					}
				}

				setState(1141);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(1140);
					template_decl_start();
					}
				}

				setState(1143);
				type_name();
				setState(1144);
				init_declarator_list();
				}
				break;
			case 3:
				_localctx = new FunctionPointerDeclareContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1150);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(1146);
					match(TYPEDEF);
					setState(1148);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1147);
						match(NEWLINE);
						}
					}

					}
				}

				setState(1152);
				type_name();
				setState(1153);
				match(T__0);
				setState(1155);
				_la = _input.LA(1);
				if (_la==ALPHA_NUMERIC) {
					{
					setState(1154);
					callingConvention();
					}
				}

				setState(1157);
				ptr_operator();
				setState(1159);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (NEW - 96)) | (1L << (PRE_PRAGMA_KEYWORDS - 96)) | (1L << (ALPHA_NUMERIC - 96)))) != 0)) {
					{
					setState(1158);
					identifier();
					}
				}

				setState(1161);
				match(T__1);
				setState(1162);
				param_type_list();
				setState(1164);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1163);
					match(NEWLINE);
					}
				}

				setState(1168);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
				case 1:
					{
					setState(1166);
					pre_other();
					}
					break;
				case 2:
					{
					setState(1167);
					macroCall();
					}
					break;
				}
				setState(1175);
				_la = _input.LA(1);
				if (_la==T__30) {
					{
					setState(1170);
					match(T__30);
					setState(1172);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1171);
						match(NEWLINE);
						}
					}

					setState(1174);
					argument();
					}
				}

				setState(1177);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new StructUnionEnumContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1189);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (TYPEDEF - 76)) | (1L << (STATIC - 76)) | (1L << (CV_QUALIFIER - 76)) | (1L << (VIRTUAL - 76)))) != 0)) {
					{
					setState(1182); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						setState(1182);
						switch (_input.LA(1)) {
						case CV_QUALIFIER:
							{
							setState(1179);
							match(CV_QUALIFIER);
							}
							break;
						case T__5:
						case T__6:
						case T__7:
						case STATIC:
						case VIRTUAL:
							{
							setState(1180);
							function_decl_specifiers();
							}
							break;
						case TYPEDEF:
							{
							setState(1181);
							match(TYPEDEF);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						setState(1184); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (TYPEDEF - 76)) | (1L << (STATIC - 76)) | (1L << (CV_QUALIFIER - 76)) | (1L << (VIRTUAL - 76)))) != 0) );
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

				setState(1191);
				special_datatype();
				setState(1193);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
				case 1:
					{
					setState(1192);
					match(NEWLINE);
					}
					break;
				}
				setState(1196);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					{
					setState(1195);
					init_declarator_list();
					}
					break;
				}
				setState(1199);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1198);
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
			setState(1204); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1203);
				match(ALPHA_NUMERIC);
				}
				}
				setState(1206); 
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
			setState(1255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1208);
				match(SPECIAL_DATA);
				setState(1210);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1209);
					match(NEWLINE);
					}
				}

				setState(1213);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1212);
					pre_other();
					}
					break;
				}
				setState(1219);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (NEW - 96)) | (1L << (PRE_PRAGMA_KEYWORDS - 96)) | (1L << (ALPHA_NUMERIC - 96)))) != 0)) {
					{
					setState(1215);
					identifier();
					setState(1217);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1216);
						match(NEWLINE);
						}
					}

					}
				}

				setState(1222);
				_la = _input.LA(1);
				if (_la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(1221);
					pre_other();
					}
				}

				setState(1224);
				match(OPENING_CURLY);
				skipToEndOfObject(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1226);
				match(SPECIAL_DATA);
				setState(1228);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1227);
					match(NEWLINE);
					}
				}

				setState(1231);
				_la = _input.LA(1);
				if (_la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(1230);
					pre_other();
					}
				}

				setState(1233);
				identifier();
				setState(1235);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1234);
					match(NEWLINE);
					}
				}

				setState(1238);
				_la = _input.LA(1);
				if (_la==T__13 || _la==T__14) {
					{
					setState(1237);
					ptrs();
					}
				}

				setState(1240);
				identifier();
				setState(1242);
				_la = _input.LA(1);
				if (_la==T__13 || _la==T__14) {
					{
					setState(1241);
					ptrs();
					}
				}

				setState(1244);
				match(T__30);
				skipToEndOfObject(); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1247);
				match(SPECIAL_DATA);
				setState(1249);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1248);
					match(NEWLINE);
					}
				}

				setState(1252);
				_la = _input.LA(1);
				if (_la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(1251);
					pre_other();
					}
				}

				setState(1254);
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
			setState(1257);
			init_declarator();
			setState(1268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1259);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1258);
						match(NEWLINE);
						}
					}

					setState(1261);
					match(T__12);
					setState(1263);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1262);
						match(NEWLINE);
						}
					}

					setState(1265);
					init_declarator();
					}
					} 
				}
				setState(1270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			}
			setState(1272);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1271);
				match(NEWLINE);
				}
			}

			setState(1275);
			_la = _input.LA(1);
			if (_la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
				{
				setState(1274);
				pre_other();
				}
			}

			setState(1277);
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
			setState(1279);
			match(CLASS_KEY);
			setState(1281);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1280);
				match(NEWLINE);
				}
			}

			setState(1284);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (NEW - 96)) | (1L << (PRE_PRAGMA_KEYWORDS - 96)) | (1L << (ALPHA_NUMERIC - 96)))) != 0)) {
				{
				setState(1283);
				class_name();
				}
			}

			setState(1287);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(1286);
				base_classes();
				}
			}

			setState(1289);
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
			setState(1292);
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
			setState(1294);
			match(T__3);
			setState(1295);
			base_class();
			setState(1300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(1296);
				match(T__12);
				setState(1297);
				base_class();
				}
				}
				setState(1302);
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
			setState(1307);
			_la = _input.LA(1);
			if (_la==VIRTUAL) {
				{
				setState(1303);
				match(VIRTUAL);
				setState(1305);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1304);
					match(NEWLINE);
					}
				}

				}
			}

			setState(1310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1309);
				access_specifier();
				}
				break;
			}
			setState(1312);
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
			setState(1365); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1365);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
					case 1:
						{
						setState(1314);
						match(EXTERN);
						setState(1316);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
						case 1:
							{
							setState(1315);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 2:
						{
						setState(1318);
						function_decl_specifiers();
						setState(1320);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
						case 1:
							{
							setState(1319);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 3:
						{
						setState(1322);
						match(CV_QUALIFIER);
						setState(1324);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
						case 1:
							{
							setState(1323);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 4:
						{
						setState(1326);
						match(UNSIGNED);
						setState(1328);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
						case 1:
							{
							setState(1327);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 5:
						{
						setState(1330);
						match(SIGNED);
						setState(1332);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
						case 1:
							{
							setState(1331);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 6:
						{
						setState(1334);
						match(AUTO);
						setState(1336);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
						case 1:
							{
							setState(1335);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 7:
						{
						setState(1338);
						match(REGISTER);
						setState(1340);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
						case 1:
							{
							setState(1339);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 8:
						{
						setState(1342);
						ptr_operator();
						setState(1344);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
						case 1:
							{
							setState(1343);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 9:
						{
						setState(1346);
						base_type();
						}
						break;
					case 10:
						{
						{
						{
						setState(1347);
						match(T__19);
						setState(1348);
						template_param_list();
						setState(1349);
						match(T__20);
						}
						setState(1361);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1351);
								match(T__52);
								setState(1352);
								base_type();
								setState(1357);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
								case 1:
									{
									setState(1353);
									match(T__19);
									setState(1354);
									template_param_list();
									setState(1355);
									match(T__20);
									}
									break;
								}
								}
								} 
							}
							setState(1363);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
						}
						}
						}
						break;
					case 11:
						{
						setState(1364);
						macroCall();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1367); 
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
			setState(1397); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1397);
					switch (_input.LA(1)) {
					case VOID:
						{
						setState(1369);
						match(VOID);
						setState(1371);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
						case 1:
							{
							setState(1370);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case T__11:
						{
						setState(1373);
						match(T__11);
						setState(1375);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
						case 1:
							{
							setState(1374);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case T__53:
						{
						setState(1377);
						match(T__53);
						setState(1379);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
						case 1:
							{
							setState(1378);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case T__54:
						{
						setState(1381);
						match(T__54);
						setState(1383);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
						case 1:
							{
							setState(1382);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case SPECIAL_DATA:
						{
						setState(1385);
						match(SPECIAL_DATA);
						setState(1387);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
						case 1:
							{
							setState(1386);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case CLASS_KEY:
						{
						setState(1389);
						match(CLASS_KEY);
						setState(1391);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
						case 1:
							{
							setState(1390);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case ALPHA_NUMERIC:
						{
						setState(1393);
						match(ALPHA_NUMERIC);
						setState(1395);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
						case 1:
							{
							setState(1394);
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
				setState(1399); 
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
			setState(1401);
			identifier();
			setState(1403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(1402);
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
			setState(1423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1405);
				match(T__0);
				setState(1406);
				match(VOID);
				setState(1407);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1408);
				match(T__0);
				setState(1420);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__19) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ELLIPSIS - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)))) != 0)) {
					{
					setState(1409);
					param_type();
					setState(1417);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(1410);
						match(T__12);
						setState(1412);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(1411);
							match(NEWLINE);
							}
						}

						setState(1414);
						param_type();
						}
						}
						setState(1419);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1422);
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
			setState(1432);
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
				setState(1425);
				type_name();
				setState(1427);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(1426);
					match(NEWLINE);
					}
					break;
				}
				setState(1429);
				param_type_id();
				}
				break;
			case ELLIPSIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1431);
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
			setState(1435);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__14) {
				{
				setState(1434);
				ptrs();
				}
			}

			setState(1444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				{
				setState(1437);
				match(T__0);
				setState(1438);
				param_type_id();
				setState(1439);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(1442);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (NEW - 96)) | (1L << (PRE_PRAGMA_KEYWORDS - 96)) | (1L << (ALPHA_NUMERIC - 96)))) != 0)) {
					{
					setState(1441);
					parameter_name();
					}
				}

				}
				break;
			}
			setState(1447);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__24) {
				{
				setState(1446);
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
			setState(1460);
			switch (_input.LA(1)) {
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1449);
				match(ALPHA_NUMERIC);
				setState(1454);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1450);
						match(T__52);
						setState(1451);
						match(ALPHA_NUMERIC);
						}
						} 
					}
					setState(1456);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
				}
				}
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(1457);
				match(NEW);
				}
				break;
			case PRE_PRAGMA_KEYWORDS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1458);
				match(PRE_PRAGMA_KEYWORDS);
				}
				break;
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(1459);
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
		enterRule(_localctx, 194, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1462);
			_la = _input.LA(1);
			if ( !(((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (HEX_LITERAL - 117)) | (1L << (DECIMAL_LITERAL - 117)) | (1L << (OCTAL_LITERAL - 117)) | (1L << (HEX_FLOAT - 117)))) != 0)) ) {
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
			setState(1468); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1464);
				ptr_operator();
				setState(1466);
				_la = _input.LA(1);
				if (_la==T__55) {
					{
					setState(1465);
					match(T__55);
					}
				}

				}
				}
				setState(1470); 
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
			setState(1472);
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
			setState(1474);
			assign_expr();
			setState(1479);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1475);
					match(ESCAPE);
					setState(1476);
					match(NEWLINE);
					}
					} 
				}
				setState(1481);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			}
			setState(1502);
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
				match(T__12);
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
				expr();
				}
				break;
			}
			setState(1508);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1504);
					match(ESCAPE);
					setState(1505);
					match(NEWLINE);
					}
					} 
				}
				setState(1510);
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
			setState(1511);
			conditional_expression();
			setState(1533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(1513);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
				case 1:
					{
					setState(1512);
					match(NEWLINE);
					}
					break;
				}
				setState(1516);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1515);
					match(COMMENT);
					}
				}

				setState(1519);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1518);
					match(NEWLINE);
					}
				}

				setState(1521);
				assignment_operator();
				setState(1523);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
				case 1:
					{
					setState(1522);
					match(NEWLINE);
					}
					break;
				}
				setState(1526);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1525);
					match(COMMENT);
					}
				}

				setState(1529);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1528);
					match(NEWLINE);
					}
				}

				setState(1531);
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
			setState(1578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				_localctx = new NormOrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1535);
				or_expression();
				}
				break;
			case 2:
				_localctx = new CndExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1536);
				or_expression();
				{
				setState(1538);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
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
				match(T__56);
				setState(1548);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
				case 1:
					{
					setState(1547);
					match(NEWLINE);
					}
					break;
				}
				setState(1551);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1550);
					match(COMMENT);
					}
				}

				setState(1554);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1553);
					match(NEWLINE);
					}
				}

				setState(1556);
				expr();
				setState(1558);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
				case 1:
					{
					setState(1557);
					match(NEWLINE);
					}
					break;
				}
				setState(1561);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1560);
					match(COMMENT);
					}
				}

				setState(1564);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1563);
					match(NEWLINE);
					}
				}

				setState(1566);
				match(T__3);
				setState(1568);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
				case 1:
					{
					setState(1567);
					match(NEWLINE);
					}
					break;
				}
				setState(1571);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1570);
					match(COMMENT);
					}
				}

				setState(1574);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1573);
					match(NEWLINE);
					}
				}

				setState(1576);
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
			setState(1580);
			and_expression();
			setState(1601);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				{
				setState(1582);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
				case 1:
					{
					setState(1581);
					match(NEWLINE);
					}
					break;
				}
				setState(1585);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1584);
					match(COMMENT);
					}
				}

				setState(1588);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1587);
					match(NEWLINE);
					}
				}

				setState(1590);
				match(T__46);
				setState(1592);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
				case 1:
					{
					setState(1591);
					match(NEWLINE);
					}
					break;
				}
				setState(1595);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1594);
					match(COMMENT);
					}
				}

				setState(1598);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1597);
					match(NEWLINE);
					}
				}

				setState(1600);
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
			setState(1603);
			inclusive_or_expression();
			setState(1624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				{
				setState(1605);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
				case 1:
					{
					setState(1604);
					match(NEWLINE);
					}
					break;
				}
				setState(1608);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1607);
					match(COMMENT);
					}
				}

				setState(1611);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1610);
					match(NEWLINE);
					}
				}

				setState(1613);
				match(T__45);
				setState(1615);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
				case 1:
					{
					setState(1614);
					match(NEWLINE);
					}
					break;
				}
				setState(1618);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1617);
					match(COMMENT);
					}
				}

				setState(1621);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1620);
					match(NEWLINE);
					}
				}

				setState(1623);
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
			setState(1626);
			exclusive_or_expression();
			setState(1647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				{
				setState(1628);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
				case 1:
					{
					setState(1627);
					match(NEWLINE);
					}
					break;
				}
				setState(1631);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1630);
					match(COMMENT);
					}
				}

				setState(1634);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1633);
					match(NEWLINE);
					}
				}

				setState(1636);
				match(T__29);
				setState(1638);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
				case 1:
					{
					setState(1637);
					match(NEWLINE);
					}
					break;
				}
				setState(1641);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1640);
					match(COMMENT);
					}
				}

				setState(1644);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1643);
					match(NEWLINE);
					}
				}

				setState(1646);
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
			setState(1649);
			bit_and_expression();
			setState(1670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				{
				setState(1651);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
				case 1:
					{
					setState(1650);
					match(NEWLINE);
					}
					break;
				}
				setState(1654);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1653);
					match(COMMENT);
					}
				}

				setState(1657);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1656);
					match(NEWLINE);
					}
				}

				setState(1659);
				match(T__28);
				setState(1661);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
				case 1:
					{
					setState(1660);
					match(NEWLINE);
					}
					break;
				}
				setState(1664);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1663);
					match(COMMENT);
					}
				}

				setState(1667);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1666);
					match(NEWLINE);
					}
				}

				setState(1669);
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
			setState(1672);
			equality_expression();
			setState(1693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				{
				setState(1674);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
				case 1:
					{
					setState(1673);
					match(NEWLINE);
					}
					break;
				}
				setState(1677);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1676);
					match(COMMENT);
					}
				}

				setState(1680);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1679);
					match(NEWLINE);
					}
				}

				setState(1682);
				match(T__13);
				setState(1684);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
				case 1:
					{
					setState(1683);
					match(NEWLINE);
					}
					break;
				}
				setState(1687);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1686);
					match(COMMENT);
					}
				}

				setState(1690);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1689);
					match(NEWLINE);
					}
				}

				setState(1692);
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
			setState(1695);
			relational_expression();
			setState(1717);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				{
				setState(1697);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
				case 1:
					{
					setState(1696);
					match(NEWLINE);
					}
					break;
				}
				setState(1700);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1699);
					match(COMMENT);
					}
				}

				setState(1703);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1702);
					match(NEWLINE);
					}
				}

				setState(1705);
				equality_operator();
				setState(1707);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
				case 1:
					{
					setState(1706);
					match(NEWLINE);
					}
					break;
				}
				setState(1710);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1709);
					match(COMMENT);
					}
				}

				setState(1713);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1712);
					match(NEWLINE);
					}
				}

				setState(1715);
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
			setState(1719);
			shift_expression();
			setState(1741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
			case 1:
				{
				setState(1721);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
				case 1:
					{
					setState(1720);
					match(NEWLINE);
					}
					break;
				}
				setState(1724);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1723);
					match(COMMENT);
					}
				}

				setState(1727);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1726);
					match(NEWLINE);
					}
				}

				setState(1729);
				relational_operator();
				setState(1731);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
				case 1:
					{
					setState(1730);
					match(NEWLINE);
					}
					break;
				}
				setState(1734);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1733);
					match(COMMENT);
					}
				}

				setState(1737);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1736);
					match(NEWLINE);
					}
				}

				setState(1739);
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
			setState(1743);
			additive_expression();
			setState(1764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				{
				setState(1745);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
				case 1:
					{
					setState(1744);
					match(NEWLINE);
					}
					break;
				}
				setState(1748);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1747);
					match(COMMENT);
					}
				}

				setState(1751);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1750);
					match(NEWLINE);
					}
				}

				setState(1753);
				_la = _input.LA(1);
				if ( !(_la==T__39 || _la==T__40) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1755);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
				case 1:
					{
					setState(1754);
					match(NEWLINE);
					}
					break;
				}
				setState(1758);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1757);
					match(COMMENT);
					}
				}

				setState(1761);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1760);
					match(NEWLINE);
					}
				}

				setState(1763);
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
			setState(1766);
			multiplicative_expression();
			setState(1787);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
			case 1:
				{
				setState(1768);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
				case 1:
					{
					setState(1767);
					match(NEWLINE);
					}
					break;
				}
				setState(1771);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1770);
					match(COMMENT);
					}
				}

				setState(1774);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1773);
					match(NEWLINE);
					}
				}

				setState(1776);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1778);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
				case 1:
					{
					setState(1777);
					match(NEWLINE);
					}
					break;
				}
				setState(1781);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1780);
					match(COMMENT);
					}
				}

				setState(1784);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1783);
					match(NEWLINE);
					}
				}

				setState(1786);
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
			setState(1789);
			function_pointer_use_expression();
			setState(1810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
			case 1:
				{
				setState(1791);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
				case 1:
					{
					setState(1790);
					match(NEWLINE);
					}
					break;
				}
				setState(1794);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1793);
					match(COMMENT);
					}
				}

				setState(1797);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1796);
					match(NEWLINE);
					}
				}

				setState(1799);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__26) | (1L << T__27))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1801);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
				case 1:
					{
					setState(1800);
					match(NEWLINE);
					}
					break;
				}
				setState(1804);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1803);
					match(COMMENT);
					}
				}

				setState(1807);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1806);
					match(NEWLINE);
					}
				}

				setState(1809);
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
			setState(1823);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1812);
				match(T__0);
				setState(1813);
				ptr_operator();
				setState(1815);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (NEW - 96)) | (1L << (PRE_PRAGMA_KEYWORDS - 96)) | (1L << (ALPHA_NUMERIC - 96)))) != 0)) {
					{
					setState(1814);
					identifier();
					}
				}

				setState(1817);
				match(T__1);
				setState(1818);
				match(T__0);
				setState(1819);
				argument_list();
				setState(1820);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1822);
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
			setState(1831);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1825);
				match(T__0);
				setState(1826);
				cast_target();
				setState(1827);
				match(T__1);
				setState(1828);
				cast_expression();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1830);
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
			setState(1837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1833);
				type_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1834);
				type_name();
				setState(1835);
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
			setState(1847);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1839);
				address_of_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1840);
				unary_op_and_cast_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1841);
				sizeof_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1842);
				new_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1843);
				postfix_expression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1844);
				defined_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1845);
				macroCall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1846);
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
			setState(1849);
			match(T__13);
			setState(1850);
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
			setState(1910);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,346,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1853);
				_la = _input.LA(1);
				if (_la==T__52) {
					{
					setState(1852);
					match(T__52);
					}
				}

				setState(1855);
				match(NEW);
				setState(1857);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,331,_ctx) ) {
				case 1:
					{
					setState(1856);
					match(NEWLINE);
					}
					break;
				}
				setState(1860);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1859);
					match(COMMENT);
					}
				}

				setState(1863);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1862);
					match(NEWLINE);
					}
				}

				setState(1865);
				type_name();
				setState(1867);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,334,_ctx) ) {
				case 1:
					{
					setState(1866);
					match(NEWLINE);
					}
					break;
				}
				setState(1870);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1869);
					match(COMMENT);
					}
				}

				setState(1873);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1872);
					match(NEWLINE);
					}
				}

				setState(1875);
				match(T__24);
				setState(1877);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(1876);
					conditional_expression();
					}
				}

				setState(1879);
				match(T__25);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1882);
				_la = _input.LA(1);
				if (_la==T__52) {
					{
					setState(1881);
					match(T__52);
					}
				}

				setState(1884);
				match(NEW);
				setState(1886);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,339,_ctx) ) {
				case 1:
					{
					setState(1885);
					match(NEWLINE);
					}
					break;
				}
				setState(1889);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1888);
					match(COMMENT);
					}
				}

				setState(1892);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1891);
					match(NEWLINE);
					}
				}

				setState(1894);
				type_name();
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
				setState(1906);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(1905);
					expr();
					}
				}

				setState(1908);
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
			setState(1912);
			unary_operator();
			setState(1914);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,347,_ctx) ) {
			case 1:
				{
				setState(1913);
				match(NEWLINE);
				}
				break;
			}
			setState(1917);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1916);
				match(COMMENT);
				}
			}

			setState(1920);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1919);
				match(NEWLINE);
				}
			}

			setState(1922);
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
			setState(1950);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,356,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1924);
				sizeof();
				setState(1926);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,350,_ctx) ) {
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
				sizeof_operand();
				setState(1936);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1938);
				sizeof();
				setState(1940);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,353,_ctx) ) {
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
			setState(1952);
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
			setState(1979);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,363,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1954);
				match(T__58);
				setState(1956);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,357,_ctx) ) {
				case 1:
					{
					setState(1955);
					match(NEWLINE);
					}
					break;
				}
				setState(1959);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1958);
					match(COMMENT);
					}
				}

				setState(1962);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1961);
					match(NEWLINE);
					}
				}

				setState(1964);
				match(T__0);
				setState(1965);
				expr();
				setState(1966);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1968);
				match(T__58);
				setState(1970);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,360,_ctx) ) {
				case 1:
					{
					setState(1969);
					match(NEWLINE);
					}
					break;
				}
				setState(1973);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1972);
					match(COMMENT);
					}
				}

				setState(1976);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1975);
					match(NEWLINE);
					}
				}

				setState(1978);
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
			setState(1981);
			type_name();
			setState(1994);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << NEWLINE))) != 0) || _la==COMMENT) {
				{
				{
				setState(1983);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,364,_ctx) ) {
				case 1:
					{
					setState(1982);
					match(NEWLINE);
					}
					break;
				}
				setState(1986);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1985);
					match(COMMENT);
					}
				}

				setState(1989);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1988);
					match(NEWLINE);
					}
				}

				setState(1991);
				ptr_operator();
				}
				}
				setState(1996);
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
			setState(1997);
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
			setState(1999);
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
			setState(2001);
			match(ASM);
			setState(2005);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GOTO || _la==CV_QUALIFIER) {
				{
				{
				setState(2002);
				_la = _input.LA(1);
				if ( !(_la==GOTO || _la==CV_QUALIFIER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(2007);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2009);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(2008);
				match(NEWLINE);
				}
			}

			setState(2011);
			match(T__0);
			setState(2013);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(2012);
				match(NEWLINE);
				}
			}

			setState(2019); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2015);
				match(STRING);
				setState(2017);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(2016);
					match(NEWLINE);
					}
				}

				}
				}
				setState(2021); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(2045);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__52) | (1L << T__59))) != 0)) {
				{
				{
				setState(2023);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__52) | (1L << T__59))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2041);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					{
					setState(2024);
					match(STRING);
					setState(2026);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(2025);
						match(NEWLINE);
						}
					}

					}
					setState(2039);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(2028);
						match(T__0);
						setState(2029);
						identifier();
						setState(2034);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__12) {
							{
							{
							setState(2030);
							match(T__12);
							setState(2031);
							identifier();
							}
							}
							setState(2036);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2037);
						match(T__1);
						}
					}

					}
				}

				}
				}
				setState(2047);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2048);
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
			setState(2074);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,384,_ctx) ) {
			case 1:
				{
				_localctx = new ArrayAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2052);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__19) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)))) != 0)) {
					{
					setState(2051);
					type_name();
					}
				}

				setState(2054);
				initializer_expression();
				}
				break;
			case 2:
				{
				_localctx = new PrimaryOnlyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2055);
				primary_expression();
				}
				break;
			case 3:
				{
				_localctx = new IncDecOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2057);
				_la = _input.LA(1);
				if (_la==T__13 || _la==T__14) {
					{
					setState(2056);
					ptr_operator();
					}
				}

				setState(2059);
				inc_dec();
				setState(2061);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,380,_ctx) ) {
				case 1:
					{
					setState(2060);
					match(NEWLINE);
					}
					break;
				}
				setState(2064);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(2063);
					match(COMMENT);
					}
				}

				setState(2067);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(2066);
					match(NEWLINE);
					}
				}

				setState(2070);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,383,_ctx) ) {
				case 1:
					{
					setState(2069);
					ptr_operator();
					}
					break;
				}
				setState(2072);
				primary_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,404,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2146);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,403,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayIndexingContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2076);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2078);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,385,_ctx) ) {
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

						setState(2086);
						match(T__24);
						setState(2088);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
							{
							setState(2087);
							expr();
							}
						}

						setState(2090);
						match(T__25);
						}
						break;
					case 2:
						{
						_localctx = new FuncCallContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2091);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(2093);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,389,_ctx) ) {
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

						setState(2101);
						match(T__0);
						setState(2102);
						argument_list();
						setState(2103);
						match(T__1);
						}
						break;
					case 3:
						{
						_localctx = new MemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2105);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2106);
						match(T__60);
						setState(2108);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,392,_ctx) ) {
						case 1:
							{
							setState(2107);
							match(NEWLINE);
							}
							break;
						}
						setState(2111);
						_la = _input.LA(1);
						if (_la==COMMENT) {
							{
							setState(2110);
							match(COMMENT);
							}
						}

						setState(2114);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(2113);
							match(NEWLINE);
							}
						}

						setState(2117);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(2116);
							match(TEMPLATE);
							}
						}

						{
						setState(2119);
						identifier();
						}
						}
						break;
					case 4:
						{
						_localctx = new PtrMemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2120);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2121);
						match(T__50);
						setState(2123);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,396,_ctx) ) {
						case 1:
							{
							setState(2122);
							match(NEWLINE);
							}
							break;
						}
						setState(2126);
						_la = _input.LA(1);
						if (_la==COMMENT) {
							{
							setState(2125);
							match(COMMENT);
							}
						}

						setState(2129);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(2128);
							match(NEWLINE);
							}
						}

						setState(2132);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(2131);
							match(TEMPLATE);
							}
						}

						{
						setState(2134);
						identifier();
						}
						}
						break;
					case 5:
						{
						_localctx = new IncDecOpContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2135);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2137);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,400,_ctx) ) {
						case 1:
							{
							setState(2136);
							match(NEWLINE);
							}
							break;
						}
						setState(2140);
						_la = _input.LA(1);
						if (_la==COMMENT) {
							{
							setState(2139);
							match(COMMENT);
							}
						}

						setState(2143);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(2142);
							match(NEWLINE);
							}
						}

						setState(2145);
						inc_dec();
						}
						break;
					}
					} 
				}
				setState(2150);
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
			setState(2151);
			match(OPENING_CURLY);
			setState(2153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,405,_ctx) ) {
			case 1:
				{
				setState(2152);
				match(NEWLINE);
				}
				break;
			}
			setState(2161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,407,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2155);
					match(COMMENT);
					setState(2157);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,406,_ctx) ) {
					case 1:
						{
						setState(2156);
						match(NEWLINE);
						}
						break;
					}
					}
					} 
				}
				setState(2163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,407,_ctx);
			}
			setState(2165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,408,_ctx) ) {
			case 1:
				{
				setState(2164);
				argument_list();
				}
				break;
			}
			setState(2168);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(2167);
				match(NEWLINE);
				}
			}

			setState(2176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(2170);
				match(COMMENT);
				setState(2172);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(2171);
					match(NEWLINE);
					}
				}

				}
				}
				setState(2178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2179);
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
			setState(2230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,426,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2191);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,415,_ctx) ) {
				case 1:
					{
					setState(2182);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,412,_ctx) ) {
					case 1:
						{
						setState(2181);
						match(NEWLINE);
						}
						break;
					}
					setState(2185);
					_la = _input.LA(1);
					if (_la==COMMENT) {
						{
						setState(2184);
						match(COMMENT);
						}
					}

					setState(2188);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(2187);
						match(NEWLINE);
						}
					}

					setState(2190);
					argument();
					}
					break;
				}
				setState(2194);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,416,_ctx) ) {
				case 1:
					{
					setState(2193);
					match(NEWLINE);
					}
					break;
				}
				setState(2197);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,417,_ctx) ) {
				case 1:
					{
					setState(2196);
					match(COMMENT);
					}
					break;
				}
				setState(2200);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,418,_ctx) ) {
				case 1:
					{
					setState(2199);
					match(NEWLINE);
					}
					break;
				}
				setState(2220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,423,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2203);
						_la = _input.LA(1);
						if (_la==T__12) {
							{
							setState(2202);
							match(T__12);
							}
						}

						setState(2206);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(2205);
							match(NEWLINE);
							}
						}

						setState(2214);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMENT) {
							{
							{
							setState(2208);
							match(COMMENT);
							setState(2210);
							_la = _input.LA(1);
							if (_la==NEWLINE) {
								{
								setState(2209);
								match(NEWLINE);
								}
							}

							}
							}
							setState(2216);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2217);
						argument();
						}
						} 
					}
					setState(2222);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,423,_ctx);
				}
				setState(2224);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(2223);
					match(T__12);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2226);
				match(VOID);
				setState(2228);
				_la = _input.LA(1);
				if (_la==T__13 || _la==T__14) {
					{
					setState(2227);
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
			setState(2232);
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
			setState(2244);
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
				setState(2235);
				_la = _input.LA(1);
				if (_la==T__60) {
					{
					setState(2234);
					match(T__60);
					}
				}

				setState(2237);
				identifier();
				}
				}
				break;
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(2238);
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
				setState(2239);
				constant();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
				setState(2240);
				match(T__0);
				setState(2241);
				expr();
				setState(2242);
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
			setState(2246);
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
			setState(2266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,432,_ctx) ) {
			case 1:
				_localctx = new InitDeclWithCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2248);
				declarator();
				setState(2249);
				match(T__0);
				setState(2251);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(2250);
					expr();
					}
				}

				setState(2253);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new InitDeclWithAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2255);
				declarator();
				setState(2257);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(2256);
					match(NEWLINE);
					}
				}

				setState(2259);
				match(T__30);
				setState(2261);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(2260);
					match(NEWLINE);
					}
				}

				setState(2263);
				argument();
				}
				break;
			case 3:
				_localctx = new InitDeclSimpleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2265);
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
			setState(2269);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__14) {
				{
				setState(2268);
				ptrs();
				}
			}

			setState(2271);
			identifier();
			setState(2273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,434,_ctx) ) {
			case 1:
				{
				setState(2272);
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
			setState(2281);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2275);
				match(T__24);
				setState(2277);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(2276);
					conditional_expression();
					}
				}

				setState(2279);
				match(T__25);
				}
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(2280);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0080\u08ee\4\2\t"+
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
		"\3\24\3\24\5\24\u01d2\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u01dc\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u01e6\n\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u01ef\n\27\3\27\5\27\u01f2\n\27"+
		"\3\30\3\30\3\31\3\31\5\31\u01f8\n\31\3\31\3\31\3\31\5\31\u01fd\n\31\7"+
		"\31\u01ff\n\31\f\31\16\31\u0202\13\31\3\32\3\32\3\32\6\32\u0207\n\32\r"+
		"\32\16\32\u0208\3\32\3\32\5\32\u020d\n\32\3\33\5\33\u0210\n\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\5\33\u0218\n\33\3\33\5\33\u021b\n\33\3\33\3\33"+
		"\5\33\u021f\n\33\3\33\3\33\3\33\3\33\5\33\u0225\n\33\7\33\u0227\n\33\f"+
		"\33\16\33\u022a\13\33\3\33\5\33\u022d\n\33\3\33\5\33\u0230\n\33\3\33\3"+
		"\33\3\34\3\34\3\34\5\34\u0237\n\34\3\35\3\35\5\35\u023b\n\35\3\35\3\35"+
		"\3\35\3\35\5\35\u0241\n\35\3\35\3\35\3\35\3\35\3\35\5\35\u0248\n\35\3"+
		"\35\3\35\5\35\u024c\n\35\3\36\3\36\3\36\7\36\u0251\n\36\f\36\16\36\u0254"+
		"\13\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u025c\n\37\f\37\16\37\u025f"+
		"\13\37\3\37\3\37\3\37\3\37\3\37\5\37\u0266\n\37\3\37\3\37\7\37\u026a\n"+
		"\37\f\37\16\37\u026d\13\37\3\37\3\37\3\37\5\37\u0272\n\37\3 \3 \3 \3 "+
		"\3 \5 \u0279\n \3!\3!\3!\3!\3!\5!\u0280\n!\3\"\3\"\3#\3#\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0294\n$\3%\3%\5%\u0298\n%\3%\3%\3%\3"+
		"%\3%\5%\u029f\n%\3%\3%\7%\u02a3\n%\f%\16%\u02a6\13%\3%\3%\5%\u02aa\n%"+
		"\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3*\3*\7*\u02b9\n*\f*\16*\u02bc\13"+
		"*\3*\7*\u02bf\n*\f*\16*\u02c2\13*\3*\7*\u02c5\n*\f*\16*\u02c8\13*\6*\u02ca"+
		"\n*\r*\16*\u02cb\3*\3*\3*\5*\u02d1\n*\3+\3+\3,\3,\3-\3-\3.\3.\3.\5.\u02dc"+
		"\n.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0306\n.\3/"+
		"\3/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\6\62\u031a\n\62\r\62\16\62\u031b\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3"+
		">\3>\5>\u0338\n>\3?\3?\3?\6?\u033d\n?\r?\16?\u033e\3@\3@\3@\5@\u0344\n"+
		"@\3A\3A\5A\u0348\nA\3A\5A\u034b\nA\3A\5A\u034e\nA\3A\3A\5A\u0352\nA\3"+
		"A\3A\3B\3B\3B\3B\3B\3C\3C\3D\5D\u035e\nD\3D\5D\u0361\nD\3D\3D\5D\u0365"+
		"\nD\5D\u0367\nD\3D\3D\5D\u036b\nD\3D\3D\5D\u036f\nD\3D\5D\u0372\nD\3D"+
		"\5D\u0375\nD\3D\5D\u0378\nD\3D\3D\3D\5D\u037d\nD\3D\3D\5D\u0381\nD\3D"+
		"\5D\u0384\nD\3D\5D\u0387\nD\3D\3D\5D\u038b\nD\3E\3E\3F\3F\5F\u0391\nF"+
		"\7F\u0393\nF\fF\16F\u0396\13F\3F\3F\3F\3F\5F\u039c\nF\7F\u039e\nF\fF\16"+
		"F\u03a1\13F\3F\3F\5F\u03a5\nF\5F\u03a7\nF\3G\3G\5G\u03ab\nG\3G\5G\u03ae"+
		"\nG\3G\5G\u03b1\nG\3G\3G\5G\u03b5\nG\3G\3G\5G\u03b9\nG\7G\u03bb\nG\fG"+
		"\16G\u03be\13G\3G\5G\u03c1\nG\3G\3G\5G\u03c5\nG\3G\3G\3G\5G\u03ca\nG\3"+
		"G\7G\u03cd\nG\fG\16G\u03d0\13G\3G\5G\u03d3\nG\3G\3G\5G\u03d7\nG\3G\3G"+
		"\3G\3G\5G\u03dd\nG\3G\7G\u03e0\nG\fG\16G\u03e3\13G\3G\3G\5G\u03e7\nG\3"+
		"G\5G\u03ea\nG\3G\5G\u03ed\nG\6G\u03ef\nG\rG\16G\u03f0\5G\u03f3\nG\3H\5"+
		"H\u03f6\nH\3H\5H\u03f9\nH\3H\3H\3H\5H\u03fe\nH\3H\5H\u0401\nH\3H\5H\u0404"+
		"\nH\3H\7H\u0407\nH\fH\16H\u040a\13H\3H\3H\5H\u040e\nH\3H\5H\u0411\nH\3"+
		"H\5H\u0414\nH\3H\5H\u0417\nH\3I\3I\3I\3I\5I\u041d\nI\3J\5J\u0420\nJ\3"+
		"J\3J\3J\3J\3J\5J\u0427\nJ\3J\5J\u042a\nJ\3K\3K\3K\3L\3L\3L\3L\7L\u0433"+
		"\nL\fL\16L\u0436\13L\3M\3M\3M\3N\5N\u043c\nN\3N\3N\3O\3O\5O\u0442\nO\3"+
		"O\3O\3P\3P\3P\3P\3P\3P\3P\5P\u044d\nP\3Q\3Q\3Q\3Q\3Q\3R\7R\u0455\nR\f"+
		"R\16R\u0458\13R\3R\3R\3R\3R\7R\u045e\nR\fR\16R\u0461\13R\7R\u0463\nR\f"+
		"R\16R\u0466\13R\3S\3S\3T\5T\u046b\nT\3T\3T\5T\u046f\nT\3T\3T\5T\u0473"+
		"\nT\5T\u0475\nT\3T\5T\u0478\nT\3T\3T\3T\3T\3T\5T\u047f\nT\5T\u0481\nT"+
		"\3T\3T\3T\5T\u0486\nT\3T\3T\5T\u048a\nT\3T\3T\3T\5T\u048f\nT\3T\3T\5T"+
		"\u0493\nT\3T\3T\5T\u0497\nT\3T\5T\u049a\nT\3T\3T\3T\3T\3T\6T\u04a1\nT"+
		"\rT\16T\u04a2\3T\5T\u04a6\nT\5T\u04a8\nT\3T\3T\5T\u04ac\nT\3T\5T\u04af"+
		"\nT\3T\5T\u04b2\nT\5T\u04b4\nT\3U\6U\u04b7\nU\rU\16U\u04b8\3V\3V\5V\u04bd"+
		"\nV\3V\5V\u04c0\nV\3V\3V\5V\u04c4\nV\5V\u04c6\nV\3V\5V\u04c9\nV\3V\3V"+
		"\3V\3V\5V\u04cf\nV\3V\5V\u04d2\nV\3V\3V\5V\u04d6\nV\3V\5V\u04d9\nV\3V"+
		"\3V\5V\u04dd\nV\3V\3V\3V\3V\3V\5V\u04e4\nV\3V\5V\u04e7\nV\3V\5V\u04ea"+
		"\nV\3W\3W\5W\u04ee\nW\3W\3W\5W\u04f2\nW\3W\7W\u04f5\nW\fW\16W\u04f8\13"+
		"W\3W\5W\u04fb\nW\3W\5W\u04fe\nW\3W\3W\3X\3X\5X\u0504\nX\3X\5X\u0507\n"+
		"X\3X\5X\u050a\nX\3X\3X\3X\3Y\3Y\3Z\3Z\3Z\3Z\7Z\u0515\nZ\fZ\16Z\u0518\13"+
		"Z\3[\3[\5[\u051c\n[\5[\u051e\n[\3[\5[\u0521\n[\3[\3[\3\\\3\\\5\\\u0527"+
		"\n\\\3\\\3\\\5\\\u052b\n\\\3\\\3\\\5\\\u052f\n\\\3\\\3\\\5\\\u0533\n\\"+
		"\3\\\3\\\5\\\u0537\n\\\3\\\3\\\5\\\u053b\n\\\3\\\3\\\5\\\u053f\n\\\3\\"+
		"\3\\\5\\\u0543\n\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u0550"+
		"\n\\\7\\\u0552\n\\\f\\\16\\\u0555\13\\\3\\\6\\\u0558\n\\\r\\\16\\\u0559"+
		"\3]\3]\5]\u055e\n]\3]\3]\5]\u0562\n]\3]\3]\5]\u0566\n]\3]\3]\5]\u056a"+
		"\n]\3]\3]\5]\u056e\n]\3]\3]\5]\u0572\n]\3]\3]\5]\u0576\n]\6]\u0578\n]"+
		"\r]\16]\u0579\3^\3^\5^\u057e\n^\3_\3_\3_\3_\3_\3_\3_\5_\u0587\n_\3_\7"+
		"_\u058a\n_\f_\16_\u058d\13_\5_\u058f\n_\3_\5_\u0592\n_\3`\3`\5`\u0596"+
		"\n`\3`\3`\3`\5`\u059b\n`\3a\5a\u059e\na\3a\3a\3a\3a\3a\5a\u05a5\na\5a"+
		"\u05a7\na\3a\5a\u05aa\na\3b\3b\3b\7b\u05af\nb\fb\16b\u05b2\13b\3b\3b\3"+
		"b\5b\u05b7\nb\3c\3c\3d\3d\5d\u05bd\nd\6d\u05bf\nd\rd\16d\u05c0\3e\3e\3"+
		"f\3f\3f\7f\u05c8\nf\ff\16f\u05cb\13f\3f\5f\u05ce\nf\3f\5f\u05d1\nf\3f"+
		"\5f\u05d4\nf\3f\3f\5f\u05d8\nf\3f\5f\u05db\nf\3f\5f\u05de\nf\3f\5f\u05e1"+
		"\nf\3f\3f\7f\u05e5\nf\ff\16f\u05e8\13f\3g\3g\5g\u05ec\ng\3g\5g\u05ef\n"+
		"g\3g\5g\u05f2\ng\3g\3g\5g\u05f6\ng\3g\5g\u05f9\ng\3g\5g\u05fc\ng\3g\3"+
		"g\5g\u0600\ng\3h\3h\3h\5h\u0605\nh\3h\5h\u0608\nh\3h\5h\u060b\nh\3h\3"+
		"h\5h\u060f\nh\3h\5h\u0612\nh\3h\5h\u0615\nh\3h\3h\5h\u0619\nh\3h\5h\u061c"+
		"\nh\3h\5h\u061f\nh\3h\3h\5h\u0623\nh\3h\5h\u0626\nh\3h\5h\u0629\nh\3h"+
		"\3h\5h\u062d\nh\3i\3i\5i\u0631\ni\3i\5i\u0634\ni\3i\5i\u0637\ni\3i\3i"+
		"\5i\u063b\ni\3i\5i\u063e\ni\3i\5i\u0641\ni\3i\5i\u0644\ni\3j\3j\5j\u0648"+
		"\nj\3j\5j\u064b\nj\3j\5j\u064e\nj\3j\3j\5j\u0652\nj\3j\5j\u0655\nj\3j"+
		"\5j\u0658\nj\3j\5j\u065b\nj\3k\3k\5k\u065f\nk\3k\5k\u0662\nk\3k\5k\u0665"+
		"\nk\3k\3k\5k\u0669\nk\3k\5k\u066c\nk\3k\5k\u066f\nk\3k\5k\u0672\nk\3l"+
		"\3l\5l\u0676\nl\3l\5l\u0679\nl\3l\5l\u067c\nl\3l\3l\5l\u0680\nl\3l\5l"+
		"\u0683\nl\3l\5l\u0686\nl\3l\5l\u0689\nl\3m\3m\5m\u068d\nm\3m\5m\u0690"+
		"\nm\3m\5m\u0693\nm\3m\3m\5m\u0697\nm\3m\5m\u069a\nm\3m\5m\u069d\nm\3m"+
		"\5m\u06a0\nm\3n\3n\5n\u06a4\nn\3n\5n\u06a7\nn\3n\5n\u06aa\nn\3n\3n\5n"+
		"\u06ae\nn\3n\5n\u06b1\nn\3n\5n\u06b4\nn\3n\3n\5n\u06b8\nn\3o\3o\5o\u06bc"+
		"\no\3o\5o\u06bf\no\3o\5o\u06c2\no\3o\3o\5o\u06c6\no\3o\5o\u06c9\no\3o"+
		"\5o\u06cc\no\3o\3o\5o\u06d0\no\3p\3p\5p\u06d4\np\3p\5p\u06d7\np\3p\5p"+
		"\u06da\np\3p\3p\5p\u06de\np\3p\5p\u06e1\np\3p\5p\u06e4\np\3p\5p\u06e7"+
		"\np\3q\3q\5q\u06eb\nq\3q\5q\u06ee\nq\3q\5q\u06f1\nq\3q\3q\5q\u06f5\nq"+
		"\3q\5q\u06f8\nq\3q\5q\u06fb\nq\3q\5q\u06fe\nq\3r\3r\5r\u0702\nr\3r\5r"+
		"\u0705\nr\3r\5r\u0708\nr\3r\3r\5r\u070c\nr\3r\5r\u070f\nr\3r\5r\u0712"+
		"\nr\3r\5r\u0715\nr\3s\3s\3s\5s\u071a\ns\3s\3s\3s\3s\3s\3s\5s\u0722\ns"+
		"\3t\3t\3t\3t\3t\3t\5t\u072a\nt\3u\3u\3u\3u\5u\u0730\nu\3v\3v\3v\3v\3v"+
		"\3v\3v\3v\5v\u073a\nv\3w\3w\3w\3x\5x\u0740\nx\3x\3x\5x\u0744\nx\3x\5x"+
		"\u0747\nx\3x\5x\u074a\nx\3x\3x\5x\u074e\nx\3x\5x\u0751\nx\3x\5x\u0754"+
		"\nx\3x\3x\5x\u0758\nx\3x\3x\3x\5x\u075d\nx\3x\3x\5x\u0761\nx\3x\5x\u0764"+
		"\nx\3x\5x\u0767\nx\3x\3x\5x\u076b\nx\3x\5x\u076e\nx\3x\5x\u0771\nx\3x"+
		"\3x\5x\u0775\nx\3x\3x\5x\u0779\nx\3y\3y\5y\u077d\ny\3y\5y\u0780\ny\3y"+
		"\5y\u0783\ny\3y\3y\3z\3z\5z\u0789\nz\3z\5z\u078c\nz\3z\5z\u078f\nz\3z"+
		"\3z\3z\3z\3z\3z\5z\u0797\nz\3z\5z\u079a\nz\3z\5z\u079d\nz\3z\3z\5z\u07a1"+
		"\nz\3{\3{\3|\3|\5|\u07a7\n|\3|\5|\u07aa\n|\3|\5|\u07ad\n|\3|\3|\3|\3|"+
		"\3|\3|\5|\u07b5\n|\3|\5|\u07b8\n|\3|\5|\u07bb\n|\3|\5|\u07be\n|\3}\3}"+
		"\5}\u07c2\n}\3}\5}\u07c5\n}\3}\5}\u07c8\n}\3}\7}\u07cb\n}\f}\16}\u07ce"+
		"\13}\3~\3~\3\177\3\177\3\u0080\3\u0080\7\u0080\u07d6\n\u0080\f\u0080\16"+
		"\u0080\u07d9\13\u0080\3\u0080\5\u0080\u07dc\n\u0080\3\u0080\3\u0080\5"+
		"\u0080\u07e0\n\u0080\3\u0080\3\u0080\5\u0080\u07e4\n\u0080\6\u0080\u07e6"+
		"\n\u0080\r\u0080\16\u0080\u07e7\3\u0080\3\u0080\3\u0080\5\u0080\u07ed"+
		"\n\u0080\3\u0080\3\u0080\3\u0080\3\u0080\7\u0080\u07f3\n\u0080\f\u0080"+
		"\16\u0080\u07f6\13\u0080\3\u0080\3\u0080\5\u0080\u07fa\n\u0080\5\u0080"+
		"\u07fc\n\u0080\7\u0080\u07fe\n\u0080\f\u0080\16\u0080\u0801\13\u0080\3"+
		"\u0080\3\u0080\3\u0081\3\u0081\5\u0081\u0807\n\u0081\3\u0081\3\u0081\3"+
		"\u0081\5\u0081\u080c\n\u0081\3\u0081\3\u0081\5\u0081\u0810\n\u0081\3\u0081"+
		"\5\u0081\u0813\n\u0081\3\u0081\5\u0081\u0816\n\u0081\3\u0081\5\u0081\u0819"+
		"\n\u0081\3\u0081\3\u0081\5\u0081\u081d\n\u0081\3\u0081\3\u0081\5\u0081"+
		"\u0821\n\u0081\3\u0081\5\u0081\u0824\n\u0081\3\u0081\5\u0081\u0827\n\u0081"+
		"\3\u0081\3\u0081\5\u0081\u082b\n\u0081\3\u0081\3\u0081\3\u0081\5\u0081"+
		"\u0830\n\u0081\3\u0081\5\u0081\u0833\n\u0081\3\u0081\5\u0081\u0836\n\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u083f"+
		"\n\u0081\3\u0081\5\u0081\u0842\n\u0081\3\u0081\5\u0081\u0845\n\u0081\3"+
		"\u0081\5\u0081\u0848\n\u0081\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u084e"+
		"\n\u0081\3\u0081\5\u0081\u0851\n\u0081\3\u0081\5\u0081\u0854\n\u0081\3"+
		"\u0081\5\u0081\u0857\n\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u085c\n\u0081"+
		"\3\u0081\5\u0081\u085f\n\u0081\3\u0081\5\u0081\u0862\n\u0081\3\u0081\7"+
		"\u0081\u0865\n\u0081\f\u0081\16\u0081\u0868\13\u0081\3\u0082\3\u0082\5"+
		"\u0082\u086c\n\u0082\3\u0082\3\u0082\5\u0082\u0870\n\u0082\7\u0082\u0872"+
		"\n\u0082\f\u0082\16\u0082\u0875\13\u0082\3\u0082\5\u0082\u0878\n\u0082"+
		"\3\u0082\5\u0082\u087b\n\u0082\3\u0082\3\u0082\5\u0082\u087f\n\u0082\7"+
		"\u0082\u0881\n\u0082\f\u0082\16\u0082\u0884\13\u0082\3\u0082\3\u0082\3"+
		"\u0083\5\u0083\u0889\n\u0083\3\u0083\5\u0083\u088c\n\u0083\3\u0083\5\u0083"+
		"\u088f\n\u0083\3\u0083\5\u0083\u0892\n\u0083\3\u0083\5\u0083\u0895\n\u0083"+
		"\3\u0083\5\u0083\u0898\n\u0083\3\u0083\5\u0083\u089b\n\u0083\3\u0083\5"+
		"\u0083\u089e\n\u0083\3\u0083\5\u0083\u08a1\n\u0083\3\u0083\3\u0083\5\u0083"+
		"\u08a5\n\u0083\7\u0083\u08a7\n\u0083\f\u0083\16\u0083\u08aa\13\u0083\3"+
		"\u0083\7\u0083\u08ad\n\u0083\f\u0083\16\u0083\u08b0\13\u0083\3\u0083\5"+
		"\u0083\u08b3\n\u0083\3\u0083\3\u0083\5\u0083\u08b7\n\u0083\5\u0083\u08b9"+
		"\n\u0083\3\u0084\3\u0084\3\u0085\5\u0085\u08be\n\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u08c7\n\u0085\3\u0086"+
		"\3\u0086\3\u0087\3\u0087\3\u0087\5\u0087\u08ce\n\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\5\u0087\u08d4\n\u0087\3\u0087\3\u0087\5\u0087\u08d8\n"+
		"\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u08dd\n\u0087\3\u0088\5\u0088\u08e0"+
		"\n\u0088\3\u0088\3\u0088\5\u0088\u08e4\n\u0088\3\u0089\3\u0089\5\u0089"+
		"\u08e8\n\u0089\3\u0089\3\u0089\5\u0089\u08ec\n\u0089\3\u0089\2\3\u0100"+
		"\u008a\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea"+
		"\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102"+
		"\u0104\u0106\u0108\u010a\u010c\u010e\u0110\2\34\3\3@@\b\2\b\16OOQRVX_"+
		"_aa\3\2\20\25\3\2\26\31\5\2\b\nOOVV\3\2\20\21\3\2\13\r\4\2\32\32bb\4\2"+
		"!),-\3\2./\3\2\3\4\5\2\3\4\33\34uv\3\2\3\5\4\2\3\4\26\27\3\2uv\3\2\33"+
		"\34\4\2\5\5\33\34\4\2\5\5\17\17\6\2\3\5\17\17\33\34uv\3\2wz\3\2*+\3\2"+
		"\22\23\4\2\21\21\35\36\3\2\62\63\4\2LLSS\5\2\6\6\67\67>>\u0a9c\2\u0115"+
		"\3\2\2\2\4\u0124\3\2\2\2\6\u0126\3\2\2\2\b\u0128\3\2\2\2\n\u012a\3\2\2"+
		"\2\f\u017b\3\2\2\2\16\u0181\3\2\2\2\20\u0195\3\2\2\2\22\u0198\3\2\2\2"+
		"\24\u01a6\3\2\2\2\26\u01a8\3\2\2\2\30\u01ac\3\2\2\2\32\u01b2\3\2\2\2\34"+
		"\u01b4\3\2\2\2\36\u01b8\3\2\2\2 \u01bc\3\2\2\2\"\u01be\3\2\2\2$\u01c6"+
		"\3\2\2\2&\u01d1\3\2\2\2(\u01db\3\2\2\2*\u01dd\3\2\2\2,\u01f1\3\2\2\2."+
		"\u01f3\3\2\2\2\60\u01f7\3\2\2\2\62\u020c\3\2\2\2\64\u020f\3\2\2\2\66\u0236"+
		"\3\2\2\28\u024b\3\2\2\2:\u024d\3\2\2\2<\u0271\3\2\2\2>\u0278\3\2\2\2@"+
		"\u027f\3\2\2\2B\u0281\3\2\2\2D\u0283\3\2\2\2F\u0293\3\2\2\2H\u02a9\3\2"+
		"\2\2J\u02ab\3\2\2\2L\u02ad\3\2\2\2N\u02af\3\2\2\2P\u02b1\3\2\2\2R\u02d0"+
		"\3\2\2\2T\u02d2\3\2\2\2V\u02d4\3\2\2\2X\u02d6\3\2\2\2Z\u0305\3\2\2\2\\"+
		"\u0307\3\2\2\2^\u0309\3\2\2\2`\u030b\3\2\2\2b\u0319\3\2\2\2d\u031d\3\2"+
		"\2\2f\u031f\3\2\2\2h\u0321\3\2\2\2j\u0323\3\2\2\2l\u0325\3\2\2\2n\u0327"+
		"\3\2\2\2p\u0329\3\2\2\2r\u032b\3\2\2\2t\u032d\3\2\2\2v\u032f\3\2\2\2x"+
		"\u0331\3\2\2\2z\u0337\3\2\2\2|\u033c\3\2\2\2~\u0340\3\2\2\2\u0080\u0345"+
		"\3\2\2\2\u0082\u0355\3\2\2\2\u0084\u035a\3\2\2\2\u0086\u038a\3\2\2\2\u0088"+
		"\u038c\3\2\2\2\u008a\u03a6\3\2\2\2\u008c\u03f2\3\2\2\2\u008e\u03f5\3\2"+
		"\2\2\u0090\u041c\3\2\2\2\u0092\u041f\3\2\2\2\u0094\u042b\3\2\2\2\u0096"+
		"\u042e\3\2\2\2\u0098\u0437\3\2\2\2\u009a\u043b\3\2\2\2\u009c\u043f\3\2"+
		"\2\2\u009e\u044c\3\2\2\2\u00a0\u044e\3\2\2\2\u00a2\u0456\3\2\2\2\u00a4"+
		"\u0467\3\2\2\2\u00a6\u04b3\3\2\2\2\u00a8\u04b6\3\2\2\2\u00aa\u04e9\3\2"+
		"\2\2\u00ac\u04eb\3\2\2\2\u00ae\u0501\3\2\2\2\u00b0\u050e\3\2\2\2\u00b2"+
		"\u0510\3\2\2\2\u00b4\u051d\3\2\2\2\u00b6\u0557\3\2\2\2\u00b8\u0577\3\2"+
		"\2\2\u00ba\u057b\3\2\2\2\u00bc\u0591\3\2\2\2\u00be\u059a\3\2\2\2\u00c0"+
		"\u059d\3\2\2\2\u00c2\u05b6\3\2\2\2\u00c4\u05b8\3\2\2\2\u00c6\u05be\3\2"+
		"\2\2\u00c8\u05c2\3\2\2\2\u00ca\u05c4\3\2\2\2\u00cc\u05e9\3\2\2\2\u00ce"+
		"\u062c\3\2\2\2\u00d0\u062e\3\2\2\2\u00d2\u0645\3\2\2\2\u00d4\u065c\3\2"+
		"\2\2\u00d6\u0673\3\2\2\2\u00d8\u068a\3\2\2\2\u00da\u06a1\3\2\2\2\u00dc"+
		"\u06b9\3\2\2\2\u00de\u06d1\3\2\2\2\u00e0\u06e8\3\2\2\2\u00e2\u06ff\3\2"+
		"\2\2\u00e4\u0721\3\2\2\2\u00e6\u0729\3\2\2\2\u00e8\u072f\3\2\2\2\u00ea"+
		"\u0739\3\2\2\2\u00ec\u073b\3\2\2\2\u00ee\u0778\3\2\2\2\u00f0\u077a\3\2"+
		"\2\2\u00f2\u07a0\3\2\2\2\u00f4\u07a2\3\2\2\2\u00f6\u07bd\3\2\2\2\u00f8"+
		"\u07bf\3\2\2\2\u00fa\u07cf\3\2\2\2\u00fc\u07d1\3\2\2\2\u00fe\u07d3\3\2"+
		"\2\2\u0100\u081c\3\2\2\2\u0102\u0869\3\2\2\2\u0104\u08b8\3\2\2\2\u0106"+
		"\u08ba\3\2\2\2\u0108\u08c6\3\2\2\2\u010a\u08c8\3\2\2\2\u010c\u08dc\3\2"+
		"\2\2\u010e\u08df\3\2\2\2\u0110\u08eb\3\2\2\2\u0112\u0114\5\4\3\2\u0113"+
		"\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2"+
		"\2\2\u0116\3\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0125\5\6\4\2\u0119\u0125"+
		"\5\b\5\2\u011a\u0125\5\n\6\2\u011b\u0125\5\20\t\2\u011c\u0125\5\22\n\2"+
		"\u011d\u0125\5\u00a4S\2\u011e\u0125\5\24\13\2\u011f\u0125\5\30\r\2\u0120"+
		"\u0125\5J&\2\u0121\u0125\5L\'\2\u0122\u0125\5z>\2\u0123\u0125\5x=\2\u0124"+
		"\u0118\3\2\2\2\u0124\u0119\3\2\2\2\u0124\u011a\3\2\2\2\u0124\u011b\3\2"+
		"\2\2\u0124\u011c\3\2\2\2\u0124\u011d\3\2\2\2\u0124\u011e\3\2\2\2\u0124"+
		"\u011f\3\2\2\2\u0124\u0120\3\2\2\2\u0124\u0121\3\2\2\2\u0124\u0122\3\2"+
		"\2\2\u0124\u0123\3\2\2\2\u0125\5\3\2\2\2\u0126\u0127\7u\2\2\u0127\7\3"+
		"\2\2\2\u0128\u0129\7v\2\2\u0129\t\3\2\2\2\u012a\u012b\5\f\7\2\u012b\13"+
		"\3\2\2\2\u012c\u017c\7W\2\2\u012d\u0137\7X\2\2\u012e\u0131\7\3\2\2\u012f"+
		"\u0132\5\u00be`\2\u0130\u0132\7B\2\2\u0131\u012f\3\2\2\2\u0131\u0130\3"+
		"\2\2\2\u0132\u0134\3\2\2\2\u0133\u0135\7@\2\2\u0134\u0133\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\7\4\2\2\u0137\u012e\3\2"+
		"\2\2\u0137\u0138\3\2\2\2\u0138\u017c\3\2\2\2\u0139\u013a\7C\2\2\u013a"+
		"\u013c\7\3\2\2\u013b\u013d\7@\2\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2"+
		"\2\2\u013d\u013e\3\2\2\2\u013e\u0140\5\26\f\2\u013f\u0141\7@\2\2\u0140"+
		"\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\7\4"+
		"\2\2\u0143\u017c\3\2\2\2\u0144\u017c\7D\2\2\u0145\u0146\7J\2\2\u0146\u0148"+
		"\7\3\2\2\u0147\u0149\7@\2\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u014c\5\26\f\2\u014b\u014d\7@\2\2\u014c\u014b\3\2"+
		"\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\7\4\2\2\u014f"+
		"\u017c\3\2\2\2\u0150\u0151\7E\2\2\u0151\u0153\7\3\2\2\u0152\u0154\7@\2"+
		"\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0158"+
		"\5\16\b\2\u0156\u0158\7\5\2\2\u0157\u0155\3\2\2\2\u0157\u0156\3\2\2\2"+
		"\u0158\u015a\3\2\2\2\u0159\u015b\7@\2\2\u015a\u0159\3\2\2\2\u015a\u015b"+
		"\3\2\2\2\u015b\u015d\3\2\2\2\u015c\u015e\5\26\f\2\u015d\u015c\3\2\2\2"+
		"\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\7\5\2\2\u0160\u0162"+
		"\7@\2\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163"+
		"\u0165\5\u00caf\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167"+
		"\3\2\2\2\u0166\u0168\7@\2\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169\u016b\7\4\2\2\u016a\u016c\7\5\2\2\u016b\u016a\3\2"+
		"\2\2\u016b\u016c\3\2\2\2\u016c\u017c\3\2\2\2\u016d\u017c\7K\2\2\u016e"+
		"\u016f\7F\2\2\u016f\u0171\7\3\2\2\u0170\u0172\7@\2\2\u0171\u0170\3\2\2"+
		"\2\u0171\u0172\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\5\26\f\2\u0174"+
		"\u0176\7@\2\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\3\2"+
		"\2\2\u0177\u0179\7\4\2\2\u0178\u017a\7\5\2\2\u0179\u0178\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017a\u017c\3\2\2\2\u017b\u012c\3\2\2\2\u017b\u012d\3\2"+
		"\2\2\u017b\u0139\3\2\2\2\u017b\u0144\3\2\2\2\u017b\u0145\3\2\2\2\u017b"+
		"\u0150\3\2\2\2\u017b\u016d\3\2\2\2\u017b\u016e\3\2\2\2\u017c\r\3\2\2\2"+
		"\u017d\u0182\5\u00a4S\2\u017e\u017f\5\u00caf\2\u017f\u0180\7\5\2\2\u0180"+
		"\u0182\3\2\2\2\u0181\u017d\3\2\2\2\u0181\u017e\3\2\2\2\u0182\17\3\2\2"+
		"\2\u0183\u0184\7G\2\2\u0184\u0196\7\5\2\2\u0185\u0186\7I\2\2\u0186\u0196"+
		"\7\5\2\2\u0187\u0188\7L\2\2\u0188\u0189\5\u00c2b\2\u0189\u018a\7\5\2\2"+
		"\u018a\u0196\3\2\2\2\u018b\u018d\7M\2\2\u018c\u018e\5\u00caf\2\u018d\u018c"+
		"\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0196\7\5\2\2\u0190"+
		"\u0192\7Y\2\2\u0191\u0193\5\u00caf\2\u0192\u0191\3\2\2\2\u0192\u0193\3"+
		"\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196\7\5\2\2\u0195\u0183\3\2\2\2\u0195"+
		"\u0185\3\2\2\2\u0195\u0187\3\2\2\2\u0195\u018b\3\2\2\2\u0195\u0190\3\2"+
		"\2\2\u0196\21\3\2\2\2\u0197\u0199\7H\2\2\u0198\u0197\3\2\2\2\u0198\u0199"+
		"\3\2\2\2\u0199\u019e\3\2\2\2\u019a\u019f\5\u00c2b\2\u019b\u019f\5\u00c4"+
		"c\2\u019c\u019f\7}\2\2\u019d\u019f\5\u00e6t\2\u019e\u019a\3\2\2\2\u019e"+
		"\u019b\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019d\3\2\2\2\u019f\u01a0\3\2"+
		"\2\2\u01a0\u01a1\7\6\2\2\u01a1\23\3\2\2\2\u01a2\u01a3\5\u00caf\2\u01a3"+
		"\u01a4\7\5\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a7\5\u010a\u0086\2\u01a6\u01a2"+
		"\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7\25\3\2\2\2\u01a8\u01a9\5\u00caf\2\u01a9"+
		"\27\3\2\2\2\u01aa\u01ad\5\32\16\2\u01ab\u01ad\5&\24\2\u01ac\u01aa\3\2"+
		"\2\2\u01ac\u01ab\3\2\2\2\u01ad\31\3\2\2\2\u01ae\u01b3\5\34\17\2\u01af"+
		"\u01b3\5\36\20\2\u01b0\u01b3\5 \21\2\u01b1\u01b3\5\"\22\2\u01b2\u01ae"+
		"\3\2\2\2\u01b2\u01af\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b1\3\2\2\2\u01b3"+
		"\33\3\2\2\2\u01b4\u01b5\7c\2\2\u01b5\u01b6\5$\23\2\u01b6\u01b7\b\17\1"+
		"\2\u01b7\35\3\2\2\2\u01b8\u01b9\7d\2\2\u01b9\u01ba\5$\23\2\u01ba\u01bb"+
		"\b\20\1\2\u01bb\37\3\2\2\2\u01bc\u01bd\7e\2\2\u01bd!\3\2\2\2\u01be\u01bf"+
		"\7f\2\2\u01bf#\3\2\2\2\u01c0\u01c7\5\26\f\2\u01c1\u01c2\7\3\2\2\u01c2"+
		"\u01c3\5\26\f\2\u01c3\u01c4\7\4\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c7\5"+
		".\30\2\u01c6\u01c0\3\2\2\2\u01c6\u01c1\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7"+
		"%\3\2\2\2\u01c8\u01d2\5(\25\2\u01c9\u01d2\5*\26\2\u01ca\u01d2\5\66\34"+
		"\2\u01cb\u01d2\58\35\2\u01cc\u01d2\5> \2\u01cd\u01d2\5@!\2\u01ce\u01d2"+
		"\5F$\2\u01cf\u01d2\5H%\2\u01d0\u01d2\5\64\33\2\u01d1\u01c8\3\2\2\2\u01d1"+
		"\u01c9\3\2\2\2\u01d1\u01ca\3\2\2\2\u01d1\u01cb\3\2\2\2\u01d1\u01cc\3\2"+
		"\2\2\u01d1\u01cd\3\2\2\2\u01d1\u01ce\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1"+
		"\u01d0\3\2\2\2\u01d2\'\3\2\2\2\u01d3\u01d4\7g\2\2\u01d4\u01d5\5,\27\2"+
		"\u01d5\u01d6\t\2\2\2\u01d6\u01dc\3\2\2\2\u01d7\u01d8\7g\2\2\u01d8\u01d9"+
		"\5,\27\2\u01d9\u01da\5\62\32\2\u01da\u01dc\3\2\2\2\u01db\u01d3\3\2\2\2"+
		"\u01db\u01d7\3\2\2\2\u01dc)\3\2\2\2\u01dd\u01de\7h\2\2\u01de\u01df\5,"+
		"\27\2\u01df+\3\2\2\2\u01e0\u01e5\5\u00c2b\2\u01e1\u01e2\7\3\2\2\u01e2"+
		"\u01e3\5\60\31\2\u01e3\u01e4\7\4\2\2\u01e4\u01e6\3\2\2\2\u01e5\u01e1\3"+
		"\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01f2\3\2\2\2\u01e7\u01f2\5.\30\2\u01e8"+
		"\u01f2\7s\2\2\u01e9\u01ee\7\7\2\2\u01ea\u01eb\7\3\2\2\u01eb\u01ec\5\60"+
		"\31\2\u01ec\u01ed\7\4\2\2\u01ed\u01ef\3\2\2\2\u01ee\u01ea\3\2\2\2\u01ee"+
		"\u01ef\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01f2\58\35\2\u01f1\u01e0\3\2"+
		"\2\2\u01f1\u01e7\3\2\2\2\u01f1\u01e8\3\2\2\2\u01f1\u01e9\3\2\2\2\u01f1"+
		"\u01f0\3\2\2\2\u01f2-\3\2\2\2\u01f3\u01f4\t\3\2\2\u01f4/\3\2\2\2\u01f5"+
		"\u01f8\5\u00c2b\2\u01f6\u01f8\7B\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f6\3"+
		"\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u0200\3\2\2\2\u01f9\u01fc\7\17\2\2\u01fa"+
		"\u01fd\5\u00c2b\2\u01fb\u01fd\7B\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fb\3"+
		"\2\2\2\u01fd\u01ff\3\2\2\2\u01fe\u01f9\3\2\2\2\u01ff\u0202\3\2\2\2\u0200"+
		"\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\61\3\2\2\2\u0202\u0200\3\2\2"+
		"\2\u0203\u0207\5\u00caf\2\u0204\u0205\7A\2\2\u0205\u0207\7@\2\2\u0206"+
		"\u0203\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0206\3\2"+
		"\2\2\u0208\u0209\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020d\t\2\2\2\u020b"+
		"\u020d\b\32\1\2\u020c\u0206\3\2\2\2\u020c\u020b\3\2\2\2\u020d\63\3\2\2"+
		"\2\u020e\u0210\5,\27\2\u020f\u020e\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0211"+
		"\3\2\2\2\u0211\u0212\5,\27\2\u0212\u022f\7\3\2\2\u0213\u0218\5\u00caf"+
		"\2\u0214\u0218\5\u00b6\\\2\u0215\u0218\5P)\2\u0216\u0218\5^\60\2\u0217"+
		"\u0213\3\2\2\2\u0217\u0214\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0216\3\2"+
		"\2\2\u0217\u0218\3\2\2\2\u0218\u021a\3\2\2\2\u0219\u021b\7@\2\2\u021a"+
		"\u0219\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u0228\3\2\2\2\u021c\u021e\7\17"+
		"\2\2\u021d\u021f\7@\2\2\u021e\u021d\3\2\2\2\u021e\u021f\3\2\2\2\u021f"+
		"\u0224\3\2\2\2\u0220\u0225\5\u00caf\2\u0221\u0225\5\u00b6\\\2\u0222\u0225"+
		"\5P)\2\u0223\u0225\5^\60\2\u0224\u0220\3\2\2\2\u0224\u0221\3\2\2\2\u0224"+
		"\u0222\3\2\2\2\u0224\u0223\3\2\2\2\u0225\u0227\3\2\2\2\u0226\u021c\3\2"+
		"\2\2\u0227\u022a\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229"+
		"\u022c\3\2\2\2\u022a\u0228\3\2\2\2\u022b\u022d\7\17\2\2\u022c\u022b\3"+
		"\2\2\2\u022c\u022d\3\2\2\2\u022d\u0230\3\2\2\2\u022e\u0230\7P\2\2\u022f"+
		"\u0217\3\2\2\2\u022f\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0232\7\4"+
		"\2\2\u0232\65\3\2\2\2\u0233\u0234\7i\2\2\u0234\u0237\7~\2\2\u0235\u0237"+
		"\7i\2\2\u0236\u0233\3\2\2\2\u0236\u0235\3\2\2\2\u0237\67\3\2\2\2\u0238"+
		"\u023a\7j\2\2\u0239\u023b\7~\2\2\u023a\u0239\3\2\2\2\u023a\u023b\3\2\2"+
		"\2\u023b\u024c\3\2\2\2\u023c\u023d\7r\2\2\u023d\u023e\7\3\2\2\u023e\u0240"+
		"\7\3\2\2\u023f\u0241\5:\36\2\u0240\u023f\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"\u0242\3\2\2\2\u0242\u0243\7\4\2\2\u0243\u024c\7\4\2\2\u0244\u0245\7r"+
		"\2\2\u0245\u0247\7\3\2\2\u0246\u0248\5:\36\2\u0247\u0246\3\2\2\2\u0247"+
		"\u0248\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024c\7\4\2\2\u024a\u024c\7r"+
		"\2\2\u024b\u0238\3\2\2\2\u024b\u023c\3\2\2\2\u024b\u0244\3\2\2\2\u024b"+
		"\u024a\3\2\2\2\u024c9\3\2\2\2\u024d\u0252\5<\37\2\u024e\u024f\7\17\2\2"+
		"\u024f\u0251\5<\37\2\u0250\u024e\3\2\2\2\u0251\u0254\3\2\2\2\u0252\u0250"+
		"\3\2\2\2\u0252\u0253\3\2\2\2\u0253;\3\2\2\2\u0254\u0252\3\2\2\2\u0255"+
		"\u0272\5,\27\2\u0256\u0257\5,\27\2\u0257\u0258\7\3\2\2\u0258\u025d\5\u00c2"+
		"b\2\u0259\u025a\7\17\2\2\u025a\u025c\5\u00caf\2\u025b\u0259\3\2\2\2\u025c"+
		"\u025f\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0260\3\2"+
		"\2\2\u025f\u025d\3\2\2\2\u0260\u0261\7\4\2\2\u0261\u0272\3\2\2\2\u0262"+
		"\u0263\5,\27\2\u0263\u0265\7\3\2\2\u0264\u0266\5\u00caf\2\u0265\u0264"+
		"\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u026b\3\2\2\2\u0267\u0268\7\17\2\2"+
		"\u0268\u026a\5\u00caf\2\u0269\u0267\3\2\2\2\u026a\u026d\3\2\2\2\u026b"+
		"\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026e\3\2\2\2\u026d\u026b\3\2"+
		"\2\2\u026e\u026f\7\4\2\2\u026f\u0272\3\2\2\2\u0270\u0272\5R*\2\u0271\u0255"+
		"\3\2\2\2\u0271\u0256\3\2\2\2\u0271\u0262\3\2\2\2\u0271\u0270\3\2\2\2\u0272"+
		"=\3\2\2\2\u0273\u0274\7k\2\2\u0274\u0279\5B\"\2\u0275\u0276\7k\2\2\u0276"+
		"\u0279\5,\27\2\u0277\u0279\7k\2\2\u0278\u0273\3\2\2\2\u0278\u0275\3\2"+
		"\2\2\u0278\u0277\3\2\2\2\u0279?\3\2\2\2\u027a\u027b\7l\2\2\u027b\u0280"+
		"\5B\"\2\u027c\u027d\7l\2\2\u027d\u0280\5,\27\2\u027e\u0280\7l\2\2\u027f"+
		"\u027a\3\2\2\2\u027f\u027c\3\2\2\2\u027f\u027e\3\2\2\2\u0280A\3\2\2\2"+
		"\u0281\u0282\5D#\2\u0282C\3\2\2\2\u0283\u0284\7~\2\2\u0284E\3\2\2\2\u0285"+
		"\u0286\7m\2\2\u0286\u0287\7x\2\2\u0287\u0294\7~\2\2\u0288\u0289\7m\2\2"+
		"\u0289\u028a\7x\2\2\u028a\u0294\5,\27\2\u028b\u028c\7m\2\2\u028c\u028d"+
		"\5,\27\2\u028d\u028e\7~\2\2\u028e\u0294\3\2\2\2\u028f\u0290\7m\2\2\u0290"+
		"\u0294\5,\27\2\u0291\u0292\7m\2\2\u0292\u0294\7x\2\2\u0293\u0285\3\2\2"+
		"\2\u0293\u0288\3\2\2\2\u0293\u028b\3\2\2\2\u0293\u028f\3\2\2\2\u0293\u0291"+
		"\3\2\2\2\u0294G\3\2\2\2\u0295\u0297\7n\2\2\u0296\u0298\7o\2\2\u0297\u0296"+
		"\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029a\7p\2\2\u029a"+
		"\u029b\7~\2\2\u029b\u02aa\b%\1\2\u029c\u029e\7n\2\2\u029d\u029f\7o\2\2"+
		"\u029e\u029d\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a4"+
		"\7p\2\2\u02a1\u02a3\5\u00c2b\2\u02a2\u02a1\3\2\2\2\u02a3\u02a6\3\2\2\2"+
		"\u02a4\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02aa\3\2\2\2\u02a6\u02a4"+
		"\3\2\2\2\u02a7\u02a8\7n\2\2\u02a8\u02aa\b%\1\2\u02a9\u0295\3\2\2\2\u02a9"+
		"\u029c\3\2\2\2\u02a9\u02a7\3\2\2\2\u02aaI\3\2\2\2\u02ab\u02ac\7|\2\2\u02ac"+
		"K\3\2\2\2\u02ad\u02ae\7@\2\2\u02aeM\3\2\2\2\u02af\u02b0\t\4\2\2\u02b0"+
		"O\3\2\2\2\u02b1\u02b2\t\5\2\2\u02b2Q\3\2\2\2\u02b3\u02d1\7w\2\2\u02b4"+
		"\u02d1\7y\2\2\u02b5\u02d1\7x\2\2\u02b6\u02ba\7~\2\2\u02b7\u02b9\7@\2\2"+
		"\u02b8\u02b7\3\2\2\2\u02b9\u02bc\3\2\2\2\u02ba\u02b8\3\2\2\2\u02ba\u02bb"+
		"\3\2\2\2\u02bb\u02c0\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bd\u02bf\7|\2\2\u02be"+
		"\u02bd\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2"+
		"\2\2\u02c1\u02c6\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c5\7@\2\2\u02c4"+
		"\u02c3\3\2\2\2\u02c5\u02c8\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c6\u02c7\3\2"+
		"\2\2\u02c7\u02ca\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c9\u02b6\3\2\2\2\u02ca"+
		"\u02cb\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02d1\3\2"+
		"\2\2\u02cd\u02d1\7}\2\2\u02ce\u02d1\7{\2\2\u02cf\u02d1\7z\2\2\u02d0\u02b3"+
		"\3\2\2\2\u02d0\u02b4\3\2\2\2\u02d0\u02b5\3\2\2\2\u02d0\u02c9\3\2\2\2\u02d0"+
		"\u02cd\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d0\u02cf\3\2\2\2\u02d1S\3\2\2\2"+
		"\u02d2\u02d3\t\6\2\2\u02d3U\3\2\2\2\u02d4\u02d5\t\7\2\2\u02d5W\3\2\2\2"+
		"\u02d6\u02d7\t\b\2\2\u02d7Y\3\2\2\2\u02d8\u02db\t\t\2\2\u02d9\u02da\7"+
		"\33\2\2\u02da\u02dc\7\34\2\2\u02db\u02d9\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc"+
		"\u0306\3\2\2\2\u02dd\u0306\7\22\2\2\u02de\u0306\7\23\2\2\u02df\u0306\7"+
		"\21\2\2\u02e0\u0306\7\35\2\2\u02e1\u0306\7\36\2\2\u02e2\u0306\7\37\2\2"+
		"\u02e3\u0306\7\20\2\2\u02e4\u0306\7 \2\2\u02e5\u0306\7\24\2\2\u02e6\u0306"+
		"\7\25\2\2\u02e7\u0306\7!\2\2\u02e8\u0306\7\26\2\2\u02e9\u0306\7\27\2\2"+
		"\u02ea\u0306\7\"\2\2\u02eb\u0306\7#\2\2\u02ec\u0306\7$\2\2\u02ed\u0306"+
		"\7%\2\2\u02ee\u0306\7&\2\2\u02ef\u0306\7\'\2\2\u02f0\u0306\7(\2\2\u02f1"+
		"\u0306\7)\2\2\u02f2\u0306\7*\2\2\u02f3\u0306\7+\2\2\u02f4\u0306\7,\2\2"+
		"\u02f5\u0306\7-\2\2\u02f6\u0306\7.\2\2\u02f7\u0306\7/\2\2\u02f8\u0306"+
		"\7\30\2\2\u02f9\u0306\7\31\2\2\u02fa\u0306\7\60\2\2\u02fb\u0306\7\61\2"+
		"\2\u02fc\u0306\7\62\2\2\u02fd\u0306\7\63\2\2\u02fe\u0306\7\17\2\2\u02ff"+
		"\u0306\7\64\2\2\u0300\u0306\7\65\2\2\u0301\u0302\7\3\2\2\u0302\u0306\7"+
		"\4\2\2\u0303\u0304\7\33\2\2\u0304\u0306\7\34\2\2\u0305\u02d8\3\2\2\2\u0305"+
		"\u02dd\3\2\2\2\u0305\u02de\3\2\2\2\u0305\u02df\3\2\2\2\u0305\u02e0\3\2"+
		"\2\2\u0305\u02e1\3\2\2\2\u0305\u02e2\3\2\2\2\u0305\u02e3\3\2\2\2\u0305"+
		"\u02e4\3\2\2\2\u0305\u02e5\3\2\2\2\u0305\u02e6\3\2\2\2\u0305\u02e7\3\2"+
		"\2\2\u0305\u02e8\3\2\2\2\u0305\u02e9\3\2\2\2\u0305\u02ea\3\2\2\2\u0305"+
		"\u02eb\3\2\2\2\u0305\u02ec\3\2\2\2\u0305\u02ed\3\2\2\2\u0305\u02ee\3\2"+
		"\2\2\u0305\u02ef\3\2\2\2\u0305\u02f0\3\2\2\2\u0305\u02f1\3\2\2\2\u0305"+
		"\u02f2\3\2\2\2\u0305\u02f3\3\2\2\2\u0305\u02f4\3\2\2\2\u0305\u02f5\3\2"+
		"\2\2\u0305\u02f6\3\2\2\2\u0305\u02f7\3\2\2\2\u0305\u02f8\3\2\2\2\u0305"+
		"\u02f9\3\2\2\2\u0305\u02fa\3\2\2\2\u0305\u02fb\3\2\2\2\u0305\u02fc\3\2"+
		"\2\2\u0305\u02fd\3\2\2\2\u0305\u02fe\3\2\2\2\u0305\u02ff\3\2\2\2\u0305"+
		"\u0300\3\2\2\2\u0305\u0301\3\2\2\2\u0305\u0303\3\2\2\2\u0306[\3\2\2\2"+
		"\u0307\u0308\t\n\2\2\u0308]\3\2\2\2\u0309\u030a\t\13\2\2\u030a_\3\2\2"+
		"\2\u030b\u030c\7`\2\2\u030c\u030d\7\26\2\2\u030d\u030e\5b\62\2\u030e\u030f"+
		"\7\27\2\2\u030fa\3\2\2\2\u0310\u0311\7\26\2\2\u0311\u0312\5b\62\2\u0312"+
		"\u0313\7\27\2\2\u0313\u031a\3\2\2\2\u0314\u0315\7\3\2\2\u0315\u0316\5"+
		"b\62\2\u0316\u0317\7\4\2\2\u0317\u031a\3\2\2\2\u0318\u031a\5j\66\2\u0319"+
		"\u0310\3\2\2\2\u0319\u0314\3\2\2\2\u0319\u0318\3\2\2\2\u031a\u031b\3\2"+
		"\2\2\u031b\u0319\3\2\2\2\u031b\u031c\3\2\2\2\u031cc\3\2\2\2\u031d\u031e"+
		"\n\f\2\2\u031ee\3\2\2\2\u031f\u0320\n\r\2\2\u0320g\3\2\2\2\u0321\u0322"+
		"\n\16\2\2\u0322i\3\2\2\2\u0323\u0324\n\17\2\2\u0324k\3\2\2\2\u0325\u0326"+
		"\n\20\2\2\u0326m\3\2\2\2\u0327\u0328\n\21\2\2\u0328o\3\2\2\2\u0329\u032a"+
		"\n\22\2\2\u032aq\3\2\2\2\u032b\u032c\n\23\2\2\u032cs\3\2\2\2\u032d\u032e"+
		"\n\24\2\2\u032eu\3\2\2\2\u032f\u0330\n\r\2\2\u0330w\3\2\2\2\u0331\u0332"+
		"\13\2\2\2\u0332y\3\2\2\2\u0333\u0338\5|?\2\u0334\u0338\5~@\2\u0335\u0338"+
		"\5\u0080A\2\u0336\u0338\5\u0084C\2\u0337\u0333\3\2\2\2\u0337\u0334\3\2"+
		"\2\2\u0337\u0335\3\2\2\2\u0337\u0336\3\2\2\2\u0338{\3\2\2\2\u0339\u033a"+
		"\5,\27\2\u033a\u033b\7\17\2\2\u033b\u033d\3\2\2\2\u033c\u0339\3\2\2\2"+
		"\u033d\u033e\3\2\2\2\u033e\u033c\3\2\2\2\u033e\u033f\3\2\2\2\u033f}\3"+
		"\2\2\2\u0340\u0341\7T\2\2\u0341\u0343\7\66\2\2\u0342\u0344\7u\2\2\u0343"+
		"\u0342\3\2\2\2\u0343\u0344\3\2\2\2\u0344\177\3\2\2\2\u0345\u0347\5\64"+
		"\33\2\u0346\u0348\7@\2\2\u0347\u0346\3\2\2\2\u0347\u0348\3\2\2\2\u0348"+
		"\u034a\3\2\2\2\u0349\u034b\5,\27\2\u034a\u0349\3\2\2\2\u034a\u034b\3\2"+
		"\2\2\u034b\u034d\3\2\2\2\u034c\u034e\7@\2\2\u034d\u034c\3\2\2\2\u034d"+
		"\u034e\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0351\5\64\33\2\u0350\u0352\7"+
		"@\2\2\u0351\u0350\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0353\3\2\2\2\u0353"+
		"\u0354\5\u00acW\2\u0354\u0081\3\2\2\2\u0355\u0356\7\7\2\2\u0356\u0357"+
		"\7\3\2\2\u0357\u0358\5\u009eP\2\u0358\u0359\7\4\2\2\u0359\u0083\3\2\2"+
		"\2\u035a\u035b\7s\2\2\u035b\u0085\3\2\2\2\u035c\u035e\5`\61\2\u035d\u035c"+
		"\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u0360\3\2\2\2\u035f\u0361\5\u008aF"+
		"\2\u0360\u035f\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0366\3\2\2\2\u0362\u0364"+
		"\58\35\2\u0363\u0365\7@\2\2\u0364\u0363\3\2\2\2\u0364\u0365\3\2\2\2\u0365"+
		"\u0367\3\2\2\2\u0366\u0362\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0368\3\2"+
		"\2\2\u0368\u036a\5\u009eP\2\u0369\u036b\7@\2\2\u036a\u0369\3\2\2\2\u036a"+
		"\u036b\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036e\5\u008cG\2\u036d\u036f"+
		"\5\u0096L\2\u036e\u036d\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0371\3\2\2"+
		"\2\u0370\u0372\7@\2\2\u0371\u0370\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0374"+
		"\3\2\2\2\u0373\u0375\7|\2\2\u0374\u0373\3\2\2\2\u0374\u0375\3\2\2\2\u0375"+
		"\u0377\3\2\2\2\u0376\u0378\7@\2\2\u0377\u0376\3\2\2\2\u0377\u0378\3\2"+
		"\2\2\u0378\u0379\3\2\2\2\u0379\u037a\5\u0094K\2\u037a\u038b\3\2\2\2\u037b"+
		"\u037d\5\u008aF\2\u037c\u037b\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037e"+
		"\3\2\2\2\u037e\u0380\5\u0088E\2\u037f\u0381\7@\2\2\u0380\u037f\3\2\2\2"+
		"\u0380\u0381\3\2\2\2\u0381\u0383\3\2\2\2\u0382\u0384\7|\2\2\u0383\u0382"+
		"\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0386\3\2\2\2\u0385\u0387\7@\2\2\u0386"+
		"\u0385\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u0389\5\u0094"+
		"K\2\u0389\u038b\3\2\2\2\u038a\u035d\3\2\2\2\u038a\u037c\3\2\2\2\u038b"+
		"\u0087\3\2\2\2\u038c\u038d\5\64\33\2\u038d\u0089\3\2\2\2\u038e\u0390\5"+
		"T+\2\u038f\u0391\7@\2\2\u0390\u038f\3\2\2\2\u0390\u0391\3\2\2\2\u0391"+
		"\u0393\3\2\2\2\u0392\u038e\3\2\2\2\u0393\u0396\3\2\2\2\u0394\u0392\3\2"+
		"\2\2\u0394\u0395\3\2\2\2\u0395\u0397\3\2\2\2\u0396\u0394\3\2\2\2\u0397"+
		"\u0398\5\u00b6\\\2\u0398\u039f\3\2\2\2\u0399\u039b\5V,\2\u039a\u039c\7"+
		"@\2\2\u039b\u039a\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039e\3\2\2\2\u039d"+
		"\u0399\3\2\2\2\u039e\u03a1\3\2\2\2\u039f\u039d\3\2\2\2\u039f\u03a0\3\2"+
		"\2\2\u03a0\u03a7\3\2\2\2\u03a1\u039f\3\2\2\2\u03a2\u03a4\5\64\33\2\u03a3"+
		"\u03a5\7@\2\2\u03a4\u03a3\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a7\3\2"+
		"\2\2\u03a6\u0394\3\2\2\2\u03a6\u03a2\3\2\2\2\u03a7\u008b\3\2\2\2\u03a8"+
		"\u03aa\7\3\2\2\u03a9\u03ab\7@\2\2\u03aa\u03a9\3\2\2\2\u03aa\u03ab\3\2"+
		"\2\2\u03ab\u03ad\3\2\2\2\u03ac\u03ae\5\u008eH\2\u03ad\u03ac\3\2\2\2\u03ad"+
		"\u03ae\3\2\2\2\u03ae\u03b0\3\2\2\2\u03af\u03b1\7@\2\2\u03b0\u03af\3\2"+
		"\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b4\7\4\2\2\u03b3"+
		"\u03b5\7\21\2\2\u03b4\u03b3\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03bc\3"+
		"\2\2\2\u03b6\u03b8\7S\2\2\u03b7\u03b9\7@\2\2\u03b8\u03b7\3\2\2\2\u03b8"+
		"\u03b9\3\2\2\2\u03b9\u03bb\3\2\2\2\u03ba\u03b6\3\2\2\2\u03bb\u03be\3\2"+
		"\2\2\u03bc\u03ba\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03c0\3\2\2\2\u03be"+
		"\u03bc\3\2\2\2\u03bf\u03c1\5\u00a0Q\2\u03c0\u03bf\3\2\2\2\u03c0\u03c1"+
		"\3\2\2\2\u03c1\u03f3\3\2\2\2\u03c2\u03c4\7\3\2\2\u03c3\u03c5\7@\2\2\u03c4"+
		"\u03c3\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03ce\5\u00ba"+
		"^\2\u03c7\u03c9\7\17\2\2\u03c8\u03ca\7@\2\2\u03c9\u03c8\3\2\2\2\u03c9"+
		"\u03ca\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cd\5\u00ba^\2\u03cc\u03c7"+
		"\3\2\2\2\u03cd\u03d0\3\2\2\2\u03ce\u03cc\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf"+
		"\u03d2\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d1\u03d3\7@\2\2\u03d2\u03d1\3\2"+
		"\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d6\7\4\2\2\u03d5"+
		"\u03d7\7@\2\2\u03d6\u03d5\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03ee\3\2"+
		"\2\2\u03d8\u03d9\5\u00b6\\\2\u03d9\u03e1\5\u0092J\2\u03da\u03dc\7\17\2"+
		"\2\u03db\u03dd\7@\2\2\u03dc\u03db\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03de"+
		"\3\2\2\2\u03de\u03e0\5\u0092J\2\u03df\u03da\3\2\2\2\u03e0\u03e3\3\2\2"+
		"\2\u03e1\u03df\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e4\3\2\2\2\u03e3\u03e1"+
		"\3\2\2\2\u03e4\u03e6\7\5\2\2\u03e5\u03e7\7@\2\2\u03e6\u03e5\3\2\2\2\u03e6"+
		"\u03e7\3\2\2\2\u03e7\u03e9\3\2\2\2\u03e8\u03ea\7|\2\2\u03e9\u03e8\3\2"+
		"\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03ec\3\2\2\2\u03eb\u03ed\7@\2\2\u03ec"+
		"\u03eb\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03ef\3\2\2\2\u03ee\u03d8\3\2"+
		"\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1"+
		"\u03f3\3\2\2\2\u03f2\u03a8\3\2\2\2\u03f2\u03c2\3\2\2\2\u03f3\u008d\3\2"+
		"\2\2\u03f4\u03f6\7|\2\2\u03f5\u03f4\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6"+
		"\u03f8\3\2\2\2\u03f7\u03f9\7@\2\2\u03f8\u03f7\3\2\2\2\u03f8\u03f9\3\2"+
		"\2\2\u03f9\u03fa\3\2\2\2\u03fa\u0408\5\u0090I\2\u03fb\u03fd\7\17\2\2\u03fc"+
		"\u03fe\7@\2\2\u03fd\u03fc\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u0400\3\2"+
		"\2\2\u03ff\u0401\7|\2\2\u0400\u03ff\3\2\2\2\u0400\u0401\3\2\2\2\u0401"+
		"\u0403\3\2\2\2\u0402\u0404\7@\2\2\u0403\u0402\3\2\2\2\u0403\u0404\3\2"+
		"\2\2\u0404\u0405\3\2\2\2\u0405\u0407\5\u0090I\2\u0406\u03fb\3\2\2\2\u0407"+
		"\u040a\3\2\2\2\u0408\u0406\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u0416\3\2"+
		"\2\2\u040a\u0408\3\2\2\2\u040b\u040d\7\17\2\2\u040c\u040e\7@\2\2\u040d"+
		"\u040c\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u0410\3\2\2\2\u040f\u0411\7|"+
		"\2\2\u0410\u040f\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0413\3\2\2\2\u0412"+
		"\u0414\7@\2\2\u0413\u0412\3\2\2\2\u0413\u0414\3\2\2\2\u0414\u0415\3\2"+
		"\2\2\u0415\u0417\7B\2\2\u0416\u040b\3\2\2\2\u0416\u0417\3\2\2\2\u0417"+
		"\u008f\3\2\2\2\u0418\u041d\7P\2\2\u0419\u041a\5\u00b6\\\2\u041a\u041b"+
		"\5\u0092J\2\u041b\u041d\3\2\2\2\u041c\u0418\3\2\2\2\u041c\u0419\3\2\2"+
		"\2\u041d\u0091\3\2\2\2\u041e\u0420\5\u00c6d\2\u041f\u041e\3\2\2\2\u041f"+
		"\u0420\3\2\2\2\u0420\u0426\3\2\2\2\u0421\u0422\7\3\2\2\u0422\u0423\5\u0092"+
		"J\2\u0423\u0424\7\4\2\2\u0424\u0427\3\2\2\2\u0425\u0427\5\u00ba^\2\u0426"+
		"\u0421\3\2\2\2\u0426\u0425\3\2\2\2\u0427\u0429\3\2\2\2\u0428\u042a\5\u0110"+
		"\u0089\2\u0429\u0428\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u0093\3\2\2\2\u042b"+
		"\u042c\7u\2\2\u042c\u042d\bK\1\2\u042d\u0095\3\2\2\2\u042e\u042f\7\6\2"+
		"\2\u042f\u0434\5\u0098M\2\u0430\u0431\7\17\2\2\u0431\u0433\5\u0098M\2"+
		"\u0432\u0430\3\2\2\2\u0433\u0436\3\2\2\2\u0434\u0432\3\2\2\2\u0434\u0435"+
		"\3\2\2\2\u0435\u0097\3\2\2\2\u0436\u0434\3\2\2\2\u0437\u0438\5\u009aN"+
		"\2\u0438\u0439\5\u009cO\2\u0439\u0099\3\2\2\2\u043a\u043c\7\67\2\2\u043b"+
		"\u043a\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u043d\3\2\2\2\u043d\u043e\5\u00c2"+
		"b\2\u043e\u009b\3\2\2\2\u043f\u0441\7\3\2\2\u0440\u0442\5\u00caf\2\u0441"+
		"\u0440\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0443\3\2\2\2\u0443\u0444\7\4"+
		"\2\2\u0444\u009d\3\2\2\2\u0445\u044d\5\u00c2b\2\u0446\u0447\7\3\2\2\u0447"+
		"\u0448\5\u009eP\2\u0448\u0449\7\4\2\2\u0449\u044d\3\2\2\2\u044a\u044b"+
		"\7_\2\2\u044b\u044d\5Z.\2\u044c\u0445\3\2\2\2\u044c\u0446\3\2\2\2\u044c"+
		"\u044a\3\2\2\2\u044d\u009f\3\2\2\2\u044e\u044f\7Y\2\2\u044f\u0450\7\3"+
		"\2\2\u0450\u0451\5\u00a2R\2\u0451\u0452\7\4\2\2\u0452\u00a1\3\2\2\2\u0453"+
		"\u0455\5d\63\2\u0454\u0453\3\2\2\2\u0455\u0458\3\2\2\2\u0456\u0454\3\2"+
		"\2\2\u0456\u0457\3\2\2\2\u0457\u0464\3\2\2\2\u0458\u0456\3\2\2\2\u0459"+
		"\u045a\7\3\2\2\u045a\u045b\5\u00a2R\2\u045b\u045f\7\4\2\2\u045c\u045e"+
		"\5d\63\2\u045d\u045c\3\2\2\2\u045e\u0461\3\2\2\2\u045f\u045d\3\2\2\2\u045f"+
		"\u0460\3\2\2\2\u0460\u0463\3\2\2\2\u0461\u045f\3\2\2\2\u0462\u0459\3\2"+
		"\2\2\u0463\u0466\3\2\2\2\u0464\u0462\3\2\2\2\u0464\u0465\3\2\2\2\u0465"+
		"\u00a3\3\2\2\2\u0466\u0464\3\2\2\2\u0467\u0468\5\u00a6T\2\u0468\u00a5"+
		"\3\2\2\2\u0469\u046b\5`\61\2\u046a\u0469\3\2\2\2\u046a\u046b\3\2\2\2\u046b"+
		"\u046c\3\2\2\2\u046c\u046e\5\u00aeX\2\u046d\u046f\5\u00acW\2\u046e\u046d"+
		"\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u04b4\3\2\2\2\u0470\u0472\7N\2\2\u0471"+
		"\u0473\7@\2\2\u0472\u0471\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u0475\3\2"+
		"\2\2\u0474\u0470\3\2\2\2\u0474\u0475\3\2\2\2\u0475\u0477\3\2\2\2\u0476"+
		"\u0478\5`\61\2\u0477\u0476\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u0479\3\2"+
		"\2\2\u0479\u047a\5\u00b6\\\2\u047a\u047b\5\u00acW\2\u047b\u04b4\3\2\2"+
		"\2\u047c\u047e\7N\2\2\u047d\u047f\7@\2\2\u047e\u047d\3\2\2\2\u047e\u047f"+
		"\3\2\2\2\u047f\u0481\3\2\2\2\u0480\u047c\3\2\2\2\u0480\u0481\3\2\2\2\u0481"+
		"\u0482\3\2\2\2\u0482\u0483\5\u00b6\\\2\u0483\u0485\7\3\2\2\u0484\u0486"+
		"\5\u00a8U\2\u0485\u0484\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0487\3\2\2"+
		"\2\u0487\u0489\5V,\2\u0488\u048a\5\u00c2b\2\u0489\u0488\3\2\2\2\u0489"+
		"\u048a\3\2\2\2\u048a\u048b\3\2\2\2\u048b\u048c\7\4\2\2\u048c\u048e\5\u00bc"+
		"_\2\u048d\u048f\7@\2\2\u048e\u048d\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0492"+
		"\3\2\2\2\u0490\u0493\58\35\2\u0491\u0493\5\64\33\2\u0492\u0490\3\2\2\2"+
		"\u0492\u0491\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0499\3\2\2\2\u0494\u0496"+
		"\7!\2\2\u0495\u0497\7@\2\2\u0496\u0495\3\2\2\2\u0496\u0497\3\2\2\2\u0497"+
		"\u0498\3\2\2\2\u0498\u049a\5\u0106\u0084\2\u0499\u0494\3\2\2\2\u0499\u049a"+
		"\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u049c\7\5\2\2\u049c\u04b4\3\2\2\2\u049d"+
		"\u04a1\7S\2\2\u049e\u04a1\5T+\2\u049f\u04a1\7N\2\2\u04a0\u049d\3\2\2\2"+
		"\u04a0\u049e\3\2\2\2\u04a0\u049f\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04a0"+
		"\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a5\3\2\2\2\u04a4\u04a6\7@\2\2\u04a5"+
		"\u04a4\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04a8\3\2\2\2\u04a7\u04a0\3\2"+
		"\2\2\u04a7\u04a8\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u04ab\5\u00aaV\2\u04aa"+
		"\u04ac\7@\2\2\u04ab\u04aa\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04ae\3\2"+
		"\2\2\u04ad\u04af\5\u00acW\2\u04ae\u04ad\3\2\2\2\u04ae\u04af\3\2\2\2\u04af"+
		"\u04b1\3\2\2\2\u04b0\u04b2\7\5\2\2\u04b1\u04b0\3\2\2\2\u04b1\u04b2\3\2"+
		"\2\2\u04b2\u04b4\3\2\2\2\u04b3\u046a\3\2\2\2\u04b3\u0474\3\2\2\2\u04b3"+
		"\u0480\3\2\2\2\u04b3\u04a7\3\2\2\2\u04b4\u00a7\3\2\2\2\u04b5\u04b7\7t"+
		"\2\2\u04b6\u04b5\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04b6\3\2\2\2\u04b8"+
		"\u04b9\3\2\2\2\u04b9\u00a9\3\2\2\2\u04ba\u04bc\7^\2\2\u04bb\u04bd\7@\2"+
		"\2\u04bc\u04bb\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04bf\3\2\2\2\u04be\u04c0"+
		"\58\35\2\u04bf\u04be\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04c5\3\2\2\2\u04c1"+
		"\u04c3\5\u00c2b\2\u04c2\u04c4\7@\2\2\u04c3\u04c2\3\2\2\2\u04c3\u04c4\3"+
		"\2\2\2\u04c4\u04c6\3\2\2\2\u04c5\u04c1\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6"+
		"\u04c8\3\2\2\2\u04c7\u04c9\58\35\2\u04c8\u04c7\3\2\2\2\u04c8\u04c9\3\2"+
		"\2\2\u04c9\u04ca\3\2\2\2\u04ca\u04cb\7u\2\2\u04cb\u04ea\bV\1\2\u04cc\u04ce"+
		"\7^\2\2\u04cd\u04cf\7@\2\2\u04ce\u04cd\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf"+
		"\u04d1\3\2\2\2\u04d0\u04d2\58\35\2\u04d1\u04d0\3\2\2\2\u04d1\u04d2\3\2"+
		"\2\2\u04d2\u04d3\3\2\2\2\u04d3\u04d5\5\u00c2b\2\u04d4\u04d6\7@\2\2\u04d5"+
		"\u04d4\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u04d8\3\2\2\2\u04d7\u04d9\5\u00c6"+
		"d\2\u04d8\u04d7\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04da\3\2\2\2\u04da"+
		"\u04dc\5\u00c2b\2\u04db\u04dd\5\u00c6d\2\u04dc\u04db\3\2\2\2\u04dc\u04dd"+
		"\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04df\7!\2\2\u04df\u04e0\bV\1\2\u04e0"+
		"\u04ea\3\2\2\2\u04e1\u04e3\7^\2\2\u04e2\u04e4\7@\2\2\u04e3\u04e2\3\2\2"+
		"\2\u04e3\u04e4\3\2\2\2\u04e4\u04e6\3\2\2\2\u04e5\u04e7\58\35\2\u04e6\u04e5"+
		"\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8\u04ea\5\u00c2b"+
		"\2\u04e9\u04ba\3\2\2\2\u04e9\u04cc\3\2\2\2\u04e9\u04e1\3\2\2\2\u04ea\u00ab"+
		"\3\2\2\2\u04eb\u04f6\5\u010c\u0087\2\u04ec\u04ee\7@\2\2\u04ed\u04ec\3"+
		"\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04f1\7\17\2\2\u04f0"+
		"\u04f2\7@\2\2\u04f1\u04f0\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04f3\3\2"+
		"\2\2\u04f3\u04f5\5\u010c\u0087\2\u04f4\u04ed\3\2\2\2\u04f5\u04f8\3\2\2"+
		"\2\u04f6\u04f4\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u04fa\3\2\2\2\u04f8\u04f6"+
		"\3\2\2\2\u04f9\u04fb\7@\2\2\u04fa\u04f9\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb"+
		"\u04fd\3\2\2\2\u04fc\u04fe\58\35\2\u04fd\u04fc\3\2\2\2\u04fd\u04fe\3\2"+
		"\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0500\7\5\2\2\u0500\u00ad\3\2\2\2\u0501"+
		"\u0503\7a\2\2\u0502\u0504\7@\2\2\u0503\u0502\3\2\2\2\u0503\u0504\3\2\2"+
		"\2\u0504\u0506\3\2\2\2\u0505\u0507\5\u00b0Y\2\u0506\u0505\3\2\2\2\u0506"+
		"\u0507\3\2\2\2\u0507\u0509\3\2\2\2\u0508\u050a\5\u00b2Z\2\u0509\u0508"+
		"\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u050c\7u\2\2\u050c"+
		"\u050d\bX\1\2\u050d\u00af\3\2\2\2\u050e\u050f\5\u00c2b\2\u050f\u00b1\3"+
		"\2\2\2\u0510\u0511\7\6\2\2\u0511\u0516\5\u00b4[\2\u0512\u0513\7\17\2\2"+
		"\u0513\u0515\5\u00b4[\2\u0514\u0512\3\2\2\2\u0515\u0518\3\2\2\2\u0516"+
		"\u0514\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u00b3\3\2\2\2\u0518\u0516\3\2"+
		"\2\2\u0519\u051b\7V\2\2\u051a\u051c\7@\2\2\u051b\u051a\3\2\2\2\u051b\u051c"+
		"\3\2\2\2\u051c\u051e\3\2\2\2\u051d\u0519\3\2\2\2\u051d\u051e\3\2\2\2\u051e"+
		"\u0520\3\2\2\2\u051f\u0521\5X-\2\u0520\u051f\3\2\2\2\u0520\u0521\3\2\2"+
		"\2\u0521\u0522\3\2\2\2\u0522\u0523\5\u00c2b\2\u0523\u00b5\3\2\2\2\u0524"+
		"\u0526\7T\2\2\u0525\u0527\7@\2\2\u0526\u0525\3\2\2\2\u0526\u0527\3\2\2"+
		"\2\u0527\u0558\3\2\2\2\u0528\u052a\5T+\2\u0529\u052b\7@\2\2\u052a\u0529"+
		"\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u0558\3\2\2\2\u052c\u052e\7S\2\2\u052d"+
		"\u052f\7@\2\2\u052e\u052d\3\2\2\2\u052e\u052f\3\2\2\2\u052f\u0558\3\2"+
		"\2\2\u0530\u0532\7Q\2\2\u0531\u0533\7@\2\2\u0532\u0531\3\2\2\2\u0532\u0533"+
		"\3\2\2\2\u0533\u0558\3\2\2\2\u0534\u0536\7R\2\2\u0535\u0537\7@\2\2\u0536"+
		"\u0535\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u0558\3\2\2\2\u0538\u053a\7\\"+
		"\2\2\u0539\u053b\7@\2\2\u053a\u0539\3\2\2\2\u053a\u053b\3\2\2\2\u053b"+
		"\u0558\3\2\2\2\u053c\u053e\7]\2\2\u053d\u053f\7@\2\2\u053e\u053d\3\2\2"+
		"\2\u053e\u053f\3\2\2\2\u053f\u0558\3\2\2\2\u0540\u0542\5V,\2\u0541\u0543"+
		"\7@\2\2\u0542\u0541\3\2\2\2\u0542\u0543\3\2\2\2\u0543\u0558\3\2\2\2\u0544"+
		"\u0558\5\u00b8]\2\u0545\u0546\7\26\2\2\u0546\u0547\5b\62\2\u0547\u0548"+
		"\7\27\2\2\u0548\u0553\3\2\2\2\u0549\u054a\7\67\2\2\u054a\u054f\5\u00b8"+
		"]\2\u054b\u054c\7\26\2\2\u054c\u054d\5b\62\2\u054d\u054e\7\27\2\2\u054e"+
		"\u0550\3\2\2\2\u054f\u054b\3\2\2\2\u054f\u0550\3\2\2\2\u0550\u0552\3\2"+
		"\2\2\u0551\u0549\3\2\2\2\u0552\u0555\3\2\2\2\u0553\u0551\3\2\2\2\u0553"+
		"\u0554\3\2\2\2\u0554\u0558\3\2\2\2\u0555\u0553\3\2\2\2\u0556\u0558\5\64"+
		"\33\2\u0557\u0524\3\2\2\2\u0557\u0528\3\2\2\2\u0557\u052c\3\2\2\2\u0557"+
		"\u0530\3\2\2\2\u0557\u0534\3\2\2\2\u0557\u0538\3\2\2\2\u0557\u053c\3\2"+
		"\2\2\u0557\u0540\3\2\2\2\u0557\u0544\3\2\2\2\u0557\u0545\3\2\2\2\u0557"+
		"\u0556\3\2\2\2\u0558\u0559\3\2\2\2\u0559\u0557\3\2\2\2\u0559\u055a\3\2"+
		"\2\2\u055a\u00b7\3\2\2\2\u055b\u055d\7P\2\2\u055c\u055e\7@\2\2\u055d\u055c"+
		"\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u0578\3\2\2\2\u055f\u0561\7\16\2\2"+
		"\u0560\u0562\7@\2\2\u0561\u0560\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u0578"+
		"\3\2\2\2\u0563\u0565\78\2\2\u0564\u0566\7@\2\2\u0565\u0564\3\2\2\2\u0565"+
		"\u0566\3\2\2\2\u0566\u0578\3\2\2\2\u0567\u0569\79\2\2\u0568\u056a\7@\2"+
		"\2\u0569\u0568\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u0578\3\2\2\2\u056b\u056d"+
		"\7^\2\2\u056c\u056e\7@\2\2\u056d\u056c\3\2\2\2\u056d\u056e\3\2\2\2\u056e"+
		"\u0578\3\2\2\2\u056f\u0571\7a\2\2\u0570\u0572\7@\2\2\u0571\u0570\3\2\2"+
		"\2\u0571\u0572\3\2\2\2\u0572\u0578\3\2\2\2\u0573\u0575\7t\2\2\u0574\u0576"+
		"\7@\2\2\u0575\u0574\3\2\2\2\u0575\u0576\3\2\2\2\u0576\u0578\3\2\2\2\u0577"+
		"\u055b\3\2\2\2\u0577\u055f\3\2\2\2\u0577\u0563\3\2\2\2\u0577\u0567\3\2"+
		"\2\2\u0577\u056b\3\2\2\2\u0577\u056f\3\2\2\2\u0577\u0573\3\2\2\2\u0578"+
		"\u0579\3\2\2\2\u0579\u0577\3\2\2\2\u0579\u057a\3\2\2\2\u057a\u00b9\3\2"+
		"\2\2\u057b\u057d\5\u00c2b\2\u057c\u057e\7@\2\2\u057d\u057c\3\2\2\2\u057d"+
		"\u057e\3\2\2\2\u057e\u00bb\3\2\2\2\u057f\u0580\7\3\2\2\u0580\u0581\7P"+
		"\2\2\u0581\u0592\7\4\2\2\u0582\u058e\7\3\2\2\u0583\u058b\5\u00be`\2\u0584"+
		"\u0586\7\17\2\2\u0585\u0587\7@\2\2\u0586\u0585\3\2\2\2\u0586\u0587\3\2"+
		"\2\2\u0587\u0588\3\2\2\2\u0588\u058a\5\u00be`\2\u0589\u0584\3\2\2\2\u058a"+
		"\u058d\3\2\2\2\u058b\u0589\3\2\2\2\u058b\u058c\3\2\2\2\u058c\u058f\3\2"+
		"\2\2\u058d\u058b\3\2\2\2\u058e\u0583\3\2\2\2\u058e\u058f\3\2\2\2\u058f"+
		"\u0590\3\2\2\2\u0590\u0592\7\4\2\2\u0591\u057f\3\2\2\2\u0591\u0582\3\2"+
		"\2\2\u0592\u00bd\3\2\2\2\u0593\u0595\5\u00b6\\\2\u0594\u0596\7@\2\2\u0595"+
		"\u0594\3\2\2\2\u0595\u0596\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u0598\5\u00c0"+
		"a\2\u0598\u059b\3\2\2\2\u0599\u059b\7B\2\2\u059a\u0593\3\2\2\2\u059a\u0599"+
		"\3\2\2\2\u059b\u00bf\3\2\2\2\u059c\u059e\5\u00c6d\2\u059d\u059c\3\2\2"+
		"\2\u059d\u059e\3\2\2\2\u059e\u05a6\3\2\2\2\u059f\u05a0\7\3\2\2\u05a0\u05a1"+
		"\5\u00c0a\2\u05a1\u05a2\7\4\2\2\u05a2\u05a7\3\2\2\2\u05a3\u05a5\5\u00ba"+
		"^\2\u05a4\u05a3\3\2\2\2\u05a4\u05a5\3\2\2\2\u05a5\u05a7\3\2\2\2\u05a6"+
		"\u059f\3\2\2\2\u05a6\u05a4\3\2\2\2\u05a7\u05a9\3\2\2\2\u05a8\u05aa\5\u0110"+
		"\u0089\2\u05a9\u05a8\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u00c1\3\2\2\2\u05ab"+
		"\u05b0\7t\2\2\u05ac\u05ad\7\67\2\2\u05ad\u05af\7t\2\2\u05ae\u05ac\3\2"+
		"\2\2\u05af\u05b2\3\2\2\2\u05b0\u05ae\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1"+
		"\u05b7\3\2\2\2\u05b2\u05b0\3\2\2\2\u05b3\u05b7\7b\2\2\u05b4\u05b7\7p\2"+
		"\2\u05b5\u05b7\5X-\2\u05b6\u05ab\3\2\2\2\u05b6\u05b3\3\2\2\2\u05b6\u05b4"+
		"\3\2\2\2\u05b6\u05b5\3\2\2\2\u05b7\u00c3\3\2\2\2\u05b8\u05b9\t\25\2\2"+
		"\u05b9\u00c5\3\2\2\2\u05ba\u05bc\5V,\2\u05bb\u05bd\7:\2\2\u05bc\u05bb"+
		"\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05bf\3\2\2\2\u05be\u05ba\3\2\2\2\u05bf"+
		"\u05c0\3\2\2\2\u05c0\u05be\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1\u00c7\3\2"+
		"\2\2\u05c2\u05c3\5\u00c6d\2\u05c3\u00c9\3\2\2\2\u05c4\u05c9\5\u00ccg\2"+
		"\u05c5\u05c6\7A\2\2\u05c6\u05c8\7@\2\2\u05c7\u05c5\3\2\2\2\u05c8\u05cb"+
		"\3\2\2\2\u05c9\u05c7\3\2\2\2\u05c9\u05ca\3\2\2\2\u05ca\u05e0\3\2\2\2\u05cb"+
		"\u05c9\3\2\2\2\u05cc\u05ce\7@\2\2\u05cd\u05cc\3\2\2\2\u05cd\u05ce\3\2"+
		"\2\2\u05ce\u05d0\3\2\2\2\u05cf\u05d1\7|\2\2\u05d0\u05cf\3\2\2\2\u05d0"+
		"\u05d1\3\2\2\2\u05d1\u05d3\3\2\2\2\u05d2\u05d4\7@\2\2\u05d3\u05d2\3\2"+
		"\2\2\u05d3\u05d4\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5\u05d7\7\17\2\2\u05d6"+
		"\u05d8\7@\2\2\u05d7\u05d6\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8\u05da\3\2"+
		"\2\2\u05d9\u05db\7|\2\2\u05da\u05d9\3\2\2\2\u05da\u05db\3\2\2\2\u05db"+
		"\u05dd\3\2\2\2\u05dc\u05de\7@\2\2\u05dd\u05dc\3\2\2\2\u05dd\u05de\3\2"+
		"\2\2\u05de\u05df\3\2\2\2\u05df\u05e1\5\u00caf\2\u05e0\u05cd\3\2\2\2\u05e0"+
		"\u05e1\3\2\2\2\u05e1\u05e6\3\2\2\2\u05e2\u05e3\7A\2\2\u05e3\u05e5\7@\2"+
		"\2\u05e4\u05e2\3\2\2\2\u05e5\u05e8\3\2\2\2\u05e6\u05e4\3\2\2\2\u05e6\u05e7"+
		"\3\2\2\2\u05e7\u00cb\3\2\2\2\u05e8\u05e6\3\2\2\2\u05e9\u05ff\5\u00ceh"+
		"\2\u05ea\u05ec\7@\2\2\u05eb\u05ea\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05ee"+
		"\3\2\2\2\u05ed\u05ef\7|\2\2\u05ee\u05ed\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef"+
		"\u05f1\3\2\2\2\u05f0\u05f2\7@\2\2\u05f1\u05f0\3\2\2\2\u05f1\u05f2\3\2"+
		"\2\2\u05f2\u05f3\3\2\2\2\u05f3\u05f5\5\\/\2\u05f4\u05f6\7@\2\2\u05f5\u05f4"+
		"\3\2\2\2\u05f5\u05f6\3\2\2\2\u05f6\u05f8\3\2\2\2\u05f7\u05f9\7|\2\2\u05f8"+
		"\u05f7\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9\u05fb\3\2\2\2\u05fa\u05fc\7@"+
		"\2\2\u05fb\u05fa\3\2\2\2\u05fb\u05fc\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd"+
		"\u05fe\5\u00ccg\2\u05fe\u0600\3\2\2\2\u05ff\u05eb\3\2\2\2\u05ff\u0600"+
		"\3\2\2\2\u0600\u00cd\3\2\2\2\u0601\u062d\5\u00d0i\2\u0602\u0604\5\u00d0"+
		"i\2\u0603\u0605\7@\2\2\u0604\u0603\3\2\2\2\u0604\u0605\3\2\2\2\u0605\u0607"+
		"\3\2\2\2\u0606\u0608\7|\2\2\u0607\u0606\3\2\2\2\u0607\u0608\3\2\2\2\u0608"+
		"\u060a\3\2\2\2\u0609\u060b\7@\2\2\u060a\u0609\3\2\2\2\u060a\u060b\3\2"+
		"\2\2\u060b\u060c\3\2\2\2\u060c\u060e\7;\2\2\u060d\u060f\7@\2\2\u060e\u060d"+
		"\3\2\2\2\u060e\u060f\3\2\2\2\u060f\u0611\3\2\2\2\u0610\u0612\7|\2\2\u0611"+
		"\u0610\3\2\2\2\u0611\u0612\3\2\2\2\u0612\u0614\3\2\2\2\u0613\u0615\7@"+
		"\2\2\u0614\u0613\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u0616\3\2\2\2\u0616"+
		"\u0618\5\u00caf\2\u0617\u0619\7@\2\2\u0618\u0617\3\2\2\2\u0618\u0619\3"+
		"\2\2\2\u0619\u061b\3\2\2\2\u061a\u061c\7|\2\2\u061b\u061a\3\2\2\2\u061b"+
		"\u061c\3\2\2\2\u061c\u061e\3\2\2\2\u061d\u061f\7@\2\2\u061e\u061d\3\2"+
		"\2\2\u061e\u061f\3\2\2\2\u061f\u0620\3\2\2\2\u0620\u0622\7\6\2\2\u0621"+
		"\u0623\7@\2\2\u0622\u0621\3\2\2\2\u0622\u0623\3\2\2\2\u0623\u0625\3\2"+
		"\2\2\u0624\u0626\7|\2\2\u0625\u0624\3\2\2\2\u0625\u0626\3\2\2\2\u0626"+
		"\u0628\3\2\2\2\u0627\u0629\7@\2\2\u0628\u0627\3\2\2\2\u0628\u0629\3\2"+
		"\2\2\u0629\u062a\3\2\2\2\u062a\u062b\5\u00ceh\2\u062b\u062d\3\2\2\2\u062c"+
		"\u0601\3\2\2\2\u062c\u0602\3\2\2\2\u062d\u00cf\3\2\2\2\u062e\u0643\5\u00d2"+
		"j\2\u062f\u0631\7@\2\2\u0630\u062f\3\2\2\2\u0630\u0631\3\2\2\2\u0631\u0633"+
		"\3\2\2\2\u0632\u0634\7|\2\2\u0633\u0632\3\2\2\2\u0633\u0634\3\2\2\2\u0634"+
		"\u0636\3\2\2\2\u0635\u0637\7@\2\2\u0636\u0635\3\2\2\2\u0636\u0637\3\2"+
		"\2\2\u0637\u0638\3\2\2\2\u0638\u063a\7\61\2\2\u0639\u063b\7@\2\2\u063a"+
		"\u0639\3\2\2\2\u063a\u063b\3\2\2\2\u063b\u063d\3\2\2\2\u063c\u063e\7|"+
		"\2\2\u063d\u063c\3\2\2\2\u063d\u063e\3\2\2\2\u063e\u0640\3\2\2\2\u063f"+
		"\u0641\7@\2\2\u0640\u063f\3\2\2\2\u0640\u0641\3\2\2\2\u0641\u0642\3\2"+
		"\2\2\u0642\u0644\5\u00d0i\2\u0643\u0630\3\2\2\2\u0643\u0644\3\2\2\2\u0644"+
		"\u00d1\3\2\2\2\u0645\u065a\5\u00d4k\2\u0646\u0648\7@\2\2\u0647\u0646\3"+
		"\2\2\2\u0647\u0648\3\2\2\2\u0648\u064a\3\2\2\2\u0649\u064b\7|\2\2\u064a"+
		"\u0649\3\2\2\2\u064a\u064b\3\2\2\2\u064b\u064d\3\2\2\2\u064c\u064e\7@"+
		"\2\2\u064d\u064c\3\2\2\2\u064d\u064e\3\2\2\2\u064e\u064f\3\2\2\2\u064f"+
		"\u0651\7\60\2\2\u0650\u0652\7@\2\2\u0651\u0650\3\2\2\2\u0651\u0652\3\2"+
		"\2\2\u0652\u0654\3\2\2\2\u0653\u0655\7|\2\2\u0654\u0653\3\2\2\2\u0654"+
		"\u0655\3\2\2\2\u0655\u0657\3\2\2\2\u0656\u0658\7@\2\2\u0657\u0656\3\2"+
		"\2\2\u0657\u0658\3\2\2\2\u0658\u0659\3\2\2\2\u0659\u065b\5\u00d2j\2\u065a"+
		"\u0647\3\2\2\2\u065a\u065b\3\2\2\2\u065b\u00d3\3\2\2\2\u065c\u0671\5\u00d6"+
		"l\2\u065d\u065f\7@\2\2\u065e\u065d\3\2\2\2\u065e\u065f\3\2\2\2\u065f\u0661"+
		"\3\2\2\2\u0660\u0662\7|\2\2\u0661\u0660\3\2\2\2\u0661\u0662\3\2\2\2\u0662"+
		"\u0664\3\2\2\2\u0663\u0665\7@\2\2\u0664\u0663\3\2\2\2\u0664\u0665\3\2"+
		"\2\2\u0665\u0666\3\2\2\2\u0666\u0668\7 \2\2\u0667\u0669\7@\2\2\u0668\u0667"+
		"\3\2\2\2\u0668\u0669\3\2\2\2\u0669\u066b\3\2\2\2\u066a\u066c\7|\2\2\u066b"+
		"\u066a\3\2\2\2\u066b\u066c\3\2\2\2\u066c\u066e\3\2\2\2\u066d\u066f\7@"+
		"\2\2\u066e\u066d\3\2\2\2\u066e\u066f\3\2\2\2\u066f\u0670\3\2\2\2\u0670"+
		"\u0672\5\u00d4k\2\u0671\u065e\3\2\2\2\u0671\u0672\3\2\2\2\u0672\u00d5"+
		"\3\2\2\2\u0673\u0688\5\u00d8m\2\u0674\u0676\7@\2\2\u0675\u0674\3\2\2\2"+
		"\u0675\u0676\3\2\2\2\u0676\u0678\3\2\2\2\u0677\u0679\7|\2\2\u0678\u0677"+
		"\3\2\2\2\u0678\u0679\3\2\2\2\u0679\u067b\3\2\2\2\u067a\u067c\7@\2\2\u067b"+
		"\u067a\3\2\2\2\u067b\u067c\3\2\2\2\u067c\u067d\3\2\2\2\u067d\u067f\7\37"+
		"\2\2\u067e\u0680\7@\2\2\u067f\u067e\3\2\2\2\u067f\u0680\3\2\2\2\u0680"+
		"\u0682\3\2\2\2\u0681\u0683\7|\2\2\u0682\u0681\3\2\2\2\u0682\u0683\3\2"+
		"\2\2\u0683\u0685\3\2\2\2\u0684\u0686\7@\2\2\u0685\u0684\3\2\2\2\u0685"+
		"\u0686\3\2\2\2\u0686\u0687\3\2\2\2\u0687\u0689\5\u00d6l\2\u0688\u0675"+
		"\3\2\2\2\u0688\u0689\3\2\2\2\u0689\u00d7\3\2\2\2\u068a\u069f\5\u00dan"+
		"\2\u068b\u068d\7@\2\2\u068c\u068b\3\2\2\2\u068c\u068d\3\2\2\2\u068d\u068f"+
		"\3\2\2\2\u068e\u0690\7|\2\2\u068f\u068e\3\2\2\2\u068f\u0690\3\2\2\2\u0690"+
		"\u0692\3\2\2\2\u0691\u0693\7@\2\2\u0692\u0691\3\2\2\2\u0692\u0693\3\2"+
		"\2\2\u0693\u0694\3\2\2\2\u0694\u0696\7\20\2\2\u0695\u0697\7@\2\2\u0696"+
		"\u0695\3\2\2\2\u0696\u0697\3\2\2\2\u0697\u0699\3\2\2\2\u0698\u069a\7|"+
		"\2\2\u0699\u0698\3\2\2\2\u0699\u069a\3\2\2\2\u069a\u069c\3\2\2\2\u069b"+
		"\u069d\7@\2\2\u069c\u069b\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u069e\3\2"+
		"\2\2\u069e\u06a0\5\u00d8m\2\u069f\u068c\3\2\2\2\u069f\u06a0\3\2\2\2\u06a0"+
		"\u00d9\3\2\2\2\u06a1\u06b7\5\u00dco\2\u06a2\u06a4\7@\2\2\u06a3\u06a2\3"+
		"\2\2\2\u06a3\u06a4\3\2\2\2\u06a4\u06a6\3\2\2\2\u06a5\u06a7\7|\2\2\u06a6"+
		"\u06a5\3\2\2\2\u06a6\u06a7\3\2\2\2\u06a7\u06a9\3\2\2\2\u06a8\u06aa\7@"+
		"\2\2\u06a9\u06a8\3\2\2\2\u06a9\u06aa\3\2\2\2\u06aa\u06ab\3\2\2\2\u06ab"+
		"\u06ad\5^\60\2\u06ac\u06ae\7@\2\2\u06ad\u06ac\3\2\2\2\u06ad\u06ae\3\2"+
		"\2\2\u06ae\u06b0\3\2\2\2\u06af\u06b1\7|\2\2\u06b0\u06af\3\2\2\2\u06b0"+
		"\u06b1\3\2\2\2\u06b1\u06b3\3\2\2\2\u06b2\u06b4\7@\2\2\u06b3\u06b2\3\2"+
		"\2\2\u06b3\u06b4\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5\u06b6\5\u00dan\2\u06b6"+
		"\u06b8\3\2\2\2\u06b7\u06a3\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8\u00db\3\2"+
		"\2\2\u06b9\u06cf\5\u00dep\2\u06ba\u06bc\7@\2\2\u06bb\u06ba\3\2\2\2\u06bb"+
		"\u06bc\3\2\2\2\u06bc\u06be\3\2\2\2\u06bd\u06bf\7|\2\2\u06be\u06bd\3\2"+
		"\2\2\u06be\u06bf\3\2\2\2\u06bf\u06c1\3\2\2\2\u06c0\u06c2\7@\2\2\u06c1"+
		"\u06c0\3\2\2\2\u06c1\u06c2\3\2\2\2\u06c2\u06c3\3\2\2\2\u06c3\u06c5\5P"+
		")\2\u06c4\u06c6\7@\2\2\u06c5\u06c4\3\2\2\2\u06c5\u06c6\3\2\2\2\u06c6\u06c8"+
		"\3\2\2\2\u06c7\u06c9\7|\2\2\u06c8\u06c7\3\2\2\2\u06c8\u06c9\3\2\2\2\u06c9"+
		"\u06cb\3\2\2\2\u06ca\u06cc\7@\2\2\u06cb\u06ca\3\2\2\2\u06cb\u06cc\3\2"+
		"\2\2\u06cc\u06cd\3\2\2\2\u06cd\u06ce\5\u00dco\2\u06ce\u06d0\3\2\2\2\u06cf"+
		"\u06bb\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0\u00dd\3\2\2\2\u06d1\u06e6\5\u00e0"+
		"q\2\u06d2\u06d4\7@\2\2\u06d3\u06d2\3\2\2\2\u06d3\u06d4\3\2\2\2\u06d4\u06d6"+
		"\3\2\2\2\u06d5\u06d7\7|\2\2\u06d6\u06d5\3\2\2\2\u06d6\u06d7\3\2\2\2\u06d7"+
		"\u06d9\3\2\2\2\u06d8\u06da\7@\2\2\u06d9\u06d8\3\2\2\2\u06d9\u06da\3\2"+
		"\2\2\u06da\u06db\3\2\2\2\u06db\u06dd\t\26\2\2\u06dc\u06de\7@\2\2\u06dd"+
		"\u06dc\3\2\2\2\u06dd\u06de\3\2\2\2\u06de\u06e0\3\2\2\2\u06df\u06e1\7|"+
		"\2\2\u06e0\u06df\3\2\2\2\u06e0\u06e1\3\2\2\2\u06e1\u06e3\3\2\2\2\u06e2"+
		"\u06e4\7@\2\2\u06e3\u06e2\3\2\2\2\u06e3\u06e4\3\2\2\2\u06e4\u06e5\3\2"+
		"\2\2\u06e5\u06e7\5\u00dep\2\u06e6\u06d3\3\2\2\2\u06e6\u06e7\3\2\2\2\u06e7"+
		"\u00df\3\2\2\2\u06e8\u06fd\5\u00e2r\2\u06e9\u06eb\7@\2\2\u06ea\u06e9\3"+
		"\2\2\2\u06ea\u06eb\3\2\2\2\u06eb\u06ed\3\2\2\2\u06ec\u06ee\7|\2\2\u06ed"+
		"\u06ec\3\2\2\2\u06ed\u06ee\3\2\2\2\u06ee\u06f0\3\2\2\2\u06ef\u06f1\7@"+
		"\2\2\u06f0\u06ef\3\2\2\2\u06f0\u06f1\3\2\2\2\u06f1\u06f2\3\2\2\2\u06f2"+
		"\u06f4\t\27\2\2\u06f3\u06f5\7@\2\2\u06f4\u06f3\3\2\2\2\u06f4\u06f5\3\2"+
		"\2\2\u06f5\u06f7\3\2\2\2\u06f6\u06f8\7|\2\2\u06f7\u06f6\3\2\2\2\u06f7"+
		"\u06f8\3\2\2\2\u06f8\u06fa\3\2\2\2\u06f9\u06fb\7@\2\2\u06fa\u06f9\3\2"+
		"\2\2\u06fa\u06fb\3\2\2\2\u06fb\u06fc\3\2\2\2\u06fc\u06fe\5\u00e0q\2\u06fd"+
		"\u06ea\3\2\2\2\u06fd\u06fe\3\2\2\2\u06fe\u00e1\3\2\2\2\u06ff\u0714\5\u00e4"+
		"s\2\u0700\u0702\7@\2\2\u0701\u0700\3\2\2\2\u0701\u0702\3\2\2\2\u0702\u0704"+
		"\3\2\2\2\u0703\u0705\7|\2\2\u0704\u0703\3\2\2\2\u0704\u0705\3\2\2\2\u0705"+
		"\u0707\3\2\2\2\u0706\u0708\7@\2\2\u0707\u0706\3\2\2\2\u0707\u0708\3\2"+
		"\2\2\u0708\u0709\3\2\2\2\u0709\u070b\t\30\2\2\u070a\u070c\7@\2\2\u070b"+
		"\u070a\3\2\2\2\u070b\u070c\3\2\2\2\u070c\u070e\3\2\2\2\u070d\u070f\7|"+
		"\2\2\u070e\u070d\3\2\2\2\u070e\u070f\3\2\2\2\u070f\u0711\3\2\2\2\u0710"+
		"\u0712\7@\2\2\u0711\u0710\3\2\2\2\u0711\u0712\3\2\2\2\u0712\u0713\3\2"+
		"\2\2\u0713\u0715\5\u00e2r\2\u0714\u0701\3\2\2\2\u0714\u0715\3\2\2\2\u0715"+
		"\u00e3\3\2\2\2\u0716\u0717\7\3\2\2\u0717\u0719\5V,\2\u0718\u071a\5\u00c2"+
		"b\2\u0719\u0718\3\2\2\2\u0719\u071a\3\2\2\2\u071a\u071b\3\2\2\2\u071b"+
		"\u071c\7\4\2\2\u071c\u071d\7\3\2\2\u071d\u071e\5\u0104\u0083\2\u071e\u071f"+
		"\7\4\2\2\u071f\u0722\3\2\2\2\u0720\u0722\5\u00e6t\2\u0721\u0716\3\2\2"+
		"\2\u0721\u0720\3\2\2\2\u0722\u00e5\3\2\2\2\u0723\u0724\7\3\2\2\u0724\u0725"+
		"\5\u00e8u\2\u0725\u0726\7\4\2\2\u0726\u0727\5\u00e6t\2\u0727\u072a\3\2"+
		"\2\2\u0728\u072a\5\u00eav\2\u0729\u0723\3\2\2\2\u0729\u0728\3\2\2\2\u072a"+
		"\u00e7\3\2\2\2\u072b\u0730\5\u00b6\\\2\u072c\u072d\5\u00b6\\\2\u072d\u072e"+
		"\5\u00e4s\2\u072e\u0730\3\2\2\2\u072f\u072b\3\2\2\2\u072f\u072c\3\2\2"+
		"\2\u0730\u00e9\3\2\2\2\u0731\u073a\5\u00ecw\2\u0732\u073a\5\u00f0y\2\u0733"+
		"\u073a\5\u00f2z\2\u0734\u073a\5\u00eex\2\u0735\u073a\5\u0100\u0081\2\u0736"+
		"\u073a\5\u00f6|\2\u0737\u073a\5\64\33\2\u0738\u073a\5\u00fe\u0080\2\u0739"+
		"\u0731\3\2\2\2\u0739\u0732\3\2\2\2\u0739\u0733\3\2\2\2\u0739\u0734\3\2"+
		"\2\2\u0739\u0735\3\2\2\2\u0739\u0736\3\2\2\2\u0739\u0737\3\2\2\2\u0739"+
		"\u0738\3\2\2\2\u073a\u00eb\3\2\2\2\u073b\u073c\7\20\2\2\u073c\u073d\5"+
		"\u00c2b\2\u073d\u00ed\3\2\2\2\u073e\u0740\7\67\2\2\u073f\u073e\3\2\2\2"+
		"\u073f\u0740\3\2\2\2\u0740\u0741\3\2\2\2\u0741\u0743\7b\2\2\u0742\u0744"+
		"\7@\2\2\u0743\u0742\3\2\2\2\u0743\u0744\3\2\2\2\u0744\u0746\3\2\2\2\u0745"+
		"\u0747\7|\2\2\u0746\u0745\3\2\2\2\u0746\u0747\3\2\2\2\u0747\u0749\3\2"+
		"\2\2\u0748\u074a\7@\2\2\u0749\u0748\3\2\2\2\u0749\u074a\3\2\2\2\u074a"+
		"\u074b\3\2\2\2\u074b\u074d\5\u00b6\\\2\u074c\u074e\7@\2\2\u074d\u074c"+
		"\3\2\2\2\u074d\u074e\3\2\2\2\u074e\u0750\3\2\2\2\u074f\u0751\7|\2\2\u0750"+
		"\u074f\3\2\2\2\u0750\u0751\3\2\2\2\u0751\u0753\3\2\2\2\u0752\u0754\7@"+
		"\2\2\u0753\u0752\3\2\2\2\u0753\u0754\3\2\2\2\u0754\u0755\3\2\2\2\u0755"+
		"\u0757\7\33\2\2\u0756\u0758\5\u00ceh\2\u0757\u0756\3\2\2\2\u0757\u0758"+
		"\3\2\2\2\u0758\u0759\3\2\2\2\u0759\u075a\7\34\2\2\u075a\u0779\3\2\2\2"+
		"\u075b\u075d\7\67\2\2\u075c\u075b\3\2\2\2\u075c\u075d\3\2\2\2\u075d\u075e"+
		"\3\2\2\2\u075e\u0760\7b\2\2\u075f\u0761\7@\2\2\u0760\u075f\3\2\2\2\u0760"+
		"\u0761\3\2\2\2\u0761\u0763\3\2\2\2\u0762\u0764\7|\2\2\u0763\u0762\3\2"+
		"\2\2\u0763\u0764\3\2\2\2\u0764\u0766\3\2\2\2\u0765\u0767\7@\2\2\u0766"+
		"\u0765\3\2\2\2\u0766\u0767\3\2\2\2\u0767\u0768\3\2\2\2\u0768\u076a\5\u00b6"+
		"\\\2\u0769\u076b\7@\2\2\u076a\u0769\3\2\2\2\u076a\u076b\3\2\2\2\u076b"+
		"\u076d\3\2\2\2\u076c\u076e\7|\2\2\u076d\u076c\3\2\2\2\u076d\u076e\3\2"+
		"\2\2\u076e\u0770\3\2\2\2\u076f\u0771\7@\2\2\u0770\u076f\3\2\2\2\u0770"+
		"\u0771\3\2\2\2\u0771\u0772\3\2\2\2\u0772\u0774\7\3\2\2\u0773\u0775\5\u00ca"+
		"f\2\u0774\u0773\3\2\2\2\u0774\u0775\3\2\2\2\u0775\u0776\3\2\2\2\u0776"+
		"\u0777\7\4\2\2\u0777\u0779\3\2\2\2\u0778\u073f\3\2\2\2\u0778\u075c\3\2"+
		"\2\2\u0779\u00ef\3\2\2\2\u077a\u077c\5N(\2\u077b\u077d\7@\2\2\u077c\u077b"+
		"\3\2\2\2\u077c\u077d\3\2\2\2\u077d\u077f\3\2\2\2\u077e\u0780\7|\2\2\u077f"+
		"\u077e\3\2\2\2\u077f\u0780\3\2\2\2\u0780\u0782\3\2\2\2\u0781\u0783\7@"+
		"\2\2\u0782\u0781\3\2\2\2\u0782\u0783\3\2\2\2\u0783\u0784\3\2\2\2\u0784"+
		"\u0785\5\u00e6t\2\u0785\u00f1\3\2\2\2\u0786\u0788\5\u00f4{\2\u0787\u0789"+
		"\7@\2\2\u0788\u0787\3\2\2\2\u0788\u0789\3\2\2\2\u0789\u078b\3\2\2\2\u078a"+
		"\u078c\7|\2\2\u078b\u078a\3\2\2\2\u078b\u078c\3\2\2\2\u078c\u078e\3\2"+
		"\2\2\u078d\u078f\7@\2\2\u078e\u078d\3\2\2\2\u078e\u078f\3\2\2\2\u078f"+
		"\u0790\3\2\2\2\u0790\u0791\7\3\2\2\u0791\u0792\5\u00f8}\2\u0792\u0793"+
		"\7\4\2\2\u0793\u07a1\3\2\2\2\u0794\u0796\5\u00f4{\2\u0795\u0797\7@\2\2"+
		"\u0796\u0795\3\2\2\2\u0796\u0797\3\2\2\2\u0797\u0799\3\2\2\2\u0798\u079a"+
		"\7|\2\2\u0799\u0798\3\2\2\2\u0799\u079a\3\2\2\2\u079a\u079c\3\2\2\2\u079b"+
		"\u079d\7@\2\2\u079c\u079b\3\2\2\2\u079c\u079d\3\2\2\2\u079d\u079e\3\2"+
		"\2\2\u079e\u079f\5\u00fa~\2\u079f\u07a1\3\2\2\2\u07a0\u0786\3\2\2\2\u07a0"+
		"\u0794\3\2\2\2\u07a1\u00f3\3\2\2\2\u07a2\u07a3\7<\2\2\u07a3\u00f5\3\2"+
		"\2\2\u07a4\u07a6\7=\2\2\u07a5\u07a7\7@\2\2\u07a6\u07a5\3\2\2\2\u07a6\u07a7"+
		"\3\2\2\2\u07a7\u07a9\3\2\2\2\u07a8\u07aa\7|\2\2\u07a9\u07a8\3\2\2\2\u07a9"+
		"\u07aa\3\2\2\2\u07aa\u07ac\3\2\2\2\u07ab\u07ad\7@\2\2\u07ac\u07ab\3\2"+
		"\2\2\u07ac\u07ad\3\2\2\2\u07ad\u07ae\3\2\2\2\u07ae\u07af\7\3\2\2\u07af"+
		"\u07b0\5\u00caf\2\u07b0\u07b1\7\4\2\2\u07b1\u07be\3\2\2\2\u07b2\u07b4"+
		"\7=\2\2\u07b3\u07b5\7@\2\2\u07b4\u07b3\3\2\2\2\u07b4\u07b5\3\2\2\2\u07b5"+
		"\u07b7\3\2\2\2\u07b6\u07b8\7|\2\2\u07b7\u07b6\3\2\2\2\u07b7\u07b8\3\2"+
		"\2\2\u07b8\u07ba\3\2\2\2\u07b9\u07bb\7@\2\2\u07ba\u07b9\3\2\2\2\u07ba"+
		"\u07bb\3\2\2\2\u07bb\u07bc\3\2\2\2\u07bc\u07be\5\u00caf\2\u07bd\u07a4"+
		"\3\2\2\2\u07bd\u07b2\3\2\2\2\u07be\u00f7\3\2\2\2\u07bf\u07cc\5\u00b6\\"+
		"\2\u07c0\u07c2\7@\2\2\u07c1\u07c0\3\2\2\2\u07c1\u07c2\3\2\2\2\u07c2\u07c4"+
		"\3\2\2\2\u07c3\u07c5\7|\2\2\u07c4\u07c3\3\2\2\2\u07c4\u07c5\3\2\2\2\u07c5"+
		"\u07c7\3\2\2\2\u07c6\u07c8\7@\2\2\u07c7\u07c6\3\2\2\2\u07c7\u07c8\3\2"+
		"\2\2\u07c8\u07c9\3\2\2\2\u07c9\u07cb\5V,\2\u07ca\u07c1\3\2\2\2\u07cb\u07ce"+
		"\3\2\2\2\u07cc\u07ca\3\2\2\2\u07cc\u07cd\3\2\2\2\u07cd\u00f9\3\2\2\2\u07ce"+
		"\u07cc\3\2\2\2\u07cf\u07d0\5\u00eav\2\u07d0\u00fb\3\2\2\2\u07d1\u07d2"+
		"\t\31\2\2\u07d2\u00fd\3\2\2\2\u07d3\u07d7\7U\2\2\u07d4\u07d6\t\32\2\2"+
		"\u07d5\u07d4\3\2\2\2\u07d6\u07d9\3\2\2\2\u07d7\u07d5\3\2\2\2\u07d7\u07d8"+
		"\3\2\2\2\u07d8\u07db\3\2\2\2\u07d9\u07d7\3\2\2\2\u07da\u07dc\7@\2\2\u07db"+
		"\u07da\3\2\2\2\u07db\u07dc\3\2\2\2\u07dc\u07dd\3\2\2\2\u07dd\u07df\7\3"+
		"\2\2\u07de\u07e0\7@\2\2\u07df\u07de\3\2\2\2\u07df\u07e0\3\2\2\2\u07e0"+
		"\u07e5\3\2\2\2\u07e1\u07e3\7~\2\2\u07e2\u07e4\7@\2\2\u07e3\u07e2\3\2\2"+
		"\2\u07e3\u07e4\3\2\2\2\u07e4\u07e6\3\2\2\2\u07e5\u07e1\3\2\2\2\u07e6\u07e7"+
		"\3\2\2\2\u07e7\u07e5\3\2\2\2\u07e7\u07e8\3\2\2\2\u07e8\u07ff\3\2\2\2\u07e9"+
		"\u07fb\t\33\2\2\u07ea\u07ec\7~\2\2\u07eb\u07ed\7@\2\2\u07ec\u07eb\3\2"+
		"\2\2\u07ec\u07ed\3\2\2\2\u07ed\u07f9\3\2\2\2\u07ee\u07ef\7\3\2\2\u07ef"+
		"\u07f4\5\u00c2b\2\u07f0\u07f1\7\17\2\2\u07f1\u07f3\5\u00c2b\2\u07f2\u07f0"+
		"\3\2\2\2\u07f3\u07f6\3\2\2\2\u07f4\u07f2\3\2\2\2\u07f4\u07f5\3\2\2\2\u07f5"+
		"\u07f7\3\2\2\2\u07f6\u07f4\3\2\2\2\u07f7\u07f8\7\4\2\2\u07f8\u07fa\3\2"+
		"\2\2\u07f9\u07ee\3\2\2\2\u07f9\u07fa\3\2\2\2\u07fa\u07fc\3\2\2\2\u07fb"+
		"\u07ea\3\2\2\2\u07fb\u07fc\3\2\2\2\u07fc\u07fe\3\2\2\2\u07fd\u07e9\3\2"+
		"\2\2\u07fe\u0801\3\2\2\2\u07ff\u07fd\3\2\2\2\u07ff\u0800\3\2\2\2\u0800"+
		"\u0802\3\2\2\2\u0801\u07ff\3\2\2\2\u0802\u0803\7\4\2\2\u0803\u00ff\3\2"+
		"\2\2\u0804\u0806\b\u0081\1\2\u0805\u0807\5\u00b6\\\2\u0806\u0805\3\2\2"+
		"\2\u0806\u0807\3\2\2\2\u0807\u0808\3\2\2\2\u0808\u081d\5\u0102\u0082\2"+
		"\u0809\u081d\5\u0108\u0085\2\u080a\u080c\5V,\2\u080b\u080a\3\2\2\2\u080b"+
		"\u080c\3\2\2\2\u080c\u080d\3\2\2\2\u080d\u080f\5\u00fc\177\2\u080e\u0810"+
		"\7@\2\2\u080f\u080e\3\2\2\2\u080f\u0810\3\2\2\2\u0810\u0812\3\2\2\2\u0811"+
		"\u0813\7|\2\2\u0812\u0811\3\2\2\2\u0812\u0813\3\2\2\2\u0813\u0815\3\2"+
		"\2\2\u0814\u0816\7@\2\2\u0815\u0814\3\2\2\2\u0815\u0816\3\2\2\2\u0816"+
		"\u0818\3\2\2\2\u0817\u0819\5V,\2\u0818\u0817\3\2\2\2\u0818\u0819\3\2\2"+
		"\2\u0819\u081a\3\2\2\2\u081a\u081b\5\u0108\u0085\2\u081b\u081d\3\2\2\2"+
		"\u081c\u0804\3\2\2\2\u081c\u0809\3\2\2\2\u081c\u080b\3\2\2\2\u081d\u0866"+
		"\3\2\2\2\u081e\u0820\f\n\2\2\u081f\u0821\7@\2\2\u0820\u081f\3\2\2\2\u0820"+
		"\u0821\3\2\2\2\u0821\u0823\3\2\2\2\u0822\u0824\7|\2\2\u0823\u0822\3\2"+
		"\2\2\u0823\u0824\3\2\2\2\u0824\u0826\3\2\2\2\u0825\u0827\7@\2\2\u0826"+
		"\u0825\3\2\2\2\u0826\u0827\3\2\2\2\u0827\u0828\3\2\2\2\u0828\u082a\7\33"+
		"\2\2\u0829\u082b\5\u00caf\2\u082a\u0829\3\2\2\2\u082a\u082b\3\2\2\2\u082b"+
		"\u082c\3\2\2\2\u082c\u0865\7\34\2\2\u082d\u082f\f\t\2\2\u082e\u0830\7"+
		"@\2\2\u082f\u082e\3\2\2\2\u082f\u0830\3\2\2\2\u0830\u0832\3\2\2\2\u0831"+
		"\u0833\7|\2\2\u0832\u0831\3\2\2\2\u0832\u0833\3\2\2\2\u0833\u0835\3\2"+
		"\2\2\u0834\u0836\7@\2\2\u0835\u0834\3\2\2\2\u0835\u0836\3\2\2\2\u0836"+
		"\u0837\3\2\2\2\u0837\u0838\7\3\2\2\u0838\u0839\5\u0104\u0083\2\u0839\u083a"+
		"\7\4\2\2\u083a\u0865\3\2\2\2\u083b\u083c\f\b\2\2\u083c\u083e\7?\2\2\u083d"+
		"\u083f\7@\2\2\u083e\u083d\3\2\2\2\u083e\u083f\3\2\2\2\u083f\u0841\3\2"+
		"\2\2\u0840\u0842\7|\2\2\u0841\u0840\3\2\2\2\u0841\u0842\3\2\2\2\u0842"+
		"\u0844\3\2\2\2\u0843\u0845\7@\2\2\u0844\u0843\3\2\2\2\u0844\u0845\3\2"+
		"\2\2\u0845\u0847\3\2\2\2\u0846\u0848\7`\2\2\u0847\u0846\3\2\2\2\u0847"+
		"\u0848\3\2\2\2\u0848\u0849\3\2\2\2\u0849\u0865\5\u00c2b\2\u084a\u084b"+
		"\f\7\2\2\u084b\u084d\7\65\2\2\u084c\u084e\7@\2\2\u084d\u084c\3\2\2\2\u084d"+
		"\u084e\3\2\2\2\u084e\u0850\3\2\2\2\u084f\u0851\7|\2\2\u0850\u084f\3\2"+
		"\2\2\u0850\u0851\3\2\2\2\u0851\u0853\3\2\2\2\u0852\u0854\7@\2\2\u0853"+
		"\u0852\3\2\2\2\u0853\u0854\3\2\2\2\u0854\u0856\3\2\2\2\u0855\u0857\7`"+
		"\2\2\u0856\u0855\3\2\2\2\u0856\u0857\3\2\2\2\u0857\u0858\3\2\2\2\u0858"+
		"\u0865\5\u00c2b\2\u0859\u085b\f\6\2\2\u085a\u085c\7@\2\2\u085b\u085a\3"+
		"\2\2\2\u085b\u085c\3\2\2\2\u085c\u085e\3\2\2\2\u085d\u085f\7|\2\2\u085e"+
		"\u085d\3\2\2\2\u085e\u085f\3\2\2\2\u085f\u0861\3\2\2\2\u0860\u0862\7@"+
		"\2\2\u0861\u0860\3\2\2\2\u0861\u0862\3\2\2\2\u0862\u0863\3\2\2\2\u0863"+
		"\u0865\5\u00fc\177\2\u0864\u081e\3\2\2\2\u0864\u082d\3\2\2\2\u0864\u083b"+
		"\3\2\2\2\u0864\u084a\3\2\2\2\u0864\u0859\3\2\2\2\u0865\u0868\3\2\2\2\u0866"+
		"\u0864\3\2\2\2\u0866\u0867\3\2\2\2\u0867\u0101\3\2\2\2\u0868\u0866\3\2"+
		"\2\2\u0869\u086b\7u\2\2\u086a\u086c\7@\2\2\u086b\u086a\3\2\2\2\u086b\u086c"+
		"\3\2\2\2\u086c\u0873\3\2\2\2\u086d\u086f\7|\2\2\u086e\u0870\7@\2\2\u086f"+
		"\u086e\3\2\2\2\u086f\u0870\3\2\2\2\u0870\u0872\3\2\2\2\u0871\u086d\3\2"+
		"\2\2\u0872\u0875\3\2\2\2\u0873\u0871\3\2\2\2\u0873\u0874\3\2\2\2\u0874"+
		"\u0877\3\2\2\2\u0875\u0873\3\2\2\2\u0876\u0878\5\u0104\u0083\2\u0877\u0876"+
		"\3\2\2\2\u0877\u0878\3\2\2\2\u0878\u087a\3\2\2\2\u0879\u087b\7@\2\2\u087a"+
		"\u0879\3\2\2\2\u087a\u087b\3\2\2\2\u087b\u0882\3\2\2\2\u087c\u087e\7|"+
		"\2\2\u087d\u087f\7@\2\2\u087e\u087d\3\2\2\2\u087e\u087f\3\2\2\2\u087f"+
		"\u0881\3\2\2\2\u0880\u087c\3\2\2\2\u0881\u0884\3\2\2\2\u0882\u0880\3\2"+
		"\2\2\u0882\u0883\3\2\2\2\u0883\u0885\3\2\2\2\u0884\u0882\3\2\2\2\u0885"+
		"\u0886\7v\2\2\u0886\u0103\3\2\2\2\u0887\u0889\7@\2\2\u0888\u0887\3\2\2"+
		"\2\u0888\u0889\3\2\2\2\u0889\u088b\3\2\2\2\u088a\u088c\7|\2\2\u088b\u088a"+
		"\3\2\2\2\u088b\u088c\3\2\2\2\u088c\u088e\3\2\2\2\u088d\u088f\7@\2\2\u088e"+
		"\u088d\3\2\2\2\u088e\u088f\3\2\2\2\u088f\u0890\3\2\2\2\u0890\u0892\5\u0106"+
		"\u0084\2\u0891\u0888\3\2\2\2\u0891\u0892\3\2\2\2\u0892\u0894\3\2\2\2\u0893"+
		"\u0895\7@\2\2\u0894\u0893\3\2\2\2\u0894\u0895\3\2\2\2\u0895\u0897\3\2"+
		"\2\2\u0896\u0898\7|\2\2\u0897\u0896\3\2\2\2\u0897\u0898\3\2\2\2\u0898"+
		"\u089a\3\2\2\2\u0899\u089b\7@\2\2\u089a\u0899\3\2\2\2\u089a\u089b\3\2"+
		"\2\2\u089b\u08ae\3\2\2\2\u089c\u089e\7\17\2\2\u089d\u089c\3\2\2\2\u089d"+
		"\u089e\3\2\2\2\u089e\u08a0\3\2\2\2\u089f\u08a1\7@\2\2\u08a0\u089f\3\2"+
		"\2\2\u08a0\u08a1\3\2\2\2\u08a1\u08a8\3\2\2\2\u08a2\u08a4\7|\2\2\u08a3"+
		"\u08a5\7@\2\2\u08a4\u08a3\3\2\2\2\u08a4\u08a5\3\2\2\2\u08a5\u08a7\3\2"+
		"\2\2\u08a6\u08a2\3\2\2\2\u08a7\u08aa\3\2\2\2\u08a8\u08a6\3\2\2\2\u08a8"+
		"\u08a9\3\2\2\2\u08a9\u08ab\3\2\2\2\u08aa\u08a8\3\2\2\2\u08ab\u08ad\5\u0106"+
		"\u0084\2\u08ac\u089d\3\2\2\2\u08ad\u08b0\3\2\2\2\u08ae\u08ac\3\2\2\2\u08ae"+
		"\u08af\3\2\2\2\u08af\u08b2\3\2\2\2\u08b0\u08ae\3\2\2\2\u08b1\u08b3\7\17"+
		"\2\2\u08b2\u08b1\3\2\2\2\u08b2\u08b3\3\2\2\2\u08b3\u08b9\3\2\2\2\u08b4"+
		"\u08b6\7P\2\2\u08b5\u08b7\5V,\2\u08b6\u08b5\3\2\2\2\u08b6\u08b7\3\2\2"+
		"\2\u08b7\u08b9\3\2\2\2\u08b8\u0891\3\2\2\2\u08b8\u08b4\3\2\2\2\u08b9\u0105"+
		"\3\2\2\2\u08ba\u08bb\5\u00ccg\2\u08bb\u0107\3\2\2\2\u08bc\u08be\7?\2\2"+
		"\u08bd\u08bc\3\2\2\2\u08bd\u08be\3\2\2\2\u08be\u08bf\3\2\2\2\u08bf\u08c7"+
		"\5\u00c2b\2\u08c0\u08c7\5V,\2\u08c1\u08c7\5R*\2\u08c2\u08c3\7\3\2\2\u08c3"+
		"\u08c4\5\u00caf\2\u08c4\u08c5\7\4\2\2\u08c5\u08c7\3\2\2\2\u08c6\u08bd"+
		"\3\2\2\2\u08c6\u08c0\3\2\2\2\u08c6\u08c1\3\2\2\2\u08c6\u08c2\3\2\2\2\u08c7"+
		"\u0109\3\2\2\2\u08c8\u08c9\7\5\2\2\u08c9\u010b\3\2\2\2\u08ca\u08cb\5\u010e"+
		"\u0088\2\u08cb\u08cd\7\3\2\2\u08cc\u08ce\5\u00caf\2\u08cd\u08cc\3\2\2"+
		"\2\u08cd\u08ce\3\2\2\2\u08ce\u08cf\3\2\2\2\u08cf\u08d0\7\4\2\2\u08d0\u08dd"+
		"\3\2\2\2\u08d1\u08d3\5\u010e\u0088\2\u08d2\u08d4\7@\2\2\u08d3\u08d2\3"+
		"\2\2\2\u08d3\u08d4\3\2\2\2\u08d4\u08d5\3\2\2\2\u08d5\u08d7\7!\2\2\u08d6"+
		"\u08d8\7@\2\2\u08d7\u08d6\3\2\2\2\u08d7\u08d8\3\2\2\2\u08d8\u08d9\3\2"+
		"\2\2\u08d9\u08da\5\u0106\u0084\2\u08da\u08dd\3\2\2\2\u08db\u08dd\5\u010e"+
		"\u0088\2\u08dc\u08ca\3\2\2\2\u08dc\u08d1\3\2\2\2\u08dc\u08db\3\2\2\2\u08dd"+
		"\u010d\3\2\2\2\u08de\u08e0\5\u00c6d\2\u08df\u08de\3\2\2\2\u08df\u08e0"+
		"\3\2\2\2\u08e0\u08e1\3\2\2\2\u08e1\u08e3\5\u00c2b\2\u08e2\u08e4\5\u0110"+
		"\u0089\2\u08e3\u08e2\3\2\2\2\u08e3\u08e4\3\2\2\2\u08e4\u010f\3\2\2\2\u08e5"+
		"\u08e7\7\33\2\2\u08e6\u08e8\5\u00ceh\2\u08e7\u08e6\3\2\2\2\u08e7\u08e8"+
		"\3\2\2\2\u08e8\u08e9\3\2\2\2\u08e9\u08ec\7\34\2\2\u08ea\u08ec\5\u00bc"+
		"_\2\u08eb\u08e5\3\2\2\2\u08eb\u08ea\3\2\2\2\u08ec\u0111\3\2\2\2\u01b7"+
		"\u0115\u0124\u0131\u0134\u0137\u013c\u0140\u0148\u014c\u0153\u0157\u015a"+
		"\u015d\u0161\u0164\u0167\u016b\u0171\u0175\u0179\u017b\u0181\u018d\u0192"+
		"\u0195\u0198\u019e\u01a6\u01ac\u01b2\u01c6\u01d1\u01db\u01e5\u01ee\u01f1"+
		"\u01f7\u01fc\u0200\u0206\u0208\u020c\u020f\u0217\u021a\u021e\u0224\u0228"+
		"\u022c\u022f\u0236\u023a\u0240\u0247\u024b\u0252\u025d\u0265\u026b\u0271"+
		"\u0278\u027f\u0293\u0297\u029e\u02a4\u02a9\u02ba\u02c0\u02c6\u02cb\u02d0"+
		"\u02db\u0305\u0319\u031b\u0337\u033e\u0343\u0347\u034a\u034d\u0351\u035d"+
		"\u0360\u0364\u0366\u036a\u036e\u0371\u0374\u0377\u037c\u0380\u0383\u0386"+
		"\u038a\u0390\u0394\u039b\u039f\u03a4\u03a6\u03aa\u03ad\u03b0\u03b4\u03b8"+
		"\u03bc\u03c0\u03c4\u03c9\u03ce\u03d2\u03d6\u03dc\u03e1\u03e6\u03e9\u03ec"+
		"\u03f0\u03f2\u03f5\u03f8\u03fd\u0400\u0403\u0408\u040d\u0410\u0413\u0416"+
		"\u041c\u041f\u0426\u0429\u0434\u043b\u0441\u044c\u0456\u045f\u0464\u046a"+
		"\u046e\u0472\u0474\u0477\u047e\u0480\u0485\u0489\u048e\u0492\u0496\u0499"+
		"\u04a0\u04a2\u04a5\u04a7\u04ab\u04ae\u04b1\u04b3\u04b8\u04bc\u04bf\u04c3"+
		"\u04c5\u04c8\u04ce\u04d1\u04d5\u04d8\u04dc\u04e3\u04e6\u04e9\u04ed\u04f1"+
		"\u04f6\u04fa\u04fd\u0503\u0506\u0509\u0516\u051b\u051d\u0520\u0526\u052a"+
		"\u052e\u0532\u0536\u053a\u053e\u0542\u054f\u0553\u0557\u0559\u055d\u0561"+
		"\u0565\u0569\u056d\u0571\u0575\u0577\u0579\u057d\u0586";
	private static final String _serializedATNSegment1 =
		"\u058b\u058e\u0591\u0595\u059a\u059d\u05a4\u05a6\u05a9\u05b0\u05b6\u05bc"+
		"\u05c0\u05c9\u05cd\u05d0\u05d3\u05d7\u05da\u05dd\u05e0\u05e6\u05eb\u05ee"+
		"\u05f1\u05f5\u05f8\u05fb\u05ff\u0604\u0607\u060a\u060e\u0611\u0614\u0618"+
		"\u061b\u061e\u0622\u0625\u0628\u062c\u0630\u0633\u0636\u063a\u063d\u0640"+
		"\u0643\u0647\u064a\u064d\u0651\u0654\u0657\u065a\u065e\u0661\u0664\u0668"+
		"\u066b\u066e\u0671\u0675\u0678\u067b\u067f\u0682\u0685\u0688\u068c\u068f"+
		"\u0692\u0696\u0699\u069c\u069f\u06a3\u06a6\u06a9\u06ad\u06b0\u06b3\u06b7"+
		"\u06bb\u06be\u06c1\u06c5\u06c8\u06cb\u06cf\u06d3\u06d6\u06d9\u06dd\u06e0"+
		"\u06e3\u06e6\u06ea\u06ed\u06f0\u06f4\u06f7\u06fa\u06fd\u0701\u0704\u0707"+
		"\u070b\u070e\u0711\u0714\u0719\u0721\u0729\u072f\u0739\u073f\u0743\u0746"+
		"\u0749\u074d\u0750\u0753\u0757\u075c\u0760\u0763\u0766\u076a\u076d\u0770"+
		"\u0774\u0778\u077c\u077f\u0782\u0788\u078b\u078e\u0796\u0799\u079c\u07a0"+
		"\u07a6\u07a9\u07ac\u07b4\u07b7\u07ba\u07bd\u07c1\u07c4\u07c7\u07cc\u07d7"+
		"\u07db\u07df\u07e3\u07e7\u07ec\u07f4\u07f9\u07fb\u07ff\u0806\u080b\u080f"+
		"\u0812\u0815\u0818\u081c\u0820\u0823\u0826\u082a\u082f\u0832\u0835\u083e"+
		"\u0841\u0844\u0847\u084d\u0850\u0853\u0856\u085b\u085e\u0861\u0864\u0866"+
		"\u086b\u086f\u0873\u0877\u087a\u087e\u0882\u0888\u088b\u088e\u0891\u0894"+
		"\u0897\u089a\u089d\u08a0\u08a4\u08a8\u08ae\u08b2\u08b6\u08b8\u08bd\u08c6"+
		"\u08cd\u08d3\u08d7\u08dc\u08df\u08e3\u08e7\u08eb";
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