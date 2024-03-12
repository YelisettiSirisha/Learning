package day1;

public class MultipleConstructor {
	MultipleConstructor()
	{
		System.out.println("Non parameterized constructor");
	}
	MultipleConstructor(int a)
	{
		System.out.println(" parameterized constructor with int a");
	}
	MultipleConstructor(boolean a)
	{
		System.out.println(" parameterized constructor with boolean a");
	}
	
	MultipleConstructor(char a)
	{
		System.out.println(" parameterized constructor with char a");
	}
	MultipleConstructor(String a)
	{
		System.out.println(" parameterized constructor with String a");
	}
	
	public static void main(String[] args) {
		System.out.println("This is my main method");
	
	new MultipleConstructor(5);
	new MultipleConstructor(true);
	new MultipleConstructor('A');
	new MultipleConstructor("Sirisha");
		
	}

}
