import java.util.Scanner;

// Custom thread class that takes the thread name and the number of times to run
class CustomThread extends Thread {
    private String threadName;
    private int times;

    // Constructor to initialize the thread name and number of times to run
    public CustomThread(String threadName, int times) {
        this.threadName = threadName;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(threadName + " is running.");
            try {
                Thread.sleep(500);  // Sleep for half a second between each print
            } catch (InterruptedException e) {
                System.out.println(threadName + " was interrupted.");
            }
        }
    }
}

public class prac_36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user for how many times each thread should run
        System.out.print("Enter the number of times 'FIRST' thread should run: ");
        int firstTimes = scanner.nextInt();

        System.out.print("Enter the number of times 'SECOND' thread should run: ");
        int secondTimes = scanner.nextInt();

        System.out.print("Enter the number of times 'THIRD' thread should run: ");
        int thirdTimes = scanner.nextInt();

        // Creating the threads
        CustomThread firstThread = new CustomThread("FIRST", firstTimes);
        CustomThread secondThread = new CustomThread("SECOND", secondTimes);
        CustomThread thirdThread = new CustomThread("THIRD", thirdTimes);

        // Setting thread priorities
        firstThread.setPriority(3);    // Priority of FIRST is set to 3
        secondThread.setPriority(Thread.NORM_PRIORITY);  // Default priority (5) for SECOND
        thirdThread.setPriority(7);    // Priority of THIRD is set to 7

        // Starting the threads
        firstThread.start();
        secondThread.start();
        thirdThread.start();

        try {
            // Wait for all threads to complete execution
            firstThread.join();
            secondThread.join();
            thirdThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("All threads have completed execution.");
    }
}
