import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
public class CollectionFramework1 {
    
    public static void main(String[] args) {
        System.out.println("Welcome to java collection framework ");
        /*Type safe collection */  // means same type of data type eg:-
        LinkedList List = new LinkedList<>();
        List.add(123);
        List.add("abhishek");
        List.add(145.555);
        List.add(0);
        System.out.println("Orignal List:-"+List);
        System.out.println(" //for find out ele:-"+List.get(1));

        List.remove(145.555); 
        System.out.println("//for remove ele:-"+List);

        System.out.println("Size:-"+List.size()); 

        System.out.println("is there ele present:-"+List.contains("abhishek")); 

        List.add("bhavna"); 
        System.out.println("// to add ele:-"+List);

        List.set(2, "manoj");
        System.out.println(" // to set value at any idx:-"+List);

        //List.clear();
        //System.out.println("after clear list:-"+List);

        HashSet <Double> nms =  new HashSet<>(); /// in HASHSET DUPLICATES ARE NOT ALLOWED
        nms.addAll(List);
        System.out.println("hashset num:-"+nms);

        nms.add((double) 123);
        System.out.println(nms);


        TreeSet <Double> tset = new TreeSet<>();// tree set sorted array milata h /*isme nhi chl ra alg se code krna  */
        tset.addAll(nms);
        System.out.println("treeset test print:-"+nms);

        tset.add(5.30);
        System.out.println("add:-"+tset);
        
    
    }
}
