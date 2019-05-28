.. Jess documentation master file, created by
   sphinx-quickstart2 on Thu Jul 10 10:58:55 2014.
   You can adapt this file completely to your liking, but it should at least
   contain the root `toctree` directive.

Welcome to Jess' documentation!
=================================

Jess is based on `Joern <https://github.com/octopus-platform/joern>`_.  Jess generates variability-aware *code
property graphs*, a graph representation that exposes the code's
syntax, control-flow, data-flow, variability and type information in a joint data
structure. Code property graphs are stored in an Titan DB graph
database. This allows code to be mined using search queries formulated
in the graph traversal language Gremlin. Jess uses program slicing to identify semantically related lines of code for a given entry point. The variability information and structure in those slices (implemented with preprocessor statements) stays intact.

- **Fuzzy Parsing.** Jess employs a fuzzy parser. This allows code to
  be imported even if a working build environment cannot be supplied.

- **Code Property Graphs.** Jess creates code property graphs from
  the fuzzy parser output and makes and stores them in a Titan DB graph
  database. For background information on code property graphs, we
  strongly encourage you to read the `paper <http://user.informatik.uni-goettingen.de/~fyamagu/pdfs/2014-oakland.pdf>`_ of Joern's authors on the topic
  .

- **Extensible Query Language.** Based on the graph traversal language
  Gremlin, Jess offers an extensible query language based on
  user-defined Gremlin steps that encode common traversals in the code
  property graph. These can be combined to create search queries easily.
  
- **Variability-Awarness.** Jess parses preprocessor statements and is therefore able to analyze variability in preprocessor-based product lines.

- **Semantic Slicing.** Jess uses queries to slice the imported source code in semantically related units. That means, you can select an entry point (a line of code) and Jess will give you all lines of code that have an behavioural impact on that entry point or are impacted by that entry point (forward and backward slicing).

This is Jess' official documentation. It covers its installation and
configuration, discusses how code can be imported and retrieved from
the database and gives an overview of the database contents.

Contents:

.. toctree::
	:maxdepth: 2

	installation
	import
	slicing
..
   Indices and tables
   ==================

   * :ref:`genindex`
   * :ref:`modindex`
   * :ref:`search`
