package day1;
public class ConstructorExample 
{
	ConstructorExample()//This is my constructor
	{
		System.out.println("This is my constructor");
	}
	public static void main(String[] args) { 
		System.out.println("This is my main method");
		add();
		ConstructorExample c1= new ConstructorExample ();
		c1.Subtract();
		
		
	}
	static void add()//Static method
	{
	System.out.println("This is my static method");
	
	}
	void Subtract() //non static method
	{
		System.out.println("This is my nonstatic method");
	}
	
	}


