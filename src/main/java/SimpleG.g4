grammar SimpleG;

prog: stat;

stat:  block+;

block:
    forloop
    |ifstat
    |expr
    |assignment
    |SINGLESPACE+
    ;


assignment:
VARIDENT SINGLESPACE ID EQUALSIGN expr ENDSTATEMENT #assigntype
| ID EQUALSIGN expr ENDSTATEMENT #changeassign;

forloop:
FORIDENT SINGLESPACE INT SINGLESPACE 'to' SINGLESPACE INT SINGLESPACE 'do' STARTBRACKET block+ ENDBRACKET;

ifstat:
IF SINGLESPACE conditon SINGLESPACE THEN STARTBRACKET block+ ENDBRACKET;

expr: expr('*') expr #mul
    | expr('/') expr ENDSTATEMENT #divend
    | expr('*') expr ENDSTATEMENT #mulend
    | expr('/') expr #div
    | expr('+') expr #add
    | expr('-') expr #minus
    | expr('+') expr ENDSTATEMENT #addend
    | expr('-') expr ENDSTATEMENT #minusend
    | expr(LESSTHAN) expr #lessthancompare
    | expr(MORETHAN) expr #morethancompare
    | expr EQUALS expr #equality
    | expr EQUALS expr ENDSTATEMENT #equalityend
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


ADD:'+';
MINUS:'-';
DIV:'/';
MUL:'*';
THEN:'then';
LESSTHAN:'<';
MORETHAN:'>';
EQUALS:'==';
 VARIDENT:'var';
 FORIDENT:'for';
 IF:'if';
  ENDSTATEMENT: ';';
  STARTBRACKET:'{';
  ENDBRACKET:'}';
 ID : [a-zA-Z_] [a-zA-Z_0-9]*
  |[0-9]+ [a-zA-Z_]+;
 INT : [0-9]+ ;
 SINGLESPACE: [' '];
EQUALSIGN : '=';
 NEWLINE2: '\r'? '\n' -> skip;
 WS : [\t]+ -> skip;
 SPACE :' '+;
