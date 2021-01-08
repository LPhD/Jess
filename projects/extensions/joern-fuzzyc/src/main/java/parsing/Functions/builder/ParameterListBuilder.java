package parsing.Functions.builder;

import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;

import antlr.ModuleParser.Parameter_declContext;
import antlr.ModuleParser.Parameter_idContext;
import ast.ASTNodeBuilder;
import ast.c.functionDef.ParameterType;
import ast.functionDef.ParameterBase;
import ast.functionDef.ParameterList;
import parsing.ASTNodeFactory;
import parsing.ParseTreeUtils;

public class ParameterListBuilder extends ASTNodeBuilder {

	ParameterList thisItem;

	@Override
	public void createNew(ParserRuleContext ctx) {
		item = new ParameterList();
		thisItem = (ParameterList) item;
		ASTNodeFactory.initializeFromContext(thisItem, ctx);
	}

	public void addParameter(Parameter_declContext aCtx, Stack<ASTNodeBuilder> itemStack) {
		Parameter_declContext ctx = aCtx;
		Parameter_idContext parameter_id = ctx.parameter_id();
		ParameterBase param = null;
		String baseType = "";
		String completeType = "";
		
		//This is for parameter void (used in C to explicitely disallow parameters, because otherwise an empty parameter list allows a variable number)
		if(parameter_id == null) {
			param = ASTNodeFactory.createVoid(ctx);
			baseType = "void";
			completeType = "void";
		} else {		
			param = ASTNodeFactory.create(ctx);
			baseType = ParseTreeUtils.childTokenString(ctx.type_name());
			completeType = determineCompleteType(parameter_id, baseType);
		}
		
		((ParameterType) param.getType()).setBaseType(baseType);
		((ParameterType) param.getType()).setCompleteType(completeType);

		thisItem.addChild(param);
	}

	public String determineCompleteType(Parameter_idContext parameter_id, String baseType) {
		String retType = baseType;

		// TODO: use a string-builder here and clean this up.

		// iterate until nesting level is reached
		// where type is given.

		while (parameter_id.parameter_name() == null) {

			String newCompleteType = "";

			newCompleteType += "(";

			if (parameter_id.ptrs() != null)
				newCompleteType += ParseTreeUtils.childTokenString(parameter_id.ptrs()) + " ";
			if (parameter_id.type_suffix() != null)
				newCompleteType += ParseTreeUtils.childTokenString(parameter_id.type_suffix()) + " ";

			newCompleteType += retType;
			newCompleteType += ")";
			retType = newCompleteType;
			parameter_id = parameter_id.parameter_id();
		}

		if (parameter_id.ptrs() != null)
			retType += " " + ParseTreeUtils.childTokenString(parameter_id.ptrs());
		if (parameter_id.type_suffix() != null)
			retType += " " + ParseTreeUtils.childTokenString(parameter_id.type_suffix());

		return retType;
	}

}
