package VariableDataTypeMethod;

public class Varibales 
{
	int inst1=10;
	int inst2=20;
	static int st1=30;
	static int st2=40;
	public void Test1()
	{
		System.out.println("----------In Instance method-----------");
		System.out.println("inst1 In Instance Area:"+ inst1);
		System.out.println("inst2 in In Instance Area:"+ inst2);
		System.out.println("st1 In Instance Area:"+ st1);//We can Access static var in instance area by using direct variable name or 
		System.out.println("st2 In Instance Area:"+Varibales.st2);//by using class name
		
	}
	public static void main(String[] args) 
	{
		Varibales v=new Varibales();
		System.out.println("----------In Static method-----------");
		System.out.println("inst1 In Static Area:"+v.inst1);//its mandatory to create Object of class to access in static area
		System.out.println("inst1 In Static Area:"+v.inst2);
		System.out.println("st1 In Static Area:"+ st1);
		System.out.println("st2 In Static Area:"+ st2);
		v.Test1();
	}
	

}
