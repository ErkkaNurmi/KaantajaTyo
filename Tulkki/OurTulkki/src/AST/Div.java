package AST;

import java.util.Map;

public class Div extends Arithmetic
{
	@Override
	public void typeCheck(Map<String, Type> tenv)
	{
		left.typeCheck(tenv);
		right.typeCheck(tenv);
		Type leftType = left.type;
		Type rightType = right.type;
		if (leftType.isInt())
		{
			if (rightType.isInt())
			{
				type = rightType;
			}
			else if (rightType.isDouble())
			{
				type = rightType;
			}
		}
		else if (leftType.isDouble())
		{
			type = leftType;
		}
		else
		{
			//Tähän virheilmoitus
		}
		type = new DoubleType();
	}
}
