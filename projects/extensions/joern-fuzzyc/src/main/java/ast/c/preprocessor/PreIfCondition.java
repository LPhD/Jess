package ast.c.preprocessor;

import ast.logical.statements.Condition;
import ast.walking.ASTNodeVisitor;

public class PreIfCondition extends Condition{

	@Override
	public void accept(ASTNodeVisitor visitor) {
		visitor.visit(this);
	}

}
