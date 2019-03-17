package AST;

import java.util.Map;

public class ReturnStatement extends ASTNode
{
	ASTNode e;
	
	@Override
	void typeCheck(Map<String, Type> tenv)
	{
		e.typeCheck(tenv);
	}

}
