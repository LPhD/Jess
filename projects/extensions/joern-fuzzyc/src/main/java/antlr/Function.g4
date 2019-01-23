grammar Function;
import ModuleLex, Preprocessor, Common, Expressions, FineSimpleDecl;


@header{
	package antlr;
}

statements: (statement)*;

statement: opening_curly
         | closing_curly
         | block_starter
         | jump_statement
         | label 
         | simple_decl
         | expr_statement
         | water
        ;

opening_curly: OPENING_CURLY;
closing_curly: CLOSING_CURLY;
                      
                
block_starter: selection_or_iteration;

selection_or_iteration: TRY                      #Try_statement
                      | CATCH '(' (param_type | ELLIPSIS) ')' #Catch_statement
                      | IF '(' condition ')'     #If_statement
                      | ELSE                     #Else_statement
                      | SWITCH '(' condition ')' #Switch_statement
                      | FOR '(' (for_init_statement | ';') condition? ';'  expr? ')' #For_statement
                      | DO                          #Do_statement
                      | WHILE '(' condition ')'     #While_statement
                      | pre_statement           #Preprocessor_statements
;


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
