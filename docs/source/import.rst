Parsing and Importing Code
==========================

Importing code
--------------

Once Jess has been installed, you can start the server and begin to
import code into the database by executing `jess-import`. In one
terminal, execute the Jess server (where `$JESS` is the Jess root directory):

.. code-block:: none

	cd $JESS
	./jess-server.sh

In a second terminal, you can now import a project. Therefore, the source code of the project must be first packed as a tarball. Then you can invoke jess-import to import the project.

.. code-block:: none

	cd $JESS
	tar -cvzf ProjectName path/to/your/projectCode
	jess-import ProjectName

This will upload the tarball to the server, unpack it, parse the code
and create a new project named ProjectName and corresponding graph database.


Parsing code without importing
------------------------------

In addition to offering a tool to automatically parse and import code
into a graph database (`jess-import`), Jess provides a tool to parse
code and store its intermediate graph representation in a text
file. The fuzzy parser can thus be used without the graph database
backend, e.g., to provide input for other standalone code analysis
tools.

To parse source code in the directory $codeDir, simply invoke
`jess-parse` as follows.

.. code-block:: none

	./jess-parse $codeDir


This will create a directory named `parsed`, which contains two files
for each source file: a node file (`nodes.csv`) and an edge file
(`edges.csv`).
