package week5;

import java.util.Scanner;

public class task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first city: ");
        String city1 = scanner.nextLine();
        
        System.out.print("Enter the second city: ");
        String city2 = scanner.nextLine();
        
        System.out.print("Enter the third city: ");
        String city3 = scanner.nextLine();

        String[] cities = {city1, city2, city3};

        for (int i = 0; i < cities.length - 1; i++) {
            for (int j = i + 1; j < cities.length; j++) {
                if (cities[i].compareTo(cities[j]) > 0) {

                    String temp = cities[i];
                    cities[i] = cities[j];
                    cities[j] = temp;
                }
            }
        }
        
        System.out.println("The three cities in alphabetical order are:");
        for (String city : cities) {
            System.out.println(city);
        }
        
        scanner.close();
    }
}
