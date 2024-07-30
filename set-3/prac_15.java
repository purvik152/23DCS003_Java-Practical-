import java.util.Scanner;

public class Area {
    // Instance variables
    private double length;
    private double breadth;

    // Constructor
    public Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and return the area of the rectangle
    public double returnArea() {
        return length * breadth;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for length
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        // Input for breadth
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Create an Area object
        Area rectangle = new Area(length, breadth);

        // Calculate and display the area
        System.out.printf("The area of the rectangle is: %.2f%n", rectangle.returnArea());

        // Close the scanner
        scanner.close();
    }
}
