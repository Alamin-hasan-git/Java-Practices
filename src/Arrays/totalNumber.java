package Arrays;

import java.util.Scanner;

public class totalNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Array Size: ");
        int n = input.nextInt();

        int[] numArray = new int[n];

        int i = 0;
        while (i<n){
            System.out.print("Index "+i+": ");
            numArray[i] = input.nextInt();
            i++;
        }
        int count =0;

       int oddNumber = countOdd(numArray);
       int evenNUmber = counteven(numArray);

        System.out.println("Even Number: "+evenNUmber);
        System.out.println("Odd Number: "+oddNumber);
    }

    public static int countOdd(int[] numArray){
        int i =0;
        int count = 0;
        while(i<numArray.length) {
            if (numArray[i] % 2 != 0) {
                 count++;
            }
            i++;
        }
        return count;
    }
    public static int counteven(int[] numArray){
        int i =0;
       int count =0;
        while(i<numArray.length) {
            if (numArray[i] % 2 == 0) {
                count++;
            }
            i++;
        }
        return count;
    }
}
