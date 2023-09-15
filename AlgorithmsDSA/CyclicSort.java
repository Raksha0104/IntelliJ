package AlgorithmsDSA;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,1,4,2};
        System.out.println(Arrays.toString(sortCyclic(arr)));
    }

    static int[] sortCyclic(int[] arr){
        for(int i=0;i<arr.length;i++){
            int n = arr[i]-1;
            if(arr[i]!=arr[n]){
                int temp = arr[i];
                arr[i]=arr[n];
                arr[n]=temp;
            }
        }
        return arr;
    }
         //OR
//    static void swap(int[] arr,int first,int second){
//        int temp = arr[first];
//        arr[first]=arr[second];
//        arr[second]=temp;
//    }
}