package Function;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your digits: ");
        int num = input.nextInt();

       int reversenumber = reverse(num);

        System.out.println("your Reverse number is: "+ reversenumber);
    }
    public static int reverse(int num){

        int digit = 0;
        int sum=0;

        while(num!=0){
           digit = num%10;
           sum=sum*10+digit;
           num = num/10;

        }
        return sum;
    }
}
