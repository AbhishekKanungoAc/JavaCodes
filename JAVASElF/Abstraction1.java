/*Interface Method */
public interface Abstraction1 {
    public static final int i=35;
    public abstract void calculateArea(int r);
}
class Circle implements Abstraction1 {
    public void calculateArea(int r){
        System.out.println("Area:"+(Math.PI*r*r));
    }
    public static void main(String[] args) {
      Abstraction1 a1 = new Circle();
      a1.calculateArea(2);
}

}
