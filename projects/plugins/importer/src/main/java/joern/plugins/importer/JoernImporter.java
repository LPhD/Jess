package joern.plugins.importer;

import java.io.File;
import java.io.IOException;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fileWalker.OrderedWalker;
import joern.api.JoernProject;
import joern.api.plugintypes.JoernProjectPlugin;
import octopus.server.decompressor.TarballDecompressor;

public class JoernImporter extends JoernProjectPlugin {

	private static final Logger logger = LoggerFactory.getLogger(JoernImporter.class);

	private boolean uncompress = true;
	private boolean parsecode = true;
	private boolean importcsv = true;

	private JoernProject joernProject;

	@Override
	public void configure(JSONObject settings) {
		super.configure(settings);

		if (settings.has("nouncompress"))
			uncompress = false;
		if (settings.has("noparsecode"))
			parsecode = false;
		if (settings.has("noimportcsv"))
			importcsv = false;
	}

	@Override
	public void execute() throws Exception {
		openProject();
		if (uncompress)
			uncompressArchive();
		if (parsecode)
			parseSourceCode();
		if (importcsv)
			importCSVFilesIntoDatabase();
		
		System.out.println("Close project");
		
		//Close project?
		joernProject = null;
	}

	private void openProject() {
		joernProject = (JoernProject) getProjectConnector().getWrapper();
	}

	private void uncompressArchive() throws IOException {
		logger.warn("Beginn uncompressing archive");
		
		File tarballFilename = new File(joernProject.getTarballName());
		File outputDirectory = new File(joernProject.getSourceCodeDirectory());

		logger.debug("uncompressing archive: " + tarballFilename);
		logger.debug("output directory: " + outputDirectory);

		TarballDecompressor.decompress(tarballFilename, outputDirectory);

		logger.warn("Decompression successful");
	}

	private void parseSourceCode() {
		logger.warn("Parsing code");

		String parserOutputDirectory = joernProject.getParserOutputDirectory();
		String sourceCodeDirectory = joernProject.getSourceCodeDirectory();

		CParserWrapper parserWrapper = new CParserWrapper();
		parserWrapper.setMultiFileOutput(false);
		parserWrapper.initialize(parserOutputDirectory);
		parserWrapper.walkCodebase(new String[] { sourceCodeDirectory });

		logger.warn("Parsing complete");
	}

	private void importCSVFilesIntoDatabase() throws IOException {
		logger.warn("Importing graph");

		String parserOutputDirectory = joernProject.getParserOutputDirectory();

		OrderedWalker walker = new OrderedWalker();
		walker.setFilenameFilter("*nodes.csv");
		ImporterListener listener = new ImporterListener();
		listener.setProject(joernProject);

		walker.addListener(listener);
		walker.walk(new String[] { parserOutputDirectory });

		logger.warn("Import complete");
	}

}
