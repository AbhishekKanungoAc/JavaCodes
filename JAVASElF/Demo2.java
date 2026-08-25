/*Constructor and Method  Overloadding*/
/*HAVING MULTIPLE METHODS OR CONSTRUCTOR IN SAME CLASS WITH SAME NAME....OVERLOADDING */

class Student       //class 
{
    int StudentId;
    String StudentName;
    String StudentCity;
    Student()                           //CONSTRUCTOR //Non-Parametrized Cons
    {
        System.out.println("creating cons.");
    }
    public Student(int i , String n, String c) ////Parametrized Constructor
    {
        StudentName = n;
        StudentCity=c;
        StudentId=i;

    }

    public void Study()         //method
    {
        System.out.println(StudentName+"is study");
    }

    public double Study(float f)        //method   (METHOD OVERLOADING IS ALSO KNOWN AS COMPILE TIME POLYMORPHISM)
    {
        System.out.println("second method with same name diff agr"+f);
        return f;
    }
    public void ShowFullDetailes(){
        System.out.println("name is:-"+StudentName);
        System.out.println("Id is:-"+StudentId);
        System.out.println("city is:-"+StudentCity);
    }
}
public class Demo2          //class
{
    public static void main(String[] args) {
        Student st1 = new Student(); //Object
        st1.StudentName = "abhi";
        st1.StudentId=222;
        st1.StudentCity="indore";

        st1.ShowFullDetailes();
        st1.Study(7);
        st1.Study(0);


        Student st2 = new Student(111,"bhavna","Indore"); //object

       /* st2.StudentName = "bhavna";
        st2.StudentId=111;
        st2.StudentCity="indore";
        */
        st2.ShowFullDetailes();
        st2.Study();

    }
}