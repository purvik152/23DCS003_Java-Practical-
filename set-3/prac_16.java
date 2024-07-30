import java.util.Scanner;

public class Complex {
    // Instance variables
    private double real;
    private double imaginary;

    // Constructor
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public Complex add(Complex other) {
        double realPart = this.real + other.real;
        double imaginaryPart = this.imaginary + other.imaginary;
        return new Complex(realPart, imaginaryPart);
    }

    // Method to subtract two complex numbers
    public Complex subtract(Complex other) {
        double realPart = this.real - other.real;
        double imaginaryPart = this.imaginary - other.imaginary;
        return new Complex(realPart, imaginaryPart);
    }

    // Method to multiply two complex numbers
    public Complex multiply(Complex other) {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(realPart, imaginaryPart);
    }

    // Method to display the complex number
    public void display() {
        System.out.printf("%.2f + %.2fi%n", real, imaginary);
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first complex number
        System.out.print("Enter real part of the first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter imaginary part of the first complex number: ");
        double imaginary1 = scanner.nextDouble();

        // Create the first complex number
        Complex complex1 = new Complex(real1, imaginary1);

        // Input for the second complex number
        System.out.print("Enter real part of the second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter imaginary part of the second complex number: ");
        double imaginary2 = scanner.nextDouble();

        // Create the second complex number
        Complex complex2 = new Complex(real2, imaginary2);

        // Perform operations
        Complex sum = complex1.add(complex2);
        Complex difference = complex1.subtract(complex2);
        Complex product = complex1.multiply(complex2);

        // Display results
        System.out.print("Sum: ");
        sum.display();
        System.out.print("Difference: ");
        difference.display();
        System.out.print("Product: ");
        product.display();

        // Close the scanner
        scanner.close();
    }
}
