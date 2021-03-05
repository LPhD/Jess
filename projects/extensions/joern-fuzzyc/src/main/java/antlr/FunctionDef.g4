grammar FunctionDef;
import ModuleLex, Preprocessor, SimpleDecl, Expressions, Common;

function_def : 
                return_type? (pre_other expression_fragment*)? function_name expression_fragment* function_param_list ctor_list? expression_fragment* compound_statement
                | return_type? macroCall_asFunctionHeader expression_fragment* compound_statement //This is for macros that replace the function header
                ; 

macroCall_asFunctionHeader: macroCall;

return_type : ((function_decl_specifiers  expression_fragment*)* type_name) (ptr_operator expression_fragment*)*
				| macroCall expression_fragment*
				;

function_param_list : '(' expression_fragment* parameter_decl_clause? expression_fragment* ')' '*'? (CV_QUALIFIER expression_fragment*)*  exception_specification?
                    | '(' expression_fragment* parameter_name (',' expression_fragment* parameter_name)* expression_fragment* ')' expression_fragment* (type_name parameter_id (',' expression_fragment* parameter_id)* ';'  expression_fragment*)+  //For the rare case where the parameters are declared outside of the parantheses
                    ;

parameter_decl_clause: ( expression_fragment* parameter_decl (expression_fragment* ',' expression_fragment* parameter_decl )* ) (expression_fragment* ',' expression_fragment* '...' )?;
                     
parameter_decl : VOID 
                | type_name parameter_id;

parameter_id: ptrs? ('(' parameter_id ')' | parameter_name) type_suffix?;

compound_statement: OPENING_CURLY { skipToEndOfObject(); };

ctor_list: ':'  ctor_initializer (',' ctor_initializer)*;

ctor_initializer:  initializer_id ctor_expr;

initializer_id : '::'? identifier;

ctor_expr:  '(' expr? ')';

function_name: identifier | '(' function_name ')';

exception_specification : THROW '(' type_id_list ')';

type_id_list: no_brackets* ('(' type_id_list ')' no_brackets*)*;
