package day1;

public class GlobalvarExample {
	
	
	int age;
	String name;
	double salary;
	
	void add(int age,String name,double salary)
	{
		System.out.println(age);
		System.out.println(name);
		System.out.println(salary);
	}

	public static void main(String[] args) {
		
		GlobalvarExample g1=new GlobalvarExample();
		g1.add(78, "siri", 8547.32);
		System.out.println(g1.age);
		System.out.println(g1.name);
		System.out.println(g1.salary);
		
	}

}
