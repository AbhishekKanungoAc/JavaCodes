import java.util.*;

class Cons 
{
    int f;
    Cons()
    {
      f=1;
    }
    void fact()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n =sc.nextInt(); 
       for(int i=1;i<=n;i++){
        f=f*i;}
        System.out.println("fact="+f);//find factorial using constructor
     }
    
}
class Constructor
{
    public static void main(String[] args) {
        Cons obj = new Cons();
        obj.fact();
    }
}
