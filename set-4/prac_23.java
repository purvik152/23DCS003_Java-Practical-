import java.util.Scanner;

// Shape interface with a default method
interface Shape {
    String getColor();
    double getArea();
    default void printShapeInfo() {
        System.out.println("This is a shape with color: " + getColor());
    }
}

// Circle class implementing Shape interface
class Circle implements Shape {
    private double radius;
    private String color;

    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void printShapeInfo() {
        System.out.println("This is a circle with color: " + color + " and area: " + getArea());
    }
}

// Rectangle class implementing Shape interface
class Rectangle implements Shape {
    private double length;
    private double width;
    private String color;

    Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void printShapeInfo() {
        System.out.println("This is a rectangle with color: " + color + " and area: " + getArea());
    }
}

// Sign class
class Sign {
    private Shape shape;
    private String text;

    Sign(Shape shape, String text) {
        this.shape = shape;
        this.text = text;
    }

    void printSignInfo() {
        shape.printShapeInfo();
        System.out.println("Sign text: " + text);
    }
}

public class prac_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for Circle
        System.out.println("Enter the radius and color of the circle:");
        double radius = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        String circleColor = scanner.nextLine();
        Circle circle = new Circle(radius, circleColor);

        // Taking input for Rectangle
        System.out.println("Enter the length, width, and color of the rectangle:");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        String rectangleColor = scanner.nextLine();
        Rectangle rectangle = new Rectangle(length, width, rectangleColor);

        // Taking input for Sign text
        System.out.println("Enter the text for the sign:");
        String signText = scanner.nextLine();

        // Creating Sign objects
        Sign circleSign = new Sign(circle, signText);
        Sign rectangleSign = new Sign(rectangle, signText);

        // Printing Sign information
        System.out.println("\nCircle Sign Info:");
        circleSign.printSignInfo();

        System.out.println("\nRectangle Sign Info:");
        rectangleSign.printSignInfo();

        scanner.close();
    }
}
