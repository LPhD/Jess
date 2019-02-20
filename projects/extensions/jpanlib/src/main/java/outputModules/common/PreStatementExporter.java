package outputModules.common;

import ast.ASTNode;
import databaseNodes.FileDatabaseNode;
import databaseNodes.PreStatementDatabaseNode;

public abstract class PreStatementExporter extends ASTNodeExporter{
	
	protected ASTExporter astImporter;
	
	@Override

	public void addToDatabaseSafe(ASTNode preASTNode)	{
		PreStatementDatabaseNode preDBNode = new PreStatementDatabaseNode();
		try	{	
			//Initialize and add main node
			preDBNode.initialize(preASTNode);
			addMainNode(preDBNode);
			//Call ast importer
			astImporter.addASTToDatabase(preDBNode.getASTRoot());
			//Connect main node with parent file
			linkPreStatementToFileNode(preDBNode, curFile);	
			
		} catch (RuntimeException ex)	{
			ex.printStackTrace();
			System.err.println("Error adding pre-statement to database: "+ preDBNode.toString());
			return;
		}
	}
		
	protected abstract void linkPreStatementToFileNode(PreStatementDatabaseNode classDefNode, FileDatabaseNode fileNode);	

}
