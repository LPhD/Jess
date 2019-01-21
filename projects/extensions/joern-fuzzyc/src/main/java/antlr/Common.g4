grammar Common;

@header{
  import java.util.Stack;
}


@parser::members
{
    //Find the closing bracket to the opening bracket (and then return true), skip everything that is in between
    public boolean skipToEndOfObject(){
        //Stack of curly brackets
        Stack<Object> CurlyStack = new Stack<Object>();
        //Stack for collecting #ifs
        Stack<Object> ifdefStack = new Stack<Object>();
        //Object for the brackets and #ifs
        Object o = new Object();
        //Check weather current object is inside an outermoste preprocessor else statement
        Boolean insideOutermostPreElseStatement = false;
        //returns the value of the current symbol in the stream (which is the next symbol to be consumed)
        int t = _input.LA(1);

        //Find the closing bracket to the opening bracket, skip everything that is in between.
        //Finish only if every opening bracket has a closing bracket and every #if has a closing #endif or the last #endif comes after the method end
        while(t != EOF && !(CurlyStack.empty() && (ifdefStack.empty() || insideOutermostPreElseStatement)  && (t == CLOSING_CURLY)){
            
            try {
                //Collect all found opening #ifs. If a #endif is found, remove one #if from stack
                if(t == PRE_IF) 
                    ifdefStack.push(o);         
                else if(t == PRE_ENDIF) 
                    ifdefStack.pop();
                //Collect all found opening brackets. If a closing bracket is found, remove one opening bracket from stack
                else if(t == OPENING_CURLY)                 
                    CurlyStack.push(o);
                else if(t == CLOSING_CURLY)
                   CurlyStack.pop();

            } catch (EmptyStackException e) {
                //Do nothing
            }
            
            //Check if we are inside the outermost #if#else block (because the final #endif can appear after the closing bracket of a method)
            if(t == PRE_ELSE && ifdefStack.size() == 1){
                insideOutermostPreElseStatement = true;
            }
                
            //Consume and return the current symbol, move cursor to next symbol, the consumed symbol is added to the parse tree 
            consume();
            t = _input.LA(1);           
        }
        
        if(t != EOF){
            //Return and parse the closing bracket (if there is one)
            consume();
         }   
         
        return true;
    }

       // this should go into FunctionGrammar but ANTLR fails
       // to join the parser::members-section on inclusion
       
       public boolean preProcSkipToEnd()
       {
                    Stack<Object> CurlyStack = new Stack<Object>();
                    Object o = new Object();
                    int t = _input.LA(1);

                    while(t != EOF && !(CurlyStack.empty() && t == PRE_ENDIF)){
                                            
                        if(t == PRE_IF)
                            CurlyStack.push(o);
                        else if(t == PRE_ENDIF)
                            CurlyStack.pop();
                        
                        consume();
                        t = _input.LA(1);
                    }
                    if(t != EOF)
                        consume();
                    return true;
       }

}

unary_operator : '&' | '*' | '+'| '-' | '~' | '!';
relational_operator: ('<'|'>'|'<='|'>=');

constant
    :   HEX_LITERAL
    |   OCTAL_LITERAL
    |   DECIMAL_LITERAL
	|	STRING
    |   CHAR
    |   FLOATING_POINT_LITERAL
    ;

// keywords & operators

function_decl_specifiers: ('inline' | 'virtual' | 'explicit' | 'friend' | 'static');
ptr_operator: ('*' | '&');

access_specifier: ('public' | 'private' | 'protected');

operator: (('new' | 'delete' ) ('[' ']')?)
  | '+' | '-' | '*' | '/' | '%' |'^' | '&' | '|' | '~'
  | '!' | '=' | '<' | '>' | '+=' | '-=' | '*='
  | '/=' | '%=' | '^=' | '&=' | '|=' | '>>'
  |'<<'| '>>=' | '<<=' | '==' | '!='
  | '<=' | '>=' | '&&' | '||' | '++' | '--'
  | ',' | '->*' | '->' | '(' ')' | '[' ']'
  ;

assignment_operator: '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|='; 
equality_operator: ('=='| '!=');

template_decl_start : TEMPLATE '<' template_param_list '>';


// template water
template_param_list : (('<' template_param_list '>') |
                       ('(' template_param_list ')') | 
                       no_angle_brackets_or_brackets)+
;

// water

no_brackets: ~('(' | ')');
no_brackets_curlies_or_squares: ~('(' | ')' | '{' | '}' | '[' | ']');
no_brackets_or_semicolon: ~('(' | ')' | ';');
no_angle_brackets_or_brackets : ~('<' | '>' | '(' | ')');
no_curlies: ~('{' | '}');
no_squares: ~('[' | ']');
no_squares_or_semicolon: ~('[' | ']' | ';');
no_comma_or_semicolon: ~(',' | ';');

assign_water: ~('(' | ')' | '{' | '}' | '[' | ']' | ';' | ',');
assign_water_l2: ~('(' | ')' | '{' | '}' | '[' | ']');

water: .;
