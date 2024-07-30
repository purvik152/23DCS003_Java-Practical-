import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of days
        System.out.print("Enter the number of days for your exercise routine: ");
        int n = scanner.nextInt();

        // Calculate and display the first n terms of the Fibonacci series
        System.out.println("Exercise duration for each day (in minutes):");
        for (int i = 0; i < n; i++) {
            System.out.println("Day " + (i + 1) + ": " + fibonacci(i) + " minutes");
        }

        scanner.close();
    }

    // Method to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
