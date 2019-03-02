package outputModules.common;

import ast.ASTNode;
import databaseNodes.ASTDatabaseNode;
import databaseNodes.FileDatabaseNode;
import includeAnalysis.IncludeAnalyzer;

public abstract class PreStatementExporter extends ASTNodeExporter{
	
	/**
	 * Add the main node and its children to the Database.
	 */
	@Override
	public void addToDatabaseSafe(ASTNode astNode)	{
		ASTDatabaseNode preDBNode = new ASTDatabaseNode();
		try	{			
			preDBNode.initialize(astNode);
			addMainNode(preDBNode);
			linkPreStatementToFileNode(preDBNode, curFile);	
			//Look for file inclusions
			if(astNode.getTypeAsString().equals("PreIncludeLocalFile")) {
				IncludeAnalyzer.includeNodeList.add(preDBNode);
			}
			//Look for AST children and add them
			addASTChildren(preDBNode, astNode);						
		} catch (RuntimeException ex)	{
			ex.printStackTrace();
			System.err.println("Error adding pre-statement to database: "+ preDBNode.toString());
			return;
		}
	}
	
	
	/**
	 * Look for child nodes of the current node and add them to the db.
	 * @param parent The current node.
	 * @param astNodeParent 
	 */
	protected void addASTChildren(ASTDatabaseNode dbNodeParent, ASTNode astNodeParent) {
		final int nChildren = astNodeParent.getChildCount();
		for (int i = 0; i < nChildren; i++) {
			ASTNode child = astNodeParent.getChild(i);
			addASTToDatabase(dbNodeParent, astNodeParent, child);			
		}
	}
	
	/**
	 * Add current ASTNode to database and look for its children
	 * @param preDBNodeparent 
	 * @param currentNode The current node.
	 * @param parent The parent node of the current node.
	 */
	public void addASTToDatabase(ASTDatabaseNode dbNodeParent, ASTNode astNodeParent, ASTNode currentASTNode) {
		ASTDatabaseNode astDatabaseNode = new ASTDatabaseNode();
		try	{
			astDatabaseNode.initialize(currentASTNode);
			addASTNode(astDatabaseNode);
			addASTLink(dbNodeParent, astDatabaseNode);
			//Link include statement with included file
			if(currentASTNode.getTypeAsString().equals("PreIncludeLocalFile")) {
				IncludeAnalyzer.includeNodeList.add(astDatabaseNode);
			}
			addASTChildren(astDatabaseNode, currentASTNode);		
		} catch (RuntimeException ex)	{
			ex.printStackTrace();
			System.err.println("Error adding pre-statement children to database: "+ astDatabaseNode.toString());
			return;
		}		
	}
	
	
	protected abstract void addASTNode(ASTDatabaseNode astDatabaseNode);
	protected abstract void addASTLink(ASTDatabaseNode parent, ASTDatabaseNode child);
	protected abstract void linkPreStatementToFileNode(ASTDatabaseNode preDBNode, FileDatabaseNode fileNode);
}
