grammar Custom;

//Define custom rules for your project

custom: (asciiTab | externC | macroFunctionPointer);

asciiTab: (pre_macro_identifier ',')+ ;        
    
externC: 'extern' '"C"' OPENING_CURLY?; //Declare something with C linkage (closing curly is missing)    

macroFunctionPointer: macroCall NEWLINE? pre_macro_identifier? NEWLINE? macroCall NEWLINE? init_declarator_list; //Complex function ptr declarations
