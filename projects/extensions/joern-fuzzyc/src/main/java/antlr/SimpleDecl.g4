grammar SimpleDecl;
import ModuleLex, Expressions, Preprocessor, Common;

simple_decl : var_decl;

var_decl : template_decl_start? class_def expression_fragment* init_declarator_list? (pre_other | macroCall)? #declByClass
         | (TYPEDEF expression_fragment*)?  (template_decl_start expression_fragment*)? type_name expression_fragment* init_declarator_list  #declByType
         | (TYPEDEF expression_fragment*)?  type_name expression_fragment* '('? expression_fragment* callingConvention? expression_fragment* ptr_operator '('? expression_fragment* identifier? ')' expression_fragment* param_type_list expression_fragment* (pre_other | macroCall)? ('=' expression_fragment* argument)? ';' #FunctionPointerDeclare
         | ((CV_QUALIFIER | function_decl_specifiers | TYPEDEF)+ expression_fragment*)?  special_datatype expression_fragment* init_declarator_list? ';'? #StructUnionEnum
         ;

//Can be done by a macro or directly (something like __cdecl)
callingConvention: ALPHA_NUMERIC+ ;   
         
special_datatype: SPECIAL_DATA expression_fragment* pre_other? (identifier expression_fragment*)? pre_other? OPENING_CURLY {skipToEndOfObject(); }  //Long declaration
        | SPECIAL_DATA expression_fragment* pre_other? identifier expression_fragment* ptrs? identifier ptrs? '=' {skipToEndOfObject(); }         //Designated initializer
        | SPECIAL_DATA expression_fragment* pre_other? identifier  //Short declaration
        ;

        
init_declarator_list: init_declarator (expression_fragment* ',' expression_fragment* init_declarator)* expression_fragment* (pre_other | macroCall)? ';';


class_def: CLASS_KEY expression_fragment* class_name? base_classes? OPENING_CURLY {skipToEndOfObject(); } ;
class_name: identifier;
base_classes: ':' base_class (',' base_class)*;
base_class: (VIRTUAL expression_fragment*)? access_specifier? identifier;


type_name: (
          EXTERN expression_fragment*
          | function_decl_specifiers 
          | CV_QUALIFIER expression_fragment*
          | UNSIGNED expression_fragment*
          | SIGNED expression_fragment*
          | AUTO expression_fragment*
          | REGISTER expression_fragment*
          | ptr_operator expression_fragment*
          | base_type 
          | ( ('<' template_param_list '>' ) ('::' base_type  ('<' template_param_list '>')?  )* ) 
          | macroCall         
            )+ ;

base_type: (VOID expression_fragment* | 'long' expression_fragment* | 'char' expression_fragment* | 'int' expression_fragment* | SPECIAL_DATA expression_fragment* | CLASS_KEY expression_fragment* | ALPHA_NUMERIC expression_fragment* )+;

// Parameters

// this is a bit misleading. We're just allowing access_specifiers
// here because C programs can use 'public', 'protected' or 'private'
// as variable names.

parameter_name: identifier NEWLINE? ;

param_type_list: '(' expression_fragment* VOID expression_fragment* ')'
               | '(' expression_fragment*  (param_type (expression_fragment* ',' expression_fragment* param_type)*)? expression_fragment* ')';

param_type: type_name expression_fragment* param_type_id
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
        | HEX_FLOAT
        ;

ptrs: (ptr_operator 'restrict'? )+;
func_ptrs: ptrs;
