import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
//        int i =0;
        int [] nums = {2,7,11,15};
//        for (i =0; i<nums.length; i++){
//            System.out.println(nums[i]);
//        }
        int []ans = twoSum(nums,9);
        System.out.println(ans);
    }
    static int[] twoSum(int[] nums, int target){
        for(int i=0; i<nums.length;i++){
            for (int j =i+1; j<nums.length;j++){
                if(nums[j] == target -nums[i]){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
