package outputModules.common;

import ast.ASTNode;
import ast.Comment;
import ast.logical.statements.CompoundStatement;
import ast.preprocessor.PreBlockstarter;
import databaseNodes.ASTDatabaseNode;
import databaseNodes.FunctionDatabaseNode;
import includeAnalysis.IncludeAnalyzer;

public abstract class ASTExporter {
	protected FunctionDatabaseNode currentFunction;
	protected int ancestorCompoundStatements;

	/**
	 * This is for every AST node on function level (functions/classes + their content)
	 * @param node The current AST node that shall be added to the DB
	 */
	public void addASTToDatabase(ASTNode node) {
		//The current node path is the same as the ASTRoot path
		node.setPath(currentFunction.getASTRoot().getPath());
		
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
		
		// Check for commentees
		if (node instanceof Comment) {
			addCommentAnalysis(node);
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
	 * Look for nodes surrounded with a variability block and draws the respective variability link
	 * 
	 * @param rootAstCompoundNode The top level compound statement of the function (first iteration), #else/#elif nodes on further iterations
	 */
	public void addVariabilityAnalysis(ASTNode rootAstCompoundNode) {
		final int nChildren = rootAstCompoundNode.getChildCount();

		//For each top level child that is a pre blockstarter. 
		for (int j = 0; j < nChildren; j++) {
			ASTNode currentNode = rootAstCompoundNode.getChild(j);
			if (currentNode instanceof PreBlockstarter) {
				final int nVariableStatements = ((PreBlockstarter) currentNode).getVariableStatementsCount();
				for (int i = 0; i < nVariableStatements; i++) {
					ASTNode vStatement = ((PreBlockstarter) currentNode).getVariableStatement(i);					
					
					if(currentNode.getNodeId() > 0 && vStatement.getNodeId() > 0) {
						long parentNodeID = currentNode.getNodeId();
						long childNodeID = vStatement.getNodeId();
						drawVariabilityEdge(parentNodeID, childNodeID);
					} else {
						System.err.println("Error connecting "+currentNode.getEscapedCodeStr()+" with variability child: "+vStatement.getEscapedCodeStr());
					}
				}
				
				//Check also the AST children (#else/#elif)
				addVariabilityAnalysis(currentNode);
			}
		}
	}
	
	/**
	 * Look for comment nodes and draw COMMENTS links to their commentees
	 * @param node
	 */
	protected void addCommentAnalysis(ASTNode node) {
		if(node instanceof Comment) {
			if(((Comment) node).getCommentee() != null) {
				drawCommentsEdge(node.getNodeId(), ((Comment) node).getCommentee().getNodeId());
			}
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
	protected abstract void drawCommentsEdge(long parentNodeID, long childNodeID);

}