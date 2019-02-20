package outputModules.neo4j.exporters;

import java.util.Map;

import org.neo4j.graphdb.DynamicRelationshipType;
import org.neo4j.graphdb.RelationshipType;

import databaseNodes.DatabaseNode;
import databaseNodes.EdgeTypes;
import databaseNodes.FileDatabaseNode;
import databaseNodes.NodeKeys;
import databaseNodes.PreStatementDatabaseNode;
import neo4j.batchInserter.GraphNodeStore;
import neo4j.batchInserter.Neo4JBatchInserter;
import outputModules.common.PreStatementExporter;
import outputModules.common.Writer;

public class Neo4JPreStatementExporter extends PreStatementExporter {

	protected GraphNodeStore nodeStore = new GraphNodeStore();
	
	public Neo4JPreStatementExporter() {
		astImporter = new Neo4JASTExporter(nodeStore);
	}

	
	protected void addMainNode(PreStatementDatabaseNode dbNode) {
		
		Map<String, Object> properties = dbNode.createProperties();
		Writer.addNode(dbNode, properties);
		mainNodeId = Writer.getIdForObject(dbNode);
		
		System.out.println("mainNodeId: " +mainNodeId);
		

	}
	
	@Override
	protected void addMainNode(DatabaseNode dbNode) {
		PreStatementDatabaseNode preDBNode = (PreStatementDatabaseNode) dbNode;
		
		Map<String, Object> properties = preDBNode.createProperties();
		nodeStore.addNeo4jNode(preDBNode, properties);

		mainNodeId = nodeStore.getIdForObject(preDBNode);
		// index, but do not index location
		properties.remove(NodeKeys.LOCATION);
		nodeStore.indexNode(preDBNode, properties);
		
		//Call ast importer to add children
		astImporter.addASTChildren(preDBNode.getASTRoot());
	}

	protected void linkPreStatementToFileNode(PreStatementDatabaseNode classDefNode, FileDatabaseNode fileNode) {
		RelationshipType rel = DynamicRelationshipType.withName(EdgeTypes.IS_FILE_OF);

		long fileId = fileNode.getId();
		long functionId = nodeStore.getIdForObject(classDefNode);

		Neo4JBatchInserter.addRelationship(fileId, functionId, rel, null);
	}

}
