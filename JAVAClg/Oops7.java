package JAVAClg;
/*SUPER KEYWORD USE WITH VARIABLE, METHOD AND CONSTRUCTOR , WITH immidiate parent */
class Stud{
    String Name = "RAMA";
    void learning(){
        System.out.println("Learning java..");
    }
    Stud(){
        System.out.println("studying in B tech.");
    }
}
class CSE extends Stud{
    String rollno="0834cs211007";
    void printinfo(){
        System.out.println(super.Name); //print name of student by SUPER KEYWORD in child class
        System.out.println(rollno);
    }
    void skill(){
        System.out.println("knowing c c++...");
    }
    void work(){
        super.learning();   ///print with super keywor in method in child class
        skill();
    }
    CSE(){
        super();
        System.out.println("CSE class cons");//print with super constructor in child class
    }
}
public class Oops7 {
    public static void main(String[] args) {
        CSE stud1 = new CSE();
        stud1.printinfo();
        stud1.work();
    }
}
