package BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 11;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr ,int target) {
        int s = 0, e = 1;
        while (target > arr[e]) {
            int temp = e + 1;
            e = e + (e - s + 1) * 2;
            s = temp;
        }
        return binarySearch(arr, s, e, target);
    }
    static int binarySearch(int[] arr , int s , int e , int target){
        while(e >= s) {
            int mid = s + (e-s)/2;
            if (arr[mid] > target) {
                e = mid - 1;
            }else if(arr[mid] < target){
                s = mid + 1;
            }else{
                return mid;
            }
        }
        return 0;
    }
}
