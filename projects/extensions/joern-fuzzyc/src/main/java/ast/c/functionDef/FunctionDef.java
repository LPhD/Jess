package ast.c.functionDef;

import ast.ASTNode;
import ast.c.preprocessor.commands.macro.MacroCall;
import ast.expressions.Expression;
import ast.expressions.Identifier;
import ast.functionDef.FunctionDefBase;
import ast.functionDef.ParameterList;
import ast.logical.statements.CompoundStatement;
import ast.walking.ASTNodeVisitor;

public class FunctionDef extends FunctionDefBase {
	private Expression identifier = null;

	public Expression getIdentifier() {
		return this.identifier;
	}

	private void setIdentifier(Expression identifier) {
		this.identifier = identifier;
		super.addChild(identifier);
	}
	

	@Override
	public String getName() {
		return this.getIdentifier().getEscapedCodeStr();
	}

	@Override
	/**
	 * Removes the content of the function from the code property (returns only the function's signature)
	 */
	public String getFunctionSignature() {
		String retval = this.getProperty("code").split("\\{",2)[0];;
		return retval;
	}

	@Override
	public void addChild(ASTNode node) {
		if (node instanceof CompoundStatement)
			setContent((CompoundStatement) node);
		else if (node instanceof ParameterList)
			setParameterList((ParameterList) node);
		else if (node instanceof Identifier)
			setIdentifier((Identifier) node);
		else if (node instanceof MacroCall)	{//If the function header is defined by a macro
			setIdentifier((Expression) node);}
		else
			super.addChild(node);
	}

	@Override
	public void accept(ASTNodeVisitor visitor) {
		visitor.visit(this);
	}


}
