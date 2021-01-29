package ast;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import ast.expressions.Expression;
import ast.walking.ASTNodeVisitor;

public class ASTNode {
	private Map<String, String> properties;
	private String path = "-1";
	private int line = -1;
	private int charAtLine = -1;
	private Long nodeId;

	private boolean isInCFG = false;

	protected LinkedList<ASTNode> children;
	protected int childNumber;

	/* constructors */

	public ASTNode() {
	}

	public ASTNode(ASTNode otherNode) {
		copyAttributes(otherNode);
		copyChildren(otherNode);
	}

	/* private helper methods */

	private void copyAttributes(ASTNode otherNode) {
		setCodeStr(otherNode.getCodeStr());
		path = otherNode.path;
		line = otherNode.line;
		charAtLine = otherNode.charAtLine;
		setChildNumber(otherNode.childNumber);
		if (otherNode.isInCFG())
			markAsCFGNode();
	}

	private void copyChildren(ASTNode otherNode) {
		if (otherNode.children != null) {
			for (ASTNode n : otherNode.children) {
				addChild(new ASTNode(n));
			}
		}
	}

	/* methods for handling children */

	public void addChild(ASTNode node) {
		if (children == null)
			children = new LinkedList<ASTNode>();
		node.setChildNumber(children.size());
		children.add(node);
	}

	public int getChildCount() {
		if (children == null)
			return 0;
		return children.size();
	}

	public boolean isLeaf() {
		return (children.size() == 0);
	}

	public ASTNode getChild(int i) {
		if (children == null)
			return null;

		ASTNode retval;
		try {
			retval = children.get(i);
		} catch (IndexOutOfBoundsException ex) {
			return null;
		}
		return retval;
	}

	public ASTNode popLastChild() {
		return children.removeLast();
	}

	/* getters and setters */

	public String getProperty(String key) {
		if (properties == null)
			return null;

		String retval = properties.get(key);
		if (retval == null)
			return null;
		return retval;
	}

	public void setProperty(String key, String val) {
		if (properties == null)
			properties = new HashMap<String, String>();

		properties.put(key, val);
	}

	public String getFlags() {
		return getProperty(ASTNodeProperties.FLAGS);
	}

	public void setFlags(String flags) {
		setProperty(ASTNodeProperties.FLAGS, flags);
	}

	public int getChildNumber() {
		return this.childNumber;
	}

	public void setChildNumber(int num) {
		this.childNumber = num;
	}

	public String getEscapedCodeStr() {
		return getCodeStr();
	}

	protected String getCodeStr() {
		return getProperty(ASTNodeProperties.CODE);
	}

	public void setCodeStr(String aCodeStr) {
		setProperty(ASTNodeProperties.CODE, aCodeStr);
	}

	public Long getNodeId() {
		Long id;
		if (nodeId == null) {
			System.err.println("Trying to retrieve node ID for node " + super.toString() + ", but none is set " + "(type = "
							+ getTypeAsString() + ", path = "+ path + ", line = " + line + ", code = " + getCodeStr() + ")");
			new Exception().printStackTrace();
			id = -1l;
		} else {
			id = this.nodeId;
		}
		return id;
	}

	public void setNodeId(Long id) {
		setProperty(ASTNodeProperties.NODE_ID, Long.toString(id));
		this.nodeId = id;
	}
	
	/**
	 * Set the linenumber 
	 * 
	 * @param path
	 */
	public void setLine(int line) {
		this.line = line;
	}
	
	/**
	 * Get the linenumber 
	 * 
	 */
	public int getLine() {
		return line;
	}
	
	public int getCharAtLine() {
		return charAtLine;
	}

	public void setCharAtLine(int charAtLine) {
		this.charAtLine = charAtLine;
	}
	

	/**
	 * Set the filepath 
	 * 
	 * @param path
	 */
	public void setPath(String path) {
		this.path = path;
	}
	
	/**
	 * Get the filepath
	 * 
	 */
	public String getPath() {
		return path;
	}

	public String getTypeAsString() {
		return this.getClass().getSimpleName();
	}

	public String getFullTypeName() {
		return this.getClass().getName();
	}

	/* special methods */

	public String getOperatorCode() {
		if (Expression.class.isAssignableFrom(this.getClass())) {
			return ((Expression) this).getOperator();
		}
		return null;
	}

	public void accept(ASTNodeVisitor visitor) {
		visitor.visit(this);
	}

	public void markAsCFGNode() {
		isInCFG = true;
	}

	public boolean isInCFG() {
		return isInCFG;
	}

	/* overrides */

	@Override
	public String toString() {
		if (null != getEscapedCodeStr() && null != getProperty(ASTNodeProperties.NODE_ID))
			return "[(" + getNodeId() + ") " + getEscapedCodeStr() + "]";
		if (null != getEscapedCodeStr())
			return "[" + getEscapedCodeStr() + "]";
		if (null != getProperty(ASTNodeProperties.NODE_ID))
			return "[(" + getNodeId() + ") " + getTypeAsString() + "]";

		return super.toString();
	}
}
