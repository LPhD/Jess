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
		RULE_pre_placeholder = 134, RULE_expression_fragment = 135, RULE_init_declarator = 136, 
		RULE_declarator = 137, RULE_type_suffix = 138;
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
		"null_expression", "preprocessor_fragment", "pre_placeholder", "expression_fragment", 
		"init_declarator", "declarator", "type_suffix"
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
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << NEWLINE) | (1L << ESCAPE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ELLIPSIS - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (ASM - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (HEX_FLOAT - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (WHITESPACE - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(278);
				statement();
				}
				}
				setState(283);
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
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				opening_curly();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				closing_curly();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				block_starter();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(287);
				jump_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(288);
				label();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(289);
				simple_decl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(290);
				expr_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(291);
				pre_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(292);
				comment();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(293);
				newline();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(294);
				custom();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(295);
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
			setState(298);
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
			setState(300);
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
			setState(302);
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
			setState(383);
			switch (_input.LA(1)) {
			case TRY:
				_localctx = new Try_statementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				match(TRY);
				}
				break;
			case CATCH:
				_localctx = new Catch_statementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(CATCH);
				setState(315);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(306);
					match(T__0);
					setState(309);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(307);
						param_type();
						}
						break;
					case 2:
						{
						setState(308);
						match(ELLIPSIS);
						}
						break;
					}
					setState(312);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(311);
						match(NEWLINE);
						}
					}

					setState(314);
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
				setState(317);
				match(IF);
				setState(318);
				match(T__0);
				setState(320);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(319);
					match(NEWLINE);
					}
				}

				setState(322);
				condition();
				setState(324);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(323);
					match(NEWLINE);
					}
				}

				setState(326);
				match(T__1);
				}
				break;
			case ELSE:
				_localctx = new Else_statementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(328);
				match(ELSE);
				}
				break;
			case SWITCH:
				_localctx = new Switch_statementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(329);
				match(SWITCH);
				setState(330);
				match(T__0);
				setState(332);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(331);
					match(NEWLINE);
					}
				}

				setState(334);
				condition();
				setState(336);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(335);
					match(NEWLINE);
					}
				}

				setState(338);
				match(T__1);
				}
				break;
			case FOR:
				_localctx = new For_statementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(340);
				match(FOR);
				setState(341);
				match(T__0);
				setState(343);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(342);
					match(NEWLINE);
					}
				}

				setState(347);
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
					setState(345);
					for_init_statement();
					}
					break;
				case T__2:
					{
					setState(346);
					match(T__2);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(350);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(349);
					match(NEWLINE);
					}
				}

				setState(353);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(352);
					condition();
					}
				}

				setState(355);
				match(T__2);
				setState(357);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(356);
					match(NEWLINE);
					}
					break;
				}
				setState(360);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(359);
					expr();
					}
				}

				setState(363);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(362);
					match(NEWLINE);
					}
				}

				setState(365);
				match(T__1);
				setState(367);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(366);
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
				setState(369);
				match(DO);
				}
				break;
			case WHILE:
				_localctx = new While_statementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(370);
				match(WHILE);
				setState(371);
				match(T__0);
				setState(373);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(372);
					match(NEWLINE);
					}
				}

				setState(375);
				condition();
				setState(377);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(376);
					match(NEWLINE);
					}
				}

				setState(379);
				match(T__1);
				setState(381);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(380);
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
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				simple_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				expr();
				setState(387);
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
			setState(409);
			switch (_input.LA(1)) {
			case BREAK:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				match(BREAK);
				setState(392);
				match(T__2);
				}
				break;
			case CONTINUE:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				match(CONTINUE);
				setState(394);
				match(T__2);
				}
				break;
			case GOTO:
				_localctx = new GotoStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(395);
				match(GOTO);
				setState(396);
				identifier();
				setState(397);
				match(T__2);
				}
				break;
			case RETURN:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(399);
				match(RETURN);
				setState(401);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(400);
					expr();
					}
				}

				setState(403);
				match(T__2);
				}
				break;
			case THROW:
				_localctx = new ThrowStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(404);
				match(THROW);
				setState(406);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(405);
					expr();
					}
				}

				setState(408);
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
			setState(412);
			_la = _input.LA(1);
			if (_la==CASE) {
				{
				setState(411);
				match(CASE);
				}
			}

			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(414);
				identifier();
				}
				break;
			case 2:
				{
				setState(415);
				number();
				}
				break;
			case 3:
				{
				setState(416);
				match(CHAR);
				}
				break;
			case 4:
				{
				setState(417);
				cast_expression();
				}
				break;
			}
			setState(420);
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
			setState(426);
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
				setState(422);
				expr();
				setState(423);
				match(T__2);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
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
			setState(428);
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
			setState(432);
			switch (_input.LA(1)) {
			case PRE_IF:
			case PRE_ELIF:
			case PRE_ELSE:
			case PRE_ENDIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
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
				setState(431);
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
			setState(438);
			switch (_input.LA(1)) {
			case PRE_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				pre_if_statement();
				}
				break;
			case PRE_ELIF:
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				pre_elif_statement();
				}
				break;
			case PRE_ELSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(436);
				pre_else_statement();
				}
				break;
			case PRE_ENDIF:
				enterOuterAlt(_localctx, 4);
				{
				setState(437);
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
			setState(440);
			match(PRE_IF);
			setState(441);
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
			setState(444);
			match(PRE_ELIF);
			setState(445);
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
			setState(448);
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
			setState(450);
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
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
				match(T__0);
				setState(454);
				condition();
				setState(455);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(457);
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
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				pre_define();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(461);
				pre_undef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(462);
				pre_diagnostic();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(463);
				pre_other();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(464);
				pre_include();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(465);
				pre_include_next();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(466);
				pre_line();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(467);
				pre_pragma();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(468);
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
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				match(PRE_DEFINE);
				setState(472);
				pre_macro_identifier();
				setState(473);
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
				setState(475);
				match(PRE_DEFINE);
				setState(476);
				pre_macro_identifier();
				setState(477);
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
			setState(481);
			match(PRE_UNDEF);
			setState(482);
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
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				identifier();
				setState(489);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(485);
					match(T__0);
					setState(486);
					pre_macro_parameters();
					setState(487);
					match(T__1);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				keyword();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(492);
				match(END_TEST);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(493);
				match(T__4);
				setState(498);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(494);
					match(T__0);
					setState(495);
					pre_macro_parameters();
					setState(496);
					match(T__1);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(500);
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
			setState(503);
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
			setState(507);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case NEW:
			case PRE_PRAGMA_KEYWORDS:
			case ALPHA_NUMERIC:
				{
				setState(505);
				identifier();
				}
				break;
			case ELLIPSIS:
				{
				setState(506);
				match(ELLIPSIS);
				}
				break;
			case T__1:
			case T__12:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(509);
				match(T__12);
				setState(512);
				switch (_input.LA(1)) {
				case T__8:
				case T__9:
				case T__10:
				case NEW:
				case PRE_PRAGMA_KEYWORDS:
				case ALPHA_NUMERIC:
					{
					setState(510);
					identifier();
					}
					break;
				case ELLIPSIS:
					{
					setState(511);
					match(ELLIPSIS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(518);
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
			setState(528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(522); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(522);
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
						setState(519);
						expr();
						}
						break;
					case ESCAPE:
						{
						setState(520);
						match(ESCAPE);
						setState(521);
						match(NEWLINE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(524); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60) | (1L << ESCAPE))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0) );
				setState(526);
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
			setState(531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(530);
				pre_macro_identifier();
				}
				break;
			}
			setState(533);
			pre_macro_identifier();
			setState(534);
			match(T__0);
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				{
				setState(539);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(535);
					expr();
					}
					break;
				case 2:
					{
					setState(536);
					type_name();
					}
					break;
				case 3:
					{
					setState(537);
					relational_operator();
					}
					break;
				case 4:
					{
					setState(538);
					equality_operator();
					}
					break;
				}
				setState(542);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(541);
					match(NEWLINE);
					}
				}

				}
				setState(556);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(544);
						match(T__12);
						setState(546);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(545);
							match(NEWLINE);
							}
						}

						setState(552);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
						case 1:
							{
							setState(548);
							expr();
							}
							break;
						case 2:
							{
							setState(549);
							type_name();
							}
							break;
						case 3:
							{
							setState(550);
							relational_operator();
							}
							break;
						case 4:
							{
							setState(551);
							equality_operator();
							}
							break;
						}
						}
						} 
					}
					setState(558);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				setState(560);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(559);
					match(T__12);
					}
				}

				}
				break;
			case 2:
				{
				setState(562);
				match(VOID);
				}
				break;
			}
			setState(565);
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
			setState(570);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(567);
				match(PRE_DIAGNOSTIC);
				setState(568);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(569);
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
			setState(591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(572);
				match(PRE_OTHER);
				setState(574);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(573);
					match(STRING);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				match(PRE_ATTRIBUTE);
				setState(577);
				match(T__0);
				setState(578);
				match(T__0);
				setState(580);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(579);
					attributeList();
					}
				}

				setState(582);
				match(T__1);
				setState(583);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(584);
				match(PRE_ATTRIBUTE);
				setState(585);
				match(T__0);
				setState(587);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(586);
					attributeList();
					}
				}

				setState(589);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(590);
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
			setState(593);
			attribute();
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(594);
				match(T__12);
				setState(595);
				attribute();
				}
				}
				setState(600);
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
			setState(629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(601);
				pre_macro_identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(602);
				pre_macro_identifier();
				setState(603);
				match(T__0);
				setState(604);
				identifier();
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(605);
					match(T__12);
					setState(606);
					expr();
					}
					}
					setState(611);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(612);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(614);
				pre_macro_identifier();
				setState(615);
				match(T__0);
				setState(617);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(616);
					expr();
					}
				}

				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(619);
					match(T__12);
					setState(620);
					expr();
					}
					}
					setState(625);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(626);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(628);
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
			setState(636);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(631);
				match(PRE_INCLUDE);
				setState(632);
				pre_include_local_file();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(633);
				match(PRE_INCLUDE);
				setState(634);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(635);
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
			setState(643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(638);
				match(PRE_INCLUDE_NEXT);
				setState(639);
				pre_include_local_file();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(640);
				match(PRE_INCLUDE_NEXT);
				setState(641);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(642);
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
			setState(645);
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
			setState(647);
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
			setState(663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(649);
				match(PRE_LINE);
				setState(650);
				match(DECIMAL_LITERAL);
				setState(651);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(652);
				match(PRE_LINE);
				setState(653);
				match(DECIMAL_LITERAL);
				setState(654);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(655);
				match(PRE_LINE);
				setState(656);
				pre_macro_identifier();
				setState(657);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(659);
				match(PRE_LINE);
				setState(660);
				pre_macro_identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(661);
				match(PRE_LINE);
				setState(662);
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
			setState(685);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(665);
				match(PRE_PRAGMA);
				setState(667);
				_la = _input.LA(1);
				if (_la==PRE_GCC) {
					{
					setState(666);
					match(PRE_GCC);
					}
				}

				setState(669);
				match(PRE_PRAGMA_KEYWORDS);
				setState(670);
				match(STRING);
				 preProcFindMacroEnd(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(672);
				match(PRE_PRAGMA);
				setState(674);
				_la = _input.LA(1);
				if (_la==PRE_GCC) {
					{
					setState(673);
					match(PRE_GCC);
					}
				}

				setState(676);
				match(PRE_PRAGMA_KEYWORDS);
				setState(680);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(677);
						identifier();
						}
						} 
					}
					setState(682);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(683);
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
			setState(687);
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
			setState(689);
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
			setState(691);
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
			setState(693);
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
				setState(695);
				match(HEX_LITERAL);
				}
				break;
			case OCTAL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(696);
				match(OCTAL_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(697);
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
						setState(698);
						match(STRING);
						setState(700);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
						case 1:
							{
							setState(699);
							match(NEWLINE);
							}
							break;
						}
						setState(705);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(702);
								match(COMMENT);
								}
								} 
							}
							setState(707);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
						}
						setState(709);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
						case 1:
							{
							setState(708);
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
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
					case 1:
						{
						setState(1171);
						match(NEWLINE);
						}
						break;
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
			setState(1474);
			assign_expr();
			setState(1489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(1478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
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
				setState(1481);
				match(T__12);
				setState(1485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1482);
					expression_fragment();
					}
					}
					setState(1487);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1488);
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
			setState(1491);
			conditional_expression();
			setState(1507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				{
				setState(1495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1492);
					expression_fragment();
					}
					}
					setState(1497);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1498);
				assignment_operator();
				setState(1502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
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
				setState(1505);
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
			setState(1540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				_localctx = new NormOrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1509);
				or_expression();
				}
				break;
			case 2:
				_localctx = new CndExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1510);
				or_expression();
				{
				setState(1514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1511);
					expression_fragment();
					}
					}
					setState(1516);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1517);
				match(T__56);
				setState(1521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1518);
					expression_fragment();
					}
					}
					setState(1523);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1524);
				expr();
				setState(1528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1525);
					expression_fragment();
					}
					}
					setState(1530);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1531);
				match(T__3);
				setState(1535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1532);
					expression_fragment();
					}
					}
					setState(1537);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1538);
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
			setState(1542);
			and_expression();
			setState(1557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				{
				setState(1546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1543);
					expression_fragment();
					}
					}
					setState(1548);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1549);
				match(T__46);
				setState(1553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1550);
					expression_fragment();
					}
					}
					setState(1555);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1556);
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
			setState(1559);
			inclusive_or_expression();
			setState(1574);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				{
				setState(1563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1560);
					expression_fragment();
					}
					}
					setState(1565);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1566);
				match(T__45);
				setState(1570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1567);
					expression_fragment();
					}
					}
					setState(1572);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1573);
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
			setState(1576);
			exclusive_or_expression();
			setState(1591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
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
				match(T__29);
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
			setState(1593);
			bit_and_expression();
			setState(1608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
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
				match(T__28);
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
			setState(1610);
			equality_expression();
			setState(1625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
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
				match(T__13);
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
			setState(1627);
			relational_expression();
			setState(1643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
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
				equality_operator();
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
			setState(1645);
			shift_expression();
			setState(1661);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				{
				setState(1649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1646);
					expression_fragment();
					}
					}
					setState(1651);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1652);
				relational_operator();
				setState(1656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1653);
					expression_fragment();
					}
					}
					setState(1658);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1659);
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
			setState(1663);
			additive_expression();
			setState(1678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				{
				setState(1667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1664);
					expression_fragment();
					}
					}
					setState(1669);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1670);
				_la = _input.LA(1);
				if ( !(_la==T__39 || _la==T__40) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1671);
					expression_fragment();
					}
					}
					setState(1676);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1677);
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
			setState(1680);
			multiplicative_expression();
			setState(1695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				{
				setState(1684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1681);
					expression_fragment();
					}
					}
					setState(1686);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1687);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1688);
					expression_fragment();
					}
					}
					setState(1693);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1694);
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
			setState(1697);
			function_pointer_use_expression();
			setState(1712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
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
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__26) | (1L << T__27))) != 0)) ) {
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
			setState(1725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1714);
				match(T__0);
				setState(1715);
				ptr_operator();
				setState(1717);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (NEW - 96)) | (1L << (PRE_PRAGMA_KEYWORDS - 96)) | (1L << (ALPHA_NUMERIC - 96)))) != 0)) {
					{
					setState(1716);
					identifier();
					}
				}

				setState(1719);
				match(T__1);
				setState(1720);
				match(T__0);
				setState(1721);
				argument_list();
				setState(1722);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1724);
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
			setState(1733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1727);
				match(T__0);
				setState(1728);
				cast_target();
				setState(1729);
				match(T__1);
				setState(1730);
				cast_expression();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1732);
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
			setState(1739);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1735);
				type_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1736);
				type_name();
				setState(1737);
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
			setState(1749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1741);
				address_of_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1742);
				unary_op_and_cast_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1743);
				sizeof_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1744);
				new_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1745);
				postfix_expression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1746);
				defined_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1747);
				macroCall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1748);
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
			setState(1751);
			match(T__13);
			setState(1752);
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
			setState(1800);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1755);
				_la = _input.LA(1);
				if (_la==T__52) {
					{
					setState(1754);
					match(T__52);
					}
				}

				setState(1757);
				match(NEW);
				setState(1761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1758);
					expression_fragment();
					}
					}
					setState(1763);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1764);
				type_name();
				setState(1768);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1765);
					expression_fragment();
					}
					}
					setState(1770);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1771);
				match(T__24);
				setState(1773);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(1772);
					conditional_expression();
					}
				}

				setState(1775);
				match(T__25);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1778);
				_la = _input.LA(1);
				if (_la==T__52) {
					{
					setState(1777);
					match(T__52);
					}
				}

				setState(1780);
				match(NEW);
				setState(1784);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1781);
					expression_fragment();
					}
					}
					setState(1786);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1787);
				type_name();
				setState(1791);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1788);
					expression_fragment();
					}
					}
					setState(1793);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1794);
				match(T__0);
				setState(1796);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(1795);
					expr();
					}
				}

				setState(1798);
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
			setState(1802);
			unary_operator();
			setState(1806);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
				{
				{
				setState(1803);
				expression_fragment();
				}
				}
				setState(1808);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1809);
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
			setState(1831);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1811);
				sizeof();
				setState(1815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1812);
					expression_fragment();
					}
					}
					setState(1817);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1818);
				match(T__0);
				setState(1819);
				sizeof_operand();
				setState(1820);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1822);
				sizeof();
				setState(1826);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1823);
					expression_fragment();
					}
					}
					setState(1828);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
			setState(1854);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1835);
				match(T__58);
				setState(1839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1836);
					expression_fragment();
					}
					}
					setState(1841);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1842);
				match(T__0);
				setState(1843);
				expr();
				setState(1844);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1846);
				match(T__58);
				setState(1850);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1847);
					expression_fragment();
					}
					}
					setState(1852);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1853);
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
			setState(1856);
			type_name();
			setState(1866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << NEWLINE) | (1L << ESCAPE))) != 0) || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (PRE_IF - 97)) | (1L << (PRE_ELIF - 97)) | (1L << (PRE_ELSE - 97)) | (1L << (PRE_ENDIF - 97)) | (1L << (PRE_DEFINE - 97)) | (1L << (COMMENT - 97)))) != 0)) {
				{
				{
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
				ptr_operator();
				}
				}
				setState(1868);
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
			setState(1869);
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
			setState(1871);
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
			setState(1873);
			match(ASM);
			setState(1877);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GOTO || _la==CV_QUALIFIER) {
				{
				{
				setState(1874);
				_la = _input.LA(1);
				if ( !(_la==GOTO || _la==CV_QUALIFIER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(1879);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1881);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1880);
				match(NEWLINE);
				}
			}

			setState(1883);
			match(T__0);
			setState(1885);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1884);
				match(NEWLINE);
				}
			}

			setState(1891); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1887);
				match(STRING);
				setState(1889);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1888);
					match(NEWLINE);
					}
				}

				}
				}
				setState(1893); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(1917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__52) | (1L << T__59))) != 0)) {
				{
				{
				setState(1895);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__52) | (1L << T__59))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1913);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					{
					setState(1896);
					match(STRING);
					setState(1898);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1897);
						match(NEWLINE);
						}
					}

					}
					setState(1911);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(1900);
						match(T__0);
						setState(1901);
						identifier();
						setState(1906);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__12) {
							{
							{
							setState(1902);
							match(T__12);
							setState(1903);
							identifier();
							}
							}
							setState(1908);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1909);
						match(T__1);
						}
					}

					}
				}

				}
				}
				setState(1919);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1920);
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
			setState(1943);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
			case 1:
				{
				_localctx = new ArrayAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1924);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__19) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)))) != 0)) {
					{
					setState(1923);
					type_name();
					}
				}

				setState(1926);
				initializer_expression();
				}
				break;
			case 2:
				{
				_localctx = new PrimaryOnlyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1927);
				primary_expression();
				}
				break;
			case 3:
				{
				_localctx = new IncDecOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1929);
				_la = _input.LA(1);
				if (_la==T__13 || _la==T__14) {
					{
					setState(1928);
					ptr_operator();
					}
				}

				setState(1931);
				inc_dec();
				setState(1935);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
					{
					{
					setState(1932);
					expression_fragment();
					}
					}
					setState(1937);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1939);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
				case 1:
					{
					setState(1938);
					ptr_operator();
					}
					break;
				}
				setState(1941);
				primary_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2002);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,314,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2000);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayIndexingContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1945);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1949);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
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
						match(T__24);
						setState(1954);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
							{
							setState(1953);
							expr();
							}
						}

						setState(1956);
						match(T__25);
						}
						break;
					case 2:
						{
						_localctx = new FuncCallContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1957);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1961);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
							{
							{
							setState(1958);
							expression_fragment();
							}
							}
							setState(1963);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1964);
						match(T__0);
						setState(1965);
						argument_list();
						setState(1966);
						match(T__1);
						}
						break;
					case 3:
						{
						_localctx = new MemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1968);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1969);
						match(T__60);
						setState(1973);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
							{
							{
							setState(1970);
							expression_fragment();
							}
							}
							setState(1975);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1977);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(1976);
							match(TEMPLATE);
							}
						}

						{
						setState(1979);
						identifier();
						}
						}
						break;
					case 4:
						{
						_localctx = new PtrMemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1980);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1981);
						match(T__50);
						setState(1985);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
							{
							{
							setState(1982);
							expression_fragment();
							}
							}
							setState(1987);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1989);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(1988);
							match(TEMPLATE);
							}
						}

						{
						setState(1991);
						identifier();
						}
						}
						break;
					case 5:
						{
						_localctx = new IncDecOpContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1992);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1996);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
							{
							{
							setState(1993);
							expression_fragment();
							}
							}
							setState(1998);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1999);
						inc_dec();
						}
						break;
					}
					} 
				}
				setState(2004);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,314,_ctx);
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
			setState(2005);
			match(OPENING_CURLY);
			setState(2009);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2006);
					expression_fragment();
					}
					} 
				}
				setState(2011);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
			}
			setState(2013);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
			case 1:
				{
				setState(2012);
				argument_list();
				}
				break;
			}
			setState(2018);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
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
			setState(2042);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2024);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
				case 1:
					{
					setState(2023);
					argument();
					}
					break;
				}
				setState(2032);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,320,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2027);
						_la = _input.LA(1);
						if (_la==T__12) {
							{
							setState(2026);
							match(T__12);
							}
						}

						setState(2029);
						argument();
						}
						} 
					}
					setState(2034);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,320,_ctx);
				}
				setState(2036);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(2035);
					match(T__12);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2038);
				match(VOID);
				setState(2040);
				_la = _input.LA(1);
				if (_la==T__13 || _la==T__14) {
					{
					setState(2039);
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
			setState(2047);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NEWLINE - 62)) | (1L << (ESCAPE - 62)) | (1L << (PRE_IF - 62)) | (1L << (PRE_ELIF - 62)) | (1L << (PRE_ELSE - 62)) | (1L << (PRE_ENDIF - 62)) | (1L << (PRE_DEFINE - 62)) | (1L << (COMMENT - 62)))) != 0)) {
				{
				{
				setState(2044);
				expression_fragment();
				}
				}
				setState(2049);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2050);
			assign_expr();
			setState(2054);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2051);
					expression_fragment();
					}
					} 
				}
				setState(2056);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
			setState(2067);
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
				setState(2058);
				_la = _input.LA(1);
				if (_la==T__60) {
					{
					setState(2057);
					match(T__60);
					}
				}

				setState(2060);
				identifier();
				}
				}
				break;
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(2061);
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
				setState(2062);
				constant();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
				setState(2063);
				match(T__0);
				setState(2064);
				expr();
				setState(2065);
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
			setState(2069);
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
		public Pre_placeholderContext pre_placeholder() {
			return getRuleContext(Pre_placeholderContext.class,0);
		}
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
		try {
			setState(2076);
			switch (_input.LA(1)) {
			case PRE_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(2071);
				pre_if_statement();
				}
				break;
			case PRE_ELIF:
				enterOuterAlt(_localctx, 2);
				{
				setState(2072);
				pre_elif_statement();
				}
				break;
			case PRE_ELSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2073);
				pre_else_statement();
				}
				break;
			case PRE_ENDIF:
				enterOuterAlt(_localctx, 4);
				{
				setState(2074);
				pre_endif_statement();
				}
				break;
			case PRE_DEFINE:
				enterOuterAlt(_localctx, 5);
				{
				setState(2075);
				pre_placeholder();
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

	public static class Pre_placeholderContext extends ParserRuleContext {
		public TerminalNode PRE_DEFINE() { return getToken(FunctionParser.PRE_DEFINE, 0); }
		public Pre_macro_identifierContext pre_macro_identifier() {
			return getRuleContext(Pre_macro_identifierContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(FunctionParser.NEWLINE, 0); }
		public TerminalNode EOF() { return getToken(FunctionParser.EOF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Pre_placeholderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_placeholder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_placeholder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_placeholder(this);
		}
	}

	public final Pre_placeholderContext pre_placeholder() throws RecognitionException {
		Pre_placeholderContext _localctx = new Pre_placeholderContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_pre_placeholder);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2078);
			match(PRE_DEFINE);
			setState(2079);
			pre_macro_identifier();
			setState(2081); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2080);
				expr();
				}
				}
				setState(2083); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0) );
			setState(2085);
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
		enterRule(_localctx, 270, RULE_expression_fragment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2093);
			switch (_input.LA(1)) {
			case NEWLINE:
			case ESCAPE:
				{
				setState(2088);
				_la = _input.LA(1);
				if (_la==ESCAPE) {
					{
					setState(2087);
					match(ESCAPE);
					}
				}

				setState(2090);
				match(NEWLINE);
				}
				break;
			case COMMENT:
				{
				setState(2091);
				match(COMMENT);
				}
				break;
			case PRE_IF:
			case PRE_ELIF:
			case PRE_ELSE:
			case PRE_ENDIF:
			case PRE_DEFINE:
				{
				setState(2092);
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
		enterRule(_localctx, 272, RULE_init_declarator);
		int _la;
		try {
			setState(2113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,335,_ctx) ) {
			case 1:
				_localctx = new InitDeclWithCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2095);
				declarator();
				setState(2096);
				match(T__0);
				setState(2098);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(2097);
					expr();
					}
				}

				setState(2100);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new InitDeclWithAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2102);
				declarator();
				setState(2104);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(2103);
					match(NEWLINE);
					}
				}

				setState(2106);
				match(T__30);
				setState(2108);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,334,_ctx) ) {
				case 1:
					{
					setState(2107);
					match(NEWLINE);
					}
					break;
				}
				setState(2110);
				argument();
				}
				break;
			case 3:
				_localctx = new InitDeclSimpleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2112);
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
		enterRule(_localctx, 274, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2116);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__14) {
				{
				setState(2115);
				ptrs();
				}
			}

			setState(2118);
			identifier();
			setState(2120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,337,_ctx) ) {
			case 1:
				{
				setState(2119);
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
		enterRule(_localctx, 276, RULE_type_suffix);
		int _la;
		try {
			setState(2128);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2122);
				match(T__24);
				setState(2124);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (STATIC - 77)) | (1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (EXTERN - 77)) | (1L << (ASM - 77)) | (1L << (VIRTUAL - 77)) | (1L << (TRY - 77)) | (1L << (CATCH - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (SPECIAL_DATA - 77)) | (1L << (OPERATOR - 77)) | (1L << (CLASS_KEY - 77)) | (1L << (NEW - 77)) | (1L << (PRE_OTHER - 77)) | (1L << (PRE_PRAGMA_KEYWORDS - 77)) | (1L << (PRE_ATTRIBUTE - 77)) | (1L << (END_TEST - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (OPENING_CURLY - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (HEX_FLOAT - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)))) != 0)) {
					{
					setState(2123);
					conditional_expression();
					}
				}

				setState(2126);
				match(T__25);
				}
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(2127);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0080\u0855\4\2\t"+
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
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\3\2\7\2\u011a\n\2\f\2"+
		"\16\2\u011d\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u012b"+
		"\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u0138\n\7\3\7\5\7"+
		"\u013b\n\7\3\7\5\7\u013e\n\7\3\7\3\7\3\7\5\7\u0143\n\7\3\7\3\7\5\7\u0147"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u014f\n\7\3\7\3\7\5\7\u0153\n\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7\u015a\n\7\3\7\3\7\5\7\u015e\n\7\3\7\5\7\u0161\n\7\3"+
		"\7\5\7\u0164\n\7\3\7\3\7\5\7\u0168\n\7\3\7\5\7\u016b\n\7\3\7\5\7\u016e"+
		"\n\7\3\7\3\7\5\7\u0172\n\7\3\7\3\7\3\7\3\7\5\7\u0178\n\7\3\7\3\7\5\7\u017c"+
		"\n\7\3\7\3\7\5\7\u0180\n\7\5\7\u0182\n\7\3\b\3\b\3\b\3\b\5\b\u0188\n\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0194\n\t\3\t\3\t\3\t\5\t"+
		"\u0199\n\t\3\t\5\t\u019c\n\t\3\n\5\n\u019f\n\n\3\n\3\n\3\n\3\n\5\n\u01a5"+
		"\n\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u01ad\n\13\3\f\3\f\3\r\3\r\5\r\u01b3"+
		"\n\r\3\16\3\16\3\16\3\16\5\16\u01b9\n\16\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u01cd"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u01d8\n\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01e2\n\25\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u01ec\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u01f5\n\27\3\27\5\27\u01f8\n\27\3\30\3\30\3\31\3\31\5\31\u01fe\n"+
		"\31\3\31\3\31\3\31\5\31\u0203\n\31\7\31\u0205\n\31\f\31\16\31\u0208\13"+
		"\31\3\32\3\32\3\32\6\32\u020d\n\32\r\32\16\32\u020e\3\32\3\32\5\32\u0213"+
		"\n\32\3\33\5\33\u0216\n\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u021e\n"+
		"\33\3\33\5\33\u0221\n\33\3\33\3\33\5\33\u0225\n\33\3\33\3\33\3\33\3\33"+
		"\5\33\u022b\n\33\7\33\u022d\n\33\f\33\16\33\u0230\13\33\3\33\5\33\u0233"+
		"\n\33\3\33\5\33\u0236\n\33\3\33\3\33\3\34\3\34\3\34\5\34\u023d\n\34\3"+
		"\35\3\35\5\35\u0241\n\35\3\35\3\35\3\35\3\35\5\35\u0247\n\35\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u024e\n\35\3\35\3\35\5\35\u0252\n\35\3\36\3\36\3"+
		"\36\7\36\u0257\n\36\f\36\16\36\u025a\13\36\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\7\37\u0262\n\37\f\37\16\37\u0265\13\37\3\37\3\37\3\37\3\37\3\37\5"+
		"\37\u026c\n\37\3\37\3\37\7\37\u0270\n\37\f\37\16\37\u0273\13\37\3\37\3"+
		"\37\3\37\5\37\u0278\n\37\3 \3 \3 \3 \3 \5 \u027f\n \3!\3!\3!\3!\3!\5!"+
		"\u0286\n!\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u029a"+
		"\n$\3%\3%\5%\u029e\n%\3%\3%\3%\3%\3%\5%\u02a5\n%\3%\3%\7%\u02a9\n%\f%"+
		"\16%\u02ac\13%\3%\3%\5%\u02b0\n%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3"+
		"*\3*\5*\u02bf\n*\3*\7*\u02c2\n*\f*\16*\u02c5\13*\3*\5*\u02c8\n*\6*\u02ca"+
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
		"f\3f\7f\u05c7\nf\ff\16f\u05ca\13f\3f\3f\7f\u05ce\nf\ff\16f\u05d1\13f\3"+
		"f\5f\u05d4\nf\3g\3g\7g\u05d8\ng\fg\16g\u05db\13g\3g\3g\7g\u05df\ng\fg"+
		"\16g\u05e2\13g\3g\3g\5g\u05e6\ng\3h\3h\3h\7h\u05eb\nh\fh\16h\u05ee\13"+
		"h\3h\3h\7h\u05f2\nh\fh\16h\u05f5\13h\3h\3h\7h\u05f9\nh\fh\16h\u05fc\13"+
		"h\3h\3h\7h\u0600\nh\fh\16h\u0603\13h\3h\3h\5h\u0607\nh\3i\3i\7i\u060b"+
		"\ni\fi\16i\u060e\13i\3i\3i\7i\u0612\ni\fi\16i\u0615\13i\3i\5i\u0618\n"+
		"i\3j\3j\7j\u061c\nj\fj\16j\u061f\13j\3j\3j\7j\u0623\nj\fj\16j\u0626\13"+
		"j\3j\5j\u0629\nj\3k\3k\7k\u062d\nk\fk\16k\u0630\13k\3k\3k\7k\u0634\nk"+
		"\fk\16k\u0637\13k\3k\5k\u063a\nk\3l\3l\7l\u063e\nl\fl\16l\u0641\13l\3"+
		"l\3l\7l\u0645\nl\fl\16l\u0648\13l\3l\5l\u064b\nl\3m\3m\7m\u064f\nm\fm"+
		"\16m\u0652\13m\3m\3m\7m\u0656\nm\fm\16m\u0659\13m\3m\5m\u065c\nm\3n\3"+
		"n\7n\u0660\nn\fn\16n\u0663\13n\3n\3n\7n\u0667\nn\fn\16n\u066a\13n\3n\3"+
		"n\5n\u066e\nn\3o\3o\7o\u0672\no\fo\16o\u0675\13o\3o\3o\7o\u0679\no\fo"+
		"\16o\u067c\13o\3o\3o\5o\u0680\no\3p\3p\7p\u0684\np\fp\16p\u0687\13p\3"+
		"p\3p\7p\u068b\np\fp\16p\u068e\13p\3p\5p\u0691\np\3q\3q\7q\u0695\nq\fq"+
		"\16q\u0698\13q\3q\3q\7q\u069c\nq\fq\16q\u069f\13q\3q\5q\u06a2\nq\3r\3"+
		"r\7r\u06a6\nr\fr\16r\u06a9\13r\3r\3r\7r\u06ad\nr\fr\16r\u06b0\13r\3r\5"+
		"r\u06b3\nr\3s\3s\3s\5s\u06b8\ns\3s\3s\3s\3s\3s\3s\5s\u06c0\ns\3t\3t\3"+
		"t\3t\3t\3t\5t\u06c8\nt\3u\3u\3u\3u\5u\u06ce\nu\3v\3v\3v\3v\3v\3v\3v\3"+
		"v\5v\u06d8\nv\3w\3w\3w\3x\5x\u06de\nx\3x\3x\7x\u06e2\nx\fx\16x\u06e5\13"+
		"x\3x\3x\7x\u06e9\nx\fx\16x\u06ec\13x\3x\3x\5x\u06f0\nx\3x\3x\3x\5x\u06f5"+
		"\nx\3x\3x\7x\u06f9\nx\fx\16x\u06fc\13x\3x\3x\7x\u0700\nx\fx\16x\u0703"+
		"\13x\3x\3x\5x\u0707\nx\3x\3x\5x\u070b\nx\3y\3y\7y\u070f\ny\fy\16y\u0712"+
		"\13y\3y\3y\3z\3z\7z\u0718\nz\fz\16z\u071b\13z\3z\3z\3z\3z\3z\3z\7z\u0723"+
		"\nz\fz\16z\u0726\13z\3z\3z\5z\u072a\nz\3{\3{\3|\3|\7|\u0730\n|\f|\16|"+
		"\u0733\13|\3|\3|\3|\3|\3|\3|\7|\u073b\n|\f|\16|\u073e\13|\3|\5|\u0741"+
		"\n|\3}\3}\7}\u0745\n}\f}\16}\u0748\13}\3}\7}\u074b\n}\f}\16}\u074e\13"+
		"}\3~\3~\3\177\3\177\3\u0080\3\u0080\7\u0080\u0756\n\u0080\f\u0080\16\u0080"+
		"\u0759\13\u0080\3\u0080\5\u0080\u075c\n\u0080\3\u0080\3\u0080\5\u0080"+
		"\u0760\n\u0080\3\u0080\3\u0080\5\u0080\u0764\n\u0080\6\u0080\u0766\n\u0080"+
		"\r\u0080\16\u0080\u0767\3\u0080\3\u0080\3\u0080\5\u0080\u076d\n\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\7\u0080\u0773\n\u0080\f\u0080\16\u0080"+
		"\u0776\13\u0080\3\u0080\3\u0080\5\u0080\u077a\n\u0080\5\u0080\u077c\n"+
		"\u0080\7\u0080\u077e\n\u0080\f\u0080\16\u0080\u0781\13\u0080\3\u0080\3"+
		"\u0080\3\u0081\3\u0081\5\u0081\u0787\n\u0081\3\u0081\3\u0081\3\u0081\5"+
		"\u0081\u078c\n\u0081\3\u0081\3\u0081\7\u0081\u0790\n\u0081\f\u0081\16"+
		"\u0081\u0793\13\u0081\3\u0081\5\u0081\u0796\n\u0081\3\u0081\3\u0081\5"+
		"\u0081\u079a\n\u0081\3\u0081\3\u0081\7\u0081\u079e\n\u0081\f\u0081\16"+
		"\u0081\u07a1\13\u0081\3\u0081\3\u0081\5\u0081\u07a5\n\u0081\3\u0081\3"+
		"\u0081\3\u0081\7\u0081\u07aa\n\u0081\f\u0081\16\u0081\u07ad\13\u0081\3"+
		"\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\7\u0081\u07b6\n"+
		"\u0081\f\u0081\16\u0081\u07b9\13\u0081\3\u0081\5\u0081\u07bc\n\u0081\3"+
		"\u0081\3\u0081\3\u0081\3\u0081\7\u0081\u07c2\n\u0081\f\u0081\16\u0081"+
		"\u07c5\13\u0081\3\u0081\5\u0081\u07c8\n\u0081\3\u0081\3\u0081\3\u0081"+
		"\7\u0081\u07cd\n\u0081\f\u0081\16\u0081\u07d0\13\u0081\3\u0081\7\u0081"+
		"\u07d3\n\u0081\f\u0081\16\u0081\u07d6\13\u0081\3\u0082\3\u0082\7\u0082"+
		"\u07da\n\u0082\f\u0082\16\u0082\u07dd\13\u0082\3\u0082\5\u0082\u07e0\n"+
		"\u0082\3\u0082\7\u0082\u07e3\n\u0082\f\u0082\16\u0082\u07e6\13\u0082\3"+
		"\u0082\3\u0082\3\u0083\5\u0083\u07eb\n\u0083\3\u0083\5\u0083\u07ee\n\u0083"+
		"\3\u0083\7\u0083\u07f1\n\u0083\f\u0083\16\u0083\u07f4\13\u0083\3\u0083"+
		"\5\u0083\u07f7\n\u0083\3\u0083\3\u0083\5\u0083\u07fb\n\u0083\5\u0083\u07fd"+
		"\n\u0083\3\u0084\7\u0084\u0800\n\u0084\f\u0084\16\u0084\u0803\13\u0084"+
		"\3\u0084\3\u0084\7\u0084\u0807\n\u0084\f\u0084\16\u0084\u080a\13\u0084"+
		"\3\u0085\5\u0085\u080d\n\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\5\u0085\u0816\n\u0085\3\u0086\3\u0086\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\5\u0087\u081f\n\u0087\3\u0088\3\u0088\3\u0088"+
		"\6\u0088\u0824\n\u0088\r\u0088\16\u0088\u0825\3\u0088\3\u0088\3\u0089"+
		"\5\u0089\u082b\n\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u0830\n\u0089\3"+
		"\u008a\3\u008a\3\u008a\5\u008a\u0835\n\u008a\3\u008a\3\u008a\3\u008a\3"+
		"\u008a\5\u008a\u083b\n\u008a\3\u008a\3\u008a\5\u008a\u083f\n\u008a\3\u008a"+
		"\3\u008a\3\u008a\5\u008a\u0844\n\u008a\3\u008b\5\u008b\u0847\n\u008b\3"+
		"\u008b\3\u008b\5\u008b\u084b\n\u008b\3\u008c\3\u008c\5\u008c\u084f\n\u008c"+
		"\3\u008c\3\u008c\5\u008c\u0853\n\u008c\3\u008c\2\3\u0100\u008d\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\u0110\u0112\u0114\u0116\2\34\3\3@@\b\2\b\16OOQRVX_"+
		"_aa\3\2\20\25\3\2\26\31\5\2\b\nOOVV\3\2\20\21\3\2\13\r\4\2\32\32bb\4\2"+
		"!),-\3\2./\3\2\3\4\5\2\3\4\33\34uv\3\2\3\5\4\2\3\4\26\27\3\2uv\3\2\33"+
		"\34\4\2\5\5\33\34\4\2\5\5\17\17\6\2\3\5\17\17\33\34uv\3\2wz\3\2*+\3\2"+
		"\22\23\4\2\21\21\35\36\3\2\62\63\4\2LLSS\5\2\6\6\67\67>>\u09a3\2\u011b"+
		"\3\2\2\2\4\u012a\3\2\2\2\6\u012c\3\2\2\2\b\u012e\3\2\2\2\n\u0130\3\2\2"+
		"\2\f\u0181\3\2\2\2\16\u0187\3\2\2\2\20\u019b\3\2\2\2\22\u019e\3\2\2\2"+
		"\24\u01ac\3\2\2\2\26\u01ae\3\2\2\2\30\u01b2\3\2\2\2\32\u01b8\3\2\2\2\34"+
		"\u01ba\3\2\2\2\36\u01be\3\2\2\2 \u01c2\3\2\2\2\"\u01c4\3\2\2\2$\u01cc"+
		"\3\2\2\2&\u01d7\3\2\2\2(\u01e1\3\2\2\2*\u01e3\3\2\2\2,\u01f7\3\2\2\2."+
		"\u01f9\3\2\2\2\60\u01fd\3\2\2\2\62\u0212\3\2\2\2\64\u0215\3\2\2\2\66\u023c"+
		"\3\2\2\28\u0251\3\2\2\2:\u0253\3\2\2\2<\u0277\3\2\2\2>\u027e\3\2\2\2@"+
		"\u0285\3\2\2\2B\u0287\3\2\2\2D\u0289\3\2\2\2F\u0299\3\2\2\2H\u02af\3\2"+
		"\2\2J\u02b1\3\2\2\2L\u02b3\3\2\2\2N\u02b5\3\2\2\2P\u02b7\3\2\2\2R\u02d0"+
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
		"\2\2\u00c8\u05c2\3\2\2\2\u00ca\u05c4\3\2\2\2\u00cc\u05d5\3\2\2\2\u00ce"+
		"\u0606\3\2\2\2\u00d0\u0608\3\2\2\2\u00d2\u0619\3\2\2\2\u00d4\u062a\3\2"+
		"\2\2\u00d6\u063b\3\2\2\2\u00d8\u064c\3\2\2\2\u00da\u065d\3\2\2\2\u00dc"+
		"\u066f\3\2\2\2\u00de\u0681\3\2\2\2\u00e0\u0692\3\2\2\2\u00e2\u06a3\3\2"+
		"\2\2\u00e4\u06bf\3\2\2\2\u00e6\u06c7\3\2\2\2\u00e8\u06cd\3\2\2\2\u00ea"+
		"\u06d7\3\2\2\2\u00ec\u06d9\3\2\2\2\u00ee\u070a\3\2\2\2\u00f0\u070c\3\2"+
		"\2\2\u00f2\u0729\3\2\2\2\u00f4\u072b\3\2\2\2\u00f6\u0740\3\2\2\2\u00f8"+
		"\u0742\3\2\2\2\u00fa\u074f\3\2\2\2\u00fc\u0751\3\2\2\2\u00fe\u0753\3\2"+
		"\2\2\u0100\u0799\3\2\2\2\u0102\u07d7\3\2\2\2\u0104\u07fc\3\2\2\2\u0106"+
		"\u0801\3\2\2\2\u0108\u0815\3\2\2\2\u010a\u0817\3\2\2\2\u010c\u081e\3\2"+
		"\2\2\u010e\u0820\3\2\2\2\u0110\u082f\3\2\2\2\u0112\u0843\3\2\2\2\u0114"+
		"\u0846\3\2\2\2\u0116\u0852\3\2\2\2\u0118\u011a\5\4\3\2\u0119\u0118\3\2"+
		"\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\3\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u012b\5\6\4\2\u011f\u012b\5\b\5\2"+
		"\u0120\u012b\5\n\6\2\u0121\u012b\5\20\t\2\u0122\u012b\5\22\n\2\u0123\u012b"+
		"\5\u00a4S\2\u0124\u012b\5\24\13\2\u0125\u012b\5\30\r\2\u0126\u012b\5J"+
		"&\2\u0127\u012b\5L\'\2\u0128\u012b\5z>\2\u0129\u012b\5x=\2\u012a\u011e"+
		"\3\2\2\2\u012a\u011f\3\2\2\2\u012a\u0120\3\2\2\2\u012a\u0121\3\2\2\2\u012a"+
		"\u0122\3\2\2\2\u012a\u0123\3\2\2\2\u012a\u0124\3\2\2\2\u012a\u0125\3\2"+
		"\2\2\u012a\u0126\3\2\2\2\u012a\u0127\3\2\2\2\u012a\u0128\3\2\2\2\u012a"+
		"\u0129\3\2\2\2\u012b\5\3\2\2\2\u012c\u012d\7u\2\2\u012d\7\3\2\2\2\u012e"+
		"\u012f\7v\2\2\u012f\t\3\2\2\2\u0130\u0131\5\f\7\2\u0131\13\3\2\2\2\u0132"+
		"\u0182\7W\2\2\u0133\u013d\7X\2\2\u0134\u0137\7\3\2\2\u0135\u0138\5\u00be"+
		"`\2\u0136\u0138\7B\2\2\u0137\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138\u013a"+
		"\3\2\2\2\u0139\u013b\7@\2\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013e\7\4\2\2\u013d\u0134\3\2\2\2\u013d\u013e\3\2"+
		"\2\2\u013e\u0182\3\2\2\2\u013f\u0140\7C\2\2\u0140\u0142\7\3\2\2\u0141"+
		"\u0143\7@\2\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2"+
		"\2\2\u0144\u0146\5\26\f\2\u0145\u0147\7@\2\2\u0146\u0145\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\7\4\2\2\u0149\u0182\3\2"+
		"\2\2\u014a\u0182\7D\2\2\u014b\u014c\7J\2\2\u014c\u014e\7\3\2\2\u014d\u014f"+
		"\7@\2\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0152\5\26\f\2\u0151\u0153\7@\2\2\u0152\u0151\3\2\2\2\u0152\u0153\3\2"+
		"\2\2\u0153\u0154\3\2\2\2\u0154\u0155\7\4\2\2\u0155\u0182\3\2\2\2\u0156"+
		"\u0157\7E\2\2\u0157\u0159\7\3\2\2\u0158\u015a\7@\2\2\u0159\u0158\3\2\2"+
		"\2\u0159\u015a\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u015e\5\16\b\2\u015c"+
		"\u015e\7\5\2\2\u015d\u015b\3\2\2\2\u015d\u015c\3\2\2\2\u015e\u0160\3\2"+
		"\2\2\u015f\u0161\7@\2\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u0163\3\2\2\2\u0162\u0164\5\26\f\2\u0163\u0162\3\2\2\2\u0163\u0164\3"+
		"\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\7\5\2\2\u0166\u0168\7@\2\2\u0167"+
		"\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016a\3\2\2\2\u0169\u016b\5\u00ca"+
		"f\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c"+
		"\u016e\7@\2\2\u016d\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2"+
		"\2\2\u016f\u0171\7\4\2\2\u0170\u0172\7\5\2\2\u0171\u0170\3\2\2\2\u0171"+
		"\u0172\3\2\2\2\u0172\u0182\3\2\2\2\u0173\u0182\7K\2\2\u0174\u0175\7F\2"+
		"\2\u0175\u0177\7\3\2\2\u0176\u0178\7@\2\2\u0177\u0176\3\2\2\2\u0177\u0178"+
		"\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017b\5\26\f\2\u017a\u017c\7@\2\2\u017b"+
		"\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\7\4"+
		"\2\2\u017e\u0180\7\5\2\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"\u0182\3\2\2\2\u0181\u0132\3\2\2\2\u0181\u0133\3\2\2\2\u0181\u013f\3\2"+
		"\2\2\u0181\u014a\3\2\2\2\u0181\u014b\3\2\2\2\u0181\u0156\3\2\2\2\u0181"+
		"\u0173\3\2\2\2\u0181\u0174\3\2\2\2\u0182\r\3\2\2\2\u0183\u0188\5\u00a4"+
		"S\2\u0184\u0185\5\u00caf\2\u0185\u0186\7\5\2\2\u0186\u0188\3\2\2\2\u0187"+
		"\u0183\3\2\2\2\u0187\u0184\3\2\2\2\u0188\17\3\2\2\2\u0189\u018a\7G\2\2"+
		"\u018a\u019c\7\5\2\2\u018b\u018c\7I\2\2\u018c\u019c\7\5\2\2\u018d\u018e"+
		"\7L\2\2\u018e\u018f\5\u00c2b\2\u018f\u0190\7\5\2\2\u0190\u019c\3\2\2\2"+
		"\u0191\u0193\7M\2\2\u0192\u0194\5\u00caf\2\u0193\u0192\3\2\2\2\u0193\u0194"+
		"\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u019c\7\5\2\2\u0196\u0198\7Y\2\2\u0197"+
		"\u0199\5\u00caf\2\u0198\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a"+
		"\3\2\2\2\u019a\u019c\7\5\2\2\u019b\u0189\3\2\2\2\u019b\u018b\3\2\2\2\u019b"+
		"\u018d\3\2\2\2\u019b\u0191\3\2\2\2\u019b\u0196\3\2\2\2\u019c\21\3\2\2"+
		"\2\u019d\u019f\7H\2\2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a4"+
		"\3\2\2\2\u01a0\u01a5\5\u00c2b\2\u01a1\u01a5\5\u00c4c\2\u01a2\u01a5\7}"+
		"\2\2\u01a3\u01a5\5\u00e6t\2\u01a4\u01a0\3\2\2\2\u01a4\u01a1\3\2\2\2\u01a4"+
		"\u01a2\3\2\2\2\u01a4\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\7\6"+
		"\2\2\u01a7\23\3\2\2\2\u01a8\u01a9\5\u00caf\2\u01a9\u01aa\7\5\2\2\u01aa"+
		"\u01ad\3\2\2\2\u01ab\u01ad\5\u010a\u0086\2\u01ac\u01a8\3\2\2\2\u01ac\u01ab"+
		"\3\2\2\2\u01ad\25\3\2\2\2\u01ae\u01af\5\u00caf\2\u01af\27\3\2\2\2\u01b0"+
		"\u01b3\5\32\16\2\u01b1\u01b3\5&\24\2\u01b2\u01b0\3\2\2\2\u01b2\u01b1\3"+
		"\2\2\2\u01b3\31\3\2\2\2\u01b4\u01b9\5\34\17\2\u01b5\u01b9\5\36\20\2\u01b6"+
		"\u01b9\5 \21\2\u01b7\u01b9\5\"\22\2\u01b8\u01b4\3\2\2\2\u01b8\u01b5\3"+
		"\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9\33\3\2\2\2\u01ba"+
		"\u01bb\7c\2\2\u01bb\u01bc\5$\23\2\u01bc\u01bd\b\17\1\2\u01bd\35\3\2\2"+
		"\2\u01be\u01bf\7d\2\2\u01bf\u01c0\5$\23\2\u01c0\u01c1\b\20\1\2\u01c1\37"+
		"\3\2\2\2\u01c2\u01c3\7e\2\2\u01c3!\3\2\2\2\u01c4\u01c5\7f\2\2\u01c5#\3"+
		"\2\2\2\u01c6\u01cd\5\26\f\2\u01c7\u01c8\7\3\2\2\u01c8\u01c9\5\26\f\2\u01c9"+
		"\u01ca\7\4\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01cd\5.\30\2\u01cc\u01c6\3\2"+
		"\2\2\u01cc\u01c7\3\2\2\2\u01cc\u01cb\3\2\2\2\u01cd%\3\2\2\2\u01ce\u01d8"+
		"\5(\25\2\u01cf\u01d8\5*\26\2\u01d0\u01d8\5\66\34\2\u01d1\u01d8\58\35\2"+
		"\u01d2\u01d8\5> \2\u01d3\u01d8\5@!\2\u01d4\u01d8\5F$\2\u01d5\u01d8\5H"+
		"%\2\u01d6\u01d8\5\64\33\2\u01d7\u01ce\3\2\2\2\u01d7\u01cf\3\2\2\2\u01d7"+
		"\u01d0\3\2\2\2\u01d7\u01d1\3\2\2\2\u01d7\u01d2\3\2\2\2\u01d7\u01d3\3\2"+
		"\2\2\u01d7\u01d4\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d6\3\2\2\2\u01d8"+
		"\'\3\2\2\2\u01d9\u01da\7g\2\2\u01da\u01db\5,\27\2\u01db\u01dc\t\2\2\2"+
		"\u01dc\u01e2\3\2\2\2\u01dd\u01de\7g\2\2\u01de\u01df\5,\27\2\u01df\u01e0"+
		"\5\62\32\2\u01e0\u01e2\3\2\2\2\u01e1\u01d9\3\2\2\2\u01e1\u01dd\3\2\2\2"+
		"\u01e2)\3\2\2\2\u01e3\u01e4\7h\2\2\u01e4\u01e5\5,\27\2\u01e5+\3\2\2\2"+
		"\u01e6\u01eb\5\u00c2b\2\u01e7\u01e8\7\3\2\2\u01e8\u01e9\5\60\31\2\u01e9"+
		"\u01ea\7\4\2\2\u01ea\u01ec\3\2\2\2\u01eb\u01e7\3\2\2\2\u01eb\u01ec\3\2"+
		"\2\2\u01ec\u01f8\3\2\2\2\u01ed\u01f8\5.\30\2\u01ee\u01f8\7s\2\2\u01ef"+
		"\u01f4\7\7\2\2\u01f0\u01f1\7\3\2\2\u01f1\u01f2\5\60\31\2\u01f2\u01f3\7"+
		"\4\2\2\u01f3\u01f5\3\2\2\2\u01f4\u01f0\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5"+
		"\u01f8\3\2\2\2\u01f6\u01f8\58\35\2\u01f7\u01e6\3\2\2\2\u01f7\u01ed\3\2"+
		"\2\2\u01f7\u01ee\3\2\2\2\u01f7\u01ef\3\2\2\2\u01f7\u01f6\3\2\2\2\u01f8"+
		"-\3\2\2\2\u01f9\u01fa\t\3\2\2\u01fa/\3\2\2\2\u01fb\u01fe\5\u00c2b\2\u01fc"+
		"\u01fe\7B\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fc\3\2\2\2\u01fd\u01fe\3\2"+
		"\2\2\u01fe\u0206\3\2\2\2\u01ff\u0202\7\17\2\2\u0200\u0203\5\u00c2b\2\u0201"+
		"\u0203\7B\2\2\u0202\u0200\3\2\2\2\u0202\u0201\3\2\2\2\u0203\u0205\3\2"+
		"\2\2\u0204\u01ff\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0206"+
		"\u0207\3\2\2\2\u0207\61\3\2\2\2\u0208\u0206\3\2\2\2\u0209\u020d\5\u00ca"+
		"f\2\u020a\u020b\7A\2\2\u020b\u020d\7@\2\2\u020c\u0209\3\2\2\2\u020c\u020a"+
		"\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f"+
		"\u0210\3\2\2\2\u0210\u0213\t\2\2\2\u0211\u0213\b\32\1\2\u0212\u020c\3"+
		"\2\2\2\u0212\u0211\3\2\2\2\u0213\63\3\2\2\2\u0214\u0216\5,\27\2\u0215"+
		"\u0214\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0218\5,"+
		"\27\2\u0218\u0235\7\3\2\2\u0219\u021e\5\u00caf\2\u021a\u021e\5\u00b6\\"+
		"\2\u021b\u021e\5P)\2\u021c\u021e\5^\60\2\u021d\u0219\3\2\2\2\u021d\u021a"+
		"\3\2\2\2\u021d\u021b\3\2\2\2\u021d\u021c\3\2\2\2\u021d\u021e\3\2\2\2\u021e"+
		"\u0220\3\2\2\2\u021f\u0221\7@\2\2\u0220\u021f\3\2\2\2\u0220\u0221\3\2"+
		"\2\2\u0221\u022e\3\2\2\2\u0222\u0224\7\17\2\2\u0223\u0225\7@\2\2\u0224"+
		"\u0223\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u022a\3\2\2\2\u0226\u022b\5\u00ca"+
		"f\2\u0227\u022b\5\u00b6\\\2\u0228\u022b\5P)\2\u0229\u022b\5^\60\2\u022a"+
		"\u0226\3\2\2\2\u022a\u0227\3\2\2\2\u022a\u0228\3\2\2\2\u022a\u0229\3\2"+
		"\2\2\u022b\u022d\3\2\2\2\u022c\u0222\3\2\2\2\u022d\u0230\3\2\2\2\u022e"+
		"\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2"+
		"\2\2\u0231\u0233\7\17\2\2\u0232\u0231\3\2\2\2\u0232\u0233\3\2\2\2\u0233"+
		"\u0236\3\2\2\2\u0234\u0236\7P\2\2\u0235\u021d\3\2\2\2\u0235\u0234\3\2"+
		"\2\2\u0236\u0237\3\2\2\2\u0237\u0238\7\4\2\2\u0238\65\3\2\2\2\u0239\u023a"+
		"\7i\2\2\u023a\u023d\7~\2\2\u023b\u023d\7i\2\2\u023c\u0239\3\2\2\2\u023c"+
		"\u023b\3\2\2\2\u023d\67\3\2\2\2\u023e\u0240\7j\2\2\u023f\u0241\7~\2\2"+
		"\u0240\u023f\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0252\3\2\2\2\u0242\u0243"+
		"\7r\2\2\u0243\u0244\7\3\2\2\u0244\u0246\7\3\2\2\u0245\u0247\5:\36\2\u0246"+
		"\u0245\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0249\7\4"+
		"\2\2\u0249\u0252\7\4\2\2\u024a\u024b\7r\2\2\u024b\u024d\7\3\2\2\u024c"+
		"\u024e\5:\36\2\u024d\u024c\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024f\3\2"+
		"\2\2\u024f\u0252\7\4\2\2\u0250\u0252\7r\2\2\u0251\u023e\3\2\2\2\u0251"+
		"\u0242\3\2\2\2\u0251\u024a\3\2\2\2\u0251\u0250\3\2\2\2\u02529\3\2\2\2"+
		"\u0253\u0258\5<\37\2\u0254\u0255\7\17\2\2\u0255\u0257\5<\37\2\u0256\u0254"+
		"\3\2\2\2\u0257\u025a\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259"+
		";\3\2\2\2\u025a\u0258\3\2\2\2\u025b\u0278\5,\27\2\u025c\u025d\5,\27\2"+
		"\u025d\u025e\7\3\2\2\u025e\u0263\5\u00c2b\2\u025f\u0260\7\17\2\2\u0260"+
		"\u0262\5\u00caf\2\u0261\u025f\3\2\2\2\u0262\u0265\3\2\2\2\u0263\u0261"+
		"\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0266\3\2\2\2\u0265\u0263\3\2\2\2\u0266"+
		"\u0267\7\4\2\2\u0267\u0278\3\2\2\2\u0268\u0269\5,\27\2\u0269\u026b\7\3"+
		"\2\2\u026a\u026c\5\u00caf\2\u026b\u026a\3\2\2\2\u026b\u026c\3\2\2\2\u026c"+
		"\u0271\3\2\2\2\u026d\u026e\7\17\2\2\u026e\u0270\5\u00caf\2\u026f\u026d"+
		"\3\2\2\2\u0270\u0273\3\2\2\2\u0271\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272"+
		"\u0274\3\2\2\2\u0273\u0271\3\2\2\2\u0274\u0275\7\4\2\2\u0275\u0278\3\2"+
		"\2\2\u0276\u0278\5R*\2\u0277\u025b\3\2\2\2\u0277\u025c\3\2\2\2\u0277\u0268"+
		"\3\2\2\2\u0277\u0276\3\2\2\2\u0278=\3\2\2\2\u0279\u027a\7k\2\2\u027a\u027f"+
		"\5B\"\2\u027b\u027c\7k\2\2\u027c\u027f\5,\27\2\u027d\u027f\7k\2\2\u027e"+
		"\u0279\3\2\2\2\u027e\u027b\3\2\2\2\u027e\u027d\3\2\2\2\u027f?\3\2\2\2"+
		"\u0280\u0281\7l\2\2\u0281\u0286\5B\"\2\u0282\u0283\7l\2\2\u0283\u0286"+
		"\5,\27\2\u0284\u0286\7l\2\2\u0285\u0280\3\2\2\2\u0285\u0282\3\2\2\2\u0285"+
		"\u0284\3\2\2\2\u0286A\3\2\2\2\u0287\u0288\5D#\2\u0288C\3\2\2\2\u0289\u028a"+
		"\7~\2\2\u028aE\3\2\2\2\u028b\u028c\7m\2\2\u028c\u028d\7x\2\2\u028d\u029a"+
		"\7~\2\2\u028e\u028f\7m\2\2\u028f\u0290\7x\2\2\u0290\u029a\5,\27\2\u0291"+
		"\u0292\7m\2\2\u0292\u0293\5,\27\2\u0293\u0294\7~\2\2\u0294\u029a\3\2\2"+
		"\2\u0295\u0296\7m\2\2\u0296\u029a\5,\27\2\u0297\u0298\7m\2\2\u0298\u029a"+
		"\7x\2\2\u0299\u028b\3\2\2\2\u0299\u028e\3\2\2\2\u0299\u0291\3\2\2\2\u0299"+
		"\u0295\3\2\2\2\u0299\u0297\3\2\2\2\u029aG\3\2\2\2\u029b\u029d\7n\2\2\u029c"+
		"\u029e\7o\2\2\u029d\u029c\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f\3\2"+
		"\2\2\u029f\u02a0\7p\2\2\u02a0\u02a1\7~\2\2\u02a1\u02b0\b%\1\2\u02a2\u02a4"+
		"\7n\2\2\u02a3\u02a5\7o\2\2\u02a4\u02a3\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5"+
		"\u02a6\3\2\2\2\u02a6\u02aa\7p\2\2\u02a7\u02a9\5\u00c2b\2\u02a8\u02a7\3"+
		"\2\2\2\u02a9\u02ac\3\2\2\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab"+
		"\u02b0\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ad\u02ae\7n\2\2\u02ae\u02b0\b%\1"+
		"\2\u02af\u029b\3\2\2\2\u02af\u02a2\3\2\2\2\u02af\u02ad\3\2\2\2\u02b0I"+
		"\3\2\2\2\u02b1\u02b2\7|\2\2\u02b2K\3\2\2\2\u02b3\u02b4\7@\2\2\u02b4M\3"+
		"\2\2\2\u02b5\u02b6\t\4\2\2\u02b6O\3\2\2\2\u02b7\u02b8\t\5\2\2\u02b8Q\3"+
		"\2\2\2\u02b9\u02d1\7w\2\2\u02ba\u02d1\7y\2\2\u02bb\u02d1\7x\2\2\u02bc"+
		"\u02be\7~\2\2\u02bd\u02bf\7@\2\2\u02be\u02bd\3\2\2\2\u02be\u02bf\3\2\2"+
		"\2\u02bf\u02c3\3\2\2\2\u02c0\u02c2\7|\2\2\u02c1\u02c0\3\2\2\2\u02c2\u02c5"+
		"\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c7\3\2\2\2\u02c5"+
		"\u02c3\3\2\2\2\u02c6\u02c8\7@\2\2\u02c7\u02c6\3\2\2\2\u02c7\u02c8\3\2"+
		"\2\2\u02c8\u02ca\3\2\2\2\u02c9\u02bc\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb"+
		"\u02c9\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02d1\3\2\2\2\u02cd\u02d1\7}"+
		"\2\2\u02ce\u02d1\7{\2\2\u02cf\u02d1\7z\2\2\u02d0\u02b9\3\2\2\2\u02d0\u02ba"+
		"\3\2\2\2\u02d0\u02bb\3\2\2\2\u02d0\u02c9\3\2\2\2\u02d0\u02cd\3\2\2\2\u02d0"+
		"\u02ce\3\2\2\2\u02d0\u02cf\3\2\2\2\u02d1S\3\2\2\2\u02d2\u02d3\t\6\2\2"+
		"\u02d3U\3\2\2\2\u02d4\u02d5\t\7\2\2\u02d5W\3\2\2\2\u02d6\u02d7\t\b\2\2"+
		"\u02d7Y\3\2\2\2\u02d8\u02db\t\t\2\2\u02d9\u02da\7\33\2\2\u02da\u02dc\7"+
		"\34\2\2\u02db\u02d9\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u0306\3\2\2\2\u02dd"+
		"\u0306\7\22\2\2\u02de\u0306\7\23\2\2\u02df\u0306\7\21\2\2\u02e0\u0306"+
		"\7\35\2\2\u02e1\u0306\7\36\2\2\u02e2\u0306\7\37\2\2\u02e3\u0306\7\20\2"+
		"\2\u02e4\u0306\7 \2\2\u02e5\u0306\7\24\2\2\u02e6\u0306\7\25\2\2\u02e7"+
		"\u0306\7!\2\2\u02e8\u0306\7\26\2\2\u02e9\u0306\7\27\2\2\u02ea\u0306\7"+
		"\"\2\2\u02eb\u0306\7#\2\2\u02ec\u0306\7$\2\2\u02ed\u0306\7%\2\2\u02ee"+
		"\u0306\7&\2\2\u02ef\u0306\7\'\2\2\u02f0\u0306\7(\2\2\u02f1\u0306\7)\2"+
		"\2\u02f2\u0306\7*\2\2\u02f3\u0306\7+\2\2\u02f4\u0306\7,\2\2\u02f5\u0306"+
		"\7-\2\2\u02f6\u0306\7.\2\2\u02f7\u0306\7/\2\2\u02f8\u0306\7\30\2\2\u02f9"+
		"\u0306\7\31\2\2\u02fa\u0306\7\60\2\2\u02fb\u0306\7\61\2\2\u02fc\u0306"+
		"\7\62\2\2\u02fd\u0306\7\63\2\2\u02fe\u0306\7\17\2\2\u02ff\u0306\7\64\2"+
		"\2\u0300\u0306\7\65\2\2\u0301\u0302\7\3\2\2\u0302\u0306\7\4\2\2\u0303"+
		"\u0304\7\33\2\2\u0304\u0306\7\34\2\2\u0305\u02d8\3\2\2\2\u0305\u02dd\3"+
		"\2\2\2\u0305\u02de\3\2\2\2\u0305\u02df\3\2\2\2\u0305\u02e0\3\2\2\2\u0305"+
		"\u02e1\3\2\2\2\u0305\u02e2\3\2\2\2\u0305\u02e3\3\2\2\2\u0305\u02e4\3\2"+
		"\2\2\u0305\u02e5\3\2\2\2\u0305\u02e6\3\2\2\2\u0305\u02e7\3\2\2\2\u0305"+
		"\u02e8\3\2\2\2\u0305\u02e9\3\2\2\2\u0305\u02ea\3\2\2\2\u0305\u02eb\3\2"+
		"\2\2\u0305\u02ec\3\2\2\2\u0305\u02ed\3\2\2\2\u0305\u02ee\3\2\2\2\u0305"+
		"\u02ef\3\2\2\2\u0305\u02f0\3\2\2\2\u0305\u02f1\3\2\2\2\u0305\u02f2\3\2"+
		"\2\2\u0305\u02f3\3\2\2\2\u0305\u02f4\3\2\2\2\u0305\u02f5\3\2\2\2\u0305"+
		"\u02f6\3\2\2\2\u0305\u02f7\3\2\2\2\u0305\u02f8\3\2\2\2\u0305\u02f9\3\2"+
		"\2\2\u0305\u02fa\3\2\2\2\u0305\u02fb\3\2\2\2\u0305\u02fc\3\2\2\2\u0305"+
		"\u02fd\3\2\2\2\u0305\u02fe\3\2\2\2\u0305\u02ff\3\2\2\2\u0305\u0300\3\2"+
		"\2\2\u0305\u0301\3\2\2\2\u0305\u0303\3\2\2\2\u0306[\3\2\2\2\u0307\u0308"+
		"\t\n\2\2\u0308]\3\2\2\2\u0309\u030a\t\13\2\2\u030a_\3\2\2\2\u030b\u030c"+
		"\7`\2\2\u030c\u030d\7\26\2\2\u030d\u030e\5b\62\2\u030e\u030f\7\27\2\2"+
		"\u030fa\3\2\2\2\u0310\u0311\7\26\2\2\u0311\u0312\5b\62\2\u0312\u0313\7"+
		"\27\2\2\u0313\u031a\3\2\2\2\u0314\u0315\7\3\2\2\u0315\u0316\5b\62\2\u0316"+
		"\u0317\7\4\2\2\u0317\u031a\3\2\2\2\u0318\u031a\5j\66\2\u0319\u0310\3\2"+
		"\2\2\u0319\u0314\3\2\2\2\u0319\u0318\3\2\2\2\u031a\u031b\3\2\2\2\u031b"+
		"\u0319\3\2\2\2\u031b\u031c\3\2\2\2\u031cc\3\2\2\2\u031d\u031e\n\f\2\2"+
		"\u031ee\3\2\2\2\u031f\u0320\n\r\2\2\u0320g\3\2\2\2\u0321\u0322\n\16\2"+
		"\2\u0322i\3\2\2\2\u0323\u0324\n\17\2\2\u0324k\3\2\2\2\u0325\u0326\n\20"+
		"\2\2\u0326m\3\2\2\2\u0327\u0328\n\21\2\2\u0328o\3\2\2\2\u0329\u032a\n"+
		"\22\2\2\u032aq\3\2\2\2\u032b\u032c\n\23\2\2\u032cs\3\2\2\2\u032d\u032e"+
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
		"\u0421\3\2\2\2\u0426\u0425\3\2\2\2\u0427\u0429\3\2\2\2\u0428\u042a\5\u0116"+
		"\u008c\2\u0429\u0428\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u0093\3\2\2\2\u042b"+
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
		"\3\2\2\2\u04eb\u04f6\5\u0112\u008a\2\u04ec\u04ee\7@\2\2\u04ed\u04ec\3"+
		"\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04f1\7\17\2\2\u04f0"+
		"\u04f2\7@\2\2\u04f1\u04f0\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04f3\3\2"+
		"\2\2\u04f3\u04f5\5\u0112\u008a\2\u04f4\u04ed\3\2\2\2\u04f5\u04f8\3\2\2"+
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
		"\u059f\3\2\2\2\u05a6\u05a4\3\2\2\2\u05a7\u05a9\3\2\2\2\u05a8\u05aa\5\u0116"+
		"\u008c\2\u05a9\u05a8\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u00c1\3\2\2\2\u05ab"+
		"\u05b0\7t\2\2\u05ac\u05ad\7\67\2\2\u05ad\u05af\7t\2\2\u05ae\u05ac\3\2"+
		"\2\2\u05af\u05b2\3\2\2\2\u05b0\u05ae\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1"+
		"\u05b7\3\2\2\2\u05b2\u05b0\3\2\2\2\u05b3\u05b7\7b\2\2\u05b4\u05b7\7p\2"+
		"\2\u05b5\u05b7\5X-\2\u05b6\u05ab\3\2\2\2\u05b6\u05b3\3\2\2\2\u05b6\u05b4"+
		"\3\2\2\2\u05b6\u05b5\3\2\2\2\u05b7\u00c3\3\2\2\2\u05b8\u05b9\t\25\2\2"+
		"\u05b9\u00c5\3\2\2\2\u05ba\u05bc\5V,\2\u05bb\u05bd\7:\2\2\u05bc\u05bb"+
		"\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05bf\3\2\2\2\u05be\u05ba\3\2\2\2\u05bf"+
		"\u05c0\3\2\2\2\u05c0\u05be\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1\u00c7\3\2"+
		"\2\2\u05c2\u05c3\5\u00c6d\2\u05c3\u00c9\3\2\2\2\u05c4\u05d3\5\u00ccg\2"+
		"\u05c5\u05c7\5\u0110\u0089\2\u05c6\u05c5\3\2\2\2\u05c7\u05ca\3\2\2\2\u05c8"+
		"\u05c6\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u05cb\3\2\2\2\u05ca\u05c8\3\2"+
		"\2\2\u05cb\u05cf\7\17\2\2\u05cc\u05ce\5\u0110\u0089\2\u05cd\u05cc\3\2"+
		"\2\2\u05ce\u05d1\3\2\2\2\u05cf\u05cd\3\2\2\2\u05cf\u05d0\3\2\2\2\u05d0"+
		"\u05d2\3\2\2\2\u05d1\u05cf\3\2\2\2\u05d2\u05d4\5\u00caf\2\u05d3\u05c8"+
		"\3\2\2\2\u05d3\u05d4\3\2\2\2\u05d4\u00cb\3\2\2\2\u05d5\u05e5\5\u00ceh"+
		"\2\u05d6\u05d8\5\u0110\u0089\2\u05d7\u05d6\3\2\2\2\u05d8\u05db\3\2\2\2"+
		"\u05d9\u05d7\3\2\2\2\u05d9\u05da\3\2\2\2\u05da\u05dc\3\2\2\2\u05db\u05d9"+
		"\3\2\2\2\u05dc\u05e0\5\\/\2\u05dd\u05df\5\u0110\u0089\2\u05de\u05dd\3"+
		"\2\2\2\u05df\u05e2\3\2\2\2\u05e0\u05de\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1"+
		"\u05e3\3\2\2\2\u05e2\u05e0\3\2\2\2\u05e3\u05e4\5\u00ccg\2\u05e4\u05e6"+
		"\3\2\2\2\u05e5\u05d9\3\2\2\2\u05e5\u05e6\3\2\2\2\u05e6\u00cd\3\2\2\2\u05e7"+
		"\u0607\5\u00d0i\2\u05e8\u05ec\5\u00d0i\2\u05e9\u05eb\5\u0110\u0089\2\u05ea"+
		"\u05e9\3\2\2\2\u05eb\u05ee\3\2\2\2\u05ec\u05ea\3\2\2\2\u05ec\u05ed\3\2"+
		"\2\2\u05ed\u05ef\3\2\2\2\u05ee\u05ec\3\2\2\2\u05ef\u05f3\7;\2\2\u05f0"+
		"\u05f2\5\u0110\u0089\2\u05f1\u05f0\3\2\2\2\u05f2\u05f5\3\2\2\2\u05f3\u05f1"+
		"\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4\u05f6\3\2\2\2\u05f5\u05f3\3\2\2\2\u05f6"+
		"\u05fa\5\u00caf\2\u05f7\u05f9\5\u0110\u0089\2\u05f8\u05f7\3\2\2\2\u05f9"+
		"\u05fc\3\2\2\2\u05fa\u05f8\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb\u05fd\3\2"+
		"\2\2\u05fc\u05fa\3\2\2\2\u05fd\u0601\7\6\2\2\u05fe\u0600\5\u0110\u0089"+
		"\2\u05ff\u05fe\3\2\2\2\u0600\u0603\3\2\2\2\u0601\u05ff\3\2\2\2\u0601\u0602"+
		"\3\2\2\2\u0602\u0604\3\2\2\2\u0603\u0601\3\2\2\2\u0604\u0605\5\u00ceh"+
		"\2\u0605\u0607\3\2\2\2\u0606\u05e7\3\2\2\2\u0606\u05e8\3\2\2\2\u0607\u00cf"+
		"\3\2\2\2\u0608\u0617\5\u00d2j\2\u0609\u060b\5\u0110\u0089\2\u060a\u0609"+
		"\3\2\2\2\u060b\u060e\3\2\2\2\u060c\u060a\3\2\2\2\u060c\u060d\3\2\2\2\u060d"+
		"\u060f\3\2\2\2\u060e\u060c\3\2\2\2\u060f\u0613\7\61\2\2\u0610\u0612\5"+
		"\u0110\u0089\2\u0611\u0610\3\2\2\2\u0612\u0615\3\2\2\2\u0613\u0611\3\2"+
		"\2\2\u0613\u0614\3\2\2\2\u0614\u0616\3\2\2\2\u0615\u0613\3\2\2\2\u0616"+
		"\u0618\5\u00d0i\2\u0617\u060c\3\2\2\2\u0617\u0618\3\2\2\2\u0618\u00d1"+
		"\3\2\2\2\u0619\u0628\5\u00d4k\2\u061a\u061c\5\u0110\u0089\2\u061b\u061a"+
		"\3\2\2\2\u061c\u061f\3\2\2\2\u061d\u061b\3\2\2\2\u061d\u061e\3\2\2\2\u061e"+
		"\u0620\3\2\2\2\u061f\u061d\3\2\2\2\u0620\u0624\7\60\2\2\u0621\u0623\5"+
		"\u0110\u0089\2\u0622\u0621\3\2\2\2\u0623\u0626\3\2\2\2\u0624\u0622\3\2"+
		"\2\2\u0624\u0625\3\2\2\2\u0625\u0627\3\2\2\2\u0626\u0624\3\2\2\2\u0627"+
		"\u0629\5\u00d2j\2\u0628\u061d\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u00d3"+
		"\3\2\2\2\u062a\u0639\5\u00d6l\2\u062b\u062d\5\u0110\u0089\2\u062c\u062b"+
		"\3\2\2\2\u062d\u0630\3\2\2\2\u062e\u062c\3\2\2\2\u062e\u062f\3\2\2\2\u062f"+
		"\u0631\3\2\2\2\u0630\u062e\3\2\2\2\u0631\u0635\7 \2\2\u0632\u0634\5\u0110"+
		"\u0089\2\u0633\u0632\3\2\2\2\u0634\u0637\3\2\2\2\u0635\u0633\3\2\2\2\u0635"+
		"\u0636\3\2\2\2\u0636\u0638\3\2\2\2\u0637\u0635\3\2\2\2\u0638\u063a\5\u00d4"+
		"k\2\u0639\u062e\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u00d5\3\2\2\2\u063b"+
		"\u064a\5\u00d8m\2\u063c\u063e\5\u0110\u0089\2\u063d\u063c\3\2\2\2\u063e"+
		"\u0641\3\2\2\2\u063f\u063d\3\2\2\2\u063f\u0640\3\2\2\2\u0640\u0642\3\2"+
		"\2\2\u0641\u063f\3\2\2\2\u0642\u0646\7\37\2\2\u0643\u0645\5\u0110\u0089"+
		"\2\u0644\u0643\3\2\2\2\u0645\u0648\3\2\2\2\u0646\u0644\3\2\2\2\u0646\u0647"+
		"\3\2\2\2\u0647\u0649\3\2\2\2\u0648\u0646\3\2\2\2\u0649\u064b\5\u00d6l"+
		"\2\u064a\u063f\3\2\2\2\u064a\u064b\3\2\2\2\u064b\u00d7\3\2\2\2\u064c\u065b"+
		"\5\u00dan\2\u064d\u064f\5\u0110\u0089\2\u064e\u064d\3\2\2\2\u064f\u0652"+
		"\3\2\2\2\u0650\u064e\3\2\2\2\u0650\u0651\3\2\2\2\u0651\u0653\3\2\2\2\u0652"+
		"\u0650\3\2\2\2\u0653\u0657\7\20\2\2\u0654\u0656\5\u0110\u0089\2\u0655"+
		"\u0654\3\2\2\2\u0656\u0659\3\2\2\2\u0657\u0655\3\2\2\2\u0657\u0658\3\2"+
		"\2\2\u0658\u065a\3\2\2\2\u0659\u0657\3\2\2\2\u065a\u065c\5\u00d8m\2\u065b"+
		"\u0650\3\2\2\2\u065b\u065c\3\2\2\2\u065c\u00d9\3\2\2\2\u065d\u066d\5\u00dc"+
		"o\2\u065e\u0660\5\u0110\u0089\2\u065f\u065e\3\2\2\2\u0660\u0663\3\2\2"+
		"\2\u0661\u065f\3\2\2\2\u0661\u0662\3\2\2\2\u0662\u0664\3\2\2\2\u0663\u0661"+
		"\3\2\2\2\u0664\u0668\5^\60\2\u0665\u0667\5\u0110\u0089\2\u0666\u0665\3"+
		"\2\2\2\u0667\u066a\3\2\2\2\u0668\u0666\3\2\2\2\u0668\u0669\3\2\2\2\u0669"+
		"\u066b\3\2\2\2\u066a\u0668\3\2\2\2\u066b\u066c\5\u00dan\2\u066c\u066e"+
		"\3\2\2\2\u066d\u0661\3\2\2\2\u066d\u066e\3\2\2\2\u066e\u00db\3\2\2\2\u066f"+
		"\u067f\5\u00dep\2\u0670\u0672\5\u0110\u0089\2\u0671\u0670\3\2\2\2\u0672"+
		"\u0675\3\2\2\2\u0673\u0671\3\2\2\2\u0673\u0674\3\2\2\2\u0674\u0676\3\2"+
		"\2\2\u0675\u0673\3\2\2\2\u0676\u067a\5P)\2\u0677\u0679\5\u0110\u0089\2"+
		"\u0678\u0677\3\2\2\2\u0679\u067c\3\2\2\2\u067a\u0678\3\2\2\2\u067a\u067b"+
		"\3\2\2\2\u067b\u067d\3\2\2\2\u067c\u067a\3\2\2\2\u067d\u067e\5\u00dco"+
		"\2\u067e\u0680\3\2\2\2\u067f\u0673\3\2\2\2\u067f\u0680\3\2\2\2\u0680\u00dd"+
		"\3\2\2\2\u0681\u0690\5\u00e0q\2\u0682\u0684\5\u0110\u0089\2\u0683\u0682"+
		"\3\2\2\2\u0684\u0687\3\2\2\2\u0685\u0683\3\2\2\2\u0685\u0686\3\2\2\2\u0686"+
		"\u0688\3\2\2\2\u0687\u0685\3\2\2\2\u0688\u068c\t\26\2\2\u0689\u068b\5"+
		"\u0110\u0089\2\u068a\u0689\3\2\2\2\u068b\u068e\3\2\2\2\u068c\u068a\3\2"+
		"\2\2\u068c\u068d\3\2\2\2\u068d\u068f\3\2\2\2\u068e\u068c\3\2\2\2\u068f"+
		"\u0691\5\u00dep\2\u0690\u0685\3\2\2\2\u0690\u0691\3\2\2\2\u0691\u00df"+
		"\3\2\2\2\u0692\u06a1\5\u00e2r\2\u0693\u0695\5\u0110\u0089\2\u0694\u0693"+
		"\3\2\2\2\u0695\u0698\3\2\2\2\u0696\u0694\3\2\2\2\u0696\u0697\3\2\2\2\u0697"+
		"\u0699\3\2\2\2\u0698\u0696\3\2\2\2\u0699\u069d\t\27\2\2\u069a\u069c\5"+
		"\u0110\u0089\2\u069b\u069a\3\2\2\2\u069c\u069f\3\2\2\2\u069d\u069b\3\2"+
		"\2\2\u069d\u069e\3\2\2\2\u069e\u06a0\3\2\2\2\u069f\u069d\3\2\2\2\u06a0"+
		"\u06a2\5\u00e0q\2\u06a1\u0696\3\2\2\2\u06a1\u06a2\3\2\2\2\u06a2\u00e1"+
		"\3\2\2\2\u06a3\u06b2\5\u00e4s\2\u06a4\u06a6\5\u0110\u0089\2\u06a5\u06a4"+
		"\3\2\2\2\u06a6\u06a9\3\2\2\2\u06a7\u06a5\3\2\2\2\u06a7\u06a8\3\2\2\2\u06a8"+
		"\u06aa\3\2\2\2\u06a9\u06a7\3\2\2\2\u06aa\u06ae\t\30\2\2\u06ab\u06ad\5"+
		"\u0110\u0089\2\u06ac\u06ab\3\2\2\2\u06ad\u06b0\3\2\2\2\u06ae\u06ac\3\2"+
		"\2\2\u06ae\u06af\3\2\2\2\u06af\u06b1\3\2\2\2\u06b0\u06ae\3\2\2\2\u06b1"+
		"\u06b3\5\u00e2r\2\u06b2\u06a7\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3\u00e3"+
		"\3\2\2\2\u06b4\u06b5\7\3\2\2\u06b5\u06b7\5V,\2\u06b6\u06b8\5\u00c2b\2"+
		"\u06b7\u06b6\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8\u06b9\3\2\2\2\u06b9\u06ba"+
		"\7\4\2\2\u06ba\u06bb\7\3\2\2\u06bb\u06bc\5\u0104\u0083\2\u06bc\u06bd\7"+
		"\4\2\2\u06bd\u06c0\3\2\2\2\u06be\u06c0\5\u00e6t\2\u06bf\u06b4\3\2\2\2"+
		"\u06bf\u06be\3\2\2\2\u06c0\u00e5\3\2\2\2\u06c1\u06c2\7\3\2\2\u06c2\u06c3"+
		"\5\u00e8u\2\u06c3\u06c4\7\4\2\2\u06c4\u06c5\5\u00e6t\2\u06c5\u06c8\3\2"+
		"\2\2\u06c6\u06c8\5\u00eav\2\u06c7\u06c1\3\2\2\2\u06c7\u06c6\3\2\2\2\u06c8"+
		"\u00e7\3\2\2\2\u06c9\u06ce\5\u00b6\\\2\u06ca\u06cb\5\u00b6\\\2\u06cb\u06cc"+
		"\5\u00e4s\2\u06cc\u06ce\3\2\2\2\u06cd\u06c9\3\2\2\2\u06cd\u06ca\3\2\2"+
		"\2\u06ce\u00e9\3\2\2\2\u06cf\u06d8\5\u00ecw\2\u06d0\u06d8\5\u00f0y\2\u06d1"+
		"\u06d8\5\u00f2z\2\u06d2\u06d8\5\u00eex\2\u06d3\u06d8\5\u0100\u0081\2\u06d4"+
		"\u06d8\5\u00f6|\2\u06d5\u06d8\5\64\33\2\u06d6\u06d8\5\u00fe\u0080\2\u06d7"+
		"\u06cf\3\2\2\2\u06d7\u06d0\3\2\2\2\u06d7\u06d1\3\2\2\2\u06d7\u06d2\3\2"+
		"\2\2\u06d7\u06d3\3\2\2\2\u06d7\u06d4\3\2\2\2\u06d7\u06d5\3\2\2\2\u06d7"+
		"\u06d6\3\2\2\2\u06d8\u00eb\3\2\2\2\u06d9\u06da\7\20\2\2\u06da\u06db\5"+
		"\u00c2b\2\u06db\u00ed\3\2\2\2\u06dc\u06de\7\67\2\2\u06dd\u06dc\3\2\2\2"+
		"\u06dd\u06de\3\2\2\2\u06de\u06df\3\2\2\2\u06df\u06e3\7b\2\2\u06e0\u06e2"+
		"\5\u0110\u0089\2\u06e1\u06e0\3\2\2\2\u06e2\u06e5\3\2\2\2\u06e3\u06e1\3"+
		"\2\2\2\u06e3\u06e4\3\2\2\2\u06e4\u06e6\3\2\2\2\u06e5\u06e3\3\2\2\2\u06e6"+
		"\u06ea\5\u00b6\\\2\u06e7\u06e9\5\u0110\u0089\2\u06e8\u06e7\3\2\2\2\u06e9"+
		"\u06ec\3\2\2\2\u06ea\u06e8\3\2\2\2\u06ea\u06eb\3\2\2\2\u06eb\u06ed\3\2"+
		"\2\2\u06ec\u06ea\3\2\2\2\u06ed\u06ef\7\33\2\2\u06ee\u06f0\5\u00ceh\2\u06ef"+
		"\u06ee\3\2\2\2\u06ef\u06f0\3\2\2\2\u06f0\u06f1\3\2\2\2\u06f1\u06f2\7\34"+
		"\2\2\u06f2\u070b\3\2\2\2\u06f3\u06f5\7\67\2\2\u06f4\u06f3\3\2\2\2\u06f4"+
		"\u06f5\3\2\2\2\u06f5\u06f6\3\2\2\2\u06f6\u06fa\7b\2\2\u06f7\u06f9\5\u0110"+
		"\u0089\2\u06f8\u06f7\3\2\2\2\u06f9\u06fc\3\2\2\2\u06fa\u06f8\3\2\2\2\u06fa"+
		"\u06fb\3\2\2\2\u06fb\u06fd\3\2\2\2\u06fc\u06fa\3\2\2\2\u06fd\u0701\5\u00b6"+
		"\\\2\u06fe\u0700\5\u0110\u0089\2\u06ff\u06fe\3\2\2\2\u0700\u0703\3\2\2"+
		"\2\u0701\u06ff\3\2\2\2\u0701\u0702\3\2\2\2\u0702\u0704\3\2\2\2\u0703\u0701"+
		"\3\2\2\2\u0704\u0706\7\3\2\2\u0705\u0707\5\u00caf\2\u0706\u0705\3\2\2"+
		"\2\u0706\u0707\3\2\2\2\u0707\u0708\3\2\2\2\u0708\u0709\7\4\2\2\u0709\u070b"+
		"\3\2\2\2\u070a\u06dd\3\2\2\2\u070a\u06f4\3\2\2\2\u070b\u00ef\3\2\2\2\u070c"+
		"\u0710\5N(\2\u070d\u070f\5\u0110\u0089\2\u070e\u070d\3\2\2\2\u070f\u0712"+
		"\3\2\2\2\u0710\u070e\3\2\2\2\u0710\u0711\3\2\2\2\u0711\u0713\3\2\2\2\u0712"+
		"\u0710\3\2\2\2\u0713\u0714\5\u00e6t\2\u0714\u00f1\3\2\2\2\u0715\u0719"+
		"\5\u00f4{\2\u0716\u0718\5\u0110\u0089\2\u0717\u0716\3\2\2\2\u0718\u071b"+
		"\3\2\2\2\u0719\u0717\3\2\2\2\u0719\u071a\3\2\2\2\u071a\u071c\3\2\2\2\u071b"+
		"\u0719\3\2\2\2\u071c\u071d\7\3\2\2\u071d\u071e\5\u00f8}\2\u071e\u071f"+
		"\7\4\2\2\u071f\u072a\3\2\2\2\u0720\u0724\5\u00f4{\2\u0721\u0723\5\u0110"+
		"\u0089\2\u0722\u0721\3\2\2\2\u0723\u0726\3\2\2\2\u0724\u0722\3\2\2\2\u0724"+
		"\u0725\3\2\2\2\u0725\u0727\3\2\2\2\u0726\u0724\3\2\2\2\u0727\u0728\5\u00fa"+
		"~\2\u0728\u072a\3\2\2\2\u0729\u0715\3\2\2\2\u0729\u0720\3\2\2\2\u072a"+
		"\u00f3\3\2\2\2\u072b\u072c\7<\2\2\u072c\u00f5\3\2\2\2\u072d\u0731\7=\2"+
		"\2\u072e\u0730\5\u0110\u0089\2\u072f\u072e\3\2\2\2\u0730\u0733\3\2\2\2"+
		"\u0731\u072f\3\2\2\2\u0731\u0732\3\2\2\2\u0732\u0734\3\2\2\2\u0733\u0731"+
		"\3\2\2\2\u0734\u0735\7\3\2\2\u0735\u0736\5\u00caf\2\u0736\u0737\7\4\2"+
		"\2\u0737\u0741\3\2\2\2\u0738\u073c\7=\2\2\u0739\u073b\5\u0110\u0089\2"+
		"\u073a\u0739\3\2\2\2\u073b\u073e\3\2\2\2\u073c\u073a\3\2\2\2\u073c\u073d"+
		"\3\2\2\2\u073d\u073f\3\2\2\2\u073e\u073c\3\2\2\2\u073f\u0741\5\u00caf"+
		"\2\u0740\u072d\3\2\2\2\u0740\u0738\3\2\2\2\u0741\u00f7\3\2\2\2\u0742\u074c"+
		"\5\u00b6\\\2\u0743\u0745\5\u0110\u0089\2\u0744\u0743\3\2\2\2\u0745\u0748"+
		"\3\2\2\2\u0746\u0744\3\2\2\2\u0746\u0747\3\2\2\2\u0747\u0749\3\2\2\2\u0748"+
		"\u0746\3\2\2\2\u0749\u074b\5V,\2\u074a\u0746\3\2\2\2\u074b\u074e\3\2\2"+
		"\2\u074c\u074a\3\2\2\2\u074c\u074d\3\2\2\2\u074d\u00f9\3\2\2\2\u074e\u074c"+
		"\3\2\2\2\u074f\u0750\5\u00eav\2\u0750\u00fb\3\2\2\2\u0751\u0752\t\31\2"+
		"\2\u0752\u00fd\3\2\2\2\u0753\u0757\7U\2\2\u0754\u0756\t\32\2\2\u0755\u0754"+
		"\3\2\2\2\u0756\u0759\3\2\2\2\u0757\u0755\3\2\2\2\u0757\u0758\3\2\2\2\u0758"+
		"\u075b\3\2\2\2\u0759\u0757\3\2\2\2\u075a\u075c\7@\2\2\u075b\u075a\3\2"+
		"\2\2\u075b\u075c\3\2\2\2\u075c\u075d\3\2\2\2\u075d\u075f\7\3\2\2\u075e"+
		"\u0760\7@\2\2\u075f\u075e\3\2\2\2\u075f\u0760\3\2\2\2\u0760\u0765\3\2"+
		"\2\2\u0761\u0763\7~\2\2\u0762\u0764\7@\2\2\u0763\u0762\3\2\2\2\u0763\u0764"+
		"\3\2\2\2\u0764\u0766\3\2\2\2\u0765\u0761\3\2\2\2\u0766\u0767\3\2\2\2\u0767"+
		"\u0765\3\2\2\2\u0767\u0768\3\2\2\2\u0768\u077f\3\2\2\2\u0769\u077b\t\33"+
		"\2\2\u076a\u076c\7~\2\2\u076b\u076d\7@\2\2\u076c\u076b\3\2\2\2\u076c\u076d"+
		"\3\2\2\2\u076d\u0779\3\2\2\2\u076e\u076f\7\3\2\2\u076f\u0774\5\u00c2b"+
		"\2\u0770\u0771\7\17\2\2\u0771\u0773\5\u00c2b\2\u0772\u0770\3\2\2\2\u0773"+
		"\u0776\3\2\2\2\u0774\u0772\3\2\2\2\u0774\u0775\3\2\2\2\u0775\u0777\3\2"+
		"\2\2\u0776\u0774\3\2\2\2\u0777\u0778\7\4\2\2\u0778\u077a\3\2\2\2\u0779"+
		"\u076e\3\2\2\2\u0779\u077a\3\2\2\2\u077a\u077c\3\2\2\2\u077b\u076a\3\2"+
		"\2\2\u077b\u077c\3\2\2\2\u077c\u077e\3\2\2\2\u077d\u0769\3\2\2\2\u077e"+
		"\u0781\3\2\2\2\u077f\u077d\3\2\2\2\u077f\u0780\3\2\2\2\u0780\u0782\3\2"+
		"\2\2\u0781\u077f\3\2\2\2\u0782\u0783\7\4\2\2\u0783\u00ff\3\2\2\2\u0784"+
		"\u0786\b\u0081\1\2\u0785\u0787\5\u00b6\\\2\u0786\u0785\3\2\2\2\u0786\u0787"+
		"\3\2\2\2\u0787\u0788\3\2\2\2\u0788\u079a\5\u0102\u0082\2\u0789\u079a\5"+
		"\u0108\u0085\2\u078a\u078c\5V,\2\u078b\u078a\3\2\2\2\u078b\u078c\3\2\2"+
		"\2\u078c\u078d\3\2\2\2\u078d\u0791\5\u00fc\177\2\u078e\u0790\5\u0110\u0089"+
		"\2\u078f\u078e\3\2\2\2\u0790\u0793\3\2\2\2\u0791\u078f\3\2\2\2\u0791\u0792"+
		"\3\2\2\2\u0792\u0795\3\2\2\2\u0793\u0791\3\2\2\2\u0794\u0796\5V,\2\u0795"+
		"\u0794\3\2\2\2\u0795\u0796\3\2\2\2\u0796\u0797\3\2\2\2\u0797\u0798\5\u0108"+
		"\u0085\2\u0798\u079a\3\2\2\2\u0799\u0784\3\2\2\2\u0799\u0789\3\2\2\2\u0799"+
		"\u078b\3\2\2\2\u079a\u07d4\3\2\2\2\u079b\u079f\f\n\2\2\u079c\u079e\5\u0110"+
		"\u0089\2\u079d\u079c\3\2\2\2\u079e\u07a1\3\2\2\2\u079f\u079d\3\2\2\2\u079f"+
		"\u07a0\3\2\2\2\u07a0\u07a2\3\2\2\2\u07a1\u079f\3\2\2\2\u07a2\u07a4\7\33"+
		"\2\2\u07a3\u07a5\5\u00caf\2\u07a4\u07a3\3\2\2\2\u07a4\u07a5\3\2\2\2\u07a5"+
		"\u07a6\3\2\2\2\u07a6\u07d3\7\34\2\2\u07a7\u07ab\f\t\2\2\u07a8\u07aa\5"+
		"\u0110\u0089\2\u07a9\u07a8\3\2\2\2\u07aa\u07ad\3\2\2\2\u07ab\u07a9\3\2"+
		"\2\2\u07ab\u07ac\3\2\2\2\u07ac\u07ae\3\2\2\2\u07ad\u07ab\3\2\2\2\u07ae"+
		"\u07af\7\3\2\2\u07af\u07b0\5\u0104\u0083\2\u07b0\u07b1\7\4\2\2\u07b1\u07d3"+
		"\3\2\2\2\u07b2\u07b3\f\b\2\2\u07b3\u07b7\7?\2\2\u07b4\u07b6\5\u0110\u0089"+
		"\2\u07b5\u07b4\3\2\2\2\u07b6\u07b9\3\2\2\2\u07b7\u07b5\3\2\2\2\u07b7\u07b8"+
		"\3\2\2\2\u07b8\u07bb\3\2\2\2\u07b9\u07b7\3\2\2\2\u07ba\u07bc\7`\2\2\u07bb"+
		"\u07ba\3\2\2\2\u07bb\u07bc\3\2\2\2\u07bc\u07bd\3\2\2\2\u07bd\u07d3\5\u00c2"+
		"b\2\u07be\u07bf\f\7\2\2\u07bf\u07c3\7\65\2\2\u07c0\u07c2\5\u0110\u0089"+
		"\2\u07c1\u07c0\3\2\2\2\u07c2\u07c5\3\2\2\2\u07c3\u07c1\3\2\2\2\u07c3\u07c4"+
		"\3\2\2\2\u07c4\u07c7\3\2\2\2\u07c5\u07c3\3\2\2\2\u07c6\u07c8\7`\2\2\u07c7"+
		"\u07c6\3\2\2\2\u07c7\u07c8\3\2\2\2\u07c8\u07c9\3\2\2\2\u07c9\u07d3\5\u00c2"+
		"b\2\u07ca\u07ce\f\6\2\2\u07cb\u07cd\5\u0110\u0089\2\u07cc\u07cb\3\2\2"+
		"\2\u07cd\u07d0\3\2\2\2\u07ce\u07cc\3\2\2\2\u07ce\u07cf\3\2\2\2\u07cf\u07d1"+
		"\3\2\2\2\u07d0\u07ce\3\2\2\2\u07d1\u07d3\5\u00fc\177\2\u07d2\u079b\3\2"+
		"\2\2\u07d2\u07a7\3\2\2\2\u07d2\u07b2\3\2\2\2\u07d2\u07be\3\2\2\2\u07d2"+
		"\u07ca\3\2\2\2\u07d3\u07d6\3\2\2\2\u07d4\u07d2\3\2\2\2\u07d4\u07d5\3\2"+
		"\2\2\u07d5\u0101\3\2\2\2\u07d6\u07d4\3\2\2\2\u07d7\u07db\7u\2\2\u07d8"+
		"\u07da\5\u0110\u0089\2\u07d9\u07d8\3\2\2\2\u07da\u07dd\3\2\2\2\u07db\u07d9"+
		"\3\2\2\2\u07db\u07dc\3\2\2\2\u07dc\u07df\3\2\2\2\u07dd\u07db\3\2\2\2\u07de"+
		"\u07e0\5\u0104\u0083\2\u07df\u07de\3\2\2\2\u07df\u07e0\3\2\2\2\u07e0\u07e4"+
		"\3\2\2\2\u07e1\u07e3\5\u0110\u0089\2\u07e2\u07e1\3\2\2\2\u07e3\u07e6\3"+
		"\2\2\2\u07e4\u07e2\3\2\2\2\u07e4\u07e5\3\2\2\2\u07e5\u07e7\3\2\2\2\u07e6"+
		"\u07e4\3\2\2\2\u07e7\u07e8\7v\2\2\u07e8\u0103\3\2\2\2\u07e9\u07eb\5\u0106"+
		"\u0084\2\u07ea\u07e9\3\2\2\2\u07ea\u07eb\3\2\2\2\u07eb\u07f2\3\2\2\2\u07ec"+
		"\u07ee\7\17\2\2\u07ed\u07ec\3\2\2\2\u07ed\u07ee\3\2\2\2\u07ee\u07ef\3"+
		"\2\2\2\u07ef\u07f1\5\u0106\u0084\2\u07f0\u07ed\3\2\2\2\u07f1\u07f4\3\2"+
		"\2\2\u07f2\u07f0\3\2\2\2\u07f2\u07f3\3\2\2\2\u07f3\u07f6\3\2\2\2\u07f4"+
		"\u07f2\3\2\2\2\u07f5\u07f7\7\17\2\2\u07f6\u07f5\3\2\2\2\u07f6\u07f7\3"+
		"\2\2\2\u07f7\u07fd\3\2\2\2\u07f8\u07fa\7P\2\2\u07f9\u07fb\5V,\2\u07fa"+
		"\u07f9\3\2\2\2\u07fa\u07fb\3\2\2\2\u07fb\u07fd\3\2\2\2\u07fc\u07ea\3\2"+
		"\2\2\u07fc\u07f8\3\2\2\2\u07fd\u0105\3\2\2\2\u07fe\u0800\5\u0110\u0089"+
		"\2\u07ff\u07fe\3\2\2\2\u0800\u0803\3\2\2\2\u0801\u07ff\3\2\2\2\u0801\u0802"+
		"\3\2\2\2\u0802\u0804\3\2\2\2\u0803\u0801\3\2\2\2\u0804\u0808\5\u00ccg"+
		"\2\u0805\u0807\5\u0110\u0089\2\u0806\u0805\3\2\2\2\u0807\u080a\3\2\2\2"+
		"\u0808\u0806\3\2\2\2\u0808\u0809\3\2\2\2\u0809\u0107\3\2\2\2\u080a\u0808"+
		"\3\2\2\2\u080b\u080d\7?\2\2\u080c\u080b\3\2\2\2\u080c\u080d\3\2\2\2\u080d"+
		"\u080e\3\2\2\2\u080e\u0816\5\u00c2b\2\u080f\u0816\5V,\2\u0810\u0816\5"+
		"R*\2\u0811\u0812\7\3\2\2\u0812\u0813\5\u00caf\2\u0813\u0814\7\4\2\2\u0814"+
		"\u0816\3\2\2\2\u0815\u080c\3\2\2\2\u0815\u080f\3\2\2\2\u0815\u0810\3\2"+
		"\2\2\u0815\u0811\3\2\2\2\u0816\u0109\3\2\2\2\u0817\u0818\7\5\2\2\u0818"+
		"\u010b\3\2\2\2\u0819\u081f\5\34\17\2\u081a\u081f\5\36\20\2\u081b\u081f"+
		"\5 \21\2\u081c\u081f\5\"\22\2\u081d\u081f\5\u010e\u0088\2\u081e\u0819"+
		"\3\2\2\2\u081e\u081a\3\2\2\2\u081e\u081b\3\2\2\2\u081e\u081c\3\2\2\2\u081e"+
		"\u081d\3\2\2\2\u081f\u010d\3\2\2\2\u0820\u0821\7g\2\2\u0821\u0823\5,\27"+
		"\2\u0822\u0824\5\u00caf\2\u0823\u0822\3\2\2\2\u0824\u0825\3\2\2\2\u0825"+
		"\u0823\3\2\2\2\u0825\u0826\3\2\2\2\u0826\u0827\3\2\2\2\u0827\u0828\t\2"+
		"\2\2\u0828\u010f\3\2\2\2\u0829\u082b\7A\2\2\u082a\u0829\3\2\2\2\u082a"+
		"\u082b\3\2\2\2\u082b\u082c\3\2\2\2\u082c\u0830\7@\2\2\u082d\u0830\7|\2"+
		"\2\u082e\u0830\5\u010c\u0087\2\u082f\u082a\3\2\2\2\u082f\u082d\3\2\2\2"+
		"\u082f\u082e\3\2\2\2\u0830\u0111\3\2\2\2\u0831\u0832\5\u0114\u008b\2\u0832"+
		"\u0834\7\3\2\2\u0833\u0835\5\u00caf\2\u0834\u0833\3\2\2\2\u0834\u0835"+
		"\3\2\2\2\u0835\u0836\3\2\2\2\u0836\u0837\7\4\2\2\u0837\u0844\3\2\2\2\u0838"+
		"\u083a\5\u0114\u008b\2\u0839\u083b\7@\2\2\u083a\u0839\3\2\2\2\u083a\u083b"+
		"\3\2\2\2\u083b\u083c\3\2\2\2\u083c\u083e\7!\2\2\u083d\u083f\7@\2\2\u083e"+
		"\u083d\3\2\2\2\u083e\u083f\3\2\2\2\u083f\u0840\3\2\2\2\u0840\u0841\5\u0106"+
		"\u0084\2\u0841\u0844\3\2\2\2\u0842\u0844\5\u0114\u008b\2\u0843\u0831\3"+
		"\2\2\2\u0843\u0838\3\2\2\2\u0843\u0842\3\2\2\2\u0844\u0113\3\2\2\2\u0845"+
		"\u0847\5\u00c6d\2\u0846\u0845\3\2\2\2\u0846\u0847\3\2\2\2\u0847\u0848"+
		"\3\2\2\2\u0848\u084a\5\u00c2b\2\u0849\u084b\5\u0116\u008c\2\u084a\u0849"+
		"\3\2\2\2\u084a\u084b\3\2\2\2\u084b\u0115\3\2\2\2\u084c\u084e\7\33\2\2"+
		"\u084d\u084f\5\u00ceh\2\u084e\u084d\3\2\2\2\u084e\u084f\3\2\2\2\u084f"+
		"\u0850\3\2\2\2\u0850\u0853\7\34\2\2\u0851\u0853\5\u00bc_\2\u0852\u084c"+
		"\3\2\2\2\u0852\u0851\3\2\2\2\u0853\u0117\3\2\2\2\u0156\u011b\u012a\u0137"+
		"\u013a\u013d\u0142\u0146\u014e\u0152\u0159\u015d\u0160\u0163\u0167\u016a"+
		"\u016d\u0171\u0177\u017b\u017f\u0181\u0187\u0193\u0198\u019b\u019e\u01a4"+
		"\u01ac\u01b2\u01b8\u01cc\u01d7\u01e1\u01eb\u01f4\u01f7\u01fd\u0202\u0206"+
		"\u020c\u020e\u0212\u0215\u021d\u0220\u0224\u022a\u022e\u0232\u0235\u023c"+
		"\u0240\u0246\u024d\u0251\u0258\u0263\u026b\u0271\u0277\u027e\u0285\u0299"+
		"\u029d\u02a4\u02aa\u02af\u02be\u02c3\u02c7\u02cb\u02d0\u02db\u0305\u0319"+
		"\u031b\u0337\u033e\u0343\u0347\u034a\u034d\u0351\u035d\u0360\u0364\u0366"+
		"\u036a\u036e\u0371\u0374\u0377\u037c\u0380\u0383\u0386\u038a\u0390\u0394"+
		"\u039b\u039f\u03a4\u03a6\u03aa\u03ad\u03b0\u03b4\u03b8\u03bc\u03c0\u03c4"+
		"\u03c9\u03ce\u03d2\u03d6\u03dc\u03e1\u03e6\u03e9\u03ec\u03f0\u03f2\u03f5"+
		"\u03f8\u03fd\u0400\u0403\u0408\u040d\u0410\u0413\u0416\u041c\u041f\u0426"+
		"\u0429\u0434\u043b\u0441\u044c\u0456\u045f\u0464\u046a\u046e\u0472\u0474"+
		"\u0477\u047e\u0480\u0485\u0489\u048e\u0492\u0496\u0499\u04a0\u04a2\u04a5"+
		"\u04a7\u04ab\u04ae\u04b1\u04b3\u04b8\u04bc\u04bf\u04c3\u04c5\u04c8\u04ce"+
		"\u04d1\u04d5\u04d8\u04dc\u04e3\u04e6\u04e9\u04ed\u04f1\u04f6\u04fa\u04fd"+
		"\u0503\u0506\u0509\u0516\u051b\u051d\u0520\u0526\u052a\u052e\u0532\u0536"+
		"\u053a\u053e\u0542\u054f\u0553\u0557\u0559\u055d\u0561\u0565\u0569\u056d"+
		"\u0571\u0575\u0577\u0579\u057d\u0586\u058b\u058e\u0591\u0595\u059a\u059d"+
		"\u05a4\u05a6\u05a9\u05b0\u05b6\u05bc\u05c0\u05c8\u05cf\u05d3\u05d9\u05e0"+
		"\u05e5\u05ec\u05f3\u05fa\u0601\u0606\u060c\u0613\u0617\u061d\u0624\u0628"+
		"\u062e\u0635\u0639\u063f\u0646\u064a\u0650\u0657\u065b\u0661\u0668\u066d"+
		"\u0673\u067a\u067f\u0685\u068c\u0690\u0696\u069d\u06a1\u06a7\u06ae\u06b2"+
		"\u06b7\u06bf\u06c7\u06cd\u06d7\u06dd\u06e3\u06ea\u06ef\u06f4\u06fa\u0701"+
		"\u0706\u070a\u0710\u0719\u0724\u0729\u0731\u073c\u0740\u0746\u074c\u0757"+
		"\u075b\u075f\u0763\u0767\u076c\u0774\u0779\u077b\u077f\u0786\u078b\u0791"+
		"\u0795\u0799\u079f\u07a4\u07ab\u07b7\u07bb\u07c3\u07c7\u07ce\u07d2\u07d4"+
		"\u07db\u07df\u07e4\u07ea\u07ed\u07f2\u07f6\u07fa\u07fc\u0801\u0808\u080c"+
		"\u0815\u081e\u0825\u082a\u082f\u0834\u083a\u083e\u0843\u0846\u084a\u084e"+
		"\u0852";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}