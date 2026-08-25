/*Class and Object */


class Student       //class 
{
    int StudentId;
    String StudentName;
    String StudentCity;

    public void Study(){
        System.out.println(StudentName+"is study");
    }
    public void ShowFullDetailes(){
        System.out.println("name is:-"+StudentName);
        System.out.println("Id is:-"+StudentId);
        System.out.println("city is:-"+StudentCity);
    }
}
public class Demo          //class
{
    public static void main(String[] args) {
        Student st1 = new Student(); //Object
        st1.StudentName = "abhi";
        st1.StudentId=222;
        st1.StudentCity="indore";

        st1.ShowFullDetailes();
        st1.Study();


        Student st2 = new Student(); //object
        st2.StudentName = "bhavna";
        st2.StudentId=111;
        st2.StudentCity="indore";

        st2.ShowFullDetailes();
        st2.Study();

    }
}