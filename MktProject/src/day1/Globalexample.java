package day1;

public class Globalexample {
	
	static int a=100;
	static void add()
	{
		a=50;//updating the value
		int sum=a+10;
		System.out.println(sum);
	}
	
	static void subtract()
	{
		int a=770;
		int b=10;
		System.out.println(a-b);
		
	}

	public static void main(String[] args) {
		add();
		subtract();
	}

}
