package day1;

public class Combination {
	
	Combination()
	{
		System.out.println("This is a non parameterized constructor");
	}
	
	Combination(int a )
	{
		
		
		System.out.println("This is a  parameterized constructor");
}
	static void add()
	{
		System.out.println(1);
	}
	static void add(int a )
	{
		System.out.println(2);
	}
	void add (int a, int b)
	{
		System.out.println(3);
	}
	public static void main(String[] args) {
		Combination c1=new Combination ();
		
		new Combination(5);
		 add();
		 add(5);
		 c1.add(5, 3);
		
		
		
	}
	}


