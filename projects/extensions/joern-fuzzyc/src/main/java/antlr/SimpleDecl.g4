grammar SimpleDecl;
import ModuleLex, Expressions;

simple_decl : var_decl;

var_decl : (TYPEDEF? template_decl_start?) class_def  NEWLINE? init_declarator_list? #declByClass
         | (TYPEDEF? template_decl_start?) type_name  NEWLINE? init_declarator_list #declByType
         | TYPEDEF? special_datatype  NEWLINE? init_declarator_list? ';'? #StructUnionEnum
         ;
         
special_datatype:SPECIAL_DATA identifier? OPENING_CURLY {skipToEndOfObject(); }  //Long declaration
        | SPECIAL_DATA identifier ptrs? identifier ptrs? '=' {skipToEndOfObject(); }         //Designated initializer
        | SPECIAL_DATA identifier  //Short declaration
        ;

        
init_declarator_list: init_declarator (','  NEWLINE* init_declarator)* ';';




class_def: CLASS_KEY class_name? base_classes? OPENING_CURLY {skipToEndOfObject(); } ;
class_name: identifier;
base_classes: ':' base_class (',' base_class)*;
base_class: VIRTUAL? access_specifier? identifier;

type_name : EXTERN? (function_decl_specifiers | CV_QUALIFIER | UNSIGNED | SIGNED | ptr_operator | base_type)+               
            ('<' template_param_list '>')? 
            ('::' base_type  ('<' template_param_list '>')?  )*
            (function_decl_specifiers | CV_QUALIFIER | UNSIGNED | SIGNED | ptr_operator)* 
          | macroCall
          ;


base_type: (VOID | 'long' | 'char' | 'int' | SPECIAL_DATA | CLASS_KEY | ALPHA_NUMERIC)+;

// Parameters

param_decl_specifiers : (AUTO | REGISTER)? type_name;

// this is a bit misleading. We're just allowing access_specifiers
// here because C programs can use 'public', 'protected' or 'private'
// as variable names.

parameter_name: identifier;

param_type_list: '(' VOID ')'
               | '(' NEWLINE? (param_type NEWLINE? (',' NEWLINE? param_type)*)? ')';

param_type: param_decl_specifiers param_type_id
                | '...' ;
                
param_type_id: ptrs? ('(' NEWLINE? param_type_id NEWLINE? ')' | parameter_name?) type_suffix?;

// operator-identifiers not implemented
identifier : (ALPHA_NUMERIC ('::' ALPHA_NUMERIC)*) 
                | NEW
                | PRE_PRAGMA_KEYWORDS 
                | access_specifier
                ;
                
number: HEX_LITERAL 
        | DECIMAL_LITERAL 
        | OCTAL_LITERAL
        ;

ptrs: (ptr_operator 'restrict'?)+;
func_ptrs: ptrs;
