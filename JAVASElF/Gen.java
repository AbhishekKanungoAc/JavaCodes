public class Gen{
    public static void main(String[] args) {
       Genric<String> G = new Genric<String>("this is genric container ");
       System.out.println(G.getValue());
       System.out.println(G.container.getClass().getName());
       G.perfome();

       
       Genric<Integer> G1 = new Genric<Integer>(123);
       System.out.println(G1.getValue());
       System.out.println(G1.container.getClass().getName());
       G1.perfome();
    }
 }