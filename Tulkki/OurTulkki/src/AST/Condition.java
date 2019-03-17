package AST;

import java.util.Map;

public class Condition extends ASTNode
{
	Value left;
	Value right;
	
	@Override
	public void typeCheck(Map<String, Type> tenv)
	{
		left.typeCheck(tenv);
		right.typeCheck(tenv);
		
		Type leftType = left.type;
		Type rightType = right.type;
		
		if (!leftType.isInt() == rightType.isInt())
		{
			if (leftType.isDouble() == !rightType.isDouble())
			{
				//virheilmoitus tänne
			}
		}
		
		this.type = new BoolType();
		
	}

}
