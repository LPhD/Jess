package octopus.server.restServer.handlers;

import octopus.api.projects.ProjectManager;
import octopus.server.restServer.OctopusRestHandler;
import spark.Request;
import spark.Response;

public class CreateProjectHandler implements OctopusRestHandler {

	@Override
	public Object handle(Request req, Response resp) {
		String projectName = req.params(":projectName");
		ProjectManager manager = new ProjectManager();
		System.out.println("Try to create project");
		manager.create(projectName);
		System.out.println("Project created!");
		return "Project created.";
	}

}
