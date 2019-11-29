grammar Custom;

//Define custom rules for your project

custom: (asciiTab | externC);

asciiTab: (pre_macro_identifier ',')+ ;        
    
externC: 'extern' '"C"' OPENING_CURLY?; //Declare something with C linkage (closing curly is missing)    
