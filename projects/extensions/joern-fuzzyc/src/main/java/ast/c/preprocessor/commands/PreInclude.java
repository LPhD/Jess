package ast.c.preprocessor.commands;

import ast.c.preprocessor.commands.macro.PreMacroIdentifier;
import ast.preprocessor.PreCommand;
import ast.walking.ASTNodeVisitor;

public class PreInclude extends PreCommand {

	PreIncludeFilename fileName = null;
	PreMacroIdentifier macroName = null;

	public PreMacroIdentifier getMacroName() {
		return macroName;
	}

	public void setMacroName(PreMacroIdentifier macroName) {
		this.macroName = macroName;
	}

	public void setFilename(PreIncludeFilename fileName) {
		this.fileName = fileName;
	}

	public PreIncludeFilename getFilepname() {
		return fileName;
	}

	public void accept(ASTNodeVisitor visitor) {
		visitor.visit(this);
	}

}
