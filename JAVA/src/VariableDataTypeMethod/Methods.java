package VariableDataTypeMethod;

public class Methods
{
	public void InstMeth()
	{
		System.out.println("IN Instance method");
		InstMeth2();
	}
	public void InstMeth2()
	{
		System.out.println("IN Instance method2");
		
	}
	public static void StatMeth()
	{
		System.out.println("IN Static method");
		
	}
	public static void StatMeth2()
	{
		System.out.println("IN Static method2");
	}
	
	public static void main(String[] args)
	{
		Methods m=new Methods();
		m.InstMeth();
		StatMeth();
		StatMeth2();
		
		
	}
}
