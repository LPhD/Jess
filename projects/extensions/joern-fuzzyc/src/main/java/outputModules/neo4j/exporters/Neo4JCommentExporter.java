package outputModules.neo4j.exporters;

import java.util.Map;

import org.neo4j.graphdb.DynamicRelationshipType;
import org.neo4j.graphdb.RelationshipType;

import databaseNodes.ASTDatabaseNode;
import databaseNodes.DatabaseNode;
import databaseNodes.EdgeTypes;
import neo4j.batchInserter.GraphNodeStore;
import neo4j.batchInserter.Neo4JBatchInserter;
import outputModules.common.CommentExporter;

public class Neo4JCommentExporter extends CommentExporter {

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
	 * Link the given comment (parentNodeID) with its commentee (childNodeID)
	 */
	@Override
	protected void drawCommentsEdge(long parentNodeID, long childNodeID) {
		RelationshipType rel = DynamicRelationshipType.withName(EdgeTypes.COMMENTS);
		Neo4JBatchInserter.addRelationship(parentNodeID, childNodeID, rel, null);	
	}
}
