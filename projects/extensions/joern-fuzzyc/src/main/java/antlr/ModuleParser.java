// Generated from ..\java\antlr\Module.g4 by ANTLR 4.5.3

	package antlr;


  import java.util.Stack;

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
		T__52=53, T__53=54, T__54=55, IF=56, ELSE=57, FOR=58, WHILE=59, BREAK=60, 
		CASE=61, CONTINUE=62, SWITCH=63, DO=64, GOTO=65, RETURN=66, TYPEDEF=67, 
		VOID=68, UNSIGNED=69, SIGNED=70, LONG=71, CV_QUALIFIER=72, VIRTUAL=73, 
		TRY=74, CATCH=75, THROW=76, USING=77, NAMESPACE=78, AUTO=79, REGISTER=80, 
		OPERATOR=81, TEMPLATE=82, NEW=83, CLASS_KEY=84, ALPHA_NUMERIC=85, OPENING_CURLY=86, 
		CLOSING_CURLY=87, PRE_IF=88, PRE_ELSE=89, PRE_ENDIF=90, HEX_LITERAL=91, 
		DECIMAL_LITERAL=92, OCTAL_LITERAL=93, FLOATING_POINT_LITERAL=94, CHAR=95, 
		STRING=96, COMMENT=97, WHITESPACE=98, CPPCOMMENT=99, ELLIPSIS=100, OTHER=101;
	public static final int
		RULE_code = 0, RULE_using_directive = 1, RULE_expr = 2, RULE_assign_expr = 3, 
		RULE_conditional_expression = 4, RULE_or_expression = 5, RULE_and_expression = 6, 
		RULE_inclusive_or_expression = 7, RULE_exclusive_or_expression = 8, RULE_bit_and_expression = 9, 
		RULE_equality_expression = 10, RULE_relational_expression = 11, RULE_shift_expression = 12, 
		RULE_additive_expression = 13, RULE_multiplicative_expression = 14, RULE_cast_expression = 15, 
		RULE_cast_target = 16, RULE_unary_expression = 17, RULE_new_expression = 18, 
		RULE_unary_op_and_cast_expr = 19, RULE_sizeof_expression = 20, RULE_sizeof = 21, 
		RULE_sizeof_operand = 22, RULE_sizeof_operand2 = 23, RULE_inc_dec = 24, 
		RULE_postfix_expression = 25, RULE_function_argument_list = 26, RULE_function_argument = 27, 
		RULE_primary_expression = 28, RULE_unary_operator = 29, RULE_relational_operator = 30, 
		RULE_constant = 31, RULE_function_decl_specifiers = 32, RULE_ptr_operator = 33, 
		RULE_access_specifier = 34, RULE_operator = 35, RULE_assignment_operator = 36, 
		RULE_equality_operator = 37, RULE_template_decl_start = 38, RULE_template_param_list = 39, 
		RULE_no_brackets = 40, RULE_no_brackets_curlies_or_squares = 41, RULE_no_brackets_or_semicolon = 42, 
		RULE_no_angle_brackets_or_brackets = 43, RULE_no_curlies = 44, RULE_no_squares = 45, 
		RULE_no_squares_or_semicolon = 46, RULE_no_comma_or_semicolon = 47, RULE_assign_water = 48, 
		RULE_assign_water_l2 = 49, RULE_water = 50, RULE_function_def = 51, RULE_return_type = 52, 
		RULE_function_param_list = 53, RULE_parameter_decl_clause = 54, RULE_parameter_decl = 55, 
		RULE_parameter_id = 56, RULE_compound_statement = 57, RULE_ctor_list = 58, 
		RULE_ctor_initializer = 59, RULE_initializer_id = 60, RULE_ctor_expr = 61, 
		RULE_function_name = 62, RULE_exception_specification = 63, RULE_type_id_list = 64, 
		RULE_init_declarator = 65, RULE_declarator = 66, RULE_type_suffix = 67, 
		RULE_assign_expr_w_ = 68, RULE_assign_expr_w__l2 = 69, RULE_constant_expr_w_ = 70, 
		RULE_simple_decl = 71, RULE_var_decl = 72, RULE_init_declarator_list = 73, 
		RULE_initializer = 74, RULE_initializer_list = 75, RULE_class_def = 76, 
		RULE_class_name = 77, RULE_base_classes = 78, RULE_base_class = 79, RULE_type_name = 80, 
		RULE_base_type = 81, RULE_param_decl_specifiers = 82, RULE_parameter_name = 83, 
		RULE_param_type_list = 84, RULE_param_type = 85, RULE_param_type_id = 86, 
		RULE_identifier = 87, RULE_number = 88, RULE_ptrs = 89, RULE_func_ptrs = 90;
	public static final String[] ruleNames = {
		"code", "using_directive", "expr", "assign_expr", "conditional_expression", 
		"or_expression", "and_expression", "inclusive_or_expression", "exclusive_or_expression", 
		"bit_and_expression", "equality_expression", "relational_expression", 
		"shift_expression", "additive_expression", "multiplicative_expression", 
		"cast_expression", "cast_target", "unary_expression", "new_expression", 
		"unary_op_and_cast_expr", "sizeof_expression", "sizeof", "sizeof_operand", 
		"sizeof_operand2", "inc_dec", "postfix_expression", "function_argument_list", 
		"function_argument", "primary_expression", "unary_operator", "relational_operator", 
		"constant", "function_decl_specifiers", "ptr_operator", "access_specifier", 
		"operator", "assignment_operator", "equality_operator", "template_decl_start", 
		"template_param_list", "no_brackets", "no_brackets_curlies_or_squares", 
		"no_brackets_or_semicolon", "no_angle_brackets_or_brackets", "no_curlies", 
		"no_squares", "no_squares_or_semicolon", "no_comma_or_semicolon", "assign_water", 
		"assign_water_l2", "water", "function_def", "return_type", "function_param_list", 
		"parameter_decl_clause", "parameter_decl", "parameter_id", "compound_statement", 
		"ctor_list", "ctor_initializer", "initializer_id", "ctor_expr", "function_name", 
		"exception_specification", "type_id_list", "init_declarator", "declarator", 
		"type_suffix", "assign_expr_w_", "assign_expr_w__l2", "constant_expr_w_", 
		"simple_decl", "var_decl", "init_declarator_list", "initializer", "initializer_list", 
		"class_def", "class_name", "base_classes", "base_class", "type_name", 
		"base_type", "param_decl_specifiers", "parameter_name", "param_type_list", 
		"param_type", "param_type_id", "identifier", "number", "ptrs", "func_ptrs"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "','", "'?'", "':'", "'||'", "'&&'", "'|'", "'^'", "'&'", 
		"'<<'", "'>>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'::'", 
		"'['", "']'", "'sizeof'", "'--'", "'++'", "'.'", "'->'", "'~'", "'!'", 
		"'<'", "'>'", "'<='", "'>='", "'inline'", "'explicit'", "'friend'", "'static'", 
		"'public'", "'private'", "'protected'", "'delete'", "'='", "'+='", "'-='", 
		"'*='", "'/='", "'%='", "'^='", "'&='", "'|='", "'>>='", "'<<='", "'=='", 
		"'!='", "'->*'", "'restrict'", "'if'", "'else'", "'for'", "'while'", "'break'", 
		"'case'", "'continue'", "'switch'", "'do'", "'goto'", "'return'", "'typedef'", 
		"'void'", "'unsigned'", "'signed'", "'long'", null, "'virtual'", "'try'", 
		"'catch'", "'throw'", "'using'", "'namespace'", "'auto'", "'register'", 
		"'operator'", "'template'", "'new'", null, null, "'{'", "'}'", null, null, 
		null, null, null, null, null, null, null, null, null, null, "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "IF", "ELSE", "FOR", "WHILE", 
		"BREAK", "CASE", "CONTINUE", "SWITCH", "DO", "GOTO", "RETURN", "TYPEDEF", 
		"VOID", "UNSIGNED", "SIGNED", "LONG", "CV_QUALIFIER", "VIRTUAL", "TRY", 
		"CATCH", "THROW", "USING", "NAMESPACE", "AUTO", "REGISTER", "OPERATOR", 
		"TEMPLATE", "NEW", "CLASS_KEY", "ALPHA_NUMERIC", "OPENING_CURLY", "CLOSING_CURLY", 
		"PRE_IF", "PRE_ELSE", "PRE_ENDIF", "HEX_LITERAL", "DECIMAL_LITERAL", "OCTAL_LITERAL", 
		"FLOATING_POINT_LITERAL", "CHAR", "STRING", "COMMENT", "WHITESPACE", "CPPCOMMENT", 
		"ELLIPSIS", "OTHER"
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


	            public boolean skipToEndOfObject()
	            {
	                Stack<Object> CurlyStack = new Stack<Object>();
	                Object o = new Object();
	                int t = _input.LA(1);

	                while(t != EOF && !(CurlyStack.empty() && t == CLOSING_CURLY)){
	                    
	                    if(t == PRE_ELSE){
	                        Stack<Object> ifdefStack = new Stack<Object>();
	                        consume();
	                        t = _input.LA(1);
	                        
	                        while(t != EOF && !(ifdefStack.empty() && (t == PRE_ENDIF))){
	                            if(t == PRE_IF)
	                                ifdefStack.push(o);
	                            else if(t == PRE_ENDIF)
	                                ifdefStack.pop();
	                            consume();
	                            t = _input.LA(1);
	                        }
	                    }
	                    
	                    if(t == OPENING_CURLY)
	                        CurlyStack.push(o);
	                    else if(t == CLOSING_CURLY)
	                        CurlyStack.pop();
	                    
	                    consume();
	                    t = _input.LA(1);
	                }
	                if(t != EOF)
	                    consume();
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
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE) | (1L << SWITCH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (CPPCOMMENT - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				setState(186);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(182);
					function_def();
					}
					break;
				case 2:
					{
					setState(183);
					simple_decl();
					}
					break;
				case 3:
					{
					setState(184);
					using_directive();
					}
					break;
				case 4:
					{
					setState(185);
					water();
					}
					break;
				}
				}
				setState(190);
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
			setState(191);
			match(USING);
			setState(192);
			match(NAMESPACE);
			setState(193);
			identifier();
			setState(194);
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
		enterRule(_localctx, 4, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			assign_expr();
			setState(199);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(197);
				match(T__1);
				setState(198);
				expr();
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
		enterRule(_localctx, 6, RULE_assign_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			conditional_expression();
			setState(205);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50))) != 0)) {
				{
				setState(202);
				assignment_operator();
				setState(203);
				assign_expr();
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
		enterRule(_localctx, 8, RULE_conditional_expression);
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new NormOrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				or_expression();
				}
				break;
			case 2:
				_localctx = new CndExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				or_expression();
				{
				setState(209);
				match(T__2);
				setState(210);
				expr();
				setState(211);
				match(T__3);
				setState(212);
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
		enterRule(_localctx, 10, RULE_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			and_expression();
			setState(219);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(217);
				match(T__4);
				setState(218);
				or_expression();
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
		enterRule(_localctx, 12, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			inclusive_or_expression();
			setState(224);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(222);
				match(T__5);
				setState(223);
				and_expression();
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
		enterRule(_localctx, 14, RULE_inclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			exclusive_or_expression();
			setState(229);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(227);
				match(T__6);
				setState(228);
				inclusive_or_expression();
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
		enterRule(_localctx, 16, RULE_exclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			bit_and_expression();
			setState(234);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(232);
				match(T__7);
				setState(233);
				exclusive_or_expression();
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
		enterRule(_localctx, 18, RULE_bit_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			equality_expression();
			setState(239);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(237);
				match(T__8);
				setState(238);
				bit_and_expression();
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
		enterRule(_localctx, 20, RULE_equality_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			relational_expression();
			setState(245);
			_la = _input.LA(1);
			if (_la==T__51 || _la==T__52) {
				{
				setState(242);
				equality_operator();
				setState(243);
				equality_expression();
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
		enterRule(_localctx, 22, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			shift_expression();
			setState(251);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) {
				{
				setState(248);
				relational_operator();
				setState(249);
				relational_expression();
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
		enterRule(_localctx, 24, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			additive_expression();
			setState(256);
			_la = _input.LA(1);
			if (_la==T__9 || _la==T__10) {
				{
				setState(254);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__10) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(255);
				shift_expression();
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
		enterRule(_localctx, 26, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			multiplicative_expression();
			setState(261);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__12) {
				{
				setState(259);
				_la = _input.LA(1);
				if ( !(_la==T__11 || _la==T__12) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(260);
				additive_expression();
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
		enterRule(_localctx, 28, RULE_multiplicative_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			cast_expression();
			setState(266);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) {
				{
				setState(264);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(265);
				multiplicative_expression();
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

	public static class Cast_expressionContext extends ParserRuleContext {
		public Cast_targetContext cast_target() {
			return getRuleContext(Cast_targetContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
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
		enterRule(_localctx, 30, RULE_cast_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(268);
			match(T__16);
			setState(269);
			cast_target();
			setState(270);
			match(T__17);
			setState(271);
			cast_expression();
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 32, RULE_cast_target);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			type_name();
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__13) {
				{
				{
				setState(274);
				ptr_operator();
				}
				}
				setState(279);
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
		public Inc_decContext inc_dec() {
			return getRuleContext(Inc_decContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
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
		enterRule(_localctx, 34, RULE_unary_expression);
		try {
			setState(287);
			switch (_input.LA(1)) {
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				inc_dec();
				setState(281);
				cast_expression();
				}
				break;
			case T__8:
			case T__11:
			case T__12:
			case T__13:
			case T__26:
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				unary_op_and_cast_expr();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				sizeof_expression();
				}
				break;
			case T__18:
			case NEW:
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				new_expression();
				}
				break;
			case T__16:
			case T__36:
			case T__37:
			case T__38:
			case ALPHA_NUMERIC:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(286);
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
		enterRule(_localctx, 36, RULE_new_expression);
		int _la;
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(289);
					match(T__18);
					}
				}

				setState(292);
				match(NEW);
				setState(293);
				type_name();
				setState(294);
				match(T__19);
				setState(296);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(295);
					conditional_expression();
					}
				}

				setState(298);
				match(T__20);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(300);
					match(T__18);
					}
				}

				setState(303);
				match(NEW);
				setState(304);
				type_name();
				setState(305);
				match(T__16);
				setState(307);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(306);
					expr();
					}
				}

				setState(309);
				match(T__17);
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 38, RULE_unary_op_and_cast_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			unary_operator();
			setState(314);
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
		enterRule(_localctx, 40, RULE_sizeof_expression);
		try {
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				sizeof();
				setState(317);
				match(T__16);
				setState(318);
				sizeof_operand();
				setState(319);
				match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				sizeof();
				setState(322);
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
		enterRule(_localctx, 42, RULE_sizeof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 44, RULE_sizeof_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			type_name();
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__13) {
				{
				{
				setState(329);
				ptr_operator();
				}
				}
				setState(334);
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
		enterRule(_localctx, 46, RULE_sizeof_operand2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
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
		enterRule(_localctx, 48, RULE_inc_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_la = _input.LA(1);
			if ( !(_la==T__22 || _la==T__23) ) {
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
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Inc_decContext inc_dec() {
			return getRuleContext(Inc_decContext.class,0);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_postfix_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimaryOnlyContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(340);
			primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(368);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(366);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayIndexingContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(342);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(343);
						match(T__19);
						setState(344);
						expr();
						setState(345);
						match(T__20);
						}
						break;
					case 2:
						{
						_localctx = new FuncCallContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(347);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(348);
						match(T__16);
						setState(349);
						function_argument_list();
						setState(350);
						match(T__17);
						}
						break;
					case 3:
						{
						_localctx = new MemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(352);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(353);
						match(T__24);
						setState(355);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(354);
							match(TEMPLATE);
							}
						}

						{
						setState(357);
						identifier();
						}
						}
						break;
					case 4:
						{
						_localctx = new PtrMemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(358);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(359);
						match(T__25);
						setState(361);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(360);
							match(TEMPLATE);
							}
						}

						{
						setState(363);
						identifier();
						}
						}
						break;
					case 5:
						{
						_localctx = new IncDecOpContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(364);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(365);
						inc_dec();
						}
						break;
					}
					} 
				}
				setState(370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		enterRule(_localctx, 52, RULE_function_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(371);
				function_argument();
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(372);
					match(T__1);
					setState(373);
					function_argument();
					}
					}
					setState(378);
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
		enterRule(_localctx, 54, RULE_function_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
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
		enterRule(_localctx, 56, RULE_primary_expression);
		try {
			setState(389);
			switch (_input.LA(1)) {
			case T__36:
			case T__37:
			case T__38:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
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
				setState(384);
				constant();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(385);
				match(T__16);
				setState(386);
				expr();
				setState(387);
				match(T__17);
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
		enterRule(_localctx, 58, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__26) | (1L << T__27))) != 0)) ) {
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
		enterRule(_localctx, 60, RULE_relational_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
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
		enterRule(_localctx, 62, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			_la = _input.LA(1);
			if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)) | (1L << (FLOATING_POINT_LITERAL - 91)) | (1L << (CHAR - 91)) | (1L << (STRING - 91)))) != 0)) ) {
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
		enterRule(_localctx, 64, RULE_function_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			_la = _input.LA(1);
			if ( !(((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & ((1L << (T__32 - 33)) | (1L << (T__33 - 33)) | (1L << (T__34 - 33)) | (1L << (T__35 - 33)) | (1L << (VIRTUAL - 33)))) != 0)) ) {
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
		enterRule(_localctx, 66, RULE_ptr_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__13) ) {
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
		enterRule(_localctx, 68, RULE_access_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) ) {
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
		enterRule(_localctx, 70, RULE_operator);
		int _la;
		try {
			setState(448);
			switch (_input.LA(1)) {
			case T__39:
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(403);
				_la = _input.LA(1);
				if ( !(_la==T__39 || _la==NEW) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(406);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(404);
					match(T__19);
					setState(405);
					match(T__20);
					}
				}

				}
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(409);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(410);
				match(T__13);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 5);
				{
				setState(411);
				match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 6);
				{
				setState(412);
				match(T__15);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 7);
				{
				setState(413);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 8);
				{
				setState(414);
				match(T__8);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 9);
				{
				setState(415);
				match(T__6);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 10);
				{
				setState(416);
				match(T__26);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 11);
				{
				setState(417);
				match(T__27);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 12);
				{
				setState(418);
				match(T__40);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 13);
				{
				setState(419);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 14);
				{
				setState(420);
				match(T__29);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 15);
				{
				setState(421);
				match(T__41);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 16);
				{
				setState(422);
				match(T__42);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 17);
				{
				setState(423);
				match(T__43);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 18);
				{
				setState(424);
				match(T__44);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 19);
				{
				setState(425);
				match(T__45);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 20);
				{
				setState(426);
				match(T__46);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 21);
				{
				setState(427);
				match(T__47);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 22);
				{
				setState(428);
				match(T__48);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 23);
				{
				setState(429);
				match(T__10);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 24);
				{
				setState(430);
				match(T__9);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 25);
				{
				setState(431);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 26);
				{
				setState(432);
				match(T__50);
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 27);
				{
				setState(433);
				match(T__51);
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 28);
				{
				setState(434);
				match(T__52);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 29);
				{
				setState(435);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 30);
				{
				setState(436);
				match(T__31);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 31);
				{
				setState(437);
				match(T__5);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 32);
				{
				setState(438);
				match(T__4);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 33);
				{
				setState(439);
				match(T__23);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 34);
				{
				setState(440);
				match(T__22);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 35);
				{
				setState(441);
				match(T__1);
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 36);
				{
				setState(442);
				match(T__53);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 37);
				{
				setState(443);
				match(T__25);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 38);
				{
				setState(444);
				match(T__16);
				setState(445);
				match(T__17);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 39);
				{
				setState(446);
				match(T__19);
				setState(447);
				match(T__20);
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
		enterRule(_localctx, 72, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50))) != 0)) ) {
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
		enterRule(_localctx, 74, RULE_equality_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			_la = _input.LA(1);
			if ( !(_la==T__51 || _la==T__52) ) {
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
		enterRule(_localctx, 76, RULE_template_decl_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(TEMPLATE);
			setState(455);
			match(T__28);
			setState(456);
			template_param_list();
			setState(457);
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
		enterRule(_localctx, 78, RULE_template_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(468);
				switch (_input.LA(1)) {
				case T__28:
					{
					{
					setState(459);
					match(T__28);
					setState(460);
					template_param_list();
					setState(461);
					match(T__29);
					}
					}
					break;
				case T__16:
					{
					{
					setState(463);
					match(T__16);
					setState(464);
					template_param_list();
					setState(465);
					match(T__17);
					}
					}
					break;
				case T__0:
				case T__1:
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
				case PRE_ELSE:
				case PRE_ENDIF:
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
					setState(467);
					no_angle_brackets_or_brackets();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(470); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE) | (1L << SWITCH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (CPPCOMMENT - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 80, RULE_no_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__16 || _la==T__17) ) {
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
		enterRule(_localctx, 82, RULE_no_brackets_curlies_or_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
		enterRule(_localctx, 84, RULE_no_brackets_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__16) | (1L << T__17))) != 0)) ) {
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
		enterRule(_localctx, 86, RULE_no_angle_brackets_or_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__28) | (1L << T__29))) != 0)) ) {
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
		enterRule(_localctx, 88, RULE_no_curlies);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
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
		enterRule(_localctx, 90, RULE_no_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__19 || _la==T__20) ) {
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
		enterRule(_localctx, 92, RULE_no_squares_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__19) | (1L << T__20))) != 0)) ) {
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
		enterRule(_localctx, 94, RULE_no_comma_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
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
		enterRule(_localctx, 96, RULE_assign_water);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
		enterRule(_localctx, 98, RULE_assign_water_l2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
		enterRule(_localctx, 100, RULE_water);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
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
		enterRule(_localctx, 102, RULE_function_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			_la = _input.LA(1);
			if (_la==TEMPLATE) {
				{
				setState(494);
				template_decl_start();
				}
			}

			setState(498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(497);
				return_type();
				}
				break;
			}
			setState(500);
			function_name();
			setState(501);
			function_param_list();
			setState(503);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(502);
				ctor_list();
				}
			}

			setState(505);
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
		enterRule(_localctx, 104, RULE_return_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & ((1L << (T__32 - 33)) | (1L << (T__33 - 33)) | (1L << (T__34 - 33)) | (1L << (T__35 - 33)) | (1L << (VIRTUAL - 33)))) != 0)) {
				{
				{
				setState(507);
				function_decl_specifiers();
				}
				}
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(513);
			type_name();
			}
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__13) {
				{
				{
				setState(515);
				ptr_operator();
				}
				}
				setState(520);
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
		enterRule(_localctx, 106, RULE_function_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(T__16);
			setState(523);
			_la = _input.LA(1);
			if (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (VOID - 68)) | (1L << (UNSIGNED - 68)) | (1L << (SIGNED - 68)) | (1L << (LONG - 68)) | (1L << (CV_QUALIFIER - 68)) | (1L << (AUTO - 68)) | (1L << (REGISTER - 68)) | (1L << (CLASS_KEY - 68)) | (1L << (ALPHA_NUMERIC - 68)))) != 0)) {
				{
				setState(522);
				parameter_decl_clause();
				}
			}

			setState(525);
			match(T__17);
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CV_QUALIFIER) {
				{
				{
				setState(526);
				match(CV_QUALIFIER);
				}
				}
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(533);
			_la = _input.LA(1);
			if (_la==THROW) {
				{
				setState(532);
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
		enterRule(_localctx, 108, RULE_parameter_decl_clause);
		int _la;
		try {
			int _alt;
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(535);
				parameter_decl();
				setState(540);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(536);
						match(T__1);
						setState(537);
						parameter_decl();
						}
						} 
					}
					setState(542);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				}
				setState(545);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(543);
					match(T__1);
					setState(544);
					match(ELLIPSIS);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
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
		enterRule(_localctx, 110, RULE_parameter_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			param_decl_specifiers();
			setState(551);
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
		enterRule(_localctx, 112, RULE_parameter_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__13) {
				{
				setState(553);
				ptrs();
				}
			}

			setState(561);
			switch (_input.LA(1)) {
			case T__16:
				{
				setState(556);
				match(T__16);
				setState(557);
				parameter_id();
				setState(558);
				match(T__17);
				}
				break;
			case T__36:
			case T__37:
			case T__38:
			case ALPHA_NUMERIC:
				{
				setState(560);
				parameter_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(564);
			_la = _input.LA(1);
			if (_la==T__16 || _la==T__19) {
				{
				setState(563);
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
		enterRule(_localctx, 114, RULE_compound_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
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
		enterRule(_localctx, 116, RULE_ctor_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(T__3);
			setState(570);
			ctor_initializer();
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(571);
				match(T__1);
				setState(572);
				ctor_initializer();
				}
				}
				setState(577);
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
		enterRule(_localctx, 118, RULE_ctor_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			initializer_id();
			setState(579);
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
		enterRule(_localctx, 120, RULE_initializer_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(581);
				match(T__18);
				}
			}

			setState(584);
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
		enterRule(_localctx, 122, RULE_ctor_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(T__16);
			setState(588);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(587);
				expr();
				}
			}

			setState(590);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 124, RULE_function_name);
		try {
			setState(599);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(592);
				match(T__16);
				setState(593);
				function_name();
				setState(594);
				match(T__17);
				}
				break;
			case T__36:
			case T__37:
			case T__38:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(596);
				identifier();
				}
				break;
			case OPERATOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(597);
				match(OPERATOR);
				setState(598);
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
		enterRule(_localctx, 126, RULE_exception_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(THROW);
			setState(602);
			match(T__16);
			setState(603);
			type_id_list();
			setState(604);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 128, RULE_type_id_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE) | (1L << SWITCH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (CPPCOMMENT - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(606);
				no_brackets();
				}
				}
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(612);
				match(T__16);
				setState(613);
				type_id_list();
				setState(614);
				match(T__17);
				setState(618);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE) | (1L << SWITCH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (CPPCOMMENT - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(615);
					no_brackets();
					}
					}
					setState(620);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(625);
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

	public static class Init_declaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Assign_expr_w_Context assign_expr_w_() {
			return getRuleContext(Assign_expr_w_Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Init_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInit_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInit_declarator(this);
		}
	}

	public final Init_declaratorContext init_declarator() throws RecognitionException {
		Init_declaratorContext _localctx = new Init_declaratorContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_init_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			declarator();
			setState(634);
			switch (_input.LA(1)) {
			case T__16:
				{
				{
				setState(627);
				match(T__16);
				setState(629);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(628);
					expr();
					}
				}

				setState(631);
				match(T__17);
				}
				}
				break;
			case T__40:
				{
				{
				setState(632);
				match(T__40);
				setState(633);
				assign_expr_w_();
				}
				}
				break;
			case T__0:
			case T__1:
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
		enterRule(_localctx, 132, RULE_declarator);
		int _la;
		try {
			setState(652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(637);
				_la = _input.LA(1);
				if (_la==T__8 || _la==T__13) {
					{
					setState(636);
					ptrs();
					}
				}

				setState(639);
				identifier();
				setState(641);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(640);
					type_suffix();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(644);
				_la = _input.LA(1);
				if (_la==T__8 || _la==T__13) {
					{
					setState(643);
					ptrs();
					}
				}

				setState(646);
				match(T__16);
				setState(647);
				func_ptrs();
				setState(648);
				identifier();
				setState(649);
				match(T__17);
				setState(650);
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
		public Constant_expr_w_Context constant_expr_w_() {
			return getRuleContext(Constant_expr_w_Context.class,0);
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
		enterRule(_localctx, 134, RULE_type_suffix);
		try {
			setState(659);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(654);
				match(T__19);
				setState(655);
				constant_expr_w_();
				setState(656);
				match(T__20);
				}
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(658);
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
		enterRule(_localctx, 136, RULE_assign_expr_w_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE) | (1L << SWITCH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (CPPCOMMENT - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(661);
				assign_water();
				}
				}
				setState(666);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16 || _la==T__19 || _la==OPENING_CURLY) {
				{
				{
				setState(679);
				switch (_input.LA(1)) {
				case OPENING_CURLY:
					{
					setState(667);
					match(OPENING_CURLY);
					setState(668);
					assign_expr_w__l2();
					setState(669);
					match(CLOSING_CURLY);
					}
					break;
				case T__16:
					{
					setState(671);
					match(T__16);
					setState(672);
					assign_expr_w__l2();
					setState(673);
					match(T__17);
					}
					break;
				case T__19:
					{
					setState(675);
					match(T__19);
					setState(676);
					assign_expr_w__l2();
					setState(677);
					match(T__20);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE) | (1L << SWITCH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (CPPCOMMENT - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(681);
					assign_water();
					}
					}
					setState(686);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(691);
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
		enterRule(_localctx, 138, RULE_assign_expr_w__l2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE) | (1L << SWITCH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (CPPCOMMENT - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(692);
				assign_water_l2();
				}
				}
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16 || _la==T__19 || _la==OPENING_CURLY) {
				{
				{
				setState(710);
				switch (_input.LA(1)) {
				case OPENING_CURLY:
					{
					setState(698);
					match(OPENING_CURLY);
					setState(699);
					assign_expr_w__l2();
					setState(700);
					match(CLOSING_CURLY);
					}
					break;
				case T__16:
					{
					setState(702);
					match(T__16);
					setState(703);
					assign_expr_w__l2();
					setState(704);
					match(T__17);
					}
					break;
				case T__19:
					{
					setState(706);
					match(T__19);
					setState(707);
					assign_expr_w__l2();
					setState(708);
					match(T__20);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(715);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE) | (1L << SWITCH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (CPPCOMMENT - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(712);
					assign_water_l2();
					}
					}
					setState(717);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(722);
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
		enterRule(_localctx, 140, RULE_constant_expr_w_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE) | (1L << SWITCH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (CPPCOMMENT - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(723);
				no_squares();
				}
				}
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(740);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(729);
				match(T__19);
				setState(730);
				constant_expr_w_();
				setState(731);
				match(T__20);
				setState(735);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE) | (1L << SWITCH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (CPPCOMMENT - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(732);
					no_squares();
					}
					}
					setState(737);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(742);
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
		enterRule(_localctx, 142, RULE_simple_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(744);
			_la = _input.LA(1);
			if (_la==TYPEDEF) {
				{
				setState(743);
				match(TYPEDEF);
				}
			}

			setState(747);
			_la = _input.LA(1);
			if (_la==TEMPLATE) {
				{
				setState(746);
				template_decl_start();
				}
			}

			}
			setState(749);
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
		enterRule(_localctx, 144, RULE_var_decl);
		try {
			setState(758);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				_localctx = new DeclByClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(751);
				class_def();
				setState(753);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(752);
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
				setState(755);
				type_name();
				setState(756);
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
		enterRule(_localctx, 146, RULE_init_declarator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			init_declarator();
			setState(765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(761);
				match(T__1);
				setState(762);
				init_declarator();
				}
				}
				setState(767);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(768);
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
		enterRule(_localctx, 148, RULE_initializer);
		try {
			setState(775);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(770);
				assign_expr();
				}
				break;
			case OPENING_CURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(771);
				match(OPENING_CURLY);
				setState(772);
				initializer_list();
				setState(773);
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
		enterRule(_localctx, 150, RULE_initializer_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			initializer();
			setState(782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(778);
				match(T__1);
				setState(779);
				initializer();
				}
				}
				setState(784);
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
		enterRule(_localctx, 152, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			match(CLASS_KEY);
			setState(787);
			_la = _input.LA(1);
			if (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (T__36 - 37)) | (1L << (T__37 - 37)) | (1L << (T__38 - 37)) | (1L << (ALPHA_NUMERIC - 37)))) != 0)) {
				{
				setState(786);
				class_name();
				}
			}

			setState(790);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(789);
				base_classes();
				}
			}

			setState(792);
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
		enterRule(_localctx, 154, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
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
		enterRule(_localctx, 156, RULE_base_classes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			match(T__3);
			setState(798);
			base_class();
			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(799);
				match(T__1);
				setState(800);
				base_class();
				}
				}
				setState(805);
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
		enterRule(_localctx, 158, RULE_base_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			_la = _input.LA(1);
			if (_la==VIRTUAL) {
				{
				setState(806);
				match(VIRTUAL);
				}
			}

			setState(810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(809);
				access_specifier();
				}
				break;
			}
			setState(812);
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
		enterRule(_localctx, 160, RULE_type_name);
		int _la;
		try {
			setState(848);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(817);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CV_QUALIFIER) {
					{
					{
					setState(814);
					match(CV_QUALIFIER);
					}
					}
					setState(819);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(821);
				_la = _input.LA(1);
				if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (UNSIGNED - 69)) | (1L << (SIGNED - 69)) | (1L << (CLASS_KEY - 69)))) != 0)) {
					{
					setState(820);
					_la = _input.LA(1);
					if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (UNSIGNED - 69)) | (1L << (SIGNED - 69)) | (1L << (CLASS_KEY - 69)))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(823);
				base_type();
				setState(828);
				_la = _input.LA(1);
				if (_la==T__28) {
					{
					setState(824);
					match(T__28);
					setState(825);
					template_param_list();
					setState(826);
					match(T__29);
					}
				}

				setState(840);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__18) {
					{
					{
					setState(830);
					match(T__18);
					setState(831);
					base_type();
					setState(836);
					_la = _input.LA(1);
					if (_la==T__28) {
						{
						setState(832);
						match(T__28);
						setState(833);
						template_param_list();
						setState(834);
						match(T__29);
						}
					}

					}
					}
					setState(842);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(844);
				_la = _input.LA(1);
				if (_la==CV_QUALIFIER) {
					{
					setState(843);
					match(CV_QUALIFIER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(846);
				match(UNSIGNED);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(847);
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
		enterRule(_localctx, 162, RULE_base_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(851); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(850);
					_la = _input.LA(1);
					if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (VOID - 68)) | (1L << (LONG - 68)) | (1L << (ALPHA_NUMERIC - 68)))) != 0)) ) {
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
				setState(853); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
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
		enterRule(_localctx, 164, RULE_param_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			_la = _input.LA(1);
			if (_la==AUTO || _la==REGISTER) {
				{
				setState(855);
				_la = _input.LA(1);
				if ( !(_la==AUTO || _la==REGISTER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(858);
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
		enterRule(_localctx, 166, RULE_parameter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
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
		enterRule(_localctx, 168, RULE_param_type_list);
		int _la;
		try {
			setState(877);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(862);
				match(T__16);
				setState(863);
				match(VOID);
				setState(864);
				match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(865);
				match(T__16);
				setState(874);
				_la = _input.LA(1);
				if (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (VOID - 68)) | (1L << (UNSIGNED - 68)) | (1L << (SIGNED - 68)) | (1L << (LONG - 68)) | (1L << (CV_QUALIFIER - 68)) | (1L << (AUTO - 68)) | (1L << (REGISTER - 68)) | (1L << (CLASS_KEY - 68)) | (1L << (ALPHA_NUMERIC - 68)))) != 0)) {
					{
					setState(866);
					param_type();
					setState(871);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(867);
						match(T__1);
						setState(868);
						param_type();
						}
						}
						setState(873);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(876);
				match(T__17);
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 170, RULE_param_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			param_decl_specifiers();
			setState(880);
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
		enterRule(_localctx, 172, RULE_param_type_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__13) {
				{
				setState(882);
				ptrs();
				}
			}

			setState(892);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(885);
				match(T__16);
				setState(886);
				param_type_id();
				setState(887);
				match(T__17);
				}
				break;
			case 2:
				{
				setState(890);
				_la = _input.LA(1);
				if (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (T__36 - 37)) | (1L << (T__37 - 37)) | (1L << (T__38 - 37)) | (1L << (ALPHA_NUMERIC - 37)))) != 0)) {
					{
					setState(889);
					parameter_name();
					}
				}

				}
				break;
			}
			setState(895);
			_la = _input.LA(1);
			if (_la==T__16 || _la==T__19) {
				{
				setState(894);
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
		enterRule(_localctx, 174, RULE_identifier);
		try {
			int _alt;
			setState(906);
			switch (_input.LA(1)) {
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(897);
				match(ALPHA_NUMERIC);
				setState(902);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(898);
						match(T__18);
						setState(899);
						match(ALPHA_NUMERIC);
						}
						} 
					}
					setState(904);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				}
				}
				}
				break;
			case T__36:
			case T__37:
			case T__38:
				enterOuterAlt(_localctx, 2);
				{
				setState(905);
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
		enterRule(_localctx, 176, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			_la = _input.LA(1);
			if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)))) != 0)) ) {
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
		enterRule(_localctx, 178, RULE_ptrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(910);
				ptr_operator();
				setState(912);
				_la = _input.LA(1);
				if (_la==T__54) {
					{
					setState(911);
					match(T__54);
					}
				}

				}
				}
				setState(916); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__8 || _la==T__13 );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 180, RULE_func_ptrs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
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
		case 25:
			return postfix_expression_sempred((Postfix_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean postfix_expression_sempred(Postfix_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3g\u039b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\3\2\3\2\3\2\3\2\7\2"+
		"\u00bd\n\2\f\2\16\2\u00c0\13\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4\u00ca"+
		"\n\4\3\5\3\5\3\5\3\5\5\5\u00d0\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00d9"+
		"\n\6\3\7\3\7\3\7\5\7\u00de\n\7\3\b\3\b\3\b\5\b\u00e3\n\b\3\t\3\t\3\t\5"+
		"\t\u00e8\n\t\3\n\3\n\3\n\5\n\u00ed\n\n\3\13\3\13\3\13\5\13\u00f2\n\13"+
		"\3\f\3\f\3\f\3\f\5\f\u00f8\n\f\3\r\3\r\3\r\3\r\5\r\u00fe\n\r\3\16\3\16"+
		"\3\16\5\16\u0103\n\16\3\17\3\17\3\17\5\17\u0108\n\17\3\20\3\20\3\20\5"+
		"\20\u010d\n\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\7\22\u0116\n\22\f\22"+
		"\16\22\u0119\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0122\n\23"+
		"\3\24\5\24\u0125\n\24\3\24\3\24\3\24\3\24\5\24\u012b\n\24\3\24\3\24\3"+
		"\24\5\24\u0130\n\24\3\24\3\24\3\24\3\24\5\24\u0136\n\24\3\24\3\24\5\24"+
		"\u013a\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u0147\n\26\3\27\3\27\3\30\3\30\7\30\u014d\n\30\f\30\16\30\u0150\13\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0166\n\33\3\33\3\33\3\33\3\33\5\33"+
		"\u016c\n\33\3\33\3\33\3\33\7\33\u0171\n\33\f\33\16\33\u0174\13\33\3\34"+
		"\3\34\3\34\7\34\u0179\n\34\f\34\16\34\u017c\13\34\5\34\u017e\n\34\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0188\n\36\3\37\3\37\3 \3 \3"+
		"!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\5%\u0199\n%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u01c3\n%\3&\3&\3\'\3\'\3(\3(\3(\3(\3(\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\6)\u01d7\n)\r)\16)\u01d8\3*\3*\3+\3+\3,\3,\3"+
		"-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65"+
		"\5\65\u01f2\n\65\3\65\5\65\u01f5\n\65\3\65\3\65\3\65\5\65\u01fa\n\65\3"+
		"\65\3\65\3\66\7\66\u01ff\n\66\f\66\16\66\u0202\13\66\3\66\3\66\3\66\7"+
		"\66\u0207\n\66\f\66\16\66\u020a\13\66\3\67\3\67\5\67\u020e\n\67\3\67\3"+
		"\67\7\67\u0212\n\67\f\67\16\67\u0215\13\67\3\67\5\67\u0218\n\67\38\38"+
		"\38\78\u021d\n8\f8\168\u0220\138\38\38\58\u0224\n8\38\58\u0227\n8\39\3"+
		"9\39\3:\5:\u022d\n:\3:\3:\3:\3:\3:\5:\u0234\n:\3:\5:\u0237\n:\3;\3;\3"+
		";\3<\3<\3<\3<\7<\u0240\n<\f<\16<\u0243\13<\3=\3=\3=\3>\5>\u0249\n>\3>"+
		"\3>\3?\3?\5?\u024f\n?\3?\3?\3@\3@\3@\3@\3@\3@\3@\5@\u025a\n@\3A\3A\3A"+
		"\3A\3A\3B\7B\u0262\nB\fB\16B\u0265\13B\3B\3B\3B\3B\7B\u026b\nB\fB\16B"+
		"\u026e\13B\7B\u0270\nB\fB\16B\u0273\13B\3C\3C\3C\5C\u0278\nC\3C\3C\3C"+
		"\5C\u027d\nC\3D\5D\u0280\nD\3D\3D\5D\u0284\nD\3D\5D\u0287\nD\3D\3D\3D"+
		"\3D\3D\3D\5D\u028f\nD\3E\3E\3E\3E\3E\5E\u0296\nE\3F\7F\u0299\nF\fF\16"+
		"F\u029c\13F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u02aa\nF\3F\7F\u02ad"+
		"\nF\fF\16F\u02b0\13F\7F\u02b2\nF\fF\16F\u02b5\13F\3G\7G\u02b8\nG\fG\16"+
		"G\u02bb\13G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u02c9\nG\3G\7G\u02cc"+
		"\nG\fG\16G\u02cf\13G\7G\u02d1\nG\fG\16G\u02d4\13G\3H\7H\u02d7\nH\fH\16"+
		"H\u02da\13H\3H\3H\3H\3H\7H\u02e0\nH\fH\16H\u02e3\13H\7H\u02e5\nH\fH\16"+
		"H\u02e8\13H\3I\5I\u02eb\nI\3I\5I\u02ee\nI\3I\3I\3J\3J\5J\u02f4\nJ\3J\3"+
		"J\3J\5J\u02f9\nJ\3K\3K\3K\7K\u02fe\nK\fK\16K\u0301\13K\3K\3K\3L\3L\3L"+
		"\3L\3L\5L\u030a\nL\3M\3M\3M\7M\u030f\nM\fM\16M\u0312\13M\3N\3N\5N\u0316"+
		"\nN\3N\5N\u0319\nN\3N\3N\3N\3O\3O\3P\3P\3P\3P\7P\u0324\nP\fP\16P\u0327"+
		"\13P\3Q\5Q\u032a\nQ\3Q\5Q\u032d\nQ\3Q\3Q\3R\7R\u0332\nR\fR\16R\u0335\13"+
		"R\3R\5R\u0338\nR\3R\3R\3R\3R\3R\5R\u033f\nR\3R\3R\3R\3R\3R\3R\5R\u0347"+
		"\nR\7R\u0349\nR\fR\16R\u034c\13R\3R\5R\u034f\nR\3R\3R\5R\u0353\nR\3S\6"+
		"S\u0356\nS\rS\16S\u0357\3T\5T\u035b\nT\3T\3T\3U\3U\3V\3V\3V\3V\3V\3V\3"+
		"V\7V\u0368\nV\fV\16V\u036b\13V\5V\u036d\nV\3V\5V\u0370\nV\3W\3W\3W\3X"+
		"\5X\u0376\nX\3X\3X\3X\3X\3X\5X\u037d\nX\5X\u037f\nX\3X\5X\u0382\nX\3Y"+
		"\3Y\3Y\7Y\u0387\nY\fY\16Y\u038a\13Y\3Y\5Y\u038d\nY\3Z\3Z\3[\3[\5[\u0393"+
		"\n[\6[\u0395\n[\r[\16[\u0396\3\\\3\\\3\\\2\3\64]\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\2\34\3\2\f\r\3\2\16\17\3\2\20\22\3\2\31"+
		"\32\5\2\13\13\16\20\35\36\3\2\37\"\3\2]b\4\2#&KK\4\2\13\13\20\20\3\2\'"+
		")\4\2**UU\3\2+\65\3\2\66\67\3\2\23\24\5\2\23\24\26\27XY\4\2\3\3\23\24"+
		"\4\2\23\24\37 \3\2XY\3\2\26\27\4\2\3\3\26\27\3\2\3\4\6\2\3\4\23\24\26"+
		"\27XY\4\2GHVV\5\2FFIIWW\3\2QR\3\2]_\u03dd\2\u00be\3\2\2\2\4\u00c1\3\2"+
		"\2\2\6\u00c6\3\2\2\2\b\u00cb\3\2\2\2\n\u00d8\3\2\2\2\f\u00da\3\2\2\2\16"+
		"\u00df\3\2\2\2\20\u00e4\3\2\2\2\22\u00e9\3\2\2\2\24\u00ee\3\2\2\2\26\u00f3"+
		"\3\2\2\2\30\u00f9\3\2\2\2\32\u00ff\3\2\2\2\34\u0104\3\2\2\2\36\u0109\3"+
		"\2\2\2 \u010e\3\2\2\2\"\u0113\3\2\2\2$\u0121\3\2\2\2&\u0139\3\2\2\2(\u013b"+
		"\3\2\2\2*\u0146\3\2\2\2,\u0148\3\2\2\2.\u014a\3\2\2\2\60\u0151\3\2\2\2"+
		"\62\u0153\3\2\2\2\64\u0155\3\2\2\2\66\u017d\3\2\2\28\u017f\3\2\2\2:\u0187"+
		"\3\2\2\2<\u0189\3\2\2\2>\u018b\3\2\2\2@\u018d\3\2\2\2B\u018f\3\2\2\2D"+
		"\u0191\3\2\2\2F\u0193\3\2\2\2H\u01c2\3\2\2\2J\u01c4\3\2\2\2L\u01c6\3\2"+
		"\2\2N\u01c8\3\2\2\2P\u01d6\3\2\2\2R\u01da\3\2\2\2T\u01dc\3\2\2\2V\u01de"+
		"\3\2\2\2X\u01e0\3\2\2\2Z\u01e2\3\2\2\2\\\u01e4\3\2\2\2^\u01e6\3\2\2\2"+
		"`\u01e8\3\2\2\2b\u01ea\3\2\2\2d\u01ec\3\2\2\2f\u01ee\3\2\2\2h\u01f1\3"+
		"\2\2\2j\u0200\3\2\2\2l\u020b\3\2\2\2n\u0226\3\2\2\2p\u0228\3\2\2\2r\u022c"+
		"\3\2\2\2t\u0238\3\2\2\2v\u023b\3\2\2\2x\u0244\3\2\2\2z\u0248\3\2\2\2|"+
		"\u024c\3\2\2\2~\u0259\3\2\2\2\u0080\u025b\3\2\2\2\u0082\u0263\3\2\2\2"+
		"\u0084\u0274\3\2\2\2\u0086\u028e\3\2\2\2\u0088\u0295\3\2\2\2\u008a\u029a"+
		"\3\2\2\2\u008c\u02b9\3\2\2\2\u008e\u02d8\3\2\2\2\u0090\u02ea\3\2\2\2\u0092"+
		"\u02f8\3\2\2\2\u0094\u02fa\3\2\2\2\u0096\u0309\3\2\2\2\u0098\u030b\3\2"+
		"\2\2\u009a\u0313\3\2\2\2\u009c\u031d\3\2\2\2\u009e\u031f\3\2\2\2\u00a0"+
		"\u0329\3\2\2\2\u00a2\u0352\3\2\2\2\u00a4\u0355\3\2\2\2\u00a6\u035a\3\2"+
		"\2\2\u00a8\u035e\3\2\2\2\u00aa\u036f\3\2\2\2\u00ac\u0371\3\2\2\2\u00ae"+
		"\u0375\3\2\2\2\u00b0\u038c\3\2\2\2\u00b2\u038e\3\2\2\2\u00b4\u0394\3\2"+
		"\2\2\u00b6\u0398\3\2\2\2\u00b8\u00bd\5h\65\2\u00b9\u00bd\5\u0090I\2\u00ba"+
		"\u00bd\5\4\3\2\u00bb\u00bd\5f\64\2\u00bc\u00b8\3\2\2\2\u00bc\u00b9\3\2"+
		"\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\3\3\2\2\2\u00c0\u00be\3\2\2\2"+
		"\u00c1\u00c2\7O\2\2\u00c2\u00c3\7P\2\2\u00c3\u00c4\5\u00b0Y\2\u00c4\u00c5"+
		"\7\3\2\2\u00c5\5\3\2\2\2\u00c6\u00c9\5\b\5\2\u00c7\u00c8\7\4\2\2\u00c8"+
		"\u00ca\5\6\4\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\7\3\2\2\2"+
		"\u00cb\u00cf\5\n\6\2\u00cc\u00cd\5J&\2\u00cd\u00ce\5\b\5\2\u00ce\u00d0"+
		"\3\2\2\2\u00cf\u00cc\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\t\3\2\2\2\u00d1"+
		"\u00d9\5\f\7\2\u00d2\u00d3\5\f\7\2\u00d3\u00d4\7\5\2\2\u00d4\u00d5\5\6"+
		"\4\2\u00d5\u00d6\7\6\2\2\u00d6\u00d7\5\n\6\2\u00d7\u00d9\3\2\2\2\u00d8"+
		"\u00d1\3\2\2\2\u00d8\u00d2\3\2\2\2\u00d9\13\3\2\2\2\u00da\u00dd\5\16\b"+
		"\2\u00db\u00dc\7\7\2\2\u00dc\u00de\5\f\7\2\u00dd\u00db\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\r\3\2\2\2\u00df\u00e2\5\20\t\2\u00e0\u00e1\7\b\2\2\u00e1"+
		"\u00e3\5\16\b\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\17\3\2\2"+
		"\2\u00e4\u00e7\5\22\n\2\u00e5\u00e6\7\t\2\2\u00e6\u00e8\5\20\t\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\21\3\2\2\2\u00e9\u00ec\5\24\13"+
		"\2\u00ea\u00eb\7\n\2\2\u00eb\u00ed\5\22\n\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\23\3\2\2\2\u00ee\u00f1\5\26\f\2\u00ef\u00f0\7\13"+
		"\2\2\u00f0\u00f2\5\24\13\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\25\3\2\2\2\u00f3\u00f7\5\30\r\2\u00f4\u00f5\5L\'\2\u00f5\u00f6\5\26\f"+
		"\2\u00f6\u00f8\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\27"+
		"\3\2\2\2\u00f9\u00fd\5\32\16\2\u00fa\u00fb\5> \2\u00fb\u00fc\5\30\r\2"+
		"\u00fc\u00fe\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\31"+
		"\3\2\2\2\u00ff\u0102\5\34\17\2\u0100\u0101\t\2\2\2\u0101\u0103\5\32\16"+
		"\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\33\3\2\2\2\u0104\u0107"+
		"\5\36\20\2\u0105\u0106\t\3\2\2\u0106\u0108\5\34\17\2\u0107\u0105\3\2\2"+
		"\2\u0107\u0108\3\2\2\2\u0108\35\3\2\2\2\u0109\u010c\5 \21\2\u010a\u010b"+
		"\t\4\2\2\u010b\u010d\5\36\20\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2"+
		"\u010d\37\3\2\2\2\u010e\u010f\7\23\2\2\u010f\u0110\5\"\22\2\u0110\u0111"+
		"\7\24\2\2\u0111\u0112\5 \21\2\u0112!\3\2\2\2\u0113\u0117\5\u00a2R\2\u0114"+
		"\u0116\5D#\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2"+
		"\2\u0117\u0118\3\2\2\2\u0118#\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011b"+
		"\5\62\32\2\u011b\u011c\5 \21\2\u011c\u0122\3\2\2\2\u011d\u0122\5(\25\2"+
		"\u011e\u0122\5*\26\2\u011f\u0122\5&\24\2\u0120\u0122\5\64\33\2\u0121\u011a"+
		"\3\2\2\2\u0121\u011d\3\2\2\2\u0121\u011e\3\2\2\2\u0121\u011f\3\2\2\2\u0121"+
		"\u0120\3\2\2\2\u0122%\3\2\2\2\u0123\u0125\7\25\2\2\u0124\u0123\3\2\2\2"+
		"\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\7U\2\2\u0127\u0128"+
		"\5\u00a2R\2\u0128\u012a\7\26\2\2\u0129\u012b\5\n\6\2\u012a\u0129\3\2\2"+
		"\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\7\27\2\2\u012d"+
		"\u013a\3\2\2\2\u012e\u0130\7\25\2\2\u012f\u012e\3\2\2\2\u012f\u0130\3"+
		"\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\7U\2\2\u0132\u0133\5\u00a2R\2\u0133"+
		"\u0135\7\23\2\2\u0134\u0136\5\6\4\2\u0135\u0134\3\2\2\2\u0135\u0136\3"+
		"\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\7\24\2\2\u0138\u013a\3\2\2\2\u0139"+
		"\u0124\3\2\2\2\u0139\u012f\3\2\2\2\u013a\'\3\2\2\2\u013b\u013c\5<\37\2"+
		"\u013c\u013d\5 \21\2\u013d)\3\2\2\2\u013e\u013f\5,\27\2\u013f\u0140\7"+
		"\23\2\2\u0140\u0141\5.\30\2\u0141\u0142\7\24\2\2\u0142\u0147\3\2\2\2\u0143"+
		"\u0144\5,\27\2\u0144\u0145\5\60\31\2\u0145\u0147\3\2\2\2\u0146\u013e\3"+
		"\2\2\2\u0146\u0143\3\2\2\2\u0147+\3\2\2\2\u0148\u0149\7\30\2\2\u0149-"+
		"\3\2\2\2\u014a\u014e\5\u00a2R\2\u014b\u014d\5D#\2\u014c\u014b\3\2\2\2"+
		"\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f/\3"+
		"\2\2\2\u0150\u014e\3\2\2\2\u0151\u0152\5$\23\2\u0152\61\3\2\2\2\u0153"+
		"\u0154\t\5\2\2\u0154\63\3\2\2\2\u0155\u0156\b\33\1\2\u0156\u0157\5:\36"+
		"\2\u0157\u0172\3\2\2\2\u0158\u0159\f\b\2\2\u0159\u015a\7\26\2\2\u015a"+
		"\u015b\5\6\4\2\u015b\u015c\7\27\2\2\u015c\u0171\3\2\2\2\u015d\u015e\f"+
		"\7\2\2\u015e\u015f\7\23\2\2\u015f\u0160\5\66\34\2\u0160\u0161\7\24\2\2"+
		"\u0161\u0171\3\2\2\2\u0162\u0163\f\6\2\2\u0163\u0165\7\33\2\2\u0164\u0166"+
		"\7T\2\2\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u0171\5\u00b0Y\2\u0168\u0169\f\5\2\2\u0169\u016b\7\34\2\2\u016a\u016c"+
		"\7T\2\2\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d"+
		"\u0171\5\u00b0Y\2\u016e\u016f\f\4\2\2\u016f\u0171\5\62\32\2\u0170\u0158"+
		"\3\2\2\2\u0170\u015d\3\2\2\2\u0170\u0162\3\2\2\2\u0170\u0168\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2"+
		"\2\2\u0173\65\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u017a\58\35\2\u0176\u0177"+
		"\7\4\2\2\u0177\u0179\58\35\2\u0178\u0176\3\2\2\2\u0179\u017c\3\2\2\2\u017a"+
		"\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2"+
		"\2\2\u017d\u0175\3\2\2\2\u017d\u017e\3\2\2\2\u017e\67\3\2\2\2\u017f\u0180"+
		"\5\b\5\2\u01809\3\2\2\2\u0181\u0188\5\u00b0Y\2\u0182\u0188\5@!\2\u0183"+
		"\u0184\7\23\2\2\u0184\u0185\5\6\4\2\u0185\u0186\7\24\2\2\u0186\u0188\3"+
		"\2\2\2\u0187\u0181\3\2\2\2\u0187\u0182\3\2\2\2\u0187\u0183\3\2\2\2\u0188"+
		";\3\2\2\2\u0189\u018a\t\6\2\2\u018a=\3\2\2\2\u018b\u018c\t\7\2\2\u018c"+
		"?\3\2\2\2\u018d\u018e\t\b\2\2\u018eA\3\2\2\2\u018f\u0190\t\t\2\2\u0190"+
		"C\3\2\2\2\u0191\u0192\t\n\2\2\u0192E\3\2\2\2\u0193\u0194\t\13\2\2\u0194"+
		"G\3\2\2\2\u0195\u0198\t\f\2\2\u0196\u0197\7\26\2\2\u0197\u0199\7\27\2"+
		"\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u01c3\3\2\2\2\u019a\u01c3"+
		"\7\16\2\2\u019b\u01c3\7\17\2\2\u019c\u01c3\7\20\2\2\u019d\u01c3\7\21\2"+
		"\2\u019e\u01c3\7\22\2\2\u019f\u01c3\7\n\2\2\u01a0\u01c3\7\13\2\2\u01a1"+
		"\u01c3\7\t\2\2\u01a2\u01c3\7\35\2\2\u01a3\u01c3\7\36\2\2\u01a4\u01c3\7"+
		"+\2\2\u01a5\u01c3\7\37\2\2\u01a6\u01c3\7 \2\2\u01a7\u01c3\7,\2\2\u01a8"+
		"\u01c3\7-\2\2\u01a9\u01c3\7.\2\2\u01aa\u01c3\7/\2\2\u01ab\u01c3\7\60\2"+
		"\2\u01ac\u01c3\7\61\2\2\u01ad\u01c3\7\62\2\2\u01ae\u01c3\7\63\2\2\u01af"+
		"\u01c3\7\r\2\2\u01b0\u01c3\7\f\2\2\u01b1\u01c3\7\64\2\2\u01b2\u01c3\7"+
		"\65\2\2\u01b3\u01c3\7\66\2\2\u01b4\u01c3\7\67\2\2\u01b5\u01c3\7!\2\2\u01b6"+
		"\u01c3\7\"\2\2\u01b7\u01c3\7\b\2\2\u01b8\u01c3\7\7\2\2\u01b9\u01c3\7\32"+
		"\2\2\u01ba\u01c3\7\31\2\2\u01bb\u01c3\7\4\2\2\u01bc\u01c3\78\2\2\u01bd"+
		"\u01c3\7\34\2\2\u01be\u01bf\7\23\2\2\u01bf\u01c3\7\24\2\2\u01c0\u01c1"+
		"\7\26\2\2\u01c1\u01c3\7\27\2\2\u01c2\u0195\3\2\2\2\u01c2\u019a\3\2\2\2"+
		"\u01c2\u019b\3\2\2\2\u01c2\u019c\3\2\2\2\u01c2\u019d\3\2\2\2\u01c2\u019e"+
		"\3\2\2\2\u01c2\u019f\3\2\2\2\u01c2\u01a0\3\2\2\2\u01c2\u01a1\3\2\2\2\u01c2"+
		"\u01a2\3\2\2\2\u01c2\u01a3\3\2\2\2\u01c2\u01a4\3\2\2\2\u01c2\u01a5\3\2"+
		"\2\2\u01c2\u01a6\3\2\2\2\u01c2\u01a7\3\2\2\2\u01c2\u01a8\3\2\2\2\u01c2"+
		"\u01a9\3\2\2\2\u01c2\u01aa\3\2\2\2\u01c2\u01ab\3\2\2\2\u01c2\u01ac\3\2"+
		"\2\2\u01c2\u01ad\3\2\2\2\u01c2\u01ae\3\2\2\2\u01c2\u01af\3\2\2\2\u01c2"+
		"\u01b0\3\2\2\2\u01c2\u01b1\3\2\2\2\u01c2\u01b2\3\2\2\2\u01c2\u01b3\3\2"+
		"\2\2\u01c2\u01b4\3\2\2\2\u01c2\u01b5\3\2\2\2\u01c2\u01b6\3\2\2\2\u01c2"+
		"\u01b7\3\2\2\2\u01c2\u01b8\3\2\2\2\u01c2\u01b9\3\2\2\2\u01c2\u01ba\3\2"+
		"\2\2\u01c2\u01bb\3\2\2\2\u01c2\u01bc\3\2\2\2\u01c2\u01bd\3\2\2\2\u01c2"+
		"\u01be\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3I\3\2\2\2\u01c4\u01c5\t\r\2\2"+
		"\u01c5K\3\2\2\2\u01c6\u01c7\t\16\2\2\u01c7M\3\2\2\2\u01c8\u01c9\7T\2\2"+
		"\u01c9\u01ca\7\37\2\2\u01ca\u01cb\5P)\2\u01cb\u01cc\7 \2\2\u01ccO\3\2"+
		"\2\2\u01cd\u01ce\7\37\2\2\u01ce\u01cf\5P)\2\u01cf\u01d0\7 \2\2\u01d0\u01d7"+
		"\3\2\2\2\u01d1\u01d2\7\23\2\2\u01d2\u01d3\5P)\2\u01d3\u01d4\7\24\2\2\u01d4"+
		"\u01d7\3\2\2\2\u01d5\u01d7\5X-\2\u01d6\u01cd\3\2\2\2\u01d6\u01d1\3\2\2"+
		"\2\u01d6\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9"+
		"\3\2\2\2\u01d9Q\3\2\2\2\u01da\u01db\n\17\2\2\u01dbS\3\2\2\2\u01dc\u01dd"+
		"\n\20\2\2\u01ddU\3\2\2\2\u01de\u01df\n\21\2\2\u01dfW\3\2\2\2\u01e0\u01e1"+
		"\n\22\2\2\u01e1Y\3\2\2\2\u01e2\u01e3\n\23\2\2\u01e3[\3\2\2\2\u01e4\u01e5"+
		"\n\24\2\2\u01e5]\3\2\2\2\u01e6\u01e7\n\25\2\2\u01e7_\3\2\2\2\u01e8\u01e9"+
		"\n\26\2\2\u01e9a\3\2\2\2\u01ea\u01eb\n\27\2\2\u01ebc\3\2\2\2\u01ec\u01ed"+
		"\n\20\2\2\u01ede\3\2\2\2\u01ee\u01ef\13\2\2\2\u01efg\3\2\2\2\u01f0\u01f2"+
		"\5N(\2\u01f1\u01f0\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3"+
		"\u01f5\5j\66\2\u01f4\u01f3\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\3\2"+
		"\2\2\u01f6\u01f7\5~@\2\u01f7\u01f9\5l\67\2\u01f8\u01fa\5v<\2\u01f9\u01f8"+
		"\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\5t;\2\u01fc"+
		"i\3\2\2\2\u01fd\u01ff\5B\"\2\u01fe\u01fd\3\2\2\2\u01ff\u0202\3\2\2\2\u0200"+
		"\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0203\3\2\2\2\u0202\u0200\3\2"+
		"\2\2\u0203\u0204\5\u00a2R\2\u0204\u0208\3\2\2\2\u0205\u0207\5D#\2\u0206"+
		"\u0205\3\2\2\2\u0207\u020a\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2"+
		"\2\2\u0209k\3\2\2\2\u020a\u0208\3\2\2\2\u020b\u020d\7\23\2\2\u020c\u020e"+
		"\5n8\2\u020d\u020c\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020f\3\2\2\2\u020f"+
		"\u0213\7\24\2\2\u0210\u0212\7J\2\2\u0211\u0210\3\2\2\2\u0212\u0215\3\2"+
		"\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0217\3\2\2\2\u0215"+
		"\u0213\3\2\2\2\u0216\u0218\5\u0080A\2\u0217\u0216\3\2\2\2\u0217\u0218"+
		"\3\2\2\2\u0218m\3\2\2\2\u0219\u021e\5p9\2\u021a\u021b\7\4\2\2\u021b\u021d"+
		"\5p9\2\u021c\u021a\3\2\2\2\u021d\u0220\3\2\2\2\u021e\u021c\3\2\2\2\u021e"+
		"\u021f\3\2\2\2\u021f\u0223\3\2\2\2\u0220\u021e\3\2\2\2\u0221\u0222\7\4"+
		"\2\2\u0222\u0224\7f\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224"+
		"\u0227\3\2\2\2\u0225\u0227\7F\2\2\u0226\u0219\3\2\2\2\u0226\u0225\3\2"+
		"\2\2\u0227o\3\2\2\2\u0228\u0229\5\u00a6T\2\u0229\u022a\5r:\2\u022aq\3"+
		"\2\2\2\u022b\u022d\5\u00b4[\2\u022c\u022b\3\2\2\2\u022c\u022d\3\2\2\2"+
		"\u022d\u0233\3\2\2\2\u022e\u022f\7\23\2\2\u022f\u0230\5r:\2\u0230\u0231"+
		"\7\24\2\2\u0231\u0234\3\2\2\2\u0232\u0234\5\u00a8U\2\u0233\u022e\3\2\2"+
		"\2\u0233\u0232\3\2\2\2\u0234\u0236\3\2\2\2\u0235\u0237\5\u0088E\2\u0236"+
		"\u0235\3\2\2\2\u0236\u0237\3\2\2\2\u0237s\3\2\2\2\u0238\u0239\7X\2\2\u0239"+
		"\u023a\b;\1\2\u023au\3\2\2\2\u023b\u023c\7\6\2\2\u023c\u0241\5x=\2\u023d"+
		"\u023e\7\4\2\2\u023e\u0240\5x=\2\u023f\u023d\3\2\2\2\u0240\u0243\3\2\2"+
		"\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242w\3\2\2\2\u0243\u0241"+
		"\3\2\2\2\u0244\u0245\5z>\2\u0245\u0246\5|?\2\u0246y\3\2\2\2\u0247\u0249"+
		"\7\25\2\2\u0248\u0247\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\3\2\2\2"+
		"\u024a\u024b\5\u00b0Y\2\u024b{\3\2\2\2\u024c\u024e\7\23\2\2\u024d\u024f"+
		"\5\6\4\2\u024e\u024d\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0250\3\2\2\2\u0250"+
		"\u0251\7\24\2\2\u0251}\3\2\2\2\u0252\u0253\7\23\2\2\u0253\u0254\5~@\2"+
		"\u0254\u0255\7\24\2\2\u0255\u025a\3\2\2\2\u0256\u025a\5\u00b0Y\2\u0257"+
		"\u0258\7S\2\2\u0258\u025a\5H%\2\u0259\u0252\3\2\2\2\u0259\u0256\3\2\2"+
		"\2\u0259\u0257\3\2\2\2\u025a\177\3\2\2\2\u025b\u025c\7N\2\2\u025c\u025d"+
		"\7\23\2\2\u025d\u025e\5\u0082B\2\u025e\u025f\7\24\2\2\u025f\u0081\3\2"+
		"\2\2\u0260\u0262\5R*\2\u0261\u0260\3\2\2\2\u0262\u0265\3\2\2\2\u0263\u0261"+
		"\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0271\3\2\2\2\u0265\u0263\3\2\2\2\u0266"+
		"\u0267\7\23\2\2\u0267\u0268\5\u0082B\2\u0268\u026c\7\24\2\2\u0269\u026b"+
		"\5R*\2\u026a\u0269\3\2\2\2\u026b\u026e\3\2\2\2\u026c\u026a\3\2\2\2\u026c"+
		"\u026d\3\2\2\2\u026d\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026f\u0266\3\2"+
		"\2\2\u0270\u0273\3\2\2\2\u0271\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272"+
		"\u0083\3\2\2\2\u0273\u0271\3\2\2\2\u0274\u027c\5\u0086D\2\u0275\u0277"+
		"\7\23\2\2\u0276\u0278\5\6\4\2\u0277\u0276\3\2\2\2\u0277\u0278\3\2\2\2"+
		"\u0278\u0279\3\2\2\2\u0279\u027d\7\24\2\2\u027a\u027b\7+\2\2\u027b\u027d"+
		"\5\u008aF\2\u027c\u0275\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027d\3\2\2"+
		"\2\u027d\u0085\3\2\2\2\u027e\u0280\5\u00b4[\2\u027f\u027e\3\2\2\2\u027f"+
		"\u0280\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0283\5\u00b0Y\2\u0282\u0284"+
		"\5\u0088E\2\u0283\u0282\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u028f\3\2\2"+
		"\2\u0285\u0287\5\u00b4[\2\u0286\u0285\3\2\2\2\u0286\u0287\3\2\2\2\u0287"+
		"\u0288\3\2\2\2\u0288\u0289\7\23\2\2\u0289\u028a\5\u00b6\\\2\u028a\u028b"+
		"\5\u00b0Y\2\u028b\u028c\7\24\2\2\u028c\u028d\5\u0088E\2\u028d\u028f\3"+
		"\2\2\2\u028e\u027f\3\2\2\2\u028e\u0286\3\2\2\2\u028f\u0087\3\2\2\2\u0290"+
		"\u0291\7\26\2\2\u0291\u0292\5\u008eH\2\u0292\u0293\7\27\2\2\u0293\u0296"+
		"\3\2\2\2\u0294\u0296\5\u00aaV\2\u0295\u0290\3\2\2\2\u0295\u0294\3\2\2"+
		"\2\u0296\u0089\3\2\2\2\u0297\u0299\5b\62\2\u0298\u0297\3\2\2\2\u0299\u029c"+
		"\3\2\2\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u02b3\3\2\2\2\u029c"+
		"\u029a\3\2\2\2\u029d\u029e\7X\2\2\u029e\u029f\5\u008cG\2\u029f\u02a0\7"+
		"Y\2\2\u02a0\u02aa\3\2\2\2\u02a1\u02a2\7\23\2\2\u02a2\u02a3\5\u008cG\2"+
		"\u02a3\u02a4\7\24\2\2\u02a4\u02aa\3\2\2\2\u02a5\u02a6\7\26\2\2\u02a6\u02a7"+
		"\5\u008cG\2\u02a7\u02a8\7\27\2\2\u02a8\u02aa\3\2\2\2\u02a9\u029d\3\2\2"+
		"\2\u02a9\u02a1\3\2\2\2\u02a9\u02a5\3\2\2\2\u02aa\u02ae\3\2\2\2\u02ab\u02ad"+
		"\5b\62\2\u02ac\u02ab\3\2\2\2\u02ad\u02b0\3\2\2\2\u02ae\u02ac\3\2\2\2\u02ae"+
		"\u02af\3\2\2\2\u02af\u02b2\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b1\u02a9\3\2"+
		"\2\2\u02b2\u02b5\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4"+
		"\u008b\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b6\u02b8\5d\63\2\u02b7\u02b6\3\2"+
		"\2\2\u02b8\u02bb\3\2\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba"+
		"\u02d2\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bc\u02bd\7X\2\2\u02bd\u02be\5\u008c"+
		"G\2\u02be\u02bf\7Y\2\2\u02bf\u02c9\3\2\2\2\u02c0\u02c1\7\23\2\2\u02c1"+
		"\u02c2\5\u008cG\2\u02c2\u02c3\7\24\2\2\u02c3\u02c9\3\2\2\2\u02c4\u02c5"+
		"\7\26\2\2\u02c5\u02c6\5\u008cG\2\u02c6\u02c7\7\27\2\2\u02c7\u02c9\3\2"+
		"\2\2\u02c8\u02bc\3\2\2\2\u02c8\u02c0\3\2\2\2\u02c8\u02c4\3\2\2\2\u02c9"+
		"\u02cd\3\2\2\2\u02ca\u02cc\5d\63\2\u02cb\u02ca\3\2\2\2\u02cc\u02cf\3\2"+
		"\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02d1\3\2\2\2\u02cf"+
		"\u02cd\3\2\2\2\u02d0\u02c8\3\2\2\2\u02d1\u02d4\3\2\2\2\u02d2\u02d0\3\2"+
		"\2\2\u02d2\u02d3\3\2\2\2\u02d3\u008d\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d5"+
		"\u02d7\5\\/\2\u02d6\u02d5\3\2\2\2\u02d7\u02da\3\2\2\2\u02d8\u02d6\3\2"+
		"\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02e6\3\2\2\2\u02da\u02d8\3\2\2\2\u02db"+
		"\u02dc\7\26\2\2\u02dc\u02dd\5\u008eH\2\u02dd\u02e1\7\27\2\2\u02de\u02e0"+
		"\5\\/\2\u02df\u02de\3\2\2\2\u02e0\u02e3\3\2\2\2\u02e1\u02df\3\2\2\2\u02e1"+
		"\u02e2\3\2\2\2\u02e2\u02e5\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e4\u02db\3\2"+
		"\2\2\u02e5\u02e8\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7"+
		"\u008f\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e9\u02eb\7E\2\2\u02ea\u02e9\3\2"+
		"\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ed\3\2\2\2\u02ec\u02ee\5N(\2\u02ed\u02ec"+
		"\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f0\5\u0092J"+
		"\2\u02f0\u0091\3\2\2\2\u02f1\u02f3\5\u009aN\2\u02f2\u02f4\5\u0094K\2\u02f3"+
		"\u02f2\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f9\3\2\2\2\u02f5\u02f6\5\u00a2"+
		"R\2\u02f6\u02f7\5\u0094K\2\u02f7\u02f9\3\2\2\2\u02f8\u02f1\3\2\2\2\u02f8"+
		"\u02f5\3\2\2\2\u02f9\u0093\3\2\2\2\u02fa\u02ff\5\u0084C\2\u02fb\u02fc"+
		"\7\4\2\2\u02fc\u02fe\5\u0084C\2\u02fd\u02fb\3\2\2\2\u02fe\u0301\3\2\2"+
		"\2\u02ff\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0302\3\2\2\2\u0301\u02ff"+
		"\3\2\2\2\u0302\u0303\7\3\2\2\u0303\u0095\3\2\2\2\u0304\u030a\5\b\5\2\u0305"+
		"\u0306\7X\2\2\u0306\u0307\5\u0098M\2\u0307\u0308\7Y\2\2\u0308\u030a\3"+
		"\2\2\2\u0309\u0304\3\2\2\2\u0309\u0305\3\2\2\2\u030a\u0097\3\2\2\2\u030b"+
		"\u0310\5\u0096L\2\u030c\u030d\7\4\2\2\u030d\u030f\5\u0096L\2\u030e\u030c"+
		"\3\2\2\2\u030f\u0312\3\2\2\2\u0310\u030e\3\2\2\2\u0310\u0311\3\2\2\2\u0311"+
		"\u0099\3\2\2\2\u0312\u0310\3\2\2\2\u0313\u0315\7V\2\2\u0314\u0316\5\u009c"+
		"O\2\u0315\u0314\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0318\3\2\2\2\u0317"+
		"\u0319\5\u009eP\2\u0318\u0317\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031a"+
		"\3\2\2\2\u031a\u031b\7X\2\2\u031b\u031c\bN\1\2\u031c\u009b\3\2\2\2\u031d"+
		"\u031e\5\u00b0Y\2\u031e\u009d\3\2\2\2\u031f\u0320\7\6\2\2\u0320\u0325"+
		"\5\u00a0Q\2\u0321\u0322\7\4\2\2\u0322\u0324\5\u00a0Q\2\u0323\u0321\3\2"+
		"\2\2\u0324\u0327\3\2\2\2\u0325\u0323\3\2\2\2\u0325\u0326\3\2\2\2\u0326"+
		"\u009f\3\2\2\2\u0327\u0325\3\2\2\2\u0328\u032a\7K\2\2\u0329\u0328\3\2"+
		"\2\2\u0329\u032a\3\2\2\2\u032a\u032c\3\2\2\2\u032b\u032d\5F$\2\u032c\u032b"+
		"\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u032f\5\u00b0Y"+
		"\2\u032f\u00a1\3\2\2\2\u0330\u0332\7J\2\2\u0331\u0330\3\2\2\2\u0332\u0335"+
		"\3\2\2\2\u0333\u0331\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0337\3\2\2\2\u0335"+
		"\u0333\3\2\2\2\u0336\u0338\t\30\2\2\u0337\u0336\3\2\2\2\u0337\u0338\3"+
		"\2\2\2\u0338\u0339\3\2\2\2\u0339\u033e\5\u00a4S\2\u033a\u033b\7\37\2\2"+
		"\u033b\u033c\5P)\2\u033c\u033d\7 \2\2\u033d\u033f\3\2\2\2\u033e\u033a"+
		"\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u034a\3\2\2\2\u0340\u0341\7\25\2\2"+
		"\u0341\u0346\5\u00a4S\2\u0342\u0343\7\37\2\2\u0343\u0344\5P)\2\u0344\u0345"+
		"\7 \2\2\u0345\u0347\3\2\2\2\u0346\u0342\3\2\2\2\u0346\u0347\3\2\2\2\u0347"+
		"\u0349\3\2\2\2\u0348\u0340\3\2\2\2\u0349\u034c\3\2\2\2\u034a\u0348\3\2"+
		"\2\2\u034a\u034b\3\2\2\2\u034b\u034e\3\2\2\2\u034c\u034a\3\2\2\2\u034d"+
		"\u034f\7J\2\2\u034e\u034d\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0353\3\2"+
		"\2\2\u0350\u0353\7G\2\2\u0351\u0353\7H\2\2\u0352\u0333\3\2\2\2\u0352\u0350"+
		"\3\2\2\2\u0352\u0351\3\2\2\2\u0353\u00a3\3\2\2\2\u0354\u0356\t\31\2\2"+
		"\u0355\u0354\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0355\3\2\2\2\u0357\u0358"+
		"\3\2\2\2\u0358\u00a5\3\2\2\2\u0359\u035b\t\32\2\2\u035a\u0359\3\2\2\2"+
		"\u035a\u035b\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035d\5\u00a2R\2\u035d"+
		"\u00a7\3\2\2\2\u035e\u035f\5\u00b0Y\2\u035f\u00a9\3\2\2\2\u0360\u0361"+
		"\7\23\2\2\u0361\u0362\7F\2\2\u0362\u0370\7\24\2\2\u0363\u036c\7\23\2\2"+
		"\u0364\u0369\5\u00acW\2\u0365\u0366\7\4\2\2\u0366\u0368\5\u00acW\2\u0367"+
		"\u0365\3\2\2\2\u0368\u036b\3\2\2\2\u0369\u0367\3\2\2\2\u0369\u036a\3\2"+
		"\2\2\u036a\u036d\3\2\2\2\u036b\u0369\3\2\2\2\u036c\u0364\3\2\2\2\u036c"+
		"\u036d\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u0370\7\24\2\2\u036f\u0360\3"+
		"\2\2\2\u036f\u0363\3\2\2\2\u0370\u00ab\3\2\2\2\u0371\u0372\5\u00a6T\2"+
		"\u0372\u0373\5\u00aeX\2\u0373\u00ad\3\2\2\2\u0374\u0376\5\u00b4[\2\u0375"+
		"\u0374\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u037e\3\2\2\2\u0377\u0378\7\23"+
		"\2\2\u0378\u0379\5\u00aeX\2\u0379\u037a\7\24\2\2\u037a\u037f\3\2\2\2\u037b"+
		"\u037d\5\u00a8U\2\u037c\u037b\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037f"+
		"\3\2\2\2\u037e\u0377\3\2\2\2\u037e\u037c\3\2\2\2\u037f\u0381\3\2\2\2\u0380"+
		"\u0382\5\u0088E\2\u0381\u0380\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u00af"+
		"\3\2\2\2\u0383\u0388\7W\2\2\u0384\u0385\7\25\2\2\u0385\u0387\7W\2\2\u0386"+
		"\u0384\3\2\2\2\u0387\u038a\3\2\2\2\u0388\u0386\3\2\2\2\u0388\u0389\3\2"+
		"\2\2\u0389\u038d\3\2\2\2\u038a\u0388\3\2\2\2\u038b\u038d\5F$\2\u038c\u0383"+
		"\3\2\2\2\u038c\u038b\3\2\2\2\u038d\u00b1\3\2\2\2\u038e\u038f\t\33\2\2"+
		"\u038f\u00b3\3\2\2\2\u0390\u0392\5D#\2\u0391\u0393\79\2\2\u0392\u0391"+
		"\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0395\3\2\2\2\u0394\u0390\3\2\2\2\u0395"+
		"\u0396\3\2\2\2\u0396\u0394\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u00b5\3\2"+
		"\2\2\u0398\u0399\5\u00b4[\2\u0399\u00b7\3\2\2\2l\u00bc\u00be\u00c9\u00cf"+
		"\u00d8\u00dd\u00e2\u00e7\u00ec\u00f1\u00f7\u00fd\u0102\u0107\u010c\u0117"+
		"\u0121\u0124\u012a\u012f\u0135\u0139\u0146\u014e\u0165\u016b\u0170\u0172"+
		"\u017a\u017d\u0187\u0198\u01c2\u01d6\u01d8\u01f1\u01f4\u01f9\u0200\u0208"+
		"\u020d\u0213\u0217\u021e\u0223\u0226\u022c\u0233\u0236\u0241\u0248\u024e"+
		"\u0259\u0263\u026c\u0271\u0277\u027c\u027f\u0283\u0286\u028e\u0295\u029a"+
		"\u02a9\u02ae\u02b3\u02b9\u02c8\u02cd\u02d2\u02d8\u02e1\u02e6\u02ea\u02ed"+
		"\u02f3\u02f8\u02ff\u0309\u0310\u0315\u0318\u0325\u0329\u032c\u0333\u0337"+
		"\u033e\u0346\u034a\u034e\u0352\u0357\u035a\u0369\u036c\u036f\u0375\u037c"+
		"\u037e\u0381\u0388\u038c\u0392\u0396";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}