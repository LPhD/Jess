// Encompasses declarations in the function scope, e.g. local variable declarations

grammar FineSimpleDecl;
import SimpleDecl, ModuleLex;

init_declarator: declarator expression_fragment* '(' expression_fragment* expr? expression_fragment* ')' #initDeclWithCall
               | declarator expression_fragment* '=' expression_fragment* argument #initDeclWithAssign
               | declarator #initDeclSimple
               ;

declarator: ptrs? identifier type_suffix?;

type_suffix : ('[' expression_fragment* conditional_expression? expression_fragment* ']') | param_type_list;

