package AST;

public class DoubleType extends SimplestValue
{
	@Override
	public boolean isDouble()
	{
		return true;
	}
	
	@Override
	public boolean canAssign(SimplestValue t)
	{
		return t.isDouble();
	}
}
