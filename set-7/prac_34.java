import java.util.Random;
import java.util.Scanner;

// Thread to generate random numbers
class NumberGenerator extends Thread {
    private SharedData sharedData;
    private int count; // Number of random numbers to generate

    public NumberGenerator(SharedData sharedData, int count) {
        this.sharedData = sharedData;
        this.count = count;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int num = random.nextInt(100);  // Generate a random number between 0 and 99
            sharedData.setNumber(num);      // Set the number in shared data
            System.out.println("Generated Number: " + num);
            
            try {
                Thread.sleep(1000);  // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
        sharedData.setFinished(true); // Mark the end of number generation
    }
}

// Thread to compute square if the number is even
class EvenSquareThread extends Thread {
    private SharedData sharedData;

    public EvenSquareThread(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        while (!sharedData.isFinished() || sharedData.getNumber() != null) {
            Integer num = sharedData.getNumber();
            if (num != null && num % 2 == 0) {  // If the number is even
                int square = num * num;
                System.out.println("Square of " + num + " is: " + square);
                sharedData.setNumber(null); // Clear the number after processing
            }
        }
    }
}

// Thread to compute cube if the number is odd
class OddCubeThread extends Thread {
    private SharedData sharedData;

    public OddCubeThread(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        while (!sharedData.isFinished() || sharedData.getNumber() != null) {
            Integer num = sharedData.getNumber();
            if (num != null && num % 2 != 0) {  // If the number is odd
                int cube = num * num * num;
                System.out.println("Cube of " + num + " is: " + cube);
                sharedData.setNumber(null); // Clear the number after processing
            }
        }
    }
}

// Shared data class to hold the generated number and status of generation
class SharedData {
    private Integer number;  // Can be null if no number is available
    private boolean isFinished = false;

    // Synchronized method to get the number
    public synchronized Integer getNumber() {
        return number;
    }

    // Synchronized method to set the number
    public synchronized void setNumber(Integer number) {
        this.number = number;
    }

    // Synchronized method to check if number generation is finished
    public synchronized boolean isFinished() {
        return isFinished;
    }

    // Synchronized method to set finished status
    public synchronized void setFinished(boolean isFinished) {
        this.isFinished = isFinished;
    }
}

public class prac_34{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for the number of random numbers to generate
        System.out.print("Enter the number of random numbers to generate: ");
        int N = scanner.nextInt();

        // Shared data object to be shared between threads
        SharedData sharedData = new SharedData();
        
        // Create and start the threads
        NumberGenerator numberGenerator = new NumberGenerator(sharedData, N);
        EvenSquareThread evenSquareThread = new EvenSquareThread(sharedData);
        OddCubeThread oddCubeThread = new OddCubeThread(sharedData);

        numberGenerator.start();
        evenSquareThread.start();
        oddCubeThread.start();

        try {
            numberGenerator.join();  // Wait for the number generation to complete
            evenSquareThread.join();
            oddCubeThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        System.out.println("Number generation and processing complete.");
    }
}
