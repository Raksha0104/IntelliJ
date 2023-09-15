package JavaPrograms;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = s.nextInt();
        if((number%2)==0){
            System.out.println("The number is even.");
        }
        else{
            System.out.println("The number is odd.");
        }
    }
}
