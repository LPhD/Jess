#!/usr/bin/env python3

import os

from joern.shelltool.ProgramGraph import ProgramGraph


class PlotFunction(ProgramGraph):
    def __init__(self, DESCRIPTION):
        ProgramGraph.__init__(self, DESCRIPTION)

        self.argParser.add_argument('-ast', '--show-ast',
                                    action='store_true',
                                    help="""Show AST in CFG nodes.""",
                                    default=False)

        self.argParser.add_argument('-cfg', '--show-control-flow',
                                    action='store_true',
                                    help="""Show control flow.""",
                                    default=False)

        self.argParser.add_argument('-dfg', '--show-data-flow',
                                    action='store_true',
                                    help="""Show data flow.""",
                                    default=False)

        self.argParser.add_argument('-ddg', '--show-data-dependences',
                                    action='store_true',
                                    help="""Show data dependences.""",
                                    default=False)

        self.argParser.add_argument('-cdg', '--show-control-dependences',
                                    action='store_true',
                                    help="""Show control dependences.""",
                                    default=False)

        self.argParser.add_argument('-dom', '--show-dominance-edges',
                                    action='store_true',
                                    help="""Show dominance edges.""",
                                    default=False)

        self.argParser.add_argument('-all', '--show-all',
                                    action='store_true',
                                    help="""Show all edge types""",
                                    default=False)

        self.argParser.add_argument('-P', '--id-property', action='store_true', default=False,
                                    help="use functionId property value to identify function")

        self.argParser.add_argument('-c', '--plot-config',
                                    default=os.path.join(os.path.dirname(__file__), 'data', 'plotconfig.cfg'),
                                    help="use plot configuration from file")



if __name__ == '__main__':
    tool = ProgramGraph()
    tool.run()