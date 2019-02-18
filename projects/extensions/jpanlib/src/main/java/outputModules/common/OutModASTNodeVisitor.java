package outputModules.common;

import ast.ASTNode;
import ast.declarations.ClassDefStatement;
import ast.preprocessor.PreStatementBase;
import ast.walking.ASTNodeVisitor;

public abstract class OutModASTNodeVisitor extends ASTNodeVisitor
{
	protected long importNode(ASTNodeExporter importer, ASTNode node)
	{
		importer.setCurrentFile(currentFileNode);
		importer.addToDatabaseSafe(node);
		long mainNodeId = importer.getMainNodeId();
		addLinkToClassDef(mainNodeId);
		importer = null;
		return mainNodeId;
	}

	private void addLinkToClassDef(long dstNodeId)
	{
		if (contextStack.size() == 0)
			return;
		Long classId = contextStack.peek();
		addEdgeFromClassToFunc(dstNodeId, classId);
	}

	protected abstract void addEdgeFromClassToFunc(long dstNodeId,
			Long classId);

	protected void visitClassDefContent(ClassDefStatement node,
			long classNodeId)
	{
		// visit compound statement, it might contain
		// functions, declarations or other class definitions
		contextStack.push(classNodeId);
		visit(node.content);
		contextStack.pop();
	}
	
	//Preprocessor
	protected void visitPreStatementContent(PreStatementBase node, long PreNodeId) {
		// visit compound statement, it might contain
		// functions, declarations, pre statements or class definitions
		contextStack.push(PreNodeId);
		//TODO
		//visit(node.content);
		contextStack.pop();
	}
}
