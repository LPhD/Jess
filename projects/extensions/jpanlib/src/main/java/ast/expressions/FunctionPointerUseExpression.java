package ast.expressions;

import ast.ASTNode;
import ast.walking.ASTNodeVisitor;

public class FunctionPointerUseExpression extends Expression {

	private Expression targetPointer = null;
	private ArgumentList argumentList = null;

	@Override
	public void addChild(ASTNode node) {
		if (node instanceof Identifier)
			setTargetPointer((Identifier) node);
		else if (node instanceof ArgumentList)
			setArgumentList((ArgumentList) node);
		else
			super.addChild(node);
	}

	public Expression getTargetFunc() {
		return this.targetPointer;
	}

	public void setTargetPointer(Expression targetPoint) {
		this.targetPointer = targetPoint;
		super.addChild(targetPoint);
	}

	public ArgumentList getArgumentList() {
		return this.argumentList;
	}

	public void setArgumentList(ArgumentList argumentList) {
		this.argumentList = argumentList;
		super.addChild(argumentList);
	}
	
	public void accept(ASTNodeVisitor visitor) {
		visitor.visit(this);
	}
}
