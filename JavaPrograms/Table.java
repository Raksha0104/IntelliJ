package JavaPrograms;

import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = s.nextInt();
        for(int i =1;i<11;i++){
            int res = num * i;
            System.out.println(num+"*"+i+"="+res);
        }

    }
}
