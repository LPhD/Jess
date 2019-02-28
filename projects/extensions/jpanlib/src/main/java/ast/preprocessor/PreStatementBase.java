package ast.preprocessor;

import ast.logical.statements.Statement;
import ast.walking.ASTNodeVisitor;

public class PreStatementBase extends Statement {
	
	@Override
	public void accept(ASTNodeVisitor visitor) {
		visitor.visit(this);
	}
}
