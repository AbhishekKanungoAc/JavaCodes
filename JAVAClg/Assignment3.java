package JAVAClg;
import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] args) {
        /*Q no.1 */
        System.out.println("Enter the character:");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(Character.isUpperCase(ch)){
            System.out.println(ch+" is an upper case letter");
        }
        else if(Character.isLowerCase(ch)){
            System.out.println(ch+" is an lower case letter");
        }
        else if(Character.isDigit(ch)){
            System.out.println(ch+" is a digit.");
        }
        else
        {
            System.out.println(ch+" is a special symbol.");
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        /*Q no.2 */
        
        
                // Taking input for coefficients
                System.out.print("Enter coefficient a: ");
                double a = sc.nextDouble();
                
                System.out.print("Enter coefficient b: ");
                double b = sc.nextDouble();
                
                System.out.print("Enter coefficient c: ");
                double c = sc.nextDouble();
        
                // Calculate the determinant (b^2 - 4ac)
                double determinant = b * b - 4 * a * c;
        
                
                if (determinant > 0) {
                    
                    double root1 = (-b + Math.sqrt(determinant)) / (2 * a);
                    double root2 = (-b - Math.sqrt(determinant)) / (2 * a);
                    System.out.println("Roots are real and distinct.");
                    System.out.println("Root 1: " + root1);
                    System.out.println("Root 2: " + root2);
                } else if (determinant == 0) {
                    
                    double root = -b / (2 * a);
                    System.out.println("Roots are real and equal.");
                    System.out.println("Root: " + root);
                } else {
            
                    double realPart = -b / (2 * a);
                    double imaginaryPart = Math.sqrt(-determinant) / (2 * a);
                    System.out.println("Roots are complex and different.");
                    System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
                    System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
                }
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                /*Q no.3 */
                System.out.println("Enter the basic salary of employee:-");
                double Salary = sc.nextDouble();

                double HRA,DA,GROSSsALARY;
                if (Salary<=10000) {
                    HRA = 0.20*Salary;
                    DA = 0.80*Salary;                    
                }
                else if (Salary<=20000) {
                    
                    HRA = 0.25*Salary;
                    DA = 0.90*Salary;
                    
                }
                else{
                    
                    HRA = 0.30*Salary;
                    DA = 0.95*Salary;
                }
 
                   GROSSsALARY = HRA+DA+Salary;
                   System.out.println("GROSS SALARY IS:-"+GROSSsALARY); 
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                   /*Q no.4 */

                   System.out.println("Enter the number till you want fibonici series:-");
                   int f = sc.nextInt();
                   int n1=0,n2=1;
                   for(int i=0;i<f;i++){
                    System.out.print(n1+" ");
                    int temp =n2+n1;
                    n1=n2;
                    n2=temp;
                   }
        

        
    }
}



    

