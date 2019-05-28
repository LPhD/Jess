This folder contains custom python scrips for acessing the different functionalities of Jess.
Use them by navigating into this directory, then write "python3 scriptname.py" into the command line.

The files have the following purposes:
-generateExamples: Generates some example node ids that you can use in the SUI script. The project name must be edited inside the script.
-plot: Invoke with "python3 plot.py [ProjectName]". Plots all different graph representations (AST, CPG, etc) for all functions of the project. Caution: The 'ALL' option may take very long for bigger projects. Use the plotDB script instead.
-plotconfig: This contains configuration options (edge colors, font, etc.) for plotting functionalities that build upon Graphviz. It is used by the plot, plotDB and SUI script.
-plotDB: Generates a Graphviz .dot and a png. file for visualizing the selected database. The project name must be edited inside the script. Furthermore, you can chose between plotting only the AST or the whole code property graph.
-queries: A collection of various queries and their explanations. The project name must be edited inside the script.
-SUI: Identifies Semantic Units with the help of variability-aware semantic program slicing. This script finds all semantically related lines to a given entry point. The entry point must be one (or more) node ids (variable entryPointId) or the name of a configuration option (variable entryFeatureNames). The project name must be edited inside the script.
