package outputModules.csv.exporters;

import java.util.Map;

import databaseNodes.ASTDatabaseNode;
import databaseNodes.DatabaseNode;
import databaseNodes.EdgeTypes;
import outputModules.common.CommentExporter;
import outputModules.common.Writer;

public class CSVCommentExporter extends CommentExporter {

	/**
	 * Add the root node to the Database
	 */
	@Override
	protected void addMainNode(DatabaseNode dbNode) {
		ASTDatabaseNode astDBnode = (ASTDatabaseNode) dbNode;
		Map<String, Object> properties = astDBnode.createProperties();
		Writer.addNode(dbNode, properties);
		
		mainNodeId = Writer.getIdForObject(dbNode);
		dbNode.setNodeId(Writer.getIdForObject(dbNode));
	}
	
	/**
	 * Add an ASTNode to the Database
	 * @param node
	 */
	@Override
	protected void addASTNode(ASTDatabaseNode astDatabaseNode)	{
		Map<String, Object> properties = astDatabaseNode.createProperties();
		Writer.addNode(astDatabaseNode, properties);
		astDatabaseNode.setNodeId(Writer.getIdForObject(astDatabaseNode));
	}
		
	/**
	 * Link the given comment (parentNodeID) with its commentee (childNodeID)
	 */
	@Override
	protected void drawCommentsEdge(long parentNodeID, long childNodeID) {
		Writer.addEdge(parentNodeID, childNodeID, null, EdgeTypes.COMMENTS);		
	}

}
