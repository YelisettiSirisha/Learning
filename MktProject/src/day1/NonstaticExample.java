package day1;

public class NonstaticExample {
	 

	void add() {
		System.out.println("Addition");
	}
	 void subtract() {
		System.out.println("Subtraction");
	}
	 
	 static void Multiply() {
		 System.out.println("Multiplication");
		 
	 }
	 static void Division() {
	 System.out.println("Division");}
	 public static void main(String[] args) {
	
		System.out.println("Non Static Method Program");
		NonstaticExample y1=new NonstaticExample();
		y1.add();
		y1.subtract();
		Multiply();
		Division();
}

}


