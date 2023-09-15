package Patterns;

import java.util.Scanner;

public class halfPy {
    public static void main(String[] args) {
        int m=5;
        halfPyramid(m);
        halfPyNum(m);
    }

    public static void halfPyramid(int m){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void halfPyNum(int m){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
