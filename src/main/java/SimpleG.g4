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
VARIDENT SINGLESPACE ID EQUALSIGN expr ENDSTATEMENT
| ID EQUALSIGN expr ENDSTATEMENT;

forloop:
FORIDENT SINGLESPACE INT SINGLESPACE 'to' SINGLESPACE INT SINGLESPACE 'do' STARTBRACKET block+ ENDBRACKET;

ifstat:
IF SINGLESPACE conditon SINGLESPACE THEN STARTBRACKET block+ ENDBRACKET;

expr: expr('*'|'/') expr?ENDSTATEMENT
    | expr('+'|'-') expr?ENDSTATEMENT
    | expr(LESSTHAN|MORETHAN) expr?ENDSTATEMENT
    | expr EQUALS expr?ENDSTATEMENT
    |   INT
    |   ID
    |   '(' expr ')'
    ;

conditon: conditon('*'|'/') conditon
    | conditon('+'|'-') conditon
    | conditon(LESSTHAN|MORETHAN) conditon
    | conditon EQUALS conditon
    |   INT
    |   ID
    |   '(' conditon ')'
    ;

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
