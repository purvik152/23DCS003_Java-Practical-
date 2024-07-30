import java.util.Scanner;

public class StringFunctionalities {
    public static void main(String[] args) {
        // Create a Scanner object for taking input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String str = scanner.nextLine();

        // Find the length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // Convert the string to lowercase
        String lowercase = str.toLowerCase();
        System.out.println("Lowercase of the string: " + lowercase);

        // Convert the string to uppercase
        String uppercase = str.toUpperCase();
        System.out.println("Uppercase of the string: " + uppercase);

        // Reverse the string
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("Reversed string: " + reversed);

        // Sort the string
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                // Swap if the current character is greater than the next
                if (chars[i] > chars[j]) {
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        
        // Convert sorted char array back to string
        String sorted = new String(chars);
        System.out.println("Sorted string: " + sorted);
    }
}
