/**
 * Define a grammar for a programming language
 */
grammar OurLanguage;
program  : 'PROGRAM' ID '(' paramList ')' '{' code '}';
paramList: (ID (',' ID)* )
		| 
		;
code: (statement)+;
statement: 'IF' '(' condition ')' '{' code '}' ('ELSE' '{' code '}')
		| ID ':=' value ';'
		| 'FOR' '(' value ')' '{' code '}'
		| 'RETURN' ('(' value ')') ';'
		| 'RETURN' ('('')') ';'
		//TODO aliohjelmat
		;

condition: value '=' value
		| value '<' value
		| value '>' value
		;
		
value: simpleValue '+' simpleValue
		| simpleValue '-' simpleValue
		| value '+' value
		| value '-' value
		| simpleValue
		| '('value')'
		;
		
simpleValue : simpleValue '*' simpleValue
 			| simpleValue '/' simpleValue
			| '('value')'
			| ID
 			| INT
 			| DOUBLE
 			;

INT : [-]?([0-9] | [1-9][0-9]*);
DOUBLE : [-]?([0-9] | [1-9][0-9]*)'.'[0-9]+;

ID : [a-z][a-zA-Z0-9]* ; 

WS : [ \t\r\n]+ -> skip ; 

COMMENT : '//' ~[\r\n]+ -> skip ;