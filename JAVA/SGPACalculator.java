public class SGPACalculator {
    public static double calculateSGPA(double[] grades, int[] credits) {
        int totalCredits = 0;
        double weightedSum = 0.0;

        for (int i = 0; i < grades.length; i++) {
            totalCredits += credits[i];
            weightedSum += grades[i] * credits[i];
        }

        return weightedSum / totalCredits;
    }

    public static void main(String[] args) {
        double[] grades = {9.0, 8.0, 8.5, 9.5}; // Grade points for each subject
        int[] credits = {3, 4, 3, 2}; // Credits for each subject

        double sgpa = calculateSGPA(grades, credits);
        System.out.println("SGPA: " + sgpa);
    }
}