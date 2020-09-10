package outputModules.csv;

import ast.Comment;
import ast.custom.CustomNode;
import ast.declarations.ClassDefStatement;
import ast.functionDef.FunctionDefBase;
import ast.preprocessor.PreStatementBase;
import ast.statements.FunctionPointerDeclare;
import ast.statements.IdentifierDeclStatement;
import ast.statements.StructUnionEnum;
import databaseNodes.EdgeTypes;
import outputModules.common.ASTNodeExporter;
import outputModules.common.OutModASTNodeVisitor;
import outputModules.common.Writer;
import outputModules.csv.exporters.CSVClassDefExporter;
import outputModules.csv.exporters.CSVCommentExporter;
import outputModules.csv.exporters.CSVCustomExporter;
import outputModules.csv.exporters.CSVDeclStmtExporter;
import outputModules.csv.exporters.CSVFunctionExporter;
import outputModules.csv.exporters.CSVPreStatementExporter;
import outputModules.csv.exporters.CSVStructUnionEnumExporter;

public class CSVASTNodeVisitor extends OutModASTNodeVisitor {

	private CSVFunctionExporter functionExporter;

	@Override
	public void visit(FunctionDefBase node) {
		ASTNodeExporter importer = functionExporter;
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
		importNode(importer, node);
	}
	
	// Comment handling
	@Override
	public void visit(Comment node) {
		ASTNodeExporter importer = new CSVCommentExporter();
		importNode(importer, node);
	}
	
	// Custom handling
	@Override
	public void visit(CustomNode node) {
		ASTNodeExporter importer = new CSVCustomExporter();
		importNode(importer, node);
	}
	
	// StructUnionEnum handling
	@Override
	public void visit(StructUnionEnum node) {
		ASTNodeExporter importer = new CSVStructUnionEnumExporter();
		importNode(importer, node);
	}
	
	// Function pointer handling
	@Override
	public void visit(FunctionPointerDeclare node) {
		ASTNodeExporter importer = new CSVStructUnionEnumExporter();
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
