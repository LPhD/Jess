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
		T__59=60, T__60=61, IF=62, ELSE=63, FOR=64, WHILE=65, BREAK=66, CASE=67, 
		CONTINUE=68, SWITCH=69, DO=70, GOTO=71, RETURN=72, TYPEDEF=73, STATIC=74, 
		VOID=75, UNSIGNED=76, SIGNED=77, CV_QUALIFIER=78, VIRTUAL=79, TRY=80, 
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
		RULE_pre_diagnostic = 26, RULE_pre_other = 27, RULE_pre_include = 28, 
		RULE_pre_include_next = 29, RULE_pre_include_system_header = 30, RULE_pre_include_local_file = 31, 
		RULE_pre_include_filename = 32, RULE_pre_line = 33, RULE_pre_pragma = 34, 
		RULE_custom = 35, RULE_asciiTab = 36, RULE_externC = 37, RULE_macroFunctionPointer = 38, 
		RULE_testStart = 39, RULE_testEnd = 40, RULE_function_def = 41, RULE_return_type = 42, 
		RULE_function_param_list = 43, RULE_parameter_decl_clause = 44, RULE_parameter_decl = 45, 
		RULE_parameter_id = 46, RULE_compound_statement = 47, RULE_ctor_list = 48, 
		RULE_ctor_initializer = 49, RULE_initializer_id = 50, RULE_ctor_expr = 51, 
		RULE_function_name = 52, RULE_exception_specification = 53, RULE_type_id_list = 54, 
		RULE_simple_decl = 55, RULE_var_decl = 56, RULE_special_datatype = 57, 
		RULE_init_declarator_list = 58, RULE_initializer = 59, RULE_initializer_list = 60, 
		RULE_class_def = 61, RULE_class_name = 62, RULE_base_classes = 63, RULE_base_class = 64, 
		RULE_type_name = 65, RULE_base_type = 66, RULE_param_decl_specifiers = 67, 
		RULE_parameter_name = 68, RULE_param_type_list = 69, RULE_param_type = 70, 
		RULE_param_type_id = 71, RULE_identifier = 72, RULE_number = 73, RULE_ptrs = 74, 
		RULE_func_ptrs = 75, RULE_expr = 76, RULE_assign_expr = 77, RULE_conditional_expression = 78, 
		RULE_or_expression = 79, RULE_and_expression = 80, RULE_inclusive_or_expression = 81, 
		RULE_exclusive_or_expression = 82, RULE_bit_and_expression = 83, RULE_equality_expression = 84, 
		RULE_relational_expression = 85, RULE_shift_expression = 86, RULE_additive_expression = 87, 
		RULE_multiplicative_expression = 88, RULE_cast_expression = 89, RULE_cast_target = 90, 
		RULE_unary_expression = 91, RULE_new_expression = 92, RULE_unary_op_and_cast_expr = 93, 
		RULE_sizeof_expression = 94, RULE_sizeof = 95, RULE_defined_expression = 96, 
		RULE_sizeof_operand = 97, RULE_sizeof_operand2 = 98, RULE_inc_dec = 99, 
		RULE_postfix_expression = 100, RULE_function_argument_list = 101, RULE_function_argument = 102, 
		RULE_primary_expression = 103, RULE_comment = 104, RULE_newline = 105, 
		RULE_unary_operator = 106, RULE_relational_operator = 107, RULE_constant = 108, 
		RULE_function_decl_specifiers = 109, RULE_ptr_operator = 110, RULE_access_specifier = 111, 
		RULE_operator = 112, RULE_assignment_operator = 113, RULE_equality_operator = 114, 
		RULE_template_decl_start = 115, RULE_template_param_list = 116, RULE_no_brackets = 117, 
		RULE_no_brackets_curlies_or_squares = 118, RULE_no_brackets_or_semicolon = 119, 
		RULE_no_angle_brackets_or_brackets = 120, RULE_no_curlies = 121, RULE_no_squares = 122, 
		RULE_no_squares_or_semicolon = 123, RULE_no_comma_or_semicolon = 124, 
		RULE_assign_water = 125, RULE_assign_water_l2 = 126, RULE_water = 127, 
		RULE_init_declarator = 128, RULE_declarator = 129, RULE_type_suffix = 130;
	public static final String[] ruleNames = {
		"statements", "statement", "opening_curly", "closing_curly", "block_starter", 
		"selection_or_iteration", "for_init_statement", "jump_statement", "label", 
		"expr_statement", "condition", "pre_statement", "pre_blockstarter", "pre_if_statement", 
		"pre_elif_statement", "pre_else_statement", "pre_endif_statement", "pre_if_condition", 
		"pre_command", "pre_define", "pre_undef", "pre_macro_identifier", "keyword", 
		"pre_macro_parameters", "pre_macro", "macroCall", "pre_diagnostic", "pre_other", 
		"pre_include", "pre_include_next", "pre_include_system_header", "pre_include_local_file", 
		"pre_include_filename", "pre_line", "pre_pragma", "custom", "asciiTab", 
		"externC", "macroFunctionPointer", "testStart", "testEnd", "function_def", 
		"return_type", "function_param_list", "parameter_decl_clause", "parameter_decl", 
		"parameter_id", "compound_statement", "ctor_list", "ctor_initializer", 
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
		"type_suffix"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "';'", "':'", "'='", "'inline'", "'explicit'", "'friend'", 
		"'public'", "'private'", "'protected'", "'long'", "','", "'<'", "'>'", 
		"'.'", "'-'", "'/'", "'extern'", "'\"C\"'", "'START_TEST'", "'*'", "'::'", 
		"'char'", "'int'", "'restrict'", "'?'", "'||'", "'&&'", "'|'", "'^'", 
		"'&'", "'<<'", "'>>'", "'+'", "'%'", "'['", "']'", "'sizeof'", "'defined'", 
		"'--'", "'++'", "'->'", "'~'", "'!'", "'<='", "'>='", "'delete'", "'+='", 
		"'-='", "'*='", "'/='", "'%='", "'^='", "'&='", "'|='", "'>>='", "'<<='", 
		"'=='", "'!='", "'->*'", "'if'", "'else'", "'for'", "'while'", "'break'", 
		"'case'", "'continue'", "'switch'", "'do'", "'goto'", "'return'", "'typedef'", 
		"'static'", "'void'", "'unsigned'", "'signed'", null, "'virtual'", "'try'", 
		"'catch'", "'throw'", "'using'", "'namespace'", "'auto'", "'register'", 
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
		null, null, "IF", "ELSE", "FOR", "WHILE", "BREAK", "CASE", "CONTINUE", 
		"SWITCH", "DO", "GOTO", "RETURN", "TYPEDEF", "STATIC", "VOID", "UNSIGNED", 
		"SIGNED", "CV_QUALIFIER", "VIRTUAL", "TRY", "CATCH", "THROW", "USING", 
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
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << IF) | (1L << ELSE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(262);
				statement();
				}
				}
				setState(267);
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
		public Pre_statementContext pre_statement() {
			return getRuleContext(Pre_statementContext.class,0);
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
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				opening_curly();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				closing_curly();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				pre_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(271);
				block_starter();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(272);
				jump_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(273);
				label();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(274);
				simple_decl();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(275);
				expr_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(276);
				comment();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(277);
				newline();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(278);
				custom();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(279);
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
			setState(282);
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
			setState(284);
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
			setState(286);
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
			setState(332);
			switch (_input.LA(1)) {
			case TRY:
				_localctx = new Try_statementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(TRY);
				}
				break;
			case CATCH:
				_localctx = new Catch_statementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				match(CATCH);
				setState(290);
				match(T__0);
				setState(293);
				switch (_input.LA(1)) {
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__21:
				case T__23:
				case T__24:
				case T__31:
				case STATIC:
				case VOID:
				case UNSIGNED:
				case SIGNED:
				case CV_QUALIFIER:
				case VIRTUAL:
				case AUTO:
				case REGISTER:
				case SPECIAL_DATA:
				case OPERATOR:
				case CLASS_KEY:
				case NEW:
				case ALPHA_NUMERIC:
				case HEX_LITERAL:
				case DECIMAL_LITERAL:
				case OCTAL_LITERAL:
				case FLOATING_POINT_LITERAL:
				case CHAR:
				case STRING:
					{
					setState(291);
					param_type();
					}
					break;
				case ELLIPSIS:
					{
					setState(292);
					match(ELLIPSIS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(295);
				match(T__1);
				}
				break;
			case IF:
				_localctx = new If_statementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				match(IF);
				setState(297);
				match(T__0);
				setState(298);
				condition();
				setState(299);
				match(T__1);
				}
				break;
			case ELSE:
				_localctx = new Else_statementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(301);
				match(ELSE);
				}
				break;
			case SWITCH:
				_localctx = new Switch_statementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(302);
				match(SWITCH);
				setState(303);
				match(T__0);
				setState(304);
				condition();
				setState(305);
				match(T__1);
				}
				break;
			case FOR:
				_localctx = new For_statementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(307);
				match(FOR);
				setState(308);
				match(T__0);
				setState(311);
				switch (_input.LA(1)) {
				case T__0:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__16:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case T__31:
				case T__34:
				case T__38:
				case T__39:
				case T__40:
				case T__41:
				case T__43:
				case T__44:
				case TYPEDEF:
				case STATIC:
				case VOID:
				case UNSIGNED:
				case SIGNED:
				case CV_QUALIFIER:
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
					{
					setState(309);
					for_init_statement();
					}
					break;
				case T__2:
					{
					setState(310);
					match(T__2);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(314);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__16) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__31) | (1L << T__34) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (STATIC - 74)) | (1L << (VOID - 74)) | (1L << (UNSIGNED - 74)) | (1L << (SIGNED - 74)) | (1L << (CV_QUALIFIER - 74)) | (1L << (VIRTUAL - 74)) | (1L << (SPECIAL_DATA - 74)) | (1L << (OPERATOR - 74)) | (1L << (CLASS_KEY - 74)) | (1L << (NEW - 74)) | (1L << (ALPHA_NUMERIC - 74)) | (1L << (HEX_LITERAL - 74)) | (1L << (DECIMAL_LITERAL - 74)) | (1L << (OCTAL_LITERAL - 74)) | (1L << (FLOATING_POINT_LITERAL - 74)) | (1L << (CHAR - 74)) | (1L << (STRING - 74)))) != 0)) {
					{
					setState(313);
					condition();
					}
				}

				setState(316);
				match(T__2);
				setState(318);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__16) | (1L << T__21) | (1L << T__22) | (1L << T__31) | (1L << T__34) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NEW - 91)) | (1L << (ALPHA_NUMERIC - 91)) | (1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)) | (1L << (FLOATING_POINT_LITERAL - 91)) | (1L << (CHAR - 91)) | (1L << (STRING - 91)))) != 0)) {
					{
					setState(317);
					expr();
					}
				}

				setState(320);
				match(T__1);
				setState(322);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(321);
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
				setState(324);
				match(DO);
				}
				break;
			case WHILE:
				_localctx = new While_statementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(325);
				match(WHILE);
				setState(326);
				match(T__0);
				setState(327);
				condition();
				setState(328);
				match(T__1);
				setState(330);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(329);
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
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				simple_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				expr();
				setState(336);
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
			setState(358);
			switch (_input.LA(1)) {
			case BREAK:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				match(BREAK);
				setState(341);
				match(T__2);
				}
				break;
			case CONTINUE:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				match(CONTINUE);
				setState(343);
				match(T__2);
				}
				break;
			case GOTO:
				_localctx = new GotoStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
				match(GOTO);
				setState(345);
				identifier();
				setState(346);
				match(T__2);
				}
				break;
			case RETURN:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(348);
				match(RETURN);
				setState(350);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__16) | (1L << T__21) | (1L << T__22) | (1L << T__31) | (1L << T__34) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NEW - 91)) | (1L << (ALPHA_NUMERIC - 91)) | (1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)) | (1L << (FLOATING_POINT_LITERAL - 91)) | (1L << (CHAR - 91)) | (1L << (STRING - 91)))) != 0)) {
					{
					setState(349);
					expr();
					}
				}

				setState(352);
				match(T__2);
				}
				break;
			case THROW:
				_localctx = new ThrowStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(353);
				match(THROW);
				setState(355);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__16) | (1L << T__21) | (1L << T__22) | (1L << T__31) | (1L << T__34) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NEW - 91)) | (1L << (ALPHA_NUMERIC - 91)) | (1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)) | (1L << (FLOATING_POINT_LITERAL - 91)) | (1L << (CHAR - 91)) | (1L << (STRING - 91)))) != 0)) {
					{
					setState(354);
					expr();
					}
				}

				setState(357);
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
			setState(361);
			_la = _input.LA(1);
			if (_la==CASE) {
				{
				setState(360);
				match(CASE);
				}
			}

			setState(366);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case NEW:
			case ALPHA_NUMERIC:
				{
				setState(363);
				identifier();
				}
				break;
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
				{
				setState(364);
				number();
				}
				break;
			case CHAR:
				{
				setState(365);
				match(CHAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(368);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__16) | (1L << T__21) | (1L << T__22) | (1L << T__31) | (1L << T__34) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NEW - 91)) | (1L << (ALPHA_NUMERIC - 91)) | (1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)) | (1L << (FLOATING_POINT_LITERAL - 91)) | (1L << (CHAR - 91)) | (1L << (STRING - 91)))) != 0)) {
				{
				setState(370);
				expr();
				}
			}

			setState(373);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
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
		int _la;
		try {
			setState(399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				type_name();
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(377);
					match(NEWLINE);
					}
					}
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(383);
				declarator();
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(384);
					match(NEWLINE);
					}
					}
					setState(389);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(390);
				match(T__4);
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(391);
					match(NEWLINE);
					}
					}
					setState(396);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(397);
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
			setState(403);
			switch (_input.LA(1)) {
			case PRE_IF:
			case PRE_ELIF:
			case PRE_ELSE:
			case PRE_ENDIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
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
				setState(402);
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
			setState(409);
			switch (_input.LA(1)) {
			case PRE_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				pre_if_statement();
				}
				break;
			case PRE_ELIF:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				pre_elif_statement();
				}
				break;
			case PRE_ELSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(407);
				pre_else_statement();
				}
				break;
			case PRE_ENDIF:
				enterOuterAlt(_localctx, 4);
				{
				setState(408);
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
			setState(411);
			match(PRE_IF);
			setState(412);
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
			setState(415);
			match(PRE_ELIF);
			setState(416);
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
			setState(419);
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
			setState(421);
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
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				match(T__0);
				setState(425);
				condition();
				setState(426);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(428);
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
			setState(439);
			switch (_input.LA(1)) {
			case PRE_DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				pre_define();
				}
				break;
			case PRE_UNDEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				pre_undef();
				}
				break;
			case PRE_DIAGNOSTIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(433);
				pre_diagnostic();
				}
				break;
			case PRE_OTHER:
			case PRE_ATTRIBUTE:
				enterOuterAlt(_localctx, 4);
				{
				setState(434);
				pre_other();
				}
				break;
			case PRE_INCLUDE:
				enterOuterAlt(_localctx, 5);
				{
				setState(435);
				pre_include();
				}
				break;
			case PRE_INCLUDE_NEXT:
				enterOuterAlt(_localctx, 6);
				{
				setState(436);
				pre_include_next();
				}
				break;
			case PRE_LINE:
				enterOuterAlt(_localctx, 7);
				{
				setState(437);
				pre_line();
				}
				break;
			case PRE_PRAGMA:
				enterOuterAlt(_localctx, 8);
				{
				setState(438);
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
		public TerminalNode PRE_DEFINE() { return getToken(FunctionParser.PRE_DEFINE, 0); }
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
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				match(PRE_DEFINE);
				setState(442);
				pre_macro_identifier();
				setState(443);
				match(T__0);
				setState(444);
				pre_macro_parameters();
				setState(445);
				match(T__1);
				setState(446);
				pre_macro();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				match(PRE_DEFINE);
				setState(449);
				pre_macro_identifier();
				setState(450);
				pre_macro();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(452);
				match(PRE_DEFINE);
				setState(453);
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
			setState(456);
			match(PRE_UNDEF);
			setState(457);
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
			setState(462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(461);
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
			setState(464);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (STATIC - 74)) | (1L << (VOID - 74)) | (1L << (UNSIGNED - 74)) | (1L << (SIGNED - 74)) | (1L << (VIRTUAL - 74)) | (1L << (OPERATOR - 74)) | (1L << (CLASS_KEY - 74)))) != 0)) ) {
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
			setState(468);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case NEW:
			case ALPHA_NUMERIC:
				{
				setState(466);
				identifier();
				}
				break;
			case ELLIPSIS:
				{
				setState(467);
				match(ELLIPSIS);
				}
				break;
			case T__1:
			case T__12:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(470);
				match(T__12);
				setState(473);
				switch (_input.LA(1)) {
				case T__8:
				case T__9:
				case T__10:
				case NEW:
				case ALPHA_NUMERIC:
					{
					setState(471);
					identifier();
					}
					break;
				case ELLIPSIS:
					{
					setState(472);
					match(ELLIPSIS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(479);
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
			setState(482);
			pre_macro_identifier();
			setState(483);
			match(T__0);
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__16) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__31) | (1L << T__34) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (STATIC - 74)) | (1L << (VOID - 74)) | (1L << (UNSIGNED - 74)) | (1L << (SIGNED - 74)) | (1L << (CV_QUALIFIER - 74)) | (1L << (VIRTUAL - 74)) | (1L << (SPECIAL_DATA - 74)) | (1L << (OPERATOR - 74)) | (1L << (CLASS_KEY - 74)) | (1L << (NEW - 74)) | (1L << (ALPHA_NUMERIC - 74)) | (1L << (HEX_LITERAL - 74)) | (1L << (DECIMAL_LITERAL - 74)) | (1L << (OCTAL_LITERAL - 74)) | (1L << (FLOATING_POINT_LITERAL - 74)) | (1L << (CHAR - 74)) | (1L << (STRING - 74)) | (1L << (NEWLINE - 74)))) != 0)) {
					{
					setState(489);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						setState(484);
						match(T__12);
						}
						break;
					case 2:
						{
						setState(485);
						type_name();
						}
						break;
					case 3:
						{
						setState(486);
						expr();
						}
						break;
					case 4:
						{
						setState(487);
						ptr_operator();
						}
						break;
					case 5:
						{
						setState(488);
						match(NEWLINE);
						}
						break;
					}
					}
					setState(493);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(494);
				match(VOID);
				}
				break;
			}
			setState(497);
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
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				match(PRE_DIAGNOSTIC);
				setState(500);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
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
		public List<Pre_macro_identifierContext> pre_macro_identifier() {
			return getRuleContexts(Pre_macro_identifierContext.class);
		}
		public Pre_macro_identifierContext pre_macro_identifier(int i) {
			return getRuleContext(Pre_macro_identifierContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
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
			setState(535);
			switch (_input.LA(1)) {
			case PRE_OTHER:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				match(PRE_OTHER);
				setState(506);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(505);
					match(STRING);
					}
					break;
				}
				}
				break;
			case PRE_ATTRIBUTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				match(PRE_ATTRIBUTE);
				setState(509);
				match(T__0);
				setState(510);
				match(T__0);
				setState(512);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (STATIC - 74)) | (1L << (VOID - 74)) | (1L << (UNSIGNED - 74)) | (1L << (SIGNED - 74)) | (1L << (VIRTUAL - 74)) | (1L << (OPERATOR - 74)) | (1L << (CLASS_KEY - 74)) | (1L << (NEW - 74)) | (1L << (ALPHA_NUMERIC - 74)) | (1L << (HEX_LITERAL - 74)) | (1L << (DECIMAL_LITERAL - 74)) | (1L << (OCTAL_LITERAL - 74)) | (1L << (FLOATING_POINT_LITERAL - 74)) | (1L << (CHAR - 74)) | (1L << (STRING - 74)))) != 0)) {
					{
					setState(511);
					pre_macro_identifier();
					}
				}

				setState(515);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(514);
					match(NEWLINE);
					}
				}

				setState(531);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(517);
					match(T__0);
					setState(518);
					pre_macro_identifier();
					setState(526);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(519);
						match(T__12);
						setState(521);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(520);
							match(NEWLINE);
							}
						}

						setState(523);
						pre_macro_identifier();
						}
						}
						setState(528);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(529);
					match(T__1);
					}
				}

				setState(533);
				match(T__1);
				setState(534);
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

	public static class Pre_includeContext extends ParserRuleContext {
		public TerminalNode PRE_INCLUDE() { return getToken(FunctionParser.PRE_INCLUDE, 0); }
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_include(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_include(this);
		}
	}

	public final Pre_includeContext pre_include() throws RecognitionException {
		Pre_includeContext _localctx = new Pre_includeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_pre_include);
		try {
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				match(PRE_INCLUDE);
				setState(538);
				pre_include_system_header();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(539);
				match(PRE_INCLUDE);
				setState(540);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(541);
				match(PRE_INCLUDE);
				setState(542);
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
		public TerminalNode PRE_INCLUDE_NEXT() { return getToken(FunctionParser.PRE_INCLUDE_NEXT, 0); }
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_include_next(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_include_next(this);
		}
	}

	public final Pre_include_nextContext pre_include_next() throws RecognitionException {
		Pre_include_nextContext _localctx = new Pre_include_nextContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_pre_include_next);
		try {
			setState(551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				match(PRE_INCLUDE_NEXT);
				setState(546);
				pre_include_system_header();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
				match(PRE_INCLUDE_NEXT);
				setState(548);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(549);
				match(PRE_INCLUDE_NEXT);
				setState(550);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_include_system_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_include_system_header(this);
		}
	}

	public final Pre_include_system_headerContext pre_include_system_header() throws RecognitionException {
		Pre_include_system_headerContext _localctx = new Pre_include_system_headerContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_pre_include_system_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			match(T__13);
			setState(554);
			pre_include_filename();
			setState(555);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 62, RULE_pre_include_local_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
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
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(FunctionParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(FunctionParser.ALPHA_NUMERIC, i);
		}
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
		enterRule(_localctx, 64, RULE_pre_include_filename);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(559);
				match(STRING);
				}
				break;
			case T__15:
			case T__16:
			case T__17:
			case ALPHA_NUMERIC:
				{
				setState(561); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(560);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17))) != 0) || _la==ALPHA_NUMERIC) ) {
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
					setState(563); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		enterRule(_localctx, 66, RULE_pre_line);
		try {
			setState(581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
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
		enterRule(_localctx, 68, RULE_pre_pragma);
		int _la;
		try {
			int _alt;
			setState(607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
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
				setState(596); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(595);
						identifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(598); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(600);
				match(PRE_PRAGMA);
				setState(602);
				_la = _input.LA(1);
				if (_la==PRE_GCC) {
					{
					setState(601);
					match(PRE_GCC);
					}
				}

				setState(604);
				match(PRE_PRAGMA_KEYWORDS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(605);
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
		enterRule(_localctx, 70, RULE_custom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(609);
				asciiTab();
				}
				break;
			case 2:
				{
				setState(610);
				externC();
				}
				break;
			case 3:
				{
				setState(611);
				macroFunctionPointer();
				}
				break;
			case 4:
				{
				setState(612);
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
		enterRule(_localctx, 72, RULE_asciiTab);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(618); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(615);
					pre_macro_identifier();
					setState(616);
					match(T__12);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(620); 
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
		enterRule(_localctx, 74, RULE_externC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(T__18);
			setState(623);
			match(T__19);
			setState(625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(624);
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
		enterRule(_localctx, 76, RULE_macroFunctionPointer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			macroCall();
			setState(629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(628);
				match(NEWLINE);
				}
				break;
			}
			setState(632);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(631);
				pre_macro_identifier();
				}
				break;
			}
			setState(635);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(634);
				match(NEWLINE);
				}
			}

			setState(637);
			macroCall();
			setState(639);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(638);
				match(NEWLINE);
				}
			}

			setState(641);
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
		enterRule(_localctx, 78, RULE_testStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			match(T__20);
			setState(644);
			match(T__0);
			setState(645);
			function_name();
			setState(646);
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
		enterRule(_localctx, 80, RULE_testEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFunction_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFunction_def(this);
		}
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_function_def);
		int _la;
		try {
			int _alt;
			setState(684);
			switch (_input.LA(1)) {
			case T__0:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__21:
			case T__23:
			case T__24:
			case T__31:
			case STATIC:
			case VOID:
			case UNSIGNED:
			case SIGNED:
			case CV_QUALIFIER:
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
				setState(651);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(650);
					template_decl_start();
					}
				}

				setState(656);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(653);
						match(NEWLINE);
						}
						} 
					}
					setState(658);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
				setState(660);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(659);
					return_type();
					}
					break;
				}
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(662);
					match(NEWLINE);
					}
					}
					setState(667);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(668);
				function_name();
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(669);
					match(NEWLINE);
					}
					}
					setState(674);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(675);
				function_param_list();
				setState(677);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(676);
					ctor_list();
					}
				}

				setState(679);
				compound_statement();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(681);
				testStart();
				setState(682);
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
		enterRule(_localctx, 84, RULE_return_type);
		int _la;
		try {
			int _alt;
			setState(707);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(689);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(686);
						function_decl_specifiers();
						}
						} 
					}
					setState(691);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				}
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(692);
					match(NEWLINE);
					}
					}
					setState(697);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(698);
				type_name();
				}
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21 || _la==T__31) {
					{
					{
					setState(700);
					ptr_operator();
					}
					}
					setState(705);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(706);
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
		enterRule(_localctx, 86, RULE_function_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			match(T__0);
			setState(711);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__31))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (STATIC - 74)) | (1L << (VOID - 74)) | (1L << (UNSIGNED - 74)) | (1L << (SIGNED - 74)) | (1L << (CV_QUALIFIER - 74)) | (1L << (VIRTUAL - 74)) | (1L << (AUTO - 74)) | (1L << (REGISTER - 74)) | (1L << (SPECIAL_DATA - 74)) | (1L << (OPERATOR - 74)) | (1L << (CLASS_KEY - 74)) | (1L << (NEW - 74)) | (1L << (ALPHA_NUMERIC - 74)) | (1L << (HEX_LITERAL - 74)) | (1L << (DECIMAL_LITERAL - 74)) | (1L << (OCTAL_LITERAL - 74)) | (1L << (FLOATING_POINT_LITERAL - 74)) | (1L << (CHAR - 74)) | (1L << (STRING - 74)))) != 0)) {
				{
				setState(710);
				parameter_decl_clause();
				}
			}

			setState(713);
			match(T__1);
			setState(715);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(714);
				match(T__21);
				}
			}

			setState(720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CV_QUALIFIER) {
				{
				{
				setState(717);
				match(CV_QUALIFIER);
				}
				}
				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(724);
			_la = _input.LA(1);
			if (_la==THROW) {
				{
				setState(723);
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
		enterRule(_localctx, 88, RULE_parameter_decl_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(726);
			parameter_decl();
			setState(737);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(727);
					match(T__12);
					setState(731);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(728);
						match(NEWLINE);
						}
						}
						setState(733);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(734);
					parameter_decl();
					}
					} 
				}
				setState(739);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			}
			setState(748);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(740);
				match(T__12);
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
		enterRule(_localctx, 90, RULE_parameter_decl);
		try {
			setState(754);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(750);
				match(VOID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(751);
				param_decl_specifiers();
				setState(752);
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
		enterRule(_localctx, 92, RULE_parameter_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			_la = _input.LA(1);
			if (_la==T__21 || _la==T__31) {
				{
				setState(756);
				ptrs();
				}
			}

			setState(764);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(759);
				match(T__0);
				setState(760);
				parameter_id();
				setState(761);
				match(T__1);
				}
				break;
			case T__8:
			case T__9:
			case T__10:
			case NEW:
			case ALPHA_NUMERIC:
				{
				setState(763);
				parameter_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(767);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__36) {
				{
				setState(766);
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
		enterRule(_localctx, 94, RULE_compound_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
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
		enterRule(_localctx, 96, RULE_ctor_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			match(T__3);
			setState(773);
			ctor_initializer();
			setState(778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(774);
				match(T__12);
				setState(775);
				ctor_initializer();
				}
				}
				setState(780);
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
		enterRule(_localctx, 98, RULE_ctor_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			initializer_id();
			setState(782);
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
		enterRule(_localctx, 100, RULE_initializer_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(784);
				match(T__22);
				}
			}

			setState(787);
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
		enterRule(_localctx, 102, RULE_ctor_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			match(T__0);
			setState(791);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__16) | (1L << T__21) | (1L << T__22) | (1L << T__31) | (1L << T__34) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NEW - 91)) | (1L << (ALPHA_NUMERIC - 91)) | (1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)) | (1L << (FLOATING_POINT_LITERAL - 91)) | (1L << (CHAR - 91)) | (1L << (STRING - 91)))) != 0)) {
				{
				setState(790);
				expr();
				}
			}

			setState(793);
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
		enterRule(_localctx, 104, RULE_function_name);
		try {
			setState(802);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(795);
				match(T__0);
				setState(796);
				function_name();
				setState(797);
				match(T__1);
				}
				break;
			case T__8:
			case T__9:
			case T__10:
			case NEW:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(799);
				identifier();
				}
				break;
			case OPERATOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(800);
				match(OPERATOR);
				setState(801);
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
		enterRule(_localctx, 106, RULE_exception_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			match(THROW);
			setState(805);
			match(T__0);
			setState(806);
			type_id_list();
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
		enterRule(_localctx, 108, RULE_type_id_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << IF) | (1L << ELSE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(809);
				no_brackets();
				}
				}
				setState(814);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(815);
				match(T__0);
				setState(816);
				type_id_list();
				setState(817);
				match(T__1);
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << IF) | (1L << ELSE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(818);
					no_brackets();
					}
					}
					setState(823);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
		enterRule(_localctx, 110, RULE_simple_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
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
		public TerminalNode NEWLINE() { return getToken(FunctionParser.NEWLINE, 0); }
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public TerminalNode TYPEDEF() { return getToken(FunctionParser.TYPEDEF, 0); }
		public Template_decl_startContext template_decl_start() {
			return getRuleContext(Template_decl_startContext.class,0);
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
		public TerminalNode NEWLINE() { return getToken(FunctionParser.NEWLINE, 0); }
		public TerminalNode TYPEDEF() { return getToken(FunctionParser.TYPEDEF, 0); }
		public Template_decl_startContext template_decl_start() {
			return getRuleContext(Template_decl_startContext.class,0);
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
	public static class StructUnionEnumContext extends Var_declContext {
		public Special_datatypeContext special_datatype() {
			return getRuleContext(Special_datatypeContext.class,0);
		}
		public TerminalNode TYPEDEF() { return getToken(FunctionParser.TYPEDEF, 0); }
		public TerminalNode NEWLINE() { return getToken(FunctionParser.NEWLINE, 0); }
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
		enterRule(_localctx, 112, RULE_var_decl);
		int _la;
		try {
			setState(869);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				_localctx = new DeclByClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(832);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(831);
					match(TYPEDEF);
					}
				}

				setState(835);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(834);
					template_decl_start();
					}
				}

				}
				setState(837);
				class_def();
				setState(839);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(838);
					match(NEWLINE);
					}
					break;
				}
				setState(842);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(841);
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
				setState(845);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(844);
					match(TYPEDEF);
					}
				}

				setState(848);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(847);
					template_decl_start();
					}
				}

				}
				setState(850);
				type_name();
				setState(852);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(851);
					match(NEWLINE);
					}
				}

				setState(854);
				init_declarator_list();
				}
				break;
			case 3:
				_localctx = new StructUnionEnumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(857);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(856);
					match(TYPEDEF);
					}
				}

				setState(859);
				special_datatype();
				setState(861);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(860);
					match(NEWLINE);
					}
					break;
				}
				setState(864);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(863);
					init_declarator_list();
					}
					break;
				}
				setState(867);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(866);
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

	public static class Special_datatypeContext extends ParserRuleContext {
		public TerminalNode SPECIAL_DATA() { return getToken(FunctionParser.SPECIAL_DATA, 0); }
		public TerminalNode OPENING_CURLY() { return getToken(FunctionParser.OPENING_CURLY, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		enterRule(_localctx, 114, RULE_special_datatype);
		int _la;
		try {
			setState(879);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(871);
				match(SPECIAL_DATA);
				setState(873);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || _la==NEW || _la==ALPHA_NUMERIC) {
					{
					setState(872);
					identifier();
					}
				}

				setState(875);
				match(OPENING_CURLY);
				skipToEndOfObject(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(877);
				match(SPECIAL_DATA);
				setState(878);
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
		enterRule(_localctx, 116, RULE_init_declarator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			init_declarator();
			setState(889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(882);
				match(T__12);
				setState(884);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(883);
					match(NEWLINE);
					}
				}

				setState(886);
				init_declarator();
				}
				}
				setState(891);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(892);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_initializer);
		try {
			setState(901);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(894);
				assign_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(895);
				match(OPENING_CURLY);
				setState(896);
				initializer_list();
				setState(897);
				match(CLOSING_CURLY);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(899);
				match(OPENING_CURLY);
				setState(900);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public Initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterInitializer_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitInitializer_list(this);
		}
	}

	public final Initializer_listContext initializer_list() throws RecognitionException {
		Initializer_listContext _localctx = new Initializer_listContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_initializer_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
			initializer();
			setState(911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(904);
				match(T__12);
				setState(906);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(905);
					match(NEWLINE);
					}
				}

				setState(908);
				initializer();
				}
				}
				setState(913);
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
			setState(914);
			match(CLASS_KEY);
			setState(916);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || _la==NEW || _la==ALPHA_NUMERIC) {
				{
				setState(915);
				class_name();
				}
			}

			setState(919);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(918);
				base_classes();
				}
			}

			setState(921);
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
			setState(924);
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
			setState(926);
			match(T__3);
			setState(927);
			base_class();
			setState(932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(928);
				match(T__12);
				setState(929);
				base_class();
				}
				}
				setState(934);
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
			setState(936);
			_la = _input.LA(1);
			if (_la==VIRTUAL) {
				{
				setState(935);
				match(VIRTUAL);
				}
			}

			setState(939);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(938);
				access_specifier();
				}
				break;
			}
			setState(941);
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
			setState(983);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(949); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(949);
						switch (_input.LA(1)) {
						case T__5:
						case T__6:
						case T__7:
						case STATIC:
						case VIRTUAL:
							{
							setState(943);
							function_decl_specifiers();
							}
							break;
						case CV_QUALIFIER:
							{
							setState(944);
							match(CV_QUALIFIER);
							}
							break;
						case UNSIGNED:
							{
							setState(945);
							match(UNSIGNED);
							}
							break;
						case SIGNED:
							{
							setState(946);
							match(SIGNED);
							}
							break;
						case T__21:
						case T__31:
							{
							setState(947);
							ptr_operator();
							}
							break;
						case T__11:
						case T__23:
						case T__24:
						case VOID:
						case SPECIAL_DATA:
						case CLASS_KEY:
						case ALPHA_NUMERIC:
							{
							setState(948);
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
					setState(951); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(957);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(953);
					match(T__13);
					setState(954);
					template_param_list();
					setState(955);
					match(T__14);
					}
				}

				setState(969);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(959);
						match(T__22);
						setState(960);
						base_type();
						setState(965);
						_la = _input.LA(1);
						if (_la==T__13) {
							{
							setState(961);
							match(T__13);
							setState(962);
							template_param_list();
							setState(963);
							match(T__14);
							}
						}

						}
						} 
					}
					setState(971);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
				}
				setState(979);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(977);
						switch (_input.LA(1)) {
						case T__5:
						case T__6:
						case T__7:
						case STATIC:
						case VIRTUAL:
							{
							setState(972);
							function_decl_specifiers();
							}
							break;
						case CV_QUALIFIER:
							{
							setState(973);
							match(CV_QUALIFIER);
							}
							break;
						case UNSIGNED:
							{
							setState(974);
							match(UNSIGNED);
							}
							break;
						case SIGNED:
							{
							setState(975);
							match(SIGNED);
							}
							break;
						case T__21:
						case T__31:
							{
							setState(976);
							ptr_operator();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(981);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(982);
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
			setState(986); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(985);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__23) | (1L << T__24))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (VOID - 75)) | (1L << (SPECIAL_DATA - 75)) | (1L << (CLASS_KEY - 75)) | (1L << (ALPHA_NUMERIC - 75)))) != 0)) ) {
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
				setState(988); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
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
			setState(991);
			_la = _input.LA(1);
			if (_la==AUTO || _la==REGISTER) {
				{
				setState(990);
				_la = _input.LA(1);
				if ( !(_la==AUTO || _la==REGISTER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(993);
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
			setState(995);
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
			setState(1024);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(997);
				match(T__0);
				setState(999);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(998);
					match(NEWLINE);
					}
				}

				setState(1001);
				match(VOID);
				setState(1002);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1003);
				match(T__0);
				setState(1005);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1004);
					match(NEWLINE);
					}
				}

				setState(1021);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__31))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (STATIC - 74)) | (1L << (VOID - 74)) | (1L << (UNSIGNED - 74)) | (1L << (SIGNED - 74)) | (1L << (CV_QUALIFIER - 74)) | (1L << (VIRTUAL - 74)) | (1L << (AUTO - 74)) | (1L << (REGISTER - 74)) | (1L << (SPECIAL_DATA - 74)) | (1L << (OPERATOR - 74)) | (1L << (CLASS_KEY - 74)) | (1L << (NEW - 74)) | (1L << (ALPHA_NUMERIC - 74)) | (1L << (HEX_LITERAL - 74)) | (1L << (DECIMAL_LITERAL - 74)) | (1L << (OCTAL_LITERAL - 74)) | (1L << (FLOATING_POINT_LITERAL - 74)) | (1L << (CHAR - 74)) | (1L << (STRING - 74)))) != 0)) {
					{
					setState(1007);
					param_type();
					setState(1009);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1008);
						match(NEWLINE);
						}
					}

					setState(1018);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(1011);
						match(T__12);
						setState(1013);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(1012);
							match(NEWLINE);
							}
						}

						setState(1015);
						param_type();
						}
						}
						setState(1020);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1023);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			param_decl_specifiers();
			setState(1027);
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
			setState(1030);
			_la = _input.LA(1);
			if (_la==T__21 || _la==T__31) {
				{
				setState(1029);
				ptrs();
				}
			}

			setState(1045);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(1032);
				match(T__0);
				setState(1034);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(1033);
					match(NEWLINE);
					}
					break;
				}
				setState(1036);
				param_type_id();
				setState(1038);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1037);
					match(NEWLINE);
					}
				}

				setState(1040);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(1043);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || _la==NEW || _la==ALPHA_NUMERIC) {
					{
					setState(1042);
					parameter_name();
					}
				}

				}
				break;
			}
			setState(1048);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__36) {
				{
				setState(1047);
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
			setState(1060);
			switch (_input.LA(1)) {
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1050);
				match(ALPHA_NUMERIC);
				setState(1055);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1051);
						match(T__22);
						setState(1052);
						match(ALPHA_NUMERIC);
						}
						} 
					}
					setState(1057);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
				}
				}
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(1058);
				match(NEW);
				}
				break;
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(1059);
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
			setState(1062);
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
			setState(1068); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1064);
				ptr_operator();
				setState(1066);
				_la = _input.LA(1);
				if (_la==T__25) {
					{
					setState(1065);
					match(T__25);
					}
				}

				}
				}
				setState(1070); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__21 || _la==T__31 );
			}
		}
		catch (RecognitionException re) {
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
			setState(1072);
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
			setState(1074);
			assign_expr();
			setState(1079);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1075);
					match(ESCAPE);
					setState(1076);
					match(NEWLINE);
					}
					} 
				}
				setState(1081);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			}
			setState(1096);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(1085);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1082);
					match(NEWLINE);
					}
					}
					setState(1087);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1088);
				match(T__12);
				setState(1092);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1089);
					match(NEWLINE);
					}
					}
					setState(1094);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1095);
				expr();
				}
				break;
			}
			setState(1102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1098);
					match(ESCAPE);
					setState(1099);
					match(NEWLINE);
					}
					} 
				}
				setState(1104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
			setState(1105);
			conditional_expression();
			setState(1121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1106);
					match(NEWLINE);
					}
					}
					setState(1111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1112);
				assignment_operator();
				setState(1116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1113);
					match(NEWLINE);
					}
					}
					setState(1118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1119);
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
			setState(1154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				_localctx = new NormOrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1123);
				or_expression();
				}
				break;
			case 2:
				_localctx = new CndExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1124);
				or_expression();
				{
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
				match(T__26);
				setState(1135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1132);
					match(NEWLINE);
					}
					}
					setState(1137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1138);
				expr();
				setState(1142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1139);
					match(NEWLINE);
					}
					}
					setState(1144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1145);
				match(T__3);
				setState(1149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1146);
					match(NEWLINE);
					}
					}
					setState(1151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1152);
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
			setState(1156);
			and_expression();
			setState(1171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1157);
					match(NEWLINE);
					}
					}
					setState(1162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1163);
				match(T__27);
				setState(1167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1164);
					match(NEWLINE);
					}
					}
					setState(1169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1170);
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
			setState(1173);
			inclusive_or_expression();
			setState(1188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				{
				setState(1177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1174);
					match(NEWLINE);
					}
					}
					setState(1179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1180);
				match(T__28);
				setState(1184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1181);
					match(NEWLINE);
					}
					}
					setState(1186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1187);
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
			setState(1190);
			exclusive_or_expression();
			setState(1205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1191);
					match(NEWLINE);
					}
					}
					setState(1196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1197);
				match(T__29);
				setState(1201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1198);
					match(NEWLINE);
					}
					}
					setState(1203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1204);
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
			setState(1207);
			bit_and_expression();
			setState(1222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(1211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1208);
					match(NEWLINE);
					}
					}
					setState(1213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1214);
				match(T__30);
				setState(1218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1215);
					match(NEWLINE);
					}
					}
					setState(1220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1221);
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
			setState(1224);
			equality_expression();
			setState(1239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1225);
					match(NEWLINE);
					}
					}
					setState(1230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1231);
				match(T__31);
				setState(1235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1232);
					match(NEWLINE);
					}
					}
					setState(1237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1238);
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
			setState(1241);
			relational_expression();
			setState(1257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				{
				setState(1245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1242);
					match(NEWLINE);
					}
					}
					setState(1247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1248);
				equality_operator();
				setState(1252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1249);
					match(NEWLINE);
					}
					}
					setState(1254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1255);
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
			setState(1259);
			shift_expression();
			setState(1275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
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
				relational_operator();
				setState(1270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1267);
					match(NEWLINE);
					}
					}
					setState(1272);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1273);
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
			setState(1277);
			additive_expression();
			setState(1292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1278);
					match(NEWLINE);
					}
					}
					setState(1283);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1284);
				_la = _input.LA(1);
				if ( !(_la==T__32 || _la==T__33) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1285);
					match(NEWLINE);
					}
					}
					setState(1290);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1291);
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
			setState(1294);
			multiplicative_expression();
			setState(1309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1295);
					match(NEWLINE);
					}
					}
					setState(1300);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1301);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==T__34) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1302);
					match(NEWLINE);
					}
					}
					setState(1307);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1308);
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
			setState(1311);
			cast_expression();
			setState(1326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1312);
					match(NEWLINE);
					}
					}
					setState(1317);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1318);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__21) | (1L << T__35))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1319);
					match(NEWLINE);
					}
					}
					setState(1324);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1325);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterCast_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitCast_expression(this);
		}
	}

	public final Cast_expressionContext cast_expression() throws RecognitionException {
		Cast_expressionContext _localctx = new Cast_expressionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_cast_expression);
		try {
			setState(1334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1328);
				match(T__0);
				setState(1329);
				cast_target();
				setState(1330);
				match(T__1);
				setState(1331);
				cast_expression();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1333);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
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
		enterRule(_localctx, 180, RULE_cast_target);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1336);
			type_name();
			setState(1346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21 || _la==T__31 || _la==NEWLINE) {
				{
				{
				setState(1340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1337);
					match(NEWLINE);
					}
					}
					setState(1342);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1343);
				ptr_operator();
				}
				}
				setState(1348);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitUnary_expression(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_unary_expression);
		try {
			setState(1354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1349);
				unary_op_and_cast_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1350);
				sizeof_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1351);
				new_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1352);
				postfix_expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1353);
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
		enterRule(_localctx, 184, RULE_new_expression);
		int _la;
		try {
			setState(1402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1357);
				_la = _input.LA(1);
				if (_la==T__22) {
					{
					setState(1356);
					match(T__22);
					}
				}

				setState(1359);
				match(NEW);
				setState(1363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1360);
					match(NEWLINE);
					}
					}
					setState(1365);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1366);
				type_name();
				setState(1370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1367);
					match(NEWLINE);
					}
					}
					setState(1372);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1373);
				match(T__36);
				setState(1375);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__16) | (1L << T__21) | (1L << T__22) | (1L << T__31) | (1L << T__34) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NEW - 91)) | (1L << (ALPHA_NUMERIC - 91)) | (1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)) | (1L << (FLOATING_POINT_LITERAL - 91)) | (1L << (CHAR - 91)) | (1L << (STRING - 91)))) != 0)) {
					{
					setState(1374);
					conditional_expression();
					}
				}

				setState(1377);
				match(T__37);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1380);
				_la = _input.LA(1);
				if (_la==T__22) {
					{
					setState(1379);
					match(T__22);
					}
				}

				setState(1382);
				match(NEW);
				setState(1386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1383);
					match(NEWLINE);
					}
					}
					setState(1388);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1389);
				type_name();
				setState(1393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1390);
					match(NEWLINE);
					}
					}
					setState(1395);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1396);
				match(T__0);
				setState(1398);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__16) | (1L << T__21) | (1L << T__22) | (1L << T__31) | (1L << T__34) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NEW - 91)) | (1L << (ALPHA_NUMERIC - 91)) | (1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)) | (1L << (FLOATING_POINT_LITERAL - 91)) | (1L << (CHAR - 91)) | (1L << (STRING - 91)))) != 0)) {
					{
					setState(1397);
					expr();
					}
				}

				setState(1400);
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
		enterRule(_localctx, 186, RULE_unary_op_and_cast_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1404);
			unary_operator();
			setState(1408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1405);
				match(NEWLINE);
				}
				}
				setState(1410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1411);
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
		enterRule(_localctx, 188, RULE_sizeof_expression);
		int _la;
		try {
			setState(1433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1413);
				sizeof();
				setState(1417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1414);
					match(NEWLINE);
					}
					}
					setState(1419);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1420);
				match(T__0);
				setState(1421);
				sizeof_operand();
				setState(1422);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1424);
				sizeof();
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
		enterRule(_localctx, 190, RULE_sizeof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1435);
			match(T__38);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 192, RULE_defined_expression);
		int _la;
		try {
			setState(1456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1437);
				match(T__39);
				setState(1441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1438);
					match(NEWLINE);
					}
					}
					setState(1443);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1444);
				match(T__0);
				setState(1445);
				expr();
				setState(1446);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1448);
				match(T__39);
				setState(1452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1449);
					match(NEWLINE);
					}
					}
					setState(1454);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1455);
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
		enterRule(_localctx, 194, RULE_sizeof_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1458);
			type_name();
			setState(1468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21 || _la==T__31 || _la==NEWLINE) {
				{
				{
				setState(1462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1459);
					match(NEWLINE);
					}
					}
					setState(1464);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1465);
				ptr_operator();
				}
				}
				setState(1470);
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
		enterRule(_localctx, 196, RULE_sizeof_operand2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1471);
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
		enterRule(_localctx, 198, RULE_inc_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1473);
			_la = _input.LA(1);
			if ( !(_la==T__40 || _la==T__41) ) {
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
		public Function_argument_listContext function_argument_list() {
			return getRuleContext(Function_argument_listContext.class,0);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
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
		int _startState = 200;
		enterRecursionRule(_localctx, 200, RULE_postfix_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1492);
			switch (_input.LA(1)) {
			case T__0:
			case T__8:
			case T__9:
			case T__10:
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

				setState(1476);
				primary_expression();
				}
				break;
			case T__21:
			case T__31:
			case T__40:
			case T__41:
				{
				_localctx = new IncDecOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1478);
				_la = _input.LA(1);
				if (_la==T__21 || _la==T__31) {
					{
					setState(1477);
					ptr_operator();
					}
				}

				setState(1480);
				inc_dec();
				setState(1484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1481);
					match(NEWLINE);
					}
					}
					setState(1486);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1488);
				_la = _input.LA(1);
				if (_la==T__21 || _la==T__31) {
					{
					setState(1487);
					ptr_operator();
					}
				}

				setState(1490);
				primary_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1550);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1548);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayIndexingContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1494);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1498);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(1495);
							match(NEWLINE);
							}
							}
							setState(1500);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1501);
						match(T__36);
						setState(1502);
						expr();
						setState(1503);
						match(T__37);
						}
						break;
					case 2:
						{
						_localctx = new FuncCallContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1505);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1509);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(1506);
							match(NEWLINE);
							}
							}
							setState(1511);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1512);
						match(T__0);
						setState(1513);
						function_argument_list();
						setState(1514);
						match(T__1);
						}
						break;
					case 3:
						{
						_localctx = new MemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1516);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1517);
						match(T__15);
						setState(1521);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(1518);
							match(NEWLINE);
							}
							}
							setState(1523);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1525);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(1524);
							match(TEMPLATE);
							}
						}

						{
						setState(1527);
						identifier();
						}
						}
						break;
					case 4:
						{
						_localctx = new PtrMemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1528);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1529);
						match(T__42);
						setState(1533);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(1530);
							match(NEWLINE);
							}
							}
							setState(1535);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1537);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(1536);
							match(TEMPLATE);
							}
						}

						{
						setState(1539);
						identifier();
						}
						}
						break;
					case 5:
						{
						_localctx = new IncDecOpContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1540);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
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
						inc_dec();
						}
						break;
					}
					} 
				}
				setState(1552);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public Function_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFunction_argument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFunction_argument_list(this);
		}
	}

	public final Function_argument_listContext function_argument_list() throws RecognitionException {
		Function_argument_listContext _localctx = new Function_argument_listContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_function_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1575);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__16) | (1L << T__21) | (1L << T__22) | (1L << T__31) | (1L << T__34) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NEW - 91)) | (1L << (ALPHA_NUMERIC - 91)) | (1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)) | (1L << (FLOATING_POINT_LITERAL - 91)) | (1L << (CHAR - 91)) | (1L << (STRING - 91)))) != 0)) {
				{
				setState(1554); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1553);
					function_argument();
					}
					}
					setState(1556); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__16) | (1L << T__21) | (1L << T__22) | (1L << T__31) | (1L << T__34) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NEW - 91)) | (1L << (ALPHA_NUMERIC - 91)) | (1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)) | (1L << (FLOATING_POINT_LITERAL - 91)) | (1L << (CHAR - 91)) | (1L << (STRING - 91)))) != 0) );
				setState(1572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(1558);
					match(T__12);
					setState(1562);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(1559);
						match(NEWLINE);
						}
						}
						setState(1564);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1566); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1565);
						function_argument();
						}
						}
						setState(1568); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__16) | (1L << T__21) | (1L << T__22) | (1L << T__31) | (1L << T__34) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NEW - 91)) | (1L << (ALPHA_NUMERIC - 91)) | (1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)) | (1L << (FLOATING_POINT_LITERAL - 91)) | (1L << (CHAR - 91)) | (1L << (STRING - 91)))) != 0) );
					}
					}
					setState(1574);
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
		public List<TerminalNode> NEWLINE() { return getTokens(FunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FunctionParser.NEWLINE, i);
		}
		public Function_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFunction_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFunction_argument(this);
		}
	}

	public final Function_argumentContext function_argument() throws RecognitionException {
		Function_argumentContext _localctx = new Function_argumentContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_function_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1577);
			assign_expr();
			setState(1581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1578);
				match(NEWLINE);
				}
				}
				setState(1583);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPrimary_expression(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_primary_expression);
		try {
			setState(1590);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case NEW:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1584);
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
				setState(1585);
				constant();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(1586);
				match(T__0);
				setState(1587);
				expr();
				setState(1588);
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
		enterRule(_localctx, 208, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1592);
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
		enterRule(_localctx, 210, RULE_newline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1594);
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
		enterRule(_localctx, 212, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1596);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__21) | (1L << T__31) | (1L << T__34) | (1L << T__43) | (1L << T__44))) != 0)) ) {
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
		enterRule(_localctx, 214, RULE_relational_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1598);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__45) | (1L << T__46))) != 0)) ) {
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
		public TerminalNode STRING() { return getToken(FunctionParser.STRING, 0); }
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
		enterRule(_localctx, 216, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1600);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFunction_decl_specifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFunction_decl_specifiers(this);
		}
	}

	public final Function_decl_specifiersContext function_decl_specifiers() throws RecognitionException {
		Function_decl_specifiersContext _localctx = new Function_decl_specifiersContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_function_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1602);
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
		enterRule(_localctx, 220, RULE_ptr_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1604);
			_la = _input.LA(1);
			if ( !(_la==T__21 || _la==T__31) ) {
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
		enterRule(_localctx, 222, RULE_access_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1606);
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
		enterRule(_localctx, 224, RULE_operator);
		int _la;
		try {
			setState(1653);
			switch (_input.LA(1)) {
			case T__47:
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1608);
				_la = _input.LA(1);
				if ( !(_la==T__47 || _la==NEW) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1611);
				_la = _input.LA(1);
				if (_la==T__36) {
					{
					setState(1609);
					match(T__36);
					setState(1610);
					match(T__37);
					}
				}

				}
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(1613);
				match(T__34);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(1614);
				match(T__16);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(1615);
				match(T__21);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 5);
				{
				setState(1616);
				match(T__17);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 6);
				{
				setState(1617);
				match(T__35);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 7);
				{
				setState(1618);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 8);
				{
				setState(1619);
				match(T__31);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 9);
				{
				setState(1620);
				match(T__29);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 10);
				{
				setState(1621);
				match(T__43);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 11);
				{
				setState(1622);
				match(T__44);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 12);
				{
				setState(1623);
				match(T__4);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1624);
				match(T__13);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1625);
				match(T__14);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 15);
				{
				setState(1626);
				match(T__48);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 16);
				{
				setState(1627);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 17);
				{
				setState(1628);
				match(T__50);
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 18);
				{
				setState(1629);
				match(T__51);
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 19);
				{
				setState(1630);
				match(T__52);
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 20);
				{
				setState(1631);
				match(T__53);
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 21);
				{
				setState(1632);
				match(T__54);
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 22);
				{
				setState(1633);
				match(T__55);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 23);
				{
				setState(1634);
				match(T__33);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 24);
				{
				setState(1635);
				match(T__32);
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 25);
				{
				setState(1636);
				match(T__56);
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 26);
				{
				setState(1637);
				match(T__57);
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 27);
				{
				setState(1638);
				match(T__58);
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 28);
				{
				setState(1639);
				match(T__59);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 29);
				{
				setState(1640);
				match(T__45);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 30);
				{
				setState(1641);
				match(T__46);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 31);
				{
				setState(1642);
				match(T__28);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 32);
				{
				setState(1643);
				match(T__27);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 33);
				{
				setState(1644);
				match(T__41);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 34);
				{
				setState(1645);
				match(T__40);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 35);
				{
				setState(1646);
				match(T__12);
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 36);
				{
				setState(1647);
				match(T__60);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 37);
				{
				setState(1648);
				match(T__42);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 38);
				{
				setState(1649);
				match(T__0);
				setState(1650);
				match(T__1);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 39);
				{
				setState(1651);
				match(T__36);
				setState(1652);
				match(T__37);
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
		enterRule(_localctx, 226, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57))) != 0)) ) {
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
		enterRule(_localctx, 228, RULE_equality_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1657);
			_la = _input.LA(1);
			if ( !(_la==T__58 || _la==T__59) ) {
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
		enterRule(_localctx, 230, RULE_template_decl_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1659);
			match(TEMPLATE);
			setState(1660);
			match(T__13);
			setState(1661);
			template_param_list();
			setState(1662);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 232, RULE_template_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1673); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1673);
				switch (_input.LA(1)) {
				case T__13:
					{
					{
					setState(1664);
					match(T__13);
					setState(1665);
					template_param_list();
					setState(1666);
					match(T__14);
					}
					}
					break;
				case T__0:
					{
					{
					setState(1668);
					match(T__0);
					setState(1669);
					template_param_list();
					setState(1670);
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
				case T__60:
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
					setState(1672);
					no_angle_brackets_or_brackets();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1675); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << IF) | (1L << ELSE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 234, RULE_no_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1677);
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
		enterRule(_localctx, 236, RULE_no_brackets_curlies_or_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1679);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__36) | (1L << T__37))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
		enterRule(_localctx, 238, RULE_no_brackets_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1681);
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
		enterRule(_localctx, 240, RULE_no_angle_brackets_or_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1683);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__13) | (1L << T__14))) != 0)) ) {
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
		enterRule(_localctx, 242, RULE_no_curlies);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1685);
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
		enterRule(_localctx, 244, RULE_no_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1687);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__36 || _la==T__37) ) {
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
		enterRule(_localctx, 246, RULE_no_squares_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1689);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__36) | (1L << T__37))) != 0)) ) {
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
		enterRule(_localctx, 248, RULE_no_comma_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1691);
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
		enterRule(_localctx, 250, RULE_assign_water);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1693);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__12) | (1L << T__36) | (1L << T__37))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
		enterRule(_localctx, 252, RULE_assign_water_l2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1695);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__36) | (1L << T__37))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
		enterRule(_localctx, 254, RULE_water);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1697);
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
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
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
		enterRule(_localctx, 256, RULE_init_declarator);
		int _la;
		try {
			setState(1711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				_localctx = new InitDeclWithCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1699);
				declarator();
				setState(1700);
				match(T__0);
				setState(1702);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__16) | (1L << T__21) | (1L << T__22) | (1L << T__31) | (1L << T__34) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NEW - 91)) | (1L << (ALPHA_NUMERIC - 91)) | (1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)) | (1L << (FLOATING_POINT_LITERAL - 91)) | (1L << (CHAR - 91)) | (1L << (STRING - 91)))) != 0)) {
					{
					setState(1701);
					expr();
					}
				}

				setState(1704);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new InitDeclWithAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1706);
				declarator();
				setState(1707);
				match(T__4);
				setState(1708);
				initializer();
				}
				break;
			case 3:
				_localctx = new InitDeclSimpleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1710);
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
		public Func_ptrsContext func_ptrs() {
			return getRuleContext(Func_ptrsContext.class,0);
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
		enterRule(_localctx, 258, RULE_declarator);
		int _la;
		try {
			setState(1729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1714);
				_la = _input.LA(1);
				if (_la==T__21 || _la==T__31) {
					{
					setState(1713);
					ptrs();
					}
				}

				setState(1716);
				identifier();
				setState(1718);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
				case 1:
					{
					setState(1717);
					type_suffix();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1721);
				_la = _input.LA(1);
				if (_la==T__21 || _la==T__31) {
					{
					setState(1720);
					ptrs();
					}
				}

				setState(1723);
				match(T__0);
				setState(1724);
				func_ptrs();
				setState(1725);
				identifier();
				setState(1726);
				match(T__1);
				setState(1727);
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
		enterRule(_localctx, 260, RULE_type_suffix);
		int _la;
		try {
			setState(1737);
			switch (_input.LA(1)) {
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1731);
				match(T__36);
				setState(1733);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__16) | (1L << T__21) | (1L << T__22) | (1L << T__31) | (1L << T__34) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NEW - 91)) | (1L << (ALPHA_NUMERIC - 91)) | (1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)) | (1L << (FLOATING_POINT_LITERAL - 91)) | (1L << (CHAR - 91)) | (1L << (STRING - 91)))) != 0)) {
					{
					setState(1732);
					conditional_expression();
					}
				}

				setState(1735);
				match(T__37);
				}
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(1736);
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
		case 100:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3}\u06ce\4\2\t\2\4"+
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
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\3\2\7"+
		"\2\u010a\n\2\f\2\16\2\u010d\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3\u011b\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5"+
		"\7\u0128\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7\u013a\n\7\3\7\5\7\u013d\n\7\3\7\3\7\5\7\u0141\n\7\3\7\3\7\5"+
		"\7\u0145\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u014d\n\7\5\7\u014f\n\7\3\b\3"+
		"\b\3\b\3\b\5\b\u0155\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0161"+
		"\n\t\3\t\3\t\3\t\5\t\u0166\n\t\3\t\5\t\u0169\n\t\3\n\5\n\u016c\n\n\3\n"+
		"\3\n\3\n\5\n\u0171\n\n\3\n\3\n\3\13\5\13\u0176\n\13\3\13\3\13\3\f\3\f"+
		"\3\f\7\f\u017d\n\f\f\f\16\f\u0180\13\f\3\f\3\f\7\f\u0184\n\f\f\f\16\f"+
		"\u0187\13\f\3\f\3\f\7\f\u018b\n\f\f\f\16\f\u018e\13\f\3\f\3\f\5\f\u0192"+
		"\n\f\3\r\3\r\5\r\u0196\n\r\3\16\3\16\3\16\3\16\5\16\u019c\n\16\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\5\23\u01b0\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u01ba\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u01c9\n\25\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u01d1\n"+
		"\27\3\30\3\30\3\31\3\31\5\31\u01d7\n\31\3\31\3\31\3\31\5\31\u01dc\n\31"+
		"\7\31\u01de\n\31\f\31\16\31\u01e1\13\31\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\7\33\u01ec\n\33\f\33\16\33\u01ef\13\33\3\33\5\33\u01f2"+
		"\n\33\3\33\3\33\3\34\3\34\3\34\5\34\u01f9\n\34\3\35\3\35\5\35\u01fd\n"+
		"\35\3\35\3\35\3\35\3\35\5\35\u0203\n\35\3\35\5\35\u0206\n\35\3\35\3\35"+
		"\3\35\3\35\5\35\u020c\n\35\3\35\7\35\u020f\n\35\f\35\16\35\u0212\13\35"+
		"\3\35\3\35\5\35\u0216\n\35\3\35\3\35\5\35\u021a\n\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\5\36\u0222\n\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u022a"+
		"\n\37\3 \3 \3 \3 \3!\3!\3\"\3\"\6\"\u0234\n\"\r\"\16\"\u0235\5\"\u0238"+
		"\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0248\n#\3$\3$\5$\u024c"+
		"\n$\3$\3$\3$\3$\3$\5$\u0253\n$\3$\3$\6$\u0257\n$\r$\16$\u0258\3$\3$\5"+
		"$\u025d\n$\3$\3$\3$\5$\u0262\n$\3%\3%\3%\3%\5%\u0268\n%\3&\3&\3&\6&\u026d"+
		"\n&\r&\16&\u026e\3\'\3\'\3\'\5\'\u0274\n\'\3(\3(\5(\u0278\n(\3(\5(\u027b"+
		"\n(\3(\5(\u027e\n(\3(\3(\5(\u0282\n(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3+\5+"+
		"\u028e\n+\3+\7+\u0291\n+\f+\16+\u0294\13+\3+\5+\u0297\n+\3+\7+\u029a\n"+
		"+\f+\16+\u029d\13+\3+\3+\7+\u02a1\n+\f+\16+\u02a4\13+\3+\3+\5+\u02a8\n"+
		"+\3+\3+\3+\3+\3+\5+\u02af\n+\3,\7,\u02b2\n,\f,\16,\u02b5\13,\3,\7,\u02b8"+
		"\n,\f,\16,\u02bb\13,\3,\3,\3,\7,\u02c0\n,\f,\16,\u02c3\13,\3,\5,\u02c6"+
		"\n,\3-\3-\5-\u02ca\n-\3-\3-\5-\u02ce\n-\3-\7-\u02d1\n-\f-\16-\u02d4\13"+
		"-\3-\5-\u02d7\n-\3.\3.\3.\7.\u02dc\n.\f.\16.\u02df\13.\3.\7.\u02e2\n."+
		"\f.\16.\u02e5\13.\3.\3.\7.\u02e9\n.\f.\16.\u02ec\13.\3.\5.\u02ef\n.\3"+
		"/\3/\3/\3/\5/\u02f5\n/\3\60\5\60\u02f8\n\60\3\60\3\60\3\60\3\60\3\60\5"+
		"\60\u02ff\n\60\3\60\5\60\u0302\n\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62"+
		"\7\62\u030b\n\62\f\62\16\62\u030e\13\62\3\63\3\63\3\63\3\64\5\64\u0314"+
		"\n\64\3\64\3\64\3\65\3\65\5\65\u031a\n\65\3\65\3\65\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\5\66\u0325\n\66\3\67\3\67\3\67\3\67\3\67\38\78\u032d\n"+
		"8\f8\168\u0330\138\38\38\38\38\78\u0336\n8\f8\168\u0339\138\78\u033b\n"+
		"8\f8\168\u033e\138\39\39\3:\5:\u0343\n:\3:\5:\u0346\n:\3:\3:\5:\u034a"+
		"\n:\3:\5:\u034d\n:\3:\5:\u0350\n:\3:\5:\u0353\n:\3:\3:\5:\u0357\n:\3:"+
		"\3:\3:\5:\u035c\n:\3:\3:\5:\u0360\n:\3:\5:\u0363\n:\3:\5:\u0366\n:\5:"+
		"\u0368\n:\3;\3;\5;\u036c\n;\3;\3;\3;\3;\5;\u0372\n;\3<\3<\3<\5<\u0377"+
		"\n<\3<\7<\u037a\n<\f<\16<\u037d\13<\3<\3<\3=\3=\3=\3=\3=\3=\3=\5=\u0388"+
		"\n=\3>\3>\3>\5>\u038d\n>\3>\7>\u0390\n>\f>\16>\u0393\13>\3?\3?\5?\u0397"+
		"\n?\3?\5?\u039a\n?\3?\3?\3?\3@\3@\3A\3A\3A\3A\7A\u03a5\nA\fA\16A\u03a8"+
		"\13A\3B\5B\u03ab\nB\3B\5B\u03ae\nB\3B\3B\3C\3C\3C\3C\3C\3C\6C\u03b8\n"+
		"C\rC\16C\u03b9\3C\3C\3C\3C\5C\u03c0\nC\3C\3C\3C\3C\3C\3C\5C\u03c8\nC\7"+
		"C\u03ca\nC\fC\16C\u03cd\13C\3C\3C\3C\3C\3C\7C\u03d4\nC\fC\16C\u03d7\13"+
		"C\3C\5C\u03da\nC\3D\6D\u03dd\nD\rD\16D\u03de\3E\5E\u03e2\nE\3E\3E\3F\3"+
		"F\3G\3G\5G\u03ea\nG\3G\3G\3G\3G\5G\u03f0\nG\3G\3G\5G\u03f4\nG\3G\3G\5"+
		"G\u03f8\nG\3G\7G\u03fb\nG\fG\16G\u03fe\13G\5G\u0400\nG\3G\5G\u0403\nG"+
		"\3H\3H\3H\3I\5I\u0409\nI\3I\3I\5I\u040d\nI\3I\3I\5I\u0411\nI\3I\3I\3I"+
		"\5I\u0416\nI\5I\u0418\nI\3I\5I\u041b\nI\3J\3J\3J\7J\u0420\nJ\fJ\16J\u0423"+
		"\13J\3J\3J\5J\u0427\nJ\3K\3K\3L\3L\5L\u042d\nL\6L\u042f\nL\rL\16L\u0430"+
		"\3M\3M\3N\3N\3N\7N\u0438\nN\fN\16N\u043b\13N\3N\7N\u043e\nN\fN\16N\u0441"+
		"\13N\3N\3N\7N\u0445\nN\fN\16N\u0448\13N\3N\5N\u044b\nN\3N\3N\7N\u044f"+
		"\nN\fN\16N\u0452\13N\3O\3O\7O\u0456\nO\fO\16O\u0459\13O\3O\3O\7O\u045d"+
		"\nO\fO\16O\u0460\13O\3O\3O\5O\u0464\nO\3P\3P\3P\7P\u0469\nP\fP\16P\u046c"+
		"\13P\3P\3P\7P\u0470\nP\fP\16P\u0473\13P\3P\3P\7P\u0477\nP\fP\16P\u047a"+
		"\13P\3P\3P\7P\u047e\nP\fP\16P\u0481\13P\3P\3P\5P\u0485\nP\3Q\3Q\7Q\u0489"+
		"\nQ\fQ\16Q\u048c\13Q\3Q\3Q\7Q\u0490\nQ\fQ\16Q\u0493\13Q\3Q\5Q\u0496\n"+
		"Q\3R\3R\7R\u049a\nR\fR\16R\u049d\13R\3R\3R\7R\u04a1\nR\fR\16R\u04a4\13"+
		"R\3R\5R\u04a7\nR\3S\3S\7S\u04ab\nS\fS\16S\u04ae\13S\3S\3S\7S\u04b2\nS"+
		"\fS\16S\u04b5\13S\3S\5S\u04b8\nS\3T\3T\7T\u04bc\nT\fT\16T\u04bf\13T\3"+
		"T\3T\7T\u04c3\nT\fT\16T\u04c6\13T\3T\5T\u04c9\nT\3U\3U\7U\u04cd\nU\fU"+
		"\16U\u04d0\13U\3U\3U\7U\u04d4\nU\fU\16U\u04d7\13U\3U\5U\u04da\nU\3V\3"+
		"V\7V\u04de\nV\fV\16V\u04e1\13V\3V\3V\7V\u04e5\nV\fV\16V\u04e8\13V\3V\3"+
		"V\5V\u04ec\nV\3W\3W\7W\u04f0\nW\fW\16W\u04f3\13W\3W\3W\7W\u04f7\nW\fW"+
		"\16W\u04fa\13W\3W\3W\5W\u04fe\nW\3X\3X\7X\u0502\nX\fX\16X\u0505\13X\3"+
		"X\3X\7X\u0509\nX\fX\16X\u050c\13X\3X\5X\u050f\nX\3Y\3Y\7Y\u0513\nY\fY"+
		"\16Y\u0516\13Y\3Y\3Y\7Y\u051a\nY\fY\16Y\u051d\13Y\3Y\5Y\u0520\nY\3Z\3"+
		"Z\7Z\u0524\nZ\fZ\16Z\u0527\13Z\3Z\3Z\7Z\u052b\nZ\fZ\16Z\u052e\13Z\3Z\5"+
		"Z\u0531\nZ\3[\3[\3[\3[\3[\3[\5[\u0539\n[\3\\\3\\\7\\\u053d\n\\\f\\\16"+
		"\\\u0540\13\\\3\\\7\\\u0543\n\\\f\\\16\\\u0546\13\\\3]\3]\3]\3]\3]\5]"+
		"\u054d\n]\3^\5^\u0550\n^\3^\3^\7^\u0554\n^\f^\16^\u0557\13^\3^\3^\7^\u055b"+
		"\n^\f^\16^\u055e\13^\3^\3^\5^\u0562\n^\3^\3^\3^\5^\u0567\n^\3^\3^\7^\u056b"+
		"\n^\f^\16^\u056e\13^\3^\3^\7^\u0572\n^\f^\16^\u0575\13^\3^\3^\5^\u0579"+
		"\n^\3^\3^\5^\u057d\n^\3_\3_\7_\u0581\n_\f_\16_\u0584\13_\3_\3_\3`\3`\7"+
		"`\u058a\n`\f`\16`\u058d\13`\3`\3`\3`\3`\3`\3`\7`\u0595\n`\f`\16`\u0598"+
		"\13`\3`\3`\5`\u059c\n`\3a\3a\3b\3b\7b\u05a2\nb\fb\16b\u05a5\13b\3b\3b"+
		"\3b\3b\3b\3b\7b\u05ad\nb\fb\16b\u05b0\13b\3b\5b\u05b3\nb\3c\3c\7c\u05b7"+
		"\nc\fc\16c\u05ba\13c\3c\7c\u05bd\nc\fc\16c\u05c0\13c\3d\3d\3e\3e\3f\3"+
		"f\3f\5f\u05c9\nf\3f\3f\7f\u05cd\nf\ff\16f\u05d0\13f\3f\5f\u05d3\nf\3f"+
		"\3f\5f\u05d7\nf\3f\3f\7f\u05db\nf\ff\16f\u05de\13f\3f\3f\3f\3f\3f\3f\7"+
		"f\u05e6\nf\ff\16f\u05e9\13f\3f\3f\3f\3f\3f\3f\3f\7f\u05f2\nf\ff\16f\u05f5"+
		"\13f\3f\5f\u05f8\nf\3f\3f\3f\3f\7f\u05fe\nf\ff\16f\u0601\13f\3f\5f\u0604"+
		"\nf\3f\3f\3f\7f\u0609\nf\ff\16f\u060c\13f\3f\7f\u060f\nf\ff\16f\u0612"+
		"\13f\3g\6g\u0615\ng\rg\16g\u0616\3g\3g\7g\u061b\ng\fg\16g\u061e\13g\3"+
		"g\6g\u0621\ng\rg\16g\u0622\7g\u0625\ng\fg\16g\u0628\13g\5g\u062a\ng\3"+
		"h\3h\7h\u062e\nh\fh\16h\u0631\13h\3i\3i\3i\3i\3i\3i\5i\u0639\ni\3j\3j"+
		"\3k\3k\3l\3l\3m\3m\3n\3n\3o\3o\3p\3p\3q\3q\3r\3r\3r\5r\u064e\nr\3r\3r"+
		"\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r"+
		"\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\5r\u0678\nr\3s\3s\3t\3t"+
		"\3u\3u\3u\3u\3u\3v\3v\3v\3v\3v\3v\3v\3v\3v\6v\u068c\nv\rv\16v\u068d\3"+
		"w\3w\3x\3x\3y\3y\3z\3z\3{\3{\3|\3|\3}\3}\3~\3~\3\177\3\177\3\u0080\3\u0080"+
		"\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\5\u0082\u06a9\n\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u06b2\n\u0082"+
		"\3\u0083\5\u0083\u06b5\n\u0083\3\u0083\3\u0083\5\u0083\u06b9\n\u0083\3"+
		"\u0083\5\u0083\u06bc\n\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3"+
		"\u0083\5\u0083\u06c4\n\u0083\3\u0084\3\u0084\5\u0084\u06c8\n\u0084\3\u0084"+
		"\3\u0084\5\u0084\u06cc\n\u0084\3\u0084\2\3\u00ca\u0085\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da"+
		"\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2"+
		"\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\2\35\7\2"+
		"\b\16LOQQZZ\\\\\4\2\22\24oo\b\2\16\16\32\33MMYY\\\\oo\3\2WX\3\2rt\3\2"+
		"#$\4\2\23\23%%\5\2\24\24\30\30&&\3\2+,\7\2\23\23\30\30\"\"%%./\4\2\20"+
		"\21\60\61\4\2ruwx\5\2\b\nLLQQ\4\2\30\30\"\"\3\2\13\r\4\2\62\62]]\4\2\7"+
		"\7\63<\3\2=>\3\2\3\4\5\2\3\4\'(pq\3\2\3\5\4\2\3\4\20\21\3\2pq\3\2\'(\4"+
		"\2\5\5\'(\4\2\5\5\17\17\6\2\3\5\17\17\'(pq\u079a\2\u010b\3\2\2\2\4\u011a"+
		"\3\2\2\2\6\u011c\3\2\2\2\b\u011e\3\2\2\2\n\u0120\3\2\2\2\f\u014e\3\2\2"+
		"\2\16\u0154\3\2\2\2\20\u0168\3\2\2\2\22\u016b\3\2\2\2\24\u0175\3\2\2\2"+
		"\26\u0191\3\2\2\2\30\u0195\3\2\2\2\32\u019b\3\2\2\2\34\u019d\3\2\2\2\36"+
		"\u01a1\3\2\2\2 \u01a5\3\2\2\2\"\u01a7\3\2\2\2$\u01af\3\2\2\2&\u01b9\3"+
		"\2\2\2(\u01c8\3\2\2\2*\u01ca\3\2\2\2,\u01d0\3\2\2\2.\u01d2\3\2\2\2\60"+
		"\u01d6\3\2\2\2\62\u01e2\3\2\2\2\64\u01e4\3\2\2\2\66\u01f8\3\2\2\28\u0219"+
		"\3\2\2\2:\u0221\3\2\2\2<\u0229\3\2\2\2>\u022b\3\2\2\2@\u022f\3\2\2\2B"+
		"\u0237\3\2\2\2D\u0247\3\2\2\2F\u0261\3\2\2\2H\u0267\3\2\2\2J\u026c\3\2"+
		"\2\2L\u0270\3\2\2\2N\u0275\3\2\2\2P\u0285\3\2\2\2R\u028a\3\2\2\2T\u02ae"+
		"\3\2\2\2V\u02c5\3\2\2\2X\u02c7\3\2\2\2Z\u02d8\3\2\2\2\\\u02f4\3\2\2\2"+
		"^\u02f7\3\2\2\2`\u0303\3\2\2\2b\u0306\3\2\2\2d\u030f\3\2\2\2f\u0313\3"+
		"\2\2\2h\u0317\3\2\2\2j\u0324\3\2\2\2l\u0326\3\2\2\2n\u032e\3\2\2\2p\u033f"+
		"\3\2\2\2r\u0367\3\2\2\2t\u0371\3\2\2\2v\u0373\3\2\2\2x\u0387\3\2\2\2z"+
		"\u0389\3\2\2\2|\u0394\3\2\2\2~\u039e\3\2\2\2\u0080\u03a0\3\2\2\2\u0082"+
		"\u03aa\3\2\2\2\u0084\u03d9\3\2\2\2\u0086\u03dc\3\2\2\2\u0088\u03e1\3\2"+
		"\2\2\u008a\u03e5\3\2\2\2\u008c\u0402\3\2\2\2\u008e\u0404\3\2\2\2\u0090"+
		"\u0408\3\2\2\2\u0092\u0426\3\2\2\2\u0094\u0428\3\2\2\2\u0096\u042e\3\2"+
		"\2\2\u0098\u0432\3\2\2\2\u009a\u0434\3\2\2\2\u009c\u0453\3\2\2\2\u009e"+
		"\u0484\3\2\2\2\u00a0\u0486\3\2\2\2\u00a2\u0497\3\2\2\2\u00a4\u04a8\3\2"+
		"\2\2\u00a6\u04b9\3\2\2\2\u00a8\u04ca\3\2\2\2\u00aa\u04db\3\2\2\2\u00ac"+
		"\u04ed\3\2\2\2\u00ae\u04ff\3\2\2\2\u00b0\u0510\3\2\2\2\u00b2\u0521\3\2"+
		"\2\2\u00b4\u0538\3\2\2\2\u00b6\u053a\3\2\2\2\u00b8\u054c\3\2\2\2\u00ba"+
		"\u057c\3\2\2\2\u00bc\u057e\3\2\2\2\u00be\u059b\3\2\2\2\u00c0\u059d\3\2"+
		"\2\2\u00c2\u05b2\3\2\2\2\u00c4\u05b4\3\2\2\2\u00c6\u05c1\3\2\2\2\u00c8"+
		"\u05c3\3\2\2\2\u00ca\u05d6\3\2\2\2\u00cc\u0629\3\2\2\2\u00ce\u062b\3\2"+
		"\2\2\u00d0\u0638\3\2\2\2\u00d2\u063a\3\2\2\2\u00d4\u063c\3\2\2\2\u00d6"+
		"\u063e\3\2\2\2\u00d8\u0640\3\2\2\2\u00da\u0642\3\2\2\2\u00dc\u0644\3\2"+
		"\2\2\u00de\u0646\3\2\2\2\u00e0\u0648\3\2\2\2\u00e2\u0677\3\2\2\2\u00e4"+
		"\u0679\3\2\2\2\u00e6\u067b\3\2\2\2\u00e8\u067d\3\2\2\2\u00ea\u068b\3\2"+
		"\2\2\u00ec\u068f\3\2\2\2\u00ee\u0691\3\2\2\2\u00f0\u0693\3\2\2\2\u00f2"+
		"\u0695\3\2\2\2\u00f4\u0697\3\2\2\2\u00f6\u0699\3\2\2\2\u00f8\u069b\3\2"+
		"\2\2\u00fa\u069d\3\2\2\2\u00fc\u069f\3\2\2\2\u00fe\u06a1\3\2\2\2\u0100"+
		"\u06a3\3\2\2\2\u0102\u06b1\3\2\2\2\u0104\u06c3\3\2\2\2\u0106\u06cb\3\2"+
		"\2\2\u0108\u010a\5\4\3\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\3\3\2\2\2\u010d\u010b\3\2\2\2"+
		"\u010e\u011b\5\6\4\2\u010f\u011b\5\b\5\2\u0110\u011b\5\30\r\2\u0111\u011b"+
		"\5\n\6\2\u0112\u011b\5\20\t\2\u0113\u011b\5\22\n\2\u0114\u011b\5p9\2\u0115"+
		"\u011b\5\24\13\2\u0116\u011b\5\u00d2j\2\u0117\u011b\5\u00d4k\2\u0118\u011b"+
		"\5H%\2\u0119\u011b\5\u0100\u0081\2\u011a\u010e\3\2\2\2\u011a\u010f\3\2"+
		"\2\2\u011a\u0110\3\2\2\2\u011a\u0111\3\2\2\2\u011a\u0112\3\2\2\2\u011a"+
		"\u0113\3\2\2\2\u011a\u0114\3\2\2\2\u011a\u0115\3\2\2\2\u011a\u0116\3\2"+
		"\2\2\u011a\u0117\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b"+
		"\5\3\2\2\2\u011c\u011d\7p\2\2\u011d\7\3\2\2\2\u011e\u011f\7q\2\2\u011f"+
		"\t\3\2\2\2\u0120\u0121\5\f\7\2\u0121\13\3\2\2\2\u0122\u014f\7R\2\2\u0123"+
		"\u0124\7S\2\2\u0124\u0127\7\3\2\2\u0125\u0128\5\u008eH\2\u0126\u0128\7"+
		"|\2\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u014f\7\4\2\2\u012a\u012b\7@\2\2\u012b\u012c\7\3\2\2\u012c\u012d\5\26"+
		"\f\2\u012d\u012e\7\4\2\2\u012e\u014f\3\2\2\2\u012f\u014f\7A\2\2\u0130"+
		"\u0131\7G\2\2\u0131\u0132\7\3\2\2\u0132\u0133\5\26\f\2\u0133\u0134\7\4"+
		"\2\2\u0134\u014f\3\2\2\2\u0135\u0136\7B\2\2\u0136\u0139\7\3\2\2\u0137"+
		"\u013a\5\16\b\2\u0138\u013a\7\5\2\2\u0139\u0137\3\2\2\2\u0139\u0138\3"+
		"\2\2\2\u013a\u013c\3\2\2\2\u013b\u013d\5\26\f\2\u013c\u013b\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\7\5\2\2\u013f\u0141\5\u009a"+
		"N\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0144\7\4\2\2\u0143\u0145\7\5\2\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2"+
		"\2\2\u0145\u014f\3\2\2\2\u0146\u014f\7H\2\2\u0147\u0148\7C\2\2\u0148\u0149"+
		"\7\3\2\2\u0149\u014a\5\26\f\2\u014a\u014c\7\4\2\2\u014b\u014d\7\5\2\2"+
		"\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u0122"+
		"\3\2\2\2\u014e\u0123\3\2\2\2\u014e\u012a\3\2\2\2\u014e\u012f\3\2\2\2\u014e"+
		"\u0130\3\2\2\2\u014e\u0135\3\2\2\2\u014e\u0146\3\2\2\2\u014e\u0147\3\2"+
		"\2\2\u014f\r\3\2\2\2\u0150\u0155\5p9\2\u0151\u0152\5\u009aN\2\u0152\u0153"+
		"\7\5\2\2\u0153\u0155\3\2\2\2\u0154\u0150\3\2\2\2\u0154\u0151\3\2\2\2\u0155"+
		"\17\3\2\2\2\u0156\u0157\7D\2\2\u0157\u0169\7\5\2\2\u0158\u0159\7F\2\2"+
		"\u0159\u0169\7\5\2\2\u015a\u015b\7I\2\2\u015b\u015c\5\u0092J\2\u015c\u015d"+
		"\7\5\2\2\u015d\u0169\3\2\2\2\u015e\u0160\7J\2\2\u015f\u0161\5\u009aN\2"+
		"\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0169"+
		"\7\5\2\2\u0163\u0165\7T\2\2\u0164\u0166\5\u009aN\2\u0165\u0164\3\2\2\2"+
		"\u0165\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\7\5\2\2\u0168\u0156"+
		"\3\2\2\2\u0168\u0158\3\2\2\2\u0168\u015a\3\2\2\2\u0168\u015e\3\2\2\2\u0168"+
		"\u0163\3\2\2\2\u0169\21\3\2\2\2\u016a\u016c\7E\2\2\u016b\u016a\3\2\2\2"+
		"\u016b\u016c\3\2\2\2\u016c\u0170\3\2\2\2\u016d\u0171\5\u0092J\2\u016e"+
		"\u0171\5\u0094K\2\u016f\u0171\7w\2\2\u0170\u016d\3\2\2\2\u0170\u016e\3"+
		"\2\2\2\u0170\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\7\6\2\2\u0173"+
		"\23\3\2\2\2\u0174\u0176\5\u009aN\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2"+
		"\2\2\u0176\u0177\3\2\2\2\u0177\u0178\7\5\2\2\u0178\25\3\2\2\2\u0179\u0192"+
		"\5\u009aN\2\u017a\u017e\5\u0084C\2\u017b\u017d\7y\2\2\u017c\u017b\3\2"+
		"\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"\u0181\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0185\5\u0104\u0083\2\u0182\u0184"+
		"\7y\2\2\u0183\u0182\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185"+
		"\u0186\3\2\2\2\u0186\u0188\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u018c\7\7"+
		"\2\2\u0189\u018b\7y\2\2\u018a\u0189\3\2\2\2\u018b\u018e\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e\u018c\3\2"+
		"\2\2\u018f\u0190\5\u009cO\2\u0190\u0192\3\2\2\2\u0191\u0179\3\2\2\2\u0191"+
		"\u017a\3\2\2\2\u0192\27\3\2\2\2\u0193\u0196\5\32\16\2\u0194\u0196\5&\24"+
		"\2\u0195\u0193\3\2\2\2\u0195\u0194\3\2\2\2\u0196\31\3\2\2\2\u0197\u019c"+
		"\5\34\17\2\u0198\u019c\5\36\20\2\u0199\u019c\5 \21\2\u019a\u019c\5\"\22"+
		"\2\u019b\u0197\3\2\2\2\u019b\u0198\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019a"+
		"\3\2\2\2\u019c\33\3\2\2\2\u019d\u019e\7^\2\2\u019e\u019f\5$\23\2\u019f"+
		"\u01a0\b\17\1\2\u01a0\35\3\2\2\2\u01a1\u01a2\7_\2\2\u01a2\u01a3\5$\23"+
		"\2\u01a3\u01a4\b\20\1\2\u01a4\37\3\2\2\2\u01a5\u01a6\7`\2\2\u01a6!\3\2"+
		"\2\2\u01a7\u01a8\7a\2\2\u01a8#\3\2\2\2\u01a9\u01b0\5\26\f\2\u01aa\u01ab"+
		"\7\3\2\2\u01ab\u01ac\5\26\f\2\u01ac\u01ad\7\4\2\2\u01ad\u01b0\3\2\2\2"+
		"\u01ae\u01b0\5.\30\2\u01af\u01a9\3\2\2\2\u01af\u01aa\3\2\2\2\u01af\u01ae"+
		"\3\2\2\2\u01b0%\3\2\2\2\u01b1\u01ba\5(\25\2\u01b2\u01ba\5*\26\2\u01b3"+
		"\u01ba\5\66\34\2\u01b4\u01ba\58\35\2\u01b5\u01ba\5:\36\2\u01b6\u01ba\5"+
		"<\37\2\u01b7\u01ba\5D#\2\u01b8\u01ba\5F$\2\u01b9\u01b1\3\2\2\2\u01b9\u01b2"+
		"\3\2\2\2\u01b9\u01b3\3\2\2\2\u01b9\u01b4\3\2\2\2\u01b9\u01b5\3\2\2\2\u01b9"+
		"\u01b6\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01b8\3\2\2\2\u01ba\'\3\2\2\2"+
		"\u01bb\u01bc\7b\2\2\u01bc\u01bd\5,\27\2\u01bd\u01be\7\3\2\2\u01be\u01bf"+
		"\5\60\31\2\u01bf\u01c0\7\4\2\2\u01c0\u01c1\5\62\32\2\u01c1\u01c9\3\2\2"+
		"\2\u01c2\u01c3\7b\2\2\u01c3\u01c4\5,\27\2\u01c4\u01c5\5\62\32\2\u01c5"+
		"\u01c9\3\2\2\2\u01c6\u01c7\7b\2\2\u01c7\u01c9\5,\27\2\u01c8\u01bb\3\2"+
		"\2\2\u01c8\u01c2\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9)\3\2\2\2\u01ca\u01cb"+
		"\7c\2\2\u01cb\u01cc\5,\27\2\u01cc+\3\2\2\2\u01cd\u01d1\5\u0092J\2\u01ce"+
		"\u01d1\5\u00dan\2\u01cf\u01d1\5.\30\2\u01d0\u01cd\3\2\2\2\u01d0\u01ce"+
		"\3\2\2\2\u01d0\u01cf\3\2\2\2\u01d1-\3\2\2\2\u01d2\u01d3\t\2\2\2\u01d3"+
		"/\3\2\2\2\u01d4\u01d7\5\u0092J\2\u01d5\u01d7\7|\2\2\u01d6\u01d4\3\2\2"+
		"\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01df\3\2\2\2\u01d8\u01db"+
		"\7\17\2\2\u01d9\u01dc\5\u0092J\2\u01da\u01dc\7|\2\2\u01db\u01d9\3\2\2"+
		"\2\u01db\u01da\3\2\2\2\u01dc\u01de\3\2\2\2\u01dd\u01d8\3\2\2\2\u01de\u01e1"+
		"\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\61\3\2\2\2\u01e1"+
		"\u01df\3\2\2\2\u01e2\u01e3\b\32\1\2\u01e3\63\3\2\2\2\u01e4\u01e5\5,\27"+
		"\2\u01e5\u01f1\7\3\2\2\u01e6\u01ec\7\17\2\2\u01e7\u01ec\5\u0084C\2\u01e8"+
		"\u01ec\5\u009aN\2\u01e9\u01ec\5\u00dep\2\u01ea\u01ec\7y\2\2\u01eb\u01e6"+
		"\3\2\2\2\u01eb\u01e7\3\2\2\2\u01eb\u01e8\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb"+
		"\u01ea\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2"+
		"\2\2\u01ee\u01f2\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0\u01f2\7M\2\2\u01f1"+
		"\u01ed\3\2\2\2\u01f1\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\7\4"+
		"\2\2\u01f4\65\3\2\2\2\u01f5\u01f6\7d\2\2\u01f6\u01f9\7x\2\2\u01f7\u01f9"+
		"\7d\2\2\u01f8\u01f5\3\2\2\2\u01f8\u01f7\3\2\2\2\u01f9\67\3\2\2\2\u01fa"+
		"\u01fc\7e\2\2\u01fb\u01fd\7x\2\2\u01fc\u01fb\3\2\2\2\u01fc\u01fd\3\2\2"+
		"\2\u01fd\u021a\3\2\2\2\u01fe\u01ff\7m\2\2\u01ff\u0200\7\3\2\2\u0200\u0202"+
		"\7\3\2\2\u0201\u0203\5,\27\2\u0202\u0201\3\2\2\2\u0202\u0203\3\2\2\2\u0203"+
		"\u0205\3\2\2\2\u0204\u0206\7y\2\2\u0205\u0204\3\2\2\2\u0205\u0206\3\2"+
		"\2\2\u0206\u0215\3\2\2\2\u0207\u0208\7\3\2\2\u0208\u0210\5,\27\2\u0209"+
		"\u020b\7\17\2\2\u020a\u020c\7y\2\2\u020b\u020a\3\2\2\2\u020b\u020c\3\2"+
		"\2\2\u020c\u020d\3\2\2\2\u020d\u020f\5,\27\2\u020e\u0209\3\2\2\2\u020f"+
		"\u0212\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0213\3\2"+
		"\2\2\u0212\u0210\3\2\2\2\u0213\u0214\7\4\2\2\u0214\u0216\3\2\2\2\u0215"+
		"\u0207\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0218\7\4"+
		"\2\2\u0218\u021a\7\4\2\2\u0219\u01fa\3\2\2\2\u0219\u01fe\3\2\2\2\u021a"+
		"9\3\2\2\2\u021b\u021c\7f\2\2\u021c\u0222\5> \2\u021d\u021e\7f\2\2\u021e"+
		"\u0222\5,\27\2\u021f\u0220\7f\2\2\u0220\u0222\5@!\2\u0221\u021b\3\2\2"+
		"\2\u0221\u021d\3\2\2\2\u0221\u021f\3\2\2\2\u0222;\3\2\2\2\u0223\u0224"+
		"\7g\2\2\u0224\u022a\5> \2\u0225\u0226\7g\2\2\u0226\u022a\5,\27\2\u0227"+
		"\u0228\7g\2\2\u0228\u022a\5@!\2\u0229\u0223\3\2\2\2\u0229\u0225\3\2\2"+
		"\2\u0229\u0227\3\2\2\2\u022a=\3\2\2\2\u022b\u022c\7\20\2\2\u022c\u022d"+
		"\5B\"\2\u022d\u022e\7\21\2\2\u022e?\3\2\2\2\u022f\u0230\5B\"\2\u0230A"+
		"\3\2\2\2\u0231\u0238\7x\2\2\u0232\u0234\t\3\2\2\u0233\u0232\3\2\2\2\u0234"+
		"\u0235\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0238\3\2"+
		"\2\2\u0237\u0231\3\2\2\2\u0237\u0233\3\2\2\2\u0238C\3\2\2\2\u0239\u023a"+
		"\7h\2\2\u023a\u023b\7s\2\2\u023b\u0248\7x\2\2\u023c\u023d\7h\2\2\u023d"+
		"\u023e\7s\2\2\u023e\u0248\5,\27\2\u023f\u0240\7h\2\2\u0240\u0241\5,\27"+
		"\2\u0241\u0242\7x\2\2\u0242\u0248\3\2\2\2\u0243\u0244\7h\2\2\u0244\u0248"+
		"\5,\27\2\u0245\u0246\7h\2\2\u0246\u0248\7s\2\2\u0247\u0239\3\2\2\2\u0247"+
		"\u023c\3\2\2\2\u0247\u023f\3\2\2\2\u0247\u0243\3\2\2\2\u0247\u0245\3\2"+
		"\2\2\u0248E\3\2\2\2\u0249\u024b\7i\2\2\u024a\u024c\7j\2\2\u024b\u024a"+
		"\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\7k\2\2\u024e"+
		"\u024f\7x\2\2\u024f\u0262\b$\1\2\u0250\u0252\7i\2\2\u0251\u0253\7j\2\2"+
		"\u0252\u0251\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0256"+
		"\7k\2\2\u0255\u0257\5\u0092J\2\u0256\u0255\3\2\2\2\u0257\u0258\3\2\2\2"+
		"\u0258\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u0262\3\2\2\2\u025a\u025c"+
		"\7i\2\2\u025b\u025d\7j\2\2\u025c\u025b\3\2\2\2\u025c\u025d\3\2\2\2\u025d"+
		"\u025e\3\2\2\2\u025e\u0262\7k\2\2\u025f\u0260\7i\2\2\u0260\u0262\b$\1"+
		"\2\u0261\u0249\3\2\2\2\u0261\u0250\3\2\2\2\u0261\u025a\3\2\2\2\u0261\u025f"+
		"\3\2\2\2\u0262G\3\2\2\2\u0263\u0268\5J&\2\u0264\u0268\5L\'\2\u0265\u0268"+
		"\5N(\2\u0266\u0268\5R*\2\u0267\u0263\3\2\2\2\u0267\u0264\3\2\2\2\u0267"+
		"\u0265\3\2\2\2\u0267\u0266\3\2\2\2\u0268I\3\2\2\2\u0269\u026a\5,\27\2"+
		"\u026a\u026b\7\17\2\2\u026b\u026d\3\2\2\2\u026c\u0269\3\2\2\2\u026d\u026e"+
		"\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026fK\3\2\2\2\u0270"+
		"\u0271\7\25\2\2\u0271\u0273\7\26\2\2\u0272\u0274\7p\2\2\u0273\u0272\3"+
		"\2\2\2\u0273\u0274\3\2\2\2\u0274M\3\2\2\2\u0275\u0277\5\64\33\2\u0276"+
		"\u0278\7y\2\2\u0277\u0276\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u027a\3\2"+
		"\2\2\u0279\u027b\5,\27\2\u027a\u0279\3\2\2\2\u027a\u027b\3\2\2\2\u027b"+
		"\u027d\3\2\2\2\u027c\u027e\7y\2\2\u027d\u027c\3\2\2\2\u027d\u027e\3\2"+
		"\2\2\u027e\u027f\3\2\2\2\u027f\u0281\5\64\33\2\u0280\u0282\7y\2\2\u0281"+
		"\u0280\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0284\5v"+
		"<\2\u0284O\3\2\2\2\u0285\u0286\7\27\2\2\u0286\u0287\7\3\2\2\u0287\u0288"+
		"\5j\66\2\u0288\u0289\7\4\2\2\u0289Q\3\2\2\2\u028a\u028b\7n\2\2\u028bS"+
		"\3\2\2\2\u028c\u028e\5\u00e8u\2\u028d\u028c\3\2\2\2\u028d\u028e\3\2\2"+
		"\2\u028e\u0292\3\2\2\2\u028f\u0291\7y\2\2\u0290\u028f\3\2\2\2\u0291\u0294"+
		"\3\2\2\2\u0292\u0290\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0296\3\2\2\2\u0294"+
		"\u0292\3\2\2\2\u0295\u0297\5V,\2\u0296\u0295\3\2\2\2\u0296\u0297\3\2\2"+
		"\2\u0297\u029b\3\2\2\2\u0298\u029a\7y\2\2\u0299\u0298\3\2\2\2\u029a\u029d"+
		"\3\2\2\2\u029b\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029e\3\2\2\2\u029d"+
		"\u029b\3\2\2\2\u029e\u02a2\5j\66\2\u029f\u02a1\7y\2\2\u02a0\u029f\3\2"+
		"\2\2\u02a1\u02a4\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3"+
		"\u02a5\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a5\u02a7\5X-\2\u02a6\u02a8\5b\62"+
		"\2\u02a7\u02a6\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02aa"+
		"\5`\61\2\u02aa\u02af\3\2\2\2\u02ab\u02ac\5P)\2\u02ac\u02ad\5`\61\2\u02ad"+
		"\u02af\3\2\2\2\u02ae\u028d\3\2\2\2\u02ae\u02ab\3\2\2\2\u02afU\3\2\2\2"+
		"\u02b0\u02b2\5\u00dco\2\u02b1\u02b0\3\2\2\2\u02b2\u02b5\3\2\2\2\u02b3"+
		"\u02b1\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b9\3\2\2\2\u02b5\u02b3\3\2"+
		"\2\2\u02b6\u02b8\7y\2\2\u02b7\u02b6\3\2\2\2\u02b8\u02bb\3\2\2\2\u02b9"+
		"\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bc\3\2\2\2\u02bb\u02b9\3\2"+
		"\2\2\u02bc\u02bd\5\u0084C\2\u02bd\u02c1\3\2\2\2\u02be\u02c0\5\u00dep\2"+
		"\u02bf\u02be\3\2\2\2\u02c0\u02c3\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c1\u02c2"+
		"\3\2\2\2\u02c2\u02c6\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c4\u02c6\5\64\33\2"+
		"\u02c5\u02b3\3\2\2\2\u02c5\u02c4\3\2\2\2\u02c6W\3\2\2\2\u02c7\u02c9\7"+
		"\3\2\2\u02c8\u02ca\5Z.\2\u02c9\u02c8\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca"+
		"\u02cb\3\2\2\2\u02cb\u02cd\7\4\2\2\u02cc\u02ce\7\30\2\2\u02cd\u02cc\3"+
		"\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02d2\3\2\2\2\u02cf\u02d1\7P\2\2\u02d0"+
		"\u02cf\3\2\2\2\u02d1\u02d4\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d2\u02d3\3\2"+
		"\2\2\u02d3\u02d6\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d5\u02d7\5l\67\2\u02d6"+
		"\u02d5\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7Y\3\2\2\2\u02d8\u02e3\5\\/\2\u02d9"+
		"\u02dd\7\17\2\2\u02da\u02dc\7y\2\2\u02db\u02da\3\2\2\2\u02dc\u02df\3\2"+
		"\2\2\u02dd\u02db\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02e0\3\2\2\2\u02df"+
		"\u02dd\3\2\2\2\u02e0\u02e2\5\\/\2\u02e1\u02d9\3\2\2\2\u02e2\u02e5\3\2"+
		"\2\2\u02e3\u02e1\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02ee\3\2\2\2\u02e5"+
		"\u02e3\3\2\2\2\u02e6\u02ea\7\17\2\2\u02e7\u02e9\7y\2\2\u02e8\u02e7\3\2"+
		"\2\2\u02e9\u02ec\3\2\2\2\u02ea\u02e8\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb"+
		"\u02ed\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ed\u02ef\7|\2\2\u02ee\u02e6\3\2"+
		"\2\2\u02ee\u02ef\3\2\2\2\u02ef[\3\2\2\2\u02f0\u02f5\7M\2\2\u02f1\u02f2"+
		"\5\u0088E\2\u02f2\u02f3\5^\60\2\u02f3\u02f5\3\2\2\2\u02f4\u02f0\3\2\2"+
		"\2\u02f4\u02f1\3\2\2\2\u02f5]\3\2\2\2\u02f6\u02f8\5\u0096L\2\u02f7\u02f6"+
		"\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02fe\3\2\2\2\u02f9\u02fa\7\3\2\2\u02fa"+
		"\u02fb\5^\60\2\u02fb\u02fc\7\4\2\2\u02fc\u02ff\3\2\2\2\u02fd\u02ff\5\u008a"+
		"F\2\u02fe\u02f9\3\2\2\2\u02fe\u02fd\3\2\2\2\u02ff\u0301\3\2\2\2\u0300"+
		"\u0302\5\u0106\u0084\2\u0301\u0300\3\2\2\2\u0301\u0302\3\2\2\2\u0302_"+
		"\3\2\2\2\u0303\u0304\7p\2\2\u0304\u0305\b\61\1\2\u0305a\3\2\2\2\u0306"+
		"\u0307\7\6\2\2\u0307\u030c\5d\63\2\u0308\u0309\7\17\2\2\u0309\u030b\5"+
		"d\63\2\u030a\u0308\3\2\2\2\u030b\u030e\3\2\2\2\u030c\u030a\3\2\2\2\u030c"+
		"\u030d\3\2\2\2\u030dc\3\2\2\2\u030e\u030c\3\2\2\2\u030f\u0310\5f\64\2"+
		"\u0310\u0311\5h\65\2\u0311e\3\2\2\2\u0312\u0314\7\31\2\2\u0313\u0312\3"+
		"\2\2\2\u0313\u0314\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0316\5\u0092J\2"+
		"\u0316g\3\2\2\2\u0317\u0319\7\3\2\2\u0318\u031a\5\u009aN\2\u0319\u0318"+
		"\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031c\7\4\2\2\u031c"+
		"i\3\2\2\2\u031d\u031e\7\3\2\2\u031e\u031f\5j\66\2\u031f\u0320\7\4\2\2"+
		"\u0320\u0325\3\2\2\2\u0321\u0325\5\u0092J\2\u0322\u0323\7Z\2\2\u0323\u0325"+
		"\5\u00e2r\2\u0324\u031d\3\2\2\2\u0324\u0321\3\2\2\2\u0324\u0322\3\2\2"+
		"\2\u0325k\3\2\2\2\u0326\u0327\7T\2\2\u0327\u0328\7\3\2\2\u0328\u0329\5"+
		"n8\2\u0329\u032a\7\4\2\2\u032am\3\2\2\2\u032b\u032d\5\u00ecw\2\u032c\u032b"+
		"\3\2\2\2\u032d\u0330\3\2\2\2\u032e\u032c\3\2\2\2\u032e\u032f\3\2\2\2\u032f"+
		"\u033c\3\2\2\2\u0330\u032e\3\2\2\2\u0331\u0332\7\3\2\2\u0332\u0333\5n"+
		"8\2\u0333\u0337\7\4\2\2\u0334\u0336\5\u00ecw\2\u0335\u0334\3\2\2\2\u0336"+
		"\u0339\3\2\2\2\u0337\u0335\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u033b\3\2"+
		"\2\2\u0339\u0337\3\2\2\2\u033a\u0331\3\2\2\2\u033b\u033e\3\2\2\2\u033c"+
		"\u033a\3\2\2\2\u033c\u033d\3\2\2\2\u033do\3\2\2\2\u033e\u033c\3\2\2\2"+
		"\u033f\u0340\5r:\2\u0340q\3\2\2\2\u0341\u0343\7K\2\2\u0342\u0341\3\2\2"+
		"\2\u0342\u0343\3\2\2\2\u0343\u0345\3\2\2\2\u0344\u0346\5\u00e8u\2\u0345"+
		"\u0344\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0349\5|"+
		"?\2\u0348\u034a\7y\2\2\u0349\u0348\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034c"+
		"\3\2\2\2\u034b\u034d\5v<\2\u034c\u034b\3\2\2\2\u034c\u034d\3\2\2\2\u034d"+
		"\u0368\3\2\2\2\u034e\u0350\7K\2\2\u034f\u034e\3\2\2\2\u034f\u0350\3\2"+
		"\2\2\u0350\u0352\3\2\2\2\u0351\u0353\5\u00e8u\2\u0352\u0351\3\2\2\2\u0352"+
		"\u0353\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0356\5\u0084C\2\u0355\u0357"+
		"\7y\2\2\u0356\u0355\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0358\3\2\2\2\u0358"+
		"\u0359\5v<\2\u0359\u0368\3\2\2\2\u035a\u035c\7K\2\2\u035b\u035a\3\2\2"+
		"\2\u035b\u035c\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u035f\5t;\2\u035e\u0360"+
		"\7y\2\2\u035f\u035e\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0362\3\2\2\2\u0361"+
		"\u0363\5v<\2\u0362\u0361\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0365\3\2\2"+
		"\2\u0364\u0366\7\5\2\2\u0365\u0364\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0368"+
		"\3\2\2\2\u0367\u0342\3\2\2\2\u0367\u034f\3\2\2\2\u0367\u035b\3\2\2\2\u0368"+
		"s\3\2\2\2\u0369\u036b\7Y\2\2\u036a\u036c\5\u0092J\2\u036b\u036a\3\2\2"+
		"\2\u036b\u036c\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036e\7p\2\2\u036e\u0372"+
		"\b;\1\2\u036f\u0370\7Y\2\2\u0370\u0372\5\u0092J\2\u0371\u0369\3\2\2\2"+
		"\u0371\u036f\3\2\2\2\u0372u\3\2\2\2\u0373\u037b\5\u0102\u0082\2\u0374"+
		"\u0376\7\17\2\2\u0375\u0377\7y\2\2\u0376\u0375\3\2\2\2\u0376\u0377\3\2"+
		"\2\2\u0377\u0378\3\2\2\2\u0378\u037a\5\u0102\u0082\2\u0379\u0374\3\2\2"+
		"\2\u037a\u037d\3\2\2\2\u037b\u0379\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037e"+
		"\3\2\2\2\u037d\u037b\3\2\2\2\u037e\u037f\7\5\2\2\u037fw\3\2\2\2\u0380"+
		"\u0388\5\u009cO\2\u0381\u0382\7p\2\2\u0382\u0383\5z>\2\u0383\u0384\7q"+
		"\2\2\u0384\u0388\3\2\2\2\u0385\u0386\7p\2\2\u0386\u0388\7q\2\2\u0387\u0380"+
		"\3\2\2\2\u0387\u0381\3\2\2\2\u0387\u0385\3\2\2\2\u0388y\3\2\2\2\u0389"+
		"\u0391\5x=\2\u038a\u038c\7\17\2\2\u038b\u038d\7y\2\2\u038c\u038b\3\2\2"+
		"\2\u038c\u038d\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u0390\5x=\2\u038f\u038a"+
		"\3\2\2\2\u0390\u0393\3\2\2\2\u0391\u038f\3\2\2\2\u0391\u0392\3\2\2\2\u0392"+
		"{\3\2\2\2\u0393\u0391\3\2\2\2\u0394\u0396\7\\\2\2\u0395\u0397\5~@\2\u0396"+
		"\u0395\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u0399\3\2\2\2\u0398\u039a\5\u0080"+
		"A\2\u0399\u0398\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039b\3\2\2\2\u039b"+
		"\u039c\7p\2\2\u039c\u039d\b?\1\2\u039d}\3\2\2\2\u039e\u039f\5\u0092J\2"+
		"\u039f\177\3\2\2\2\u03a0\u03a1\7\6\2\2\u03a1\u03a6\5\u0082B\2\u03a2\u03a3"+
		"\7\17\2\2\u03a3\u03a5\5\u0082B\2\u03a4\u03a2\3\2\2\2\u03a5\u03a8\3\2\2"+
		"\2\u03a6\u03a4\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u0081\3\2\2\2\u03a8\u03a6"+
		"\3\2\2\2\u03a9\u03ab\7Q\2\2\u03aa\u03a9\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab"+
		"\u03ad\3\2\2\2\u03ac\u03ae\5\u00e0q\2\u03ad\u03ac\3\2\2\2\u03ad\u03ae"+
		"\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b0\5\u0092J\2\u03b0\u0083\3\2\2"+
		"\2\u03b1\u03b8\5\u00dco\2\u03b2\u03b8\7P\2\2\u03b3\u03b8\7N\2\2\u03b4"+
		"\u03b8\7O\2\2\u03b5\u03b8\5\u00dep\2\u03b6\u03b8\5\u0086D\2\u03b7\u03b1"+
		"\3\2\2\2\u03b7\u03b2\3\2\2\2\u03b7\u03b3\3\2\2\2\u03b7\u03b4\3\2\2\2\u03b7"+
		"\u03b5\3\2\2\2\u03b7\u03b6\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03b7\3\2"+
		"\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bf\3\2\2\2\u03bb\u03bc\7\20\2\2\u03bc"+
		"\u03bd\5\u00eav\2\u03bd\u03be\7\21\2\2\u03be\u03c0\3\2\2\2\u03bf\u03bb"+
		"\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03cb\3\2\2\2\u03c1\u03c2\7\31\2\2"+
		"\u03c2\u03c7\5\u0086D\2\u03c3\u03c4\7\20\2\2\u03c4\u03c5\5\u00eav\2\u03c5"+
		"\u03c6\7\21\2\2\u03c6\u03c8\3\2\2\2\u03c7\u03c3\3\2\2\2\u03c7\u03c8\3"+
		"\2\2\2\u03c8\u03ca\3\2\2\2\u03c9\u03c1\3\2\2\2\u03ca\u03cd\3\2\2\2\u03cb"+
		"\u03c9\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03d5\3\2\2\2\u03cd\u03cb\3\2"+
		"\2\2\u03ce\u03d4\5\u00dco\2\u03cf\u03d4\7P\2\2\u03d0\u03d4\7N\2\2\u03d1"+
		"\u03d4\7O\2\2\u03d2\u03d4\5\u00dep\2\u03d3\u03ce\3\2\2\2\u03d3\u03cf\3"+
		"\2\2\2\u03d3\u03d0\3\2\2\2\u03d3\u03d1\3\2\2\2\u03d3\u03d2\3\2\2\2\u03d4"+
		"\u03d7\3\2\2\2\u03d5\u03d3\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03da\3\2"+
		"\2\2\u03d7\u03d5\3\2\2\2\u03d8\u03da\5\64\33\2\u03d9\u03b7\3\2\2\2\u03d9"+
		"\u03d8\3\2\2\2\u03da\u0085\3\2\2\2\u03db\u03dd\t\4\2\2\u03dc\u03db\3\2"+
		"\2\2\u03dd\u03de\3\2\2\2\u03de\u03dc\3\2\2\2\u03de\u03df\3\2\2\2\u03df"+
		"\u0087\3\2\2\2\u03e0\u03e2\t\5\2\2\u03e1\u03e0\3\2\2\2\u03e1\u03e2\3\2"+
		"\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e4\5\u0084C\2\u03e4\u0089\3\2\2\2\u03e5"+
		"\u03e6\5\u0092J\2\u03e6\u008b\3\2\2\2\u03e7\u03e9\7\3\2\2\u03e8\u03ea"+
		"\7y\2\2\u03e9\u03e8\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb"+
		"\u03ec\7M\2\2\u03ec\u0403\7\4\2\2\u03ed\u03ef\7\3\2\2\u03ee\u03f0\7y\2"+
		"\2\u03ef\u03ee\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03ff\3\2\2\2\u03f1\u03f3"+
		"\5\u008eH\2\u03f2\u03f4\7y\2\2\u03f3\u03f2\3\2\2\2\u03f3\u03f4\3\2\2\2"+
		"\u03f4\u03fc\3\2\2\2\u03f5\u03f7\7\17\2\2\u03f6\u03f8\7y\2\2\u03f7\u03f6"+
		"\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fb\5\u008eH"+
		"\2\u03fa\u03f5\3\2\2\2\u03fb\u03fe\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fc\u03fd"+
		"\3\2\2\2\u03fd\u0400\3\2\2\2\u03fe\u03fc\3\2\2\2\u03ff\u03f1\3\2\2\2\u03ff"+
		"\u0400\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0403\7\4\2\2\u0402\u03e7\3\2"+
		"\2\2\u0402\u03ed\3\2\2\2\u0403\u008d\3\2\2\2\u0404\u0405\5\u0088E\2\u0405"+
		"\u0406\5\u0090I\2\u0406\u008f\3\2\2\2\u0407\u0409\5\u0096L\2\u0408\u0407"+
		"\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u0417\3\2\2\2\u040a\u040c\7\3\2\2\u040b"+
		"\u040d\7y\2\2\u040c\u040b\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u040e\3\2"+
		"\2\2\u040e\u0410\5\u0090I\2\u040f\u0411\7y\2\2\u0410\u040f\3\2\2\2\u0410"+
		"\u0411\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u0413\7\4\2\2\u0413\u0418\3\2"+
		"\2\2\u0414\u0416\5\u008aF\2\u0415\u0414\3\2\2\2\u0415\u0416\3\2\2\2\u0416"+
		"\u0418\3\2\2\2\u0417\u040a\3\2\2\2\u0417\u0415\3\2\2\2\u0418\u041a\3\2"+
		"\2\2\u0419\u041b\5\u0106\u0084\2\u041a\u0419\3\2\2\2\u041a\u041b\3\2\2"+
		"\2\u041b\u0091\3\2\2\2\u041c\u0421\7o\2\2\u041d\u041e\7\31\2\2\u041e\u0420"+
		"\7o\2\2\u041f\u041d\3\2\2\2\u0420\u0423\3\2\2\2\u0421\u041f\3\2\2\2\u0421"+
		"\u0422\3\2\2\2\u0422\u0427\3\2\2\2\u0423\u0421\3\2\2\2\u0424\u0427\7]"+
		"\2\2\u0425\u0427\5\u00e0q\2\u0426\u041c\3\2\2\2\u0426\u0424\3\2\2\2\u0426"+
		"\u0425\3\2\2\2\u0427\u0093\3\2\2\2\u0428\u0429\t\6\2\2\u0429\u0095\3\2"+
		"\2\2\u042a\u042c\5\u00dep\2\u042b\u042d\7\34\2\2\u042c\u042b\3\2\2\2\u042c"+
		"\u042d\3\2\2\2\u042d\u042f\3\2\2\2\u042e\u042a\3\2\2\2\u042f\u0430\3\2"+
		"\2\2\u0430\u042e\3\2\2\2\u0430\u0431\3\2\2\2\u0431\u0097\3\2\2\2\u0432"+
		"\u0433\5\u0096L\2\u0433\u0099\3\2\2\2\u0434\u0439\5\u009cO\2\u0435\u0436"+
		"\7z\2\2\u0436\u0438\7y\2\2\u0437\u0435\3\2\2\2\u0438\u043b\3\2\2\2\u0439"+
		"\u0437\3\2\2\2\u0439\u043a\3\2\2\2\u043a\u044a\3\2\2\2\u043b\u0439\3\2"+
		"\2\2\u043c\u043e\7y\2\2\u043d\u043c\3\2\2\2\u043e\u0441\3\2\2\2\u043f"+
		"\u043d\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u0442\3\2\2\2\u0441\u043f\3\2"+
		"\2\2\u0442\u0446\7\17\2\2\u0443\u0445\7y\2\2\u0444\u0443\3\2\2\2\u0445"+
		"\u0448\3\2\2\2\u0446\u0444\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0449\3\2"+
		"\2\2\u0448\u0446\3\2\2\2\u0449\u044b\5\u009aN\2\u044a\u043f\3\2\2\2\u044a"+
		"\u044b\3\2\2\2\u044b\u0450\3\2\2\2\u044c\u044d\7z\2\2\u044d\u044f\7y\2"+
		"\2\u044e\u044c\3\2\2\2\u044f\u0452\3\2\2\2\u0450\u044e\3\2\2\2\u0450\u0451"+
		"\3\2\2\2\u0451\u009b\3\2\2\2\u0452\u0450\3\2\2\2\u0453\u0463\5\u009eP"+
		"\2\u0454\u0456\7y\2\2\u0455\u0454\3\2\2\2\u0456\u0459\3\2\2\2\u0457\u0455"+
		"\3\2\2\2\u0457\u0458\3\2\2\2\u0458\u045a\3\2\2\2\u0459\u0457\3\2\2\2\u045a"+
		"\u045e\5\u00e4s\2\u045b\u045d\7y\2\2\u045c\u045b\3\2\2\2\u045d\u0460\3"+
		"\2\2\2\u045e\u045c\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u0461\3\2\2\2\u0460"+
		"\u045e\3\2\2\2\u0461\u0462\5\u009cO\2\u0462\u0464\3\2\2\2\u0463\u0457"+
		"\3\2\2\2\u0463\u0464\3\2\2\2\u0464\u009d\3\2\2\2\u0465\u0485\5\u00a0Q"+
		"\2\u0466\u046a\5\u00a0Q\2\u0467\u0469\7y\2\2\u0468\u0467\3\2\2\2\u0469"+
		"\u046c\3\2\2\2\u046a\u0468\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u046d\3\2"+
		"\2\2\u046c\u046a\3\2\2\2\u046d\u0471\7\35\2\2\u046e\u0470\7y\2\2\u046f"+
		"\u046e\3\2\2\2\u0470\u0473\3\2\2\2\u0471\u046f\3\2\2\2\u0471\u0472\3\2"+
		"\2\2\u0472\u0474\3\2\2\2\u0473\u0471\3\2\2\2\u0474\u0478\5\u009aN\2\u0475"+
		"\u0477\7y\2\2\u0476\u0475\3\2\2\2\u0477\u047a\3\2\2\2\u0478\u0476\3\2"+
		"\2\2\u0478\u0479\3\2\2\2\u0479\u047b\3\2\2\2\u047a\u0478\3\2\2\2\u047b"+
		"\u047f\7\6\2\2\u047c\u047e\7y\2\2\u047d\u047c\3\2\2\2\u047e\u0481\3\2"+
		"\2\2\u047f\u047d\3\2\2\2\u047f\u0480\3\2\2\2\u0480\u0482\3\2\2\2\u0481"+
		"\u047f\3\2\2\2\u0482\u0483\5\u009eP\2\u0483\u0485\3\2\2\2\u0484\u0465"+
		"\3\2\2\2\u0484\u0466\3\2\2\2\u0485\u009f\3\2\2\2\u0486\u0495\5\u00a2R"+
		"\2\u0487\u0489\7y\2\2\u0488\u0487\3\2\2\2\u0489\u048c\3\2\2\2\u048a\u0488"+
		"\3\2\2\2\u048a\u048b\3\2\2\2\u048b\u048d\3\2\2\2\u048c\u048a\3\2\2\2\u048d"+
		"\u0491\7\36\2\2\u048e\u0490\7y\2\2\u048f\u048e\3\2\2\2\u0490\u0493\3\2"+
		"\2\2\u0491\u048f\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0494\3\2\2\2\u0493"+
		"\u0491\3\2\2\2\u0494\u0496\5\u00a0Q\2\u0495\u048a\3\2\2\2\u0495\u0496"+
		"\3\2\2\2\u0496\u00a1\3\2\2\2\u0497\u04a6\5\u00a4S\2\u0498\u049a\7y\2\2"+
		"\u0499\u0498\3\2\2\2\u049a\u049d\3\2\2\2\u049b\u0499\3\2\2\2\u049b\u049c"+
		"\3\2\2\2\u049c\u049e\3\2\2\2\u049d\u049b\3\2\2\2\u049e\u04a2\7\37\2\2"+
		"\u049f\u04a1\7y\2\2\u04a0\u049f\3\2\2\2\u04a1\u04a4\3\2\2\2\u04a2\u04a0"+
		"\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a5\3\2\2\2\u04a4\u04a2\3\2\2\2\u04a5"+
		"\u04a7\5\u00a2R\2\u04a6\u049b\3\2\2\2\u04a6\u04a7\3\2\2\2\u04a7\u00a3"+
		"\3\2\2\2\u04a8\u04b7\5\u00a6T\2\u04a9\u04ab\7y\2\2\u04aa\u04a9\3\2\2\2"+
		"\u04ab\u04ae\3\2\2\2\u04ac\u04aa\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad\u04af"+
		"\3\2\2\2\u04ae\u04ac\3\2\2\2\u04af\u04b3\7 \2\2\u04b0\u04b2\7y\2\2\u04b1"+
		"\u04b0\3\2\2\2\u04b2\u04b5\3\2\2\2\u04b3\u04b1\3\2\2\2\u04b3\u04b4\3\2"+
		"\2\2\u04b4\u04b6\3\2\2\2\u04b5\u04b3\3\2\2\2\u04b6\u04b8\5\u00a4S\2\u04b7"+
		"\u04ac\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u00a5\3\2\2\2\u04b9\u04c8\5\u00a8"+
		"U\2\u04ba\u04bc\7y\2\2\u04bb\u04ba\3\2\2\2\u04bc\u04bf\3\2\2\2\u04bd\u04bb"+
		"\3\2\2\2\u04bd\u04be\3\2\2\2\u04be\u04c0\3\2\2\2\u04bf\u04bd\3\2\2\2\u04c0"+
		"\u04c4\7!\2\2\u04c1\u04c3\7y\2\2\u04c2\u04c1\3\2\2\2\u04c3\u04c6\3\2\2"+
		"\2\u04c4\u04c2\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5\u04c7\3\2\2\2\u04c6\u04c4"+
		"\3\2\2\2\u04c7\u04c9\5\u00a6T\2\u04c8\u04bd\3\2\2\2\u04c8\u04c9\3\2\2"+
		"\2\u04c9\u00a7\3\2\2\2\u04ca\u04d9\5\u00aaV\2\u04cb\u04cd\7y\2\2\u04cc"+
		"\u04cb\3\2\2\2\u04cd\u04d0\3\2\2\2\u04ce\u04cc\3\2\2\2\u04ce\u04cf\3\2"+
		"\2\2\u04cf\u04d1\3\2\2\2\u04d0\u04ce\3\2\2\2\u04d1\u04d5\7\"\2\2\u04d2"+
		"\u04d4\7y\2\2\u04d3\u04d2\3\2\2\2\u04d4\u04d7\3\2\2\2\u04d5\u04d3\3\2"+
		"\2\2\u04d5\u04d6\3\2\2\2\u04d6\u04d8\3\2\2\2\u04d7\u04d5\3\2\2\2\u04d8"+
		"\u04da\5\u00a8U\2\u04d9\u04ce\3\2\2\2\u04d9\u04da\3\2\2\2\u04da\u00a9"+
		"\3\2\2\2\u04db\u04eb\5\u00acW\2\u04dc\u04de\7y\2\2\u04dd\u04dc\3\2\2\2"+
		"\u04de\u04e1\3\2\2\2\u04df\u04dd\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e2"+
		"\3\2\2\2\u04e1\u04df\3\2\2\2\u04e2\u04e6\5\u00e6t\2\u04e3\u04e5\7y\2\2"+
		"\u04e4\u04e3\3\2\2\2\u04e5\u04e8\3\2\2\2\u04e6\u04e4\3\2\2\2\u04e6\u04e7"+
		"\3\2\2\2\u04e7\u04e9\3\2\2\2\u04e8\u04e6\3\2\2\2\u04e9\u04ea\5\u00aaV"+
		"\2\u04ea\u04ec\3\2\2\2\u04eb\u04df\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u00ab"+
		"\3\2\2\2\u04ed\u04fd\5\u00aeX\2\u04ee\u04f0\7y\2\2\u04ef\u04ee\3\2\2\2"+
		"\u04f0\u04f3\3\2\2\2\u04f1\u04ef\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04f4"+
		"\3\2\2\2\u04f3\u04f1\3\2\2\2\u04f4\u04f8\5\u00d8m\2\u04f5\u04f7\7y\2\2"+
		"\u04f6\u04f5\3\2\2\2\u04f7\u04fa\3\2\2\2\u04f8\u04f6\3\2\2\2\u04f8\u04f9"+
		"\3\2\2\2\u04f9\u04fb\3\2\2\2\u04fa\u04f8\3\2\2\2\u04fb\u04fc\5\u00acW"+
		"\2\u04fc\u04fe\3\2\2\2\u04fd\u04f1\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe\u00ad"+
		"\3\2\2\2\u04ff\u050e\5\u00b0Y\2\u0500\u0502\7y\2\2\u0501\u0500\3\2\2\2"+
		"\u0502\u0505\3\2\2\2\u0503\u0501\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u0506"+
		"\3\2\2\2\u0505\u0503\3\2\2\2\u0506\u050a\t\7\2\2\u0507\u0509\7y\2\2\u0508"+
		"\u0507\3\2\2\2\u0509\u050c\3\2\2\2\u050a\u0508\3\2\2\2\u050a\u050b\3\2"+
		"\2\2\u050b\u050d\3\2\2\2\u050c\u050a\3\2\2\2\u050d\u050f\5\u00aeX\2\u050e"+
		"\u0503\3\2\2\2\u050e\u050f\3\2\2\2\u050f\u00af\3\2\2\2\u0510\u051f\5\u00b2"+
		"Z\2\u0511\u0513\7y\2\2\u0512\u0511\3\2\2\2\u0513\u0516\3\2\2\2\u0514\u0512"+
		"\3\2\2\2\u0514\u0515\3\2\2\2\u0515\u0517\3\2\2\2\u0516\u0514\3\2\2\2\u0517"+
		"\u051b\t\b\2\2\u0518\u051a\7y\2\2\u0519\u0518\3\2\2\2\u051a\u051d\3\2"+
		"\2\2\u051b\u0519\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u051e\3\2\2\2\u051d"+
		"\u051b\3\2\2\2\u051e\u0520\5\u00b0Y\2\u051f\u0514\3\2\2\2\u051f\u0520"+
		"\3\2\2\2\u0520\u00b1\3\2\2\2\u0521\u0530\5\u00b4[\2\u0522\u0524\7y\2\2"+
		"\u0523\u0522\3\2\2\2\u0524\u0527\3\2\2\2\u0525\u0523\3\2\2\2\u0525\u0526"+
		"\3\2\2\2\u0526\u0528\3\2\2\2\u0527\u0525\3\2\2\2\u0528\u052c\t\t\2\2\u0529"+
		"\u052b\7y\2\2\u052a\u0529\3\2\2\2\u052b\u052e\3\2\2\2\u052c\u052a\3\2"+
		"\2\2\u052c\u052d\3\2\2\2\u052d\u052f\3\2\2\2\u052e\u052c\3\2\2\2\u052f"+
		"\u0531\5\u00b2Z\2\u0530\u0525\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u00b3"+
		"\3\2\2\2\u0532\u0533\7\3\2\2\u0533\u0534\5\u00b6\\\2\u0534\u0535\7\4\2"+
		"\2\u0535\u0536\5\u00b4[\2\u0536\u0539\3\2\2\2\u0537\u0539\5\u00b8]\2\u0538"+
		"\u0532\3\2\2\2\u0538\u0537\3\2\2\2\u0539\u00b5\3\2\2\2\u053a\u0544\5\u0084"+
		"C\2\u053b\u053d\7y\2\2\u053c\u053b\3\2\2\2\u053d\u0540\3\2\2\2\u053e\u053c"+
		"\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0541\3\2\2\2\u0540\u053e\3\2\2\2\u0541"+
		"\u0543\5\u00dep\2\u0542\u053e\3\2\2\2\u0543\u0546\3\2\2\2\u0544\u0542"+
		"\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u00b7\3\2\2\2\u0546\u0544\3\2\2\2\u0547"+
		"\u054d\5\u00bc_\2\u0548\u054d\5\u00be`\2\u0549\u054d\5\u00ba^\2\u054a"+
		"\u054d\5\u00caf\2\u054b\u054d\5\u00c2b\2\u054c\u0547\3\2\2\2\u054c\u0548"+
		"\3\2\2\2\u054c\u0549\3\2\2\2\u054c\u054a\3\2\2\2\u054c\u054b\3\2\2\2\u054d"+
		"\u00b9\3\2\2\2\u054e\u0550\7\31\2\2\u054f\u054e\3\2\2\2\u054f\u0550\3"+
		"\2\2\2\u0550\u0551\3\2\2\2\u0551\u0555\7]\2\2\u0552\u0554\7y\2\2\u0553"+
		"\u0552\3\2\2\2\u0554\u0557\3\2\2\2\u0555\u0553\3\2\2\2\u0555\u0556\3\2"+
		"\2\2\u0556\u0558\3\2\2\2\u0557\u0555\3\2\2\2\u0558\u055c\5\u0084C\2\u0559"+
		"\u055b\7y\2\2\u055a\u0559\3\2\2\2\u055b\u055e\3\2\2\2\u055c\u055a\3\2"+
		"\2\2\u055c\u055d\3\2\2\2\u055d\u055f\3\2\2\2\u055e\u055c\3\2\2\2\u055f"+
		"\u0561\7\'\2\2\u0560\u0562\5\u009eP\2\u0561\u0560\3\2\2\2\u0561\u0562"+
		"\3\2\2\2\u0562\u0563\3\2\2\2\u0563\u0564\7(\2\2\u0564\u057d\3\2\2\2\u0565"+
		"\u0567\7\31\2\2\u0566\u0565\3\2\2\2\u0566\u0567\3\2\2\2\u0567\u0568\3"+
		"\2\2\2\u0568\u056c\7]\2\2\u0569\u056b\7y\2\2\u056a\u0569\3\2\2\2\u056b"+
		"\u056e\3\2\2\2\u056c\u056a\3\2\2\2\u056c\u056d\3\2\2\2\u056d\u056f\3\2"+
		"\2\2\u056e\u056c\3\2\2\2\u056f\u0573\5\u0084C\2\u0570\u0572\7y\2\2\u0571"+
		"\u0570\3\2\2\2\u0572\u0575\3\2\2\2\u0573\u0571\3\2\2\2\u0573\u0574\3\2"+
		"\2\2\u0574\u0576\3\2\2\2\u0575\u0573\3\2\2\2\u0576\u0578\7\3\2\2\u0577"+
		"\u0579\5\u009aN\2\u0578\u0577\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u057a"+
		"\3\2\2\2\u057a\u057b\7\4\2\2\u057b\u057d\3\2\2\2\u057c\u054f\3\2\2\2\u057c"+
		"\u0566\3\2\2\2\u057d\u00bb\3\2\2\2\u057e\u0582\5\u00d6l\2\u057f\u0581"+
		"\7y\2\2\u0580\u057f\3\2\2\2\u0581\u0584\3\2\2\2\u0582\u0580\3\2\2\2\u0582"+
		"\u0583\3\2\2\2\u0583\u0585\3\2\2\2\u0584\u0582\3\2\2\2\u0585\u0586\5\u00b4"+
		"[\2\u0586\u00bd\3\2\2\2\u0587\u058b\5\u00c0a\2\u0588\u058a\7y\2\2\u0589"+
		"\u0588\3\2\2\2\u058a\u058d\3\2\2\2\u058b\u0589\3\2\2\2\u058b\u058c\3\2"+
		"\2\2\u058c\u058e\3\2\2\2\u058d\u058b\3\2\2\2\u058e\u058f\7\3\2\2\u058f"+
		"\u0590\5\u00c4c\2\u0590\u0591\7\4\2\2\u0591\u059c\3\2\2\2\u0592\u0596"+
		"\5\u00c0a\2\u0593\u0595\7y\2\2\u0594\u0593\3\2\2\2\u0595\u0598\3\2\2\2"+
		"\u0596\u0594\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u0599\3\2\2\2\u0598\u0596"+
		"\3\2\2\2\u0599\u059a\5\u00c6d\2\u059a\u059c\3\2\2\2\u059b\u0587\3\2\2"+
		"\2\u059b\u0592\3\2\2\2\u059c\u00bf\3\2\2\2\u059d\u059e\7)\2\2\u059e\u00c1"+
		"\3\2\2\2\u059f\u05a3\7*\2\2\u05a0\u05a2\7y\2\2\u05a1\u05a0\3\2\2\2\u05a2"+
		"\u05a5\3\2\2\2\u05a3\u05a1\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4\u05a6\3\2"+
		"\2\2\u05a5\u05a3\3\2\2\2\u05a6\u05a7\7\3\2\2\u05a7\u05a8\5\u009aN\2\u05a8"+
		"\u05a9\7\4\2\2\u05a9\u05b3\3\2\2\2\u05aa\u05ae\7*\2\2\u05ab\u05ad\7y\2"+
		"\2\u05ac\u05ab\3\2\2\2\u05ad\u05b0\3\2\2\2\u05ae\u05ac\3\2\2\2\u05ae\u05af"+
		"\3\2\2\2\u05af\u05b1\3\2\2\2\u05b0\u05ae\3\2\2\2\u05b1\u05b3\5\u009aN"+
		"\2\u05b2\u059f\3\2\2\2\u05b2\u05aa\3\2\2\2\u05b3\u00c3\3\2\2\2\u05b4\u05be"+
		"\5\u0084C\2\u05b5\u05b7\7y\2\2\u05b6\u05b5\3\2\2\2\u05b7\u05ba\3\2\2\2"+
		"\u05b8\u05b6\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9\u05bb\3\2\2\2\u05ba\u05b8"+
		"\3\2\2\2\u05bb\u05bd\5\u00dep\2\u05bc\u05b8\3\2\2\2\u05bd\u05c0\3\2\2"+
		"\2\u05be\u05bc\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u00c5\3\2\2\2\u05c0\u05be"+
		"\3\2\2\2\u05c1\u05c2\5\u00b8]\2\u05c2\u00c7\3\2\2\2\u05c3\u05c4\t\n\2"+
		"\2\u05c4\u00c9\3\2\2\2\u05c5\u05c6\bf\1\2\u05c6\u05d7\5\u00d0i\2\u05c7"+
		"\u05c9\5\u00dep\2\u05c8\u05c7\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u05ca"+
		"\3\2\2\2\u05ca\u05ce\5\u00c8e\2\u05cb\u05cd\7y\2\2\u05cc\u05cb\3\2\2\2"+
		"\u05cd\u05d0\3\2\2\2\u05ce\u05cc\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u05d2"+
		"\3\2\2\2\u05d0\u05ce\3\2\2\2\u05d1\u05d3\5\u00dep\2\u05d2\u05d1\3\2\2"+
		"\2\u05d2\u05d3\3\2\2\2\u05d3\u05d4\3\2\2\2\u05d4\u05d5\5\u00d0i\2\u05d5"+
		"\u05d7\3\2\2\2\u05d6\u05c5\3\2\2\2\u05d6\u05c8\3\2\2\2\u05d7\u0610\3\2"+
		"\2\2\u05d8\u05dc\f\t\2\2\u05d9\u05db\7y\2\2\u05da\u05d9\3\2\2\2\u05db"+
		"\u05de\3\2\2\2\u05dc\u05da\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd\u05df\3\2"+
		"\2\2\u05de\u05dc\3\2\2\2\u05df\u05e0\7\'\2\2\u05e0\u05e1\5\u009aN\2\u05e1"+
		"\u05e2\7(\2\2\u05e2\u060f\3\2\2\2\u05e3\u05e7\f\b\2\2\u05e4\u05e6\7y\2"+
		"\2\u05e5\u05e4\3\2\2\2\u05e6\u05e9\3\2\2\2\u05e7\u05e5\3\2\2\2\u05e7\u05e8"+
		"\3\2\2\2\u05e8\u05ea\3\2\2\2\u05e9\u05e7\3\2\2\2\u05ea\u05eb\7\3\2\2\u05eb"+
		"\u05ec\5\u00ccg\2\u05ec\u05ed\7\4\2\2\u05ed\u060f\3\2\2\2\u05ee\u05ef"+
		"\f\7\2\2\u05ef\u05f3\7\22\2\2\u05f0\u05f2\7y\2\2\u05f1\u05f0\3\2\2\2\u05f2"+
		"\u05f5\3\2\2\2\u05f3\u05f1\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4\u05f7\3\2"+
		"\2\2\u05f5\u05f3\3\2\2\2\u05f6\u05f8\7[\2\2\u05f7\u05f6\3\2\2\2\u05f7"+
		"\u05f8\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9\u060f\5\u0092J\2\u05fa\u05fb"+
		"\f\6\2\2\u05fb\u05ff\7-\2\2\u05fc\u05fe\7y\2\2\u05fd\u05fc\3\2\2\2\u05fe"+
		"\u0601\3\2\2\2\u05ff\u05fd\3\2\2\2\u05ff\u0600\3\2\2\2\u0600\u0603\3\2"+
		"\2\2\u0601\u05ff\3\2\2\2\u0602\u0604\7[\2\2\u0603\u0602\3\2\2\2\u0603"+
		"\u0604\3\2\2\2\u0604\u0605\3\2\2\2\u0605\u060f\5\u0092J\2\u0606\u060a"+
		"\f\5\2\2\u0607\u0609\7y\2\2\u0608\u0607\3\2\2\2\u0609\u060c\3\2\2\2\u060a"+
		"\u0608\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u060d\3\2\2\2\u060c\u060a\3\2"+
		"\2\2\u060d\u060f\5\u00c8e\2\u060e\u05d8\3\2\2\2\u060e\u05e3\3\2\2\2\u060e"+
		"\u05ee\3\2\2\2\u060e\u05fa\3\2\2\2\u060e\u0606\3\2\2\2\u060f\u0612\3\2"+
		"\2\2\u0610\u060e\3\2\2\2\u0610\u0611\3\2\2\2\u0611\u00cb\3\2\2\2\u0612"+
		"\u0610\3\2\2\2\u0613\u0615\5\u00ceh\2\u0614\u0613\3\2\2\2\u0615\u0616"+
		"\3\2\2\2\u0616\u0614\3\2\2\2\u0616\u0617\3\2\2\2\u0617\u0626\3\2\2\2\u0618"+
		"\u061c\7\17\2\2\u0619\u061b\7y\2\2\u061a\u0619\3\2\2\2\u061b\u061e\3\2"+
		"\2\2\u061c\u061a\3\2\2\2\u061c\u061d\3\2\2\2\u061d\u0620\3\2\2\2\u061e"+
		"\u061c\3\2\2\2\u061f\u0621\5\u00ceh\2\u0620\u061f\3\2\2\2\u0621\u0622"+
		"\3\2\2\2\u0622\u0620\3\2\2\2\u0622\u0623\3\2\2\2\u0623\u0625\3\2\2\2\u0624"+
		"\u0618\3\2\2\2\u0625\u0628\3\2\2\2\u0626\u0624\3\2\2\2\u0626\u0627\3\2"+
		"\2\2\u0627\u062a\3\2\2\2\u0628\u0626\3\2\2\2\u0629\u0614\3\2\2\2\u0629"+
		"\u062a\3\2\2\2\u062a\u00cd\3\2\2\2\u062b\u062f\5\u009cO\2\u062c\u062e"+
		"\7y\2\2\u062d\u062c\3\2\2\2\u062e\u0631\3\2\2\2\u062f\u062d\3\2\2\2\u062f"+
		"\u0630\3\2\2\2\u0630\u00cf\3\2\2\2\u0631\u062f\3\2\2\2\u0632\u0639\5\u0092"+
		"J\2\u0633\u0639\5\u00dan\2\u0634\u0635\7\3\2\2\u0635\u0636\5\u009aN\2"+
		"\u0636\u0637\7\4\2\2\u0637\u0639\3\2\2\2\u0638\u0632\3\2\2\2\u0638\u0633"+
		"\3\2\2\2\u0638\u0634\3\2\2\2\u0639\u00d1\3\2\2\2\u063a\u063b\7v\2\2\u063b"+
		"\u00d3\3\2\2\2\u063c\u063d\7y\2\2\u063d\u00d5\3\2\2\2\u063e\u063f\t\13"+
		"\2\2\u063f\u00d7\3\2\2\2\u0640\u0641\t\f\2\2\u0641\u00d9\3\2\2\2\u0642"+
		"\u0643\t\r\2\2\u0643\u00db\3\2\2\2\u0644\u0645\t\16\2\2\u0645\u00dd\3"+
		"\2\2\2\u0646\u0647\t\17\2\2\u0647\u00df\3\2\2\2\u0648\u0649\t\20\2\2\u0649"+
		"\u00e1\3\2\2\2\u064a\u064d\t\21\2\2\u064b\u064c\7\'\2\2\u064c\u064e\7"+
		"(\2\2\u064d\u064b\3\2\2\2\u064d\u064e\3\2\2\2\u064e\u0678\3\2\2\2\u064f"+
		"\u0678\7%\2\2\u0650\u0678\7\23\2\2\u0651\u0678\7\30\2\2\u0652\u0678\7"+
		"\24\2\2\u0653\u0678\7&\2\2\u0654\u0678\7!\2\2\u0655\u0678\7\"\2\2\u0656"+
		"\u0678\7 \2\2\u0657\u0678\7.\2\2\u0658\u0678\7/\2\2\u0659\u0678\7\7\2"+
		"\2\u065a\u0678\7\20\2\2\u065b\u0678\7\21\2\2\u065c\u0678\7\63\2\2\u065d"+
		"\u0678\7\64\2\2\u065e\u0678\7\65\2\2\u065f\u0678\7\66\2\2\u0660\u0678"+
		"\7\67\2\2\u0661\u0678\78\2\2\u0662\u0678\79\2\2\u0663\u0678\7:\2\2\u0664"+
		"\u0678\7$\2\2\u0665\u0678\7#\2\2\u0666\u0678\7;\2\2\u0667\u0678\7<\2\2"+
		"\u0668\u0678\7=\2\2\u0669\u0678\7>\2\2\u066a\u0678\7\60\2\2\u066b\u0678"+
		"\7\61\2\2\u066c\u0678\7\37\2\2\u066d\u0678\7\36\2\2\u066e\u0678\7,\2\2"+
		"\u066f\u0678\7+\2\2\u0670\u0678\7\17\2\2\u0671\u0678\7?\2\2\u0672\u0678"+
		"\7-\2\2\u0673\u0674\7\3\2\2\u0674\u0678\7\4\2\2\u0675\u0676\7\'\2\2\u0676"+
		"\u0678\7(\2\2\u0677\u064a\3\2\2\2\u0677\u064f\3\2\2\2\u0677\u0650\3\2"+
		"\2\2\u0677\u0651\3\2\2\2\u0677\u0652\3\2\2\2\u0677\u0653\3\2\2\2\u0677"+
		"\u0654\3\2\2\2\u0677\u0655\3\2\2\2\u0677\u0656\3\2\2\2\u0677\u0657\3\2"+
		"\2\2\u0677\u0658\3\2\2\2\u0677\u0659\3\2\2\2\u0677\u065a\3\2\2\2\u0677"+
		"\u065b\3\2\2\2\u0677\u065c\3\2\2\2\u0677\u065d\3\2\2\2\u0677\u065e\3\2"+
		"\2\2\u0677\u065f\3\2\2\2\u0677\u0660\3\2\2\2\u0677\u0661\3\2\2\2\u0677"+
		"\u0662\3\2\2\2\u0677\u0663\3\2\2\2\u0677\u0664\3\2\2\2\u0677\u0665\3\2"+
		"\2\2\u0677\u0666\3\2\2\2\u0677\u0667\3\2\2\2\u0677\u0668\3\2\2\2\u0677"+
		"\u0669\3\2\2\2\u0677\u066a\3\2\2\2\u0677\u066b\3\2\2\2\u0677\u066c\3\2"+
		"\2\2\u0677\u066d\3\2\2\2\u0677\u066e\3\2\2\2\u0677\u066f\3\2\2\2\u0677"+
		"\u0670\3\2\2\2\u0677\u0671\3\2\2\2\u0677\u0672\3\2\2\2\u0677\u0673\3\2"+
		"\2\2\u0677\u0675\3\2\2\2\u0678\u00e3\3\2\2\2\u0679\u067a\t\22\2\2\u067a"+
		"\u00e5\3\2\2\2\u067b\u067c\t\23\2\2\u067c\u00e7\3\2\2\2\u067d\u067e\7"+
		"[\2\2\u067e\u067f\7\20\2\2\u067f\u0680\5\u00eav\2\u0680\u0681\7\21\2\2"+
		"\u0681\u00e9\3\2\2\2\u0682\u0683\7\20\2\2\u0683\u0684\5\u00eav\2\u0684"+
		"\u0685\7\21\2\2\u0685\u068c\3\2\2\2\u0686\u0687\7\3\2\2\u0687\u0688\5"+
		"\u00eav\2\u0688\u0689\7\4\2\2\u0689\u068c\3\2\2\2\u068a\u068c\5\u00f2"+
		"z\2\u068b\u0682\3\2\2\2\u068b\u0686\3\2\2\2\u068b\u068a\3\2\2\2\u068c"+
		"\u068d\3\2\2\2\u068d\u068b\3\2\2\2\u068d\u068e\3\2\2\2\u068e\u00eb\3\2"+
		"\2\2\u068f\u0690\n\24\2\2\u0690\u00ed\3\2\2\2\u0691\u0692\n\25\2\2\u0692"+
		"\u00ef\3\2\2\2\u0693\u0694\n\26\2\2\u0694\u00f1\3\2\2\2\u0695\u0696\n"+
		"\27\2\2\u0696\u00f3\3\2\2\2\u0697\u0698\n\30\2\2\u0698\u00f5\3\2\2\2\u0699"+
		"\u069a\n\31\2\2\u069a\u00f7\3\2\2\2\u069b\u069c\n\32\2\2\u069c\u00f9\3"+
		"\2\2\2\u069d\u069e\n\33\2\2\u069e\u00fb\3\2\2\2\u069f\u06a0\n\34\2\2\u06a0"+
		"\u00fd\3\2\2\2\u06a1\u06a2\n\25\2\2\u06a2\u00ff\3\2\2\2\u06a3\u06a4\13"+
		"\2\2\2\u06a4\u0101\3\2\2\2\u06a5\u06a6\5\u0104\u0083\2\u06a6\u06a8\7\3"+
		"\2\2\u06a7\u06a9\5\u009aN\2\u06a8\u06a7\3\2\2\2\u06a8\u06a9\3\2\2\2\u06a9"+
		"\u06aa\3\2\2\2\u06aa\u06ab\7\4\2\2\u06ab\u06b2\3\2\2\2\u06ac\u06ad\5\u0104"+
		"\u0083\2\u06ad\u06ae\7\7\2\2\u06ae\u06af\5x=\2\u06af\u06b2\3\2\2\2\u06b0"+
		"\u06b2\5\u0104\u0083\2\u06b1\u06a5\3\2\2\2\u06b1\u06ac\3\2\2\2\u06b1\u06b0"+
		"\3\2\2\2\u06b2\u0103\3\2\2\2\u06b3\u06b5\5\u0096L\2\u06b4\u06b3\3\2\2"+
		"\2\u06b4\u06b5\3\2\2\2\u06b5\u06b6\3\2\2\2\u06b6\u06b8\5\u0092J\2\u06b7"+
		"\u06b9\5\u0106\u0084\2\u06b8\u06b7\3\2\2\2\u06b8\u06b9\3\2\2\2\u06b9\u06c4"+
		"\3\2\2\2\u06ba\u06bc\5\u0096L\2\u06bb\u06ba\3\2\2\2\u06bb\u06bc\3\2\2"+
		"\2\u06bc\u06bd\3\2\2\2\u06bd\u06be\7\3\2\2\u06be\u06bf\5\u0098M\2\u06bf"+
		"\u06c0\5\u0092J\2\u06c0\u06c1\7\4\2\2\u06c1\u06c2\5\u0106\u0084\2\u06c2"+
		"\u06c4\3\2\2\2\u06c3\u06b4\3\2\2\2\u06c3\u06bb\3\2\2\2\u06c4\u0105\3\2"+
		"\2\2\u06c5\u06c7\7\'\2\2\u06c6\u06c8\5\u009eP\2\u06c7\u06c6\3\2\2\2\u06c7"+
		"\u06c8\3\2\2\2\u06c8\u06c9\3\2\2\2\u06c9\u06cc\7(\2\2\u06ca\u06cc\5\u008c"+
		"G\2\u06cb\u06c5\3\2\2\2\u06cb\u06ca\3\2\2\2\u06cc\u0107\3\2\2\2\u00ed"+
		"\u010b\u011a\u0127\u0139\u013c\u0140\u0144\u014c\u014e\u0154\u0160\u0165"+
		"\u0168\u016b\u0170\u0175\u017e\u0185\u018c\u0191\u0195\u019b\u01af\u01b9"+
		"\u01c8\u01d0\u01d6\u01db\u01df\u01eb\u01ed\u01f1\u01f8\u01fc\u0202\u0205"+
		"\u020b\u0210\u0215\u0219\u0221\u0229\u0235\u0237\u0247\u024b\u0252\u0258"+
		"\u025c\u0261\u0267\u026e\u0273\u0277\u027a\u027d\u0281\u028d\u0292\u0296"+
		"\u029b\u02a2\u02a7\u02ae\u02b3\u02b9\u02c1\u02c5\u02c9\u02cd\u02d2\u02d6"+
		"\u02dd\u02e3\u02ea\u02ee\u02f4\u02f7\u02fe\u0301\u030c\u0313\u0319\u0324"+
		"\u032e\u0337\u033c\u0342\u0345\u0349\u034c\u034f\u0352\u0356\u035b\u035f"+
		"\u0362\u0365\u0367\u036b\u0371\u0376\u037b\u0387\u038c\u0391\u0396\u0399"+
		"\u03a6\u03aa\u03ad\u03b7\u03b9\u03bf\u03c7\u03cb\u03d3\u03d5\u03d9\u03de"+
		"\u03e1\u03e9\u03ef\u03f3\u03f7\u03fc\u03ff\u0402\u0408\u040c\u0410\u0415"+
		"\u0417\u041a\u0421\u0426\u042c\u0430\u0439\u043f\u0446\u044a\u0450\u0457"+
		"\u045e\u0463\u046a\u0471\u0478\u047f\u0484\u048a\u0491\u0495\u049b\u04a2"+
		"\u04a6\u04ac\u04b3\u04b7\u04bd\u04c4\u04c8\u04ce\u04d5\u04d9\u04df\u04e6"+
		"\u04eb\u04f1\u04f8\u04fd\u0503\u050a\u050e\u0514\u051b\u051f\u0525\u052c"+
		"\u0530\u0538\u053e\u0544\u054c\u054f\u0555\u055c\u0561\u0566\u056c\u0573"+
		"\u0578\u057c\u0582\u058b\u0596\u059b\u05a3\u05ae\u05b2\u05b8\u05be\u05c8"+
		"\u05ce\u05d2\u05d6\u05dc\u05e7\u05f3\u05f7\u05ff\u0603\u060a\u060e\u0610"+
		"\u0616\u061c\u0622\u0626\u0629\u062f\u0638\u064d\u0677\u068b\u068d\u06a8"+
		"\u06b1\u06b4\u06b8\u06bb\u06c3\u06c7\u06cb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}