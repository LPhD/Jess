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
		//Get the index of the first opening curly bracket
		int i = getIndexOfOpeningBracket();
		
		//If there is one, make a substring
		if (i > 0) {
			return this.getProperty("code").substring(0, i);
		//If not, just return the code as it is	
		} else {
			return this.getProperty("code");
		}				

	}
	
	/**
	 * Get the index of the first real opening curly bracket to isolate a function's signature
	 * @return index of the first real opening curly bracket
	 */
	private int getIndexOfOpeningBracket() {
		char[] code = this.getProperty("code").toCharArray();
		
		//Check every char of the code
		for (int i = 0;i < code.length; i++) {
			
			//We have reached the end of the function signature if we get to the first real opening curly bracket
			if(code[i] == '{') {
				//Stop here, as we do not have to look further
				return i;
			}
			
			//If we reach the beginning of a comment
			if(code[i] == '/' && i + 1 < code.length && code[i+1] == '*') {
				//Skip the two chars for the beginning of the comment
				i+=2;
				//Skip until we reach the end of the comment
				while(i+1 < code.length && !(code[i] == '*') && !(code[i+1] == '/')) {
					i++;
				}
			}											
		}
		//This should only be reached if we do not have any curly brackets (currently for example in test cases)
		return -1;
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
