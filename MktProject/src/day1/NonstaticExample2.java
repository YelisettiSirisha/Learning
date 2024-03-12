package day1;

public class NonstaticExample2 {
	static void apple() {
		System.out.println("Apple");
	}
	static void banana() {
		System.out.println("Banana");
	}
	void custardapple() {
		System.out.println("CustardApple");
	}
	void delhi() {
		System.out.println("Delhi");
	}
	

	public static void main(String[] args) {
		System.out.println("Software testing by MKT");
		NonstaticExample2 c1=new NonstaticExample2 ();
		c1.custardapple();
		c1.delhi();
		apple();
		banana();

	}

}
