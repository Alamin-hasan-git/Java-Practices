package Function;

import java.util.Scanner;

public class pelindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int num = input.nextInt();

        boolean ispalindrome = isPalindrome(num);


        if(ispalindrome){
            System.out.println(num+" is pelindrome");
        }
        else System.out.println(num+" is not pelindrome");
    }

    public static boolean isPalindrome(int num){
        return num==Reverse(num);
    }

    public static int Reverse(int num){
        int reverse=0,rem;
        while(num!=0){
            rem=num%10;
            reverse=reverse*10+rem;
            num/=10;
        }
        return reverse;
    }
}
