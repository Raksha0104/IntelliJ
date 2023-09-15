package JavaPrograms;
import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = s.next();
        System.out.println("Good Morning "+name+"!");
    }
}
