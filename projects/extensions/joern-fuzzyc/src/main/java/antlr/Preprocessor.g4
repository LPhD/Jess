grammar Preprocessor;
import ModuleLex, Common;

//Angelehnt an ISO/IEC 9899:TC3 sowie GCC Manual 2019

pre_statement: pre_blockstarter
				| pre_command;

				
//________________________PRE BLOCKSTARTER___________________________   				
pre_blockstarter: pre_if_statement 
                      | pre_elif_statement  
                      | pre_else_statement
                      | pre_endif_statement;           
														
pre_if_statement: PRE_IF pre_if_condition (NEWLINE | EOF | ONELINE_COMMENT);   //Statement ends with a newline (or end of file or oneline comment) without a previous backslash 
                
pre_elif_statement: PRE_ELIF pre_if_condition (NEWLINE | EOF | ONELINE_COMMENT);
                
pre_else_statement: PRE_ELSE;

pre_endif_statement: PRE_ENDIF;

pre_if_condition:  ( call_in_preStatement | ~(NEWLINE | EOF | ONELINE_COMMENT) )*? ;  //No comments, as this would cause problems. Greedy, because it should terminate at first matching newline
 
//Currently, this rule has no visitors and therefore no own java object / db node. But this is okay, as we are only interested in the identifiers anyway 
call_in_preStatement: identifier '(' ( call_in_preStatement | ~(NEWLINE) )*? ')';   //We are only interested in calls to other macros or functions. Currently, no further analysis of functionPointerUses

    
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
            | macroCall;    //This is a little problematic, as macroCalls can be (part of) Expressions as well as pre_commands when on module level

pre_define: PRE_DEFINE pre_macro_identifier (NEWLINE | EOF | ONELINE_COMMENT) //PreDefines end always with a newline (without a backslash beforhead) or the end of file
            | PRE_DEFINE pre_macro_identifier pre_macro (NEWLINE | EOF | ONELINE_COMMENT) ;     

pre_undef: PRE_UNDEF pre_macro_identifier;

pre_macro_identifier: identifier ('(' pre_macro_parameters ')')? | keyword | END_TEST | 'START_TEST' ('(' pre_macro_parameters ')')? | PRE_ATTRIBUTE;

//Macros can redefine keywords
keyword: 'inline' | 'explicit' | 'friend' | 'public' | 'private' | 'protected' | 'static' | 'unsigned' | 'signed' | 'long' | 'virtual' | 'operator' | 'class' | TRY | CATCH;

//Maybe needs more possibilites
pre_macro_parameters: (identifier | ELLIPSIS )? (',' (identifier | ELLIPSIS))*;

pre_macro: ( call_in_preStatement | ~(NEWLINE | EOF | ONELINE_COMMENT) )*?;   //Same rule as pre_if_condition
            
 
 
              
macroCall: pre_macro_identifier? pre_macro_identifier '(' 
        (  ( (expr | type_name | relational_operator | equality_operator)?  NEWLINE?) (','  NEWLINE? (expr | type_name | relational_operator | equality_operator))* ','?
            | VOID
        ) ')'; //This is for macro calls


pre_diagnostic: PRE_DIAGNOSTIC STRING
            | PRE_DIAGNOSTIC;

pre_other: PRE_OTHER STRING? 
           |PRE_ATTRIBUTE '(' '(' attributeList? ')' ')'
           | PRE_ATTRIBUTE '(' attributeList? ')'
           | PRE_ATTRIBUTE
           ;   

attributeList:  attribute (',' attribute)* ;

attribute: pre_macro_identifier //Identifier or keyword 
            | pre_macro_identifier '(' identifier (',' expr)* ')'
            | pre_macro_identifier '(' expr? (',' expr)* ')'
            | constant
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
        

pre_pragma: PRE_PRAGMA PRE_GCC? PRE_PRAGMA_KEYWORDS STRING ( call_in_preStatement | ~(NEWLINE) )*? (NEWLINE | EOF | ONELINE_COMMENT) 
            | PRE_PRAGMA PRE_GCC? PRE_PRAGMA_KEYWORDS identifier* 
            | PRE_PRAGMA ( call_in_preStatement | ~(NEWLINE) )*? (NEWLINE | EOF | ONELINE_COMMENT) 
            ;            
    