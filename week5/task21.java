package week5;

public class task21 {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%n", "Degrees", "Radians", "Sine", "Cosine", "Tangent");

        int degrees1 = 30;
        double radians1 = Math.toRadians(degrees1);
        double sine1 = Math.sin(radians1);
        double cosine1 = Math.cos(radians1);
        double tangent1 = Math.tan(radians1);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f%n", degrees1, radians1, sine1, cosine1, tangent1);

        int degrees2 = 60;
        double radians2 = Math.toRadians(degrees2);
        double sine2 = Math.sin(radians2);
        double cosine2 = Math.cos(radians2);
        double tangent2 = Math.tan(radians2);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f%n", degrees2, radians2, sine2, cosine2, tangent2);
    }
}

