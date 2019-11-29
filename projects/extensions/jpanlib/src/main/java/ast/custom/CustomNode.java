package ast.custom;

import ast.ASTNode;
import ast.walking.ASTNodeVisitor;

public class CustomNode extends ASTNode {
	
	@Override
	public void accept(ASTNodeVisitor visitor) {
		visitor.visit(this);
	}
}
