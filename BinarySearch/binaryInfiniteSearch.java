package BinarySearch;

public class binaryInfiniteSearch {
    public static void main(String[] args) {
        int []arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(arr,target));
    }

    static int ans(int []arr, int target){
        //first find the range
        //first start with a box of size 2
        int start =0;
        int end =1;
        //condition for the target to lie in the range
        while(target>arr[end]){
            //double the size
            int newStart = end+1;
            //double the box value
            //end = previous end + sizeOfBox*2;
            end = end+(end-start+1)*2;
            start = newStart;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int []arr,int target, int start, int end) {
        // Order-Agnostic Binary Search:
        while (start <= end) { //ascending order
            if (start < end) {
                int mid = (start + end) / 2;
                if (arr[mid] < target) {
                    start = mid + 1;
                }
                if (arr[mid] == target) {
                    System.out.println("The element is found at index " + mid);
                    return mid;
                }
                if (arr[mid] > target) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
