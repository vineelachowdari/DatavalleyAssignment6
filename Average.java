import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables to keep track of largest, smallest, sum, and count
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;

        // Flag to determine whether to continue entering numbers
        boolean continueInput = true;

        // Input numbers until the user wants to stop
        while (continueInput) {
            System.out.print("Enter a number (or enter '0' to stop): ");
            int number = scanner.nextInt();

            // Check if the input is 0 to stop entering numbers
            if (number == 0) {
                continueInput = false;
            } else {
                // Update largest and smallest numbers
                if (number > largest) {
                    largest = number;
                }
                if (number < smallest) {
                    smallest = number;
                }

                // Add the number to the sum and increment the count
                sum += number;
                count++;
            }
        }

        // Calculate the average
        double average = (count == 0) ? 0 : (double) sum / count;

        // Display results
        if (count > 0) {
            System.out.println("Largest number entered: " + largest);
            System.out.println("Smallest number entered: " + smallest);
            System.out.println("Average of all numbers entered: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }

        scanner.close();
    }
}