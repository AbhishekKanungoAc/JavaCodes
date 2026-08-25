package JAVAClg;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Q no. 1 */
        System.out.println("Enter the sentence:");
        String str = sc.nextLine();
        System.out.println("Size:"+str.length());
        System.out.println("UpperCase:"+str.toUpperCase());
        System.out.println("LowerCase:"+str.toLowerCase());
        System.out.println("enter the word u want:");
        String s = sc.nextLine();
        System.out.println("Find word:"+str.indexOf(s));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        /*Q no 2 */
        System.out.println("Enter the 1st date  in formate of yyyy mm dd:-");
        int y1 = sc.nextInt();
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        
        System.out.println("Enter the 2nd date  in formate of yyyy,mm,dd:-");
        int y2 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        LocalDate date1 = LocalDate.of(y1, m1, d1);
        LocalDate date2 = LocalDate.of(y2, m2, d2);

        long TotalDays = ChronoUnit.DAYS.between(date1, date2);
        System.out.println("TOTAL DAYS BETWEEN"+date1+" AND "+date2+" is:="+TotalDays+"Day");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        /*Q no 3*/
        
        System.out.println("Enter the 1st time  in formate of hh mm ss:-");
        int H1 = sc.nextInt();
        int M1 = sc.nextInt();
        int S1 = sc.nextInt();
        
        System.out.println("Enter the 2nd time  in formate of hh mm ss:-");
        int H2 = sc.nextInt();
        int M2 = sc.nextInt();
        int S2 = sc.nextInt();
        LocalTime time1 = LocalTime.of(H1, M1, S1);
        LocalTime time2 = LocalTime.of(H2, M2, S2);
        long TotalTime = ChronoUnit.HOURS.between(time1, time2);
        System.out.println("Total Time between "+time1+" and "+time2+" is "+TotalTime+"Hr");

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        /*Q no 4*/
        
        LocalTime time = LocalTime.now();
        int Hrs = time.getHour();
        if (Hrs>=5 && Hrs<12  ) {
            System.out.println("Good Morning!!!");
        }
        else if (Hrs>=12 && Hrs<17) {
            System.out.println("Good AfterNoon!!!");
        }
        else if (Hrs>=17 && Hrs<21) {
            System.out.println("Good Evening!!!");
        }
        else {
            System.out.println("Good Night!!!");
        }
    }
}
