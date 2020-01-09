package cfg;

import ast.c.statements.blockstarters.IfStatement;
import ast.statements.blockstarters.IfStatementBase;
import cfg.CFG;
import cfg.CFGEdge;
import cfg.CFGFactory;
import cfg.nodes.ASTNodeContainer;
import cfg.nodes.CFGNode;

public class CCFGFactory extends CFGFactory {

	static {
		structuredFlowVisitior = new CStructuredFlowVisitor();
	}

	public CCFGFactory() {
		structuredFlowVisitior = new CStructuredFlowVisitor();
	}

	public static CFG newInstance(IfStatementBase ifStmt) {
		System.out.println("New instance IfStatementBase: "+ifStmt.getEscapedCodeStr());
		
		try {
			IfStatement ifStatement = (IfStatement) ifStmt;

			CFG block = new CFG();
			CFGNode conditionContainer = new ASTNodeContainer(ifStatement.getCondition());
			block.addVertex(conditionContainer);
			System.out.println("addVertex "+conditionContainer.toString());
			block.addEdge(block.getEntryNode(), conditionContainer);
			System.out.println("addEdge ");

			CFG ifBlock = convert(ifStatement.getStatement());
			block.mountCFG(conditionContainer, block.getExitNode(), ifBlock, CFGEdge.TRUE_LABEL);

			if (ifStatement.getElseNode() != null) {
				System.out.println("Else: ");
				CFG elseBlock = convert(ifStatement.getElseNode().getStatement());
				block.mountCFG(conditionContainer, block.getExitNode(), elseBlock, CFGEdge.FALSE_LABEL);
			} else {
				System.out.println("No else");
				block.addEdge(conditionContainer, block.getExitNode(), CFGEdge.FALSE_LABEL);
			}

			return block;
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error generating CFG for if statement "+ifStmt.getEscapedCodeStr());
			return newErrorInstance();
		}
	}

}
