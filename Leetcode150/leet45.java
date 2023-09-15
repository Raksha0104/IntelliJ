package Leetcode150;

public class leet45 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        int ans = jump(nums);
        System.out.println(ans);
    }

    public static int jump(int[] nums){
        int jumps = 0, End = 0, currFarthest = 0;
        for(int i = 0; i < nums.length - 1; i ++) {
            currFarthest = Math.max(currFarthest, i + nums[i]);
            if(i == End) {
                End = currFarthest;
                jumps ++;
            }
        }
        return jumps;
    }
}
