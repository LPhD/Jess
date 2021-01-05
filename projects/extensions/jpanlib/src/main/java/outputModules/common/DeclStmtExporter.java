package outputModules.common;

import java.util.Iterator;
import java.util.List;

import ast.ASTNode;
import ast.statements.IdentifierDeclStatement;
import databaseNodes.DeclStmtDatabaseNode;
import databaseNodes.FileDatabaseNode;

public abstract class DeclStmtExporter extends ASTNodeExporter {

	protected ASTNodeExporter declImporter;

	protected abstract void addLinkFromStmtToDecl(long mainNodeId, long declId);

	public void addToDatabaseSafe(ASTNode node) {
		node.setPath(curFile.getPath());
		DeclStmtDatabaseNode dbNode = new DeclStmtDatabaseNode();
		dbNode.initialize(node);
		addMainNode(dbNode);
		
		//Set nodeID for Variability Analysis
		node.setNodeId(dbNode.getNodeId());

		addDeclarations(node);
		
		addLinkFromFileToDecl(node.getNodeId(), curFile);

	}

	private void addDeclarations(ASTNode node) {
		IdentifierDeclStatement stmt = (IdentifierDeclStatement) node;
		if(stmt.getIdentifierDeclList() != null) {
			List<ASTNode> identifierDeclList = stmt.getIdentifierDeclList();
			Iterator<ASTNode> it = identifierDeclList.iterator();
			while (it.hasNext()) {
				ASTNode decl = it.next();
				decl.setPath(curFile.getPath());
				declImporter.addToDatabaseSafe(decl);			
				
				long declId = decl.getNodeId();
				addLinkFromStmtToDecl(mainNodeId, declId);
			}
		}
	}
	
	protected abstract void addLinkFromFileToDecl(Long nodeId, FileDatabaseNode curFile);

}
