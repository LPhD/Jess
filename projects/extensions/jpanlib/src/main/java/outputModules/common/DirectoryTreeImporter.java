package outputModules.common;

import java.nio.file.Path;
import java.util.Stack;

import databaseNodes.ASTDatabaseNode;
import databaseNodes.DatabaseNode;
import databaseNodes.FileDatabaseNode;
import includeAnalysis.IncludeAnalyzer;
import outputModules.parser.ParserState;

public abstract class DirectoryTreeImporter {
	protected ParserState state;
	protected Stack<FileDatabaseNode> directoryStack = new Stack<FileDatabaseNode>();

	protected abstract void linkWithParentDirectory(FileDatabaseNode node);

	protected abstract void insertNode(FileDatabaseNode node);

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

	public void exitDir(Path dir) {
		//Test outputs
		System.out.println("Current files: ");		
		for (FileDatabaseNode node : IncludeAnalyzer.fileNodeList) {
			System.out.println(node.getFileName());			
		}
		System.out.println("Current includes: ");		
		for (ASTDatabaseNode node : IncludeAnalyzer.includeNodeList) {
			System.out.println(node.toString());			
		}
		matchIncludeToFile();
		//Clears list of include statements and files in this directory
		IncludeAnalyzer.includeNodeList.clear();
		IncludeAnalyzer.fileNodeList.clear();
		directoryStack.pop();
	}

	public void enterFile(Path pathToFile) {
		FileDatabaseNode node = new FileDatabaseNode();
		insertFileNode(pathToFile, node);
		linkWithParentDirectory(node);
		state.setCurrentFileNode(node);
		//Adds file to list of files for this directory
		IncludeAnalyzer.fileNodeList.add(node);
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
	 * Matches the fileDatabaseNodes in IncludeAnalyzer.fileNodeList with the
	 * includeNodes in IncludeAnalyzer.includeNodeList and connects them with
	 * an include link. Them removes the includeNode from the list.
	 */
	public void matchIncludeToFile() {
		String filename = "";
		for (FileDatabaseNode fileDatabaseNode : IncludeAnalyzer.fileNodeList) {
			for (ASTDatabaseNode includeNode : IncludeAnalyzer.includeNodeList) {
				filename = (includeNode.getAstNode().getEscapedCodeStr()).replaceAll("\"|\\s", "");
				System.out.println(filename);
				if(filename.equals(fileDatabaseNode.getFileName())) {
					System.out.println("Match: " +fileDatabaseNode.getFileName());	
					System.out.println(" with: "+includeNode.getAstNode().getEscapedCodeStr());	
					linkIncludeToFileNode(includeNode, fileDatabaseNode);
					 //Remove the include node as it can only include one file
					IncludeAnalyzer.includeNodeList.remove(includeNode);
				}				
			}
			
		}
	}

	protected abstract void linkIncludeToFileNode(ASTDatabaseNode preDBNode, FileDatabaseNode node);

}
