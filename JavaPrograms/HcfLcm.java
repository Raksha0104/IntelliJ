package JavaPrograms;

import java.util.Scanner;
public class HcfLcm {
    public static void main(String[] args) {
        int hcf,lcm,x,y,temp;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = s.nextInt();
        System.out.println("Enter the second number: ");
        int b = s.nextInt();

        x = a;
        y = b; // pass number to temp variables

        while(y!=0){
            temp = y;
            y = x % y;
            x = temp;
        }
        hcf = x;
        lcm = (a*b)/hcf;

        System.out.println("Hcf is: " +hcf);
        System.out.println("Lcm is: "+lcm);
    }
}
