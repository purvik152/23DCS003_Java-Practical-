import java.util.Scanner;

public class Date {
    // Instance variables
    private int month;
    private int day;
    private int year;

    // Constructor
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Getter and Setter for month
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    // Getter and Setter for day
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    // Getter and Setter for year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Method to display the date
    public void displayDate() {
        System.out.printf("%02d/%02d/%04d%n", month, day, year);
    }

    // Test application
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first date
        System.out.print("Enter month for Date 1: ");
        int month1 = scanner.nextInt();
        System.out.print("Enter day for Date 1: ");
        int day1 = scanner.nextInt();
        System.out.print("Enter year for Date 1: ");
        int year1 = scanner.nextInt();

        // Create the first Date object
        Date date1 = new Date(month1, day1, year1);

        // Input for the second date
        System.out.print("Enter month for Date 2: ");
        int month2 = scanner.nextInt();
        System.out.print("Enter day for Date 2: ");
        int day2 = scanner.nextInt();
        System.out.print("Enter year for Date 2: ");
        int year2 = scanner.nextInt();

        // Create the second Date object
        Date date2 = new Date(month2, day2, year2);

        // Display the dates
        System.out.print("Date 1: ");
        date1.displayDate();
        System.out.print("Date 2: ");
        date2.displayDate();

        // Close the scanner
        scanner.close();
    }
}
