grammar Preprocessor;

//Angelehnt an ISO/IEC 9899:TC3 sowie GCC Manual 2019

pre_statement: pre_blockstarter
				| pre_command;

				
//________________________PRE BLOCKSTARTER___________________________   				
pre_blockstarter: pre_if_statement 
                      | pre_elif_statement  
                      | pre_else_statement
                      | pre_endif_statement;           
														
pre_if_statement: PRE_IF pre_if_condition { preProcFindConditionEnd(); };   
                
pre_elif_statement: PRE_ELIF pre_if_condition { preProcFindConditionEnd(); };
                
pre_else_statement: PRE_ELSE;

pre_endif_statement: PRE_ENDIF;

pre_if_condition: condition
				| '(' condition ')'
				| keyword; //If a macro is redefining a keyword
                             
condition: expr
     | type_name declarator NEWLINE* '=' NEWLINE* assign_expr;
     
//_______________________PRE BLOCKSTARTER END_________________________   

//__________________________PRE COMMANDS______________________________      
pre_command: pre_define   
            | pre_undef
            | pre_diagnostic
            | pre_other
            | pre_include
            | pre_include_next
            | pre_line
            | pre_pragma
            | macroCall;

pre_define: PRE_DEFINE pre_macro_identifier pre_macro 
            | PRE_DEFINE pre_macro_identifier;     

pre_undef: PRE_UNDEF pre_macro_identifier;

pre_macro_identifier: identifier ('(' pre_macro_parameters ')')? | keyword | END_TEST | 'START_TEST' ('(' pre_macro_parameters ')')?;

//Macros can redefine keywords
keyword: 'inline' | 'explicit' | 'friend' | 'public' | 'private' | 'protected' | 'static' | 'void' | 'unsigned' | 'signed' | 'long' | 'virtual' | 'operator' | 'class';

//Maybe needs more possibilites
pre_macro_parameters: (identifier | ELLIPSIS )? (',' (identifier | ELLIPSIS))*;

pre_macro: expr 
            | { preProcFindMacroEnd(); };
                  
macroCall:  pre_macro_identifier '(' (  (',' | type_name | expr | ptr_operator | NEWLINE)* | VOID) ')'; //This is for macro calls

pre_diagnostic: PRE_DIAGNOSTIC STRING
            | PRE_DIAGNOSTIC;

pre_other: PRE_OTHER STRING? 
           |PRE_ATTRIBUTE '(' '(' attributeList? ')' ')'
           ;   

attributeList:  attribute (',' attribute)* ;

attribute: pre_macro_identifier //Identifier or keyword 
            | pre_macro_identifier '(' identifier (',' expr)* ')'
            | pre_macro_identifier '(' expr? (',' expr)* ')'
            ;        

pre_include: PRE_INCLUDE pre_include_local_file
            | PRE_INCLUDE pre_macro_identifier
            | PRE_INCLUDE;

pre_include_next: PRE_INCLUDE_NEXT pre_include_local_file
            | PRE_INCLUDE_NEXT  pre_macro_identifier
            | PRE_INCLUDE_NEXT;                   

pre_include_local_file: pre_include_filename;

pre_include_filename: STRING;

pre_line: PRE_LINE DECIMAL_LITERAL STRING
        | PRE_LINE DECIMAL_LITERAL pre_macro_identifier
        | PRE_LINE pre_macro_identifier STRING
        | PRE_LINE pre_macro_identifier
        | PRE_LINE DECIMAL_LITERAL;
        

pre_pragma: PRE_PRAGMA PRE_GCC? PRE_PRAGMA_KEYWORDS STRING { preProcFindMacroEnd(); }
            | PRE_PRAGMA PRE_GCC? PRE_PRAGMA_KEYWORDS identifier* 
            | PRE_PRAGMA { preProcFindMacroEnd(); };             
    