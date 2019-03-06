package ast.c.preprocessor.blockstarter;

import ast.walking.ASTNodeVisitor;

public class PreElseStatement extends PreBlockstarter {
	
	private PreEndIfStatement endIfNode = null;
	
	@Override
	public void accept(ASTNodeVisitor visitor) {
		visitor.visit(this);
	}
	
	public int getChildCount() {
		int childCount = super.getChildCount();

		if (getEndIfNode() != null )
			childCount++;
		return childCount;
	}
	
//	/**
//	 * Returns child with index i
//	 * 0 = condition
//	 * 1 = statement
//	 * 4 = endIf
//	 */
//	public ASTNode getChild(int i) {
//		if (i == 0)
//			return condition;
//		else if (i == 1)
//			return statement;
//		else if (i == 4)
//			return getEndIfNode();
//		throw new RuntimeException("Invalid IfItem");
//	}

	public PreEndIfStatement getEndIfNode() {
		return endIfNode;
	}

	public void setEndIfNode(PreEndIfStatement endIfNode) {
		this.endIfNode = endIfNode;
	}
}
