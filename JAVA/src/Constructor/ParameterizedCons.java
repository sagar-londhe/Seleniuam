package Constructor;

public class ParameterizedCons
{
	int x,y;
	
	public ParameterizedCons(int a,int b)
	{
		x=a;
		y=b;
		System.out.println(x+" "+y);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Parameterized Constructor with int int");
		new ParameterizedCons(10,20);
		
		
	}

}
