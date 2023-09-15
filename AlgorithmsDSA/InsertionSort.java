package AlgorithmsDSA;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,6,9,5,1,7,2,0,3,8};
        sortInsertion(arr);
        System.out.println(Arrays.toString(arr));

    }
     static int[] sortInsertion(int[] arr){
        int temp=0;
        int n = arr.length;
        for(int i=0;i<=n-2;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else{
                    break;
                }
            }
        }
        return arr;
     }
}
