package JAVAClg;
class Employe{
    void em1(){
        System.out.println("111 RAMA");
    }
    void em2(){
        System.out.println("112 RAMO");
    }
}


public class InheritanceQ extends Employe {
    void add1(){
        System.out.println("Bhopal mp india");
    }
    void add2(){
        System.out.println("indore mp india");
    }
    public static void main(String[] args) {
        InheritanceQ obj = new InheritanceQ();
        obj.em1();
        obj.add1();
        obj.em2();
        obj.add2();
    }
}
