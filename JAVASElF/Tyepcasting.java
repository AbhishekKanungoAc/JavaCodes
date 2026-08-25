public class Tyepcasting {
    public static void main(String [] args){
        /*Automatically :- implicit type casting */
        int i=50;
        double d =i;
        System.out.println("int :"+i);
        System.out.println("double:"+d);


        /*Forcefully :- explicit type casting */
        double myval = 34.50;
        int myint = (int)myval;
        System.out.println("double value:"+myval);
        System.out.println("int value:"+myint);
    }
}
