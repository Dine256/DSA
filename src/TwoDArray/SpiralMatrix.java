package TwoDArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},

        };
        List<Integer> spiral = spiralMat(matrix);
        System.out.println(spiral);
    }

    static List<Integer> spiralMat(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int top = 0, bottom = row-1;
        int left = 0, right = col-1;
        int index = 0;
        List<Integer> ans = new ArrayList<>(row * col);
        while (top<=bottom && left<=right ) {
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;
            if (left <= right) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (top <= bottom) {
                for (int i = bottom; i >= top; i--) {
                    ans.add (matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}
