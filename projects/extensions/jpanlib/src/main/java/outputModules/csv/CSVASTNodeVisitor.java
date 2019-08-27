package outputModules.csv;

import ast.Comment;
import ast.declarations.ClassDefStatement;
import ast.functionDef.FunctionDefBase;
import ast.preprocessor.PreStatementBase;
import ast.statements.IdentifierDeclStatement;
import databaseNodes.EdgeTypes;
import outputModules.common.ASTNodeExporter;
import outputModules.common.OutModASTNodeVisitor;
import outputModules.common.Writer;
import outputModules.csv.exporters.CSVClassDefExporter;
import outputModules.csv.exporters.CSVCommentExporter;
import outputModules.csv.exporters.CSVDeclStmtExporter;
import outputModules.csv.exporters.CSVFunctionExporter;
import outputModules.csv.exporters.CSVPreStatementExporter;

public class CSVASTNodeVisitor extends OutModASTNodeVisitor {

	private CSVFunctionExporter functionExporter;

	@Override
	public void visit(FunctionDefBase node) {
		ASTNodeExporter importer = functionExporter;
		System.out.println("Import function");
		importNode(importer, node);
	}

	@Override
	public void visit(ClassDefStatement node) {
		ASTNodeExporter importer = new CSVClassDefExporter();
		long classNodeId = importNode(importer, node);
		visitClassDefContent(node, classNodeId);
	}

	@Override
	public void visit(IdentifierDeclStatement node) {
		ASTNodeExporter importer = new CSVDeclStmtExporter();
		importNode(importer, node);
	}

	// Preprocessor handling
	@Override
	public void visit(PreStatementBase node) {
		ASTNodeExporter importer = new CSVPreStatementExporter();
		System.out.println("Import pre statement");
		importNode(importer, node);
	}
	
	// Comment handling
	@Override
	public void visit(Comment node) {
		ASTNodeExporter importer = new CSVCommentExporter();
		System.out.println("Import comment");
		importNode(importer, node);
	}

	@Override
	protected void addEdgeFromClassToFunc(long dstNodeId, Long classId) {
		Writer.addEdge(classId, dstNodeId, null, EdgeTypes.IS_CLASS_OF);
	}

	public void setFunctionExporter(CSVFunctionExporter functionExporter) {
		this.functionExporter = functionExporter;
	}

}
