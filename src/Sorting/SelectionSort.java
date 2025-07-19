package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr= {5,4,3,2,1};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

     static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last= arr.length-i-1;
            int maxIndex= findMaxIndex(arr,0,last);
            swap(arr,last,maxIndex);
        }
        return arr;
    }
    static int findMaxIndex(int[] arr, int start,int last){
        int max = start;
        for (int i = start; i <=last; i++) {
            if(arr[max]<arr[i]){
                max= i;
            }
        }
        return max;
    }

    static void swap(int[] arr,int first ,int end){
        int temp= arr[first];
        arr[first]=arr[end];
        arr[end]= temp;
    }

}
