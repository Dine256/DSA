package BinarySearch;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][]arr={
                {10,20,30,40},
                {15,21,37,42},
                {16,22,38,46},
                {17,23,39,50}
        };
        int target=21;
        System.out.println(Arrays.toString(matrix(arr,target)));
    }
    static int[] matrix(int[][] arr , int target){
        int r = 0;
        int c = arr.length-1;

        while(r < arr.length && c >=0){
            if(arr[r][c]==target) return new int []{r,c};
            if(arr[r][c]>target) c--;
            else r++;
        }
        return new int[]{-1,-1};
    }
}
