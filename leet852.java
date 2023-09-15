import java.util.*;

public class leet852 {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8,0,1,2};
        System.out.println(peakIndexInMountainArray(arr));
    }

    //    static int peakIndexInMountainArray(int[] arr){
//        int max = arr[0];
//        int start = 0;
//        while(max<=arr[start]){
//            max=arr[start];
//            start++;
//        }
//        return start-1;
//    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;
        while (start < end) {
            mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}