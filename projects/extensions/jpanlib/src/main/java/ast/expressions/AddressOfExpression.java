package ast.expressions;

import ast.walking.ASTNodeVisitor;

public class AddressOfExpression extends UnaryExpression
{
	public void accept(ASTNodeVisitor visitor)
	{
		visitor.visit(this);
	}

}
