grammar SimpleDecl;
import ModuleLex, Expressions, Preprocessor, Common;

simple_decl : var_decl;

var_decl : template_decl_start? class_def  init_declarator_list? #declByClass
         | (TYPEDEF NEWLINE?)?  template_decl_start? type_name  init_declarator_list #declByType
         | (TYPEDEF NEWLINE?)?  type_name '(' callingConvention? ptr_operator identifier ')' param_type_list NEWLINE? pre_other? ';' #FunctionPointerDeclare
         | (CV_QUALIFIER NEWLINE?)? (TYPEDEF NEWLINE?)? special_datatype init_declarator_list? ';'? #StructUnionEnum
         ;

//Can be done by a macro or directly (something like __cdecl)
callingConvention: ALPHA_NUMERIC+ ;   
         
special_datatype: SPECIAL_DATA NEWLINE? pre_other? (identifier NEWLINE?)? pre_other? OPENING_CURLY {skipToEndOfObject(); }  //Long declaration
        | SPECIAL_DATA NEWLINE?  pre_other? identifier NEWLINE? ptrs? identifier ptrs? '=' {skipToEndOfObject(); }         //Designated initializer
        | SPECIAL_DATA NEWLINE?  pre_other? identifier  //Short declaration
        ;

        
init_declarator_list: init_declarator (NEWLINE? ',' NEWLINE? init_declarator)* NEWLINE? pre_other? ';';


class_def: CLASS_KEY NEWLINE? class_name? base_classes? OPENING_CURLY {skipToEndOfObject(); } ;
class_name: identifier;
base_classes: ':' base_class (',' base_class)*;
base_class: (VIRTUAL NEWLINE?)? access_specifier? identifier;


type_name : (EXTERN NEWLINE?)?  (function_decl_specifiers | CV_QUALIFIER NEWLINE? | UNSIGNED NEWLINE?  | SIGNED NEWLINE?  | ptr_operator  | base_type)+               
            ('<' template_param_list '>' )? 
            ('::' base_type  ('<' template_param_list '>')?  )*
            (function_decl_specifiers | CV_QUALIFIER NEWLINE?  | UNSIGNED NEWLINE?  | SIGNED NEWLINE?  | ptr_operator)* 
          | macroCall
          ;


base_type: (VOID NEWLINE? | 'long' NEWLINE? | 'char' NEWLINE? | 'int' NEWLINE? | SPECIAL_DATA NEWLINE? | CLASS_KEY NEWLINE? | ALPHA_NUMERIC NEWLINE? )+;

// Parameters

param_decl_specifiers : (AUTO NEWLINE? | REGISTER NEWLINE? )? type_name;

// this is a bit misleading. We're just allowing access_specifiers
// here because C programs can use 'public', 'protected' or 'private'
// as variable names.

parameter_name: identifier NEWLINE? ;

param_type_list: '(' VOID ')'
               | '('  (param_type (',' NEWLINE? param_type)*)? ')';

param_type: param_decl_specifiers NEWLINE?  param_type_id
                | '...' ;
                
param_type_id: ptrs? ( '('  param_type_id ')' | parameter_name?) type_suffix?;

// operator-identifiers not implemented. Do not allow newlines after identifiers here, as this leads to problems with preprocessor statements
identifier : (ALPHA_NUMERIC  ('::'  ALPHA_NUMERIC  )*)  
                | NEW  
                | PRE_PRAGMA_KEYWORDS   
                | access_specifier
                ;
                
number: HEX_LITERAL 
        | DECIMAL_LITERAL 
        | OCTAL_LITERAL 
        ;

ptrs: (ptr_operator 'restrict'? )+;
func_ptrs: ptrs;
