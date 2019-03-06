package ast.c.preprocessor.blockstarter;

import ast.walking.ASTNodeVisitor;

public class PreElIfStatement extends PreElseStatement{

	private PreElseStatement elseNode = null;

//Add Connection to #if statement
	
	@Override
	public void accept(ASTNodeVisitor visitor) {
		visitor.visit(this);
	}
	
	public int getChildCount() {
		int childCount = super.getChildCount();

		if (getElseNode() != null || getEndIfNode() != null )
			childCount++;
		return childCount;
	}

	public PreElseStatement getElseNode() {
		return elseNode;
	}

	public void setElseNode(PreElseStatement elseNode) {
		this.elseNode = elseNode;
	}

}
