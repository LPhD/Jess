package outputModules.csv.exporters;

import ast.ASTNode;
import databaseNodes.DeclDatabaseNode;

public class CSVDeclExporter extends CSVASTNodeExporter {

	@Override
	public void addToDatabaseSafe(ASTNode node) {
		node.setPath(curFile.getPath());
		DeclDatabaseNode dbNode = new DeclDatabaseNode();
		dbNode.initialize(node);
		addMainNode(dbNode);

		// Set nodeID for Variability Analysis
		node.setNodeId(dbNode.getNodeId());
	}

}
