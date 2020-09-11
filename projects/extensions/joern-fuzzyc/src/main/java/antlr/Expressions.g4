grammar Expressions;
import ModuleLex, Preprocessor;

expr: assign_expr (ESCAPE NEWLINE)* (NEWLINE* ',' NEWLINE* expr)? (ESCAPE NEWLINE)*;


assign_expr: conditional_expression (NEWLINE* assignment_operator NEWLINE* assign_expr)?; //something = something



conditional_expression: or_expression #normOr
		      | or_expression (NEWLINE* '?' NEWLINE* expr NEWLINE* ':' NEWLINE* conditional_expression) #cndExpr;


or_expression : and_expression (NEWLINE* '||' NEWLINE* or_expression)?;

and_expression : inclusive_or_expression (NEWLINE* '&&' NEWLINE* and_expression)?;

inclusive_or_expression: exclusive_or_expression (NEWLINE* '|' NEWLINE* inclusive_or_expression)?;

exclusive_or_expression: bit_and_expression (NEWLINE* '^' NEWLINE* exclusive_or_expression)?;

bit_and_expression: equality_expression (NEWLINE* '&' NEWLINE* bit_and_expression)?;

equality_expression: relational_expression (NEWLINE* equality_operator NEWLINE* equality_expression)?;

relational_expression: shift_expression (NEWLINE* relational_operator NEWLINE* relational_expression)?;

shift_expression: additive_expression (NEWLINE* ('<<'|'>>') NEWLINE* shift_expression)?;

additive_expression: multiplicative_expression (NEWLINE* ('+'| '-') NEWLINE* additive_expression)?;

multiplicative_expression: function_pointer_use_expression (NEWLINE*  ('*'| '/'| '%') NEWLINE* multiplicative_expression)?;

//Technically, cast operations can contain pointers (e.g. when cast to a void pointer), but we are more interested in function pointer usages and do not analyse casts in detail
//Therefore, it is okay if we misclassify a pointer cast as a function pointer usage (as long as we get all function pointer usages)
function_pointer_use_expression: '(' ptr_operator identifier ')' '(' argument_list ')'
               | cast_expression
                ;
                

//No newline as this yields to problems with #if (variable) \n int something; -> (variable) \n int
cast_expression: ('(' cast_target ')' cast_expression)
               | unary_expression
                ;

cast_target: type_name;



// currently does not implement delete

unary_expression: address_of_expression
                | unary_op_and_cast_expr
                | sizeof_expression 
                | new_expression
                | postfix_expression
                | defined_expression
                ;

address_of_expression: '&' identifier;
 
new_expression: '::'? NEW NEWLINE* type_name NEWLINE* '[' conditional_expression? ']' 
              | '::'? NEW NEWLINE* type_name NEWLINE* '(' expr? ')'
              ;

unary_op_and_cast_expr: unary_operator NEWLINE* cast_expression;

sizeof_expression: sizeof NEWLINE* '(' sizeof_operand ')'
                 | sizeof NEWLINE* sizeof_operand2;

sizeof: 'sizeof';

defined_expression: 'defined' NEWLINE* '(' expr ')'
					|  'defined' NEWLINE* expr ;

sizeof_operand: type_name (NEWLINE* ptr_operator)*;
sizeof_operand2: unary_expression;

inc_dec: ('--' | '++');

// this is a bit misleading. We're just allowing access_specifiers
// here because C programs can use 'public', 'protected' or 'private'
// as variable names.

postfix_expression: postfix_expression NEWLINE* '[' expr? ']' #arrayIndexing
                  | postfix_expression NEWLINE* '(' argument_list ')' #funcCall
                  | postfix_expression '.' NEWLINE* TEMPLATE? (identifier) #memberAccess
                  | postfix_expression '->' NEWLINE* TEMPLATE? (identifier) #ptrMemberAccess
                  | postfix_expression NEWLINE* inc_dec #incDecOp
                  | type_name? initializer_expression #arrayAssign // arrayName[] = {1}
                  | primary_expression # primaryOnly
                  | ptr_operator? inc_dec NEWLINE* ptr_operator? primary_expression #incDecOp
                  ;
                  
initializer_expression:  OPENING_CURLY NEWLINE* (COMMENT NEWLINE*)* argument_list? NEWLINE* (COMMENT NEWLINE*)* CLOSING_CURLY;   //Can be an empty list

argument_list: argument? NEWLINE* (','?  NEWLINE* (COMMENT NEWLINE*)* argument)* ','?;       // Allows empty arguments after a comma           

argument: assign_expr
           | ( (COMMENT NEWLINE*)* pre_macro_identifier NEWLINE*)+
           | ( (COMMENT NEWLINE*)* macroCall NEWLINE*)+
        ;

primary_expression: identifier | constant | '(' expr ')';

null_expression: ';' ;  //Empty expression aka null expression

