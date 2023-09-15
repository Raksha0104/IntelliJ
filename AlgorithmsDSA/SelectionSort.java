package AlgorithmsDSA;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[]  arr ={2,6,4,10,8};
        sortSelection(arr);
//        for(int i=0;i< arr.length;i++){
//            System.out.print(arr[i]+" ");
          System.out.println(Arrays.toString(arr)); //- Alternate way ro print the array.
//        }
    }

    static void sortSelection(int[] arr){
        for(int i = 0; i< arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = getMax(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    static void swap(int[] arr, int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int getMax(int[] arr,int start, int end){
        int max = start;
        for(int i=start;i<=end;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }

}
