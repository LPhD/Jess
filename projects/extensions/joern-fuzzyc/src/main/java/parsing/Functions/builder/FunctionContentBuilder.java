package parsing.Functions.builder;

import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import antlr.FunctionParser.Additive_expressionContext;
import antlr.FunctionParser.Address_of_expressionContext;
import antlr.FunctionParser.And_expressionContext;
import antlr.FunctionParser.ArgumentContext;
import antlr.FunctionParser.Argument_listContext;
import antlr.FunctionParser.ArrayIndexingContext;
import antlr.FunctionParser.Assign_exprContext;
import antlr.FunctionParser.Bit_and_expressionContext;
import antlr.FunctionParser.Block_starterContext;
import antlr.FunctionParser.BreakStatementContext;
import antlr.FunctionParser.Cast_expressionContext;
import antlr.FunctionParser.Cast_targetContext;
import antlr.FunctionParser.Catch_statementContext;
import antlr.FunctionParser.Closing_curlyContext;
import antlr.FunctionParser.CommentContext;
import antlr.FunctionParser.ConditionContext;
import antlr.FunctionParser.Conditional_expressionContext;
import antlr.FunctionParser.ContinueStatementContext;
import antlr.FunctionParser.CustomContext;
import antlr.FunctionParser.DeclByClassContext;
import antlr.FunctionParser.Do_statementContext;
import antlr.FunctionParser.Else_statementContext;
import antlr.FunctionParser.Equality_expressionContext;
import antlr.FunctionParser.Exclusive_or_expressionContext;
import antlr.FunctionParser.ExprContext;
import antlr.FunctionParser.Expr_statementContext;
import antlr.FunctionParser.For_init_statementContext;
import antlr.FunctionParser.For_statementContext;
import antlr.FunctionParser.FuncCallContext;
import antlr.FunctionParser.Function_pointer_use_expressionContext;
import antlr.FunctionParser.GotoStatementContext;
import antlr.FunctionParser.IdentifierContext;
import antlr.FunctionParser.If_statementContext;
import antlr.FunctionParser.IncDecOpContext;
import antlr.FunctionParser.Inc_decContext;
import antlr.FunctionParser.Inclusive_or_expressionContext;
import antlr.FunctionParser.InitDeclSimpleContext;
import antlr.FunctionParser.InitDeclWithAssignContext;
import antlr.FunctionParser.InitDeclWithCallContext;
import antlr.FunctionParser.LabelContext;
import antlr.FunctionParser.MacroCallContext;
import antlr.FunctionParser.MemberAccessContext;
import antlr.FunctionParser.Multiplicative_expressionContext;
import antlr.FunctionParser.NewlineContext;
import antlr.FunctionParser.Null_expressionContext;
import antlr.FunctionParser.Opening_curlyContext;
import antlr.FunctionParser.Or_expressionContext;
import antlr.FunctionParser.Pre_defineContext;
import antlr.FunctionParser.Pre_diagnosticContext;
import antlr.FunctionParser.Pre_elif_statementContext;
import antlr.FunctionParser.Pre_else_statementContext;
import antlr.FunctionParser.Pre_endif_statementContext;
import antlr.FunctionParser.Pre_if_conditionContext;
import antlr.FunctionParser.Pre_if_statementContext;
import antlr.FunctionParser.Pre_includeContext;
import antlr.FunctionParser.Pre_include_filenameContext;
import antlr.FunctionParser.Pre_include_local_fileContext;
import antlr.FunctionParser.Pre_include_nextContext;
import antlr.FunctionParser.Pre_lineContext;
import antlr.FunctionParser.Pre_macroContext;
import antlr.FunctionParser.Pre_macro_identifierContext;
import antlr.FunctionParser.Pre_macro_parametersContext;
import antlr.FunctionParser.Pre_otherContext;
import antlr.FunctionParser.Pre_pragmaContext;
import antlr.FunctionParser.Pre_undefContext;
import antlr.FunctionParser.Preprocessor_fragmentContext;
import antlr.FunctionParser.Primary_expressionContext;
import antlr.FunctionParser.PtrMemberAccessContext;
import antlr.FunctionParser.Relational_expressionContext;
import antlr.FunctionParser.ReturnStatementContext;
import antlr.FunctionParser.Shift_expressionContext;
import antlr.FunctionParser.SizeofContext;
import antlr.FunctionParser.Sizeof_expressionContext;
import antlr.FunctionParser.Sizeof_operand2Context;
import antlr.FunctionParser.Sizeof_operandContext;
import antlr.FunctionParser.StatementContext;
import antlr.FunctionParser.StatementsContext;
import antlr.FunctionParser.Switch_statementContext;
import antlr.FunctionParser.ThrowStatementContext;
import antlr.FunctionParser.Try_statementContext;
import antlr.FunctionParser.Type_nameContext;
import antlr.FunctionParser.Unary_expressionContext;
import antlr.FunctionParser.Unary_op_and_cast_exprContext;
import antlr.FunctionParser.Unary_operatorContext;
import antlr.FunctionParser.While_statementContext;
import ast.ASTNode;
import ast.ASTNodeBuilder;
import ast.Comment;
import ast.c.expressions.CallExpression;
import ast.c.expressions.SizeofExpression;
import ast.c.preprocessor.blockstarter.PreElIfStatement;
import ast.c.preprocessor.blockstarter.PreElseStatement;
import ast.c.preprocessor.blockstarter.PreEndIfStatement;
import ast.c.preprocessor.blockstarter.PreIfCondition;
import ast.c.preprocessor.blockstarter.PreIfStatement;
import ast.c.preprocessor.commands.PreDiagnostic;
import ast.c.preprocessor.commands.PreInclude;
import ast.c.preprocessor.commands.PreIncludeFilename;
import ast.c.preprocessor.commands.PreIncludeLocalFile;
import ast.c.preprocessor.commands.PreIncludeNext;
import ast.c.preprocessor.commands.PreLine;
import ast.c.preprocessor.commands.PreOther;
import ast.c.preprocessor.commands.PrePragma;
import ast.c.preprocessor.commands.macro.MacroCall;
import ast.c.preprocessor.commands.macro.PreDefine;
import ast.c.preprocessor.commands.macro.PreMacro;
import ast.c.preprocessor.commands.macro.PreMacroIdentifier;
import ast.c.preprocessor.commands.macro.PreMacroParameters;
import ast.c.preprocessor.commands.macro.PreUndef;
import ast.c.statements.blockstarters.ElseStatement;
import ast.c.statements.blockstarters.IfStatement;
import ast.custom.CustomNode;
import ast.declarations.ClassDefStatement;
import ast.declarations.IdentifierDecl;
import ast.declarations.IdentifierDeclType;
import ast.expressions.AdditiveExpression;
import ast.expressions.AddressOfExpression;
import ast.expressions.AndExpression;
import ast.expressions.Argument;
import ast.expressions.ArgumentList;
import ast.expressions.ArrayIndexing;
import ast.expressions.AssignmentExpression;
import ast.expressions.BitAndExpression;
import ast.expressions.Callee;
import ast.expressions.CastExpression;
import ast.expressions.CastTarget;
import ast.expressions.ConditionalExpression;
import ast.expressions.EqualityExpression;
import ast.expressions.ExclusiveOrExpression;
import ast.expressions.Expression;
import ast.expressions.ForInit;
import ast.expressions.FunctionPointerUseExpression;
import ast.expressions.Identifier;
import ast.expressions.IncDec;
import ast.expressions.InclusiveOrExpression;
import ast.expressions.MemberAccess;
import ast.expressions.MultiplicativeExpression;
import ast.expressions.NullExpression;
import ast.expressions.OrExpression;
import ast.expressions.PostIncDecOperationExpression;
import ast.expressions.PreFragment;
import ast.expressions.PreIncDecOperationExpression;
import ast.expressions.PrimaryExpression;
import ast.expressions.PtrMemberAccess;
import ast.expressions.RelationalExpression;
import ast.expressions.ShiftExpression;
import ast.expressions.Sizeof;
import ast.expressions.SizeofOperand;
import ast.expressions.UnaryExpression;
import ast.expressions.UnaryOperationExpression;
import ast.expressions.UnaryOperator;
import ast.logical.statements.BlockCloser;
import ast.logical.statements.BlockStarter;
import ast.logical.statements.CompoundStatement;
import ast.logical.statements.Condition;
import ast.logical.statements.Label;
import ast.logical.statements.Statement;
import ast.preprocessor.PreBlockstarter;
import ast.statements.ExpressionStatement;
import ast.statements.FunctionPointerDeclare;
import ast.statements.IdentifierDeclStatement;
import ast.statements.StructUnionEnum;
import ast.statements.blockstarters.CatchStatement;
import ast.statements.blockstarters.DoStatement;
import ast.statements.blockstarters.ForStatement;
import ast.statements.blockstarters.SwitchStatement;
import ast.statements.blockstarters.TryStatement;
import ast.statements.blockstarters.WhileStatement;
import ast.statements.jump.BreakStatement;
import ast.statements.jump.ContinueStatement;
import ast.statements.jump.GotoStatement;
import ast.statements.jump.ReturnStatement;
import ast.statements.jump.ThrowStatement;
import parsing.ASTNodeFactory;
import parsing.Modules.CModuleParserTreeListener;
import parsing.Shared.InitDeclContextWrapper;
import parsing.Shared.builders.ClassDefBuilder;
import parsing.Shared.builders.IdentifierDeclBuilder;

