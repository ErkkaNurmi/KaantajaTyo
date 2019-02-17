package AST;

public class Program {
	String name;
	String[] params;
	String[] vars;
	String[] body;
	
	public Program(String _name, String[] _params, String[] _vars, String[] _body)
	{
		name = _name;
		params = _params;
		vars = _vars;
		body = _body;
	}
	
	//type check
	public void typeCheck()
	{
		
	}
}
