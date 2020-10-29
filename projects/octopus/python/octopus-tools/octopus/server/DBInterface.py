from octopus.server.python_shell_interface import PythonShellInterface

import os, json

class DBInterface:

    def __init__(self):
        self.transformer = ResultTransformer()
        self.jsonEnabled = True;

    def disable_json(self):
        self.jsonEnabled = False;

    def connectToDatabase(self, databaseName = 'octopusDB'):
        print("1")
        self.j = PythonShellInterface()
        print("2")
        self.j.setDatabaseName(databaseName)
        print("3")
        self.j.connectToDatabase()
        print("4")

        #if self.jsonEnabled:
            #self.j.runGremlinQuery('toggle_json')
            
        print("5")   

            
    def close(self):
         PythonShellInterface().close()       

    def runGremlinQuery(self, query):
    
 #       print('DBI _______________________##############_______________________________')
 #       print(self)
 #       print(query)
 #       print('DBIENDE ____________________################__________________________________')
        
        result = self.j.runGremlinQuery(query)

        if not self.jsonEnabled:
            return result
                    
        return self.transformer.transform(result)


    def chunks(self, ids, chunkSize):
        return self.j.chunks(ids, chunkSize)


class ResultTransformer(object):

    def transform(self, jsonMessage):

        if not len(jsonMessage) == 1:
            raise

        o = json.loads(jsonMessage[0])
        resultData = o['result']['data']
        if not isinstance(resultData, list):
            resultData = [resultData]
        return resultData
