package parsing.Functions;

import antlr.FunctionBaseListener;
import antlr.FunctionParser;
import antlr.FunctionParser.Function_pointer_use_expressionContext;
import parsing.ANTLRParserDriver;
import parsing.Functions.builder.FunctionContentBuilder;

/**
 * This is where hooks are registered for different types of parse tree nodes.
 */

public class CFunctionParseTreeListener extends FunctionBaseListener {
	ANTLRParserDriver p;

	public void setDriver(ANTLRParserDriver aP) {
		p = aP;
	}

	@Override
	public void enterStatements(FunctionParser.StatementsContext ctx) {
		FunctionContentBuilder builder = new FunctionContentBuilder();
		builder.createNew(ctx);
		p.builderStack.push(builder);
	}

	@Override
	public void exitStatements(FunctionParser.StatementsContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitStatements(ctx);
	}

	@Override
	public void enterStatement(FunctionParser.StatementContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterStatement(ctx);
	}

	@Override
	public void exitStatement(FunctionParser.StatementContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitStatement(ctx);
	}

	@Override
	public void enterNewline(FunctionParser.NewlineContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterNewline(ctx);
	}
	
	@Override
	public void enterWater(FunctionParser.WaterContext ctx) {
		if(ctx.getText().equals(";")) {
			System.out.println("Found irrelevant water: "+ctx.start);
		} else {
			System.out.println("Found water: "+ctx.getText()+ " in line "+(ctx.start.getLine() - 1)+" of its parent function");
		}
	}

	@Override
	public void enterElse_statement(FunctionParser.Else_statementContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterElse(ctx);
	}

	@Override
	public void enterIf_statement(FunctionParser.If_statementContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterIf(ctx);
	}

//----------------------------------Preprocessor macro handling--------------------------------------------------------------	
	// Preprocessor handling
	@Override
	public void enterPre_define(FunctionParser.Pre_defineContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterPreDefine(ctx);
	}
	
	
	// Preprocessor handling (technically this is an expression)
	@Override
	public void enterMacroCall(FunctionParser.MacroCallContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterMacroCall(ctx);
	}
	
	// Preprocessor handling
	@Override
	public void exitMacroCall(FunctionParser.MacroCallContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitMacroCall(ctx);
	}

	// Preprocessor handling
	@Override
	public void enterPre_macro(FunctionParser.Pre_macroContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterPreMacro(ctx);
	}

	// Preprocessor handling
	@Override
	public void exitPre_macro(FunctionParser.Pre_macroContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitPreMacro(ctx);
	}
	

	// Preprocessor handling
	@Override
	public void enterPre_macro_identifier(FunctionParser.Pre_macro_identifierContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterPreMacroIdentifier(ctx);
	}

	// Preprocessor handling
	@Override
	public void exitPre_macro_identifier(FunctionParser.Pre_macro_identifierContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitPreMacroIdentifier(ctx);
	}

	// Preprocessor handling
	@Override
	public void enterPre_macro_parameters(FunctionParser.Pre_macro_parametersContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterPreMacroParameters(ctx);
	}

	// Preprocessor handling
	@Override
	public void exitPre_macro_parameters(FunctionParser.Pre_macro_parametersContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitPreMacroParameters(ctx);
	}

	// Preprocessor handling
	@Override
	public void enterPre_undef(FunctionParser.Pre_undefContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterPreUndef(ctx);
	}

//----------------------------------Preprocessor command handling--------------------------------------------------------------	

	// Preprocessor handling
	@Override
	public void enterPre_diagnostic(FunctionParser.Pre_diagnosticContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterPreDiagnostic(ctx);
	}

	// Preprocessor handling
	@Override
	public void enterPre_include(FunctionParser.Pre_includeContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterPreInclude(ctx);
	}

	// Preprocessor handling
	@Override
	public void enterPre_include_next(FunctionParser.Pre_include_nextContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterPreIncludeNext(ctx);
	}

