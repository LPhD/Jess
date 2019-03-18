Jess
====

Extended version of Joern's (https://github.com/octopus-platform/joern) dev branch.

Source code analysis is full of graphs: abstract syntax trees, control
flow graphs, call graphs, program dependency graphs and directory
structures, to name a few. Joern analyzes a code base using a robust
parser for C/C++ and represents the entire code base by one large
property graph stored in a Titan graph database. This allows code to
be mined using complex queries formulated in the graph traversal
languages Gremlin and Cypher.

The extended version named Jess contains some bugfixes and adations for the use as a "Semantic Unit Identifier".
A Semantic Unit contains semantically related lines of code, that share the same purpose.
Joern's property graph is used to identify Semantic Units with the help of program slicing.

The current status is work-in-progress, that means sometimes the tool will just not work.
A pre-release is plannend for end of March.

The documentation can be found [here](https://joern-advanced.readthedocs.io/en/dev/)
