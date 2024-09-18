import java.util.Scanner;

// Custom exception (User-defined)
class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

public class prac_26 {

    // Method that throws a custom exception
    public static void checkNumber(int number) throws NegativeValueException {
        if (number < 0) {
            throw new NegativeValueException("Negative numbers are not allowed.");
        } else {
            System.out.println("Valid number: " + number);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        try {
            checkNumber(num);
        } catch (NegativeValueException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
