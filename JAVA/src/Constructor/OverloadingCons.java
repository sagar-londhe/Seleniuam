package Constructor;

public class OverloadingCons 
{
	
		int m,n;
		float f;
		public OverloadingCons(int a,int b)
		{
			m=a;
			n=b;
			System.out.println(m+" "+n);
		}
		public OverloadingCons(int a,float b)
		{
			m=a;
			f=b;
			System.out.println(m+" "+f);
		}
		public static void main(String[] args) 
		{
			System.out.println("Parameterized Constructor with int int");
			new OverloadingCons(10,20);
			System.out.println("Parameterized Constructor with int Float");
			new OverloadingCons(35,45.69f);
			
		}

}
