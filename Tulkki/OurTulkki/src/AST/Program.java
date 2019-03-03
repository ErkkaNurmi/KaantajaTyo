package AST;

import java.util.Map;

public class Program implements ASTNode
{
	String name;
	String[] params;
	String[] body;
	
	public Program(String _name, String[] _params, String[] _body)
	{
		name = _name;
		params = _params;
		body = _body;
	}
	
	@Override
	public void typeCheck(Map tenv)
	{
		
	}
}
