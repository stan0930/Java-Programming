package week11;

import java.util.Arrays;

public class task11 {
    public static void main(String[] args) {
        // 存储每个员工一周的工作小时数
        int[][] hours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}
        };

        // 创建一个数组来存储员工的索引和他们的总小时数
        int[] totalHours = new int[hours.length];
        for (int i = 0; i < hours.length; i++) {
            totalHours[i] = Arrays.stream(hours[i]).sum();
        }

        // 使用数组索引和总小时数对员工进行排序
        for (int i = 0; i < totalHours.length - 1; i++) {
            for (int j = 0; j < totalHours.length - i - 1; j++) {
                if (totalHours[j] < totalHours[j + 1]) {
                    // 交换总小时数
                    int temp = totalHours[j];
                    totalHours[j] = totalHours[j + 1];
                    totalHours[j + 1] = temp;
                }
            }
        }

        // 打印排序后的员工和他们的总小时数
        for (int i = 0; i < totalHours.length; i++) {
            System.out.println("Employee " + i + " total hours: " + totalHours[i]);
        }
    }
}
