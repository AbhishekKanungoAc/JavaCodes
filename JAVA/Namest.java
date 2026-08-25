import java.util.*;
public class Namest
{
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    String name = "abhi";
    // name = sc.nextLine();
    // String name2String = new String();
    // name="abhishek kanungo";
    System.out.println("enter the confname :");// string code with passwaord
    String confname = new String ();
    confname = sc.nextLine();

    if (name.equals(confname))
    {
    System.out.println("enter the passward:");
    String Pass = new String();
    Pass = sc.next();
    System.out.println("enter the  confirm passward:"); 
    String confPass = new String();
    confPass = sc.next();
    System.out.println("pass: "+Pass);
if(Pass.equals(confPass))
{
    System.out.println("succefuly login");
}
else {
    System.out.println("pass error");
} 
}
else{
    System.out.println("name error");
}





}    
}
