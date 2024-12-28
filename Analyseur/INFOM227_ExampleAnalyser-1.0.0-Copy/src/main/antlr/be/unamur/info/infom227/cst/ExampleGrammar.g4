grammar ExampleGrammar;

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

program: functiondeclaration*;

functiondeclaration: 'function' ID LPAR paramlist? RPAR LCBRACKET stmtlist RCBRACKET;

paramlist: param #paramlistparam
    | param COMMA paramlist #paramlistlist;

param: ID;

stmtlist: stmt
    | stmt stmtlist;

stmt: assignment | ifstmt | whilestmt | sequencestmt | returnstmt SEMICOLON;

assignment: ID ASSIGN expr SEMICOLON
    | ID ASSIGN funccall SEMICOLON
    | ID LBRACKET NUM RBRACKET ASSIGN  array;

funccall: ID LBRACKET exprlist RBRACKET;

ifstmt: 'if' LPAR expr RPAR stmt ELSE stmt;

whilestmt: 'while' LPAR expr RPAR stmt;

sequencestmt: LCBRACKET stmtlist RCBRACKET;

returnstmt: RETURN expr;

expr: arithexpr | boolexpr;

arithexpr: noprnd | binop;

boolexpr: boprnd | relop;

binop: noprnd (MULTIPLY | DIVIDE | ADD | SUBTRACT) noprnd;

relop: boprnd (LESS | GREATER | EQUAL | DIFFERENT | GREATER_EQUAL | LESS_EQUAL | AND | OR) boprnd;

noprnd: var | NUM;

boprnd: var | TRUE | FALSE;

var: ID;

exprlist: expr*;

array: LBRACKET (noprnd|boprnd) (COMMA (noprnd|boprnd))* RBRACKET; // CREATION DE array AVEC MIN 1 VALEUR