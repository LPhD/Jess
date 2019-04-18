package outputModules.common;

import ast.ASTNode;
import ast.preprocessor.PreBlockstarter;
import databaseNodes.ASTDatabaseNode;
import databaseNodes.FileDatabaseNode;
import includeAnalysis.IncludeAnalyzer;

public abstract class PreStatementExporter extends ASTNodeExporter{
	
	/**
	 * Add the main node and its children to the Database.
	 * 
	 */
	@Override
	public void addToDatabaseSafe(ASTNode astNode)	{
		ASTDatabaseNode preDBNode = new ASTDatabaseNode();
		try	{			
			//Add top level AST node to DB
			preDBNode.initialize(astNode);
			addMainNode(preDBNode);
			
			//Set nodeID for Variability Analysis
			astNode.setNodeId(mainNodeId);
			
			//Connect the DB node with its parent file node
			linkPreStatementToFileNode(preDBNode, curFile);	
			
			//Look for file inclusions
			if(astNode.getTypeAsString().equals("PreIncludeLocalFile")) {
				IncludeAnalyzer.includeNodeList.add(preDBNode);
			}
	
			//Look for statements that are inside an #ifdef block and add a variability edge
			if (astNode instanceof PreBlockstarter)
				addVariableStatements(preDBNode, (PreBlockstarter) astNode);
			
			//Finally, look for AST children and add them
			addASTChildren(preDBNode, astNode);	
		} catch (RuntimeException ex)	{
			ex.printStackTrace();
			System.err.println("Error adding pre-statement to database: "+ preDBNode.toString());
			return;
		}
	}
	
	/**
	 * Look for nodes surrounded with the variability block of the current node and add them to the db.
	 * @param parent The current node.
	 * @param astNodeParent The current node.
	 */
	private void addVariableStatements(ASTDatabaseNode preDBNode, PreBlockstarter preAstNode) {
		final int nVariableStatements = preAstNode.getVariableStatementsCount();
		for (int i = 0; i < nVariableStatements; i++) {
			ASTNode vStatement = preAstNode.getVariableStatement(i);
			long parentNodeID = preAstNode.getNodeId();
			long childNodeID = vStatement.getNodeId();
			
			drawVariabilityEdge(parentNodeID, childNodeID);
//			System.out.println("Connected DB parent: "+preAstNode.getEscapedCodeStr()+" with DB child: "+vStatement.getEscapedCodeStr());
		}
	}


	/**
	 * Look for child nodes of the current node and add them to the db.
	 * @param parent The current node.
	 * @param astNodeParent The current node.
	 */
	protected void addASTChildren(ASTDatabaseNode dbNodeParent, ASTNode astNodeParent) {
		final int nChildren = astNodeParent.getChildCount();
		for (int i = 0; i < nChildren; i++) {
			ASTNode child = astNodeParent.getChild(i);
//			System.out.println("Parent: "+astNodeParent.getEscapedCodeStr()+"with "+nChildren+" children");
//			System.out.println("Child: "+child.getEscapedCodeStr());
			addASTToDatabase(dbNodeParent, child);			
		}
	}
	
	
	/**
	 * Add current ASTNode to database and look for its children
	 * @param preDBNodeparent 
	 * @param currentNode The current node.
	 * @param parent The parent node of the current node.
	 */
	public void addASTToDatabase(ASTDatabaseNode dbNodeParent, ASTNode currentASTNode) {
		ASTDatabaseNode astDatabaseNode = new ASTDatabaseNode();
		try	{
			//Add DB Node and connect it with its parent
			astDatabaseNode.initialize(currentASTNode);
			addASTNode(astDatabaseNode);
			addASTLink(dbNodeParent, astDatabaseNode);
						
			//Link include statement with included file
			if(currentASTNode.getTypeAsString().equals("PreIncludeLocalFile")) {
				IncludeAnalyzer.includeNodeList.add(astDatabaseNode);
			}
				
			//Look for statements that are inside an #ifdef block
			if (currentASTNode instanceof PreBlockstarter) {
				//Set nodeID for Variability Analysis (this is only neccessary for #else and #elif nodes)
				currentASTNode.setNodeId(astDatabaseNode.getNodeId());
				addVariableStatements(astDatabaseNode, (PreBlockstarter) currentASTNode);
			}
			
			//Finally, look for AST childs and add them
			addASTChildren(astDatabaseNode, currentASTNode);
		} catch (RuntimeException ex)	{
			ex.printStackTrace();
			System.err.println("Error adding pre-statement children to database: "+ astDatabaseNode.toString());
			return;
		}		
	}
	
	
	protected abstract void addASTNode(ASTDatabaseNode astDatabaseNode);
	protected abstract void addASTLink(ASTDatabaseNode parent, ASTDatabaseNode child);
	protected abstract void linkPreStatementToFileNode(ASTDatabaseNode preDBNode, FileDatabaseNode fileNode);
	protected abstract void drawVariabilityEdge(long parentNodeID, long childNodeID);
}
