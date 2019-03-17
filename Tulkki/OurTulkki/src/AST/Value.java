package AST;

import java.util.Map;

public class Value extends IValue
{

	@Override
	public boolean canAssign(Type t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	void typeCheck(Map<String, Type> tenv) {
		// TODO Auto-generated method stub
		
	}

}
