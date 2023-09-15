public class leet724 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 7, 3, 6, 5, 6};
        int ans = pivotIndex(nums);
        System.out.println(ans);
    }
    static int pivotIndex(int[] nums){
        int sumTotal = 0;
        int leftSum =0;
        for(int i=0;i<nums.length;i++){
            sumTotal = sumTotal + i;
        }
        for(int i=0;i<nums.length;i++){
            int rightSum = sumTotal - nums[i] - leftSum;
            if(rightSum == leftSum){
                return i;
            }
            leftSum+=nums[i];
        }
        return -1;
    }
}
