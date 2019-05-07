package outputModules.csv.exporters;

import java.util.Map;

import databaseNodes.ASTDatabaseNode;
import databaseNodes.DatabaseNode;
import databaseNodes.EdgeTypes;
import databaseNodes.FileDatabaseNode;
import outputModules.common.PreStatementExporter;
import outputModules.common.Writer;

public class CSVPreStatementExporter extends PreStatementExporter {

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
	 * Link the given preStatementDatabaseNode (the root node) with its FileDatabaseNode
	 */
	@Override
	protected void linkPreStatementToFileNode(ASTDatabaseNode preNode, FileDatabaseNode fileNode) {
		long fileId = fileNode.getId();
		long functionId = Writer.getIdForObject(preNode);
		Writer.addEdge(fileId, functionId, null, EdgeTypes.IS_FILE_OF);
	}

	
	/**
	 * Connect AST parent with its child
	 * @param parent The parent ASTNode
	 * @param child The child ASTNode
	 */
	@Override
	protected void addASTLink(long srcId, long dstId ) {
		Writer.addEdge(srcId, dstId, null, EdgeTypes.IS_AST_PARENT);
	}
	
	/**
	 * Link the given preStatementDatabaseNode (parentNodeID) with its block content (childNodeID)
	 */
	@Override
	protected void drawVariabilityEdge(long parentNodeID, long childNodeID) {
		Writer.addEdge(parentNodeID, childNodeID, null, EdgeTypes.VARIABILITY);
	}
}
