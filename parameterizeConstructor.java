package Javabasics;

public class parameterizeConstructor {
	public parameterizeConstructor() {       
		System.out.println("Hi,I am Constructor");  
		
		
	}
	 int rollno;
	 String name;
	 public parameterizeConstructor(int i , String n) {
		 rollno=i;
		 name=n;
	 }
		 public void display() {
			 System.out.println("Roll no is" + rollno + "Name is" + name);
			 
		 }
		 
	 
	 
public static void main(String [] args) {   
	parameterizeConstructor obj1 = new parameterizeConstructor();     
	
	parameterizeConstructor obj2 = new parameterizeConstructor(1,"Sana");
	parameterizeConstructor obj3 = new parameterizeConstructor(2,"James");
	
	obj2.display();
	obj3.display();
}
}

