package databaseNodes;

import java.util.Map;

public abstract class DatabaseNode {
	
	private long nodeId;

	abstract public void initialize(Object obj);

	abstract public Map<String, Object> createProperties();
	

	public long getNodeId() {
		return nodeId;
	}

	public void setNodeId(long nodeId) {
		this.nodeId = nodeId;
	}
}
