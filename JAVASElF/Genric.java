import java.util.*;

public class Genric<T> {
     T container ;

     public Genric( T container){
        this.container = container;
     }
     public Object getValue(){
        return this.container;
     }
     public void perfome(){
      if (container instanceof String) {
         System.out.println("Length of"+container+" is "+(((String)this.container).length()));
      }
      else if (container instanceof Integer) {
         System.out.println("this is in value "+container);
      }
     }
}

