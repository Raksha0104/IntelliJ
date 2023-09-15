package Sorting;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        System.out.println(missingNumber(nums));
    }

    static int missingNumber(int[] nums){
        int i=0;
        while(i<nums.length){
            int n = nums[i];
            if(nums[i]<nums.length&&nums[i]!=nums[n]){
                int temp = nums[i];
                nums[i]=nums[n];
                nums[n]=temp;
            }else{
                i++;
            }
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }
}
