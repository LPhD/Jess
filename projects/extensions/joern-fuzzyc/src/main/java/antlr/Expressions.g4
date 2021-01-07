grammar Expressions;
import ModuleLex, Preprocessor, Common;

expr: assign_expr (ESCAPE NEWLINE)* (NEWLINE? COMMENT? NEWLINE? ',' NEWLINE? COMMENT? NEWLINE? expr)? (ESCAPE NEWLINE)*; //Escape is for multiline preprocessor statements


assign_expr: conditional_expression (NEWLINE? COMMENT? NEWLINE? assignment_operator NEWLINE? COMMENT? NEWLINE? assign_expr)?; //something = something


conditional_expression: or_expression #normOr
		      | or_expression (NEWLINE? COMMENT? NEWLINE? '?' NEWLINE? COMMENT? NEWLINE? expr NEWLINE? COMMENT? NEWLINE? ':' NEWLINE? COMMENT? NEWLINE? conditional_expression) #cndExpr;


or_expression : and_expression (NEWLINE? COMMENT? NEWLINE? '||' NEWLINE? COMMENT? NEWLINE? or_expression)?;

and_expression : inclusive_or_expression (NEWLINE? COMMENT? NEWLINE? '&&' NEWLINE? COMMENT? NEWLINE? and_expression)?;

inclusive_or_expression: exclusive_or_expression (NEWLINE? COMMENT? NEWLINE? '|' NEWLINE? COMMENT? NEWLINE? inclusive_or_expression)?;

exclusive_or_expression: bit_and_expression (NEWLINE? COMMENT? NEWLINE? '^' NEWLINE? COMMENT? NEWLINE? exclusive_or_expression)?;

bit_and_expression: equality_expression (NEWLINE? COMMENT? NEWLINE? '&' NEWLINE? COMMENT? NEWLINE? bit_and_expression)?;

equality_expression: relational_expression (NEWLINE? COMMENT? NEWLINE? equality_operator NEWLINE? COMMENT? NEWLINE? equality_expression)?;

relational_expression: shift_expression (NEWLINE? COMMENT? NEWLINE? relational_operator NEWLINE? COMMENT? NEWLINE? relational_expression)?;

shift_expression: additive_expression (NEWLINE? COMMENT? NEWLINE? ('<<'|'>>') NEWLINE? COMMENT? NEWLINE? shift_expression)?;

additive_expression: multiplicative_expression (NEWLINE? COMMENT? NEWLINE? ('+'| '-') NEWLINE? COMMENT? NEWLINE? additive_expression)?;

multiplicative_expression: function_pointer_use_expression (NEWLINE? COMMENT? NEWLINE?  ('*'| '/'| '%') NEWLINE? COMMENT? NEWLINE? multiplicative_expression)?;

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
                ;

address_of_expression: '&' identifier;
 
new_expression: '::'? NEW NEWLINE? COMMENT? NEWLINE? type_name NEWLINE? COMMENT? NEWLINE? '[' conditional_expression? ']' 
              | '::'? NEW NEWLINE? COMMENT? NEWLINE? type_name NEWLINE? COMMENT? NEWLINE? '(' expr? ')'
              ;

unary_op_and_cast_expr: unary_operator NEWLINE? COMMENT? NEWLINE? cast_expression;

sizeof_expression: sizeof NEWLINE? COMMENT? NEWLINE? '(' sizeof_operand ')'
                 | sizeof NEWLINE? COMMENT? NEWLINE? sizeof_operand2;

sizeof: 'sizeof';

defined_expression: 'defined' NEWLINE? COMMENT? NEWLINE? '(' expr ')'
					|  'defined' NEWLINE? COMMENT? NEWLINE? expr ;

sizeof_operand: type_name (NEWLINE? COMMENT? NEWLINE? ptr_operator)*;
sizeof_operand2: unary_expression;

inc_dec: ('--' | '++');

// this is a bit misleading. We're just allowing access_specifiers
// here because C programs can use 'public', 'protected' or 'private'
// as variable names.

postfix_expression: postfix_expression NEWLINE? COMMENT? NEWLINE? '[' expr? ']' #arrayIndexing
                  | postfix_expression NEWLINE? COMMENT? NEWLINE? '(' argument_list ')' #funcCall
                  | postfix_expression '.' NEWLINE? COMMENT? NEWLINE? TEMPLATE? (identifier) #memberAccess
                  | postfix_expression '->' NEWLINE? COMMENT? NEWLINE? TEMPLATE? (identifier) #ptrMemberAccess
                  | postfix_expression NEWLINE? COMMENT? NEWLINE? inc_dec #incDecOp
                  | type_name? initializer_expression #arrayAssign // arrayName[] = {1}
                  | primary_expression # primaryOnly
                  | ptr_operator? inc_dec NEWLINE? COMMENT? NEWLINE? ptr_operator? primary_expression #incDecOp
                  ;
                  
initializer_expression:  OPENING_CURLY NEWLINE? (COMMENT NEWLINE?)* argument_list? NEWLINE? (COMMENT NEWLINE?)* CLOSING_CURLY;   //Can be an empty list

argument_list: (NEWLINE? COMMENT? NEWLINE? argument)? NEWLINE? COMMENT? NEWLINE? (','?  NEWLINE? (COMMENT NEWLINE?)* argument)* ','?  // Allows empty arguments after a comma   
                | VOID ptr_operator? //Argument can be only void or void ptr
                ;              

argument: assign_expr;

primary_expression: ('.'? identifier) | constant | '(' expr ')';

null_expression: ';' ;  //Empty expression aka null expression

