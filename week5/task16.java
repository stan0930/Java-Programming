package week5;

public class task16 {
    public static void main(String[] args) {
        // indexOf
        System.out.println("Welcome to Java".indexOf("W"));
        System.out.println("Welcome to Java".indexOf("o"));
        System.out.println("Welcome to Java".indexOf("o", 5));
        System.out.println("Welcome to Java".indexOf("come"));
        System.out.println("Welcome to Java".indexOf("Java"));
        System.out.println("Welcome to Java".indexOf("java", 5));

        // lastIndexOf
        System.out.println("Welcome to Java".lastIndexOf("W"));
        System.out.println("Welcome to Java".lastIndexOf("o"));
        System.out.println("Welcome to Java".lastIndexOf("o", 5));
        System.out.println("Welcome to Java".lastIndexOf("come"));
        System.out.println("Welcome to Java".lastIndexOf("Java"));
        System.out.println("Welcome to Java".lastIndexOf("java", 5));
    }
}

