package day1;

public class Methodoverloading {
	static void add(int a, double b)
	{
		double c=a*b;
	System.out.println(c);	
	}
	static void add(double c,int a)
	{
		double b=a*c;
	System.out.println(b);	
	}

	public static void main(String[] args) {
		add(9.3, 100);
		add(1100,7.65);
		
		
	}

}
