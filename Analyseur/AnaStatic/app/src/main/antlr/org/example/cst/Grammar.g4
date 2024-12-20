grammar Grammar;
//
//------Lexer Rules-----------
//

// Keywords
INT: 'int';
BOOL: 'bool';
ELSE: 'else';
PRINT: 'print';

//Literals
fragment DIGIT: [0-9];
NUM: DIGIT+;
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
AND: 'and';
OR: 'or';

//Identifiers
fragment LETTER: [a-zA-Z];
ID: LETTER (LETTER | DIGIT)*;

// Comments -> ignored
COMMENT: ('/*'(.*?)'*/'|'//'.*?'\r'?('\n'|EOF)) -> skip;

// Whitespaces -> ignored
NEWLINE: '\r'?'\n'  -> skip ;
WS: [ \t]+ -> skip ;

//
//------Parser Rules--------
//

program: function*;

function: 'function' ID LPAR paramlist? RPAR LCBRACKET stmtlist RCBRACKET;

paramlist: param | param COMMA paramlist;

param: ID;

stmtlist: stmt | stmt stmtlist;

stmt: assignment | if | while | sequence | returnstmt SEMICOLON;

assignment: ID ASSIGN expr SEMICOLON
    | ID EQUAL funccall SEMICOLON
    | ID LBRACKET NUM RBRACKET ASSIGN  LCBRACKET (NUM (COMMA NUM)*)? RCBRACKET SEMICOLON;

funccall: ID LBRACKET exprlist RBRACKET;

if: 'if' LPAR expr RPAR stmt ELSE stmt;

while: 'while' LPAR expr RPAR stmt;

sequence: LCBRACKET stmtlist RCBRACKET;

returnstmt: RETURN expr;

expr: arithexpr | boolexpr;

arithexpr: noprnd | binop;

boolexpr: boprnd | relop;

binop: noprnd op noprnd;

relop: boprnd rop boprnd;

noprnd: var | NUM;

boprnd: var | TRUE | FALSE;

op: ADD | SUBTRACT | MULTIPLY | DIVIDE;

rop: LESS | GREATER | EQUAL | DIFFERENT | GREATER_EQUAL | LESS_EQUAL | AND | OR;

var: ID;

exprlist: expr*;

array: LBRACKET (noprnd|boprnd) (COMMA (noprnd|boprnd))* RBRACKET; // CREATION DE array AVEC MIN 1 VALEUR