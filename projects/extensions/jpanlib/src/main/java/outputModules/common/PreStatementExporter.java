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
			
		} catch (RuntimeException ex)	{
			ex.printStackTrace();
			System.err.println("Error adding pre-statement to database: "+ preNode.toString());
			return;
		}
	}
	
	protected abstract void linkPreStatementToFileNode(PreStatementDatabaseNode classDefNode, FileDatabaseNode fileNode);
}
