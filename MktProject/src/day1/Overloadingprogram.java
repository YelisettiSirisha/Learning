package day1;

public class Overloadingprogram {
	void add (int a)
	{
	
		System.out.println(a);
	}
	void add(int a ,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	static void add(double a ,int b,int c)
	{
		double d=a+b+c;
		System.out.println(d);
	}
	static void add(String a , char b)
	{
		String c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		Overloadingprogram o1= new Overloadingprogram();
		o1.add(100);
		o1.add(10,10);
		add(0.2, 10, 10);
		add("Siri", 'A');
		
	}

}
