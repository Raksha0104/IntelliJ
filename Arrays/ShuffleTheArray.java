package Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] ans = shuffle(nums,n);
        System.out.println(ans);
    }

    static int[] shuffle(int[] nums, int n){
        int[] ans = new int[nums.length];
        int i=0;
        while(i<n){
            ans[2*i] = nums[i];
            ans[(2*i)+1]=nums[i+n];
            i++;
        }
        return ans;
    }
}
