package ast.statements;

import ast.expressions.Expression;

public class ExpressionStatement extends ExpressionHolderStatement {

	@Override
	public String getEscapedCodeStr() {

		Expression expr = getExpression();
		if (expr == null)
			return "";

		return getCodeStr();
	}
}
