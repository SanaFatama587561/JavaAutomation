package Javabasics;

public class FirstClassJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("My first class Java");
		
		//Concatenation
      String str1="Java";
      String str2 ="Learn";
      
      int a =10;
      int b= 20;
      
      System.out.println(str1+ " "+str2 );
      System.out.println(a+b+str1+" "+str2);
      System.out.println(str1 + " "+str2 + a + b); // This will give output as "Java Learn1020" as it assumes a and b as strings.
		
      // If Condition
      if(a==20)
    	  System.out.println("A is equal to 20 ");
      else
    	  System.out.println("A is not equal to 20 the value of A is :"+a);
      
      //Switch case 
      int d = 4;
      switch(d)
      {
      case 1 :
    	  System.out.println("Today is Monday");
    	  break;
      case 2:
    	  System.out.println("Today is Tuesday");
    	  break;
    	  
      case 3:
    	  System.out.println("Today is Wednesday");
    	  break;
    
      case 4:
    	  System.out.println("Today is Thursday");
    	  break;	
    	  
      case 5 :
    	  System.out.println("Today is Friday");
    	  break;
    	  
      case 6 :
    	  System.out.println("May be its Weekend");
      
      
	}

}
}