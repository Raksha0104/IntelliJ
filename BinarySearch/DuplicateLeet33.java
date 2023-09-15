//package BinarySearch;
//
//public class DuplicateLeet33 {
//    public static void main(String[] args) {
//        int[] arr = { 2, 9, 2, 2, 2};
//        int target = 2;
//        int ans = search(arr,target);
//        System.out.println(ans);
//    }
//
//    static int search(int[] nums, int target) {
//        int maxValue = pivot(nums);
//        if(maxValue==-1){
//            return 0;
//        }
//        int ans1 = binarySearch(nums, target, 0, maxValue);
//        int ans2 = binarySearch(nums, target, maxValue + 1, nums.length - 1);
//        if (nums[ans1] == target) {
//            return ans1;
//        } else if (nums[ans2] == target) {
//            return ans2;
//        } else {
//            return -1;
//        }
//    }
//
//    static int pivot(int[] nums) {
//        int start = 0;
//        int end = nums.length - 1;
//        int mid = (start + end) / 2;
//        while (start <= end) {
//            mid = (start + end) / 2;
//            if(mid<end && nums[mid]>nums[mid+1])
//                return mid;
//            if(mid>start && nums[mid]<nums[mid-1])
//                return mid-1;
//            //if my elements at middle,start and end are equal then just skip the duplicates.
//            if(nums[mid]== nums[start] && nums[mid]== nums[end]){
//                //you can skip the duplicates, but first check if those start and end are pivots or not.
//                if(nums[start]>nums[start+1]){
//                    return start;
//                }
//                start++;
//                if(nums[end]<nums[end-1]){
//                    return end-1;
//                }
//                end--;
//            }
//            //left side is sorted, so pivot should be in right
//            else if (nums[start]<nums[mid] || (nums[start] ==nums[mid] && nums[mid]> nums[end])) {
//                start = mid+1;
//            }
//            else{
//                end = mid-1;
//            }
//        }
////        System.out.println(start);
//        return -1;
//    }
//
//    static int binarySearch(int[] nums, int target, int start, int end) {
//
//    }
//}
