import java.util.*;
class Inp{
    int r;
    void input()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter redius of circle");
        r=sc.nextInt();
    }
    void calculate(double d)
    {
        double area;
        area=d*r*r;
        System.out.println("area of circle:"+area);//method overloading
        
    }
    void calculate() 
    {float c;
        c=(float) (3.14*2*r);
        System.out.println("area of circle:"+c);
        

    }
}

class Areaofcircle {
    public static void main(String args[])
    {
        Inp obj=new Inp();
        obj.input();
        obj.calculate(3.14);
        obj.calculate();
    }
    
}
