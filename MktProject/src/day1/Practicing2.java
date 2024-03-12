package day1;

public class Practicing2 {
	static void add()
	{
		System.out.println("This is my static method");
	}

	static void subtract()
	{
		System.out.println("This is my subtract static method");
	}
	
	void multiply()
	{
		System.out.println("This is non static method");
	}
	
	
	public static void main(String[] args) {
		System.out.println("This is my main method");
		add();
		subtract();
		Practicing2 m1=new Practicing2();
		m1.multiply();
		
		
	}

}
