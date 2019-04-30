package outputModules.common;

import ast.ASTNode;
import ast.logical.statements.CompoundStatement;
import ast.preprocessor.PreBlockstarter;
import databaseNodes.ASTDatabaseNode;
import databaseNodes.FunctionDatabaseNode;
import includeAnalysis.IncludeAnalyzer;

public abstract class ASTExporter {
	protected FunctionDatabaseNode currentFunction;
	protected int ancestorCompoundStatements;

	public void addASTToDatabase(ASTNode node) {
		ASTDatabaseNode astDatabaseNode = new ASTDatabaseNode();				
		astDatabaseNode.initialize(node);
		astDatabaseNode.setCurrentFunction(currentFunction);
		astDatabaseNode.setInsideFunctionBlock(this.isInsideFunctionBlock());
		
		addASTNode(astDatabaseNode);
		//Set nodeID in AST node to draw variability and AST edges
		node.setNodeId(astDatabaseNode.getNodeId());
		System.out.println("Set nodeId for: "+node.getEscapedCodeStr()+" -> "+node.getNodeId());
		
		
		// Link include statement with included file
		if (node.getTypeAsString().equals("PreIncludeLocalFile")) {
			IncludeAnalyzer.includeNodeList.add(astDatabaseNode);
		}
		
		visit(node);
		addASTChildren(node);	
		leave(node);
	}

	protected void visit(ASTNode node) {
		if (node instanceof CompoundStatement) {
			ancestorCompoundStatements++;
		}
	}
	
	/**
	 * Look for nodes surrounded with a variability block and draws the respective variability link
	 * 
	 * @param rootAstCompoundNode The top level compound statement of the function
	 */
	public void addVariabilityAnalysis(ASTNode rootAstCompoundNode) {
		final int nChildren = rootAstCompoundNode.getChildCount();

		//For each top level child that is a pre blockstarter
		for (int j = 0; j < nChildren; j++) {
			ASTNode child = rootAstCompoundNode.getChild(j);
			if (child instanceof PreBlockstarter) {
				final int nVariableStatements = ((PreBlockstarter) child).getVariableStatementsCount();
				for (int i = 0; i < nVariableStatements; i++) {
					ASTNode vStatement = ((PreBlockstarter) child).getVariableStatement(i);
					System.out.println("Try to recieve node ids from " + child.getEscapedCodeStr() + " and "+ vStatement.getEscapedCodeStr());
					long parentNodeID = child.getNodeId();
					long childNodeID = vStatement.getNodeId();

					drawVariabilityEdge(parentNodeID, childNodeID);
					// System.out.println("Connected variability parent: "+preAstNode.getEscapedCodeStr()+" with variability child: "+vStatement.getEscapedCodeStr());
				}
			}
		}
	}
	
	protected void addASTChildren(ASTNode astNodeParent) {

		final int nChildren = astNodeParent.getChildCount();

		for (int i = 0; i < nChildren; i++) {
			ASTNode child = astNodeParent.getChild(i);
			addASTToDatabase(child);
			addASTLink(astNodeParent.getNodeId(), child.getNodeId());
//			System.out.println("Connected AST parent: "+astNodeParent.getEscapedCodeStr()+"with AST child: "+child.getEscapedCodeStr());
		}

	}
	
	protected void leave(ASTNode node) {
		if (node instanceof CompoundStatement) {
			ancestorCompoundStatements--;
		}
	}
	
	public void setCurrentFunction(FunctionDatabaseNode func) {
		currentFunction = func;
	}

	public boolean isInsideFunctionBlock() {
		return ancestorCompoundStatements > 0;
	}
	
	protected abstract void addASTNode(ASTDatabaseNode astDatabaseNode);
	protected abstract void addASTLink(long parentNodeID, long childNodeID);
	protected abstract void drawVariabilityEdge(long parentNodeID, long childNodeID);

}