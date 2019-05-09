package ast;

public class CodeLocation {

	final public static int NOT_SET = -1;

	public int startLine = NOT_SET;
	public String path = "";

	@Override
	public String toString() {
		return String.format("Path: "+path+" , Startline: %d", startLine);
	}

}
