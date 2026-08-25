import java.util.*;
class Add{
    int a,b,s;
    void input()
      {
        Scanner sc = new Scanner(System.in);    
        System.out.println("enter the first number: ");
        a=sc.nextInt();
        System.out.println("enter the second number: ");
        b=sc.nextInt();
      }    
    void sum(){

        s=a+b;
        System.out.println("sum of two number is:"+s);
    }

}
public class Addition1 {
public static void main(String[] args) {
 
    Add obj = new Add();
    obj.input();
    obj.sum();
    
}
    
}