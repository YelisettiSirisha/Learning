package day1;

public class Nestedif1 {

	public static void main(String[] args) {
		int a = 200;
		int b = 300;
		int c = 500;
		if (a < b) {
			if (a < 500) {
				if (a < 1000)

				{
					System.out.println("logic1");
				}

				else {
					System.out.println("logic2");

				}

			} else {
				System.out.println("logic3");
			}
		} else {
			System.out.println("logic4");
		}
	}

}
