import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        // The given string
        String str = "CHARUSAT UNIVERSITY";

        // Create a Scanner object for taking input from the user
        Scanner scanner = new Scanner(System.in);

        // Find the length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // Prompt the user to enter their first name
        System.out.println("Enter your first name:");
        String firstName = scanner.nextLine();
        char firstLetter = firstName.charAt(0);

        // Replace 'H' with the first letter of the user's name
        String replacedString = str.replace('H', firstLetter);
        System.out.println("String after replacing 'H' with '" + firstLetter + "': " + replacedString);

        // Convert all characters in the string to lowercase
        String lowercaseString = str.toLowerCase();
        System.out.println("String in lowercase: " + lowercaseString);
    }
}
