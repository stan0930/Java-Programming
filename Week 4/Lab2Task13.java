public class SalaryAdjustment {
    public static void main(String[] args) {
        double salary = 1000;
        int score = 95;


        if (score > 90) {
            salary *= 1.03; 
        } else {
            salary *= 1.01; 
        }


        System.out.printf("New salary is %.2f\n", salary);
    }
}
