package Leetcode150;

import java.util.Arrays;

public class leet151 {
    public static void main(String[] args) {
        String s ="   the sky is blue";
        System.out.println(Arrays.toString(reverseWords(s)));
    }

    public static String[] reverseWords(String s){
        String[] str = s.trim().split(("\s+"));
        return str;
    }
}
