package JAVAClg;
import java.util.Scanner;
public class ControlFlowStatements {
    public static void main(String[] args) {
        /*if statement  */
        /*addition */
     Scanner sc = new Scanner(System.in);   
     System.out.println("enter the value of x:");
     int x = sc.nextInt();   
       
     System.out.println("enter the value of y:");     
     int y = sc.nextInt();   
      

     int sum = x+y;
     if (sum>20) {
        System.out.println("x+y is grater then 20");
     }
     else{
        System.out.println("x+y is less then 20");
     }
     System.out.println("enter the no.:");
     
/*check number is even or odd */
    int n = sc.nextInt();
    if (n%2==0) {
        System.out.println(n+" number is even");

    }
    else{
        System.out.println(n+" number is odd");
    }
    if (n>0) {
        System.out.println(n+" is positiv number");
    }
    else{
        System.out.println(n+" is negative number");
    }
     
/*leder if else */
    System.out.println("enter the value of N:");
    int N = sc.nextInt();
    if (N==0) {
        System.out.println("N is Zero");
        
    }
    else if(N>0){
        System.out.println("N is Greater then Zero");
    }
    else{
        System.out.println("N is lesser the Zero");
    }

/* biggest */
int a,b,c;
System.out.println("enter the value of a:");
a=sc.nextInt();

System.out.println("enter the value of b:");
b=sc.nextInt();

System.out.println("enter the value of c:");
c=sc.nextInt();

if (a>b && a>c) {
    System.out.println("a is biggest");
}
else if (b>a && b>c) {
    System.out.println("b is biggest");

}
else{
    System.out.println("c is biggest");
}
/*mini mumn args */

System.out.println("p,q,r:");
int p = sc.nextInt();
int q = sc.nextInt();
int r = sc.nextInt();

int big = p;
if(q>big){big=q;}
if(r>big){big=r;}

System.out.println("the biggest element is "+big);

/*grade */
int sub[]= new int[4];
System.out.print("Enter the marks of Four Subjects:");
         for (int i=0;i<=3;i++){
         sub[i]=sc.nextInt();
         }
         int Total=0;
         for (int i=0;i<=3;i++){
            System.out.print(sub[i]+" ");
            Total+=sub[i];
        }
        int marks = Total/4;

if(marks>=70){
    System.out.println("A grade");
}
else if(marks>=50){
    System.out.println("B grade");
}
else if(marks>=30){
    System.out.println("C grade");
}
else {
    System.out.println("D grade");
}

/*while loop */

int i=1;
while (i<=5) {
    System.out.println(i);
    i++;
}

/*Do while */
do{
    System.out.println(i);
    i++;
}while(i<=5);

/*wpjp to read any five num and disply sum */
/*read any number and displya in any order */




}
}
