package Patterns;

public class pattern1 {
    public static void main(String[] args) {
        pattOne(5);
    }

    static void pattOne(int n){
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
