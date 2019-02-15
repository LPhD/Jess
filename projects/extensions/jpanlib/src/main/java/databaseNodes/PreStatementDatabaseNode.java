package databaseNodes;

import java.util.HashMap;
import java.util.Map;

import ast.logical.statements.BlockStarter;

public class PreStatementDatabaseNode extends DatabaseNode{

	BlockStarter preBlock;

	@Override
	public void initialize(Object obj)	{
		preBlock = (BlockStarter) obj;

	}

	@Override
	public Map<String, Object> createProperties()	{
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put(NodeKeys.NODE_TYPE, preBlock.getTypeAsString());
		map.put(NodeKeys.CODE, preBlock.getEscapedCodeStr());
		map.put(NodeKeys.LOCATION, preBlock.getLocationString());
		map.put(NodeKeys.CHILD_NUMBER, Integer.toString(preBlock.getChildNumber()));
		
		return map;
	}
	



}
