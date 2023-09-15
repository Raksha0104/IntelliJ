package ConditionsAndLoops;
import java.util.Scanner;

//Area of Circle : A = pi*(r*r);

public class AreaOfShapes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of r: ");
        double r = s.nextDouble();
        double A = 3.14 * r * r;
        System.out.println("The Area of Circle is: "+A);

        System.out.println("Enter the breadth of triangle: ");
        float b = s.nextFloat();
        System.out.println("Enter the height of triangle: ");
        float h = s.nextFloat();
        double AOT = 0.5*b*h;
        System.out.println("The Area of Triangle is: "+AOT);

        System.out.println("Enter the value of length: ");
        float l = s.nextFloat();
        double AOR = l*b;
        System.out.println("The area of Rectangle is: "+AOR);
    }
}