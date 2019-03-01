package includeAnalysis;

import databaseNodes.DatabaseNode;
import graphutils.Edge;

public class IncludeEdge extends Edge<DatabaseNode>{

	private static final String DEFAULT_LABEL = "INCLUDES";
	
	public IncludeEdge(DatabaseNode source, DatabaseNode destination) {
		super(source, destination);
	}
	
	@Override
	public String toString() {
		return getSource() + " ==[" + DEFAULT_LABEL + "]==> " + getDestination();
	}

}
