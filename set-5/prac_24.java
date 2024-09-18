import java.util.Scanner;

public class prac_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking input for x and y
            System.out.print("Enter the value of x: ");
            int x = scanner.nextInt();

            System.out.print("Enter the value of y: ");
            int y = scanner.nextInt();

            // Perform division
            int result = x / y;
            System.out.println("Result of " + x + " / " + y + " = " + result);
        } 
        catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Division by zero is not allowed.");
        } 
        catch (Exception e) {
            // Handle any other exceptions (like input mismatch)
            System.out.println("Error: Invalid input. Please enter valid integers.");
        }
        finally {
            scanner.close(); // Closing the scanner
        }
    }
}
