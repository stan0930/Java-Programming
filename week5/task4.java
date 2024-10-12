package week5;

public class task4 {
    public static void main(String[] args) {
        System.out.println("Math.max(2, 3) returns " + Math.max(2, 3));
        System.out.println("Math.min(2.5, 4.6) returns " + Math.min(2.5, 4.6));
        System.out.println("Math.max(Math.max(2.5, 4.6), Math.min(3, 5.6)) returns " + 
                           Math.max(Math.max(2.5, 4.6), Math.min(3, 5.6)));

        System.out.println("Math.abs(-2) returns " + Math.abs(-2));
        System.out.println("Math.abs(-2.1) returns " + Math.abs(-2.1));

        System.out.println("(int)(Math.random() * 10) returns " + 
                           (int)(Math.random() * 10));

        System.out.println("(50 + (int)(Math.random() * 50)) returns " + 
                           (50 + (int)(Math.random() * 50)));

        int a = 5;
        int b = 10;
        System.out.println(a + " + (int)(Math.random() * " + b + ") returns " + 
                           (a + (int)(Math.random() * b)));
    }
}

