lexer grammar ModuleLex;

ESCAPED_NEWLINE: '\\' [ \t\u000C]* '\r'? '\n';//For preprocessor
NEWLINE: '\r'? '\n';
ESCAPE: '\\';
ELLIPSIS : '...';

// Keywords shared among C/C++/Java

IF: 'if'; 
ELSE: 'else'; 
FOR: 'for'; 
WHILE: 'while';

BREAK: 'break'; 
CASE: 'case'; 
CONTINUE: 'continue'; 
SWITCH: 'switch'; 
DO: 'do';

GOTO: 'goto'; 
RETURN: 'return';

TYPEDEF: 'typedef';
STATIC: 'static';
VOID: 'void'; 
UNSIGNED: 'unsigned'; 
SIGNED: 'signed';
CV_QUALIFIER:  ('__const' | '__const__' | 'const'  | '__volatile__' | '__volatile' | 'volatile'| '__thread' | '_Atomic'  | '__restrict' | '__restrict__'| 'restrict');
EXTERN: 'extern';
ASM: ('__asm__' | 'asm');

// Keywords shared among C++/Java


TRY: 'zend_try' | 'zend_first_try';    //Custom extention for zend/php project
CATCH: 'zend_catch';      //Custom extention for zend/php project


// Keywords shared among C/C++

AUTO: 'auto'; 
REGISTER: 'register';
SPECIAL_DATA: ('struct' | 'union' | 'enum');


// pre-processor directives: C/C++

PRE_IF: '#' [ \t\u000C]* ('if' | 'ifdef' | 'ifndef');
PRE_ELIF:  '#' [ \t\u000C]* 'elif';
PRE_ELSE: '#' [ \t\u000C]* 'else';
PRE_ENDIF: '#' [ \t\u000C]* 'endif';
PRE_DEFINE: '#' [ \t\u000C]* 'define';     
PRE_UNDEF:  '#' [ \t\u000C]* 'undef';
PRE_DIAGNOSTIC:  '#' [ \t\u000C]* ('error' | 'warning');
PRE_OTHER:  '#' [ \t\u000C]* ('ident' |  'sccs' | 'null');
PRE_INCLUDE:  '#' [ \t\u000C]* ('import' | 'include') ([ \t\u000C]* '<' ( EscapeSequence | ~('>'|'<') )* '>')?;
PRE_INCLUDE_NEXT:  '#' [ \t\u000C]* 'include_next' ([ \t\u000C]* '<' ( EscapeSequence | ~('>'|'<') )* '>')?;
PRE_LINE: '#' [ \t\u000C]* 'line';
PRE_PRAGMA: '#' [ \t\u000C]* 'pragma';
PRE_GCC: 'GCC';
PRE_PRAGMA_KEYWORDS: ('dependency' | 'poison' | 'error' | 'warning' | 'once' | 'system_header' | 'warning');
PRE_STR: ('##' | '#');
PRE_ATTRIBUTE: '__attribute__' | 'PHP_ATTRIBUTE_FORMAT' |'_GL_ARG_NONNULL' | '__declspec' | '_GL_ATTRIBUTE_PURE' | '_GL_INLINE_HEADER_BEGIN' | '_GL_INLINE_HEADER_END' | '_GL_ATTRIBUTE_FORMAT_PRINTF' | '_GL_ATTRIBUTE_FORMAT_PRINTF_STANDARD';
END_TEST : 'END_TEST'; //Custom
//PRE_PROC: '#' ~[\r\n]* '\r'? '\n';



ALPHA_NUMERIC: [a-zA-Z_~][a-zA-Z0-9_]*;

OPENING_CURLY: '{';
CLOSING_CURLY: '}';

HEX_LITERAL : '0' ('x'|'X') HexDigit+ IntegerTypeSuffix?;
DECIMAL_LITERAL : ('0' | '1'..'9' '0'..'9'*) IntegerTypeSuffix? ;
OCTAL_LITERAL : '0' ('0'..'7')+ IntegerTypeSuffix? ;
HEX_FLOAT: '0' ('x'|'X') HexDigit+ '.'? HexDigit* 'p' ('+'|'-')? ('0'..'9')+ 'f'?;  //Hexadecimal floating point format

FLOATING_POINT_LITERAL
    :   ('0'..'9')+ '.' ('0'..'9')* Exponent? FloatTypeSuffix?
    |   '.' ('0'..'9')+ Exponent? FloatTypeSuffix?
    |   ('0'..'9')+ Exponent FloatTypeSuffix?
    |   ('0'..'9')+ Exponent? FloatTypeSuffix
    ;
 
    
fragment
COMMENT_END: '*/';  
    
MULTILINE_COMMENT: '/*' (.)*?  COMMENT_END;
ONELINE_COMMENT: '//'  ~('\n'|'\r')* '\r'? '\n';
 
CHAR:  WideCharTypeSuffix?  '\'' ( EscapeSequence | ~('\''|'\\') ) '\'';

STRING:  WideCharTypeSuffix? '"' ( EscapeSequence | ~('\\'|'"') )* '"';

fragment
IntegerTypeSuffix
    :   ('u'|'U')? ('l'|'L')
    |   ('u'|'U')  ('l'|'L')?
    ;

fragment
Exponent : ('e'|'E') ('+'|'-')? ('0'..'9')+;

fragment
FloatTypeSuffix : ('f'|'F'|'d'|'D');

fragment
WideCharTypeSuffix : ('L'|'u'|'U'|'u8');


fragment
EscapeSequence
    :   '\\' .
    |   UnicodeEscape
    |   OctalEscape
    ;

fragment
OctalEscape
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;

fragment
HexDigit : ('0'..'9'|'a'..'f'|'A'..'F') ;

    
WHITESPACE :  [ \t\u000C]+ -> skip  ;   
OTHER : . -> skip ;
