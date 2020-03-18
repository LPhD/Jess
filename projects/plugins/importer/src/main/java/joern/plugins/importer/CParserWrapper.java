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
		System.out.println("Begin");
		parser.setOutputDir(outputDir);
		System.out.println("set output");
		parser.setMultiFileOutput(multiFileOutput);
		System.out.println("set multi output");
		parser.initialize();
		System.out.println("Initialize");
		sourceFileWalker.addListener(parser);
		System.out.println("add listener");
	}

	public void walkCodebase(String[] fileAndDirNames) {
		System.out.println("Begin walking");
		System.out.println(fileAndDirNames.toString());
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
