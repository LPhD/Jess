package parsing;

import java.util.Observer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import parsing.Modules.CModuleParserTreeListener;

public class ModuleParser {
	ANTLRParserDriver parserDriver;
	private static final Logger logger = LoggerFactory.getLogger(ModuleParser.class);

	public ModuleParser(ANTLRParserDriver driver) {
		parserDriver = driver;
	}

	public void parseFile(String filename) {
		logger.debug(filename);

		try {
			parserDriver.parseAndWalkFile(filename);
		} catch (ParserException ex) {
			System.err.println("Error parsing file: " + filename);
		}
	}

	public void addObserver(Observer anObserver) {
		parserDriver.addObserver(anObserver);
	}

	/*
	 * Testing
	 **/

	public void parseString(String code) {
		try {
			parserDriver.parseAndWalkString(code);
		} catch (ParserException ex) {
			System.err.println("Error parsing string.");
		}
	}

}
