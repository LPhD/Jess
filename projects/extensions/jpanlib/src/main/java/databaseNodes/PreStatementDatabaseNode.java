package databaseNodes;

import java.util.HashMap;
import java.util.Map;

import ast.preprocessor.PreStatementBase;

public class PreStatementDatabaseNode extends DatabaseNode{

	PreStatementBase preStatement;

	@Override
	public void initialize(Object obj)	{
		preStatement = (PreStatementBase) obj;
	}

	@Override
	public Map<String, Object> createProperties()	{
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put(NodeKeys.NODE_TYPE, preStatement.getTypeAsString());
		map.put(NodeKeys.CODE, preStatement.getEscapedCodeStr());
		map.put(NodeKeys.LOCATION, preStatement.getLocationString());
		map.put(NodeKeys.CHILD_NUMBER, Integer.toString(preStatement.getChildNumber()));
		
		return map;
	}
	



}