/**
 * The FunctionContentBuilder is invoked while walking the parse tree to create
 * ASTs for the contents of functions, i.e., the first-level compound statements
 * of functions.
 *
 * Since the fuzzy parser avoids using nested grammar rules as these rules often
 * require reading all tokens of a file only to realize that the default rule
 * must be taken, the most difficult task this code fulfills is to produce a
 * correctly nested AST.
 */

public class FunctionContentBuilder extends ASTNodeBuilder {
	ContentBuilderStack stack = new ContentBuilderStack();
	NestingReconstructor nesting = new NestingReconstructor(stack);
	HashMap<ASTNode, ParserRuleContext> nodeToRuleContext = new HashMap<ASTNode, ParserRuleContext>();
	private static final Logger logger = LoggerFactory.getLogger(CModuleParserTreeListener.class);
	/**
	 * This stack contains PreBlockstarters that can implement variability
	 */
	private Stack<ASTNode> variabilityItemStack = new Stack<ASTNode>();
	/**
	 * This stack contains PreBlockstarters that can be nested on AST level (including #endif)
	 */
	private Stack<ASTNode> preASTItemStack = new Stack<ASTNode>();	
	/**
	 * This stack contains Comments
	 */
	private Stack<Comment> commentStack = new Stack<Comment>();
	/**
	 * Saves the previous statement to be able to connect comments with statements in the same line
	 */
	private ASTNode previousStatement = null;
	/**
	 * Pending items list for all statements that should be visited after the whole file content is parsed
	 * Currently only for comments
	 */
	private List<Comment> pendingList = new LinkedList<Comment>();
	/**
	 * This is needed for returning the current item when we call the function parser via the module parser
	 * We need this for #else/#elif/#endif because they are not children of the top level compound statement
	 */
	public ASTNode currentItem = null;
	/**
	 * This contains the root compound item
	 */
	private CompoundStatement rootCompound = null;
	
	/**
	 * Creates a new function content builder stack by pushing the top level compound statement on the stack
	 */
	@Override
	public void createNew(ParserRuleContext ctx) {
		item = new CompoundStatement();
		CompoundStatement rootItem = (CompoundStatement) item;
		ASTNodeFactory.initializeFromContext(item, ctx);
		nodeToRuleContext.put(rootItem, ctx);
		stack.push(rootItem);
		rootCompound = rootItem;
	}

	/**
	 *  Called when the entire function-content has been walked
	 * @param ctx
	 */
	public void exitStatements(StatementsContext ctx) {
		if (stack.size() != 1) {
			try {
				while (stack.size() != 1) {
					ASTNode currentNode = (ASTNode) stack.pop();
					nesting.addItemToParent(currentNode);
				}
			} catch (Exception e) {
				System.err.println("Exception while removing items from stack! Current context: "+ctx.getText());
			}
			// throw new RuntimeException("Broken stack while parsing");
		}
		
		//Resolve in the right order, comments last
		CompoundStatement parentC = (CompoundStatement) stack.peek();
		
		for (Comment comment : pendingList) {
			//Add here, because we need the commentee to be initialized first
			parentC.addChild(comment);
		}
		
		//Clear all stacks + lists,	as the analysis is (currently) function-local
		this.variabilityItemStack.clear();
		this.preASTItemStack.clear();
		this.commentStack.clear();
		this.pendingList.clear();
		this.stack = null;
		this.nesting = null;
		this.previousStatement = null;
	}
	

	// For all statements, begin by pushing a Statement Object onto the stack.
	public void enterStatement(StatementContext ctx) {	
		ASTNode statementItem = ASTNodeFactory.create(ctx);
		nodeToRuleContext.put(statementItem, ctx);
		stack.push(statementItem);
	}

	// Mapping of grammar-rules to CodeItems.

	public void enterOpeningCurly(Opening_curlyContext ctx) {
		replaceTopOfStack(new CompoundStatement(), ctx);
	}

	public void enterClosingCurly(Closing_curlyContext ctx) {
		replaceTopOfStack(new BlockCloser(), ctx);
	}

	public void enterBlockStarter(Block_starterContext ctx) {
		replaceTopOfStack(new BlockStarter(), ctx);
	}

