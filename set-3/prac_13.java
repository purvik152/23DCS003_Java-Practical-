import java.util.Scanner;

public class Employee {
    // Instance variables
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        // Set the monthly salary, ensuring it's not negative
        this.monthlySalary = (monthlySalary > 0) ? monthlySalary : 0.0;
    }

    // Getter and Setter for firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and Setter for lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter and Setter for monthlySalary
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = (monthlySalary > 0) ? monthlySalary : 0.0;
    }

    // Method to calculate yearly salary
    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    // Method to apply a raise
    public void applyRaise(double percentage) {
        if (percentage > 0) {
            monthlySalary += monthlySalary * (percentage / 100);
        }
    }

    // Test application
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for first Employee
        System.out.print("Enter first name for Employee 1: ");
        String firstName1 = scanner.nextLine();
        System.out.print("Enter last name for Employee 1: ");
        String lastName1 = scanner.nextLine();
        System.out.print("Enter monthly salary for Employee 1: ");
        double salary1 = scanner.nextDouble();
        scanner.nextLine();  // Consume newline

        // Create the first Employee object
        Employee employee1 = new Employee(firstName1, lastName1, salary1);

        // Input for second Employee
        System.out.print("Enter first name for Employee 2: ");
        String firstName2 = scanner.nextLine();
        System.out.print("Enter last name for Employee 2: ");
        String lastName2 = scanner.nextLine();
        System.out.print("Enter monthly salary for Employee 2: ");
        double salary2 = scanner.nextDouble();

        // Create the second Employee object
        Employee employee2 = new Employee(firstName2, lastName2, salary2);

        // Display initial yearly salaries
        System.out.printf("%s %s's yearly salary: %.2f%n", employee1.getFirstName(), employee1.getLastName(), employee1.getYearlySalary());
        System.out.printf("%s %s's yearly salary: %.2f%n", employee2.getFirstName(), employee2.getLastName(), employee2.getYearlySalary());

        // Apply a 10% raise
        employee1.applyRaise(10);
        employee2.applyRaise(10);

        // Display updated yearly salaries
        System.out.printf("%s %s's yearly salary after 10%% raise: %.2f%n", employee1.getFirstName(), employee1.getLastName(), employee1.getYearlySalary());
        System.out.printf("%s %s's yearly salary after 10%% raise: %.2f%n", employee2.getFirstName(), employee2.getLastName(), employee2.getYearlySalary());

        // Close the scanner
        scanner.close();
    }
}
