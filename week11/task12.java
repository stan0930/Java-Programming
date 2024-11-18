package week11;

import java.util.Scanner;

public class task12 {

    // 方法：计算矩阵中指定列的元素总和
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0.0;
        for (double[] row : m) {
            sum += row[columnIndex];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][4];

        // 读取3x4矩阵
        System.out.println("Enter a 3-by-4 matrix row by row:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        // 显示每列的总和
        for (int j = 0; j < matrix[0].length; j++) {
            System.out.println("Sum of the elements at column " + j + " is " + sumColumn(matrix, j));
        }

        input.close();
    }
}
