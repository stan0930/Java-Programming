package week11;

public class task1 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        System.out.println("Total number of rows: " + array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Length of row " + i + ": " + array[i].length);
        }

        try {
            System.out.println("Length of row 4: " + array[4].length);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
