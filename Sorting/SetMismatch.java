package Sorting;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        int[] ans = findErrorNums(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] findErrorNums(int[] nums){
        int[] ans = new int[2];
        int i =0;
        while(i<nums.length){
            int n = nums[i]-1;
            if(nums[i]!=nums[n]){
                int temp = nums[i];
                nums[i] = nums[n];
                nums[n]=temp;
            }else {
                i++;
            }
        }
        for(i=0;i<nums.length;i++) {
            if (nums[i] != i+1) {
               ans[0] = nums[i];
               ans[1] = i+1;
            }
        }
        return ans;
    }
}