	// Preprocessor handling
	@Override
	public void enterPre_line(FunctionParser.Pre_lineContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterPreLine(ctx);
	}

	// Preprocessor handling
	@Override
	public void enterPre_other(FunctionParser.Pre_otherContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterPreOther(ctx);
	}

	// Preprocessor handling
	@Override
	public void exitPre_other(FunctionParser.Pre_otherContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitPreOther(ctx);
	}
	
	// Preprocessor handling
	@Override
	public void enterPre_pragma(FunctionParser.Pre_pragmaContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterPrePragma(ctx);
	}

	// Preprocessor handling
	@Override
	public void enterPre_include_filename(FunctionParser.Pre_include_filenameContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterPreIncludeFilename(ctx);
	}

	// Preprocessor handling
	@Override
	public void exitPre_include_filename(FunctionParser.Pre_include_filenameContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitPreIncludeFilename(ctx);
	}

	// Preprocessor handling
	@Override
	public void enterPre_include_local_file(FunctionParser.Pre_include_local_fileContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterPreIncludeLocalFile(ctx);
	}

	// Preprocessor handling
	@Override
	public void exitPre_include_local_file(FunctionParser.Pre_include_local_fileContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitPreIncludeLocalFile(ctx);
	}

//----------------------------------Preprocessor blockstarter handling------------------------------------------------------	

	// Preprocessor handling
	@Override
	public void enterPre_else_statement(FunctionParser.Pre_else_statementContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterPreElse(ctx);
	}

	// Preprocessor handling
	@Override
	public void enterPre_elif_statement(FunctionParser.Pre_elif_statementContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterPreElIf(ctx);
	}
	
	// Preprocessor if handling
	@Override
	public void enterPre_if_statement(FunctionParser.Pre_if_statementContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterPreIf(ctx);
	}

	// Preprocessor if handling
	@Override
	public void enterPre_endif_statement(FunctionParser.Pre_endif_statementContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterPreEndIf(ctx);
	}

	@Override
	public void enterPre_if_condition(FunctionParser.Pre_if_conditionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterPreIfCondition(ctx);
	}

	@Override
	public void exitPre_if_condition(FunctionParser.Pre_if_conditionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitPreIfConditionn(ctx);
	}
	
//--------------------------------------Preprocessor Fragments------------------------------------------------------------------------
	

	// Preprocessor fragment handling
	@Override
	public void enterPreprocessor_fragment(FunctionParser.Preprocessor_fragmentContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterPreFragment(ctx);
	}
	

//--------------------------------------Comments------------------------------------------------------------------------
	@Override
	public void enterComment(FunctionParser.CommentContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterComment(ctx);
	}
	
//----------------------------------------------------------------------------------------------------------------------
//--------------------------------------Custom------------------------------------------------------------------------
		@Override
		public void enterCustom(FunctionParser.CustomContext ctx) {
			FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
			builder.enterCustom(ctx);
		}
		
		@Override
		public void exitCustom(FunctionParser.CustomContext ctx) {
			FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
			builder.exitCustom(ctx);
		}
		
//----------------------------------------------------------------------------------------------------------------------	
	
	
	@Override
	public void enterFor_statement(FunctionParser.For_statementContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterFor(ctx);
	}

	@Override
	public void enterFor_init_statement(FunctionParser.For_init_statementContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterInitFor(ctx);
	}

	@Override
	public void exitFor_init_statement(FunctionParser.For_init_statementContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitInitFor(ctx);
	}

	@Override
	public void enterWhile_statement(FunctionParser.While_statementContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterWhile(ctx);
	}

	@Override
	public void enterDo_statement(FunctionParser.Do_statementContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterDo(ctx);
	}

	@Override
	public void enterSwitch_statement(FunctionParser.Switch_statementContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterSwitchStatement(ctx);
	}

	@Override
	public void enterLabel(FunctionParser.LabelContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterLabel(ctx);
	}

	@Override
	public void enterTry_statement(FunctionParser.Try_statementContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterTryStatement(ctx);
	}

