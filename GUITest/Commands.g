grammar Commands;

cmds returns [LOGOCommand cmd]
	: 'FD' a=arg {$cmd = new LOGOFD(); $cmd.reset(); $cmd.addArg($a.value);}
	| 'LT' a=arg {$cmd = new LOGOLT(); $cmd.reset(); $cmd.addArg($a.value);}
	| 'RT' a=arg {$cmd = new LOGOLT(); $cmd.reset(); $cmd.addArg(-$a.value);}
	;

arg returns [double value]
	: n=Number {$value = Double.parseDouble($n.text);}
	;
	
Number
    :    ('0'..'9')+ ('.' ('0'..'9')+)?
    ;

WS  
    :   (' ' | '\t' | '\r'| '\n') //{$channel=HIDDEN;}
    ;
