package Patterns;

public class pattern5 {
    public static void main(String[] args) {
        pattFive(5);
        pattFive1(4);
    }
    static void pattFive(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void pattFive1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
