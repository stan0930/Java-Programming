package week5;

public class task20 {
    public static void main(String[] args) {
        int number = 1234;
        String text = "Java";
        double value = 5.63;

        System.out.printf("%8d%8s%8.1f%n", number, text, value);

        System.out.printf("%-8d%-8s%-8.1f%n", number, text, value);
    }
}
