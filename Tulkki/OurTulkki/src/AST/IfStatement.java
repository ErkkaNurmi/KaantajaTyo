package AST;

import java.util.Map;

public class IfStatement extends ASTNode
{
	IValue iF;
	IValue then;
	IValue els;
	
	public IfStatement(IValue _if, IValue _then, IValue _else)
	{
		iF = _if;
		then = _then;
		els = _else;
	}
	
	public void typeCheck(Map tenv)
	{
		iF.typeCheck(tenv);
		if (!iF.type.isBool())
		{
			//exception here
		}
		then.typeCheck(tenv);
		if (els != null) els.typeCheck(tenv); 
	}

}
