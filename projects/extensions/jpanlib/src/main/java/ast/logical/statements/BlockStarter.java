package ast.logical.statements;

import ast.expressions.Expression;
import ast.walking.ASTNodeVisitor;

public class BlockStarter extends Statement {
	protected Expression condition = null;
	protected Statement statement = null;

	public Expression getCondition() {
		return this.condition;
	}

	public void setCondition(Expression expression) {
		this.condition = expression;
		super.addChild(expression);
	}

	public Statement getStatement() {
		return this.statement;
	}

	public void setStatement(Statement statement) {
		this.statement = statement;
		super.addChild(statement);
	}

	@Override
	public void accept(ASTNodeVisitor visitor) {
		visitor.visit(this);
	}

}
