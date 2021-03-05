grammar Expressions;
import ModuleLex, Preprocessor, Common;

expr: assign_expr ( expression_fragment* ',' expression_fragment* expr)? ; 


assign_expr: conditional_expression (expression_fragment* assignment_operator expression_fragment* assign_expr)?; //something = something


conditional_expression: or_expression #normOr
		      | or_expression (expression_fragment* '?' expression_fragment* expr expression_fragment* ':' expression_fragment* conditional_expression) #cndExpr;


or_expression : and_expression (expression_fragment* '||' expression_fragment* or_expression)?;

and_expression : inclusive_or_expression (expression_fragment* '&&' expression_fragment* and_expression)?;

inclusive_or_expression: exclusive_or_expression (expression_fragment* '|' expression_fragment* inclusive_or_expression)?;

exclusive_or_expression: bit_and_expression (expression_fragment* '^' expression_fragment* exclusive_or_expression)?;

bit_and_expression: equality_expression (expression_fragment* '&' expression_fragment* bit_and_expression)?;

equality_expression: relational_expression (expression_fragment* equality_operator expression_fragment* equality_expression)?;

relational_expression: shift_expression (expression_fragment* relational_operator expression_fragment* relational_expression)?;

shift_expression: additive_expression (expression_fragment* ('<<'|'>>') expression_fragment* shift_expression)?;

additive_expression: multiplicative_expression (expression_fragment* ('+'| '-')  expression_fragment* additive_expression)?;

multiplicative_expression: function_pointer_use_expression (expression_fragment*  ('*'| '/'| '%') expression_fragment* multiplicative_expression)?;

//Technically, cast operations can contain pointers (e.g. when cast to a void pointer), but we are more interested in function pointer usages and do not analyse casts in detail
//Therefore, it is okay if we misclassify a pointer cast as a function pointer usage (as long as we get all function pointer usages)
function_pointer_use_expression: '(' ptr_operator identifier? ')' '(' argument_list? ')'
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
                | postfix_expression
                | defined_expression
                | macroCall
                | asmCall
                ;

address_of_expression: '&' identifier;

unary_op_and_cast_expr: unary_operator expression_fragment* cast_expression;

sizeof_expression: sizeof expression_fragment* '(' sizeof_operand ')'
                 | sizeof expression_fragment* sizeof_operand2;

sizeof: 'sizeof';

defined_expression: 'defined' expression_fragment* '(' expr ')'
					|  'defined' expression_fragment* expr ;

sizeof_operand: type_name (expression_fragment* ptr_operator)*;
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

postfix_expression: postfix_expression expression_fragment* '[' expr? ']' #arrayIndexing
                  | postfix_expression expression_fragment* '(' argument_list? ')' #funcCall
                  | postfix_expression '.' expression_fragment* (identifier) #memberAccess
                  | postfix_expression '->' expression_fragment* (identifier) #ptrMemberAccess
                  | postfix_expression expression_fragment* inc_dec #incDecOp
                  | type_name? initializer_expression #arrayAssign // arrayName[] = {1}
                  | primary_expression # primaryOnly
                  | ptr_operator? inc_dec expression_fragment* ptr_operator? primary_expression #incDecOp
                  ;
                  
initializer_expression:  OPENING_CURLY expression_fragment* argument_list? expression_fragment* CLOSING_CURLY;   //Can be an empty list

argument_list:  argument  (','?  argument)* ','? ; // Allows empty arguments after a comma   
                              
argument: expression_fragment*  assign_expr expression_fragment* 
        | CV_QUALIFIER? VOID ptr_operator? //Argument can be only void or void ptr
        ;

primary_expression: ('.'? identifier) | ptr_operator | constant | '(' expression_fragment* expr expression_fragment* ')';

null_expression: ';' ;  //Empty expression aka null expression


//We need this as ifdefs can be inside expressions. This is currently not further analyzed (e.g. not put on the stack, just directly added to parent compound)
preprocessor_fragment: PRE_DEFINE pre_macro_identifier ( call_in_preStatement | ~(NEWLINE) )*?  (NEWLINE | EOF) //Currently, multiline pre statements are not supported
                | PRE_IF  ( call_in_preStatement | ~(NEWLINE) )*? (NEWLINE | EOF) 
                | PRE_ELIF ( call_in_preStatement | ~(NEWLINE) )*?  (NEWLINE | EOF) 
                | PRE_ELSE
                | PRE_ENDIF; 
                        
                       
expression_fragment: (NEWLINE | MULTILINE_COMMENT | ONELINE_COMMENT | preprocessor_fragment); //Placeholder to improve readability
