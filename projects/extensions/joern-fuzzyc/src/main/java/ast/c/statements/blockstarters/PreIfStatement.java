package ast.c.statements.blockstarters;

import ast.ASTNode;
import ast.logical.statements.BlockStarterWithStmtAndCnd;
import ast.statements.blockstarters.IfStatementBase;
import ast.walking.ASTNodeVisitor;

public class PreIfStatement extends IfStatementBase {
	private PreElseStatement elseNode = null;
	private PreElIfStatement elifNode = null;

	public int getChildCount() {
		int childCount = super.getChildCount();

		if (getPreElseOrIfElseNode() != null) {
			childCount++;
		}
		return childCount;
	}

	//Is this correct?
	public ASTNode getChild(int i) {
		if (i == 0)
			// Can be an identifier
			return condition;
		else if (i == 1)
			return statement;
		else if (i == 2)
			return getPreElseOrIfElseNode();
		throw new RuntimeException("Invalid IfItem");
	}

	public BlockStarterWithStmtAndCnd getPreElseOrIfElseNode() {
		if (elifNode != null) {
			return elifNode;
		} else if (elseNode != null) {
			return elseNode;
		} else {
			return null;
		}
	}
	

	public void setPreElseNode(PreElseStatement elseNode) {
		this.elseNode = elseNode;
	}
	
	public void setPreElIfNode(PreElIfStatement elifNode) {
		this.elifNode = elifNode;
	}

	public void accept(ASTNodeVisitor visitor) {
		visitor.visit(this);
	}
}
