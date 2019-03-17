package AST;

public class DoubleType extends Type
{
	@Override
	public boolean isDouble()
	{
		return true;
	}
	
	@Override
	public boolean canAssign(Type t)
	{
		return t.isDouble();
	}
}
