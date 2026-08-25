package JAVAClg;
/*Herarchical inheritance
 *      class A
*        /   \
 * class B  class c
 * 
 *class a 
 *class b extend a 
 *class c extend a
 * 
 */
class A{
    public void methodA()
    {System.out.println("Method of class A");}
}
class B extends A{
    public void methodB()
    {System.out.println("Method of class B");}
}
class C extends A{
    public void methodC()
    {System.out.println("Method of class C");}
}
public class Oops6 {
    public static void main(String[] args) {
        
        B obj1 = new B();
        C obj2 = new C();
       
        obj1.methodA(); //obj1 se A .
        obj1.methodB();
        obj2.methodA();// obj2 se A .
        obj2.methodC();
        System.out.println(".......");
        

    }
}
