package AST;

import java.util.Map;

public class AssignStatement extends ASTNode
{
	String x;
	IValue e;
	
	@Override
	void typeCheck(Map<String, Type> tenv)
	{
		if (!tenv.containsKey(x))
		{
			//virheilmoitus
		}
		
		e.typeCheck(tenv);
		
		if (!e.type.canAssign(tenv.get(x)))
		{
			//virheilmoitus
		}
	}

}
