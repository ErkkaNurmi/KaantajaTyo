package AST;

public class IntType extends Type
{
	@Override
	public boolean isInt()
	{
		return true;
	}
	
	@Override
	public boolean canAssign(Type t)
	{
		return t.isInt() || t.isDouble();
	}
	
}
