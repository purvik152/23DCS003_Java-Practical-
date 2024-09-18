import java.util.Scanner;

public class prac_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking input from the user
            System.out.print("Enter a positive integer: ");
            int number = scanner.nextInt();

            // Throwing an exception if the number is negative
            if (number < 0) {
                throw new Exception("Negative numbers are not allowed!");
            }

            // If no exception occurs, print the input number
            System.out.println("You entered: " + number);
        } 
        catch (Exception e) {
            // Catching the exception and displaying an error message
            System.out.println("Error: " + e.getMessage());
        } 
        finally {
            // Closing the scanner
            scanner.close();
        }
    }
}
