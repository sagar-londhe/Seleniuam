package Constructor;

public class DefaultCons 
{
	int a;
	float b;
	char ch;
	public DefaultCons()
	{
		System.out.println("Default Constructor called");
		a=10;
		b=45.6f;//Initializing instance variables 
		ch='s';
		InstMeth();//Calling Instance method from Constructor 
	}
	public void InstMeth()
	{
		System.out.println("In Instance Method:"+b);
		
	}
	public static void main(String[] args) 
	{
		DefaultCons dc=new DefaultCons();//constructor called 
		System.out.println("In Main Method:"+dc.ch);
	    
	    dc.InstMeth();
	}

}
