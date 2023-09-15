package JavaPrograms;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=0;
        int b=1;
        int c = 0 , n , d = 0;
        System.out.println("Enter the value of n: ");
        n = s.nextInt();
        System.out.print(a+" "+ b + " ");
        for(int i=2;i<=n;i++){
            c = a + b ;
            System.out.println(c +" ");
            a = b;
            b = c;
            d = d + c;
        }
        System.out.println("The sum of fibonacci sequence is: ");
        System.out.println(d);
    }
}