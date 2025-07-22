package TwoDArray;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr= {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.deepToString(arr));

    }
    static int[][] transpose(int [][] arr){
        for(int i=0; i<arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[j][i] = arr[j][i];
            }
        }
        return arr;
    }
}
