package AST;

import java.util.Map;

public class ForStatement extends ASTNode
{
	Type loop;
	ASTNode body;

	
	@Override
	public void typeCheck(Map tenv)
	{
		if (!loop.isInt())
		{
			//virheilmoitus
		}
		body.typeCheck(tenv);
	}

}
