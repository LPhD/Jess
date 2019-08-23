package outputModules.neo4j.exporters;

import java.util.Map;

import org.neo4j.graphdb.DynamicRelationshipType;
import org.neo4j.graphdb.RelationshipType;

import databaseNodes.ASTDatabaseNode;
import databaseNodes.EdgeTypes;
import databaseNodes.NodeKeys;
import neo4j.batchInserter.GraphNodeStore;
import neo4j.batchInserter.Neo4JBatchInserter;
import outputModules.common.ASTExporter;

public class Neo4JASTExporter extends ASTExporter {
	GraphNodeStore nodeStore;

	public Neo4JASTExporter(GraphNodeStore aNodeStore) {
		nodeStore = aNodeStore;
	}


	@Override
	protected void addASTNode(ASTDatabaseNode astDatabaseNode) {
		Map<String, Object> properties = astDatabaseNode.createProperties();
		properties.put(NodeKeys.FUNCTION_ID, ""+currentFunction.getNodeId());
		nodeStore.addNeo4jNode(astDatabaseNode, properties);
		nodeStore.indexNode(astDatabaseNode, properties);		

		//ID handling (because sometimes we get the id from the AST node or the DB node or via the writer)
		long id = nodeStore.getIdForObject(astDatabaseNode);
		astDatabaseNode.setNodeId(id);
		nodeStore.setIdForObject(astDatabaseNode.getAstNode(), id);
	}

	@Override
	protected void addASTLink(long parentId, long childId) {
		RelationshipType rel = DynamicRelationshipType.withName(EdgeTypes.IS_AST_PARENT);
		Map<String, Object> properties = null;
		Neo4JBatchInserter.addRelationship(parentId, childId, rel, properties);
	}
	
	/**
	 * Link the given preStatementDatabaseNode (parentNodeID) with its block content (childNodeID)
	 */
	@Override
	protected void drawVariabilityEdge(long parentNodeID, long childNodeID) {
		RelationshipType rel = DynamicRelationshipType.withName(EdgeTypes.VARIABILITY);
		Neo4JBatchInserter.addRelationship(parentNodeID, childNodeID, rel, null);
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