	@Override
	public void enterCatch_statement(FunctionParser.Catch_statementContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterCatchStatement(ctx);
	}

	@Override
	public void enterBlock_starter(FunctionParser.Block_starterContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterBlockStarter(ctx);
	}

	@Override
	public void enterOpening_curly(FunctionParser.Opening_curlyContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterOpeningCurly(ctx);
	}

	@Override
	public void enterClosing_curly(FunctionParser.Closing_curlyContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterClosingCurly(ctx);
	}

	@Override
	public void enterExpr_statement(FunctionParser.Expr_statementContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterExprStatement(ctx);
	}

	@Override
	public void enterReturnStatement(FunctionParser.ReturnStatementContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterReturnStatement(ctx);
	}

	@Override
	public void enterBreakStatement(FunctionParser.BreakStatementContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterBreakStatement(ctx);
	}

	@Override
	public void enterContinueStatement(FunctionParser.ContinueStatementContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterContinueStatement(ctx);
	}

	@Override
	public void enterGotoStatement(FunctionParser.GotoStatementContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterGotoStatement(ctx);
	}

	@Override
	public void enterDeclByType(FunctionParser.DeclByTypeContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterDeclByType(ctx, ctx.type_name());
	}

	@Override
	public void exitDeclByType(FunctionParser.DeclByTypeContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitDeclByType();
	}
	
	@Override
	public void enterStructUnionEnum (FunctionParser.StructUnionEnumContext ctx){
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterStructUnionEnum(ctx);
	}

	@Override
	public void exitStructUnionEnum(FunctionParser.StructUnionEnumContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitStructUnionEnum();
	}
	
	@Override
	public void enterFunctionPointerDeclare(FunctionParser.FunctionPointerDeclareContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterFunctionPointerDeclare(ctx);
	}

	@Override
	public void exitFunctionPointerDeclare(FunctionParser.FunctionPointerDeclareContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitFunctionPointerDeclare();
	}


	@Override
	public void enterInitDeclSimple(FunctionParser.InitDeclSimpleContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterInitDeclSimple(ctx);
	}

	@Override
	public void exitInitDeclSimple(FunctionParser.InitDeclSimpleContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitInitDeclSimple();
	}

	@Override
	public void enterInitDeclWithAssign(FunctionParser.InitDeclWithAssignContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterInitDeclWithAssign(ctx);
	}

	@Override
	public void exitInitDeclWithAssign(FunctionParser.InitDeclWithAssignContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitInitDeclWithAssign(ctx);
	}

	@Override
	public void enterInitDeclWithCall(FunctionParser.InitDeclWithCallContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterInitDeclWithCall(ctx);
	}

	@Override
	public void exitInitDeclWithCall(FunctionParser.InitDeclWithCallContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitInitDeclWithCall();
	}

	@Override
	public void enterCondition(FunctionParser.ConditionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterCondition(ctx);
	}

	@Override
	public void exitCondition(FunctionParser.ConditionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitCondition(ctx);
	}

	@Override
	public void enterExpr(FunctionParser.ExprContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterExpression(ctx);
	}

	@Override
	public void exitExpr(FunctionParser.ExprContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitExpression(ctx);
	}

	@Override
	public void enterAssign_expr(FunctionParser.Assign_exprContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterAssignment(ctx);
	}

	@Override
	public void exitAssign_expr(FunctionParser.Assign_exprContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitAssignment(ctx);
	}

	@Override
	public void enterCndExpr(FunctionParser.CndExprContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterConditionalExpr(ctx);

	}

	@Override
	public void exitCndExpr(FunctionParser.CndExprContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitConditionalExpr(ctx);
	}

	@Override
	public void enterOr_expression(FunctionParser.Or_expressionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterOrExpression(ctx);
	}

	@Override
	public void exitOr_expression(FunctionParser.Or_expressionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitrOrExpression(ctx);
	}

	@Override
	public void enterAnd_expression(FunctionParser.And_expressionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterAndExpression(ctx);
	}

