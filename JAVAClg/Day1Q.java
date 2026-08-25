package JAVAClg;
public class Day1Q {
    public static void main(String[] args) {
       
        /*swaping */
        int a =10,b=20,temp;
        System.out.println("befor"+a +" and "+b);
        temp = a;
        a=b;
        b=temp;
        System.out.println("after:"+a +" and "+b);

        /*AREA OF CRLC */
        float r=2.5f;
        System.out.println("area:" +(3.14*r*r));

        /*SQ ROOT */
        double sq ;
        sq = Math.sqrt(5);
        System.out.println("sq root of "+sq+" is :"+sq);

        /*power */
        double p ;
        p = Math.pow(10, 2);
        System.out.println("power:"+p);

        /*join two string */
        String str1,str2;
        str1="welcome";
        str2="java";
        System.out.println("join string is:"+str1+" "+str2);

        /*average of number. */
        System.out.println("Average of 5,10,15,20,25 is:-"+(5+10+15+20+25)/5);
        
        /*simple sum by print fun */
        int c=10+20,d=20-10;
        System.out.println("welcome to DAA training");
        System.out.println("10+20=30");
        System.out.println("10+20="+(10+20));
        System.out.println("10+20="+c);
        System.out.println("20-10="+d);

        /*incremnt */
        int x =10;
        System.out.println(((x++) +(++x) ));

        /*decrmnt */
        int y=10;
        System.out.println(((--y)-(y--)));

        



    }
}