	public void enterExprStatement(Expr_statementContext ctx) {
		ExpressionStatement exprStmt = new ExpressionStatement();
		replaceTopOfStack(exprStmt , ctx);
	}

	public void enterIf(If_statementContext ctx) {
		replaceTopOfStack(new IfStatement(), ctx);
	}

	public void enterFor(For_statementContext ctx) {
		replaceTopOfStack(new ForStatement(), ctx);
	}

	public void enterWhile(While_statementContext ctx) {
		replaceTopOfStack(new WhileStatement(), ctx);
	}

	public void enterDo(Do_statementContext ctx) {
		replaceTopOfStack(new DoStatement(), ctx);
	}

	public void enterElse(Else_statementContext ctx) {
		replaceTopOfStack(new ElseStatement(), ctx);
	}

	// ------------------------------------Preprocessor macro  handling----------------------------------------------------------

	/**
	 * Pushes the item on the stack
	 * 
	 * @param ctx
	 */
	public void enterPreDefine(Pre_defineContext ctx) {
		replaceTopOfStack(new PreDefine(), ctx);
	}

	/**
	 * Pushes the item on the stack
	 * 
	 * @param ctx
	 */
	public void enterPreMacro(Pre_macroContext ctx) {
		PreMacro expr = new PreMacro();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
	}

	/**
	 * Pops the item from the stack and adds it to its parents
	 * 
	 * @param ctx
	 */
	public void exitPreMacro(Pre_macroContext ctx) {
		PreMacro expr = (PreMacro) stack.pop();
		ASTNodeFactory.initializeFromContext(expr, ctx);
		nesting.addItemToParent(expr);
	}

	/**
	 * Pushes the item on the stack
	 * 
	 * @param ctx
	 */
	public void enterPreMacroIdentifier(Pre_macro_identifierContext ctx) {
		PreMacroIdentifier expr = new PreMacroIdentifier();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
	}

	/**
	 * Pops the item from the stack and adds it to its parents
	 * 
	 * @param ctx
	 */
	public void exitPreMacroIdentifier(Pre_macro_identifierContext ctx) {
		PreMacroIdentifier expr = (PreMacroIdentifier) stack.pop();
		ASTNodeFactory.initializeFromContext(expr, ctx);
		nesting.addItemToParent(expr);
	}

	/**
	 * Pushes the item on the stack
	 * 
	 * @param ctx
	 */
	public void enterPreMacroParameters(Pre_macro_parametersContext ctx) {
		PreMacroParameters expr = new PreMacroParameters();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
	}

	/**
	 * Pops the item from the stack and adds it to its parents
	 * 
	 * @param ctx
	 */
	public void exitPreMacroParameters(Pre_macro_parametersContext ctx) {
		PreMacroParameters expr = (PreMacroParameters) stack.pop();
		ASTNodeFactory.initializeFromContext(expr, ctx);
		nesting.addItemToParent(expr);
	}

	/**
	 * Pushes the item on the stack
	 * 
	 * @param ctx
	 */
	public void enterPreUndef(Pre_undefContext ctx) {
		replaceTopOfStack(new PreUndef(), ctx);
	}

	// ----------------------------------Preprocessor command handling--------------------------------------------------------------

	/**
	 * Caution: MacroCall extends from Expression, therefore handling is different
	 * 
	 * @param ctx
	 */
	public void enterMacroCall(MacroCallContext ctx) {
		MacroCall expr = new MacroCall();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
		//No variability check here, as there will be a parent expression node
	}
	
	/**
	 * Macro call has always a parent, either an ExpressionStatement or another expression node
	 * @param ctx
	 */
	public void exitMacroCall(MacroCallContext ctx) {
		nesting.consolidateSubExpression(ctx);
	}
	
	/**
	 * Pushes the item on the stack
	 * 
	 * @param ctx
	 */
	public void enterPreDiagnostic(Pre_diagnosticContext ctx) {
		replaceTopOfStack(new PreDiagnostic(), ctx);
	}

	/**
	 * Replace top of stack with the current item, as the parent item is only a
	 * placeholder This makes the element appear as a {@link PreInclude}, rather
	 * than a {@link PreStatement}
	 * 
	 * @param ctx
	 */
	public void enterPreInclude(Pre_includeContext ctx) {
		replaceTopOfStack(new PreInclude(), ctx);
	}

	/**
	 * Pushes the item on the stack
	 * 
	 * @param ctx
	 */
	public void enterPreIncludeNext(Pre_include_nextContext ctx) {
		replaceTopOfStack(new PreIncludeNext(), ctx);
	}

	/**
	 * Pushes the item on the stack
	 * 
	 * @param ctx
	 */
	public void enterPreLine(Pre_lineContext ctx) {
		replaceTopOfStack(new PreLine(), ctx);
	}
	
	/**
	 * Pushes the item on the stack
	 * 
	 * @param ctx
	 */
	public void enterPreOther(Pre_otherContext ctx) {
		PreOther expr = new PreOther();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
	}

	/**
	 * Pops the item from the stack and adds it to its parents
	 * 
	 * @param ctx
	 */
	public void exitPreOther(Pre_otherContext ctx) {
		PreOther expr = (PreOther) stack.pop();
		ASTNodeFactory.initializeFromContext(expr, ctx);
		nesting.addItemToParent(expr);
	}

	/**
	 * Pushes the item on the stack
	 * 
	 * @param ctx
	 */
	public void enterPrePragma(Pre_pragmaContext ctx) {
		replaceTopOfStack(new PrePragma(), ctx);
	}

	/**
	 * Pushes the item on the stack
	 * 
	 * @param ctx
	 */
	public void enterPreIncludeFilename(Pre_include_filenameContext ctx) {
		PreIncludeFilename expr = new PreIncludeFilename();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
	}

	/**
	 * Pops the item from the stack and adds it to its parents
	 * 
	 * @param ctx
	 */
	public void exitPreIncludeFilename(Pre_include_filenameContext ctx) {
		PreIncludeFilename expr = (PreIncludeFilename) stack.pop();
		ASTNodeFactory.initializeFromContext(expr, ctx);
		nesting.addItemToParent(expr);
	}

	/**
	 * Pushes the item on the stack
	 * 
	 * @param ctx
	 */
	public void enterPreIncludeLocalFile(Pre_include_local_fileContext ctx) {
		PreIncludeLocalFile expr = new PreIncludeLocalFile();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
	}

	/**
	 * Pops the item from the stack and adds it to its parents
	 * 
	 * @param ctx
	 */
	public void exitPreIncludeLocalFile(Pre_include_local_fileContext ctx) {
		PreIncludeLocalFile expr = (PreIncludeLocalFile) stack.pop();
		ASTNodeFactory.initializeFromContext(expr, ctx);
		nesting.addItemToParent(expr);
	}

	// ----------------------------------Preprocessor blockstarter handling------------------------------------------------------

