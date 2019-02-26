package ast.c.preprocessor.commands.macro;

public class PreDefine extends PreUndef{

	PreMacro macro = null;
	PreMacroParameters macroParameters = null;
	
	public PreMacro getMacro() {
		return macro;
	}
	public void setMacro(PreMacro macro) {
		this.macro = macro;
	}
	public PreMacroParameters getMacroParameters() {
		return macroParameters;
	}
	public void setMacroParameters(PreMacroParameters macroParameters) {
		this.macroParameters = macroParameters;
	}
	

}
