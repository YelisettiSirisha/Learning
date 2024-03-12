package day1;

import java.util.Scanner;

public class scannerarecircle {
	static double pi;// declared
	public static void main(String[] args) {
		Scanner S1 = new Scanner(System.in);
		System.out.print("Enter the r value: ");
		double r = S1.nextDouble();
		System.out.print("Enter the pi value: ");
		double pi = S1.nextDouble();
		
		double area=pi*r*r;
		System.out.println(area);
	}

}
