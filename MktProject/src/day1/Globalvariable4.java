package day1;

public class Globalvariable4 
{
	
	static double pi;
	
	void area()
	{
		pi=3.143;
		int a=10;
		double area=a*a*pi;
		System.out.println(area);
	}
	

	public static void main(String[] args) 
	{
	
	Globalvariable4  g1=new Globalvariable4 ();
	g1.area();

	}

}
