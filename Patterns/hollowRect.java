package Patterns;

import java.util.Scanner;

public class hollowRect {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        hollowRectangle(m,n);
    }

    public static void hollowRectangle(int m,int n){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(i==1||j==1||i==m||j==n){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
