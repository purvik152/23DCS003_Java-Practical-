import java.util.Scanner;

 class exp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int numDays = scanner.nextInt();

        double[] expenses = new double[numDays];
        double totalExpense = 0.0;

        for (int i = 0; i < numDays; i++) {
            System.out.print("Enter expense for day " + (i + 1) + ": ");
            expenses[i] = scanner.nextDouble();
            totalExpense += expenses[i];
        }

        scanner.close();

        System.out.println("Total expenses for the month: $" + totalExpense);
    }
}
