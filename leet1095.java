/* */

public class leet1095 {
    public static void main(String[] args) {
    int[] nums ={0,1,2,4,2,1};
    int target = 3;
    int []ans=searchRange(nums,target);
    System.out.println("The minimum index of target value is: "+ans[0]);
    }


//    static int peakIndexInMountainArray(int[] arr){
//        int start =0;
//        int end = arr.length-1;
//        int mid = (start+end)/2;
//        while(start<=end){
//            mid =(start+end)/2;
//            if(mid==0){
//                return mid;
//            }
//            if(arr[mid]<arr[mid-1]){
//                end = mid;
//            }else if(arr[mid]<arr[mid+1]){
//                start = mid+1;
//            }
//        }
//        return mid;
//    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start = binarySearch(nums,target,true);
        int end = binarySearch(nums,target,false);

        ans[0]=start;
        ans[1]=end;
        return ans;

    }
    static int binarySearch(int[] nums, int target, boolean StartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) { //ascending order
            int mid = (start + end) / 2;
            if (target<nums[mid]) {
                end = mid - 1;
            } else if (target>nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (StartIndex==true) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            if(start>end){
                return -1;
            }
        }
        return ans;
    }
}
// write code using object-oriented programming interface concept.