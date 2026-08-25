/*Abstract Method */

abstract public class Abstraction {
    //complete Method
    public void cal(){
        System.out.println("calculating result");
    }
    //abstract Method
    abstract public void launchRocket();
}//abstract class can not be instantianed

 class mychild extends Abstraction{
    
    public void launchRocket(){
        System.out.println("launched");
    }
    public static void main(String[] args) {
        Abstraction obj = new mychild();
        obj.cal();
        obj.launchRocket();
    }
}


