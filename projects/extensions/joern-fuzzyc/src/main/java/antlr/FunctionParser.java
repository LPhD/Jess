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
		RULE_primary_expression = 131, RULE_null_expression = 132, RULE_preprocessor_fragment = 133, 
		RULE_expression_fragment = 134, RULE_init_declarator = 135, RULE_declarator = 136, 
		RULE_type_suffix = 137;
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
		"null_expression", "preprocessor_fragment", "expression_fragment", "init_declarator", 
		"declarator", "type_suffix"
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
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << NEWLINE) | (1L << ESCAPE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ELLIPSIS - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (ASM - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (HEX_FLOAT - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (WHITESPACE - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(276);
				statement();
				}
				}
				setState(281);
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
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				opening_curly();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				closing_curly();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				block_starter();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				jump_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(286);
				label();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(287);
				simple_decl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(288);
				expr_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(289);
				pre_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(290);
				comment();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(291);
				newline();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(292);
				custom();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(293);
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
			setState(296);
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
			setState(298);
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
			setState(300);
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
			setState(381);
			switch (_input.LA(1)) {
			case TRY:
				_localctx = new Try_statementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(TRY);
				}
				break;
			case CATCH:
				_localctx = new Catch_statementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				match(CATCH);
				setState(313);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(304);
					match(T__0);
					setState(307);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(305);
						param_type();
						}
						break;
					case 2:
						{
						setState(306);
						match(ELLIPSIS);
						}
						break;
					}
					setState(310);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(309);
						match(NEWLINE);
						}
					}

					setState(312);
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
				setState(315);
				match(IF);
				setState(316);
				match(T__0);
				setState(318);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(317);
					match(NEWLINE);
					}
				}

				setState(320);
				condition();
				setState(322);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(321);
					match(NEWLINE);
					}
				}

				setState(324);
				match(T__1);
				}
				break;
			case ELSE:
				_localctx = new Else_statementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(326);
				match(ELSE);
				}
				break;
			case SWITCH:
				_localctx = new Switch_statementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(327);
				match(SWITCH);
				setState(328);
				match(T__0);
				setState(330);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(329);
					match(NEWLINE);
					}
				}

				setState(332);
				condition();
				setState(334);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(333);
					match(NEWLINE);
					}
				}

				setState(336);
				match(T__1);
				}
				break;
			case FOR:
				_localctx = new For_statementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(338);
				match(FOR);
				setState(339);
				match(T__0);
				setState(341);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(340);
					match(NEWLINE);
					}
				}

				setState(345);
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
					setState(343);
					for_init_statement();
					}
					break;
				case T__2:
					{
					setState(344);
					match(T__2);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(348);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(347);
					match(NEWLINE);
					}
				}

				setState(351);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(350);
					condition();
					}
				}

				setState(353);
				match(T__2);
				setState(355);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(354);
					match(NEWLINE);
					}
					break;
				}
				setState(358);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(357);
					expr();
					}
				}

				setState(361);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(360);
					match(NEWLINE);
					}
				}

				setState(363);
				match(T__1);
				setState(365);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(364);
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
				setState(367);
				match(DO);
				}
				break;
			case WHILE:
				_localctx = new While_statementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(368);
				match(WHILE);
				setState(369);
				match(T__0);
				setState(371);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(370);
					match(NEWLINE);
					}
				}

				setState(373);
				condition();
				setState(375);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(374);
					match(NEWLINE);
					}
				}

				setState(377);
				match(T__1);
				setState(379);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(378);
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
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				simple_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				expr();
				setState(385);
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
			setState(407);
			switch (_input.LA(1)) {
			case BREAK:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				match(BREAK);
				setState(390);
				match(T__2);
				}
				break;
			case CONTINUE:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				match(CONTINUE);
				setState(392);
				match(T__2);
				}
				break;
			case GOTO:
				_localctx = new GotoStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(393);
				match(GOTO);
				setState(394);
				identifier();
				setState(395);
				match(T__2);
				}
				break;
			case RETURN:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(397);
				match(RETURN);
				setState(399);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(398);
					expr();
					}
				}

				setState(401);
				match(T__2);
				}
				break;
			case THROW:
				_localctx = new ThrowStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(402);
				match(THROW);
				setState(404);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(403);
					expr();
					}
				}

				setState(406);
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
			setState(410);
			_la = _input.LA(1);
			if (_la==CASE) {
				{
				setState(409);
				match(CASE);
				}
			}

			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(412);
				identifier();
				}
				break;
			case 2:
				{
				setState(413);
				number();
				}
				break;
			case 3:
				{
				setState(414);
				match(CHAR);
				}
				break;
			case 4:
				{
				setState(415);
				cast_expression();
				}
				break;
			}
			setState(418);
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
			setState(424);
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
				setState(420);
				expr();
				setState(421);
				match(T__2);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
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
			setState(426);
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
			setState(430);
			switch (_input.LA(1)) {
			case PRE_IF:
			case PRE_ELIF:
			case PRE_ELSE:
			case PRE_ENDIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
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
				setState(429);
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
			setState(436);
			switch (_input.LA(1)) {
			case PRE_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				pre_if_statement();
				}
				break;
			case PRE_ELIF:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				pre_elif_statement();
				}
				break;
			case PRE_ELSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(434);
				pre_else_statement();
				}
				break;
			case PRE_ENDIF:
				enterOuterAlt(_localctx, 4);
				{
				setState(435);
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
			setState(438);
			match(PRE_IF);
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
			setState(442);
			match(PRE_ELIF);
			setState(443);
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
			setState(446);
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
			setState(448);
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
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				match(T__0);
				setState(452);
				condition();
				setState(453);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(455);
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
			setState(467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				pre_define();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				pre_undef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(460);
				pre_diagnostic();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(461);
				pre_other();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(462);
				pre_include();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(463);
				pre_include_next();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(464);
				pre_line();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(465);
				pre_pragma();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(466);
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
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				match(PRE_DEFINE);
				setState(470);
				pre_macro_identifier();
				setState(471);
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
				setState(473);
				match(PRE_DEFINE);
				setState(474);
				pre_macro_identifier();
				setState(475);
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
			setState(479);
			match(PRE_UNDEF);
			setState(480);
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
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				identifier();
				setState(487);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(483);
					match(T__0);
					setState(484);
					pre_macro_parameters();
					setState(485);
					match(T__1);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(489);
				keyword();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(490);
				match(END_TEST);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(491);
				match(T__4);
				setState(496);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(492);
					match(T__0);
					setState(493);
					pre_macro_parameters();
					setState(494);
					match(T__1);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(498);
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
			setState(501);
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
			setState(505);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case NEW:
			case PRE_PRAGMA_KEYWORDS:
			case ALPHA_NUMERIC:
				{
				setState(503);
				identifier();
				}
				break;
			case ELLIPSIS:
				{
				setState(504);
				match(ELLIPSIS);
				}
				break;
			case T__1:
			case T__12:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(507);
				match(T__12);
				setState(510);
				switch (_input.LA(1)) {
				case T__8:
				case T__9:
				case T__10:
				case NEW:
				case PRE_PRAGMA_KEYWORDS:
				case ALPHA_NUMERIC:
					{
					setState(508);
					identifier();
					}
					break;
				case ELLIPSIS:
					{
					setState(509);
					match(ELLIPSIS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(516);
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
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(520); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(520);
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
						setState(517);
						expr();
						}
						break;
					case ESCAPE:
						{
						setState(518);
						match(ESCAPE);
						setState(519);
						match(NEWLINE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(522); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60) | (1L << ESCAPE))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0) );
				setState(524);
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
			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(528);
				pre_macro_identifier();
				}
				break;
			}
			setState(531);
			pre_macro_identifier();
			setState(532);
			match(T__0);
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				{
				setState(537);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
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
				setState(540);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(539);
					match(NEWLINE);
					}
				}

				}
				setState(554);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(542);
						match(T__12);
						setState(544);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(543);
							match(NEWLINE);
							}
						}

						setState(550);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
						case 1:
							{
							setState(546);
							expr();
							}
							break;
						case 2:
							{
							setState(547);
							type_name();
							}
							break;
						case 3:
							{
							setState(548);
							relational_operator();
							}
							break;
						case 4:
							{
							setState(549);
							equality_operator();
							}
							break;
						}
						}
						} 
					}
					setState(556);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				setState(558);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(557);
					match(T__12);
					}
				}

				}
				break;
			case 2:
				{
				setState(560);
				match(VOID);
				}
				break;
			}
			setState(563);
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
			setState(568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				match(PRE_DIAGNOSTIC);
				setState(566);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(567);
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
			setState(589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				match(PRE_OTHER);
				setState(572);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(571);
					match(STRING);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(574);
				match(PRE_ATTRIBUTE);
				setState(575);
				match(T__0);
				setState(576);
				match(T__0);
				setState(578);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(577);
					attributeList();
					}
				}

				setState(580);
				match(T__1);
				setState(581);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(582);
				match(PRE_ATTRIBUTE);
				setState(583);
				match(T__0);
				setState(585);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(584);
					attributeList();
					}
				}

				setState(587);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(588);
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
			setState(591);
			attribute();
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(592);
				match(T__12);
				setState(593);
				attribute();
				}
				}
				setState(598);
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
			setState(627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
				pre_macro_identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				pre_macro_identifier();
				setState(601);
				match(T__0);
				setState(602);
				identifier();
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(603);
					match(T__12);
					setState(604);
					expr();
					}
					}
					setState(609);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(610);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(612);
				pre_macro_identifier();
				setState(613);
				match(T__0);
				setState(615);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(614);
					expr();
					}
				}

				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(617);
					match(T__12);
					setState(618);
					expr();
					}
					}
					setState(623);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(624);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(626);
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
			setState(634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				match(PRE_INCLUDE);
				setState(630);
				pre_include_local_file();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
				match(PRE_INCLUDE);
				setState(632);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(633);
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
			setState(641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(636);
				match(PRE_INCLUDE_NEXT);
				setState(637);
				pre_include_local_file();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(638);
				match(PRE_INCLUDE_NEXT);
				setState(639);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(640);
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
			setState(643);
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
			setState(645);
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
			setState(661);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(647);
				match(PRE_LINE);
				setState(648);
				match(DECIMAL_LITERAL);
				setState(649);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(650);
				match(PRE_LINE);
				setState(651);
				match(DECIMAL_LITERAL);
				setState(652);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(653);
				match(PRE_LINE);
				setState(654);
				pre_macro_identifier();
				setState(655);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(657);
				match(PRE_LINE);
				setState(658);
				pre_macro_identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(659);
				match(PRE_LINE);
				setState(660);
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
			setState(683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(663);
				match(PRE_PRAGMA);
				setState(665);
				_la = _input.LA(1);
				if (_la==PRE_GCC) {
					{
					setState(664);
					match(PRE_GCC);
					}
				}

				setState(667);
				match(PRE_PRAGMA_KEYWORDS);
				setState(668);
				match(STRING);
				 preProcFindMacroEnd(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(670);
				match(PRE_PRAGMA);
				setState(672);
				_la = _input.LA(1);
				if (_la==PRE_GCC) {
					{
					setState(671);
					match(PRE_GCC);
					}
				}

				setState(674);
				match(PRE_PRAGMA_KEYWORDS);
				setState(678);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(675);
						identifier();
						}
						} 
					}
					setState(680);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(681);
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
			setState(685);
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
			setState(687);
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
			setState(689);
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
			setState(691);
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
			setState(716);
			switch (_input.LA(1)) {
			case HEX_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(693);
				match(HEX_LITERAL);
				}
				break;
			case OCTAL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(694);
				match(OCTAL_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(695);
				match(DECIMAL_LITERAL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(709); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(696);
						match(STRING);
						setState(698);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
						case 1:
							{
							setState(697);
							match(NEWLINE);
							}
							break;
						}
						setState(703);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(700);
								match(COMMENT);
								}
								} 
							}
							setState(705);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
						}
						setState(707);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
						case 1:
							{
							setState(706);
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
					setState(711); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(713);
				match(CHAR);
				}
				break;
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(714);
				match(FLOATING_POINT_LITERAL);
				}
				break;
			case HEX_FLOAT:
				enterOuterAlt(_localctx, 7);
				{
				setState(715);
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
			setState(718);
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
			setState(720);
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
			setState(722);
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
			setState(769);
			switch (_input.LA(1)) {
			case T__23:
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(724);
				_la = _input.LA(1);
				if ( !(_la==T__23 || _la==NEW) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(727);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(725);
					match(T__24);
					setState(726);
					match(T__25);
					}
				}

				}
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(729);
				match(T__15);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(730);
				match(T__16);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(731);
				match(T__14);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 5);
				{
				setState(732);
				match(T__26);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 6);
				{
				setState(733);
				match(T__27);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 7);
				{
				setState(734);
				match(T__28);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 8);
				{
				setState(735);
				match(T__13);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 9);
				{
				setState(736);
				match(T__29);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 10);
				{
				setState(737);
				match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 11);
				{
				setState(738);
				match(T__18);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 12);
				{
				setState(739);
				match(T__30);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 13);
				{
				setState(740);
				match(T__19);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 14);
				{
				setState(741);
				match(T__20);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 15);
				{
				setState(742);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 16);
				{
				setState(743);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 17);
				{
				setState(744);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 18);
				{
				setState(745);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 19);
				{
				setState(746);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 20);
				{
				setState(747);
				match(T__36);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 21);
				{
				setState(748);
				match(T__37);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 22);
				{
				setState(749);
				match(T__38);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 23);
				{
				setState(750);
				match(T__39);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 24);
				{
				setState(751);
				match(T__40);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 25);
				{
				setState(752);
				match(T__41);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 26);
				{
				setState(753);
				match(T__42);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 27);
				{
				setState(754);
				match(T__43);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 28);
				{
				setState(755);
				match(T__44);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 29);
				{
				setState(756);
				match(T__21);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 30);
				{
				setState(757);
				match(T__22);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 31);
				{
				setState(758);
				match(T__45);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 32);
				{
				setState(759);
				match(T__46);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 33);
				{
				setState(760);
				match(T__47);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 34);
				{
				setState(761);
				match(T__48);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 35);
				{
				setState(762);
				match(T__12);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 36);
				{
				setState(763);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 37);
				{
				setState(764);
				match(T__50);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 38);
				{
				setState(765);
				match(T__0);
				setState(766);
				match(T__1);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 39);
				{
				setState(767);
				match(T__24);
				setState(768);
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
			setState(771);
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
			setState(773);
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
			setState(775);
			match(TEMPLATE);
			setState(776);
			match(T__19);
			setState(777);
			template_param_list();
			setState(778);
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
			setState(789); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(789);
				switch (_input.LA(1)) {
				case T__19:
					{
					{
					setState(780);
					match(T__19);
					setState(781);
					template_param_list();
					setState(782);
					match(T__20);
					}
					}
					break;
				case T__0:
					{
					{
					setState(784);
					match(T__0);
					setState(785);
					template_param_list();
					setState(786);
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
					setState(788);
					no_angle_brackets_or_brackets();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(791); 
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
			setState(793);
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
			setState(795);
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
			setState(797);
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
			setState(799);
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
			setState(801);
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
			setState(803);
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
			setState(805);
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
			setState(807);
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
			setState(809);
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
			setState(811);
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
			setState(813);
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
			setState(819);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(815);
				asciiTab();
				}
				break;
			case 2:
				{
				setState(816);
				externC();
				}
				break;
			case 3:
				{
				setState(817);
				macroFunctionPointer();
				}
				break;
			case 4:
				{
				setState(818);
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
			setState(824); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(821);
					pre_macro_identifier();
					setState(822);
					match(T__12);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(826); 
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
			setState(828);
			match(EXTERN);
			setState(829);
			match(T__51);
			setState(831);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(830);
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
			setState(833);
			macroCall();
			setState(835);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(834);
				match(NEWLINE);
				}
				break;
			}
			setState(838);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(837);
				pre_macro_identifier();
				}
				break;
			}
			setState(841);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(840);
				match(NEWLINE);
				}
			}

			setState(843);
			macroCall();
			setState(845);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(844);
				match(NEWLINE);
				}
			}

			setState(847);
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
			setState(849);
			match(T__4);
			setState(850);
			match(T__0);
			setState(851);
			function_name();
			setState(852);
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
			setState(854);
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
		enterRule(_localctx, 132, RULE_function_def);
		int _la;
		try {
			setState(902);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(857);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(856);
					template_decl_start();
					}
				}

				setState(860);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(859);
					return_type();
					}
					break;
				}
				setState(869);
				_la = _input.LA(1);
				if (_la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(862);
					pre_other();
					setState(866);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
						{
						{
						setState(863);
						expression_fragment();
						}
						}
						setState(868);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(871);
				function_name();
				setState(875);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(872);
					expression_fragment();
					}
					}
					setState(877);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(878);
				function_param_list();
				setState(880);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(879);
					ctor_list();
					}
				}

				setState(885);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(882);
					expression_fragment();
					}
					}
					setState(887);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(888);
				compound_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(891);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(890);
					return_type();
					}
					break;
				}
				setState(893);
				macroCall_asFunctionHeader();
				setState(897);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(894);
					expression_fragment();
					}
					}
					setState(899);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(900);
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
			setState(904);
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
		enterRule(_localctx, 136, RULE_return_type);
		int _la;
		try {
			int _alt;
			setState(939);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(915);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(906);
						function_decl_specifiers();
						setState(910);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
							{
							{
							setState(907);
							expression_fragment();
							}
							}
							setState(912);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						} 
					}
					setState(917);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				}
				setState(918);
				type_name();
				}
				setState(929);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13 || _la==T__14) {
					{
					{
					setState(920);
					ptr_operator();
					setState(924);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
						{
						{
						setState(921);
						expression_fragment();
						}
						}
						setState(926);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(931);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(932);
				macroCall();
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(933);
					expression_fragment();
					}
					}
					setState(938);
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
		enterRule(_localctx, 138, RULE_function_param_list);
		int _la;
		try {
			int _alt;
			setState(1036);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(941);
				match(T__0);
				setState(945);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(942);
						expression_fragment();
						}
						} 
					}
					setState(947);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				}
				setState(949);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(948);
					parameter_decl_clause();
					}
					break;
				}
				setState(954);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(951);
					expression_fragment();
					}
					}
					setState(956);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(957);
				match(T__1);
				setState(959);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(958);
					match(T__14);
					}
				}

				setState(970);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CV_QUALIFIER) {
					{
					{
					setState(961);
					match(CV_QUALIFIER);
					setState(965);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(962);
							expression_fragment();
							}
							} 
						}
						setState(967);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
					}
					}
					}
					setState(972);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(974);
				_la = _input.LA(1);
				if (_la==THROW) {
					{
					setState(973);
					exception_specification();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(976);
				match(T__0);
				setState(980);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(977);
					expression_fragment();
					}
					}
					setState(982);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(983);
				parameter_name();
				setState(994);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(984);
					match(T__12);
					setState(988);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
						{
						{
						setState(985);
						expression_fragment();
						}
						}
						setState(990);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(991);
					parameter_name();
					}
					}
					setState(996);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1000);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(997);
					expression_fragment();
					}
					}
					setState(1002);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1003);
				match(T__1);
				setState(1007);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1004);
					expression_fragment();
					}
					}
					setState(1009);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1032); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1010);
					type_name();
					setState(1011);
					parameter_id();
					setState(1022);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(1012);
						match(T__12);
						setState(1016);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
							{
							{
							setState(1013);
							expression_fragment();
							}
							}
							setState(1018);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1019);
						parameter_id();
						}
						}
						setState(1024);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1025);
					match(T__2);
					setState(1029);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1026);
							expression_fragment();
							}
							} 
						}
						setState(1031);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
					}
					}
					}
					setState(1034); 
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
		enterRule(_localctx, 140, RULE_parameter_decl_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1041);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
				{
				{
				setState(1038);
				expression_fragment();
				}
				}
				setState(1043);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1044);
			parameter_decl();
			setState(1061);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1048);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
						{
						{
						setState(1045);
						expression_fragment();
						}
						}
						setState(1050);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1051);
					match(T__12);
					setState(1055);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
						{
						{
						setState(1052);
						expression_fragment();
						}
						}
						setState(1057);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1058);
					parameter_decl();
					}
					} 
				}
				setState(1063);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			}
			}
			setState(1078);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1067);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1064);
					expression_fragment();
					}
					}
					setState(1069);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1070);
				match(T__12);
				setState(1074);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1071);
					expression_fragment();
					}
					}
					setState(1076);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1077);
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
		enterRule(_localctx, 142, RULE_parameter_decl);
		try {
			setState(1084);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1080);
				match(VOID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1081);
				type_name();
				setState(1082);
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
			setState(1087);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__14) {
				{
				setState(1086);
				ptrs();
				}
			}

			setState(1094);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(1089);
				match(T__0);
				setState(1090);
				parameter_id();
				setState(1091);
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
				setState(1093);
				parameter_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1097);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__24) {
				{
				setState(1096);
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
			setState(1099);
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
			setState(1102);
			match(T__3);
			setState(1103);
			ctor_initializer();
			setState(1108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(1104);
				match(T__12);
				setState(1105);
				ctor_initializer();
				}
				}
				setState(1110);
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
			setState(1111);
			initializer_id();
			setState(1112);
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
			setState(1115);
			_la = _input.LA(1);
			if (_la==T__52) {
				{
				setState(1114);
				match(T__52);
				}
			}

			setState(1117);
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
			setState(1119);
			match(T__0);
			setState(1121);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
				{
				setState(1120);
				expr();
				}
			}

			setState(1123);
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
			setState(1132);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case NEW:
			case PRE_PRAGMA_KEYWORDS:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1125);
				identifier();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(1126);
				match(T__0);
				setState(1127);
				function_name();
				setState(1128);
				match(T__1);
				}
				break;
			case OPERATOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1130);
				match(OPERATOR);
				setState(1131);
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
			setState(1134);
			match(THROW);
			setState(1135);
			match(T__0);
			setState(1136);
			type_id_list();
			setState(1137);
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
			setState(1142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << NEWLINE) | (1L << ESCAPE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ELLIPSIS - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (ASM - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (HEX_FLOAT - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (WHITESPACE - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(1139);
				no_brackets();
				}
				}
				setState(1144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(1145);
				match(T__0);
				setState(1146);
				type_id_list();
				setState(1147);
				match(T__1);
				setState(1151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << NEWLINE) | (1L << ESCAPE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ELLIPSIS - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (ASM - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (HEX_FLOAT - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (WHITESPACE - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(1148);
					no_brackets();
					}
					}
					setState(1153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(1158);
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
			setState(1159);
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
			setState(1235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				_localctx = new DeclByClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1162);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(1161);
					template_decl_start();
					}
				}

				setState(1164);
				class_def();
				setState(1166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(1165);
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
				setState(1172);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(1168);
					match(TYPEDEF);
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
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(1174);
					template_decl_start();
					}
				}

				setState(1177);
				type_name();
				setState(1178);
				init_declarator_list();
				}
				break;
			case 3:
				_localctx = new FunctionPointerDeclareContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1184);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(1180);
					match(TYPEDEF);
					setState(1182);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1181);
						match(NEWLINE);
						}
					}

					}
				}

				setState(1186);
				type_name();
				setState(1187);
				match(T__0);
				setState(1189);
				_la = _input.LA(1);
				if (_la==ALPHA_NUMERIC) {
					{
					setState(1188);
					callingConvention();
					}
				}

				setState(1191);
				ptr_operator();
				setState(1193);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (NEW - 96)) | (1L << (PRE_PRAGMA_KEYWORDS - 96)) | (1L << (ALPHA_NUMERIC - 96)))) != 0)) {
					{
					setState(1192);
					identifier();
					}
				}

				setState(1195);
				match(T__1);
				setState(1196);
				param_type_list();
				setState(1198);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1197);
					match(NEWLINE);
					}
				}

				setState(1202);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(1200);
					pre_other();
					}
					break;
				case 2:
					{
					setState(1201);
					macroCall();
					}
					break;
				}
				setState(1209);
				_la = _input.LA(1);
				if (_la==T__30) {
					{
					setState(1204);
					match(T__30);
					setState(1206);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
					case 1:
						{
						setState(1205);
						match(NEWLINE);
						}
						break;
					}
					setState(1208);
					argument();
					}
				}

				setState(1211);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new StructUnionEnumContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1223);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (TYPEDEF - 76)) | (1L << (STATIC - 76)) | (1L << (CV_QUALIFIER - 76)) | (1L << (VIRTUAL - 76)))) != 0)) {
					{
					setState(1216); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						setState(1216);
						switch (_input.LA(1)) {
						case CV_QUALIFIER:
							{
							setState(1213);
							match(CV_QUALIFIER);
							}
							break;
						case T__5:
						case T__6:
						case T__7:
						case STATIC:
						case VIRTUAL:
							{
							setState(1214);
							function_decl_specifiers();
							}
							break;
						case TYPEDEF:
							{
							setState(1215);
							match(TYPEDEF);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						setState(1218); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (TYPEDEF - 76)) | (1L << (STATIC - 76)) | (1L << (CV_QUALIFIER - 76)) | (1L << (VIRTUAL - 76)))) != 0) );
					setState(1221);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1220);
						match(NEWLINE);
						}
					}

					}
				}

				setState(1225);
				special_datatype();
				setState(1227);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1226);
					match(NEWLINE);
					}
					break;
				}
				setState(1230);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1229);
					init_declarator_list();
					}
					break;
				}
				setState(1233);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
				case 1:
					{
					setState(1232);
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
			setState(1238); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1237);
				match(ALPHA_NUMERIC);
				}
				}
				setState(1240); 
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
			setState(1289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1242);
				match(SPECIAL_DATA);
				setState(1244);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1243);
					match(NEWLINE);
					}
				}

				setState(1247);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
				case 1:
					{
					setState(1246);
					pre_other();
					}
					break;
				}
				setState(1253);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (NEW - 96)) | (1L << (PRE_PRAGMA_KEYWORDS - 96)) | (1L << (ALPHA_NUMERIC - 96)))) != 0)) {
					{
					setState(1249);
					identifier();
					setState(1251);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1250);
						match(NEWLINE);
						}
					}

					}
				}

				setState(1256);
				_la = _input.LA(1);
				if (_la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(1255);
					pre_other();
					}
				}

				setState(1258);
				match(OPENING_CURLY);
				skipToEndOfObject(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1260);
				match(SPECIAL_DATA);
				setState(1262);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1261);
					match(NEWLINE);
					}
				}

				setState(1265);
				_la = _input.LA(1);
				if (_la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(1264);
					pre_other();
					}
				}

				setState(1267);
				identifier();
				setState(1269);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1268);
					match(NEWLINE);
					}
				}

				setState(1272);
				_la = _input.LA(1);
				if (_la==T__13 || _la==T__14) {
					{
					setState(1271);
					ptrs();
					}
				}

				setState(1274);
				identifier();
				setState(1276);
				_la = _input.LA(1);
				if (_la==T__13 || _la==T__14) {
					{
					setState(1275);
					ptrs();
					}
				}

				setState(1278);
				match(T__30);
				skipToEndOfObject(); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1281);
				match(SPECIAL_DATA);
				setState(1283);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1282);
					match(NEWLINE);
					}
				}

				setState(1286);
				_la = _input.LA(1);
				if (_la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(1285);
					pre_other();
					}
				}

				setState(1288);
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
			setState(1291);
			init_declarator();
			setState(1302);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1293);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1292);
						match(NEWLINE);
						}
					}

					setState(1295);
					match(T__12);
					setState(1297);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1296);
						match(NEWLINE);
						}
					}

					setState(1299);
					init_declarator();
					}
					} 
				}
				setState(1304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			}
			setState(1306);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1305);
				match(NEWLINE);
				}
			}

			setState(1309);
			_la = _input.LA(1);
			if (_la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
				{
				setState(1308);
				pre_other();
				}
			}

			setState(1311);
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
			setState(1313);
			match(CLASS_KEY);
			setState(1315);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1314);
				match(NEWLINE);
				}
			}

			setState(1318);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (NEW - 96)) | (1L << (PRE_PRAGMA_KEYWORDS - 96)) | (1L << (ALPHA_NUMERIC - 96)))) != 0)) {
				{
				setState(1317);
				class_name();
				}
			}

			setState(1321);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(1320);
				base_classes();
				}
			}

			setState(1323);
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
			setState(1326);
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
			setState(1328);
			match(T__3);
			setState(1329);
			base_class();
			setState(1334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(1330);
				match(T__12);
				setState(1331);
				base_class();
				}
				}
				setState(1336);
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
			setState(1341);
			_la = _input.LA(1);
			if (_la==VIRTUAL) {
				{
				setState(1337);
				match(VIRTUAL);
				setState(1339);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1338);
					match(NEWLINE);
					}
				}

				}
			}

			setState(1344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1343);
				access_specifier();
				}
				break;
			}
			setState(1346);
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
			setState(1399); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1399);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
					case 1:
						{
						setState(1348);
						match(EXTERN);
						setState(1350);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
						case 1:
							{
							setState(1349);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 2:
						{
						setState(1352);
						function_decl_specifiers();
						setState(1354);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
						case 1:
							{
							setState(1353);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 3:
						{
						setState(1356);
						match(CV_QUALIFIER);
						setState(1358);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
						case 1:
							{
							setState(1357);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 4:
						{
						setState(1360);
						match(UNSIGNED);
						setState(1362);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
						case 1:
							{
							setState(1361);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 5:
						{
						setState(1364);
						match(SIGNED);
						setState(1366);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
						case 1:
							{
							setState(1365);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 6:
						{
						setState(1368);
						match(AUTO);
						setState(1370);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
						case 1:
							{
							setState(1369);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 7:
						{
						setState(1372);
						match(REGISTER);
						setState(1374);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
						case 1:
							{
							setState(1373);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 8:
						{
						setState(1376);
						ptr_operator();
						setState(1378);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
						case 1:
							{
							setState(1377);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 9:
						{
						setState(1380);
						base_type();
						}
						break;
					case 10:
						{
						{
						{
						setState(1381);
						match(T__19);
						setState(1382);
						template_param_list();
						setState(1383);
						match(T__20);
						}
						setState(1395);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1385);
								match(T__52);
								setState(1386);
								base_type();
								setState(1391);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
								case 1:
									{
									setState(1387);
									match(T__19);
									setState(1388);
									template_param_list();
									setState(1389);
									match(T__20);
									}
									break;
								}
								}
								} 
							}
							setState(1397);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
						}
						}
						}
						break;
					case 11:
						{
						setState(1398);
						macroCall();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1401); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
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
			setState(1431); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1431);
					switch (_input.LA(1)) {
					case VOID:
						{
						setState(1403);
						match(VOID);
						setState(1405);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
						case 1:
							{
							setState(1404);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case T__11:
						{
						setState(1407);
						match(T__11);
						setState(1409);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
						case 1:
							{
							setState(1408);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case T__53:
						{
						setState(1411);
						match(T__53);
						setState(1413);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
						case 1:
							{
							setState(1412);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case T__54:
						{
						setState(1415);
						match(T__54);
						setState(1417);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
						case 1:
							{
							setState(1416);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case SPECIAL_DATA:
						{
						setState(1419);
						match(SPECIAL_DATA);
						setState(1421);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
						case 1:
							{
							setState(1420);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case CLASS_KEY:
						{
						setState(1423);
						match(CLASS_KEY);
						setState(1425);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
						case 1:
							{
							setState(1424);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case ALPHA_NUMERIC:
						{
						setState(1427);
						match(ALPHA_NUMERIC);
						setState(1429);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
						case 1:
							{
							setState(1428);
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
				setState(1433); 
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
			setState(1435);
			identifier();
			setState(1437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1436);
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
			setState(1457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1439);
				match(T__0);
				setState(1440);
				match(VOID);
				setState(1441);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1442);
				match(T__0);
				setState(1454);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__19) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ELLIPSIS - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)))) != 0)) {
					{
					setState(1443);
					param_type();
					setState(1451);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(1444);
						match(T__12);
						setState(1446);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(1445);
							match(NEWLINE);
							}
						}

						setState(1448);
						param_type();
						}
						}
						setState(1453);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1456);
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
			setState(1466);
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
				setState(1459);
				type_name();
				setState(1461);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(1460);
					match(NEWLINE);
					}
					break;
				}
				setState(1463);
				param_type_id();
				}
				break;
			case ELLIPSIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1465);
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
			setState(1469);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__14) {
				{
				setState(1468);
				ptrs();
				}
			}

			setState(1478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(1471);
				match(T__0);
				setState(1472);
				param_type_id();
				setState(1473);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(1476);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (NEW - 96)) | (1L << (PRE_PRAGMA_KEYWORDS - 96)) | (1L << (ALPHA_NUMERIC - 96)))) != 0)) {
					{
					setState(1475);
					parameter_name();
					}
				}

				}
				break;
			}
			setState(1481);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__24) {
				{
				setState(1480);
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
			setState(1494);
			switch (_input.LA(1)) {
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1483);
				match(ALPHA_NUMERIC);
				setState(1488);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1484);
						match(T__52);
						setState(1485);
						match(ALPHA_NUMERIC);
						}
						} 
					}
					setState(1490);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
				}
				}
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(1491);
				match(NEW);
				}
				break;
			case PRE_PRAGMA_KEYWORDS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1492);
				match(PRE_PRAGMA_KEYWORDS);
				}
				break;
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(1493);
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
			setState(1496);
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
			setState(1502); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1498);
				ptr_operator();
				setState(1500);
				_la = _input.LA(1);
				if (_la==T__55) {
					{
					setState(1499);
					match(T__55);
					}
				}

				}
				}
				setState(1504); 
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
			setState(1506);
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
		enterRule(_localctx, 200, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1508);
			assign_expr();
			setState(1523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				{
				setState(1512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1509);
					expression_fragment();
					}
					}
					setState(1514);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1515);
				match(T__12);
				setState(1519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
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
				setState(1522);
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
		enterRule(_localctx, 202, RULE_assign_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1525);
			conditional_expression();
			setState(1541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				{
				setState(1529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1526);
					expression_fragment();
					}
					}
					setState(1531);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1532);
				assignment_operator();
				setState(1536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1533);
					expression_fragment();
					}
					}
					setState(1538);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1539);
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
		enterRule(_localctx, 204, RULE_conditional_expression);
		int _la;
		try {
			setState(1574);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				_localctx = new NormOrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1543);
				or_expression();
				}
				break;
			case 2:
				_localctx = new CndExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1544);
				or_expression();
				{
				setState(1548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1545);
					expression_fragment();
					}
					}
					setState(1550);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1551);
				match(T__56);
				setState(1555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1552);
					expression_fragment();
					}
					}
					setState(1557);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1558);
				expr();
				setState(1562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1559);
					expression_fragment();
					}
					}
					setState(1564);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1565);
				match(T__3);
				setState(1569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1566);
					expression_fragment();
					}
					}
					setState(1571);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
		enterRule(_localctx, 206, RULE_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1576);
			and_expression();
			setState(1591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				{
				setState(1580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1577);
					expression_fragment();
					}
					}
					setState(1582);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1583);
				match(T__46);
				setState(1587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1584);
					expression_fragment();
					}
					}
					setState(1589);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1590);
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
		enterRule(_localctx, 208, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1593);
			inclusive_or_expression();
			setState(1608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				{
				setState(1597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1594);
					expression_fragment();
					}
					}
					setState(1599);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1600);
				match(T__45);
				setState(1604);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1601);
					expression_fragment();
					}
					}
					setState(1606);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1607);
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
		enterRule(_localctx, 210, RULE_inclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1610);
			exclusive_or_expression();
			setState(1625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				{
				setState(1614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1611);
					expression_fragment();
					}
					}
					setState(1616);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1617);
				match(T__29);
				setState(1621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1618);
					expression_fragment();
					}
					}
					setState(1623);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1624);
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
		enterRule(_localctx, 212, RULE_exclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1627);
			bit_and_expression();
			setState(1642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				{
				setState(1631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1628);
					expression_fragment();
					}
					}
					setState(1633);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1634);
				match(T__28);
				setState(1638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1635);
					expression_fragment();
					}
					}
					setState(1640);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1641);
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
		enterRule(_localctx, 214, RULE_bit_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1644);
			equality_expression();
			setState(1659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				{
				setState(1648);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1645);
					expression_fragment();
					}
					}
					setState(1650);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1651);
				match(T__13);
				setState(1655);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1652);
					expression_fragment();
					}
					}
					setState(1657);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1658);
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
		enterRule(_localctx, 216, RULE_equality_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1661);
			relational_expression();
			setState(1677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				{
				setState(1665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1662);
					expression_fragment();
					}
					}
					setState(1667);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1668);
				equality_operator();
				setState(1672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1669);
					expression_fragment();
					}
					}
					setState(1674);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1675);
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
		enterRule(_localctx, 218, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1679);
			shift_expression();
			setState(1695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				{
				setState(1683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1680);
					expression_fragment();
					}
					}
					setState(1685);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1686);
				relational_operator();
				setState(1690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1687);
					expression_fragment();
					}
					}
					setState(1692);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1693);
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
		enterRule(_localctx, 220, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1697);
			additive_expression();
			setState(1712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				{
				setState(1701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1698);
					expression_fragment();
					}
					}
					setState(1703);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1704);
				_la = _input.LA(1);
				if ( !(_la==T__39 || _la==T__40) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1708);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1705);
					expression_fragment();
					}
					}
					setState(1710);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1711);
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
		enterRule(_localctx, 222, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1714);
			multiplicative_expression();
			setState(1729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				{
				setState(1718);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1715);
					expression_fragment();
					}
					}
					setState(1720);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1721);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1725);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1722);
					expression_fragment();
					}
					}
					setState(1727);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1728);
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
		enterRule(_localctx, 224, RULE_multiplicative_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1731);
			function_pointer_use_expression();
			setState(1746);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				{
				setState(1735);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
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
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__26) | (1L << T__27))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1742);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
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
			setState(1759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1748);
				match(T__0);
				setState(1749);
				ptr_operator();
				setState(1751);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (NEW - 96)) | (1L << (PRE_PRAGMA_KEYWORDS - 96)) | (1L << (ALPHA_NUMERIC - 96)))) != 0)) {
					{
					setState(1750);
					identifier();
					}
				}

				setState(1753);
				match(T__1);
				setState(1754);
				match(T__0);
				setState(1755);
				argument_list();
				setState(1756);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1758);
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
			setState(1767);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1761);
				match(T__0);
				setState(1762);
				cast_target();
				setState(1763);
				match(T__1);
				setState(1764);
				cast_expression();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1766);
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
			setState(1773);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1769);
				type_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1770);
				type_name();
				setState(1771);
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
			setState(1783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1775);
				address_of_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1776);
				unary_op_and_cast_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1777);
				sizeof_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1778);
				new_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1779);
				postfix_expression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1780);
				defined_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1781);
				macroCall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1782);
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
			setState(1785);
			match(T__13);
			setState(1786);
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
		enterRule(_localctx, 236, RULE_new_expression);
		int _la;
		try {
			setState(1834);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1789);
				_la = _input.LA(1);
				if (_la==T__52) {
					{
					setState(1788);
					match(T__52);
					}
				}

				setState(1791);
				match(NEW);
				setState(1795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1792);
					expression_fragment();
					}
					}
					setState(1797);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1798);
				type_name();
				setState(1802);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1799);
					expression_fragment();
					}
					}
					setState(1804);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1805);
				match(T__24);
				setState(1807);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(1806);
					conditional_expression();
					}
				}

				setState(1809);
				match(T__25);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1812);
				_la = _input.LA(1);
				if (_la==T__52) {
					{
					setState(1811);
					match(T__52);
					}
				}

				setState(1814);
				match(NEW);
				setState(1818);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1815);
					expression_fragment();
					}
					}
					setState(1820);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1821);
				type_name();
				setState(1825);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1822);
					expression_fragment();
					}
					}
					setState(1827);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1828);
				match(T__0);
				setState(1830);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(1829);
					expr();
					}
				}

				setState(1832);
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
		enterRule(_localctx, 238, RULE_unary_op_and_cast_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1836);
			unary_operator();
			setState(1840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
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
		enterRule(_localctx, 240, RULE_sizeof_expression);
		int _la;
		try {
			setState(1865);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1845);
				sizeof();
				setState(1849);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1846);
					expression_fragment();
					}
					}
					setState(1851);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1852);
				match(T__0);
				setState(1853);
				sizeof_operand();
				setState(1854);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1856);
				sizeof();
				setState(1860);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1857);
					expression_fragment();
					}
					}
					setState(1862);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1863);
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
			setState(1867);
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
		enterRule(_localctx, 244, RULE_defined_expression);
		int _la;
		try {
			setState(1888);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1869);
				match(T__58);
				setState(1873);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1870);
					expression_fragment();
					}
					}
					setState(1875);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1876);
				match(T__0);
				setState(1877);
				expr();
				setState(1878);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1880);
				match(T__58);
				setState(1884);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1881);
					expression_fragment();
					}
					}
					setState(1886);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1887);
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
		enterRule(_localctx, 246, RULE_sizeof_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1890);
			type_name();
			setState(1900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << NEWLINE) | (1L << ESCAPE))) != 0) || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (PRE_IF - 97)) | (1L << (PRE_ELIF - 97)) | (1L << (PRE_ELSE - 97)) | (1L << (PRE_ENDIF - 97)) | (1L << (PRE_DEFINE - 97)) | (1L << (COMMENT - 97)))) != 0)) {
				{
				{
				setState(1894);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1891);
					expression_fragment();
					}
					}
					setState(1896);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1897);
				ptr_operator();
				}
				}
				setState(1902);
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
			setState(1903);
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
			setState(1905);
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
			setState(1907);
			match(ASM);
			setState(1911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GOTO || _la==CV_QUALIFIER) {
				{
				{
				setState(1908);
				_la = _input.LA(1);
				if ( !(_la==GOTO || _la==CV_QUALIFIER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(1913);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1915);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1914);
				match(NEWLINE);
				}
			}

			setState(1917);
			match(T__0);
			setState(1919);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1918);
				match(NEWLINE);
				}
			}

			setState(1925); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1921);
				match(STRING);
				setState(1923);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1922);
					match(NEWLINE);
					}
				}

				}
				}
				setState(1927); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(1951);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__52) | (1L << T__59))) != 0)) {
				{
				{
				setState(1929);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__52) | (1L << T__59))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1947);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					{
					setState(1930);
					match(STRING);
					setState(1932);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1931);
						match(NEWLINE);
						}
					}

					}
					setState(1945);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(1934);
						match(T__0);
						setState(1935);
						identifier();
						setState(1940);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__12) {
							{
							{
							setState(1936);
							match(T__12);
							setState(1937);
							identifier();
							}
							}
							setState(1942);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1943);
						match(T__1);
						}
					}

					}
				}

				}
				}
				setState(1953);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1954);
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
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
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
		int _startState = 254;
		enterRecursionRule(_localctx, 254, RULE_postfix_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1977);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				{
				_localctx = new ArrayAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1958);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__19) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)))) != 0)) {
					{
					setState(1957);
					type_name();
					}
				}

				setState(1960);
				initializer_expression();
				}
				break;
			case 2:
				{
				_localctx = new PrimaryOnlyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1961);
				primary_expression();
				}
				break;
			case 3:
				{
				_localctx = new IncDecOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1963);
				_la = _input.LA(1);
				if (_la==T__13 || _la==T__14) {
					{
					setState(1962);
					ptr_operator();
					}
				}

				setState(1965);
				inc_dec();
				setState(1969);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1966);
					expression_fragment();
					}
					}
					setState(1971);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1973);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
				case 1:
					{
					setState(1972);
					ptr_operator();
					}
					break;
				}
				setState(1975);
				primary_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2036);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2034);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayIndexingContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1979);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1983);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
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
						match(T__24);
						setState(1988);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
							{
							setState(1987);
							expr();
							}
						}

						setState(1990);
						match(T__25);
						}
						break;
					case 2:
						{
						_localctx = new FuncCallContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1991);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1995);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
							{
							{
							setState(1992);
							expression_fragment();
							}
							}
							setState(1997);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1998);
						match(T__0);
						setState(1999);
						argument_list();
						setState(2000);
						match(T__1);
						}
						break;
					case 3:
						{
						_localctx = new MemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2002);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2003);
						match(T__60);
						setState(2007);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
							{
							{
							setState(2004);
							expression_fragment();
							}
							}
							setState(2009);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2011);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(2010);
							match(TEMPLATE);
							}
						}

						{
						setState(2013);
						identifier();
						}
						}
						break;
					case 4:
						{
						_localctx = new PtrMemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2014);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2015);
						match(T__50);
						setState(2019);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
							{
							{
							setState(2016);
							expression_fragment();
							}
							}
							setState(2021);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2023);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(2022);
							match(TEMPLATE);
							}
						}

						{
						setState(2025);
						identifier();
						}
						}
						break;
					case 5:
						{
						_localctx = new IncDecOpContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2026);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2030);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
							{
							{
							setState(2027);
							expression_fragment();
							}
							}
							setState(2032);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2033);
						inc_dec();
						}
						break;
					}
					} 
				}
				setState(2038);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
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
		enterRule(_localctx, 256, RULE_initializer_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2039);
			match(OPENING_CURLY);
			setState(2043);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2040);
					expression_fragment();
					}
					} 
				}
				setState(2045);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
			}
			setState(2047);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
			case 1:
				{
				setState(2046);
				argument_list();
				}
				break;
			}
			setState(2052);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
				{
				{
				setState(2049);
				expression_fragment();
				}
				}
				setState(2054);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2055);
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
			setState(2076);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2058);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
				case 1:
					{
					setState(2057);
					argument();
					}
					break;
				}
				setState(2066);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2061);
						_la = _input.LA(1);
						if (_la==T__12) {
							{
							setState(2060);
							match(T__12);
							}
						}

						setState(2063);
						argument();
						}
						} 
					}
					setState(2068);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
				}
				setState(2070);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(2069);
					match(T__12);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2072);
				match(VOID);
				setState(2074);
				_la = _input.LA(1);
				if (_la==T__13 || _la==T__14) {
					{
					setState(2073);
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
		public List<Expression_fragmentContext> expression_fragment() {
			return getRuleContexts(Expression_fragmentContext.class);
		}
		public Expression_fragmentContext expression_fragment(int i) {
			return getRuleContext(Expression_fragmentContext.class,i);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2081);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
				{
				{
				setState(2078);
				expression_fragment();
				}
				}
				setState(2083);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2084);
			assign_expr();
			setState(2088);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2085);
					expression_fragment();
					}
					} 
				}
				setState(2090);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 262, RULE_primary_expression);
		int _la;
		try {
			setState(2113);
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
				setState(2092);
				_la = _input.LA(1);
				if (_la==T__60) {
					{
					setState(2091);
					match(T__60);
					}
				}

				setState(2094);
				identifier();
				}
				}
				break;
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(2095);
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
				setState(2096);
				constant();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
				setState(2097);
				match(T__0);
				setState(2101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(2098);
					expression_fragment();
					}
					}
					setState(2103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2104);
				expr();
				setState(2108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(2105);
					expression_fragment();
					}
					}
					setState(2110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2111);
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
			setState(2115);
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
		public TerminalNode NEWLINE() { return getToken(FunctionParser.NEWLINE, 0); }
		public TerminalNode EOF() { return getToken(FunctionParser.EOF, 0); }
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(FunctionParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(FunctionParser.ALPHA_NUMERIC, i);
		}
		public List<TerminalNode> STRING() { return getTokens(FunctionParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(FunctionParser.STRING, i);
		}
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
		enterRule(_localctx, 266, RULE_preprocessor_fragment);
		int _la;
		try {
			setState(2145);
			switch (_input.LA(1)) {
			case PRE_DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2117);
				match(PRE_DEFINE);
				setState(2118);
				pre_macro_identifier();
				setState(2122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0 || _la==T__1 || _la==ALPHA_NUMERIC || _la==STRING) {
					{
					{
					setState(2119);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==T__1 || _la==ALPHA_NUMERIC || _la==STRING) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					}
					setState(2124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2125);
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
				setState(2127);
				match(PRE_IF);
				setState(2131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0 || _la==T__1 || _la==ALPHA_NUMERIC || _la==STRING) {
					{
					{
					setState(2128);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==T__1 || _la==ALPHA_NUMERIC || _la==STRING) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					}
					setState(2133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2134);
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
				setState(2135);
				match(PRE_ELIF);
				setState(2139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0 || _la==T__1 || _la==ALPHA_NUMERIC || _la==STRING) {
					{
					{
					setState(2136);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==T__1 || _la==ALPHA_NUMERIC || _la==STRING) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					}
					setState(2141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2142);
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
				setState(2143);
				match(PRE_ELSE);
				}
				break;
			case PRE_ENDIF:
				enterOuterAlt(_localctx, 5);
				{
				setState(2144);
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
		public TerminalNode ESCAPE() { return getToken(FunctionParser.ESCAPE, 0); }
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
		enterRule(_localctx, 268, RULE_expression_fragment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2153);
			switch (_input.LA(1)) {
			case NEWLINE:
			case ESCAPE:
				{
				setState(2148);
				_la = _input.LA(1);
				if (_la==ESCAPE) {
					{
					setState(2147);
					match(ESCAPE);
					}
				}

				setState(2150);
				match(NEWLINE);
				}
				break;
			case COMMENT:
				{
				setState(2151);
				match(COMMENT);
				}
				break;
			case PRE_IF:
			case PRE_ELIF:
			case PRE_ELSE:
			case PRE_ENDIF:
			case PRE_DEFINE:
				{
				setState(2152);
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
		enterRule(_localctx, 270, RULE_init_declarator);
		int _la;
		try {
			setState(2173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
			case 1:
				_localctx = new InitDeclWithCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2155);
				declarator();
				setState(2156);
				match(T__0);
				setState(2158);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(2157);
					expr();
					}
				}

				setState(2160);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new InitDeclWithAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2162);
				declarator();
				setState(2164);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(2163);
					match(NEWLINE);
					}
				}

				setState(2166);
				match(T__30);
				setState(2168);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
				case 1:
					{
					setState(2167);
					match(NEWLINE);
					}
					break;
				}
				setState(2170);
				argument();
				}
				break;
			case 3:
				_localctx = new InitDeclSimpleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2172);
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
		enterRule(_localctx, 272, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2176);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__14) {
				{
				setState(2175);
				ptrs();
				}
			}

			setState(2178);
			identifier();
			setState(2180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,332,_ctx) ) {
			case 1:
				{
				setState(2179);
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
		enterRule(_localctx, 274, RULE_type_suffix);
		int _la;
		try {
			setState(2188);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2182);
				match(T__24);
				setState(2184);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(2183);
					conditional_expression();
					}
				}

				setState(2186);
				match(T__25);
				}
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(2187);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0080\u0891\4\2\t"+
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
		"\4\u008a\t\u008a\4\u008b\t\u008b\3\2\7\2\u0118\n\2\f\2\16\2\u011b\13\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0129\n\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u0136\n\7\3\7\5\7\u0139\n\7\3"+
		"\7\5\7\u013c\n\7\3\7\3\7\3\7\5\7\u0141\n\7\3\7\3\7\5\7\u0145\n\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\u014d\n\7\3\7\3\7\5\7\u0151\n\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7\u0158\n\7\3\7\3\7\5\7\u015c\n\7\3\7\5\7\u015f\n\7\3\7\5\7\u0162"+
		"\n\7\3\7\3\7\5\7\u0166\n\7\3\7\5\7\u0169\n\7\3\7\5\7\u016c\n\7\3\7\3\7"+
		"\5\7\u0170\n\7\3\7\3\7\3\7\3\7\5\7\u0176\n\7\3\7\3\7\5\7\u017a\n\7\3\7"+
		"\3\7\5\7\u017e\n\7\5\7\u0180\n\7\3\b\3\b\3\b\3\b\5\b\u0186\n\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0192\n\t\3\t\3\t\3\t\5\t\u0197\n"+
		"\t\3\t\5\t\u019a\n\t\3\n\5\n\u019d\n\n\3\n\3\n\3\n\3\n\5\n\u01a3\n\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\5\13\u01ab\n\13\3\f\3\f\3\r\3\r\5\r\u01b1\n"+
		"\r\3\16\3\16\3\16\3\16\5\16\u01b7\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u01cb"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u01d6\n\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01e0\n\25\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u01ea\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u01f3\n\27\3\27\5\27\u01f6\n\27\3\30\3\30\3\31\3\31\5\31\u01fc\n"+
		"\31\3\31\3\31\3\31\5\31\u0201\n\31\7\31\u0203\n\31\f\31\16\31\u0206\13"+
		"\31\3\32\3\32\3\32\6\32\u020b\n\32\r\32\16\32\u020c\3\32\3\32\5\32\u0211"+
		"\n\32\3\33\5\33\u0214\n\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u021c\n"+
		"\33\3\33\5\33\u021f\n\33\3\33\3\33\5\33\u0223\n\33\3\33\3\33\3\33\3\33"+
		"\5\33\u0229\n\33\7\33\u022b\n\33\f\33\16\33\u022e\13\33\3\33\5\33\u0231"+
		"\n\33\3\33\5\33\u0234\n\33\3\33\3\33\3\34\3\34\3\34\5\34\u023b\n\34\3"+
		"\35\3\35\5\35\u023f\n\35\3\35\3\35\3\35\3\35\5\35\u0245\n\35\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u024c\n\35\3\35\3\35\5\35\u0250\n\35\3\36\3\36\3"+
		"\36\7\36\u0255\n\36\f\36\16\36\u0258\13\36\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\7\37\u0260\n\37\f\37\16\37\u0263\13\37\3\37\3\37\3\37\3\37\3\37\5"+
		"\37\u026a\n\37\3\37\3\37\7\37\u026e\n\37\f\37\16\37\u0271\13\37\3\37\3"+
		"\37\3\37\5\37\u0276\n\37\3 \3 \3 \3 \3 \5 \u027d\n \3!\3!\3!\3!\3!\5!"+
		"\u0284\n!\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0298"+
		"\n$\3%\3%\5%\u029c\n%\3%\3%\3%\3%\3%\5%\u02a3\n%\3%\3%\7%\u02a7\n%\f%"+
		"\16%\u02aa\13%\3%\3%\5%\u02ae\n%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3"+
		"*\3*\5*\u02bd\n*\3*\7*\u02c0\n*\f*\16*\u02c3\13*\3*\5*\u02c6\n*\6*\u02c8"+
		"\n*\r*\16*\u02c9\3*\3*\3*\5*\u02cf\n*\3+\3+\3,\3,\3-\3-\3.\3.\3.\5.\u02da"+
		"\n.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0304\n.\3/"+
		"\3/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\6\62\u0318\n\62\r\62\16\62\u0319\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3"+
		">\3>\5>\u0336\n>\3?\3?\3?\6?\u033b\n?\r?\16?\u033c\3@\3@\3@\5@\u0342\n"+
		"@\3A\3A\5A\u0346\nA\3A\5A\u0349\nA\3A\5A\u034c\nA\3A\3A\5A\u0350\nA\3"+
		"A\3A\3B\3B\3B\3B\3B\3C\3C\3D\5D\u035c\nD\3D\5D\u035f\nD\3D\3D\7D\u0363"+
		"\nD\fD\16D\u0366\13D\5D\u0368\nD\3D\3D\7D\u036c\nD\fD\16D\u036f\13D\3"+
		"D\3D\5D\u0373\nD\3D\7D\u0376\nD\fD\16D\u0379\13D\3D\3D\3D\5D\u037e\nD"+
		"\3D\3D\7D\u0382\nD\fD\16D\u0385\13D\3D\3D\5D\u0389\nD\3E\3E\3F\3F\7F\u038f"+
		"\nF\fF\16F\u0392\13F\7F\u0394\nF\fF\16F\u0397\13F\3F\3F\3F\3F\7F\u039d"+
		"\nF\fF\16F\u03a0\13F\7F\u03a2\nF\fF\16F\u03a5\13F\3F\3F\7F\u03a9\nF\f"+
		"F\16F\u03ac\13F\5F\u03ae\nF\3G\3G\7G\u03b2\nG\fG\16G\u03b5\13G\3G\5G\u03b8"+
		"\nG\3G\7G\u03bb\nG\fG\16G\u03be\13G\3G\3G\5G\u03c2\nG\3G\3G\7G\u03c6\n"+
		"G\fG\16G\u03c9\13G\7G\u03cb\nG\fG\16G\u03ce\13G\3G\5G\u03d1\nG\3G\3G\7"+
		"G\u03d5\nG\fG\16G\u03d8\13G\3G\3G\3G\7G\u03dd\nG\fG\16G\u03e0\13G\3G\7"+
		"G\u03e3\nG\fG\16G\u03e6\13G\3G\7G\u03e9\nG\fG\16G\u03ec\13G\3G\3G\7G\u03f0"+
		"\nG\fG\16G\u03f3\13G\3G\3G\3G\3G\7G\u03f9\nG\fG\16G\u03fc\13G\3G\7G\u03ff"+
		"\nG\fG\16G\u0402\13G\3G\3G\7G\u0406\nG\fG\16G\u0409\13G\6G\u040b\nG\r"+
		"G\16G\u040c\5G\u040f\nG\3H\7H\u0412\nH\fH\16H\u0415\13H\3H\3H\7H\u0419"+
		"\nH\fH\16H\u041c\13H\3H\3H\7H\u0420\nH\fH\16H\u0423\13H\3H\7H\u0426\n"+
		"H\fH\16H\u0429\13H\3H\7H\u042c\nH\fH\16H\u042f\13H\3H\3H\7H\u0433\nH\f"+
		"H\16H\u0436\13H\3H\5H\u0439\nH\3I\3I\3I\3I\5I\u043f\nI\3J\5J\u0442\nJ"+
		"\3J\3J\3J\3J\3J\5J\u0449\nJ\3J\5J\u044c\nJ\3K\3K\3K\3L\3L\3L\3L\7L\u0455"+
		"\nL\fL\16L\u0458\13L\3M\3M\3M\3N\5N\u045e\nN\3N\3N\3O\3O\5O\u0464\nO\3"+
		"O\3O\3P\3P\3P\3P\3P\3P\3P\5P\u046f\nP\3Q\3Q\3Q\3Q\3Q\3R\7R\u0477\nR\f"+
		"R\16R\u047a\13R\3R\3R\3R\3R\7R\u0480\nR\fR\16R\u0483\13R\7R\u0485\nR\f"+
		"R\16R\u0488\13R\3S\3S\3T\5T\u048d\nT\3T\3T\5T\u0491\nT\3T\3T\5T\u0495"+
		"\nT\5T\u0497\nT\3T\5T\u049a\nT\3T\3T\3T\3T\3T\5T\u04a1\nT\5T\u04a3\nT"+
		"\3T\3T\3T\5T\u04a8\nT\3T\3T\5T\u04ac\nT\3T\3T\3T\5T\u04b1\nT\3T\3T\5T"+
		"\u04b5\nT\3T\3T\5T\u04b9\nT\3T\5T\u04bc\nT\3T\3T\3T\3T\3T\6T\u04c3\nT"+
		"\rT\16T\u04c4\3T\5T\u04c8\nT\5T\u04ca\nT\3T\3T\5T\u04ce\nT\3T\5T\u04d1"+
		"\nT\3T\5T\u04d4\nT\5T\u04d6\nT\3U\6U\u04d9\nU\rU\16U\u04da\3V\3V\5V\u04df"+
		"\nV\3V\5V\u04e2\nV\3V\3V\5V\u04e6\nV\5V\u04e8\nV\3V\5V\u04eb\nV\3V\3V"+
		"\3V\3V\5V\u04f1\nV\3V\5V\u04f4\nV\3V\3V\5V\u04f8\nV\3V\5V\u04fb\nV\3V"+
		"\3V\5V\u04ff\nV\3V\3V\3V\3V\3V\5V\u0506\nV\3V\5V\u0509\nV\3V\5V\u050c"+
		"\nV\3W\3W\5W\u0510\nW\3W\3W\5W\u0514\nW\3W\7W\u0517\nW\fW\16W\u051a\13"+
		"W\3W\5W\u051d\nW\3W\5W\u0520\nW\3W\3W\3X\3X\5X\u0526\nX\3X\5X\u0529\n"+
		"X\3X\5X\u052c\nX\3X\3X\3X\3Y\3Y\3Z\3Z\3Z\3Z\7Z\u0537\nZ\fZ\16Z\u053a\13"+
		"Z\3[\3[\5[\u053e\n[\5[\u0540\n[\3[\5[\u0543\n[\3[\3[\3\\\3\\\5\\\u0549"+
		"\n\\\3\\\3\\\5\\\u054d\n\\\3\\\3\\\5\\\u0551\n\\\3\\\3\\\5\\\u0555\n\\"+
		"\3\\\3\\\5\\\u0559\n\\\3\\\3\\\5\\\u055d\n\\\3\\\3\\\5\\\u0561\n\\\3\\"+
		"\3\\\5\\\u0565\n\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u0572"+
		"\n\\\7\\\u0574\n\\\f\\\16\\\u0577\13\\\3\\\6\\\u057a\n\\\r\\\16\\\u057b"+
		"\3]\3]\5]\u0580\n]\3]\3]\5]\u0584\n]\3]\3]\5]\u0588\n]\3]\3]\5]\u058c"+
		"\n]\3]\3]\5]\u0590\n]\3]\3]\5]\u0594\n]\3]\3]\5]\u0598\n]\6]\u059a\n]"+
		"\r]\16]\u059b\3^\3^\5^\u05a0\n^\3_\3_\3_\3_\3_\3_\3_\5_\u05a9\n_\3_\7"+
		"_\u05ac\n_\f_\16_\u05af\13_\5_\u05b1\n_\3_\5_\u05b4\n_\3`\3`\5`\u05b8"+
		"\n`\3`\3`\3`\5`\u05bd\n`\3a\5a\u05c0\na\3a\3a\3a\3a\3a\5a\u05c7\na\5a"+
		"\u05c9\na\3a\5a\u05cc\na\3b\3b\3b\7b\u05d1\nb\fb\16b\u05d4\13b\3b\3b\3"+
		"b\5b\u05d9\nb\3c\3c\3d\3d\5d\u05df\nd\6d\u05e1\nd\rd\16d\u05e2\3e\3e\3"+
		"f\3f\7f\u05e9\nf\ff\16f\u05ec\13f\3f\3f\7f\u05f0\nf\ff\16f\u05f3\13f\3"+
		"f\5f\u05f6\nf\3g\3g\7g\u05fa\ng\fg\16g\u05fd\13g\3g\3g\7g\u0601\ng\fg"+
		"\16g\u0604\13g\3g\3g\5g\u0608\ng\3h\3h\3h\7h\u060d\nh\fh\16h\u0610\13"+
		"h\3h\3h\7h\u0614\nh\fh\16h\u0617\13h\3h\3h\7h\u061b\nh\fh\16h\u061e\13"+
		"h\3h\3h\7h\u0622\nh\fh\16h\u0625\13h\3h\3h\5h\u0629\nh\3i\3i\7i\u062d"+
		"\ni\fi\16i\u0630\13i\3i\3i\7i\u0634\ni\fi\16i\u0637\13i\3i\5i\u063a\n"+
		"i\3j\3j\7j\u063e\nj\fj\16j\u0641\13j\3j\3j\7j\u0645\nj\fj\16j\u0648\13"+
		"j\3j\5j\u064b\nj\3k\3k\7k\u064f\nk\fk\16k\u0652\13k\3k\3k\7k\u0656\nk"+
		"\fk\16k\u0659\13k\3k\5k\u065c\nk\3l\3l\7l\u0660\nl\fl\16l\u0663\13l\3"+
		"l\3l\7l\u0667\nl\fl\16l\u066a\13l\3l\5l\u066d\nl\3m\3m\7m\u0671\nm\fm"+
		"\16m\u0674\13m\3m\3m\7m\u0678\nm\fm\16m\u067b\13m\3m\5m\u067e\nm\3n\3"+
		"n\7n\u0682\nn\fn\16n\u0685\13n\3n\3n\7n\u0689\nn\fn\16n\u068c\13n\3n\3"+
		"n\5n\u0690\nn\3o\3o\7o\u0694\no\fo\16o\u0697\13o\3o\3o\7o\u069b\no\fo"+
		"\16o\u069e\13o\3o\3o\5o\u06a2\no\3p\3p\7p\u06a6\np\fp\16p\u06a9\13p\3"+
		"p\3p\7p\u06ad\np\fp\16p\u06b0\13p\3p\5p\u06b3\np\3q\3q\7q\u06b7\nq\fq"+
		"\16q\u06ba\13q\3q\3q\7q\u06be\nq\fq\16q\u06c1\13q\3q\5q\u06c4\nq\3r\3"+
		"r\7r\u06c8\nr\fr\16r\u06cb\13r\3r\3r\7r\u06cf\nr\fr\16r\u06d2\13r\3r\5"+
		"r\u06d5\nr\3s\3s\3s\5s\u06da\ns\3s\3s\3s\3s\3s\3s\5s\u06e2\ns\3t\3t\3"+
		"t\3t\3t\3t\5t\u06ea\nt\3u\3u\3u\3u\5u\u06f0\nu\3v\3v\3v\3v\3v\3v\3v\3"+
		"v\5v\u06fa\nv\3w\3w\3w\3x\5x\u0700\nx\3x\3x\7x\u0704\nx\fx\16x\u0707\13"+
		"x\3x\3x\7x\u070b\nx\fx\16x\u070e\13x\3x\3x\5x\u0712\nx\3x\3x\3x\5x\u0717"+
		"\nx\3x\3x\7x\u071b\nx\fx\16x\u071e\13x\3x\3x\7x\u0722\nx\fx\16x\u0725"+
		"\13x\3x\3x\5x\u0729\nx\3x\3x\5x\u072d\nx\3y\3y\7y\u0731\ny\fy\16y\u0734"+
		"\13y\3y\3y\3z\3z\7z\u073a\nz\fz\16z\u073d\13z\3z\3z\3z\3z\3z\3z\7z\u0745"+
		"\nz\fz\16z\u0748\13z\3z\3z\5z\u074c\nz\3{\3{\3|\3|\7|\u0752\n|\f|\16|"+
		"\u0755\13|\3|\3|\3|\3|\3|\3|\7|\u075d\n|\f|\16|\u0760\13|\3|\5|\u0763"+
		"\n|\3}\3}\7}\u0767\n}\f}\16}\u076a\13}\3}\7}\u076d\n}\f}\16}\u0770\13"+
		"}\3~\3~\3\177\3\177\3\u0080\3\u0080\7\u0080\u0778\n\u0080\f\u0080\16\u0080"+
		"\u077b\13\u0080\3\u0080\5\u0080\u077e\n\u0080\3\u0080\3\u0080\5\u0080"+
		"\u0782\n\u0080\3\u0080\3\u0080\5\u0080\u0786\n\u0080\6\u0080\u0788\n\u0080"+
		"\r\u0080\16\u0080\u0789\3\u0080\3\u0080\3\u0080\5\u0080\u078f\n\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\7\u0080\u0795\n\u0080\f\u0080\16\u0080"+
		"\u0798\13\u0080\3\u0080\3\u0080\5\u0080\u079c\n\u0080\5\u0080\u079e\n"+
		"\u0080\7\u0080\u07a0\n\u0080\f\u0080\16\u0080\u07a3\13\u0080\3\u0080\3"+
		"\u0080\3\u0081\3\u0081\5\u0081\u07a9\n\u0081\3\u0081\3\u0081\3\u0081\5"+
		"\u0081\u07ae\n\u0081\3\u0081\3\u0081\7\u0081\u07b2\n\u0081\f\u0081\16"+
		"\u0081\u07b5\13\u0081\3\u0081\5\u0081\u07b8\n\u0081\3\u0081\3\u0081\5"+
		"\u0081\u07bc\n\u0081\3\u0081\3\u0081\7\u0081\u07c0\n\u0081\f\u0081\16"+
		"\u0081\u07c3\13\u0081\3\u0081\3\u0081\5\u0081\u07c7\n\u0081\3\u0081\3"+
		"\u0081\3\u0081\7\u0081\u07cc\n\u0081\f\u0081\16\u0081\u07cf\13\u0081\3"+
		"\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\7\u0081\u07d8\n"+
		"\u0081\f\u0081\16\u0081\u07db\13\u0081\3\u0081\5\u0081\u07de\n\u0081\3"+
		"\u0081\3\u0081\3\u0081\3\u0081\7\u0081\u07e4\n\u0081\f\u0081\16\u0081"+
		"\u07e7\13\u0081\3\u0081\5\u0081\u07ea\n\u0081\3\u0081\3\u0081\3\u0081"+
		"\7\u0081\u07ef\n\u0081\f\u0081\16\u0081\u07f2\13\u0081\3\u0081\7\u0081"+
		"\u07f5\n\u0081\f\u0081\16\u0081\u07f8\13\u0081\3\u0082\3\u0082\7\u0082"+
		"\u07fc\n\u0082\f\u0082\16\u0082\u07ff\13\u0082\3\u0082\5\u0082\u0802\n"+
		"\u0082\3\u0082\7\u0082\u0805\n\u0082\f\u0082\16\u0082\u0808\13\u0082\3"+
		"\u0082\3\u0082\3\u0083\5\u0083\u080d\n\u0083\3\u0083\5\u0083\u0810\n\u0083"+
		"\3\u0083\7\u0083\u0813\n\u0083\f\u0083\16\u0083\u0816\13\u0083\3\u0083"+
		"\5\u0083\u0819\n\u0083\3\u0083\3\u0083\5\u0083\u081d\n\u0083\5\u0083\u081f"+
		"\n\u0083\3\u0084\7\u0084\u0822\n\u0084\f\u0084\16\u0084\u0825\13\u0084"+
		"\3\u0084\3\u0084\7\u0084\u0829\n\u0084\f\u0084\16\u0084\u082c\13\u0084"+
		"\3\u0085\5\u0085\u082f\n\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\7\u0085\u0836\n\u0085\f\u0085\16\u0085\u0839\13\u0085\3\u0085\3\u0085"+
		"\7\u0085\u083d\n\u0085\f\u0085\16\u0085\u0840\13\u0085\3\u0085\3\u0085"+
		"\5\u0085\u0844\n\u0085\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\7\u0087"+
		"\u084b\n\u0087\f\u0087\16\u0087\u084e\13\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\7\u0087\u0854\n\u0087\f\u0087\16\u0087\u0857\13\u0087\3\u0087"+
		"\3\u0087\3\u0087\7\u0087\u085c\n\u0087\f\u0087\16\u0087\u085f\13\u0087"+
		"\3\u0087\3\u0087\3\u0087\5\u0087\u0864\n\u0087\3\u0088\5\u0088\u0867\n"+
		"\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u086c\n\u0088\3\u0089\3\u0089\3"+
		"\u0089\5\u0089\u0871\n\u0089\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u0877"+
		"\n\u0089\3\u0089\3\u0089\5\u0089\u087b\n\u0089\3\u0089\3\u0089\3\u0089"+
		"\5\u0089\u0880\n\u0089\3\u008a\5\u008a\u0883\n\u008a\3\u008a\3\u008a\5"+
		"\u008a\u0887\n\u008a\3\u008b\3\u008b\5\u008b\u088b\n\u008b\3\u008b\3\u008b"+
		"\5\u008b\u088f\n\u008b\3\u008b\2\3\u0100\u008c\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4"+
		"\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c"+
		"\u010e\u0110\u0112\u0114\2\35\3\3@@\b\2\b\16OOQRVX__aa\3\2\20\25\3\2\26"+
		"\31\5\2\b\nOOVV\3\2\20\21\3\2\13\r\4\2\32\32bb\4\2!),-\3\2./\3\2\3\4\5"+
		"\2\3\4\33\34uv\3\2\3\5\4\2\3\4\26\27\3\2uv\3\2\33\34\4\2\5\5\33\34\4\2"+
		"\5\5\17\17\6\2\3\5\17\17\33\34uv\3\2wz\3\2*+\3\2\22\23\4\2\21\21\35\36"+
		"\3\2\62\63\4\2LLSS\5\2\6\6\67\67>>\5\2\3\4tt~~\u09db\2\u0119\3\2\2\2\4"+
		"\u0128\3\2\2\2\6\u012a\3\2\2\2\b\u012c\3\2\2\2\n\u012e\3\2\2\2\f\u017f"+
		"\3\2\2\2\16\u0185\3\2\2\2\20\u0199\3\2\2\2\22\u019c\3\2\2\2\24\u01aa\3"+
		"\2\2\2\26\u01ac\3\2\2\2\30\u01b0\3\2\2\2\32\u01b6\3\2\2\2\34\u01b8\3\2"+
		"\2\2\36\u01bc\3\2\2\2 \u01c0\3\2\2\2\"\u01c2\3\2\2\2$\u01ca\3\2\2\2&\u01d5"+
		"\3\2\2\2(\u01df\3\2\2\2*\u01e1\3\2\2\2,\u01f5\3\2\2\2.\u01f7\3\2\2\2\60"+
		"\u01fb\3\2\2\2\62\u0210\3\2\2\2\64\u0213\3\2\2\2\66\u023a\3\2\2\28\u024f"+
		"\3\2\2\2:\u0251\3\2\2\2<\u0275\3\2\2\2>\u027c\3\2\2\2@\u0283\3\2\2\2B"+
		"\u0285\3\2\2\2D\u0287\3\2\2\2F\u0297\3\2\2\2H\u02ad\3\2\2\2J\u02af\3\2"+
		"\2\2L\u02b1\3\2\2\2N\u02b3\3\2\2\2P\u02b5\3\2\2\2R\u02ce\3\2\2\2T\u02d0"+
		"\3\2\2\2V\u02d2\3\2\2\2X\u02d4\3\2\2\2Z\u0303\3\2\2\2\\\u0305\3\2\2\2"+
		"^\u0307\3\2\2\2`\u0309\3\2\2\2b\u0317\3\2\2\2d\u031b\3\2\2\2f\u031d\3"+
		"\2\2\2h\u031f\3\2\2\2j\u0321\3\2\2\2l\u0323\3\2\2\2n\u0325\3\2\2\2p\u0327"+
		"\3\2\2\2r\u0329\3\2\2\2t\u032b\3\2\2\2v\u032d\3\2\2\2x\u032f\3\2\2\2z"+
		"\u0335\3\2\2\2|\u033a\3\2\2\2~\u033e\3\2\2\2\u0080\u0343\3\2\2\2\u0082"+
		"\u0353\3\2\2\2\u0084\u0358\3\2\2\2\u0086\u0388\3\2\2\2\u0088\u038a\3\2"+
		"\2\2\u008a\u03ad\3\2\2\2\u008c\u040e\3\2\2\2\u008e\u0413\3\2\2\2\u0090"+
		"\u043e\3\2\2\2\u0092\u0441\3\2\2\2\u0094\u044d\3\2\2\2\u0096\u0450\3\2"+
		"\2\2\u0098\u0459\3\2\2\2\u009a\u045d\3\2\2\2\u009c\u0461\3\2\2\2\u009e"+
		"\u046e\3\2\2\2\u00a0\u0470\3\2\2\2\u00a2\u0478\3\2\2\2\u00a4\u0489\3\2"+
		"\2\2\u00a6\u04d5\3\2\2\2\u00a8\u04d8\3\2\2\2\u00aa\u050b\3\2\2\2\u00ac"+
		"\u050d\3\2\2\2\u00ae\u0523\3\2\2\2\u00b0\u0530\3\2\2\2\u00b2\u0532\3\2"+
		"\2\2\u00b4\u053f\3\2\2\2\u00b6\u0579\3\2\2\2\u00b8\u0599\3\2\2\2\u00ba"+
		"\u059d\3\2\2\2\u00bc\u05b3\3\2\2\2\u00be\u05bc\3\2\2\2\u00c0\u05bf\3\2"+
		"\2\2\u00c2\u05d8\3\2\2\2\u00c4\u05da\3\2\2\2\u00c6\u05e0\3\2\2\2\u00c8"+
		"\u05e4\3\2\2\2\u00ca\u05e6\3\2\2\2\u00cc\u05f7\3\2\2\2\u00ce\u0628\3\2"+
		"\2\2\u00d0\u062a\3\2\2\2\u00d2\u063b\3\2\2\2\u00d4\u064c\3\2\2\2\u00d6"+
		"\u065d\3\2\2\2\u00d8\u066e\3\2\2\2\u00da\u067f\3\2\2\2\u00dc\u0691\3\2"+
		"\2\2\u00de\u06a3\3\2\2\2\u00e0\u06b4\3\2\2\2\u00e2\u06c5\3\2\2\2\u00e4"+
		"\u06e1\3\2\2\2\u00e6\u06e9\3\2\2\2\u00e8\u06ef\3\2\2\2\u00ea\u06f9\3\2"+
		"\2\2\u00ec\u06fb\3\2\2\2\u00ee\u072c\3\2\2\2\u00f0\u072e\3\2\2\2\u00f2"+
		"\u074b\3\2\2\2\u00f4\u074d\3\2\2\2\u00f6\u0762\3\2\2\2\u00f8\u0764\3\2"+
		"\2\2\u00fa\u0771\3\2\2\2\u00fc\u0773\3\2\2\2\u00fe\u0775\3\2\2\2\u0100"+
		"\u07bb\3\2\2\2\u0102\u07f9\3\2\2\2\u0104\u081e\3\2\2\2\u0106\u0823\3\2"+
		"\2\2\u0108\u0843\3\2\2\2\u010a\u0845\3\2\2\2\u010c\u0863\3\2\2\2\u010e"+
		"\u086b\3\2\2\2\u0110\u087f\3\2\2\2\u0112\u0882\3\2\2\2\u0114\u088e\3\2"+
		"\2\2\u0116\u0118\5\4\3\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\3\3\2\2\2\u011b\u0119\3\2\2\2"+
		"\u011c\u0129\5\6\4\2\u011d\u0129\5\b\5\2\u011e\u0129\5\n\6\2\u011f\u0129"+
		"\5\20\t\2\u0120\u0129\5\22\n\2\u0121\u0129\5\u00a4S\2\u0122\u0129\5\24"+
		"\13\2\u0123\u0129\5\30\r\2\u0124\u0129\5J&\2\u0125\u0129\5L\'\2\u0126"+
		"\u0129\5z>\2\u0127\u0129\5x=\2\u0128\u011c\3\2\2\2\u0128\u011d\3\2\2\2"+
		"\u0128\u011e\3\2\2\2\u0128\u011f\3\2\2\2\u0128\u0120\3\2\2\2\u0128\u0121"+
		"\3\2\2\2\u0128\u0122\3\2\2\2\u0128\u0123\3\2\2\2\u0128\u0124\3\2\2\2\u0128"+
		"\u0125\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0127\3\2\2\2\u0129\5\3\2\2\2"+
		"\u012a\u012b\7u\2\2\u012b\7\3\2\2\2\u012c\u012d\7v\2\2\u012d\t\3\2\2\2"+
		"\u012e\u012f\5\f\7\2\u012f\13\3\2\2\2\u0130\u0180\7W\2\2\u0131\u013b\7"+
		"X\2\2\u0132\u0135\7\3\2\2\u0133\u0136\5\u00be`\2\u0134\u0136\7B\2\2\u0135"+
		"\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0139\7@"+
		"\2\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u013c\7\4\2\2\u013b\u0132\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u0180\3\2"+
		"\2\2\u013d\u013e\7C\2\2\u013e\u0140\7\3\2\2\u013f\u0141\7@\2\2\u0140\u013f"+
		"\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\5\26\f\2"+
		"\u0143\u0145\7@\2\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146"+
		"\3\2\2\2\u0146\u0147\7\4\2\2\u0147\u0180\3\2\2\2\u0148\u0180\7D\2\2\u0149"+
		"\u014a\7J\2\2\u014a\u014c\7\3\2\2\u014b\u014d\7@\2\2\u014c\u014b\3\2\2"+
		"\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150\5\26\f\2\u014f"+
		"\u0151\7@\2\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\u0153\7\4\2\2\u0153\u0180\3\2\2\2\u0154\u0155\7E\2\2\u0155"+
		"\u0157\7\3\2\2\u0156\u0158\7@\2\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\u015b\3\2\2\2\u0159\u015c\5\16\b\2\u015a\u015c\7\5\2\2\u015b"+
		"\u0159\3\2\2\2\u015b\u015a\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u015f\7@"+
		"\2\2\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2\2\2\u0160"+
		"\u0162\5\26\f\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3"+
		"\2\2\2\u0163\u0165\7\5\2\2\u0164\u0166\7@\2\2\u0165\u0164\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u0169\5\u00caf\2\u0168\u0167"+
		"\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u016c\7@\2\2\u016b"+
		"\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f\7\4"+
		"\2\2\u016e\u0170\7\5\2\2\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u0180\3\2\2\2\u0171\u0180\7K\2\2\u0172\u0173\7F\2\2\u0173\u0175\7\3\2"+
		"\2\u0174\u0176\7@\2\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177"+
		"\3\2\2\2\u0177\u0179\5\26\f\2\u0178\u017a\7@\2\2\u0179\u0178\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\7\4\2\2\u017c\u017e\7\5"+
		"\2\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2\2\2\u017f"+
		"\u0130\3\2\2\2\u017f\u0131\3\2\2\2\u017f\u013d\3\2\2\2\u017f\u0148\3\2"+
		"\2\2\u017f\u0149\3\2\2\2\u017f\u0154\3\2\2\2\u017f\u0171\3\2\2\2\u017f"+
		"\u0172\3\2\2\2\u0180\r\3\2\2\2\u0181\u0186\5\u00a4S\2\u0182\u0183\5\u00ca"+
		"f\2\u0183\u0184\7\5\2\2\u0184\u0186\3\2\2\2\u0185\u0181\3\2\2\2\u0185"+
		"\u0182\3\2\2\2\u0186\17\3\2\2\2\u0187\u0188\7G\2\2\u0188\u019a\7\5\2\2"+
		"\u0189\u018a\7I\2\2\u018a\u019a\7\5\2\2\u018b\u018c\7L\2\2\u018c\u018d"+
		"\5\u00c2b\2\u018d\u018e\7\5\2\2\u018e\u019a\3\2\2\2\u018f\u0191\7M\2\2"+
		"\u0190\u0192\5\u00caf\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192"+
		"\u0193\3\2\2\2\u0193\u019a\7\5\2\2\u0194\u0196\7Y\2\2\u0195\u0197\5\u00ca"+
		"f\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\u019a\7\5\2\2\u0199\u0187\3\2\2\2\u0199\u0189\3\2\2\2\u0199\u018b\3\2"+
		"\2\2\u0199\u018f\3\2\2\2\u0199\u0194\3\2\2\2\u019a\21\3\2\2\2\u019b\u019d"+
		"\7H\2\2\u019c\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u01a2\3\2\2\2\u019e"+
		"\u01a3\5\u00c2b\2\u019f\u01a3\5\u00c4c\2\u01a0\u01a3\7}\2\2\u01a1\u01a3"+
		"\5\u00e6t\2\u01a2\u019e\3\2\2\2\u01a2\u019f\3\2\2\2\u01a2\u01a0\3\2\2"+
		"\2\u01a2\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\7\6\2\2\u01a5\23"+
		"\3\2\2\2\u01a6\u01a7\5\u00caf\2\u01a7\u01a8\7\5\2\2\u01a8\u01ab\3\2\2"+
		"\2\u01a9\u01ab\5\u010a\u0086\2\u01aa\u01a6\3\2\2\2\u01aa\u01a9\3\2\2\2"+
		"\u01ab\25\3\2\2\2\u01ac\u01ad\5\u00caf\2\u01ad\27\3\2\2\2\u01ae\u01b1"+
		"\5\32\16\2\u01af\u01b1\5&\24\2\u01b0\u01ae\3\2\2\2\u01b0\u01af\3\2\2\2"+
		"\u01b1\31\3\2\2\2\u01b2\u01b7\5\34\17\2\u01b3\u01b7\5\36\20\2\u01b4\u01b7"+
		"\5 \21\2\u01b5\u01b7\5\"\22\2\u01b6\u01b2\3\2\2\2\u01b6\u01b3\3\2\2\2"+
		"\u01b6\u01b4\3\2\2\2\u01b6\u01b5\3\2\2\2\u01b7\33\3\2\2\2\u01b8\u01b9"+
		"\7c\2\2\u01b9\u01ba\5$\23\2\u01ba\u01bb\b\17\1\2\u01bb\35\3\2\2\2\u01bc"+
		"\u01bd\7d\2\2\u01bd\u01be\5$\23\2\u01be\u01bf\b\20\1\2\u01bf\37\3\2\2"+
		"\2\u01c0\u01c1\7e\2\2\u01c1!\3\2\2\2\u01c2\u01c3\7f\2\2\u01c3#\3\2\2\2"+
		"\u01c4\u01cb\5\26\f\2\u01c5\u01c6\7\3\2\2\u01c6\u01c7\5\26\f\2\u01c7\u01c8"+
		"\7\4\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01cb\5.\30\2\u01ca\u01c4\3\2\2\2\u01ca"+
		"\u01c5\3\2\2\2\u01ca\u01c9\3\2\2\2\u01cb%\3\2\2\2\u01cc\u01d6\5(\25\2"+
		"\u01cd\u01d6\5*\26\2\u01ce\u01d6\5\66\34\2\u01cf\u01d6\58\35\2\u01d0\u01d6"+
		"\5> \2\u01d1\u01d6\5@!\2\u01d2\u01d6\5F$\2\u01d3\u01d6\5H%\2\u01d4\u01d6"+
		"\5\64\33\2\u01d5\u01cc\3\2\2\2\u01d5\u01cd\3\2\2\2\u01d5\u01ce\3\2\2\2"+
		"\u01d5\u01cf\3\2\2\2\u01d5\u01d0\3\2\2\2\u01d5\u01d1\3\2\2\2\u01d5\u01d2"+
		"\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d4\3\2\2\2\u01d6\'\3\2\2\2\u01d7"+
		"\u01d8\7g\2\2\u01d8\u01d9\5,\27\2\u01d9\u01da\t\2\2\2\u01da\u01e0\3\2"+
		"\2\2\u01db\u01dc\7g\2\2\u01dc\u01dd\5,\27\2\u01dd\u01de\5\62\32\2\u01de"+
		"\u01e0\3\2\2\2\u01df\u01d7\3\2\2\2\u01df\u01db\3\2\2\2\u01e0)\3\2\2\2"+
		"\u01e1\u01e2\7h\2\2\u01e2\u01e3\5,\27\2\u01e3+\3\2\2\2\u01e4\u01e9\5\u00c2"+
		"b\2\u01e5\u01e6\7\3\2\2\u01e6\u01e7\5\60\31\2\u01e7\u01e8\7\4\2\2\u01e8"+
		"\u01ea\3\2\2\2\u01e9\u01e5\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01f6\3\2"+
		"\2\2\u01eb\u01f6\5.\30\2\u01ec\u01f6\7s\2\2\u01ed\u01f2\7\7\2\2\u01ee"+
		"\u01ef\7\3\2\2\u01ef\u01f0\5\60\31\2\u01f0\u01f1\7\4\2\2\u01f1\u01f3\3"+
		"\2\2\2\u01f2\u01ee\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4"+
		"\u01f6\58\35\2\u01f5\u01e4\3\2\2\2\u01f5\u01eb\3\2\2\2\u01f5\u01ec\3\2"+
		"\2\2\u01f5\u01ed\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f6-\3\2\2\2\u01f7\u01f8"+
		"\t\3\2\2\u01f8/\3\2\2\2\u01f9\u01fc\5\u00c2b\2\u01fa\u01fc\7B\2\2\u01fb"+
		"\u01f9\3\2\2\2\u01fb\u01fa\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u0204\3\2"+
		"\2\2\u01fd\u0200\7\17\2\2\u01fe\u0201\5\u00c2b\2\u01ff\u0201\7B\2\2\u0200"+
		"\u01fe\3\2\2\2\u0200\u01ff\3\2\2\2\u0201\u0203\3\2\2\2\u0202\u01fd\3\2"+
		"\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205"+
		"\61\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u020b\5\u00caf\2\u0208\u0209\7A"+
		"\2\2\u0209\u020b\7@\2\2\u020a\u0207\3\2\2\2\u020a\u0208\3\2\2\2\u020b"+
		"\u020c\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\3\2"+
		"\2\2\u020e\u0211\t\2\2\2\u020f\u0211\b\32\1\2\u0210\u020a\3\2\2\2\u0210"+
		"\u020f\3\2\2\2\u0211\63\3\2\2\2\u0212\u0214\5,\27\2\u0213\u0212\3\2\2"+
		"\2\u0213\u0214\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\5,\27\2\u0216\u0233"+
		"\7\3\2\2\u0217\u021c\5\u00caf\2\u0218\u021c\5\u00b6\\\2\u0219\u021c\5"+
		"P)\2\u021a\u021c\5^\60\2\u021b\u0217\3\2\2\2\u021b\u0218\3\2\2\2\u021b"+
		"\u0219\3\2\2\2\u021b\u021a\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021e\3\2"+
		"\2\2\u021d\u021f\7@\2\2\u021e\u021d\3\2\2\2\u021e\u021f\3\2\2\2\u021f"+
		"\u022c\3\2\2\2\u0220\u0222\7\17\2\2\u0221\u0223\7@\2\2\u0222\u0221\3\2"+
		"\2\2\u0222\u0223\3\2\2\2\u0223\u0228\3\2\2\2\u0224\u0229\5\u00caf\2\u0225"+
		"\u0229\5\u00b6\\\2\u0226\u0229\5P)\2\u0227\u0229\5^\60\2\u0228\u0224\3"+
		"\2\2\2\u0228\u0225\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0227\3\2\2\2\u0229"+
		"\u022b\3\2\2\2\u022a\u0220\3\2\2\2\u022b\u022e\3\2\2\2\u022c\u022a\3\2"+
		"\2\2\u022c\u022d\3\2\2\2\u022d\u0230\3\2\2\2\u022e\u022c\3\2\2\2\u022f"+
		"\u0231\7\17\2\2\u0230\u022f\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0234\3"+
		"\2\2\2\u0232\u0234\7P\2\2\u0233\u021b\3\2\2\2\u0233\u0232\3\2\2\2\u0234"+
		"\u0235\3\2\2\2\u0235\u0236\7\4\2\2\u0236\65\3\2\2\2\u0237\u0238\7i\2\2"+
		"\u0238\u023b\7~\2\2\u0239\u023b\7i\2\2\u023a\u0237\3\2\2\2\u023a\u0239"+
		"\3\2\2\2\u023b\67\3\2\2\2\u023c\u023e\7j\2\2\u023d\u023f\7~\2\2\u023e"+
		"\u023d\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0250\3\2\2\2\u0240\u0241\7r"+
		"\2\2\u0241\u0242\7\3\2\2\u0242\u0244\7\3\2\2\u0243\u0245\5:\36\2\u0244"+
		"\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0247\7\4"+
		"\2\2\u0247\u0250\7\4\2\2\u0248\u0249\7r\2\2\u0249\u024b\7\3\2\2\u024a"+
		"\u024c\5:\36\2\u024b\u024a\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d\3\2"+
		"\2\2\u024d\u0250\7\4\2\2\u024e\u0250\7r\2\2\u024f\u023c\3\2\2\2\u024f"+
		"\u0240\3\2\2\2\u024f\u0248\3\2\2\2\u024f\u024e\3\2\2\2\u02509\3\2\2\2"+
		"\u0251\u0256\5<\37\2\u0252\u0253\7\17\2\2\u0253\u0255\5<\37\2\u0254\u0252"+
		"\3\2\2\2\u0255\u0258\3\2\2\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257"+
		";\3\2\2\2\u0258\u0256\3\2\2\2\u0259\u0276\5,\27\2\u025a\u025b\5,\27\2"+
		"\u025b\u025c\7\3\2\2\u025c\u0261\5\u00c2b\2\u025d\u025e\7\17\2\2\u025e"+
		"\u0260\5\u00caf\2\u025f\u025d\3\2\2\2\u0260\u0263\3\2\2\2\u0261\u025f"+
		"\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0264\3\2\2\2\u0263\u0261\3\2\2\2\u0264"+
		"\u0265\7\4\2\2\u0265\u0276\3\2\2\2\u0266\u0267\5,\27\2\u0267\u0269\7\3"+
		"\2\2\u0268\u026a\5\u00caf\2\u0269\u0268\3\2\2\2\u0269\u026a\3\2\2\2\u026a"+
		"\u026f\3\2\2\2\u026b\u026c\7\17\2\2\u026c\u026e\5\u00caf\2\u026d\u026b"+
		"\3\2\2\2\u026e\u0271\3\2\2\2\u026f\u026d\3\2\2\2\u026f\u0270\3\2\2\2\u0270"+
		"\u0272\3\2\2\2\u0271\u026f\3\2\2\2\u0272\u0273\7\4\2\2\u0273\u0276\3\2"+
		"\2\2\u0274\u0276\5R*\2\u0275\u0259\3\2\2\2\u0275\u025a\3\2\2\2\u0275\u0266"+
		"\3\2\2\2\u0275\u0274\3\2\2\2\u0276=\3\2\2\2\u0277\u0278\7k\2\2\u0278\u027d"+
		"\5B\"\2\u0279\u027a\7k\2\2\u027a\u027d\5,\27\2\u027b\u027d\7k\2\2\u027c"+
		"\u0277\3\2\2\2\u027c\u0279\3\2\2\2\u027c\u027b\3\2\2\2\u027d?\3\2\2\2"+
		"\u027e\u027f\7l\2\2\u027f\u0284\5B\"\2\u0280\u0281\7l\2\2\u0281\u0284"+
		"\5,\27\2\u0282\u0284\7l\2\2\u0283\u027e\3\2\2\2\u0283\u0280\3\2\2\2\u0283"+
		"\u0282\3\2\2\2\u0284A\3\2\2\2\u0285\u0286\5D#\2\u0286C\3\2\2\2\u0287\u0288"+
		"\7~\2\2\u0288E\3\2\2\2\u0289\u028a\7m\2\2\u028a\u028b\7x\2\2\u028b\u0298"+
		"\7~\2\2\u028c\u028d\7m\2\2\u028d\u028e\7x\2\2\u028e\u0298\5,\27\2\u028f"+
		"\u0290\7m\2\2\u0290\u0291\5,\27\2\u0291\u0292\7~\2\2\u0292\u0298\3\2\2"+
		"\2\u0293\u0294\7m\2\2\u0294\u0298\5,\27\2\u0295\u0296\7m\2\2\u0296\u0298"+
		"\7x\2\2\u0297\u0289\3\2\2\2\u0297\u028c\3\2\2\2\u0297\u028f\3\2\2\2\u0297"+
		"\u0293\3\2\2\2\u0297\u0295\3\2\2\2\u0298G\3\2\2\2\u0299\u029b\7n\2\2\u029a"+
		"\u029c\7o\2\2\u029b\u029a\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029d\3\2"+
		"\2\2\u029d\u029e\7p\2\2\u029e\u029f\7~\2\2\u029f\u02ae\b%\1\2\u02a0\u02a2"+
		"\7n\2\2\u02a1\u02a3\7o\2\2\u02a2\u02a1\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3"+
		"\u02a4\3\2\2\2\u02a4\u02a8\7p\2\2\u02a5\u02a7\5\u00c2b\2\u02a6\u02a5\3"+
		"\2\2\2\u02a7\u02aa\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9"+
		"\u02ae\3\2\2\2\u02aa\u02a8\3\2\2\2\u02ab\u02ac\7n\2\2\u02ac\u02ae\b%\1"+
		"\2\u02ad\u0299\3\2\2\2\u02ad\u02a0\3\2\2\2\u02ad\u02ab\3\2\2\2\u02aeI"+
		"\3\2\2\2\u02af\u02b0\7|\2\2\u02b0K\3\2\2\2\u02b1\u02b2\7@\2\2\u02b2M\3"+
		"\2\2\2\u02b3\u02b4\t\4\2\2\u02b4O\3\2\2\2\u02b5\u02b6\t\5\2\2\u02b6Q\3"+
		"\2\2\2\u02b7\u02cf\7w\2\2\u02b8\u02cf\7y\2\2\u02b9\u02cf\7x\2\2\u02ba"+
		"\u02bc\7~\2\2\u02bb\u02bd\7@\2\2\u02bc\u02bb\3\2\2\2\u02bc\u02bd\3\2\2"+
		"\2\u02bd\u02c1\3\2\2\2\u02be\u02c0\7|\2\2\u02bf\u02be\3\2\2\2\u02c0\u02c3"+
		"\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c5\3\2\2\2\u02c3"+
		"\u02c1\3\2\2\2\u02c4\u02c6\7@\2\2\u02c5\u02c4\3\2\2\2\u02c5\u02c6\3\2"+
		"\2\2\u02c6\u02c8\3\2\2\2\u02c7\u02ba\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9"+
		"\u02c7\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cf\3\2\2\2\u02cb\u02cf\7}"+
		"\2\2\u02cc\u02cf\7{\2\2\u02cd\u02cf\7z\2\2\u02ce\u02b7\3\2\2\2\u02ce\u02b8"+
		"\3\2\2\2\u02ce\u02b9\3\2\2\2\u02ce\u02c7\3\2\2\2\u02ce\u02cb\3\2\2\2\u02ce"+
		"\u02cc\3\2\2\2\u02ce\u02cd\3\2\2\2\u02cfS\3\2\2\2\u02d0\u02d1\t\6\2\2"+
		"\u02d1U\3\2\2\2\u02d2\u02d3\t\7\2\2\u02d3W\3\2\2\2\u02d4\u02d5\t\b\2\2"+
		"\u02d5Y\3\2\2\2\u02d6\u02d9\t\t\2\2\u02d7\u02d8\7\33\2\2\u02d8\u02da\7"+
		"\34\2\2\u02d9\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u0304\3\2\2\2\u02db"+
		"\u0304\7\22\2\2\u02dc\u0304\7\23\2\2\u02dd\u0304\7\21\2\2\u02de\u0304"+
		"\7\35\2\2\u02df\u0304\7\36\2\2\u02e0\u0304\7\37\2\2\u02e1\u0304\7\20\2"+
		"\2\u02e2\u0304\7 \2\2\u02e3\u0304\7\24\2\2\u02e4\u0304\7\25\2\2\u02e5"+
		"\u0304\7!\2\2\u02e6\u0304\7\26\2\2\u02e7\u0304\7\27\2\2\u02e8\u0304\7"+
		"\"\2\2\u02e9\u0304\7#\2\2\u02ea\u0304\7$\2\2\u02eb\u0304\7%\2\2\u02ec"+
		"\u0304\7&\2\2\u02ed\u0304\7\'\2\2\u02ee\u0304\7(\2\2\u02ef\u0304\7)\2"+
		"\2\u02f0\u0304\7*\2\2\u02f1\u0304\7+\2\2\u02f2\u0304\7,\2\2\u02f3\u0304"+
		"\7-\2\2\u02f4\u0304\7.\2\2\u02f5\u0304\7/\2\2\u02f6\u0304\7\30\2\2\u02f7"+
		"\u0304\7\31\2\2\u02f8\u0304\7\60\2\2\u02f9\u0304\7\61\2\2\u02fa\u0304"+
		"\7\62\2\2\u02fb\u0304\7\63\2\2\u02fc\u0304\7\17\2\2\u02fd\u0304\7\64\2"+
		"\2\u02fe\u0304\7\65\2\2\u02ff\u0300\7\3\2\2\u0300\u0304\7\4\2\2\u0301"+
		"\u0302\7\33\2\2\u0302\u0304\7\34\2\2\u0303\u02d6\3\2\2\2\u0303\u02db\3"+
		"\2\2\2\u0303\u02dc\3\2\2\2\u0303\u02dd\3\2\2\2\u0303\u02de\3\2\2\2\u0303"+
		"\u02df\3\2\2\2\u0303\u02e0\3\2\2\2\u0303\u02e1\3\2\2\2\u0303\u02e2\3\2"+
		"\2\2\u0303\u02e3\3\2\2\2\u0303\u02e4\3\2\2\2\u0303\u02e5\3\2\2\2\u0303"+
		"\u02e6\3\2\2\2\u0303\u02e7\3\2\2\2\u0303\u02e8\3\2\2\2\u0303\u02e9\3\2"+
		"\2\2\u0303\u02ea\3\2\2\2\u0303\u02eb\3\2\2\2\u0303\u02ec\3\2\2\2\u0303"+
		"\u02ed\3\2\2\2\u0303\u02ee\3\2\2\2\u0303\u02ef\3\2\2\2\u0303\u02f0\3\2"+
		"\2\2\u0303\u02f1\3\2\2\2\u0303\u02f2\3\2\2\2\u0303\u02f3\3\2\2\2\u0303"+
		"\u02f4\3\2\2\2\u0303\u02f5\3\2\2\2\u0303\u02f6\3\2\2\2\u0303\u02f7\3\2"+
		"\2\2\u0303\u02f8\3\2\2\2\u0303\u02f9\3\2\2\2\u0303\u02fa\3\2\2\2\u0303"+
		"\u02fb\3\2\2\2\u0303\u02fc\3\2\2\2\u0303\u02fd\3\2\2\2\u0303\u02fe\3\2"+
		"\2\2\u0303\u02ff\3\2\2\2\u0303\u0301\3\2\2\2\u0304[\3\2\2\2\u0305\u0306"+
		"\t\n\2\2\u0306]\3\2\2\2\u0307\u0308\t\13\2\2\u0308_\3\2\2\2\u0309\u030a"+
		"\7`\2\2\u030a\u030b\7\26\2\2\u030b\u030c\5b\62\2\u030c\u030d\7\27\2\2"+
		"\u030da\3\2\2\2\u030e\u030f\7\26\2\2\u030f\u0310\5b\62\2\u0310\u0311\7"+
		"\27\2\2\u0311\u0318\3\2\2\2\u0312\u0313\7\3\2\2\u0313\u0314\5b\62\2\u0314"+
		"\u0315\7\4\2\2\u0315\u0318\3\2\2\2\u0316\u0318\5j\66\2\u0317\u030e\3\2"+
		"\2\2\u0317\u0312\3\2\2\2\u0317\u0316\3\2\2\2\u0318\u0319\3\2\2\2\u0319"+
		"\u0317\3\2\2\2\u0319\u031a\3\2\2\2\u031ac\3\2\2\2\u031b\u031c\n\f\2\2"+
		"\u031ce\3\2\2\2\u031d\u031e\n\r\2\2\u031eg\3\2\2\2\u031f\u0320\n\16\2"+
		"\2\u0320i\3\2\2\2\u0321\u0322\n\17\2\2\u0322k\3\2\2\2\u0323\u0324\n\20"+
		"\2\2\u0324m\3\2\2\2\u0325\u0326\n\21\2\2\u0326o\3\2\2\2\u0327\u0328\n"+
		"\22\2\2\u0328q\3\2\2\2\u0329\u032a\n\23\2\2\u032as\3\2\2\2\u032b\u032c"+
		"\n\24\2\2\u032cu\3\2\2\2\u032d\u032e\n\r\2\2\u032ew\3\2\2\2\u032f\u0330"+
		"\13\2\2\2\u0330y\3\2\2\2\u0331\u0336\5|?\2\u0332\u0336\5~@\2\u0333\u0336"+
		"\5\u0080A\2\u0334\u0336\5\u0084C\2\u0335\u0331\3\2\2\2\u0335\u0332\3\2"+
		"\2\2\u0335\u0333\3\2\2\2\u0335\u0334\3\2\2\2\u0336{\3\2\2\2\u0337\u0338"+
		"\5,\27\2\u0338\u0339\7\17\2\2\u0339\u033b\3\2\2\2\u033a\u0337\3\2\2\2"+
		"\u033b\u033c\3\2\2\2\u033c\u033a\3\2\2\2\u033c\u033d\3\2\2\2\u033d}\3"+
		"\2\2\2\u033e\u033f\7T\2\2\u033f\u0341\7\66\2\2\u0340\u0342\7u\2\2\u0341"+
		"\u0340\3\2\2\2\u0341\u0342\3\2\2\2\u0342\177\3\2\2\2\u0343\u0345\5\64"+
		"\33\2\u0344\u0346\7@\2\2\u0345\u0344\3\2\2\2\u0345\u0346\3\2\2\2\u0346"+
		"\u0348\3\2\2\2\u0347\u0349\5,\27\2\u0348\u0347\3\2\2\2\u0348\u0349\3\2"+
		"\2\2\u0349\u034b\3\2\2\2\u034a\u034c\7@\2\2\u034b\u034a\3\2\2\2\u034b"+
		"\u034c\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034f\5\64\33\2\u034e\u0350\7"+
		"@\2\2\u034f\u034e\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0351\3\2\2\2\u0351"+
		"\u0352\5\u00acW\2\u0352\u0081\3\2\2\2\u0353\u0354\7\7\2\2\u0354\u0355"+
		"\7\3\2\2\u0355\u0356\5\u009eP\2\u0356\u0357\7\4\2\2\u0357\u0083\3\2\2"+
		"\2\u0358\u0359\7s\2\2\u0359\u0085\3\2\2\2\u035a\u035c\5`\61\2\u035b\u035a"+
		"\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035e\3\2\2\2\u035d\u035f\5\u008aF"+
		"\2\u035e\u035d\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0367\3\2\2\2\u0360\u0364"+
		"\58\35\2\u0361\u0363\5\u010e\u0088\2\u0362\u0361\3\2\2\2\u0363\u0366\3"+
		"\2\2\2\u0364\u0362\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0368\3\2\2\2\u0366"+
		"\u0364\3\2\2\2\u0367\u0360\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u0369\3\2"+
		"\2\2\u0369\u036d\5\u009eP\2\u036a\u036c\5\u010e\u0088\2\u036b\u036a\3"+
		"\2\2\2\u036c\u036f\3\2\2\2\u036d\u036b\3\2\2\2\u036d\u036e\3\2\2\2\u036e"+
		"\u0370\3\2\2\2\u036f\u036d\3\2\2\2\u0370\u0372\5\u008cG\2\u0371\u0373"+
		"\5\u0096L\2\u0372\u0371\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0377\3\2\2"+
		"\2\u0374\u0376\5\u010e\u0088\2\u0375\u0374\3\2\2\2\u0376\u0379\3\2\2\2"+
		"\u0377\u0375\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u037a\3\2\2\2\u0379\u0377"+
		"\3\2\2\2\u037a\u037b\5\u0094K\2\u037b\u0389\3\2\2\2\u037c\u037e\5\u008a"+
		"F\2\u037d\u037c\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u037f\3\2\2\2\u037f"+
		"\u0383\5\u0088E\2\u0380\u0382\5\u010e\u0088\2\u0381\u0380\3\2\2\2\u0382"+
		"\u0385\3\2\2\2\u0383\u0381\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0386\3\2"+
		"\2\2\u0385\u0383\3\2\2\2\u0386\u0387\5\u0094K\2\u0387\u0389\3\2\2\2\u0388"+
		"\u035b\3\2\2\2\u0388\u037d\3\2\2\2\u0389\u0087\3\2\2\2\u038a\u038b\5\64"+
		"\33\2\u038b\u0089\3\2\2\2\u038c\u0390\5T+\2\u038d\u038f\5\u010e\u0088"+
		"\2\u038e\u038d\3\2\2\2\u038f\u0392\3\2\2\2\u0390\u038e\3\2\2\2\u0390\u0391"+
		"\3\2\2\2\u0391\u0394\3\2\2\2\u0392\u0390\3\2\2\2\u0393\u038c\3\2\2\2\u0394"+
		"\u0397\3\2\2\2\u0395\u0393\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0398\3\2"+
		"\2\2\u0397\u0395\3\2\2\2\u0398\u0399\5\u00b6\\\2\u0399\u03a3\3\2\2\2\u039a"+
		"\u039e\5V,\2\u039b\u039d\5\u010e\u0088\2\u039c\u039b\3\2\2\2\u039d\u03a0"+
		"\3\2\2\2\u039e\u039c\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a2\3\2\2\2\u03a0"+
		"\u039e\3\2\2\2\u03a1\u039a\3\2\2\2\u03a2\u03a5\3\2\2\2\u03a3\u03a1\3\2"+
		"\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03ae\3\2\2\2\u03a5\u03a3\3\2\2\2\u03a6"+
		"\u03aa\5\64\33\2\u03a7\u03a9\5\u010e\u0088\2\u03a8\u03a7\3\2\2\2\u03a9"+
		"\u03ac\3\2\2\2\u03aa\u03a8\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03ae\3\2"+
		"\2\2\u03ac\u03aa\3\2\2\2\u03ad\u0395\3\2\2\2\u03ad\u03a6\3\2\2\2\u03ae"+
		"\u008b\3\2\2\2\u03af\u03b3\7\3\2\2\u03b0\u03b2\5\u010e\u0088\2\u03b1\u03b0"+
		"\3\2\2\2\u03b2\u03b5\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4"+
		"\u03b7\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b6\u03b8\5\u008eH\2\u03b7\u03b6"+
		"\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03bc\3\2\2\2\u03b9\u03bb\5\u010e\u0088"+
		"\2\u03ba\u03b9\3\2\2\2\u03bb\u03be\3\2\2\2\u03bc\u03ba\3\2\2\2\u03bc\u03bd"+
		"\3\2\2\2\u03bd\u03bf\3\2\2\2\u03be\u03bc\3\2\2\2\u03bf\u03c1\7\4\2\2\u03c0"+
		"\u03c2\7\21\2\2\u03c1\u03c0\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03cc\3"+
		"\2\2\2\u03c3\u03c7\7S\2\2\u03c4\u03c6\5\u010e\u0088\2\u03c5\u03c4\3\2"+
		"\2\2\u03c6\u03c9\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8"+
		"\u03cb\3\2\2\2\u03c9\u03c7\3\2\2\2\u03ca\u03c3\3\2\2\2\u03cb\u03ce\3\2"+
		"\2\2\u03cc\u03ca\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03d0\3\2\2\2\u03ce"+
		"\u03cc\3\2\2\2\u03cf\u03d1\5\u00a0Q\2\u03d0\u03cf\3\2\2\2\u03d0\u03d1"+
		"\3\2\2\2\u03d1\u040f\3\2\2\2\u03d2\u03d6\7\3\2\2\u03d3\u03d5\5\u010e\u0088"+
		"\2\u03d4\u03d3\3\2\2\2\u03d5\u03d8\3\2\2\2\u03d6\u03d4\3\2\2\2\u03d6\u03d7"+
		"\3\2\2\2\u03d7\u03d9\3\2\2\2\u03d8\u03d6\3\2\2\2\u03d9\u03e4\5\u00ba^"+
		"\2\u03da\u03de\7\17\2\2\u03db\u03dd\5\u010e\u0088\2\u03dc\u03db\3\2\2"+
		"\2\u03dd\u03e0\3\2\2\2\u03de\u03dc\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e1"+
		"\3\2\2\2\u03e0\u03de\3\2\2\2\u03e1\u03e3\5\u00ba^\2\u03e2\u03da\3\2\2"+
		"\2\u03e3\u03e6\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03ea"+
		"\3\2\2\2\u03e6\u03e4\3\2\2\2\u03e7\u03e9\5\u010e\u0088\2\u03e8\u03e7\3"+
		"\2\2\2\u03e9\u03ec\3\2\2\2\u03ea\u03e8\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb"+
		"\u03ed\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ed\u03f1\7\4\2\2\u03ee\u03f0\5\u010e"+
		"\u0088\2\u03ef\u03ee\3\2\2\2\u03f0\u03f3\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f1"+
		"\u03f2\3\2\2\2\u03f2\u040a\3\2\2\2\u03f3\u03f1\3\2\2\2\u03f4\u03f5\5\u00b6"+
		"\\\2\u03f5\u0400\5\u0092J\2\u03f6\u03fa\7\17\2\2\u03f7\u03f9\5\u010e\u0088"+
		"\2\u03f8\u03f7\3\2\2\2\u03f9\u03fc\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fa\u03fb"+
		"\3\2\2\2\u03fb\u03fd\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fd\u03ff\5\u0092J"+
		"\2\u03fe\u03f6\3\2\2\2\u03ff\u0402\3\2\2\2\u0400\u03fe\3\2\2\2\u0400\u0401"+
		"\3\2\2\2\u0401\u0403\3\2\2\2\u0402\u0400\3\2\2\2\u0403\u0407\7\5\2\2\u0404"+
		"\u0406\5\u010e\u0088\2\u0405\u0404\3\2\2\2\u0406\u0409\3\2\2\2\u0407\u0405"+
		"\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u040b\3\2\2\2\u0409\u0407\3\2\2\2\u040a"+
		"\u03f4\3\2\2\2\u040b\u040c\3\2\2\2\u040c\u040a\3\2\2\2\u040c\u040d\3\2"+
		"\2\2\u040d\u040f\3\2\2\2\u040e\u03af\3\2\2\2\u040e\u03d2\3\2\2\2\u040f"+
		"\u008d\3\2\2\2\u0410\u0412\5\u010e\u0088\2\u0411\u0410\3\2\2\2\u0412\u0415"+
		"\3\2\2\2\u0413\u0411\3\2\2\2\u0413\u0414\3\2\2\2\u0414\u0416\3\2\2\2\u0415"+
		"\u0413\3\2\2\2\u0416\u0427\5\u0090I\2\u0417\u0419\5\u010e\u0088\2\u0418"+
		"\u0417\3\2\2\2\u0419\u041c\3\2\2\2\u041a\u0418\3\2\2\2\u041a\u041b\3\2"+
		"\2\2\u041b\u041d\3\2\2\2\u041c\u041a\3\2\2\2\u041d\u0421\7\17\2\2\u041e"+
		"\u0420\5\u010e\u0088\2\u041f\u041e\3\2\2\2\u0420\u0423\3\2\2\2\u0421\u041f"+
		"\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u0424\3\2\2\2\u0423\u0421\3\2\2\2\u0424"+
		"\u0426\5\u0090I\2\u0425\u041a\3\2\2\2\u0426\u0429\3\2\2\2\u0427\u0425"+
		"\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u0438\3\2\2\2\u0429\u0427\3\2\2\2\u042a"+
		"\u042c\5\u010e\u0088\2\u042b\u042a\3\2\2\2\u042c\u042f\3\2\2\2\u042d\u042b"+
		"\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u0430\3\2\2\2\u042f\u042d\3\2\2\2\u0430"+
		"\u0434\7\17\2\2\u0431\u0433\5\u010e\u0088\2\u0432\u0431\3\2\2\2\u0433"+
		"\u0436\3\2\2\2\u0434\u0432\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u0437\3\2"+
		"\2\2\u0436\u0434\3\2\2\2\u0437\u0439\7B\2\2\u0438\u042d\3\2\2\2\u0438"+
		"\u0439\3\2\2\2\u0439\u008f\3\2\2\2\u043a\u043f\7P\2\2\u043b\u043c\5\u00b6"+
		"\\\2\u043c\u043d\5\u0092J\2\u043d\u043f\3\2\2\2\u043e\u043a\3\2\2\2\u043e"+
		"\u043b\3\2\2\2\u043f\u0091\3\2\2\2\u0440\u0442\5\u00c6d\2\u0441\u0440"+
		"\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0448\3\2\2\2\u0443\u0444\7\3\2\2\u0444"+
		"\u0445\5\u0092J\2\u0445\u0446\7\4\2\2\u0446\u0449\3\2\2\2\u0447\u0449"+
		"\5\u00ba^\2\u0448\u0443\3\2\2\2\u0448\u0447\3\2\2\2\u0449\u044b\3\2\2"+
		"\2\u044a\u044c\5\u0114\u008b\2\u044b\u044a\3\2\2\2\u044b\u044c\3\2\2\2"+
		"\u044c\u0093\3\2\2\2\u044d\u044e\7u\2\2\u044e\u044f\bK\1\2\u044f\u0095"+
		"\3\2\2\2\u0450\u0451\7\6\2\2\u0451\u0456\5\u0098M\2\u0452\u0453\7\17\2"+
		"\2\u0453\u0455\5\u0098M\2\u0454\u0452\3\2\2\2\u0455\u0458\3\2\2\2\u0456"+
		"\u0454\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u0097\3\2\2\2\u0458\u0456\3\2"+
		"\2\2\u0459\u045a\5\u009aN\2\u045a\u045b\5\u009cO\2\u045b\u0099\3\2\2\2"+
		"\u045c\u045e\7\67\2\2\u045d\u045c\3\2\2\2\u045d\u045e\3\2\2\2\u045e\u045f"+
		"\3\2\2\2\u045f\u0460\5\u00c2b\2\u0460\u009b\3\2\2\2\u0461\u0463\7\3\2"+
		"\2\u0462\u0464\5\u00caf\2\u0463\u0462\3\2\2\2\u0463\u0464\3\2\2\2\u0464"+
		"\u0465\3\2\2\2\u0465\u0466\7\4\2\2\u0466\u009d\3\2\2\2\u0467\u046f\5\u00c2"+
		"b\2\u0468\u0469\7\3\2\2\u0469\u046a\5\u009eP\2\u046a\u046b\7\4\2\2\u046b"+
		"\u046f\3\2\2\2\u046c\u046d\7_\2\2\u046d\u046f\5Z.\2\u046e\u0467\3\2\2"+
		"\2\u046e\u0468\3\2\2\2\u046e\u046c\3\2\2\2\u046f\u009f\3\2\2\2\u0470\u0471"+
		"\7Y\2\2\u0471\u0472\7\3\2\2\u0472\u0473\5\u00a2R\2\u0473\u0474\7\4\2\2"+
		"\u0474\u00a1\3\2\2\2\u0475\u0477\5d\63\2\u0476\u0475\3\2\2\2\u0477\u047a"+
		"\3\2\2\2\u0478\u0476\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u0486\3\2\2\2\u047a"+
		"\u0478\3\2\2\2\u047b\u047c\7\3\2\2\u047c\u047d\5\u00a2R\2\u047d\u0481"+
		"\7\4\2\2\u047e\u0480\5d\63\2\u047f\u047e\3\2\2\2\u0480\u0483\3\2\2\2\u0481"+
		"\u047f\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0485\3\2\2\2\u0483\u0481\3\2"+
		"\2\2\u0484\u047b\3\2\2\2\u0485\u0488\3\2\2\2\u0486\u0484\3\2\2\2\u0486"+
		"\u0487\3\2\2\2\u0487\u00a3\3\2\2\2\u0488\u0486\3\2\2\2\u0489\u048a\5\u00a6"+
		"T\2\u048a\u00a5\3\2\2\2\u048b\u048d\5`\61\2\u048c\u048b\3\2\2\2\u048c"+
		"\u048d\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u0490\5\u00aeX\2\u048f\u0491"+
		"\5\u00acW\2\u0490\u048f\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u04d6\3\2\2"+
		"\2\u0492\u0494\7N\2\2\u0493\u0495\7@\2\2\u0494\u0493\3\2\2\2\u0494\u0495"+
		"\3\2\2\2\u0495\u0497\3\2\2\2\u0496\u0492\3\2\2\2\u0496\u0497\3\2\2\2\u0497"+
		"\u0499\3\2\2\2\u0498\u049a\5`\61\2\u0499\u0498\3\2\2\2\u0499\u049a\3\2"+
		"\2\2\u049a\u049b\3\2\2\2\u049b\u049c\5\u00b6\\\2\u049c\u049d\5\u00acW"+
		"\2\u049d\u04d6\3\2\2\2\u049e\u04a0\7N\2\2\u049f\u04a1\7@\2\2\u04a0\u049f"+
		"\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a3\3\2\2\2\u04a2\u049e\3\2\2\2\u04a2"+
		"\u04a3\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u04a5\5\u00b6\\\2\u04a5\u04a7"+
		"\7\3\2\2\u04a6\u04a8\5\u00a8U\2\u04a7\u04a6\3\2\2\2\u04a7\u04a8\3\2\2"+
		"\2\u04a8\u04a9\3\2\2\2\u04a9\u04ab\5V,\2\u04aa\u04ac\5\u00c2b\2\u04ab"+
		"\u04aa\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad\u04ae\7\4"+
		"\2\2\u04ae\u04b0\5\u00bc_\2\u04af\u04b1\7@\2\2\u04b0\u04af\3\2\2\2\u04b0"+
		"\u04b1\3\2\2\2\u04b1\u04b4\3\2\2\2\u04b2\u04b5\58\35\2\u04b3\u04b5\5\64"+
		"\33\2\u04b4\u04b2\3\2\2\2\u04b4\u04b3\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5"+
		"\u04bb\3\2\2\2\u04b6\u04b8\7!\2\2\u04b7\u04b9\7@\2\2\u04b8\u04b7\3\2\2"+
		"\2\u04b8\u04b9\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba\u04bc\5\u0106\u0084\2"+
		"\u04bb\u04b6\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04be"+
		"\7\5\2\2\u04be\u04d6\3\2\2\2\u04bf\u04c3\7S\2\2\u04c0\u04c3\5T+\2\u04c1"+
		"\u04c3\7N\2\2\u04c2\u04bf\3\2\2\2\u04c2\u04c0\3\2\2\2\u04c2\u04c1\3\2"+
		"\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04c2\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5"+
		"\u04c7\3\2\2\2\u04c6\u04c8\7@\2\2\u04c7\u04c6\3\2\2\2\u04c7\u04c8\3\2"+
		"\2\2\u04c8\u04ca\3\2\2\2\u04c9\u04c2\3\2\2\2\u04c9\u04ca\3\2\2\2\u04ca"+
		"\u04cb\3\2\2\2\u04cb\u04cd\5\u00aaV\2\u04cc\u04ce\7@\2\2\u04cd\u04cc\3"+
		"\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04d0\3\2\2\2\u04cf\u04d1\5\u00acW\2"+
		"\u04d0\u04cf\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d3\3\2\2\2\u04d2\u04d4"+
		"\7\5\2\2\u04d3\u04d2\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d6\3\2\2\2\u04d5"+
		"\u048c\3\2\2\2\u04d5\u0496\3\2\2\2\u04d5\u04a2\3\2\2\2\u04d5\u04c9\3\2"+
		"\2\2\u04d6\u00a7\3\2\2\2\u04d7\u04d9\7t\2\2\u04d8\u04d7\3\2\2\2\u04d9"+
		"\u04da\3\2\2\2\u04da\u04d8\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u00a9\3\2"+
		"\2\2\u04dc\u04de\7^\2\2\u04dd\u04df\7@\2\2\u04de\u04dd\3\2\2\2\u04de\u04df"+
		"\3\2\2\2\u04df\u04e1\3\2\2\2\u04e0\u04e2\58\35\2\u04e1\u04e0\3\2\2\2\u04e1"+
		"\u04e2\3\2\2\2\u04e2\u04e7\3\2\2\2\u04e3\u04e5\5\u00c2b\2\u04e4\u04e6"+
		"\7@\2\2\u04e5\u04e4\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04e8\3\2\2\2\u04e7"+
		"\u04e3\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8\u04ea\3\2\2\2\u04e9\u04eb\58"+
		"\35\2\u04ea\u04e9\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec"+
		"\u04ed\7u\2\2\u04ed\u050c\bV\1\2\u04ee\u04f0\7^\2\2\u04ef\u04f1\7@\2\2"+
		"\u04f0\u04ef\3\2\2\2\u04f0\u04f1\3\2\2\2\u04f1\u04f3\3\2\2\2\u04f2\u04f4"+
		"\58\35\2\u04f3\u04f2\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5"+
		"\u04f7\5\u00c2b\2\u04f6\u04f8\7@\2\2\u04f7\u04f6\3\2\2\2\u04f7\u04f8\3"+
		"\2\2\2\u04f8\u04fa\3\2\2\2\u04f9\u04fb\5\u00c6d\2\u04fa\u04f9\3\2\2\2"+
		"\u04fa\u04fb\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04fe\5\u00c2b\2\u04fd"+
		"\u04ff\5\u00c6d\2\u04fe\u04fd\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0500"+
		"\3\2\2\2\u0500\u0501\7!\2\2\u0501\u0502\bV\1\2\u0502\u050c\3\2\2\2\u0503"+
		"\u0505\7^\2\2\u0504\u0506\7@\2\2\u0505\u0504\3\2\2\2\u0505\u0506\3\2\2"+
		"\2\u0506\u0508\3\2\2\2\u0507\u0509\58\35\2\u0508\u0507\3\2\2\2\u0508\u0509"+
		"\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050c\5\u00c2b\2\u050b\u04dc\3\2\2"+
		"\2\u050b\u04ee\3\2\2\2\u050b\u0503\3\2\2\2\u050c\u00ab\3\2\2\2\u050d\u0518"+
		"\5\u0110\u0089\2\u050e\u0510\7@\2\2\u050f\u050e\3\2\2\2\u050f\u0510\3"+
		"\2\2\2\u0510\u0511\3\2\2\2\u0511\u0513\7\17\2\2\u0512\u0514\7@\2\2\u0513"+
		"\u0512\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0515\3\2\2\2\u0515\u0517\5\u0110"+
		"\u0089\2\u0516\u050f\3\2\2\2\u0517\u051a\3\2\2\2\u0518\u0516\3\2\2\2\u0518"+
		"\u0519\3\2\2\2\u0519\u051c\3\2\2\2\u051a\u0518\3\2\2\2\u051b\u051d\7@"+
		"\2\2\u051c\u051b\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u051f\3\2\2\2\u051e"+
		"\u0520\58\35\2\u051f\u051e\3\2\2\2\u051f\u0520\3\2\2\2\u0520\u0521\3\2"+
		"\2\2\u0521\u0522\7\5\2\2\u0522\u00ad\3\2\2\2\u0523\u0525\7a\2\2\u0524"+
		"\u0526\7@\2\2\u0525\u0524\3\2\2\2\u0525\u0526\3\2\2\2\u0526\u0528\3\2"+
		"\2\2\u0527\u0529\5\u00b0Y\2\u0528\u0527\3\2\2\2\u0528\u0529\3\2\2\2\u0529"+
		"\u052b\3\2\2\2\u052a\u052c\5\u00b2Z\2\u052b\u052a\3\2\2\2\u052b\u052c"+
		"\3\2\2\2\u052c\u052d\3\2\2\2\u052d\u052e\7u\2\2\u052e\u052f\bX\1\2\u052f"+
		"\u00af\3\2\2\2\u0530\u0531\5\u00c2b\2\u0531\u00b1\3\2\2\2\u0532\u0533"+
		"\7\6\2\2\u0533\u0538\5\u00b4[\2\u0534\u0535\7\17\2\2\u0535\u0537\5\u00b4"+
		"[\2\u0536\u0534\3\2\2\2\u0537\u053a\3\2\2\2\u0538\u0536\3\2\2\2\u0538"+
		"\u0539\3\2\2\2\u0539\u00b3\3\2\2\2\u053a\u0538\3\2\2\2\u053b\u053d\7V"+
		"\2\2\u053c\u053e\7@\2\2\u053d\u053c\3\2\2\2\u053d\u053e\3\2\2\2\u053e"+
		"\u0540\3\2\2\2\u053f\u053b\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u0542\3\2"+
		"\2\2\u0541\u0543\5X-\2\u0542\u0541\3\2\2\2\u0542\u0543\3\2\2\2\u0543\u0544"+
		"\3\2\2\2\u0544\u0545\5\u00c2b\2\u0545\u00b5\3\2\2\2\u0546\u0548\7T\2\2"+
		"\u0547\u0549\7@\2\2\u0548\u0547\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u057a"+
		"\3\2\2\2\u054a\u054c\5T+\2\u054b\u054d\7@\2\2\u054c\u054b\3\2\2\2\u054c"+
		"\u054d\3\2\2\2\u054d\u057a\3\2\2\2\u054e\u0550\7S\2\2\u054f\u0551\7@\2"+
		"\2\u0550\u054f\3\2\2\2\u0550\u0551\3\2\2\2\u0551\u057a\3\2\2\2\u0552\u0554"+
		"\7Q\2\2\u0553\u0555\7@\2\2\u0554\u0553\3\2\2\2\u0554\u0555\3\2\2\2\u0555"+
		"\u057a\3\2\2\2\u0556\u0558\7R\2\2\u0557\u0559\7@\2\2\u0558\u0557\3\2\2"+
		"\2\u0558\u0559\3\2\2\2\u0559\u057a\3\2\2\2\u055a\u055c\7\\\2\2\u055b\u055d"+
		"\7@\2\2\u055c\u055b\3\2\2\2\u055c\u055d\3\2\2\2\u055d\u057a\3\2\2\2\u055e"+
		"\u0560\7]\2\2\u055f\u0561\7@\2\2\u0560\u055f\3\2\2\2\u0560\u0561\3\2\2"+
		"\2\u0561\u057a\3\2\2\2\u0562\u0564\5V,\2\u0563\u0565\7@\2\2\u0564\u0563"+
		"\3\2\2\2\u0564\u0565\3\2\2\2\u0565\u057a\3\2\2\2\u0566\u057a\5\u00b8]"+
		"\2\u0567\u0568\7\26\2\2\u0568\u0569\5b\62\2\u0569\u056a\7\27\2\2\u056a"+
		"\u0575\3\2\2\2\u056b\u056c\7\67\2\2\u056c\u0571\5\u00b8]\2\u056d\u056e"+
		"\7\26\2\2\u056e\u056f\5b\62\2\u056f\u0570\7\27\2\2\u0570\u0572\3\2\2\2"+
		"\u0571\u056d\3\2\2\2\u0571\u0572\3\2\2\2\u0572\u0574\3\2\2\2\u0573\u056b"+
		"\3\2\2\2\u0574\u0577\3\2\2\2\u0575\u0573\3\2\2\2\u0575\u0576\3\2\2\2\u0576"+
		"\u057a\3\2\2\2\u0577\u0575\3\2\2\2\u0578\u057a\5\64\33\2\u0579\u0546\3"+
		"\2\2\2\u0579\u054a\3\2\2\2\u0579\u054e\3\2\2\2\u0579\u0552\3\2\2\2\u0579"+
		"\u0556\3\2\2\2\u0579\u055a\3\2\2\2\u0579\u055e\3\2\2\2\u0579\u0562\3\2"+
		"\2\2\u0579\u0566\3\2\2\2\u0579\u0567\3\2\2\2\u0579\u0578\3\2\2\2\u057a"+
		"\u057b\3\2\2\2\u057b\u0579\3\2\2\2\u057b\u057c\3\2\2\2\u057c\u00b7\3\2"+
		"\2\2\u057d\u057f\7P\2\2\u057e\u0580\7@\2\2\u057f\u057e\3\2\2\2\u057f\u0580"+
		"\3\2\2\2\u0580\u059a\3\2\2\2\u0581\u0583\7\16\2\2\u0582\u0584\7@\2\2\u0583"+
		"\u0582\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u059a\3\2\2\2\u0585\u0587\78"+
		"\2\2\u0586\u0588\7@\2\2\u0587\u0586\3\2\2\2\u0587\u0588\3\2\2\2\u0588"+
		"\u059a\3\2\2\2\u0589\u058b\79\2\2\u058a\u058c\7@\2\2\u058b\u058a\3\2\2"+
		"\2\u058b\u058c\3\2\2\2\u058c\u059a\3\2\2\2\u058d\u058f\7^\2\2\u058e\u0590"+
		"\7@\2\2\u058f\u058e\3\2\2\2\u058f\u0590\3\2\2\2\u0590\u059a\3\2\2\2\u0591"+
		"\u0593\7a\2\2\u0592\u0594\7@\2\2\u0593\u0592\3\2\2\2\u0593\u0594\3\2\2"+
		"\2\u0594\u059a\3\2\2\2\u0595\u0597\7t\2\2\u0596\u0598\7@\2\2\u0597\u0596"+
		"\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u059a\3\2\2\2\u0599\u057d\3\2\2\2\u0599"+
		"\u0581\3\2\2\2\u0599\u0585\3\2\2\2\u0599\u0589\3\2\2\2\u0599\u058d\3\2"+
		"\2\2\u0599\u0591\3\2\2\2\u0599\u0595\3\2\2\2\u059a\u059b\3\2\2\2\u059b"+
		"\u0599\3\2\2\2\u059b\u059c\3\2\2\2\u059c\u00b9\3\2\2\2\u059d\u059f\5\u00c2"+
		"b\2\u059e\u05a0\7@\2\2\u059f\u059e\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u00bb"+
		"\3\2\2\2\u05a1\u05a2\7\3\2\2\u05a2\u05a3\7P\2\2\u05a3\u05b4\7\4\2\2\u05a4"+
		"\u05b0\7\3\2\2\u05a5\u05ad\5\u00be`\2\u05a6\u05a8\7\17\2\2\u05a7\u05a9"+
		"\7@\2\2\u05a8\u05a7\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa"+
		"\u05ac\5\u00be`\2\u05ab\u05a6\3\2\2\2\u05ac\u05af\3\2\2\2\u05ad\u05ab"+
		"\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae\u05b1\3\2\2\2\u05af\u05ad\3\2\2\2\u05b0"+
		"\u05a5\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2\u05b4\7\4"+
		"\2\2\u05b3\u05a1\3\2\2\2\u05b3\u05a4\3\2\2\2\u05b4\u00bd\3\2\2\2\u05b5"+
		"\u05b7\5\u00b6\\\2\u05b6\u05b8\7@\2\2\u05b7\u05b6\3\2\2\2\u05b7\u05b8"+
		"\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9\u05ba\5\u00c0a\2\u05ba\u05bd\3\2\2"+
		"\2\u05bb\u05bd\7B\2\2\u05bc\u05b5\3\2\2\2\u05bc\u05bb\3\2\2\2\u05bd\u00bf"+
		"\3\2\2\2\u05be\u05c0\5\u00c6d\2\u05bf\u05be\3\2\2\2\u05bf\u05c0\3\2\2"+
		"\2\u05c0\u05c8\3\2\2\2\u05c1\u05c2\7\3\2\2\u05c2\u05c3\5\u00c0a\2\u05c3"+
		"\u05c4\7\4\2\2\u05c4\u05c9\3\2\2\2\u05c5\u05c7\5\u00ba^\2\u05c6\u05c5"+
		"\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05c9\3\2\2\2\u05c8\u05c1\3\2\2\2\u05c8"+
		"\u05c6\3\2\2\2\u05c9\u05cb\3\2\2\2\u05ca\u05cc\5\u0114\u008b\2\u05cb\u05ca"+
		"\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u00c1\3\2\2\2\u05cd\u05d2\7t\2\2\u05ce"+
		"\u05cf\7\67\2\2\u05cf\u05d1\7t\2\2\u05d0\u05ce\3\2\2\2\u05d1\u05d4\3\2"+
		"\2\2\u05d2\u05d0\3\2\2\2\u05d2\u05d3\3\2\2\2\u05d3\u05d9\3\2\2\2\u05d4"+
		"\u05d2\3\2\2\2\u05d5\u05d9\7b\2\2\u05d6\u05d9\7p\2\2\u05d7\u05d9\5X-\2"+
		"\u05d8\u05cd\3\2\2\2\u05d8\u05d5\3\2\2\2\u05d8\u05d6\3\2\2\2\u05d8\u05d7"+
		"\3\2\2\2\u05d9\u00c3\3\2\2\2\u05da\u05db\t\25\2\2\u05db\u00c5\3\2\2\2"+
		"\u05dc\u05de\5V,\2\u05dd\u05df\7:\2\2\u05de\u05dd\3\2\2\2\u05de\u05df"+
		"\3\2\2\2\u05df\u05e1\3\2\2\2\u05e0\u05dc\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2"+
		"\u05e0\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3\u00c7\3\2\2\2\u05e4\u05e5\5\u00c6"+
		"d\2\u05e5\u00c9\3\2\2\2\u05e6\u05f5\5\u00ccg\2\u05e7\u05e9\5\u010e\u0088"+
		"\2\u05e8\u05e7\3\2\2\2\u05e9\u05ec\3\2\2\2\u05ea\u05e8\3\2\2\2\u05ea\u05eb"+
		"\3\2\2\2\u05eb\u05ed\3\2\2\2\u05ec\u05ea\3\2\2\2\u05ed\u05f1\7\17\2\2"+
		"\u05ee\u05f0\5\u010e\u0088\2\u05ef\u05ee\3\2\2\2\u05f0\u05f3\3\2\2\2\u05f1"+
		"\u05ef\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2\u05f4\3\2\2\2\u05f3\u05f1\3\2"+
		"\2\2\u05f4\u05f6\5\u00caf\2\u05f5\u05ea\3\2\2\2\u05f5\u05f6\3\2\2\2\u05f6"+
		"\u00cb\3\2\2\2\u05f7\u0607\5\u00ceh\2\u05f8\u05fa\5\u010e\u0088\2\u05f9"+
		"\u05f8\3\2\2\2\u05fa\u05fd\3\2\2\2\u05fb\u05f9\3\2\2\2\u05fb\u05fc\3\2"+
		"\2\2\u05fc\u05fe\3\2\2\2\u05fd\u05fb\3\2\2\2\u05fe\u0602\5\\/\2\u05ff"+
		"\u0601\5\u010e\u0088\2\u0600\u05ff\3\2\2\2\u0601\u0604\3\2\2\2\u0602\u0600"+
		"\3\2\2\2\u0602\u0603\3\2\2\2\u0603\u0605\3\2\2\2\u0604\u0602\3\2\2\2\u0605"+
		"\u0606\5\u00ccg\2\u0606\u0608\3\2\2\2\u0607\u05fb\3\2\2\2\u0607\u0608"+
		"\3\2\2\2\u0608\u00cd\3\2\2\2\u0609\u0629\5\u00d0i\2\u060a\u060e\5\u00d0"+
		"i\2\u060b\u060d\5\u010e\u0088\2\u060c\u060b\3\2\2\2\u060d\u0610\3\2\2"+
		"\2\u060e\u060c\3\2\2\2\u060e\u060f\3\2\2\2\u060f\u0611\3\2\2\2\u0610\u060e"+
		"\3\2\2\2\u0611\u0615\7;\2\2\u0612\u0614\5\u010e\u0088\2\u0613\u0612\3"+
		"\2\2\2\u0614\u0617\3\2\2\2\u0615\u0613\3\2\2\2\u0615\u0616\3\2\2\2\u0616"+
		"\u0618\3\2\2\2\u0617\u0615\3\2\2\2\u0618\u061c\5\u00caf\2\u0619\u061b"+
		"\5\u010e\u0088\2\u061a\u0619\3\2\2\2\u061b\u061e\3\2\2\2\u061c\u061a\3"+
		"\2\2\2\u061c\u061d\3\2\2\2\u061d\u061f\3\2\2\2\u061e\u061c\3\2\2\2\u061f"+
		"\u0623\7\6\2\2\u0620\u0622\5\u010e\u0088\2\u0621\u0620\3\2\2\2\u0622\u0625"+
		"\3\2\2\2\u0623\u0621\3\2\2\2\u0623\u0624\3\2\2\2\u0624\u0626\3\2\2\2\u0625"+
		"\u0623\3\2\2\2\u0626\u0627\5\u00ceh\2\u0627\u0629\3\2\2\2\u0628\u0609"+
		"\3\2\2\2\u0628\u060a\3\2\2\2\u0629\u00cf\3\2\2\2\u062a\u0639\5\u00d2j"+
		"\2\u062b\u062d\5\u010e\u0088\2\u062c\u062b\3\2\2\2\u062d\u0630\3\2\2\2"+
		"\u062e\u062c\3\2\2\2\u062e\u062f\3\2\2\2\u062f\u0631\3\2\2\2\u0630\u062e"+
		"\3\2\2\2\u0631\u0635\7\61\2\2\u0632\u0634\5\u010e\u0088\2\u0633\u0632"+
		"\3\2\2\2\u0634\u0637\3\2\2\2\u0635\u0633\3\2\2\2\u0635\u0636\3\2\2\2\u0636"+
		"\u0638\3\2\2\2\u0637\u0635\3\2\2\2\u0638\u063a\5\u00d0i\2\u0639\u062e"+
		"\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u00d1\3\2\2\2\u063b\u064a\5\u00d4k"+
		"\2\u063c\u063e\5\u010e\u0088\2\u063d\u063c\3\2\2\2\u063e\u0641\3\2\2\2"+
		"\u063f\u063d\3\2\2\2\u063f\u0640\3\2\2\2\u0640\u0642\3\2\2\2\u0641\u063f"+
		"\3\2\2\2\u0642\u0646\7\60\2\2\u0643\u0645\5\u010e\u0088\2\u0644\u0643"+
		"\3\2\2\2\u0645\u0648\3\2\2\2\u0646\u0644\3\2\2\2\u0646\u0647\3\2\2\2\u0647"+
		"\u0649\3\2\2\2\u0648\u0646\3\2\2\2\u0649\u064b\5\u00d2j\2\u064a\u063f"+
		"\3\2\2\2\u064a\u064b\3\2\2\2\u064b\u00d3\3\2\2\2\u064c\u065b\5\u00d6l"+
		"\2\u064d\u064f\5\u010e\u0088\2\u064e\u064d\3\2\2\2\u064f\u0652\3\2\2\2"+
		"\u0650\u064e\3\2\2\2\u0650\u0651\3\2\2\2\u0651\u0653\3\2\2\2\u0652\u0650"+
		"\3\2\2\2\u0653\u0657\7 \2\2\u0654\u0656\5\u010e\u0088\2\u0655\u0654\3"+
		"\2\2\2\u0656\u0659\3\2\2\2\u0657\u0655\3\2\2\2\u0657\u0658\3\2\2\2\u0658"+
		"\u065a\3\2\2\2\u0659\u0657\3\2\2\2\u065a\u065c\5\u00d4k\2\u065b\u0650"+
		"\3\2\2\2\u065b\u065c\3\2\2\2\u065c\u00d5\3\2\2\2\u065d\u066c\5\u00d8m"+
		"\2\u065e\u0660\5\u010e\u0088\2\u065f\u065e\3\2\2\2\u0660\u0663\3\2\2\2"+
		"\u0661\u065f\3\2\2\2\u0661\u0662\3\2\2\2\u0662\u0664\3\2\2\2\u0663\u0661"+
		"\3\2\2\2\u0664\u0668\7\37\2\2\u0665\u0667\5\u010e\u0088\2\u0666\u0665"+
		"\3\2\2\2\u0667\u066a\3\2\2\2\u0668\u0666\3\2\2\2\u0668\u0669\3\2\2\2\u0669"+
		"\u066b\3\2\2\2\u066a\u0668\3\2\2\2\u066b\u066d\5\u00d6l\2\u066c\u0661"+
		"\3\2\2\2\u066c\u066d\3\2\2\2\u066d\u00d7\3\2\2\2\u066e\u067d\5\u00dan"+
		"\2\u066f\u0671\5\u010e\u0088\2\u0670\u066f\3\2\2\2\u0671\u0674\3\2\2\2"+
		"\u0672\u0670\3\2\2\2\u0672\u0673\3\2\2\2\u0673\u0675\3\2\2\2\u0674\u0672"+
		"\3\2\2\2\u0675\u0679\7\20\2\2\u0676\u0678\5\u010e\u0088\2\u0677\u0676"+
		"\3\2\2\2\u0678\u067b\3\2\2\2\u0679\u0677\3\2\2\2\u0679\u067a\3\2\2\2\u067a"+
		"\u067c\3\2\2\2\u067b\u0679\3\2\2\2\u067c\u067e\5\u00d8m\2\u067d\u0672"+
		"\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u00d9\3\2\2\2\u067f\u068f\5\u00dco"+
		"\2\u0680\u0682\5\u010e\u0088\2\u0681\u0680\3\2\2\2\u0682\u0685\3\2\2\2"+
		"\u0683\u0681\3\2\2\2\u0683\u0684\3\2\2\2\u0684\u0686\3\2\2\2\u0685\u0683"+
		"\3\2\2\2\u0686\u068a\5^\60\2\u0687\u0689\5\u010e\u0088\2\u0688\u0687\3"+
		"\2\2\2\u0689\u068c\3\2\2\2\u068a\u0688\3\2\2\2\u068a\u068b\3\2\2\2\u068b"+
		"\u068d\3\2\2\2\u068c\u068a\3\2\2\2\u068d\u068e\5\u00dan\2\u068e\u0690"+
		"\3\2\2\2\u068f\u0683\3\2\2\2\u068f\u0690\3\2\2\2\u0690\u00db\3\2\2\2\u0691"+
		"\u06a1\5\u00dep\2\u0692\u0694\5\u010e\u0088\2\u0693\u0692\3\2\2\2\u0694"+
		"\u0697\3\2\2\2\u0695\u0693\3\2\2\2\u0695\u0696\3\2\2\2\u0696\u0698\3\2"+
		"\2\2\u0697\u0695\3\2\2\2\u0698\u069c\5P)\2\u0699\u069b\5\u010e\u0088\2"+
		"\u069a\u0699\3\2\2\2\u069b\u069e\3\2\2\2\u069c\u069a\3\2\2\2\u069c\u069d"+
		"\3\2\2\2\u069d\u069f\3\2\2\2\u069e\u069c\3\2\2\2\u069f\u06a0\5\u00dco"+
		"\2\u06a0\u06a2\3\2\2\2\u06a1\u0695\3\2\2\2\u06a1\u06a2\3\2\2\2\u06a2\u00dd"+
		"\3\2\2\2\u06a3\u06b2\5\u00e0q\2\u06a4\u06a6\5\u010e\u0088\2\u06a5\u06a4"+
		"\3\2\2\2\u06a6\u06a9\3\2\2\2\u06a7\u06a5\3\2\2\2\u06a7\u06a8\3\2\2\2\u06a8"+
		"\u06aa\3\2\2\2\u06a9\u06a7\3\2\2\2\u06aa\u06ae\t\26\2\2\u06ab\u06ad\5"+
		"\u010e\u0088\2\u06ac\u06ab\3\2\2\2\u06ad\u06b0\3\2\2\2\u06ae\u06ac\3\2"+
		"\2\2\u06ae\u06af\3\2\2\2\u06af\u06b1\3\2\2\2\u06b0\u06ae\3\2\2\2\u06b1"+
		"\u06b3\5\u00dep\2\u06b2\u06a7\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3\u00df"+
		"\3\2\2\2\u06b4\u06c3\5\u00e2r\2\u06b5\u06b7\5\u010e\u0088\2\u06b6\u06b5"+
		"\3\2\2\2\u06b7\u06ba\3\2\2\2\u06b8\u06b6\3\2\2\2\u06b8\u06b9\3\2\2\2\u06b9"+
		"\u06bb\3\2\2\2\u06ba\u06b8\3\2\2\2\u06bb\u06bf\t\27\2\2\u06bc\u06be\5"+
		"\u010e\u0088\2\u06bd\u06bc\3\2\2\2\u06be\u06c1\3\2\2\2\u06bf\u06bd\3\2"+
		"\2\2\u06bf\u06c0\3\2\2\2\u06c0\u06c2\3\2\2\2\u06c1\u06bf\3\2\2\2\u06c2"+
		"\u06c4\5\u00e0q\2\u06c3\u06b8\3\2\2\2\u06c3\u06c4\3\2\2\2\u06c4\u00e1"+
		"\3\2\2\2\u06c5\u06d4\5\u00e4s\2\u06c6\u06c8\5\u010e\u0088\2\u06c7\u06c6"+
		"\3\2\2\2\u06c8\u06cb\3\2\2\2\u06c9\u06c7\3\2\2\2\u06c9\u06ca\3\2\2\2\u06ca"+
		"\u06cc\3\2\2\2\u06cb\u06c9\3\2\2\2\u06cc\u06d0\t\30\2\2\u06cd\u06cf\5"+
		"\u010e\u0088\2\u06ce\u06cd\3\2\2\2\u06cf\u06d2\3\2\2\2\u06d0\u06ce\3\2"+
		"\2\2\u06d0\u06d1\3\2\2\2\u06d1\u06d3\3\2\2\2\u06d2\u06d0\3\2\2\2\u06d3"+
		"\u06d5\5\u00e2r\2\u06d4\u06c9\3\2\2\2\u06d4\u06d5\3\2\2\2\u06d5\u00e3"+
		"\3\2\2\2\u06d6\u06d7\7\3\2\2\u06d7\u06d9\5V,\2\u06d8\u06da\5\u00c2b\2"+
		"\u06d9\u06d8\3\2\2\2\u06d9\u06da\3\2\2\2\u06da\u06db\3\2\2\2\u06db\u06dc"+
		"\7\4\2\2\u06dc\u06dd\7\3\2\2\u06dd\u06de\5\u0104\u0083\2\u06de\u06df\7"+
		"\4\2\2\u06df\u06e2\3\2\2\2\u06e0\u06e2\5\u00e6t\2\u06e1\u06d6\3\2\2\2"+
		"\u06e1\u06e0\3\2\2\2\u06e2\u00e5\3\2\2\2\u06e3\u06e4\7\3\2\2\u06e4\u06e5"+
		"\5\u00e8u\2\u06e5\u06e6\7\4\2\2\u06e6\u06e7\5\u00e6t\2\u06e7\u06ea\3\2"+
		"\2\2\u06e8\u06ea\5\u00eav\2\u06e9\u06e3\3\2\2\2\u06e9\u06e8\3\2\2\2\u06ea"+
		"\u00e7\3\2\2\2\u06eb\u06f0\5\u00b6\\\2\u06ec\u06ed\5\u00b6\\\2\u06ed\u06ee"+
		"\5\u00e4s\2\u06ee\u06f0\3\2\2\2\u06ef\u06eb\3\2\2\2\u06ef\u06ec\3\2\2"+
		"\2\u06f0\u00e9\3\2\2\2\u06f1\u06fa\5\u00ecw\2\u06f2\u06fa\5\u00f0y\2\u06f3"+
		"\u06fa\5\u00f2z\2\u06f4\u06fa\5\u00eex\2\u06f5\u06fa\5\u0100\u0081\2\u06f6"+
		"\u06fa\5\u00f6|\2\u06f7\u06fa\5\64\33\2\u06f8\u06fa\5\u00fe\u0080\2\u06f9"+
		"\u06f1\3\2\2\2\u06f9\u06f2\3\2\2\2\u06f9\u06f3\3\2\2\2\u06f9\u06f4\3\2"+
		"\2\2\u06f9\u06f5\3\2\2\2\u06f9\u06f6\3\2\2\2\u06f9\u06f7\3\2\2\2\u06f9"+
		"\u06f8\3\2\2\2\u06fa\u00eb\3\2\2\2\u06fb\u06fc\7\20\2\2\u06fc\u06fd\5"+
		"\u00c2b\2\u06fd\u00ed\3\2\2\2\u06fe\u0700\7\67\2\2\u06ff\u06fe\3\2\2\2"+
		"\u06ff\u0700\3\2\2\2\u0700\u0701\3\2\2\2\u0701\u0705\7b\2\2\u0702\u0704"+
		"\5\u010e\u0088\2\u0703\u0702\3\2\2\2\u0704\u0707\3\2\2\2\u0705\u0703\3"+
		"\2\2\2\u0705\u0706\3\2\2\2\u0706\u0708\3\2\2\2\u0707\u0705\3\2\2\2\u0708"+
		"\u070c\5\u00b6\\\2\u0709\u070b\5\u010e\u0088\2\u070a\u0709\3\2\2\2\u070b"+
		"\u070e\3\2\2\2\u070c\u070a\3\2\2\2\u070c\u070d\3\2\2\2\u070d\u070f\3\2"+
		"\2\2\u070e\u070c\3\2\2\2\u070f\u0711\7\33\2\2\u0710\u0712\5\u00ceh\2\u0711"+
		"\u0710\3\2\2\2\u0711\u0712\3\2\2\2\u0712\u0713\3\2\2\2\u0713\u0714\7\34"+
		"\2\2\u0714\u072d\3\2\2\2\u0715\u0717\7\67\2\2\u0716\u0715\3\2\2\2\u0716"+
		"\u0717\3\2\2\2\u0717\u0718\3\2\2\2\u0718\u071c\7b\2\2\u0719\u071b\5\u010e"+
		"\u0088\2\u071a\u0719\3\2\2\2\u071b\u071e\3\2\2\2\u071c\u071a\3\2\2\2\u071c"+
		"\u071d\3\2\2\2\u071d\u071f\3\2\2\2\u071e\u071c\3\2\2\2\u071f\u0723\5\u00b6"+
		"\\\2\u0720\u0722\5\u010e\u0088\2\u0721\u0720\3\2\2\2\u0722\u0725\3\2\2"+
		"\2\u0723\u0721\3\2\2\2\u0723\u0724\3\2\2\2\u0724\u0726\3\2\2\2\u0725\u0723"+
		"\3\2\2\2\u0726\u0728\7\3\2\2\u0727\u0729\5\u00caf\2\u0728\u0727\3\2\2"+
		"\2\u0728\u0729\3\2\2\2\u0729\u072a\3\2\2\2\u072a\u072b\7\4\2\2\u072b\u072d"+
		"\3\2\2\2\u072c\u06ff\3\2\2\2\u072c\u0716\3\2\2\2\u072d\u00ef\3\2\2\2\u072e"+
		"\u0732\5N(\2\u072f\u0731\5\u010e\u0088\2\u0730\u072f\3\2\2\2\u0731\u0734"+
		"\3\2\2\2\u0732\u0730\3\2\2\2\u0732\u0733\3\2\2\2\u0733\u0735\3\2\2\2\u0734"+
		"\u0732\3\2\2\2\u0735\u0736\5\u00e6t\2\u0736\u00f1\3\2\2\2\u0737\u073b"+
		"\5\u00f4{\2\u0738\u073a\5\u010e\u0088\2\u0739\u0738\3\2\2\2\u073a\u073d"+
		"\3\2\2\2\u073b\u0739\3\2\2\2\u073b\u073c\3\2\2\2\u073c\u073e\3\2\2\2\u073d"+
		"\u073b\3\2\2\2\u073e\u073f\7\3\2\2\u073f\u0740\5\u00f8}\2\u0740\u0741"+
		"\7\4\2\2\u0741\u074c\3\2\2\2\u0742\u0746\5\u00f4{\2\u0743\u0745\5\u010e"+
		"\u0088\2\u0744\u0743\3\2\2\2\u0745\u0748\3\2\2\2\u0746\u0744\3\2\2\2\u0746"+
		"\u0747\3\2\2\2\u0747\u0749\3\2\2\2\u0748\u0746\3\2\2\2\u0749\u074a\5\u00fa"+
		"~\2\u074a\u074c\3\2\2\2\u074b\u0737\3\2\2\2\u074b\u0742\3\2\2\2\u074c"+
		"\u00f3\3\2\2\2\u074d\u074e\7<\2\2\u074e\u00f5\3\2\2\2\u074f\u0753\7=\2"+
		"\2\u0750\u0752\5\u010e\u0088\2\u0751\u0750\3\2\2\2\u0752\u0755\3\2\2\2"+
		"\u0753\u0751\3\2\2\2\u0753\u0754\3\2\2\2\u0754\u0756\3\2\2\2\u0755\u0753"+
		"\3\2\2\2\u0756\u0757\7\3\2\2\u0757\u0758\5\u00caf\2\u0758\u0759\7\4\2"+
		"\2\u0759\u0763\3\2\2\2\u075a\u075e\7=\2\2\u075b\u075d\5\u010e\u0088\2"+
		"\u075c\u075b\3\2\2\2\u075d\u0760\3\2\2\2\u075e\u075c\3\2\2\2\u075e\u075f"+
		"\3\2\2\2\u075f\u0761\3\2\2\2\u0760\u075e\3\2\2\2\u0761\u0763\5\u00caf"+
		"\2\u0762\u074f\3\2\2\2\u0762\u075a\3\2\2\2\u0763\u00f7\3\2\2\2\u0764\u076e"+
		"\5\u00b6\\\2\u0765\u0767\5\u010e\u0088\2\u0766\u0765\3\2\2\2\u0767\u076a"+
		"\3\2\2\2\u0768\u0766\3\2\2\2\u0768\u0769\3\2\2\2\u0769\u076b\3\2\2\2\u076a"+
		"\u0768\3\2\2\2\u076b\u076d\5V,\2\u076c\u0768\3\2\2\2\u076d\u0770\3\2\2"+
		"\2\u076e\u076c\3\2\2\2\u076e\u076f\3\2\2\2\u076f\u00f9\3\2\2\2\u0770\u076e"+
		"\3\2\2\2\u0771\u0772\5\u00eav\2\u0772\u00fb\3\2\2\2\u0773\u0774\t\31\2"+
		"\2\u0774\u00fd\3\2\2\2\u0775\u0779\7U\2\2\u0776\u0778\t\32\2\2\u0777\u0776"+
		"\3\2\2\2\u0778\u077b\3\2\2\2\u0779\u0777\3\2\2\2\u0779\u077a\3\2\2\2\u077a"+
		"\u077d\3\2\2\2\u077b\u0779\3\2\2\2\u077c\u077e\7@\2\2\u077d\u077c\3\2"+
		"\2\2\u077d\u077e\3\2\2\2\u077e\u077f\3\2\2\2\u077f\u0781\7\3\2\2\u0780"+
		"\u0782\7@\2\2\u0781\u0780\3\2\2\2\u0781\u0782\3\2\2\2\u0782\u0787\3\2"+
		"\2\2\u0783\u0785\7~\2\2\u0784\u0786\7@\2\2\u0785\u0784\3\2\2\2\u0785\u0786"+
		"\3\2\2\2\u0786\u0788\3\2\2\2\u0787\u0783\3\2\2\2\u0788\u0789\3\2\2\2\u0789"+
		"\u0787\3\2\2\2\u0789\u078a\3\2\2\2\u078a\u07a1\3\2\2\2\u078b\u079d\t\33"+
		"\2\2\u078c\u078e\7~\2\2\u078d\u078f\7@\2\2\u078e\u078d\3\2\2\2\u078e\u078f"+
		"\3\2\2\2\u078f\u079b\3\2\2\2\u0790\u0791\7\3\2\2\u0791\u0796\5\u00c2b"+
		"\2\u0792\u0793\7\17\2\2\u0793\u0795\5\u00c2b\2\u0794\u0792\3\2\2\2\u0795"+
		"\u0798\3\2\2\2\u0796\u0794\3\2\2\2\u0796\u0797\3\2\2\2\u0797\u0799\3\2"+
		"\2\2\u0798\u0796\3\2\2\2\u0799\u079a\7\4\2\2\u079a\u079c\3\2\2\2\u079b"+
		"\u0790\3\2\2\2\u079b\u079c\3\2\2\2\u079c\u079e\3\2\2\2\u079d\u078c\3\2"+
		"\2\2\u079d\u079e\3\2\2\2\u079e\u07a0\3\2\2\2\u079f\u078b\3\2\2\2\u07a0"+
		"\u07a3\3\2\2\2\u07a1\u079f\3\2\2\2\u07a1\u07a2\3\2\2\2\u07a2\u07a4\3\2"+
		"\2\2\u07a3\u07a1\3\2\2\2\u07a4\u07a5\7\4\2\2\u07a5\u00ff\3\2\2\2\u07a6"+
		"\u07a8\b\u0081\1\2\u07a7\u07a9\5\u00b6\\\2\u07a8\u07a7\3\2\2\2\u07a8\u07a9"+
		"\3\2\2\2\u07a9\u07aa\3\2\2\2\u07aa\u07bc\5\u0102\u0082\2\u07ab\u07bc\5"+
		"\u0108\u0085\2\u07ac\u07ae\5V,\2\u07ad\u07ac\3\2\2\2\u07ad\u07ae\3\2\2"+
		"\2\u07ae\u07af\3\2\2\2\u07af\u07b3\5\u00fc\177\2\u07b0\u07b2\5\u010e\u0088"+
		"\2\u07b1\u07b0\3\2\2\2\u07b2\u07b5\3\2\2\2\u07b3\u07b1\3\2\2\2\u07b3\u07b4"+
		"\3\2\2\2\u07b4\u07b7\3\2\2\2\u07b5\u07b3\3\2\2\2\u07b6\u07b8\5V,\2\u07b7"+
		"\u07b6\3\2\2\2\u07b7\u07b8\3\2\2\2\u07b8\u07b9\3\2\2\2\u07b9\u07ba\5\u0108"+
		"\u0085\2\u07ba\u07bc\3\2\2\2\u07bb\u07a6\3\2\2\2\u07bb\u07ab\3\2\2\2\u07bb"+
		"\u07ad\3\2\2\2\u07bc\u07f6\3\2\2\2\u07bd\u07c1\f\n\2\2\u07be\u07c0\5\u010e"+
		"\u0088\2\u07bf\u07be\3\2\2\2\u07c0\u07c3\3\2\2\2\u07c1\u07bf\3\2\2\2\u07c1"+
		"\u07c2\3\2\2\2\u07c2\u07c4\3\2\2\2\u07c3\u07c1\3\2\2\2\u07c4\u07c6\7\33"+
		"\2\2\u07c5\u07c7\5\u00caf\2\u07c6\u07c5\3\2\2\2\u07c6\u07c7\3\2\2\2\u07c7"+
		"\u07c8\3\2\2\2\u07c8\u07f5\7\34\2\2\u07c9\u07cd\f\t\2\2\u07ca\u07cc\5"+
		"\u010e\u0088\2\u07cb\u07ca\3\2\2\2\u07cc\u07cf\3\2\2\2\u07cd\u07cb\3\2"+
		"\2\2\u07cd\u07ce\3\2\2\2\u07ce\u07d0\3\2\2\2\u07cf\u07cd\3\2\2\2\u07d0"+
		"\u07d1\7\3\2\2\u07d1\u07d2\5\u0104\u0083\2\u07d2\u07d3\7\4\2\2\u07d3\u07f5"+
		"\3\2\2\2\u07d4\u07d5\f\b\2\2\u07d5\u07d9\7?\2\2\u07d6\u07d8\5\u010e\u0088"+
		"\2\u07d7\u07d6\3\2\2\2\u07d8\u07db\3\2\2\2\u07d9\u07d7\3\2\2\2\u07d9\u07da"+
		"\3\2\2\2\u07da\u07dd\3\2\2\2\u07db\u07d9\3\2\2\2\u07dc\u07de\7`\2\2\u07dd"+
		"\u07dc\3\2\2\2\u07dd\u07de\3\2\2\2\u07de\u07df\3\2\2\2\u07df\u07f5\5\u00c2"+
		"b\2\u07e0\u07e1\f\7\2\2\u07e1\u07e5\7\65\2\2\u07e2\u07e4\5\u010e\u0088"+
		"\2\u07e3\u07e2\3\2\2\2\u07e4\u07e7\3\2\2\2\u07e5\u07e3\3\2\2\2\u07e5\u07e6"+
		"\3\2\2\2\u07e6\u07e9\3\2\2\2\u07e7\u07e5\3\2\2\2\u07e8\u07ea\7`\2\2\u07e9"+
		"\u07e8\3\2\2\2\u07e9\u07ea\3\2\2\2\u07ea\u07eb\3\2\2\2\u07eb\u07f5\5\u00c2"+
		"b\2\u07ec\u07f0\f\6\2\2\u07ed\u07ef\5\u010e\u0088\2\u07ee\u07ed\3\2\2"+
		"\2\u07ef\u07f2\3\2\2\2\u07f0\u07ee\3\2\2\2\u07f0\u07f1\3\2\2\2\u07f1\u07f3"+
		"\3\2\2\2\u07f2\u07f0\3\2\2\2\u07f3\u07f5\5\u00fc\177\2\u07f4\u07bd\3\2"+
		"\2\2\u07f4\u07c9\3\2\2\2\u07f4\u07d4\3\2\2\2\u07f4\u07e0\3\2\2\2\u07f4"+
		"\u07ec\3\2\2\2\u07f5\u07f8\3\2\2\2\u07f6\u07f4\3\2\2\2\u07f6\u07f7\3\2"+
		"\2\2\u07f7\u0101\3\2\2\2\u07f8\u07f6\3\2\2\2\u07f9\u07fd\7u\2\2\u07fa"+
		"\u07fc\5\u010e\u0088\2\u07fb\u07fa\3\2\2\2\u07fc\u07ff\3\2\2\2\u07fd\u07fb"+
		"\3\2\2\2\u07fd\u07fe\3\2\2\2\u07fe\u0801\3\2\2\2\u07ff\u07fd\3\2\2\2\u0800"+
		"\u0802\5\u0104\u0083\2\u0801\u0800\3\2\2\2\u0801\u0802\3\2\2\2\u0802\u0806"+
		"\3\2\2\2\u0803\u0805\5\u010e\u0088\2\u0804\u0803\3\2\2\2\u0805\u0808\3"+
		"\2\2\2\u0806\u0804\3\2\2\2\u0806\u0807\3\2\2\2\u0807\u0809\3\2\2\2\u0808"+
		"\u0806\3\2\2\2\u0809\u080a\7v\2\2\u080a\u0103\3\2\2\2\u080b\u080d\5\u0106"+
		"\u0084\2\u080c\u080b\3\2\2\2\u080c\u080d\3\2\2\2\u080d\u0814\3\2\2\2\u080e"+
		"\u0810\7\17\2\2\u080f\u080e\3\2\2\2\u080f\u0810\3\2\2\2\u0810\u0811\3"+
		"\2\2\2\u0811\u0813\5\u0106\u0084\2\u0812\u080f\3\2\2\2\u0813\u0816\3\2"+
		"\2\2\u0814\u0812\3\2\2\2\u0814\u0815\3\2\2\2\u0815\u0818\3\2\2\2\u0816"+
		"\u0814\3\2\2\2\u0817\u0819\7\17\2\2\u0818\u0817\3\2\2\2\u0818\u0819\3"+
		"\2\2\2\u0819\u081f\3\2\2\2\u081a\u081c\7P\2\2\u081b\u081d\5V,\2\u081c"+
		"\u081b\3\2\2\2\u081c\u081d\3\2\2\2\u081d\u081f\3\2\2\2\u081e\u080c\3\2"+
		"\2\2\u081e\u081a\3\2\2\2\u081f\u0105\3\2\2\2\u0820\u0822\5\u010e\u0088"+
		"\2\u0821\u0820\3\2\2\2\u0822\u0825\3\2\2\2\u0823\u0821\3\2\2\2\u0823\u0824"+
		"\3\2\2\2\u0824\u0826\3\2\2\2\u0825\u0823\3\2\2\2\u0826\u082a\5\u00ccg"+
		"\2\u0827\u0829\5\u010e\u0088\2\u0828\u0827\3\2\2\2\u0829\u082c\3\2\2\2"+
		"\u082a\u0828\3\2\2\2\u082a\u082b\3\2\2\2\u082b\u0107\3\2\2\2\u082c\u082a"+
		"\3\2\2\2\u082d\u082f\7?\2\2\u082e\u082d\3\2\2\2\u082e\u082f\3\2\2\2\u082f"+
		"\u0830\3\2\2\2\u0830\u0844\5\u00c2b\2\u0831\u0844\5V,\2\u0832\u0844\5"+
		"R*\2\u0833\u0837\7\3\2\2\u0834\u0836\5\u010e\u0088\2\u0835\u0834\3\2\2"+
		"\2\u0836\u0839\3\2\2\2\u0837\u0835\3\2\2\2\u0837\u0838\3\2\2\2\u0838\u083a"+
		"\3\2\2\2\u0839\u0837\3\2\2\2\u083a\u083e\5\u00caf\2\u083b\u083d\5\u010e"+
		"\u0088\2\u083c\u083b\3\2\2\2\u083d\u0840\3\2\2\2\u083e\u083c\3\2\2\2\u083e"+
		"\u083f\3\2\2\2\u083f\u0841\3\2\2\2\u0840\u083e\3\2\2\2\u0841\u0842\7\4"+
		"\2\2\u0842\u0844\3\2\2\2\u0843\u082e\3\2\2\2\u0843\u0831\3\2\2\2\u0843"+
		"\u0832\3\2\2\2\u0843\u0833\3\2\2\2\u0844\u0109\3\2\2\2\u0845\u0846\7\5"+
		"\2\2\u0846\u010b\3\2\2\2\u0847\u0848\7g\2\2\u0848\u084c\5,\27\2\u0849"+
		"\u084b\t\34\2\2\u084a\u0849\3\2\2\2\u084b\u084e\3\2\2\2\u084c\u084a\3"+
		"\2\2\2\u084c\u084d\3\2\2\2\u084d\u084f\3\2\2\2\u084e\u084c\3\2\2\2\u084f"+
		"\u0850\t\2\2\2\u0850\u0864\3\2\2\2\u0851\u0855\7c\2\2\u0852\u0854\t\34"+
		"\2\2\u0853\u0852\3\2\2\2\u0854\u0857\3\2\2\2\u0855\u0853\3\2\2\2\u0855"+
		"\u0856\3\2\2\2\u0856\u0858\3\2\2\2\u0857\u0855\3\2\2\2\u0858\u0864\t\2"+
		"\2\2\u0859\u085d\7d\2\2\u085a\u085c\t\34\2\2\u085b\u085a\3\2\2\2\u085c"+
		"\u085f\3\2\2\2\u085d\u085b\3\2\2\2\u085d\u085e\3\2\2\2\u085e\u0860\3\2"+
		"\2\2\u085f\u085d\3\2\2\2\u0860\u0864\t\2\2\2\u0861\u0864\7e\2\2\u0862"+
		"\u0864\7f\2\2\u0863\u0847\3\2\2\2\u0863\u0851\3\2\2\2\u0863\u0859\3\2"+
		"\2\2\u0863\u0861\3\2\2\2\u0863\u0862\3\2\2\2\u0864\u010d\3\2\2\2\u0865"+
		"\u0867\7A\2\2\u0866\u0865\3\2\2\2\u0866\u0867\3\2\2\2\u0867\u0868\3\2"+
		"\2\2\u0868\u086c\7@\2\2\u0869\u086c\7|\2\2\u086a\u086c\5\u010c\u0087\2"+
		"\u086b\u0866\3\2\2\2\u086b\u0869\3\2\2\2\u086b\u086a\3\2\2\2\u086c\u010f"+
		"\3\2\2\2\u086d\u086e\5\u0112\u008a\2\u086e\u0870\7\3\2\2\u086f\u0871\5"+
		"\u00caf\2\u0870\u086f\3\2\2\2\u0870\u0871\3\2\2\2\u0871\u0872\3\2\2\2"+
		"\u0872\u0873\7\4\2\2\u0873\u0880\3\2\2\2\u0874\u0876\5\u0112\u008a\2\u0875"+
		"\u0877\7@\2\2\u0876\u0875\3\2\2\2\u0876\u0877\3\2\2\2\u0877\u0878\3\2"+
		"\2\2\u0878\u087a\7!\2\2\u0879\u087b\7@\2\2\u087a\u0879\3\2\2\2\u087a\u087b"+
		"\3\2\2\2\u087b\u087c\3\2\2\2\u087c\u087d\5\u0106\u0084\2\u087d\u0880\3"+
		"\2\2\2\u087e\u0880\5\u0112\u008a\2\u087f\u086d\3\2\2\2\u087f\u0874\3\2"+
		"\2\2\u087f\u087e\3\2\2\2\u0880\u0111\3\2\2\2\u0881\u0883\5\u00c6d\2\u0882"+
		"\u0881\3\2\2\2\u0882\u0883\3\2\2\2\u0883\u0884\3\2\2\2\u0884\u0886\5\u00c2"+
		"b\2\u0885\u0887\5\u0114\u008b\2\u0886\u0885\3\2\2\2\u0886\u0887\3\2\2"+
		"\2\u0887\u0113\3\2\2\2\u0888\u088a\7\33\2\2\u0889\u088b\5\u00ceh\2\u088a"+
		"\u0889\3\2\2\2\u088a\u088b\3\2\2\2\u088b\u088c\3\2\2\2\u088c\u088f\7\34"+
		"\2\2\u088d\u088f\5\u00bc_\2\u088e\u0888\3\2\2\2\u088e\u088d\3\2\2\2\u088f"+
		"\u0115\3\2\2\2\u0151\u0119\u0128\u0135\u0138\u013b\u0140\u0144\u014c\u0150"+
		"\u0157\u015b\u015e\u0161\u0165\u0168\u016b\u016f\u0175\u0179\u017d\u017f"+
		"\u0185\u0191\u0196\u0199\u019c\u01a2\u01aa\u01b0\u01b6\u01ca\u01d5\u01df"+
		"\u01e9\u01f2\u01f5\u01fb\u0200\u0204\u020a\u020c\u0210\u0213\u021b\u021e"+
		"\u0222\u0228\u022c\u0230\u0233\u023a\u023e\u0244\u024b\u024f\u0256\u0261"+
		"\u0269\u026f\u0275\u027c\u0283\u0297\u029b\u02a2\u02a8\u02ad\u02bc\u02c1"+
		"\u02c5\u02c9\u02ce\u02d9\u0303\u0317\u0319\u0335\u033c\u0341\u0345\u0348"+
		"\u034b\u034f\u035b\u035e\u0364\u0367\u036d\u0372\u0377\u037d\u0383\u0388"+
		"\u0390\u0395\u039e\u03a3\u03aa\u03ad\u03b3\u03b7\u03bc\u03c1\u03c7\u03cc"+
		"\u03d0\u03d6\u03de\u03e4\u03ea\u03f1\u03fa\u0400\u0407\u040c\u040e\u0413"+
		"\u041a\u0421\u0427\u042d\u0434\u0438\u043e\u0441\u0448\u044b\u0456\u045d"+
		"\u0463\u046e\u0478\u0481\u0486\u048c\u0490\u0494\u0496\u0499\u04a0\u04a2"+
		"\u04a7\u04ab\u04b0\u04b4\u04b8\u04bb\u04c2\u04c4\u04c7\u04c9\u04cd\u04d0"+
		"\u04d3\u04d5\u04da\u04de\u04e1\u04e5\u04e7\u04ea\u04f0\u04f3\u04f7\u04fa"+
		"\u04fe\u0505\u0508\u050b\u050f\u0513\u0518\u051c\u051f\u0525\u0528\u052b"+
		"\u0538\u053d\u053f\u0542\u0548\u054c\u0550\u0554\u0558\u055c\u0560\u0564"+
		"\u0571\u0575\u0579\u057b\u057f\u0583\u0587\u058b\u058f\u0593\u0597\u0599"+
		"\u059b\u059f\u05a8\u05ad\u05b0\u05b3\u05b7\u05bc\u05bf\u05c6\u05c8\u05cb"+
		"\u05d2\u05d8\u05de\u05e2\u05ea\u05f1\u05f5\u05fb\u0602\u0607\u060e\u0615"+
		"\u061c\u0623\u0628\u062e\u0635\u0639\u063f\u0646\u064a\u0650\u0657\u065b"+
		"\u0661\u0668\u066c\u0672\u0679\u067d\u0683\u068a\u068f\u0695\u069c\u06a1"+
		"\u06a7\u06ae\u06b2\u06b8\u06bf\u06c3\u06c9\u06d0\u06d4\u06d9\u06e1\u06e9"+
		"\u06ef\u06f9\u06ff\u0705\u070c\u0711\u0716\u071c\u0723\u0728\u072c\u0732"+
		"\u073b\u0746\u074b\u0753\u075e\u0762\u0768\u076e\u0779\u077d\u0781\u0785"+
		"\u0789\u078e\u0796\u079b\u079d\u07a1\u07a8\u07ad\u07b3\u07b7\u07bb\u07c1"+
		"\u07c6\u07cd\u07d9\u07dd\u07e5\u07e9\u07f0\u07f4\u07f6\u07fd\u0801\u0806"+
		"\u080c\u080f\u0814\u0818\u081c\u081e\u0823\u082a\u082e\u0837\u083e\u0843"+
		"\u084c\u0855\u085d\u0863\u0866\u086b\u0870\u0876\u087a\u087f\u0882\u0886"+
		"\u088a\u088e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}