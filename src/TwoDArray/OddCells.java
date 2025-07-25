package TwoDArray;

import java.util.Arrays;

public class OddCells {
    public static void main(String[] args) {
        int m=2;
        int n=3;
        int[][] indices= {
                {1,0},
                {1,1}
        };
//        System.out.println(Arrays.deepToString(oddCells(m,n,indices)));
        oddCells(m,n,indices);
    }

    static void oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        for (int []index:indices){
            int row =index[0];
            int col =index[1];
            System.out.println(col);
//            for (int i = 0; i < m; i++) {
//                matrix[row][i]++;
//            }
//            // Increment column
//            for (int i = 0; i < n; i++) {
//                matrix[i][col]++;
//            }
        }
//        return matrix;

    }
}
