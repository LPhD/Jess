package databaseNodes;

import java.util.HashMap;
import java.util.Map;

import ast.declarations.IdentifierDecl;

public class DeclDatabaseNode extends DeclStmtDatabaseNode {

	private IdentifierDecl decl;


	@Override
	public void initialize(Object obj) {
		this.decl = (IdentifierDecl) obj;
	}

	@Override
	public Map<String, Object> createProperties() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put(NodeKeys.NODE_TYPE, "Decl");
		map.put(NodeKeys.BASE_TYPE, decl.getType().baseType);
		map.put(NodeKeys.COMPLETE_TYPE, decl.getType().completeType);
		map.put(NodeKeys.IDENTIFIER, decl.getName().getEscapedCodeStr());
		map.put(NodeKeys.CODE, decl.getEscapedCodeStr());
		//Always get the location
		map.put(NodeKeys.LINE, ""+decl.getLine());
		map.put(NodeKeys.PATH, decl.getPath());
		map.put(NodeKeys.CLINE, ""+decl.getCharAtLine());
		
		return map;
	}
	
	public IdentifierDecl getIdentifierDecl() {
		return decl;
	}

}
