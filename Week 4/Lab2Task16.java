public class Lab2Task16 {
    public static void main(String[] args) {
        int year = 2000;


        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);


        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
