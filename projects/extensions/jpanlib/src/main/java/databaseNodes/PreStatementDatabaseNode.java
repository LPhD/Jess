package databaseNodes;

import java.util.HashMap;
import java.util.Map;

import ast.ASTNode;
import ast.preprocessor.PreStatementBase;

public class PreStatementDatabaseNode extends DatabaseNode {

	PreStatementBase astRoot;

	@Override
	public void initialize(Object obj) {
		astRoot = (PreStatementBase) obj;
	}

	@Override
	public Map<String, Object> createProperties() {
		HashMap<String, Object> map = new HashMap<String, Object>();

		map.put(NodeKeys.NODE_TYPE, astRoot.getTypeAsString());
		map.put(NodeKeys.CODE, astRoot.getEscapedCodeStr());
		map.put(NodeKeys.LOCATION, astRoot.getLocationString());
		map.put(NodeKeys.CHILD_NUMBER, Integer.toString(astRoot.getChildNumber()));

		return map;
	}

	public ASTNode getASTRoot() {
		return astRoot;
	}

}
