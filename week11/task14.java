package week11;

import java.util.Random;

public class task14 {
    public static void main(String[] args) {
        int[][] m = {
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8},
                {9, 10}
        };

        // 打印原始矩阵
        System.out.println("Original matrix:");
        printMatrix(m);

        // 打乱矩阵行
        shuffle(m);

        // 打印打乱后的矩阵
        System.out.println("Shuffled matrix:");
        printMatrix(m);
    }

    // 方法：打乱二维数组的行
    public static void shuffle(int[][] m) {
        Random random = new Random();
        for (int i = m.length - 1; i > 0; i--) {
            // 生成一个随机索引
            int j = random.nextInt(i + 1);
            // 交换行i和行j
            swapRows(m, i, j);
        }
    }

    // 方法：交换二维数组中的两行
    public static void swapRows(int[][] m, int i, int j) {
        int[] temp = m[i];
        m[i] = m[j];
        m[j] = temp;
    }

    // 方法：打印二维数组
    public static void printMatrix(int[][] m) {
        for (int[] row : m) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
