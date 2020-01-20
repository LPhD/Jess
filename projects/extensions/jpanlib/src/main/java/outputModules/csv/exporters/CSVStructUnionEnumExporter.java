package outputModules.csv.exporters;

import java.util.Map;

import databaseNodes.ASTDatabaseNode;
import databaseNodes.DatabaseNode;
import databaseNodes.EdgeTypes;
import databaseNodes.FileDatabaseNode;
import outputModules.common.StructUnionEnumExporter;
import outputModules.common.Writer;

public class CSVStructUnionEnumExporter extends StructUnionEnumExporter {

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
	 * Link the given astDatabaseNode (the root node) with its FileDatabaseNode
	 */
	@Override
	protected void addLinkFromFileToStruct(Long nodeId, FileDatabaseNode curFile) {
		long fileId = curFile.getId();
		Writer.addEdge(fileId, nodeId, null, EdgeTypes.IS_FILE_OF);
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

}
