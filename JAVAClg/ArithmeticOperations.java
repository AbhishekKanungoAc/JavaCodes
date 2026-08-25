package JAVAClg;
import java.util.Scanner;

public class ArithmeticOperations {
    
    // Function to add two numbers
    public static double Add(double a, double b) {
        return a + b;
    }

    // Function to subtract two numbers
    public static double Sub(double a, double b) {
        return a - b;
    }

    // Function to multiply two numbers
    public static double Mul(double a, double b) {
        return a * b;
    }

    // Function to divide two numbers
    public static double Div(double a, double b) {
        if(b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;  // Return 0 or handle this case as needed
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input values for A and B
        System.out.print("Enter the first number (A): ");
        double A = scanner.nextDouble();
        
        System.out.print("Enter the second number (B): ");
        double B = scanner.nextDouble();

        // Perform operations using sub-functions
        double sum = Add(A, B);
        double difference = Sub(A, B);
        double product = Mul(A, B);
        double quotient = Div(A, B);

        // Display the results
        System.out.println("A + B = " + sum);
        System.out.println("A - B = " + difference);
        System.out.println("A * B = " + product);
        System.out.println("A / B = " + quotient);
        
        scanner.close();
    }
}
