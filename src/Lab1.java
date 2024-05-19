import java.util.Date;

public class Lab1 {
    public static void main(String[] args) {
        System.out.println("Starting project");

        byte v_byte=120;
        short v_short=129;
        char v_char='a'; // не было ' '
        int v_int=65999;
        long v_long=4294967296L; // не было L
        float v_float=0.33333334f; // не было f
        double v_double=0.3333333333333333;
        boolean v_boolean=true; // boolean

        for (char c='a'; c!='z'+1; ++c) {
            System.out.print(c);
        }

        int[] mas = {12,43,12,-65,778,123,32,76};
        System.out.println(findMax(mas));

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] newMatrix = transposeMatrix(matrix);
        for (int[] row : newMatrix) {
            for (int i : row) {
                System.out.print(i + " ");
            }
            System.out.print('\n');
        }

        System.out.println(executionTime(100000000));
    }

    public static int findMax(int[] arr) {
        int x = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > x) x = i;
        }
        return x;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposedMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }

    public static long executionTime(int n) {
        long begin = new Date().getTime();
        for (int i=0; i<n; ++i) {
            ++i;
        }
        long end = new Date().getTime();
        return end - begin;
    }
}
