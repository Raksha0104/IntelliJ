package Arrays;//0ms 100% beats
import java.util.Arrays;
public class RunningSumOf1dArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = runningSum(nums);
        System.out.println(ans);
    }

    static int[] runningSum(int[] nums){
        int n = nums.length;
        int sum=0;
        int[] runSum = new int[n];

        for (int i = 0; i < n; i++) {
            runSum[i] = sum+nums[i];
            sum = runSum[i];
        }
        return runSum;
    }
}
