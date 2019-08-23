package ast;

import java.util.LinkedList;

public class Comment extends ASTNode {

	protected LinkedList<ASTNode> commentees;
	
	public void addCommentee(ASTNode node) {
		if (commentees == null)
			commentees = new LinkedList<ASTNode>();
		commentees.add(node);
	}
	
	public int getCommenteeCount() {
		if (commentees == null)
			return 0;
		return commentees.size();
	}
	
	public ASTNode getCommentee(int i) {
		if (commentees == null)
			return null;

		ASTNode retval;
		try {
			retval = commentees.get(i);
		} catch (IndexOutOfBoundsException ex) {
			return null;
		}
		return retval;
	}
	
}
