package outputModules.csv.exporters;

import java.util.Map;

import ast.ASTNode;
import databaseNodes.ASTDatabaseNode;
import databaseNodes.DatabaseNode;
import databaseNodes.EdgeTypes;
import databaseNodes.FileDatabaseNode;
import databaseNodes.PreConditionDatabaseNode;
import databaseNodes.PreStatementDatabaseNode;
import outputModules.common.PreStatementExporter;
import outputModules.common.Writer;

public class CSVPreStatementExporter extends PreStatementExporter {

	@Override
	protected void addMainNode(DatabaseNode dbNode) {
		Map<String, Object> properties = dbNode.createProperties();
		Writer.addNode(dbNode, properties);
		mainNodeId = Writer.getIdForObject(dbNode);
	}

	protected void linkPreStatementToFileNode(PreStatementDatabaseNode classDefNode, FileDatabaseNode fileNode) {
		long fileId = fileNode.getId();
		long functionId = Writer.getIdForObject(classDefNode);
		Writer.addEdge(fileId, functionId, null, EdgeTypes.IS_FILE_OF);
	}

	@Override
	protected void addASTLink(PreStatementDatabaseNode parent, PreConditionDatabaseNode child) {
		System.out.println("Parent node: "+parent);
		System.out.println("child node: "+child);
		System.out.println("Parent node id: "+ Writer.getIdForObject(parent));
		System.out.println("child node id: "+ Writer.getIdForObject(child));
		System.out.println("Parent node code: "+parent.preStatement.getEscapedCodeStr());
		System.out.println("child node code: "+child.condition.getEscapedCodeStr());
		long srcId = Writer.getIdForObject(parent);
		long dstId = Writer.getIdForObject(child);
		Writer.addEdge(srcId, dstId, null, EdgeTypes.IS_AST_PARENT);
	}

	@Override
	protected void addCondition(PreConditionDatabaseNode dbNode) {
		Map<String, Object> properties = dbNode.createProperties();
		Writer.addNode(dbNode, properties);
	}

}
