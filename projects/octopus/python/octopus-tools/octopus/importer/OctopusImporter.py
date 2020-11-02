import sys, os
import http.client
import urllib

from octopus.server.project_manager import ProjectManager
from octopus.server.plugin_executor import PluginExecutor

class OctopusImporter:
    def __init__(self):
        pass

    def importFile(self, filename, projectName):
        self.filename = filename
        self.projectName = projectName

        self.initProjectManager()
        self.initPluginExecutor()

        self.createProject()
        self.executeImporterPlugin()

    def initProjectManager(self):
        self.projectManager = ProjectManager()
        self.projectManager.connect()

    def initPluginExecutor(self):
        self.pluginExecutor = PluginExecutor()

    def createProject(self):
        print('Creating project: %s' % (self.projectName))
        print(self.projectManager.create(self.projectName))


    def executeImporterPlugin(self):
        print('Executing importer plugin')
        print('plugin name: %s\n' % self.pluginName)
        srcDir = os.getcwd() +"/"+ self.filename
        pluginSettings = { 'projectName' : self.projectName, 'srcDir' : srcDir }
        print(self.pluginExecutor.execute(self.pluginName, self.pluginClass, pluginSettings))
