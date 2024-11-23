import java.util.Scanner;

public class determine_Number_Pos_or_neg {
    public static void main(String[] args) {
        Scanner alamin = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = alamin.nextInt();

        if(n<0)
        {
            System.out.println("Number is Negative");
        }
        else if (n>0) {
            System.out.println("The Number is Positive.");
        }
        else System.out.println("it's Zero.");
    }
}
