package Patterns;

public class FloydTri {
    public static void main(String[] args) {
        int m = 5;
        floydsTriangle(m);
    }

    public static void floydsTriangle(int m){
        int num=1;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
