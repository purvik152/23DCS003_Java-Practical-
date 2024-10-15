import java.util.Scanner;

// Base class
class Degree {
    void getDegree() {
        System.out.println("I got a degree");
    }
}

// Derived class Undergraduate
class Undergraduate extends Degree {
    @Override
    void getDegree() {
        System.out.println("I am an Undergraduate");
    }
}

// Derived class Postgraduate
class Postgraduate extends Degree {
    @Override
    void getDegree() {
        System.out.println("I am a Postgraduate");
    }
}

public class  prac_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an object of Degree class
        Degree degree = new Degree();
        // Creating an object of Undergraduate class
        Undergraduate undergraduate = new Undergraduate();
        // Creating an object of Postgraduate class
        Postgraduate postgraduate = new Postgraduate();

        // Calling the getDegree method for each object
        System.out.println("Calling getDegree method for Degree object:");
        degree.getDegree();

        System.out.println("\nCalling getDegree method for Undergraduate object:");
        undergraduate.getDegree();

        System.out.println("\nCalling getDegree method for Postgraduate object:");
        postgraduate.getDegree();

        scanner.close();
    }
}
