package ast.c.preprocessor;

import ast.walking.ASTNodeVisitor;

public class PreElseStatement extends PreStatement {

	
	@Override
	public void accept(ASTNodeVisitor visitor) {
		visitor.visit(this);
	}


}
