grammar SimpleG;

prog: stat;

stat:  block+;

block:
    forloop
    |ifstat
    |expr
    |assignment
    |SINGLESPACE+
    |sysfunc
    ;

sysfunc:
PRINT '(' STRINGCHARACTER expr STRINGCHARACTER ')'
| PRINTLN '(' STRINGCHARACTER expr STRINGCHARACTER ')';


assignment:
STRINGIDENT SINGLESPACE ID EQUALSIGN STRINGCHARACTER expr STRINGCHARACTER #assignstringmutablesingletype
|NUMIDENT SINGLESPACE ID EQUALSIGN  expr  #assigndigitsmutablesingletype
|ID EQUALSIGN STRINGCHARACTER expr STRINGCHARACTER  #assignstringmutablechangetype
|ID EQUALSIGN expr #assignmutable
|STRINGIDENT SINGLESPACE ID NONMUTABLE STRINGCHARACTER expr STRINGCHARACTER #assignstringnonmutable
|NUMIDENT SINGLESPACE ID NONMUTABLE  expr  #assigndigitsnonmutable
|ID NONMUTABLE STRINGCHARACTER expr STRINGCHARACTER  #assignstringnonmutable
|ID NONMUTABLE expr #assigntextnonmutable
|ID EQUALSIGN ARRSTART (arrvalue COMMA|arrvalue)+ ARREND #arraymutableassign
|ID NONMUTABLE ARRSTART (arrvalue COMMA|arrvalue)+ ARREND #arraynonmutableassign;

forloop:
FORIDENT SINGLESPACE INT DOUBLEDOTKEYWORDFORLOOP INT SINGLESPACE DOKEYWORDFORLOOP STARTBRACKET block+ ENDBRACKET;

ifstat:
IF SINGLESPACE conditon SINGLESPACE THEN STARTBRACKET block+ ENDBRACKET;

expr: expr('*') expr #mul
    | expr('/') expr #div
    | expr('+') expr #add
    | expr('-') expr #minus
    | expr(LESSTHAN) expr #lessthancompare
    | expr(MORETHAN) expr #morethancompare
    | expr EQUALS expr #equality
    |   INT #intend
    |   ID #idend
    ;

conditon: conditon('*'|'/') conditon #condmultdiv
    | conditon('+'|'-') conditon #condplusminus
    | conditon(LESSTHAN|MORETHAN) conditon #condlessgreater
    | conditon EQUALS conditon #condequality
    |   INT #condint
    |   ID #condid
    ;

arrvalue: INT
| '"'+ID|INT +'"'
;

comment: COMMENTSIGN ID;

PRINTLN:'println';
PRINT:'print';
COMMENTSIGN:'#';
NONMUTABLE:':';
ADD:'+';
MINUS:'-';
DIV:'/';
MUL:'*';
THEN:'then';
LESSTHAN:'<';
MORETHAN:'>';
EQUALS:'==';
DOUBLEDOTKEYWORDFORLOOP:'..';
DOKEYWORDFORLOOP:'do';
 STRINGIDENT:'string';
 NUMIDENT:'num';
 STRINGCHARACTER:'"';
 FORIDENT:'for';
 IF:'if';
  ENDSTATEMENT: ';';
  STARTBRACKET:'{';
  ENDBRACKET:'}';
 ID : [a-zA-Z_] [a-zA-Z_0-9]*
  |[0-9]+ [a-zA-Z_]+
  ;
 INT : [0-9]+ ;
 SINGLESPACE: [' '];
EQUALSIGN : '=';
 NEWLINE2: '\r'? '\n' -> skip;
 WS : [\t]+ -> skip;
 SPACE :' '+;
 ARRSTART:'[';
 ARREND:']';
 COMMA:',';
