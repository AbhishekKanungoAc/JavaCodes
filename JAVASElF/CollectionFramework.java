import java.util.*;
public class CollectionFramework {
    
    public static void main(String[] args) {
        System.out.println("Welcome to java collection framework ");
        /*Type safe collection */  // means same type of data type eg:-
        ArrayList <String> Name = new ArrayList<>();
        Name.add("Abhisehk");
        Name.add("Bhavna");
        Name.add("Manoj");
        Name.add("Prajjwal");
        System.out.println("Orignal Arraylist:-"+Name);
        System.out.println("to find ele in arraylist:-"+Name.get(1));

        Name.remove("Manoj");
        System.out.println("For remove ele:-"+Name);

        System.out.println("Size of arr list:-"+Name.size());

        System.out.println("to check ele present or not:-"+Name.contains("bhavna"));

        Name.add("Ayaz");
        System.out.println("add ele:-"+Name);

        Name.set(3, "Akku");
        System.out.println("Set any ele at ay idx:-"+Name);

        Name.clear();
        System.out.println("after clearing:-"+Name);


    }
}
