package week8;

import java.util.Scanner;

public class task22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        double min = min(numbers);
        System.out.println("The minimum number is " + min);
    }


    public static double min(double[] array) {
        double minimum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i]; 
            }
        }
        return minimum;
    }
}

