package databaseNodes;

import java.util.HashMap;
import java.util.Map;

import ast.declarations.ClassDefStatement;

public class ClassDefDatabaseNode extends DatabaseNode {

	String name;
	ClassDefStatement stmt;

	@Override
	public void initialize(Object obj) {
		stmt = (ClassDefStatement) obj;
		name = stmt.identifier.getEscapedCodeStr();
	}

	@Override
	public Map<String, Object> createProperties() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put(NodeKeys.NODE_TYPE, "ClassDef");
		map.put(NodeKeys.CODE, name);
		map.put(NodeKeys.LINE, ""+stmt.getLine());
		map.put(NodeKeys.PATH, stmt.getPath());
		map.put(NodeKeys.CLINE, ""+stmt.getCharAtLine());
		return map;
	}

}
