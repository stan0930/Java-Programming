package week5;

import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        
        String s = input.nextLine();
        char ch = s.charAt(0);
        input.close();
        
        System.out.println("The character entered is " + ch);
    }
}

