package outputModules.neo4j;

import java.util.Map;

import org.neo4j.graphdb.DynamicRelationshipType;
import org.neo4j.graphdb.RelationshipType;

import databaseNodes.ASTDatabaseNode;
import databaseNodes.EdgeTypes;
import databaseNodes.FileDatabaseNode;
import neo4j.batchInserter.GraphNodeStore;
import neo4j.batchInserter.Neo4JBatchInserter;
import outputModules.common.DirectoryTreeImporter;

public class Neo4JDirectoryTreeImporter extends DirectoryTreeImporter {
	
	protected GraphNodeStore nodeStore = new GraphNodeStore();

	protected void linkWithParentDirectory(FileDatabaseNode node) {
		long srcId = getSourceIdFromStack();
		long dstId = node.getId();
		RelationshipType rel = DynamicRelationshipType.withName(EdgeTypes.IS_PARENT_DIR_OF);
		Neo4JBatchInserter.addRelationship(srcId, dstId, rel, null);
	}

	protected void insertNode(FileDatabaseNode node) {
		Map<String, Object> properties = node.createProperties();
		long nodeId = Neo4JBatchInserter.addNode(properties);
		node.setId(nodeId);
		Neo4JBatchInserter.indexNode(nodeId, properties);
	}

	/**
	 * Connect include statement with included file
	 */
	@Override
	protected void linkIncludeToFileNode(ASTDatabaseNode preDBNode, FileDatabaseNode node) {
		RelationshipType rel = DynamicRelationshipType.withName(EdgeTypes.INCLUDES);

		long idSrc = preDBNode.getNodeId();
		long idDst = node.getId();
		Map<String, Object> properties = null;
		Neo4JBatchInserter.addRelationship(idSrc, idDst, rel, properties);
	}
	
	/**
	 * Connect a header file with its *.c file 
	 */
	@Override
	protected void linkHeaderToCFile(FileDatabaseNode header, FileDatabaseNode cFile) {
		RelationshipType rel = DynamicRelationshipType.withName(EdgeTypes.HEADER);

		long idSrc = header.getId();
		long idDst = cFile.getId();
		Map<String, Object> properties = null;
		Neo4JBatchInserter.addRelationship(idSrc, idDst, rel, properties);
	}	

}
