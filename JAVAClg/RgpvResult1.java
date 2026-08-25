package JAVAClg;
import java.util.Scanner;

public class RgpvResult1 {
      /*RGPV Result of 6th sem*/
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("");

        System.out.println("----------Enter Basic Details Of Student For creating Result---------- ");
        System.out.println("");
       
        System.out.print("Enrollment Number:");
        String enrl = sc.nextLine();

        System.out.print("Semester:");
        int s = sc.nextInt();
      
        System.out.println("");
        System.out.println("Enter the marks of subjects Below The Subject Code,Out of 100 :");
        System.out.println("       601     602     603     604          ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        
        int Total=(m1+m2+m3+m4);
        int per = Total/4;
        Double CGPA = (Double)(per/9.5);
        Double rn = Math.round(CGPA*100.0)/100.0;
               
        boolean hasFailed = false;
        StringBuilder failedSubjects = new StringBuilder();
        if (m1 < 40) {
            if (hasFailed) {
                failedSubjects.append(", ");
            }
            failedSubjects.append(601);
            hasFailed = true;
        }
        if (m2 < 40) {
            if (hasFailed) {
                failedSubjects.append(", ");
            }
            failedSubjects.append(602);
            hasFailed = true;
        }
        if (m3 < 40) {
            if (hasFailed) {
                failedSubjects.append(", ");
            }
            failedSubjects.append(603);
            hasFailed = true;
        }
        if (m4 < 40) {
            if (hasFailed) {
                failedSubjects.append(", ");
            }
            failedSubjects.append(604);
            hasFailed = true;
        }
        String result = hasFailed ? "Fail in " + failedSubjects.toString() : "Pass";

         System.out.println("======================================================================");
         System.out.println("..........Rajiv Gandhi Prodyogiki Vishwavidyalaya, Bhopal...........");     
         System.out.println(""); 

         System.out.println("---------------------Student Details--------------------");
         System.out.println("");
      
         if (enrl.equals("0834CS211007")||s==6) {
         String Name="Abhishek Kanungo";
         System.out.print("Name: "+Name+"     ");
         String RollNo = enrl;
         System.out.println("Roll Number:"+RollNo+"   ");
         String Course = "B.Tech";
         System.out.print("Course: "+Course+"      ");
         String Branch = "CS";
         System.out.println("       Branch: "+Branch);
         System.out.print("Sem: "+s+"           ");
         String Status = "Regular";
         System.out.println("            Status: "+Status);
         System.out.println("");
         }

         else if(enrl.equals("0834CS211006")||s==6){
             
         String Name="Abhinav Sharma";
         System.out.print("Name :"+Name+"     ");
         String RollNo = enrl;
         System.out.println("  Roll Number:"+RollNo+"   ");
         String Course = "B.Tech";
         System.out.print("Course :"+Course+"      ");
         String Branch = "CS";
         System.out.println("       Branch: "+Branch);
         int sem = 6;
         System.out.print("Sem :"+sem+"           ");
         String Status = "Regular";
         System.out.println("          Status: "+Status);
         System.out.println("");
 
         }

         else{
             System.out.println("Invaild Enrollment Number");
         }
         
         System.out.println("-----------------Statement of Marks-JUNE2024-------------");
         System.out.println("");

         System.out.print("Subject                  ");
         System.out.print("Mark                   ");
         System.out.println("Grade                 ");

         if (m1>=81) {
            System.out.println("601                        "+m1+"                     A");
            }
        else if (m1>=61) {
            System.out.println("601                        "+m1+"                     B");
            }
        else if (m1>=41) {
            System.out.println("601                        "+m1+"                     C");
            }
        else {
            System.out.println("601                        "+m1+"                     F");
            }
       
        if (m2>=81) {
            System.out.println("602                        "+m2+"                     A");
                }
        else if (m2>=61) {
            System.out.println("602                        "+m2+"                     B");
                }
        else if (m2>=41) {
            System.out.println("602                        "+m2+"                     C");
                }
        else {
            System.out.println("602                        "+m2+"                     F");
                }
                     
         if (m3>=81) {
            System.out.println("603                        "+m3+"                     A");
            }
        else if (m3>=61) {
            System.out.println("603                        "+m3+"                     B");
            }
        else if (m3>=41) {
            System.out.println("603                        "+m3+"                     C");
            }
        else {
            System.out.println("603                        "+m3+"                     F");
            }
    
         if (m4>=81) {
            System.out.println("604                        "+m4+"                     A");
            }
        else if (m4>=61) {
            System.out.println("604                        "+m4+"                     B");
            }
        else if (m4>=41) {
            System.out.println("604                        "+m4+"                     C");
            }
        else {
            System.out.println("604                        "+m4+"                     F");
            }
        System.out.println("");
        
        System.out.println("----------------------------------------------------------");
        System.out.println("");
        
        System.out.print("Result                  ");
        System.out.print("  Total Marks                  ");
        System.out.println(" CGPA                 ");

        System.out.print(""+result);
        System.out.print("                  "+Total+"  ");
        System.out.print("                   "+rn+" ");

        System.out.println(" ");
        sc.close();
        System.out.println("----------------------------------------------------------");
        
        System.out.println("======================================================================");
 
    }
}
