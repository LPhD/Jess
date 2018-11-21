package octopus.server.restServer.handlers;

import octopus.api.projects.OctopusProject;
import octopus.api.projects.ProjectManager;
import octopus.server.database.titan.JanusGraphLocalDatabaseManager;
import octopus.server.restServer.OctopusRestHandler;
import spark.Request;
import spark.Response;

public class ResetDatabaseHandler implements OctopusRestHandler {

	@Override
	public Object handle(Request req, Response resp)
	{
		String projectName = req.params(":projectName");
		ProjectManager manager = new ProjectManager();
		if(!manager.doesProjectExist(projectName))
			return "Project does not exist.";

		OctopusProject project = manager.getProjectByName(projectName);

		JanusGraphLocalDatabaseManager dbManager = new JanusGraphLocalDatabaseManager();
		dbManager.resetDatabase(project);
		return "Database reset carried out.";
	}

}
