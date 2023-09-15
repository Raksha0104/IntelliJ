import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class prakharArithmetic {
    int []arr={2,5,8,11,14,17};

    public static void main(String[] args) {
        int []arr={2,5,8,11,14,17};
        Random rand=new Random();
        int curr=0,prev=0,comp=0,a=0;
        while(curr<=17){
            System.out.println("Enter any number");
            Scanner s = new Scanner(System.in);
            curr=s.nextInt();

            if(curr==17){
                System.out.println("user won");
                break;
            }
            if(prev<curr && curr<=prev+2){
                comp=getcomp(arr,curr);
                System.out.println("computer input is "+comp);
            }else{
                System.out.println("Invalid number");
                break;
            }

            prev=comp;

            if(comp==17){
                System.out.println("computer won");
                break;
            }
        }

    }
    public static boolean binarysearch(int []arr,int target){
        int start=0;
        int  end = arr.length-1;
        int mid = (start+end)/2;
        while(start<=end){ // this will check the array for ascending order array.
            mid = (start+end)/2;
            if(target < arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                return true;
            }
        }
        return false;
    }
    public static int getcomp(int []arr,int curr){
        Random rand=new Random();
        if(binarysearch(arr,curr)){
            return rand.nextInt(curr + 1, curr + 2);
        }else{
            return arr[getindex(arr,curr)];
        }
    }
    public static int getindex(int []arr,int curr){
        int i=0;
        while(i<arr.length-1){
            if(arr[i]<curr){
                i++;
            }else {
                return i;
            }
        }
        return i;
    }
}
