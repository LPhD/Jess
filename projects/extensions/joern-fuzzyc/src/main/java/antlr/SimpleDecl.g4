grammar SimpleDecl;

simple_decl : var_decl;

var_decl : (TYPEDEF? template_decl_start?) class_def  NEWLINE? init_declarator_list? #declByClass
         | (TYPEDEF? template_decl_start?) STATIC? type_name  NEWLINE? init_declarator_list #declByType
         | TYPEDEF? special_datatype  NEWLINE? init_declarator_list? ';'? #StructUnionEnum
         ;
         
special_datatype:SPECIAL_DATA identifier? OPENING_CURLY {skipToEndOfObject(); }  //Long declaration
        | SPECIAL_DATA identifier  //Short declaration
        ;
        
init_declarator_list: init_declarator (','  NEWLINE? init_declarator)* ';';

initializer: assign_expr
           |'{' initializer_list '}'
           |'{' '}'
;

initializer_list: initializer (','  NEWLINE? initializer)*;


class_def: CLASS_KEY class_name? base_classes? OPENING_CURLY {skipToEndOfObject(); } ;
class_name: identifier;
base_classes: ':' base_class (',' base_class)*;
base_class: VIRTUAL? access_specifier? identifier;

type_name : (CV_QUALIFIER* (CLASS_KEY | UNSIGNED | SIGNED | SPECIAL_DATA)?
            base_type ('<' template_param_list '>')? ('::' base_type ('<' template_param_list '>')? )*) CV_QUALIFIER?
          | macroCall
          | UNSIGNED
          | SIGNED
          | SPECIAL_DATA
          ;


base_type: (ALPHA_NUMERIC | VOID | LONG )+;

// Parameters

param_decl_specifiers : (AUTO | REGISTER)? type_name;

// this is a bit misleading. We're just allowing access_specifiers
// here because C programs can use 'public', 'protected' or 'private'
// as variable names.

parameter_name: identifier;

param_type_list: '(' NEWLINE? VOID ')'
               | '(' NEWLINE? (param_type NEWLINE? (',' NEWLINE? param_type)*)? ')';

param_type: param_decl_specifiers param_type_id;
param_type_id: ptrs? ('(' NEWLINE? param_type_id NEWLINE? ')' | parameter_name?) type_suffix?;

// operator-identifiers not implemented
identifier : (ALPHA_NUMERIC ('::' ALPHA_NUMERIC)*) | access_specifier;
number: HEX_LITERAL | DECIMAL_LITERAL | OCTAL_LITERAL;

ptrs: (ptr_operator 'restrict'?)+;
func_ptrs: ptrs;
