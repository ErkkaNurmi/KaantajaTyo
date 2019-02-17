package AST;

import java.util.Dictionary;
import java.util.Map;

public class VarDeclaration
{
	String name;
	String type;
	
	public VarDeclaration(String _name, String _type)
	{
		name = _name;
		type = _type;
	}
	
	public void declare(Map<String, String> type_env)
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
	
	public void setValue(Map<String, String> env, String valueString)
	{
		env.put(name, valueString);	//MUUTA!!!
	}
}
