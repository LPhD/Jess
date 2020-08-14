package ast.expressions;

import ast.statements.ExpressionHolder;
import ast.walking.ASTNodeVisitor;

public class AddressOfExpression extends ExpressionHolder {
	public void accept(ASTNodeVisitor visitor) {
		visitor.visit(this);
	}

}
