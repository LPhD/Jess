package ast.c.preprocessor;

import ast.walking.ASTNodeVisitor;

public class PreIfStatement extends PreStatement {
		
	
	public void accept(ASTNodeVisitor visitor)	{
		visitor.visit(this);
	}


}
