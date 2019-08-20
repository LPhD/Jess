package ast.logical.statements;

import ast.walking.ASTNodeVisitor;

public class BlockCloser extends Statement {
	public String getEscapedCodeStr() {
		return "}";
	}
	
	@Override
	public void accept(ASTNodeVisitor visitor) {
		visitor.visit(this);
	}
}
