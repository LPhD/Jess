package ast.functionDef;

import ast.ASTNode;
import ast.walking.ASTNodeVisitor;

public abstract class ParameterBase extends ASTNode {
	public Boolean isVoid = false;
	
	public abstract ASTNode getType();
	public abstract String getName();

	@Override
	public void accept(ASTNodeVisitor visitor) {
		visitor.visit(this);
	}
}
