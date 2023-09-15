package Arrays;

import java.util.Arrays;

public class RemoveDup {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int ans = removeDuplicates(nums);
        System.out.println(ans);
    }

    static int removeDuplicates(int[] nums){
        if(nums.length==0){
            return 0;
        }
        int index = 1;
        for(int i=0;i< nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                nums[index] = nums[i+1];
                index++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return index;
    }
}
