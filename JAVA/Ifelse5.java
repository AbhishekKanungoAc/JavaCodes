import java.util.*;
class Max{
    void check(int x, int y,int z){
        if (x>y && x>z) {
            System.out.println(x+" is max num");
        }
        else if (y>x && y>z)
        {
            System.out.println(y+" is max num");
        }
        else {
            System.out.println(z+" is max num");
        }
                    
    }
}



public class Ifelse5 {
public static void main(String[] args) {
    int a,b,c;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value of a:");
    a = sc.nextInt();
    System.out.println("enter the value of b:");
    b = sc.nextInt();
    System.out.println("enter the value of c:");
    c = sc.nextInt();

    Max obj = new Max();
    obj.check(a, b, c);
}    
}
