package day1;

public class Globalvariable 
{
	int a=100;//global
	void add()
	
	{
		 a=10;
		int b=90;//local
		System.out.println(a+b);
	}
	
	static void subtraction()
	{
		int a=10;
		int b=90;//local
		System.out.println(a+b);
		
	}
	
	public static void main(String[] args) 
	{
		Globalvariable  g1=new Globalvariable ();
		g1.add();
		
		subtraction();

	}

}
