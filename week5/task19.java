package week5;

public class task19 {
    public static void main(String[] args) {
        int count = 5;
        double amount = 45.56;

        // 格式化输出 count 和 amount
        System.out.printf("count is %d and amount is %f%n", count, amount);

        int number1 = 12345678;
        double number2 = 12345678.263;

        // 格式化输出带千分位和指定宽度的小数
        System.out.printf("%,8d %,10.1f%n", number1, number2);
    }
}
