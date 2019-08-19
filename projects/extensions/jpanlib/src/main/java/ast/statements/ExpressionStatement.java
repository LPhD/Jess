package ast.statements;

import ast.expressions.Expression;

public class ExpressionStatement extends ExpressionHolderStatement {

	@Override
	public String getEscapedCodeStr() {

		Expression expr = getExpression();
		if (expr == null)
			return "";

		//Add semicolon in the end to preserve syntactic correctness
		setCodeStr(expr.getEscapedCodeStr()+";");
		return getCodeStr();
	}
}
