package Arrays;

public class buildArray {
    public static void main(String[] args) {
        int[] nums= {0,2,1,5,3,4};
        int[] a = bArray(nums);
        System.out.println(a);
    }

    static int[] bArray(int[] nums) {
        int []ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
