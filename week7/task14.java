package week7;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        int gcd = findGCD(num1, num2);

        System.out.println("The greatest common divisor for " + num1 + " and " + num2 + " is " + gcd);
    }

    public static int findGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}

