import java.util.Scanner;

public class ArrayCount {
    public static void main(String[] args) {
        // Create a Scanner object for taking input from user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        // Create an array to store the integers
        int[] nums = new int[size];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        // Initialize a counter for the number of 9's
        int count = 0;

        // Iterate through the array and count the number of 9's
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }

        // Output the result
        System.out.println("Number of 9's in the array: " + count);
    }
}
