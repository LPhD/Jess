package outputModules.csv;

import java.util.Map;

import databaseNodes.ASTDatabaseNode;
import databaseNodes.EdgeTypes;
import databaseNodes.FileDatabaseNode;
import outputModules.common.DirectoryTreeImporter;
import outputModules.common.Writer;

public class SingleDirCSVDirectoryTreeImporter extends DirectoryTreeImporter {

	@Override
	protected void insertNode(FileDatabaseNode node) {

		Writer.changeOutputDir(outputDir);
		Writer.reset();

		Map<String, Object> properties = node.createProperties();
		long nodeId = Writer.addNode(node, properties);
		node.setId(nodeId);
	}

	@Override
	protected void linkWithParentDirectory(FileDatabaseNode node) {
		long srcId = getSourceIdFromStack();
		long dstId = node.getId();
		Writer.addEdge(srcId, dstId, null, EdgeTypes.IS_PARENT_DIR_OF);
	}
	
	
	/**
	 * Connect include statement with included file
	 */
	@Override
	protected void linkIncludeToFileNode(ASTDatabaseNode preDBNode, FileDatabaseNode node) {
		long srcId = preDBNode.getNodeId();
		long dstId = node.getId();
		Writer.addEdge(srcId, dstId, null, EdgeTypes.INCLUDES);		
	}

	/**
	 * Connect a header file with its *.c file 
	 */
	@Override
	protected void linkHeaderToCFile(FileDatabaseNode header, FileDatabaseNode cFile) {
		long srcId = header.getId();
		long dstId = cFile.getId();
		Writer.addEdge(srcId, dstId, null, EdgeTypes.HEADER);		
	}
}
