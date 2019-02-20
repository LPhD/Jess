package outputModules.common;

import ast.ASTNode;
import ast.logical.statements.CompoundStatement;
import databaseNodes.FunctionDatabaseNode;

public abstract class ASTExporter {
	protected FunctionDatabaseNode currentFunction;
	protected int ancestorCompoundStatements;

	public void addASTToDatabase(ASTNode node) {
		enter(node);
		addASTNode(node);
		visit(node);
		addASTChildren(node);
		leave(node);
	}

	public void setCurrentFunction(FunctionDatabaseNode func) {
		currentFunction = func;
	}

	public void addASTChildren(ASTNode node) {

		final int nChildren = node.getChildCount();

		for (int i = 0; i < nChildren; i++) {
			ASTNode child = node.getChild(i);
			addASTToDatabase(child);
			addASTLink(node, child);
		}

	}

	protected abstract void addASTLink(ASTNode parent, ASTNode child);

	protected abstract void addASTNode(ASTNode node);

	protected void enter(ASTNode node) {
	}

	protected void visit(ASTNode node) {
		if (node instanceof CompoundStatement) {
			ancestorCompoundStatements++;
		}
	}

	protected void leave(ASTNode node) {
		if (node instanceof CompoundStatement) {
			ancestorCompoundStatements--;
		}
	}

	public boolean isInsideFunctionBlock() {
		return ancestorCompoundStatements > 0;
	}
}