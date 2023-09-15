package ConditionsAndLoops;
import java.util.Scanner;
import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to be reversed: ");
        int num = s.nextInt();
        int ReversedNumber = 0;
        while (num >0) {
            int rem = num % 10;
            num = num / 10;

            ReversedNumber = ReversedNumber *10 + rem;
        }
        System.out.println("The reversed number is: " +ReversedNumber);
    }
}


//Code
//class Solution {
//    public int reverse(int x) {
//        long finalNum = 0;
//        while(x!=0){
//            int lastDig = x%10;
//            finalNum += lastDig;
//            finalNum = finalNum*10;
//            x= x/10;
//        }
//        finalNum = finalNum/10;
//        if(finalNum > Integer.MAX_VALUE || finalNum<Integer.MIN_VALUE){
//            return 0;
//        }
//        if(x<0){
//            return (int)(-1*finalNum);
//        }
//        return (int)finalNum;
//    }
//}