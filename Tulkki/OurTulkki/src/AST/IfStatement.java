package AST;

import java.util.Map;

public class IfStatement implements ASTNode
{
	ASTNode iF;
	ASTNode then;
	ASTNode els;
	
	public IfStatement(ASTNode _if, ASTNode _then, ASTNode _else)
	{
		iF = _if;
		then = _then;
		els = _else;
	}
	
	@Override
	public void typeCheck(Map tenv)
	{
		iF.typeCheck(tenv);
		if (!type.isBool())
		{
			//exception here
		}
		then.typeCheck(tenv);
		if (els != null) els.typeCheck(tenv); 
	}

}
