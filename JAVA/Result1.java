import java.util.*;

class Student_info{
    String name;
    String bacth; 
    int enroll;
    void ip(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of student:");
        name = sc.nextLine();

        
        System.out.println("enter the class name:");
        bacth = sc.nextLine();

        System.out.println("enter the enrollment number:");
        enroll = sc.nextInt();

    }
}
class Student_marks extends Student_info{
    
    Scanner sc = new Scanner (System.in);
    int a[]=new int [5];
    int sum=0;
    int percent;
    void marks(){
        System.out.println("enter the marks of five subjects:");
        for (int i=0;i<=4;i++)
        a[i]=sc.nextInt();
  
    }
    void result()
    {
         
        for(int i=0;i<=4;i++)
        sum=sum+a[i];
        System.out.println("sum of five sub is:"+sum);
        percent = sum / 5;
        System.out.println("percent:"+percent+"%");
    }
   

}



public class Result1 {
    public static void main(String[] args) {
        Student_marks obj = new Student_marks();
        obj.ip();
        obj.marks();
        obj.result();
     
    }
    
}
