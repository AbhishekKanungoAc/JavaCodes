import java.util.*;
public class Ifelse4
 {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter any char");
        char ch=sc.next().charAt(0);
        if(ch=='a'||ch=='A'||ch=='e'||ch == 'E' || ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
        System.out.println("enter char is vowel");
        else
        System.out.println("enter char is consonent");//vowleandconsonent
        


        
    }
}
