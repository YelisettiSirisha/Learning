package day1;

public class Globalvariables {
	
	int a=100;
	int b=20;
	void mul()
	{
		a=10;
		int b=20;
		int c=a*b;
		System.out.println(c);
	}
	
	
	
	void subtract()
	{
		int c=b-a;
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		Globalvariables g1=new Globalvariables ();
		g1.mul();
		g1.subtract();

	}

}
