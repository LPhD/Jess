package ast.c.preprocessor;

import ast.walking.ASTNodeVisitor;

public class PreElIfStatement extends PreIfStatement{

//Add Connection to #if statement
	
	public void accept(ASTNodeVisitor visitor)	{
		visitor.visit(this);
	}


}
