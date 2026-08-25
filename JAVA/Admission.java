import java.util.*;
class Admission
{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("enter the marks obtain in phy:");
        int phy = input.nextInt();
        System.out.println("enter the marks obtain in maths:");
        int maths = input.nextInt();
        System.out.println("enter the marks obtain in chem:");
        int chem = input.nextInt();

        int sum1 = phy+maths+chem;
        System.out.println("sum of three sub."+sum1);
        int sum2 = phy+maths;
        System.out.println("sum of two sub."+sum2);
        System.out.println();
        if (phy>=65 && maths>=55 && chem>=50)
        {
            System.out.println("candidate is eligible");//student eligible or not
        }
        else if (sum1>=190 && sum2>=140)
        {
System.out.println("candidate is eligible");
        }
        else
        {
            System.out.println("candidate is not eligible");
        }
        

    }
}