package Patterns;

import java.util.Scanner;

public class solidRectangl {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter value of col");
        int col = s.nextInt();
        System.out.println("Enter value of row");
        int row = s.nextInt();
        solidRectangle(row,col);
    }

    public static void solidRectangle(int m,int n){
        for(int i = 0; i < m; i++) {
            for(int j = 0; j <= n; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
