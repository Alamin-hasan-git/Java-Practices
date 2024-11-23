package Function;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Number: ");
        int num = input.nextInt();

        boolean isprime = isPrime(num);
        if(isprime)
            System.out.println("your number is prime");
        else
            System.out.println("Your number is not prime");


    }
    public static boolean isPrime(int num){

        int i = 2;

        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
