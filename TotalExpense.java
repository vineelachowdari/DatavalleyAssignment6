import java.util.Scanner;

public class TotalExpensesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input quantity and price per item
        System.out.print("Enter the quantity purchased: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter the price per item: ");
        double pricePerItem = scanner.nextDouble();

        // Calculate total expenses without discount
        double totalExpenses = quantity * pricePerItem;

        // Apply discount based on quantity purchased
        double discount = 0;
        if (quantity > 50) {
            discount = totalExpenses * 0.10; // 10% discount
        } else if (quantity >= 25 && quantity <= 50) {
            discount = totalExpenses * 0.05; // 5% discount
        }

        // Calculate total expenses after discount
        totalExpenses -= discount;

        // Output total expenses
        System.out.println("Total expenses: Rs. " + totalExpenses);

        scanner.close();
    }
}