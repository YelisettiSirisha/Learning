package day1;

public class MethodOverloading3 {
	void add(int a, int b, double c)
	{
		double d=a*b*c;
		System.out.println(d);
	}
	void add(double a,int b, int c)
	{
		System.out.println(2);
	}
	void add(int a,double b, int c)
	{
		System.out.println(3);
	}
	static void add(String a, char b)
	{
	System.out.println(4);	
	}
	static void add(char a , char b)
	{
		System.out.println('a');
	}
	

	public static void main(String[] args) {
		MethodOverloading3 m1= new MethodOverloading3 ();
		m1.add(1, 2, 0.3);
		m1.add(0.3, 10, 3);
		m1.add(4, 0.3, 9);
		add("Sirisha", 'A');
		add('B', 'C');
	}

}