	@Override
	public void exitAnd_expression(FunctionParser.And_expressionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitAndExpression(ctx);
	}

	@Override
	public void enterInclusive_or_expression(FunctionParser.Inclusive_or_expressionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterInclusiveOrExpression(ctx);
	}

	@Override
	public void exitInclusive_or_expression(FunctionParser.Inclusive_or_expressionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitInclusiveOrExpression(ctx);
	}

	@Override
	public void enterExclusive_or_expression(FunctionParser.Exclusive_or_expressionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterExclusiveOrExpression(ctx);
	}

	@Override
	public void exitExclusive_or_expression(FunctionParser.Exclusive_or_expressionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitExclusiveOrExpression(ctx);
	}

	@Override
	public void enterBit_and_expression(FunctionParser.Bit_and_expressionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterBitAndExpression(ctx);
	}

	@Override
	public void exitBit_and_expression(FunctionParser.Bit_and_expressionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitBitAndExpression(ctx);
	}

	@Override
	public void enterEquality_expression(FunctionParser.Equality_expressionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterEqualityExpression(ctx);
	}

	@Override
	public void exitEquality_expression(FunctionParser.Equality_expressionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitEqualityExpression(ctx);
	}

	@Override
	public void enterRelational_expression(FunctionParser.Relational_expressionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterRelationalExpression(ctx);
	}

	@Override
	public void exitRelational_expression(FunctionParser.Relational_expressionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitRelationalExpression(ctx);
	}

	@Override
	public void enterShift_expression(FunctionParser.Shift_expressionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterShiftExpression(ctx);
	}

	@Override
	public void exitShift_expression(FunctionParser.Shift_expressionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitShiftExpression(ctx);
	}

	@Override
	public void enterAdditive_expression(FunctionParser.Additive_expressionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterAdditiveExpression(ctx);
	}

	@Override
	public void exitAdditive_expression(FunctionParser.Additive_expressionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitAdditiveExpression(ctx);
	}

	@Override
	public void enterMultiplicative_expression(FunctionParser.Multiplicative_expressionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterMultiplicativeExpression(ctx);
	}

	@Override
	public void exitMultiplicative_expression(FunctionParser.Multiplicative_expressionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitMultiplicativeExpression(ctx);
	}

	@Override
	public void enterCast_expression(FunctionParser.Cast_expressionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterCastExpression(ctx);
	}

	@Override
	public void exitCast_expression(FunctionParser.Cast_expressionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitCastExpression(ctx);
	}

	@Override
	public void enterCast_target(FunctionParser.Cast_targetContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterCast_target(ctx);
	}

	@Override
	public void exitCast_target(FunctionParser.Cast_targetContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitCast_target(ctx);
	}
	
	@Override
	public void enterFunction_pointer_use_expression(Function_pointer_use_expressionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterFunctionPointerUse(ctx);
	}

	@Override
	public void exitFunction_pointer_use_expression(Function_pointer_use_expressionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitFunctionPointerUse(ctx);
	}

	@Override
	public void enterFuncCall(FunctionParser.FuncCallContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterFuncCall(ctx);
	}

	@Override
	public void exitFuncCall(FunctionParser.FuncCallContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitFuncCall(ctx);
	}

	@Override
	public void enterSizeof_expression(FunctionParser.Sizeof_expressionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterSizeofExpr(ctx);
	}

	@Override
	public void exitSizeof_expression(FunctionParser.Sizeof_expressionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitSizeofExpr(ctx);
	}

	@Override
	public void enterSizeof(FunctionParser.SizeofContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterSizeof(ctx);
	}

	@Override
	public void exitSizeof(FunctionParser.SizeofContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitSizeof(ctx);
	}

	@Override
	public void enterUnary_op_and_cast_expr(FunctionParser.Unary_op_and_cast_exprContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterUnaryOpAndCastExpr(ctx);
	}

	@Override
	public void exitUnary_op_and_cast_expr(FunctionParser.Unary_op_and_cast_exprContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitUnaryOpAndCastExpr(ctx);
	}
	
