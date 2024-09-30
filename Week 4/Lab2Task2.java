import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Send the total seconds: ");
        int totalSeconds = input.nextInt();

        int minutes = totalSeconds / 60;
        int remainingSeconds = totalSeconds % 60;

        System.out.println("Total: " + minutes + " mins" + remainingSeconds + " secends");
    }
}
