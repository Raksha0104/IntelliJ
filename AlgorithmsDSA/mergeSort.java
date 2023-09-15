package AlgorithmsDSA;

import java.lang.reflect.Array;
import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        int[] ans = sortMerge(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] sortMerge(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = sortMerge(Arrays.copyOfRange(arr,0,mid));
        int[] right = sortMerge(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    static int[] merge(int[] first,int[] second){
        int[] mix = new int[first.length+second.length];

        int i=0,j=0,k=0;
        while(i< first.length && j< second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
            //if one of the cases is not complete
            while(i< first.length){
                mix[k]=first[i];
                i++;
                k++;
            }
            while(j<second.length){
                mix[k]=second[j];
                j++;
                k++;
            }
            return mix;
    }
}
