import java.util.*;
public class CollectionFramework3 {
    public static void main(String[] args) {
        HashMap <String,Integer> Courses = new HashMap<>();
        Courses.put("core java", 4000);
        Courses.put("adv java", 5000);
        Courses.put("py", 3000);
        Courses.put("android", 3000);
        Courses.put("android", 2000); /*duplicate keys are not allowed */
        System.out.println(Courses);
        Courses.forEach ((e1,e2)->{
            System.out.println(e1+"=>"+e2);}
            );

            System.out.println("price for enter the course:"+Courses.get("py"));
    }
    
}
