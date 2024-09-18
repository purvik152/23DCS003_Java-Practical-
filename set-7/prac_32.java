import java.util.Scanner;

// Thread class by extending Thread class
class MyThread extends Thread {
    private int repeat;

    // Constructor to take user input for how many times to display the message
    public MyThread(int repeat) {
        this.repeat = repeat;
    }

    @Override
    public void run() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("Hello World");
        }
    }
}

public class prac_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of times to display 'Hello World': ");
        int times = scanner.nextInt();
        
        // Create and start the thread
        MyThread thread = new MyThread(times);
        thread.start();
    }
}
