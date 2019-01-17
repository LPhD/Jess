grammar Function;
import ModuleLex, Common, Expressions, FineSimpleDecl;


@header{
	package antlr;
}

statements: (pre_closer          
            | pre_proc
            | statement)*;

statement: opening_curly
         | closing_curly
         | block_starter
         | jump_statement
         | label 
         | simple_decl
         | expr_statement
         | water
        ;



pre_closer: PRE_ENDIF;
pre_include: PRE_INCLUDE;
pre_proc: PRE_PROC;
opening_curly: '{';
closing_curly: '}';
                
block_starter: selection_or_iteration;

selection_or_iteration: TRY                      #Try_statement
                      | CATCH '(' (param_type | ELLIPSIS) ')' #Catch_statement
                      | IF '(' condition ')'     #If_statement
                      | ELSE                     #Else_statement
                      | SWITCH '(' condition ')' #Switch_statement
                      | FOR '(' (for_init_statement | ';') condition? ';'  expr? ')' #For_statement
                      | DO                          #Do_statement
                      | WHILE '(' condition ')'     #While_statement
                      | PRE_IF '('? condition ')'? #Pre_if_statement
                      | PRE_ELSE                    #Pre_else_statement
;

// Don't know why, but: introducing this unused rule results
// in a performance boost.

do_statement1: DO statement WHILE '(' expr ')';

for_init_statement : simple_decl
                   | expr ';'
                   ;

jump_statement: BREAK ';'		#breakStatement
              | CONTINUE ';' 		#continueStatement
              | GOTO identifier ';'	#gotoStatement
              | RETURN expr? ';'	#returnStatement
              | THROW expr?  ';'	#throwStatement
              ;

label: CASE? (identifier | number | CHAR ) ':' ;

expr_statement: expr? ';';

condition: expr
	 | type_name declarator '=' assign_expr;
