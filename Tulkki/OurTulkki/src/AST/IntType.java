package AST;

public class IntType extends SimplestValue
{
	@Override
	public boolean isInt()
	{
		return true;
	}
	
	@Override
	public boolean canAssign(SimplestValue t)
	{
		return t.isInt() || t.isDouble();
	}
	
}
