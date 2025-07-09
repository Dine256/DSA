package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={75,55,44,33,22,11,5,3,2,1};
        int target=44;
        System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int [] arr,int target){

        int start = 0;
        int end = arr.length-1;
        boolean inasc = arr[start]<arr[end];
        if(inasc){
            for(int i: arr){
                int mid = start+(end-start)/2;
                if(target<arr[mid])
                    end=mid-1;
                else if (target>arr[mid])
                    start=mid+1;
                else
                    return mid;
            }
        }else{
            for(int i: arr){
                int mid = start+(end-start)/2;
                if(target>arr[mid])
                    end=mid-1;
                else if (target<arr[mid])
                    start=mid+1;
                else
                    return mid;
            }
        }
        return -1;
    }
}
