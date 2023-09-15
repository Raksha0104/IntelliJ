import java.util.*;
import java.util.Scanner;

public class Solution7 {


    public static int reverse(int x) {
        int num =0;
        while(x!=0){
            int digit = x%10;
            num = (num+digit)*10;
            x = x/10;
        }
        num = num /10;
        if(num> Math.pow(-2,31)|| num< Math.pow(2,31-1) ){ // this is not how you write the condition.
            return 0;
        }
        if(x<0){
            return (int)(-1*num);
        }
        return (int)num;
    }

    public static void main(String[] args) {
//        int x[]= new int[]{1,2,3,4};
        System.out.println(Solution7.reverse(-123));;
    }
}
