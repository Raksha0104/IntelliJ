package JavaPrograms;
import java.util.Scanner;
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        int res = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = s.nextInt();
        System.out.println("Enter the opeartor");
        char op = s.next().charAt(0);
        System.out.println("Enter the second number: ");
        int num2 = s.nextInt();
        if(op=='+'){
            res = num1 + num2;
        }
        else if(op=='-'){
            res = num1 - num2;
        }
        else if(op=='*'){
            res = num1 * num2;
        }
        else if(op=='/'){
            res = num1 / num2;
        }
        System.out.println("The result of these two numbers is: "+res);
    }
}
