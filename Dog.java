package Javabasics;

public class Dog {
	String name = "Doggie";
	int hieght = 5;
	String breed = "Bulldog";

	public void barking() {
		System.out.println("The dog barks");
	}

	public void eating() {
		System.out.println("The dog eats");

	}
	



public static void main(String[] args) {
		// TODO Auto-generated method stub

Dog object_dog	= new Dog (); // Create an object to the class 

System.out.println("We are using object here "+object_dog.name);
}
}
