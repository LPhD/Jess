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
	
	public void addASTToDatabase(ASTNode node) {
		addASTNode(node);
		addASTChildren(node);
	}
	
	protected void addASTChildren(ASTNode node) {

		final int nChildren = node.getChildCount();

		for (int i = 0; i < nChildren; i++) {
			ASTNode child = node.getChild(i);
			//Different kind of children!
			addASTToDatabase(child);
			addASTLink(node, child);
		}

	}
	
	protected abstract void addASTLink(ASTNode parent, ASTNode child);
	protected abstract void addASTNode(ASTNode node);
	protected abstract void linkPreStatementToFileNode(PreStatementDatabaseNode classDefNode, FileDatabaseNode fileNode);
}
