package Leetcode;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr ={2,7,11,15};
        int target=17;
        System.out.println(twoSum(arr,target));
    }
    static int[] twoSum(int[] arr, int target){
            int [] ar=new int[2];
           for(int i:arr){
               for(int j:arr){
                   if(arr[j]+arr[j]==target) {
                       ar[0]=i;
                       ar[1]=j;
                   }
               }

           }
    return ar;
    }
}


