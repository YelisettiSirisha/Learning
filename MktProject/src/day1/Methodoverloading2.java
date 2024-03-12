package day1;

public class Methodoverloading2 {

	void add(int a)
	{
		
	System.out.println(a);	
	}
	void add(double b ) 
	{
	System.out.println(9.3);
	}
	static void add(String a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Methodoverloading2 m1=new Methodoverloading2();
		m1.add(85);
	m1.add(95.3);
		add("Sirisha");
		
		
	}

}
