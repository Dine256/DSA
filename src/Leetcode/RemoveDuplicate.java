package Leetcode;
public class RemoveDuplicate {
    public static void main(String[] args) {
        int []nums={1,2,2,3,3};
        int k=removeDuplicates(nums);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]+" ");
        }
    }
    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                nums[j+1] = nums[i];
                j++;

            }
        }
        return j+1;
    }
}



