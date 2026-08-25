import java.util.*;
class Maxelement
{
    
    int a[] = new int[5];
    void ary()
      {
      
        Scanner sc = new Scanner (System.in);
         
        System.out.println("enter the elements:");
        for (int i=0;i<=4;i++)
        a[i]=sc.nextInt();
      }
    void max()
      {
          int temp=0;
          for (int i=0;i<=4;i++)
          {
            if (temp < a[i])
            temp=a[i];
          }
           System.out.println("maxelement="+temp);
      }
}
class Array1
 {
    public static void main(String args[])// max element in aaray
    {
        Maxelement obj =new Maxelement();
        obj.ary();
        obj.max();
    }
    
}
