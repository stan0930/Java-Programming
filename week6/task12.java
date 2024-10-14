package week6;

public class task12 {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        
        while (count < 50) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
                
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            number++;
        }
    }
    
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        
        return true;
    }
}