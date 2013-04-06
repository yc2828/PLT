grammar Grammar;

expression  returns [LOGONode node]
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
