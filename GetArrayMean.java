
import java.util.Scanner;

public class GetArrayMean {

    // Function to calculate the mean of the array elements
    public static float getArrayMean(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (float) sum / array.length; // Return mean as a float
    }

    public static void main(String[] args) {
        // Ask for the number of integers
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter number of elements: ");
            int n = scanner.nextInt();
            // Initialize the array
            int[] numbers = new int[n];
            // Collect n integers from the user
            for (int i = 0; i < n; i++) {
                System.out.print("Enter number: ");
                numbers[i] = scanner.nextInt();
            }   // Calculate and print the mean
            float mean = getArrayMean(numbers); // Use double for mean
            System.out.printf("Mean of array is: %.2f", mean);
            // Close the scanner
        }
    }
}

