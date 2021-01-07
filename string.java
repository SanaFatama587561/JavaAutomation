package Javabasics;

public class string {

	public static void main(String[] args) {
		String ABC= "I am test program";
		
		ABC.length();
		
		System.out.println("Leangth of string is "+ABC.length());
		System.out.println("Upper case of string is "+ABC.toUpperCase());
		System.out.println("lower case of string is "+ABC.toLowerCase());
		System.out.println("Indexh of character\"M\" is "+ABC.indexOf("m"));
		
		System.out.println("SubString of string is "+ABC.substring(2,9));
		
		String ABCD = "I am \"Strings\"";      // Escape character 
		System.out.println(ABCD);
		
		String Z = ABCD + ABC;
		
		System.out.println("Concatenation of two strings" + Z);
		
	}
	
	
}
