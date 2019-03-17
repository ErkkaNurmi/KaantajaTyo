package AST;

import java.util.Map;

public abstract class ASTNode
{
	public Type type;
	abstract void typeCheck(Map<String, Type> tenv);
	//toWat() ?
}
