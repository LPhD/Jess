package outputModules.common;

import ast.ASTNode;
import ast.Comment;
import databaseNodes.ASTDatabaseNode;

public abstract class CommentExporter extends ASTNodeExporter{
	
	/**
	 * Add the main node and its children to the Database.
	 * 
	 */
	@Override
	public void addToDatabaseSafe(ASTNode astNode)	{
		astNode.setPath(curFile.getPath());
		ASTDatabaseNode commentDBNode = new ASTDatabaseNode();
		try	{			
			//Add top level AST node to DB
			commentDBNode.initialize(astNode);
			addMainNode(commentDBNode);
			
			//Set nodeID in AST node to draw comment edges
			astNode.setNodeId(commentDBNode.getNodeId());
			//Draw comment edges
			addCommentAnalysis(astNode);
				
		} catch (RuntimeException ex)	{
			ex.printStackTrace();
			System.err.println("Error adding comment to database: "+ commentDBNode.toString());
			return;
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
	
	
	protected abstract void addASTNode(ASTDatabaseNode astDatabaseNode);
	protected abstract void drawCommentsEdge(long parentNodeID, long childNodeID);
}
