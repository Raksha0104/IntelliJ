package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(5));
    }

    static int fibo(int n){
        if(n<2){   //base condition we know f(0)=0;
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
