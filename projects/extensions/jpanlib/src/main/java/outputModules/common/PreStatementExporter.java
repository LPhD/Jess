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
		astNode.setPath(curFile.getPath());
		ASTDatabaseNode preDBNode = new ASTDatabaseNode();
		try	{			
			//Add top level AST node to DB
			preDBNode.initialize(astNode);
			addMainNode(preDBNode);
			
			//Set nodeID in AST node to draw variability and AST edges
			astNode.setNodeId(preDBNode.getNodeId());
			
			//Connect the DB node with its parent file node
			linkPreStatementToFileNode(preDBNode, curFile);	
			
			//Look for AST children and add them
			addASTChildren(astNode);
			
			//Look for file inclusions
			if(astNode.getTypeAsString().equals("PreIncludeLocalFile")) {
				IncludeAnalyzer.includeNodeList.add(preDBNode);
			}
	
			//Look for statements that are inside an #ifdef block and add a variability edge
			if (astNode instanceof PreBlockstarter)
				addVariableStatements((PreBlockstarter) astNode);
				
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
	private void addVariableStatements(PreBlockstarter preAstNode) {
		final int nVariableStatements = preAstNode.getVariableStatementsCount();
		for (int i = 0; i < nVariableStatements; i++) {
			ASTNode vStatement = preAstNode.getVariableStatement(i);
			
			if(preAstNode.getNodeId() > 0 && vStatement.getNodeId() > 0) {
				long parentNodeID = preAstNode.getNodeId();
				long childNodeID = vStatement.getNodeId();
				drawVariabilityEdge(parentNodeID, childNodeID);
			} else {
				System.err.println("Error connecting "+preAstNode.getEscapedCodeStr()+" with variability child: "+vStatement.getEscapedCodeStr());
			}

//			System.out.println("Connected DB parent: "+preAstNode.getEscapedCodeStr()+" with DB child: "+vStatement.getEscapedCodeStr());
		}
	}


	/**
	 * Look for child nodes of the current node and add them to the db.
	 * @param parent The current node.
	 * @param astNodeParent The current node.
	 */
	protected void addASTChildren(ASTNode astNodeParent) {
		final int nChildren = astNodeParent.getChildCount();
		for (int i = 0; i < nChildren; i++) {
			ASTNode child = astNodeParent.getChild(i);
//			System.out.println("Parent: "+astNodeParent.getEscapedCodeStr()+"with "+nChildren+" children");
//			System.out.println("Child: "+child.getEscapedCodeStr());
			addASTToDatabase(child);	
			addASTLink(astNodeParent.getNodeId(), child.getNodeId());
		}
	}
	
	
	/**
	 * Add current ASTNode to database and look for its children
	 * @param preDBNodeparent 
	 * @param currentNode The current node.
	 * @param parent The parent node of the current node.
	 */
	public void addASTToDatabase(ASTNode currentASTNode) {
		currentASTNode.setPath(curFile.getPath());
		ASTDatabaseNode astDatabaseNode = new ASTDatabaseNode();
		try	{
			//Add DB Node and connect it with its parent
			astDatabaseNode.initialize(currentASTNode);
			addASTNode(astDatabaseNode);
			//Set nodeID in AST node to draw variability and AST edges
			currentASTNode.setNodeId(astDatabaseNode.getNodeId());
			
			//Look for AST childs and add them
			addASTChildren(currentASTNode);
						
			//Link include statement with included file
			if(currentASTNode.getTypeAsString().equals("PreIncludeLocalFile")) {
				IncludeAnalyzer.includeNodeList.add(astDatabaseNode);
			}
				
			//Look for statements that are inside an #ifdef block
			if (currentASTNode instanceof PreBlockstarter) {
				addVariableStatements((PreBlockstarter) currentASTNode);
			}
			
		} catch (RuntimeException ex)	{
			ex.printStackTrace();
			System.err.println("Error adding pre-statement children to database: "+ astDatabaseNode.toString());
			return;
		}		
	}
	
	
	protected abstract void addASTNode(ASTDatabaseNode astDatabaseNode);
	protected abstract void addASTLink(long parentNodeID, long childNodeID);
	protected abstract void linkPreStatementToFileNode(ASTDatabaseNode preDBNode, FileDatabaseNode fileNode);
	protected abstract void drawVariabilityEdge(long parentNodeID, long childNodeID);
}
