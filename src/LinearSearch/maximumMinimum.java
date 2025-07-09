package LinearSearch;

public class maximumMinimum {
    public static void main(String[] args) {
        int [] arr ={0,2,3,4,5,6,1,2,-1};

        System.out.println(max(arr));
        System.out.println(min(arr));
    }
    static int max(int[] arr){
        int max= arr[0];
        for (int i=0;i< arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        return max;

    }
    static int min(int[] arr){
        int max= arr[0];
        for (int i=0;i< arr.length;i++){
            if(arr[i]<max) max=arr[i];
        }
        return max;

    }
}
