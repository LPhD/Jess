package outputModules.common;

import ast.ASTNode;
import ast.functionDef.FunctionDefBase;
import cfg.CFG;
import cfg.CFGFactory;
import databaseNodes.FileDatabaseNode;
import databaseNodes.FunctionDatabaseNode;
import udg.useDefAnalysis.ASTDefUseAnalyzer;

public abstract class FunctionExporter extends ASTNodeExporter {
	protected ASTExporter astImporter;
	protected CFGExporter cfgImporter;
	protected UDGExporter udgImporter;
	protected ASTDefUseAnalyzer analyzer;
	protected CFGFactory cfgFactory;

	protected abstract void linkFunctionWithAST(FunctionDatabaseNode function);

	protected abstract void linkFunctionWithCFG(FunctionDatabaseNode function, CFG cfg);

	protected abstract void linkFunctionToFileNode(FunctionDatabaseNode function, FileDatabaseNode fileNode);

	@Override
	public void addToDatabaseSafe(ASTNode node) {
		try {
			node.setPath(curFile.getPath());
			FunctionDatabaseNode function = new FunctionDatabaseNode();
			// this actually constructs all other representations of the function.
			analyzer.reset();
			function.setASTDefUseAnalyzer(analyzer);
			function.setCFGFactory(cfgFactory);

			try {
				function.initialize(node);
			} catch (StackOverflowError err) {
				System.err.println("caught stack overflow. Skipping function.");
				return;
			}

			addFunctionToDatabase(function);						
			linkFunctionToFileNode(function, curFile);			

		} catch (RuntimeException ex) {
			ex.printStackTrace();
			System.err.println("Error adding function to database: " + ((FunctionDefBase) node).getName());
			return;
		}
	}

	private void addFunctionToDatabase(FunctionDatabaseNode function) {

		addMainNode(function);
		
		//Set AST nodeID for Variability Analysis
		function.getASTRoot().setNodeId(function.getNodeId());

		astImporter.setCurrentFunction(function);
		cfgImporter.setCurrentFunction(function);
		udgImporter.setCurrentFunction(function);

		astImporter.addASTToDatabase(function.getASTRoot());
		cfgImporter.addCFGToDatabase(function.getCFG());
		udgImporter.addUDGToDatabase(function.getUDG());
		
		//Analyze the function content (the children of the compound statement)
		astImporter.addVariabilityAnalysis(function.getASTRoot().getChild(0));

		linkFunctionToASTAndCFG(function);

	}

	private void linkFunctionToASTAndCFG(FunctionDatabaseNode function) {

		linkFunctionWithAST(function);

		CFG cfg = function.getCFG();
		if (cfg != null) {
			linkFunctionWithCFG(function, cfg);
		}
	}

}
