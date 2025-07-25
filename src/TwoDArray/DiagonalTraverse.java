package TwoDArray;

import java.util.Arrays;

public class DiagonalTraverse {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(diaTra(matrix)));
    }

    static int[] diaTra(int[][] matrix) {
        if(matrix.length==0 && matrix[0].length==0){
            return new int[]{};
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0,col = 0;
        int[] arr = new int[m * n];
        int index = 0;
        while(index < arr.length){
            arr[index++] = matrix[col][row];
            int sum = row+col;
            boolean isEven = sum % 2 == 0;
            if(isEven){
                if(row < n-1 && col>0){
                    row++;
                    col--;
                } else if (row < n - 1) {
                    row++;
                }else{
                    col++;
                }
            } else{
                if(col < m-1 && row>0){
                    row--;
                    col++;
                } else if (col < m - 1) {
                    col++;
                }else{
                    row++;
                }
            }
        }
        return arr;
    }
}
