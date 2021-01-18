package Javabasics;


public class methods1 {
	
	static int a =20;
	static int b=30;
	static int c;
	
	public static void main(String[] args) {
		
		Addition();
		Subtraction();
		Division();
		Multiplication();
	}
	
	
public static void  Addition() {
	
	
	c= a+b;
	
	System.out.println("Addition is " +c);

}
public static void  Subtraction() {
	
	
	c= a-b;
	
	System.out.println("Subtraction is " +c);

	

}
public static void  Division() {
	
	c= a/b;
	
	System.out.println("Division is " +c);

	
}

public static void  Multiplication() {
	
	c= a*b;
	
	System.out.println("Multiplication is " +c);

}
}