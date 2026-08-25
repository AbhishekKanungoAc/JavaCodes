package JAVAClg;

import java.util.Scanner;

/*user defined methods */
public class MainMethodUeDe {
    /*No way */
    static void myMethod(){
        System.out.println("This is my Method!");
        myMethod1();
    }
    /*no way */
    static void myMethod1(){
        System.out.println("This is my sub method!");
    }
    /*one way */
    static void myMethod2(String fName){
        System.out.println(fName+" sharma");
    }
    /*one way */
    static void myMethod3(String Name , int i){
    System.out.println("name:"+Name);
    System.out.println("age: "+i);
    }

    static int myMethod4(int x , int y){
        return x+y;
    }
/*no way method (1,2,3) */
    static void fact(){
        int num,f=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("no way,enter the number:");
        num = sc.nextInt();
        for(int i=1;i<=num;i++)
        f=f*i;
        System.out.println("factorial of number is:"+f);
        System.out.println("");
    }
    
    /*one way 1a */
    static void fact1(int num,int f){
        
        for(int i=1;i<=num;i++)
        f=f*i;
        System.out.println("factorial of number is:"+f);
        System.out.println("");

    }

    /*one way 1b */
    static int fact2(int f){
        int num,f1=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        num = sc.nextInt();
        for(int i=1;i<=num;i++)
        f=f*i;
        return f;
        
    }

    /*two way  */
    static int fact3(int n,int f){
        
        for(int i=1;i<=n;i++)
        {f=f*i;}
        return f;
    }

    /*recursion */
    public static int sum(int k){
        if (k>0) {
            return k+sum(k-1);
            }
            else{
                return 0;
            }
    }


    

    public static void main(String[] args) {
        myMethod();
        myMethod2("Rama");
        myMethod3("abhishek", 22);
        System.out.println("add:"+myMethod4(5, 3));
        System.out.println("add:"+myMethod4(2,3));
        //System.out.println("add:"+myMethod4(2));


        /*no way */
        fact();
        System.out.println("");

        /*one way 1a */
        int num,f=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("fact , one way 1a,enter the number:");
        num = sc.nextInt();
        fact1(num,f);

        /*one way 1b */
        System.out.println("fact, one way 1b:"+fact2(f));
        System.out.println("");

        /*two way */
        
        int num1,f2=1;
        Scanner SC = new Scanner(System.in);
        System.out.println("enter the number:");
        num1 = SC.nextInt();
        System.out.println("two way,factorial of number is:"+fact3(num1, f2));

        /*recursion */
        int result = sum(10);
        System.out.println("result: "+result);
       

        
    }
}
