#!/usr/bin/env python3

import os
import argparse 
import pygraphviz as pgv

from argparse import FileType
from octopus.server.DBInterface import DBInterface
from joern.shelltool.ProgramGraph import ProgramGraph
from joern.shelltool.PlotConfiguration import PlotConfiguration

DESCRIPTION = """Retrieve all graph representations of a function with the given
id. The default output format is graphviz's 'dot'. Invoke with "python3 plot.py [ProjectName]"
"""

class Plot(ProgramGraph):
    def __init__(self):  
        ProgramGraph.__init__(self, DESCRIPTION)
        
        #argparse.SUPPRESS supresses the input of the parameters on the terminal
        self.argParser.add_argument('-P', '--id-property', action='store_true', default=False,
                                    help=argparse.SUPPRESS)
        
        #Possible graph types       
        #'ALL' takes wayyyy to long or doesnt work      
        self.types = ['AST', 'CDG', 'CFG', 'CDGCFG', 'DDGCFG', 'DFGCFG', 'DFGCFGDDG', 'DOM', 'ALL']
        self.currentType = self.types[0]
        
    # @Override   
    def _runImpl(self):
        #Needed for connection to db in JoernTool.py
        self.streamStart()
        #Start without input via 'echo functionID |', thus no self._processStream and dummy input '0'
        self.processLine(0)
        
    # @Override
    def processLine(self, line):    
        print("Read configuration")
        self.plot_configuration = PlotConfiguration()
        #Config is read from plotconfig.cfg in same folder as plot.py
        f = open((os.path.join(os.path.dirname(__file__), 'plotconfig.cfg')) , "r")
        self.plot_configuration.parse(f)
        
        #For every graph type
        for graphType in self.types:
            self.currentType = graphType
            print("Starting with "+graphType+" Graph...")
            #For every function in the project
            for nodeId in self.getFunctions():
                print("Generate "+graphType+" Graph for "+str(nodeId))
                #Get needed information
                self.currentNode = nodeId                
                labels = self._getLabels()
                print("Get nodes")
                nodes = self._getNodes(nodeId, labels)
                print("Get edges")
                ####Dauert zu lange ############################################# ALL DDGCFG DFGCFGDDG
                edges = self._getEdges(nodeId, labels)
                #Make the graph
                print("Make graph")
                G = pgv.AGraph(directed=True, strict=False)
                print("_addNodes")
                self._addNodes(G, nodes)
                print("_addEdges")
                self._addEdges(G, edges)
                self._outputGraph(G, str(nodeId)) 
            
    # @Override
    def _getLabels(self):
        print("Get labels")
        labels = ["FLOWS_TO", "REACHES", "CONTROLS", "DOM", "POST_DOM", "USE", "DEF", "IS_AST_PARENT"]
        if self.currentType == 'ALL':
            return labels

        #Remove labels that are not needed for current graph type
        if 'CFG' not in self.currentType:
            labels.remove("FLOWS_TO")
        if 'DDG' not in self.currentType:
            labels.remove("REACHES")
        if 'CDG' not in self.currentType:
            labels.remove("CONTROLS")
        if 'DOM' not in self.currentType:
            labels.remove("DOM")
            labels.remove("POST_DOM")
        if 'DFG' not in self.currentType:
            labels.remove("USE")
            labels.remove("DEF")
        if 'AST' not in self.currentType:
            labels.remove("IS_AST_PARENT")

        return labels            
        
    # @Override   
    def output(self, s):
        #Current project name
        project = self.args.project
        #Remove archive filtype from project name
        project = project.replace('.tar.gz', '')
        #Paths for different files
        dotPath = project+"/"+self.currentType+'/Dotfiles/'
        pngPath = project+"/"+self.currentType+'/PNGfiles/'
        #Create folder with name of project (if its not already there)
        if not os.path.exists(project):
            os.makedirs(project)
        #Create folder with name of graph type for plots (if its not already there)
        if not os.path.exists(project+"/"+self.currentType):
            os.makedirs(project+"/"+self.currentType)
        #Create folder for .dot files (if its not already there)
        if not os.path.exists(dotPath):
            os.makedirs(dotPath)
        #Create folder for .png files (if its not already there)
        if not os.path.exists(pngPath):
            os.makedirs(pngPath)
        #Filename contains the project name, the current function name and the graph type
        filename = project+'_'+self.getFunctionName(self.currentNode)+'_'+self.currentType+'.dot'
        #Write to file
        print("Creating "+filename+" ...")
        file = open(dotPath+filename, 'w')
        file.write(s)
        file.close()
        # Use terminal output to convert .dot to .png
        os.system("dot -Tpng "+dotPath+filename+" -o "+pngPath+filename.replace('.dot', '.png'))
        #Print status update
        print("Creation of "+filename+" was successfull!")

            
    def getFunctions(self):
        #Get ids of all Vertices that are functions
        print("Get functions")
        query = "g.V().has('type', 'Function').id()"        
        return self._runGremlinQuery(query)
        
    def getFunctionName(self, id):
        #Get name of function with id
        print("Get function names")
        query = "g.V(%s).values('code')" % (id)   
        name = self._runGremlinQuery(query)[0]      
        return name
         


if __name__ == '__main__':
    tool = Plot()
    tool.run()