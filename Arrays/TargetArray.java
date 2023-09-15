package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] ans = createTargetArray(nums,index);
//        for(int i = 0;i<nums.length;i++){
            System.out.print(Arrays.toString(ans));
//        }
    }

    static int[] createTargetArray(int[] nums,int[] index){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        int[] target = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr.add(index[i],nums[i]);
            }
        for (int i = 0; i < arr.size(); i++) {
            target[i]= arr.get(i);
        }
        return target;
    }
}

//class Solution {
//    public int[] createTargetArray(int[] nums, int[] index) {
//        int[] target = new int[nums.length];
//
//        for(int i = 0; i < index.length; i++){
//            int ind = index[i];
//
//            if(ind < i){
//                int j = i;
//                while(j > ind){
//                    target[j] = target[j - 1];
//                    target[j - 1] = nums[i];
//                    j--;
//                }
//            }
//            else{
//                target[i] = nums[ind];
//            }
//
//        }
//        return target;
//    }
//}