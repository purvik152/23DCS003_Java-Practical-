import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        final double conversionRate = 100.0;
        double pounds;

        if (args.length > 0) {
            // Try to parse the first command-line argument as a double
            try {
                pounds = Double.parseDouble(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid command-line argument. Please enter a valid number.");
                return;
            }
        } else {
            // If no command-line arguments, read input interactively from the user
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the amount in Pounds: ");
            pounds = scanner.nextDouble();
        }

        // Convert Pounds to Rupees
        double rupees = pounds * conversionRate;

        // Print the result
        System.out.printf("%.2f Pounds is equivalent to %.2f Rupees%n", pounds, rupees);
    }
}
