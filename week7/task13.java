package week7;

import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("enter a hex number: ");
        String hex = scanner.nextLine();
        
        int decimal = Integer.parseInt(hex, 16);
        
        System.out.println("decimal value of " + hex + " is " + decimal);
        
        scanner.close();
    }
}
