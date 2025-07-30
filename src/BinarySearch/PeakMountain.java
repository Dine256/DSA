package BinarySearch;

public class PeakMountain {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,8,9,6,3,1};
        System.out.println(peak(arr));
    }
    static int peak(int[] arr){
        int s = 0, e= arr.length;
        while(e > s) {
            int mid = s + (e-s)/2;
            if (arr[mid] > arr[mid + 1] ) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }
}
