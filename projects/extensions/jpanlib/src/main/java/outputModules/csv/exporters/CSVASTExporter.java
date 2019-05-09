package outputModules.csv.exporters;

import java.util.Map;

import databaseNodes.ASTDatabaseNode;
import databaseNodes.EdgeTypes;
import databaseNodes.NodeKeys;
import outputModules.common.ASTExporter;
import outputModules.common.Writer;

public class CSVASTExporter extends ASTExporter {
	
	@Override
	protected void addASTNode(ASTDatabaseNode astDatabaseNode) {
		Map<String, Object> properties = astDatabaseNode.createProperties();
		Writer.addNode(astDatabaseNode, properties);
		properties.put(NodeKeys.FUNCTION_ID, currentFunction.getNodeId());
		
		System.out.println("Putting function id: "+currentFunction.getNodeId()+" for node: "astDatabaseNode.getAstNode().getEscapedCodeStr());
		
		//ID handling (because sometimes we get the id from the AST node or the DB node or via the writer)
		long id = Writer.getIdForObject(astDatabaseNode);
		astDatabaseNode.setNodeId(id);
		Writer.setIdForObject(astDatabaseNode.getAstNode(), id);
	}

	@Override
	protected void addASTLink(long srcId, long dstId) {
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
