grammar Preprocessor;

//Angelehnt an ISO/IEC 9899:TC3 sowie GCC Manual 2019

pre_statement: pre_blockstarter
				| pre_command;

				
//________________________PRE BLOCKSTARTER___________________________   				
pre_blockstarter: pre_if_statement
                      | pre_elif_statement
                      | pre_else_statement
                      | pre_endif_statement;           
														
pre_if_statement: PRE_IF pre_if_condition 
                | PRE_IF '(' pre_if_condition ')';   
                
pre_elif_statement: PRE_ELIF pre_if_condition
                | PRE_ELIF '(' pre_if_condition')';
                
pre_else_statement: PRE_ELSE;

pre_endif_statement: PRE_ENDIF;

pre_if_condition: 'defined' '(' condition ')'
               | 'defined' condition
               | condition;
               
               
condition: expr
     | type_name declarator '=' assign_expr;
     
//_______________________PRE BLOCKSTARTER END_________________________   

//__________________________PRE COMMANDS______________________________      
pre_command: pre_define   
            | pre_undef
            | pre_diagnostic
            | pre_other
            | pre_include
            | pre_include_next
            | pre_line
            | pre_pragma;

pre_define: PRE_DEFINE pre_macro_identifier '(' pre_macro_parameters ')' pre_macro 
 			| PRE_DEFINE pre_macro_identifier pre_macro
            | PRE_DEFINE pre_macro_identifier;     

pre_undef: PRE_UNDEF pre_macro_identifier;

pre_macro_identifier: identifier;

//Maybe needs more possibilites
pre_macro_parameters: (identifier | ELLIPSIS )? (',' (identifier | ELLIPSIS))*;

pre_macro: { preProcFindMacroEnd(); };

pre_diagnostic: PRE_DIAGNOSTIC STRING
            | PRE_DIAGNOSTIC;

pre_other: PRE_OTHER STRING;

pre_include: PRE_INCLUDE pre_include_system_header
            | PRE_INCLUDE pre_macro_identifier
            | PRE_INCLUDE pre_include_filename;

pre_include_next: PRE_INCLUDE_NEXT pre_include_system_header
            | PRE_INCLUDE_NEXT  pre_macro_identifier
            | PRE_INCLUDE_NEXT pre_include_filename;
            
pre_include_system_header: '<' pre_include_filename '>';            

pre_include_filename: (STRING | ('.' | '-' | '/' | ALPHA_NUMERIC)+);

pre_line: PRE_LINE DECIMAL_LITERAL STRING
        | PRE_LINE DECIMAL_LITERAL pre_macro_identifier
        | PRE_LINE pre_macro_identifier STRING
        | PRE_LINE pre_macro_identifier
        | PRE_LINE DECIMAL_LITERAL;
        

pre_pragma: PRE_PRAGMA PRE_GCC? PRE_PRAGMA_KEYWORDS STRING { preProcFindMacroEnd(); }
            | PRE_PRAGMA PRE_GCC? PRE_PRAGMA_KEYWORDS identifier+ 
            | PRE_PRAGMA PRE_GCC? PRE_PRAGMA_KEYWORDS
            | PRE_PRAGMA { preProcFindMacroEnd(); };             
    