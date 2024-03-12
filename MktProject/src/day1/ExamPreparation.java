package day1;

public class ExamPreparation {
	
	ExamPreparation()
	{
		System.out.println("This is my constructor");
	}
	
	static void add()
	{
	System.out.println(0);
		
	}
	static void add(int a)
	{
		
		System.out.println(a);
	}
	void add(int a, int b,int c)
	{
	int d=a+b+c;
	System.out.println(d);
	}
	void add(int a, int b, double c)
	{
		double d=a+b+c;
		System.out.println(d);
	}

	public static void main(String[] args) {
		System.out.println("This is my main method");
		add();
		add(5);
		ExamPreparation e1=new ExamPreparation();
		e1.add(5, 6, 7);
		e1.add(3, 4, 4.3);

	}

}
