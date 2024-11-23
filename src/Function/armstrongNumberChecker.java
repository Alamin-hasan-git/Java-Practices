package Function;

import java.util.Scanner;

public class armstrongNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3 digit number Number: ");
        int num = input.nextInt();

        int arms=armstrong(num);

        if(num==arms){
            System.out.println("number is armstrong");
        }
        else System.out.println("number is not armstrong");

    }
    public static int armstrong(int num){
        int sum=0,rem;

        while(num!=0){
            rem=num%10;
            sum=sum+(rem*rem*rem);
            num = num/10;
        }
        return sum;
    }
}
