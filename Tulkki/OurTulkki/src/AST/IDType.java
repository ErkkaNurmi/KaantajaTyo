package AST;

public class IDType extends SimplestValue
{
	String name;
	
	@Override
	public boolean isID()
	{
		return true;
	}
	
	/*
	SimplestValue type;
	
	public IDType(String _name, SimplestValue _type)
	{
		name = _name;
		type = _type;
	}
	
	@Override
	public boolean isInt()
	{
		return type.isInt();
	}
	
	@Override
	public boolean isDouble()
	{
		return type.isDouble(); 
	}*/
}
