package Arrays;

import java.util.Scanner;

public class sum_of_odd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number : ");
        int n1 = input.nextInt();

        int sum=0;
        int i=1;
        while(i<n1)
        {
             sum = sum+i;
            i+=2;
        }
        System.out.println(sum);
    }
}
