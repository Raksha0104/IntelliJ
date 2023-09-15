public class leet33 {
    public static void main(String[] args) {
        int nums[] = {12, 13, 1, 2, 3, 4, 5, 6};
        int target = 1;
        int ans = search(nums,target);
        System.out.println(ans);
    }

    static int search(int[] nums, int target) {
        int maxValue = pivot(nums);
        int ans1 = search(nums, target, 0, maxValue);
        int ans2 = search(nums, target, maxValue + 1, nums.length - 1);
        if (nums[ans1] == target) {
            return ans1;
        } else if (nums[ans2] == target) {
            return ans2;
        } else {
            return -1;
        }
    }

    static int pivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            mid = (start + end) / 2;
            if (nums.length == 1) {
                return mid;
            }
            if (start == mid) {
                if (nums[mid] < nums[mid + 1]) {
                    start = mid + 1;
                } else {
                    break;
                }
            }
            if (nums[mid] > nums[start]) {
                start = mid;
            } else {
                end = mid;
            }
        }
        return start;
    }

    static int search(int[] nums, int target, int start, int end) {
        int mid = (start + end) / 2;
        while (start <= end) {
            mid = (start + end) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return 0;
    }
}

//    static int search(int[] nums, int target) {
//        int maxValue = pivot(nums);
//        int ans1 = search(nums,target,0,maxValue);
//        int ans2 = search(nums,target,maxValue+1,nums.length-1);
//        if(nums[ans1]==target){
//            return ans1;
//        }else if(nums[ans2]==target){
//            return ans2;
//        }else {
//            return -1;
//        }
//    }
//
//    static int pivot(int[] nums){
//        int start = 0;
//        int end = nums.length-1;
//        int mid = (start+end)/2;
//        while(start<=end){
//            mid = (start+end)/2;
//            if(nums.length==1){
//                return mid;
//            }
//            if(start == mid){
//                if(nums[mid]<nums[mid+1]) {
//                    start = mid + 1;
//                }else {
//                    break;
//                }
//            }
//            if (nums[mid] > nums[start]) {
//                start = mid;
//            } else {
//                end = mid ;
//            }
//        }
//        return start;
//    }
//
//    static int search(int []nums,int target,int start,int end){
//        int mid = (start+end)/2;
//        while(start<=end){
//            mid = (start+end)/2;
//            if(target < nums[mid]){
//                end = mid-1;
//            }
//            else if(target>nums[mid]){
//                start = mid+1;
//            } else {
//                return mid;
//            }
//        }
//        return 0;
//    }
