package outputModules.common;

import ast.ASTNode;
import ast.logical.statements.CompoundStatement;
import ast.preprocessor.PreBlockstarter;
import databaseNodes.ASTDatabaseNode;
import databaseNodes.FunctionDatabaseNode;
import includeAnalysis.IncludeAnalyzer;

public abstract class ASTExporter {
	protected FunctionDatabaseNode currentFunction;
	protected int ancestorCompoundStatements;

	public void addASTToDatabase(ASTNode node) {
		ASTDatabaseNode astDatabaseNode = new ASTDatabaseNode();				
		astDatabaseNode.initialize(node);
		astDatabaseNode.setCurrentFunction(currentFunction);
		astDatabaseNode.setInsideFunctionBlock(this.isInsideFunctionBlock());
		
		addASTNode(astDatabaseNode);
		//Set nodeID in AST node to draw variability and AST edges
		node.setNodeId(astDatabaseNode.getNodeId());
		
		// Link include statement with included file
		if (node.getTypeAsString().equals("PreIncludeLocalFile")) {
			IncludeAnalyzer.includeNodeList.add(astDatabaseNode);
		}

		// Look for statements that are inside an #ifdef block
		if (node instanceof PreBlockstarter) {
			addVariableStatements((PreBlockstarter) node);
		}
		
		visit(node);
		addASTChildren(node);
		leave(node);
	}

	protected void visit(ASTNode node) {
		if (node instanceof CompoundStatement) {
			ancestorCompoundStatements++;
		}
	}
	
	/**
	 * Look for nodes surrounded with the variability block of the current node and
	 * add them to the db.
	 * 
	 * @param parent
	 *            The current node.
	 * @param astNodeParent
	 *            The current node.
	 */
	private void addVariableStatements(PreBlockstarter preAstNode) {
		final int nVariableStatements = preAstNode.getVariableStatementsCount();
		for (int i = 0; i < nVariableStatements; i++) {
			ASTNode vStatement = preAstNode.getVariableStatement(i);
			long parentNodeID = preAstNode.getNodeId();
			long childNodeID = vStatement.getNodeId();

			drawVariabilityEdge(parentNodeID, childNodeID);
			// System.out.println("Connected DB parent: "+preAstNode.getEscapedCodeStr()+"
			// with DB child: "+vStatement.getEscapedCodeStr());
		}
	}
	
	protected void addASTChildren(ASTNode astNodeParent) {

		final int nChildren = astNodeParent.getChildCount();

		for (int i = 0; i < nChildren; i++) {
			ASTNode child = astNodeParent.getChild(i);
			addASTToDatabase(child);
			addASTLink(astNodeParent.getNodeId(), child.getNodeId());
		}

	}
	
	protected void leave(ASTNode node) {
		if (node instanceof CompoundStatement) {
			ancestorCompoundStatements--;
		}
	}
	
	public void setCurrentFunction(FunctionDatabaseNode func) {
		currentFunction = func;
	}

	public boolean isInsideFunctionBlock() {
		return ancestorCompoundStatements > 0;
	}
	
	protected abstract void addASTNode(ASTDatabaseNode astDatabaseNode);
	protected abstract void addASTLink(long parentNodeID, long childNodeID);
	protected abstract void drawVariabilityEdge(long parentNodeID, long childNodeID);

}