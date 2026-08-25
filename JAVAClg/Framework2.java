package JAVAClg;
import java.util.Queue;
import java.util.LinkedList;

public class Framework2 {
    public static void main(String[] args) {
        Queue<String> L = new LinkedList<>(); // Correct instantiation
        
        // Add elements to the queue
        L.add("Element 1");
        L.add("Element 2");

        // Print the queue
        System.out.println(L);
    }
}
