package databaseNodes;

import java.util.HashMap;
import java.util.Map;
import ast.logical.statements.Condition;

public class PreConditionDatabaseNode extends DatabaseNode{

	Condition condition;

	@Override
	public void initialize(Object obj)	{
		condition = (Condition) obj;

	}

	@Override
	public Map<String, Object> createProperties()	{
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put(NodeKeys.NODE_TYPE, condition.getTypeAsString());
		map.put(NodeKeys.CODE, condition.getEscapedCodeStr());
		map.put(NodeKeys.LOCATION, condition.getLocationString());
		map.put(NodeKeys.CHILD_NUMBER, Integer.toString(condition.getChildNumber()));
		
		return map;
	}
	

}
