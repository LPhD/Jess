package octopus.plugins.csvimporter;


import java.nio.file.Paths;

import octopus.api.csvImporter.CSVImporter;
import octopus.api.plugin.types.OctopusProjectPlugin;
import octopus.server.importer.csv.ImportJob;

public class CSVImporterPlugin extends OctopusProjectPlugin {

    @Override
    public void execute() throws Exception {

    	System.out.println("Execute");
        String projectName = getProjectName();
        String pathToProjecDir = getPathToProjectDir();
        String nodeFilename = Paths.get(pathToProjecDir, "nodes.csv").toString();
        String edgeFilename = Paths.get(pathToProjecDir, "edges.csv").toString();

        System.out.println("Start importer");
        ImportJob importJob = new ImportJob(nodeFilename, edgeFilename, projectName);
        System.out.println("New importer");
        (new CSVImporter()).importCSV(importJob);
        System.out.println("Finish importer");
    }

}
