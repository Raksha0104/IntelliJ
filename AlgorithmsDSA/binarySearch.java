package AlgorithmsDSA;

import java.util.*;
import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int []arr = new int[5];
        System.out.println("Enter the number of elements in the array: ");
        int n = s.nextInt();
        System.out.println("Enter the array elements in sorted order: ");
        for(int i =0; i<n;i++){
            arr[i] =s.nextInt();
        }
        System.out.println("Enter the target element to be searched in array: ");
        int target = s.nextInt();
        int ans = search(arr,target);
        System.out.println(ans);

    }
    static int search(int []arr,int target){
        //Checking ascending and descending both cases.
        //This is known as order-agnostic binary search.
        int start=0;
        int  end = arr.length-1;
        int mid = (start+end)/2;
        if (arr[start]<=arr[end]){ // this will be an array of ascending order.
            while(start<=end){ // this will check the array for ascending order array.
                mid = (start+end)/2;
                if(target < arr[mid]){
                    end = mid-1;
                }
                else if(target>arr[mid]){
                    start = mid+1;
                }
                else{
                    return mid;
                }
            }                                                                                                                                                                                                                 while(start<=end){ // this will check the array for ascending order array.
                                                                                                                                                                                                                                mid = (start+end)/2;
                                                                                                                                                                                                                                if(target < arr[mid]){
                                                                                                                                                                                                                                    end = mid-1;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                else if(target>arr[mid]){
                                                                                                                                                                                                                                    start = mid+1;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                else{
                                                                                                                                                                                                                                    return mid;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
        }else { // this will be an array of descending order
            while(start<=end){ // this will check the array for descending order array.
                mid = (start+end)/2;
                if(target > arr[mid]){
                    end = mid-1;
                }else if(target < arr[mid]){
                    start = mid+1;
                }else {
                    return mid;
                }
            }
        }
        return -1;
    }
}