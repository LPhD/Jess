package ast;

public class CodeLocation {

	final public static int NOT_SET = -1;

	public int startLine = NOT_SET;
	public int endLine = NOT_SET;
	public int startPos = NOT_SET;
	public int startIndex = NOT_SET;
	public int stopIndex = NOT_SET;
	public String path = "";

	@Override
	public String toString() {
		return String.format("Path: "+path+" Lines: %d:%d:%d:%d", startLine, startPos, startIndex, stopIndex);
	}

}
