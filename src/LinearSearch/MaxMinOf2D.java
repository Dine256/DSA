package LinearSearch;

public class MaxMinOf2D {
    public static void main(String[] args) {
        int [][] arr= {
                {-1,2,3},
                {3,5,-6,4,5},
                {7,9}
        };
        max(arr);
        min(arr);
    }
    static void max(int[][]arr){
        int target=Integer.MIN_VALUE;
        for(int [] i: arr){
            for(int j: i){
                if(j>target){
                    target=j;
                }
            }
        }
        System.out.println(target);
    }
    static void min(int[][]arr){
        int target=Integer.MAX_VALUE;
        for(int [] i: arr){
            for(int j: i){
                if(j<target){
                    target=j;
                }
            }
        }
        System.out.println(target);
    }
}
