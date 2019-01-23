// Generated from ..\java\antlr\Module.g4 by ANTLR 4.5.3

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
public class ModuleParser extends Parser {
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
		REGISTER=81, OPERATOR=82, TEMPLATE=83, NEW=84, CLASS_KEY=85, ALPHA_NUMERIC=86, 
		OPENING_CURLY=87, CLOSING_CURLY=88, PRE_IF=89, PRE_ELIF=90, PRE_ELSE=91, 
		PRE_ENDIF=92, PRE_INCLUDE=93, PRE_STMT=94, HEX_LITERAL=95, DECIMAL_LITERAL=96, 
		OCTAL_LITERAL=97, FLOATING_POINT_LITERAL=98, CHAR=99, STRING=100, COMMENT=101, 
		WHITESPACE=102, CPPCOMMENT=103, ELLIPSIS=104, OTHER=105;
	public static final int
		RULE_code = 0, RULE_using_directive = 1, RULE_pre_statement = 2, RULE_pre_if_condition = 3, 
		RULE_condition = 4, RULE_expr = 5, RULE_assign_expr = 6, RULE_conditional_expression = 7, 
		RULE_or_expression = 8, RULE_and_expression = 9, RULE_inclusive_or_expression = 10, 
		RULE_exclusive_or_expression = 11, RULE_bit_and_expression = 12, RULE_equality_expression = 13, 
		RULE_relational_expression = 14, RULE_shift_expression = 15, RULE_additive_expression = 16, 
		RULE_multiplicative_expression = 17, RULE_cast_expression = 18, RULE_cast_target = 19, 
		RULE_unary_expression = 20, RULE_new_expression = 21, RULE_unary_op_and_cast_expr = 22, 
		RULE_sizeof_expression = 23, RULE_sizeof = 24, RULE_sizeof_operand = 25, 
		RULE_sizeof_operand2 = 26, RULE_inc_dec = 27, RULE_postfix_expression = 28, 
		RULE_function_argument_list = 29, RULE_function_argument = 30, RULE_primary_expression = 31, 
		RULE_init_declarator = 32, RULE_declarator = 33, RULE_type_suffix = 34, 
		RULE_simple_decl = 35, RULE_var_decl = 36, RULE_init_declarator_list = 37, 
		RULE_initializer = 38, RULE_initializer_list = 39, RULE_class_def = 40, 
		RULE_class_name = 41, RULE_base_classes = 42, RULE_base_class = 43, RULE_type_name = 44, 
		RULE_base_type = 45, RULE_param_decl_specifiers = 46, RULE_parameter_name = 47, 
		RULE_param_type_list = 48, RULE_param_type = 49, RULE_param_type_id = 50, 
		RULE_identifier = 51, RULE_number = 52, RULE_ptrs = 53, RULE_func_ptrs = 54, 
		RULE_unary_operator = 55, RULE_relational_operator = 56, RULE_constant = 57, 
		RULE_function_decl_specifiers = 58, RULE_ptr_operator = 59, RULE_access_specifier = 60, 
		RULE_operator = 61, RULE_assignment_operator = 62, RULE_equality_operator = 63, 
		RULE_template_decl_start = 64, RULE_template_param_list = 65, RULE_no_brackets = 66, 
		RULE_no_brackets_curlies_or_squares = 67, RULE_no_brackets_or_semicolon = 68, 
		RULE_no_angle_brackets_or_brackets = 69, RULE_no_curlies = 70, RULE_no_squares = 71, 
		RULE_no_squares_or_semicolon = 72, RULE_no_comma_or_semicolon = 73, RULE_assign_water = 74, 
		RULE_assign_water_l2 = 75, RULE_water = 76, RULE_function_def = 77, RULE_return_type = 78, 
		RULE_function_param_list = 79, RULE_parameter_decl_clause = 80, RULE_parameter_decl = 81, 
		RULE_parameter_id = 82, RULE_compound_statement = 83, RULE_ctor_list = 84, 
		RULE_ctor_initializer = 85, RULE_initializer_id = 86, RULE_ctor_expr = 87, 
		RULE_function_name = 88, RULE_exception_specification = 89, RULE_type_id_list = 90, 
		RULE_assign_expr_w_ = 91, RULE_assign_expr_w__l2 = 92, RULE_constant_expr_w_ = 93;
	public static final String[] ruleNames = {
		"code", "using_directive", "pre_statement", "pre_if_condition", "condition", 
		"expr", "assign_expr", "conditional_expression", "or_expression", "and_expression", 
		"inclusive_or_expression", "exclusive_or_expression", "bit_and_expression", 
		"equality_expression", "relational_expression", "shift_expression", "additive_expression", 
		"multiplicative_expression", "cast_expression", "cast_target", "unary_expression", 
		"new_expression", "unary_op_and_cast_expr", "sizeof_expression", "sizeof", 
		"sizeof_operand", "sizeof_operand2", "inc_dec", "postfix_expression", 
		"function_argument_list", "function_argument", "primary_expression", "init_declarator", 
		"declarator", "type_suffix", "simple_decl", "var_decl", "init_declarator_list", 
		"initializer", "initializer_list", "class_def", "class_name", "base_classes", 
		"base_class", "type_name", "base_type", "param_decl_specifiers", "parameter_name", 
		"param_type_list", "param_type", "param_type_id", "identifier", "number", 
		"ptrs", "func_ptrs", "unary_operator", "relational_operator", "constant", 
		"function_decl_specifiers", "ptr_operator", "access_specifier", "operator", 
		"assignment_operator", "equality_operator", "template_decl_start", "template_param_list", 
		"no_brackets", "no_brackets_curlies_or_squares", "no_brackets_or_semicolon", 
		"no_angle_brackets_or_brackets", "no_curlies", "no_squares", "no_squares_or_semicolon", 
		"no_comma_or_semicolon", "assign_water", "assign_water_l2", "water", "function_def", 
		"return_type", "function_param_list", "parameter_decl_clause", "parameter_decl", 
		"parameter_id", "compound_statement", "ctor_list", "ctor_initializer", 
		"initializer_id", "ctor_expr", "function_name", "exception_specification", 
		"type_id_list", "assign_expr_w_", "assign_expr_w__l2", "constant_expr_w_"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'defined'", "'('", "')'", "'='", "','", "'?'", "':'", "'||'", 
		"'&&'", "'|'", "'^'", "'&'", "'<<'", "'>>'", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'::'", "'['", "']'", "'sizeof'", "'--'", "'++'", "'.'", "'->'", 
		"'<'", "'>'", "'restrict'", "'~'", "'!'", "'<='", "'>='", "'inline'", 
		"'explicit'", "'friend'", "'static'", "'public'", "'private'", "'protected'", 
		"'delete'", "'+='", "'-='", "'*='", "'/='", "'%='", "'^='", "'&='", "'|='", 
		"'>>='", "'<<='", "'=='", "'!='", "'->*'", "'if'", "'else'", "'for'", 
		"'while'", "'break'", "'case'", "'continue'", "'switch'", "'do'", "'goto'", 
		"'return'", "'typedef'", "'void'", "'unsigned'", "'signed'", "'long'", 
		null, "'virtual'", "'try'", "'catch'", "'throw'", "'using'", "'namespace'", 
		"'auto'", "'register'", "'operator'", "'template'", "'new'", null, null, 
		"'{'", "'}'", null, "'#elif'", "'#else'", "'#endif'", "'#include'", null, 
		null, null, null, null, null, null, null, null, null, "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "IF", "ELSE", "FOR", 
		"WHILE", "BREAK", "CASE", "CONTINUE", "SWITCH", "DO", "GOTO", "RETURN", 
		"TYPEDEF", "VOID", "UNSIGNED", "SIGNED", "LONG", "CV_QUALIFIER", "VIRTUAL", 
		"TRY", "CATCH", "THROW", "USING", "NAMESPACE", "AUTO", "REGISTER", "OPERATOR", 
		"TEMPLATE", "NEW", "CLASS_KEY", "ALPHA_NUMERIC", "OPENING_CURLY", "CLOSING_CURLY", 
		"PRE_IF", "PRE_ELIF", "PRE_ELSE", "PRE_ENDIF", "PRE_INCLUDE", "PRE_STMT", 
		"HEX_LITERAL", "DECIMAL_LITERAL", "OCTAL_LITERAL", "FLOATING_POINT_LITERAL", 
		"CHAR", "STRING", "COMMENT", "WHITESPACE", "CPPCOMMENT", "ELLIPSIS", "OTHER"
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
	public String getGrammarFileName() { return "Module.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    //Find the closing bracket to the opening bracket (and then return true), skip everything that is in between
	    public boolean skipToEndOfObject(){
	        //Stack of curly brackets
	        Stack<Object> CurlyStack = new Stack<Object>();
	        //Stack for collecting #ifs
	        Stack<Object> ifdefStack = new Stack<Object>();
	        //Object for the brackets and #ifs
	        Object o = new Object();
	        //Check weather current object is inside an outermoste preprocessor else statement
	        Boolean insideOutermostPreElseStatement = false;
	        //returns the value of the current symbol in the stream (which is the next symbol to be consumed)
	        int t = _input.LA(1);

	        //Find the closing bracket to the opening bracket, skip everything that is in between.
	        //Finish only if every opening bracket has a closing bracket and every #if has a closing #endif or the last #endif comes after the method end
	        while(t != EOF && !(CurlyStack.empty() && (ifdefStack.empty() || insideOutermostPreElseStatement)  && (t == CLOSING_CURLY))){
	            
	            try {
	                //Collect all found opening #ifs. If a #endif is found, remove one #if from stack
	                if(t == PRE_IF) 
	                    ifdefStack.push(o);         
	                else if(t == PRE_ENDIF) 
	                    ifdefStack.pop();
	                //Collect all found opening brackets. If a closing bracket is found, remove one opening bracket from stack
	                else if(t == OPENING_CURLY)                 
	                    CurlyStack.push(o);
	                else if(t == CLOSING_CURLY)
	                   CurlyStack.pop();

	            } catch (EmptyStackException e) {
	                //Do nothing
	            }
	            
	            //Check if we are inside the outermost #if#else block (because the final #endif can appear after the closing bracket of a method)
	            if(t == PRE_ELSE && ifdefStack.size() == 1){
	                insideOutermostPreElseStatement = true;
	            }
	                
	            //Consume and return the current symbol, move cursor to next symbol, the consumed symbol is added to the parse tree 
	            consume();
	            t = _input.LA(1);           
	        }
	        
	        if(t != EOF){
	            //Return and parse the closing bracket (if there is one)
	            consume();
	         }   
	         
	        return true;
	    }

	       // this should go into FunctionGrammar but ANTLR fails
	       // to join the parser::members-section on inclusion
	       
	       public boolean preProcSkipToEnd()
	       {
	                    Stack<Object> CurlyStack = new Stack<Object>();
	                    Object o = new Object();
	                    int t = _input.LA(1);

	                    while(t != EOF && !(CurlyStack.empty() && t == PRE_ENDIF)){
	                                            
	                        if(t == PRE_IF)
	                            CurlyStack.push(o);
	                        else if(t == PRE_ENDIF)
	                            CurlyStack.pop();
	                        
	                        consume();
	                        t = _input.LA(1);
	                    }
	                    if(t != EOF)
	                        consume();
	                    return true;
	       }


	public ModuleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CodeContext extends ParserRuleContext {
		public List<Function_defContext> function_def() {
			return getRuleContexts(Function_defContext.class);
		}
		public Function_defContext function_def(int i) {
			return getRuleContext(Function_defContext.class,i);
		}
		public List<Simple_declContext> simple_decl() {
			return getRuleContexts(Simple_declContext.class);
		}
		public Simple_declContext simple_decl(int i) {
			return getRuleContext(Simple_declContext.class,i);
		}
		public List<Using_directiveContext> using_directive() {
			return getRuleContexts(Using_directiveContext.class);
		}
		public Using_directiveContext using_directive(int i) {
			return getRuleContext(Using_directiveContext.class,i);
		}
		public List<Pre_statementContext> pre_statement() {
			return getRuleContexts(Pre_statementContext.class);
		}
		public Pre_statementContext pre_statement(int i) {
			return getRuleContext(Pre_statementContext.class,i);
		}
		public List<WaterContext> water() {
			return getRuleContexts(WaterContext.class);
		}
		public WaterContext water(int i) {
			return getRuleContext(WaterContext.class,i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCode(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_STMT - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (CPPCOMMENT - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				setState(193);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(188);
					function_def();
					}
					break;
				case 2:
					{
					setState(189);
					simple_decl();
					}
					break;
				case 3:
					{
					setState(190);
					using_directive();
					}
					break;
				case 4:
					{
					setState(191);
					pre_statement();
					}
					break;
				case 5:
					{
					setState(192);
					water();
					}
					break;
				}
				}
				setState(197);
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

	public static class Using_directiveContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(ModuleParser.USING, 0); }
		public TerminalNode NAMESPACE() { return getToken(ModuleParser.NAMESPACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Using_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterUsing_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitUsing_directive(this);
		}
	}

	public final Using_directiveContext using_directive() throws RecognitionException {
		Using_directiveContext _localctx = new Using_directiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_using_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(USING);
			setState(199);
			match(NAMESPACE);
			setState(200);
			identifier();
			setState(201);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
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
		public Pre_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_statement; }
	 
		public Pre_statementContext() { }
		public void copyFrom(Pre_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Pre_if_statementContext extends Pre_statementContext {
		public TerminalNode PRE_IF() { return getToken(ModuleParser.PRE_IF, 0); }
		public Pre_if_conditionContext pre_if_condition() {
			return getRuleContext(Pre_if_conditionContext.class,0);
		}
		public Pre_if_statementContext(Pre_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_if_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_if_statement(this);
		}
	}
	public static class Pre_endif_statementContext extends Pre_statementContext {
		public TerminalNode PRE_ENDIF() { return getToken(ModuleParser.PRE_ENDIF, 0); }
		public Pre_endif_statementContext(Pre_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_endif_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_endif_statement(this);
		}
	}
	public static class Pre_else_statementContext extends Pre_statementContext {
		public TerminalNode PRE_ELSE() { return getToken(ModuleParser.PRE_ELSE, 0); }
		public Pre_else_statementContext(Pre_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_else_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_else_statement(this);
		}
	}
	public static class Pre_elif_statementContext extends Pre_statementContext {
		public TerminalNode PRE_ELIF() { return getToken(ModuleParser.PRE_ELIF, 0); }
		public Pre_if_conditionContext pre_if_condition() {
			return getRuleContext(Pre_if_conditionContext.class,0);
		}
		public Pre_elif_statementContext(Pre_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_elif_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_elif_statement(this);
		}
	}

	public final Pre_statementContext pre_statement() throws RecognitionException {
		Pre_statementContext _localctx = new Pre_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pre_statement);
		try {
			setState(209);
			switch (_input.LA(1)) {
			case PRE_IF:
				_localctx = new Pre_if_statementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(PRE_IF);
				setState(204);
				pre_if_condition();
				}
				break;
			case PRE_ELIF:
				_localctx = new Pre_elif_statementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(PRE_ELIF);
				setState(206);
				pre_if_condition();
				}
				break;
			case PRE_ELSE:
				_localctx = new Pre_else_statementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				match(PRE_ELSE);
				}
				break;
			case PRE_ENDIF:
				_localctx = new Pre_endif_statementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_if_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_if_condition(this);
		}
	}

	public final Pre_if_conditionContext pre_if_condition() throws RecognitionException {
		Pre_if_conditionContext _localctx = new Pre_if_conditionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pre_if_condition);
		try {
			setState(220);
			switch (_input.LA(1)) {
			case T__2:
			case T__12:
			case T__15:
			case T__16:
			case T__17:
			case T__20:
			case T__23:
			case T__24:
			case T__25:
			case T__31:
			case T__32:
			case T__39:
			case T__40:
			case T__41:
			case VOID:
			case UNSIGNED:
			case SIGNED:
			case LONG:
			case CV_QUALIFIER:
			case NEW:
			case CLASS_KEY:
			case ALPHA_NUMERIC:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				condition();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(T__1);
				setState(214);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(213);
					match(T__2);
					}
					break;
				}
				setState(216);
				condition();
				setState(218);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(217);
					match(T__3);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condition);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				type_name();
				setState(224);
				declarator();
				setState(225);
				match(T__4);
				setState(226);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			assign_expr();
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(231);
				match(T__5);
				setState(232);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAssign_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAssign_expr(this);
		}
	}

	public final Assign_exprContext assign_expr() throws RecognitionException {
		Assign_exprContext _localctx = new Assign_exprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assign_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			conditional_expression();
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(236);
				assignment_operator();
				setState(237);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNormOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNormOr(this);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCndExpr(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_conditional_expression);
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new NormOrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				or_expression();
				}
				break;
			case 2:
				_localctx = new CndExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				or_expression();
				{
				setState(243);
				match(T__6);
				setState(244);
				expr();
				setState(245);
				match(T__7);
				setState(246);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterOr_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitOr_expression(this);
		}
	}

	public final Or_expressionContext or_expression() throws RecognitionException {
		Or_expressionContext _localctx = new Or_expressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_or_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			and_expression();
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(251);
				match(T__8);
				setState(252);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAnd_expression(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_and_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			inclusive_or_expression();
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(256);
				match(T__9);
				setState(257);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInclusive_or_expression(this);
		}
	}

	public final Inclusive_or_expressionContext inclusive_or_expression() throws RecognitionException {
		Inclusive_or_expressionContext _localctx = new Inclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inclusive_or_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			exclusive_or_expression();
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(261);
				match(T__10);
				setState(262);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterExclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitExclusive_or_expression(this);
		}
	}

	public final Exclusive_or_expressionContext exclusive_or_expression() throws RecognitionException {
		Exclusive_or_expressionContext _localctx = new Exclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exclusive_or_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			bit_and_expression();
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(266);
				match(T__11);
				setState(267);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterBit_and_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitBit_and_expression(this);
		}
	}

	public final Bit_and_expressionContext bit_and_expression() throws RecognitionException {
		Bit_and_expressionContext _localctx = new Bit_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bit_and_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			equality_expression();
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(271);
				match(T__12);
				setState(272);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitEquality_expression(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_equality_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			relational_expression();
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(276);
				equality_operator();
				setState(277);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitRelational_expression(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_relational_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			shift_expression();
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(282);
				relational_operator();
				setState(283);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterShift_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitShift_expression(this);
		}
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			additive_expression();
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(288);
				_la = _input.LA(1);
				if ( !(_la==T__13 || _la==T__14) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(289);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAdditive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAdditive_expression(this);
		}
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			multiplicative_expression();
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(293);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(294);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterMultiplicative_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitMultiplicative_expression(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_multiplicative_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			cast_expression();
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(298);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(299);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCast_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCast_expression(this);
		}
	}

	public final Cast_expressionContext cast_expression() throws RecognitionException {
		Cast_expressionContext _localctx = new Cast_expressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cast_expression);
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(302);
				match(T__2);
				setState(303);
				cast_target();
				setState(304);
				match(T__3);
				setState(305);
				cast_expression();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCast_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCast_target(this);
		}
	}

	public final Cast_targetContext cast_target() throws RecognitionException {
		Cast_targetContext _localctx = new Cast_targetContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cast_target);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			type_name();
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12 || _la==T__17) {
				{
				{
				setState(311);
				ptr_operator();
				}
				}
				setState(316);
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
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitUnary_expression(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_unary_expression);
		try {
			setState(321);
			switch (_input.LA(1)) {
			case T__12:
			case T__15:
			case T__16:
			case T__17:
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				unary_op_and_cast_expr();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				sizeof_expression();
				}
				break;
			case T__20:
			case NEW:
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
				new_expression();
				}
				break;
			case T__2:
			case T__24:
			case T__25:
			case T__39:
			case T__40:
			case T__41:
			case ALPHA_NUMERIC:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(320);
				postfix_expression(0);
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
		public TerminalNode NEW() { return getToken(ModuleParser.NEW, 0); }
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNew_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNew_expression(this);
		}
	}

	public final New_expressionContext new_expression() throws RecognitionException {
		New_expressionContext _localctx = new New_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_new_expression);
		int _la;
		try {
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(323);
					match(T__20);
					}
				}

				setState(326);
				match(NEW);
				setState(327);
				type_name();
				setState(328);
				match(T__21);
				setState(330);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__31) | (1L << T__32) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (NEW - 84)) | (1L << (ALPHA_NUMERIC - 84)) | (1L << (HEX_LITERAL - 84)) | (1L << (DECIMAL_LITERAL - 84)) | (1L << (OCTAL_LITERAL - 84)) | (1L << (FLOATING_POINT_LITERAL - 84)) | (1L << (CHAR - 84)) | (1L << (STRING - 84)))) != 0)) {
					{
					setState(329);
					conditional_expression();
					}
				}

				setState(332);
				match(T__22);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(334);
					match(T__20);
					}
				}

				setState(337);
				match(NEW);
				setState(338);
				type_name();
				setState(339);
				match(T__2);
				setState(341);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__31) | (1L << T__32) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (NEW - 84)) | (1L << (ALPHA_NUMERIC - 84)) | (1L << (HEX_LITERAL - 84)) | (1L << (DECIMAL_LITERAL - 84)) | (1L << (OCTAL_LITERAL - 84)) | (1L << (FLOATING_POINT_LITERAL - 84)) | (1L << (CHAR - 84)) | (1L << (STRING - 84)))) != 0)) {
					{
					setState(340);
					expr();
					}
				}

				setState(343);
				match(T__3);
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterUnary_op_and_cast_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitUnary_op_and_cast_expr(this);
		}
	}

	public final Unary_op_and_cast_exprContext unary_op_and_cast_expr() throws RecognitionException {
		Unary_op_and_cast_exprContext _localctx = new Unary_op_and_cast_exprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_unary_op_and_cast_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			unary_operator();
			setState(348);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterSizeof_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitSizeof_expression(this);
		}
	}

	public final Sizeof_expressionContext sizeof_expression() throws RecognitionException {
		Sizeof_expressionContext _localctx = new Sizeof_expressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_sizeof_expression);
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				sizeof();
				setState(351);
				match(T__2);
				setState(352);
				sizeof_operand();
				setState(353);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				sizeof();
				setState(356);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterSizeof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitSizeof(this);
		}
	}

	public final SizeofContext sizeof() throws RecognitionException {
		SizeofContext _localctx = new SizeofContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_sizeof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterSizeof_operand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitSizeof_operand(this);
		}
	}

	public final Sizeof_operandContext sizeof_operand() throws RecognitionException {
		Sizeof_operandContext _localctx = new Sizeof_operandContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_sizeof_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			type_name();
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12 || _la==T__17) {
				{
				{
				setState(363);
				ptr_operator();
				}
				}
				setState(368);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterSizeof_operand2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitSizeof_operand2(this);
		}
	}

	public final Sizeof_operand2Context sizeof_operand2() throws RecognitionException {
		Sizeof_operand2Context _localctx = new Sizeof_operand2Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_sizeof_operand2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInc_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInc_dec(this);
		}
	}

	public final Inc_decContext inc_dec() throws RecognitionException {
		Inc_decContext _localctx = new Inc_decContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_inc_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			_la = _input.LA(1);
			if ( !(_la==T__24 || _la==T__25) ) {
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
		public TerminalNode TEMPLATE() { return getToken(ModuleParser.TEMPLATE, 0); }
		public MemberAccessContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitMemberAccess(this);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterIncDecOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitIncDecOp(this);
		}
	}
	public static class PrimaryOnlyContext extends Postfix_expressionContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public PrimaryOnlyContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPrimaryOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPrimaryOnly(this);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFuncCall(this);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterArrayIndexing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitArrayIndexing(this);
		}
	}
	public static class PtrMemberAccessContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TEMPLATE() { return getToken(ModuleParser.TEMPLATE, 0); }
		public PtrMemberAccessContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPtrMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPtrMemberAccess(this);
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
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_postfix_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			switch (_input.LA(1)) {
			case T__2:
			case T__39:
			case T__40:
			case T__41:
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

				setState(374);
				primary_expression();
				}
				break;
			case T__24:
			case T__25:
				{
				_localctx = new IncDecOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(375);
				inc_dec();
				setState(376);
				primary_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(406);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(404);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayIndexingContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(380);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(381);
						match(T__21);
						setState(382);
						expr();
						setState(383);
						match(T__22);
						}
						break;
					case 2:
						{
						_localctx = new FuncCallContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(385);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(386);
						match(T__2);
						setState(387);
						function_argument_list();
						setState(388);
						match(T__3);
						}
						break;
					case 3:
						{
						_localctx = new MemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(390);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(391);
						match(T__26);
						setState(393);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(392);
							match(TEMPLATE);
							}
						}

						{
						setState(395);
						identifier();
						}
						}
						break;
					case 4:
						{
						_localctx = new PtrMemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(396);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(397);
						match(T__27);
						setState(399);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(398);
							match(TEMPLATE);
							}
						}

						{
						setState(401);
						identifier();
						}
						}
						break;
					case 5:
						{
						_localctx = new IncDecOpContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(402);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(403);
						inc_dec();
						}
						break;
					}
					} 
				}
				setState(408);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		public Function_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunction_argument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunction_argument_list(this);
		}
	}

	public final Function_argument_listContext function_argument_list() throws RecognitionException {
		Function_argument_listContext _localctx = new Function_argument_listContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_function_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__31) | (1L << T__32) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (NEW - 84)) | (1L << (ALPHA_NUMERIC - 84)) | (1L << (HEX_LITERAL - 84)) | (1L << (DECIMAL_LITERAL - 84)) | (1L << (OCTAL_LITERAL - 84)) | (1L << (FLOATING_POINT_LITERAL - 84)) | (1L << (CHAR - 84)) | (1L << (STRING - 84)))) != 0)) {
				{
				setState(409);
				function_argument();
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(410);
					match(T__5);
					setState(411);
					function_argument();
					}
					}
					setState(416);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunction_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunction_argument(this);
		}
	}

	public final Function_argumentContext function_argument() throws RecognitionException {
		Function_argumentContext _localctx = new Function_argumentContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_function_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPrimary_expression(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_primary_expression);
		try {
			setState(427);
			switch (_input.LA(1)) {
			case T__39:
			case T__40:
			case T__41:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
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
				setState(422);
				constant();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(423);
				match(T__2);
				setState(424);
				expr();
				setState(425);
				match(T__3);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInitDeclWithAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInitDeclWithAssign(this);
		}
	}
	public static class InitDeclSimpleContext extends Init_declaratorContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitDeclSimpleContext(Init_declaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInitDeclSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInitDeclSimple(this);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInitDeclWithCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInitDeclWithCall(this);
		}
	}

	public final Init_declaratorContext init_declarator() throws RecognitionException {
		Init_declaratorContext _localctx = new Init_declaratorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_init_declarator);
		int _la;
		try {
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				_localctx = new InitDeclWithCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				declarator();
				setState(430);
				match(T__2);
				setState(432);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__31) | (1L << T__32) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (NEW - 84)) | (1L << (ALPHA_NUMERIC - 84)) | (1L << (HEX_LITERAL - 84)) | (1L << (DECIMAL_LITERAL - 84)) | (1L << (OCTAL_LITERAL - 84)) | (1L << (FLOATING_POINT_LITERAL - 84)) | (1L << (CHAR - 84)) | (1L << (STRING - 84)))) != 0)) {
					{
					setState(431);
					expr();
					}
				}

				setState(434);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new InitDeclWithAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				declarator();
				setState(437);
				match(T__4);
				setState(438);
				initializer();
				}
				break;
			case 3:
				_localctx = new InitDeclSimpleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(440);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitDeclarator(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_declarator);
		int _la;
		try {
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				_la = _input.LA(1);
				if (_la==T__12 || _la==T__17) {
					{
					setState(443);
					ptrs();
					}
				}

				setState(446);
				identifier();
				setState(448);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(447);
					type_suffix();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				_la = _input.LA(1);
				if (_la==T__12 || _la==T__17) {
					{
					setState(450);
					ptrs();
					}
				}

				setState(453);
				match(T__2);
				setState(454);
				func_ptrs();
				setState(455);
				identifier();
				setState(456);
				match(T__3);
				setState(457);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterType_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitType_suffix(this);
		}
	}

	public final Type_suffixContext type_suffix() throws RecognitionException {
		Type_suffixContext _localctx = new Type_suffixContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_type_suffix);
		int _la;
		try {
			setState(467);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(461);
				match(T__21);
				setState(463);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__31) | (1L << T__32) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (NEW - 84)) | (1L << (ALPHA_NUMERIC - 84)) | (1L << (HEX_LITERAL - 84)) | (1L << (DECIMAL_LITERAL - 84)) | (1L << (OCTAL_LITERAL - 84)) | (1L << (FLOATING_POINT_LITERAL - 84)) | (1L << (CHAR - 84)) | (1L << (STRING - 84)))) != 0)) {
					{
					setState(462);
					conditional_expression();
					}
				}

				setState(465);
				match(T__22);
				}
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
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
		public TerminalNode TYPEDEF() { return getToken(ModuleParser.TYPEDEF, 0); }
		public Template_decl_startContext template_decl_start() {
			return getRuleContext(Template_decl_startContext.class,0);
		}
		public Simple_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterSimple_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitSimple_decl(this);
		}
	}

	public final Simple_declContext simple_decl() throws RecognitionException {
		Simple_declContext _localctx = new Simple_declContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_simple_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(470);
			_la = _input.LA(1);
			if (_la==TYPEDEF) {
				{
				setState(469);
				match(TYPEDEF);
				}
			}

			setState(473);
			_la = _input.LA(1);
			if (_la==TEMPLATE) {
				{
				setState(472);
				template_decl_start();
				}
			}

			}
			setState(475);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterDeclByClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitDeclByClass(this);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterDeclByType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitDeclByType(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_var_decl);
		try {
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				_localctx = new DeclByClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				class_def();
				setState(479);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(478);
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
				setState(481);
				type_name();
				setState(482);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInit_declarator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInit_declarator_list(this);
		}
	}

	public final Init_declarator_listContext init_declarator_list() throws RecognitionException {
		Init_declarator_listContext _localctx = new Init_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_init_declarator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			init_declarator();
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(487);
				match(T__5);
				setState(488);
				init_declarator();
				}
				}
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(494);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_initializer);
		try {
			setState(501);
			switch (_input.LA(1)) {
			case T__2:
			case T__12:
			case T__15:
			case T__16:
			case T__17:
			case T__20:
			case T__23:
			case T__24:
			case T__25:
			case T__31:
			case T__32:
			case T__39:
			case T__40:
			case T__41:
			case NEW:
			case ALPHA_NUMERIC:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				assign_expr();
				}
				break;
			case OPENING_CURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				match(OPENING_CURLY);
				setState(498);
				initializer_list();
				setState(499);
				match(CLOSING_CURLY);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInitializer_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInitializer_list(this);
		}
	}

	public final Initializer_listContext initializer_list() throws RecognitionException {
		Initializer_listContext _localctx = new Initializer_listContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_initializer_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			initializer();
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(504);
				match(T__5);
				setState(505);
				initializer();
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

	public static class Class_defContext extends ParserRuleContext {
		public TerminalNode CLASS_KEY() { return getToken(ModuleParser.CLASS_KEY, 0); }
		public TerminalNode OPENING_CURLY() { return getToken(ModuleParser.OPENING_CURLY, 0); }
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterClass_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitClass_def(this);
		}
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(CLASS_KEY);
			setState(513);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (T__39 - 40)) | (1L << (T__40 - 40)) | (1L << (T__41 - 40)) | (1L << (ALPHA_NUMERIC - 40)))) != 0)) {
				{
				setState(512);
				class_name();
				}
			}

			setState(516);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(515);
				base_classes();
				}
			}

			setState(518);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterClass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitClass_name(this);
		}
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterBase_classes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitBase_classes(this);
		}
	}

	public final Base_classesContext base_classes() throws RecognitionException {
		Base_classesContext _localctx = new Base_classesContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_base_classes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(T__7);
			setState(524);
			base_class();
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(525);
				match(T__5);
				setState(526);
				base_class();
				}
				}
				setState(531);
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
		public TerminalNode VIRTUAL() { return getToken(ModuleParser.VIRTUAL, 0); }
		public Access_specifierContext access_specifier() {
			return getRuleContext(Access_specifierContext.class,0);
		}
		public Base_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterBase_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitBase_class(this);
		}
	}

	public final Base_classContext base_class() throws RecognitionException {
		Base_classContext _localctx = new Base_classContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_base_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			_la = _input.LA(1);
			if (_la==VIRTUAL) {
				{
				setState(532);
				match(VIRTUAL);
				}
			}

			setState(536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(535);
				access_specifier();
				}
				break;
			}
			setState(538);
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
		public List<TerminalNode> CV_QUALIFIER() { return getTokens(ModuleParser.CV_QUALIFIER); }
		public TerminalNode CV_QUALIFIER(int i) {
			return getToken(ModuleParser.CV_QUALIFIER, i);
		}
		public List<Template_param_listContext> template_param_list() {
			return getRuleContexts(Template_param_listContext.class);
		}
		public Template_param_listContext template_param_list(int i) {
			return getRuleContext(Template_param_listContext.class,i);
		}
		public TerminalNode CLASS_KEY() { return getToken(ModuleParser.CLASS_KEY, 0); }
		public TerminalNode UNSIGNED() { return getToken(ModuleParser.UNSIGNED, 0); }
		public TerminalNode SIGNED() { return getToken(ModuleParser.SIGNED, 0); }
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitType_name(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_type_name);
		int _la;
		try {
			setState(574);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CV_QUALIFIER) {
					{
					{
					setState(540);
					match(CV_QUALIFIER);
					}
					}
					setState(545);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(547);
				_la = _input.LA(1);
				if (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (UNSIGNED - 70)) | (1L << (SIGNED - 70)) | (1L << (CLASS_KEY - 70)))) != 0)) {
					{
					setState(546);
					_la = _input.LA(1);
					if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (UNSIGNED - 70)) | (1L << (SIGNED - 70)) | (1L << (CLASS_KEY - 70)))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(549);
				base_type();
				setState(554);
				_la = _input.LA(1);
				if (_la==T__28) {
					{
					setState(550);
					match(T__28);
					setState(551);
					template_param_list();
					setState(552);
					match(T__29);
					}
				}

				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__20) {
					{
					{
					setState(556);
					match(T__20);
					setState(557);
					base_type();
					setState(562);
					_la = _input.LA(1);
					if (_la==T__28) {
						{
						setState(558);
						match(T__28);
						setState(559);
						template_param_list();
						setState(560);
						match(T__29);
						}
					}

					}
					}
					setState(568);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(570);
				_la = _input.LA(1);
				if (_la==CV_QUALIFIER) {
					{
					setState(569);
					match(CV_QUALIFIER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(572);
				match(UNSIGNED);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(573);
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
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(ModuleParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(ModuleParser.ALPHA_NUMERIC, i);
		}
		public List<TerminalNode> VOID() { return getTokens(ModuleParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(ModuleParser.VOID, i);
		}
		public List<TerminalNode> LONG() { return getTokens(ModuleParser.LONG); }
		public TerminalNode LONG(int i) {
			return getToken(ModuleParser.LONG, i);
		}
		public Base_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterBase_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitBase_type(this);
		}
	}

	public final Base_typeContext base_type() throws RecognitionException {
		Base_typeContext _localctx = new Base_typeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_base_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(577); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(576);
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
				setState(579); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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
		public TerminalNode AUTO() { return getToken(ModuleParser.AUTO, 0); }
		public TerminalNode REGISTER() { return getToken(ModuleParser.REGISTER, 0); }
		public Param_decl_specifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl_specifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParam_decl_specifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParam_decl_specifiers(this);
		}
	}

	public final Param_decl_specifiersContext param_decl_specifiers() throws RecognitionException {
		Param_decl_specifiersContext _localctx = new Param_decl_specifiersContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_param_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			_la = _input.LA(1);
			if (_la==AUTO || _la==REGISTER) {
				{
				setState(581);
				_la = _input.LA(1);
				if ( !(_la==AUTO || _la==REGISTER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(584);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParameter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParameter_name(this);
		}
	}

	public final Parameter_nameContext parameter_name() throws RecognitionException {
		Parameter_nameContext _localctx = new Parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_parameter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
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
		public TerminalNode VOID() { return getToken(ModuleParser.VOID, 0); }
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParam_type_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParam_type_list(this);
		}
	}

	public final Param_type_listContext param_type_list() throws RecognitionException {
		Param_type_listContext _localctx = new Param_type_listContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_param_type_list);
		int _la;
		try {
			setState(603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(588);
				match(T__2);
				setState(589);
				match(VOID);
				setState(590);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(591);
				match(T__2);
				setState(600);
				_la = _input.LA(1);
				if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (VOID - 69)) | (1L << (UNSIGNED - 69)) | (1L << (SIGNED - 69)) | (1L << (LONG - 69)) | (1L << (CV_QUALIFIER - 69)) | (1L << (AUTO - 69)) | (1L << (REGISTER - 69)) | (1L << (CLASS_KEY - 69)) | (1L << (ALPHA_NUMERIC - 69)))) != 0)) {
					{
					setState(592);
					param_type();
					setState(597);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__5) {
						{
						{
						setState(593);
						match(T__5);
						setState(594);
						param_type();
						}
						}
						setState(599);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(602);
				match(T__3);
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParam_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParam_type(this);
		}
	}

	public final Param_typeContext param_type() throws RecognitionException {
		Param_typeContext _localctx = new Param_typeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_param_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			param_decl_specifiers();
			setState(606);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParam_type_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParam_type_id(this);
		}
	}

	public final Param_type_idContext param_type_id() throws RecognitionException {
		Param_type_idContext _localctx = new Param_type_idContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_param_type_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__17) {
				{
				setState(608);
				ptrs();
				}
			}

			setState(618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(611);
				match(T__2);
				setState(612);
				param_type_id();
				setState(613);
				match(T__3);
				}
				break;
			case 2:
				{
				setState(616);
				_la = _input.LA(1);
				if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (T__39 - 40)) | (1L << (T__40 - 40)) | (1L << (T__41 - 40)) | (1L << (ALPHA_NUMERIC - 40)))) != 0)) {
					{
					setState(615);
					parameter_name();
					}
				}

				}
				break;
			}
			setState(621);
			_la = _input.LA(1);
			if (_la==T__2 || _la==T__21) {
				{
				setState(620);
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
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(ModuleParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(ModuleParser.ALPHA_NUMERIC, i);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_identifier);
		try {
			int _alt;
			setState(632);
			switch (_input.LA(1)) {
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(623);
				match(ALPHA_NUMERIC);
				setState(628);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(624);
						match(T__20);
						setState(625);
						match(ALPHA_NUMERIC);
						}
						} 
					}
					setState(630);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				}
				}
				}
				break;
			case T__39:
			case T__40:
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
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
		public TerminalNode HEX_LITERAL() { return getToken(ModuleParser.HEX_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ModuleParser.DECIMAL_LITERAL, 0); }
		public TerminalNode OCTAL_LITERAL() { return getToken(ModuleParser.OCTAL_LITERAL, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			_la = _input.LA(1);
			if ( !(((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (HEX_LITERAL - 95)) | (1L << (DECIMAL_LITERAL - 95)) | (1L << (OCTAL_LITERAL - 95)))) != 0)) ) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPtrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPtrs(this);
		}
	}

	public final PtrsContext ptrs() throws RecognitionException {
		PtrsContext _localctx = new PtrsContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_ptrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(636);
				ptr_operator();
				setState(638);
				_la = _input.LA(1);
				if (_la==T__30) {
					{
					setState(637);
					match(T__30);
					}
				}

				}
				}
				setState(642); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__12 || _la==T__17 );
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunc_ptrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunc_ptrs(this);
		}
	}

	public final Func_ptrsContext func_ptrs() throws RecognitionException {
		Func_ptrsContext _localctx = new Func_ptrsContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_func_ptrs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitUnary_operator(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__31) | (1L << T__32))) != 0)) ) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterRelational_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitRelational_operator(this);
		}
	}

	public final Relational_operatorContext relational_operator() throws RecognitionException {
		Relational_operatorContext _localctx = new Relational_operatorContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_relational_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__33) | (1L << T__34))) != 0)) ) {
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
		public TerminalNode HEX_LITERAL() { return getToken(ModuleParser.HEX_LITERAL, 0); }
		public TerminalNode OCTAL_LITERAL() { return getToken(ModuleParser.OCTAL_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ModuleParser.DECIMAL_LITERAL, 0); }
		public TerminalNode STRING() { return getToken(ModuleParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(ModuleParser.CHAR, 0); }
		public TerminalNode FLOATING_POINT_LITERAL() { return getToken(ModuleParser.FLOATING_POINT_LITERAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			_la = _input.LA(1);
			if ( !(((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (HEX_LITERAL - 95)) | (1L << (DECIMAL_LITERAL - 95)) | (1L << (OCTAL_LITERAL - 95)) | (1L << (FLOATING_POINT_LITERAL - 95)) | (1L << (CHAR - 95)) | (1L << (STRING - 95)))) != 0)) ) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunction_decl_specifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunction_decl_specifiers(this);
		}
	}

	public final Function_decl_specifiersContext function_decl_specifiers() throws RecognitionException {
		Function_decl_specifiersContext _localctx = new Function_decl_specifiersContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_function_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			_la = _input.LA(1);
			if ( !(((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (T__35 - 36)) | (1L << (T__36 - 36)) | (1L << (T__37 - 36)) | (1L << (T__38 - 36)) | (1L << (VIRTUAL - 36)))) != 0)) ) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPtr_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPtr_operator(this);
		}
	}

	public final Ptr_operatorContext ptr_operator() throws RecognitionException {
		Ptr_operatorContext _localctx = new Ptr_operatorContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_ptr_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			_la = _input.LA(1);
			if ( !(_la==T__12 || _la==T__17) ) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAccess_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAccess_specifier(this);
		}
	}

	public final Access_specifierContext access_specifier() throws RecognitionException {
		Access_specifierContext _localctx = new Access_specifierContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_access_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) ) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_operator);
		int _la;
		try {
			setState(703);
			switch (_input.LA(1)) {
			case T__42:
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(658);
				_la = _input.LA(1);
				if ( !(_la==T__42 || _la==NEW) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(661);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(659);
					match(T__21);
					setState(660);
					match(T__22);
					}
				}

				}
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(663);
				match(T__15);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(664);
				match(T__16);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(665);
				match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 5);
				{
				setState(666);
				match(T__18);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 6);
				{
				setState(667);
				match(T__19);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 7);
				{
				setState(668);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 8);
				{
				setState(669);
				match(T__12);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 9);
				{
				setState(670);
				match(T__10);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 10);
				{
				setState(671);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 11);
				{
				setState(672);
				match(T__32);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 12);
				{
				setState(673);
				match(T__4);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 13);
				{
				setState(674);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 14);
				{
				setState(675);
				match(T__29);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 15);
				{
				setState(676);
				match(T__43);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 16);
				{
				setState(677);
				match(T__44);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 17);
				{
				setState(678);
				match(T__45);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 18);
				{
				setState(679);
				match(T__46);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 19);
				{
				setState(680);
				match(T__47);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 20);
				{
				setState(681);
				match(T__48);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 21);
				{
				setState(682);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 22);
				{
				setState(683);
				match(T__50);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 23);
				{
				setState(684);
				match(T__14);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 24);
				{
				setState(685);
				match(T__13);
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 25);
				{
				setState(686);
				match(T__51);
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 26);
				{
				setState(687);
				match(T__52);
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 27);
				{
				setState(688);
				match(T__53);
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 28);
				{
				setState(689);
				match(T__54);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 29);
				{
				setState(690);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 30);
				{
				setState(691);
				match(T__34);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 31);
				{
				setState(692);
				match(T__9);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 32);
				{
				setState(693);
				match(T__8);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 33);
				{
				setState(694);
				match(T__25);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 34);
				{
				setState(695);
				match(T__24);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 35);
				{
				setState(696);
				match(T__5);
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 36);
				{
				setState(697);
				match(T__55);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 37);
				{
				setState(698);
				match(T__27);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 38);
				{
				setState(699);
				match(T__2);
				setState(700);
				match(T__3);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 39);
				{
				setState(701);
				match(T__21);
				setState(702);
				match(T__22);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAssignment_operator(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52))) != 0)) ) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterEquality_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitEquality_operator(this);
		}
	}

	public final Equality_operatorContext equality_operator() throws RecognitionException {
		Equality_operatorContext _localctx = new Equality_operatorContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_equality_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			_la = _input.LA(1);
			if ( !(_la==T__53 || _la==T__54) ) {
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
		public TerminalNode TEMPLATE() { return getToken(ModuleParser.TEMPLATE, 0); }
		public Template_param_listContext template_param_list() {
			return getRuleContext(Template_param_listContext.class,0);
		}
		public Template_decl_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_decl_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterTemplate_decl_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitTemplate_decl_start(this);
		}
	}

	public final Template_decl_startContext template_decl_start() throws RecognitionException {
		Template_decl_startContext _localctx = new Template_decl_startContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_template_decl_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			match(TEMPLATE);
			setState(710);
			match(T__28);
			setState(711);
			template_param_list();
			setState(712);
			match(T__29);
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterTemplate_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitTemplate_param_list(this);
		}
	}

	public final Template_param_listContext template_param_list() throws RecognitionException {
		Template_param_listContext _localctx = new Template_param_listContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_template_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(723);
				switch (_input.LA(1)) {
				case T__28:
					{
					{
					setState(714);
					match(T__28);
					setState(715);
					template_param_list();
					setState(716);
					match(T__29);
					}
					}
					break;
				case T__2:
					{
					{
					setState(718);
					match(T__2);
					setState(719);
					template_param_list();
					setState(720);
					match(T__3);
					}
					}
					break;
				case T__0:
				case T__1:
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
				case T__23:
				case T__24:
				case T__25:
				case T__26:
				case T__27:
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
				case OPERATOR:
				case TEMPLATE:
				case NEW:
				case CLASS_KEY:
				case ALPHA_NUMERIC:
				case OPENING_CURLY:
				case CLOSING_CURLY:
				case PRE_IF:
				case PRE_ELIF:
				case PRE_ELSE:
				case PRE_ENDIF:
				case PRE_INCLUDE:
				case PRE_STMT:
				case HEX_LITERAL:
				case DECIMAL_LITERAL:
				case OCTAL_LITERAL:
				case FLOATING_POINT_LITERAL:
				case CHAR:
				case STRING:
				case COMMENT:
				case WHITESPACE:
				case CPPCOMMENT:
				case ELLIPSIS:
				case OTHER:
					{
					setState(722);
					no_angle_brackets_or_brackets();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(725); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_STMT - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (CPPCOMMENT - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_brackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_brackets(this);
		}
	}

	public final No_bracketsContext no_brackets() throws RecognitionException {
		No_bracketsContext _localctx = new No_bracketsContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_no_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__2 || _la==T__3) ) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_brackets_curlies_or_squares(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_brackets_curlies_or_squares(this);
		}
	}

	public final No_brackets_curlies_or_squaresContext no_brackets_curlies_or_squares() throws RecognitionException {
		No_brackets_curlies_or_squaresContext _localctx = new No_brackets_curlies_or_squaresContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_no_brackets_curlies_or_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__21) | (1L << T__22))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_brackets_or_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_brackets_or_semicolon(this);
		}
	}

	public final No_brackets_or_semicolonContext no_brackets_or_semicolon() throws RecognitionException {
		No_brackets_or_semicolonContext _localctx = new No_brackets_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_no_brackets_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3))) != 0)) ) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_angle_brackets_or_brackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_angle_brackets_or_brackets(this);
		}
	}

	public final No_angle_brackets_or_bracketsContext no_angle_brackets_or_brackets() throws RecognitionException {
		No_angle_brackets_or_bracketsContext _localctx = new No_angle_brackets_or_bracketsContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_no_angle_brackets_or_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__28) | (1L << T__29))) != 0)) ) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_curlies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_curlies(this);
		}
	}

	public final No_curliesContext no_curlies() throws RecognitionException {
		No_curliesContext _localctx = new No_curliesContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_no_curlies);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_squares(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_squares(this);
		}
	}

	public final No_squaresContext no_squares() throws RecognitionException {
		No_squaresContext _localctx = new No_squaresContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_no_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__21 || _la==T__22) ) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_squares_or_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_squares_or_semicolon(this);
		}
	}

	public final No_squares_or_semicolonContext no_squares_or_semicolon() throws RecognitionException {
		No_squares_or_semicolonContext _localctx = new No_squares_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_no_squares_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__21) | (1L << T__22))) != 0)) ) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_comma_or_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_comma_or_semicolon(this);
		}
	}

	public final No_comma_or_semicolonContext no_comma_or_semicolon() throws RecognitionException {
		No_comma_or_semicolonContext _localctx = new No_comma_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_no_comma_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__0 || _la==T__5) ) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAssign_water(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAssign_water(this);
		}
	}

	public final Assign_waterContext assign_water() throws RecognitionException {
		Assign_waterContext _localctx = new Assign_waterContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_assign_water);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << T__21) | (1L << T__22))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAssign_water_l2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAssign_water_l2(this);
		}
	}

	public final Assign_water_l2Context assign_water_l2() throws RecognitionException {
		Assign_water_l2Context _localctx = new Assign_water_l2Context(_ctx, getState());
		enterRule(_localctx, 150, RULE_assign_water_l2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__21) | (1L << T__22))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterWater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitWater(this);
		}
	}

	public final WaterContext water() throws RecognitionException {
		WaterContext _localctx = new WaterContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_water);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
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
		public Ctor_listContext ctor_list() {
			return getRuleContext(Ctor_listContext.class,0);
		}
		public Function_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunction_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunction_def(this);
		}
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_function_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			_la = _input.LA(1);
			if (_la==TEMPLATE) {
				{
				setState(749);
				template_decl_start();
				}
			}

			setState(753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(752);
				return_type();
				}
				break;
			}
			setState(755);
			function_name();
			setState(756);
			function_param_list();
			setState(758);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(757);
				ctor_list();
				}
			}

			setState(760);
			compound_statement();
			}
		}
		catch (RecognitionException re) {
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
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitReturn_type(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_return_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (T__35 - 36)) | (1L << (T__36 - 36)) | (1L << (T__37 - 36)) | (1L << (T__38 - 36)) | (1L << (VIRTUAL - 36)))) != 0)) {
				{
				{
				setState(762);
				function_decl_specifiers();
				}
				}
				setState(767);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(768);
			type_name();
			}
			setState(773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12 || _la==T__17) {
				{
				{
				setState(770);
				ptr_operator();
				}
				}
				setState(775);
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

	public static class Function_param_listContext extends ParserRuleContext {
		public Parameter_decl_clauseContext parameter_decl_clause() {
			return getRuleContext(Parameter_decl_clauseContext.class,0);
		}
		public List<TerminalNode> CV_QUALIFIER() { return getTokens(ModuleParser.CV_QUALIFIER); }
		public TerminalNode CV_QUALIFIER(int i) {
			return getToken(ModuleParser.CV_QUALIFIER, i);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunction_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunction_param_list(this);
		}
	}

	public final Function_param_listContext function_param_list() throws RecognitionException {
		Function_param_listContext _localctx = new Function_param_listContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_function_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			match(T__2);
			setState(778);
			_la = _input.LA(1);
			if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (VOID - 69)) | (1L << (UNSIGNED - 69)) | (1L << (SIGNED - 69)) | (1L << (LONG - 69)) | (1L << (CV_QUALIFIER - 69)) | (1L << (AUTO - 69)) | (1L << (REGISTER - 69)) | (1L << (CLASS_KEY - 69)) | (1L << (ALPHA_NUMERIC - 69)))) != 0)) {
				{
				setState(777);
				parameter_decl_clause();
				}
			}

			setState(780);
			match(T__3);
			setState(784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CV_QUALIFIER) {
				{
				{
				setState(781);
				match(CV_QUALIFIER);
				}
				}
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(788);
			_la = _input.LA(1);
			if (_la==THROW) {
				{
				setState(787);
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
		public TerminalNode VOID() { return getToken(ModuleParser.VOID, 0); }
		public Parameter_decl_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_decl_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParameter_decl_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParameter_decl_clause(this);
		}
	}

	public final Parameter_decl_clauseContext parameter_decl_clause() throws RecognitionException {
		Parameter_decl_clauseContext _localctx = new Parameter_decl_clauseContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_parameter_decl_clause);
		int _la;
		try {
			int _alt;
			setState(803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(790);
				parameter_decl();
				setState(795);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(791);
						match(T__5);
						setState(792);
						parameter_decl();
						}
						} 
					}
					setState(797);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				}
				}
				setState(800);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(798);
					match(T__5);
					setState(799);
					match(ELLIPSIS);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(802);
				match(VOID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParameter_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParameter_decl(this);
		}
	}

	public final Parameter_declContext parameter_decl() throws RecognitionException {
		Parameter_declContext _localctx = new Parameter_declContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_parameter_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			param_decl_specifiers();
			setState(806);
			parameter_id();
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParameter_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParameter_id(this);
		}
	}

	public final Parameter_idContext parameter_id() throws RecognitionException {
		Parameter_idContext _localctx = new Parameter_idContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_parameter_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__17) {
				{
				setState(808);
				ptrs();
				}
			}

			setState(816);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(811);
				match(T__2);
				setState(812);
				parameter_id();
				setState(813);
				match(T__3);
				}
				break;
			case T__39:
			case T__40:
			case T__41:
			case ALPHA_NUMERIC:
				{
				setState(815);
				parameter_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(819);
			_la = _input.LA(1);
			if (_la==T__2 || _la==T__21) {
				{
				setState(818);
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
		public TerminalNode OPENING_CURLY() { return getToken(ModuleParser.OPENING_CURLY, 0); }
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCompound_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCompound_statement(this);
		}
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_compound_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCtor_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCtor_list(this);
		}
	}

	public final Ctor_listContext ctor_list() throws RecognitionException {
		Ctor_listContext _localctx = new Ctor_listContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_ctor_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			match(T__7);
			setState(825);
			ctor_initializer();
			setState(830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(826);
				match(T__5);
				setState(827);
				ctor_initializer();
				}
				}
				setState(832);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCtor_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCtor_initializer(this);
		}
	}

	public final Ctor_initializerContext ctor_initializer() throws RecognitionException {
		Ctor_initializerContext _localctx = new Ctor_initializerContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_ctor_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			initializer_id();
			setState(834);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInitializer_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInitializer_id(this);
		}
	}

	public final Initializer_idContext initializer_id() throws RecognitionException {
		Initializer_idContext _localctx = new Initializer_idContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_initializer_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(836);
				match(T__20);
				}
			}

			setState(839);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCtor_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCtor_expr(this);
		}
	}

	public final Ctor_exprContext ctor_expr() throws RecognitionException {
		Ctor_exprContext _localctx = new Ctor_exprContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_ctor_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			match(T__2);
			setState(843);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__31) | (1L << T__32) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (NEW - 84)) | (1L << (ALPHA_NUMERIC - 84)) | (1L << (HEX_LITERAL - 84)) | (1L << (DECIMAL_LITERAL - 84)) | (1L << (OCTAL_LITERAL - 84)) | (1L << (FLOATING_POINT_LITERAL - 84)) | (1L << (CHAR - 84)) | (1L << (STRING - 84)))) != 0)) {
				{
				setState(842);
				expr();
				}
			}

			setState(845);
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

	public static class Function_nameContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPERATOR() { return getToken(ModuleParser.OPERATOR, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunction_name(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_function_name);
		try {
			setState(854);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(847);
				match(T__2);
				setState(848);
				function_name();
				setState(849);
				match(T__3);
				}
				break;
			case T__39:
			case T__40:
			case T__41:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(851);
				identifier();
				}
				break;
			case OPERATOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(852);
				match(OPERATOR);
				setState(853);
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
		public TerminalNode THROW() { return getToken(ModuleParser.THROW, 0); }
		public Type_id_listContext type_id_list() {
			return getRuleContext(Type_id_listContext.class,0);
		}
		public Exception_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterException_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitException_specification(this);
		}
	}

	public final Exception_specificationContext exception_specification() throws RecognitionException {
		Exception_specificationContext _localctx = new Exception_specificationContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_exception_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			match(THROW);
			setState(857);
			match(T__2);
			setState(858);
			type_id_list();
			setState(859);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterType_id_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitType_id_list(this);
		}
	}

	public final Type_id_listContext type_id_list() throws RecognitionException {
		Type_id_listContext _localctx = new Type_id_listContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_type_id_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_STMT - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (CPPCOMMENT - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(861);
				no_brackets();
				}
				}
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(878);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(867);
				match(T__2);
				setState(868);
				type_id_list();
				setState(869);
				match(T__3);
				setState(873);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_STMT - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (CPPCOMMENT - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(870);
					no_brackets();
					}
					}
					setState(875);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(880);
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

	public static class Assign_expr_w_Context extends ParserRuleContext {
		public List<Assign_waterContext> assign_water() {
			return getRuleContexts(Assign_waterContext.class);
		}
		public Assign_waterContext assign_water(int i) {
			return getRuleContext(Assign_waterContext.class,i);
		}
		public List<Assign_expr_w__l2Context> assign_expr_w__l2() {
			return getRuleContexts(Assign_expr_w__l2Context.class);
		}
		public Assign_expr_w__l2Context assign_expr_w__l2(int i) {
			return getRuleContext(Assign_expr_w__l2Context.class,i);
		}
		public Assign_expr_w_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expr_w_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAssign_expr_w_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAssign_expr_w_(this);
		}
	}

	public final Assign_expr_w_Context assign_expr_w_() throws RecognitionException {
		Assign_expr_w_Context _localctx = new Assign_expr_w_Context(_ctx, getState());
		enterRule(_localctx, 182, RULE_assign_expr_w_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_STMT - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (CPPCOMMENT - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(881);
				assign_water();
				}
				}
				setState(886);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__21 || _la==OPENING_CURLY) {
				{
				{
				setState(899);
				switch (_input.LA(1)) {
				case OPENING_CURLY:
					{
					setState(887);
					match(OPENING_CURLY);
					setState(888);
					assign_expr_w__l2();
					setState(889);
					match(CLOSING_CURLY);
					}
					break;
				case T__2:
					{
					setState(891);
					match(T__2);
					setState(892);
					assign_expr_w__l2();
					setState(893);
					match(T__3);
					}
					break;
				case T__21:
					{
					setState(895);
					match(T__21);
					setState(896);
					assign_expr_w__l2();
					setState(897);
					match(T__22);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(904);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_STMT - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (CPPCOMMENT - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(901);
					assign_water();
					}
					}
					setState(906);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(911);
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

	public static class Assign_expr_w__l2Context extends ParserRuleContext {
		public List<Assign_water_l2Context> assign_water_l2() {
			return getRuleContexts(Assign_water_l2Context.class);
		}
		public Assign_water_l2Context assign_water_l2(int i) {
			return getRuleContext(Assign_water_l2Context.class,i);
		}
		public List<Assign_expr_w__l2Context> assign_expr_w__l2() {
			return getRuleContexts(Assign_expr_w__l2Context.class);
		}
		public Assign_expr_w__l2Context assign_expr_w__l2(int i) {
			return getRuleContext(Assign_expr_w__l2Context.class,i);
		}
		public Assign_expr_w__l2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expr_w__l2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAssign_expr_w__l2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAssign_expr_w__l2(this);
		}
	}

	public final Assign_expr_w__l2Context assign_expr_w__l2() throws RecognitionException {
		Assign_expr_w__l2Context _localctx = new Assign_expr_w__l2Context(_ctx, getState());
		enterRule(_localctx, 184, RULE_assign_expr_w__l2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_STMT - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (CPPCOMMENT - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(912);
				assign_water_l2();
				}
				}
				setState(917);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(940);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__21 || _la==OPENING_CURLY) {
				{
				{
				setState(930);
				switch (_input.LA(1)) {
				case OPENING_CURLY:
					{
					setState(918);
					match(OPENING_CURLY);
					setState(919);
					assign_expr_w__l2();
					setState(920);
					match(CLOSING_CURLY);
					}
					break;
				case T__2:
					{
					setState(922);
					match(T__2);
					setState(923);
					assign_expr_w__l2();
					setState(924);
					match(T__3);
					}
					break;
				case T__21:
					{
					setState(926);
					match(T__21);
					setState(927);
					assign_expr_w__l2();
					setState(928);
					match(T__22);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(935);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_STMT - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (CPPCOMMENT - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(932);
					assign_water_l2();
					}
					}
					setState(937);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(942);
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

	public static class Constant_expr_w_Context extends ParserRuleContext {
		public List<No_squaresContext> no_squares() {
			return getRuleContexts(No_squaresContext.class);
		}
		public No_squaresContext no_squares(int i) {
			return getRuleContext(No_squaresContext.class,i);
		}
		public List<Constant_expr_w_Context> constant_expr_w_() {
			return getRuleContexts(Constant_expr_w_Context.class);
		}
		public Constant_expr_w_Context constant_expr_w_(int i) {
			return getRuleContext(Constant_expr_w_Context.class,i);
		}
		public Constant_expr_w_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_expr_w_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterConstant_expr_w_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitConstant_expr_w_(this);
		}
	}

	public final Constant_expr_w_Context constant_expr_w_() throws RecognitionException {
		Constant_expr_w_Context _localctx = new Constant_expr_w_Context(_ctx, getState());
		enterRule(_localctx, 186, RULE_constant_expr_w_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_STMT - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (CPPCOMMENT - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(943);
				no_squares();
				}
				}
				setState(948);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(960);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(949);
				match(T__21);
				setState(950);
				constant_expr_w_();
				setState(951);
				match(T__22);
				setState(955);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_STMT - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (CPPCOMMENT - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(952);
					no_squares();
					}
					}
					setState(957);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(962);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 28:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3k\u03c6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\3"+
		"\2\3\2\3\2\3\2\3\2\7\2\u00c4\n\2\f\2\16\2\u00c7\13\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00d4\n\4\3\5\3\5\3\5\5\5\u00d9\n\5\3\5"+
		"\3\5\5\5\u00dd\n\5\5\5\u00df\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00e7\n\6"+
		"\3\7\3\7\3\7\5\7\u00ec\n\7\3\b\3\b\3\b\3\b\5\b\u00f2\n\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u00fb\n\t\3\n\3\n\3\n\5\n\u0100\n\n\3\13\3\13\3\13"+
		"\5\13\u0105\n\13\3\f\3\f\3\f\5\f\u010a\n\f\3\r\3\r\3\r\5\r\u010f\n\r\3"+
		"\16\3\16\3\16\5\16\u0114\n\16\3\17\3\17\3\17\3\17\5\17\u011a\n\17\3\20"+
		"\3\20\3\20\3\20\5\20\u0120\n\20\3\21\3\21\3\21\5\21\u0125\n\21\3\22\3"+
		"\22\3\22\5\22\u012a\n\22\3\23\3\23\3\23\5\23\u012f\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u0137\n\24\3\25\3\25\7\25\u013b\n\25\f\25\16\25\u013e"+
		"\13\25\3\26\3\26\3\26\3\26\5\26\u0144\n\26\3\27\5\27\u0147\n\27\3\27\3"+
		"\27\3\27\3\27\5\27\u014d\n\27\3\27\3\27\3\27\5\27\u0152\n\27\3\27\3\27"+
		"\3\27\3\27\5\27\u0158\n\27\3\27\3\27\5\27\u015c\n\27\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0169\n\31\3\32\3\32\3\33"+
		"\3\33\7\33\u016f\n\33\f\33\16\33\u0172\13\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u017d\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u018c\n\36\3\36\3\36\3\36\3\36\5\36"+
		"\u0192\n\36\3\36\3\36\3\36\7\36\u0197\n\36\f\36\16\36\u019a\13\36\3\37"+
		"\3\37\3\37\7\37\u019f\n\37\f\37\16\37\u01a2\13\37\5\37\u01a4\n\37\3 \3"+
		" \3!\3!\3!\3!\3!\3!\5!\u01ae\n!\3\"\3\"\3\"\5\"\u01b3\n\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\5\"\u01bc\n\"\3#\5#\u01bf\n#\3#\3#\5#\u01c3\n#\3#\5#"+
		"\u01c6\n#\3#\3#\3#\3#\3#\3#\5#\u01ce\n#\3$\3$\5$\u01d2\n$\3$\3$\5$\u01d6"+
		"\n$\3%\5%\u01d9\n%\3%\5%\u01dc\n%\3%\3%\3&\3&\5&\u01e2\n&\3&\3&\3&\5&"+
		"\u01e7\n&\3\'\3\'\3\'\7\'\u01ec\n\'\f\'\16\'\u01ef\13\'\3\'\3\'\3(\3("+
		"\3(\3(\3(\5(\u01f8\n(\3)\3)\3)\7)\u01fd\n)\f)\16)\u0200\13)\3*\3*\5*\u0204"+
		"\n*\3*\5*\u0207\n*\3*\3*\3*\3+\3+\3,\3,\3,\3,\7,\u0212\n,\f,\16,\u0215"+
		"\13,\3-\5-\u0218\n-\3-\5-\u021b\n-\3-\3-\3.\7.\u0220\n.\f.\16.\u0223\13"+
		".\3.\5.\u0226\n.\3.\3.\3.\3.\3.\5.\u022d\n.\3.\3.\3.\3.\3.\3.\5.\u0235"+
		"\n.\7.\u0237\n.\f.\16.\u023a\13.\3.\5.\u023d\n.\3.\3.\5.\u0241\n.\3/\6"+
		"/\u0244\n/\r/\16/\u0245\3\60\5\60\u0249\n\60\3\60\3\60\3\61\3\61\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u0256\n\62\f\62\16\62\u0259\13\62"+
		"\5\62\u025b\n\62\3\62\5\62\u025e\n\62\3\63\3\63\3\63\3\64\5\64\u0264\n"+
		"\64\3\64\3\64\3\64\3\64\3\64\5\64\u026b\n\64\5\64\u026d\n\64\3\64\5\64"+
		"\u0270\n\64\3\65\3\65\3\65\7\65\u0275\n\65\f\65\16\65\u0278\13\65\3\65"+
		"\5\65\u027b\n\65\3\66\3\66\3\67\3\67\5\67\u0281\n\67\6\67\u0283\n\67\r"+
		"\67\16\67\u0284\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3?\5?"+
		"\u0298\n?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?"+
		"\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u02c2"+
		"\n?\3@\3@\3A\3A\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3C\6C\u02d6\nC"+
		"\rC\16C\u02d7\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3"+
		"M\3M\3N\3N\3O\5O\u02f1\nO\3O\5O\u02f4\nO\3O\3O\3O\5O\u02f9\nO\3O\3O\3"+
		"P\7P\u02fe\nP\fP\16P\u0301\13P\3P\3P\3P\7P\u0306\nP\fP\16P\u0309\13P\3"+
		"Q\3Q\5Q\u030d\nQ\3Q\3Q\7Q\u0311\nQ\fQ\16Q\u0314\13Q\3Q\5Q\u0317\nQ\3R"+
		"\3R\3R\7R\u031c\nR\fR\16R\u031f\13R\3R\3R\5R\u0323\nR\3R\5R\u0326\nR\3"+
		"S\3S\3S\3T\5T\u032c\nT\3T\3T\3T\3T\3T\5T\u0333\nT\3T\5T\u0336\nT\3U\3"+
		"U\3U\3V\3V\3V\3V\7V\u033f\nV\fV\16V\u0342\13V\3W\3W\3W\3X\5X\u0348\nX"+
		"\3X\3X\3Y\3Y\5Y\u034e\nY\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u0359\nZ\3[\3["+
		"\3[\3[\3[\3\\\7\\\u0361\n\\\f\\\16\\\u0364\13\\\3\\\3\\\3\\\3\\\7\\\u036a"+
		"\n\\\f\\\16\\\u036d\13\\\7\\\u036f\n\\\f\\\16\\\u0372\13\\\3]\7]\u0375"+
		"\n]\f]\16]\u0378\13]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\5]\u0386\n]\3"+
		"]\7]\u0389\n]\f]\16]\u038c\13]\7]\u038e\n]\f]\16]\u0391\13]\3^\7^\u0394"+
		"\n^\f^\16^\u0397\13^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\5^\u03a5\n^\3"+
		"^\7^\u03a8\n^\f^\16^\u03ab\13^\7^\u03ad\n^\f^\16^\u03b0\13^\3_\7_\u03b3"+
		"\n_\f_\16_\u03b6\13_\3_\3_\3_\3_\7_\u03bc\n_\f_\16_\u03bf\13_\7_\u03c1"+
		"\n_\f_\16_\u03c4\13_\3_\2\3:`\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\2\34\3\2\20\21\3\2\22\23\3\2\24\26\3\2"+
		"\33\34\4\2HIWW\5\2GGJJXX\3\2RS\3\2ac\5\2\17\17\22\24\"#\4\2\37 $%\3\2"+
		"af\4\2&)LL\4\2\17\17\24\24\3\2*,\4\2--VV\4\2\7\7.\67\3\289\3\2\5\6\5\2"+
		"\5\6\30\31YZ\4\2\3\3\5\6\4\2\5\6\37 \3\2YZ\3\2\30\31\4\2\3\3\30\31\4\2"+
		"\3\3\b\b\7\2\3\3\5\6\b\b\30\31YZ\u040f\2\u00c5\3\2\2\2\4\u00c8\3\2\2\2"+
		"\6\u00d3\3\2\2\2\b\u00de\3\2\2\2\n\u00e6\3\2\2\2\f\u00e8\3\2\2\2\16\u00ed"+
		"\3\2\2\2\20\u00fa\3\2\2\2\22\u00fc\3\2\2\2\24\u0101\3\2\2\2\26\u0106\3"+
		"\2\2\2\30\u010b\3\2\2\2\32\u0110\3\2\2\2\34\u0115\3\2\2\2\36\u011b\3\2"+
		"\2\2 \u0121\3\2\2\2\"\u0126\3\2\2\2$\u012b\3\2\2\2&\u0136\3\2\2\2(\u0138"+
		"\3\2\2\2*\u0143\3\2\2\2,\u015b\3\2\2\2.\u015d\3\2\2\2\60\u0168\3\2\2\2"+
		"\62\u016a\3\2\2\2\64\u016c\3\2\2\2\66\u0173\3\2\2\28\u0175\3\2\2\2:\u017c"+
		"\3\2\2\2<\u01a3\3\2\2\2>\u01a5\3\2\2\2@\u01ad\3\2\2\2B\u01bb\3\2\2\2D"+
		"\u01cd\3\2\2\2F\u01d5\3\2\2\2H\u01d8\3\2\2\2J\u01e6\3\2\2\2L\u01e8\3\2"+
		"\2\2N\u01f7\3\2\2\2P\u01f9\3\2\2\2R\u0201\3\2\2\2T\u020b\3\2\2\2V\u020d"+
		"\3\2\2\2X\u0217\3\2\2\2Z\u0240\3\2\2\2\\\u0243\3\2\2\2^\u0248\3\2\2\2"+
		"`\u024c\3\2\2\2b\u025d\3\2\2\2d\u025f\3\2\2\2f\u0263\3\2\2\2h\u027a\3"+
		"\2\2\2j\u027c\3\2\2\2l\u0282\3\2\2\2n\u0286\3\2\2\2p\u0288\3\2\2\2r\u028a"+
		"\3\2\2\2t\u028c\3\2\2\2v\u028e\3\2\2\2x\u0290\3\2\2\2z\u0292\3\2\2\2|"+
		"\u02c1\3\2\2\2~\u02c3\3\2\2\2\u0080\u02c5\3\2\2\2\u0082\u02c7\3\2\2\2"+
		"\u0084\u02d5\3\2\2\2\u0086\u02d9\3\2\2\2\u0088\u02db\3\2\2\2\u008a\u02dd"+
		"\3\2\2\2\u008c\u02df\3\2\2\2\u008e\u02e1\3\2\2\2\u0090\u02e3\3\2\2\2\u0092"+
		"\u02e5\3\2\2\2\u0094\u02e7\3\2\2\2\u0096\u02e9\3\2\2\2\u0098\u02eb\3\2"+
		"\2\2\u009a\u02ed\3\2\2\2\u009c\u02f0\3\2\2\2\u009e\u02ff\3\2\2\2\u00a0"+
		"\u030a\3\2\2\2\u00a2\u0325\3\2\2\2\u00a4\u0327\3\2\2\2\u00a6\u032b\3\2"+
		"\2\2\u00a8\u0337\3\2\2\2\u00aa\u033a\3\2\2\2\u00ac\u0343\3\2\2\2\u00ae"+
		"\u0347\3\2\2\2\u00b0\u034b\3\2\2\2\u00b2\u0358\3\2\2\2\u00b4\u035a\3\2"+
		"\2\2\u00b6\u0362\3\2\2\2\u00b8\u0376\3\2\2\2\u00ba\u0395\3\2\2\2\u00bc"+
		"\u03b4\3\2\2\2\u00be\u00c4\5\u009cO\2\u00bf\u00c4\5H%\2\u00c0\u00c4\5"+
		"\4\3\2\u00c1\u00c4\5\6\4\2\u00c2\u00c4\5\u009aN\2\u00c3\u00be\3\2\2\2"+
		"\u00c3\u00bf\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2"+
		"\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\3\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7P\2\2\u00c9\u00ca\7Q\2\2\u00ca"+
		"\u00cb\5h\65\2\u00cb\u00cc\7\3\2\2\u00cc\5\3\2\2\2\u00cd\u00ce\7[\2\2"+
		"\u00ce\u00d4\5\b\5\2\u00cf\u00d0\7\\\2\2\u00d0\u00d4\5\b\5\2\u00d1\u00d4"+
		"\7]\2\2\u00d2\u00d4\7^\2\2\u00d3\u00cd\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\7\3\2\2\2\u00d5\u00df\5\n\6\2"+
		"\u00d6\u00d8\7\4\2\2\u00d7\u00d9\7\5\2\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9"+
		"\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\5\n\6\2\u00db\u00dd\7\6\2\2\u00dc"+
		"\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00d5\3\2"+
		"\2\2\u00de\u00d6\3\2\2\2\u00df\t\3\2\2\2\u00e0\u00e7\5\f\7\2\u00e1\u00e2"+
		"\5Z.\2\u00e2\u00e3\5D#\2\u00e3\u00e4\7\7\2\2\u00e4\u00e5\5\16\b\2\u00e5"+
		"\u00e7\3\2\2\2\u00e6\u00e0\3\2\2\2\u00e6\u00e1\3\2\2\2\u00e7\13\3\2\2"+
		"\2\u00e8\u00eb\5\16\b\2\u00e9\u00ea\7\b\2\2\u00ea\u00ec\5\f\7\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\r\3\2\2\2\u00ed\u00f1\5\20\t"+
		"\2\u00ee\u00ef\5~@\2\u00ef\u00f0\5\16\b\2\u00f0\u00f2\3\2\2\2\u00f1\u00ee"+
		"\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\17\3\2\2\2\u00f3\u00fb\5\22\n\2\u00f4"+
		"\u00f5\5\22\n\2\u00f5\u00f6\7\t\2\2\u00f6\u00f7\5\f\7\2\u00f7\u00f8\7"+
		"\n\2\2\u00f8\u00f9\5\20\t\2\u00f9\u00fb\3\2\2\2\u00fa\u00f3\3\2\2\2\u00fa"+
		"\u00f4\3\2\2\2\u00fb\21\3\2\2\2\u00fc\u00ff\5\24\13\2\u00fd\u00fe\7\13"+
		"\2\2\u00fe\u0100\5\22\n\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\23\3\2\2\2\u0101\u0104\5\26\f\2\u0102\u0103\7\f\2\2\u0103\u0105\5\24"+
		"\13\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\25\3\2\2\2\u0106\u0109"+
		"\5\30\r\2\u0107\u0108\7\r\2\2\u0108\u010a\5\26\f\2\u0109\u0107\3\2\2\2"+
		"\u0109\u010a\3\2\2\2\u010a\27\3\2\2\2\u010b\u010e\5\32\16\2\u010c\u010d"+
		"\7\16\2\2\u010d\u010f\5\30\r\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2"+
		"\u010f\31\3\2\2\2\u0110\u0113\5\34\17\2\u0111\u0112\7\17\2\2\u0112\u0114"+
		"\5\32\16\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\33\3\2\2\2\u0115"+
		"\u0119\5\36\20\2\u0116\u0117\5\u0080A\2\u0117\u0118\5\34\17\2\u0118\u011a"+
		"\3\2\2\2\u0119\u0116\3\2\2\2\u0119\u011a\3\2\2\2\u011a\35\3\2\2\2\u011b"+
		"\u011f\5 \21\2\u011c\u011d\5r:\2\u011d\u011e\5\36\20\2\u011e\u0120\3\2"+
		"\2\2\u011f\u011c\3\2\2\2\u011f\u0120\3\2\2\2\u0120\37\3\2\2\2\u0121\u0124"+
		"\5\"\22\2\u0122\u0123\t\2\2\2\u0123\u0125\5 \21\2\u0124\u0122\3\2\2\2"+
		"\u0124\u0125\3\2\2\2\u0125!\3\2\2\2\u0126\u0129\5$\23\2\u0127\u0128\t"+
		"\3\2\2\u0128\u012a\5\"\22\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"#\3\2\2\2\u012b\u012e\5&\24\2\u012c\u012d\t\4\2\2\u012d\u012f\5$\23\2"+
		"\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f%\3\2\2\2\u0130\u0131\7"+
		"\5\2\2\u0131\u0132\5(\25\2\u0132\u0133\7\6\2\2\u0133\u0134\5&\24\2\u0134"+
		"\u0137\3\2\2\2\u0135\u0137\5*\26\2\u0136\u0130\3\2\2\2\u0136\u0135\3\2"+
		"\2\2\u0137\'\3\2\2\2\u0138\u013c\5Z.\2\u0139\u013b\5x=\2\u013a\u0139\3"+
		"\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		")\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0144\5.\30\2\u0140\u0144\5\60\31"+
		"\2\u0141\u0144\5,\27\2\u0142\u0144\5:\36\2\u0143\u013f\3\2\2\2\u0143\u0140"+
		"\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0142\3\2\2\2\u0144+\3\2\2\2\u0145"+
		"\u0147\7\27\2\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3"+
		"\2\2\2\u0148\u0149\7V\2\2\u0149\u014a\5Z.\2\u014a\u014c\7\30\2\2\u014b"+
		"\u014d\5\20\t\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3"+
		"\2\2\2\u014e\u014f\7\31\2\2\u014f\u015c\3\2\2\2\u0150\u0152\7\27\2\2\u0151"+
		"\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\7V"+
		"\2\2\u0154\u0155\5Z.\2\u0155\u0157\7\5\2\2\u0156\u0158\5\f\7\2\u0157\u0156"+
		"\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\7\6\2\2\u015a"+
		"\u015c\3\2\2\2\u015b\u0146\3\2\2\2\u015b\u0151\3\2\2\2\u015c-\3\2\2\2"+
		"\u015d\u015e\5p9\2\u015e\u015f\5&\24\2\u015f/\3\2\2\2\u0160\u0161\5\62"+
		"\32\2\u0161\u0162\7\5\2\2\u0162\u0163\5\64\33\2\u0163\u0164\7\6\2\2\u0164"+
		"\u0169\3\2\2\2\u0165\u0166\5\62\32\2\u0166\u0167\5\66\34\2\u0167\u0169"+
		"\3\2\2\2\u0168\u0160\3\2\2\2\u0168\u0165\3\2\2\2\u0169\61\3\2\2\2\u016a"+
		"\u016b\7\32\2\2\u016b\63\3\2\2\2\u016c\u0170\5Z.\2\u016d\u016f\5x=\2\u016e"+
		"\u016d\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2"+
		"\2\2\u0171\65\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0174\5*\26\2\u0174\67"+
		"\3\2\2\2\u0175\u0176\t\5\2\2\u01769\3\2\2\2\u0177\u0178\b\36\1\2\u0178"+
		"\u017d\5@!\2\u0179\u017a\58\35\2\u017a\u017b\5@!\2\u017b\u017d\3\2\2\2"+
		"\u017c\u0177\3\2\2\2\u017c\u0179\3\2\2\2\u017d\u0198\3\2\2\2\u017e\u017f"+
		"\f\t\2\2\u017f\u0180\7\30\2\2\u0180\u0181\5\f\7\2\u0181\u0182\7\31\2\2"+
		"\u0182\u0197\3\2\2\2\u0183\u0184\f\b\2\2\u0184\u0185\7\5\2\2\u0185\u0186"+
		"\5<\37\2\u0186\u0187\7\6\2\2\u0187\u0197\3\2\2\2\u0188\u0189\f\7\2\2\u0189"+
		"\u018b\7\35\2\2\u018a\u018c\7U\2\2\u018b\u018a\3\2\2\2\u018b\u018c\3\2"+
		"\2\2\u018c\u018d\3\2\2\2\u018d\u0197\5h\65\2\u018e\u018f\f\6\2\2\u018f"+
		"\u0191\7\36\2\2\u0190\u0192\7U\2\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2"+
		"\2\2\u0192\u0193\3\2\2\2\u0193\u0197\5h\65\2\u0194\u0195\f\5\2\2\u0195"+
		"\u0197\58\35\2\u0196\u017e\3\2\2\2\u0196\u0183\3\2\2\2\u0196\u0188\3\2"+
		"\2\2\u0196\u018e\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u019a\3\2\2\2\u0198"+
		"\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199;\3\2\2\2\u019a\u0198\3\2\2\2"+
		"\u019b\u01a0\5> \2\u019c\u019d\7\b\2\2\u019d\u019f\5> \2\u019e\u019c\3"+
		"\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1"+
		"\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u019b\3\2\2\2\u01a3\u01a4\3\2"+
		"\2\2\u01a4=\3\2\2\2\u01a5\u01a6\5\16\b\2\u01a6?\3\2\2\2\u01a7\u01ae\5"+
		"h\65\2\u01a8\u01ae\5t;\2\u01a9\u01aa\7\5\2\2\u01aa\u01ab\5\f\7\2\u01ab"+
		"\u01ac\7\6\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01a7\3\2\2\2\u01ad\u01a8\3\2"+
		"\2\2\u01ad\u01a9\3\2\2\2\u01aeA\3\2\2\2\u01af\u01b0\5D#\2\u01b0\u01b2"+
		"\7\5\2\2\u01b1\u01b3\5\f\7\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b4\u01b5\7\6\2\2\u01b5\u01bc\3\2\2\2\u01b6\u01b7\5D"+
		"#\2\u01b7\u01b8\7\7\2\2\u01b8\u01b9\5N(\2\u01b9\u01bc\3\2\2\2\u01ba\u01bc"+
		"\5D#\2\u01bb\u01af\3\2\2\2\u01bb\u01b6\3\2\2\2\u01bb\u01ba\3\2\2\2\u01bc"+
		"C\3\2\2\2\u01bd\u01bf\5l\67\2\u01be\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2"+
		"\u01bf\u01c0\3\2\2\2\u01c0\u01c2\5h\65\2\u01c1\u01c3\5F$\2\u01c2\u01c1"+
		"\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01ce\3\2\2\2\u01c4\u01c6\5l\67\2\u01c5"+
		"\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\7\5"+
		"\2\2\u01c8\u01c9\5n8\2\u01c9\u01ca\5h\65\2\u01ca\u01cb\7\6\2\2\u01cb\u01cc"+
		"\5F$\2\u01cc\u01ce\3\2\2\2\u01cd\u01be\3\2\2\2\u01cd\u01c5\3\2\2\2\u01ce"+
		"E\3\2\2\2\u01cf\u01d1\7\30\2\2\u01d0\u01d2\5\20\t\2\u01d1\u01d0\3\2\2"+
		"\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d6\7\31\2\2\u01d4"+
		"\u01d6\5b\62\2\u01d5\u01cf\3\2\2\2\u01d5\u01d4\3\2\2\2\u01d6G\3\2\2\2"+
		"\u01d7\u01d9\7F\2\2\u01d8\u01d7\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01db"+
		"\3\2\2\2\u01da\u01dc\5\u0082B\2\u01db\u01da\3\2\2\2\u01db\u01dc\3\2\2"+
		"\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\5J&\2\u01deI\3\2\2\2\u01df\u01e1\5"+
		"R*\2\u01e0\u01e2\5L\'\2\u01e1\u01e0\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2"+
		"\u01e7\3\2\2\2\u01e3\u01e4\5Z.\2\u01e4\u01e5\5L\'\2\u01e5\u01e7\3\2\2"+
		"\2\u01e6\u01df\3\2\2\2\u01e6\u01e3\3\2\2\2\u01e7K\3\2\2\2\u01e8\u01ed"+
		"\5B\"\2\u01e9\u01ea\7\b\2\2\u01ea\u01ec\5B\"\2\u01eb\u01e9\3\2\2\2\u01ec"+
		"\u01ef\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f0\3\2"+
		"\2\2\u01ef\u01ed\3\2\2\2\u01f0\u01f1\7\3\2\2\u01f1M\3\2\2\2\u01f2\u01f8"+
		"\5\16\b\2\u01f3\u01f4\7Y\2\2\u01f4\u01f5\5P)\2\u01f5\u01f6\7Z\2\2\u01f6"+
		"\u01f8\3\2\2\2\u01f7\u01f2\3\2\2\2\u01f7\u01f3\3\2\2\2\u01f8O\3\2\2\2"+
		"\u01f9\u01fe\5N(\2\u01fa\u01fb\7\b\2\2\u01fb\u01fd\5N(\2\u01fc\u01fa\3"+
		"\2\2\2\u01fd\u0200\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff"+
		"Q\3\2\2\2\u0200\u01fe\3\2\2\2\u0201\u0203\7W\2\2\u0202\u0204\5T+\2\u0203"+
		"\u0202\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0206\3\2\2\2\u0205\u0207\5V"+
		",\2\u0206\u0205\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0208\3\2\2\2\u0208"+
		"\u0209\7Y\2\2\u0209\u020a\b*\1\2\u020aS\3\2\2\2\u020b\u020c\5h\65\2\u020c"+
		"U\3\2\2\2\u020d\u020e\7\n\2\2\u020e\u0213\5X-\2\u020f\u0210\7\b\2\2\u0210"+
		"\u0212\5X-\2\u0211\u020f\3\2\2\2\u0212\u0215\3\2\2\2\u0213\u0211\3\2\2"+
		"\2\u0213\u0214\3\2\2\2\u0214W\3\2\2\2\u0215\u0213\3\2\2\2\u0216\u0218"+
		"\7L\2\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u021a\3\2\2\2\u0219"+
		"\u021b\5z>\2\u021a\u0219\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c\3\2\2"+
		"\2\u021c\u021d\5h\65\2\u021dY\3\2\2\2\u021e\u0220\7K\2\2\u021f\u021e\3"+
		"\2\2\2\u0220\u0223\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222"+
		"\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0224\u0226\t\6\2\2\u0225\u0224\3\2"+
		"\2\2\u0225\u0226\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u022c\5\\/\2\u0228"+
		"\u0229\7\37\2\2\u0229\u022a\5\u0084C\2\u022a\u022b\7 \2\2\u022b\u022d"+
		"\3\2\2\2\u022c\u0228\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u0238\3\2\2\2\u022e"+
		"\u022f\7\27\2\2\u022f\u0234\5\\/\2\u0230\u0231\7\37\2\2\u0231\u0232\5"+
		"\u0084C\2\u0232\u0233\7 \2\2\u0233\u0235\3\2\2\2\u0234\u0230\3\2\2\2\u0234"+
		"\u0235\3\2\2\2\u0235\u0237\3\2\2\2\u0236\u022e\3\2\2\2\u0237\u023a\3\2"+
		"\2\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023c\3\2\2\2\u023a"+
		"\u0238\3\2\2\2\u023b\u023d\7K\2\2\u023c\u023b\3\2\2\2\u023c\u023d\3\2"+
		"\2\2\u023d\u0241\3\2\2\2\u023e\u0241\7H\2\2\u023f\u0241\7I\2\2\u0240\u0221"+
		"\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u023f\3\2\2\2\u0241[\3\2\2\2\u0242"+
		"\u0244\t\7\2\2\u0243\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0243\3\2"+
		"\2\2\u0245\u0246\3\2\2\2\u0246]\3\2\2\2\u0247\u0249\t\b\2\2\u0248\u0247"+
		"\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024b\5Z.\2\u024b"+
		"_\3\2\2\2\u024c\u024d\5h\65\2\u024da\3\2\2\2\u024e\u024f\7\5\2\2\u024f"+
		"\u0250\7G\2\2\u0250\u025e\7\6\2\2\u0251\u025a\7\5\2\2\u0252\u0257\5d\63"+
		"\2\u0253\u0254\7\b\2\2\u0254\u0256\5d\63\2\u0255\u0253\3\2\2\2\u0256\u0259"+
		"\3\2\2\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u025b\3\2\2\2\u0259"+
		"\u0257\3\2\2\2\u025a\u0252\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025c\3\2"+
		"\2\2\u025c\u025e\7\6\2\2\u025d\u024e\3\2\2\2\u025d\u0251\3\2\2\2\u025e"+
		"c\3\2\2\2\u025f\u0260\5^\60\2\u0260\u0261\5f\64\2\u0261e\3\2\2\2\u0262"+
		"\u0264\5l\67\2\u0263\u0262\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u026c\3\2"+
		"\2\2\u0265\u0266\7\5\2\2\u0266\u0267\5f\64\2\u0267\u0268\7\6\2\2\u0268"+
		"\u026d\3\2\2\2\u0269\u026b\5`\61\2\u026a\u0269\3\2\2\2\u026a\u026b\3\2"+
		"\2\2\u026b\u026d\3\2\2\2\u026c\u0265\3\2\2\2\u026c\u026a\3\2\2\2\u026d"+
		"\u026f\3\2\2\2\u026e\u0270\5F$\2\u026f\u026e\3\2\2\2\u026f\u0270\3\2\2"+
		"\2\u0270g\3\2\2\2\u0271\u0276\7X\2\2\u0272\u0273\7\27\2\2\u0273\u0275"+
		"\7X\2\2\u0274\u0272\3\2\2\2\u0275\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276"+
		"\u0277\3\2\2\2\u0277\u027b\3\2\2\2\u0278\u0276\3\2\2\2\u0279\u027b\5z"+
		">\2\u027a\u0271\3\2\2\2\u027a\u0279\3\2\2\2\u027bi\3\2\2\2\u027c\u027d"+
		"\t\t\2\2\u027dk\3\2\2\2\u027e\u0280\5x=\2\u027f\u0281\7!\2\2\u0280\u027f"+
		"\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0283\3\2\2\2\u0282\u027e\3\2\2\2\u0283"+
		"\u0284\3\2\2\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285m\3\2\2\2"+
		"\u0286\u0287\5l\67\2\u0287o\3\2\2\2\u0288\u0289\t\n\2\2\u0289q\3\2\2\2"+
		"\u028a\u028b\t\13\2\2\u028bs\3\2\2\2\u028c\u028d\t\f\2\2\u028du\3\2\2"+
		"\2\u028e\u028f\t\r\2\2\u028fw\3\2\2\2\u0290\u0291\t\16\2\2\u0291y\3\2"+
		"\2\2\u0292\u0293\t\17\2\2\u0293{\3\2\2\2\u0294\u0297\t\20\2\2\u0295\u0296"+
		"\7\30\2\2\u0296\u0298\7\31\2\2\u0297\u0295\3\2\2\2\u0297\u0298\3\2\2\2"+
		"\u0298\u02c2\3\2\2\2\u0299\u02c2\7\22\2\2\u029a\u02c2\7\23\2\2\u029b\u02c2"+
		"\7\24\2\2\u029c\u02c2\7\25\2\2\u029d\u02c2\7\26\2\2\u029e\u02c2\7\16\2"+
		"\2\u029f\u02c2\7\17\2\2\u02a0\u02c2\7\r\2\2\u02a1\u02c2\7\"\2\2\u02a2"+
		"\u02c2\7#\2\2\u02a3\u02c2\7\7\2\2\u02a4\u02c2\7\37\2\2\u02a5\u02c2\7 "+
		"\2\2\u02a6\u02c2\7.\2\2\u02a7\u02c2\7/\2\2\u02a8\u02c2\7\60\2\2\u02a9"+
		"\u02c2\7\61\2\2\u02aa\u02c2\7\62\2\2\u02ab\u02c2\7\63\2\2\u02ac\u02c2"+
		"\7\64\2\2\u02ad\u02c2\7\65\2\2\u02ae\u02c2\7\21\2\2\u02af\u02c2\7\20\2"+
		"\2\u02b0\u02c2\7\66\2\2\u02b1\u02c2\7\67\2\2\u02b2\u02c2\78\2\2\u02b3"+
		"\u02c2\79\2\2\u02b4\u02c2\7$\2\2\u02b5\u02c2\7%\2\2\u02b6\u02c2\7\f\2"+
		"\2\u02b7\u02c2\7\13\2\2\u02b8\u02c2\7\34\2\2\u02b9\u02c2\7\33\2\2\u02ba"+
		"\u02c2\7\b\2\2\u02bb\u02c2\7:\2\2\u02bc\u02c2\7\36\2\2\u02bd\u02be\7\5"+
		"\2\2\u02be\u02c2\7\6\2\2\u02bf\u02c0\7\30\2\2\u02c0\u02c2\7\31\2\2\u02c1"+
		"\u0294\3\2\2\2\u02c1\u0299\3\2\2\2\u02c1\u029a\3\2\2\2\u02c1\u029b\3\2"+
		"\2\2\u02c1\u029c\3\2\2\2\u02c1\u029d\3\2\2\2\u02c1\u029e\3\2\2\2\u02c1"+
		"\u029f\3\2\2\2\u02c1\u02a0\3\2\2\2\u02c1\u02a1\3\2\2\2\u02c1\u02a2\3\2"+
		"\2\2\u02c1\u02a3\3\2\2\2\u02c1\u02a4\3\2\2\2\u02c1\u02a5\3\2\2\2\u02c1"+
		"\u02a6\3\2\2\2\u02c1\u02a7\3\2\2\2\u02c1\u02a8\3\2\2\2\u02c1\u02a9\3\2"+
		"\2\2\u02c1\u02aa\3\2\2\2\u02c1\u02ab\3\2\2\2\u02c1\u02ac\3\2\2\2\u02c1"+
		"\u02ad\3\2\2\2\u02c1\u02ae\3\2\2\2\u02c1\u02af\3\2\2\2\u02c1\u02b0\3\2"+
		"\2\2\u02c1\u02b1\3\2\2\2\u02c1\u02b2\3\2\2\2\u02c1\u02b3\3\2\2\2\u02c1"+
		"\u02b4\3\2\2\2\u02c1\u02b5\3\2\2\2\u02c1\u02b6\3\2\2\2\u02c1\u02b7\3\2"+
		"\2\2\u02c1\u02b8\3\2\2\2\u02c1\u02b9\3\2\2\2\u02c1\u02ba\3\2\2\2\u02c1"+
		"\u02bb\3\2\2\2\u02c1\u02bc\3\2\2\2\u02c1\u02bd\3\2\2\2\u02c1\u02bf\3\2"+
		"\2\2\u02c2}\3\2\2\2\u02c3\u02c4\t\21\2\2\u02c4\177\3\2\2\2\u02c5\u02c6"+
		"\t\22\2\2\u02c6\u0081\3\2\2\2\u02c7\u02c8\7U\2\2\u02c8\u02c9\7\37\2\2"+
		"\u02c9\u02ca\5\u0084C\2\u02ca\u02cb\7 \2\2\u02cb\u0083\3\2\2\2\u02cc\u02cd"+
		"\7\37\2\2\u02cd\u02ce\5\u0084C\2\u02ce\u02cf\7 \2\2\u02cf\u02d6\3\2\2"+
		"\2\u02d0\u02d1\7\5\2\2\u02d1\u02d2\5\u0084C\2\u02d2\u02d3\7\6\2\2\u02d3"+
		"\u02d6\3\2\2\2\u02d4\u02d6\5\u008cG\2\u02d5\u02cc\3\2\2\2\u02d5\u02d0"+
		"\3\2\2\2\u02d5\u02d4\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d7"+
		"\u02d8\3\2\2\2\u02d8\u0085\3\2\2\2\u02d9\u02da\n\23\2\2\u02da\u0087\3"+
		"\2\2\2\u02db\u02dc\n\24\2\2\u02dc\u0089\3\2\2\2\u02dd\u02de\n\25\2\2\u02de"+
		"\u008b\3\2\2\2\u02df\u02e0\n\26\2\2\u02e0\u008d\3\2\2\2\u02e1\u02e2\n"+
		"\27\2\2\u02e2\u008f\3\2\2\2\u02e3\u02e4\n\30\2\2\u02e4\u0091\3\2\2\2\u02e5"+
		"\u02e6\n\31\2\2\u02e6\u0093\3\2\2\2\u02e7\u02e8\n\32\2\2\u02e8\u0095\3"+
		"\2\2\2\u02e9\u02ea\n\33\2\2\u02ea\u0097\3\2\2\2\u02eb\u02ec\n\24\2\2\u02ec"+
		"\u0099\3\2\2\2\u02ed\u02ee\13\2\2\2\u02ee\u009b\3\2\2\2\u02ef\u02f1\5"+
		"\u0082B\2\u02f0\u02ef\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f3\3\2\2\2"+
		"\u02f2\u02f4\5\u009eP\2\u02f3\u02f2\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4"+
		"\u02f5\3\2\2\2\u02f5\u02f6\5\u00b2Z\2\u02f6\u02f8\5\u00a0Q\2\u02f7\u02f9"+
		"\5\u00aaV\2\u02f8\u02f7\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa\3\2\2"+
		"\2\u02fa\u02fb\5\u00a8U\2\u02fb\u009d\3\2\2\2\u02fc\u02fe\5v<\2\u02fd"+
		"\u02fc\3\2\2\2\u02fe\u0301\3\2\2\2\u02ff\u02fd\3\2\2\2\u02ff\u0300\3\2"+
		"\2\2\u0300\u0302\3\2\2\2\u0301\u02ff\3\2\2\2\u0302\u0303\5Z.\2\u0303\u0307"+
		"\3\2\2\2\u0304\u0306\5x=\2\u0305\u0304\3\2\2\2\u0306\u0309\3\2\2\2\u0307"+
		"\u0305\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u009f\3\2\2\2\u0309\u0307\3\2"+
		"\2\2\u030a\u030c\7\5\2\2\u030b\u030d\5\u00a2R\2\u030c\u030b\3\2\2\2\u030c"+
		"\u030d\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u0312\7\6\2\2\u030f\u0311\7K"+
		"\2\2\u0310\u030f\3\2\2\2\u0311\u0314\3\2\2\2\u0312\u0310\3\2\2\2\u0312"+
		"\u0313\3\2\2\2\u0313\u0316\3\2\2\2\u0314\u0312\3\2\2\2\u0315\u0317\5\u00b4"+
		"[\2\u0316\u0315\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u00a1\3\2\2\2\u0318"+
		"\u031d\5\u00a4S\2\u0319\u031a\7\b\2\2\u031a\u031c\5\u00a4S\2\u031b\u0319"+
		"\3\2\2\2\u031c\u031f\3\2\2\2\u031d\u031b\3\2\2\2\u031d\u031e\3\2\2\2\u031e"+
		"\u0322\3\2\2\2\u031f\u031d\3\2\2\2\u0320\u0321\7\b\2\2\u0321\u0323\7j"+
		"\2\2\u0322\u0320\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0326\3\2\2\2\u0324"+
		"\u0326\7G\2\2\u0325\u0318\3\2\2\2\u0325\u0324\3\2\2\2\u0326\u00a3\3\2"+
		"\2\2\u0327\u0328\5^\60\2\u0328\u0329\5\u00a6T\2\u0329\u00a5\3\2\2\2\u032a"+
		"\u032c\5l\67\2\u032b\u032a\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u0332\3\2"+
		"\2\2\u032d\u032e\7\5\2\2\u032e\u032f\5\u00a6T\2\u032f\u0330\7\6\2\2\u0330"+
		"\u0333\3\2\2\2\u0331\u0333\5`\61\2\u0332\u032d\3\2\2\2\u0332\u0331\3\2"+
		"\2\2\u0333\u0335\3\2\2\2\u0334\u0336\5F$\2\u0335\u0334\3\2\2\2\u0335\u0336"+
		"\3\2\2\2\u0336\u00a7\3\2\2\2\u0337\u0338\7Y\2\2\u0338\u0339\bU\1\2\u0339"+
		"\u00a9\3\2\2\2\u033a\u033b\7\n\2\2\u033b\u0340\5\u00acW\2\u033c\u033d"+
		"\7\b\2\2\u033d\u033f\5\u00acW\2\u033e\u033c\3\2\2\2\u033f\u0342\3\2\2"+
		"\2\u0340\u033e\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u00ab\3\2\2\2\u0342\u0340"+
		"\3\2\2\2\u0343\u0344\5\u00aeX\2\u0344\u0345\5\u00b0Y\2\u0345\u00ad\3\2"+
		"\2\2\u0346\u0348\7\27\2\2\u0347\u0346\3\2\2\2\u0347\u0348\3\2\2\2\u0348"+
		"\u0349\3\2\2\2\u0349\u034a\5h\65\2\u034a\u00af\3\2\2\2\u034b\u034d\7\5"+
		"\2\2\u034c\u034e\5\f\7\2\u034d\u034c\3\2\2\2\u034d\u034e\3\2\2\2\u034e"+
		"\u034f\3\2\2\2\u034f\u0350\7\6\2\2\u0350\u00b1\3\2\2\2\u0351\u0352\7\5"+
		"\2\2\u0352\u0353\5\u00b2Z\2\u0353\u0354\7\6\2\2\u0354\u0359\3\2\2\2\u0355"+
		"\u0359\5h\65\2\u0356\u0357\7T\2\2\u0357\u0359\5|?\2\u0358\u0351\3\2\2"+
		"\2\u0358\u0355\3\2\2\2\u0358\u0356\3\2\2\2\u0359\u00b3\3\2\2\2\u035a\u035b"+
		"\7O\2\2\u035b\u035c\7\5\2\2\u035c\u035d\5\u00b6\\\2\u035d\u035e\7\6\2"+
		"\2\u035e\u00b5\3\2\2\2\u035f\u0361\5\u0086D\2\u0360\u035f\3\2\2\2\u0361"+
		"\u0364\3\2\2\2\u0362\u0360\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0370\3\2"+
		"\2\2\u0364\u0362\3\2\2\2\u0365\u0366\7\5\2\2\u0366\u0367\5\u00b6\\\2\u0367"+
		"\u036b\7\6\2\2\u0368\u036a\5\u0086D\2\u0369\u0368\3\2\2\2\u036a\u036d"+
		"\3\2\2\2\u036b\u0369\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036f\3\2\2\2\u036d"+
		"\u036b\3\2\2\2\u036e\u0365\3\2\2\2\u036f\u0372\3\2\2\2\u0370\u036e\3\2"+
		"\2\2\u0370\u0371\3\2\2\2\u0371\u00b7\3\2\2\2\u0372\u0370\3\2\2\2\u0373"+
		"\u0375\5\u0096L\2\u0374\u0373\3\2\2\2\u0375\u0378\3\2\2\2\u0376\u0374"+
		"\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u038f\3\2\2\2\u0378\u0376\3\2\2\2\u0379"+
		"\u037a\7Y\2\2\u037a\u037b\5\u00ba^\2\u037b\u037c\7Z\2\2\u037c\u0386\3"+
		"\2\2\2\u037d\u037e\7\5\2\2\u037e\u037f\5\u00ba^\2\u037f\u0380\7\6\2\2"+
		"\u0380\u0386\3\2\2\2\u0381\u0382\7\30\2\2\u0382\u0383\5\u00ba^\2\u0383"+
		"\u0384\7\31\2\2\u0384\u0386\3\2\2\2\u0385\u0379\3\2\2\2\u0385\u037d\3"+
		"\2\2\2\u0385\u0381\3\2\2\2\u0386\u038a\3\2\2\2\u0387\u0389\5\u0096L\2"+
		"\u0388\u0387\3\2\2\2\u0389\u038c\3\2\2\2\u038a\u0388\3\2\2\2\u038a\u038b"+
		"\3\2\2\2\u038b\u038e\3\2\2\2\u038c\u038a\3\2\2\2\u038d\u0385\3\2\2\2\u038e"+
		"\u0391\3\2\2\2\u038f\u038d\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u00b9\3\2"+
		"\2\2\u0391\u038f\3\2\2\2\u0392\u0394\5\u0098M\2\u0393\u0392\3\2\2\2\u0394"+
		"\u0397\3\2\2\2\u0395\u0393\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u03ae\3\2"+
		"\2\2\u0397\u0395\3\2\2\2\u0398\u0399\7Y\2\2\u0399\u039a\5\u00ba^\2\u039a"+
		"\u039b\7Z\2\2\u039b\u03a5\3\2\2\2\u039c\u039d\7\5\2\2\u039d\u039e\5\u00ba"+
		"^\2\u039e\u039f\7\6\2\2\u039f\u03a5\3\2\2\2\u03a0\u03a1\7\30\2\2\u03a1"+
		"\u03a2\5\u00ba^\2\u03a2\u03a3\7\31\2\2\u03a3\u03a5\3\2\2\2\u03a4\u0398"+
		"\3\2\2\2\u03a4\u039c\3\2\2\2\u03a4\u03a0\3\2\2\2\u03a5\u03a9\3\2\2\2\u03a6"+
		"\u03a8\5\u0098M\2\u03a7\u03a6\3\2\2\2\u03a8\u03ab\3\2\2\2\u03a9\u03a7"+
		"\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ad\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ac"+
		"\u03a4\3\2\2\2\u03ad\u03b0\3\2\2\2\u03ae\u03ac\3\2\2\2\u03ae\u03af\3\2"+
		"\2\2\u03af\u00bb\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b1\u03b3\5\u0090I\2\u03b2"+
		"\u03b1\3\2\2\2\u03b3\u03b6\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b4\u03b5\3\2"+
		"\2\2\u03b5\u03c2\3\2\2\2\u03b6\u03b4\3\2\2\2\u03b7\u03b8\7\30\2\2\u03b8"+
		"\u03b9\5\u00bc_\2\u03b9\u03bd\7\31\2\2\u03ba\u03bc\5\u0090I\2\u03bb\u03ba"+
		"\3\2\2\2\u03bc\u03bf\3\2\2\2\u03bd\u03bb\3\2\2\2\u03bd\u03be\3\2\2\2\u03be"+
		"\u03c1\3\2\2\2\u03bf\u03bd\3\2\2\2\u03c0\u03b7\3\2\2\2\u03c1\u03c4\3\2"+
		"\2\2\u03c2\u03c0\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u00bd\3\2\2\2\u03c4"+
		"\u03c2\3\2\2\2t\u00c3\u00c5\u00d3\u00d8\u00dc\u00de\u00e6\u00eb\u00f1"+
		"\u00fa\u00ff\u0104\u0109\u010e\u0113\u0119\u011f\u0124\u0129\u012e\u0136"+
		"\u013c\u0143\u0146\u014c\u0151\u0157\u015b\u0168\u0170\u017c\u018b\u0191"+
		"\u0196\u0198\u01a0\u01a3\u01ad\u01b2\u01bb\u01be\u01c2\u01c5\u01cd\u01d1"+
		"\u01d5\u01d8\u01db\u01e1\u01e6\u01ed\u01f7\u01fe\u0203\u0206\u0213\u0217"+
		"\u021a\u0221\u0225\u022c\u0234\u0238\u023c\u0240\u0245\u0248\u0257\u025a"+
		"\u025d\u0263\u026a\u026c\u026f\u0276\u027a\u0280\u0284\u0297\u02c1\u02d5"+
		"\u02d7\u02f0\u02f3\u02f8\u02ff\u0307\u030c\u0312\u0316\u031d\u0322\u0325"+
		"\u032b\u0332\u0335\u0340\u0347\u034d\u0358\u0362\u036b\u0370\u0376\u0385"+
		"\u038a\u038f\u0395\u03a4\u03a9\u03ae\u03b4\u03bd\u03c2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}