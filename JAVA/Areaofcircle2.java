import java.util.*;

class Areac 
{
double pi;
double r;
Areac()    
{
    pi=3.14;
}
void Circle()
{
    double area;
    
Scanner sc = new Scanner (System.in);
System.out.println("ënter the radius:");// with constructor
 r = sc.nextInt();
area =pi*r*r;
System.out.println(+area);

}
void Circum()
{
    double circumfrence;
    circumfrence=2*pi*r;
    System.out.println("circumfrence:"+circumfrence);

}
}
class Areaofcircle2
{
    public static void main(String[] args) {
        Areac obj = new Areac();
        obj.Circle();
        obj.Circum();
    }
}
