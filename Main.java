public class Main{
    public static void main(String[]args){
        Main a1=new Main();
        a1.add(10,12);
        a1.info("ABC", 3);
        
    }

    public int add(int a,int b){
        int c;
        c=a+b;
        System.out.println("Addition is "+ c);
        return c;
        
    }
    
    public void info(String name,int id){
        System.out.println("Name is "+ name + "and Id is "+ id);
    }
}