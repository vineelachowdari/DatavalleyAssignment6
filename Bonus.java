import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input current year and year of joining
        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();
        System.out.print("Enter the year of joining: ");
        int yearOfJoining = scanner.nextInt();

        // Calculate years of service
        int yearsOfService = currentYear - yearOfJoining;

        // Determine bonus amount based on years of service
        int bonusAmount = 0;
        if (yearsOfService > 5) {
            bonusAmount = 5000;
        } else if (yearsOfService >= 3) {
            bonusAmount = 3000;
        }

        // Output result
        if (bonusAmount > 0) {
            System.out.println("Congratulations! You are eligible for a bonus of Rs. " + bonusAmount);
        } else {
            System.out.println("You are not eligible for a bonus.");
        }

        scanner.close();
    }
}