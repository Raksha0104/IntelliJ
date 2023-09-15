package Patterns;

import java.util.Scanner;

public class InvHalfPy {
    public static void main(String[] args) {
        int m=5;
        invertedHalfPyramid(m);
        invHalfPy180(m);
        System.out.println();
        invHalfPyNum(m);
    }

    public static void invertedHalfPyramid(int m){
        for(int i=1;i<=m;i++){
            for(int j=m;j>=i;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void invHalfPy180(int m) {
        for (int i = 1;i<=m;i++) {
            for (int j = 1;j<=m-i;j++) {
                System.out.print(" "+" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void invHalfPyNum(int m){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
