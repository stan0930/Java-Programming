import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {

        String[] animals = {
            "monkey", "rooster", "dog", "pig", "rat", 
            "ox", "tiger", "rabbit", "dragon", "snake", 
            "horse", "sheep"
        };
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        int index = year % 12;
        String zodiac = animals[index];
        System.out.println("The Chinese Zodiac sign for year " + year + " is " + zodiac + ".");
    }
}
