import java.util.Scanner;

public class SavingsCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the monthly saving amount: ");
        double monthlySaving = input.nextDouble();


        final double MONTHLY_INTEREST_RATE = 0.05 / 12;

        double accountValue = 0;


        for (int i = 0; i < 6; i++) {
            accountValue = (accountValue + monthlySaving) * (1 + MONTHLY_INTEREST_RATE);
