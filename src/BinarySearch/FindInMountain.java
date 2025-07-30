package BinarySearch;

public class FindInMountain {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,9,8,7,4,2};
        int target = 8;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr,int target){
        int peak = peak(arr);
        int firstTry = split(arr , 0 , peak , target);
        if(firstTry != -1){
            return firstTry;
        }
        return split(arr , peak + 1 , arr.length-1 , target);
    }
    static int peak(int[] arr){
        int s = 0, e = arr.length-1;
        while(e > s) {
            int mid = s + (e-s)/2;
            if (arr[mid] > arr[mid+1]) e = mid;
            else s = mid + 1;
        }
        return s;
    }
    static int split(int[] arr , int s , int e , int target){
        boolean isAsc = arr[s] < arr[e];
        while(s <= e) {
            int mid = s + (e-s)/2;
            if (arr[mid] == target) return arr[mid];

            if(isAsc){
                if(target < arr[mid]) e = mid - 1;
                else s = mid + 1;
            }
            else {
                if(target > arr[mid]) e = mid - 1;
                else s = mid + 1;
            }
        }
        return - 1;
    }
}
