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
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
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
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				newline();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				opening_curly();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				closing_curly();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
				pre_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(226);
				block_starter();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(227);
				jump_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(228);
				label();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(229);
				simple_decl();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(230);
				expr_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(231);
				comment();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(232);
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
			setState(235);
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
			setState(237);
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
			setState(239);
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
			setState(285);
			switch (_input.LA(1)) {
			case TRY:
				_localctx = new Try_statementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(TRY);
				}
				break;
			case CATCH:
				_localctx = new Catch_statementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				match(CATCH);
				setState(243);
				match(T__0);
				setState(246);
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
					setState(244);
					param_type();
					}
					break;
				case ELLIPSIS:
					{
					setState(245);
					match(ELLIPSIS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(248);
				match(T__1);
				}
				break;
			case IF:
				_localctx = new If_statementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				match(IF);
				setState(250);
				match(T__0);
				setState(251);
				condition();
				setState(252);
				match(T__1);
				}
				break;
			case ELSE:
				_localctx = new Else_statementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(254);
				match(ELSE);
				}
				break;
			case SWITCH:
				_localctx = new Switch_statementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(255);
				match(SWITCH);
				setState(256);
				match(T__0);
				setState(257);
				condition();
				setState(258);
				match(T__1);
				}
				break;
			case FOR:
				_localctx = new For_statementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(260);
				match(FOR);
				setState(261);
				match(T__0);
				setState(264);
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
					setState(262);
					for_init_statement();
					}
					break;
				case T__2:
					{
					setState(263);
					match(T__2);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(267);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (VOID - 69)) | (1L << (UNSIGNED - 69)) | (1L << (SIGNED - 69)) | (1L << (LONG - 69)) | (1L << (CV_QUALIFIER - 69)) | (1L << (NEW - 69)) | (1L << (CLASS_KEY - 69)) | (1L << (ALPHA_NUMERIC - 69)) | (1L << (HEX_LITERAL - 69)) | (1L << (DECIMAL_LITERAL - 69)) | (1L << (OCTAL_LITERAL - 69)) | (1L << (FLOATING_POINT_LITERAL - 69)) | (1L << (CHAR - 69)) | (1L << (STRING - 69)))) != 0)) {
					{
					setState(266);
					condition();
					}
				}

				setState(269);
				match(T__2);
				setState(271);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (NEW - 99)) | (1L << (ALPHA_NUMERIC - 99)) | (1L << (HEX_LITERAL - 99)) | (1L << (DECIMAL_LITERAL - 99)) | (1L << (OCTAL_LITERAL - 99)) | (1L << (FLOATING_POINT_LITERAL - 99)) | (1L << (CHAR - 99)) | (1L << (STRING - 99)))) != 0)) {
					{
					setState(270);
					expr();
					}
				}

				setState(273);
				match(T__1);
				setState(275);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(274);
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
				setState(277);
				match(DO);
				}
				break;
			case WHILE:
				_localctx = new While_statementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(278);
				match(WHILE);
				setState(279);
				match(T__0);
				setState(280);
				condition();
				setState(281);
				match(T__1);
				setState(283);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(282);
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
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				simple_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				expr();
				setState(289);
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
			setState(311);
			switch (_input.LA(1)) {
			case BREAK:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				match(BREAK);
				setState(294);
				match(T__2);
				}
				break;
			case CONTINUE:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				match(CONTINUE);
				setState(296);
				match(T__2);
				}
				break;
			case GOTO:
				_localctx = new GotoStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				match(GOTO);
				setState(298);
				identifier();
				setState(299);
				match(T__2);
				}
				break;
			case RETURN:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(301);
				match(RETURN);
				setState(303);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (NEW - 99)) | (1L << (ALPHA_NUMERIC - 99)) | (1L << (HEX_LITERAL - 99)) | (1L << (DECIMAL_LITERAL - 99)) | (1L << (OCTAL_LITERAL - 99)) | (1L << (FLOATING_POINT_LITERAL - 99)) | (1L << (CHAR - 99)) | (1L << (STRING - 99)))) != 0)) {
					{
					setState(302);
					expr();
					}
				}

				setState(305);
				match(T__2);
				}
				break;
			case THROW:
				_localctx = new ThrowStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(306);
				match(THROW);
				setState(308);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (NEW - 99)) | (1L << (ALPHA_NUMERIC - 99)) | (1L << (HEX_LITERAL - 99)) | (1L << (DECIMAL_LITERAL - 99)) | (1L << (OCTAL_LITERAL - 99)) | (1L << (FLOATING_POINT_LITERAL - 99)) | (1L << (CHAR - 99)) | (1L << (STRING - 99)))) != 0)) {
					{
					setState(307);
					expr();
					}
				}

				setState(310);
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
			setState(314);
			_la = _input.LA(1);
			if (_la==CASE) {
				{
				setState(313);
				match(CASE);
				}
			}

			setState(319);
			switch (_input.LA(1)) {
			case T__22:
			case T__23:
			case T__24:
			case ALPHA_NUMERIC:
				{
				setState(316);
				identifier();
				}
				break;
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
				{
				setState(317);
				number();
				}
				break;
			case CHAR:
				{
				setState(318);
				match(CHAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(321);
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
			setState(324);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (NEW - 99)) | (1L << (ALPHA_NUMERIC - 99)) | (1L << (HEX_LITERAL - 99)) | (1L << (DECIMAL_LITERAL - 99)) | (1L << (OCTAL_LITERAL - 99)) | (1L << (FLOATING_POINT_LITERAL - 99)) | (1L << (CHAR - 99)) | (1L << (STRING - 99)))) != 0)) {
				{
				setState(323);
				expr();
				}
			}

			setState(326);
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
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				type_name();
				setState(330);
				declarator();
				setState(331);
				match(T__4);
				setState(332);
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
			setState(338);
			switch (_input.LA(1)) {
			case PRE_IF:
			case PRE_ELIF:
			case PRE_ELSE:
			case PRE_ENDIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
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
				setState(337);
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
			setState(344);
			switch (_input.LA(1)) {
			case PRE_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				pre_if_statement();
				}
				break;
			case PRE_ELIF:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				pre_elif_statement();
				}
				break;
			case PRE_ELSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(342);
				pre_else_statement();
				}
				break;
			case PRE_ENDIF:
				enterOuterAlt(_localctx, 4);
				{
				setState(343);
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
			setState(346);
			match(PRE_IF);
			setState(347);
			pre_if_condition();
			}
		}
		catch (RecognitionException re) {
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
			setState(349);
			match(PRE_ELIF);
			setState(350);
			pre_if_condition();
			}
		}
		catch (RecognitionException re) {
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
			setState(352);
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
			setState(354);
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
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				match(T__0);
				setState(358);
				condition();
				setState(359);
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
			setState(371);
			switch (_input.LA(1)) {
			case PRE_DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				pre_define();
				}
				break;
			case PRE_UNDEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				pre_undef();
				}
				break;
			case PRE_DIAGNOSTIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(365);
				pre_diagnostic();
				}
				break;
			case PRE_OTHER:
				enterOuterAlt(_localctx, 4);
				{
				setState(366);
				pre_other();
				}
				break;
			case PRE_INCLUDE:
				enterOuterAlt(_localctx, 5);
				{
				setState(367);
				pre_include();
				}
				break;
			case PRE_INCLUDE_NEXT:
				enterOuterAlt(_localctx, 6);
				{
				setState(368);
				pre_include_next();
				}
				break;
			case PRE_LINE:
				enterOuterAlt(_localctx, 7);
				{
				setState(369);
				pre_line();
				}
				break;
			case PRE_PRAGMA:
				enterOuterAlt(_localctx, 8);
				{
				setState(370);
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
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				match(PRE_DEFINE);
				setState(374);
				pre_macro_identifier();
				setState(375);
				match(T__0);
				setState(376);
				pre_macro_parameters();
				setState(377);
				match(T__1);
				setState(378);
				pre_macro();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				match(PRE_DEFINE);
				setState(381);
				pre_macro_identifier();
				setState(382);
				pre_macro();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(384);
				match(PRE_DEFINE);
				setState(385);
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
			setState(388);
			match(PRE_UNDEF);
			setState(389);
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
			setState(391);
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
			setState(395);
			switch (_input.LA(1)) {
			case T__22:
			case T__23:
			case T__24:
			case ALPHA_NUMERIC:
				{
				setState(393);
				identifier();
				}
				break;
			case ELLIPSIS:
				{
				setState(394);
				match(ELLIPSIS);
				}
				break;
			case T__1:
			case T__5:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(397);
				match(T__5);
				setState(400);
				switch (_input.LA(1)) {
				case T__22:
				case T__23:
				case T__24:
				case ALPHA_NUMERIC:
					{
					setState(398);
					identifier();
					}
					break;
				case ELLIPSIS:
					{
					setState(399);
					match(ELLIPSIS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(406);
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
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				match(PRE_DIAGNOSTIC);
				setState(410);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
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
			setState(414);
			match(PRE_OTHER);
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(415);
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
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				match(PRE_INCLUDE);
				setState(419);
				pre_include_system_header();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				match(PRE_INCLUDE);
				setState(421);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(422);
				match(PRE_INCLUDE);
				setState(423);
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
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				match(PRE_INCLUDE_NEXT);
				setState(427);
				pre_include_system_header();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				match(PRE_INCLUDE_NEXT);
				setState(429);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(430);
				match(PRE_INCLUDE_NEXT);
				setState(431);
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
			setState(434);
			match(T__6);
			setState(435);
			pre_include_filename();
			setState(436);
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
			setState(438);
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
			setState(446);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(440);
				match(STRING);
				}
				break;
			case T__8:
			case T__9:
			case T__10:
			case ALPHA_NUMERIC:
				{
				setState(442); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(441);
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
					setState(444); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
			setState(462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				match(PRE_LINE);
				setState(449);
				match(DECIMAL_LITERAL);
				setState(450);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				match(PRE_LINE);
				setState(452);
				match(DECIMAL_LITERAL);
				setState(453);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(454);
				match(PRE_LINE);
				setState(455);
				pre_macro_identifier();
				setState(456);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(458);
				match(PRE_LINE);
				setState(459);
				pre_macro_identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(460);
				match(PRE_LINE);
				setState(461);
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
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				match(PRE_PRAGMA);
				setState(466);
				_la = _input.LA(1);
				if (_la==PRE_GCC) {
					{
					setState(465);
					match(PRE_GCC);
					}
				}

				setState(468);
				match(PRE_PRAGMA_KEYWORDS);
				setState(469);
				match(STRING);
				 preProcFindMacroEnd(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				match(PRE_PRAGMA);
				setState(473);
				_la = _input.LA(1);
				if (_la==PRE_GCC) {
					{
					setState(472);
					match(PRE_GCC);
					}
				}

				setState(475);
				match(PRE_PRAGMA_KEYWORDS);
				setState(477); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(476);
						identifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(479); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(481);
				match(PRE_PRAGMA);
				setState(483);
				_la = _input.LA(1);
				if (_la==PRE_GCC) {
					{
					setState(482);
					match(PRE_GCC);
					}
				}

				setState(485);
				match(PRE_PRAGMA_KEYWORDS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(486);
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
			setState(490);
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
			setState(492);
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
			setState(494);
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
			setState(496);
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
			setState(498);
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
			setState(500);
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
			setState(502);
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
			setState(549);
			switch (_input.LA(1)) {
			case T__25:
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(504);
				_la = _input.LA(1);
				if ( !(_la==T__25 || _la==NEW) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(507);
				_la = _input.LA(1);
				if (_la==T__26) {
					{
					setState(505);
					match(T__26);
					setState(506);
					match(T__27);
					}
				}

				}
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				match(T__13);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(510);
				match(T__9);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(511);
				match(T__12);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(512);
				match(T__10);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 6);
				{
				setState(513);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 7);
				{
				setState(514);
				match(T__29);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 8);
				{
				setState(515);
				match(T__11);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 9);
				{
				setState(516);
				match(T__30);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 10);
				{
				setState(517);
				match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 11);
				{
				setState(518);
				match(T__15);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 12);
				{
				setState(519);
				match(T__4);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 13);
				{
				setState(520);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 14);
				{
				setState(521);
				match(T__7);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 15);
				{
				setState(522);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 16);
				{
				setState(523);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 17);
				{
				setState(524);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 18);
				{
				setState(525);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 19);
				{
				setState(526);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 20);
				{
				setState(527);
				match(T__36);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 21);
				{
				setState(528);
				match(T__37);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 22);
				{
				setState(529);
				match(T__38);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 23);
				{
				setState(530);
				match(T__39);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 24);
				{
				setState(531);
				match(T__40);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 25);
				{
				setState(532);
				match(T__41);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 26);
				{
				setState(533);
				match(T__42);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 27);
				{
				setState(534);
				match(T__43);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 28);
				{
				setState(535);
				match(T__44);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 29);
				{
				setState(536);
				match(T__16);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 30);
				{
				setState(537);
				match(T__17);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 31);
				{
				setState(538);
				match(T__45);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 32);
				{
				setState(539);
				match(T__46);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 33);
				{
				setState(540);
				match(T__47);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 34);
				{
				setState(541);
				match(T__48);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 35);
				{
				setState(542);
				match(T__5);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 36);
				{
				setState(543);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 37);
				{
				setState(544);
				match(T__50);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 38);
				{
				setState(545);
				match(T__0);
				setState(546);
				match(T__1);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 39);
				{
				setState(547);
				match(T__26);
				setState(548);
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
			setState(551);
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
			setState(553);
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
			setState(555);
			match(TEMPLATE);
			setState(556);
			match(T__6);
			setState(557);
			template_param_list();
			setState(558);
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
			setState(569); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(569);
				switch (_input.LA(1)) {
				case T__6:
					{
					{
					setState(560);
					match(T__6);
					setState(561);
					template_param_list();
					setState(562);
					match(T__7);
					}
					}
					break;
				case T__0:
					{
					{
					setState(564);
					match(T__0);
					setState(565);
					template_param_list();
					setState(566);
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
					setState(568);
					no_angle_brackets_or_brackets();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(571); 
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
			setState(573);
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
			setState(575);
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
			setState(577);
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
			setState(579);
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
			setState(581);
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
			setState(583);
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
			setState(585);
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
			setState(587);
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
			setState(589);
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
			setState(591);
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
			setState(593);
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
			setState(595);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			assign_expr();
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(598);
				match(T__5);
				setState(599);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			conditional_expression();
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(603);
				assignment_operator();
				setState(604);
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
		try {
			setState(615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				_localctx = new NormOrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(608);
				or_expression();
				}
				break;
			case 2:
				_localctx = new CndExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(609);
				or_expression();
				{
				setState(610);
				match(T__51);
				setState(611);
				expr();
				setState(612);
				match(T__3);
				setState(613);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			and_expression();
			setState(620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(618);
				match(T__46);
				setState(619);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			inclusive_or_expression();
			setState(625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(623);
				match(T__45);
				setState(624);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			exclusive_or_expression();
			setState(630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(628);
				match(T__30);
				setState(629);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			bit_and_expression();
			setState(635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(633);
				match(T__29);
				setState(634);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			equality_expression();
			setState(640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(638);
				match(T__11);
				setState(639);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			relational_expression();
			setState(646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(643);
				equality_operator();
				setState(644);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			shift_expression();
			setState(652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(649);
				relational_operator();
				setState(650);
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
			setState(654);
			additive_expression();
			setState(657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(655);
				_la = _input.LA(1);
				if ( !(_la==T__39 || _la==T__40) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(656);
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
			setState(659);
			multiplicative_expression();
			setState(662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(660);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__13) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(661);
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
			setState(664);
			cast_expression();
			setState(667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(665);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__12) | (1L << T__28))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(666);
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
			setState(675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(669);
				match(T__0);
				setState(670);
				cast_target();
				setState(671);
				match(T__1);
				setState(672);
				cast_expression();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(674);
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
			setState(677);
			type_name();
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11 || _la==T__12) {
				{
				{
				setState(678);
				ptr_operator();
				}
				}
				setState(683);
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
			setState(689);
			switch (_input.LA(1)) {
			case T__9:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(684);
				unary_op_and_cast_expr();
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 2);
				{
				setState(685);
				sizeof_expression();
				}
				break;
			case T__52:
			case NEW:
				enterOuterAlt(_localctx, 3);
				{
				setState(686);
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
				setState(687);
				postfix_expression(0);
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 5);
				{
				setState(688);
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
			setState(713);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(692);
				_la = _input.LA(1);
				if (_la==T__52) {
					{
					setState(691);
					match(T__52);
					}
				}

				setState(694);
				match(NEW);
				setState(695);
				type_name();
				setState(696);
				match(T__26);
				setState(698);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (NEW - 99)) | (1L << (ALPHA_NUMERIC - 99)) | (1L << (HEX_LITERAL - 99)) | (1L << (DECIMAL_LITERAL - 99)) | (1L << (OCTAL_LITERAL - 99)) | (1L << (FLOATING_POINT_LITERAL - 99)) | (1L << (CHAR - 99)) | (1L << (STRING - 99)))) != 0)) {
					{
					setState(697);
					conditional_expression();
					}
				}

				setState(700);
				match(T__27);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(703);
				_la = _input.LA(1);
				if (_la==T__52) {
					{
					setState(702);
					match(T__52);
					}
				}

				setState(705);
				match(NEW);
				setState(706);
				type_name();
				setState(707);
				match(T__0);
				setState(709);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (NEW - 99)) | (1L << (ALPHA_NUMERIC - 99)) | (1L << (HEX_LITERAL - 99)) | (1L << (DECIMAL_LITERAL - 99)) | (1L << (OCTAL_LITERAL - 99)) | (1L << (FLOATING_POINT_LITERAL - 99)) | (1L << (CHAR - 99)) | (1L << (STRING - 99)))) != 0)) {
					{
					setState(708);
					expr();
					}
				}

				setState(711);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			unary_operator();
			setState(716);
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
		try {
			setState(726);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				sizeof();
				setState(719);
				match(T__0);
				setState(720);
				sizeof_operand();
				setState(721);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(723);
				sizeof();
				setState(724);
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
			setState(728);
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
		try {
			setState(737);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(730);
				match(T__54);
				setState(731);
				match(T__0);
				setState(732);
				expr();
				setState(733);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(735);
				match(T__54);
				setState(736);
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
			setState(739);
			type_name();
			setState(743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11 || _la==T__12) {
				{
				{
				setState(740);
				ptr_operator();
				}
				}
				setState(745);
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
			setState(746);
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
			setState(748);
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
			setState(755);
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

				setState(751);
				primary_expression();
				}
				break;
			case T__47:
			case T__48:
				{
				_localctx = new IncDecOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(752);
				inc_dec();
				setState(753);
				primary_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(783);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(781);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayIndexingContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(757);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(758);
						match(T__26);
						setState(759);
						expr();
						setState(760);
						match(T__27);
						}
						break;
					case 2:
						{
						_localctx = new FuncCallContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(762);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(763);
						match(T__0);
						setState(764);
						function_argument_list();
						setState(765);
						match(T__1);
						}
						break;
					case 3:
						{
						_localctx = new MemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(767);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(768);
						match(T__8);
						setState(770);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(769);
							match(TEMPLATE);
							}
						}

						{
						setState(772);
						identifier();
						}
						}
						break;
					case 4:
						{
						_localctx = new PtrMemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(773);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(774);
						match(T__50);
						setState(776);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(775);
							match(TEMPLATE);
							}
						}

						{
						setState(778);
						identifier();
						}
						}
						break;
					case 5:
						{
						_localctx = new IncDecOpContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(779);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(780);
						inc_dec();
						}
						break;
					}
					} 
				}
				setState(785);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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
			setState(812);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (NEW - 99)) | (1L << (ALPHA_NUMERIC - 99)) | (1L << (HEX_LITERAL - 99)) | (1L << (DECIMAL_LITERAL - 99)) | (1L << (OCTAL_LITERAL - 99)) | (1L << (FLOATING_POINT_LITERAL - 99)) | (1L << (CHAR - 99)) | (1L << (STRING - 99)))) != 0)) {
				{
				setState(786);
				function_argument();
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(787);
					match(NEWLINE);
					}
					}
					setState(792);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(809);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(793);
					match(T__5);
					setState(797);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(794);
						match(NEWLINE);
						}
						}
						setState(799);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(800);
					function_argument();
					setState(804);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(801);
						match(NEWLINE);
						}
						}
						setState(806);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(811);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
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
		enterRule(_localctx, 168, RULE_primary_expression);
		try {
			setState(822);
			switch (_input.LA(1)) {
			case T__22:
			case T__23:
			case T__24:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(816);
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
				setState(817);
				constant();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(818);
				match(T__0);
				setState(819);
				expr();
				setState(820);
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
			setState(836);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				_localctx = new InitDeclWithCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(824);
				declarator();
				setState(825);
				match(T__0);
				setState(827);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (NEW - 99)) | (1L << (ALPHA_NUMERIC - 99)) | (1L << (HEX_LITERAL - 99)) | (1L << (DECIMAL_LITERAL - 99)) | (1L << (OCTAL_LITERAL - 99)) | (1L << (FLOATING_POINT_LITERAL - 99)) | (1L << (CHAR - 99)) | (1L << (STRING - 99)))) != 0)) {
					{
					setState(826);
					expr();
					}
				}

				setState(829);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new InitDeclWithAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(831);
				declarator();
				setState(832);
				match(T__4);
				setState(833);
				initializer();
				}
				break;
			case 3:
				_localctx = new InitDeclSimpleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(835);
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
			setState(854);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(839);
				_la = _input.LA(1);
				if (_la==T__11 || _la==T__12) {
					{
					setState(838);
					ptrs();
					}
				}

				setState(841);
				identifier();
				setState(843);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(842);
					type_suffix();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(846);
				_la = _input.LA(1);
				if (_la==T__11 || _la==T__12) {
					{
					setState(845);
					ptrs();
					}
				}

				setState(848);
				match(T__0);
				setState(849);
				func_ptrs();
				setState(850);
				identifier();
				setState(851);
				match(T__1);
				setState(852);
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
			setState(862);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(856);
				match(T__26);
				setState(858);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (NEW - 99)) | (1L << (ALPHA_NUMERIC - 99)) | (1L << (HEX_LITERAL - 99)) | (1L << (DECIMAL_LITERAL - 99)) | (1L << (OCTAL_LITERAL - 99)) | (1L << (FLOATING_POINT_LITERAL - 99)) | (1L << (CHAR - 99)) | (1L << (STRING - 99)))) != 0)) {
					{
					setState(857);
					conditional_expression();
					}
				}

				setState(860);
				match(T__27);
				}
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(861);
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
		public TerminalNode TYPEDEF() { return getToken(FunctionParser.TYPEDEF, 0); }
		public Template_decl_startContext template_decl_start() {
			return getRuleContext(Template_decl_startContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(865);
			_la = _input.LA(1);
			if (_la==TYPEDEF) {
				{
				setState(864);
				match(TYPEDEF);
				}
			}

			setState(868);
			_la = _input.LA(1);
			if (_la==TEMPLATE) {
				{
				setState(867);
				template_decl_start();
				}
			}

			}
			setState(870);
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
		try {
			setState(879);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				_localctx = new DeclByClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(872);
				class_def();
				setState(874);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(873);
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
				setState(876);
				type_name();
				setState(877);
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
			setState(881);
			init_declarator();
			setState(886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(882);
				match(T__5);
				setState(883);
				init_declarator();
				}
				}
				setState(888);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(889);
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
			setState(898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(891);
				assign_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(892);
				match(OPENING_CURLY);
				setState(893);
				initializer_list();
				setState(894);
				match(CLOSING_CURLY);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(896);
				match(OPENING_CURLY);
				setState(897);
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
			setState(900);
			initializer();
			setState(905);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(901);
				match(T__5);
				setState(902);
				initializer();
				}
				}
				setState(907);
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
			setState(908);
			match(CLASS_KEY);
			setState(910);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24))) != 0) || _la==ALPHA_NUMERIC) {
				{
				setState(909);
				class_name();
				}
			}

			setState(913);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(912);
				base_classes();
				}
			}

			setState(915);
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
			setState(918);
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
			setState(920);
			match(T__3);
			setState(921);
			base_class();
			setState(926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(922);
				match(T__5);
				setState(923);
				base_class();
				}
				}
				setState(928);
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
			setState(930);
			_la = _input.LA(1);
			if (_la==VIRTUAL) {
				{
				setState(929);
				match(VIRTUAL);
				}
			}

			setState(933);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(932);
				access_specifier();
				}
				break;
			}
			setState(935);
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
			setState(971);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CV_QUALIFIER) {
					{
					{
					setState(937);
					match(CV_QUALIFIER);
					}
					}
					setState(942);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(944);
				_la = _input.LA(1);
				if (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (UNSIGNED - 70)) | (1L << (SIGNED - 70)) | (1L << (CLASS_KEY - 70)))) != 0)) {
					{
					setState(943);
					_la = _input.LA(1);
					if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (UNSIGNED - 70)) | (1L << (SIGNED - 70)) | (1L << (CLASS_KEY - 70)))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(946);
				base_type();
				setState(951);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(947);
					match(T__6);
					setState(948);
					template_param_list();
					setState(949);
					match(T__7);
					}
				}

				setState(963);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__52) {
					{
					{
					setState(953);
					match(T__52);
					setState(954);
					base_type();
					setState(959);
					_la = _input.LA(1);
					if (_la==T__6) {
						{
						setState(955);
						match(T__6);
						setState(956);
						template_param_list();
						setState(957);
						match(T__7);
						}
					}

					}
					}
					setState(965);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(967);
				_la = _input.LA(1);
				if (_la==CV_QUALIFIER) {
					{
					setState(966);
					match(CV_QUALIFIER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(969);
				match(UNSIGNED);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(970);
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
			setState(974); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(973);
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
				setState(976); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
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
			setState(979);
			_la = _input.LA(1);
			if (_la==AUTO || _la==REGISTER) {
				{
				setState(978);
				_la = _input.LA(1);
				if ( !(_la==AUTO || _la==REGISTER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(981);
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
			setState(983);
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
			setState(1000);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(985);
				match(T__0);
				setState(986);
				match(VOID);
				setState(987);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(988);
				match(T__0);
				setState(997);
				_la = _input.LA(1);
				if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (VOID - 69)) | (1L << (UNSIGNED - 69)) | (1L << (SIGNED - 69)) | (1L << (LONG - 69)) | (1L << (CV_QUALIFIER - 69)) | (1L << (AUTO - 69)) | (1L << (REGISTER - 69)) | (1L << (CLASS_KEY - 69)) | (1L << (ALPHA_NUMERIC - 69)))) != 0)) {
					{
					setState(989);
					param_type();
					setState(994);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__5) {
						{
						{
						setState(990);
						match(T__5);
						setState(991);
						param_type();
						}
						}
						setState(996);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(999);
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
			setState(1002);
			param_decl_specifiers();
			setState(1003);
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
			setState(1006);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__12) {
				{
				setState(1005);
				ptrs();
				}
			}

			setState(1015);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(1008);
				match(T__0);
				setState(1009);
				param_type_id();
				setState(1010);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(1013);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24))) != 0) || _la==ALPHA_NUMERIC) {
					{
					setState(1012);
					parameter_name();
					}
				}

				}
				break;
			}
			setState(1018);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__26) {
				{
				setState(1017);
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
			setState(1029);
			switch (_input.LA(1)) {
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1020);
				match(ALPHA_NUMERIC);
				setState(1025);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1021);
						match(T__52);
						setState(1022);
						match(ALPHA_NUMERIC);
						}
						} 
					}
					setState(1027);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				}
				}
				}
				break;
			case T__22:
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(1028);
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
			setState(1031);
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
			setState(1037); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1033);
				ptr_operator();
				setState(1035);
				_la = _input.LA(1);
				if (_la==T__55) {
					{
					setState(1034);
					match(T__55);
					}
				}

				}
				}
				setState(1039); 
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
			setState(1041);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3u\u0416\4\2\t\2\4"+
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
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00ec\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\5\7\u00f9\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7\u010b\n\7\3\7\5\7\u010e\n\7\3\7\3\7\5\7\u0112"+
		"\n\7\3\7\3\7\5\7\u0116\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u011e\n\7\5\7\u0120"+
		"\n\7\3\b\3\b\3\b\3\b\5\b\u0126\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u0132\n\t\3\t\3\t\3\t\5\t\u0137\n\t\3\t\5\t\u013a\n\t\3\n\5\n"+
		"\u013d\n\n\3\n\3\n\3\n\5\n\u0142\n\n\3\n\3\n\3\13\5\13\u0147\n\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0151\n\f\3\r\3\r\5\r\u0155\n\r\3\16"+
		"\3\16\3\16\3\16\5\16\u015b\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u016c\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u0176\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0185\n\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\5\30\u018e\n\30\3\30\3\30\3\30\5\30\u0193\n\30\7\30\u0195\n"+
		"\30\f\30\16\30\u0198\13\30\3\31\3\31\3\32\3\32\3\32\5\32\u019f\n\32\3"+
		"\33\3\33\5\33\u01a3\n\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01ab\n\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01b3\n\35\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3 \3 \6 \u01bd\n \r \16 \u01be\5 \u01c1\n \3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\5!\u01d1\n!\3\"\3\"\5\"\u01d5\n\"\3\"\3\"\3\"\3"+
		"\"\3\"\5\"\u01dc\n\"\3\"\3\"\6\"\u01e0\n\"\r\"\16\"\u01e1\3\"\3\"\5\""+
		"\u01e6\n\"\3\"\3\"\3\"\5\"\u01eb\n\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"(\3(\3)\3)\3*\3*\3*\5*\u01fe\n*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\5*\u0228\n*\3+\3+\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\6.\u023c\n.\r.\16.\u023d\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3"+
		";\3;\3;\5;\u025b\n;\3<\3<\3<\3<\5<\u0261\n<\3=\3=\3=\3=\3=\3=\3=\5=\u026a"+
		"\n=\3>\3>\3>\5>\u026f\n>\3?\3?\3?\5?\u0274\n?\3@\3@\3@\5@\u0279\n@\3A"+
		"\3A\3A\5A\u027e\nA\3B\3B\3B\5B\u0283\nB\3C\3C\3C\3C\5C\u0289\nC\3D\3D"+
		"\3D\3D\5D\u028f\nD\3E\3E\3E\5E\u0294\nE\3F\3F\3F\5F\u0299\nF\3G\3G\3G"+
		"\5G\u029e\nG\3H\3H\3H\3H\3H\3H\5H\u02a6\nH\3I\3I\7I\u02aa\nI\fI\16I\u02ad"+
		"\13I\3J\3J\3J\3J\3J\5J\u02b4\nJ\3K\5K\u02b7\nK\3K\3K\3K\3K\5K\u02bd\n"+
		"K\3K\3K\3K\5K\u02c2\nK\3K\3K\3K\3K\5K\u02c8\nK\3K\3K\5K\u02cc\nK\3L\3"+
		"L\3L\3M\3M\3M\3M\3M\3M\3M\3M\5M\u02d9\nM\3N\3N\3O\3O\3O\3O\3O\3O\3O\5"+
		"O\u02e4\nO\3P\3P\7P\u02e8\nP\fP\16P\u02eb\13P\3Q\3Q\3R\3R\3S\3S\3S\3S"+
		"\3S\5S\u02f6\nS\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\5S\u0305\nS\3S"+
		"\3S\3S\3S\5S\u030b\nS\3S\3S\3S\7S\u0310\nS\fS\16S\u0313\13S\3T\3T\7T\u0317"+
		"\nT\fT\16T\u031a\13T\3T\3T\7T\u031e\nT\fT\16T\u0321\13T\3T\3T\7T\u0325"+
		"\nT\fT\16T\u0328\13T\7T\u032a\nT\fT\16T\u032d\13T\5T\u032f\nT\3U\3U\3"+
		"V\3V\3V\3V\3V\3V\5V\u0339\nV\3W\3W\3W\5W\u033e\nW\3W\3W\3W\3W\3W\3W\3"+
		"W\5W\u0347\nW\3X\5X\u034a\nX\3X\3X\5X\u034e\nX\3X\5X\u0351\nX\3X\3X\3"+
		"X\3X\3X\3X\5X\u0359\nX\3Y\3Y\5Y\u035d\nY\3Y\3Y\5Y\u0361\nY\3Z\5Z\u0364"+
		"\nZ\3Z\5Z\u0367\nZ\3Z\3Z\3[\3[\5[\u036d\n[\3[\3[\3[\5[\u0372\n[\3\\\3"+
		"\\\3\\\7\\\u0377\n\\\f\\\16\\\u037a\13\\\3\\\3\\\3]\3]\3]\3]\3]\3]\3]"+
		"\5]\u0385\n]\3^\3^\3^\7^\u038a\n^\f^\16^\u038d\13^\3_\3_\5_\u0391\n_\3"+
		"_\5_\u0394\n_\3_\3_\3_\3`\3`\3a\3a\3a\3a\7a\u039f\na\fa\16a\u03a2\13a"+
		"\3b\5b\u03a5\nb\3b\5b\u03a8\nb\3b\3b\3c\7c\u03ad\nc\fc\16c\u03b0\13c\3"+
		"c\5c\u03b3\nc\3c\3c\3c\3c\3c\5c\u03ba\nc\3c\3c\3c\3c\3c\3c\5c\u03c2\n"+
		"c\7c\u03c4\nc\fc\16c\u03c7\13c\3c\5c\u03ca\nc\3c\3c\5c\u03ce\nc\3d\6d"+
		"\u03d1\nd\rd\16d\u03d2\3e\5e\u03d6\ne\3e\3e\3f\3f\3g\3g\3g\3g\3g\3g\3"+
		"g\7g\u03e3\ng\fg\16g\u03e6\13g\5g\u03e8\ng\3g\5g\u03eb\ng\3h\3h\3h\3i"+
		"\5i\u03f1\ni\3i\3i\3i\3i\3i\5i\u03f8\ni\5i\u03fa\ni\3i\5i\u03fd\ni\3j"+
		"\3j\3j\7j\u0402\nj\fj\16j\u0405\13j\3j\5j\u0408\nj\3k\3k\3l\3l\5l\u040e"+
		"\nl\6l\u0410\nl\rl\16l\u0411\3m\3m\3m\2\3\u00a4n\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\2\35\4\2"+
		"\13\rgg\4\2\f\f\16\22\4\2\t\n\23\24\4\2jmop\4\2\25\30LL\3\2\16\17\3\2"+
		"\31\33\4\2\34\34ee\5\2\7\7\"),-\3\2./\3\2\3\4\5\2\3\4\35\36hi\3\2\3\5"+
		"\4\2\3\4\t\n\3\2hi\3\2\35\36\4\2\5\5\35\36\4\2\5\5\b\b\6\2\3\5\b\b\35"+
		"\36hi\3\2*+\4\2\f\f\20\20\5\2\r\r\17\17\37\37\3\2\62\63\4\2HIff\5\2GG"+
		"JJgg\3\2RS\3\2jl\u0471\2\u00dd\3\2\2\2\4\u00eb\3\2\2\2\6\u00ed\3\2\2\2"+
		"\b\u00ef\3\2\2\2\n\u00f1\3\2\2\2\f\u011f\3\2\2\2\16\u0125\3\2\2\2\20\u0139"+
		"\3\2\2\2\22\u013c\3\2\2\2\24\u0146\3\2\2\2\26\u0150\3\2\2\2\30\u0154\3"+
		"\2\2\2\32\u015a\3\2\2\2\34\u015c\3\2\2\2\36\u015f\3\2\2\2 \u0162\3\2\2"+
		"\2\"\u0164\3\2\2\2$\u016b\3\2\2\2&\u0175\3\2\2\2(\u0184\3\2\2\2*\u0186"+
		"\3\2\2\2,\u0189\3\2\2\2.\u018d\3\2\2\2\60\u0199\3\2\2\2\62\u019e\3\2\2"+
		"\2\64\u01a0\3\2\2\2\66\u01aa\3\2\2\28\u01b2\3\2\2\2:\u01b4\3\2\2\2<\u01b8"+
		"\3\2\2\2>\u01c0\3\2\2\2@\u01d0\3\2\2\2B\u01ea\3\2\2\2D\u01ec\3\2\2\2F"+
		"\u01ee\3\2\2\2H\u01f0\3\2\2\2J\u01f2\3\2\2\2L\u01f4\3\2\2\2N\u01f6\3\2"+
		"\2\2P\u01f8\3\2\2\2R\u0227\3\2\2\2T\u0229\3\2\2\2V\u022b\3\2\2\2X\u022d"+
		"\3\2\2\2Z\u023b\3\2\2\2\\\u023f\3\2\2\2^\u0241\3\2\2\2`\u0243\3\2\2\2"+
		"b\u0245\3\2\2\2d\u0247\3\2\2\2f\u0249\3\2\2\2h\u024b\3\2\2\2j\u024d\3"+
		"\2\2\2l\u024f\3\2\2\2n\u0251\3\2\2\2p\u0253\3\2\2\2r\u0255\3\2\2\2t\u0257"+
		"\3\2\2\2v\u025c\3\2\2\2x\u0269\3\2\2\2z\u026b\3\2\2\2|\u0270\3\2\2\2~"+
		"\u0275\3\2\2\2\u0080\u027a\3\2\2\2\u0082\u027f\3\2\2\2\u0084\u0284\3\2"+
		"\2\2\u0086\u028a\3\2\2\2\u0088\u0290\3\2\2\2\u008a\u0295\3\2\2\2\u008c"+
		"\u029a\3\2\2\2\u008e\u02a5\3\2\2\2\u0090\u02a7\3\2\2\2\u0092\u02b3\3\2"+
		"\2\2\u0094\u02cb\3\2\2\2\u0096\u02cd\3\2\2\2\u0098\u02d8\3\2\2\2\u009a"+
		"\u02da\3\2\2\2\u009c\u02e3\3\2\2\2\u009e\u02e5\3\2\2\2\u00a0\u02ec\3\2"+
		"\2\2\u00a2\u02ee\3\2\2\2\u00a4\u02f5\3\2\2\2\u00a6\u032e\3\2\2\2\u00a8"+
		"\u0330\3\2\2\2\u00aa\u0338\3\2\2\2\u00ac\u0346\3\2\2\2\u00ae\u0358\3\2"+
		"\2\2\u00b0\u0360\3\2\2\2\u00b2\u0363\3\2\2\2\u00b4\u0371\3\2\2\2\u00b6"+
		"\u0373\3\2\2\2\u00b8\u0384\3\2\2\2\u00ba\u0386\3\2\2\2\u00bc\u038e\3\2"+
		"\2\2\u00be\u0398\3\2\2\2\u00c0\u039a\3\2\2\2\u00c2\u03a4\3\2\2\2\u00c4"+
		"\u03cd\3\2\2\2\u00c6\u03d0\3\2\2\2\u00c8\u03d5\3\2\2\2\u00ca\u03d9\3\2"+
		"\2\2\u00cc\u03ea\3\2\2\2\u00ce\u03ec\3\2\2\2\u00d0\u03f0\3\2\2\2\u00d2"+
		"\u0407\3\2\2\2\u00d4\u0409\3\2\2\2\u00d6\u040f\3\2\2\2\u00d8\u0413\3\2"+
		"\2\2\u00da\u00dc\5\4\3\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\3\3\2\2\2\u00df\u00dd\3\2\2\2"+
		"\u00e0\u00ec\5\\/\2\u00e1\u00ec\5\6\4\2\u00e2\u00ec\5\b\5\2\u00e3\u00ec"+
		"\5\30\r\2\u00e4\u00ec\5\n\6\2\u00e5\u00ec\5\20\t\2\u00e6\u00ec\5\22\n"+
		"\2\u00e7\u00ec\5\u00b2Z\2\u00e8\u00ec\5\24\13\2\u00e9\u00ec\5D#\2\u00ea"+
		"\u00ec\5r:\2\u00eb\u00e0\3\2\2\2\u00eb\u00e1\3\2\2\2\u00eb\u00e2\3\2\2"+
		"\2\u00eb\u00e3\3\2\2\2\u00eb\u00e4\3\2\2\2\u00eb\u00e5\3\2\2\2\u00eb\u00e6"+
		"\3\2\2\2\u00eb\u00e7\3\2\2\2\u00eb\u00e8\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb"+
		"\u00ea\3\2\2\2\u00ec\5\3\2\2\2\u00ed\u00ee\7h\2\2\u00ee\7\3\2\2\2\u00ef"+
		"\u00f0\7i\2\2\u00f0\t\3\2\2\2\u00f1\u00f2\5\f\7\2\u00f2\13\3\2\2\2\u00f3"+
		"\u0120\7M\2\2\u00f4\u00f5\7N\2\2\u00f5\u00f8\7\3\2\2\u00f6\u00f9\5\u00ce"+
		"h\2\u00f7\u00f9\7t\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa"+
		"\3\2\2\2\u00fa\u0120\7\4\2\2\u00fb\u00fc\7;\2\2\u00fc\u00fd\7\3\2\2\u00fd"+
		"\u00fe\5\26\f\2\u00fe\u00ff\7\4\2\2\u00ff\u0120\3\2\2\2\u0100\u0120\7"+
		"<\2\2\u0101\u0102\7B\2\2\u0102\u0103\7\3\2\2\u0103\u0104\5\26\f\2\u0104"+
		"\u0105\7\4\2\2\u0105\u0120\3\2\2\2\u0106\u0107\7=\2\2\u0107\u010a\7\3"+
		"\2\2\u0108\u010b\5\16\b\2\u0109\u010b\7\5\2\2\u010a\u0108\3\2\2\2\u010a"+
		"\u0109\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u010e\5\26\f\2\u010d\u010c\3"+
		"\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\7\5\2\2\u0110"+
		"\u0112\5t;\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2"+
		"\2\u0113\u0115\7\4\2\2\u0114\u0116\7\5\2\2\u0115\u0114\3\2\2\2\u0115\u0116"+
		"\3\2\2\2\u0116\u0120\3\2\2\2\u0117\u0120\7C\2\2\u0118\u0119\7>\2\2\u0119"+
		"\u011a\7\3\2\2\u011a\u011b\5\26\f\2\u011b\u011d\7\4\2\2\u011c\u011e\7"+
		"\5\2\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f"+
		"\u00f3\3\2\2\2\u011f\u00f4\3\2\2\2\u011f\u00fb\3\2\2\2\u011f\u0100\3\2"+
		"\2\2\u011f\u0101\3\2\2\2\u011f\u0106\3\2\2\2\u011f\u0117\3\2\2\2\u011f"+
		"\u0118\3\2\2\2\u0120\r\3\2\2\2\u0121\u0126\5\u00b2Z\2\u0122\u0123\5t;"+
		"\2\u0123\u0124\7\5\2\2\u0124\u0126\3\2\2\2\u0125\u0121\3\2\2\2\u0125\u0122"+
		"\3\2\2\2\u0126\17\3\2\2\2\u0127\u0128\7?\2\2\u0128\u013a\7\5\2\2\u0129"+
		"\u012a\7A\2\2\u012a\u013a\7\5\2\2\u012b\u012c\7D\2\2\u012c\u012d\5\u00d2"+
		"j\2\u012d\u012e\7\5\2\2\u012e\u013a\3\2\2\2\u012f\u0131\7E\2\2\u0130\u0132"+
		"\5t;\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u013a\7\5\2\2\u0134\u0136\7O\2\2\u0135\u0137\5t;\2\u0136\u0135\3\2\2"+
		"\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\7\5\2\2\u0139\u0127"+
		"\3\2\2\2\u0139\u0129\3\2\2\2\u0139\u012b\3\2\2\2\u0139\u012f\3\2\2\2\u0139"+
		"\u0134\3\2\2\2\u013a\21\3\2\2\2\u013b\u013d\7@\2\2\u013c\u013b\3\2\2\2"+
		"\u013c\u013d\3\2\2\2\u013d\u0141\3\2\2\2\u013e\u0142\5\u00d2j\2\u013f"+
		"\u0142\5\u00d4k\2\u0140\u0142\7o\2\2\u0141\u013e\3\2\2\2\u0141\u013f\3"+
		"\2\2\2\u0141\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\7\6\2\2\u0144"+
		"\23\3\2\2\2\u0145\u0147\5t;\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2"+
		"\u0147\u0148\3\2\2\2\u0148\u0149\7\5\2\2\u0149\25\3\2\2\2\u014a\u0151"+
		"\5t;\2\u014b\u014c\5\u00c4c\2\u014c\u014d\5\u00aeX\2\u014d\u014e\7\7\2"+
		"\2\u014e\u014f\5v<\2\u014f\u0151\3\2\2\2\u0150\u014a\3\2\2\2\u0150\u014b"+
		"\3\2\2\2\u0151\27\3\2\2\2\u0152\u0155\5\32\16\2\u0153\u0155\5&\24\2\u0154"+
		"\u0152\3\2\2\2\u0154\u0153\3\2\2\2\u0155\31\3\2\2\2\u0156\u015b\5\34\17"+
		"\2\u0157\u015b\5\36\20\2\u0158\u015b\5 \21\2\u0159\u015b\5\"\22\2\u015a"+
		"\u0156\3\2\2\2\u015a\u0157\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u0159\3\2"+
		"\2\2\u015b\33\3\2\2\2\u015c\u015d\7T\2\2\u015d\u015e\5$\23\2\u015e\35"+
		"\3\2\2\2\u015f\u0160\7U\2\2\u0160\u0161\5$\23\2\u0161\37\3\2\2\2\u0162"+
		"\u0163\7V\2\2\u0163!\3\2\2\2\u0164\u0165\7W\2\2\u0165#\3\2\2\2\u0166\u016c"+
		"\5\26\f\2\u0167\u0168\7\3\2\2\u0168\u0169\5\26\f\2\u0169\u016a\7\4\2\2"+
		"\u016a\u016c\3\2\2\2\u016b\u0166\3\2\2\2\u016b\u0167\3\2\2\2\u016c%\3"+
		"\2\2\2\u016d\u0176\5(\25\2\u016e\u0176\5*\26\2\u016f\u0176\5\62\32\2\u0170"+
		"\u0176\5\64\33\2\u0171\u0176\5\66\34\2\u0172\u0176\58\35\2\u0173\u0176"+
		"\5@!\2\u0174\u0176\5B\"\2\u0175\u016d\3\2\2\2\u0175\u016e\3\2\2\2\u0175"+
		"\u016f\3\2\2\2\u0175\u0170\3\2\2\2\u0175\u0171\3\2\2\2\u0175\u0172\3\2"+
		"\2\2\u0175\u0173\3\2\2\2\u0175\u0174\3\2\2\2\u0176\'\3\2\2\2\u0177\u0178"+
		"\7X\2\2\u0178\u0179\5,\27\2\u0179\u017a\7\3\2\2\u017a\u017b\5.\30\2\u017b"+
		"\u017c\7\4\2\2\u017c\u017d\5\60\31\2\u017d\u0185\3\2\2\2\u017e\u017f\7"+
		"X\2\2\u017f\u0180\5,\27\2\u0180\u0181\5\60\31\2\u0181\u0185\3\2\2\2\u0182"+
		"\u0183\7X\2\2\u0183\u0185\5,\27\2\u0184\u0177\3\2\2\2\u0184\u017e\3\2"+
		"\2\2\u0184\u0182\3\2\2\2\u0185)\3\2\2\2\u0186\u0187\7Y\2\2\u0187\u0188"+
		"\5,\27\2\u0188+\3\2\2\2\u0189\u018a\5\u00d2j\2\u018a-\3\2\2\2\u018b\u018e"+
		"\5\u00d2j\2\u018c\u018e\7t\2\2\u018d\u018b\3\2\2\2\u018d\u018c\3\2\2\2"+
		"\u018d\u018e\3\2\2\2\u018e\u0196\3\2\2\2\u018f\u0192\7\b\2\2\u0190\u0193"+
		"\5\u00d2j\2\u0191\u0193\7t\2\2\u0192\u0190\3\2\2\2\u0192\u0191\3\2\2\2"+
		"\u0193\u0195\3\2\2\2\u0194\u018f\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194"+
		"\3\2\2\2\u0196\u0197\3\2\2\2\u0197/\3\2\2\2\u0198\u0196\3\2\2\2\u0199"+
		"\u019a\b\31\1\2\u019a\61\3\2\2\2\u019b\u019c\7Z\2\2\u019c\u019f\7p\2\2"+
		"\u019d\u019f\7Z\2\2\u019e\u019b\3\2\2\2\u019e\u019d\3\2\2\2\u019f\63\3"+
		"\2\2\2\u01a0\u01a2\7[\2\2\u01a1\u01a3\7p\2\2\u01a2\u01a1\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3\65\3\2\2\2\u01a4\u01a5\7\\\2\2\u01a5\u01ab\5:\36"+
		"\2\u01a6\u01a7\7\\\2\2\u01a7\u01ab\5,\27\2\u01a8\u01a9\7\\\2\2\u01a9\u01ab"+
		"\5<\37\2\u01aa\u01a4\3\2\2\2\u01aa\u01a6\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab"+
		"\67\3\2\2\2\u01ac\u01ad\7]\2\2\u01ad\u01b3\5:\36\2\u01ae\u01af\7]\2\2"+
		"\u01af\u01b3\5,\27\2\u01b0\u01b1\7]\2\2\u01b1\u01b3\5<\37\2\u01b2\u01ac"+
		"\3\2\2\2\u01b2\u01ae\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b39\3\2\2\2\u01b4"+
		"\u01b5\7\t\2\2\u01b5\u01b6\5> \2\u01b6\u01b7\7\n\2\2\u01b7;\3\2\2\2\u01b8"+
		"\u01b9\5> \2\u01b9=\3\2\2\2\u01ba\u01c1\7p\2\2\u01bb\u01bd\t\2\2\2\u01bc"+
		"\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2"+
		"\2\2\u01bf\u01c1\3\2\2\2\u01c0\u01ba\3\2\2\2\u01c0\u01bc\3\2\2\2\u01c1"+
		"?\3\2\2\2\u01c2\u01c3\7^\2\2\u01c3\u01c4\7k\2\2\u01c4\u01d1\7p\2\2\u01c5"+
		"\u01c6\7^\2\2\u01c6\u01c7\7k\2\2\u01c7\u01d1\5,\27\2\u01c8\u01c9\7^\2"+
		"\2\u01c9\u01ca\5,\27\2\u01ca\u01cb\7p\2\2\u01cb\u01d1\3\2\2\2\u01cc\u01cd"+
		"\7^\2\2\u01cd\u01d1\5,\27\2\u01ce\u01cf\7^\2\2\u01cf\u01d1\7k\2\2\u01d0"+
		"\u01c2\3\2\2\2\u01d0\u01c5\3\2\2\2\u01d0\u01c8\3\2\2\2\u01d0\u01cc\3\2"+
		"\2\2\u01d0\u01ce\3\2\2\2\u01d1A\3\2\2\2\u01d2\u01d4\7_\2\2\u01d3\u01d5"+
		"\7`\2\2\u01d4\u01d3\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6"+
		"\u01d7\7a\2\2\u01d7\u01d8\7p\2\2\u01d8\u01eb\b\"\1\2\u01d9\u01db\7_\2"+
		"\2\u01da\u01dc\7`\2\2\u01db\u01da\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd"+
		"\3\2\2\2\u01dd\u01df\7a\2\2\u01de\u01e0\5\u00d2j\2\u01df\u01de\3\2\2\2"+
		"\u01e0\u01e1\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01eb"+
		"\3\2\2\2\u01e3\u01e5\7_\2\2\u01e4\u01e6\7`\2\2\u01e5\u01e4\3\2\2\2\u01e5"+
		"\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01eb\7a\2\2\u01e8\u01e9\7_\2"+
		"\2\u01e9\u01eb\b\"\1\2\u01ea\u01d2\3\2\2\2\u01ea\u01d9\3\2\2\2\u01ea\u01e3"+
		"\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ebC\3\2\2\2\u01ec\u01ed\7n\2\2\u01edE"+
		"\3\2\2\2\u01ee\u01ef\t\3\2\2\u01efG\3\2\2\2\u01f0\u01f1\t\4\2\2\u01f1"+
		"I\3\2\2\2\u01f2\u01f3\t\5\2\2\u01f3K\3\2\2\2\u01f4\u01f5\t\6\2\2\u01f5"+
		"M\3\2\2\2\u01f6\u01f7\t\7\2\2\u01f7O\3\2\2\2\u01f8\u01f9\t\b\2\2\u01f9"+
		"Q\3\2\2\2\u01fa\u01fd\t\t\2\2\u01fb\u01fc\7\35\2\2\u01fc\u01fe\7\36\2"+
		"\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0228\3\2\2\2\u01ff\u0228"+
		"\7\20\2\2\u0200\u0228\7\f\2\2\u0201\u0228\7\17\2\2\u0202\u0228\7\r\2\2"+
		"\u0203\u0228\7\37\2\2\u0204\u0228\7 \2\2\u0205\u0228\7\16\2\2\u0206\u0228"+
		"\7!\2\2\u0207\u0228\7\21\2\2\u0208\u0228\7\22\2\2\u0209\u0228\7\7\2\2"+
		"\u020a\u0228\7\t\2\2\u020b\u0228\7\n\2\2\u020c\u0228\7\"\2\2\u020d\u0228"+
		"\7#\2\2\u020e\u0228\7$\2\2\u020f\u0228\7%\2\2\u0210\u0228\7&\2\2\u0211"+
		"\u0228\7\'\2\2\u0212\u0228\7(\2\2\u0213\u0228\7)\2\2\u0214\u0228\7*\2"+
		"\2\u0215\u0228\7+\2\2\u0216\u0228\7,\2\2\u0217\u0228\7-\2\2\u0218\u0228"+
		"\7.\2\2\u0219\u0228\7/\2\2\u021a\u0228\7\23\2\2\u021b\u0228\7\24\2\2\u021c"+
		"\u0228\7\60\2\2\u021d\u0228\7\61\2\2\u021e\u0228\7\62\2\2\u021f\u0228"+
		"\7\63\2\2\u0220\u0228\7\b\2\2\u0221\u0228\7\64\2\2\u0222\u0228\7\65\2"+
		"\2\u0223\u0224\7\3\2\2\u0224\u0228\7\4\2\2\u0225\u0226\7\35\2\2\u0226"+
		"\u0228\7\36\2\2\u0227\u01fa\3\2\2\2\u0227\u01ff\3\2\2\2\u0227\u0200\3"+
		"\2\2\2\u0227\u0201\3\2\2\2\u0227\u0202\3\2\2\2\u0227\u0203\3\2\2\2\u0227"+
		"\u0204\3\2\2\2\u0227\u0205\3\2\2\2\u0227\u0206\3\2\2\2\u0227\u0207\3\2"+
		"\2\2\u0227\u0208\3\2\2\2\u0227\u0209\3\2\2\2\u0227\u020a\3\2\2\2\u0227"+
		"\u020b\3\2\2\2\u0227\u020c\3\2\2\2\u0227\u020d\3\2\2\2\u0227\u020e\3\2"+
		"\2\2\u0227\u020f\3\2\2\2\u0227\u0210\3\2\2\2\u0227\u0211\3\2\2\2\u0227"+
		"\u0212\3\2\2\2\u0227\u0213\3\2\2\2\u0227\u0214\3\2\2\2\u0227\u0215\3\2"+
		"\2\2\u0227\u0216\3\2\2\2\u0227\u0217\3\2\2\2\u0227\u0218\3\2\2\2\u0227"+
		"\u0219\3\2\2\2\u0227\u021a\3\2\2\2\u0227\u021b\3\2\2\2\u0227\u021c\3\2"+
		"\2\2\u0227\u021d\3\2\2\2\u0227\u021e\3\2\2\2\u0227\u021f\3\2\2\2\u0227"+
		"\u0220\3\2\2\2\u0227\u0221\3\2\2\2\u0227\u0222\3\2\2\2\u0227\u0223\3\2"+
		"\2\2\u0227\u0225\3\2\2\2\u0228S\3\2\2\2\u0229\u022a\t\n\2\2\u022aU\3\2"+
		"\2\2\u022b\u022c\t\13\2\2\u022cW\3\2\2\2\u022d\u022e\7d\2\2\u022e\u022f"+
		"\7\t\2\2\u022f\u0230\5Z.\2\u0230\u0231\7\n\2\2\u0231Y\3\2\2\2\u0232\u0233"+
		"\7\t\2\2\u0233\u0234\5Z.\2\u0234\u0235\7\n\2\2\u0235\u023c\3\2\2\2\u0236"+
		"\u0237\7\3\2\2\u0237\u0238\5Z.\2\u0238\u0239\7\4\2\2\u0239\u023c\3\2\2"+
		"\2\u023a\u023c\5d\63\2\u023b\u0232\3\2\2\2\u023b\u0236\3\2\2\2\u023b\u023a"+
		"\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e"+
		"[\3\2\2\2\u023f\u0240\7q\2\2\u0240]\3\2\2\2\u0241\u0242\n\f\2\2\u0242"+
		"_\3\2\2\2\u0243\u0244\n\r\2\2\u0244a\3\2\2\2\u0245\u0246\n\16\2\2\u0246"+
		"c\3\2\2\2\u0247\u0248\n\17\2\2\u0248e\3\2\2\2\u0249\u024a\n\20\2\2\u024a"+
		"g\3\2\2\2\u024b\u024c\n\21\2\2\u024ci\3\2\2\2\u024d\u024e\n\22\2\2\u024e"+
		"k\3\2\2\2\u024f\u0250\n\23\2\2\u0250m\3\2\2\2\u0251\u0252\n\24\2\2\u0252"+
		"o\3\2\2\2\u0253\u0254\n\r\2\2\u0254q\3\2\2\2\u0255\u0256\13\2\2\2\u0256"+
		"s\3\2\2\2\u0257\u025a\5v<\2\u0258\u0259\7\b\2\2\u0259\u025b\5t;\2\u025a"+
		"\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025bu\3\2\2\2\u025c\u0260\5x=\2\u025d"+
		"\u025e\5T+\2\u025e\u025f\5v<\2\u025f\u0261\3\2\2\2\u0260\u025d\3\2\2\2"+
		"\u0260\u0261\3\2\2\2\u0261w\3\2\2\2\u0262\u026a\5z>\2\u0263\u0264\5z>"+
		"\2\u0264\u0265\7\66\2\2\u0265\u0266\5t;\2\u0266\u0267\7\6\2\2\u0267\u0268"+
		"\5x=\2\u0268\u026a\3\2\2\2\u0269\u0262\3\2\2\2\u0269\u0263\3\2\2\2\u026a"+
		"y\3\2\2\2\u026b\u026e\5|?\2\u026c\u026d\7\61\2\2\u026d\u026f\5z>\2\u026e"+
		"\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f{\3\2\2\2\u0270\u0273\5~@\2\u0271"+
		"\u0272\7\60\2\2\u0272\u0274\5|?\2\u0273\u0271\3\2\2\2\u0273\u0274\3\2"+
		"\2\2\u0274}\3\2\2\2\u0275\u0278\5\u0080A\2\u0276\u0277\7!\2\2\u0277\u0279"+
		"\5~@\2\u0278\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279\177\3\2\2\2\u027a"+
		"\u027d\5\u0082B\2\u027b\u027c\7 \2\2\u027c\u027e\5\u0080A\2\u027d\u027b"+
		"\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0081\3\2\2\2\u027f\u0282\5\u0084C"+
		"\2\u0280\u0281\7\16\2\2\u0281\u0283\5\u0082B\2\u0282\u0280\3\2\2\2\u0282"+
		"\u0283\3\2\2\2\u0283\u0083\3\2\2\2\u0284\u0288\5\u0086D\2\u0285\u0286"+
		"\5V,\2\u0286\u0287\5\u0084C\2\u0287\u0289\3\2\2\2\u0288\u0285\3\2\2\2"+
		"\u0288\u0289\3\2\2\2\u0289\u0085\3\2\2\2\u028a\u028e\5\u0088E\2\u028b"+
		"\u028c\5H%\2\u028c\u028d\5\u0086D\2\u028d\u028f\3\2\2\2\u028e\u028b\3"+
		"\2\2\2\u028e\u028f\3\2\2\2\u028f\u0087\3\2\2\2\u0290\u0293\5\u008aF\2"+
		"\u0291\u0292\t\25\2\2\u0292\u0294\5\u0088E\2\u0293\u0291\3\2\2\2\u0293"+
		"\u0294\3\2\2\2\u0294\u0089\3\2\2\2\u0295\u0298\5\u008cG\2\u0296\u0297"+
		"\t\26\2\2\u0297\u0299\5\u008aF\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2\2"+
		"\2\u0299\u008b\3\2\2\2\u029a\u029d\5\u008eH\2\u029b\u029c\t\27\2\2\u029c"+
		"\u029e\5\u008cG\2\u029d\u029b\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u008d"+
		"\3\2\2\2\u029f\u02a0\7\3\2\2\u02a0\u02a1\5\u0090I\2\u02a1\u02a2\7\4\2"+
		"\2\u02a2\u02a3\5\u008eH\2\u02a3\u02a6\3\2\2\2\u02a4\u02a6\5\u0092J\2\u02a5"+
		"\u029f\3\2\2\2\u02a5\u02a4\3\2\2\2\u02a6\u008f\3\2\2\2\u02a7\u02ab\5\u00c4"+
		"c\2\u02a8\u02aa\5N(\2\u02a9\u02a8\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab\u02a9"+
		"\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u0091\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ae"+
		"\u02b4\5\u0096L\2\u02af\u02b4\5\u0098M\2\u02b0\u02b4\5\u0094K\2\u02b1"+
		"\u02b4\5\u00a4S\2\u02b2\u02b4\5\u009cO\2\u02b3\u02ae\3\2\2\2\u02b3\u02af"+
		"\3\2\2\2\u02b3\u02b0\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3\u02b2\3\2\2\2\u02b4"+
		"\u0093\3\2\2\2\u02b5\u02b7\7\67\2\2\u02b6\u02b5\3\2\2\2\u02b6\u02b7\3"+
		"\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02b9\7e\2\2\u02b9\u02ba\5\u00c4c\2\u02ba"+
		"\u02bc\7\35\2\2\u02bb\u02bd\5x=\2\u02bc\u02bb\3\2\2\2\u02bc\u02bd\3\2"+
		"\2\2\u02bd\u02be\3\2\2\2\u02be\u02bf\7\36\2\2\u02bf\u02cc\3\2\2\2\u02c0"+
		"\u02c2\7\67\2\2\u02c1\u02c0\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c3\3"+
		"\2\2\2\u02c3\u02c4\7e\2\2\u02c4\u02c5\5\u00c4c\2\u02c5\u02c7\7\3\2\2\u02c6"+
		"\u02c8\5t;\2\u02c7\u02c6\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c9\3\2\2"+
		"\2\u02c9\u02ca\7\4\2\2\u02ca\u02cc\3\2\2\2\u02cb\u02b6\3\2\2\2\u02cb\u02c1"+
		"\3\2\2\2\u02cc\u0095\3\2\2\2\u02cd\u02ce\5F$\2\u02ce\u02cf\5\u008eH\2"+
		"\u02cf\u0097\3\2\2\2\u02d0\u02d1\5\u009aN\2\u02d1\u02d2\7\3\2\2\u02d2"+
		"\u02d3\5\u009eP\2\u02d3\u02d4\7\4\2\2\u02d4\u02d9\3\2\2\2\u02d5\u02d6"+
		"\5\u009aN\2\u02d6\u02d7\5\u00a0Q\2\u02d7\u02d9\3\2\2\2\u02d8\u02d0\3\2"+
		"\2\2\u02d8\u02d5\3\2\2\2\u02d9\u0099\3\2\2\2\u02da\u02db\78\2\2\u02db"+
		"\u009b\3\2\2\2\u02dc\u02dd\79\2\2\u02dd\u02de\7\3\2\2\u02de\u02df\5t;"+
		"\2\u02df\u02e0\7\4\2\2\u02e0\u02e4\3\2\2\2\u02e1\u02e2\79\2\2\u02e2\u02e4"+
		"\5t;\2\u02e3\u02dc\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e4\u009d\3\2\2\2\u02e5"+
		"\u02e9\5\u00c4c\2\u02e6\u02e8\5N(\2\u02e7\u02e6\3\2\2\2\u02e8\u02eb\3"+
		"\2\2\2\u02e9\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u009f\3\2\2\2\u02eb"+
		"\u02e9\3\2\2\2\u02ec\u02ed\5\u0092J\2\u02ed\u00a1\3\2\2\2\u02ee\u02ef"+
		"\t\30\2\2\u02ef\u00a3\3\2\2\2\u02f0\u02f1\bS\1\2\u02f1\u02f6\5\u00aaV"+
		"\2\u02f2\u02f3\5\u00a2R\2\u02f3\u02f4\5\u00aaV\2\u02f4\u02f6\3\2\2\2\u02f5"+
		"\u02f0\3\2\2\2\u02f5\u02f2\3\2\2\2\u02f6\u0311\3\2\2\2\u02f7\u02f8\f\t"+
		"\2\2\u02f8\u02f9\7\35\2\2\u02f9\u02fa\5t;\2\u02fa\u02fb\7\36\2\2\u02fb"+
		"\u0310\3\2\2\2\u02fc\u02fd\f\b\2\2\u02fd\u02fe\7\3\2\2\u02fe\u02ff\5\u00a6"+
		"T\2\u02ff\u0300\7\4\2\2\u0300\u0310\3\2\2\2\u0301\u0302\f\7\2\2\u0302"+
		"\u0304\7\13\2\2\u0303\u0305\7d\2\2\u0304\u0303\3\2\2\2\u0304\u0305\3\2"+
		"\2\2\u0305\u0306\3\2\2\2\u0306\u0310\5\u00d2j\2\u0307\u0308\f\6\2\2\u0308"+
		"\u030a\7\65\2\2\u0309\u030b\7d\2\2\u030a\u0309\3\2\2\2\u030a\u030b\3\2"+
		"\2\2\u030b\u030c\3\2\2\2\u030c\u0310\5\u00d2j\2\u030d\u030e\f\5\2\2\u030e"+
		"\u0310\5\u00a2R\2\u030f\u02f7\3\2\2\2\u030f\u02fc\3\2\2\2\u030f\u0301"+
		"\3\2\2\2\u030f\u0307\3\2\2\2\u030f\u030d\3\2\2\2\u0310\u0313\3\2\2\2\u0311"+
		"\u030f\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u00a5\3\2\2\2\u0313\u0311\3\2"+
		"\2\2\u0314\u0318\5\u00a8U\2\u0315\u0317\7q\2\2\u0316\u0315\3\2\2\2\u0317"+
		"\u031a\3\2\2\2\u0318\u0316\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u032b\3\2"+
		"\2\2\u031a\u0318\3\2\2\2\u031b\u031f\7\b\2\2\u031c\u031e\7q\2\2\u031d"+
		"\u031c\3\2\2\2\u031e\u0321\3\2\2\2\u031f\u031d\3\2\2\2\u031f\u0320\3\2"+
		"\2\2\u0320\u0322\3\2\2\2\u0321\u031f\3\2\2\2\u0322\u0326\5\u00a8U\2\u0323"+
		"\u0325\7q\2\2\u0324\u0323\3\2\2\2\u0325\u0328\3\2\2\2\u0326\u0324\3\2"+
		"\2\2\u0326\u0327\3\2\2\2\u0327\u032a\3\2\2\2\u0328\u0326\3\2\2\2\u0329"+
		"\u031b\3\2\2\2\u032a\u032d\3\2\2\2\u032b\u0329\3\2\2\2\u032b\u032c\3\2"+
		"\2\2\u032c\u032f\3\2\2\2\u032d\u032b\3\2\2\2\u032e\u0314\3\2\2\2\u032e"+
		"\u032f\3\2\2\2\u032f\u00a7\3\2\2\2\u0330\u0331\5v<\2\u0331\u00a9\3\2\2"+
		"\2\u0332\u0339\5\u00d2j\2\u0333\u0339\5J&\2\u0334\u0335\7\3\2\2\u0335"+
		"\u0336\5t;\2\u0336\u0337\7\4\2\2\u0337\u0339\3\2\2\2\u0338\u0332\3\2\2"+
		"\2\u0338\u0333\3\2\2\2\u0338\u0334\3\2\2\2\u0339\u00ab\3\2\2\2\u033a\u033b"+
		"\5\u00aeX\2\u033b\u033d\7\3\2\2\u033c\u033e\5t;\2\u033d\u033c\3\2\2\2"+
		"\u033d\u033e\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u0340\7\4\2\2\u0340\u0347"+
		"\3\2\2\2\u0341\u0342\5\u00aeX\2\u0342\u0343\7\7\2\2\u0343\u0344\5\u00b8"+
		"]\2\u0344\u0347\3\2\2\2\u0345\u0347\5\u00aeX\2\u0346\u033a\3\2\2\2\u0346"+
		"\u0341\3\2\2\2\u0346\u0345\3\2\2\2\u0347\u00ad\3\2\2\2\u0348\u034a\5\u00d6"+
		"l\2\u0349\u0348\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034b\3\2\2\2\u034b"+
		"\u034d\5\u00d2j\2\u034c\u034e\5\u00b0Y\2\u034d\u034c\3\2\2\2\u034d\u034e"+
		"\3\2\2\2\u034e\u0359\3\2\2\2\u034f\u0351\5\u00d6l\2\u0350\u034f\3\2\2"+
		"\2\u0350\u0351\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0353\7\3\2\2\u0353\u0354"+
		"\5\u00d8m\2\u0354\u0355\5\u00d2j\2\u0355\u0356\7\4\2\2\u0356\u0357\5\u00b0"+
		"Y\2\u0357\u0359\3\2\2\2\u0358\u0349\3\2\2\2\u0358\u0350\3\2\2\2\u0359"+
		"\u00af\3\2\2\2\u035a\u035c\7\35\2\2\u035b\u035d\5x=\2\u035c\u035b\3\2"+
		"\2\2\u035c\u035d\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u0361\7\36\2\2\u035f"+
		"\u0361\5\u00ccg\2\u0360\u035a\3\2\2\2\u0360\u035f\3\2\2\2\u0361\u00b1"+
		"\3\2\2\2\u0362\u0364\7F\2\2\u0363\u0362\3\2\2\2\u0363\u0364\3\2\2\2\u0364"+
		"\u0366\3\2\2\2\u0365\u0367\5X-\2\u0366\u0365\3\2\2\2\u0366\u0367\3\2\2"+
		"\2\u0367\u0368\3\2\2\2\u0368\u0369\5\u00b4[\2\u0369\u00b3\3\2\2\2\u036a"+
		"\u036c\5\u00bc_\2\u036b\u036d\5\u00b6\\\2\u036c\u036b\3\2\2\2\u036c\u036d"+
		"\3\2\2\2\u036d\u0372\3\2\2\2\u036e\u036f\5\u00c4c\2\u036f\u0370\5\u00b6"+
		"\\\2\u0370\u0372\3\2\2\2\u0371\u036a\3\2\2\2\u0371\u036e\3\2\2\2\u0372"+
		"\u00b5\3\2\2\2\u0373\u0378\5\u00acW\2\u0374\u0375\7\b\2\2\u0375\u0377"+
		"\5\u00acW\2\u0376\u0374\3\2\2\2\u0377\u037a\3\2\2\2\u0378\u0376\3\2\2"+
		"\2\u0378\u0379\3\2\2\2\u0379\u037b\3\2\2\2\u037a\u0378\3\2\2\2\u037b\u037c"+
		"\7\5\2\2\u037c\u00b7\3\2\2\2\u037d\u0385\5v<\2\u037e\u037f\7h\2\2\u037f"+
		"\u0380\5\u00ba^\2\u0380\u0381\7i\2\2\u0381\u0385\3\2\2\2\u0382\u0383\7"+
		"h\2\2\u0383\u0385\7i\2\2\u0384\u037d\3\2\2\2\u0384\u037e\3\2\2\2\u0384"+
		"\u0382\3\2\2\2\u0385\u00b9\3\2\2\2\u0386\u038b\5\u00b8]\2\u0387\u0388"+
		"\7\b\2\2\u0388\u038a\5\u00b8]\2\u0389\u0387\3\2\2\2\u038a\u038d\3\2\2"+
		"\2\u038b\u0389\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u00bb\3\2\2\2\u038d\u038b"+
		"\3\2\2\2\u038e\u0390\7f\2\2\u038f\u0391\5\u00be`\2\u0390\u038f\3\2\2\2"+
		"\u0390\u0391\3\2\2\2\u0391\u0393\3\2\2\2\u0392\u0394\5\u00c0a\2\u0393"+
		"\u0392\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u0396\7h"+
		"\2\2\u0396\u0397\b_\1\2\u0397\u00bd\3\2\2\2\u0398\u0399\5\u00d2j\2\u0399"+
		"\u00bf\3\2\2\2\u039a\u039b\7\6\2\2\u039b\u03a0\5\u00c2b\2\u039c\u039d"+
		"\7\b\2\2\u039d\u039f\5\u00c2b\2\u039e\u039c\3\2\2\2\u039f\u03a2\3\2\2"+
		"\2\u03a0\u039e\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u00c1\3\2\2\2\u03a2\u03a0"+
		"\3\2\2\2\u03a3\u03a5\7L\2\2\u03a4\u03a3\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5"+
		"\u03a7\3\2\2\2\u03a6\u03a8\5P)\2\u03a7\u03a6\3\2\2\2\u03a7\u03a8\3\2\2"+
		"\2\u03a8\u03a9\3\2\2\2\u03a9\u03aa\5\u00d2j\2\u03aa\u00c3\3\2\2\2\u03ab"+
		"\u03ad\7K\2\2\u03ac\u03ab\3\2\2\2\u03ad\u03b0\3\2\2\2\u03ae\u03ac\3\2"+
		"\2\2\u03ae\u03af\3\2\2\2\u03af\u03b2\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b1"+
		"\u03b3\t\31\2\2\u03b2\u03b1\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b4\3"+
		"\2\2\2\u03b4\u03b9\5\u00c6d\2\u03b5\u03b6\7\t\2\2\u03b6\u03b7\5Z.\2\u03b7"+
		"\u03b8\7\n\2\2\u03b8\u03ba\3\2\2\2\u03b9\u03b5\3\2\2\2\u03b9\u03ba\3\2"+
		"\2\2\u03ba\u03c5\3\2\2\2\u03bb\u03bc\7\67\2\2\u03bc\u03c1\5\u00c6d\2\u03bd"+
		"\u03be\7\t\2\2\u03be\u03bf\5Z.\2\u03bf\u03c0\7\n\2\2\u03c0\u03c2\3\2\2"+
		"\2\u03c1\u03bd\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c4\3\2\2\2\u03c3\u03bb"+
		"\3\2\2\2\u03c4\u03c7\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6"+
		"\u03c9\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c8\u03ca\7K\2\2\u03c9\u03c8\3\2"+
		"\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03ce\3\2\2\2\u03cb\u03ce\7H\2\2\u03cc"+
		"\u03ce\7I\2\2\u03cd\u03ae\3\2\2\2\u03cd\u03cb\3\2\2\2\u03cd\u03cc\3\2"+
		"\2\2\u03ce\u00c5\3\2\2\2\u03cf\u03d1\t\32\2\2\u03d0\u03cf\3\2\2\2\u03d1"+
		"\u03d2\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u00c7\3\2"+
		"\2\2\u03d4\u03d6\t\33\2\2\u03d5\u03d4\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6"+
		"\u03d7\3\2\2\2\u03d7\u03d8\5\u00c4c\2\u03d8\u00c9\3\2\2\2\u03d9\u03da"+
		"\5\u00d2j\2\u03da\u00cb\3\2\2\2\u03db\u03dc\7\3\2\2\u03dc\u03dd\7G\2\2"+
		"\u03dd\u03eb\7\4\2\2\u03de\u03e7\7\3\2\2\u03df\u03e4\5\u00ceh\2\u03e0"+
		"\u03e1\7\b\2\2\u03e1\u03e3\5\u00ceh\2\u03e2\u03e0\3\2\2\2\u03e3\u03e6"+
		"\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e8\3\2\2\2\u03e6"+
		"\u03e4\3\2\2\2\u03e7\u03df\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03e9\3\2"+
		"\2\2\u03e9\u03eb\7\4\2\2\u03ea\u03db\3\2\2\2\u03ea\u03de\3\2\2\2\u03eb"+
		"\u00cd\3\2\2\2\u03ec\u03ed\5\u00c8e\2\u03ed\u03ee\5\u00d0i\2\u03ee\u00cf"+
		"\3\2\2\2\u03ef\u03f1\5\u00d6l\2\u03f0\u03ef\3\2\2\2\u03f0\u03f1\3\2\2"+
		"\2\u03f1\u03f9\3\2\2\2\u03f2\u03f3\7\3\2\2\u03f3\u03f4\5\u00d0i\2\u03f4"+
		"\u03f5\7\4\2\2\u03f5\u03fa\3\2\2\2\u03f6\u03f8\5\u00caf\2\u03f7\u03f6"+
		"\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03fa\3\2\2\2\u03f9\u03f2\3\2\2\2\u03f9"+
		"\u03f7\3\2\2\2\u03fa\u03fc\3\2\2\2\u03fb\u03fd\5\u00b0Y\2\u03fc\u03fb"+
		"\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u00d1\3\2\2\2\u03fe\u0403\7g\2\2\u03ff"+
		"\u0400\7\67\2\2\u0400\u0402\7g\2\2\u0401\u03ff\3\2\2\2\u0402\u0405\3\2"+
		"\2\2\u0403\u0401\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u0408\3\2\2\2\u0405"+
		"\u0403\3\2\2\2\u0406\u0408\5P)\2\u0407\u03fe\3\2\2\2\u0407\u0406\3\2\2"+
		"\2\u0408\u00d3\3\2\2\2\u0409\u040a\t\34\2\2\u040a\u00d5\3\2\2\2\u040b"+
		"\u040d\5N(\2\u040c\u040e\7:\2\2\u040d\u040c\3\2\2\2\u040d\u040e\3\2\2"+
		"\2\u040e\u0410\3\2\2\2\u040f\u040b\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u040f"+
		"\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u00d7\3\2\2\2\u0413\u0414\5\u00d6l"+
		"\2\u0414\u00d9\3\2\2\2v\u00dd\u00eb\u00f8\u010a\u010d\u0111\u0115\u011d"+
		"\u011f\u0125\u0131\u0136\u0139\u013c\u0141\u0146\u0150\u0154\u015a\u016b"+
		"\u0175\u0184\u018d\u0192\u0196\u019e\u01a2\u01aa\u01b2\u01be\u01c0\u01d0"+
		"\u01d4\u01db\u01e1\u01e5\u01ea\u01fd\u0227\u023b\u023d\u025a\u0260\u0269"+
		"\u026e\u0273\u0278\u027d\u0282\u0288\u028e\u0293\u0298\u029d\u02a5\u02ab"+
		"\u02b3\u02b6\u02bc\u02c1\u02c7\u02cb\u02d8\u02e3\u02e9\u02f5\u0304\u030a"+
		"\u030f\u0311\u0318\u031f\u0326\u032b\u032e\u0338\u033d\u0346\u0349\u034d"+
		"\u0350\u0358\u035c\u0360\u0363\u0366\u036c\u0371\u0378\u0384\u038b\u0390"+
		"\u0393\u03a0\u03a4\u03a7\u03ae\u03b2\u03b9\u03c1\u03c5\u03c9\u03cd\u03d2"+
		"\u03d5\u03e4\u03e7\u03ea\u03f0\u03f7\u03f9\u03fc\u0403\u0407\u040d\u0411";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}