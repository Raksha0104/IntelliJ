package Patterns;

public class diamond {
    public static void main(String[] args) {
        int n=4;
        patternDiamond(n);
    }

    public static void patternDiamond(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" "+" ");
            }
//            for(int j=i;j>=1;j--){
//                System.out.print("*"+" ");
//            }
//            for(int j=2;j<=i;j++){
//                System.out.print("*"+" ");
//            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" "+" ");
            }
//            for(int j=i;j>=1;j--){
//                System.out.print("*"+" ");
//            }
//            for(int j=2;j<=i;j++){
//                System.out.print("*"+" ");
//            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
