package Function;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();
        long fact=factorial(num);

        System.out.println("Your result is: "+ fact);
    }

    public static Long factorial(int num){

        if(num<2){
            return 1l;
        }
        long fact = 1;
        int i=2;
        while(i<=num){
            fact*=i;
            i++;
        }
        return fact;
    }
}
