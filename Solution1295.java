import java.util.*;
import java.util.Scanner;

public class Solution1295 {
    public static void main(String[] args) {
    int nums[] = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int []nums){
        int count =0;
        for(int num : nums){
            if(evenDigits(num)){
                count++;
            }
        }
        return count;
    }

    static boolean evenDigits( int num){
        int numberOfDigits = digits(num);
        if(numberOfDigits % 2 ==0){
            return true;
        }
        return false;
    }
    static int digits2(int num){
        if(num<0){
            num = num *-1;
        }
        return (int) (Math.log10(num))+1;
    }
    static int digits(int num){
        int count=0;
        while (num>0){
            count++;
            num = num /10;
        }
        return count;
    }
 }
