package BinarySearch;
import java.util.*;
import java.util.Scanner;

//Floor = The Greatest number smaller or equal to the target.
public class floorOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = new int[7];
        System.out.println("Enter the elements in  the array: ");
        for(int i=0;i< arr.length;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the target element: ");
        int target= s.nextInt();
        int ans = floor(arr,target);
        System.out.println(ans);
    }
    static int floor(int []arr, int target){
        int start=0;
        int end = arr.length-1;
        if(target<arr[0]){
            System.out.println("There is no floor value. Hence return:");
            return -1;
        }
        while(start<=end){
            int mid =(start+end)/2;
            if(arr[mid]<target){
                start = mid+1;
            }
            if(arr[mid]==target){
                System.out.println("the floor of number is: "+arr[mid]);
                return mid;
            }
            if(arr[mid]>target){
                end = mid-1;
            }
        }
        System.out.println("the floor of number is: ");
        return arr[end] ;
    }
}
