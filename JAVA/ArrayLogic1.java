

public class ArrayLogic1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};

        // Loop through the array
        for (int i = 1; i < arr.length; i++) {
            // Check if the index is a prime number
            if (isPrime(i)) {
                System.out.println(arr[i]);
            }
        }
    }

    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
