package databaseNodes;

import java.util.LinkedList;

public class PreStatementDatabaseNode extends ASTDatabaseNode {

	/**
	 * Contains all database node ids that are annotated with the current #if/#elif/#else 
	 */
	protected LinkedList<Long> variableStatementIDs;
	protected int vStatementsNumber;
	
	public void addVariableStatementID(Long nodeID) {
		if (variableStatementIDs == null)
			variableStatementIDs = new LinkedList<Long>();
		this.setVStatementsNumber(variableStatementIDs.size());
		variableStatementIDs.add(nodeID);
	}

	public int getVariableStatementsCount() {
		if (variableStatementIDs == null)
			return 0;
		return variableStatementIDs.size();
	}

	public Long getVariableStatementID(int i) {
		if (variableStatementIDs == null)
			return null;

		Long retval;
		try {
			retval = variableStatementIDs.get(i);
		} catch (IndexOutOfBoundsException ex) {
			return null;
		}
		return retval;
	}

	public Long popLastVariableStatementID() {
		return variableStatementIDs.removeLast();
	}

	public int getVStatementsNumber() {
		return this.vStatementsNumber;
	}

	public void setVStatementsNumber(int num) {
		this.vStatementsNumber = num;
	}

}
