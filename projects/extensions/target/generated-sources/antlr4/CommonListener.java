// Generated from Common.g4 by ANTLR 4.4

  import java.util.Stack;
  import java.util.EmptyStackException;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CommonParser}.
 */
public interface CommonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CommonParser#template_param_list}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_param_list(@NotNull CommonParser.Template_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#template_param_list}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_param_list(@NotNull CommonParser.Template_param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(@NotNull CommonParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(@NotNull CommonParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull CommonParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull CommonParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#no_brackets_curlies_or_squares}.
	 * @param ctx the parse tree
	 */
	void enterNo_brackets_curlies_or_squares(@NotNull CommonParser.No_brackets_curlies_or_squaresContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#no_brackets_curlies_or_squares}.
	 * @param ctx the parse tree
	 */
	void exitNo_brackets_curlies_or_squares(@NotNull CommonParser.No_brackets_curlies_or_squaresContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#no_brackets_or_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterNo_brackets_or_semicolon(@NotNull CommonParser.No_brackets_or_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#no_brackets_or_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitNo_brackets_or_semicolon(@NotNull CommonParser.No_brackets_or_semicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#no_angle_brackets_or_brackets}.
	 * @param ctx the parse tree
	 */
	void enterNo_angle_brackets_or_brackets(@NotNull CommonParser.No_angle_brackets_or_bracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#no_angle_brackets_or_brackets}.
	 * @param ctx the parse tree
	 */
	void exitNo_angle_brackets_or_brackets(@NotNull CommonParser.No_angle_brackets_or_bracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#ptr_operator}.
	 * @param ctx the parse tree
	 */
	void enterPtr_operator(@NotNull CommonParser.Ptr_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#ptr_operator}.
	 * @param ctx the parse tree
	 */
	void exitPtr_operator(@NotNull CommonParser.Ptr_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#no_squares_or_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterNo_squares_or_semicolon(@NotNull CommonParser.No_squares_or_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#no_squares_or_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitNo_squares_or_semicolon(@NotNull CommonParser.No_squares_or_semicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#assign_water_l2}.
	 * @param ctx the parse tree
	 */
	void enterAssign_water_l2(@NotNull CommonParser.Assign_water_l2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#assign_water_l2}.
	 * @param ctx the parse tree
	 */
	void exitAssign_water_l2(@NotNull CommonParser.Assign_water_l2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void enterRelational_operator(@NotNull CommonParser.Relational_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void exitRelational_operator(@NotNull CommonParser.Relational_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#equality_operator}.
	 * @param ctx the parse tree
	 */
	void enterEquality_operator(@NotNull CommonParser.Equality_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#equality_operator}.
	 * @param ctx the parse tree
	 */
	void exitEquality_operator(@NotNull CommonParser.Equality_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#no_comma_or_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterNo_comma_or_semicolon(@NotNull CommonParser.No_comma_or_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#no_comma_or_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitNo_comma_or_semicolon(@NotNull CommonParser.No_comma_or_semicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#water}.
	 * @param ctx the parse tree
	 */
	void enterWater(@NotNull CommonParser.WaterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#water}.
	 * @param ctx the parse tree
	 */
	void exitWater(@NotNull CommonParser.WaterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(@NotNull CommonParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(@NotNull CommonParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#no_brackets}.
	 * @param ctx the parse tree
	 */
	void enterNo_brackets(@NotNull CommonParser.No_bracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#no_brackets}.
	 * @param ctx the parse tree
	 */
	void exitNo_brackets(@NotNull CommonParser.No_bracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#no_squares}.
	 * @param ctx the parse tree
	 */
	void enterNo_squares(@NotNull CommonParser.No_squaresContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#no_squares}.
	 * @param ctx the parse tree
	 */
	void exitNo_squares(@NotNull CommonParser.No_squaresContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#newline}.
	 * @param ctx the parse tree
	 */
	void enterNewline(@NotNull CommonParser.NewlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#newline}.
	 * @param ctx the parse tree
	 */
	void exitNewline(@NotNull CommonParser.NewlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#template_decl_start}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_decl_start(@NotNull CommonParser.Template_decl_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#template_decl_start}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_decl_start(@NotNull CommonParser.Template_decl_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#function_decl_specifiers}.
	 * @param ctx the parse tree
	 */
	void enterFunction_decl_specifiers(@NotNull CommonParser.Function_decl_specifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#function_decl_specifiers}.
	 * @param ctx the parse tree
	 */
	void exitFunction_decl_specifiers(@NotNull CommonParser.Function_decl_specifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(@NotNull CommonParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(@NotNull CommonParser.Assignment_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#access_specifier}.
	 * @param ctx the parse tree
	 */
	void enterAccess_specifier(@NotNull CommonParser.Access_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#access_specifier}.
	 * @param ctx the parse tree
	 */
	void exitAccess_specifier(@NotNull CommonParser.Access_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#no_curlies}.
	 * @param ctx the parse tree
	 */
	void enterNo_curlies(@NotNull CommonParser.No_curliesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#no_curlies}.
	 * @param ctx the parse tree
	 */
	void exitNo_curlies(@NotNull CommonParser.No_curliesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommonParser#assign_water}.
	 * @param ctx the parse tree
	 */
	void enterAssign_water(@NotNull CommonParser.Assign_waterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#assign_water}.
	 * @param ctx the parse tree
	 */
	void exitAssign_water(@NotNull CommonParser.Assign_waterContext ctx);
}