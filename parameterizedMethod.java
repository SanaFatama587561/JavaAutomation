package Javabasics;

public class parameterizedMethod {
	
	public static void main(String [] args) {
		
	user("Test");
	user("Sana");
	user("ABC");
	intro("ABC",21);
	
	}

	
	public static String user(String name) {
		
		
		System.out.println("My name is  "+name);
		
		return "Thanks";
		
	}
	
 public static void intro(String name,int age){
	 System.out.println("Hello my name is " + name+  " And my age is "+ age);
	 
 }
	
}
