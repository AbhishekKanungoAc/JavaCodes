import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input subject codes and marks for four subjects
        String[] subjectCodes = {"101", "102", "103", "104"};
        String[] subjects = {"Math", "Science", "English", "History"};
        int[] marks = new int[4];
        
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter marks for " + subjects[i] + " (" + subjectCodes[i] + "): ");
            marks[i] = scanner.nextInt();
        }
        
        // Calculate total and average
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        double average = total / 4.0;
        
        // Determine the result and failed subjects
        boolean hasFailed = false;
        StringBuilder failedSubjects = new StringBuilder();
        
        for (int i = 0; i < 4; i++) {
            if (marks[i] < 40) {
                if (hasFailed) {
                    failedSubjects.append(", ");
                }
                failedSubjects.append(subjectCodes[i]);
                hasFailed = true;
            }
        }
        
        String result = hasFailed ? "Fail in " + failedSubjects.toString() : "Pass";
        
        // Display the result
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Result: " + result);
        
        scanner.close();
    }
}