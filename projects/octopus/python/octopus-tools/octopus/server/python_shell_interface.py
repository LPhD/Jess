from octopus.server.shell_manager import ShellManager
from octopus.shell.octopus_shell import OctopusShellConnection
import time

DEFAULT_HOST = 'localhost'
DEFAULT_PORT = '2480'
DEFAULT_DATABASE_NAME = 'octopusDB'


class PythonShellInterface:

    def __init__(self):
        self._initializeDefaults()

    def _initializeDefaults(self):
        self.host = DEFAULT_HOST
        self.port = DEFAULT_PORT
        self.databaseName = DEFAULT_DATABASE_NAME
        print("Initialize")

    def setHost(self, host):
        self.host = host

    def setPort(self, port):
        self.port = port

    def setDatabaseName(self, databaseName):
        self.databaseName = databaseName

    def connectToDatabase(self):
        self._createShellManagerAndConnection()
        print("1a")
        self.shell_connection = self._getOrCreateFreeShell()
        print("Connected")

  
    def _getOrCreateFreeShell(self):

        while True:
            try:
                shell = self._getExistingFreeShell()
                
                if not shell:
                    print("3aa")
                    shell = self._createNewShell()
                    print("4aa")
                    
                print("5aa")    
                return shell
            
            except ConnectionRefusedError:
                time.sleep(0.1)

    def _getExistingFreeShell(self):

        self._retrieveShellsFromServer()
        if len(self.freeShellsForDatabase) == 0:
            return None
        return self._connectToShellWithPort(self.freeShellsForDatabase[0][0])


    def _retrieveShellsFromServer(self):

        self.shells = list(self.shell_manager.list())
        prefix = self._getPythonShellPrefix()

        self.shellsForDatabase = [(port, name, occupied) for (port, dbName, name, occupied) in self.shells
                                  if name.startswith(prefix)]

        self.freeShellsForDatabase = [(port, name)
                                      for (port, name, occupied) in self.shellsForDatabase
                                      if occupied == 'free']

    def _connectToShellWithPort(self, port):
        print("4aaa")
        #connection = OctopusShellConnection(self.host, port)
        print("5aaa")
        #connection.connect()
        print("6aaa")
        #return connection
        return ""

    def _createNewShell(self):
        shellname = self._generateNameForNewShell()
        print("1aaa")
        #Here
        port = self.shell_manager.create(self.databaseName, shellname)
        print("2aaa")
        return ""#self._connectToShellWithPort(port)

    def _generateNameForNewShell(self):
        prefix = self._getPythonShellPrefix()
        number = self._getNumberForNewShell()
        return prefix + '_' + str(number)

    def _getPythonShellPrefix(self):
        return ".python#" + self.databaseName

    def _getNumberForNewShell(self):
        shellnumbers = [int(name.split('#')[2]) for (port, name, occupied) in self.shellsForDatabase]
        if len(shellnumbers) == 0: return 0
        shellnumbers.sort()
        highestShellNumber = shellnumbers[-1]
        return highestShellNumber + 1


    def _createShellManagerAndConnection(self):
        print("Creating shells")
        self.shell_manager = ShellManager(self.host, self.port)
        self.shell_connection = OctopusShellConnection(self.host, self.port)
        
         
    # Close connection (to avoid db lock)
    def close(self):
        print("Try to close")
        OctopusShellConnection(self.host, self.port).close()
        #ShellManager(self.host, self.port).disconnect()
                   

    def runGremlinQuery(self, query):

#        print('TEST IN PYTHON_SHELL_INTERFACE______________________________________________________')
#        print(self)
 #       print(query)
 #       print('TESTENDE IN PYTHON_SHELL_INTERFACE______________________________________________________')
        print("Run query "+query)
        while True:
            try:
                result = self.shell_connection.run_command(query)
                return result
            except ConnectionResetError:
                self.shell_connection = self._getOrCreateFreeShell()
                time.sleep(0.1)

               
    """
    Create chunks from a list of ids.
    This method is useful when you want to execute many independent
    traversals on a large set of start nodes. In that case, you
    can retrieve the set of start node ids first, then use 'chunks'
    to obtain disjoint subsets that can be passed to idListToNodes.
    """
    def chunks(self, idList, chunkSize):
        for i in range(0, len(idList), chunkSize):
            yield idList[i:i+chunkSize]
