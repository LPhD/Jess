package outputModules.csv.exporters;

import java.util.Map;

import databaseNodes.DatabaseNode;
import databaseNodes.EdgeTypes;
import databaseNodes.FileDatabaseNode;
import databaseNodes.PreStatementDatabaseNode;
import outputModules.common.PreStatementExporter;
import outputModules.common.Writer;

public class CSVPreStatementExporter extends PreStatementExporter {
	
	public CSVPreStatementExporter() {
		astImporter = new CSVASTExporter();
	}


	protected void addMainNode(PreStatementDatabaseNode dbNode) {
				
		Map<String, Object> properties = dbNode.createProperties();
		Writer.addNode(dbNode, properties);
		mainNodeId = Writer.getIdForObject(dbNode);
		
		System.out.println("mainNodeId: " +mainNodeId);
		
		//Call ast importer to add children
		astImporter.addASTChildren(dbNode.getASTRoot());
	}

	protected void linkPreStatementToFileNode(PreStatementDatabaseNode classDefNode, FileDatabaseNode fileNode) {
		long fileId = fileNode.getId();
		long functionId = Writer.getIdForObject(classDefNode);
		Writer.addEdge(fileId, functionId, null, EdgeTypes.IS_FILE_OF);
	}

	@Override
	protected void addMainNode(DatabaseNode dbNode) {
		this.addMainNode(dbNode);
		
	}

}
