
public class Exceptionhandling {
    
public static void main(String[] args) {
    System.out.println("Started...");
    try{    
    int n1 =Integer.parseInt(args[0]);
    int n2 =Integer.parseInt(args[1]);
    int result = n1/n2;
    System.out.println("Division is :"+result);
    }catch(Exception e){
        System.out.println("Error!!");
        System.out.println(e.getMessage());
    }
    finally{
        System.out.println("finally block");
    }
    System.out.println("terminated..");
}    
}
