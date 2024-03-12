package day1;

public class ConstructorandMethodOverloading {
	ConstructorandMethodOverloading()
	{
		System.out.println("This is my Constructor");
	}
	
	public static void main(String[] args) {
		
		System.out.println("This is my main method");
		add();
		ConstructorandMethodOverloading c1=new ConstructorandMethodOverloading();
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


