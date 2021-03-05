grammar Custom;
import FunctionDef, Preprocessor, SimpleDecl, ModuleLex;

//Define custom rules for your project

custom: (asciiTab | externC | macroFunctionPointer | testEnd | phpErrorMessage);

asciiTab: (pre_macro_identifier ',')+ ;        
    
externC: 'extern' STRING OPENING_CURLY?; //Declare something with C linkage (closing curly is missing)    

macroFunctionPointer: macroCall NEWLINE? pre_macro_identifier? NEWLINE? macroCall NEWLINE? init_declarator_list; //Complex function ptr declarations

testStart: 'START_TEST' '(' function_name ')'; //We need the connection to the define macro

testEnd: END_TEST; //We need the connection to the define macro

phpErrorMessage: 'you' NEWLINE 'lose' NEWLINE '-- must know STACK_DIRECTION at compile-time'; //Custom error message that would otherwise be water, as this causes a compiler error
