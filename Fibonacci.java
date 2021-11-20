public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		  
        int i=1, num1=0, num2=1,count=10;
        
        int sum;
        
        System.out.println(num1);
        System.out.println(num2);
        while(i<=count){
       
        sum = num1+num2;
        num1=num2;
        num2=sum;
        System.out.println(sum);
         i++;
        }
        
	}
}
