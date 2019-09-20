lexer grammar ModuleLex;

// Keywords shared among C/C++/Java

IF: 'if'; ELSE: 'else'; FOR: 'for'; WHILE: 'while';

BREAK: 'break'; CASE: 'case'; CONTINUE: 'continue'; 
SWITCH: 'switch'; DO: 'do';

GOTO: 'goto'; RETURN: 'return';

TYPEDEF: 'typedef';
VOID: 'void'; UNSIGNED: 'unsigned'; SIGNED: 'signed';
LONG: 'long'; CV_QUALIFIER :  'const' | 'volatile';

// Keywords shared among C++/Java

VIRTUAL: 'virtual';
TRY: 'try'; CATCH: 'catch'; THROW: 'throw';
USING: 'using'; NAMESPACE: 'namespace'; 

// Keywords shared among C/C++

AUTO: 'auto'; REGISTER: 'register';

// pre-processor directives: C/C++

PRE_IF: ('#if' | '#ifdef' | '#ifndef');
PRE_ELIF:  '#elif';
PRE_ELSE: '#else';
PRE_ENDIF: '#endif';
PRE_DEFINE: '#define';     
PRE_UNDEF:  '#undef';
PRE_DIAGNOSTIC: ('#error' | '#warning');
PRE_OTHER: ('#ident' |  '#sccs' | '#null');
PRE_INCLUDE:  ('#import' | '#include');
PRE_INCLUDE_NEXT:  '#include_next';
PRE_LINE: '#line';
PRE_PRAGMA: '#pragma';
PRE_GCC: 'GCC';
PRE_PRAGMA_KEYWORDS: ('dependency' | 'poison' | 'error' | 'warning' | 'once' | 'system_header' | 'warning');
PRE_STR: ('##' | '#');
//PRE_PROC: '#' ~[\r\n]* '\r'? '\n';



// C++ keywords

OPERATOR: 'operator';
TEMPLATE: 'template';
NEW: 'new';

CLASS_KEY: ('struct' | 'class' | 'union' | 'enum');

ALPHA_NUMERIC: [a-zA-Z_~][a-zA-Z0-9_]*;

OPENING_CURLY: '{';
CLOSING_CURLY: '}';

HEX_LITERAL : '0' ('x'|'X') HexDigit+ IntegerTypeSuffix? ;
DECIMAL_LITERAL : ('0' | '1'..'9' '0'..'9'*) IntegerTypeSuffix? ;
OCTAL_LITERAL : '0' ('0'..'7')+ IntegerTypeSuffix? ;

FLOATING_POINT_LITERAL
    :   ('0'..'9')+ '.' ('0'..'9')* Exponent? FloatTypeSuffix?
    |   '.' ('0'..'9')+ Exponent? FloatTypeSuffix?
    |   ('0'..'9')+ Exponent FloatTypeSuffix?
    |   ('0'..'9')+ Exponent? FloatTypeSuffix
	;
	
COMMENT: '/*' (COMMENT|.)*? '*/'
    | '//'  ~('\n'|'\r')* '\r'? '\n'
 ;
 
CHAR
    :   '\'' ( EscapeSequence | ~('\''|'\\') ) '\''
    ;

STRING
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;


fragment
IntegerTypeSuffix
	:	('u'|'U')? ('l'|'L')
	|	('u'|'U')  ('l'|'L')?
	;

fragment
Exponent : ('e'|'E') ('+'|'-')? ('0'..'9')+;

fragment
FloatTypeSuffix : ('f'|'F'|'d'|'D');


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

NEWLINE: '\r'? '\n';

ESCAPE: '\\';
    
WHITESPACE :  [ \t\u000C]+ -> skip  ;   
    
ELLIPSIS : '...';

OTHER : . -> skip ;
