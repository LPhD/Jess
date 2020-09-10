package outputModules.common;

import ast.ASTNode;
import databaseNodes.ASTDatabaseNode;
import databaseNodes.FileDatabaseNode;

public abstract class StructUnionEnumExporter extends ASTNodeExporter{
	
	/**
	 * Add the main node and its children to the Database.
	 * 
	 */
	@Override
	public void addToDatabaseSafe(ASTNode astNode)	{
		astNode.setPath(curFile.getPath());
		ASTDatabaseNode structDBNode = new ASTDatabaseNode();
		try	{			
			//Add top level AST node to DB
			structDBNode.initialize(astNode);
			addMainNode(structDBNode);
			
			//Set nodeID in AST node to draw comment edges
			astNode.setNodeId(structDBNode.getNodeId());
			//Draw is_file_of edges
			addLinkFromFileToNode(astNode.getNodeId(), curFile);
			
			//Look for AST children and add them
			addASTChildren(astNode);
							
		} catch (RuntimeException ex)	{
			ex.printStackTrace();
			System.err.println("Error adding StructUnionEnum or FunctionPointerDeclare to database: "+ structDBNode.toString());
			return;
		}
	}
	
	/**
	 * Look for child nodes of the current node and add them to the db.
	 * @param parent The current node.
	 * @param astNodeParent The current node.
	 */
	protected void addASTChildren(ASTNode astNodeParent) {
		final int nChildren = astNodeParent.getChildCount();
		for (int i = 0; i < nChildren; i++) {
			ASTNode child = astNodeParent.getChild(i);
			addASTToDatabase(child);	
			addASTLink(astNodeParent.getNodeId(), child.getNodeId());
		}
	}
	
	
	/**
	 * Add current ASTNode to database and look for its children
	 * @param preDBNodeparent 
	 * @param currentNode The current node.
	 * @param parent The parent node of the current node.
	 */
	public void addASTToDatabase(ASTNode currentASTNode) {
		currentASTNode.setPath(curFile.getPath());
		ASTDatabaseNode astDatabaseNode = new ASTDatabaseNode();
		try	{
			//Add DB Node and connect it with its parent
			astDatabaseNode.initialize(currentASTNode);
			addASTNode(astDatabaseNode);
			//Set nodeID in AST node to draw variability and AST edges
			currentASTNode.setNodeId(astDatabaseNode.getNodeId());
			
			//Look for AST childs and add them
			addASTChildren(currentASTNode);						
			
		} catch (RuntimeException ex)	{
			ex.printStackTrace();
			System.err.println("Error adding StructUnionEnum or FunctionPointerDeclare children to database: "+ astDatabaseNode.toString());
			return;
		}		
	}
	
	

	protected abstract void addASTLink(long parentNodeID, long childNodeID);	
	protected abstract void addASTNode(ASTDatabaseNode astDatabaseNode);
	protected abstract void addLinkFromFileToNode(Long nodeId, FileDatabaseNode curFile);
}
