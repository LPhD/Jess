package outputModules.csv.exporters;

import java.util.Map;

import ast.ASTNode;
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
		Map<String, Object> properties = dbNode.createProperties();
		Writer.addNode(dbNode, properties);
		mainNodeId = Writer.getIdForObject(dbNode);
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
	protected void addASTLink(ASTDatabaseNode parent, ASTDatabaseNode child) {
		long srcId = Writer.getIdForObject(parent);
		long dstId = Writer.getIdForObject(child);
		Writer.addEdge(srcId, dstId, null, EdgeTypes.IS_AST_PARENT);
	}
	
	/**
	 * Link the given preStatementDatabaseNode (blockstarter) with its block content (variability)
	 * 
	 */
	@Override
	protected void drawVariabilityEdge(ASTDatabaseNode preDBNode, ASTNode vStatement) {
		//TODO We need the DB node id of the child!
		long statementId = fileNode.getId();
		long blockstarterId = Writer.getIdForObject(preDBNode);
		Writer.addEdge(blockstarterId, statementId, null, EdgeTypes.VARIABILITY);
	}
}
