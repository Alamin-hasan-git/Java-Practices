import java.util.Scanner;

public class swapNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Value of A: ");
        int a = input.nextInt();
        System.out.print("Enter the Value of B: ");
        int b = input.nextInt();

        int temp = a;
         a =  b;
         b=temp;

        System.out.println("After Swaping-----");
        System.out.println("Value of A is: "+ a);
        System.out.println("Value of B is: "+ b);


    }
}
