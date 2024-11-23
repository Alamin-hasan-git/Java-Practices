package Function;

import java.util.Scanner;

 class multiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number you want to see Multiplication Table:  ");
        int n = input.nextInt();

        printMultiplicationTable(n);
    }

    public static void printMultiplicationTable(int n){


        int i=1;
        while(i<=10){
            System.out.println(n + "x" + i +"=" + (n*i));
            i++;
        }

    }

}