	/**
	 * Replace top of stack with the current item, as the parent item is only a
	 * placeholder This makes the element appear as a {@link PreIfStatement}, rather
	 * than a {@link Statement}
	 * 
	 * @param ctx
	 */
	public void enterPreIf(Pre_if_statementContext ctx) {
		System.out.println("Enter preIf");
		//Only replace the top statement if it's not a PreFragment, as this needs separate handling (we currently need no PreIfStatement in this case
		if (!(stack.peek() instanceof PreFragment)) {
			replaceTopOfStack(new PreIfStatement(), ctx);
		} else {
			System.out.println("Added preFragment to parent ExpressionStatement");
			PreFragment expression = new PreFragment();
			ASTNodeFactory.initializeFromContext(expression, ctx);
			rootCompound.addChild( (PreFragment) stack.pop()); //Remove the fragment from stack and add it to the toplevel compound			
		}
	}
	
	/**
	 * These fragments are handled as subexpressions
	 * 
	 * @param ctx
	 */
	public void enterPreFragment(Preprocessor_fragmentContext ctx) {
		System.out.println("Enter preFragment");

		PreFragment expression = new PreFragment();
		ASTNodeFactory.initializeFromContext(expression, ctx);
		stack.push(expression);	//We need to put this item to the stack, as otherwise the following preStatement would replace the topOfStack
	}
	

	/**
	 * Replace top of stack with the current item, as the parent item is only a
	 * placeholder This makes the element appear as a {@link PreElseStatement},
	 * rather than a {@link Statement}
	 * 
	 * @param ctx
	 */
	public void enterPreElse(Pre_else_statementContext ctx) {
		//Only replace the top statement if it's not a PreFragment, as this needs separate handling (we currently need no PreIfStatement in this case
		if (!(stack.peek() instanceof PreFragment)) {
			replaceTopOfStack(new PreElseStatement(), ctx);
			currentItem = stack.peek();
		} else {
			System.out.println("Added preFragment to parent ExpressionStatement");
			PreFragment expression = new PreFragment();
			ASTNodeFactory.initializeFromContext(expression, ctx);
			rootCompound.addChild( (PreFragment) stack.pop()); //Remove the fragment from stack and add it to the toplevel compound				
		}
	}

	/**
	 * Replace top of stack with the current item, as the parent item is only a
	 * placeholder This makes the element appear as a {@link PreElIfStatement},
	 * rather than a {@link Statement}
	 * 
	 * @param ctx
	 */
	public void enterPreElIf(Pre_elif_statementContext ctx) {
		//Only replace the top statement if it's not a PreFragment, as this needs separate handling (we currently need no PreIfStatement in this case
		if (!(stack.peek() instanceof PreFragment)) {
			replaceTopOfStack(new PreElIfStatement(), ctx);
			currentItem = stack.peek();
		} else {
			System.out.println("Added preFragment to parent ExpressionStatement");
			PreFragment expression = new PreFragment();
			ASTNodeFactory.initializeFromContext(expression, ctx);
			rootCompound.addChild( (PreFragment) stack.pop()); //Remove the fragment from stack and add it to the toplevel compound				
		}
	}

	/**
	 * Replace top of stack with the current item, as the parent item is only a
	 * placeholder This makes the element appear as a {@link PreEndIfStatement},
	 * rather than a {@link Statement}
	 * 
	 * @param ctx
	 */
	public void enterPreEndIf(Pre_endif_statementContext ctx) {
//		System.out.println("Enter endif");
		//Only replace the top statement if it's not a PreFragment, as this needs separate handling (we currently need no PreIfStatement in this case
		if (!(stack.peek() instanceof PreFragment)) {
			replaceTopOfStack(new PreEndIfStatement(), ctx);
			currentItem = stack.peek();
		} else {
			System.out.println("Added preFragment to parent ExpressionStatement");
			PreFragment expression = new PreFragment();
			ASTNodeFactory.initializeFromContext(expression, ctx);
			rootCompound.addChild( (PreFragment) stack.pop()); //Remove the fragment from stack and add it to the toplevel compound				
		}
	}

	/**
	 * Pushes the item on the stack
	 * 
	 * @param ctx
	 */
	public void enterPreIfCondition(Pre_if_conditionContext ctx) {
		PreIfCondition cond = new PreIfCondition();
		nodeToRuleContext.put(cond, ctx);
		stack.push(cond);
	}

	/**
	 * Pops the item from the stack and adds it to its parents
	 * 
	 * @param ctx
	 */
	public void exitPreIfConditionn(Pre_if_conditionContext ctx) {
		PreIfCondition cond = (PreIfCondition) stack.pop();
		ASTNodeFactory.initializeFromContext(cond, ctx);
		nesting.addItemToParent(cond);
	}
	
	/**
	 * Handles the preprocessor AST and variability analysis
	 * 
	 * @param itemToRemove
	 * @return True if itemToRemove needs to be consolidated, false otherwise
	 */
	private Boolean preprocessorHandling(ASTNode itemToRemove) {	
		// If the current item is an #endif
		if (itemToRemove instanceof PreEndIfStatement) {
			// #endifs are only collected on the AST stack, not the variability stack
			preASTItemStack.push(itemToRemove);
			// Remove items from stack until the next #if/#ifdef
			closeASTBlock();
			closeVariabilityBlock();
			logger.debug("AST and variability block closed!");
			// Remove item from the stack
			stack.pop();
			return false;
		} else if (itemToRemove instanceof PreBlockstarter) {
			// Collect all Pre Blockstarters on the Stack
			variabilityItemStack.push(itemToRemove);
			preASTItemStack.push(itemToRemove);
			logger.debug(itemToRemove.getEscapedCodeStr()+" collected on AST and variability stack");
			// Connect only the #if with the function content compound statement
			if (itemToRemove instanceof PreIfStatement) {
				stack.pop();
				rootCompound.addChild(itemToRemove);
				logger.debug("Connected "+itemToRemove.getEscapedCodeStr()+" with root compound statement");
			} else {
				// Remove item from the stack. The nesting will be resolved in the closeASTBlock function
				stack.pop();
			}
			return false;
		} else {
			// Check variability for all other types (except the top last compound statement, which is needed for function content building)
			if (stack.size() > 1 && !(itemToRemove instanceof CompoundStatement)) {
				//Set previous statement
				previousStatement = itemToRemove;
				checkVariability(itemToRemove);
			}
			return true;
		}
	}
	
	/**
	 * Check if the current ASTNode is inside an #ifdef block and therefore variable
	 * 
	 * @param currentNode
	 */
	private void checkVariability(ASTNode currentNode) {
		if (!variabilityItemStack.isEmpty()) {
			PreBlockstarter parent = (PreBlockstarter) variabilityItemStack.peek();
			parent.addVariableStatement(currentNode);

			logger.debug("Connected variability child of type: "+currentNode.getTypeAsString()+" with code: "+currentNode.getEscapedCodeStr()+" with parent: "+parent.getEscapedCodeStr());
		} else {
			logger.debug("Current node of type "+currentNode.getTypeAsString()+" with code "+currentNode.getEscapedCodeStr()+" is not variable!");
		}
	}

