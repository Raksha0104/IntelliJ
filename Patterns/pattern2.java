package Patterns;

import java.util.Arrays;

public class pattern2 {
    public static void main(String[] args) {
        pattTwo(5);
    }
    //i:row,j:column
    static void pattTwo(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
