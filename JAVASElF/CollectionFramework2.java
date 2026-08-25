import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;
/*traverse example */
public class CollectionFramework2 {
    public static void main(String[] args) {
        ArrayList <String> nm = new ArrayList<>();
        nm.add("abhi");
        nm.add("bhavna");
        nm.add("sakshi");
        nm.add("manoj");
        nm.add("abhi");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        //TRAVERSING BY FOR EACH LOOP
        System.out.println("TRAVERSING BY FOR EACH LOOP");
        for (String string : nm) {
            System.out.println(string+"\t"+string.length());
        }
        System.out.println("");
        System.out.println("same but reverse");
        System.out.println("");
        for (String string : nm){
            
        StringBuffer br = new StringBuffer(string);
        System.out.print(br.reverse()); 
        System.out.println("\t"+string.length()+"\t");
    }
    
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    //TRAVERSING BY ITERATOR
    System.out.println("TRAVERSING BY ITERATOR");
        Iterator <String> itr = nm.iterator();
        while (itr.hasNext()) {
            String next = itr.next();
            System.out.println(next);
        }
        //backword 
        System.out.println("");
        System.out.println("same backword");
        System.out.println("");
        ListIterator <String> lst = nm.listIterator(nm.size());
        while (lst.hasPrevious()) {
            String sr = lst.previous();
            System.out.println(sr);
        }        
      
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    //TRAVERSING BY FOR EACH METHOD 
    System.out.println("TRAVERSING BY FOR EACH METHOD");
    nm.forEach(e->{
        System.out.println(e);
    });
    
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    TreeSet <String> set = new TreeSet<>();
    set.addAll(nm);
    set.forEach(e->{
        System.out.println(e);
    });


    }
    
}
