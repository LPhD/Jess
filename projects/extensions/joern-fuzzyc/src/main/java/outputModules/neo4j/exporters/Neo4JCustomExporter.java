package outputModules.neo4j.exporters;

import java.util.Map;

import org.neo4j.graphdb.DynamicRelationshipType;
import org.neo4j.graphdb.RelationshipType;

import databaseNodes.ASTDatabaseNode;
import databaseNodes.DatabaseNode;
import databaseNodes.EdgeTypes;
import databaseNodes.FileDatabaseNode;
import neo4j.batchInserter.GraphNodeStore;
import neo4j.batchInserter.Neo4JBatchInserter;
import outputModules.common.CustomExporter;

public class Neo4JCustomExporter extends CustomExporter {

	protected GraphNodeStore nodeStore = new GraphNodeStore();
	
	/**
	 * Add the root node to the Database
	 */
	@Override
	protected void addMainNode(DatabaseNode dbNode) {
		Map<String, Object> properties = dbNode.createProperties();
		nodeStore.addNeo4jNode(dbNode, properties);

		mainNodeId = nodeStore.getIdForObject(dbNode);
		dbNode.setNodeId(nodeStore.getIdForObject(dbNode));
		
		// index, but do not index location
//		properties.remove(NodeKeys.LOCATION);
		nodeStore.indexNode(dbNode, properties);
	}
	
	/**
	 * Add an ASTNode to the Database
	 * @param node
	 */
	@Override
	protected void addASTNode(ASTDatabaseNode astDatabaseNode)	{
		Map<String, Object> properties = astDatabaseNode.createProperties();
		nodeStore.addNeo4jNode(astDatabaseNode, properties);

		nodeStore.indexNode(astDatabaseNode, properties);
		astDatabaseNode.setNodeId(nodeStore.getIdForObject(astDatabaseNode));		
	}
	
	/**
	 * Connect AST parent with its child
	 * @param parent The parent ASTNode
	 * @param child The child ASTNode
	 */
	@Override
	protected void addASTLink(long parentId, long childId) {
		RelationshipType rel = DynamicRelationshipType.withName(EdgeTypes.IS_AST_PARENT);
		Neo4JBatchInserter.addRelationship(parentId, childId, rel, null);
	}
	
	/**
	 * Link the given astDatabaseNode (the root node) with its FileDatabaseNode
	 */
	@Override
	protected void addLinkFromFileToNode(Long nodeId, FileDatabaseNode curFile) {
		RelationshipType rel = DynamicRelationshipType.withName(EdgeTypes.IS_FILE_OF);
		long fileId = curFile.getId();
		Neo4JBatchInserter.addRelationship(fileId, nodeId, rel, null);		
	}

}
