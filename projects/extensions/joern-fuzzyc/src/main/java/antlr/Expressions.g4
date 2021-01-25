grammar Expressions;
import ModuleLex, Preprocessor, Common;

expr: assign_expr (ESCAPE NEWLINE)* ((NEWLINE | COMMENT | preprocessor_fragment)* ',' (NEWLINE | COMMENT | preprocessor_fragment)* expr)? (ESCAPE NEWLINE)*; //Escape is for multiline preprocessor statements


assign_expr: conditional_expression ((NEWLINE | COMMENT | preprocessor_fragment)* assignment_operator (NEWLINE | COMMENT | preprocessor_fragment)* assign_expr)?; //something = something


conditional_expression: or_expression #normOr
		      | or_expression ((NEWLINE | COMMENT | preprocessor_fragment)* '?' (NEWLINE | COMMENT | preprocessor_fragment)* expr (NEWLINE | COMMENT | preprocessor_fragment)* ':' (NEWLINE | COMMENT | preprocessor_fragment)* conditional_expression) #cndExpr;


or_expression : and_expression ((NEWLINE | COMMENT | preprocessor_fragment)* '||' (NEWLINE | COMMENT | preprocessor_fragment)* or_expression)?;

and_expression : inclusive_or_expression ((NEWLINE | COMMENT | preprocessor_fragment)* '&&' (NEWLINE | COMMENT | preprocessor_fragment)* and_expression)?;

inclusive_or_expression: exclusive_or_expression ((NEWLINE | COMMENT | preprocessor_fragment)* '|' (NEWLINE | COMMENT | preprocessor_fragment)* inclusive_or_expression)?;

exclusive_or_expression: bit_and_expression ((NEWLINE | COMMENT | preprocessor_fragment)* '^' (NEWLINE | COMMENT | preprocessor_fragment)* exclusive_or_expression)?;

bit_and_expression: equality_expression ((NEWLINE | COMMENT | preprocessor_fragment)* '&' (NEWLINE | COMMENT | preprocessor_fragment)* bit_and_expression)?;

equality_expression: relational_expression ((NEWLINE | COMMENT | preprocessor_fragment)* equality_operator (NEWLINE | COMMENT | preprocessor_fragment)* equality_expression)?;

relational_expression: shift_expression ((NEWLINE | COMMENT | preprocessor_fragment)* relational_operator (NEWLINE | COMMENT | preprocessor_fragment)* relational_expression)?;

shift_expression: additive_expression ((NEWLINE | COMMENT | preprocessor_fragment)* ('<<'|'>>') (NEWLINE | COMMENT | preprocessor_fragment)* shift_expression)?;

additive_expression: multiplicative_expression ((NEWLINE | COMMENT | preprocessor_fragment)* ('+'| '-')  (NEWLINE | COMMENT | preprocessor_fragment)* additive_expression)?;

multiplicative_expression: function_pointer_use_expression ((NEWLINE | COMMENT | preprocessor_fragment)*  ('*'| '/'| '%') (NEWLINE | COMMENT | preprocessor_fragment)* multiplicative_expression)?;

//Technically, cast operations can contain pointers (e.g. when cast to a void pointer), but we are more interested in function pointer usages and do not analyse casts in detail
//Therefore, it is okay if we misclassify a pointer cast as a function pointer usage (as long as we get all function pointer usages)
function_pointer_use_expression: '(' ptr_operator identifier? ')' '(' argument_list ')'
               | cast_expression
                ;
                

//No newline as this yields to problems with #if (variable) \n int something; -> (variable) \n int
cast_expression: ('(' cast_target ')' cast_expression)
               | unary_expression
                ;

cast_target: type_name
            | type_name function_pointer_use_expression //This is for casts to function pointers
            ;



// currently does not implement delete

unary_expression: address_of_expression
                | unary_op_and_cast_expr
                | sizeof_expression 
                | new_expression
                | postfix_expression
                | defined_expression
                | macroCall
                | asmCall
                ;

address_of_expression: '&' identifier;
 
new_expression: '::'? NEW (NEWLINE | COMMENT | preprocessor_fragment)* type_name (NEWLINE | COMMENT | preprocessor_fragment)* '[' conditional_expression? ']' 
              | '::'? NEW (NEWLINE | COMMENT | preprocessor_fragment)* type_name (NEWLINE | COMMENT | preprocessor_fragment)* '(' expr? ')'
              ;

unary_op_and_cast_expr: unary_operator (NEWLINE | COMMENT | preprocessor_fragment)* cast_expression;

sizeof_expression: sizeof (NEWLINE | COMMENT | preprocessor_fragment)* '(' sizeof_operand ')'
                 | sizeof (NEWLINE | COMMENT | preprocessor_fragment)* sizeof_operand2;

sizeof: 'sizeof';

defined_expression: 'defined' (NEWLINE | COMMENT | preprocessor_fragment)* '(' expr ')'
					|  'defined' (NEWLINE | COMMENT | preprocessor_fragment)* expr ;

sizeof_operand: type_name ((NEWLINE | COMMENT | preprocessor_fragment)* ptr_operator)*;
sizeof_operand2: unary_expression;

inc_dec: ('--' | '++');

asmCall: ASM (CV_QUALIFIER | GOTO)* NEWLINE? '(' NEWLINE? (STRING NEWLINE?)+ 
            ( (':' | '::' | ':::')          //Does not work otherwise if there are no spaces between the dots
                ( 
                    (STRING NEWLINE?) 
                    ( '(' identifier (',' identifier)* ')' )?
                )?
            )* 
            ')' ;

// this is a bit misleading. We're just allowing access_specifiers
// here because C programs can use 'public', 'protected' or 'private'
// as variable names.

postfix_expression: postfix_expression (NEWLINE | COMMENT | preprocessor_fragment)* '[' expr? ']' #arrayIndexing
                  | postfix_expression (NEWLINE | COMMENT | preprocessor_fragment)* '(' argument_list ')' #funcCall
                  | postfix_expression '.' (NEWLINE | COMMENT | preprocessor_fragment)* TEMPLATE? (identifier) #memberAccess
                  | postfix_expression '->' (NEWLINE | COMMENT | preprocessor_fragment)* TEMPLATE? (identifier) #ptrMemberAccess
                  | postfix_expression (NEWLINE | COMMENT | preprocessor_fragment)* inc_dec #incDecOp
                  | type_name? initializer_expression #arrayAssign // arrayName[] = {1}
                  | primary_expression # primaryOnly
                  | ptr_operator? inc_dec (NEWLINE | COMMENT | preprocessor_fragment)* ptr_operator? primary_expression #incDecOp
                  ;
                  
initializer_expression:  OPENING_CURLY (NEWLINE | COMMENT | preprocessor_fragment)* argument_list? (NEWLINE | COMMENT | preprocessor_fragment)* CLOSING_CURLY;   //Can be an empty list

argument_list:  argument?  (','?  argument)* ','?  // Allows empty arguments after a comma   
                | VOID ptr_operator? //Argument can be only void or void ptr
                ;              

argument: (NEWLINE | COMMENT | preprocessor_fragment)*  assign_expr (NEWLINE | COMMENT | preprocessor_fragment)* ;

primary_expression: ('.'? identifier) | ptr_operator | constant | '(' expr ')';

null_expression: ';' ;  //Empty expression aka null expression


//We need this as ifdefs can be inside expressions
preprocessor_fragment: pre_if_statement 
                        | pre_elif_statement
                        | pre_else_statement
                        | pre_endif_statement
                        ;


