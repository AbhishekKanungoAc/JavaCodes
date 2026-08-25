/* Method Overriding */
/*(IT IS ALSO KNOWN AS RUNTIME POLYMORPHISM) */

public class Overriding {
    //Overriden Method
    public void m1(){
        System.out.println("i am the m1() of parent class");
    }
    
}

class Child extends Overriding{
    //overriding Method
    public void m1(){
        System.out.println("i am m1() of child");
    }

    public static void main(String[] args) {
        Child ch1 = new Child();
        ch1.m1();
        
    }

}


