package week11;

import java.util.Random;

public class task13 {
    public static void main(String[] args) {
        final int SIZE = 4;
        Random random = new Random();
        int[][] matrix = new int[SIZE][SIZE];
        int[] rowSums = new int[SIZE];
        int[] columnSums = new int[SIZE];
        int maxRow = 0, maxCol = 0;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                matrix[i][j] = random.nextInt(2); // 随机生成0或1
                rowSums[i]++;
                columnSums[j]++;
            }
        }

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < SIZE; i++) {
            if (rowSums[i] > rowSums[maxRow]) {
                maxRow = i;
            }
            if (columnSums[i] > columnSums[maxCol]) {
                maxCol = i;
            }
        }

        System.out.println("The largest row index: " + maxRow);
        System.out.println("The largest column index: " + maxCol);
    }
}