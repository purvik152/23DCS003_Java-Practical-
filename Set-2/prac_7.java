import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        // Create a Scanner object for taking input from user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String str = scanner.nextLine();

        // Prompt the user to enter a non-negative integer
        System.out.println("Enter a non-negative integer:");
        int n = scanner.nextInt();

        // Get the front part of the string (first 3 characters or whatever is available)
        String front;
        if (str.length() < 3) {
            front = str;
        } else {
            front = str.substring(0, 3);
        }

        // Create a new string with n copies of the front part
        String result = "";
        for (int i = 0; i < n; i++) {
            result += front;
        }

        // Output the result
        System.out.println(result);
    }
}
