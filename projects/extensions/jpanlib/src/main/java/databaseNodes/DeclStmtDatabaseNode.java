package databaseNodes;

import java.util.HashMap;
import java.util.Map;

import ast.statements.IdentifierDeclStatement;

public class DeclStmtDatabaseNode extends DatabaseNode {

	String typeStr;
	String code;

	@Override
	public void initialize(Object obj) {
		IdentifierDeclStatement stmt = (IdentifierDeclStatement) obj;
		typeStr = stmt.getTypeAsString();
		code = stmt.getEscapedCodeStr();
	}

	@Override
	public Map<String, Object> createProperties() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put(NodeKeys.NODE_TYPE, "DeclStmt");
		map.put(NodeKeys.CODE, code);
		return map;
	}

}
