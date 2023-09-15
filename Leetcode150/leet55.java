package Leetcode150;

public class leet55 {
    public static void main(String[] args) {
        int[] nums = {0,1};
        boolean ans = canJump(nums);
        System.out.println(ans);
    }

//    class Solution {
//        public boolean canJump(int[] nums) {
//            int boundary = 0;
//            for(int i =0;i<=boundary;i++) {
//                boundary = Math.max(boundary,i+nums[i]);
//                if(boundary >=nums.length-1)
//                    return true;
//            }
//            return false;
//        }
//    }

    public static boolean canJump(int[] nums) {
//        if(nums[0]==0 && nums.length>1){
//            return false;
//        }
        if (nums.length == 0) {
            return false;
        }
//        if (nums.length == 1) {
//            return true;
//        }
            int i=0;
            int jn = 0;
            while(i!=nums.length-1){
                    jn = nums[i];
                    i = i + jn;
                    if(nums[i]==0 && i< nums.length-1){
                        return false;
                    }
                }
            if(i!= nums.length-1){
                return false;
            }
            return true;
    }
}
