package day1;

public class Notandandor {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		if(a>10 || b>=a)// or operator
		{
			int sum=100+a+b;
			System.out.println(sum);

	}
		
		if(a>5 && b>=a)// and operator
		{
			int sum=100-a-b;
			System.out.println(sum);
			
		}
			if(!(a>10 || b>=a))// or with not operator
			{
				int sum=111+a+b;
				System.out.println(sum);

		}
			
			if(!(a>5 && b>=a))// and with not operator
			{
				int sum=110-a-b;
				System.out.println(sum);
		
		}
	}
}
	



	