	/**
	 * Removes collected PreBlockstarters from the stack. 
	 * Stop if the stack is empty or if we reach an PreIfStatement.
	 */
	private void closeVariabilityBlock() {
		if (!variabilityItemStack.isEmpty()) {
			PreBlockstarter currentNode = (PreBlockstarter) variabilityItemStack.pop();
			
			// Stop if we reach an PreIfStatement
			if (currentNode instanceof PreIfStatement) {
				checkVariability(currentNode);
			} else {
				closeVariabilityBlock();
			}
		}
	}
	
	/**
	 * Removes collected PreBlockstarters from the stack and connects them with AST relations.
	 * When this method is first called, the top stack item should be an #endif
	 * Stop if the AST stack is empty or if we reach an PreIfStatement.
	 */
	private void closeASTBlock() {
		if (preASTItemStack.size() > 1) {
			//Remove the current AST node from the stack
			PreBlockstarter currentNode = (PreBlockstarter) preASTItemStack.pop();
			//Look at the next node on the stack
			PreBlockstarter topOfStack = (PreBlockstarter) preASTItemStack.peek();		
			//Connect the current node with its parent
			topOfStack.addChild(currentNode);	
			logger.debug("Connected AST child: "+currentNode.getEscapedCodeStr()+" with parent: "+topOfStack.getEscapedCodeStr());
		
			// Stop if we reach an PreIfStatement
			if (topOfStack instanceof PreIfStatement) {
				//Remove the PreIfStatement node from the stack and stop the iteration
				currentNode = (PreBlockstarter) preASTItemStack.pop();
				logger.debug("Found #if with code "+currentNode.getEscapedCodeStr()+" for #endif");		
			} else {
				//Connect AST children until we reach a PreIfStatement or there is only 1 item left on the stack
				closeASTBlock();
			}
			
		} else if (preASTItemStack.size() == 1)  {
			//Remove orphaned #endif statements
			PreBlockstarter lastNode = (PreBlockstarter) preASTItemStack.pop();
			logger.debug("Removed orphan: "+lastNode.getEscapedCodeStr()+ " in: "+lastNode.getPath()+ " line: "+lastNode.getLine()+" on function level");
		}
	}

	// ----------------------------------Preprocessor handling end-------------------------------------------------------------
	// ----------------------------------Comment handling ---------------------------------------------------------------------
	

	public void enterComment(CommentContext ctx) {
		replaceTopOfStack(new Comment(), ctx);	
	}

	/**
	 * Checks if there is a comment in the same line as a statement and connects both if so
	 * @return True if there is a comment in the same line, false otherwise
	 */
	private Boolean checkIfCommentInSameLine(Comment comment) {
		//If there are statement and comment in the same line
		if(previousStatement != null && previousStatement.getLine() == comment.getLine()) {
			comment.setCommentee(previousStatement);
			//Save for later, because we need the commentee to be initialized
			pendingList.add(comment);
			
			logger.debug("Found commentee in same line "+previousStatement.getEscapedCodeStr());
			return true;
		} else {
			return false;
		}		
	}
	
	/**
	 * Checks if there is a comment above a statement and connects both if so
	 * @param node
	 */
	private void checkIfCommented(ASTNode node) {
		while (!commentStack.isEmpty()) {
			// Remove comments from stack
			Comment comment = commentStack.pop();
			// Add the current node (which is underneath the comment) as commentee
			comment.setCommentee(node);
			logger.debug("Found commentee "+node.getEscapedCodeStr());
			//Save for later, because we need the commentee to be initialized
			pendingList.add(comment);
		}

	}
	// ----------------------------------Comment handling end------------------------------------------------------------------	
	// ----------------------------------Custom handling ---------------------------------------------------------------------
	
	/**
	 * Pushes the item on the stack
	 * 
	 * @param ctx
	 */
	public void enterCustom(CustomContext ctx) {
		CustomNode node = new CustomNode();
		nodeToRuleContext.put(node, ctx);
		stack.push(node);
	}

	/**
	 * Pops the item from the stack and adds it to its parents
	 * 
	 * @param ctx
	 */
	public void exitCustom(CustomContext ctx) {
		CustomNode node = (CustomNode) stack.pop();
		ASTNodeFactory.initializeFromContext(node, ctx);
		nesting.addItemToParent(node);
	}


// ----------------------------------Custom handling end------------------------------------------------------------------	
	
	/**
	 * This is called for every AST node that is classified as a statement (based on grammar, e.g. expressionStatement is a statement)
	 * @param ctx
	 */
	public void exitStatement(StatementContext ctx) {
		//We need this switch, because some pre statements should not be consolidated at this point
		Boolean consolidate = true;
		
		if (stack.size() == 0) {
			throw new RuntimeException("Empty stack in FunctionContentBuilder exitStatement");
		}

		ASTNode itemToRemove = stack.peek();		
		
		//Collect comments and check potential commentees
		if(itemToRemove instanceof Comment) {
			//Use the dedicated comment creation function
			ASTNodeFactory.initializeFromContext((Comment) itemToRemove, ctx);
			
			//Check if there was a previous statement in the same line
			Boolean commentInSameLine = checkIfCommentInSameLine((Comment) itemToRemove);
			
			//Put comment on the stack only if it was not already connected to something in the same line
			if(!commentInSameLine) {
				commentStack.push((Comment) itemToRemove);	
			}
			
			stack.pop();
			return;
		} else {
			previousStatement = itemToRemove;
			checkIfCommented(itemToRemove);
		}
		
		//Initialize nodes just once
		if (itemToRemove.getLine() == -1) {
			ASTNodeFactory.initializeFromContext(itemToRemove, ctx);
		}
				
		consolidate = preprocessorHandling(itemToRemove);
						
		if (itemToRemove instanceof BlockCloser) {
			//Check if the BlockCloser is the last item on the stack
			if(stack.size() == 2) {
				closeParentCompountStatement();
			} else {
				closeCompoundStatement();
			}
			return;
		}

		// We keep Block-starters and compound items on the stack. They are removed by following statements.
		if (itemToRemove instanceof BlockStarter || itemToRemove instanceof CompoundStatement) {
			if(itemToRemove instanceof WhileStatement) {
				nesting.checkDoWhile(itemToRemove);
			}
			return;
		}
		
		if (consolidate)
			nesting.consolidate();
	}

	private void closeCompoundStatement() {
		BlockCloser bc = (BlockCloser) stack.pop(); // remove 'CloseBlock'
		CompoundStatement compoundItem = (CompoundStatement) stack.pop();
		compoundItem.addChild(bc);
		nesting.consolidateBlockStarters(compoundItem);
	}
	
