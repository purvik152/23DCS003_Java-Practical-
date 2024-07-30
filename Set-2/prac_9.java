import java.util.Scanner;

public class DoubleChar {
    public static void main(String[] args) {
        // Create a Scanner object for taking input from user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String str = scanner.nextLine();

        // Create a new string to store the result
        String result = "";

        // Iterate through each character in the original string
        for (int i = 0; i < str.length(); i++) {
            // Append each character twice to the result string
            result += str.charAt(i);
            result += str.charAt(i);
        }

        // Output the result
        System.out.println(result);
    }
}
