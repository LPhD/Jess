package cfg;

import ast.ASTNode;
import ast.functionDef.ParameterBase;
import ast.logical.statements.CompoundStatement;
import ast.walking.ASTNodeVisitor;

public class StructuredFlowVisitor extends ASTNodeVisitor {

	protected CFG returnCFG;

	public CFG getCFG() {
		return returnCFG;
	}

	public void visit(CompoundStatement content) {
		returnCFG = CFGFactory.newInstance(content);
	}

	public void visit(ASTNode expression) {
		//Do not add void expressions to CFG
		if(!(expression instanceof ParameterBase && ((ParameterBase) expression).isVoid)) {
			returnCFG = CFGFactory.newInstance(expression);
			System.out.println("Try to add void");
			System.out.println(expression.getEscapedCodeStr());
		} else
			System.out.println("Do not add void");
	}

}
