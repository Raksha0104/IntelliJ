package Patterns;

public class pattern4 {
    public static void main(String[] args) {
        pattFour(5);
    }

    static void pattFour(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
