package ast;

import ast.walking.ASTNodeVisitor;

public class Comment extends ASTNode {

	protected ASTNode commentee;
	
	public void setCommentee(ASTNode node) {
		this.commentee = node;
	}
	
	
	public ASTNode getCommentee() {
		return commentee;
	}
	
	public void accept(ASTNodeVisitor visitor) {
		visitor.visit(this);
	}
}
