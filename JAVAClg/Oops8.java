package JAVAClg;
//* Method Overriding */
/*(IT IS ALSO KNOWN AS RUNTIME POLYMORPHISM) */

class Overr {
    //Overriden Method
    public void m1(){
        System.out.println("i am the m1() of parent class");
    }
    
}

class Oops8 extends Overr{
    //overriding Method
    public void m1(){
        System.out.println("i am m1() of child");
    }

    public static void main(String[] args) {
        Oops8 ch1 = new Oops8();
        ch1.m1();
        
    }

}