	/**
	 * Only use this once if the parent compound statement content has been parsed.
	 */
	private void closeParentCompountStatement() {
		BlockCloser bc = (BlockCloser) stack.pop(); 
		CompoundStatement compoundItem = (CompoundStatement) stack.peek();
		compoundItem.addChild(bc);
	}

	/**
	 * Keep pre statement blockstarters on the stack, consolidate them if an
	 * {@link PreEndifStatement)is reached Add all {@link PreStatement}s and
	 * included compound statements to their respective parent
	 * 
	 * @param itemToRemove
	 */


	// Expression handling
	public void enterExpression(ExprContext ctx) {
		System.out.println("Enter expr");
		Expression expression = new Expression();
		nodeToRuleContext.put(expression, ctx);
		stack.push(expression);
	}

	public void exitExpression(ExprContext ctx) {
		nesting.consolidateSubExpression(ctx);
	}

	public void enterAssignment(Assign_exprContext ctx) {
		AssignmentExpression expr = new AssignmentExpression();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
		//No variability check here (as there will be no nodes of this type)
	}

	public void exitAssignment(Assign_exprContext ctx) {
		nesting.consolidateSubExpression(ctx);
	}

	public void enterConditionalExpr(Conditional_expressionContext ctx) {
		ConditionalExpression expr = new ConditionalExpression();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
	}

	public void exitConditionalExpr(Conditional_expressionContext ctx) {
		introduceCndNodeForCndExpr();
		nesting.consolidateSubExpression(ctx);
	}

	public void enterOrExpression(Or_expressionContext ctx) {
		OrExpression expr = new OrExpression();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
	}

	public void exitrOrExpression(Or_expressionContext ctx) {
		nesting.consolidateSubExpression(ctx);
	}

	public void enterAndExpression(And_expressionContext ctx) {
		AndExpression expr = new AndExpression();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
	}

	public void exitAndExpression(And_expressionContext ctx) {
		nesting.consolidateSubExpression(ctx);
	}

	public void enterInclusiveOrExpression(Inclusive_or_expressionContext ctx) {
		InclusiveOrExpression expr = new InclusiveOrExpression();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
	}

	public void exitInclusiveOrExpression(Inclusive_or_expressionContext ctx) {
		nesting.consolidateSubExpression(ctx);
	}

	public void enterExclusiveOrExpression(Exclusive_or_expressionContext ctx) {
		ExclusiveOrExpression expr = new ExclusiveOrExpression();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
	}

	public void exitExclusiveOrExpression(Exclusive_or_expressionContext ctx) {
		nesting.consolidateSubExpression(ctx);
	}

	public void enterBitAndExpression(Bit_and_expressionContext ctx) {
		BitAndExpression expr = new BitAndExpression();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
	}

	public void enterEqualityExpression(Equality_expressionContext ctx) {
		EqualityExpression expr = new EqualityExpression();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
	}

	public void exitEqualityExpression(Equality_expressionContext ctx) {
		nesting.consolidateSubExpression(ctx);
	}

	public void exitBitAndExpression(Bit_and_expressionContext ctx) {
		nesting.consolidateSubExpression(ctx);
	}

	public void enterRelationalExpression(Relational_expressionContext ctx) {
		RelationalExpression expr = new RelationalExpression();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
	}

	public void exitRelationalExpression(Relational_expressionContext ctx) {
		nesting.consolidateSubExpression(ctx);
	}

	public void enterShiftExpression(Shift_expressionContext ctx) {
		ShiftExpression expr = new ShiftExpression();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
	}

	public void exitShiftExpression(Shift_expressionContext ctx) {
		nesting.consolidateSubExpression(ctx);
	}

	public void enterAdditiveExpression(Additive_expressionContext ctx) {
		AdditiveExpression expr = new AdditiveExpression();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
	}

	public void exitAdditiveExpression(Additive_expressionContext ctx) {
		nesting.consolidateSubExpression(ctx);
	}

	public void enterMultiplicativeExpression(Multiplicative_expressionContext ctx) {
		MultiplicativeExpression expr = new MultiplicativeExpression();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
	}

	public void exitMultiplicativeExpression(Multiplicative_expressionContext ctx) {
		nesting.consolidateSubExpression(ctx);
	}

	public void enterCastExpression(Cast_expressionContext ctx) {
		CastExpression expr = new CastExpression();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
	}

	public void exitCastExpression(Cast_expressionContext ctx) {
		nesting.consolidateSubExpression(ctx);
	}

	public void enterCast_target(Cast_targetContext ctx) {
		CastTarget expr = new CastTarget();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
	}

	public void exitCast_target(Cast_targetContext ctx) {
		nesting.consolidateSubExpression(ctx);
	}
	
	public void enterFunctionPointerUse(Function_pointer_use_expressionContext ctx) {
		FunctionPointerUseExpression expr = new FunctionPointerUseExpression();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
	}

	public void exitFunctionPointerUse(Function_pointer_use_expressionContext ctx) {
		nesting.consolidateSubExpression(ctx);
	}	

	public void enterFuncCall(FuncCallContext ctx) {
		CallExpression expr = new CallExpression();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
		//No variability check here, as there will be a parent expression node
	}

	public void exitFuncCall(FuncCallContext ctx) {
		introduceCalleeNode();
		nesting.consolidateSubExpression(ctx);
	}

	public void enterSizeof(SizeofContext ctx) {
		Sizeof expr = new Sizeof();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
		//Set previous statement
		previousStatement = expr;
		checkVariability(expr);
		checkIfCommented(expr);
	}

	public void exitSizeof(SizeofContext ctx) {
		nesting.consolidateSubExpression(ctx);
	}

	private void introduceCalleeNode() {
		CallExpression expr;
		try {
			expr = (CallExpression) stack.peek();
		} catch (EmptyStackException ex) {
			return;
		}

		ASTNode child = expr.getChild(0);
		if (child == null)
			return;

		Callee callee = new Callee();
		callee.addChild(child);
		expr.replaceFirstChild(callee);
	}

	private void introduceCndNodeForCndExpr() {
		ConditionalExpression expr;
		try {
			expr = (ConditionalExpression) stack.peek();
		} catch (EmptyStackException ex) {
			return;
		}

		ASTNode child = expr.getChild(0);
		if (child == null)
			return;
		Condition cnd = new Condition();
		cnd.addChild(child);
		expr.replaceFirstChild(cnd);

	}

	public void enterCondition(ConditionContext ctx) {
		Condition expr = new Condition();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
	}

	public void exitCondition(ConditionContext ctx) {
		Condition cond = (Condition) stack.pop();
		ASTNodeFactory.initializeFromContext(cond, ctx);
		nesting.addItemToParent(cond);
	}

