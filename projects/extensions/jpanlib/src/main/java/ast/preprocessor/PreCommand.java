package ast.preprocessor;

import ast.walking.ASTNodeVisitor;

/**
 * Placeholder class
 *
 */
public class PreCommand extends PreStatementBase{

	@Override
	public void accept(ASTNodeVisitor visitor) {
		visitor.visit(this);
	}


}
