grammar Preprocessor;

import ModuleLex, Expressions, FineSimpleDecl;

pre_statement: PRE_IF pre_if_condition   #Pre_if_statement
                      | PRE_ELIF pre_if_condition  #Pre_elif_statement
                      | PRE_ELSE                    #Pre_else_statement
                      | PRE_ENDIF               #Pre_endif_statement            
;

pre_blockstarter: PRE_IF pre_if_condition
                | PRE_ELIF pre_if_condition  
                | PRE_ELSE   
                ;

pre_if_condition: condition
               | 'defined' '('? condition ')'?
;

condition: expr
     | type_name declarator '=' assign_expr;