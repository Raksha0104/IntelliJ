package Patterns;

public class pattern3 {
    public static void main(String[] args) {
        pattThird(5);
    }

    static void pattThird(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
