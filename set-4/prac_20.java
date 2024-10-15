import java.util.Scanner;

// Base class
class Shape {
    void printShape() {
        System.out.println("This is shape");
    }
}

// Derived class Rectangle
class Rectangle extends Shape {
    void printRectangle() {
        System.out.println("This is rectangular shape");
    }
}

// Derived class Circle
class Circle extends Shape {
    void printCircle() {
        System.out.println("This is circular shape");
    }
}

// Subclass Square of Rectangle
class Square extends Rectangle {
    void printSquare() {
        System.out.println("Square is a rectangle");
    }
}

public class prac_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an object of Square class
        Square square = new Square();

        // Calling methods of Shape and Rectangle class by the object of Square class
        System.out.println("Calling methods using Square object:");
        square.printShape();
        square.printRectangle();
        square.printSquare();

        scanner.close();
    }
}
