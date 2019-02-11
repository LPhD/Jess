package ast.c.preprocessor;

import ast.walking.ASTNodeVisitor;

public class PreEndIfStatement extends PreStatement {
	
	public void accept(ASTNodeVisitor visitor)	{
		visitor.visit(this);
	}

}
