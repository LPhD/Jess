package outputModules.csv.exporters;

import java.util.Map;

import databaseNodes.DatabaseNode;
import databaseNodes.EdgeTypes;
import databaseNodes.FileDatabaseNode;
import outputModules.common.DeclStmtExporter;
import outputModules.common.Writer;

public class CSVDeclStmtExporter extends DeclStmtExporter {

	public CSVDeclStmtExporter() {
		declImporter = new CSVDeclExporter();
	}

	@Override
	protected void addLinkFromStmtToDecl(long mainNodeId, long declId) {
		Writer.addEdge(mainNodeId, declId, null, EdgeTypes.DECLARES);
	}

	@Override
	protected void addMainNode(DatabaseNode dbNode) {
		Map<String, Object> properties = dbNode.createProperties();
		Writer.addNode(dbNode, properties);
		mainNodeId = Writer.getIdForObject(dbNode);		
		
		//Set nodeID for Variability Analysis
		dbNode.setNodeId(Writer.getIdForObject(dbNode));
	}
	
	@Override
	protected void addLinkFromFileToDecl(Long nodeId, FileDatabaseNode curFile) {
		long srcId = Writer.getIdForObject(curFile);
		Writer.addEdge(srcId, nodeId, null, EdgeTypes.IS_FILE_OF);
	}

}
