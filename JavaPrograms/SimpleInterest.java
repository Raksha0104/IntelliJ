package JavaPrograms;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float principal, time, rate, simpleInterest;
        System.out.println("Enter the principal: ");
        principal = s.nextFloat();
        System.out.println("Enter the time: ");
        time = s.nextFloat();
        System.out.println("Enter the rate: ");
        rate = s.nextFloat();

        simpleInterest = (principal*time*rate)/ 100 ;
        System.out.println("The Simple Interest is: "+simpleInterest);
    }
}
