package JavaPrograms;

import java.util.Scanner;
public class Leap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = s.nextInt();
        if((year % 4)==0){
            System.out.println("It is a leap year");
        }
        else {
            System.out.println("It is not a leap year");
        }
    }
}
