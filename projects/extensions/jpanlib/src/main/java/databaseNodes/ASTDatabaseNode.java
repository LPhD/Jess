package databaseNodes;

import java.util.HashMap;
import java.util.Map;

import ast.ASTNode;
import ast.expressions.Expression;

public class ASTDatabaseNode extends DatabaseNode {

	private ASTNode astNode;
	private FunctionDatabaseNode currentFunction;
	private boolean insideFunctionBlock;

	@Override
	public void initialize(Object node) {
		astNode = (ASTNode) node;
	}

	@Override
	public Map<String, Object> createProperties() {

		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put(NodeKeys.NODE_TYPE, astNode.getTypeAsString());

		// Only calculate and store code strings for
		// leave-nodes and statements
		// if(astNode.getChildCount() == 0)
		properties.put(NodeKeys.CODE, astNode.getEscapedCodeStr());

		//Always get the location
		properties.put(NodeKeys.LINE, getCorrectedLineString());
		properties.put(NodeKeys.PATH, astNode.getPath());
		properties.put(NodeKeys.CLINE, ""+astNode.getCharAtLine());

		if (astNode.isInCFG()) {
			properties.put(NodeKeys.IS_CFG_NODE, "True");
		}

		if (astNode instanceof Expression) {
			String operator = ((Expression) astNode).getOperator();
			if (operator != "")
				properties.put(NodeKeys.OPERATOR, operator);
		}

		// if(astNode.getChildCount() > 1){
		String childNumStr = Integer.toString(astNode.getChildNumber());
		properties.put(NodeKeys.CHILD_NUMBER, childNumStr);
		// }		

		return properties;
	}

	private String getCorrectedLineString() {

		int line = astNode.getLine();

		if (this.isInsideFunctionBlock()) {
			int funcLocation = currentFunction.getContentLine();

			line += funcLocation - 1;
		}

		return ""+line;
	}
	
	
	public void setInsideFunctionBlock(boolean flag) {
		    this.insideFunctionBlock = flag;
		  }
	  
	public boolean isInsideFunctionBlock() {
		    return this.insideFunctionBlock;
		  }

	public FunctionDatabaseNode getCurrentFunction() {
		return currentFunction;
	}

	public void setCurrentFunction(FunctionDatabaseNode currentFunction) {
		this.currentFunction = currentFunction;
	}
	
	public ASTNode getAstNode() {
		return astNode;
	}

}
