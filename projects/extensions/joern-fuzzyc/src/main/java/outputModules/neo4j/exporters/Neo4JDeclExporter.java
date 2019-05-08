package outputModules.neo4j.exporters;

import ast.ASTNode;
import databaseNodes.DeclDatabaseNode;

public class Neo4JDeclExporter extends Neo4JASTNodeExporter {

	@Override
	public void addToDatabaseSafe(ASTNode node) {
		//Do not set path here, as it is null
		DeclDatabaseNode dbNode = new DeclDatabaseNode();
		dbNode.initialize(node);
		addMainNode(dbNode);

		// Set nodeID for Variability Analysis
		node.setNodeId(dbNode.getNodeId());
	}

}
