package week8;

import java.util.Scanner;

public class task23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Numbers in reverse order:");

        for (int i = 9; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        
        scanner.close();
    }
}