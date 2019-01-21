grammar Function;
import ModuleLex, Common, Expressions, FineSimpleDecl;


@header{
	package antlr;
}

statements: (statement)*;

statement: opening_curly
         | closing_curly
         | block_starter
         | PRE_ENDIF 
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
                      | PRE_IF pre_if_condition  #Pre_if_statement
                      | PRE_ELIF pre_if_condition  #Pre_elif_statement
                      | PRE_ELSE                    #Pre_else_statement
;

//Elif needs to be done!
pre_if_condition: condition
            | 'defined' '('? condition ')'?
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
