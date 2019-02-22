package ast.c.preprocessor.commands;

import ast.c.preprocessor.PreStatement;
import ast.walking.ASTNodeVisitor;

/**
 * Placeholder class
 *
 */
public class PreCommand extends PreStatement{

	@Override
	public void accept(ASTNodeVisitor visitor) {
		visitor.visit(this);
	}


}
