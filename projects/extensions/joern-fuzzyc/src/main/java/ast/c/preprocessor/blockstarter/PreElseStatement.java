package ast.c.preprocessor.blockstarter;

import ast.c.preprocessor.PreStatement;
import ast.walking.ASTNodeVisitor;

public class PreElseStatement extends PreStatement {

	
	@Override
	public void accept(ASTNodeVisitor visitor) {
		visitor.visit(this);
	}


}
