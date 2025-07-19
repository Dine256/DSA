package Leetcode;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits= {9,9};
        System.out.println(Arrays.toString(plusone(digits)));
    }
    static int[] plusone(int[] digits){
        int last=digits.length;
        for(int i=last-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] newarr = new int[last+1];
        newarr[0]=1;
        return newarr;
    }
}
