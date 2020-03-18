package joern.plugins.importer;

import java.io.IOException;

import fileWalker.OrderedWalker;
import fileWalker.SourceFileWalker;
import tools.parser.CParserCSVOutput;

public class CParserWrapper {

	private static SourceFileWalker sourceFileWalker = new OrderedWalker();
	private static CParserCSVOutput parser = new CParserCSVOutput();
	private boolean multiFileOutput = false;

	public void setMultiFileOutput(boolean multiFileOutput) {
		this.multiFileOutput = multiFileOutput;
	}

	public void initialize(String outputDir) {
		parser.setOutputDir(outputDir);
		parser.setMultiFileOutput(multiFileOutput);
		parser.initialize();
		sourceFileWalker.addListener(parser);
	}

	public void walkCodebase(String[] fileAndDirNames) {
		System.out.println("Begin walking");
		
		for (String string : fileAndDirNames) {
			System.out.println(string);
		}

		try {
			sourceFileWalker.walk(fileAndDirNames);
			System.out.println("Walking end");
		} catch (IOException err) {
			System.err.println("Error walking source files: " + err.getMessage());
		} finally {
			parser.shutdown();
			System.out.println("Shutdown");
		}
	}

}