	public void enterDeclByClass(DeclByClassContext ctx) {
		ClassDefBuilder classDefBuilder = new ClassDefBuilder();
		classDefBuilder.createNew(ctx);
		classDefBuilder.setName(ctx.class_def().class_name());
		ASTNode node = classDefBuilder.getItem();
		replaceTopOfStack(node, ctx);
		//Set previous statement
		previousStatement = node;
		checkVariability(node);
		checkIfCommented(node);
	}

	public void exitDeclByClass() {
		nesting.consolidate();
	}

	public void enterInitDeclSimple(InitDeclSimpleContext ctx) {
		ASTNode identifierDecl = buildDeclarator(ctx);
		nodeToRuleContext.put(identifierDecl, ctx);
		stack.push(identifierDecl);
	}

	public void exitInitDeclSimple() {
		IdentifierDecl identifierDecl = (IdentifierDecl) stack.pop();
		ASTNode stmt = stack.peek();
		stmt.addChild(identifierDecl);
	}

	public void enterInitDeclWithAssign(InitDeclWithAssignContext ctx) {
		IdentifierDecl identifierDecl = buildDeclarator(ctx);
		nodeToRuleContext.put(identifierDecl, ctx);
		stack.push(identifierDecl);
	}

	public void exitInitDeclWithAssign(InitDeclWithAssignContext ctx) {
		IdentifierDecl identifierDecl = (IdentifierDecl) stack.pop();

		Expression lastChild = (Expression) identifierDecl.popLastChild();
		AssignmentExpression assign = ASTNodeFactory.create(ctx);

		// This is a bit of a hack. As we go up,
		// we introduce an artificial assignment-node.

		assign.addChild(new Identifier(identifierDecl.getName()));
		assign.addChild(lastChild);

		identifierDecl.addChild(assign);

		ASTNode stmt = stack.peek();
		stmt.addChild(identifierDecl);
	}

	public void enterInitDeclWithCall(InitDeclWithCallContext ctx) {
		ASTNode identifierDecl = buildDeclarator(ctx);
		nodeToRuleContext.put(identifierDecl, ctx);
		stack.push(identifierDecl);
	}

	public void exitInitDeclWithCall() {
		IdentifierDecl identifierDecl = (IdentifierDecl) stack.pop();
		ASTNode stmt = stack.peek();
		stmt.addChild(identifierDecl);
	}

	private IdentifierDecl buildDeclarator(ParserRuleContext ctx) {
		InitDeclContextWrapper wrappedContext = new InitDeclContextWrapper(ctx);
		ParserRuleContext typeName = getTypeFromParent();
		IdentifierDeclBuilder declBuilder = new IdentifierDeclBuilder();
		declBuilder.createNew(ctx);
		declBuilder.setType(wrappedContext, typeName);
		IdentifierDecl identifierDecl = (IdentifierDecl) declBuilder.getItem();
		return identifierDecl;
	}

	private ParserRuleContext getTypeFromParent() {
		ASTNode parentItem = stack.peek();
		ParserRuleContext typeName;
		
		if (parentItem instanceof IdentifierDeclStatement) {
			IdentifierDeclStatement stmt = ((IdentifierDeclStatement) parentItem);
			IdentifierDeclType type = stmt.getType();
			typeName = nodeToRuleContext.get(type);
		} else if (parentItem instanceof ClassDefStatement) {
			Identifier name = ((ClassDefStatement) parentItem).getIdentifier();
			typeName = nodeToRuleContext.get(name);
		} else if (parentItem instanceof StructUnionEnum) {
			//TODO get type of struct?
			typeName = nodeToRuleContext.get("StructUnionEnum");
		} else if (parentItem instanceof FunctionPointerDeclare) {
			//TODO get type of struct?
			typeName = nodeToRuleContext.get("FunctionPointerDeclare");
		} else {
			throw new RuntimeException("No matching declaration statement/class definiton for init declarator");
		}
		return typeName;
	}

	public void enterIncDec(Inc_decContext ctx) {
		IncDec expr = new IncDec();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
	}

	public void exitIncDec(Inc_decContext ctx) {
		nesting.consolidateSubExpression(ctx);
	}

	public void enterArrayIndexing(ArrayIndexingContext ctx) {
		ArrayIndexing expr = new ArrayIndexing();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
	}

	public void exitArrayIndexing(ArrayIndexingContext ctx) {
		nesting.consolidateSubExpression(ctx);
	}

	public void enterMemberAccess(MemberAccessContext ctx) {
		MemberAccess expr = new MemberAccess();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
	}

	public void exitMemberAccess(MemberAccessContext ctx) {
		nesting.consolidateSubExpression(ctx);
	}

	public void enterIncDecOp(IncDecOpContext ctx) {
		PostIncDecOperationExpression expr = new PostIncDecOperationExpression();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
		//No variability check here, as there will be a parent expression node
	}

	public void exitIncDecOp(IncDecOpContext ctx) {
		nesting.consolidateSubExpression(ctx);
	}

	public void enterPreIncDecOp(IncDecOpContext ctx) {
		PreIncDecOperationExpression expr = new PreIncDecOperationExpression();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
		//No variability check here, as there will be a parent expression node
	}

	public void exitPreIncDecOp(IncDecOpContext ctx) {
		nesting.consolidateSubExpression(ctx);
	}

	public void enterPrimary(Primary_expressionContext ctx) {
		PrimaryExpression expr = new PrimaryExpression();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
	}

	public void exitPrimary(Primary_expressionContext ctx) {
		nesting.consolidateSubExpression(ctx);
	}
	
	public void enterNullExpression(Null_expressionContext ctx) {
		NullExpression expr = new NullExpression();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
	}

	public void exitNullExpression(Null_expressionContext ctx) {
		nesting.consolidateSubExpression(ctx);
	}

	public void enterUnaryExpression(Unary_expressionContext ctx) {
		UnaryExpression expr = new UnaryExpression();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
	}

	public void exitUnaryExpression(Unary_expressionContext ctx) {
		nesting.consolidateSubExpression(ctx);
	}

	public void enterIdentifier(IdentifierContext ctx) {
		Identifier expr = new Identifier();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
	}

	public void exitIdentifier(IdentifierContext ctx) {
		nesting.consolidateSubExpression(ctx);
	}


	public void enterArgumentList(Argument_listContext ctx) {
		ArgumentList expr = new ArgumentList();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
	}

	public void exitArgumentList(Argument_listContext ctx) {
		nesting.consolidateSubExpression(ctx);
	}
	
	public void enterArgument(ArgumentContext ctx) {
		Argument expr = new Argument();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
	}

	public void exitArgument(ArgumentContext ctx) {
		nesting.consolidateSubExpression(ctx);
	}

	public void enterPtrMemberAccess(PtrMemberAccessContext ctx) {
		PtrMemberAccess expr = new PtrMemberAccess();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
	}

