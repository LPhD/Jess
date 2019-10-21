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
		T__52=53, T__53=54, T__54=55, T__55=56, IF=57, ELSE=58, FOR=59, WHILE=60, 
		BREAK=61, CASE=62, CONTINUE=63, SWITCH=64, DO=65, GOTO=66, RETURN=67, 
		TYPEDEF=68, VOID=69, UNSIGNED=70, SIGNED=71, LONG=72, CV_QUALIFIER=73, 
		VIRTUAL=74, TRY=75, CATCH=76, THROW=77, USING=78, NAMESPACE=79, AUTO=80, 
		REGISTER=81, PRE_IF=82, PRE_ELIF=83, PRE_ELSE=84, PRE_ENDIF=85, PRE_DEFINE=86, 
		PRE_UNDEF=87, PRE_DIAGNOSTIC=88, PRE_OTHER=89, PRE_INCLUDE=90, PRE_INCLUDE_NEXT=91, 
		PRE_LINE=92, PRE_PRAGMA=93, PRE_GCC=94, PRE_PRAGMA_KEYWORDS=95, PRE_STR=96, 
		OPERATOR=97, TEMPLATE=98, NEW=99, CLASS_KEY=100, ALPHA_NUMERIC=101, OPENING_CURLY=102, 
		CLOSING_CURLY=103, HEX_LITERAL=104, DECIMAL_LITERAL=105, OCTAL_LITERAL=106, 
		FLOATING_POINT_LITERAL=107, COMMENT=108, CHAR=109, STRING=110, NEWLINE=111, 
		ESCAPE=112, WHITESPACE=113, ELLIPSIS=114, OTHER=115;
	public static final int
		RULE_statements = 0, RULE_statement = 1, RULE_opening_curly = 2, RULE_closing_curly = 3, 
		RULE_block_starter = 4, RULE_selection_or_iteration = 5, RULE_for_init_statement = 6, 
		RULE_jump_statement = 7, RULE_label = 8, RULE_expr_statement = 9, RULE_condition = 10, 
		RULE_pre_statement = 11, RULE_pre_blockstarter = 12, RULE_pre_if_statement = 13, 
		RULE_pre_elif_statement = 14, RULE_pre_else_statement = 15, RULE_pre_endif_statement = 16, 
		RULE_pre_if_condition = 17, RULE_pre_command = 18, RULE_pre_define = 19, 
		RULE_pre_undef = 20, RULE_pre_macro_identifier = 21, RULE_pre_macro_parameters = 22, 
		RULE_pre_macro = 23, RULE_pre_diagnostic = 24, RULE_pre_other = 25, RULE_pre_include = 26, 
		RULE_pre_include_next = 27, RULE_pre_include_system_header = 28, RULE_pre_include_local_file = 29, 
		RULE_pre_include_filename = 30, RULE_pre_line = 31, RULE_pre_pragma = 32, 
		RULE_comment = 33, RULE_unary_operator = 34, RULE_relational_operator = 35, 
		RULE_constant = 36, RULE_function_decl_specifiers = 37, RULE_ptr_operator = 38, 
		RULE_access_specifier = 39, RULE_operator = 40, RULE_assignment_operator = 41, 
		RULE_equality_operator = 42, RULE_template_decl_start = 43, RULE_template_param_list = 44, 
		RULE_newline = 45, RULE_no_brackets = 46, RULE_no_brackets_curlies_or_squares = 47, 
		RULE_no_brackets_or_semicolon = 48, RULE_no_angle_brackets_or_brackets = 49, 
		RULE_no_curlies = 50, RULE_no_squares = 51, RULE_no_squares_or_semicolon = 52, 
		RULE_no_comma_or_semicolon = 53, RULE_assign_water = 54, RULE_assign_water_l2 = 55, 
		RULE_water = 56, RULE_expr = 57, RULE_assign_expr = 58, RULE_conditional_expression = 59, 
		RULE_or_expression = 60, RULE_and_expression = 61, RULE_inclusive_or_expression = 62, 
		RULE_exclusive_or_expression = 63, RULE_bit_and_expression = 64, RULE_equality_expression = 65, 
		RULE_relational_expression = 66, RULE_shift_expression = 67, RULE_additive_expression = 68, 
		RULE_multiplicative_expression = 69, RULE_cast_expression = 70, RULE_cast_target = 71, 
		RULE_unary_expression = 72, RULE_new_expression = 73, RULE_unary_op_and_cast_expr = 74, 
		RULE_sizeof_expression = 75, RULE_sizeof = 76, RULE_defined_expression = 77, 
		RULE_sizeof_operand = 78, RULE_sizeof_operand2 = 79, RULE_inc_dec = 80, 
		RULE_postfix_expression = 81, RULE_function_argument_list = 82, RULE_function_argument = 83, 
		RULE_primary_expression = 84, RULE_init_declarator = 85, RULE_declarator = 86, 
		RULE_type_suffix = 87, RULE_simple_decl = 88, RULE_var_decl = 89, RULE_init_declarator_list = 90, 
		RULE_initializer = 91, RULE_initializer_list = 92, RULE_class_def = 93, 
		RULE_class_name = 94, RULE_base_classes = 95, RULE_base_class = 96, RULE_type_name = 97, 
		RULE_base_type = 98, RULE_param_decl_specifiers = 99, RULE_parameter_name = 100, 
		RULE_param_type_list = 101, RULE_param_type = 102, RULE_param_type_id = 103, 
		RULE_identifier = 104, RULE_number = 105, RULE_ptrs = 106, RULE_func_ptrs = 107;
	public static final String[] ruleNames = {
		"statements", "statement", "opening_curly", "closing_curly", "block_starter", 
		"selection_or_iteration", "for_init_statement", "jump_statement", "label", 
		"expr_statement", "condition", "pre_statement", "pre_blockstarter", "pre_if_statement", 
		"pre_elif_statement", "pre_else_statement", "pre_endif_statement", "pre_if_condition", 
		"pre_command", "pre_define", "pre_undef", "pre_macro_identifier", "pre_macro_parameters", 
		"pre_macro", "pre_diagnostic", "pre_other", "pre_include", "pre_include_next", 
		"pre_include_system_header", "pre_include_local_file", "pre_include_filename", 
		"pre_line", "pre_pragma", "comment", "unary_operator", "relational_operator", 
		"constant", "function_decl_specifiers", "ptr_operator", "access_specifier", 
		"operator", "assignment_operator", "equality_operator", "template_decl_start", 
		"template_param_list", "newline", "no_brackets", "no_brackets_curlies_or_squares", 
		"no_brackets_or_semicolon", "no_angle_brackets_or_brackets", "no_curlies", 
		"no_squares", "no_squares_or_semicolon", "no_comma_or_semicolon", "assign_water", 
		"assign_water_l2", "water", "expr", "assign_expr", "conditional_expression", 
		"or_expression", "and_expression", "inclusive_or_expression", "exclusive_or_expression", 
		"bit_and_expression", "equality_expression", "relational_expression", 
		"shift_expression", "additive_expression", "multiplicative_expression", 
		"cast_expression", "cast_target", "unary_expression", "new_expression", 
		"unary_op_and_cast_expr", "sizeof_expression", "sizeof", "defined_expression", 
		"sizeof_operand", "sizeof_operand2", "inc_dec", "postfix_expression", 
		"function_argument_list", "function_argument", "primary_expression", "init_declarator", 
		"declarator", "type_suffix", "simple_decl", "var_decl", "init_declarator_list", 
		"initializer", "initializer_list", "class_def", "class_name", "base_classes", 
		"base_class", "type_name", "base_type", "param_decl_specifiers", "parameter_name", 
		"param_type_list", "param_type", "param_type_id", "identifier", "number", 
		"ptrs", "func_ptrs"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "';'", "':'", "'='", "','", "'<'", "'>'", "'.'", "'-'", 
		"'/'", "'&'", "'*'", "'+'", "'~'", "'!'", "'<='", "'>='", "'inline'", 
		"'explicit'", "'friend'", "'static'", "'public'", "'private'", "'protected'", 
		"'delete'", "'['", "']'", "'%'", "'^'", "'|'", "'+='", "'-='", "'*='", 
		"'/='", "'%='", "'^='", "'&='", "'|='", "'>>'", "'<<'", "'>>='", "'<<='", 
		"'=='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'->*'", "'->'", "'?'", 
		"'::'", "'sizeof'", "'defined'", "'restrict'", "'if'", "'else'", "'for'", 
		"'while'", "'break'", "'case'", "'continue'", "'switch'", "'do'", "'goto'", 
		"'return'", "'typedef'", "'void'", "'unsigned'", "'signed'", "'long'", 
		null, "'virtual'", "'try'", "'catch'", "'throw'", "'using'", "'namespace'", 
		"'auto'", "'register'", null, null, null, null, null, null, null, null, 
		null, null, null, null, "'GCC'", null, null, "'operator'", "'template'", 
		"'new'", null, null, "'{'", "'}'", null, null, null, null, null, null, 
		null, null, "'\\'", null, "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "IF", "ELSE", "FOR", 
		"WHILE", "BREAK", "CASE", "CONTINUE", "SWITCH", "DO", "GOTO", "RETURN", 
		"TYPEDEF", "VOID", "UNSIGNED", "SIGNED", "LONG", "CV_QUALIFIER", "VIRTUAL", 
		"TRY", "CATCH", "THROW", "USING", "NAMESPACE", "AUTO", "REGISTER", "PRE_IF", 
		"PRE_ELIF", "PRE_ELSE", "PRE_ENDIF", "PRE_DEFINE", "PRE_UNDEF", "PRE_DIAGNOSTIC", 
		"PRE_OTHER", "PRE_INCLUDE", "PRE_INCLUDE_NEXT", "PRE_LINE", "PRE_PRAGMA", 
		"PRE_GCC", "PRE_PRAGMA_KEYWORDS", "PRE_STR", "OPERATOR", "TEMPLATE", "NEW", 
		"CLASS_KEY", "ALPHA_NUMERIC", "OPENING_CURLY", "CLOSING_CURLY", "HEX_LITERAL", 
		"DECIMAL_LITERAL", "OCTAL_LITERAL", "FLOATING_POINT_LITERAL", "COMMENT", 
		"CHAR", "STRING", "NEWLINE", "ESCAPE", "WHITESPACE", "ELLIPSIS", "OTHER"
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
	             System.out.println("New t: "+t);                 
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
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(216);
				statement();
				}
				}
				setState(221);
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
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				opening_curly();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				closing_curly();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				pre_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
				block_starter();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(226);
				jump_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(227);
				label();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(228);
				simple_decl();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(229);
				expr_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(230);
				comment();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(231);
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
			setState(234);
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
			setState(236);
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
			setState(238);
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
			setState(284);
			switch (_input.LA(1)) {
			case TRY:
				_localctx = new Try_statementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				match(TRY);
				}
				break;
			case CATCH:
				_localctx = new Catch_statementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(CATCH);
				setState(242);
				match(T__0);
				setState(245);
				switch (_input.LA(1)) {
				case VOID:
				case UNSIGNED:
				case SIGNED:
				case LONG:
				case CV_QUALIFIER:
				case AUTO:
				case REGISTER:
				case CLASS_KEY:
				case ALPHA_NUMERIC:
					{
					setState(243);
					param_type();
					}
					break;
				case ELLIPSIS:
					{
					setState(244);
					match(ELLIPSIS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(247);
				match(T__1);
				}
				break;
			case IF:
				_localctx = new If_statementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				match(IF);
				setState(249);
				match(T__0);
				setState(250);
				condition();
				setState(251);
				match(T__1);
				}
				break;
			case ELSE:
				_localctx = new Else_statementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				match(ELSE);
				}
				break;
			case SWITCH:
				_localctx = new Switch_statementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(254);
				match(SWITCH);
				setState(255);
				match(T__0);
				setState(256);
				condition();
				setState(257);
				match(T__1);
				}
				break;
			case FOR:
				_localctx = new For_statementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(259);
				match(FOR);
				setState(260);
				match(T__0);
				setState(263);
				switch (_input.LA(1)) {
				case T__0:
				case T__9:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__22:
				case T__23:
				case T__24:
				case T__47:
				case T__48:
				case T__52:
				case T__53:
				case T__54:
				case TYPEDEF:
				case VOID:
				case UNSIGNED:
				case SIGNED:
				case LONG:
				case CV_QUALIFIER:
				case TEMPLATE:
				case NEW:
				case CLASS_KEY:
				case ALPHA_NUMERIC:
				case HEX_LITERAL:
				case DECIMAL_LITERAL:
				case OCTAL_LITERAL:
				case FLOATING_POINT_LITERAL:
				case CHAR:
				case STRING:
					{
					setState(261);
					for_init_statement();
					}
					break;
				case T__2:
					{
					setState(262);
					match(T__2);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(266);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (VOID - 69)) | (1L << (UNSIGNED - 69)) | (1L << (SIGNED - 69)) | (1L << (LONG - 69)) | (1L << (CV_QUALIFIER - 69)) | (1L << (NEW - 69)) | (1L << (CLASS_KEY - 69)) | (1L << (ALPHA_NUMERIC - 69)) | (1L << (HEX_LITERAL - 69)) | (1L << (DECIMAL_LITERAL - 69)) | (1L << (OCTAL_LITERAL - 69)) | (1L << (FLOATING_POINT_LITERAL - 69)) | (1L << (CHAR - 69)) | (1L << (STRING - 69)))) != 0)) {
					{
					setState(265);
					condition();
					}
				}

				setState(268);
				match(T__2);
				setState(270);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (NEW - 99)) | (1L << (ALPHA_NUMERIC - 99)) | (1L << (HEX_LITERAL - 99)) | (1L << (DECIMAL_LITERAL - 99)) | (1L << (OCTAL_LITERAL - 99)) | (1L << (FLOATING_POINT_LITERAL - 99)) | (1L << (CHAR - 99)) | (1L << (STRING - 99)))) != 0)) {
					{
					setState(269);
					expr();
					}
				}

				setState(272);
				match(T__1);
				setState(274);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(273);
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
				setState(276);
				match(DO);
				}
				break;
			case WHILE:
				_localctx = new While_statementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(277);
				match(WHILE);
				setState(278);
				match(T__0);
				setState(279);
				condition();
				setState(280);
				match(T__1);
				setState(282);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(281);
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
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				simple_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				expr();
				setState(288);
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
			setState(310);
			switch (_input.LA(1)) {
			case BREAK:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(BREAK);
				setState(293);
				match(T__2);
				}
				break;
			case CONTINUE:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				match(CONTINUE);
				setState(295);
				match(T__2);
				}
				break;
			case GOTO:
				_localctx = new GotoStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				match(GOTO);
				setState(297);
				identifier();
				setState(298);
				match(T__2);
				}
				break;
			case RETURN:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				match(RETURN);
				setState(302);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (NEW - 99)) | (1L << (ALPHA_NUMERIC - 99)) | (1L << (HEX_LITERAL - 99)) | (1L << (DECIMAL_LITERAL - 99)) | (1L << (OCTAL_LITERAL - 99)) | (1L << (FLOATING_POINT_LITERAL - 99)) | (1L << (CHAR - 99)) | (1L << (STRING - 99)))) != 0)) {
					{
					setState(301);
					expr();
					}
				}

				setState(304);
				match(T__2);
				}
				break;
			case THROW:
				_localctx = new ThrowStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(305);
				match(THROW);
				setState(307);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (NEW - 99)) | (1L << (ALPHA_NUMERIC - 99)) | (1L << (HEX_LITERAL - 99)) | (1L << (DECIMAL_LITERAL - 99)) | (1L << (OCTAL_LITERAL - 99)) | (1L << (FLOATING_POINT_LITERAL - 99)) | (1L << (CHAR - 99)) | (1L << (STRING - 99)))) != 0)) {
					{
					setState(306);
					expr();
					}
				}

				setState(309);
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
			setState(313);
			_la = _input.LA(1);
			if (_la==CASE) {
				{
				setState(312);
				match(CASE);
				}
			}

			setState(318);
			switch (_input.LA(1)) {
			case T__22:
			case T__23:
			case T__24:
			case ALPHA_NUMERIC:
				{
				setState(315);
				identifier();
				}
				break;
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
				{
				setState(316);
				number();
				}
				break;
			case CHAR:
				{
				setState(317);
				match(CHAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(320);
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
			setState(323);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (NEW - 99)) | (1L << (ALPHA_NUMERIC - 99)) | (1L << (HEX_LITERAL - 99)) | (1L << (DECIMAL_LITERAL - 99)) | (1L << (OCTAL_LITERAL - 99)) | (1L << (FLOATING_POINT_LITERAL - 99)) | (1L << (CHAR - 99)) | (1L << (STRING - 99)))) != 0)) {
				{
				setState(322);
				expr();
				}
			}

			setState(325);
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
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				type_name();
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(329);
					match(NEWLINE);
					}
					}
					setState(334);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(335);
				declarator();
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(336);
					match(NEWLINE);
					}
					}
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(342);
				match(T__4);
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(343);
					match(NEWLINE);
					}
					}
					setState(348);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(349);
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
			setState(355);
			switch (_input.LA(1)) {
			case PRE_IF:
			case PRE_ELIF:
			case PRE_ELSE:
			case PRE_ENDIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
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
				setState(354);
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
			setState(361);
			switch (_input.LA(1)) {
			case PRE_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				pre_if_statement();
				}
				break;
			case PRE_ELIF:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				pre_elif_statement();
				}
				break;
			case PRE_ELSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				pre_else_statement();
				}
				break;
			case PRE_ENDIF:
				enterOuterAlt(_localctx, 4);
				{
				setState(360);
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
			setState(363);
			match(PRE_IF);
			setState(364);
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
			setState(367);
			match(PRE_ELIF);
			setState(368);
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
			setState(371);
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
			setState(373);
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
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				match(T__0);
				setState(377);
				condition();
				setState(378);
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
			setState(390);
			switch (_input.LA(1)) {
			case PRE_DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				pre_define();
				}
				break;
			case PRE_UNDEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				pre_undef();
				}
				break;
			case PRE_DIAGNOSTIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(384);
				pre_diagnostic();
				}
				break;
			case PRE_OTHER:
				enterOuterAlt(_localctx, 4);
				{
				setState(385);
				pre_other();
				}
				break;
			case PRE_INCLUDE:
				enterOuterAlt(_localctx, 5);
				{
				setState(386);
				pre_include();
				}
				break;
			case PRE_INCLUDE_NEXT:
				enterOuterAlt(_localctx, 6);
				{
				setState(387);
				pre_include_next();
				}
				break;
			case PRE_LINE:
				enterOuterAlt(_localctx, 7);
				{
				setState(388);
				pre_line();
				}
				break;
			case PRE_PRAGMA:
				enterOuterAlt(_localctx, 8);
				{
				setState(389);
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
			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				match(PRE_DEFINE);
				setState(393);
				pre_macro_identifier();
				setState(394);
				match(T__0);
				setState(395);
				pre_macro_parameters();
				setState(396);
				match(T__1);
				setState(397);
				pre_macro();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				match(PRE_DEFINE);
				setState(400);
				pre_macro_identifier();
				setState(401);
				pre_macro();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(403);
				match(PRE_DEFINE);
				setState(404);
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
			setState(407);
			match(PRE_UNDEF);
			setState(408);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
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
		enterRule(_localctx, 44, RULE_pre_macro_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			switch (_input.LA(1)) {
			case T__22:
			case T__23:
			case T__24:
			case ALPHA_NUMERIC:
				{
				setState(412);
				identifier();
				}
				break;
			case ELLIPSIS:
				{
				setState(413);
				match(ELLIPSIS);
				}
				break;
			case T__1:
			case T__5:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(416);
				match(T__5);
				setState(419);
				switch (_input.LA(1)) {
				case T__22:
				case T__23:
				case T__24:
				case ALPHA_NUMERIC:
					{
					setState(417);
					identifier();
					}
					break;
				case ELLIPSIS:
					{
					setState(418);
					match(ELLIPSIS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(425);
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
		enterRule(_localctx, 46, RULE_pre_macro);
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
		enterRule(_localctx, 48, RULE_pre_diagnostic);
		try {
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				match(PRE_DIAGNOSTIC);
				setState(429);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
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
		enterRule(_localctx, 50, RULE_pre_other);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(PRE_OTHER);
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(434);
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
		enterRule(_localctx, 52, RULE_pre_include);
		try {
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				match(PRE_INCLUDE);
				setState(438);
				pre_include_system_header();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
				match(PRE_INCLUDE);
				setState(440);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				match(PRE_INCLUDE);
				setState(442);
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
		enterRule(_localctx, 54, RULE_pre_include_next);
		try {
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				match(PRE_INCLUDE_NEXT);
				setState(446);
				pre_include_system_header();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				match(PRE_INCLUDE_NEXT);
				setState(448);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(449);
				match(PRE_INCLUDE_NEXT);
				setState(450);
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
		enterRule(_localctx, 56, RULE_pre_include_system_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(T__6);
			setState(454);
			pre_include_filename();
			setState(455);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 58, RULE_pre_include_local_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
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
		enterRule(_localctx, 60, RULE_pre_include_filename);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(459);
				match(STRING);
				}
				break;
			case T__8:
			case T__9:
			case T__10:
			case ALPHA_NUMERIC:
				{
				setState(461); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(460);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || _la==ALPHA_NUMERIC) ) {
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
					setState(463); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		enterRule(_localctx, 62, RULE_pre_line);
		try {
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				match(PRE_LINE);
				setState(468);
				match(DECIMAL_LITERAL);
				setState(469);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				match(PRE_LINE);
				setState(471);
				match(DECIMAL_LITERAL);
				setState(472);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(473);
				match(PRE_LINE);
				setState(474);
				pre_macro_identifier();
				setState(475);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(477);
				match(PRE_LINE);
				setState(478);
				pre_macro_identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(479);
				match(PRE_LINE);
				setState(480);
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
		enterRule(_localctx, 64, RULE_pre_pragma);
		int _la;
		try {
			int _alt;
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				match(PRE_PRAGMA);
				setState(485);
				_la = _input.LA(1);
				if (_la==PRE_GCC) {
					{
					setState(484);
					match(PRE_GCC);
					}
				}

				setState(487);
				match(PRE_PRAGMA_KEYWORDS);
				setState(488);
				match(STRING);
				 preProcFindMacroEnd(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				match(PRE_PRAGMA);
				setState(492);
				_la = _input.LA(1);
				if (_la==PRE_GCC) {
					{
					setState(491);
					match(PRE_GCC);
					}
				}

				setState(494);
				match(PRE_PRAGMA_KEYWORDS);
				setState(496); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(495);
						identifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(498); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(500);
				match(PRE_PRAGMA);
				setState(502);
				_la = _input.LA(1);
				if (_la==PRE_GCC) {
					{
					setState(501);
					match(PRE_GCC);
					}
				}

				setState(504);
				match(PRE_PRAGMA_KEYWORDS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(505);
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
		enterRule(_localctx, 66, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
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
		enterRule(_localctx, 68, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
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
		enterRule(_localctx, 70, RULE_relational_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__16) | (1L << T__17))) != 0)) ) {
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
		enterRule(_localctx, 72, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			_la = _input.LA(1);
			if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (HEX_LITERAL - 104)) | (1L << (DECIMAL_LITERAL - 104)) | (1L << (OCTAL_LITERAL - 104)) | (1L << (FLOATING_POINT_LITERAL - 104)) | (1L << (CHAR - 104)) | (1L << (STRING - 104)))) != 0)) ) {
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
		enterRule(_localctx, 74, RULE_function_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			_la = _input.LA(1);
			if ( !(((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (T__18 - 19)) | (1L << (T__19 - 19)) | (1L << (T__20 - 19)) | (1L << (T__21 - 19)) | (1L << (VIRTUAL - 19)))) != 0)) ) {
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
		enterRule(_localctx, 76, RULE_ptr_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__12) ) {
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
		enterRule(_localctx, 78, RULE_access_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
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
		enterRule(_localctx, 80, RULE_operator);
		int _la;
		try {
			setState(568);
			switch (_input.LA(1)) {
			case T__25:
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(523);
				_la = _input.LA(1);
				if ( !(_la==T__25 || _la==NEW) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(526);
				_la = _input.LA(1);
				if (_la==T__26) {
					{
					setState(524);
					match(T__26);
					setState(525);
					match(T__27);
					}
				}

				}
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				match(T__13);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(529);
				match(T__9);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(530);
				match(T__12);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(531);
				match(T__10);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 6);
				{
				setState(532);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 7);
				{
				setState(533);
				match(T__29);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 8);
				{
				setState(534);
				match(T__11);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 9);
				{
				setState(535);
				match(T__30);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 10);
				{
				setState(536);
				match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 11);
				{
				setState(537);
				match(T__15);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 12);
				{
				setState(538);
				match(T__4);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 13);
				{
				setState(539);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 14);
				{
				setState(540);
				match(T__7);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 15);
				{
				setState(541);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 16);
				{
				setState(542);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 17);
				{
				setState(543);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 18);
				{
				setState(544);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 19);
				{
				setState(545);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 20);
				{
				setState(546);
				match(T__36);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 21);
				{
				setState(547);
				match(T__37);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 22);
				{
				setState(548);
				match(T__38);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 23);
				{
				setState(549);
				match(T__39);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 24);
				{
				setState(550);
				match(T__40);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 25);
				{
				setState(551);
				match(T__41);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 26);
				{
				setState(552);
				match(T__42);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 27);
				{
				setState(553);
				match(T__43);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 28);
				{
				setState(554);
				match(T__44);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 29);
				{
				setState(555);
				match(T__16);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 30);
				{
				setState(556);
				match(T__17);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 31);
				{
				setState(557);
				match(T__45);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 32);
				{
				setState(558);
				match(T__46);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 33);
				{
				setState(559);
				match(T__47);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 34);
				{
				setState(560);
				match(T__48);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 35);
				{
				setState(561);
				match(T__5);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 36);
				{
				setState(562);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 37);
				{
				setState(563);
				match(T__50);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 38);
				{
				setState(564);
				match(T__0);
				setState(565);
				match(T__1);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 39);
				{
				setState(566);
				match(T__26);
				setState(567);
				match(T__27);
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
		enterRule(_localctx, 82, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__41) | (1L << T__42))) != 0)) ) {
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
		enterRule(_localctx, 84, RULE_equality_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
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
		enterRule(_localctx, 86, RULE_template_decl_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(TEMPLATE);
			setState(575);
			match(T__6);
			setState(576);
			template_param_list();
			setState(577);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 88, RULE_template_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(588);
				switch (_input.LA(1)) {
				case T__6:
					{
					{
					setState(579);
					match(T__6);
					setState(580);
					template_param_list();
					setState(581);
					match(T__7);
					}
					}
					break;
				case T__0:
					{
					{
					setState(583);
					match(T__0);
					setState(584);
					template_param_list();
					setState(585);
					match(T__1);
					}
					}
					break;
				case T__2:
				case T__3:
				case T__4:
				case T__5:
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
				case T__55:
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
					setState(587);
					no_angle_brackets_or_brackets();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(590); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 90, RULE_newline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
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
		enterRule(_localctx, 92, RULE_no_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
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
		enterRule(_localctx, 94, RULE_no_brackets_curlies_or_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__26) | (1L << T__27))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
		enterRule(_localctx, 96, RULE_no_brackets_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
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
		enterRule(_localctx, 98, RULE_no_angle_brackets_or_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__6) | (1L << T__7))) != 0)) ) {
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
		enterRule(_localctx, 100, RULE_no_curlies);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
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
		enterRule(_localctx, 102, RULE_no_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__26 || _la==T__27) ) {
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
		enterRule(_localctx, 104, RULE_no_squares_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__26) | (1L << T__27))) != 0)) ) {
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
		enterRule(_localctx, 106, RULE_no_comma_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__2 || _la==T__5) ) {
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
		enterRule(_localctx, 108, RULE_assign_water);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__26) | (1L << T__27))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
		enterRule(_localctx, 110, RULE_assign_water_l2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__26) | (1L << T__27))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
		enterRule(_localctx, 112, RULE_water);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
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
		enterRule(_localctx, 114, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			assign_expr();
			setState(621);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(617);
					match(ESCAPE);
					setState(618);
					match(NEWLINE);
					}
					} 
				}
				setState(623);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(624);
					match(NEWLINE);
					}
					}
					setState(629);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(630);
				match(T__5);
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(631);
					match(NEWLINE);
					}
					}
					setState(636);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(637);
				expr();
				}
				break;
			}
			setState(644);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(640);
					match(ESCAPE);
					setState(641);
					match(NEWLINE);
					}
					} 
				}
				setState(646);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 116, RULE_assign_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			conditional_expression();
			setState(663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(648);
					match(NEWLINE);
					}
					}
					setState(653);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(654);
				assignment_operator();
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(655);
					match(NEWLINE);
					}
					}
					setState(660);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(661);
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
		enterRule(_localctx, 118, RULE_conditional_expression);
		int _la;
		try {
			setState(696);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				_localctx = new NormOrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(665);
				or_expression();
				}
				break;
			case 2:
				_localctx = new CndExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(666);
				or_expression();
				{
				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(667);
					match(NEWLINE);
					}
					}
					setState(672);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(673);
				match(T__51);
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(674);
					match(NEWLINE);
					}
					}
					setState(679);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(680);
				expr();
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(681);
					match(NEWLINE);
					}
					}
					setState(686);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(687);
				match(T__3);
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(688);
					match(NEWLINE);
					}
					}
					setState(693);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(694);
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
		enterRule(_localctx, 120, RULE_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			and_expression();
			setState(713);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(699);
					match(NEWLINE);
					}
					}
					setState(704);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(705);
				match(T__46);
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(706);
					match(NEWLINE);
					}
					}
					setState(711);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(712);
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
		enterRule(_localctx, 122, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			inclusive_or_expression();
			setState(730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(719);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(716);
					match(NEWLINE);
					}
					}
					setState(721);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(722);
				match(T__45);
				setState(726);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(723);
					match(NEWLINE);
					}
					}
					setState(728);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(729);
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
		enterRule(_localctx, 124, RULE_inclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			exclusive_or_expression();
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(733);
					match(NEWLINE);
					}
					}
					setState(738);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(739);
				match(T__30);
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(740);
					match(NEWLINE);
					}
					}
					setState(745);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(746);
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
		enterRule(_localctx, 126, RULE_exclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			bit_and_expression();
			setState(764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(750);
					match(NEWLINE);
					}
					}
					setState(755);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(756);
				match(T__29);
				setState(760);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(757);
					match(NEWLINE);
					}
					}
					setState(762);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(763);
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
		enterRule(_localctx, 128, RULE_bit_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			equality_expression();
			setState(781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(767);
					match(NEWLINE);
					}
					}
					setState(772);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(773);
				match(T__11);
				setState(777);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(774);
					match(NEWLINE);
					}
					}
					setState(779);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(780);
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
		enterRule(_localctx, 130, RULE_equality_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			relational_expression();
			setState(799);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(784);
					match(NEWLINE);
					}
					}
					setState(789);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(790);
				equality_operator();
				setState(794);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(791);
					match(NEWLINE);
					}
					}
					setState(796);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(797);
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
		enterRule(_localctx, 132, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			shift_expression();
			setState(817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(802);
					match(NEWLINE);
					}
					}
					setState(807);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(808);
				relational_operator();
				setState(812);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(809);
					match(NEWLINE);
					}
					}
					setState(814);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(815);
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
		enterRule(_localctx, 134, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			additive_expression();
			setState(834);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(823);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(820);
					match(NEWLINE);
					}
					}
					setState(825);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(826);
				_la = _input.LA(1);
				if ( !(_la==T__39 || _la==T__40) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(827);
					match(NEWLINE);
					}
					}
					setState(832);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(833);
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
		enterRule(_localctx, 136, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			multiplicative_expression();
			setState(851);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(840);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(837);
					match(NEWLINE);
					}
					}
					setState(842);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(843);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__13) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(847);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(844);
					match(NEWLINE);
					}
					}
					setState(849);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(850);
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
		enterRule(_localctx, 138, RULE_multiplicative_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			cast_expression();
			setState(868);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(857);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(854);
					match(NEWLINE);
					}
					}
					setState(859);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(860);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__12) | (1L << T__28))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(864);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(861);
					match(NEWLINE);
					}
					}
					setState(866);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(867);
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
		enterRule(_localctx, 140, RULE_cast_expression);
		try {
			setState(876);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(870);
				match(T__0);
				setState(871);
				cast_target();
				setState(872);
				match(T__1);
				setState(873);
				cast_expression();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(875);
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
		enterRule(_localctx, 142, RULE_cast_target);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			type_name();
			setState(888);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11 || _la==T__12 || _la==NEWLINE) {
				{
				{
				setState(882);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(879);
					match(NEWLINE);
					}
					}
					setState(884);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(885);
				ptr_operator();
				}
				}
				setState(890);
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
		enterRule(_localctx, 144, RULE_unary_expression);
		try {
			setState(896);
			switch (_input.LA(1)) {
			case T__9:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(891);
				unary_op_and_cast_expr();
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 2);
				{
				setState(892);
				sizeof_expression();
				}
				break;
			case T__52:
			case NEW:
				enterOuterAlt(_localctx, 3);
				{
				setState(893);
				new_expression();
				}
				break;
			case T__0:
			case T__22:
			case T__23:
			case T__24:
			case T__47:
			case T__48:
			case ALPHA_NUMERIC:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(894);
				postfix_expression(0);
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 5);
				{
				setState(895);
				defined_expression();
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
		enterRule(_localctx, 146, RULE_new_expression);
		int _la;
		try {
			setState(944);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(899);
				_la = _input.LA(1);
				if (_la==T__52) {
					{
					setState(898);
					match(T__52);
					}
				}

				setState(901);
				match(NEW);
				setState(905);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(902);
					match(NEWLINE);
					}
					}
					setState(907);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(908);
				type_name();
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(909);
					match(NEWLINE);
					}
					}
					setState(914);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(915);
				match(T__26);
				setState(917);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (NEW - 99)) | (1L << (ALPHA_NUMERIC - 99)) | (1L << (HEX_LITERAL - 99)) | (1L << (DECIMAL_LITERAL - 99)) | (1L << (OCTAL_LITERAL - 99)) | (1L << (FLOATING_POINT_LITERAL - 99)) | (1L << (CHAR - 99)) | (1L << (STRING - 99)))) != 0)) {
					{
					setState(916);
					conditional_expression();
					}
				}

				setState(919);
				match(T__27);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(922);
				_la = _input.LA(1);
				if (_la==T__52) {
					{
					setState(921);
					match(T__52);
					}
				}

				setState(924);
				match(NEW);
				setState(928);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(925);
					match(NEWLINE);
					}
					}
					setState(930);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(931);
				type_name();
				setState(935);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(932);
					match(NEWLINE);
					}
					}
					setState(937);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(938);
				match(T__0);
				setState(940);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (NEW - 99)) | (1L << (ALPHA_NUMERIC - 99)) | (1L << (HEX_LITERAL - 99)) | (1L << (DECIMAL_LITERAL - 99)) | (1L << (OCTAL_LITERAL - 99)) | (1L << (FLOATING_POINT_LITERAL - 99)) | (1L << (CHAR - 99)) | (1L << (STRING - 99)))) != 0)) {
					{
					setState(939);
					expr();
					}
				}

				setState(942);
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
		enterRule(_localctx, 148, RULE_unary_op_and_cast_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			unary_operator();
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
			setState(953);
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
		enterRule(_localctx, 150, RULE_sizeof_expression);
		int _la;
		try {
			setState(975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(955);
				sizeof();
				setState(959);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(956);
					match(NEWLINE);
					}
					}
					setState(961);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(962);
				match(T__0);
				setState(963);
				sizeof_operand();
				setState(964);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(966);
				sizeof();
				setState(970);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(967);
					match(NEWLINE);
					}
					}
					setState(972);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(973);
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
		enterRule(_localctx, 152, RULE_sizeof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(977);
			match(T__53);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 154, RULE_defined_expression);
		int _la;
		try {
			setState(998);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(979);
				match(T__54);
				setState(983);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(980);
					match(NEWLINE);
					}
					}
					setState(985);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(986);
				match(T__0);
				setState(987);
				expr();
				setState(988);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(990);
				match(T__54);
				setState(994);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(991);
					match(NEWLINE);
					}
					}
					setState(996);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(997);
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
		enterRule(_localctx, 156, RULE_sizeof_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			type_name();
			setState(1010);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11 || _la==T__12 || _la==NEWLINE) {
				{
				{
				setState(1004);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1001);
					match(NEWLINE);
					}
					}
					setState(1006);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1007);
				ptr_operator();
				}
				}
				setState(1012);
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
		enterRule(_localctx, 158, RULE_sizeof_operand2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013);
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
		enterRule(_localctx, 160, RULE_inc_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
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
		int _startState = 162;
		enterRecursionRule(_localctx, 162, RULE_postfix_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			switch (_input.LA(1)) {
			case T__0:
			case T__22:
			case T__23:
			case T__24:
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

				setState(1018);
				primary_expression();
				}
				break;
			case T__47:
			case T__48:
				{
				_localctx = new IncDecOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1019);
				inc_dec();
				setState(1023);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1020);
					match(NEWLINE);
					}
					}
					setState(1025);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1026);
				primary_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1086);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1084);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayIndexingContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1030);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1034);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(1031);
							match(NEWLINE);
							}
							}
							setState(1036);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1037);
						match(T__26);
						setState(1038);
						expr();
						setState(1039);
						match(T__27);
						}
						break;
					case 2:
						{
						_localctx = new FuncCallContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1041);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1045);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(1042);
							match(NEWLINE);
							}
							}
							setState(1047);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1048);
						match(T__0);
						setState(1049);
						function_argument_list();
						setState(1050);
						match(T__1);
						}
						break;
					case 3:
						{
						_localctx = new MemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1052);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1053);
						match(T__8);
						setState(1057);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(1054);
							match(NEWLINE);
							}
							}
							setState(1059);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1061);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(1060);
							match(TEMPLATE);
							}
						}

						{
						setState(1063);
						identifier();
						}
						}
						break;
					case 4:
						{
						_localctx = new PtrMemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1064);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1065);
						match(T__50);
						setState(1069);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(1066);
							match(NEWLINE);
							}
							}
							setState(1071);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1073);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(1072);
							match(TEMPLATE);
							}
						}

						{
						setState(1075);
						identifier();
						}
						}
						break;
					case 5:
						{
						_localctx = new IncDecOpContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1076);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1080);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(1077);
							match(NEWLINE);
							}
							}
							setState(1082);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1083);
						inc_dec();
						}
						break;
					}
					} 
				}
				setState(1088);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
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
		enterRule(_localctx, 164, RULE_function_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1111);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (NEW - 99)) | (1L << (ALPHA_NUMERIC - 99)) | (1L << (HEX_LITERAL - 99)) | (1L << (DECIMAL_LITERAL - 99)) | (1L << (OCTAL_LITERAL - 99)) | (1L << (FLOATING_POINT_LITERAL - 99)) | (1L << (CHAR - 99)) | (1L << (STRING - 99)))) != 0)) {
				{
				setState(1090); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1089);
					function_argument();
					}
					}
					setState(1092); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (NEW - 99)) | (1L << (ALPHA_NUMERIC - 99)) | (1L << (HEX_LITERAL - 99)) | (1L << (DECIMAL_LITERAL - 99)) | (1L << (OCTAL_LITERAL - 99)) | (1L << (FLOATING_POINT_LITERAL - 99)) | (1L << (CHAR - 99)) | (1L << (STRING - 99)))) != 0) );
				setState(1108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(1094);
					match(T__5);
					setState(1098);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(1095);
						match(NEWLINE);
						}
						}
						setState(1100);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1102); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1101);
						function_argument();
						}
						}
						setState(1104); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (NEW - 99)) | (1L << (ALPHA_NUMERIC - 99)) | (1L << (HEX_LITERAL - 99)) | (1L << (DECIMAL_LITERAL - 99)) | (1L << (OCTAL_LITERAL - 99)) | (1L << (FLOATING_POINT_LITERAL - 99)) | (1L << (CHAR - 99)) | (1L << (STRING - 99)))) != 0) );
					}
					}
					setState(1110);
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
		enterRule(_localctx, 166, RULE_function_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1113);
			assign_expr();
			setState(1117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1114);
				match(NEWLINE);
				}
				}
				setState(1119);
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
		enterRule(_localctx, 168, RULE_primary_expression);
		try {
			setState(1126);
			switch (_input.LA(1)) {
			case T__22:
			case T__23:
			case T__24:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1120);
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
				setState(1121);
				constant();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(1122);
				match(T__0);
				setState(1123);
				expr();
				setState(1124);
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
		enterRule(_localctx, 170, RULE_init_declarator);
		int _la;
		try {
			setState(1140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				_localctx = new InitDeclWithCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1128);
				declarator();
				setState(1129);
				match(T__0);
				setState(1131);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (NEW - 99)) | (1L << (ALPHA_NUMERIC - 99)) | (1L << (HEX_LITERAL - 99)) | (1L << (DECIMAL_LITERAL - 99)) | (1L << (OCTAL_LITERAL - 99)) | (1L << (FLOATING_POINT_LITERAL - 99)) | (1L << (CHAR - 99)) | (1L << (STRING - 99)))) != 0)) {
					{
					setState(1130);
					expr();
					}
				}

				setState(1133);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new InitDeclWithAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1135);
				declarator();
				setState(1136);
				match(T__4);
				setState(1137);
				initializer();
				}
				break;
			case 3:
				_localctx = new InitDeclSimpleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1139);
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
		enterRule(_localctx, 172, RULE_declarator);
		int _la;
		try {
			setState(1158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1143);
				_la = _input.LA(1);
				if (_la==T__11 || _la==T__12) {
					{
					setState(1142);
					ptrs();
					}
				}

				setState(1145);
				identifier();
				setState(1147);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(1146);
					type_suffix();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1150);
				_la = _input.LA(1);
				if (_la==T__11 || _la==T__12) {
					{
					setState(1149);
					ptrs();
					}
				}

				setState(1152);
				match(T__0);
				setState(1153);
				func_ptrs();
				setState(1154);
				identifier();
				setState(1155);
				match(T__1);
				setState(1156);
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
		enterRule(_localctx, 174, RULE_type_suffix);
		int _la;
		try {
			setState(1166);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1160);
				match(T__26);
				setState(1162);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (NEW - 99)) | (1L << (ALPHA_NUMERIC - 99)) | (1L << (HEX_LITERAL - 99)) | (1L << (DECIMAL_LITERAL - 99)) | (1L << (OCTAL_LITERAL - 99)) | (1L << (FLOATING_POINT_LITERAL - 99)) | (1L << (CHAR - 99)) | (1L << (STRING - 99)))) != 0)) {
					{
					setState(1161);
					conditional_expression();
					}
				}

				setState(1164);
				match(T__27);
				}
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(1165);
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
		enterRule(_localctx, 176, RULE_simple_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1168);
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

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_var_decl);
		int _la;
		try {
			setState(1189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				_localctx = new DeclByClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1171);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(1170);
					match(TYPEDEF);
					}
				}

				setState(1174);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(1173);
					template_decl_start();
					}
				}

				}
				setState(1176);
				class_def();
				setState(1178);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(1177);
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
				setState(1181);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(1180);
					match(TYPEDEF);
					}
				}

				setState(1184);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(1183);
					template_decl_start();
					}
				}

				}
				setState(1186);
				type_name();
				setState(1187);
				init_declarator_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 180, RULE_init_declarator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1191);
			init_declarator();
			setState(1196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(1192);
				match(T__5);
				setState(1193);
				init_declarator();
				}
				}
				setState(1198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1199);
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
		enterRule(_localctx, 182, RULE_initializer);
		try {
			setState(1208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1201);
				assign_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1202);
				match(OPENING_CURLY);
				setState(1203);
				initializer_list();
				setState(1204);
				match(CLOSING_CURLY);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1206);
				match(OPENING_CURLY);
				setState(1207);
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
		enterRule(_localctx, 184, RULE_initializer_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
			initializer();
			setState(1215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(1211);
				match(T__5);
				setState(1212);
				initializer();
				}
				}
				setState(1217);
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
		enterRule(_localctx, 186, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1218);
			match(CLASS_KEY);
			setState(1220);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24))) != 0) || _la==ALPHA_NUMERIC) {
				{
				setState(1219);
				class_name();
				}
			}

			setState(1223);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(1222);
				base_classes();
				}
			}

			setState(1225);
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
		enterRule(_localctx, 188, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1228);
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
		enterRule(_localctx, 190, RULE_base_classes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1230);
			match(T__3);
			setState(1231);
			base_class();
			setState(1236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(1232);
				match(T__5);
				setState(1233);
				base_class();
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
		enterRule(_localctx, 192, RULE_base_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1240);
			_la = _input.LA(1);
			if (_la==VIRTUAL) {
				{
				setState(1239);
				match(VIRTUAL);
				}
			}

			setState(1243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1242);
				access_specifier();
				}
				break;
			}
			setState(1245);
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
		public List<TerminalNode> CV_QUALIFIER() { return getTokens(FunctionParser.CV_QUALIFIER); }
		public TerminalNode CV_QUALIFIER(int i) {
			return getToken(FunctionParser.CV_QUALIFIER, i);
		}
		public List<Template_param_listContext> template_param_list() {
			return getRuleContexts(Template_param_listContext.class);
		}
		public Template_param_listContext template_param_list(int i) {
			return getRuleContext(Template_param_listContext.class,i);
		}
		public TerminalNode CLASS_KEY() { return getToken(FunctionParser.CLASS_KEY, 0); }
		public TerminalNode UNSIGNED() { return getToken(FunctionParser.UNSIGNED, 0); }
		public TerminalNode SIGNED() { return getToken(FunctionParser.SIGNED, 0); }
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
		enterRule(_localctx, 194, RULE_type_name);
		int _la;
		try {
			setState(1281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CV_QUALIFIER) {
					{
					{
					setState(1247);
					match(CV_QUALIFIER);
					}
					}
					setState(1252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1254);
				_la = _input.LA(1);
				if (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (UNSIGNED - 70)) | (1L << (SIGNED - 70)) | (1L << (CLASS_KEY - 70)))) != 0)) {
					{
					setState(1253);
					_la = _input.LA(1);
					if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (UNSIGNED - 70)) | (1L << (SIGNED - 70)) | (1L << (CLASS_KEY - 70)))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(1256);
				base_type();
				setState(1261);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(1257);
					match(T__6);
					setState(1258);
					template_param_list();
					setState(1259);
					match(T__7);
					}
				}

				setState(1273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__52) {
					{
					{
					setState(1263);
					match(T__52);
					setState(1264);
					base_type();
					setState(1269);
					_la = _input.LA(1);
					if (_la==T__6) {
						{
						setState(1265);
						match(T__6);
						setState(1266);
						template_param_list();
						setState(1267);
						match(T__7);
						}
					}

					}
					}
					setState(1275);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(1277);
				_la = _input.LA(1);
				if (_la==CV_QUALIFIER) {
					{
					setState(1276);
					match(CV_QUALIFIER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1279);
				match(UNSIGNED);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1280);
				match(SIGNED);
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(FunctionParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(FunctionParser.ALPHA_NUMERIC, i);
		}
		public List<TerminalNode> VOID() { return getTokens(FunctionParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(FunctionParser.VOID, i);
		}
		public List<TerminalNode> LONG() { return getTokens(FunctionParser.LONG); }
		public TerminalNode LONG(int i) {
			return getToken(FunctionParser.LONG, i);
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
		enterRule(_localctx, 196, RULE_base_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1284); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1283);
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
				setState(1286); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
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
		enterRule(_localctx, 198, RULE_param_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
			_la = _input.LA(1);
			if (_la==AUTO || _la==REGISTER) {
				{
				setState(1288);
				_la = _input.LA(1);
				if ( !(_la==AUTO || _la==REGISTER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1291);
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
		enterRule(_localctx, 200, RULE_parameter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1293);
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
		enterRule(_localctx, 202, RULE_param_type_list);
		int _la;
		try {
			setState(1310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1295);
				match(T__0);
				setState(1296);
				match(VOID);
				setState(1297);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1298);
				match(T__0);
				setState(1307);
				_la = _input.LA(1);
				if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (VOID - 69)) | (1L << (UNSIGNED - 69)) | (1L << (SIGNED - 69)) | (1L << (LONG - 69)) | (1L << (CV_QUALIFIER - 69)) | (1L << (AUTO - 69)) | (1L << (REGISTER - 69)) | (1L << (CLASS_KEY - 69)) | (1L << (ALPHA_NUMERIC - 69)))) != 0)) {
					{
					setState(1299);
					param_type();
					setState(1304);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__5) {
						{
						{
						setState(1300);
						match(T__5);
						setState(1301);
						param_type();
						}
						}
						setState(1306);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1309);
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
		enterRule(_localctx, 204, RULE_param_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1312);
			param_decl_specifiers();
			setState(1313);
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
		enterRule(_localctx, 206, RULE_param_type_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1316);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__12) {
				{
				setState(1315);
				ptrs();
				}
			}

			setState(1325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1318);
				match(T__0);
				setState(1319);
				param_type_id();
				setState(1320);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(1323);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24))) != 0) || _la==ALPHA_NUMERIC) {
					{
					setState(1322);
					parameter_name();
					}
				}

				}
				break;
			}
			setState(1328);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__26) {
				{
				setState(1327);
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
		enterRule(_localctx, 208, RULE_identifier);
		try {
			int _alt;
			setState(1339);
			switch (_input.LA(1)) {
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1330);
				match(ALPHA_NUMERIC);
				setState(1335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1331);
						match(T__52);
						setState(1332);
						match(ALPHA_NUMERIC);
						}
						} 
					}
					setState(1337);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				}
				}
				}
				break;
			case T__22:
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(1338);
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
		enterRule(_localctx, 210, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1341);
			_la = _input.LA(1);
			if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (HEX_LITERAL - 104)) | (1L << (DECIMAL_LITERAL - 104)) | (1L << (OCTAL_LITERAL - 104)))) != 0)) ) {
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
		enterRule(_localctx, 212, RULE_ptrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1347); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1343);
				ptr_operator();
				setState(1345);
				_la = _input.LA(1);
				if (_la==T__55) {
					{
					setState(1344);
					match(T__55);
					}
				}

				}
				}
				setState(1349); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__11 || _la==T__12 );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 214, RULE_func_ptrs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1351);
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
		case 81:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3u\u054c\4\2\t\2\4"+
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
		"k\4l\tl\4m\tm\3\2\7\2\u00dc\n\2\f\2\16\2\u00df\13\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3\u00eb\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u00f8\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\u010a\n\7\3\7\5\7\u010d\n\7\3\7\3\7\5\7\u0111\n"+
		"\7\3\7\3\7\5\7\u0115\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u011d\n\7\5\7\u011f"+
		"\n\7\3\b\3\b\3\b\3\b\5\b\u0125\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u0131\n\t\3\t\3\t\3\t\5\t\u0136\n\t\3\t\5\t\u0139\n\t\3\n\5\n"+
		"\u013c\n\n\3\n\3\n\3\n\5\n\u0141\n\n\3\n\3\n\3\13\5\13\u0146\n\13\3\13"+
		"\3\13\3\f\3\f\3\f\7\f\u014d\n\f\f\f\16\f\u0150\13\f\3\f\3\f\7\f\u0154"+
		"\n\f\f\f\16\f\u0157\13\f\3\f\3\f\7\f\u015b\n\f\f\f\16\f\u015e\13\f\3\f"+
		"\3\f\5\f\u0162\n\f\3\r\3\r\5\r\u0166\n\r\3\16\3\16\3\16\3\16\5\16\u016c"+
		"\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u017f\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u0189\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u0198\n\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\5\30"+
		"\u01a1\n\30\3\30\3\30\3\30\5\30\u01a6\n\30\7\30\u01a8\n\30\f\30\16\30"+
		"\u01ab\13\30\3\31\3\31\3\32\3\32\3\32\5\32\u01b2\n\32\3\33\3\33\5\33\u01b6"+
		"\n\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01be\n\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u01c6\n\35\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \6 \u01d0"+
		"\n \r \16 \u01d1\5 \u01d4\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\5!\u01e4\n!\3\"\3\"\5\"\u01e8\n\"\3\"\3\"\3\"\3\"\3\"\5\"\u01ef\n\""+
		"\3\"\3\"\6\"\u01f3\n\"\r\"\16\"\u01f4\3\"\3\"\5\"\u01f9\n\"\3\"\3\"\3"+
		"\"\5\"\u01fe\n\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*"+
		"\5*\u0211\n*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u023b"+
		"\n*\3+\3+\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\6.\u024f\n."+
		"\r.\16.\u0250\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64"+
		"\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3;\7;\u026e\n;"+
		"\f;\16;\u0271\13;\3;\7;\u0274\n;\f;\16;\u0277\13;\3;\3;\7;\u027b\n;\f"+
		";\16;\u027e\13;\3;\5;\u0281\n;\3;\3;\7;\u0285\n;\f;\16;\u0288\13;\3<\3"+
		"<\7<\u028c\n<\f<\16<\u028f\13<\3<\3<\7<\u0293\n<\f<\16<\u0296\13<\3<\3"+
		"<\5<\u029a\n<\3=\3=\3=\7=\u029f\n=\f=\16=\u02a2\13=\3=\3=\7=\u02a6\n="+
		"\f=\16=\u02a9\13=\3=\3=\7=\u02ad\n=\f=\16=\u02b0\13=\3=\3=\7=\u02b4\n"+
		"=\f=\16=\u02b7\13=\3=\3=\5=\u02bb\n=\3>\3>\7>\u02bf\n>\f>\16>\u02c2\13"+
		">\3>\3>\7>\u02c6\n>\f>\16>\u02c9\13>\3>\5>\u02cc\n>\3?\3?\7?\u02d0\n?"+
		"\f?\16?\u02d3\13?\3?\3?\7?\u02d7\n?\f?\16?\u02da\13?\3?\5?\u02dd\n?\3"+
		"@\3@\7@\u02e1\n@\f@\16@\u02e4\13@\3@\3@\7@\u02e8\n@\f@\16@\u02eb\13@\3"+
		"@\5@\u02ee\n@\3A\3A\7A\u02f2\nA\fA\16A\u02f5\13A\3A\3A\7A\u02f9\nA\fA"+
		"\16A\u02fc\13A\3A\5A\u02ff\nA\3B\3B\7B\u0303\nB\fB\16B\u0306\13B\3B\3"+
		"B\7B\u030a\nB\fB\16B\u030d\13B\3B\5B\u0310\nB\3C\3C\7C\u0314\nC\fC\16"+
		"C\u0317\13C\3C\3C\7C\u031b\nC\fC\16C\u031e\13C\3C\3C\5C\u0322\nC\3D\3"+
		"D\7D\u0326\nD\fD\16D\u0329\13D\3D\3D\7D\u032d\nD\fD\16D\u0330\13D\3D\3"+
		"D\5D\u0334\nD\3E\3E\7E\u0338\nE\fE\16E\u033b\13E\3E\3E\7E\u033f\nE\fE"+
		"\16E\u0342\13E\3E\5E\u0345\nE\3F\3F\7F\u0349\nF\fF\16F\u034c\13F\3F\3"+
		"F\7F\u0350\nF\fF\16F\u0353\13F\3F\5F\u0356\nF\3G\3G\7G\u035a\nG\fG\16"+
		"G\u035d\13G\3G\3G\7G\u0361\nG\fG\16G\u0364\13G\3G\5G\u0367\nG\3H\3H\3"+
		"H\3H\3H\3H\5H\u036f\nH\3I\3I\7I\u0373\nI\fI\16I\u0376\13I\3I\7I\u0379"+
		"\nI\fI\16I\u037c\13I\3J\3J\3J\3J\3J\5J\u0383\nJ\3K\5K\u0386\nK\3K\3K\7"+
		"K\u038a\nK\fK\16K\u038d\13K\3K\3K\7K\u0391\nK\fK\16K\u0394\13K\3K\3K\5"+
		"K\u0398\nK\3K\3K\3K\5K\u039d\nK\3K\3K\7K\u03a1\nK\fK\16K\u03a4\13K\3K"+
		"\3K\7K\u03a8\nK\fK\16K\u03ab\13K\3K\3K\5K\u03af\nK\3K\3K\5K\u03b3\nK\3"+
		"L\3L\7L\u03b7\nL\fL\16L\u03ba\13L\3L\3L\3M\3M\7M\u03c0\nM\fM\16M\u03c3"+
		"\13M\3M\3M\3M\3M\3M\3M\7M\u03cb\nM\fM\16M\u03ce\13M\3M\3M\5M\u03d2\nM"+
		"\3N\3N\3O\3O\7O\u03d8\nO\fO\16O\u03db\13O\3O\3O\3O\3O\3O\3O\7O\u03e3\n"+
		"O\fO\16O\u03e6\13O\3O\5O\u03e9\nO\3P\3P\7P\u03ed\nP\fP\16P\u03f0\13P\3"+
		"P\7P\u03f3\nP\fP\16P\u03f6\13P\3Q\3Q\3R\3R\3S\3S\3S\3S\7S\u0400\nS\fS"+
		"\16S\u0403\13S\3S\3S\5S\u0407\nS\3S\3S\7S\u040b\nS\fS\16S\u040e\13S\3"+
		"S\3S\3S\3S\3S\3S\7S\u0416\nS\fS\16S\u0419\13S\3S\3S\3S\3S\3S\3S\3S\7S"+
		"\u0422\nS\fS\16S\u0425\13S\3S\5S\u0428\nS\3S\3S\3S\3S\7S\u042e\nS\fS\16"+
		"S\u0431\13S\3S\5S\u0434\nS\3S\3S\3S\7S\u0439\nS\fS\16S\u043c\13S\3S\7"+
		"S\u043f\nS\fS\16S\u0442\13S\3T\6T\u0445\nT\rT\16T\u0446\3T\3T\7T\u044b"+
		"\nT\fT\16T\u044e\13T\3T\6T\u0451\nT\rT\16T\u0452\7T\u0455\nT\fT\16T\u0458"+
		"\13T\5T\u045a\nT\3U\3U\7U\u045e\nU\fU\16U\u0461\13U\3V\3V\3V\3V\3V\3V"+
		"\5V\u0469\nV\3W\3W\3W\5W\u046e\nW\3W\3W\3W\3W\3W\3W\3W\5W\u0477\nW\3X"+
		"\5X\u047a\nX\3X\3X\5X\u047e\nX\3X\5X\u0481\nX\3X\3X\3X\3X\3X\3X\5X\u0489"+
		"\nX\3Y\3Y\5Y\u048d\nY\3Y\3Y\5Y\u0491\nY\3Z\3Z\3[\5[\u0496\n[\3[\5[\u0499"+
		"\n[\3[\3[\5[\u049d\n[\3[\5[\u04a0\n[\3[\5[\u04a3\n[\3[\3[\3[\5[\u04a8"+
		"\n[\3\\\3\\\3\\\7\\\u04ad\n\\\f\\\16\\\u04b0\13\\\3\\\3\\\3]\3]\3]\3]"+
		"\3]\3]\3]\5]\u04bb\n]\3^\3^\3^\7^\u04c0\n^\f^\16^\u04c3\13^\3_\3_\5_\u04c7"+
		"\n_\3_\5_\u04ca\n_\3_\3_\3_\3`\3`\3a\3a\3a\3a\7a\u04d5\na\fa\16a\u04d8"+
		"\13a\3b\5b\u04db\nb\3b\5b\u04de\nb\3b\3b\3c\7c\u04e3\nc\fc\16c\u04e6\13"+
		"c\3c\5c\u04e9\nc\3c\3c\3c\3c\3c\5c\u04f0\nc\3c\3c\3c\3c\3c\3c\5c\u04f8"+
		"\nc\7c\u04fa\nc\fc\16c\u04fd\13c\3c\5c\u0500\nc\3c\3c\5c\u0504\nc\3d\6"+
		"d\u0507\nd\rd\16d\u0508\3e\5e\u050c\ne\3e\3e\3f\3f\3g\3g\3g\3g\3g\3g\3"+
		"g\7g\u0519\ng\fg\16g\u051c\13g\5g\u051e\ng\3g\5g\u0521\ng\3h\3h\3h\3i"+
		"\5i\u0527\ni\3i\3i\3i\3i\3i\5i\u052e\ni\5i\u0530\ni\3i\5i\u0533\ni\3j"+
		"\3j\3j\7j\u0538\nj\fj\16j\u053b\13j\3j\5j\u053e\nj\3k\3k\3l\3l\5l\u0544"+
		"\nl\6l\u0546\nl\rl\16l\u0547\3m\3m\3m\2\3\u00a4n\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\2\35\4\2"+
		"\13\rgg\4\2\f\f\16\22\4\2\t\n\23\24\4\2jmop\4\2\25\30LL\3\2\16\17\3\2"+
		"\31\33\4\2\34\34ee\5\2\7\7\"),-\3\2./\3\2\3\4\5\2\3\4\35\36hi\3\2\3\5"+
		"\4\2\3\4\t\n\3\2hi\3\2\35\36\4\2\5\5\35\36\4\2\5\5\b\b\6\2\3\5\b\b\35"+
		"\36hi\3\2*+\4\2\f\f\20\20\5\2\r\r\17\17\37\37\3\2\62\63\4\2HIff\5\2GG"+
		"JJgg\3\2RS\3\2jl\u05db\2\u00dd\3\2\2\2\4\u00ea\3\2\2\2\6\u00ec\3\2\2\2"+
		"\b\u00ee\3\2\2\2\n\u00f0\3\2\2\2\f\u011e\3\2\2\2\16\u0124\3\2\2\2\20\u0138"+
		"\3\2\2\2\22\u013b\3\2\2\2\24\u0145\3\2\2\2\26\u0161\3\2\2\2\30\u0165\3"+
		"\2\2\2\32\u016b\3\2\2\2\34\u016d\3\2\2\2\36\u0171\3\2\2\2 \u0175\3\2\2"+
		"\2\"\u0177\3\2\2\2$\u017e\3\2\2\2&\u0188\3\2\2\2(\u0197\3\2\2\2*\u0199"+
		"\3\2\2\2,\u019c\3\2\2\2.\u01a0\3\2\2\2\60\u01ac\3\2\2\2\62\u01b1\3\2\2"+
		"\2\64\u01b3\3\2\2\2\66\u01bd\3\2\2\28\u01c5\3\2\2\2:\u01c7\3\2\2\2<\u01cb"+
		"\3\2\2\2>\u01d3\3\2\2\2@\u01e3\3\2\2\2B\u01fd\3\2\2\2D\u01ff\3\2\2\2F"+
		"\u0201\3\2\2\2H\u0203\3\2\2\2J\u0205\3\2\2\2L\u0207\3\2\2\2N\u0209\3\2"+
		"\2\2P\u020b\3\2\2\2R\u023a\3\2\2\2T\u023c\3\2\2\2V\u023e\3\2\2\2X\u0240"+
		"\3\2\2\2Z\u024e\3\2\2\2\\\u0252\3\2\2\2^\u0254\3\2\2\2`\u0256\3\2\2\2"+
		"b\u0258\3\2\2\2d\u025a\3\2\2\2f\u025c\3\2\2\2h\u025e\3\2\2\2j\u0260\3"+
		"\2\2\2l\u0262\3\2\2\2n\u0264\3\2\2\2p\u0266\3\2\2\2r\u0268\3\2\2\2t\u026a"+
		"\3\2\2\2v\u0289\3\2\2\2x\u02ba\3\2\2\2z\u02bc\3\2\2\2|\u02cd\3\2\2\2~"+
		"\u02de\3\2\2\2\u0080\u02ef\3\2\2\2\u0082\u0300\3\2\2\2\u0084\u0311\3\2"+
		"\2\2\u0086\u0323\3\2\2\2\u0088\u0335\3\2\2\2\u008a\u0346\3\2\2\2\u008c"+
		"\u0357\3\2\2\2\u008e\u036e\3\2\2\2\u0090\u0370\3\2\2\2\u0092\u0382\3\2"+
		"\2\2\u0094\u03b2\3\2\2\2\u0096\u03b4\3\2\2\2\u0098\u03d1\3\2\2\2\u009a"+
		"\u03d3\3\2\2\2\u009c\u03e8\3\2\2\2\u009e\u03ea\3\2\2\2\u00a0\u03f7\3\2"+
		"\2\2\u00a2\u03f9\3\2\2\2\u00a4\u0406\3\2\2\2\u00a6\u0459\3\2\2\2\u00a8"+
		"\u045b\3\2\2\2\u00aa\u0468\3\2\2\2\u00ac\u0476\3\2\2\2\u00ae\u0488\3\2"+
		"\2\2\u00b0\u0490\3\2\2\2\u00b2\u0492\3\2\2\2\u00b4\u04a7\3\2\2\2\u00b6"+
		"\u04a9\3\2\2\2\u00b8\u04ba\3\2\2\2\u00ba\u04bc\3\2\2\2\u00bc\u04c4\3\2"+
		"\2\2\u00be\u04ce\3\2\2\2\u00c0\u04d0\3\2\2\2\u00c2\u04da\3\2\2\2\u00c4"+
		"\u0503\3\2\2\2\u00c6\u0506\3\2\2\2\u00c8\u050b\3\2\2\2\u00ca\u050f\3\2"+
		"\2\2\u00cc\u0520\3\2\2\2\u00ce\u0522\3\2\2\2\u00d0\u0526\3\2\2\2\u00d2"+
		"\u053d\3\2\2\2\u00d4\u053f\3\2\2\2\u00d6\u0545\3\2\2\2\u00d8\u0549\3\2"+
		"\2\2\u00da\u00dc\5\4\3\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\3\3\2\2\2\u00df\u00dd\3\2\2\2"+
		"\u00e0\u00eb\5\6\4\2\u00e1\u00eb\5\b\5\2\u00e2\u00eb\5\30\r\2\u00e3\u00eb"+
		"\5\n\6\2\u00e4\u00eb\5\20\t\2\u00e5\u00eb\5\22\n\2\u00e6\u00eb\5\u00b2"+
		"Z\2\u00e7\u00eb\5\24\13\2\u00e8\u00eb\5D#\2\u00e9\u00eb\5r:\2\u00ea\u00e0"+
		"\3\2\2\2\u00ea\u00e1\3\2\2\2\u00ea\u00e2\3\2\2\2\u00ea\u00e3\3\2\2\2\u00ea"+
		"\u00e4\3\2\2\2\u00ea\u00e5\3\2\2\2\u00ea\u00e6\3\2\2\2\u00ea\u00e7\3\2"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\5\3\2\2\2\u00ec\u00ed"+
		"\7h\2\2\u00ed\7\3\2\2\2\u00ee\u00ef\7i\2\2\u00ef\t\3\2\2\2\u00f0\u00f1"+
		"\5\f\7\2\u00f1\13\3\2\2\2\u00f2\u011f\7M\2\2\u00f3\u00f4\7N\2\2\u00f4"+
		"\u00f7\7\3\2\2\u00f5\u00f8\5\u00ceh\2\u00f6\u00f8\7t\2\2\u00f7\u00f5\3"+
		"\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u011f\7\4\2\2\u00fa"+
		"\u00fb\7;\2\2\u00fb\u00fc\7\3\2\2\u00fc\u00fd\5\26\f\2\u00fd\u00fe\7\4"+
		"\2\2\u00fe\u011f\3\2\2\2\u00ff\u011f\7<\2\2\u0100\u0101\7B\2\2\u0101\u0102"+
		"\7\3\2\2\u0102\u0103\5\26\f\2\u0103\u0104\7\4\2\2\u0104\u011f\3\2\2\2"+
		"\u0105\u0106\7=\2\2\u0106\u0109\7\3\2\2\u0107\u010a\5\16\b\2\u0108\u010a"+
		"\7\5\2\2\u0109\u0107\3\2\2\2\u0109\u0108\3\2\2\2\u010a\u010c\3\2\2\2\u010b"+
		"\u010d\5\26\f\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3"+
		"\2\2\2\u010e\u0110\7\5\2\2\u010f\u0111\5t;\2\u0110\u010f\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\7\4\2\2\u0113\u0115\7\5"+
		"\2\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u011f\3\2\2\2\u0116"+
		"\u011f\7C\2\2\u0117\u0118\7>\2\2\u0118\u0119\7\3\2\2\u0119\u011a\5\26"+
		"\f\2\u011a\u011c\7\4\2\2\u011b\u011d\7\5\2\2\u011c\u011b\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u00f2\3\2\2\2\u011e\u00f3\3\2"+
		"\2\2\u011e\u00fa\3\2\2\2\u011e\u00ff\3\2\2\2\u011e\u0100\3\2\2\2\u011e"+
		"\u0105\3\2\2\2\u011e\u0116\3\2\2\2\u011e\u0117\3\2\2\2\u011f\r\3\2\2\2"+
		"\u0120\u0125\5\u00b2Z\2\u0121\u0122\5t;\2\u0122\u0123\7\5\2\2\u0123\u0125"+
		"\3\2\2\2\u0124\u0120\3\2\2\2\u0124\u0121\3\2\2\2\u0125\17\3\2\2\2\u0126"+
		"\u0127\7?\2\2\u0127\u0139\7\5\2\2\u0128\u0129\7A\2\2\u0129\u0139\7\5\2"+
		"\2\u012a\u012b\7D\2\2\u012b\u012c\5\u00d2j\2\u012c\u012d\7\5\2\2\u012d"+
		"\u0139\3\2\2\2\u012e\u0130\7E\2\2\u012f\u0131\5t;\2\u0130\u012f\3\2\2"+
		"\2\u0130\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0139\7\5\2\2\u0133\u0135"+
		"\7O\2\2\u0134\u0136\5t;\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0139\7\5\2\2\u0138\u0126\3\2\2\2\u0138\u0128\3\2"+
		"\2\2\u0138\u012a\3\2\2\2\u0138\u012e\3\2\2\2\u0138\u0133\3\2\2\2\u0139"+
		"\21\3\2\2\2\u013a\u013c\7@\2\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2"+
		"\u013c\u0140\3\2\2\2\u013d\u0141\5\u00d2j\2\u013e\u0141\5\u00d4k\2\u013f"+
		"\u0141\7o\2\2\u0140\u013d\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u013f\3\2"+
		"\2\2\u0141\u0142\3\2\2\2\u0142\u0143\7\6\2\2\u0143\23\3\2\2\2\u0144\u0146"+
		"\5t;\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\u0148\7\5\2\2\u0148\25\3\2\2\2\u0149\u0162\5t;\2\u014a\u014e\5\u00c4"+
		"c\2\u014b\u014d\7q\2\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c"+
		"\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151"+
		"\u0155\5\u00aeX\2\u0152\u0154\7q\2\2\u0153\u0152\3\2\2\2\u0154\u0157\3"+
		"\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0158\u015c\7\7\2\2\u0159\u015b\7q\2\2\u015a\u0159\3\2"+
		"\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u015f\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0160\5v<\2\u0160\u0162\3\2\2"+
		"\2\u0161\u0149\3\2\2\2\u0161\u014a\3\2\2\2\u0162\27\3\2\2\2\u0163\u0166"+
		"\5\32\16\2\u0164\u0166\5&\24\2\u0165\u0163\3\2\2\2\u0165\u0164\3\2\2\2"+
		"\u0166\31\3\2\2\2\u0167\u016c\5\34\17\2\u0168\u016c\5\36\20\2\u0169\u016c"+
		"\5 \21\2\u016a\u016c\5\"\22\2\u016b\u0167\3\2\2\2\u016b\u0168\3\2\2\2"+
		"\u016b\u0169\3\2\2\2\u016b\u016a\3\2\2\2\u016c\33\3\2\2\2\u016d\u016e"+
		"\7T\2\2\u016e\u016f\5$\23\2\u016f\u0170\b\17\1\2\u0170\35\3\2\2\2\u0171"+
		"\u0172\7U\2\2\u0172\u0173\5$\23\2\u0173\u0174\b\20\1\2\u0174\37\3\2\2"+
		"\2\u0175\u0176\7V\2\2\u0176!\3\2\2\2\u0177\u0178\7W\2\2\u0178#\3\2\2\2"+
		"\u0179\u017f\5\26\f\2\u017a\u017b\7\3\2\2\u017b\u017c\5\26\f\2\u017c\u017d"+
		"\7\4\2\2\u017d\u017f\3\2\2\2\u017e\u0179\3\2\2\2\u017e\u017a\3\2\2\2\u017f"+
		"%\3\2\2\2\u0180\u0189\5(\25\2\u0181\u0189\5*\26\2\u0182\u0189\5\62\32"+
		"\2\u0183\u0189\5\64\33\2\u0184\u0189\5\66\34\2\u0185\u0189\58\35\2\u0186"+
		"\u0189\5@!\2\u0187\u0189\5B\"\2\u0188\u0180\3\2\2\2\u0188\u0181\3\2\2"+
		"\2\u0188\u0182\3\2\2\2\u0188\u0183\3\2\2\2\u0188\u0184\3\2\2\2\u0188\u0185"+
		"\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0187\3\2\2\2\u0189\'\3\2\2\2\u018a"+
		"\u018b\7X\2\2\u018b\u018c\5,\27\2\u018c\u018d\7\3\2\2\u018d\u018e\5.\30"+
		"\2\u018e\u018f\7\4\2\2\u018f\u0190\5\60\31\2\u0190\u0198\3\2\2\2\u0191"+
		"\u0192\7X\2\2\u0192\u0193\5,\27\2\u0193\u0194\5\60\31\2\u0194\u0198\3"+
		"\2\2\2\u0195\u0196\7X\2\2\u0196\u0198\5,\27\2\u0197\u018a\3\2\2\2\u0197"+
		"\u0191\3\2\2\2\u0197\u0195\3\2\2\2\u0198)\3\2\2\2\u0199\u019a\7Y\2\2\u019a"+
		"\u019b\5,\27\2\u019b+\3\2\2\2\u019c\u019d\5\u00d2j\2\u019d-\3\2\2\2\u019e"+
		"\u01a1\5\u00d2j\2\u019f\u01a1\7t\2\2\u01a0\u019e\3\2\2\2\u01a0\u019f\3"+
		"\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a9\3\2\2\2\u01a2\u01a5\7\b\2\2\u01a3"+
		"\u01a6\5\u00d2j\2\u01a4\u01a6\7t\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a4\3"+
		"\2\2\2\u01a6\u01a8\3\2\2\2\u01a7\u01a2\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9"+
		"\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa/\3\2\2\2\u01ab\u01a9\3\2\2\2"+
		"\u01ac\u01ad\b\31\1\2\u01ad\61\3\2\2\2\u01ae\u01af\7Z\2\2\u01af\u01b2"+
		"\7p\2\2\u01b0\u01b2\7Z\2\2\u01b1\u01ae\3\2\2\2\u01b1\u01b0\3\2\2\2\u01b2"+
		"\63\3\2\2\2\u01b3\u01b5\7[\2\2\u01b4\u01b6\7p\2\2\u01b5\u01b4\3\2\2\2"+
		"\u01b5\u01b6\3\2\2\2\u01b6\65\3\2\2\2\u01b7\u01b8\7\\\2\2\u01b8\u01be"+
		"\5:\36\2\u01b9\u01ba\7\\\2\2\u01ba\u01be\5,\27\2\u01bb\u01bc\7\\\2\2\u01bc"+
		"\u01be\5<\37\2\u01bd\u01b7\3\2\2\2\u01bd\u01b9\3\2\2\2\u01bd\u01bb\3\2"+
		"\2\2\u01be\67\3\2\2\2\u01bf\u01c0\7]\2\2\u01c0\u01c6\5:\36\2\u01c1\u01c2"+
		"\7]\2\2\u01c2\u01c6\5,\27\2\u01c3\u01c4\7]\2\2\u01c4\u01c6\5<\37\2\u01c5"+
		"\u01bf\3\2\2\2\u01c5\u01c1\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c69\3\2\2\2"+
		"\u01c7\u01c8\7\t\2\2\u01c8\u01c9\5> \2\u01c9\u01ca\7\n\2\2\u01ca;\3\2"+
		"\2\2\u01cb\u01cc\5> \2\u01cc=\3\2\2\2\u01cd\u01d4\7p\2\2\u01ce\u01d0\t"+
		"\2\2\2\u01cf\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1"+
		"\u01d2\3\2\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01cd\3\2\2\2\u01d3\u01cf\3\2"+
		"\2\2\u01d4?\3\2\2\2\u01d5\u01d6\7^\2\2\u01d6\u01d7\7k\2\2\u01d7\u01e4"+
		"\7p\2\2\u01d8\u01d9\7^\2\2\u01d9\u01da\7k\2\2\u01da\u01e4\5,\27\2\u01db"+
		"\u01dc\7^\2\2\u01dc\u01dd\5,\27\2\u01dd\u01de\7p\2\2\u01de\u01e4\3\2\2"+
		"\2\u01df\u01e0\7^\2\2\u01e0\u01e4\5,\27\2\u01e1\u01e2\7^\2\2\u01e2\u01e4"+
		"\7k\2\2\u01e3\u01d5\3\2\2\2\u01e3\u01d8\3\2\2\2\u01e3\u01db\3\2\2\2\u01e3"+
		"\u01df\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4A\3\2\2\2\u01e5\u01e7\7_\2\2\u01e6"+
		"\u01e8\7`\2\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\3\2"+
		"\2\2\u01e9\u01ea\7a\2\2\u01ea\u01eb\7p\2\2\u01eb\u01fe\b\"\1\2\u01ec\u01ee"+
		"\7_\2\2\u01ed\u01ef\7`\2\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef"+
		"\u01f0\3\2\2\2\u01f0\u01f2\7a\2\2\u01f1\u01f3\5\u00d2j\2\u01f2\u01f1\3"+
		"\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5"+
		"\u01fe\3\2\2\2\u01f6\u01f8\7_\2\2\u01f7\u01f9\7`\2\2\u01f8\u01f7\3\2\2"+
		"\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fe\7a\2\2\u01fb\u01fc"+
		"\7_\2\2\u01fc\u01fe\b\"\1\2\u01fd\u01e5\3\2\2\2\u01fd\u01ec\3\2\2\2\u01fd"+
		"\u01f6\3\2\2\2\u01fd\u01fb\3\2\2\2\u01feC\3\2\2\2\u01ff\u0200\7n\2\2\u0200"+
		"E\3\2\2\2\u0201\u0202\t\3\2\2\u0202G\3\2\2\2\u0203\u0204\t\4\2\2\u0204"+
		"I\3\2\2\2\u0205\u0206\t\5\2\2\u0206K\3\2\2\2\u0207\u0208\t\6\2\2\u0208"+
		"M\3\2\2\2\u0209\u020a\t\7\2\2\u020aO\3\2\2\2\u020b\u020c\t\b\2\2\u020c"+
		"Q\3\2\2\2\u020d\u0210\t\t\2\2\u020e\u020f\7\35\2\2\u020f\u0211\7\36\2"+
		"\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u023b\3\2\2\2\u0212\u023b"+
		"\7\20\2\2\u0213\u023b\7\f\2\2\u0214\u023b\7\17\2\2\u0215\u023b\7\r\2\2"+
		"\u0216\u023b\7\37\2\2\u0217\u023b\7 \2\2\u0218\u023b\7\16\2\2\u0219\u023b"+
		"\7!\2\2\u021a\u023b\7\21\2\2\u021b\u023b\7\22\2\2\u021c\u023b\7\7\2\2"+
		"\u021d\u023b\7\t\2\2\u021e\u023b\7\n\2\2\u021f\u023b\7\"\2\2\u0220\u023b"+
		"\7#\2\2\u0221\u023b\7$\2\2\u0222\u023b\7%\2\2\u0223\u023b\7&\2\2\u0224"+
		"\u023b\7\'\2\2\u0225\u023b\7(\2\2\u0226\u023b\7)\2\2\u0227\u023b\7*\2"+
		"\2\u0228\u023b\7+\2\2\u0229\u023b\7,\2\2\u022a\u023b\7-\2\2\u022b\u023b"+
		"\7.\2\2\u022c\u023b\7/\2\2\u022d\u023b\7\23\2\2\u022e\u023b\7\24\2\2\u022f"+
		"\u023b\7\60\2\2\u0230\u023b\7\61\2\2\u0231\u023b\7\62\2\2\u0232\u023b"+
		"\7\63\2\2\u0233\u023b\7\b\2\2\u0234\u023b\7\64\2\2\u0235\u023b\7\65\2"+
		"\2\u0236\u0237\7\3\2\2\u0237\u023b\7\4\2\2\u0238\u0239\7\35\2\2\u0239"+
		"\u023b\7\36\2\2\u023a\u020d\3\2\2\2\u023a\u0212\3\2\2\2\u023a\u0213\3"+
		"\2\2\2\u023a\u0214\3\2\2\2\u023a\u0215\3\2\2\2\u023a\u0216\3\2\2\2\u023a"+
		"\u0217\3\2\2\2\u023a\u0218\3\2\2\2\u023a\u0219\3\2\2\2\u023a\u021a\3\2"+
		"\2\2\u023a\u021b\3\2\2\2\u023a\u021c\3\2\2\2\u023a\u021d\3\2\2\2\u023a"+
		"\u021e\3\2\2\2\u023a\u021f\3\2\2\2\u023a\u0220\3\2\2\2\u023a\u0221\3\2"+
		"\2\2\u023a\u0222\3\2\2\2\u023a\u0223\3\2\2\2\u023a\u0224\3\2\2\2\u023a"+
		"\u0225\3\2\2\2\u023a\u0226\3\2\2\2\u023a\u0227\3\2\2\2\u023a\u0228\3\2"+
		"\2\2\u023a\u0229\3\2\2\2\u023a\u022a\3\2\2\2\u023a\u022b\3\2\2\2\u023a"+
		"\u022c\3\2\2\2\u023a\u022d\3\2\2\2\u023a\u022e\3\2\2\2\u023a\u022f\3\2"+
		"\2\2\u023a\u0230\3\2\2\2\u023a\u0231\3\2\2\2\u023a\u0232\3\2\2\2\u023a"+
		"\u0233\3\2\2\2\u023a\u0234\3\2\2\2\u023a\u0235\3\2\2\2\u023a\u0236\3\2"+
		"\2\2\u023a\u0238\3\2\2\2\u023bS\3\2\2\2\u023c\u023d\t\n\2\2\u023dU\3\2"+
		"\2\2\u023e\u023f\t\13\2\2\u023fW\3\2\2\2\u0240\u0241\7d\2\2\u0241\u0242"+
		"\7\t\2\2\u0242\u0243\5Z.\2\u0243\u0244\7\n\2\2\u0244Y\3\2\2\2\u0245\u0246"+
		"\7\t\2\2\u0246\u0247\5Z.\2\u0247\u0248\7\n\2\2\u0248\u024f\3\2\2\2\u0249"+
		"\u024a\7\3\2\2\u024a\u024b\5Z.\2\u024b\u024c\7\4\2\2\u024c\u024f\3\2\2"+
		"\2\u024d\u024f\5d\63\2\u024e\u0245\3\2\2\2\u024e\u0249\3\2\2\2\u024e\u024d"+
		"\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251"+
		"[\3\2\2\2\u0252\u0253\7q\2\2\u0253]\3\2\2\2\u0254\u0255\n\f\2\2\u0255"+
		"_\3\2\2\2\u0256\u0257\n\r\2\2\u0257a\3\2\2\2\u0258\u0259\n\16\2\2\u0259"+
		"c\3\2\2\2\u025a\u025b\n\17\2\2\u025be\3\2\2\2\u025c\u025d\n\20\2\2\u025d"+
		"g\3\2\2\2\u025e\u025f\n\21\2\2\u025fi\3\2\2\2\u0260\u0261\n\22\2\2\u0261"+
		"k\3\2\2\2\u0262\u0263\n\23\2\2\u0263m\3\2\2\2\u0264\u0265\n\24\2\2\u0265"+
		"o\3\2\2\2\u0266\u0267\n\r\2\2\u0267q\3\2\2\2\u0268\u0269\13\2\2\2\u0269"+
		"s\3\2\2\2\u026a\u026f\5v<\2\u026b\u026c\7r\2\2\u026c\u026e\7q\2\2\u026d"+
		"\u026b\3\2\2\2\u026e\u0271\3\2\2\2\u026f\u026d\3\2\2\2\u026f\u0270\3\2"+
		"\2\2\u0270\u0280\3\2\2\2\u0271\u026f\3\2\2\2\u0272\u0274\7q\2\2\u0273"+
		"\u0272\3\2\2\2\u0274\u0277\3\2\2\2\u0275\u0273\3\2\2\2\u0275\u0276\3\2"+
		"\2\2\u0276\u0278\3\2\2\2\u0277\u0275\3\2\2\2\u0278\u027c\7\b\2\2\u0279"+
		"\u027b\7q\2\2\u027a\u0279\3\2\2\2\u027b\u027e\3\2\2\2\u027c\u027a\3\2"+
		"\2\2\u027c\u027d\3\2\2\2\u027d\u027f\3\2\2\2\u027e\u027c\3\2\2\2\u027f"+
		"\u0281\5t;\2\u0280\u0275\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0286\3\2\2"+
		"\2\u0282\u0283\7r\2\2\u0283\u0285\7q\2\2\u0284\u0282\3\2\2\2\u0285\u0288"+
		"\3\2\2\2\u0286\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287u\3\2\2\2\u0288"+
		"\u0286\3\2\2\2\u0289\u0299\5x=\2\u028a\u028c\7q\2\2\u028b\u028a\3\2\2"+
		"\2\u028c\u028f\3\2\2\2\u028d\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u0290"+
		"\3\2\2\2\u028f\u028d\3\2\2\2\u0290\u0294\5T+\2\u0291\u0293\7q\2\2\u0292"+
		"\u0291\3\2\2\2\u0293\u0296\3\2\2\2\u0294\u0292\3\2\2\2\u0294\u0295\3\2"+
		"\2\2\u0295\u0297\3\2\2\2\u0296\u0294\3\2\2\2\u0297\u0298\5v<\2\u0298\u029a"+
		"\3\2\2\2\u0299\u028d\3\2\2\2\u0299\u029a\3\2\2\2\u029aw\3\2\2\2\u029b"+
		"\u02bb\5z>\2\u029c\u02a0\5z>\2\u029d\u029f\7q\2\2\u029e\u029d\3\2\2\2"+
		"\u029f\u02a2\3\2\2\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a3"+
		"\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a3\u02a7\7\66\2\2\u02a4\u02a6\7q\2\2\u02a5"+
		"\u02a4\3\2\2\2\u02a6\u02a9\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8\3\2"+
		"\2\2\u02a8\u02aa\3\2\2\2\u02a9\u02a7\3\2\2\2\u02aa\u02ae\5t;\2\u02ab\u02ad"+
		"\7q\2\2\u02ac\u02ab\3\2\2\2\u02ad\u02b0\3\2\2\2\u02ae\u02ac\3\2\2\2\u02ae"+
		"\u02af\3\2\2\2\u02af\u02b1\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b1\u02b5\7\6"+
		"\2\2\u02b2\u02b4\7q\2\2\u02b3\u02b2\3\2\2\2\u02b4\u02b7\3\2\2\2\u02b5"+
		"\u02b3\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b8\3\2\2\2\u02b7\u02b5\3\2"+
		"\2\2\u02b8\u02b9\5x=\2\u02b9\u02bb\3\2\2\2\u02ba\u029b\3\2\2\2\u02ba\u029c"+
		"\3\2\2\2\u02bby\3\2\2\2\u02bc\u02cb\5|?\2\u02bd\u02bf\7q\2\2\u02be\u02bd"+
		"\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1"+
		"\u02c3\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c7\7\61\2\2\u02c4\u02c6\7"+
		"q\2\2\u02c5\u02c4\3\2\2\2\u02c6\u02c9\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c7"+
		"\u02c8\3\2\2\2\u02c8\u02ca\3\2\2\2\u02c9\u02c7\3\2\2\2\u02ca\u02cc\5z"+
		">\2\u02cb\u02c0\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc{\3\2\2\2\u02cd\u02dc"+
		"\5~@\2\u02ce\u02d0\7q\2\2\u02cf\u02ce\3\2\2\2\u02d0\u02d3\3\2\2\2\u02d1"+
		"\u02cf\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d4\3\2\2\2\u02d3\u02d1\3\2"+
		"\2\2\u02d4\u02d8\7\60\2\2\u02d5\u02d7\7q\2\2\u02d6\u02d5\3\2\2\2\u02d7"+
		"\u02da\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02db\3\2"+
		"\2\2\u02da\u02d8\3\2\2\2\u02db\u02dd\5|?\2\u02dc\u02d1\3\2\2\2\u02dc\u02dd"+
		"\3\2\2\2\u02dd}\3\2\2\2\u02de\u02ed\5\u0080A\2\u02df\u02e1\7q\2\2\u02e0"+
		"\u02df\3\2\2\2\u02e1\u02e4\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2"+
		"\2\2\u02e3\u02e5\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e5\u02e9\7!\2\2\u02e6"+
		"\u02e8\7q\2\2\u02e7\u02e6\3\2\2\2\u02e8\u02eb\3\2\2\2\u02e9\u02e7\3\2"+
		"\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02ec\3\2\2\2\u02eb\u02e9\3\2\2\2\u02ec"+
		"\u02ee\5~@\2\u02ed\u02e2\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\177\3\2\2\2"+
		"\u02ef\u02fe\5\u0082B\2\u02f0\u02f2\7q\2\2\u02f1\u02f0\3\2\2\2\u02f2\u02f5"+
		"\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f6\3\2\2\2\u02f5"+
		"\u02f3\3\2\2\2\u02f6\u02fa\7 \2\2\u02f7\u02f9\7q\2\2\u02f8\u02f7\3\2\2"+
		"\2\u02f9\u02fc\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fd"+
		"\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fd\u02ff\5\u0080A\2\u02fe\u02f3\3\2\2"+
		"\2\u02fe\u02ff\3\2\2\2\u02ff\u0081\3\2\2\2\u0300\u030f\5\u0084C\2\u0301"+
		"\u0303\7q\2\2\u0302\u0301\3\2\2\2\u0303\u0306\3\2\2\2\u0304\u0302\3\2"+
		"\2\2\u0304\u0305\3\2\2\2\u0305\u0307\3\2\2\2\u0306\u0304\3\2\2\2\u0307"+
		"\u030b\7\16\2\2\u0308\u030a\7q\2\2\u0309\u0308\3\2\2\2\u030a\u030d\3\2"+
		"\2\2\u030b\u0309\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030e\3\2\2\2\u030d"+
		"\u030b\3\2\2\2\u030e\u0310\5\u0082B\2\u030f\u0304\3\2\2\2\u030f\u0310"+
		"\3\2\2\2\u0310\u0083\3\2\2\2\u0311\u0321\5\u0086D\2\u0312\u0314\7q\2\2"+
		"\u0313\u0312\3\2\2\2\u0314\u0317\3\2\2\2\u0315\u0313\3\2\2\2\u0315\u0316"+
		"\3\2\2\2\u0316\u0318\3\2\2\2\u0317\u0315\3\2\2\2\u0318\u031c\5V,\2\u0319"+
		"\u031b\7q\2\2\u031a\u0319\3\2\2\2\u031b\u031e\3\2\2\2\u031c\u031a\3\2"+
		"\2\2\u031c\u031d\3\2\2\2\u031d\u031f\3\2\2\2\u031e\u031c\3\2\2\2\u031f"+
		"\u0320\5\u0084C\2\u0320\u0322\3\2\2\2\u0321\u0315\3\2\2\2\u0321\u0322"+
		"\3\2\2\2\u0322\u0085\3\2\2\2\u0323\u0333\5\u0088E\2\u0324\u0326\7q\2\2"+
		"\u0325\u0324\3\2\2\2\u0326\u0329\3\2\2\2\u0327\u0325\3\2\2\2\u0327\u0328"+
		"\3\2\2\2\u0328\u032a\3\2\2\2\u0329\u0327\3\2\2\2\u032a\u032e\5H%\2\u032b"+
		"\u032d\7q\2\2\u032c\u032b\3\2\2\2\u032d\u0330\3\2\2\2\u032e\u032c\3\2"+
		"\2\2\u032e\u032f\3\2\2\2\u032f\u0331\3\2\2\2\u0330\u032e\3\2\2\2\u0331"+
		"\u0332\5\u0086D\2\u0332\u0334\3\2\2\2\u0333\u0327\3\2\2\2\u0333\u0334"+
		"\3\2\2\2\u0334\u0087\3\2\2\2\u0335\u0344\5\u008aF\2\u0336\u0338\7q\2\2"+
		"\u0337\u0336\3\2\2\2\u0338\u033b\3\2\2\2\u0339\u0337\3\2\2\2\u0339\u033a"+
		"\3\2\2\2\u033a\u033c\3\2\2\2\u033b\u0339\3\2\2\2\u033c\u0340\t\25\2\2"+
		"\u033d\u033f\7q\2\2\u033e\u033d\3\2\2\2\u033f\u0342\3\2\2\2\u0340\u033e"+
		"\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u0343\3\2\2\2\u0342\u0340\3\2\2\2\u0343"+
		"\u0345\5\u0088E\2\u0344\u0339\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0089"+
		"\3\2\2\2\u0346\u0355\5\u008cG\2\u0347\u0349\7q\2\2\u0348\u0347\3\2\2\2"+
		"\u0349\u034c\3\2\2\2\u034a\u0348\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u034d"+
		"\3\2\2\2\u034c\u034a\3\2\2\2\u034d\u0351\t\26\2\2\u034e\u0350\7q\2\2\u034f"+
		"\u034e\3\2\2\2\u0350\u0353\3\2\2\2\u0351\u034f\3\2\2\2\u0351\u0352\3\2"+
		"\2\2\u0352\u0354\3\2\2\2\u0353\u0351\3\2\2\2\u0354\u0356\5\u008aF\2\u0355"+
		"\u034a\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u008b\3\2\2\2\u0357\u0366\5\u008e"+
		"H\2\u0358\u035a\7q\2\2\u0359\u0358\3\2\2\2\u035a\u035d\3\2\2\2\u035b\u0359"+
		"\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035e\3\2\2\2\u035d\u035b\3\2\2\2\u035e"+
		"\u0362\t\27\2\2\u035f\u0361\7q\2\2\u0360\u035f\3\2\2\2\u0361\u0364\3\2"+
		"\2\2\u0362\u0360\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0365\3\2\2\2\u0364"+
		"\u0362\3\2\2\2\u0365\u0367\5\u008cG\2\u0366\u035b\3\2\2\2\u0366\u0367"+
		"\3\2\2\2\u0367\u008d\3\2\2\2\u0368\u0369\7\3\2\2\u0369\u036a\5\u0090I"+
		"\2\u036a\u036b\7\4\2\2\u036b\u036c\5\u008eH\2\u036c\u036f\3\2\2\2\u036d"+
		"\u036f\5\u0092J\2\u036e\u0368\3\2\2\2\u036e\u036d\3\2\2\2\u036f\u008f"+
		"\3\2\2\2\u0370\u037a\5\u00c4c\2\u0371\u0373\7q\2\2\u0372\u0371\3\2\2\2"+
		"\u0373\u0376\3\2\2\2\u0374\u0372\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0377"+
		"\3\2\2\2\u0376\u0374\3\2\2\2\u0377\u0379\5N(\2\u0378\u0374\3\2\2\2\u0379"+
		"\u037c\3\2\2\2\u037a\u0378\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u0091\3\2"+
		"\2\2\u037c\u037a\3\2\2\2\u037d\u0383\5\u0096L\2\u037e\u0383\5\u0098M\2"+
		"\u037f\u0383\5\u0094K\2\u0380\u0383\5\u00a4S\2\u0381\u0383\5\u009cO\2"+
		"\u0382\u037d\3\2\2\2\u0382\u037e\3\2\2\2\u0382\u037f\3\2\2\2\u0382\u0380"+
		"\3\2\2\2\u0382\u0381\3\2\2\2\u0383\u0093\3\2\2\2\u0384\u0386\7\67\2\2"+
		"\u0385\u0384\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u038b"+
		"\7e\2\2\u0388\u038a\7q\2\2\u0389\u0388\3\2\2\2\u038a\u038d\3\2\2\2\u038b"+
		"\u0389\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u038e\3\2\2\2\u038d\u038b\3\2"+
		"\2\2\u038e\u0392\5\u00c4c\2\u038f\u0391\7q\2\2\u0390\u038f\3\2\2\2\u0391"+
		"\u0394\3\2\2\2\u0392\u0390\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0395\3\2"+
		"\2\2\u0394\u0392\3\2\2\2\u0395\u0397\7\35\2\2\u0396\u0398\5x=\2\u0397"+
		"\u0396\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u039a\7\36"+
		"\2\2\u039a\u03b3\3\2\2\2\u039b\u039d\7\67\2\2\u039c\u039b\3\2\2\2\u039c"+
		"\u039d\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u03a2\7e\2\2\u039f\u03a1\7q\2"+
		"\2\u03a0\u039f\3\2\2\2\u03a1\u03a4\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a2\u03a3"+
		"\3\2\2\2\u03a3\u03a5\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a5\u03a9\5\u00c4c"+
		"\2\u03a6\u03a8\7q\2\2\u03a7\u03a6\3\2\2\2\u03a8\u03ab\3\2\2\2\u03a9\u03a7"+
		"\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ac\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ac"+
		"\u03ae\7\3\2\2\u03ad\u03af\5t;\2\u03ae\u03ad\3\2\2\2\u03ae\u03af\3\2\2"+
		"\2\u03af\u03b0\3\2\2\2\u03b0\u03b1\7\4\2\2\u03b1\u03b3\3\2\2\2\u03b2\u0385"+
		"\3\2\2\2\u03b2\u039c\3\2\2\2\u03b3\u0095\3\2\2\2\u03b4\u03b8\5F$\2\u03b5"+
		"\u03b7\7q\2\2\u03b6\u03b5\3\2\2\2\u03b7\u03ba\3\2\2\2\u03b8\u03b6\3\2"+
		"\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03bb\3\2\2\2\u03ba\u03b8\3\2\2\2\u03bb"+
		"\u03bc\5\u008eH\2\u03bc\u0097\3\2\2\2\u03bd\u03c1\5\u009aN\2\u03be\u03c0"+
		"\7q\2\2\u03bf\u03be\3\2\2\2\u03c0\u03c3\3\2\2\2\u03c1\u03bf\3\2\2\2\u03c1"+
		"\u03c2\3\2\2\2\u03c2\u03c4\3\2\2\2\u03c3\u03c1\3\2\2\2\u03c4\u03c5\7\3"+
		"\2\2\u03c5\u03c6\5\u009eP\2\u03c6\u03c7\7\4\2\2\u03c7\u03d2\3\2\2\2\u03c8"+
		"\u03cc\5\u009aN\2\u03c9\u03cb\7q\2\2\u03ca\u03c9\3\2\2\2\u03cb\u03ce\3"+
		"\2\2\2\u03cc\u03ca\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03cf\3\2\2\2\u03ce"+
		"\u03cc\3\2\2\2\u03cf\u03d0\5\u00a0Q\2\u03d0\u03d2\3\2\2\2\u03d1\u03bd"+
		"\3\2\2\2\u03d1\u03c8\3\2\2\2\u03d2\u0099\3\2\2\2\u03d3\u03d4\78\2\2\u03d4"+
		"\u009b\3\2\2\2\u03d5\u03d9\79\2\2\u03d6\u03d8\7q\2\2\u03d7\u03d6\3\2\2"+
		"\2\u03d8\u03db\3\2\2\2\u03d9\u03d7\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03dc"+
		"\3\2\2\2\u03db\u03d9\3\2\2\2\u03dc\u03dd\7\3\2\2\u03dd\u03de\5t;\2\u03de"+
		"\u03df\7\4\2\2\u03df\u03e9\3\2\2\2\u03e0\u03e4\79\2\2\u03e1\u03e3\7q\2"+
		"\2\u03e2\u03e1\3\2\2\2\u03e3\u03e6\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e4\u03e5"+
		"\3\2\2\2\u03e5\u03e7\3\2\2\2\u03e6\u03e4\3\2\2\2\u03e7\u03e9\5t;\2\u03e8"+
		"\u03d5\3\2\2\2\u03e8\u03e0\3\2\2\2\u03e9\u009d\3\2\2\2\u03ea\u03f4\5\u00c4"+
		"c\2\u03eb\u03ed\7q\2\2\u03ec\u03eb\3\2\2\2\u03ed\u03f0\3\2\2\2\u03ee\u03ec"+
		"\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f1\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f1"+
		"\u03f3\5N(\2\u03f2\u03ee\3\2\2\2\u03f3\u03f6\3\2\2\2\u03f4\u03f2\3\2\2"+
		"\2\u03f4\u03f5\3\2\2\2\u03f5\u009f\3\2\2\2\u03f6\u03f4\3\2\2\2\u03f7\u03f8"+
		"\5\u0092J\2\u03f8\u00a1\3\2\2\2\u03f9\u03fa\t\30\2\2\u03fa\u00a3\3\2\2"+
		"\2\u03fb\u03fc\bS\1\2\u03fc\u0407\5\u00aaV\2\u03fd\u0401\5\u00a2R\2\u03fe"+
		"\u0400\7q\2\2\u03ff\u03fe\3\2\2\2\u0400\u0403\3\2\2\2\u0401\u03ff\3\2"+
		"\2\2\u0401\u0402\3\2\2\2\u0402\u0404\3\2\2\2\u0403\u0401\3\2\2\2\u0404"+
		"\u0405\5\u00aaV\2\u0405\u0407\3\2\2\2\u0406\u03fb\3\2\2\2\u0406\u03fd"+
		"\3\2\2\2\u0407\u0440\3\2\2\2\u0408\u040c\f\t\2\2\u0409\u040b\7q\2\2\u040a"+
		"\u0409\3\2\2\2\u040b\u040e\3\2\2\2\u040c\u040a\3\2\2\2\u040c\u040d\3\2"+
		"\2\2\u040d\u040f\3\2\2\2\u040e\u040c\3\2\2\2\u040f\u0410\7\35\2\2\u0410"+
		"\u0411\5t;\2\u0411\u0412\7\36\2\2\u0412\u043f\3\2\2\2\u0413\u0417\f\b"+
		"\2\2\u0414\u0416\7q\2\2\u0415\u0414\3\2\2\2\u0416\u0419\3\2\2\2\u0417"+
		"\u0415\3\2\2\2\u0417\u0418\3\2\2\2\u0418\u041a\3\2\2\2\u0419\u0417\3\2"+
		"\2\2\u041a\u041b\7\3\2\2\u041b\u041c\5\u00a6T\2\u041c\u041d\7\4\2\2\u041d"+
		"\u043f\3\2\2\2\u041e\u041f\f\7\2\2\u041f\u0423\7\13\2\2\u0420\u0422\7"+
		"q\2\2\u0421\u0420\3\2\2\2\u0422\u0425\3\2\2\2\u0423\u0421\3\2\2\2\u0423"+
		"\u0424\3\2\2\2\u0424\u0427\3\2\2\2\u0425\u0423\3\2\2\2\u0426\u0428\7d"+
		"\2\2\u0427\u0426\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u0429\3\2\2\2\u0429"+
		"\u043f\5\u00d2j\2\u042a\u042b\f\6\2\2\u042b\u042f\7\65\2\2\u042c\u042e"+
		"\7q\2\2\u042d\u042c\3\2\2\2\u042e\u0431\3\2\2\2\u042f\u042d\3\2\2\2\u042f"+
		"\u0430\3\2\2\2\u0430\u0433\3\2\2\2\u0431\u042f\3\2\2\2\u0432\u0434\7d"+
		"\2\2\u0433\u0432\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u0435\3\2\2\2\u0435"+
		"\u043f\5\u00d2j\2\u0436\u043a\f\5\2\2\u0437\u0439\7q\2\2\u0438\u0437\3"+
		"\2\2\2\u0439\u043c\3\2\2\2\u043a\u0438\3\2\2\2\u043a\u043b\3\2\2\2\u043b"+
		"\u043d\3\2\2\2\u043c\u043a\3\2\2\2\u043d\u043f\5\u00a2R\2\u043e\u0408"+
		"\3\2\2\2\u043e\u0413\3\2\2\2\u043e\u041e\3\2\2\2\u043e\u042a\3\2\2\2\u043e"+
		"\u0436\3\2\2\2\u043f\u0442\3\2\2\2\u0440\u043e\3\2\2\2\u0440\u0441\3\2"+
		"\2\2\u0441\u00a5\3\2\2\2\u0442\u0440\3\2\2\2\u0443\u0445\5\u00a8U\2\u0444"+
		"\u0443\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u0444\3\2\2\2\u0446\u0447\3\2"+
		"\2\2\u0447\u0456\3\2\2\2\u0448\u044c\7\b\2\2\u0449\u044b\7q\2\2\u044a"+
		"\u0449\3\2\2\2\u044b\u044e\3\2\2\2\u044c\u044a\3\2\2\2\u044c\u044d\3\2"+
		"\2\2\u044d\u0450\3\2\2\2\u044e\u044c\3\2\2\2\u044f\u0451\5\u00a8U\2\u0450"+
		"\u044f\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0450\3\2\2\2\u0452\u0453\3\2"+
		"\2\2\u0453\u0455\3\2\2\2\u0454\u0448\3\2\2\2\u0455\u0458\3\2\2\2\u0456"+
		"\u0454\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u045a\3\2\2\2\u0458\u0456\3\2"+
		"\2\2\u0459\u0444\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u00a7\3\2\2\2\u045b"+
		"\u045f\5v<\2\u045c\u045e\7q\2\2\u045d\u045c\3\2\2\2\u045e\u0461\3\2\2"+
		"\2\u045f\u045d\3\2\2\2\u045f\u0460\3\2\2\2\u0460\u00a9\3\2\2\2\u0461\u045f"+
		"\3\2\2\2\u0462\u0469\5\u00d2j\2\u0463\u0469\5J&\2\u0464\u0465\7\3\2\2"+
		"\u0465\u0466\5t;\2\u0466\u0467\7\4\2\2\u0467\u0469\3\2\2\2\u0468\u0462"+
		"\3\2\2\2\u0468\u0463\3\2\2\2\u0468\u0464\3\2\2\2\u0469\u00ab\3\2\2\2\u046a"+
		"\u046b\5\u00aeX\2\u046b\u046d\7\3\2\2\u046c\u046e\5t;\2\u046d\u046c\3"+
		"\2\2\2\u046d\u046e\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0470\7\4\2\2\u0470"+
		"\u0477\3\2\2\2\u0471\u0472\5\u00aeX\2\u0472\u0473\7\7\2\2\u0473\u0474"+
		"\5\u00b8]\2\u0474\u0477\3\2\2\2\u0475\u0477\5\u00aeX\2\u0476\u046a\3\2"+
		"\2\2\u0476\u0471\3\2\2\2\u0476\u0475\3\2\2\2\u0477\u00ad\3\2\2\2\u0478"+
		"\u047a\5\u00d6l\2\u0479\u0478\3\2\2\2\u0479\u047a\3\2\2\2\u047a\u047b"+
		"\3\2\2\2\u047b\u047d\5\u00d2j\2\u047c\u047e\5\u00b0Y\2\u047d\u047c\3\2"+
		"\2\2\u047d\u047e\3\2\2\2\u047e\u0489\3\2\2\2\u047f\u0481\5\u00d6l\2\u0480"+
		"\u047f\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0483\7\3"+
		"\2\2\u0483\u0484\5\u00d8m\2\u0484\u0485\5\u00d2j\2\u0485\u0486\7\4\2\2"+
		"\u0486\u0487\5\u00b0Y\2\u0487\u0489\3\2\2\2\u0488\u0479\3\2\2\2\u0488"+
		"\u0480\3\2\2\2\u0489\u00af\3\2\2\2\u048a\u048c\7\35\2\2\u048b\u048d\5"+
		"x=\2\u048c\u048b\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u048e\3\2\2\2\u048e"+
		"\u0491\7\36\2\2\u048f\u0491\5\u00ccg\2\u0490\u048a\3\2\2\2\u0490\u048f"+
		"\3\2\2\2\u0491\u00b1\3\2\2\2\u0492\u0493\5\u00b4[\2\u0493\u00b3\3\2\2"+
		"\2\u0494\u0496\7F\2\2\u0495\u0494\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u0498"+
		"\3\2\2\2\u0497\u0499\5X-\2\u0498\u0497\3\2\2\2\u0498\u0499\3\2\2\2\u0499"+
		"\u049a\3\2\2\2\u049a\u049c\5\u00bc_\2\u049b\u049d\5\u00b6\\\2\u049c\u049b"+
		"\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u04a8\3\2\2\2\u049e\u04a0\7F\2\2\u049f"+
		"\u049e\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a2\3\2\2\2\u04a1\u04a3\5X"+
		"-\2\u04a2\u04a1\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4"+
		"\u04a5\5\u00c4c\2\u04a5\u04a6\5\u00b6\\\2\u04a6\u04a8\3\2\2\2\u04a7\u0495"+
		"\3\2\2\2\u04a7\u049f\3\2\2\2\u04a8\u00b5\3\2\2\2\u04a9\u04ae\5\u00acW"+
		"\2\u04aa\u04ab\7\b\2\2\u04ab\u04ad\5\u00acW\2\u04ac\u04aa\3\2\2\2\u04ad"+
		"\u04b0\3\2\2\2\u04ae\u04ac\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u04b1\3\2"+
		"\2\2\u04b0\u04ae\3\2\2\2\u04b1\u04b2\7\5\2\2\u04b2\u00b7\3\2\2\2\u04b3"+
		"\u04bb\5v<\2\u04b4\u04b5\7h\2\2\u04b5\u04b6\5\u00ba^\2\u04b6\u04b7\7i"+
		"\2\2\u04b7\u04bb\3\2\2\2\u04b8\u04b9\7h\2\2\u04b9\u04bb\7i\2\2\u04ba\u04b3"+
		"\3\2\2\2\u04ba\u04b4\3\2\2\2\u04ba\u04b8\3\2\2\2\u04bb\u00b9\3\2\2\2\u04bc"+
		"\u04c1\5\u00b8]\2\u04bd\u04be\7\b\2\2\u04be\u04c0\5\u00b8]\2\u04bf\u04bd"+
		"\3\2\2\2\u04c0\u04c3\3\2\2\2\u04c1\u04bf\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2"+
		"\u00bb\3\2\2\2\u04c3\u04c1\3\2\2\2\u04c4\u04c6\7f\2\2\u04c5\u04c7\5\u00be"+
		"`\2\u04c6\u04c5\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7\u04c9\3\2\2\2\u04c8"+
		"\u04ca\5\u00c0a\2\u04c9\u04c8\3\2\2\2\u04c9\u04ca\3\2\2\2\u04ca\u04cb"+
		"\3\2\2\2\u04cb\u04cc\7h\2\2\u04cc\u04cd\b_\1\2\u04cd\u00bd\3\2\2\2\u04ce"+
		"\u04cf\5\u00d2j\2\u04cf\u00bf\3\2\2\2\u04d0\u04d1\7\6\2\2\u04d1\u04d6"+
		"\5\u00c2b\2\u04d2\u04d3\7\b\2\2\u04d3\u04d5\5\u00c2b\2\u04d4\u04d2\3\2"+
		"\2\2\u04d5\u04d8\3\2\2\2\u04d6\u04d4\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7"+
		"\u00c1\3\2\2\2\u04d8\u04d6\3\2\2\2\u04d9\u04db\7L\2\2\u04da\u04d9\3\2"+
		"\2\2\u04da\u04db\3\2\2\2\u04db\u04dd\3\2\2\2\u04dc\u04de\5P)\2\u04dd\u04dc"+
		"\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u04e0\5\u00d2j"+
		"\2\u04e0\u00c3\3\2\2\2\u04e1\u04e3\7K\2\2\u04e2\u04e1\3\2\2\2\u04e3\u04e6"+
		"\3\2\2\2\u04e4\u04e2\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e8\3\2\2\2\u04e6"+
		"\u04e4\3\2\2\2\u04e7\u04e9\t\31\2\2\u04e8\u04e7\3\2\2\2\u04e8\u04e9\3"+
		"\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04ef\5\u00c6d\2\u04eb\u04ec\7\t\2\2"+
		"\u04ec\u04ed\5Z.\2\u04ed\u04ee\7\n\2\2\u04ee\u04f0\3\2\2\2\u04ef\u04eb"+
		"\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u04fb\3\2\2\2\u04f1\u04f2\7\67\2\2"+
		"\u04f2\u04f7\5\u00c6d\2\u04f3\u04f4\7\t\2\2\u04f4\u04f5\5Z.\2\u04f5\u04f6"+
		"\7\n\2\2\u04f6\u04f8\3\2\2\2\u04f7\u04f3\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8"+
		"\u04fa\3\2\2\2\u04f9\u04f1\3\2\2\2\u04fa\u04fd\3\2\2\2\u04fb\u04f9\3\2"+
		"\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04ff\3\2\2\2\u04fd\u04fb\3\2\2\2\u04fe"+
		"\u0500\7K\2\2\u04ff\u04fe\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u0504\3\2"+
		"\2\2\u0501\u0504\7H\2\2\u0502\u0504\7I\2\2\u0503\u04e4\3\2\2\2\u0503\u0501"+
		"\3\2\2\2\u0503\u0502\3\2\2\2\u0504\u00c5\3\2\2\2\u0505\u0507\t\32\2\2"+
		"\u0506\u0505\3\2\2\2\u0507\u0508\3\2\2\2\u0508\u0506\3\2\2\2\u0508\u0509"+
		"\3\2\2\2\u0509\u00c7\3\2\2\2\u050a\u050c\t\33\2\2\u050b\u050a\3\2\2\2"+
		"\u050b\u050c\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u050e\5\u00c4c\2\u050e"+
		"\u00c9\3\2\2\2\u050f\u0510\5\u00d2j\2\u0510\u00cb\3\2\2\2\u0511\u0512"+
		"\7\3\2\2\u0512\u0513\7G\2\2\u0513\u0521\7\4\2\2\u0514\u051d\7\3\2\2\u0515"+
		"\u051a\5\u00ceh\2\u0516\u0517\7\b\2\2\u0517\u0519\5\u00ceh\2\u0518\u0516"+
		"\3\2\2\2\u0519\u051c\3\2\2\2\u051a\u0518\3\2\2\2\u051a\u051b\3\2\2\2\u051b"+
		"\u051e\3\2\2\2\u051c\u051a\3\2\2\2\u051d\u0515\3\2\2\2\u051d\u051e\3\2"+
		"\2\2\u051e\u051f\3\2\2\2\u051f\u0521\7\4\2\2\u0520\u0511\3\2\2\2\u0520"+
		"\u0514\3\2\2\2\u0521\u00cd\3\2\2\2\u0522\u0523\5\u00c8e\2\u0523\u0524"+
		"\5\u00d0i\2\u0524\u00cf\3\2\2\2\u0525\u0527\5\u00d6l\2\u0526\u0525\3\2"+
		"\2\2\u0526\u0527\3\2\2\2\u0527\u052f\3\2\2\2\u0528\u0529\7\3\2\2\u0529"+
		"\u052a\5\u00d0i\2\u052a\u052b\7\4\2\2\u052b\u0530\3\2\2\2\u052c\u052e"+
		"\5\u00caf\2\u052d\u052c\3\2\2\2\u052d\u052e\3\2\2\2\u052e\u0530\3\2\2"+
		"\2\u052f\u0528\3\2\2\2\u052f\u052d\3\2\2\2\u0530\u0532\3\2\2\2\u0531\u0533"+
		"\5\u00b0Y\2\u0532\u0531\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u00d1\3\2\2"+
		"\2\u0534\u0539\7g\2\2\u0535\u0536\7\67\2\2\u0536\u0538\7g\2\2\u0537\u0535"+
		"\3\2\2\2\u0538\u053b\3\2\2\2\u0539\u0537\3\2\2\2\u0539\u053a\3\2\2\2\u053a"+
		"\u053e\3\2\2\2\u053b\u0539\3\2\2\2\u053c\u053e\5P)\2\u053d\u0534\3\2\2"+
		"\2\u053d\u053c\3\2\2\2\u053e\u00d3\3\2\2\2\u053f\u0540\t\34\2\2\u0540"+
		"\u00d5\3\2\2\2\u0541\u0543\5N(\2\u0542\u0544\7:\2\2\u0543\u0542\3\2\2"+
		"\2\u0543\u0544\3\2\2\2\u0544\u0546\3\2\2\2\u0545\u0541\3\2\2\2\u0546\u0547"+
		"\3\2\2\2\u0547\u0545\3\2\2\2\u0547\u0548\3\2\2\2\u0548\u00d7\3\2\2\2\u0549"+
		"\u054a\5\u00d6l\2\u054a\u00d9\3\2\2\2\u00ab\u00dd\u00ea\u00f7\u0109\u010c"+
		"\u0110\u0114\u011c\u011e\u0124\u0130\u0135\u0138\u013b\u0140\u0145\u014e"+
		"\u0155\u015c\u0161\u0165\u016b\u017e\u0188\u0197\u01a0\u01a5\u01a9\u01b1"+
		"\u01b5\u01bd\u01c5\u01d1\u01d3\u01e3\u01e7\u01ee\u01f4\u01f8\u01fd\u0210"+
		"\u023a\u024e\u0250\u026f\u0275\u027c\u0280\u0286\u028d\u0294\u0299\u02a0"+
		"\u02a7\u02ae\u02b5\u02ba\u02c0\u02c7\u02cb\u02d1\u02d8\u02dc\u02e2\u02e9"+
		"\u02ed\u02f3\u02fa\u02fe\u0304\u030b\u030f\u0315\u031c\u0321\u0327\u032e"+
		"\u0333\u0339\u0340\u0344\u034a\u0351\u0355\u035b\u0362\u0366\u036e\u0374"+
		"\u037a\u0382\u0385\u038b\u0392\u0397\u039c\u03a2\u03a9\u03ae\u03b2\u03b8"+
		"\u03c1\u03cc\u03d1\u03d9\u03e4\u03e8\u03ee\u03f4\u0401\u0406\u040c\u0417"+
		"\u0423\u0427\u042f\u0433\u043a\u043e\u0440\u0446\u044c\u0452\u0456\u0459"+
		"\u045f\u0468\u046d\u0476\u0479\u047d\u0480\u0488\u048c\u0490\u0495\u0498"+
		"\u049c\u049f\u04a2\u04a7\u04ae\u04ba\u04c1\u04c6\u04c9\u04d6\u04da\u04dd"+
		"\u04e4\u04e8\u04ef\u04f7\u04fb\u04ff\u0503\u0508\u050b\u051a\u051d\u0520"+
		"\u0526\u052d\u052f\u0532\u0539\u053d\u0543\u0547";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}