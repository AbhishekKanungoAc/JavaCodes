import java.util.*;
class Input
{
    double pi;
void radius(double r)
{
pi=3.14;
r=pi*r*r;
System.out.println("area."+r);// to check this code ..ans nhi dera
}
void circum(double r)
{
    double c;
    pi=3.14;
    c=2*pi*r;
    System.out.println("circum."+c);
}
void circum(float r)
{
    double c;
    pi=3.14;
    c=pi*r*r;
    System.out.println("area."+c);
}}

class Polymorphism
{
    public static void main(String args[])
{
    Input obj = new Input();
    Scanner sc = new Scanner (System.in);
    System.out.println("enter num");
    float num = sc.nextFloat();
    double r;
    r=num;
    obj.radius(num);
    obj.circum(num);

    obj.circum(r);

}
}

    

