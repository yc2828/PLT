grammar Grammar;

line returns [LOGONode node]
		: expression EOF {$node = $expression.node; LOGOPP.io.debug("line->expr");}
		| command_list EOF {$node = $command_list.node; LOGOPP.io.debug("line->comdlist");}

		;

command_list returns [LOGONode node]
        : command_noarg l=command_list {$node = new LOGOCommandNode("commandList", $command_noarg.node, $l.node);}
        | command_expr l=command_list {$node = new LOGOCommandNode("commandList",$command_expr.node, $l.node);}
        | {$node = null;}
		;

command_noarg returns [LOGONode node]
    :   Getx {$node =  new LOGOCommandNode("GETX");}
    |   Gety {$node =  new LOGOCommandNode("GETY");}
    |   Getxy {$node =  new LOGOCommandNode("GETXY");}
    |   Clearscreen {$node =  new LOGOCommandNode("CLEARSCREEN");}
    |   Origin {$node =  new LOGOCommandNode("ORIGIN");}
    |	Wrap
    |	Fence
    |	Penup
    |	Pendown
    |	Showturtle
    |	Hideturtle
    ;
    
command_expr returns [LOGONode node]
	:	command expression {$node = new LOGOCommandNode($command.text, $expression.node);}
	;

command returns [String text]
	:	Forward {$text = new String("FORWARD");}
	|	Back {$text = new String("BACK");}
	|	Left {$text = new String("LEFT");}
	|	Right {$text = new String("RIGHT");}
	|	Setx
    |	Sety
    |	Setxy
    |	Speed
    |	Print
	;

expression returns [LOGONode node]
        : additive_expression {$node = $additive_expression.node; LOGOPP.io.debug("expr->additive");}
        ;

primary_expression returns [LOGONode node]
        : Number {$node = new LOGOLeaf($Number.text); LOGOPP.io.debug("Number " + $node.id);}
        | '(' expression ')' {$node = $expression.node; LOGOPP.io.debug("parentheses");}
        | assignment_expression {$node = $assignment_expression.node; LOGOPP.io.debug("SET");}
        | id {$node = $id.node; LOGOPP.io.debug("ID");}
        ;

unary_expression returns [LOGONode node]
        : primary_expression {$node = $primary_expression.node; LOGOPP.io.debug("unary->primary " + $node.id);}
        | unary_operator primary_expression {$node = new LOGOOperatorNode("u-", $primary_expression.node); LOGOPP.io.debug("unary->primary " + $node.id);}
        ;

unary_operator
        : '-'
        ;

multiplicative_expression returns [LOGONode node]
        : n=multiplicative_expression '*' unary_expression {$node = new LOGOOperatorNode("*", $n.node, $unary_expression.node); LOGOPP.io.debug("mul->mul*unary " + $node.id);}
        | n=multiplicative_expression '/' unary_expression {$node = new LOGOOperatorNode("/", $n.node, $unary_expression.node); LOGOPP.io.debug("mul->mul/unary " + $node.id);}
        | n=multiplicative_expression '^' unary_expression {$node = new LOGOOperatorNode("^", $n.node, $unary_expression.node); LOGOPP.io.debug("mul->mul^unary " + $node.id);}
        | unary_expression {$node = $unary_expression.node; LOGOPP.io.debug("mul->unary " + $node.id);}
        ;

additive_expression returns [LOGONode node]
        : n=additive_expression '+' multiplicative_expression {$node = new LOGOOperatorNode("+", $n.node, $multiplicative_expression.node); LOGOPP.io.debug("add->add+mul " + $node.id);}
        | n=additive_expression '-' multiplicative_expression {$node = new LOGOOperatorNode("-", $n.node, $multiplicative_expression.node); LOGOPP.io.debug("add->add-mul " + $node.id);}
        | multiplicative_expression {$node = $multiplicative_expression.node; LOGOPP.io.debug("add->mul " + $node.id);}
        ;

id returns [LOGONode node]
        : Identifier {$node = new LOGOLeaf($Identifier.text);}
        ;

assignment_expression returns [LOGONode node]
        : 'SET' id expression {$node = new LOGOSetNode($id.node.id, $expression.node);}
        ;

catch[RecognitionException e] {throw e;}

Forward
		: ('Forward ' | 'FORWARD ' | 'FD ')
		;
		
Back
		: ('Back ' | 'BACK ' | 'BK ')
		;

Left
		: ('Left ' | 'LEFT ' | 'LT ')
		;

Right
		: ('Right ' | 'RIGHT ' | 'RT ')
		;

Setx
		: ('SetX ' | 'SETX ')
		;

Sety
		: ('SetY ' | 'SETY ')
		;
		
Setxy
		: ('SetXY ' | 'SETXY ' | 'Teleport ' | 'TELEPORT ')
		;

Speed
		: ('Speed ' | 'SPEED ')
		;

Print
		: ('Print ' | 'PRINT ')
		;
		
Clearscreen
		: ('Clearscreen' | 'CLEARSCREEN' | 'CS')
		;

Origin
		: ('Origin' | 'ORIGIN' | 'Home' | 'HOME')
		;

Wrap
		: ('Wrap' | 'WRAP')
		;

Fence
		: ('Fence' | 'FENCE')
		;

Getx
		: ('Getx' | 'GETX')
		;

Gety
		: ('Gety' | 'GETY')
		;

Getxy
		: ('Getxy' | 'GETXY' | 'GPS')
		;

Penup
		: ('Penup' | 'PENUP' | 'PU')
		;

Pendown
		: ('Pendown' | 'PENDOWN' | 'PD')
		;

Hideturtle
		: ('Hideturtle' | 'HIDETURTLE' | 'HT')
		;

Showturtle
		: ('Showturtle' | 'SHOWTURTLE' |'ST')
		;

Number
        : ('0'..'9')+ ('.' ('0'..'9')+)?
        ;

Identifier
        : [A-Za-z_] [a-zA-z0-9_]*
        ;

WS
        :(' ' | '\t' | '\r'| '\n') -> skip
		;
