package day1;

public class Practicing {
	
	Practicing()
	{
	System.out.println("This is my constructor");	
	}
	
	Practicing(int a)
	{
		System.out.println("This is my parameterized constructor with int a");
	}
	
	

	public static void main(String[] args) {
		System.out.println("This is my main method");
		new Practicing();
		new Practicing(5);

	}

}
