package octopus.api.plugin;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.json.JSONObject;

import octopus.OctopusEnvironment;
import octopus.server.pluginInterface.PluginLoader;

public class PluginExecutor {

	public Object executePlugin(String pluginName, String pluginClass) {
		return executePlugin(pluginName, pluginClass, null);
	}

	public Object executePlugin(String pluginName, String pluginClass, JSONObject settings) {
		Plugin plugin;

		if (!pluginName.equals("")) {
			String pluginDir = OctopusEnvironment.PLUGINS_DIR.toString();
			Path pathToJar = Paths.get(pluginDir, pluginName).toAbsolutePath();
			plugin = PluginLoader.load(pathToJar, pluginClass);
		} else {
			plugin = PluginLoader.load(pluginClass);
		}

		if (plugin == null)
			throw new RuntimeException("Error while loading plugin " + pluginName);

		try {
			if (settings != null)
				plugin.configure(settings);
			plugin.beforeExecution();
			System.out.println("execute");
			plugin.execute();
			System.out.println("afterExecution");
			plugin.afterExecution();
			return plugin.result();
		} catch (Exception e) {
			System.out.println("Exception during plugin execution of: "+pluginName);
			System.out.println(e.getMessage());
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
	}

}
