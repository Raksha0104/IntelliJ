package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,55,66,78};
        int target = 0;
        System.out.println(search(arr,target,0, arr.length-1));
    }

    static int search(int[] arr, int target, int start,int end){
//        start=0;
//        end =arr.length-1; if you do this then you won't be able to change the start and end during recursive calls.
        //hence, pass the start and end in the arguments.

        //if there are variables that you need to pass in the future function recursive calls, put them inside the argument.

        if(start>end){
            return -1;
        }
        int mid = (start+end)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(target<arr[mid]) {
            return search(arr, target, start, mid - 1);
        }
            return search(arr,target,mid+1,end);
    }
}
