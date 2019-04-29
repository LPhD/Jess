package outputModules.csv.exporters;

import java.util.Map;

import ast.ASTNode;
import databaseNodes.ASTDatabaseNode;
import databaseNodes.EdgeTypes;
import databaseNodes.NodeKeys;
import outputModules.common.ASTExporter;
import outputModules.common.Writer;

public class CSVASTExporter extends ASTExporter {
	
	@Override
	protected void addASTNode(ASTDatabaseNode astDatabaseNode) {
		Map<String, Object> properties = astDatabaseNode.createProperties();
		properties.put(NodeKeys.FUNCTION_ID, Writer.getIdForObject(currentFunction).toString());
		Writer.addNode(astDatabaseNode, properties);
		astDatabaseNode.setNodeId(Writer.getIdForObject(astDatabaseNode));
	}

	@Override
	protected void addASTLink(ASTNode parent, ASTNode child) {
		long srcId = Writer.getIdForObject(parent);
		long dstId = Writer.getIdForObject(child);
		Writer.addEdge(srcId, dstId, null, EdgeTypes.IS_AST_PARENT);
	}

	/**
	 * Link the given preStatementDatabaseNode (parentNodeID) with its block content (childNodeID)
	 */
	@Override
	protected void drawVariabilityEdge(long parentNodeID, long childNodeID) {
		Writer.addEdge(parentNodeID, childNodeID, null, EdgeTypes.VARIABILITY);
	}
}
