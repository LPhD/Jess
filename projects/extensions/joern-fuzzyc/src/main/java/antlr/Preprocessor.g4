grammar Preprocessor;

import Expressions, FineSimpleDecl, ModuleLex;


pre_statement: pre_blockstarter
				| pre_command;
				
				
pre_blockstarter: pre_if_statement
                      | pre_elif_statement
                      | pre_else_statement
                      | pre_endif_statement;           
					
					
pre_command: PRE_INCLUDE;
					
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