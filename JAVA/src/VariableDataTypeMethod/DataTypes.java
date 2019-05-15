package VariableDataTypeMethod;

public class DataTypes
{
	byte byt;
	short shrt;
	int in;
	long lng;
	float flt;
	double dbl;
	boolean boln;
	char ch;
	String str;
	public void show()
	{
		System.out.println("Byte:"+ byt);
		System.out.println("Short:"+ shrt);
		System.out.println("int:"+ in);
		System.out.println("Long:"+ lng);
		System.out.println("Float:"+ flt);
		System.out.println("Double:"+ dbl);
		System.out.println("Boolean:"+ boln);
		System.out.println("Char:"+ ch);
		System.out.println("String:"+ str);
	}
	public static void main(String[] args)
	{
		DataTypes dt=new DataTypes();
		dt.show();
	}
	
}
