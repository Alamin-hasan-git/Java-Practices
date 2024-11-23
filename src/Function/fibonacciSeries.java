package Function;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Welcome to Fibonacci Series");

        System.out.print("Enter Number: ");
        int num = input.nextInt();

       fibonacci(num);
    }
    public static int fibonacci(int num){

        if(num<0) return 0;
        if(num==0) return 1;
        int first=0,second=1;

        while(first+second<=num){
            int third=first+second;
            System.out.print(third +" ");
            first = second;
            second = third;
        }
        return 0;
    }
}
