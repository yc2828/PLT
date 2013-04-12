grammar Grammar;

prog : command_list EOF;

command_list returns [LOGONode node]
        : command_noarg command_list {$node = new LOGOCommandNode($command_noarg.text);}
        | command_expr command_list {$node = $command_expr.node;}
  	|
        ;

command_noarg returns [String text]
    :   getx {$text =  $getx.text;}
    |   gety {$text =  $gety.text;}
    |   getxy {$text =  $getxy.text;}
    |   clearscreen {$text =  $clearscreen.text;}
    |   origin {$text =  $origin.text;}
    |   showturtle {$text =  $showturtle.text;}
    |   hideturtle {$text =  $hideturtle.text;}
    |   wrap {$text =  $wrap.text;}
    |   fence {$text =  $fence.text;}
    |   penup {$text =  $penup.text;}
    |   pendown {$text =  $pendown.text;}
    ;
    
command_expr returns [LOGONode node]
	:	command expression {$node = new LOGOCommandNode($command.text, $expression.node);}
	;

command returns [String text]
	:	forward {$text = $forward.text;}
	|	back {$text = $back.text;}
	|	left {$text = $left.text;}
	|	right {$text = $right.text;}
	|	speed {$text = $speed.text;}
	|	setx {$text = $setx.text;}
	|	sety {$text = $sety.text;}
	|	setxy {$text = $setxy.text;}
	;
	
forward returns [String text]
    :   c = 'FORWARD ' {$text =  new String("FORWARD");}
    |   c = 'FD ' {$text =  new String("FORWARD");}
    |	c = 'Forward ' {$text = new String("FORWARD");}
    ;
back returns [String text]
    :   c = 'BACK ' {$text =  new String("BACK");}
    |   c = 'BK ' {$text =  new String("BACK");}
    ;

left returns [String text]
    :   c = 'LEFT ' {$text = new String("LEFT");}
    |   c = 'LT ' {$text = new String("LEFT");}
    ;

right returns [String text]
    :   c = 'RIGHT ' {$text = new String("RIGHT");}
    |   c = 'RT ' {$text = new String("RIGHT");}
    ;

setx returns [String text]
    :   c = 'SETX ' {$text =  $c.getText();}
    ;

sety returns [String text]
    :   c = 'SETY ' {$text =  $c.getText();}
    ;

setxy returns [String text]
    :   c = 'SETXY ' {$text =  $c.getText();}
    |   c = 'TELEPORT ' {$text =  $c.getText();}
    ;

getx returns [String text]
    :   c = 'GETX' {$text =  $c.getText();}
    ;

gety returns [String text]
    :   c = 'GETY' {$text =  $c.getText();}
    ;

getxy returns [String text]
    :   c = 'GETXY' {$text =  $c.getText();}
    |   c = 'GPS' {$text =  $c.getText();}
    ;

speed returns [String text]
    :   c = 'SPEED ' {$text =  $c.getText();}
    ;

print returns [String text]
    :   c = 'PRINT ' {$text =  $c.getText();}
    ;

clearscreen returns [String text]
    :   c = 'CLEARSCREEN' {$text = new String("CLEARSCREEN");}
    |   c = 'CS' {$text = new String("CLEARSCREEN");}
    ;

origin returns [String text]
    :   c = 'ORIGIN' {$text =  $c.getText();}
    |   c = 'HOME' {$text =  $c.getText();}
    ;

showturtle returns [String text]
    :   c = 'SHOW_TURTLE' {$text =  $c.getText();}
    |   c = 'ST' {$text =  $c.getText();}
    ;

hideturtle returns [String text]
    :   c = 'HIDE_TURTLE' {$text =  $c.getText();}
    |   c = 'HT' {$text =  $c.getText();}
    ;

wrap returns [String text]
    :   c = 'WRAP' {$text =  $c.getText();}
    ;

fence returns [String text]
    :   c = 'FENCE' {$text =  $c.getText();}
    ;

penup returns [String text]
    :   c = 'PEN_UP' {$text =  $c.getText();}
    |   c = 'PU' {$text =  $c.getText();}
    ;

pendown returns [String text]
    :   c = 'PEN_DOWN' {$text =  $c.getText();}
    |   c = 'PD' {$text =  $c.getText();}
    ;

expression returns [LOGONode node]
        : additive_expression {$node = $additive_expression.node;}
        ;

primary_expression returns [LOGONode node]
        : Number {$node = new LOGOLeaf($Number.text);}
        | '(' expression ')' {$node = $expression.node;}
        | assignment_expression {$node = $assignment_expression.node;}
        ;

unary_expression returns [LOGONode node]
        : primary_expression {$node = $primary_expression.node;}
        | unary_operator primary_expression {$node = new LOGOOperator("u-", $primary_expression.node);}
        ;

unary_operator
        : '-'
        ;

multiplicative_expression returns [LOGONode node]
        : unary_expression {$node = $unary_expression.node;}
        | multiplicative_expression '*' unary_expression {$node = new LOGOOperator("*", $multiplicative_expression.node, $unary_expression.node);}
        | multiplicative_expression '/' unary_expression {$node = new LOGOOperator("/", $multiplicative_expression.node, $unary_expression.node);}
        | multiplicative_expression '^' unary_expression {$node = new LOGOOperator("^", $multiplicative_expression.node, $unary_expression.node);}
        ;

additive_expression returns [LOGONode node]
        : multiplicative_expression {$node = $multiplicative_expression.node;}
        | additive_expression '+' multiplicative_expression {$node = new LOGOOperator("+", $additive_expression.node, $multiplicative_expression.node);}
        | additive_expression '-' multiplicative_expression {$node = new LOGOOperator("-", $additive_expression.node, $multiplicative_expression.node);}
        ;

id returns [LOGONode node]
        :Identifier {$node = new LOGOLeaf($Identifier.text);}
        ;

assignment_expression returns [LOGONode node]
        : 'SET' id expression {$node = new LOGOOperator("set", $id.node, $expression.node);}
        ;

catch[RecognitionException e] {throw e;}

Number
        : ('0'..'9')+ ('.' ('0'..'9')+)?
        ;

Identifier
        :('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*
        ;

WS
        :(' ' | '\t' | '\r'| '\n') -> skip
        ;
