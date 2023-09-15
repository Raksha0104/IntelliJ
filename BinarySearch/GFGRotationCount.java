// This code is not that correct for condition-int[] arr = {13,16,18,19,1,12};

package BinarySearch;

public class GFGRotationCount {
    public static void main(String[] args) {
        int[] arr = { 12, 15, 2, 3, 5 };
        int ans = count(arr);
        System.out.println("The array is rotated " + ans + " number of times.");
    }

    static int count(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start+end)/2;
        if (arr[start] <= arr[end]) {
            return 0;
        }
        while (start <= end) {
            mid = (start + end) / 2;
            if (start == mid) {
                if (arr[mid] > arr[mid + 1]) {
                    return start + 1;
                } else {
                    return end + 1;
                }
            }
            if (arr[start] > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid;
            }
        }
        return mid + 1;
    }
}
