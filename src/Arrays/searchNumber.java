package Arrays;

import java.util.Scanner;

public class searchNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        int n = input.nextInt();

        int[] numArray = new int[n];

        int i=0;
        while(i<numArray.length){
            System.out.print("Index "+i+": ");
            numArray[i] = input.nextInt();
            i++;
        }
        System.out.print("Enter the number you want to search: ");
        int num = input.nextInt();

        int Count = numCount(numArray,num);

        System.out.println("Value found "+Count+" times in this array.");
    }

    public static int numCount(int[] numArray , int num){

        int count =0;
        int i=0;
        while(i< numArray.length){

            if(numArray[i]==num){
                count++;
            }
            i++;
        }
        return count;
    }
}
