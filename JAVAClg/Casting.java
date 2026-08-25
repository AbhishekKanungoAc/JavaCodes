package JAVAClg;
/*casting types:- impli and expli */
public class Casting {
    public static void main(String[] args) {
        /*implicit */
        int i = 9;
        double d = i;
        System.out.println(i);
        System.out.println(d);
        /*explicit */
        double myd = 9.78;
        int myi = (int)myd;
        System.out.println(myd);
        System.out.println(myi);
    }
}
