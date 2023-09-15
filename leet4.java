import java.util.Arrays;

public class leet4 {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3};
        double ans = findMedianSortedArrays(nums1,nums2);
//        System.out.println(Arrays.toString(sortArray(nums1,nums2)));
        System.out.println(ans);
    }

    static double findMedianSortedArrays(int[] nums1, int[] nums2){
        int[] nums = new int[nums1.length+ nums2.length];
        int k =0;
        int i=0;
        int j=0;
        while(i< nums1.length && j< nums2.length){
            if(nums1[i]<nums2[j]){
                nums[k]=nums1[i];
                i++;
            }else{
                nums[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<nums1.length){
            nums[k]=nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length){
            nums[k]=nums2[j];
            j++;
            k++;
        }
        int n = nums1.length+ nums2.length;
        if(n%2==0){
            return (float)(nums[(n/2)-1]+nums[n/2])/2;
        }else{
            return nums[n/2];
        }
    }
}
//class Solution {
//    public int maxVowels(String s, int k) {
//        List<Character> v = Arrays.asList('a', 'e', 'i', 'o', 'u');
//        Set<Character> vowels = new HashSet<Character>(v);
//
//        int vcount =0;
//        for(int i=0 ;i<k; i++){
//            if(vowels.contains(s.charAt(i))) vcount++;
//        }
//
//        int max = vcount;
//        int left =0;
//        int right = k-1;
//        while(right<s.length()-1){
//            if(vowels.contains(s.charAt(left))) vcount--;
//            left++;
//            right++;
//            if(vowels.contains(s.charAt(right))) vcount++;
//            max = Math.max(max, vcount);
//        }
//
//        return max;
//    }
//}