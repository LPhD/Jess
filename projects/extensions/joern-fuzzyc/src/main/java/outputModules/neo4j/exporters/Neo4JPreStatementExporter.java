package outputModules.neo4j.exporters;

import java.util.Map;

import org.neo4j.graphdb.DynamicRelationshipType;
import org.neo4j.graphdb.RelationshipType;

import databaseNodes.ASTDatabaseNode;
import databaseNodes.DatabaseNode;
import databaseNodes.EdgeTypes;
import databaseNodes.FileDatabaseNode;
import databaseNodes.NodeKeys;
import neo4j.batchInserter.GraphNodeStore;
import neo4j.batchInserter.Neo4JBatchInserter;
import outputModules.common.PreStatementExporter;
import outputModules.common.Writer;

public class Neo4JPreStatementExporter extends PreStatementExporter {

	protected GraphNodeStore nodeStore = new GraphNodeStore();
	
	/**
	 * Add the root node to the Database
	 */
	@Override
	protected void addMainNode(DatabaseNode dbNode) {
		Map<String, Object> properties = dbNode.createProperties();
		nodeStore.addNeo4jNode(dbNode, properties);

		mainNodeId = nodeStore.getIdForObject(dbNode);
		// index, but do not index location
		properties.remove(NodeKeys.LOCATION);
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

		// index, but do not index location
		properties.remove(NodeKeys.LOCATION);
		nodeStore.indexNode(astDatabaseNode, properties);
	}
	
	
	/**
	 * Link the given preStatementDatabaseNode (the root node) with its FileDatabaseNode
	 */
	@Override
	protected void linkPreStatementToFileNode(ASTDatabaseNode preNode, FileDatabaseNode fileNode) {
		RelationshipType rel = DynamicRelationshipType.withName(EdgeTypes.IS_FILE_OF);

		long fileId = fileNode.getId();
		long functionId = nodeStore.getIdForObject(preNode);

		Neo4JBatchInserter.addRelationship(fileId, functionId, rel, null);
	}
	
	/**
	 * Connect AST parent with its child
	 * @param parent The parent ASTNode
	 * @param child The child ASTNode
	 */
	@Override
	protected void addASTLink(ASTDatabaseNode parent, ASTDatabaseNode child) {
		RelationshipType rel = DynamicRelationshipType.withName(EdgeTypes.IS_AST_PARENT);

		long parentId = nodeStore.getIdForObject(parent);
		long childId = nodeStore.getIdForObject(child);
		Map<String, Object> properties = null;

		Neo4JBatchInserter.addRelationship(parentId, childId, rel, properties);
	}

	/**
	 * Connect include statement with included file
	 */
	@Override
	protected void linkIncludeToFileNode(ASTDatabaseNode preDBNode) {
		RelationshipType rel = DynamicRelationshipType.withName(EdgeTypes.INCLUDES);

		long id = nodeStore.getIdForObject(preDBNode);
		Map<String, Object> properties = null;
		//TODO get destination
		Neo4JBatchInserter.addRelationship(id, id, rel, properties);;		
	}
}
