package day1;

public class ConstructorDifferenttyes {
	ConstructorDifferenttyes(){
		System.out.println("This is my Constructor");

	}

	public static void main(String[] args) {
		System.out.println("This is my main method");
		ConstructorDifferenttyes c1=new ConstructorDifferenttyes();
		new ConstructorDifferenttyes(5);
		new ConstructorDifferenttyes('s');
		new ConstructorDifferenttyes(true);
		new ConstructorDifferenttyes("Sirisha");
	}
	ConstructorDifferenttyes(int a){
		System.out.println("This is my interger Constructor");
	}
	ConstructorDifferenttyes(String a){
		System.out.println("This is my String Constructor");
	}
	ConstructorDifferenttyes(boolean a){
		System.out.println("This is my Boolean Constructor");
	}
		ConstructorDifferenttyes(char a){
			System.out.println("This is my Character Constructor");

	}

}
