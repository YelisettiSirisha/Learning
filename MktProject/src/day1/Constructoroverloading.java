package day1;

public class Constructoroverloading {
	
	Constructoroverloading()
	{
		System.out.println(1);
	}
	Constructoroverloading(int a)
	{
		int c=a+9;
		System.out.println(c);
	}

	public static void main(String[] args) {
		new Constructoroverloading();//with parameter
		new Constructoroverloading(9);//without parameter
	}

}
