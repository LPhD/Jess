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
	protected void addASTLink(ASTNode parent, ASTNode child) {
		System.out.println("Parent node: " + parent);
		System.out.println("child node: " + child);
		System.out.println("Parent node id: " + Writer.getIdForObject(parent));
		System.out.println("child node id: " + Writer.getIdForObject(child));
		System.out.println("Parent node code: " + parent.getEscapedCodeStr());
		System.out.println("child node code: " + child.getEscapedCodeStr());
		
		long srcId = Writer.getIdForObject(parent);
		long dstId = Writer.getIdForObject(child);
		Writer.addEdge(srcId, dstId, null, EdgeTypes.IS_AST_PARENT);
	}

	@Override
	protected void addASTNode(ASTNode node) {
		ASTDatabaseNode astDatabaseNode = new ASTDatabaseNode();
		astDatabaseNode.initialize(node);
		
		if (currentFunction != null)
			astDatabaseNode.setCurrentFunction(currentFunction);
		
		astDatabaseNode.setInsideFunctionBlock(this.isInsideFunctionBlock());
		Map<String, Object> properties = astDatabaseNode.createProperties();
		
		// TODO: currentFunction can be empty if we are inside a pre statement
		if (currentFunction != null)
			properties.put(NodeKeys.FUNCTION_ID, Writer.getIdForObject(currentFunction).toString());
		
		Writer.addNode(node, properties);
	}
}
