package BinarySearch;
import java.util.*;
import java.util.Scanner;

//Ceiling = The Smallest number greater than or equal to the target.
public class ceilingOfNumber {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int arr[] = new int[7];
    System.out.println("Enter the elements in  the array: ");
    for(int i=0;i< arr.length;i++){
        arr[i]=s.nextInt();
    }
    System.out.println("Enter the target element: ");
    int target= s.nextInt();
    int ans = ceil(arr,target);
    System.out.println(ans);
    }
    static int ceil(int []arr, int target){
        int start=0;
        int end = arr.length-1;
        if(target>arr[arr.length-1]){
            System.out.println("The ceiling number doesn't exist. Hence, return:");
            return -1;
        }
        while(start<=end){
            int mid =(start+end)/2;
            if(arr[mid]<target){
                start = mid+1;
            }
            if(arr[mid]==target){
                System.out.println("the ceiling number is: "+arr[mid]);
                return mid;
            }
            if(arr[mid]>target){
                end = mid-1;
            }
        }
        System.out.println("the ceiling of number is: ");
        return arr[start] ;
    }
}
