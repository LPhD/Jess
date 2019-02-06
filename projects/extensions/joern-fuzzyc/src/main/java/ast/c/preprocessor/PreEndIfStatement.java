package ast.c.preprocessor;

import ast.expressions.Expression;
import ast.walking.ASTNodeVisitor;

public class PreEndIfStatement extends Expression {
	
	public void accept(ASTNodeVisitor visitor)	{
		visitor.visit(this);
	}

}
