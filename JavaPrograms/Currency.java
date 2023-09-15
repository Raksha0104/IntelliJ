package JavaPrograms;
import java.util.Scanner;
// 1 INR = 0.012152 USD
public class Currency {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the amount in INR: ");
        int INR = s.nextInt();
        double USD = INR * 0.012152;
        System.out.println("The amount in USD: "+USD);
    }
}
