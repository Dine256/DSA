package Leetcode;

public class EvenNumberDigits {
    public static void main(String[] args) {
        int [] arr= {11,1123,3454,555,3333,3,2};
        System.out.println(findNumber(arr));
    }
    static int findNumber(int []arr){
        int count=0;
        for(int num: arr){
            if(even(num)){
                count++;
            }
        } return count;
    }

    static boolean even(int num) {
        int numberOfDigits= digits(num);
        return numberOfDigits % 2==0;

    }

    static int digits(int num){
        if(num==0){
            return 1;
        }
        int count=0;
        while (num>0){
            num/=10;

            count++;
        }
        return count;
    }
}
