package ast.c.preprocessor.commands.macro;

import ast.preprocessor.PreCommand;

public class PreUndef extends PreCommand{
	
	PreMacroIdentifier macroID = null;

	public PreMacroIdentifier getMacroID() {
		return macroID;
	}

	public void setMacroID(PreMacroIdentifier macroID) {
		this.macroID = macroID;
	}



}
