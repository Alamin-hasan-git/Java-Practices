package Function;

import java.util.Scanner;

public class sumOddnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number range you want to see sum:  ");
        int num = input.nextInt();
    int Sum = sumofoddnumbers(num);

        System.out.println("sum of odd is: "+ Sum);
    }

   public static int sumofoddnumbers(int num){
       int sum=0;
      int i = 1;
      while(i<=num){
           sum = sum+i;
           i+=2;
      }
       return sum;
   }
}
