package ast.c.preprocessor.blockstarter;

import ast.ASTNode;
import ast.walking.ASTNodeVisitor;

public class PreIfStatement extends PreElseStatement {

	private PreElseStatement elseNode = null;
	private PreElIfStatement elIfNode = null;


	@Override
	public void accept(ASTNodeVisitor visitor) {
		visitor.visit(this);
	}

	public int getChildCount() {
		int childCount = super.getChildCount();

		if (getElseNode() != null || getElIfNode() != null || getEndIfNode() != null )
			childCount++;
		return childCount;
	}

	/**
	 * Returns child with index i
	 * 0 = condition
	 * 1 = statement
	 * 2 = else
	 * 3 = elIf
	 * 4 = endIf
	 */
	public ASTNode getChild(int i) {
		if (i == 0)
			return condition;
		else if (i == 1)
			return statement;
		else if (i == 2)
			return getElseNode();
		else if (i == 3)
			return getElIfNode();
		else if (i == 3)
			return getEndIfNode();
		throw new RuntimeException("Invalid IfItem");
	}

	public PreElseStatement getElseNode() {
		return elseNode;
	}

	public void setElseNode(PreElseStatement elseNode) {
		this.elseNode = elseNode;
	}
	
	public PreElIfStatement getElIfNode() {
		return elIfNode;
	}

	public void setElIfNode(PreElIfStatement elIfNode) {
		this.elIfNode = elIfNode;
	}

}
