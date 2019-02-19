package outputModules.common;

import ast.ASTNode;
import databaseNodes.FileDatabaseNode;
import databaseNodes.PreStatementDatabaseNode;

public abstract class PreStatementExporter extends ASTNodeExporter{
	
	
	public void addToDatabaseSafe(ASTNode node)	{
		PreStatementDatabaseNode preNode = new PreStatementDatabaseNode();
		try	{			
			preNode.initialize(node);
			addMainNode(preNode);
			linkPreStatementToFileNode(preNode, curFile);
			
			addASTChildren(node);
			
		} catch (RuntimeException ex)	{
			ex.printStackTrace();
			System.err.println("Error adding pre-statement to database: "+ preNode.toString());
			return;
		}
	}
	
	/**
	 * Add current ASTNode to database and look for its children
	 * @param child The current node.
	 * @param parent The parent node of the current node.
	 */
	public void addASTToDatabase(ASTNode parent, ASTNode child) {
		addASTNode(child);
		addASTLink(parent, child);
		addASTChildren(child);
	}
	
	/**
	 * Look for child nodes of the current node.
	 * @param parent The current node.
	 */
	protected void addASTChildren(ASTNode parent) {
		final int nChildren = parent.getChildCount();
		for (int i = 0; i < nChildren; i++) {
			ASTNode child = parent.getChild(i);
			addASTToDatabase(parent, child);			
		}

	}
	
	protected abstract void addASTLink(ASTNode parent, ASTNode child);
	protected abstract void addASTNode(ASTNode node);
	protected abstract void linkPreStatementToFileNode(PreStatementDatabaseNode classDefNode, FileDatabaseNode fileNode);
}
