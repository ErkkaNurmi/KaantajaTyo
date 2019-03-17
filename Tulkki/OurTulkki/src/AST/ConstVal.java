package AST;

import java.util.Map;

public class ConstVal extends IValue
{
	public ConstVal()
	{
		type = new IntType();
	}
	
	@Override
	public boolean canAssign(Type t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	void typeCheck(Map<String, Type> tenv)
	{
		//Ei tee mit‰‰n
	}

}
