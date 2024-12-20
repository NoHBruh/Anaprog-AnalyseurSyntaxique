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
identifier: LETTER (LETTER | DIGIT)*;

// Comments -> ignored
COMMENT: ('/*'(.*?)'*/'|'//'.*?'\r'?('\n'|EOF)) -> skip;

// Whitespaces -> ignored
NEWLINE: '\r'?'\n'  -> skip ;
WS: [ \t]+ -> skip ;

//
//------Parser Rules--------
//

program: function*;

function: 'function' identifier LPAR paramlist? RPAR LCBRACKET stmtlist RCBRACKET;

paramlist: param | param COMMA paramlist;

param: identifier;

stmtlist: stmt | stmt stmtlist;

stmt: assignment | if | while | sequence | returnstmt SEMICOLON;

assignment: identifier ASSIGN expr | identifier EQUAL funccall | identifier RBRACKET NUM LBRACKET ASSIGN  LCBRACKET (NUM (COMMA NUM)*)? RCBRACKET;

funccall: identifier LBRACKET exprlist? RBRACKET;

if: 'if' LBRACKET expr RBRACKET stmt ELSE stmt;

while: 'while' LBRACKET expr RBRACKET stmt;

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

var: identifier;

exprlist: expr*;

array: LBRACKET NUM (COMMA NUM)* RBRACKET; // CREATION DE array AVEC MIN 1 VALEUR