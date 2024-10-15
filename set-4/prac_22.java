import java.util.Scanner;

// Interface definition
interface AdvancedArithmetic {
    int divisor_sum(int n);
}

// Class implementing the interface
class MyCalculator implements AdvancedArithmetic {
    @Override
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

public class prac_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        // Creating an object of MyCalculator
        MyCalculator myCalculator = new MyCalculator();

        // Calculating and printing the sum of divisors
        int result = myCalculator.divisor_sum(n);
        System.out.println("The sum of the divisors of " + n + " is: " + result);

        scanner.close();
    }
}
