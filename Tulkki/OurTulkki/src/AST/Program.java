package AST;

import java.util.Map;

public class Program extends ASTNode
{
	String name;
	VarDeclaration[] params;
	ASTNode body;

	public Program(String _name, VarDeclaration[] _params, ASTNode _body)
	{
		name = _name;
		params = _params;
		body = _body;
	}
	
	@Override
	public void typeCheck(Map<String, Type> tenv)
	{
		for (VarDeclaration v : params)
		{
			v.declare(tenv);
		}
		body.typeCheck(tenv);
	}
}
