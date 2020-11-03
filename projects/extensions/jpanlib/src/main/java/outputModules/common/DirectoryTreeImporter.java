package outputModules.common;

import java.io.File;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Stack;
import databaseNodes.ASTDatabaseNode;
import databaseNodes.FileDatabaseNode;
import includeAnalysis.IncludeAnalyzer;
import outputModules.parser.ParserState;

public abstract class DirectoryTreeImporter {
	protected ParserState state;
	protected Stack<FileDatabaseNode> directoryStack = new Stack<FileDatabaseNode>();
	protected HashMap<String, FileDatabaseNode> headerList = new HashMap<String, FileDatabaseNode>();
	protected HashMap<String, FileDatabaseNode> cFileList = new HashMap<String, FileDatabaseNode>();
	protected String outputDir;

	public void setState(ParserState aState) {
		state = aState;
	}

	public void enterDir(Path dir) {
		FileDatabaseNode node = new FileDatabaseNode();
		insertDirectoryNode(dir, node);
		linkWithParentDirectory(node);
		directoryStack.push(node);
	}

	//Dirs are exited from leaf to root (from lower to higher)
	public void exitDir(Path dir) {	
		//Leave directory
		directoryStack.pop();
		
		//Just analyze once when the top dir is reached
		if (directoryStack.isEmpty()){
			//Connect c files with its header files
			matchHeaderToFile();
			//Connect files with included files
			matchIncludeToFile();
			//Finally clear both lists, as they persist as long as the server is running
			IncludeAnalyzer.includeNodeList.clear();
			IncludeAnalyzer.fileNodeList.clear();
		}		
	}

	public void enterFile(Path pathToFile) {
		FileDatabaseNode node = new FileDatabaseNode();
		insertFileNode(pathToFile, node);
		linkWithParentDirectory(node);
		state.setCurrentFileNode(node);
		
		//Adds file to list of files for this directory
		IncludeAnalyzer.fileNodeList.put(node.getFileName(), node);
		
		// Adds file to header list or c file list (or none of them)
		String nodeName = node.getFileName();
		if(nodeName.endsWith(".h")) {
			//Remove the file ending
			nodeName = nodeName.substring(0, nodeName.length() - 2);
			headerList.put(nodeName, node);
		} else if (nodeName.endsWith(".c")) {
			//Remove the file ending
			nodeName = nodeName.substring(0, nodeName.length() - 2);
			cFileList.put(nodeName, node);
		}
	}

	protected void insertDirectoryNode(Path dir, FileDatabaseNode node) {
		node.initialize(dir);
		node.setType("Directory");
		insertNode(node);
	}

	protected void insertFileNode(Path dir, FileDatabaseNode node) {
		node.initialize(dir);
		node.setType("File");
		insertNode(node);
	}

	protected long getSourceIdFromStack() {
		long srcId;
		if (directoryStack.size() == 0)
			srcId = 0; // reference node
		else
			srcId = directoryStack.peek().getId();
		return srcId;
	}

	public String getOutputDir() {
		return outputDir;
	}

	public void setOutputDir(String outputDir) {
		this.outputDir = outputDir;
	}
	
	/**
	 * Matches the nodes in headerList with the nodes in cFileList and connects them with
	 * an "IS_HEADER_OF" link. Then removes both files from the list.
	 */
	public void matchHeaderToFile() {
		//For each c file
		cFileList.forEach((cKey,cValue) -> {
			// If there exists a header with the same name
			if (headerList.containsKey(cKey)) {
				// Connect the header file to the c file
				linkHeaderToCFile(headerList.get(cKey), cValue);
				// Then remove the header file from the list
				headerList.remove(cKey);
			}
		});
	}
	
	
	
	/**
	 * Matches the fileDatabaseNodes in IncludeAnalyzer.fileNodeList with the
	 * includeNodes in IncludeAnalyzer.includeNodeList and connects them with an
	 * include link. Then removes the includeNode from the list.
	 */
	public void matchIncludeToFile() {	
		File filename;
			for (ASTDatabaseNode includeNode : IncludeAnalyzer.includeNodeList) {
				//Remove whitespaces and quotes from filename
				filename = new File(includeNode.getAstNode().getEscapedCodeStr().replaceAll("\"|\\s+", ""));
				
				//Draw includes-connection if filename and included filename match
				if(IncludeAnalyzer.fileNodeList.containsKey(filename.getName())) {
					linkIncludeToFileNode(includeNode, IncludeAnalyzer.fileNodeList.get(filename.getName()));
				}	
			}	
	}
	

	
	protected abstract void linkWithParentDirectory(FileDatabaseNode node);
	protected abstract void insertNode(FileDatabaseNode node);
	protected abstract void linkIncludeToFileNode(ASTDatabaseNode preDBNode, FileDatabaseNode node);
	protected abstract void linkHeaderToCFile(FileDatabaseNode header, FileDatabaseNode cFile);
}
