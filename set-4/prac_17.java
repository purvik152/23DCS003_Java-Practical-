// Parent class
class Parent {
    void printParent() {
        System.out.println("This is parent class");
    }
}

// Subclass
class Child extends Parent {
    void printChild() {
        System.out.println("This is child class");
    }
}

public class prac_17 {
    public static void main(String[] args) {
        // Creating an object of the parent class
        Parent parentObject = new Parent();
        // Calling the method of the parent class
        parentObject.printParent();

        // Creating an object of the child class
        Child childObject = new Child();
        // Calling the method of the child class
        childObject.printChild();
    }
}
