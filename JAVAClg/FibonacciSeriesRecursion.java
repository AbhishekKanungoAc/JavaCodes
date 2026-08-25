package JAVAClg;
import java.util.Scanner;

public class FibonacciSeriesRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the range
        System.out.print("Enter the upper limit of the range: ");
        int upperLimit = scanner.nextInt();

        System.out.print("Enter the lower limit of the range: ");
        int lowerLimit = scanner.nextInt();

        System.out.println("Fibonacci series between " + upperLimit + " and " + lowerLimit + ":");
        printFibonacci(0, 1, upperLimit, lowerLimit);

        scanner.close();
    }

    // Recursive method to print Fibonacci numbers in the user-defined range
    public static void printFibonacci(int num1, int num2, int upperLimit, int lowerLimit) {
        int nextNum = num1 + num2;

        // Base condition: Stop if the next number exceeds the upper limit
        if (nextNum > upperLimit) {
            return;
        }

        // First, recursively generate the Fibonacci sequence
        printFibonacci(num2, nextNum, upperLimit, lowerLimit);

        // Then, print the number if it is within the user-defined range
        if (nextNum >= lowerLimit && nextNum <= upperLimit) {
            System.out.print(nextNum + " ");
        }
    }
}




    
 


    
 