package BinarySearch;

public class CeilingANumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18,19,20,26};
        int target = 1;
        System.out.println(ceiling(arr,target));
    }

    static int ceiling(int[] arr, int target) {
        int s = 0, e = arr.length-1;
        while(e >= s) {
            int mid = s + (e-s)/2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return arr[s];
    }
}
