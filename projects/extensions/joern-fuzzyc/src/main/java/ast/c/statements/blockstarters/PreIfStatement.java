package ast.c.statements.blockstarters;

import ast.ASTNode;
import ast.statements.blockstarters.IfStatementBase;
import ast.walking.ASTNodeVisitor;

public class PreIfStatement extends IfStatementBase
{
	private PreElseStatement elseNode = null;

	public int getChildCount()
	{
		int childCount = super.getChildCount();

		if (getPreElseNode() != null)
			childCount++;
		return childCount;
	}

	public ASTNode getChild(int i)
	{
		if (i == 0)
			//Can be an identifier
			return condition;
		else if (i == 1)
			return statement;
		else if (i == 2)
			return getPreElseNode();
		throw new RuntimeException("Invalid IfItem");
	}

	public PreElseStatement getPreElseNode()
	{
		return elseNode;
	}

	//TODO Add preprocessor else
	public void setPreElseNode(PreElseStatement elseNode)
	{
		this.elseNode = elseNode;
	}

	public void accept(ASTNodeVisitor visitor)
	{
		visitor.visit(this);
	}
}
