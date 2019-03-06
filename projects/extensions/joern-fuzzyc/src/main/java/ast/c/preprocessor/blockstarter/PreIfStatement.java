package ast.c.preprocessor.blockstarter;

import ast.walking.ASTNodeVisitor;

public class PreIfStatement extends PreElIfStatement {

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

//	/**
//	 * Returns child with index i
//	 * 0 = condition
//	 * 1 = statement
//	 * 2 = else
//	 * 3 = elIf
//	 * 4 = endIf
//	 */
//	public ASTNode getChild(int i) {
//		if (i == 0)
//			return condition;
//		else if (i == 1)
//			return statement;
//		else if (i == 2)
//			return getElseNode();
//		else if (i == 3)
//			return getElIfNode();
//		else if (i == 3)
//			return getEndIfNode();
//		throw new RuntimeException("Invalid IfItem");
//	}
	
	public PreElIfStatement getElIfNode() {
		return elIfNode;
	}

	public void setElIfNode(PreElIfStatement elIfNode) {
		this.elIfNode = elIfNode;
	}

}
