package databaseNodes;

import java.util.HashMap;
import java.util.Map;

import ast.statements.IdentifierDeclStatement;

public class DeclStmtDatabaseNode extends DatabaseNode {

	private IdentifierDeclStatement stmt;
	
	@Override
	public void initialize(Object obj) {
		this.stmt = (IdentifierDeclStatement) obj;
	}

	@Override
	public Map<String, Object> createProperties() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put(NodeKeys.NODE_TYPE, "DeclStmt");
		map.put(NodeKeys.CODE, stmt.getEscapedCodeStr());
		//Always get the location
		map.put(NodeKeys.LINE, ""+stmt.getLine());
		map.put(NodeKeys.PATH, stmt.getPath());
		map.put(NodeKeys.CLINE, ""+stmt.getCharAtLine());
		return map;
	}
	
	public IdentifierDeclStatement getIdentifierDeclStatement() {
		return stmt;
	}

}
