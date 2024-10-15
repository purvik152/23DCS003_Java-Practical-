import java.util.Scanner;

// Base class
class Rectangle {
    double length;
    double breadth;

    // Constructor to initialize length and breadth
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to print the area of the rectangle
    void printArea() {
        double area = length * breadth;
        System.out.println("Area: " + area);
    }

    // Method to print the perimeter of the rectangle
    void printPerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter: " + perimeter);
    }
}

// Derived class
class Square extends Rectangle {
    // Constructor to initialize side of the square
    Square(double side) {
        super(side, side);
    }
}

public class prac_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for Rectangle
        System.out.println("Enter the length and breadth of the rectangle:");
        double length = scanner.nextDouble();
        double breadth = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, breadth);

        // Taking input for Square
        System.out.println("Enter the side of the square:");
        double side = scanner.nextDouble();
        Square square = new Square(side);

        // Creating an array of objects
        Rectangle[] shapes = {rectangle, square};

        // Printing area and perimeter of each shape
        for (Rectangle shape : shapes) {
            if (shape instanceof Square) {
                System.out.println("\nSquare:");
            } else {
                System.out.println("\nRectangle:");
            }
            shape.printArea();
            shape.printPerimeter();
        }

        scanner.close();
    }
}
