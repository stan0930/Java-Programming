import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double MONTHLY_DEPOSIT = 100;
        final double MONTHLY_INTEREST_RATE = 0.05 / 12;

        System.out.print("Enter the number of months: ");
        int months = input.nextInt();

        double accountValue = 0;

        for (int i = 0; i < months; i++) {
            accountValue = (accountValue + MONTHLY_DEPOSIT) * (1 + MONTHLY_INTEREST_RATE);
        }

        System.out.printf("After %d months, the value in the account becomes %.3f\n", months, accountValue);
    }
}
