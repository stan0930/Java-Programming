import java.util.Scanner;

public class SalesTaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();

        final double TAX_RATE = 0.06;

        double tax = purchaseAmount * TAX_RATE;

        System.out.printf("Sales tax is $%.2f\n", tax);
    }
}
