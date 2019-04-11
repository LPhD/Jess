package ast.c.preprocessor.blockstarter;

import ast.preprocessor.PreBlockstarter;
import ast.walking.ASTNodeVisitor;

public class PreEndIfStatement extends PreBlockstarter {
	
	@Override
	public void accept(ASTNodeVisitor visitor) {
		visitor.visit(this);
	}

}
