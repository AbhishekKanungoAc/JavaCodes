import java.util.*;
class Equql{
    void check(int x,int y, int z){
        if(x==y && y==z && z==x){
            System.out.println("all numbers are equal");
        }
        else if (x==y){
            
            System.out.println("x and y are equal");
        }
        else if (y==z){
            
            System.out.println("y and z are equal");
        }
        else if (z==x){
            
            System.out.println("z and x are equal");
        }
        else {
            System.out.println("all numbers are diif.");
        }
    }
}
public class Ifelse8 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first num:");
        a = sc.nextInt();
        System.out.println("enter the second num:");
        b = sc.nextInt();
        System.out.println("enter the third num:");
        c = sc.nextInt();

        Equql obj = new Equql();
        obj.check(a, b, c);
        
    }
}
