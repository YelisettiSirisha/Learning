package day1;

public class Stringfunctions 

{

	public static void main(String[] args)
	
	{
		String input="My name is Ram";
		System.out.println(input.toUpperCase());
		String input1="My name is Suresh";
		System.out.println(input1.toLowerCase());
		System.out.println(input.equals(input1));
System.out.println(input.equalsIgnoreCase(input1));
String a= "Ram";
String b="ram";
System.out.println(a.equals(b));
System.out.println(a.equalsIgnoreCase(b));
String c="Palindrome";
System.out.println(c.substring(5));
System.out.println(c.substring(2, 6));
System.out.println(c.endsWith("Z"));
	}

}
