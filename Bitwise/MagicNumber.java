package Bitwise;

public class MagicNumber {
    public static void main(String[] args) {
        int n = 2;
        int ans = 0;
        int base = 6;

        while(n>0){
            int last = n & 1;
            n=n>>1;
            ans = ans + last*base;
            base = base*6;
        }
        System.out.println(ans);
    }
}
