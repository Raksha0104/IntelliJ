package Arrays;//1ms 94.97%beats.
public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] ans = getConcatenation(nums);
        System.out.println(ans);
    }

    static int[] getConcatenation(int[] nums){
        int n = nums.length;
        int[] ans = new int[2*n];
        int i;
        for(i=0;i<n;i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}

