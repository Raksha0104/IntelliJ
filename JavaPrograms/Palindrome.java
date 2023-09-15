package JavaPrograms;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string to check Palindrome: ");
        String b = s.next();
        String c = "  ";
        for(int i = b.length()-1 ; i < 0 ; i--){
            c = c + b.charAt(i);
        }
        if(b.equals(c)){
            System.out.println("It is a palindrome!");
        }
        else{
            System.out.println("It is not a palindrome!");
        }
    }
}
