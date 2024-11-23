import java.util.Scanner;

public class addnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter First Number: ");
        int a = input.nextInt();
        System.out.print("Please Enter Second Number: ");
        int b = input.nextInt();

//        int sum=a+b;

        System.out.print(a+b);

    }
}