package outputModules.neo4j;

import org.neo4j.graphdb.DynamicRelationshipType;
import org.neo4j.graphdb.RelationshipType;

import ast.Comment;
import ast.custom.CustomNode;
import ast.declarations.ClassDefStatement;
import ast.functionDef.FunctionDefBase;
import ast.preprocessor.PreStatementBase;
import ast.statements.FunctionPointerDeclare;
import ast.statements.IdentifierDeclStatement;
import ast.statements.StructUnionEnum;
import databaseNodes.EdgeTypes;
import neo4j.batchInserter.Neo4JBatchInserter;
import outputModules.common.ASTNodeExporter;
import outputModules.common.OutModASTNodeVisitor;
import outputModules.neo4j.exporters.Neo4JClassDefExporter;
import outputModules.neo4j.exporters.Neo4JCommentExporter;
import outputModules.neo4j.exporters.Neo4JCustomExporter;
import outputModules.neo4j.exporters.Neo4JDeclStmtExporter;
import outputModules.neo4j.exporters.Neo4JPreStatementExporter;
import outputModules.neo4j.exporters.Neo4JStructUnionEnumExporter;

// Stays alive during the lifetime of the program

public class Neo4JASTNodeVisitor extends OutModASTNodeVisitor {

	@Override
	public void visit(FunctionDefBase node) {
		ASTNodeExporter importer = new Neo4JFunctionExporter();
		importNode(importer, node);
	}

	@Override
	public void visit(ClassDefStatement node) {
		ASTNodeExporter importer = new Neo4JClassDefExporter();
		long classNodeId = importNode(importer, node);
		visitClassDefContent(node, classNodeId);
	}

	@Override
	public void visit(IdentifierDeclStatement node) {
		ASTNodeExporter importer = new Neo4JDeclStmtExporter();
		importNode(importer, node);
	}


	// Preprocessor handling
	@Override
	public void visit(PreStatementBase node) {
		ASTNodeExporter importer = new Neo4JPreStatementExporter();
		importNode(importer, node);
	}
	
	// Comment handling
	@Override
	public void visit(Comment node) {
		ASTNodeExporter importer = new Neo4JCommentExporter();
		importNode(importer, node);
	}
	
	// Custom handling
	@Override
	public void visit(CustomNode node) {
		ASTNodeExporter importer = new Neo4JCustomExporter();
		importNode(importer, node);
	}
	
	// StructUnionEnum handling
	@Override
	public void visit(StructUnionEnum node) {
		ASTNodeExporter importer = new Neo4JStructUnionEnumExporter();
		importNode(importer, node);
	}

	
	//FunctionPointer handling
	@Override
	public void visit(FunctionPointerDeclare node) {
		ASTNodeExporter importer = new Neo4JStructUnionEnumExporter();
		importNode(importer, node);
	}

	@Override
	protected void addEdgeFromClassToFunc(long dstNodeId, Long classId) {
		RelationshipType rel = DynamicRelationshipType.withName(EdgeTypes.IS_CLASS_OF);
		Neo4JBatchInserter.addRelationship(classId, dstNodeId, rel, null);
	}

}
