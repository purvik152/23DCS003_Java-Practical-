import java.util.Scanner;

// Thread class to increment the value of the variable
class IncrementThread extends Thread {
    private int value;
    private int times;

    // Constructor to initialize the value and number of times to increment
    public IncrementThread(int value, int times) {
        this.value = value;
        this.times = times;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < times; i++) {
                value++;  // Increment the value by one
                System.out.println("Value after increment: " + value);
                Thread.sleep(1000);  // Sleep for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }
}

public class prac_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the initial value: ");
        int initialValue = scanner.nextInt();

        System.out.print("Enter the number of times to increment: ");
        int times = scanner.nextInt();

        // Create and start the thread
        IncrementThread incrementThread = new IncrementThread(initialValue, times);
        incrementThread.start();

        try {
            incrementThread.join();  // Wait for the thread to complete
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        System.out.println("Incrementing process completed.");
    }
}
