package ast.c.preprocessor.blockstarter;

import ast.c.preprocessor.PreStatement;
import ast.walking.ASTNodeVisitor;

public class PreIfStatement extends PreStatement {
		
	
	@Override
	public void accept(ASTNodeVisitor visitor) {
		visitor.visit(this);
	}

}
