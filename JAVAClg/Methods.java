package JAVAClg;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.*;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/*predefined methods */

public class Methods {
    public static void main(String[] args) {
        /*max */
        System.out.println("the max is:"+Math.max(9, 7));
        System.out.println("the max is:"+Math.max(Math.max(9, 7),10));

        /*sqrt */
        System.out.println("Sq:"+Math.sqrt(4));
        
        /*String  */
        //compare m + ,-,0 
        String str1 ="Java",str2="JAVA",str3="Programming";
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str1));
        //concatenation
        System.out.println(str1+" "+str3);
        //Substring
        String s = " javaprogrraming";
        System.out.println(s);

        //upeer and lower
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        //trim() space front and back
        System.out.println(s.trim());

        //Start and end
        System.out.println(s.startsWith("ja"));
        System.out.println(s.endsWith("ing"));

        //charAt index
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(5));

        //lenth
        System.out.println(s.length());

        //replace
        System.out.println(s.replace("java", "python"));

        /* date */
        System.out.println("  d t");
        LocalDate dateKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(" today date:"+dateKolkata);
        System.out.println(" tomorrow date:"+dateKolkata.plusDays(1));
        System.out.println(" yest date:"+dateKolkata.minusDays(1));
        
        
      DateTimeFormatter myFormatterobj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
      String formattedDate = dateKolkata.format(myFormatterobj);
       System.out.println("formate:"+formattedDate);
       
        /*cal . days */
        LocalDate d1 = LocalDate.of(2024, Month.JUNE, 1);
        LocalDate d2 = LocalDate.of(2024, Month.JULY, 30);
        
        long TotalNo = ChronoUnit.DAYS.between(d1, d2);
        System.out.println("ttl days betn "+d1+"and "+d2+" is:"+TotalNo);

       /*time */
        LocalTime timeKolkata = LocalTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("t:"+timeKolkata);

        /*cal. time */
        LocalTime t1= LocalTime.of(18,00,55);
        LocalTime t2= LocalTime.of(21, 28, 0);
        long hr = ChronoUnit.HOURS.between(t1, t2);
        long mi = ChronoUnit.MINUTES.between(t1, t2)%60;
        long se = ChronoUnit.SECONDS.between(t1, t2)%60;
        System.out.println("differ "+hr+"hr "+mi+"mi "+se+"sec");

    }
}
