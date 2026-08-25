package JAVAClg;
/*multilevel and single inheritance */
class Student{
    int MtMarks=66;
    String ani= "my puppy is ";
    String dr="dr details";
}
class Student1 extends Student{
String ani1="Eating";
String sur ="surgon details";
}

public class Oops5 extends Student1 {
    
int pyMarks = 82;

String ani2="Barking";
 public static void main(String[] args) {
Oops5 Rama = new Oops5();
System.out.println("Maths m:"+Rama.MtMarks);
System.out.println("phy:"+Rama.pyMarks);
System.out.println(Rama.ani+""+Rama.ani1);
System.out.println(Rama.ani+""+Rama.ani2);
System.out.println("dr:"+Rama.dr);
System.out.println("sur:"+Rama.sur);
 }   
}
