package JavaPrograms;

import java.util.Scanner;
public class Five {
    public static void main(String[] args) {
        String input = "0";
        int sum = 0 ;
        Scanner s = new Scanner(System.in);
        System.out.println("Start entering values: ");
        try{
            while(true){
                input = s.next();
                sum = sum + Integer.parseInt(input);
            }
        }catch(Exception e){
            if(input.equals("x")){
                System.out.println("the sum of all inputs is: "+sum);
            }
            else {
                System.out.println("Invalid!");
            }
        }
    }
}
