import java.util.Scanner;

public class bill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] productCodes = {1, 2, 3, 4};
        double[] prices = {0.0, 0.0, 0.0, 0.0}; 
        
        for (int i = 0; i < productCodes.length; i++) {
            System.out.print("Enter price for product code " + productCodes[i] + ": ");
            prices[i] = scanner.nextDouble();
        }

        
        double totalBill = 0.0;
        System.out.print("Enter the product code (1 to 4, or any other code to exit): ");
        int code = scanner.nextInt();

        while (code >= 1 && code <= 4) {
            switch (code) {
                case 1:
                    totalBill += prices[0] * 1.08; 
                    break;
                case 2:
                    totalBill += prices[1] * 1.12; 
                    break;
                case 3:
                    totalBill += prices[2] * 1.05; 
                    break;
                case 4:
                    totalBill += prices[3] * 1.075; 
                    break;
                default:
                    System.out.println("Invalid product code. Exiting...");
                    break;
            }

            System.out.print("Enter the next product code (1 to 4, or any other code to exit): ");
            code = scanner.nextInt();
        }

        scanner.close();

        System.out.println("Total bill: $" + totalBill);
    }
}
