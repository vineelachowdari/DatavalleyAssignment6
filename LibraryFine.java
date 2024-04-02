import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of days late
        System.out.print("Enter the number of days the book is late: ");
        int daysLate = scanner.nextInt();

        // Calculate fine based on the number of days late
        double fine = 0;

        if (daysLate <= 7) {
            fine = daysLate * 0.50;
        } else if (daysLate <= 14) {
            fine = 7 * 0.50 + (daysLate - 7) * 1.00;
        } else if (daysLate <= 21) {
            fine = 7 * 0.50 + 7 * 1.00 + (daysLate - 14) * 5.00;
        } else {
            System.out.println("Your membership is canceled due to returning the book more than 21 days late.");
            System.exit(0); 
        }

        // Output the fine
        System.out.println("The fine for returning the book " + daysLate + " days late is Rs. " + fine);

        scanner.close();
    }
}