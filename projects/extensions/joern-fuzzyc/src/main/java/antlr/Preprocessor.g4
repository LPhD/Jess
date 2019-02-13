grammar Preprocessor;


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

pre_if_condition: condition
               | 'defined' condition
               | 'defined' '(' condition ')';
               
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

pre_define: PRE_DEFINE;     
pre_undef: PRE_UNDEF;
pre_diagnostic: PRE_DIAGNOSTIC;
pre_other: PRE_OTHER;
pre_include: PRE_INCLUDE;
pre_include_next: PRE_INCLUDE_NEXT;
pre_line: PRE_LINE;
pre_pragma: PRE_PRAGMA;