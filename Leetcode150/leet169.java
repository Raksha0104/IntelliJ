package Leetcode150;

import java.util.Arrays;

public class leet169 {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        int k = majorityElement(nums);
        System.out.println(k);
    }
    public static  int majorityElement(int[] nums){
        Arrays.sort(nums);
        int n  = nums.length;
        return nums[n/2];
    }
}
