package parsing;

import org.antlr.v4.runtime.ParserRuleContext;

import ast.CodeLocation;

public class CodeLocationExtractor {

	public static CodeLocation extractFromContext(ParserRuleContext ctx) {
		CodeLocation location = new CodeLocation();

		location.startLine = ctx.start.getLine();
		location.endLine = ctx.stop.getLine();

		return location;
	}
}
