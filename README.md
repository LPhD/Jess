Jess
====

Extended version of Joern's (https://github.com/octopus-platform/joern) dev branch.

Source code analysis is full of graphs: abstract syntax trees, control flow graphs, call graphs, program dependency graphs and directory structures, to name a few. Joern analyzes a code base using a robust parser for C and represents the entire code base by one large property graph stored in a Titan graph database. This allows code to be mined using complex queries formulated in the graph traversal languages Gremlin and Cypher.

The extended version named Jess contains some bugfixes and adations for the use as a "Semantic Unit Identifier".
A Semantic Unit (or Semantic Slice) contains semantically related lines of code, that share the same purpose.
Joern's property graph is extended by parsing preprocessor-statements to make the graph variability-aware. The graph is used to identify Semantic Units with the help of program slicing. The slices can contain C and C preprocessor code.

The current status of the dev branch is work-in-progress, that means sometimes the tool will just not work. 
For a more stable version, check out the stable branch or the dedicated releases.


The documentation can be found [here](https://jess.readthedocs.io/en/dev/)
