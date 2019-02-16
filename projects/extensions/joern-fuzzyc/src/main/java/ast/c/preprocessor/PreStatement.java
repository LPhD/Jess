package ast.c.preprocessor;

import ast.ASTNode;
import ast.logical.statements.BlockStarter;
import ast.logical.statements.Condition;
import ast.logical.statements.Statement;
import ast.walking.ASTNodeVisitor;

public class PreStatement extends BlockStarter {
	
	@Override
	public void addChild(ASTNode node)	{
		if (node instanceof Condition)
			setCondition((Condition) node);
		else if (node instanceof Statement)
			setStatement((Statement) node);
		else
			super.addChild(node);
	}
	
	@Override
	public void accept(ASTNodeVisitor visitor) {
		visitor.visit(this);
	}
	

}
