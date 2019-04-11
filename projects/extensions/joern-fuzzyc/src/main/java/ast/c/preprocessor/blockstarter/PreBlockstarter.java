package ast.c.preprocessor.blockstarter;

import java.util.LinkedList;

import ast.ASTNode;
import ast.c.preprocessor.PreStatement;
import ast.expressions.Expression;
import ast.logical.statements.Statement;
import ast.walking.ASTNodeVisitor;

public class PreBlockstarter extends PreStatement {
	protected Expression condition = null;
	protected Statement statement = null;
	/**
	 * Contains all statements that are annotated with the current #if/#elif/#else 
	 */
	protected LinkedList<ASTNode> variableStatements;
	protected int vStatementsNumber;

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

	public void addVariableStatement(ASTNode node) {
		if (variableStatements == null)
			variableStatements = new LinkedList<ASTNode>();
		this.setVStatementsNumber(variableStatements.size());
		variableStatements.add(node);
	}

	public int getVariableStatementsCount() {
		if (variableStatements == null)
			return 0;
		return variableStatements.size();
	}

	public ASTNode getVariableStatement(int i) {
		if (variableStatements == null)
			return null;

		ASTNode retval;
		try {
			retval = variableStatements.get(i);
		} catch (IndexOutOfBoundsException ex) {
			return null;
		}
		return retval;
	}

	public ASTNode popLastVariableStatement() {
		return variableStatements.removeLast();
	}

	public int getVStatementsNumber() {
		return this.vStatementsNumber;
	}

	public void setVStatementsNumber(int num) {
		this.vStatementsNumber = num;
	}
}
