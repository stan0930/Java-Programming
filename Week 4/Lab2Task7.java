import java.util.Scanner;

public class DrivingCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();


        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();


        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();


        double cost = (distance / milesPerGallon) * pricePerGallon;


        System.out.printf("The cost of driving is $%.2f\n", cost);
    }
}
