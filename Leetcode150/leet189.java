package Leetcode150;

import java.util.Arrays;

public class leet189 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int k = 1;
        rotate(nums,k);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums,int k){
        int count;
        if(nums.length%2==0 && k>0){
            count = 0;
        }else{
            count = -1;
        }
        while(count!=k && k>0){
            count++;
            for(int i=0;i<nums.length-1;i++){
                int temp = nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
            }
        }
    }
}
