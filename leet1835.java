import java.util.ArrayList;
import java.util.List;

public class leet1835 {
    public static void main(String[] args) {
        int[] arr1 = {12};
        int[] arr2 = {4};
        int ans = getXORSum(arr1,arr2);
        System.out.println(ans);
    }

    static int getXORSum(int[] arr1, int[] arr2){
        int xor_arr1 = 0;
        int xor_arr2 = 0;

        for(int i=0;i<arr1.length;i++){
            xor_arr1 = xor_arr1 ^ arr1[i];
        }

        for(int i=0;i<arr2.length;i++){
            xor_arr2 = xor_arr2 ^ arr2[i];
        }
        return (xor_arr1 & xor_arr2);
    }
}
