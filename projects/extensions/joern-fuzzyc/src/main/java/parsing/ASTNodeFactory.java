package parsing;

import org.antlr.v4.runtime.ParserRuleContext;

import antlr.FunctionParser.InitDeclWithAssignContext;
import antlr.FunctionParser.StatementContext;
import antlr.ModuleParser.Parameter_declContext;
import antlr.ModuleParser.Parameter_idContext;
import antlr.ModuleParser.Parameter_nameContext;
import ast.ASTNode;
import ast.Comment;
import ast.c.functionDef.Parameter;
import ast.c.functionDef.ParameterType;
import ast.expressions.AssignmentExpression;
import ast.expressions.BinaryExpression;
import ast.expressions.Expression;
import ast.expressions.Identifier;
import ast.logical.statements.CompoundStatement;
import ast.logical.statements.Statement;
import ast.statements.blockstarters.IfStatementBase;

public class ASTNodeFactory {
	public static void initializeFromContext(ASTNode node, ParserRuleContext ctx) {
		if (ctx == null)
			return;
		
		//We can not set the path here, only the line?
		node.setLine(ctx.start.getLine());
		node.setCharAtLine(ctx.start.getCharPositionInLine());
		node.setCodeStr(ParseTreeUtils.childTokenString(ctx));
		
		if(node instanceof IfStatementBase) {
			System.out.println("If with line: "+node.getLine()+ " and code: "+node.getEscapedCodeStr());
		}
		
		if(node instanceof CompoundStatement) {
			System.out.println("Compound with line: "+node.getLine());
		}
	}
	
	/**
	 * Separate function for comments to remove line breaks from the code (they were just needed for detecting the end of the comment)
	 */
	public static void initializeFromContext(Comment node, ParserRuleContext ctx) {
		if (ctx == null)
			return;
		
		node.setLine(ctx.start.getLine());
		node.setCharAtLine(ctx.start.getCharPositionInLine());
		String code = ParseTreeUtils.childTokenString(ctx);
		//Single line comment
		if (code.startsWith("//")) {
			//Remove newline characters at the end of the comment
			code  = code.replace("\n", "");
			code  = code.replace("\r", "");
			code  = code.replace("\t", "");			
		}
		node.setCodeStr(code);
	}

	public static void initializeFromContext(Expression node, ParserRuleContext ctx) {
		initializeFromContext((ASTNode) node, ctx);
		if (node instanceof BinaryExpression && ctx.getChildCount() == 3)
			node.setOperator(ctx.getChild(1).getText());
	}

	public static ASTNode create(StatementContext ctx) {
		ASTNode node = new Statement();
		initializeFromContext(node, ctx);
		return node;
	}


	public static AssignmentExpression create(InitDeclWithAssignContext ctx) {
		AssignmentExpression assign = new AssignmentExpression();
		initializeFromContext(assign, ctx);
		if (ctx.getChildCount() == 3)
			assign.setOperator(ctx.getChild(1).getText());

		return assign;
	}

	public static Parameter create(Parameter_declContext ctx) {
		Parameter param = new Parameter();

		Parameter_declContext paramCtx = ctx;	
		Parameter_nameContext paramName = getNameOfParameter(paramCtx);

		Identifier name = new Identifier();
		ParameterType type = new ParameterType();
		initializeFromContext(type, ctx);
		initializeFromContext(name, paramName);
		initializeFromContext(param, ctx);

		param.addChild(type);
		param.addChild(name);

		return param;
	}
	
	/**
	 * Special creator for void parameters (C only)
	 * @param ctx
	 * @return
	 */
	public static Parameter createVoid(Parameter_declContext ctx) {
		Parameter param = new Parameter();
		param.isVoid = true;
		initializeFromContext(param, ctx);
		return param;
	}

	private static Parameter_nameContext getNameOfParameter(Parameter_declContext param_ctx) {
		Parameter_idContext parameter_id = param_ctx.parameter_id();

		while (parameter_id.parameter_name() == null) {
			parameter_id = parameter_id.parameter_id();
		}
		return parameter_id.parameter_name();
	}

}
