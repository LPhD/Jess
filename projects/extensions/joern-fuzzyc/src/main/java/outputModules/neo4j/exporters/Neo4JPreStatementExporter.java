package outputModules.neo4j.exporters;

import java.util.Map;

import org.neo4j.graphdb.DynamicRelationshipType;
import org.neo4j.graphdb.RelationshipType;

import ast.ASTNode;
import databaseNodes.ASTDatabaseNode;
import databaseNodes.DatabaseNode;
import databaseNodes.EdgeTypes;
import databaseNodes.FileDatabaseNode;
import databaseNodes.NodeKeys;
import databaseNodes.PreStatementDatabaseNode;
import neo4j.batchInserter.GraphNodeStore;
import neo4j.batchInserter.Neo4JBatchInserter;
import outputModules.common.PreStatementExporter;

public class Neo4JPreStatementExporter extends PreStatementExporter {

	protected GraphNodeStore nodeStore = new GraphNodeStore();

	@Override
	protected void addMainNode(DatabaseNode dbNode) {
		Map<String, Object> properties = dbNode.createProperties();
		nodeStore.addNeo4jNode(dbNode, properties);

		mainNodeId = nodeStore.getIdForObject(dbNode);
		// index, but do not index location
		properties.remove(NodeKeys.LOCATION);
		nodeStore.indexNode(dbNode, properties);
	}

	protected void linkPreStatementToFileNode(PreStatementDatabaseNode classDefNode, FileDatabaseNode fileNode) {
		RelationshipType rel = DynamicRelationshipType.withName(EdgeTypes.IS_FILE_OF);

		long fileId = fileNode.getId();
		long functionId = nodeStore.getIdForObject(classDefNode);

		Neo4JBatchInserter.addRelationship(fileId, functionId, rel, null);
	}

	@Override
	protected void addASTNode(ASTNode node) {
		ASTDatabaseNode astDatabaseNode = new ASTDatabaseNode();
		astDatabaseNode.initialize(node);
		Map<String, Object> properties = astDatabaseNode.createProperties();
		nodeStore.addNeo4jNode(node, properties);
		indexASTNode(node, properties);

	}

	private void indexASTNode(ASTNode node, Map<String, Object> properties) {
		nodeStore.indexNode(node, properties);
	}

	@Override
	protected void addASTLink(ASTNode parent, ASTNode child) {
		RelationshipType rel = DynamicRelationshipType.withName(EdgeTypes.IS_AST_PARENT);

		long parentId = nodeStore.getIdForObject(parent);
		long childId = nodeStore.getIdForObject(child);
		Map<String, Object> properties = null;

		Neo4JBatchInserter.addRelationship(parentId, childId, rel, properties);
	}
}