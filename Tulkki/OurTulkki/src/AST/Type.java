package AST;

import java.util.Map;

public class Type
{
	public boolean isInt()
	{
		return false;
	}
	public boolean isBool()
	{
		return false;
	}
	public boolean isDouble()
	{
		return false;
	}
	
	public boolean canAssign(Type t)
	{
		return false;
	}
}
