package Function;

import java.util.Scanner;

public class return_noParameter {
    public static void main(String[] args) {

        int m=mul();

        System.out.println("Your ans is: "+ m);
    }
     public static int mul(){
        Scanner input = new Scanner(System.in);
         System.out.print("Enter First number: ");
         int x = input.nextInt();
         System.out.print("Enter Second number: ");
         int y= input.nextInt();

         int multiply= x*y;

         return multiply;

     }

}
