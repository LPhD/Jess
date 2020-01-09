package cfg;

import ast.ASTNode;
import ast.logical.statements.CompoundStatement;
import ast.walking.ASTNodeVisitor;

public class StructuredFlowVisitor extends ASTNodeVisitor {

	protected CFG returnCFG;

	public CFG getCFG() {
		return returnCFG;
	}

	public void visit(CompoundStatement content) {
		System.out.println("Visit compound");
		returnCFG = CFGFactory.newInstance(content);
	}

	public void visit(ASTNode expression) {
		System.out.println("Visit expression");
		returnCFG = CFGFactory.newInstance(expression);
	}

}