	@Override
	public void enterAddress_of_expression(FunctionParser.Address_of_expressionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterAddress_of_expression(ctx);
	}

	@Override
	public void exitAddress_of_expression(FunctionParser.Address_of_expressionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitAddress_of_expression(ctx);
	}

	@Override
	public void enterUnary_operator(FunctionParser.Unary_operatorContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterUnaryOperator(ctx);
	}

	@Override
	public void exitUnary_operator(FunctionParser.Unary_operatorContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitUnaryOperator(ctx);
	}


	@Override
	public void enterInc_dec(FunctionParser.Inc_decContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterIncDec(ctx);
	}

	@Override
	public void exitInc_dec(FunctionParser.Inc_decContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitIncDec(ctx);
	}

	@Override
	public void enterArrayIndexing(FunctionParser.ArrayIndexingContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterArrayIndexing(ctx);
	}

	@Override
	public void exitArrayIndexing(FunctionParser.ArrayIndexingContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitArrayIndexing(ctx);
	}

	@Override
	public void enterMemberAccess(FunctionParser.MemberAccessContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterMemberAccess(ctx);
	}

	@Override
	public void exitMemberAccess(FunctionParser.MemberAccessContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitMemberAccess(ctx);
	}

	@Override
	public void enterPtrMemberAccess(FunctionParser.PtrMemberAccessContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterPtrMemberAccess(ctx);
	}

	@Override
	public void exitPtrMemberAccess(FunctionParser.PtrMemberAccessContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitPtrMemberAccess(ctx);
	}

	@Override
	public void enterIncDecOp(FunctionParser.IncDecOpContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterIncDecOp(ctx);
	}

	@Override
	public void exitIncDecOp(FunctionParser.IncDecOpContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitIncDecOp(ctx);
	}

	@Override
	public void enterPrimary_expression(FunctionParser.Primary_expressionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterPrimary(ctx);
	}

	@Override
	public void exitPrimary_expression(FunctionParser.Primary_expressionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitPrimary(ctx);
	}
	
	@Override
	public void enterNull_expression(FunctionParser.Null_expressionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterNullExpression(ctx);
	}

	@Override
	public void exitNull_expression(FunctionParser.Null_expressionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitNullExpression(ctx);
	}

	@Override
	public void enterUnary_expression(FunctionParser.Unary_expressionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterUnaryExpression(ctx);
	}

	@Override
	public void exitUnary_expression(FunctionParser.Unary_expressionContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitUnaryExpression(ctx);
	}

	@Override
	public void enterIdentifier(FunctionParser.IdentifierContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterIdentifier(ctx);
	}

	@Override
	public void exitIdentifier(FunctionParser.IdentifierContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitIdentifier(ctx);
	}

	@Override
	public void enterArgument_list(FunctionParser.Argument_listContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterArgumentList(ctx);
	}

	@Override
	public void exitArgument_list(FunctionParser.Argument_listContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitArgumentList(ctx);
	}
	
	@Override
	public void enterArgument(FunctionParser.ArgumentContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterArgument(ctx);
	}

	@Override
	public void exitArgument(FunctionParser.ArgumentContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitArgument(ctx);
	}

	@Override
	public void enterSizeof_operand2(FunctionParser.Sizeof_operand2Context ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterSizeofOperand2(ctx);
	}

	@Override
	public void exitSizeof_operand2(FunctionParser.Sizeof_operand2Context ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitSizeofOperand2(ctx);
	}

	@Override
	public void enterSizeof_operand(FunctionParser.Sizeof_operandContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterSizeofOperand(ctx);
	}

	@Override
	public void exitSizeof_operand(FunctionParser.Sizeof_operandContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.exitSizeofOperand(ctx);
	}

	@Override
	public void enterThrowStatement(FunctionParser.ThrowStatementContext ctx) {
		FunctionContentBuilder builder = (FunctionContentBuilder) p.builderStack.peek();
		builder.enterThrowStatement(ctx);
	}

}