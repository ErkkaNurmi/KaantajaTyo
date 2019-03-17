package AST;

import java.util.Map;

public class Var extends IValue
{
	IValue id;
	@Override
	public boolean canAssign(Type t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	void typeCheck(Map<String, Type> tenv)
	{
		if (tenv.containsKey(id)) type = tenv.get(id);
		else ;//virheilmoitus
	}

}
