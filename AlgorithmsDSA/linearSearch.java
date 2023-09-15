package AlgorithmsDSA;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[20];
        System.out.println("Enter the number of elements in the array: ");
        int n = s.nextInt();
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the number you want to search: ");
        int num = s.nextInt();
        int ans = search(arr,num);
        System.out.println("the number "+num+ " is found at index "+ans);
    }
    static int search(int []arr, int num){
        for(int i = 0; i<arr.length-1;i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }
}

