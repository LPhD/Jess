package databaseNodes;

import java.util.HashMap;
import java.util.Map;

import ast.ASTNode;
import ast.functionDef.FunctionDefBase;
import cfg.ASTToCFGConverter;
import cfg.CFG;
import cfg.CFGFactory;
import ddg.CFGAndUDGToDefUseCFG;
import ddg.DDGCreator;
import ddg.DataDependenceGraph.DDG;
import ddg.DefUseCFG.DefUseCFG;
import udg.CFGToUDGConverter;
import udg.useDefAnalysis.ASTDefUseAnalyzer;
import udg.useDefGraph.UseDefGraph;

// Note: we currently use the FunctionDatabaseNode
// as a container for the Function. That's not very
// clean. We should have a sep. Function-Class.

public class FunctionDatabaseNode extends DatabaseNode {
	FunctionDefBase astRoot;
	CFG cfg;
	UseDefGraph udg;
	DDG ddg;

	String signature;
	String name;

	ASTToCFGConverter astToCFG = new ASTToCFGConverter();
	CFGToUDGConverter cfgToUDG = new CFGToUDGConverter();
	CFGAndUDGToDefUseCFG udgAndCfgToDefUseCFG = new CFGAndUDGToDefUseCFG();
	DDGCreator ddgCreator = new DDGCreator();

	public void setCFGFactory(CFGFactory factory) {
		astToCFG.setFactory(factory);
	}

	public void setASTDefUseAnalyzer(ASTDefUseAnalyzer analyzer) {
		cfgToUDG.setASTDefUseAnalyzer(analyzer);
	}

	@Override
	public void initialize(Object node) {
		astRoot = (FunctionDefBase) node;
		cfg = astToCFG.convert(astRoot);
		udg = cfgToUDG.convert(cfg);
		DefUseCFG defUseCFG = udgAndCfgToDefUseCFG.convert(cfg, udg);
		ddg = ddgCreator.createForDefUseCFG(defUseCFG);

		setSignature(astRoot);
	}

	@Override
	public Map<String, Object> createProperties() {
		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put(NodeKeys.NODE_TYPE, "Function");
		properties.put(NodeKeys.LINE, ""+this.getLine());
		properties.put(NodeKeys.CLINE, ""+this.getCharAtLine());
		properties.put(NodeKeys.PATH, this.getPath());
		properties.put(NodeKeys.CODE, this.getName());
		return properties;
	}

	public String getName() {
		return astRoot.getName();
	}

	public ASTNode getASTRoot() {
		return astRoot;
	}

	public CFG getCFG() {
		return cfg;
	}
	
	public DDG getDDG() {
		return ddg;
	}

	public UseDefGraph getUDG() {
		return udg;
	}

	public int getLine() {
		return astRoot.getLine();
	}
	
	public String getPath() {
		return astRoot.getPath();
	}
	
	public int getCharAtLine() {
		return astRoot.getCharAtLine();
	}

	public int getContentLine() {
		return astRoot.getContent().getLine();
	}

	public String getSignature() {
		return signature;
	}

	private void setSignature(FunctionDefBase node) {
		signature = node.getFunctionSignature();
	}

}
