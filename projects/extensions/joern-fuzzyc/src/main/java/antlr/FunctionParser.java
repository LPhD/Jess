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
		RULE_pre_pragma = 35, RULE_custom = 36, RULE_asciiTab = 37, RULE_externC = 38, 
		RULE_macroFunctionPointer = 39, RULE_testStart = 40, RULE_testEnd = 41, 
		RULE_function_def = 42, RULE_return_type = 43, RULE_function_param_list = 44, 
		RULE_parameter_decl_clause = 45, RULE_parameter_decl = 46, RULE_parameter_id = 47, 
		RULE_compound_statement = 48, RULE_ctor_list = 49, RULE_ctor_initializer = 50, 
		RULE_initializer_id = 51, RULE_ctor_expr = 52, RULE_function_name = 53, 
		RULE_exception_specification = 54, RULE_type_id_list = 55, RULE_simple_decl = 56, 
		RULE_var_decl = 57, RULE_callingConvention = 58, RULE_special_datatype = 59, 
		RULE_init_declarator_list = 60, RULE_class_def = 61, RULE_class_name = 62, 
		RULE_base_classes = 63, RULE_base_class = 64, RULE_type_name = 65, RULE_base_type = 66, 
		RULE_param_decl_specifiers = 67, RULE_parameter_name = 68, RULE_param_type_list = 69, 
		RULE_param_type = 70, RULE_param_type_id = 71, RULE_identifier = 72, RULE_number = 73, 
		RULE_ptrs = 74, RULE_func_ptrs = 75, RULE_expr = 76, RULE_assign_expr = 77, 
		RULE_conditional_expression = 78, RULE_or_expression = 79, RULE_and_expression = 80, 
		RULE_inclusive_or_expression = 81, RULE_exclusive_or_expression = 82, 
		RULE_bit_and_expression = 83, RULE_equality_expression = 84, RULE_relational_expression = 85, 
		RULE_shift_expression = 86, RULE_additive_expression = 87, RULE_multiplicative_expression = 88, 
		RULE_function_pointer_use_expression = 89, RULE_cast_expression = 90, 
		RULE_cast_target = 91, RULE_unary_expression = 92, RULE_address_of_expression = 93, 
		RULE_new_expression = 94, RULE_unary_op_and_cast_expr = 95, RULE_sizeof_expression = 96, 
		RULE_sizeof = 97, RULE_defined_expression = 98, RULE_sizeof_operand = 99, 
		RULE_sizeof_operand2 = 100, RULE_inc_dec = 101, RULE_postfix_expression = 102, 
		RULE_initializer_expression = 103, RULE_argument_list = 104, RULE_argument = 105, 
		RULE_primary_expression = 106, RULE_null_expression = 107, RULE_comment = 108, 
		RULE_newline = 109, RULE_unary_operator = 110, RULE_relational_operator = 111, 
		RULE_constant = 112, RULE_function_decl_specifiers = 113, RULE_ptr_operator = 114, 
		RULE_access_specifier = 115, RULE_operator = 116, RULE_assignment_operator = 117, 
		RULE_equality_operator = 118, RULE_template_decl_start = 119, RULE_template_param_list = 120, 
		RULE_no_brackets = 121, RULE_no_brackets_curlies_or_squares = 122, RULE_no_brackets_or_semicolon = 123, 
		RULE_no_angle_brackets_or_brackets = 124, RULE_no_curlies = 125, RULE_no_squares = 126, 
		RULE_no_squares_or_semicolon = 127, RULE_no_comma_or_semicolon = 128, 
		RULE_assign_water = 129, RULE_assign_water_l2 = 130, RULE_water = 131, 
		RULE_init_declarator = 132, RULE_declarator = 133, RULE_type_suffix = 134;
	public static final String[] ruleNames = {
		"statements", "statement", "opening_curly", "closing_curly", "block_starter", 
		"selection_or_iteration", "for_init_statement", "jump_statement", "label", 
		"expr_statement", "condition", "pre_statement", "pre_blockstarter", "pre_if_statement", 
		"pre_elif_statement", "pre_else_statement", "pre_endif_statement", "pre_if_condition", 
		"pre_command", "pre_define", "pre_undef", "pre_macro_identifier", "keyword", 
		"pre_macro_parameters", "pre_macro", "macroCall", "pre_diagnostic", "pre_other", 
		"attributeList", "attribute", "pre_include", "pre_include_next", "pre_include_local_file", 
		"pre_include_filename", "pre_line", "pre_pragma", "custom", "asciiTab", 
		"externC", "macroFunctionPointer", "testStart", "testEnd", "function_def", 
		"return_type", "function_param_list", "parameter_decl_clause", "parameter_decl", 
		"parameter_id", "compound_statement", "ctor_list", "ctor_initializer", 
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
		"null_expression", "comment", "newline", "unary_operator", "relational_operator", 
		"constant", "function_decl_specifiers", "ptr_operator", "access_specifier", 
		"operator", "assignment_operator", "equality_operator", "template_decl_start", 
		"template_param_list", "no_brackets", "no_brackets_curlies_or_squares", 
		"no_brackets_or_semicolon", "no_angle_brackets_or_brackets", "no_curlies", 
		"no_squares", "no_squares_or_semicolon", "no_comma_or_semicolon", "assign_water", 
		"assign_water_l2", "water", "init_declarator", "declarator", "type_suffix"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "';'", "':'", "'START_TEST'", "'inline'", "'explicit'", 
		"'friend'", "'public'", "'private'", "'protected'", "'long'", "','", "'\"C\"'", 
		"'*'", "'::'", "'='", "'<'", "'>'", "'char'", "'int'", "'restrict'", "'?'", 
		"'||'", "'&&'", "'|'", "'^'", "'&'", "'<<'", "'>>'", "'+'", "'-'", "'/'", 
		"'%'", "'['", "']'", "'sizeof'", "'defined'", "'--'", "'++'", "'.'", "'->'", 
		"'~'", "'!'", "'<='", "'>='", "'delete'", "'+='", "'-='", "'*='", "'/='", 
		"'%='", "'^='", "'&='", "'|='", "'>>='", "'<<='", "'=='", "'!='", "'->*'", 
		"'if'", "'else'", "'for'", "'while'", "'break'", "'case'", "'continue'", 
		"'switch'", "'do'", "'goto'", "'return'", "'typedef'", "'static'", "'void'", 
		"'unsigned'", "'signed'", null, "'extern'", "'virtual'", "'try'", "'catch'", 
		"'throw'", "'using'", "'namespace'", "'auto'", "'register'", null, "'operator'", 
		"'template'", "'class'", "'new'", null, null, null, null, null, null, 
		null, null, null, null, null, null, "'GCC'", null, null, "'__attribute__'", 
		"'END_TEST'", null, "'{'", "'}'", null, null, null, null, null, null, 
		null, null, "'\\'", null, "'...'"
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << IF) | (1L << ELSE) | (1L << FOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
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
			setState(340);
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
				case T__14:
				case T__15:
				case T__19:
				case T__20:
				case T__27:
				case T__30:
				case T__31:
				case T__36:
				case T__37:
				case T__38:
				case T__39:
				case T__42:
				case T__43:
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__27) | (1L << T__30) | (1L << T__31) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__43))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (STATIC - 73)) | (1L << (VOID - 73)) | (1L << (UNSIGNED - 73)) | (1L << (SIGNED - 73)) | (1L << (CV_QUALIFIER - 73)) | (1L << (EXTERN - 73)) | (1L << (VIRTUAL - 73)) | (1L << (SPECIAL_DATA - 73)) | (1L << (OPERATOR - 73)) | (1L << (CLASS_KEY - 73)) | (1L << (NEW - 73)) | (1L << (PRE_PRAGMA_KEYWORDS - 73)) | (1L << (END_TEST - 73)) | (1L << (ALPHA_NUMERIC - 73)) | (1L << (OPENING_CURLY - 73)) | (1L << (HEX_LITERAL - 73)) | (1L << (DECIMAL_LITERAL - 73)) | (1L << (OCTAL_LITERAL - 73)) | (1L << (FLOATING_POINT_LITERAL - 73)) | (1L << (CHAR - 73)) | (1L << (STRING - 73)))) != 0)) {
					{
					setState(321);
					condition();
					}
				}

				setState(324);
				match(T__2);
				setState(326);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__27) | (1L << T__30) | (1L << T__31) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__43))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (STATIC - 73)) | (1L << (VOID - 73)) | (1L << (UNSIGNED - 73)) | (1L << (SIGNED - 73)) | (1L << (CV_QUALIFIER - 73)) | (1L << (EXTERN - 73)) | (1L << (VIRTUAL - 73)) | (1L << (SPECIAL_DATA - 73)) | (1L << (OPERATOR - 73)) | (1L << (CLASS_KEY - 73)) | (1L << (NEW - 73)) | (1L << (PRE_PRAGMA_KEYWORDS - 73)) | (1L << (END_TEST - 73)) | (1L << (ALPHA_NUMERIC - 73)) | (1L << (OPENING_CURLY - 73)) | (1L << (HEX_LITERAL - 73)) | (1L << (DECIMAL_LITERAL - 73)) | (1L << (OCTAL_LITERAL - 73)) | (1L << (FLOATING_POINT_LITERAL - 73)) | (1L << (CHAR - 73)) | (1L << (STRING - 73)))) != 0)) {
					{
					setState(325);
					expr();
					}
				}

				setState(328);
				match(T__1);
				setState(330);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(329);
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
				setState(332);
				match(DO);
				}
				break;
			case WHILE:
				_localctx = new While_statementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(333);
				match(WHILE);
				setState(334);
				match(T__0);
				setState(335);
				condition();
				setState(336);
				match(T__1);
				setState(338);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(337);
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
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				simple_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				expr();
				setState(344);
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
			setState(366);
			switch (_input.LA(1)) {
			case BREAK:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				match(BREAK);
				setState(349);
				match(T__2);
				}
				break;
			case CONTINUE:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				match(CONTINUE);
				setState(351);
				match(T__2);
				}
				break;
			case GOTO:
				_localctx = new GotoStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(352);
				match(GOTO);
				setState(353);
				identifier();
				setState(354);
				match(T__2);
				}
				break;
			case RETURN:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(356);
				match(RETURN);
				setState(358);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__27) | (1L << T__30) | (1L << T__31) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__43))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (STATIC - 73)) | (1L << (VOID - 73)) | (1L << (UNSIGNED - 73)) | (1L << (SIGNED - 73)) | (1L << (CV_QUALIFIER - 73)) | (1L << (EXTERN - 73)) | (1L << (VIRTUAL - 73)) | (1L << (SPECIAL_DATA - 73)) | (1L << (OPERATOR - 73)) | (1L << (CLASS_KEY - 73)) | (1L << (NEW - 73)) | (1L << (PRE_PRAGMA_KEYWORDS - 73)) | (1L << (END_TEST - 73)) | (1L << (ALPHA_NUMERIC - 73)) | (1L << (OPENING_CURLY - 73)) | (1L << (HEX_LITERAL - 73)) | (1L << (DECIMAL_LITERAL - 73)) | (1L << (OCTAL_LITERAL - 73)) | (1L << (FLOATING_POINT_LITERAL - 73)) | (1L << (CHAR - 73)) | (1L << (STRING - 73)))) != 0)) {
					{
					setState(357);
					expr();
					}
				}

				setState(360);
				match(T__2);
				}
				break;
			case THROW:
				_localctx = new ThrowStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(361);
				match(THROW);
				setState(363);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__27) | (1L << T__30) | (1L << T__31) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__43))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (STATIC - 73)) | (1L << (VOID - 73)) | (1L << (UNSIGNED - 73)) | (1L << (SIGNED - 73)) | (1L << (CV_QUALIFIER - 73)) | (1L << (EXTERN - 73)) | (1L << (VIRTUAL - 73)) | (1L << (SPECIAL_DATA - 73)) | (1L << (OPERATOR - 73)) | (1L << (CLASS_KEY - 73)) | (1L << (NEW - 73)) | (1L << (PRE_PRAGMA_KEYWORDS - 73)) | (1L << (END_TEST - 73)) | (1L << (ALPHA_NUMERIC - 73)) | (1L << (OPENING_CURLY - 73)) | (1L << (HEX_LITERAL - 73)) | (1L << (DECIMAL_LITERAL - 73)) | (1L << (OCTAL_LITERAL - 73)) | (1L << (FLOATING_POINT_LITERAL - 73)) | (1L << (CHAR - 73)) | (1L << (STRING - 73)))) != 0)) {
					{
					setState(362);
					expr();
					}
				}

				setState(365);
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
			setState(369);
			_la = _input.LA(1);
			if (_la==CASE) {
				{
				setState(368);
				match(CASE);
				}
			}

			setState(374);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case NEW:
			case PRE_PRAGMA_KEYWORDS:
			case ALPHA_NUMERIC:
				{
				setState(371);
				identifier();
				}
				break;
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
				{
				setState(372);
				number();
				}
				break;
			case CHAR:
				{
				setState(373);
				match(CHAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(376);
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
			setState(382);
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
			case T__14:
			case T__15:
			case T__19:
			case T__20:
			case T__27:
			case T__30:
			case T__31:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__42:
			case T__43:
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
				setState(378);
				expr();
				setState(379);
				match(T__2);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
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
			setState(384);
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
			setState(388);
			switch (_input.LA(1)) {
			case PRE_IF:
			case PRE_ELIF:
			case PRE_ELSE:
			case PRE_ENDIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
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
				setState(387);
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
			setState(394);
			switch (_input.LA(1)) {
			case PRE_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				pre_if_statement();
				}
				break;
			case PRE_ELIF:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				pre_elif_statement();
				}
				break;
			case PRE_ELSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(392);
				pre_else_statement();
				}
				break;
			case PRE_ENDIF:
				enterOuterAlt(_localctx, 4);
				{
				setState(393);
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
			setState(396);
			match(PRE_IF);
			setState(397);
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
			setState(400);
			match(PRE_ELIF);
			setState(401);
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
			setState(404);
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
			setState(406);
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
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				match(T__0);
				setState(410);
				condition();
				setState(411);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(413);
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
			setState(425);
			switch (_input.LA(1)) {
			case PRE_DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				pre_define();
				}
				break;
			case PRE_UNDEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
				pre_undef();
				}
				break;
			case PRE_DIAGNOSTIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(418);
				pre_diagnostic();
				}
				break;
			case PRE_OTHER:
			case PRE_ATTRIBUTE:
				enterOuterAlt(_localctx, 4);
				{
				setState(419);
				pre_other();
				}
				break;
			case PRE_INCLUDE:
				enterOuterAlt(_localctx, 5);
				{
				setState(420);
				pre_include();
				}
				break;
			case PRE_INCLUDE_NEXT:
				enterOuterAlt(_localctx, 6);
				{
				setState(421);
				pre_include_next();
				}
				break;
			case PRE_LINE:
				enterOuterAlt(_localctx, 7);
				{
				setState(422);
				pre_line();
				}
				break;
			case PRE_PRAGMA:
				enterOuterAlt(_localctx, 8);
				{
				setState(423);
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
				setState(424);
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
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				match(PRE_DEFINE);
				setState(428);
				pre_macro_identifier();
				setState(429);
				pre_macro();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				match(PRE_DEFINE);
				setState(432);
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
			setState(435);
			match(PRE_UNDEF);
			setState(436);
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
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				identifier();
				setState(443);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(439);
					match(T__0);
					setState(440);
					pre_macro_parameters();
					setState(441);
					match(T__1);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				keyword();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(446);
				match(END_TEST);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(447);
				match(T__4);
				setState(452);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(448);
					match(T__0);
					setState(449);
					pre_macro_parameters();
					setState(450);
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
			setState(456);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (STATIC - 73)) | (1L << (VOID - 73)) | (1L << (UNSIGNED - 73)) | (1L << (SIGNED - 73)) | (1L << (VIRTUAL - 73)) | (1L << (OPERATOR - 73)) | (1L << (CLASS_KEY - 73)))) != 0)) ) {
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
			setState(460);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case NEW:
			case PRE_PRAGMA_KEYWORDS:
			case ALPHA_NUMERIC:
				{
				setState(458);
				identifier();
				}
				break;
			case ELLIPSIS:
				{
				setState(459);
				match(ELLIPSIS);
				}
				break;
			case T__1:
			case T__12:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(462);
				match(T__12);
				setState(465);
				switch (_input.LA(1)) {
				case T__8:
				case T__9:
				case T__10:
				case NEW:
				case PRE_PRAGMA_KEYWORDS:
				case ALPHA_NUMERIC:
					{
					setState(463);
					identifier();
					}
					break;
				case ELLIPSIS:
					{
					setState(464);
					match(ELLIPSIS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(471);
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
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			pre_macro_identifier();
			setState(477);
			match(T__0);
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__27) | (1L << T__30) | (1L << T__31) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__43))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (STATIC - 73)) | (1L << (VOID - 73)) | (1L << (UNSIGNED - 73)) | (1L << (SIGNED - 73)) | (1L << (CV_QUALIFIER - 73)) | (1L << (EXTERN - 73)) | (1L << (VIRTUAL - 73)) | (1L << (SPECIAL_DATA - 73)) | (1L << (OPERATOR - 73)) | (1L << (CLASS_KEY - 73)) | (1L << (NEW - 73)) | (1L << (PRE_PRAGMA_KEYWORDS - 73)) | (1L << (END_TEST - 73)) | (1L << (ALPHA_NUMERIC - 73)) | (1L << (OPENING_CURLY - 73)) | (1L << (HEX_LITERAL - 73)) | (1L << (DECIMAL_LITERAL - 73)) | (1L << (OCTAL_LITERAL - 73)) | (1L << (FLOATING_POINT_LITERAL - 73)) | (1L << (CHAR - 73)) | (1L << (STRING - 73)) | (1L << (NEWLINE - 73)))) != 0)) {
					{
					setState(483);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						setState(478);
						match(T__12);
						}
						break;
					case 2:
						{
						setState(479);
						type_name();
						}
						break;
					case 3:
						{
						setState(480);
						expr();
						}
						break;
					case 4:
						{
						setState(481);
						ptr_operator();
						}
						break;
					case 5:
						{
						setState(482);
						match(NEWLINE);
						}
						break;
					}
					}
					setState(487);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(488);
				match(VOID);
				}
				break;
			}
			setState(491);
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
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				match(PRE_DIAGNOSTIC);
				setState(494);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
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
			setState(510);
			switch (_input.LA(1)) {
			case PRE_OTHER:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				match(PRE_OTHER);
				setState(500);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(499);
					match(STRING);
					}
					break;
				}
				}
				break;
			case PRE_ATTRIBUTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(502);
				match(PRE_ATTRIBUTE);
				setState(503);
				match(T__0);
				setState(504);
				match(T__0);
				setState(506);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (STATIC - 73)) | (1L << (VOID - 73)) | (1L << (UNSIGNED - 73)) | (1L << (SIGNED - 73)) | (1L << (VIRTUAL - 73)) | (1L << (OPERATOR - 73)) | (1L << (CLASS_KEY - 73)) | (1L << (NEW - 73)) | (1L << (PRE_PRAGMA_KEYWORDS - 73)) | (1L << (END_TEST - 73)) | (1L << (ALPHA_NUMERIC - 73)))) != 0)) {
					{
					setState(505);
					attributeList();
					}
				}

				setState(508);
				match(T__1);
				setState(509);
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
			setState(512);
			attribute();
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(513);
				match(T__12);
				setState(514);
				attribute();
				}
				}
				setState(519);
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
			setState(547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(520);
				pre_macro_identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(521);
				pre_macro_identifier();
				setState(522);
				match(T__0);
				setState(523);
				identifier();
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(524);
					match(T__12);
					setState(525);
					expr();
					}
					}
					setState(530);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(531);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(533);
				pre_macro_identifier();
				setState(534);
				match(T__0);
				setState(536);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__27) | (1L << T__30) | (1L << T__31) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__43))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (STATIC - 73)) | (1L << (VOID - 73)) | (1L << (UNSIGNED - 73)) | (1L << (SIGNED - 73)) | (1L << (CV_QUALIFIER - 73)) | (1L << (EXTERN - 73)) | (1L << (VIRTUAL - 73)) | (1L << (SPECIAL_DATA - 73)) | (1L << (OPERATOR - 73)) | (1L << (CLASS_KEY - 73)) | (1L << (NEW - 73)) | (1L << (PRE_PRAGMA_KEYWORDS - 73)) | (1L << (END_TEST - 73)) | (1L << (ALPHA_NUMERIC - 73)) | (1L << (OPENING_CURLY - 73)) | (1L << (HEX_LITERAL - 73)) | (1L << (DECIMAL_LITERAL - 73)) | (1L << (OCTAL_LITERAL - 73)) | (1L << (FLOATING_POINT_LITERAL - 73)) | (1L << (CHAR - 73)) | (1L << (STRING - 73)))) != 0)) {
					{
					setState(535);
					expr();
					}
				}

				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(538);
					match(T__12);
					setState(539);
					expr();
					}
					}
					setState(544);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(545);
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
			setState(554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				match(PRE_INCLUDE);
				setState(550);
				pre_include_local_file();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(551);
				match(PRE_INCLUDE);
				setState(552);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(553);
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
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(556);
				match(PRE_INCLUDE_NEXT);
				setState(557);
				pre_include_local_file();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(558);
				match(PRE_INCLUDE_NEXT);
				setState(559);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(560);
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
			setState(563);
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
			setState(565);
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
			setState(581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(567);
				match(PRE_LINE);
				setState(568);
				match(DECIMAL_LITERAL);
				setState(569);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				match(PRE_LINE);
				setState(571);
				match(DECIMAL_LITERAL);
				setState(572);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(573);
				match(PRE_LINE);
				setState(574);
				pre_macro_identifier();
				setState(575);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(577);
				match(PRE_LINE);
				setState(578);
				pre_macro_identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(579);
				match(PRE_LINE);
				setState(580);
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
			setState(603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(583);
				match(PRE_PRAGMA);
				setState(585);
				_la = _input.LA(1);
				if (_la==PRE_GCC) {
					{
					setState(584);
					match(PRE_GCC);
					}
				}

				setState(587);
				match(PRE_PRAGMA_KEYWORDS);
				setState(588);
				match(STRING);
				 preProcFindMacroEnd(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				match(PRE_PRAGMA);
				setState(592);
				_la = _input.LA(1);
				if (_la==PRE_GCC) {
					{
					setState(591);
					match(PRE_GCC);
					}
				}

				setState(594);
				match(PRE_PRAGMA_KEYWORDS);
				setState(598);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(595);
						identifier();
						}
						} 
					}
					setState(600);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(601);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterCustom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitCustom(this);
		}
	}

	public final CustomContext custom() throws RecognitionException {
		CustomContext _localctx = new CustomContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_custom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(605);
				asciiTab();
				}
				break;
			case 2:
				{
				setState(606);
				externC();
				}
				break;
			case 3:
				{
				setState(607);
				macroFunctionPointer();
				}
				break;
			case 4:
				{
				setState(608);
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
		enterRule(_localctx, 74, RULE_asciiTab);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(614); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(611);
					pre_macro_identifier();
					setState(612);
					match(T__12);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(616); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
		enterRule(_localctx, 76, RULE_externC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			match(EXTERN);
			setState(619);
			match(T__13);
			setState(621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(620);
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
		enterRule(_localctx, 78, RULE_macroFunctionPointer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			macroCall();
			setState(625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(624);
				match(NEWLINE);
				}
				break;
			}
			setState(628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(627);
				pre_macro_identifier();
				}
				break;
			}
			setState(631);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(630);
				match(NEWLINE);
				}
			}

			setState(633);
			macroCall();
			setState(635);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(634);
				match(NEWLINE);
				}
			}

			setState(637);
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
		enterRule(_localctx, 80, RULE_testStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			match(T__4);
			setState(640);
			match(T__0);
			setState(641);
			function_name();
			setState(642);
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
		enterRule(_localctx, 82, RULE_testEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFunction_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFunction_def(this);
		}
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_function_def);
		int _la;
		try {
			setState(680);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(646);
					template_decl_start();
					setState(650);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(647);
						match(NEWLINE);
						}
						}
						setState(652);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(662);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(655);
					return_type();
					setState(659);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(656);
						match(NEWLINE);
						}
						}
						setState(661);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(664);
				function_name();
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(665);
					match(NEWLINE);
					}
					}
					setState(670);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(671);
				function_param_list();
				setState(673);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(672);
					ctor_list();
					}
				}

				setState(675);
				compound_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(677);
				testStart();
				setState(678);
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
		enterRule(_localctx, 86, RULE_return_type);
		int _la;
		try {
			int _alt;
			setState(703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(691);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(682);
						function_decl_specifiers();
						setState(686);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(683);
							match(NEWLINE);
							}
							}
							setState(688);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						} 
					}
					setState(693);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				}
				setState(694);
				type_name();
				}
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14 || _la==T__27) {
					{
					{
					setState(696);
					ptr_operator();
					}
					}
					setState(701);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(702);
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
		public List<TerminalNode> CV_QUALIFIER() { return getTokens(FunctionParser.CV_QUALIFIER); }
		public TerminalNode CV_QUALIFIER(int i) {
			return getToken(FunctionParser.CV_QUALIFIER, i);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFunction_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFunction_param_list(this);
		}
	}

	public final Function_param_listContext function_param_list() throws RecognitionException {
		Function_param_listContext _localctx = new Function_param_listContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_function_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			match(T__0);
			setState(707);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__19) | (1L << T__20) | (1L << T__27))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (STATIC - 73)) | (1L << (VOID - 73)) | (1L << (UNSIGNED - 73)) | (1L << (SIGNED - 73)) | (1L << (CV_QUALIFIER - 73)) | (1L << (EXTERN - 73)) | (1L << (VIRTUAL - 73)) | (1L << (AUTO - 73)) | (1L << (REGISTER - 73)) | (1L << (SPECIAL_DATA - 73)) | (1L << (OPERATOR - 73)) | (1L << (CLASS_KEY - 73)) | (1L << (NEW - 73)) | (1L << (PRE_PRAGMA_KEYWORDS - 73)) | (1L << (END_TEST - 73)) | (1L << (ALPHA_NUMERIC - 73)))) != 0)) {
				{
				setState(706);
				parameter_decl_clause();
				}
			}

			setState(709);
			match(T__1);
			setState(711);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(710);
				match(T__14);
				}
			}

			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CV_QUALIFIER) {
				{
				{
				setState(713);
				match(CV_QUALIFIER);
				}
				}
				setState(718);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(720);
			_la = _input.LA(1);
			if (_la==THROW) {
				{
				setState(719);
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
		enterRule(_localctx, 90, RULE_parameter_decl_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(722);
			parameter_decl();
			setState(733);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(723);
					match(T__12);
					setState(727);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(724);
						match(NEWLINE);
						}
						}
						setState(729);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(730);
					parameter_decl();
					}
					} 
				}
				setState(735);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			}
			setState(744);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(736);
				match(T__12);
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(737);
					match(NEWLINE);
					}
					}
					setState(742);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(743);
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
		enterRule(_localctx, 92, RULE_parameter_decl);
		try {
			setState(750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(746);
				match(VOID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(747);
				param_decl_specifiers();
				setState(748);
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
		enterRule(_localctx, 94, RULE_parameter_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			_la = _input.LA(1);
			if (_la==T__14 || _la==T__27) {
				{
				setState(752);
				ptrs();
				}
			}

			setState(760);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(755);
				match(T__0);
				setState(756);
				parameter_id();
				setState(757);
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
				setState(759);
				parameter_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(763);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__34) {
				{
				setState(762);
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
		enterRule(_localctx, 96, RULE_compound_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
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
		enterRule(_localctx, 98, RULE_ctor_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			match(T__3);
			setState(769);
			ctor_initializer();
			setState(774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(770);
				match(T__12);
				setState(771);
				ctor_initializer();
				}
				}
				setState(776);
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
		enterRule(_localctx, 100, RULE_ctor_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			initializer_id();
			setState(778);
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
		enterRule(_localctx, 102, RULE_initializer_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(780);
				match(T__15);
				}
			}

			setState(783);
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
		enterRule(_localctx, 104, RULE_ctor_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			match(T__0);
			setState(787);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__27) | (1L << T__30) | (1L << T__31) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__43))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (STATIC - 73)) | (1L << (VOID - 73)) | (1L << (UNSIGNED - 73)) | (1L << (SIGNED - 73)) | (1L << (CV_QUALIFIER - 73)) | (1L << (EXTERN - 73)) | (1L << (VIRTUAL - 73)) | (1L << (SPECIAL_DATA - 73)) | (1L << (OPERATOR - 73)) | (1L << (CLASS_KEY - 73)) | (1L << (NEW - 73)) | (1L << (PRE_PRAGMA_KEYWORDS - 73)) | (1L << (END_TEST - 73)) | (1L << (ALPHA_NUMERIC - 73)) | (1L << (OPENING_CURLY - 73)) | (1L << (HEX_LITERAL - 73)) | (1L << (DECIMAL_LITERAL - 73)) | (1L << (OCTAL_LITERAL - 73)) | (1L << (FLOATING_POINT_LITERAL - 73)) | (1L << (CHAR - 73)) | (1L << (STRING - 73)))) != 0)) {
				{
				setState(786);
				expr();
				}
			}

			setState(789);
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
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		enterRule(_localctx, 106, RULE_function_name);
		try {
			setState(798);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(791);
				match(T__0);
				setState(792);
				function_name();
				setState(793);
				match(T__1);
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
				setState(795);
				identifier();
				}
				break;
			case OPERATOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(796);
				match(OPERATOR);
				setState(797);
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
		enterRule(_localctx, 108, RULE_exception_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			match(THROW);
			setState(801);
			match(T__0);
			setState(802);
			type_id_list();
			setState(803);
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
		enterRule(_localctx, 110, RULE_type_id_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << IF) | (1L << ELSE) | (1L << FOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(805);
				no_brackets();
				}
				}
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(811);
				match(T__0);
				setState(812);
				type_id_list();
				setState(813);
				match(T__1);
				setState(817);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << IF) | (1L << ELSE) | (1L << FOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(814);
					no_brackets();
					}
					}
					setState(819);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
		enterRule(_localctx, 112, RULE_simple_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
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
		public TerminalNode NEWLINE() { return getToken(FunctionParser.NEWLINE, 0); }
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public Pre_otherContext pre_other() {
			return getRuleContext(Pre_otherContext.class,0);
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
		public TerminalNode NEWLINE() { return getToken(FunctionParser.NEWLINE, 0); }
		public CallingConventionContext callingConvention() {
			return getRuleContext(CallingConventionContext.class,0);
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
		public TerminalNode TYPEDEF() { return getToken(FunctionParser.TYPEDEF, 0); }
		public TerminalNode NEWLINE() { return getToken(FunctionParser.NEWLINE, 0); }
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public Pre_otherContext pre_other() {
			return getRuleContext(Pre_otherContext.class,0);
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
		enterRule(_localctx, 114, RULE_var_decl);
		int _la;
		try {
			setState(888);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				_localctx = new DeclByClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(828);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(827);
					template_decl_start();
					}
				}

				setState(830);
				class_def();
				setState(832);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(831);
					match(NEWLINE);
					}
					break;
				}
				setState(835);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(834);
					init_declarator_list();
					}
					break;
				}
				setState(838);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(837);
					pre_other();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new DeclByTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(841);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(840);
					match(TYPEDEF);
					}
				}

				setState(844);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(843);
					template_decl_start();
					}
				}

				setState(846);
				type_name();
				setState(848);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(847);
					match(NEWLINE);
					}
				}

				setState(850);
				init_declarator_list();
				}
				break;
			case 3:
				_localctx = new FunctionPointerDeclareContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(853);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(852);
					match(TYPEDEF);
					}
				}

				setState(855);
				type_name();
				setState(857);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(856);
					match(NEWLINE);
					}
				}

				setState(859);
				match(T__0);
				setState(861);
				_la = _input.LA(1);
				if (_la==ALPHA_NUMERIC) {
					{
					setState(860);
					callingConvention();
					}
				}

				setState(863);
				ptr_operator();
				setState(864);
				identifier();
				setState(865);
				match(T__1);
				setState(866);
				param_type_list();
				setState(867);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new StructUnionEnumContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(870);
				_la = _input.LA(1);
				if (_la==CV_QUALIFIER) {
					{
					setState(869);
					match(CV_QUALIFIER);
					}
				}

				setState(873);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(872);
					match(TYPEDEF);
					}
				}

				setState(875);
				special_datatype();
				setState(877);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(876);
					match(NEWLINE);
					}
					break;
				}
				setState(880);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(879);
					init_declarator_list();
					}
					break;
				}
				setState(883);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(882);
					pre_other();
					}
					break;
				}
				setState(886);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(885);
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
		enterRule(_localctx, 116, RULE_callingConvention);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(890);
				match(ALPHA_NUMERIC);
				}
				}
				setState(893); 
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
		enterRule(_localctx, 118, RULE_special_datatype);
		int _la;
		try {
			setState(927);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(895);
				match(SPECIAL_DATA);
				setState(897);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(896);
					pre_other();
					}
					break;
				}
				setState(900);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NEW - 91)) | (1L << (PRE_PRAGMA_KEYWORDS - 91)) | (1L << (ALPHA_NUMERIC - 91)))) != 0)) {
					{
					setState(899);
					identifier();
					}
				}

				setState(903);
				_la = _input.LA(1);
				if (_la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(902);
					pre_other();
					}
				}

				setState(905);
				match(OPENING_CURLY);
				skipToEndOfObject(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(907);
				match(SPECIAL_DATA);
				setState(909);
				_la = _input.LA(1);
				if (_la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(908);
					pre_other();
					}
				}

				setState(911);
				identifier();
				setState(913);
				_la = _input.LA(1);
				if (_la==T__14 || _la==T__27) {
					{
					setState(912);
					ptrs();
					}
				}

				setState(915);
				identifier();
				setState(917);
				_la = _input.LA(1);
				if (_la==T__14 || _la==T__27) {
					{
					setState(916);
					ptrs();
					}
				}

				setState(919);
				match(T__16);
				skipToEndOfObject(); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(922);
				match(SPECIAL_DATA);
				setState(924);
				_la = _input.LA(1);
				if (_la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(923);
					pre_other();
					}
				}

				setState(926);
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
		public Pre_otherContext pre_other() {
			return getRuleContext(Pre_otherContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
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
		enterRule(_localctx, 120, RULE_init_declarator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
			init_declarator();
			setState(940);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(930);
				match(T__12);
				setState(934);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(931);
					match(NEWLINE);
					}
					}
					setState(936);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(937);
				init_declarator();
				}
				}
				setState(942);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(944);
			_la = _input.LA(1);
			if (_la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
				{
				setState(943);
				pre_other();
				}
			}

			setState(946);
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
		enterRule(_localctx, 122, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			match(CLASS_KEY);
			setState(950);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NEW - 91)) | (1L << (PRE_PRAGMA_KEYWORDS - 91)) | (1L << (ALPHA_NUMERIC - 91)))) != 0)) {
				{
				setState(949);
				class_name();
				}
			}

			setState(953);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(952);
				base_classes();
				}
			}

			setState(955);
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
		enterRule(_localctx, 124, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
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
		enterRule(_localctx, 126, RULE_base_classes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			match(T__3);
			setState(961);
			base_class();
			setState(966);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(962);
				match(T__12);
				setState(963);
				base_class();
				}
				}
				setState(968);
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
		enterRule(_localctx, 128, RULE_base_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970);
			_la = _input.LA(1);
			if (_la==VIRTUAL) {
				{
				setState(969);
				match(VIRTUAL);
				}
			}

			setState(973);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(972);
				access_specifier();
				}
				break;
			}
			setState(975);
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
		enterRule(_localctx, 130, RULE_type_name);
		int _la;
		try {
			int _alt;
			setState(1020);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(978);
				_la = _input.LA(1);
				if (_la==EXTERN) {
					{
					setState(977);
					match(EXTERN);
					}
				}

				setState(986); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(986);
						switch (_input.LA(1)) {
						case T__5:
						case T__6:
						case T__7:
						case STATIC:
						case VIRTUAL:
							{
							setState(980);
							function_decl_specifiers();
							}
							break;
						case CV_QUALIFIER:
							{
							setState(981);
							match(CV_QUALIFIER);
							}
							break;
						case UNSIGNED:
							{
							setState(982);
							match(UNSIGNED);
							}
							break;
						case SIGNED:
							{
							setState(983);
							match(SIGNED);
							}
							break;
						case T__14:
						case T__27:
							{
							setState(984);
							ptr_operator();
							}
							break;
						case T__11:
						case T__19:
						case T__20:
						case VOID:
						case SPECIAL_DATA:
						case CLASS_KEY:
						case ALPHA_NUMERIC:
							{
							setState(985);
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
					setState(988); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(994);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(990);
					match(T__17);
					setState(991);
					template_param_list();
					setState(992);
					match(T__18);
					}
				}

				setState(1006);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(996);
						match(T__15);
						setState(997);
						base_type();
						setState(1002);
						_la = _input.LA(1);
						if (_la==T__17) {
							{
							setState(998);
							match(T__17);
							setState(999);
							template_param_list();
							setState(1000);
							match(T__18);
							}
						}

						}
						} 
					}
					setState(1008);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
				}
				setState(1016);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(1014);
						switch (_input.LA(1)) {
						case T__5:
						case T__6:
						case T__7:
						case STATIC:
						case VIRTUAL:
							{
							setState(1009);
							function_decl_specifiers();
							}
							break;
						case CV_QUALIFIER:
							{
							setState(1010);
							match(CV_QUALIFIER);
							}
							break;
						case UNSIGNED:
							{
							setState(1011);
							match(UNSIGNED);
							}
							break;
						case SIGNED:
							{
							setState(1012);
							match(SIGNED);
							}
							break;
						case T__14:
						case T__27:
							{
							setState(1013);
							ptr_operator();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(1018);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1019);
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
		enterRule(_localctx, 132, RULE_base_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1023); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1022);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__19) | (1L << T__20))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (VOID - 74)) | (1L << (SPECIAL_DATA - 74)) | (1L << (CLASS_KEY - 74)) | (1L << (ALPHA_NUMERIC - 74)))) != 0)) ) {
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
				setState(1025); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
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
		enterRule(_localctx, 134, RULE_param_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			_la = _input.LA(1);
			if (_la==AUTO || _la==REGISTER) {
				{
				setState(1027);
				_la = _input.LA(1);
				if ( !(_la==AUTO || _la==REGISTER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1030);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterParameter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitParameter_name(this);
		}
	}

	public final Parameter_nameContext parameter_name() throws RecognitionException {
		Parameter_nameContext _localctx = new Parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_parameter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
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
		public TerminalNode VOID() { return getToken(FunctionParser.VOID, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
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
		enterRule(_localctx, 138, RULE_param_type_list);
		int _la;
		try {
			setState(1058);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1034);
				match(T__0);
				setState(1035);
				match(VOID);
				setState(1036);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1037);
				match(T__0);
				setState(1039);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1038);
					match(NEWLINE);
					}
				}

				setState(1055);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__19) | (1L << T__20) | (1L << T__27))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (STATIC - 73)) | (1L << (VOID - 73)) | (1L << (UNSIGNED - 73)) | (1L << (SIGNED - 73)) | (1L << (CV_QUALIFIER - 73)) | (1L << (EXTERN - 73)) | (1L << (VIRTUAL - 73)) | (1L << (AUTO - 73)) | (1L << (REGISTER - 73)) | (1L << (SPECIAL_DATA - 73)) | (1L << (OPERATOR - 73)) | (1L << (CLASS_KEY - 73)) | (1L << (NEW - 73)) | (1L << (PRE_PRAGMA_KEYWORDS - 73)) | (1L << (END_TEST - 73)) | (1L << (ALPHA_NUMERIC - 73)) | (1L << (ELLIPSIS - 73)))) != 0)) {
					{
					setState(1041);
					param_type();
					setState(1043);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1042);
						match(NEWLINE);
						}
					}

					setState(1052);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(1045);
						match(T__12);
						setState(1047);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(1046);
							match(NEWLINE);
							}
						}

						setState(1049);
						param_type();
						}
						}
						setState(1054);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1057);
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
		enterRule(_localctx, 140, RULE_param_type);
		try {
			setState(1064);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__14:
			case T__19:
			case T__20:
			case T__27:
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
				setState(1060);
				param_decl_specifiers();
				setState(1061);
				param_type_id();
				}
				break;
			case ELLIPSIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1063);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
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
		enterRule(_localctx, 142, RULE_param_type_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067);
			_la = _input.LA(1);
			if (_la==T__14 || _la==T__27) {
				{
				setState(1066);
				ptrs();
				}
			}

			setState(1082);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1069);
				match(T__0);
				setState(1071);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(1070);
					match(NEWLINE);
					}
					break;
				}
				setState(1073);
				param_type_id();
				setState(1075);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1074);
					match(NEWLINE);
					}
				}

				setState(1077);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(1080);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NEW - 91)) | (1L << (PRE_PRAGMA_KEYWORDS - 91)) | (1L << (ALPHA_NUMERIC - 91)))) != 0)) {
					{
					setState(1079);
					parameter_name();
					}
				}

				}
				break;
			}
			setState(1085);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__34) {
				{
				setState(1084);
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
		enterRule(_localctx, 144, RULE_identifier);
		try {
			int _alt;
			setState(1098);
			switch (_input.LA(1)) {
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1087);
				match(ALPHA_NUMERIC);
				setState(1092);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1088);
						match(T__15);
						setState(1089);
						match(ALPHA_NUMERIC);
						}
						} 
					}
					setState(1094);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				}
				}
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(1095);
				match(NEW);
				}
				break;
			case PRE_PRAGMA_KEYWORDS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1096);
				match(PRE_PRAGMA_KEYWORDS);
				}
				break;
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(1097);
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
		enterRule(_localctx, 146, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPtrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPtrs(this);
		}
	}

	public final PtrsContext ptrs() throws RecognitionException {
		PtrsContext _localctx = new PtrsContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_ptrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1106); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1102);
				ptr_operator();
				setState(1104);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(1103);
					match(T__21);
					}
				}

				}
				}
				setState(1108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__14 || _la==T__27 );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 150, RULE_func_ptrs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1110);
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
		enterRule(_localctx, 152, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1112);
			assign_expr();
			setState(1117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1113);
					match(ESCAPE);
					setState(1114);
					match(NEWLINE);
					}
					} 
				}
				setState(1119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			}
			setState(1134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1120);
					match(NEWLINE);
					}
					}
					setState(1125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1126);
				match(T__12);
				setState(1130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1127);
					match(NEWLINE);
					}
					}
					setState(1132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1133);
				expr();
				}
				break;
			}
			setState(1140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1136);
					match(ESCAPE);
					setState(1137);
					match(NEWLINE);
					}
					} 
				}
				setState(1142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 154, RULE_assign_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1143);
			conditional_expression();
			setState(1159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1144);
					match(NEWLINE);
					}
					}
					setState(1149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1150);
				assignment_operator();
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
		enterRule(_localctx, 156, RULE_conditional_expression);
		int _la;
		try {
			setState(1192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				_localctx = new NormOrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1161);
				or_expression();
				}
				break;
			case 2:
				_localctx = new CndExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1162);
				or_expression();
				{
				setState(1166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1163);
					match(NEWLINE);
					}
					}
					setState(1168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1169);
				match(T__22);
				setState(1173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1170);
					match(NEWLINE);
					}
					}
					setState(1175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1176);
				expr();
				setState(1180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1177);
					match(NEWLINE);
					}
					}
					setState(1182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1183);
				match(T__3);
				setState(1187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1184);
					match(NEWLINE);
					}
					}
					setState(1189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1190);
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
		enterRule(_localctx, 158, RULE_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1194);
			and_expression();
			setState(1209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				{
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
				match(T__23);
				setState(1205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1202);
					match(NEWLINE);
					}
					}
					setState(1207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1208);
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
		enterRule(_localctx, 160, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
			inclusive_or_expression();
			setState(1226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				{
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
				match(T__24);
				setState(1222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1219);
					match(NEWLINE);
					}
					}
					setState(1224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1225);
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
		enterRule(_localctx, 162, RULE_inclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1228);
			exclusive_or_expression();
			setState(1243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1229);
					match(NEWLINE);
					}
					}
					setState(1234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1235);
				match(T__25);
				setState(1239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1236);
					match(NEWLINE);
					}
					}
					setState(1241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1242);
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
		enterRule(_localctx, 164, RULE_exclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1245);
			bit_and_expression();
			setState(1260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1246);
					match(NEWLINE);
					}
					}
					setState(1251);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1252);
				match(T__26);
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
		enterRule(_localctx, 166, RULE_bit_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1262);
			equality_expression();
			setState(1277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1263);
					match(NEWLINE);
					}
					}
					setState(1268);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1269);
				match(T__27);
				setState(1273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1270);
					match(NEWLINE);
					}
					}
					setState(1275);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1276);
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
		enterRule(_localctx, 168, RULE_equality_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
			relational_expression();
			setState(1295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1280);
					match(NEWLINE);
					}
					}
					setState(1285);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1286);
				equality_operator();
				setState(1290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1287);
					match(NEWLINE);
					}
					}
					setState(1292);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1293);
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
		enterRule(_localctx, 170, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1297);
			shift_expression();
			setState(1313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
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
				relational_operator();
				setState(1308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1305);
					match(NEWLINE);
					}
					}
					setState(1310);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1311);
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
		enterRule(_localctx, 172, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1315);
			additive_expression();
			setState(1330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1316);
					match(NEWLINE);
					}
					}
					setState(1321);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1322);
				_la = _input.LA(1);
				if ( !(_la==T__28 || _la==T__29) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1323);
					match(NEWLINE);
					}
					}
					setState(1328);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1329);
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
		enterRule(_localctx, 174, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1332);
			multiplicative_expression();
			setState(1347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(1336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1333);
					match(NEWLINE);
					}
					}
					setState(1338);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1339);
				_la = _input.LA(1);
				if ( !(_la==T__30 || _la==T__31) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1340);
					match(NEWLINE);
					}
					}
					setState(1345);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1346);
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
		enterRule(_localctx, 176, RULE_multiplicative_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1349);
			function_pointer_use_expression();
			setState(1364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1350);
					match(NEWLINE);
					}
					}
					setState(1355);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1356);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__32) | (1L << T__33))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1357);
					match(NEWLINE);
					}
					}
					setState(1362);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1363);
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
		enterRule(_localctx, 178, RULE_function_pointer_use_expression);
		try {
			setState(1375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1366);
				match(T__0);
				setState(1367);
				ptr_operator();
				setState(1368);
				identifier();
				setState(1369);
				match(T__1);
				setState(1370);
				match(T__0);
				setState(1371);
				argument_list();
				setState(1372);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1374);
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
		enterRule(_localctx, 180, RULE_cast_expression);
		try {
			setState(1383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1377);
				match(T__0);
				setState(1378);
				cast_target();
				setState(1379);
				match(T__1);
				setState(1380);
				cast_expression();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1382);
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
		enterRule(_localctx, 182, RULE_cast_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1385);
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
		enterRule(_localctx, 184, RULE_unary_expression);
		try {
			setState(1393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1387);
				address_of_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1388);
				unary_op_and_cast_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1389);
				sizeof_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1390);
				new_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1391);
				postfix_expression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1392);
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
		enterRule(_localctx, 186, RULE_address_of_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1395);
			match(T__27);
			setState(1396);
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
		enterRule(_localctx, 188, RULE_new_expression);
		int _la;
		try {
			setState(1444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1399);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(1398);
					match(T__15);
					}
				}

				setState(1401);
				match(NEW);
				setState(1405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1402);
					match(NEWLINE);
					}
					}
					setState(1407);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1408);
				type_name();
				setState(1412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1409);
					match(NEWLINE);
					}
					}
					setState(1414);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1415);
				match(T__34);
				setState(1417);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__27) | (1L << T__30) | (1L << T__31) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__43))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (STATIC - 73)) | (1L << (VOID - 73)) | (1L << (UNSIGNED - 73)) | (1L << (SIGNED - 73)) | (1L << (CV_QUALIFIER - 73)) | (1L << (EXTERN - 73)) | (1L << (VIRTUAL - 73)) | (1L << (SPECIAL_DATA - 73)) | (1L << (OPERATOR - 73)) | (1L << (CLASS_KEY - 73)) | (1L << (NEW - 73)) | (1L << (PRE_PRAGMA_KEYWORDS - 73)) | (1L << (END_TEST - 73)) | (1L << (ALPHA_NUMERIC - 73)) | (1L << (OPENING_CURLY - 73)) | (1L << (HEX_LITERAL - 73)) | (1L << (DECIMAL_LITERAL - 73)) | (1L << (OCTAL_LITERAL - 73)) | (1L << (FLOATING_POINT_LITERAL - 73)) | (1L << (CHAR - 73)) | (1L << (STRING - 73)))) != 0)) {
					{
					setState(1416);
					conditional_expression();
					}
				}

				setState(1419);
				match(T__35);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1422);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(1421);
					match(T__15);
					}
				}

				setState(1424);
				match(NEW);
				setState(1428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1425);
					match(NEWLINE);
					}
					}
					setState(1430);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1431);
				type_name();
				setState(1435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1432);
					match(NEWLINE);
					}
					}
					setState(1437);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1438);
				match(T__0);
				setState(1440);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__27) | (1L << T__30) | (1L << T__31) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__43))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (STATIC - 73)) | (1L << (VOID - 73)) | (1L << (UNSIGNED - 73)) | (1L << (SIGNED - 73)) | (1L << (CV_QUALIFIER - 73)) | (1L << (EXTERN - 73)) | (1L << (VIRTUAL - 73)) | (1L << (SPECIAL_DATA - 73)) | (1L << (OPERATOR - 73)) | (1L << (CLASS_KEY - 73)) | (1L << (NEW - 73)) | (1L << (PRE_PRAGMA_KEYWORDS - 73)) | (1L << (END_TEST - 73)) | (1L << (ALPHA_NUMERIC - 73)) | (1L << (OPENING_CURLY - 73)) | (1L << (HEX_LITERAL - 73)) | (1L << (DECIMAL_LITERAL - 73)) | (1L << (OCTAL_LITERAL - 73)) | (1L << (FLOATING_POINT_LITERAL - 73)) | (1L << (CHAR - 73)) | (1L << (STRING - 73)))) != 0)) {
					{
					setState(1439);
					expr();
					}
				}

				setState(1442);
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
		enterRule(_localctx, 190, RULE_unary_op_and_cast_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1446);
			unary_operator();
			setState(1450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1447);
				match(NEWLINE);
				}
				}
				setState(1452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1453);
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
		enterRule(_localctx, 192, RULE_sizeof_expression);
		int _la;
		try {
			setState(1475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1455);
				sizeof();
				setState(1459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1456);
					match(NEWLINE);
					}
					}
					setState(1461);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1462);
				match(T__0);
				setState(1463);
				sizeof_operand();
				setState(1464);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1466);
				sizeof();
				setState(1470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1467);
					match(NEWLINE);
					}
					}
					setState(1472);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1473);
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
		enterRule(_localctx, 194, RULE_sizeof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1477);
			match(T__36);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 196, RULE_defined_expression);
		int _la;
		try {
			setState(1498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1479);
				match(T__37);
				setState(1483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1480);
					match(NEWLINE);
					}
					}
					setState(1485);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1486);
				match(T__0);
				setState(1487);
				expr();
				setState(1488);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1490);
				match(T__37);
				setState(1494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1491);
					match(NEWLINE);
					}
					}
					setState(1496);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1497);
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
		enterRule(_localctx, 198, RULE_sizeof_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1500);
			type_name();
			setState(1510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14 || _la==T__27 || _la==NEWLINE) {
				{
				{
				setState(1504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1501);
					match(NEWLINE);
					}
					}
					setState(1506);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1507);
				ptr_operator();
				}
				}
				setState(1512);
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
		enterRule(_localctx, 200, RULE_sizeof_operand2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1513);
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
		enterRule(_localctx, 202, RULE_inc_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1515);
			_la = _input.LA(1);
			if ( !(_la==T__38 || _la==T__39) ) {
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
		int _startState = 204;
		enterRecursionRule(_localctx, 204, RULE_postfix_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				_localctx = new ArrayAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1519);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__19) | (1L << T__20) | (1L << T__27))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (STATIC - 73)) | (1L << (VOID - 73)) | (1L << (UNSIGNED - 73)) | (1L << (SIGNED - 73)) | (1L << (CV_QUALIFIER - 73)) | (1L << (EXTERN - 73)) | (1L << (VIRTUAL - 73)) | (1L << (SPECIAL_DATA - 73)) | (1L << (OPERATOR - 73)) | (1L << (CLASS_KEY - 73)) | (1L << (NEW - 73)) | (1L << (PRE_PRAGMA_KEYWORDS - 73)) | (1L << (END_TEST - 73)) | (1L << (ALPHA_NUMERIC - 73)))) != 0)) {
					{
					setState(1518);
					type_name();
					}
				}

				setState(1521);
				initializer_expression();
				}
				break;
			case 2:
				{
				_localctx = new PrimaryOnlyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1522);
				primary_expression();
				}
				break;
			case 3:
				{
				_localctx = new IncDecOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1524);
				_la = _input.LA(1);
				if (_la==T__14 || _la==T__27) {
					{
					setState(1523);
					ptr_operator();
					}
				}

				setState(1526);
				inc_dec();
				setState(1530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1527);
					match(NEWLINE);
					}
					}
					setState(1532);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1534);
				_la = _input.LA(1);
				if (_la==T__14 || _la==T__27) {
					{
					setState(1533);
					ptr_operator();
					}
				}

				setState(1536);
				primary_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1597);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1595);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayIndexingContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1540);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1544);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(1541);
							match(NEWLINE);
							}
							}
							setState(1546);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1547);
						match(T__34);
						setState(1549);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__27) | (1L << T__30) | (1L << T__31) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__43))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (STATIC - 73)) | (1L << (VOID - 73)) | (1L << (UNSIGNED - 73)) | (1L << (SIGNED - 73)) | (1L << (CV_QUALIFIER - 73)) | (1L << (EXTERN - 73)) | (1L << (VIRTUAL - 73)) | (1L << (SPECIAL_DATA - 73)) | (1L << (OPERATOR - 73)) | (1L << (CLASS_KEY - 73)) | (1L << (NEW - 73)) | (1L << (PRE_PRAGMA_KEYWORDS - 73)) | (1L << (END_TEST - 73)) | (1L << (ALPHA_NUMERIC - 73)) | (1L << (OPENING_CURLY - 73)) | (1L << (HEX_LITERAL - 73)) | (1L << (DECIMAL_LITERAL - 73)) | (1L << (OCTAL_LITERAL - 73)) | (1L << (FLOATING_POINT_LITERAL - 73)) | (1L << (CHAR - 73)) | (1L << (STRING - 73)))) != 0)) {
							{
							setState(1548);
							expr();
							}
						}

						setState(1551);
						match(T__35);
						}
						break;
					case 2:
						{
						_localctx = new FuncCallContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1552);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1556);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(1553);
							match(NEWLINE);
							}
							}
							setState(1558);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1559);
						match(T__0);
						setState(1560);
						argument_list();
						setState(1561);
						match(T__1);
						}
						break;
					case 3:
						{
						_localctx = new MemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1563);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1564);
						match(T__40);
						setState(1568);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(1565);
							match(NEWLINE);
							}
							}
							setState(1570);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1572);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(1571);
							match(TEMPLATE);
							}
						}

						{
						setState(1574);
						identifier();
						}
						}
						break;
					case 4:
						{
						_localctx = new PtrMemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1575);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1576);
						match(T__41);
						setState(1580);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(1577);
							match(NEWLINE);
							}
							}
							setState(1582);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1584);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(1583);
							match(TEMPLATE);
							}
						}

						{
						setState(1586);
						identifier();
						}
						}
						break;
					case 5:
						{
						_localctx = new IncDecOpContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1587);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1591);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(1588);
							match(NEWLINE);
							}
							}
							setState(1593);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1594);
						inc_dec();
						}
						break;
					}
					} 
				}
				setState(1599);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
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
		enterRule(_localctx, 206, RULE_initializer_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1600);
			match(OPENING_CURLY);
			setState(1604);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1601);
					match(NEWLINE);
					}
					} 
				}
				setState(1606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
			}
			setState(1616);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1607);
					match(COMMENT);
					setState(1611);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1608);
							match(NEWLINE);
							}
							} 
						}
						setState(1613);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
					}
					}
					} 
				}
				setState(1618);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			}
			setState(1620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(1619);
				argument_list();
				}
				break;
			}
			setState(1625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1622);
				match(NEWLINE);
				}
				}
				setState(1627);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(1628);
				match(COMMENT);
				setState(1632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1629);
					match(NEWLINE);
					}
					}
					setState(1634);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(1639);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1640);
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
		enterRule(_localctx, 208, RULE_argument_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				{
				setState(1642);
				argument();
				}
				break;
			}
			setState(1648);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1645);
					match(NEWLINE);
					}
					} 
				}
				setState(1650);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
			}
			setState(1675);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1652);
					_la = _input.LA(1);
					if (_la==T__12) {
						{
						setState(1651);
						match(T__12);
						}
					}

					setState(1657);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(1654);
						match(NEWLINE);
						}
						}
						setState(1659);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1669);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1660);
							match(COMMENT);
							setState(1664);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==NEWLINE) {
								{
								{
								setState(1661);
								match(NEWLINE);
								}
								}
								setState(1666);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							} 
						}
						setState(1671);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
					}
					setState(1672);
					argument();
					}
					} 
				}
				setState(1677);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
			}
			setState(1679);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(1678);
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
		public List<Pre_macro_identifierContext> pre_macro_identifier() {
			return getRuleContexts(Pre_macro_identifierContext.class);
		}
		public Pre_macro_identifierContext pre_macro_identifier(int i) {
			return getRuleContext(Pre_macro_identifierContext.class,i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(FunctionParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(FunctionParser.COMMENT, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public List<MacroCallContext> macroCall() {
			return getRuleContexts(MacroCallContext.class);
		}
		public MacroCallContext macroCall(int i) {
			return getRuleContext(MacroCallContext.class,i);
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
		enterRule(_localctx, 210, RULE_argument);
		int _la;
		try {
			int _alt;
			setState(1728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1681);
				assign_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1701); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1691);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMENT) {
							{
							{
							setState(1682);
							match(COMMENT);
							setState(1686);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==NEWLINE) {
								{
								{
								setState(1683);
								match(NEWLINE);
								}
								}
								setState(1688);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							}
							setState(1693);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1694);
						pre_macro_identifier();
						setState(1698);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1695);
								match(NEWLINE);
								}
								} 
							}
							setState(1700);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1703); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1724); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1714);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMENT) {
							{
							{
							setState(1705);
							match(COMMENT);
							setState(1709);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==NEWLINE) {
								{
								{
								setState(1706);
								match(NEWLINE);
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
						setState(1717);
						macroCall();
						setState(1721);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1718);
								match(NEWLINE);
								}
								} 
							}
							setState(1723);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1726); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		enterRule(_localctx, 212, RULE_primary_expression);
		try {
			setState(1736);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case NEW:
			case PRE_PRAGMA_KEYWORDS:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1730);
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
				setState(1731);
				constant();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(1732);
				match(T__0);
				setState(1733);
				expr();
				setState(1734);
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
		enterRule(_localctx, 214, RULE_null_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1738);
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
		enterRule(_localctx, 216, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1740);
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
		enterRule(_localctx, 218, RULE_newline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1742);
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
		enterRule(_localctx, 220, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1744);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__27) | (1L << T__30) | (1L << T__31) | (1L << T__42) | (1L << T__43))) != 0)) ) {
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
		enterRule(_localctx, 222, RULE_relational_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1746);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__44) | (1L << T__45))) != 0)) ) {
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
		enterRule(_localctx, 224, RULE_constant);
		try {
			int _alt;
			setState(1776);
			switch (_input.LA(1)) {
			case HEX_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1748);
				match(HEX_LITERAL);
				}
				break;
			case OCTAL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1749);
				match(OCTAL_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1750);
				match(DECIMAL_LITERAL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1770); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1751);
						match(STRING);
						setState(1755);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1752);
								match(NEWLINE);
								}
								} 
							}
							setState(1757);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
						}
						setState(1761);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1758);
								match(COMMENT);
								}
								} 
							}
							setState(1763);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
						}
						setState(1767);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1764);
								match(NEWLINE);
								}
								} 
							}
							setState(1769);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1772); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(1774);
				match(CHAR);
				}
				break;
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1775);
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
		enterRule(_localctx, 226, RULE_function_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1778);
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
		enterRule(_localctx, 228, RULE_ptr_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1780);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__27) ) {
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
		enterRule(_localctx, 230, RULE_access_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1782);
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
		enterRule(_localctx, 232, RULE_operator);
		int _la;
		try {
			setState(1829);
			switch (_input.LA(1)) {
			case T__46:
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1784);
				_la = _input.LA(1);
				if ( !(_la==T__46 || _la==NEW) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1787);
				_la = _input.LA(1);
				if (_la==T__34) {
					{
					setState(1785);
					match(T__34);
					setState(1786);
					match(T__35);
					}
				}

				}
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(1789);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 3);
				{
				setState(1790);
				match(T__31);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(1791);
				match(T__14);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 5);
				{
				setState(1792);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 6);
				{
				setState(1793);
				match(T__33);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 7);
				{
				setState(1794);
				match(T__26);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 8);
				{
				setState(1795);
				match(T__27);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 9);
				{
				setState(1796);
				match(T__25);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 10);
				{
				setState(1797);
				match(T__42);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 11);
				{
				setState(1798);
				match(T__43);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 12);
				{
				setState(1799);
				match(T__16);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 13);
				{
				setState(1800);
				match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 14);
				{
				setState(1801);
				match(T__18);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 15);
				{
				setState(1802);
				match(T__47);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 16);
				{
				setState(1803);
				match(T__48);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 17);
				{
				setState(1804);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 18);
				{
				setState(1805);
				match(T__50);
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 19);
				{
				setState(1806);
				match(T__51);
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 20);
				{
				setState(1807);
				match(T__52);
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 21);
				{
				setState(1808);
				match(T__53);
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 22);
				{
				setState(1809);
				match(T__54);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 23);
				{
				setState(1810);
				match(T__29);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 24);
				{
				setState(1811);
				match(T__28);
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 25);
				{
				setState(1812);
				match(T__55);
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 26);
				{
				setState(1813);
				match(T__56);
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 27);
				{
				setState(1814);
				match(T__57);
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 28);
				{
				setState(1815);
				match(T__58);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 29);
				{
				setState(1816);
				match(T__44);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 30);
				{
				setState(1817);
				match(T__45);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 31);
				{
				setState(1818);
				match(T__24);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 32);
				{
				setState(1819);
				match(T__23);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 33);
				{
				setState(1820);
				match(T__39);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 34);
				{
				setState(1821);
				match(T__38);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 35);
				{
				setState(1822);
				match(T__12);
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 36);
				{
				setState(1823);
				match(T__59);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 37);
				{
				setState(1824);
				match(T__41);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 38);
				{
				setState(1825);
				match(T__0);
				setState(1826);
				match(T__1);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 39);
				{
				setState(1827);
				match(T__34);
				setState(1828);
				match(T__35);
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
		enterRule(_localctx, 234, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1831);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0)) ) {
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
		enterRule(_localctx, 236, RULE_equality_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1833);
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
		enterRule(_localctx, 238, RULE_template_decl_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1835);
			match(TEMPLATE);
			setState(1836);
			match(T__17);
			setState(1837);
			template_param_list();
			setState(1838);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 240, RULE_template_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1849); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1849);
				switch (_input.LA(1)) {
				case T__17:
					{
					{
					setState(1840);
					match(T__17);
					setState(1841);
					template_param_list();
					setState(1842);
					match(T__18);
					}
					}
					break;
				case T__0:
					{
					{
					setState(1844);
					match(T__0);
					setState(1845);
					template_param_list();
					setState(1846);
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
					setState(1848);
					no_angle_brackets_or_brackets();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1851); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << IF) | (1L << ELSE) | (1L << FOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 242, RULE_no_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1853);
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
		enterRule(_localctx, 244, RULE_no_brackets_curlies_or_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1855);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__34) | (1L << T__35))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
		enterRule(_localctx, 246, RULE_no_brackets_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1857);
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
		enterRule(_localctx, 248, RULE_no_angle_brackets_or_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1859);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__17) | (1L << T__18))) != 0)) ) {
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
		enterRule(_localctx, 250, RULE_no_curlies);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1861);
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
		enterRule(_localctx, 252, RULE_no_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1863);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__34 || _la==T__35) ) {
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
		enterRule(_localctx, 254, RULE_no_squares_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1865);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__34) | (1L << T__35))) != 0)) ) {
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
		enterRule(_localctx, 256, RULE_no_comma_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1867);
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
		enterRule(_localctx, 258, RULE_assign_water);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1869);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__12) | (1L << T__34) | (1L << T__35))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
		enterRule(_localctx, 260, RULE_assign_water_l2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1871);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__34) | (1L << T__35))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
		enterRule(_localctx, 262, RULE_water);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1873);
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
			setState(1893);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				_localctx = new InitDeclWithCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1875);
				declarator();
				setState(1876);
				match(T__0);
				setState(1878);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__27) | (1L << T__30) | (1L << T__31) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__43))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (STATIC - 73)) | (1L << (VOID - 73)) | (1L << (UNSIGNED - 73)) | (1L << (SIGNED - 73)) | (1L << (CV_QUALIFIER - 73)) | (1L << (EXTERN - 73)) | (1L << (VIRTUAL - 73)) | (1L << (SPECIAL_DATA - 73)) | (1L << (OPERATOR - 73)) | (1L << (CLASS_KEY - 73)) | (1L << (NEW - 73)) | (1L << (PRE_PRAGMA_KEYWORDS - 73)) | (1L << (END_TEST - 73)) | (1L << (ALPHA_NUMERIC - 73)) | (1L << (OPENING_CURLY - 73)) | (1L << (HEX_LITERAL - 73)) | (1L << (DECIMAL_LITERAL - 73)) | (1L << (OCTAL_LITERAL - 73)) | (1L << (FLOATING_POINT_LITERAL - 73)) | (1L << (CHAR - 73)) | (1L << (STRING - 73)))) != 0)) {
					{
					setState(1877);
					expr();
					}
				}

				setState(1880);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new InitDeclWithAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1882);
				declarator();
				setState(1884);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1883);
					match(NEWLINE);
					}
				}

				setState(1886);
				match(T__16);
				setState(1888);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1887);
					match(NEWLINE);
					}
				}

				setState(1890);
				argument();
				}
				break;
			case 3:
				_localctx = new InitDeclSimpleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1892);
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
			setState(1896);
			_la = _input.LA(1);
			if (_la==T__14 || _la==T__27) {
				{
				setState(1895);
				ptrs();
				}
			}

			setState(1898);
			identifier();
			setState(1900);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				{
				setState(1899);
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
			setState(1908);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1902);
				match(T__34);
				setState(1904);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__27) | (1L << T__30) | (1L << T__31) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__43))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (STATIC - 73)) | (1L << (VOID - 73)) | (1L << (UNSIGNED - 73)) | (1L << (SIGNED - 73)) | (1L << (CV_QUALIFIER - 73)) | (1L << (EXTERN - 73)) | (1L << (VIRTUAL - 73)) | (1L << (SPECIAL_DATA - 73)) | (1L << (OPERATOR - 73)) | (1L << (CLASS_KEY - 73)) | (1L << (NEW - 73)) | (1L << (PRE_PRAGMA_KEYWORDS - 73)) | (1L << (END_TEST - 73)) | (1L << (ALPHA_NUMERIC - 73)) | (1L << (OPENING_CURLY - 73)) | (1L << (HEX_LITERAL - 73)) | (1L << (DECIMAL_LITERAL - 73)) | (1L << (OCTAL_LITERAL - 73)) | (1L << (FLOATING_POINT_LITERAL - 73)) | (1L << (CHAR - 73)) | (1L << (STRING - 73)))) != 0)) {
					{
					setState(1903);
					conditional_expression();
					}
				}

				setState(1906);
				match(T__35);
				}
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(1907);
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
		case 102:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3}\u0779\4\2\t\2\4"+
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
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\3\2\7\2\u0112"+
		"\n\2\f\2\16\2\u0115\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3\u0123\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u0130"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7\u0142\n\7\3\7\5\7\u0145\n\7\3\7\3\7\5\7\u0149\n\7\3\7\3\7\5\7\u014d"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0155\n\7\5\7\u0157\n\7\3\b\3\b\3\b\3"+
		"\b\5\b\u015d\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0169\n\t"+
		"\3\t\3\t\3\t\5\t\u016e\n\t\3\t\5\t\u0171\n\t\3\n\5\n\u0174\n\n\3\n\3\n"+
		"\3\n\5\n\u0179\n\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u0181\n\13\3\f\3\f"+
		"\3\r\3\r\5\r\u0187\n\r\3\16\3\16\3\16\3\16\5\16\u018d\n\16\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\5\23\u01a1\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u01ac\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01b4\n\25\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u01be\n\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u01c7\n\27\5\27\u01c9\n\27\3\30\3\30\3\31\3\31\5"+
		"\31\u01cf\n\31\3\31\3\31\3\31\5\31\u01d4\n\31\7\31\u01d6\n\31\f\31\16"+
		"\31\u01d9\13\31\3\32\3\32\5\32\u01dd\n\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\7\33\u01e6\n\33\f\33\16\33\u01e9\13\33\3\33\5\33\u01ec\n\33\3\33"+
		"\3\33\3\34\3\34\3\34\5\34\u01f3\n\34\3\35\3\35\5\35\u01f7\n\35\3\35\3"+
		"\35\3\35\3\35\5\35\u01fd\n\35\3\35\3\35\5\35\u0201\n\35\3\36\3\36\3\36"+
		"\7\36\u0206\n\36\f\36\16\36\u0209\13\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\7\37\u0211\n\37\f\37\16\37\u0214\13\37\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u021b\n\37\3\37\3\37\7\37\u021f\n\37\f\37\16\37\u0222\13\37\3\37\3\37"+
		"\5\37\u0226\n\37\3 \3 \3 \3 \3 \5 \u022d\n \3!\3!\3!\3!\3!\5!\u0234\n"+
		"!\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0248\n$"+
		"\3%\3%\5%\u024c\n%\3%\3%\3%\3%\3%\5%\u0253\n%\3%\3%\7%\u0257\n%\f%\16"+
		"%\u025a\13%\3%\3%\5%\u025e\n%\3&\3&\3&\3&\5&\u0264\n&\3\'\3\'\3\'\6\'"+
		"\u0269\n\'\r\'\16\'\u026a\3(\3(\3(\5(\u0270\n(\3)\3)\5)\u0274\n)\3)\5"+
		")\u0277\n)\3)\5)\u027a\n)\3)\3)\5)\u027e\n)\3)\3)\3*\3*\3*\3*\3*\3+\3"+
		"+\3,\3,\7,\u028b\n,\f,\16,\u028e\13,\5,\u0290\n,\3,\3,\7,\u0294\n,\f,"+
		"\16,\u0297\13,\5,\u0299\n,\3,\3,\7,\u029d\n,\f,\16,\u02a0\13,\3,\3,\5"+
		",\u02a4\n,\3,\3,\3,\3,\3,\5,\u02ab\n,\3-\3-\7-\u02af\n-\f-\16-\u02b2\13"+
		"-\7-\u02b4\n-\f-\16-\u02b7\13-\3-\3-\3-\7-\u02bc\n-\f-\16-\u02bf\13-\3"+
		"-\5-\u02c2\n-\3.\3.\5.\u02c6\n.\3.\3.\5.\u02ca\n.\3.\7.\u02cd\n.\f.\16"+
		".\u02d0\13.\3.\5.\u02d3\n.\3/\3/\3/\7/\u02d8\n/\f/\16/\u02db\13/\3/\7"+
		"/\u02de\n/\f/\16/\u02e1\13/\3/\3/\7/\u02e5\n/\f/\16/\u02e8\13/\3/\5/\u02eb"+
		"\n/\3\60\3\60\3\60\3\60\5\60\u02f1\n\60\3\61\5\61\u02f4\n\61\3\61\3\61"+
		"\3\61\3\61\3\61\5\61\u02fb\n\61\3\61\5\61\u02fe\n\61\3\62\3\62\3\62\3"+
		"\63\3\63\3\63\3\63\7\63\u0307\n\63\f\63\16\63\u030a\13\63\3\64\3\64\3"+
		"\64\3\65\5\65\u0310\n\65\3\65\3\65\3\66\3\66\5\66\u0316\n\66\3\66\3\66"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0321\n\67\38\38\38\38\38\39"+
		"\79\u0329\n9\f9\169\u032c\139\39\39\39\39\79\u0332\n9\f9\169\u0335\13"+
		"9\79\u0337\n9\f9\169\u033a\139\3:\3:\3;\5;\u033f\n;\3;\3;\5;\u0343\n;"+
		"\3;\5;\u0346\n;\3;\5;\u0349\n;\3;\5;\u034c\n;\3;\5;\u034f\n;\3;\3;\5;"+
		"\u0353\n;\3;\3;\3;\5;\u0358\n;\3;\3;\5;\u035c\n;\3;\3;\5;\u0360\n;\3;"+
		"\3;\3;\3;\3;\3;\3;\5;\u0369\n;\3;\5;\u036c\n;\3;\3;\5;\u0370\n;\3;\5;"+
		"\u0373\n;\3;\5;\u0376\n;\3;\5;\u0379\n;\5;\u037b\n;\3<\6<\u037e\n<\r<"+
		"\16<\u037f\3=\3=\5=\u0384\n=\3=\5=\u0387\n=\3=\5=\u038a\n=\3=\3=\3=\3"+
		"=\5=\u0390\n=\3=\3=\5=\u0394\n=\3=\3=\5=\u0398\n=\3=\3=\3=\3=\3=\5=\u039f"+
		"\n=\3=\5=\u03a2\n=\3>\3>\3>\7>\u03a7\n>\f>\16>\u03aa\13>\3>\7>\u03ad\n"+
		">\f>\16>\u03b0\13>\3>\5>\u03b3\n>\3>\3>\3?\3?\5?\u03b9\n?\3?\5?\u03bc"+
		"\n?\3?\3?\3?\3@\3@\3A\3A\3A\3A\7A\u03c7\nA\fA\16A\u03ca\13A\3B\5B\u03cd"+
		"\nB\3B\5B\u03d0\nB\3B\3B\3C\5C\u03d5\nC\3C\3C\3C\3C\3C\3C\6C\u03dd\nC"+
		"\rC\16C\u03de\3C\3C\3C\3C\5C\u03e5\nC\3C\3C\3C\3C\3C\3C\5C\u03ed\nC\7"+
		"C\u03ef\nC\fC\16C\u03f2\13C\3C\3C\3C\3C\3C\7C\u03f9\nC\fC\16C\u03fc\13"+
		"C\3C\5C\u03ff\nC\3D\6D\u0402\nD\rD\16D\u0403\3E\5E\u0407\nE\3E\3E\3F\3"+
		"F\3G\3G\3G\3G\3G\5G\u0412\nG\3G\3G\5G\u0416\nG\3G\3G\5G\u041a\nG\3G\7"+
		"G\u041d\nG\fG\16G\u0420\13G\5G\u0422\nG\3G\5G\u0425\nG\3H\3H\3H\3H\5H"+
		"\u042b\nH\3I\5I\u042e\nI\3I\3I\5I\u0432\nI\3I\3I\5I\u0436\nI\3I\3I\3I"+
		"\5I\u043b\nI\5I\u043d\nI\3I\5I\u0440\nI\3J\3J\3J\7J\u0445\nJ\fJ\16J\u0448"+
		"\13J\3J\3J\3J\5J\u044d\nJ\3K\3K\3L\3L\5L\u0453\nL\6L\u0455\nL\rL\16L\u0456"+
		"\3M\3M\3N\3N\3N\7N\u045e\nN\fN\16N\u0461\13N\3N\7N\u0464\nN\fN\16N\u0467"+
		"\13N\3N\3N\7N\u046b\nN\fN\16N\u046e\13N\3N\5N\u0471\nN\3N\3N\7N\u0475"+
		"\nN\fN\16N\u0478\13N\3O\3O\7O\u047c\nO\fO\16O\u047f\13O\3O\3O\7O\u0483"+
		"\nO\fO\16O\u0486\13O\3O\3O\5O\u048a\nO\3P\3P\3P\7P\u048f\nP\fP\16P\u0492"+
		"\13P\3P\3P\7P\u0496\nP\fP\16P\u0499\13P\3P\3P\7P\u049d\nP\fP\16P\u04a0"+
		"\13P\3P\3P\7P\u04a4\nP\fP\16P\u04a7\13P\3P\3P\5P\u04ab\nP\3Q\3Q\7Q\u04af"+
		"\nQ\fQ\16Q\u04b2\13Q\3Q\3Q\7Q\u04b6\nQ\fQ\16Q\u04b9\13Q\3Q\5Q\u04bc\n"+
		"Q\3R\3R\7R\u04c0\nR\fR\16R\u04c3\13R\3R\3R\7R\u04c7\nR\fR\16R\u04ca\13"+
		"R\3R\5R\u04cd\nR\3S\3S\7S\u04d1\nS\fS\16S\u04d4\13S\3S\3S\7S\u04d8\nS"+
		"\fS\16S\u04db\13S\3S\5S\u04de\nS\3T\3T\7T\u04e2\nT\fT\16T\u04e5\13T\3"+
		"T\3T\7T\u04e9\nT\fT\16T\u04ec\13T\3T\5T\u04ef\nT\3U\3U\7U\u04f3\nU\fU"+
		"\16U\u04f6\13U\3U\3U\7U\u04fa\nU\fU\16U\u04fd\13U\3U\5U\u0500\nU\3V\3"+
		"V\7V\u0504\nV\fV\16V\u0507\13V\3V\3V\7V\u050b\nV\fV\16V\u050e\13V\3V\3"+
		"V\5V\u0512\nV\3W\3W\7W\u0516\nW\fW\16W\u0519\13W\3W\3W\7W\u051d\nW\fW"+
		"\16W\u0520\13W\3W\3W\5W\u0524\nW\3X\3X\7X\u0528\nX\fX\16X\u052b\13X\3"+
		"X\3X\7X\u052f\nX\fX\16X\u0532\13X\3X\5X\u0535\nX\3Y\3Y\7Y\u0539\nY\fY"+
		"\16Y\u053c\13Y\3Y\3Y\7Y\u0540\nY\fY\16Y\u0543\13Y\3Y\5Y\u0546\nY\3Z\3"+
		"Z\7Z\u054a\nZ\fZ\16Z\u054d\13Z\3Z\3Z\7Z\u0551\nZ\fZ\16Z\u0554\13Z\3Z\5"+
		"Z\u0557\nZ\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u0562\n[\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\5\\\u056a\n\\\3]\3]\3^\3^\3^\3^\3^\3^\5^\u0574\n^\3_\3_\3_\3`\5`"+
		"\u057a\n`\3`\3`\7`\u057e\n`\f`\16`\u0581\13`\3`\3`\7`\u0585\n`\f`\16`"+
		"\u0588\13`\3`\3`\5`\u058c\n`\3`\3`\3`\5`\u0591\n`\3`\3`\7`\u0595\n`\f"+
		"`\16`\u0598\13`\3`\3`\7`\u059c\n`\f`\16`\u059f\13`\3`\3`\5`\u05a3\n`\3"+
		"`\3`\5`\u05a7\n`\3a\3a\7a\u05ab\na\fa\16a\u05ae\13a\3a\3a\3b\3b\7b\u05b4"+
		"\nb\fb\16b\u05b7\13b\3b\3b\3b\3b\3b\3b\7b\u05bf\nb\fb\16b\u05c2\13b\3"+
		"b\3b\5b\u05c6\nb\3c\3c\3d\3d\7d\u05cc\nd\fd\16d\u05cf\13d\3d\3d\3d\3d"+
		"\3d\3d\7d\u05d7\nd\fd\16d\u05da\13d\3d\5d\u05dd\nd\3e\3e\7e\u05e1\ne\f"+
		"e\16e\u05e4\13e\3e\7e\u05e7\ne\fe\16e\u05ea\13e\3f\3f\3g\3g\3h\3h\5h\u05f2"+
		"\nh\3h\3h\3h\5h\u05f7\nh\3h\3h\7h\u05fb\nh\fh\16h\u05fe\13h\3h\5h\u0601"+
		"\nh\3h\3h\5h\u0605\nh\3h\3h\7h\u0609\nh\fh\16h\u060c\13h\3h\3h\5h\u0610"+
		"\nh\3h\3h\3h\7h\u0615\nh\fh\16h\u0618\13h\3h\3h\3h\3h\3h\3h\3h\7h\u0621"+
		"\nh\fh\16h\u0624\13h\3h\5h\u0627\nh\3h\3h\3h\3h\7h\u062d\nh\fh\16h\u0630"+
		"\13h\3h\5h\u0633\nh\3h\3h\3h\7h\u0638\nh\fh\16h\u063b\13h\3h\7h\u063e"+
		"\nh\fh\16h\u0641\13h\3i\3i\7i\u0645\ni\fi\16i\u0648\13i\3i\3i\7i\u064c"+
		"\ni\fi\16i\u064f\13i\7i\u0651\ni\fi\16i\u0654\13i\3i\5i\u0657\ni\3i\7"+
		"i\u065a\ni\fi\16i\u065d\13i\3i\3i\7i\u0661\ni\fi\16i\u0664\13i\7i\u0666"+
		"\ni\fi\16i\u0669\13i\3i\3i\3j\5j\u066e\nj\3j\7j\u0671\nj\fj\16j\u0674"+
		"\13j\3j\5j\u0677\nj\3j\7j\u067a\nj\fj\16j\u067d\13j\3j\3j\7j\u0681\nj"+
		"\fj\16j\u0684\13j\7j\u0686\nj\fj\16j\u0689\13j\3j\7j\u068c\nj\fj\16j\u068f"+
		"\13j\3j\5j\u0692\nj\3k\3k\3k\7k\u0697\nk\fk\16k\u069a\13k\7k\u069c\nk"+
		"\fk\16k\u069f\13k\3k\3k\7k\u06a3\nk\fk\16k\u06a6\13k\6k\u06a8\nk\rk\16"+
		"k\u06a9\3k\3k\7k\u06ae\nk\fk\16k\u06b1\13k\7k\u06b3\nk\fk\16k\u06b6\13"+
		"k\3k\3k\7k\u06ba\nk\fk\16k\u06bd\13k\6k\u06bf\nk\rk\16k\u06c0\5k\u06c3"+
		"\nk\3l\3l\3l\3l\3l\3l\5l\u06cb\nl\3m\3m\3n\3n\3o\3o\3p\3p\3q\3q\3r\3r"+
		"\3r\3r\3r\7r\u06dc\nr\fr\16r\u06df\13r\3r\7r\u06e2\nr\fr\16r\u06e5\13"+
		"r\3r\7r\u06e8\nr\fr\16r\u06eb\13r\6r\u06ed\nr\rr\16r\u06ee\3r\3r\5r\u06f3"+
		"\nr\3s\3s\3t\3t\3u\3u\3v\3v\3v\5v\u06fe\nv\3v\3v\3v\3v\3v\3v\3v\3v\3v"+
		"\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v"+
		"\3v\3v\3v\3v\3v\3v\3v\3v\5v\u0728\nv\3w\3w\3x\3x\3y\3y\3y\3y\3y\3z\3z"+
		"\3z\3z\3z\3z\3z\3z\3z\6z\u073c\nz\rz\16z\u073d\3{\3{\3|\3|\3}\3}\3~\3"+
		"~\3\177\3\177\3\u0080\3\u0080\3\u0081\3\u0081\3\u0082\3\u0082\3\u0083"+
		"\3\u0083\3\u0084\3\u0084\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\5\u0086"+
		"\u0759\n\u0086\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u075f\n\u0086\3"+
		"\u0086\3\u0086\5\u0086\u0763\n\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u0768"+
		"\n\u0086\3\u0087\5\u0087\u076b\n\u0087\3\u0087\3\u0087\5\u0087\u076f\n"+
		"\u0087\3\u0088\3\u0088\5\u0088\u0773\n\u0088\3\u0088\3\u0088\5\u0088\u0777"+
		"\n\u0088\3\u0088\2\3\u00ce\u0089\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"+
		"\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\2\33\7\2"+
		"\b\16KNQQZZ\\\\\b\2\16\16\26\27LLYY\\\\oo\3\2WX\3\2rt\3\2\37 \3\2!\"\4"+
		"\2\21\21#$\3\2)*\6\2\21\21\36\36!\"-.\4\2\24\25/\60\5\2\b\nKKQQ\4\2\21"+
		"\21\36\36\3\2\13\r\4\2\61\61]]\4\2\23\23\62;\3\2<=\3\2\3\4\5\2\3\4%&p"+
		"q\3\2\3\5\4\2\3\4\24\25\3\2pq\3\2%&\4\2\5\5%&\4\2\5\5\17\17\6\2\3\5\17"+
		"\17%&pq\u086b\2\u0113\3\2\2\2\4\u0122\3\2\2\2\6\u0124\3\2\2\2\b\u0126"+
		"\3\2\2\2\n\u0128\3\2\2\2\f\u0156\3\2\2\2\16\u015c\3\2\2\2\20\u0170\3\2"+
		"\2\2\22\u0173\3\2\2\2\24\u0180\3\2\2\2\26\u0182\3\2\2\2\30\u0186\3\2\2"+
		"\2\32\u018c\3\2\2\2\34\u018e\3\2\2\2\36\u0192\3\2\2\2 \u0196\3\2\2\2\""+
		"\u0198\3\2\2\2$\u01a0\3\2\2\2&\u01ab\3\2\2\2(\u01b3\3\2\2\2*\u01b5\3\2"+
		"\2\2,\u01c8\3\2\2\2.\u01ca\3\2\2\2\60\u01ce\3\2\2\2\62\u01dc\3\2\2\2\64"+
		"\u01de\3\2\2\2\66\u01f2\3\2\2\28\u0200\3\2\2\2:\u0202\3\2\2\2<\u0225\3"+
		"\2\2\2>\u022c\3\2\2\2@\u0233\3\2\2\2B\u0235\3\2\2\2D\u0237\3\2\2\2F\u0247"+
		"\3\2\2\2H\u025d\3\2\2\2J\u0263\3\2\2\2L\u0268\3\2\2\2N\u026c\3\2\2\2P"+
		"\u0271\3\2\2\2R\u0281\3\2\2\2T\u0286\3\2\2\2V\u02aa\3\2\2\2X\u02c1\3\2"+
		"\2\2Z\u02c3\3\2\2\2\\\u02d4\3\2\2\2^\u02f0\3\2\2\2`\u02f3\3\2\2\2b\u02ff"+
		"\3\2\2\2d\u0302\3\2\2\2f\u030b\3\2\2\2h\u030f\3\2\2\2j\u0313\3\2\2\2l"+
		"\u0320\3\2\2\2n\u0322\3\2\2\2p\u032a\3\2\2\2r\u033b\3\2\2\2t\u037a\3\2"+
		"\2\2v\u037d\3\2\2\2x\u03a1\3\2\2\2z\u03a3\3\2\2\2|\u03b6\3\2\2\2~\u03c0"+
		"\3\2\2\2\u0080\u03c2\3\2\2\2\u0082\u03cc\3\2\2\2\u0084\u03fe\3\2\2\2\u0086"+
		"\u0401\3\2\2\2\u0088\u0406\3\2\2\2\u008a\u040a\3\2\2\2\u008c\u0424\3\2"+
		"\2\2\u008e\u042a\3\2\2\2\u0090\u042d\3\2\2\2\u0092\u044c\3\2\2\2\u0094"+
		"\u044e\3\2\2\2\u0096\u0454\3\2\2\2\u0098\u0458\3\2\2\2\u009a\u045a\3\2"+
		"\2\2\u009c\u0479\3\2\2\2\u009e\u04aa\3\2\2\2\u00a0\u04ac\3\2\2\2\u00a2"+
		"\u04bd\3\2\2\2\u00a4\u04ce\3\2\2\2\u00a6\u04df\3\2\2\2\u00a8\u04f0\3\2"+
		"\2\2\u00aa\u0501\3\2\2\2\u00ac\u0513\3\2\2\2\u00ae\u0525\3\2\2\2\u00b0"+
		"\u0536\3\2\2\2\u00b2\u0547\3\2\2\2\u00b4\u0561\3\2\2\2\u00b6\u0569\3\2"+
		"\2\2\u00b8\u056b\3\2\2\2\u00ba\u0573\3\2\2\2\u00bc\u0575\3\2\2\2\u00be"+
		"\u05a6\3\2\2\2\u00c0\u05a8\3\2\2\2\u00c2\u05c5\3\2\2\2\u00c4\u05c7\3\2"+
		"\2\2\u00c6\u05dc\3\2\2\2\u00c8\u05de\3\2\2\2\u00ca\u05eb\3\2\2\2\u00cc"+
		"\u05ed\3\2\2\2\u00ce\u0604\3\2\2\2\u00d0\u0642\3\2\2\2\u00d2\u066d\3\2"+
		"\2\2\u00d4\u06c2\3\2\2\2\u00d6\u06ca\3\2\2\2\u00d8\u06cc\3\2\2\2\u00da"+
		"\u06ce\3\2\2\2\u00dc\u06d0\3\2\2\2\u00de\u06d2\3\2\2\2\u00e0\u06d4\3\2"+
		"\2\2\u00e2\u06f2\3\2\2\2\u00e4\u06f4\3\2\2\2\u00e6\u06f6\3\2\2\2\u00e8"+
		"\u06f8\3\2\2\2\u00ea\u0727\3\2\2\2\u00ec\u0729\3\2\2\2\u00ee\u072b\3\2"+
		"\2\2\u00f0\u072d\3\2\2\2\u00f2\u073b\3\2\2\2\u00f4\u073f\3\2\2\2\u00f6"+
		"\u0741\3\2\2\2\u00f8\u0743\3\2\2\2\u00fa\u0745\3\2\2\2\u00fc\u0747\3\2"+
		"\2\2\u00fe\u0749\3\2\2\2\u0100\u074b\3\2\2\2\u0102\u074d\3\2\2\2\u0104"+
		"\u074f\3\2\2\2\u0106\u0751\3\2\2\2\u0108\u0753\3\2\2\2\u010a\u0767\3\2"+
		"\2\2\u010c\u076a\3\2\2\2\u010e\u0776\3\2\2\2\u0110\u0112\5\4\3\2\u0111"+
		"\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114\3\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0123\5\6\4\2\u0117\u0123"+
		"\5\b\5\2\u0118\u0123\5\n\6\2\u0119\u0123\5\20\t\2\u011a\u0123\5\22\n\2"+
		"\u011b\u0123\5r:\2\u011c\u0123\5\24\13\2\u011d\u0123\5\30\r\2\u011e\u0123"+
		"\5\u00dan\2\u011f\u0123\5\u00dco\2\u0120\u0123\5J&\2\u0121\u0123\5\u0108"+
		"\u0085\2\u0122\u0116\3\2\2\2\u0122\u0117\3\2\2\2\u0122\u0118\3\2\2\2\u0122"+
		"\u0119\3\2\2\2\u0122\u011a\3\2\2\2\u0122\u011b\3\2\2\2\u0122\u011c\3\2"+
		"\2\2\u0122\u011d\3\2\2\2\u0122\u011e\3\2\2\2\u0122\u011f\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123\5\3\2\2\2\u0124\u0125\7p\2\2"+
		"\u0125\7\3\2\2\2\u0126\u0127\7q\2\2\u0127\t\3\2\2\2\u0128\u0129\5\f\7"+
		"\2\u0129\13\3\2\2\2\u012a\u0157\7R\2\2\u012b\u012c\7S\2\2\u012c\u012f"+
		"\7\3\2\2\u012d\u0130\5\u008eH\2\u012e\u0130\7|\2\2\u012f\u012d\3\2\2\2"+
		"\u012f\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0157\7\4\2\2\u0132\u0133"+
		"\7?\2\2\u0133\u0134\7\3\2\2\u0134\u0135\5\26\f\2\u0135\u0136\7\4\2\2\u0136"+
		"\u0157\3\2\2\2\u0137\u0157\7@\2\2\u0138\u0139\7F\2\2\u0139\u013a\7\3\2"+
		"\2\u013a\u013b\5\26\f\2\u013b\u013c\7\4\2\2\u013c\u0157\3\2\2\2\u013d"+
		"\u013e\7A\2\2\u013e\u0141\7\3\2\2\u013f\u0142\5\16\b\2\u0140\u0142\7\5"+
		"\2\2\u0141\u013f\3\2\2\2\u0141\u0140\3\2\2\2\u0142\u0144\3\2\2\2\u0143"+
		"\u0145\5\26\f\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3"+
		"\2\2\2\u0146\u0148\7\5\2\2\u0147\u0149\5\u009aN\2\u0148\u0147\3\2\2\2"+
		"\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\7\4\2\2\u014b\u014d"+
		"\7\5\2\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u0157\3\2\2\2\u014e"+
		"\u0157\7G\2\2\u014f\u0150\7B\2\2\u0150\u0151\7\3\2\2\u0151\u0152\5\26"+
		"\f\2\u0152\u0154\7\4\2\2\u0153\u0155\7\5\2\2\u0154\u0153\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u012a\3\2\2\2\u0156\u012b\3\2"+
		"\2\2\u0156\u0132\3\2\2\2\u0156\u0137\3\2\2\2\u0156\u0138\3\2\2\2\u0156"+
		"\u013d\3\2\2\2\u0156\u014e\3\2\2\2\u0156\u014f\3\2\2\2\u0157\r\3\2\2\2"+
		"\u0158\u015d\5r:\2\u0159\u015a\5\u009aN\2\u015a\u015b\7\5\2\2\u015b\u015d"+
		"\3\2\2\2\u015c\u0158\3\2\2\2\u015c\u0159\3\2\2\2\u015d\17\3\2\2\2\u015e"+
		"\u015f\7C\2\2\u015f\u0171\7\5\2\2\u0160\u0161\7E\2\2\u0161\u0171\7\5\2"+
		"\2\u0162\u0163\7H\2\2\u0163\u0164\5\u0092J\2\u0164\u0165\7\5\2\2\u0165"+
		"\u0171\3\2\2\2\u0166\u0168\7I\2\2\u0167\u0169\5\u009aN\2\u0168\u0167\3"+
		"\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u0171\7\5\2\2\u016b"+
		"\u016d\7T\2\2\u016c\u016e\5\u009aN\2\u016d\u016c\3\2\2\2\u016d\u016e\3"+
		"\2\2\2\u016e\u016f\3\2\2\2\u016f\u0171\7\5\2\2\u0170\u015e\3\2\2\2\u0170"+
		"\u0160\3\2\2\2\u0170\u0162\3\2\2\2\u0170\u0166\3\2\2\2\u0170\u016b\3\2"+
		"\2\2\u0171\21\3\2\2\2\u0172\u0174\7D\2\2\u0173\u0172\3\2\2\2\u0173\u0174"+
		"\3\2\2\2\u0174\u0178\3\2\2\2\u0175\u0179\5\u0092J\2\u0176\u0179\5\u0094"+
		"K\2\u0177\u0179\7w\2\2\u0178\u0175\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0177"+
		"\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\7\6\2\2\u017b\23\3\2\2\2\u017c"+
		"\u017d\5\u009aN\2\u017d\u017e\7\5\2\2\u017e\u0181\3\2\2\2\u017f\u0181"+
		"\5\u00d8m\2\u0180\u017c\3\2\2\2\u0180\u017f\3\2\2\2\u0181\25\3\2\2\2\u0182"+
		"\u0183\5\u009aN\2\u0183\27\3\2\2\2\u0184\u0187\5\32\16\2\u0185\u0187\5"+
		"&\24\2\u0186\u0184\3\2\2\2\u0186\u0185\3\2\2\2\u0187\31\3\2\2\2\u0188"+
		"\u018d\5\34\17\2\u0189\u018d\5\36\20\2\u018a\u018d\5 \21\2\u018b\u018d"+
		"\5\"\22\2\u018c\u0188\3\2\2\2\u018c\u0189\3\2\2\2\u018c\u018a\3\2\2\2"+
		"\u018c\u018b\3\2\2\2\u018d\33\3\2\2\2\u018e\u018f\7^\2\2\u018f\u0190\5"+
		"$\23\2\u0190\u0191\b\17\1\2\u0191\35\3\2\2\2\u0192\u0193\7_\2\2\u0193"+
		"\u0194\5$\23\2\u0194\u0195\b\20\1\2\u0195\37\3\2\2\2\u0196\u0197\7`\2"+
		"\2\u0197!\3\2\2\2\u0198\u0199\7a\2\2\u0199#\3\2\2\2\u019a\u01a1\5\26\f"+
		"\2\u019b\u019c\7\3\2\2\u019c\u019d\5\26\f\2\u019d\u019e\7\4\2\2\u019e"+
		"\u01a1\3\2\2\2\u019f\u01a1\5.\30\2\u01a0\u019a\3\2\2\2\u01a0\u019b\3\2"+
		"\2\2\u01a0\u019f\3\2\2\2\u01a1%\3\2\2\2\u01a2\u01ac\5(\25\2\u01a3\u01ac"+
		"\5*\26\2\u01a4\u01ac\5\66\34\2\u01a5\u01ac\58\35\2\u01a6\u01ac\5> \2\u01a7"+
		"\u01ac\5@!\2\u01a8\u01ac\5F$\2\u01a9\u01ac\5H%\2\u01aa\u01ac\5\64\33\2"+
		"\u01ab\u01a2\3\2\2\2\u01ab\u01a3\3\2\2\2\u01ab\u01a4\3\2\2\2\u01ab\u01a5"+
		"\3\2\2\2\u01ab\u01a6\3\2\2\2\u01ab\u01a7\3\2\2\2\u01ab\u01a8\3\2\2\2\u01ab"+
		"\u01a9\3\2\2\2\u01ab\u01aa\3\2\2\2\u01ac\'\3\2\2\2\u01ad\u01ae\7b\2\2"+
		"\u01ae\u01af\5,\27\2\u01af\u01b0\5\62\32\2\u01b0\u01b4\3\2\2\2\u01b1\u01b2"+
		"\7b\2\2\u01b2\u01b4\5,\27\2\u01b3\u01ad\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4"+
		")\3\2\2\2\u01b5\u01b6\7c\2\2\u01b6\u01b7\5,\27\2\u01b7+\3\2\2\2\u01b8"+
		"\u01bd\5\u0092J\2\u01b9\u01ba\7\3\2\2\u01ba\u01bb\5\60\31\2\u01bb\u01bc"+
		"\7\4\2\2\u01bc\u01be\3\2\2\2\u01bd\u01b9\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"\u01c9\3\2\2\2\u01bf\u01c9\5.\30\2\u01c0\u01c9\7n\2\2\u01c1\u01c6\7\7"+
		"\2\2\u01c2\u01c3\7\3\2\2\u01c3\u01c4\5\60\31\2\u01c4\u01c5\7\4\2\2\u01c5"+
		"\u01c7\3\2\2\2\u01c6\u01c2\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\3\2"+
		"\2\2\u01c8\u01b8\3\2\2\2\u01c8\u01bf\3\2\2\2\u01c8\u01c0\3\2\2\2\u01c8"+
		"\u01c1\3\2\2\2\u01c9-\3\2\2\2\u01ca\u01cb\t\2\2\2\u01cb/\3\2\2\2\u01cc"+
		"\u01cf\5\u0092J\2\u01cd\u01cf\7|\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cd\3"+
		"\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d7\3\2\2\2\u01d0\u01d3\7\17\2\2\u01d1"+
		"\u01d4\5\u0092J\2\u01d2\u01d4\7|\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d2\3"+
		"\2\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01d0\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7"+
		"\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\61\3\2\2\2\u01d9\u01d7\3\2\2"+
		"\2\u01da\u01dd\5\u009aN\2\u01db\u01dd\b\32\1\2\u01dc\u01da\3\2\2\2\u01dc"+
		"\u01db\3\2\2\2\u01dd\63\3\2\2\2\u01de\u01df\5,\27\2\u01df\u01eb\7\3\2"+
		"\2\u01e0\u01e6\7\17\2\2\u01e1\u01e6\5\u0084C\2\u01e2\u01e6\5\u009aN\2"+
		"\u01e3\u01e6\5\u00e6t\2\u01e4\u01e6\7y\2\2\u01e5\u01e0\3\2\2\2\u01e5\u01e1"+
		"\3\2\2\2\u01e5\u01e2\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e4\3\2\2\2\u01e6"+
		"\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ec\3\2"+
		"\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01ec\7L\2\2\u01eb\u01e7\3\2\2\2\u01eb"+
		"\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\7\4\2\2\u01ee\65\3\2\2"+
		"\2\u01ef\u01f0\7d\2\2\u01f0\u01f3\7x\2\2\u01f1\u01f3\7d\2\2\u01f2\u01ef"+
		"\3\2\2\2\u01f2\u01f1\3\2\2\2\u01f3\67\3\2\2\2\u01f4\u01f6\7e\2\2\u01f5"+
		"\u01f7\7x\2\2\u01f6\u01f5\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u0201\3\2"+
		"\2\2\u01f8\u01f9\7m\2\2\u01f9\u01fa\7\3\2\2\u01fa\u01fc\7\3\2\2\u01fb"+
		"\u01fd\5:\36\2\u01fc\u01fb\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\3\2"+
		"\2\2\u01fe\u01ff\7\4\2\2\u01ff\u0201\7\4\2\2\u0200\u01f4\3\2\2\2\u0200"+
		"\u01f8\3\2\2\2\u02019\3\2\2\2\u0202\u0207\5<\37\2\u0203\u0204\7\17\2\2"+
		"\u0204\u0206\5<\37\2\u0205\u0203\3\2\2\2\u0206\u0209\3\2\2\2\u0207\u0205"+
		"\3\2\2\2\u0207\u0208\3\2\2\2\u0208;\3\2\2\2\u0209\u0207\3\2\2\2\u020a"+
		"\u0226\5,\27\2\u020b\u020c\5,\27\2\u020c\u020d\7\3\2\2\u020d\u0212\5\u0092"+
		"J\2\u020e\u020f\7\17\2\2\u020f\u0211\5\u009aN\2\u0210\u020e\3\2\2\2\u0211"+
		"\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0215\3\2"+
		"\2\2\u0214\u0212\3\2\2\2\u0215\u0216\7\4\2\2\u0216\u0226\3\2\2\2\u0217"+
		"\u0218\5,\27\2\u0218\u021a\7\3\2\2\u0219\u021b\5\u009aN\2\u021a\u0219"+
		"\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u0220\3\2\2\2\u021c\u021d\7\17\2\2"+
		"\u021d\u021f\5\u009aN\2\u021e\u021c\3\2\2\2\u021f\u0222\3\2\2\2\u0220"+
		"\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0223\3\2\2\2\u0222\u0220\3\2"+
		"\2\2\u0223\u0224\7\4\2\2\u0224\u0226\3\2\2\2\u0225\u020a\3\2\2\2\u0225"+
		"\u020b\3\2\2\2\u0225\u0217\3\2\2\2\u0226=\3\2\2\2\u0227\u0228\7f\2\2\u0228"+
		"\u022d\5B\"\2\u0229\u022a\7f\2\2\u022a\u022d\5,\27\2\u022b\u022d\7f\2"+
		"\2\u022c\u0227\3\2\2\2\u022c\u0229\3\2\2\2\u022c\u022b\3\2\2\2\u022d?"+
		"\3\2\2\2\u022e\u022f\7g\2\2\u022f\u0234\5B\"\2\u0230\u0231\7g\2\2\u0231"+
		"\u0234\5,\27\2\u0232\u0234\7g\2\2\u0233\u022e\3\2\2\2\u0233\u0230\3\2"+
		"\2\2\u0233\u0232\3\2\2\2\u0234A\3\2\2\2\u0235\u0236\5D#\2\u0236C\3\2\2"+
		"\2\u0237\u0238\7x\2\2\u0238E\3\2\2\2\u0239\u023a\7h\2\2\u023a\u023b\7"+
		"s\2\2\u023b\u0248\7x\2\2\u023c\u023d\7h\2\2\u023d\u023e\7s\2\2\u023e\u0248"+
		"\5,\27\2\u023f\u0240\7h\2\2\u0240\u0241\5,\27\2\u0241\u0242\7x\2\2\u0242"+
		"\u0248\3\2\2\2\u0243\u0244\7h\2\2\u0244\u0248\5,\27\2\u0245\u0246\7h\2"+
		"\2\u0246\u0248\7s\2\2\u0247\u0239\3\2\2\2\u0247\u023c\3\2\2\2\u0247\u023f"+
		"\3\2\2\2\u0247\u0243\3\2\2\2\u0247\u0245\3\2\2\2\u0248G\3\2\2\2\u0249"+
		"\u024b\7i\2\2\u024a\u024c\7j\2\2\u024b\u024a\3\2\2\2\u024b\u024c\3\2\2"+
		"\2\u024c\u024d\3\2\2\2\u024d\u024e\7k\2\2\u024e\u024f\7x\2\2\u024f\u025e"+
		"\b%\1\2\u0250\u0252\7i\2\2\u0251\u0253\7j\2\2\u0252\u0251\3\2\2\2\u0252"+
		"\u0253\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0258\7k\2\2\u0255\u0257\5\u0092"+
		"J\2\u0256\u0255\3\2\2\2\u0257\u025a\3\2\2\2\u0258\u0256\3\2\2\2\u0258"+
		"\u0259\3\2\2\2\u0259\u025e\3\2\2\2\u025a\u0258\3\2\2\2\u025b\u025c\7i"+
		"\2\2\u025c\u025e\b%\1\2\u025d\u0249\3\2\2\2\u025d\u0250\3\2\2\2\u025d"+
		"\u025b\3\2\2\2\u025eI\3\2\2\2\u025f\u0264\5L\'\2\u0260\u0264\5N(\2\u0261"+
		"\u0264\5P)\2\u0262\u0264\5T+\2\u0263\u025f\3\2\2\2\u0263\u0260\3\2\2\2"+
		"\u0263\u0261\3\2\2\2\u0263\u0262\3\2\2\2\u0264K\3\2\2\2\u0265\u0266\5"+
		",\27\2\u0266\u0267\7\17\2\2\u0267\u0269\3\2\2\2\u0268\u0265\3\2\2\2\u0269"+
		"\u026a\3\2\2\2\u026a\u0268\3\2\2\2\u026a\u026b\3\2\2\2\u026bM\3\2\2\2"+
		"\u026c\u026d\7P\2\2\u026d\u026f\7\20\2\2\u026e\u0270\7p\2\2\u026f\u026e"+
		"\3\2\2\2\u026f\u0270\3\2\2\2\u0270O\3\2\2\2\u0271\u0273\5\64\33\2\u0272"+
		"\u0274\7y\2\2\u0273\u0272\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0276\3\2"+
		"\2\2\u0275\u0277\5,\27\2\u0276\u0275\3\2\2\2\u0276\u0277\3\2\2\2\u0277"+
		"\u0279\3\2\2\2\u0278\u027a\7y\2\2\u0279\u0278\3\2\2\2\u0279\u027a\3\2"+
		"\2\2\u027a\u027b\3\2\2\2\u027b\u027d\5\64\33\2\u027c\u027e\7y\2\2\u027d"+
		"\u027c\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0280\5z"+
		">\2\u0280Q\3\2\2\2\u0281\u0282\7\7\2\2\u0282\u0283\7\3\2\2\u0283\u0284"+
		"\5l\67\2\u0284\u0285\7\4\2\2\u0285S\3\2\2\2\u0286\u0287\7n\2\2\u0287U"+
		"\3\2\2\2\u0288\u028c\5\u00f0y\2\u0289\u028b\7y\2\2\u028a\u0289\3\2\2\2"+
		"\u028b\u028e\3\2\2\2\u028c\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u0290"+
		"\3\2\2\2\u028e\u028c\3\2\2\2\u028f\u0288\3\2\2\2\u028f\u0290\3\2\2\2\u0290"+
		"\u0298\3\2\2\2\u0291\u0295\5X-\2\u0292\u0294\7y\2\2\u0293\u0292\3\2\2"+
		"\2\u0294\u0297\3\2\2\2\u0295\u0293\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0299"+
		"\3\2\2\2\u0297\u0295\3\2\2\2\u0298\u0291\3\2\2\2\u0298\u0299\3\2\2\2\u0299"+
		"\u029a\3\2\2\2\u029a\u029e\5l\67\2\u029b\u029d\7y\2\2\u029c\u029b\3\2"+
		"\2\2\u029d\u02a0\3\2\2\2\u029e\u029c\3\2\2\2\u029e\u029f\3\2\2\2\u029f"+
		"\u02a1\3\2\2\2\u02a0\u029e\3\2\2\2\u02a1\u02a3\5Z.\2\u02a2\u02a4\5d\63"+
		"\2\u02a3\u02a2\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a6"+
		"\5b\62\2\u02a6\u02ab\3\2\2\2\u02a7\u02a8\5R*\2\u02a8\u02a9\5b\62\2\u02a9"+
		"\u02ab\3\2\2\2\u02aa\u028f\3\2\2\2\u02aa\u02a7\3\2\2\2\u02abW\3\2\2\2"+
		"\u02ac\u02b0\5\u00e4s\2\u02ad\u02af\7y\2\2\u02ae\u02ad\3\2\2\2\u02af\u02b2"+
		"\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b4\3\2\2\2\u02b2"+
		"\u02b0\3\2\2\2\u02b3\u02ac\3\2\2\2\u02b4\u02b7\3\2\2\2\u02b5\u02b3\3\2"+
		"\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b8\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b8"+
		"\u02b9\5\u0084C\2\u02b9\u02bd\3\2\2\2\u02ba\u02bc\5\u00e6t\2\u02bb\u02ba"+
		"\3\2\2\2\u02bc\u02bf\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02be"+
		"\u02c2\3\2\2\2\u02bf\u02bd\3\2\2\2\u02c0\u02c2\5\64\33\2\u02c1\u02b5\3"+
		"\2\2\2\u02c1\u02c0\3\2\2\2\u02c2Y\3\2\2\2\u02c3\u02c5\7\3\2\2\u02c4\u02c6"+
		"\5\\/\2\u02c5\u02c4\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7"+
		"\u02c9\7\4\2\2\u02c8\u02ca\7\21\2\2\u02c9\u02c8\3\2\2\2\u02c9\u02ca\3"+
		"\2\2\2\u02ca\u02ce\3\2\2\2\u02cb\u02cd\7O\2\2\u02cc\u02cb\3\2\2\2\u02cd"+
		"\u02d0\3\2\2\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d2\3\2"+
		"\2\2\u02d0\u02ce\3\2\2\2\u02d1\u02d3\5n8\2\u02d2\u02d1\3\2\2\2\u02d2\u02d3"+
		"\3\2\2\2\u02d3[\3\2\2\2\u02d4\u02df\5^\60\2\u02d5\u02d9\7\17\2\2\u02d6"+
		"\u02d8\7y\2\2\u02d7\u02d6\3\2\2\2\u02d8\u02db\3\2\2\2\u02d9\u02d7\3\2"+
		"\2\2\u02d9\u02da\3\2\2\2\u02da\u02dc\3\2\2\2\u02db\u02d9\3\2\2\2\u02dc"+
		"\u02de\5^\60\2\u02dd\u02d5\3\2\2\2\u02de\u02e1\3\2\2\2\u02df\u02dd\3\2"+
		"\2\2\u02df\u02e0\3\2\2\2\u02e0\u02ea\3\2\2\2\u02e1\u02df\3\2\2\2\u02e2"+
		"\u02e6\7\17\2\2\u02e3\u02e5\7y\2\2\u02e4\u02e3\3\2\2\2\u02e5\u02e8\3\2"+
		"\2\2\u02e6\u02e4\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e9\3\2\2\2\u02e8"+
		"\u02e6\3\2\2\2\u02e9\u02eb\7|\2\2\u02ea\u02e2\3\2\2\2\u02ea\u02eb\3\2"+
		"\2\2\u02eb]\3\2\2\2\u02ec\u02f1\7L\2\2\u02ed\u02ee\5\u0088E\2\u02ee\u02ef"+
		"\5`\61\2\u02ef\u02f1\3\2\2\2\u02f0\u02ec\3\2\2\2\u02f0\u02ed\3\2\2\2\u02f1"+
		"_\3\2\2\2\u02f2\u02f4\5\u0096L\2\u02f3\u02f2\3\2\2\2\u02f3\u02f4\3\2\2"+
		"\2\u02f4\u02fa\3\2\2\2\u02f5\u02f6\7\3\2\2\u02f6\u02f7\5`\61\2\u02f7\u02f8"+
		"\7\4\2\2\u02f8\u02fb\3\2\2\2\u02f9\u02fb\5\u008aF\2\u02fa\u02f5\3\2\2"+
		"\2\u02fa\u02f9\3\2\2\2\u02fb\u02fd\3\2\2\2\u02fc\u02fe\5\u010e\u0088\2"+
		"\u02fd\u02fc\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fea\3\2\2\2\u02ff\u0300\7"+
		"p\2\2\u0300\u0301\b\62\1\2\u0301c\3\2\2\2\u0302\u0303\7\6\2\2\u0303\u0308"+
		"\5f\64\2\u0304\u0305\7\17\2\2\u0305\u0307\5f\64\2\u0306\u0304\3\2\2\2"+
		"\u0307\u030a\3\2\2\2\u0308\u0306\3\2\2\2\u0308\u0309\3\2\2\2\u0309e\3"+
		"\2\2\2\u030a\u0308\3\2\2\2\u030b\u030c\5h\65\2\u030c\u030d\5j\66\2\u030d"+
		"g\3\2\2\2\u030e\u0310\7\22\2\2\u030f\u030e\3\2\2\2\u030f\u0310\3\2\2\2"+
		"\u0310\u0311\3\2\2\2\u0311\u0312\5\u0092J\2\u0312i\3\2\2\2\u0313\u0315"+
		"\7\3\2\2\u0314\u0316\5\u009aN\2\u0315\u0314\3\2\2\2\u0315\u0316\3\2\2"+
		"\2\u0316\u0317\3\2\2\2\u0317\u0318\7\4\2\2\u0318k\3\2\2\2\u0319\u031a"+
		"\7\3\2\2\u031a\u031b\5l\67\2\u031b\u031c\7\4\2\2\u031c\u0321\3\2\2\2\u031d"+
		"\u0321\5\u0092J\2\u031e\u031f\7Z\2\2\u031f\u0321\5\u00eav\2\u0320\u0319"+
		"\3\2\2\2\u0320\u031d\3\2\2\2\u0320\u031e\3\2\2\2\u0321m\3\2\2\2\u0322"+
		"\u0323\7T\2\2\u0323\u0324\7\3\2\2\u0324\u0325\5p9\2\u0325\u0326\7\4\2"+
		"\2\u0326o\3\2\2\2\u0327\u0329\5\u00f4{\2\u0328\u0327\3\2\2\2\u0329\u032c"+
		"\3\2\2\2\u032a\u0328\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u0338\3\2\2\2\u032c"+
		"\u032a\3\2\2\2\u032d\u032e\7\3\2\2\u032e\u032f\5p9\2\u032f\u0333\7\4\2"+
		"\2\u0330\u0332\5\u00f4{\2\u0331\u0330\3\2\2\2\u0332\u0335\3\2\2\2\u0333"+
		"\u0331\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0337\3\2\2\2\u0335\u0333\3\2"+
		"\2\2\u0336\u032d\3\2\2\2\u0337\u033a\3\2\2\2\u0338\u0336\3\2\2\2\u0338"+
		"\u0339\3\2\2\2\u0339q\3\2\2\2\u033a\u0338\3\2\2\2\u033b\u033c\5t;\2\u033c"+
		"s\3\2\2\2\u033d\u033f\5\u00f0y\2\u033e\u033d\3\2\2\2\u033e\u033f\3\2\2"+
		"\2\u033f\u0340\3\2\2\2\u0340\u0342\5|?\2\u0341\u0343\7y\2\2\u0342\u0341"+
		"\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0345\3\2\2\2\u0344\u0346\5z>\2\u0345"+
		"\u0344\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0348\3\2\2\2\u0347\u0349\58"+
		"\35\2\u0348\u0347\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u037b\3\2\2\2\u034a"+
		"\u034c\7J\2\2\u034b\u034a\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u034e\3\2"+
		"\2\2\u034d\u034f\5\u00f0y\2\u034e\u034d\3\2\2\2\u034e\u034f\3\2\2\2\u034f"+
		"\u0350\3\2\2\2\u0350\u0352\5\u0084C\2\u0351\u0353\7y\2\2\u0352\u0351\3"+
		"\2\2\2\u0352\u0353\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0355\5z>\2\u0355"+
		"\u037b\3\2\2\2\u0356\u0358\7J\2\2\u0357\u0356\3\2\2\2\u0357\u0358\3\2"+
		"\2\2\u0358\u0359\3\2\2\2\u0359\u035b\5\u0084C\2\u035a\u035c\7y\2\2\u035b"+
		"\u035a\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u035f\7\3"+
		"\2\2\u035e\u0360\5v<\2\u035f\u035e\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0361"+
		"\3\2\2\2\u0361\u0362\5\u00e6t\2\u0362\u0363\5\u0092J\2\u0363\u0364\7\4"+
		"\2\2\u0364\u0365\5\u008cG\2\u0365\u0366\7\5\2\2\u0366\u037b\3\2\2\2\u0367"+
		"\u0369\7O\2\2\u0368\u0367\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u036b\3\2"+
		"\2\2\u036a\u036c\7J\2\2\u036b\u036a\3\2\2\2\u036b\u036c\3\2\2\2\u036c"+
		"\u036d\3\2\2\2\u036d\u036f\5x=\2\u036e\u0370\7y\2\2\u036f\u036e\3\2\2"+
		"\2\u036f\u0370\3\2\2\2\u0370\u0372\3\2\2\2\u0371\u0373\5z>\2\u0372\u0371"+
		"\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0375\3\2\2\2\u0374\u0376\58\35\2\u0375"+
		"\u0374\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0378\3\2\2\2\u0377\u0379\7\5"+
		"\2\2\u0378\u0377\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037b\3\2\2\2\u037a"+
		"\u033e\3\2\2\2\u037a\u034b\3\2\2\2\u037a\u0357\3\2\2\2\u037a\u0368\3\2"+
		"\2\2\u037bu\3\2\2\2\u037c\u037e\7o\2\2\u037d\u037c\3\2\2\2\u037e\u037f"+
		"\3\2\2\2\u037f\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380w\3\2\2\2\u0381"+
		"\u0383\7Y\2\2\u0382\u0384\58\35\2\u0383\u0382\3\2\2\2\u0383\u0384\3\2"+
		"\2\2\u0384\u0386\3\2\2\2\u0385\u0387\5\u0092J\2\u0386\u0385\3\2\2\2\u0386"+
		"\u0387\3\2\2\2\u0387\u0389\3\2\2\2\u0388\u038a\58\35\2\u0389\u0388\3\2"+
		"\2\2\u0389\u038a\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u038c\7p\2\2\u038c"+
		"\u03a2\b=\1\2\u038d\u038f\7Y\2\2\u038e\u0390\58\35\2\u038f\u038e\3\2\2"+
		"\2\u038f\u0390\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u0393\5\u0092J\2\u0392"+
		"\u0394\5\u0096L\2\u0393\u0392\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0395"+
		"\3\2\2\2\u0395\u0397\5\u0092J\2\u0396\u0398\5\u0096L\2\u0397\u0396\3\2"+
		"\2\2\u0397\u0398\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u039a\7\23\2\2\u039a"+
		"\u039b\b=\1\2\u039b\u03a2\3\2\2\2\u039c\u039e\7Y\2\2\u039d\u039f\58\35"+
		"\2\u039e\u039d\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a2"+
		"\5\u0092J\2\u03a1\u0381\3\2\2\2\u03a1\u038d\3\2\2\2\u03a1\u039c\3\2\2"+
		"\2\u03a2y\3\2\2\2\u03a3\u03ae\5\u010a\u0086\2\u03a4\u03a8\7\17\2\2\u03a5"+
		"\u03a7\7y\2\2\u03a6\u03a5\3\2\2\2\u03a7\u03aa\3\2\2\2\u03a8\u03a6\3\2"+
		"\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03ab\3\2\2\2\u03aa\u03a8\3\2\2\2\u03ab"+
		"\u03ad\5\u010a\u0086\2\u03ac\u03a4\3\2\2\2\u03ad\u03b0\3\2\2\2\u03ae\u03ac"+
		"\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b2\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b1"+
		"\u03b3\58\35\2\u03b2\u03b1\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b4\3\2"+
		"\2\2\u03b4\u03b5\7\5\2\2\u03b5{\3\2\2\2\u03b6\u03b8\7\\\2\2\u03b7\u03b9"+
		"\5~@\2\u03b8\u03b7\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03bb\3\2\2\2\u03ba"+
		"\u03bc\5\u0080A\2\u03bb\u03ba\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03bd"+
		"\3\2\2\2\u03bd\u03be\7p\2\2\u03be\u03bf\b?\1\2\u03bf}\3\2\2\2\u03c0\u03c1"+
		"\5\u0092J\2\u03c1\177\3\2\2\2\u03c2\u03c3\7\6\2\2\u03c3\u03c8\5\u0082"+
		"B\2\u03c4\u03c5\7\17\2\2\u03c5\u03c7\5\u0082B\2\u03c6\u03c4\3\2\2\2\u03c7"+
		"\u03ca\3\2\2\2\u03c8\u03c6\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u0081\3\2"+
		"\2\2\u03ca\u03c8\3\2\2\2\u03cb\u03cd\7Q\2\2\u03cc\u03cb\3\2\2\2\u03cc"+
		"\u03cd\3\2\2\2\u03cd\u03cf\3\2\2\2\u03ce\u03d0\5\u00e8u\2\u03cf\u03ce"+
		"\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u03d2\5\u0092J"+
		"\2\u03d2\u0083\3\2\2\2\u03d3\u03d5\7P\2\2\u03d4\u03d3\3\2\2\2\u03d4\u03d5"+
		"\3\2\2\2\u03d5\u03dc\3\2\2\2\u03d6\u03dd\5\u00e4s\2\u03d7\u03dd\7O\2\2"+
		"\u03d8\u03dd\7M\2\2\u03d9\u03dd\7N\2\2\u03da\u03dd\5\u00e6t\2\u03db\u03dd"+
		"\5\u0086D\2\u03dc\u03d6\3\2\2\2\u03dc\u03d7\3\2\2\2\u03dc\u03d8\3\2\2"+
		"\2\u03dc\u03d9\3\2\2\2\u03dc\u03da\3\2\2\2\u03dc\u03db\3\2\2\2\u03dd\u03de"+
		"\3\2\2\2\u03de\u03dc\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e4\3\2\2\2\u03e0"+
		"\u03e1\7\24\2\2\u03e1\u03e2\5\u00f2z\2\u03e2\u03e3\7\25\2\2\u03e3\u03e5"+
		"\3\2\2\2\u03e4\u03e0\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03f0\3\2\2\2\u03e6"+
		"\u03e7\7\22\2\2\u03e7\u03ec\5\u0086D\2\u03e8\u03e9\7\24\2\2\u03e9\u03ea"+
		"\5\u00f2z\2\u03ea\u03eb\7\25\2\2\u03eb\u03ed\3\2\2\2\u03ec\u03e8\3\2\2"+
		"\2\u03ec\u03ed\3\2\2\2\u03ed\u03ef\3\2\2\2\u03ee\u03e6\3\2\2\2\u03ef\u03f2"+
		"\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03fa\3\2\2\2\u03f2"+
		"\u03f0\3\2\2\2\u03f3\u03f9\5\u00e4s\2\u03f4\u03f9\7O\2\2\u03f5\u03f9\7"+
		"M\2\2\u03f6\u03f9\7N\2\2\u03f7\u03f9\5\u00e6t\2\u03f8\u03f3\3\2\2\2\u03f8"+
		"\u03f4\3\2\2\2\u03f8\u03f5\3\2\2\2\u03f8\u03f6\3\2\2\2\u03f8\u03f7\3\2"+
		"\2\2\u03f9\u03fc\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb"+
		"\u03ff\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fd\u03ff\5\64\33\2\u03fe\u03d4\3"+
		"\2\2\2\u03fe\u03fd\3\2\2\2\u03ff\u0085\3\2\2\2\u0400\u0402\t\3\2\2\u0401"+
		"\u0400\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0401\3\2\2\2\u0403\u0404\3\2"+
		"\2\2\u0404\u0087\3\2\2\2\u0405\u0407\t\4\2\2\u0406\u0405\3\2\2\2\u0406"+
		"\u0407\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u0409\5\u0084C\2\u0409\u0089"+
		"\3\2\2\2\u040a\u040b\5\u0092J\2\u040b\u008b\3\2\2\2\u040c\u040d\7\3\2"+
		"\2\u040d\u040e\7L\2\2\u040e\u0425\7\4\2\2\u040f\u0411\7\3\2\2\u0410\u0412"+
		"\7y\2\2\u0411\u0410\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u0421\3\2\2\2\u0413"+
		"\u0415\5\u008eH\2\u0414\u0416\7y\2\2\u0415\u0414\3\2\2\2\u0415\u0416\3"+
		"\2\2\2\u0416\u041e\3\2\2\2\u0417\u0419\7\17\2\2\u0418\u041a\7y\2\2\u0419"+
		"\u0418\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u041d\5\u008e"+
		"H\2\u041c\u0417\3\2\2\2\u041d\u0420\3\2\2\2\u041e\u041c\3\2\2\2\u041e"+
		"\u041f\3\2\2\2\u041f\u0422\3\2\2\2\u0420\u041e\3\2\2\2\u0421\u0413\3\2"+
		"\2\2\u0421\u0422\3\2\2\2\u0422\u0423\3\2\2\2\u0423\u0425\7\4\2\2\u0424"+
		"\u040c\3\2\2\2\u0424\u040f\3\2\2\2\u0425\u008d\3\2\2\2\u0426\u0427\5\u0088"+
		"E\2\u0427\u0428\5\u0090I\2\u0428\u042b\3\2\2\2\u0429\u042b\7|\2\2\u042a"+
		"\u0426\3\2\2\2\u042a\u0429\3\2\2\2\u042b\u008f\3\2\2\2\u042c\u042e\5\u0096"+
		"L\2\u042d\u042c\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u043c\3\2\2\2\u042f"+
		"\u0431\7\3\2\2\u0430\u0432\7y\2\2\u0431\u0430\3\2\2\2\u0431\u0432\3\2"+
		"\2\2\u0432\u0433\3\2\2\2\u0433\u0435\5\u0090I\2\u0434\u0436\7y\2\2\u0435"+
		"\u0434\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0437\3\2\2\2\u0437\u0438\7\4"+
		"\2\2\u0438\u043d\3\2\2\2\u0439\u043b\5\u008aF\2\u043a\u0439\3\2\2\2\u043a"+
		"\u043b\3\2\2\2\u043b\u043d\3\2\2\2\u043c\u042f\3\2\2\2\u043c\u043a\3\2"+
		"\2\2\u043d\u043f\3\2\2\2\u043e\u0440\5\u010e\u0088\2\u043f\u043e\3\2\2"+
		"\2\u043f\u0440\3\2\2\2\u0440\u0091\3\2\2\2\u0441\u0446\7o\2\2\u0442\u0443"+
		"\7\22\2\2\u0443\u0445\7o\2\2\u0444\u0442\3\2\2\2\u0445\u0448\3\2\2\2\u0446"+
		"\u0444\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u044d\3\2\2\2\u0448\u0446\3\2"+
		"\2\2\u0449\u044d\7]\2\2\u044a\u044d\7k\2\2\u044b\u044d\5\u00e8u\2\u044c"+
		"\u0441\3\2\2\2\u044c\u0449\3\2\2\2\u044c\u044a\3\2\2\2\u044c\u044b\3\2"+
		"\2\2\u044d\u0093\3\2\2\2\u044e\u044f\t\5\2\2\u044f\u0095\3\2\2\2\u0450"+
		"\u0452\5\u00e6t\2\u0451\u0453\7\30\2\2\u0452\u0451\3\2\2\2\u0452\u0453"+
		"\3\2\2\2\u0453\u0455\3\2\2\2\u0454\u0450\3\2\2\2\u0455\u0456\3\2\2\2\u0456"+
		"\u0454\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u0097\3\2\2\2\u0458\u0459\5\u0096"+
		"L\2\u0459\u0099\3\2\2\2\u045a\u045f\5\u009cO\2\u045b\u045c\7z\2\2\u045c"+
		"\u045e\7y\2\2\u045d\u045b\3\2\2\2\u045e\u0461\3\2\2\2\u045f\u045d\3\2"+
		"\2\2\u045f\u0460\3\2\2\2\u0460\u0470\3\2\2\2\u0461\u045f\3\2\2\2\u0462"+
		"\u0464\7y\2\2\u0463\u0462\3\2\2\2\u0464\u0467\3\2\2\2\u0465\u0463\3\2"+
		"\2\2\u0465\u0466\3\2\2\2\u0466\u0468\3\2\2\2\u0467\u0465\3\2\2\2\u0468"+
		"\u046c\7\17\2\2\u0469\u046b\7y\2\2\u046a\u0469\3\2\2\2\u046b\u046e\3\2"+
		"\2\2\u046c\u046a\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u046f\3\2\2\2\u046e"+
		"\u046c\3\2\2\2\u046f\u0471\5\u009aN\2\u0470\u0465\3\2\2\2\u0470\u0471"+
		"\3\2\2\2\u0471\u0476\3\2\2\2\u0472\u0473\7z\2\2\u0473\u0475\7y\2\2\u0474"+
		"\u0472\3\2\2\2\u0475\u0478\3\2\2\2\u0476\u0474\3\2\2\2\u0476\u0477\3\2"+
		"\2\2\u0477\u009b\3\2\2\2\u0478\u0476\3\2\2\2\u0479\u0489\5\u009eP\2\u047a"+
		"\u047c\7y\2\2\u047b\u047a\3\2\2\2\u047c\u047f\3\2\2\2\u047d\u047b\3\2"+
		"\2\2\u047d\u047e\3\2\2\2\u047e\u0480\3\2\2\2\u047f\u047d\3\2\2\2\u0480"+
		"\u0484\5\u00ecw\2\u0481\u0483\7y\2\2\u0482\u0481\3\2\2\2\u0483\u0486\3"+
		"\2\2\2\u0484\u0482\3\2\2\2\u0484\u0485\3\2\2\2\u0485\u0487\3\2\2\2\u0486"+
		"\u0484\3\2\2\2\u0487\u0488\5\u009cO\2\u0488\u048a\3\2\2\2\u0489\u047d"+
		"\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u009d\3\2\2\2\u048b\u04ab\5\u00a0Q"+
		"\2\u048c\u0490\5\u00a0Q\2\u048d\u048f\7y\2\2\u048e\u048d\3\2\2\2\u048f"+
		"\u0492\3\2\2\2\u0490\u048e\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u0493\3\2"+
		"\2\2\u0492\u0490\3\2\2\2\u0493\u0497\7\31\2\2\u0494\u0496\7y\2\2\u0495"+
		"\u0494\3\2\2\2\u0496\u0499\3\2\2\2\u0497\u0495\3\2\2\2\u0497\u0498\3\2"+
		"\2\2\u0498\u049a\3\2\2\2\u0499\u0497\3\2\2\2\u049a\u049e\5\u009aN\2\u049b"+
		"\u049d\7y\2\2\u049c\u049b\3\2\2\2\u049d\u04a0\3\2\2\2\u049e\u049c\3\2"+
		"\2\2\u049e\u049f\3\2\2\2\u049f\u04a1\3\2\2\2\u04a0\u049e\3\2\2\2\u04a1"+
		"\u04a5\7\6\2\2\u04a2\u04a4\7y\2\2\u04a3\u04a2\3\2\2\2\u04a4\u04a7\3\2"+
		"\2\2\u04a5\u04a3\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04a8\3\2\2\2\u04a7"+
		"\u04a5\3\2\2\2\u04a8\u04a9\5\u009eP\2\u04a9\u04ab\3\2\2\2\u04aa\u048b"+
		"\3\2\2\2\u04aa\u048c\3\2\2\2\u04ab\u009f\3\2\2\2\u04ac\u04bb\5\u00a2R"+
		"\2\u04ad\u04af\7y\2\2\u04ae\u04ad\3\2\2\2\u04af\u04b2\3\2\2\2\u04b0\u04ae"+
		"\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b3\3\2\2\2\u04b2\u04b0\3\2\2\2\u04b3"+
		"\u04b7\7\32\2\2\u04b4\u04b6\7y\2\2\u04b5\u04b4\3\2\2\2\u04b6\u04b9\3\2"+
		"\2\2\u04b7\u04b5\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04ba\3\2\2\2\u04b9"+
		"\u04b7\3\2\2\2\u04ba\u04bc\5\u00a0Q\2\u04bb\u04b0\3\2\2\2\u04bb\u04bc"+
		"\3\2\2\2\u04bc\u00a1\3\2\2\2\u04bd\u04cc\5\u00a4S\2\u04be\u04c0\7y\2\2"+
		"\u04bf\u04be\3\2\2\2\u04c0\u04c3\3\2\2\2\u04c1\u04bf\3\2\2\2\u04c1\u04c2"+
		"\3\2\2\2\u04c2\u04c4\3\2\2\2\u04c3\u04c1\3\2\2\2\u04c4\u04c8\7\33\2\2"+
		"\u04c5\u04c7\7y\2\2\u04c6\u04c5\3\2\2\2\u04c7\u04ca\3\2\2\2\u04c8\u04c6"+
		"\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04cb\3\2\2\2\u04ca\u04c8\3\2\2\2\u04cb"+
		"\u04cd\5\u00a2R\2\u04cc\u04c1\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd\u00a3"+
		"\3\2\2\2\u04ce\u04dd\5\u00a6T\2\u04cf\u04d1\7y\2\2\u04d0\u04cf\3\2\2\2"+
		"\u04d1\u04d4\3\2\2\2\u04d2\u04d0\3\2\2\2\u04d2\u04d3\3\2\2\2\u04d3\u04d5"+
		"\3\2\2\2\u04d4\u04d2\3\2\2\2\u04d5\u04d9\7\34\2\2\u04d6\u04d8\7y\2\2\u04d7"+
		"\u04d6\3\2\2\2\u04d8\u04db\3\2\2\2\u04d9\u04d7\3\2\2\2\u04d9\u04da\3\2"+
		"\2\2\u04da\u04dc\3\2\2\2\u04db\u04d9\3\2\2\2\u04dc\u04de\5\u00a4S\2\u04dd"+
		"\u04d2\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u00a5\3\2\2\2\u04df\u04ee\5\u00a8"+
		"U\2\u04e0\u04e2\7y\2\2\u04e1\u04e0\3\2\2\2\u04e2\u04e5\3\2\2\2\u04e3\u04e1"+
		"\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e6\3\2\2\2\u04e5\u04e3\3\2\2\2\u04e6"+
		"\u04ea\7\35\2\2\u04e7\u04e9\7y\2\2\u04e8\u04e7\3\2\2\2\u04e9\u04ec\3\2"+
		"\2\2\u04ea\u04e8\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04ed\3\2\2\2\u04ec"+
		"\u04ea\3\2\2\2\u04ed\u04ef\5\u00a6T\2\u04ee\u04e3\3\2\2\2\u04ee\u04ef"+
		"\3\2\2\2\u04ef\u00a7\3\2\2\2\u04f0\u04ff\5\u00aaV\2\u04f1\u04f3\7y\2\2"+
		"\u04f2\u04f1\3\2\2\2\u04f3\u04f6\3\2\2\2\u04f4\u04f2\3\2\2\2\u04f4\u04f5"+
		"\3\2\2\2\u04f5\u04f7\3\2\2\2\u04f6\u04f4\3\2\2\2\u04f7\u04fb\7\36\2\2"+
		"\u04f8\u04fa\7y\2\2\u04f9\u04f8\3\2\2\2\u04fa\u04fd\3\2\2\2\u04fb\u04f9"+
		"\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04fe\3\2\2\2\u04fd\u04fb\3\2\2\2\u04fe"+
		"\u0500\5\u00a8U\2\u04ff\u04f4\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u00a9"+
		"\3\2\2\2\u0501\u0511\5\u00acW\2\u0502\u0504\7y\2\2\u0503\u0502\3\2\2\2"+
		"\u0504\u0507\3\2\2\2\u0505\u0503\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u0508"+
		"\3\2\2\2\u0507\u0505\3\2\2\2\u0508\u050c\5\u00eex\2\u0509\u050b\7y\2\2"+
		"\u050a\u0509\3\2\2\2\u050b\u050e\3\2\2\2\u050c\u050a\3\2\2\2\u050c\u050d"+
		"\3\2\2\2\u050d\u050f\3\2\2\2\u050e\u050c\3\2\2\2\u050f\u0510\5\u00aaV"+
		"\2\u0510\u0512\3\2\2\2\u0511\u0505\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u00ab"+
		"\3\2\2\2\u0513\u0523\5\u00aeX\2\u0514\u0516\7y\2\2\u0515\u0514\3\2\2\2"+
		"\u0516\u0519\3\2\2\2\u0517\u0515\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u051a"+
		"\3\2\2\2\u0519\u0517\3\2\2\2\u051a\u051e\5\u00e0q\2\u051b\u051d\7y\2\2"+
		"\u051c\u051b\3\2\2\2\u051d\u0520\3\2\2\2\u051e\u051c\3\2\2\2\u051e\u051f"+
		"\3\2\2\2\u051f\u0521\3\2\2\2\u0520\u051e\3\2\2\2\u0521\u0522\5\u00acW"+
		"\2\u0522\u0524\3\2\2\2\u0523\u0517\3\2\2\2\u0523\u0524\3\2\2\2\u0524\u00ad"+
		"\3\2\2\2\u0525\u0534\5\u00b0Y\2\u0526\u0528\7y\2\2\u0527\u0526\3\2\2\2"+
		"\u0528\u052b\3\2\2\2\u0529\u0527\3\2\2\2\u0529\u052a\3\2\2\2\u052a\u052c"+
		"\3\2\2\2\u052b\u0529\3\2\2\2\u052c\u0530\t\6\2\2\u052d\u052f\7y\2\2\u052e"+
		"\u052d\3\2\2\2\u052f\u0532\3\2\2\2\u0530\u052e\3\2\2\2\u0530\u0531\3\2"+
		"\2\2\u0531\u0533\3\2\2\2\u0532\u0530\3\2\2\2\u0533\u0535\5\u00aeX\2\u0534"+
		"\u0529\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u00af\3\2\2\2\u0536\u0545\5\u00b2"+
		"Z\2\u0537\u0539\7y\2\2\u0538\u0537\3\2\2\2\u0539\u053c\3\2\2\2\u053a\u0538"+
		"\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u053d\3\2\2\2\u053c\u053a\3\2\2\2\u053d"+
		"\u0541\t\7\2\2\u053e\u0540\7y\2\2\u053f\u053e\3\2\2\2\u0540\u0543\3\2"+
		"\2\2\u0541\u053f\3\2\2\2\u0541\u0542\3\2\2\2\u0542\u0544\3\2\2\2\u0543"+
		"\u0541\3\2\2\2\u0544\u0546\5\u00b0Y\2\u0545\u053a\3\2\2\2\u0545\u0546"+
		"\3\2\2\2\u0546\u00b1\3\2\2\2\u0547\u0556\5\u00b4[\2\u0548\u054a\7y\2\2"+
		"\u0549\u0548\3\2\2\2\u054a\u054d\3\2\2\2\u054b\u0549\3\2\2\2\u054b\u054c"+
		"\3\2\2\2\u054c\u054e\3\2\2\2\u054d\u054b\3\2\2\2\u054e\u0552\t\b\2\2\u054f"+
		"\u0551\7y\2\2\u0550\u054f\3\2\2\2\u0551\u0554\3\2\2\2\u0552\u0550\3\2"+
		"\2\2\u0552\u0553\3\2\2\2\u0553\u0555\3\2\2\2\u0554\u0552\3\2\2\2\u0555"+
		"\u0557\5\u00b2Z\2\u0556\u054b\3\2\2\2\u0556\u0557\3\2\2\2\u0557\u00b3"+
		"\3\2\2\2\u0558\u0559\7\3\2\2\u0559\u055a\5\u00e6t\2\u055a\u055b\5\u0092"+
		"J\2\u055b\u055c\7\4\2\2\u055c\u055d\7\3\2\2\u055d\u055e\5\u00d2j\2\u055e"+
		"\u055f\7\4\2\2\u055f\u0562\3\2\2\2\u0560\u0562\5\u00b6\\\2\u0561\u0558"+
		"\3\2\2\2\u0561\u0560\3\2\2\2\u0562\u00b5\3\2\2\2\u0563\u0564\7\3\2\2\u0564"+
		"\u0565\5\u00b8]\2\u0565\u0566\7\4\2\2\u0566\u0567\5\u00b6\\\2\u0567\u056a"+
		"\3\2\2\2\u0568\u056a\5\u00ba^\2\u0569\u0563\3\2\2\2\u0569\u0568\3\2\2"+
		"\2\u056a\u00b7\3\2\2\2\u056b\u056c\5\u0084C\2\u056c\u00b9\3\2\2\2\u056d"+
		"\u0574\5\u00bc_\2\u056e\u0574\5\u00c0a\2\u056f\u0574\5\u00c2b\2\u0570"+
		"\u0574\5\u00be`\2\u0571\u0574\5\u00ceh\2\u0572\u0574\5\u00c6d\2\u0573"+
		"\u056d\3\2\2\2\u0573\u056e\3\2\2\2\u0573\u056f\3\2\2\2\u0573\u0570\3\2"+
		"\2\2\u0573\u0571\3\2\2\2\u0573\u0572\3\2\2\2\u0574\u00bb\3\2\2\2\u0575"+
		"\u0576\7\36\2\2\u0576\u0577\5\u0092J\2\u0577\u00bd\3\2\2\2\u0578\u057a"+
		"\7\22\2\2\u0579\u0578\3\2\2\2\u0579\u057a\3\2\2\2\u057a\u057b\3\2\2\2"+
		"\u057b\u057f\7]\2\2\u057c\u057e\7y\2\2\u057d\u057c\3\2\2\2\u057e\u0581"+
		"\3\2\2\2\u057f\u057d\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u0582\3\2\2\2\u0581"+
		"\u057f\3\2\2\2\u0582\u0586\5\u0084C\2\u0583\u0585\7y\2\2\u0584\u0583\3"+
		"\2\2\2\u0585\u0588\3\2\2\2\u0586\u0584\3\2\2\2\u0586\u0587\3\2\2\2\u0587"+
		"\u0589\3\2\2\2\u0588\u0586\3\2\2\2\u0589\u058b\7%\2\2\u058a\u058c\5\u009e"+
		"P\2\u058b\u058a\3\2\2\2\u058b\u058c\3\2\2\2\u058c\u058d\3\2\2\2\u058d"+
		"\u058e\7&\2\2\u058e\u05a7\3\2\2\2\u058f\u0591\7\22\2\2\u0590\u058f\3\2"+
		"\2\2\u0590\u0591\3\2\2\2\u0591\u0592\3\2\2\2\u0592\u0596\7]\2\2\u0593"+
		"\u0595\7y\2\2\u0594\u0593\3\2\2\2\u0595\u0598\3\2\2\2\u0596\u0594\3\2"+
		"\2\2\u0596\u0597\3\2\2\2\u0597\u0599\3\2\2\2\u0598\u0596\3\2\2\2\u0599"+
		"\u059d\5\u0084C\2\u059a\u059c\7y\2\2\u059b\u059a\3\2\2\2\u059c\u059f\3"+
		"\2\2\2\u059d\u059b\3\2\2\2\u059d\u059e\3\2\2\2\u059e\u05a0\3\2\2\2\u059f"+
		"\u059d\3\2\2\2\u05a0\u05a2\7\3\2\2\u05a1\u05a3\5\u009aN\2\u05a2\u05a1"+
		"\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4\u05a5\7\4\2\2\u05a5"+
		"\u05a7\3\2\2\2\u05a6\u0579\3\2\2\2\u05a6\u0590\3\2\2\2\u05a7\u00bf\3\2"+
		"\2\2\u05a8\u05ac\5\u00dep\2\u05a9\u05ab\7y\2\2\u05aa\u05a9\3\2\2\2\u05ab"+
		"\u05ae\3\2\2\2\u05ac\u05aa\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ad\u05af\3\2"+
		"\2\2\u05ae\u05ac\3\2\2\2\u05af\u05b0\5\u00b6\\\2\u05b0\u00c1\3\2\2\2\u05b1"+
		"\u05b5\5\u00c4c\2\u05b2\u05b4\7y\2\2\u05b3\u05b2\3\2\2\2\u05b4\u05b7\3"+
		"\2\2\2\u05b5\u05b3\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6\u05b8\3\2\2\2\u05b7"+
		"\u05b5\3\2\2\2\u05b8\u05b9\7\3\2\2\u05b9\u05ba\5\u00c8e\2\u05ba\u05bb"+
		"\7\4\2\2\u05bb\u05c6\3\2\2\2\u05bc\u05c0\5\u00c4c\2\u05bd\u05bf\7y\2\2"+
		"\u05be\u05bd\3\2\2\2\u05bf\u05c2\3\2\2\2\u05c0\u05be\3\2\2\2\u05c0\u05c1"+
		"\3\2\2\2\u05c1\u05c3\3\2\2\2\u05c2\u05c0\3\2\2\2\u05c3\u05c4\5\u00caf"+
		"\2\u05c4\u05c6\3\2\2\2\u05c5\u05b1\3\2\2\2\u05c5\u05bc\3\2\2\2\u05c6\u00c3"+
		"\3\2\2\2\u05c7\u05c8\7\'\2\2\u05c8\u00c5\3\2\2\2\u05c9\u05cd\7(\2\2\u05ca"+
		"\u05cc\7y\2\2\u05cb\u05ca\3\2\2\2\u05cc\u05cf\3\2\2\2\u05cd\u05cb\3\2"+
		"\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05d0\3\2\2\2\u05cf\u05cd\3\2\2\2\u05d0"+
		"\u05d1\7\3\2\2\u05d1\u05d2\5\u009aN\2\u05d2\u05d3\7\4\2\2\u05d3\u05dd"+
		"\3\2\2\2\u05d4\u05d8\7(\2\2\u05d5\u05d7\7y\2\2\u05d6\u05d5\3\2\2\2\u05d7"+
		"\u05da\3\2\2\2\u05d8\u05d6\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05db\3\2"+
		"\2\2\u05da\u05d8\3\2\2\2\u05db\u05dd\5\u009aN\2\u05dc\u05c9\3\2\2\2\u05dc"+
		"\u05d4\3\2\2\2\u05dd\u00c7\3\2\2\2\u05de\u05e8\5\u0084C\2\u05df\u05e1"+
		"\7y\2\2\u05e0\u05df\3\2\2\2\u05e1\u05e4\3\2\2\2\u05e2\u05e0\3\2\2\2\u05e2"+
		"\u05e3\3\2\2\2\u05e3\u05e5\3\2\2\2\u05e4\u05e2\3\2\2\2\u05e5\u05e7\5\u00e6"+
		"t\2\u05e6\u05e2\3\2\2\2\u05e7\u05ea\3\2\2\2\u05e8\u05e6\3\2\2\2\u05e8"+
		"\u05e9\3\2\2\2\u05e9\u00c9\3\2\2\2\u05ea\u05e8\3\2\2\2\u05eb\u05ec\5\u00ba"+
		"^\2\u05ec\u00cb\3\2\2\2\u05ed\u05ee\t\t\2\2\u05ee\u00cd\3\2\2\2\u05ef"+
		"\u05f1\bh\1\2\u05f0\u05f2\5\u0084C\2\u05f1\u05f0\3\2\2\2\u05f1\u05f2\3"+
		"\2\2\2\u05f2\u05f3\3\2\2\2\u05f3\u0605\5\u00d0i\2\u05f4\u0605\5\u00d6"+
		"l\2\u05f5\u05f7\5\u00e6t\2\u05f6\u05f5\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7"+
		"\u05f8\3\2\2\2\u05f8\u05fc\5\u00ccg\2\u05f9\u05fb\7y\2\2\u05fa\u05f9\3"+
		"\2\2\2\u05fb\u05fe\3\2\2\2\u05fc\u05fa\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd"+
		"\u0600\3\2\2\2\u05fe\u05fc\3\2\2\2\u05ff\u0601\5\u00e6t\2\u0600\u05ff"+
		"\3\2\2\2\u0600\u0601\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u0603\5\u00d6l"+
		"\2\u0603\u0605\3\2\2\2\u0604\u05ef\3\2\2\2\u0604\u05f4\3\2\2\2\u0604\u05f6"+
		"\3\2\2\2\u0605\u063f\3\2\2\2\u0606\u060a\f\n\2\2\u0607\u0609\7y\2\2\u0608"+
		"\u0607\3\2\2\2\u0609\u060c\3\2\2\2\u060a\u0608\3\2\2\2\u060a\u060b\3\2"+
		"\2\2\u060b\u060d\3\2\2\2\u060c\u060a\3\2\2\2\u060d\u060f\7%\2\2\u060e"+
		"\u0610\5\u009aN\2\u060f\u060e\3\2\2\2\u060f\u0610\3\2\2\2\u0610\u0611"+
		"\3\2\2\2\u0611\u063e\7&\2\2\u0612\u0616\f\t\2\2\u0613\u0615\7y\2\2\u0614"+
		"\u0613\3\2\2\2\u0615\u0618\3\2\2\2\u0616\u0614\3\2\2\2\u0616\u0617\3\2"+
		"\2\2\u0617\u0619\3\2\2\2\u0618\u0616\3\2\2\2\u0619\u061a\7\3\2\2\u061a"+
		"\u061b\5\u00d2j\2\u061b\u061c\7\4\2\2\u061c\u063e\3\2\2\2\u061d\u061e"+
		"\f\b\2\2\u061e\u0622\7+\2\2\u061f\u0621\7y\2\2\u0620\u061f\3\2\2\2\u0621"+
		"\u0624\3\2\2\2\u0622\u0620\3\2\2\2\u0622\u0623\3\2\2\2\u0623\u0626\3\2"+
		"\2\2\u0624\u0622\3\2\2\2\u0625\u0627\7[\2\2\u0626\u0625\3\2\2\2\u0626"+
		"\u0627\3\2\2\2\u0627\u0628\3\2\2\2\u0628\u063e\5\u0092J\2\u0629\u062a"+
		"\f\7\2\2\u062a\u062e\7,\2\2\u062b\u062d\7y\2\2\u062c\u062b\3\2\2\2\u062d"+
		"\u0630\3\2\2\2\u062e\u062c\3\2\2\2\u062e\u062f\3\2\2\2\u062f\u0632\3\2"+
		"\2\2\u0630\u062e\3\2\2\2\u0631\u0633\7[\2\2\u0632\u0631\3\2\2\2\u0632"+
		"\u0633\3\2\2\2\u0633\u0634\3\2\2\2\u0634\u063e\5\u0092J\2\u0635\u0639"+
		"\f\6\2\2\u0636\u0638\7y\2\2\u0637\u0636\3\2\2\2\u0638\u063b\3\2\2\2\u0639"+
		"\u0637\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u063c\3\2\2\2\u063b\u0639\3\2"+
		"\2\2\u063c\u063e\5\u00ccg\2\u063d\u0606\3\2\2\2\u063d\u0612\3\2\2\2\u063d"+
		"\u061d\3\2\2\2\u063d\u0629\3\2\2\2\u063d\u0635\3\2\2\2\u063e\u0641\3\2"+
		"\2\2\u063f\u063d\3\2\2\2\u063f\u0640\3\2\2\2\u0640\u00cf\3\2\2\2\u0641"+
		"\u063f\3\2\2\2\u0642\u0646\7p\2\2\u0643\u0645\7y\2\2\u0644\u0643\3\2\2"+
		"\2\u0645\u0648\3\2\2\2\u0646\u0644\3\2\2\2\u0646\u0647\3\2\2\2\u0647\u0652"+
		"\3\2\2\2\u0648\u0646\3\2\2\2\u0649\u064d\7v\2\2\u064a\u064c\7y\2\2\u064b"+
		"\u064a\3\2\2\2\u064c\u064f\3\2\2\2\u064d\u064b\3\2\2\2\u064d\u064e\3\2"+
		"\2\2\u064e\u0651\3\2\2\2\u064f\u064d\3\2\2\2\u0650\u0649\3\2\2\2\u0651"+
		"\u0654\3\2\2\2\u0652\u0650\3\2\2\2\u0652\u0653\3\2\2\2\u0653\u0656\3\2"+
		"\2\2\u0654\u0652\3\2\2\2\u0655\u0657\5\u00d2j\2\u0656\u0655\3\2\2\2\u0656"+
		"\u0657\3\2\2\2\u0657\u065b\3\2\2\2\u0658\u065a\7y\2\2\u0659\u0658\3\2"+
		"\2\2\u065a\u065d\3\2\2\2\u065b\u0659\3\2\2\2\u065b\u065c\3\2\2\2\u065c"+
		"\u0667\3\2\2\2\u065d\u065b\3\2\2\2\u065e\u0662\7v\2\2\u065f\u0661\7y\2"+
		"\2\u0660\u065f\3\2\2\2\u0661\u0664\3\2\2\2\u0662\u0660\3\2\2\2\u0662\u0663"+
		"\3\2\2\2\u0663\u0666\3\2\2\2\u0664\u0662\3\2\2\2\u0665\u065e\3\2\2\2\u0666"+
		"\u0669\3\2\2\2\u0667\u0665\3\2\2\2\u0667\u0668\3\2\2\2\u0668\u066a\3\2"+
		"\2\2\u0669\u0667\3\2\2\2\u066a\u066b\7q\2\2\u066b\u00d1\3\2\2\2\u066c"+
		"\u066e\5\u00d4k\2\u066d\u066c\3\2\2\2\u066d\u066e\3\2\2\2\u066e\u0672"+
		"\3\2\2\2\u066f\u0671\7y\2\2\u0670\u066f\3\2\2\2\u0671\u0674\3\2\2\2\u0672"+
		"\u0670\3\2\2\2\u0672\u0673\3\2\2\2\u0673\u068d\3\2\2\2\u0674\u0672\3\2"+
		"\2\2\u0675\u0677\7\17\2\2\u0676\u0675\3\2\2\2\u0676\u0677\3\2\2\2\u0677"+
		"\u067b\3\2\2\2\u0678\u067a\7y\2\2\u0679\u0678\3\2\2\2\u067a\u067d\3\2"+
		"\2\2\u067b\u0679\3\2\2\2\u067b\u067c\3\2\2\2\u067c\u0687\3\2\2\2\u067d"+
		"\u067b\3\2\2\2\u067e\u0682\7v\2\2\u067f\u0681\7y\2\2\u0680\u067f\3\2\2"+
		"\2\u0681\u0684\3\2\2\2\u0682\u0680\3\2\2\2\u0682\u0683\3\2\2\2\u0683\u0686"+
		"\3\2\2\2\u0684\u0682\3\2\2\2\u0685\u067e\3\2\2\2\u0686\u0689\3\2\2\2\u0687"+
		"\u0685\3\2\2\2\u0687\u0688\3\2\2\2\u0688\u068a\3\2\2\2\u0689\u0687\3\2"+
		"\2\2\u068a\u068c\5\u00d4k\2\u068b\u0676\3\2\2\2\u068c\u068f\3\2\2\2\u068d"+
		"\u068b\3\2\2\2\u068d\u068e\3\2\2\2\u068e\u0691\3\2\2\2\u068f\u068d\3\2"+
		"\2\2\u0690\u0692\7\17\2\2\u0691\u0690\3\2\2\2\u0691\u0692\3\2\2\2\u0692"+
		"\u00d3\3\2\2\2\u0693\u06c3\5\u009cO\2\u0694\u0698\7v\2\2\u0695\u0697\7"+
		"y\2\2\u0696\u0695\3\2\2\2\u0697\u069a\3\2\2\2\u0698\u0696\3\2\2\2\u0698"+
		"\u0699\3\2\2\2\u0699\u069c\3\2\2\2\u069a\u0698\3\2\2\2\u069b\u0694\3\2"+
		"\2\2\u069c\u069f\3\2\2\2\u069d\u069b\3\2\2\2\u069d\u069e\3\2\2\2\u069e"+
		"\u06a0\3\2\2\2\u069f\u069d\3\2\2\2\u06a0\u06a4\5,\27\2\u06a1\u06a3\7y"+
		"\2\2\u06a2\u06a1\3\2\2\2\u06a3\u06a6\3\2\2\2\u06a4\u06a2\3\2\2\2\u06a4"+
		"\u06a5\3\2\2\2\u06a5\u06a8\3\2\2\2\u06a6\u06a4\3\2\2\2\u06a7\u069d\3\2"+
		"\2\2\u06a8\u06a9\3\2\2\2\u06a9\u06a7\3\2\2\2\u06a9\u06aa\3\2\2\2\u06aa"+
		"\u06c3\3\2\2\2\u06ab\u06af\7v\2\2\u06ac\u06ae\7y\2\2\u06ad\u06ac\3\2\2"+
		"\2\u06ae\u06b1\3\2\2\2\u06af\u06ad\3\2\2\2\u06af\u06b0\3\2\2\2\u06b0\u06b3"+
		"\3\2\2\2\u06b1\u06af\3\2\2\2\u06b2\u06ab\3\2\2\2\u06b3\u06b6\3\2\2\2\u06b4"+
		"\u06b2\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5\u06b7\3\2\2\2\u06b6\u06b4\3\2"+
		"\2\2\u06b7\u06bb\5\64\33\2\u06b8\u06ba\7y\2\2\u06b9\u06b8\3\2\2\2\u06ba"+
		"\u06bd\3\2\2\2\u06bb\u06b9\3\2\2\2\u06bb\u06bc\3\2\2\2\u06bc\u06bf\3\2"+
		"\2\2\u06bd\u06bb\3\2\2\2\u06be\u06b4\3\2\2\2\u06bf\u06c0\3\2\2\2\u06c0"+
		"\u06be\3\2\2\2\u06c0\u06c1\3\2\2\2\u06c1\u06c3\3\2\2\2\u06c2\u0693\3\2"+
		"\2\2\u06c2\u06a7\3\2\2\2\u06c2\u06be\3\2\2\2\u06c3\u00d5\3\2\2\2\u06c4"+
		"\u06cb\5\u0092J\2\u06c5\u06cb\5\u00e2r\2\u06c6\u06c7\7\3\2\2\u06c7\u06c8"+
		"\5\u009aN\2\u06c8\u06c9\7\4\2\2\u06c9\u06cb\3\2\2\2\u06ca\u06c4\3\2\2"+
		"\2\u06ca\u06c5\3\2\2\2\u06ca\u06c6\3\2\2\2\u06cb\u00d7\3\2\2\2\u06cc\u06cd"+
		"\7\5\2\2\u06cd\u00d9\3\2\2\2\u06ce\u06cf\7v\2\2\u06cf\u00db\3\2\2\2\u06d0"+
		"\u06d1\7y\2\2\u06d1\u00dd\3\2\2\2\u06d2\u06d3\t\n\2\2\u06d3\u00df\3\2"+
		"\2\2\u06d4\u06d5\t\13\2\2\u06d5\u00e1\3\2\2\2\u06d6\u06f3\7r\2\2\u06d7"+
		"\u06f3\7t\2\2\u06d8\u06f3\7s\2\2\u06d9\u06dd\7x\2\2\u06da\u06dc\7y\2\2"+
		"\u06db\u06da\3\2\2\2\u06dc\u06df\3\2\2\2\u06dd\u06db\3\2\2\2\u06dd\u06de"+
		"\3\2\2\2\u06de\u06e3\3\2\2\2\u06df\u06dd\3\2\2\2\u06e0\u06e2\7v\2\2\u06e1"+
		"\u06e0\3\2\2\2\u06e2\u06e5\3\2\2\2\u06e3\u06e1\3\2\2\2\u06e3\u06e4\3\2"+
		"\2\2\u06e4\u06e9\3\2\2\2\u06e5\u06e3\3\2\2\2\u06e6\u06e8\7y\2\2\u06e7"+
		"\u06e6\3\2\2\2\u06e8\u06eb\3\2\2\2\u06e9\u06e7\3\2\2\2\u06e9\u06ea\3\2"+
		"\2\2\u06ea\u06ed\3\2\2\2\u06eb\u06e9\3\2\2\2\u06ec\u06d9\3\2\2\2\u06ed"+
		"\u06ee\3\2\2\2\u06ee\u06ec\3\2\2\2\u06ee\u06ef\3\2\2\2\u06ef\u06f3\3\2"+
		"\2\2\u06f0\u06f3\7w\2\2\u06f1\u06f3\7u\2\2\u06f2\u06d6\3\2\2\2\u06f2\u06d7"+
		"\3\2\2\2\u06f2\u06d8\3\2\2\2\u06f2\u06ec\3\2\2\2\u06f2\u06f0\3\2\2\2\u06f2"+
		"\u06f1\3\2\2\2\u06f3\u00e3\3\2\2\2\u06f4\u06f5\t\f\2\2\u06f5\u00e5\3\2"+
		"\2\2\u06f6\u06f7\t\r\2\2\u06f7\u00e7\3\2\2\2\u06f8\u06f9\t\16\2\2\u06f9"+
		"\u00e9\3\2\2\2\u06fa\u06fd\t\17\2\2\u06fb\u06fc\7%\2\2\u06fc\u06fe\7&"+
		"\2\2\u06fd\u06fb\3\2\2\2\u06fd\u06fe\3\2\2\2\u06fe\u0728\3\2\2\2\u06ff"+
		"\u0728\7!\2\2\u0700\u0728\7\"\2\2\u0701\u0728\7\21\2\2\u0702\u0728\7#"+
		"\2\2\u0703\u0728\7$\2\2\u0704\u0728\7\35\2\2\u0705\u0728\7\36\2\2\u0706"+
		"\u0728\7\34\2\2\u0707\u0728\7-\2\2\u0708\u0728\7.\2\2\u0709\u0728\7\23"+
		"\2\2\u070a\u0728\7\24\2\2\u070b\u0728\7\25\2\2\u070c\u0728\7\62\2\2\u070d"+
		"\u0728\7\63\2\2\u070e\u0728\7\64\2\2\u070f\u0728\7\65\2\2\u0710\u0728"+
		"\7\66\2\2\u0711\u0728\7\67\2\2\u0712\u0728\78\2\2\u0713\u0728\79\2\2\u0714"+
		"\u0728\7 \2\2\u0715\u0728\7\37\2\2\u0716\u0728\7:\2\2\u0717\u0728\7;\2"+
		"\2\u0718\u0728\7<\2\2\u0719\u0728\7=\2\2\u071a\u0728\7/\2\2\u071b\u0728"+
		"\7\60\2\2\u071c\u0728\7\33\2\2\u071d\u0728\7\32\2\2\u071e\u0728\7*\2\2"+
		"\u071f\u0728\7)\2\2\u0720\u0728\7\17\2\2\u0721\u0728\7>\2\2\u0722\u0728"+
		"\7,\2\2\u0723\u0724\7\3\2\2\u0724\u0728\7\4\2\2\u0725\u0726\7%\2\2\u0726"+
		"\u0728\7&\2\2\u0727\u06fa\3\2\2\2\u0727\u06ff\3\2\2\2\u0727\u0700\3\2"+
		"\2\2\u0727\u0701\3\2\2\2\u0727\u0702\3\2\2\2\u0727\u0703\3\2\2\2\u0727"+
		"\u0704\3\2\2\2\u0727\u0705\3\2\2\2\u0727\u0706\3\2\2\2\u0727\u0707\3\2"+
		"\2\2\u0727\u0708\3\2\2\2\u0727\u0709\3\2\2\2\u0727\u070a\3\2\2\2\u0727"+
		"\u070b\3\2\2\2\u0727\u070c\3\2\2\2\u0727\u070d\3\2\2\2\u0727\u070e\3\2"+
		"\2\2\u0727\u070f\3\2\2\2\u0727\u0710\3\2\2\2\u0727\u0711\3\2\2\2\u0727"+
		"\u0712\3\2\2\2\u0727\u0713\3\2\2\2\u0727\u0714\3\2\2\2\u0727\u0715\3\2"+
		"\2\2\u0727\u0716\3\2\2\2\u0727\u0717\3\2\2\2\u0727\u0718\3\2\2\2\u0727"+
		"\u0719\3\2\2\2\u0727\u071a\3\2\2\2\u0727\u071b\3\2\2\2\u0727\u071c\3\2"+
		"\2\2\u0727\u071d\3\2\2\2\u0727\u071e\3\2\2\2\u0727\u071f\3\2\2\2\u0727"+
		"\u0720\3\2\2\2\u0727\u0721\3\2\2\2\u0727\u0722\3\2\2\2\u0727\u0723\3\2"+
		"\2\2\u0727\u0725\3\2\2\2\u0728\u00eb\3\2\2\2\u0729\u072a\t\20\2\2\u072a"+
		"\u00ed\3\2\2\2\u072b\u072c\t\21\2\2\u072c\u00ef\3\2\2\2\u072d\u072e\7"+
		"[\2\2\u072e\u072f\7\24\2\2\u072f\u0730\5\u00f2z\2\u0730\u0731\7\25\2\2"+
		"\u0731\u00f1\3\2\2\2\u0732\u0733\7\24\2\2\u0733\u0734\5\u00f2z\2\u0734"+
		"\u0735\7\25\2\2\u0735\u073c\3\2\2\2\u0736\u0737\7\3\2\2\u0737\u0738\5"+
		"\u00f2z\2\u0738\u0739\7\4\2\2\u0739\u073c\3\2\2\2\u073a\u073c\5\u00fa"+
		"~\2\u073b\u0732\3\2\2\2\u073b\u0736\3\2\2\2\u073b\u073a\3\2\2\2\u073c"+
		"\u073d\3\2\2\2\u073d\u073b\3\2\2\2\u073d\u073e\3\2\2\2\u073e\u00f3\3\2"+
		"\2\2\u073f\u0740\n\22\2\2\u0740\u00f5\3\2\2\2\u0741\u0742\n\23\2\2\u0742"+
		"\u00f7\3\2\2\2\u0743\u0744\n\24\2\2\u0744\u00f9\3\2\2\2\u0745\u0746\n"+
		"\25\2\2\u0746\u00fb\3\2\2\2\u0747\u0748\n\26\2\2\u0748\u00fd\3\2\2\2\u0749"+
		"\u074a\n\27\2\2\u074a\u00ff\3\2\2\2\u074b\u074c\n\30\2\2\u074c\u0101\3"+
		"\2\2\2\u074d\u074e\n\31\2\2\u074e\u0103\3\2\2\2\u074f\u0750\n\32\2\2\u0750"+
		"\u0105\3\2\2\2\u0751\u0752\n\23\2\2\u0752\u0107\3\2\2\2\u0753\u0754\13"+
		"\2\2\2\u0754\u0109\3\2\2\2\u0755\u0756\5\u010c\u0087\2\u0756\u0758\7\3"+
		"\2\2\u0757\u0759\5\u009aN\2\u0758\u0757\3\2\2\2\u0758\u0759\3\2\2\2\u0759"+
		"\u075a\3\2\2\2\u075a\u075b\7\4\2\2\u075b\u0768\3\2\2\2\u075c\u075e\5\u010c"+
		"\u0087\2\u075d\u075f\7y\2\2\u075e\u075d\3\2\2\2\u075e\u075f\3\2\2\2\u075f"+
		"\u0760\3\2\2\2\u0760\u0762\7\23\2\2\u0761\u0763\7y\2\2\u0762\u0761\3\2"+
		"\2\2\u0762\u0763\3\2\2\2\u0763\u0764\3\2\2\2\u0764\u0765\5\u00d4k\2\u0765"+
		"\u0768\3\2\2\2\u0766\u0768\5\u010c\u0087\2\u0767\u0755\3\2\2\2\u0767\u075c"+
		"\3\2\2\2\u0767\u0766\3\2\2\2\u0768\u010b\3\2\2\2\u0769\u076b\5\u0096L"+
		"\2\u076a\u0769\3\2\2\2\u076a\u076b\3\2\2\2\u076b\u076c\3\2\2\2\u076c\u076e"+
		"\5\u0092J\2\u076d\u076f\5\u010e\u0088\2\u076e\u076d\3\2\2\2\u076e\u076f"+
		"\3\2\2\2\u076f\u010d\3\2\2\2\u0770\u0772\7%\2\2\u0771\u0773\5\u009eP\2"+
		"\u0772\u0771\3\2\2\2\u0772\u0773\3\2\2\2\u0773\u0774\3\2\2\2\u0774\u0777"+
		"\7&\2\2\u0775\u0777\5\u008cG\2\u0776\u0770\3\2\2\2\u0776\u0775\3\2\2\2"+
		"\u0777\u010f\3\2\2\2\u010d\u0113\u0122\u012f\u0141\u0144\u0148\u014c\u0154"+
		"\u0156\u015c\u0168\u016d\u0170\u0173\u0178\u0180\u0186\u018c\u01a0\u01ab"+
		"\u01b3\u01bd\u01c6\u01c8\u01ce\u01d3\u01d7\u01dc\u01e5\u01e7\u01eb\u01f2"+
		"\u01f6\u01fc\u0200\u0207\u0212\u021a\u0220\u0225\u022c\u0233\u0247\u024b"+
		"\u0252\u0258\u025d\u0263\u026a\u026f\u0273\u0276\u0279\u027d\u028c\u028f"+
		"\u0295\u0298\u029e\u02a3\u02aa\u02b0\u02b5\u02bd\u02c1\u02c5\u02c9\u02ce"+
		"\u02d2\u02d9\u02df\u02e6\u02ea\u02f0\u02f3\u02fa\u02fd\u0308\u030f\u0315"+
		"\u0320\u032a\u0333\u0338\u033e\u0342\u0345\u0348\u034b\u034e\u0352\u0357"+
		"\u035b\u035f\u0368\u036b\u036f\u0372\u0375\u0378\u037a\u037f\u0383\u0386"+
		"\u0389\u038f\u0393\u0397\u039e\u03a1\u03a8\u03ae\u03b2\u03b8\u03bb\u03c8"+
		"\u03cc\u03cf\u03d4\u03dc\u03de\u03e4\u03ec\u03f0\u03f8\u03fa\u03fe\u0403"+
		"\u0406\u0411\u0415\u0419\u041e\u0421\u0424\u042a\u042d\u0431\u0435\u043a"+
		"\u043c\u043f\u0446\u044c\u0452\u0456\u045f\u0465\u046c\u0470\u0476\u047d"+
		"\u0484\u0489\u0490\u0497\u049e\u04a5\u04aa\u04b0\u04b7\u04bb\u04c1\u04c8"+
		"\u04cc\u04d2\u04d9\u04dd\u04e3\u04ea\u04ee\u04f4\u04fb\u04ff\u0505\u050c"+
		"\u0511\u0517\u051e\u0523\u0529\u0530\u0534\u053a\u0541\u0545\u054b\u0552"+
		"\u0556\u0561\u0569\u0573\u0579\u057f\u0586\u058b\u0590\u0596\u059d\u05a2"+
		"\u05a6\u05ac\u05b5\u05c0\u05c5\u05cd\u05d8\u05dc\u05e2\u05e8\u05f1\u05f6"+
		"\u05fc\u0600\u0604\u060a\u060f\u0616\u0622\u0626\u062e\u0632\u0639\u063d"+
		"\u063f\u0646\u064d\u0652\u0656\u065b\u0662\u0667\u066d\u0672\u0676\u067b"+
		"\u0682\u0687\u068d\u0691\u0698\u069d\u06a4\u06a9\u06af\u06b4\u06bb\u06c0"+
		"\u06c2\u06ca\u06dd\u06e3\u06e9\u06ee\u06f2\u06fd\u0727\u073b\u073d\u0758"+
		"\u075e\u0762\u0767\u076a\u076e\u0772\u0776";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}