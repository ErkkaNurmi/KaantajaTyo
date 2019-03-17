package AST;

import java.util.Map;

public class VarDeclaration
{
	String name;
	Type type;
	
	public VarDeclaration(String _name, Type _type)
	{
		name = _name;
		type = _type;
	}
	
	public void declare(Map<String, Type> type_env)
	{
		if (type_env.containsKey(name))
		{
			//T‰ss‰ pit‰isi heitt‰‰ virheen
		}
		else
		{
			type_env.put(name, type);
		}
	}
}
