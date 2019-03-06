package parsing.Functions.builder;

import org.antlr.v4.runtime.ParserRuleContext;

import ast.ASTNode;
import ast.c.preprocessor.blockstarter.PreBlockstarter;
import ast.c.preprocessor.blockstarter.PreElIfStatement;
import ast.c.preprocessor.blockstarter.PreElseStatement;
import ast.c.preprocessor.blockstarter.PreIfStatement;
import ast.c.statements.blockstarters.ElseStatement;
import ast.c.statements.blockstarters.IfStatement;
import ast.expressions.Expression;
import ast.logical.statements.BlockStarter;
import ast.logical.statements.CompoundStatement;
import ast.statements.ExpressionHolder;
import ast.statements.blockstarters.CatchList;
import ast.statements.blockstarters.CatchStatement;
import ast.statements.blockstarters.DoStatement;
import ast.statements.blockstarters.TryStatement;
import ast.statements.blockstarters.WhileStatement;
import parsing.ASTNodeFactory;

public class NestingReconstructor {

	ContentBuilderStack stack;

	public NestingReconstructor(ContentBuilderStack aStack) {
		stack = aStack;
	}

	protected void addItemToParent(ASTNode expression) {
		ASTNode topOfStack = stack.peek();
		topOfStack.addChild(expression);
	}

	protected void consolidateSubExpression(ParserRuleContext ctx) {
		Expression expression = (Expression) stack.pop();
		ASTNodeFactory.initializeFromContext(expression, ctx);
		if (!(expression instanceof ExpressionHolder))
			expression = pullUpOnlyChild(expression);
		addItemToParent(expression);
	}

	private Expression pullUpOnlyChild(Expression expression) {
		if (expression.getChildCount() == 1)
			expression = (Expression) expression.getChild(0);
		return expression;
	}

	/**
	 * Gets called after every statement is exited
	 */
	protected void consolidate() {

		ASTNode stmt = stack.pop();
		ASTNode topOfStack = null;

		if (stack.size() > 0)
			topOfStack = stack.peek();

		if (topOfStack instanceof CompoundStatement) {
			//This way first, { -> int i
			CompoundStatement compound = (CompoundStatement) topOfStack;
			compound.addChild(stmt);
		} else if (topOfStack instanceof PreBlockstarter){		
//			consolidatePreBlockStarters(stmt);
		} else {
			consolidateBlockStarters(stmt);
		}

	}
	
	
	/**
 * Joins consecutive PreBlockStarters on the stack
 * @param preNode EndIfStatement that is no longer on the stack
 */
protected void consolidatePreBlockStarters(ASTNode preNode)	{
	PreBlockstarter curBlockStarter = null;

	while (stack.size() > 0){
		//Try to get the previous blockstarter on the stack
		try	{					
			System.out.println("Nesting stack: " +stack.peek().getTypeAsString());
			
			//Is the top stack item a PreBlockstarter? Break here if not...
			curBlockStarter = (PreBlockstarter) stack.peek();			
			curBlockStarter = (PreBlockstarter) stack.pop();
			//Add the previous node as child to the current node
			curBlockStarter.addChild(preNode);				
			//Set the current node as the previous node
			preNode = (PreBlockstarter) curBlockStarter;					


			
			//#If statements
			if (curBlockStarter instanceof PreIfStatement){					
//				// This is an if inside an else, e.g., 'else if' handling
//				if (stack.size() > 0 ) {												
//					//Normal Else
//					if (stack.peek() instanceof ElseStatement)	{	
//						BlockStarter elseItem = (BlockStarter) stack.pop();
//						elseItem.addChild(curBlockStarter);
//						
//						IfStatement lastIf = (IfStatement) stack.getIfInElseCase();
//						if (lastIf != null) {
//							lastIf.setElseNode((ElseStatement) elseItem);
//						}
//						return;							
//					}
//				}
				
			// add else statement to the previous if-statement, which has already been consolidated so we can return	
			} else if (curBlockStarter instanceof PreElseStatement){
//			
//				IfStatement lastIf = (IfStatement) stack.getIf();
//				if (lastIf != null)
//					lastIf.setElseNode((ElseStatement) curBlockStarter);
//				else
//					throw new RuntimeException("Warning: cannot find #if for #else");
//
//				return;
			} 
		} catch (Exception ex)	{
			System.out.println("Break in consolidatePreBlockStarters");
			break;
		}
	}
	
	// Finally, add chain to top compound-item
	//TODO not needed?
	ASTNode root = stack.peek();
	root.addChild(preNode);
}
	
	

	// Joins consecutive BlockStarters on the stack

	protected void consolidateBlockStarters(ASTNode node) {
		while (true) {
			try {
				BlockStarter curBlockStarter = (BlockStarter) stack.peek();
				curBlockStarter = (BlockStarter) stack.pop();
				curBlockStarter.addChild(node);
				node = curBlockStarter;

				// If and preprocessor if statements
				if (curBlockStarter instanceof IfStatement) {

					// This is an if inside an else, e.g., 'else if' handling
					if (stack.size() > 0) {
						// Normal Else
						if (stack.peek() instanceof ElseStatement) {
							BlockStarter elseItem = (BlockStarter) stack.pop();
							elseItem.addChild(curBlockStarter);

							IfStatement lastIf = (IfStatement) stack.getIfInElseCase();
							if (lastIf != null) {
								lastIf.setElseNode((ElseStatement) elseItem);
							}
							return;
						}
					}

					// add else statement to the previous if-statement, which has already been
					// consolidated so we can return
				} else if (curBlockStarter instanceof ElseStatement) {

					IfStatement lastIf = (IfStatement) stack.getIf();
					if (lastIf != null)
						lastIf.setElseNode((ElseStatement) curBlockStarter);
					else
						throw new RuntimeException("Warning: cannot find if for else");

					return;

					// add while statement to the previous do-statement, if that exists. Otherwise,
					// do nothing special.
				} else if (curBlockStarter instanceof WhileStatement) {

					DoStatement lastDo = stack.getDo();
					if (lastDo != null) {
						lastDo.addChild(((WhileStatement) curBlockStarter).getCondition());
						return;
					}

					// catch-statements
				} else if (curBlockStarter instanceof CatchStatement) {
					TryStatement tryStatement = stack.getTry();
					if (tryStatement != null) {
						CatchList catchList = tryStatement.getCatchList();
						if (catchList == null)
							tryStatement.setCatchList(new CatchList());
						tryStatement.getCatchList().addCatchStatement((CatchStatement) curBlockStarter);
					} else
						throw new RuntimeException("Warning: cannot find try for catch");

					return;
				}

			} catch (ClassCastException ex) {
				break;
			}
		}
		// Finally, add chain to top compound-item
		ASTNode root = stack.peek();
		root.addChild(node);
	}
}
