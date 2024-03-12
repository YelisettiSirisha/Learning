package day1;

public class ExamConstructorOverloading {
	ExamConstructorOverloading()
	{
		System.out.println("This is my constructor");
	}
	ExamConstructorOverloading(int a, int b, int c)
	{
		int d=a+b+c;
		System.out.println(d);
	}
	ExamConstructorOverloading(double a, int b, int c)
	{
	double d=a+b+c;
		System.out.println(d);
	}
	
	

	public static void main(String[] args) {
		
		System.out.println("This is my main method");
		
		ExamConstructorOverloading e1=new ExamConstructorOverloading ();
		new ExamConstructorOverloading ();
		new ExamConstructorOverloading(2,3,4);
		new ExamConstructorOverloading(2.3,4,5);
		
		
	}

}
