package outputModules.common;

import ast.ASTNode;
import ast.preprocessor.PreStatementBase;
import databaseNodes.DatabaseNode;
import databaseNodes.FileDatabaseNode;
import databaseNodes.PreConditionDatabaseNode;
import databaseNodes.PreStatementDatabaseNode;

public abstract class PreStatementExporter extends ASTNodeExporter{
	
	
	@Override
	public void addToDatabaseSafe(ASTNode node)	{
		addPreStatementToDatabaseSafe((PreStatementBase) node);
	}
	
	public void addPreStatementToDatabaseSafe(PreStatementBase preASTNode)	{
		PreStatementDatabaseNode preDBNode = new PreStatementDatabaseNode();
		try	{			
			preDBNode.initialize(preASTNode);
			addMainNode(preDBNode);
			linkPreStatementToFileNode(preDBNode, curFile);	
			
			//Add condition for pre-if and -elif statements
			String type = preASTNode.getTypeAsString();
			if (type.equals("PreIfStatement") || type.equals("PreElIfStatement"))
				addCondition(preDBNode, preASTNode);
			//addASTChildren(node);
			
		} catch (RuntimeException ex)	{
			ex.printStackTrace();
			System.err.println("Error adding pre-statement to database: "+ preDBNode.toString());
			return;
		}
	}
	
	
	public void addCondition(PreStatementDatabaseNode preDBNode, PreStatementBase preASTNode) {
		try	{			
			PreConditionDatabaseNode conditionDBNode = new PreConditionDatabaseNode();		
			//Initialize condition as DB node
			conditionDBNode.initialize(preASTNode.getChild(0));
			addASTNode(conditionDBNode);
			//Link condition DB node with parent pre statement db node
			addASTLink(preDBNode, conditionDBNode);		
		} catch (RuntimeException ex)	{
			ex.printStackTrace();
			System.err.println("Error adding pre-statement condition to database: "+ preDBNode.toString());
			return;
		}	
	}
	
	
	protected abstract void addASTLink(PreStatementDatabaseNode parent, PreConditionDatabaseNode child);
	protected abstract void addASTNode(DatabaseNode dbNode);
	protected abstract void linkPreStatementToFileNode(PreStatementDatabaseNode classDefNode, FileDatabaseNode fileNode);
	
//	/**
//	 * Add current ASTNode to database and look for its children
//	 * @param currentNode The current node.
//	 * @param parent The parent node of the current node.
//	 */
//	public void addASTToDatabase(ASTNode parent, ASTNode currentNode) {
//		ASTDatabaseNode astDatabaseNode = new ASTDatabaseNode();
//		try	{
//			astDatabaseNode.initialize(currentNode);
//			addASTNode(astDatabaseNode);
//			addASTLink(parent, astDatabaseNode);
//			addASTChildren(astDatabaseNode);
//		
//		} catch (RuntimeException ex)	{
//			ex.printStackTrace();
//			System.err.println("Error adding pre-statement children to database: "+ astDatabaseNode.toString());
//			return;
//		}		
//	}
//	
//	/**
//	 * Look for child nodes of the current node.
//	 * @param parent The current node.
//	 */
//	protected void addASTChildren(ASTNode parent) {
//		final int nChildren = parent.getChildCount();
//		for (int i = 0; i < nChildren; i++) {
//			ASTNode child = parent.getChild(i);
//			addASTToDatabase(parent, child);			
//		}
//	}
}