	public void exitPtrMemberAccess(PtrMemberAccessContext ctx) {
		nesting.consolidateSubExpression(ctx);
	}

	public void enterInitFor(For_init_statementContext ctx) {
		ForInit expr = new ForInit();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
	}

	public void exitInitFor(For_init_statementContext ctx) {
		ASTNode node = stack.pop();
		ASTNodeFactory.initializeFromContext(node, ctx);
		ForStatement forStatement = (ForStatement) stack.peek();
		forStatement.addChild(node);
	}

	public void enterSwitchStatement(Switch_statementContext ctx) {
		replaceTopOfStack(new SwitchStatement(), ctx);
	}

	public void enterLabel(LabelContext ctx) {
		replaceTopOfStack(new Label(), ctx);
	}

	public void enterReturnStatement(ReturnStatementContext ctx) {
		replaceTopOfStack(new ReturnStatement(), ctx);
	}

	public void enterBreakStatement(BreakStatementContext ctx) {
		replaceTopOfStack(new BreakStatement(), ctx);
	}

	public void enterContinueStatement(ContinueStatementContext ctx) {
		replaceTopOfStack(new ContinueStatement(), ctx);
	}

	public void enterGotoStatement(GotoStatementContext ctx) {
		replaceTopOfStack(new GotoStatement(), ctx);
	}

	public void addLocalDecl(IdentifierDecl decl) {
		IdentifierDeclStatement declStmt = (IdentifierDeclStatement) stack.peek();
		declStmt.addChild(decl);
	}

	public void enterDeclByType(ParserRuleContext ctx, Type_nameContext type_nameContext) {
		IdentifierDeclStatement declStmt = new IdentifierDeclStatement();
		ASTNodeFactory.initializeFromContext(declStmt, ctx);

		IdentifierDeclType type = new IdentifierDeclType();
		ASTNodeFactory.initializeFromContext(type, type_nameContext);
		nodeToRuleContext.put(type, type_nameContext);
		declStmt.addChild(type);

		if (stack.peek() instanceof Statement && !(stack.peek() instanceof StructUnionEnum)) {
			replaceTopOfStack(declStmt, ctx);
		} else {
			nodeToRuleContext.put(declStmt, ctx);
			stack.push(declStmt);
		}		
		
		//Set previous statement
		previousStatement = declStmt;
		checkVariability(declStmt);
		checkIfCommented(declStmt);
	}
	

	public void exitDeclByType() {
		nesting.consolidate();
	}
	
	public void enterStructUnionEnum(ParserRuleContext ctx) {
		logger.debug("Enter function struct");
		StructUnionEnum struct = new StructUnionEnum();
		ASTNodeFactory.initializeFromContext(struct, ctx);

		//Resolve nesting, only replace placeholder statement nodes
		if (stack.peek().getClass() == Statement.class) {
			replaceTopOfStack(struct, ctx);
		} else {
			nodeToRuleContext.put(struct, ctx);
			stack.push(struct);
		}	
		
		//TODO check if this works when called from module level
		//Set previous statement
		previousStatement = struct;
		checkVariability(struct);
		checkIfCommented(struct);
	}
	

	
	public void exitStructUnionEnum() {
		logger.debug("Leave function struct");
		nesting.consolidate();
	}
	
	public void enterFunctionPointerDeclare(ParserRuleContext ctx) {
		logger.debug("Enter FunctionPointerDeclare");
		FunctionPointerDeclare fpdecl = new FunctionPointerDeclare();
		ASTNodeFactory.initializeFromContext(fpdecl, ctx);

		//Resolve nesting, only replace placeholder statement nodes
		if (stack.peek().getClass() == Statement.class) {
			replaceTopOfStack(fpdecl, ctx);
		} else {
			nodeToRuleContext.put(fpdecl, ctx);
			stack.push(fpdecl);
		}	
		
		//TODO check if this works when called from module level
		//Set previous statement
		previousStatement = fpdecl;
		checkVariability(fpdecl);
		checkIfCommented(fpdecl);
	}
	

	
	public void exitFunctionPointerDeclare() {
		logger.debug("Leave FunctionPointerDeclare");
		nesting.consolidate();
	}	

	protected void replaceTopOfStack(ASTNode item, ParserRuleContext ctx) {
		//Removes the topNode
		stack.pop();
		nodeToRuleContext.put(item, ctx);
		//Puts a new node on the top
		stack.push(item);
	}

	public void enterSizeofExpr(Sizeof_expressionContext ctx) {
		SizeofExpression expr = new SizeofExpression();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
		//No variability check here, as there will be a parent expression node
	}

	public void exitSizeofExpr(Sizeof_expressionContext ctx) {
		nesting.consolidateSubExpression(ctx);
	}

	public void enterSizeofOperand2(Sizeof_operand2Context ctx) {
		SizeofOperand expr = new SizeofOperand();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
	}

	public void enterSizeofOperand(Sizeof_operandContext ctx) {
		SizeofOperand expr = new SizeofOperand();
		stack.push(expr);
	}

	public void exitSizeofOperand2(Sizeof_operand2Context ctx) {
		nesting.consolidateSubExpression(ctx);
	}

	public void exitSizeofOperand(Sizeof_operandContext ctx) {
		nesting.consolidateSubExpression(ctx);
	}

	public void enterUnaryOpAndCastExpr(Unary_op_and_cast_exprContext ctx) {
		UnaryOperationExpression expr = new UnaryOperationExpression();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
		//No variability check here, as there will be a parent expression node
	}

	public void exitUnaryOpAndCastExpr(Unary_op_and_cast_exprContext ctx) {
		nesting.consolidateSubExpression(ctx);
	}
	
	public void enterAddress_of_expression(Address_of_expressionContext ctx) {
		AddressOfExpression expr = new AddressOfExpression();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
		//No variability check here, as there will be a parent expression node
	}

	public void exitAddress_of_expression(Address_of_expressionContext ctx) {
		nesting.consolidateSubExpression(ctx);
	}
	

	public void enterUnaryOperator(Unary_operatorContext ctx) {
		UnaryOperator expr = new UnaryOperator();
		nodeToRuleContext.put(expr, ctx);
		stack.push(expr);
	}

	public void exitUnaryOperator(Unary_operatorContext ctx) {
		nesting.consolidateSubExpression(ctx);
	}

	public void enterTryStatement(Try_statementContext ctx) {
		replaceTopOfStack(new TryStatement(), ctx);
	}

	public void enterCatchStatement(Catch_statementContext ctx) {
		replaceTopOfStack(new CatchStatement(), ctx);
	}

	public void enterThrowStatement(ThrowStatementContext ctx) {
		replaceTopOfStack(new ThrowStatement(), ctx);
	}

	/**
	 * Pop newline parent statement from the stack, as we dont need it as a node.
	 * 
	 * @param ctx
	 */
	public void enterNewline(NewlineContext ctx) {
		stack.pop();

	}

}
