grammar GrammarLexer;
//
//------Lexer Rules-----------
//

// Keywords
INT: 'int';
BOOL: 'bool';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
PRINT: 'print';

//Literals
fragment DIGIT: [0-9];
NUMBER: DIGIT+;
TRUE: 'true';
FALSE: 'false';


//Separators
LPAR: '(';
RPAR: ')';
LBRACKET: '[';
RBRACKET: ']';
LCBRACKET: '{';
RCBRACKET: '}';
COMMA: ',';
DOT: '.';
SEMICOLON : ';';

//Operators
ADD: '+';
SUBTRACT: '-';
MULTIPLY: '*';
DIVIDE: '/';
GREATER: '>';
GREATER_EQUAL: '>=';
LESS: '<';
LESS_EQUAL: '<=';
EQUAL: '==';
DIFFERENT: '!=';
RETURN: 'return';
ASSIGN: '=';

//Identifiers
fragment LETTER: [a-zA-Z];
IDENTIFIER: LETTER (LETTER | DIGIT)*;

// Comments -> ignored
COMMENT: ('/*'(.*?)'*/'|'//'.*?'\r'?('\n'|EOF)) -> skip;

// Whitespaces -> ignored
NEWLINE: '\r'?'\n'  -> skip ;
WS: [ \t]+ -> skip ;

//
//------Parser Rules--------
//

PROGRAM: FUNCTION*;

FUNCTION: 'function' IDENTIFIER LPAR [PARAMLIST] RPAR LCBRACKET STMTLIST RCBRACKET;

PARAMLIST: PARAM | PARAM COMMA PARAMLIST;

PARAM: IDENTIFIER;

STMTLIST: STMT | STMT STMTLIST;

STMT: ASSIGN | IF | WHILE | SEQUENCE | RETURNSTMT SEMICOLON;

ASSIGNMENT: IDENTIFIER ASSIGN EXPR | IDENTIFIER EQUAL FUNCCALL;

IF: IF LBRACKET EXPR RBRACKET STMT ELSE STMT;

WHILE: WHILE LBRACKET EXPR RBRACKET STMT;

SEQUENCE: LCBRACKET STMTLIST RCBRACKET;

RETURNSTMT: RETURN EXPR;

EXPR: ARITHEXPR | BOOLEXPR;

ARITHEXPR: NOPRND | BINOPRND;

BOOLEXPR: BOPRND | RELOP;

BINOP: NOPRND OP NOPRND;