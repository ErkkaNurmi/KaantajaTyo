package AST;

import java.util.Map;

public interface ASTNode
{
	public SimplestValue type = new SimplestValue();
	void typeCheck(Map tenv);
}
