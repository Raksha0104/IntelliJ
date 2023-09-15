package JavaPrograms;
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = s.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = s.nextInt();

        if(num1>num2){
            System.out.println("The largest number is: "+num1);
        }
        else{
            System.out.println("The largest number is: "+num2);
        }
    }
}
