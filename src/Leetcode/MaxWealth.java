package Leetcode;

public class MaxWealth {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {3,2,7},
                {5,1,7}
        };
        System.out.println(arrSum(arr));
    }

    static int arrSum(int[][] arr){
        int ans=Integer.MIN_VALUE;
        for(int [] i: arr){
            int arrSum=0;
            for(int j:i){
                arrSum+=j;
            }
            if(arrSum>ans) ans=arrSum;
        }
        return ans;
    }

}
