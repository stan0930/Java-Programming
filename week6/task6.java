package week6;

import java.util.Scanner;
public class task6 {

    public static void main(String[] args) {
        int data;
        int sum = 0;
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        do {
            // Read the next data
            System.out.print("Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();
            sum += data;
        } while (data != 0);
        input.close();
        System.out.println("The sum is " + sum);
    }
}
