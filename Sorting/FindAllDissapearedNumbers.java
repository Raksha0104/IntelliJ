package Sorting;

import java.util.ArrayList;
import java.util.List;

public class FindAllDissapearedNumbers {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List ans = findDisappearedNumbers(nums);
        System.out.println(ans);
    }

    static List<Integer> findDisappearedNumbers(int[] nums){
        int i =0;
        while(i<nums.length){
            int n = nums[i]-1;
            if(nums[i]!=nums[n]){
                int temp = nums[i];
                nums[i] = nums[n];
                nums[n]=temp;
            }else {
                i++;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(i=0;i<nums.length;i++) {
            if (nums[i] != i+1) {
                list.add(nums[i]);
            }
        }
        return list;
    }
}
