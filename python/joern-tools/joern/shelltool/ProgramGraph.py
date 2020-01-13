#!/usr/bin/env python3

import os

import pygraphviz as pgv
from joern.shelltool.JoernTool import JoernTool
from joern.shelltool.PlotConfiguration import PlotConfiguration
from joern.shelltool.PlotResult import NodeResult, EdgeResult
from octopus.server.DBInterface import DBInterface



class ProgramGraph(JoernTool):
    def __init__(self, DESCRIPTION):
        JoernTool.__init__(self, DESCRIPTION)

    # @Override
    def processLine(self, line):         
        self.plot_configuration = PlotConfiguration()
        f = open(self.args.plot_config, "r")
        self.plot_configuration.parse(f)

        labels = self._getLabels()
        nodes = self._getNodes(int(line), labels)
        edges = self._getEdges(int(line), labels)

        G = pgv.AGraph(directed=True, strict=False)
        self._addNodes(G, nodes)
        self._addEdges(G, edges)
        self._outputGraph(G, line)


    def streamStart(self):
        self.dbInterface = DBInterface()
        self.dbInterface.connectToDatabase(self.args.project)

    def _addNodes(self, G, nodes):
        for v in nodes:
            nr = NodeResult(v)

            label = self._createGraphElementLabel(self.plot_configuration.getElementDisplayItems(nr))
            plot_properties = self.plot_configuration.getElementLayout(nr)
            if label:
                plot_properties['label'] = label
            G.add_node(nr.getId(), **plot_properties)

    def _addEdges(self, G, edges):
        for e in edges:
            er = EdgeResult(e)
            label = self._createGraphElementLabel(self.plot_configuration.getElementDisplayItems(er))
            plot_properties = self.plot_configuration.getElementLayout(er)
            plot_properties['label'] = label
            G.add_edge(er.getSrc(), er.getDest(), er.getId(), **plot_properties)

    def _createGraphElementLabel(self, labeldata):
        return "\n".join([":".join([str(self._escape(e)) for e in d]) for d in labeldata])

    def _escape(self, label):
        return str(label).replace("\\", "\\\\")

    def _outputGraph(self, G, identifier):
        outputString = '//' + identifier + '\n'
        outputString += str(G) + '\n'
        outputString += '//###' + '\n'
        self.output(outputString)

    def _getLabels(self):
        labels = ["FLOWS_TO", "USE", "DEF", "IS_AST_PARENT"]
        if self.args.show_all:
            return labels

        if not self.args.show_control_flow:
            labels.remove("FLOWS_TO")
        if not self.args.show_data_flow:
            labels.remove("USE")
            labels.remove("DEF")
        if not self.args.show_ast:
            labels.remove("IS_AST_PARENT")

        return labels

    def _getStartNode(self, functionId):
        if self.args.id_property:
            startnode = """g.V().has('type', 'Function').has('_key', {})""".format(functionId)
        else:
            startnode = """g.V({})""".format(functionId)
        startnode += """.union( out('IS_FUNCTION_OF_CFG'), out('IS_FUNCTION_OF_AST') )"""
        return startnode

    def _getNodes(self, functionId, labels):
        query = """
            {}.repeat(outE({}).subgraph('sg').inV().dedup().simplePath()).cap('sg').next().traversal().V()
            """.format(self._getStartNode(functionId), ','.join(map(lambda x: "'{}'".format(x), labels)))
        return self._runGremlinQuery(query)

    def _getEdges(self, functionId, labels):
        query = """
            {}.repeat(outE({}).subgraph('sg').inV().simplePath()).cap('sg').next().traversal().E()
            """.format(self._getStartNode(functionId), ','.join(map(lambda x: "'{}'".format(x), labels)))
        return self._runGremlinQuery(query)


if __name__ == '__main__':
    tool = ProgramGraph()
    tool.run()