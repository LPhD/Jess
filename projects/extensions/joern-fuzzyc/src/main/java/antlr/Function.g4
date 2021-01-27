grammar Function;
import Preprocessor, Custom, ModuleLex, Common, Expressions, SimpleDecl, FineSimpleDecl;


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
         | pre_statement
         | comment
         | newline //We need this here so we can remove newline nodes from the function parser stack
         | custom
         | water
        ;

opening_curly: OPENING_CURLY;
closing_curly: CLOSING_CURLY;
                      
                
block_starter: selection_or_iteration;

selection_or_iteration: TRY                      #Try_statement
                      | CATCH ( expression_fragment* '(' expression_fragment* (param_type | ELLIPSIS) expression_fragment* ')' )? #Catch_statement
                      | IF expression_fragment* '(' expression_fragment* condition expression_fragment* ')'     #If_statement
                      | ELSE                     #Else_statement
                      | SWITCH expression_fragment* '(' expression_fragment* condition expression_fragment* ')' #Switch_statement
                      | FOR expression_fragment* '(' expression_fragment*  (for_init_statement | ';') expression_fragment* condition? ';' expression_fragment* expr? expression_fragment* ')' ';'? #For_statement
                      | DO                          #Do_statement
                      | WHILE expression_fragment* '(' expression_fragment* condition expression_fragment* ')' ';'?  #While_statement 
//We need here something that comes after the while, otherwise it is just popped from the stack (when it's the last statement)
//Therefore the ; may not appear in the grammar rule for this. It should be a statement that triggers the exitStatements function
;


for_init_statement : simple_decl
                   | expr expression_fragment* ';'
                   ;

jump_statement: BREAK expression_fragment* ';'		#breakStatement
              | CONTINUE expression_fragment* ';' 		#continueStatement
              | GOTO identifier expression_fragment* ';'	#gotoStatement
              | RETURN expression_fragment* expr? expression_fragment* ';'	#returnStatement
              | THROW expression_fragment* expr? expression_fragment*  ';'	#throwStatement
              ;

//Allow casts in labels
label: CASE? (identifier | number | CHAR | cast_expression) expression_fragment* ':' ;

expr_statement: expr expression_fragment* ';' | null_expression;

condition: expr;
