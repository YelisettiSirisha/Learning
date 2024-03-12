package day1;

public class Arithmetic {
	static void add()
	{
		System.out.println(0);
	}
	static void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);	
	}
	void add(int a, int b,int c)
	{
		int d=a+b+c;
		System.out.println(d);
	}
	
	void add (int a, int b, double c)
	{
	double d=a+b+c;
	System.out.println(d);
	}

	public static void main(String[] args) {
	  
	  System.out.println("This is my main method");
	  add();
	  add(5,4);
	  Arithmetic a1= new Arithmetic();
	  a1.add(3, 4, 5);
	  a1.add(3, 5, 0.3);
		
		
		
		
	}

}
